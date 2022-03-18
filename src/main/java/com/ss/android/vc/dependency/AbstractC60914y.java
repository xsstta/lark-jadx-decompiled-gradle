package com.ss.android.vc.dependency;

import android.content.Context;
import com.ss.android.vc.meeting.module.preview.guest.MeetingPreviewGuestModel;

/* renamed from: com.ss.android.vc.dependency.y */
public interface AbstractC60914y {
    /* renamed from: b */
    String mo196420b();

    /* renamed from: c */
    boolean mo196421c();

    String getPassportHost();

    String getSession();

    String getTenantId();

    void guestLogin(Context context, String str, String str2, MeetingPreviewGuestModel.IGuestLoginCallback iGuestLoginCallback);

    boolean isCustomer();

    boolean isLogin();

    void logoutWithoutLogin(Context context, boolean z, String str, MeetingPreviewGuestModel.ILogoutCallback iLogoutCallback);

    void registerAccountInterceptor(IAccountInterceptor iAccountInterceptor);

    void registerChangeObserver(AbstractC60885b bVar);

    void simplifyLogin(Context context, String str, String str2);
}
