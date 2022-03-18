package com.bytedance.ee.bear.middleground.permission.apply;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.p464c.C9592c;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0007\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller;", "Lcom/bytedance/ee/bear/middleground/permission/apipuller/PostPuller;", "Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller$Params;", "Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller$Result;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "(Lcom/bytedance/ee/bear/contract/NetService;)V", "Params", "Result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ApplyDocPermPuller extends C9592c<Params, Result> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller$Params;", "Lcom/bytedance/ee/util/io/NonProguard;", "token", "", "obj_type", "message", "permission", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getObj_type", "getPermission", "getToken", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Params implements NonProguard {
        private final String message;
        private final String obj_type;
        private final String permission;
        private final String token;

        public final String getMessage() {
            return this.message;
        }

        public final String getObj_type() {
            return this.obj_type;
        }

        public final String getPermission() {
            return this.permission;
        }

        public final String getToken() {
            return this.token;
        }

        public Params(String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str2, "obj_type");
            Intrinsics.checkParameterIsNotNull(str3, "message");
            Intrinsics.checkParameterIsNotNull(str4, "permission");
            this.token = str;
            this.obj_type = str2;
            this.message = str3;
            this.permission = str4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyDocPermPuller$Result;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "ret", "", "getRet", "()Ljava/lang/Boolean;", "setRet", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Result implements NonProguard {
        private Boolean ret;

        public final Boolean getRet() {
            return this.ret;
        }

        public final void setRet(Boolean bool) {
            this.ret = bool;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplyDocPermPuller(NetService netService) {
        super(netService, "/api/suite/permission/apply_permission/");
        Intrinsics.checkParameterIsNotNull(netService, "netService");
    }
}
