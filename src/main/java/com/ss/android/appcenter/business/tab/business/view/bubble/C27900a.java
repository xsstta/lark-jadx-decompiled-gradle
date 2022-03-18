package com.ss.android.appcenter.business.tab.business.view.bubble;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.operationconfig.OperationalConfigData;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28190k;
import com.ss.android.appcenter.common.util.C28209p;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.bubble.a */
public class C27900a {

    /* renamed from: a */
    public boolean f69741a;

    /* renamed from: b */
    private Context f69742b;

    /* renamed from: c */
    private Paint f69743c;

    /* renamed from: d */
    private WeakReference<Fragment> f69744d;

    /* renamed from: e */
    private int f69745e;

    /* renamed from: f */
    private int f69746f;

    /* renamed from: g */
    private int f69747g;

    /* renamed from: h */
    private int f69748h;

    /* renamed from: i */
    private BubbleView f69749i;

    /* renamed from: j */
    private HandlerC27901a f69750j;

    /* renamed from: k */
    private boolean f69751k;

    /* renamed from: l */
    private boolean f69752l;

    /* renamed from: a */
    public boolean mo99475a() {
        return this.f69751k || this.f69752l;
    }

    /* renamed from: d */
    private void m101835d() {
        this.f69750j.removeMessages(1);
        this.f69750j.sendEmptyMessageDelayed(1, 5000);
    }

    /* renamed from: b */
    private void m101831b() {
        ViewGroup c = m101833c();
        if (c == null) {
            C28184h.m103248b("WorkplaceTipBubble", "remove bubble To the root error. root is null.");
            return;
        }
        c.removeView(c.findViewById(R.id.workplace_bubble_view));
        this.f69751k = false;
        C28184h.m103250d("WorkplaceTipBubble", "remove bubble To the root.");
    }

