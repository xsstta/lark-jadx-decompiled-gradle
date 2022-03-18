package com.ss.android.lark.message.card;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.GetUuidRequest;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.message.card.p2263c.C45295a;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/message/card/CardMessageUtils;", "", "()V", "Companion", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.message.card.b */
public final class CardMessageUtils {

    /* renamed from: a */
    public static final Companion f114651a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/message/card/CardMessageUtils$Companion;", "", "()V", "TAG", "", "getTriggerCode", "", "callback", "Lkotlin/Function1;", "getUrlWithTriggerCode", "url", "triggerCode", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.message.card.b$a$a */
        public static final class RunnableC45289a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ GetUuidRequest.C18669a f114652a;

            /* renamed from: b */
            final /* synthetic */ Function1 f114653b;

            RunnableC45289a(GetUuidRequest.C18669a aVar, Function1 function1) {
                this.f114652a = aVar;
                this.f114653b = function1;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/message/card/CardMessageUtils$Companion$getTriggerCode$1$2$1"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.message.card.b$a$a$a */
            static final class RunnableC45291a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ String f114655a;

                /* renamed from: b */
                final /* synthetic */ RunnableC45289a f114656b;

                RunnableC45291a(String str, RunnableC45289a aVar) {
                    this.f114655a = str;
                    this.f114656b = aVar;
                }

                public final void run() {
                    this.f114656b.f114653b.invoke(this.f114655a);
                }
            }

            public final void run() {
                UICallbackExecutor.execute(new RunnableC45291a((String) SdkSender.syncSend(Command.GET_UUID, this.f114652a, C452901.f114654a), this));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo159996a(Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "callback");
            GetUuidRequest.C18669a aVar = new GetUuidRequest.C18669a();
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC45289a(aVar, function1));
        }

        /* renamed from: a */
        public final String mo159995a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(str2, "triggerCode");
            return new C45295a().mo160041a(str, str2);
        }
    }
}
