package com.bytedance.ee.bear.wiki.wikitree;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC0259b;
import androidx.core.view.AbstractC0912n;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.common.widget.InterceptableRecyclerView;
import com.bytedance.ee.bear.wiki.common.widget.WikiPanelTitleView;
import com.bytedance.ee.bear.wiki.p577b.C11909b;
import com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g;
import com.bytedance.ee.bear.wiki.wikitree.tree.C12164q;
import com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12136e;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12139h;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13659d;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.j */
public class DialogInterface$OnDismissListenerC12118j implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener, AbstractC12071b {

    /* renamed from: a */
    public ViewGroup f32644a;

    /* renamed from: b */
    public WikiPanelTitleView f32645b;

    /* renamed from: c */
    public C7728a f32646c;

    /* renamed from: d */
    public C12164q f32647d;

    /* renamed from: e */
    public DialogC0259b f32648e;

    /* renamed from: f */
    public C11909b f32649f;

    /* renamed from: g */
    public Runnable f32650g;

    /* renamed from: h */
    public AbstractC12071b.AbstractC12072a f32651h;

    /* renamed from: i */
    public C12126a f32652i = new C12126a();

    /* renamed from: j */
    private View f32653j;

    /* renamed from: k */
    private View f32654k;

    /* renamed from: l */
    private BaseActivity f32655l;

    /* renamed from: m */
    private C10917c f32656m;

    /* renamed from: n */
    private String f32657n;

    /* renamed from: o */
    private ValueAnimator f32658o;

    /* renamed from: p */
    private int f32659p;

