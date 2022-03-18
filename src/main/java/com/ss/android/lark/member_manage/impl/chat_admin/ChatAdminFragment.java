package com.ss.android.lark.member_manage.impl.chat_admin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.member_manage.impl.base.mvp.C45081c;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.chat_admin.ChatAdminView;
import com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.AddChatAdminActivity;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "presenter", "Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminPresenter;", "viewDependency", "Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$ViewDependency;", "getViewDependency", "()Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$ViewDependency;", "viewDependency$delegate", "Lkotlin/Lazy;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "ViewDependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.a */
public final class ChatAdminFragment extends BaseFragment {

    /* renamed from: a */
    private ChatAdminPresenter f114232a;

    /* renamed from: b */
    private final Lazy f114233b = LazyKt.lazy(new C45120b(this));

    /* renamed from: c */
    private HashMap f114234c;

    /* renamed from: b */
    private final ChatAdminView.ViewDependency m179031b() {
        return (ChatAdminView.ViewDependency) this.f114233b.getValue();
    }

    /* renamed from: a */
    public void mo159603a() {
        HashMap hashMap = this.f114234c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo159603a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminFragment$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseViewDependency;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$ViewDependency;", "activity", "Landroid/app/Activity;", "(Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminFragment;Landroid/app/Activity;)V", "finishActivity", "", "finishActivityForChangeChatAdmin", "goAddChatAdminActivity", "chatId", "", "injectView", "selectMemberView", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.a$a */
    public final class ViewDependency extends C45081c implements ChatAdminView.ViewDependency {
        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159423a() {
            ChatAdminFragment.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: b */
        public void mo159432b() {
            ChatAdminFragment.this.setResult(-1);
            ChatAdminFragment.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a, com.ss.android.lark.member_manage.impl.base.mvp.C45081c
        /* renamed from: a */
        public void mo159429a(IGroupMemberBaseContract.AbstractC45066b<?> bVar) {
            View view;
            if (bVar != null && (view = ChatAdminFragment.this.getView()) != null) {
                ButterKnife.bind(bVar, view);
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.chat_admin.ChatAdminView.ViewDependency
        /* renamed from: b */
        public void mo159604b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intent intent = new Intent(ChatAdminFragment.this.getActivity(), AddChatAdminActivity.class);
            intent.putExtra("key_chat_id", str);
            ChatAdminFragment.this.startActivityForResult(intent, 1003);
        }

        public ViewDependency(Activity activity) {
            super(activity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminFragment$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.a$b */
    static final class C45120b extends Lambda implements Function0<ViewDependency> {
        final /* synthetic */ ChatAdminFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45120b(ChatAdminFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewDependency invoke() {
            ChatAdminFragment aVar = this.this$0;
            return new ViewDependency(aVar.getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ChatAdminPresenter dVar = this.f114232a;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: c */
    private final void m179032c() {
        ChatAdminModel cVar = new ChatAdminModel();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        ChatAdminModel cVar2 = cVar;
        ChatAdminView eVar = new ChatAdminView(requireActivity, m179031b());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
            Intrinsics.checkExpressionValueIsNotNull(arguments, "Bundle.EMPTY");
        }
        ChatAdminPresenter dVar = new ChatAdminPresenter(cVar2, eVar, arguments);
        this.f114232a = dVar;
        if (dVar != null) {
            dVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m179032c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        ChatAdminPresenter dVar;
        super.onActivityResult(i, i2, intent);
        if (i == 1003 && i2 == -1 && (dVar = this.f114232a) != null) {
            dVar.mo159634b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_show_group_member, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…member, container, false)");
        return inflate;
    }
}
