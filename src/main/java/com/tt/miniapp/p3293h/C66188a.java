package com.tt.miniapp.p3293h;

import android.app.Activity;
import com.tt.miniapp.view.dialog.C67179c;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.h.a */
public class C66188a extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "showActionSheet";
    }

    public C66188a(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo231525a(String[] strArr, final AbstractC67550j.AbstractC67551a aVar) {
        Activity e = mo234577e();
        if (e != null && strArr != null) {
            C67179c.m261839a(e, strArr, new C67179c.AbstractC67189a() {
                /* class com.tt.miniapp.p3293h.C66188a.C661902 */

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67189a
                /* renamed from: a */
                public void mo231527a() {
                    AbstractC67550j.AbstractC67551a aVar = aVar;
                    if (aVar != null) {
                        aVar.onNativeModuleCall("-1");
                    }
                }

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67189a
                /* renamed from: a */
                public void mo231528a(int i) {
                    AbstractC67550j.AbstractC67551a aVar = aVar;
                    if (aVar != null) {
                        aVar.onNativeModuleCall(String.valueOf(i));
                    }
                }
            });
        }
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, final AbstractC67550j.AbstractC67551a aVar) throws Exception {
        JSONArray optJSONArray = new JSONObject(str).optJSONArray("itemList");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        final String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.p3293h.C66188a.RunnableC661891 */

            public void run() {
                C66188a.this.mo231525a(strArr, aVar);
            }
        });
        return null;
    }
}
