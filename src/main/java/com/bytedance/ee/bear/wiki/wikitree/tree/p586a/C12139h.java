package com.bytedance.ee.bear.wiki.wikitree.tree.p586a;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wiki.AbstractC11940d;
import com.bytedance.ee.bear.wiki.AbstractC11955g;
import com.bytedance.ee.bear.wiki.common.p579a.C11929a;
import com.bytedance.ee.bear.wiki.common.p579a.C11931b;
import com.bytedance.ee.bear.wiki.common.p580b.C11932a;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.wikitree.api.C12061c;
import com.bytedance.ee.bear.wiki.wikitree.api.CreateWikiRelationPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.DelWikiRelationPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetNodePuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetUserRolePuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetWikiChildPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetWikiRelationPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.MoveWikiRelationV2Puller;
import com.bytedance.ee.bear.wiki.wikitree.bean.C12075a;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.bean.NodeType;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.push.AddV2;
import com.bytedance.ee.bear.wiki.wikitree.push.C12129a;
import com.bytedance.ee.bear.wiki.wikitree.push.DelV2;
import com.bytedance.ee.bear.wiki.wikitree.push.MovV2;
import com.bytedance.ee.bear.wiki.wikitree.push.UdeArea;
import com.bytedance.ee.bear.wiki.wikitree.push.UdeAreaPerm;
import com.bytedance.ee.bear.wiki.wikitree.push.UdeV2;
import com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.huawei.hms.support.api.entity.core.CommonCode;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68314f;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70022d;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.a.h */
public final class C12139h implements C12129a.AbstractC12130a, AbstractC12132a {

    /* renamed from: a */
    private String f32701a = "Wiki_WikiTreeModelImpl";

    /* renamed from: b */
    private String f32702b = "";

    /* renamed from: c */
    private final String f32703c;

    /* renamed from: d */
    private final C10917c f32704d;

    /* renamed from: e */
    private final NetService f32705e;

    /* renamed from: f */
    private final C1177w<C12138g> f32706f = new C1177w<>();

    /* renamed from: g */
    private volatile C12137f f32707g;

    /* renamed from: h */
    private volatile C12133b f32708h;

    /* renamed from: i */
    private boolean f32709i;

    /* renamed from: j */
    private C12129a f32710j;

    /* renamed from: k */
    private C68289a f32711k = new C68289a();

