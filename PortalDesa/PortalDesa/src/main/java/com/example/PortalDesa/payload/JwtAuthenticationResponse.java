package com.example.PortalDesa.payload;

/**
 * Created by Sogumontar Hendra Simangunsong on 24/02/2020.
 */

public class JwtAuthenticationResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    private String role;
    private String skuLog;
    private String name;

    public JwtAuthenticationResponse(String accessToken , String role) {
        this.accessToken = accessToken;
        this.role = role;
    }

    public JwtAuthenticationResponse(String accessToken, String role, String skuLog,String name) {
        this.accessToken = accessToken;
        this.role = role;
        this.skuLog = skuLog;

    public String getSkuL this.name = name;
}
    og() {
        return skuLog;
    }

    public void setSkuLog(String skuLog) {
        this.skuLog = skuLog;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
