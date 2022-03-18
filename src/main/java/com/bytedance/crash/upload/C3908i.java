package com.bytedance.crash.upload;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.entity.C3740a;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.entity.C3744d;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3853g;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.C3869p;
import com.bytedance.crash.runtime.C3879s;
import com.bytedance.crash.runtime.p227a.C3835e;
import com.bytedance.crash.runtime.p228b.C3842a;
import com.bytedance.crash.util.C3943h;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.ListMap;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.i */
public final class C3908i {

    /* renamed from: c */
    public static final Object f11981c = C3743c.f11533a;

    /* renamed from: d */
    private static final ListMap<C3915a, C3744d> f11982d = new ListMap<C3915a, C3744d>() {
        /* class com.bytedance.crash.upload.C3908i.C39091 */

        @Override // com.bytedance.crash.util.ListMap
        public List<C3744d> newList() {
            return new LinkedList();
        }
    };

    /* renamed from: e */
    private static final HashMap<C3915a, HashMap<String, LinkedList<C3744d>>> f11983e = new HashMap<>();

    /* renamed from: f */
    private static volatile C3908i f11984f;

    /* renamed from: a */
    public final C3879s f11985a = C3866n.m16016b();

    /* renamed from: b */
    public final Runnable f11986b = new Runnable() {
        /* class com.bytedance.crash.upload.C3908i.RunnableC39102 */

        public void run() {
            if (!C3775n.m15663n()) {
                C3908i.m16192b();
                C3908i.this.mo15561e();
                C3908i.this.f11985a.mo15509a(C3908i.this.f11986b, 30000);
            }
        }
    };

    /* renamed from: g */
    private volatile boolean f11987g;

    /* renamed from: d */
    public void mo15560d() {
        this.f11985a.mo15511b(this.f11986b);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.upload.i$a */
    public static class C3915a {

        /* renamed from: c */
        private static final HashMap<Integer, C3915a> f11995c = new HashMap<>();

        /* renamed from: a */
        final Object f11996a;

        /* renamed from: b */
        final int f11997b;

        public int hashCode() {
            return (this.f11996a.hashCode() * 31) + this.f11997b;
        }

        /* renamed from: a */
        static int m16201a(C3744d dVar) {
            return dVar.mo15255h() ? 1 : 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3915a)) {
                return false;
            }
            C3915a aVar = (C3915a) obj;
            if (this.f11997b != aVar.f11997b) {
                return false;
            }
            return this.f11996a.equals(aVar.f11996a);
        }

        C3915a(Object obj, int i) {
            this.f11996a = obj;
            this.f11997b = i;
        }

        /* renamed from: b */
        static int m16203b(Object obj, C3744d dVar) {
            return (obj.hashCode() * 31) + m16201a(dVar);
        }

