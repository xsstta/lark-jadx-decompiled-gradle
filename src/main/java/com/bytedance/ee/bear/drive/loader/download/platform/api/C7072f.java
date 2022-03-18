package com.bytedance.ee.bear.drive.loader.download.platform.api;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.drive.common.DriveNetUtils;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.net.CloudReqFun;
import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import com.bytedance.ee.log.C13479a;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.f */
public class C7072f {

    /* renamed from: a */
    private static final Pattern f19034a = Pattern.compile("-102|-103|-105|-118|-106|-109|-192|-193|-194|-195|-207");

    /* renamed from: b */
    public static boolean m28123b(Throwable th) {
        return C5203d.m21235a(th, 4);
    }

    /* renamed from: d */
    public static boolean m28125d(Throwable th) {
        return C5203d.m21235a(th, 3);
    }

    /* renamed from: e */
    public static boolean m28126e(Throwable th) {
        return C5203d.m21235a(th, 1002);
    }

    /* renamed from: f */
    public static boolean m28127f(Throwable th) {
        return C5203d.m21235a(th, 90001071);
    }

    /* renamed from: g */
    public static boolean m28128g(Throwable th) {
        return C5203d.m21235a(th, 90001072);
    }

    /* renamed from: c */
    public static boolean m28124c(Throwable th) {
        if (C5203d.m21235a(th, 10009) || C5203d.m21235a(th, 10013)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m28122a(Throwable th) {
        boolean z;
        boolean z2 = true;
        if (th instanceof CloudReqFun.OkHttpReqException) {
            Exception exc = ((CloudReqFun.OkHttpReqException) th).exceptionObj;
            if ((exc instanceof RustIOException) && "Offline".equalsIgnoreCase(exc.getMessage())) {
                z = true;
                if (!z && DriveNetUtils.m27237a()) {
                    z = true;
                }
                if (z || TextUtils.isEmpty(th.getMessage()) || !f19034a.matcher(th.getMessage()).find()) {
                    z2 = z;
                }
                C13479a.m54764b("DriveComponent", "isNoNetwork()=" + z2);
                return z2;
            }
        }
        z = false;
        z = true;
        z2 = z;
        C13479a.m54764b("DriveComponent", "isNoNetwork()=" + z2);
        return z2;
    }

    /* renamed from: a */
    public static DriveException m28121a(Throwable th, ErrCode errCode) {
        if (m28125d(th)) {
            return new DriveException(ErrCode.FILE_NOT_FOUND);
        }
        if (m28123b(th)) {
            return new DriveException(ErrCode.PERMISSION_DENIED);
        }
        if (m28124c(th)) {
            return new DriveException(ErrCode.POLICY_DENIED);
        }
        if (m28126e(th)) {
            return new DriveException(ErrCode.OWNER_DELETED_FILE);
        }
        if (C5203d.m21235a(th, 90002104)) {
            return new DriveException(ErrCode.STATIC_RESOURCE_FROZEN_BY_ADMIN);
        }
        if (C5203d.m21235a(th, 90002105)) {
            return new DriveException(ErrCode.STATIC_RESOURCE_SHREDDED_BY_ADMIN);
        }
        if (m28127f(th)) {
            return new DriveException(ErrCode.COPY_TIMEOUT);
        }
        if (m28128g(th)) {
            return new DriveException(ErrCode.COPY_FAILED);
        }
        if (m28122a(th)) {
            return new DriveException(ErrCode.NO_NETWORK);
        }
        return new DriveException(errCode, th);
    }
}
