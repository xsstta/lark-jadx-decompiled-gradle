package com.ss.android.lark.meego_api;

import android.content.Context;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import java.util.Map;
import org.json.JSONArray;

public interface IMeegoApi {
    Map<String, AbstractC29186b> getAppLinkHandlers(Context context);

    Map<String, String> getAutoInitModuleConfigMap();

    Map<String, Boolean> getFeatureGatingMap();

    IPlusItem getProjectKbPlusItem(Chat chat);

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    void initData();

    void initProcessorDoInit(String str);

    boolean isMeegoEnable();

    void openDebugPage(Context context);

    void openMeegoToCreateProject(String str, Chat chat, JSONArray jSONArray);

    void setDevEnv(String str, String str2);
}
