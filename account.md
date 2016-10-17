http://139.196.195.149/dskab/main.htm

http://exmail.qq.com/login
xuyongsheng@zhuniuhui.com
Xys3

2853028408
1416831616

svn://192.168.2.252/ProjectDoc/2.0版
svn://192.168.2.252/java
svn://192.168.2.252/source_code
xuyongsheng
hys*1d

筑牛后台
账户 niusystem
密码 zhuniu@168

show databases;
show tables;

show variables like '%quer%';
show variables like "%slow%";

set global log_slow_queries = ON;
set global slow_query_log = ON;
set global long_query_time=0.1;


http://139.196.195.149/dskab/main.htm
admin
123456

detecting hav for docker installation
c:\havtool\havdetectiontool.exe /x

codenvy


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
yum -install net-tools

tar zxvf jdk-8u91-linux-x64.tar.gz

gunzip apache-tomcat-8.0.35.tar.gz
tar xvf apache-tomcat-8.0.35.tar
mv apache-tomcat-8.0.35 apache-tomcat

cd /apache-tomcat/bin/
chmod 777 *.sh                           
bash catalina.sh start 

vi /etc/profile
export JAVA_HOME=/usr/java/jdk1.8.0_91/
export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH
export CLASSPATH=.:/usr/java/jdk1.8.0_91/lib:/usr/java/jdk1.8.0_91/jre/lib:$CLASSPATH


增加8080端口到防火墙配置中，执行以下操作：
firewall-cmd  --permanent --zone=public --add-service=http
firewall-cmd  --permanent --zone=public --add-port=8080/tcp
firewall-cmd  --reload
firewall-cmd --list-all

关闭防火墙
systemctl stop firewalld.service #停止
systemctl disable firewalld.service #禁用


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
yum install docker
systemctl start docker.service
systemctl enable docker.service

docker search tomcat

docker run -it --rm tomcat:8.0
docker run -it --rm -p 8888:8080 tomcat:8.0

touche Dockerfile
file content as below:
FROM tomcat:8.0-jre8
MAINTAINER "xuyongsheng"

docker build -t ns/tomcat .
docker run -i -t ns/tomcat /bin/bash 


docker search tomcat



docker pull centos:latest                      #从docker.io中下载centos镜像到本地 /var/lib/docker/graph
docker images                                  #查看已下载的镜像
docker run -i -t centos /bin/bash              #启动一个容器
#docker imr image_id                            #删除镜像
#docker rmi $(docker images | grep none | awk '{print $3}' | sort -r)  #删除所有镜像
docker ps -a                                  #查看所有容器(包括正在运行和已停止的)
docker start container                        #开启一个容器（注意container_id和image_id是完全不一样de）
docker logs <容器名orID> 2>&1 | grep '^User: ' | tail -n1 #查看容器的root用户密码,因为docker容器启动时的root用户的密码是随机分配的。所以，通过这种方式就可以得到redmine容器的root用户的密码了
docker logs -f <容器名orID>                    #查看容器日志
docker rm $(docker ps -a -q)                    #删除所有容&删除单个容器docker rm <容器名orID>
docker run --name redmine -p 9003:80 -p 9023:22 -d -v /var/redmine/files:/redmine/files -v    /var/redmine/mysql:/var/lib/mysql sameersbn/redmine

#运行一个新容器，同时为它命名、端口映射、文件夹映射。以redmine镜像为例
docker run -i -t --name sonar -d -link mmysql:db  tpires/sonar-server

# 一个容器连接到另一个容器&sonar容器连接到mmysql容器，并将mmysql容器重命名为db。这样，sonar容器就可以使用db的相关的环境变量了。
#当需要把一台机器上的镜像迁移到另一台机器的时候，需要保存镜像与加载镜像。
机器a
docker save busybox-1 > /home/save.tar

使用scp将save.tar拷到机器b上，然后：
docker load < /home/save.tar
docker build -t <镜像名> <Dockerfile路径>        #构建自己的镜像

D:\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps


DOCKER_HOST，DOCKER_TLS_VERIFY 和 DOCKER_CERT_PATH

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
docker-machine create --driver virtualbox test001
docker-machine env test001

cmd
docker-machine ssh test001

 docker run -it --rm tomcat:8.0
 docker run -it --rm -p 8888:8080 tomcat:8.0

docker-mashie stop machine-name
docker-mashie rm machine-name


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
host 192.168.2.247
mysql 5.5
ssh  root  zgr@123

mysql root jackxhy


svn://192.168.2.252:3690/yuncaigou
svn://192.168.2.252/yuncaigou/
root
qa*lc4


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
需要检查版本的日期, 这就相当于检查从 2015-05-06(上次封版日期) 开始到目前(此次发版日期)所有的文件改动
    svn diff -r {2016-05-18} --summarize https://MS-20160423PPWG/svn/yuncai/source_code/front-end/dest > changedfiles.txt
或者日期区间
    svn diff -r {2016-05-18}:{2016-05-20} --summarize https://MS-20160423PPWG/svn/yuncai/source_code/front-end/dest > changedfiles.txt


想检查从 724版本 开始到目前所有改动文件的列表
    svn diff -r 56:HEAD --summarize https://MS-20160423PPWG/svn/yuncai/source_code/front-end/dest > changedfiles.txt
可以简写成这样
    svn diff -r 56 --summarize https://MS-20160423PPWG/svn/yuncai/source_code/front-end/dest > changedfiles.txt


keytool -genkey -alias yuncai -keyalg RSA -keystore d:/keys/yuncaikey

D:\keys>keytool -export -file d:/keys/yuncai.crt -alias yuncai -keystore d:/keys/yuncaikey

server.xml
    <Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
               maxThreads="150" SSLEnabled="true" scheme="https" secure="true"
               clientAuth="false" sslProtocol="TLS"
			   keystoreFile="D:/keys/yuncaikey" keystorePass="yuncai" />

