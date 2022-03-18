package com.ss.android.lark.keyboard.plugin.input;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.AbstractC36434e;
import com.ss.android.lark.p1786d.AbstractC36435f;
import com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0019\u0018\u0000 32\u00020\u0001:\u0003345B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020#J\u001a\u0010'\u001a\u00020\u001c2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\t0\rJ\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+J&\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000fJ\u0006\u00101\u001a\u00020\u001cJ\u0006\u00102\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\t0\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u00066"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController;", "", "()V", "mActivity", "Landroid/app/Activity;", "mAdditionFuncContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mAdditionPluginMap", "", "", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin;", "mAdditionPlugins", "", "Lkotlin/Pair;", "mDividerHeight", "", "mPanelChangeListenerMap", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener;", "mPluginsEnv", "Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$PluginEnv;", "mPopDrawerBgView", "Landroid/view/View;", "mPopDrawerLayout", "Lcom/ss/android/lark/widget/slidingup/SlidingUpPanelLayout;", "panelSlideListener", "com/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$panelSlideListener$1", "Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$panelSlideListener$1;", "destroy", "", "inflatePlugin", "name", "initSupportPluginContainer", "initSupportPluginEnv", "notifyKeyboardChange", "shown", "", "onBackPress", "onEnableChanged", "enable", "registerPlugin", "pluginPair", "reset", "callback", "Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$IPopPanelResetCallback;", "setupContainer", "popDrawerLayout", "additionFuncContainer", "activity", "dividerHeight", "start", "stop", "Companion", "IPopPanelResetCallback", "PluginEnv", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.g */
public final class InputAdditionPluginController {

    /* renamed from: e */
    public static final Companion f103459e = new Companion(null);

    /* renamed from: a */
    public final Map<IInputSupportAdditionPlugin.OnPanelChangeListener, Object> f103460a = new HashMap();

    /* renamed from: b */
    public SlidingUpPanelLayout f103461b;

    /* renamed from: c */
    public View f103462c;

    /* renamed from: d */
    public Activity f103463d;

    /* renamed from: f */
    private final Map<String, IInputSupportAdditionPlugin> f103464f = new HashMap();

    /* renamed from: g */
    private final Map<String, PluginEnv> f103465g = new HashMap();

    /* renamed from: h */
    private List<Pair<IInputSupportAdditionPlugin, String>> f103466h = new ArrayList();

    /* renamed from: i */
    private ConstraintLayout f103467i;

    /* renamed from: j */
    private int f103468j = 2;

    /* renamed from: k */
    private final C40735h f103469k = new C40735h(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$IPopPanelResetCallback;", "", "onPanelReset", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$b */
    public interface IPopPanelResetCallback {
        /* renamed from: a */
        void mo147138a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$PluginEnv;", "", "name", "", "container", "Landroid/view/ViewGroup;", "context", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;", "(Ljava/lang/String;Landroid/view/ViewGroup;Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;)V", "getContainer", "()Landroid/view/ViewGroup;", "getContext", "()Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$c */
    public static final class PluginEnv {

        /* renamed from: a */
        private final String f103470a;

        /* renamed from: b */
        private final ViewGroup f103471b;

        /* renamed from: c */
        private final IInputSupportAdditionPlugin.IAdditionSupportContext f103472c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluginEnv)) {
                return false;
            }
            PluginEnv cVar = (PluginEnv) obj;
            return Intrinsics.areEqual(this.f103470a, cVar.f103470a) && Intrinsics.areEqual(this.f103471b, cVar.f103471b) && Intrinsics.areEqual(this.f103472c, cVar.f103472c);
        }

        public int hashCode() {
            String str = this.f103470a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ViewGroup viewGroup = this.f103471b;
            int hashCode2 = (hashCode + (viewGroup != null ? viewGroup.hashCode() : 0)) * 31;
            IInputSupportAdditionPlugin.IAdditionSupportContext aVar = this.f103472c;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "PluginEnv(name=" + this.f103470a + ", container=" + this.f103471b + ", context=" + this.f103472c + ")";
        }

