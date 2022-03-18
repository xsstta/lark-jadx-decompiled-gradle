package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.Gradient;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.utils.FontUtils;
import com.ss.android.lark.chat.preview.components.view.C34113e;
import com.ss.android.lark.chat.preview.components.view.TenantCertificationDrawable;
import com.ss.android.lark.chat.preview.entity.component.property.TagListProperty;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0016R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00148V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/ss/android/lark/chat/preview/components/TagListComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/TagListProperty;", "Landroid/widget/TextView;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "prop", "style", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/TagListProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "heightInDp", "", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "getTagBgColor", "context", "Landroid/content/Context;", "getTextSize", "", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "update", "", "view", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.l */
public final class TagListComponent extends RenderComponent<TagListProperty, TextView, Dependency> {

    /* renamed from: a */
    private int f88181a;

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

    /* renamed from: c */
    private final float m132386c() {
        Context a;
        Dependency f = mo188730f();
        if (f == null || (a = f.mo188743a()) == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        FontUtils aVar = FontUtils.f88131a;
        TCStyle h = mo188733h();
        FontLevel fontLevel = null;
        if (!(h instanceof Style)) {
            h = null;
        }
        Style style = (Style) h;
        if (style != null) {
            fontLevel = style.getFontLevel();
        }
        return aVar.mo126267a(a, fontLevel);
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
    private final int m132385a(Context context) {
        Gradient backgroundColor;
        TCStyle h = mo188733h();
        if (!(h instanceof Style)) {
            h = null;
        }
        Style style = (Style) h;
        if (!(style == null || (backgroundColor = style.getBackgroundColor()) == null)) {
            Gradient.Content content = backgroundColor.getContent();
            if (content != null) {
                List<ThemeColor> themeColors = ((Gradient.Linear) content).getThemeColors();
                if (themeColors != null && (!themeColors.isEmpty())) {
                    return ColorUtils.f87906a.mo125874a(themeColors.get(0), context);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Gradient.Linear");
            }
        }
        return context.getResources().getColor(R.color.udtoken_tag_neutral_bg_normal);
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public IVirtualNode.RectSize mo126270a(IVirtualNode.RectSize aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        List<String> tagString = ((TagListProperty) mo188739i()).getTagString();
        if (tagString == null) {
            return new IVirtualNode.RectSize(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(m132386c());
        StringBuilder sb = new StringBuilder();
        for (String str : tagString) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        Rect rect = new Rect();
        textPaint.getTextBounds(sb2, 0, sb2.length(), rect);
        int px2dp = UIHelper.px2dp((float) rect.width()) + (tagString.size() * 4) + (tagString.size() * 2 * 4);
        this.f88181a = UIHelper.px2dp((float) rect.height()) + 4;
        return new IVirtualNode.RectSize(Math.min((float) px2dp, aVar.mo188782a()), (float) this.f88181a);
    }

    /* renamed from: a */
    public void mo126263a(TextView textView) {
        int i;
        int i2;
        ThemeColor textColorV2;
        Intrinsics.checkParameterIsNotNull(textView, "view");
        C58513g gVar = new C58513g(textView.getContext());
        if (mo188733h() instanceof Style) {
            textView.setTextSize(0, m132386c());
            TCStyle h = mo188733h();
            if (h != null) {
                ThemeColor textColorV22 = ((Style) h).getTextColorV2();
                if (textColorV22 != null) {
                    ColorUtils aVar = ColorUtils.f87906a;
                    Context context = textView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                    textView.setTextColor(aVar.mo125874a(textColorV22, context));
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
            }
        }
        List<String> tagString = ((TagListProperty) mo188739i()).getTagString();
        if (tagString == null) {
            return;
        }
        if (tagString.size() == 1) {
            textView.setText(tagString.get(0));
            textView.setSingleLine();
            return;
        }
        TCStyle h2 = mo188733h();
        if (!(h2 instanceof Style)) {
            h2 = null;
        }
        Style style = (Style) h2;
        if (style == null || (textColorV2 = style.getTextColorV2()) == null) {
            Context context2 = textView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
            i = context2.getResources().getColor(R.color.ud_N600);
        } else {
            ColorUtils aVar2 = ColorUtils.f87906a;
            Context context3 = textView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
            i = aVar2.mo125874a(textColorV2, context3);
        }
        Context context4 = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "view.context");
        int a = m132385a(context4);
        int i3 = 0;
        for (int size = tagString.size(); i3 < size; size = size) {
            String str = tagString.get(i3);
            if (i3 == 0) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            Context context5 = textView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "view.context");
            gVar.append("$", new C34113e(new TenantCertificationDrawable(context5, null, str, a, i, 0, 4.0f, BitmapDescriptorFactory.HUE_RED, 0, i2, 0, m132386c(), this.f88181a - 1, CalendarWorkHourUtil.f83805a, null)), 34);
            i3++;
        }
        textView.setText(gVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TagListComponent(TagListProperty tagListProperty, Style style, Dependency aVar, Action<TextView> aVar2) {
        super(tagListProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(tagListProperty, "prop");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }
}
