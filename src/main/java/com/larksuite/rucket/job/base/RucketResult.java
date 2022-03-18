package com.larksuite.rucket.job.base;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0007*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/larksuite/rucket/job/base/RucketResult;", "R", "", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/lang/Object;", "Companion", "Error", "Success", "Lcom/larksuite/rucket/job/base/RucketResult$Success;", "Lcom/larksuite/rucket/job/base/RucketResult$Error;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.a.b */
public abstract class RucketResult<R> {

    /* renamed from: a */
    public static final Companion f65001a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/larksuite/rucket/job/base/RucketResult$Companion;", "", "()V", "canceled", "Lcom/larksuite/rucket/job/base/RucketResult;", "", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.job.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final RucketResult mo93491a() {
            return new Error(new ErrorResult("RucketJob has been canceled!"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/larksuite/rucket/job/base/RucketResult$Error;", "Lcom/larksuite/rucket/job/base/RucketResult;", "", ApiHandler.API_CALLBACK_EXCEPTION, "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/lang/Void;", "getException", "()Lcom/larksuite/framework/callback/Entity/ErrorResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.job.a.b$b */
    public static final class Error extends RucketResult {

        /* renamed from: b */
        private final ErrorResult f65002b;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Error) && Intrinsics.areEqual(this.f65002b, ((Error) obj).f65002b);
            }
            return true;
        }

        public int hashCode() {
            ErrorResult errorResult = this.f65002b;
            if (errorResult != null) {
                return errorResult.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Error(exception=" + this.f65002b + ")";
        }

        /* renamed from: c */
        public final ErrorResult mo93493c() {
            return this.f65002b;
        }

        /* renamed from: b */
        public Void mo93490a() {
            throw this.f65002b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(ErrorResult errorResult) {
            super(null);
            Intrinsics.checkParameterIsNotNull(errorResult, ApiHandler.API_CALLBACK_EXCEPTION);
            this.f65002b = errorResult;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0003\u001a\u00028\u0001X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/larksuite/rucket/job/base/RucketResult$Success;", "T", "Lcom/larksuite/rucket/job/base/RucketResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/larksuite/rucket/job/base/RucketResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.job.a.b$c */
    public static final class Success<T> extends RucketResult<T> {

        /* renamed from: b */
        private final T f65003b;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Success) && Intrinsics.areEqual(mo93490a(), ((Success) obj).mo93490a());
            }
            return true;
        }

        public int hashCode() {
            T a = mo93490a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(data=" + ((Object) mo93490a()) + ")";
        }

        @Override // com.larksuite.rucket.job.base.RucketResult
        /* renamed from: a */
        public T mo93490a() {
            return this.f65003b;
        }

        public Success(T t) {
            super(null);
            this.f65003b = t;
        }
    }

    private RucketResult() {
    }

    /* renamed from: a */
    public R mo93490a() {
        throw new NotImplementedError(null, 1, null);
    }

    public /* synthetic */ RucketResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
