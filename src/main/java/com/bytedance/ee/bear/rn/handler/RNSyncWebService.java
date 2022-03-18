package com.bytedance.ee.bear.rn.handler;

import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/RNSyncWebService;", "Lcom/bytedance/ee/bear/browser/BaseWebService;", "()V", "onAttachToWeb", "", "provider", "Lcom/bytedance/ee/bear/browser/ServiceProvider;", "web", "Lcom/bytedance/ee/bear/browser/Web;", "Companion", "GetStatusHandler", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.handler.c */
public final class RNSyncWebService extends C4918a {

    /* renamed from: a */
    public static final String f28561a = (f28566f + "sendMessage");

    /* renamed from: b */
    public static final String f28562b = (f28566f + "handleMessage");

    /* renamed from: c */
    public static final String f28563c = f28563c;

    /* renamed from: d */
    public static final String f28564d = f28564d;

    /* renamed from: e */
    public static final Companion f28565e = new Companion(null);

    /* renamed from: f */
    private static final String f28566f = f28566f;

    /* renamed from: g */
    private static final String f28567g = (f28566f + "reload");

    /* renamed from: h */
    private static final String f28568h = (f28566f + "getRnStatus");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/RNSyncWebService$Companion;", "", "()V", "BIZ_COMMENT_ON_MESSAGE", "", "getBIZ_COMMENT_ON_MESSAGE", "()Ljava/lang/String;", "BIZ_COMMENT_POST_MESSAGE", "getBIZ_COMMENT_POST_MESSAGE", "BIZ_RN_BASE", "BIZ_RN_GET_STATUS", "BIZ_RN_HANDLEMESSAGE", "getBIZ_RN_HANDLEMESSAGE", "BIZ_RN_RELOAD", "BIZ_RN_SENDMESSAGE", "getBIZ_RN_SENDMESSAGE", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.handler.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo40357a() {
            return RNSyncWebService.f28563c;
        }

        /* renamed from: b */
        public final String mo40358b() {
            return RNSyncWebService.f28564d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/RNSyncWebService$GetStatusHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerRunOnNotUIThread;", "", "()V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.handler.c$b */
    private static final class GetStatusHandler implements AbstractC7944c<Object> {
        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            C13479a.m54758a("GetStatusHandler", "handle");
            if (hVar != null) {
                hVar.mo17190a(RnSyncManager.f28587a.mo40382b());
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "provider");
        Intrinsics.checkParameterIsNotNull(iVar, "web");
        super.mo19340a(gVar, iVar);
        mo19344a(f28561a, new SendMessageHandler());
        mo19344a(f28562b, new HandleMessageHandler());
        mo19344a(f28563c, new SendMessageHandler());
        mo19344a(f28564d, new CommentHandleMessageHandler());
        mo19344a(f28567g, new ReloadHandler());
        mo19344a(f28568h, new GetStatusHandler());
    }
}
