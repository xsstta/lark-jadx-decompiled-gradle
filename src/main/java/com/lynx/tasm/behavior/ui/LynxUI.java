package com.lynx.tasm.behavior.ui;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.ViewCompat;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.animation.C26562a;
import com.lynx.tasm.animation.p1217a.C26563a;
import com.lynx.tasm.animation.p1218b.C26575c;
import com.lynx.tasm.animation.p1219c.C26585a;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.p1222b.C26625a;
import com.lynx.tasm.behavior.p1222b.C26630b;
import com.lynx.tasm.behavior.ui.text.AndroidText;
import com.lynx.tasm.behavior.ui.utils.C26828a;
import com.lynx.tasm.behavior.ui.utils.C26830c;
import com.lynx.tasm.behavior.ui.utils.C26836h;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;

public abstract class LynxUI<T extends View> extends LynxBaseUI {
    protected static final boolean ac;

    /* renamed from: Z */
    public T f66253Z;

    /* renamed from: a */
    private C26828a f66254a;
    protected float aa;
    protected List<LynxUI> ab;

    /* renamed from: b */
    private boolean f66255b;

    /* renamed from: c */
    private C26625a f66256c;

    /* renamed from: d */
    private C26563a f66257d;

    /* renamed from: e */
    private C26575c f66258e;

    /* renamed from: f */
    private C26585a f66259f;

    /* renamed from: g */
    private int f66260g;

    /* renamed from: h */
    private boolean f66261h;

    /* renamed from: i */
    private boolean f66262i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo95055a(Context context, Object obj) {
        return null;
    }

    public LynxUI aB() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public T mo33942b(Context context) {
        return null;
    }

