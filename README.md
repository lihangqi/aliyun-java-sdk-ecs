<h1 align="center">Aliyun ECS SDK for Java</h1> 

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d086b22bb61c40d298daa901ebb7dc39)](https://www.codacy.com/app/weslie0803/aliyun-java-sdk-ecs?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=lihangqi/aliyun-java-sdk-ecs&amp;utm_campaign=Badge_Grade)
[![Build Status](https://travis-ci.com/lihangqi/aliyun-java-sdk-ecs.svg?branch=master)](https://travis-ci.com/lihangqi/aliyun-java-sdk-ecs)
[![codecov](https://codecov.io/gh/lihangqi/aliyun-java-sdk-ecs/branch/master/graph/badge.svg)](https://codecov.io/gh/lihangqi/aliyun-java-sdk-ecs)

阿里云云服务器ECS开发者工具包（SDK）
## 前提条件
- 使用Alibaba Cloud SDK for Java，您需要一个阿里云账号和访问密钥（AccessKey）。 请在阿里云控制台中的AccessKey管理页面上创建和查看您的AccessKey，或联系您的系统管理员。
- 使用Alibaba Cloud SDK for Java调用某个产品的API前，确保您已经在阿里云控制台开通了该产品。
- 安装Java环境。Alibaba Cloud SDK for Java要求使用JDK1.6或更高版本。
## 安装Alibaba Cloud SDK for Java
您可以通过添加Maven依赖或下载Alibaba Cloud SDK for Java工具包的方式安装Alibaba Cloud SDK for Java，详情参见安装[Alibaba Cloud SDK for Java](https://help.aliyun.com/document_detail/52740.html?spm=a2c4g.11186623.2.16.586e2c44m4emJz#concept-mkk-vpj-zdb)。
本教程以调用ECS的Java SDK为例（使用3.7.0版本的Alibaba Cloud SDK for Java核心库和4.11.0版本的ECS Java SDK），您只需在 pom.xml文件中添加以下依赖即可：
```java
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <version>3.7.0</version>
</dependency>
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-ecs</artifactId>
    <version>4.11.0</version>
</dependency>
```
## 使用Alibaba Cloud SDK for Java
以下代码示例展示了调用Alibaba Cloud SDK for Java的三个主要步骤：

1. 创建DefaultAcsClient实例并初始化。
2. 创建API请求并设置参数。
3. 发起请求并处理应答或异常。

```java
package com.testprogram;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ecs.model.v20140526.*;
public class Main {
    public static void main(String[] args) {
         // 创建DefaultAcsClient实例并初始化
        DefaultProfile profile = DefaultProfile.getProfile(
            "<your-region-id>",          // 地域ID
            "<your-access-key-id>",      // RAM账号的AccessKey ID
            "<your-access-key-secret>"); // RAM账号AccessKey Secret
        IAcsClient client = new DefaultAcsClient(profile);
         // 创建API请求并设置参数
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);
        // 发起请求并处理应答或异常
        DescribeInstancesResponse response;
        try {
            response = client.getAcsResponse(request);
            for (DescribeInstancesResponse.Instance instance:response.getInstances()) {
                System.out.println(instance.getPublicIpAddress());
            }
        } catch (ServerException e) {
            e.printStackTrace();
         } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
```
