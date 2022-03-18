package com.bytedance.ee.bear.contract.net;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.contract.net.d */
public class C5203d {
    /* renamed from: b */
    public static String m21236b(Throwable th) {
        if (th instanceof NetService.ServerErrorException) {
            return ((NetService.ServerErrorException) th).getMsg();
        }
        return th.getMessage();
    }

    /* renamed from: a */
    public static int m21234a(Throwable th) {
        if (!(th instanceof NetService.ServerErrorException)) {
            return -1;
        }
        int code = ((NetService.ServerErrorException) th).getCode();
        C13479a.m54764b("ServerErrorCode", "exceptionToCode(): code = " + code);
        if (code != 0) {
            return code;
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m21235a(Throwable th, int i) {
        if (!(th instanceof NetService.ServerErrorException)) {
            return false;
        }
        int code = ((NetService.ServerErrorException) th).getCode();
        C13479a.m54764b("ServerErrorCode", "isErrorCodeEqual(): code = " + code);
        if (code == i) {
            return true;
        }
        return false;
    }
}
