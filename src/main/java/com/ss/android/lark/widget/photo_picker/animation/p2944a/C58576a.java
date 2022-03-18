package com.ss.android.lark.widget.photo_picker.animation.p2944a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.widget.photo_picker.animation.p2944a.p2945a.C58577a;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.a.a */
public class C58576a {

    /* renamed from: a */
    private final Intent f144629a;

    /* renamed from: b */
    private int f144630b = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: c */
    private TimeInterpolator f144631c;

    /* renamed from: d */
    private Animator.AnimatorListener f144632d;

    /* renamed from: e */
    private Context f144633e;

    /* renamed from: f */
    private List<View> f144634f;

    /* renamed from: a */
    public C58576a mo198577a(Animator.AnimatorListener animatorListener) {
        this.f144632d = animatorListener;
        return this;
    }

    /* renamed from: a */
    public static C58576a m227206a(Intent intent) {
        return new C58576a(intent);
    }

    private C58576a(Intent intent) {
        this.f144629a = intent;
    }

    /* renamed from: a */
    public C58576a mo198578a(Context context) {
        this.f144633e = context;
        return this;
    }

    /* renamed from: a */
    public C58576a mo198579a(List<View> list) {
        this.f144634f = list;
        return this;
    }

    /* renamed from: a */
    public C58583c mo198580a(Bundle bundle) {
        if (this.f144631c == null) {
            this.f144631c = new AccelerateInterpolator();
        }
        return new C58583c(C58577a.m227211a(this.f144633e, this.f144634f, this.f144629a.getExtras(), bundle, this.f144630b, this.f144631c, this.f144632d));
    }
}
