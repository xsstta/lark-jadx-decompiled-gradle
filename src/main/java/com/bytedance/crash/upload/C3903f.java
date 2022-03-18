package com.bytedance.crash.upload;

import android.content.Context;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.nativecrash.C3809i;
import com.bytedance.crash.p217a.C3687a;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3852f;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.C3869p;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.C3969y;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.f */
public class C3903f {

    /* renamed from: a */
    private static volatile C3903f f11964a;

    /* renamed from: b */
    private final Context f11965b;

    /* renamed from: a */
    public boolean mo15553a(JSONObject jSONObject, File file, File file2, File file3, File file4, long j) {
        try {
            String a = CrashUploader.m16088a(CrashUploader.m16108e(), jSONObject.optJSONObject("header"));
            try {
                C3969y.m16546a(jSONObject, file3);
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
            String jSONObject2 = jSONObject.toString();
            C3949m.C3951b[] bVarArr = new C3949m.C3951b[6];
            bVarArr[0] = new C3949m.C3951b(file2, true);
            bVarArr[1] = new C3949m.C3951b(file3, true);
            bVarArr[2] = new C3949m.C3951b(C3919m.m16230g(), false);
            bVarArr[3] = file4 == null ? null : new C3949m.C3951b(file4, false);
            bVarArr[4] = C3869p.m16028b(j);
            bVarArr[5] = C3809i.m15778a(jSONObject.optJSONArray("alive_pids"));
            return CrashUploader.m16080a(a, jSONObject2, file, bVarArr).mo15579a();
        } catch (Throwable th2) {
            C3968x.m16537b(th2);
            return false;
        }
    }

    /* renamed from: a */
    public static C3903f m16169a() {
        if (f11964a == null) {
            f11964a = new C3903f(C3774m.m15609j());
        }
        return f11964a;
    }

    private C3903f(Context context) {
        this.f11965b = context;
    }

    /* renamed from: b */
    public void mo15554b(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            C3866n.m16016b().mo15508a(new Runnable() {
                /* class com.bytedance.crash.upload.C3903f.RunnableC39041 */

                public void run() {
                    String a = CrashUploader.m16088a(CrashUploader.m16100b(), jSONObject.optJSONObject("header"));
                    try {
                        jSONObject.put("upload_scene", "direct");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    CrashUploader.m16097b(a, jSONObject.toString());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo15548a(JSONObject jSONObject) {
        if (!C3955q.m16453a(jSONObject)) {
            try {
                String a = CrashUploader.m16088a(CrashUploader.m16100b(), jSONObject.optJSONObject("header"));
                File file = new File(C3962t.m16481a(this.f11965b), C3962t.m16494c(C3774m.m15605f()));
                String a2 = C3949m.m16395a(file, file.getName(), a, jSONObject, CrashUploader.m16090a());
                jSONObject.put("upload_scene", "direct");
                if (CrashUploader.m16097b(a, jSONObject.toString()).mo15579a()) {
                    C3949m.m16413a(a2);
                }
            } catch (Throwable th) {
                C3968x.m16537b(th);
            }
        }
    }

    /* renamed from: a */
    public void mo15547a(String str, JSONObject jSONObject) {
        if (!C3955q.m16453a(jSONObject)) {
            try {
                File file = new File(C3962t.m16481a(this.f11965b), C3962t.m16493c());
                C3949m.m16395a(file, file.getName(), str, jSONObject, CrashUploader.m16090a());
                if (CrashUploader.m16079a(str, jSONObject.toString()).mo15579a()) {
                    C3949m.m16412a(file);
                }
            } catch (Throwable th) {
                C3968x.m16537b(th);
            }
        }
    }

    /* renamed from: a */
    public boolean mo15550a(long j, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String a = CrashUploader.m16088a(CrashUploader.m16100b(), jSONObject.optJSONObject("header"));
                File file = new File(C3962t.m16481a(this.f11965b), C3962t.m16490b(C3774m.m15605f()));
                C3949m.m16395a(file, file.getName(), a, jSONObject, CrashUploader.m16090a());
                jSONObject.put("upload_scene", "direct");
                if (!CrashUploader.m16097b(a, jSONObject.toString()).mo15579a()) {
                    return false;
                }
                C3949m.m16412a(file);
                return true;
            } catch (Throwable th) {
                C3968x.m16537b(th);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo15552a(JSONObject jSONObject, File file, File file2) {
        try {
            String f = CrashUploader.m16109f();
            return CrashUploader.m16082a(CrashType.ASAN.getName(), CrashUploader.m16088a(f, jSONObject.optJSONObject("header")), jSONObject.toString(), new C3949m.C3951b(file, true), new C3949m.C3951b(C3919m.m16230g(), false), new C3949m.C3951b(file2, true)).mo15579a();
        } catch (Throwable th) {
            C3968x.m16537b(th);
            return false;
        }
    }

    /* renamed from: a */
    public void mo15549a(JSONObject jSONObject, long j, boolean z, List<String> list) {
        C3949m.C3951b bVar;
        if (!C3955q.m16453a(jSONObject)) {
            try {
                String a = CrashUploader.m16088a(CrashUploader.m16100b(), jSONObject.optJSONObject("header"));
                File file = new File(C3962t.m16481a(this.f11965b), C3774m.m15592a(j, CrashType.ANR, false, false));
                C3949m.m16395a(file, file.getName(), a, jSONObject, CrashUploader.m16090a());
                if (!z) {
                    return;
                }
                if (!C3775n.m15663n()) {
                    jSONObject.put("upload_scene", "direct");
                    jSONObject.put("crash_uuid", file.getName());
                    boolean n = C3840b.m15896n();
                    File b = C3962t.m16488b(this.f11965b, C3774m.m15606g());
                    C3852f.m15967a(b, CrashType.ANR);
                    C3969y.m16546a(jSONObject, b);
                    String name = CrashType.ANR.getName();
                    String jSONObject2 = jSONObject.toString();
                    C3949m.C3951b[] bVarArr = new C3949m.C3951b[4];
                    bVarArr[0] = new C3949m.C3951b(b, true);
                    bVarArr[1] = C3869p.m16028b(j);
                    bVarArr[2] = new C3949m.C3951b(C3919m.m16230g(), false);
                    if (n) {
                        bVar = C3809i.m15778a(jSONObject.optJSONArray("alive_pids"));
                    } else {
                        bVar = null;
                    }
                    bVarArr[3] = bVar;
                    if (CrashUploader.m16082a(name, a, jSONObject2, bVarArr).mo15579a()) {
                        C3687a.m15193a(list, C3933b.m16337c(this.f11965b));
                        C3949m.m16412a(file);
                        if (!C3775n.m15660k()) {
                            C3949m.m16412a(C3962t.m16514j(C3774m.m15609j()));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo15551a(String str, String str2, String str3, List<String> list) {
        C3968x.m16536b("npth", "real upload alog " + str3 + ": " + list);
        try {
            return CrashUploader.m16093a(CrashUploader.m16087a(CrashUploader.m16104c(), str, str2), str, str2, str3, list);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
