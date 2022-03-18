package com.ss.android.lark.widget.photo_picker.animation.activity_transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.view.animation.DecelerateInterpolator;
import com.ss.android.lark.widget.photo_picker.animation.AbstractC58594b;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58586a;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.activity_transition.b */
public class C58592b extends AbstractC58594b {

    /* renamed from: a */
    private final C58586a f144688a;

    /* renamed from: b */
    private TimeInterpolator f144689b;

    /* renamed from: c */
    private Animator.AnimatorListener f144690c;

    /* renamed from: b */
    public C58592b mo198586a(Animator.AnimatorListener animatorListener) {
        this.f144690c = animatorListener;
        return this;
    }

    public C58592b(C58586a aVar) {
        this.f144688a = aVar;
    }

    @Override // com.ss.android.lark.widget.photo_picker.animation.AbstractC58594b
    /* renamed from: a */
    public void mo198587a(final Activity activity) {
        if (this.f144689b == null) {
            this.f144689b = new DecelerateInterpolator();
        }
        C58587b.m227239a(this.f144688a, this.f144689b, new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.animation.activity_transition.C58592b.RunnableC585931 */

            public void run() {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
        }, this.f144690c);
    }
}
