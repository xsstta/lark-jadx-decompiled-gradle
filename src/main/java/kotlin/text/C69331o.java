package kotlin.text;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.internal.C69098b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C69294l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.o */
class C69331o extends C69330n {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.text.o$a */
    public static final class C69332a extends Lambda implements Function1<String, String> {
        public static final C69332a INSTANCE = new C69332a();

        C69332a() {
            super(1);
        }

        public final String invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "line");
            return str;
        }
    }

    public static final String trimIndent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$trimIndent");
        return StringsKt.replaceIndent(str, "");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.text.o$b */
    public static final class C69333b extends Lambda implements Function1<String, String> {
        final /* synthetic */ String $indent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69333b(String str) {
            super(1);
            this.$indent = str;
        }

        public final String invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "line");
            return this.$indent + str;
        }
    }

    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C69332a.INSTANCE;
        }
        return new C69333b(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.text.o$c */
    static final class C69334c extends Lambda implements Function1<String, String> {
        final /* synthetic */ String $indent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69334c(String str) {
            super(1);
            this.$indent = str;
        }

        public final String invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            if (!StringsKt.isBlank(str)) {
                return this.$indent + str;
            } else if (str.length() < this.$indent.length()) {
                return this.$indent;
            } else {
                return str;
            }
        }
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        String str2 = str;
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C69321a.m266165a(str2.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    public static final String trimMargin(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$trimMargin");
        Intrinsics.checkParameterIsNotNull(str2, "marginPrefix");
        return StringsKt.replaceIndentByMargin(str, "", str2);
    }

    public static final String prependIndent(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$prependIndent");
        Intrinsics.checkParameterIsNotNull(str2, "indent");
        return C69294l.m266126a(C69294l.m266140e(StringsKt.lineSequence(str), new C69334c(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    public static final String replaceIndent(String str, String str2) {
        int i;
        String invoke;
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceIndent");
        Intrinsics.checkParameterIsNotNull(str2, "newIndent");
        List<String> lines = StringsKt.lines(str);
        List<String> list = lines;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!StringsKt.isBlank(t)) {
                arrayList.add(t);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (String str3 : arrayList2) {
            arrayList3.add(Integer.valueOf(indentWidth$StringsKt__IndentKt(str3)));
        }
        Integer num = (Integer) CollectionsKt.min((Iterable) arrayList3);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * lines.size());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList4 = new ArrayList();
        for (T t2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t3 = t2;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt.isBlank(t3)) {
                t3 = null;
            } else {
                String drop = StringsKt.drop((String) t3, i);
                if (!(drop == null || (invoke = indentFunction$StringsKt__IndentKt.invoke(drop)) == 0)) {
                    t3 = invoke;
                }
            }
            if (t3 != null) {
                arrayList4.add(t3);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) CollectionsKt.joinTo$default(arrayList4, new StringBuilder(length), "\n", null, null, 0, null, null, SmActions.ACTION_CALLING_EXIT, null)).toString();
        Intrinsics.checkExpressionValueIsNotNull(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.String] */
    public static final String replaceIndentByMargin(String str, String str2, String str3) {
        int i;
        String invoke;
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceIndentByMargin");
        Intrinsics.checkParameterIsNotNull(str2, "newIndent");
        Intrinsics.checkParameterIsNotNull(str3, "marginPrefix");
        if (!StringsKt.isBlank(str3)) {
            List<String> lines = StringsKt.lines(str);
            int length = str.length() + (str2.length() * lines.size());
            Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
            int lastIndex = CollectionsKt.getLastIndex(lines);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T t : lines) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                String str4 = null;
                if ((i2 == 0 || i2 == lastIndex) && StringsKt.isBlank(t2)) {
                    t2 = null;
                } else {
                    T t3 = t2;
                    int length2 = t3.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C69321a.m266165a(t3.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1 && StringsKt.startsWith$default((String) t2, str3, i, false, 4, (Object) null)) {
                        int length3 = i + str3.length();
                        if (t2 != null) {
                            str4 = t2.substring(length3);
                            Intrinsics.checkExpressionValueIsNotNull(str4, "(this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    if (!(str4 == null || (invoke = indentFunction$StringsKt__IndentKt.invoke(str4)) == 0)) {
                        t2 = invoke;
                    }
                }
                if (t2 != null) {
                    arrayList.add(t2);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) CollectionsKt.joinTo$default(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, SmActions.ACTION_CALLING_EXIT, null)).toString();
            Intrinsics.checkExpressionValueIsNotNull(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return StringsKt.prependIndent(str, str2);
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return StringsKt.replaceIndent(str, str2);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return StringsKt.trimMargin(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    private static final String reindent$StringsKt__IndentKt(List<String> list, int i, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        String invoke;
        int lastIndex = CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (C69098b.m265896a(1, 3, 0)) {
                    CollectionsKt.throwIndexOverflow();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            T t2 = t;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt.isBlank(t2)) {
                t2 = null;
            } else {
                String invoke2 = function12.invoke(t2);
                if (!(invoke2 == null || (invoke = function1.invoke(invoke2)) == 0)) {
                    t2 = invoke;
                }
            }
            if (t2 != null) {
                arrayList.add(t2);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) CollectionsKt.joinTo$default(arrayList, new StringBuilder(i), "\n", null, null, 0, null, null, SmActions.ACTION_CALLING_EXIT, null)).toString();
        Intrinsics.checkExpressionValueIsNotNull(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return StringsKt.replaceIndentByMargin(str, str2, str3);
    }
}
