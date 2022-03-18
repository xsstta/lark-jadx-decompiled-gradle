package com.ss.android.vc.common.p3083e;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import java.util.LinkedList;

/* renamed from: com.ss.android.vc.common.e.ad */
public class C60740ad {

    /* renamed from: a */
    private static Handler f151936a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static boolean m236052b(ViewStub viewStub) {
        if (viewStub == null || m236051a(viewStub)) {
            return false;
        }
        viewStub.inflate();
        return true;
    }

    /* renamed from: a */
    public static void m236044a(View view) {
        ViewParent parent;
        if (view != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    /* renamed from: a */
    public static void m236046a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            LinkedList<View> linkedList = new LinkedList();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i).getVisibility() != 0) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
            for (View view : linkedList) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: a */
    public static boolean m236051a(ViewStub viewStub) {
        if (viewStub != null && viewStub.getParent() == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m236050a(ViewGroup viewGroup, Runnable runnable) {
        m236046a(viewGroup);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static void m236047a(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                viewGroup.getChildAt(i2).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public static void m236048a(ViewGroup viewGroup, int i, long j) {
        m236049a(viewGroup, i, j, null);
    }

    /* renamed from: a */
    public static void m236045a(View view, ViewGroup viewGroup, ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (view != null && viewGroup != null && view.getParent() != viewGroup) {
            m236044a(view);
            if (marginLayoutParams != null) {
                viewGroup.addView(view, marginLayoutParams);
            } else {
                viewGroup.addView(view);
            }
        }
    }

    /* renamed from: a */
    public static void m236049a(ViewGroup viewGroup, int i, long j, Runnable runnable) {
        C60735ab.m236014c();
        if (viewGroup != null) {
            if (i == 4 || i == 8) {
                m236047a(viewGroup, i);
                f151936a.postDelayed(new Runnable(viewGroup, runnable) {
                    /* class com.ss.android.vc.common.p3083e.$$Lambda$ad$nWG2cH3jhuy3XApBkV6zFzzvrxQ */
                    public final /* synthetic */ ViewGroup f$0;
                    public final /* synthetic */ Runnable f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C60740ad.lambda$nWG2cH3jhuy3XApBkV6zFzzvrxQ(this.f$0, this.f$1);
                    }
                }, j);
            }
        }
    }
}