    public C26828a aA() {
        return this.f66254a;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public C26585a aj() {
        return this.f66259f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public C26575c al() {
        return this.f66258e;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int as() {
        return this.f66260g;
    }

    public T av() {
        return this.f66253Z;
    }

    public boolean aw() {
        return this.f66261h;
    }

    public C26563a ax() {
        return this.f66257d;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: y */
    public boolean mo95043y() {
        return this.f66255b;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: G */
    public float mo94924G() {
        return this.f66253Z.getTranslationX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: H */
    public float mo94925H() {
        return this.f66253Z.getTranslationY();
    }

    public void aC() {
        this.f66256c.mo94580a();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void ai() {
        C26563a aVar = this.f66257d;
        if (aVar != null) {
            aVar.mo94419h();
        }
    }

    public int az() {
        return this.f66254a.mo95536d();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.AbstractC26757c
    /* renamed from: v */
    public void mo95040v() {
        this.f66253Z.requestLayout();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.AbstractC26757c
    /* renamed from: w */
    public void mo95041w() {
        this.f66253Z.invalidate();
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        ac = z;
    }

    /* renamed from: d */
    private void mo53300d() {
        if (this.f66257d == null) {
            this.f66257d = new C26563a(this.f66253Z, this);
        }
    }

    /* renamed from: e */
    private void mo53301e() {
        if (this.f66258e == null) {
            this.f66258e = new C26575c();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void U_() {
        super.U_();
        if (this.f66262i) {
            at();
            this.f66262i = false;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean ak() {
        C26575c cVar = this.f66258e;
        if (cVar == null || !cVar.mo94447g()) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void an() {
        super.an();
        C26563a aVar = this.f66257d;
        if (aVar != null) {
            aVar.mo94417f();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float ao() {
        T t = this.f66253Z;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleX();
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float ap() {
        T t = this.f66253Z;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: I */
    public float mo94926I() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f66253Z.getTranslationZ();
        }
        return this.f66254a.mo95520b();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void T_() {
        super.T_();
        C26563a aVar = this.f66257d;
        if (aVar != null) {
            aVar.mo94418g();
        }
        C26575c cVar = this.f66258e;
        if (cVar != null) {
            cVar.mo94443c();
        }
    }

    public boolean aD() {
        C26585a aVar;
        T t;
        C26563a aVar2 = this.f66257d;
        if ((aVar2 == null || !aVar2.mo94420i()) && (((aVar = this.f66259f) == null || !aVar.mo94464d()) && ((t = this.f66253Z) == null || t.getAnimation() == null))) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void ah() {
        String str = "LynxUI." + mo94919B() + "measure";
        TraceEvent.m96443a(str);
        ay();
        this.f66253Z.measure(View.MeasureSpec.makeMeasureSpec(mo94937T(), 1073741824), View.MeasureSpec.makeMeasureSpec(mo94938U(), 1073741824));
        TraceEvent.m96444b(str);
    }

    /* access modifiers changed from: protected */
    public void ay() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams a;
        if (this.f66241v != null && (this.f66241v instanceof UIGroup) && ((UIGroup) this.f66241v).needCustomLayout() && (a = ((UIGroup) this.f66241v).mo53895a((layoutParams = this.f66253Z.getLayoutParams()))) != null && layoutParams != a) {
            mo95069b(a);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: z */
    public void mo95044z() {
        super.mo95044z();
        T a = mo95055a(this.f66239t, this.f66240u);
        this.f66253Z = a;
        if (a == null) {
            this.f66253Z = mo33942b(this.f66239t);
        }
        if (this.f66253Z != null) {
            this.f66256c = new C26625a(this);
            C26828a aVar = new C26828a(this, mo95039u());
            this.f66254a = aVar;
            mo94957a((C26830c) aVar);
            this.f66254a.mo95529a(this.f66216V);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void at() {
        if (!aD()) {
            this.f66254a.mo95519a(this.f66210P);
            if (this.aa != this.f66253Z.getAlpha()) {
                this.f66253Z.setAlpha(this.aa);
                if (mo94920C() instanceof UIShadowProxy) {
                    ((UIShadowProxy) mo94920C()).setAlpha(this.aa);
                }
            }
            if (this.f66215U != az()) {
                this.f66243x.mo95523a(this.f66215U);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        boolean z;
        super.mo53258a();
        if (mo94936S() == null || (mo94936S().width() > 0 && mo94936S().height() > 0)) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f66255b) {
            this.f66253Z.setVisibility(0);
        } else if (!z) {
            this.f66253Z.setVisibility(8);
        }
        if (this.f66211Q != null && this.f66211Q.mo95545a() && this.f66211Q.mo95550f()) {
            this.f66254a.mo95518a(this.f66211Q);
        }
        C26585a aVar = this.f66259f;
        if ((aVar == null || !aVar.mo94458a(4096) || !this.f66259f.mo94462b()) && C26836h.m97578a(this.f66210P)) {
            this.f66254a.mo95519a(this.f66210P);
        }
        C26563a aVar2 = this.f66257d;
        if (aVar2 != null && aVar2.mo94407a()) {
            this.f66257d.mo94406a(true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: j */
    public void mo53306j() {
        String str = "LynxUI." + mo94919B() + ".layout";
        TraceEvent.m96443a(str);
        String str2 = str + ".mView";
        TraceEvent.m96443a(str2);
        this.f66253Z.layout(mo94940W(), mo94939V(), mo94940W() + mo94937T(), mo94939V() + mo94938U());
        TraceEvent.m96444b(str2);
        if (mo94920C() instanceof UIShadowProxy) {
            ((UIShadowProxy) mo94920C()).mo53305i();
        }
        if (this.f66253Z.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.f66253Z.getParent();
            if (mo94930M() != 0) {
                viewGroup.setClipChildren(false);
            }
            ViewCompat.m4038a(this.f66253Z, mo94931N());
            if (Build.VERSION.SDK_INT < 18 && aD() && (mo94920C() instanceof LynxUI) && ((LynxUI) mo94920C()).mo94930M() != 0) {
                viewGroup.setClipChildren(false);
            }
        }
        if (mo94930M() != 0 && (mo94937T() == 0 || mo94938U() == 0)) {
            T t = this.f66253Z;
            if (t instanceof AndroidText) {
                ((AndroidText) t).setOverflow(mo94930M());
            }
        }
        TraceEvent.m96444b(str);
    }

    public LynxUI(Context context) {
        this((AbstractC26684l) context);
    }

    /* renamed from: b */
    public void mo95070b(C26562a aVar) {
        this.f66256c.mo94581a(aVar);
    }

    /* renamed from: c */
    public void mo95071c(C26562a aVar) {
        this.f66256c.mo94586b(aVar);
    }

    /* renamed from: d */
    public void mo95073d(C26562a aVar) {
        this.f66256c.mo94588c(aVar);
    }

    /* renamed from: e */
    public void mo95074e(C26562a aVar) {
        this.f66256c.mo94589d(aVar);
    }

    @LynxProp(name = "layout-animation-update-delay")
    public void setLayoutAnimationUpdateDelay(String str) {
        LLog.m96429e("LynxUI", "setLayoutAnimationUpdateTimingFunc(String) is deprecated.This has no effect.");
    }

    @LynxProp(name = "shared-element")
    public void setShareElement(String str) {
        this.f66256c.mo94587b(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @LynxProp(name = "lynx-test-tag")
    public void setTestID(String str) {
        this.f66253Z.setTag(str);
    }

    public LynxUI(AbstractC26684l lVar) {
        this(lVar, null);
    }

    /* renamed from: a */
    public void mo95056a(C26562a aVar) {
        mo53300d();
        this.f66257d.mo94405a(aVar);
    }

    /* renamed from: b */
    public ReadableMap mo95068b(String str) {
        if (this.f66239t instanceof AbstractC26684l) {
            return this.f66239t.mo94676c(str);
        }
        return null;
    }

    /* renamed from: c */
    public void mo95072c(String str) {
        this.f66256c.mo94584a(str);
    }

    @LynxProp(name = "animation-delay")
    public void setAnimationDelay(double d) {
        mo53300d();
        this.f66257d.mo94411b((long) d);
    }

    @LynxProp(name = "animation-direction")
    public void setAnimationDirection(int i) {
        mo53300d();
        this.f66257d.mo94410b(i);
    }

    @LynxProp(name = "animation-duration")
    public void setAnimationDuration(double d) {
        mo53300d();
        this.f66257d.mo94403a((long) d);
    }

    @LynxProp(name = "animation-fill-mode")
    public void setAnimationFillMode(int i) {
        mo53300d();
        this.f66257d.mo94413c(i);
    }

    @LynxProp(name = "animation-iteration-count")
    public void setAnimationIterationCount(int i) {
        mo53300d();
        this.f66257d.mo94402a(i);
    }

    @LynxProp(name = "animation-name")
    public void setAnimationName(String str) {
        if (str == null) {
            this.f66262i = true;
        }
        mo53300d();
        this.f66257d.mo94408a(str);
    }

    @LynxProp(name = "animation-play-state")
    public void setAnimationPlayState(int i) {
        mo53300d();
        this.f66257d.mo94414d(i);
    }

    @LynxProp(name = "animation-timing-function")
    public void setAnimationTimingFunction(ReadableArray readableArray) {
        mo53300d();
        this.f66257d.mo94404a(readableArray);
    }

    @LynxProp(name = "enter-transition-name")
    public void setEnterTransitionName(ReadableArray readableArray) {
        C26562a a = C26562a.m96287a(readableArray);
        if (a != null) {
            C26630b.m96516b().mo94596a(this, a);
        }
    }

    @LynxProp(name = "exit-transition-name")
    public void setExitTransitionName(ReadableArray readableArray) {
        C26562a a = C26562a.m96287a(readableArray);
        if (a != null) {
            C26630b.m96516b().mo94600b(this, a);
        }
    }

    @LynxProp(name = "layout-animation-create-delay")
    public void setLayoutAnimationCreateDelay(double d) {
        mo53301e();
        this.f66258e.mo94444d().mo94432a((long) d);
    }

    @LynxProp(name = "layout-animation-create-duration")
    public void setLayoutAnimationCreateDuration(double d) {
        mo53301e();
        this.f66258e.mo94444d().mo94436b((long) d);
    }

    @LynxProp(name = "layout-animation-create-property")
    public void setLayoutAnimationCreateProperty(int i) {
        mo53301e();
        this.f66258e.mo94444d().mo94431a(i);
    }

    @LynxProp(name = "layout-animation-create-timing-function")
    public void setLayoutAnimationCreateTimingFunc(ReadableArray readableArray) {
        mo53301e();
        this.f66258e.mo94444d().mo94433a(readableArray);
    }

    @LynxProp(name = "layout-animation-delete-delay")
    public void setLayoutAnimationDeleteDelay(double d) {
        mo53301e();
        this.f66258e.mo94446f().mo94432a((long) d);
    }

    @LynxProp(name = "layout-animation-delete-duration")
    public void setLayoutAnimationDeleteDuration(double d) {
        mo53301e();
        this.f66258e.mo94446f().mo94436b((long) d);
    }

    @LynxProp(name = "layout-animation-delete-property")
    public void setLayoutAnimationDeleteProperty(int i) {
        mo53301e();
        this.f66258e.mo94446f().mo94431a(i);
    }

    @LynxProp(name = "layout-animation-delete-timing-function")
    public void setLayoutAnimationDeleteTimingFunc(ReadableArray readableArray) {
        mo53301e();
        this.f66258e.mo94446f().mo94433a(readableArray);
    }

    @LynxProp(name = "layout-animation-update-delay")
    public void setLayoutAnimationUpdateDelay(double d) {
        mo53301e();
        this.f66258e.mo94445e().mo94432a((long) d);
    }

    @LynxProp(name = "layout-animation-update-duration")
    public void setLayoutAnimationUpdateDuration(double d) {
        mo53301e();
        this.f66258e.mo94445e().mo94436b((long) d);
    }

    @LynxProp(name = "layout-animation-update-property")
    public void setLayoutAnimationUpdateProperty(int i) {
        mo53301e();
        this.f66258e.mo94445e().mo94431a(i);
    }

    @LynxProp(name = "layout-animation-update-timing-function")
    public void setLayoutAnimationUpdateTimingFunc(ReadableArray readableArray) {
        mo53301e();
        this.f66258e.mo94445e().mo94433a(readableArray);
    }

    @LynxProp(name = "overlap")
    public void setOverlap(String str) {
        this.f66261h = !TextUtils.equals(str, "false");
    }

    @LynxProp(name = "pause-transition-name")
    public void setPauseTransitionName(ReadableArray readableArray) {
        C26562a a = C26562a.m96287a(readableArray);
        if (a != null) {
            C26630b.m96516b().mo94602d(this, a);
        }
    }

    @LynxProp(name = "resume-transition-name")
    public void setResumeTransitionName(ReadableArray readableArray) {
        C26562a a = C26562a.m96287a(readableArray);
        if (a != null) {
            C26630b.m96516b().mo94601c(this, a);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @LynxProp(name = "transform-origin")
    public void setTransformOrigin(ReadableArray readableArray) {
        super.setTransformOrigin(readableArray);
        this.f66254a.mo95518a(this.f66211Q);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94954a(ReadableMap readableMap) {
        C26585a aVar = this.f66259f;
        if (aVar != null) {
            aVar.mo94461b(readableMap);
        }
        C26585a aVar2 = new C26585a(aB());
        this.f66259f = aVar2;
        if (!aVar2.mo94459a(readableMap)) {
            this.f66259f = null;
        }
    }

    /* renamed from: i */
    public void mo95075i(int i) {
        if (i == 0) {
            this.f66255b = true;
            this.f66253Z.setVisibility(0);
        } else if (i == 4) {
            this.f66255b = false;
            this.f66253Z.setVisibility(4);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @LynxProp(name = "accessibility-label")
    public void setAccessibilityLabel(String str) {
        super.setAccessibilityLabel(str);
        T t = this.f66253Z;
        if (t != null) {
            t.setFocusable(true);
            this.f66253Z.setContentDescription(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @LynxProp(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        C26585a aVar = this.f66259f;
        if (aVar == null || !aVar.mo94458a(4096)) {
            this.f66254a.mo95519a(this.f66210P);
        } else {
            this.f66259f.mo94460a(this, 4096, this.f66210P);
        }
    }

    /* renamed from: a */
    public void mo95057a(C26630b.AbstractC26634b bVar) {
        this.f66256c.mo94582a(bVar);
    }

    /* renamed from: b */
    public void mo95069b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = mo94937T();
            layoutParams.height = mo94938U();
            if (layoutParams != this.f66253Z.getLayoutParams()) {
                this.f66253Z.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        throw new RuntimeException("LayoutPrams should not be null");
    }

    @LynxProp(defaultFloat = 1.0f, name = "opacity")
    public void setAlpha(float f) {
        this.aa = f;
        C26585a aVar = this.f66259f;
        if (aVar == null || !aVar.mo94458a(1)) {
            if (f != this.f66253Z.getAlpha()) {
                this.f66253Z.setAlpha(f);
                if (mo94920C() instanceof UIShadowProxy) {
                    ((UIShadowProxy) mo94920C()).setAlpha(f);
                }
            }
            C26575c cVar = this.f66258e;
            if (cVar != null) {
                cVar.mo94439a(f);
                return;
            }
            return;
        }
        this.f66259f.mo94460a(this, 1, Float.valueOf(f));
    }

    @LynxProp(name = "z-index")
    public void setZIndex(int i) {
        if (ac && this.f66260g != i) {
            this.f66260g = i;
            if (!this.f66239t.mo94671a()) {
                UIGroup.m97046a(this.f66253Z, i);
                LynxBaseUI lynxBaseUI = (LynxBaseUI) mo94920C();
                if (lynxBaseUI instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI).aG();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo95058a(C26630b.AbstractC26635c cVar) {
        this.f66256c.mo94583a(cVar);
    }

    @LynxProp(defaultInt = 1, name = "visibility")
    public void setVisibility(int i) {
        C26585a aVar = this.f66259f;
        if (aVar == null || !aVar.mo94458a(SmActions.ACTION_ONTHECALL_EXIT)) {
            int visibility = this.f66253Z.getVisibility();
            if (i == 1) {
                this.f66255b = true;
                this.f66253Z.setVisibility(0);
                visibility = 0;
            } else if (i == 0) {
                this.f66255b = false;
                this.f66253Z.setVisibility(4);
                visibility = 4;
            }
            if (mo94920C() instanceof UIShadowProxy) {
                ((UIShadowProxy) mo94920C()).mo95075i(visibility);
                return;
            }
            return;
        }
        this.f66259f.mo94460a(this, SmActions.ACTION_ONTHECALL_EXIT, Integer.valueOf(i));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53259a(C26697s sVar) {
        ReadableMap readableMap = sVar.f66083a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            char c = 65535;
            try {
                switch (nextKey.hashCode()) {
                    case -1970593579:
                        if (nextKey.equals("lynx-test-tag")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1091287993:
                        if (nextKey.equals("overlap")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1087342188:
                        if (nextKey.equals("shared-element")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 315007413:
                        if (nextKey.equals("accessibility-label")) {
                            c = 0;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    setAccessibilityLabel(readableMap.getString(nextKey));
                } else if (c == 1) {
                    setTestID(readableMap.getString(nextKey));
                } else if (c == 2) {
                    setOverlap(readableMap.getString(nextKey));
                } else if (c == 3) {
                    setShareElement(readableMap.getString(nextKey));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.mo53259a(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94950a(int i, String str) {
        super.mo94950a(i, str);
    }

    public LynxUI(AbstractC26684l lVar, Object obj) {
        super(lVar, obj);
        this.f66255b = true;
        this.f66261h = true;
        this.aa = 1.0f;
        this.ab = new ArrayList();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public boolean mo94992b(int i, int i2) {
        PointF pointF;
        boolean b = super.mo94992b(i, i2);
        if (this.f66213S != null) {
            pointF = new PointF(this.f66213S.f66246a, this.f66213S.f66247b);
        } else {
            pointF = null;
        }
        this.f66254a.mo95517a(pointF);
        return b;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: a */
    public void mo53295a(boolean z, boolean z2) {
        if (!z2) {
            InputMethodManager q = LynxEnv.m96123e().mo94112q();
            if (q == null) {
                LLog.m96427d("LynxUI", "Failed to get InputMethodManager");
            } else if (z) {
                q.showSoftInput(this.f66253Z, 1);
            } else {
                q.hideSoftInputFromWindow(this.f66253Z.getWindowToken(), 0);
            }
        }
    }
}
