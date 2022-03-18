package com.bytedance.ee.bear.middleground.comment.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;

public class NoTopFadingEdgeRecyclerView extends PointRecoderRecyclerView {
    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        return super.getBottomFadingEdgeStrength() * 0.9f;
    }

    public NoTopFadingEdgeRecyclerView(Context context) {
        super(context);
    }

    public NoTopFadingEdgeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoTopFadingEdgeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
