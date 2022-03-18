package com.ss.android.lark.widget.photo_picker.animation.activity_transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58587b;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.activity_transition.a */
public class C58585a {

    /* renamed from: a */
    private final Intent f144659a;

    /* renamed from: b */
    private int f144660b = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: c */
    private View f144661c;

    /* renamed from: d */
    private TimeInterpolator f144662d;

    /* renamed from: e */
    private Animator.AnimatorListener f144663e;

    /* renamed from: f */
    private Context f144664f;

    /* renamed from: a */
    public C58585a mo198594a(Animator.AnimatorListener animatorListener) {
        this.f144663e = animatorListener;
        return this;
    }

    /* renamed from: a */
    public static C58585a m227230a(Intent intent) {
        return new C58585a(intent);
    }

    private C58585a(Intent intent) {
        this.f144659a = intent;
    }

    /* renamed from: a */
    public C58585a mo198595a(Context context) {
        this.f144664f = context;
        return this;
    }

    /* renamed from: a */
    public C58585a mo198596a(View view) {
        this.f144661c = view;
        return this;
    }

    /* renamed from: a */
    public C58592b mo198597a(Bundle bundle) {
        if (this.f144662d == null) {
            this.f144662d = new DecelerateInterpolator();
        }
        return new C58592b(C58587b.m227235a(this.f144664f, this.f144661c, this.f144659a.getExtras(), bundle, this.f144660b, this.f144662d, this.f144663e));
    }
}
