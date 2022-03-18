package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f1367a;

    /* renamed from: b */
    private TypedValue f1368b;

    /* renamed from: c */
    private TypedValue f1369c;

    /* renamed from: d */
    private TypedValue f1370d;

    /* renamed from: e */
    private TypedValue f1371e;

    /* renamed from: f */
    private TypedValue f1372f;

    /* renamed from: g */
    private final Rect f1373g;

    /* renamed from: h */
    private AbstractC0382a f1374h;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface AbstractC0382a {
        /* renamed from: a */
        void mo865a();

        /* renamed from: b */
        void mo866b();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1371e == null) {
            this.f1371e = new TypedValue();
        }
        return this.f1371e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1372f == null) {
            this.f1372f = new TypedValue();
        }
        return this.f1372f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1369c == null) {
            this.f1369c = new TypedValue();
        }
        return this.f1369c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1370d == null) {
            this.f1370d = new TypedValue();
        }
        return this.f1370d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1367a == null) {
            this.f1367a = new TypedValue();
        }
        return this.f1367a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1368b == null) {
            this.f1368b = new TypedValue();
        }
        return this.f1368b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0382a aVar = this.f1374h;
        if (aVar != null) {
            aVar.mo865a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0382a aVar = this.f1374h;
        if (aVar != null) {
            aVar.mo866b();
        }
    }

    /* renamed from: a */
    public void mo2063a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(AbstractC0382a aVar) {
        this.f1374h = aVar;
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1373g = new Rect();
    }

    /* renamed from: a */
    public void mo2062a(int i, int i2, int i3, int i4) {
        this.f1373g.set(i, i2, i3, i4);
        if (ViewCompat.m4012F(this)) {
            requestLayout();
        }
    }
}
