package com.ss.android.lark.widget.photo_picker.animation.p2944a.p2945a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.a.a.a */
public class C58577a {
    /* renamed from: a */
    public static void m227212a(C58581d dVar, TimeInterpolator timeInterpolator, Animator.AnimatorListener animatorListener) {
        View view = dVar.f144645d.get(0);
        view.setAlpha(dVar.f144643b);
        view.animate().setDuration((long) dVar.f144642a).alpha(dVar.f144644c).setListener(animatorListener).setInterpolator(timeInterpolator);
    }

    /* renamed from: a */
    public static void m227213a(C58581d dVar, TimeInterpolator timeInterpolator, Runnable runnable, Animator.AnimatorListener animatorListener) {
        View view = dVar.f144645d.get(0);
        int i = dVar.f144642a;
        float f = dVar.f144643b;
        view.setAlpha(dVar.f144644c);
        long j = (long) i;
        view.animate().setDuration(j).setInterpolator(timeInterpolator).setListener(animatorListener).alpha(f);
        view.postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static C58581d m227211a(Context context, List<View> list, Bundle bundle, Bundle bundle2, int i, final TimeInterpolator timeInterpolator, final Animator.AnimatorListener animatorListener) {
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        final C58581d dVar = new C58581d();
        dVar.f144642a = i;
        dVar.f144645d = list;
        if (bundle2 == null) {
            C58579b bVar = new C58579b(context, bundle);
            dVar.f144643b = bVar.f144639a;
            dVar.f144644c = bVar.f144640b;
            final View view = list.get(0);
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.widget.photo_picker.animation.p2944a.p2945a.C58577a.ViewTreeObserver$OnPreDrawListenerC585781 */

                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    C58577a.m227212a(dVar, timeInterpolator, animatorListener);
                    return true;
                }
            });
        }
        return dVar;
    }
}
