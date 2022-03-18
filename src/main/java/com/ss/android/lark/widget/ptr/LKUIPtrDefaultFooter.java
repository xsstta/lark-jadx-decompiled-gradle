package com.ss.android.lark.widget.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;

public class LKUIPtrDefaultFooter extends FrameLayout implements AbstractC58934a {

    /* renamed from: a */
    protected RotateAnimation f145909a;

    /* renamed from: b */
    protected RotateAnimation f145910b;

    /* renamed from: c */
    private int f145911c = 150;

    /* renamed from: d */
    private View f145912d;

    /* renamed from: e */
    private View f145913e;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: b */
    private void m228696b() {
        m228697c();
        this.f145913e.setVisibility(4);
    }

    /* renamed from: c */
    private void m228697c() {
        this.f145912d.clearAnimation();
        this.f145912d.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo199801a() {
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f145909a = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f145909a.setDuration((long) this.f145911c);
        this.f145909a.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, BitmapDescriptorFactory.HUE_RED, 1, 0.5f, 1, 0.5f);
        this.f145910b = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.f145910b.setDuration((long) this.f145911c);
        this.f145910b.setFillAfter(true);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m228696b();
    }

    public void setLastUpdateTimeKey(String str) {
        if (TextUtils.isEmpty(str)) {
        }
    }

    public LKUIPtrDefaultFooter(Context context) {
        super(context);
        mo199802a((AttributeSet) null);
    }

    public void setRotateAniTime(int i) {
        if (i != this.f145911c && i != 0) {
            this.f145911c = i;
            mo199801a();
        }
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f145913e.setVisibility(4);
        this.f145912d.setVisibility(0);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m228697c();
        this.f145913e.setVisibility(0);
    }

    public void setLastUpdateTimeRelateObject(Object obj) {
        setLastUpdateTimeKey(obj.getClass().getName() + "footer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo199802a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.lkui_ptr_rotate_ani_time}, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f145911c = obtainStyledAttributes.getInt(0, this.f145911c);
        }
        mo199801a();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.lkui_ptr_classic_default_footer, this);
        this.f145912d = inflate.findViewById(R.id.ptr_classic_header_rotate_view);
        this.f145913e = inflate.findViewById(R.id.ptr_classic_header_rotate_view_progressbar);
        m228696b();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        if (!z) {
            m228697c();
            this.f145913e.setVisibility(4);
        }
    }

    public LKUIPtrDefaultFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo199802a(attributeSet);
    }

    public LKUIPtrDefaultFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo199802a(attributeSet);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166239a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z, byte b, C58935a aVar) {
        View view;
        View view2;
        int offsetToRefresh = lKUIPtrFrameLayout.getOffsetToRefresh();
        int m = aVar.mo199922m();
        int l = aVar.mo199921l();
        if (m >= offsetToRefresh || l < offsetToRefresh) {
            if (m > offsetToRefresh && l <= offsetToRefresh && z && b == 2 && (view = this.f145912d) != null) {
                view.clearAnimation();
                this.f145912d.startAnimation(this.f145909a);
            }
        } else if (z && b == 2 && (view2 = this.f145912d) != null) {
            view2.clearAnimation();
            this.f145912d.startAnimation(this.f145910b);
        }
    }
}
