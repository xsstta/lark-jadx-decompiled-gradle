package com.ss.android.lark.keyboard.plugin.tool.aa;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.BoldStyleSubPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.ItalicStyleSubPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.StrikeStyleSubPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.subplugins.UnderLineStyleSubPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.widget.AaStylePluginContainer;
import com.ss.android.lark.keyboard.plugin.tool.aa.widget.AaStylePluginTransition;
import com.ss.android.lark.keyboard.plugin.tool.aa.widget.TextSelector;
import com.ss.android.lark.keyboard.plugin.tool.plugingroup.IKeyBoardPluginGroup;
import com.ss.android.lark.keyboard.plugin.tool.plugingroup.IkeyBoardSubPlugin;
import com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011*\u0001\u000e\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001uB\u0005¢\u0006\u0002\u0010\u0003J\b\u00109\u001a\u00020\u0006H\u0016J\n\u0010:\u001a\u0004\u0018\u00010\u0016H\u0016J+\u0010;\u001a\u00020\u00062!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110/¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u00060=H\u0002J\u0010\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\fH\u0002J\"\u0010C\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0002J*\u0010H\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010I2\u0006\u0010F\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0002J\u0010\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020MH\u0016J\u0018\u0010N\u001a\u00020\u00162\u0006\u0010O\u001a\u00020M2\u0006\u0010P\u001a\u00020\u001eH\u0016J\u0012\u0010Q\u001a\u0004\u0018\u00010\u00162\u0006\u0010O\u001a\u00020MH\u0016J\u001c\u0010R\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010\f0S0.H\u0016J\b\u0010T\u001a\u00020\u0006H\u0016J\u0010\u0010U\u001a\u00020\u00062\u0006\u0010V\u001a\u00020WH\u0016J\u001a\u0010X\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0010\u0010\\\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u0018H\u0016J\u0010\u0010^\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u0018H\u0016J\u0010\u0010`\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0018H\u0016J\b\u0010b\u001a\u00020\u0006H\u0016J\u0015\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u00020eH\u0000¢\u0006\u0002\bfJ\b\u0010g\u001a\u00020\u0006H\u0016J\r\u0010h\u001a\u00020eH\u0000¢\u0006\u0002\biJ\b\u0010j\u001a\u00020\u0006H\u0016J*\u0010k\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010I2\u0006\u0010F\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0016J\"\u0010l\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0016J\u0010\u0010m\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010n\u001a\u00020\u0006H\u0002J\u0010\u0010o\u001a\u00020\u00062\u0006\u0010d\u001a\u00020eH\u0002J\b\u0010p\u001a\u00020\u0006H\u0002J\b\u0010q\u001a\u00020\u0006H\u0002J\u0010\u0010r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u001cH\u0016J\b\u0010s\u001a\u00020\u0006H\u0002J\b\u0010t\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8VX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160,X\u0004¢\u0006\u0002\n\u0000R!\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.8BX\u0002¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b0\u00101R\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u000206X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006v"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IKeyBoardPluginGroup;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "()V", "clickHandleAction", "Lkotlin/Function0;", "", "context", "Landroid/content/Context;", "currentEditorId", "", "currentEditorType", "", "delegateNotifier", "com/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin$delegateNotifier$1", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin$delegateNotifier$1;", "iconId", "getIconId", "()I", "iconRes", "getIconRes", "iconView", "Landroid/view/View;", "isEnabled", "", "isStarted", "isVisible", "kbContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "originNotifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "startType", "getStartType$im_keyboard_release", "setStartType$im_keyboard_release", "(I)V", "state", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPluginState;", "subPluginContainer", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginContainer;", "getSubPluginContainer", "()Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginContainer;", "subPluginContainer$delegate", "Lkotlin/Lazy;", "subPluginIcons", "", "subPlugins", "", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "getSubPlugins", "()Ljava/util/List;", "subPlugins$delegate", "textSelector", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/TextSelector;", "transition", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginTransition;", "getTransition", "()Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginTransition;", "clearAllSubPlugin", "currentPluginPanel", "eachSubPlugin", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "plugin", "notifyEditorChange", "nextType", "notifySubPluginsSelected", "s", "Landroid/text/Editable;", "start", "count", "notifySubPluginsTextChange", "", "before", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "onCreatePluginPanel", "onCreateSubPlugins", "Lkotlin/Pair;", "onDestroy", "onEditorFocused", "editText", "Landroid/widget/EditText;", "onEditorKeyPreIme", "keyCode", "event", "Landroid/view/KeyEvent;", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onRestoreParams", "snapshot", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPluginSnapshot;", "onRestoreParams$im_keyboard_release", "onStart", "onStashParams", "onStashParams$im_keyboard_release", "onStop", "onTextChanged", "onTextSelected", "onVisibleChanged", "resetSubPluginContainer", "restoreBaseState", "sendAaActiveHitPoint", "sendAaContainerViewHitPoint", "setKeyBoardContext", "unSelectAllSubPlugins", "unSelectCurrentSubPlugin", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a */
public final class AaStyleKBPlugin implements IKeyBoardPlugin.IKeyBoardContext.ITextWatcher, IKeyBoardPluginGroup {

