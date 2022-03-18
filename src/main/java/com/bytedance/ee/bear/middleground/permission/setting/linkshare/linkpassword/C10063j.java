package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.j */
public class C10063j implements C10050b.AbstractC10051a {

    /* renamed from: a */
    private NetService f27196a = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: b */
    private Disposable f27197b;

    /* renamed from: c */
    private String f27198c;

    /* renamed from: d */
    private int f27199d;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable = this.f27197b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ NetService.Result m41880a(String str) throws NetService.ParseException {
        return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<String>>() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10063j.C100641 */
        }, new Feature[0]);
    }

    public C10063j(String str, int i) {
        this.f27198c = str;
        this.f27199d = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m41882a(C10050b.AbstractC10051a.AbstractC10052a aVar, Throwable th) throws Exception {
        C13479a.m54759a("PasswordChecker", "checkPassword failed", th);
        aVar.mo38397a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m41881a(C10050b.AbstractC10051a.AbstractC10052a aVar, NetService.Result result) throws Exception {
        if (result.getCode() == 0) {
            aVar.mo38396a();
            return;
        }
        C13479a.m54758a("PasswordChecker", "checkPassword error code: " + result.getCode());
        aVar.mo38397a(new Throwable());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10050b.AbstractC10051a
    /* renamed from: a */
    public void mo38395a(String str, boolean z, C10050b.AbstractC10051a.AbstractC10052a aVar) {
        NetService.C5077f fVar = new NetService.C5077f(LinkPwdAPISelector.m41827c(z));
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", (Object) this.f27198c);
        jSONObject.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(this.f27199d));
        jSONObject.put("password", (Object) str);
        fVar.mo20153c(jSONObject.toJSONString());
        this.f27197b = this.f27196a.mo20117a(new NetService.AbstractC5074c() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$j$iOzhA5GGrZPGky9dIRg68d1TWbo */

            @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
            public final NetService.Result parse(String str) {
                return C10063j.this.m41880a(str);
            }
        }).mo20141a(fVar).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$j$z1cMLLFydmraNL5ZU52cnYiafQk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10063j.m41881a(C10050b.AbstractC10051a.AbstractC10052a.this, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$j$n4KppdRxWh_ype5MJrf8zjoU10 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10063j.m41882a(C10050b.AbstractC10051a.AbstractC10052a.this, (Throwable) obj);
            }
        });
    }
}
