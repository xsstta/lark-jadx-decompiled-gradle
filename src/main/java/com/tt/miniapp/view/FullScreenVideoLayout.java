package com.tt.miniapp.view;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class FullScreenVideoLayout extends FrameLayout {

    /* renamed from: com.tt.miniapp.view.FullScreenVideoLayout$a */
    public interface AbstractC67138a {
        /* renamed from: a */
        void mo233135a();
    }

    /* renamed from: a */
    public void mo233466a() {
        setVisibility(8);
        removeAllViews();
    }

    /* renamed from: b */
    private void m261742b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(2, ofFloat);
        layoutTransition.setDuration(150);
        setLayoutTransition(layoutTransition);
        setFocusableInTouchMode(true);
        setFocusable(true);
    }

    public FullScreenVideoLayout(Context context) {
        super(context);
        m261742b();
    }

    public FullScreenVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m261742b();
    }

    /* renamed from: a */
    public void mo233467a(final View view, final AbstractC67138a aVar) {
        post(new Runnable() {
            /* class com.tt.miniapp.view.FullScreenVideoLayout.RunnableC671371 */

            public void run() {
                FullScreenVideoLayout.this.addView(view);
                FullScreenVideoLayout.this.setVisibility(0);
                FullScreenVideoLayout.this.requestFocus();
                AbstractC67138a aVar = aVar;
                if (aVar != null) {
                    aVar.mo233135a();
                }
            }
        });
    }

    public FullScreenVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m261742b();
    }
}
