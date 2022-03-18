package com.bytedance.ee.bear.doc.structure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Range;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.PluginInfoExtractException;
import com.bytedance.ee.bear.doc.structure.AbstractC5535c;
import com.bytedance.ee.bear.doc.structure.ParagraphLayout;
import com.bytedance.ee.bear.doc.structure.Structure;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13630j;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.doc.structure.b */
public class C5527b extends C7667e {

    /* renamed from: g */
    static final /* synthetic */ boolean f15726g = true;

    /* renamed from: A */
    private boolean f15727A;

    /* renamed from: a */
    public AbstractC5535c<Structure> f15728a;

    /* renamed from: b */
    public View f15729b;

    /* renamed from: c */
    public View f15730c;

    /* renamed from: d */
    public ParagraphLayout f15731d;

    /* renamed from: e */
    public final Runnable f15732e = new Runnable() {
        /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$YOxoJfCoAgojAZsGZS5NMejesDU */

        public final void run() {
            C5527b.lambda$YOxoJfCoAgojAZsGZS5NMejesDU(C5527b.this);
        }
    };

    /* renamed from: f */
    public final Runnable f15733f = new Runnable() {
        /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$J13xo1hJRebRXLXWSmY9Ofolqo */

        public final void run() {
            C5527b.m269185lambda$J13xo1hJRebRXLXWSmY9Ofolqo(C5527b.this);
        }
    };

    /* renamed from: h */
    private final String f15734h = ("FloatingStructure#" + Integer.toHexString(hashCode()));

    /* renamed from: i */
    private C5537d f15735i;

    /* renamed from: j */
    private float f15736j;

    /* renamed from: k */
    private float f15737k;

    /* renamed from: l */
    private int f15738l;

    /* renamed from: m */
    private boolean f15739m;

    /* renamed from: n */
    private int f15740n;

    /* renamed from: o */
    private View f15741o;

    /* renamed from: p */
    private ViewGroup f15742p;

    /* renamed from: q */
    private C5534a f15743q;

    /* renamed from: r */
    private List<View> f15744r;

    /* renamed from: s */
    private boolean f15745s;

    /* renamed from: t */
    private ObjectAnimator f15746t;

    /* renamed from: u */
    private AnimatorSet f15747u;

    /* renamed from: v */
    private ObjectAnimator f15748v;

    /* renamed from: w */
    private String f15749w = "";

    /* renamed from: x */
    private final Runnable f15750x = new Runnable() {
        /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$bm3ZMzwMgfG_MfWoukI48tDrZ4A */

        public final void run() {
            C5527b.lambda$bm3ZMzwMgfG_MfWoukI48tDrZ4A(C5527b.this);
        }
    };

    /* renamed from: y */
    private final Runnable f15751y = new Runnable() {
        /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$fIKhKxQwH5SkmPInEGO216bBAQ */

        public final void run() {
            C5527b.m269189lambda$fIKhKxQwH5SkmPInEGO216bBAQ(C5527b.this);
        }
    };

