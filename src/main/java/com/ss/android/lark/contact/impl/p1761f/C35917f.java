package com.ss.android.lark.contact.impl.p1761f;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.CollaborationExtendParam;
import com.bytedance.lark.pb.contact.v1.ExtendParam;
import com.bytedance.lark.pb.contact.v1.GetCollaborationStructureRequest;
import com.bytedance.lark.pb.contact.v1.GetCollaborationStructureResponse;
import com.bytedance.lark.pb.contact.v1.GetCollaborationTenantRequest;
import com.bytedance.lark.pb.contact.v1.GetCollaborationTenantResponse;
import com.bytedance.lark.pb.contact.v1.GetDepartmentCombineChatRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentCombineChatResponse;
import com.bytedance.lark.pb.contact.v1.GetSubordinateDepartmentsRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.DepartmentStructureResponse;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.DepartmentStructure;
import com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal;
import com.ss.android.lark.contact.impl.p1760e.C35876b;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoRequest;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.IOException;

/* renamed from: com.ss.android.lark.contact.impl.f.f */
public class C35917f implements IDepartmentServiceInternal {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.f.f$a */
    public static class C35922a {

        /* renamed from: a */
        static C35917f f92887a = new C35917f();
    }

    /* renamed from: a */
    public static C35917f m140749a() {
        return C35922a.f92887a;
    }

