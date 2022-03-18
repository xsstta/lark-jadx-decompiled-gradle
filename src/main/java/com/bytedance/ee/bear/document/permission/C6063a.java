package com.bytedance.ee.bear.document.permission;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.document.permission.a */
public class C6063a {

    /* renamed from: a */
    private ConcurrentHashMap<String, C6065a> f16945a;

    /* renamed from: b */
    private StringBuilder f16946b;

    /* renamed from: c */
    private NetService f16947c;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.permission.a$b */
    public static class C6066b {

        /* renamed from: a */
        public static C6063a f16951a = new C6063a();
    }

    /* renamed from: a */
    public static C6063a m24571a() {
        return C6066b.f16951a;
    }

    private C6063a() {
        this.f16945a = new ConcurrentHashMap<>();
    }

    /* renamed from: b */
    private void m24573b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new RuntimeException("you can not choose reqWhenNoResult sync while you are int main thread !");
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.permission.a$a */
    public static class C6065a {

        /* renamed from: a */
        public int f16948a;

        /* renamed from: b */
        public long f16949b;

        /* renamed from: c */
        public String f16950c;

        /* renamed from: a */
        public static C6065a m24577a(String str) {
            return m24576a(0, str);
        }

        /* renamed from: a */
        public boolean mo24543a(long j) {
            if (Math.abs(System.currentTimeMillis() - this.f16949b) > j * 1000) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static C6065a m24576a(int i, String str) {
            long currentTimeMillis = System.currentTimeMillis();
            C6065a aVar = new C6065a();
            aVar.f16949b = currentTimeMillis;
            aVar.f16950c = str;
            aVar.f16948a = i;
            return aVar;
        }
    }

    /* renamed from: a */
    public void mo24542a(NetService netService) {
        boolean z;
        if (this.f16947c == null && netService != null) {
            this.f16947c = netService;
            StringBuilder sb = new StringBuilder();
            sb.append("bindService... net = ");
            if (netService == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("PermissionCenter", sb.toString());
        }
    }

    /* renamed from: b */
    private String m24572b(String str, int i) {
        StringBuilder sb = new StringBuilder();
        this.f16946b = sb;
        sb.append(str);
        sb.append("-");
        sb.append(i);
        return this.f16946b.toString();
    }

    /* renamed from: a */
    private int m24567a(String str, int i) {
        C13479a.m54764b("PermissionCenter", "doCheckPermission... for :" + C13598b.m55197d(str));
        String str2 = "https://" + C6313i.f17510b + String.format("/space/api/suite/permission/user.v3/?token=%s&type=%d", str, Integer.valueOf(i));
        Request.Builder builder = new Request.Builder().url(str2).get();
        C13479a.m54772d("PermissionCenter", "doCheckPermission... begin req : " + str2);
        Response a = this.f16947c.mo20120a(builder.build());
        if (a == null || !a.isSuccessful()) {
            C13479a.m54758a("PermissionCenter", "doCheckPermission... check failed");
            return -1;
        }
        try {
            int optInt = new JSONObject(a.body().string()).optInt("code");
            C13479a.m54764b("PermissionCenter", "doCheckPermission... checking result code: " + optInt + "for obj-token : " + C13598b.m55197d(str));
            return optInt;
        } catch (Exception e) {
            C13479a.m54759a("PermissionCenter", "doCheckPermission... err happens when try to parse result : ", e);
            return -1;
        }
    }

    /* renamed from: a */
    private C6065a m24568a(String str, int i, int i2) {
        C6065a a = C6065a.m24576a(i2, str);
        this.f16945a.put(m24572b(str, i), a);
        return a;
    }

    /* renamed from: a */
    private C6065a m24569a(String str, int i, long j) {
        String b = m24572b(str, i);
        if (!this.f16945a.containsKey(b)) {
            return null;
        }
        C6065a aVar = this.f16945a.get(b);
        if (!aVar.mo24543a(j)) {
            return aVar;
        }
        return null;
    }

    /* renamed from: a */
    public C6065a mo24541a(String str, int i, long j, boolean z) {
        return m24570a(str, i, j, z, true);
    }

    /* renamed from: a */
    private C6065a m24570a(String str, int i, long j, boolean z, boolean z2) {
        C13479a.m54764b("PermissionCenter", "getPermissionDataSync... for token : " + C13598b.m55197d(str));
        if (TextUtils.isEmpty(str) || i < 0) {
            C13479a.m54758a("PermissionCenter", "getPermissionDataSync... error token or type");
            return null;
        }
        C6065a a = m24569a(str, i, j);
        if (a != null) {
            C13479a.m54772d("PermissionCenter", "getPermissionDataSync... got valid data for token : " + str + "retCode = " + a.f16948a + "fetchTime:" + a.f16949b);
            return a;
        } else if (Document.m33924M(str)) {
            C13479a.m54764b("PermissionCenter", "getPermissionDataSync... this token is created in offline env, got to hav permission");
            return m24568a(str, i, 0);
        } else if (z) {
            C13479a.m54772d("PermissionCenter", "getPermissionDataSync... need to req permission : " + str);
            if (z2) {
                m24573b();
            }
            return m24568a(str, i, m24567a(str, i));
        } else {
            C13479a.m54772d("PermissionCenter", "getPermissionDataSync... no cache result, and no need to req for token : " + str);
            return C6065a.m24577a(str);
        }
    }
}
