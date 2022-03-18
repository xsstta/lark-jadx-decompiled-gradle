package com.bytedance.ee.bear.list.folderselect.p430a;

import android.content.Context;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.offline.route.parcelable.FolderRouteBean;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.dto.SaveTemplateResult;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.a.e */
public class C8393e<T> implements AbstractC8391c<AbstractC68307f<SaveTemplateResult>> {

    /* renamed from: a */
    private C10917c f22657a;

    /* renamed from: b */
    private Context f22658b;

    /* renamed from: c */
    private String f22659c = "";

    /* renamed from: d */
    private String f22660d = "";

    /* renamed from: e */
    private int f22661e;

    /* renamed from: f */
    private int f22662f;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folderselect.a.e$a */
    public static class C8395a implements NetService.AbstractC5074c {
        private C8395a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<Serializable> parse(String str) throws NetService.ParseException {
            SaveTemplateResult saveTemplateResult = new SaveTemplateResult("", "", "", "");
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    return new SaveTemplateResult(optJSONObject.optString("folder_url"), optJSONObject.optString("folder_token"), optJSONObject.optString("token_list"), "");
                }
                return saveTemplateResult;
            } catch (Exception e) {
                C13479a.m54759a("SaveTemplateCommand", "parse json exception ...", e);
                return new SaveTemplateResult("", "", "", "");
            }
        }
    }

    /* renamed from: c */
    private Map<String, String> m34795c() {
        HashMap hashMap = new HashMap();
        hashMap.put("collection_id", "" + this.f22660d);
        hashMap.put("parent_folder_token", this.f22659c);
        hashMap.put("space_version", "" + this.f22661e);
        return hashMap;
    }

    /* renamed from: a */
    public AbstractC68307f<SaveTemplateResult> mo32841b() {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/use_template_collection/");
        fVar.mo20143a(1);
        fVar.mo20147a(m34795c());
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8395a()).mo20141a(fVar).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$e$ndVpniMvTiFogCQmkw8cujDBuZE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8393e.lambda$ndVpniMvTiFogCQmkw8cujDBuZE(C8393e.this, (SaveTemplateResult) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$e$Qu3FbbaVCtrRv_0w2Rpks9MqXFs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8393e.lambda$Qu3FbbaVCtrRv_0w2Rpks9MqXFs(C8393e.this, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34794a(Throwable th) throws Exception {
        Context context = this.f22658b;
        Toast.showFailureText(context, context.getString(R.string.Doc_List_AddFailedRetry));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34793a(SaveTemplateResult saveTemplateResult) throws Exception {
        Context context = this.f22658b;
        Toast.showSuccessText(context, context.getString(R.string.Doc_List_SaveCustomTemplSuccess), 0);
        new FolderRouteBean().mo20914d(this.f22662f);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/list/folder/activity").mo17308a("owner_type", this.f22662f).mo17314a("url", saveTemplateResult.getUrl()).mo17308a("key_request_code", 16).mo17314a("token", saveTemplateResult.getToken()).mo17317a();
    }

    public C8393e(C10917c cVar, Context context, String str, String str2, int i) {
        int i2 = 1;
        this.f22661e = 1;
        this.f22657a = cVar;
        this.f22658b = context;
        this.f22659c = str;
        this.f22660d = str2;
        this.f22662f = i;
        this.f22661e = FolderVersion.isShareFolderV2(i) ? 2 : i2;
    }
}
