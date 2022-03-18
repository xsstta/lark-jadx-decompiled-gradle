package com.ss.android.lark.chatsetting.impl.p2p;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.Profile;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionController;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionItemFactory;
import com.ss.android.lark.chatsetting.impl.chat_function.binder.ChatFunctionBinder;
import com.ss.android.lark.chatsetting.impl.chat_search.ChatSearchMenuController;
import com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import java.util.List;

public class P2pSettingView implements AbstractC35020b.AbstractC35023b {

    /* renamed from: f */
    private static final int f90337f = UIHelper.dp2px(48.0f);

    /* renamed from: a */
    TextView f90338a;

    /* renamed from: b */
    ImageView f90339b;

    /* renamed from: c */
    AbstractC34461c.AbstractC34466e f90340c = ChatSettingModule.m133639a().mo127274d();
    TextView closeSecretChatBtn;

    /* renamed from: d */
    public AbstractC35020b.AbstractC35023b.AbstractC35024a f90341d;

    /* renamed from: e */
    AbstractC34461c.AbstractC34474m f90342e = ChatSettingModule.m133639a().mo127279i();

    /* renamed from: g */
    private AbstractC35017a f90343g;

    /* renamed from: h */
    private Activity f90344h;

    /* renamed from: i */
    private IChatFunctionController f90345i;

    /* renamed from: j */
    private CompoundButton.OnCheckedChangeListener f90346j;

    /* renamed from: k */
    private CompoundButton.OnCheckedChangeListener f90347k;

    /* renamed from: l */
    private CompoundButton.OnCheckedChangeListener f90348l;

    /* renamed from: m */
    private AbstractC34461c.AbstractC34476o f90349m = ChatSettingModule.m133639a().mo127277g();
    TextView mAutoTranslateLabelTv;
    RelativeLayout mAutoTranslateLayout;
    LKUISwitchButton mAutoTranslateSwitch;
    TextView mAutoTranslateTipsTv;
    View mBotInfoView;
    View mBoxSettingDivide;
    RelativeLayout mChatBoxLayout;
    View mChatFunctionLayout;
    ChatFunctionView mChatFunctionView;
    View mChatterInfoView;
    TextView mMoveToBoxSubtitle;
    LKUISwitchButton mMoveToBoxSwitchButton;
    TextView mMoveToBoxTitlt;
    TextView mMsgNotifyTV;
    RelativeLayout mMuteLayoutWrapper;
    View mP2pSettingOptionDivide;
    TextView mQuickSwitcherTitle;
    View mReportBtn;
    View mRootLayout;
    ScrollView mScrollView;
    View mSearchChatLayout;
    View mSearchChatTitleLayout;
    RecyclerView mSearchChatTypeRv;
    CommonTitleBar mTitleBar;

