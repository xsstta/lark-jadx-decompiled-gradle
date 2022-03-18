package com.bytedance.ee.bear.middleground.comment.p449g;

import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9104a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.middleground.comment.g.a */
public class C9226a {

    /* renamed from: a */
    private final String f24840a;

    /* renamed from: b */
    private final String f24841b;

    /* renamed from: c */
    private final boolean f24842c;

    /* renamed from: d */
    private final String f24843d;

    /* renamed from: e */
    private final boolean f24844e;

    /* renamed from: f */
    private final AbstractC9234g f24845f;

    /* renamed from: g */
    private AbstractC9104a f24846g;

    /* renamed from: com.bytedance.ee.bear.middleground.comment.g.a$a */
    private static class C9228a implements AbstractC9104a {
        @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9104a
        /* renamed from: a */
        public void mo34724a(String str, Map map) {
        }

        @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9104a
        /* renamed from: b */
        public void mo34725b(String str, Map map) {
        }

        private C9228a() {
        }
    }

    /* renamed from: d */
    private Map<String, Object> m38267d() {
        HashMap hashMap = new HashMap();
        m38259a(hashMap);
        m38263b(hashMap);
        hashMap.put("target", "none");
        return hashMap;
    }

    /* renamed from: a */
    public void mo35300a() {
        C13479a.m54772d("CommentAnalytic", "reportClickInsertImage");
        mo35303a("click_image_icon", null, "", "", false);
    }

    /* renamed from: b */
    public void mo35305b() {
        String str;
        Map<String, Object> d = m38267d();
        if (this.f24844e) {
            str = "full_comment";
        } else {
            str = "part_comment";
        }
        d.put("sub_view", str);
        C13479a.m54772d("CommentAnalytic", "reportCommentView params = " + d);
        this.f24846g.mo34725b("ccm_comment_view", d);
    }

    /* renamed from: c */
    private AbstractC68307f<Map<String, String>> m38264c() {
        String str;
        HashMap hashMap = new HashMap();
        if (this.f24844e) {
            str = "full_comment";
        } else {
            str = "part_comment";
        }
        hashMap.put("comment_type", str);
        hashMap.put("file_type", this.f24841b + "");
        hashMap.put("file_id", C13598b.m55197d(this.f24840a));
        hashMap.put("module", this.f24841b + "");
        AbstractC9234g gVar = this.f24845f;
        if (gVar != null) {
            hashMap.put("is_owner", String.valueOf(gVar.isOwner()));
        }
        hashMap.put("is_audiocomnent", "false");
        return AbstractC68307f.m265083a(hashMap);
    }

    /* renamed from: b */
    public static Map<String, String> m38260b(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_audiocomnent", "" + z);
        return hashMap;
    }

    /* renamed from: a */
    private void m38259a(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : C5234y.m21391b().mo21086c("bizCommonParams").entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: b */
    private void m38263b(Map<String, Object> map) {
        HashMap<String, Object> c = C5234y.m21391b().mo21086c("docCommonParams");
        if (!c.isEmpty()) {
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return;
        }
        for (Map.Entry<String, Object> entry2 : C5234y.m21391b().mo21086c("driveCommonParams").entrySet()) {
            map.put(entry2.getKey(), entry2.getValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ String m38265c(Map map) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append("key:");
            sb.append(str);
            sb.append(" value:");
            sb.append((String) map.get(str));
            sb.append("   ");
        }
        C13479a.m54772d("CommentAnalytic", sb.toString());
        this.f24846g.mo34724a("client_comment", map);
        return "success";
    }

    /* renamed from: a */
    public void mo35301a(String str) {
        m38264c().mo238004b(C11678b.m48480d()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.middleground.comment.p449g.$$Lambda$a$T1NfuXD9v21yR98efewMC9QAOuk */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9226a.this.m38256a(this.f$1, (Map) obj);
            }
        }).mo238001b($$Lambda$a$hlYiShxrSDht1V4RQnNwQcHWKn0.INSTANCE, $$Lambda$a$67IoGqhLA7k47HS7FTViurzeOrQ.INSTANCE);
    }

    /* renamed from: a */
    public void mo35304a(boolean z) {
        String str;
        Map<String, String> b = m38260b(true);
        if (z) {
            str = "press";
        } else {
            str = "click";
        }
        b.put("mode", str);
        mo35303a("create_audiocomment", b, "", "", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m38256a(String str, Map map) throws Exception {
        map.put("operation", str);
        map.put("is_audiocomnent", "true");
        StringBuilder sb = new StringBuilder();
        for (String str2 : map.keySet()) {
            sb.append("key:");
            sb.append(str2);
            sb.append(" value:");
            sb.append((String) map.get(str2));
            sb.append("   ");
        }
        C13479a.m54772d("CommentAnalytic", sb.toString());
        this.f24846g.mo34724a("click_audiocomment_action", map);
        return "success";
    }

    /* renamed from: a */
    public void mo35302a(String str, String str2, String str3, Map<String, String> map) {
        Map<String, Object> d = m38267d();
        d.put("click", str);
        if (str2 != null) {
            d.put("comment_card_id", str2);
        }
        if (str3 != null) {
            d.put("comment_id", str3);
        }
        if (!"cancel_click".equals(str)) {
            d.put("is_full_comment_flag", String.valueOf(this.f24844e));
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                d.put(entry.getKey(), entry.getValue());
            }
        }
        C13479a.m54772d("CommentAnalytic", "reportCommentClick params = " + d);
        this.f24846g.mo34725b("ccm_comment_click", d);
    }

    /* renamed from: a */
    public void mo35303a(String str, Map<String, String> map, String str2, String str3, boolean z) {
        m38264c().mo238004b(C11678b.m48480d()).mo238020d(new Function(str, map, str2, str3, z) {
            /* class com.bytedance.ee.bear.middleground.comment.p449g.$$Lambda$a$BAHyFjMPWqMK6RiSbQeVaNuvCgE */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9226a.m38257a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Map) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.middleground.comment.p449g.$$Lambda$a$JDJQZu9EQkvXIlIumr8TsGJ7rP0 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9226a.this.m38265c((Map) obj);
            }
        }).mo238001b($$Lambda$a$HXQ70z5ruWULENMgNEMgEExRREM.INSTANCE, $$Lambda$a$dxxiQgb1xWMWqmfTZvYKW1yFDiE.INSTANCE);
    }

    public C9226a(String str, String str2, boolean z, String str3, boolean z2, AbstractC9234g gVar) {
        boolean z3;
        this.f24840a = str;
        this.f24841b = str2;
        if (C8275a.f22375h.mo32553a().equals(str2) || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f24844e = z3;
        this.f24845f = gVar;
        this.f24842c = z;
        this.f24843d = str3;
        AbstractC9104a a = C9185d.m37997a().mo34726a();
        this.f24846g = a;
        if (a == null) {
            this.f24846g = new C9228a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Map m38257a(String str, Map map, String str2, String str3, boolean z, Map map2) throws Exception {
        map2.put("action", str);
        if (map != null && !map.isEmpty()) {
            for (String str4 : map.keySet()) {
                map2.put(str4, map.get(str4));
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        map2.put("comment_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        map2.put("reply_id", str3);
        map2.put("is_first", z + "");
        return map2;
    }
}
