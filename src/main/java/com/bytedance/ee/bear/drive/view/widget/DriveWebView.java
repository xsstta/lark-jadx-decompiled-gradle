package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ee.bear.drive.module.dependency.StringResDef;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class DriveWebView extends DriveNestedScrollWebView {

    /* renamed from: b */
    public boolean f20510b;

    /* renamed from: c */
    private C7570c f20511c;

    /* renamed from: d */
    private C7568a f20512d;

    /* renamed from: e */
    private View.OnClickListener f20513e;

    /* renamed from: f */
    private Runnable f20514f;

    /* renamed from: g */
    private long f20515g;

    /* renamed from: h */
    private PointF f20516h;

    /* renamed from: i */
    private PointF f20517i;

    /* renamed from: j */
    private Runnable f20518j;

    /* renamed from: k */
    private Handler f20519k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    private boolean f20520l;

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ void stopNestedScroll() {
        super.stopNestedScroll();
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ int getNestedScrollAxes() {
        return super.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ boolean hasNestedScrollingParent() {
        return super.hasNestedScrollingParent();
    }

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ boolean isNestedScrollingEnabled() {
        return super.isNestedScrollingEnabled();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20519k.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.widget.DriveWebView$2 */
    public static /* synthetic */ class C75622 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20522a;

        static {
            int[] iArr = new int[StringResDef.values().length];
            f20522a = iArr;
            try {
                iArr[StringResDef.Doc_Comment_CopyFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30325b() {
        if (!this.f20510b) {
            View.OnClickListener onClickListener = this.f20513e;
            if (onClickListener != null) {
                onClickListener.onClick(this);
            }
            Runnable runnable = this.f20514f;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public void mo29640a() {
        this.f20511c = new C7570c();
        this.f20512d = new C7568a();
        setWebViewClient(this.f20511c);
        setWebChromeClient(this.f20512d);
        mo29642a(new C7571d() {
            /* class com.bytedance.ee.bear.drive.view.widget.DriveWebView.C75611 */

            @Override // com.bytedance.ee.bear.drive.view.widget.C7571d
            /* renamed from: b */
            public boolean mo29430b(WebView webView, String str) {
                DriveWebView.this.f20510b = true;
                return super.mo29430b(webView, str);
            }
        });
        this.f20518j = new Runnable() {
            /* class com.bytedance.ee.bear.drive.view.widget.$$Lambda$DriveWebView$o8taiEnDwgiUPH5M_P7O6V5eLQ */

            public final void run() {
                DriveWebView.this.m30325b();
            }
        };
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo29633a(int i) {
        super.mo29633a(i);
    }

    public void setCopyPermission(boolean z) {
        this.f20520l = z;
    }

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ void setNestedScrollingEnabled(boolean z) {
        super.setNestedScrollingEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f20513e = onClickListener;
    }

    public void setOnFullScreenSwitchListener(Runnable runnable) {
        this.f20514f = runnable;
    }

    /* renamed from: a */
    public void mo29641a(C7569b bVar) {
        C7568a aVar = this.f20512d;
        if (aVar != null) {
            aVar.mo29701a(bVar);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ boolean startNestedScroll(int i) {
        return super.startNestedScroll(i);
    }

    /* renamed from: a */
    public void mo29642a(C7571d dVar) {
        C7570c cVar = this.f20511c;
        if (cVar != null) {
            cVar.mo29707a(dVar);
        }
    }

    public DriveWebView(Context context) {
        super(context);
        mo29640a();
    }

    /* renamed from: a */
    private ActionMode m30322a(ActionMode actionMode) {
        if (!this.f20520l && actionMode != null) {
            try {
                Menu menu = actionMode.getMenu();
                menu.clear();
                menu.add(getResources().getString(R.string.Drive_Drive_Action_Copy));
                menu.getItem(0).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(actionMode) {
                    /* class com.bytedance.ee.bear.drive.view.widget.$$Lambda$DriveWebView$AY_ETYyvMIXb6dMLmeJYj3TdoE */
                    public final /* synthetic */ ActionMode f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return DriveWebView.this.m30324a(this.f$1, menuItem);
                    }
                });
            } catch (Exception e) {
                C13479a.m54761a("DriveWebView", e);
            }
        }
        return actionMode;
    }

    /* renamed from: a */
    private void m30323a(long j) {
        this.f20510b = false;
        this.f20519k.removeCallbacks(this.f20518j);
        PointF pointF = this.f20516h;
        if (pointF != null && this.f20517i != null) {
            float abs = Math.abs(pointF.x - this.f20517i.x);
            float abs2 = Math.abs(this.f20516h.y - this.f20517i.y);
            if (j <= 150 && Math.max(abs, abs2) <= 10.0f) {
                this.f20519k.postDelayed(this.f20518j, 150);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
            this.f20515g = System.currentTimeMillis();
            this.f20516h = new PointF(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            this.f20517i = new PointF(motionEvent.getX(), motionEvent.getY());
            m30323a(System.currentTimeMillis() - this.f20515g);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ boolean dispatchNestedPreFling(float f, float f2) {
        return super.dispatchNestedPreFling(f, f2);
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return m30322a(super.startActionMode(callback, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m30324a(ActionMode actionMode, MenuItem menuItem) {
        Toast.showFailureText(getContext(), mo29639a(getContext(), StringResDef.Doc_Comment_CopyFailed), 0);
        actionMode.finish();
        return true;
    }

    public DriveWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo29640a();
    }

    /* renamed from: a */
    public String mo29639a(Context context, StringResDef stringResDef) {
        if (C75622.f20522a[stringResDef.ordinal()] != 1) {
            return "";
        }
        return context.getString(R.string.Doc_Comment_CopyFailed);
    }

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, z);
    }

    public DriveWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo29640a();
    }

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        if (z) {
            requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // androidx.core.view.NestedScrollingChild, com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView
    public /* bridge */ /* synthetic */ boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }
}
