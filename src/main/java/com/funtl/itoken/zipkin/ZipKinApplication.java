package com.funtl.itoken.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * <p>Title: ZipKinApplication</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/9 15:34
 */
@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
