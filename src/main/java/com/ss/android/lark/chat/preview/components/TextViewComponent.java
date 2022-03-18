package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.utils.FontUtils;
import com.ss.android.lark.chat.preview.entity.component.property.TextViewProperty;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\rH\u0002J\u0012\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010'\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#H\u0003J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/TextViewComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/TextViewProperty;", "Landroid/widget/TextView;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "prop", "textStyle", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/TextViewProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "TEXT_ITALIC_PADDING", "", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "getTextStyle", "()Lcom/ss/android/lark/chat/entity/preview/Style;", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "generateLayout", "Landroid/text/Layout;", "context", "Landroid/content/Context;", "maxWidth", "getHeight", "layout", "getTextColor", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "update", "", "view", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.m */
public final class TextViewComponent extends RenderComponent<TextViewProperty, TextView, Dependency> {

    /* renamed from: a */
    private final int f88182a = UIHelper.dp2px(2.0f);

    /* renamed from: c */
    private final Style f88183c;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "android.widget.TextView";
    }

    /* renamed from: a */
    private final int m132393a(Context context) {
        ThemeColor textColorV2;
        Style style = this.f88183c;
        if (style == null || (textColorV2 = style.getTextColorV2()) == null) {
            return UIHelper.getColor(R.color.lkui_N100);
        }
        return ColorUtils.f87906a.mo125874a(textColorV2, context);
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f = mo188730f();
        if (f != null) {
            return new TextView(f.mo188743a());
        }
        return super.mo126262a(rectF);
    }

    /* renamed from: a */
    private final int m132394a(Layout layout) {
        int i = 0;
        if (layout == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            int max = Math.max(0, layout.getLineCount() - 1);
            float lineDescent = (float) (layout.getLineDescent(max) - layout.getLineAscent(max));
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            i = spacingAdd >= ((float) 0) ? ((Integer) Double.valueOf(((double) spacingAdd) + 0.5d)).intValue() : ((Integer) Double.valueOf(-(((double) (-spacingAdd)) + 0.5d))).intValue();
        }
        if (!(layout instanceof StaticLayout) || ((TextViewProperty) mo188739i()).getNumberOfLines() <= 0) {
            return layout.getHeight() - i;
        }
        return layout.getLineTop(Math.min(((TextViewProperty) mo188739i()).getNumberOfLines(), ((StaticLayout) layout).getLineCount()));
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public IVirtualNode.RectSize mo126270a(IVirtualNode.RectSize aVar) {
        Context a;
        float f;
        Value width;
        Float value;
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        int dp2px = UIHelper.dp2px(aVar.mo188782a());
        Dependency f2 = mo188730f();
        if (f2 == null || (a = f2.mo188743a()) == null) {
            return super.mo126270a(aVar);
        }
        Layout a2 = m132395a(a, dp2px);
        if (a2 == null) {
            return super.mo126270a(aVar);
        }
        Style style = this.f88183c;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (style == null || (width = style.getWidth()) == null || (value = width.getValue()) == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = value.floatValue();
        }
        int dp2px2 = UIHelper.dp2px(f);
        if (dp2px2 <= 0) {
            if (a2.getWidth() > 0) {
                dp2px2 = a2.getWidth() + this.f88182a;
            } else {
                dp2px2 = a2.getWidth();
            }
        }
        float px2dp = (float) UIHelper.px2dp((float) dp2px2);
        if (dp2px2 != 0) {
            f3 = (float) UIHelper.px2dp((float) m132394a(a2));
        }
        return new IVirtualNode.RectSize(px2dp, f3);
    }

    /* renamed from: a */
    public void mo126263a(TextView textView) {
        FontLevel fontLevel;
        Intrinsics.checkParameterIsNotNull(textView, "view");
        super.mo126263a((View) textView);
        textView.setText(((TextViewProperty) mo188739i()).getText());
        if (((TextViewProperty) mo188739i()).getNumberOfLines() > 0) {
            textView.setMaxLines(((TextViewProperty) mo188739i()).getNumberOfLines());
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        textView.setTextColor(m132393a(context));
        FontUtils aVar = FontUtils.f88131a;
        Context context2 = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
        Style style = this.f88183c;
        FontLevel fontLevel2 = null;
        if (style != null) {
            fontLevel = style.getFontLevel();
        } else {
            fontLevel = null;
        }
        textView.setTextSize(0, aVar.mo126267a(context2, fontLevel));
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "view.paint");
        FontUtils aVar2 = FontUtils.f88131a;
        Style style2 = this.f88183c;
        if (style2 != null) {
            fontLevel2 = style2.getFontLevel();
        }
        paint.setFakeBoldText(aVar2.mo126269a(fontLevel2));
    }

    /* renamed from: a */
    private final Layout m132395a(Context context, int i) {
        FontLevel fontLevel;
        int i2;
        FontUtils aVar = FontUtils.f88131a;
        Style style = this.f88183c;
        if (style != null) {
            fontLevel = style.getFontLevel();
        } else {
            fontLevel = null;
        }
        int a = (int) aVar.mo126267a(context, fontLevel);
        int a2 = m132393a(context);
        if (((TextViewProperty) mo188739i()).getNumberOfLines() > 0) {
            i2 = ((TextViewProperty) mo188739i()).getNumberOfLines();
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new TextLayoutBuilder().mo198149a(((TextViewProperty) mo188739i()).getText()).mo198144a(a).mo198152b(a2).mo198157d(i - this.f88182a).mo198159e(true).mo198155c(i2).mo198142a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextViewComponent(TextViewProperty textViewProperty, Style style, Dependency aVar, Action<TextView> aVar2) {
        super(textViewProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(textViewProperty, "prop");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f88183c = style;
    }
}
