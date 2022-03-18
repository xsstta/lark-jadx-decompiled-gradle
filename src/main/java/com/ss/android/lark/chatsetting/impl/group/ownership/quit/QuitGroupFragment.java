package com.ss.android.lark.chatsetting.impl.group.ownership.quit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ChatStatisticUtil;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.p1693a.C34457a;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collections;

public class QuitGroupFragment extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    AbstractC34461c.AbstractC34466e f89831a = ChatSettingModule.m133639a().mo127274d();
    @BindView(6443)
    SelectableRoundedImageView avatorIv;

    /* renamed from: b */
    AbstractC34461c.AbstractC34476o f89832b = ChatSettingModule.m133639a().mo127277g();

    /* renamed from: c */
    public Chat f89833c;
    @BindView(6513)
    TextView changeBtn;

    /* renamed from: d */
    public Context f89834d = null;

    /* renamed from: e */
    protected CallbackManager f89835e = new CallbackManager();

    /* renamed from: f */
    private boolean f89836f;

    /* renamed from: g */
    private boolean f89837g;
    @BindView(6769)
    TextView groupNameTv;
    @BindView(7600)
    CommonTitleBar mCommonTitleBar;
    @BindView(7275)
    TextView quitBtn;
    @BindView(7672)
    TextView quitDescTv;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f89835e.cancelCallbacks();
    }

    /* renamed from: a */
    public void mo128390a() {
        if (this.f89833c != null) {
            GroupHitPoint.f90519a.mo129260m(this.f89833c);
            C34457a.m133685a().mo127255b(this.f89833c.getId(), true);
            this.f89831a.mo127337a(this.f89833c.getId(), Collections.singleton(this.f89832b.mo127412a()), this.f89835e.wrapAndAddGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.quit.QuitGroupFragment.C347904 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    ChatStatisticUtil.m136663d(QuitGroupFragment.this.f89833c);
                    QuitGroupFragment.this.finish();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    String displayMsg = errorResult.getDisplayMsg();
                    if (TextUtils.isEmpty(displayMsg)) {
                        displayMsg = QuitGroupFragment.this.f89834d.getString(R.string.Lark_Legacy_Groupfailed);
                    }
                    LKUIToast.show(QuitGroupFragment.this.f89834d, displayMsg);
                    C34457a.m133685a().mo127255b(QuitGroupFragment.this.f89833c.getId(), false);
                }
            }));
        }
    }

    /* renamed from: b */
    private void m135223b() {
        this.mCommonTitleBar.setTitle(R.string.Lark_Legacy_QuitGroupNow);
        ChatSettingModule.m133639a().mo127279i().mo127409a(this.f89834d, this.f89833c.getAvatarKey(), this.f89833c.getId(), this.avatorIv, UIHelper.dp2px(60.0f), UIHelper.dp2px(60.0f));
        this.groupNameTv.setText(this.f89833c.getName());
        this.quitBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.quit.QuitGroupFragment.View$OnClickListenerC347871 */

            public void onClick(View view) {
                ChatSettingHitPointNew.m136652m(ChatSettingExtraParams.Click.CONFIRM.plus(TARGET_NONE.f135700a));
                QuitGroupFragment.this.mo128390a();
            }
        });
        this.mCommonTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.quit.QuitGroupFragment.View$OnClickListenerC347882 */

            public void onClick(View view) {
                QuitGroupFragment.this.finish();
            }
        });
        if (DesktopUtil.m144307b()) {
            this.mCommonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        }
        this.changeBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.quit.QuitGroupFragment.View$OnClickListenerC347893 */

            public void onClick(View view) {
                if (QuitGroupFragment.this.f89833c.getUserCount() <= 1) {
                    new C25639g(QuitGroupFragment.this.f89834d).mo89248g(R.string.Lark_Legacy_ChangeOwner).mo89238b(true).mo89254m(R.string.Lark_Legacy_ChatGroupInfoTransferOnlyownerContent).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmInfo, (DialogInterface.OnClickListener) null).mo89233b().show();
                    return;
                }
                OwnershipHitPoint.f90525a.mo129286a("exit_group", QuitGroupFragment.this.f89833c.getId());
                AbstractC34461c.AbstractC34473l k = ChatSettingModule.m133639a().mo127281k();
                QuitGroupFragment quitGroupFragment = QuitGroupFragment.this;
                k.mo127406a(quitGroupFragment, quitGroupFragment.f89833c.getId(), (int) CommonCode.StatusCode.API_CLIENT_EXPIRED, QuitGroupFragment.this.f89833c.isThread());
                ChatSettingHitPointNew.m136652m(ChatSettingExtraParams.Click.TRANSFER_GROUP_OWNER.plus(TARGET_NONE.f135700a));
            }
        });
        if (this.f89837g) {
            if (this.f89836f) {
                this.quitDescTv.setText(R.string.Lark_Legacy_ChatGroupInfoExitMeetingNotifyOrganizer);
            } else {
                this.quitDescTv.setText(R.string.Lark_Legacy_ChatGroupInfoExitMeetingNotify);
            }
        } else if (this.f89833c.isThread()) {
            this.mCommonTitleBar.setTitle(R.string.Lark_Groups_LeaveCircleDialogTitle);
            this.quitDescTv.setText(R.string.Lark_Groups_LeaveCircleDialogContent);
            this.quitBtn.setText(R.string.Lark_Groups_LeaveCircleDialogLeaveButton);
            this.changeBtn.setText(R.string.Lark_Groups_LeaveCircleDialogAssignNewOwnerButton);
        }
        ChatSettingHitPointNew.m136647k();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f89834d = getContext();
        if (getView() == null || getArguments() == null) {
            finish();
            return;
        }
        ButterKnife.bind(this, getView());
        Chat chat = (Chat) getArguments().getSerializable("key_group_management_chat");
        this.f89833c = chat;
        boolean isMeeting = chat.isMeeting();
        this.f89837g = isMeeting;
        if (isMeeting) {
            this.f89836f = getArguments().getBoolean("isOrganizer");
        }
        m135223b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_quit_group, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1) {
            C34457a.m133685a().mo127255b(this.f89833c.getId(), true);
            this.f89831a.mo127341a(this.f89833c.getId(), ((Chatter) intent.getSerializableExtra("key_group_new_owner")).getId(), Collections.singleton(this.f89832b.mo127412a()), this.f89835e.wrapAndAddGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.quit.QuitGroupFragment.C347915 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    ChatStatisticUtil.m136658a(chat, "chat_exit");
                    QuitGroupFragment.this.finish();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.show(QuitGroupFragment.this.f89834d, errorResult.getDisplayMsg(UIUtils.getString(QuitGroupFragment.this.f89834d, R.string.Lark_Legacy_Groupfailed)));
                    C34457a.m133685a().mo127255b(QuitGroupFragment.this.f89833c.getId(), false);
                    QuitGroupFragment.this.finish();
                }
            }));
        }
    }
}
