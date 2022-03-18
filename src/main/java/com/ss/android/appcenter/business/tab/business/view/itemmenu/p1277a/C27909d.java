package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27904a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27918c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b;
import com.ss.android.appcenter.common.util.C28209p;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.a.d */
public class C27909d extends PopupWindow implements ItemMenuAdapter.AbstractC27932a {

    /* renamed from: e */
    public static boolean f69770e;

    /* renamed from: a */
    public FrameLayout f69771a;

    /* renamed from: b */
    public boolean f69772b;

    /* renamed from: c */
    public boolean f69773c;

    /* renamed from: d */
    public C27906b f69774d;

    /* renamed from: f */
    private Activity f69775f;

    /* renamed from: g */
    private C27918c f69776g;

    /* renamed from: h */
    private AbstractC27912a f69777h;

    /* renamed from: i */
    private int f69778i;

    /* renamed from: j */
    private int f69779j;

    /* renamed from: k */
    private int f69780k;

    /* renamed from: l */
    private int f69781l = C28209p.m103291a(16.0f);

    /* renamed from: m */
    private int f69782m = C28209p.m103291a(50.0f);

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.a.d$a */
    public interface AbstractC27912a {
        void onDismiss();
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27932a
    /* renamed from: c */
    public void mo99508c() {
        dismiss();
    }

    /* renamed from: a */
    public void mo99507a(int[] iArr) {
        Rect targetRect = this.f69776g.getTargetRect();
        boolean z = false;
        targetRect.left -= iArr[0];
        targetRect.right -= iArr[0];
        targetRect.top -= iArr[1];
        targetRect.bottom -= iArr[1];
        List<AbstractC27922b> a = this.f69774d.mo99499a();
        m101874a(true);
        if ((a.size() < 8 && (this.f69782m * a.size()) - 1 < ((this.f69771a.getHeight() - targetRect.top) - this.f69779j) - this.f69781l) || targetRect.top < (this.f69771a.getHeight() / 2) - this.f69779j) {
            z = true;
        }
        m101874a(z);
        if (z) {
            m101872a(targetRect, a);
        } else {
            m101877b(targetRect, a);
        }
    }

    /* renamed from: d */
    private void m101878d() {
        ((ViewGroup) this.f69775f.getWindow().getDecorView()).removeView(this.f69776g);
    }

    public void dismiss() {
        super.dismiss();
        m101878d();
        AbstractC27912a aVar = this.f69777h;
        if (aVar != null) {
            aVar.onDismiss();
        }
        f69770e = false;
    }

    /* renamed from: b */
    private void m101876b() {
        ViewGroup viewGroup = (ViewGroup) this.f69775f.getWindow().getDecorView();
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        this.f69776g.mo99532a(iArr[0], iArr[1]);
        viewGroup.addView(this.f69776g, -1, -1);
    }

    /* renamed from: a */
    private void m101871a() {
        FrameLayout frameLayout = new FrameLayout(this.f69775f);
        this.f69771a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f69771a.setClipChildren(false);
        this.f69771a.setClipToPadding(false);
        this.f69771a.setBackgroundResource(R.color.transparent);
        this.f69771a.setOnKeyListener(new View.OnKeyListener() {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.$$Lambda$d$HSfTZyu4RpFus0Jw4H7YSnkdvQA */

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return C27909d.lambda$HSfTZyu4RpFus0Jw4H7YSnkdvQA(C27909d.this, view, i, keyEvent);
            }
        });
        this.f69771a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.$$Lambda$d$gr9w9otBYFCIBWkYuMJhlJU8I8 */

