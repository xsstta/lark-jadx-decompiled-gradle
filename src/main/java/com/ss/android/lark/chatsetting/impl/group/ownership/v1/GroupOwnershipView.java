package com.ss.android.lark.chatsetting.impl.group.ownership.v1;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.ownership.chat_admin.ChatAdminItemListener;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView;
import com.ss.android.lark.chatsetting.impl.group.setting.C34942d;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.List;

public class GroupOwnershipView implements AbstractC34860e.AbstractC34863b {

    /* renamed from: a */
    public Context f89940a;

    /* renamed from: b */
    public AbstractC34831c f89941b;

    /* renamed from: c */
    public AbstractC34860e.AbstractC34863b.AbstractC34864a f89942c;

    /* renamed from: d */
    public final boolean f89943d;

    /* renamed from: e */
    private CompoundButton.OnCheckedChangeListener f89944e;

    /* renamed from: f */
    private CompoundButton.OnCheckedChangeListener f89945f;

    /* renamed from: g */
    private C34942d f89946g;

    /* renamed from: h */
    private final AbstractC34461c f89947h;

    /* renamed from: i */
    private final boolean f89948i;

    /* renamed from: j */
    private final boolean f89949j;

    /* renamed from: k */
    private final boolean f89950k;

    /* renamed from: l */
    private final List<ChatChatter> f89951l = new ArrayList();

    /* renamed from: m */
    private final boolean f89952m;
    @BindView(6400)
    TextView mAddChatAdminTv;
    @BindView(6402)
    TextView mAddMemberAndShareStatus;
    @BindView(6408)
    View mAllowSearchLayout;
    @BindView(6409)
    View mAllowSearchMask;
    @BindView(6407)
    TextView mAllowSearchStateTv;
    @BindView(6858)
    View mApplyGroupLimitLayout;
    @BindView(7104)
    TextView mApprovalStateTv;
    @BindView(6496)
    View mBuzzPermissionLayout;
    @BindView(6497)
    TextView mBuzzPermissionTip;
    @BindView(6514)
    GridView mChatAdminGv;
    @BindView(6515)
    ViewGroup mChatAdminLayout;
    @BindView(6516)
    TextView mChatAdminsNumTv;
    @BindView(7600)
    CommonTitleBar mCommonTitleBar;
    @BindView(6740)
    View mGroupAllowAnonymityLayout;
    @BindView(6739)
    LKUISwitchButton mGroupAllowAnonymitySwitchBtn;
    @BindView(6741)
    TextView mGroupAllowAnonymityTipTv;
    @BindView(6742)
    TextView mGroupAllowAnonymityTv;
    @BindView(7049)
    TextView mGroupMailDetail;
    @BindView(7050)
    View mGroupMailSettingDivider;
    @BindView(7051)
    View mGroupMailSettingLayout;
    @BindView(6768)
    ScrollView mGroupManagerScrollView;
    @BindView(6773)
    View mGroupNewMessageLayout;
    @BindView(7646)
    TextView mGroupOwnerAddNewMemberTipTv;
    @BindView(7648)
    TextView mGroupTransferTitleTv;
    @BindView(6794)
    RelativeLayout mGroupTransferToLayout;
    @BindView(6848)
    TextView mInvitationSettingTitle;
    @BindView(6891)
    View mJoinGroupMessageSetting;
    @BindView(7651)
    TextView mJoinGroupMessageSettingTitleTv;
    @BindView(6892)
    TextView mJoinGroupSettingDetail;
    @BindView(6893)
    View mJoinLeaveHistoryLayout;
    @BindView(7652)
    TextView mJoinLeaveHistoryTv;
    @BindView(6928)
    View mLeaveGroupMessageSetting;
    @BindView(7654)
    TextView mLeaveGroupMessageSettingTitleTv;
    @BindView(6929)
    TextView mLeaveGroupSettingDetail;
    @BindView(7052)
    TextView mMailGroupSettingTitle;
    @BindView(7107)
    TextView mMemberShipApprovalTipTv;
    @BindView(7106)
    TextView mMemberShipApprovalTv;
    @BindView(7103)
    View mMembershipApprovalDivider;
    @BindView(7105)
    View mMembershipApprovalLayout;
    @BindView(7191)
    View mOnlyOwnerAddMemberLayout;
    @BindView(7666)
    TextView mOwnerEditGroupInfoDescTv;
    @BindView(7200)
    TextView mOwnerEditGroupInfoStatusTv;
    @BindView(7201)
    View mOwnerMentionAllLayout;
    @BindView(7202)
    TextView mOwnerMentionAllStatus;
    @BindView(7667)
    TextView mOwnerMentionAllTv;
    @BindView(7225)
    View mPinPermissionLayout;
    @BindView(7226)
    TextView mPinPermissionTip;
    @BindView(7228)
    View mPinTopPermissionLayout;
    @BindView(7229)
    TextView mPinTopPermissionTip;
    @BindView(7248)
    TextView mPostSettingContent;
    @BindView(7249)
    ViewGroup mPostSettingLayout;
    @BindView(7250)
    TextView mPostSettingTitleTv;
    @BindView(6518)
    View mRedDot;
    @BindView(7396)
    View mSeeHistoryMessageLayout;
    @BindView(7516)
    LKUISwitchButton mSeeHistorySwitchBtn;
    @BindView(7438)
    TextView mShareHistoryTitleTv;
    @BindView(7437)
    View mSharingHistoryLayout;
    @BindView(7605)
    TextView mTransferToChatBtn;
    @BindView(7749)
    View mVcPermissionLayout;
    @BindView(7750)
    TextView mVcPermissionTip;

    /* renamed from: n */
    private final boolean f89953n;

    /* renamed from: o */
    private final boolean f89954o;

    /* renamed from: p */
    private final boolean f89955p;

    /* renamed from: q */
    private final boolean f89956q;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView$b */
    public interface AbstractC34830b {
        void onAdminSelect(boolean z);
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView$c */
    public interface AbstractC34831c {
        /* renamed from: a */
        void mo128566a(Chat chat);

        /* renamed from: a */
        void mo128567a(GroupOwnershipView groupOwnershipView);

        /* renamed from: a */
        void mo128568a(String str);

        /* renamed from: a */
        void mo128569a(String str, String str2, Chat.PostType postType, boolean z);

        /* renamed from: a */
        void mo128570a(String str, boolean z);

