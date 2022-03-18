package com.ss.android.lark.auditsdk.wrapper;

import android.text.TextUtils;
import com.ss.android.lark.audit.model.Env;
import com.ss.android.lark.audit.model.OperatorEntity;
import com.ss.android.lark.auditsdk.C29385a;
import com.ss.android.lark.auditsdk.IAuditModuleDependency;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/auditsdk/wrapper/ParamCreator;", "", "()V", "mDependency", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency;", "createEnv", "", "callback", "Lcom/ss/android/lark/auditsdk/wrapper/ParamCreator$IEnvCreateCallback;", "getLarkUA", "", "getOperator", "Lcom/ss/android/lark/audit/model/OperatorEntity;", "getTenantId", "CommonParams", "Companion", "IEnvCreateCallback", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.auditsdk.b.d */
public final class ParamCreator {

    /* renamed from: a */
    public static final Companion f73499a = new Companion(null);

    /* renamed from: b */
    private final IAuditModuleDependency f73500b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/auditsdk/wrapper/ParamCreator$IEnvCreateCallback;", "", "onCreateEnv", "", "param", "Lcom/ss/android/lark/auditsdk/wrapper/ParamCreator$CommonParams;", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b.d$c */
    public interface IEnvCreateCallback {
        /* renamed from: a */
        void mo104126a(CommonParams aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/auditsdk/wrapper/ParamCreator$CommonParams;", "", "tenantId", "", "env", "Lcom/ss/android/lark/audit/model/Env;", "operator", "Lcom/ss/android/lark/audit/model/OperatorEntity;", "(Ljava/lang/String;Lcom/ss/android/lark/audit/model/Env;Lcom/ss/android/lark/audit/model/OperatorEntity;)V", "getEnv", "()Lcom/ss/android/lark/audit/model/Env;", "getOperator", "()Lcom/ss/android/lark/audit/model/OperatorEntity;", "getTenantId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b.d$a */
    public static final class CommonParams {

        /* renamed from: a */
        private final String f73501a;

        /* renamed from: b */
        private final Env f73502b;

        /* renamed from: c */
        private final OperatorEntity f73503c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonParams)) {
                return false;
            }
            CommonParams aVar = (CommonParams) obj;
            return Intrinsics.areEqual(this.f73501a, aVar.f73501a) && Intrinsics.areEqual(this.f73502b, aVar.f73502b) && Intrinsics.areEqual(this.f73503c, aVar.f73503c);
        }

        public int hashCode() {
            String str = this.f73501a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Env env = this.f73502b;
            int hashCode2 = (hashCode + (env != null ? env.hashCode() : 0)) * 31;
            OperatorEntity operatorEntity = this.f73503c;
            if (operatorEntity != null) {
                i = operatorEntity.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "CommonParams(tenantId=" + this.f73501a + ", env=" + this.f73502b + ", operator=" + this.f73503c + ")";
        }

        /* renamed from: a */
        public final String mo104139a() {
            return this.f73501a;
        }

        /* renamed from: b */
        public final Env mo104140b() {
            return this.f73502b;
        }

        /* renamed from: c */
        public final OperatorEntity mo104141c() {
            return this.f73503c;
        }

        public CommonParams(String str, Env env, OperatorEntity operatorEntity) {
            Intrinsics.checkParameterIsNotNull(str, "tenantId");
            Intrinsics.checkParameterIsNotNull(env, "env");
            Intrinsics.checkParameterIsNotNull(operatorEntity, "operator");
            this.f73501a = str;
            this.f73502b = env;
            this.f73503c = operatorEntity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/auditsdk/wrapper/ParamCreator$Companion;", "", "()V", "TAG", "", "checkEnvValid", "", "param", "Lcom/ss/android/lark/auditsdk/wrapper/ParamCreator$CommonParams;", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b.d$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo104145a(CommonParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "param");
            return !TextUtils.isEmpty(aVar.mo104140b().did);
        }
    }

    /* renamed from: a */
    private final String m108124a() {
        return this.f73500b.mo104099d();
    }

    /* renamed from: b */
    private final String m108125b() {
        return this.f73500b.mo104100e();
    }

    public ParamCreator() {
        IAuditModuleDependency a = C29385a.m108005a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AuditModule.getDependency()");
        this.f73500b = a;
    }

    /* renamed from: c */
    private final OperatorEntity m108126c() {
        return new OperatorEntity(1, this.f73500b.mo104101f(), null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/auditsdk/wrapper/ParamCreator$createEnv$1", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency$IGetDeviceIdCallback;", "onError", "", "error", "", "onSuccess", "deviceId", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.auditsdk.b.d$d */
    public static final class C29401d implements IAuditModuleDependency.IGetDeviceIdCallback {

        /* renamed from: a */
        final /* synthetic */ String f73504a;

        /* renamed from: b */
        final /* synthetic */ IEnvCreateCallback f73505b;

        /* renamed from: c */
        final /* synthetic */ String f73506c;

        /* renamed from: d */
        final /* synthetic */ OperatorEntity f73507d;

        @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency.IGetDeviceIdCallback
        /* renamed from: a */
        public void mo104104a(String str) {
            this.f73505b.mo104126a(new CommonParams(this.f73506c, new Env(2, str, "", this.f73504a, "", 0), this.f73507d));
        }

        @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency.IGetDeviceIdCallback
        /* renamed from: b */
        public void mo104105b(String str) {
            Log.m165383e("AuditSdk", "create env: get deviceId failed");
            this.f73505b.mo104126a(new CommonParams(this.f73506c, new Env(2, null, "", this.f73504a, "", 0), this.f73507d));
        }

        C29401d(String str, IEnvCreateCallback cVar, String str2, OperatorEntity operatorEntity) {
            this.f73504a = str;
            this.f73505b = cVar;
            this.f73506c = str2;
            this.f73507d = operatorEntity;
        }
    }

    /* renamed from: a */
    public final void mo104138a(IEnvCreateCallback cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        this.f73500b.mo104094a(new C29401d(m108124a(), cVar, m108125b(), m108126c()));
    }
}
