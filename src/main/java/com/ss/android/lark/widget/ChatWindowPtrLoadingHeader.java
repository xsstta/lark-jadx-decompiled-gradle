package com.ss.android.lark.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p969c.C21325b;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.AbstractC58934a;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;

public class ChatWindowPtrLoadingHeader extends FrameLayout implements AbstractC58934a {

    /* renamed from: a */
    SpinKitView f143336a;

    /* renamed from: b */
    private C21325b f143337b;

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166239a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z, byte b, C58935a aVar) {
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
    }

    public ChatWindowPtrLoadingHeader(Context context) {
        this(context, null);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f143336a.setVisibility(8);
        this.f143337b.stop();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f143336a.setVisibility(0);
        this.f143337b.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo197419a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.default_white_ptr_loading, this);
        SpinKitView spinKitView = (SpinKitView) findViewById(R.id.spin_kit);
        this.f143336a = spinKitView;
        spinKitView.setColor(getContext().getResources().getColor(R.color.lkui_N500));
        this.f143336a.setVisibility(8);
        C21325b bVar = new C21325b();
        this.f143337b = bVar;
        this.f143336a.setIndeterminateDrawable((AbstractC21312f) bVar);
        this.f143337b.stop();
    }

    public ChatWindowPtrLoadingHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatWindowPtrLoadingHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo197419a(context);
    }
}
