package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.utils.FontUtils;
import com.ss.android.lark.chat.preview.entity.component.property.RichTextProperty;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.C58475b;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.light.layout.C58489c;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.preprocess.C59049d;
import com.ss.android.lark.widget.richtext.preprocess.C59054g;
import com.ss.android.lark.widget.richtext.preprocess.C59057h;
import com.ss.android.lark.widget.span.C59173m;
import com.ss.android.lark.widget.span.C59176n;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00014B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'H\u0016J$\u0010(\u001a\u0004\u0018\u00010\u00132\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u00192\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020-2\u0006\u0010)\u001a\u00020*H\u0003J\u0010\u0010/\u001a\u0002002\u0006\u0010&\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001e8V@VX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/RichTextComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/RichTextProperty;", "Lcom/ss/android/lark/widget/light/LKUILightTextView;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "props", "componentStyle", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/RichTextProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "mLayout", "Landroid/text/Layout;", "getMLayout", "()Landroid/text/Layout;", "setMLayout", "(Landroid/text/Layout;)V", "mRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getMRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setMRichText", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "generateLayout", "context", "Landroid/content/Context;", "richText", "maxWidth", "", "getTextColor", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "update", "", "view", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.j */
public final class RichTextComponent extends RenderComponent<RichTextProperty, LKUILightTextView, Dependency> {

    /* renamed from: a */
    public static final Companion f88171a = new Companion(null);

    /* renamed from: f */
    private static final int f88172f = UIHelper.dp2px(2.0f);

    /* renamed from: c */
    private Layout f88173c;

    /* renamed from: d */
    private RichText f88174d;

    /* renamed from: e */
    private final Style f88175e;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "com.ss.android.lark.widget.light.LKUILightTextView";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/RichTextComponent$Companion;", "", "()V", "LOG_TAG", "", "TEXT_ITALIC_PADDING", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chat/preview/components/RichTextComponent$update$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.j$b */
    public static final class View$OnClickListenerC34102b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RichTextComponent f88176a;

        /* renamed from: b */
        final /* synthetic */ LKUILightTextView f88177b;

        View$OnClickListenerC34102b(RichTextComponent jVar, LKUILightTextView lKUILightTextView) {
            this.f88176a = jVar;
            this.f88177b = lKUILightTextView;
        }

        public final void onClick(View view) {
            this.f88176a.mo188742l().mo126248a(this.f88177b);
        }
    }

    /* renamed from: a */
    private final int m132370a(Context context) {
        ThemeColor textColorV2;
        Style style = this.f88175e;
        if (style == null || (textColorV2 = style.getTextColorV2()) == null) {
            return UIHelper.getColor(R.color.lkui_N100);
        }
        return ColorUtils.f87906a.mo125874a(textColorV2, context);
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        FontLevel fontLevel;
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f = mo188730f();
        if (f == null) {
            return super.mo126262a(rectF);
        }
        LKUILightTextView lKUILightTextView = new LKUILightTextView(f.mo188743a());
        FontUtils aVar = FontUtils.f88131a;
        Context a = f.mo188743a();
        Style style = this.f88175e;
        if (style != null) {
            fontLevel = style.getFontLevel();
        } else {
            fontLevel = null;
        }
        lKUILightTextView.setTextColor(m132370a(f.mo188743a()));
        lKUILightTextView.setTextSize((int) aVar.mo126267a(a, fontLevel));
        return lKUILightTextView;
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public IVirtualNode.RectSize mo126270a(IVirtualNode.RectSize aVar) {
        Context a;
        int i;
        float f;
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        int dp2px = UIHelper.dp2px(aVar.mo188782a());
        UIHelper.dp2px(aVar.mo188783b());
        Dependency f2 = mo188730f();
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (f2 == null || (a = f2.mo188743a()) == null) {
            return new IVirtualNode.RectSize(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        Layout a2 = m132371a(a, ((RichTextProperty) mo188739i()).getRichText(), dp2px);
        if (a2 == null) {
            return new IVirtualNode.RectSize(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        this.f88173c = a2;
        this.f88174d = ((RichTextProperty) mo188739i()).getRichText();
        int px2dp = UIHelper.px2dp((float) a2.getWidth());
        if (UIHelper.dp2px((float) px2dp) == a2.getWidth()) {
            i = 0;
        } else {
            i = 1;
        }
        if (px2dp > 0) {
            f = (float) (px2dp + i + f88172f);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (f != BitmapDescriptorFactory.HUE_RED) {
            f3 = (float) UIHelper.px2dp((float) C58489c.m226887b(a2));
        }
        return new IVirtualNode.RectSize(f, f3);
    }

    /* renamed from: a */
    public void mo126263a(LKUILightTextView lKUILightTextView) {
        Context a;
        Intrinsics.checkParameterIsNotNull(lKUILightTextView, "view");
        if (this.f88173c == null || !Intrinsics.areEqual(((RichTextProperty) mo188739i()).getRichText(), this.f88174d)) {
            Log.m165379d("RichTextComponent", "cache is invalid when update textView, richtext is:" + ((RichTextProperty) mo188739i()).getRichText() + ", view width is:" + lKUILightTextView.getMeasuredWidth());
            Dependency f = mo188730f();
            if (f != null && (a = f.mo188743a()) != null) {
                Layout a2 = m132371a(a, ((RichTextProperty) mo188739i()).getRichText(), lKUILightTextView.getMeasuredWidth());
                if (a2 == null) {
                    Log.m165383e("RichTextComponent", "Content is empty, skip update");
                    return;
                }
                this.f88173c = a2;
                this.f88174d = ((RichTextProperty) mo188739i()).getRichText();
                lKUILightTextView.setContentLayout(a2);
            } else {
                return;
            }
        } else {
            Layout layout = this.f88173c;
            if (layout == null) {
                Intrinsics.throwNpe();
            }
            lKUILightTextView.setContentLayout(layout);
        }
        if (mo188742l() != null) {
            lKUILightTextView.setOnClickListener(new View$OnClickListenerC34102b(this, lKUILightTextView));
        }
    }

    /* renamed from: a */
    private final Layout m132371a(Context context, RichText richText, int i) {
        FontLevel fontLevel;
        FontUtils aVar = FontUtils.f88131a;
        Style style = this.f88175e;
        if (style != null) {
            fontLevel = style.getFontLevel();
        } else {
            fontLevel = null;
        }
        int a = (int) aVar.mo126267a(context, fontLevel);
        int a2 = m132370a(context);
        C59057h a3 = C59054g.m229403a().mo200650a(context, richText, new C59049d.C59050a().mo200642a());
        if (a3 == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(a3, "RichTextSpanParser.inst(…TextParam) ?: return null");
        C59173m.C59175a b = new C59173m.C59175a().mo201121a(true).mo201123b(true);
        RecogniseSpansResult recogniseSpansResult = a3.f146398b;
        Intrinsics.checkExpressionValueIsNotNull(recogniseSpansResult, "spanResult.spanInfoResult");
        return new TextLayoutBuilder().mo198149a(C58475b.m226783a().mo198109a(context, a3.f146397a, C59176n.m229853a().mo201128a(a3.f146397a, b.mo201120a(recogniseSpansResult.getAllSpanInfos()).mo201122a()), new SpannableStringExtraParams.Builder(context).mo198071a(a).mo198076b(a).mo198107v())).mo198144a(a).mo198152b(a2).mo198157d(i - f88172f).mo198142a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichTextComponent(RichTextProperty richTextProperty, Style style, Dependency aVar, Action<LKUILightTextView> aVar2) {
        super(richTextProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(richTextProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f88175e = style;
    }
}
