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

public class LKUIPtrDefaultHeader extends FrameLayout implements AbstractC58934a {

    /* renamed from: a */
    protected RotateAnimation f145914a;

    /* renamed from: b */
    protected RotateAnimation f145915b;

    /* renamed from: c */
    private int f145916c = 150;

    /* renamed from: d */
    private View f145917d;

    /* renamed from: e */
    private View f145918e;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: b */
    private void m228705b() {
        m228706c();
        this.f145918e.setVisibility(4);
    }

    /* renamed from: c */
    private void m228706c() {
        this.f145917d.clearAnimation();
        this.f145917d.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo199807a() {
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f145914a = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f145914a.setDuration((long) this.f145916c);
        this.f145914a.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, BitmapDescriptorFactory.HUE_RED, 1, 0.5f, 1, 0.5f);
        this.f145915b = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.f145915b.setDuration((long) this.f145916c);
        this.f145915b.setFillAfter(true);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m228705b();
    }

    public void setLastUpdateTimeKey(String str) {
        if (TextUtils.isEmpty(str)) {
        }
    }

    public LKUIPtrDefaultHeader(Context context) {
        super(context);
        mo199808a((AttributeSet) null);
    }

    public void setRotateAniTime(int i) {
        if (i != this.f145916c && i != 0) {
            this.f145916c = i;
            mo199807a();
        }
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f145918e.setVisibility(4);
        this.f145917d.setVisibility(0);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m228706c();
        this.f145918e.setVisibility(0);
    }

    public void setLastUpdateTimeRelateObject(Object obj) {
        setLastUpdateTimeKey(obj.getClass().getName() + "header");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo199808a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.lkui_ptr_rotate_ani_time}, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f145916c = obtainStyledAttributes.getInt(0, this.f145916c);
        }
        mo199807a();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.lkui_ptr_classic_default_header, this);
        this.f145917d = inflate.findViewById(R.id.ptr_classic_header_rotate_view);
        this.f145918e = inflate.findViewById(R.id.ptr_classic_header_rotate_view_progressbar);
        m228705b();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        if (z) {
            m228706c();
            this.f145918e.setVisibility(4);
        }
    }

    public LKUIPtrDefaultHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo199808a(attributeSet);
    }

    public LKUIPtrDefaultHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo199808a(attributeSet);
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
            if (m > offsetToRefresh && l <= offsetToRefresh && z && b == 2 && (view = this.f145917d) != null) {
                view.clearAnimation();
                this.f145917d.startAnimation(this.f145914a);
            }
        } else if (z && b == 2 && (view2 = this.f145917d) != null) {
            view2.clearAnimation();
            this.f145917d.startAnimation(this.f145915b);
        }
    }
}
