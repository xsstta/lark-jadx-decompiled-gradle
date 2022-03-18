package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;

public class CommonPickInput extends BaseContactInput {

    /* renamed from: b */
    private StatefulInputBgDrawable f164343b;
    @BindView(6353)
    public TextView mContentInput;
    @BindView(6935)
    View mDivider;

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput
    public String getContent() {
        return this.mContentInput.getText().toString();
    }

    /* renamed from: d */
    private void m256166d() {
        this.f164343b = new StatefulInputBgDrawable(getContext());
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.signin_sdk_widget_common_picker, this));
        this.mDivider.setBackground(this.f164343b);
        this.mContentInput.setTypeface(Typeface.defaultFromStyle(0));
    }

    public CommonPickInput(Context context) {
        super(context);
        m256166d();
    }

    public void setInputHint(String str) {
        this.mContentInput.setHint(str);
    }

    public void setInputText(String str) {
        this.mContentInput.setText(str);
    }

    public void setInputType(int i) {
        this.mContentInput.setInputType(i);
    }

    /* renamed from: a */
    public void mo224543a(boolean z) {
        if (z) {
            this.f164343b.mo171827b();
        } else {
            this.f164343b.mo171824a();
        }
    }

    public CommonPickInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m256166d();
    }

    public CommonPickInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m256166d();
    }
}
