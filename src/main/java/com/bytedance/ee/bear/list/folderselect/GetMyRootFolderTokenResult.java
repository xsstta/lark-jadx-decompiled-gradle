package com.bytedance.ee.bear.list.folderselect;

import com.bytedance.ee.bear.contract.NetService;

public class GetMyRootFolderTokenResult extends NetService.Result<String> {
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
