package com.ss.android.vc.common.p3083e;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VcAlert;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.vc.common.e.m */
public class C60768m {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.e.m$a */
    public static class C60770a {

        /* renamed from: a */
        String f151955a;

        /* renamed from: b */
        String f151956b;

        /* renamed from: c */
        String f151957c;

        /* renamed from: d */
        int f151958d;

        private C60770a() {
        }

        /* renamed from: a */
        public void mo208375a(VcMsgInfo vcMsgInfo, final Context context) {
            Activity c = VCAppLifeCycle.m236256c();
            C60700b.m235851b("VCAlertUtils", "[showAlert]", "topAct 1: " + c);
            if (c != null && vcMsgInfo != null && vcMsgInfo.alert != null) {
                VcAlert vcAlert = vcMsgInfo.alert;
                ArrayList arrayList = new ArrayList();
                this.f151955a = null;
                if (vcAlert.title != null && !TextUtils.isEmpty(vcAlert.title.i18n_key)) {
                    String str = vcAlert.title.i18n_key;
                    this.f151955a = str;
                    arrayList.add(str);
                }
                this.f151956b = null;
                if (vcAlert.body != null && !TextUtils.isEmpty(vcAlert.body.i18n_key)) {
                    String str2 = vcAlert.body.i18n_key;
                    this.f151956b = str2;
                    arrayList.add(str2);
                }
                this.f151957c = null;
                if (!(vcAlert.footer == null || vcAlert.footer.text == null || TextUtils.isEmpty(vcAlert.footer.text.i18n_key))) {
                    String str3 = vcAlert.footer.text.i18n_key;
                    this.f151957c = str3;
                    arrayList.add(str3);
                }
                this.f151958d = 0;
                if (vcAlert.footer != null) {
                    this.f151958d = vcAlert.footer.wait_time;
                }
                VcBizSender.m249203a(arrayList, (Map<String, String>) null).mo219889a(new AbstractC63598b<Map<String, String>>() {
                    /* class com.ss.android.vc.common.p3083e.C60768m.C60770a.C607711 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, String> map) {
                        Context context = context;
                        Activity activity = context;
                        if (context == null) {
                            Activity c = VCAppLifeCycle.m236256c();
                            C60700b.m235851b("VCAlertUtils", "[showAlert2]", "topAct 2: " + c);
                            if (c != null) {
                                boolean isFinishing = c.isFinishing();
                                activity = c;
                                if (isFinishing) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        VCDialogUtils.m236207a(activity, C60768m.m236109a(C60770a.this.f151955a, map), 1, C60768m.m236109a(C60770a.this.f151956b, map), C60768m.m236109a(C60770a.this.f151957c, map), C60770a.this.f151958d, false);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m236110a(VcMsgInfo vcMsgInfo, Context context) {
        new C60770a().mo208375a(vcMsgInfo, context);
    }

    /* renamed from: a */
    public static String m236109a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (map.containsKey(str)) {
            return map.get(str);
        }
        Context a = ar.m236694a();
        Resources resources = a.getResources();
        int identifier = resources.getIdentifier(str, "string", a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
