package com.ss.android.lark.profile.func.medal.service;

import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.impl.serverimpl.annotation.ServerCall;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.ug.GetUserMedalDetailRequest;
import com.ss.android.lark.pb.ug.GetUserMedalDetailResponse;
import com.ss.android.lark.pb.ug.GetUserTakingMedalRequest;
import com.ss.android.lark.pb.ug.GetUserTakingMedalResponse;
import com.ss.android.lark.pb.ug.ListUserMedalsRequest;
import com.ss.android.lark.pb.ug.ListUserMedalsResponse;
import com.ss.android.lark.pb.ug.SetUserMedalRequest;
import com.ss.android.lark.pb.ug.SetUserMedalResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J1\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ9\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/service/MedalService;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/profile/func/medal/service/MedalService$MedalServerService;", "()V", "TAG", "", "getMedalDetail", "Lcom/larksuite/rucket/job/base/RucketResult;", "Lcom/ss/android/lark/pb/ug/GetUserMedalDetailResponse;", "userId", "medalId", "grantId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMedalList", "Lcom/ss/android/lark/pb/ug/ListUserMedalsResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserTakingMedalDetail", "Lcom/ss/android/lark/pb/ug/GetUserTakingMedalResponse;", "updateMedalStatus", "Lcom/ss/android/lark/pb/ug/SetUserMedalResponse;", "isToWear", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MedalServerService", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.a.a */
public final class MedalService {

    /* renamed from: a */
    public static final MedalService f129785a = new MedalService();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\tH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\fH'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u000fH'¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/service/MedalService$MedalServerService;", "", "getMedalDetail", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/ss/android/lark/pb/ug/GetUserMedalDetailResponse;", "request", "Lcom/ss/android/lark/pb/ug/GetUserMedalDetailRequest;", "getMedalList", "Lcom/ss/android/lark/pb/ug/ListUserMedalsResponse;", "Lcom/ss/android/lark/pb/ug/ListUserMedalsRequest;", "getUserTakingMedalDetail", "Lcom/ss/android/lark/pb/ug/GetUserTakingMedalResponse;", "Lcom/ss/android/lark/pb/ug/GetUserTakingMedalRequest;", "updateMedalStatus", "Lcom/ss/android/lark/pb/ug/SetUserMedalResponse;", "Lcom/ss/android/lark/pb/ug/SetUserMedalRequest;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.a.a$a */
    public interface MedalServerService {
        @ServerCall(Command.GET_MEDAL_DETAIL)
        /* renamed from: a */
        RucketJob<GetUserMedalDetailResponse> mo179243a(GetUserMedalDetailRequest getUserMedalDetailRequest);

        @ServerCall(Command.GET_USER_TAKING_MEDAL)
        /* renamed from: a */
        RucketJob<GetUserTakingMedalResponse> mo179244a(GetUserTakingMedalRequest getUserTakingMedalRequest);

        @ServerCall(Command.GET_MEDAL_LIST)
        /* renamed from: a */
        RucketJob<ListUserMedalsResponse> mo179245a(ListUserMedalsRequest listUserMedalsRequest);

        @ServerCall(Command.SET_MEDAL)
        /* renamed from: a */
        RucketJob<SetUserMedalResponse> mo179246a(SetUserMedalRequest setUserMedalRequest);
    }

    private MedalService() {
    }

    /* renamed from: a */
    public final Object mo179241a(String str, Continuation<? super RucketResult<ListUserMedalsResponse>> cVar) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165397w("MedalService", "userid is empty, stop get medal list");
            return null;
        }
        ListUserMedalsRequest a = new ListUserMedalsRequest.C50096a().mo174005a(str).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        return ((MedalServerService) Rucket.m95345a(MedalServerService.class)).mo179245a(a).mo93484a(cVar);
    }

    /* renamed from: b */
    public final Object mo179242b(String str, Continuation<? super RucketResult<GetUserTakingMedalResponse>> cVar) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165397w("MedalService", "userId or medalId is empty, stop getting medal detail");
            return null;
        }
        GetUserTakingMedalRequest a = new GetUserTakingMedalRequest.C50090a().mo173992a(str).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        return ((MedalServerService) Rucket.m95345a(MedalServerService.class)).mo179244a(a).mo93484a(cVar);
    }

    /* renamed from: a */
    public final Object mo179239a(String str, String str2, String str3, Continuation<? super RucketResult<GetUserMedalDetailResponse>> cVar) {
        boolean z;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str2.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                GetUserMedalDetailRequest a = new GetUserMedalDetailRequest.C50086a().mo173981a(str).mo173983b(str2).mo173984c(str3).build();
                Intrinsics.checkExpressionValueIsNotNull(a, "request");
                return ((MedalServerService) Rucket.m95345a(MedalServerService.class)).mo179243a(a).mo93484a(cVar);
            }
        }
        Log.m165397w("MedalService", "userId or medalId is empty, stop getting medal detail");
        return null;
    }

    /* renamed from: a */
    public final Object mo179240a(String str, String str2, String str3, boolean z, Continuation<? super RucketResult<SetUserMedalResponse>> cVar) {
        boolean z2;
        SetUserMedalRequest.Action action;
        boolean z3 = true;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (str3.length() != 0) {
                z3 = false;
            }
            if (!z3) {
                if (z) {
                    action = SetUserMedalRequest.Action.TAKE;
                } else {
                    action = SetUserMedalRequest.Action.TAKEOFF;
                }
                SetUserMedalRequest a = new SetUserMedalRequest.C50104a().mo174025a(str3).mo174027b(str).mo174024a(action).mo174028c(str2).build();
                Intrinsics.checkExpressionValueIsNotNull(a, "request");
                return ((MedalServerService) Rucket.m95345a(MedalServerService.class)).mo179246a(a).mo93484a(cVar);
            }
        }
        Log.m165397w("MedalService", "medalId or userid is empty, isToWear: " + z);
        return null;
    }
}
