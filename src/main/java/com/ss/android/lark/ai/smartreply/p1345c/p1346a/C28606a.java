package com.ss.android.lark.ai.smartreply.p1345c.p1346a;

import ai.v1.ClientMessengerContext;
import ai.v1.GetSmartComposeRequest;
import ai.v1.GetSmartComposeResponse;
import com.bytedance.lark.pb.ai.v1.GetSmartReplyRequest;
import com.bytedance.lark.pb.ai.v1.GetSmartReplyResponse;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.smartcompose.p1341a.C28580a;
import com.ss.android.lark.ai.smartreply.dto.C28616a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyRequest;
import com.ss.android.lark.ai.smartreply.p1344b.C28600a;
import com.ss.android.lark.ai.smartreply.p1345c.AbstractC28605a;
import com.ss.android.lark.pb.ai.AIGetTextCorrectionRequest;
import com.ss.android.lark.pb.ai.AIGetTextCorrectionResponse;
import com.ss.android.lark.sdk.SdkSender;
import java.util.Collections;

/* renamed from: com.ss.android.lark.ai.smartreply.c.a.a */
public class C28606a implements AbstractC28605a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ai.smartreply.c.a.a$a */
    public static final class C28609a {

        /* renamed from: a */
        public static final C28606a f71990a = new C28606a();
    }

    private C28606a() {
    }

    /* renamed from: a */
    public static C28606a m104900a() {
        return C28609a.f71990a;
    }

    @Override // com.ss.android.lark.ai.smartreply.p1345c.AbstractC28605a
    /* renamed from: a */
    public void mo101821a(SmartReplyRequest smartReplyRequest, final IGetDataCallback<C28616a> iGetDataCallback) {
        Command command = Command.GET_SMART_REPLY;
        GetSmartReplyRequest.C14625a a = new GetSmartReplyRequest.C14625a().mo53960b(smartReplyRequest.mo101852c()).mo53961c(smartReplyRequest.mo101853d()).mo53958a(smartReplyRequest.mo101854e()).mo53957a(GetSmartReplyRequest.Scene.fromValue(smartReplyRequest.mo101851b().getValue()));
        C286071 r1 = new IGetDataCallback<GetSmartReplyResponse>() {
            /* class com.ss.android.lark.ai.smartreply.p1345c.p1346a.C28606a.C286071 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetSmartReplyResponse getSmartReplyResponse) {
                C28616a a = C28600a.m104873a(getSmartReplyResponse);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(a);
                }
            }
        };
        ProtoAdapter<GetSmartReplyResponse> protoAdapter = GetSmartReplyResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, r1, new SdkSender.IParser() {
            /* class com.ss.android.lark.ai.smartreply.p1345c.p1346a.$$Lambda$btybhz9IzDcy1FujIprGCYcAPYM */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetSmartReplyResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo101822a(String str, String str2, final IGetDataCallback<C28580a> iGetDataCallback) {
        GetSmartComposeRequest.C0061a a = new GetSmartComposeRequest.C0061a().mo98b(C28522a.m104531a().mo101565f().toString()).mo95a(GetSmartComposeRequest.Scene.MESSENGER).mo96a(str).mo94a(new ClientMessengerContext(str2));
        Command command = Command.GET_SMART_COMPOSE;
        C286082 r0 = new IGetDataCallback<GetSmartComposeResponse>() {
            /* class com.ss.android.lark.ai.smartreply.p1345c.p1346a.C28606a.C286082 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetSmartComposeResponse getSmartComposeResponse) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(C28600a.m104870a(getSmartComposeResponse));
                }
            }
        };
        ProtoAdapter<GetSmartComposeResponse> protoAdapter = GetSmartComposeResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, r0, new SdkSender.IParser() {
            /* class com.ss.android.lark.ai.smartreply.p1345c.p1346a.$$Lambda$DEXQEbJEQhgC7J1duFA5UvTo8w */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetSmartComposeResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo101823b(String str, String str2, IGetDataCallback<AIGetTextCorrectionResponse> iGetDataCallback) {
        AIGetTextCorrectionRequest.C49415a c = new AIGetTextCorrectionRequest.C49415a().mo172467a(Collections.singletonList(str)).mo172466a(str2).mo172469b("im").mo172470c("android");
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.GET_AI_TEXT_CORRECTION;
        ProtoAdapter<AIGetTextCorrectionResponse> protoAdapter = AIGetTextCorrectionResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, c, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.ai.smartreply.p1345c.p1346a.$$Lambda$gyw4S_hPO_geEVMhMhVymipSgzk */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (AIGetTextCorrectionResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }
}
