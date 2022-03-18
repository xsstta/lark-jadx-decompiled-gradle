package com.tt.miniapp.component.nativeview.picker.wheel;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ee.larkbrand.utils.C13344e;
import com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b;
import com.tt.miniapp.component.nativeview.picker.wheel.WheelView;

/* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.f */
public abstract class AbstractC65965f extends AbstractC65914b<View> {

    /* renamed from: T */
    protected float f166493T = 3.0f;

    /* renamed from: U */
    protected int f166494U = -1;

    /* renamed from: V */
    protected int f166495V = 17;

    /* renamed from: W */
    protected int f166496W = 15;

    /* renamed from: X */
    protected Typeface f166497X = Typeface.DEFAULT;

    /* renamed from: Y */
    protected int f166498Y = WheelView.text_placeholder;

    /* renamed from: Z */
    protected int f166499Z = WheelView.text_title;
    protected int aa = WheelView.text_title;
    protected int ab = 5;
    protected boolean ac = true;
    protected boolean ad = true;
    protected boolean ae = true;
    protected WheelView.C65932a af = new WheelView.C65932a();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public TextView mo230928t() {
        TextView textView = new TextView(this.f166322a);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setTextColor(C13344e.m54321a(this.aa, mo230798h()));
        textView.setTextSize((float) this.f166495V);
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public WheelView mo230927s() {
        WheelView wheelView = new WheelView(this.f166322a);
        wheelView.setLineSpaceMultiplier(this.f166493T);
        wheelView.setTextPadding(this.f166494U);
        wheelView.setTextSize((float) this.f166495V);
        wheelView.setOutTextSize((float) this.f166496W);
        wheelView.setTypeface(this.f166497X);
        wheelView.mo230845a(C13344e.m54321a(this.f166498Y, mo230798h()), C13344e.m54321a(this.f166499Z, mo230798h()));
        wheelView.setDividerConfig(this.af);
        wheelView.setOffset(this.ab);
        wheelView.setCycleDisable(this.ac);
        wheelView.setUseWeight(this.ad);
        wheelView.setTextSizeAutoFit(this.ae);
        return wheelView;
    }

    public AbstractC65965f(Activity activity) {
        super(activity);
    }
}
