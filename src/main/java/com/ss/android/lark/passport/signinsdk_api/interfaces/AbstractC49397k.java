package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import com.ss.android.lark.setting.export.AbstractC54125a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.k */
public interface AbstractC49397k {
    /* renamed from: A */
    AbstractC49393f mo101384A();

    /* renamed from: B */
    void mo101385B();

    /* renamed from: C */
    List<TenantInfo> mo101386C();

    /* renamed from: D */
    List<TenantInfo.PendingUser> mo101387D();

    /* renamed from: E */
    int mo101388E();

    /* renamed from: F */
    String mo101389F();

    /* renamed from: G */
    boolean mo101390G();

    /* renamed from: H */
    AbstractC49370a mo101391H();

    /* renamed from: I */
    boolean mo101392I();

    /* renamed from: J */
    String mo101393J();

    /* renamed from: K */
    String mo101394K();

    /* renamed from: L */
    IDeviceService mo101395L();

    /* renamed from: M */
    IDeviceManager mo101396M();

    /* renamed from: N */
    AbstractC49390d mo101397N();

    /* renamed from: O */
    AbstractC49384b mo101398O();

    /* renamed from: P */
    ISigninSdkApi mo101399P();

    /* renamed from: Q */
    void mo101400Q();

    /* renamed from: a */
    String mo101402a(String str, String str2);

    /* renamed from: a */
    List<AbstractC54125a> mo101403a(Activity activity);

    /* renamed from: a */
    Map<String, AbstractC29186b> mo101404a(Context context);

    /* renamed from: a */
    void mo101405a();

    /* renamed from: a */
    void mo101406a(Context context, int i, IGetDataCallback<User> iGetDataCallback);

    /* renamed from: a */
    void mo101407a(Context context, Intent intent);

    /* renamed from: a */
    void mo101408a(Context context, JSONObject jSONObject);

    /* renamed from: a */
    void mo101409a(Context context, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo101410a(Context context, TenantInfo tenantInfo);

    /* renamed from: a */
    void mo101411a(Context context, String str);

    /* renamed from: a */
    void mo101412a(Context context, String str, Bundle bundle);

    /* renamed from: a */
    void mo101413a(Context context, String str, IGetDataCallback<C49382d> iGetDataCallback);

    /* renamed from: a */
    void mo101414a(Context context, String str, BaseStepData baseStepData);

    /* renamed from: a */
    void mo101415a(Context context, String str, String str2, AbstractC49402q qVar);

    /* renamed from: a */
    void mo101416a(IGetDataCallback<C49376b> iGetDataCallback);

    /* renamed from: a */
    void mo101417a(AbstractC49352d<String> dVar);

    /* renamed from: a */
    void mo101418a(AbstractC49379a aVar);

    /* renamed from: a */
    void mo101419a(AbstractC49399l lVar);

    /* renamed from: a */
    void mo101420a(AbstractC49400m mVar);

    /* renamed from: a */
    void mo101421a(AbstractC49403r rVar);

    /* renamed from: a */
    void mo101422a(AbstractC49404s sVar);

    /* renamed from: a */
    void mo101423a(AbstractC49405t tVar);

    /* renamed from: a */
    void mo101424a(String str, IGetDataCallback<C49376b> iGetDataCallback);

    /* renamed from: a */
    void mo101425a(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback);

    /* renamed from: a */
    void mo101426a(String str, String str2, String str3, String str4, String str5, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    ILoginManisService mo101427b(Context context);

    /* renamed from: b */
    String mo101428b(String str);

    /* renamed from: b */
    void mo101429b();

    /* renamed from: b */
    void mo101430b(Context context, int i, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    void mo101432b(Context context, String str);

    /* renamed from: b */
    void mo101434b(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    void mo101435b(AbstractC49379a aVar);

    /* renamed from: b */
    void mo101436b(AbstractC49399l lVar);

    /* renamed from: b */
    void mo101437b(AbstractC49400m mVar);

    /* renamed from: b */
    void mo101438b(AbstractC49404s sVar);

    /* renamed from: b */
    void mo101439b(AbstractC49405t tVar);

    /* renamed from: b */
    void mo101440b(String str, String str2);

    /* renamed from: c */
    TenantInfo mo101441c(String str);

    /* renamed from: c */
    void mo101442c(Context context);

    /* renamed from: c */
    boolean mo101443c();

    /* renamed from: d */
    List<User> mo101444d();

    /* renamed from: d */
    void mo101445d(Context context);

    /* renamed from: d */
    void mo101446d(String str);

    /* renamed from: e */
    void mo101447e(Context context);

    /* renamed from: e */
    boolean mo101448e();

    /* renamed from: f */
    User mo101449f();

    /* renamed from: g */
    TenantInfo mo101450g();

    /* renamed from: h */
    void mo101451h();

    /* renamed from: i */
    LoginInfo mo101452i();

    /* renamed from: j */
    String mo101453j();

    /* renamed from: k */
    boolean mo101454k();

    /* renamed from: l */
    String mo101455l();

    /* renamed from: m */
    boolean mo101456m();

    /* renamed from: n */
    AbstractC49389b mo101457n();

    /* renamed from: o */
    IAccountChangeObserver mo101458o();

    /* renamed from: p */
    ILoginService mo101459p();

    /* renamed from: q */
    AbstractC49394g mo101460q();

    /* renamed from: r */
    int mo101461r();

    /* renamed from: s */
    AbstractC49388a mo101462s();

    /* renamed from: t */
    TenantInfo mo101463t();

    /* renamed from: u */
    boolean mo101464u();

    /* renamed from: v */
    void mo101465v();

    /* renamed from: w */
    boolean mo101466w();

    /* renamed from: x */
    String mo101467x();

    /* renamed from: y */
    IQRLoginService mo101468y();

    /* renamed from: z */
    void mo101469z();

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.k$a */
    public static class C49398a {

        /* renamed from: a */
        private final SparseBooleanArray f123938a;

        /* renamed from: a */
        public SparseBooleanArray mo172440a() {
            return this.f123938a;
        }

        public C49398a(SparseBooleanArray sparseBooleanArray) {
            this.f123938a = sparseBooleanArray;
        }
    }
}
