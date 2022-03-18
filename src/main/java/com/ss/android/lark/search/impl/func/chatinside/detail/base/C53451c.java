package com.ss.android.lark.search.impl.func.chatinside.detail.base;

import android.view.View;
import butterknife.ButterKnife;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.detail.C53416a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.c */
public class C53451c implements BaseChatInsideSearchView.AbstractC53442a {

    /* renamed from: a */
    protected View f132087a;

    /* renamed from: b */
    protected BaseFragment f132088b;

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.AbstractC53442a
    /* renamed from: a */
    public void mo182500a(BaseChatInsideSearchView baseChatInsideSearchView) {
        ButterKnife.bind(baseChatInsideSearchView, this.f132087a);
    }

    public C53451c(BaseFragment baseFragment, View view) {
        this.f132088b = baseFragment;
        this.f132087a = view;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.AbstractC53442a
    /* renamed from: b */
    public void mo182502b(String str, int i) {
        C53258a.m205939a().mo181756f().mo181782a(str, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.AbstractC53442a
    /* renamed from: a */
    public void mo182501a(String str, int i) {
        C53258a.m205939a().mo181756f().mo181784a(str, C53416a.class.getName(), i);
    }
}
