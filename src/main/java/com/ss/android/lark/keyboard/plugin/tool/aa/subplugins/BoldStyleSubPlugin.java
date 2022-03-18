package com.ss.android.lark.keyboard.plugin.tool.aa.subplugins;

import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.widget.span.C59152b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/subplugins/BoldStyleSubPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/subplugins/BaseAaStyleSubPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "parent", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;", "(Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;)V", "aaEditClick", "Lcom/ss/android/lark/statistics/extensions/IParam;", "getAaEditClick", "()Lcom/ss/android/lark/statistics/extensions/IParam;", "aaEditFunction", "getAaEditFunction", "iconId", "", "getIconId", "()I", "iconRes", "getIconRes", "spanClass", "Ljava/lang/Class;", "", "getSpanClass", "()Ljava/lang/Class;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a.b */
public final class BoldStyleSubPlugin extends BaseAaStyleSubPlugin implements IKeyBoardPlugin.IKeyBoardContext.ITextWatcher {

    /* renamed from: b */
    private final int f103691b = R.id.kb_plugin_style_bold;

    /* renamed from: c */
    private final int f103692c = R.drawable.ud_icon_bold_outlined;

    /* renamed from: d */
    private final Class<? extends Object> f103693d = C59152b.class;

    /* renamed from: e */
    private final IParam f103694e = KeyboardHitPointExtraParams.EditFunction.BOLD;

    /* renamed from: f */
    private final IParam f103695f = KeyboardHitPointExtraParams.Click.BOLD;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: a */
    public int mo147322a() {
        return this.f103691b;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: b */
    public int mo147323b() {
        return this.f103692c;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: c */
    public Class<? extends Object> mo147325c() {
        return this.f103693d;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: e */
    public IParam mo147328e() {
        return this.f103694e;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: f */
    public IParam mo147329f() {
        return this.f103695f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoldStyleSubPlugin(AaStyleKBPlugin aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "parent");
    }
}