管理员身份运行
keytool -import -keystore "C:/Program Files/Java/jdk1.8.0_60/jre/lib/security/cacerts" -file D:/keys/yuncai.crt
changeit

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 1、打开命令行，到当前eclipse的目录下，输入eclipse -clean，重新启动eclipse，这样eclipse就会加上新的插件了。
2、如果插件不能生效，则请将eclipse\configuration\org.eclipse.update目录删除后再启动eclipse；
你可以在eclipse的菜单"Help"-->"About Eclipse SDK"-->"Feature Details" 和"Plug-in Details"中看到新安装的插件。
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

activiti sample
http://yun.baidu.com/pcloud/album/info?uk=490352281&album_id=4639668296571302059

https://cd76e1.lt.yunpan.cn/lk/cS8IXsedaTp7Z  提取码 ：3b83

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
SELECT a.id,group_concat(b.position),group_concat(c.department_name) FROM yuncaidev.yuncai_user as a ,
yuncaidev.yuncai_user_dept as b , yuncaidev.yuncai_department as c
 where a.id= b.user_id and b.department_id=c.id group by a.id;

 SELECT T2.id, T2.department_name , T2.father_id
FROM ( 
    SELECT 
        @r AS _id, 
        (SELECT @r := father_id FROM yuncai_department WHERE id = _id) AS parent_id, 
        @l := @l + 1 AS lvl 
    FROM 
        (SELECT @r := 5, @l := 0) vars, 
        yuncai_department h 
    WHERE @r <> 0) T1 
JOIN yuncai_department T2 
ON T1._id = T2.id 
ORDER BY T1.lvl DESC ;



SELECT id AS ID,father_id AS 父ID ,levels AS 父到子之间级数, paths AS 父到子路径 FROM (
   SELECT id,father_id,
   @le:= IF (father_id = 0 ,0, 
     IF( LOCATE( CONCAT('|',father_id,':'),@pathlevel)  > 0 ,   
         SUBSTRING_INDEX( SUBSTRING_INDEX(@pathlevel,CONCAT('|',father_id,':'),-1),'|',1) +1
    ,@le+1) ) levels
   , @pathlevel:= CONCAT(@pathlevel,'|',id,':', @le ,'|') pathlevel
   , @pathnodes:= IF( father_id =0,',0', 
      CONCAT_WS(',',
      IF( LOCATE( CONCAT('|',father_id,':'),@pathall) > 0 , 
        SUBSTRING_INDEX( SUBSTRING_INDEX(@pathall,CONCAT('|',father_id,':'),-1),'|',1)
       ,@pathnodes ) ,father_id ) )paths
  ,@pathall:=CONCAT(@pathall,'|',id,':', @pathnodes ,'|') pathall 
    FROM yuncai_department, 
  (SELECT @le:=0,@pathlevel:='', @pathall:='',@pathnodes:='') vv
  ORDER BY father_id,id
  ) src 
ORDER BY id;

SHOW FULL COLUMNS FROM bpm_process_definition;
SELECT  column_name, column_comment FROM information_schema.columns WHERE table_schema ='yuncaidev'  AND table_name = 'bpm_process_definition'
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

jenkins
clean install  -Dmaven.test.skip=true


