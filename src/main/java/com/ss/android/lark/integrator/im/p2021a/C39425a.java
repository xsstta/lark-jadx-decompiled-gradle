package com.ss.android.lark.integrator.im.p2021a;

import android.content.Context;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.p2029i.C39640a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1425c.C29992a;
import com.ss.android.lark.p1425c.p1426a.AbstractC29994a;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.a.a */
public class C39425a {

    /* renamed from: a */
    private static final Map<C29992a, AbstractC29561h> f100776a = new ConcurrentHashMap();

    /* renamed from: b */
    private static volatile C29992a f100777b;

    /* renamed from: a */
    public static C29992a m155694a() {
        if (f100777b == null) {
            synchronized (C39425a.class) {
                if (f100777b == null) {
                    f100777b = new C29992a(m155693a(LarkContext.getApplication()));
                    m155695a(f100777b);
                }
            }
        }
        return f100777b;
    }

    /* renamed from: a */
    private static void m155695a(C29992a aVar) {
        m155696b(aVar);
    }

    /* renamed from: a */
    private static AbstractC29994a m155693a(final Context context) {
        return new AbstractC29994a() {
            /* class com.ss.android.lark.integrator.im.p2021a.C39425a.C394261 */

            @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a
            /* renamed from: a */
            public Context mo108072a() {
                return context;
            }

            @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a
            /* renamed from: b */
            public AbstractC29994a.AbstractC29995a mo108074b() {
                return new AbstractC29994a.AbstractC29995a() {
                    /* class com.ss.android.lark.integrator.im.p2021a.C39425a.C394261.C394271 */

                    @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a.AbstractC29995a
                    /* renamed from: a */
                    public List<String> mo108077a() {
                        C29550b c = m155702c();
                        if (c == null) {
                            return null;
                        }
                        return c.mo105643d();
                    }

                    @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a.AbstractC29995a
                    /* renamed from: b */
                    public int mo108078b() {
                        C29550b c = m155702c();
                        if (c == null) {
                            return -1;
                        }
                        return c.mo105647e();
                    }

                    /* renamed from: c */
                    private C29550b m155702c() {
                        C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
                        if (v != null) {
                            return v;
                        }
                        Log.m165383e("AppRating", "AppConfigModule is null");
                        return null;
                    }
                };
            }

            @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a
            /* renamed from: c */
            public AbstractC29994a.AbstractC29996b mo108075c() {
                return new AbstractC29994a.AbstractC29996b() {
                    /* class com.ss.android.lark.integrator.im.p2021a.C39425a.C394261.C394282 */

                    @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a.AbstractC29996b
                    /* renamed from: a */
                    public int mo108079a() {
                        C37262a a = C39640a.m157299a();
                        if (a != null) {
                            return a.mo136983g().mo137460i();
                        }
                        Log.m165383e("AppRating", "FeedModule is null");
                        return 0;
                    }

                    @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a.AbstractC29996b
                    /* renamed from: b */
                    public int mo108080b() {
                        C37262a a = C39640a.m157299a();
                        if (a != null) {
                            return a.mo136983g().mo137461j();
                        }
                        Log.m165383e("AppRating", "FeedModule is null");
                        return 0;
                    }
                };
            }

            @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a
            /* renamed from: d */
            public boolean mo108076d() {
                return C39603g.m157160b().isUsPackage();
            }

            @Override // com.ss.android.lark.p1425c.p1426a.AbstractC29994a
            /* renamed from: a */
            public boolean mo108073a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }
        };
    }

    /* renamed from: b */
    private static void m155696b(final C29992a aVar) {
        C394292 r0 = new AbstractC29561h() {
            /* class com.ss.android.lark.integrator.im.p2021a.C39425a.C394292 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29561h
            /* renamed from: a */
            public void mo102523a(Class cls) {
                aVar.mo108069b();
            }
        };
        f100776a.put(aVar, r0);
        C39603g.m157159a().getCoreDependency().mo143473a(r0);
    }
}
