package kotlin.io;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a(\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a(\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/io/FilesKt")
/* renamed from: kotlin.io.k */
class C69108k extends C69107j {
    /* renamed from: a */
    private static final FilePathComponents m265931a(FilePathComponents dVar) {
        return new FilePathComponents(dVar.mo239212b(), m265930a(dVar.mo239213c()));
    }

    /* renamed from: d */
    public static final String m265935d(File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$extension");
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        return StringsKt.substringAfterLast(name, '.', "");
    }

    /* renamed from: e */
    public static final String m265936e(File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$nameWithoutExtension");
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        return StringsKt.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
    }

    /* renamed from: f */
    public static final boolean m265937f(File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$deleteRecursively");
        Iterator a = C69104g.m265926c(file).mo4717a();
        while (true) {
            boolean z = true;
            while (true) {
                if (!a.hasNext()) {
                    return z;
                }
                File file2 = (File) a.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: a */
    private static final List<File> m265930a(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != 46) {
                    if (hashCode == 1472 && name.equals("..")) {
                        if (arrayList.isEmpty() || !(!Intrinsics.areEqual(((File) CollectionsKt.last((List) arrayList)).getName(), ".."))) {
                            arrayList.add(file);
                        } else {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                } else if (name.equals(".")) {
                }
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", C13998f.f36682a, "Ljava/io/File;", "e", "Ljava/io/IOException;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.io.k$a */
    static final class C69109a extends Lambda implements Function2<File, IOException, Unit> {
        final /* synthetic */ Function2 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69109a(Function2 kVar) {
            super(2);
            this.$onError = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(File file, IOException iOException) {
            invoke(file, iOException);
            return Unit.INSTANCE;
        }

        public final void invoke(File file, IOException iOException) {
            Intrinsics.checkParameterIsNotNull(file, C13998f.f36682a);
            Intrinsics.checkParameterIsNotNull(iOException, "e");
            if (((OnErrorAction) this.$onError.invoke(file, iOException)) == OnErrorAction.TERMINATE) {
                throw new TerminateException(file);
            }
        }
    }

    /* renamed from: a */
    public static final String m265929a(File file, File file2) {
        Intrinsics.checkParameterIsNotNull(file, "$this$toRelativeString");
        Intrinsics.checkParameterIsNotNull(file2, "base");
        String c = m265934c(file, file2);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    /* renamed from: b */
    public static final boolean m265933b(File file, File file2) {
        Intrinsics.checkParameterIsNotNull(file, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(file2, "other");
        FilePathComponents a = C69104g.m265923a(file);
        FilePathComponents a2 = C69104g.m265923a(file2);
        if (!(!Intrinsics.areEqual(a.mo239212b(), a2.mo239212b())) && a.mo239211a() >= a2.mo239211a()) {
            return a.mo239213c().subList(0, a2.mo239211a()).equals(a2.mo239213c());
        }
        return false;
    }

    /* renamed from: c */
    private static final String m265934c(File file, File file2) {
        FilePathComponents a = m265931a(C69104g.m265923a(file));
        FilePathComponents a2 = m265931a(C69104g.m265923a(file2));
        if (!Intrinsics.areEqual(a.mo239212b(), a2.mo239212b())) {
            return null;
        }
        int a3 = a2.mo239211a();
        int a4 = a.mo239211a();
        int i = 0;
        int min = Math.min(a4, a3);
        while (i < min && Intrinsics.areEqual(a.mo239213c().get(i), a2.mo239213c().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = a3 - 1;
        if (i2 >= i) {
            while (!Intrinsics.areEqual(a2.mo239213c().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < a4) {
            if (i < a3) {
                sb.append(File.separatorChar);
            }
            String str = File.separator;
            Intrinsics.checkExpressionValueIsNotNull(str, "File.separator");
            CollectionsKt.joinTo$default(CollectionsKt.drop(a.mo239213c(), i), sb, str, null, null, 0, null, null, SmActions.ACTION_CALLING_EXIT, null);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        kotlin.io.C69101b.m265907a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        kotlin.io.C69101b.m265907a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        throw r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m265927a(java.io.File r6, java.io.File r7, boolean r8, int r9) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.C69108k.m265927a(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2 A[Catch:{ m -> 0x00e6 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m265932a(java.io.File r11, java.io.File r12, boolean r13, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r14) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.C69108k.m265932a(java.io.File, java.io.File, boolean, kotlin.jvm.functions.k):boolean");
    }

    /* renamed from: a */
    public static /* synthetic */ File m265928a(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return C69104g.m265927a(file, file2, z, i);
    }
}
