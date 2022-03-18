package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.p083a.C2163m;
import com.bumptech.glide.load.resource.bitmap.C2449u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b */
public final class C2168b {

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b$a */
    public interface AbstractC2174a {
        /* renamed from: a */
        int mo10532a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b$b */
    public interface AbstractC2175b {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo10531a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: a */
    private static int m9425a(List<ImageHeaderParser> list, AbstractC2174a aVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = aVar.mo10532a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static ImageHeaderParser.ImageType m9427a(List<ImageHeaderParser> list, AbstractC2175b bVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = bVar.mo10531a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public static ImageHeaderParser.ImageType m9429a(List<ImageHeaderParser> list, final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m9427a(list, new AbstractC2175b() {
            /* class com.bumptech.glide.load.C2168b.C21702 */

            @Override // com.bumptech.glide.load.C2168b.AbstractC2175b
            /* renamed from: a */
            public ImageHeaderParser.ImageType mo10531a(ImageHeaderParser imageHeaderParser) throws IOException {
                return imageHeaderParser.mo10477a(byteBuffer);
            }
        });
    }

    /* renamed from: a */
    public static ImageHeaderParser.ImageType m9426a(List<ImageHeaderParser> list, final C2163m mVar, final AbstractC2278b bVar) throws IOException {
        return m9427a(list, new AbstractC2175b() {
            /* class com.bumptech.glide.load.C2168b.C21713 */

            /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
            @Override // com.bumptech.glide.load.C2168b.AbstractC2175b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bumptech.glide.load.ImageHeaderParser.ImageType mo10531a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
                /*
                    r4 = this;
                    r0 = 0
                    com.bumptech.glide.load.resource.bitmap.u r1 = new com.bumptech.glide.load.resource.bitmap.u     // Catch:{ all -> 0x0027 }
                    java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                    com.bumptech.glide.load.a.m r3 = com.bumptech.glide.load.p083a.C2163m.this     // Catch:{ all -> 0x0027 }
                    android.os.ParcelFileDescriptor r3 = r3.mo10504a()     // Catch:{ all -> 0x0027 }
                    java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                    r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                    com.bumptech.glide.load.engine.a.b r3 = r3     // Catch:{ all -> 0x0027 }
                    r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                    com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo10476a(r1)     // Catch:{ all -> 0x0024 }
                    r1.close()     // Catch:{ IOException -> 0x001e }
                L_0x001e:
                    com.bumptech.glide.load.a.m r0 = com.bumptech.glide.load.p083a.C2163m.this
                    r0.mo10504a()
                    return r5
                L_0x0024:
                    r5 = move-exception
                    r0 = r1
                    goto L_0x0028
                L_0x0027:
                    r5 = move-exception
                L_0x0028:
                    if (r0 == 0) goto L_0x002d
                    r0.close()     // Catch:{ IOException -> 0x002d }
                L_0x002d:
                    com.bumptech.glide.load.a.m r0 = com.bumptech.glide.load.p083a.C2163m.this
                    r0.mo10504a()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C2168b.C21713.mo10531a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
            }
        });
    }

    /* renamed from: b */
    public static int m9430b(List<ImageHeaderParser> list, final C2163m mVar, final AbstractC2278b bVar) throws IOException {
        return m9425a(list, new AbstractC2174a() {
            /* class com.bumptech.glide.load.C2168b.C21735 */

            /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
            @Override // com.bumptech.glide.load.C2168b.AbstractC2174a
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public int mo10532a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
                /*
                    r4 = this;
                    r0 = 0
                    com.bumptech.glide.load.resource.bitmap.u r1 = new com.bumptech.glide.load.resource.bitmap.u     // Catch:{ all -> 0x0029 }
                    java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                    com.bumptech.glide.load.a.m r3 = com.bumptech.glide.load.p083a.C2163m.this     // Catch:{ all -> 0x0029 }
                    android.os.ParcelFileDescriptor r3 = r3.mo10504a()     // Catch:{ all -> 0x0029 }
                    java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                    r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                    com.bumptech.glide.load.engine.a.b r3 = r3     // Catch:{ all -> 0x0029 }
                    r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                    com.bumptech.glide.load.engine.a.b r0 = r3     // Catch:{ all -> 0x0026 }
                    int r5 = r5.mo10475a(r1, r0)     // Catch:{ all -> 0x0026 }
                    r1.close()     // Catch:{ IOException -> 0x0020 }
                L_0x0020:
                    com.bumptech.glide.load.a.m r0 = com.bumptech.glide.load.p083a.C2163m.this
                    r0.mo10504a()
                    return r5
                L_0x0026:
                    r5 = move-exception
                    r0 = r1
                    goto L_0x002a
                L_0x0029:
                    r5 = move-exception
                L_0x002a:
                    if (r0 == 0) goto L_0x002f
                    r0.close()     // Catch:{ IOException -> 0x002f }
                L_0x002f:
                    com.bumptech.glide.load.a.m r0 = com.bumptech.glide.load.p083a.C2163m.this
                    r0.mo10504a()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C2168b.C21735.mo10532a(com.bumptech.glide.load.ImageHeaderParser):int");
            }
        });
    }

    /* renamed from: b */
    public static int m9431b(List<ImageHeaderParser> list, final InputStream inputStream, final AbstractC2278b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2449u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m9425a(list, new AbstractC2174a() {
            /* class com.bumptech.glide.load.C2168b.C21724 */

            @Override // com.bumptech.glide.load.C2168b.AbstractC2174a
            /* renamed from: a */
            public int mo10532a(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.mo10475a(inputStream, bVar);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    /* renamed from: a */
    public static ImageHeaderParser.ImageType m9428a(List<ImageHeaderParser> list, final InputStream inputStream, AbstractC2278b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2449u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m9427a(list, new AbstractC2175b() {
            /* class com.bumptech.glide.load.C2168b.C21691 */

            @Override // com.bumptech.glide.load.C2168b.AbstractC2175b
            /* renamed from: a */
            public ImageHeaderParser.ImageType mo10531a(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.mo10476a(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }
}
