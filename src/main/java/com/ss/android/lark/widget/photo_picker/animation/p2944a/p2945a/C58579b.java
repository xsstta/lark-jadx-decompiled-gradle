package com.ss.android.lark.widget.photo_picker.animation.p2944a.p2945a;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.C58595c;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.a.a.b */
public class C58579b extends BaseData {

    /* renamed from: a */
    public final float f144639a;

    /* renamed from: b */
    public final float f144640b;

    /* renamed from: c */
    private String f144641c;

    /* renamed from: a */
    public Bundle mo198582a() {
        Bundle bundle = new Bundle();
        bundle.putFloat(this.f144641c + ".from", this.f144639a);
        bundle.putFloat(this.f144641c + ".to", this.f144640b);
        bundle.putInt(this.f144641c + ".animationtype", BaseData.AnimationType.ALPHA_ANIMATION.getValue());
        return bundle;
    }

    /* renamed from: a */
    private void m227214a(Context context) {
        this.f144641c = (String) C58595c.m227250a(context, "APPLICATION_ID");
    }

    public C58579b(Context context, Bundle bundle) {
        m227214a(context);
        this.f144639a = bundle.getFloat(this.f144641c + ".from");
        this.f144640b = bundle.getFloat(this.f144641c + ".to");
    }

    public C58579b(Context context, float f, float f2) {
        m227214a(context);
        this.f144639a = f;
        this.f144640b = f2;
    }
}
