package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u001e\u001fB\u0016\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0005R\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/channels/ValueOrClosed;", "T", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "closeCause", "", "closeCause$annotations", "()V", "getCloseCause-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "isClosed", "", "isClosed-impl", "(Ljava/lang/Object;)Z", "value", "value$annotations", "getValue-impl", "valueOrNull", "valueOrNull$annotations", "getValueOrNull-impl", "equals", "other", "hashCode", "", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Closed", "Companion", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.y */
public final class ValueOrClosed<T> {

    /* renamed from: a */
    public static final Companion f173526a = new Companion(null);

    /* renamed from: b */
    private final Object f173527b;

    /* renamed from: a */
    public static boolean m266779a(Object obj, Object obj2) {
        return (obj2 instanceof ValueOrClosed) && Intrinsics.areEqual(obj, ((ValueOrClosed) obj2).mo242849a());
    }

    /* renamed from: e */
    public static Object m266783e(Object obj) {
        return obj;
    }

    /* renamed from: f */
    public static final /* synthetic */ ValueOrClosed m266784f(Object obj) {
        return new ValueOrClosed(obj);
    }

    /* renamed from: g */
    public static int m266785g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo242849a() {
        return this.f173527b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u0002H\u0005H\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/ValueOrClosed$Companion;", "", "()V", "closed", "Lkotlinx/coroutines/channels/ValueOrClosed;", "E", "cause", "", "closed$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "value", "value$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.y$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public int hashCode() {
        return m266785g(this.f173527b);
    }

    public String toString() {
        return m266782d(this.f173527b);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/channels/ValueOrClosed$Closed;", "", "cause", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.y$a */
    public static final class Closed {

        /* renamed from: a */
        public final Throwable f173528a;

        public int hashCode() {
            Throwable th = this.f173528a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f173528a + ')';
        }

        public Closed(Throwable th) {
            this.f173528a = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Closed) || !Intrinsics.areEqual(this.f173528a, ((Closed) obj).f173528a)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m266778a(Object obj) {
        return obj instanceof Closed;
    }

    private /* synthetic */ ValueOrClosed(Object obj) {
        this.f173527b = obj;
    }

    public boolean equals(Object obj) {
        return m266779a(this.f173527b, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final T m266780b(Object obj) {
        if (!(obj instanceof Closed)) {
            return obj;
        }
        throw new IllegalStateException("Channel was closed".toString());
    }

    /* renamed from: c */
    public static final Throwable m266781c(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).f173528a;
        }
        throw new IllegalStateException("Channel was not closed".toString());
    }

    /* renamed from: d */
    public static String m266782d(Object obj) {
        if (obj instanceof Closed) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }
}
