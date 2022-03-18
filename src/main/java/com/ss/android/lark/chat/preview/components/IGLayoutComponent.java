package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ignition.widget.message_card_header.MessageCardHeaderDrawable;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.ss.android.lark.chat.entity.preview.Border;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.Gradient;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.entity.component.property.IGProperty;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.style.TCStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/preview/components/IGLayoutComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/IGProperty;", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "props", "style", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/IGProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "canUpdateView", "view", "Landroid/view/View;", "createView", "size", "Landroid/graphics/RectF;", "update", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.d */
public final class IGLayoutComponent extends RenderComponent<IGProperty, LKUIRoundableLayout, Dependency> {
    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return false;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "com.larksuite.component.ui.layout.LKUIRoundableLayout";
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: b */
    public boolean mo126284b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        if (mo188730f() == null) {
            return super.mo126262a(rectF);
        }
        Dependency f = mo188730f();
        if (f == null) {
            Intrinsics.throwNpe();
        }
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(f.mo188743a(), null, 0, 6, null);
        lKUIRoundableLayout.setTag(mo188729e());
        return lKUIRoundableLayout;
    }

    /* renamed from: a */
    public void mo126263a(LKUIRoundableLayout lKUIRoundableLayout) {
        Gradient.Content content;
        int i;
        ThemeColor themeColor;
        float f;
        Intrinsics.checkParameterIsNotNull(lKUIRoundableLayout, "view");
        super.mo126263a((View) lKUIRoundableLayout);
        if (mo188733h() instanceof Style) {
            TCStyle h = mo188733h();
            if (h != null) {
                Border border = ((Style) h).getBorder();
                if (border != null) {
                    Float cornerRadius = border.getCornerRadius();
                    if (cornerRadius != null) {
                        f = cornerRadius.floatValue();
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    lKUIRoundableLayout.setRadius(f);
                }
                TCStyle h2 = mo188733h();
                if (h2 != null) {
                    Gradient backgroundColor = ((Style) h2).getBackgroundColor();
                    ThemeColor themeColor2 = null;
                    if (backgroundColor != null) {
                        content = backgroundColor.getContent();
                    } else {
                        content = null;
                    }
                    if (((IGProperty) mo188739i()).getMaskColor() != null && (content instanceof Gradient.Linear)) {
                        Gradient.Linear linear = (Gradient.Linear) content;
                        List<ThemeColor> themeColors = linear.getThemeColors();
                        if (themeColors != null) {
                            i = themeColors.size();
                        } else {
                            i = 0;
                        }
                        if (i > 0) {
                            List<ThemeColor> themeColors2 = linear.getThemeColors();
                            if (themeColors2 != null) {
                                themeColor = themeColors2.get(0);
                            } else {
                                themeColor = null;
                            }
                            if (themeColor != null) {
                                MessageCardHeaderDrawable aVar = new MessageCardHeaderDrawable();
                                ColorUtils aVar2 = ColorUtils.f87906a;
                                List<ThemeColor> themeColors3 = linear.getThemeColors();
                                if (themeColors3 != null) {
                                    themeColor2 = themeColors3.get(0);
                                }
                                if (themeColor2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                Context context = lKUIRoundableLayout.getContext();
                                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                                aVar.setColor(aVar2.mo125874a(themeColor2, context));
                                ColorUtils aVar3 = ColorUtils.f87906a;
                                ThemeColor maskColor = ((IGProperty) mo188739i()).getMaskColor();
                                if (maskColor == null) {
                                    Intrinsics.throwNpe();
                                }
                                Context context2 = lKUIRoundableLayout.getContext();
                                Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                                aVar.mo87034a(aVar3.mo125874a(maskColor, context2));
                                lKUIRoundableLayout.setBackground(aVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGLayoutComponent(IGProperty iGProperty, Style style, Dependency aVar, Action<LKUIRoundableLayout> aVar2) {
        super(iGProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(iGProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }
}
