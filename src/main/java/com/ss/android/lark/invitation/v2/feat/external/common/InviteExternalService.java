package com.ss.android.lark.invitation.v2.feat.external.common;

import android.content.Context;
import com.bytedance.lark.pb.im.v2.GetContactTokenResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.invitation.v2.feat.external.bean.C40219a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/common/InviteExternalService;", "", "()V", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.d */
public final class InviteExternalService {

    /* renamed from: a */
    public static final Companion f102179a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m159379a(Context context, ApiUtils.AbstractC57748a<C40219a> aVar) {
        f102179a.mo145894a(context, aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0007J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/common/InviteExternalService$Companion;", "", "()V", "TAG", "", "asyncGetInviteMsg", "", "context", "Landroid/content/Context;", "consumer", "Lcom/ss/android/lark/utils/ApiUtils$Consumer;", "Lcom/ss/android/lark/invitation/v2/feat/external/bean/InvitationInfoGroup;", "canAddWithToken", "", "()Ljava/lang/Boolean;", "getInvitationInfo", "syncValue", "Lcom/ss/android/lark/utils/TaskUtils$SyncValue;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.d$a$b */
        public static final class RunnableC40217b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ApiUtils.AbstractC57748a f102181a;

            RunnableC40217b(ApiUtils.AbstractC57748a aVar) {
                this.f102181a = aVar;
            }

            public final void run() {
                this.f102181a.consume(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/invitation/v2/feat/external/common/InviteExternalService$Companion$asyncGetInviteMsg$1", "Lcom/ss/android/lark/utils/TaskUtils$Task;", "Lcom/ss/android/lark/invitation/v2/feat/external/bean/InvitationInfoGroup;", "onDo", "onDone", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.d$a$a */
        public static final class C40216a extends C57768af.AbstractRunnableC57773c<C40219a> {

            /* renamed from: a */
            final /* synthetic */ ApiUtils.AbstractC57748a f102180a;

            /* renamed from: a */
            public C40219a mo130916b() {
                C57768af.C57772b<C40219a> bVar = new C57768af.C57772b<>();
                InviteExternalService.f102179a.mo145895a(bVar);
                return bVar.mo196071a();
            }

            C40216a(ApiUtils.AbstractC57748a aVar) {
                this.f102180a = aVar;
            }

            /* renamed from: a */
            public void mo130914a(C40219a aVar) {
                this.f102180a.consume(aVar);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/external/common/InviteExternalService$Companion$getInvitationInfo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v2/GetContactTokenResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.d$a$c */
        public static final class C40218c implements IGetDataCallback<GetContactTokenResponse> {

            /* renamed from: a */
            final /* synthetic */ C57768af.C57772b f102182a;

            C40218c(C57768af.C57772b bVar) {
                this.f102182a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(GetContactTokenResponse getContactTokenResponse) {
                this.f102182a.mo196072a(C40219a.m159393a(getContactTokenResponse));
                InvAppreciableUtils.f101934a.mo145656a(false);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("InvitationModule", errorResult.getDebugMsg());
                this.f102182a.mo196072a(C40219a.m159394a(errorResult));
                InvAppreciableUtils.f101934a.mo145654a(errorResult);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo145895a(C57768af.C57772b<C40219a> bVar) {
            InvAppreciableUtils.f101934a.mo145656a(true);
            C40147z.m159162b().getContactTokenV2(new C40218c(bVar));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo145894a(Context context, ApiUtils.AbstractC57748a<C40219a> aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(aVar, "consumer");
            C57768af.m224220b(context, new C40216a(aVar).mo196073a(10000, new RunnableC40217b(aVar)));
        }
    }
}
