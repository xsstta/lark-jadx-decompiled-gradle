package com.ss.android.lark.ug.p2878h;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.ImageConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.pb.ug_reach.ButtonElement;
import com.ss.android.lark.pb.ug_reach.ImageElement;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterial;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem;
import com.ss.android.lark.ug.util.ImageElementParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002\u001a$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002\u001a\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002¨\u0006\u001e"}, d2 = {"parseAnchorConfig", "Lcom/ss/android/lark/guide/ui/config/AnchorConfig;", "anchorView", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterialItem;", "parseAnchorDirection", "Lcom/ss/android/lark/guide/ui/config/AnchorConfig$AnchorGravity;", "arrowDirection", "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterialItem$ArrowDirection;", "parseButtonConfig", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig;", "buttonElement", "Lcom/ss/android/lark/pb/ug_reach/ButtonElement;", "buttonAction", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "parseImageConfig", "Lcom/ss/android/lark/guide/ui/config/ImageConfig;", "activity", "Landroid/app/Activity;", "imageElement", "Lcom/ss/android/lark/pb/ug_reach/ImageElement;", "parseMaskConfig", "Lcom/ss/android/lark/guide/ui/config/MaskConfig;", "pbMaskConfig", "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterial$MaskConfig;", "targetAnchorConfig", "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterialItem$TargetAnchor;", "parseMaskShapeType", "Lcom/ss/android/lark/guide/ui/config/MaskConfig$ShapeType;", "ug-spotlight_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.h */
public final class C57510h {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/ug/spotlight/SpotlightFactoryKt$parseImageConfig$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.h$a */
    public static final class View$OnAttachStateChangeListenerC57511a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ Activity f141698a;

        /* renamed from: b */
        final /* synthetic */ String f141699b;

        /* renamed from: c */
        final /* synthetic */ ImageView f141700c;

        public void onViewDetachedFromWindow(View view) {
        }

        public void onViewAttachedToWindow(View view) {
            ImageLoader.with(this.f141698a).load(this.f141699b).asDrawable().into(this.f141700c);
        }

        View$OnAttachStateChangeListenerC57511a(Activity activity, String str, ImageView imageView) {
            this.f141698a = activity;
            this.f141699b = str;
            this.f141700c = imageView;
        }
    }

    /* renamed from: a */
    private static final AnchorConfig.AnchorGravity m223227a(SpotlightMaterialItem.ArrowDirection arrowDirection) {
        if (arrowDirection != null) {
            int i = C57512i.f141702b[arrowDirection.ordinal()];
            if (i == 1) {
                return AnchorConfig.AnchorGravity.END;
            }
            if (i == 2) {
                return AnchorConfig.AnchorGravity.START;
            }
            if (i == 3) {
                return AnchorConfig.AnchorGravity.BOTTOM;
            }
            if (i == 4) {
                return AnchorConfig.AnchorGravity.TOP;
            }
        }
        return AnchorConfig.AnchorGravity.START;
    }

    /* renamed from: a */
    private static final MaskConfig.ShapeType m223229a(SpotlightMaterialItem.TargetAnchor targetAnchor) {
        if (targetAnchor == null) {
            return MaskConfig.ShapeType.RECTANGLE;
        }
        SpotlightMaterialItem.TargetAnchor.TargetRectType targetRectType = targetAnchor.mtarget_rect_type;
        if (targetRectType != null) {
            int i = C57512i.f141701a[targetRectType.ordinal()];
            if (i == 1) {
                return MaskConfig.ShapeType.RECTANGLE;
            }
            if (i == 2) {
                return MaskConfig.ShapeType.CIRCLE;
            }
        }
        return MaskConfig.ShapeType.RECTANGLE;
    }

    /* renamed from: a */
    public static final ButtonConfig m223231a(ButtonElement buttonElement, ButtonConfig.ButtonAction aVar) {
        String str = buttonElement.mtext;
        Intrinsics.checkExpressionValueIsNotNull(str, "buttonElement.mtext");
        return new ButtonConfig(str, aVar);
    }

    /* renamed from: a */
    public static final AnchorConfig m223228a(View view, SpotlightMaterialItem spotlightMaterialItem) {
        SpotlightMaterialItem.ArrowDirection arrowDirection;
        SpotlightMaterialItem.TargetAnchor targetAnchor = spotlightMaterialItem.mtarget_anchor_config;
        if (targetAnchor != null) {
            arrowDirection = targetAnchor.marrow_direction;
        } else {
            arrowDirection = null;
        }
        return new AnchorConfig(view, m223227a(arrowDirection), null, 4, null);
    }

    /* renamed from: a */
    public static final ImageConfig m223232a(Activity activity, ImageElement imageElement) {
        if (imageElement != null) {
            if (ImageElementParser.f141733a.mo195204a(imageElement)) {
                String c = ImageElementParser.f141733a.mo195206c(imageElement);
                Activity activity2 = activity;
                ImageView imageView = new ImageView(activity2);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(UIUtils.dp2px(activity2, 240.0f), UIUtils.dp2px(activity2, 148.0f)));
                imageView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC57511a(activity, c, imageView));
                return new ImageConfig(imageView);
            } else if (ImageElementParser.f141733a.mo195205b(imageElement)) {
                return new ImageConfig(new BitmapDrawable(activity.getResources(), ImageElementParser.f141733a.mo195207d(imageElement)));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final MaskConfig m223230a(Activity activity, SpotlightMaterial.MaskConfig maskConfig, SpotlightMaterialItem.TargetAnchor targetAnchor) {
        double d;
        Double d2;
        Double d3;
        double d4 = 0.0d;
        if (maskConfig == null || (d3 = maskConfig.malpha) == null) {
            d = 0.0d;
        } else {
            d = d3.doubleValue();
        }
        int min = Math.min(255, Math.max(0, (int) Math.floor(d * ((double) DynamicModule.f58006b))));
        if (!(targetAnchor == null || (d2 = targetAnchor.moffset) == null)) {
            d4 = d2.doubleValue();
        }
        return new MaskConfig(min, (float) UIUtils.dp2px(activity, (float) d4), m223229a(targetAnchor), null, null, 24, null);
    }
}
