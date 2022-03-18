package com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.C58595c;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.activity_transition.a.d */
public class C58591d extends BaseData {

    /* renamed from: a */
    public final int f144682a;

    /* renamed from: b */
    public final int f144683b;

    /* renamed from: c */
    public final int f144684c;

    /* renamed from: d */
    public final int f144685d;

    /* renamed from: e */
    public final String f144686e;

    /* renamed from: f */
    private String f144687f;

    /* renamed from: a */
    public Bundle mo198600a() {
        Bundle bundle = new Bundle();
        if (this.f144686e != null) {
            bundle.putString(this.f144687f + ".imageFilePath", this.f144686e);
        }
        bundle.putInt(this.f144687f + ".left", this.f144683b);
        bundle.putInt(this.f144687f + ".top", this.f144682a);
        bundle.putInt(this.f144687f + ".width", this.f144684c);
        bundle.putInt(this.f144687f + ".height", this.f144685d);
        bundle.putInt(this.f144687f + ".animationtype", BaseData.AnimationType.TRANSLATE_ANIMATION.getValue());
        return bundle;
    }

    /* renamed from: a */
    private void m227243a(Context context) {
        this.f144687f = (String) C58595c.m227250a(context, "APPLICATION_ID");
    }

    public C58591d(Context context, Bundle bundle) {
        m227243a(context);
        this.f144682a = bundle.getInt(this.f144687f + ".top");
        this.f144683b = bundle.getInt(this.f144687f + ".left");
        this.f144684c = bundle.getInt(this.f144687f + ".width");
        this.f144685d = bundle.getInt(this.f144687f + ".height");
        this.f144686e = bundle.getString(this.f144687f + ".imageFilePath");
    }

    public C58591d(Context context, int i, int i2, int i3, int i4, String str) {
        m227243a(context);
        this.f144683b = i;
        this.f144682a = i2;
        this.f144684c = i3;
        this.f144685d = i4;
        this.f144686e = str;
    }
}