    /* renamed from: e */
    public static final Companion f103654e = new Companion(null);

    /* renamed from: a */
    public Context f103655a;

    /* renamed from: b */
    public final List<View> f103656b = new ArrayList();

    /* renamed from: c */
    public IKeyBoardPlugin.ITouchActionNotifier f103657c;

    /* renamed from: d */
    public final Function0<Unit> f103658d = new C40789c(this);

    /* renamed from: f */
    private View f103659f;

    /* renamed from: g */
    private boolean f103660g;

    /* renamed from: h */
    private int f103661h;

    /* renamed from: i */
    private String f103662i = "";

    /* renamed from: j */
    private int f103663j = -1;

    /* renamed from: k */
    private final TextSelector f103664k = new TextSelector();

    /* renamed from: l */
    private final AaStyleKBPluginState f103665l = new AaStyleKBPluginState(this);

    /* renamed from: m */
    private boolean f103666m = true;

    /* renamed from: n */
    private boolean f103667n = true;

    /* renamed from: o */
    private IKeyBoardPlugin.IKeyBoardContext f103668o;

    /* renamed from: p */
    private final Lazy f103669p = LazyKt.lazy(new C40799m(this));

    /* renamed from: q */
    private final Lazy f103670q = LazyKt.lazy(new C40798l(this));

    /* renamed from: r */
    private final AaStylePluginTransition f103671r = new AaStylePluginTransition();

    /* renamed from: s */
    private final C40790d f103672s = new C40790d();

    /* renamed from: t */
    private final int f103673t = R.id.kb_plugin_style_aa;

    /* renamed from: u */
    private final int f103674u = R.drawable.ud_icon_text_aa_outlined;

    /* renamed from: p */
    private final List<IkeyBoardSubPlugin> m161410p() {
        return (List) this.f103669p.getValue();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return null;
    }

