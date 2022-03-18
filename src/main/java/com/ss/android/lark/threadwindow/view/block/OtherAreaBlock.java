package com.ss.android.lark.threadwindow.view.block;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.ui.flowlayout.FlowLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34331aa;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35249h;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.p2993y.p2994a.AbstractC59357a;
import com.ss.android.lark.p2993y.p2994a.AbstractC59358b;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.threaddetail.view.C55869b;
import com.ss.android.lark.threadwindow.view.p2766a.AbstractC56150a;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.linked_emojicon.widget.CustomTypefaceSpan;
import com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58542c;
import com.ss.android.lark.widget.listener.DuplicateEnterChecker;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class OtherAreaBlock extends AbstractC59004b<ThreadMessageVO, OtherAreaViewHolder> implements AbstractC34028a<C33141d<ThreadMessageVO, OtherAreaViewHolder>>, AbstractC59357a {

    /* renamed from: d */
    private static final int f138894d = UIHelper.dp2px(32.0f);

    /* renamed from: e */
    private static final int f138895e = UIHelper.dp2px(4.0f);

    /* renamed from: g */
    private static final int f138896g = UIHelper.dp2px(6.0f);

    /* renamed from: h */
    private static final int f138897h = UIHelper.dp2px(8.0f);

    /* renamed from: i */
    private static final int f138898i = UIHelper.dp2px(12.0f);

    /* renamed from: j */
    private static final int f138899j;

    /* renamed from: k */
    private static final int f138900k = UIHelper.dp2px(112.0f);

    /* renamed from: n */
    private static final int f138901n;

    /* renamed from: r */
    private static final boolean f138902r = C29990c.m110930b().mo134586n().mo134685a("lark.feed.reaction.optimize");

    /* renamed from: a */
    public final AbstractC56166a f138903a;

    /* renamed from: b */
    protected Context f138904b;

    /* renamed from: l */
    private final C33973b f138905l;

    /* renamed from: m */
    private final AbstractC56150a f138906m;

    /* renamed from: o */
    private final AbstractC36509x f138907o = C29990c.m110930b().mo134597y();

    /* renamed from: p */
    private final AbstractC36510y f138908p = C29990c.m110930b().mo134587o();

    /* renamed from: q */
    private final AbstractC36503q f138909q = C29990c.m110930b().mo134586n();

    /* renamed from: com.ss.android.lark.threadwindow.view.block.OtherAreaBlock$a */
    public interface AbstractC56166a {
        /* renamed from: a */
        void mo191273a(View view, ThreadMessageVO threadMessageVO);

        /* renamed from: a */
        void mo191275a(View view, ThreadMessageVO threadMessageVO, int i, boolean z);

        /* renamed from: a */
        void mo191276a(View view, String str);

        /* renamed from: a */
        void mo191277a(View view, String str, boolean z);

        /* renamed from: a */
        void mo191278a(View view, String str, boolean z, int i, String str2, String str3, int i2, String str4);

        /* renamed from: a */
        void mo191279a(ThreadMessageVO threadMessageVO, int i);

        /* renamed from: a */
        void mo191285a(String str, String str2, boolean z);

        /* renamed from: a */
        void mo191286a(List<ReactionInfo> list, String str);

        /* renamed from: b */
        void mo191289b(View view, ThreadMessageVO threadMessageVO);

        /* renamed from: b */
        void mo191290b(View view, ThreadMessageVO threadMessageVO, int i);

        /* renamed from: b */
        void mo191291b(View view, String str, String str2);

        /* renamed from: c */
        void mo191296c(View view, ThreadMessageVO threadMessageVO);

        /* renamed from: c */
        void mo191297c(View view, ThreadMessageVO threadMessageVO, int i);

        /* renamed from: c */
        void mo191298c(String str);

        /* renamed from: d */
        void mo191301d(String str);
    }

    /* renamed from: a */
    public void mo191483a(List<C34029b> list, C33141d<ThreadMessageVO, OtherAreaViewHolder> dVar) {
    }

    @Override // com.ss.android.lark.p2993y.p2994a.AbstractC59357a
    /* renamed from: a */
    public /* synthetic */ boolean mo122800a(AbstractC59358b bVar, ChatMessageVO cVar) {
        return AbstractC59357a.CC.$default$a(this, bVar, cVar);
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    public static class OtherAreaViewHolder extends AbstractC59010e implements AbstractC59358b {
        @BindView(7207)
        public LKUILottieAnimationView attentionBtn;
        @BindView(7484)
        public View contentLayout;
        @BindView(7503)
        public TextView createTimeTV;
        @BindView(7731)
        public FlowLayout flTopicDesc;
        @BindView(7742)
        public View footerLayout;
        @BindView(7748)
        public ImageView forwardIV;
        @BindView(9053)
        public TextView mForwardDescription;
        @BindView(9294)
        public ReactionFlowLayout mReactionThreadView;
        @BindView(8555)
        public View mReplyBubble;
        @BindView(8554)
        public LinearLayout mReplyLayout;
        @BindView(8773)
        public LKUILottieAnimationView mTranslateShowOriginLV;
        @BindView(9082)
        public TextView mTranslationFeedbackTV;
        @BindView(8366)
        public ImageView operationMoreIV;
        @BindView(8379)
        public LKUIRoundedImageView ownerAvatarIV;
        @BindView(8380)
        public TextView ownerNameTV;
        @BindView(8412)
        public TextView pinDesc;
        @BindView(8413)
        public View pinImage;
        @BindView(8483)
        public LKUILottieAnimationView reactionIV;
        @BindView(8553)
        public ImageView replyIV;
        @BindView(8852)
        public ImageView sendFailedIV;
        @BindView(8737)
        public View sendStatusLayout;
        @BindView(8740)
        public ProgressBar sendingPgbar;
        @BindView(8854)
        public TextView statusSendingTV;
        @BindView(9158)
        public TextView topicCloseStatusTv;
        @BindView(9161)
        public TextView topicSourceTV;

        @Override // com.ss.android.lark.p2993y.p2994a.AbstractC59358b
        /* renamed from: a */
        public LKUILottieAnimationView mo122801a() {
            return this.mTranslateShowOriginLV;
        }

        @Override // com.ss.android.lark.p2993y.p2994a.AbstractC59358b
        /* renamed from: b */
        public TextView mo122802b() {
            return this.mTranslationFeedbackTV;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.reactionIV.setImageDrawable(UDIconUtils.getIconDrawable(view.getContext(), R.drawable.ud_icon_thumbsup_outlined, UDColorUtils.getColor(view.getContext(), R.color.icon_n3), new UDDimension.Dp(16)));
            this.reactionIV.setAnimation(R.raw.thread_window_like_reaction);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<ThreadMessageVO, OtherAreaViewHolder> dVar) {
        mo191483a((List<C34029b>) list, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(OtherAreaViewHolder otherAreaViewHolder, ThreadMessageVO threadMessageVO) {
        C29990c.m110930b().mo134577e().mo120953a(threadMessageVO.mo121680Z(), threadMessageVO.mo121681a());
        m218951d(otherAreaViewHolder, threadMessageVO);
        C29990c.m110930b().mo134577e().mo120962b(threadMessageVO.mo121680Z(), threadMessageVO.mo121681a());
    }

    /* renamed from: a */
    public void mo191482a(String str) {
        if (!TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f138904b, str);
        }
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<ThreadMessageVO, OtherAreaViewHolder> dVar) {
        return bVar.f87966a == 0;
    }

    /* renamed from: a */
    public void mo191480a(View view, ThreadMessageVO threadMessageVO, int i, MotionEvent motionEvent) {
        if (DesktopUtil.m144301a(this.f138904b)) {
            View findViewById = view.findViewById(R.id.reaction_iv);
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                if (m218945a(findViewById, motionEvent)) {
                    this.f138903a.mo191275a(findViewById, threadMessageVO, i, true);
                } else {
                    this.f138903a.mo191275a(findViewById, threadMessageVO, i, false);
                }
            } else if (action == 10) {
                this.f138903a.mo191275a(findViewById, threadMessageVO, i, false);
            }
        }
    }

    /* renamed from: d */
    private Typeface m218950d() {
        return Typeface.createFromAsset(this.f138904b.getAssets(), "fonts/DINAlternateBold.ttf");
    }

    public class OtherAreaViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private OtherAreaViewHolder f138947a;

        @Override // butterknife.Unbinder
        public void unbind() {
            OtherAreaViewHolder otherAreaViewHolder = this.f138947a;
            if (otherAreaViewHolder != null) {
                this.f138947a = null;
                otherAreaViewHolder.ownerAvatarIV = null;
                otherAreaViewHolder.ownerNameTV = null;
                otherAreaViewHolder.flTopicDesc = null;
                otherAreaViewHolder.topicSourceTV = null;
                otherAreaViewHolder.createTimeTV = null;
                otherAreaViewHolder.attentionBtn = null;
                otherAreaViewHolder.replyIV = null;
                otherAreaViewHolder.reactionIV = null;
                otherAreaViewHolder.statusSendingTV = null;
                otherAreaViewHolder.sendingPgbar = null;
                otherAreaViewHolder.footerLayout = null;
                otherAreaViewHolder.sendStatusLayout = null;
                otherAreaViewHolder.sendFailedIV = null;
                otherAreaViewHolder.operationMoreIV = null;
                otherAreaViewHolder.contentLayout = null;
                otherAreaViewHolder.pinImage = null;
                otherAreaViewHolder.pinDesc = null;
                otherAreaViewHolder.mReplyLayout = null;
                otherAreaViewHolder.mReplyBubble = null;
                otherAreaViewHolder.topicCloseStatusTv = null;
                otherAreaViewHolder.mTranslateShowOriginLV = null;
                otherAreaViewHolder.mForwardDescription = null;
                otherAreaViewHolder.forwardIV = null;
                otherAreaViewHolder.mTranslationFeedbackTV = null;
                otherAreaViewHolder.mReactionThreadView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public OtherAreaViewHolder_ViewBinding(OtherAreaViewHolder otherAreaViewHolder, View view) {
            this.f138947a = otherAreaViewHolder;
            otherAreaViewHolder.ownerAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.owner_avatar, "field 'ownerAvatarIV'", LKUIRoundedImageView.class);
            otherAreaViewHolder.ownerNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.owner_name, "field 'ownerNameTV'", TextView.class);
            otherAreaViewHolder.flTopicDesc = (FlowLayout) Utils.findRequiredViewAsType(view, R.id.fl_topic_desc, "field 'flTopicDesc'", FlowLayout.class);
            otherAreaViewHolder.topicSourceTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_topic_source, "field 'topicSourceTV'", TextView.class);
            otherAreaViewHolder.createTimeTV = (TextView) Utils.findRequiredViewAsType(view, R.id.create_time, "field 'createTimeTV'", TextView.class);
            otherAreaViewHolder.attentionBtn = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.attention_btn, "field 'attentionBtn'", LKUILottieAnimationView.class);
            otherAreaViewHolder.replyIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.reply_iv, "field 'replyIV'", ImageView.class);
            otherAreaViewHolder.reactionIV = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.reaction_iv, "field 'reactionIV'", LKUILottieAnimationView.class);
            otherAreaViewHolder.statusSendingTV = (TextView) Utils.findRequiredViewAsType(view, R.id.status_sending_tv, "field 'statusSendingTV'", TextView.class);
            otherAreaViewHolder.sendingPgbar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.sending_pgbar, "field 'sendingPgbar'", ProgressBar.class);
            otherAreaViewHolder.footerLayout = Utils.findRequiredView(view, R.id.footer_layout, "field 'footerLayout'");
            otherAreaViewHolder.sendStatusLayout = Utils.findRequiredView(view, R.id.send_status_layout, "field 'sendStatusLayout'");
            otherAreaViewHolder.sendFailedIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.status_send_failed_iv, "field 'sendFailedIV'", ImageView.class);
            otherAreaViewHolder.operationMoreIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.operation_more, "field 'operationMoreIV'", ImageView.class);
            otherAreaViewHolder.contentLayout = Utils.findRequiredView(view, R.id.content_layout, "field 'contentLayout'");
            otherAreaViewHolder.pinImage = Utils.findRequiredView(view, R.id.pin_img, "field 'pinImage'");
            otherAreaViewHolder.pinDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.pin_desc, "field 'pinDesc'", TextView.class);
            otherAreaViewHolder.mReplyLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.reply_layout, "field 'mReplyLayout'", LinearLayout.class);
            otherAreaViewHolder.mReplyBubble = Utils.findRequiredView(view, R.id.reply_layout_bubble, "field 'mReplyBubble'");
            otherAreaViewHolder.topicCloseStatusTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_topic_close_status, "field 'topicCloseStatusTv'", TextView.class);
            otherAreaViewHolder.mTranslateShowOriginLV = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.show_translate_origin_lv, "field 'mTranslateShowOriginLV'", LKUILottieAnimationView.class);
            otherAreaViewHolder.mForwardDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.topic_forward_description, "field 'mForwardDescription'", TextView.class);
            otherAreaViewHolder.forwardIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.forward_iv, "field 'forwardIV'", ImageView.class);
            otherAreaViewHolder.mTranslationFeedbackTV = (TextView) Utils.findRequiredViewAsType(view, R.id.translation_feedback_tv, "field 'mTranslationFeedbackTV'", TextView.class);
            otherAreaViewHolder.mReactionThreadView = (ReactionFlowLayout) Utils.findRequiredViewAsType(view, R.id.view_reaction_thread, "field 'mReactionThreadView'", ReactionFlowLayout.class);
        }
    }

    static {
        int dp2px = UIHelper.dp2px(20.0f);
        f138899j = dp2px;
        f138901n = dp2px;
    }

    /* renamed from: a */
    private String m218939a(long j) {
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191593a(LengthType.LONG);
        aVar.mo191599b(!C29990c.m110930b().mo134524W().mo134469a());
        aVar.mo191594a(TimePreciseness.MINUTE);
        return TimeFormatUtils.m219292g(UIHelper.getContext(), new Date(j), aVar);
    }

    /* renamed from: a */
    private void m218942a(OtherAreaViewHolder otherAreaViewHolder) {
        if (!this.f138906m.mo191308a()) {
            otherAreaViewHolder.f146209n.setBackgroundColor(C57582a.m223616d(this.f138904b, R.color.bg_body));
        } else {
            C29990c.m110930b().mo134535a(this.f138904b, otherAreaViewHolder.f146209n);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m218940a(ThreadMessageVO threadMessageVO, String str) {
        this.f138903a.mo191286a(threadMessageVO.mo121658D(), str);
    }

    /* renamed from: a */
    private Drawable m218938a(int i, int i2) {
        Context context = this.f138904b;
        return UDIconUtils.getIconDrawable(context, i, UDColorUtils.getColor(context, i2), new UDDimension.Dp(16));
    }

    /* renamed from: b */
    private void m218949b(OtherAreaViewHolder otherAreaViewHolder, boolean z) {
        if (z) {
            otherAreaViewHolder.contentLayout.setBackgroundColor(C25653b.m91894a(this.f138904b, R.color.bg_body, 0.5f));
        } else {
            otherAreaViewHolder.contentLayout.setBackgroundColor(C57582a.m223616d(this.f138904b, R.color.bg_body));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m218946b(ThreadMessageVO threadMessageVO, String str) {
        if (str != null) {
            m218941a(threadMessageVO, "none", "profile");
            C29990c.m110930b().mo134523V().mo134436a(this.f138904b, new ProfileSource.C36868a().mo136066c(str).mo136064b(3).mo136060a(4).mo136062a(C34339g.m133170d(threadMessageVO.mo121676V())).mo136063a());
        }
    }

    /* renamed from: d */
    private void m218951d(OtherAreaViewHolder otherAreaViewHolder, ThreadMessageVO threadMessageVO) {
        int l = otherAreaViewHolder.mo200148l();
        m218942a(otherAreaViewHolder);
        mo191485b(otherAreaViewHolder, threadMessageVO);
        m218943a(otherAreaViewHolder, threadMessageVO, l);
        mo191486c(otherAreaViewHolder, threadMessageVO);
        m218953f(otherAreaViewHolder, threadMessageVO);
        m218948b(otherAreaViewHolder, threadMessageVO, l);
        m218949b(otherAreaViewHolder, threadMessageVO.mo121667M());
        m218944a(otherAreaViewHolder, threadMessageVO.mo121669O());
        m218952e(otherAreaViewHolder, threadMessageVO);
        m218954g(otherAreaViewHolder, threadMessageVO);
        m218955h(otherAreaViewHolder, threadMessageVO);
    }

    /* renamed from: f */
    private void m218953f(OtherAreaViewHolder otherAreaViewHolder, ThreadMessageVO threadMessageVO) {
        if (threadMessageVO.mo121659E() == null || threadMessageVO.mo121678X()) {
            otherAreaViewHolder.pinDesc.setVisibility(8);
            otherAreaViewHolder.pinImage.setVisibility(8);
        } else {
            otherAreaViewHolder.pinDesc.setVisibility(0);
            otherAreaViewHolder.pinImage.setVisibility(0);
            otherAreaViewHolder.pinDesc.setText(UIHelper.mustacheFormat((int) R.string.Lark_Groups_PostPinTip, "user_name", threadMessageVO.mo121659E().getOperatorDisplayName()));
        }
        C25649b.m91853a(otherAreaViewHolder.pinImage, 14);
        C25649b.m91856a(otherAreaViewHolder.pinDesc, 12);
    }

    /* renamed from: g */
    private void m218954g(OtherAreaViewHolder otherAreaViewHolder, ThreadMessageVO threadMessageVO) {
        if (!this.f138909q.mo134685a("lark.overseas.forward") || threadMessageVO.mo121671Q() == null || threadMessageVO.ac() == null) {
            otherAreaViewHolder.mForwardDescription.setVisibility(8);
            return;
        }
        ChatChatter ac = threadMessageVO.ac();
        String originalSenderId = threadMessageVO.mo121671Q().getOriginalSenderId();
        boolean isForwardFromFriend = threadMessageVO.mo121671Q().isForwardFromFriend();
        String a = C34340h.m133174a(ac, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
        Context context = this.f138904b;
        String string = UIHelper.getString(R.string.Lark_Chat_MessageForward);
        if (!isForwardFromFriend || threadMessageVO.mo121709q()) {
            originalSenderId = "";
        }
        SpannableStringBuilder a2 = C34357v.m133267a(context, string, "{{name}}", a, originalSenderId, threadMessageVO.mo121692b());
        C25649b.m91856a(otherAreaViewHolder.mForwardDescription, 12);
        Drawable drawable = UIHelper.getDrawable(R.drawable.ic_svg_message_tag_forward);
        drawable.setBounds(0, 0, LKUIDisplayManager.m91881c(this.f138904b, 12), LKUIDisplayManager.m91881c(this.f138904b, 12));
        otherAreaViewHolder.mForwardDescription.setCompoundDrawables(drawable, null, null, null);
        otherAreaViewHolder.mForwardDescription.setMovementMethod(LinkMovementMethod.getInstance());
        otherAreaViewHolder.mForwardDescription.setText(a2);
        otherAreaViewHolder.mForwardDescription.setVisibility(0);
    }

    /* renamed from: h */
    private void m218955h(OtherAreaViewHolder otherAreaViewHolder, ThreadMessageVO threadMessageVO) {
        int i;
        if (otherAreaViewHolder.mReactionThreadView != null) {
            otherAreaViewHolder.mReactionThreadView.setDisplayChangeEnable(true);
            SendStatus B = threadMessageVO.mo121656B();
            if (threadMessageVO.mo121655A() == Message.Status.DELETED) {
                otherAreaViewHolder.mReactionThreadView.setVisibility(8);
                otherAreaViewHolder.mReactionThreadView.setup(null);
            } else if (!threadMessageVO.ah() || B != SendStatus.SUCCESS) {
                otherAreaViewHolder.mReactionThreadView.setVisibility(8);
                otherAreaViewHolder.mReactionThreadView.setup(null);
            } else {
                List<ReactionInfo> D = threadMessageVO.mo121658D();
                otherAreaViewHolder.mReactionThreadView.setTagBackgroundColor(0);
                otherAreaViewHolder.mReactionThreadView.setDivideLineColor(C33360a.m129161e(false));
                otherAreaViewHolder.mReactionThreadView.setTextColor(C33360a.m129159d(false));
                otherAreaViewHolder.mReactionThreadView.setReactionTopMargin(f138897h);
                ReactionFlowLayout reactionFlowLayout = otherAreaViewHolder.mReactionThreadView;
                int i2 = f138895e;
                reactionFlowLayout.setReactionLeftMargin(i2);
                otherAreaViewHolder.mReactionThreadView.setNewReactionEnable(f138902r);
                if (otherAreaViewHolder.mReactionThreadView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    i = ((ViewGroup.MarginLayoutParams) otherAreaViewHolder.mReactionThreadView.getLayoutParams()).leftMargin + 0 + ((ViewGroup.MarginLayoutParams) otherAreaViewHolder.mReactionThreadView.getLayoutParams()).rightMargin + UIUtils.dp2px(this.f138904b, (float) i2);
                } else {
                    i = 0;
                }
                otherAreaViewHolder.mReactionThreadView.setReactionMaxWidth(DeviceUtils.getScreenWidth(this.f138904b) - i);
                String a = C29990c.m110930b().mo134515N().mo134394a();
                otherAreaViewHolder.mReactionThreadView.setup(C35237c.m137596a(a, false, D));
                otherAreaViewHolder.mReactionThreadView.setVisibility(0);
                otherAreaViewHolder.mReactionThreadView.setReactionClickListener(new ReactionBaseFlowLayout.AbstractC53049d(threadMessageVO, a) {
                    /* class com.ss.android.lark.threadwindow.view.block.$$Lambda$OtherAreaBlock$zbAaq911dsYVoMd2hU0b9nccLjY */
                    public final /* synthetic */ ThreadMessageVO f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
                    public final void onReactionClicked(String str) {
                        OtherAreaBlock.this.m218947b((OtherAreaBlock) this.f$1, (ThreadMessageVO) this.f$2, str);
                    }
                });
                otherAreaViewHolder.mReactionThreadView.setOnReactionNameTrigger(new ReactionBaseFlowLayout.AbstractC53046a(threadMessageVO) {
                    /* class com.ss.android.lark.threadwindow.view.block.$$Lambda$OtherAreaBlock$vjVbjoRy2uLA41dW5cZ_yxWlrQ */
                    public final /* synthetic */ ThreadMessageVO f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53046a
                    public final void perform(String str) {
                        OtherAreaBlock.this.m218946b((OtherAreaBlock) this.f$1, (ThreadMessageVO) str);
                    }
                });
                otherAreaViewHolder.mReactionThreadView.setOnReactionMoreTrigger(new ReactionBaseFlowLayout.AbstractC53047b(threadMessageVO) {
                    /* class com.ss.android.lark.threadwindow.view.block.$$Lambda$OtherAreaBlock$g5oNeqMbFmz8EdGLB4T95zrETg */
                    public final /* synthetic */ ThreadMessageVO f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53047b
                    public final void perform(String str) {
                        OtherAreaBlock.this.m218940a((OtherAreaBlock) this.f$1, (ThreadMessageVO) str);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo191486c(OtherAreaViewHolder otherAreaViewHolder, final ThreadMessageVO threadMessageVO) {
        C25649b.m91856a(otherAreaViewHolder.statusSendingTV, 14);
        C25649b.m91853a(otherAreaViewHolder.sendingPgbar, 16);
        C25649b.m91853a(otherAreaViewHolder.sendFailedIV, 16);
        otherAreaViewHolder.sendStatusLayout.getLayoutParams().height = LKUIDisplayManager.m91881c(this.f138904b, 54);
        SendStatus B = threadMessageVO.mo121656B();
        if (B == SendStatus.SENDING) {
            UIUtils.hide(otherAreaViewHolder.footerLayout);
            UIUtils.show(otherAreaViewHolder.sendStatusLayout);
            UIUtils.show(otherAreaViewHolder.statusSendingTV);
            UIUtils.show(otherAreaViewHolder.sendingPgbar);
            UIUtils.hide(otherAreaViewHolder.sendFailedIV);
            otherAreaViewHolder.statusSendingTV.setText(UIHelper.getString(R.string.Lark_Chat_Sending));
            otherAreaViewHolder.statusSendingTV.setTextColor(C57582a.m223616d(this.f138904b, R.color.function_info_500));
            otherAreaViewHolder.statusSendingTV.setOnClickListener(null);
        } else if (B == SendStatus.FAIL) {
            UIUtils.hide(otherAreaViewHolder.footerLayout);
            UIUtils.show(otherAreaViewHolder.sendStatusLayout);
            UIUtils.show(otherAreaViewHolder.statusSendingTV);
            UIUtils.hide(otherAreaViewHolder.sendingPgbar);
            UIUtils.show(otherAreaViewHolder.sendFailedIV);
            C561626 r0 = new OnSingleClickListener() {
                /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.C561626 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    OtherAreaBlock.this.f138903a.mo191276a(view, threadMessageVO.mo121662H());
                }
            };
            otherAreaViewHolder.statusSendingTV.setOnClickListener(r0);
            otherAreaViewHolder.sendFailedIV.setOnClickListener(r0);
            otherAreaViewHolder.statusSendingTV.setText(UIHelper.getString(R.string.Lark_Chat_Resend));
            otherAreaViewHolder.statusSendingTV.setTextColor(C57582a.m223616d(this.f138904b, R.color.function_danger_500));
        } else {
            UIUtils.show(otherAreaViewHolder.footerLayout);
            UIUtils.hide(otherAreaViewHolder.sendStatusLayout);
        }
        if (!threadMessageVO.mo121663I()) {
            otherAreaViewHolder.attentionBtn.setImageDrawable(m218938a(R.drawable.ud_icon_subscribe_add_outlined, R.color.icon_n3));
        } else if (!otherAreaViewHolder.attentionBtn.isAnimating()) {
            otherAreaViewHolder.attentionBtn.setImageResource(R.drawable.ud_icon_resolve_colorful);
        }
    }

    /* renamed from: e */
    private void m218952e(OtherAreaViewHolder otherAreaViewHolder, final ThreadMessageVO threadMessageVO) {
        Message.Type r = threadMessageVO.mo121710r();
        if (r != Message.Type.TEXT && r != Message.Type.POST && r != Message.Type.MERGE_FORWARD) {
            return;
        }
        if (threadMessageVO.mo121713u() || !(threadMessageVO.mo121699g() instanceof TranslatableContentVO)) {
            UIUtils.hide(otherAreaViewHolder.mTranslateShowOriginLV);
            UIUtils.hide(otherAreaViewHolder.mTranslationFeedbackTV);
            return;
        }
        C25649b.m91853a(otherAreaViewHolder.mTranslateShowOriginLV, 20);
        C25649b.m91856a(otherAreaViewHolder.mTranslationFeedbackTV, 12);
        TranslatableContentVO oVar = (TranslatableContentVO) threadMessageVO.mo121699g();
        if (oVar.mo121926u()) {
            UIUtils.show(otherAreaViewHolder.mTranslateShowOriginLV);
            UIUtils.hide(otherAreaViewHolder.mTranslationFeedbackTV);
            otherAreaViewHolder.mTranslateShowOriginLV.setTag(null);
            otherAreaViewHolder.mTranslateShowOriginLV.setAnimation(R.raw.anim_translating_for_others);
            if (!otherAreaViewHolder.mTranslateShowOriginLV.isAnimating()) {
                otherAreaViewHolder.mTranslateShowOriginLV.playAnimation();
            }
        } else {
            otherAreaViewHolder.mTranslateShowOriginLV.cancelAnimation();
            if (f147354c) {
                UIUtils.hide(otherAreaViewHolder.mTranslateShowOriginLV);
            } else {
                UIUtils.hide(otherAreaViewHolder.mTranslationFeedbackTV);
            }
            if (!C34350p.m133216a(threadMessageVO)) {
                otherAreaViewHolder.mTranslateShowOriginLV.setTag(R.id.translate_show_origin_tag, true);
                otherAreaViewHolder.mTranslateShowOriginLV.setImageResource(R.drawable.ic_translate_show_origin_for_others);
                if (!f147354c) {
                    UIUtils.show(otherAreaViewHolder.mTranslateShowOriginLV);
                } else if (!(oVar instanceof BaseTextContentVO) || C34438a.m133580a((BaseTextContent) ((BaseTextContentVO) oVar).mo126168z())) {
                    UIUtils.hide(otherAreaViewHolder.mTranslationFeedbackTV);
                } else {
                    UIUtils.show(otherAreaViewHolder.mTranslationFeedbackTV);
                }
            } else if (threadMessageVO.mo121695c() && !threadMessageVO.mo121713u() && oVar.mo121928w()) {
                otherAreaViewHolder.mTranslateShowOriginLV.setTag(R.id.translate_show_origin_tag, false);
                otherAreaViewHolder.mTranslateShowOriginLV.setImageResource(R.drawable.ic_translate_preview_tag);
                if (f147354c) {
                    UIUtils.show(otherAreaViewHolder.mTranslationFeedbackTV);
                } else {
                    UIUtils.show(otherAreaViewHolder.mTranslateShowOriginLV);
                }
            } else if (f147354c) {
                UIUtils.hide(otherAreaViewHolder.mTranslationFeedbackTV);
            } else {
                UIUtils.hide(otherAreaViewHolder.mTranslateShowOriginLV);
            }
            otherAreaViewHolder.mTranslateShowOriginLV.setTag(threadMessageVO);
        }
        otherAreaViewHolder.mTranslateShowOriginLV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.C561571 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (OtherAreaBlock.this.f138903a != null) {
                    OtherAreaBlock.this.f138903a.mo191296c(view, threadMessageVO);
                }
            }
        });
        otherAreaViewHolder.mTranslationFeedbackTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.View$OnClickListenerC561637 */

            public void onClick(View view) {
                if (OtherAreaBlock.this.f138903a != null) {
                    OtherAreaBlock.this.f138903a.mo191298c(threadMessageVO.mo121681a());
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo191485b(OtherAreaViewHolder otherAreaViewHolder, ThreadMessageVO threadMessageVO) {
        Context context = this.f138904b;
        LKUIRoundedImageView lKUIRoundedImageView = otherAreaViewHolder.ownerAvatarIV;
        String s = threadMessageVO.mo121711s();
        String e = threadMessageVO.mo121697e();
        int i = f138894d;
        C34336c.m133130a(context, lKUIRoundedImageView, s, e, i, i, Scene.Thread);
        DesktopUtil.m144304b(otherAreaViewHolder.ownerAvatarIV);
        if (DesktopUtil.m144301a(this.f138904b)) {
            ((ViewGroup.MarginLayoutParams) otherAreaViewHolder.ownerAvatarIV.getLayoutParams()).topMargin = f138899j;
        }
        otherAreaViewHolder.ownerNameTV.setText(threadMessageVO.mo121712t());
        if (!threadMessageVO.mo121678X() || threadMessageVO.mo121676V() == null || TextUtils.isEmpty(threadMessageVO.mo121676V().getName()) || !threadMessageVO.mo121676V().isThread()) {
            otherAreaViewHolder.topicSourceTV.setVisibility(8);
        } else {
            otherAreaViewHolder.topicSourceTV.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = otherAreaViewHolder.flTopicDesc.getLayoutParams();
            layoutParams.width = DeviceUtils.getScreenWidth(this.f138904b) - f138900k;
            otherAreaViewHolder.flTopicDesc.setLayoutParams(layoutParams);
            otherAreaViewHolder.topicSourceTV.setText(C55869b.m217004a(threadMessageVO.mo121676V().getName()));
        }
        otherAreaViewHolder.createTimeTV.setText(m218939a(threadMessageVO.mo121716x()));
        if (threadMessageVO.ag()) {
            otherAreaViewHolder.operationMoreIV.setVisibility(8);
        } else {
            otherAreaViewHolder.operationMoreIV.setVisibility(0);
        }
        if (!DesktopUtil.m144301a(this.f138904b)) {
            C25649b.m91853a(otherAreaViewHolder.ownerAvatarIV, 40);
            otherAreaViewHolder.ownerNameTV.getLayoutParams().height = LKUIDisplayManager.m91881c(this.f138904b, 20);
            C25649b.m91856a(otherAreaViewHolder.ownerNameTV, 14);
            C25649b.m91856a(otherAreaViewHolder.createTimeTV, 12);
            otherAreaViewHolder.topicSourceTV.getLayoutParams().height = LKUIDisplayManager.m91881c(this.f138904b, 20);
            C25649b.m91856a(otherAreaViewHolder.topicSourceTV, 14);
        }
    }

    /* renamed from: a */
    private void m218944a(OtherAreaViewHolder otherAreaViewHolder, boolean z) {
        C25649b.m91856a(otherAreaViewHolder.topicCloseStatusTv, 12);
        otherAreaViewHolder.topicCloseStatusTv.getLayoutParams().height = LKUIDisplayManager.m91881c(this.f138904b, 28);
        Drawable drawable = UIHelper.getDrawable(R.drawable.ic_svg_thread_topic_close);
        drawable.setBounds(0, 0, LKUIDisplayManager.m91881c(this.f138904b, 14), LKUIDisplayManager.m91881c(this.f138904b, 14));
        otherAreaViewHolder.topicCloseStatusTv.setCompoundDrawables(drawable, null, null, null);
        if (z) {
            otherAreaViewHolder.topicCloseStatusTv.setText(C55869b.m217003a((int) R.string.Lark_Groups_PostStatusClosedTip));
            otherAreaViewHolder.topicCloseStatusTv.setVisibility(0);
            return;
        }
        otherAreaViewHolder.topicCloseStatusTv.setVisibility(8);
    }

    /* renamed from: a */
    private boolean m218945a(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* renamed from: a */
    private void m218941a(ThreadMessageVO threadMessageVO, String str, String str2) {
        Map<String, ? extends Object> a = ChatHitPointNew.f135660c.mo187377a(threadMessageVO);
        a.put("effect", str2);
        a.put("reaction_type", str);
        ChatHitPointNew.f135660c.mo187388a(threadMessageVO.mo121692b(), "reaction", ChatHitPointNew.f135660c.mo187391b("reaction"), a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m218947b(ThreadMessageVO threadMessageVO, String str, String str2) {
        String str3;
        boolean a = C35249h.m137636a(threadMessageVO.mo121658D(), str2, str);
        if (a) {
            str3 = "remove";
        } else {
            str3 = "add";
        }
        m218941a(threadMessageVO, str2, str3);
        if (!a) {
            MessageHitPoint.f135779d.mo187531a(threadMessageVO.mo121681a(), Integer.valueOf(threadMessageVO.mo121710r().getNumber()), threadMessageVO.mo121692b(), str2, 5, 0, threadMessageVO.mo121676V());
        }
        AbstractC56166a aVar = this.f138903a;
        if (aVar != null) {
            aVar.mo191285a(threadMessageVO.mo121681a(), str2, a);
        }
    }

    /* renamed from: b */
    private void m218948b(final OtherAreaViewHolder otherAreaViewHolder, final ThreadMessageVO threadMessageVO, final int i) {
        otherAreaViewHolder.ownerAvatarIV.setOnClickListener(new AbstractView$OnClickListenerC58542c() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AnonymousClass11 */

            /* renamed from: a */
            final DuplicateEnterChecker f138915a = new DuplicateEnterChecker();

            @Override // com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58542c
            /* renamed from: a */
            public void mo123648a(View view) {
                if ((threadMessageVO.mo121672R() == null || !threadMessageVO.mo121672R().isAnonymous()) && !this.f138915a.mo198450a()) {
                    ChatHitPointNew.f135660c.mo187388a(threadMessageVO.mo121692b(), "icon", ChatHitPointNew.f135660c.mo187391b("icon"), ChatHitPointNew.f135660c.mo187378a(threadMessageVO, (String) null, (String) null));
                    if (OtherAreaBlock.this.f138903a != null) {
                        OtherAreaBlock.this.f138903a.mo191291b(view, threadMessageVO.mo121661G(), threadMessageVO.mo121692b());
                    }
                }
            }
        });
        otherAreaViewHolder.topicSourceTV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AnonymousClass12 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                OtherAreaBlock.this.f138903a.mo191277a(view, threadMessageVO.mo121692b(), threadMessageVO.ae());
            }
        });
        otherAreaViewHolder.attentionBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AnonymousClass13 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (!threadMessageVO.mo121674T()) {
                    if (threadMessageVO.mo121668N()) {
                        OtherAreaBlock.this.mo191482a(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
                    } else if (!otherAreaViewHolder.attentionBtn.isAnimating()) {
                        boolean I = threadMessageVO.mo121663I();
                        if (!I) {
                            if (!otherAreaViewHolder.attentionBtn.isAnimating()) {
                                otherAreaViewHolder.attentionBtn.setAnimation(R.raw.thread_window_subscribe);
                                otherAreaViewHolder.attentionBtn.playAnimation();
                            }
                            C34331aa.m133108a(OtherAreaBlock.this.f138904b, 30);
                        }
                        if (OtherAreaBlock.this.f138903a != null) {
                            OtherAreaBlock.this.f138903a.mo191278a(view, threadMessageVO.mo121662H(), !I, threadMessageVO.mo121673S(), threadMessageVO.mo121692b(), threadMessageVO.mo121679Y(), i, threadMessageVO.af());
                        }
                    }
                }
            }
        });
        otherAreaViewHolder.replyIV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AnonymousClass14 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (OtherAreaBlock.this.f138903a == null) {
                    return;
                }
                if (threadMessageVO.mo121668N()) {
                    OtherAreaBlock.this.mo191482a(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
                } else {
                    OtherAreaBlock.this.f138903a.mo191297c(view, threadMessageVO, i);
                }
            }
        });
        otherAreaViewHolder.reactionIV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.C561582 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (threadMessageVO.mo121668N()) {
                    OtherAreaBlock.this.mo191482a(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
                } else if (!otherAreaViewHolder.reactionIV.isAnimating()) {
                    if (!threadMessageVO.mo121670P()) {
                        if (!otherAreaViewHolder.reactionIV.isAnimating()) {
                            otherAreaViewHolder.reactionIV.playAnimation();
                        }
                        C34331aa.m133108a(OtherAreaBlock.this.f138904b, 30);
                    }
                    if (OtherAreaBlock.this.f138903a != null) {
                        OtherAreaBlock.this.f138903a.mo191290b(view, threadMessageVO, i);
                    }
                }
            }
        });
        otherAreaViewHolder.reactionIV.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.View$OnLongClickListenerC561593 */

            public boolean onLongClick(View view) {
                if (OtherAreaBlock.this.f138903a == null) {
                    return true;
                }
                OtherAreaBlock.this.mo122755b((AbstractC59010e) otherAreaViewHolder, (Object) threadMessageVO);
                return true;
            }
        });
        otherAreaViewHolder.forwardIV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.C561604 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                boolean U = threadMessageVO.mo121675U();
                if (threadMessageVO.mo121668N()) {
                    OtherAreaBlock.this.mo191482a(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
                    return;
                }
                IForwardDependency E = C29990c.m110930b().mo134506E();
                if (U) {
                    E.mo134370a(OtherAreaBlock.this.f138904b, threadMessageVO.mo121671Q(), "quick_click", "thread");
                } else {
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(threadMessageVO.mo121662H());
                    E.mo134368a(OtherAreaBlock.this.f138904b, threadMessageVO.mo121676V(), arrayList, threadMessageVO.mo121662H(), 9, "quick_click", "thread");
                }
                if (OtherAreaBlock.this.f138903a != null) {
                    OtherAreaBlock.this.f138903a.mo191301d(threadMessageVO.mo121662H());
                }
            }
        });
        otherAreaViewHolder.operationMoreIV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.C561615 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (OtherAreaBlock.this.f138903a == null) {
                    return;
                }
                if (threadMessageVO.mo121668N()) {
                    OtherAreaBlock.this.mo191482a(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
                } else {
                    OtherAreaBlock.this.f138903a.mo191289b(view, threadMessageVO);
                }
            }
        });
    }

    /* renamed from: a */
    private void m218943a(final OtherAreaViewHolder otherAreaViewHolder, final ThreadMessageVO threadMessageVO, int i) {
        if (CollectionUtils.isEmpty(threadMessageVO.mo121666L())) {
            otherAreaViewHolder.mReplyLayout.setVisibility(8);
            otherAreaViewHolder.mReplyBubble.setVisibility(8);
            return;
        }
        otherAreaViewHolder.mReplyBubble.setVisibility(0);
        otherAreaViewHolder.mReplyLayout.setVisibility(0);
        otherAreaViewHolder.mReplyLayout.removeAllViews();
        int w = threadMessageVO.mo121715w() - threadMessageVO.mo121666L().size();
        if (w > 0) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Chat_TopicCardRepliesCountButton, "number", " " + w + " ");
            String valueOf = String.valueOf(w);
            int indexOf = mustacheFormat.indexOf(valueOf);
            int length = (valueOf.length() + indexOf) - 1;
            SpannableString spannableString = new SpannableString(mustacheFormat);
            if (indexOf != -1 && length < mustacheFormat.length()) {
                int i2 = length + 1;
                spannableString.setSpan(new CustomTypefaceSpan("", m218950d()), indexOf, i2, 33);
                spannableString.setSpan(new AbsoluteSizeSpan((int) LKUIDisplayManager.m91864a(this.f138904b, 13), false), indexOf, i2, 33);
                if (indexOf > 0) {
                    spannableString.setSpan(new C55869b(), 0, indexOf, 33);
                }
                if (i2 < mustacheFormat.length()) {
                    spannableString.setSpan(new C55869b(), i2, mustacheFormat.length(), 33);
                }
            }
            TextView textView = new TextView(this.f138904b);
            textView.setTextSize(0, LKUIDisplayManager.m91864a(this.f138904b, 12));
            textView.setTextColor(C57582a.m223616d(this.f138904b, R.color.text_placeholder));
            textView.setText(spannableString);
            int i3 = f138897h;
            textView.setPadding(i3, f138898i, i3, 0);
            textView.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.C561648 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    OtherAreaBlock.this.f138903a.mo191273a(view, threadMessageVO);
                }
            });
            otherAreaViewHolder.mReplyLayout.addView(textView);
        }
        final int i4 = 0;
        while (threadMessageVO.mo121666L() != null && i4 < threadMessageVO.mo121666L().size()) {
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView = new EllipsizedEmojiconTextView(this.f138904b);
            ellipsizedEmojiconTextView.setTranslateEmojiCode(true);
            ellipsizedEmojiconTextView.setText(threadMessageVO.mo121666L().get(i4));
            if (DesktopUtil.m144301a(this.f138904b)) {
                ellipsizedEmojiconTextView.setTextSize(14.0f);
            } else {
                C25649b.m91857a(ellipsizedEmojiconTextView, LarkFont.BODY1);
            }
            ellipsizedEmojiconTextView.setTextColor(C57582a.m223616d(this.f138904b, R.color.ud_N700));
            ellipsizedEmojiconTextView.setGravity(16);
            ellipsizedEmojiconTextView.setMaxLines(2);
            ellipsizedEmojiconTextView.setEllipsize(TextUtils.TruncateAt.END);
            ellipsizedEmojiconTextView.setLineSpacing(4.0f, 1.0f);
            if (i4 == 0) {
                if (threadMessageVO.mo121666L().size() == 1) {
                    int i5 = f138897h;
                    ellipsizedEmojiconTextView.setPadding(i5, f138898i, i5, i5);
                } else if (w > 0) {
                    int i6 = f138897h;
                    ellipsizedEmojiconTextView.setPadding(i6, f138896g, i6, 0);
                } else {
                    int i7 = f138897h;
                    ellipsizedEmojiconTextView.setPadding(i7, f138898i, i7, 0);
                }
            } else if (i4 == threadMessageVO.mo121666L().size() - 1) {
                int i8 = f138897h;
                ellipsizedEmojiconTextView.setPadding(i8, f138895e, i8, i8);
            } else {
                int i9 = f138897h;
                ellipsizedEmojiconTextView.setPadding(i9, f138895e, i9, 0);
            }
            ellipsizedEmojiconTextView.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.C561659 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    ThreadTopicHitPoint.f135906a.mo187727d();
                    OtherAreaBlock.this.f138903a.mo191279a(threadMessageVO, i4);
                }
            });
            ellipsizedEmojiconTextView.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AnonymousClass10 */

                public boolean onLongClick(View view) {
                    OtherAreaBlock.this.mo122755b((AbstractC59010e) otherAreaViewHolder, (Object) threadMessageVO);
                    return true;
                }
            });
            otherAreaViewHolder.mReplyLayout.addView(ellipsizedEmojiconTextView);
            i4++;
        }
    }

    public OtherAreaBlock(Context context, C33973b bVar, AbstractC56150a aVar, AbstractC56166a aVar2) {
        this.f138904b = context;
        this.f138905l = bVar;
        this.f138906m = aVar;
        this.f138903a = aVar2;
    }
}
