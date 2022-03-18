package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28190k;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.b.c */
public class C27918c extends View {

    /* renamed from: a */
    private C27917b f69805a;

    /* renamed from: b */
    private C27917b[] f69806b;

    /* renamed from: c */
    private int f69807c;

    /* renamed from: d */
    private int[] f69808d = new int[2];

    /* renamed from: e */
    private Paint f69809e;

    /* renamed from: f */
    private int f69810f;

    /* renamed from: g */
    private int f69811g;

    public View getTargetView() {
        return this.f69805a.f69800a;
    }

    /* renamed from: a */
    private void m101913a() {
        this.f69809e = new Paint(1);
        this.f69807c = ContextCompat.getColor(getContext(), R.color.bg_mask);
    }

    public Rect getTargetRect() {
        C27917b bVar = this.f69805a;
        if (bVar == null) {
            return null;
        }
        bVar.f69800a.getDrawingRect(bVar.f69801b);
        bVar.f69800a.getLocationOnScreen(this.f69808d);
        bVar.f69801b.left = this.f69808d[0] - this.f69810f;
        bVar.f69801b.top = this.f69808d[1] - this.f69811g;
        bVar.f69801b.right += bVar.f69801b.left;
        bVar.f69801b.bottom += bVar.f69801b.top;
        if (bVar.f69803d != null) {
            bVar.f69801b.left -= bVar.f69803d.left;
            bVar.f69801b.top -= bVar.f69803d.top;
            bVar.f69801b.right += bVar.f69803d.right;
            bVar.f69801b.bottom += bVar.f69803d.bottom;
        }
        if (bVar.f69804e != 0) {
            bVar.f69801b.bottom = Math.min(bVar.f69801b.bottom, bVar.f69801b.top + bVar.f69804e);
        }
        return bVar.f69801b;
    }

    public void setMainTargetHollow(C27917b bVar) {
        this.f69805a = bVar;
    }

    public void setCurtainColor(int i) {
        this.f69807c = i;
        postInvalidate();
    }

    public void setHollowInfo(C27917b... bVarArr) {
        this.f69806b = bVarArr;
        postInvalidate();
    }

    public C27918c(Context context) {
        super(context, null);
        m101913a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), null);
        m101914a(canvas);
        m101916b(canvas);
        canvas.restoreToCount(saveLayer);
    }

    /* renamed from: a */
    private void m101914a(Canvas canvas) {
        this.f69809e.setXfermode(null);
        this.f69809e.setColor(this.f69807c);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), this.f69809e);
    }

    /* renamed from: b */
    private void m101916b(Canvas canvas) {
        this.f69809e.setColor(-1);
        this.f69809e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m101915a(this.f69805a, canvas);
        C27917b[] bVarArr = this.f69806b;
        if (bVarArr != null) {
            for (C27917b bVar : bVarArr) {
                m101915a(bVar, canvas);
            }
        }
    }

    /* renamed from: a */
    public void mo99532a(int i, int i2) {
        this.f69810f = i;
        this.f69811g = i2;
        postInvalidate();
    }

    /* renamed from: b */
    private void m101917b(C27917b bVar, Canvas canvas) {
        if (!m101918c(bVar, canvas)) {
            canvas.drawRect(bVar.f69801b, this.f69809e);
        }
    }

    /* renamed from: c */
    private boolean m101918c(C27917b bVar, Canvas canvas) {
        if (bVar.f69802c == null) {
            return false;
        }
        bVar.f69802c.mo99527a(canvas, this.f69809e, bVar);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(C28190k.m103260b(getContext()), C28190k.m103259a(getContext()) * 2);
    }

    /* renamed from: a */
    private void m101915a(C27917b bVar, Canvas canvas) {
        if (bVar != null) {
            bVar.f69800a.getDrawingRect(bVar.f69801b);
            bVar.f69800a.getLocationOnScreen(this.f69808d);
            bVar.f69801b.left = this.f69808d[0] - this.f69810f;
            bVar.f69801b.top = this.f69808d[1] - this.f69811g;
            bVar.f69801b.right += bVar.f69801b.left;
            bVar.f69801b.bottom += bVar.f69801b.top;
            if (bVar.f69803d != null) {
                bVar.f69801b.left -= bVar.f69803d.left;
                bVar.f69801b.top -= bVar.f69803d.top;
                bVar.f69801b.right += bVar.f69803d.right;
                bVar.f69801b.bottom += bVar.f69803d.bottom;
            }
            if (bVar.f69804e != 0) {
                bVar.f69801b.bottom = Math.min(bVar.f69801b.bottom, bVar.f69801b.top + bVar.f69804e);
            }
            m101917b(bVar, canvas);
        }
    }
}
