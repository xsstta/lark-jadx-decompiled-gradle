package com.ss.android.lark.ug.dyflow.common.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.ug.dyflow.common.data.FlowData;
import com.ss.android.lark.ug.dyflow.common.data.parser.DataParser;
import com.ss.android.lark.ug.dyflow.common.data.parser.GetFlowDataJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/service/MockFlowService;", "Lcom/ss/android/lark/ug/dyflow/common/service/IDyFlowService;", "url", "", "(Ljava/lang/String;)V", "parser", "Lcom/ss/android/lark/ug/dyflow/common/data/parser/DataParser;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "getParser", "()Lcom/ss/android/lark/ug/dyflow/common/data/parser/DataParser;", "setParser", "(Lcom/ss/android/lark/ug/dyflow/common/data/parser/DataParser;)V", "getFlowData", "", "flowId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "reportFlowEvent", "stepId", "slotId", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.b.d */
public final class MockFlowService implements IDyFlowService {

    /* renamed from: a */
    private DataParser<String, FlowData> f141411a = new GetFlowDataJsonParser();

    /* renamed from: b */
    private final String f141412b;

    @Override // com.ss.android.lark.ug.dyflow.common.service.IDyFlowService
    /* renamed from: a */
    public void mo194776a(long j, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "stepId");
        Intrinsics.checkParameterIsNotNull(str2, "slotId");
    }

    /* renamed from: a */
    public final DataParser<String, FlowData> mo194782a() {
        return this.f141411a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/common/service/MockFlowService$getFlowData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sendHttpResponse", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.b.d$a */
    public static final class C57430a implements IGetDataCallback<SendHttpResponse> {

        /* renamed from: a */
        final /* synthetic */ MockFlowService f141413a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f141414b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f141414b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SendHttpResponse sendHttpResponse) {
            int i;
            Intrinsics.checkParameterIsNotNull(sendHttpResponse, "sendHttpResponse");
            try {
                if (sendHttpResponse.http_status_code == null) {
                    i = ParticipantRepo.f117150c;
                } else {
                    i = sendHttpResponse.http_status_code.intValue();
                }
                if (i < 300) {
                    if (i >= 200) {
                        String str = sendHttpResponse.json_body;
                        if (str != null) {
                            this.f141414b.onSuccess(this.f141413a.mo194782a().mo194858a(str));
                            return;
                        }
                        C57430a aVar = this;
                        this.f141414b.onError(new ErrorResult(i, "got empty body"));
                        return;
                    }
                }
                IGetDataCallback iGetDataCallback = this.f141414b;
                iGetDataCallback.onError(new ErrorResult(i, "get_unexpected_http_code:" + i));
            } catch (JSONException e) {
                IGetDataCallback iGetDataCallback2 = this.f141414b;
                iGetDataCallback2.onError(new ErrorResult(-202, "format json result failed:" + e.getMessage()));
            } catch (Exception e2) {
                IGetDataCallback iGetDataCallback3 = this.f141414b;
                iGetDataCallback3.onError(new ErrorResult(-1, "unknown error:" + e2.getMessage()));
            }
        }

        C57430a(MockFlowService dVar, IGetDataCallback iGetDataCallback) {
            this.f141413a = dVar;
            this.f141414b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "kotlin.jvm.PlatformType", "bytes", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.b.d$b */
    static final class C57431b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C57431b f141415a = new C57431b();

        C57431b() {
        }

        /* renamed from: a */
        public final SendHttpResponse parse(byte[] bArr) {
            ProtoAdapter<SendHttpResponse> protoAdapter = SendHttpResponse.ADAPTER;
            if (bArr == null) {
                Intrinsics.throwNpe();
            }
            return protoAdapter.decode(bArr);
        }
    }

    public MockFlowService(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f141412b = str;
    }

    @Override // com.ss.android.lark.ug.dyflow.common.service.IDyFlowService
    /* renamed from: a */
    public void mo194775a(long j, IGetDataCallback<FlowData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.GET).mo55528a(this.f141412b), new C57430a(this, iGetDataCallback), C57431b.f141415a);
    }
}
