package com.ss.android.vc.entity.follow;

import java.util.List;

public class Web_debug {
    private String auth_provider_x509_cert_url;
    private String auth_uri;
    private String client_id;
    private String client_secret;
    private String project_id;
    private List<String> redirect_uris;
    private String token_uri;

    public String getAuth_provider_x509_cert_url() {
        return this.auth_provider_x509_cert_url;
    }

    public String getAuth_uri() {
        return this.auth_uri;
    }

    public String getClient_id() {
        return this.client_id;
    }

    public String getClient_secret() {
        return this.client_secret;
    }

    public String getProject_id() {
        return this.project_id;
    }

    public List<String> getRedirect_uris() {
        return this.redirect_uris;
    }

    public String getToken_uri() {
        return this.token_uri;
    }

    public void setAuth_provider_x509_cert_url(String str) {
        this.auth_provider_x509_cert_url = str;
    }

    public void setAuth_uri(String str) {
        this.auth_uri = str;
    }

    public void setClient_id(String str) {
        this.client_id = str;
    }

    public void setClient_secret(String str) {
        this.client_secret = str;
    }

    public void setProject_id(String str) {
        this.project_id = str;
    }

    public void setRedirect_uris(List<String> list) {
        this.redirect_uris = list;
    }

    public void setToken_uri(String str) {
        this.token_uri = str;
    }
}
