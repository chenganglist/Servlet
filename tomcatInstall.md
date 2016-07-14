###tomcat安装    
wget  http://mirrors.tuna.tsinghua.edu.cn/apache/tomcat/tomcat-7/v7.0.70/bin/apache-tomcat-7.0.70.tar.gz    
tar -vxzf  apache-tomcat-7.0.70.tar.gz    
mv apache-tomcat-7.0.70  /usr/local/tomcat    
 
    
###JDK和tomcat环境配置--需要配合java和javac版本配置环境变量    
yum默认安装jdk位置为/usr/lib/jvm    
    
export   PATH=/usr/local/tomcat/lib:$PATH    
export JAVA_HOME=/usr/lib/jvm/java-1.7.0-openjdk    
export PATH=$JAVA_HOME/bin:$PATH    
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar    
export CATALINA=/usr/local/tomcat    
export CLASSPATH=$CATALINA/common/lib/servlet-api.jar:$CLASSPATH    
export CLASSPATH=$CATALINA/common/lib:$CLASSPATH    
    
mv /usr/local/tomcat/lib/*   $JDK/jre/lib/ext    
    
    
###tomcat关闭和重启    
/usr/local/tomcat/bin/shutdown.sh     
/usr/local/tomcat/bin/startup.sh    