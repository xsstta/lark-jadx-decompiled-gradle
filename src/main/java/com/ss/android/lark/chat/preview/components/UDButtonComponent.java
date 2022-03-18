package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.universe_design.button.ButtonDrawableParams;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.utils.FontUtils;
import com.ss.android.lark.chat.preview.entity.component.Direction;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.property.ButtonProperty;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 12\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00011BC\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'H\u0016J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u001c2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010&\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168V@VX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001c8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013¨\u00062"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/UDButtonComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/ButtonProperty;", "Lcom/larksuite/component/universe_design/button/UDButton;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "widthPx", "", "heightPx", "props", "style", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/ss/android/lark/chat/preview/entity/component/property/ButtonProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "button", "getHeightPx", "()Ljava/lang/Integer;", "setHeightPx", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "mearsureWidth", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "getWidthPx", "setWidthPx", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "showDrawable", "", "view", "text", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/ss/android/lark/chat/preview/entity/component/Direction;", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "update", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.o */
public final class UDButtonComponent extends RenderComponent<ButtonProperty, UDButton, Dependency> {

    /* renamed from: a */
    public static final Companion f88189a = new Companion(null);

    /* renamed from: c */
    private UDButton f88190c;

    /* renamed from: d */
    private int f88191d;

    /* renamed from: e */
    private Integer f88192e;

