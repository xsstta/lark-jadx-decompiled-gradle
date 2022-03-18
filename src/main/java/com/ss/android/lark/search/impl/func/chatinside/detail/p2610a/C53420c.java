package com.ss.android.lark.search.impl.func.chatinside.detail.p2610a;

import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.a.c */
public class C53420c extends BaseChatInsideSearchView implements AbstractC53426h {

    /* renamed from: d */
    private AbstractC53421a f132034d;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.a.c$a */
    public interface AbstractC53421a extends BaseChatInsideSearchView.AbstractC53442a {
        /* renamed from: a */
        void mo182471a(SearchBaseInfo searchBaseInfo, boolean z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView
    /* renamed from: a */
    public void mo182467a() {
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f132034d = null;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView
    /* renamed from: d */
    public void mo182470d() {
        super.mo182470d();
        this.mDefaultIV.setImageResource(R.drawable.illustration_placeholder_common_no_file);
    }

    /* renamed from: a */
    public void mo182468a(FileContent fileContent) {
        this.mSearchResultView.mo184610a(fileContent);
    }

    public C53420c(BaseFragment baseFragment, AbstractC53421a aVar) {
        super(baseFragment, aVar);
        this.f132034d = aVar;
    }

    /* renamed from: a */
    public void mo182469a(SearchBaseInfo searchBaseInfo, boolean z) {
        AbstractC53421a aVar = this.f132034d;
        if (aVar != null) {
            aVar.mo182471a(searchBaseInfo, z);
        }
    }
}
