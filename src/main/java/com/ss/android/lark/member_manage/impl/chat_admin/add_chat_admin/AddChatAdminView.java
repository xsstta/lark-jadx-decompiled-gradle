package com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.IAddChatAdminContract;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002&'B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ$\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0014J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u000e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0016J\u001e\u0010#\u001a\u00020\u000e2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"\u0018\u00010%H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006("}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageView;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IView$Delegate;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dependency", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$ViewDependency;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getDependency", "()Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$ViewDependency;", "closeForResult", "", "toAddUserIds", "", "", "toDelUserIds", "getFuncType", "", "initConfirmButton", "initTitle", "initView", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isKeepConfirm", "", "showMembers", "dataList", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "showSelectedMembers", "selectedList", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "updateSelectedRecyclerView", "selectedItems", "", "Companion", "ViewDependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.f */
public final class AddChatAdminView extends BaseGroupMemberManageView<IAddChatAdminContract.IView.Delegate, ViewDependency> implements IAddChatAdminContract.IView {

    /* renamed from: j */
    public static final Companion f114258j = new Companion(null);

    /* renamed from: k */
    private final FragmentActivity f114259k;

    /* renamed from: l */
    private final ViewDependency f114260l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageView$ViewDependency;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.f$b */
    public interface ViewDependency extends BaseGroupMemberManageView.AbstractC45064a {
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159448b(List<C45084c> list) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: d */
    public int mo159409d() {
        return 10;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: j */
    public boolean mo159415j() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$Companion;", "", "()V", "DEFAULT_CONFIRM_BUTTON_COLOR", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: k */
    private final void m179087k() {
        Button button = this.mConfirmBT;
        Intrinsics.checkExpressionValueIsNotNull(button, "mConfirmBT");
        button.setEnabled(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: b */
    public void mo159400b() {
        this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_AddGroupAdmins));
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        this.mTitleBar.setLeftClickListener(new View$OnClickListenerC45129d(this));
        mo159387a(R.string.Lark_Legacy_ConfirmInfo, -1);
        TextView textView = this.f114076a;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRightButtonView");
        textView.setVisibility(8);
        ConstraintLayout constraintLayout = this.mBottomDetailRL;
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mBottomDetailRL");
        constraintLayout.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminView$closeForResult$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.f$c */
    public static final class C45128c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddChatAdminView f114261a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45128c(AddChatAdminView fVar) {
            this.f114261a = fVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            LKUIToast.show(this.f114261a.mo159414h(), UIHelper.getString(R.string.Lark_Legacy_GroupAdminAdded));
            ((ViewDependency) this.f114261a.f114082g).mo159432b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            LKUIToast.show(this.f114261a.mo159414h(), UIHelper.getString(R.string.Lark_Legacy_GroupAdminAddFailedToast));
            Button button = this.f114261a.mConfirmBT;
            Intrinsics.checkExpressionValueIsNotNull(button, "mConfirmBT");
            button.setEnabled(true);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: d */
    public void mo159449d(SelectBeansResult dVar) {
        b_(dVar);
        a_(dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.f$d */
    static final class View$OnClickListenerC45129d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddChatAdminView f114262a;

        View$OnClickListenerC45129d(AddChatAdminView fVar) {
            this.f114262a = fVar;
        }

        public final void onClick(View view) {
            ((ViewDependency) this.f114262a.f114082g).mo159423a();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159447a(Chat chat) {
        this.f114081f = chat;
        mo159385a();
        m179087k();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: a */
    public void mo159397a(Map<String, C45084c> map) {
        boolean z;
        mo159403b(map);
        Button button = this.mConfirmBT;
        Intrinsics.checkExpressionValueIsNotNull(button, "mConfirmBT");
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        button.setEnabled(!z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddChatAdminView(FragmentActivity fragmentActivity, ViewDependency bVar) {
        super(fragmentActivity, bVar);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f114259k = fragmentActivity;
        this.f114260l = bVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.IAddChatAdminContract.IView
    /* renamed from: a */
    public void mo159626a(List<String> list, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(list, "toAddUserIds");
        Intrinsics.checkParameterIsNotNull(list2, "toDelUserIds");
        String id = this.f114081f.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "mCurrentChat.getId()");
        ((IAddChatAdminContract.IView.Delegate) this.f114080e).mo159621a(id, list, list2, new C45128c(this));
    }
}