    /* renamed from: c */
    private ViewGroup m101833c() {
        WeakReference<Fragment> weakReference = this.f69744d;
        if (weakReference == null || weakReference.get() == null || !this.f69744d.get().isAdded()) {
            C28184h.m103248b("WorkplaceTipBubble", "getRootView error. fragment error.");
            return null;
        }
        FragmentActivity activity = this.f69744d.get().getActivity();
        if (activity == null) {
            C28184h.m103248b("WorkplaceTipBubble", "getRootView. activity error.");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        C28184h.m103248b("WorkplaceTipBubble", "getRootView. findview is null.");
        return null;
    }

    /* renamed from: b */
    public void mo99476b(boolean z) {
        this.f69752l = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.tab.business.view.bubble.a$a */
    public class HandlerC27901a extends Handler {
        HandlerC27901a() {
        }

        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            if (message.what == 1) {
                C27900a.this.f69741a = true;
            }
        }
    }

    /* renamed from: b */
    private int m101829b(String str) {
        return (int) this.f69743c.measureText(str);
    }

    /* renamed from: a */
    private boolean m101827a(int[] iArr) {
        if (iArr[0] == 0 || iArr[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private int m101823a(String str) {
        int a = C28209p.m103293a(this.f69742b, 280.0f);
        int b = m101829b(str) + C28209p.m103293a(this.f69742b, 40.0f);
        return a < b ? a : b;
    }

    /* renamed from: c */
    private Rect m101832c(int[] iArr) {
        int i = iArr[0];
        int i2 = this.f69745e;
        this.f69746f = i - (i2 / 2);
        this.f69747g = iArr[1];
        this.f69748h = i2 / 2;
        int i3 = this.f69746f;
        return new Rect(i3, this.f69747g, this.f69745e + i3, 0);
    }

    /* renamed from: a */
    private String m101824a(OperationalConfigData operationalConfigData) {
        if (!operationalConfigData.haveRecommendAppsToInstall()) {
            return operationalConfigData.getOperationActivity().getName();
        }
        if (operationalConfigData.isAdmin()) {
            return this.f69742b.getString(R.string.OpenPlatform_AppCenter_OnboardingAdminTtle);
        }
        return this.f69742b.getString(R.string.OpenPlatform_AppCenter_OnboardingUserTtl);
    }

    /* renamed from: d */
    private Rect m101834d(int[] iArr) {
        int b = (C28190k.m103260b(this.f69742b) - this.f69745e) - C28209p.m103293a(this.f69742b, 8.0f);
        this.f69746f = b;
        this.f69747g = iArr[1];
        this.f69748h = iArr[0] - b;
        int i = this.f69746f;
        return new Rect(i, this.f69747g, this.f69745e + i, 0);
    }

    /* renamed from: b */
    private Rect m101830b(int[] iArr) {
        boolean z = false;
        int i = iArr[0] + (this.f69745e / 2);
        int b = C28190k.m103260b(this.f69742b) - C28209p.m103293a(this.f69742b, 8.0f);
        StringBuilder sb = new StringBuilder();
        sb.append("calculateBubbleTopLeftCorner. bubbleRight:");
        sb.append(i);
        sb.append(" rightBoundary:");
        sb.append(b);
        sb.append(" symmetry:");
        if (i < b) {
            z = true;
        }
        sb.append(z);
        C28184h.m103250d("WorkplaceTipBubble", sb.toString());
        if (i < b) {
            return m101832c(iArr);
        }
        return m101834d(iArr);
    }

    /* renamed from: a */
    private int[] m101828a(View view) {
        int[] iArr = new int[2];
        ViewGroup c = m101833c();
        if (c == null) {
            return iArr;
        }
        int[] iArr2 = new int[2];
        c.getLocationOnScreen(iArr2);
        int[] iArr3 = new int[2];
        view.getLocationOnScreen(iArr3);
        int width = view.getWidth();
        int height = view.getHeight();
        iArr[0] = (iArr3[0] - iArr2[0]) + (width / 2);
        iArr[1] = (iArr3[1] - iArr2[1]) + height + C28209p.m103293a(this.f69742b, 8.0f);
        C28184h.m103250d("WorkplaceTipBubble", "getArrorPointCoordinate. root:" + Arrays.toString(iArr2) + " anchor:" + Arrays.toString(iArr3) + " anchor(W, H):" + width + "," + height + " arrowPoint:" + Arrays.toString(iArr));
        return iArr;
    }

    /* renamed from: a */
    public void mo99474a(boolean z) {
        if (z) {
            m101831b();
        } else if (this.f69741a) {
            m101831b();
        }
    }

    public C27900a(Context context, Fragment fragment) {
        this.f69742b = context;
        m101825a(context, fragment);
    }

    /* renamed from: a */
    private void m101825a(Context context, Fragment fragment) {
        Paint paint = new Paint();
        this.f69743c = paint;
        paint.setTextSize((float) C28209p.m103293a(context, 16.0f));
        this.f69744d = new WeakReference<>(fragment);
        BubbleView bubbleView = new BubbleView(this.f69742b);
        this.f69749i = bubbleView;
        bubbleView.setId(R.id.workplace_bubble_view);
        this.f69750j = new HandlerC27901a();
    }

    /* renamed from: a */
    private void m101826a(View view, ViewGroup.LayoutParams layoutParams) {
        ViewGroup c = m101833c();
        if (c == null) {
            C28184h.m103248b("WorkplaceTipBubble", "add bubble To the root error. root is null.");
            return;
        }
        View findViewById = c.findViewById(R.id.workplace_bubble_view);
        if (findViewById != null) {
            c.removeView(findViewById);
        }
        c.addView(view, layoutParams);
        this.f69751k = true;
        C28184h.m103250d("WorkplaceTipBubble", "add bubble To the root.");
    }

    /* renamed from: a */
    public void mo99473a(View view, OperationalConfigData operationalConfigData) {
        String a = m101824a(operationalConfigData);
        this.f69745e = m101823a(a);
        C28184h.m103250d("WorkplaceTipBubble", "showInAnchor. text is " + a + " mBubbleWidth: " + this.f69745e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f69745e, -2);
        int[] a2 = m101828a(view);
        if (!m101827a(a2)) {
            C28184h.m103248b("WorkplaceTipBubble", "arrow point coordinate is error. end bubble.");
            return;
        }
        Rect b = m101830b(a2);
        layoutParams.leftMargin = b.left;
        layoutParams.topMargin = b.top;
        C28184h.m103250d("WorkplaceTipBubble", "left top corner:" + b.left + " " + b.top);
        this.f69749i.setBubbleText(a);
        this.f69749i.setArrowHorizontalOffet(this.f69748h);
        this.f69749i.setShadowAndAdjustBubbleViewParams(layoutParams);
        m101826a(this.f69749i, layoutParams);
        this.f69741a = false;
        m101835d();
    }
}