    /* renamed from: z */
    private boolean f15752z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m22463a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || this.f15731d.getVisibility() != 0 || motionEvent.getX() >= this.f15731d.getX()) {
            return false;
        }
        m22474e();
        return f15726g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0 != 3) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22462a(android.view.MotionEvent r4) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.structure.C5527b.m22462a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private boolean m22460a(float f, float f2) {
        if (this.f15729b.getVisibility() != 0 || BitmapDescriptorFactory.HUE_RED > f || f > ((float) this.f15729b.getWidth()) || this.f15729b.getY() > f2 || f2 > this.f15729b.getY() + ((float) this.f15729b.getHeight())) {
            return false;
        }
        return f15726g;
    }

    /* renamed from: a */
    private void m22454a(View view, int i) {
        if (!((C5538e) this.f15728a).isFixMode()) {
            m22452a(i);
            Structure b = this.f15728a.getContent().mo5927b();
            if (!this.f15739m && b != null) {
                C13742g.m55710c(this.f15751y);
                C13742g.m55710c(this.f15732e);
                C13742g.m55706a(this.f15732e, 2000);
            }
        }
    }

    /* renamed from: a */
    public void mo22078a() {
        if (this.f15729b.getVisibility() != 0 && this.f15728a.getContent().mo5927b() != null && this.f15745s) {
            C13479a.m54772d(this.f15734h, "animationInDragHandle");
            this.f15740n = this.f15728a.computeContentHeight();
            this.f15729b.setVisibility(0);
            View view = this.f15729b;
            ObjectAnimator.ofFloat(view, "x", (float) view.getWidth(), 0.0f).setDuration(200L).start();
        }
    }

    /* renamed from: a */
    public void mo22079a(Structure structure) {
        int i = 0;
        this.f15745s = false;
        if (structure != null) {
            i = structure.getParagraphCount();
        }
        int childCount = this.f15731d.getChildCount();
        int size = this.f15744r.size();
        if (i > childCount + size) {
            ArrayList arrayList = new ArrayList();
            Disposable b = AbstractC68307f.m265083a(Integer.valueOf((i - childCount) - size)).mo238014c(new Function(arrayList) {
                /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$V16ID5OW2NdytQ2gb4Hywk5SK6o */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C5527b.lambda$V16ID5OW2NdytQ2gb4Hywk5SK6o(C5527b.this, this.f$1, (Integer) obj);
                }
            }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(arrayList) {
                /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$ZiOd9HN2AeCfBxAvObFG4qZMR7I */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5527b.lambda$ZiOd9HN2AeCfBxAvObFG4qZMR7I(C5527b.this, this.f$1, obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$XsmgJYtkWU5jztIIu4ReROiNZY */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5527b.m269187lambda$XsmgJYtkWU5jztIIu4ReROiNZY(C5527b.this, (Throwable) obj);
                }
            });
            String str = this.f15734h;
            C13479a.m54764b(str, "disposable = " + b);
            return;
        }
        m22472d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22459a(List list, Object obj) throws Exception {
        this.f15744r.addAll(list);
        m22472d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22456a(Structure.Paragraph paragraph, View view) {
        m22453a(view);
        this.f15728a.scrollTo(paragraph.getHash());
        m22475f();
        this.f15735i.mo22105b();
    }

    /* renamed from: a */
    public void mo22080a(String str) {
        if (this.f15731d.getVisibility() == 0) {
            if (!this.f15749w.equals(str)) {
                C13630j.m55310a(getContext(), 10, 50);
            }
            this.f15749w = str;
            return;
        }
        this.f15749w = "";
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.doc.structure.b$a */
    public class C5534a implements AbstractC6214a {

        /* renamed from: b */
        private C1177w<Boolean> f15760b;

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public String getPanelName() {
            return "catalog";
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void requestNotFocus(Context context) {
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public boolean shouldNotifyVCKeyboardEvent() {
            return false;
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public LiveData<Boolean> getActive() {
            if (this.f15760b == null) {
                this.f15760b = new C1177w<>();
            }
            return this.f15760b;
        }

        private C5534a() {
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public int getPanelHeight(Context context) {
            return context.getResources().getDimensionPixelSize(R.dimen.toolbar_menu_height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo22088a(boolean z) {
            C1177w wVar = (C1177w) getActive();
            if (wVar.mo5927b() == null || ((Boolean) wVar.mo5927b()).booleanValue() != z) {
                wVar.mo5929b(Boolean.valueOf(z));
            }
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
            if (aVar == null) {
                bVar.requestUpdateWebContentHeight();
            }
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
            if (aVar == null) {
                bVar.requestUpdateWebContentHeight();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m22474e() {
        C13742g.m55710c(this.f15732e);
        C13479a.m54772d(this.f15734h, "animationExit");
        m22476g();
        m22477h();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m22475f() {
        C13742g.m55710c(this.f15750x);
        m22476g();
        C13742g.m55710c(this.f15751y);
        C13742g.m55706a(this.f15751y, 2000);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C13742g.m55710c(this.f15732e);
        this.f15743q.mo22088a(false);
        this.f15728a.setContentScrollListener(null);
        this.f15728a.setContentTouchListener(null);
    }

    /* renamed from: c */
    private Range<Float> m22469c() {
        float paddingTop = (float) this.f15742p.getPaddingTop();
        float height = (float) ((this.f15742p.getHeight() - this.f15742p.getPaddingBottom()) - this.f15729b.getHeight());
        if (paddingTop >= height) {
            return new Range<>(Float.valueOf(paddingTop), Float.valueOf(paddingTop + 1.0f));
        }
        return new Range<>(Float.valueOf(paddingTop), Float.valueOf(height));
    }

    /* renamed from: j */
    private void m22479j() {
        try {
            StructurePlugin structurePlugin = (StructurePlugin) C4943e.m20402a(this).mo19540a(StructurePlugin.class);
            if (!f15726g) {
                if (structurePlugin == null) {
                    throw new AssertionError();
                }
            }
            structurePlugin.showFixedStructure();
            m22474e();
            this.f15735i.mo22104a(f15726g);
        } catch (PluginInfoExtractException e) {
            C13479a.m54761a(this.f15734h, e);
        }
    }

    /* renamed from: g */
    private void m22476g() {
        AnimatorSet animatorSet = this.f15747u;
        if ((animatorSet == null || !animatorSet.isRunning()) && this.f15731d.getVisibility() == 0) {
            ParagraphLayout paragraphLayout = this.f15731d;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(paragraphLayout, "x", paragraphLayout.getX(), (float) this.f15741o.getWidth());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f15731d, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f15747u = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2);
            this.f15747u.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.doc.structure.C5527b.C55314 */

                public void onAnimationEnd(Animator animator) {
                    C5527b.this.f15731d.setVisibility(4);
                    C5527b.this.f15731d.setAlpha(1.0f);
                }

                public void onAnimationStart(Animator animator) {
                    C13742g.m55710c(C5527b.this.f15733f);
                    C13742g.m55706a(C5527b.this.f15733f, 150);
                }
            });
            this.f15747u.setDuration(300L).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22477h() {
        ObjectAnimator objectAnimator = this.f15746t;
        if ((objectAnimator == null || !objectAnimator.isRunning()) && this.f15729b.getVisibility() == 0) {
            View view = this.f15729b;
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "x", view.getX(), (float) this.f15729b.getWidth()).setDuration(300L);
            this.f15746t = duration;
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.doc.structure.C5527b.C55325 */

                public void onAnimationEnd(Animator animator) {
                    C5527b.this.f15729b.setVisibility(4);
                }
            });
            this.f15746t.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m22478i() {
        ObjectAnimator objectAnimator = this.f15748v;
        if ((objectAnimator == null || !objectAnimator.isRunning()) && this.f15730c.getVisibility() == 0) {
            C13742g.m55710c(this.f15733f);
            View view = this.f15730c;
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "y", view.getY(), (float) this.f15741o.getHeight()).setDuration(300L);
            this.f15748v = duration;
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.doc.structure.C5527b.C55336 */

                public void onAnimationEnd(Animator animator, boolean z) {
                    C5527b.this.f15730c.setVisibility(4);
                }
            });
            this.f15748v.start();
            if (this.f15730c.getVisibility() == 0) {
                this.f15743q.mo22088a(false);
            }
        }
    }

    /* renamed from: b */
    private void m22464b() {
        if (this.f15731d.getVisibility() != 0) {
            this.f15731d.setVisibility(0);
            this.f15731d.setAlpha(1.0f);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15731d, "x", (float) this.f15741o.getWidth(), (float) (this.f15741o.getWidth() - this.f15731d.getWidth())).setDuration(100L);
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.doc.structure.C5527b.C55303 */

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C5527b bVar = C5527b.this;
                    bVar.mo22080a(bVar.f15728a.getActive());
                }
            });
            duration.start();
            this.f15730c.setVisibility(0);
            ObjectAnimator.ofFloat(this.f15730c, "y", (float) this.f15741o.getHeight(), (float) (this.f15741o.getHeight() - this.f15730c.getHeight())).setDuration(100L).start();
            this.f15743q.mo22088a(f15726g);
        }
    }

    /* renamed from: d */
    private void m22472d() {
        int i;
        C13479a.m54772d(this.f15734h, "resetParagraphViews");
        Structure b = this.f15728a.getContent().mo5927b();
        if (b == null) {
            i = 0;
        } else {
            i = b.getParagraphCount();
        }
        int childCount = this.f15731d.getChildCount();
        if (i > this.f15744r.size() + childCount) {
            C13479a.m54758a(this.f15734h, "resetParagraphViews ERR");
            return;
        }
        if (childCount > i) {
            for (int i2 = 0; i2 < childCount - i; i2++) {
                ParagraphLayout paragraphLayout = this.f15731d;
                View childAt = paragraphLayout.getChildAt(paragraphLayout.getChildCount() - 1);
                this.f15731d.removeView(childAt);
                this.f15744r.add(childAt);
            }
        } else if (childCount < i) {
            for (int i3 = 0; i3 < i - childCount; i3++) {
                this.f15731d.addView(this.f15744r.remove(0));
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            TextView textView = (TextView) this.f15731d.getChildAt(i4);
            Structure.Paragraph paragraph = b.getParagraph(i4);
            textView.setText(paragraph.title);
            textView.setTag(paragraph);
            if (this.f15727A) {
                C25649b.m91857a(textView, LarkFont.BODY0);
            }
            textView.setOnClickListener(new View.OnClickListener(paragraph) {
                /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$ZePLz5TbUEJuamSEFqbJ9YLxKc */
                public final /* synthetic */ Structure.Paragraph f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C5527b.m269188lambda$ZePLz5TbUEJuamSEFqbJ9YLxKc(C5527b.this, this.f$1, view);
                }
            });
        }
        this.f15740n = this.f15728a.computeContentHeight();
        m22452a(this.f15728a.getContentScroll());
        this.f15745s = f15726g;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22466b(View view) {
        m22479j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22458a(Throwable th) throws Exception {
        C13479a.m54761a(this.f15734h, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22457a(Boolean bool) {
        int i;
        ViewGroup viewGroup = this.f15742p;
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 4;
        }
        viewGroup.setVisibility(i);
    }

    /* renamed from: a */
    private int m22447a(Structure.Paragraph paragraph) {
        if (paragraph == null) {
            return -1;
        }
        int childCount = this.f15731d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (paragraph == this.f15731d.getChildAt(i).getTag()) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m22470c(float f) {
        this.f15729b.setY(m22469c().clamp(Float.valueOf(f)).floatValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 != 3) goto L_0x0035;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22467b(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            float r5 = r5.getY()
            com.bytedance.ee.bear.doc.structure.c<com.bytedance.ee.bear.doc.structure.Structure> r1 = r4.f15728a
            int r1 = r1.getContentHeight()
            r4.f15740n = r1
            r1 = 1
            if (r0 == r1) goto L_0x0026
            r2 = 2
            if (r0 == r2) goto L_0x001a
            r2 = 3
            if (r0 == r2) goto L_0x0026
            goto L_0x0035
        L_0x001a:
            com.bytedance.ee.bear.doc.structure.c<com.bytedance.ee.bear.doc.structure.Structure> r0 = r4.f15728a
            int r0 = r0.computeContentHeight()
            r4.f15740n = r0
            r4.m22465b(r5)
            goto L_0x0035
        L_0x0026:
            r4.m22465b(r5)
            java.lang.Runnable r5 = r4.f15732e
            com.bytedance.ee.util.p718t.C13742g.m55710c(r5)
            java.lang.Runnable r5 = r4.f15732e
            r2 = 2000(0x7d0, double:9.88E-321)
            com.bytedance.ee.util.p718t.C13742g.m55706a(r5, r2)
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.structure.C5527b.m22467b(android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f15726g || activity != null) {
            C5538e eVar = (C5538e) C4950k.m20474a(this, C5538e.class);
            this.f15728a = eVar;
            this.f15735i = eVar.getStructureAnalytic();
            C6215b bVar = (C6215b) aj.m5366a(activity).mo6005a(C6215b.class);
            C5534a aVar = new C5534a();
            this.f15743q = aVar;
            bVar.registerEditPanel(this, aVar);
            AbstractC10550f.AbstractC10551a.m43717b(activity).mo39924a(bVar);
            this.f15752z = C4211a.m17514a().mo16536a("spacekit.mobile.floating_structure_slide_enable", false);
            this.f15744r = new ArrayList();
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f15727A = arguments.getBoolean("enableFontScale");
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22473d(float f) {
        this.f15736j = f;
        this.f15737k = this.f15729b.getY();
        this.f15738l = 0;
        C13742g.m55710c(this.f15732e);
        this.f15740n = this.f15728a.computeContentHeight();
    }

    /* renamed from: b */
    private void m22465b(float f) {
        float f2 = this.f15737k + (f - this.f15736j);
        Range<Float> c = m22469c();
        if (Math.abs(this.f15729b.getY() - c.clamp(Float.valueOf(f2)).floatValue()) / (c.getUpper().floatValue() - c.getLower().floatValue()) >= 0.001f) {
            m22470c(f2);
            int round = Math.round(((this.f15729b.getY() - c.getLower().floatValue()) / (c.getUpper().floatValue() - c.getLower().floatValue())) * ((float) this.f15740n));
            if (round < 0) {
                round = 0;
            } else {
                int i = this.f15740n;
                if (round > i) {
                    round = i;
                }
            }
            if (this.f15738l == 0) {
                this.f15738l = round;
            }
            this.f15728a.scrollTo(this.f15738l, round);
            this.f15738l = round;
        }
    }

    /* renamed from: a */
    private void m22452a(int i) {
        int i2;
        Structure.Paragraph paragraph;
        boolean z;
        int i3;
        Structure b = this.f15728a.getContent().mo5927b();
        if (!(b == null || (i2 = this.f15740n) == 0)) {
            float f = (float) i;
            Range<Float> c = m22469c();
            m22470c(((f / ((float) i2)) * (c.getUpper().floatValue() - c.getLower().floatValue())) + c.getLower().floatValue());
            if (this.f15728a.isUpdateActiveByFixedStructure()) {
                paragraph = m22449a(b, this.f15728a.getActive());
            } else {
                paragraph = m22448a(b, ((float) this.f15742p.getTop()) + this.f15729b.getY() + f);
            }
            this.f15728a.setIsUpdateActiveByFixedStructure(false);
            int a = m22447a(paragraph);
            if (a >= 0) {
                this.f15728a.setActive(paragraph.getHash());
                float y = ((this.f15729b.getY() + (((float) this.f15729b.getHeight()) / 2.0f)) - (((float) ((TextView) this.f15731d.getChildAt(a)).getHeight()) / 2.0f)) + ((float) this.f15742p.getTop());
                int childCount = this.f15731d.getChildCount();
                int a2 = C13749l.m55738a(4);
                for (int i4 = childCount - 1; i4 >= 0; i4--) {
                    TextView textView = (TextView) this.f15731d.getChildAt(i4);
                    int i5 = i4 - a;
                    textView.setY(((float) ((textView.getHeight() + a2) * i5)) + y);
                    if (i5 == 0) {
                        z = f15726g;
                    } else {
                        z = false;
                    }
                    textView.setSelected(z);
                    if (z) {
                        mo22080a(this.f15728a.getActive());
                    }
                    if (z) {
                        i3 = 5;
                    } else {
                        i3 = 0;
                    }
                    textView.setElevation((float) C13749l.m55738a(i3));
                }
            }
        }
    }

    /* renamed from: a */
    private void m22453a(View view) {
        boolean z;
        int childCount = this.f15731d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f15731d.getChildAt(i);
            if (childAt == view) {
                z = f15726g;
            } else {
                z = false;
            }
            childAt.setSelected(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m22468b(View view, MotionEvent motionEvent) {
        return m22467b(motionEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m22471c(View view, MotionEvent motionEvent) {
        return m22462a(motionEvent);
    }

    /* renamed from: a */
    private Structure.Paragraph m22448a(Structure structure, float f) {
        int paragraphCount;
        if (structure == null || (paragraphCount = structure.getParagraphCount()) == 0) {
            return null;
        }
        int i = 0;
        Structure.Paragraph paragraph = structure.getParagraph(0);
        while (i < paragraphCount) {
            Structure.Paragraph paragraph2 = structure.getParagraph(i);
            if (paragraph2.top < 0 || f <= ((float) paragraph2.top)) {
                break;
            }
            i++;
            paragraph = paragraph2;
        }
        return paragraph;
    }

    /* renamed from: a */
    private Structure.Paragraph m22449a(Structure structure, String str) {
        int paragraphCount;
        if (structure == null || (paragraphCount = structure.getParagraphCount()) == 0) {
            return null;
        }
        Structure.Paragraph paragraph = structure.getParagraph(0);
        for (int i = 0; i < paragraphCount; i++) {
            Structure.Paragraph paragraph2 = structure.getParagraph(i);
            if (str.equals(paragraph2.getHash())) {
                return paragraph2;
            }
        }
        return paragraph;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m22450a(List list, Integer num) throws Exception {
        for (int i = 0; i < num.intValue(); i++) {
            list.add(LayoutInflater.from(getContext()).inflate(R.layout.floating_structure_item, (ViewGroup) this.f15731d, false));
        }
        return AbstractC68307f.m265083a(num);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f15741o = view.findViewById(R.id.contentExcludeKeyboard);
        View findViewById = view.findViewById(R.id.dragHandle);
        this.f15729b = findViewById;
        findViewById.setVisibility(4);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.dragHandleContainer);
        this.f15742p = viewGroup;
        viewGroup.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$nq_75DnDCgJnCGcZiWmlBnzp_DQ */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C5527b.lambda$nq_75DnDCgJnCGcZiWmlBnzp_DQ(C5527b.this, view, motionEvent);
            }
        });
        ((C5538e) this.f15728a).floatingStructureVisible().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$LD5kYG7UG73DB8Yjw9GkNDRoHc */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C5527b.m269186lambda$LD5kYG7UG73DB8Yjw9GkNDRoHc(C5527b.this, (Boolean) obj);
            }
        });
        ParagraphLayout paragraphLayout = (ParagraphLayout) view.findViewById(R.id.paragraphContainer);
        this.f15731d = paragraphLayout;
        paragraphLayout.setVisibility(4);
        if (this.f15752z) {
            this.f15731d.setOnActionDownListener(new ParagraphLayout.AbstractC5519a() {
                /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$XbPooqe_JTaJRXtYbEbmh6y3VFk */

                @Override // com.bytedance.ee.bear.doc.structure.ParagraphLayout.AbstractC5519a
                public final void doAction(float f) {
                    C5527b.lambda$XbPooqe_JTaJRXtYbEbmh6y3VFk(C5527b.this, f);
                }
            });
            this.f15731d.setOnTouchListener(new View.OnTouchListener() {
                /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$GO1IS4xrDbI7WqdLjlXoGpb5iEs */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C5527b.lambda$GO1IS4xrDbI7WqdLjlXoGpb5iEs(C5527b.this, view, motionEvent);
                }
            });
        }
        View findViewById2 = view.findViewById(R.id.showFixedStructure);
        this.f15730c = findViewById2;
        if (this.f15727A) {
            C25649b.m91857a((TextView) findViewById2, LarkFont.BODY0);
        }
        this.f15730c.setVisibility(4);
        this.f15730c.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$zeLdXDwnRr4assq_QVgXkL8rtqc */

            public final void onClick(View view) {
                C5527b.lambda$zeLdXDwnRr4assq_QVgXkL8rtqc(C5527b.this, view);
            }
        });
        this.f15728a.getContent().mo5923a(this, new AbstractC1178x<Structure>() {
            /* class com.bytedance.ee.bear.doc.structure.C5527b.C55281 */

            /* renamed from: a */
            public void onChanged(Structure structure) {
                C5527b.this.mo22079a(structure);
            }
        });
        this.f15728a.setContentScrollListener(new AbstractC5535c.AbstractC5536a() {
            /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$qb7oWZhRSZcN_S_fnDP_zuI6X8 */

            @Override // com.bytedance.ee.bear.doc.structure.AbstractC5535c.AbstractC5536a
            public final void onContentScrolled(View view, int i, int i2, int i3, int i4) {
                C5527b.m269190lambda$qb7oWZhRSZcN_S_fnDP_zuI6X8(C5527b.this, view, i, i2, i3, i4);
            }
        });
        this.f15728a.setContentTouchListener(new View.OnTouchListener(new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.doc.structure.C5527b.C55292 */

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C5527b.this.mo22078a();
                C13742g.m55710c(C5527b.this.f15732e);
                C13742g.m55706a(C5527b.this.f15732e, 2000);
                return false;
            }
        })) {
            /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$3xuEbBpEzsgyEmjkNEK8DsIT8DM */
            public final /* synthetic */ GestureDetector f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C5527b.lambda$3xuEbBpEzsgyEmjkNEK8DsIT8DM(this.f$0, view, motionEvent);
            }
        });
        ((C5538e) this.f15728a).setFixMode(false);
        this.f15741o.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ee.bear.doc.structure.$$Lambda$b$IgvVse00_nsO_rMunJQ5J2UTZNM */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C5527b.lambda$IgvVse00_nsO_rMunJQ5J2UTZNM(C5527b.this, view, motionEvent);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.floating_structure_fragment, viewGroup, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22455a(View view, int i, int i2, int i3, int i4) {
        m22454a(view, i2);
    }
}
