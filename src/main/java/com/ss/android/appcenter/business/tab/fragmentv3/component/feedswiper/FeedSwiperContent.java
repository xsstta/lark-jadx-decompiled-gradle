package com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;

public class FeedSwiperContent extends FrameLayout {

    /* renamed from: a */
    public float f70265a;

    /* renamed from: b */
    public float f70266b;

    /* renamed from: c */
    private ImageMaskView f70267c;

    /* renamed from: d */
    private Path f70268d;

    public FeedSwiperContent(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        this.f70268d.reset();
        Rect rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.f70268d;
        RectF rectF = new RectF(rect);
        float f = this.f70265a;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        canvas.clipPath(this.f70268d);
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public FeedSwiperContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo99934a(int i, int i2) {
        float f = (float) i2;
        this.f70266b = f;
        this.f70265a = (float) i;
        this.f70267c.f70269a = f;
    }

    public FeedSwiperContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.workplace_template_component_feed_swiper_content, (ViewGroup) this, true);
        this.f70267c = (ImageMaskView) findViewById(R.id.image_mask);
        this.f70268d = new Path();
    }
}
