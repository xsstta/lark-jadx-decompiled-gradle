package com.ss.android.lark.threadwindow;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.NetworkUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.C26280j;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.chatwindow.chat.p1612a.C33085b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33102ad;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33111af;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.EditImageUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.view.C35252a;
import com.ss.android.lark.chatwindow.view.C35266c;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.chatwindow.view.sidemenu.DesktopSideMenuItemBinder;
import com.ss.android.lark.chatwindow.view.sidemenu.item.ThreadSettingItem;
import com.ss.android.lark.chatwindow.view.widget.TitleBarRedDotView;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36459ag;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.dependency.AbstractC36508v;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.dependency.ak;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.p1958a.C38804a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.threaddetail.view.C55869b;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardLauncher;
import com.ss.android.lark.threadtab.view.C55985a;
import com.ss.android.lark.threadwindow.AbstractC56050c;
import com.ss.android.lark.threadwindow.fragment.AbstractC56087e;
import com.ss.android.lark.threadwindow.fragment.C56093h;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.OnItemUpdateListener;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b;

public class ThreadWindowView implements AbstractC56050c.AbstractC56053b {

    /* renamed from: u */
    private static final int f138401u = UIHelper.getColor(R.color.lkui_B500);

    /* renamed from: v */
    private static final int f138402v = UIHelper.getColor(R.color.lkui_N700);

    /* renamed from: w */
    private static final int f138403w = UIHelper.getColor(R.color.lkui_R500);

    /* renamed from: A */
    private final AbstractC36509x f138404A;

    /* renamed from: B */
    private final AbstractC36505s f138405B;

    /* renamed from: C */
    private ChatFunctionView f138406C;

    /* renamed from: D */
    private final OnSingleClickListener f138407D;

    /* renamed from: E */
    private TextView f138408E;

    /* renamed from: F */
    private TitleBarRedDotView f138409F;

    /* renamed from: G */
    private boolean f138410G;

    /* renamed from: H */
    private C25969c f138411H;

    /* renamed from: I */
    private LKUIStatus f138412I;

    /* renamed from: J */
    private C69619a f138413J;

    /* renamed from: K */
    private final boolean f138414K;

    /* renamed from: L */
    private C36592a f138415L;

    /* renamed from: M */
    private final boolean f138416M;

    /* renamed from: N */
    private final boolean f138417N;

    /* renamed from: O */
    private IChatFunctionController f138418O;

    /* renamed from: P */
    private DesktopSideMenuItemBinder f138419P;

    /* renamed from: Q */
    private ThreadWindowFragmentFactory f138420Q;

    /* renamed from: R */
    private String f138421R;

    /* renamed from: S */
    private final AbstractC56087e f138422S;

    /* renamed from: T */
    private ValueAnimator f138423T;

    /* renamed from: a */
    public final Activity f138424a;

    /* renamed from: b */
    public final AbstractC56006a f138425b;

    /* renamed from: c */
    public final ChatChatter f138426c;

    /* renamed from: d */
    public final AbstractC36504r f138427d = C29990c.m110930b().mo134512K();

    /* renamed from: e */
    public final AbstractC36450aa f138428e;

    /* renamed from: f */
    public View f138429f;

    /* renamed from: g */
    public ImageView f138430g;

    /* renamed from: h */
    public AbstractC56050c.AbstractC56053b.AbstractC56054a f138431h;

    /* renamed from: i */
    public Chat f138432i;

    /* renamed from: j */
    public TopicGroup f138433j;

    /* renamed from: k */
    public C35252a f138434k;

    /* renamed from: l */
    public boolean f138435l;

    /* renamed from: m */
    public C56093h f138436m;
    AppBarLayout mAppBarLayout;
    public UDNotice mBannerView;
    ViewGroup mClAnnouncementView;
    ImageView mCreateNewTopicCloseIv;
    ViewGroup mCreateNewTopicLayout;
    TextView mCreateNewTopicText;
    View mFilterTabBackground;
    FrameLayout mFlSecondLevelTab;
    ViewGroup mFlTitleAnnounce;
    FrameLayout mFlTitleAnnounceBg;
    public ViewGroup mFrameContainer;
    LinearLayout mGroupContentLayout;
    LKUIRoundedImageView mIvGroupAvatar;
    View mIvGroupAvatarBackground;
    ImageView mIvNewAnnounceIcon;
    ProgressBar mJoinProgressBar;
    ViewGroup mJoinTopicGroup;
    LKUIButton mJoinTopicGroupBtn;
    ViewGroup mJoinTopicGroupLayout;
    TextView mJoinTopicGroupTip;
    View mNumDescDivider;
    ImageView mPostTopicIv;
    ViewGroup mPostTopicLayout;
    RelativeLayout mRLSecondLevelTab;
    View mSecondToDivider;
    ViewGroup mShareGroupLayout;
    ImageView mSubscribeStatusIv;
    ImageView mSubscribeTipIv;
    ImageView mThreadDoneLayout;
    LinearLayout mTitleAnnounceLayout;
    public CommonTitleBar mTitleBar;
    View mTitleBarBackgroundView;
    public ViewGroup mTitleBarLayout;
    MagicIndicator mTlSecondLevelTopicIndicator;
    MagicIndicator mTlTopicIndicator;
    ViewPager mTopicViewPager;
    TextView mTvGroupDesc;
    TextView mTvGroupIcon;
    TextView mTvGroupName;
    TextView mTvGroupNum;
    TextView mTvNewAnnounce;
    public View mWindowContainer;

    /* renamed from: n */
    public final boolean f138437n;

    /* renamed from: o */
    public final C33111af f138438o;

    /* renamed from: p */
    public String f138439p;

    /* renamed from: q */
    public final boolean f138440q;

    /* renamed from: r */
    public boolean f138441r;

    /* renamed from: s */
    public boolean f138442s;

    /* renamed from: t */
    public boolean f138443t;

    /* renamed from: x */
    private final AbstractC36508v f138444x = C29990c.m110930b().mo134583k();

    /* renamed from: y */
    private final ak f138445y = C29990c.m110930b().ae();

    /* renamed from: z */
    private final AbstractC36503q f138446z;

    /* renamed from: com.ss.android.lark.threadwindow.ThreadWindowView$a */
    public interface AbstractC56006a {
        /* renamed from: a */
        Activity mo190994a();

        /* renamed from: a */
        void mo190995a(Chat chat);

        /* renamed from: a */
        void mo190996a(Chat chat, String str, RichText richText, boolean z);

        /* renamed from: a */
        void mo190997a(ThreadWindowView threadWindowView);

        /* renamed from: a */
        void mo190998a(String str);

        /* renamed from: a */
        void mo190999a(String str, ThreadTopic threadTopic, Chat chat, boolean z, boolean z2, boolean z3, int i);

        /* renamed from: a */
        void mo191000a(String str, boolean z, boolean z2, boolean z3);

        /* renamed from: b */
        Fragment mo191001b();

        /* renamed from: b */
        void mo191002b(Chat chat);

        /* renamed from: b */
        void mo191003b(String str);

        /* renamed from: c */
        void mo191004c();

        /* renamed from: c */
        void mo191005c(String str);

        /* renamed from: d */
        void mo191006d();

        /* renamed from: e */
        FragmentManager mo191007e();
    }

