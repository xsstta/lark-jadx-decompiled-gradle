package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IDeviceManager {

    @Retention(RetentionPolicy.SOURCE)
    public @interface LKP_LAUNCH_MODE {
    }

    /* renamed from: a */
    DevicesStatus.DeviceStatus mo171022a(String str);

    /* renamed from: a */
    void mo171023a(IGetDataCallback<Devices> iGetDataCallback);

    /* renamed from: a */
    void mo171026a(DevicesStatus devicesStatus);

    /* renamed from: a */
    void mo171027a(boolean z);

    /* renamed from: a */
    boolean mo171028a(Context context);

    /* renamed from: b */
    void mo171031b(boolean z);

    /* renamed from: b */
    boolean mo171032b();

    /* renamed from: c */
    void mo171035c(boolean z);

    /* renamed from: e */
    int mo171037e();

    /* renamed from: g */
    boolean mo171039g();

    /* renamed from: h */
    boolean mo171040h();

    /* renamed from: i */
    boolean mo171041i();
}
