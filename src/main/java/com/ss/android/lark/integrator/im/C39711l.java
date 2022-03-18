package com.ss.android.lark.integrator.im;

import android.content.Context;
import com.larksuite.component.blockit.C24062d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.p1662b.AbstractC33975a;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33991a;
import com.ss.android.lark.dependency.AbstractC36471e;
import com.ss.android.lark.dependency.AbstractC36511z;
import com.ss.android.lark.integrator.im.dependency.AbstractC39578u;
import com.ss.android.lark.integrator.im.dependency.C39558a;
import com.ss.android.lark.integrator.im.dependency.C39565g;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.im.l */
class C39711l implements AbstractC39578u {
    C39711l() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143651a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143650a(String str, AbstractC33991a aVar) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).unRegisterOpenAppListener(str, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143649a(Chat chat, AbstractC33975a aVar) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getAsyncGadgetPlusItems(chat, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: b */
    public AbstractC36471e mo143652b() {
        return new C39558a();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: c */
    public AbstractC36511z mo143654c() {
        return new C39565g();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public C24062d mo143640a() {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getBlockitInstance();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: d */
    public boolean mo143655d() {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).useNewMessageAction();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: b */
    public void mo143653b(Context context) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initCardEnv(context);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143641a(int i) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).preloadProcessFromFeed(i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143642a(Context context) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).preloadProcessFromMessageCard(context);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143648a(Chat chat) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).triggerRefreshCache(chat);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143643a(Context context, String str) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openBulletSchema(context, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143647a(Context context, String str, boolean z) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openAddGroupBotPage(context, str, z);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143644a(Context context, String str, String str2, String str3) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openLittleAppFromFeed(context, str, str2, str3);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143646a(Context context, String str, List<String> list, List<Integer> list2) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openMessageAction(context, str, list, list2);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39578u
    /* renamed from: a */
    public void mo143645a(Context context, String str, String str2, String str3, String str4) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openLittleAppFromFeed(context, str, str2, str3, str4);
    }
}