        /* renamed from: a */
        public static C3915a m16202a(Object obj, C3744d dVar) {
            int b = m16203b(obj, dVar);
            HashMap<Integer, C3915a> hashMap = f11995c;
            C3915a aVar = hashMap.get(Integer.valueOf(b));
            if (aVar != null) {
                return aVar;
            }
            C3915a aVar2 = new C3915a(obj, m16201a(dVar));
            hashMap.put(Integer.valueOf(b), aVar2);
            return aVar2;
        }
    }

    private C3908i() {
    }

    /* renamed from: a */
    public static C3908i m16189a() {
        if (f11984f == null) {
            synchronized (C3908i.class) {
                if (f11984f == null) {
                    f11984f = new C3908i();
                }
            }
        }
        return f11984f;
    }

    /* renamed from: f */
    private static void m16195f() {
        if (C3775n.m15654e() && !C3775n.m15663n()) {
            try {
                C3866n.m16016b().mo15508a(new Runnable() {
                    /* class com.bytedance.crash.upload.C3908i.RunnableC39124 */

                    public void run() {
                        C3908i.m16189a().mo15561e();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo15559c() {
        if (f11982d.isEmpty()) {
            this.f11985a.mo15509a(this.f11986b, 30000);
        } else {
            this.f11985a.mo15508a(this.f11986b);
        }
    }

    /* renamed from: b */
    public static void m16192b() {
        HashMap hashMap;
        HashMap<C3915a, HashMap<String, LinkedList<C3744d>>> hashMap2 = f11983e;
        if (hashMap2.isEmpty() || !C3775n.m15654e()) {
            return;
        }
        if (C3840b.m15879b() || System.currentTimeMillis() - C3774m.m15612m() >= 180000) {
            synchronized (hashMap2) {
                hashMap = new HashMap(hashMap2);
                hashMap2.clear();
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                    LinkedList linkedList = (LinkedList) entry2.getValue();
                    while (!linkedList.isEmpty()) {
                        try {
                            C3744d dVar = (C3744d) linkedList.poll();
                            if (dVar == null) {
                                break;
                            }
                            m16191a(((C3915a) entry.getKey()).f11996a, dVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.hasNext() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r2 = r1.next();
        r4 = (java.util.List) r2.getValue();
        r5 = r2.getKey().f11996a;
        r2 = r2.getKey().f11997b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r9.f11987g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = new java.util.LinkedList();
        r1 = com.bytedance.crash.upload.C3908i.f11982d.entrySet().iterator();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15561e() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.C3908i.mo15561e():void");
    }

    /* renamed from: b */
    private static void m16193b(Object obj, C3744d dVar) {
        boolean z;
        List<C3744d> list = f11982d.getList(C3915a.m16202a(obj, dVar));
        list.add(dVar);
        int size = list.size();
        if (size >= 30) {
            z = true;
        } else {
            z = false;
        }
        C3968x.m16535b("[enqueue] size=" + size);
        if (z) {
            m16195f();
        }
    }

    /* renamed from: c */
    private static void m16194c(Object obj, C3744d dVar) {
        LinkedList<C3744d> linkedList;
        try {
            String string = dVar.mo15252e().getString("log_type");
            HashMap<C3915a, HashMap<String, LinkedList<C3744d>>> hashMap = f11983e;
            synchronized (hashMap) {
                HashMap<String, LinkedList<C3744d>> hashMap2 = hashMap.get(C3915a.m16202a(obj, dVar));
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(C3915a.m16202a(obj, dVar), hashMap2);
                }
                linkedList = hashMap2.get(string);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    hashMap2.put(string, linkedList);
                }
            }
            linkedList.add(dVar);
            if (linkedList.size() > 100) {
                linkedList.poll();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m16191a(final Object obj, final C3744d dVar) {
        Object obj2;
        String str;
        if (!C3775n.m15663n() && !C3775n.m15666q()) {
            Handler a = C3866n.m16016b().mo15507a();
            if (a == null || a.getLooper() != Looper.myLooper()) {
                C3866n.m16016b().mo15508a(new Runnable() {
                    /* class com.bytedance.crash.upload.C3908i.RunnableC39113 */

                    public void run() {
                        C3908i.m16191a(obj, dVar);
                    }
                });
                return;
            }
            if (obj == null) {
                obj = f11981c;
            }
            if (!C3775n.m15654e() || (obj == (obj2 = f11981c) && !C3840b.m15879b() && System.currentTimeMillis() - C3774m.m15612m() < 180000)) {
                m16194c(obj, dVar);
                return;
            }
            if (obj != obj2 && (!C3842a.m15915d(C3743c.m15479d(obj)) || C3919m.m16223a(C3743c.m15479d(obj)))) {
                C3886a.m16112a(obj);
            }
            m16192b();
            String optString = dVar.mo15252e().optString("log_type");
            if ("service_monitor".equals(optString)) {
                String optString2 = dVar.mo15252e().optString("service");
                if (TextUtils.isEmpty(optString2) || !C3840b.m15883c(obj, optString2)) {
                    C3968x.m16536b("EventUploadQueue", "serviceName " + optString2 + " not sampled");
                    return;
                }
                C3968x.m16536b("EventUploadQueue", "serviceName " + optString2 + " enqueue success");
                m16193b(obj, dVar);
                return;
            }
            String optString3 = dVar.mo15252e().optString("message");
            if (TextUtils.isEmpty(optString3)) {
                str = null;
            } else {
                str = C3943h.m16371a(optString3);
            }
            String optString4 = dVar.mo15252e().optString("crash_md5");
            if (!C3853g.m15968a().mo15465a(optString4, str)) {
                C3968x.m16531a("exception has been discard (enqueue) due to exceed limit: " + optString);
            } else if (TextUtils.isEmpty(optString) || !C3840b.m15877a(obj, optString)) {
                C3968x.m16536b("EventUploadQueue", "logType " + optString + " not sampled");
            } else if (!C3840b.m15880b(obj, optString3)) {
                C3968x.m16530a((Object) ("exception has been discard (enqueue) due to message not sampled: " + optString3));
            } else if (!C3853g.m15968a().mo15467b(optString4, str)) {
                C3968x.m16531a("exception has been discard (enqueue) due to exceed limit: " + optString);
            } else {
                C3968x.m16536b("EventUploadQueue", "logType " + optString + " message " + optString3 + " enqueue success");
                m16193b(obj, dVar);
            }
        }
    }

    /* renamed from: a */
    public static void m16190a(C3744d dVar, Object obj, final long j, final File file) {
        JSONArray jSONArray;
        LinkedList linkedList = new LinkedList();
        linkedList.add(dVar);
        JSONObject e = C3835e.m15853a().mo15430a(linkedList).mo15252e();
        if (obj == f11981c) {
            jSONArray = null;
        } else {
            jSONArray = C3743c.m15477b(obj);
        }
        C3898d.m16160a(e, jSONArray, new C3740a.AbstractC3741a() {
            /* class com.bytedance.crash.upload.C3908i.C39146 */

            @Override // com.bytedance.crash.entity.C3740a.AbstractC3741a
            /* renamed from: a */
            public boolean mo15109a(JSONObject jSONObject) {
                CrashUploader.m16082a("ensure_zip", C3774m.m15611l().getExceptionZipUploadUrl(), jSONObject.toString(), new C3949m.C3951b(file, true), new C3949m.C3951b(C3919m.m16230g(), false), C3869p.m16028b(j));
                return true;
            }
        });
    }
}
