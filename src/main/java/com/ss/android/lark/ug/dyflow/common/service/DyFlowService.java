package com.ss.android.lark.ug.dyflow.common.service;

import android.os.SystemClock;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.onboarding.v1.FlowPlatformType;
import com.bytedance.lark.pb.onboarding.v1.FlowQueryContext;
import com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.apm.OnBoardingAppreciable;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.apm.UGAppreciable;
import com.ss.android.lark.ug.dyflow.common.data.FlowData;
import com.ss.android.lark.ug.dyflow.common.data.parser.DataParser;
import com.ss.android.lark.ug.dyflow.common.data.parser.GetFlowDataParser;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import com.ss.android.lark.utils.UIHelper;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0016J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/service/DyFlowService;", "Lcom/ss/android/lark/ug/dyflow/common/service/IDyFlowService;", "appDisplayName", "", "tenantName", "userName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parser", "Lcom/ss/android/lark/ug/dyflow/common/data/parser/DataParser;", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "replacementArgs", "", "getReplacementArgs", "()Ljava/util/Map;", "getFlowData", "", "flowId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "reportFlowEvent", "stepId", "slotId", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.b.a */
public final class DyFlowService implements IDyFlowService {

    /* renamed from: b */
    public static final Companion f141399b = new Companion(null);

    /* renamed from: a */
    public final DataParser<byte[], FlowData> f141400a = new GetFlowDataParser();

    /* renamed from: c */
    private final String f141401c;

    /* renamed from: d */
    private final String f141402d;

    /* renamed from: e */
    private final String f141403e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/service/DyFlowService$Companion;", "", "()V", "ARG_APP_DISPLAY_NAME", "", "ARG_TENANT_NAME", "ARG_USER_NAME", "TAG", "create", "Lcom/ss/android/lark/ug/dyflow/common/service/IDyFlowService;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IDyFlowService mo194777a() {
            Log.m165389i("DyFlow", "use sdk service");
            String string = UIHelper.getString(R.string.Lark_App_Name);
            String str = "";
            if (string == null) {
                string = str;
            }
            AbstractC57392a a = C57345a.m222261a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
            String c = a.mo194671c();
            if (c == null) {
                c = str;
            }
            AbstractC57392a a2 = C57345a.m222261a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "UGModule.getDependency()");
            String a3 = a2.mo194662a();
            if (a3 != null) {
                str = a3;
            }
            return new DyFlowService(string, c, str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final Map<String, String> m222656a() {
        HashMap hashMap = new HashMap();
        hashMap.put("APP_DISPLAY_NAME", this.f141401c);
        hashMap.put("TENANT_NAME", this.f141402d);
        hashMap.put("USER_NAME", this.f141403e);
        return hashMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.b.a$b */
    static final class C57426b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ DyFlowService f141404a;

        C57426b(DyFlowService aVar) {
            this.f141404a = aVar;
        }

        /* renamed from: a */
        public final FlowData parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return this.f141404a.f141400a.mo194858a(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J)\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"com/ss/android/lark/ug/dyflow/common/service/DyFlowService$getFlowData$innerCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "netPoint", "Lcom/ss/android/lark/ug/apm/UGAppreciable$NetPoint;", "getNetPoint", "()Lcom/ss/android/lark/ug/apm/UGAppreciable$NetPoint;", "startTime", "", "getStartTime", "()J", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "reportCostTimes", "success", "", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "", "(ZLjava/lang/Integer;Ljava/lang/String;)V", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.b.a$c */
    public static final class C57427c implements IGetDataCallback<FlowData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f141405a;

        /* renamed from: b */
        private final long f141406b = SystemClock.uptimeMillis();

        /* renamed from: c */
        private final UGAppreciable.NetPoint f141407c;

        /* renamed from: a */
        public void onSuccess(FlowData bVar) {
            m222661a(true, null, null);
            this.f141405a.onSuccess(bVar);
            this.f141407c.mo194487b();
        }

        C57427c(IGetDataCallback iGetDataCallback) {
            this.f141405a = iGetDataCallback;
            UGAppreciable.NetPoint d = OnBoardingAppreciable.f141195a.mo194466d();
            d.mo194485a();
            this.f141407c = d;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            m222661a(false, Integer.valueOf(errorResult.getErrorCode()), errorResult.toString());
            this.f141405a.onError(errorResult);
            this.f141407c.mo194486a(errorResult.getErrorCode(), errorResult.getDebugMsg());
        }

        /* renamed from: a */
        private final void m222661a(boolean z, Integer num, String str) {
            UGApm.DyFlow.f141198a.mo194475a(z, SystemClock.uptimeMillis() - this.f141406b, num, str);
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.service.IDyFlowService
    /* renamed from: a */
    public void mo194775a(long j, IGetDataCallback<FlowData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        GetDynamicFlowRequest.C18584a aVar = new GetDynamicFlowRequest.C18584a();
        aVar.mo64070a(new FlowQueryContext.C18582a().mo64064a(Long.valueOf(j)).mo64063a(FlowPlatformType.ANDROID).mo64065a(m222656a()).build());
        SdkSender.asynSendRequestNonWrap(Command.GET_DYNAMIC_FLOW, aVar, new C57427c(iGetDataCallback), new C57426b(this));
    }

    @Override // com.ss.android.lark.ug.dyflow.common.service.IDyFlowService
    /* renamed from: a */
    public void mo194776a(long j, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "stepId");
        Intrinsics.checkParameterIsNotNull(str2, "slotId");
        FlowServiceUtils.f141408a.mo194780a(j, str, str2);
    }

    public DyFlowService(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "appDisplayName");
        Intrinsics.checkParameterIsNotNull(str2, "tenantName");
        Intrinsics.checkParameterIsNotNull(str3, "userName");
        this.f141401c = str;
        this.f141402d = str2;
        this.f141403e = str3;
    }
}
