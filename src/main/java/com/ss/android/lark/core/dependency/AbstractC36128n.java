package com.ss.android.lark.core.dependency;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49388a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import java.util.List;

/* renamed from: com.ss.android.lark.core.dependency.n */
public interface AbstractC36128n {
    /* renamed from: A */
    boolean mo133042A();

    /* renamed from: B */
    String mo133043B();

    /* renamed from: C */
    int mo133044C();

    /* renamed from: D */
    boolean mo133045D();

    /* renamed from: E */
    List<User> mo133046E();

    /* renamed from: F */
    User mo133047F();

    /* renamed from: G */
    TenantInfo mo133048G();

    /* renamed from: H */
    int mo133049H();

    /* renamed from: I */
    List<TenantInfo.PendingUser> mo133050I();

    /* renamed from: a */
    Fragment mo133051a(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    TenantInfo mo133052a(String str);

    /* renamed from: a */
    String mo133053a(String str, String str2);

    /* renamed from: a */
    void mo133054a(Context context, int i, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo133055a(Context context, Intent intent);

    /* renamed from: a */
    void mo133056a(Context context, JSONObject jSONObject);

    /* renamed from: a */
    void mo133057a(Context context, IGetDataCallback<DeviceId> iGetDataCallback);

    /* renamed from: a */
    void mo133058a(Context context, TenantInfo tenantInfo);

    /* renamed from: a */
    void mo133059a(Context context, String str);

    /* renamed from: a */
    void mo133060a(Context context, String str, Bundle bundle);

    /* renamed from: a */
    void mo133061a(Context context, String str, IGetDataCallback<C49382d> iGetDataCallback);

    /* renamed from: a */
    void mo133062a(Context context, String str, BaseStepData baseStepData);

    /* renamed from: a */
    void mo133063a(IGetDataCallback<C49376b> iGetDataCallback);

    /* renamed from: a */
    void mo133064a(AbstractC49379a aVar);

    /* renamed from: a */
    void mo133065a(AbstractC49399l lVar);

    /* renamed from: a */
    void mo133066a(AbstractC49400m mVar);

    /* renamed from: a */
    void mo133067a(AbstractC49404s sVar);

    /* renamed from: a */
    void mo133068a(AbstractC49405t tVar);

    /* renamed from: a */
    void mo133069a(String str, int i);

    /* renamed from: a */
    void mo133070a(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo133071a(String str, String str2, String str3, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo133072a();

    /* renamed from: b */
    void mo133073b(Context context, int i, IGetDataCallback<User> iGetDataCallback);

    /* renamed from: b */
    void mo133074b(Context context, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    void mo133075b(Context context, String str);

    /* renamed from: b */
    void mo133076b(AbstractC49379a aVar);

    /* renamed from: b */
    void mo133077b(AbstractC49400m mVar);

    /* renamed from: b */
    void mo133078b(AbstractC49405t tVar);

    /* renamed from: b */
    void mo133079b(String str);

    /* renamed from: b */
    void mo133080b(String str, IGetDataCallback<C49376b> iGetDataCallback);

    /* renamed from: b */
    void mo133081b(String str, String str2);

    /* renamed from: b */
    boolean mo133082b();

    /* renamed from: c */
    int mo133083c();

    /* renamed from: c */
    void mo133084c(String str, IGetDataCallback<SessionResult> iGetDataCallback);

    /* renamed from: d */
    String mo133085d();

    /* renamed from: e */
    String mo133086e();

    /* renamed from: f */
    TenantInfo mo133087f();

    /* renamed from: g */
    String mo133088g();

    /* renamed from: h */
    boolean mo133089h();

    /* renamed from: i */
    String mo133090i();

    /* renamed from: j */
    String mo133091j();

    /* renamed from: k */
    ISigninSdkApi mo133092k();

    /* renamed from: l */
    IQRLoginService mo133093l();

    /* renamed from: m */
    AbstractC49389b mo133094m();

    /* renamed from: n */
    IAccountChangeObserver mo133095n();

    /* renamed from: o */
    AbstractC49390d mo133096o();

    /* renamed from: p */
    IDeviceService mo133097p();

    /* renamed from: q */
    IDeviceManager mo133098q();

    /* renamed from: r */
    AbstractC49394g mo133099r();

    /* renamed from: s */
    ILoginService mo133100s();

    /* renamed from: t */
    AbstractC49370a mo133101t();

    /* renamed from: u */
    AbstractC49388a mo133102u();

    /* renamed from: v */
    void mo133103v();

    /* renamed from: w */
    boolean mo133104w();

    /* renamed from: x */
    AbstractC49384b mo133105x();

    /* renamed from: y */
    List<TenantInfo> mo133106y();

    /* renamed from: z */
    AbstractC49393f mo133107z();
}
