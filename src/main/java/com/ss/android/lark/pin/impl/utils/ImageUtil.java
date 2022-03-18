package com.ss.android.lark.pin.impl.utils;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.utils.ImageUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/pin/impl/utils/ImageUtil;", "", "()V", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.c.a */
public final class ImageUtil {

    /* renamed from: a */
    public static final Companion f128174a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000f¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/pin/impl/utils/ImageUtil$Companion;", "", "()V", "getHolderDrawable", "Landroid/graphics/drawable/GradientDrawable;", "context", "Landroid/content/Context;", "width", "", "height", "roundedImageView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "loadDefaultImage", "", "imageView", "Landroid/widget/ImageView;", "setImageViewLayout", "view", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo177356a(Context context, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(imageView, "imageView");
            int a = ImageUtils.m224128a(context);
            ImageLoader.with(context).load(Integer.valueOf((int) R.drawable.common_chat_window_image_item_holder)).override(a, a).centerCrop().dontAnimate(false).into(imageView);
        }

        /* renamed from: a */
        public final void mo177355a(Context context, int i, int i2, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(imageView, "view");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = UIUtils.dp2px(context, (float) i);
            layoutParams.height = UIUtils.dp2px(context, (float) i2);
            imageView.setLayoutParams(layoutParams);
        }
    }
}
