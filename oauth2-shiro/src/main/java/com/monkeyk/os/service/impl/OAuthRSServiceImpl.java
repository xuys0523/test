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
package com.monkeyk.os.service.impl;

import com.monkeyk.os.domain.oauth.AccessToken;
import com.monkeyk.os.domain.oauth.ClientDetails;
import com.monkeyk.os.domain.oauth.OauthRepository;
import com.monkeyk.os.service.OAuthRSService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2015/7/8
 *
 * @author Shengzhao Li
 */
@Service("oAuthRSService")
public class OAuthRSServiceImpl implements OAuthRSService {


    private static final Logger LOG = LoggerFactory.getLogger(OAuthRSServiceImpl.class);


    @Autowired
    private OauthRepository oauthRepository;


    @Override
    public AccessToken loadAccessTokenByTokenId(String tokenId) {
        return oauthRepository.findAccessTokenByTokenId(tokenId);
    }

    @Override
    public ClientDetails loadClientDetails(String clientId, String resourceIds) {
        LOG.debug("Load ClientDetails by clientId: {}, resourceIds: {}", clientId, resourceIds);
        return oauthRepository.findClientDetailsByClientIdAndResourceIds(clientId, resourceIds);
    }
}
