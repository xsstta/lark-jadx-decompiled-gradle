package com.ss.android.lark.member_manage.impl.change_owner;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.change_owner.AbstractC45117h;
import com.ss.android.lark.member_manage.impl.statistics.GroupMemberManageHitPointNew;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.change_owner.f */
public class C45110f extends BaseGroupMemberManageView<IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a, AbstractC45113a> implements AbstractC45117h.AbstractC45119b {

    /* renamed from: j */
    private IGroupMemberManageModuleDependency.AbstractC44882e f114222j = GroupMemberManageModule.m177902a().getChatterNameDependency();

    /* renamed from: k */
    private boolean f114223k;

    /* renamed from: l */
    private Context f114224l;

    /* renamed from: com.ss.android.lark.member_manage.impl.change_owner.f$a */
    public interface AbstractC45113a extends BaseGroupMemberManageView.AbstractC45064a {
        /* renamed from: b */
        void mo159582b(Chatter chatter);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: d */
    public int mo159409d() {
        return 5;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: b */
    public void mo159400b() {
        int i;
        this.mConfirmBT.setVisibility(4);
        if (this.f114223k) {
            i = R.string.Lark_Groups_GroupSettingTransferOwnership;
        } else {
            i = R.string.Lark_Legacy_ChangeOwner;
        }
        this.mBottomDetailRL.setVisibility(8);
        this.mTitleBar.setTitle(UIHelper.getString(i));
        mo159387a(R.string.Lark_Legacy_ConfirmTip, R.color.primary_pri_500);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.change_owner.C45110f.View$OnClickListenerC451111 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(C45110f.this.mo159414h());
                ((AbstractC45113a) C45110f.this.f114082g).mo159423a();
            }
        });
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        }
        this.f114076a.setVisibility(8);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159447a(Chat chat) {
        this.f114081f = chat;
        mo159385a();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159448b(List<C45084c> list) {
        this.mSelectAvatarsView.setVisibility(8);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: d */
    public void mo159449d(SelectBeansResult dVar) {
        b_(dVar);
        a_(dVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: a */
    public void mo159397a(Map<String, C45084c> map) {
        this.mSelectAvatarsView.setVisibility(8);
    }

    @Override // com.ss.android.lark.member_manage.impl.change_owner.AbstractC45117h.AbstractC45119b
    /* renamed from: b */
    public void mo159591b(final Chatter chatter) {
        String str;
        int i;
        int i2;
        if (this.f114223k) {
            i2 = R.string.Lark_Groups_AssignNewOwnerTitle;
            i = R.string.Lark_Groups_AssignNewCircleOwnerDialogContentMobile;
            str = "user_name";
        } else {
            i2 = R.string.Lark_Legacy_ChangeOwner;
            i = R.string.Lark_Legacy_ChatGroupInfoTransferSure;
            str = "group_owner";
        }
        new C25639g(mo159414h()).mo89248g(i2).mo89238b(true).mo89242c(UIHelper.mustacheFormat(i, str, this.f114222j.mo143789a(chatter))).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmInfo, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.change_owner.C45110f.DialogInterface$OnClickListenerC451122 */

            public void onClick(DialogInterface dialogInterface, int i) {
                GroupMemberManageHitPointNew.m179750c();
                dialogInterface.dismiss();
                ((AbstractC45113a) C45110f.this.f114082g).mo159582b(chatter);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89239c();
    }

    public C45110f(Activity activity, AbstractC45113a aVar, boolean z) {
        super(activity, aVar);
        this.f114223k = z;
        this.f114224l = activity;
    }
}
