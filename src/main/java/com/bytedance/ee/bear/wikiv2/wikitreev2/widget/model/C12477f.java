package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import com.bytedance.ee.bear.contract.NetService;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.f */
public final class C12477f {
    /* renamed from: a */
    public static boolean m51913a(Throwable th) {
        int b = m51915b(th);
        if (b == 920004003 || b == 920004004 || b == 920004007 || b == 920004012) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m51915b(Throwable th) {
        NetService.ServerErrorException serverErrorException;
        int code;
        if (th instanceof NetService.ServerErrorException) {
            serverErrorException = (NetService.ServerErrorException) th;
        } else if (th.getCause() == null || !(th.getCause() instanceof NetService.ServerErrorException)) {
            serverErrorException = null;
        } else {
            serverErrorException = (NetService.ServerErrorException) th.getCause();
        }
        if (serverErrorException == null || (code = serverErrorException.getCode()) == 0) {
            return -1;
        }
        return code;
    }

    /* renamed from: a */
    public static boolean m51914a(Throwable th, int i) {
        if (m51915b(th) == i) {
            return true;
        }
        return false;
    }
}
