package com.ss.android.lark.thirdshare.container.p2745c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.thirdshare.container.c.b */
public class C55732b {
    /* renamed from: a */
    private static int[] m215915a(View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i2 = layoutParams.height;
        if (i2 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, i);
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    /* renamed from: a */
    public static void m215911a(String str, ImageView imageView) {
        m215912a(str, imageView, (ApiUtils.AbstractC57748a<Bitmap>) null);
    }

    /* renamed from: a */
    public static void m215913a(String str, String str2, ImageView imageView) {
        m215914a(str, str2, imageView, null);
    }

    /* renamed from: a */
    public static void m215912a(String str, ImageView imageView, ApiUtils.AbstractC57748a<Bitmap> aVar) {
        if (aVar == null) {
            ImageLoader.with(imageView.getContext()).load(str).into(imageView);
        } else {
            imageView.post(new Runnable(imageView, str, aVar) {
                /* class com.ss.android.lark.thirdshare.container.p2745c.$$Lambda$b$gVwMJ3A5JCtizPlN7GvRZKiHVsQ */
                public final /* synthetic */ ImageView f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ ApiUtils.AbstractC57748a f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C55732b.lambda$gVwMJ3A5JCtizPlN7GvRZKiHVsQ(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m215910a(final ImageView imageView, final String str, final ApiUtils.AbstractC57748a aVar) {
        ImageLoader.with(imageView.getContext()).load(str).override(imageView.getWidth(), imageView.getHeight()).asBitmap().into(new C38818i<Bitmap>() {
            /* class com.ss.android.lark.thirdshare.container.p2745c.C55732b.C557342 */

            /* renamed from: a */
            public void mo49248a(Bitmap bitmap) {
                super.mo49248a((Object) bitmap);
                imageView.setImageBitmap(bitmap);
                aVar.consume(bitmap);
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
            /* renamed from: a */
            public void mo49247a(Drawable drawable) {
                super.mo49247a(drawable);
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
                aVar.consume(null);
                Log.m165383e("LarkShareContainer", "loadImage failed: " + str);
            }
        });
    }

    /* renamed from: a */
    public static void m215914a(final String str, final String str2, final ImageView imageView, final ApiUtils.AbstractC57748a<Bitmap> aVar) {
        int[] a = m215915a(imageView);
        int i = a[0];
        int i2 = a[1];
        AvatarImage build = AvatarImage.Builder.obtain(str, str2, i, i2).build();
        if (aVar == null) {
            ImageLoader.with(imageView.getContext()).load(build).override(i, i2).into(imageView);
        } else {
            ImageLoader.with(imageView.getContext()).load(build).override(i, i2).into(new C38818i<BitmapDrawable>() {
                /* class com.ss.android.lark.thirdshare.container.p2745c.C55732b.C557331 */

                /* renamed from: a */
                public void mo49248a(BitmapDrawable bitmapDrawable) {
                    super.mo49248a((Object) bitmapDrawable);
                    imageView.setImageDrawable(bitmapDrawable);
                    aVar.consume(bitmapDrawable.getBitmap());
                }

                @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
                /* renamed from: a */
                public void mo49247a(Drawable drawable) {
                    super.mo49247a(drawable);
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                    }
                    aVar.consume(null);
                    Log.m165383e("LarkShareContainer", "loadAvatar failed: " + str + ", " + str2);
                }
            });
        }
    }
}
