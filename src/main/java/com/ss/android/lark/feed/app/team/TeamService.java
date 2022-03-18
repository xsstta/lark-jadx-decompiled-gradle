package com.ss.android.lark.feed.app.team;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.feed.v1.GetItemsRequest;
import com.bytedance.lark.pb.feed.v1.GetItemsResponse;
import com.bytedance.lark.pb.im.v1.PatchItemRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.feed.app.team.entity.C37872c;
import com.ss.android.lark.feed.app.team.entity.C37876f;
import com.ss.android.lark.feed.app.team.entity.PatchItemResponse;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2733c.C55366b;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/feed/app/team/TeamService;", "", "()V", "TAG", "", "fetchSingleTeamGroupList", "Lcom/ss/android/lark/feed/app/team/entity/SingleTeamChatListResult;", "teamItemId", "", "team", "Lcom/ss/android/lark/team/entity/Team;", "(JLcom/ss/android/lark/team/entity/Team;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTeamList", "Lcom/ss/android/lark/feed/app/team/entity/TeamListResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "muteChatAndIgnoreResult", "", "chatId", "updateTeamChatVisibility", "Lcom/ss/android/lark/feed/app/team/entity/PatchItemResponse;", "chatItemId", "visible", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.b */
public final class TeamService {

    /* renamed from: a */
    public static final TeamService f97112a = new TeamService();

    private TeamService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/feed/app/team/TeamService$fetchSingleTeamGroupList$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/feed/app/team/entity/SingleTeamChatListResult;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "singleTeamChatListResult", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.b$b */
    public static final class C37865b implements IGetDataCallback<C37872c> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f97115a;

        C37865b(CancellableContinuation kVar) {
            this.f97115a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(C37872c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "singleTeamChatListResult");
            if (this.f97115a.mo243066a()) {
                CancellableContinuation kVar = this.f97115a;
                Result.Companion aVar = Result.Companion;
                kVar.resumeWith(Result.m271569constructorimpl(cVar));
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            if (this.f97115a.mo243066a()) {
                Result.Companion aVar = Result.Companion;
                this.f97115a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/feed/app/team/TeamService$fetchTeamList$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/feed/app/team/entity/TeamListResult;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "teamListResult", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.b$d */
    public static final class C37867d implements IGetDataCallback<C37876f> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f97117a;

        C37867d(CancellableContinuation kVar) {
            this.f97117a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(C37876f fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "teamListResult");
            if (this.f97117a.mo243066a()) {
                CancellableContinuation kVar = this.f97117a;
                Result.Companion aVar = Result.Companion;
                kVar.resumeWith(Result.m271569constructorimpl(fVar));
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            if (this.f97117a.mo243066a()) {
                Result.Companion aVar = Result.Companion;
                this.f97117a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/feed/app/team/TeamService$muteChatAndIgnoreResult$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/UpdateChatResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.b$f */
    public static final class C37869f implements IGetDataCallback<UpdateChatResponse> {

        /* renamed from: a */
        final /* synthetic */ String f97119a;

        C37869f(String str) {
            this.f97119a = str;
        }

        /* renamed from: a */
        public void onSuccess(UpdateChatResponse updateChatResponse) {
            Intrinsics.checkParameterIsNotNull(updateChatResponse, "response");
            C53241h.m205898b("TeamService", "successfully mute chat: " + this.f97119a + " after hide");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("TeamService", "failed mute chat: " + this.f97119a + " after hide: " + errorResult.getDebugMsg());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/feed/app/team/TeamService$updateTeamChatVisibility$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/feed/app/team/entity/PatchItemResponse;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.b$h */
    public static final class C37871h implements IGetDataCallback<PatchItemResponse> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f97121a;

        C37871h(CancellableContinuation kVar) {
            this.f97121a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(PatchItemResponse bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "response");
            if (this.f97121a.mo243066a()) {
                CancellableContinuation kVar = this.f97121a;
                Result.Companion aVar = Result.Companion;
                kVar.resumeWith(Result.m271569constructorimpl(bVar));
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            if (this.f97121a.mo243066a()) {
                Result.Companion aVar = Result.Companion;
                this.f97121a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/entity/TeamListResult;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.b$c */
    static final class C37866c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C37866c f97116a = new C37866c();

        C37866c() {
        }

        /* renamed from: a */
        public final C37876f parse(byte[] bArr) {
            return C37876f.m149059a(GetItemsResponse.ADAPTER.decode(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/UpdateChatResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.b$e */
    public static final class C37868e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C37868e f97118a = new C37868e();

        C37868e() {
        }

        /* renamed from: a */
        public final UpdateChatResponse parse(byte[] bArr) {
            return UpdateChatResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/entity/SingleTeamChatListResult;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse", "com/ss/android/lark/feed/app/team/TeamService$fetchSingleTeamGroupList$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.b$a */
    static final class C37864a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ long f97113a;

        /* renamed from: b */
        final /* synthetic */ Team f97114b;

        C37864a(long j, Team team) {
            this.f97113a = j;
            this.f97114b = team;
        }

        /* renamed from: a */
        public final C37872c parse(byte[] bArr) {
            return C37872c.m149017a(GetItemsResponse.ADAPTER.decode(bArr), this.f97113a, this.f97114b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/entity/PatchItemResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.b$g */
    public static final class C37870g<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C37870g f97120a = new C37870g();

        C37870g() {
        }

        /* renamed from: a */
        public final PatchItemResponse parse(byte[] bArr) {
            return new PatchItemResponse(C55366b.m214900a(com.bytedance.lark.pb.im.v1.PatchItemResponse.ADAPTER.decode(bArr).item));
        }
    }

    /* renamed from: a */
    public final void mo138704a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHAT, new UpdateChatRequest.C18137a().mo62912a(str).mo62910a((Boolean) false), new C37869f(str), C37868e.f97118a);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Object m149004a(Continuation<? super C37876f> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        C37867d dVar = new C37867d(lVar);
        SdkSender.asynSendRequestNonWrap(Command.GET_ITEMS, new GetItemsRequest.C17170a().mo60463a(CollectionsKt.listOf(new GetItemsRequest.Param.C17168a().build())), dVar, C37866c.f97116a);
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Object m149002a(long j, Team team, Continuation<? super C37872c> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        GetItemsRequest.Param a = new GetItemsRequest.Param.C17168a().mo60458a(C69089a.m265840a(j)).build();
        GetItemsRequest.C17170a aVar = new GetItemsRequest.C17170a();
        aVar.f43927a.add(a);
        SdkSender.asynSendRequestNonWrap(Command.GET_ITEMS, aVar, new C37865b(lVar), new C37864a(j, team));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Object m149003a(long j, boolean z, Continuation<? super PatchItemResponse> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        SdkSender.asynSendRequestNonWrap(Command.PATCH_ITEM, new PatchItemRequest.C17825a().mo62136a(C69089a.m265837a(!z)).mo62137a(C69089a.m265840a(j)).mo62138a(CollectionsKt.listOf(PatchItemRequest.UpdateField.UPDATE_FIELD_IS_HIDDEN)), new C37871h(lVar), C37870g.f97120a);
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }
}
