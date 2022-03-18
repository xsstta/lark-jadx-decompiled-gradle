package com.ss.android.lark.integrator.im.dependency;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49403r;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.dependency.v */
public interface AbstractC39579v {
    /* renamed from: a */
    void mo143656a(Activity activity);

    /* renamed from: a */
    void mo143657a(Context context);

    /* renamed from: a */
    void mo143658a(Context context, IGetDataCallback<DeviceId> iGetDataCallback);

    /* renamed from: a */
    void mo143659a(Context context, String str, String str2, AbstractC49402q qVar);

    /* renamed from: a */
    void mo143660a(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo143661a(C28513a.AbstractC28514a aVar);

    /* renamed from: a */
    void mo143662a(AbstractC49379a aVar);

    /* renamed from: a */
    void mo143663a(AbstractC49399l lVar);

    /* renamed from: a */
    void mo143664a(AbstractC49400m mVar);

    /* renamed from: a */
    void mo143665a(AbstractC49403r rVar);

    /* renamed from: a */
    void mo143666a(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback);

    /* renamed from: a */
    boolean mo143667a();

    /* renamed from: b */
    String mo143668b();

    /* renamed from: b */
    void mo143669b(AbstractC49379a aVar);

    /* renamed from: b */
    void mo143670b(AbstractC49399l lVar);

    /* renamed from: b */
    void mo143671b(AbstractC49400m mVar);

    /* renamed from: c */
    String mo143672c();

    /* renamed from: d */
    TenantInfo mo143673d();

    /* renamed from: e */
    String mo143674e();

    /* renamed from: f */
    boolean mo143675f();

    /* renamed from: g */
    String mo143676g();

    /* renamed from: h */
    boolean mo143677h();

    /* renamed from: i */
    AbstractC49389b mo143678i();

    /* renamed from: j */
    IAccountChangeObserver mo143679j();

    /* renamed from: k */
    IDeviceService mo143680k();

    /* renamed from: l */
    IDeviceManager mo143681l();

    /* renamed from: m */
    ILoginService mo143682m();

    /* renamed from: n */
    List<TenantInfo> mo143683n();

    /* renamed from: o */
    int mo143684o();

    /* renamed from: p */
    List<TenantInfo.PendingUser> mo143685p();

    /* renamed from: q */
    AbstractC49393f mo143686q();

    /* renamed from: r */
    boolean mo143687r();

    /* renamed from: s */
    int mo143688s();
}
