# Docker image for springboot file run
# VERSION 0.0.1
# Author: eangulee
# 基础镜像使用java
FROM java:8
ENV LANG C.UTF-8
RUN echo "Asia/shanghai" > /etc/timezone;
VOLUME /tmp
# 将jar包添加到容器中并更名为app.jar
ADD target/${JAR_FILE} app.jar
EXPOSE 9998
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eladmin.jar"]