package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import okio.AbstractC69723u;
import okio.ByteString;
import okio.C69694c;
import okio.C69724v;

final class Relay {
    static final ByteString PREFIX_CLEAN = ByteString.encodeUtf8("OkHttp cache v1\n");
    static final ByteString PREFIX_DIRTY = ByteString.encodeUtf8("OkHttp DIRTY :(\n");
    final C69694c buffer = new C69694c();
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final ByteString metadata;
    int sourceCount;
    AbstractC69723u upstream;
    final C69694c upstreamBuffer = new C69694c();
    long upstreamPos;
    Thread upstreamReader;

    class RelaySource implements AbstractC69723u {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C69724v timeout = new C69724v();

        @Override // okio.AbstractC69723u
        public C69724v timeout() {
            return this.timeout;
        }

        @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.sourceCount--;
                    if (Relay.this.sourceCount == 0) {
                        RandomAccessFile randomAccessFile2 = Relay.this.file;
                        Relay.this.file = null;
                        randomAccessFile = randomAccessFile2;
                    }
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly(randomAccessFile);
                }
            }
        }

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
            r5 = 2;
         */
        @Override // okio.AbstractC69723u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(okio.C69694c r22, long r23) throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 320
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.c, long):long");
        }
    }

    public ByteString metadata() {
        return this.metadata;
    }

    /* access modifiers changed from: package-private */
    public boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public AbstractC69723u newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    private void writeMetadata(long j) throws IOException {
        C69694c cVar = new C69694c();
        cVar.mo244532b(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, cVar, (long) this.metadata.size());
    }

    /* access modifiers changed from: package-private */
    public void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.size());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    public static Relay read(File file2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        C69694c cVar = new C69694c();
        fileOperator.read(0, cVar, 32);
        ByteString byteString = PREFIX_CLEAN;
        if (cVar.readByteString((long) byteString.size()).equals(byteString)) {
            long readLong = cVar.readLong();
            long readLong2 = cVar.readLong();
            C69694c cVar2 = new C69694c();
            fileOperator.read(readLong + 32, cVar2, readLong2);
            return new Relay(randomAccessFile, null, readLong, cVar2.readByteString(), 0);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(ByteString byteString, long j, long j2) throws IOException {
        C69694c cVar = new C69694c();
        cVar.mo244532b(byteString);
        cVar.mo244537c(j);
        cVar.mo244537c(j2);
        if (cVar.mo244510a() == 32) {
            new FileOperator(this.file.getChannel()).write(0, cVar, 32);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Relay edit(File file2, AbstractC69723u uVar, ByteString byteString, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        Relay relay = new Relay(randomAccessFile, uVar, 0, byteString, j);
        randomAccessFile.setLength(0);
        relay.writeHeader(PREFIX_DIRTY, -1, -1);
        return relay;
    }

    private Relay(RandomAccessFile randomAccessFile, AbstractC69723u uVar, long j, ByteString byteString, long j2) {
        boolean z;
        this.file = randomAccessFile;
        this.upstream = uVar;
        if (uVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.complete = z;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
    }
}
