package com.ss.android.lark.widget.photo_picker.subsampling.decoder;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;

public class SkiaPooledImageRegionDecoder implements AbstractC58851d {

    /* renamed from: c */
    private static final String f145565c = "SkiaPooledImageRegionDecoder";

    /* renamed from: d */
    private static boolean f145566d;

    /* renamed from: a */
    public C58847b f145567a;

    /* renamed from: b */
    public long f145568b;

    /* renamed from: e */
    private final ReadWriteLock f145569e;

    /* renamed from: f */
    private final Bitmap.Config f145570f;

    /* renamed from: g */
    private Context f145571g;

    /* renamed from: h */
    private Uri f145572h;

    /* renamed from: i */
    private final Point f145573i;

    /* renamed from: j */
    private final AtomicBoolean f145574j;

    /* renamed from: a */
    public static Thread m228271a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public SkiaPooledImageRegionDecoder() {
        this(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaPooledImageRegionDecoder$b */
    public static class C58847b {

        /* renamed from: a */
        private final Semaphore f145577a;

        /* renamed from: b */
        private final Map<BitmapRegionDecoder, Boolean> f145578b;

        /* renamed from: b */
        public synchronized int mo199445b() {
            return this.f145578b.size();
        }

        /* renamed from: c */
        public BitmapRegionDecoder mo199447c() {
            this.f145577a.acquireUninterruptibly();
            return m228284e();
        }

        private C58847b() {
            this.f145577a = new Semaphore(0, true);
            this.f145578b = new ConcurrentHashMap();
        }

        /* renamed from: a */
        public synchronized boolean mo199444a() {
            return this.f145578b.isEmpty();
        }

        /* renamed from: d */
        public synchronized void mo199448d() {
            while (!this.f145578b.isEmpty()) {
                BitmapRegionDecoder c = mo199447c();
                c.recycle();
                this.f145578b.remove(c);
            }
        }

        /* renamed from: e */
        private synchronized BitmapRegionDecoder m228284e() {
            for (Map.Entry<BitmapRegionDecoder, Boolean> entry : this.f145578b.entrySet()) {
                if (!entry.getValue().booleanValue()) {
                    entry.setValue(true);
                    return entry.getKey();
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo199443a(BitmapRegionDecoder bitmapRegionDecoder) {
            if (m228283c(bitmapRegionDecoder)) {
                this.f145577a.release();
            }
        }

        /* renamed from: b */
        public synchronized void mo199446b(BitmapRegionDecoder bitmapRegionDecoder) {
            this.f145578b.put(bitmapRegionDecoder, false);
            this.f145577a.release();
        }

        /* renamed from: c */
        private synchronized boolean m228283c(BitmapRegionDecoder bitmapRegionDecoder) {
            for (Map.Entry<BitmapRegionDecoder, Boolean> entry : this.f145578b.entrySet()) {
                if (bitmapRegionDecoder == entry.getKey()) {
                    if (!entry.getValue().booleanValue()) {
                        return false;
                    }
                    entry.setValue(false);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    private int m228273e() {
        if (Build.VERSION.SDK_INT >= 17) {
            return Runtime.getRuntime().availableProcessors();
        }
        return m228274f();
    }

    /* renamed from: f */
    private int m228274f() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new C58846a()).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    /* renamed from: g */
    private boolean m228275g() {
        ActivityManager activityManager = (ActivityManager) this.f145571g.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    /* renamed from: d */
    private void m228272d() {
        if (this.f145574j.compareAndSet(false, true) && this.f145568b < Long.MAX_VALUE) {
            mo199438a("Starting lazy init of additional decoders");
            m228271a(new Thread() {
                /* class com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaPooledImageRegionDecoder.C588451 */

                public void run() {
                    while (SkiaPooledImageRegionDecoder.this.f145567a != null) {
                        SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = SkiaPooledImageRegionDecoder.this;
                        if (skiaPooledImageRegionDecoder.mo199439a(skiaPooledImageRegionDecoder.f145567a.mo199445b(), SkiaPooledImageRegionDecoder.this.f145568b)) {
                            try {
                                if (SkiaPooledImageRegionDecoder.this.f145567a != null) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    SkiaPooledImageRegionDecoder.this.mo199438a("Starting decoder");
                                    SkiaPooledImageRegionDecoder.this.mo199440c();
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder2 = SkiaPooledImageRegionDecoder.this;
                                    skiaPooledImageRegionDecoder2.mo199438a("Started decoder, took " + (currentTimeMillis2 - currentTimeMillis) + "ms");
                                }
                            } catch (Exception e) {
                                SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder3 = SkiaPooledImageRegionDecoder.this;
                                skiaPooledImageRegionDecoder3.mo199438a("Failed to start decoder: " + e.getMessage());
                            }
                        } else {
                            return;
                        }
                    }
                }
            }).start();
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
    /* renamed from: b */
    public synchronized void mo199437b() {
        this.f145569e.writeLock().lock();
        try {
            C58847b bVar = this.f145567a;
            if (bVar != null) {
                bVar.mo199448d();
                this.f145567a = null;
                this.f145571g = null;
                this.f145572h = null;
            }
        } finally {
            this.f145569e.writeLock().unlock();
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
    /* renamed from: a */
    public synchronized boolean mo199436a() {
        boolean z;
        C58847b bVar = this.f145567a;
        if (bVar == null || bVar.mo199444a()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public void mo199440c() throws Exception {
        BitmapRegionDecoder bitmapRegionDecoder;
        Resources resources;
        int i;
        String uri = this.f145572h.toString();
        long j = Long.MAX_VALUE;
        if (uri.startsWith("android.resource://")) {
            String authority = this.f145572h.getAuthority();
            if (this.f145571g.getPackageName().equals(authority)) {
                resources = this.f145571g.getResources();
            } else {
                resources = this.f145571g.getPackageManager().getResourcesForApplication(authority);
            }
            List<String> pathSegments = this.f145572h.getPathSegments();
            int size = pathSegments.size();
            if (size != 2 || !pathSegments.get(0).equals("drawable")) {
                if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
            } else {
                i = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            }
            try {
                j = this.f145571g.getResources().openRawResourceFd(i).getLength();
            } catch (Exception unused2) {
            }
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(this.f145571g.getResources().openRawResource(i), false);
        } else if (uri.startsWith("file:///android_asset/")) {
            String substring = uri.substring(22);
            try {
                j = this.f145571g.getAssets().openFd(substring).getLength();
            } catch (Exception unused3) {
            }
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(this.f145571g.getAssets().open(substring, 1), false);
        } else if (uri.startsWith("file://")) {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(uri.substring(7), false);
            try {
                File file = new File(uri);
                if (file.exists()) {
                    j = file.length();
                }
            } catch (Exception unused4) {
            }
            bitmapRegionDecoder = newInstance;
        } else {
            InputStream inputStream = null;
            try {
                ContentResolver contentResolver = this.f145571g.getContentResolver();
                inputStream = contentResolver.openInputStream(this.f145572h);
                BitmapRegionDecoder newInstance2 = BitmapRegionDecoder.newInstance(inputStream, false);
                try {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f145572h, "r");
                    if (openAssetFileDescriptor != null) {
                        j = openAssetFileDescriptor.getLength();
                    }
                } catch (Exception unused5) {
                }
                bitmapRegionDecoder = newInstance2;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused6) {
                    }
                }
            }
        }
        this.f145568b = j;
        this.f145573i.set(bitmapRegionDecoder.getWidth(), bitmapRegionDecoder.getHeight());
        this.f145569e.writeLock().lock();
        try {
            C58847b bVar = this.f145567a;
            if (bVar != null) {
                bVar.mo199446b(bitmapRegionDecoder);
            }
        } finally {
            this.f145569e.writeLock().unlock();
        }
    }

    public static void setDebug(boolean z) {
        f145566d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaPooledImageRegionDecoder$a */
    public class C58846a implements FileFilter {
        C58846a() {
        }

        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    public SkiaPooledImageRegionDecoder(Bitmap.Config config) {
        this.f145567a = new C58847b();
        this.f145569e = new ReentrantReadWriteLock(true);
        this.f145568b = Long.MAX_VALUE;
        this.f145573i = new Point(0, 0);
        this.f145574j = new AtomicBoolean(false);
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.f145570f = config;
        } else if (preferredBitmapConfig != null) {
            this.f145570f = preferredBitmapConfig;
        } else {
            this.f145570f = Bitmap.Config.RGB_565;
        }
    }

    /* renamed from: a */
    public void mo199438a(String str) {
        if (f145566d) {
            Log.d(f145565c, str);
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
    /* renamed from: a */
    public Point mo199035a(Context context, Uri uri) throws Exception {
        this.f145571g = context;
        this.f145572h = uri;
        mo199440c();
        return this.f145573i;
    }

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
    /* renamed from: a */
    public Bitmap mo199034a(Rect rect, int i) {
        mo199438a("Decode region " + rect + " on thread " + Thread.currentThread().getName());
        if (rect.width() < this.f145573i.x || rect.height() < this.f145573i.y) {
            m228272d();
        }
        this.f145569e.readLock().lock();
        try {
            C58847b bVar = this.f145567a;
            if (bVar != null) {
                BitmapRegionDecoder c = bVar.mo199447c();
                if (c != null) {
                    try {
                        if (!c.isRecycled()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = i;
                            options.inPreferredConfig = this.f145570f;
                            Bitmap decodeRegion = c.decodeRegion(rect, options);
                            if (decodeRegion != null) {
                                return decodeRegion;
                            }
                            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                        }
                    } finally {
                        if (c != null) {
                            this.f145567a.mo199443a(c);
                        }
                    }
                }
                if (c != null) {
                    this.f145567a.mo199443a(c);
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } finally {
            this.f145569e.readLock().unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo199439a(int i, long j) {
        if (i >= 4) {
            mo199438a("No additional decoders allowed, reached hard limit (4)");
            return false;
        }
        long j2 = ((long) i) * j;
        if (j2 > 20971520) {
            mo199438a("No additional encoders allowed, reached hard memory limit (20Mb)");
            return false;
        } else if (i >= m228273e()) {
            mo199438a("No additional encoders allowed, limited by CPU cores (" + m228273e() + ")");
            return false;
        } else if (m228275g()) {
            mo199438a("No additional encoders allowed, memory is low");
            return false;
        } else {
            mo199438a("Additional decoder allowed, current count is " + i + ", estimated native memory " + (j2 / 1048576) + "Mb");
            return true;
        }
    }
}
