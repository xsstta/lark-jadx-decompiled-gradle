package com.ss.android.lark.mm.widget.autosize;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.lark.mm.widget.autosize.C47138a;

public class AutofitTextView extends TextView implements C47138a.AbstractC47142c {

    /* renamed from: a */
    private C47138a f118765a;

    @Override // com.ss.android.lark.mm.widget.autosize.C47138a.AbstractC47142c
    /* renamed from: a */
    public void mo165627a(float f, float f2) {
    }

    public C47138a getAutofitHelper() {
        return this.f118765a;
    }

    public float getMaxTextSize() {
        return this.f118765a.mo165648c();
    }

    public float getMinTextSize() {
        return this.f118765a.mo165645b();
    }

    public float getPrecision() {
        return this.f118765a.mo165639a();
    }

    public void setMaxTextSize(float f) {
        this.f118765a.mo165646b(f);
    }

    public void setMinTextSize(int i) {
        this.f118765a.mo165642a(2, (float) i);
    }

    public void setPrecision(float f) {
        this.f118765a.mo165640a(f);
    }

    public void setSizeToFit(boolean z) {
        this.f118765a.mo165644a(z);
    }

    public AutofitTextView(Context context) {
        super(context);
        m186664a(context, null, 0);
    }

    public void setLines(int i) {
        super.setLines(i);
        C47138a aVar = this.f118765a;
        if (aVar != null) {
            aVar.mo165641a(i);
        }
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        C47138a aVar = this.f118765a;
        if (aVar != null) {
            aVar.mo165641a(i);
        }
    }

    public AutofitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m186664a(context, attributeSet, 0);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C47138a aVar = this.f118765a;
        if (aVar != null) {
            aVar.mo165649c(i, f);
        }
    }

    /* renamed from: a */
    private void m186664a(Context context, AttributeSet attributeSet, int i) {
        this.f118765a = C47138a.m186669a(this, attributeSet, i).mo165643a((C47138a.AbstractC47142c) this);
    }

    public AutofitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m186664a(context, attributeSet, i);
    }
}
