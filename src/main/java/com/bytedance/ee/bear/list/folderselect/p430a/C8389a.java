package com.bytedance.ee.bear.list.folderselect.p430a;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.a.a */
public class C8389a<T> implements AbstractC8391c<AbstractC68307f<SimpleRequestResult>> {

    /* renamed from: a */
    private final C10917c f22640a;

    /* renamed from: b */
    private final Context f22641b;

    /* renamed from: c */
    private final String f22642c;

    /* renamed from: d */
    private final int f22643d;

    /* renamed from: e */
    private final String f22644e;

    /* renamed from: c */
    private String m34777c() {
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", this.f22642c);
        hashMap.put("obj_type", Integer.valueOf(this.f22643d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hashMap);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("parent_token", (Object) this.f22644e);
        jSONObject.put("entities", (Object) arrayList);
        return jSONObject.toJSONString();
    }

    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo32841b() {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/explorer/v2/create/shortcut/");
        fVar.mo20143a(1);
        fVar.mo20153c(m34777c());
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$a$nhPP_odY9IClutNdwDSXsR2RLZU.INSTANCE).mo20141a(fVar).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$a$sUrDoi9sSWGiknMOHsl3OidlCU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8389a.this.m34775a((C8389a) ((SimpleRequestResult) obj));
            }
        }).mo237988a((Consumer<? super Throwable>) new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$a$LUScmPQir_tcuu2UYaUBekYSJE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8389a.this.m34776a((C8389a) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SimpleRequestResult m34774a(String str) throws NetService.ParseException {
        return (SimpleRequestResult) JSON.parseObject(str, SimpleRequestResult.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34775a(SimpleRequestResult simpleRequestResult) throws Exception {
        C13479a.m54764b("AddShortCutCommand", "doOnNext()...");
        Context context = this.f22641b;
        Toast.showSuccessText(context, context.getString(R.string.Doc_Facade_CreateSuccessfully));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34776a(Throwable th) throws Exception {
        C13479a.m54758a("AddShortCutCommand", "doOnError()...throwable = " + th);
        Context context = this.f22641b;
        Toast.showFailureText(context, context.getString(R.string.Doc_List_TemplateGeneralErrorToast));
    }

    public C8389a(C10917c cVar, Context context, String str, int i, String str2) {
        this.f22640a = cVar;
        this.f22641b = context;
        this.f22642c = str;
        this.f22643d = i;
        this.f22644e = str2;
    }
}
