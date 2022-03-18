package com.ss.android.lark.create.groupchat.impl.f2f.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.LocationContent;
import com.bytedance.lark.pb.im.v1.CreateFaceToFaceApplicationRequest;
import com.bytedance.lark.pb.im.v1.CreateFaceToFaceApplicationResponse;
import com.bytedance.lark.pb.im.v1.JoinFaceToFaceChatRequest;
import com.bytedance.lark.pb.im.v1.JoinFaceToFaceChatResponse;
import com.bytedance.lark.pb.im.v1.PushFaceToFaceApplicants;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ)\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001e\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0006\u0010\u0018\u001a\u00020\u000b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/service/F2FGroupApplicantsService;", "", "()V", "fetchF2FGroupInfoByCode", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "Lcom/bytedance/lark/pb/im/v1/CreateFaceToFaceApplicationResponse;", "matchCode", "", "locationContent", "Lcom/bytedance/lark/pb/basic/v1/LocationContent;", "registerFaceToFaceApplicantsPush", "", "pushListener", "Lkotlin/Function1;", "Lcom/bytedance/lark/pb/im/v1/PushFaceToFaceApplicants;", "Lkotlin/ParameterName;", "name", "push", "requestJoinGroupChat", "userToken", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/JoinFaceToFaceChatResponse;", "unRegisterFaceToFaceApplicantsPush", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.b.a */
public final class F2FGroupApplicantsService {

    /* renamed from: a */
    public static final F2FGroupApplicantsService f93616a = new F2FGroupApplicantsService();

    private F2FGroupApplicantsService() {
    }

    /* renamed from: a */
    public final void mo133891a() {
        C53248k.m205912a().mo181696a(Command.PUSH_FACE_TO_FACE_APPLICANTS);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/service/F2FGroupApplicantsService$requestJoinGroupChat$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/JoinFaceToFaceChatResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.b.a$c */
    public static final class C36296c implements IGetDataCallback<JoinFaceToFaceChatResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f93621a;

        C36296c(IGetDataCallback iGetDataCallback) {
            this.f93621a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(JoinFaceToFaceChatResponse joinFaceToFaceChatResponse) {
            this.f93621a.onSuccess(joinFaceToFaceChatResponse);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f93621a.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/CreateFaceToFaceApplicationResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.b.a$a */
    static final class C36293a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C36293a f93617a = new C36293a();

        C36293a() {
        }

        /* renamed from: a */
        public final CreateFaceToFaceApplicationResponse parse(byte[] bArr) {
            return CreateFaceToFaceApplicationResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/JoinFaceToFaceChatResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.b.a$d */
    static final class C36297d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C36297d f93622a = new C36297d();

        C36297d() {
        }

        /* renamed from: a */
        public final JoinFaceToFaceChatResponse parse(byte[] bArr) {
            return JoinFaceToFaceChatResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: a */
    public final void mo133893a(Function1<? super PushFaceToFaceApplicants, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "pushListener");
        C53248k.m205912a().mo181697a(Command.PUSH_FACE_TO_FACE_APPLICANTS, new C36294b(function1));
    }

    /* renamed from: a */
    public final SdkSender.C53233d<CreateFaceToFaceApplicationResponse> mo133890a(int i, LocationContent locationContent) {
        if (locationContent != null) {
            return SdkSender.syncSendMayError(Command.CREATE_FACE_TO_FACE_APPLICATION, new CreateFaceToFaceApplicationRequest.C17356a().mo60931a(locationContent).mo60932a(Integer.valueOf(i)), C36293a.f93617a);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo133892a(String str, IGetDataCallback<JoinFaceToFaceChatResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.JOIN_FACE_TO_FACE_CHAT, new JoinFaceToFaceChatRequest.C17789a().mo62035a(str), new C36296c(iGetDataCallback), C36297d.f93622a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.b.a$b */
    static final class C36294b implements C53248k.AbstractC53250a {

        /* renamed from: a */
        final /* synthetic */ Function1 f93618a;

        C36294b(Function1 function1) {
            this.f93618a = function1;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            final PushFaceToFaceApplicants decode = PushFaceToFaceApplicants.ADAPTER.decode(bArr);
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.create.groupchat.impl.f2f.service.F2FGroupApplicantsService.C36294b.RunnableC362951 */

                /* renamed from: a */
                final /* synthetic */ C36294b f93619a;

                {
                    this.f93619a = r1;
                }

                public final void run() {
                    Function1 function1 = this.f93619a.f93618a;
                    PushFaceToFaceApplicants pushFaceToFaceApplicants = decode;
                    Intrinsics.checkExpressionValueIsNotNull(pushFaceToFaceApplicants, "pushFaceToFaceApplicants");
                    function1.invoke(pushFaceToFaceApplicants);
                }
            });
        }
    }
}
