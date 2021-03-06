package com.dlink.metadata.driver;


import lombok.Getter;
import lombok.Setter;

/**
 * DriverConfig
 *
 * @author wenmo
 * @since 2021/7/19 23:21
 */
@Getter
@Setter
public class DriverConfig {

    private String name;
    private String type;
    private String driverClassName;
    private String ip;
    private Integer port;
    private String url;
    private String username;
    private String password;

    public DriverConfig() {
    }

    public DriverConfig(String name, String type, String url, String username, String password) {
        this.name = name;
        this.type = type;
        this.url = url;
        this.username = username;
        this.password = password;
    }
}
