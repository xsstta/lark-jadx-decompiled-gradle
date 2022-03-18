package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.larksuite.framework.callback.Entity.ErrorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "getErrorResult", "()Lcom/larksuite/framework/callback/Entity/ErrorResult;", "CreateCustomStatus", "DeleteCustomStatus", "GetRecommendAvatar", "GetUserStatus", "IsAllowedToCreateStatus", "SettingSync", "SwitchStatus", "UpdateCustomStatus", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$GetUserStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$SwitchStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$IsAllowedToCreateStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$SettingSync;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$CreateCustomStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$UpdateCustomStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$DeleteCustomStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$GetRecommendAvatar;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h */
public abstract class ErrorEvent {

    /* renamed from: a */
    private final ErrorResult f115122a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$SettingSync;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "syncField", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;)V", "getSyncField", "()Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h$f */
    public static final class SettingSync extends ErrorEvent {

        /* renamed from: a */
        private final CustomStatusSyncField f115123a;

        /* renamed from: b */
        public final CustomStatusSyncField mo160538b() {
            return this.f115123a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SettingSync(ErrorResult errorResult, CustomStatusSyncField customStatusSyncField) {
            super(errorResult, null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Intrinsics.checkParameterIsNotNull(customStatusSyncField, "syncField");
            this.f115123a = customStatusSyncField;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$SwitchStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "isOpen", "", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;Z)V", "()Z", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h$g */
    public static final class SwitchStatus extends ErrorEvent {

        /* renamed from: a */
        private final boolean f115124a;

        /* renamed from: b */
        public final boolean mo160539b() {
            return this.f115124a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SwitchStatus(ErrorResult errorResult, boolean z) {
            super(errorResult, null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            this.f115124a = z;
        }
    }

    /* renamed from: a */
    public final ErrorResult mo160537a() {
        return this.f115122a;
    }

    private ErrorEvent(ErrorResult errorResult) {
        this.f115122a = errorResult;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$CreateCustomStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h$a */
    public static final class CreateCustomStatus extends ErrorEvent {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CreateCustomStatus(ErrorResult errorResult) {
            super(errorResult, null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$DeleteCustomStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h$b */
    public static final class DeleteCustomStatus extends ErrorEvent {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeleteCustomStatus(ErrorResult errorResult) {
            super(errorResult, null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$GetRecommendAvatar;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h$c */
    public static final class GetRecommendAvatar extends ErrorEvent {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetRecommendAvatar(ErrorResult errorResult) {
            super(errorResult, null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$GetUserStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h$d */
    public static final class GetUserStatus extends ErrorEvent {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetUserStatus(ErrorResult errorResult) {
            super(errorResult, null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$IsAllowedToCreateStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h$e */
    public static final class IsAllowedToCreateStatus extends ErrorEvent {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IsAllowedToCreateStatus(ErrorResult errorResult) {
            super(errorResult, null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent$UpdateCustomStatus;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.h$h */
    public static final class UpdateCustomStatus extends ErrorEvent {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UpdateCustomStatus(ErrorResult errorResult) {
            super(errorResult, null);
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }
    }

    public /* synthetic */ ErrorEvent(ErrorResult errorResult, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorResult);
    }
}
