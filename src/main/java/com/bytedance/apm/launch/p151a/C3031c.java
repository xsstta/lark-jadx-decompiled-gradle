package com.bytedance.apm.launch.p151a;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2751d;
import com.bytedance.apm.trace.C3098f;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.monitor.collector.C20152k;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.launch.a.c */
public class C3031c {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.launch.a.c$a */
    public static class C3033a {

        /* renamed from: a */
        public long f9757a;

        /* renamed from: b */
        public long f9758b;

        /* renamed from: c */
        public String f9759c;

        /* renamed from: d */
        public String f9760d;

        /* renamed from: e */
        public String f9761e;

        /* renamed from: f */
        public String f9762f;

        private C3033a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo12846a() {
            if (!this.f9759c.isEmpty() && this.f9757a >= 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "LockItemInfo{duration=" + this.f9757a + ", startTime=" + this.f9758b + ", blockStackInfo='" + this.f9759c + '\'' + ", completeBlockStackInfo='" + this.f9760d + '\'' + ", ownerStackInfo='" + this.f9761e + '\'' + ", ownerThreadName='" + this.f9762f + '\'' + '}';
        }

        /* renamed from: a */
        public static C3033a m12713a(String str) {
            if (!str.isEmpty() && str.contains("&#&")) {
                String[] split = str.split("&#&");
                if (split.length != 4) {
                    return null;
                }
                String str2 = split[2];
                if (!str2.isEmpty() && str2.contains("monitor contention with owner")) {
                    C3024a a = C3024a.m12698a();
                    a.mo12841b("raw: " + str);
                    C3033a aVar = new C3033a();
                    aVar.f9758b = Long.parseLong(split[0]);
                    aVar.f9757a = Long.parseLong(split[1]);
                    String substring = str2.substring(str2.indexOf("monitor contention with owner"));
                    aVar.f9762f = substring.substring(30, substring.indexOf("(") - 1);
                    int indexOf = substring.indexOf(" at ");
                    if (indexOf != -1) {
                        String substring2 = substring.substring(indexOf + 5, substring.indexOf("waiters=", indexOf));
                        String substring3 = substring2.substring(substring2.indexOf(" "));
                        aVar.f9761e = substring3.substring(1, substring3.indexOf("(")) + substring3.substring(substring3.indexOf(")") + 1, substring3.lastIndexOf(")") + 1);
                    }
                    String substring4 = substring.substring(substring.indexOf("blocking from") + 14);
                    String substring5 = substring4.substring(substring4.indexOf(" ") + 1);
                    aVar.f9759c = substring5.substring(0, substring5.indexOf("(")) + substring5.substring(substring5.indexOf(")") + 1, substring5.lastIndexOf(")") + 1);
                    String str3 = split[3];
                    if (str3 != null && !str3.isEmpty() && str3.contains("at")) {
                        String substring6 = str3.substring(str3.indexOf("\n") + 1);
                        aVar.f9760d = substring6.substring(substring6.indexOf("\n") + 1);
                    }
                    return aVar;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m12711a(final C3098f.AbstractC3102a aVar, boolean z, final String str) {
        if (z) {
            C20152k.m73538a().mo68301i();
        }
        C20152k.m73538a().mo68290a(new C20152k.AbstractC20156b() {
            /* class com.bytedance.apm.launch.p151a.C3031c.C30321 */

            @Override // com.bytedance.monitor.collector.C20152k.AbstractC20156b
            /* renamed from: a */
            public void mo12845a(List<String> list) {
                long j;
                Throwable th;
                if (list != null) {
                    long j2 = -1;
                    try {
                        j = -1;
                        for (String str : list) {
                            try {
                                try {
                                    C3033a a = C3033a.m12713a(str);
                                    if (a != null) {
                                        if (j == -1) {
                                            j = 0;
                                        }
                                        j += a.f9757a;
                                        JSONObject a2 = C3031c.m12710a(a, str, str);
                                        if (a2 != null) {
                                            C3024a.m12698a().mo12841b("lock report json: " + a2);
                                            C2741a.m11630c().mo11785a(new C2751d("block_monitor", a2));
                                        }
                                    }
                                } catch (Throwable th2) {
                                    C3024a.m12698a().mo12839a("parse lock info failed: " + th2.getLocalizedMessage());
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j2 = j;
                                C3024a.m12698a().mo12839a("parse lock info failed: " + th.getLocalizedMessage());
                                j = j2;
                                aVar.mo12992a(j);
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        C3024a.m12698a().mo12839a("parse lock info failed: " + th.getLocalizedMessage());
                        j = j2;
                        aVar.mo12992a(j);
                    }
                    aVar.mo12992a(j);
                }
            }
        });
    }

    /* renamed from: a */
    public static JSONObject m12710a(C3033a aVar, String str, String str2) {
        if (!aVar.mo12846a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", aVar.f9758b);
            jSONObject.put("crash_time", aVar.f9758b);
            jSONObject.put("is_main_process", C2785b.m11761e());
            jSONObject.put("process_name", C2785b.m11756d());
            jSONObject.put("block_duration", aVar.f9757a);
            jSONObject.put("raw_dump_info", str);
            StringBuilder sb = new StringBuilder("LockInfo:\n");
            sb.append("-Lock Time ");
            sb.append(aVar.f9757a);
            sb.append("ms\n");
            sb.append("-Block Stack \n");
            sb.append("at ");
            sb.append(aVar.f9759c);
            sb.append("\n");
            if (!aVar.f9760d.isEmpty()) {
                sb.append(aVar.f9760d.replace("\t", ""));
                sb.append("\n");
            }
            sb.append("-Owner Thread: ");
            sb.append(aVar.f9762f);
            sb.append("\n");
            if (aVar.f9761e != null && !aVar.f9761e.isEmpty()) {
                sb.append("-Owner Stack: \n");
                sb.append("-at ");
                sb.append(aVar.f9761e);
                sb.append("\n");
            }
            jSONObject.put("stack", sb.toString());
            jSONObject.put("event_type", "lag");
            JSONObject c = C3331c.m13887a().mo13569c();
            c.put("block_stack_type", "stack");
            c.put(str2, "true");
            jSONObject.put("filters", c);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
