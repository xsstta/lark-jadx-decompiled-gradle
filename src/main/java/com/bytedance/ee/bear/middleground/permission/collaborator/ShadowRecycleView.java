package com.bytedance.ee.bear.middleground.permission.collaborator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

public class ShadowRecycleView extends RecyclerView {

    /* renamed from: a */
    private Drawable f25745a;

    /* renamed from: b */
    private int f25746b;

    /* renamed from: c */
    private boolean f25747c;

    public void setShowShadow(boolean z) {
        this.f25747c = z;
    }

    /* renamed from: a */
    private void m39729a(Context context) {
        this.f25745a = context.getResources().getDrawable(R.drawable.share_notify_lark_bg);
        this.f25746b = (int) context.getResources().getDimension(R.dimen.share_shadow_padding);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f25747c) {
            this.f25745a.setBounds(0, getHeight() - this.f25746b, getWidth(), getHeight());
            this.f25745a.draw(canvas);
        }
    }

    public ShadowRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m39729a(context);
    }

    public ShadowRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m39729a(context);
    }
}
