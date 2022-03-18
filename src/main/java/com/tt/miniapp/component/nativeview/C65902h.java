package com.tt.miniapp.component.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ProgressBar;

/* renamed from: com.tt.miniapp.component.nativeview.h */
public class C65902h extends ProgressBar {
    /* renamed from: a */
    public void mo230757a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo230758b() {
        setVisibility(8);
    }

    public boolean isShown() {
        if (!super.isShown() || getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setInternalProgress(int i) {
        setProgress(i);
    }

    public C65902h(Context context) {
        super(context, null, 16842872);
    }
}
