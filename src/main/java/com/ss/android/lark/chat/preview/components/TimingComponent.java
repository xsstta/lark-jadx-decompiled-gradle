package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.utils.FontUtils;
import com.ss.android.lark.chat.preview.components.view.TimingView;
import com.ss.android.lark.chat.preview.entity.component.property.TimeProperty;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.layout.C58489c;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0016R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/TimingComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/TimeProperty;", "Lcom/ss/android/lark/chat/preview/components/view/TimingView;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "props", "timingStyle", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/TimeProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "generateLayout", "Landroid/text/Layout;", "context", "Landroid/content/Context;", "maxWidth", "", "getTextColor", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "update", "", "view", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.n */
public final class TimingComponent extends RenderComponent<TimeProperty, TimingView, Dependency> {

    /* renamed from: a */
    public static final Companion f88184a = new Companion(null);

    /* renamed from: d */
    private static final int f88185d = UIHelper.dp2px(2.0f);

    /* renamed from: c */
    private final Style f88186c;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "com.ss.android.lark.chat.preview.components.view.TimingView";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/TimingComponent$Companion;", "", "()V", "TAG", "", "TEXT_ITALIC_PADDING", "", "TIMING_HOLDER", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.n$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chat/preview/components/TimingComponent$update$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.n$b */
    public static final class View$OnClickListenerC34104b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Action f88187a;

        /* renamed from: b */
        final /* synthetic */ TimingView f88188b;

        View$OnClickListenerC34104b(Action aVar, TimingView fVar) {
            this.f88187a = aVar;
            this.f88188b = fVar;
        }

        public final void onClick(View view) {
            this.f88187a.mo126248a(this.f88188b);
        }
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Context a;
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f = mo188730f();
        if (f == null || (a = f.mo188743a()) == null) {
            return null;
        }
        TimingView fVar = new TimingView(a);
        fVar.setGravity(21);
        return fVar;
    }

    /* renamed from: a */
    private final int m132402a(Context context) {
        int i;
        Context a;
        Resources resources;
        ThemeColor textColorV2;
        Style style = this.f88186c;
        if (style != null && (textColorV2 = style.getTextColorV2()) != null) {
            return ColorUtils.f87906a.mo125874a(textColorV2, context);
        }
        Dependency f = mo188730f();
        if (f == null || (a = f.mo188743a()) == null || (resources = a.getResources()) == null) {
            i = 0;
        } else {
            i = resources.getColor(R.color.lkui_N00);
        }
        return C25653b.m91893a(i, 0.5f);
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public IVirtualNode.RectSize mo126270a(IVirtualNode.RectSize aVar) {
        Context a;
        Value width;
        Float value;
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        int dp2px = UIHelper.dp2px(aVar.mo188782a());
        Dependency f = mo188730f();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f == null || (a = f.mo188743a()) == null) {
            return new IVirtualNode.RectSize(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        Layout a2 = m132403a(a, dp2px);
        if (a2 == null) {
            return new IVirtualNode.RectSize(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        Style style = this.f88186c;
        if (!(style == null || (width = style.getWidth()) == null || (value = width.getValue()) == null)) {
            f2 = value.floatValue();
        }
        int dp2px2 = UIHelper.dp2px(f2);
        if (dp2px2 <= 0) {
            dp2px2 = a2.getWidth() + f88185d;
        }
        return new IVirtualNode.RectSize((float) UIHelper.px2dp((float) (dp2px2 + 20)), (float) UIHelper.px2dp((float) C58489c.m226887b(a2)));
    }

    /* renamed from: a */
    public void mo126263a(TimingView fVar) {
        FontLevel fontLevel;
        Intrinsics.checkParameterIsNotNull(fVar, "view");
        fVar.setGravity(21);
        Context context = fVar.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        fVar.setTextColor(m132402a(context));
        if (Intrinsics.areEqual((Object) ((TimeProperty) mo188739i()).isEnd(), (Object) false)) {
            fVar.mo126352a((TimeProperty) mo188739i());
        }
        fVar.mo126353a((TimeProperty) mo188739i(), true);
        Action l = mo188742l();
        if (l != null) {
            fVar.setOnClickListener(new View$OnClickListenerC34104b(l, fVar));
        }
        FontUtils aVar = FontUtils.f88131a;
        Context context2 = fVar.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
        Style style = this.f88186c;
        if (style != null) {
            fontLevel = style.getFontLevel();
        } else {
            fontLevel = null;
        }
        fVar.setTextSize(0, aVar.mo126267a(context2, fontLevel));
    }

    /* renamed from: a */
    private final Layout m132403a(Context context, int i) {
        FontLevel fontLevel;
        FontUtils aVar = FontUtils.f88131a;
        Style style = this.f88186c;
        if (style != null) {
            fontLevel = style.getFontLevel();
        } else {
            fontLevel = null;
        }
        return new TextLayoutBuilder().mo198149a("999:59:59").mo198144a((int) aVar.mo126267a(context, fontLevel)).mo198152b(m132402a(context)).mo198157d(i - f88185d).mo198142a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimingComponent(TimeProperty timeProperty, Style style, Dependency aVar, Action<TimingView> aVar2) {
        super(timeProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(timeProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f88186c = style;
    }
}
