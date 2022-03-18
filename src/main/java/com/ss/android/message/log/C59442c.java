package com.ss.android.message.log;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.p3019a.C59959a;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.log.c */
public class C59442c {
    /* renamed from: a */
    public static void m230758a(final Context context, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject) {
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            if (C59436a.m230732b(context)) {
                C59959a.m232689b().mo68798a(context, str, str2, str3, j, j2, jSONObject);
            } else {
                new ThreadPlus() {
                    /* class com.ss.android.message.log.C59442c.C594431 */

                    @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                    public void run() {
                        try {
                            C59441b bVar = new C59441b();
                            bVar.f147569a = str;
                            bVar.f147570b = str2;
                            bVar.f147571c = str3;
                            bVar.f147572d = j;
                            bVar.f147573e = j2;
                            JSONObject jSONObject = jSONObject;
                            if (jSONObject != null) {
                                bVar.f147574f = jSONObject.toString();
                            }
                            if (C20552c.m74848a()) {
                                C20552c.m74845a("PushLog", "category = " + bVar.f147569a + " tag = " + bVar.f147570b + " label = " + bVar.f147571c + " value = " + bVar.f147572d + " ext_value = " + j2 + " ext_json = " + bVar.f147574f);
                            }
                            C59439a a = C59439a.m230753a(context);
                            if (a != null) {
                                a.mo202711a(bVar);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }.start();
            }
        }
    }
}
