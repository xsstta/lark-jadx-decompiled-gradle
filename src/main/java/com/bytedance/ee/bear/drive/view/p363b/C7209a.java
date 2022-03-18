package com.bytedance.ee.bear.drive.view.p363b;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.browser.plugin.C4940b;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.document.aj;
import com.bytedance.ee.bear.document.p302c.C5686d;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.view.b.a */
public class C7209a implements TitleBar {

    /* renamed from: a */
    public ValueAnimator f19332a;

    /* renamed from: b */
    public BaseTitleBar f19333b;

    /* renamed from: c */
    public boolean f19334c = true;

    /* renamed from: d */
    public C4940b f19335d = new C4940b();

    /* renamed from: e */
    private AbstractC7215a f19336e;

    /* renamed from: f */
    private int f19337f;

    /* renamed from: g */
    private boolean f19338g;

    /* renamed from: h */
    private float f19339h = -1.0f;

    /* renamed from: i */
    private List<TitleBar.AbstractC4938a> f19340i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private TextView f19341j;

    /* renamed from: k */
    private TextView f19342k;

    /* renamed from: l */
    private List<MenuItem> f19343l;

    /* renamed from: m */
    private C4940b f19344m = new C4940b();

    /* renamed from: n */
    private boolean f19345n;

    /* renamed from: com.bytedance.ee.bear.drive.view.b.a$a */
    public interface AbstractC7215a {
        /* renamed from: a */
        BaseTitleBar mo27290a();

