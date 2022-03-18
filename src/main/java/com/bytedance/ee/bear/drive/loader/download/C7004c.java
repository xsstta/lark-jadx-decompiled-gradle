package com.bytedance.ee.bear.drive.loader.download;

import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.c */
public class C7004c {
    /* renamed from: a */
    public static boolean m27901a(Throwable th) {
        if (!(th instanceof DriveException)) {
            return false;
        }
        ErrCode errorCode = ((DriveException) th).getErrorCode();
        if (errorCode == ErrCode.REQUEST_FILE_INFO_EXP || errorCode == ErrCode.REQUEST_PREVIEW_URL_EXP || errorCode == ErrCode.REQUEST_TRANSFORM_UNKNOW_EXP || errorCode == ErrCode.REQUEST_TRANSFORM_CANCEL_EXP || errorCode == ErrCode.NO_NETWORK || errorCode == ErrCode.REQUEST_TRANSFORM_SERVER_EXP) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m27903b(Throwable th) {
        if (!(th instanceof DriveException)) {
            return false;
        }
        ErrCode errorCode = ((DriveException) th).getErrorCode();
        if (errorCode == ErrCode.FILE_NOT_CHANGED || errorCode == ErrCode.MANUAL_CACHE_NEED_WIFI || errorCode == ErrCode.CACHE_FILE_MODEL_NOT_FOUND || errorCode == ErrCode.FILE_DATA_VERSION_CHANGED || errorCode == ErrCode.PRELOAD_SIZE_TOO_LARGE || errorCode == ErrCode.MOBILE_NETWORK_NOT_AUTHORIZATION || errorCode == ErrCode.PROCESSOR_CACHE_MISS || errorCode == ErrCode.WPS_PREVIEW_EXP || errorCode == ErrCode.NO_NETWORK) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m27905d(C7128a aVar, DriveException driveException, String str, int i) {
        if (driveException.getErrorCode() != ErrCode.RUST_SUBMIT_ERROR) {
            return false;
        }
        aVar.mo27890a("rustFail", "DEC8", str, i, C7128a.m28540a(driveException));
        return true;
    }

    /* renamed from: b */
    private static boolean m27902b(C7128a aVar, DriveException driveException, String str, int i) {
        switch (C70051.f18936a[driveException.getErrorCode().ordinal()]) {
            case 8:
            case 9:
                C13479a.m54758a("DRIVE_PREVIEW_FLOW", "RequestTransformCancelException");
                return true;
            case 10:
                C13479a.m54758a("DRIVE_PREVIEW_FLOW", "REQUEST_TRANSFORM_FILE_ENCRYPTION");
                return true;
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
            case 13:
                aVar.mo27890a("nativeFail", "DEC6", str, i, C7128a.m28540a(driveException));
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    private static boolean m27904c(C7128a aVar, DriveException driveException, String str, int i) {
        switch (driveException.getErrorCode()) {
            case DRIVE_FILE_NOT_SUPPORT_PREVIEW:
                aVar.mo27889a("serverFail", "DEC11", str, i);
                return true;
            case DRIVE_FILE_ZERO_SIZE:
                aVar.mo27889a("nativeFail", "DEC13", str, i);
                return true;
            case DRIVE_FILE_OVER_SIZE:
                aVar.mo27889a("nativeFail", "DEC12", str, i);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m27898a(C7128a aVar, Throwable th, String str, int i) {
        C13479a.m54758a("ErrReportHandler", "ErrReportHandler handle err, sourceType: " + i + ", err: " + th);
        if (!m27903b(th)) {
            boolean z = false;
            if (th instanceof DriveException) {
                DriveException driveException = (DriveException) th;
                if (m27900a(aVar, driveException, str, i) || m27902b(aVar, driveException, str, i) || m27904c(aVar, driveException, str, i) || m27905d(aVar, driveException, str, i)) {
                    z = true;
                }
            }
            if (!z) {
                aVar.mo27890a("nativeFail", "unknown", str, i, C7128a.m28540a(th));
            }
        }
    }

    /* renamed from: a */
    private static boolean m27900a(C7128a aVar, DriveException driveException, String str, int i) {
        switch (C70051.f18936a[driveException.getErrorCode().ordinal()]) {
            case 1:
                aVar.mo27889a("nativeFail", "DEC27", str, i);
                return true;
            case 2:
                aVar.mo27889a("nativeFail", "DEC16", str, i);
                return true;
            case 3:
                aVar.mo27889a("nativeFail", "DEC4", str, i);
                return true;
            case 4:
                aVar.mo27889a("nativeFail", "DEC15", str, i);
                return true;
            case 5:
                aVar.mo27890a("nativeFail", "DEC5", str, i, C7128a.m28540a(driveException));
                return true;
            case 6:
                aVar.mo27890a("nativeFail", "DEC32", str, i, C7128a.m28540a(driveException));
                return true;
            case 7:
                aVar.mo27890a("nativeFail", "DEC31", str, i, C7128a.m28540a(driveException));
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m27899a(C7128a aVar, Throwable th, String str, int i, boolean z) {
        if (!z || !m27901a(th)) {
            m27898a(aVar, th, str, i);
        } else {
            aVar.mo27890a("nativeFail", "DEC30", str, i, C7128a.m28540a(th));
        }
    }
}
