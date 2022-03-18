package com.bytedance.ee.bear.document.selection;

import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.selection.d */
public class View$OnTouchListenerC6127d implements View.OnTouchListener, AbstractC10549e {

    /* renamed from: a */
    private Class f17026a;

    /* renamed from: b */
    private Method f17027b;

    /* renamed from: c */
    private Method f17028c;

    /* renamed from: d */
    private Object f17029d;

    /* renamed from: e */
    private int f17030e;

    /* renamed from: f */
    private DocBridgeWebViewV2 f17031f;

    /* renamed from: g */
    private GestureDetector f17032g;

    /* renamed from: h */
    private int[] f17033h = new int[2];

    /* renamed from: i */
    private List<View> f17034i = new ArrayList(3);

    /* renamed from: j */
    private Runnable f17035j = new Runnable() {
        /* class com.bytedance.ee.bear.document.selection.$$Lambda$d$FiKcqjgLOt7Su7H6T8wxSoXPr8 */

        public final void run() {
            View$OnTouchListenerC6127d.this.m24701g();
        }
    };

    /* renamed from: k */
    private Runnable f17036k = new Runnable() {
        /* class com.bytedance.ee.bear.document.selection.$$Lambda$d$hvO4oQzgOItyilqIdbrPXgqsFY */

        public final void run() {
            View$OnTouchListenerC6127d.this.m24700f();
        }
    };

    /* renamed from: l */
    private DocBridgeWebViewV2.AbstractC5605c f17037l = new DocBridgeWebViewV2.AbstractC5605c() {
        /* class com.bytedance.ee.bear.document.selection.$$Lambda$d$PL7ygNetG8e7ry27yikybBRSXY4 */

        @Override // com.bytedance.ee.bear.document.DocBridgeWebViewV2.AbstractC5605c
        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            View$OnTouchListenerC6127d.this.m24694a(view, i, i2, i3, i4);
        }
    };

    /* renamed from: c */
    public void mo24710c() {
        m24693a(100);
    }

    /* renamed from: b */
    public void mo24709b() {
        C13742g.m55710c(this.f17036k);
        C13742g.m55706a(this.f17036k, 100);
    }

    /* renamed from: a */
    public void mo24707a() {
        C13742g.m55710c(this.f17035j);
        C13742g.m55710c(this.f17036k);
        this.f17031f.mo22339b(this.f17037l);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m24700f() {
        for (View view : this.f17034i) {
            if (view.isAttachedToWindow() && view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m24701g() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        m24699e();
        C13479a.m54772d("SelectionHackHelper", "update time cause: " + (((float) (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos)) / 1000000.0f));
    }

    /* renamed from: d */
    private void m24698d() throws Throwable {
        if (this.f17026a == null) {
            this.f17026a = Class.forName("android.view.WindowManagerGlobal");
        }
        if (this.f17027b == null) {
            this.f17027b = this.f17026a.getMethod("getViewRootNames", new Class[0]);
        }
        if (this.f17028c == null) {
            this.f17028c = this.f17026a.getMethod("getRootView", String.class);
        }
        if (this.f17029d == null) {
            this.f17029d = this.f17026a.getMethod("getInstance", new Class[0]).invoke(null, null);
        }
    }

    /* renamed from: e */
    private void m24699e() {
        int i;
        try {
            m24698d();
            String[] strArr = (String[]) this.f17027b.invoke(this.f17029d, null);
            if (strArr == null) {
                C13479a.m54764b("SelectionHackHelper", "tryUpdateSelectionHandleViewBelowIMEIfNeeded can not get rootViewNames");
                return;
            }
            this.f17034i.clear();
            for (String str : strArr) {
                if (m24697a(str)) {
                    View view = (View) this.f17028c.invoke(this.f17029d, str);
                    if (m24696a(view, str) && view.isAttachedToWindow()) {
                        this.f17034i.add(view);
                        if (m24695a(view)) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                        if (i != view.getVisibility()) {
                            view.setVisibility(i);
                        }
                        final View childAt = ((ViewGroup) view).getChildAt(0);
                        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                            /* class com.bytedance.ee.bear.document.selection.View$OnTouchListenerC6127d.ViewTreeObserver$OnGlobalLayoutListenerC61292 */

                            public void onGlobalLayout() {
                                C13479a.m54772d("SelectionHackHelper", "HandleView onGlobalLayout");
                                childAt.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                View$OnTouchListenerC6127d.this.mo24710c();
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            C13479a.m54761a("SelectionHackHelper", th);
        }
    }

    /* renamed from: a */
    private boolean m24697a(String str) {
        return str.startsWith("PopupWindow");
    }

    /* renamed from: a */
    private void m24693a(int i) {
        C13742g.m55710c(this.f17035j);
        C13742g.m55706a(this.f17035j, (long) i);
    }

    /* renamed from: a */
    private boolean m24695a(View view) {
        view.getLocationOnScreen(this.f17033h);
        int b = (C13749l.m55748b() - this.f17030e) - C13749l.m55738a(20);
        C13479a.m54772d("SelectionHackHelper", "visibleKeyboardHeight " + this.f17030e + " location[1] " + this.f17033h[1] + " keyboardStart " + b);
        if (this.f17030e <= 0 || this.f17033h[1] <= b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo24708a(DocBridgeWebViewV2 docBridgeWebViewV2) {
        this.f17031f = docBridgeWebViewV2;
        docBridgeWebViewV2.mo22327a(this.f17037l);
        this.f17032g = new GestureDetector(docBridgeWebViewV2.getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.document.selection.View$OnTouchListenerC6127d.C61281 */

            public void onLongPress(MotionEvent motionEvent) {
                C13479a.m54772d("SelectionHackHelper", "onLongPress");
                View$OnTouchListenerC6127d.this.mo24710c();
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                C13479a.m54772d("SelectionHackHelper", "onSingleTapUp");
                View$OnTouchListenerC6127d.this.mo24709b();
                return false;
            }
        });
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f17032g.onTouchEvent(motionEvent);
        return false;
    }

    /* renamed from: a */
    private boolean m24696a(View view, String str) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return "PopupTouchHandleDrawable".equals(viewGroup.getChildAt(0).getClass().getSimpleName());
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        this.f17030e = i;
        mo24710c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24694a(View view, int i, int i2, int i3, int i4) {
        mo24710c();
    }
}
