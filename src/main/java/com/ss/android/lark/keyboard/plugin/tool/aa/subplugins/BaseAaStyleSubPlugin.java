package com.ss.android.lark.keyboard.plugin.tool.aa.subplugins;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.widget.TextSelector;
import com.ss.android.lark.keyboard.plugin.tool.plugingroup.IkeyBoardSubPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u00106\u001a\u00020\u0015H\u0016J\u0010\u00107\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u00108\u001a\u00020\u0015H\u0002J\b\u00109\u001a\u00020%H\u0016J\u0010\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020<H\u0016J\u001a\u0010=\u001a\u0004\u0018\u00010#2\u0006\u0010\u0003\u001a\u00020<2\u0006\u0010>\u001a\u00020?H\u0016J\u0012\u0010@\u001a\u0004\u0018\u00010#2\u0006\u0010\u0003\u001a\u00020<H\u0016J\b\u0010A\u001a\u000203H\u0002J\b\u0010B\u001a\u00020\u0015H\u0016J\u0010\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020%H\u0016J\u0010\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020%H\u0016J\u0010\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020%H\u0016J\b\u0010I\u001a\u00020\u0015H\u0016J\b\u0010J\u001a\u00020\u0015H\u0016J\b\u0010K\u001a\u00020\u0015H\u0016J*\u0010L\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010M2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u0012H\u0016J\"\u0010P\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u0012H\u0016J\u0010\u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00020%H\u0016J \u0010S\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010T\u001a\u00020\u0015H\u0002J\b\u0010U\u001a\u00020\u0015H\u0002J\u0010\u0010V\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020+H\u0016J \u0010W\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002JN\u0010X\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u0002030Z\u0012 \u0012\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120Y\u0012\u0004\u0012\u0002030[j\u0002`\\0Y2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002R\u0012\u0010\u0006\u001a\u00020\u0007X¤\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tRW\u0010\f\u001aK\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\rj\u0002`\u0016X\u000e¢\u0006\u0002\n\u0000RW\u0010\u0017\u001aK\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\rj\u0002`\u0016X\u0004¢\u0006\u0002\n\u0000RW\u0010\u0018\u001aK\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\rj\u0002`\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000RW\u0010\u001c\u001aK\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\rj\u0002`\u0016X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u0012X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010 \u001a\u00020\u0012X¤\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%@BX\u000e¢\u0006\b\n\u0000\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020302X¤\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006^"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/subplugins/BaseAaStyleSubPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "parent", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;", "(Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;)V", "aaEditClick", "Lcom/ss/android/lark/statistics/extensions/IParam;", "getAaEditClick", "()Lcom/ss/android/lark/statistics/extensions/IParam;", "aaEditFunction", "getAaEditFunction", "actionOnNextTextChange", "Lkotlin/Function3;", "Landroid/text/Editable;", "Lkotlin/ParameterName;", "name", "s", "", "start", "end", "", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/subplugins/AaStyleAction;", "actionRemoveSpan", "actionSetSpan", "context", "Landroid/content/Context;", "currentState", "emptyAction", "iconId", "getIconId", "()I", "iconRes", "getIconRes", "iconView", "Landroid/view/View;", "value", "", "isActive", "setActive", "(Z)V", "isEnabled", "kbContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "getParent", "()Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;", "selector", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/TextSelector;", "spanActionCount", "spanClass", "Ljava/lang/Class;", "", "getSpanClass", "()Ljava/lang/Class;", "cancelSelect", "cleanUPSpanIfNeed", "handleIconClick", "isSelected", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onCreateStyleSpan", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onTextChanged", "", "before", "count", "onTextSelected", "onVisibleChanged", "isVisible", "removeSpanInner", "sendAaStyleIconClickAction", "sendAaStyleSpanTriggerAction", "setKeyBoardContext", "setSpanInner", "splitSpansWithRange", "Lkotlin/Pair;", "", "Ljava/util/HashMap;", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/subplugins/SpanInfo;", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a.a */
public abstract class BaseAaStyleSubPlugin implements IKeyBoardPlugin.IKeyBoardContext.ITextWatcher, IkeyBoardSubPlugin {

    /* renamed from: a */
    public static final Companion f103676a = new Companion(null);

    /* renamed from: b */
    private View f103677b;

    /* renamed from: c */
    private Context f103678c;

    /* renamed from: d */
    private boolean f103679d;

    /* renamed from: e */
    private boolean f103680e = true;

    /* renamed from: f */
    private IKeyBoardPlugin.IKeyBoardContext f103681f;

