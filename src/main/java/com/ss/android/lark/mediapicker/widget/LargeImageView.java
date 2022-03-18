package com.ss.android.lark.mediapicker.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.dependency.C44675a;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.dependency.LoadOption;
import com.ss.android.lark.mediapicker.utils.C44743b;
import com.ss.android.lark.mediapicker.utils.C44749f;
import com.ss.android.lark.mediapicker.utils.C44758n;
import com.ss.android.lark.mediapicker.utils.C44763p;
import com.ss.android.lark.mediapicker.utils.ImageUtils;
import java.io.File;

public class LargeImageView extends FrameLayout {

    /* renamed from: a */
    public SubsamplingScaleImageView f113365a;

    /* renamed from: b */
    public ImageView f113366b;

    /* renamed from: c */
    AbstractC44769a f113367c;

    /* renamed from: com.ss.android.lark.mediapicker.widget.LargeImageView$a */
    public interface AbstractC44769a {
    }

    public AbstractC44769a getLoadPreviewListener() {
        return this.f113367c;
    }

    /* renamed from: a */
    private void m177523a() {
        this.f113366b = new ImageView(getContext());
        this.f113365a = new SubsamplingScaleImageView(getContext());
        addView(this.f113366b, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f113365a, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setLoadPreviewListener(AbstractC44769a aVar) {
        this.f113367c = aVar;
    }

    public LargeImageView(Context context) {
        this(context, null);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f113366b.setOnClickListener(onClickListener);
        this.f113365a.setOnClickListener(onClickListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f113366b.setOnLongClickListener(onLongClickListener);
        this.f113365a.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: b */
    public void mo158483b(final File file) {
        final int i;
        final int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        if (options.outWidth <= 0) {
            i = C44749f.m177489a(getContext());
        } else {
            i = options.outWidth;
        }
        if (options.outHeight <= 0) {
            i2 = C44749f.m177490b(getContext());
        } else {
            i2 = options.outHeight;
        }
        final ImageSource uri = ImageSource.uri(Uri.fromFile(file));
        uri.dimensions(i, i2);
        final int[] a = C44743b.m177484a(this.f113365a, i, i2, C44749f.m177489a(getContext()), C44749f.m177490b(getContext()));
        final float a2 = m177521a(this.f113365a, i);
        m177524a(a);
        final int a3 = C44743b.m177483a(file.getPath());
        C44763p.m177517a(new Runnable() {
            /* class com.ss.android.lark.mediapicker.widget.LargeImageView.RunnableC447662 */

            public void run() {
                if (!LargeImageView.this.mo158482a(file)) {
                    LargeImageView.this.f113366b.setVisibility(8);
                    LargeImageView.this.f113365a.setMaxScale(LargeImageView.m177522a(LargeImageView.this.f113365a, i, i2));
                    int i = i;
                    if (i != 0 && i2 / i > 3) {
                        LargeImageView.this.f113365a.setMinimumScaleType(3);
                        LargeImageView.this.f113365a.setMinScale(a2);
                    }
                    LargeImageView.this.f113365a.setVisibility(0);
                    C44675a.m177226a(LargeImageView.this.getContext(), file.getAbsolutePath(), LargeImageView.this.f113365a, new LoadOption.C44674a().mo158282c(true).mo158275a(a[0]).mo158279b(a[1]).mo158276a(LoadOption.MediaDiskCacheStrategy.ALL).mo158278a(), new C44675a.AbstractC44676a<Bitmap>() {
                        /* class com.ss.android.lark.mediapicker.widget.LargeImageView.RunnableC447662.C447671 */
                    });
                }
            }
        });
    }

    /* renamed from: a */
    private void m177524a(int[] iArr) {
        if (iArr == null) {
            C44677b.m177239b("ensureBounds bounds is null");
            C44749f.m177489a(getContext());
            C44749f.m177490b(getContext());
            return;
        }
        if (iArr[0] <= 0) {
            iArr[0] = C44749f.m177489a(getContext());
        }
        if (iArr[1] <= 0) {
            iArr[1] = C44749f.m177490b(getContext());
        }
    }

    /* renamed from: a */
    public boolean mo158482a(File file) {
        Object tag = getTag(R.id.picker_large_image_file_tag);
        if (tag == null || tag.equals(file.getPath())) {
            return false;
        }
        return true;
    }

    public LargeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static float m177521a(View view, int i) {
        int a = C44749f.m177489a(view.getContext());
        if (i <= 0) {
            return 1.0f;
        }
        return ((float) a) / ((float) i);
    }

    public LargeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m177523a();
    }

    /* renamed from: a */
    public static float m177522a(View view, int i, int i2) {
        int a = C44749f.m177489a(view.getContext());
        int b = C44749f.m177490b(view.getContext());
        if (b <= 0 || a <= 0) {
            return 2.0f;
        }
        float f = ((float) i) / ((float) a);
        float f2 = ((float) i2) / ((float) b);
        if (f < 1.0f) {
            f = 1.5f / f;
        }
        if (f2 < 1.0f) {
            f2 = 1.5f / f2;
        }
        return Math.max(Math.max(f, f2), 2.0f);
    }

    /* renamed from: b */
    public void mo158484b(File file, int i, int i2) {
        this.f113366b.setVisibility(0);
        this.f113365a.setVisibility(8);
        LoadOption.C44674a aVar = new LoadOption.C44674a();
        aVar.mo158280b(false).mo158276a(LoadOption.MediaDiskCacheStrategy.ALL);
        if (i != 0) {
            aVar.mo158281c(i);
        }
        if (i2 != 0) {
            aVar.mo158283d(i2);
        }
        C44675a.m177228a(getContext(), file.getAbsolutePath(), this.f113366b, aVar.mo158278a(), (C44675a.AbstractC44676a<Drawable>) new C44675a.AbstractC44676a<Drawable>() {
            /* class com.ss.android.lark.mediapicker.widget.LargeImageView.C447683 */
        });
    }

    /* renamed from: a */
    public void mo158481a(final File file, final int i, final int i2) {
        setTag(R.id.picker_large_image_file_tag, file.getPath());
        C44758n.m177507a().mo158474a(new Runnable() {
            /* class com.ss.android.lark.mediapicker.widget.LargeImageView.RunnableC447641 */

            public void run() {
                boolean z;
                if (ImageUtils.ImageType.TYPE_GIF == ImageUtils.m177476a(file)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C44763p.m177517a(new Runnable() {
                        /* class com.ss.android.lark.mediapicker.widget.LargeImageView.RunnableC447641.RunnableC447651 */

                        public void run() {
                            if (!LargeImageView.this.mo158482a(file)) {
                                LargeImageView.this.mo158484b(file, i, i2);
                            }
                        }
                    });
                } else {
                    LargeImageView.this.mo158483b(file);
                }
            }
        });
    }
}
