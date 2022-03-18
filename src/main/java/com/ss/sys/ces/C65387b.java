package com.ss.sys.ces;

import android.content.Context;
import com.ss.sys.ces.p3234e.C65394b;
import com.ss.sys.ces.p3234e.C65396c;
import com.ss.sys.ces.p3234e.C65397d;
import com.ss.sys.ces.p3234e.C65398e;
import com.ss.sys.ces.p3234e.C65399f;
import com.ss.sys.ces.p3235f.C65401a;
import java.util.Map;
import org.json.JSONObject;
import p001a.p002a.p008b.p009a.C0032a;

/* renamed from: com.ss.sys.ces.b */
public class C65387b {

    /* renamed from: b */
    private static C65387b f164637b;

    /* renamed from: a */
    private Context f164638a;

    private C65387b(Context context) {
        this.f164638a = context;
    }

    /* renamed from: a */
    public static synchronized C65387b m256413a() {
        C65387b bVar;
        synchronized (C65387b.class) {
            bVar = f164637b;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized void m256414a(Context context) {
        synchronized (C65387b.class) {
            if (f164637b == null) {
                f164637b = new C65387b(context);
            }
        }
    }

    /* renamed from: a */
    public Object mo225025a(int i, Object obj) {
        String str = null;
        if (i == 123) {
            return C65398e.m256471a(this.f164638a);
        }
        if (i == 121) {
            return C65396c.m256465b(this.f164638a);
        }
        if (i == 122) {
            return C65396c.m256463a();
        }
        if (i == 126) {
            return C65396c.m256464a(this.f164638a);
        }
        if (i == 127) {
            return null;
        }
        if (i == 128) {
            return C65396c.m256466c(this.f164638a);
        }
        if (i == 120) {
            return C65394b.m256462c();
        }
        if (i == 124) {
            return C65399f.m256475b(this.f164638a);
        }
        if (i == 130) {
            return C65399f.m256474a(this.f164638a);
        }
        if (i == 125) {
            return null;
        }
        if (i == 129) {
            return C65397d.m256470d(this.f164638a);
        }
        if (i == 131) {
            return C0032a.m56b();
        }
        if (i == 132) {
            C65388c.m256417b().reportNow((String) obj);
            return null;
        } else if (i == 134) {
            return C65401a.m256476a(this.f164638a).mo225054a();
        } else {
            if (i == 133) {
                try {
                    Map<String, Object> map = C65388c.f164639c;
                    if (map != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            if (entry != null) {
                                if (entry.getValue() != null) {
                                    jSONObject.put(entry.getKey(), entry.getValue());
                                }
                            }
                            jSONObject.put("", "");
                        }
                        str = jSONObject.toString();
                    }
                } catch (Throwable unused) {
                }
                return str == null ? "{}" : str.trim();
            } else if (i == 135) {
                return "0000000000000000000000000000000000000000";
            } else {
                if (i != 136) {
                    return null;
                }
                try {
                    return this.f164638a.getPackageManager().getPackageInfo(this.f164638a.getPackageName(), 64).signatures[0].toByteArray();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return null;
                }
            }
        }
    }
}
