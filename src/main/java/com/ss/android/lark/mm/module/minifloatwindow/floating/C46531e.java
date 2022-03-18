package com.ss.android.lark.mm.module.minifloatwindow.floating;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.floatwindow.floating.permission.C46313a;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.module.minifloatwindow.floating.C46516a;
import com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c;
import com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.e */
public class C46531e {

    /* renamed from: a */
    public final AbstractC46538f f117113a;

    /* renamed from: b */
    public MiniType f117114b = MiniType.NULL;

    /* renamed from: c */
    public MiniType f117115c = MiniType.NULL;

    /* renamed from: d */
    public boolean f117116d;

    /* renamed from: e */
    public View f117117e;

    /* renamed from: f */
    public List<String> f117118f = new ArrayList();

    /* renamed from: g */
    public AbstractC46536a f117119g = null;

    /* renamed from: h */
    private C46516a f117120h;

    /* renamed from: i */
    private C46523c f117121i;

    /* renamed from: j */
    private WeakReference<Activity> f117122j;

    /* renamed from: k */
    private boolean f117123k;

    /* renamed from: l */
    private boolean f117124l;

    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.e$a */
    public interface AbstractC46536a {

        /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.e$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(AbstractC46536a aVar) {
            }

            public static void $default$b(AbstractC46536a aVar, boolean z) {
            }
        }

        /* renamed from: a */
        void mo163406a();

        /* renamed from: a */
        void mo163407a(boolean z);

