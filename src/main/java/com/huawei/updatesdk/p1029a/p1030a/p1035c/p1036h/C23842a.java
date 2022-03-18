package com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h;

import android.content.Context;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.C23839e;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.AbstractC23866b;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.huawei.updatesdk.a.a.c.h.a */
public class C23842a extends AbstractC23866b {
    private String abis_;
    private String deviceFeatures_;
    private int dpi_;
    private String preferLan_;

    /* renamed from: com.huawei.updatesdk.a.a.c.h.a$b */
    public static class C23844b {

        /* renamed from: a */
        private final Context f59047a;

        /* renamed from: b */
        private boolean f59048b;

        /* renamed from: c */
        private Set<String> f59049c;

        /* renamed from: d */
        private String[] f59050d;

        /* renamed from: e */
        private boolean f59051e;

        public C23844b(Context context) {
            this.f59047a = context;
        }

        /* renamed from: b */
        private String m87148b() {
            ArrayList arrayList = new ArrayList(C23845b.m87164d(this.f59047a));
            Set<String> set = this.f59049c;
            if (set != null) {
                for (String str : set) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            return this.f59051e ? C23839e.m87131a(C23845b.m87156a(arrayList, this.f59050d), ",") : C23839e.m87131a(arrayList, ",");
        }

        /* renamed from: a */
        public C23844b mo85571a(boolean z) {
            this.f59048b = z;
            return this;
        }

        /* renamed from: a */
        public C23842a mo85572a() {
            C23842a aVar = new C23842a();
            aVar.abis_ = C23839e.m87133a(C23845b.m87166e(), ",");
            aVar.dpi_ = Integer.parseInt(C23845b.m87168f(this.f59047a));
            aVar.preferLan_ = m87148b();
            if (this.f59048b) {
                aVar.deviceFeatures_ = C23845b.m87152a(this.f59047a);
            }
            return aVar;
        }
    }

    private C23842a() {
    }
}
