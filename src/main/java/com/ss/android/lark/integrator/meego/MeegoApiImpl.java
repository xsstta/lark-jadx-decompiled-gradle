package com.ss.android.lark.integrator.meego;

import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.meego_api.IMeegoApi;
import com.ss.android.lark.p2567s.p2568a.p2575g.C53207a;
import com.ss.android.lark.p2567s.p2568a.p2575g.C53208b;
import java.util.Map;
import org.json.JSONArray;

@ClaymoreImpl(IMeegoApi.class)
public class MeegoApiImpl implements IMeegoApi {
    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53207a.f131542a;
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53207a.f131543b;
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53207a.f131544c;
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public void initData() {
        MeegoModuleProvider.m158204a().mo158732b();
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public Map<String, Boolean> getFeatureGatingMap() {
        return MeegoModuleProvider.m158204a().mo158728a();
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public boolean isMeegoEnable() {
        return MeegoModuleProvider.m158204a().mo158734c();
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public void initProcessorDoInit(String str) {
        C53208b.m205844a(str);
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public void openDebugPage(Context context) {
        MeegoModuleProvider.m158204a().mo158733b(context);
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public Map<String, AbstractC29186b> getAppLinkHandlers(Context context) {
        return MeegoModuleProvider.m158204a().mo158729a(context);
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public IPlusItem getProjectKbPlusItem(Chat chat) {
        return MeegoModuleProvider.m158204a().mo158727a(chat);
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public void setDevEnv(String str, String str2) {
        MeegoModuleProvider.m158204a().mo158731a(str, str2);
    }

    @Override // com.ss.android.lark.meego_api.IMeegoApi
    public void openMeegoToCreateProject(String str, Chat chat, JSONArray jSONArray) {
        MeegoModuleProvider.m158204a().mo158730a(str, chat, jSONArray);
    }
}
