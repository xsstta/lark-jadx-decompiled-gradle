package com.bytedance.ee.webapp.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.bytedance.ee.webapp.C13802g;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.plugins.utils.C25613c;
import com.larksuite.framework.apiplugin.annotation.LKIncludeWithFailData;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.validator.format.Min;
import com.larksuite.framework.apiplugin.validator.format.NotBlank;
import com.ss.android.lark.http.model.BaseResponseModel;
import com.ss.android.lark.http.model.ErrorResult;
import com.ss.android.lark.http.model.http.AbstractC38765a;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.permission.AbstractC48767b;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyHttpRequest;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0004%&'(B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0007J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0014J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\"\u001a\u00020\nH\u0016J \u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020 2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/bytedance/ee/webapp/config/H5ConfigPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "mCallback", "Lcom/ss/android/lark/openapi/permission/PermissionCallback;", "webViewTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "(Lcom/ss/android/lark/openapi/permission/PermissionCallback;Lcom/ss/android/lark/opmonitor/trace/OPTrace;)V", "log", "Lkotlin/Function1;", "", "", "getMCallback", "()Lcom/ss/android/lark/openapi/permission/PermissionCallback;", "setMCallback", "(Lcom/ss/android/lark/openapi/permission/PermissionCallback;)V", "mEventContext", "Lcom/larksuite/framework/apiplugin/api/LKEventContext;", "mUrl", "getWebViewTrace", "()Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "setWebViewTrace", "(Lcom/ss/android/lark/opmonitor/trace/OPTrace;)V", "doH5Config", "configRequest", "Lcom/bytedance/ee/webapp/config/H5ConfigPlugin$H5ConfigRequest;", "eventContext", "invokeCallback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "generateParamsInvalidResponse", "innerMsg", "getVerifyRequestModel", "Lcom/ss/android/lark/openapi/permission/http/verify/VerifyParams;", "request", "onRelease", "requestPermission", "params", "Companion", "H5ConfigFailResponse", "H5ConfigRequest", "H5ConfigResponse", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class H5ConfigPlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);
    public final Function1<String, Unit> log = new C13767c(this);
    private AbstractC48767b mCallback;
    public AbstractC25895f mEventContext;
    public String mUrl;
    private OPTrace webViewTrace;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/webapp/config/H5ConfigPlugin$H5ConfigFailResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "errorCode", "", "getErrorCode", "()Ljava/lang/Integer;", "setErrorCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    @LKIncludeWithFailData
    public static final class H5ConfigFailResponse extends C25921b {
        private Integer errorCode = 0;
        private String errorMessage;

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final void setErrorCode(Integer num) {
            this.errorCode = num;
        }

        public final void setErrorMessage(String str) {
            this.errorMessage = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/webapp/config/H5ConfigPlugin$H5ConfigRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "()V", "appId", "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "jsApiList", "", "getJsApiList", "()Ljava/util/List;", "setJsApiList", "(Ljava/util/List;)V", "nonceStr", "getNonceStr", "setNonceStr", "signature", "getSignature", "setSignature", "timestamp", "", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class H5ConfigRequest extends C25920a {
        @NotBlank
        @LKRequiredParam
        private String appId;
        private List<String> jsApiList;
        @NotBlank
        @LKRequiredParam
        private String nonceStr;
        @NotBlank
        @LKRequiredParam
        private String signature;
        @Min(include = false, value = 0.0d)
        @LKRequiredParam
        private Long timestamp;

        public final String getAppId() {
            return this.appId;
        }

        public final List<String> getJsApiList() {
            return this.jsApiList;
        }

        public final String getNonceStr() {
            return this.nonceStr;
        }

        public final String getSignature() {
            return this.signature;
        }

        public final Long getTimestamp() {
            return this.timestamp;
        }

        public final void setAppId(String str) {
            this.appId = str;
        }

        public final void setJsApiList(List<String> list) {
            this.jsApiList = list;
        }

        public final void setNonceStr(String str) {
            this.nonceStr = str;
        }

        public final void setSignature(String str) {
            this.signature = str;
        }

        public final void setTimestamp(Long l) {
            this.timestamp = l;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/webapp/config/H5ConfigPlugin$H5ConfigResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "session", "", "getSession", "()Ljava/lang/String;", "setSession", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class H5ConfigResponse extends C25921b {
        @JSONField(name = "session_key")
        private String session;

        public final String getSession() {
            return this.session;
        }

        public final void setSession(String str) {
            this.session = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/webapp/config/H5ConfigPlugin$Companion;", "", "()V", "DEFAULT_CODE", "", "DEFAULT_MSG", "", "INVALID_PARAM_CODE", "INVALID_PARAM_MSG", "TAG", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.config.H5ConfigPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC48767b getMCallback() {
        return this.mCallback;
    }

    public final OPTrace getWebViewTrace() {
        return this.webViewTrace;
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        this.mCallback = null;
        this.mEventContext = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.config.H5ConfigPlugin$b */
    static final class RunnableC13766b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ H5ConfigPlugin f35991a;

        /* renamed from: b */
        final /* synthetic */ H5ConfigRequest f35992b;

        /* renamed from: c */
        final /* synthetic */ AbstractC25897h f35993c;

        RunnableC13766b(H5ConfigPlugin h5ConfigPlugin, H5ConfigRequest h5ConfigRequest, AbstractC25897h hVar) {
            this.f35991a = h5ConfigPlugin;
            this.f35992b = h5ConfigRequest;
            this.f35993c = hVar;
        }

        public final void run() {
            if (this.f35991a.getAppContext() != null) {
                H5ConfigPlugin h5ConfigPlugin = this.f35991a;
                IAppContext appContext = h5ConfigPlugin.getAppContext();
                if (appContext != null) {
                    h5ConfigPlugin.mUrl = ((C67462h) appContext).mo234201a();
                    C48772b verifyRequestModel = this.f35991a.getVerifyRequestModel(this.f35992b);
                    if (verifyRequestModel != null) {
                        this.f35991a.requestPermission(verifyRequestModel, this.f35993c);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.tt.miniapphost.appcontainer.impl.WebAppContext");
            }
        }
    }

    public final void setMCallback(AbstractC48767b bVar) {
        this.mCallback = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.config.H5ConfigPlugin$c */
    static final class C13767c extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ H5ConfigPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13767c(H5ConfigPlugin h5ConfigPlugin) {
            super(1);
            this.this$0 = h5ConfigPlugin;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ILogger b;
            Intrinsics.checkParameterIsNotNull(str, "it");
            AbstractC25895f fVar = this.this$0.mEventContext;
            if (fVar != null && (b = fVar.mo92190b()) != null) {
                b.mo92222d("H5ConfigPlugin", str);
            }
        }
    }

    public final void setWebViewTrace(OPTrace oPTrace) {
        Intrinsics.checkParameterIsNotNull(oPTrace, "<set-?>");
        this.webViewTrace = oPTrace;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.apiplugin.AbstractC25889a
    public C25921b generateParamsInvalidResponse(String str) {
        H5ConfigFailResponse h5ConfigFailResponse = new H5ConfigFailResponse();
        H5ConfigFailResponse h5ConfigFailResponse2 = h5ConfigFailResponse;
        fillFailedResponse(h5ConfigFailResponse2, C25906a.f64072b, str);
        h5ConfigFailResponse.setErrorCode(1012);
        h5ConfigFailResponse.setErrorMessage("invalid parameter");
        return h5ConfigFailResponse2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/webapp/config/H5ConfigPlugin$requestPermission$1", "Lcom/ss/android/lark/http/model/http/BaseRequestCallback;", "Lcom/ss/android/lark/openapi/permission/http/verify/VerifyResponse;", "onError", "", "error", "Lcom/ss/android/lark/http/model/ErrorResult;", "onSuccess", "success", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.config.H5ConfigPlugin$d */
    public static final class C13768d extends AbstractC38765a<VerifyResponse> {

        /* renamed from: a */
        final /* synthetic */ H5ConfigPlugin f35994a;

        /* renamed from: b */
        final /* synthetic */ C48772b f35995b;

        /* renamed from: c */
        final /* synthetic */ AbstractC25897h f35996c;

        /* renamed from: a */
        public void mo50782a(VerifyResponse verifyResponse) {
            VerifyResponse.VerifyDataNode verifyDataNode;
            this.f35994a.log.invoke("config request onSuccess");
            if (verifyResponse != null && (verifyDataNode = verifyResponse.mDataNode) != null) {
                this.f35994a.log.invoke("web app permission granted");
                AbstractC48767b mCallback = this.f35994a.getMCallback();
                if (mCallback != null) {
                    mCallback.mo50795a(this.f35995b, verifyResponse);
                }
                H5ConfigResponse h5ConfigResponse = new H5ConfigResponse();
                h5ConfigResponse.setSession(verifyDataNode.mSessionKey);
                AbstractC25897h hVar = this.f35996c;
                if (hVar != null) {
                    hVar.callback(h5ConfigResponse);
                }
            }
        }

        @Override // com.ss.android.lark.http.model.http.AbstractC38765a
        /* renamed from: a */
        public void mo50780a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            this.f35994a.log.invoke("config request onError");
            H5ConfigFailResponse h5ConfigFailResponse = new H5ConfigFailResponse();
            H5ConfigFailResponse h5ConfigFailResponse2 = h5ConfigFailResponse;
            String str = "request error";
            this.f35994a.fillFailedResponse(h5ConfigFailResponse2, C25906a.f64080j, str);
            BaseResponseModel responseModel = errorResult.getResponseModel();
            int i = UpdateDialogStatusCode.DISMISS;
            if (responseModel != null && errorResult.getErrorType() == -3) {
                int errorCode = responseModel.getErrorCode();
                if (responseModel instanceof VerifyResponse) {
                    String valueOf = String.valueOf(errorCode);
                    if (StringsKt.startsWith$default(valueOf, "20", false, 2, (Object) null)) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append("333");
                            if (valueOf != null) {
                                String substring = valueOf.substring(2);
                                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                                sb.append(substring);
                                Integer valueOf2 = Integer.valueOf(sb.toString());
                                Intrinsics.checkExpressionValueIsNotNull(valueOf2, "Integer.valueOf(verifyErrorCode)");
                                errorCode = valueOf2.intValue();
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        } catch (Exception e) {
                            Function1<String, Unit> function1 = this.f35994a.log;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "generate verifyErrorCode exception";
                            }
                            function1.invoke(message);
                        }
                    }
                    String str2 = ((VerifyResponse) responseModel).mErrorMsg;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.mErrorMsg");
                    this.f35994a.fillFailedResponse(h5ConfigFailResponse2, C25906a.f64081k, str2);
                    i = errorCode;
                    str = str2;
                } else {
                    i = errorCode;
                }
            }
            AbstractC48760b a = C48768a.m192108a(i, str);
            Intrinsics.checkExpressionValueIsNotNull(a, "PermissionCheckResponse.…(errorCode, errorMessage)");
            String b = a.mo51069b();
            Function1<String, Unit> function12 = this.f35994a.log;
            function12.invoke("web app permission denied reason: " + b);
            AbstractC48767b mCallback = this.f35994a.getMCallback();
            if (mCallback != null) {
                mCallback.mo50796a(this.f35995b, b);
            }
            h5ConfigFailResponse.setErrorMessage(str);
            h5ConfigFailResponse.setErrorCode(Integer.valueOf(i));
            AbstractC25897h hVar = this.f35996c;
            if (hVar != null) {
                hVar.callback(h5ConfigFailResponse);
            }
        }

        C13768d(H5ConfigPlugin h5ConfigPlugin, C48772b bVar, AbstractC25897h hVar) {
            this.f35994a = h5ConfigPlugin;
            this.f35995b = bVar;
            this.f35996c = hVar;
        }
    }

    public final C48772b getVerifyRequestModel(H5ConfigRequest h5ConfigRequest) {
        if (h5ConfigRequest == null) {
            this.log.invoke("web app config data is null");
            return null;
        }
        C48772b.C48774a aVar = new C48772b.C48774a();
        aVar.mo170356a(h5ConfigRequest.getAppId());
        C13802g a = C13802g.m55926a();
        Intrinsics.checkExpressionValueIsNotNull(a, "WebAppHostDependManager.getInstance()");
        AbstractC13794f b = a.mo50866b();
        Intrinsics.checkExpressionValueIsNotNull(b, "WebAppHostDependManager.getInstance().dependency");
        AbstractC13794f.AbstractC13796b b2 = b.mo50839b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "WebAppHostDependManager.…ependency.loginDependency");
        aVar.mo170362e(b2.mo50852b());
        aVar.mo170361d(h5ConfigRequest.getSignature());
        aVar.mo170360c(h5ConfigRequest.getNonceStr());
        aVar.mo170359b(String.valueOf(h5ConfigRequest.getTimestamp()));
        aVar.mo170363f(C13772c.m55812a(this.mUrl));
        aVar.mo170357a(h5ConfigRequest.getJsApiList());
        AbstractC13769a.m55798a(h5ConfigRequest.getAppId(), h5ConfigRequest.getSignature(), C13772c.m55812a(this.mUrl), this.webViewTrace);
        Function1<String, Unit> function1 = this.log;
        function1.invoke("auth url hash code:" + C13602d.m55222a(C13772c.m55812a(this.mUrl)));
        return aVar.mo170358a();
    }

    public H5ConfigPlugin(AbstractC48767b bVar, OPTrace oPTrace) {
        Intrinsics.checkParameterIsNotNull(oPTrace, "webViewTrace");
        this.mCallback = bVar;
        this.webViewTrace = oPTrace;
    }

    public final void requestPermission(C48772b bVar, AbstractC25897h<C25921b> hVar) {
        C13802g a = C13802g.m55926a();
        Intrinsics.checkExpressionValueIsNotNull(a, "WebAppHostDependManager.getInstance()");
        AbstractC13794f b = a.mo50866b();
        Intrinsics.checkExpressionValueIsNotNull(b, "WebAppHostDependManager.getInstance().dependency");
        String a2 = b.mo50830a();
        C13802g a3 = C13802g.m55926a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "WebAppHostDependManager.getInstance()");
        AbstractC13794f b2 = a3.mo50866b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "WebAppHostDependManager.getInstance().dependency");
        AbstractC13794f.AbstractC13796b b3 = b2.mo50839b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "WebAppHostDependManager.…ependency.loginDependency");
        String c = b3.mo50853c();
        this.log.invoke("config request start");
        new VerifyHttpRequest(a2, c, bVar).request(new C13768d(this, bVar, hVar));
    }

    @LKPluginFunction(async = true, eventName = {"config"})
    public final void doH5Config(H5ConfigRequest h5ConfigRequest, AbstractC25895f fVar, AbstractC25897h<C25921b> hVar) {
        this.mEventContext = fVar;
        if (getAppContext() instanceof C67462h) {
            C25613c.m91382a(new RunnableC13766b(this, h5ConfigRequest, hVar));
        }
    }
}
