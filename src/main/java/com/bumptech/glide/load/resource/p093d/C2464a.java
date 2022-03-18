package com.bumptech.glide.load.resource.p093d;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.C2132b;
import com.bumptech.glide.gifdecoder.C2133c;
import com.bumptech.glide.gifdecoder.C2134d;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2168b;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.C2461c;
import com.bumptech.glide.util.C2563f;
import com.bumptech.glide.util.C2568k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.resource.d.a */
public class C2464a implements AbstractC2391g<ByteBuffer, C2468c> {

    /* renamed from: a */
    private static final C2465a f8042a = new C2465a();

    /* renamed from: b */
    private static final C2466b f8043b = new C2466b();

    /* renamed from: c */
    private final Context f8044c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f8045d;

    /* renamed from: e */
    private final C2466b f8046e;

    /* renamed from: f */
    private final C2465a f8047f;

    /* renamed from: g */
    private final C2467b f8048g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.d.a$a */
    public static class C2465a {
        C2465a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public GifDecoder mo10995a(GifDecoder.AbstractC2130a aVar, C2132b bVar, ByteBuffer byteBuffer, int i) {
            return new C2134d(aVar, bVar, byteBuffer, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.d.a$b */
    public static class C2466b {

        /* renamed from: a */
        private final Queue<C2133c> f8049a = C2568k.m10909a(0);

        C2466b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo10997a(C2133c cVar) {
            cVar.mo10467a();
            this.f8049a.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C2133c mo10996a(ByteBuffer byteBuffer) {
            C2133c poll;
            poll = this.f8049a.poll();
            if (poll == null) {
                poll = new C2133c();
            }
            return poll.mo10466a(byteBuffer);
        }
    }

    /* renamed from: a */
    public boolean mo10904a(ByteBuffer byteBuffer, C2390f fVar) throws IOException {
        if (((Boolean) fVar.mo10900a(C2479i.f8091b)).booleanValue() || C2168b.m9429a(this.f8045d, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static int m10397a(C2132b bVar, int i, int i2) {
        int i3;
        int min = Math.min(bVar.mo10462a() / i2, bVar.mo10463b() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + bVar.mo10463b() + "x" + bVar.mo10462a() + "]");
        }
        return max;
    }

    public C2464a(Context context, List<ImageHeaderParser> list, AbstractC2283e eVar, AbstractC2278b bVar) {
        this(context, list, eVar, bVar, f8043b, f8042a);
    }

    /* renamed from: a */
    public C2471e mo10903a(ByteBuffer byteBuffer, int i, int i2, C2390f fVar) {
        C2133c a = this.f8046e.mo10996a(byteBuffer);
        try {
            return m10398a(byteBuffer, i, i2, a, fVar);
        } finally {
            this.f8046e.mo10997a(a);
        }
    }

    /* renamed from: a */
    private C2471e m10398a(ByteBuffer byteBuffer, int i, int i2, C2133c cVar, C2390f fVar) {
        Bitmap.Config config;
        long a = C2563f.m10880a();
        try {
            C2132b b = cVar.mo10468b();
            if (b.mo10464c() > 0) {
                if (b.mo10465d() == 0) {
                    if (fVar.mo10900a(C2479i.f8090a) == DecodeFormat.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    GifDecoder a2 = this.f8047f.mo10995a(this.f8048g, b, byteBuffer, m10397a(b, i, i2));
                    a2.mo10447a(config);
                    a2.mo10448b();
                    Bitmap h = a2.mo10454h();
                    if (h == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2563f.m10879a(a));
                        }
                        return null;
                    }
                    C2471e eVar = new C2471e(new C2468c(this.f8044c, a2, C2461c.m10391a(), i, i2, h));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2563f.m10879a(a));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2563f.m10879a(a));
            }
        }
    }

    C2464a(Context context, List<ImageHeaderParser> list, AbstractC2283e eVar, AbstractC2278b bVar, C2466b bVar2, C2465a aVar) {
        this.f8044c = context.getApplicationContext();
        this.f8045d = list;
        this.f8047f = aVar;
        this.f8048g = new C2467b(eVar, bVar);
        this.f8046e = bVar2;
    }
}
