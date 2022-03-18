package com.ss.android.appcenter.business.tab.business.p1273a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.appcenter.business.tab.business.a.i */
public class C27798i implements AbstractC27796g {

    /* renamed from: a */
    private Context f69448a;

    /* renamed from: b */
    private ImageView f69449b;

    /* renamed from: c */
    private View.OnClickListener f69450c;

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: a */
    public int mo99182a() {
        return 1;
    }

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: b */
    public View mo99183b() {
        return this.f69449b;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        ImageView imageView = new ImageView(this.f69448a);
        this.f69449b = imageView;
        imageView.setOnClickListener(this.f69450c);
        this.f69449b.setImageResource(R.drawable.ud_icon_efficiency_outlined);
        return this.f69449b;
    }

    public C27798i(Context context, View.OnClickListener onClickListener) {
        this.f69448a = context;
        this.f69450c = onClickListener;
    }
}
