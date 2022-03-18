package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.j */
public class C0450j extends C0449i {

    /* renamed from: a */
    private final SeekBar f1646a;

    /* renamed from: b */
    private Drawable f1647b;

    /* renamed from: c */
    private ColorStateList f1648c;

    /* renamed from: d */
    private PorterDuff.Mode f1649d;

    /* renamed from: e */
    private boolean f1650e;

    /* renamed from: f */
    private boolean f1651f;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2608b() {
        Drawable drawable = this.f1647b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2609c() {
        Drawable drawable = this.f1647b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1646a.getDrawableState())) {
            this.f1646a.invalidateDrawable(drawable);
        }
    }

    /* renamed from: d */
    private void m1943d() {
        Drawable drawable = this.f1647b;
        if (drawable == null) {
            return;
        }
        if (this.f1650e || this.f1651f) {
            Drawable g = C0774a.m3779g(drawable.mutate());
            this.f1647b = g;
            if (this.f1650e) {
                C0774a.m3768a(g, this.f1648c);
            }
            if (this.f1651f) {
                C0774a.m3771a(this.f1647b, this.f1649d);
            }
            if (this.f1647b.isStateful()) {
                this.f1647b.setState(this.f1646a.getDrawableState());
            }
        }
    }

    C0450j(SeekBar seekBar) {
        super(seekBar);
        this.f1646a = seekBar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2607a(Drawable drawable) {
        Drawable drawable2 = this.f1647b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1647b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1646a);
            C0774a.m3774b(drawable, ViewCompat.m4082h(this.f1646a));
            if (drawable.isStateful()) {
                drawable.setState(this.f1646a.getDrawableState());
            }
            m1943d();
        }
        this.f1646a.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2606a(Canvas canvas) {
        int i;
        if (this.f1647b != null) {
            int max = this.f1646a.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1647b.getIntrinsicWidth();
                int intrinsicHeight = this.f1647b.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f1647b.setBounds(-i, -i2, i, i2);
                float width = ((float) ((this.f1646a.getWidth() - this.f1646a.getPaddingLeft()) - this.f1646a.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1646a.getPaddingLeft(), (float) (this.f1646a.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1647b.draw(canvas);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0449i
    /* renamed from: a */
    public void mo2605a(AttributeSet attributeSet, int i) {
        super.mo2605a(attributeSet, i);
        C0427af a = C0427af.m1778a(this.f1646a.getContext(), attributeSet, new int[]{16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode}, i, 0);
        SeekBar seekBar = this.f1646a;
        ViewCompat.m4034a(seekBar, seekBar.getContext(), new int[]{16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode}, attributeSet, a.mo2475a(), i, 0);
        Drawable b = a.mo2481b(0);
        if (b != null) {
            this.f1646a.setThumb(b);
        }
        mo2607a(a.mo2477a(1));
        if (a.mo2492g(3)) {
            this.f1649d = C0460p.m2058a(a.mo2474a(3, -1), this.f1649d);
            this.f1651f = true;
        }
        if (a.mo2492g(2)) {
            this.f1648c = a.mo2488e(2);
            this.f1650e = true;
        }
        a.mo2482b();
        m1943d();
    }
}
