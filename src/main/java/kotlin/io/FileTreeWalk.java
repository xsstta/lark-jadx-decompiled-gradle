package kotlin.io;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", C13998f.f36682a, "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.io.e */
public final class FileTreeWalk implements Sequence<File> {

    /* renamed from: a */
    public final File f173163a;

    /* renamed from: b */
    public final FileWalkDirection f173164b;

    /* renamed from: c */
    public final Function1<File, Boolean> f173165c;

    /* renamed from: d */
    public final Function1<File, Unit> f173166d;

    /* renamed from: e */
    public final Function2<File, IOException, Unit> f173167e;

    /* renamed from: f */
    public final int f173168f;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.io.e$c */
    public static abstract class WalkState {

        /* renamed from: a */
        private final File f173182a;

        /* renamed from: a */
        public abstract File mo239218a();

        /* renamed from: b */
        public final File mo239219b() {
            return this.f173182a;
        }

        public WalkState(File file) {
            Intrinsics.checkParameterIsNotNull(file, "root");
            this.f173182a = file;
        }
    }

    @Override // kotlin.sequences.Sequence
    /* renamed from: a */
    public Iterator<File> mo4717a() {
        return new FileTreeWalkIterator();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.io.e$b */
    private final class FileTreeWalkIterator extends AbstractIterator<File> {

        /* renamed from: b */
        private final ArrayDeque<WalkState> f173170b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlin.io.e$b$b */
        private final class SingleFileState extends WalkState {

            /* renamed from: a */
            final /* synthetic */ FileTreeWalkIterator f173176a;

            /* renamed from: b */
            private boolean f173177b;

            @Override // kotlin.io.FileTreeWalk.WalkState
            /* renamed from: a */
            public File mo239218a() {
                if (this.f173177b) {
                    return null;
                }
                this.f173177b = true;
                return mo239219b();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SingleFileState(FileTreeWalkIterator bVar, File file) {
                super(file);
                Intrinsics.checkParameterIsNotNull(file, "rootFile");
                this.f173176a = bVar;
                if (_Assertions.f173221a) {
                    boolean isFile = file.isFile();
                    if (_Assertions.f173221a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.collections.AbstractIterator
        /* renamed from: a */
        public void mo239005a() {
            File c = m265915c();
            if (c != null) {
                mo239006a((Object) c);
            } else {
                mo239007b();
            }
        }

        /* renamed from: c */
        private final File m265915c() {
            File a;
            while (true) {
                WalkState peek = this.f173170b.peek();
                if (peek == null) {
                    return null;
                }
                a = peek.mo239218a();
                if (a == null) {
                    this.f173170b.pop();
                } else if (Intrinsics.areEqual(a, peek.mo239219b()) || !a.isDirectory() || this.f173170b.size() >= FileTreeWalk.this.f173168f) {
                    return a;
                } else {
                    this.f173170b.push(m265914a(a));
                }
            }
            return a;
        }

        /* access modifiers changed from: private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "failed", "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlin.io.e$b$a */
        public final class BottomUpDirectoryState extends DirectoryState {

            /* renamed from: a */
            final /* synthetic */ FileTreeWalkIterator f173171a;

            /* renamed from: b */
            private boolean f173172b;

            /* renamed from: c */
            private File[] f173173c;

            /* renamed from: d */
            private int f173174d;

            /* renamed from: e */
            private boolean f173175e;

            @Override // kotlin.io.FileTreeWalk.WalkState
            /* renamed from: a */
            public File mo239218a() {
                if (!this.f173175e && this.f173173c == null) {
                    Function1<File, Boolean> function1 = FileTreeWalk.this.f173165c;
                    if (function1 != null && !function1.invoke(mo239219b()).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = mo239219b().listFiles();
                    this.f173173c = listFiles;
                    if (listFiles == null) {
                        Function2<File, IOException, Unit> kVar = FileTreeWalk.this.f173167e;
                        if (kVar != null) {
                            kVar.invoke(mo239219b(), new AccessDeniedException(mo239219b(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f173175e = true;
                    }
                }
                File[] fileArr = this.f173173c;
                if (fileArr != null) {
                    int i = this.f173174d;
                    if (fileArr == null) {
                        Intrinsics.throwNpe();
                    }
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f173173c;
                        if (fileArr2 == null) {
                            Intrinsics.throwNpe();
                        }
                        int i2 = this.f173174d;
                        this.f173174d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f173172b) {
                    this.f173172b = true;
                    return mo239219b();
                }
                Function1<File, Unit> function12 = FileTreeWalk.this.f173166d;
                if (function12 != null) {
                    function12.invoke(mo239219b());
                }
                return null;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(FileTreeWalkIterator bVar, File file) {
                super(file);
                Intrinsics.checkParameterIsNotNull(file, "rootDir");
                this.f173171a = bVar;
            }
        }

        /* access modifiers changed from: private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlin.io.e$b$c */
        public final class TopDownDirectoryState extends DirectoryState {

            /* renamed from: a */
            final /* synthetic */ FileTreeWalkIterator f173178a;

            /* renamed from: b */
            private boolean f173179b;

            /* renamed from: c */
            private File[] f173180c;

            /* renamed from: d */
            private int f173181d;

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
                if (r0.length == 0) goto L_0x0085;
             */
            @Override // kotlin.io.FileTreeWalk.WalkState
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File mo239218a() {
                /*
                // Method dump skipped, instructions count: 168
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState.mo239218a():java.io.File");
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(FileTreeWalkIterator bVar, File file) {
                super(file);
                Intrinsics.checkParameterIsNotNull(file, "rootDir");
                this.f173178a = bVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public FileTreeWalkIterator() {
            ArrayDeque<WalkState> arrayDeque = new ArrayDeque<>();
            this.f173170b = arrayDeque;
            if (FileTreeWalk.this.f173163a.isDirectory()) {
                arrayDeque.push(m265914a(FileTreeWalk.this.f173163a));
            } else if (FileTreeWalk.this.f173163a.isFile()) {
                arrayDeque.push(new SingleFileState(this, FileTreeWalk.this.f173163a));
            } else {
                mo239007b();
            }
        }

        /* renamed from: a */
        private final DirectoryState m265914a(File file) {
            int i = C69103f.f173183a[FileTreeWalk.this.f173164b.ordinal()];
            if (i == 1) {
                return new TopDownDirectoryState(this, file);
            }
            if (i == 2) {
                return new BottomUpDirectoryState(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public final FileTreeWalk mo239217a(Function2<? super File, ? super IOException, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "function");
        return new FileTreeWalk(this.f173163a, this.f173164b, this.f173165c, this.f173166d, kVar, this.f173168f);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.io.e$a */
    public static abstract class DirectoryState extends WalkState {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DirectoryState(File file) {
            super(file);
            Intrinsics.checkParameterIsNotNull(file, "rootDir");
            if (_Assertions.f173221a) {
                boolean isDirectory = file.isDirectory();
                if (_Assertions.f173221a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(File file, FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        Intrinsics.checkParameterIsNotNull(file, "start");
        Intrinsics.checkParameterIsNotNull(fileWalkDirection, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.k<? super java.io.File, ? super java.io.IOException, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    private FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> kVar, int i) {
        this.f173163a = file;
        this.f173164b = fileWalkDirection;
        this.f173165c = function1;
        this.f173166d = function12;
        this.f173167e = kVar;
        this.f173168f = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* synthetic */ FileTreeWalk(java.io.File r8, kotlin.io.FileWalkDirection r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11, kotlin.jvm.functions.Function2 r12, int r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L_0x0006
            kotlin.io.FileWalkDirection r9 = kotlin.io.FileWalkDirection.TOP_DOWN
        L_0x0006:
            r2 = r9
            r9 = r14 & 32
            if (r9 == 0) goto L_0x0012
            r13 = 2147483647(0x7fffffff, float:NaN)
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0013
        L_0x0012:
            r6 = r13
        L_0x0013:
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.<init>(java.io.File, kotlin.io.FileWalkDirection, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.k, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
