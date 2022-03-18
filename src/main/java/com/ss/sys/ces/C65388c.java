package com.ss.sys.ces;

import android.content.Context;
import com.ss.sys.ces.out.ISdk;
import com.ss.sys.ces.out.StcSDKFactory;
import com.ss.sys.ces.p3234e.C65393a;
import com.ss.sys.ces.p3236g.AbstractC65402a;
import com.ss.sys.ces.utils.NetInterface;
import java.util.HashMap;
import java.util.Map;
import p001a.p002a.p003a.p004a.C0007b;
import p001a.p002a.p003a.p005b.C0031d;

/* renamed from: com.ss.sys.ces.c */
public class C65388c implements ISdk {

    /* renamed from: c */
    public static Map<String, Object> f164639c;

    /* renamed from: d */
    private static C65388c f164640d;

    /* renamed from: a */
    private C65389d f164641a;

    /* renamed from: b */
    private Context f164642b;

    private C65388c(Context context) {
        this.f164642b = context;
        this.f164641a = C65389d.m256422a(context);
    }

    /* renamed from: a */
    public static synchronized C65388c m256416a(Context context, long j, int i) {
        synchronized (C65388c.class) {
            C65388c cVar = f164640d;
            if (cVar != null) {
                return cVar;
            }
            if (context == null) {
                context = C65393a.m256450a().getApplicationContext();
            }
            if (context == null) {
                return null;
            }
            C0007b.m14a(i);
            C0007b.m16b((int) j);
            C0031d.m53a(context, "ees");
            C65387b.m256414a(context);
            C65388c cVar2 = new C65388c(context);
            f164640d = cVar2;
            return cVar2;
        }
    }

    /* renamed from: b */
    public static synchronized C65388c m256417b() {
        C65388c cVar;
        synchronized (C65388c.class) {
            cVar = f164640d;
        }
        return cVar;
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void InitSelas() {
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void SetRegionType(int i) {
        C0007b.m14a(i);
    }

    /* renamed from: a */
    public Context mo225028a() {
        return this.f164642b;
    }

    @Override // com.ss.sys.ces.out.ISdk
    public boolean checkSign() {
        try {
            String str = (String) C65386a.metas(137, this.f164642b, null);
            return str == null || !str.equals("1");
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.ss.sys.ces.out.ISdk
    public String debugEntry(Context context, int i) {
        return C65386a.DebugPrint(context, i);
    }

    @Override // com.ss.sys.ces.out.ISdk
    public byte[] encode(byte[] bArr) {
        return C65386a.encode(bArr);
    }

    @Override // com.ss.sys.ces.out.ISdk
    public String onEvent() {
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.sys.ces.out.ISdk
    public String pullSg() {
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.sys.ces.out.ISdk
    public String pullVer(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void reportNow(String str) {
        this.f164641a.mo225045a(str);
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void reportNow(String str, ISdk.reportCallback reportcallback) {
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void setCustomInfo(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            f164639c = hashMap;
        }
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void setEfficientDebug(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void setInterface(NetInterface netInterface) {
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void setNetwork(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void setParams(String str, String str2) {
        setParams(str, str2, true);
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void setParams(String str, String str2, boolean z) {
        synchronized (StcSDKFactory.class) {
            this.f164641a.mo225046a(str, str2, z);
        }
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void setSession(String str) {
        if (str != null && str.length() > 0) {
            AbstractC65402a.m256482a(str);
        }
    }

    @Override // com.ss.sys.ces.out.ISdk
    public void setUrlInterface(int i, String str) {
        if (str != null && str.length() > 0) {
            C0007b.m15a(i, str);
        }
    }
}
