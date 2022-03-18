package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import androidx.collection.C0517d;
import com.google.android.gms.common.internal.C21739b;
import com.google.android.gms.internal.base.C21904c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {

    /* renamed from: a */
    private static final Object f52949a = new Object();

    /* renamed from: b */
    private static HashSet<Uri> f52950b = new HashSet<>();

    /* renamed from: c */
    private final Context f52951c;

    /* renamed from: d */
    private final Handler f52952d;

    /* renamed from: e */
    private final ExecutorService f52953e;

    /* renamed from: f */
    private final C21713b f52954f;

    /* renamed from: g */
    private final C21904c f52955g;

    /* renamed from: h */
    private final Map<AbstractC21716a, ImageReceiver> f52956h;

    /* renamed from: i */
    private final Map<Uri, ImageReceiver> f52957i;

    /* renamed from: j */
    private final Map<Uri, Long> f52958j;

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    public interface AbstractC21712a {
        /* renamed from: a */
        void mo73553a(Uri uri, Drawable drawable, boolean z);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    public static final class C21713b extends C0517d<C21717b, Bitmap> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // androidx.collection.C0517d
        /* renamed from: b */
        public final /* synthetic */ int mo2979b(C21717b bVar, Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            return bitmap2.getHeight() * bitmap2.getRowBytes();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // androidx.collection.C0517d
        /* renamed from: a */
        public final /* synthetic */ void mo2978a(boolean z, C21717b bVar, Bitmap bitmap, Bitmap bitmap2) {
            super.mo2978a(z, bVar, bitmap, bitmap2);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    private final class RunnableC21714c implements Runnable {

        /* renamed from: a */
        private final Uri f52962a;

        /* renamed from: b */
        private final ParcelFileDescriptor f52963b;

        public RunnableC21714c(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f52962a = uri;
            this.f52963b = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            C21739b.m78946b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.f52963b;
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.f52962a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    Log.e("ImageManager", sb.toString(), e);
                    z2 = true;
                }
                try {
                    this.f52963b.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.f52952d.post(new RunnableC21715d(this.f52962a, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                String valueOf2 = String.valueOf(this.f52962a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                Log.w("ImageManager", sb2.toString());
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    private final class RunnableC21715d implements Runnable {

        /* renamed from: a */
        private final Uri f52965a;

        /* renamed from: b */
        private final Bitmap f52966b;

        /* renamed from: c */
        private final CountDownLatch f52967c;

        /* renamed from: d */
        private boolean f52968d;

        public RunnableC21715d(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f52965a = uri;
            this.f52966b = bitmap;
            this.f52968d = z;
            this.f52967c = countDownLatch;
        }

        public final void run() {
            C21739b.m78945a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f52966b != null;
            if (ImageManager.this.f52954f != null) {
                if (this.f52968d) {
                    ImageManager.this.f52954f.mo2976a();
                    System.gc();
                    this.f52968d = false;
                    ImageManager.this.f52952d.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f52954f.mo2975a(new C21717b(this.f52965a), this.f52966b);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f52957i.remove(this.f52965a);
            if (imageReceiver != null) {
                ArrayList arrayList = imageReceiver.f52960b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AbstractC21716a aVar = (AbstractC21716a) arrayList.get(i);
                    if (z) {
                        aVar.mo73563a(ImageManager.this.f52951c, this.f52966b, false);
                    } else {
                        ImageManager.this.f52958j.put(this.f52965a, Long.valueOf(SystemClock.elapsedRealtime()));
                        aVar.mo73564a(ImageManager.this.f52951c, ImageManager.this.f52955g, false);
                    }
                    if (!(aVar instanceof C21718c)) {
                        ImageManager.this.f52956h.remove(aVar);
                    }
                }
            }
            this.f52967c.countDown();
            synchronized (ImageManager.f52949a) {
                ImageManager.f52950b.remove(this.f52965a);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        private final Uri f52959a;

        /* renamed from: b */
        private final ArrayList<AbstractC21716a> f52960b;

        /* renamed from: c */
        private final /* synthetic */ ImageManager f52961c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f52961c.f52953e.execute(new RunnableC21714c(this.f52959a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
}
