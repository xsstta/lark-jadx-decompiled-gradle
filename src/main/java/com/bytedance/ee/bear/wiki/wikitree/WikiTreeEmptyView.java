package com.bytedance.ee.bear.wiki.wikitree;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.bear.facade.common.empty.EmptyView;
import com.larksuite.suite.R;

public class WikiTreeEmptyView extends EmptyView {

    /* renamed from: a */
    private View f32544a;

    public WikiTreeEmptyView(Context context) {
        super(context);
        m49911a(context);
    }

    /* renamed from: a */
    private void m49911a(Context context) {
        this.f32544a = findViewById(R.id.ll_no_data);
    }

    public void setNoFoundClickListener(View.OnClickListener onClickListener) {
        View view = this.f32544a;
        if (view != null && onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public WikiTreeEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49911a(context);
    }

    public WikiTreeEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49911a(context);
    }
}