**/*.war

admin
tomcat
http://yuncai-server:8080/
如需构建https://yuncai-server:8443/
要导入证书到本地jvm
管理员身份运行

keytool -delete -alias yuncai -keystore "%JAVA_HOME%/JRE/LIB/SECURITY/CACERTS"

keytool -importcert   -keystore "C:/Program Files/Java/jdk1.8.0_60/jre/lib/security/cacerts" -file "D:/keys/yuncai.crt" -alias yuncai-server
changeit

keytool -list -alias yuncai -keystore "%JAVA_HOME%/JRE/LIB/SECURITY/CACERTS" -storepass changeit

PKIX (Public-Key Infrastructure X.509) Working Group (PKIX-WG)

java -D javax.net.ssl.trustStore=D:/keys/yuncai.crt -D javax.net.ssl.trustStore Password=changeit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

tencent新的js框架
https://github.com/AlloyTeam/AlloyFinger

weibo RPC
https://github.com/weibocom
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
controller里如果写了
consumes = MediaType.APPLICATION_JSON_VALUE
请求的ajax报文里应该也指定对应的accept type和content type
headers: { 
    'Accept': 'application/json',
    'Content-Type': 'application/json' 
 }，

@RequestMapping
RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。

RequestMapping注解有六个属性，下面我们把她分成三类进行说明。
1： value， method；
value：    指定请求的实际地址，指定的地址可以是URI Template 模式；
method：   指定请求的method类型， GET、POST、PUT、DELETE等；

2： consumes，produces；
consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
produces:  指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回;

3： params，headers；
params：   指定request中必须包含某些参数值时，才让该方法处理。
headers：  指定request中必须包含某些指定的header值，才能让该方法处理请求。 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Java架构：http://pan.baidu.com/s/1x6IzO密码：xdyx

2.数据库基础到优化：http://pan.baidu.com/s/1bnx4Gs3密码：adka

3.linux高级架构：http://pan.baidu.com/s/1gd0KtZt密码：crht

4.大数据hadoop等：http://pan.baidu.com/s/1gdsCMVh密码：q9hj

5.JavaEE拓展：

http://pan.baidu.com/s/1jG6dT46密码：x5x7

6.Java基础深入：

http://pan.baidu.com/s/1o6EdmL8密码：kucp

0 15 10 ? 6L 2016-2017 表示2002-2006年的每个月的最后一个星期五上午10:15执行作
0 0 0 ? 11-1 ? 2016-2017 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
set wait_timeout = 36000;
set interactive_timeout = 36000;
show variables like '%timeout';

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
回退、继承、空节点、版本、泳道、会签
自由流状态下 如果等待处理的节点角色实效 谁来继承？
如果没有人继承 就形成了空节点 如何处理？你不能按iso那个来 那个在我大天朝行不通的
版本就是已经进行中的流的版本 防止流版本更新的时候还有老流程没有结束

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
测试号管理
微信号： gh_dfcd9e962dde
退出
测试号信息
appID
wx7524648373db17c2
appsecret
5efadaa34ceb1952a277423aa2a6ae55

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
有2个盒子分别装着黄绿两种颜色的小球，还有一个盒子混合装有黄绿蓝三种颜色的小球，
盒子外面用三种标签（黄、绿、混合）标明了盒子里面小球的颜色，但是标签全部都贴错了，
没有任何一个标签是正确的，你可以伸手去盒子里拿出小球查看颜色，现在需要纠正标签，
请问至少需要拿出几个小球来查看？
怎么做?
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
https://github.com/longkerdandy/mithqtt
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
https://github.com/netease-youdao/hex
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Dapper，大规模分布式系统的跟踪系统
http://bigbully.github.io/Dapper-translation/

 在基于 REST 的设计中，资源被一套通用动词操作使用。
    创建资源：应该使用 HTTP POST
    要获取资源：应该使用HTTP GET
    更新资源：应使用HTTP PUT
    要删除资源：应使用HTTP DELETE
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
演示：http://office.jee-soft.cn:10080/bpm3/login.jsp
用户：yanshi2   1
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
h5框架：
sencha touch； ionic；jQuery Mobile
国产的 mui；  wex5
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
[
  {
    'repeat(1, 10)': {
      id: '{{objectId()}}',
      companyId: '1102',
      processId: '{{bool()}}',
      processName: '{{floating(1000, 4000, 2, "$0,0.00")}}',
      processPage: 'http://placehold.it/32x32',
      processStepCount: '2',
      processType: '1',
      startDate: '{{new Date()}}',
      endDate: '{{new Date()}}',
      remark: 'ajlfjlajldfjds',
      deleteFlag: 'N',
      creater: 'bb',
      createTime: '{{new Date()}}',
      modifier: 'aa',
      modifierTime: '{{new Date()}}'
    }
  }
]

  {
    "id": "575e74d00ba0f2c58ae81ee8",
    "companyId": "1102",
    "processId": "false",
    "processName": "ffff",
    "processPage": "http://placehold.it/32x32",
    "processStepCount": "2",
    "processType": "1",
    "startDate": "2016-05-18",
    "endDate": "2016-05-20",
    "remark": "ajlfjlajldfjds",
    "deleteFlag": "N",
    "creater": "bb",
    "createTime": "2016-06-13",
    "modifier": "aa",
    "modifierTime": "2016-06-13"
  }
  
  application/json
  
  
  <iframe id="mainframe" name="mainframe" marginwidth="0" marginheight="0" src="http://www.zhuniu.com" width="100%"  height="auto" scrolling="auto" frameborder="0"></iframe>


<script type="text/javascript">
//注意：下面的代码是放在和iframe同一个页面调用,放在iframe下面
$("#mainframe").load(function(){
var mainheight = $(this).contents().find("body").height()+30;
$(this).height(mainheight);
}); 
</script>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
有个restful框架叫swagger 可以通过配置文件描述接口 直接就可以发布
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
mysql有以下几种日志：  
   错误日志：     -log-err 
   查询日志：     -log 
   慢查询日志:   -log-slow-queries 
   更新日志:     -log-update 
   二进制日志： -log-bin 

show master status;
//flush logs;
show variables like'log_bin%';
mysqlbinlog test-150-bin.000003
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Platform Specific Steps
Windows
Icon for nw.exe can be replaced with tools like Resource Hacker, nw-builder and node-winresourcer.
You can create a installer to deploy all necessary files onto end user’s system. You can use Windows Installer, NSIS or Inno Setup.
0：将html package.json png 打包为zip （不能打包这几个文件所在的文件夹）；
1：用Resource Hacker修改 nw.exe的ico；
2：打包生成exe；
 copy /b nw.exe+zhuniu.nw zhuniu.exe；
3：用enigma virtualbox 把zhuniu.exe 和所有资源文件 打包为一个exe；
4：用Inno Setup将上面生成的exe只作为安装文件；

copy /b nw.exe+zhuniu32.nw zhuniu32.exe
copy /b nw.exe+zhuniu64.nw zhuniu64.exe

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
索引在数据结构上可以分为三种B树索引、位图索引和散列索引
    如test表中有state这样一列，数据如下：
        10    20    30    20    10    30    10    30    20    30
那么会建立三个位图，如下：
BLOCK1    KEY=10  1    0    0    0    1    0    1    0    0    0   
BLOCK2    KEY=20  1    0    0    0    1    0    1    0    0    0 
BLOCK3    KEY=30  1    0    0    0    1    0    1    0    0    0 

红黑树的五个性质：
1）每个结点要么是红的，要么是黑的。
2）根结点是黑的。
3）每个叶结点，即空结点（NIL）是黑的。
4）如果一个结点是红的，那么它的俩个儿子都是黑的。
5）对每个结点，从该结点到其子孙结点的所有路径上包含相同数目的黑结点。

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
江建集团采购平台
http://jiangjian.zhuniu.com/member/login.html

定制化采购系统-筑牛科技
http://jjtest.zhuniu.com/

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
在监听器启动之前得先加载spring-bean，所以注解在监听器里是不能用的。
可以通过下面的方法获取需要的bean
public void contextInitialized(ServletContextEvent sce) {
WebApplicationContext appctx = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
KhiTmOrdercntService khiTmOrdercntService = (KhiTmOrdercntService) appctx.getBean("khiTmOrdercntService");

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Red5的主要功能和Macromedia公司的FMS类似，提供基于Flash的流媒体服务的一款基于Java的开源流媒体服务器。
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
基于netty的异步非阻塞实时聊天(IM)服务器
https://github.com/a2888409/face2face
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
tigase 这个是 java 开源的IM
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
国家地理
http://pan.baidu.com/share/link?shareid=4145891795&uk=942948651

分享：0-10岁儿童读物世界优秀绘本55册！
链接: http://pan.baidu.com/s/1nuKaur3 密码: u65m

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
zk原理
http://www.open-open.com/lib/view/open1415453633887.html

分布式一致性算法 paxos raft
现在 paxos 已经过时了，新的分布式协调器 都是 raft 的
新的分布式协调器 都是 raft 的
raft 
https://raft.github.io/
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
消息队列：
Kafka NSQ NATs
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
爬虫
1.爬虫：Nutch
2.JAVA单机爬虫：Crawler4j、WebMagic、WebCollector
3. 非JAVA单机爬虫：scrapy(python)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
高保真图片压缩
GraphicsMagick
java图像处理
im4java或者  ImageMagick 或者 apahce commons 或者 thumbnailator
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
select dd from 
( SELECT  deptHead1 AS dd FROM yuncai_department 
 union all SELECT  deptHead2 AS dd FROM yuncai_department
 union all SELECT  deptHead3 AS dd FROM yuncai_department  ) t;
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 http://projectreactor.io/
 http://www.paralleluniverse.co/
 hazelcast
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 sonar
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 java Integer 对象的计算操作 都会进行unbox的操作 转为基本数据类型 然后再box为Integer对象
  Auto Box/Unbox在有些场景下容易产生NPE，例如假设有一个这样的方法：
public void execute(int code)…
假设调用方是从一个Map或其他地方获取到的Integer，如果忘记判断是否为null，直接传给execute的方法，就有可能导致NPE。

下面这个关于Integer的Case也是比较常见的：
Integer i = 100;
Integer j = 100;
Integer m = 200;
Integer n = 200;
System.out.println(i == j);
System.out.println(m == n);
其执行结果为：true,false
原因是Integer会cache -127~127的Integer对象，而不在这个范围的则会每次new Integer。 


(result != null && result >= 1) ? result-1 : result; 报npe
(result != null && result >= 1) ? result-1 : 1; ok
(result != null && result >= 1) ? result : result; ok

由三目运算符如下第三点的规则引发的 拆箱问题：
    If the second and third operands have the same type (which may be the null type), then that is the type of the conditional expression.
    If one of the second and third operands is of primitive type T, and the type of the other is the result of applying boxing conversion (§5.1.7) to T, then the type of the conditional expression is T.
    If one of the second and third operands is of the null type and the type of the other is a reference type, then the type of the conditional expression is that reference type.
http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.25
 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
    堆大小设置
    JVM 中最大堆大小有三方面限制：相关操作系统的数据模型（32-bt还是64-bit）限制；系统的可用虚拟内存限制；系统的可用物理内存限制。32位系统下，一般限制在1.5G~2G；64为操作系统对内存无限制。我在Windows Server 2003 系统，3.5G物理内存，JDK5.0下测试，最大可设置为1478m。
    典型设置：
        java -Xmx3550m -Xms3550m -Xmn2g -Xss128k
        -Xmx3550m：设置JVM最大可用内存为3550M。
        -Xms3550m：设置JVM促使内存为3550m。此值可以设置与-Xmx相同，以避免每次垃圾回收完成后JVM重新分配内存。
        -Xmn2g：设置年轻代大小为2G。整个JVM内存大小=年轻代大小 + 年老代大小 + 持久代大小。持久代一般固定大小为64m，所以增大年轻代后，将会减小年老代大小。此值对系统性能影响较大，Sun官方推荐配置为整个堆的3/8。
        -Xss128k：设置每个线程的堆栈大小。JDK5.0以后每个线程堆栈大小为1M，以前每个线程堆栈大小为256K。更具应用的线程所需内存大小进行调整。在相同物理内存下，减小这个值能生成更多的线程。但是操作系统对一个进程内的线程数还是有限制的，不能无限生成，经验值在3000~5000左右。
        java -Xmx3550m -Xms3550m -Xss128k -XX:NewRatio=4 -XX:SurvivorRatio=4 -XX:MaxPermSize=16m -XX:MaxTenuringThreshold=0
        -XX:NewRatio=4:设置年轻代（包括Eden和两个Survivor区）与年老代的比值（除去持久代）。设置为4，则年轻代与年老代所占比值为1：4，年轻代占整个堆栈的1/5
        -XX:SurvivorRatio=4：设置年轻代中Eden区与Survivor区的大小比值。设置为4，则两个Survivor区与一个Eden区的比值为2:4，一个Survivor区占整个年轻代的1/6
        -XX:MaxPermSize=16m:设置持久代大小为16m。
        -XX:MaxTenuringThreshold=0：设置垃圾最大年龄。如果设置为0的话，则年轻代对象不经过Survivor区，直接进入年老代。对于年老代比较多的应用，可以提高效率。如果将此值设置为一个较大值，则年轻代对象会在Survivor区进行多次复制，这样可以增加对象再年轻代的存活时间，增加在年轻代即被回收的概论。
    回收器选择
    JVM给了三种选择：串行收集器、并行收集器、并发收集器，但是串行收集器只适用于小数据量的情况，所以这里的选择主要针对并行收集器和并发收集器。默认情况下，JDK5.0以前都是使用串行收集器，如果想使用其他收集器需要在启动时加入相应参数。JDK5.0以后，JVM会根据当前系统配置进行判断。
        吞吐量优先的并行收集器
        如上文所述，并行收集器主要以到达一定的吞吐量为目标，适用于科学技术和后台处理等。
        典型配置：
            java -Xmx3800m -Xms3800m -Xmn2g -Xss128k -XX:+UseParallelGC -XX:ParallelGCThreads=20
            -XX:+UseParallelGC：选择垃圾收集器为并行收集器。此配置仅对年轻代有效。即上述配置下，年轻代使用并发收集，而年老代仍旧使用串行收集。
            -XX:ParallelGCThreads=20：配置并行收集器的线程数，即：同时多少个线程一起进行垃圾回收。此值最好配置与处理器数目相等。
            java -Xmx3550m -Xms3550m -Xmn2g -Xss128k -XX:+UseParallelGC -XX:ParallelGCThreads=20 -XX:+UseParallelOldGC
            -XX:+UseParallelOldGC：配置年老代垃圾收集方式为并行收集。JDK6.0支持对年老代并行收集。
            java -Xmx3550m -Xms3550m -Xmn2g -Xss128k -XX:+UseParallelGC  -XX:MaxGCPauseMillis=100
            -XX:MaxGCPauseMillis=100:设置每次年轻代垃圾回收的最长时间，如果无法满足此时间，JVM会自动调整年轻代大小，以满足此值。
            java -Xmx3550m -Xms3550m -Xmn2g -Xss128k -XX:+UseParallelGC  -XX:MaxGCPauseMillis=100 -XX:+UseAdaptiveSizePolicy
            -XX:+UseAdaptiveSizePolicy：设置此选项后，并行收集器会自动选择年轻代区大小和相应的Survivor区比例，以达到目标系统规定的最低相应时间或者收集频率等，此值建议使用并行收集器时，一直打开。
        响应时间优先的并发收集器
        如上文所述，并发收集器主要是保证系统的响应时间，减少垃圾收集时的停顿时间。适用于应用服务器、电信领域等。
        典型配置：
            java -Xmx3550m -Xms3550m -Xmn2g -Xss128k -XX:ParallelGCThreads=20 -XX:+UseConcMarkSweepGC -XX:+UseParNewGC
            -XX:+UseConcMarkSweepGC：设置年老代为并发收集。测试中配置这个以后，-XX:NewRatio=4的配置失效了，原因不明。所以，此时年轻代大小最好用-Xmn设置。
            -XX:+UseParNewGC:设置年轻代为并行收集。可与CMS收集同时使用。JDK5.0以上，JVM会根据系统配置自行设置，所以无需再设置此值。
            java -Xmx3550m -Xms3550m -Xmn2g -Xss128k -XX:+UseConcMarkSweepGC -XX:CMSFullGCsBeforeCompaction=5 -XX:+UseCMSCompactAtFullCollection
            -XX:CMSFullGCsBeforeCompaction：由于并发收集器不对内存空间进行压缩、整理，所以运行一段时间以后会产生“碎片”，使得运行效率降低。此值设置运行多少次GC以后对内存空间进行压缩、整理。
            -XX:+UseCMSCompactAtFullCollection：打开对年老代的压缩。可能会影响性能，但是可以消除碎片
    辅助信息
    JVM提供了大量命令行参数，打印信息，供调试使用。主要有以下一些：
        -XX:+PrintGC
        输出形式：[GC 118250K->113543K(130112K), 0.0094143 secs]

                        [Full GC 121376K->10414K(130112K), 0.0650971 secs]
        -XX:+PrintGCDetails
        输出形式：[GC [DefNew: 8614K->781K(9088K), 0.0123035 secs] 118250K->113543K(130112K), 0.0124633 secs]

                        [GC [DefNew: 8614K->8614K(9088K), 0.0000665 secs][Tenured: 112761K->10414K(121024K), 0.0433488 secs] 121376K->10414K(130112K), 0.0436268 secs]
        -XX:+PrintGCTimeStamps -XX:+PrintGC：PrintGCTimeStamps可与上面两个混合使用
        输出形式：11.851: [GC 98328K->93620K(130112K), 0.0082960 secs]
        -XX:+PrintGCApplicationConcurrentTime:打印每次垃圾回收前，程序未中断的执行时间。可与上面混合使用
        输出形式：Application time: 0.5291524 seconds
        -XX:+PrintGCApplicationStoppedTime：打印垃圾回收期间程序暂停的时间。可与上面混合使用
        输出形式：Total time for which application threads were stopped: 0.0468229 seconds
        -XX:PrintHeapAtGC:打印GC前后的详细堆栈信息
        输出形式：
        34.702: [GC {Heap before gc invocations=7:
         def new generation   total 55296K, used 52568K [0x1ebd0000, 0x227d0000, 0x227d0000)
        eden space 49152K,  99% used [0x1ebd0000, 0x21bce430, 0x21bd0000)
        from space 6144K,  55% used [0x221d0000, 0x22527e10, 0x227d0000)
          to   space 6144K,   0% used [0x21bd0000, 0x21bd0000, 0x221d0000)
         tenured generation   total 69632K, used 2696K [0x227d0000, 0x26bd0000, 0x26bd0000)
        the space 69632K,   3% used [0x227d0000, 0x22a720f8, 0x22a72200, 0x26bd0000)
         compacting perm gen  total 8192K, used 2898K [0x26bd0000, 0x273d0000, 0x2abd0000)
           the space 8192K,  35% used [0x26bd0000, 0x26ea4ba8, 0x26ea4c00, 0x273d0000)
            ro space 8192K,  66% used [0x2abd0000, 0x2b12bcc0, 0x2b12be00, 0x2b3d0000)
            rw space 12288K,  46% used [0x2b3d0000, 0x2b972060, 0x2b972200, 0x2bfd0000)
        34.735: [DefNew: 52568K->3433K(55296K), 0.0072126 secs] 55264K->6615K(124928K)Heap after gc invocations=8:
         def new generation   total 55296K, used 3433K [0x1ebd0000, 0x227d0000, 0x227d0000)
        eden space 49152K,   0% used [0x1ebd0000, 0x1ebd0000, 0x21bd0000)
          from space 6144K,  55% used [0x21bd0000, 0x21f2a5e8, 0x221d0000)
          to   space 6144K,   0% used [0x221d0000, 0x221d0000, 0x227d0000)
         tenured generation   total 69632K, used 3182K [0x227d0000, 0x26bd0000, 0x26bd0000)
        the space 69632K,   4% used [0x227d0000, 0x22aeb958, 0x22aeba00, 0x26bd0000)
         compacting perm gen  total 8192K, used 2898K [0x26bd0000, 0x273d0000, 0x2abd0000)
           the space 8192K,  35% used [0x26bd0000, 0x26ea4ba8, 0x26ea4c00, 0x273d0000)
            ro space 8192K,  66% used [0x2abd0000, 0x2b12bcc0, 0x2b12be00, 0x2b3d0000)
            rw space 12288K,  46% used [0x2b3d0000, 0x2b972060, 0x2b972200, 0x2bfd0000)
        }
        , 0.0757599 secs]
        -Xloggc:filename:与上面几个配合使用，把相关日志信息记录到文件以便分析。
    常见配置汇总
        堆设置
            -Xms:初始堆大小
            -Xmx:最大堆大小
            -XX:NewSize=n:设置年轻代大小
            -XX:NewRatio=n:设置年轻代和年老代的比值。如:为3，表示年轻代与年老代比值为1：3，年轻代占整个年轻代年老代和的1/4
            -XX:SurvivorRatio=n:年轻代中Eden区与两个Survivor区的比值。注意Survivor区有两个。如：3，表示Eden：Survivor=3：2，一个Survivor区占整个年轻代的1/5
            -XX:MaxPermSize=n:设置持久代大小
        收集器设置
            -XX:+UseSerialGC:设置串行收集器
            -XX:+UseParallelGC:设置并行收集器
            -XX:+UseParalledlOldGC:设置并行年老代收集器
            -XX:+UseConcMarkSweepGC:设置并发收集器
        垃圾回收统计信息
            -XX:+PrintGC
            -XX:+PrintGCDetails
            -XX:+PrintGCTimeStamps
            -Xloggc:filename
        并行收集器设置
            -XX:ParallelGCThreads=n:设置并行收集器收集时使用的CPU数。并行收集线程数。
            -XX:MaxGCPauseMillis=n:设置并行收集最大暂停时间
            -XX:GCTimeRatio=n:设置垃圾回收时间占程序运行时间的百分比。公式为1/(1+n)
        并发收集器设置
            -XX:+CMSIncrementalMode:设置为增量模式。适用于单CPU情况。
            -XX:ParallelGCThreads=n:设置并发收集器年轻代收集方式为并行收集时，使用的CPU数。并行收集线程数。


四、调优总结

    年轻代大小选择
        响应时间优先的应用：尽可能设大，直到接近系统的最低响应时间限制（根据实际情况选择）。在此种情况下，年轻代收集发生的频率也是最小的。同时，减少到达年老代的对象。
        吞吐量优先的应用：尽可能的设置大，可能到达Gbit的程度。因为对响应时间没有要求，垃圾收集可以并行进行，一般适合8CPU以上的应用。
    年老代大小选择
        响应时间优先的应用：年老代使用并发收集器，所以其大小需要小心设置，一般要考虑并发会话率和会话持续时间等一些参数。如果堆设置小了，可以会造成内存碎片、高回收频率以及应用暂停而使用传统的标记清除方式；如果堆大了，则需要较长的收集时间。最优化的方案，一般需要参考以下数据获得：
            并发垃圾收集信息
            持久代并发收集次数
            传统GC信息
            花在年轻代和年老代回收上的时间比例
        减少年轻代和年老代花费的时间，一般会提高应用的效率
        吞吐量优先的应用：一般吞吐量优先的应用都有一个很大的年轻代和一个较小的年老代。原因是，这样可以尽可能回收掉大部分短期对象，减少中期的对象，而年老代尽存放长期存活对象。
    较小堆引起的碎片问题
    因为年老代的并发收集器使用标记、清除算法，所以不会对堆进行压缩。当收集器回收时，他会把相邻的空间进行合并，这样可以分配给较大的对象。但是，当堆空间较小时，运行一段时间以后，就会出现“碎片”，如果并发收集器找不到足够的空间，那么并发收集器将会停止，然后使用传统的标记、清除方式进行回收。如果出现“碎片”，可能需要进行如下配置：
        -XX:+UseCMSCompactAtFullCollection：使用并发收集器时，开启对年老代的压缩。
        -XX:CMSFullGCsBeforeCompaction=0：上面配置开启的情况下，这里设置多少次Full GC后，对年老代进行压缩
	
 /rpm/tomcat run 	
ps -ef|grep java 

跳板机：
61.155.210.222
ansel
zgr@123
java 机器：
192.168.1.100
root
zgr@123

ssh 端口： 2222


 数据库：lc_db
用户密码：
javauser
778#G6zk
192.168.1.43

3306



 /rpm/tomcat start 

 ps -ef|grep java
 wget http://127.0.0.1:8080/yuncai-bpm/index.jsp 
 wget http://127.0.0.1:8080/login.html
 kill -9 
pkill java

whereis mysql
rpm -Uvh mysql57-community-release-el6-n.noarch.rpm 
yum repolist all | grep mysql

 yum install mysql-community-client mysql-community-libs

ps -ef|grep mysql 

usr/bin/mysql 是指：mysql的运行路径 
var/lib/mysql 是指：mysql数据库文件的存放路径 
usr/lib/mysql 是指：mysql的安装路径

chkconfig --list mysqld 
./mysql -h 192.168.1.43 -u javauser -p778#G6zk

service mysqld restart

mysql -u root
use mysql;
update user set password=password('123456') where user='root';
exit;


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
Exception in thread "main" com.mysql.jdbc.exceptions.jdbc4.CommunicationsException: Communications link failure
The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
 
 数据库链接失败

-   sudo vi /Applications/XAMPP/etc/my.cnf 
?   scroll down to `skip-networking`
?   comment it out by changing it to `#skip-networking`
?   save the changes.
?   restart mysql from XAMPP Console

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
jstack pid >>dumpfile
查看GC的情况
jstat -gcutil pid 毫秒 次数
jstat -gcutil 14503 1000 4

1，使用top命令，找到java进程的PID，我这里找到的PID为4743。
2，找到该进程后，就要定位具体线程或代码，首先显示线程列表,并按照CPU占用高的线程排序：
ps -mp pid -o THREAD,tid,time | sort -rn 

将上面显示的需要的线程ID转换为16进制格式：
printf "%xn" 4807
12c7

最后使用jvm命令打印线程的堆栈信息：
 jstack pid |grep 12c7 -A 30 

1.对这个进程中的所有线程作监视:top -p pid -H
2.找到最耗CPU的线程:ps -mp pid -o THREAD,tid,time 或者 ps -Lfp pid
3.也可以用下面的命令将 cpu 占用率高的线程找出来:
 ps H -eo user,pid,ppid,tid,time,%cpu,cmd --sort=%cpu

这个命令首先指定参数'H'，显示线程相关的信息，格式输出中包含:user,pid,ppid,tid,time,%cpu,cmd，然后再用%cpu字段进行排序。这样就可以找到占用处理器的线程了。

直接使用 ps Hh -eo pid,tid,pcpu | sort -nk3 |tail 获取对于的进程号和线程号，然后跳转到3.
查看哪个进程线程占用cpu过高； top / ps -aux， 获得进程号
确定哪个线程占用cpu过高，进入进程号的目录：/proc/pid/task， 
执行：grep SleepAVG  **/status  | sort -k2,2 | head，  确定cpu占用较高的线程号。
使用kill -3 pid 会打印线程堆栈的情况
在 Linux 下 top 工具可以显示 cpu 的平均利用率(user,nice,system,idle,iowait,irq,softirq,etc.)，
可以显示每个 cpu 的利用率。但是无法显示每个线程的 cpu 利用率情况，这时就可能出现这种情况，总的 cpu 利用率中 user 或 system 很高，
但是用进程的 cpu 占用率进行排序时，没有进程的 user 或 system 与之对应。

