package com.ss.android.lark.browser.manis;

import android.content.Context;
import com.ss.android.lark.browser.handler.C29908a;
import com.ss.android.lark.browser.handler.C29912b;
import com.ss.android.lark.browser.handler.translate.C29921a;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RemoteServiceImpl(service = AppConfig.class)
public class AppConfigImpl implements AppConfig {
    private Context mContext;

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public List<String> getJSAPIWhiteList() {
        return new ArrayList(C29908a.m110593d().mo107776f());
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public int getSampleTextMaxContentLength() {
        return C29921a.m110626a().mo107783b();
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public Map<String, String> getSchemaHandleList() {
        return new HashMap(C29912b.m110607d().mo107775e());
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public List<String> getSecLinkWhiteList() {
        return new ArrayList(C29908a.m110593d().mo107775e());
    }

    public AppConfigImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public boolean isUrlEnableForWebTranslate(String str) {
        return C29921a.m110626a().mo107782a(str);
    }
}
