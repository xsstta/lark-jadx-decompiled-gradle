package com.ss.android.lark.chat.topnoticemessage.p1685c;

import androidx.lifecycle.C1177w;
import com.ss.android.lark.chat.chatwindow.biz.plugin.MessageTopNoticePlugin;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.statistics.chat.ChatHitPointExtraParams;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0004H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\f\u0010\n\u001a\u00020\b*\u00020\u0004H\u0000\u001a \u0010\u000b\u001a\u00020\b*\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\f\u0010\u0010\u001a\u00020\b*\u00020\u0004H\u0000\u001a\f\u0010\u0011\u001a\u00020\b*\u00020\u0004H\u0000\u001a \u0010\u0012\u001a\u00020\b*\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0014H\u0002¨\u0006\u0015"}, d2 = {"getCurrentTopNoticeMsgCommonExtra", "", "", "", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin;", "getPinTopOwnerParam", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendBannerClickEvent", "", "click", "sendBannerShowEvent", "sendMsgPinTopEvent", "item", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "info", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$InnerMenuInfo;", "sendMsgUnPinTopConfirmClick", "sendMsgUnPinTopConfirmView", "sendShowEvent", "action", "Lkotlin/Function1;", "im_chat_chat_productionUsRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.c.b */
public final class C34321b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/statistics/extensions/IParam;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.c.b$a */
    static final class C34322a extends Lambda implements Function1<IParam, Unit> {
        public static final C34322a INSTANCE = new C34322a();

        C34322a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IParam cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            ChatHitPointNew.f135660c.mo187399d(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/statistics/extensions/IParam;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.c.b$b */
    static final class C34323b extends Lambda implements Function1<IParam, Unit> {
        public static final C34323b INSTANCE = new C34323b();

        C34323b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IParam cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            ChatHitPointNew.f135660c.mo187401f(cVar);
        }
    }

    /* renamed from: a */
    public static final void m133056a(MessageTopNoticePlugin cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$sendMsgUnPinTopConfirmView");
        m133059a(cVar, C34323b.INSTANCE);
    }

    /* renamed from: b */
    public static final void m133060b(MessageTopNoticePlugin cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$sendBannerShowEvent");
        m133059a(cVar, C34322a.INSTANCE);
    }

    /* renamed from: c */
    public static final void m133061c(MessageTopNoticePlugin cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$sendMsgUnPinTopConfirmClick");
        if (cVar.mo122173h()) {
            ChatHitPointExtraParams.Click click = ChatHitPointExtraParams.Click.CONFIRM;
            ChatHitPointExtraParams.Target target = ChatHitPointExtraParams.Target.IM_CHAT_MAIN_VIEW;
            IParam d = m133062d(cVar);
            ChatHitPointNew.f135660c.mo187402g(C54952a.m213204a(click.plus(target).plus(d), m133063e(cVar)));
        }
    }

    /* renamed from: d */
    private static final IParam m133062d(MessageTopNoticePlugin cVar) {
        String str;
        ChatHitPointExtraParams.IsPinToTopOwner isPinToTopOwner;
        C1177w<ITopNoticeMessage<?>> a;
        ITopNoticeMessage<?> b;
        Chatter a2;
        MessageTopNoticeModel b2 = cVar.mo122166b();
        if (b2 == null || (a = b2.mo126857a()) == null || (b = a.mo5927b()) == null || (a2 = b.mo126895a()) == null) {
            str = null;
        } else {
            str = a2.getId();
        }
        AbstractC36450aa c = cVar.mo122168c();
        Intrinsics.checkExpressionValueIsNotNull(c, "loginDependency");
        if (Intrinsics.areEqual(str, c.mo134394a())) {
            isPinToTopOwner = ChatHitPointExtraParams.IsPinToTopOwner.TRUE;
        } else {
            isPinToTopOwner = ChatHitPointExtraParams.IsPinToTopOwner.FALSE;
        }
        return isPinToTopOwner;
    }

    /* renamed from: e */
    private static final Map<String, Object> m133063e(MessageTopNoticePlugin cVar) {
        Object obj;
        C1177w<ITopNoticeMessage<?>> a;
        ITopNoticeMessage<?> b;
        if (!cVar.mo122173h()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MessageTopNoticeModel b2 = cVar.mo122166b();
        if (b2 == null || (a = b2.mo126857a()) == null || (b = a.mo5927b()) == null) {
            obj = null;
        } else {
            obj = b.mo126900f();
        }
        Map<String, Object> b3 = ChatParamUtils.m133148b();
        if (b3 == null) {
            b3 = MapsKt.emptyMap();
        }
        linkedHashMap.putAll(b3);
        if (obj instanceof Message) {
            linkedHashMap.putAll(ChatParamUtils.f88665a.mo126913a((Message) obj));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static final void m133059a(MessageTopNoticePlugin cVar, Function1<? super IParam, Unit> function1) {
        if (cVar.mo122173h()) {
            function1.invoke(C54952a.m213204a(m133062d(cVar), m133063e(cVar)));
        }
    }

    /* renamed from: a */
    public static final void m133058a(MessageTopNoticePlugin cVar, IParam cVar2) {
        TARGET_NONE eVar;
        Intrinsics.checkParameterIsNotNull(cVar, "$this$sendBannerClickEvent");
        Intrinsics.checkParameterIsNotNull(cVar2, "click");
        Map<String, Object> e = m133063e(cVar);
        if (cVar2 == ChatHitPointExtraParams.Click.PIN_TO_TOP_OWNER) {
            eVar = ChatHitPointExtraParams.Target.PROFILE_MAIN_VIEW;
        } else if (cVar2 == ChatHitPointExtraParams.Click.CLICK_PIN_TO_TOP) {
            eVar = ChatHitPointExtraParams.Target.IM_CHAT_MAIN_VIEW;
        } else {
            eVar = TARGET_NONE.f135700a;
        }
        ChatHitPointNew.f135660c.mo187400e(C54952a.m213205a(e, cVar2).plus(eVar).plus(m133062d(cVar)));
    }

    /* renamed from: a */
    public static final void m133057a(MessageTopNoticePlugin cVar, ChatMessageVO<?> cVar2, MessageTopNoticePlugin.InnerMenuInfo bVar) {
        ChatHitPointExtraParams.HavePinToTop havePinToTop;
        ChatHitPointExtraParams.Status status;
        Intrinsics.checkParameterIsNotNull(cVar, "$this$sendMsgPinTopEvent");
        Intrinsics.checkParameterIsNotNull(cVar2, "item");
        Intrinsics.checkParameterIsNotNull(bVar, "info");
        Map<String, Object> b = ChatParamUtils.m133148b();
        Map<String, Object> a = ChatParamUtils.f88665a.mo126912a(cVar2);
        ChatHitPointExtraParams.Click click = ChatHitPointExtraParams.Click.PIN_TO_TOP;
        TARGET_NONE eVar = TARGET_NONE.f135700a;
        if (cVar.mo122173h()) {
            havePinToTop = ChatHitPointExtraParams.HavePinToTop.TRUE;
        } else {
            havePinToTop = ChatHitPointExtraParams.HavePinToTop.FALSE;
        }
        if (bVar.mo122174a()) {
            status = ChatHitPointExtraParams.Status.PIN_TO_TOP;
        } else {
            status = ChatHitPointExtraParams.Status.UNPIN_TO_TOP;
        }
        ChatHitPointNew.f135660c.mo187394b(C54952a.m213204a(C54952a.m213204a(click.plus(eVar).plus(havePinToTop).plus(status), b), a));
    }
}
