package com.ss.android.lark.contact.impl.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.GetInactiveParentsRequest;
import com.bytedance.lark.pb.contact.v1.InviteMode;
import com.bytedance.lark.pb.contact.v1.OneKeyInviteInactiveRequest;
import com.bytedance.lark.pb.contact.v1.OneKeyInviteInactiveResponse;
import com.bytedance.lark.pb.contact.v1.PullSchoolNodeRequest;
import com.bytedance.lark.pb.contact.v1.PullSchoolNodeResponse;
import com.bytedance.lark.pb.contact.v1.SendInvitationToInactiveRequest;
import com.bytedance.lark.pb.contact.v1.SendInvitationToInactiveResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.contact.dto.DepartmentStructureResponse;
import com.ss.android.lark.contact.dto.GetInactiveParentsResponse;
import com.ss.android.lark.contact.impl.interfaces.ISchoolServiceInternal;
import com.ss.android.lark.contact.impl.p1760e.C35876b;
import com.ss.android.lark.sdk.SdkSender;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016J<\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0016J,\u0010\u0013\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0016J<\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00122\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\rH\u0016J<\u0010\u0019\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00122\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\rH\u0016J,\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/contact/impl/service/SchoolParentService;", "Lcom/ss/android/lark/contact/impl/interfaces/ISchoolServiceInternal;", "()V", "TAG", "", "getInvitationParentsFromNet", "", "departmentId", "chatId", "limit", "", "offset", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/GetInactiveParentsResponse;", "getInvitationToInactiveFromNet", "parentIds", "", "", "getOneKeyInvitationFromNet", "getSchoolNodeList", "schoolNodeId", "count", "getInactiveParents", "Lcom/ss/android/lark/contact/dto/DepartmentStructureResponse;", "getSchoolNodeListFromNet", "synGetSchoolNodeListFromDB", "Companion", "InstanceHolder", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.f.h */
public class SchoolParentService implements ISchoolServiceInternal {

    /* renamed from: a */
    public static final Companion f92889a = new Companion(null);

    /* renamed from: b */
    private final String f92890b = "SchoolParentService";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/service/SchoolParentService$Companion;", "", "()V", "inst", "Lcom/ss/android/lark/contact/impl/service/SchoolParentService;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.f.h$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final SchoolParentService mo132192a() {
            return InstanceHolder.f92891a.mo132193a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/impl/service/SchoolParentService$InstanceHolder;", "", "()V", "service", "Lcom/ss/android/lark/contact/impl/service/SchoolParentService;", "getService", "()Lcom/ss/android/lark/contact/impl/service/SchoolParentService;", "setService", "(Lcom/ss/android/lark/contact/impl/service/SchoolParentService;)V", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.f.h$b */
    public static final class InstanceHolder {

        /* renamed from: a */
        public static final InstanceHolder f92891a = new InstanceHolder();

        /* renamed from: b */
        private static SchoolParentService f92892b = new SchoolParentService();

        private InstanceHolder() {
        }

        /* renamed from: a */
        public final SchoolParentService mo132193a() {
            return f92892b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/contact/dto/GetInactiveParentsResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.f.h$c */
    static final class C35925c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C35925c f92893a = new C35925c();

        C35925c() {
        }

        /* renamed from: a */
        public final GetInactiveParentsResponse parse(byte[] bArr) {
            return C35876b.m140585a(com.bytedance.lark.pb.contact.v1.GetInactiveParentsResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.f.h$d */
    static final class C35926d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C35926d f92894a = new C35926d();

        C35926d() {
        }

        /* renamed from: a */
        public final boolean mo132195a(byte[] bArr) {
            if (SendInvitationToInactiveResponse.ADAPTER.decode(bArr) != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            return Boolean.valueOf(mo132195a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.f.h$e */
    static final class C35927e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C35927e f92895a = new C35927e();

        C35927e() {
        }

        /* renamed from: a */
        public final boolean mo132196a(byte[] bArr) {
            if (OneKeyInviteInactiveResponse.ADAPTER.decode(bArr) != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            return Boolean.valueOf(mo132196a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/contact/dto/DepartmentStructureResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.f.h$f */
    static final class C35928f<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C35928f f92896a = new C35928f();

        C35928f() {
        }

        /* renamed from: a */
        public final DepartmentStructureResponse parse(byte[] bArr) {
            return C35876b.m140584a(PullSchoolNodeResponse.ADAPTER.decode(bArr));
        }
    }

    /* renamed from: a */
    public void mo132190a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.ONE_KEY_INVITE_INACTIVE, new OneKeyInviteInactiveRequest.C16334a().mo58393a(str).mo58395b(str2), iGetDataCallback, C35927e.f92895a);
    }

    /* renamed from: a */
    public void mo132191a(String str, String str2, List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SEND_INVITATION_TO_INACTIVE, new SendInvitationToInactiveRequest.C16368a().mo58472a(list).mo58470a(InviteMode.SELECTED).mo58471a(str).mo58474b(str2), iGetDataCallback, C35926d.f92894a);
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.ISchoolServiceInternal
    /* renamed from: a */
    public void mo132188a(String str, int i, int i2, boolean z, IGetDataCallback<DepartmentStructureResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_SCHOOL_NODE, new PullSchoolNodeRequest.C16346a().mo58423a(str).mo58425b(Integer.valueOf(i2)).mo58422a(Integer.valueOf(i)).mo58421a(Boolean.valueOf(z)), iGetDataCallback, C35928f.f92896a);
    }

    /* renamed from: a */
    public void mo132189a(String str, String str2, int i, int i2, IGetDataCallback<GetInactiveParentsResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_INACTIVE_PARENTS, new GetInactiveParentsRequest.C16248a().mo58207a(str).mo58210b(str2).mo58206a(Integer.valueOf(i)).mo58209b(Integer.valueOf(i2)), iGetDataCallback, C35925c.f92893a);
    }
}
