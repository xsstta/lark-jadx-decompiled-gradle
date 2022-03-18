package com.ss.android.lark.widget.photo_picker.subsampling.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SkiaImageRegionDecoder implements AbstractC58851d {

    /* renamed from: a */
    private BitmapRegionDecoder f145562a;

    /* renamed from: b */
    private final ReadWriteLock f145563b;

    /* renamed from: c */
    private final Bitmap.Config f145564c;

    public SkiaImageRegionDecoder() {
        this(null);
    }

    /* renamed from: c */
    private Lock m228266c() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.f145563b.writeLock();
        }
        return this.f145563b.readLock();
    }

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
    /* renamed from: a */
    public synchronized boolean mo199436a() {
        boolean z;
        BitmapRegionDecoder bitmapRegionDecoder = this.f145562a;
        if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
    /* renamed from: b */
    public synchronized void mo199437b() {
        this.f145563b.writeLock().lock();
        try {
            this.f145562a.recycle();
            this.f145562a = null;
        } finally {
            this.f145563b.writeLock().unlock();
        }
    }

    public SkiaImageRegionDecoder(Bitmap.Config config) {
        this.f145563b = new ReentrantReadWriteLock(true);
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.f145564c = config;
        } else if (preferredBitmapConfig != null) {
            this.f145564c = preferredBitmapConfig;
        } else {
            this.f145564c = Bitmap.Config.RGB_565;
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
    /* renamed from: a */
    public Bitmap mo199034a(Rect rect, int i) {
        m228266c().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f145562a;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            options.inPreferredConfig = this.f145564c;
            Bitmap decodeRegion = this.f145562a.decodeRegion(rect, options);
            if (decodeRegion != null) {
                return decodeRegion;
            }
            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
        } finally {
            m228266c().unlock();
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
    /* renamed from: a */
    public Point mo199035a(Context context, Uri uri) throws Exception {
        Resources resources;
        int i;
        String uri2 = uri.toString();
        if (uri2.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            if (context.getPackageName().equals(authority)) {
                resources = context.getResources();
            } else {
                resources = context.getPackageManager().getResourcesForApplication(authority);
            }
            List<String> pathSegments = uri.getPathSegments();
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
            this.f145562a = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i), false);
        } else if (uri2.startsWith("file:///android_asset/")) {
            this.f145562a = BitmapRegionDecoder.newInstance(context.getAssets().open(uri2.substring(22), 1), false);
        } else if (uri2.startsWith("file://")) {
            this.f145562a = BitmapRegionDecoder.newInstance(uri2.substring(7), false);
        } else {
            InputStream inputStream = null;
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
                if (inputStream != null) {
                    this.f145562a = BitmapRegionDecoder.newInstance(inputStream, false);
                } else {
                    throw new Exception("Content resolver returned null stream. Unable to initialise with uri.");
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return new Point(this.f145562a.getWidth(), this.f145562a.getHeight());
    }
}
