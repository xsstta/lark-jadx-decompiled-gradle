package com.bytedance.ee.bear.middleground.comment;

import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.input.MentionTitleResult;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9104a;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.comment.d */
public class C9185d {

    /* renamed from: a */
    public static AbstractC9188a f24684a;

    /* renamed from: b */
    public static String f24685b;

    /* renamed from: c */
    public static int f24686c;

    /* renamed from: d */
    private static AbstractC9106c f24687d;

    /* renamed from: com.bytedance.ee.bear.middleground.comment.d$a */
    public interface AbstractC9188a {
        /* renamed from: a */
        String mo17209a();

        /* renamed from: a */
        void mo17210a(String str);

        /* renamed from: b */
        String mo17211b();

        /* renamed from: d */
        Boolean mo17213d();
    }

    /* renamed from: a */
    public static AbstractC9106c m37997a() {
        if (f24687d == null) {
            f24687d = new AbstractC9106c() {
                /* class com.bytedance.ee.bear.middleground.comment.C9185d.C91861 */

                @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c
                /* renamed from: e */
                public int mo34732e() {
                    return 1;
                }

                @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c
                /* renamed from: d */
                public String mo34731d() {
                    return C9185d.f24685b;
                }

                @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c
                /* renamed from: a */
                public AbstractC9104a mo34726a() {
                    return new AbstractC9104a() {
                        /* class com.bytedance.ee.bear.middleground.comment.C9185d.C91861.C91871 */

                        @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9104a
                        /* renamed from: a */
                        public void mo34724a(String str, Map map) {
                            if (!(C9185d.f24684a == null || map == null)) {
                                map.put("app_id", C9185d.f24684a.mo17211b());
                            }
                            C5234y.m21391b().mo21079a(str, map);
                        }

                        @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9104a
                        /* renamed from: b */
                        public void mo34725b(String str, Map map) {
                            if (!(C9185d.f24684a == null || map == null)) {
                                map.put("app_id", C9185d.f24684a.mo17211b());
                            }
                            C5234y.m21391b().mo21084b(str, map);
                        }
                    };
                }

                @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c
                /* renamed from: b */
                public boolean mo34729b() {
                    if (C9185d.f24684a != null) {
                        return C9185d.f24684a.mo17213d().booleanValue();
                    }
                    return C4511g.m18594d().mo17353N();
                }

                @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c
                /* renamed from: c */
                public String mo34730c() {
                    if (C9185d.f24684a != null) {
                        return C9185d.f24684a.mo17209a();
                    }
                    AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
                    if (f != null) {
                        return f.f14584a;
                    }
                    return "";
                }

                @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c
                /* renamed from: a */
                public void mo34728a(String str) {
                    if (C9185d.f24684a != null) {
                        C9185d.f24684a.mo17210a(str);
                    } else {
                        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(str);
                    }
                }

                @Override // com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c
                /* renamed from: a */
                public Disposable mo34727a(String str, Function2<BearUrl, MentionTitleResult, Unit> kVar) {
                    if (!C6313i.m25327a().mo25392c(str)) {
                        return null;
                    }
                    BearUrl g = C6313i.m25327a().mo25399g(str);
                    NetService.C5077f fVar = new NetService.C5077f("api/meta/");
                    fVar.mo20145a(ShareHitPoint.f121869d, C8275a.m34051b(g.f17446a) + "");
                    fVar.mo20145a("token", g.f17447b);
                    return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20118a(MentionTitleResult.class).mo20141a(fVar).mo238001b(new Consumer(g) {
                        /* class com.bytedance.ee.bear.middleground.comment.$$Lambda$d$1$Q3UmviQmMlX85k4x6_SRewJz0 */
                        public final /* synthetic */ BearUrl f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C9185d.C91861.m37999a(Function2.this, this.f$1, (MentionTitleResult) obj);
                        }
                    }, $$Lambda$d$1$lUjRb_9PieXFTgAtpWCHmlC7LLk.INSTANCE);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m37999a(Function2 kVar, BearUrl bearUrl, MentionTitleResult mentionTitleResult) throws Exception {
                    Unit unit = (Unit) kVar.invoke(bearUrl, mentionTitleResult);
                }
            };
        }
        return f24687d;
    }
}
