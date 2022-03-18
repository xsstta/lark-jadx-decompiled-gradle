package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ee.util.p718t.C13749l;
import com.github.ybq.android.spinkit.SpinKitView;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p969c.C21325b;
import com.larksuite.suite.R;

public class CommonLoadingView extends LinearLayout {

    /* renamed from: a */
    private Context f20832a;

    /* renamed from: b */
    private C21325b f20833b;

    public CommonLoadingView(Context context) {
        super(context);
        m30863a(context);
    }

    /* renamed from: a */
    private void m30863a(Context context) {
        setBackground(context.getResources().getDrawable(R.drawable.facade_loading_view_bg));
        setPadding(C13749l.m55738a(21), C13749l.m55738a(10), C13749l.m55738a(21), C13749l.m55738a(10));
        setGravity(17);
        this.f20832a = context;
        SpinKitView spinKitView = new SpinKitView(this.f20832a);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(C13749l.m55738a(42), C13749l.m55738a(42));
        spinKitView.setVisibility(0);
        C21325b bVar = new C21325b();
        this.f20833b = bVar;
        spinKitView.setIndeterminateDrawable((AbstractC21312f) bVar);
        this.f20833b.stop();
        addView(spinKitView, layoutParams);
    }

    public CommonLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30863a(context);
    }

    public CommonLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30863a(context);
    }
}
