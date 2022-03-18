package com.ss.android.lark.mm.module.reaction;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ReactionTipsLinear extends LinearLayout {
    public ReactionTipsLinear(Context context) {
        this(context, null);
    }

    public ReactionTipsLinear(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionTipsLinear(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
