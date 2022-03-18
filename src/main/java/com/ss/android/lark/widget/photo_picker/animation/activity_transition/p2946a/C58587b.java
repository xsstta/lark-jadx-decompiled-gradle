package com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.activity_transition.a.b */
public class C58587b {

    /* renamed from: a */
    public static final Object f144671a = new Object();

    /* renamed from: b */
    public static WeakReference<Bitmap> f144672b;

    /* renamed from: c */
    public static boolean f144673c;

    /* renamed from: a */
    private static void m227236a(View view, Bitmap bitmap) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageBitmap(bitmap);
        } else {
            ViewCompat.m4039a(view, new BitmapDrawable(view.getResources(), bitmap));
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016 A[LOOP:0: B:7:0x0016->B:19:0x0016, LOOP_START, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m227237a(android.view.View r4, java.lang.String r5) {
        /*
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b.f144672b
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r5 = com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b.f144672b
            r5.clear()
            goto L_0x0027
        L_0x0013:
            java.lang.Object r0 = com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b.f144671a
            monitor-enter(r0)
        L_0x0016:
            boolean r1 = com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b.f144673c     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0022
            java.lang.Object r1 = com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b.f144671a     // Catch:{ InterruptedException -> 0x0016 }
            r2 = 3000(0xbb8, double:1.482E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0016 }
            goto L_0x0016
        L_0x0022:
            monitor-exit(r0)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r5)
        L_0x0027:
            m227236a(r4, r0)
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b.m227237a(android.view.View, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m227238a(C58586a aVar, TimeInterpolator timeInterpolator, Animator.AnimatorListener animatorListener) {
        View view = aVar.f144670f;
        view.setPivotX(BitmapDescriptorFactory.HUE_RED);
        view.setPivotY(BitmapDescriptorFactory.HUE_RED);
        view.setScaleX(aVar.f144667c);
        view.setScaleY(aVar.f144668d);
        view.setTranslationX((float) aVar.f144665a);
        view.setTranslationY((float) aVar.f144666b);
        view.animate().setDuration((long) aVar.f144669e).scaleX(1.0f).scaleY(1.0f).translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setListener(animatorListener).setInterpolator(timeInterpolator);
    }

    /* renamed from: a */
    public static void m227239a(C58586a aVar, TimeInterpolator timeInterpolator, Runnable runnable, Animator.AnimatorListener animatorListener) {
        View view = aVar.f144670f;
        int i = aVar.f144669e;
        int i2 = aVar.f144665a;
        int i3 = aVar.f144666b;
        float f = aVar.f144667c;
        long j = (long) i;
        view.animate().setDuration(j).scaleX(f).scaleY(aVar.f144668d).setInterpolator(timeInterpolator).translationX((float) i2).setListener(animatorListener).translationY((float) i3);
        view.postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static C58586a m227235a(Context context, final View view, Bundle bundle, Bundle bundle2, int i, final TimeInterpolator timeInterpolator, final Animator.AnimatorListener animatorListener) {
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        final C58591d dVar = new C58591d(context, bundle);
        if (dVar.f144686e != null) {
            m227237a(view, dVar.f144686e);
        }
        final C58586a aVar = new C58586a();
        aVar.f144670f = view;
        aVar.f144669e = i;
        if (bundle2 == null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b.ViewTreeObserver$OnPreDrawListenerC585881 */

                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    aVar.f144665a = dVar.f144683b - iArr[0];
                    aVar.f144666b = dVar.f144682a - iArr[1];
                    if (view.getWidth() > 0 && view.getHeight() > 0) {
                        aVar.f144667c = ((float) dVar.f144684c) / ((float) view.getWidth());
                        aVar.f144668d = ((float) dVar.f144685d) / ((float) view.getHeight());
                    }
                    C58587b.m227238a(aVar, timeInterpolator, animatorListener);
                    return true;
                }
            });
        }
        return aVar;
    }
}
