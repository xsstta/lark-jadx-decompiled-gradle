package com.bytedance.ee.larkwebview.p667a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.ee.larkwebview.p667a.C13390c;

/* renamed from: com.bytedance.ee.larkwebview.a.b */
public class C13388b {

    /* renamed from: a */
    public boolean f35298a;

    /* renamed from: com.bytedance.ee.larkwebview.a.b$a */
    public static class C13389a extends AbstractC13387a {

        /* renamed from: a */
        private C13388b f35299a = new C13388b();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13388b mo49693a() {
            return this.f35299a;
        }

        protected C13389a(C13390c.C13392a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.larkwebview.p667a.AbstractC13387a
        /* renamed from: a */
        public void mo49691a(Context context) {
            boolean z = false;
            if (context != null) {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                int i = applicationInfo.flags & 2;
                applicationInfo.flags = i;
                if (i != 0) {
                    z = true;
                }
            }
            this.f35299a.f35298a = z;
        }
    }

    /* renamed from: a */
    public boolean mo49692a() {
        return this.f35298a;
    }
}
