package com.bytedance.ee.bear.list.homepage.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

public class BannerMoreView extends AppCompatTextView {
    public BannerMoreView(Context context) {
        super(context);
        m35054a(context);
    }

    /* renamed from: a */
    private void m35054a(Context context) {
        setText(R.string.Doc_List_All);
        setTextColor(C13749l.m55755c(context, R.color.primary_pri_500));
        setTextSize(14.0f);
        setGravity(16);
        setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.list_pin_view_more, 0);
        C13747j.m55726a(this, (int) R.color.primary_pri_500);
        setCompoundDrawablePadding(C13749l.m55738a(1));
    }

    public BannerMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35054a(context);
    }

    public BannerMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m35054a(context);
    }
}
