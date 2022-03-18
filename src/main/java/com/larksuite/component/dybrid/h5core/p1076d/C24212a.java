package com.larksuite.component.dybrid.h5core.p1076d;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.dybrid.h5api.api.AbstractC24166i;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5api.p1071b.C24176c;
import com.larksuite.component.dybrid.h5core.core.C24201b;
import com.larksuite.component.dybrid.h5core.core.impl.C24210e;
import com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a;
import com.larksuite.component.dybrid.h5core.p1077e.C24215a;
import com.larksuite.component.dybrid.h5core.p1077e.C24216b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.component.dybrid.router.p1086c.AbstractC24270a;
import com.larksuite.component.dybrid.router.p1087d.C24272a;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.larksuite.component.dybrid.h5core.d.a */
public class C24212a {

    /* renamed from: a */
    private static C24201b f59848a;

    /* renamed from: b */
    private static AbstractC24166i f59849b;

    /* renamed from: c */
    private static AbstractC24200a f59850c = C24210e.m88437g();

    /* renamed from: d */
    private static List<String> f59851d = new ArrayList<String>() {
        /* class com.larksuite.component.dybrid.h5core.p1076d.C24212a.C242131 */

        {
            add("memberInviter");
            add("newOnboarding");
        }
    };

    /* renamed from: a */
    public static AbstractC24200a m88455a() {
        return f59850c;
    }

    /* renamed from: b */
    public static AbstractC24166i m88458b() {
        return f59849b;
    }

    /* renamed from: c */
    public static C24201b m88459c() {
        if (f59848a == null) {
            synchronized (C24212a.class) {
                if (f59848a == null) {
                    f59848a = new C24201b();
                }
            }
        }
        return f59848a;
    }

    /* renamed from: a */
    public static void m88457a(Bundle bundle) {
        if (bundle == null) {
            C24174b.m88299b("H5Container", "invalid magic parameter!");
            return;
        }
        String a = C24246a.m88555a(bundle, "u");
        if (TextUtils.isEmpty(a)) {
            a = C24246a.m88555a(bundle, "url");
        }
        if (TextUtils.isEmpty(a)) {
            C24174b.m88301c("H5Container", "no url found in magic parameter");
            return;
        }
        Uri a2 = C24176c.m88304a(a);
        Set<String> a3 = C24176c.m88306a(a2);
        if (a3 != null) {
            try {
                for (String str : a3) {
                    if (str.contains("dynamic_")) {
                        String[] split = str.split("_");
                        if (split.length == 2) {
                            String str2 = split[1];
                            String a4 = C24176c.m88305a(a2, str, null);
                            if (a4 != null) {
                                bundle.remove(str2);
                                bundle.putString(str2, a4);
                                C24174b.m88296a("H5Container", " dynamic option [key] " + str2 + " [value] " + a4);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C24174b.m88297a("H5Container", "failed to decode magic option.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m88456a(Context context, AbstractC24166i iVar) {
        f59849b = iVar;
        C24214b.m88461a(context);
        C24174b.m88296a("H5Container", "init");
        for (String str : f59851d) {
            try {
                Class<?> b = C24246a.m88565b("com.larksuite.component.dybrid.router.generated.UriAnnotationInit_" + str);
                if (b != null) {
                    Object newInstance = b.newInstance();
                    if (newInstance instanceof AbstractC24270a) {
                        ((AbstractC24270a) newInstance).init(new C24272a());
                    }
                }
            } catch (Exception e) {
                C24174b.m88297a("H5Container", ApiHandler.API_CALLBACK_EXCEPTION, e);
            }
        }
        C24258a.m88594a().mo86892a(new C24216b(), 0);
        C24258a.m88594a().mo86892a(new C24215a(), 1);
    }
}
