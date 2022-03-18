package com.ss.android.lark.inv.export.util;

import android.content.Context;
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
import java.io.File;

/* renamed from: com.ss.android.lark.inv.export.util.p */
public class C40125p {
    /* renamed from: a */
    private static int[] m159096a(View view) {
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
    public static void m159092a(String str, ImageView imageView) {
        m159093a(str, imageView, (ApiUtils.AbstractC57748a<Bitmap>) null);
    }

    /* renamed from: a */
    public static void m159094a(String str, String str2, ImageView imageView) {
        m159095a(str, str2, imageView, null);
    }

    /* renamed from: a */
    public static void m159090a(Context context, String str, final ApiUtils.AbstractC57748a<Boolean> aVar) {
        new ImageView(context);
        ImageLoader.with(context).load(str).downloadOnly(new C38818i<File>() {
            /* class com.ss.android.lark.inv.export.util.C40125p.C401283 */

            @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
            /* renamed from: a */
            public void mo49247a(Drawable drawable) {
                super.mo49247a(drawable);
                ApiUtils.AbstractC57748a aVar = aVar;
                if (aVar != null) {
                    aVar.consume(false);
                }
            }

            /* renamed from: a */
            public void mo49248a(File file) {
                super.mo49248a((Object) file);
                ApiUtils.AbstractC57748a aVar = aVar;
                if (aVar != null) {
                    aVar.consume(true);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m159091a(final ImageView imageView, final String str, final ApiUtils.AbstractC57748a aVar) {
        ImageLoader.with(imageView.getContext()).load(str).override(imageView.getWidth(), imageView.getHeight()).asBitmap().into(new C38818i<Bitmap>() {
            /* class com.ss.android.lark.inv.export.util.C40125p.C401272 */

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
                Log.m165383e("InvitationModule", "loadImage failed: " + str);
            }
        });
    }

    /* renamed from: a */
    public static void m159093a(String str, ImageView imageView, ApiUtils.AbstractC57748a<Bitmap> aVar) {
        if (aVar == null) {
            ImageLoader.with(imageView.getContext()).load(str).into(imageView);
        } else {
            imageView.post(new Runnable(imageView, str, aVar) {
                /* class com.ss.android.lark.inv.export.util.$$Lambda$p$Cshw5ecgrumY7tEerW2fMynKLPo */
                public final /* synthetic */ ImageView f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ ApiUtils.AbstractC57748a f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C40125p.lambda$Cshw5ecgrumY7tEerW2fMynKLPo(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m159095a(final String str, final String str2, final ImageView imageView, final ApiUtils.AbstractC57748a<Bitmap> aVar) {
        int[] a = m159096a(imageView);
        int i = a[0];
        int i2 = a[1];
        AvatarImage build = AvatarImage.Builder.obtain(str, str2, i, i2).build();
        if (aVar == null) {
            ImageLoader.with(imageView.getContext()).load(build).override(i, i2).into(imageView);
        } else {
            ImageLoader.with(imageView.getContext()).load(build).override(i, i2).into(new C38818i<BitmapDrawable>() {
                /* class com.ss.android.lark.inv.export.util.C40125p.C401261 */

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
                    Log.m165383e("InvitationModule", "loadAvatar failed: " + str + ", " + str2);
                }
            });
        }
    }
}
