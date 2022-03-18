package com.ss.android.lark.fcm_download;

import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency;", "", "getLoginUserId", "", "getPassportDependency", "Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency$IPassportDependency;", "isFCMPluginEnabled", "", "IPassportDependency", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.fcm_download.b */
public interface IFCMDownModuleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency$IPassportDependency;", "", "getDeviceService", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IDeviceService;", "isLogin", "", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.b$a */
    public interface IPassportDependency {
        /* renamed from: a */
        boolean mo133164a();

        /* renamed from: b */
        IDeviceService mo133165b();
    }

    /* renamed from: a */
    boolean mo133161a();

    /* renamed from: b */
    String mo133162b();

    /* renamed from: c */
    IPassportDependency mo133163c();
}
