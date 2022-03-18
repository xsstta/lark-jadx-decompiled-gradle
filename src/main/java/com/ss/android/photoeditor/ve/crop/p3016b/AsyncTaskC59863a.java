package com.ss.android.photoeditor.ve.crop.p3016b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;
import com.ss.android.photoeditor.ve.p3018e.C59898c;
import com.ss.android.photoeditor.ve.p3018e.C59904g;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.photoeditor.ve.crop.b.a */
public final class AsyncTaskC59863a extends AsyncTask<Void, Void, C59864a> {

    /* renamed from: a */
    private final WeakReference<CropImageView> f148902a;

    /* renamed from: b */
    private final Uri f148903b;

    /* renamed from: c */
    private final WeakReference<Context> f148904c;

    /* renamed from: d */
    private final int f148905d;

    /* renamed from: e */
    private final int f148906e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C59864a aVar) {
        CropImageView cropImageView;
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.f148902a.get()) != null) {
                z = true;
                cropImageView.mo203797a(aVar);
            }
            if (!z && aVar.f148908b != null) {
                aVar.f148908b.recycle();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C59864a doInBackground(Void... voidArr) {
        Context context = this.f148904c.get();
        if (context == null) {
            return new C59864a(this.f148903b, new Exception("无context"));
        }
        try {
            if (isCancelled()) {
                return null;
            }
            if (!C59904g.m232487a(this.f148903b.getPath())) {
                if (!C59904g.m232487a(this.f148903b.toString())) {
                    C59898c.C59899a a = C59898c.m232456a(context, this.f148903b, this.f148905d, this.f148906e);
                    if (!isCancelled()) {
                        return new C59864a(this.f148903b, a.f149207a, a.f149208b, 0);
                    }
                    return null;
                }
            }
            return new C59864a(this.f148903b, new Exception("error image path"));
        } catch (Exception e) {
            return new C59864a(this.f148903b, e);
        }
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.b.a$a */
    public static final class C59864a {

        /* renamed from: a */
        public final Uri f148907a;

        /* renamed from: b */
        public final Bitmap f148908b;

        /* renamed from: c */
        public final int f148909c;

        /* renamed from: d */
        public final int f148910d;

        /* renamed from: e */
        public final Exception f148911e;

        C59864a(Uri uri, Exception exc) {
            this.f148907a = uri;
            this.f148911e = exc;
        }

        C59864a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f148907a = uri;
            this.f148908b = bitmap;
            this.f148909c = i;
            this.f148910d = i2;
        }
    }

    public AsyncTaskC59863a(CropImageView cropImageView, Uri uri) {
        double d;
        this.f148903b = uri;
        this.f148902a = new WeakReference<>(cropImageView);
        this.f148904c = new WeakReference<>(cropImageView.getContext());
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        if (displayMetrics.density > 1.0f) {
            d = (double) (1.0f / displayMetrics.density);
        } else {
            d = 1.0d;
        }
        this.f148905d = (int) (((double) displayMetrics.widthPixels) * d);
        this.f148906e = (int) (((double) displayMetrics.heightPixels) * d);
    }
}
