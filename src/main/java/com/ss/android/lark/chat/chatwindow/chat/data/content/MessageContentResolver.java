package com.ss.android.lark.chat.chatwindow.chat.data.content;

import android.text.TextUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.richtext.C59031e;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH$J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\fH&J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00070\u0014¢\u0006\u0002\b\u001f2\u0006\u0010\u000b\u001a\u00020\fR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/content/MessageContentResolver;", "", "()V", "mLoginDependency", "Lcom/ss/android/lark/dependency/ILoginDependency;", "getMLoginDependency", "()Lcom/ss/android/lark/dependency/ILoginDependency;", "mLoginDependency$delegate", "Lkotlin/Lazy;", "getDocResult", "Lcom/ss/android/lark/doc/entity/DocResult;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "getMessageMentionChatterIds", "", "", "getMessageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getMessageText", "getMessageTextLength", "", "getPreviewHangPoint", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "getUrlCount", "getUrlPreview", "Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "hasReaction", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "isMessageMentioned", "Lcom/ss/android/lark/chat/chatwindow/chat/data/content/MessageContentResolver$AtStyle;", "AtStyle", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class MessageContentResolver {

    /* renamed from: a */
    private final Lazy f85519a = LazyKt.lazy(C33232a.INSTANCE);

    @Target({ElementType.TYPE, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/content/MessageContentResolver$AtStyle;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface AtStyle {
        public static final Companion Companion = Companion.f85520a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/content/MessageContentResolver$AtStyle$Companion;", "", "()V", "AT_ALL_FROM_ME", "", "AT_SOME_ELSE", "NONE", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.content.MessageContentResolver$AtStyle$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f85520a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: a */
    public final AbstractC36450aa mo122519a() {
        return (AbstractC36450aa) this.f85519a.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo122520a(Message message);

    /* renamed from: b */
    public abstract RichText mo122521b(Message message);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/dependency/ILoginDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.content.MessageContentResolver$a */
    static final class C33232a extends Lambda implements Function0<AbstractC36450aa> {
        public static final C33232a INSTANCE = new C33232a();

        C33232a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC36450aa invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134515N();
        }
    }

    /* renamed from: c */
    public final int mo122522c(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        return mo122520a(message).length();
    }

    /* renamed from: d */
    public final int mo122523d(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        String a = mo122520a(message);
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        if (C57814c.m224348a(a) && C57814c.m224349a(a, mo122519a().mo134394a())) {
            return 2;
        }
        if (!C57814c.m224351b(a) || !message.isFromMe()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: e */
    public final List<String> mo122524e(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        ArrayList arrayList = new ArrayList();
        Message.Type type = message.getType();
        if (type == Message.Type.TEXT || type == Message.Type.POST) {
            ArrayList<String> a = C59031e.m229178a(mo122521b(message), false);
            Intrinsics.checkExpressionValueIsNotNull(a, "RichTextHelper.getAtChatterId(richText, false)");
            arrayList.addAll(a);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            arrayList.remove(N.mo134394a());
            arrayList.remove("1");
        }
        return arrayList;
    }
}
