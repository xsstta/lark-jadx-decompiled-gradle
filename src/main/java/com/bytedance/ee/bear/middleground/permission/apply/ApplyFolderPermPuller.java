package com.bytedance.ee.bear.middleground.permission.apply;

import com.bytedance.ee.bear.middleground.permission.p464c.C9592c;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0007\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyFolderPermPuller;", "Lcom/bytedance/ee/bear/middleground/permission/apipuller/PostPuller;", "Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyFolderPermPuller$Params;", "Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyFolderPermPuller$Result;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "(Lcom/bytedance/ee/bear/contract/NetService;)V", "Params", "Result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ApplyFolderPermPuller extends C9592c<Params, Result> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyFolderPermPuller$Result;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Result implements NonProguard {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/ApplyFolderPermPuller$Params;", "Lcom/bytedance/ee/util/io/NonProguard;", "token", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getToken", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Params implements NonProguard {
        private final String message;
        private final String token;

        public final String getMessage() {
            return this.message;
        }

        public final String getToken() {
            return this.token;
        }

        public Params(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            this.token = str;
            this.message = str2;
        }
    }
}
