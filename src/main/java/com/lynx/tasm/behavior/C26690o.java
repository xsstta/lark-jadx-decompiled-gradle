package com.lynx.tasm.behavior;

import android.graphics.Rect;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.animation.p1219c.C26585a;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.core.C26880a;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.utils.C26959m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.lynx.tasm.behavior.o */
public class C26690o {

    /* renamed from: a */
    public final HashMap<Integer, LynxBaseUI> f66055a = new HashMap<>();

    /* renamed from: b */
    private int f66056b = -1;

    /* renamed from: c */
    private UIBody f66057c;

    /* renamed from: d */
    private AbstractC26684l f66058d;

    /* renamed from: e */
    private final HashMap<Integer, LynxBaseUI> f66059e = new HashMap<>();

    /* renamed from: f */
    private final C26636c f66060f;

    /* renamed from: g */
    private boolean f66061g;

    /* renamed from: h */
    private boolean f66062h;

    /* renamed from: c */
    private int m96684c(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    public void mo94714a() {
        this.f66062h = false;
    }

    /* renamed from: a */
    public void mo94737a(long j) {
    }

    /* renamed from: b */
    public void mo94744b() {
        this.f66062h = true;
    }

    /* renamed from: c */
    public void mo94749c() {
        this.f66061g = false;
    }

    /* renamed from: i */
    public UIBody mo94760i() {
        return this.f66057c;
    }

    /* renamed from: j */
    public AbstractC26684l mo94761j() {
        return this.f66058d;
    }

    /* renamed from: a */
    public void mo94724a(int i, C26697s sVar) {
        C26959m.m97973b();
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        String str = "UIOwner.updateProps." + lynxBaseUI.mo94919B();
        TraceEvent.m96443a(str);
        if (sVar != null) {
            if (C26585a.m96387a(sVar)) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    ((UIShadowProxy) lynxBaseUI).mo53300d().mo94954a(sVar.f66083a);
                } else {
                    lynxBaseUI.mo94954a(sVar.f66083a);
                }
            }
            if (lynxBaseUI.aj() != null) {
                lynxBaseUI.aj().mo94456a();
            }
            m96680a(sVar, lynxBaseUI);
            lynxBaseUI.mo53593b(sVar);
        }
        TraceEvent.m96444b(str);
    }

    /* renamed from: a */
    public void mo94725a(int i, Object obj) {
        C26959m.m97973b();
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            String str = "UIOwner.updateViewExtra" + lynxBaseUI.mo94919B();
            TraceEvent.m96443a(str);
            lynxBaseUI.mo94958a(obj);
            TraceEvent.m96444b(str);
        }
    }

    /* renamed from: a */
    public void mo94719a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect, float[] fArr, float f) {
        int i18;
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        C26585a aj = lynxBaseUI.aj();
        String str = "UIOwner.updateLayout." + lynxBaseUI.mo94919B();
        TraceEvent.m96443a(str);
        if (aj != null && aj.mo94463c() && !this.f66061g) {
            aj.mo94457a(lynxBaseUI, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
            this.f66057c.mo95041w();
        } else if (!lynxBaseUI.ak() || this.f66061g || (i == (i18 = this.f66056b) && (i != i18 || !this.f66062h))) {
            lynxBaseUI.mo53590a(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
        } else {
            lynxBaseUI.al().mo94441a(lynxBaseUI instanceof UIShadowProxy ? (LynxUI) ((UIShadowProxy) lynxBaseUI).mo53300d() : (LynxUI) lynxBaseUI, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
            this.f66057c.mo95041w();
        }
        lynxBaseUI.mo94961a(fArr);
        lynxBaseUI.mo94946a(f);
        TraceEvent.m96444b(str);
    }

    /* renamed from: a */
    public synchronized void mo94727a(int i, String str, C26697s sVar, Map<String, C26545a> map, boolean z) {
        String str2 = "UIOwner.createView." + str;
        TraceEvent.m96443a(str2);
        C26959m.m97973b();
        this.f66055a.put(Integer.valueOf(i), m96683b(mo94709a(i, str, map, z), sVar));
        TraceEvent.m96444b(str2);
    }

    /* renamed from: a */
    public UIShadowProxy mo94713a(LynxBaseUI lynxBaseUI, C26697s sVar) {
        UIShadowProxy uIShadowProxy = null;
        if (sVar != null) {
            if (m96682a(sVar)) {
                uIShadowProxy = new UIShadowProxy(this.f66058d, lynxBaseUI);
            }
            lynxBaseUI.mo94994c(sVar);
        }
        return uIShadowProxy;
    }

    /* renamed from: a */
    public void mo94729a(int i, boolean z) {
        LynxUI lynxUI;
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        String str = "UIOwner.updateFlatten." + lynxBaseUI.mo94919B();
        TraceEvent.m96443a(str);
        lynxBaseUI.mo53592b();
        C26622a a = this.f66060f.mo94605a(lynxBaseUI.mo94919B());
        if (z) {
            lynxUI = a.mo94571d(this.f66058d);
        } else {
            lynxUI = a.mo33935a(this.f66058d);
        }
        if (lynxUI == null) {
            lynxUI = a.mo33935a(this.f66058d);
        }
        lynxUI.mo95044z();
        lynxUI.mo94950a(lynxBaseUI.mo94576q(), lynxBaseUI.mo94919B());
        m96683b(lynxUI, new C26697s(lynxBaseUI.mo94923F()));
        this.f66055a.put(Integer.valueOf(lynxBaseUI.mo94576q()), lynxUI);
        TraceEvent.m96444b(str);
    }

    /* renamed from: a */
    public void mo94717a(int i, int i2, int i3) {
        if (this.f66058d.mo94671a()) {
            mo94746b(i, i2, i3);
        } else if (this.f66055a.size() > 0) {
            UIGroup uIGroup = (UIGroup) this.f66055a.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i2));
            if (uIGroup == null || lynxBaseUI == null) {
                throw new RuntimeException("Trying to add unknown ui signature: " + i2);
            }
            String str = "UIOwner.insert." + uIGroup.mo94919B() + "." + lynxBaseUI.mo94919B();
            TraceEvent.m96443a(str);
            uIGroup.mo33940a(lynxBaseUI, i3);
            TraceEvent.m96444b(str);
        }
    }

    /* renamed from: a */
    public void mo94716a(int i, int i2) {
        if (this.f66058d.mo94671a()) {
            mo94745b(i, i2);
        } else if (this.f66055a.size() > 0) {
            UIGroup uIGroup = (UIGroup) this.f66055a.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i2));
            if (uIGroup == null || lynxBaseUI == null) {
                throw new RuntimeException("Trying to remove unknown ui signature: " + i2);
            }
            String str = "UIOwner.remove." + uIGroup.mo94919B() + "." + lynxBaseUI.mo94919B();
            TraceEvent.m96443a(str);
            uIGroup.mo33939a(lynxBaseUI);
            TraceEvent.m96444b(str);
        }
    }

    /* renamed from: b */
    public void mo94748b(long j) {
        LynxBaseUI lynxBaseUI;
        if (j != 0 && (lynxBaseUI = this.f66055a.get(Integer.valueOf(m96684c(j)))) != null) {
            String str = "UIOwner.layoutFinish." + lynxBaseUI.mo94919B();
            TraceEvent.m96443a(str);
            lynxBaseUI.mo94953a(j);
            TraceEvent.m96444b(str);
        }
    }

    /* renamed from: a */
    public LynxBaseUI mo94711a(String str) {
        for (Integer num : this.f66055a.keySet()) {
            LynxBaseUI lynxBaseUI = this.f66055a.get(num);
            if (lynxBaseUI != null && str.equals(lynxBaseUI.mo94933P())) {
                return lynxBaseUI;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94722a(int r10, com.lynx.react.bridge.ReadableArray r11, java.lang.String r12, com.lynx.react.bridge.ReadableMap r13, com.lynx.react.bridge.Callback r14) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.C26690o.mo94722a(int, com.lynx.react.bridge.ReadableArray, java.lang.String, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
    }

    /* renamed from: a */
    public LynxBaseUI mo94712a(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI a;
        if (!(lynxBaseUI == null || lynxBaseUI.mo94934Q() == null || !lynxBaseUI.mo94934Q().equals(str))) {
            return lynxBaseUI;
        }
        if (lynxBaseUI instanceof LynxFlattenUI) {
            lynxBaseUI = lynxBaseUI.ar();
        }
        if (!(lynxBaseUI instanceof UIGroup)) {
            return null;
        }
        UIGroup uIGroup = (UIGroup) lynxBaseUI;
        for (int i = 0; i < uIGroup.aF(); i++) {
            LynxBaseUI a2 = uIGroup.mo95122a(i);
            if (a2.mo94934Q() != null && a2.mo94934Q().equals(str)) {
                return a2;
            }
            if (!(a2.mo94919B().equals("component") || !(a2 instanceof UIGroup) || (a = mo94712a(str, a2)) == null)) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo94728a(int i, String str, boolean z) {
        LynxUI lynxUI;
        String str2 = "UIOwner.createView." + str;
        TraceEvent.m96443a(str2);
        C26959m.m97973b();
        if (this.f66056b >= 0 || !str.equals("page")) {
            C26622a a = this.f66060f.mo94605a(str);
            if (str.equals("raw-text") || str.equals("inline-text")) {
                lynxUI = a.mo94574f(this.f66058d);
            } else if (z) {
                lynxUI = a.mo94571d(this.f66058d);
            } else {
                lynxUI = a.mo33935a(this.f66058d);
            }
            if (lynxUI == null) {
                lynxUI = a.mo33935a(this.f66058d);
            }
        } else {
            lynxUI = this.f66057c;
            this.f66056b = i;
        }
        lynxUI.mo94950a(i, str);
        this.f66055a.put(Integer.valueOf(i), lynxUI);
        TraceEvent.m96444b(str2);
    }

    /* renamed from: a */
    public void mo94739a(int[] iArr, int[] iArr2, int[] iArr3, String[] strArr, boolean[] zArr, int[] iArr4) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr4[i];
            if (i2 == 0) {
                mo94728a(iArr[i], strArr[i], zArr[i]);
            } else if (i2 == 1) {
                mo94752c(iArr2[i], iArr[i], iArr3[i]);
            } else if (i2 == 2) {
                mo94754d(iArr[i]);
            } else if (i2 == 3) {
                mo94756e(iArr[i]);
            } else if (i2 == 4) {
                mo94747b(iArr[i], zArr[i]);
            }
        }
    }

    /* renamed from: a */
    public void mo94721a(int i, int i2, String[] strArr, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int[] iArr3) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94952a(i2, strArr, fArr, fArr2, iArr, iArr2);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94731a(int i, float[] fArr, int[] iArr) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94962a(fArr, iArr);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94715a(int i, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i6, int i7, int i8, int i9) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94947a(f, f2, f3, f4, i2, i3, i4, i5, f5, f6, f7, f8, f9, f10, f11, f12, i6, i7, i8, i9);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94734a(int i, int[] iArr, float[] fArr) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94964a(iArr, fArr);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94720a(int i, int i2, long j, long j2, int i3, int i4, float f, float f2, float f3, float f4, int i5) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94949a(i2, j, j2, i3, i4, f, f2, f3, f4, i5);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94730a(int i, float[] fArr) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94990b(fArr);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94726a(int i, String str, long j, long j2, int i2, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6, int i7) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94959a(str, j, j2, i2, f, f2, f3, f4, i3, i4, i5, i6, i7);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94733a(int i, int[] iArr, float f, int i2, int i3, int i4, int i5) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94963a(iArr, f, i2, i3, i4, i5);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94718a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            String str = "UIOwner.setLayoutData." + lynxBaseUI.mo94919B();
            TraceEvent.m96443a(str);
            lynxBaseUI.mo94988b(i2, i3, i4, i5, i6, i7, i8, i9);
            TraceEvent.m96444b(str);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94735a(int i, int[] iArr, float[] fArr, String str) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94965a(iArr, fArr, str);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94732a(int i, float[] fArr, int[] iArr, int[] iArr2) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.mo94951a(i, fArr, iArr, iArr2);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94723a(int i, ReadableMap readableMap) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            C26697s sVar = null;
            if (readableMap != null) {
                sVar = new C26697s(readableMap);
            }
            lynxBaseUI.mo94998d(sVar);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: a */
    public void mo94736a(int i, String[] strArr, String[] strArr2) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            int length = strArr.length;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            for (int i2 = 0; i2 < length; i2++) {
                javaOnlyMap.putString(strArr[i2], strArr2[i2]);
            }
            lynxBaseUI.mo94998d(new C26697s(javaOnlyMap));
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }

    /* renamed from: g */
    public int mo94758g() {
        return this.f66057c.mo94937T();
    }

    /* renamed from: h */
    public int mo94759h() {
        return this.f66057c.mo94938U();
    }

    /* renamed from: e */
    public void mo94755e() {
        if (this.f66058d.mo94671a()) {
            this.f66057c.mo53305i();
        } else {
            this.f66057c.mo95135o();
        }
    }

    /* renamed from: k */
    public void mo94762k() {
        this.f66061g = true;
        this.f66056b = -1;
        HashMap<Integer, LynxBaseUI> hashMap = this.f66055a;
        if (hashMap != null) {
            hashMap.clear();
        }
        UIBody uIBody = this.f66057c;
        if (uIBody != null) {
            uIBody.mo95109l();
        }
    }

    /* renamed from: d */
    public void mo94753d() {
        for (Map.Entry<Integer, LynxBaseUI> entry : this.f66055a.entrySet()) {
            LynxBaseUI value = entry.getValue();
            if (value != null) {
                value.mo53592b();
            }
        }
    }

    /* renamed from: f */
    public void mo94757f() {
        if (this.f66058d.mo94671a()) {
            this.f66057c.mo53307k();
        } else {
            this.f66057c.mo53301e();
        }
        if (this.f66057c.mo95039u().mo94687i() != null) {
            this.f66057c.mo95039u().mo94687i().mo94073a();
        }
    }

    /* renamed from: a */
    public void mo94738a(UIBody.UIBodyView uIBodyView) {
        this.f66057c.mo95108a(uIBodyView);
    }

    /* renamed from: a */
    public LynxBaseUI mo94708a(int i) {
        HashMap<Integer, LynxBaseUI> hashMap = this.f66055a;
        if (hashMap != null) {
            return hashMap.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: b */
    public LynxBaseUI mo94740b(int i) {
        return this.f66055a.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo94750c(int i) {
        LynxBaseUI a = mo94708a(i);
        if (a == null) {
            LLog.m96429e("LynxUIOwner", "try to validate a not-existing node");
        } else {
            a.am();
        }
    }

    /* renamed from: a */
    private void m96681a(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof UIGroup) {
            int i = 0;
            while (true) {
                UIGroup uIGroup = (UIGroup) lynxBaseUI;
                if (i < uIGroup.aF()) {
                    LynxBaseUI a = uIGroup.mo95122a(i);
                    a.mo53592b();
                    this.f66055a.remove(Integer.valueOf(a.mo94576q()));
                    if (a instanceof UIGroup) {
                        m96681a(a);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public LynxBaseUI mo94741b(String str) {
        for (Integer num : this.f66055a.keySet()) {
            LynxBaseUI lynxBaseUI = this.f66055a.get(num);
            if (lynxBaseUI != null && str.equals(lynxBaseUI.mo94934Q())) {
                return lynxBaseUI;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo94756e(int i) {
        TraceEvent.m96443a("UIOwner.destroy");
        if (this.f66055a.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
            if (lynxBaseUI == null) {
                TraceEvent.m96444b("UIOwner.destroy");
                return;
            }
            LynxBaseUI ar = lynxBaseUI.ar();
            if (ar == null) {
                TraceEvent.m96444b("UIOwner.destroy");
                return;
            }
            ar.mo94995c(lynxBaseUI);
            this.f66055a.remove(Integer.valueOf(i));
            lynxBaseUI.mo53592b();
            m96681a(lynxBaseUI);
        }
        TraceEvent.m96444b("UIOwner.destroy");
    }

    /* renamed from: a */
    private boolean m96682a(C26697s sVar) {
        if (sVar.mo94775a("box-shadow") || sVar.mo94775a("outline-color") || sVar.mo94775a("outline-style") || sVar.mo94775a("outline-width")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo94754d(int i) {
        if (this.f66055a.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                LynxBaseUI ar = lynxBaseUI.ar();
                String str = "UIOwner.remove." + ar.mo94919B() + "." + lynxBaseUI.mo94919B();
                TraceEvent.m96443a(str);
                ar.mo94995c(lynxBaseUI);
                TraceEvent.m96444b(str);
                return;
            }
            throw new RuntimeException("Trying to remove unknown ui signature: " + i);
        }
    }

    /* renamed from: b */
    private LynxBaseUI m96683b(LynxBaseUI lynxBaseUI, C26697s sVar) {
        return mo94710a(lynxBaseUI, mo94713a(lynxBaseUI, sVar), sVar);
    }

    /* renamed from: b */
    public LynxBaseUI mo94742b(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI b;
        if (!(lynxBaseUI == null || lynxBaseUI.mo94935R() == null || !lynxBaseUI.mo94935R().equals(str))) {
            return lynxBaseUI;
        }
        if (lynxBaseUI instanceof LynxFlattenUI) {
            lynxBaseUI = lynxBaseUI.ar();
        }
        if (!(lynxBaseUI instanceof UIGroup)) {
            return null;
        }
        UIGroup uIGroup = (UIGroup) lynxBaseUI;
        for (int i = 0; i < uIGroup.aF(); i++) {
            LynxBaseUI a = uIGroup.mo95122a(i);
            if (a.mo94935R() != null && a.mo94935R().equals(str)) {
                return a;
            }
            if (!(a.mo94919B().equals("component") || !(a instanceof UIGroup) || (b = mo94742b(str, a)) == null)) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo94751c(int i, int i2) {
        TraceEvent.m96443a("UIOwner.destroy");
        if (this.f66055a.size() > 0) {
            UIGroup uIGroup = (UIGroup) this.f66055a.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i2));
            if (uIGroup == null || lynxBaseUI == null) {
                TraceEvent.m96444b("UIOwner.destroy");
                return;
            }
            uIGroup.mo33939a(lynxBaseUI);
            this.f66055a.remove(Integer.valueOf(i2));
            lynxBaseUI.mo53592b();
            m96681a(lynxBaseUI);
        }
        TraceEvent.m96444b("UIOwner.destroy");
    }

    /* renamed from: a */
    private void m96680a(C26697s sVar, LynxBaseUI lynxBaseUI) {
        if (m96682a(sVar)) {
            if (!(sVar.mo94779d("box-shadow") == null && sVar.mo94774a("outline-style", -1) == -1) && !(lynxBaseUI instanceof UIShadowProxy) && lynxBaseUI.mo94920C() != null && !(lynxBaseUI.mo94920C() instanceof UIShadowProxy) && (lynxBaseUI.mo94920C() instanceof UIGroup)) {
                UIGroup uIGroup = (UIGroup) lynxBaseUI.mo94920C();
                int e = uIGroup.mo95132e(lynxBaseUI);
                mo94716a(uIGroup.mo94576q(), lynxBaseUI.mo94576q());
                this.f66055a.remove(Integer.valueOf(lynxBaseUI.mo94576q()));
                UIShadowProxy uIShadowProxy = new UIShadowProxy(this.f66058d, lynxBaseUI);
                this.f66055a.put(Integer.valueOf(uIShadowProxy.mo94576q()), uIShadowProxy);
                if (this.f66058d.mo94671a()) {
                    mo94746b(uIGroup.mo94576q(), uIShadowProxy.mo94576q(), e);
                } else {
                    mo94717a(uIGroup.mo94576q(), uIShadowProxy.mo94576q(), e);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo94745b(int i, int i2) {
        if (this.f66055a.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI2 = this.f66055a.get(Integer.valueOf(i2));
            if (lynxBaseUI == null || lynxBaseUI2 == null) {
                throw new RuntimeException("Trying to remove unknown ui signature: " + i2);
            }
            String str = "UIOwner.remove." + lynxBaseUI.mo94919B() + "." + lynxBaseUI2.mo94919B();
            TraceEvent.m96443a(str);
            lynxBaseUI.mo53261b(lynxBaseUI2);
            TraceEvent.m96444b(str);
        }
    }

    /* renamed from: b */
    public void mo94747b(int i, boolean z) {
        LynxBaseUI lynxBaseUI;
        LynxBaseUI lynxBaseUI2 = this.f66055a.get(Integer.valueOf(i));
        String str = "UIOwner.updateFlatten." + lynxBaseUI2.mo94919B();
        TraceEvent.m96443a(str);
        lynxBaseUI2.mo53592b();
        C26622a a = this.f66060f.mo94605a(lynxBaseUI2.mo94919B());
        if (z) {
            lynxBaseUI = a.mo94571d(this.f66058d);
        } else {
            lynxBaseUI = a.mo33935a(this.f66058d);
        }
        if (lynxBaseUI == null) {
            lynxBaseUI = a.mo33935a(this.f66058d);
        }
        lynxBaseUI.mo95044z();
        lynxBaseUI.mo94950a(lynxBaseUI2.mo94576q(), lynxBaseUI2.mo94919B());
        this.f66055a.put(Integer.valueOf(lynxBaseUI2.mo94576q()), lynxBaseUI);
        TraceEvent.m96444b(str);
    }

    public C26690o(AbstractC26684l lVar, C26636c cVar, UIBody.UIBodyView uIBodyView) {
        this.f66058d = lVar;
        this.f66060f = cVar;
        UIBody uIBody = new UIBody(this.f66058d, uIBodyView);
        this.f66057c = uIBody;
        this.f66058d.mo94665a(uIBody);
        this.f66061g = true;
        this.f66062h = true;
    }

    /* renamed from: c */
    public void mo94752c(int i, int i2, int i3) {
        if (this.f66055a.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI2 = this.f66055a.get(Integer.valueOf(i2));
            if (lynxBaseUI == null || lynxBaseUI2 == null) {
                throw new RuntimeException("Trying to add unknown ui signature: " + i2);
            }
            lynxBaseUI.mo94955a(lynxBaseUI2, this.f66055a.get(Integer.valueOf(i3)));
        }
    }

    /* renamed from: b */
    public void mo94746b(int i, int i2, int i3) {
        if (this.f66055a.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI2 = this.f66055a.get(Integer.valueOf(i2));
            if (lynxBaseUI == null || lynxBaseUI2 == null) {
                throw new RuntimeException("Trying to add unknown ui signature: " + i2);
            }
            String str = "UIOwner.insert." + lynxBaseUI.mo94919B() + "." + lynxBaseUI2.mo94919B();
            TraceEvent.m96443a(str);
            lynxBaseUI.mo53262b(lynxBaseUI2, i3);
            TraceEvent.m96444b(str);
        }
    }

    /* renamed from: a */
    public LynxBaseUI mo94710a(LynxBaseUI lynxBaseUI, UIShadowProxy uIShadowProxy, C26697s sVar) {
        if (sVar != null) {
            lynxBaseUI.mo94928K();
            if (uIShadowProxy != null) {
                lynxBaseUI = uIShadowProxy;
            }
            if (sVar.mo94775a("hasAnimation") && C26585a.m96387a(sVar)) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    ((UIShadowProxy) lynxBaseUI).mo53300d().mo94954a(sVar.f66083a);
                } else {
                    lynxBaseUI.mo94954a(sVar.f66083a);
                }
            }
        }
        return lynxBaseUI;
    }

    /* renamed from: a */
    public LynxBaseUI mo94709a(int i, String str, Map<String, C26545a> map, boolean z) {
        LynxBaseUI lynxBaseUI;
        LynxUI lynxUI;
        if (this.f66056b >= 0 || !str.equals("page")) {
            C26622a a = this.f66060f.mo94605a(str);
            if (z) {
                lynxUI = a.mo94571d(this.f66058d);
            } else {
                lynxUI = a.mo33935a(this.f66058d);
            }
            if (lynxUI == null) {
                lynxUI = a.mo33935a(this.f66058d);
            }
            lynxUI.mo53260a(map);
            lynxBaseUI = lynxUI;
        } else {
            lynxBaseUI = this.f66057c;
            this.f66056b = i;
        }
        lynxBaseUI.mo94950a(i, str);
        return lynxBaseUI;
    }

    /* renamed from: b */
    public Future<Runnable> mo94743b(final int i, final String str, final C26697s sVar, final Map<String, C26545a> map, final boolean z) {
        return C26880a.m97715b().submit(new Callable<Runnable>() {
            /* class com.lynx.tasm.behavior.C26690o.CallableC266911 */

            /* renamed from: a */
            public Runnable call() {
                String str = "UIOwner.createViewAsync." + str;
                TraceEvent.m96443a(str);
                final LynxBaseUI[] lynxBaseUIArr = {C26690o.this.mo94709a(i, str, map, z)};
                final UIShadowProxy a = C26690o.this.mo94713a(lynxBaseUIArr[0], sVar);
                TraceEvent.m96444b(str);
                return new Runnable() {
                    /* class com.lynx.tasm.behavior.C26690o.CallableC266911.RunnableC266921 */

                    public void run() {
                        lynxBaseUIArr[0] = C26690o.this.mo94710a(lynxBaseUIArr[0], a, sVar);
                        C26690o.this.f66055a.put(Integer.valueOf(i), lynxBaseUIArr[0]);
                    }
                };
            }
        });
    }

    /* renamed from: a */
    public long mo94707a(int i, float f, MeasureMode measureMode, float f2, MeasureMode measureMode2) {
        LynxBaseUI lynxBaseUI = this.f66055a.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            return lynxBaseUI.mo94944a(f, measureMode, f2, measureMode2);
        }
        throw new RuntimeException("Trying to operation unknown ui signature: " + i);
    }
}
