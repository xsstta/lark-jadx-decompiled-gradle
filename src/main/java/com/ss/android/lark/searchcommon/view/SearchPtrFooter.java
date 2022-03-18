package com.ss.android.lark.searchcommon.view;

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
import com.ss.android.lark.widget.ptr.AbstractC58934a;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;

public class SearchPtrFooter extends FrameLayout implements AbstractC58934a {

    /* renamed from: a */
    protected RotateAnimation f133444a;

    /* renamed from: b */
    protected RotateAnimation f133445b;

    /* renamed from: c */
    private int f133446c = 150;

    /* renamed from: d */
    private View f133447d;

    /* renamed from: e */
    private View f133448e;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: b */
    private void m209270b() {
        m209271c();
        this.f133448e.setVisibility(4);
    }

    /* renamed from: c */
    private void m209271c() {
        this.f133447d.clearAnimation();
        this.f133447d.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184603a() {
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f133444a = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f133444a.setDuration((long) this.f133446c);
        this.f133444a.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, BitmapDescriptorFactory.HUE_RED, 1, 0.5f, 1, 0.5f);
        this.f133445b = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.f133445b.setDuration((long) this.f133446c);
        this.f133445b.setFillAfter(true);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m209270b();
    }

    public void setLastUpdateTimeKey(String str) {
        if (TextUtils.isEmpty(str)) {
        }
    }

    public SearchPtrFooter(Context context) {
        super(context);
        mo184604a((AttributeSet) null);
    }

    public void setRotateAniTime(int i) {
        if (i != this.f133446c && i != 0) {
            this.f133446c = i;
            mo184603a();
        }
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        this.f133448e.setVisibility(4);
        this.f133447d.setVisibility(0);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m209271c();
        this.f133448e.setVisibility(0);
    }

    public void setLastUpdateTimeRelateObject(Object obj) {
        setLastUpdateTimeKey(obj.getClass().getName() + "footer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184604a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.lkui_ptr_rotate_ani_time}, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f133446c = obtainStyledAttributes.getInt(0, this.f133446c);
            obtainStyledAttributes.recycle();
        }
        mo184603a();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.search_ptr_footer, this);
        this.f133447d = inflate.findViewById(R.id.ptr_classic_header_rotate_view);
        this.f133448e = inflate.findViewById(R.id.ptr_classic_header_rotate_view_progressbar);
        m209270b();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        if (!z) {
            m209271c();
            this.f133448e.setVisibility(4);
        }
    }

    public SearchPtrFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo184604a(attributeSet);
    }

    public SearchPtrFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo184604a(attributeSet);
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
            if (m > offsetToRefresh && l <= offsetToRefresh && z && b == 2 && (view = this.f133447d) != null) {
                view.clearAnimation();
                this.f133447d.startAnimation(this.f133444a);
            }
        } else if (z && b == 2 && (view2 = this.f133447d) != null) {
            view2.clearAnimation();
            this.f133447d.startAnimation(this.f133445b);
        }
    }
}
