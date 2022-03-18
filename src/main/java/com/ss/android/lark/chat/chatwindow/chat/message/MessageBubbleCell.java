package com.ss.android.lark.chat.chatwindow.chat.message;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.recycleview.C32944d;
import com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell;
import com.ss.android.lark.chat.chatwindow.chat.message.block.C33320a;
import com.ss.android.lark.chat.chatwindow.chat.message.block.C33323b;
import com.ss.android.lark.chat.chatwindow.chat.message.block.C33325c;
import com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock;
import com.ss.android.lark.chat.chatwindow.chat.message.block.MessageTranslateBlock;
import com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33297g;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33298h;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33305o;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q;
import com.ss.android.lark.chat.chatwindow.chat.message.p1625b.AbstractC33309a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33097aa;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.open.message.AbstractC34072a;
import com.ss.android.lark.chat.open.message.AbstractC34073b;
import com.ss.android.lark.chat.open.message.IStatusLayoutPlaceProvider;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.chatwindow.view.burn.CountDownView;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import com.ss.android.lark.widget.recyclerview.hive.ICellHoverHandler;
import java.util.Date;

public class MessageBubbleCell extends AbstractC33308b<ChatMessageVO, MessageBubbleViewHolder> {

    /* renamed from: c */
    private static final int f85683c = UIHelper.dp2px(7.0f);

    /* renamed from: g */
    private static final int f85684g = UIHelper.dp2px(2.0f);

    /* renamed from: h */
    private static final int f85685h = UIHelper.dp2px(12.0f);

    /* renamed from: i */
    private static final int f85686i = UIHelper.dp2px(1.0f);

    /* renamed from: j */
    private static final int f85687j = UIHelper.dp2px(5.0f);

    /* renamed from: k */
    private static final int f85688k = UIHelper.dp2px(1.0f);

    /* renamed from: l */
    private static int f85689l = 0;

    /* renamed from: m */
    private final AbstractC33274b f85690m;

    /* renamed from: n */
    private final AbstractC34072a<? extends ContentVO> f85691n;

    /* renamed from: o */
    private final IStatusLayoutPlaceProvider f85692o;

    /* renamed from: p */
    private final AbstractC34073b f85693p;

    /* renamed from: q */
    private final AbstractC33290a f85694q;

    /* renamed from: r */
    private final boolean f85695r;

    /* renamed from: s */
    private final int f85696s;

    /* renamed from: t */
    private MessageBubbleCell f85697t;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell$b */
    public interface AbstractC33274b extends AbstractC33297g, AbstractC33298h, AbstractC33305o, AbstractC33307q, MessageStatusBlock.AbstractC33313a, MessageUserInfoBlock.AbstractC33319a {
    }

    /* renamed from: j */
    private IStatusLayoutPlaceProvider m128771j() {
        return this.f85692o;
    }

    /* renamed from: k */
    private AbstractC34072a<? extends ContentVO> m128772k() {
        return this.f85691n;
    }

    /* renamed from: l */
    private AbstractC34073b m128773l() {
        return this.f85693p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122718b(com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell.MessageBubbleViewHolder r11, com.ss.android.lark.chat.vo.ChatMessageVO r12) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell.mo122718b(com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell$MessageBubbleViewHolder, com.ss.android.lark.chat.e.c):void");
    }

    /* renamed from: m */
    private int m128774m() {
        TextView textView = new TextView(this.f85792a.mo122543g());
        textView.setText("00:00:00");
        textView.setTextSize(12.0f);
        return UIUtils.getWidth(textView);
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        if (this.f85695r) {
            return R.layout.chat_window_message_common_item_new;
        }
        return R.layout.chat_window_message_common_item;
    }

    public class MessageBubbleViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MessageBubbleViewHolder f85706a;

