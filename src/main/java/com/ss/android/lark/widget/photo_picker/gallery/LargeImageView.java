package com.ss.android.lark.widget.photo_picker.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38811b;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.subsampling.C58844a;
import com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58850c;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.C58848a;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaImageDecoder;
import com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaImageRegionDecoder;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class LargeImageView extends FrameLayout {

    /* renamed from: d */
    private static int[] f144996d = new int[2];

    /* renamed from: a */
    AbstractC58686c f144997a;

    /* renamed from: b */
    public SubsamplingScaleImageView f144998b;

    /* renamed from: c */
    public ImageView f144999c;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.LargeImageView$c */
    public interface AbstractC58686c {
        /* renamed from: a */
        void mo199036a();

        /* renamed from: b */
        void mo199037b();
    }

    public ImageView getImageView() {
        return this.f144999c;
    }

    public AbstractC58686c getLoadPreviewListener() {
        return this.f144997a;
    }

    /* renamed from: a */
    public void mo199012a(final File file, final Drawable drawable, final Drawable drawable2, final boolean z) {
        this.f144998b.setBitmapDecoderFactory(new C58848a<AbstractC58850c>(C58684a.class) {
            /* class com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.C586772 */

            /* renamed from: a */
            public AbstractC58850c mo199026b() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
                AbstractC58850c cVar = (AbstractC58850c) super.mo199026b();
                if (cVar instanceof C58684a) {
                    ((C58684a) cVar).f145024a = z;
                }
                return cVar;
            }
        });
        this.f144998b.setRegionDecoderFactory(new C58848a<AbstractC58851d>(C58685b.class) {
            /* class com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.C586783 */

            /* renamed from: a */
            public AbstractC58851d mo199026b() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
                AbstractC58851d dVar = (AbstractC58851d) super.mo199026b();
                if (dVar instanceof C58685b) {
                    ((C58685b) dVar).f145025a = z;
                }
                return dVar;
            }
        });
        if (file != null) {
            setTag(R.id.large_image_file_tag, file.getPath());
            C57865c.m224576a(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.RunnableC586794 */

                public void run() {
                    boolean z;
                    int i;
                    int i2;
                    if (ImageUtils.ImageType.TYPE_GIF == ImageUtils.m224131a(file)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        LargeImageView.this.mo199011a(file, drawable, drawable2);
                        return;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file.getPath(), options);
                    boolean equals = "image/heif".equals(options.outMimeType);
                    int i3 = options.outWidth;
                    int i4 = options.outHeight;
                    if (C57820d.m224437c(file.getPath()) % 180 == 90) {
                        int i5 = options.outHeight;
                        i = options.outWidth;
                        i2 = i5;
                    } else {
                        i2 = i3;
                        i = i4;
                    }
                    if (i2 <= 0 || i <= 0) {
                        LargeImageView.this.mo199008a(i2, i, file);
                        LargeImageView.this.mo199011a(file, drawable, drawable2);
                        return;
                    }
                    LargeImageView.this.mo199009a(drawable, drawable2, file, i2, i, z, equals);
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo199013a(File file) {
        return !C26325y.m95336b(getTag(R.id.large_image_file_tag), file.getPath());
    }

    /* renamed from: a */
    public void mo199010a(SubsamplingScaleImageView subsamplingScaleImageView, int i, int i2) {
        float b = m227703b(subsamplingScaleImageView, i, i2);
        float a = m227698a((View) subsamplingScaleImageView, i, i2);
        subsamplingScaleImageView.setMaxScale(a);
        subsamplingScaleImageView.setDoubleTapZoomScale(a);
        subsamplingScaleImageView.mo199333a(b, new PointF(((float) subsamplingScaleImageView.getSWidth()) / 2.0f, 1.0f));
        if (i2 / i > 3) {
            subsamplingScaleImageView.setMinimumScaleType(1);
            subsamplingScaleImageView.setMinScale(b);
        }
    }

    /* renamed from: a */
    private void m227700a() {
        this.f144999c = new ImageView(getContext());
        this.f144998b = new SubsamplingScaleImageView(getContext());
        addView(this.f144999c, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f144998b, new FrameLayout.LayoutParams(-1, -1));
        this.f144998b.setExecutor(CoreThreadPool.getDefault().getCachedThreadPool());
        this.f144998b.setOrientation(-1);
        this.f144998b.setTileBackgroundColor(UIHelper.getColor(R.color.lkui_N100));
    }

    public void setLoadPreviewListener(AbstractC58686c cVar) {
        this.f144997a = cVar;
    }

    public void setMaxAvailableSize(int[] iArr) {
        f144996d = iArr;
    }

    public LargeImageView(Context context) {
        this(context, null);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f144999c.setOnClickListener(onClickListener);
        this.f144998b.setOnClickListener(onClickListener);
    }

    public void setOnGenericMotionListener(View.OnGenericMotionListener onGenericMotionListener) {
        super.setOnGenericMotionListener(onGenericMotionListener);
        this.f144999c.setOnGenericMotionListener(onGenericMotionListener);
        this.f144998b.setOnGenericMotionListener(onGenericMotionListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f144999c.setOnLongClickListener(onLongClickListener);
        this.f144998b.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    private void m227701a(int[] iArr) {
        if (iArr[0] <= 0) {
            iArr[0] = f144996d[0];
        }
        if (iArr[1] <= 0) {
            iArr[1] = f144996d[1];
        }
    }

    /* renamed from: a */
    private float m227699a(boolean z) {
        if (z) {
            float minScale = this.f144998b.getMinScale();
            float scale = this.f144998b.getScale();
            if (scale > minScale) {
                return Math.max(scale - 0.05f, minScale);
            }
            return BitmapDescriptorFactory.HUE_RED;
        }
        float maxScale = this.f144998b.getMaxScale();
        float scale2 = this.f144998b.getScale();
        if (scale2 < maxScale) {
            return Math.min(scale2 + 0.05f, maxScale);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!DesktopUtil.m144301a(getContext()) || (motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || !this.f144998b.mo199346b()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (Math.abs(motionEvent.getAxisValue(9)) < 0.05f) {
                return super.onGenericMotionEvent(motionEvent);
            }
            if (motionEvent.getAxisValue(9) < BitmapDescriptorFactory.HUE_RED) {
                z2 = true;
            } else {
                z2 = false;
            }
            float a = m227699a(z2);
            if (a != BitmapDescriptorFactory.HUE_RED) {
                this.f144998b.mo199345b(a).mo199397a(2L).mo199398a(false).mo199399a();
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo199007a(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        float a = m227699a(z);
        if (a != BitmapDescriptorFactory.HUE_RED) {
            this.f144998b.mo199345b(a).mo199397a(2L).mo199398a(false).mo199399a();
        }
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.LargeImageView$b */
    public static class C58685b extends SkiaImageRegionDecoder {

        /* renamed from: a */
        public boolean f145025a;

        /* renamed from: b */
        private String f145026b;

        @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaImageRegionDecoder, com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
        /* renamed from: a */
        public Point mo199035a(Context context, Uri uri) throws Exception {
            Point a = super.mo199035a(context, uri);
            this.f145026b = uri.toString();
            return a;
        }

        @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaImageRegionDecoder, com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58851d
        /* renamed from: a */
        public Bitmap mo199034a(Rect rect, int i) {
            Bitmap a = super.mo199034a(rect, i);
            if (!TextUtils.isEmpty(this.f145026b) && this.f145026b.startsWith("file://") && this.f145025a) {
                C26311p.m95291k(this.f145026b.substring(7));
            }
            return a;
        }
    }

    public LargeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.LargeImageView$a */
    public static class C58684a extends SkiaImageDecoder {

        /* renamed from: a */
        public boolean f145024a;

        @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaImageDecoder, com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58850c
        /* renamed from: a */
        public Bitmap mo199033a(Context context, Uri uri) throws Exception {
            Bitmap a = super.mo199033a(context, uri);
            if (this.f145024a) {
                String uri2 = uri.toString();
                if (uri2.startsWith("file://")) {
                    C26311p.m95291k(uri2.substring(7));
                }
            }
            return a;
        }
    }

    /* renamed from: a */
    public static boolean m227702a(int i, int i2) {
        if (((long) i) * ((long) i2) > ((long) (DeviceUtils.getScreenWidth(LarkContext.getApplication()) * 4 * DeviceUtils.getScreenHeight(LarkContext.getApplication()))) || Math.max(i, i2) >= 4096) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo199011a(final File file, final Drawable drawable, final Drawable drawable2) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.RunnableC586805 */

            public void run() {
                if (!LargeImageView.this.mo199013a(file)) {
                    LargeImageView.this.mo199014b(file, drawable, drawable2);
                }
            }
        });
    }

    public LargeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m227700a();
    }

    /* renamed from: a */
    public static float m227698a(View view, int i, int i2) {
        int[] iArr = f144996d;
        float f = ((float) i) / ((float) iArr[0]);
        float f2 = ((float) i2) / ((float) iArr[1]);
        if (f < 1.0f) {
            f = 1.5f / f;
        }
        if (f2 < 1.0f) {
            f2 = 1.5f / f2;
        }
        return Math.max(Math.max(f, f2), 2.0f);
    }

    /* renamed from: b */
    public static float m227703b(View view, int i, int i2) {
        int i3 = f144996d[0];
        int screenHeight = DeviceUtils.getScreenHeight(view.getContext());
        float f = (float) i2;
        float f2 = (float) i;
        if (f / f2 >= 3.0f) {
            return ((float) i3) / f2;
        }
        return Math.min(((float) i3) / f2, ((float) screenHeight) / f);
    }

    /* renamed from: c */
    private static int[] m227704c(View view, int i, int i2) {
        int[] iArr = new int[2];
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr2 = f144996d;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        if (width <= 0 || width > i3) {
            width = i3;
        }
        if (height <= 0 || height > i4) {
            height = i4;
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
        if (iArr[0] > i3 / 2 && iArr[1] > i4 / 4) {
            iArr[0] = iArr[0] / 2;
            iArr[1] = iArr[1] / 2;
        }
        return iArr;
    }

    /* renamed from: b */
    public void mo199014b(File file, Drawable drawable, Drawable drawable2) {
        this.f144999c.setVisibility(0);
        this.f144998b.setVisibility(8);
        IRequestCreator load = ImageLoader.with(getContext()).load(file);
        load.placeholder(drawable);
        load.error(drawable2);
        load.diskCacheStrategy(DiskCacheStrategy.SOURCE);
        load.dontAnimate(false);
        load.into(new C38811b(this.f144999c) {
            /* class com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.C586837 */

            @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
            /* renamed from: a */
            public void mo49247a(Drawable drawable) {
                if (LargeImageView.this.f144997a != null) {
                    LargeImageView.this.f144997a.mo199037b();
                }
            }

            /* renamed from: d */
            public void mo49248a(Drawable drawable) {
                if (LargeImageView.this.f144997a != null) {
                    LargeImageView.this.f144997a.mo199036a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo199008a(int i, int i2, File file) {
        Log.m165385e("LargeImageView", "cannot get image file width or height, width: " + i + " and height: " + i2 + " fileInfo: " + file.getAbsolutePath(), new IllegalStateException(), false);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.RunnableC586761 */

            public void run() {
                int sHeight = LargeImageView.this.f144998b.getSHeight();
                int sWidth = LargeImageView.this.f144998b.getSWidth();
                if (sHeight > 0 && sWidth > 0) {
                    float b = LargeImageView.m227703b(LargeImageView.this.f144998b, sWidth, sHeight);
                    LargeImageView.this.f144998b.setMinScale(b);
                    LargeImageView.this.f144998b.setMaxScale(LargeImageView.m227698a((View) LargeImageView.this.f144998b, sWidth, sHeight));
                    LargeImageView.this.f144998b.mo199333a(b, new PointF(((float) sWidth) / 2.0f, 1.0f));
                }
            }
        }, 32);
    }

    /* renamed from: a */
    public void mo199009a(final Drawable drawable, final Drawable drawable2, final File file, final int i, final int i2, boolean z, boolean z2) {
        boolean z3;
        final C58844a a = C58844a.m228250a(Uri.fromFile(file));
        a.mo199426a(i, i2);
        if ((!z2 || C58612c.m227290a().mo102854b("lark.photo-picker.tiling")) && m227702a(i, i2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        a.mo199427a(z3);
        final int[] c = m227704c(this.f144998b, i, i2);
        m227701a(c);
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.RunnableC586816 */

            public void run() {
                if (!LargeImageView.this.mo199013a(file)) {
                    LargeImageView.this.f144999c.setVisibility(8);
                    LargeImageView.this.f144998b.setVisibility(0);
                    IRequestCreator asBitmap = ImageLoader.with(LargeImageView.this.getContext()).load(file).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).placeholder(drawable).error(drawable2).asBitmap();
                    int[] iArr = c;
                    asBitmap.override(iArr[0], iArr[1]).into(new C38818i<Bitmap>() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.RunnableC586816.C586821 */

                        /* renamed from: a */
                        public void mo49248a(Bitmap bitmap) {
                            if (bitmap != null) {
                                LargeImageView.this.f144998b.mo199338a(a, C58844a.m228249a(bitmap));
                            } else {
                                LargeImageView.this.f144998b.setImage(a);
                            }
                            LargeImageView.this.mo199010a(LargeImageView.this.f144998b, i, i2);
                            if (LargeImageView.this.f144997a != null) {
                                LargeImageView.this.f144997a.mo199036a();
                            }
                        }
                    });
                }
            }
        });
    }
}
