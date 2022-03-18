package com.ttnet.org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class UploadDataProviders {

    /* access modifiers changed from: private */
    public interface FileChannelProvider {
        FileChannel getChannel() throws IOException;
    }

    private UploadDataProviders() {
    }

    /* access modifiers changed from: private */
    public static final class ByteBufferUploadProvider extends UploadDataProvider {
        private final ByteBuffer mUploadBuffer;

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public long getLength() {
            return (long) this.mUploadBuffer.limit();
        }

        private ByteBufferUploadProvider(ByteBuffer byteBuffer) {
            this.mUploadBuffer = byteBuffer;
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.mUploadBuffer.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() >= this.mUploadBuffer.remaining()) {
                    byteBuffer.put(this.mUploadBuffer);
                } else {
                    int limit = this.mUploadBuffer.limit();
                    ByteBuffer byteBuffer2 = this.mUploadBuffer;
                    byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                    byteBuffer.put(this.mUploadBuffer);
                    this.mUploadBuffer.limit(limit);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
    }

    private static final class FileUploadProvider extends UploadDataProvider {
        private volatile FileChannel mChannel;
        private final Object mLock;
        private final FileChannelProvider mProvider;

        @Override // java.io.Closeable, com.ttnet.org.chromium.net.UploadDataProvider, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.mChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return getChannel().size();
        }

        private FileChannel getChannel() throws IOException {
            if (this.mChannel == null) {
                synchronized (this.mLock) {
                    if (this.mChannel == null) {
                        this.mChannel = this.mProvider.getChannel();
                    }
                }
            }
            return this.mChannel;
        }

        private FileUploadProvider(FileChannelProvider fileChannelProvider) {
            this.mLock = new Object();
            this.mProvider = fileChannelProvider;
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            getChannel().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasRemaining()) {
                FileChannel channel = getChannel();
                int i = 0;
                while (i == 0) {
                    int read = channel.read(byteBuffer);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(final ParcelFileDescriptor parcelFileDescriptor) {
        return new FileUploadProvider(new FileChannelProvider() {
            /* class com.ttnet.org.chromium.net.UploadDataProviders.C680152 */

            @Override // com.ttnet.org.chromium.net.UploadDataProviders.FileChannelProvider
            public FileChannel getChannel() throws IOException {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
            }
        });
    }

    public static UploadDataProvider create(final File file) {
        return new FileUploadProvider(new FileChannelProvider() {
            /* class com.ttnet.org.chromium.net.UploadDataProviders.C680141 */

            @Override // com.ttnet.org.chromium.net.UploadDataProviders.FileChannelProvider
            public FileChannel getChannel() throws IOException {
                return new FileInputStream(file).getChannel();
            }
        });
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new ByteBufferUploadProvider(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new ByteBufferUploadProvider(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
