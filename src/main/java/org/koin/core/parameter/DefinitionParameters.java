package org.koin.core.parameter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.NoParameterFoundException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\b\u0000\u0012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0003\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\tH\u0002¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u0002H\t\"\u0004\b\u0000\u0010\tH\u0002¢\u0006\u0002\u0010\nJ\u0014\u0010\f\u001a\u0002H\t\"\u0004\b\u0000\u0010\tH\u0002¢\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\u0002H\t\"\u0004\b\u0000\u0010\tH\u0002¢\u0006\u0002\u0010\nJ\u0014\u0010\u000e\u001a\u0002H\t\"\u0004\b\u0000\u0010\tH\u0002¢\u0006\u0002\u0010\nJ\u001b\u0010\u000f\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\t\u0018\u0001H\bJ\u001c\u0010\u0013\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J!\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u0002H\t¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0011R\u001d\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001d"}, d2 = {"Lorg/koin/core/parameter/DefinitionParameters;", "", "values", "", "([Ljava/lang/Object;)V", "getValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "component1", "T", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "elementAt", "i", "", "(I)Ljava/lang/Object;", "get", "isEmpty", "", "isNotEmpty", "set", "", "t", "(ILjava/lang/Object;)V", "size", "Companion", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.d.a */
public final class DefinitionParameters {

    /* renamed from: a */
    public static final Companion f175028a = new Companion(null);

    /* renamed from: b */
    private final Object[] f175029b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lorg/koin/core/parameter/DefinitionParameters$Companion;", "", "()V", "MAX_PARAMS", "", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: org.koin.core.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final <T> T mo246641a() {
        return (T) m268656a(0);
    }

    /* renamed from: b */
    public final <T> T mo246642b() {
        return (T) m268656a(1);
    }

    /* renamed from: c */
    public final <T> T mo246643c() {
        return (T) m268656a(2);
    }

    public DefinitionParameters(Object... objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "values");
        this.f175029b = objArr;
    }

    /* renamed from: a */
    private final <T> T m268656a(int i) {
        Object[] objArr = this.f175029b;
        if (objArr.length > i) {
            return (T) objArr[i];
        }
        throw new NoParameterFoundException("Can't get parameter value #" + i + " from " + this);
    }
}
