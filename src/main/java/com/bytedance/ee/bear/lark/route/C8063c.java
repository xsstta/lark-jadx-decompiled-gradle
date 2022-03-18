package com.bytedance.ee.bear.lark.route;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.route.AbstractC10736a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.route.c */
public class C8063c extends AbstractC10736a {
    /* renamed from: b */
    private String m32248b() {
        return "/list/template4/activity";
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/list/template4/activity";
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        boolean equals = TextUtils.equals("template_center", bearUrl.f17446a);
        if (equals) {
            mo31162b(bearUrl, routeBean);
        }
        return equals;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32244a(String str, RouteBean routeBean, String str2, String str3, String str4, long j, long j2, long j3, String str5, int i, String str6, String str7) throws Exception {
        m32246a(str, new AbstractC68309a(routeBean, str7, str2, str3, str4, j, str, j2, j3, str5, i, str6) {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$Bm6fQR5iaGp_8xK_5pIMz_OnQSM */
            public final /* synthetic */ RouteBean f$1;
            public final /* synthetic */ String f$10;
            public final /* synthetic */ int f$11;
            public final /* synthetic */ String f$12;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ long f$6;
            public final /* synthetic */ String f$7;
            public final /* synthetic */ long f$8;
            public final /* synthetic */ long f$9;

            {
                this.f$1 = r5;
                this.f$2 = r6;
                this.f$3 = r7;
                this.f$4 = r8;
                this.f$5 = r9;
                this.f$6 = r10;
                this.f$7 = r12;
                this.f$8 = r13;
                this.f$9 = r15;
                this.f$10 = r17;
                this.f$11 = r18;
                this.f$12 = r19;
            }

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C8063c.this.m32239a((C8063c) this.f$1, (RouteBean) this.f$2, this.f$3, this.f$4, this.f$5, (String) this.f$6, (long) this.f$7, (String) this.f$8, this.f$9, (long) this.f$10, (String) this.f$11, (int) this.f$12);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32245a(String str, RouteBean routeBean, String str2, String str3, String str4, long j, long j2, long j3, String str5, int i, String str6, Throwable th) throws Exception {
        C13479a.m54759a("TempCenterRouteInterceptor", "route(bearUrl, routeBean)...error", th);
        m32246a(str, new AbstractC68309a(routeBean, str2, str3, str4, j, str, j2, j3, str5, i, str6) {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$qlzW877Ni9OA46XEcw3SoatQD0 */
            public final /* synthetic */ RouteBean f$1;
            public final /* synthetic */ int f$10;
            public final /* synthetic */ String f$11;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ long f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ long f$7;
            public final /* synthetic */ long f$8;
            public final /* synthetic */ String f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r8;
                this.f$7 = r9;
                this.f$8 = r11;
                this.f$9 = r13;
                this.f$10 = r14;
                this.f$11 = r15;
            }

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C8063c.this.m32238a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11);
            }
        });
    }

    /* renamed from: a */
    private void m32246a(String str, AbstractC68309a aVar) {
        if ("applink".equals(str)) {
            this.f28725d.mo41507b(ak.class).mo238020d($$Lambda$c$z1cqzsiiFMfBYPz477JgVkPb4VU.INSTANCE).mo238021d(aVar).mo238001b($$Lambda$c$D2RtkpzI7RJfr4EFlB7zWCH6eEY.INSTANCE, $$Lambda$c$ijwLW1Jt1I1c5Ir0CstshR8gTUs.INSTANCE);
            return;
        }
        try {
            aVar.run();
        } catch (Exception e) {
            C13479a.m54761a("TempCenterRouteInterceptor", e);
        }
    }

    /* renamed from: a */
    private AbstractC68307f<String> m32234a() {
        return AbstractC68307f.m265083a(m32248b());
    }

    public C8063c(C10917c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m32249b(Throwable th) throws Exception {
        TemplateReport.f31011b.mo44226a("");
        C13479a.m54761a("TempCenterRouteInterceptor", th);
    }

    /* renamed from: a */
    private String m32236a(Map<String, String> map) {
        String str = map.get("templateCategory");
        if (str == null) {
            return map.get("categoryId");
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32237a(DocumentCreateInfo documentCreateInfo) throws Exception {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(documentCreateInfo.f14845d);
    }

    /* renamed from: b */
    public void mo31162b(BearUrl bearUrl, RouteBean routeBean) {
        Map<String, String> map;
        String str;
        int i;
        String str2;
        long j;
        long j2;
        long j3;
        String str3;
        String str4;
        String str5;
        String str6;
        long j4;
        String str7;
        long j5;
        String str8;
        String str9;
        long j6;
        long j7;
        Exception exc;
        String str10;
        String str11;
        Exception e;
        String str12;
        String a;
        String str13;
        String str14;
        String str15;
        String str16;
        long j8;
        String str17;
        String str18;
        C13479a.m54764b("TempCenterRouteInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        if (routeBean == null || routeBean.mo40633s() == null || routeBean.mo40633s().size() <= 0) {
            map = bearUrl.f17449d;
        } else {
            map = routeBean.mo40633s();
        }
        int i2 = -1;
        String str19 = null;
        String str20 = "";
        long j9 = -1;
        if (map != null) {
            try {
                str8 = map.get("from");
                try {
                    if ("create".equals(map.get("action"))) {
                        int a2 = C13721c.m55641a(map.get(ShareHitPoint.f121869d), 0);
                        String str21 = map.get("clickFrom");
                        String str22 = map.get("templateID");
                        if (!TextUtils.isEmpty(str22)) {
                            m32242a("", a2, str21, true, str22, str8);
                            return;
                        } else {
                            m32242a(map.get("token"), a2, str21, false, "", str8);
                            return;
                        }
                    } else {
                        str12 = map.get("openTemplateCenter");
                        try {
                            a = m32236a(map);
                            str13 = map.get("topicId");
                            str14 = map.get("sceneId");
                            str15 = map.get("objType");
                            str7 = map.get("fromAppLink");
                        } catch (Exception e2) {
                            e = e2;
                            str7 = str20;
                            j6 = -1;
                            j4 = -1;
                            str19 = str12;
                            j7 = -1;
                            exc = e;
                            str11 = str7;
                            str10 = str11;
                            C13479a.m54761a("TempCenterRouteInterceptor", exc);
                            str5 = str11;
                            str3 = str19;
                            str = str20;
                            str4 = str10;
                            str6 = str8;
                            j = j7;
                            str2 = str7;
                            j3 = j6;
                            j2 = j4;
                            i = -1;
                            m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
                                public final /* synthetic */ String f$1;
                                public final /* synthetic */ int f$10;
                                public final /* synthetic */ String f$11;
                                public final /* synthetic */ RouteBean f$2;
                                public final /* synthetic */ String f$3;
                                public final /* synthetic */ String f$4;
                                public final /* synthetic */ String f$5;
                                public final /* synthetic */ long f$6;
                                public final /* synthetic */ long f$7;
                                public final /* synthetic */ long f$8;
                                public final /* synthetic */ String f$9;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                    this.f$3 = r4;
                                    this.f$4 = r5;
                                    this.f$5 = r6;
                                    this.f$6 = r7;
                                    this.f$7 = r9;
                                    this.f$8 = r11;
                                    this.f$9 = r13;
                                    this.f$10 = r14;
                                    this.f$11 = r15;
                                }

                                @Override // io.reactivex.functions.Consumer
                                public final void accept(Object obj) {
                                    C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
                                }
                            }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
                                public final /* synthetic */ String f$1;
                                public final /* synthetic */ int f$10;
                                public final /* synthetic */ String f$11;
                                public final /* synthetic */ RouteBean f$2;
                                public final /* synthetic */ String f$3;
                                public final /* synthetic */ String f$4;
                                public final /* synthetic */ String f$5;
                                public final /* synthetic */ long f$6;
                                public final /* synthetic */ long f$7;
                                public final /* synthetic */ long f$8;
                                public final /* synthetic */ String f$9;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                    this.f$3 = r4;
                                    this.f$4 = r5;
                                    this.f$5 = r6;
                                    this.f$6 = r7;
                                    this.f$7 = r9;
                                    this.f$8 = r11;
                                    this.f$9 = r13;
                                    this.f$10 = r14;
                                    this.f$11 = r15;
                                }

                                @Override // io.reactivex.functions.Consumer
                                public final void accept(Object obj) {
                                    C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
                                }
                            });
                        }
                        try {
                            str16 = map.get("enterSource");
                            if (a != null) {
                                try {
                                    j6 = C13721c.m55642a(a, -1L);
                                } catch (Exception e3) {
                                    e = e3;
                                    j6 = -1;
                                    j4 = -1;
                                }
                            } else {
                                j6 = -1;
                            }
                            if (str13 != null) {
                                try {
                                    j4 = C13721c.m55642a(str13, -1L);
                                } catch (Exception e4) {
                                    e = e4;
                                    j4 = -1;
                                }
                            } else {
                                j4 = -1;
                            }
                            if (str14 != null) {
                                try {
                                    j9 = C13721c.m55642a(str14, -1L);
                                } catch (Exception e5) {
                                    str19 = str12;
                                    j7 = -1;
                                    exc = e5;
                                    str11 = str20;
                                    str10 = str11;
                                    str20 = str16;
                                    C13479a.m54761a("TempCenterRouteInterceptor", exc);
                                    str5 = str11;
                                    str3 = str19;
                                    str = str20;
                                    str4 = str10;
                                    str6 = str8;
                                    j = j7;
                                    str2 = str7;
                                    j3 = j6;
                                    j2 = j4;
                                    i = -1;
                                    m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                        /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
                                        public final /* synthetic */ String f$1;
                                        public final /* synthetic */ int f$10;
                                        public final /* synthetic */ String f$11;
                                        public final /* synthetic */ RouteBean f$2;
                                        public final /* synthetic */ String f$3;
                                        public final /* synthetic */ String f$4;
                                        public final /* synthetic */ String f$5;
                                        public final /* synthetic */ long f$6;
                                        public final /* synthetic */ long f$7;
                                        public final /* synthetic */ long f$8;
                                        public final /* synthetic */ String f$9;

                                        {
                                            this.f$1 = r2;
                                            this.f$2 = r3;
                                            this.f$3 = r4;
                                            this.f$4 = r5;
                                            this.f$5 = r6;
                                            this.f$6 = r7;
                                            this.f$7 = r9;
                                            this.f$8 = r11;
                                            this.f$9 = r13;
                                            this.f$10 = r14;
                                            this.f$11 = r15;
                                        }

                                        @Override // io.reactivex.functions.Consumer
                                        public final void accept(Object obj) {
                                            C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
                                        }
                                    }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                        /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
                                        public final /* synthetic */ String f$1;
                                        public final /* synthetic */ int f$10;
                                        public final /* synthetic */ String f$11;
                                        public final /* synthetic */ RouteBean f$2;
                                        public final /* synthetic */ String f$3;
                                        public final /* synthetic */ String f$4;
                                        public final /* synthetic */ String f$5;
                                        public final /* synthetic */ long f$6;
                                        public final /* synthetic */ long f$7;
                                        public final /* synthetic */ long f$8;
                                        public final /* synthetic */ String f$9;

                                        {
                                            this.f$1 = r2;
                                            this.f$2 = r3;
                                            this.f$3 = r4;
                                            this.f$4 = r5;
                                            this.f$5 = r6;
                                            this.f$6 = r7;
                                            this.f$7 = r9;
                                            this.f$8 = r11;
                                            this.f$9 = r13;
                                            this.f$10 = r14;
                                            this.f$11 = r15;
                                        }

                                        @Override // io.reactivex.functions.Consumer
                                        public final void accept(Object obj) {
                                            C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
                                        }
                                    });
                                }
                            }
                            if (!TextUtils.isEmpty(str8)) {
                                str18 = str20;
                                str17 = "chat";
                            } else {
                                String str23 = map.get("MODULE");
                                try {
                                    str17 = str23;
                                    str18 = map.get("ROOT_TOKEN");
                                } catch (Exception e6) {
                                    j8 = j9;
                                    exc = e6;
                                    str11 = str23;
                                    str10 = str20;
                                    str19 = str12;
                                    str20 = str16;
                                    j7 = j8;
                                    C13479a.m54761a("TempCenterRouteInterceptor", exc);
                                    str5 = str11;
                                    str3 = str19;
                                    str = str20;
                                    str4 = str10;
                                    str6 = str8;
                                    j = j7;
                                    str2 = str7;
                                    j3 = j6;
                                    j2 = j4;
                                    i = -1;
                                    m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                        /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
                                        public final /* synthetic */ String f$1;
                                        public final /* synthetic */ int f$10;
                                        public final /* synthetic */ String f$11;
                                        public final /* synthetic */ RouteBean f$2;
                                        public final /* synthetic */ String f$3;
                                        public final /* synthetic */ String f$4;
                                        public final /* synthetic */ String f$5;
                                        public final /* synthetic */ long f$6;
                                        public final /* synthetic */ long f$7;
                                        public final /* synthetic */ long f$8;
                                        public final /* synthetic */ String f$9;

                                        {
                                            this.f$1 = r2;
                                            this.f$2 = r3;
                                            this.f$3 = r4;
                                            this.f$4 = r5;
                                            this.f$5 = r6;
                                            this.f$6 = r7;
                                            this.f$7 = r9;
                                            this.f$8 = r11;
                                            this.f$9 = r13;
                                            this.f$10 = r14;
                                            this.f$11 = r15;
                                        }

                                        @Override // io.reactivex.functions.Consumer
                                        public final void accept(Object obj) {
                                            C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
                                        }
                                    }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                        /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
                                        public final /* synthetic */ String f$1;
                                        public final /* synthetic */ int f$10;
                                        public final /* synthetic */ String f$11;
                                        public final /* synthetic */ RouteBean f$2;
                                        public final /* synthetic */ String f$3;
                                        public final /* synthetic */ String f$4;
                                        public final /* synthetic */ String f$5;
                                        public final /* synthetic */ long f$6;
                                        public final /* synthetic */ long f$7;
                                        public final /* synthetic */ long f$8;
                                        public final /* synthetic */ String f$9;

                                        {
                                            this.f$1 = r2;
                                            this.f$2 = r3;
                                            this.f$3 = r4;
                                            this.f$4 = r5;
                                            this.f$5 = r6;
                                            this.f$6 = r7;
                                            this.f$7 = r9;
                                            this.f$8 = r11;
                                            this.f$9 = r13;
                                            this.f$10 = r14;
                                            this.f$11 = r15;
                                        }

                                        @Override // io.reactivex.functions.Consumer
                                        public final void accept(Object obj) {
                                            C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
                                        }
                                    });
                                }
                            }
                            try {
                                i2 = C13721c.m55641a(str15, -1);
                                str4 = str18;
                                str9 = str17;
                                str19 = str12;
                                str20 = str16;
                                j5 = j9;
                                j9 = j6;
                            } catch (Exception e7) {
                                j8 = j9;
                                exc = e7;
                                str10 = str18;
                                str11 = str17;
                                str19 = str12;
                                str20 = str16;
                                j7 = j8;
                                C13479a.m54761a("TempCenterRouteInterceptor", exc);
                                str5 = str11;
                                str3 = str19;
                                str = str20;
                                str4 = str10;
                                str6 = str8;
                                j = j7;
                                str2 = str7;
                                j3 = j6;
                                j2 = j4;
                                i = -1;
                                m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                    /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
                                    public final /* synthetic */ String f$1;
                                    public final /* synthetic */ int f$10;
                                    public final /* synthetic */ String f$11;
                                    public final /* synthetic */ RouteBean f$2;
                                    public final /* synthetic */ String f$3;
                                    public final /* synthetic */ String f$4;
                                    public final /* synthetic */ String f$5;
                                    public final /* synthetic */ long f$6;
                                    public final /* synthetic */ long f$7;
                                    public final /* synthetic */ long f$8;
                                    public final /* synthetic */ String f$9;

                                    {
                                        this.f$1 = r2;
                                        this.f$2 = r3;
                                        this.f$3 = r4;
                                        this.f$4 = r5;
                                        this.f$5 = r6;
                                        this.f$6 = r7;
                                        this.f$7 = r9;
                                        this.f$8 = r11;
                                        this.f$9 = r13;
                                        this.f$10 = r14;
                                        this.f$11 = r15;
                                    }

                                    @Override // io.reactivex.functions.Consumer
                                    public final void accept(Object obj) {
                                        C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
                                    }
                                }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                    /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
                                    public final /* synthetic */ String f$1;
                                    public final /* synthetic */ int f$10;
                                    public final /* synthetic */ String f$11;
                                    public final /* synthetic */ RouteBean f$2;
                                    public final /* synthetic */ String f$3;
                                    public final /* synthetic */ String f$4;
                                    public final /* synthetic */ String f$5;
                                    public final /* synthetic */ long f$6;
                                    public final /* synthetic */ long f$7;
                                    public final /* synthetic */ long f$8;
                                    public final /* synthetic */ String f$9;

                                    {
                                        this.f$1 = r2;
                                        this.f$2 = r3;
                                        this.f$3 = r4;
                                        this.f$4 = r5;
                                        this.f$5 = r6;
                                        this.f$6 = r7;
                                        this.f$7 = r9;
                                        this.f$8 = r11;
                                        this.f$9 = r13;
                                        this.f$10 = r14;
                                        this.f$11 = r15;
                                    }

                                    @Override // io.reactivex.functions.Consumer
                                    public final void accept(Object obj) {
                                        C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
                                    }
                                });
                            }
                        } catch (Exception e8) {
                            j6 = -1;
                            j4 = -1;
                            str19 = str12;
                            exc = e8;
                            str11 = str20;
                            str10 = str11;
                            j7 = -1;
                            C13479a.m54761a("TempCenterRouteInterceptor", exc);
                            str5 = str11;
                            str3 = str19;
                            str = str20;
                            str4 = str10;
                            str6 = str8;
                            j = j7;
                            str2 = str7;
                            j3 = j6;
                            j2 = j4;
                            i = -1;
                            m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
                                public final /* synthetic */ String f$1;
                                public final /* synthetic */ int f$10;
                                public final /* synthetic */ String f$11;
                                public final /* synthetic */ RouteBean f$2;
                                public final /* synthetic */ String f$3;
                                public final /* synthetic */ String f$4;
                                public final /* synthetic */ String f$5;
                                public final /* synthetic */ long f$6;
                                public final /* synthetic */ long f$7;
                                public final /* synthetic */ long f$8;
                                public final /* synthetic */ String f$9;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                    this.f$3 = r4;
                                    this.f$4 = r5;
                                    this.f$5 = r6;
                                    this.f$6 = r7;
                                    this.f$7 = r9;
                                    this.f$8 = r11;
                                    this.f$9 = r13;
                                    this.f$10 = r14;
                                    this.f$11 = r15;
                                }

                                @Override // io.reactivex.functions.Consumer
                                public final void accept(Object obj) {
                                    C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
                                }
                            }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                                /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
                                public final /* synthetic */ String f$1;
                                public final /* synthetic */ int f$10;
                                public final /* synthetic */ String f$11;
                                public final /* synthetic */ RouteBean f$2;
                                public final /* synthetic */ String f$3;
                                public final /* synthetic */ String f$4;
                                public final /* synthetic */ String f$5;
                                public final /* synthetic */ long f$6;
                                public final /* synthetic */ long f$7;
                                public final /* synthetic */ long f$8;
                                public final /* synthetic */ String f$9;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                    this.f$3 = r4;
                                    this.f$4 = r5;
                                    this.f$5 = r6;
                                    this.f$6 = r7;
                                    this.f$7 = r9;
                                    this.f$8 = r11;
                                    this.f$9 = r13;
                                    this.f$10 = r14;
                                    this.f$11 = r15;
                                }

                                @Override // io.reactivex.functions.Consumer
                                public final void accept(Object obj) {
                                    C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
                                }
                            });
                        }
                    }
                } catch (Exception e9) {
                    e = e9;
                    str7 = str20;
                    j7 = -1;
                    j6 = -1;
                    j4 = -1;
                    exc = e;
                    str11 = str7;
                    str10 = str11;
                    C13479a.m54761a("TempCenterRouteInterceptor", exc);
                    str5 = str11;
                    str3 = str19;
                    str = str20;
                    str4 = str10;
                    str6 = str8;
                    j = j7;
                    str2 = str7;
                    j3 = j6;
                    j2 = j4;
                    i = -1;
                    m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                        /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ int f$10;
                        public final /* synthetic */ String f$11;
                        public final /* synthetic */ RouteBean f$2;
                        public final /* synthetic */ String f$3;
                        public final /* synthetic */ String f$4;
                        public final /* synthetic */ String f$5;
                        public final /* synthetic */ long f$6;
                        public final /* synthetic */ long f$7;
                        public final /* synthetic */ long f$8;
                        public final /* synthetic */ String f$9;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                            this.f$5 = r6;
                            this.f$6 = r7;
                            this.f$7 = r9;
                            this.f$8 = r11;
                            this.f$9 = r13;
                            this.f$10 = r14;
                            this.f$11 = r15;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
                        }
                    }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                        /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ int f$10;
                        public final /* synthetic */ String f$11;
                        public final /* synthetic */ RouteBean f$2;
                        public final /* synthetic */ String f$3;
                        public final /* synthetic */ String f$4;
                        public final /* synthetic */ String f$5;
                        public final /* synthetic */ long f$6;
                        public final /* synthetic */ long f$7;
                        public final /* synthetic */ long f$8;
                        public final /* synthetic */ String f$9;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                            this.f$5 = r6;
                            this.f$6 = r7;
                            this.f$7 = r9;
                            this.f$8 = r11;
                            this.f$9 = r13;
                            this.f$10 = r14;
                            this.f$11 = r15;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
                        }
                    });
                }
            } catch (Exception e10) {
                e = e10;
                str8 = null;
                str7 = str20;
                j7 = -1;
                j6 = -1;
                j4 = -1;
                exc = e;
                str11 = str7;
                str10 = str11;
                C13479a.m54761a("TempCenterRouteInterceptor", exc);
                str5 = str11;
                str3 = str19;
                str = str20;
                str4 = str10;
                str6 = str8;
                j = j7;
                str2 = str7;
                j3 = j6;
                j2 = j4;
                i = -1;
                m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                    /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ int f$10;
                    public final /* synthetic */ String f$11;
                    public final /* synthetic */ RouteBean f$2;
                    public final /* synthetic */ String f$3;
                    public final /* synthetic */ String f$4;
                    public final /* synthetic */ String f$5;
                    public final /* synthetic */ long f$6;
                    public final /* synthetic */ long f$7;
                    public final /* synthetic */ long f$8;
                    public final /* synthetic */ String f$9;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                        this.f$6 = r7;
                        this.f$7 = r9;
                        this.f$8 = r11;
                        this.f$9 = r13;
                        this.f$10 = r14;
                        this.f$11 = r15;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
                    }
                }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
                    /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ int f$10;
                    public final /* synthetic */ String f$11;
                    public final /* synthetic */ RouteBean f$2;
                    public final /* synthetic */ String f$3;
                    public final /* synthetic */ String f$4;
                    public final /* synthetic */ String f$5;
                    public final /* synthetic */ long f$6;
                    public final /* synthetic */ long f$7;
                    public final /* synthetic */ long f$8;
                    public final /* synthetic */ String f$9;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                        this.f$6 = r7;
                        this.f$7 = r9;
                        this.f$8 = r11;
                        this.f$9 = r13;
                        this.f$10 = r14;
                        this.f$11 = r15;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
                    }
                });
            }
        } else {
            str8 = null;
            str9 = str20;
            str4 = str9;
            str7 = str4;
            j5 = -1;
            j4 = -1;
        }
        i = i2;
        str3 = str19;
        str = str20;
        j3 = j9;
        j = j5;
        str2 = str7;
        j2 = j4;
        str5 = str9;
        str6 = str8;
        m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$10;
            public final /* synthetic */ String f$11;
            public final /* synthetic */ RouteBean f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ long f$6;
            public final /* synthetic */ long f$7;
            public final /* synthetic */ long f$8;
            public final /* synthetic */ String f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r9;
                this.f$8 = r11;
                this.f$9 = r13;
                this.f$10 = r14;
                this.f$11 = r15;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
            }
        }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$10;
            public final /* synthetic */ String f$11;
            public final /* synthetic */ RouteBean f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ long f$6;
            public final /* synthetic */ long f$7;
            public final /* synthetic */ long f$8;
            public final /* synthetic */ String f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r9;
                this.f$8 = r11;
                this.f$9 = r13;
                this.f$10 = r14;
                this.f$11 = r15;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
            }
        });
        str19 = str12;
        exc = e;
        str11 = str20;
        str10 = str11;
        j7 = j4;
        str20 = str16;
        C13479a.m54761a("TempCenterRouteInterceptor", exc);
        str5 = str11;
        str3 = str19;
        str = str20;
        str4 = str10;
        str6 = str8;
        j = j7;
        str2 = str7;
        j3 = j6;
        j2 = j4;
        i = -1;
        m32234a().mo238001b(new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2pcsEaShDdd2HpUR2g0foQGOxQk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$10;
            public final /* synthetic */ String f$11;
            public final /* synthetic */ RouteBean f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ long f$6;
            public final /* synthetic */ long f$7;
            public final /* synthetic */ long f$8;
            public final /* synthetic */ String f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r9;
                this.f$8 = r11;
                this.f$9 = r13;
                this.f$10 = r14;
                this.f$11 = r15;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8063c.this.m32244a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) obj);
            }
        }, new Consumer(str6, routeBean, str5, str4, str3, j3, j2, j, str2, i, str) {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$uGSZdnU8__Yb1wh5bmTkv7WFrtQ */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$10;
            public final /* synthetic */ String f$11;
            public final /* synthetic */ RouteBean f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ long f$6;
            public final /* synthetic */ long f$7;
            public final /* synthetic */ long f$8;
            public final /* synthetic */ String f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r9;
                this.f$8 = r11;
                this.f$9 = r13;
                this.f$10 = r14;
                this.f$11 = r15;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8063c.this.m32245a((C8063c) this.f$1, (String) this.f$2, (RouteBean) this.f$3, this.f$4, this.f$5, (String) this.f$6, this.f$7, this.f$8, (long) this.f$9, (String) this.f$10, (int) this.f$11, (String) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32243a(String str, DocumentCreateInfo documentCreateInfo) throws Exception {
        TemplateReport.f31011b.mo44226a("");
        m32246a(str, new AbstractC68309a() {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$lddJ0_1k4f3axbq29ASj_xQ2gg */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C8063c.m32237a(DocumentCreateInfo.this);
            }
        });
    }

    /* renamed from: a */
    private void m32242a(String str, int i, String str2, boolean z, String str3, String str4) {
        String str5;
        TemplateReport eVar = TemplateReport.f31011b;
        if (str2 != null) {
            str5 = str2;
        } else {
            str5 = "";
        }
        eVar.mo44226a(str5);
        new DocumentCreateHelper(this.f28725d).mo31352a(str, i, "", false, "", true, "", z, str3).mo238001b(new Consumer(str4) {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$c$2o922_7W8uksoQAkZMjFy9dPL6Q */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8063c.this.m32243a((C8063c) this.f$1, (String) ((DocumentCreateInfo) obj));
            }
        }, $$Lambda$c$o_nsEaw8MYXhOvlCmSiRgDFhoU.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32238a(RouteBean routeBean, String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, int i, String str6) throws Exception {
        m32240a(routeBean, m32248b(), str, str2, str3, Long.valueOf(j), str4, j2, j3, str5, i, str6);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32239a(RouteBean routeBean, String str, String str2, String str3, String str4, long j, String str5, long j2, long j3, String str6, int i, String str7) throws Exception {
        m32240a(routeBean, str, str2, str3, str4, Long.valueOf(j), str5, j2, j3, str6, i, str7);
    }

    /* renamed from: a */
    private void m32240a(RouteBean routeBean, String str, String str2, String str3, String str4, Long l, String str5, long j, long j2, String str6, int i, String str7) {
        PostCard b = ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b(str);
        if (routeBean != null) {
            b.mo17312a("extra_data_map", (Serializable) routeBean.mo40633s());
        }
        b.mo17314a("MODULE", str2).mo17314a("ROOT_TOKEN", str3).mo17314a("openTemplateCenter", str4).mo17309a("templateCategory", l.longValue()).mo17314a("from", str5).mo17309a("topicId", j).mo17309a("sceneId", j2).mo17314a("fromAppLink", str6).mo17314a("enterSource", str7).mo17308a("objType", i).mo17317a();
    }
}
