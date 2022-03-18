package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.b.d */
public class C27919d implements AbstractC27920e {

    /* renamed from: a */
    private float f69812a;

    public C27919d(float f) {
        this.f69812a = f;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.AbstractC27920e
    /* renamed from: a */
    public void mo99527a(Canvas canvas, Paint paint, C27917b bVar) {
        RectF rectF = new RectF((float) bVar.f69801b.left, (float) bVar.f69801b.top, (float) bVar.f69801b.right, (float) bVar.f69801b.bottom);
        float f = this.f69812a;
        canvas.drawRoundRect(rectF, f, f, paint);
    }
}
