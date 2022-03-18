package com.bytedance.ee.bear.bitable.card.view.cell;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.C13655e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class CellEditDragView extends CommonActionPanelLayout implements C7728a.AbstractC7730a {

    /* renamed from: c */
    private AbstractC4564b f13451c;

    /* renamed from: d */
    private AbstractC4563a f13452d;

    /* renamed from: e */
    private float f13453e;

    /* renamed from: f */
    private float f13454f;

    /* renamed from: g */
    private float f13455g;

    /* renamed from: h */
    private int f13456h;

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView$a */
    public interface AbstractC4563a {
        /* renamed from: a */
        void mo17968a(int i, int i2);
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView$b */
    public interface AbstractC4564b {
        /* renamed from: a */
        void mo17969a();

        /* renamed from: b */
        void mo17970b();

        /* renamed from: c */
        void mo17971c();
    }

    /* renamed from: a */
    public boolean mo17963a() {
        if (getDragUtil() != null) {
            return getDragUtil().mo30267m();
        }
        return true;
    }

    public void setHeightChangedListener(AbstractC4563a aVar) {
        this.f13452d = aVar;
    }

    public void setOnPositionChangeListener(AbstractC4564b bVar) {
        this.f13451c = bVar;
    }

    public CellEditDragView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public void mo17964b(boolean z) {
        if (getDragUtil() != null) {
            if (z) {
                getDragUtil().mo30266l();
            } else {
                getDragUtil().mo30249a(this.f13454f);
            }
        }
    }

    /* renamed from: a */
    public void mo17962a(boolean z) {
        if (getDragUtil() != null && !mo17963a()) {
            if (z) {
                getDragUtil().mo30265k();
            } else {
                getDragUtil().mo30249a(this.f13455g);
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
    public void onHeightChange(int i) {
        AbstractC4563a aVar = this.f13452d;
        if (aVar != null) {
            int i2 = this.f13456h;
            this.f13456h = i;
            aVar.mo17968a(i2, i);
        }
        AbstractC4564b bVar = this.f13451c;
        if (bVar == null) {
            return;
        }
        if (i == 0) {
            bVar.mo17969a();
            return;
        }
        float f = (float) i;
        if (Math.abs(f - this.f13454f) < 1.0f) {
            this.f13451c.mo17970b();
        } else if (Math.abs(f - this.f13455g) < 1.0f) {
            this.f13451c.mo17971c();
        }
    }

    public CellEditDragView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo17961a(float f, boolean z) {
        if (getDragUtil() != null) {
            if (z) {
                getDragUtil().mo30256b(f);
            } else {
                getDragUtil().mo30249a(f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m18958a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxHeight, R.attr.maxHeightPercent, R.attr.midHeight, R.attr.midHeightPercent, R.attr.minHeight, R.attr.minHeightPercent});
        try {
            float f = obtainStyledAttributes.getFloat(5, BitmapDescriptorFactory.HUE_RED);
            float f2 = obtainStyledAttributes.getFloat(3, 0.45f);
            float f3 = obtainStyledAttributes.getFloat(1, 0.85f);
            this.f13453e = (float) obtainStyledAttributes.getDimensionPixelSize(4, (int) (((float) C13655e.m55413b()) * f));
            this.f13454f = (float) obtainStyledAttributes.getDimensionPixelSize(2, (int) (((float) C13655e.m55413b()) * f2));
            this.f13455g = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) (((float) C13655e.m55413b()) * f3));
            obtainStyledAttributes.recycle();
            mo45436a(this.f13453e, this.f13454f, this.f13455g);
            mo45442c(true);
            setOnDragViewHeightChangeListener(this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public CellEditDragView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setFocusable(true);
        setFocusableInTouchMode(true);
        m18958a(context, attributeSet);
    }
}
