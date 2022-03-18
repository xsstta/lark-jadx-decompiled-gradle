package com.ss.android.lark.chat.preview.components;

import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.ss.android.lark.chat.entity.preview.Border;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.baseview.CrescentAvatarListView;
import com.ss.android.lark.chat.preview.entity.component.property.AvatarProperty;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/AvatarComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/AvatarProperty;", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "props", "avatarStyle", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/AvatarProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "update", "", "view", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.a */
public final class AvatarComponent extends RenderComponent<AvatarProperty, LKUIRoundedImageView2, Dependency> {

    /* renamed from: a */
    private final Style f88130a;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "com.larksuite.component.ui.imageview.LKUIRoundedImageView2";
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        float f;
        Float cornerRadius;
        Float width;
        ThemeColor themeColor;
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f2 = mo188730f();
        if (f2 == null) {
            return super.mo126262a(rectF);
        }
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(f2.mo188743a(), null, 0, 6, null);
        Style style = this.f88130a;
        if (style != null) {
            Border border = style.getBorder();
            if (!(border == null || (themeColor = border.getThemeColor()) == null)) {
                lKUIRoundedImageView2.setBorderColor(ColorUtils.f87906a.mo125874a(themeColor, f2.mo188743a()));
            }
            Border border2 = style.getBorder();
            float f3 = BitmapDescriptorFactory.HUE_RED;
            if (border2 == null || (width = border2.getWidth()) == null) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = width.floatValue();
            }
            lKUIRoundedImageView2.setBorderWidth((float) UIHelper.dp2px(f));
            Border border3 = style.getBorder();
            if (!(border3 == null || (cornerRadius = border3.getCornerRadius()) == null)) {
                f3 = cornerRadius.floatValue();
            }
            lKUIRoundedImageView2.setRadius(f3);
            lKUIRoundedImageView2.setOval(true);
        }
        return lKUIRoundedImageView2;
    }

    /* renamed from: a */
    public void mo126263a(LKUIRoundedImageView2 lKUIRoundedImageView2) {
        float f;
        String str;
        Value scaleHeight;
        Float value;
        Value scaleWidth;
        Float value2;
        Intrinsics.checkParameterIsNotNull(lKUIRoundedImageView2, "view");
        super.mo126263a((View) lKUIRoundedImageView2);
        Style style = this.f88130a;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (style == null || (scaleWidth = style.getScaleWidth()) == null || (value2 = scaleWidth.getValue()) == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = value2.floatValue();
        }
        int dp2px = UIHelper.dp2px(f);
        Style style2 = this.f88130a;
        if (!(style2 == null || (scaleHeight = style2.getScaleHeight()) == null || (value = scaleHeight.getValue()) == null)) {
            f2 = value.floatValue();
        }
        int dp2px2 = UIHelper.dp2px(f2);
        if (DesktopUtil.m144301a(lKUIRoundedImageView2.getContext())) {
            dp2px = Integer.MIN_VALUE;
            dp2px2 = Integer.MIN_VALUE;
        }
        ChattersPreviewProperty.ChatterInfo chatterInfo = ((AvatarProperty) mo188739i()).getChatterInfo();
        String str2 = null;
        if (chatterInfo != null) {
            str = chatterInfo.getAvatarKey();
        } else {
            str = null;
        }
        ChattersPreviewProperty.ChatterInfo chatterInfo2 = ((AvatarProperty) mo188739i()).getChatterInfo();
        if (chatterInfo2 != null) {
            str2 = chatterInfo2.getChatterId();
        }
        AvatarImage build = AvatarImage.Builder.obtain(str, str2, dp2px, dp2px2).build();
        LKUIRoundedImageView2 lKUIRoundedImageView22 = lKUIRoundedImageView2;
        GradientDrawable a = CrescentAvatarListView.m132317a(lKUIRoundedImageView2.getContext(), dp2px, dp2px2, lKUIRoundedImageView22);
        Intrinsics.checkExpressionValueIsNotNull(a, "CrescentAvatarListView.g…thInPx, heightInPx, view)");
        ImageLoader.with(lKUIRoundedImageView2.getContext()).load(build).placeholder(a).override(dp2px, dp2px2).into(lKUIRoundedImageView22);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarComponent(AvatarProperty avatarProperty, Style style, Dependency aVar, Action<LKUIRoundedImageView2> aVar2) {
        super(avatarProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(avatarProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f88130a = style;
    }
}
