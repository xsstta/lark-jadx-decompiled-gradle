package com.ss.android.lark.keyboard.plugin.input;

import android.app.Activity;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.IKeyBoard;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.AbstractC36435f;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001wBO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012JB\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u000f2\b\u00106\u001a\u0004\u0018\u00010\u000f2\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010\u000f2\b\u0010<\u001a\u0004\u0018\u00010:J\u0018\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010@J \u0010=\u001a\u0002042\u000e\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u001d2\b\u0010?\u001a\u0004\u0018\u00010@J1\u0010B\u001a\u0002042\"\u0010C\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020E0\u001d0D\"\n\u0012\u0006\b\u0001\u0012\u00020E0\u001dH\u0016¢\u0006\u0002\u0010FJ\b\u0010G\u001a\u000204H\u0016J\u0006\u0010H\u001a\u000204J\b\u0010I\u001a\u000204H\u0016J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020\u000fJ\u0010\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010>\u001a\u00020\u000fJ\u0006\u0010N\u001a\u00020\u000fJ\b\u0010O\u001a\u00020PH\u0016J\u0006\u0010Q\u001a\u00020\u0011J\b\u0010R\u001a\u000204H\u0016J\u000e\u0010S\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u000fJ\u0006\u0010T\u001a\u00020\u0011J\b\u0010U\u001a\u000204H\u0016J\u000e\u0010V\u001a\u0002042\u0006\u0010W\u001a\u00020!J\u0006\u0010X\u001a\u00020\u0011J\u000e\u0010Y\u001a\u0002042\u0006\u0010Z\u001a\u00020\u0015J\u001a\u0010[\u001a\u0002042\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rJ\u0010\u0010]\u001a\u0002042\u0006\u0010^\u001a\u00020\u0011H\u0002J\u0010\u0010_\u001a\u0002042\u0006\u0010`\u001a\u00020\u0011H\u0002J\b\u0010a\u001a\u000204H\u0016J\u0010\u0010b\u001a\u0002042\u0006\u0010c\u001a\u00020\u000fH\u0016J,\u0010d\u001a\u0002042\b\u0010e\u001a\u0004\u0018\u00010:2\b\u0010f\u001a\u0004\u0018\u00010\u000f2\b\u0010g\u001a\u0004\u0018\u00010:2\u0006\u0010h\u001a\u00020\u0011J\u000e\u0010i\u001a\u0002042\u0006\u0010j\u001a\u00020\u0011J$\u0010k\u001a\u0002042\u001a\u0010l\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020E0\u001d\u0012\u0004\u0012\u00020\u00110mH\u0016J\u000e\u0010n\u001a\u0002042\u0006\u0010o\u001a\u000201J\b\u0010p\u001a\u000204H\u0016J\u0010\u0010q\u001a\u0002042\b\u0010?\u001a\u0004\u0018\u00010@J$\u0010r\u001a\u0002042\u0006\u0010>\u001a\u00020\u000f2\b\u0010s\u001a\u0004\u0018\u00010\u000e2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J,\u0010r\u001a\u0002042\u000e\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u001d2\b\u0010s\u001a\u0004\u0018\u00010\u000e2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0006\u0010u\u001a\u000204J\u000e\u0010v\u001a\u0002042\u0006\u0010Z\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u001d\u0012\u0004\u0012\u00020\u000e0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000e0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020)0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b/\u0010\u0019\u001a\u0004\b-\u0010.R\u000e\u00100\u001a\u000201X\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "pluginsController", "Lcom/ss/android/lark/keyboard/IKeyBoard;", "panelRegionParent", "Landroid/view/ViewGroup;", "activity", "Landroid/app/Activity;", "btnRegionParent", "mKeyBoardDependency", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "inputSupportPlugins", "", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "", "mRefactorEnable", "", "(Lcom/ss/android/lark/keyboard/IKeyBoard;Landroid/view/ViewGroup;Landroid/app/Activity;Landroid/view/ViewGroup;Lcom/ss/android/lark/keyboard/IKeyBoardDependency;Ljava/util/List;Z)V", "currSupportPlugin", "inputChangedListeners", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "getInputChangedListeners", "()Ljava/util/List;", "inputChangedListeners$delegate", "Lkotlin/Lazy;", "isInReply", "mInputSupportPluginMap", "", "Lkotlin/reflect/KClass;", "mIsStarted", "mNameToPluginMap", "mOnActivityResultRunnable", "Ljava/lang/Runnable;", "mOnReplyModelChangeListener", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin$OnReplyModelChangeListener;", "getMOnReplyModelChangeListener", "()Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin$OnReplyModelChangeListener;", "setMOnReplyModelChangeListener", "(Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin$OnReplyModelChangeListener;)V", "mSendBtnMap", "Landroid/view/View;", "mStrParentMsgId", "mStrRootMsgId", "useNewKeyboard", "getUseNewKeyboard", "()Z", "useNewKeyboard$delegate", "watcherHolder", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "watcherListeners", "changeToReplyMode", "", "parentId", "rootId", "digest", "", "textRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "postRichText", "changeToSpecificInputSupport", "name", "params", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "inputSupport", "changeVisiblePlugins", "visiables", "", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "([Lkotlin/reflect/KClass;)V", "clearInputPluginFocus", "destroy", "finishReplyMode", "getCurrSupportPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "getParentMsgId", "getPluginInstance", "getRootMsgId", "getSourceScene", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "hasSupportPlugin", "hidePanelAndSysKeyBoard", "isCurrInputSupportSameWith", "isInReplyMode", "notifySend", "onActivityResult", "runnable", "onBackPressed", "registerInputChangeListener", "listener", "registerInputPlugin", "pluginPair", "resetDraft", "resetOnStart", "saveDraft", "saveDraftOnStop", "saveEmptyDraft", "selectPlugin", "pluginName", "setDraft", "messageRichText", "title", "richText", "append", "setPluginEnable", "isEnable", "setPluginsEnable", "plugins", "", "setTextWatcher", "watcher", "showSysKeyboard", "start", "startInputSupport", "curr", "inputSupportPlugin", "stop", "unRegisterInputChangeListener", "InputSupportPluginChangeListener", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.h */
public final class InputPluginController implements IInputContext {

    /* renamed from: a */
    public final Map<KClass<? extends IInputSupportPlugin>, IInputSupportPlugin> f103482a = new HashMap();

    /* renamed from: b */
    public List<IKeyBoardPlugin.IKeyBoardContext.ITextWatcher> f103483b = new ArrayList();

    /* renamed from: c */
    public boolean f103484c;

    /* renamed from: d */
    public Runnable f103485d;

    /* renamed from: e */
    private IInputSupportPlugin f103486e;

    /* renamed from: f */
    private final Map<String, IInputSupportPlugin> f103487f = new HashMap();

    /* renamed from: g */
    private final Map<IInputSupportPlugin, View> f103488g = new HashMap();

    /* renamed from: h */
    private boolean f103489h;

    /* renamed from: i */
    private String f103490i = "";

    /* renamed from: j */
    private String f103491j = "";

    /* renamed from: k */
    private final Lazy f103492k = LazyKt.lazy(C40740e.INSTANCE);

    /* renamed from: l */
    private IInputSupportPlugin.OnReplyModelChangeListener f103493l;

    /* renamed from: m */
    private final Lazy f103494m = LazyKt.lazy(C40738c.INSTANCE);

    /* renamed from: n */
    private final IKeyBoardPlugin.IKeyBoardContext.ITextWatcher f103495n = new C40741f(this);

    /* renamed from: o */
    private IKeyBoard f103496o;

    /* renamed from: p */
    private ViewGroup f103497p;

    /* renamed from: q */
    private Activity f103498q;

    /* renamed from: r */
    private ViewGroup f103499r;

    /* renamed from: s */
    private IKeyBoardDependency f103500s;

    /* renamed from: t */
    private List<Pair<IInputSupportPlugin, String>> f103501t;

    /* renamed from: u */
    private boolean f103502u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "", "onInputSupportPluginChange", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.h$a */
    public interface InputSupportPluginChangeListener {
        /* renamed from: a */
        void mo123867a(IOutInputSupport.InputSupportType inputSupportType);
    }

    /* renamed from: p */
    private final boolean m161189p() {
        return ((Boolean) this.f103492k.getValue()).booleanValue();
    }

    /* renamed from: q */
    private final List<InputSupportPluginChangeListener> m161190q() {
        return (List) this.f103494m.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/InputPluginController$getCurrSupportPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "getCurrET", "Landroid/widget/EditText;", "getHeight", "", "getInputModel", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.h$b */
    public static final class C40737b implements IOutInputSupport {
        @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
        /* renamed from: l */
        public EditText mo146904l() {
            return null;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
        /* renamed from: n */
        public int mo146906n() {
            return 0;
        }

        C40737b() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
        /* renamed from: m */
        public IOutInputSupport.InputSupportType mo146905m() {
            return IOutInputSupport.InputSupportType.NONE;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
        /* renamed from: f */
        public boolean mo146901f() {
            return IOutInputSupport.C40685a.m160902c(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
        /* renamed from: g */
        public String mo146902g() {
            return IOutInputSupport.C40685a.m160899a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
        /* renamed from: h */
        public boolean mo146903h() {
            return IOutInputSupport.C40685a.m160901b(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
        /* renamed from: a */
        public void mo146900a(boolean z) {
            IOutInputSupport.C40685a.m160900a(this, z);
        }
    }

    /* renamed from: l */
    public final boolean mo147166l() {
        return this.f103489h;
    }

    /* renamed from: m */
    public final String mo147167m() {
        return this.f103491j;
    }

    /* renamed from: n */
    public final String mo147168n() {
        return this.f103490i;
    }

    /* renamed from: a */
    public final void mo147157a(boolean z) {
        for (Map.Entry<KClass<? extends IInputSupportPlugin>, IInputSupportPlugin> entry : this.f103482a.entrySet()) {
            entry.getValue().mo147011b(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<kotlin.reflect.KClass<? extends com.ss.android.lark.keyboard.plugin.input.f>, com.ss.android.lark.keyboard.plugin.input.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.Map<java.lang.String, com.ss.android.lark.keyboard.plugin.input.f> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo147156a(Pair<? extends IInputSupportPlugin, String> pair) {
        Intrinsics.checkParameterIsNotNull(pair, "pluginPair");
        this.f103501t.add(pair);
        IInputSupportPlugin fVar = (IInputSupportPlugin) pair.getFirst();
        this.f103482a.put(Reflection.getOrCreateKotlinClass(fVar.getClass()), pair.getFirst());
        this.f103487f.put(pair.getSecond(), pair.getFirst());
        if (!this.f103502u) {
            fVar.mo147037a(this);
            this.f103488g.put(fVar, fVar.mo147033a(this.f103499r));
            fVar.mo147039a(this.f103495n);
            Activity activity = this.f103498q;
            if (activity instanceof AbstractC36435f) {
                ViewGroup viewGroup = this.f103497p;
                if (activity != null) {
                    View a = ((AbstractC36435f) activity).mo129674a().mo134293a(this.f103498q, fVar.mo147089i(), this.f103497p);
                    Intrinsics.checkExpressionValueIsNotNull(a, "(activity as IAsyncInfla…tId(), panelRegionParent)");
                    viewGroup.addView(fVar.mo147031a(activity, a));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.asyncInflater.IAsyncInflaterOwner");
            }
            ViewGroup viewGroup2 = this.f103497p;
            viewGroup2.addView(fVar.mo147032a(activity, viewGroup2));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: a */
    public void mo147121a(KClass<? extends IInputSupportPlugin> kClass, IInputSupportPlugin fVar, TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(kClass, "inputSupportPlugin");
        if (this.f103482a.get(kClass) != null) {
            if (fVar != null) {
                fVar.mo147013d();
            }
            IInputSupportPlugin fVar2 = this.f103482a.get(kClass);
            if (fVar2 == null) {
                Intrinsics.throwNpe();
            }
            IInputSupportPlugin fVar3 = fVar2;
            this.f103499r.removeAllViews();
            this.f103499r.addView(this.f103488g.get(fVar3));
            fVar3.mo147038a(jVar);
            this.f103486e = fVar3;
            Iterator<T> it = m161190q().iterator();
            while (it.hasNext()) {
                it.next().mo123867a(fVar3.mo146905m());
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: a */
    public void mo147122a(KClass<? extends IKeyBoardPlugin>... kClassArr) {
        Intrinsics.checkParameterIsNotNull(kClassArr, "visiables");
        this.f103496o.mo146811a((KClass[]) Arrays.copyOf(kClassArr, kClassArr.length));
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: a */
    public void mo147120a(Map<KClass<? extends IKeyBoardPlugin>, Boolean> map) {
        Intrinsics.checkParameterIsNotNull(map, "plugins");
        for (Map.Entry<KClass<? extends IKeyBoardPlugin>, Boolean> entry : map.entrySet()) {
            this.f103496o.mo146809a(entry.getKey(), entry.getValue().booleanValue());
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: b */
    public void mo147123b() {
        this.f103496o.mo146820c();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: c */
    public void mo147124c() {
        this.f103496o.mo146829j();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: f */
    public KeyboardScene mo147127f() {
        return this.f103496o.mo146813b();
    }

    /* renamed from: j */
    public final boolean mo147164j() {
        if (this.f103486e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public void mo147169o() {
        IInputSupportPlugin fVar = this.f103486e;
        if (fVar != null) {
            fVar.mo147012c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.h$c */
    static final class C40738c extends Lambda implements Function0<ArrayList<InputSupportPluginChangeListener>> {
        public static final C40738c INSTANCE = new C40738c();

        C40738c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<InputSupportPluginChangeListener> invoke() {
            return new ArrayList<>();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: d */
    public void mo147125d() {
        if (this.f103496o.mo146840u()) {
            mo147118a();
        }
    }

    /* renamed from: g */
    public final void mo147161g() {
        Log.m165389i("KeyBoard", "inputPluginController stop");
        m161187b(true);
    }

    /* renamed from: i */
    public final IOutInputSupport mo147163i() {
        IInputSupportPlugin fVar = this.f103486e;
        if (fVar != null) {
            return fVar;
        }
        return new C40737b();
    }

    /* renamed from: k */
    public final boolean mo147165k() {
        return mo147163i().mo146901f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.h$e */
    static final class C40740e extends Lambda implements Function0<Boolean> {
        public static final C40740e INSTANCE = new C40740e();

        C40740e() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return C40682g.m160850a().mo133171a("messenger.message_inputbox_redesign");
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: a */
    public void mo147118a() {
        if (this.f103489h) {
            this.f103489h = false;
            m161187b(false);
            this.f103490i = "";
            this.f103491j = "";
            for (Map.Entry<KClass<? extends IInputSupportPlugin>, IInputSupportPlugin> entry : this.f103482a.entrySet()) {
                entry.getValue().mo147090j();
            }
            m161188c(false);
            IInputSupportPlugin.OnReplyModelChangeListener cVar = this.f103493l;
            if (cVar != null) {
                cVar.mo147128a(this.f103489h);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: e */
    public void mo147126e() {
        if (this.f103484c) {
            TransationData jVar = new TransationData();
            this.f103500s.mo122096a("", (RichText) jVar.mo147174a("draft_msg_richtext"), (String) jVar.mo147174a("draft_post_title"), (RichText) jVar.mo147174a("draft_post_reichtext"), false);
        }
    }

    /* renamed from: h */
    public final void mo147162h() {
        Log.m165389i("KeyBoard", "inputPluginController destroy");
        for (Map.Entry<KClass<? extends IInputSupportPlugin>, IInputSupportPlugin> entry : this.f103482a.entrySet()) {
            entry.getValue().mo147014e();
        }
        this.f103484c = false;
    }

    /* renamed from: a */
    public final void mo147148a(IInputSupportPlugin.OnReplyModelChangeListener cVar) {
        this.f103493l = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\"\u0010\u0012\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/InputPluginController$watcherHolder$1", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "onEditorFocused", "", "editText", "Landroid/widget/EditText;", "onEditorKeyPreIme", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onTextChanged", "s", "", "start", "before", "count", "onTextSelected", "Landroid/text/Editable;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.h$f */
    public static final class C40741f implements IKeyBoardPlugin.IKeyBoardContext.ITextWatcher {

        /* renamed from: a */
        final /* synthetic */ InputPluginController f103505a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40741f(InputPluginController hVar) {
            this.f103505a = hVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
        /* renamed from: a */
        public void mo147171a(EditText editText) {
            Intrinsics.checkParameterIsNotNull(editText, "editText");
            Iterator<T> it = this.f103505a.f103483b.iterator();
            while (it.hasNext()) {
                it.next().mo147171a(editText);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
        /* renamed from: a */
        public boolean mo147173a(int i, KeyEvent keyEvent) {
            Iterator<T> it = this.f103505a.f103483b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z &= it.next().mo147173a(i, keyEvent);
            }
            return z;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
        /* renamed from: a */
        public void mo147170a(Editable editable, int i, int i2) {
            Iterator<T> it = this.f103505a.f103483b.iterator();
            while (it.hasNext()) {
                it.next().mo147170a(editable, i, i2);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
        /* renamed from: a */
        public void mo147172a(CharSequence charSequence, int i, int i2, int i3) {
            Iterator<T> it = this.f103505a.f103483b.iterator();
            while (it.hasNext()) {
                it.next().mo147172a(charSequence, i, i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo147153a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        this.f103485d = runnable;
    }

    /* renamed from: a */
    public final void mo147149a(InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        m161190q().add(aVar);
    }

    /* renamed from: b */
    public final void mo147158b(InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        m161190q().remove(aVar);
    }

    /* renamed from: c */
    public final IInputSupportPlugin mo147160c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f103487f.get(str);
    }

    /* renamed from: c */
    private final void m161188c(boolean z) {
        if (this.f103484c) {
            this.f103500s.mo122097a(z, new C40739d(this, z));
        }
    }

    /* renamed from: a */
    public final void mo147151a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "watcher");
        if (!this.f103483b.contains(aVar)) {
            this.f103483b.add(aVar);
        }
    }

    /* renamed from: b */
    public final boolean mo147159b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (this.f103487f.get(str) == this.f103486e) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m161187b(boolean z) {
        if (this.f103484c) {
            TransationData jVar = new TransationData();
            if (m161189p()) {
                IInputSupportPlugin fVar = this.f103486e;
                if (fVar != null) {
                    jVar.mo147175a(fVar.mo147053k());
                }
            } else {
                Iterator<T> it = this.f103501t.iterator();
                while (it.hasNext()) {
                    jVar.mo147175a(((IInputSupportPlugin) it.next().getFirst()).mo147053k());
                }
            }
            Log.m165379d("doDraft save", jVar.toString());
            this.f103500s.mo122096a(this.f103490i, (RichText) jVar.mo147174a("draft_msg_richtext"), (String) jVar.mo147174a("draft_post_title"), (RichText) jVar.mo147174a("draft_post_reichtext"), z);
        }
    }

    /* renamed from: a */
    public final void mo147150a(TransationData jVar) {
        if (this.f103502u) {
            Iterator<T> it = this.f103501t.iterator();
            while (it.hasNext()) {
                IInputSupportPlugin fVar = (IInputSupportPlugin) it.next().getFirst();
                fVar.mo147037a(this);
                this.f103488g.put(fVar, fVar.mo147033a(this.f103499r));
                fVar.mo147039a(this.f103495n);
                if (!(this.f103498q instanceof AbstractC36435f) || !C40682g.m160850a().mo133171a("chat.enter.async.load.xml")) {
                    ViewGroup viewGroup = this.f103497p;
                    viewGroup.addView(fVar.mo147032a(this.f103498q, viewGroup));
                } else {
                    ViewGroup viewGroup2 = this.f103497p;
                    Activity activity = this.f103498q;
                    if (activity != null) {
                        View a = ((AbstractC36435f) activity).mo129674a().mo134293a(this.f103498q, fVar.mo147089i(), this.f103497p);
                        Intrinsics.checkExpressionValueIsNotNull(a, "(activity as IAsyncInfla…tId(), panelRegionParent)");
                        viewGroup2.addView(fVar.mo147031a(activity, a));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.asyncInflater.IAsyncInflaterOwner");
                    }
                }
            }
        }
        this.f103484c = true;
        mo147121a(Reflection.getOrCreateKotlinClass(this.f103501t.get(0).getFirst().getClass()), (IInputSupportPlugin) null, jVar);
        m161188c(true);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputContext
    /* renamed from: a */
    public void mo147119a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        this.f103496o.mo146823e(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/InputPluginController$resetDraft$1", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency$IResetDraftCallback;", "onResetDraft", "", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "", "postRichText", "extraDraftData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.h$d */
    public static final class C40739d implements IKeyBoardDependency.IResetDraftCallback {

        /* renamed from: a */
        final /* synthetic */ InputPluginController f103503a;

        /* renamed from: b */
        final /* synthetic */ boolean f103504b;

        C40739d(InputPluginController hVar, boolean z) {
            this.f103503a = hVar;
            this.f103504b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x004f A[SYNTHETIC] */
        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency.IResetDraftCallback
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo146859a(com.ss.android.lark.widget.richtext.RichText r3, java.lang.String r4, com.ss.android.lark.widget.richtext.RichText r5, com.ss.android.lark.keyboard.plugin.input.TransationData r6) {
            /*
            // Method dump skipped, instructions count: 153
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.input.InputPluginController.C40739d.mo146859a(com.ss.android.lark.widget.richtext.RichText, java.lang.String, com.ss.android.lark.widget.richtext.RichText, com.ss.android.lark.keyboard.plugin.input.j):void");
        }
    }

    /* renamed from: a */
    public final void mo147154a(String str, TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        m161186a(str, this.f103486e, jVar);
    }

    /* renamed from: a */
    private final void m161186a(String str, IInputSupportPlugin fVar, TransationData jVar) {
        if (this.f103487f.get(str) != null) {
            if (fVar != null) {
                fVar.mo147013d();
            }
            IInputSupportPlugin fVar2 = this.f103487f.get(str);
            if (fVar2 == null) {
                Intrinsics.throwNpe();
            }
            IInputSupportPlugin fVar3 = fVar2;
            this.f103499r.removeAllViews();
            this.f103499r.addView(this.f103488g.get(fVar3));
            fVar3.mo147038a(jVar);
            this.f103486e = fVar3;
            Iterator<T> it = m161190q().iterator();
            while (it.hasNext()) {
                it.next().mo123867a(fVar3.mo146905m());
            }
        }
    }

    /* renamed from: a */
    public final void mo147152a(RichText richText, String str, RichText richText2, boolean z) {
        TransationData jVar = new TransationData();
        jVar.mo147176a("draft_msg_richtext", richText);
        jVar.mo147176a("draft_post_title", str);
        jVar.mo147176a("draft_post_reichtext", richText2);
        Log.m165379d("doDraft set", jVar.toString());
        for (Map.Entry<KClass<? extends IInputSupportPlugin>, IInputSupportPlugin> entry : this.f103482a.entrySet()) {
            entry.getValue().mo147087a(jVar, z);
        }
    }

    /* renamed from: a */
    public final void mo147155a(String str, String str2, CharSequence charSequence, RichText richText, String str3, RichText richText2) {
        this.f103489h = true;
        TransationData jVar = new TransationData();
        jVar.mo147176a("reply_data_msgdigest", charSequence);
        jVar.mo147176a("draft_msg_richtext", richText);
        jVar.mo147176a("draft_post_title", str3);
        jVar.mo147176a("draft_post_reichtext", richText2);
        m161187b(false);
        if (str2 == null) {
            str2 = "";
        }
        this.f103491j = str2;
        if (str == null) {
            str = "";
        }
        this.f103490i = str;
        for (Map.Entry<KClass<? extends IInputSupportPlugin>, IInputSupportPlugin> entry : this.f103482a.entrySet()) {
            entry.getValue().mo147088b(jVar);
        }
        IInputSupportPlugin.OnReplyModelChangeListener cVar = this.f103493l;
        if (cVar != null) {
            cVar.mo147128a(this.f103489h);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.util.Map<kotlin.reflect.KClass<? extends com.ss.android.lark.keyboard.plugin.input.f>, com.ss.android.lark.keyboard.plugin.input.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.util.Map<java.lang.String, com.ss.android.lark.keyboard.plugin.input.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public InputPluginController(IKeyBoard bVar, ViewGroup viewGroup, Activity activity, ViewGroup viewGroup2, IKeyBoardDependency cVar, List<Pair<IInputSupportPlugin, String>> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(bVar, "pluginsController");
        Intrinsics.checkParameterIsNotNull(viewGroup, "panelRegionParent");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(viewGroup2, "btnRegionParent");
        Intrinsics.checkParameterIsNotNull(cVar, "mKeyBoardDependency");
        Intrinsics.checkParameterIsNotNull(list, "inputSupportPlugins");
        this.f103496o = bVar;
        this.f103497p = viewGroup;
        this.f103498q = activity;
        this.f103499r = viewGroup2;
        this.f103500s = cVar;
        this.f103501t = list;
        this.f103502u = z;
        for (T t : this.f103501t) {
            IInputSupportPlugin fVar = (IInputSupportPlugin) t.getFirst();
            this.f103482a.put(Reflection.getOrCreateKotlinClass(fVar.getClass()), t.getFirst());
            this.f103487f.put(t.getSecond(), t.getFirst());
            if (!this.f103502u) {
                fVar.mo147037a(this);
                this.f103488g.put(fVar, fVar.mo147033a(this.f103499r));
                fVar.mo147039a(this.f103495n);
                ViewGroup viewGroup3 = this.f103497p;
                viewGroup3.addView(fVar.mo147032a(this.f103498q, viewGroup3));
            }
        }
    }
}
