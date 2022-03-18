package com.bytedance.memory.heap;

import com.bytedance.memory.p846b.C20069g;
import java.io.File;
import java.io.Serializable;

public final class HeapDump implements Serializable {
    public boolean computeRetainedHeapSize;
    public long currentTime;
    public final long gcDurationMs;
    public final long heapDumpDurationMs;
    public File heapDumpFile;
    public long heapDumpFileSize;
    public boolean isDebug;
    public String referenceClassName;
    public final String referenceKey;
    public final String referenceName;
    public String shrinkFilePath;
    public final long watchDurationMs;

    public static C20091a newBuilder() {
        return new C20091a();
    }

    /* renamed from: com.bytedance.memory.heap.HeapDump$a */
    public static final class C20091a {

        /* renamed from: a */
        boolean f49052a = true;

        /* renamed from: b */
        File f49053b;

        /* renamed from: c */
        long f49054c;

        /* renamed from: d */
        String f49055d;

        /* renamed from: e */
        String f49056e;

        /* renamed from: f */
        String f49057f = "";

        /* renamed from: g */
        long f49058g;

        /* renamed from: h */
        long f49059h;

        /* renamed from: i */
        long f49060i;

        /* renamed from: j */
        boolean f49061j = true;

        /* renamed from: k */
        long f49062k;

        C20091a() {
        }

        /* renamed from: a */
        public HeapDump mo68075a() {
            C20069g.m73232a(this.f49053b, "heapDumpFile");
            return new HeapDump(this);
        }

        /* renamed from: a */
        public C20091a mo68071a(long j) {
            this.f49062k = j;
            return this;
        }

        /* renamed from: b */
        public C20091a mo68076b(long j) {
            this.f49054c = j;
            return this;
        }

        /* renamed from: c */
        public C20091a mo68079c(long j) {
            this.f49058g = j;
            return this;
        }

        /* renamed from: d */
        public C20091a mo68082d(long j) {
            this.f49059h = j;
            return this;
        }

        /* renamed from: e */
        public C20091a mo68083e(long j) {
            this.f49060i = j;
            return this;
        }

        /* renamed from: a */
        public C20091a mo68073a(String str) {
            this.f49055d = str;
            return this;
        }

        /* renamed from: b */
        public C20091a mo68078b(boolean z) {
            this.f49052a = z;
            return this;
        }

        /* renamed from: c */
        public C20091a mo68081c(boolean z) {
            this.f49061j = z;
            return this;
        }

        /* renamed from: a */
        public C20091a mo68072a(File file) {
            this.f49053b = (File) C20069g.m73232a(file, "heapDumpFile");
            return this;
        }

        /* renamed from: b */
        public C20091a mo68077b(String str) {
            this.f49056e = (String) C20069g.m73232a(str, "referenceKey");
            return this;
        }

        /* renamed from: c */
        public C20091a mo68080c(String str) {
            this.f49057f = (String) C20069g.m73232a(str, "referenceName");
            return this;
        }

        /* renamed from: a */
        public C20091a mo68074a(boolean z) {
            this.f49052a = z;
            return this;
        }
    }

    public String toString() {
        return " heapDumpFilePath " + this.heapDumpFile.getPath() + "\n" + " heapDumpFileSize " + this.heapDumpFile.length() + "\n" + " referenceName " + this.referenceName + "\n" + " isDebug " + this.isDebug + "\n" + " currentTime " + this.currentTime + "\n" + " watchDurationMs " + this.watchDurationMs + "ms\n" + " gcDurationMs " + this.gcDurationMs + "ms\n" + " shrinkFilePath " + this.shrinkFilePath + "\n" + " heapDumpDurationMs " + this.heapDumpDurationMs + "ms\n";
    }

    private HeapDump(C20091a aVar) {
        this.isDebug = true;
        this.computeRetainedHeapSize = true;
        this.isDebug = aVar.f49052a;
        this.currentTime = aVar.f49062k;
        this.heapDumpFile = aVar.f49053b;
        this.referenceKey = aVar.f49056e;
        this.referenceName = aVar.f49057f;
        this.computeRetainedHeapSize = aVar.f49061j;
        this.watchDurationMs = aVar.f49058g;
        this.shrinkFilePath = aVar.f49055d;
        this.gcDurationMs = aVar.f49059h;
        this.heapDumpDurationMs = aVar.f49060i;
    }

    public HeapDump(File file, String str, String str2, long j, long j2, long j3, boolean z) {
        this(new C20091a().mo68072a(file).mo68077b(str).mo68080c(str2).mo68074a(z).mo68081c(true).mo68079c(j).mo68082d(j2).mo68083e(j3));
    }
}
