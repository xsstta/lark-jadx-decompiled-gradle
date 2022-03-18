package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import com.airbnb.lottie.AbstractC1780b;
import com.airbnb.lottie.C1806f;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;

public class MmLikeLottieView extends LottieAnimationView {

    /* renamed from: a */
    public Bitmap f118748a;

    /* renamed from: a */
    public void mo165610a() {
        cancelAnimation();
        setAnimation(R.raw.mm_like_big);
        setImageAssetDelegate(new AbstractC1780b() {
            /* class com.ss.android.lark.mm.widget.MmLikeLottieView.C471341 */

            @Override // com.airbnb.lottie.AbstractC1780b
            public Bitmap fetchBitmap(C1806f fVar) {
                return MmLikeLottieView.this.f118748a;
            }
        });
        playAnimation();
    }

    public MmLikeLottieView(Context context) {
        this(context, null);
    }

    public MmLikeLottieView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MmLikeLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118748a = BitmapFactory.decodeResource(getResources(), R.drawable.mm_link_hand);
    }
}
