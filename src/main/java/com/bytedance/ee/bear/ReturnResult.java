package com.bytedance.ee.bear;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 \r*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\r\u000eB\u0011\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\fR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/ReturnResult;", "T", "", "value", "(Ljava/lang/Object;)V", "isFailure", "", "()Z", "isSuccess", "exceptionOrNull", "", "getOrNull", "()Ljava/lang/Object;", "Companion", "Failure", "component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.f */
public final class ReturnResult<T> {

    /* renamed from: a */
    public static final Companion f20761a = new Companion(null);

    /* renamed from: b */
    private final Object f20762b;

    @JvmStatic
    /* renamed from: a */
    public static final <T> ReturnResult<T> m30667a(T t) {
        return f20761a.mo30071a((Object) t);
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> ReturnResult<T> m30668a(Throwable th) {
        return f20761a.mo30072a(th);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\t\u001a\u0002H\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/ReturnResult$Companion;", "", "()V", "failure", "Lcom/bytedance/ee/bear/ReturnResult;", "T", ApiHandler.API_CALLBACK_EXCEPTION, "", "success", "value", "(Ljava/lang/Object;)Lcom/bytedance/ee/bear/ReturnResult;", "component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final <T> ReturnResult<T> mo30071a(T t) {
            return new ReturnResult<>(t, null);
        }

        @JvmStatic
        /* renamed from: a */
        public final <T> ReturnResult<T> mo30072a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, ApiHandler.API_CALLBACK_EXCEPTION);
            return new ReturnResult<>(new Failure(th), null);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/ReturnResult$Failure;", "", ApiHandler.API_CALLBACK_EXCEPTION, "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.f$b */
    public static final class Failure {

        /* renamed from: a */
        private final Throwable f20763a;

        /* renamed from: a */
        public final Throwable mo30073a() {
            return this.f20763a;
        }

        public Failure(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, ApiHandler.API_CALLBACK_EXCEPTION);
            this.f20763a = th;
        }
    }

    /* renamed from: c */
    public final T mo30070c() {
        T t = (T) this.f20762b;
        if (t instanceof Failure) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final boolean mo30068a() {
        return this.f20762b instanceof Failure;
    }

    /* renamed from: b */
    public final Throwable mo30069b() {
        Object obj = this.f20762b;
        if (!(obj instanceof Failure)) {
            obj = null;
        }
        Failure bVar = (Failure) obj;
        if (bVar != null) {
            return bVar.mo30073a();
        }
        return null;
    }

    private ReturnResult(Object obj) {
        this.f20762b = obj;
    }

    public /* synthetic */ ReturnResult(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }
}
