package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class SnackbarContentLayout extends LinearLayout implements AbstractC22437a {

    /* renamed from: a */
    private TextView f55093a;

    /* renamed from: b */
    private Button f55094b;

    /* renamed from: c */
    private int f55095c;

    /* renamed from: d */
    private int f55096d;

    public Button getActionView() {
        return this.f55094b;
    }

    public TextView getMessageView() {
        return this.f55093a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f55093a = (TextView) findViewById(R.id.snackbar_text);
        this.f55094b = (Button) findViewById(R.id.snackbar_action);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f55096d = i;
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth});
        this.f55095c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f55096d = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    @Override // com.google.android.material.snackbar.AbstractC22437a
    /* renamed from: a */
    public void mo78200a(int i, int i2) {
        this.f55093a.setAlpha(BitmapDescriptorFactory.HUE_RED);
        long j = (long) i2;
        long j2 = (long) i;
        this.f55093a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f55094b.getVisibility() == 0) {
            this.f55094b.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.f55094b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.AbstractC22437a
    /* renamed from: b */
    public void mo78201b(int i, int i2) {
        this.f55093a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f55093a.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j).setStartDelay(j2).start();
        if (this.f55094b.getVisibility() == 0) {
            this.f55094b.setAlpha(1.0f);
            this.f55094b.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (m81370a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (m81370a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private static void m81369a(View view, int i, int i2) {
        if (ViewCompat.m4007A(view)) {
            ViewCompat.m4058b(view, ViewCompat.m4094l(view), i, ViewCompat.m4097m(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    private boolean m81370a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f55093a.getPaddingTop() == i2 && this.f55093a.getPaddingBottom() == i3) {
            return z;
        }
        m81369a(this.f55093a, i2, i3);
        return true;
    }
}
