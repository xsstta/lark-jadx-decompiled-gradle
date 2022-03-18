package com.ss.android.lark.todo.impl.framework.architecture;

import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "R", "", "()V", "toString", "", "DataError", "DataLoading", "DataSuccess", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult$DataSuccess;", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult$DataError;", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult$DataLoading;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.a.a */
public abstract class DataResult<R> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult$DataError;", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.a.a$a */
    public static final class DataError extends DataResult {

        /* renamed from: a */
        private final Exception f141044a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof DataError) && Intrinsics.areEqual(this.f141044a, ((DataError) obj).f141044a);
            }
            return true;
        }

        public int hashCode() {
            Exception exc = this.f141044a;
            if (exc != null) {
                return exc.hashCode();
            }
            return 0;
        }

        @Override // com.ss.android.lark.todo.impl.framework.architecture.DataResult
        public String toString() {
            return "DataError(exception=" + this.f141044a + ")";
        }

        /* renamed from: a */
        public final Exception mo194112a() {
            return this.f141044a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DataError(Exception exc) {
            super(null);
            Intrinsics.checkParameterIsNotNull(exc, ApiHandler.API_CALLBACK_EXCEPTION);
            this.f141044a = exc;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult$DataSuccess;", "T", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult$DataSuccess;", "equals", "", "other", "", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.a.a$c */
    public static final class DataSuccess<T> extends DataResult<T> {

        /* renamed from: a */
        private final T f141046a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof DataSuccess) && Intrinsics.areEqual(this.f141046a, ((DataSuccess) obj).f141046a);
            }
            return true;
        }

        public int hashCode() {
            T t = this.f141046a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        @Override // com.ss.android.lark.todo.impl.framework.architecture.DataResult
        public String toString() {
            return "DataSuccess(data=" + ((Object) this.f141046a) + ")";
        }

        /* renamed from: a */
        public final T mo194115a() {
            return this.f141046a;
        }

        public DataSuccess(T t) {
            super(null);
            this.f141046a = t;
        }
    }

    private DataResult() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult$DataLoading;", "Lcom/ss/android/lark/todo/impl/framework/architecture/DataResult;", "", "()V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.a.a$b */
    public static final class DataLoading extends DataResult {

        /* renamed from: a */
        public static final DataLoading f141045a = new DataLoading();

        private DataLoading() {
            super(null);
        }
    }

    public String toString() {
        if (this instanceof DataSuccess) {
            return "Success[data=" + ((DataSuccess) this).mo194115a() + ']';
        } else if (this instanceof DataError) {
            return "Error[exception=" + ((DataError) this).mo194112a() + ']';
        } else if (Intrinsics.areEqual(this, DataLoading.f141045a)) {
            return "Loading";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ DataResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
