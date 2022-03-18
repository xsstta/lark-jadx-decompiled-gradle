package com.ss.android.lark.chat.chatwindow.chat.data.reply;

import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J$\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/BaseReplyMsgDigestCreator;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/IReplyMsgDigestCreator;", "()V", "mLoginDependency", "Lcom/ss/android/lark/dependency/ILoginDependency;", "getMLoginDependency", "()Lcom/ss/android/lark/dependency/ILoginDependency;", "mLoginDependency$delegate", "Lkotlin/Lazy;", "buildDigest", "", "replyChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "replyMsgInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "showPostReplyPrefix", "", "getDeleteMsgDigest", "", "chatter", "getReplyMsgDigest", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.a */
public abstract class BaseReplyMsgDigestCreator implements IReplyMsgDigestCreator {

    /* renamed from: a */
    private final Lazy f85504a = LazyKt.lazy(C33225a.INSTANCE);

    /* renamed from: a */
    public final AbstractC36450aa mo122507a() {
        return (AbstractC36450aa) this.f85504a.getValue();
    }

    /* renamed from: b */
    public abstract CharSequence mo122509b(Chatter chatter, MessageInfo messageInfo, boolean z);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/dependency/ILoginDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.a$a */
    static final class C33225a extends Lambda implements Function0<AbstractC36450aa> {
        public static final C33225a INSTANCE = new C33225a();

        C33225a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC36450aa invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134515N();
        }
    }

    /* renamed from: a */
    private final String m128456a(Chatter chatter) {
        if (chatter == null) {
            return null;
        }
        String str = UIHelper.getString(R.string.Lark_Legacy_ReplyNow).toString() + " ";
        if (!Intrinsics.areEqual(chatter.getId(), mo122507a().mo134394a())) {
            return str + UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Deletetip, "name", C34340h.m133174a(chatter, ChatterNameDisplayRule.NICKNAME_NAME));
        }
        return str + UIHelper.getString(R.string.Lark_Legacy_DeleteTipByYourself);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.reply.IReplyMsgDigestCreator
    /* renamed from: a */
    public CharSequence mo122508a(Chatter chatter, MessageInfo messageInfo, boolean z) {
        if (messageInfo == null) {
            return UIHelper.getString(R.string.Lark_Legacy_ReplyNow).toString() + " ";
        }
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "replyMsgInfo.getMessage()");
        if (message.getStatus() == Message.Status.DELETED) {
            return m128456a(chatter);
        }
        return mo122509b(chatter, messageInfo, z);
    }
}
