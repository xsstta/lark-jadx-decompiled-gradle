package com.ss.android.lark.chat.preview.components;

import android.graphics.RectF;
import android.view.View;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.components.view.SpinButton;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.Item;
import com.ss.android.lark.chat.preview.entity.component.property.SpinButtonProperty;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/ss/android/lark/chat/preview/components/SpinButtonComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/SpinButtonProperty;", "Lcom/ss/android/lark/chat/preview/components/view/SpinButton;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "props", "spinStyle", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/SpinButtonProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "setSpinButtonData", "", "view", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "update", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.k */
public final class SpinButtonComponent extends RenderComponent<SpinButtonProperty, SpinButton, Dependency> {

    /* renamed from: a */
    private final Style f88178a;

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "om.ss.android.lark.chat.preview.components.view.SpinButton";
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chat/preview/components/SpinButtonComponent$update$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.k$a */
    public static final class View$OnClickListenerC34103a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Action f88179a;

        /* renamed from: b */
        final /* synthetic */ SpinButton f88180b;

        View$OnClickListenerC34103a(Action aVar, SpinButton spinButton) {
            this.f88179a = aVar;
            this.f88180b = spinButton;
        }

        public final void onClick(View view) {
            this.f88179a.mo126248a(this.f88180b);
            this.f88180b.mo126325a();
        }
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f = mo188730f();
        if (f != null) {
            return new SpinButton(f.mo188743a());
        }
        return super.mo126262a(rectF);
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public IVirtualNode.RectSize mo126270a(IVirtualNode.RectSize aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        Dependency f = mo188730f();
        if (f == null) {
            return super.mo126270a(aVar);
        }
        SpinButton spinButton = new SpinButton(f.mo188743a());
        m132378b(spinButton);
        IVirtualNode.RectSize a = spinButton.mo126324a(aVar);
        return new IVirtualNode.RectSize(a.mo188782a() + ((float) 11), a.mo188783b());
    }

    /* renamed from: b */
    private final void m132378b(SpinButton spinButton) {
        int i;
        ThemeColor themeColor;
        FontLevel fontLevel;
        Long selectedIndex = ((SpinButtonProperty) mo188739i()).getSelectedIndex();
        if (selectedIndex != null) {
            i = (int) selectedIndex.longValue();
        } else {
            i = 0;
        }
        List<Item> items = ((SpinButtonProperty) mo188739i()).getItems();
        if (items != null) {
            Item item = items.get(i);
            int dp2px = UIHelper.dp2px(6.0f);
            String str = null;
            ImageSet icon = ((SpinButtonProperty) mo188739i()).getIcon();
            if (icon != null) {
                Image thumbnail = icon.getThumbnail();
                if (thumbnail != null) {
                    str = thumbnail.getKey();
                } else {
                    str = null;
                }
            }
            String text = item.getText();
            Style style = this.f88178a;
            if (style != null) {
                themeColor = style.getTextColorV2();
            } else {
                themeColor = null;
            }
            Style style2 = this.f88178a;
            if (style2 != null) {
                fontLevel = style2.getFontLevel();
            } else {
                fontLevel = null;
            }
            spinButton.mo126326a(text, themeColor, fontLevel, str, dp2px, dp2px);
        }
    }

    /* renamed from: a */
    public void mo126263a(SpinButton spinButton) {
        Intrinsics.checkParameterIsNotNull(spinButton, "view");
        SpinButton spinButton2 = spinButton;
        super.mo126263a((View) spinButton2);
        Style style = this.f88178a;
        if (style != null) {
            style.applyToBackground(spinButton2);
        }
        Action l = mo188742l();
        if (l != null) {
            spinButton.setOnClickListener(new View$OnClickListenerC34103a(l, spinButton));
        }
        m132378b(spinButton);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpinButtonComponent(SpinButtonProperty spinButtonProperty, Style style, Dependency aVar, Action<SpinButton> aVar2) {
        super(spinButtonProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(spinButtonProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f88178a = style;
    }
}