    /* renamed from: b */
    public IDepartmentServiceInternal.SubordinateDepartmentStructure mo132181b() {
        return (IDepartmentServiceInternal.SubordinateDepartmentStructure) SdkSender.syncSend(Command.GET_SUBORDINATE_DEPARTMENTS, new GetSubordinateDepartmentsRequest.C16268a(), new SdkSender.IParser<IDepartmentServiceInternal.SubordinateDepartmentStructure>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35917f.C359192 */

            /* renamed from: a */
            public IDepartmentServiceInternal.SubordinateDepartmentStructure parse(byte[] bArr) throws IOException {
                return C35876b.m140592a(bArr);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DepartmentStructureResponse m140748a(byte[] bArr) throws IOException {
        return C35876b.m140583a(GetDepartmentCombineChatResponse.ADAPTER.decode(bArr));
    }

    /* renamed from: c */
    public void mo132183c(IGetDataCallback<IDepartmentServiceInternal.SubordinateDepartmentStructure> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_SUBORDINATE_DEPARTMENTS, new GetSubordinateDepartmentsRequest.C16268a(), iGetDataCallback, new SdkSender.IParser<IDepartmentServiceInternal.SubordinateDepartmentStructure>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35917f.C359203 */

            /* renamed from: a */
            public IDepartmentServiceInternal.SubordinateDepartmentStructure parse(byte[] bArr) throws IOException {
                return C35876b.m140592a(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal
    /* renamed from: a */
    public void mo132177a(final IGetDataCallback<IDepartmentServiceInternal.SubordinateDepartmentStructure> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35917f.RunnableC359214 */

            public void run() {
                IDepartmentServiceInternal.SubordinateDepartmentStructure b = C35917f.this.mo132181b();
                if (b != null) {
                    iGetDataCallback.onSuccess(b);
                }
                C35917f.this.mo132183c(iGetDataCallback);
            }
        });
    }

    /* renamed from: b */
    public void mo132182b(final IGetDataCallback<GetAdminPermissionInfoResponse> iGetDataCallback) {
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.GET_ADMIN_PERMISSION_INFO;
        GetAdminPermissionInfoRequest.C50002a aVar = new GetAdminPermissionInfoRequest.C50002a();
        C359181 r2 = new IGetDataCallback<GetAdminPermissionInfoResponse>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35917f.C359181 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
                if (getAdminPermissionInfoResponse == null) {
                    onError(new ErrorResult("response is null"));
                } else {
                    iGetDataCallback.onSuccess(getAdminPermissionInfoResponse);
                }
            }
        };
        ProtoAdapter<GetAdminPermissionInfoResponse> protoAdapter = GetAdminPermissionInfoResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, r2, new SdkSender.IParser() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$PIoc97RDoCt0HfdDPiWhWVyQEts */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetAdminPermissionInfoResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal
    /* renamed from: a */
    public void mo132178a(DepartmentStructure departmentStructure, String str) {
        Department department;
        if (departmentStructure.getDepartment() == null) {
            department = new Department();
        } else {
            department = departmentStructure.getDepartment();
        }
        if (TextUtils.isEmpty(department.getId()) && TextUtils.isEmpty(department.getName())) {
            department.setName(str);
            department.setId("0");
        }
        departmentStructure.setDepartment(department);
    }

    /* renamed from: a */
    private void m140750a(ExtendParam.C16172a aVar, boolean z, boolean z2) {
        ActionType actionType;
        ActionType actionType2;
        if (C35358a.m138143a().mo130180y()) {
            if (C35358a.m138143a().mo130181z()) {
                aVar.mo58013a(ActionType.INVITE_SAME_CRYPTO_CHAT);
            } else if (z2) {
                if (z) {
                    actionType2 = ActionType.INVITE_SAME_CROSS_TENANT_CHAT;
                } else {
                    actionType2 = ActionType.INVITE_SAME_CHAT;
                }
                aVar.mo58013a(actionType2);
            }
        } else if (z2) {
            if (z) {
                actionType = ActionType.INVITE_SAME_CROSS_TENANT_CHAT;
            } else {
                actionType = ActionType.INVITE_SAME_CHAT;
            }
            aVar.mo58013a(actionType);
            aVar.mo58014a((Boolean) true);
        }
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal
    /* renamed from: a */
    public void mo132176a(int i, int i2, IGetDataCallback<GetCollaborationTenantResponse> iGetDataCallback) {
        GetCollaborationTenantRequest.C16216a b = new GetCollaborationTenantRequest.C16216a().mo58119a(Integer.valueOf(i)).mo58121b(Integer.valueOf(i2));
        Command command = Command.GET_COLLABORATION_TENANT;
        ProtoAdapter<GetCollaborationTenantResponse> protoAdapter = GetCollaborationTenantResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, b, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$c3wNuGRWwvtiiL5rwfYzNcuM8FE */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetCollaborationTenantResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal
    /* renamed from: a */
    public void mo132179a(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, IGetDataCallback<DepartmentStructureResponse> iGetDataCallback) {
        ExtendParam.C16172a a = new ExtendParam.C16172a().mo58015a(str2);
        m140750a(a, z2, z);
        a.mo58017b(true);
        a.mo58019d(Boolean.valueOf(z3));
        a.mo58018c(true);
        SdkSender.asynSendRequestNonWrap(Command.GET_DEPARTMENT_COMBINE_CHAT, new GetDepartmentCombineChatRequest.C16224a().mo58143a(str).mo58146b(Integer.valueOf(i2)).mo58142a(Integer.valueOf(i)).mo58141a((Boolean) true).mo58145b((Boolean) true).mo58140a(a.build()), iGetDataCallback, $$Lambda$f$fS49gIzhGAWxqYg_v_atmOc7OA.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal
    /* renamed from: a */
    public void mo132180a(String str, String str2, String str3, boolean z, boolean z2, int i, int i2, IGetDataCallback<GetCollaborationStructureResponse> iGetDataCallback) {
        ActionType actionType;
        ActionType actionType2;
        GetCollaborationStructureRequest.C16212a b = new GetCollaborationStructureRequest.C16212a().mo58108a(str).mo58111b(str2).mo58107a(Integer.valueOf(i)).mo58110b(Integer.valueOf(i2));
        CollaborationExtendParam.C16146a a = new CollaborationExtendParam.C16146a().mo57953a(str3);
        if (C35358a.m138143a().mo130180y()) {
            if (C35358a.m138143a().mo130181z()) {
                a.mo57952a(ActionType.INVITE_SAME_CRYPTO_CHAT);
            } else if (z) {
                if (z2) {
                    actionType2 = ActionType.INVITE_SAME_CROSS_TENANT_CHAT;
                } else {
                    actionType2 = ActionType.INVITE_SAME_CHAT;
                }
                a.mo57952a(actionType2);
            }
        } else if (z) {
            if (z2) {
                actionType = ActionType.INVITE_SAME_CROSS_TENANT_CHAT;
            } else {
                actionType = ActionType.INVITE_SAME_CHAT;
            }
            a.mo57952a(actionType);
        }
        b.mo58106a(a.build());
        Command command = Command.GET_COLLABORATION_STRUCTURE;
        ProtoAdapter<GetCollaborationStructureResponse> protoAdapter = GetCollaborationStructureResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, b, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$fjq1_VB8k8iJ2CcOqOm1PCXqgo */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetCollaborationStructureResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }
}
