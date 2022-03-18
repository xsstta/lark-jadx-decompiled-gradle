package com.bumptech.glide.load.resource.p093d;

import android.util.Log;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2168b;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.d.j */
public class C2480j implements AbstractC2391g<InputStream, C2468c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f8092a;

    /* renamed from: b */
    private final AbstractC2391g<ByteBuffer, C2468c> f8093b;

    /* renamed from: c */
    private final AbstractC2278b f8094c;

    /* renamed from: a */
    private static byte[] m10463a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo10904a(InputStream inputStream, C2390f fVar) throws IOException {
        if (((Boolean) fVar.mo10900a(C2479i.f8091b)).booleanValue() || C2168b.m9428a(this.f8092a, inputStream, this.f8094c) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    public C2480j(List<ImageHeaderParser> list, AbstractC2391g<ByteBuffer, C2468c> gVar, AbstractC2278b bVar) {
        this.f8092a = list;
        this.f8093b = gVar;
        this.f8094c = bVar;
    }

    /* renamed from: a */
    public AbstractC2383u<C2468c> mo10903a(InputStream inputStream, int i, int i2, C2390f fVar) throws IOException {
        byte[] a = m10463a(inputStream);
        if (a == null) {
            return null;
        }
        return this.f8093b.mo10903a(ByteBuffer.wrap(a), i, i2, fVar);
    }
}
