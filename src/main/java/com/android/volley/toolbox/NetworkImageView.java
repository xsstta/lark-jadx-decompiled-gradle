package com.android.volley.toolbox;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.toolbox.C1962k;

public class NetworkImageView extends ImageView {

    /* renamed from: a */
    public int f6626a;

    /* renamed from: b */
    public int f6627b;

    /* renamed from: c */
    private String f6628c;

    /* renamed from: d */
    private C1962k f6629d;

    /* renamed from: e */
    private C1962k.C1968c f6630e;

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* renamed from: a */
    private void m8611a() {
        int i = this.f6626a;
        if (i != 0) {
            setImageResource(i);
        } else {
            setImageBitmap(null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1962k.C1968c cVar = this.f6630e;
        if (cVar != null) {
            cVar.mo9864a();
            setImageBitmap(null);
            this.f6630e = null;
        }
        super.onDetachedFromWindow();
    }

    public void setDefaultImageResId(int i) {
        this.f6626a = i;
    }

    public void setErrorImageResId(int i) {
        this.f6627b = i;
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9820a(final boolean r9) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.NetworkImageView.mo9820a(boolean):void");
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo9820a(true);
    }
}