            public final void onClick(View view) {
                C27909d.m270209lambda$gr9w9otBYFCIBWkYuMJhlJU8I8(C27909d.this, view);
            }
        });
        this.f69771a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d.ViewTreeObserver$OnGlobalLayoutListenerC279101 */

            public void onGlobalLayout() {
                C27909d.this.f69771a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr = new int[2];
                C27909d.this.f69771a.getLocationOnScreen(iArr);
                C27909d.this.mo99507a(iArr);
            }
        });
        setContentView(this.f69771a);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m101873a(View view) {
        dismiss();
    }

    /* renamed from: a */
    public void mo99505a(AbstractC27912a aVar) {
        this.f69777h = aVar;
    }

    /* renamed from: a */
    public void mo99506a(C27918c cVar) {
        this.f69776g = cVar;
        m101876b();
        showAtLocation(this.f69775f.getWindow().getDecorView(), 8388611, 0, 0);
    }

    public C27909d(Activity activity) {
        super(activity);
        this.f69775f = activity;
        m101871a();
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(activity.getResources().getColor(R.color.transparent)));
        setSoftInputMode(32);
        setWidth(-1);
        setHeight(-1);
    }

    /* renamed from: a */
    private void m101874a(boolean z) {
        if (z) {
            if (!this.f69773c) {
                this.f69779j = C28209p.m103291a(16.0f);
                this.f69780k = C28209p.m103291a(24.0f);
            } else if (this.f69772b) {
                this.f69779j = C28209p.m103291a(47.0f);
                this.f69780k = C28209p.m103291a(30.0f);
            } else {
                this.f69779j = C28209p.m103291a(37.0f);
                this.f69780k = C28209p.m103291a(14.0f);
            }
        } else if (!this.f69773c) {
            this.f69779j = C28209p.m103291a(16.0f);
            this.f69780k = C28209p.m103291a(24.0f);
        } else if (this.f69772b) {
            this.f69779j = C28209p.m103291a(19.0f);
            this.f69780k = C28209p.m103291a(30.0f);
        } else {
            this.f69779j = C28209p.m103291a(8.0f);
            this.f69780k = C28209p.m103291a(14.0f);
        }
    }

    /* renamed from: a */
    private int m101869a(boolean z, List<AbstractC27922b> list) {
        int i;
        Paint paint = new Paint();
        paint.setTextSize((float) C28209p.m103291a(16.0f));
        float f = BitmapDescriptorFactory.HUE_RED;
        for (AbstractC27922b bVar : list) {
            f = Math.max(f, paint.measureText(bVar.mo99548c(this.f69771a.getContext())));
        }
        int a = (int) (((float) C28209p.m103291a(64.0f)) + f);
        int a2 = C28209p.m103291a(4.0f);
        if (z) {
            i = C28209p.m103291a(6.0f);
        } else {
            i = 0;
        }
        return Math.min(C28209p.m103291a(230.0f), Math.max(C28209p.m103291a(140.0f), a + a2 + i));
    }

    /* renamed from: a */
    private RecyclerView m101870a(List<AbstractC27922b> list, boolean z) {
        RecyclerView recyclerView;
        if (z) {
            recyclerView = (RecyclerView) LayoutInflater.from(this.f69775f).inflate(R.layout.workplace_block_menu_with_scrollbar, (ViewGroup) this.f69771a, false);
        } else {
            recyclerView = (RecyclerView) LayoutInflater.from(this.f69775f).inflate(R.layout.workplace_block_menu_without_scrollbar, (ViewGroup) this.f69771a, false);
        }
        C27904a aVar = new C27904a(new C27904a.AbstractC27905a() {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d.C279112 */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27904a.AbstractC27905a
            /* renamed from: a */
            public void mo99498a() {
                C27909d.this.dismiss();
            }
        });
        aVar.resetAll(list);
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f69775f));
        recyclerView.setBackgroundResource(R.drawable.workplace_item_menu_shape);
        recyclerView.setOverScrollMode(2);
        recyclerView.setMinimumHeight(C28209p.m103293a((Context) this.f69775f, 50.0f));
        int a = C28209p.m103293a((Context) this.f69775f, 8.0f);
        recyclerView.setPadding(1, a, 1, a);
        return recyclerView;
    }

    /* renamed from: b */
    private void m101877b(Rect rect, List<AbstractC27922b> list) {
        int i;
        RecyclerView recyclerView;
        int i2 = rect.top;
        int size = list.size();
        boolean z = false;
        if (size < 8) {
            int i3 = this.f69782m;
            if ((i3 * size) - 1 < (this.f69779j + i2) - this.f69781l) {
                i = (i3 * size) + (C28209p.m103291a(8.0f) * 2);
                recyclerView = m101870a(list, false);
                this.f69778i = m101869a(z, list);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = (rect.top + this.f69779j) - i;
                layoutParams.rightMargin = this.f69780k;
                layoutParams.gravity = 5;
                UDShadowLayout uDShadowLayout = new UDShadowLayout(this.f69775f);
                uDShadowLayout.addView(recyclerView, new UDShadowLayout.LayoutParams(this.f69778i, i));
                uDShadowLayout.setShadowRadius(new UDDimension.Dp(8));
                uDShadowLayout.mo91199a(2131887167);
                this.f69771a.addView(uDShadowLayout, layoutParams);
            }
        }
        i = (this.f69782m * Math.min(7, (((((i2 + this.f69779j) - this.f69781l) - C28209p.m103291a(25.0f)) - C28209p.m103291a(8.0f)) - C28209p.m103291a(8.0f)) / this.f69782m)) + C28209p.m103291a(25.0f) + C28209p.m103291a(8.0f) + C28209p.m103291a(8.0f);
        recyclerView = m101870a(list, true);
        z = true;
        this.f69778i = m101869a(z, list);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (rect.top + this.f69779j) - i;
        layoutParams2.rightMargin = this.f69780k;
        layoutParams2.gravity = 5;
        UDShadowLayout uDShadowLayout2 = new UDShadowLayout(this.f69775f);
        uDShadowLayout2.addView(recyclerView, new UDShadowLayout.LayoutParams(this.f69778i, i));
        uDShadowLayout2.setShadowRadius(new UDDimension.Dp(8));
        uDShadowLayout2.mo91199a(2131887167);
        this.f69771a.addView(uDShadowLayout2, layoutParams2);
    }

    /* renamed from: a */
    private void m101872a(Rect rect, List<AbstractC27922b> list) {
        int i;
        RecyclerView recyclerView;
        int height = this.f69771a.getHeight() - rect.top;
        int size = list.size();
        boolean z = false;
        if (size < 8) {
            int i2 = this.f69782m;
            if ((i2 * size) - 1 < (height - this.f69779j) - this.f69781l) {
                i = (i2 * size) + (C28209p.m103291a(8.0f) * 2);
                recyclerView = m101870a(list, false);
                this.f69778i = m101869a(z, list);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = rect.top + this.f69779j;
                int a = this.f69780k - C28209p.m103291a(16.0f);
                this.f69780k = a;
                layoutParams.rightMargin = a;
                layoutParams.gravity = 5;
                UDShadowLayout uDShadowLayout = new UDShadowLayout(this.f69775f);
                uDShadowLayout.addView(recyclerView, new UDShadowLayout.LayoutParams(this.f69778i, i));
                uDShadowLayout.setShadowRadius(new UDDimension.Dp(8));
                uDShadowLayout.mo91199a(2131887167);
                this.f69771a.addView(uDShadowLayout, layoutParams);
            }
        }
        i = (this.f69782m * Math.min(7, (((((height - this.f69779j) - this.f69781l) - C28209p.m103291a(25.0f)) - C28209p.m103291a(8.0f)) - C28209p.m103291a(8.0f)) / this.f69782m)) + C28209p.m103291a(25.0f) + C28209p.m103291a(8.0f) + C28209p.m103291a(8.0f);
        recyclerView = m101870a(list, true);
        z = true;
        this.f69778i = m101869a(z, list);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = rect.top + this.f69779j;
        int a2 = this.f69780k - C28209p.m103291a(16.0f);
        this.f69780k = a2;
        layoutParams2.rightMargin = a2;
        layoutParams2.gravity = 5;
        UDShadowLayout uDShadowLayout2 = new UDShadowLayout(this.f69775f);
        uDShadowLayout2.addView(recyclerView, new UDShadowLayout.LayoutParams(this.f69778i, i));
        uDShadowLayout2.setShadowRadius(new UDDimension.Dp(8));
        uDShadowLayout2.mo91199a(2131887167);
        this.f69771a.addView(uDShadowLayout2, layoutParams2);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m101875a(View view, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        dismiss();
        return true;
    }
}
