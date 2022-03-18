package com.ss.android.appcenter.business.tab.business.blockit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;

public class BlockWrapperView extends FrameLayout {
    public BlockWrapperView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m101626a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.workplace_block_layout, (ViewGroup) this, true);
    }

    public BlockWrapperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlockWrapperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m101626a(context);
    }
}
