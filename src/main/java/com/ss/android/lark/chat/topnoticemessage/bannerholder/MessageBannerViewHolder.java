package com.ss.android.lark.chat.topnoticemessage.bannerholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMsgType;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H&J\u001b\u0010$\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\b&J\u001b\u0010'\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\b(J\u0019\u0010)\u001a\u00020\t*\u00028\u00002\u0006\u0010*\u001a\u00020\u0013H&¢\u0006\u0002\u0010+J\u0011\u0010,\u001a\u00020-*\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\u0011\u0010/\u001a\u000200*\u00028\u0000H\u0016¢\u0006\u0002\u00101R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\rR\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/bannerholder/MessageBannerViewHolder;", "M", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bannerClickHandler", "Lkotlin/Function0;", "", "getBannerClickHandler", "()Lkotlin/jvm/functions/Function0;", "setBannerClickHandler", "(Lkotlin/jvm/functions/Function0;)V", "chatterSpanClicked", "", "getContext", "()Landroid/content/Context;", "iconView", "Landroid/widget/ImageView;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "stickerClickHandler", "getStickerClickHandler", "setStickerClickHandler", "subTitleView", "Landroid/widget/TextView;", "titleView", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView;", "bindBanner", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;)V", "layoutId", "", "onBannerStickerClick", "clickHandler", "onBannerStickerClick$im_chat_chat_productionUsRelease", "onBannerViewClick", "onBannerViewClick$im_chat_chat_productionUsRelease", "icon", "imageView", "(Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;Landroid/widget/ImageView;)V", "subTitle", "Landroid/text/SpannedString;", "(Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;)Landroid/text/SpannedString;", "title", "", "(Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;)Ljava/lang/CharSequence;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.b.c */
public abstract class MessageBannerViewHolder<M extends ITopNoticeMessage<?>> {

    /* renamed from: a */
    private Function0<Unit> f88615a = C34318a.INSTANCE;

    /* renamed from: b */
    public boolean f88616b;

    /* renamed from: c */
    private Function0<Unit> f88617c = C34319b.INSTANCE;

    /* renamed from: d */
    private final View f88618d;

    /* renamed from: e */
    private final ImageView f88619e;

    /* renamed from: f */
    private final LinkEmojiTextView f88620f;

    /* renamed from: g */
    private final TextView f88621g;

    /* renamed from: h */
    private final Context f88622h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "M", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b.c$a */
    static final class C34318a extends Lambda implements Function0<Unit> {
        public static final C34318a INSTANCE = new C34318a();

        C34318a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "M", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.b.c$b */
    static final class C34319b extends Lambda implements Function0<Unit> {
        public static final C34319b INSTANCE = new C34319b();

        C34319b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    /* renamed from: a */
    public abstract int mo126874a();

    /* renamed from: a */
    public abstract void mo126875a(M m, ImageView imageView);

    /* renamed from: b */
    public final Function0<Unit> mo126881b() {
        return this.f88615a;
    }

    /* renamed from: c */
    public final View mo126884c() {
        return this.f88618d;
    }

    /* renamed from: d */
    public final Context mo126885d() {
        return this.f88622h;
    }

    /* renamed from: b */
    public final void mo126882b(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "clickHandler");
        this.f88617c = function0;
    }

    /* renamed from: a */
    public final void mo126879a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "clickHandler");
        this.f88615a = function0;
    }

    /* renamed from: b */
    public CharSequence mo126880b(M m) {
        Intrinsics.checkParameterIsNotNull(m, "$this$title");
        return m.mo126898d();
    }

    /* renamed from: a */
    public void mo126876a(M m) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(m, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        mo126875a(m, this.f88619e);
        LinkEmojiTextView linkEmojiTextView = this.f88620f;
        if (m.mo126896b() != TopNoticeMsgType.LuckyMoney) {
            z = true;
        } else {
            z = false;
        }
        linkEmojiTextView.setTranslateEmojiCode(z);
        this.f88620f.setText(mo126880b(m));
        this.f88621g.setText(mo126883c(m));
    }

    /* renamed from: c */
    public SpannedString mo126883c(M m) {
        Intrinsics.checkParameterIsNotNull(m, "$this$subTitle");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) UIHelper.mustacheFormat(UIHelper.getString(R.string.Lark_IMChatPin_UserPinnedGroupAnnounment_Text), "name", C34340h.m133174a(m.mo126895a(), ChatterNameDisplayRule.ALIAS_NICKNAME_NAME)));
        return new SpannedString(spannableStringBuilder);
    }

    public MessageBannerViewHolder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f88622h = context;
        View inflate = LayoutInflater.from(context).inflate(mo126874a(), (ViewGroup) null, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(layoutId(), null, false)");
        Intrinsics.checkExpressionValueIsNotNull(inflate, "kotlin.run {\n        val…tId(), null, false)\n    }");
        this.f88618d = inflate;
        View findViewById = inflate.findViewById(R.id.icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.icon)");
        ImageView imageView = (ImageView) findViewById;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "kotlin.run {\n        ite…ViewById(R.id.icon)\n    }");
        this.f88619e = imageView;
        View findViewById2 = inflate.findViewById(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.title)");
        LinkEmojiTextView linkEmojiTextView = (LinkEmojiTextView) findViewById2;
        Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView, "kotlin.run {\n        ite…iewById(R.id.title)\n    }");
        this.f88620f = linkEmojiTextView;
        View findViewById3 = inflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) findViewById3;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById<Te…d.getInstance()\n        }");
        Intrinsics.checkExpressionValueIsNotNull(textView, "kotlin.run {\n        ite…nstance()\n        }\n    }");
        this.f88621g = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.chat.topnoticemessage.bannerholder.MessageBannerViewHolder.View$OnClickListenerC343171 */

            /* renamed from: a */
            final /* synthetic */ MessageBannerViewHolder f88623a;

            {
                this.f88623a = r1;
            }

            public final void onClick(View view) {
                if (this.f88623a.f88616b) {
                    this.f88623a.f88616b = false;
                } else {
                    this.f88623a.mo126881b().invoke();
                }
            }
        });
    }
}