    /* renamed from: b */
    public AaStylePluginContainer mo147296c() {
        return (AaStylePluginContainer) this.f103670q.getValue();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.plugingroup.IKeyBoardPluginGroup
    /* renamed from: l */
    public View mo147308l() {
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.plugingroup.IKeyBoardPluginGroup
    /* renamed from: m */
    public void mo147309m() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin$Companion;", "", "()V", "TAG", "", "TYPE_CLICK", "", "TYPE_DISABLED", "TYPE_SELECT", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin$delegateNotifier$1", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "notifyClicked", "", "clicked", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "notifySelected", "plugin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$d */
    public static final class C40790d implements IKeyBoardPlugin.ITouchActionNotifier {
        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.ITouchActionNotifier
        /* renamed from: a */
        public void mo147313a(IKeyBoardPlugin bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.ITouchActionNotifier
        /* renamed from: b */
        public void mo147314b(IKeyBoardPlugin bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "clicked");
        }

        C40790d() {
        }
    }

    /* renamed from: a */
    public final int mo147286a() {
        return this.f103661h;
    }

    /* renamed from: d */
    public AaStylePluginTransition mo147300e() {
        return this.f103671r;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        mo147303g();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IKeyBoardPluginGroup.C40856a.m161794a(this, i, intent);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        this.f103666m = z;
        View view = this.f103659f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        view.setEnabled(this.f103666m);
        m161405a(new C40793g(z));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
    /* renamed from: a */
    public boolean mo147173a(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103668o;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kbContext");
        }
        if (!bVar.mo147374d() || !this.f103660g) {
            return false;
        }
        IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103668o;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kbContext");
        }
        bVar2.mo147380y();
        return false;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPluginGroup.C40856a.m161793a(this);
    }

    /* renamed from: n */
    public void mo147310n() {
        m161405a(C40788b.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$c */
    static final class C40789c extends Lambda implements Function0<Unit> {
        final /* synthetic */ AaStyleKBPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40789c(AaStyleKBPlugin aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            AaStyleKBPlugin.m161403a(this.this$0).mo147313a(this.this$0);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
        m161414t();
        m161405a(C40792f.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginContainer;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$l */
    static final class C40798l extends Lambda implements Function0<AaStylePluginContainer> {
        final /* synthetic */ AaStyleKBPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40798l(AaStyleKBPlugin aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AaStylePluginContainer invoke() {
            return new AaStylePluginContainer(AaStyleKBPlugin.m161406b(this.this$0), this.this$0.f103656b, this.this$0.f103658d);
        }
    }

    /* renamed from: s */
    private final void m161413s() {
        int i = this.f103661h;
        if (i == 1) {
            mo147296c().setBackViewVisibility$im_keyboard_release(8);
        } else if (i == 3) {
            mo147296c().setBackViewVisibility$im_keyboard_release(0);
        }
        m161412r();
    }

    /* renamed from: t */
    private final void m161414t() {
        Iterator<T> it = m161410p().iterator();
        while (it.hasNext()) {
            it.next().mo147305i();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
        this.f103660g = false;
        View view = this.f103659f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        view.setSelected(false);
        this.f103664k.mo147359d();
        this.f103661h = 0;
    }

    /* renamed from: o */
    public final AaStyleKBPluginSnapshot mo147311o() {
        return new AaStyleKBPluginSnapshot(this.f103662i, this.f103661h, this.f103664k, this.f103666m, this.f103667n, this.f103660g);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$m */
    static final class C40799m extends Lambda implements Function0<List<? extends IkeyBoardSubPlugin>> {
        final /* synthetic */ AaStyleKBPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40799m(AaStyleKBPlugin aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.util.List<com.ss.android.lark.keyboard.plugin.tool.d.c>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends IkeyBoardSubPlugin> invoke() {
            List<Pair<IkeyBoardSubPlugin, String>> f = this.this$0.mo147302f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(f, 10));
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                arrayList.add((IkeyBoardSubPlugin) it.next().getFirst());
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103668o;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kbContext");
        }
        if (!bVar.mo147374d()) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103668o;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kbContext");
            }
            bVar2.mo147375j();
        }
        if (this.f103661h == 0) {
            this.f103661h = 3;
        }
        this.f103660g = true;
        View view = this.f103659f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        view.setSelected(true);
        m161411q();
        m161413s();
    }

    /* renamed from: q */
    private final void m161411q() {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103668o;
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
            KeyboardHitPointExtraParams.Click click = KeyboardHitPointExtraParams.Click.TOOLBAR;
            KeyboardHitPointExtraParams.Target target = KeyboardHitPointExtraParams.Target.IM_CHAT_TOOLBAR_VIEW;
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103668o;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kbContext");
            }
            KeyboardHitPointNew.m160872a(C40683h.m160851a(b), C54952a.m213204a(click.plus(target).plus(C40673a.m160698a(bVar2.mo147381z().mo146903h())), C40683h.m160856f(b)));
        }
    }

    /* renamed from: r */
    private final void m161412r() {
        boolean z;
        KeyboardHitPointExtraParams.TriggerType triggerType;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103668o;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kbContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160853c(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103668o;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kbContext");
            }
            IParam a = C40673a.m160698a(bVar2.mo147381z().mo146903h());
            TARGET_NONE eVar = TARGET_NONE.f135700a;
            if (this.f103661h == 3) {
                triggerType = KeyboardHitPointExtraParams.TriggerType.AA_CLICK;
            } else {
                triggerType = KeyboardHitPointExtraParams.TriggerType.CONTENT_SELECT;
            }
            KeyboardHitPointNew.m160872a(C40683h.m160853c(b), a.plus(eVar).plus(triggerType));
        }
    }

    /* renamed from: f */
    public List<Pair<IkeyBoardSubPlugin, String>> mo147302f() {
        return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(new BoldStyleSubPlugin(this), Reflection.getOrCreateKotlinClass(BoldStyleSubPlugin.class).getSimpleName()), TuplesKt.to(new ItalicStyleSubPlugin(this), Reflection.getOrCreateKotlinClass(ItalicStyleSubPlugin.class).getSimpleName()), TuplesKt.to(new UnderLineStyleSubPlugin(this), Reflection.getOrCreateKotlinClass(UnderLineStyleSubPlugin.class).getSimpleName()), TuplesKt.to(new StrikeStyleSubPlugin(this), Reflection.getOrCreateKotlinClass(StrikeStyleSubPlugin.class).getSimpleName())});
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPluginGroup.C40856a.m161792a(this, z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "plugin", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$b */
    public static final class C40788b extends Lambda implements Function1<IkeyBoardSubPlugin, Unit> {
        public static final C40788b INSTANCE = new C40788b();

        C40788b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IkeyBoardSubPlugin cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IkeyBoardSubPlugin cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "plugin");
            cVar.mo147331m();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$e */
    static final class View$OnClickListenerC40791e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AaStyleKBPlugin f103675a;

        View$OnClickListenerC40791e(AaStyleKBPlugin aVar) {
            this.f103675a = aVar;
        }

        public final void onClick(View view) {
            this.f103675a.f103658d.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$f */
    static final class C40792f extends Lambda implements Function1<IkeyBoardSubPlugin, Unit> {
        public static final C40792f INSTANCE = new C40792f();

        C40792f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IkeyBoardSubPlugin cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IkeyBoardSubPlugin cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            cVar.mo147306j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$g */
    static final class C40793g extends Lambda implements Function1<IkeyBoardSubPlugin, Unit> {
        final /* synthetic */ boolean $isEnable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40793g(boolean z) {
            super(1);
            this.$isEnable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IkeyBoardSubPlugin cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IkeyBoardSubPlugin cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            cVar.mo147291a(this.$isEnable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$h */
    static final class C40794h extends Lambda implements Function1<IkeyBoardSubPlugin, Unit> {
        final /* synthetic */ boolean $shown;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40794h(boolean z) {
            super(1);
            this.$shown = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IkeyBoardSubPlugin cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IkeyBoardSubPlugin cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            cVar.mo147301e(this.$shown);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$i */
    static final class C40795i extends Lambda implements Function1<IkeyBoardSubPlugin, Unit> {
        final /* synthetic */ boolean $replyMode;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40795i(boolean z) {
            super(1);
            this.$replyMode = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IkeyBoardSubPlugin cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IkeyBoardSubPlugin cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            cVar.mo147299d(this.$replyMode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$j */
    static final class C40796j extends Lambda implements Function1<IkeyBoardSubPlugin, Unit> {
        final /* synthetic */ boolean $isVisible;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40796j(boolean z) {
            super(1);
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IkeyBoardSubPlugin cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IkeyBoardSubPlugin cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            cVar.mo147295b(this.$isVisible);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.a$k */
    static final class C40797k extends Lambda implements Function1<IkeyBoardSubPlugin, Unit> {
        final /* synthetic */ IKeyBoardPlugin.IKeyBoardContext $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40797k(IKeyBoardPlugin.IKeyBoardContext bVar) {
            super(1);
            this.$context = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IkeyBoardSubPlugin cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(IkeyBoardSubPlugin cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            cVar.mo147290a(this.$context);
        }
    }

    /* renamed from: a */
    private final void m161404a(String str) {
        this.f103665l.mo147363a(str);
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier m161403a(AaStyleKBPlugin aVar) {
        IKeyBoardPlugin.ITouchActionNotifier dVar = aVar.f103657c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originNotifier");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ Context m161406b(AaStyleKBPlugin aVar) {
        Context context = aVar.f103655a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
        m161405a(new C40795i(z));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
        m161405a(new C40794h(z));
    }

    /* renamed from: a */
    private final void m161405a(Function1<? super IkeyBoardSubPlugin, Unit> function1) {
        Iterator<T> it = m161410p().iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    /* renamed from: b */
    private final void m161408b(AaStyleKBPluginSnapshot bVar) {
        this.f103666m = bVar.mo147338b();
        this.f103667n = bVar.mo147339c();
        this.f103662i = bVar.mo147337a();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
    /* renamed from: a */
    public void mo147171a(EditText editText) {
        Intrinsics.checkParameterIsNotNull(editText, "editText");
        if (editText instanceof KeyboardRichTextEditText) {
            String editorType = ((KeyboardRichTextEditText) editText).getEditorType();
            if (editText.hashCode() != this.f103663j) {
                m161404a(editorType);
            }
            this.f103663j = editText.hashCode();
            this.f103662i = editorType;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "pluginContainer.context");
        this.f103655a = context;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m161410p().iterator();
        while (it.hasNext()) {
            View a = it.next().mo147288a(viewGroup, this.f103672s);
            if (a != null) {
                arrayList.add(a);
            }
        }
        this.f103656b.clear();
        this.f103656b.addAll(arrayList);
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103668o;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kbContext");
        }
        bVar.mo147370a(this);
    }

    /* renamed from: a */
    public final void mo147289a(AaStyleKBPluginSnapshot bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "snapshot");
        Log.m165389i("AaStyleKBPlugin", "onRestoreParams: isStared " + this.f103660g + " + " + "snapshot: " + bVar);
        if (!this.f103660g && bVar.mo147340d()) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103668o;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kbContext");
            }
            bVar2.mo147373b(this);
        } else if (this.f103660g && !bVar.mo147340d()) {
            IKeyBoardPlugin.IKeyBoardContext bVar3 = this.f103668o;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kbContext");
            }
            bVar3.mo147380y();
        }
        m161408b(bVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
        this.f103667n = z;
        m161405a(new C40796j(z));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f103668o = bVar;
        m161405a(new C40797k(bVar));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        Context context = this.f103655a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        AppCompatImageView a = C40679d.m160786a(context, this.f103673t, this.f103674u);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…context, iconId, iconRes)");
        AppCompatImageView appCompatImageView = a;
        this.f103659f = appCompatImageView;
        this.f103657c = dVar;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        appCompatImageView.setOnClickListener(new View$OnClickListenerC40791e(this));
        View view = this.f103659f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        return view;
    }

    /* renamed from: b */
    private final void m161407b(Editable editable, int i, int i2) {
        ArrayList<IKeyBoardPlugin.IKeyBoardContext.ITextWatcher> arrayList = new ArrayList();
        for (T t : m161410p()) {
            if (t instanceof IKeyBoardPlugin.IKeyBoardContext.ITextWatcher) {
                arrayList.add(t);
            }
        }
        for (IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar : arrayList) {
            aVar.mo147170a(editable, i, i2);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
    /* renamed from: a */
    public void mo147170a(Editable editable, int i, int i2) {
        Log.m165389i("AaStyleKBPlugin", "onTextSelected: start is " + i + " , count is " + i2);
        this.f103664k.mo147355a(i, i + i2);
        m161407b(editable, i, i2);
        if (this.f103664k.mo147360e() > 0) {
            if (!this.f103660g) {
                if (this.f103661h == 0) {
                    this.f103661h = 1;
                }
                IKeyBoardPlugin.IKeyBoardContext bVar = this.f103668o;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("kbContext");
                }
                bVar.mo147373b(this);
            }
        } else if (this.f103660g && this.f103661h == 1) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103668o;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kbContext");
            }
            bVar2.mo147380y();
            this.f103661h = 0;
        }
    }

    /* renamed from: b */
    private final void m161409b(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList<IKeyBoardPlugin.IKeyBoardContext.ITextWatcher> arrayList = new ArrayList();
        for (T t : m161410p()) {
            if (t instanceof IKeyBoardPlugin.IKeyBoardContext.ITextWatcher) {
                arrayList.add(t);
            }
        }
        for (IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar : arrayList) {
            aVar.mo147172a(charSequence, i, i2, i3);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
    /* renamed from: a */
    public void mo147172a(CharSequence charSequence, int i, int i2, int i3) {
        m161409b(charSequence, i, i2, i3);
    }
}