    /* renamed from: g */
    private final TextSelector f103682g = new TextSelector();

    /* renamed from: h */
    private int f103683h;

    /* renamed from: i */
    private final Function3<Editable, Integer, Integer, Unit> f103684i;

    /* renamed from: j */
    private final Function3<Editable, Integer, Integer, Unit> f103685j;

    /* renamed from: k */
    private final Function3<Editable, Integer, Integer, Unit> f103686k;

    /* renamed from: l */
    private Function3<? super Editable, ? super Integer, ? super Integer, Unit> f103687l;

    /* renamed from: m */
    private int f103688m;

    /* renamed from: n */
    private final AaStyleKBPlugin f103689n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo147322a();

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo147323b();

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Class<? extends Object> mo147325c();

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract IParam mo147328e();

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract IParam mo147329f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/subplugins/BaseAaStyleSubPlugin$Companion;", "", "()V", "FLAG", "", "SPAN_CLEAR_UP_THRESHOLD", "TAG", "", "TYPE_FULLY_COVERED", "TYPE_NO_SELECT", "TYPE_PARTLY_COVERED", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        mo147303g();
    }

    /* renamed from: n */
    public AaStyleKBPlugin mo147332n() {
        return this.f103689n;
    }

    /* renamed from: d */
    public boolean mo147327d() {
        return this.f103679d;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
        if (this.f103679d) {
            mo147305i();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IkeyBoardSubPlugin.C40857a.m161799a(this);
    }

    /* renamed from: o */
    private final Object m161450o() {
        Object newInstance = mo147325c().newInstance();
        Intrinsics.checkExpressionValueIsNotNull(newInstance, "spanClass.newInstance()");
        return newInstance;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        m161449f(true);
        if (this.f103683h == 0) {
            this.f103687l = this.f103685j;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
        m161449f(false);
        this.f103687l = this.f103684i;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.plugingroup.IkeyBoardSubPlugin
    /* renamed from: m */
    public void mo147331m() {
        if (this.f103682g.mo147362g() && mo147327d()) {
            mo147330l();
        }
    }

    /* renamed from: p */
    private final void m161451p() {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103681f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kbContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160852b(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            TARGET_NONE eVar = TARGET_NONE.f135700a;
            IParam f = mo147329f();
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103681f;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kbContext");
            }
            KeyboardHitPointNew.m160872a(C40683h.m160852b(b), C54952a.m213204a(f.plus(C40673a.m160698a(bVar2.mo147381z().mo146903h())).plus(eVar), C40683h.m160856f(b)));
        }
    }

    /* renamed from: q */
    private final void m161452q() {
        boolean z;
        KeyboardHitPointExtraParams.TriggerMethod triggerMethod;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103681f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kbContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160851a(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            TARGET_NONE eVar = TARGET_NONE.f135700a;
            KeyboardHitPointExtraParams.Click click = KeyboardHitPointExtraParams.Click.TEXT_EDIT;
            IParam e = mo147328e();
            if (mo147332n().mo147286a() == 1) {
                triggerMethod = KeyboardHitPointExtraParams.TriggerMethod.BUBBLE_TOOLBAR_ACTION;
            } else {
                triggerMethod = KeyboardHitPointExtraParams.TriggerMethod.AA_TOOLBAR_ACTION;
            }
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103681f;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kbContext");
            }
            KeyboardHitPointNew.m160872a(C40683h.m160851a(b), C54952a.m213204a(click.plus(e).plus(triggerMethod).plus(C40673a.m160698a(bVar2.mo147381z().mo146903h())).plus(eVar), C40683h.m160856f(b)));
        }
    }

    /* renamed from: l */
    public final void mo147330l() {
        if (this.f103682g.mo147362g()) {
            boolean d = mo147327d();
            boolean f = this.f103682g.mo147361f();
            m161451p();
            if (f) {
                Editable c = this.f103682g.mo147358c();
                if (c != null) {
                    int i = this.f103683h;
                    if (i == 0 || i == 1) {
                        mo147324b(c, this.f103682g.mo147354a(), this.f103682g.mo147357b());
                    } else if (i == 3) {
                        mo147326c(c, this.f103682g.mo147354a(), this.f103682g.mo147357b());
                    }
                    mo147170a(this.f103682g.mo147358c(), this.f103682g.mo147354a(), this.f103682g.mo147357b() - this.f103682g.mo147354a());
                }
            } else if (!d) {
                mo147303g();
            } else {
                mo147305i();
                if (this.f103683h != 0) {
                    this.f103687l = this.f103686k;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a.a$e */
    static final class View$OnClickListenerC40803e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseAaStyleSubPlugin f103690a;

        View$OnClickListenerC40803e(BaseAaStyleSubPlugin aVar) {
            this.f103690a = aVar;
        }

        public final void onClick(View view) {
            this.f103690a.mo147330l();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IkeyBoardSubPlugin.C40857a.m161798a(this, z);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
    /* renamed from: a */
    public void mo147171a(EditText editText) {
        Intrinsics.checkParameterIsNotNull(editText, "editText");
        IKeyBoardPlugin.IKeyBoardContext.ITextWatcher.C40807a.m161576a(this, editText);
    }

    /* renamed from: f */
    private final void m161449f(boolean z) {
        this.f103679d = z;
        View view = this.f103677b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        view.setSelected(this.f103679d);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f103681f = bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103681f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kbContext");
        }
        bVar.mo147370a(this);
    }

    public BaseAaStyleSubPlugin(AaStyleKBPlugin aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "parent");
        this.f103689n = aVar;
        C40802d dVar = C40802d.INSTANCE;
        this.f103684i = dVar;
        BaseAaStyleSubPlugin aVar2 = this;
        this.f103685j = new C40801c(aVar2);
        this.f103686k = new C40800b(aVar2);
        this.f103687l = dVar;
    }

    /* renamed from: a */
    private final void m161447a(Editable editable) {
        int i = this.f103688m + 1;
        this.f103688m = i;
        if (i % 10 <= 0) {
            int i2 = 0;
            Object[] spans = editable.getSpans(0, editable.length() - 1, mo147325c());
            boolean[] zArr = new boolean[(editable.length() + 1)];
            Intrinsics.checkExpressionValueIsNotNull(spans, "foundSpans");
            for (Object obj : spans) {
                int spanEnd = editable.getSpanEnd(obj);
                for (int spanStart = editable.getSpanStart(obj); spanStart <= spanEnd; spanStart++) {
                    zArr[spanStart] = true;
                }
                editable.removeSpan(obj);
            }
            while (i2 < editable.length()) {
                if (zArr[i2]) {
                    int i3 = i2;
                    while (i3 < editable.length() && zArr[i3]) {
                        i3++;
                    }
                    editable.setSpan(m161450o(), i2, i3 - 1, 34);
                    i2 = i3;
                }
                i2++;
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        this.f103680e = z;
        View view = this.f103677b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        view.setEnabled(this.f103680e);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        this.f103678c = context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        AppCompatImageView b = C40679d.m160788b(context, mo147322a(), mo147323b());
        Intrinsics.checkExpressionValueIsNotNull(b, "KBViewUtil.createIconVie…context, iconId, iconRes)");
        AppCompatImageView appCompatImageView = b;
        this.f103677b = appCompatImageView;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        appCompatImageView.setOnClickListener(new View$OnClickListenerC40803e(this));
        View view = this.f103677b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        return view;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IkeyBoardSubPlugin.C40857a.m161800a(this, i, intent);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
    /* renamed from: a */
    public boolean mo147173a(int i, KeyEvent keyEvent) {
        return IKeyBoardPlugin.IKeyBoardContext.ITextWatcher.C40807a.m161577a(this, i, keyEvent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "p1", "Landroid/text/Editable;", "Lkotlin/ParameterName;", "name", "s", "p2", "", "start", "p3", "end", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a.a$b */
    static final /* synthetic */ class C40800b extends FunctionReference implements Function3<Editable, Integer, Integer, Unit> {
        C40800b(BaseAaStyleSubPlugin aVar) {
            super(3, aVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "removeSpanInner";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseAaStyleSubPlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "removeSpanInner(Landroid/text/Editable;II)V";
        }

        public final void invoke(Editable editable, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(editable, "p1");
            ((BaseAaStyleSubPlugin) this.receiver).mo147326c(editable, i, i2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Editable editable, Integer num, Integer num2) {
            invoke(editable, num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "p1", "Landroid/text/Editable;", "Lkotlin/ParameterName;", "name", "s", "p2", "", "start", "p3", "end", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a.a$c */
    static final /* synthetic */ class C40801c extends FunctionReference implements Function3<Editable, Integer, Integer, Unit> {
        C40801c(BaseAaStyleSubPlugin aVar) {
            super(3, aVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "setSpanInner";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BaseAaStyleSubPlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "setSpanInner(Landroid/text/Editable;II)V";
        }

        public final void invoke(Editable editable, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(editable, "p1");
            ((BaseAaStyleSubPlugin) this.receiver).mo147324b(editable, i, i2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Editable editable, Integer num, Integer num2) {
            invoke(editable, num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final void mo147324b(Editable editable, int i, int i2) {
        m161452q();
        editable.setSpan(m161450o(), i, i2, 34);
        m161447a(editable);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/text/Editable;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a.a$d */
    static final class C40802d extends Lambda implements Function3<Editable, Integer, Integer, Unit> {
        public static final C40802d INSTANCE = new C40802d();

        C40802d() {
            super(3);
        }

        public final void invoke(Editable editable, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(editable, "<anonymous parameter 0>");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Editable editable, Integer num, Integer num2) {
            invoke(editable, num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: d */
    private final Pair<List<Object>, HashMap<Pair<Integer, Integer>, Object>> m161448d(Editable editable, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Object[] spans = editable.getSpans(i, i2, mo147325c());
        Intrinsics.checkExpressionValueIsNotNull(spans, "spans");
        for (Object obj : spans) {
            int spanStart = editable.getSpanStart(obj);
            int spanEnd = editable.getSpanEnd(obj);
            if (spanStart < i) {
                hashMap.put(TuplesKt.to(Integer.valueOf(spanStart), Integer.valueOf(i)), m161450o());
            }
            if (spanEnd > i2) {
                hashMap.put(TuplesKt.to(Integer.valueOf(i2), Integer.valueOf(spanEnd)), m161450o());
            }
            Intrinsics.checkExpressionValueIsNotNull(obj, "it");
            arrayList.add(obj);
        }
        return TuplesKt.to(arrayList, hashMap);
    }

    /* renamed from: c */
    public final void mo147326c(Editable editable, int i, int i2) {
        Pair<List<Object>, HashMap<Pair<Integer, Integer>, Object>> d = m161448d(editable, i, i2);
        List<Object> component1 = d.component1();
        HashMap<Pair<Integer, Integer>, Object> component2 = d.component2();
        try {
            Iterator<T> it = component1.iterator();
            while (it.hasNext()) {
                editable.removeSpan(it.next());
            }
        } catch (Exception unused) {
            Log.m165383e("BaseAaStyleSubPlugin", "removeSpanInner: There is something wrong with Editable#removeSpan, we catch and consume this exception to prevent crash.");
        }
        for (Map.Entry<Pair<Integer, Integer>, Object> entry : component2.entrySet()) {
            Pair<Integer, Integer> key = entry.getKey();
            editable.setSpan(entry.getValue(), key.component1().intValue(), key.component2().intValue(), 34);
        }
        m161447a(editable);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
    /* renamed from: a */
    public void mo147170a(Editable editable, int i, int i2) {
        if (editable != null && i2 >= 0) {
            boolean z = false;
            this.f103683h = 0;
            this.f103682g.mo147356a(editable);
            this.f103682g.mo147355a(i, i + i2);
            Object[] spans = editable.getSpans(this.f103682g.mo147354a(), this.f103682g.mo147357b(), mo147325c());
            int i3 = i2 + 1;
            boolean[] zArr = new boolean[i3];
            if (i2 >= 0) {
                Intrinsics.checkExpressionValueIsNotNull(spans, "spans");
                for (Object obj : spans) {
                    int spanEnd = editable.getSpanEnd(obj);
                    for (int spanStart = editable.getSpanStart(obj); spanStart <= spanEnd; spanStart++) {
                        int i4 = spanStart - i;
                        if (i4 > i2) {
                            i4 = i2;
                        }
                        if (i4 != 0) {
                            if (i4 < 0) {
                                i4 = 0;
                            }
                            zArr[i4] = true;
                        }
                    }
                }
            }
            if (C69043h.m265751a(zArr, true)) {
                this.f103683h |= 1;
            }
            boolean z2 = !C69043h.m265751a(zArr, false);
            if (i3 > 1 && !C69043h.m265748a(zArr, i2).contains(false)) {
                z = true;
            }
            if (z2 || z) {
                this.f103683h |= 3;
            }
            if (this.f103683h == 0) {
                mo147305i();
            } else if (!mo147327d()) {
                mo147303g();
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
    /* renamed from: a */
    public void mo147172a(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (this.f103680e && (charSequence instanceof Editable)) {
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo147326c((Editable) charSequence, 0, 0);
            } else {
                this.f103687l.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i + i3));
            }
            this.f103687l = this.f103684i;
        }
    }
}
