package kotlin;

import com.tt.frontendapiinterface.ApiHandler;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0016\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0004\b\u0017\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isFailure", "", "isFailure-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isSuccess-impl", "value$annotations", "()V", "equals", "other", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", "hashCode", "", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Failure", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
public final class Result<T> implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final Object value;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Result m271568boximpl(Object obj) {
        return new Result(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static Object m271569constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m271570equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).m271578unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m271571equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m271574hashCodeimpl(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static /* synthetic */ void value$annotations() {
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m271578unboximpl() {
        return this.value;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\bø\u0001\u0000¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u0002H\u0005H\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/Result$Companion;", "", "()V", "failure", "Lkotlin/Result;", "T", ApiHandler.API_CALLBACK_EXCEPTION, "", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "success", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.Result$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", ApiHandler.API_CALLBACK_EXCEPTION, "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }

        public Failure(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, ApiHandler.API_CALLBACK_EXCEPTION);
            this.exception = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Failure) || !Intrinsics.areEqual(this.exception, ((Failure) obj).exception)) {
                return false;
            }
            return true;
        }
    }

    public int hashCode() {
        return m271574hashCodeimpl(this.value);
    }

    public String toString() {
        return m271577toStringimpl(this.value);
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m271575isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    private /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrNull-impl  reason: not valid java name */
    private static final T m271573getOrNullimpl(Object obj) {
        if (m271575isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m271576isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    public boolean equals(Object obj) {
        return m271570equalsimpl(this.value, obj);
    }

    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m271572exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m271577toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
