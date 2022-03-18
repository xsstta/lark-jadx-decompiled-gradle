package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.C1926c;
import com.android.volley.C1933h;
import com.android.volley.C1936j;
import com.android.volley.C1941m;
import com.android.volley.ParseError;
import com.android.volley.Request;

/* renamed from: com.android.volley.toolbox.l */
public class C1970l extends Request<Bitmap> {
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;
    private C1936j.AbstractC1938b<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(Bitmap bitmap) {
        C1936j.AbstractC1938b<Bitmap> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(bitmap);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public C1936j<Bitmap> parseNetworkResponse(C1933h hVar) {
        C1936j<Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                doParse = doParse(hVar);
            } catch (OutOfMemoryError e) {
                C1941m.m8605c("Caught OOM for %d byte image, url=%s", Integer.valueOf(hVar.f6598b.length), getUrl());
                return C1936j.m8593a(new ParseError(e));
            } catch (Throwable th) {
                throw th;
            }
        }
        return doParse;
    }

    private C1936j<Bitmap> doParse(C1933h hVar) {
        Bitmap bitmap;
        byte[] bArr = hVar.f6598b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i, i2, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i2, i, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i, i2, resizedDimension, resizedDimension2);
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmap != null && (bitmap.getWidth() > resizedDimension || bitmap.getHeight() > resizedDimension2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, resizedDimension, resizedDimension2, true);
                bitmap.recycle();
                bitmap = createScaledBitmap;
            }
        }
        if (bitmap == null) {
            return C1936j.m8593a(new ParseError(hVar));
        }
        return C1936j.m8594a(bitmap, C1956g.m8659a(hVar));
    }

    static int findBestSampleSize(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int getResizedDimension(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (i == 0) {
                return i3;
            }
            return i;
        } else if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = (double) i2;
                if (((double) i) * d < d2) {
                    return (int) (d2 / d);
                }
                return i;
            }
            double d3 = (double) i2;
            if (((double) i) * d > d3) {
                return (int) (d3 / d);
            }
            return i;
        }
    }

    public C1970l(String str, C1936j.AbstractC1938b<Bitmap> bVar, int i, int i2, Bitmap.Config config, C1936j.AbstractC1937a aVar) {
        this(str, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }

    public C1970l(String str, C1936j.AbstractC1938b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, C1936j.AbstractC1937a aVar) {
        super(0, str, aVar);
        this.mLock = new Object();
        setRetryPolicy(new C1926c(1000, 2, 2.0f));
        this.mListener = bVar;
        this.mDecodeConfig = config;
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
        this.mScaleType = scaleType;
    }
}
