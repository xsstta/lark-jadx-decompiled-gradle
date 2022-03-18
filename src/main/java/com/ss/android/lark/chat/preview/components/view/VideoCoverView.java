package com.ss.android.lark.chat.preview.components.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.property.VideoProperty;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.image.transform.C38926b;
import com.ss.android.lark.tangram.base.style.Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/VideoCoverView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bg", "Landroid/widget/ImageView;", "durationTv", "Landroid/widget/TextView;", "shadowImg", "videoCover", "getDefaultGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "loadBackGroundImage", "", "origin", "Lcom/ss/android/lark/image/entity/Image;", "width", "", "height", "setVideoData", "props", "Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty;", "videoStyle", "Lcom/ss/android/lark/chat/entity/preview/Style;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.view.h */
public final class VideoCoverView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f88295a;

    /* renamed from: b */
    private ImageView f88296b;

    /* renamed from: c */
    private TextView f88297c;

    /* renamed from: d */
    private ImageView f88298d;

    private final GradientDrawable getDefaultGradientDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        gradientDrawable.setColors(new int[]{C25653b.m91893a(context.getResources().getColor(R.color.black), 0.2f), C25653b.m91893a(context2.getResources().getColor(R.color.black), 0.01f), C25653b.m91893a(context3.getResources().getColor(R.color.black), 0.2f)});
        return gradientDrawable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoCoverView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.video_cover, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.iv_video_bg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.iv_video_bg)");
        this.f88295a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.iv_video_cover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.iv_video_cover)");
        this.f88296b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.tv_video_duration);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.tv_video_duration)");
        this.f88297c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.iv_shadow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.iv_shadow)");
        this.f88298d = (ImageView) findViewById4;
        ImageView imageView = this.f88295a;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bg");
        }
        imageView.setLayerType(2, null);
        ImageView imageView2 = this.f88296b;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoCover");
        }
        imageView2.setLayerType(2, null);
        ImageView imageView3 = this.f88298d;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowImg");
        }
        imageView3.setLayerType(2, null);
    }

    /* renamed from: a */
    public final void mo126357a(VideoProperty videoProperty, Style style) {
        Image image;
        float f;
        Value width;
        Float value;
        Value width2;
        Float value2;
        Intrinsics.checkParameterIsNotNull(videoProperty, "props");
        ImageSet coverImage = videoProperty.getCoverImage();
        if (coverImage != null) {
            image = coverImage.getOrigin();
        } else {
            image = null;
        }
        if (image == null) {
            ImageView imageView = this.f88295a;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bg");
            }
            imageView.setImageDrawable(getDefaultGradientDrawable());
        }
        ImageSet coverImage2 = videoProperty.getCoverImage();
        if (coverImage2 != null) {
            Image origin = coverImage2.getOrigin();
            if (origin != null) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (style == null || (width2 = style.getWidth()) == null || (value2 = width2.getValue()) == null) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = value2.floatValue();
                }
                int a = (int) UDDimenUtils.m93307a(context, f);
                if (a <= 0) {
                    if (getLayoutParams().width > 0) {
                        a = getLayoutParams().width;
                    } else {
                        a = origin.getWidth();
                    }
                }
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                if (!(style == null || (width = style.getWidth()) == null || (value = width.getValue()) == null)) {
                    f2 = value.floatValue();
                }
                int a2 = (int) UDDimenUtils.m93307a(context2, f2);
                if (a2 <= 0) {
                    if (getLayoutParams().height > 0) {
                        a2 = getLayoutParams().height;
                    } else {
                        a2 = origin.getHeight();
                    }
                }
                IRequestCreator override = ImageLoader.with(getContext()).load(new C38824b(origin.getKey())).override(a, a2);
                ImageView imageView2 = this.f88296b;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoCover");
                }
                override.into(imageView2);
                m132468a(origin, a, a2);
                ImageView imageView3 = this.f88298d;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shadowImg");
                }
                imageView3.setImageDrawable(getDefaultGradientDrawable());
            } else {
                return;
            }
        }
        if (videoProperty.getDuration() == 0) {
            TextView textView = this.f88297c;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("durationTv");
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = this.f88297c;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("durationTv");
        }
        textView2.setVisibility(0);
        TextView textView3 = this.f88297c;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("durationTv");
        }
        textView3.setText(C26279i.m95149a((int) videoProperty.getDuration()));
    }

    /* renamed from: a */
    private final void m132468a(Image image, int i, int i2) {
        IRequestCreator transform = ImageLoader.with(getContext()).load(new C38824b(image.getKey())).override(i, i2).centerCrop().transform(new C38926b(40, 1));
        ImageView imageView = this.f88295a;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bg");
        }
        transform.into(imageView);
    }
}