    /* renamed from: q */
    private AbstractC10550f f32660q;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50095a(View view) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: c */
    public void mo46211c(String str, String str2) {
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: a */
    public void mo46208a(String str, String str2, String str3) {
        if (m50099b(str)) {
            this.f32647d.mo46506b(str2, str3);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: a */
    public void mo46204a() {
        this.f32647d.mo46344a();
    }

    /* renamed from: f */
    private void m50100f() {
        this.f32647d.mo46498a(new InterceptableRecyclerView.AbstractC11939a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.DialogInterface$OnDismissListenerC12118j.C121213 */

            /* renamed from: b */
            private int f32664b;

            @Override // com.bytedance.ee.bear.wiki.common.widget.InterceptableRecyclerView.AbstractC11939a
            /* renamed from: a */
            public boolean mo45860a(MotionEvent motionEvent, int i, int i2, int i3, int i4) {
                if (DialogInterface$OnDismissListenerC12118j.this.f32645b.mo45861a()) {
                    DialogInterface$OnDismissListenerC12118j.this.f32647d.mo46498a((InterceptableRecyclerView.AbstractC11939a) null);
                    return false;
                } else if (motionEvent.getAction() == 0) {
                    this.f32664b = DialogInterface$OnDismissListenerC12118j.this.f32644a.getHeight();
                    return false;
                } else {
                    int i5 = this.f32664b + i2;
                    float f = (float) i5;
                    if (f > C7728a.m30905b()) {
                        DialogInterface$OnDismissListenerC12118j.this.f32647d.mo46498a((InterceptableRecyclerView.AbstractC11939a) null);
                        return false;
                    }
                    int height = DialogInterface$OnDismissListenerC12118j.this.f32644a.getHeight();
                    if (i2 <= 0 || i5 < height) {
                        return false;
                    }
                    DialogInterface$OnDismissListenerC12118j.this.f32646c.mo30249a(f);
                    return true;
                }
            }
        });
    }

    /* renamed from: c */
    public boolean mo46297c() {
        DialogC0259b bVar = this.f32648e;
        if (bVar == null || !bVar.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m50102h() {
        this.f32646c.mo30253a(new C7728a.AbstractC7730a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$j$jojLqXG_cvXBorHRfUbmp9LsWE */

            @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
            public final void onHeightChange(int i) {
                DialogInterface$OnDismissListenerC12118j.this.m50098b((DialogInterface$OnDismissListenerC12118j) i);
            }
        });
        this.f32653j.setOnClickListener(new AbstractView$OnClickListenerC11839e(LocationRequest.PRIORITY_INDOOR) {
            /* class com.bytedance.ee.bear.wiki.wikitree.DialogInterface$OnDismissListenerC12118j.C121246 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                DialogInterface$OnDismissListenerC12118j.this.mo46298d();
            }
        });
        this.f32644a.setOnClickListener($$Lambda$j$smCP0IblGmmhQt2JHIrwnXwVg.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: b */
    public void mo46209b() {
        C13479a.m54764b("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.detach. ");
        ValueAnimator valueAnimator = this.f32658o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Runnable runnable = this.f32650g;
        if (runnable != null) {
            C13742g.m55710c(runnable);
        }
        mo46298d();
        this.f32647d.mo46348d();
    }

    /* renamed from: d */
    public void mo46298d() {
        if (mo46297c()) {
            C13479a.m54764b("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.hide. ");
            mo46299e();
        }
    }

    /* renamed from: e */
    public void mo46299e() {
        KeyboardUtils.hideKeyboard(this.f32653j.getContext(), this.f32653j);
        DialogC0259b bVar = this.f32648e;
        if (bVar != null && bVar.isShowing()) {
            this.f32648e.dismiss();
        }
        AbstractC10550f fVar = this.f32660q;
        if (fVar != null) {
            fVar.mo39933g();
        }
        C10917c cVar = this.f32656m;
        String str = this.f32657n;
        C11933b.m49474a(cVar, "close_pages", str, str);
    }

    /* renamed from: g */
    private void m50101g() {
        DialogC0259b bVar = this.f32648e;
        if (bVar != null && bVar.getWindow() != null) {
            WindowManager.LayoutParams attributes = this.f32648e.getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = this.f32655l.findViewById(16908290).getHeight();
            if (attributes.height == 0) {
                C13479a.m54764b("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.initWindow, content not init. ");
                attributes.height = C13749l.m55748b();
            }
            this.f32648e.getWindow().setAttributes(attributes);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.j$a */
    public class C12126a implements AbstractC12144f.AbstractC12147c {

        /* renamed from: b */
        private List<AbstractC12144f.AbstractC12147c> f32670b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC12144f.AbstractC12147c mo46304a(AbstractC12144f.AbstractC12147c cVar) {
            this.f32670b.add(cVar);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo46305b(AbstractC12144f.AbstractC12147c cVar) {
            this.f32670b.remove(cVar);
        }

        private C12126a() {
            this.f32670b = new ArrayList(2);
        }

        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12147c
        public void onSpaceInit(boolean z) {
            C13659d.m55432a(this.f32670b, new C13659d.AbstractC13661b(z) {
                /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$j$a$a9ZHxcjr5ZxPY8aDVRAA3UzV4S0 */
                public final /* synthetic */ boolean f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
                public final void accept(Object obj) {
                    ((AbstractC12144f.AbstractC12147c) obj).onSpaceInit(this.f$0);
                }
            });
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f32647d.mo46347c();
    }

    public void onShow(DialogInterface dialogInterface) {
        this.f32647d.mo46346b();
    }

    /* renamed from: a */
    private void m50096a(Window window) {
        ViewCompat.m4044a(window.getDecorView(), new AbstractC0912n() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$j$KvbntBgtqlr0VZ8rg7rl2jG78Uk */

            @Override // androidx.core.view.AbstractC0912n
            public final C0883ab onApplyWindowInsets(View view, C0883ab abVar) {
                return DialogInterface$OnDismissListenerC12118j.this.m50094a(view, abVar);
            }
        });
    }

    /* renamed from: b */
    private boolean m50099b(String str) {
        return TextUtils.equals(this.f32647d.mo46516x(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50098b(int i) {
        if (i == 0 && mo46297c()) {
            mo46298d();
        }
        if (i != this.f32659p && i == ((int) C7728a.m30905b())) {
            C13479a.m54772d("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.OnHeightChanged, has reach the max dragView height. ");
            C10917c cVar = this.f32656m;
            String str = this.f32657n;
            C11933b.m49474a(cVar, "full_expand_pages", str, str);
        }
        this.f32647d.mo46504b(i - this.f32655l.getResources().getDimensionPixelSize(R.dimen.wiki_tree_panel_bar_height));
        this.f32659p = i;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: a */
    public C12136e mo46203a(String str) {
        if (m50099b(str)) {
            return this.f32647d.mo46496C();
        }
        return null;
    }

    /* renamed from: a */
    private void m50097a(BaseActivity baseActivity) {
        DialogC0259b bVar = new DialogC0259b(baseActivity, R.style.WikiPanelDialogStyle);
        this.f32648e = bVar;
        Window window = bVar.getWindow();
        if (window != null) {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40646a((FrameLayout) window.getDecorView());
            window.setContentView(this.f32653j);
            window.setGravity(80);
            window.setSoftInputMode(50);
            m50101g();
            m50096a(window);
            this.f32648e.setOnCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.DialogInterface$OnDismissListenerC12118j.DialogInterface$OnCancelListenerC121224 */

                public void onCancel(DialogInterface dialogInterface) {
                    DialogInterface$OnDismissListenerC12118j.this.mo46299e();
                }
            });
            this.f32648e.setOnShowListener(this);
            this.f32648e.setOnDismissListener(this);
            return;
        }
        C13479a.m54758a("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.initDialog, dialog window is null. ");
    }

    /* renamed from: a */
    public void mo46296a(int i) {
        int i2 = this.f32644a.getLayoutParams().height;
        if (i <= i2) {
            C13479a.m54764b("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.resetHeight, targetHeight <= viewHeight. ");
            return;
        }
        ValueAnimator valueAnimator = this.f32658o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        this.f32658o = ofInt;
        ofInt.setDuration(150L);
        this.f32658o.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f32658o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.DialogInterface$OnDismissListenerC12118j.C121235 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DialogInterface$OnDismissListenerC12118j.this.f32646c.mo30249a((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f32658o.start();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: a */
    public void mo46206a(AbstractC12071b.AbstractC12072a aVar) {
        this.f32651h = aVar;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: d */
    public boolean mo46212d(String str, String str2) {
        if (m50099b(str)) {
            return this.f32647d.mo46509d(str2);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ C0883ab m50094a(View view, C0883ab abVar) {
        int i;
        if (abVar != null) {
            i = abVar.mo4647d();
        } else {
            i = 0;
        }
        View view2 = this.f32654k;
        view2.setPadding(view2.getPaddingLeft(), this.f32654k.getPaddingTop(), this.f32654k.getPaddingRight(), i);
        return abVar;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: b */
    public void mo46210b(String str, String str2) {
        C13479a.m54764b("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.showWithOnBoarding. ");
        C12164q qVar = this.f32647d;
        if (qVar != null) {
            qVar.mo46502a(this.f32652i.mo46304a(new AbstractC12144f.AbstractC12147c() {
                /* class com.bytedance.ee.bear.wiki.wikitree.DialogInterface$OnDismissListenerC12118j.C121257 */

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12147c
                public void onSpaceInit(boolean z) {
                    if (z) {
                        String v = DialogInterface$OnDismissListenerC12118j.this.f32647d.mo46514v();
                        if (!TextUtils.isEmpty(v)) {
                            DialogInterface$OnDismissListenerC12118j jVar = DialogInterface$OnDismissListenerC12118j.this;
                            jVar.f32650g = jVar.f32649f.mo45789a(v, DialogInterface$OnDismissListenerC12118j.this.f32648e);
                            DialogInterface$OnDismissListenerC12118j.this.f32652i.mo46305b(this);
                        }
                    }
                }
            }));
            if (!mo46297c()) {
                mo46207a(str, str2);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: a */
    public void mo46207a(String str, String str2) {
        if (this.f32648e != null && !mo46297c()) {
            C13479a.m54764b("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.show, spaceId= " + C13721c.m55650d(str) + ", wikiToken: " + C13721c.m55650d(str2));
            this.f32657n = str2;
            this.f32646c.mo30259e();
            this.f32648e.show();
            if (this.f32648e.getWindow() != null) {
                this.f32660q.mo39923a(this.f32648e.getWindow());
            }
            KeyboardUtils.hideKeyboard(this.f32648e.getContext());
            this.f32645b.setText("");
            m50100f();
            C11933b.m49474a(this.f32656m, "expand_pages", str2, str2);
        }
    }

    public DialogInterface$OnDismissListenerC12118j(BaseActivity baseActivity, C10917c cVar, AbstractC12148g gVar) {
        this.f32656m = cVar;
        this.f32655l = baseActivity;
        this.f32660q = AbstractC10550f.AbstractC10551a.m43717b(baseActivity);
        View inflate = View.inflate(baseActivity, R.layout.wiki_panel_dialog_layout, null);
        this.f32653j = inflate;
        this.f32645b = (WikiPanelTitleView) inflate.findViewById(R.id.wiki_panel_title);
        ViewGroup viewGroup = (ViewGroup) this.f32653j.findViewById(R.id.v_bg);
        this.f32644a = viewGroup;
        C7728a aVar = new C7728a(baseActivity, viewGroup);
        this.f32646c = aVar;
        aVar.mo30259e();
        this.f32646c.mo30252a(this.f32645b);
        View findViewById = this.f32653j.findViewById(R.id.wiki_tree);
        this.f32654k = findViewById;
        C12164q qVar = new C12164q(baseActivity, cVar, baseActivity, (AbstractC12177b) findViewById, C12139h.m50258a(cVar), gVar, WikiTreeType.PANEL);
        this.f32647d = qVar;
        qVar.mo46501a(new AbstractC12144f.AbstractC12146b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.DialogInterface$OnDismissListenerC12118j.C121191 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12146b
            /* renamed from: a */
            public void mo46262a() {
                C13479a.m54764b("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.onSearchResultClick, set tree panel dismiss. ");
                DialogInterface$OnDismissListenerC12118j.this.mo46298d();
            }

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12146b
            /* renamed from: a */
            public boolean mo46263a(boolean z) {
                if (!z) {
                    return false;
                }
                C13479a.m54764b("Wiki_WikiTreePanelDialogImpl", "WikiTreePanelDialogImpl.onDoSearching, set tree panel max height. ");
                DialogInterface$OnDismissListenerC12118j.this.mo46296a((int) C7728a.m30905b());
                return false;
            }
        });
        this.f32647d.mo46502a(this.f32652i.mo46304a(new AbstractC12144f.AbstractC12147c() {
            /* class com.bytedance.ee.bear.wiki.wikitree.DialogInterface$OnDismissListenerC12118j.C121202 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12147c
            public void onSpaceInit(boolean z) {
                HomePage w;
                if (z && (w = DialogInterface$OnDismissListenerC12118j.this.f32647d.mo46515w()) != null) {
                    DialogInterface$OnDismissListenerC12118j.this.f32645b.setText(w.getSpaceName());
                    if (DialogInterface$OnDismissListenerC12118j.this.f32651h != null) {
                        DialogInterface$OnDismissListenerC12118j.this.f32651h.onHomePageChange(w);
                    }
                }
            }
        }));
        this.f32649f = new C11909b(this.f32647d, this.f32644a, this.f32655l);
        m50102h();
        m50097a(baseActivity);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b
    /* renamed from: a */
    public void mo46205a(int i, int i2, Intent intent) {
        this.f32647d.mo46345a(i, i2, intent);
    }
}