        /* renamed from: a */
        public final ViewGroup mo147139a() {
            return this.f103471b;
        }

        /* renamed from: b */
        public final IInputSupportAdditionPlugin.IAdditionSupportContext mo147140b() {
            return this.f103472c;
        }

        public PluginEnv(String str, ViewGroup viewGroup, IInputSupportAdditionPlugin.IAdditionSupportContext aVar) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            Intrinsics.checkParameterIsNotNull(aVar, "context");
            this.f103470a = str;
            this.f103471b = viewGroup;
            this.f103472c = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$initSupportPluginEnv$1$1", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;", "hide", "", "registerPanelChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener;", "show", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$e */
    public static final class C40732e implements IInputSupportAdditionPlugin.IAdditionSupportContext {

        /* renamed from: a */
        final /* synthetic */ ConstraintLayout f103474a;

        /* renamed from: b */
        final /* synthetic */ InputAdditionPluginController f103475b;

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.IAdditionSupportContext
        /* renamed from: a */
        public void mo146897a() {
            this.f103474a.setVisibility(0);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.IAdditionSupportContext
        /* renamed from: b */
        public void mo146899b() {
            this.f103474a.setVisibility(8);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.IAdditionSupportContext
        /* renamed from: a */
        public void mo146898a(IInputSupportAdditionPlugin.OnPanelChangeListener onPanelChangeListener) {
            Intrinsics.checkParameterIsNotNull(onPanelChangeListener, "listener");
            this.f103475b.f103460a.put(onPanelChangeListener, new Object());
        }

        C40732e(ConstraintLayout constraintLayout, InputAdditionPluginController gVar) {
            this.f103474a = constraintLayout;
            this.f103475b = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$initSupportPluginEnv$2$1", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;", "hide", "", "registerPanelChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener;", "show", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$f */
    public static final class C40733f implements IInputSupportAdditionPlugin.IAdditionSupportContext {

        /* renamed from: a */
        final /* synthetic */ SlidingUpPanelLayout f103476a;

        /* renamed from: b */
        final /* synthetic */ InputAdditionPluginController f103477b;

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.IAdditionSupportContext
        /* renamed from: b */
        public void mo146899b() {
            this.f103476a.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.IAdditionSupportContext
        /* renamed from: a */
        public void mo146897a() {
            this.f103476a.setEnabled(true);
            this.f103476a.setPanelState(SlidingUpPanelLayout.PanelState.EXPANDED);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.IAdditionSupportContext
        /* renamed from: a */
        public void mo146898a(IInputSupportAdditionPlugin.OnPanelChangeListener onPanelChangeListener) {
            Intrinsics.checkParameterIsNotNull(onPanelChangeListener, "listener");
            this.f103477b.f103460a.put(onPanelChangeListener, new Object());
        }

        C40733f(SlidingUpPanelLayout slidingUpPanelLayout, InputAdditionPluginController gVar) {
            this.f103476a = slidingUpPanelLayout;
            this.f103477b = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$g */
    public static final class RunnableC40734g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SlidingUpPanelLayout f103478a;

        RunnableC40734g(SlidingUpPanelLayout slidingUpPanelLayout) {
            this.f103478a = slidingUpPanelLayout;
        }

        public final void run() {
            View dragView;
            if (this.f103478a.isEnabled() && this.f103478a.getVisibility() != 8 && (dragView = this.f103478a.getDragView()) != null && dragView.getVisibility() == 0 && dragView.getY() < ((float) (this.f103478a.getHeight() - dragView.getHeight()))) {
                this.f103478a.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
            }
        }
    }

    /* renamed from: e */
    private final void m161162e() {
        SlidingUpPanelLayout slidingUpPanelLayout = this.f103461b;
        if (slidingUpPanelLayout != null) {
            slidingUpPanelLayout.setGravity(80);
            slidingUpPanelLayout.mo200904a(this.f103469k);
            slidingUpPanelLayout.setFadeOnClickListener(new View$OnClickListenerC40731d(slidingUpPanelLayout));
            slidingUpPanelLayout.setOverlayed(true);
            slidingUpPanelLayout.setPanelHeight(0);
            slidingUpPanelLayout.setEnabled(false);
            slidingUpPanelLayout.setShadowHeight(this.f103468j);
            slidingUpPanelLayout.setDragView((View) null);
            View findViewById = slidingUpPanelLayout.findViewById(R.id.content);
            this.f103462c = findViewById;
            if (findViewById != null) {
                findViewById.setClickable(false);
            }
        }
    }

    /* renamed from: f */
    private final void m161163f() {
        ConstraintLayout constraintLayout = this.f103467i;
        if (constraintLayout != null && this.f103461b != null) {
            if (constraintLayout != null) {
                this.f103465g.put("input_addition", new PluginEnv("input_addition", constraintLayout, new C40732e(constraintLayout, this)));
            }
            SlidingUpPanelLayout slidingUpPanelLayout = this.f103461b;
            if (slidingUpPanelLayout != null) {
                this.f103465g.put("input_pop", new PluginEnv("input_pop", slidingUpPanelLayout, new C40733f(slidingUpPanelLayout, this)));
            }
        }
    }

    /* renamed from: a */
    public final void mo147129a() {
        Iterator<T> it = this.f103466h.iterator();
        while (it.hasNext()) {
            m161161a((String) it.next().getSecond());
        }
        Log.m165389i("KeyBoard", "additionPluginController start");
    }

    /* renamed from: b */
    public final void mo147134b() {
        Log.m165389i("KeyBoard", "additionPluginController stop");
        for (Map.Entry<String, IInputSupportAdditionPlugin> entry : this.f103464f.entrySet()) {
            entry.getValue().mo102080b();
        }
    }

    /* renamed from: c */
    public final void mo147136c() {
        Log.m165389i("KeyBoard", "additionPluginController destroy");
        for (Map.Entry<String, IInputSupportAdditionPlugin> entry : this.f103464f.entrySet()) {
            entry.getValue().mo102082c();
        }
        this.f103460a.clear();
        SlidingUpPanelLayout slidingUpPanelLayout = this.f103461b;
        if (slidingUpPanelLayout != null) {
            slidingUpPanelLayout.mo200909b(this.f103469k);
        }
    }

    /* renamed from: d */
    public final boolean mo147137d() {
        SlidingUpPanelLayout slidingUpPanelLayout = this.f103461b;
        if (slidingUpPanelLayout == null || !slidingUpPanelLayout.isEnabled() || slidingUpPanelLayout.getVisibility() == 8 || slidingUpPanelLayout.getPanelState() != SlidingUpPanelLayout.PanelState.EXPANDED) {
            return false;
        }
        slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$d */
    public static final class View$OnClickListenerC40731d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SlidingUpPanelLayout f103473a;

        View$OnClickListenerC40731d(SlidingUpPanelLayout slidingUpPanelLayout) {
            this.f103473a = slidingUpPanelLayout;
        }

        public final void onClick(View view) {
            this.f103473a.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$panelSlideListener$1", "Lcom/ss/android/lark/widget/slidingup/SlidingUpPanelLayout$PanelSlideListener;", "onPanelSlide", "", "panel", "Landroid/view/View;", "slideOffset", "", "onPanelStateChanged", "previousState", "Lcom/ss/android/lark/widget/slidingup/SlidingUpPanelLayout$PanelState;", "newState", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$h */
    public static final class C40735h implements SlidingUpPanelLayout.AbstractC59138b {

        /* renamed from: a */
        final /* synthetic */ InputAdditionPluginController f103479a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40735h(InputAdditionPluginController gVar) {
            this.f103479a = gVar;
        }

        @Override // com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.AbstractC59138b
        /* renamed from: a */
        public void mo147146a(View view, float f) {
            for (Map.Entry<IInputSupportAdditionPlugin.OnPanelChangeListener, Object> entry : this.f103479a.f103460a.entrySet()) {
                entry.getKey().mo102083a();
            }
        }

        @Override // com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.AbstractC59138b
        /* renamed from: a */
        public void mo147147a(View view, SlidingUpPanelLayout.PanelState panelState, SlidingUpPanelLayout.PanelState panelState2) {
            if (panelState2 == SlidingUpPanelLayout.PanelState.COLLAPSED) {
                SlidingUpPanelLayout slidingUpPanelLayout = this.f103479a.f103461b;
                if (slidingUpPanelLayout != null) {
                    slidingUpPanelLayout.setEnabled(false);
                }
                View view2 = this.f103479a.f103462c;
                if (view2 != null) {
                    view2.setClickable(false);
                }
            }
            if (panelState == SlidingUpPanelLayout.PanelState.COLLAPSED) {
                SlidingUpPanelLayout slidingUpPanelLayout2 = this.f103479a.f103461b;
                if (slidingUpPanelLayout2 != null) {
                    slidingUpPanelLayout2.setEnabled(true);
                }
                View view3 = this.f103479a.f103462c;
                if (view3 != null) {
                    view3.setClickable(true);
                }
                for (Map.Entry<IInputSupportAdditionPlugin.OnPanelChangeListener, Object> entry : this.f103479a.f103460a.entrySet()) {
                    entry.getKey().mo102084a(0);
                }
            }
            if (panelState == SlidingUpPanelLayout.PanelState.EXPANDED) {
                for (Map.Entry<IInputSupportAdditionPlugin.OnPanelChangeListener, Object> entry2 : this.f103479a.f103460a.entrySet()) {
                    entry2.getKey().mo102084a(1);
                }
            }
            if (panelState2 == SlidingUpPanelLayout.PanelState.COLLAPSED) {
                for (Map.Entry<IInputSupportAdditionPlugin.OnPanelChangeListener, Object> entry3 : this.f103479a.f103460a.entrySet()) {
                    entry3.getKey().mo102085b(1);
                }
            }
            if (panelState2 == SlidingUpPanelLayout.PanelState.EXPANDED) {
                for (Map.Entry<IInputSupportAdditionPlugin.OnPanelChangeListener, Object> entry4 : this.f103479a.f103460a.entrySet()) {
                    entry4.getKey().mo102085b(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo147133a(boolean z) {
        SlidingUpPanelLayout slidingUpPanelLayout = this.f103461b;
        if (slidingUpPanelLayout != null) {
            slidingUpPanelLayout.post(new RunnableC40734g(slidingUpPanelLayout));
        }
    }

    /* renamed from: b */
    public final void mo147135b(boolean z) {
        Iterator<T> it = this.f103466h.iterator();
        while (it.hasNext()) {
            ((IInputSupportAdditionPlugin) it.next().getFirst()).mo102079a(z);
        }
    }

    /* renamed from: a */
    public final void mo147130a(IPopPanelResetCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        SlidingUpPanelLayout slidingUpPanelLayout = this.f103461b;
        if (slidingUpPanelLayout == null || !slidingUpPanelLayout.isEnabled() || slidingUpPanelLayout.getVisibility() == 8) {
            bVar.mo147138a();
            return;
        }
        slidingUpPanelLayout.mo200904a(new C40736i(slidingUpPanelLayout, bVar));
        if (slidingUpPanelLayout.getPanelState() == SlidingUpPanelLayout.PanelState.EXPANDED) {
            slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
        }
    }

    /* renamed from: a */
    private final void m161161a(String str) {
        PluginEnv cVar;
        View view;
        if (this.f103463d != null && (cVar = this.f103465g.get(str)) != null) {
            IInputSupportAdditionPlugin iInputSupportAdditionPlugin = this.f103464f.get(str);
            if (iInputSupportAdditionPlugin == null) {
                cVar.mo147139a().setVisibility(8);
                return;
            }
            cVar.mo147139a().setVisibility(0);
            iInputSupportAdditionPlugin.mo102078a(cVar.mo147140b());
            Activity activity = this.f103463d;
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            if (!(activity instanceof AbstractC36435f) || !C40682g.m160850a().mo133171a("chat.enter.async.load.xml")) {
                Activity activity2 = this.f103463d;
                if (activity2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                }
                view = iInputSupportAdditionPlugin.mo102075a(activity2, cVar.mo147139a());
            } else {
                if (iInputSupportAdditionPlugin.mo102073a() == 0) {
                    Activity activity3 = this.f103463d;
                    if (activity3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                    }
                    iInputSupportAdditionPlugin.mo102075a(activity3, cVar.mo147139a());
                }
                Activity activity4 = this.f103463d;
                if (activity4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                }
                Activity activity5 = this.f103463d;
                if (activity5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                }
                if (activity5 != null) {
                    AbstractC36434e a = ((AbstractC36435f) activity5).mo129674a();
                    Activity activity6 = this.f103463d;
                    if (activity6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                    }
                    View a2 = a.mo134293a(activity6, iInputSupportAdditionPlugin.mo102073a(), cVar.mo147139a());
                    Intrinsics.checkExpressionValueIsNotNull(a2, "(mActivity as IAsyncInfl…ayoutId(), env.container)");
                    view = iInputSupportAdditionPlugin.mo102074a(activity4, a2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.asyncInflater.IAsyncInflaterOwner");
                }
            }
            cVar.mo147139a().addView(view);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.Map<java.lang.String, com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo147132a(Pair<? extends IInputSupportAdditionPlugin, String> pair) {
        Intrinsics.checkParameterIsNotNull(pair, "pluginPair");
        this.f103464f.put(pair.getSecond(), pair.getFirst());
        this.f103466h.add(pair);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$reset$1$1", "Lcom/ss/android/lark/widget/slidingup/SlidingUpPanelLayout$PanelSlideListener;", "onPanelSlide", "", "panel", "Landroid/view/View;", "slideOffset", "", "onPanelStateChanged", "previousState", "Lcom/ss/android/lark/widget/slidingup/SlidingUpPanelLayout$PanelState;", "newState", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.g$i */
    public static final class C40736i implements SlidingUpPanelLayout.AbstractC59138b {

        /* renamed from: a */
        final /* synthetic */ SlidingUpPanelLayout f103480a;

        /* renamed from: b */
        final /* synthetic */ IPopPanelResetCallback f103481b;

        @Override // com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.AbstractC59138b
        /* renamed from: a */
        public void mo147146a(View view, float f) {
        }

        C40736i(SlidingUpPanelLayout slidingUpPanelLayout, IPopPanelResetCallback bVar) {
            this.f103480a = slidingUpPanelLayout;
            this.f103481b = bVar;
        }

        @Override // com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout.AbstractC59138b
        /* renamed from: a */
        public void mo147147a(View view, SlidingUpPanelLayout.PanelState panelState, SlidingUpPanelLayout.PanelState panelState2) {
            if (panelState2 == SlidingUpPanelLayout.PanelState.COLLAPSED) {
                this.f103481b.mo147138a();
                this.f103480a.mo200909b(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo147131a(SlidingUpPanelLayout slidingUpPanelLayout, ConstraintLayout constraintLayout, Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(slidingUpPanelLayout, "popDrawerLayout");
        Intrinsics.checkParameterIsNotNull(constraintLayout, "additionFuncContainer");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f103461b = slidingUpPanelLayout;
        this.f103467i = constraintLayout;
        this.f103463d = activity;
        this.f103468j = i;
        m161163f();
        m161162e();
    }
}
