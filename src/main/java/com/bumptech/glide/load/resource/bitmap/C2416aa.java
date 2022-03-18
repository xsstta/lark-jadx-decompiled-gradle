package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2267e;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.aa */
public class C2416aa<T> implements AbstractC2391g<T, Bitmap> {

    /* renamed from: a */
    public static final C2267e<Long> f7963a = C2267e.m9711a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C2267e.AbstractC2269a<Long>() {
        /* class com.bumptech.glide.load.resource.bitmap.C2416aa.C24171 */

        /* renamed from: a */
        private final ByteBuffer f7969a = ByteBuffer.allocate(8);

        /* renamed from: a */
        public void mo10637a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f7969a) {
                this.f7969a.position(0);
                messageDigest.update(this.f7969a.putLong(l.longValue()).array());
            }
        }
    });

    /* renamed from: b */
    public static final C2267e<Integer> f7964b = C2267e.m9711a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C2267e.AbstractC2269a<Integer>() {
        /* class com.bumptech.glide.load.resource.bitmap.C2416aa.C24182 */

        /* renamed from: a */
        private final ByteBuffer f7970a = ByteBuffer.allocate(4);

        /* renamed from: a */
        public void mo10637a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f7970a) {
                    this.f7970a.position(0);
                    messageDigest.update(this.f7970a.putInt(num.intValue()).array());
                }
            }
        }
    });

    /* renamed from: c */
    private static final C2422c f7965c = new C2422c();

    /* renamed from: d */
    private final AbstractC2423d<T> f7966d;

    /* renamed from: e */
    private final AbstractC2283e f7967e;

    /* renamed from: f */
    private final C2422c f7968f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.aa$d */
    public interface AbstractC2423d<T> {
        /* renamed from: a */
        void mo10932a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    @Override // com.bumptech.glide.load.AbstractC2391g
    /* renamed from: a */
    public boolean mo10904a(T t, C2390f fVar) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.aa$a */
    public static final class C2419a implements AbstractC2423d<AssetFileDescriptor> {
        private C2419a() {
        }

        /* renamed from: a */
        public void mo10932a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.aa$b */
    public static final class C2420b implements AbstractC2423d<ByteBuffer> {
        C2420b() {
        }

        /* renamed from: a */
        public void mo10932a(MediaMetadataRetriever mediaMetadataRetriever, final ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new MediaDataSource() {
                /* class com.bumptech.glide.load.resource.bitmap.C2416aa.C2420b.C24211 */

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // android.media.MediaDataSource
                public long getSize() {
                    return (long) byteBuffer.limit();
                }

                @Override // android.media.MediaDataSource
                public int readAt(long j, byte[] bArr, int i, int i2) {
                    if (j >= ((long) byteBuffer.limit())) {
                        return -1;
                    }
                    byteBuffer.position((int) j);
                    int min = Math.min(i2, byteBuffer.remaining());
                    byteBuffer.get(bArr, i, min);
                    return min;
                }
            });
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.aa$c */
    static class C2422c {
        C2422c() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo10937a() {
            return new MediaMetadataRetriever();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.aa$e */
    public static final class C2424e implements AbstractC2423d<ParcelFileDescriptor> {
        C2424e() {
        }

        /* renamed from: a */
        public void mo10932a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: a */
    public static AbstractC2391g<AssetFileDescriptor, Bitmap> m10231a(AbstractC2283e eVar) {
        return new C2416aa(eVar, new C2419a());
    }

    /* renamed from: b */
    public static AbstractC2391g<ParcelFileDescriptor, Bitmap> m10233b(AbstractC2283e eVar) {
        return new C2416aa(eVar, new C2424e());
    }

    /* renamed from: c */
    public static AbstractC2391g<ByteBuffer, Bitmap> m10234c(AbstractC2283e eVar) {
        return new C2416aa(eVar, new C2420b());
    }

    C2416aa(AbstractC2283e eVar, AbstractC2423d<T> dVar) {
        this(eVar, dVar, f7965c);
    }

    /* renamed from: a */
    private static Bitmap m10229a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    C2416aa(AbstractC2283e eVar, AbstractC2423d<T> dVar, C2422c cVar) {
        this.f7967e = eVar;
        this.f7966d = dVar;
        this.f7968f = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.bumptech.glide.load.f */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.AbstractC2391g
    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(T t, int i, int i2, C2390f fVar) throws IOException {
        long longValue = ((Long) fVar.mo10900a(f7963a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) fVar.mo10900a(f7964b);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.mo10900a(DownsampleStrategy.f7959h);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.f7958g;
            }
            MediaMetadataRetriever a = this.f7968f.mo10937a();
            try {
                this.f7966d.mo10932a(a, t);
                Bitmap a2 = m10230a(a, longValue, num.intValue(), i, i2, downsampleStrategy);
                a.release();
                return C2428e.m10257a(a2, this.f7967e);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    /* renamed from: a */
    private static Bitmap m10230a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f7957f) {
            bitmap = null;
        } else {
            bitmap = m10232b(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        }
        if (bitmap == null) {
            return m10229a(mediaMetadataRetriever, j, i);
        }
        return bitmap;
    }

    /* renamed from: b */
    private static Bitmap m10232b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float a = downsampleStrategy.mo10927a(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * a), Math.round(a * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }
}