/proc/cpuinfo文件
/proc/stat文件
/proc/<pid>/stat文件   


 Java 系统性能分析 命令  
1. cpu分析 
   top ， pidstat(sysstat) 
   pid -p PID -t 1 10 
   vmstat 1  CPU上下文切换、运行队列、利用率 
   ps Hh -eo tid 
   pcpu 查看具体线程的CPU消耗 
   sar  来查看一定世界范围内以及历史的cpu消耗情况信息 
   查看java线程信息 
   jstack pid | grep 'nid=0x9999' 

2. cs sy消耗比较高 
   上下文切换性能偏高， jstack -l pid, 查看on object monitor 

3. io消耗 
   pidstat -d -t -p pid 1 100 
   iostat 

4. 网络io消耗 
   cat /proc/interruptes 
   sar -n FULL 1 2 
   tcpdump
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 

-Xms2048m
-Xmx2048m JVM最大可用内存
-Xmn512m  设置年轻代大小
-XX:PermSize=128M 持久代大小
-XX:MaxPermSize=128m 持久代大小
-verbose:gc 
-XX:+UseConcMarkSweepGC 设置并发收集器
-XX:MaxTenuringThreshold=5 设置垃圾最大年龄 如果设置为0的话，则年轻代对象不经过Survivor区，直接进入年老代
-XX:+ExplicitGCInvokesConcurrent  其实，也是触发full gc 只不过在CMS在full gc 效率比较高。（前提条件：-XX:+UseConcMarkSweepGC ）
-XX:GCTimeRatio=19  设置垃圾回收时间占程序运行时间的百分比。公式为1/(1+n)
-XX:CMSInitiatingOccupancyFraction=70   使用cms作为垃圾回收使用70％后开始CMS收集
-XX:CMSFullGCsBeforeCompaction=0  设置多少次Full GC后,对年老代进行压缩（前提条件：-XX:+UseCMSCompactAtFullCollection:使用并发收集器时,开启对年老代的压缩）
-Xnoclassgc  关闭CLASS的垃圾回收功能，就是虚拟机加载的类，即便是不使用，没有实例也不会回收。如果一个类20分钟还没有使用，虚拟机会卸载这个类。如果这个类再次使用，
虚拟机会重新加载这个类，由于虚拟机加载类包含了IO和内存分配的操作，因此加载时会对性能有所影响。
-XX:SoftRefLRUPolicyMSPerMB=0  	每兆堆空闲空间中SoftReference的存活时间

