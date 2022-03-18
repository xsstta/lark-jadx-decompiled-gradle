package com.ss.android.lark.statistics.chat;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.statistics.chat.ChatHitPointExtraParams;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ss.android.lark.statistics.chat.d */
public final class C54948d {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, Function1<Message, Unit>> f135662a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentLinkedQueue<Function1<Message, Unit>> f135663b = new ConcurrentLinkedQueue<>();

    /* renamed from: com.ss.android.lark.statistics.chat.d$a */
    public static final class C54949a extends Lambda implements Function1<Message, Unit> {
        final /* synthetic */ ChatHitPointExtraParams.Click $click;
        final /* synthetic */ ChatHitPointExtraParams.IsFullScreen $fullScreen;
        final /* synthetic */ boolean $isThread;
        final /* synthetic */ TARGET_NONE $target;
        final /* synthetic */ ChatHitPointExtraParams.Type $type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54949a(boolean z, ChatHitPointExtraParams.Click click, TARGET_NONE eVar, ChatHitPointExtraParams.Type type, ChatHitPointExtraParams.IsFullScreen isFullScreen) {
            super(1);
            this.$isThread = z;
            this.$click = click;
            this.$target = eVar;
            this.$type = type;
            this.$fullScreen = isFullScreen;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Message message) {
            invoke(message);
            return Unit.INSTANCE;
        }

        public final void invoke(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "it");
            String str = message.getcId();
            Intrinsics.checkExpressionValueIsNotNull(str, "it.getcId()");
            C54948d.f135662a.put(str, new Function1<Message, Unit>(this) {
                /* class com.ss.android.lark.statistics.chat.C54948d.C54949a.C549501 */
                final /* synthetic */ C54949a this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Message message) {
                    invoke(message);
                    return Unit.INSTANCE;
                }

                public final void invoke(Message message) {
                    boolean z;
                    String str;
                    Intrinsics.checkParameterIsNotNull(message, "realMsg");
                    Map mutableMap = MapsKt.toMutableMap(ChatParamUtils.f88665a.mo126913a(message));
                    if (this.this$0.$isThread) {
                        String rootId = message.getRootId();
                        Intrinsics.checkExpressionValueIsNotNull(rootId, "realMsg.rootId");
                        boolean z2 = true;
                        if (rootId.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str = message.getId();
                        } else {
                            str = message.getRootId();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(str, "threadId");
                        if (str.length() <= 0) {
                            z2 = false;
                        }
                        if (z2) {
                            mutableMap.put("thread_id", str);
                        }
                    }
                    ChatHitPointNew.f135660c.mo187386a(C54952a.m213204a(this.this$0.$click.plus(this.this$0.$target).plus(this.this$0.$type).plus(this.this$0.$fullScreen), mutableMap));
                }
            });
        }
    }

    /* renamed from: a */
    public static final void m213136a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "preMessage");
        Function1<Message, Unit> poll = f135663b.poll();
        if (poll != null) {
            poll.invoke(message);
        }
    }

    /* renamed from: b */
    public static final void m213139b(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "realMessage");
        Function1<Message, Unit> remove = f135662a.remove(message.getcId());
        if (remove != null) {
            remove.invoke(message);
        }
    }

    /* renamed from: a */
    public static final void m213137a(boolean z, boolean z2, boolean z3) {
        ChatHitPointExtraParams.Type type;
        ChatHitPointExtraParams.IsFullScreen isFullScreen;
        ChatHitPointExtraParams.Click click = ChatHitPointExtraParams.Click.INPUT_BOX_MSG_SEND;
        TARGET_NONE eVar = TARGET_NONE.f135700a;
        if (z) {
            type = ChatHitPointExtraParams.Type.BUTTON_SEND;
        } else {
            type = ChatHitPointExtraParams.Type.HOTKEY_SEND;
        }
        if (z2) {
            isFullScreen = ChatHitPointExtraParams.IsFullScreen.TRUE;
        } else {
            isFullScreen = ChatHitPointExtraParams.IsFullScreen.FALSE;
        }
        f135663b.offer(new C54949a(z3, click, eVar, type, isFullScreen));
    }

    /* renamed from: a */
    public static /* synthetic */ void m213138a(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        m213137a(z, z2, z3);
    }
}
