package com.bytedance.ee.larkbrand.service.extension;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.CardContent;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.service.extension.k */
public interface AbstractC13322k {

    /* renamed from: com.bytedance.ee.larkbrand.service.extension.k$a */
    public interface AbstractC13323a {
        /* renamed from: a */
        void mo49149a(List<String> list, List<String> list2);
    }

    /* renamed from: com.bytedance.ee.larkbrand.service.extension.k$b */
    public interface AbstractC13324b {
        /* renamed from: a */
        void mo49598a(boolean z, boolean z2, String str);
    }

    /* renamed from: a */
    List<C13325c> mo49595a(List<String> list, String str);

    /* renamed from: a */
    void mo49596a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC13324b bVar);

    /* renamed from: a */
    void mo49597a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC13324b bVar);

    /* renamed from: com.bytedance.ee.larkbrand.service.extension.k$c */
    public static class C13325c {

        /* renamed from: a */
        public String f35209a;

        /* renamed from: b */
        public int f35210b;

        /* renamed from: c */
        public String f35211c;

        /* renamed from: d */
        public String f35212d;

        public C13325c(String str, int i, String str2, String str3) {
            this.f35209a = str;
            this.f35210b = i;
            this.f35211c = str2;
            this.f35212d = str3;
        }
    }
}
