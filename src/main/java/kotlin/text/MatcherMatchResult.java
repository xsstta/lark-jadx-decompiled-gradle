package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.sequences.C69294l;
import kotlin.text.MatchResult;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.text.k */
public final class MatcherMatchResult implements MatchResult {

    /* renamed from: a */
    private final MatchGroupCollection f173361a = new C69327b(this);

    /* renamed from: b */
    private List<String> f173362b;

    /* renamed from: c */
    private final Matcher f173363c;

    /* renamed from: d */
    private final CharSequence f173364d;

    @Override // kotlin.text.MatchResult
    /* renamed from: d */
    public MatchResult.Destructured mo242583d() {
        return MatchResult.C69325a.m266175a(this);
    }

    /* renamed from: f */
    public final java.util.regex.MatchResult mo242586f() {
        return this.f173363c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.text.k$a */
    public static final class C69326a extends AbstractList<String> {

        /* renamed from: b */
        final /* synthetic */ MatcherMatchResult f173365b;

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int mo109135b() {
            return this.f173365b.mo242586f().groupCount() + 1;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69326a(MatcherMatchResult kVar) {
            this.f173365b = kVar;
        }

        /* renamed from: a */
        public int mo242587a(String str) {
            return super.indexOf(str);
        }

        /* renamed from: b */
        public int mo242589b(String str) {
            return super.lastIndexOf(str);
        }

        /* renamed from: c */
        public boolean mo242590c(String str) {
            return super.contains(str);
        }

        /* renamed from: a */
        public String get(int i) {
            String group = this.f173365b.mo242586f().group(i);
            if (group != null) {
                return group;
            }
            return "";
        }

        @Override // kotlin.collections.AbstractCollection
        public final boolean contains(Object obj) {
            if (obj instanceof String) {
                return mo242590c((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList
        public final int indexOf(Object obj) {
            if (obj instanceof String) {
                return mo242587a((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList
        public final int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return mo242589b((String) obj);
            }
            return -1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.text.k$b */
    public static final class C69327b extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {

        /* renamed from: a */
        final /* synthetic */ MatcherMatchResult f173366a;

        @Override // kotlin.collections.AbstractCollection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int mo109135b() {
            return this.f173366a.mo242586f().groupCount() + 1;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<MatchGroup> iterator() {
            return C69294l.m266140e(CollectionsKt.asSequence(CollectionsKt.getIndices(this)), new C69328a(this)).mo4717a();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: kotlin.text.k$b$a */
        static final class C69328a extends Lambda implements Function1<Integer, MatchGroup> {
            final /* synthetic */ C69327b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69328a(C69327b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            public final MatchGroup invoke(int i) {
                return this.this$0.mo242591a(i);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ MatchGroup invoke(Integer num) {
                return invoke(num.intValue());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69327b(MatcherMatchResult kVar) {
            this.f173366a = kVar;
        }

        /* renamed from: a */
        public boolean mo242592a(MatchGroup gVar) {
            return super.contains(gVar);
        }

        @Override // kotlin.collections.AbstractCollection
        public final boolean contains(Object obj) {
            boolean z;
            if (obj != null) {
                z = obj instanceof MatchGroup;
            } else {
                z = true;
            }
            if (z) {
                return mo242592a((MatchGroup) obj);
            }
            return false;
        }

        /* renamed from: a */
        public MatchGroup mo242591a(int i) {
            IntRange a = C69329l.m266193a(this.f173366a.mo242586f(), i);
            if (a.mo239377g().intValue() < 0) {
                return null;
            }
            String group = this.f173366a.mo242586f().group(i);
            Intrinsics.checkExpressionValueIsNotNull(group, "matchResult.group(index)");
            return new MatchGroup(group, a);
        }
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: a */
    public IntRange mo242580a() {
        return C69329l.m266192a(mo242586f());
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: b */
    public String mo242581b() {
        String group = mo242586f().group();
        Intrinsics.checkExpressionValueIsNotNull(group, "matchResult.group()");
        return group;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: c */
    public List<String> mo242582c() {
        if (this.f173362b == null) {
            this.f173362b = new C69326a(this);
        }
        List<String> list = this.f173362b;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        return list;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: e */
    public MatchResult mo242584e() {
        int i;
        int end = mo242586f().end();
        if (mo242586f().end() == mo242586f().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f173364d.length()) {
            return null;
        }
        Matcher matcher = this.f173363c.pattern().matcher(this.f173364d);
        Intrinsics.checkExpressionValueIsNotNull(matcher, "matcher.pattern().matcher(input)");
        return C69329l.m266194a(matcher, i2, this.f173364d);
    }

    public MatcherMatchResult(Matcher matcher, CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(matcher, "matcher");
        Intrinsics.checkParameterIsNotNull(charSequence, "input");
        this.f173363c = matcher;
        this.f173364d = charSequence;
    }
}
