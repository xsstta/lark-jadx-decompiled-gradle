package com.ss.android.lark.moments.impl.common.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Media;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ2\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/ImageUtils;", "", "()V", "isValidImage", "", "imageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "isValidVideo", "media", "Lcom/bytedance/lark/pb/moments/v1/Media;", "showEmptyImage", "", "imageView", "Landroid/widget/ImageView;", "showThumbnailImage", "width", "", "height", "fromType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.b */
public final class ImageUtils {

    /* renamed from: a */
    public static final ImageUtils f119250a = new ImageUtils();

    private ImageUtils() {
    }

    /* renamed from: a */
    public final void mo166200a(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        ImageLoader.clear(imageView);
        imageView.setImageDrawable(null);
    }

    /* renamed from: a */
    public final boolean mo166202a(ImageSet imageSet) {
        Image image;
        if (imageSet != null) {
            image = imageSet.origin;
        } else {
            image = null;
        }
        if (image == null || (imageSet.thumbnail == null && imageSet.thumbnail_webp == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo166203a(Media media) {
        if (media == null || (TextUtils.isEmpty(media.local_url) && TextUtils.isEmpty(media.drive_url))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo166201a(ImageSet imageSet, ImageView imageView, int i, int i2, ListenerParams.FromType fromType) {
        String str;
        String str2;
        Drawable drawable;
        boolean z;
        Image image;
        Image image2;
        List<String> list;
        Image image3;
        Image image4;
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        Intrinsics.checkParameterIsNotNull(fromType, "fromType");
        List<String> list2 = null;
        if (imageSet == null || (image4 = imageSet.thumbnail_webp) == null || (str = image4.key) == null) {
            if (imageSet == null || (image3 = imageSet.thumbnail) == null) {
                str = null;
            } else {
                str = image3.key;
            }
        }
        if (imageSet != null && (image2 = imageSet.thumbnail_webp) != null && (list = image2.urls) != null) {
            list2 = list;
        } else if (!(imageSet == null || (image = imageSet.thumbnail) == null)) {
            list2 = image.urls;
        }
        if (list2 == null || list2.size() <= 0) {
            str2 = "";
        } else {
            String str3 = list2.get(0);
            Intrinsics.checkExpressionValueIsNotNull(str3, "urlList[0]");
            str2 = str3;
        }
        Drawable colorDrawable = new ColorDrawable(UIHelper.getColor(R.color.ud_N200));
        if (Intrinsics.areEqual(imageView.getTag(), str2)) {
            drawable = imageView.getDrawable();
        } else {
            drawable = colorDrawable;
        }
        String str4 = str;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IRequestCreator dontAnimate = ImageLoader.with(imageView.getContext()).load(new C38824b(str)).override(i, i2).placeholder(drawable).dontAnimate(false);
            Intrinsics.checkExpressionValueIsNotNull(dontAnimate, "ImageLoader.with(imageVi…      .dontAnimate(false)");
            C47282k.m187256a(dontAnimate, fromType, i, i2, true, null, 16, null).into(imageView);
            imageView.setTag(str2);
        } else if (TextUtils.isEmpty(str2) || !new File(str2).exists()) {
            imageView.setImageDrawable(colorDrawable);
        } else {
            IRequestCreator placeholder = ImageLoader.with(imageView.getContext()).load(str2).override(i, i2).dontAnimate(false).placeholder(drawable);
            Intrinsics.checkExpressionValueIsNotNull(placeholder, "ImageLoader.with(imageVi….placeholder(placeholder)");
            C47282k.m187256a(placeholder, ListenerParams.FromType.IMAGE, i, i2, false, null, 24, null).into(imageView);
            imageView.setTag(str2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m187225a(ImageUtils bVar, ImageSet imageSet, ImageView imageView, int i, int i2, ListenerParams.FromType fromType, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            fromType = ListenerParams.FromType.IMAGE;
        }
        bVar.mo166201a(imageSet, imageView, i, i2, fromType);
    }
}
