package com.bytedance.ee.bear.list.folderselect.p430a;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.a.b */
public class C8390b<T> implements AbstractC8391c<AbstractC68307f<SimpleRequestResult>> {

    /* renamed from: a */
    private final C10917c f22645a;

    /* renamed from: b */
    private final Context f22646b;

    /* renamed from: c */
    private final String f22647c;

    /* renamed from: d */
    private final String f22648d;

    /* renamed from: e */
    private final String f22649e;

    /* renamed from: f */
    private final String f22650f;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m34783c() {
        Context context = this.f22646b;
        Toast.showFailureText(context, context.getString(R.string.Doc_List_AddFailedRetry));
    }

    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo32841b() {
        NetService.C5076e fVar = new NetService.C5077f("/api/explorer/object/archive/");
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", this.f22647c);
        hashMap.put("dest_token", this.f22649e);
        fVar.mo20143a(1);
        fVar.mo20147a(hashMap);
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$b$uMPzshQdBGeH473DlJKDMc7lvA.INSTANCE).mo20141a(fVar).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$b$bye7dCGJ7dlm4yT3NJi8FSU33Ts */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8390b.this.m34781a((C8390b) ((SimpleRequestResult) obj));
            }
        }).mo237988a((Consumer<? super Throwable>) new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$b$Yeq4C_Rk4YFagA1oVuWKyHTxUHI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8390b.this.m34782a((C8390b) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SimpleRequestResult m34780a(String str) throws NetService.ParseException {
        return (SimpleRequestResult) JSON.parseObject(str, SimpleRequestResult.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34781a(SimpleRequestResult simpleRequestResult) throws Exception {
        C13479a.m54764b("AddToCommand", "doOnNext()...");
        Context context = this.f22646b;
        Toast.showSuccessText(context, context.getString(R.string.Doc_List_AddSuccessfully), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34782a(Throwable th) throws Exception {
        C13479a.m54758a("AddToCommand", "doOnError()...throwable = " + th);
        if (th instanceof NetService.ServerErrorException) {
            int code = ((NetService.ServerErrorException) th).getCode();
            if (((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39496a(code)) {
                ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39498a(this.f22646b.getApplicationContext(), code, new Runnable() {
                    /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$b$flpo_brZHsvWESmDV2RR1Ao91c */

                    public final void run() {
                        C8390b.this.m34783c();
                    }
                });
            } else if (code == 4104) {
                Context context = this.f22646b;
                Toast.showFailureText(context, C10539a.m43639a(context, R.string.Doc_Permission_AddToNoPermission, "file_name", this.f22648d));
            } else if (code == 4) {
                Context context2 = this.f22646b;
                Toast.showFailureText(context2, C10539a.m43639a(context2, R.string.Doc_Permission_AddToNoPermission, "file_name", this.f22650f));
            } else if (code == 4202) {
                Toast.showFailureText(this.f22646b, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            }
        } else {
            Context context3 = this.f22646b;
            Toast.showFailureText(context3, context3.getString(R.string.Doc_List_AddFailedRetry));
        }
    }

    public C8390b(C10917c cVar, Context context, String str, String str2, String str3, String str4) {
        this.f22645a = cVar;
        this.f22646b = context;
        this.f22647c = str;
        this.f22648d = str2;
        this.f22649e = str3;
        this.f22650f = str4;
    }
}
