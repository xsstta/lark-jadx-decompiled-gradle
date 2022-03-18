package com.bytedance.ee.bear.rn.handler;

import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/SendMessageHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerRunOnNotUIThread;", "", "()V", "shouldCallback", "", "getShouldCallback", "()Z", "setShouldCallback", "(Z)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.handler.h */
public class SendMessageHandler implements AbstractC7944c<String> {

    /* renamed from: a */
    public static final Companion f28578a = new Companion(null);

    /* renamed from: c */
    private static final String f28579c = f28579c;

    /* renamed from: b */
    private boolean f28580b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/SendMessageHandler$Companion;", "", "()V", "TAG", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.handler.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo40368a(boolean z) {
        this.f28580b = z;
    }

    /* renamed from: a */
    public void handle(String str, AbstractC7947h hVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        String str2 = f28579c;
        StringBuilder sb = new StringBuilder();
        sb.append("handle()... data nul is ");
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b(str2, sb.toString());
        if (str != null) {
            RnSyncManager.m44272c(str);
        } else if (this.f28580b) {
            hVar.mo17190a("{}");
        }
    }
}
