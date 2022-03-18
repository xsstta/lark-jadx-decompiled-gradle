package org.chromium;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;

/* renamed from: org.chromium.d */
public class C70011d implements ICronetDepend {

    /* renamed from: a */
    private static volatile C70011d f174990a;

    /* renamed from: b */
    private ICronetDepend f174991b;

    private C70011d() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        ICronetDepend iCronetDepend = this.f174991b;
        if (iCronetDepend != null) {
            return iCronetDepend.getSsCookieKey();
        }
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        ICronetDepend iCronetDepend = this.f174991b;
        if (iCronetDepend != null) {
            return iCronetDepend.loggerDebug();
        }
        return false;
    }

    /* renamed from: a */
    public static C70011d m268581a() {
        if (f174990a == null) {
            synchronized (C70011d.class) {
                if (f174990a == null) {
                    f174990a = new C70011d();
                }
            }
        }
        return f174990a;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
        this.f174991b = iCronetDepend;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
        ICronetDepend iCronetDepend = this.f174991b;
        if (iCronetDepend != null) {
            iCronetDepend.loggerD(str, str2);
        }
    }
}
