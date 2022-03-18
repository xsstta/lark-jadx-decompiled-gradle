package com.lynx.tasm;

import android.text.TextUtils;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.common.C26872a;
import com.lynx.tasm.common.NullableConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class TemplateData {

    /* renamed from: a */
    private long f65645a;

    /* renamed from: b */
    private Map<String, Object> f65646b;

    /* renamed from: c */
    private Map<String, Object> f65647c;

    /* renamed from: d */
    private String f65648d = null;

    /* renamed from: e */
    private volatile boolean f65649e;

    /* renamed from: f */
    private boolean f65650f;

    private static native long nativeParseData(ByteBuffer byteBuffer, int i);

    private static native long nativeParseStringData(String str);

    private static native void nativeReleaseData(long j);

    private static native void nativeUpdateData(long j, ByteBuffer byteBuffer, int i);

    /* renamed from: f */
    public void mo94340f() {
        this.f65650f = true;
    }

    /* renamed from: b */
    public long mo94334b() {
        return this.f65645a;
    }

    /* renamed from: e */
    public String mo94339e() {
        return this.f65648d;
    }

    public void finalize() {
        mo94338d();
    }

    /* renamed from: g */
    public boolean mo94342g() {
        return this.f65650f;
    }

    /* renamed from: a */
    public static TemplateData m96223a() {
        return new TemplateData(0, null);
    }

    /* renamed from: i */
    private static boolean m96230i() {
        return LynxEnv.m96123e().mo94107n();
    }

    /* renamed from: d */
    public void mo94338d() {
        if (m96230i()) {
            long j = this.f65645a;
            if (j != 0) {
                m96226a(j);
            }
        }
    }

    /* renamed from: h */
    private void m96229h() {
        Map<String, Object> map;
        Map<String, Object> map2;
        if (this.f65646b == null) {
            if (this.f65649e) {
                map2 = new NullableConcurrentHashMap<>();
            } else {
                map2 = new HashMap<>();
            }
            this.f65646b = map2;
        }
        if (this.f65647c == null) {
            if (this.f65649e) {
                map = new NullableConcurrentHashMap<>();
            } else {
                map = new HashMap<>();
            }
            this.f65647c = map;
        }
    }

    /* renamed from: c */
    public void mo94337c() {
        if (this.f65645a == 0) {
            ByteBuffer a = C26872a.f66718a.mo95651a(this.f65646b);
            if (a != null && a.position() > 0) {
                this.f65645a = nativeParseData(a, a.position());
                return;
            }
            return;
        }
        Map<String, Object> map = this.f65647c;
        if (map != null && map.size() != 0 && this.f65646b != null) {
            ByteBuffer a2 = C26872a.f66718a.mo95651a(this.f65647c);
            this.f65646b.putAll(this.f65647c);
            this.f65647c.clear();
            long j = this.f65645a;
            if (j == 0) {
                LLog.m96429e("TemplateData", "mNative Data is null");
            } else if (a2 != null && j != 0) {
                nativeUpdateData(j, a2, a2.position());
            }
        }
    }

    /* renamed from: a */
    private void m96226a(long j) {
        nativeReleaseData(j);
    }

    /* renamed from: b */
    public void mo94335b(String str) {
        this.f65648d = str;
    }

    /* renamed from: a */
    public static TemplateData m96224a(String str) {
        if (!m96230i() || TextUtils.isEmpty(str)) {
            return new TemplateData(0, null);
        }
        return new TemplateData(nativeParseStringData(str), null);
    }

    /* renamed from: a */
    public static TemplateData m96225a(Map<String, Object> map) {
        ByteBuffer a;
        if (!m96230i() || map == null || (a = C26872a.f66718a.mo95651a(map)) == null || a.position() <= 0) {
            return new TemplateData(0, null);
        }
        return new TemplateData(nativeParseData(a, a.position()), map);
    }

    /* renamed from: b */
    public void mo94336b(String str, Object obj) {
        if (this.f65650f) {
            LLog.m96427d(LynxKitALogDelegate.f38587a, "can not update readOnly TemplateData");
        } else {
            mo94333a(str, obj);
        }
    }

    private TemplateData(long j, Map<String, Object> map) {
        LynxEnv.m96123e();
        this.f65645a = j;
        if (j != 0) {
            this.f65646b = map;
        }
    }

    /* renamed from: c */
    private void m96228c(String str, Object obj) {
        if (this.f65645a == 0) {
            this.f65646b.put(str, obj);
            return;
        }
        Object obj2 = this.f65647c.get(str);
        if (obj2 == null) {
            obj2 = this.f65646b.get(str);
        }
        if (obj == null && obj2 != null) {
            this.f65647c.put(str, null);
        } else if (obj == obj2) {
        } else {
            if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                this.f65647c.put(str, obj);
            } else {
                m96227a(str, (Map) obj2, (Map) obj);
            }
        }
    }

    /* renamed from: a */
    public void mo94333a(String str, Object obj) {
        if (this.f65650f) {
            LLog.m96427d(LynxKitALogDelegate.f38587a, "can not update readOnly TemplateData");
            return;
        }
        m96229h();
        m96228c(str, obj);
    }

    /* renamed from: a */
    private void m96227a(String str, Map<String, Object> map, Map<String, Object> map2) {
        HashMap hashMap = null;
        for (String str2 : map2.keySet()) {
            Object obj = map.get(str2);
            Object obj2 = map2.get(str2);
            if (obj != obj2) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str2, obj2);
            }
        }
        if (hashMap != null) {
            this.f65647c.put(str, hashMap);
        }
    }
}
