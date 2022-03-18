package com.ss.android.vc.lark.message.meeting.cardview.attendee;

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
import com.ss.android.vc.common.p3083e.C60773o;

public class ParticipantListPtrLoadingHeader extends FrameLayout implements AbstractC58934a {

    /* renamed from: a */
    SpinKitView f153084a;

    /* renamed from: b */
    private C21325b f153085b;

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

    public ParticipantListPtrLoadingHeader(Context context) {
        this(context, null);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f153084a.setVisibility(8);
        this.f153085b.stop();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f153084a.setVisibility(0);
        this.f153085b.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo211393a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.default_white_ptr_loading, this);
        SpinKitView spinKitView = (SpinKitView) findViewById(R.id.spin_kit);
        this.f153084a = spinKitView;
        spinKitView.setColor(C60773o.m236126d(R.color.ud_B500));
        this.f153084a.setVisibility(8);
        C21325b bVar = new C21325b();
        this.f153085b = bVar;
        this.f153084a.setIndeterminateDrawable((AbstractC21312f) bVar);
        this.f153085b.stop();
    }

    public ParticipantListPtrLoadingHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ParticipantListPtrLoadingHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo211393a(context);
    }
}
