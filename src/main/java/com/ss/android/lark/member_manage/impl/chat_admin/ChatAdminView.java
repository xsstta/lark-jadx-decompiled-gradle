package com.ss.android.lark.member_manage.impl.chat_admin;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.chat_admin.IChatAdminContract;
import com.ss.android.lark.member_manage.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u000212B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ$\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0014J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0014J\u0012\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u0012H\u0002J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020#H\u0014J\u0018\u0010*\u001a\u00020\u00122\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u001e\u0010.\u001a\u00020\u00122\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0019\u0018\u000100H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageView;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView$Delegate;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dependency", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$ViewDependency;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getDependency", "()Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$ViewDependency;", "dialog", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "functionType", "", "closeForResult", "", "toAddUserIds", "", "", "toDelUserIds", "deleteChatAdmin", "item", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "getFuncType", "goAddChatAdminActivity", "initListeners", "initOnItemLongClickListener", "initTitle", "initView", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isKeepConfirm", "", "showChangeChatAdminMenu", "showMemberManageMenu", "showMembers", "dataList", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "showSelected", "showSelectedMembers", "selectedList", "", "switchToReduceChatAdmin", "updateSelectedRecyclerView", "selectedItems", "", "Companion", "ViewDependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e */
public final class ChatAdminView extends BaseGroupMemberManageView<IChatAdminContract.IView.Delegate, ViewDependency> implements IChatAdminContract.IView {

    /* renamed from: j */
    public static final Companion f114285j = new Companion(null);

    /* renamed from: k */
    private int f114286k = 2;

    /* renamed from: l */
    private DialogC25637f f114287l;

    /* renamed from: m */
    private final FragmentActivity f114288m;

