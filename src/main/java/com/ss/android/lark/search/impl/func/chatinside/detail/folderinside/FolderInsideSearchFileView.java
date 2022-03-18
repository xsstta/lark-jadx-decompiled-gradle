package com.ss.android.lark.search.impl.func.chatinside.detail.folderinside;

import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53420c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0014R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchFileView;", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/file/ChatInsideSearchFileView;", "fragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "viewDependency", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchFileView$IViewDependency;", "(Lcom/ss/android/lark/base/fragment/BaseFragment;Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchFileView$IViewDependency;)V", "mCancelTv", "Landroid/widget/TextView;", "getMCancelTv", "()Landroid/widget/TextView;", "setMCancelTv", "(Landroid/widget/TextView;)V", "mViewDependency", "initSearchFilter", "", "IViewDependency", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FolderInsideSearchFileView extends C53420c {

    /* renamed from: d */
    public IViewDependency f132140d;
    @BindView(6728)
    public TextView mCancelTv;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchFileView$IViewDependency;", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/file/ChatInsideSearchFileView$ViewDependency;", "backToLastPage", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.FolderInsideSearchFileView$a */
    public interface IViewDependency extends C53420c.AbstractC53421a {
        /* renamed from: a */
        void mo182612a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView, com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53420c
    /* renamed from: a */
    public void mo182467a() {
        super.mo182467a();
        TextView textView = this.mCancelTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCancelTv");
        }
        textView.setOnClickListener(new View$OnClickListenerC53487b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.FolderInsideSearchFileView$b */
    static final class View$OnClickListenerC53487b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderInsideSearchFileView f132141a;

        View$OnClickListenerC53487b(FolderInsideSearchFileView folderInsideSearchFileView) {
            this.f132141a = folderInsideSearchFileView;
        }

        public final void onClick(View view) {
            IViewDependency aVar = this.f132141a.f132140d;
            if (aVar != null) {
                aVar.mo182612a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderInsideSearchFileView(BaseFragment baseFragment, IViewDependency aVar) {
        super(baseFragment, aVar);
        Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        this.f132140d = aVar;
    }
}
