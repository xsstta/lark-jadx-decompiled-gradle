package com.ss.android.lark.widget.photo_picker.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.C58585a;
import com.ss.android.lark.widget.photo_picker.animation.p2944a.C58576a;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.a */
public class C58574a {

    /* renamed from: a */
    private View f144620a;

    /* renamed from: b */
    private List<View> f144621b;

    /* renamed from: c */
    private Intent f144622c;

    /* renamed from: d */
    private int f144623d = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: e */
    private Context f144624e;

    /* renamed from: f */
    private TimeInterpolator f144625f;

    /* renamed from: g */
    private Animator.AnimatorListener f144626g;

    /* renamed from: h */
    private String f144627h = "";

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.animation.a$1 */
    public static /* synthetic */ class C585751 {

        /* renamed from: a */
        static final /* synthetic */ int[] f144628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.widget.photo_picker.animation.BaseData$AnimationType[] r0 = com.ss.android.lark.widget.photo_picker.animation.BaseData.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.photo_picker.animation.C58574a.C585751.f144628a = r0
                com.ss.android.lark.widget.photo_picker.animation.BaseData$AnimationType r1 = com.ss.android.lark.widget.photo_picker.animation.BaseData.AnimationType.ALPHA_ANIMATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.photo_picker.animation.C58574a.C585751.f144628a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.photo_picker.animation.BaseData$AnimationType r1 = com.ss.android.lark.widget.photo_picker.animation.BaseData.AnimationType.TRANSLATE_ANIMATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.animation.C58574a.C585751.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C58574a mo198572a(Animator.AnimatorListener animatorListener) {
        this.f144626g = animatorListener;
        return this;
    }

    /* renamed from: a */
    public static C58574a m227200a(Context context) {
        return new C58574a(context);
    }

    private C58574a(Context context) {
        this.f144624e = context;
    }

    /* renamed from: a */
    public C58574a mo198573a(Intent intent) {
        this.f144622c = intent;
        return this;
    }

    /* renamed from: a */
    public C58574a mo198574a(View view) {
        this.f144620a = view;
        return this;
    }

    /* renamed from: a */
    public C58574a mo198575a(List<View> list) {
        this.f144621b = list;
        return this;
    }

    /* renamed from: a */
    public AbstractC58594b mo198576a(Bundle bundle) {
        if (this.f144625f == null) {
            this.f144625f = new DecelerateInterpolator();
        }
        if (TextUtils.isEmpty(this.f144627h)) {
            this.f144627h = (String) C58595c.m227250a(this.f144624e, "APPLICATION_ID");
        }
        Bundle extras = this.f144622c.getExtras();
        if (C585751.f144628a[BaseData.AnimationType.forValue(extras.getInt(this.f144627h + ".animationtype", BaseData.AnimationType.TRANSLATE_ANIMATION.getValue())).ordinal()] != 1) {
            return C58585a.m227230a(this.f144622c).mo198595a(this.f144624e).mo198594a(this.f144626g).mo198596a(this.f144620a).mo198597a(bundle);
        }
        return C58576a.m227206a(this.f144622c).mo198578a(this.f144624e).mo198579a(this.f144621b).mo198577a(this.f144626g).mo198580a(bundle);
    }
}
