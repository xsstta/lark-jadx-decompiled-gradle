package com.ss.android.lark.chatthread.messagebubble;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.chatwindow.view.burn.CountDownView;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.an;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconTextView;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.ttm.player.MediaPlayer;
import java.util.Date;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u0018\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u0002H\u0014J\u001c\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u001c\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u001c\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u001c\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u001c\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageStatusBlock;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageStatusBlock$ExtraInfoViewHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "statusChangeCallBack", "Lcom/ss/android/lark/chat/chatwindow/chat/message/block/MessageStatusBlock$StatusChangeCallback;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/chatwindow/chat/message/block/MessageStatusBlock$StatusChangeCallback;)V", "getTimeLabel", "", "time", "", "layoutId", "", "onBindViewHolder", "", "viewHolder", "item", "setDateStatus", "holder", "setDisplaySize", "setDivider", "setSendingStatus", "setUpBurnField", "setUpDing", "messageInfo", "setupPostTitle", "ExtraInfoViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.b.c */
public final class ChatThreadMessageStatusBlock extends AbstractC59004b<ChatMessageVO<ContentVO<?>>, ExtraInfoViewHolder> {

    /* renamed from: a */
    public final MessageStatusBlock.AbstractC33313a f90600a;

    /* renamed from: b */
    private final AbstractC33342d f90601b;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0010H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020%X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageStatusBlock$ExtraInfoViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "()V", "burnView", "Lcom/ss/android/lark/chatwindow/view/burn/CountDownView;", "getBurnView", "()Lcom/ss/android/lark/chatwindow/view/burn/CountDownView;", "setBurnView", "(Lcom/ss/android/lark/chatwindow/view/burn/CountDownView;)V", "dingView", "Landroid/widget/ImageView;", "getDingView", "()Landroid/widget/ImageView;", "setDingView", "(Landroid/widget/ImageView;)V", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "setDivider", "(Landroid/view/View;)V", "messageDate", "Landroid/widget/TextView;", "getMessageDate", "()Landroid/widget/TextView;", "setMessageDate", "(Landroid/widget/TextView;)V", "postTitle", "Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiconTextView;", "getPostTitle", "()Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiconTextView;", "setPostTitle", "(Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiconTextView;)V", "sendFailedView", "getSendFailedView", "setSendFailedView", "sendStatusWrapper", "Landroid/view/ViewGroup;", "getSendStatusWrapper", "()Landroid/view/ViewGroup;", "setSendStatusWrapper", "(Landroid/view/ViewGroup;)V", "sendingView", "Landroid/widget/ProgressBar;", "getSendingView", "()Landroid/widget/ProgressBar;", "setSendingView", "(Landroid/widget/ProgressBar;)V", "onBindView", "", "itemView", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.c$a */
    public static final class ExtraInfoViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public CountDownView f90602a;

        /* renamed from: b */
        public ViewGroup f90603b;

        /* renamed from: c */
        public ProgressBar f90604c;

        /* renamed from: d */
        public ImageView f90605d;

        /* renamed from: e */
        public TextView f90606e;

        /* renamed from: f */
        public EmojiconTextView f90607f;

        /* renamed from: g */
        public ImageView f90608g;

        /* renamed from: h */
        public View f90609h;

        /* renamed from: a */
        public final CountDownView mo129388a() {
            CountDownView countDownView = this.f90602a;
            if (countDownView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("burnView");
            }
            return countDownView;
        }

