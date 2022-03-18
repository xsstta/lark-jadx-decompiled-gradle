package com.ss.android.lark.chatthread.messagebubble;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.p2993y.p2994a.AbstractC59357a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u001c\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00032\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u001e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0002J\u001c\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00032\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u001c\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00032\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageFooterBlock;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageFooterBlock$ThreadFooterViewHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "translateListener", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnTranslateListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnTranslateListener;)V", "dependency", "Lcom/ss/android/lark/dependency/IFeatureGatingDependency;", "kotlin.jvm.PlatformType", "getContext", "Landroid/content/Context;", "getItemClassImpl", "Ljava/lang/Class;", "layoutId", "", "onBindViewHolder", "", "viewHolder", "item", "setDisplaySize", "holder", "setupForwardBlock", "messageVO", "setupPinBlock", "setupReplayBlock", "setupTranslateZone", "ThreadFooterViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.b.b */
public final class ChatThreadMessageFooterBlock extends AbstractC59004b<ChatMessageVO<?>, ThreadFooterViewHolder> {

    /* renamed from: a */
    public final AbstractC33307q f90583a;

    /* renamed from: b */
    private final AbstractC36503q f90584b;

    /* renamed from: c */
    private final AbstractC33342d f90585c;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return ThreadFooterViewHolder.class;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\"H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageFooterBlock$ThreadFooterViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "()V", "mForwardTV", "Landroid/widget/TextView;", "getMForwardTV", "()Landroid/widget/TextView;", "setMForwardTV", "(Landroid/widget/TextView;)V", "mPinDesc", "getMPinDesc", "setMPinDesc", "mPinIcon", "Landroid/widget/ImageView;", "getMPinIcon", "()Landroid/widget/ImageView;", "setMPinIcon", "(Landroid/widget/ImageView;)V", "mReplyCountTV", "getMReplyCountTV", "setMReplyCountTV", "mTranslateShowOriginLV", "Lcom/larksuite/component/ui/imageview/LKUILottieAnimationView;", "getMTranslateShowOriginLV", "()Lcom/larksuite/component/ui/imageview/LKUILottieAnimationView;", "setMTranslateShowOriginLV", "(Lcom/larksuite/component/ui/imageview/LKUILottieAnimationView;)V", "mTranslateShowOriginTV", "getMTranslateShowOriginTV", "setMTranslateShowOriginTV", "mTranslationFeedbackTV", "getMTranslationFeedbackTV", "setMTranslationFeedbackTV", "vLayoutTranslate", "Landroid/view/View;", "getVLayoutTranslate", "()Landroid/view/View;", "setVLayoutTranslate", "(Landroid/view/View;)V", "onBindView", "", "itemView", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.b$a */
    public static final class ThreadFooterViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public View f90586a;

        /* renamed from: b */
        public TextView f90587b;

        /* renamed from: c */
        public ImageView f90588c;

        /* renamed from: d */
        public TextView f90589d;

        /* renamed from: e */
        public TextView f90590e;

        /* renamed from: f */
        public TextView f90591f;

        /* renamed from: g */
        public LKUILottieAnimationView f90592g;

        /* renamed from: h */
        public TextView f90593h;

