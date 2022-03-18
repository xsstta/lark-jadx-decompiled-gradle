package com.bytedance.ee.larkbrand.menu;

import android.os.Build;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.larkbrand.menu.f */
public class C13141f extends AbstractC67457c implements AbstractC13135b {

    /* renamed from: a */
    private boolean f34846a;

    /* renamed from: com.bytedance.ee.larkbrand.menu.f$a */
    public interface AbstractC13143a {
        /* renamed from: a */
        void mo49197a(SendHttpResponse sendHttpResponse, C13144b bVar);

        /* renamed from: a */
        void mo49198a(ErrorResult errorResult, C13144b bVar);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Override // com.bytedance.ee.larkbrand.menu.AbstractC13135b
    /* renamed from: a */
    public boolean mo49188a() {
        return this.f34846a;
    }

    /* renamed from: d */
    private SendHttpRequest.C15253a m53741d() {
        return new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.POST).mo55529a(m53740c()).mo55527a((Integer) 30);
    }

    /* renamed from: e */
    private String m53742e() {
        return m53737a("https://", LarkExtensionManager.getInstance().getExtension().mo49585a(DomainSettings.Alias.OPEN_APPCENTER3), "/lark/workplace/api/AddCommonItem");
    }

    /* renamed from: f */
    private String m53743f() {
        return m53737a("https://", LarkExtensionManager.getInstance().getExtension().mo49585a(DomainSettings.Alias.OPEN_APPCENTER3), "/lark/workplace/api/DeleteCommonItem");
    }

    /* renamed from: g */
    private String m53744g() {
        return m53737a("https://", LarkExtensionManager.getInstance().getExtension().mo49585a(DomainSettings.Alias.OPEN_APPCENTER3), "/lark/workplace/api/IsCommonItem");
    }

    /* renamed from: b */
    private String m53739b() {
        return "Mozilla/5.0 " + "(Android)" + ' ' + Build.BRAND + ' ' + Build.MODEL;
    }

    /* renamed from: c */
    private HashMap<String, String> m53740c() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Cookie", "session=" + LarkExtensionManager.getInstance().getExtension().mo49565b());
        hashMap.put("User-Agent", m53739b());
        return hashMap;
    }

    public C13141f(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.bytedance.ee.larkbrand.menu.AbstractC13135b
    /* renamed from: a */
    public void mo49187a(boolean z) {
        this.f34846a = z;
    }

    /* renamed from: com.bytedance.ee.larkbrand.menu.f$b */
    public class C13144b {

        /* renamed from: a */
        public String f34850a;

        public C13144b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SendHttpResponse m53736a(byte[] bArr) throws IOException {
        return SendHttpResponse.ADAPTER.decode(bArr);
    }

    @Override // com.bytedance.ee.larkbrand.menu.AbstractC13135b
    /* renamed from: a */
    public void mo49186a(String str, AbstractC13143a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appId", str);
        String jsonObject2 = jsonObject.toString();
        String g = m53744g();
        m53738a(m53741d().mo55528a(g).mo55533c(jsonObject2), g, aVar);
    }

    @Override // com.bytedance.ee.larkbrand.menu.AbstractC13135b
    /* renamed from: b */
    public void mo49189b(String str, AbstractC13143a aVar) {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(str);
        jsonObject.add("appIds", jsonArray);
        String jsonObject2 = jsonObject.toString();
        String e = m53742e();
        m53738a(m53741d().mo55528a(e).mo55533c(jsonObject2), e, aVar);
    }

    @Override // com.bytedance.ee.larkbrand.menu.AbstractC13135b
    /* renamed from: c */
    public void mo49190c(String str, AbstractC13143a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appId", str);
        String jsonObject2 = jsonObject.toString();
        String f = m53743f();
        m53738a(m53741d().mo55528a(f).mo55533c(jsonObject2), f, aVar);
    }

    /* renamed from: a */
    private String m53737a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: a */
    private void m53738a(SendHttpRequest.C15253a aVar, final String str, final AbstractC13143a aVar2) {
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, aVar, new UIGetDataCallback(new IGetDataCallback<SendHttpResponse>() {
            /* class com.bytedance.ee.larkbrand.menu.C13141f.C131421 */

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                C13144b bVar = new C13144b();
                bVar.f34850a = str;
                aVar2.mo49197a(sendHttpResponse, bVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C13144b bVar = new C13144b();
                bVar.f34850a = str;
                aVar2.mo49198a(errorResult, bVar);
            }
        }), $$Lambda$f$m39PkpBOoF0btSRhakvvk4CJvWA.INSTANCE);
    }
}