        /* renamed from: b */
        void mo163408b(boolean z);
    }

    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.floating.e$b */
    public interface AbstractC46537b {
        void permissionGranted(boolean z);
    }

    /* renamed from: a */
    public void mo163449a(View view, MiniType miniType, boolean z, AbstractC46536a aVar) {
        C45859k.m181685a(new Runnable(aVar, view, miniType, z) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$eLOOy1N8GfNc6eGSMSepFqwuTq0 */
            public final /* synthetic */ C46531e.AbstractC46536a f$1;
            public final /* synthetic */ View f$2;
            public final /* synthetic */ MiniType f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C46531e.this.m184005b((C46531e) this.f$1, (C46531e.AbstractC46536a) this.f$2, (View) this.f$3, (MiniType) this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo163448a(Activity activity) {
        C45859k.m181685a(new Runnable(activity) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$b6GID9a7OzpMmE53Zb6Sbt4MQwo */
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C46531e.this.m184006c(this.f$1);
            }
        });
    }

    /* renamed from: j */
    private void m184014j() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$yAMgwaiBSes5NqQMNPFzZEz5xxU */

            public final void run() {
                C46531e.this.m184019o();
            }
        });
    }

    /* renamed from: k */
    private void m184015k() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$w4DKgr2lGtKylEcZthZGlXQGYw */

            public final void run() {
                C46531e.this.m184017m();
            }
        });
    }

    /* renamed from: l */
    private void m184016l() {
        this.f117113a.mo163441a(new IMmDepend.AbstractC45871b.AbstractC45874c() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.C465354 */

            /* renamed from: b */
            private boolean f117132b = true;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m184039a(IMmDepend.AbstractC45871b.C45872a aVar) {
                if (C46531e.this.f117116d && this.f117132b != aVar.f115713c) {
                    this.f117132b = aVar.f115713c;
                    if (!C46531e.this.mo163456g()) {
                        C46531e.this.mo163447a();
                    }
                }
            }

            @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b.AbstractC45874c
            /* renamed from: a */
            public void mo149331a(IMmDepend.AbstractC45871b.C45872a aVar, IMmDepend.AbstractC45871b.C45872a aVar2) {
                C45859k.m181685a(new Runnable(aVar2) {
                    /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$4$rtLu4OXijq9Pf3oOGx6ag4Rmt4c */
                    public final /* synthetic */ IMmDepend.AbstractC45871b.C45872a f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C46531e.C465354.this.m184039a(this.f$1);
                    }
                });
            }
        });
    }

    /* renamed from: d */
    public boolean mo163453d() {
        if (mo163452c() == MiniType.NULL || !this.f117116d) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo163454e() {
        if (mo163452c() != MiniType.NULL) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo163455f() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$3Pvqb4JYv1lj05D1MQoH4VDDlXo */

            public final void run() {
                C46531e.this.m184018n();
            }
        });
    }

    /* renamed from: g */
    public boolean mo163456g() {
        return C46313a.m183388a(this.f117113a.mo163438a());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m184017m() {
        View view = this.f117117e;
        if (view == null) {
            C45855f.m181664c("FloatWindowModule", "[removeViewFromAppFloat]content view is null");
        } else if (!this.f117116d) {
        } else {
            if (this.f117123k) {
                this.f117121i.mo163432a(view);
            } else {
                this.f117121i.mo163431a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m184019o() {
        if (this.f117116d) {
            m184015k();
            return;
        }
        WeakReference<Activity> weakReference = this.f117122j;
        if (weakReference != null && weakReference.get() != null) {
            m184002b(this.f117122j.get());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m184020p() {
        C45855f.m181664c("FloatWindowModule", "[dismiss]mini type: " + this.f117114b);
        m184014j();
        mo163455f();
    }

    /* renamed from: c */
    public MiniType mo163452c() {
        if (this.f117113a.mo163446d()) {
            this.f117114b = MiniType.MEETING;
        } else if (this.f117114b == MiniType.MEETING) {
            this.f117114b = MiniType.NULL;
        }
        return this.f117114b;
    }

    /* renamed from: h */
    private void m184012h() {
        this.f117120h = new C46516a();
        this.f117121i = new C46523c(new C46523c.AbstractC46526a() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.C465321 */

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c.AbstractC46526a
            /* renamed from: a */
            public Context mo163435a() {
                return C46531e.this.f117113a.mo163438a();
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c.AbstractC46526a
            /* renamed from: a */
            public void mo163436a(View view) {
                C46531e.this.f117113a.mo163439a(view);
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c.AbstractC46526a
            /* renamed from: b */
            public void mo163437b(View view) {
                C46531e.this.f117113a.mo163442b(view);
            }
        });
        m184016l();
        this.f117118f.add(MinutesListActivity.class.getName());
    }

    /* renamed from: i */
    private boolean m184013i() {
        WeakReference<Activity> weakReference = this.f117122j;
        if (weakReference != null && weakReference.get() != null) {
            return true;
        }
        Activity c = this.f117113a.mo163445c();
        if (c == null) {
            C45855f.m181664c("FloatWindowModule", "[getActivityRef]topActivity is null");
            return false;
        }
        this.f117122j = new WeakReference<>(c);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m184018n() {
        if (this.f117124l) {
            this.f117113a.mo163443b(C46522b.m183957a());
            this.f117124l = false;
            C45855f.m181664c("FloatWindowModule", "remove Activity Observer ");
        }
        WeakReference<Activity> weakReference = this.f117122j;
        if (weakReference != null) {
            weakReference.clear();
            this.f117122j = null;
        }
        this.f117117e = null;
        this.f117123k = false;
        this.f117116d = false;
        this.f117114b = MiniType.NULL;
        this.f117115c = MiniType.NULL;
        this.f117119g = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m184021q() {
        C45855f.m181664c("FloatWindowModule", "[forceToDismiss]mini type: " + this.f117114b);
        m184014j();
        AbstractC46536a aVar = this.f117119g;
        if (aVar != null) {
            aVar.mo163406a();
        }
        mo163455f();
    }

    /* renamed from: b */
    public void mo163450b() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$66f62s2S4Ra2Y3yvfEsYUyQbuM */

            public final void run() {
                C46531e.this.m184020p();
            }
        });
    }

    /* renamed from: a */
    public void mo163447a() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$7girTkixL2H8OF6JnC248bEVkg */

            public final void run() {
                C46531e.this.m184021q();
            }
        });
    }

    /* renamed from: b */
    private void m184002b(Activity activity) {
        C45859k.m181685a(new Runnable(activity) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$dyHqaAnxvtJ9CWSiDbsfpEkepY */
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C46531e.this.m184010d(this.f$1);
            }
        });
    }

    public C46531e(AbstractC46538f fVar) {
        this.f117113a = fVar;
        m184012h();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m184010d(Activity activity) {
        if (this.f117117e == null) {
            C45855f.m181664c("FloatWindowModule", "[removeViewFromActivityFloat]content view is null");
        } else if (activity != null) {
            this.f117120h.mo163426a(activity);
            if (this.f117118f.contains(activity.getClass().getName())) {
                activity.getWindow().clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m184006c(Activity activity) {
        WeakReference<Activity> weakReference = this.f117122j;
        if (weakReference == null || weakReference.get() == null || this.f117117e == null) {
            C45855f.m181664c("FloatWindowModule", "[resumeActivityFloatWindow]nothing need resume");
            return;
        }
        C45855f.m181664c("FloatWindowModule", "[resumeActivityFloatWindow]remove last activity float first");
        m184002b(this.f117122j.get());
        this.f117122j.clear();
        this.f117122j = null;
        if (activity != null) {
            this.f117122j = new WeakReference<>(activity);
        }
        WeakReference<Activity> weakReference2 = this.f117122j;
        if (weakReference2 != null && weakReference2.get() != null && this.f117117e != null) {
            C45855f.m181664c("FloatWindowModule", "[resumeActivityFloatWindow]success");
            m183995a(this.f117122j.get(), this.f117117e, new AbstractC46536a() {
                /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.C465343 */

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public /* synthetic */ void mo163406a() {
                    AbstractC46536a.CC.$default$a(this);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: b */
                public /* synthetic */ void mo163408b(boolean z) {
                    AbstractC46536a.CC.$default$b(this, z);
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46536a
                /* renamed from: a */
                public void mo163407a(boolean z) {
                    C45855f.m181664c("FloatWindowModule", "[resumeActivityFloatWindow]create activity float" + z);
                    if (C46531e.this.f117119g != null) {
                        C46531e.this.f117119g.mo163408b(z);
                    }
                    if (!z) {
                        C46531e.this.mo163455f();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m183997a(View view, AbstractC46536a aVar) {
        C45859k.m181685a(new Runnable(view, aVar) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$dOMRZzHeZqQnlXRwZ1CE79EdlUg */
            public final /* synthetic */ View f$1;
            public final /* synthetic */ C46531e.AbstractC46536a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C46531e.this.m184011d(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: b */
    private void m184003b(View view, AbstractC46536a aVar) {
        C45859k.m181685a(new Runnable(view, aVar) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$alH_fBT9kl5KgoTsITL57Gla6A */
            public final /* synthetic */ View f$1;
            public final /* synthetic */ C46531e.AbstractC46536a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C46531e.this.m184008c(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m184008c(View view, AbstractC46536a aVar) {
        if (view == null) {
            C45855f.m181664c("FloatWindowModule", "[addViewToAppFloat]content view is null");
            aVar.mo163407a(false);
        } else if (this.f117113a.mo163444b()) {
            this.f117123k = true;
            this.f117121i.mo163434b(view, new C46523c.AbstractC46528c(view, aVar) {
                /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$TdVqltG9GxkxrroEU68zUlJifc */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ C46531e.AbstractC46536a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c.AbstractC46528c
                public final void isOnCreated(boolean z) {
                    C46531e.this.m184004b(this.f$1, this.f$2, z);
                }
            });
        } else {
            this.f117123k = false;
            this.f117121i.mo163433a(view, new C46523c.AbstractC46528c(view, aVar) {
                /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$hLs0L8eAf14gXEXYrfOYYJgIBRc */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ C46531e.AbstractC46536a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46523c.AbstractC46528c
                public final void isOnCreated(boolean z) {
                    C46531e.this.m183998a((C46531e) this.f$1, (View) this.f$2, (C46531e.AbstractC46536a) z);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m184011d(View view, AbstractC46536a aVar) {
        if (this.f117116d) {
            C45855f.m181664c("FloatWindowModule", "[attachViewToFloatWindow]prepare to launch app float");
            m184003b(view, aVar);
        } else if (!m184013i()) {
            C45855f.m181664c("FloatWindowModule", "[attachViewToFloatWindow]activity is null");
            aVar.mo163407a(false);
            return;
        } else {
            this.f117113a.mo163440a(C46522b.m183957a());
            this.f117124l = true;
            C45855f.m181664c("FloatWindowModule", "[attachViewToFloatWindow]prepare to launch activity float");
            m183995a(this.f117122j.get(), view, aVar);
        }
        this.f117119g = aVar;
    }

    /* renamed from: a */
    private void m184001a(AbstractC46537b bVar, AbstractC46536a aVar) {
        if (!m184013i()) {
            C45855f.m181664c("FloatWindowModule", "[requestFloatPermission]prepare to apply for permission, but activity is null");
            aVar.mo163407a(false);
            return;
        }
        bVar.getClass();
        C46313a.m183387a(this.f117122j.get(), new C46313a.AbstractC46314a() {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$3oJRZXGpcga2KsNjONjbFNm83mk */

            @Override // com.ss.android.lark.mm.module.floatwindow.floating.permission.C46313a.AbstractC46314a
            public final void permissionGranted(boolean z) {
                C46531e.AbstractC46537b.this.permissionGranted(z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m184009c(View view, AbstractC46536a aVar, boolean z) {
        this.f117116d = z;
        m183997a(view, aVar);
    }

    /* renamed from: a */
    private void m183995a(Activity activity, View view, AbstractC46536a aVar) {
        C45859k.m181685a(new Runnable(activity, aVar, view) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$WIUNVgDgGjrveyVM514aZpA8jk */
            public final /* synthetic */ Activity f$1;
            public final /* synthetic */ C46531e.AbstractC46536a f$2;
            public final /* synthetic */ View f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C46531e.this.m183996a((C46531e) this.f$1, (Activity) this.f$2, (C46531e.AbstractC46536a) this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m183996a(final Activity activity, final AbstractC46536a aVar, final View view) {
        if (activity == null) {
            C45855f.m181664c("FloatWindowModule", "[addViewToActivityFloat]activity is null");
            aVar.mo163407a(false);
        } else if (view == null) {
            C45855f.m181664c("FloatWindowModule", "[addViewToActivityFloat]content view is null");
            aVar.mo163407a(false);
        } else {
            this.f117120h.mo163427a(view, activity, new C46516a.AbstractC46521b() {
                /* class com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.C465332 */

                @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46516a.AbstractC46521b
                /* renamed from: a */
                public void mo163430a(boolean z) {
                    if (z) {
                        C46531e eVar = C46531e.this;
                        eVar.f117114b = eVar.f117115c;
                        C46531e.this.f117117e = view;
                        if (C46531e.this.f117118f.contains(activity.getClass().getName())) {
                            activity.getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
                        }
                    }
                    aVar.mo163407a(z);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m184004b(View view, AbstractC46536a aVar, boolean z) {
        if (z) {
            this.f117114b = this.f117115c;
            this.f117117e = view;
        }
        aVar.mo163407a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m183998a(View view, AbstractC46536a aVar, boolean z) {
        if (z) {
            this.f117114b = this.f117115c;
            this.f117117e = view;
        }
        aVar.mo163407a(z);
    }

    /* renamed from: c */
    private void m184007c(View view, MiniType miniType, boolean z, AbstractC46536a aVar) {
        C45859k.m181685a(new Runnable(miniType, z, view, aVar) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$q76jZY80ibAXK_LK2FSQViYraCg */
            public final /* synthetic */ MiniType f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ View f$3;
            public final /* synthetic */ C46531e.AbstractC46536a f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C46531e.this.m183999a((C46531e) this.f$1, (MiniType) this.f$2, (boolean) this.f$3, (View) this.f$4);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m184005b(AbstractC46536a aVar, View view, MiniType miniType, boolean z) {
        if (mo163454e()) {
            if (mo163452c() == MiniType.MEETING) {
                aVar.mo163407a(false);
                return;
            }
            mo163447a();
        }
        m184007c(view, miniType, z, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m183999a(MiniType miniType, boolean z, View view, AbstractC46536a aVar) {
        C45855f.m181664c("FloatWindowModule", "[showFloatWindow]prepare to show");
        this.f117115c = miniType;
        if (!z) {
            this.f117116d = mo163456g();
            m183997a(view, aVar);
            return;
        }
        C45855f.m181664c("FloatWindowModule", "[show]request for permission");
        m184001a(new AbstractC46537b(view, aVar) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$IFGmWCsxOSqFZ7ZvbOy5h3uFsw */
            public final /* synthetic */ View f$1;
            public final /* synthetic */ C46531e.AbstractC46536a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.floating.C46531e.AbstractC46537b
            public final void permissionGranted(boolean z) {
                C46531e.this.m184009c(this.f$1, this.f$2, z);
            }
        }, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m184000a(AbstractC46536a aVar, View view, MiniType miniType, boolean z) {
        if (mo163454e()) {
            C45855f.m181664c("FloatWindowModule", "[show]other type mini window is showing!");
            aVar.mo163407a(false);
            return;
        }
        mo163455f();
        m184007c(view, miniType, z, aVar);
    }

    /* renamed from: b */
    public void mo163451b(View view, MiniType miniType, boolean z, AbstractC46536a aVar) {
        C45859k.m181685a(new Runnable(aVar, view, miniType, z) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.floating.$$Lambda$e$jFo3XqIwV1wDXEjOjxitbGjGcyE */
            public final /* synthetic */ C46531e.AbstractC46536a f$1;
            public final /* synthetic */ View f$2;
            public final /* synthetic */ MiniType f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C46531e.this.m184000a((C46531e) this.f$1, (C46531e.AbstractC46536a) this.f$2, (View) this.f$3, (MiniType) this.f$4);
            }
        });
    }
}
