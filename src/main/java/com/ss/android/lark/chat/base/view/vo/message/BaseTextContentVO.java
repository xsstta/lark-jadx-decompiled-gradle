package com.ss.android.lark.chat.base.view.vo.message;

import android.text.Layout;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.tangram.base.render.Render;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001EB\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\b\u0010@\u001a\u00020\u0014H\u0016J\b\u0010A\u001a\u00020\u0014H&J\u0016\u0010B\u001a\u00020\u00142\f\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010DH\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\fR\u001c\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001d\u00106\u001a\u0004\u0018\u0001078FX\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u001d\u0010<\u001a\u0004\u0018\u00010\b8FX\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b=\u0010>¨\u0006F"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/BaseTextContentVO;", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseTextContent;", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/BaseTextContent;)V", "atBotIds", "", "", "getAtBotIds", "()Ljava/util/List;", "setAtBotIds", "(Ljava/util/List;)V", "contentLayout", "Landroid/text/Layout;", "getContentLayout", "()Landroid/text/Layout;", "setContentLayout", "(Landroid/text/Layout;)V", "copyFromTranslation", "", "getCopyFromTranslation", "()Z", "setCopyFromTranslation", "(Z)V", "isEnableEllipsize", "setEnableEllipsize", "maxHeightFactor", "", "getMaxHeightFactor", "()D", "setMaxHeightFactor", "(D)V", "maxLine", "", "getMaxLine", "()I", "setMaxLine", "(I)V", "partialCopyText", "", "getPartialCopyText", "()Ljava/lang/CharSequence;", "setPartialCopyText", "(Ljava/lang/CharSequence;)V", "readAtChatterIds", "getReadAtChatterIds", "setReadAtChatterIds", "render", "Lcom/ss/android/lark/tangram/base/render/Render;", "getRender", "()Lcom/ss/android/lark/tangram/base/render/Render;", "setRender", "(Lcom/ss/android/lark/tangram/base/render/Render;)V", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "richText$delegate", "Lkotlin/Lazy;", "textInMemory", "getTextInMemory", "()Ljava/lang/String;", "textInMemory$delegate", "canReply", "hasDocInfo", "isContentSame", "diffable", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "PreviewType", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseTextContentVO<T extends BaseTextContent<T>> extends TranslatableContentVO<T> {

    /* renamed from: a */
    private final Lazy f84775a;

    /* renamed from: b */
    private final Lazy f84776b;

    /* renamed from: c */
    private List<String> f84777c = new ArrayList();

    /* renamed from: d */
    private List<String> f84778d = new ArrayList();

    /* renamed from: e */
    private int f84779e;

    /* renamed from: f */
    private boolean f84780f;

    /* renamed from: g */
    private double f84781g;

    /* renamed from: h */
    private transient CharSequence f84782h;

    /* renamed from: i */
    private transient boolean f84783i;

    /* renamed from: j */
    private transient Layout f84784j;

    /* renamed from: k */
    private Render f84785k;

    @Target({ElementType.TYPE, ElementType.METHOD})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.TYPE, AnnotationTarget.FUNCTION})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/BaseTextContentVO$PreviewType;", "", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface PreviewType {
        public static final Companion Companion = Companion.f84786a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/BaseTextContentVO$PreviewType$Companion;", "", "()V", "DOC", "", "LOCAL", "NET", "NORMAL", GrsBaseInfo.CountryCodeSource.UNKNOWN, "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO$PreviewType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f84786a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: a */
    public final RichText mo121772a() {
        return (RichText) this.f84775a.getValue();
    }

    /* renamed from: b */
    public final String mo121781b() {
        return (String) this.f84776b.getValue();
    }

    /* renamed from: l */
    public abstract boolean mo121792l();

    /* renamed from: c */
    public final List<String> mo121784c() {
        return this.f84777c;
    }

    /* renamed from: d */
    public final List<String> mo121785d() {
        return this.f84778d;
    }

    /* renamed from: e */
    public final boolean mo121786e() {
        return this.f84780f;
    }

    /* renamed from: f */
    public final double mo121787f() {
        return this.f84781g;
    }

    /* renamed from: g */
    public final CharSequence mo121788g() {
        return this.f84782h;
    }

    /* renamed from: h */
    public final boolean mo121789h() {
        return this.f84783i;
    }

    /* renamed from: j */
    public final Layout mo121790j() {
        return this.f84784j;
    }

    /* renamed from: k */
    public final Render mo121791k() {
        return this.f84785k;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/richtext/RichText;", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseTextContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO$a */
    static final class C32950a extends Lambda implements Function0<RichText> {
        final /* synthetic */ BaseTextContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32950a(BaseTextContent baseTextContent) {
            super(0);
            this.$content = baseTextContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RichText invoke() {
            return this.$content.getRichText();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/entity/message/content/BaseTextContent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO$b */
    static final class C32951b extends Lambda implements Function0<String> {
        final /* synthetic */ BaseTextContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32951b(BaseTextContent baseTextContent) {
            super(0);
            this.$content = baseTextContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String textInMemory = this.$content.getTextInMemory();
            if (TextUtils.isEmpty(this.$content.getTextInMemory()) && this.$content.getRichText() != null) {
                textInMemory = C59035h.m229211b(this.$content.getRichText());
            }
            if (textInMemory != null) {
                return textInMemory;
            }
            return "";
        }
    }

    /* renamed from: a */
    public final void mo121773a(double d) {
        this.f84781g = d;
    }

    /* renamed from: b */
    public final void mo121783b(boolean z) {
        this.f84783i = z;
    }

    /* renamed from: a */
    public final void mo121774a(int i) {
        this.f84779e = i;
    }

    /* renamed from: b */
    public final void mo121782b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f84778d = list;
    }

    /* renamed from: a */
    public final void mo121775a(Layout layout) {
        this.f84784j = layout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseTextContentVO(T t) {
        super(t);
        Intrinsics.checkParameterIsNotNull(t, "content");
        this.f84775a = LazyKt.lazy(new C32950a(t));
        this.f84776b = LazyKt.lazy(new C32951b(t));
    }

    /* renamed from: a */
    public final void mo121776a(Render dVar) {
        this.f84785k = dVar;
    }

    /* renamed from: a */
    public final void mo121777a(CharSequence charSequence) {
        this.f84782h = charSequence;
    }

    /* renamed from: a */
    public final void mo121778a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f84777c = list;
    }

    /* renamed from: a */
    public final void mo121779a(boolean z) {
        this.f84780f = z;
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO, com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || !(aVar instanceof BaseTextContentVO)) {
            return false;
        }
        BaseTextContentVO baseTextContentVO = (BaseTextContentVO) aVar;
        if (!C26247a.m94981a(mo121772a(), baseTextContentVO.mo121772a()) || !C26247a.m94981a(mo121781b(), baseTextContentVO.mo121781b()) || this.f84779e != baseTextContentVO.f84779e || this.f84780f != baseTextContentVO.f84780f || this.f84781g != baseTextContentVO.f84781g || !C26247a.m94981a((Object) this.f84777c, (Object) baseTextContentVO.f84777c) || !C26247a.m94981a((Object) this.f84778d, (Object) baseTextContentVO.f84778d)) {
            return false;
        }
        return true;
    }
}