ALTER TABLE `lc_db`.`yuncai_purchase_plan_detail` CHANGE COLUMN `material_code` `material_code` VARCHAR(32) NULL DEFAULT NULL COMMENT '采购单状态' 

http://www.highcharts.com/demo/dynamic-update/grid-light

file:///C:/Users/xuys/Documents/Tencent%20Files/86891394/FileRecv/24种设计模式介绍与6大设计原则.pdf

Random rm = new Random();
int i = rm.nextInt(18);
int n = 0;
if(i > 8){
        n = rm.nextInt(10)+1;
}else if(i > 2&&i <= 8){
        n = rm.nextInt(11) + 10;
}else if(i<=2){
        n = rm.nextInt(11) + 20;
}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
数据挖掘
hadoop下的mahout，spark下的mlib
weka，mulan

大数据的BI 就是Apache Storm + Hadoop生态系统
主动推过来的数据走Storm  需要从现有数据库里抓的用Hadoop Connector
就好比说 Hadoop离线分析后 报表存去Elasticsearch
用Kibana展示 
Angular.js Bootstrap的付费模板

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
读取pdf里的文字
IText

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
java 108548   0.82
js    35084   0.9
jsp    7931   1
css   15140   1
sum  166703
PC端（前端三人+java五人）
83天的工期(5.27--8.17)
合计人时 40*12*8=3840人时

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
HTML模板-developr1.7
https://bbs.cfei.net/thread-202-1-1.html
z3g7
1、每日一套html模板：https://bbs.cfei.net/thread-442-1-1.html   提取码：lehm
2、10天架构师特级课视频教程：https://bbs.cfei.net/thread-436-1-1.html  提取码：j5yq
3、鸟哥的Linux私房菜，无水印文字版电子书：https://bbs.cfei.net/thread-434-1-1.html   提取码：9nlk
4、Python网络开发视频教程：https://bbs.cfei.net/thread-441-1-1.html   提取码：vm6o
5、Python Web开发学习实录电子书：https://bbs.cfei.net/thread-440-1-1.html   提取码：q8tk