    /* renamed from: H */
    private boolean m217658H() {
        return true;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: j */
    public void mo190937j() {
        m217666P();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: t */
    public boolean mo190947t() {
        return this.f138440q;
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC56050c.AbstractC56053b.AbstractC56054a aVar) {
        this.f138431h = aVar;
    }

    /* renamed from: a */
    public void mo190897a(View view) {
        if (this.f138415L == null) {
            this.f138415L = new C36592a.C36593a().mo135002a(UIHelper.getString(R.string.Lark_Legacy_Completed)).mo135003a(this.f138424a);
        }
        this.f138415L.mo135001b(view, 0, 2);
    }

    /* renamed from: b */
    public void mo190921b(boolean z) {
        if (z) {
            this.mCreateNewTopicLayout.setVisibility(8);
            this.f138443t = true;
        } else {
            this.mCreateNewTopicLayout.setVisibility(0);
            m217676Z();
        }
        this.mCreateNewTopicCloseIv.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.threadwindow.$$Lambda$ThreadWindowView$9LJwwFH8YcGtJykfrEyEfHGWo8 */

            public final void onClick(View view) {
                ThreadWindowView.m271024lambda$9LJwwFH8YcGtJykfrEyEfHGWo8(ThreadWindowView.this, view);
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190913a(boolean z, List<ThreadMessageVO> list) {
        this.f138436m.mo191372a(C34339g.m133171e(this.f138432i) == Chat.MessagePosition.NEWEST_UNREAD, z, list);
        if (mo190951x()) {
            this.f138436m.mo191376b(true);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190895a(int i, boolean z) {
        this.f138436m.mo191367a(i, z);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190911a(boolean z) {
        this.f138436m.mo191371a(z);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190908a(String str) {
        if (!TextUtils.isEmpty(str)) {
            UDToast.show(this.f138424a, str);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190909a(String str, ThreadTopic threadTopic, Chat chat, boolean z, boolean z2, boolean z3, int i) {
        this.f138425b.mo190999a(str, threadTopic, chat, z, z2, z3, i);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190899a(Chat chat) {
        m217678a(this.mTitleBar, chat);
        m217671U();
        m217681a(chat.isShowApplyBanner(), chat.getPutChatterApplyCount());
        m217673W();
        m217672V();
        m217670T();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: b */
    public void mo190920b(String str) {
        if (TextUtils.isEmpty(str)) {
            mo190928d();
        } else {
            new C25639g(this.f138424a).mo89237b(str).mo89238b(true).mo89251j(2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.threadwindow.$$Lambda$ThreadWindowView$d0jqg595NL2b9jHGhz2YXPeCIo */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ThreadWindowView.m271026lambda$d0jqg595NL2b9jHGhz2YXPeCIo(ThreadWindowView.this, dialogInterface, i);
                }
            }).mo89246d(false).mo89239c().setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass16 */

                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return true;
                    }
                    ThreadWindowView.this.mo190928d();
                    return true;
                }
            });
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190900a(Chat chat, String str, RichText richText, boolean z) {
        this.f138425b.mo190996a(chat, str, richText, z);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190907a(Boolean bool) {
        if (bool.booleanValue()) {
            C29990c.m110930b().mo134532a(this.f138424a);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190902a(MessageInfo messageInfo) {
        this.f138436m.mo191369a(messageInfo);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190903a(MessageInfo messageInfo, AbstractC36459ag.AbstractC36460a aVar) {
        if (this.f138432i == null) {
            Log.m165383e("ThreadWindowView", "Failed to show pin dialog，chat is null");
        } else if (this.f138426c == null) {
            Log.m165383e("ThreadWindowView", "Faild to show pin dialog，chatter is null");
        } else {
            C29990c.m110930b().mo134509H().mo134431a(this.f138424a, messageInfo, this.f138432i, this.f138426c, aVar);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190901a(Message message) {
        this.f138405B.mo134701a(this.f138424a, message, this.f138432i.isSecret(), this.f138405B.mo134696a());
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190912a(boolean z, Chat chat, List<String> list) {
        if (z) {
            C29990c.m110930b().mo134540a(this.f138424a, chat.getId(), list.size() > 0 ? list.get(0) : "", chat.getEntityId(), this.mIvGroupAvatar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(chat.getId());
        C58630d.m227374a((Context) this.f138424a, list, (List<String>) arrayList, 0, (View) this.mIvGroupAvatar, false);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190896a(int i, boolean z, List<ThreadMessageVO> list) {
        this.f138436m.mo191368a(i, C34339g.m133171e(this.f138432i) == Chat.MessagePosition.NEWEST_UNREAD, z, list);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190910a(List<MessageInfo> list) {
        this.f138436m.mo191370a(list);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190905a(TranslateState translateState) {
        C33111af afVar = this.f138438o;
        if (afVar != null) {
            afVar.mo122311a(translateState);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190904a(TopicGroup topicGroup) {
        Log.m165389i("ThreadWindowView", "onUpdateTopicGroup");
        if (this.f138433j == null) {
            Log.m165389i("ThreadWindowView", "mTopicGroup == null");
            this.f138433j = topicGroup;
        }
        if (this.f138433j.getUserSetting() == null) {
            Log.m165389i("ThreadWindowView", "mTopicGroup.getUserSetting() == null");
            this.f138433j = topicGroup;
        } else if (topicGroup.getUserSetting() == null) {
            Log.m165389i("ThreadWindowView", "topicGroup.getUserSetting() == null");
            this.f138433j = topicGroup;
        } else {
            TopicGroup.TopicGroupRole topicGroupRole = this.f138433j.getUserSetting().getTopicGroupRole();
            TopicGroup.TopicGroupRole topicGroupRole2 = topicGroup.getUserSetting().getTopicGroupRole();
            this.f138433j = topicGroup;
            if (topicGroupRole == TopicGroup.TopicGroupRole.PARTICIPANT && topicGroupRole2 == TopicGroup.TopicGroupRole.MEMBER) {
                m217675Y();
                m217674X();
            }
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190898a(ErrorResult errorResult) {
        if (BillingTipsDialog.m226153a(errorResult.getErrorCode())) {
            BillingTipsDialog.m226151a(this.f138424a, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
        } else {
            new C25639g(this.f138424a).mo89237b(errorResult.getDisplayMsg()).mo89251j(2).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmDone, (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    /* renamed from: T */
    private void m217670T() {
        this.f138436m.mo191380e();
    }

    /* renamed from: U */
    private void m217671U() {
        this.f138436m.mo191379d();
    }

    /* renamed from: X */
    private void m217674X() {
        this.f138418O.mo127558a(2, 3);
    }

    /* renamed from: B */
    public void mo190890B() {
        this.mBannerView.setVisibility(8);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: b */
    public void mo190914b() {
        this.f138436m.mo191373b();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: c */
    public void mo190922c() {
        this.f138436m.mo191377c();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: e */
    public void mo190931e() {
        this.f138436m.mo191376b(true);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: f */
    public void mo190933f() {
        this.f138436m.mo191381f();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: g */
    public void mo190934g() {
        this.f138436m.mo191382g();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: i */
    public void mo190936i() {
        this.f138436m.mo191363a();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: o */
    public void mo190942o() {
        this.f138436m.mo191385j();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: q */
    public void mo190944q() {
        Log.m165389i("ThreadWindowView", "joinTopicGroupSuccess");
    }

    /* renamed from: W */
    private void m217673W() {
        this.mPostTopicIv.setEnabled(this.f138431h.mo191231g());
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: d */
    public void mo190928d() {
        this.f138425b.mo191004c();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: l */
    public void mo190939l() {
        if (this.f138413J != null) {
            m217683b(0, false);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: n */
    public void mo190941n() {
        this.f138436m.mo191364a(mo190940m());
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: p */
    public void mo190943p() {
        C36512a.m144041a().mo134757a(this.f138406C);
    }

    /* renamed from: w */
    public boolean mo190950w() {
        return C29990c.m110930b().mo134586n().mo134685a("group.participant.default.subscribe");
    }

    /* renamed from: z */
    public void mo190953z() {
        C36592a aVar = this.f138415L;
        if (aVar != null && aVar.isShowing()) {
            this.f138415L.dismiss();
        }
    }

    /* renamed from: C */
    private void m217653C() {
        m217668R();
        m217660J();
        m217659I();
        m217662L();
        m217657G();
        m217654D();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190891a() {
        this.f138410G = false;
        this.f138412I.mo89847d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f138411H.mo92349b();
        C33111af afVar = this.f138438o;
        if (afVar != null) {
            afVar.mo122308a();
        }
        IChatFunctionController cVar = this.f138418O;
        if (cVar != null) {
            cVar.mo127563c();
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: k */
    public void mo190938k() {
        if (this.mTopicViewPager.getCurrentItem() != 0 && this.f138413J != null) {
            m217683b(0, true);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: m */
    public int mo190940m() {
        return this.f138420Q.mo190887c(0).get(this.mTopicViewPager.getCurrentItem()).f138398a.intValue();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: r */
    public void mo190945r() {
        this.mJoinProgressBar.setVisibility(8);
        this.mJoinTopicGroupBtn.setText(UIUtils.getString(this.f138424a, R.string.Lark_Groups_JoinGroup));
        this.mJoinTopicGroupBtn.setEnabled(true);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: s */
    public void mo190946s() {
        this.mJoinProgressBar.setVisibility(8);
        this.mJoinTopicGroupBtn.setText(UIUtils.getString(this.f138424a, R.string.Lark_Groups_JoinGroup));
        this.mJoinTopicGroupBtn.setEnabled(true);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: u */
    public boolean mo190948u() {
        TopicGroup topicGroup;
        if (!this.f138417N || (topicGroup = this.f138433j) == null || topicGroup.getUserSetting() == null || this.f138433j.getUserSetting().getTopicGroupRole() != TopicGroup.TopicGroupRole.PARTICIPANT) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public boolean mo190951x() {
        if (!m217658H()) {
            return true;
        }
        ViewPager viewPager = this.mTopicViewPager;
        if (viewPager == null || viewPager.getCurrentItem() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private void m217654D() {
        if (this.f138417N && mo190948u()) {
            this.mJoinTopicGroup.setVisibility(0);
            if (mo190950w()) {
                m217656F();
            } else {
                m217655E();
            }
            this.mJoinTopicGroupBtn.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass20 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    ThreadWindowView.this.mJoinTopicGroupBtn.setEnabled(false);
                    ThreadWindowView.this.mJoinTopicGroupBtn.setText("");
                    ThreadWindowView.this.mJoinProgressBar.setVisibility(0);
                    ThreadWindowView.this.f138431h.mo191190a(ThreadWindowView.this.f138424a, ThreadWindowView.this.f138441r, ThreadWindowView.this.mo190950w());
                }
            });
        }
    }

    /* renamed from: F */
    private void m217656F() {
        this.mJoinTopicGroupTip.setText(UIUtils.getString(this.f138424a, R.string.Lark_Groups_SubscribeChannelToChatFeed));
        this.mSubscribeStatusIv.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass22 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowView threadWindowView = ThreadWindowView.this;
                threadWindowView.f138441r = !threadWindowView.f138441r;
                if (ThreadWindowView.this.f138441r) {
                    ThreadWindowView.this.mSubscribeStatusIv.setImageResource(R.drawable.ic_svg_topic_group_subscribe);
                } else {
                    ThreadWindowView.this.mSubscribeStatusIv.setImageResource(R.drawable.ic_svg_topic_group_unsubscribe);
                }
            }
        });
        this.mSubscribeTipIv.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass23 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                View inflate = LayoutInflater.from(ThreadWindowView.this.f138424a).inflate(R.layout.thread_subscribe_desc_layout, (ViewGroup) null);
                final DialogC25637f b = new C25639g(ThreadWindowView.this.f138424a).mo89236b(inflate).mo89257p(17).mo89245d(0.3f).mo89233b();
                ((LKUIButton) inflate.findViewById(R.id.lkbtn_sure)).setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass23.C559951 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        b.dismiss();
                    }
                });
                b.show();
            }
        });
    }

    /* renamed from: N */
    private void m217664N() {
        C56056f.m218239a(this.f138424a, UIHelper.dp2px(50.0f), UIHelper.dp2px(50.0f), this.f138432i.getAvatarKey(), this.f138432i.getId(), this.mIvGroupAvatar, new AbstractC38817h() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.C560016 */

            @Override // com.ss.android.lark.image.api.AbstractC38817h
            /* renamed from: a */
            public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
                ThreadWindowView.this.mo190952y();
                return false;
            }

            @Override // com.ss.android.lark.image.api.AbstractC38817h
            /* renamed from: a */
            public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
                if (obj instanceof C38804a) {
                    C38804a aVar = (C38804a) obj;
                    final Bitmap bitmap = aVar.getBitmap();
                    if ((ThreadWindowView.this.mIvGroupAvatar.getDrawable() instanceof C38804a) && ((C38804a) ThreadWindowView.this.mIvGroupAvatar.getDrawable()).getBitmap() == aVar.getBitmap()) {
                        return false;
                    }
                    ThreadWindowView.this.mFlTitleAnnounce.post(new Runnable() {
                        /* class com.ss.android.lark.threadwindow.ThreadWindowView.C560016.RunnableC560021 */

                        public void run() {
                            int measuredHeight = ThreadWindowView.this.mTitleBarLayout.getMeasuredHeight();
                            int measuredHeight2 = ThreadWindowView.this.mTitleBarLayout.getMeasuredHeight() + ThreadWindowView.this.mFlTitleAnnounce.getMeasuredHeight();
                            if (measuredHeight <= 0 || measuredHeight2 <= 0 || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
                                ThreadWindowView.this.mo190952y();
                                return;
                            }
                            ThreadWindowView.this.f138439p = ThreadWindowView.this.f138432i.getAvatarKey();
                            float f = (((float) measuredHeight) * 1.0f) / ((float) measuredHeight2);
                            Bitmap a = C55985a.m217602a(bitmap, UIHelper.getWindowWidth(ThreadWindowView.this.f138424a), measuredHeight2, false);
                            int width = a.getWidth();
                            int height = a.getHeight();
                            int i = (int) (((float) height) * f);
                            Log.m165389i("ThreadWindowView", "data width: " + width + ", data height: " + height + ", titleHeight: " + i);
                            if (width <= 0 || i <= 0 || height <= i) {
                                ThreadWindowView.this.mo190952y();
                                return;
                            }
                            int pixel = a.getPixel(0, Math.min(a.getHeight(), i) - 1);
                            if (!DesktopUtil.m144301a((Context) ThreadWindowView.this.f138424a)) {
                                ThreadWindowView.this.mTitleBarBackgroundView.setBackground(new BitmapDrawable(ThreadWindowView.this.f138424a.getResources(), Bitmap.createBitmap(a, 0, 0, width, i)));
                            }
                            ThreadWindowView.this.mIvGroupAvatarBackground.setBackground(new ColorDrawable(pixel));
                            ThreadWindowView.this.mFilterTabBackground.setBackground(new ColorDrawable(pixel));
                        }
                    });
                } else {
                    ThreadWindowView.this.mo190952y();
                }
                return false;
            }
        });
    }

    /* renamed from: O */
    private void m217665O() {
        this.mIvGroupAvatar.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.C560037 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (NetworkUtils.isNetworkAvailable(ThreadWindowView.this.f138424a)) {
                    ThreadWindowView.this.f138431h.mo191188a(ThreadWindowView.this.f138424a);
                }
            }
        });
        this.mShareGroupLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.C560048 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowView.this.f138431h.mo191235j();
            }
        });
        this.mThreadDoneLayout.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.View$OnHoverListenerC560059 */

            public boolean onHover(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 9) {
                    ThreadWindowView.this.mThreadDoneLayout.setSelected(true);
                    ThreadWindowView threadWindowView = ThreadWindowView.this;
                    threadWindowView.mo190897a(threadWindowView.mThreadDoneLayout);
                } else if (action == 10) {
                    ThreadWindowView.this.mo190953z();
                    ThreadWindowView.this.mThreadDoneLayout.setSelected(false);
                }
                return false;
            }
        });
        this.mThreadDoneLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowView.this.f138427d.mo134691a(ThreadWindowView.this.f138432i.getId());
                ThreadWindowView.this.f138425b.mo191004c();
                C36529b bVar = new C36529b();
                Bundle bundle = new Bundle();
                bundle.putInt("holder", R.drawable.empty_default_icon);
                bVar.setArguments(bundle);
                C36512a.m144041a().mo134763a(bVar, new MainWindowParams.C36570a(ContainerType.Right).mo134958a("conversation").mo134930b());
            }
        });
        AnonymousClass11 r0 = new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowView.this.f138435l = false;
                ThreadWindowView.this.f138431h.mo191234i();
                ThreadWindowView.this.f138425b.mo190995a(ThreadWindowView.this.f138432i);
                ThreadTopicHitPoint.f135906a.mo187731e(ThreadWindowView.this.f138432i.getId());
            }
        };
        this.mTvNewAnnounce.setOnClickListener(r0);
        this.mIvNewAnnounceIcon.setOnClickListener(r0);
    }

    /* renamed from: Q */
    private void m217667Q() {
        final TextView textView = (TextView) this.mTitleBar.findViewById(R.id.group_name);
        final TextView textView2 = (TextView) this.mTitleBar.findViewById(R.id.group_num);
        if (textView != null && textView2 != null) {
            final int windowWidth = UIHelper.getWindowWidth(this.f138424a);
            this.f138434k.mo129729a((ViewTreeObserver.OnGlobalLayoutListener) new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass15 */

                public void onGlobalLayout() {
                    ThreadWindowView.this.f138434k.mo129730b((ViewTreeObserver.OnGlobalLayoutListener) this);
                    textView.setMaxWidth(((windowWidth - (ThreadWindowView.this.mTitleBar.getLeftLayout().getWidth() * 2)) - UIUtils.getWidth(textView2)) - 2);
                }
            });
        }
    }

    /* renamed from: V */
    private void m217672V() {
        if (this.f138430g != null && this.mShareGroupLayout != null && this.mClAnnouncementView != null) {
            if (mo190889A()) {
                this.mShareGroupLayout.setVisibility(0);
                this.f138430g.setVisibility(0);
                if (this.mClAnnouncementView.getScrollY() == 0) {
                    this.f138430g.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    return;
                }
                return;
            }
            this.f138430g.setVisibility(8);
            this.mShareGroupLayout.setVisibility(8);
        }
    }

    /* renamed from: Y */
    private void m217675Y() {
        if (this.mJoinTopicGroup.getVisibility() != 4) {
            ValueAnimator valueAnimator = this.f138423T;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.mJoinProgressBar.setVisibility(8);
                this.mJoinTopicGroupBtn.setText(UIUtils.getString(this.f138424a, R.string.Lark_Groups_SuggestGroupsJoinedTip));
                this.mJoinTopicGroupBtn.setEnabled(false);
                this.mJoinTopicGroupBtn.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass17 */

                    public void run() {
                        ThreadWindowView threadWindowView = ThreadWindowView.this;
                        threadWindowView.mo190916b(0, threadWindowView.mJoinTopicGroup.getMeasuredHeight());
                    }
                }, 300);
            }
        }
    }

    /* renamed from: Z */
    private void m217676Z() {
        int lineCount;
        Layout layout = this.mCreateNewTopicText.getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            this.mCreateNewTopicText.setTextSize(14.0f);
            this.mCreateNewTopicText.requestLayout();
        }
    }

    /* renamed from: A */
    public boolean mo190889A() {
        String a = this.f138428e.mo134394a();
        Chat.ShareCardPermission shareCardPermission = this.f138432i.getShareCardPermission();
        if (this.f138432i.isSecret() || this.f138432i.isCrossTenant() || m217682a(a, this.f138432i.getOwnerId(), shareCardPermission) || this.f138432i.isOnCall()) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f138425b.mo190997a(this);
        this.f138411H = new C25969c(new Handler(Looper.getMainLooper()));
        this.f138434k = new C35252a(this.mFrameContainer);
        this.f138412I = new LKUIStatus.C25680a(this.mFrameContainer).mo89858a(UIHelper.getString(R.string.Lark_Legacy_InLoading)).mo89859a();
        m217653C();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: h */
    public void mo190935h() {
        String string = UIHelper.getString(R.string.Lark_Group_Topic_MsgRestriction_SendFail_Title);
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Group_Topic_MsgRestriction_SendFail_Content, "group_name", this.f138432i.getName());
        new C25639g(this.f138424a).mo89237b(string).mo89238b(true).mo89242c(mustacheFormat).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Legacy_IKnow), (DialogInterface.OnClickListener) null).mo89239c();
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: v */
    public int mo190949v() {
        if (this.f138446z.mo134685a("group.dynamic.request.count")) {
            return (int) Math.ceil((double) ((((float) DeviceUtils.getScreenHeight(this.f138424a)) * 1.0f) / ((float) UIHelper.dp2px(126.0f))));
        }
        return 15;
    }

    /* renamed from: y */
    public void mo190952y() {
        this.mTitleBarBackgroundView.setBackgroundColor(UIUtils.getColor(this.f138424a, R.color.msg_menu_press));
        this.mIvGroupAvatarBackground.setBackgroundColor(UIUtils.getColor(this.f138424a, R.color.msg_menu_press));
        this.mFilterTabBackground.setBackgroundColor(UIUtils.getColor(this.f138424a, R.color.msg_menu_press));
    }

    /* renamed from: E */
    private void m217655E() {
        String str;
        if (!TextUtils.isEmpty(this.f138432i.getCreateTime())) {
            String string = UIUtils.getString(this.f138424a, R.string.Lark_Timeformat_DateFormatOtherYear);
            long parseLong = Long.parseLong(this.f138432i.getCreateTime()) * 1000;
            if (C29990c.m110930b().mo134587o().mo134746e()) {
                str = C26279i.m95153a(new Date(), string);
            } else {
                str = C26280j.m95169a(string, parseLong);
            }
            this.mJoinTopicGroupTip.setText(UIHelper.mustacheFormat((int) R.string.Lark_Groups_JoinGroupInfo, "date", str));
        } else {
            this.mJoinTopicGroupTip.setVisibility(8);
        }
        this.mSubscribeStatusIv.setVisibility(8);
        this.mSubscribeTipIv.setVisibility(8);
    }

    /* renamed from: G */
    private void m217657G() {
        this.mPostTopicIv.setImageDrawable(UIHelper.getDrawable(R.drawable.ic_svg_create_topic));
        ((LayerDrawable) this.mPostTopicIv.getDrawable()).findDrawableByLayerId(R.id.add_bold).setTint(UDColorUtils.getColor(this.f138424a, R.color.static_white));
        this.mPostTopicIv.setEnabled(this.f138431h.mo191231g());
        this.mPostTopicIv.setOnClickListener(this.f138407D);
        C29990c.m110930b().av().mo134628a(this.f138425b.mo191001b()).mo134644a(this.mPostTopicIv);
    }

    /* renamed from: I */
    private void m217659I() {
        ThreadWindowFragmentFactory threadWindowFragmentFactory = new ThreadWindowFragmentFactory(this.f138422S, this.f138431h);
        this.f138420Q = threadWindowFragmentFactory;
        m217685b(threadWindowFragmentFactory.mo190885a(0));
        C56093h hVar = new C56093h(this.f138425b.mo191007e(), this.f138420Q.mo190885a(0), this.f138420Q.mo190886b(0), this.f138420Q.mo190888d(0));
        this.f138436m = hVar;
        this.mTopicViewPager.setAdapter(hVar);
        this.mTopicViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass24 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                int i2 = 8;
                if (i == 0) {
                    ThreadWindowView.this.mRLSecondLevelTab.setVisibility(8);
                    ThreadWindowView.this.mSecondToDivider.setVisibility(8);
                    ThreadWindowView.this.f138436m.mo191376b(false);
                    ThreadWindowView.this.f138431h.mo191237l();
                    ThreadTopicHitPoint.f135906a.mo187742k();
                    ThreadWindowView.this.f138436m.mo191384i();
                    ViewGroup viewGroup = ThreadWindowView.this.mCreateNewTopicLayout;
                    if (!ThreadWindowView.this.f138443t) {
                        i2 = 0;
                    }
                    viewGroup.setVisibility(i2);
                    ThreadWindowView.this.mPostTopicLayout.setVisibility(0);
                } else if (i == 1) {
                    ThreadWindowView.this.f138431h.mo191228f(7);
                    ThreadTopicHitPoint.f135906a.mo187740j();
                    ChatHitPointNew.f135660c.mo187384a(ThreadWindowView.this.f138432i, "my_subscribe", "none", (Map<String, ? extends Object>) null);
                    ThreadWindowView.this.f138431h.mo191238m();
                    ThreadWindowView.this.mPostTopicLayout.setVisibility(8);
                    ThreadWindowView.this.mCreateNewTopicLayout.setVisibility(8);
                    ThreadWindowView.this.f138436m.mo191383h();
                }
            }
        });
    }

    /* renamed from: K */
    private void m217661K() {
        if (DesktopUtil.m144301a((Context) this.f138424a)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mIvGroupAvatar.getLayoutParams();
            layoutParams.width = UIHelper.dp2px(40.0f);
            layoutParams.height = UIHelper.dp2px(40.0f);
            layoutParams.gravity = 16;
            this.mIvGroupAvatar.setBorderWidthDP(1.0f);
            this.mTvGroupName.getLayoutParams().height = -2;
            this.mTvGroupName.setIncludeFontPadding(false);
            this.mTvGroupName.setTextSize(17.0f);
        }
    }

    /* renamed from: L */
    private void m217662L() {
        m217661K();
        m217663M();
        m217665O();
        this.mClAnnouncementView.setVisibility(0);
        if (!DesktopUtil.m144301a((Context) this.f138424a)) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.mFlTitleAnnounce.getLayoutParams();
            layoutParams.mo76392a(1);
            this.mFlTitleAnnounce.setLayoutParams(layoutParams);
            if (this.f138414K) {
                this.f138429f.setAlpha(BitmapDescriptorFactory.HUE_RED);
                if (mo190889A()) {
                    this.f138430g.setAlpha(BitmapDescriptorFactory.HUE_RED);
                }
                ThreadTopicHitPoint.f135906a.mo187728d(this.f138432i.getId());
                return;
            }
            this.mAppBarLayout.post(new Runnable() {
                /* class com.ss.android.lark.threadwindow.ThreadWindowView.RunnableC560005 */

                public void run() {
                    ThreadWindowView.this.mAppBarLayout.setExpanded(false, false);
                }
            });
        } else if (this.mBannerView.getVisibility() == 0) {
            ((ViewGroup.MarginLayoutParams) this.mBannerView.getLayoutParams()).topMargin = 0;
        }
    }

    /* renamed from: S */
    private List<IChatFunctionItem> m217669S() {
        List<IChatFunctionItem> list;
        TopicGroup topicGroup;
        if (this.f138437n) {
            list = C29990c.m110930b().mo134595w().mo134350a(this.f138432i);
        } else if (!this.f138417N || (topicGroup = this.f138433j) == null || topicGroup.getUserSetting() == null || this.f138433j.getUserSetting().getTopicGroupRole() != TopicGroup.TopicGroupRole.PARTICIPANT) {
            list = C29990c.m110930b().mo134595w().mo134351a((ChatChatter) null, (ChatChatter) null, this.f138432i, true);
        } else {
            list = C29990c.m110930b().mo134595w().mo134351a((ChatChatter) null, (ChatChatter) null, this.f138432i, false);
        }
        list.add(new ThreadSettingItem(this.f138432i, new ThreadSettingItem.ThreadSettingItemDependency() {
            /* class com.ss.android.lark.threadwindow.$$Lambda$ThreadWindowView$im4HwquG0tURvdhGbk6b05IVNw */

            @Override // com.ss.android.lark.chatwindow.view.sidemenu.item.ThreadSettingItem.ThreadSettingItemDependency
            public final void gotoGroupSettingActivity(String str) {
                ThreadWindowView.m271027lambda$im4HwquG0tURvdhGbk6b05IVNw(ThreadWindowView.this, str);
            }
        }));
        return list;
    }

    /* renamed from: P */
    private void m217666P() {
        boolean z;
        String str;
        if (this.f138432i.getChatAnnouncement() == null || TextUtils.isEmpty(this.f138432i.getChatAnnouncement().getContent()) || this.f138437n) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            str = "";
        } else if (this.f138435l) {
            str = UIUtils.getString(this.f138424a, R.string.Lark_Chat_TopicTitlebarNewAnnouncement) + "：" + m217689f(this.f138432i.getChatAnnouncement().getContent());
        } else {
            str = m217689f(this.f138432i.getChatAnnouncement().getContent());
        }
        if (TextUtils.isEmpty(str) || !z || !this.f138435l) {
            this.f138421R = null;
            this.mIvNewAnnounceIcon.setVisibility(8);
            this.mTvNewAnnounce.setVisibility(8);
            return;
        }
        this.mIvNewAnnounceIcon.setVisibility(0);
        this.mTvNewAnnounce.setVisibility(0);
        if (!str.equals(this.f138421R)) {
            LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(UIHelper.dp2px(16.0f), 0);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(standard, 0, str.length(), 33);
            this.f138421R = str;
            this.mTvNewAnnounce.setText(spannableString);
        }
    }

    /* renamed from: R */
    private void m217668R() {
        if (DesktopUtil.m144301a((Context) this.f138424a)) {
            ChatFunctionView chatFunctionView = new ChatFunctionView(this.f138424a);
            this.f138406C = chatFunctionView;
            ViewGroup.LayoutParams layoutParams = chatFunctionView.getRecyclerView().getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f138406C.getRecyclerView().setLayoutParams(layoutParams);
            this.f138406C.setBackgroundColor(UIHelper.getColor(R.color.bg_body_overlay));
            this.f138406C.setPaddingRelative(0, 0, 0, 0);
            this.f138419P = new DesktopSideMenuItemBinder(this.f138424a);
            IChatSettingDependency w = C29990c.m110930b().mo134595w();
            Activity activity = this.f138424a;
            IChatFunctionController a = w.mo134348a(activity, this.f138432i, (Chatter) null, this.f138406C, this.f138419P, new LinearLayoutManager(activity), m217669S());
            this.f138418O = a;
            this.f138419P.mo129898a(a);
            this.f138406C.setSideMenuViewDelegate(this.f138419P);
            C36512a.m144041a().mo134757a(this.f138406C);
        } else {
            this.f138418O = C29990c.m110930b().mo134595w().mo134349a(this.f138424a, this.f138432i, (Chatter) null, m217669S());
        }
        this.f138418O.mo127561a(new OnItemUpdateListener() {
            /* class com.ss.android.lark.threadwindow.$$Lambda$ThreadWindowView$mDDC6oBXBJUCIWCyQJz45zAQPTM */

            @Override // com.ss.android.lark.widget.chat_function_view.OnItemUpdateListener
            public final void onItemUpdated(IChatFunctionItem dVar) {
                ThreadWindowView.lambda$mDDC6oBXBJUCIWCyQJz45zAQPTM(ThreadWindowView.this, dVar);
            }
        });
    }

    /* renamed from: M */
    private void m217663M() {
        m217664N();
        if (!TextUtils.equals(this.f138432i.getName(), this.mTvGroupName.getText())) {
            this.mTvGroupName.setText(this.f138432i.getName());
            this.mTvGroupName.getPaint().setFakeBoldText(true);
        }
        if (this.f138437n) {
            this.mTvGroupNum.setVisibility(8);
        } else {
            this.mTvGroupNum.setVisibility(0);
            this.mTvGroupNum.setText(String.valueOf(this.f138432i.getUserCount()));
            if (!DesktopUtil.m144301a((Context) this.f138424a)) {
                this.mTvGroupNum.setTypeface(Typeface.createFromAsset(this.f138424a.getAssets(), "fonts/DINAlternateBold.ttf"));
            }
            this.mTvGroupNum.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.threadwindow.$$Lambda$ThreadWindowView$wL_FyWP0W2GyKR2iMRbKULIO5Y */

                public final void onClick(View view) {
                    ThreadWindowView.m271028lambda$wL_FyWP0W2GyKR2iMRbKULIO5Y(ThreadWindowView.this, view);
                }
            });
        }
        if (TextUtils.isEmpty(this.f138432i.getDescription()) || this.f138437n) {
            this.mTvGroupDesc.setVisibility(8);
            this.mNumDescDivider.setVisibility(8);
        } else {
            if (!TextUtils.equals(this.f138432i.getDescription(), this.mTvGroupDesc.getText())) {
                this.mTvGroupDesc.setText(this.f138432i.getDescription());
            }
            this.mTvGroupDesc.setVisibility(0);
            this.mNumDescDivider.setVisibility(0);
        }
        if (!this.f138428e.mo134399b()) {
            C33085b.m127936a(this.f138432i, null).mo122241a(C29990c.m110930b()).mo122240a(new ThreadWindowTagProvider()).mo122239a(this.mTvGroupName.getContext()).mo90027e().mo90004a(this.mTvGroupName);
        } else {
            this.mTvGroupName.setCompoundDrawables(null, null, null, null);
        }
        m217666P();
        if (mo190889A()) {
            this.mShareGroupLayout.setVisibility(0);
        } else {
            this.mShareGroupLayout.setVisibility(8);
        }
        if (this.f138437n) {
            this.mGroupContentLayout.setGravity(16);
        }
        if (DesktopUtil.m144301a((Context) this.f138424a)) {
            this.mThreadDoneLayout.setVisibility(0);
        } else {
            this.mThreadDoneLayout.setVisibility(8);
        }
    }

    /* renamed from: J */
    private void m217660J() {
        int i;
        this.mTitleBar.removeAllActions();
        this.mTitleBar.setRightVisible(true);
        this.mTitleBar.setLeftVisible(false);
        this.mTitleBar.setSecLeftVisible(false);
        int color = this.f138424a.getResources().getColor(R.color.white);
        this.mTitleBar.setBackgroundColor(0);
        this.mTitleBar.setMainTitleColor(color);
        this.mTitleBar.setSubTitleColor(color);
        if (!DesktopUtil.m144301a((Context) this.f138424a)) {
            StatusBarUtil.setTransparentForImageView(this.f138424a, this.mTitleBar);
            ViewGroup.LayoutParams layoutParams = this.mTitleBarLayout.getLayoutParams();
            layoutParams.height += StatusBarUtil.getStatusBarHeight(this.f138424a);
            this.mTitleBarLayout.setLayoutParams(layoutParams);
        } else {
            this.mTitleBarLayout.setVisibility(8);
        }
        LinearLayout leftLayout = this.mTitleBar.getLeftLayout();
        if (leftLayout.getChildCount() == 0) {
            leftLayout.removeAllViews();
            leftLayout.addView(C35266c.m137765b(leftLayout.getContext(), true));
        }
        leftLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.threadwindow.$$Lambda$ThreadWindowView$RhXqM9zow9qLnX66VbqeEdG3Jc */

            public final void onClick(View view) {
                ThreadWindowView.m271025lambda$RhXqM9zow9qLnX66VbqeEdG3Jc(ThreadWindowView.this, view);
            }
        });
        if (DesktopUtil.m144301a((Context) this.f138424a)) {
            i = 8;
        } else {
            i = 0;
        }
        leftLayout.setVisibility(i);
        this.f138408E = (TextView) leftLayout.findViewById(R.id.new_message_text);
        mo190892a(this.f138427d.mo134686a());
        if (this.mTitleBar.getCenterLayout().getChildCount() != 1) {
            this.f138429f = C35266c.m137763a(this.mTitleBar.getContext(), true);
        } else {
            this.f138429f = this.mTitleBar.getCenterLayout().getChildAt(0);
            this.mTitleBar.getCenterLayout().removeAllViews();
        }
        TextView textView = (TextView) this.f138429f.findViewById(R.id.group_name);
        TextView textView2 = (TextView) this.f138429f.findViewById(R.id.group_num);
        textView.getPaint().setFakeBoldText(true);
        textView.setText(this.f138432i.getName());
        textView2.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_NumFormat, "count", Integer.toString(this.f138432i.getUserCount())));
        textView.setVisibility(0);
        textView2.setVisibility(8);
        ((ImageView) this.f138429f.findViewById(R.id.setting_iv)).setVisibility(8);
        ((UserStatusLinearLayout) this.f138429f.findViewById(R.id.user_status_layout)).setVisibility(8);
        this.mTitleBar.setCustomTitleView(this.f138429f);
        ImageView imageView = new ImageView(this.f138424a);
        this.f138430g = imageView;
        imageView.setId(R.id.iv_thread_share);
        ImageView imageView2 = this.f138430g;
        Activity activity = this.f138424a;
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(activity, (int) R.drawable.ud_icon_share_outlined, UDColorUtils.getColor(activity, R.color.static_white)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 16;
        this.mTitleBar.addAction(new IActionTitlebar.C57575b(this.f138430g) {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.C559942 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                if (ThreadWindowView.this.f138430g.getAlpha() != BitmapDescriptorFactory.HUE_RED) {
                    ThreadWindowView.this.f138431h.mo191235j();
                }
            }
        }, layoutParams2);
        if (mo190889A()) {
            this.f138430g.setVisibility(0);
        } else {
            this.f138430g.setVisibility(8);
        }
        View inflate = LayoutInflater.from(this.f138424a).inflate(R.layout.chat_window_title_right_view, (ViewGroup) null);
        TitleBarRedDotView titleBarRedDotView = (TitleBarRedDotView) inflate.findViewById(R.id.chat_title_red_dot_view);
        this.f138409F = titleBarRedDotView;
        Activity activity2 = this.f138424a;
        titleBarRedDotView.setIconDrawable(UDIconUtils.getIconDrawable(activity2, (int) R.drawable.ud_icon_more_outlined, UDColorUtils.getColor(activity2, R.color.static_white)));
        C559983 r5 = new IActionTitlebar.C57575b(inflate) {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.C559983 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                ChatHitPointNew.f135660c.mo187384a(ThreadWindowView.this.f138432i, "setting_sidebar", "im_chat_setting_view", (Map<String, ? extends Object>) null);
                ThreadWindowView.this.f138425b.mo191000a(ThreadWindowView.this.f138432i.getId(), ThreadWindowView.this.mo190948u(), ThreadWindowView.this.f138437n, ThreadWindowView.this.f138440q);
            }
        };
        if (!DesktopUtil.m144301a((Context) this.f138424a)) {
            this.mTitleBar.addAction(r5, new LinearLayout.LayoutParams(-2, -1));
        }
        m217667Q();
        m217681a(this.f138432i.isShowApplyBanner(), this.f138432i.getPutChatterApplyCount());
        TextView textView3 = (TextView) this.f138429f.findViewById(R.id.tag_wrapper);
        if (this.f138428e.mo134399b()) {
            textView3.setVisibility(8);
        }
        C33085b.m127936a(this.f138432i, null).mo122241a(C29990c.m110930b()).mo122240a(new ThreadWindowTagProvider()).mo122239a(textView3.getContext()).mo90027e().mo90004a(textView3);
        textView3.setVisibility(0);
        this.mAppBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.C559994 */

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                Log.m165379d("ThreadWindowView", "onOffsetChanged:verticalOffset=" + i);
                if (Math.abs(i) == ThreadWindowView.this.mClAnnouncementView.getMeasuredHeight()) {
                    ThreadWindowView.this.f138429f.setAlpha(1.0f);
                    if (ThreadWindowView.this.mo190889A()) {
                        ThreadWindowView.this.f138430g.setAlpha(1.0f);
                    }
                } else {
                    ThreadWindowView.this.f138429f.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    if (ThreadWindowView.this.mo190889A()) {
                        ThreadWindowView.this.f138430g.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    }
                }
                ThreadWindowView.this.f138436m.mo191378c(i);
                if (Math.abs(i) > 0) {
                    ThreadWindowView.this.f138442s = false;
                } else {
                    ThreadWindowView.this.f138442s = true;
                }
            }
        });
    }

    /* renamed from: c */
    public void mo190923c(int i) {
        m217688e(i);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m217680a(IChatFunctionItem dVar) {
        m217679a(this.f138409F);
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m217687d(View view) {
        this.f138425b.mo191004c();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m217684b(View view) {
        this.f138443t = true;
        this.mCreateNewTopicLayout.setVisibility(8);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m217686c(View view) {
        this.f138425b.mo190998a(this.f138432i.getId());
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m217690g(String str) {
        this.f138425b.mo191000a(str, mo190948u(), this.f138437n, this.f138440q);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: e */
    public void mo190932e(String str) {
        C29990c.m110930b().mo134593u().mo134331a(this.f138424a, str, 2);
    }

    /* renamed from: e */
    private void m217688e(final int i) {
        if (this.f138417N && mo190948u()) {
            this.mJoinTopicGroup.post(new Runnable() {
                /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass21 */

                public void run() {
                    ThreadWindowView.this.f138436m.mo191375b(i, ThreadWindowView.this.mJoinTopicGroup.getMeasuredHeight());
                }
            });
        }
    }

    /* renamed from: f */
    private String m217689f(String str) {
        if (str != null) {
            return Pattern.compile("[\t\r\n]").matcher(str).replaceAll(" ");
        }
        return "";
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: c */
    public void mo190924c(ErrorResult errorResult) {
        C35212a.m137531a(this.f138424a, (String) null, errorResult.getDisplayMsg());
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: d */
    public void mo190930d(String str) {
        C35212a.m137531a(this.f138424a, (String) null, str);
    }

    /* renamed from: a */
    private void m217679a(TitleBarRedDotView titleBarRedDotView) {
        if (titleBarRedDotView == null) {
            Log.m165382e("titleBarRedDotView == null");
            return;
        }
        IChatFunctionItem a = this.f138418O.mo127557a();
        if (a == null || a.mo127574b() == null) {
            titleBarRedDotView.mo130004a(false);
            return;
        }
        ChatFunctionBadge b = a.mo127574b();
        titleBarRedDotView.setBadgeDrawable(b.mo197611a());
        titleBarRedDotView.mo130005a(true, b.mo197616c());
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: b */
    public void mo190915b(int i) {
        LKUIToast.show(this.f138424a, i);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: c */
    public void mo190925c(Chat chat) {
        if (!chat.isTeam() || !C29990c.m110930b().an().mo134467a()) {
            this.f138425b.mo191002b(chat);
        } else {
            UDToast.show(this.f138424a, (int) R.string.Project_MV_GroupsInTeamCantShare);
        }
    }

    /* renamed from: d */
    public void mo190929d(int i) {
        Integer num;
        Map<Integer, Integer> d = this.f138420Q.mo190888d(0);
        if (!d.containsKey(Integer.valueOf(i))) {
            C69619a aVar = this.f138413J;
            if (aVar != null) {
                ((View) aVar.mo243193c(1)).performClick();
            }
        } else if (this.f138413J != null && (num = d.get(Integer.valueOf(i))) != null) {
            ((C69628b) this.f138413J.mo243193c(num.intValue())).performClick();
        }
    }

    /* renamed from: b */
    private void m217685b(final List<String> list) {
        if (m217658H()) {
            this.mTlTopicIndicator.setVisibility(0);
            AnonymousClass25 r0 = new AbstractC69621a() {
                /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass25 */

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public int mo16055a() {
                    return list.size();
                }

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public AbstractC69623c mo16056a(Context context) {
                    C69625a aVar = new C69625a(context);
                    aVar.setMode(1);
                    aVar.setLineHeight((float) UIUtils.dp2px(context, 4.0f));
                    aVar.setLineWidth((float) UIUtils.dp2px(context, 12.0f));
                    aVar.setRoundRadius((float) UIUtils.dp2px(context, 2.0f));
                    aVar.setColors(Integer.valueOf(C57582a.m223616d(context, R.color.primary_pri_500)));
                    aVar.setXOffset((float) UIUtils.dp2px(context, 12.0f));
                    aVar.setYOffset((float) UIUtils.dp2px(context, -2.0f));
                    Interpolator create = PathInterpolatorCompat.create(0.34f, 0.69f, 0.1f, 1.0f);
                    aVar.setStartInterpolator(create);
                    aVar.setEndInterpolator(create);
                    return aVar;
                }

                @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
                /* renamed from: a */
                public AbstractC69624d mo16057a(final Context context, final int i) {
                    C69628b bVar = new C69628b(context);
                    bVar.setContentView(R.layout.view_thread_filter_tab);
                    final TextView textView = (TextView) bVar.findViewById(R.id.tv_tab_name);
                    final View findViewById = bVar.findViewById(R.id.view_red_dot);
                    textView.setText((CharSequence) list.get(i));
                    bVar.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass25.View$OnClickListenerC559961 */

                        public void onClick(View view) {
                            ThreadWindowView.this.mTopicViewPager.setCurrentItem(i, false);
                        }
                    });
                    bVar.setOnPagerTitleChangeListener(new C69628b.AbstractC69630b() {
                        /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass25.C559972 */

                        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
                        /* renamed from: a */
                        public void mo16700a(int i, int i2, float f, boolean z) {
                        }

                        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
                        /* renamed from: b */
                        public void mo16702b(int i, int i2, float f, boolean z) {
                        }

                        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
                        /* renamed from: b */
                        public void mo16701b(int i, int i2) {
                            TextView textView = textView;
                            textView.setText(textView.getText().toString());
                            textView.setTextColor(UDColorUtils.getColor(context, R.color.text_caption));
                        }

                        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
                        /* renamed from: a */
                        public void mo16699a(int i, int i2) {
                            TextView textView = textView;
                            textView.setText(C55869b.m217004a(textView.getText().toString()));
                            textView.setTextColor(UDColorUtils.getColor(context, R.color.primary_pri_500));
                            if (i == 0) {
                                findViewById.setVisibility(4);
                            }
                        }
                    });
                    return bVar;
                }
            };
            C69619a aVar = new C69619a(this.f138424a);
            this.f138413J = aVar;
            aVar.setReselectWhenLayout(false);
            this.f138413J.setSkimOver(true);
            this.f138413J.setAdjustMode(false);
            this.f138413J.setAdapter(r0);
            this.f138413J.setLeftPadding(UIUtils.dp2px(this.f138424a, 6.0f));
            this.mTlTopicIndicator.setNavigator(this.f138413J);
            C69634c.m267483a(this.mTlTopicIndicator, this.mTopicViewPager);
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: c */
    public void mo190926c(Message message) {
        this.f138405B.mo134697a(this.f138424a, message, 2);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: c */
    public void mo190927c(String str) {
        WindowDialogManager.f91123a.mo129819a(new C25639g(this.f138424a).mo89237b(str).mo89238b(true).mo89251j(2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) null).mo89239c());
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190892a(int i) {
        TextView textView = this.f138408E;
        if (textView != null) {
            textView.setTextColor(UIHelper.getColor(R.color.lkui_N900));
            if (i <= 0 || !this.f138431h.mo191233h()) {
                this.f138408E.setText("");
                this.f138408E.setBackground(null);
            } else if (i <= 999) {
                this.f138408E.setText(String.valueOf(i));
                this.f138408E.setBackgroundResource(R.drawable.thread_window_badge_bg);
            } else {
                this.f138408E.setText("");
                this.f138408E.setBackgroundResource(R.drawable.chat_window_badge_point_static_white);
            }
            m217667Q();
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: b */
    public void mo190917b(ErrorResult errorResult) {
        if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
            LKUIToast.show(this.f138424a, errorResult.getDisplayMsg());
        } else if (errorResult.getErrorCode() == 5055) {
            Activity activity = this.f138424a;
            LKUIToast.show(activity, C57582a.m223604a((Context) activity, (int) R.string.Lark_Groups_CantAnonymousLimitReachedTip));
        } else if (errorResult.getErrorCode() == 5054) {
            Activity activity2 = this.f138424a;
            LKUIToast.show(activity2, UIUtils.getString(activity2, R.string.Lark_Groups_AnonymousPostFailedOwnerNotAllow));
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: b */
    public void mo190918b(Chat chat) {
        m217678a(this.mTitleBar, chat);
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: b */
    public void mo190919b(Message message) {
        ThreadMergeForwardLauncher.f138288a.mo190745a(this.f138424a, message.getId(), message);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m217677a(DialogInterface dialogInterface, int i) {
        mo190928d();
    }

    /* renamed from: b */
    private void m217683b(int i, boolean z) {
        int i2;
        C69628b bVar = (C69628b) this.f138413J.mo243193c(i);
        if (bVar != null) {
            View findViewById = bVar.findViewById(R.id.view_red_dot);
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
        }
    }

    /* renamed from: a */
    private void m217678a(View view, Chat chat) {
        this.f138432i = chat;
        if (chat.getChatOptionInfo() != null && this.f138432i.getChatOptionInfo().isAnnounceIsUnread()) {
            this.f138435l = true;
        }
        ((TextView) view.findViewById(R.id.group_name)).setText(chat.getName());
        ((TextView) view.findViewById(R.id.group_num)).setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_NumFormat, "count", Integer.toString(this.f138432i.getUserCount())));
        m217663M();
    }

    /* renamed from: a */
    private void m217681a(boolean z, int i) {
        if (!z || i <= 0) {
            mo190890B();
            return;
        }
        this.mBannerView.setVisibility(0);
        this.mBannerView.setClickable(true);
        this.mBannerView.setIconButtonListener(new View.OnClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass13 */

            public void onClick(View view) {
                ThreadWindowView.this.f138431h.mo191227f();
            }
        });
        this.mBannerView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass14 */

            public void onClick(View view) {
                ThreadWindowView.this.f138425b.mo191003b(ThreadWindowView.this.f138432i.getId());
                ThreadWindowView.this.mo190890B();
            }
        });
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(UIHelper.getQuantityString(R.plurals.Lark_Groups_NewNumPendingRequests, i));
        spannableString.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(this.f138424a, R.color.text_title)), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        SpannableString spannableString2 = new SpannableString(UIHelper.getString(R.string.Lark_Groups_NewClickToViewPendingRequests));
        spannableString2.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(this.f138424a, R.color.text_link_normal)), 0, spannableString2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString2);
        this.mBannerView.setText(spannableStringBuilder);
    }

    /* renamed from: b */
    public void mo190916b(int i, int i2) {
        if (this.f138423T == null) {
            this.f138423T = ValueAnimator.ofFloat((float) i, (float) i2);
        }
        if (!this.f138423T.isRunning()) {
            this.f138423T.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass18 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ThreadWindowView.this.mJoinTopicGroupLayout.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    ThreadWindowView.this.f138436m.mo191374b(((Float) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            this.f138423T.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass19 */

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    ThreadWindowView.this.mJoinTopicGroup.setVisibility(4);
                }
            });
            this.f138423T.setDuration(400L);
            this.f138423T.start();
        }
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190893a(int i, int i2) {
        this.f138436m.mo191365a(i, i2);
    }

    /* renamed from: a */
    private boolean m217682a(String str, String str2, Chat.ShareCardPermission shareCardPermission) {
        if (!TextUtils.equals(str, str2) && shareCardPermission == Chat.ShareCardPermission.NOT_ALLOWED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b
    /* renamed from: a */
    public void mo190894a(int i, int i2, boolean z) {
        this.f138436m.mo191366a(i, i2, z);
    }

    public ThreadWindowView(Activity activity, AbstractC56006a aVar, Chat chat, ChatChatter chatChatter, TopicGroup topicGroup, String str) {
        boolean z;
        AbstractC36503q n = C29990c.m110930b().mo134586n();
        this.f138446z = n;
        this.f138428e = C29990c.m110930b().mo134515N();
        this.f138404A = C29990c.m110930b().mo134597y();
        this.f138405B = C29990c.m110930b().mo134520S();
        this.f138407D = new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.C559931 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowView.this.mCreateNewTopicLayout.setVisibility(8);
                if (ThreadWindowView.this.f138431h.mo191231g()) {
                    ThreadWindowView.this.f138431h.mo191224e();
                    return;
                }
                ThreadWindowView threadWindowView = ThreadWindowView.this;
                threadWindowView.mo190908a(UIUtils.getString(threadWindowView.f138424a, R.string.Lark_Group_GroupOwnerAdminBannedNewTopics));
            }
        };
        boolean z2 = false;
        this.f138416M = false;
        this.f138441r = true;
        this.f138442s = true;
        this.f138443t = false;
        this.f138422S = new AbstractC56087e() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowView.AnonymousClass12 */

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: b */
            public void mo190782b(View view, String str) {
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public void mo190958a(String str, List<GroupRecallEntity> list) {
                ThreadWindowView.this.f138431h.mo191205a(str, list);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public void mo190959a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
                ThreadWindowView.this.f138431h.mo191206a(str, list, iGetDataCallback);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190772a(String str, int i) {
                ThreadWindowView.this.f138431h.mo191216b(str, i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190771a(String str) {
                ThreadWindowView.this.f138431h.mo191223d(str);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190779a(String str, boolean z, int i) {
                ThreadWindowView.this.f138431h.mo191208a(str, z, i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190775a(String str, String str2, int i, int i2, String str3, int i3) {
                ThreadWindowView.this.f138431h.mo191201a(str, str2, i, str3, i3);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190774a(String str, String str2, int i) {
                ThreadWindowView.this.f138431h.mo191200a(str, str2, i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190780a(String str, boolean z, boolean z2, int i) {
                ThreadWindowView.this.f138431h.mo191199a(str, ThreadWindowView.this.f138432i, z, z2, i);
                ChatHitPointNew.f135660c.mo187384a(ThreadWindowView.this.f138432i, "topic_reply", "none", ChatHitPointNew.f135660c.mo187379a(str));
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190773a(String str, int i, int i2) {
                ThreadWindowView.this.f138431h.mo191195a(str, i, ThreadWindowView.this.f138432i, i2);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public void mo190960a(List<String> list) {
                StringBuilder sb = new StringBuilder();
                sb.append("onReadThread, threadIdSize:");
                sb.append(CollectionUtils.isEmpty(list) ? 0 : list.size());
                sb.append(", chat:");
                sb.append(ThreadWindowView.this.f138432i);
                Log.m165389i("ThreadWindowView", sb.toString());
                ThreadWindowView.this.f138431h.mo191209a(list);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public void mo190956a(String str, int i, AbstractC36459ag.AbstractC36460a aVar) {
                ThreadWindowView.this.f138431h.mo191196a(str, i, aVar);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public boolean mo190962a(int i) {
                return ThreadWindowView.this.f138431h.mo191212a(i);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public void mo190961a(List<String> list, int i) {
                ThreadWindowView.this.f138431h.mo191210a(list, i);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public void mo190957a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
                ThreadWindowView.this.f138431h.mo191197a(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190777a(String str, String str2, String str3, Message.SourceType sourceType) {
                ThreadWindowView.this.f138431h.mo191203a(str, str2, str3, sourceType);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190776a(String str, String str2, Message.SourceType sourceType) {
                ThreadWindowView.this.f138431h.mo191202a(str, str2, sourceType);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190781a(boolean z) {
                ThreadWindowView.this.mo190921b(z);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190778a(String str, String str2, boolean z) {
                ThreadWindowView.this.f138431h.mo191204a(str, str2, z);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190770a(PhotoItem photoItem, boolean z) {
                EditImageUtils.m133181a(ThreadWindowView.this.f138424a, photoItem, ThreadWindowView.this.f138425b.mo191001b(), true, true);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public ChatChatter mo190764a() {
                return ThreadWindowView.this.f138426c;
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: c */
            public void mo190787c() {
                ThreadWindowView.this.f138431h.mo191213b();
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: e */
            public void mo190792e() {
                ThreadWindowView.this.f138431h.mo191221d();
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: f */
            public void mo190794f() {
                ThreadWindowView.this.f138425b.mo191006d();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: h */
            public Chat mo190968h() {
                return ThreadWindowView.this.f138432i;
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: j */
            public void mo190970j() {
                ThreadWindowView.this.f138431h.mo191224e();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: n */
            public boolean mo190976n() {
                return ThreadWindowView.this.mo190951x();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: o */
            public boolean mo190977o() {
                return ThreadWindowView.this.mo190951x();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: i */
            public boolean mo190969i() {
                return ThreadWindowView.this.f138431h.mo191231g();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: k */
            public int mo190972k() {
                return ThreadWindowView.this.mTitleBar.getMeasuredHeight();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: l */
            public float mo190974l() {
                return (float) ThreadWindowView.this.mFlTitleAnnounce.getMeasuredHeight();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: m */
            public int mo190975m() {
                return ThreadWindowView.this.f138431h.mo191236k();
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: g */
            public String mo190796g() {
                if (ThreadWindowView.this.f138432i == null || ThreadWindowView.this.f138432i.getChatAnnouncement() == null) {
                    return "";
                }
                return ThreadWindowView.this.f138432i.getChatAnnouncement().getAnnounceUrl();
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: d */
            public boolean mo190791d() {
                return ThreadWindowView.this.f138431h.mo191219c();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: p */
            public boolean mo190978p() {
                if (ThreadWindowView.this.f138433j == null || ThreadWindowView.this.f138433j.getUserSetting() == null || ThreadWindowView.this.f138433j.getUserSetting().getTopicGroupRole() != TopicGroup.TopicGroupRole.PARTICIPANT) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: b */
            public boolean mo190785b() {
                return ThreadWindowView.this.f138431h.mo191211a();
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: b */
            public void mo190963b(int i) {
                ThreadWindowView.this.f138431h.mo191214b(i);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: d */
            public void mo190966d(int i) {
                ThreadWindowView.this.f138431h.mo191222d(i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: g */
            public void mo190797g(String str) {
                ThreadWindowView.this.f138431h.mo191229f(str);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: i */
            public void mo190799i(String str) {
                ThreadWindowView.this.f138431h.mo191232h(str);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: b */
            public void mo190783b(String str) {
                ThreadWindowView.this.f138431h.mo191194a(str);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: d */
            public void mo190789d(String str) {
                ThreadWindowView.this.f138431h.mo191217c(str);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: e */
            public void mo190967e(int i) {
                ThreadWindowView.this.mo190923c(i);
                ThreadWindowView.this.f138431h.mo191225e(i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: f */
            public void mo190795f(String str) {
                ThreadWindowView.this.f138431h.mo191226e(str);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: h */
            public void mo190798h(String str) {
                ThreadWindowView.this.f138431h.mo191230g(str);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: j */
            public void mo190971j(String str) {
                ThreadWindowView.this.f138431h.mo191215b(str);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: c */
            public void mo190788c(String str) {
                if (ThreadWindowView.this.f138438o != null) {
                    ThreadWindowView.this.f138438o.mo122312a(str);
                }
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: e */
            public void mo190793e(String str) {
                ThreadWindowView.this.f138425b.mo191005c(str);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: k */
            public void mo190973k(String str) {
                ChatHitPointNew.f135660c.mo187384a(ThreadWindowView.this.f138432i, "topic_forward", "public_multi_select_share_view", ChatHitPointNew.f135660c.mo187379a(str));
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: b */
            public void mo190964b(boolean z) {
                int i;
                if (z) {
                    i = 6;
                } else {
                    i = 8;
                }
                ThreadTopicHitPoint.f135906a.mo187712a(i);
                ThreadWindowView.this.mo190929d(i);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: c */
            public boolean mo190965c(int i) {
                return ThreadWindowView.this.f138431h.mo191220c(i);
            }

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m
            /* renamed from: a */
            public void mo121953a(AbstractC55890m.AbstractC55891a aVar) {
                AbstractC55890m.C55892b bVar = (AbstractC55890m.C55892b) aVar.mo121960a();
                ThreadWindowView.this.f138431h.mo191207a(bVar.f138066a, bVar.f138067b);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public void mo190954a(int i, boolean z) {
                ThreadWindowView.this.f138431h.mo191187a(i, z);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: c */
            public Message mo190786c(String str, int i) {
                return ThreadWindowView.this.f138431h.mo191186a(str, i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190765a(View view, String str) {
                ThreadWindowView.this.f138431h.mo191189a(ThreadWindowView.this.f138424a, view, str);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: b */
            public void mo190784b(String str, int i) {
                ThreadWindowView.this.f138431h.mo191218c(str, i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: d */
            public void mo190790d(String str, int i) {
                ThreadWindowView.this.f138431h.mo191198a(str, ThreadWindowView.this.f138432i, i);
            }

            @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56087e
            /* renamed from: a */
            public void mo190955a(AbsMessageVO aVar, int i) {
                ThreadWindowView.this.f138431h.mo191192a(aVar, i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190769a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback) {
                ThreadWindowView.this.f138431h.mo191193a(sticker, iGetDataCallback);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190766a(View view, String str, String str2, int i) {
                if (ThreadWindowView.this.f138438o != null) {
                    ThreadWindowView.this.f138438o.mo122310a(view, str2, str, i);
                }
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190768a(View view, List<PhotoItem> list, String str, int i) {
                boolean z;
                if (ThreadWindowView.this.f138432i.isSecret() || !C29990c.m110930b().mo134586n().mo134685a("translate.message.image.viewer.enable")) {
                    z = false;
                } else {
                    z = true;
                }
                for (PhotoItem photoItem : list) {
                    if (photoItem != null) {
                        photoItem.getPhotoState().setLoadOrigin(true);
                    }
                }
                C29990c.m110930b().mo134542a(ThreadWindowView.this.f138424a, list, 0, view, null, !ThreadWindowView.this.f138432i.isSecret(), false, true, false, true, z, false, false, new DialogMenuClickListenerImpl(ThreadWindowView.this.f138432i.getId()), null, null, Scene.Thread, i);
            }

            @Override // com.ss.android.lark.threadtab.p2757a.AbstractC55977b
            /* renamed from: a */
            public void mo190767a(View view, String str, boolean z, int i, String str2, String str3) {
                ThreadWindowView.this.f138431h.mo191191a(view, str, z, i);
                ChatHitPointNew.f135660c.mo187384a(ThreadWindowView.this.f138432i, "topic_subscribe", "none", ChatHitPointNew.f135660c.mo187379a(str));
            }
        };
        this.f138424a = activity;
        this.f138425b = aVar;
        this.f138432i = chat;
        this.f138433j = topicGroup;
        this.f138426c = chatChatter;
        if (chat.getChatOptionInfo() == null || !this.f138432i.getChatOptionInfo().isAnnounceIsUnread()) {
            z = false;
        } else {
            z = true;
        }
        this.f138435l = z;
        if (topicGroup != null && topicGroup.getType() == TopicGroup.Type.DEFAULT) {
            z2 = true;
        }
        this.f138437n = z2;
        this.f138414K = C56145l.m218886a();
        this.f138438o = new C33111af((FragmentActivity) activity, C33102ad.from(aVar.mo191001b()));
        this.f138417N = n.mo134685a("group.role.obeserver");
        this.f138440q = "topic_tab".equals(str);
    }
}