        /* renamed from: b */
        FragmentActivity mo27291b();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: f */
    public void mo19526f(boolean z) {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public BaseTitleBar mo19508a() {
        return this.f19333b;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19512a(CharSequence charSequence) {
        if (charSequence != null) {
            this.f19341j.setText(charSequence);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19515a(boolean z) {
        if (this.f19333b.getCustomTitleView() != null) {
            this.f19333b.getCustomTitleView().setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19514a(List<MenuItem> list, TitleBar.MenuType menuType) {
        if (menuType == TitleBar.MenuType.Left) {
            this.f19333b.mo45084b();
        } else {
            this.f19333b.mo45073a();
        }
        if (list != null) {
            for (MenuItem menuItem : list) {
                if (!m28888a(menuItem)) {
                    m28886a(menuItem, menuType);
                }
            }
        }
        this.f19333b.mo45087c();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19513a(List<MenuItem> list) {
        this.f19343l = list;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: d */
    public void mo19523d() {
        this.f19333b.invalidate();
    }

    /* renamed from: h */
    private void m28889h() {
        ValueAnimator valueAnimator = this.f19332a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f19332a = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ boolean m28895l() {
        if (this.f19340i.isEmpty()) {
            return true;
        }
        m28891j();
        m28893k();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28230e() {
        this.f19333b = this.f19336e.mo27290a();
        m28890i();
    }

    /* renamed from: f */
    public int mo28231f() {
        return this.f19333b.getResources().getDimensionPixelSize(R.dimen.doc_titlebar_height);
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.b.a$5 */
    static /* synthetic */ class C72145 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19352a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.browser.plugin.TitleBar$TitleGravity[] r0 = com.bytedance.ee.bear.browser.plugin.TitleBar.TitleGravity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.view.p363b.C7209a.C72145.f19352a = r0
                com.bytedance.ee.bear.browser.plugin.TitleBar$TitleGravity r1 = com.bytedance.ee.bear.browser.plugin.TitleBar.TitleGravity.Left     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.view.p363b.C7209a.C72145.f19352a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.browser.plugin.TitleBar$TitleGravity r1 = com.bytedance.ee.bear.browser.plugin.TitleBar.TitleGravity.Center     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.p363b.C7209a.C72145.<clinit>():void");
        }
    }

    /* renamed from: k */
    private void m28893k() {
        if (!this.f19335d.equals(this.f19344m)) {
            C4940b bVar = this.f19335d;
            bVar.f14503c = Math.max(Math.min(bVar.f14503c, 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
            for (TitleBar.AbstractC4938a aVar : this.f19340i) {
                aVar.onTitleBarStateChanged(this.f19335d);
            }
            this.f19344m = new C4940b(this.f19335d);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: c */
    public C4940b mo19521c() {
        if (this.f19335d.f14501a == 0) {
            this.f19335d.f14501a = C13749l.m55749b(C13746i.m55722a(this.f19333b.getContext()));
            this.f19335d.f14503c = 1.0f;
        }
        return this.f19335d;
    }

    /* renamed from: g */
    public void mo28232g() {
        Fragment findFragmentById = this.f19336e.mo27291b().getSupportFragmentManager().findFragmentById(R.id.documentFragment);
        if (findFragmentById instanceof aj) {
            ((aj) findFragmentById).mo22585j();
        } else {
            C13479a.m54775e("DriveSdkSimpleTitleBar", "scrollToTop FAIL");
        }
    }

    /* renamed from: j */
    private void m28891j() {
        int i;
        if (this.f19333b.getHeight() == 0) {
            this.f19335d.f14503c = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        int[] iArr = new int[2];
        this.f19333b.getLocationOnScreen(iArr);
        int a = iArr[1] + C13749l.m55738a(this.f19335d.f14502b);
        int a2 = C13746i.m55722a(this.f19333b.getContext());
        if (!this.f19338g) {
            a -= a2;
        }
        this.f19335d.f14501a = C13749l.m55749b(a2);
        if (this.f19338g) {
            i = this.f19335d.f14502b + this.f19335d.f14501a;
        } else {
            i = this.f19335d.f14502b;
        }
        float f = (float) i;
        if (this.f19334c) {
            this.f19335d.f14503c = ((float) C13749l.m55749b(a)) / f;
            return;
        }
        this.f19335d.f14503c = ((float) C13749l.m55749b(a - mo28231f())) / f;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public boolean mo19520b() {
        return this.f19333b.getLeftIconVisibility();
    }

    /* renamed from: i */
    private void m28890i() {
        this.f19337f = Math.round(this.f19333b.getResources().getDimension(R.dimen.doc_titlebar_height));
        this.f19333b.getLayoutParams().height = this.f19337f;
        this.f19333b.requestLayout();
        this.f19333b.setVisibility(0);
        this.f19333b.setDividerVisible(false);
        this.f19333b.mo45074a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6.0f, BitmapDescriptorFactory.HUE_RED);
        this.f19333b.mo45073a();
        this.f19333b.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.p363b.$$Lambda$a$1h3OkyU5nUWPL7GB1sQ0UPtEPFA */

            public final void onClick(View view) {
                C7209a.this.m28885a((C7209a) view);
            }
        });
        this.f19333b.setOnTouchListener(new View.OnTouchListener(new GestureDetector(this.f19333b.getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.drive.view.p363b.C7209a.C72123 */

            public boolean onDoubleTap(MotionEvent motionEvent) {
                C7209a.this.mo28232g();
                return super.onDoubleTap(motionEvent);
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (C13616d.m55262a(C7209a.this.f19333b.getContext())) {
                    ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40260c();
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        }, new Handler(Looper.getMainLooper()))) {
            /* class com.bytedance.ee.bear.drive.view.p363b.$$Lambda$a$tvtxiHfx4COuQRMqStqkJzk7kcw */
            public final /* synthetic */ GestureDetector f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.onTouchEvent(motionEvent);
            }
        });
        this.f19333b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.bytedance.ee.bear.drive.view.p363b.C7209a.View$OnLayoutChangeListenerC72134 */

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9;
                if (!C7209a.this.f19334c) {
                    return;
                }
                if ((C7209a.this.f19332a == null || !C7209a.this.f19332a.isRunning()) && i8 - i6 != (i9 = i4 - i2) && i9 >= C7209a.this.mo28231f()) {
                    C7209a.this.f19335d.f14502b = C13749l.m55749b(i9);
                }
            }
        });
        this.f19333b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.bytedance.ee.bear.drive.view.p363b.$$Lambda$a$E3uv8uaFMCnCdQsvzv2Ing7dFag */

            public final boolean onPreDraw() {
                return C7209a.this.m28895l();
            }
        });
        this.f19333b.mo45087c();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: g */
    public void mo19527g(boolean z) {
        this.f19345n = z;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public void mo19516b(int i) {
        this.f19333b.setActionIconTint(i);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: h */
    public void mo19528h(boolean z) {
        this.f19333b.setRightVisible(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28885a(View view) {
        this.f19336e.mo27291b().finish();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public void mo19517b(TitleBar.AbstractC4938a aVar) {
        this.f19340i.remove(aVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: i */
    public void mo19529i(boolean z) {
        float f;
        BaseTitleBar baseTitleBar = this.f19333b;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        baseTitleBar.setAlpha(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28883a(ValueAnimator valueAnimator) {
        this.f19333b.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f19333b.requestLayout();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public void mo19519b(boolean z) {
        this.f19333b.setDividerVisible(z);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: e */
    public void mo19525e(boolean z) {
        this.f19333b.setLeftIconVisibility(z);
        this.f19333b.mo45087c();
    }

    public C7209a(AbstractC7215a aVar) {
        this.f19336e = aVar;
        mo28230e();
        m28884a(aVar.mo27291b());
    }

    /* renamed from: a */
    private boolean m28888a(MenuItem menuItem) {
        List<MenuItem> list = this.f19343l;
        if (list != null && !list.isEmpty()) {
            for (MenuItem menuItem2 : this.f19343l) {
                if (TextUtils.equals(menuItem2.getId(), menuItem.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m28892j(boolean z) {
        int i;
        m28889h();
        if (z) {
            i = this.f19337f;
        } else {
            i = 0;
        }
        ValueAnimator ofInt = ObjectAnimator.ofInt(this.f19333b.getHeight(), i);
        this.f19332a = ofInt;
        ofInt.setDuration(200L);
        this.f19332a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.drive.view.p363b.$$Lambda$a$YZBnOzdxQjLUd8E0NosiiDSv73o */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7209a.this.m28883a((C7209a) valueAnimator);
            }
        });
        this.f19332a.start();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public void mo19518b(CharSequence charSequence) {
        String str;
        if (this.f19342k == null) {
            BaseTitleBar baseTitleBar = this.f19333b;
            if (charSequence == null) {
                str = "";
            } else {
                str = charSequence.toString();
            }
            baseTitleBar.setSubTitle(str);
        } else if (!TextUtils.isEmpty(charSequence)) {
            this.f19342k.setText(charSequence);
            this.f19342k.setVisibility(0);
        } else {
            this.f19342k.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: d */
    public void mo19524d(boolean z) {
        if (!this.f19345n) {
            C13479a.m54772d("DriveSdkSimpleTitleBar", "hide animation:" + z);
            this.f19334c = false;
            if (z) {
                m28892j(false);
            } else {
                m28894k(false);
            }
            m28891j();
            m28893k();
        }
    }

    /* renamed from: a */
    private void m28884a(Context context) {
        this.f19333b.setIsCenterAlways(false);
        View inflate = View.inflate(context, R.layout.drive_main_title_bar, null);
        this.f19333b.setCustomTitleView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.f19341j = textView;
        textView.setTypeface(Typeface.defaultFromStyle(1));
        this.f19342k = (TextView) inflate.findViewById(R.id.subTitle);
        ViewParent parent = this.f19333b.getCustomTitleView().getParent();
        if (parent instanceof RelativeLayout) {
            ((RelativeLayout) parent).setGravity(8388627);
        }
        mo19512a((CharSequence) context.getResources().getString(R.string.Drive_Drive_Default_Title));
    }

    /* renamed from: k */
    private void m28894k(boolean z) {
        int i;
        m28889h();
        if (z) {
            i = this.f19337f;
        } else {
            i = 0;
        }
        this.f19333b.getLayoutParams().height = i;
        this.f19333b.requestLayout();
        C5686d.m23058a(this.f19336e.mo27291b(), (View) null, z);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: c */
    public void mo19522c(boolean z) {
        C13479a.m54772d("DriveSdkSimpleTitleBar", "show animation:" + z);
        this.f19334c = true;
        if (z) {
            m28892j(true);
        } else {
            m28894k(true);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public View mo19507a(String str) {
        return this.f19333b.mo45071a(str);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19509a(int i) {
        this.f19341j.setTextColor(this.f19336e.mo27291b().getResources().getColor(i));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19510a(TitleBar.TitleGravity titleGravity) {
        int i = C72145.f19352a[titleGravity.ordinal()];
        if (i == 1) {
            this.f19341j.setGravity(3);
            this.f19342k.setGravity(3);
            this.f19333b.setIsCenterAlways(false);
        } else if (i == 2) {
            this.f19342k.setGravity(17);
            this.f19341j.setGravity(17);
            this.f19333b.setIsCenterAlways(true);
        }
        this.f19333b.mo45087c();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19511a(TitleBar.AbstractC4938a aVar) {
        if (!this.f19340i.contains(aVar)) {
            this.f19340i.add(aVar);
        }
    }

    /* renamed from: a */
    private void m28886a(final MenuItem menuItem, TitleBar.MenuType menuType) {
        BaseTitleBar.C11801b bVar;
        if (menuItem.getIcon() != null) {
            bVar = new BaseTitleBar.C11803d(menuItem.getIcon()) {
                /* class com.bytedance.ee.bear.drive.view.p363b.C7209a.C72101 */

                @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
                /* renamed from: a */
                public void mo16854a(View view) {
                    super.mo16854a(view);
                    menuItem.onClick(view);
                }
            };
        } else if (!TextUtils.isEmpty(menuItem.getText())) {
            bVar = new BaseTitleBar.C11804e(menuItem.getText()) {
                /* class com.bytedance.ee.bear.drive.view.p363b.C7209a.C72112 */

                @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
                /* renamed from: a */
                public void mo16854a(View view) {
                    super.mo16854a(view);
                    menuItem.onClick(view);
                }
            };
        } else {
            bVar = null;
        }
        if (bVar == null) {
            C13479a.m54758a("DriveSdkSimpleTitleBar", "Bad menu:" + menuItem);
            return;
        }
        bVar.mo45147a(menuItem.getId());
        bVar.mo45148a(menuItem.isEnable());
        bVar.mo45146a(menuItem.getBadgeStyle());
        bVar.mo45145a(menuItem.getBadgeNum());
        if (menuType == TitleBar.MenuType.Left) {
            this.f19333b.mo45083b(bVar);
        } else {
            this.f19333b.mo45070a(bVar);
        }
    }
}
