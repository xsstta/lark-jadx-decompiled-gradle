package androidx.core.view.p029a;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.a.a */
public final class C0861a extends ClickableSpan {

    /* renamed from: a */
    private final int f3351a;

    /* renamed from: b */
    private final C0864d f3352b;

    /* renamed from: c */
    private final int f3353c;

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3351a);
        this.f3352b.mo4561a(this.f3353c, bundle);
    }

    public C0861a(int i, C0864d dVar, int i2) {
        this.f3351a = i;
        this.f3352b = dVar;
        this.f3353c = i2;
    }
}