        /* renamed from: a */
        public final View mo129376a() {
            View view = this.f90586a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vLayoutTranslate");
            }
            return view;
        }

        /* renamed from: b */
        public final TextView mo129377b() {
            TextView textView = this.f90587b;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTranslationFeedbackTV");
            }
            return textView;
        }

        /* renamed from: c */
        public final ImageView mo129378c() {
            ImageView imageView = this.f90588c;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPinIcon");
            }
            return imageView;
        }

        /* renamed from: d */
        public final TextView mo129379d() {
            TextView textView = this.f90589d;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPinDesc");
            }
            return textView;
        }

        /* renamed from: e */
        public final TextView mo129380e() {
            TextView textView = this.f90590e;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mForwardTV");
            }
            return textView;
        }

        /* renamed from: f */
        public final TextView mo129381f() {
            TextView textView = this.f90591f;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReplyCountTV");
            }
            return textView;
        }

        /* renamed from: g */
        public final LKUILottieAnimationView mo129382g() {
            LKUILottieAnimationView lKUILottieAnimationView = this.f90592g;
            if (lKUILottieAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTranslateShowOriginLV");
            }
            return lKUILottieAnimationView;
        }

        /* renamed from: h */
        public final TextView mo129383h() {
            TextView textView = this.f90593h;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTranslateShowOriginTV");
            }
            return textView;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            if (view != null) {
                View findViewById = view.findViewById(R.id.layout_translate);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.layout_translate)");
                this.f90586a = findViewById;
                View findViewById2 = view.findViewById(R.id.translation_feedback_tv);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.translation_feedback_tv)");
                this.f90587b = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.chat_thread_pin_icon);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.chat_thread_pin_icon)");
                this.f90588c = (ImageView) findViewById3;
                View findViewById4 = view.findViewById(R.id.chat_thread_pin_desc);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.chat_thread_pin_desc)");
                this.f90589d = (TextView) findViewById4;
                View findViewById5 = view.findViewById(R.id.chat_message_forward_desc);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.chat_message_forward_desc)");
                this.f90590e = (TextView) findViewById5;
                View findViewById6 = view.findViewById(R.id.tv_reply_num);
                Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.tv_reply_num)");
                this.f90591f = (TextView) findViewById6;
                View findViewById7 = view.findViewById(R.id.translate_show_origin_lv);
                Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.translate_show_origin_lv)");
                this.f90592g = (LKUILottieAnimationView) findViewById7;
                View findViewById8 = view.findViewById(R.id.translate_show_origin_tv);
                Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.translate_show_origin_tv)");
                this.f90593h = (TextView) findViewById8;
            }
        }
    }

    /* renamed from: d */
    private final Context m136876d() {
        return this.f90585c.mo122543g();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.b$c */
    public static final class View$OnClickListenerC35088c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageFooterBlock f90596a;

        /* renamed from: b */
        final /* synthetic */ ChatMessageVO f90597b;

        View$OnClickListenerC35088c(ChatThreadMessageFooterBlock bVar, ChatMessageVO cVar) {
            this.f90596a = bVar;
            this.f90597b = cVar;
        }

        public final void onClick(View view) {
            AbstractC33307q qVar = this.f90596a.f90583a;
            if (qVar != null) {
                qVar.mo122779r(this.f90597b.mo121681a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.b$d */
    public static final class View$OnClickListenerC35089d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageFooterBlock f90598a;

        /* renamed from: b */
        final /* synthetic */ ChatMessageVO f90599b;

        View$OnClickListenerC35089d(ChatThreadMessageFooterBlock bVar, ChatMessageVO cVar) {
            this.f90598a = bVar;
            this.f90599b = cVar;
        }

        public final void onClick(View view) {
            AbstractC33307q qVar = this.f90598a.f90583a;
            if (qVar != null) {
                qVar.mo122780s(this.f90599b.mo121681a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.b$b */
    public static final class View$OnClickListenerC35087b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageFooterBlock f90594a;

        /* renamed from: b */
        final /* synthetic */ ChatMessageVO f90595b;

        View$OnClickListenerC35087b(ChatThreadMessageFooterBlock bVar, ChatMessageVO cVar) {
            this.f90594a = bVar;
            this.f90595b = cVar;
        }

        public final void onClick(View view) {
            AbstractC33307q qVar = this.f90594a.f90583a;
            if (qVar != null) {
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                ChatMessageVO<TranslatableContentVO<?>> cVar = this.f90595b;
                if (cVar != null) {
                    qVar.mo122778a(view, cVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.vo.ChatMessageVO<com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO<*>>");
            }
        }
    }

    /* renamed from: a */
    private final void m136873a(ThreadFooterViewHolder aVar) {
        View view = aVar.f146209n;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        Context context = view.getContext();
        C25649b.m91856a(aVar.mo129383h(), 12);
        C25649b.m91856a(aVar.mo129377b(), 12);
        C25649b.m91856a(aVar.mo129379d(), 12);
        C25649b.m91853a(aVar.mo129378c(), 12);
        C25649b.m91856a(aVar.mo129380e(), 12);
        Drawable drawable = UIUtils.getDrawable(context, R.drawable.ic_svg_message_tag_forward);
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        drawable.setBounds(0, 0, LKUIDisplayManager.m91881c(context, 12), LKUIDisplayManager.m91881c(context, 12));
        aVar.mo129380e().setCompoundDrawables(drawable, null, null, null);
        C25649b.m91856a(aVar.mo129381f(), 12);
        Drawable drawable2 = UIUtils.getDrawable(context, R.drawable.ic_svg_message_tag_reply);
        drawable2.setBounds(0, 0, LKUIDisplayManager.m91881c(context, 12), LKUIDisplayManager.m91881c(context, 12));
        aVar.mo129381f().setCompoundDrawables(drawable2, null, null, null);
    }

    public ChatThreadMessageFooterBlock(AbstractC33342d dVar, AbstractC33307q qVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
        this.f90585c = dVar;
        this.f90583a = qVar;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f90584b = b.mo134586n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadFooterViewHolder aVar, ChatMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        if (cVar != null) {
            m136873a(aVar);
            m136875c(aVar, cVar);
            m136877d(aVar, cVar);
            m136878e(aVar, cVar);
            m136874b(aVar, cVar);
        }
    }

    /* renamed from: b */
    private final void m136874b(ThreadFooterViewHolder aVar, ChatMessageVO<?> cVar) {
        boolean equals$default = StringsKt.equals$default(cVar.mo121700h(), "", false, 2, null);
        aVar.mo129381f().setVisibility(8);
        if (equals$default) {
            int w = cVar.mo121715w();
            if (w > 0) {
                if (w == 1) {
                    aVar.mo129381f().setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatNumReplySinglular, "count", String.valueOf(w)));
                } else {
                    aVar.mo129381f().setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatNumReplyPlural, "count", String.valueOf(w)));
                }
                aVar.mo129381f().setVisibility(0);
                return;
            }
            aVar.mo129381f().setVisibility(8);
        }
    }

    /* renamed from: d */
    private final void m136877d(ThreadFooterViewHolder aVar, ChatMessageVO<?> cVar) {
        String str;
        if (cVar == null || !cVar.mo124242O()) {
            aVar.mo129379d().setVisibility(8);
            aVar.mo129378c().setVisibility(8);
            return;
        }
        Pin E = cVar.mo121659E();
        if (E != null) {
            aVar.mo129379d().setVisibility(0);
            aVar.mo129378c().setVisibility(0);
            Chat n = this.f90585c.mo122550n();
            if (n == null || !n.isP2PChat()) {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Pin_PinDiscriptionInGroup, "user", E.getOperatorDisplayName());
                Intrinsics.checkExpressionValueIsNotNull(str, "UIHelper.mustacheFormat(… pin.operatorDisplayName)");
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Pin_PinDiscriptionInSingleChat, "user", E.getOperatorDisplayName());
                Intrinsics.checkExpressionValueIsNotNull(str, "UIHelper.mustacheFormat(… pin.operatorDisplayName)");
            }
            aVar.mo129379d().setText(str);
            return;
        }
        aVar.mo129379d().setVisibility(8);
        aVar.mo129378c().setVisibility(8);
    }

    /* renamed from: e */
    private final void m136878e(ThreadFooterViewHolder aVar, ChatMessageVO<?> cVar) {
        String str;
        C33973b ad;
        String ae;
        if (!cVar.mo124242O() || cVar.ad() == null) {
            aVar.mo129380e().setVisibility(8);
        } else if (this.f90584b.mo134685a("lark.overseas.forward") || cVar.mo121710r() == Message.Type.AUDIO) {
            String str2 = "";
            if (cVar.af() && (ad = cVar.ad()) != null && ad.mo124230r() && (ae = cVar.ae()) != null) {
                str2 = ae;
            }
            Context d = m136876d();
            String string = UIHelper.getString(R.string.Lark_Chat_MessageForward);
            C33973b ad2 = cVar.ad();
            if (ad2 != null) {
                str = ad2.mo124214g();
            } else {
                str = null;
            }
            SpannableStringBuilder a = C34357v.m133267a(d, string, "{{name}}", str, str2, this.f90585c.mo122544h());
            Intrinsics.checkExpressionValueIsNotNull(a, "SpannableStringUtils.get… chatContext.getChatId())");
            aVar.mo129380e().setMovementMethod(LinkMovementMethod.getInstance());
            aVar.mo129380e().setVisibility(0);
            aVar.mo129380e().setText(a);
        } else {
            aVar.mo129380e().setVisibility(8);
        }
    }

    /* renamed from: c */
    private final void m136875c(ThreadFooterViewHolder aVar, ChatMessageVO<?> cVar) {
        int i;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(1);
        ViewParent parent = aVar.mo129376a().getParent();
        if (parent != null) {
            ((ViewGroup) parent).setLayoutTransition(layoutTransition);
            ContentVO g = cVar.mo121699g();
            if (cVar.mo121698f() || !(g instanceof TranslatableContentVO)) {
                UIUtils.hide(aVar.mo129376a());
                UIUtils.hide(aVar.mo129377b());
                return;
            }
            aVar.mo129383h().setTextColor(C33360a.m129179w(false));
            TranslatableContentVO oVar = (TranslatableContentVO) g;
            if (oVar.mo121926u()) {
                UIUtils.show(aVar.mo129376a());
                UIUtils.hide(aVar.mo129377b());
                aVar.mo129383h().setText(R.string.Lark_Legacy_Ing);
                aVar.mo129376a().setOnClickListener(null);
                if (!aVar.mo129382g().isAnimating()) {
                    aVar.mo129382g().setAnimation(R.raw.anim_translating_for_others);
                    aVar.mo129382g().playAnimation();
                }
            } else {
                if (aVar.mo129382g().isAnimating()) {
                    aVar.mo129382g().cancelAnimation();
                }
                if (AbstractC59357a.f147354c) {
                    UIUtils.hide(aVar.mo129376a());
                } else {
                    UIUtils.hide(aVar.mo129377b());
                }
                if (!TextUtils.isEmpty(oVar.mo121925t())) {
                    int x = oVar.mo121929x();
                    if (x == 2) {
                        i = R.string.Lark_Chat_ViewOriginalMessage;
                    } else if (x != 3) {
                        i = R.string.Lark_Legacy_ChatViewOriginalInfo;
                    } else {
                        i = R.string.Lark_Chat_HideTranslation;
                    }
                    aVar.mo129383h().setText(i);
                    aVar.mo129382g().setImageResource(R.drawable.ic_translate_show_origin_for_others);
                    aVar.mo129376a().setOnClickListener(new View$OnClickListenerC35087b(this, cVar));
                    if (!AbstractC59357a.f147354c) {
                        UIUtils.show(aVar.mo129376a());
                    } else if (!(g instanceof BaseTextContentVO) || C34438a.m133580a((BaseTextContent) ((BaseTextContentVO) g).mo126168z())) {
                        UIUtils.hide(aVar.mo129377b());
                    } else {
                        UIUtils.show(aVar.mo129377b());
                    }
                } else if (cVar.mo121695c() && !cVar.mo124242O() && oVar.mo121928w()) {
                    aVar.mo129383h().setText("");
                    aVar.mo129382g().setImageResource(R.drawable.ic_translate_preview_tag);
                    aVar.mo129376a().setOnClickListener(new View$OnClickListenerC35088c(this, cVar));
                    if (AbstractC59357a.f147354c) {
                        UIUtils.show(aVar.mo129377b());
                    } else {
                        UIUtils.show(aVar.mo129376a());
                    }
                } else if (AbstractC59357a.f147354c) {
                    UIUtils.hide(aVar.mo129377b());
                } else {
                    UIUtils.hide(aVar.mo129376a());
                }
            }
            aVar.mo129377b().setOnClickListener(new View$OnClickListenerC35089d(this, cVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