    /* renamed from: n */
    private final ViewDependency f114289n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$ViewDependency;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageView$ViewDependency;", "goAddChatAdminActivity", "", "chatId", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$b */
    public interface ViewDependency extends BaseGroupMemberManageView.AbstractC45064a {
        /* renamed from: b */
        void mo159604b(String str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: a */
    public void mo159397a(Map<String, C45084c> map) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    public boolean aX_() {
        return false;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159448b(List<C45084c> list) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: j */
    public boolean mo159415j() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$Companion;", "", "()V", "DEFAULT_CONFIRM_BUTTON_COLOR", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: d */
    public int mo159409d() {
        return this.f114286k;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: e */
    public void mo159411e() {
        super.mo159411e();
        m179123n();
    }

    /* renamed from: n */
    private final void m179123n() {
        this.f114077b.mo159350a(new C45139e(this));
        this.f114078c.mo159350a(new C45140f(this));
    }

    /* renamed from: m */
    public void mo159644m() {
        String id = this.f114081f.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "mCurrentChat.getId()");
        ((ViewDependency) this.f114082g).mo159604b(id);
    }

    @Override // com.ss.android.lark.member_manage.impl.chat_admin.IChatAdminContract.IView
    /* renamed from: l */
    public void mo159643l() {
        this.f114286k = 1;
        this.f114079d.clear();
        this.f114077b.mo159358c(this.f114286k);
        this.f114078c.mo159358c(this.f114286k);
        ConstraintLayout constraintLayout = this.mBottomDetailRL;
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mBottomDetailRL");
        constraintLayout.setVisibility(0);
        mo159386a(0);
        this.mTitleBar.removeAllActions();
        mo159400b();
    }

    /* renamed from: k */
    public final void mo159572k() {
        DialogC25637f fVar = this.f114287l;
        if (fVar != null) {
            fVar.dismiss();
        }
        C25644o oVar = new C25644o(mo159414h());
        String string = UIHelper.getString(R.string.Lark_Legacy_Add);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Legacy_Add)");
        String string2 = UIHelper.getString(R.string.Lark_Legacy_Remove);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Lark_Legacy_Remove)");
        LKUIListItemData nVar = new LKUIListItemData(string2);
        nVar.mo89289b(R.color.function_danger_500);
        DialogC25637f b = ((C25644o) ((C25644o) ((C25644o) oVar.mo89205a(CollectionsKt.listOf((Object[]) new LKUIListItemData[]{new LKUIListItemData(string), nVar}))).mo89224a(R.id.lkui_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC45143i.f114297a)).mo89202a(new DialogInterface$OnClickListenerC45144j(this))).mo89233b();
        this.f114287l = b;
        if (b != null) {
            b.show();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: b */
    public void mo159400b() {
        int i = this.f114286k;
        if (i == 2) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_GroupAdminsTitle));
            FragmentActivity fragmentActivity = this.f114288m;
            Drawable iconDrawable = UDIconUtils.getIconDrawable(fragmentActivity, (int) R.drawable.ud_icon_more_outlined, UIUtils.getColor(fragmentActivity, R.color.icon_n1));
            this.mTitleBar.addAction(new C45141g(this, iconDrawable, iconDrawable));
            LinearLayout linearLayout = this.mSearchBarContainer;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mSearchBarContainer");
            linearLayout.setVisibility(8);
            ConstraintLayout constraintLayout = this.mBottomDetailRL;
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mBottomDetailRL");
            constraintLayout.setVisibility(8);
        } else if (i == 1) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_RemoveGroupAdmins));
            LinearLayout linearLayout2 = this.mSearchBarContainer;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mSearchBarContainer");
            linearLayout2.setVisibility(8);
            ConstraintLayout constraintLayout2 = this.mBottomDetailRL;
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "mBottomDetailRL");
            constraintLayout2.setVisibility(0);
            this.mTitleBar.setLeftClickListener(new View$OnClickListenerC45142h(this));
            mo159387a(R.string.Lark_Legacy_ConfirmInfo, -1);
            TextView textView = this.f114076a;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRightButtonView");
            textView.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$closeForResult$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$c */
    public static final class C45137c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ChatAdminView f114290a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45137c(ChatAdminView eVar) {
            this.f114290a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            LKUIToast.show(this.f114290a.mo159414h(), UIHelper.getString(R.string.Lark_Legacy_GroupAdminRemoved));
            ((ViewDependency) this.f114290a.f114082g).mo159432b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            LKUIToast.show(this.f114290a.mo159414h(), UIHelper.getString(R.string.Lark_Legacy_UnableToRemoveToast));
            Button button = this.f114290a.mConfirmBT;
            Intrinsics.checkExpressionValueIsNotNull(button, "mConfirmBT");
            button.setEnabled(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$deleteChatAdmin$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$d */
    public static final class C45138d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ChatAdminView f114291a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45138d(ChatAdminView eVar) {
            this.f114291a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo159646a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo159646a(boolean z) {
            LKUIToast.show(this.f114291a.mo159414h(), UIHelper.getString(R.string.Lark_Legacy_GroupAdminRemoved));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            LKUIToast.show(this.f114291a.mo159414h(), UIHelper.getString(R.string.Lark_Legacy_UnableToRemoveToast));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/ChatAdminView$initTitle$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$g */
    public static final class C45141g extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ ChatAdminView f114294a;

        /* renamed from: b */
        final /* synthetic */ Drawable f114295b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f114294a.mo159572k();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45141g(ChatAdminView eVar, Drawable drawable, Drawable drawable2) {
            super(drawable2);
            this.f114294a = eVar;
            this.f114295b = drawable;
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: d */
    public void mo159449d(SelectBeansResult dVar) {
        b_(dVar);
        a_(dVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "kotlin.jvm.PlatformType", "onItemLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$e */
    public static final class C45139e implements IFuncBinder.AbstractC45038a {

        /* renamed from: a */
        final /* synthetic */ ChatAdminView f114292a;

        C45139e(ChatAdminView eVar) {
            this.f114292a = eVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45038a
        public final void onItemLongClick(C45084c cVar) {
            ChatAdminView eVar = this.f114292a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "it");
            eVar.mo159640a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "kotlin.jvm.PlatformType", "onItemLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$f */
    public static final class C45140f implements IFuncBinder.AbstractC45038a {

        /* renamed from: a */
        final /* synthetic */ ChatAdminView f114293a;

        C45140f(ChatAdminView eVar) {
            this.f114293a = eVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45038a
        public final void onItemLongClick(C45084c cVar) {
            ChatAdminView eVar = this.f114293a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "it");
            eVar.mo159640a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$h */
    public static final class View$OnClickListenerC45142h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatAdminView f114296a;

        View$OnClickListenerC45142h(ChatAdminView eVar) {
            this.f114296a = eVar;
        }

        public final void onClick(View view) {
            ((ViewDependency) this.f114296a.f114082g).mo159423a();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159447a(Chat chat) {
        this.f114081f = chat;
        mo159385a();
        if (this.f114286k == 2) {
            GroupHitPoint.Companion aVar = GroupHitPoint.f114612b;
            Chat chat2 = this.f114081f;
            Intrinsics.checkExpressionValueIsNotNull(chat2, "mCurrentChat");
            aVar.mo159957b(chat2);
        }
    }

    /* renamed from: b */
    public final void mo159642b(C45084c cVar) {
        String h = cVar.mo159513h();
        Intrinsics.checkExpressionValueIsNotNull(h, "item.id");
        List<String> listOf = CollectionsKt.listOf(h);
        String id = this.f114081f.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "mCurrentChat.getId()");
        ((IChatAdminContract.IView.Delegate) this.f114080e).mo159635a(id, CollectionsKt.emptyList(), listOf, new C45138d(this));
    }

    /* renamed from: a */
    public final void mo159640a(C45084c cVar) {
        DialogC25637f fVar = this.f114287l;
        if (fVar != null) {
            fVar.dismiss();
        }
        if (this.f114286k == 2) {
            Chat chat = this.f114081f;
            Intrinsics.checkExpressionValueIsNotNull(chat, "mCurrentChat");
            String ownerId = chat.getOwnerId();
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            IGroupMemberManageModuleDependency.AbstractC44878a accountDependency = a.getAccountDependency();
            Intrinsics.checkExpressionValueIsNotNull(accountDependency, "GroupMemberManageModule.…dency().accountDependency");
            if (!(!Intrinsics.areEqual(ownerId, accountDependency.mo143795b()))) {
                C25644o oVar = new C25644o(mo159414h());
                String string = UIHelper.getString(R.string.Lark_Legacy_RemoveGroupAdmins);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Legacy_RemoveGroupAdmins)");
                LKUIListItemData nVar = new LKUIListItemData(string);
                nVar.mo89289b(R.color.function_danger_500);
                DialogC25637f b = ((C25644o) ((C25644o) ((C25644o) oVar.mo89205a(CollectionsKt.listOf(nVar))).mo89224a(R.id.lkui_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC45145k.f114299a)).mo89202a(new DialogInterface$OnClickListenerC45146l(this, cVar))).mo89233b();
                this.f114287l = b;
                if (b != null) {
                    b.show();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$i */
    public static final class DialogInterface$OnClickListenerC45143i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC45143i f114297a = new DialogInterface$OnClickListenerC45143i();

        DialogInterface$OnClickListenerC45143i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$k */
    public static final class DialogInterface$OnClickListenerC45145k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC45145k f114299a = new DialogInterface$OnClickListenerC45145k();

        DialogInterface$OnClickListenerC45145k() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$l */
    public static final class DialogInterface$OnClickListenerC45146l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatAdminView f114300a;

        /* renamed from: b */
        final /* synthetic */ C45084c f114301b;

        DialogInterface$OnClickListenerC45146l(ChatAdminView eVar, C45084c cVar) {
            this.f114300a = eVar;
            this.f114301b = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f114300a.mo159642b(this.f114301b);
                GroupHitPoint.Companion aVar = GroupHitPoint.f114612b;
                Chat chat = this.f114300a.f114081f;
                Intrinsics.checkExpressionValueIsNotNull(chat, "mCurrentChat");
                aVar.mo159953a(chat, GroupHitPoint.GroupMemberAction.DELETE_ADMIN, "none");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatAdminView(FragmentActivity fragmentActivity, ViewDependency bVar) {
        super(fragmentActivity, bVar);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f114288m = fragmentActivity;
        this.f114289n = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.e$j */
    public static final class DialogInterface$OnClickListenerC45144j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatAdminView f114298a;

        DialogInterface$OnClickListenerC45144j(ChatAdminView eVar) {
            this.f114298a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f114298a.mo159644m();
                GroupHitPoint.Companion aVar = GroupHitPoint.f114612b;
                Chat chat = this.f114298a.f114081f;
                Intrinsics.checkExpressionValueIsNotNull(chat, "mCurrentChat");
                aVar.mo159953a(chat, GroupHitPoint.GroupMemberAction.ASSIGN_ADMIN, "none");
            } else if (i == 1) {
                this.f114298a.mo159643l();
                GroupHitPoint.Companion aVar2 = GroupHitPoint.f114612b;
                Chat chat2 = this.f114298a.f114081f;
                Intrinsics.checkExpressionValueIsNotNull(chat2, "mCurrentChat");
                aVar2.mo159953a(chat2, GroupHitPoint.GroupMemberAction.DELETE_ADMIN, "none");
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.chat_admin.IChatAdminContract.IView
    /* renamed from: a */
    public void mo159641a(List<String> list, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(list, "toAddUserIds");
        Intrinsics.checkParameterIsNotNull(list2, "toDelUserIds");
        String id = this.f114081f.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "mCurrentChat.getId()");
        ((IChatAdminContract.IView.Delegate) this.f114080e).mo159635a(id, list, list2, new C45137c(this));
    }
}
