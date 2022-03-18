package com.ss.android.lark.search.impl.func.chatinside.detail.p2611b;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.b.b */
public class C53430b extends BaseChatInsideSearchView implements AbstractC53435f {

    /* renamed from: d */
    private AbstractC53431a f132040d;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.b.b$a */
    public interface AbstractC53431a extends BaseChatInsideSearchView.AbstractC53442a {
        /* renamed from: a */
        void mo182478a(Context context, String str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView
    /* renamed from: a */
    public void mo182467a() {
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f132040d = null;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView
    /* renamed from: d */
    public void mo182470d() {
        super.mo182470d();
        this.mDefaultIV.setImageResource(R.drawable.illustration_placeholder_common_no_link);
    }

    public C53430b(BaseFragment baseFragment, AbstractC53431a aVar) {
        super(baseFragment, aVar);
        this.f132040d = aVar;
    }

    /* renamed from: a */
    public void mo182477a(Context context, String str) {
        AbstractC53431a aVar = this.f132040d;
        if (aVar != null) {
            aVar.mo182478a(context, str);
        }
    }
}
