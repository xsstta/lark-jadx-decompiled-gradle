package com.h6ah4i.android.widget.advrecyclerview.draggable;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RecyclerViewDragDropManager {

    /* renamed from: a */
    public static final Interpolator f57342a = new animationInterpolatorC23262a();

    /* renamed from: b */
    public static final Interpolator f57343b = new DecelerateInterpolator();

    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemMoveMode {
    }
}
