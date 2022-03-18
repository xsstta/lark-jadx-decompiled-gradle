package com.ss.android.lark.chat.utils;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38823a;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.image.impl.p1967g.C38897b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import okio.ByteString;

/* renamed from: com.ss.android.lark.chat.utils.c */
public class C34336c {
    /* renamed from: a */
    public static void m133129a(Context context, ImageView imageView, String str, String str2, int i, int i2) {
        m133130a(context, imageView, str, str2, i, i2, Scene.Chat);
    }

    /* renamed from: a */
    public static void m133130a(Context context, ImageView imageView, String str, String str2, int i, int i2, Scene scene) {
        if (DesktopUtil.m144301a(context)) {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
        }
        AvatarImage build = AvatarImage.Builder.obtain(str, str2, i, i2).build();
        ImageLoader.with(context).load(build).placeholder(m133122a(context, i, i2, imageView)).override(i, i2).listener(new C38897b(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(scene).mo105398a(ListenerParams.FromType.AVATAR).mo105401a(false).mo105405b(false).mo105395a(i).mo105403b(i2).mo105402a())).into(imageView);
    }

    /* renamed from: a */
    private static float m133120a(ImageView imageView) {
        if (imageView instanceof SelectableRoundedImageView) {
            return ((SelectableRoundedImageView) imageView).getCornerRadius();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    public static Image m133132b(ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        Image origin = imageSet.getOrigin();
        if (origin == null || CollectionUtils.isEmpty(origin.getUrls()) || !URLUtil.isNetworkUrl(origin.getUrls().get(0))) {
            return origin;
        }
        return imageSet.getThumbnail();
    }

    /* renamed from: a */
    public static Image m133123a(ImageSet imageSet) {
        Image origin;
        Image image;
        if (imageSet == null || (origin = imageSet.getOrigin()) == null) {
            return null;
        }
        if (CollectionUtils.isNotEmpty(origin.getUrls()) && !URLUtil.isNetworkUrl(origin.getUrls().get(0))) {
            return origin;
        }
        if (UIHelper.getWindowWidth(C29990c.m110930b().mo134528a()) > 830) {
            image = imageSet.getMiddle();
            if (image == null || image.isEmpty()) {
                image = imageSet.getThumbnail();
            }
        } else {
            image = imageSet.getThumbnail();
        }
        return (image == null || image.isEmpty()) ? origin : image;
    }

    /* renamed from: a */
    public static Image m133124a(ImageContent imageContent) {
        if (imageContent == null || imageContent.getImageSet() == null) {
            return null;
        }
        Image origin = imageContent.getImageSet().getOrigin();
        if (origin == null || CollectionUtils.isEmpty(origin.getUrls()) || !URLUtil.isNetworkUrl(origin.getUrls().get(0))) {
            return origin;
        }
        if (UIHelper.getWindowWidth(C29990c.m110930b().mo134528a()) <= 830) {
            return imageContent.getImageSet().getThumbnail();
        }
        Image middle = imageContent.getImageSet().getMiddle();
        if (middle == null) {
            return imageContent.getImageSet().getThumbnail();
        }
        return middle;
    }

    /* renamed from: a */
    public static Image m133125a(MediaContent mediaContent) {
        if (mediaContent == null || mediaContent.getImageSet() == null) {
            return null;
        }
        Image origin = mediaContent.getImageSet().getOrigin();
        if (origin == null || CollectionUtils.isEmpty(origin.getUrls()) || !URLUtil.isNetworkUrl(origin.getUrls().get(0))) {
            return origin;
        }
        return mediaContent.getImageSet().getThumbnail();
    }

    /* renamed from: a */
    public static void m133126a(Context context, ImageView imageView) {
        int a = ImageUtils.m224128a(context);
        ImageLoader.with(context).load(Integer.valueOf((int) R.drawable.common_chat_window_image_item_holder)).override(a, a).centerCrop().into(imageView);
    }

    /* renamed from: a */
    public static void m133127a(Context context, ImageView imageView, Image image, LoadParams loadParams) {
        m133128a(context, imageView, image, loadParams, null);
    }

    /* renamed from: a */
    public static GradientDrawable m133121a(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) i3);
        gradientDrawable.setColor(UIUtils.getColor(context, R.color.bg_filler));
        gradientDrawable.setSize(i, i2);
        return gradientDrawable;
    }

    /* renamed from: b */
    public static GradientDrawable m133131b(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) i3);
        gradientDrawable.setColor(UIUtils.getColor(context, R.color.bg_body_overlay));
        gradientDrawable.setSize(i, i2);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static GradientDrawable m133122a(Context context, int i, int i2, ImageView imageView) {
        C38823a aVar = new C38823a();
        aVar.setShape(1);
        aVar.setCornerRadius(m133120a(imageView));
        aVar.setColor(UIUtils.getColor(context, R.color.bg_body_overlay));
        aVar.setSize(i, i2);
        return aVar;
    }

    /* renamed from: b */
    public static void m133133b(Context context, int i, int i2, ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = UIUtils.dp2px(context, (float) i);
        layoutParams.height = UIUtils.dp2px(context, (float) i2);
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v16, resolved type: com.ss.android.lark.image.entity.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m133128a(Context context, ImageView imageView, Image image, LoadParams loadParams, ByteString byteString) {
        String str;
        String str2;
        byte[] byteArray;
        String key = image.getKey();
        C38897b bVar = null;
        if (CollectionUtils.isNotEmpty(image.getUrls())) {
            str = image.getUrls().get(0);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(key)) {
            C38824b bVar2 = new C38824b(key);
            bVar2.mo142317a(loadParams.mo105436j());
            bVar2.mo142318b(true);
            bVar2.mo142316a(C53234a.m205877a());
            str2 = bVar2;
        } else {
            boolean isEmpty = TextUtils.isEmpty(str);
            str2 = str;
            if (isEmpty) {
                str2 = null;
            }
        }
        if (str2 != null) {
            IRequestCreator errorScaleType = ImageLoader.with(context).load(str2).override(loadParams.mo105412a(), loadParams.mo105421b()).placeholder(loadParams.mo105426c()).error(loadParams.mo105428d()).dontAnimate(false).centerCrop().setErrorScaleType(loadParams.mo105432f());
            if (loadParams.mo105438l() != null) {
                bVar = new C38897b(loadParams.mo105438l());
            }
            IRequestCreator thumbnail = errorScaleType.listener(bVar).diskCacheStrategy(loadParams.mo105435i()).transform(loadParams.mo105433g()).thumbnail(BitmapDescriptorFactory.HUE_RED);
            if (!(byteString == null || (byteArray = byteString.toByteArray()) == null)) {
                thumbnail.thumbnail(ImageLoader.with(context).load(byteArray));
            }
            thumbnail.isAsync(loadParams.mo105434h());
            thumbnail.into(imageView);
            return;
        }
        Log.m165383e("ChatImageUtil", "Key and Url is all empty, data is error");
        m133126a(context, imageView);
    }
}
