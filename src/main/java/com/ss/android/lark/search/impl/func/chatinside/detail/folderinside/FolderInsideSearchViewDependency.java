package com.ss.android.lark.search.impl.func.chatinside.detail.folderinside;

import android.view.View;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.FolderInsideSearchFileView;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53423e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchViewDependency;", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/file/ChatInsideSearchFileViewDependency;", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchFileView$IViewDependency;", "fragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "rootView", "Landroid/view/View;", "(Lcom/ss/android/lark/base/fragment/BaseFragment;Landroid/view/View;)V", "backToLastPage", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.b */
public final class FolderInsideSearchViewDependency extends C53423e implements FolderInsideSearchFileView.IViewDependency {
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.FolderInsideSearchFileView.IViewDependency
    /* renamed from: a */
    public void mo182612a() {
        this.f132088b.finish();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderInsideSearchViewDependency(BaseFragment baseFragment, View view) {
        super(baseFragment, view);
        Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
    }
}
