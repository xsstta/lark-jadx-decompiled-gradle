package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f1511a;

    /* renamed from: b */
    private int f1512b;

    /* renamed from: c */
    private WeakReference<View> f1513c;

    /* renamed from: d */
    private LayoutInflater f1514d;

    /* renamed from: e */
    private AbstractC0419a f1515e;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface AbstractC0419a {
        /* renamed from: a */
        void mo2459a(ViewStubCompat viewStubCompat, View view);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1512b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1514d;
    }

    public int getLayoutResource() {
        return this.f1511a;
    }

    /* renamed from: a */
    public View mo2447a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1511a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1514d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1511a, viewGroup, false);
            int i = this.f1512b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1513c = new WeakReference<>(inflate);
            AbstractC0419a aVar = this.f1515e;
            if (aVar != null) {
                aVar.mo2459a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setInflatedId(int i) {
        this.f1512b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1514d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1511a = i;
    }

    public void setOnInflateListener(AbstractC0419a aVar) {
        this.f1515e = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1513c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo2447a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842960, 16842994, 16842995}, i, 0);
        this.f1512b = obtainStyledAttributes.getResourceId(2, -1);
        this.f1511a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