一、技术视频篇：
1、马哥视频教程分享：https://bbs.cfei.net/thread-308-1-1.html
2、10天架构师特级课视频教程：https://bbs.cfei.net/thread-436-1-1.html
3、传智播客物联云计算_就业班_视频教程：https://bbs.cfei.net/thread-446-1-1.html
4、Shell高级编程实战教程：https://bbs.cfei.net/thread-428-1-1.html
5、Java Web整合开发王者归来（JSP+Servlet+Struts+Hibernate+Spring）：https://bbs.cfei.net/thread-91-1-2.html
6、黑马 android 23期 全套 代码 视频：https://bbs.cfei.net/thread-429-1-1.html
7、高性能MySQL_第3版（中文）：https://bbs.cfei.net/thread-419-1-1.html
8、100多G的各大操作系统镜像：https://bbs.cfei.net/thread-445-1-1.html
9、SEO入门到精通视频：https://bbs.cfei.net/thread-443-1-1.html
10、Python网络程序系列视频教程：https://bbs.cfei.net/thread-441-1-1.html
11、html5技术视频分享：https://bbs.cfei.net/thread-427-1-1.html

二、代码篇，现在可能少，后续会有更多：
1、程序员简历的html模板：https://bbs.cfei.net/thread-392-1-1.html
2、一套20美刀的程序猿专用HTML模板：https://bbs.cfei.net/thread-202-1-1.html
3、精仿京东手机html模板：https://bbs.cfei.net/thread-451-1-1.html
4、外卖超人全套网站模板下载：https://bbs.cfei.net/thread-454-1-1.html
5、一款非常帅的响应式布局企业html模版：https://bbs.cfei.net/thread-431-1-1.html
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
https://yunpan.cn/cMudScBwHeqRK  访问密码 d4f5
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
Light Task Scheduler
quartz
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
github
xuys0523
xys3

