package com.ss.android.lark.chatsetting.impl.group.setting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.DefaultLKUIListDialogItemBinder;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionController;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionItemFactory;
import com.ss.android.lark.chatsetting.impl.chat_function.binder.ChatFunctionBinder;
import com.ss.android.lark.chatsetting.impl.chat_search.ChatSearchMenuController;
import com.ss.android.lark.chatsetting.impl.group.setting.C34939b;
import com.ss.android.lark.chatsetting.impl.group.setting.C34965i;
import com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ChatStatisticUtil;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.topicgroup.TopicGroupHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2932c.C58348f;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupSettingView implements C34965i.AbstractC34968b {

    /* renamed from: t */
    private static final int f90136t = UIHelper.dp2px(48.0f);

    /* renamed from: a */
    AbstractC34461c f90137a;

    /* renamed from: b */
    AbstractC34461c.AbstractC34476o f90138b;

    /* renamed from: c */
    AbstractC34461c.AbstractC34474m f90139c = this.f90137a.mo127279i();

    /* renamed from: d */
    public Context f90140d;

    /* renamed from: e */
    public AbstractC34936a f90141e;

    /* renamed from: f */
    public C34965i.AbstractC34968b.AbstractC34969a f90142f;

    /* renamed from: g */
    public boolean f90143g = C34501a.m133933a();

    /* renamed from: h */
    private CompoundButton.OnCheckedChangeListener f90144h;

    /* renamed from: i */
    private CompoundButton.OnCheckedChangeListener f90145i;

    /* renamed from: j */
    private CompoundButton.OnCheckedChangeListener f90146j;

    /* renamed from: k */
    private C34942d f90147k;

    /* renamed from: l */
    private boolean f90148l;

    /* renamed from: m */
    private boolean f90149m;
    ViewGroup mAddQuickSwitchLayout;
    TextView mAddQuickSwitchSubtitle;
    TextView mAddQuickSwitchTitle;
    TextView mAutoTranslateLabelTv;
    RelativeLayout mAutoTranslateLayout;
    LKUISwitchButton mAutoTranslateSwitch;
    TextView mAutoTranslateTipsTv;
    RelativeLayout mChatBoxLayout;
    View mChatFunctionLayout;
    ChatFunctionView mChatFunctionView;
    View mChatInfoRedesignView;
    TextView mChatSettingTitlt;
    TextView mChatterAllCountTV;
    TextView mDissolveGroupBtn;
    LKUIRoundedImageView2 mGroupAvatarRedesign;
    ImageView mGroupAvatarSecretIv;
    View mGroupBotRegion;
    ImageView mGroupInfoArrow;
    GridView mGroupMemberGv;
    LinearLayout mGroupMemberLayout;
    TextView mGroupMemberTitleTv;
    ImageView mGroupNameIconView;
    TextView mGroupNameTvRedesign;
    ImageView mGroupQrcodeIvRedesign;
    View mGroupRegionDivider;
    RelativeLayout mGroupSettingLayout;
    TextView mGroupSettingTv;
    ImageView mIvSubscribeThreadDesc;
    TextView mLeaveGroupTV;
    TextView mMoveToBoxSubtitle;
    LKUISwitchButton mMoveToBoxSwitchButton;
    TextView mMoveToBoxTitle;
    View mMsgNotifySubtitle;
    TextView mMsgNotifyTV;
    TextView mMuteLayoutBottomDivider;
    View mMuteLayoutWrapper;
    TextView mNickTipTv;
    View mNicknameLayout;
    TextView mNicknameTv;
    TextView mOnCallAboutTvNew;
    ImageView mOnCallDescMoreArrow;
    ImageView mOnCallDescMoreArrowNew;
    RelativeLayout mOnCallDescRegion;
    TextView mOnCallDescTv;
    TextView mOnCallDescTvNew;
    RelativeLayout mOnCallGroupNameLayout;
    TextView mOnCallGroupNameTv;
    LKUIRoundedImageView2 mOnCallHeaderIv;
    ViewGroup mOnCallRegionNew;
    View mRedDot;
    View mReportBtn;
    ScrollView mScrollView;
    View mSearchChatLayout;
    View mSearchChatTitleLayout;
    RecyclerView mSearchChatTypeRv;
    RelativeLayout mSecretChatTransferTo;
    LKUISwitchButton mShortcutSwitchButton;
    View mStartPositionLayout;
    TextView mStartPositionTV;
    LKUISwitchButton mSwitchButton;
    TextView mTeamNameTv;
    ViewGroup mThreadFavoriteLayout;
    LKUISwitchButton mThreadSubscribeSwitch;
    CommonTitleBar mTitleBar;
    TextView mTvSubscribeThreadSubTitle;
    TextView mTvSubscribeThreadTitle;

    /* renamed from: n */
    private boolean f90150n;

    /* renamed from: o */
    private boolean f90151o;

    /* renamed from: p */
    private C34939b f90152p;

    /* renamed from: q */
    private IChatFunctionController f90153q;

    /* renamed from: r */
    private CompoundButton.OnCheckedChangeListener f90154r = new CompoundButton.OnCheckedChangeListener() {
        /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.C349241 */

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.AUTO_TRANSLATION_SWITCH.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
            GroupSettingView.this.f90142f.mo128894d(z);
        }
    };

    /* renamed from: s */
    private C36516a<?> f90155s;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView$a */
    public interface AbstractC34936a {
        /* renamed from: a */
        void mo128842a();

        /* renamed from: a */
        void mo128843a(Context context, String str, boolean z);

        /* renamed from: a */
        void mo128844a(Context context, String str, boolean z, int i);

        /* renamed from: a */
        void mo128845a(Chat chat);

        /* renamed from: a */
        void mo128846a(Chat chat, boolean z);

        /* renamed from: a */
        void mo128847a(GroupSettingView groupSettingView);

        /* renamed from: a */
        void mo128848a(Team team, Chat chat);

        /* renamed from: a */
        void mo128849a(String str);

        /* renamed from: a */
        void mo128850a(String str, String str2);

        /* renamed from: b */
        void mo128851b();

        /* renamed from: b */
        void mo128852b(Chat chat);

        /* renamed from: b */
        void mo128853b(Chat chat, boolean z);

        /* renamed from: b */
        void mo128854b(String str);

        /* renamed from: c */
        void mo128855c(Chat chat);

        /* renamed from: c */
        void mo128856c(String str);

        /* renamed from: d */
        void mo128857d(Chat chat);
    }

    /* renamed from: b */
    private void m135903b(int i) {
    }

    /* renamed from: a */
    public boolean mo128800a(Chat chat) {
        if (chat == null || !chat.isCustomerService()) {
            return false;
        }
        return this.f90138b.mo127413a(chat.getOwnerId());
    }

    /* renamed from: a */
    private void m135900a(boolean z, boolean z2) {
        this.mChatFunctionView.setVisibility(0);
        this.mGroupRegionDivider.setVisibility(8);
        if (z) {
            m135923j(false);
            m135915f(8);
            this.mStartPositionLayout.setVisibility(8);
            this.mNicknameLayout.setVisibility(8);
            m135912d(0);
            this.mOnCallGroupNameLayout.setVisibility(8);
            this.mOnCallDescRegion.setVisibility(8);
            this.mOnCallGroupNameLayout.setVisibility(8);
        } else if (z2) {
            this.mOnCallGroupNameLayout.setVisibility(8);
            this.mOnCallDescRegion.setVisibility(8);
            m135923j(true);
            this.mNicknameLayout.setVisibility(8);
            this.mAddQuickSwitchLayout.setVisibility(8);
            this.mChatBoxLayout.setVisibility(8);
            this.mMuteLayoutWrapper.setVisibility(8);
            m135915f(8);
            this.mAutoTranslateLayout.setVisibility(8);
            this.mStartPositionLayout.setVisibility(8);
            m135917g(8);
            m135903b(8);
        }
        if (ChatSettingModule.m133639a().mo127268a("im.chat.start.from.which.message")) {
            this.mStartPositionLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128794a(Chat chat, List<ChatChatter> list) {
        if (list != null) {
            C34942d dVar = this.f90147k;
            if (dVar != null) {
                dVar.mo128862a(chat, list);
            }
            this.mChatterAllCountTV.setText(String.valueOf(chat.getUserCount()));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128790a(Chat chat, Chat chat2, List<ChatChatter> list) {
        if (chat != null) {
            if (!C34501a.m133936b(chat) || chat2.isSecret()) {
                m135915f(8);
            } else {
                m135915f(0);
            }
            String a = this.f90138b.mo127412a();
            if (!TextUtils.equals(chat2.getOwnerId(), chat.getOwnerId()) || (!TextUtils.equals(a, chat2.getOwnerId()) && chat2.getAddMemberPermission() != chat.getAddMemberPermission())) {
                m135910c(chat, GroupSettingUtils.m136106a(list, chat.getOwnerId()));
            }
            this.mChatterAllCountTV.setText(String.valueOf(chat.getUserCount()));
            if (chat2.getShareCardPermission() != chat.getShareCardPermission()) {
                m135933t(chat);
            }
            if (chat2.getMessagePosition() != chat.getMessagePosition()) {
                mo128789a(chat, chat.getMessagePosition());
            }
            if (chat2.isRemind() != chat.isRemind()) {
                mo128799a(chat.isRemind());
            }
            if (chat2.isInBox() != chat.isInBox()) {
                mo128810c(chat.isInBox());
            }
            if (chat2.isAutoTranslate() != chat.isAutoTranslate()) {
                mo128819f(chat.isAutoTranslate());
            }
            m135924k(chat);
            C34939b bVar = this.f90152p;
            if (bVar != null) {
                bVar.mo128858a(chat);
            }
            m135906b(chat, a);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128799a(boolean z) {
        LKUISwitchButton lKUISwitchButton = this.mSwitchButton;
        if (lKUISwitchButton != null) {
            lKUISwitchButton.setOnCheckedChangeListener(null);
            this.mSwitchButton.setCheckedImmediately(z);
            this.mSwitchButton.setOnCheckedChangeListener(this.f90144h);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: b */
    public void mo128807b(boolean z) {
        this.mShortcutSwitchButton.setOnCheckedChangeListener(null);
        this.mShortcutSwitchButton.setCheckedImmediately(z);
        this.mShortcutSwitchButton.setOnCheckedChangeListener(this.f90145i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128792a(Chat chat, Team team) {
        this.mTitleBar.setTitle(UIHelper.getString(team != null ? R.string.Project_MV_TeamGroupSettings : R.string.Lark_Legacy_Setting));
        if (team == null || TextUtils.isEmpty(team.getName())) {
            this.mTeamNameTv.setText("");
            this.mTeamNameTv.setVisibility(8);
        } else {
            this.mTeamNameTv.setText(team.getName());
            this.mTeamNameTv.setVisibility(0);
        }
        m135925l(chat);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128793a(Chat chat, String str) {
        if (chat != null) {
            boolean z = ChatSettingModule.m133639a().mo127268a("lark.messenger.supergroup.petname") || !chat.isSuper();
            if (this.f90149m || chat.isOnCall() || !z || chat.isAnonymousSecret()) {
                this.mNicknameLayout.setVisibility(8);
                return;
            }
            this.mNicknameLayout.setVisibility(0);
            this.mNicknameTv.setText(str);
            this.mNickTipTv.setText(R.string.Lark_Legacy_AliasInGroup);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128785a() {
        this.f90141e.mo128842a();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128791a(Chat chat, ChatSetting chatSetting, boolean z, String str, ChatChatter chatChatter, boolean z2, TopicGroup topicGroup) {
        boolean isOnCall = chat.isOnCall();
        this.f90148l = isOnCall;
        m135900a(isOnCall, this.f90149m);
        m135918h();
        m135933t(chat);
        m135928o(chat);
        m135897a(chatSetting);
        m135931r(chat);
        m135921i(z);
        m135932s(chat);
        m135913d(chat, chatChatter);
        mo128789a(chat, chat.getMessagePosition());
        mo128793a(chat, str);
        m135927n(chat);
        m135896a(chat, topicGroup);
        m135937x(chat);
        m135924k(chat);
        m135919h(z2);
        m135895a(chat, chatChatter);
        m135906b(chat, chatChatter.getId());
        m135909c(chat, chatChatter);
        m135926m(chat);
        ChatStatisticUtil.m136659b(chat);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128798a(String str) {
        this.f90141e.mo128856c(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128786a(int i) {
        UDToast.show(this.f90140d, i);
    }

    /* renamed from: a */
    private void m135899a(boolean z, final String str, final String str2, boolean z2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str.trim())) {
            if (z2) {
                str = UIHelper.getString(R.string.Lark_Groups_DescriptionEmpty);
            } else {
                str = UIHelper.getString(R.string.Lark_Legacy_EmptyDescription);
            }
        }
        if (z) {
            this.mOnCallDescTv.setText(str);
            this.mOnCallDescTv.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass19 */

                public boolean onPreDraw() {
                    GroupSettingView.this.mOnCallDescTv.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (GroupSettingView.this.mOnCallDescTv.getPaint().measureText(str) > ((float) (GroupSettingView.this.mOnCallDescTv.getWidth() * 4))) {
                        GroupSettingView.this.mOnCallDescMoreArrow.setVisibility(0);
                        GroupSettingView.this.mOnCallDescRegion.setOnClickListener(new View.OnClickListener() {
                            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass19.View$OnClickListenerC349271 */

                            public void onClick(View view) {
                                GroupSettingView.this.f90141e.mo128849a(str2);
                            }
                        });
                        return true;
                    }
                    GroupSettingView.this.mOnCallDescMoreArrow.setVisibility(8);
                    return true;
                }
            });
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: b */
    public void mo128806b(String str) {
        this.f90141e.mo128854b(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128787a(int i, int i2) {
        new C25639g(this.f90140d).mo89248g(i).mo89238b(true).mo89254m(i2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmDone, (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* renamed from: a */
    private boolean m135901a(boolean z, Chat.ShareCardPermission shareCardPermission) {
        return !z && shareCardPermission == Chat.ShareCardPermission.NOT_ALLOWED;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128789a(Chat chat, Chat.MessagePosition messagePosition) {
        if (messagePosition != null) {
            if (messagePosition == Chat.MessagePosition.RECENT_LEFT) {
                if (!chat.isThread()) {
                    this.mStartPositionTV.setText(R.string.Lark_Chat_StartMeAtWhereILeftOff);
                } else {
                    this.mStartPositionTV.setText(R.string.Lark_Legacy_StartMeAtTheFirstUnreadMessage);
                }
            } else if (messagePosition == Chat.MessagePosition.NEWEST_UNREAD) {
                this.mStartPositionTV.setText(R.string.Lark_Legacy_StartMeAtTheLatestUnreadMessage);
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128795a(Chat chat, boolean z) {
        this.f90141e.mo128846a(chat, z);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128797a(Team team, Chat chat) {
        this.f90141e.mo128848a(team, chat);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: a */
    public void mo128788a(Chat chat, int i, int i2) {
        String str;
        String str2;
        String str3;
        boolean w = m135936w(chat);
        if (w) {
            str = UIHelper.getString(R.string.Project_MV_ConfirmLeaveGroup);
        } else if (chat.isThread()) {
            str = UIHelper.getString(R.string.Lark_Groups_LeaveCircleDialogTitle);
        } else if (chat.isOnCall()) {
            str = UIHelper.getString(R.string.Lark_HelpDesk_SettingsLeaveHelpDesk);
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_ChatGroupInfoExitGroup);
        }
        if (w) {
            str2 = UIHelper.getString(R.string.Project_MV_OnceLeftWontLeave);
        } else if (i2 == 5 || i2 == 6) {
            str2 = UIHelper.mustacheFormat((int) R.string.Lark_HelpDesk_DescofLeaveHelpDeskTip, "name", chat.getName());
            str = UIHelper.getString(R.string.Lark_HelpDesk_TitleofLeaveHelpDeskTip);
        } else if (chat.isThread()) {
            str2 = UIHelper.getString(R.string.Lark_Groups_MemberLeaveCircleDialogContent);
        } else {
            str2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatGroupInfoExitGroupNotify, "chatName", chat.getName());
        }
        if (w) {
            str3 = UIHelper.getString(R.string.Lark_Legacy_Confirm);
        } else {
            str3 = UIHelper.getString(R.string.Lark_Legacy_LeaveConfirm);
        }
        String string = UIHelper.getString(R.string.Lark_Legacy_Cancel);
        AbstractC34461c.AbstractC34465d l = ChatSettingModule.m133639a().mo127282l();
        boolean a = l.mo127309a(i);
        if (chat.isMeeting() && !l.mo127311b(i)) {
            if (a) {
                str2 = UIUtils.getString(this.f90140d, R.string.Lark_Legacy_ChatGroupInfoExitMeetingNotifyOrganizer);
            } else {
                str2 = UIUtils.getString(this.f90140d, R.string.Lark_Legacy_ChatGroupInfoExitMeetingNotify);
            }
        }
        new C25639g(this.f90140d).mo89237b(str).mo89238b(true).mo89242c(str2).mo89225a(R.id.lkui_dialog_btn_left, string, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$zKmIYzS0FabJ8gTlKCWUX4nOJF8 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                GroupSettingView.lambda$zKmIYzS0FabJ8gTlKCWUX4nOJF8(GroupSettingView.this, dialogInterface, i);
            }
        }).mo89225a(R.id.lkui_dialog_btn_right, str3, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$AGUTbL0lKzRkZ7fM9I5ifzmnm0 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                GroupSettingView.m270446lambda$AGUTbL0lKzRkZ7fM9I5ifzmnm0(GroupSettingView.this, dialogInterface, i);
            }
        }).mo89233b().show();
        ChatSettingHitPointNew.m136647k();
    }

    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ Team m135920i() {
        return this.f90142f.mo128904l();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        IChatFunctionController cVar = this.f90153q;
        if (cVar != null) {
            cVar.mo127563c();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: b */
    public void mo128801b() {
        this.f90141e.mo128851b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f90141e.mo128847a(this);
        m135900a(this.f90148l, this.f90149m);
        m135916g();
    }

    /* renamed from: d */
    public void mo128811d() {
        ChatSettingHitPointNew.m136652m(ChatSettingExtraParams.Click.CANCEL.plus(TARGET_NONE.f135700a));
    }

    /* renamed from: e */
    public boolean mo128816e() {
        return ChatSettingModule.m133639a().mo127278h().mo127395a();
    }

    /* renamed from: c */
    public void mo128808c() {
        ChatSettingHitPointNew.m136652m(ChatSettingExtraParams.Click.CONFIRM.plus(TARGET_NONE.f135700a));
    }

    /* renamed from: f */
    public C34974n mo128817f() {
        return new C34974n(UIHelper.getString(R.string.Lark_Legacy_StartMeAtTheLatestUnreadMessage), Chat.MessagePosition.NEWEST_UNREAD);
    }

    /* renamed from: g */
    private void m135916g() {
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setVisibility(8);
            DesktopUtil.m144299a(this.mGroupMemberTitleTv, this.mOnCallAboutTvNew, this.mNickTipTv, this.mTvSubscribeThreadTitle, this.mAddQuickSwitchTitle, this.mMoveToBoxTitle, this.mMsgNotifyTV, this.mChatSettingTitlt, this.mAutoTranslateLabelTv, this.mGroupSettingTv, this.mLeaveGroupTV);
            DesktopUtil.m144306b(this.mChatterAllCountTV, this.mOnCallDescTvNew, this.mNicknameTv, this.mTvSubscribeThreadSubTitle, this.mAddQuickSwitchSubtitle, this.mMoveToBoxSubtitle, this.mStartPositionTV, this.mAutoTranslateTipsTv, (TextView) this.mReportBtn);
            DesktopUtil.m144298a(this.mNicknameLayout, this.mAddQuickSwitchLayout, this.mMuteLayoutWrapper, this.mGroupSettingLayout, this.mLeaveGroupTV);
            DesktopUtil.m144305b(this.mOnCallRegionNew, this.mThreadFavoriteLayout, this.mChatBoxLayout, this.mStartPositionLayout, this.mAutoTranslateLayout);
        }
    }

    /* renamed from: h */
    private void m135918h() {
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.getCenterText().getPaint().setFakeBoldText(true);
        boolean a = DesktopUtil.m144301a(this.f90140d);
        int i = R.string.Lark_Legacy_Setting;
        if (a) {
            this.mTitleBar.setLeftVisible(true);
            this.mTitleBar.setLeftText(UIHelper.getString(R.string.Lark_Legacy_Setting));
            this.mTitleBar.setLeftImageDrawable(null);
            this.mTitleBar.getLeftText().setTypeface(Typeface.defaultFromStyle(1));
            this.mTitleBar.setLeftTextSize((float) CommonTitleBarConstants.DEFAULT_LEFT_TEXT_SIZE);
            this.mTitleBar.setLeftClickListener(null);
            this.mTitleBar.setMainTitleVisible(false);
            return;
        }
        if (this.f90142f.mo128903k()) {
            i = R.string.Project_MV_TeamGroupSettings;
        }
        this.mTitleBar.setTitle(UIHelper.getString(i));
        this.mTitleBar.setLeftVisible(true);
        CommonTitleBar commonTitleBar = this.mTitleBar;
        Context context = this.f90140d;
        commonTitleBar.addAction(new IActionTitlebar.C57573a(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_share_outlined, UDColorUtils.getColor(context, R.color.icon_n1))) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass18 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.SHARE_GROUP_CARD.plus(ChatSettingExtraParams.Target.IM_SHARE_GROUP_VIEW));
                GroupSettingView.this.f90142f.mo128886a();
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C34965i.AbstractC34968b.AbstractC34969a aVar) {
        this.f90142f = aVar;
    }

    /* renamed from: d */
    private void m135912d(int i) {
        this.mOnCallRegionNew.setVisibility(i);
    }

    /* renamed from: e */
    private void m135914e(int i) {
        this.mSecretChatTransferTo.setVisibility(i);
    }

    /* renamed from: g */
    private void m135917g(int i) {
        this.mLeaveGroupTV.setVisibility(i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: f */
    public void mo128818f(Chat chat) {
        this.f90141e.mo128855c(chat);
    }

    /* renamed from: c */
    private void m135907c(int i) {
        this.mAddQuickSwitchLayout.setVisibility(i);
        this.mChatBoxLayout.setVisibility(i);
        this.mMuteLayoutWrapper.setVisibility(i);
    }

    /* renamed from: f */
    private void m135915f(int i) {
        RelativeLayout relativeLayout = this.mGroupSettingLayout;
        if (relativeLayout != null && this.mScrollView != null) {
            relativeLayout.setVisibility(i);
        }
    }

    /* renamed from: i */
    private void m135921i(boolean z) {
        this.mShortcutSwitchButton.setCheckedImmediately(z);
    }

    /* renamed from: k */
    private void m135924k(Chat chat) {
        int i;
        View view = this.mRedDot;
        if (chat.getPutChatterApplyCount() > 0) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: s */
    private void m135932s(Chat chat) {
        m135934u(chat);
        this.mGroupSettingLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass21 */

            public void onClick(View view) {
                GroupSettingView.this.f90142f.mo128893d();
            }
        });
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: g */
    public void mo128820g(Chat chat) {
        this.f90141e.mo128845a(chat);
    }

    /* renamed from: h */
    private void m135919h(boolean z) {
        int i = 0;
        if (!ChatSettingModule.m133639a().mo127261F()) {
            z = false;
        }
        View view = this.mReportBtn;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: j */
    private void m135923j(boolean z) {
        boolean z2;
        if (DesktopUtil.m144307b() || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mTitleBar.setRightVisible(z2);
    }

    /* renamed from: l */
    private void m135925l(Chat chat) {
        int i;
        if (this.mGroupMemberTitleTv != null) {
            if (chat == null || !chat.isThread()) {
                i = R.string.Lark_Legacy_member;
            } else {
                i = R.string.Lark_Groups_member;
            }
            this.mGroupMemberTitleTv.setText(UIUtils.getString(this.f90140d, i));
        }
    }

    /* renamed from: r */
    private void m135931r(Chat chat) {
        this.mMoveToBoxSwitchButton.setCheckedImmediately(chat.isInBox());
        mo128813d(chat.isInBox());
    }

    /* renamed from: w */
    private boolean m135936w(Chat chat) {
        if (!this.f90143g || !chat.isTeam() || chat.getTeamChatType() != TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: b */
    public void mo128802b(Chat chat) {
        m135934u(chat);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: e */
    public void mo128814e(Chat chat) {
        if (!chat.isTeam() || !this.f90143g) {
            this.f90141e.mo128852b(chat);
        } else {
            UDToast.makeToast(this.f90140d, (int) R.string.Project_MV_GroupsInTeamCantShare).show();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: g */
    public void mo128821g(boolean z) {
        this.mThreadSubscribeSwitch.setChecked(z);
    }

    /* renamed from: i */
    public C34974n mo128823i(Chat chat) {
        String str;
        if (!chat.isThread()) {
            str = UIHelper.getString(R.string.Lark_Chat_StartMeAtWhereILeftOff);
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_StartMeAtTheFirstUnreadMessage);
        }
        return new C34974n(str, Chat.MessagePosition.RECENT_LEFT);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m135893a(View view) {
        this.f90142f.mo128902j();
        ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.EDIT_GROUP_INFO.plus(ChatSettingExtraParams.Target.IM_EDIT_GROUP_INFO_VIEW));
    }

    /* renamed from: j */
    private void m135922j(Chat chat) {
        if (this.mGroupNameIconView != null) {
            if (TeamChatType.TEAM_CHAT_TYPE_PRIVATE == chat.getTeamChatType()) {
                ImageView imageView = this.mGroupNameIconView;
                Context context = this.f90140d;
                imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_lock_outlined, UIUtils.getColor(context, R.color.icon_n3)));
                this.mGroupNameIconView.setVisibility(0);
                return;
            }
            this.mGroupNameIconView.setVisibility(8);
        }
    }

    /* renamed from: p */
    private boolean m135929p(Chat chat) {
        if (!chat.isThread() || (!ChatSettingModule.m133639a().mo127268a("group.topiclist.sort.reverse.v2") && ChatSettingModule.m133639a().mo127268a("group.topiclist.sort.normal"))) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private void m135930q(Chat chat) {
        if (!this.f90142f.mo128898f()) {
            this.mChatBoxLayout.setVisibility(8);
        } else if (chat.isSecret() || this.f90149m) {
            this.mChatBoxLayout.setVisibility(8);
        } else {
            this.mChatBoxLayout.setVisibility(0);
        }
    }

    /* renamed from: t */
    private void m135933t(Chat chat) {
        Chat.ShareCardPermission shareCardPermission = chat.getShareCardPermission();
        if (chat.isSecret() || m135901a(C34501a.m133936b(chat), shareCardPermission) || chat.isOnCall()) {
            m135923j(false);
        } else {
            m135923j(true);
        }
    }

    /* renamed from: e */
    public void mo128815e(boolean z) {
        if (!z) {
            m135907c(8);
        } else if (this.f90151o) {
            m135907c(8);
            TopicGroupHitPoint.f90524a.mo129281a(1);
        } else {
            m135907c(0);
            TopicGroupHitPoint.f90524a.mo129281a(0);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: f */
    public void mo128819f(boolean z) {
        this.mAutoTranslateSwitch.setCheckedImmediatelyNoEvent(z);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: h */
    public void mo128822h(final Chat chat) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f90140d).message(R.string.Lark_Group_NoOtherMembersLeaveWillDisbandTitle)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Group_NoOtherMembersLeaveWillDisbandButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.DialogInterface$OnClickListenerC349326 */

            public void onClick(DialogInterface dialogInterface, int i) {
                GroupSettingView.this.mo128808c();
                GroupSettingView.this.f90142f.mo128897f(chat.isSecret());
            }
        })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Group_Cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.DialogInterface$OnClickListenerC349315 */

            public void onClick(DialogInterface dialogInterface, int i) {
                GroupSettingView.this.mo128811d();
            }
        })).show();
        ChatSettingHitPointNew.m136647k();
    }

    /* renamed from: m */
    private void m135926m(Chat chat) {
        if (chat.isP2PChat() || chat.isSecret() || chat.isCrossWithKa()) {
            Log.i("GroupSettingView", "group region not show, , " + chat.isP2PChat() + " ," + chat.isSecret() + " ," + chat.isCrossWithKa());
        } else if (this.mGroupBotRegion != null) {
            Log.i("GroupSettingView", "group region enable show entry");
            this.mGroupBotRegion.setVisibility(0);
            this.mGroupBotRegion.setOnClickListener(new View.OnClickListener(chat) {
                /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$VoqmmwcnTP72NOks5V8TX6htF4 */
                public final /* synthetic */ Chat f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    GroupSettingView.m270447lambda$VoqmmwcnTP72NOks5V8TX6htF4(GroupSettingView.this, this.f$1, view);
                }
            });
        } else {
            Log.e("GroupSettingView", "mGroupBotRegion is null");
        }
    }

    /* renamed from: n */
    private void m135927n(Chat chat) {
        boolean z;
        boolean z2 = true;
        if (chat.isSecret() || !this.f90137a.mo127283m().mo127389a() || this.f90149m) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.mAutoTranslateLayout.setVisibility(0);
            this.mMuteLayoutWrapper.setBackgroundResource(R.drawable.bg_setting_group_item_rectangle);
            if (chat == null || !chat.isAutoTranslate()) {
                z2 = false;
            }
            this.mAutoTranslateSwitch.setCheckedImmediatelyNoEvent(z2);
            return;
        }
        this.mAutoTranslateLayout.setVisibility(8);
        this.mMuteLayoutWrapper.setBackgroundResource(R.drawable.bg_setting_group_item_round_bottom);
    }

    /* renamed from: o */
    private void m135928o(Chat chat) {
        if (chat.isOnCall()) {
            this.mStartPositionLayout.setVisibility(8);
            this.mOnCallGroupNameLayout.setVisibility(8);
            this.mOnCallDescRegion.setVisibility(8);
        }
        if (chat.isSecret()) {
            this.mStartPositionLayout.setVisibility(8);
            this.mMuteLayoutBottomDivider.setVisibility(8);
        }
        if (m135929p(chat)) {
            this.mStartPositionLayout.setVisibility(8);
            this.mMuteLayoutBottomDivider.setVisibility(8);
        }
        String avatarKey = chat.getAvatarKey();
        if (chat.isOnCall()) {
            AbstractC34461c.AbstractC34474m mVar = this.f90139c;
            Context context = this.f90140d;
            String id = chat.getId();
            LKUIRoundedImageView2 lKUIRoundedImageView2 = this.mOnCallHeaderIv;
            int i = f90136t;
            mVar.mo127409a(context, avatarKey, id, lKUIRoundedImageView2, i, i);
        }
        m135899a(chat.isOnCall(), chat.getDescription(), chat.getId(), chat.isThread());
        if (chat.isOnCall()) {
            this.mOnCallGroupNameTv.setText(chat.getName());
        }
        m135930q(chat);
    }

    /* renamed from: u */
    private void m135934u(Chat chat) {
        if (chat.isOnCall()) {
            m135915f(8);
            m135935v(chat);
            return;
        }
        if (C34501a.m133936b(chat)) {
            if (chat.isSecret()) {
                m135915f(8);
            } else {
                m135915f(0);
            }
            if (chat.isThread()) {
                this.mGroupSettingTv.setText(UIUtils.getString(this.f90140d, R.string.Lark_Groups_GroupsManagementSetting));
            } else {
                this.mGroupSettingTv.setText(UIUtils.getString(this.f90140d, R.string.Lark_Legacy_GroupManagementSetting));
            }
        } else {
            m135915f(8);
        }
        m135935v(chat);
    }

    /* renamed from: v */
    private void m135935v(final Chat chat) {
        int i = 8;
        if (!C34501a.m133934a(chat)) {
            this.mDissolveGroupBtn.setVisibility(8);
            m135914e(8);
            this.mScrollView.findViewById(R.id.dissolve_group_top_divider).setVisibility(8);
            return;
        }
        if (chat.isCustomerService()) {
            this.mDissolveGroupBtn.setVisibility(8);
            this.mScrollView.findViewById(R.id.dissolve_group_top_divider).setVisibility(8);
            this.mLeaveGroupTV.setBackgroundResource(R.drawable.bg_setting_group_item_round);
        } else {
            this.mDissolveGroupBtn.setVisibility(0);
            this.mScrollView.findViewById(R.id.dissolve_group_top_divider).setVisibility(0);
            this.mLeaveGroupTV.setBackgroundResource(R.drawable.bg_setting_group_item_round_top);
        }
        if (chat.isSecret() && !chat.isAnonymousSecret()) {
            i = 0;
        }
        m135914e(i);
        this.mSecretChatTransferTo.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.View$OnClickListenerC349282 */

            public void onClick(View view) {
                GroupSettingView.this.f90142f.mo128901i();
            }
        });
        this.mDissolveGroupBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.View$OnClickListenerC349293 */

            public void onClick(View view) {
                if (!GroupSettingView.this.f90143g || !chat.isTeam() || GroupSettingView.this.f90142f.mo128904l() == null || !String.valueOf(GroupSettingView.this.f90142f.mo128904l().getDefaultChatId()).equals(chat.getId())) {
                    ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.DISMISS_GROUP.plus(ChatSettingExtraParams.Target.IM_DISMISS_GROUP_CONFIRM_VIEW));
                    GroupHitPoint.f90519a.mo129252j(chat.getId());
                    GroupSettingView.this.mo128812d(chat);
                    return;
                }
                UDToast.show(GroupSettingView.this.f90140d, (int) R.string.Project_MV_CommunicationCannotResolve);
            }
        });
    }

    /* renamed from: x */
    private void m135937x(final Chat chat) {
        int i;
        if (!mo128800a(chat)) {
            this.mLeaveGroupTV.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.View$OnClickListenerC349337 */

                public void onClick(View view) {
                    if (!GroupSettingView.this.f90143g || !chat.isTeam() || chat.getTeamChatType() == TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
                        SettingHitPoint.m136748a(chat);
                        SettingHitPoint.m136749a(chat.getId());
                        GroupHitPoint.f90519a.mo129257l(chat);
                        ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.QUIT_GROUP.plus(ChatSettingExtraParams.Target.IM_QUIT_GROUP_CONFIRM_VIEW));
                        GroupSettingView.this.f90142f.mo128889b();
                        return;
                    }
                    UDToast.show(GroupSettingView.this.f90140d, (int) R.string.Project_Be_FeatureDisabledGoToSettings);
                }
            });
        }
        C349348 r0 = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.C349348 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingHitPoint.f90520a.mo129279d(chat, z);
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.NOTIFICATION_SWITCH.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
                GroupSettingView.this.f90142f.mo128888a(z);
                if (!z && GroupSettingView.this.mo128816e()) {
                    UDToast.show(GroupSettingView.this.f90140d, (int) R.string.Lark_Feed_MovedToMutedToast);
                }
            }
        };
        this.f90144h = r0;
        this.mSwitchButton.setOnCheckedChangeListener(r0);
        View view = this.mMsgNotifySubtitle;
        if (mo128816e()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        C349359 r02 = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.C349359 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingHitPoint.f90520a.mo129274b(chat, z);
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.QUICKSWITCHER_SWITCH.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
                GroupSettingView.this.f90142f.mo128890b(z);
            }
        };
        this.f90145i = r02;
        this.mShortcutSwitchButton.setOnCheckedChangeListener(r02);
        this.mStartPositionLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass10 */

            public void onClick(View view) {
                if (DesktopUtil.m144307b()) {
                    new C58348f.C58350a(GroupSettingView.this.f90140d).mo197586a(UIHelper.getDrawable(R.drawable.setting_menu_desktop_bg)).mo197584a(0, UIHelper.getString(R.string.Lark_Chat_StartMeAtWhereILeftOff), null).mo197584a(1, UIHelper.getString(R.string.Lark_Legacy_StartMeAtTheLatestUnreadMessage), null).mo197587a(new C58348f.AbstractC58353d(chat) {
                        /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$10$iTN3vhc6sfmWEO_6qKQV3eSmFh0 */
                        public final /* synthetic */ Chat f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.lark.widget.p2932c.C58348f.AbstractC58353d
                        public final void onMenuItemClick(int i, View view) {
                            GroupSettingView.AnonymousClass10.lambda$iTN3vhc6sfmWEO_6qKQV3eSmFh0(GroupSettingView.AnonymousClass10.this, this.f$1, i, view);
                        }
                    }).mo197581a().showAsDropDown(GroupSettingView.this.mStartPositionLayout, -UIHelper.dp2px(224.0f), -UIHelper.dp2px(90.0f), 8388613);
                    return;
                }
                ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(GroupSettingView.this.f90140d).mo89248g(R.string.Lark_Legacy_WhenIViewAChat)).mo89205a(Arrays.asList(GroupSettingView.this.mo128823i(chat), GroupSettingView.this.mo128817f()))).mo89203a(new DefaultLKUIListDialogItemBinder<C34974n>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass10.C349251 */
                })).mo89202a(new DialogInterface.OnClickListener(chat) {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$10$rESLYAaHBzL5bLii7cLvweAP0 */
                    public final /* synthetic */ Chat f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        GroupSettingView.AnonymousClass10.m270451lambda$rESLYAaHBzL5bLii7cLvweAP0(GroupSettingView.AnonymousClass10.this, this.f$1, dialogInterface, i);
                    }
                })).mo89224a(R.id.lkui_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).mo89239c();
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m135977a(Chat chat, int i, View view) {
                if (i == 0) {
                    GroupSettingView.this.mo128803b(chat, Chat.MessagePosition.RECENT_LEFT);
                } else if (i == 1) {
                    GroupSettingView.this.mo128803b(chat, Chat.MessagePosition.NEWEST_UNREAD);
                } else {
                    GroupSettingView.this.mo128803b(chat, Chat.MessagePosition.UNKNOWN);
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m135978a(Chat chat, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    GroupSettingView.this.mo128803b(chat, Chat.MessagePosition.RECENT_LEFT);
                } else if (i != 1) {
                    GroupSettingView.this.mo128803b(chat, Chat.MessagePosition.UNKNOWN);
                } else {
                    GroupSettingView.this.mo128803b(chat, Chat.MessagePosition.NEWEST_UNREAD);
                }
            }
        });
        this.mNicknameLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass11 */

            public void onClick(View view) {
                GroupHitPoint.f90519a.mo129254k(chat);
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.ALIAS.plus(ChatSettingExtraParams.Target.IM_EDIT_ALIAS_VIEW));
                GroupSettingView.this.f90141e.mo128850a(chat.getId(), GroupSettingView.this.mNicknameTv.getText().toString());
            }
        });
        AnonymousClass13 r03 = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass13 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingHitPoint.f90520a.mo129277c(chat, z);
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.CHAT_BOX_SWITCH.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
                GroupSettingView.this.f90142f.mo128892c(z);
            }
        };
        this.f90146j = r03;
        this.mMoveToBoxSwitchButton.setOnCheckedChangeListener(r03);
        this.mAutoTranslateSwitch.setOnCheckedChangeListener(this.f90154r);
        this.mReportBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass14 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.REPORT.plus(TARGET_NONE.f135700a));
                GroupSettingView.this.f90142f.mo128899g();
            }
        });
    }

    /* renamed from: d */
    public void mo128812d(Chat chat) {
        String str;
        String str2;
        float f;
        boolean isSecret = chat.isSecret();
        boolean isMeeting = chat.isMeeting();
        OwnershipHitPoint.f90525a.mo129285a(chat.getId());
        if (isSecret) {
            str = UIHelper.getString(R.string.Lark_Legacy_DisbandGroup);
            str2 = UIHelper.getString(R.string.Lark_Legacy_SecretChatDisbandNow);
        } else if (isMeeting) {
            str = UIHelper.getString(R.string.Lark_Legacy_DissolveGroupDialogTitle);
            str2 = UIHelper.getString(R.string.Lark_Legacy_GroupSettingDisbandMeetingDeccribe);
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_DissolveGroupDialogTitle);
            str2 = UIHelper.getString(R.string.Lark_Legacy_GroupSettingDisbandDeccribe);
        }
        C25639g b = new C25639g(this.f90140d).mo89237b(str);
        if (DesktopUtil.m144301a(this.f90140d)) {
            f = 0.7f;
        } else {
            f = -1.0f;
        }
        b.mo89245d(f).mo89238b(true).mo89242c(str2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener(isSecret) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$mW3nEZy548vDmMhZsOzwvv01HJc */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                GroupSettingView.lambda$mW3nEZy548vDmMhZsOzwvv01HJc(GroupSettingView.this, this.f$1, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.DialogInterface$OnClickListenerC349304 */

            public void onClick(DialogInterface dialogInterface, int i) {
                ChatSettingHitPointNew.m136653n(ChatSettingExtraParams.Click.CANCEL.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
            }
        }).mo89238b(true).mo89233b().show();
        ChatSettingHitPointNew.m136649l();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: c */
    public void mo128809c(Chat chat) {
        this.f90141e.mo128857d(chat);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: d */
    public void mo128813d(boolean z) {
        if (z) {
            if (this.mSwitchButton.isChecked()) {
                this.mSwitchButton.setChecked(false);
                this.f90142f.mo128888a(false);
            }
            this.mMsgNotifyTV.setEnabled(false);
            this.mSwitchButton.setEnabled(false);
        } else if (!this.f90142f.mo128905m()) {
            this.mMsgNotifyTV.setEnabled(true);
            this.mSwitchButton.setEnabled(true);
        } else if (this.f90142f.mo128906n()) {
            Log.w("GroupSettingView", "hidden team chat is not muted");
        } else {
            this.mMsgNotifyTV.setEnabled(false);
            this.mSwitchButton.setEnabled(false);
        }
    }

    /* renamed from: a */
    private void m135897a(ChatSetting chatSetting) {
        boolean z;
        if (chatSetting == null || !chatSetting.isRemind()) {
            z = false;
        } else {
            z = true;
        }
        this.mSwitchButton.setCheckedImmediately(z);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: c */
    public void mo128810c(boolean z) {
        this.mMoveToBoxSwitchButton.setOnCheckedChangeListener(null);
        this.mMoveToBoxSwitchButton.setCheckedImmediately(z);
        this.mMoveToBoxSwitchButton.setOnCheckedChangeListener(this.f90146j);
        mo128813d(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m135904b(DialogInterface dialogInterface, int i) {
        mo128811d();
    }

    /* renamed from: c */
    private void m135910c(Chat chat, List<ChatChatter> list) {
        C34942d dVar = this.f90147k;
        if (dVar != null) {
            dVar.mo128864a(list, chat);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m135892a(DialogInterface dialogInterface, int i) {
        mo128808c();
        this.f90142f.mo128895e();
    }

    /* renamed from: a */
    private String m135890a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (z) {
            return UIHelper.getString(R.string.Lark_Groups_DescriptionEmpty);
        }
        return UIHelper.getString(R.string.Lark_Legacy_EmptyDescription);
    }

    /* renamed from: b */
    private List<IChatFunctionItem> m135902b(Chat chat, ChatChatter chatChatter) {
        if (!chat.isThread()) {
            return ChatFunctionItemFactory.f89092a.mo127584a(chat, chatChatter, null);
        }
        if (this.f90150n) {
            return ChatFunctionItemFactory.f89092a.mo127583a(chat);
        }
        if (this.f90149m) {
            return ChatFunctionItemFactory.f89092a.mo127585a(chat, null, null, false);
        }
        return ChatFunctionItemFactory.f89092a.mo127585a(chat, null, null, true);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m135908c(Chat chat, View view) {
        ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.SEARCH.plus(ChatSettingExtraParams.Target.IM_CHAT_HISTORY_VIEW));
        SettingHitPoint.f90520a.mo129268a(chat, -1);
        ChatSettingModule.m133639a().mo127288r().mo127436a(chat.getId());
        this.f90141e.mo128843a(this.f90140d, chat.getId(), chat.isThread());
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m135894a(Chat chat, View view) {
        ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.GROUP_BOT.plus(ChatSettingExtraParams.Target.OPENPLATFORM_GROUPBOT_VISIT_BOTLIST_VIEW));
        ChatSettingModule.m133639a().mo127289s().mo127410a(this.f90140d, chat.getId(), chat.isCrossTenant());
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m135905b(Chat chat, View view) {
        PhotoItem photoItem = new PhotoItem();
        photoItem.setType(4);
        photoItem.setImageKey(chat.getAvatarKey());
        photoItem.setEntityId(chat.getEntityId());
        C58630d.m227364a().mo198658a(view).mo198667a(new ArrayList<PhotoItem>(photoItem) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass15 */
            final /* synthetic */ PhotoItem val$photoItem;

            {
                this.val$photoItem = r2;
                add(r2);
            }
        }).mo198675d(true).mo198669a((Activity) this.f90140d);
    }

    /* renamed from: c */
    private void m135909c(Chat chat, ChatChatter chatChatter) {
        boolean z;
        if (chatChatter.getOnCallRole() == 5 || chatChatter.getOnCallRole() == 6) {
            z = true;
        } else {
            z = false;
        }
        boolean a = ChatSettingModule.m133639a().mo127284n().mo127297a("leanMode");
        if (chat.isSecret() || z || a) {
            this.mSearchChatLayout.setVisibility(8);
            return;
        }
        this.mSearchChatTitleLayout.setOnClickListener(new View.OnClickListener(chat) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$4eNzm6UJDxGUr_zppYVrrhpi9o */
            public final /* synthetic */ Chat f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                GroupSettingView.m270445lambda$4eNzm6UJDxGUr_zppYVrrhpi9o(GroupSettingView.this, this.f$1, view);
            }
        });
        ChatSearchMenuController.f89121e.mo127604a(this.f90140d, this.mSearchChatTypeRv, chat, new ChatSearchMenuController.SearchDelegate() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$knKM3mgwr3p1l4o4AqBTXgLhKI */

            @Override // com.ss.android.lark.chatsetting.impl.chat_search.ChatSearchMenuController.SearchDelegate
            public final void gotoSearchHistoryActivity(Context context, String str, boolean z, int i) {
                GroupSettingView.m270449lambda$knKM3mgwr3p1l4o4AqBTXgLhKI(GroupSettingView.this, context, str, z, i);
            }
        });
    }

    /* renamed from: d */
    private void m135913d(Chat chat, ChatChatter chatChatter) {
        if (chat.isOnCall()) {
            if (chatChatter.getOnCallRole() == 3 || chatChatter.getOnCallRole() == 4) {
                m135917g(8);
            } else {
                this.mLeaveGroupTV.setText(this.f90140d.getText(R.string.Lark_HelpDesk_SettingsLeaveHelpDesk));
            }
        } else if (chat.isSecret()) {
            this.mLeaveGroupTV.setText(UIHelper.getString(R.string.Lark_Legacy_LeaveChat));
        } else if (chat.isThread()) {
            this.mLeaveGroupTV.setText(this.f90140d.getText(R.string.Lark_Groups_GroupsInfoExitGroup));
        } else {
            this.mLeaveGroupTV.setText(this.f90140d.getText(R.string.Lark_Legacy_LeaveGroup));
        }
    }

    /* renamed from: a */
    private void m135895a(Chat chat, ChatChatter chatChatter) {
        List<IChatFunctionItem> b = m135902b(chat, chatChatter);
        if (DesktopUtil.m144301a(this.f90140d) || CollectionUtils.isEmpty(b)) {
            this.mChatFunctionLayout.setVisibility(8);
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f90140d, 5);
        this.mChatFunctionView.setPaddingRelative(UIHelper.dp2px(8.0f), 0, UIHelper.dp2px(8.0f), 0);
        this.mChatFunctionView.getRecyclerView().setPaddingRelative(0, 0, 0, 0);
        ChatFunctionController.Companion aVar = ChatFunctionController.f89013f;
        Context context = this.f90140d;
        this.f90153q = aVar.mo127566a(context, chat, null, this.mChatFunctionView, new ChatFunctionBinder(context), gridLayoutManager, b);
    }

    /* renamed from: b */
    private void m135906b(final Chat chat, String str) {
        int i;
        int i2;
        boolean h = this.f90142f.mo128900h();
        chat.isThread();
        int i3 = 0;
        if (chat.isOnCall()) {
            final String a = m135890a(chat.getDescription(), false);
            this.mOnCallDescTvNew.setText(a);
            this.mOnCallDescTvNew.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass12 */

                public boolean onPreDraw() {
                    GroupSettingView.this.mOnCallDescTvNew.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (GroupSettingView.this.mOnCallDescTvNew.getPaint().measureText(a) > ((float) (GroupSettingView.this.mOnCallDescTvNew.getWidth() * 4))) {
                        GroupSettingView.this.mOnCallDescMoreArrowNew.setVisibility(0);
                        GroupSettingView.this.mOnCallRegionNew.setOnClickListener(new View.OnClickListener(chat) {
                            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$12$Z4lNQuu2CJBsYTaET5OJ5Fr1Cw */
                            public final /* synthetic */ Chat f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void onClick(View view) {
                                GroupSettingView.AnonymousClass12.m270452lambda$Z4lNQuu2CJBsYTaET5OJ5Fr1Cw(GroupSettingView.AnonymousClass12.this, this.f$1, view);
                            }
                        });
                        return true;
                    }
                    GroupSettingView.this.mOnCallDescMoreArrowNew.setVisibility(8);
                    return true;
                }

                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m135979a(Chat chat, View view) {
                    GroupSettingView.this.f90141e.mo128849a(chat.getId());
                }
            });
        }
        ChatSettingModule.m133639a().mo127279i().mo127409a(this.f90140d, chat.getAvatarKey(), chat.getEntityId(), this.mGroupAvatarRedesign, UIHelper.dp2px(48.0f), UIHelper.dp2px(48.0f));
        this.mGroupAvatarRedesign.setOnClickListener(new View.OnClickListener(chat) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$6yDTWqiZxvSTxwop6JGQaCc8mYU */
            public final /* synthetic */ Chat f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                GroupSettingView.lambda$6yDTWqiZxvSTxwop6JGQaCc8mYU(GroupSettingView.this, this.f$1, view);
            }
        });
        if (TextUtils.isEmpty(chat.getTeamName())) {
            this.mTeamNameTv.setText("");
            this.mTeamNameTv.setVisibility(8);
        } else {
            this.mTeamNameTv.setText(chat.getTeamName());
            this.mTeamNameTv.setVisibility(0);
        }
        m135922j(chat);
        this.mGroupNameTvRedesign.setText(chat.getName());
        LarkNameTag.m92203a(this.f90140d).mo90040k(chat.isTenant()).mo90038i(chat.is_department()).mo90041l(chat.isPublic()).mo90027e().mo90004a(this.mGroupNameTvRedesign);
        if (chat.isOnCall() || !m135911c(chat, str)) {
            i = 8;
        } else {
            i = 0;
        }
        if (chat.isOnCall() || (!h && !m135911c(chat, str))) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.mGroupQrcodeIvRedesign.setVisibility(i);
        this.mGroupInfoArrow.setVisibility(i2);
        ImageView imageView = this.mGroupAvatarSecretIv;
        if (!chat.isSecret()) {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        if (i2 == 0) {
            this.mChatInfoRedesignView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$jnnXopRiicLMPDsaMCNSREafig */

                public final void onClick(View view) {
                    GroupSettingView.m270448lambda$jnnXopRiicLMPDsaMCNSREafig(GroupSettingView.this, view);
                }
            });
        }
    }

    /* renamed from: c */
    private boolean m135911c(Chat chat, String str) {
        if (chat.isSecret()) {
            return false;
        }
        if (this.f90143g && chat.isTeam()) {
            return false;
        }
        if (!C34501a.m133936b(chat) && chat.getShareCardPermission() != Chat.ShareCardPermission.ALLOWED) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m135896a(Chat chat, TopicGroup topicGroup) {
        if (chat == null || chat.getChatMode() != Chat.ChatMode.THREAD_V2 || this.f90149m || !ChatSettingModule.m133639a().mo127268a("group.subscribe.enable")) {
            this.mThreadFavoriteLayout.setVisibility(8);
            return;
        }
        this.mThreadFavoriteLayout.setVisibility(0);
        this.mIvSubscribeThreadDesc.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass16 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                View inflate = LayoutInflater.from(GroupSettingView.this.f90140d).inflate(R.layout.setting_thread_subscribe_desc_layout, (ViewGroup) null);
                final DialogC25637f b = new C25639g(GroupSettingView.this.f90140d).mo89236b(inflate).mo89257p(17).mo89245d(0.3f).mo89233b();
                ((LKUIButton) inflate.findViewById(R.id.lkbtn_sure)).setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass16.C349261 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        b.dismiss();
                    }
                });
                b.show();
            }
        });
        if (!(topicGroup == null || topicGroup.getUserSetting() == null)) {
            this.mThreadSubscribeSwitch.setChecked(topicGroup.getUserSetting().isFavorite());
            mo128815e(topicGroup.getUserSetting().isFavorite());
        }
        this.mThreadSubscribeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass17 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                GroupSettingView.this.f90142f.mo128896e(z);
                GroupSettingView.this.mo128815e(z);
            }
        });
    }

    /* renamed from: b */
    public void mo128803b(Chat chat, Chat.MessagePosition messagePosition) {
        mo128789a(chat, messagePosition);
        this.f90142f.mo128887a(messagePosition);
        SettingHitPoint.f90520a.mo129269a(chat, messagePosition);
        if (messagePosition == Chat.MessagePosition.RECENT_LEFT) {
            GroupHitPoint.f90519a.mo129221b("first");
        } else if (messagePosition == Chat.MessagePosition.NEWEST_UNREAD) {
            GroupHitPoint.f90519a.mo129221b("last");
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: b */
    public void mo128804b(Chat chat, List<ChatChatter> list) {
        int i;
        int i2;
        boolean z;
        LinearLayout linearLayout = this.mGroupMemberLayout;
        if (chat.isAnonymousSecret()) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (chat == null) {
            i2 = 0;
        } else {
            i2 = chat.getUserCount();
        }
        this.mChatterAllCountTV.setText(String.valueOf(i2));
        m135925l(chat);
        Context applicationContext = this.f90140d.getApplicationContext();
        if (!this.f90149m || C34501a.m133936b(chat)) {
            z = true;
        } else {
            z = false;
        }
        C34942d dVar = new C34942d(applicationContext, list, chat, z);
        this.f90147k = dVar;
        this.mGroupMemberGv.setAdapter((ListAdapter) dVar);
        this.mGroupMemberLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AnonymousClass20 */

            public void onClick(View view) {
                GroupSettingView.this.f90142f.mo128891c();
            }
        });
        C34939b bVar = new C34939b(this.f90140d, chat, new C34939b.AbstractC34940a() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingView$zi50D8Uy3MiavgKkjT93Tramvo */

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34939b.AbstractC34940a
            public final Team getTeam() {
                return GroupSettingView.m270450lambda$zi50D8Uy3MiavgKkjT93Tramvo(GroupSettingView.this);
            }
        });
        this.f90152p = bVar;
        this.f90147k.mo128863a(bVar);
        this.mGroupMemberGv.setEnabled(false);
        this.mGroupMemberGv.setClickable(false);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b
    /* renamed from: b */
    public void mo128805b(Chat chat, boolean z) {
        this.f90141e.mo128853b(chat, z);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m135898a(boolean z, DialogInterface dialogInterface, int i) {
        ChatSettingHitPointNew.m136653n(ChatSettingExtraParams.Click.CONFIRM.plus(TARGET_NONE.f135700a));
        this.f90142f.mo128897f(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m135891a(Context context, String str, boolean z, int i) {
        this.f90141e.mo128844a(context, str, z, i);
    }

    public GroupSettingView(Activity activity, AbstractC34936a aVar, C36516a<?> aVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC34461c a = ChatSettingModule.m133639a();
        this.f90137a = a;
        this.f90138b = a.mo127277g();
        this.f90140d = activity;
        this.f90141e = aVar;
        this.f90148l = z;
        this.f90149m = z2;
        this.f90150n = z3;
        this.f90151o = z4;
        this.f90155s = aVar2;
    }
}
