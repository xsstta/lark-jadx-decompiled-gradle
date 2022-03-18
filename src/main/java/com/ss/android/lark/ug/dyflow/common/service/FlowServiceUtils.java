package com.ss.android.lark.ug.dyflow.common.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.onboarding.v1.ReportFlowEventRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.ug.apm.OnBoardingAppreciable;
import com.ss.android.lark.ug.apm.UGAppreciable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/service/FlowServiceUtils;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.b.b */
public final class FlowServiceUtils {

    /* renamed from: a */
    public static final Companion f141408a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/service/FlowServiceUtils$Companion;", "", "()V", "reportFlowEvent", "", "flowId", "", "stepId", "", "slotId", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.b.b$a */
    public static final class Companion {

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.common.b.b$a$b */
        public static final class C57429b<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C57429b f141410a = new C57429b();

            C57429b() {
            }

            /* renamed from: a */
            public final Void parse(byte[] bArr) {
                return null;
            }
        }

        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/common/service/FlowServiceUtils$Companion$reportFlowEvent$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.common.b.b$a$a */
        public static final class C57428a implements IGetDataCallback<Object> {

            /* renamed from: a */
            final /* synthetic */ UGAppreciable.NetPoint f141409a;

            C57428a(UGAppreciable.NetPoint aVar) {
                this.f141409a = aVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                this.f141409a.mo194487b();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f141409a.mo194486a(errorResult.getErrorCode(), errorResult.getDebugMsg());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo194780a(long j, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "stepId");
            Intrinsics.checkParameterIsNotNull(str2, "slotId");
            UGAppreciable.NetPoint e = OnBoardingAppreciable.f141195a.mo194467e();
            e.mo194485a();
            SdkSender.asynSendRequestNonWrap(Command.REPORT_FLOW_EVENT, new ReportFlowEventRequest.C18616a().mo64140a(Long.valueOf(j)).mo64143b(str2).mo64141a(str), new C57428a(e), C57429b.f141410a);
        }
    }
}