    /* renamed from: n */
    private CompoundButton.OnCheckedChangeListener f90350n = new CompoundButton.OnCheckedChangeListener() {
        /* class com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.C350101 */

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.AUTO_TRANSLATION_SWITCH.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
            P2pSettingView.this.f90341d.mo129078d(z);
        }
    };

    /* renamed from: o */
    private int f90351o;
    LinearLayout p2pChatSettingOptionWrapper;
    RelativeLayout p2pChatSettingShortcut;
    LKUISwitchButton remindSwitchButton;
    LKUISwitchButton shortcutSwitchButton;

    /* renamed from: com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView$a */
    public interface AbstractC35017a {
        /* renamed from: a */
        void mo129040a();

        /* renamed from: a */
        void mo129041a(Context context, String str, boolean z);

        /* renamed from: a */
        void mo129042a(Context context, String str, boolean z, int i);

        /* renamed from: a */
        void mo129043a(Chatter chatter);

        /* renamed from: a */
        void mo129044a(P2pSettingView p2pSettingView);

        /* renamed from: a */
        void mo129045a(String str);

        /* renamed from: b */
        void mo129046b();

        /* renamed from: b */
        void mo129047b(String str);

        /* renamed from: c */
        void mo129048c();
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129017a(Chatter chatter) {
        TextView textView = this.f90338a;
        if (textView != null) {
            textView.setText(this.f90340c.mo127314a(chatter));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129022a(boolean z) {
        this.remindSwitchButton.setOnCheckedChangeListener(null);
        this.remindSwitchButton.setCheckedImmediately(z);
        this.remindSwitchButton.setOnCheckedChangeListener(this.f90346j);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129014a(int i) {
        LKUIToast.show(this.f90344h, i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129021a(String str) {
        if (!TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f90344h, str);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129018a(Chatter chatter, String str, String str2) {
        ChatSettingModule.m133639a().mo127292v().mo127383a(this.f90344h, str, str2, new Contact(chatter.getId(), chatter.getAvatarKey(), chatter.getLocalizedName()));
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129013a() {
        this.f90343g.mo129040a();
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129015a(Chat chat, Chat chat2) {
        mo129022a(chat.isRemind());
        mo129033d(chat.isAutoTranslate());
        mo129030c(chat.isInBox());
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129020a(C35053e eVar) {
        m136345a(eVar.f90432a, eVar.f90433b);
        m136341a(eVar.f90432a);
        m136344a(eVar.f90432a, eVar.f90434c, eVar.f90435d);
        m136357f(eVar.f90435d != null && eVar.f90435d.isBot());
        m136355e(eVar.f90436e);
        m136351b(eVar.f90432a, eVar.f90435d);
        m136350b(eVar.f90432a);
        m136343a(eVar.f90432a, eVar.f90434c);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: a */
    public void mo129016a(Chat chat, Chatter chatter, Profile profile) {
        TextView textView = (TextView) this.mBotInfoView.findViewById(R.id.bot_desc_tv);
        String str = chatter.getDescription() != null ? chatter.getDescription().description : null;
        textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        textView.setText(str);
        m136346a(chat.isInBox(), !chat.isSoloChat());
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        IChatFunctionController cVar = this.f90345i;
        if (cVar != null) {
            cVar.mo127563c();
        }
        if (this.f90342e != null) {
            this.f90342e = null;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: c */
    public void mo129027c() {
        this.f90343g.mo129048c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC35017a aVar = this.f90343g;
        if (aVar != null) {
            aVar.mo129044a(this);
        }
        m136358g();
        m136354e();
        m136356f();
    }

    /* renamed from: e */
    private void m136354e() {
        this.f90346j = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.C350112 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                P2pSettingView.this.f90341d.mo129073a(z);
            }
        };
        this.f90347k = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.C350123 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.QUICKSWITCHER_SWITCH.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
                P2pSettingView.this.f90341d.mo129077c(z);
            }
        };
        this.f90348l = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.C350134 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.CHAT_BOX_SWITCH.plus(ChatSettingExtraParams.Target.IM_CHAT_SETTING_VIEW));
                P2pSettingView.this.f90341d.mo129075b(z);
            }
        };
        this.mAutoTranslateSwitch.setOnCheckedChangeListener(this.f90350n);
        this.mReportBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.View$OnClickListenerC350145 */

            public void onClick(View view) {
                P2pSettingView.this.f90341d.mo129082g();
            }
        });
        View view = this.mBotInfoView;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.$$Lambda$P2pSettingView$Os9Zv0FlO5XEcSAsCi6cG8ZIU */

                public final void onClick(View view) {
                    P2pSettingView.m270460lambda$Os9Zv0FlO5XEcSAsCi6cG8ZIU(P2pSettingView.this, view);
                }
            });
        }
        View view2 = this.mChatterInfoView;
        if (view2 != null) {
            view2.findViewById(R.id.chatter_avatar).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.$$Lambda$P2pSettingView$mjvEyIeRxv4Ze1fs6cLvEknFtPU */

                public final void onClick(View view) {
                    P2pSettingView.lambda$mjvEyIeRxv4Ze1fs6cLvEknFtPU(P2pSettingView.this, view);
                }
            });
            this.mChatterInfoView.findViewById(R.id.add_chatter_iv).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.$$Lambda$P2pSettingView$cwtLyNIVjrfVV2Hl7GerlVTLN40 */

                public final void onClick(View view) {
                    P2pSettingView.lambda$cwtLyNIVjrfVV2Hl7GerlVTLN40(P2pSettingView.this, view);
                }
            });
        }
    }

    /* renamed from: f */
    private void m136356f() {
        if (DesktopUtil.m144307b()) {
            DesktopUtil.m144299a(this.mQuickSwitcherTitle, this.mMoveToBoxTitlt, this.mMsgNotifyTV, this.mAutoTranslateLabelTv, this.closeSecretChatBtn);
            DesktopUtil.m144306b(this.mMoveToBoxSubtitle, this.mAutoTranslateTipsTv, (TextView) this.mReportBtn);
            DesktopUtil.m144298a(this.p2pChatSettingShortcut, this.mMuteLayoutWrapper, this.closeSecretChatBtn);
            DesktopUtil.m144305b(this.mChatBoxLayout, this.mAutoTranslateLayout);
        }
    }

    /* renamed from: g */
    private void m136358g() {
        this.mTitleBar.getCenterText().getPaint().setFakeBoldText(true);
        CommonTitleBar commonTitleBar = this.mTitleBar;
        Activity activity = this.f90344h;
        commonTitleBar.addAction(new IActionTitlebar.C57573a(UDIconUtils.getIconDrawable(activity, (int) R.drawable.ud_icon_share_outlined, UDColorUtils.getColor(activity, R.color.icon_n1))) {
            /* class com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.C350167 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.SHARE_PROFILE.plus(ChatSettingExtraParams.Target.PUBLIC_MULTI_SELECT_SHARE_VIEW));
                P2pSettingView.this.f90341d.mo129076c();
            }
        });
        ((TextView) this.mScrollView.findViewById(R.id.chat_function_title)).setText(R.string.Lark_Chat_Application);
        if (DesktopUtil.m144301a((Context) this.f90344h)) {
            this.mTitleBar.setVisibility(8);
        } else {
            this.mTitleBar.setLeftVisible(true);
        }
        m136359h();
    }

    /* renamed from: h */
    private void m136359h() {
        if ((this.f90351o & ChatSettingModule.HideSettingItemMask.HIDE_CONVERSATION_BOX_ITEM.getNumber()) != 0) {
            this.mChatBoxLayout.setVisibility(8);
            this.mBoxSettingDivide.setVisibility(8);
        }
        if ((this.f90351o & ChatSettingModule.HideSettingItemMask.HIDE_SHORTCUT_ITEM.getNumber()) != 0) {
            this.p2pChatSettingShortcut.setVisibility(8);
        }
        if ((this.f90351o & ChatSettingModule.HideSettingItemMask.HIDE_NOTICE_ITEM.getNumber()) != 0) {
            this.mMuteLayoutWrapper.setVisibility(8);
            this.mP2pSettingOptionDivide.setVisibility(8);
        }
        m136352c(0);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: b */
    public void mo129023b() {
        this.f90343g.mo129046b();
    }

    /* renamed from: d */
    public void mo129031d() {
        float f;
        C25639g gVar = new C25639g(this.f90344h);
        if (DesktopUtil.m144307b()) {
            f = 440.0f;
        } else {
            f = 0.8f;
        }
        gVar.mo89222a(f).mo89248g(R.string.Lark_Legacy_EndDialogTitle).mo89238b(true).mo89254m(R.string.Lark_Legacy_SecretChatDisbandNow).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.$$Lambda$P2pSettingView$JFl1CcKNfeU2VFhVhlfyF3N2ihc */

            public final void onClick(DialogInterface dialogInterface, int i) {
                P2pSettingView.lambda$JFl1CcKNfeU2VFhVhlfyF3N2ihc(P2pSettingView.this, dialogInterface, i);
            }
        }).mo89233b().show();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35020b.AbstractC35023b.AbstractC35024a aVar) {
        this.f90341d = aVar;
    }

    /* renamed from: c */
    private void m136352c(int i) {
        this.mChatFunctionLayout.setVisibility(i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: d */
    public void mo129033d(boolean z) {
        this.mAutoTranslateSwitch.setCheckedImmediatelyNoEvent(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m136349b(View view) {
        this.f90341d.mo129081f();
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m136353c(View view) {
        this.f90341d.mo129081f();
    }

    /* renamed from: f */
    private void m136357f(boolean z) {
        if (!z) {
            m136348b(0);
        } else {
            m136348b(8);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: d */
    public void mo129032d(String str) {
        ChatSettingModule.m133639a().mo127271b(this.f90344h, str);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m136340a(View view) {
        ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.GROUP_CREATE.plus(ChatSettingExtraParams.Target.IM_GROUP_CREATE_VIEW));
        this.f90341d.mo129074b();
    }

    /* renamed from: b */
    private void m136348b(int i) {
        boolean z = false;
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setRightVisible(false);
            return;
        }
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (i == 0) {
            z = true;
        }
        commonTitleBar.setRightVisible(z);
    }

    /* renamed from: e */
    private void m136355e(boolean z) {
        int i = 8;
        if (!ChatSettingModule.m133639a().mo127261F()) {
            this.mReportBtn.setVisibility(8);
            return;
        }
        View view = this.mReportBtn;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: b */
    private void m136350b(final Chat chat) {
        if (chat.isSecret()) {
            this.closeSecretChatBtn.setVisibility(0);
            this.mScrollView.findViewById(R.id.chatter_avatar_secret_iv).setVisibility(0);
            this.closeSecretChatBtn.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView.View$OnClickListenerC350156 */

                public void onClick(View view) {
                    SettingHitPoint.m136747a();
                    SettingHitPoint.f90520a.mo129278c(chat.getId());
                    P2pSettingView.this.mo129031d();
                }
            });
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: c */
    public void mo129028c(Chatter chatter) {
        this.f90343g.mo129043a(chatter);
    }

    /* renamed from: a */
    private void m136341a(Chat chat) {
        boolean z;
        if (!this.f90341d.mo129080e() || !ChatSettingModule.m133639a().mo127283m().mo127389a()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.mAutoTranslateLayout.setVisibility(0);
            this.mMuteLayoutWrapper.setBackgroundResource(R.drawable.bg_setting_group_item_rectangle);
        } else {
            this.mAutoTranslateLayout.setVisibility(8);
            this.mMuteLayoutWrapper.setBackgroundResource(R.drawable.bg_setting_group_item_round_bottom);
        }
        if (z) {
            this.mAutoTranslateSwitch.setCheckedImmediatelyNoEvent(chat.isAutoTranslate());
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: c */
    public void mo129029c(String str) {
        this.f90343g.mo129047b(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: c */
    public void mo129030c(boolean z) {
        this.mMoveToBoxSwitchButton.setOnCheckedChangeListener(null);
        this.mMoveToBoxSwitchButton.setCheckedImmediately(z);
        this.mMoveToBoxSwitchButton.setOnCheckedChangeListener(this.f90348l);
        this.mMsgNotifyTV.setEnabled(!z);
        if (z && this.remindSwitchButton.isChecked()) {
            this.f90341d.mo129073a(false);
            this.remindSwitchButton.setChecked(false);
        }
        this.remindSwitchButton.setEnabled(!z);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: b */
    public void mo129024b(Chatter chatter) {
        AbstractC34461c.AbstractC34474m mVar = this.f90342e;
        Activity activity = this.f90344h;
        String avatarKey = chatter.getAvatarKey();
        String id = chatter.getId();
        ImageView imageView = this.f90339b;
        int i = f90337f;
        mVar.mo127409a(activity, avatarKey, id, imageView, i, i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: b */
    public void mo129025b(String str) {
        this.f90343g.mo129045a(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b
    /* renamed from: b */
    public void mo129026b(boolean z) {
        this.shortcutSwitchButton.setOnCheckedChangeListener(null);
        this.shortcutSwitchButton.setCheckedImmediately(z);
        this.shortcutSwitchButton.setOnCheckedChangeListener(this.f90347k);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m136339a(DialogInterface dialogInterface, int i) {
        this.f90341d.mo129072a();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m136342a(Chat chat, View view) {
        ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.SEARCH.plus(ChatSettingExtraParams.Target.IM_CHAT_HISTORY_VIEW));
        SettingHitPoint.f90520a.mo129268a(chat, -1);
        ChatSettingModule.m133639a().mo127288r().mo127436a(chat.getId());
        this.f90343g.mo129041a(this.f90344h, chat.getId(), chat.isThread());
    }

    /* renamed from: a */
    private void m136343a(Chat chat, ChatChatter chatChatter) {
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
            /* class com.ss.android.lark.chatsetting.impl.p2p.$$Lambda$P2pSettingView$zViBJs5SHBhw6UF5jrRup7wtCPA */
            public final /* synthetic */ Chat f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                P2pSettingView.lambda$zViBJs5SHBhw6UF5jrRup7wtCPA(P2pSettingView.this, this.f$1, view);
            }
        });
        ChatSearchMenuController.f89121e.mo127604a(this.f90344h, this.mSearchChatTypeRv, chat, new ChatSearchMenuController.SearchDelegate() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.$$Lambda$P2pSettingView$h1DsNbmJWBkfNlVPyMYe997LOV4 */

            @Override // com.ss.android.lark.chatsetting.impl.chat_search.ChatSearchMenuController.SearchDelegate
            public final void gotoSearchHistoryActivity(Context context, String str, boolean z, int i) {
                P2pSettingView.lambda$h1DsNbmJWBkfNlVPyMYe997LOV4(P2pSettingView.this, context, str, z, i);
            }
        });
    }

    /* renamed from: b */
    private void m136351b(Chat chat, Chatter chatter) {
        int i = 8;
        if (chatter.isBot()) {
            this.mChatterInfoView.setVisibility(8);
            this.mBotInfoView.setVisibility(0);
            this.f90339b = (ImageView) this.mBotInfoView.findViewById(R.id.setting_bot_avatar);
            this.f90338a = (TextView) this.mBotInfoView.findViewById(R.id.bot_name_tv);
            TextView textView = (TextView) this.mBotInfoView.findViewById(R.id.bot_desc_tv);
            String str = null;
            if (chatter.getDescription() != null) {
                str = chatter.getDescription().description;
            }
            if (!TextUtils.isEmpty(str)) {
                i = 0;
            }
            textView.setVisibility(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            textView.setText(str);
        } else {
            this.mChatterInfoView.setVisibility(0);
            this.mBotInfoView.setVisibility(8);
            this.f90339b = (ImageView) this.mChatterInfoView.findViewById(R.id.chatter_avatar);
            this.f90338a = (TextView) this.mChatterInfoView.findViewById(R.id.chatter_name_tv);
        }
        AbstractC34461c.AbstractC34474m mVar = this.f90342e;
        Activity activity = this.f90344h;
        String avatarKey = chatter.getAvatarKey();
        String id = chatter.getId();
        ImageView imageView = this.f90339b;
        int i2 = f90337f;
        mVar.mo127409a(activity, avatarKey, id, imageView, i2, i2);
        this.f90338a.setText(this.f90340c.mo127314a(chatter));
        LarkNameTag.m92203a(this.f90344h).mo90036g(chatter.showBotTag()).mo90027e().mo90004a(this.f90338a);
    }

    /* renamed from: a */
    private void m136345a(Chat chat, Chatter chatter) {
        boolean z;
        int i;
        int i2 = 0;
        if ((chatter.getType() != Chatter.ChatterType.USER || !this.f90349m.mo127413a(chatter.getId())) && (chatter.getType() != Chatter.ChatterType.BOT || chat.isMuteable())) {
            z = false;
        } else {
            z = true;
        }
        LinearLayout linearLayout = this.p2pChatSettingOptionWrapper;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        View view = this.mP2pSettingOptionDivide;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        mo129022a(chat.isRemind());
    }

    /* renamed from: a */
    private void m136346a(boolean z, boolean z2) {
        if (!this.f90341d.mo129079d()) {
            this.mChatBoxLayout.setVisibility(8);
            this.mBoxSettingDivide.setVisibility(8);
            return;
        }
        if (z2) {
            if ((this.f90351o & ChatSettingModule.HideSettingItemMask.HIDE_CONVERSATION_BOX_ITEM.getNumber()) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            this.p2pChatSettingShortcut.setBackgroundResource(R.drawable.bg_setting_group_item_round_top);
            this.mChatBoxLayout.setVisibility(0);
            this.mBoxSettingDivide.setVisibility(0);
            mo129030c(z);
            return;
        }
        this.p2pChatSettingShortcut.setBackgroundResource(R.drawable.bg_setting_group_item_round);
        this.mChatBoxLayout.setVisibility(8);
        this.mBoxSettingDivide.setVisibility(8);
    }

    /* renamed from: b */
    private List<IChatFunctionItem> m136347b(Chat chat, ChatChatter chatChatter, ChatChatter chatChatter2) {
        return ChatFunctionItemFactory.f89092a.mo127584a(chat, chatChatter, chatChatter2);
    }

    public P2pSettingView(AbstractC35017a aVar, Activity activity, int i) {
        this.f90343g = aVar;
        this.f90344h = activity;
        this.f90351o = i;
    }

    /* renamed from: a */
    private void m136344a(Chat chat, ChatChatter chatChatter, ChatChatter chatChatter2) {
        List<IChatFunctionItem> b = m136347b(chat, chatChatter, chatChatter2);
        if (DesktopUtil.m144301a((Context) this.f90344h) || CollectionUtils.isEmpty(b)) {
            m136352c(8);
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f90344h, 5);
        this.mChatFunctionView.setPaddingRelative(UIHelper.dp2px(8.0f), 0, UIHelper.dp2px(8.0f), 0);
        this.mChatFunctionView.getRecyclerView().setPaddingRelative(0, 0, 0, 0);
        ChatFunctionController.Companion aVar = ChatFunctionController.f89013f;
        Activity activity = this.f90344h;
        this.f90345i = aVar.mo127566a(activity, chat, chatChatter2, this.mChatFunctionView, new ChatFunctionBinder(activity), gridLayoutManager, b);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m136338a(Context context, String str, boolean z, int i) {
        this.f90343g.mo129042a(context, str, z, i);
    }
}