    /* renamed from: l */
    private volatile String f32712l;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ GetWikiRelationPuller.Result m50256a(TreeNode treeNode, GetWikiRelationPuller.Result result) throws Exception {
        return result;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50271a(AbstractC11940d dVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50272a(AbstractC11955g gVar) throws Exception {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public LiveData<C12138g> mo46362a() {
        return this.f32706f;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: b */
    public HomePage mo46371b() {
        if (m50310l()) {
            return this.f32707g.mo46425h();
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: b */
    public boolean mo46373b(String str, String str2) {
        return m50310l() && this.f32707g.mo46416c(str, str2);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public void mo46367a(String str, String str2, boolean z) {
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.load, spaceId: %s, wikiToken: %s", C13721c.m55650d(str), C13721c.m55650d(str2)));
        if (!m50310l() || !TextUtils.equals(this.f32707g.mo46423g(), str) || !this.f32707g.mo46424g(str2)) {
            m50280a(str, str2, z, CommonCode.StatusCode.API_CLIENT_EXPIRED);
            return;
        }
        this.f32707g.mo46405a(str2, z);
        this.f32706f.mo5929b(C12138g.m50251a((int) CommonCode.StatusCode.API_CLIENT_EXPIRED, this.f32707g.mo46431k()).mo46432a("LOAD_TOKEN", str2));
        m50259a(AbstractC68307f.m265083a((Object) true), CommonCode.StatusCode.API_CLIENT_EXPIRED, str2).mo238036k();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public void mo46363a(C12136e eVar, String str, boolean z) {
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.load, spaceCore: %s, wikiToken: %s", C13721c.m55650d(eVar.mo46390a().getSpaceId()), C13721c.m55650d(str)));
        this.f32707g = new C12137f(eVar, this.f32702b);
        this.f32708h = new C12133b(this.f32707g, this.f32705e, this.f32702b);
        this.f32707g.mo46405a(str, z);
        this.f32706f.mo5929b(C12138g.m50251a((int) CommonCode.StatusCode.API_CLIENT_EXPIRED, this.f32707g.mo46431k()).mo46432a("LOAD_TOKEN", str));
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public void mo46369a(String str, boolean z) {
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.reloadTo, wikiToken: %s", C13721c.m55650d(str)));
        if (m50310l()) {
            m50280a(this.f32707g.mo46423g(), str, z, 1002);
        }
    }

    /* renamed from: a */
    private void m50280a(String str, String str2, boolean z, int i) {
        if (!m50304i(str)) {
            C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.loadInternal, different space id, unRegisterPush. ");
            m50306j();
        }
        this.f32711k.mo237937a(m50259a(m50296c(str, str2).mo238014c(new Function(str2, z) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$L_qWQPUnqtJmMpCUfGt0wc_rI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12139h.this.m50266a(this.f$1, this.f$2, (Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer(i) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$WfVnPntd7HdqyUzke5aINx4iAk */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.this.m50269a((C12139h) this.f$1, (int) ((AbstractC70022d) obj));
            }
        }), i, str2).mo238001b(new Consumer(i, str2) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$FJ8nsixWr8apv_Y6mX1i8I8tktg */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.this.m50268a((C12139h) this.f$1, (int) this.f$2, (String) ((Boolean) obj));
            }
        }, new Consumer(str2, i) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$l6724JDWd2CXk4KXkBUgY8TwjiU */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.this.m50274a((C12139h) this.f$1, (String) this.f$2, (int) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m50266a(String str, boolean z, Boolean bool) throws Exception {
        return m50260a(new Runnable(str, z) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$LcESRkXUcJHPA0WT_O3fEB73eM */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C12139h.this.m50292b((C12139h) this.f$1, (String) this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50269a(int i, AbstractC70022d dVar) throws Exception {
        this.f32706f.mo5929b(C12138g.m50249a(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50268a(int i, String str, Boolean bool) throws Exception {
        if (this.f32707g.mo46428i()) {
            C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.loadInternal, this is an empty space. ");
            this.f32706f.mo5929b(C12138g.m50250a(i, (int) CommonCode.StatusCode.API_CLIENT_EXPIRED));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f32707g.mo46422f();
        }
        this.f32706f.mo5929b(C12138g.m50251a(i, this.f32707g.mo46431k()).mo46432a("LOAD_TOKEN", str));
        if (this.f32709i) {
            m50303i();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public void mo46364a(String str) {
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.expand, wikiToken: %s", C13721c.m55650d(str)));
        if (!m50314p(str)) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.expand, node not found. ");
        } else {
            this.f32711k.mo237937a(m50259a(m50305j(str).mo238014c(new Function(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$IlWRFPgtQ8HhBgpNyWoUQ8VeaxY */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C12139h.this.m50297c(this.f$1, (Boolean) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$aBzDH6EujYdDB_9_pDPoiupI82w */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50291b((C12139h) this.f$1, (String) ((AbstractC70022d) obj));
                }
            }), 1003, str).mo238001b(new Consumer(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$HKbcV_FPiWnqS_Of1iNRfBgQ8Y */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50288b((C12139h) this.f$1, (String) ((Boolean) obj));
                }
            }, new Consumer(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$CVAz0E3bGxPB_3X2iq18019xif4 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50298c((C12139h) this.f$1, (String) ((Throwable) obj));
                }
            }));
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: b */
    public void mo46372b(String str) {
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.collapse, wikiToken: %s", C13721c.m55650d(str)));
        if (!m50314p(str)) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.collapse, node not found. ");
            return;
        }
        this.f32707g.mo46415c(str);
        this.f32706f.mo5929b(C12138g.m50251a(1004, this.f32707g.mo46431k()));
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public void mo46365a(String str, int i, boolean z) {
        if (!m50314p(str)) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.insert, node not found. ");
            return;
        }
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.insert, parentToken: %s, forceExpand: %s", C13721c.m55650d(str), String.valueOf(z)));
        this.f32711k.mo237937a(m50259a(C12061c.m49937a(this.f32705e).mo46192a(new CreateWikiRelationPuller.Params(this.f32707g.mo46423g(), m50311m(str), "", i, this.f32703c)).mo237985a(C11678b.m48478b()).mo238020d(new Function(str, z) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$WuOwJmfedA_cRJmQVouaHBO66Y */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12139h.this.m50257a(this.f$1, this.f$2, (TreeNode) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$7Ygm6opGfPERc8UGdYwrGycmpzs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.this.m50299c((C12139h) ((AbstractC70022d) obj));
            }
        }), 1005, str).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$3t_ZWA0AL1wsWXcipeIDjfjmmTw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.this.m50273a((C12139h) ((TreeNode) obj));
            }
        }, new Consumer(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$PgvplSC3wBlEe_Ug31U1uUoexOA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.this.m50289b((C12139h) this.f$1, (String) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50273a(TreeNode treeNode) throws Exception {
        this.f32706f.mo5929b(C12138g.m50251a(1005, this.f32707g.mo46431k()).mo46432a("ADD_TOKEN", treeNode.wiki_token));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50275a(String str, AbstractC11940d dVar) throws Exception {
        dVar.notifyWikiNodeRemoved(str, this.f32707g.mo46423g());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50281a(String str, Throwable th) throws Exception {
        m50274a(th, str, 1006);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public void mo46368a(String str, String str2, boolean z, boolean z2) {
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.moveTo, srcToken: %s, destParentToken: %s, followParentPerm: %s, forceExpand: %s", C13721c.m55650d(str), C13721c.m55650d(str2), String.valueOf(z), String.valueOf(z2)));
        C11933b.m49474a(this.f32704d, "click_confirm_move", this.f32712l, str);
        if (!m50314p(str)) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.moveTo, node not found. ");
        } else {
            this.f32711k.mo237937a(m50259a(C12061c.m49939c(this.f32705e).mo46192a(new MoveWikiRelationV2Puller.Params(this.f32707g.mo46423g(), m50311m(this.f32707g.mo46427i(str).parent), m50311m(str2), str, "", true, this.f32703c, z)).mo237985a(C11678b.m48478b()).mo238014c(new Function(z, str, str2, z2) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$Uq5RdRdOj86k1qcwqREd1IeI7ig */
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C12139h.this.m50267a(this.f$1, this.f$2, this.f$3, this.f$4, (MoveWikiRelationV2Puller.Result) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$rql5sFvFKUh0DR7OCGAAebY7AYM */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50286a((C12139h) ((AbstractC70022d) obj));
                }
            }), 1008, str2).mo238001b(new Consumer(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$mMV_NQNV8foWcS8dhWiCIf7Sws */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50276a((C12139h) this.f$1, (String) ((Boolean) obj));
                }
            }, new Consumer(str2, str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$PnGch06GDrkANgA7LtMMy4mEPA */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50279a((C12139h) this.f$1, this.f$2, (String) ((Throwable) obj));
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m50267a(boolean z, String str, String str2, boolean z2, MoveWikiRelationV2Puller.Result result) throws Exception {
        return m50260a(new Runnable(z, str, str2, z2, result) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$jfW89d6lcgjuBVi2Pit0U0dmCpY */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ MoveWikiRelationV2Puller.Result f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void run() {
                C12139h.this.m50295b(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50286a(AbstractC70022d dVar) throws Exception {
        this.f32706f.mo5929b(C12138g.m50249a(1008));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50276a(String str, Boolean bool) throws Exception {
        this.f32706f.mo5929b(C12138g.m50251a(1008, this.f32707g.mo46431k()).mo46432a("MOV_TOKEN", str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50279a(String str, String str2, Throwable th) throws Exception {
        if (C12135d.m50190b(th)) {
            m50274a(th, str, 1008);
        } else {
            m50274a(th, str2, 1008);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public void mo46366a(String str, String str2) {
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.updateTitle, wikiToken: %s, newTitle: %s", C13721c.m55650d(str), C13721c.m55650d(str2)));
        if (m50314p(str)) {
            TreeNode i = this.f32707g.mo46427i(str);
            i.title = str2;
            this.f32706f.mo5926a(C12138g.m50251a(2006, Collections.emptyList()).mo46432a("UDE_TOKEN", i.wiki_token));
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: a */
    public void mo46370a(boolean z) {
        this.f32709i = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50278a(String str, String str2, String str3, String str4, String str5, Throwable th) throws Exception {
        C11932a.m49471a(C5234y.m21391b(), str, str2, str3, "fail", String.valueOf(C12135d.m50193e(th)), C11929a.m49463c(str4), str5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50277a(String str, String str2, String str3, String str4, String str5) throws Exception {
        C11932a.m49471a(C5234y.m21391b(), str, str2, str3, "success", "0", C11929a.m49463c(str4), str5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50274a(Throwable th, String str, int i) {
        m50284a(th, i, str, (Map<String, Object>) null);
    }

    /* renamed from: a */
    private void m50284a(Throwable th, int i, String str, Map<String, Object> map) {
        String str2 = this.f32701a;
        C13479a.m54759a(str2, "WikiTreeModelImpl.handleCommonError, actionCode: " + i, th);
        int a = C12134c.m50187a(this.f32704d, th);
        this.f32706f.mo5929b(C12138g.m50250a(i, a).mo46433a(map));
        boolean z = false;
        if (!(i == 1001 || i == 1002)) {
            boolean z2 = a == 1003 || a == 1006;
            if (a == 1004) {
                z = true;
            }
            if (!z2 && !z) {
                return;
            }
            if (TextUtils.isEmpty(this.f32712l) || TextUtils.equals(this.f32712l, str)) {
                mo46369a(this.f32707g.mo46422f(), true);
            } else {
                mo46369a(this.f32712l, true);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.push.C12129a.AbstractC12130a
    /* renamed from: a */
    public void mo46318a(AddV2 addV2) {
        String str = this.f32701a;
        C13479a.m54764b(str, "WikiTreeModelImpl.onAddV2, addV2: " + addV2);
        if (!m50314p(addV2.parent) || m50314p(addV2.wiki_token)) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onAddV2, node not found. ");
            return;
        }
        TreeNode i = this.f32707g.mo46427i(addV2.parent);
        TreeNode create = TreeNode.create(addV2.child_num, addV2.obj_token, addV2.obj_type, 0, addV2.space_id, "", addV2.wiki_token, addV2.parent, "", false, addV2.area_id, addV2.sort_id, null);
        if (!this.f32707g.mo46412b() || i.nodeType != NodeType.ROOT) {
            this.f32708h.mo46386a(i.wiki_token, create, false);
            this.f32706f.mo5926a(C12138g.m50251a(2001, this.f32707g.mo46431k()).mo46432a("ADD_TOKEN", create.wiki_token));
            if (this.f32707g.mo46424g(addV2.wiki_token)) {
                m50308k(addV2.wiki_token);
                return;
            }
            return;
        }
        C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onAddV2, singleTree not allow insert node in first level. ");
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.push.C12129a.AbstractC12130a
    /* renamed from: a */
    public void mo46319a(DelV2 delV2) {
        String str = this.f32701a;
        C13479a.m54764b(str, "WikiTreeModelImpl.onDelV2, delV2: " + delV2);
        if (!m50314p(delV2.wiki_token)) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onDelV2, node not found. ");
            return;
        }
        TreeNode i = this.f32707g.mo46427i(delV2.wiki_token);
        TreeNode i2 = this.f32707g.mo46427i(delV2.parent);
        if (this.f32707g.mo46412b() && i.level <= 1) {
            C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.onDelV2, del singleTree first level item. ");
            this.f32707g.mo46430j();
            this.f32706f.mo5926a(C12138g.m50251a(2003, Collections.emptyList()));
        } else if (i2 == null) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onDelV2, node not found. ");
        } else if (!TextUtils.equals(i.parent, i2.wiki_token)) {
            C13479a.m54758a(this.f32701a, "WikiTreeModelImpl.onDelV2, parent not the same. ");
        } else {
            this.f32708h.mo46389a(delV2.wiki_token, delV2.children_sort_id);
            this.f32706f.mo5926a(C12138g.m50251a(2002, this.f32707g.mo46431k()).mo46432a("DEL_PARENT_TOKEN", m50313o(delV2.parent)));
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.push.C12129a.AbstractC12130a
    /* renamed from: a */
    public void mo46320a(MovV2 movV2) {
        TreeNode treeNode;
        TreeNode treeNode2;
        boolean z;
        String str = this.f32701a;
        C13479a.m54764b(str, "WikiTreeModelImpl.onMovV2, movV2: " + movV2);
        if (!m50310l()) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onMovV2, space not init. ");
            return;
        }
        TreeNode i = this.f32707g.mo46427i(movV2.from);
        TreeNode i2 = this.f32707g.mo46427i(movV2.to);
        TreeNode i3 = this.f32707g.mo46427i(movV2.wiki_token);
        if (i3 != null && !TextUtils.isEmpty(i3.parent) && !TextUtils.equals(i3.parent, movV2.from)) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onMovV2, treeNode.parent and fromNode.parent no equals. return. ");
        } else if (i == null && i2 == null) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onMovV2, fromNode and destNode both not found. return. ");
        } else if (i3 != null && this.f32707g.mo46412b() && i3.level <= 1) {
            C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.onMovV2, move the root node of singleTree. return. ");
            i3.parent = movV2.to;
        } else if (i2 == null || !this.f32707g.mo46412b() || i2.nodeType != NodeType.ROOT) {
            if (i3 == null) {
                try {
                    treeNode = i2;
                    treeNode2 = TreeNode.create(movV2.child_num, movV2.obj_token, movV2.obj_type, 0, movV2.space_id, C12061c.m49945i(this.f32705e).mo46192a(new GetNodePuller.Params(movV2.wiki_token)).mo238023d().title, movV2.wiki_token, "", "", false, movV2.area_id, movV2.sort_id, null);
                } catch (Exception e) {
                    C13479a.m54759a(this.f32701a, "WikiTreeModelImpl.onMovV2, moveNode not found, pull moveNode fail. return. ", e);
                    return;
                }
            } else {
                treeNode = i2;
                treeNode2 = i3;
            }
            List<TreeNode> list = null;
            if (treeNode == null || (treeNode.nodeType == NodeType.DIR && !this.f32707g.mo46426h(treeNode.wiki_token))) {
                try {
                    GetWikiRelationPuller.Result result = (GetWikiRelationPuller.Result) AbstractC68307f.m265092a(C12061c.m49945i(this.f32705e).mo46192a(new GetNodePuller.Params(movV2.to)), C12061c.m49946j(this.f32705e).mo46192a(new GetWikiRelationPuller.Params(movV2.space_id, movV2.to)), $$Lambda$h$zugVXZoiwUpt_jUR3yZwx_GK2Yw.INSTANCE).mo238023d();
                    if (this.f32707g.mo46412b() || !result.is_single_tree) {
                        list = result.tree;
                    } else {
                        C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.onMovV2, destNode not found, no permission on destNode's ancestor. return. ");
                        if (i3 != null) {
                            this.f32707g.mo46409b(i3.wiki_token);
                            this.f32706f.mo5926a(C12138g.m50251a(2007, this.f32707g.mo46431k()));
                            return;
                        }
                        return;
                    }
                } catch (Exception e2) {
                    C13479a.m54765b(this.f32701a, "WikiTreeModelImpl.onMovV2, destNode not found, pull destNode fail. return. ", e2);
                    if (C12135d.m50191c(e2) && i3 != null) {
                        this.f32707g.mo46409b(i3.wiki_token);
                        this.f32706f.mo5926a(C12138g.m50251a(2007, this.f32707g.mo46431k()));
                        return;
                    }
                    return;
                }
            }
            if (treeNode == null && list != null && this.f32707g.mo46412b()) {
                TreeNode f = this.f32707g.mo46421f(movV2.wiki_token);
                if (f == null) {
                    C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.onMovV2, singleTree's 1st parent not found. return. ");
                    return;
                }
                HashMap hashMap = new HashMap();
                C12137f.m50203a(list, 0, hashMap);
                TreeNode treeNode3 = (TreeNode) hashMap.get(movV2.to);
                while (true) {
                    if (treeNode3 == null || treeNode3.level <= 0) {
                        z = true;
                    } else if (TextUtils.equals(treeNode3.wiki_token, f.wiki_token)) {
                        z = false;
                        break;
                    } else {
                        treeNode3 = (TreeNode) hashMap.get(treeNode3.parent);
                    }
                }
                z = true;
                if (z) {
                    C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.onMovV2, move node out of singleTree. return. ");
                    if (i3 != null) {
                        this.f32707g.mo46409b(i3.wiki_token);
                        this.f32706f.mo5926a(C12138g.m50251a(2005, this.f32707g.mo46431k()).mo46432a("DEL_AREA_ROOT_PARENT_TOKEN", m50313o(i3.parent)));
                        return;
                    }
                    return;
                }
            }
            if (treeNode2 == null || (treeNode == null && list == null)) {
                C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onMovV2, condition unsatisfied: moveNode not null && (destNode not null or newRelation not null). ");
                return;
            }
            this.f32708h.mo46387a(movV2.wiki_token, movV2.to, movV2.sort_id, this.f32707g.mo46416c(movV2.wiki_token, this.f32712l), this.f32712l, treeNode2, list);
            this.f32706f.mo5926a(C12138g.m50251a(2004, this.f32707g.mo46431k()));
        } else {
            C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.onMovV2, singleTree currently and move node to home. return. ");
            if (i3 != null) {
                this.f32707g.mo46409b(i3.wiki_token);
                this.f32706f.mo5926a(C12138g.m50251a(2005, this.f32707g.mo46431k()).mo46432a("DEL_AREA_ROOT_PARENT_TOKEN", i3.parent));
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.push.C12129a.AbstractC12130a
    /* renamed from: a */
    public void mo46323a(UdeV2 udeV2) {
        String str = this.f32701a;
        C13479a.m54764b(str, "WikiTreeModelImpl.onUdeV2, udeV2: " + udeV2);
        if (!m50314p(udeV2.wiki_token)) {
            C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.onUdeV2 update title, node not found. ");
            return;
        }
        m50308k(udeV2.wiki_token);
        TreeNode i = this.f32707g.mo46427i(udeV2.wiki_token);
        OfflineRenameData offlineRenameData = new OfflineRenameData();
        offlineRenameData.setEditTime(udeV2.edit_time);
        offlineRenameData.setNewName(i.title);
        offlineRenameData.setObjToken(i.obj_token);
        this.f32711k.mo237937a(this.f32704d.mo41505a(AbstractC11955g.class, C11678b.m48479c()).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$mSYKROjsgP0KBtomfgS6Pwsrk74 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC11955g) obj).updateWikiTitle(OfflineRenameData.this);
            }
        }).mo238001b($$Lambda$h$TevlWhEXKnEFoZ7iEsTXUwLFxrM.INSTANCE, $$Lambda$h$iKurh7jb7A6XbXkNMYWgRy7BYtQ.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.push.C12129a.AbstractC12130a
    /* renamed from: a */
    public void mo46321a(UdeArea udeArea) {
        String str = this.f32701a;
        C13479a.m54764b(str, "WikiTreeModelImpl.onUdeArea, udeArea: " + udeArea);
        if (m50314p(udeArea.root_token)) {
            C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.onUdeArea, areaRoot exist, updateAreaId. ");
            this.f32707g.mo46403a(udeArea.root_token, udeArea.old_area_id, udeArea.new_area_id, udeArea.scope);
        }
        if (udeArea.perm_change) {
            m50301e(udeArea.new_area_id, udeArea.root_token);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.push.C12129a.AbstractC12130a
    /* renamed from: a */
    public void mo46322a(UdeAreaPerm udeAreaPerm) {
        String str = this.f32701a;
        C13479a.m54764b(str, "WikiTreeModelImpl.onUdeAreaPerm, udeAreaPerm: " + udeAreaPerm);
        if (!m50310l()) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.onUdeAreaPerm, space not inited. ");
        } else {
            m50301e(udeAreaPerm.area_id, udeAreaPerm.root_token);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: h */
    public boolean mo46385h() {
        return m50310l();
    }

    /* renamed from: j */
    private void m50306j() {
        C12129a aVar = this.f32710j;
        if (aVar != null) {
            aVar.mo46317b();
            this.f32710j = null;
        }
    }

    /* renamed from: l */
    private boolean m50310l() {
        if (this.f32707g == null || this.f32708h == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: d */
    public C12075a mo46376d() {
        if (m50310l()) {
            return this.f32707g.mo46414c();
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: g */
    public C12136e mo46382g() {
        if (m50310l()) {
            return this.f32707g.mo46396a();
        }
        return null;
    }

    /* renamed from: i */
    private void m50303i() {
        if (m50310l() && this.f32710j == null) {
            C12129a aVar = new C12129a(this.f32707g.mo46423g(), this, this.f32703c, this.f32702b);
            this.f32710j = aVar;
            aVar.mo46316a();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        m50306j();
        C68289a aVar = this.f32711k;
        if (aVar != null) {
            aVar.mo237935a();
        }
        if (this.f32707g != null) {
            this.f32707g.mo46430j();
            this.f32707g = null;
            this.f32708h = null;
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: f */
    public boolean mo46381f() {
        if (!m50310l() || !this.f32707g.mo46418d()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: e */
    public boolean mo46378e() {
        if (!m50310l() || !this.f32707g.mo46412b()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m50307k() {
        if (!this.f32707g.mo46412b() || this.f32707g.mo46418d()) {
            try {
                R d = AbstractC68307f.m265098b(2500, TimeUnit.MILLISECONDS).mo238014c(new Function() {
                    /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$J8lkmcofTbPGTV_EpEO9kL5bJT4 */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C12139h.this.m50263a((Long) obj);
                    }
                }).mo238023d();
                if (d.mo46249c()) {
                    C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.checkSpacePermission, no space default permission, close page. ");
                    this.f32707g.mo46430j();
                    this.f32706f.mo5926a(C12138g.m50251a(2010, Collections.emptyList()));
                    return;
                }
                C12075a c = this.f32707g.mo46414c();
                String str = this.f32701a;
                C13479a.m54764b(str, "WikiTreeModelImpl.checkSpacePermission, oldUserRole: " + c.toString() + ", newUserRole: " + d.toString());
                if (c.mo46247a(d)) {
                    C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.checkSpacePermission, role not changed. return. ");
                    return;
                }
                this.f32707g.mo46430j();
                if (c.mo46248b() && d.mo46246a()) {
                    C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.checkSpacePermission, role has changed. member to admin. ");
                    this.f32706f.mo5926a(C12138g.m50251a(2011, Collections.emptyList()));
                } else if (c.mo46246a() && d.mo46248b()) {
                    C13479a.m54764b(this.f32701a, "WikiTreeModelImpl.checkSpacePermission, role has changed. admin to member.");
                    this.f32706f.mo5926a(C12138g.m50251a(2012, Collections.emptyList()));
                }
            } catch (Exception e) {
                C13479a.m54759a(this.f32701a, "WikiTreeModelImpl.checkSpacePermission, pull newUserRole failed. return. ", e);
            }
        } else {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.checkSpacePermission, no permission singleTree receive space perm change, ignore. ");
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: c */
    public String mo46374c() {
        if (m50310l()) {
            return this.f32707g.mo46423g();
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: d */
    public void mo46377d(String str) {
        this.f32712l = str;
    }

    /* renamed from: a */
    public static AbstractC12132a m50258a(C10917c cVar) {
        return new C12139h(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m50315q(String str) {
        this.f32707g.mo46417d(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: e */
    public boolean mo46379e(String str) {
        return m50314p(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: f */
    public TreeNode mo46380f(String str) {
        if (m50310l()) {
            return this.f32707g.mo46427i(str);
        }
        return null;
    }

    /* renamed from: a */
    private static AbstractC68307f<Boolean> m50260a(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        return AbstractC68307f.m265083a((Object) true);
    }

    /* renamed from: m */
    private String m50311m(String str) {
        if (TextUtils.equals(str, this.f32707g.mo46422f()) || TextUtils.equals(str, this.f32707g.mo46419e())) {
            return "";
        }
        return str;
    }

    /* renamed from: n */
    private String m50312n(String str) {
        if (TextUtils.equals(str, this.f32707g.mo46422f())) {
            return this.f32707g.mo46419e();
        }
        return str;
    }

    /* renamed from: o */
    private String m50313o(String str) {
        if (TextUtils.equals(str, this.f32707g.mo46419e())) {
            return this.f32707g.mo46422f();
        }
        return str;
    }

    /* renamed from: p */
    private boolean m50314p(String str) {
        if (!m50310l() || !this.f32707g.mo46424g(str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: g */
    public String mo46383g(String str) {
        if (m50314p(str)) {
            return m50313o(this.f32707g.mo46427i(str).parent);
        }
        return null;
    }

    private C12139h(C10917c cVar) {
        this.f32704d = cVar;
        this.f32705e = (NetService) KoinJavaComponent.m268610a(NetService.class);
        this.f32703c = String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: i */
    private boolean m50304i(String str) {
        if (!m50310l() || !TextUtils.equals(this.f32707g.mo46423g(), str)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private AbstractC68307f<Boolean> m50305j(String str) {
        if (this.f32707g.mo46426h(str)) {
            return AbstractC68307f.m265083a((Object) true);
        }
        return C12061c.m49941e(this.f32705e).mo46192a(new GetWikiChildPuller.Params(this.f32707g.mo46423g(), str)).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$vQLUHb7TUjYcw_IZD1fqUePv5KE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12139h.this.m50265a(this.f$1, (List) obj);
            }
        });
    }

    /* renamed from: k */
    private void m50308k(String str) {
        try {
            mo46366a(str, C12061c.m49945i(this.f32705e).mo46192a(new GetNodePuller.Params(str)).mo238023d().title);
        } catch (Exception e) {
            C13479a.m54759a(this.f32701a, "WikiTreeModelImpl.reverseCheckNodeTitle, pull node fail. ", e);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: h */
    public void mo46384h(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f32701a += "_" + str;
            this.f32702b = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m50299c(AbstractC70022d dVar) throws Exception {
        this.f32706f.mo5929b(C12138g.m50249a(1005));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m50263a(Long l) throws Exception {
        return C12061c.m49940d(this.f32705e).mo46192a(new GetUserRolePuller.Params(this.f32707g.mo46423g()));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50293b(Throwable th) throws Exception {
        C13479a.m54761a(this.f32701a, th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50309l(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12139h.m50309l(java.lang.String):void");
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a
    /* renamed from: c */
    public void mo46375c(String str) {
        C13479a.m54764b(this.f32701a, String.format("WikiTreeModelImpl.remove, wikiToken: %s", C13721c.m55650d(str)));
        if (!m50314p(str)) {
            C13479a.m54775e(this.f32701a, "WikiTreeModelImpl.remove, node not found. ");
        } else {
            this.f32711k.mo237937a(m50259a(C12061c.m49938b(this.f32705e).mo46192a(new DelWikiRelationPuller.Params(this.f32707g.mo46423g(), str, this.f32703c)).mo237985a(C11678b.m48478b()).mo238020d(new Function(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$UjiUYiymgFlalEMGx1oMMVc0N7g */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C12139h.this.m50262a(this.f$1, (DelWikiRelationPuller.Result) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238013c(new Consumer() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$uCYbNLB84LnBGYAgPe_MmuspfsM */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50294b((C12139h) ((AbstractC70022d) obj));
                }
            }), 1006, str).mo238001b(new Consumer(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$WituIBvKxRIad_cV8JkX7as8OEE */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50302f(this.f$1, (String) obj);
                }
            }, new Consumer(str) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$k4kNsglfo3Nbkgze7eMDSqHd2Y */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C12139h.this.m50281a((C12139h) this.f$1, (String) ((Throwable) obj));
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50294b(AbstractC70022d dVar) throws Exception {
        this.f32706f.mo5929b(C12138g.m50249a(1006));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50289b(String str, Throwable th) throws Exception {
        m50274a(th, str, 1005);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50290b(String str, List list) {
        this.f32707g.mo46404a(str, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m50297c(String str, Boolean bool) throws Exception {
        return m50260a(new Runnable(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$SYNliT2xAAYpQEoVWpHgfOWiXk */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C12139h.this.m50315q(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50288b(String str, Boolean bool) throws Exception {
        this.f32706f.mo5929b(C12138g.m50251a(1003, this.f32707g.mo46431k()).mo46432a("EXPAND_TOKEN", str));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m50298c(String str, Throwable th) throws Exception {
        m50284a(th, 1003, str, C11931b.m49470a((Object) "EXPAND_TOKEN", (Object) str));
    }

    /* renamed from: d */
    private AbstractC68307f<HomePage> m50300d(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return C12061c.m49942f(this.f32705e).mo46192a(str2);
        }
        return C12061c.m49943g(this.f32705e).mo46192a(str);
    }

    /* renamed from: e */
    private void m50301e(String str, String str2) {
        if (!m50314p(str2) || this.f32707g.mo46427i(str2).nodeType != NodeType.HOME) {
            m50309l(str2);
        } else {
            m50307k();
        }
    }

    /* renamed from: c */
    private AbstractC68307f<Boolean> m50296c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m50300d(str, str2).mo238014c(new Function(str2) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$iMhEn923De3dFihEliuP5ERdzM */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C12139h.this.m50264a(this.f$1, (HomePage) obj);
                }
            });
        }
        return AbstractC68307f.m265094a(m50300d(str, str2), C12061c.m49940d(this.f32705e).mo46192a(new GetUserRolePuller.Params(str)), C12061c.m49946j(this.f32705e).mo46192a(new GetWikiRelationPuller.Params(str, str2)), new AbstractC68314f() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$OoWnBkAug9oDGu0pL3w81LeN2hQ */

            @Override // io.reactivex.functions.AbstractC68314f
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return C12139h.this.m50261a((HomePage) obj, (C12075a) obj2, (GetWikiRelationPuller.Result) obj3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50291b(String str, AbstractC70022d dVar) throws Exception {
        this.f32706f.mo5929b(C12138g.m50249a(1003).mo46432a("EXPAND_TOKEN", str));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m50302f(String str, String str2) throws Exception {
        if (this.f32707g.mo46408a(str)) {
            this.f32706f.mo5929b(C12138g.m50251a(1007, Collections.emptyList()));
        } else {
            this.f32706f.mo5929b(C12138g.m50251a(1006, this.f32707g.mo46431k()).mo46432a("DEL_PARENT_TOKEN", m50313o(str2)));
        }
        this.f32711k.mo237937a(this.f32704d.mo41505a(AbstractC11940d.class, C11678b.m48479c()).mo238005b((Consumer) new Consumer(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$dhqP2IXtvo5e8ddaRRs9XASNLE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.this.m50275a((C12139h) this.f$1, (String) ((AbstractC11940d) obj));
            }
        }).mo238001b($$Lambda$h$tAhYn3J3skbnMJCr7YlPFynRKBU.INSTANCE, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$3FjKKL9tRezTdIdaBmfjQfvmsR8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.this.m50293b((C12139h) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m50262a(String str, DelWikiRelationPuller.Result result) throws Exception {
        if (this.f32707g.mo46408a(str)) {
            return "";
        }
        String str2 = this.f32707g.mo46427i(str).parent;
        this.f32708h.mo46389a(str, result.children_sort_id);
        return str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50292b(String str, boolean z) {
        this.f32707g.mo46405a(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m50264a(String str, HomePage homePage) throws Exception {
        return AbstractC68307f.m265092a(C12061c.m49940d(this.f32705e).mo46192a(new GetUserRolePuller.Params(homePage.getSpaceId())), C12061c.m49946j(this.f32705e).mo46192a(new GetWikiRelationPuller.Params(homePage.getSpaceId(), str)), new BiFunction(homePage) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$AQXmVLjiamGM7b4vzWvMkZoe4M */
            public final /* synthetic */ HomePage f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C12139h.this.m50287b(this.f$1, (C12075a) obj, (GetWikiRelationPuller.Result) obj2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m50265a(String str, List list) throws Exception {
        return m50260a(new Runnable(str, list) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$Wuy5AxyQosGCgX0mPYGyZcXHKk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C12139h.this.m50290b((C12139h) this.f$1, (String) this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ TreeNode m50257a(String str, boolean z, TreeNode treeNode) throws Exception {
        this.f32708h.mo46386a(m50312n(str), treeNode, z);
        return treeNode;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m50261a(HomePage homePage, C12075a aVar, GetWikiRelationPuller.Result result) throws Exception {
        this.f32707g = new C12137f(homePage, result.tree, result.is_single_tree, aVar, this.f32702b);
        this.f32708h = new C12133b(this.f32707g, this.f32705e, this.f32702b);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m50287b(HomePage homePage, C12075a aVar, GetWikiRelationPuller.Result result) throws Exception {
        this.f32707g = new C12137f(homePage, result.tree, result.is_single_tree, aVar, this.f32702b);
        this.f32708h = new C12133b(this.f32707g, this.f32705e, this.f32702b);
        return true;
    }

    /* renamed from: a */
    private <T> AbstractC68307f<T> m50259a(AbstractC68307f<T> fVar, int i, String str) {
        boolean z;
        String str2;
        String str3;
        String a = C12134c.m50188a(i);
        if (TextUtils.isEmpty(a)) {
            return fVar;
        }
        if (i == 1001) {
            z = m50314p(str);
        } else if (!m50314p(str) || (this.f32707g.mo46427i(str).nodeType != NodeType.LEAF && !this.f32707g.mo46426h(str))) {
            z = false;
        } else {
            z = true;
        }
        String format = String.format("%s_%s", a, str);
        if (TextUtils.equals(this.f32702b, WikiTreeType.PANEL.name())) {
            str2 = "panel";
        } else {
            str2 = "fullscreen";
        }
        if (z) {
            str3 = "cache";
        } else {
            str3 = "network";
        }
        return fVar.mo238013c(new Consumer(format) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$DtaGBYvMCAqFzS8_V1WicJUQLAM */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC70022d dVar = (AbstractC70022d) obj;
                C11929a.m49461a(this.f$0);
            }
        }).mo237988a((Consumer<? super Throwable>) new Consumer(a, str, str2, format, str3) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$IYi0nIDNNNUmHeG4hsjXB3jVI */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12139h.m50278a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Throwable) obj);
            }
        }).mo238015c(new AbstractC68309a(a, str, str2, format, str3) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$h$xHgYLBltrBdLy8QjIj76C3Y99o */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C12139h.m50277a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50295b(boolean z, String str, String str2, boolean z2, MoveWikiRelationV2Puller.Result result) {
        String str3;
        if (z) {
            str3 = "all";
        } else {
            str3 = "area";
        }
        this.f32708h.mo46388a(str, m50312n(str2), Integer.MAX_VALUE, z2, this.f32712l, result.area_id, str3, Double.valueOf(result.sort_id));
    }
}
