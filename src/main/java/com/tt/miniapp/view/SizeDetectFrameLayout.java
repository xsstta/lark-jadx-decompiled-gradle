package com.tt.miniapp.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SizeDetectFrameLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC67139a f169297a;

    /* renamed from: b */
    private boolean f169298b = true;

    /* renamed from: com.tt.miniapp.view.SizeDetectFrameLayout$a */
    public interface AbstractC67139a {
        /* renamed from: b */
        void mo232121b(int i, int i2);
    }

    public void setWindowSizeListener(AbstractC67139a aVar) {
        this.f169297a = aVar;
    }

    public SizeDetectFrameLayout(Context context) {
        super(context);
    }

    public SizeDetectFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SizeDetectFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f169298b) {
            this.f169298b = false;
            return;
        }
        AbstractC67139a aVar = this.f169297a;
        if (aVar != null) {
            aVar.mo232121b(i, i2);
        }
    }
}
