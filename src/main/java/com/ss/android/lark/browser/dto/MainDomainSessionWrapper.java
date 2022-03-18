package com.ss.android.lark.browser.dto;

import java.io.Serializable;
import java.util.HashMap;

public class MainDomainSessionWrapper implements Serializable {
    public String mDocMainDomain;
    public String mMainDomain;
    public HashMap<String, SessionInfo> mSessionInfoMap;

    public MainDomainSessionWrapper(String str, String str2, HashMap<String, SessionInfo> hashMap) {
        this.mMainDomain = str;
        this.mDocMainDomain = str2;
        this.mSessionInfoMap = hashMap;
    }
}
