package com.ss.android.lark.chatsetting.impl.post;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.ui.flowlayout.AbstractC26225a;
import com.larksuite.framework.ui.flowlayout.FlowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListAdapter;", "Lcom/larksuite/framework/ui/flowlayout/TagAdapter;", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListAdapter$OnItemClickListener;", "list", "", "(Landroid/content/Context;Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListAdapter$OnItemClickListener;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getListener", "()Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListAdapter$OnItemClickListener;", "getView", "Landroid/view/View;", "parent", "Lcom/larksuite/framework/ui/flowlayout/FlowLayout;", "position", "", "t", "OnItemClickListener", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.g */
public final class PostWhiteListAdapter extends AbstractC26225a<PostWhiteListViewData> {

    /* renamed from: a */
    private final Context f90500a;

    /* renamed from: b */
    private final OnItemClickListener f90501b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListAdapter$OnItemClickListener;", "", "onAvatarClick", "", BottomDialog.f17198f, "", "onEditWhiteListClick", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.g$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo129167a();

        /* renamed from: a */
        void mo129168a(String str);
    }

    /* renamed from: d */
    public final OnItemClickListener mo129170d() {
        return this.f90501b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.g$c */
    public static final class View$OnClickListenerC35072c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PostWhiteListAdapter f90504a;

        View$OnClickListenerC35072c(PostWhiteListAdapter gVar) {
            this.f90504a = gVar;
        }

        public final void onClick(View view) {
            OnItemClickListener d = this.f90504a.mo129170d();
            if (d != null) {
                d.mo129167a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostWhiteListAdapter$getView$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.g$b */
    public static final class C35071b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ PostWhiteListAdapter f90502a;

        /* renamed from: b */
        final /* synthetic */ PostWhiteListViewData f90503b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            OnItemClickListener d = this.f90502a.mo129170d();
            if (d != null) {
                d.mo129168a(this.f90503b.mo129175c());
            }
        }

        C35071b(PostWhiteListAdapter gVar, PostWhiteListViewData hVar) {
            this.f90502a = gVar;
            this.f90503b = hVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostWhiteListAdapter(Context context, OnItemClickListener aVar, List<PostWhiteListViewData> list) {
        super(list);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f90500a = context;
        this.f90501b = aVar;
    }

    /* renamed from: a */
    public View mo93290a(FlowLayout flowLayout, int i, PostWhiteListViewData hVar) {
        Intrinsics.checkParameterIsNotNull(flowLayout, "parent");
        View inflate = LayoutInflater.from(flowLayout.getContext()).inflate(R.layout.white_list_item, (ViewGroup) flowLayout, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        PostWhiteListViewHolder iVar = new PostWhiteListViewHolder(inflate);
        PostWhiteListViewData hVar2 = (PostWhiteListViewData) mo93291a(i);
        int a = hVar2.mo129172a();
        if (a == 1) {
            AbstractC34461c a2 = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatSettingModule.getDependency()");
            a2.mo127279i().mo127409a(this.f90500a, hVar2.mo129174b(), hVar2.mo129175c(), iVar.mo129180a(), UIHelper.dp2px(32.0f), UIHelper.dp2px(32.0f));
            iVar.mo129180a().setOnClickListener(new C35071b(this, hVar2));
        } else if (a == 2) {
            iVar.mo129180a().setImageResource(R.drawable.chatsetting_ic_edit_white_list);
            iVar.itemView.setOnClickListener(new View$OnClickListenerC35072c(this));
        }
        return inflate;
    }
}
