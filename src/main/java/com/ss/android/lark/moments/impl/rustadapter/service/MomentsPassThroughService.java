package com.ss.android.lark.moments.impl.rustadapter.service;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.moments.AcceptSecretChatRequest;
import com.ss.android.lark.pb.moments.AcceptSecretChatResponse;
import com.ss.android.lark.pb.moments.AskForSecretChatRequest;
import com.ss.android.lark.pb.moments.AskForSecretChatResponse;
import com.ss.android.lark.pb.moments.CheckSecretChatStatusRequest;
import com.ss.android.lark.pb.moments.CheckSecretChatStatusResponse;
import com.ss.android.lark.pb.moments.CreateNicknameUserRequest;
import com.ss.android.lark.pb.moments.CreateNicknameUserResponse;
import com.ss.android.lark.pb.moments.GetAnonymousInfoResponse;
import com.ss.android.lark.pb.moments.GetBadgeRequest;
import com.ss.android.lark.pb.moments.GetBadgeResponse;
import com.ss.android.lark.pb.moments.ListHashtagsByUserInputRequest;
import com.ss.android.lark.pb.moments.ListHashtagsByUserInputResponse;
import com.ss.android.lark.pb.moments.PullMomentsTabNotificationRequest;
import com.ss.android.lark.pb.moments.PullMomentsTabNotificationResponse;
import com.ss.android.lark.pb.moments.PullNicknameAvatarRequest;
import com.ss.android.lark.pb.moments.PullNicknameAvatarResponse;
import com.ss.android.lark.pb.moments.PullNicknamesRequest;
import com.ss.android.lark.pb.moments.PullNicknamesResponse;
import com.ss.android.lark.pb.moments.PutMomentsTabNotificationRequest;
import com.ss.android.lark.pb.moments.PutMomentsTabNotificationResponse;
import com.ss.android.lark.pb.moments.PutReadNotificationsRequest;
import com.ss.android.lark.pb.moments.ReportRequest;
import com.ss.android.lark.pb.moments.ReportResponse;
import com.ss.android.lark.pb.moments_entities.AnonymousNickname;
import com.ss.android.lark.pb.moments_entities.Notification;
import com.ss.android.lark.sdk.SdkSender;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.moments.impl.g.b.a */
public final class MomentsPassThroughService {

