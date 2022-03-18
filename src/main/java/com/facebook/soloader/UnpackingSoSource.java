package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class UnpackingSoSource extends DirectorySoSource {
    @Nullable
    private String[] mAbis;
    protected final Context mContext;
    @Nullable
    protected String mCorruptedLib;
    private final Map<String, Object> mLibsBeingLoaded = new HashMap();

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* access modifiers changed from: protected */
    public abstract Unpacker makeUnpacker() throws IOException;

    /* access modifiers changed from: protected */
    public static abstract class InputDsoIterator implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public abstract boolean hasNext();

        public abstract InputDso next() throws IOException;

        protected InputDsoIterator() {
        }
    }

    /* access modifiers changed from: protected */
    public static abstract class Unpacker implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        /* access modifiers changed from: protected */
        public abstract DsoManifest getDsoManifest() throws IOException;

        /* access modifiers changed from: protected */
        public abstract InputDsoIterator openDsoIterator() throws IOException;

        protected Unpacker() {
        }
    }

    /* access modifiers changed from: protected */
    public static final class InputDso implements Closeable {
        public final InputStream content;
        public final Dso dso;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.content.close();
        }

        public InputDso(Dso dso2, InputStream inputStream) {
            this.dso = dso2;
            this.content = inputStream;
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getSoSourceAbis() {
        String[] strArr = this.mAbis;
        if (strArr == null) {
            return super.getSoSourceAbis();
        }
        return strArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r1 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getDepsBlock() throws java.io.IOException {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            com.facebook.soloader.UnpackingSoSource$Unpacker r1 = r5.makeUnpacker()
            com.facebook.soloader.UnpackingSoSource$DsoManifest r2 = r1.getDsoManifest()     // Catch:{ all -> 0x0038 }
            com.facebook.soloader.UnpackingSoSource$Dso[] r2 = r2.dsos     // Catch:{ all -> 0x0038 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0038 }
            int r3 = r2.length     // Catch:{ all -> 0x0038 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0038 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0038 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = r4.name     // Catch:{ all -> 0x0038 }
            r0.writeString(r4)     // Catch:{ all -> 0x0038 }
            r4 = r2[r3]     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = r4.hash     // Catch:{ all -> 0x0038 }
            r0.writeString(r4)     // Catch:{ all -> 0x0038 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r2 = move-exception
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0045:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.getDepsBlock():byte[]");
    }

    public void setSoSourceAbis(String[] strArr) {
        this.mAbis = strArr;
    }

    public static final class DsoManifest {
        public final Dso[] dsos;

        public DsoManifest(Dso[] dsoArr) {
            this.dsos = dsoArr;
        }

        static final DsoManifest read(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    Dso[] dsoArr = new Dso[readInt];
                    for (int i = 0; i < readInt; i++) {
                        dsoArr[i] = new Dso(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new DsoManifest(dsoArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void write(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.dsos.length);
            int i = 0;
            while (true) {
                Dso[] dsoArr = this.dsos;
                if (i < dsoArr.length) {
                    dataOutput.writeUTF(dsoArr[i].name);
                    dataOutput.writeUTF(this.dsos[i].hash);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private Object getLibraryLock(String str) {
        Object obj;
        synchronized (this.mLibsBeingLoaded) {
            obj = this.mLibsBeingLoaded.get(str);
            if (obj == null) {
                obj = new Object();
                this.mLibsBeingLoaded.put(str, obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public synchronized void prepare(String str) throws IOException {
        synchronized (getLibraryLock(str)) {
            this.mCorruptedLib = str;
            prepare(2);
        }
    }

    private void deleteUnmentionedFiles(Dso[] dsoArr) throws IOException {
        String[] list = this.soDirectory.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < dsoArr.length) {
                        if (dsoArr[i].name.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.soDirectory, str);
                        Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                        SysUtil.dumbDeleteRecursive(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.soDirectory);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.SoSource
    public void prepare(int i) throws IOException {
        SysUtil.mkdirOrThrow(this.soDirectory);
        FileLocker lock = FileLocker.lock(new File(this.soDirectory, "dso_lock"));
        try {
            Log.v("fb-UnpackingSoSource", "locked dso store " + this.soDirectory);
            if (refreshLocked(lock, i, getDepsBlock())) {
                lock = null;
            } else {
                Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.soDirectory);
            }
            if (lock == null) {
                Log.v("fb-UnpackingSoSource", "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)");
            }
        } finally {
            if (lock != null) {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.soDirectory);
                lock.close();
            } else {
                Log.v("fb-UnpackingSoSource", "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)");
            }
        }
    }

    public static class Dso {
        public final String hash;
        public final String name;

        public Dso(String str, String str2) {
            this.name = str;
            this.hash = str2;
        }
    }

    protected UnpackingSoSource(Context context, String str) {
        super(getSoStorePath(context, str), 1);
        this.mContext = context;
    }

    public static File getSoStorePath(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r4 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeState(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0021 }
            r0.write(r4)     // Catch:{ all -> 0x0021 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0021 }
            r0.setLength(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0021 }
            r3.sync()     // Catch:{ all -> 0x0021 }
            r0.close()
            return
        L_0x0021:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.writeState(java.io.File, byte):void");
    }

    private void extractDso(InputDso inputDso, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + inputDso.dso.name);
        if (this.soDirectory.setWritable(true, true)) {
            File file = new File(this.soDirectory, inputDso.dso.name);
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (IOException e) {
                Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e);
                SysUtil.dumbDeleteRecursive(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            try {
                int available = inputDso.content.available();
                if (available > 1) {
                    SysUtil.fallocateIfSupported(randomAccessFile.getFD(), (long) available);
                }
                SysUtil.copyBytes(randomAccessFile, inputDso.content, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e2) {
                SysUtil.dumbDeleteRecursive(file);
                throw e2;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            throw new IOException("cannot make directory writable for us: " + this.soDirectory);
        }
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int loadLibraryFrom;
        synchronized (getLibraryLock(str)) {
            loadLibraryFrom = loadLibraryFrom(str, i, this.soDirectory, threadPolicy);
        }
        return loadLibraryFrom;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        r10.addSuppressed(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        throw r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[Catch:{ all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[Catch:{ all -> 0x00c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void regenerate(byte r10, com.facebook.soloader.UnpackingSoSource.DsoManifest r11, com.facebook.soloader.UnpackingSoSource.InputDsoIterator r12) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.regenerate(byte, com.facebook.soloader.UnpackingSoSource$DsoManifest, com.facebook.soloader.UnpackingSoSource$InputDsoIterator):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
        if (r2 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e5, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e6, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e9, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ec, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ed, code lost:
        if (r0 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f3, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f7, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fa, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ff, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0100, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0103, code lost:
        throw r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean refreshLocked(final com.facebook.soloader.FileLocker r12, int r13, final byte[] r14) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.refreshLocked(com.facebook.soloader.FileLocker, int, byte[]):boolean");
    }
}
