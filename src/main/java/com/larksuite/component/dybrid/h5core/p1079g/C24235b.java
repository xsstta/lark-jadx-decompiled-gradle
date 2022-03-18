package com.larksuite.component.dybrid.h5core.p1079g;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.b */
public class C24235b implements AbstractC24169l {
    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a(AbstractC24169l.C24170a.f59760j);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(final H5Event h5Event) throws JSONException {
        if (!AbstractC24169l.C24170a.f59760j.equals(h5Event.mo86707b())) {
            return true;
        }
        final Activity f = h5Event.mo86712f();
        final String a = C24246a.m88559a(h5Event.mo86710d(), "image");
        if (TextUtils.isEmpty(a)) {
            h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
            return false;
        }
        C57805b.m224333d(f, new C57805b.AbstractC57809a() {
            /* class com.larksuite.component.dybrid.h5core.p1079g.C24235b.C242361 */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public void permissionGranted(boolean z) {
                if (z) {
                    C24235b.this.mo86866a(f, a, h5Event);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isGranted", false);
                    h5Event.mo86708b(jSONObject);
                } catch (JSONException e) {
                    C24174b.m88297a("H5ImagePlugin", "JSONException", e);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo86866a(final Context context, final String str, final H5Event h5Event) {
        C57865c.m224574a(new C57865c.AbstractC57873d<String>() {
            /* class com.larksuite.component.dybrid.h5core.p1079g.C24235b.C242372 */

            /* renamed from: a */
            public String produce() {
                String str = "";
                try {
                    str = C57881t.m224651w(context) + System.currentTimeMillis() + ".png";
                    byte[] decode = Base64.decode(str, 0);
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                    fileOutputStream.write(decode, 0, decode.length);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return str;
                } catch (Exception e) {
                    e.printStackTrace();
                    return str;
                }
            }
        }, new C57865c.AbstractC57871b<String>() {
            /* class com.larksuite.component.dybrid.h5core.p1079g.C24235b.C242383 */

            /* renamed from: a */
            public void consume(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (TextUtils.isEmpty(str)) {
                        C24174b.m88296a("H5ImagePlugin", "save fail");
                        jSONObject.put("success", false);
                    } else {
                        C24174b.m88296a("H5ImagePlugin", "save success");
                        C26311p.m95268a(context, str);
                        jSONObject.put("success", true);
                    }
                    h5Event.mo86708b(jSONObject);
                } catch (JSONException e) {
                    C24174b.m88297a("H5ImagePlugin", "JSONException", e);
                }
            }
        });
    }
}
