package com.bytedance.ee.bear.facade.common.empty;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;
import java.util.Locale;

public class EmptyView extends LinearLayout implements View.OnClickListener, AbstractC7697f {

    /* renamed from: a */
    private LinearLayout f20790a;

    /* renamed from: b */
    private SpaceEmptyState f20791b;

    /* renamed from: c */
    private Config f20792c;

    /* renamed from: d */
    private AbstractC7668a f20793d;

    /* renamed from: e */
    private View f20794e;

    /* renamed from: com.bytedance.ee.bear.facade.common.empty.EmptyView$a */
    public interface AbstractC7668a {
        void onFailedRetry();
    }

    public Config getConfig() {
        return this.f20792c;
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: a */
    public void mo30125a() {
        setVisibility(0);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: b */
    public void mo30128b() {
        setVisibility(4);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: c */
    public void mo30129c() {
        setIsLoadingView(true);
        this.f20792c.mo30146b().get(0).intValue();
        this.f20792c.mo30142a().get(0);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: d */
    public void mo30130d() {
        setIsLoadingView(false);
        this.f20791b.setImageRes(Integer.valueOf(this.f20792c.mo30146b().get(4).intValue()));
        this.f20791b.setDesc(this.f20792c.mo30142a().get(4));
        this.f20791b.setOnClickListener(null);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: e */
    public void mo30131e() {
        setIsLoadingView(false);
        this.f20791b.setImageRes(this.f20792c.mo30146b().get(99));
        this.f20791b.setDesc(this.f20792c.mo30142a().get(99));
        this.f20791b.setOnClickListener(this);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: g */
    public void mo30133g() {
        setIsLoadingView(false);
        this.f20791b.setImageRes(this.f20792c.mo30146b().get(5));
        this.f20791b.setDesc(this.f20792c.mo30142a().get(5));
        this.f20791b.setOnClickListener(null);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: h */
    public void mo30135h() {
        setIsLoadingView(false);
        this.f20791b.setImageRes(this.f20792c.mo30146b().get(7));
        this.f20791b.setDesc(this.f20792c.mo30142a().get(7));
        this.f20791b.setOnClickListener(this);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: i */
    public void mo30136i() {
        setIsLoadingView(false);
        this.f20791b.setImageRes(this.f20792c.mo30146b().get(9));
        this.f20791b.setDesc(this.f20792c.mo30142a().get(9));
        this.f20791b.setOnClickListener(this);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: j */
    public void mo30137j() {
        setIsLoadingView(false);
        this.f20791b.setImageRes(this.f20792c.mo30146b().get(10));
        this.f20791b.setDesc(this.f20792c.mo30142a().get(10));
        this.f20791b.setOnClickListener(this);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: f */
    public void mo30132f() {
        setIsLoadingView(false);
        int intValue = this.f20792c.mo30146b().get(1).intValue();
        CharSequence charSequence = this.f20792c.mo30142a().get(1);
        if (charSequence.toString().equals(getResources().getString(R.string.Doc_Facade_EmptyFolderTip)) && TextUtils.equals(this.f20792c.mo30150d(), Locale.CHINESE.getLanguage())) {
            StringBuilder sb = new StringBuilder(charSequence);
            sb.insert(charSequence.length() / 2, "\n");
            charSequence = sb.toString();
        }
        this.f20791b.setImageRes(Integer.valueOf(intValue));
        this.f20791b.setDesc(charSequence);
        this.f20791b.setOnClickListener(null);
        this.f20791b.setClickable(false);
    }

    public void setOnRetryListener(AbstractC7668a aVar) {
        this.f20793d = aVar;
    }

    public EmptyView(Context context) {
        super(context);
        m30738a(context, (AttributeSet) null);
    }

    public void onClick(View view) {
        AbstractC7668a aVar = this.f20793d;
        if (aVar != null) {
            aVar.onFailedRetry();
        }
    }

    public void setConfig(Config aVar) {
        mo30126a(aVar, (ViewGroup.LayoutParams) null);
    }

    public void setLoadViewMarginTop(int i) {
        if (this.f20794e == null) {
            this.f20794e = findViewById(R.id.lark_loading_view);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20794e.getLayoutParams();
        layoutParams.topMargin = i;
        this.f20794e.setLayoutParams(layoutParams);
    }

    private void setIsLoadingView(boolean z) {
        int i;
        int i2;
        LinearLayout linearLayout = this.f20790a;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        SpaceEmptyState spaceEmptyState = this.f20791b;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        spaceEmptyState.setVisibility(i2);
        View imageView = this.f20791b.getImageView();
        if (z) {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        this.f20791b.mo90951c(!z);
    }

    @Override // com.bytedance.ee.bear.facade.common.empty.AbstractC7697f
    /* renamed from: a */
    public void mo30127a(Throwable th) {
        setIsLoadingView(false);
        this.f20791b.setImageRes(this.f20792c.mo30146b().get(3));
        this.f20791b.setDesc(this.f20792c.mo30142a().get(3));
        this.f20791b.setOnClickListener(this);
    }

    public EmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30738a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo30126a(Config aVar, ViewGroup.LayoutParams layoutParams) {
        this.f20792c = aVar;
        int c = aVar.mo30148c();
        if (c > 0) {
            this.f20790a.removeAllViews();
            View inflate = LayoutInflater.from(getContext()).inflate(c, (ViewGroup) null);
            if (layoutParams != null) {
                this.f20790a.addView(inflate, layoutParams);
            } else {
                this.f20790a.addView(inflate);
            }
        }
    }

    /* renamed from: a */
    private void m30738a(Context context, AttributeSet attributeSet) {
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.content});
            i = obtainStyledAttributes.getResourceId(0, R.layout.facade_common_empty);
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(context).inflate(i, this);
        this.f20790a = (LinearLayout) findViewById(R.id.ll_loading);
        this.f20791b = (SpaceEmptyState) findViewById(R.id.facade_no_data_empty_state);
        this.f20792c = new DefaultConfig(context).mo30154a().invoke();
    }

    public EmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30738a(context, attributeSet);
    }
}
