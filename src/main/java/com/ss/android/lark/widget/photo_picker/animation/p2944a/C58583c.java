package com.ss.android.lark.widget.photo_picker.animation.p2944a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.view.animation.AccelerateInterpolator;
import com.ss.android.lark.widget.photo_picker.animation.AbstractC58594b;
import com.ss.android.lark.widget.photo_picker.animation.p2944a.p2945a.C58577a;
import com.ss.android.lark.widget.photo_picker.animation.p2944a.p2945a.C58581d;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.a.c */
public class C58583c extends AbstractC58594b {

    /* renamed from: a */
    private final C58581d f144649a;

    /* renamed from: b */
    private TimeInterpolator f144650b;

    /* renamed from: c */
    private Animator.AnimatorListener f144651c;

    /* renamed from: b */
    public C58583c mo198586a(Animator.AnimatorListener animatorListener) {
        this.f144651c = animatorListener;
        return this;
    }

    public C58583c(C58581d dVar) {
        this.f144649a = dVar;
    }

    @Override // com.ss.android.lark.widget.photo_picker.animation.AbstractC58594b
    /* renamed from: a */
    public void mo198587a(final Activity activity) {
        if (this.f144650b == null) {
            this.f144650b = new AccelerateInterpolator();
        }
        C58577a.m227213a(this.f144649a, this.f144650b, new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.animation.p2944a.C58583c.RunnableC585841 */

            public void run() {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
        }, this.f144651c);
    }
}
