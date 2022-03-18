package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(CC)V", "getEndInclusive", "()Ljava/lang/Character;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.ranges.c */
public final class CharRange extends CharProgression implements ClosedRange<Character> {

    /* renamed from: b */
    public static final CharRange f173231b = new CharRange((char) 1, (char) 0);

    /* renamed from: c */
    public static final Companion f173232c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.ranges.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final CharRange mo239380a() {
            return CharRange.f173231b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.CharProgression
    /* renamed from: e */
    public boolean mo239367e() {
        if (mo239363a() > mo239364b()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Character mo239377g() {
        return Character.valueOf(mo239363a());
    }

    /* renamed from: h */
    public Character mo239379i() {
        return Character.valueOf(mo239364b());
    }

    @Override // kotlin.ranges.CharProgression
    public int hashCode() {
        if (mo239367e()) {
            return -1;
        }
        return (mo239363a() * 31) + mo239364b();
    }

    @Override // kotlin.ranges.CharProgression
    public String toString() {
        return mo239363a() + ".." + mo239364b();
    }

    /* renamed from: a */
    public boolean mo239374a(char c) {
        if (mo239363a() > c || c > mo239364b()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedRange
    /* renamed from: a */
    public /* synthetic */ boolean mo239375a(Character ch) {
        return mo239374a(ch.charValue());
    }

    @Override // kotlin.ranges.CharProgression
    public boolean equals(Object obj) {
        if (obj instanceof CharRange) {
            if (!mo239367e() || !((CharRange) obj).mo239367e()) {
                CharRange cVar = (CharRange) obj;
                if (!(mo239363a() == cVar.mo239363a() && mo239364b() == cVar.mo239364b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public CharRange(char c, char c2) {
        super(c, c2, 1);
    }
}