    /* renamed from: f */
    private Integer f88193f;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "com.larksuite.component.universe_design.button.UDButton";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/UDButtonComponent$Companion;", "", "()V", "TAG", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.o$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Integer mo126304c() {
        return this.f88192e;
    }

    /* renamed from: d */
    public final Integer mo126305d() {
        return this.f88193f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/preview/components/UDButtonComponent$showDrawable$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/BitmapDrawable;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.o$b */
    public static final class C34105b extends C38818i<BitmapDrawable> {

        /* renamed from: a */
        final /* synthetic */ UDButtonComponent f88194a;

        /* renamed from: b */
        final /* synthetic */ UDButton f88195b;

        /* renamed from: c */
        final /* synthetic */ String f88196c;

        /* renamed from: d */
        final /* synthetic */ ButtonDrawableParams f88197d;

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            super.mo49247a(drawable);
            Log.m165389i("ButtonComponent", "onLoadFailed: ");
        }

        /* renamed from: a */
        public void mo49248a(BitmapDrawable bitmapDrawable) {
            int i;
            int i2;
            ThemeColor textColorV2;
            Intrinsics.checkParameterIsNotNull(bitmapDrawable, "resource");
            super.mo49248a((Object) bitmapDrawable);
            TCStyle h = this.f88194a.mo188733h();
            if (!(h instanceof Style)) {
                h = null;
            }
            Style style = (Style) h;
            if (!(style == null || (textColorV2 = style.getTextColorV2()) == null)) {
                bitmapDrawable.mutate();
                ColorUtils aVar = ColorUtils.f87906a;
                Context context = this.f88195b.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                bitmapDrawable.setTint(aVar.mo125874a(textColorV2, context));
            }
            Integer c = this.f88194a.mo126304c();
            boolean z = false;
            if (c != null) {
                i = c.intValue();
            } else {
                i = 0;
            }
            Integer d = this.f88194a.mo126305d();
            if (d != null) {
                i2 = d.intValue();
            } else {
                i2 = 0;
            }
            bitmapDrawable.setBounds(0, 0, i, i2);
            String str = this.f88196c;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (z) {
                this.f88195b.setCompoundDrawablesRelative(bitmapDrawable, null, null, null);
            } else {
                C25717e.m92486a(this.f88195b, bitmapDrawable, this.f88197d);
            }
        }

        C34105b(UDButtonComponent oVar, UDButton uDButton, String str, ButtonDrawableParams aVar) {
            this.f88194a = oVar;
            this.f88195b = uDButton;
            this.f88196c = str;
            this.f88197d = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chat/preview/components/UDButtonComponent$update$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.o$c */
    public static final class View$OnClickListenerC34106c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Action f88198a;

        /* renamed from: b */
        final /* synthetic */ UDButton f88199b;

        View$OnClickListenerC34106c(Action aVar, UDButton uDButton) {
            this.f88198a = aVar;
            this.f88199b = uDButton;
        }

        public final void onClick(View view) {
            this.f88198a.mo126248a(this.f88199b);
        }
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f = mo188730f();
        if (f == null) {
            return super.mo126262a(rectF);
        }
        UDButton uDButton = new UDButton(f.mo188743a(), null, 0, 6, null);
        uDButton.applyStyle(2131887103);
        return uDButton;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1 == null) goto L_0x0026;
     */
    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.tangram.base.node.IVirtualNode.RectSize mo126270a(com.ss.android.lark.tangram.base.node.IVirtualNode.RectSize r9) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.preview.components.UDButtonComponent.mo126270a(com.ss.android.lark.tangram.base.d.b$a):com.ss.android.lark.tangram.base.d.b$a");
    }

    /* renamed from: a */
    public void mo126263a(UDButton uDButton) {
        Intrinsics.checkParameterIsNotNull(uDButton, "view");
        UDButton uDButton2 = uDButton;
        super.mo126263a((View) uDButton2);
        Action l = mo188742l();
        if (l != null) {
            uDButton.setOnClickListener(new View$OnClickListenerC34106c(l, uDButton));
        }
        if (mo188733h() instanceof Style) {
            TCStyle h = mo188733h();
            if (h != null) {
                ((Style) h).applyToBackground(uDButton2);
                TCStyle h2 = mo188733h();
                if (h2 != null) {
                    if (((Style) h2).getTextColorV2() != null) {
                        ColorUtils aVar = ColorUtils.f87906a;
                        TCStyle h3 = mo188733h();
                        if (h3 != null) {
                            ThemeColor textColorV2 = ((Style) h3).getTextColorV2();
                            if (textColorV2 == null) {
                                Intrinsics.throwNpe();
                            }
                            Context context = uDButton.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                            uDButton.setTextColor(aVar.mo125874a(textColorV2, context));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
                        }
                    } else {
                        Context context2 = uDButton.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                        uDButton.setTextColor(context2.getResources().getColor(R.color.lkui_B100));
                    }
                    TCStyle h4 = mo188733h();
                    if (h4 != null) {
                        if (((Style) h4).getFontLevel() != null) {
                            FontUtils aVar2 = FontUtils.f88131a;
                            Context context3 = uDButton.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
                            TCStyle h5 = mo188733h();
                            if (h5 != null) {
                                uDButton.setTextSize(0, aVar2.mo126267a(context3, ((Style) h5).getFontLevel()));
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
                            }
                        } else {
                            uDButton.setTextSize(14.0f);
                        }
                        TextPaint paint = uDButton.getPaint();
                        Intrinsics.checkExpressionValueIsNotNull(paint, "view.paint");
                        FontUtils aVar3 = FontUtils.f88131a;
                        TCStyle h6 = mo188733h();
                        if (h6 != null) {
                            paint.setFakeBoldText(aVar3.mo126269a(((Style) h6).getFontLevel()));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
            }
        }
        ButtonProperty buttonProperty = (ButtonProperty) mo188739i();
        if (buttonProperty.getIconKey() == null) {
            uDButton.setText(buttonProperty.getText());
        } else {
            m132410a(uDButton, buttonProperty.getText(), buttonProperty.getDirection());
        }
        ((ButtonProperty) mo188739i()).applyToView(uDButton2);
    }

    /* renamed from: a */
    private final void m132410a(UDButton uDButton, String str, Direction direction) {
        Image thumbnail;
        int i;
        ButtonDrawableParams aVar = new ButtonDrawableParams();
        String str2 = str;
        aVar.mo90320a(str2);
        int i2 = 0;
        if (direction != null) {
            int i3 = C34107p.f88200a[direction.ordinal()];
            if (i3 == 1) {
                aVar.mo90319a(0);
            } else if (i3 == 2) {
                aVar.mo90319a(1);
            }
        }
        aVar.mo90323b(UIHelper.dp2px(4.0f));
        ImageSet iconKey = ((ButtonProperty) mo188739i()).getIconKey();
        if (iconKey != null && (thumbnail = iconKey.getThumbnail()) != null) {
            String key = thumbnail.getKey();
            if (key == null) {
                uDButton.setText(str2);
                return;
            }
            IRequestCreator centerCrop = ImageLoader.with(uDButton.getContext()).load(new C38824b(key)).asDrawable().centerCrop();
            Integer num = this.f88192e;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Integer num2 = this.f88193f;
            if (num2 != null) {
                i2 = num2.intValue();
            }
            IRequestCreator override = centerCrop.override(i, i2);
            Context context = uDButton.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            override.error(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_link_copy_outlined, uDButton.getCurrentTextColor())).into(new C34105b(this, uDButton, str, aVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDButtonComponent(Integer num, Integer num2, ButtonProperty buttonProperty, Style style, Dependency aVar, Action<UDButton> aVar2) {
        super(buttonProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(buttonProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f88192e = num;
        this.f88193f = num2;
    }
}