https://leetcode.com/problemset/algorithms/
xuys0523
123456
86891394@qq.com

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
http://netty.io/wiki/index.html
http://waylau.com/netty-4-user-guide/
http://www.infoq.com/cn/articles/netty-high-performance/

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
mybatis 分页pluginadapter
下面是另外一个分页插件
http://blog.csdn.net/fighterandknight/article/details/52625529
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
java大牛的blog
http://weibo.com/calvin1978?is_hot=1#_loginLayer_1474195043721
http://weibo.com/rednaxelafx?from=hissimilar_home&refer_flag=1005050003_&is_hot=1#_rnd1474195177214
调试 进程信息
http://rednaxelafx.iteye.com/blog/1847971

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
spring 整合quartz
http://blog.csdn.net/fighterandknight/article/details/52591106

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
Apache Oozie Workflow Scheduler for Hadoop
Overview
Oozie is a workflow scheduler system to manage Apache Hadoop jobs.
Oozie Workflow jobs are Directed Acyclical Graphs (DAGs) of actions.
Oozie Coordinator jobs are recurrent Oozie Workflow jobs triggered by time (frequency) and data availability.
Oozie is integrated with the rest of the Hadoop stack supporting several types of Hadoop jobs out of the box (such as Java map-reduce, Streaming map-reduce, Pig, Hive, Sqoop and Distcp)
 as well as system specific jobs (such as Java programs and shell scripts).
