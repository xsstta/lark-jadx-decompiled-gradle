package kotlin.io;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\b\u001a5\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\bø\u0001\u0000¢\u0006\u0002\u0010\u001f\u0002\b\n\u0006\b\u0011(\u001e0\u0001¨\u0006 "}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlin.io.n */
public final class C69111n {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.io.n$a */
    static final class C69112a extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ ArrayList $result;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69112a(ArrayList arrayList) {
            super(1);
            this.$result = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            this.$result.add(str);
        }
    }

    /* renamed from: b */
    public static final String m265945b(Reader reader) {
        Intrinsics.checkParameterIsNotNull(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        m265941a(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkExpressionValueIsNotNull(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    /* renamed from: a */
    public static final List<String> m265942a(Reader reader) {
        Intrinsics.checkParameterIsNotNull(reader, "$this$readLines");
        ArrayList arrayList = new ArrayList();
        m265944a(reader, new C69112a(arrayList));
        return arrayList;
    }

    /* renamed from: a */
    public static final Sequence<String> m265943a(BufferedReader bufferedReader) {
        Intrinsics.checkParameterIsNotNull(bufferedReader, "$this$lineSequence");
        return C69294l.m266122b(new LinesSequence(bufferedReader));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        kotlin.io.C69101b.m265907a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m265944a(java.io.Reader r3, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r4) {
        /*
            java.lang.String r0 = "$this$forEachLine"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            java.io.Closeable r3 = (java.io.Closeable) r3
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = r3
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ all -> 0x003d }
            kotlin.sequences.i r1 = m265943a(r1)     // Catch:{ all -> 0x003d }
            java.util.Iterator r1 = r1.mo4717a()     // Catch:{ all -> 0x003d }
        L_0x0029:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003d }
            r4.invoke(r2)     // Catch:{ all -> 0x003d }
            goto L_0x0029
        L_0x0037:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003d }
            kotlin.io.C69101b.m265907a(r3, r0)
            return
        L_0x003d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            kotlin.io.C69101b.m265907a(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.C69111n.m265944a(java.io.Reader, kotlin.jvm.functions.Function1):void");
    }

    /* renamed from: a */
    public static final long m265940a(Reader reader, Writer writer, int i) {
        Intrinsics.checkParameterIsNotNull(reader, "$this$copyTo");
        Intrinsics.checkParameterIsNotNull(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: a */
    public static /* synthetic */ long m265941a(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m265940a(reader, writer, i);
    }
}
