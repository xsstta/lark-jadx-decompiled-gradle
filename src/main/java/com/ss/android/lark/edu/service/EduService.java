package com.ss.android.lark.edu.service;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.bytedance.lark.pb.im.v1.Class;
import com.bytedance.lark.pb.im.v1.CreateHomeSchoolChatRequest;
import com.bytedance.lark.pb.im.v1.CreateHomeSchoolChatResponse;
import com.bytedance.lark.pb.im.v1.EduJoinChatRequest;
import com.bytedance.lark.pb.im.v1.EduJoinChatResponse;
import com.bytedance.lark.pb.im.v1.GetHomeSchoolChatClassRequest;
import com.bytedance.lark.pb.im.v1.GetHomeSchoolChatClassResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.edu.dto.ClassInfo;
import com.ss.android.lark.edu.dto.ClassInfoResponse;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016J\u0018\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fH\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/edu/service/EduService;", "Lcom/ss/android/lark/edu/service/IEduService;", "()V", "TAG", "", "createEduGroupChat", "", "classInfo", "Lcom/ss/android/lark/edu/dto/ClassInfo;", "context", "Landroid/content/Context;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getDepartmentInvitationUrl", "chatId", "inviterId", "pullClassInfoList", "offset", "", "Lcom/ss/android/lark/edu/dto/ClassInfoResponse;", "requestJoinEduGroup", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "Lcom/bytedance/lark/pb/im/v1/EduJoinChatResponse;", "classId", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.b.a */
public final class EduService {

    /* renamed from: a */
    public static final EduService f94922a = new EduService();

    private EduService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.b.a$a */
    static final class C36922a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C36922a f94923a = new C36922a();

        C36922a() {
        }

        /* renamed from: a */
        public final String parse(byte[] bArr) {
            return CreateHomeSchoolChatResponse.ADAPTER.decode(bArr).chat_id;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/contact/v1/GetDepartmentInvitationUrlResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.b.a$b */
    public static final class C36923b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C36923b f94924a = new C36923b();

        C36923b() {
        }

        /* renamed from: a */
        public final GetDepartmentInvitationUrlResponse parse(byte[] bArr) {
            return GetDepartmentInvitationUrlResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012,\u0010\u0003\u001a( \u0002*\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00070\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/EduJoinChatResponse;", "kotlin.jvm.PlatformType", "p1", "", "Lkotlin/ParameterName;", "name", "p0", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.b.a$d */
    static final /* synthetic */ class C36925d extends FunctionReference implements Function1<byte[], EduJoinChatResponse> {
        C36925d(ProtoAdapter protoAdapter) {
            super(1, protoAdapter);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "decode";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ProtoAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "decode([B)Ljava/lang/Object;";
        }

        public final EduJoinChatResponse invoke(byte[] bArr) {
            return (EduJoinChatResponse) ((ProtoAdapter) this.receiver).decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/edu/dto/ClassInfoResponse;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.b.a$c */
    static final class C36924c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ int f94925a;

        C36924c(int i) {
            this.f94925a = i;
        }

        /* renamed from: a */
        public final ClassInfoResponse parse(byte[] bArr) {
            GetHomeSchoolChatClassResponse decode = GetHomeSchoolChatClassResponse.ADAPTER.decode(bArr);
            ClassInfoResponse aVar = new ClassInfoResponse();
            Boolean bool = decode.has_more;
            Intrinsics.checkExpressionValueIsNotNull(bool, "pbResponse.has_more");
            aVar.mo136409a(bool.booleanValue());
            aVar.mo136406a(this.f94925a);
            List<String> list = decode.is_director_class_ids;
            Intrinsics.checkExpressionValueIsNotNull(list, "pbResponse.is_director_class_ids");
            Set set = CollectionsKt.toSet(list);
            List<Class> list2 = decode.classes;
            Intrinsics.checkExpressionValueIsNotNull(list2, "pbResponse.classes");
            List<Class> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(ClassInfo.m145876a(it.next(), set));
            }
            aVar.mo136408a(arrayList);
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo136306a(String str, String str2) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "inviterId");
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_DEPARTMENT_INVITATION_URL, new GetDepartmentInvitationUrlRequest.C16232a().mo58168c(str2).mo58167b(str).mo58164a(InvitationSource.HOME_SCHOOL_CHAT), C36923b.f94924a);
        if (syncSendMayError == null || (t = syncSendMayError.f131572a) == null) {
            return null;
        }
        return t.invitation_url;
    }

    /* renamed from: b */
    public SdkSender.C53233d<EduJoinChatResponse> mo136309b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "classId");
        SdkSender.C53233d<EduJoinChatResponse> syncSendMayError = SdkSender.syncSendMayError(Command.EDU_JOIN_CHAT, new EduJoinChatRequest.C17450a().mo61184a(str).mo61186b(str2), new C36926b(new C36925d(EduJoinChatResponse.ADAPTER)));
        Intrinsics.checkExpressionValueIsNotNull(syncSendMayError, "SdkSender.syncSendMayErr…Response.ADAPTER::decode)");
        Intrinsics.checkExpressionValueIsNotNull(syncSendMayError, "let {\n        SdkSender.…se.ADAPTER::decode)\n    }");
        return syncSendMayError;
    }

    /* renamed from: a */
    public void mo136307a(int i, IGetDataCallback<ClassInfoResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_HOME_SCHOOL_CHAT_CLASS, new GetHomeSchoolChatClassRequest.C17589a().mo61544a(30).mo61546b(Integer.valueOf(i)), iGetDataCallback, new C36924c(i));
    }

    /* renamed from: a */
    public void mo136308a(ClassInfo classInfo, Context context, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(classInfo, "classInfo");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.CREATE_HOME_SCHOOL_CHAT, new CreateHomeSchoolChatRequest.C17360a().mo60941a(classInfo.mo136387a()).mo60943b(classInfo.mo136390b()), iGetDataCallback, C36922a.f94923a);
    }
}