        /* renamed from: b */
        void mo128571b(Chat chat);

        /* renamed from: b */
        void mo128572b(String str);

        /* renamed from: b */
        void mo128573b(String str, boolean z);

        /* renamed from: c */
        void mo128574c(String str);

        /* renamed from: c */
        void mo128575c(String str, boolean z);

        /* renamed from: d */
        void mo128576d(String str);

        /* renamed from: d */
        void mo128577d(String str, boolean z);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: b */
    public boolean mo128544b() {
        return this.f89953n;
    }

    /* renamed from: a */
    private void m135381a(View... viewArr) {
        for (View view : viewArr) {
            if (view instanceof ConstraintLayout) {
                ((ConstraintLayout) view).setMinHeight(this.f89940a.getResources().getDimensionPixelSize(R.dimen.cell_double_height_desktop));
            }
        }
    }

    /* renamed from: a */
    public void mo128529a() {
        String string = UIHelper.getString(R.string.Calendar_Setting_ConfirmTransform);
        new C25639g(this.f89940a).mo89238b(true).mo89237b(string).mo89251j(2).mo89242c(UIHelper.getString(R.string.Calendar_Setting_TransformGroupConfirmSubtitle)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, $$Lambda$GroupOwnershipView$sGv0y_o6pkLsC5eM257gBzuAUA.INSTANCE).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$uOxvsdD7T8ZYNXI0oYYWNyzuQiM */

            public final void onClick(DialogInterface dialogInterface, int i) {
                GroupOwnershipView.this.m135374a((GroupOwnershipView) dialogInterface, (DialogInterface) i);
            }
        }).mo89233b().show();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: a */
    public void mo128532a(Chat chat) {
        if (chat != null) {
            this.mCommonTitleBar.setTitle(R.string.Lark_Legacy_GroupManagementSetting);
            mo128553g(chat);
            m135418p(chat);
            mo128546c(chat);
            mo128549d(chat);
            mo128551e(chat);
            mo128552f(chat);
            mo128554h(chat);
            int i = 8;
            this.mGroupTransferToLayout.setVisibility((!this.f89949j || chat.isCustomerService()) ? 8 : 0);
            mo128556j(chat);
            mo128557k(chat);
            m135376a(chat.getPostType(), chat.isThread());
            m135377a(chat.getQuitMessageVisible(), chat.isThread());
            m135388c(chat.getJoinMessageVisible(), chat.isThread());
            m135421s(chat);
            m135407j();
            m135423u(chat);
            m135424v(chat);
            m135404i();
            if (!this.f89943d || !chat.isTeam()) {
                this.mMembershipApprovalLayout.setVisibility(0);
                this.mMembershipApprovalDivider.setVisibility(0);
            } else {
                this.mMembershipApprovalLayout.setVisibility(8);
                this.mMembershipApprovalDivider.setVisibility(8);
            }
            this.mInvitationSettingTitle.setVisibility(0);
            m135420r(chat);
            this.mApprovalStateTv.setText(chat.getAddMemberApply() == Chat.AddMemberApply.NEED_APPLY ? R.string.Lark_Legacy_OpenNow : R.string.Lark_Legacy_MineMessageSettingClose);
            TextView textView = this.mTransferToChatBtn;
            if (chat.isMeeting() && this.f89949j) {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: a */
    public void mo128534a(Chat chat, List<Chatter> list) {
        String str;
        this.f89951l.clear();
        for (Chatter chatter : list) {
            ChatChatter chatChatter = new ChatChatter(chatter);
            chatChatter.setChatId(chat.getId());
            this.f89951l.add(chatChatter);
        }
        C34942d dVar = new C34942d(this.f89940a, this.f89951l, chat, this.f89949j);
        this.f89946g = dVar;
        dVar.mo128863a(new ChatAdminItemListener(this.f89940a, chat, this.f89951l.size()));
        this.mChatAdminGv.setAdapter((ListAdapter) this.f89946g);
        int i = 0;
        this.mAddChatAdminTv.setVisibility(this.f89951l.isEmpty() ? 0 : 8);
        this.mChatAdminsNumTv.setVisibility(this.f89951l.isEmpty() ? 8 : 0);
        TextView textView = this.mChatAdminsNumTv;
        if (this.f89951l.isEmpty()) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f89951l.size());
            sb.append("/");
            sb.append(chat.getMemberCount() <= 5000 ? 10 : 20);
            str = sb.toString();
        }
        textView.setText(str);
        GridView gridView = this.mChatAdminGv;
        if (this.f89951l.isEmpty()) {
            i = 8;
        }
        gridView.setVisibility(i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: a */
    public void mo128533a(Chat chat, Long l) {
        if (chat.getAnonymousSetting() != Chat.AnonymousSetting.INVISIBLE && chat.getAnonymousSetting() != Chat.AnonymousSetting.UNKNOWN) {
            if (l.longValue() <= 0) {
                this.mGroupAllowAnonymityTipTv.setVisibility(8);
            } else {
                this.mGroupAllowAnonymityTipTv.setText(UIHelper.mustacheFormat((int) R.string.Lark_Groups_MgmtAllowAnonymityDesc, "N", l.toString()));
            }
        }
    }

    /* renamed from: a */
    public void mo128530a(int i) {
        Chat.GroupMailSendPermissionType groupMailSendType = this.f89942c.mo128638h().getGroupMailSendType();
        ChatSettingHitPointNew.ManagePermissionParams managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.NOBODY;
        boolean z = true;
        if (i == 0) {
            groupMailSendType = Chat.GroupMailSendPermissionType.ONLY_ADMIN;
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN;
        } else if (i == 1) {
            groupMailSendType = Chat.GroupMailSendPermissionType.ONLY_MEMBER;
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_MEMBER;
        } else if (i == 2) {
            groupMailSendType = Chat.GroupMailSendPermissionType.ONLY_TENANT;
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_TEAM_MEMBER;
        } else if (i == 3) {
            groupMailSendType = Chat.GroupMailSendPermissionType.ANYONE;
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ALL;
        } else if (i == 4) {
            z = false;
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.NOBODY;
        }
        ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.MAIL_RESTRICTION, managePermissionParams);
        this.f89942c.mo128624a(z, groupMailSendType);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: a */
    public void mo128539a(boolean z) {
        m135379a(z, this.mGroupAllowAnonymitySwitchBtn, this.f89944e);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: a */
    public void mo128537a(String str, String str2, Chat.PostType postType, boolean z) {
        this.f89941b.mo128569a(str, str2, postType, z);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: a */
    public void mo128538a(String str, boolean z) {
        this.f89941b.mo128570a(str, z);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: a */
    public void mo128531a(int i, int i2) {
        new C25639g(this.f89940a).mo89248g(i).mo89238b(true).mo89254m(i2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmDone, (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* renamed from: e */
    private void m135392e() {
        this.mPostSettingLayout.setVisibility(0);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f89941b = null;
        this.f89942c = null;
    }

    /* renamed from: d */
    private void m135389d() {
        m135398g();
        m135392e();
        m135395f();
        ChatSettingHitPointNew.m136621a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView$a */
    public class C34825a extends OnSingleClickListener {

        /* renamed from: a */
        public final int f89971a;

        /* renamed from: b */
        public ChatSettingHitPointNew.GroupManageParam f89972b;

        /* renamed from: d */
        private final Context f89974d;

        /* renamed from: e */
        private final boolean f89975e;

        /* renamed from: f */
        private final boolean f89976f;

        /* renamed from: a */
        private String m135455a() {
            int i;
            Context context = this.f89974d;
            if (this.f89971a == 0) {
                i = R.string.Lark_GroupManagement_WhoWIllBeNotifiedLeave;
            } else {
                i = R.string.Lark_GroupManagement_WhoWIllBeNotifiedForNewMembers;
            }
            return UIUtils.getString(context, i);
        }

        /* renamed from: b */
        private C58339d.C58341a m135456b() {
            return new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_GroupSettingNotifyNone), new C58339d.AbstractC58343b() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C34825a.C348261 */

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public void onMenuItemClick() {
                    ChatSettingHitPointNew.m136624a(C34825a.this.f89972b, ChatSettingHitPointNew.ManagePermissionParams.NOBODY);
                    if (C34825a.this.f89971a == 0) {
                        GroupOwnershipView.this.f89942c.mo128622a(Chat.SystemMessageVisible.NOT_ANYONE);
                    } else {
                        GroupOwnershipView.this.f89942c.mo128626b(Chat.SystemMessageVisible.NOT_ANYONE);
                    }
                }
            });
        }

        /* renamed from: c */
        private C58339d.C58341a m135457c() {
            return new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_NotifyAllGroupMembers), new C58339d.AbstractC58343b() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C34825a.C348272 */

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public void onMenuItemClick() {
                    ChatSettingHitPointNew.m136624a(C34825a.this.f89972b, ChatSettingHitPointNew.ManagePermissionParams.ALL);
                    if (C34825a.this.f89971a == 0) {
                        GroupOwnershipView.this.f89942c.mo128622a(Chat.SystemMessageVisible.ALL_MEMBERS);
                    } else {
                        GroupOwnershipView.this.f89942c.mo128626b(Chat.SystemMessageVisible.ALL_MEMBERS);
                    }
                }
            });
        }

        /* renamed from: d */
        private C58339d.C58341a m135458d() {
            return new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_OnlyGOGANotified), new C58339d.AbstractC58343b() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C34825a.C348283 */

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public void onMenuItemClick() {
                    ChatSettingHitPointNew.m136624a(C34825a.this.f89972b, ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN);
                    if (C34825a.this.f89971a == 0) {
                        GroupOwnershipView.this.f89942c.mo128622a(Chat.SystemMessageVisible.ONLY_OWNER);
                    } else {
                        GroupOwnershipView.this.f89942c.mo128626b(Chat.SystemMessageVisible.ONLY_OWNER);
                    }
                }
            });
        }

        /* renamed from: e */
        private C58339d.C58341a m135459e() {
            return new C58339d.C58341a(UIUtils.getString(this.f89974d, R.string.Lark_Legacy_Cancel), new C58339d.AbstractC58343b() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C34825a.C348294 */

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public void onMenuItemClick() {
                }
            });
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(m135457c());
            if (!this.f89976f) {
                arrayList.add(m135458d());
            }
            arrayList.add(m135456b());
            arrayList.add(m135459e());
            C58339d.m226196a(this.f89974d, arrayList, m135455a());
        }

        C34825a(Context context, int i, boolean z, boolean z2) {
            ChatSettingHitPointNew.GroupManageParam groupManageParam;
            this.f89971a = i;
            this.f89974d = context;
            this.f89975e = z;
            this.f89976f = z2;
            if (i == 0) {
                groupManageParam = ChatSettingHitPointNew.GroupManageParam.LEAVE_GROUP_SYSTEM_MESSAGE;
            } else {
                groupManageParam = ChatSettingHitPointNew.GroupManageParam.JOIN_GROUP_SYSTEM_MESSAGE;
            }
            this.f89972b = groupManageParam;
        }
    }