        /* renamed from: b */
        public final ViewGroup mo129389b() {
            ViewGroup viewGroup = this.f90603b;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendStatusWrapper");
            }
            return viewGroup;
        }

        /* renamed from: c */
        public final ProgressBar mo129390c() {
            ProgressBar progressBar = this.f90604c;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendingView");
            }
            return progressBar;
        }

        /* renamed from: d */
        public final ImageView mo129391d() {
            ImageView imageView = this.f90605d;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendFailedView");
            }
            return imageView;
        }

        /* renamed from: e */
        public final TextView mo129392e() {
            TextView textView = this.f90606e;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageDate");
            }
            return textView;
        }

        /* renamed from: f */
        public final EmojiconTextView mo129393f() {
            EmojiconTextView emojiconTextView = this.f90607f;
            if (emojiconTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("postTitle");
            }
            return emojiconTextView;
        }

        /* renamed from: g */
        public final ImageView mo129394g() {
            ImageView imageView = this.f90608g;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dingView");
            }
            return imageView;
        }

        /* renamed from: h */
        public final View mo129395h() {
            View view = this.f90609h;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("divider");
            }
            return view;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            if (view != null) {
                View findViewById = view.findViewById(R.id.tv_burn_time);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.tv_burn_time)");
                this.f90602a = (CountDownView) findViewById;
                View findViewById2 = view.findViewById(R.id.send_status_wrapper);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.send_status_wrapper)");
                this.f90603b = (ViewGroup) findViewById2;
                View findViewById3 = view.findViewById(R.id.sending_status);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.sending_status)");
                this.f90604c = (ProgressBar) findViewById3;
                View findViewById4 = view.findViewById(R.id.sending_fail_status);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.sending_fail_status)");
                this.f90605d = (ImageView) findViewById4;
                View findViewById5 = view.findViewById(R.id.text_date);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.text_date)");
                this.f90606e = (TextView) findViewById5;
                View findViewById6 = view.findViewById(R.id.tv_post_title);
                Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.tv_post_title)");
                this.f90607f = (EmojiconTextView) findViewById6;
                View findViewById7 = view.findViewById(R.id.view_ding);
                Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.view_ding)");
                this.f90608g = (ImageView) findViewById7;
                View findViewById8 = view.findViewById(R.id.divider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.divider)");
                this.f90609h = findViewById8;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onFinish"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.c$c */
    public static final class C35091c implements CountDownView.AbstractC35265a {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageStatusBlock f90612a;

        /* renamed from: b */
        final /* synthetic */ ChatMessageVO f90613b;

        C35091c(ChatThreadMessageStatusBlock cVar, ChatMessageVO cVar2) {
            this.f90612a = cVar;
            this.f90613b = cVar2;
        }

        @Override // com.ss.android.lark.chatwindow.view.burn.CountDownView.AbstractC35265a
        public final void onFinish() {
            MessageStatusBlock.AbstractC33313a aVar = this.f90612a.f90600a;
            if (aVar != null) {
                aVar.mo122798h(this.f90613b.mo121681a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.c$b */
    public static final class View$OnClickListenerC35090b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageStatusBlock f90610a;

        /* renamed from: b */
        final /* synthetic */ ChatMessageVO f90611b;

        View$OnClickListenerC35090b(ChatThreadMessageStatusBlock cVar, ChatMessageVO cVar2) {
            this.f90610a = cVar;
            this.f90611b = cVar2;
        }

        public final void onClick(View view) {
            MessageStatusBlock.AbstractC33313a aVar = this.f90610a.f90600a;
            if (aVar != null) {
                aVar.mo122797g(this.f90611b.mo121681a());
            }
        }
    }

    /* renamed from: a */
    private final void m136893a(ExtraInfoViewHolder aVar) {
        View h = aVar.mo129395h();
        int i = 0;
        boolean z = true;
        if (aVar.mo200148l() != 1) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        h.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = aVar.mo129395h().getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(UIHelper.dp2px(16.0f));
            marginLayoutParams.setMarginEnd(UIHelper.dp2px(16.0f));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: b */
    private final void m136894b(ExtraInfoViewHolder aVar) {
        C25649b.m91857a(aVar.mo129393f(), LarkFont.TITLE2);
        C25649b.m91857a(aVar.mo129388a(), LarkFont.CAPTION0);
        C25649b.m91853a(aVar.mo129391d(), 22);
        C25649b.m91857a(aVar.mo129392e(), LarkFont.CAPTION0);
    }

    /* renamed from: a */
    private final String m136892a(long j) {
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191593a(LengthType.LONG);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        an W = b.mo134524W();
        Intrinsics.checkExpressionValueIsNotNull(W, "ChatModuleInstanceHolder…cy().timeFormatDependency");
        aVar.mo191599b(!W.mo134469a());
        aVar.mo191594a(TimePreciseness.MINUTE);
        Context context = UIHelper.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "UIHelper.getContext()");
        return TimeFormatUtils.m219292g(context, new Date(j), aVar);
    }

    public ChatThreadMessageStatusBlock(AbstractC33342d dVar, MessageStatusBlock.AbstractC33313a aVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
        this.f90601b = dVar;
        this.f90600a = aVar;
    }

    /* renamed from: d */
    private final void m136897d(ExtraInfoViewHolder aVar, ChatMessageVO<?> cVar) {
        aVar.mo129392e().setText(m136892a(cVar.mo121716x() * ((long) 1000)));
    }

    /* renamed from: e */
    private final void m136898e(ExtraInfoViewHolder aVar, ChatMessageVO<?> cVar) {
        if (cVar.mo124247T()) {
            aVar.mo129394g().setVisibility(0);
        } else {
            aVar.mo129394g().setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ExtraInfoViewHolder aVar, ChatMessageVO<ContentVO<?>> cVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        if (cVar != null) {
            m136894b(aVar);
            m136893a(aVar);
            m136895b(aVar, (ChatMessageVO<?>) cVar);
            m136896c(aVar, (ChatMessageVO<?>) cVar);
            m136897d(aVar, cVar);
            m136899f(aVar, cVar);
            m136898e(aVar, cVar);
        }
    }

    /* renamed from: f */
    private final void m136899f(ExtraInfoViewHolder aVar, ChatMessageVO<?> cVar) {
        String str;
        aVar.mo129393f().setVisibility(8);
        if (Intrinsics.areEqual(cVar.mo121700h(), cVar.mo121681a())) {
            FragmentActivity g = this.f90601b.mo122543g();
            if (Message.Type.POST != cVar.mo121710r() || !(cVar.mo121699g() instanceof PostContentVO)) {
                str = "";
            } else {
                ContentVO g2 = cVar.mo121699g();
                if (g2 != null) {
                    str = ((PostContentVO) g2).mo121877a(g);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.PostContentVO");
                }
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                aVar.mo129393f().setVisibility(0);
                aVar.mo129393f().setText(str2);
            }
        }
    }

    /* renamed from: b */
    private final void m136895b(ExtraInfoViewHolder aVar, ChatMessageVO<?> cVar) {
        if (C35247g.m137628a(cVar.mo124253Z(), cVar.mo124252Y())) {
            aVar.mo129388a().setVisibility(0);
            boolean b = C35247g.m137633b(cVar.mo124253Z(), cVar.mo124252Y());
            long a = C35247g.m137624a(cVar.mo124253Z(), cVar.mo124252Y(), cVar.mo121716x(), cVar.mo121681a());
            aVar.mo129388a().setOnCountDownListener(new C35091c(this, cVar));
            if (b) {
                aVar.mo129388a().mo129799a(a, 1000);
                return;
            }
            aVar.mo129388a().mo129800a(a, C35247g.m137624a(cVar.mo124253Z(), cVar.mo124252Y(), cVar.mo121716x(), cVar.mo121681a()), 1000);
            return;
        }
        aVar.mo129388a().mo129801b();
        aVar.mo129388a().setVisibility(8);
    }

    /* renamed from: c */
    private final void m136896c(ExtraInfoViewHolder aVar, ChatMessageVO<?> cVar) {
        SendStatus B = cVar.mo121656B();
        int i = C35092d.f90614a[B.ordinal()];
        boolean z = true;
        if (i == 1) {
            UIUtils.hide(aVar.mo129389b());
            UIUtils.hide(aVar.mo129390c());
            UIUtils.hide(aVar.mo129391d());
        } else if (i != 2) {
            UIUtils.show(aVar.mo129389b());
            UIUtils.show(aVar.mo129390c());
            UIUtils.hide(aVar.mo129391d());
        } else {
            UIUtils.show(aVar.mo129389b());
            UIUtils.hide(aVar.mo129390c());
            UIUtils.show(aVar.mo129391d());
            aVar.mo129391d().setOnClickListener(new View$OnClickListenerC35090b(this, cVar));
        }
        if (!(cVar.mo121710r() == Message.Type.MEDIA || cVar.mo121710r() == Message.Type.IMAGE)) {
            z = false;
        }
        if (B != SendStatus.FAIL && z) {
            UIUtils.hide(aVar.mo129390c());
        }
    }
}
