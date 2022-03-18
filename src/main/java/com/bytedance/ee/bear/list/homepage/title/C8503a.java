package com.bytedance.ee.bear.list.homepage.title;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.maincore.IFunctionButtonV2;

/* renamed from: com.bytedance.ee.bear.list.homepage.title.a */
public class C8503a implements IFunctionButtonV2 {

    /* renamed from: a */
    private ViewGroup f22990a;

    /* renamed from: b */
    private IFunctionButtonV2.C44541a f22991b;

    /* renamed from: c */
    private View.OnClickListener f22992c;

    @Override // com.ss.android.lark.maincore.IFunctionButtonV2
    /* renamed from: a */
    public IFunctionButtonV2.C44541a mo33238a() {
        return this.f22991b;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        return this.f22990a;
    }

    /* renamed from: a */
    public void mo33239a(View.OnClickListener onClickListener) {
        this.f22992c = onClickListener;
        this.f22990a.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void mo33240a(ViewGroup viewGroup) {
        this.f22990a = viewGroup;
    }
}
