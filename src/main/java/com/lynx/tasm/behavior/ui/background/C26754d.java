package com.lynx.tasm.behavior.ui.background;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26673g;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.background.d */
public class C26754d implements Drawable.Callback {

    /* renamed from: a */
    private List<AbstractC26753c> f66333a = new ArrayList();

    /* renamed from: b */
    private List<C26755e> f66334b = new ArrayList();

    /* renamed from: c */
    private List<Integer> f66335c = new ArrayList();

    /* renamed from: d */
    private List<Integer> f66336d = new ArrayList();

    /* renamed from: e */
    private List<BackgroundRepeat> f66337e = new ArrayList();

    /* renamed from: f */
    private List<C26756f> f66338f = new ArrayList();

    /* renamed from: g */
    private AbstractC26684l f66339g;

    /* renamed from: h */
    private BackgroundDrawable f66340h;

    /* renamed from: i */
    private float f66341i;

    /* renamed from: j */
    private Bitmap.Config f66342j;

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* renamed from: a */
    public boolean mo95173a() {
        return !this.f66333a.isEmpty();
    }

    /* renamed from: b */
    public int mo95174b() {
        if (this.f66336d.isEmpty()) {
            return 1;
        }
        return this.f66336d.get(0).intValue();
    }

    /* renamed from: c */
    public void mo95177c() {
        for (AbstractC26753c cVar : this.f66333a) {
            cVar.mo53848d();
        }
    }

    /* renamed from: d */
    public void mo95179d() {
        for (AbstractC26753c cVar : this.f66333a) {
            cVar.mo53850e();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        this.f66340h.invalidateSelf();
    }

    /* renamed from: a */
    public void mo95168a(Bitmap.Config config) {
        this.f66342j = config;
        List<AbstractC26753c> list = this.f66333a;
        if (list != null) {
            for (AbstractC26753c cVar : list) {
                if (cVar != null) {
                    cVar.mo95162a(this.f66342j);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo95181e(ReadableArray readableArray) {
        this.f66338f.clear();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            this.f66338f.add(new C26756f(readableArray.getDouble(i)));
        }
    }

    /* renamed from: a */
    public void mo95170a(Rect rect) {
        for (AbstractC26753c cVar : this.f66333a) {
            cVar.mo53843a(rect.width(), rect.height());
        }
    }

    /* renamed from: b */
    public void mo95175b(ReadableArray readableArray) {
        this.f66335c.clear();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            int i2 = readableArray.getInt(i);
            if (i2 < 0 || i2 > 2) {
                i2 = 1;
            }
            this.f66335c.add(Integer.valueOf(i2));
        }
    }

    /* renamed from: c */
    public void mo95178c(ReadableArray readableArray) {
        this.f66337e.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                this.f66337e.add(BackgroundRepeat.valueOf(readableArray.getInt(i)));
            }
        }
    }

    /* renamed from: d */
    public void mo95180d(ReadableArray readableArray) {
        this.f66336d.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 < 0 || i2 > 2) {
                    this.f66336d.add(1);
                } else {
                    this.f66336d.add(Integer.valueOf(i2));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo95171a(ReadableArray readableArray) {
        this.f66334b.clear();
        readableArray.size();
        for (int i = 0; i < readableArray.size(); i++) {
            this.f66334b.add(new C26755e(readableArray.getDouble(i)));
        }
    }

    /* renamed from: b */
    public void mo95176b(String str) {
        this.f66333a.clear();
        if (!TextUtils.isEmpty(str)) {
            m97144c(str.trim());
        }
    }

    /* renamed from: a */
    public void mo95172a(String str) {
        this.f66333a.clear();
        if (!TextUtils.isEmpty(str)) {
            m97144c(str.trim());
        }
    }

    /* renamed from: c */
    private void m97144c(String str) {
        AbstractC26753c cVar;
        while (true) {
            if (!str.startsWith("url(") && !str.startsWith("linear-gradient(") && !str.startsWith("radial-gradient(")) {
                return;
            }
            if (str.startsWith("url(")) {
                int indexOf = str.indexOf("url") + 4;
                int indexOf2 = str.indexOf(")");
                if (indexOf >= 4 && indexOf2 >= indexOf) {
                    if (str.charAt(indexOf) == '\"' || str.charAt(indexOf) == '\'') {
                        indexOf++;
                        indexOf2--;
                    }
                    String substring = str.substring(indexOf, indexOf2);
                    if (LynxEnv.m96123e().mo94113r() == null) {
                        cVar = null;
                    } else {
                        cVar = LynxEnv.m96123e().mo94113r().mo53842a(this.f66339g, substring);
                    }
                    if (cVar != null) {
                        cVar.mo95162a(this.f66342j);
                        cVar.setCallback(this);
                        this.f66333a.add(cVar);
                    }
                    int indexOf3 = str.indexOf(",", indexOf2);
                    if (indexOf3 >= 0) {
                        str = str.substring(indexOf3 + 1).trim();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.startsWith("linear-gradient(")) {
                ArrayList arrayList = new ArrayList();
                int a = C26673g.m96600a(str, 16, arrayList);
                if (a != str.length()) {
                    if (arrayList.size() < 2) {
                        LLog.m96429e(LynxKitALogDelegate.f38587a, "setBackgroundImage params error, not support now");
                    } else {
                        this.f66333a.add(new BackgroundLinearGradientLayer(arrayList));
                    }
                    int indexOf4 = str.indexOf(",", a);
                    if (indexOf4 >= 0) {
                        str = str.substring(indexOf4 + 1).trim();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!str.startsWith("radial-gradient(")) {
                continue;
            } else {
                ArrayList arrayList2 = new ArrayList();
                int a2 = C26673g.m96600a(str, 16, arrayList2);
                if (a2 != str.length()) {
                    if (arrayList2.size() < 2) {
                        LLog.m96429e(LynxKitALogDelegate.f38587a, "setBackgroundImage params error, not support now");
                    } else {
                        this.f66333a.add(new BackgroundRadialGradientLayer(arrayList2));
                    }
                    int indexOf5 = str.indexOf(",", a2);
                    if (indexOf5 >= 0) {
                        str = str.substring(indexOf5 + 1).trim();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C26754d(AbstractC26684l lVar, BackgroundDrawable backgroundDrawable, float f) {
        this.f66339g = lVar;
        this.f66340h = backgroundDrawable;
        this.f66341i = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        if (r13 < r5) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
        if (r13 > r5) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0136  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95169a(android.graphics.Canvas r25, android.graphics.RectF r26, android.graphics.RectF r27, android.graphics.RectF r28, android.graphics.RectF r29, android.graphics.Path r30) {
        /*
        // Method dump skipped, instructions count: 701
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.background.C26754d.mo95169a(android.graphics.Canvas, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.Path):void");
    }
}
