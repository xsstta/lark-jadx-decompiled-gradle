package com.bytedance.ee.bear.doc.blockeditpanel.view.panel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5343c;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public abstract class BaseBlockEditPanel extends LinearLayout {

    /* renamed from: a */
    protected View f15285a;

    /* renamed from: b */
    protected AbstractC5343c f15286b;

    /* renamed from: c */
    public BlockEditPanelViewModel f15287c;

    /* renamed from: d */
    private C7728a f15288d;

    /* renamed from: e */
    private FrameLayout f15289e;

    /* renamed from: f */
    private String f15290f;

    /* renamed from: g */
    private boolean f15291g;

    /* renamed from: h */
    private int f15292h;

    /* renamed from: i */
    private int f15293i = C13749l.m55738a(10);

    /* renamed from: j */
    private float f15294j;

    /* renamed from: k */
    private float f15295k;

    /* renamed from: l */
    private boolean f15296l = false;

    /* renamed from: m */
    private int f15297m = -1;

    /* renamed from: a */
    public abstract void mo21453a(BlockEditPanelMenusModel.BlockEditPanel blockEditPanel);

    /* access modifiers changed from: protected */
    public abstract View getContentView();

    public String getPanelId() {
        return this.f15290f;
    }

    /* renamed from: b */
    public void mo21454b() {
        AbstractC5343c cVar = this.f15286b;
        if (cVar != null) {
            cVar.mo21382c(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21455c() {
        AbstractC5343c cVar = this.f15286b;
        if (cVar != null) {
            cVar.mo21380a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21456d() {
        AbstractC5343c cVar = this.f15286b;
        if (cVar != null) {
            cVar.mo21381b(this);
        }
    }

    /* renamed from: e */
    private void m21848e() {
        setOrientation(1);
        setVisibility(4);
    }

    /* renamed from: f */
    private void m21849f() {
        this.f15285a.post(new Runnable() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.$$Lambda$BaseBlockEditPanel$INoBReuU6iuK8pGADdHiM9QJuHw */

            public final void run() {
                BaseBlockEditPanel.this.m21850g();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21452a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationY", ((float) getMeasuredHeight()) * 1.0f, 0.0f).setDuration(200L);
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel.C53642 */

            public void onAnimationStart(Animator animator) {
                BaseBlockEditPanel.this.setVisibility(0);
            }
        });
        duration.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m21850g() {
        float measuredHeight = (float) this.f15285a.getMeasuredHeight();
        C7728a aVar = new C7728a(getContext(), this.f15285a, BitmapDescriptorFactory.HUE_RED, measuredHeight, measuredHeight);
        this.f15288d = aVar;
        aVar.mo30252a(this);
        this.f15288d.mo30255a(false);
        this.f15288d.mo30253a(new C7728a.AbstractC7730a() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.$$Lambda$BaseBlockEditPanel$yqHhpzkqvbBKhnCvLYgQsShByAk */

            @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
            public final void onHeightChange(int i) {
                BaseBlockEditPanel.this.m21847a((BaseBlockEditPanel) i);
            }
        });
        findViewById(R.id.edit_panel_click_view).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel.C53631 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                view.setClickable(false);
                BaseBlockEditPanel.this.mo21454b();
            }
        });
        this.f15288d.mo30254a(new C7728a.AbstractC7731b() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.$$Lambda$PdAKj0uBdn6wIR47HhIS2ToUg9k */

            @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7731b
            public final void onStartDismiss() {
                BaseBlockEditPanel.this.mo21456d();
            }
        });
        mo21452a();
    }

    public void setOnCloseListener(AbstractC5343c cVar) {
        this.f15286b = cVar;
    }

    public void setPanelId(String str) {
        this.f15290f = str;
    }

    public void setViewModel(BlockEditPanelViewModel bVar) {
        this.f15287c = bVar;
    }

    /* renamed from: a */
    public ViewGroup.LayoutParams mo21451a(View view) {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21847a(int i) {
        if (i <= this.f15293i && !this.f15291g) {
            this.f15291g = true;
            mo21455c();
        }
    }

    public BaseBlockEditPanel(Context context) {
        super(context, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0 != 3) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r5.f15296l
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r3 = 0
            if (r0 == 0) goto L_0x0047
            r4 = -1
            if (r0 == r2) goto L_0x0042
            if (r0 == r1) goto L_0x0019
            r1 = 3
            if (r0 == r1) goto L_0x0042
            goto L_0x005b
        L_0x0019:
            int r0 = r5.f15297m
            if (r0 != r4) goto L_0x001e
            goto L_0x005b
        L_0x001e:
            float r0 = r5.f15295k
            float r1 = r6.getRawX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r5.f15294j
            float r3 = r6.getRawY()
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = r5.f15292h
            float r3 = (float) r3
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x005b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            r5.f15296l = r2
            return r2
        L_0x0042:
            r5.f15296l = r3
            r5.f15297m = r4
            goto L_0x005b
        L_0x0047:
            int r0 = r6.getPointerId(r3)
            r5.f15297m = r0
            r5.f15296l = r3
            float r0 = r6.getRawX()
            r5.f15295k = r0
            float r0 = r6.getRawY()
            r5.f15294j = r0
        L_0x005b:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public BaseBlockEditPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaseBlockEditPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.doc_block_edit_panel_container, this);
        m21848e();
        this.f15289e = (FrameLayout) findViewById(R.id.edit_panel_container);
        View contentView = getContentView();
        this.f15285a = contentView;
        this.f15289e.addView(contentView, mo21451a(contentView));
        setClickable(true);
        setFocusable(true);
        m21849f();
        this.f15292h = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
