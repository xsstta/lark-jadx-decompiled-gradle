package com.bytedance.ee.bear.list.folderselect.p430a;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.a.d */
public class C8392d<T> implements AbstractC8391c<AbstractC68307f<SimpleRequestResult>> {

    /* renamed from: a */
    private final C10917c f22651a;

    /* renamed from: b */
    private final Context f22652b;

    /* renamed from: c */
    private final String f22653c;

    /* renamed from: d */
    private final String f22654d;

    /* renamed from: e */
    private final String f22655e;

    /* renamed from: f */
    private final boolean f22656f;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m34790c() {
        Context context = this.f22652b;
        Toast.showFailureText(context, context.getString(R.string.Doc_List_MoveFailedRetry));
    }

    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo32841b() {
        String str;
        NetService netService = (NetService) KoinJavaComponent.m268610a(NetService.class);
        HashMap hashMap = new HashMap();
        hashMap.put("src_token", this.f22653c);
        hashMap.put("dest_token", this.f22654d);
        if (this.f22656f) {
            str = "/space/api/explorer/v2/move/";
        } else {
            str = "/space/api/explorer/move/";
        }
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(1);
        fVar.mo20147a(hashMap);
        return netService.mo20117a($$Lambda$d$o_Yc3SijwkQIMgO8gH8nyuKDaDs.INSTANCE).mo20141a(fVar).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$d$wzfXfHd4W4KBqNaL1gMPXeUpVqc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8392d.this.m34788a((C8392d) ((SimpleRequestResult) obj));
            }
        }).mo237988a((Consumer<? super Throwable>) new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$d$OM61I6JZFhkyjUzxXSOkPi4lCJk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8392d.this.m34789a((C8392d) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SimpleRequestResult m34787a(String str) throws NetService.ParseException {
        return (SimpleRequestResult) JSON.parseObject(str, SimpleRequestResult.class);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m34788a(SimpleRequestResult simpleRequestResult) throws Exception {
        C13479a.m54764b("MoveToCommand", "doOnNext()...");
        Context context = this.f22652b;
        Toast.showSuccessText(context, context.getString(R.string.Doc_List_MoveSuccessfully), 0);
        C8674q.m36243f().mo33645a(this.f22653c, this.f22654d);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m34789a(Throwable th) throws Exception {
        C13479a.m54758a("MoveToCommand", "doOnError()...throwable = " + th);
        if (th instanceof NetService.ServerErrorException) {
            int code = ((NetService.ServerErrorException) th).getCode();
            if (((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39496a(code)) {
                ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39498a(this.f22652b.getApplicationContext(), code, new Runnable() {
                    /* class com.bytedance.ee.bear.list.folderselect.p430a.$$Lambda$d$6SLgG_vbLq8WbgcrdmgTjabhKVg */

                    public final void run() {
                        C8392d.this.m34790c();
                    }
                });
            } else if (code == 4103) {
                Context context = this.f22652b;
                Toast.showFailureText(context, context.getString(R.string.Doc_List_MoveFailedCantMoveToShare));
            } else if (code == 4104 || code == 4) {
                Context context2 = this.f22652b;
                Toast.showFailureText(context2, C10539a.m43639a(context2, R.string.Doc_Permission_MoveToNoPermission, "file_name", this.f22655e));
            } else if (code == 4202) {
                Toast.showFailureText(this.f22652b, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            }
        } else {
            Context context3 = this.f22652b;
            Toast.showFailureText(context3, context3.getString(R.string.Doc_List_MoveFailedRetry));
        }
    }

    public C8392d(C10917c cVar, Context context, String str, String str2, String str3, boolean z) {
        this.f22651a = cVar;
        this.f22652b = context;
        this.f22653c = str;
        this.f22654d = str2;
        this.f22655e = str3;
        this.f22656f = z;
    }
}