    /* renamed from: a */
    public static final MomentsPassThroughService f120127a = new MomentsPassThroughService();

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$e */
    public static final class C47613e extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsPassThroughService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47613e(MomentsPassThroughService aVar, Continuation cVar) {
            super(cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167198b(null, this);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$p */
    public static final class C47624p extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsPassThroughService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47624p(MomentsPassThroughService aVar, Continuation cVar) {
            super(cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167194a(null, this);
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$g */
    public static final class C47615g implements SdkSender.IParser<GetBadgeResponse> {
        C47615g() {
        }

        /* renamed from: a */
        public GetBadgeResponse parse(byte[] bArr) {
            if (bArr != null) {
                return GetBadgeResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$o */
    public static final class C47623o implements SdkSender.IParser<Boolean> {
        C47623o() {
        }

        /* renamed from: a */
        public Boolean parse(byte[] bArr) {
            if (bArr != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$r */
    public static final class C47626r implements SdkSender.IParser<ReportResponse> {
        C47626r() {
        }

        /* renamed from: a */
        public ReportResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ReportResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    private MomentsPassThroughService() {
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$a */
    public static final class C47609a<T> implements SdkSender.IParser<AcceptSecretChatResponse> {

        /* renamed from: a */
        public static final C47609a f120128a = new C47609a();

        C47609a() {
        }

        /* renamed from: a */
        public final AcceptSecretChatResponse parse(byte[] bArr) {
            if (bArr != null) {
                return AcceptSecretChatResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$b */
    public static final class C47610b<T> implements SdkSender.IParser<AskForSecretChatResponse> {

        /* renamed from: a */
        public static final C47610b f120129a = new C47610b();

        C47610b() {
        }

        /* renamed from: a */
        public final AskForSecretChatResponse parse(byte[] bArr) {
            if (bArr != null) {
                return AskForSecretChatResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$c */
    public static final class C47611c<T> implements SdkSender.IParser<CheckSecretChatStatusResponse> {

        /* renamed from: a */
        public static final C47611c f120130a = new C47611c();

        C47611c() {
        }

        /* renamed from: a */
        public final CheckSecretChatStatusResponse parse(byte[] bArr) {
            if (bArr != null) {
                return CheckSecretChatStatusResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$d */
    public static final class C47612d<T> implements SdkSender.IParser<CreateNicknameUserResponse> {

        /* renamed from: a */
        public static final C47612d f120131a = new C47612d();

        C47612d() {
        }

        /* renamed from: a */
        public final CreateNicknameUserResponse parse(byte[] bArr) {
            if (bArr != null) {
                return CreateNicknameUserResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$f */
    public static final class C47614f<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        public static final C47614f f120132a = new C47614f();

        C47614f() {
        }

        /* renamed from: a */
        public final Boolean parse(byte[] bArr) {
            if (bArr != null) {
                return GetAnonymousInfoResponse.ADAPTER.decode(bArr).mhas_quota;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$h */
    public static final class C47616h<T> implements SdkSender.IParser<ListHashtagsByUserInputResponse> {

        /* renamed from: a */
        public static final C47616h f120133a = new C47616h();

        C47616h() {
        }

        /* renamed from: a */
        public final ListHashtagsByUserInputResponse parse(byte[] bArr) {
            if (bArr != null) {
                return ListHashtagsByUserInputResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$i */
    public static final class C47617i implements IGetDataCallback<T> {

        /* renamed from: a */
        final /* synthetic */ Continuation f120134a;

        /* renamed from: b */
        final /* synthetic */ Command f120135b;

        /* renamed from: c */
        final /* synthetic */ Message.Builder f120136c;

        /* renamed from: d */
        final /* synthetic */ SdkSender.IParser f120137d;

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            Continuation cVar = this.f120134a;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(t));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("MomentsPassThroughService", this.f120135b + ' ' + errorResult.getDebugMsg());
            Continuation cVar = this.f120134a;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(null));
        }

        C47617i(Continuation cVar, Command command, Message.Builder builder, SdkSender.IParser iParser) {
            this.f120134a = cVar;
            this.f120135b = command;
            this.f120136c = builder;
            this.f120137d = iParser;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$k */
    public static final class C47619k<T> implements SdkSender.IParser<PullMomentsTabNotificationResponse> {

        /* renamed from: a */
        public static final C47619k f120142a = new C47619k();

        C47619k() {
        }

        /* renamed from: a */
        public final PullMomentsTabNotificationResponse parse(byte[] bArr) {
            if (bArr != null) {
                return PullMomentsTabNotificationResponse.ADAPTER.decode(bArr);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$l */
    public static final class C47620l<T> implements SdkSender.IParser<String> {

        /* renamed from: a */
        public static final C47620l f120143a = new C47620l();

        C47620l() {
        }

        /* renamed from: a */
        public final String parse(byte[] bArr) {
            if (bArr != null) {
                return PullNicknameAvatarResponse.ADAPTER.decode(bArr).mavatar_key;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$m */
    public static final class C47621m<T> implements SdkSender.IParser<List<AnonymousNickname>> {

        /* renamed from: a */
        public static final C47621m f120144a = new C47621m();

        C47621m() {
        }

        /* renamed from: a */
        public final List<AnonymousNickname> parse(byte[] bArr) {
            if (bArr != null) {
                return PullNicknamesResponse.ADAPTER.decode(bArr).mnickname_list;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$n */
    public static final class C47622n<T> implements SdkSender.IParser<Long> {

        /* renamed from: a */
        public static final C47622n f120145a = new C47622n();

        C47622n() {
        }

        /* renamed from: a */
        public final Long parse(byte[] bArr) {
            if (bArr != null) {
                return PutMomentsTabNotificationResponse.ADAPTER.decode(bArr).mread_post_timestamp;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$q */
    public static final class C47625q<T> implements SdkSender.IParser<Boolean> {

        /* renamed from: a */
        public static final C47625q f120146a = new C47625q();

        C47625q() {
        }

        /* renamed from: a */
        public final boolean mo167217a(byte[] bArr) {
            return bArr != null;
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Boolean parse(byte[] bArr) {
            return Boolean.valueOf(mo167217a(bArr));
        }
    }

    /* renamed from: com.ss.android.lark.moments.impl.g.b.a$j */
    public static final class C47618j implements IGetDataCallback<T> {

        /* renamed from: a */
        final /* synthetic */ Continuation f120138a;

        /* renamed from: b */
        final /* synthetic */ Command f120139b;

        /* renamed from: c */
        final /* synthetic */ Message.Builder f120140c;

        /* renamed from: d */
        final /* synthetic */ SdkSender.IParser f120141d;

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            Continuation cVar = this.f120138a;
            SdkResponse cVar2 = new SdkResponse(t, null);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(cVar2));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("MomentsPassThroughService", this.f120139b + ' ' + errorResult.getDebugMsg());
            Continuation cVar = this.f120138a;
            SdkResponse cVar2 = new SdkResponse(null, errorResult);
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(cVar2));
        }

        C47618j(Continuation cVar, Command command, Message.Builder builder, SdkSender.IParser iParser) {
            this.f120138a = cVar;
            this.f120139b = command;
            this.f120140c = builder;
            this.f120141d = iParser;
        }
    }

    /* renamed from: e */
    public final Object mo167204e(Continuation<? super PullMomentsTabNotificationResponse> cVar) {
        return mo167189a(Command.MOMENTS_PULL_TAB_NOTIFICATION, new PullMomentsTabNotificationRequest.C49930a(), C47619k.f120142a, cVar);
    }

    /* renamed from: c */
    public final Object mo167201c(Continuation<? super String> cVar) {
        return mo167189a(Command.MOMENTS_PULL_NICKNAME_AVATAR, new PullNicknameAvatarRequest.C49934a(), C47620l.f120143a, cVar);
    }

    /* renamed from: d */
    public final Object mo167203d(Continuation<? super Long> cVar) {
        return mo167189a(Command.MOMENTS_PUT_TAB_NOTIFICATION, new PutMomentsTabNotificationRequest.C49944a(), C47622n.f120145a, cVar);
    }

    /* renamed from: b */
    public final Object mo167199b(Continuation<? super List<AnonymousNickname>> cVar) {
        PullNicknamesRequest.C49938a a = new PullNicknamesRequest.C49938a().mo173653a(C69089a.m265839a(10));
        Command command = Command.MOMENTS_PULL_NICKNAMES;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167189a(command, a, C47621m.f120144a, cVar);
    }

    /* renamed from: a */
    public final Object mo167195a(Continuation<? super GetBadgeResponse> cVar) {
        GetBadgeRequest.C49912a aVar = new GetBadgeRequest.C49912a();
        Log.m165389i("MomentsPassThroughService", "getBadge");
        return mo167189a(Command.MOMENTS_GET_BADGE, aVar, new C47615g(), cVar);
    }

    /* renamed from: c */
    public final Object mo167200c(String str, Continuation<? super ListHashtagsByUserInputResponse> cVar) {
        ListHashtagsByUserInputRequest.C49920a a = new ListHashtagsByUserInputRequest.C49920a().mo173612a(str);
        Command command = Command.MOMENTS_LIST_HASHTAGS_BY_USER_INPUT;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167189a(command, a, C47616h.f120133a, cVar);
    }

    /* renamed from: d */
    public final Object mo167202d(String str, Continuation<? super AcceptSecretChatResponse> cVar) {
        AcceptSecretChatRequest.C49892a a = new AcceptSecretChatRequest.C49892a().mo173546a(str);
        Command command = Command.MOMENTS_ACCEPT_SECRET_CHAT;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167189a(command, a, C47609a.f120128a, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167198b(java.lang.String r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.service.MomentsPassThroughService.mo167198b(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167194a(java.lang.String r8, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.service.MomentsPassThroughService.mo167194a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo167193a(String str, String str2, Continuation<? super CheckSecretChatStatusResponse> cVar) {
        CheckSecretChatStatusRequest.C49900a aVar = new CheckSecretChatStatusRequest.C49900a();
        if (str != null) {
            aVar.mo173566a(str);
        }
        if (str2 != null) {
            aVar.mo173568b(str2);
        }
        return mo167189a(Command.MOMENTS_CHECK_SECRET_CHAT_STATUS, aVar, C47611c.f120130a, cVar);
    }

    /* renamed from: a */
    public final Object mo167190a(String str, int i, Continuation<? super Boolean> cVar) {
        PutReadNotificationsRequest.C49948a a = new PutReadNotificationsRequest.C49948a().mo173675a(str).mo173674a(Notification.Category.fromValue(i));
        Log.m165389i("MomentsPassThroughService", "putReadNotifications " + str + ' ' + i);
        Command command = Command.MOMENTS_PUT_READ_NOTIFICATIONS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167189a(command, a, new C47623o(), cVar);
    }

    /* renamed from: a */
    public final /* synthetic */ <T> Object mo167189a(Command command, Message.Builder<?, ?> builder, SdkSender.IParser<T> iParser, Continuation<? super T> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        Log.m165389i("MomentsPassThroughService", "passThroughRequest " + command);
        SdkSender.sendPassThroughRequest(command, builder, new C47617i(gVar, command, builder, iParser), iParser);
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }

    /* renamed from: b */
    public final /* synthetic */ <T> Object mo167196b(Command command, Message.Builder<?, ?> builder, SdkSender.IParser<T> iParser, Continuation<? super SdkResponse<T>> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        Log.m165389i("MomentsPassThroughService", "passThroughRequestWithErr " + command);
        SdkSender.sendPassThroughRequest(command, builder, new C47618j(gVar, command, builder, iParser), iParser);
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }

    /* renamed from: b */
    public final Object mo167197b(String str, String str2, String str3, Continuation<? super AskForSecretChatResponse> cVar) {
        AskForSecretChatRequest.C49896a c = new AskForSecretChatRequest.C49896a().mo173558c(str3);
        if (str != null) {
            c.mo173555a(str);
        }
        if (str2 != null) {
            c.mo173557b(str2);
        }
        Command command = Command.MOMENTS_ASK_FOR_SECRET_CHAT;
        Intrinsics.checkExpressionValueIsNotNull(c, "builder");
        return mo167189a(command, c, C47610b.f120129a, cVar);
    }

    /* renamed from: a */
    public final Object mo167191a(String str, AnonymousNickname anonymousNickname, String str2, Continuation<? super SdkResponse<CreateNicknameUserResponse>> cVar) {
        CreateNicknameUserRequest.C49904a a = new CreateNicknameUserRequest.C49904a().mo173579b(str).mo173576a(anonymousNickname).mo173577a(str2);
        Command command = Command.MOMENTS_CREATE_NICKNAME_USER;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return mo167196b(command, a, C47612d.f120131a, cVar);
    }

    /* renamed from: a */
    public final Object mo167192a(String str, String str2, String str3, Continuation<? super ReportResponse> cVar) {
        ReportRequest.C49950a c = new ReportRequest.C49950a().mo173680a(str).mo173682b(str2).mo173683c(str3);
        Command command = Command.MOMENTS_REPORT;
        Intrinsics.checkExpressionValueIsNotNull(c, "builder");
        return mo167189a(command, c, new C47626r(), cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m188487a(MomentsPassThroughService aVar, String str, Continuation cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return aVar.mo167198b(str, cVar);
    }
}
