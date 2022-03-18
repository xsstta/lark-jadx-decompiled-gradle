package com.ss.android.lark.mine.impl.custom_status;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.GetChatterStatusIconsRequest;
import com.bytedance.lark.pb.contact.v1.GetChatterStatusIconsResponse;
import com.bytedance.lark.pb.contact.v1.GetUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.GetUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusResponse;
import com.larksuite.rucket.impl.base.request.RequestConfigImpl;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkCall;
import com.larksuite.rucket.impl.serverimpl.annotation.ServerCall;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusRequest;
import com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ss.android.lark.mine.impl.custom_status.r */
public interface UserCustomStatusService {
    @SdkCall(Command.CREATE_USER_CUSTOM_STATUS)
    /* renamed from: a */
    RucketJob<CreateUserCustomStatusResponse> mo160694a(CreateUserCustomStatusRequest createUserCustomStatusRequest, Function1<? super RequestConfigImpl, Unit> function1);

    @SdkCall(Command.DELETE_USER_CUSTOM_STATUS)
    /* renamed from: a */
    RucketJob<DeleteUserCustomStatusResponse> mo160695a(DeleteUserCustomStatusRequest deleteUserCustomStatusRequest, Function1<? super RequestConfigImpl, Unit> function1);

    @SdkCall(Command.GET_CHATTER_STATUS_ICONS)
    /* renamed from: a */
    RucketJob<GetChatterStatusIconsResponse> mo160696a(GetChatterStatusIconsRequest getChatterStatusIconsRequest, Function1<? super RequestConfigImpl, Unit> function1);

    @SdkCall(Command.GET_USER_CUSTOM_STATUS)
    /* renamed from: a */
    RucketJob<GetUserCustomStatusResponse> mo160697a(GetUserCustomStatusRequest getUserCustomStatusRequest, Function1<? super RequestConfigImpl, Unit> function1);

    @SdkCall(Command.UPDATE_USER_CUSTOM_STATUS)
    /* renamed from: a */
    RucketJob<UpdateUserCustomStatusResponse> mo160698a(UpdateUserCustomStatusRequest updateUserCustomStatusRequest, Function1<? super RequestConfigImpl, Unit> function1);

    @ServerCall(com.ss.android.lark.pb.improto.Command.IS_ALLOWED_CREATE_USER_CUSTOM_STATUS)
    /* renamed from: a */
    RucketJob<IsAllowedCreateUserCustomStatusResponse> mo160699a(IsAllowedCreateUserCustomStatusRequest isAllowedCreateUserCustomStatusRequest, Function1<? super RequestConfigImpl, Unit> function1);

    /* renamed from: com.ss.android.lark.mine.impl.custom_status.r$a */
    public static final class C45609a {

        /* renamed from: com.ss.android.lark.mine.impl.custom_status.r$a$a */
        public static final class C45610a extends Lambda implements Function1<RequestConfigImpl, Unit> {
            public static final C45610a INSTANCE = new C45610a();

            C45610a() {
                super(1);
            }

            public final void invoke(RequestConfigImpl bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RequestConfigImpl bVar) {
                invoke(bVar);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.ss.android.lark.mine.impl.custom_status.r$a$b */
        public static final class C45611b extends Lambda implements Function1<RequestConfigImpl, Unit> {
            public static final C45611b INSTANCE = new C45611b();

            C45611b() {
                super(1);
            }

            public final void invoke(RequestConfigImpl bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RequestConfigImpl bVar) {
                invoke(bVar);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.ss.android.lark.mine.impl.custom_status.r$a$c */
        public static final class C45612c extends Lambda implements Function1<RequestConfigImpl, Unit> {
            public static final C45612c INSTANCE = new C45612c();

            C45612c() {
                super(1);
            }

            public final void invoke(RequestConfigImpl bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RequestConfigImpl bVar) {
                invoke(bVar);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.ss.android.lark.mine.impl.custom_status.r$a$d */
        public static final class C45613d extends Lambda implements Function1<RequestConfigImpl, Unit> {
            public static final C45613d INSTANCE = new C45613d();

            C45613d() {
                super(1);
            }

            public final void invoke(RequestConfigImpl bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RequestConfigImpl bVar) {
                invoke(bVar);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.ss.android.lark.mine.impl.custom_status.r$a$e */
        public static final class C45614e extends Lambda implements Function1<RequestConfigImpl, Unit> {
            public static final C45614e INSTANCE = new C45614e();

            C45614e() {
                super(1);
            }

            public final void invoke(RequestConfigImpl bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RequestConfigImpl bVar) {
                invoke(bVar);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.ss.android.lark.mine.impl.custom_status.r$a$f */
        public static final class C45615f extends Lambda implements Function1<RequestConfigImpl, Unit> {
            public static final C45615f INSTANCE = new C45615f();

            C45615f() {
                super(1);
            }

            public final void invoke(RequestConfigImpl bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RequestConfigImpl bVar) {
                invoke(bVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.r */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ RucketJob m180934a(UserCustomStatusService rVar, CreateUserCustomStatusRequest createUserCustomStatusRequest, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = C45610a.INSTANCE;
                }
                return rVar.mo160694a(createUserCustomStatusRequest, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.r */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ RucketJob m180935a(UserCustomStatusService rVar, DeleteUserCustomStatusRequest deleteUserCustomStatusRequest, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = C45611b.INSTANCE;
                }
                return rVar.mo160695a(deleteUserCustomStatusRequest, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.r */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ RucketJob m180936a(UserCustomStatusService rVar, GetChatterStatusIconsRequest getChatterStatusIconsRequest, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = C45613d.INSTANCE;
                }
                return rVar.mo160696a(getChatterStatusIconsRequest, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChatterStatusIcon");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.r */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ RucketJob m180937a(UserCustomStatusService rVar, GetUserCustomStatusRequest getUserCustomStatusRequest, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = C45612c.INSTANCE;
                }
                return rVar.mo160697a(getUserCustomStatusRequest, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.r */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ RucketJob m180938a(UserCustomStatusService rVar, UpdateUserCustomStatusRequest updateUserCustomStatusRequest, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = C45615f.INSTANCE;
                }
                return rVar.mo160698a(updateUserCustomStatusRequest, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.r */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ RucketJob m180939a(UserCustomStatusService rVar, IsAllowedCreateUserCustomStatusRequest isAllowedCreateUserCustomStatusRequest, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = C45614e.INSTANCE;
                }
                return rVar.mo160699a(isAllowedCreateUserCustomStatusRequest, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isAllowCreate");
        }
    }
}