        @Override // butterknife.Unbinder
        public void unbind() {
            MessageBubbleViewHolder messageBubbleViewHolder = this.f85706a;
            if (messageBubbleViewHolder != null) {
                this.f85706a = null;
                messageBubbleViewHolder.mMsgGroupView = null;
                messageBubbleViewHolder.mMaskView = null;
                messageBubbleViewHolder.mMessageItemRight = null;
                messageBubbleViewHolder.mTimeTV = null;
                messageBubbleViewHolder.mMessageCheckbox = null;
                messageBubbleViewHolder.mMessageCheckBoxWrapper = null;
                messageBubbleViewHolder.mDingView = null;
                messageBubbleViewHolder.mContentContainer = null;
                messageBubbleViewHolder.mTopRegionContainer = null;
                messageBubbleViewHolder.mDesktopHoverStub = null;
                messageBubbleViewHolder.mGuideLine = null;
                messageBubbleViewHolder.mBurnTimeText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MessageBubbleViewHolder_ViewBinding(MessageBubbleViewHolder messageBubbleViewHolder, View view) {
            this.f85706a = messageBubbleViewHolder;
            messageBubbleViewHolder.mMsgGroupView = Utils.findRequiredView(view, R.id.chat_msg_group, "field 'mMsgGroupView'");
            messageBubbleViewHolder.mMaskView = Utils.findRequiredView(view, R.id.chat_message_item_mask, "field 'mMaskView'");
            messageBubbleViewHolder.mMessageItemRight = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.msg_swipe_view, "field 'mMessageItemRight'", ViewGroup.class);
            messageBubbleViewHolder.mTimeTV = (TextView) Utils.findRequiredViewAsType(view, R.id.time_tv, "field 'mTimeTV'", TextView.class);
            messageBubbleViewHolder.mMessageCheckbox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.choose_message_checkbox, "field 'mMessageCheckbox'", UDCheckBox.class);
            messageBubbleViewHolder.mMessageCheckBoxWrapper = view.findViewById(R.id.check_box_region);
            messageBubbleViewHolder.mDingView = (ImageView) Utils.findRequiredViewAsType(view, R.id.view_ding, "field 'mDingView'", ImageView.class);
            messageBubbleViewHolder.mContentContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.content, "field 'mContentContainer'", FrameLayout.class);
            messageBubbleViewHolder.mTopRegionContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.top_region, "field 'mTopRegionContainer'", FrameLayout.class);
            messageBubbleViewHolder.mDesktopHoverStub = Utils.findRequiredView(view, R.id.chat_hover_item_stub, "field 'mDesktopHoverStub'");
            messageBubbleViewHolder.mGuideLine = (Guideline) Utils.findOptionalViewAsType(view, R.id.guideline2, "field 'mGuideLine'", Guideline.class);
            messageBubbleViewHolder.mBurnTimeText = (CountDownView) Utils.findRequiredViewAsType(view, R.id.tv_burn_time, "field 'mBurnTimeText'", CountDownView.class);
        }
    }

    /* renamed from: d */
    public AbstractC59004b<ChatMessageVO, MessageBubbleViewHolder> mo122719d() {
        if (this.f85697t == null) {
            MessageBubbleCellRTLCompact fVar = new MessageBubbleCellRTLCompact(this.f85694q, this.f85792a, this.f85690m, this.f85691n, this.f85692o, this.f85693p);
            this.f85697t = fVar;
            fVar.mo200134a(this.f146200f);
            this.f85697t.mo122781a(this.f85793b);
        }
        return this.f85697t;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell$a */
    public static class C33273a {

        /* renamed from: a */
        private AbstractC33290a f85707a;

        /* renamed from: b */
        private AbstractC33342d f85708b;

        /* renamed from: c */
        private AbstractC33274b f85709c;

        /* renamed from: d */
        private AbstractC34072a<? extends ContentVO> f85710d;

        /* renamed from: e */
        private IStatusLayoutPlaceProvider f85711e;

        /* renamed from: f */
        private AbstractC59012g<ChatMessageVO> f85712f;

        /* renamed from: g */
        private AbstractC34028a f85713g;

        /* renamed from: h */
        private AbstractC34073b f85714h;

        /* renamed from: a */
        public MessageBubbleCell mo122729a() {
            AbstractC33342d dVar;
            AbstractC33290a aVar = this.f85707a;
            if (aVar == null || (dVar = this.f85708b) == null) {
                throw new IllegalArgumentException("mainChildCell and chatContext cannot empty");
            }
            MessageBubbleCell messageBubbleCell = new MessageBubbleCell(aVar, dVar, this.f85709c, this.f85710d, this.f85711e, this.f85714h);
            messageBubbleCell.mo200134a(this.f85712f);
            messageBubbleCell.mo122781a(this.f85713g);
            return messageBubbleCell;
        }

        /* renamed from: a */
        public C33273a mo122721a(AbstractC33274b bVar) {
            this.f85709c = bVar;
            return this;
        }

        /* renamed from: a */
        public C33273a mo122722a(AbstractC33290a aVar) {
            this.f85707a = aVar;
            return this;
        }

        /* renamed from: a */
        public C33273a mo122723a(AbstractC33342d dVar) {
            this.f85708b = dVar;
            return this;
        }

        /* renamed from: a */
        public C33273a mo122724a(AbstractC34028a aVar) {
            this.f85713g = aVar;
            return this;
        }

        /* renamed from: a */
        public C33273a mo122725a(IStatusLayoutPlaceProvider iStatusLayoutPlaceProvider) {
            this.f85711e = iStatusLayoutPlaceProvider;
            return this;
        }

        /* renamed from: a */
        public C33273a mo122726a(AbstractC34072a<? extends ContentVO> aVar) {
            this.f85710d = aVar;
            return this;
        }

        /* renamed from: a */
        public C33273a mo122727a(AbstractC34073b bVar) {
            this.f85714h = bVar;
            return this;
        }

        /* renamed from: a */
        public C33273a mo122728a(AbstractC59012g<ChatMessageVO> gVar) {
            this.f85712f = gVar;
            return this;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m128764c(MessageBubbleViewHolder messageBubbleViewHolder) {
        messageBubbleViewHolder.f85699b.setVisibility(4);
    }

    /* renamed from: a */
    private void m128751a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private void m128762b(MessageBubbleViewHolder messageBubbleViewHolder) {
        m128751a((View) messageBubbleViewHolder.f85698a);
        m128751a((View) messageBubbleViewHolder.mContentContainer);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m128757a(ChatMessageVO cVar) {
        AbstractC33274b bVar = this.f85690m;
        if (bVar != null) {
            bVar.mo122798h(cVar.mo121681a());
        }
    }

    /* renamed from: b */
    private int m128761b(AbstractC33342d dVar) {
        if (dVar.mo122549m() || dVar.mo122550n() == null) {
            return f85683c;
        }
        return f85685h;
    }

    public static class MessageBubbleViewHolder extends C59008d {

        /* renamed from: a */
        public LKUIRoundLinearLayout f85698a;

        /* renamed from: b */
        public View f85699b;

        /* renamed from: c */
        public View f85700c;

        /* renamed from: d */
        public View f85701d;

        /* renamed from: e */
        public View f85702e;

        /* renamed from: f */
        public View f85703f;

        /* renamed from: g */
        public View f85704g;

        /* renamed from: h */
        public View f85705h;
        public CountDownView mBurnTimeText;
        public FrameLayout mContentContainer;
        public View mDesktopHoverStub;
        public ImageView mDingView;
        Guideline mGuideLine;
        public View mMaskView;
        public View mMessageCheckBoxWrapper;
        public UDCheckBox mMessageCheckbox;
        public ViewGroup mMessageItemRight;
        public View mMsgGroupView;
        public TextView mTimeTV;
        public FrameLayout mTopRegionContainer;

        @Override // com.ss.android.lark.widget.recyclerview.hive.C59008d, com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            super.mo122652a(view);
            ButterKnife.bind(this, view);
            this.f85698a = (LKUIRoundLinearLayout) view.findViewById(R.id.bubble_content_container);
            m128783a(view.getContext());
        }

        /* renamed from: a */
        private void m128783a(Context context) {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91857a(this.mBurnTimeText, LarkFont.CAPTION0);
                C25649b.m91856a(this.mTimeTV, 12);
                int dp2px = UIHelper.dp2px(56.0f) + (LKUIDisplayManager.m91881c(context, 32) - UIHelper.dp2px(32.0f));
                Guideline guideline = this.mGuideLine;
                if (guideline != null) {
                    guideline.setGuidelineBegin(dp2px);
                }
                if (this.mMessageCheckBoxWrapper != null) {
                    int c = LKUIDisplayManager.m91881c(context, 56);
                    ViewGroup.LayoutParams layoutParams = this.mMessageCheckBoxWrapper.getLayoutParams();
                    layoutParams.width = c;
                    this.mMessageCheckBoxWrapper.setLayoutParams(layoutParams);
                }
            }
        }

        /* renamed from: a */
        public void mo122720a(float f, float f2, float f3, float f4) {
            this.f85698a.mo89623a(f, f2, f3, f4);
            if (this.mDingView.getVisibility() == 0) {
                ((LKUIRoundedImageView) this.mDingView).setCornerRadiusDP(f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* renamed from: a */
    private String m128750a(long j) {
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191593a(LengthType.LONG);
        aVar.mo191599b(!C29990c.m110930b().mo134524W().mo134469a());
        aVar.mo191594a(TimePreciseness.SECOND);
        aVar.mo191603d(true);
        return TimeFormatUtils.m219292g(UIHelper.getContext(), new Date(j), aVar);
    }

    /* renamed from: a */
    private void m128752a(MessageBubbleViewHolder messageBubbleViewHolder) {
        if (messageBubbleViewHolder.f85699b == null) {
            ((ViewStub) messageBubbleViewHolder.mDesktopHoverStub).inflate();
            messageBubbleViewHolder.f85699b = messageBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_wrapper);
            messageBubbleViewHolder.f85700c = messageBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_reaction_wrapper);
            messageBubbleViewHolder.f85701d = messageBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_reaction);
            messageBubbleViewHolder.f85702e = messageBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_reply_wrapper);
            messageBubbleViewHolder.f85703f = messageBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_reply);
            messageBubbleViewHolder.f85704g = messageBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_more_operation_wrapper);
            messageBubbleViewHolder.f85705h = messageBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_more_operation);
        }
    }

    /* renamed from: a */
    private void m128756a(AbstractC33342d dVar) {
        AbstractC34072a<? extends ContentVO> k = m128772k();
        AbstractC33274b bVar = this.f85690m;
        mo200138a(R.id.msg_swipe_view, new MessageUserInfoBlock(dVar, bVar, bVar));
        mo200138a(R.id.chat_message_reply_stub, new C33325c(dVar, k));
        mo200138a(R.id.bubble_content_container, new C33323b(dVar, new C33097aa(dVar.mo122543g(), dVar.mo122544h(), dVar), k));
        mo200138a(R.id.reply_layout, new C33320a(dVar, this.f85690m));
        mo200138a(R.id.time_read_state_container_align_bubble, new MessageStatusBlock(dVar, this.f85690m, m128771j()));
        mo200138a(R.id.chat_msg_group, new MessageTranslateBlock(dVar, this.f85690m));
    }

    /* renamed from: e */
    private void m128768e(MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar) {
        if (cVar.mo124280o()) {
            messageBubbleViewHolder.mTimeTV.setVisibility(0);
            messageBubbleViewHolder.mTimeTV.setText(m128750a(cVar.mo121716x() * 1000));
            return;
        }
        messageBubbleViewHolder.mTimeTV.setVisibility(8);
    }

    /* renamed from: b */
    public void mo122717b(MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar) {
        AbstractC33274b bVar = this.f85690m;
        if (bVar != null) {
            bVar.mo122763a(cVar.mo121681a(), cVar.mo121710r());
        }
        super.mo122649a((C59008d) messageBubbleViewHolder, (AbsMessageVO) cVar);
        AbstractC33274b bVar2 = this.f85690m;
        if (bVar2 != null) {
            bVar2.mo122764b(cVar.mo121681a(), cVar.mo121710r());
        }
    }

    /* renamed from: c */
    private void m128765c(MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar) {
        if (C35247g.m137628a(cVar.mo124253Z(), cVar.mo124252Y())) {
            messageBubbleViewHolder.mBurnTimeText.setVisibility(0);
            boolean b = C35247g.m137633b(cVar.mo124253Z(), cVar.mo124252Y());
            long a = C35247g.m137624a(cVar.mo124253Z(), cVar.mo124252Y(), cVar.mo121716x(), cVar.mo121681a());
            messageBubbleViewHolder.mBurnTimeText.setOnCountDownListener(new CountDownView.AbstractC35265a(cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MessageBubbleCell$BgpkOEqYsRjbGlTtysoH9TDM6E */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chatwindow.view.burn.CountDownView.AbstractC35265a
                public final void onFinish() {
                    MessageBubbleCell.m270367lambda$BgpkOEqYsRjbGlTtysoH9TDM6E(MessageBubbleCell.this, this.f$1);
                }
            });
            if (b) {
                messageBubbleViewHolder.mBurnTimeText.mo129799a(a, 1000);
                return;
            }
            messageBubbleViewHolder.mBurnTimeText.mo129800a(a, C35247g.m137624a(cVar.mo124253Z(), cVar.mo124252Y(), cVar.mo121716x(), cVar.mo121681a()), 1000);
            return;
        }
        messageBubbleViewHolder.mBurnTimeText.mo129801b();
        messageBubbleViewHolder.mBurnTimeText.setVisibility(8);
    }

    /* renamed from: f */
    private void m128769f(MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar) {
        int i;
        if (cVar.mo121710r() == Message.Type.IMAGE || cVar.mo121710r() == Message.Type.STICKER || cVar.mo121710r() == Message.Type.LOCATION || cVar.mo121710r() == Message.Type.SHARE_USER_CARD) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) messageBubbleViewHolder.mDingView.getLayoutParams();
            marginLayoutParams.leftMargin = f85686i;
            if (this.f85695r) {
                marginLayoutParams.topMargin = f85688k;
            } else {
                marginLayoutParams.topMargin = f85687j;
            }
            messageBubbleViewHolder.mDingView.setLayoutParams(marginLayoutParams);
        }
        ImageView imageView = messageBubbleViewHolder.mDingView;
        if (cVar.mo124247T()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: d */
    private void m128767d(MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar) {
        int i;
        int i2;
        if (DesktopUtil.m144301a((Context) this.f85792a.mo122543g()) && (this.f146200f instanceof ICellHoverHandler)) {
            m128752a(messageBubbleViewHolder);
            ViewGroup.LayoutParams layoutParams = messageBubbleViewHolder.f85699b.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = UIHelper.dp2px(20.0f);
            }
            messageBubbleViewHolder.mMessageItemRight.setDescendantFocusability(131072);
            ICellHoverHandler iCellHoverHandler = (ICellHoverHandler) this.f146200f;
            boolean c = iCellHoverHandler.mo122234c(this, messageBubbleViewHolder, cVar);
            boolean b = iCellHoverHandler.mo122230b(this, messageBubbleViewHolder, cVar);
            boolean a = iCellHoverHandler.mo122226a(this, messageBubbleViewHolder, cVar);
            View view = messageBubbleViewHolder.f85700c;
            int i3 = 0;
            if (c) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = messageBubbleViewHolder.f85702e;
            if (b) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view2.setVisibility(i2);
            View view3 = messageBubbleViewHolder.f85704g;
            if (!a) {
                i3 = 8;
            }
            view3.setVisibility(i3);
            messageBubbleViewHolder.f146209n.setOnHoverListener(new View.OnHoverListener(messageBubbleViewHolder, iCellHoverHandler, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MessageBubbleCell$VMnFF3bScTJsXBVUF3LTT4ceJY */
                public final /* synthetic */ MessageBubbleCell.MessageBubbleViewHolder f$1;
                public final /* synthetic */ ICellHoverHandler f$2;
                public final /* synthetic */ ChatMessageVO f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return MessageBubbleCell.m270369lambda$VMnFF3bScTJsXBVUF3LTT4ceJY(MessageBubbleCell.this, this.f$1, this.f$2, this.f$3, view, motionEvent);
                }
            });
            messageBubbleViewHolder.f85700c.setOnClickListener(new View.OnClickListener(iCellHoverHandler, messageBubbleViewHolder, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MessageBubbleCell$hVvPm8XvvOapXNnSelX5pPlZbc */
                public final /* synthetic */ ICellHoverHandler f$1;
                public final /* synthetic */ MessageBubbleCell.MessageBubbleViewHolder f$2;
                public final /* synthetic */ ChatMessageVO f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    MessageBubbleCell.m270370lambda$hVvPm8XvvOapXNnSelX5pPlZbc(MessageBubbleCell.this, this.f$1, this.f$2, this.f$3, view);
                }
            });
            messageBubbleViewHolder.f85702e.setOnClickListener(new View.OnClickListener(iCellHoverHandler, messageBubbleViewHolder, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MessageBubbleCell$FEZVrxQnYur50HEaK3GWBp1tE0 */
                public final /* synthetic */ ICellHoverHandler f$1;
                public final /* synthetic */ MessageBubbleCell.MessageBubbleViewHolder f$2;
                public final /* synthetic */ ChatMessageVO f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    MessageBubbleCell.m270368lambda$FEZVrxQnYur50HEaK3GWBp1tE0(MessageBubbleCell.this, this.f$1, this.f$2, this.f$3, view);
                }
            });
            messageBubbleViewHolder.f85704g.setOnClickListener(new View.OnClickListener(iCellHoverHandler, messageBubbleViewHolder, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MessageBubbleCell$AZm0ly3gHo9WHA5gnqa5SZuNTw */
                public final /* synthetic */ ICellHoverHandler f$1;
                public final /* synthetic */ MessageBubbleCell.MessageBubbleViewHolder f$2;
                public final /* synthetic */ ChatMessageVO f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    MessageBubbleCell.m270366lambda$AZm0ly3gHo9WHA5gnqa5SZuNTw(MessageBubbleCell.this, this.f$1, this.f$2, this.f$3, view);
                }
            });
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) messageBubbleViewHolder.f85699b.getLayoutParams();
            if (layoutParams2 != null) {
                if (this.f85792a.mo122546j()) {
                    if (f85689l == 0) {
                        f85689l = m128774m();
                    }
                    if (cVar.mo124252Y() > 0) {
                        layoutParams2.leftMargin = -f85689l;
                    } else {
                        layoutParams2.leftMargin = UIHelper.dp2px(-20.0f);
                    }
                } else {
                    layoutParams2.leftMargin = UIHelper.dp2px(-20.0f);
                }
                messageBubbleViewHolder.f85699b.setLayoutParams(layoutParams2);
            }
            UIUtils.disableAllParentClipChild(messageBubbleViewHolder.f85699b);
        }
    }

    /* renamed from: g */
    private void m128770g(MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar) {
        int m = cVar.mo121705m();
        if (m == 1) {
            int b = m128761b(this.f85792a);
            if (cVar.mo121655A() == Message.Status.DELETED) {
                cVar.mo124271c(0);
                messageBubbleViewHolder.mMessageItemRight.setPadding(0, b, this.f85696s, f85685h);
            } else {
                messageBubbleViewHolder.mMessageItemRight.setPadding(0, b, this.f85696s, f85684g);
            }
        } else if (m != 2) {
            if (m != 3) {
                messageBubbleViewHolder.mMessageItemRight.setPadding(0, m128761b(this.f85792a), this.f85696s, f85685h);
            } else if (cVar.mo124281p()) {
                messageBubbleViewHolder.mMessageItemRight.setPadding(0, f85684g, this.f85696s, f85685h);
            } else {
                cVar.mo124271c(0);
                ViewGroup viewGroup = messageBubbleViewHolder.mMessageItemRight;
                int i = f85685h;
                viewGroup.setPadding(0, i, this.f85696s, i);
            }
        } else if (cVar.mo121655A() == Message.Status.DELETED) {
            messageBubbleViewHolder.mMessageItemRight.setPadding(0, f85684g, this.f85696s, f85685h);
        } else {
            ViewGroup viewGroup2 = messageBubbleViewHolder.mMessageItemRight;
            int i2 = f85684g;
            viewGroup2.setPadding(0, i2, this.f85696s, i2);
        }
        float[] a = MessageCellUtils.m133195a(cVar);
        messageBubbleViewHolder.mo122720a(a[0], a[1], a[2], a[3]);
    }

    /* renamed from: a */
    private boolean m128759a(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m128754a(MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar, View view) {
        mo122683c((AbstractC59010e) messageBubbleViewHolder, (Object) cVar);
    }

    /* renamed from: a */
    private void m128753a(MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar, Drawable drawable) {
        if (!C32944d.m126868a(messageBubbleViewHolder.f146209n)) {
            if (cVar.mo121659E() != null) {
                messageBubbleViewHolder.f146209n.setBackgroundColor(UIUtils.getColor(this.f85792a.mo122543g(), R.color.imtoken_message_bg_pin));
            } else if (drawable != null) {
                messageBubbleViewHolder.f146209n.setBackground(drawable);
            } else {
                messageBubbleViewHolder.f146209n.setBackground(C33360a.m129157c());
            }
        }
    }

    /* renamed from: a */
    private void m128755a(MessageBubbleViewHolder messageBubbleViewHolder, boolean z, int i) {
        boolean[] zArr = new boolean[3];
        if (i == 0) {
            zArr[0] = true;
        } else if (i == 1) {
            zArr[1] = true;
        } else if (i == 2) {
            zArr[2] = true;
        }
        if (z) {
            zArr = new boolean[3];
        }
        messageBubbleViewHolder.f85701d.setSelected(zArr[0]);
        messageBubbleViewHolder.f85703f.setSelected(zArr[1]);
        messageBubbleViewHolder.f85705h.setSelected(zArr[2]);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m128758a(ICellHoverHandler iCellHoverHandler, MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar, View view) {
        iCellHoverHandler.mo122222a(messageBubbleViewHolder.f85704g, this, messageBubbleViewHolder, cVar);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m128763b(ICellHoverHandler iCellHoverHandler, MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar, View view) {
        iCellHoverHandler.mo122228b(messageBubbleViewHolder.f85702e, this, messageBubbleViewHolder, cVar);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m128766c(ICellHoverHandler iCellHoverHandler, MessageBubbleViewHolder messageBubbleViewHolder, ChatMessageVO cVar, View view) {
        iCellHoverHandler.mo122232c(messageBubbleViewHolder.f85700c, this, messageBubbleViewHolder, cVar);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m128760a(MessageBubbleViewHolder messageBubbleViewHolder, ICellHoverHandler iCellHoverHandler, ChatMessageVO cVar, View view, MotionEvent motionEvent) {
        AbstractC33290a aVar = this.f85694q;
        if (aVar instanceof AbstractC33309a) {
            ((AbstractC33309a) aVar).mo122681a(view, MotionEvent.obtain(motionEvent));
        }
        int action = motionEvent.getAction();
        if (action == 7) {
            boolean a = m128759a(messageBubbleViewHolder.f85700c, motionEvent);
            boolean a2 = m128759a(messageBubbleViewHolder.f85702e, motionEvent);
            boolean a3 = m128759a(messageBubbleViewHolder.f85704g, motionEvent);
            if (a) {
                if (!messageBubbleViewHolder.f85701d.isSelected()) {
                    iCellHoverHandler.mo122224a(messageBubbleViewHolder.f85700c, this, messageBubbleViewHolder, cVar, motionEvent, 0);
                    m128755a(messageBubbleViewHolder, false, 0);
                }
            } else if (a2) {
                iCellHoverHandler.mo122224a(messageBubbleViewHolder.f85702e, this, messageBubbleViewHolder, cVar, motionEvent, 1);
                m128755a(messageBubbleViewHolder, false, 1);
            } else if (a3) {
                iCellHoverHandler.mo122224a(messageBubbleViewHolder.f85704g, this, messageBubbleViewHolder, cVar, motionEvent, 2);
                m128755a(messageBubbleViewHolder, false, 2);
            } else {
                motionEvent.setAction(10);
                iCellHoverHandler.mo122224a(messageBubbleViewHolder.f85700c, this, messageBubbleViewHolder, cVar, motionEvent, 0);
                m128755a(messageBubbleViewHolder, true, 0);
            }
        } else if (action == 9) {
            messageBubbleViewHolder.f85699b.setVisibility(0);
        } else if (action == 10) {
            messageBubbleViewHolder.f85699b.post(new Runnable() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MessageBubbleCell$2fjS5A_ByLg1zuKZTF0dvBvKDP4 */

                public final void run() {
                    MessageBubbleCell.lambda$2fjS5A_ByLg1zuKZTF0dvBvKDP4(MessageBubbleCell.MessageBubbleViewHolder.this);
                }
            });
            iCellHoverHandler.mo122224a(messageBubbleViewHolder.f85700c, this, messageBubbleViewHolder, cVar, motionEvent, 0);
            m128755a(messageBubbleViewHolder, true, 0);
        }
        return true;
    }

    MessageBubbleCell(AbstractC33290a aVar, AbstractC33342d dVar, AbstractC33274b bVar, AbstractC34072a<? extends ContentVO> aVar2, IStatusLayoutPlaceProvider iStatusLayoutPlaceProvider, AbstractC34073b bVar2) {
        super(dVar);
        int i;
        boolean h = C29990c.m110930b().mo134580h();
        this.f85695r = h;
        if (h) {
            i = 0;
        } else {
            i = UIHelper.dp2px(15.0f);
        }
        this.f85696s = i;
        this.f85690m = bVar;
        this.f85691n = aVar2;
        this.f85692o = iStatusLayoutPlaceProvider;
        this.f85693p = bVar2;
        this.f85694q = aVar;
        mo200138a(R.id.content, aVar);
        m128756a(dVar);
    }
}
