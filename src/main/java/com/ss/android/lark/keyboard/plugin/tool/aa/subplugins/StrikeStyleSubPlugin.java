package com.ss.android.lark.keyboard.plugin.tool.aa.subplugins;

import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.widget.span.C59179o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/subplugins/StrikeStyleSubPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/subplugins/BaseAaStyleSubPlugin;", "parent", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;", "(Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;)V", "aaEditClick", "Lcom/ss/android/lark/statistics/extensions/IParam;", "getAaEditClick", "()Lcom/ss/android/lark/statistics/extensions/IParam;", "aaEditFunction", "getAaEditFunction", "iconId", "", "getIconId", "()I", "iconRes", "getIconRes", "spanClass", "Ljava/lang/Class;", "", "getSpanClass", "()Ljava/lang/Class;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a.d */
public final class StrikeStyleSubPlugin extends BaseAaStyleSubPlugin {

    /* renamed from: b */
    private final int f103701b = R.id.kb_plugin_style_strike_through;

    /* renamed from: c */
    private final int f103702c = R.drawable.ud_icon_strikethrough_outlined;

    /* renamed from: d */
    private final Class<? extends Object> f103703d = C59179o.class;

    /* renamed from: e */
    private final IParam f103704e = KeyboardHitPointExtraParams.EditFunction.STRIKETHROUGH;

    /* renamed from: f */
    private final IParam f103705f = KeyboardHitPointExtraParams.Click.STRIKETHROUGH;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: a */
    public int mo147322a() {
        return this.f103701b;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: b */
    public int mo147323b() {
        return this.f103702c;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: c */
    public Class<? extends Object> mo147325c() {
        return this.f103703d;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: e */
    public IParam mo147328e() {
        return this.f103704e;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BaseAaStyleSubPlugin
    /* renamed from: f */
    public IParam mo147329f() {
        return this.f103705f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StrikeStyleSubPlugin(AaStyleKBPlugin aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "parent");
    }
}
