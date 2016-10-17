/*
 * Copyright (c) 2013 Andaily Information Technology Co. Ltd
 * www.andaily.com
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Andaily Information Technology Co. Ltd ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with Andaily Information Technology Co. Ltd.
 */
package com.monkeyk.os.domain.oauth;

import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * 15-6-20
 *
 * @author Shengzhao Li
 */
public class DefaultAuthenticationIdGenerator implements AuthenticationIdGenerator {


    public DefaultAuthenticationIdGenerator() {
    }


    public String generate(String clientId, String username, String scope) {
        Map<String, String> map = new HashMap<>();
        map.put(OAuth.OAUTH_CLIENT_ID, clientId);
        //check it is client only
        if (!clientId.equals(username)) {
            map.put(OAuth.OAUTH_USERNAME, username);
        }
        if (!OAuthUtils.isEmpty(scope)) {
            map.put(OAuth.OAUTH_SCOPE, scope);
        }

        return digest(map);
    }


    protected String digest(Map<String, String> map) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("MD5 algorithm not available.  Fatal (should be in the JDK).");
        }

        try {
            byte[] bytes = digest.digest(map.toString().getBytes("UTF-8"));
            return String.format("%032x", new BigInteger(1, bytes));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 encoding not available.  Fatal (should be in the JDK).");
        }
    }

}