Oozie is a scalable, reliable and extensible system.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
1、深入理解Java虚拟机：JVM高级特性与最佳实践.pdf：https://bbs.cfei.net/thread-483-1-1.html
2、看透springMvc源代码分析与实践.pdf ：https://bbs.cfei.net/thread-482-1-1.html
3、大型网站技术架构：核心原理与案例分析：https://bbs.cfei.net/thread-481-1-1.html
4、高可用性的HDFS——Hadoop分布式文件系统深度实践.pdf：https://bbs.cfei.net/thread-480-1-1.html
5、RocketMQ 开发手册3.2.4.pdf：https://bbs.cfei.net/thread-479-1-1.html
6、HTTP权威指南（第一版）.pdf ：https://bbs.cfei.net/thread-469-1-1.html
7、hadoop权威指南（第二版）(中文版)pdf ：https://bbs.cfei.net/thread-468-1-1.html
8、hadoop权威指南（第三版）(英文原版)pdf ：https://bbs.cfei.net/thread-468-1-1.html
9、《Apache Mina 入门 》pdf ：https://bbs.cfei.net/thread-467-1-1.html
10、《深入理解JavaWeb开发技术 探索基于主流框架的最佳组合》：https://bbs.cfei.net/thread-465-1-1.html
1、2015年最新黑马 hadoop2.4 配套(6天)视频教程：https://bbs.cfei.net/thread-508-1-1.html
2、四套spring MVC入门视频教程合集：https://bbs.cfei.net/thread-509-1-1.html
3、编程之美：微软技术面试心得.pdf：https://bbs.cfei.net/thread-510-1-1.html

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
https://github.com/alibaba/dubbo


>route add 172.16.200.0/23 192.168.2.155

zhuniu123@


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 tomcat的catalina.out 的日志里报如下错误的时候：
 org.apache.catalina.webresources.Cache.getResource Unable to add the resource at 
 [/WEB-INF/classes/template/exhibition_host.html] to the cache because there was insufficient free space available after evicting expired cache entries - consider increasing the maximum size of the cache


 在tomcat的/conf/context.xml中的Context中添加
<Resources
    cachingAllowed="true"
    cacheMaxSize="100000"
/> 
来设置cache,因为 默认的大小是10240byte (10M)不够用

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
提交文件到github
D:\test>git init
D:\test>git add README.md
D:\test>git config --global user.email "86891394@qq.com"
D:\test>git config --global user.name "xuys0523"
D:\test>git commit -m "first commit"
D:\test>git remote add origin https://github.com/xuys0523/test.git
D:\test>git push -u origin master
Logon failed, use ctrl+c to cancel basic credential prompt.
Username for 'https://github.com/': xuys0523
Password for 'https://xuys0523@github.com/':
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 8.32 KiB | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/xuys0523/test.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

有修改后 将改动的地方添加到版本管理器并提交到总库 
git add .    
git  commit -m "changes log"  
git push -u origin master  