    /* renamed from: j */
    private void m135407j() {
        int i;
        boolean a = this.f89947h.mo127284n().mo127297a("chat.enterLeaveGroupHistory");
        View view = this.mJoinLeaveHistoryLayout;
        if (a) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: m */
    private List<String> m135414m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(UIUtils.getString(this.f89940a, R.string.Lark_GroupManagement_EveryoneInThisGroup));
        arrayList.add(UIUtils.getString(this.f89940a, R.string.Lark_GroupManagement_OnlyGroupOwnerAndGroupAdmin));
        return arrayList;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f89941b.mo128567a(this);
        this.f89940a = this.mCommonTitleBar.getContext();
        m135389d();
    }

    /* renamed from: h */
    private void m135401h() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f89940a).message(R.string.Lark_Group_MustTurnOnBothTitle)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Group_MustTurnOnBothButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$QUMpZBc4OeDPFSrV9IUG5yUS9s */

            public final void onClick(DialogInterface dialogInterface, int i) {
                GroupOwnershipView.this.m135386c((GroupOwnershipView) dialogInterface, (DialogInterface) i);
            }
        })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Group_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: i */
    private void m135404i() {
        if (this.f89949j) {
            this.mChatAdminLayout.setVisibility(0);
            this.mGroupNewMessageLayout.setBackgroundResource(R.drawable.bg_setting_group_item_rectangle);
            return;
        }
        this.mChatAdminLayout.setVisibility(8);
        this.mGroupNewMessageLayout.setBackgroundResource(R.drawable.bg_setting_group_item_round_top);
    }

    /* renamed from: k */
    private void m135410k() {
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(this.f89940a).title(R.string.Lark_Group_GroupSettings_Email_Permission_Title)).mo90870a(m135412l())).mo90869a(new UDListDialogController.OnItemClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348172 */

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public void onItemClick(int i) {
                GroupOwnershipView.this.mo128530a(i);
            }
        })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView$3 */
    public static /* synthetic */ class C348183 {

        /* renamed from: a */
        static final /* synthetic */ int[] f89963a;

        /* renamed from: b */
        static final /* synthetic */ int[] f89964b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.ss.android.lark.chat.entity.chat.Chat$GroupMailSendPermissionType[] r0 = com.ss.android.lark.chat.entity.chat.Chat.GroupMailSendPermissionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348183.f89964b = r0
                r1 = 1
                com.ss.android.lark.chat.entity.chat.Chat$GroupMailSendPermissionType r2 = com.ss.android.lark.chat.entity.chat.Chat.GroupMailSendPermissionType.ONLY_ADMIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348183.f89964b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.chat.Chat$GroupMailSendPermissionType r3 = com.ss.android.lark.chat.entity.chat.Chat.GroupMailSendPermissionType.ANYONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348183.f89964b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.entity.chat.Chat$GroupMailSendPermissionType r4 = com.ss.android.lark.chat.entity.chat.Chat.GroupMailSendPermissionType.ONLY_MEMBER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348183.f89964b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.entity.chat.Chat$GroupMailSendPermissionType r4 = com.ss.android.lark.chat.entity.chat.Chat.GroupMailSendPermissionType.ONLY_TENANT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.ss.android.lark.chat.entity.chat.Chat$PostType[] r3 = com.ss.android.lark.chat.entity.chat.Chat.PostType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348183.f89963a = r3
                com.ss.android.lark.chat.entity.chat.Chat$PostType r4 = com.ss.android.lark.chat.entity.chat.Chat.PostType.ANYONE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348183.f89963a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.ss.android.lark.chat.entity.chat.Chat$PostType r3 = com.ss.android.lark.chat.entity.chat.Chat.PostType.ONLY_ADMIN     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348183.f89963a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.ss.android.lark.chat.entity.chat.Chat$PostType r1 = com.ss.android.lark.chat.entity.chat.Chat.PostType.WHITE_LIST     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348183.<clinit>():void");
        }
    }

    /* renamed from: l */
    private List<String> m135412l() {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(UIUtils.getString(this.f89940a, R.string.Lark_Legacy_OnlyGOGASendEmail));
        Context context = this.f89940a;
        if (this.f89948i) {
            i = R.string.Lark_Groups_CircleEmailOnlyMemberCanSend;
        } else {
            i = R.string.Lark_Group_GroupSettings_Email_Permission_Member;
        }
        arrayList.add(UIUtils.getString(context, i));
        arrayList.add(UIHelper.mustacheFormat((int) R.string.Lark_Group_GroupSettings_Email_Permission_Tenant, "tenant_name", ChatSettingModule.m133639a().mo127277g().mo127414b()));
        arrayList.add(UIUtils.getString(this.f89940a, R.string.Lark_Group_GroupSettings_Email_Permission_All));
        arrayList.add(UIUtils.getString(this.f89940a, R.string.Lark_Chat_NoOneCanSend));
        return arrayList;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: c */
    public void mo128545c() {
        this.mGroupManagerScrollView.postDelayed(new Runnable() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AnonymousClass11 */

            public void run() {
                GroupOwnershipView.this.mGroupManagerScrollView.fullScroll(130);
            }
        }, 500);
    }

    /* renamed from: f */
    private void m135395f() {
        if (DesktopUtil.m144307b()) {
            this.mCommonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
            DesktopUtil.m144306b(this.mInvitationSettingTitle, this.mApprovalStateTv, this.mMemberShipApprovalTipTv, this.mPostSettingContent, this.mJoinGroupSettingDetail, this.mLeaveGroupSettingDetail, this.mGroupMailDetail, this.mGroupAllowAnonymityTipTv);
            DesktopUtil.m144299a(this.mOwnerEditGroupInfoDescTv, this.mGroupOwnerAddNewMemberTipTv, this.mShareHistoryTitleTv, this.mJoinLeaveHistoryTv, this.mMemberShipApprovalTv, this.mOwnerMentionAllTv, this.mPostSettingTitleTv, this.mJoinGroupMessageSettingTitleTv, this.mLeaveGroupMessageSettingTitleTv, this.mMailGroupSettingTitle, this.mGroupTransferTitleTv, this.mTransferToChatBtn, this.mGroupAllowAnonymityTv);
            DesktopUtil.m144298a(this.mOnlyOwnerAddMemberLayout, this.mJoinLeaveHistoryLayout, this.mOwnerMentionAllLayout, this.mGroupTransferToLayout, this.mTransferToChatBtn);
            DesktopUtil.m144305b(this.mGroupNewMessageLayout, this.mJoinGroupMessageSetting, this.mLeaveGroupMessageSetting, this.mGroupAllowAnonymityLayout);
            m135381a(this.mSharingHistoryLayout, this.mMembershipApprovalLayout, this.mPostSettingLayout, this.mGroupMailSettingLayout);
        }
    }

    /* renamed from: g */
    private void m135398g() {
        this.f89944e = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348161 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                GroupOwnershipView.this.f89942c.mo128627b(z);
            }
        };
        this.f89945f = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348194 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
                if (z) {
                    managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.OFF_TO_ON;
                } else {
                    managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ON_TO_OFF;
                }
                ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.IS_HISTORY_MESSAGE_VIEW, managePermissionParams);
                GroupOwnershipView.this.f89942c.mo128629c(z);
            }
        };
        this.mPostSettingLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348205 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                GroupOwnershipView.this.f89942c.mo128628c();
                ChatSettingHitPointNew.m136623a(ChatSettingHitPointNew.GroupManageParam.MESSAGE_RESTRICTION);
            }
        });
        this.mGroupTransferToLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.View$OnClickListenerC348216 */

            public void onClick(View view) {
                Chat h = GroupOwnershipView.this.f89942c.mo128638h();
                if (!GroupOwnershipView.this.f89943d || h == null || !h.isTeam() || GroupOwnershipView.this.f89942c.mo128640i() == null || !String.valueOf(GroupOwnershipView.this.f89942c.mo128640i().getDefaultChatId()).equals(h.getId())) {
                    GroupOwnershipView.this.f89942c.mo128621a();
                } else {
                    UDToast.show(GroupOwnershipView.this.f89940a, (int) R.string.Project_MV_MustBeAligned);
                }
            }
        });
        this.mTransferToChatBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.View$OnClickListenerC348227 */

            public void onClick(View view) {
                GroupOwnershipView.this.mo128529a();
                OwnershipHitPoint.f90525a.mo129295d();
                OwnershipHitPoint.f90525a.mo129292b(GroupOwnershipView.this.f89942c.mo128638h().getCreateTime(), GroupOwnershipView.this.f89942c.mo128638h().getId());
            }
        });
        this.mLeaveGroupMessageSetting.setOnClickListener(new C34825a(this.f89940a, 0, this.f89948i, this.f89950k));
        this.mJoinGroupMessageSetting.setOnClickListener(new C34825a(this.f89940a, 1, this.f89948i, this.f89950k));
        this.mChatAdminLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$zheCFRvsigzXBQROPewx6_8Y4R0 */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135413l((GroupOwnershipView) view);
            }
        });
        this.mMembershipApprovalLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$xEy6F1_7oXbpuGGzGhqp6KjFc8g */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135411k((GroupOwnershipView) view);
            }
        });
        this.mJoinLeaveHistoryLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$cLaWbi9K_nl49WqpHwHBQ68QYE */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135408j((GroupOwnershipView) view);
            }
        });
        this.mGroupMailSettingLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$qRNEetKvSUkoTtqPcGuxd2YD_E */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135405i((GroupOwnershipView) view);
            }
        });
        this.mSharingHistoryLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$z7dHMeWTUG62UsTxU8K3SaE0ZBI */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135402h((GroupOwnershipView) view);
            }
        });
        this.mCommonTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.View$OnClickListenerC348238 */

            public void onClick(View view) {
                GroupOwnershipView.this.f89941b.mo128572b((String) null);
            }
        });
        this.mOnlyOwnerAddMemberLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$77SnUpXrFQjz0apIuaGxsKzxpz8 */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135399g((GroupOwnershipView) view);
            }
        });
        this.mGroupNewMessageLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$K84Ngbm3JvqpDWtHQlBWZrk8pa8 */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135396f((GroupOwnershipView) view);
            }
        });
        this.mOwnerMentionAllLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$GqYYvpqQIpFsgLcBYFtpe1KB4h4 */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135393e((GroupOwnershipView) view);
            }
        });
        this.mVcPermissionLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$RjmOsfW_viS5ejnGnS6CEBjUtk */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135390d((GroupOwnershipView) view);
            }
        });
        this.mBuzzPermissionLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$24xHHL9LEOWW5mVfTqh3jG3ioqw */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135387c((GroupOwnershipView) view);
            }
        });
        this.mPinPermissionLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$eQ3CE7xh914nNxJdnWY740gJDEA */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135384b((GroupOwnershipView) view);
            }
        });
        this.mPinTopPermissionLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$ahnYaiB24Hy02tw45Q5tqg0CT0w */

            public final void onClick(View view) {
                GroupOwnershipView.this.m135375a((GroupOwnershipView) view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ void m135405i(View view) {
        m135410k();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC34860e.AbstractC34863b.AbstractC34864a aVar) {
        this.f89942c = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m135391d(boolean z) {
        this.f89942c.mo128641i(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m135397f(boolean z) {
        this.f89942c.mo128635f(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m135400g(boolean z) {
        this.f89942c.mo128637g(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m135403h(boolean z) {
        this.f89942c.mo128633e(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ void m135406i(boolean z) {
        this.f89942c.mo128623a(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k */
    private /* synthetic */ void m135411k(View view) {
        this.f89942c.mo128630d();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: a */
    public void mo128536a(String str) {
        this.f89941b.mo128568a(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: l */
    public void mo128558l(Chat chat) {
        this.f89941b.mo128571b(chat);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m135384b(View view) {
        m135373a(R.string.Lark_GroupManagement_WhoCanPin, ChatSettingHitPointNew.GroupManageParam.PIN_RESTRICTION, new AbstractC34830b() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$Qb2zDuWS3qUCgMlsTad1umsH8 */

            @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34830b
            public final void onAdminSelect(boolean z) {
                GroupOwnershipView.this.m135394e((GroupOwnershipView) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m135387c(View view) {
        m135373a(R.string.Lark_GroupManagement_WhoCanBuzzOthers, ChatSettingHitPointNew.GroupManageParam.DING_RESTRICTION, new AbstractC34830b() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$usZHvlDqRwSvzhEBflmOrDR7h4 */

            @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34830b
            public final void onAdminSelect(boolean z) {
                GroupOwnershipView.this.m135397f((GroupOwnershipView) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m135393e(View view) {
        m135373a(R.string.Lark_GroupManagement_WhoCanAtAll, ChatSettingHitPointNew.GroupManageParam.MENTION_ALL_MEMBER, new AbstractC34830b() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$vlv6cfJ1AoDLu_F0R_H4TLkIM8 */

            @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34830b
            public final void onAdminSelect(boolean z) {
                GroupOwnershipView.this.m135403h((GroupOwnershipView) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m135396f(View view) {
        m135373a(R.string.Lark_GroupManagement_EditGroupInfo, ChatSettingHitPointNew.GroupManageParam.EDIT_GROUP_INFO, new AbstractC34830b() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$1fTqPD5XGAlDcLiiI0OxG3J1f7Y */

            @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34830b
            public final void onAdminSelect(boolean z) {
                GroupOwnershipView.this.m135406i((GroupOwnershipView) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m135399g(View view) {
        m135373a(R.string.Lark_GroupManagement_ManageGroupMembersShareGroup, ChatSettingHitPointNew.GroupManageParam.ADD_MEMBER_SHARE_GROUP, new AbstractC34830b() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$33KAgEqgnmTXbpLSven8CxDTCg */

            @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34830b
            public final void onAdminSelect(boolean z) {
                GroupOwnershipView.this.m135409j((GroupOwnershipView) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m135402h(View view) {
        this.f89942c.mo128632e();
        ChatSettingHitPointNew.m136623a(ChatSettingHitPointNew.GroupManageParam.GROUP_SHARE_HISTORY);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void m135408j(View view) {
        this.f89942c.mo128634f();
        ChatSettingHitPointNew.m136623a(ChatSettingHitPointNew.GroupManageParam.MEMBER_INOUT_HISTORY);
    }

    /* renamed from: n */
    private boolean m135416n(Chat chat) {
        if (!this.f89943d || !chat.isTeam()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private void m135420r(Chat chat) {
        int i;
        View view = this.mRedDot;
        if (chat.getPutChatterApplyCount() > 0) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: i */
    public void mo128555i(Chat chat) {
        this.f89941b.mo128566a(chat);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m135375a(View view) {
        m135373a(R.string.Lark_IMChatPin_WhoCanPinChatAndAnnouncement_Option, ChatSettingHitPointNew.GroupManageParam.PIN_TO_TOP_RESTRICTION, new AbstractC34830b() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$kvcaU7CiMPqBrkH1EOwkNHvLbJw */

            @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34830b
            public final void onAdminSelect(boolean z) {
                GroupOwnershipView.this.m135391d((GroupOwnershipView) z);
            }
        });
    }

    /* renamed from: c */
    private String m135385c(boolean z) {
        if (z) {
            return UIUtils.getString(this.f89940a, R.string.Lark_GroupManagement_OnlyGroupOwnerAndGroupAdmin);
        }
        return UIUtils.getString(this.f89940a, R.string.Lark_GroupManagement_EveryoneInThisGroup);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m135390d(View view) {
        m135373a(R.string.Lark_GroupManagement_StartVideoCalls, ChatSettingHitPointNew.GroupManageParam.VC_RESTRICTION, new AbstractC34830b() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$RrN9_vTYdf8SLc00YMg3cLmAG8 */

            @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AbstractC34830b
            public final void onAdminSelect(boolean z) {
                GroupOwnershipView.this.m135400g((GroupOwnershipView) z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m135394e(boolean z) {
        this.f89942c.mo128639h(z);
    }

    /* renamed from: o */
    private void m135417o(Chat chat) {
        if (chat.isPublic() || m135415m(chat)) {
            this.mOnlyOwnerAddMemberLayout.setVisibility(8);
        } else {
            this.mOnlyOwnerAddMemberLayout.setVisibility(0);
        }
    }

    /* renamed from: s */
    private void m135421s(Chat chat) {
        int i;
        boolean t = m135422t(chat);
        View view = this.mSharingHistoryLayout;
        if (t) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.mGroupManagerScrollView.findViewById(R.id.divider_join_leave_history).setVisibility(0);
    }

    /* renamed from: t */
    private boolean m135422t(Chat chat) {
        if (chat.isPublic()) {
            return false;
        }
        if (!chat.isTeam() || !this.f89943d) {
            return this.f89947h.mo127284n().mo127297a("chat.groupShareHistory");
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: b */
    public void mo128540b(Chat chat) {
        this.mApplyGroupLimitLayout.setVisibility(0);
        this.mSharingHistoryLayout.setBackgroundResource(R.drawable.bg_setting_group_item_rectangle);
        this.mApplyGroupLimitLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.C348249 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ChatSettingHitPointNew.m136626a(ChatSettingExtraParams.Click.APPLY_MEMBER_TOPLIMIT.plus(ChatSettingExtraParams.Target.IM_CHAT_MEMBER_TOPLIMIT_APPLY_VIEW));
                GroupOwnershipView.this.f89942c.mo128642j();
            }
        });
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: g */
    public void mo128553g(Chat chat) {
        boolean z;
        Chat.AddMemberPermission addMemberPermission = chat.getAddMemberPermission();
        Chat.ShareCardPermission shareCardPermission = chat.getShareCardPermission();
        if (addMemberPermission == Chat.AddMemberPermission.ALL_MEMBERS && shareCardPermission == Chat.ShareCardPermission.ALLOWED) {
            z = false;
        } else {
            z = true;
        }
        this.mAddMemberAndShareStatus.setText(m135385c(z));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: k */
    public void mo128557k(Chat chat) {
        boolean z;
        Chat.AtAllPermission atAllPermission = chat.getAtAllPermission();
        TextView textView = this.mOwnerMentionAllStatus;
        if (atAllPermission == Chat.AtAllPermission.ONLY_OWNER) {
            z = true;
        } else {
            z = false;
        }
        textView.setText(m135385c(z));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void m135409j(boolean z) {
        boolean z2;
        if (this.f89942c.mo128638h() == null || !this.f89942c.mo128638h().isPublic()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2 || !this.f89953n) {
            this.f89942c.mo128631d(z);
        } else {
            m135401h();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l */
    private /* synthetic */ void m135413l(View view) {
        String id = this.f89942c.mo128638h().getId();
        if (this.f89951l.isEmpty()) {
            this.f89947h.mo127281k().mo127401a((Activity) this.f89940a, id, 0);
        } else {
            this.f89941b.mo128576d(id);
        }
        ChatSettingHitPointNew.m136623a(ChatSettingHitPointNew.GroupManageParam.GROUP_ADMIN_MEMBER);
    }

    /* renamed from: m */
    private boolean m135415m(Chat chat) {
        if (!this.f89943d || !chat.isTeam() || chat.getTeamChatType() == TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private boolean m135419q(Chat chat) {
        if (chat.isCrossTenant() || chat.isCrossWithKa() || chat.is_department() || chat.isTenant() || chat.isEdu() || chat.isMeeting() || chat.isSecret() || chat.isOnCall() || chat.isCustomerService()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private void m135423u(Chat chat) {
        if (this.mSeeHistoryMessageLayout != null) {
            if (chat.isSecret() || chat.isThread() || chat.isPublic()) {
                this.mSeeHistoryMessageLayout.setVisibility(8);
                return;
            }
            this.mSeeHistoryMessageLayout.setVisibility(0);
            this.mSeeHistorySwitchBtn.setOnCheckedChangeListener(null);
            this.mSeeHistorySwitchBtn.setChecked(chat.canSeeHistoryMessage());
            this.mSeeHistorySwitchBtn.setOnCheckedChangeListener(this.f89945f);
        }
    }

    /* renamed from: p */
    private void m135418p(final Chat chat) {
        int i;
        int i2;
        int i3 = 8;
        if (!this.f89953n || m135416n(chat)) {
            m135417o(chat);
            this.mAllowSearchLayout.setVisibility(8);
            return;
        }
        View view = this.mOnlyOwnerAddMemberLayout;
        if (m135415m(chat)) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        this.mAllowSearchLayout.setVisibility(0);
        final boolean q = m135419q(chat);
        View view2 = this.mAllowSearchMask;
        if (!q) {
            i3 = 0;
        }
        view2.setVisibility(i3);
        TextView textView = this.mAllowSearchStateTv;
        if (chat.isPublic()) {
            i2 = R.string.Lark_Legacy_OpenNow;
        } else {
            i2 = R.string.Lark_Legacy_MineMessageSettingClose;
        }
        textView.setText(i2);
        this.mAllowSearchLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipView.AnonymousClass10 */

            public void onClick(View view) {
                if (q) {
                    OwnershipHitPointNew.f90531b.mo129299a(chat, "allow_to_be_searched", "im_chat_allow_to_be_searched_view");
                    GroupOwnershipView.this.f89942c.mo128636g();
                    return;
                }
                UDToast.show(GroupOwnershipView.this.f89940a, (int) R.string.Lark_Group_FeatureUnsupportedToast);
            }
        });
    }

    /* renamed from: v */
    private void m135424v(Chat chat) {
        boolean z;
        Chat.AnonymousSetting anonymousSetting = chat.getAnonymousSetting();
        Log.m165389i("GroupOwnershipView", "chatID : " + chat.getId() + " , AnonymousSetting : " + anonymousSetting);
        if (!ChatSettingModule.m133639a().mo127262G()) {
            this.mGroupAllowAnonymityLayout.setVisibility(8);
        } else if (!chat.isThread()) {
            this.mGroupAllowAnonymityLayout.setVisibility(8);
        } else if (anonymousSetting == Chat.AnonymousSetting.INVISIBLE || anonymousSetting == Chat.AnonymousSetting.UNKNOWN) {
            this.mGroupAllowAnonymityLayout.setVisibility(8);
        } else {
            if (anonymousSetting == Chat.AnonymousSetting.ALLOWED) {
                z = true;
            } else {
                z = false;
            }
            this.mGroupAllowAnonymityLayout.setVisibility(0);
            this.mGroupAllowAnonymitySwitchBtn.setOnCheckedChangeListener(null);
            this.mGroupAllowAnonymitySwitchBtn.setChecked(z);
            this.mGroupAllowAnonymitySwitchBtn.setOnCheckedChangeListener(this.f89944e);
            this.mGroupMailSettingLayout.setBackgroundResource(R.drawable.bg_setting_group_item_rectangle);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: b */
    public void mo128541b(String str) {
        this.f89941b.mo128572b(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: d */
    public void mo128549d(Chat chat) {
        if (!this.f89956q || chat.isSecret() || chat.isOnCall() || chat.isCustomerService() || chat.isSuper() || chat.isThread()) {
            this.mPinTopPermissionLayout.setVisibility(8);
            return;
        }
        boolean z = false;
        this.mPinTopPermissionLayout.setVisibility(0);
        TextView textView = this.mPinTopPermissionTip;
        if (chat.getTopNoticePermissionSetting() == Chat.TopNoticePermissionSetting.ONLY_MANAGER) {
            z = true;
        }
        textView.setText(m135385c(z));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: e */
    public void mo128551e(Chat chat) {
        if (!this.f89954o || chat.isSecret() || chat.isOnCall() || chat.isCustomerService() || chat.isSuper() || chat.isThread()) {
            this.mBuzzPermissionLayout.setVisibility(8);
            return;
        }
        boolean z = false;
        this.mBuzzPermissionLayout.setVisibility(0);
        TextView textView = this.mBuzzPermissionTip;
        if (chat.getBuzzPermissionSetting() == Chat.BuzzPermissionSetting.ONLY_MANAGER) {
            z = true;
        }
        textView.setText(m135385c(z));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: f */
    public void mo128552f(Chat chat) {
        if (!this.f89955p || chat.isSecret() || chat.isOnCall() || chat.isCustomerService() || chat.isSuper() || chat.isThread()) {
            this.mVcPermissionLayout.setVisibility(8);
            return;
        }
        boolean z = false;
        this.mVcPermissionLayout.setVisibility(0);
        TextView textView = this.mVcPermissionTip;
        if (chat.getCreateVideoConferenceSetting() == Chat.CreateVideoConferenceSetting.ONLY_MANAGER) {
            z = true;
        }
        textView.setText(m135385c(z));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: h */
    public void mo128554h(Chat chat) {
        boolean isGroupMailEnable = chat.isGroupMailEnable();
        Chat.GroupMailSendPermissionType groupMailSendType = chat.getGroupMailSendType();
        boolean a = ChatSettingModule.m133639a().mo127259D().mo127416a();
        if (chat.isSuper() || !a || groupMailSendType == Chat.GroupMailSendPermissionType.UNKNOWN) {
            this.mGroupMailSettingDivider.setVisibility(8);
            this.mGroupMailSettingLayout.setVisibility(8);
            return;
        }
        this.mGroupMailSettingDivider.setVisibility(0);
        this.mGroupMailSettingLayout.setVisibility(0);
        m135380a(isGroupMailEnable, groupMailSendType);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: j */
    public void mo128556j(Chat chat) {
        this.mOwnerEditGroupInfoStatusTv.setText(m135385c(chat.isOnlyOwnerEditGroupInfo()));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: c */
    public void mo128546c(Chat chat) {
        if (!this.f89954o || chat.isSecret() || chat.isOnCall() || chat.isCustomerService() || chat.isSuper()) {
            this.mPinPermissionLayout.setVisibility(8);
            return;
        }
        boolean z = false;
        this.mPinPermissionLayout.setVisibility(0);
        TextView textView = this.mPinPermissionTip;
        if (chat.getPinPermissionSetting() == Chat.PinPermissionSetting.ONLY_MANAGER) {
            z = true;
        }
        textView.setText(m135385c(z));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: b */
    public void mo128543b(boolean z) {
        m135379a(z, this.mSeeHistorySwitchBtn, this.f89945f);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: c */
    public void mo128547c(String str) {
        this.f89941b.mo128574c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m135383b(DialogInterface dialogInterface, int i) {
        OwnershipHitPoint.f90525a.mo129297f();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m135386c(DialogInterface dialogInterface, int i) {
        this.f89942c.mo128631d(true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m135374a(DialogInterface dialogInterface, int i) {
        this.f89942c.mo128625b();
        OwnershipHitPoint.f90525a.mo129296e();
    }

    /* renamed from: b */
    private String m135382b(Chat.SystemMessageVisible systemMessageVisible, boolean z) {
        if (Chat.SystemMessageVisible.ALL_MEMBERS.equals(systemMessageVisible)) {
            return UIHelper.getString(R.string.Lark_Legacy_NotifyAllGroupMembers);
        }
        if (!Chat.SystemMessageVisible.ONLY_OWNER.equals(systemMessageVisible)) {
            return UIHelper.getString(R.string.Lark_Legacy_GroupSettingNotifyNone);
        }
        if (z) {
            return UIHelper.getString(R.string.Lark_Legacy_OnlyGOGANotified);
        }
        return UIHelper.getString(R.string.Lark_Legacy_OnlyGOGANotified);
    }

    /* renamed from: c */
    private void m135388c(Chat.SystemMessageVisible systemMessageVisible, boolean z) {
        this.mJoinGroupSettingDetail.setText(m135382b(systemMessageVisible, z));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: d */
    public void mo128550d(String str, boolean z) {
        this.f89941b.mo128577d(str, z);
    }

    public GroupOwnershipView(AbstractC34831c cVar, Chat chat) {
        boolean z;
        boolean z2;
        AbstractC34461c a = ChatSettingModule.m133639a();
        this.f89947h = a;
        boolean z3 = true;
        this.f89952m = true;
        this.f89953n = a.mo127268a("im.chat.searchable.group");
        this.f89943d = C34501a.m133933a();
        this.f89954o = a.mo127268a("im.chat.only.admin.can.pin.vc.buzz");
        this.f89955p = a.mo127268a("im.chat.setting.only.admin.can.vc");
        this.f89956q = a.mo127274d().mo127368c();
        this.f89941b = cVar;
        if (chat == null || !chat.isThread()) {
            z = false;
        } else {
            z = true;
        }
        this.f89948i = z;
        if (chat == null || !chat.getOwnerId().equals(a.mo127277g().mo127412a())) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f89949j = z2;
        this.f89950k = (chat == null || !chat.isSuper()) ? false : z3;
    }

    /* renamed from: a */
    private void m135376a(Chat.PostType postType, boolean z) {
        int i;
        int i2;
        int i3;
        int i4 = C348183.f89963a[postType.ordinal()];
        if (i4 == 1) {
            TextView textView = this.mPostSettingContent;
            if (z) {
                i = R.string.Lark_Group_Topic_GroupSettings_MsgRestriction_Default;
            } else {
                i = R.string.Lark_Group_GroupSettings_MsgRestriction_Default;
            }
            textView.setText(i);
        } else if (i4 == 2) {
            TextView textView2 = this.mPostSettingContent;
            if (z) {
                i2 = R.string.Lark_Legacy_OnlyGroupOwnerGroupAdminNewTopics;
            } else {
                i2 = R.string.Lark_Legacy_OnlyGOGASendMsg;
            }
            textView2.setText(UIHelper.getString(i2));
        } else if (i4 == 3) {
            TextView textView3 = this.mPostSettingContent;
            if (z) {
                i3 = R.string.Lark_Group_Topic_GroupSettings_MsgRestriction_SelectedMember;
            } else {
                i3 = R.string.Lark_Group_GroupSettings_MsgRestriction_SelectedMember;
            }
            textView3.setText(i3);
        }
    }

    /* renamed from: a */
    private void m135377a(Chat.SystemMessageVisible systemMessageVisible, boolean z) {
        this.mLeaveGroupSettingDetail.setText(m135382b(systemMessageVisible, z));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: b */
    public void mo128542b(String str, boolean z) {
        GroupHitPoint.f90519a.mo129253k();
        this.f89941b.mo128573b(str, z);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b
    /* renamed from: c */
    public void mo128548c(String str, boolean z) {
        GroupHitPoint.f90519a.mo129256l();
        this.f89941b.mo128575c(str, z);
    }

    /* renamed from: a */
    private void m135380a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType) {
        int i;
        if (!z) {
            i = R.string.Lark_Chat_NoOneCanSend;
        } else {
            int i2 = C348183.f89964b[groupMailSendPermissionType.ordinal()];
            if (i2 == 1) {
                i = R.string.Lark_Legacy_OnlyGOGASendEmail;
            } else if (i2 == 2) {
                i = R.string.Lark_Group_GroupSettings_Email_Permission_All;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    i = R.string.Lark_Group_GroupSettings_Email_Permission_Tenant;
                } else if (this.f89948i) {
                    i = R.string.Lark_Groups_CircleEmailOnlyOwnerCanSend;
                } else {
                    i = R.string.Lark_Group_GroupSettings_Email_Permission_Admin;
                }
            } else if (this.f89948i) {
                i = R.string.Lark_Groups_CircleEmailOnlyMemberCanSend;
            } else {
                i = R.string.Lark_Group_GroupSettings_Email_Permission_Member;
            }
        }
        this.mGroupMailDetail.setText(UIHelper.getString(i));
    }

    /* renamed from: a */
    private void m135373a(int i, ChatSettingHitPointNew.GroupManageParam groupManageParam, AbstractC34830b bVar) {
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(this.f89940a).title(i)).mo90870a(m135414m())).mo90869a(new UDListDialogController.OnItemClickListener(bVar) {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$GroupOwnershipView$QDBr5aS8pERlzyp7q9uoHpOhmJ4 */
            public final /* synthetic */ GroupOwnershipView.AbstractC34830b f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public final void onItemClick(int i) {
                GroupOwnershipView.m135378a(ChatSettingHitPointNew.GroupManageParam.this, this.f$1, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m135378a(ChatSettingHitPointNew.GroupManageParam groupManageParam, AbstractC34830b bVar, int i) {
        ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN;
        } else {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ALL;
        }
        ChatSettingHitPointNew.m136624a(groupManageParam, managePermissionParams);
        bVar.onAdminSelect(z);
    }

    /* renamed from: a */
    private void m135379a(boolean z, LKUISwitchButton lKUISwitchButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        lKUISwitchButton.setOnCheckedChangeListener(null);
        lKUISwitchButton.setChecked(z);
        lKUISwitchButton.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
