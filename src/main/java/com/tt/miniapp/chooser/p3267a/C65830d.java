package com.tt.miniapp.chooser.p3267a;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapphost.data.ContextSingletonInstance;
import java.lang.ref.WeakReference;

/* renamed from: com.tt.miniapp.chooser.a.d */
public class C65830d {

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.chooser.a.d$a */
    public static class AsyncTaskC65831a extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        private WeakReference<ImageView> f165909a;

        /* renamed from: b */
        private String f165910b;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            ImageView imageView = this.f165909a.get();
            if (imageView != null) {
                imageView.setImageBitmap(null);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            ImageView imageView = this.f165909a.get();
            if (imageView != null && this.f165910b.equals(imageView.getTag(R.id.microapp_m_video_tag))) {
                imageView.setImageBitmap(bitmap);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            Exception e;
            Bitmap bitmap = null;
            try {
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strArr[0], 3);
                if (createVideoThumbnail == null) {
                    return null;
                }
                try {
                    if (C65830d.m258000a(strArr[0]) != null) {
                        return createVideoThumbnail;
                    }
                    C65830d.m258001a(this.f165910b, createVideoThumbnail);
                    return createVideoThumbnail;
                } catch (Exception e2) {
                    e = e2;
                    bitmap = createVideoThumbnail;
                    AppBrandLogger.stacktrace(6, "VideoThumbLoader", e.getStackTrace());
                    return bitmap;
                }
            } catch (Exception e3) {
                e = e3;
                AppBrandLogger.stacktrace(6, "VideoThumbLoader", e.getStackTrace());
                return bitmap;
            }
        }

        public AsyncTaskC65831a(ImageView imageView, String str) {
            this.f165909a = new WeakReference<>(imageView);
            this.f165910b = str;
        }
    }

    /* renamed from: a */
    public static Bitmap m258000a(String str) {
        return ContextSingletonInstance.getInstance().getLruCache().get(str);
    }

    /* renamed from: a */
    public static void m258001a(String str, Bitmap bitmap) {
        if (m258000a(str) == null) {
            ContextSingletonInstance.getInstance().getLruCache().put(str, bitmap);
        }
    }

    /* renamed from: a */
    public static void m258002a(String str, ImageView imageView) {
        if (m258000a(str) == null) {
            imageView.setTag(R.id.microapp_m_video_tag, str);
            new AsyncTaskC65831a(imageView, str).execute(str);
            return;
        }
        imageView.setImageBitmap(m258000a(str));
    }
}
