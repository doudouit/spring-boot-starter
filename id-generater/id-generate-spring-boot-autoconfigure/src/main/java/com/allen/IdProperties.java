package com.allen;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = IdProperties.PREFIX)
public class IdProperties {
    public static final String PREFIX = "allen";
    private Long workId;
    public Long getWorkId() {
        return workId;
    }
    public void setWorkId(Long workId) {
        this.workId = workId;
    }
}