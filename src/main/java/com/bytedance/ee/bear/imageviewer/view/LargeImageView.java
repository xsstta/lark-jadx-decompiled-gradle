package com.bytedance.ee.bear.imageviewer.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.request.p095a.AbstractC2520h;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ee.bear.widgets.RotateLoadingView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13674e;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13749l;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import java.io.File;
import java.io.IOException;

public class LargeImageView extends FrameLayout {

    /* renamed from: a */
    AbstractC7867a f21238a;

    /* renamed from: b */
    public SubsamplingScaleImageView f21239b;

    /* renamed from: c */
    public LazyLoadingHelper f21240c;

    /* renamed from: d */
    private ImageView f21241d;

    /* renamed from: e */
    private RotateLoadingView f21242e;

    /* renamed from: com.bytedance.ee.bear.imageviewer.view.LargeImageView$a */
    public interface AbstractC7867a {
        /* renamed from: a */
        void mo30693a();

        /* renamed from: b */
        void mo30694b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f21239b;
        if (subsamplingScaleImageView != null && subsamplingScaleImageView.getVisibility() == 0) {
            this.f21239b.recycle();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: b */
    private void m31562b() {
        this.f21241d = new ImageView(getContext());
        this.f21239b = new SubsamplingScaleImageView(getContext());
        this.f21242e = new RotateLoadingView(getContext());
        addView(this.f21241d, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f21239b, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C13749l.m55738a(42), C13749l.m55738a(42));
        layoutParams.gravity = 17;
        this.f21242e.setLayoutParams(layoutParams);
        addView(this.f21242e);
        this.f21239b.setExecutor(CoreThreadPool.getDefault().getCachedThreadPool());
        LazyLoadingHelper aVar = new LazyLoadingHelper(this.f21242e);
        this.f21240c = aVar;
        aVar.mo30695a();
    }

    /* renamed from: a */
    public void mo30686a() {
        this.f21241d.setVisibility(0);
        this.f21241d.setImageDrawable(null);
        this.f21239b.setVisibility(8);
        this.f21240c.mo30696b();
    }

    public void setLoadPreviewListener(AbstractC7867a aVar) {
        this.f21238a = aVar;
    }

    public LargeImageView(Context context) {
        this(context, null);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f21241d.setOnClickListener(onClickListener);
        this.f21239b.setOnClickListener(onClickListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f21241d.setOnLongClickListener(onLongClickListener);
        this.f21239b.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    private void m31560a(int[] iArr) {
        if (iArr[0] <= 0) {
            iArr[0] = DeviceUtils.getScreenWidth(getContext());
        }
        if (iArr[1] <= 0) {
            iArr[1] = DeviceUtils.getScreenHeight(getContext());
        }
    }

    public LargeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m31563b(ComponentCallbacks2C2126g gVar, File file) {
        this.f21241d.setVisibility(0);
        this.f21239b.setVisibility(8);
        ((C2124f) gVar.mo10431j().mo10393a(file).mo11129a(AbstractC2354j.f7813c)).mo10399a(this.f21241d);
        this.f21240c.mo30696b();
        AbstractC7867a aVar = this.f21238a;
        if (aVar != null) {
            aVar.mo30693a();
        }
    }

    /* renamed from: a */
    public static Bitmap m31557a(int i, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            C13479a.m54757a("cannot create rotateBitmap, bitmap info, width: " + bitmap.getWidth() + "  height: " + bitmap.getWidth());
            return null;
        }
    }

    /* renamed from: a */
    public void mo30687a(ComponentCallbacks2C2126g gVar, File file) {
        if (file != null) {
            if ("gif".equals(C13674e.m55482a(file))) {
                m31563b(gVar, file);
                return;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getPath(), options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (i <= 0 || i2 <= 0) {
                m31558a(i, i2, file);
                try {
                    C13675f.m55527d(file);
                } catch (IOException e) {
                    C13479a.m54759a("LargeImageView", "loadView(): delete invalid pic failed ", e);
                }
                mo30686a();
                return;
            }
            m31559a(gVar, file, i, i2);
        }
    }

    public LargeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31562b();
    }

    /* renamed from: b */
    public static float m31561b(View view, int i, int i2) {
        return Math.min(((float) DeviceUtils.getScreenWidth(view.getContext())) / ((float) i), ((float) DeviceUtils.getScreenHeight(view.getContext())) / ((float) i2));
    }

    /* renamed from: a */
    public static float m31556a(View view, int i, int i2) {
        float screenWidth = ((float) i) / ((float) DeviceUtils.getScreenWidth(view.getContext()));
        float screenHeight = ((float) i2) / ((float) DeviceUtils.getScreenHeight(view.getContext()));
        if (screenWidth < 1.0f) {
            screenWidth = 1.5f / screenWidth;
        }
        if (screenHeight < 1.0f) {
            screenHeight = 1.5f / screenHeight;
        }
        return Math.max(Math.max(screenWidth, screenHeight), 2.0f);
    }

    /* renamed from: c */
    private static int[] m31564c(View view, int i, int i2) {
        int[] iArr = new int[2];
        int width = view.getWidth();
        int height = view.getHeight();
        int screenWidth = DeviceUtils.getScreenWidth(view.getContext());
        int screenHeight = DeviceUtils.getScreenHeight(view.getContext());
        if (width <= 0 || width > screenWidth) {
            width = screenWidth;
        }
        if (height <= 0 || height > screenHeight) {
            height = screenHeight;
        }
        if (i2 >= height || i >= width) {
            float f = ((float) i) / ((float) i2);
            float f2 = ((float) height) * f;
            float f3 = (float) width;
            if (f2 > f3) {
                iArr[0] = width;
                iArr[1] = (int) (f3 / f);
            } else {
                iArr[1] = height;
                iArr[0] = (int) f2;
            }
        } else {
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] > screenWidth / 2 && iArr[1] > screenHeight / 4) {
            iArr[0] = iArr[0] / 2;
            iArr[1] = iArr[1] / 2;
        }
        return iArr;
    }

    /* renamed from: a */
    private void m31558a(int i, int i2, File file) {
        C13479a.m54760a("LargeImageView", "cannot get image file width or height, width: " + i + " and height: " + i2 + " fileInfo: " + C13598b.m55197d(file.getAbsolutePath()), new IllegalStateException(), false);
    }

    /* renamed from: a */
    private void m31559a(ComponentCallbacks2C2126g gVar, final File file, int i, int i2) {
        final ImageSource uri = ImageSource.uri(Uri.fromFile(file));
        uri.dimensions(i, i2);
        int[] c = m31564c(this.f21239b, i, i2);
        final float b = m31561b(this.f21239b, i, i2);
        m31560a(c);
        final int readPictureDegree = BitmapUtils.readPictureDegree(file.getPath());
        this.f21241d.setVisibility(8);
        SubsamplingScaleImageView subsamplingScaleImageView = this.f21239b;
        subsamplingScaleImageView.setMaxScale(m31556a(subsamplingScaleImageView, i, i2));
        if (i2 / i > 3) {
            this.f21239b.setMinimumScaleType(3);
            this.f21239b.setMinScale(b);
        }
        this.f21239b.setVisibility(0);
        if ("png".equalsIgnoreCase(C13674e.m55482a(file))) {
            this.f21239b.setTileBackgroundColor(getResources().getColor(R.color.space_kit_n100));
        } else {
            this.f21239b.setTileBackgroundColor(getResources().getColor(R.color.color_transparent));
        }
        ((C2124f) gVar.mo10430i().mo10393a(file).mo11144c(c[0], c[1])).mo10397a((AbstractC2522j) new AbstractC2520h<Bitmap>() {
            /* class com.bytedance.ee.bear.imageviewer.view.LargeImageView.C78661 */

            @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: b */
            public void mo10444b(Drawable drawable) {
                LargeImageView.this.mo30686a();
                if (LargeImageView.this.f21238a != null) {
                    LargeImageView.this.f21238a.mo30694b();
                }
                LargeImageView.this.f21240c.mo30696b();
                C13479a.m54758a("LargeImageView", "onLoad file Failed(): " + C13598b.m55197d(file.toString()));
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
                mo30692a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
            }

            /* renamed from: a */
            public void mo30692a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
                Bitmap a = LargeImageView.m31557a(-readPictureDegree, bitmap);
                if (a != null) {
                    ImageSource bitmap2 = ImageSource.bitmap(a);
                    LargeImageView.this.f21239b.setOrientation(readPictureDegree);
                    LargeImageView.this.f21239b.setImage(uri, bitmap2);
                } else {
                    LargeImageView.this.f21239b.setOrientation(readPictureDegree);
                    LargeImageView.this.f21239b.setImage(uri);
                }
                LargeImageView.this.f21239b.setScaleAndCenter(b, new PointF(((float) LargeImageView.this.f21239b.getSWidth()) / 2.0f, 1.0f));
                if (LargeImageView.this.f21238a != null) {
                    LargeImageView.this.f21238a.mo30693a();
                }
                LargeImageView.this.f21240c.mo30696b();
            }
        });
    }
}
