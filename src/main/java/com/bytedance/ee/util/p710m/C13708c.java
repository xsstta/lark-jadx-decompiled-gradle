package com.bytedance.ee.util.p710m;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.bear.permission.AbstractC10475b;
import com.bytedance.ee.bear.permission.C10477d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p710m.C13708c;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.util.m.c */
public class C13708c {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.util.m.c$a */
    public static class C13709a implements AbstractC10475b {

        /* renamed from: a */
        Activity f35902a;

        /* renamed from: b */
        AbstractC13707b f35903b;

        /* renamed from: c */
        AbstractC13706a f35904c;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m55602c(boolean z) {
            this.f35903b.onCheckResult(z);
        }

        @Override // com.bytedance.ee.bear.permission.AbstractC10475b
        /* renamed from: b */
        public void mo39798b(boolean z) {
            AbstractC13706a aVar = this.f35904c;
            if (aVar != null) {
                aVar.onDialogStateChange(z);
            }
        }

        @Override // com.bytedance.ee.bear.permission.AbstractC10475b
        /* renamed from: a */
        public void mo39797a(boolean z) {
            C13479a.m54772d("PermissionCheck", "PermissionCheckServiceImpl handlePermissionResult: isGrant=" + z);
            if (this.f35903b != null) {
                C13479a.m54772d("PermissionCheck", "handlePermissionResult: call onCheckResult");
                C13742g.m55705a(new Runnable(z) {
                    /* class com.bytedance.ee.util.p710m.$$Lambda$c$a$a2Ddz9cecjRHWfn3COpuPNEo6Z8 */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C13708c.C13709a.this.m55602c(this.f$1);
                    }
                });
            }
        }

        public C13709a(Activity activity, AbstractC13707b bVar) {
            this.f35902a = activity;
            this.f35903b = bVar;
        }

        public C13709a(Activity activity, AbstractC13707b bVar, AbstractC13706a aVar) {
            this.f35902a = activity;
            this.f35903b = bVar;
            this.f35904c = aVar;
        }
    }

    /* renamed from: a */
    public static void m55598a(Context context, String str, String str2, AbstractC13707b bVar) {
        m55599a(context, str, str2, true, bVar);
    }

    /* renamed from: a */
    public static void m55600a(Context context, HashMap<String, String> hashMap, AbstractC13707b bVar, AbstractC13706a aVar) {
        C13479a.m54772d("PermissionCheck", "PermissionCheckServiceImpl checkRequestedPermissions: " + hashMap.toString() + " callback=" + bVar);
        new C10477d().mo39802a(context, hashMap, true, new C13709a(null, bVar, aVar));
    }

    /* renamed from: a */
    public static void m55601a(Context context, HashMap<String, String> hashMap, boolean z, AbstractC13707b bVar) {
        C13479a.m54772d("PermissionCheck", "PermissionCheckServiceImpl checkRequestedPermissions: " + hashMap.toString() + " callback=" + bVar);
        new C10477d().mo39802a(context, hashMap, z, new C13709a(null, bVar));
    }

    /* renamed from: a */
    public static void m55599a(Context context, String str, String str2, boolean z, AbstractC13707b bVar) {
        C13479a.m54772d("PermissionCheck", "PermissionCheckServiceImpl checkRequestedPermissions: " + str + " callback=" + bVar);
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(str, str2);
        new C10477d().mo39802a(context, hashMap, z, new C13709a(null, bVar));
    }
}
