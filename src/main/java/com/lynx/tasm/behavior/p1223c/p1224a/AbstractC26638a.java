package com.lynx.tasm.behavior.p1223c.p1224a;

import android.graphics.Rect;
import androidx.collection.ArrayMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C26690o;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.p1223c.AbstractC26656j;
import com.lynx.tasm.behavior.p1223c.C26637a;
import com.lynx.tasm.behavior.p1223c.C26648b;
import com.lynx.tasm.behavior.p1223c.C26649c;
import com.lynx.tasm.behavior.p1223c.C26650d;
import com.lynx.tasm.behavior.p1223c.C26651e;
import com.lynx.tasm.behavior.p1223c.C26653g;
import com.lynx.tasm.behavior.p1223c.C26654h;
import com.lynx.tasm.behavior.p1223c.C26655i;
import com.lynx.tasm.behavior.p1223c.C26657k;
import com.lynx.tasm.behavior.p1223c.C26658l;
import com.lynx.tasm.behavior.p1223c.C26659m;
import com.lynx.tasm.behavior.p1223c.C26660n;
import com.lynx.tasm.behavior.p1223c.C26661o;
import com.lynx.tasm.p1216a.C26545a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.c.a.a */
public abstract class AbstractC26638a {

    /* renamed from: a */
    protected final C26690o f65939a;

    /* renamed from: b */
    private boolean f65940b;

    /* renamed from: a */
    public void mo94609a() {
        this.f65940b = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94621a(AbstractC26656j jVar);

    /* renamed from: c */
    public void mo94626c() {
    }

    /* renamed from: d */
    public void mo94627d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo94625b() {
        return this.f65940b;
    }

    /* renamed from: a */
    public final void mo94618a(int i, boolean z) {
        mo94621a(new C26657k(i, z));
    }

    /* renamed from: a */
    public final void mo94620a(ReadableMap readableMap) {
        mo94621a(new C26655i(readableMap));
    }

    /* renamed from: a */
    public final void mo94619a(long j) {
        mo94621a(new C26650d(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo94617a(int i, String str, C26697s sVar, Map<String, C26545a> map, boolean z) {
        mo94621a(new C26637a(i, str, sVar, map, z));
    }

    public AbstractC26638a(C26690o oVar) {
        this.f65939a = oVar;
    }

    /* renamed from: a */
    public void mo94610a(int i) {
        mo94621a(new C26661o(i));
    }

    /* renamed from: b */
    public final void mo94623b(long j) {
        mo94621a(new C26649c(j));
    }

    /* renamed from: a */
    private Map<String, C26545a> m96536a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            C26545a aVar = new C26545a(map.getString("name"), map.getString(ShareHitPoint.f121869d), map.getString("function"));
            arrayMap.put(aVar.f65651a, aVar);
        }
        return arrayMap;
    }

    /* renamed from: b */
    public final void mo94624b(ReadableMap readableMap) {
        mo94621a(new C26654h(readableMap));
    }

    /* renamed from: b */
    public final void mo94622b(int i, int i2) {
        mo94621a(new C26648b(i, i2));
    }

    /* renamed from: a */
    public final void mo94612a(int i, int i2) {
        mo94621a(new C26653g(i, i2));
    }

    /* renamed from: a */
    public final void mo94614a(int i, ReadableMap readableMap) {
        mo94621a(new C26659m(i, readableMap));
    }

    /* renamed from: a */
    public final void mo94615a(int i, Object obj) {
        mo94621a(new C26660n(i, obj));
    }

    /* renamed from: a */
    public final void mo94613a(int i, int i2, int i3) {
        mo94621a(new C26651e(i, i2, i3));
    }

    /* renamed from: a */
    public final void mo94616a(int i, String str, ReadableMap readableMap, ReadableArray readableArray, boolean z) {
        C26697s sVar;
        if (readableMap != null) {
            sVar = new C26697s(readableMap);
        } else {
            sVar = null;
        }
        TraceEvent.m96443a("UIOperationQueue.createNode.enqueueCreateView");
        mo94617a(i, str, sVar, m96536a(readableArray), z);
        TraceEvent.m96444b("UIOperationQueue.createNode.enqueueCreateView");
    }

    /* renamed from: a */
    public final void mo94611a(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float[] fArr2, float f17) {
        int i2;
        int i3;
        int i4;
        int i5;
        Rect rect;
        int i6 = (int) f;
        int i7 = (int) f2;
        int i8 = (int) f3;
        int i9 = (int) f4;
        int i10 = (int) f5;
        int i11 = (int) f6;
        int i12 = (int) f7;
        int i13 = (int) f8;
        int i14 = (int) f9;
        int i15 = (int) f10;
        int i16 = (int) f11;
        int i17 = (int) f12;
        int i18 = (int) f13;
        int i19 = (int) f14;
        int i20 = (int) f15;
        int i21 = (int) f16;
        if (fArr != null) {
            i5 = i19;
            i4 = i18;
            i3 = i17;
            i2 = i16;
            rect = new Rect((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        } else {
            i5 = i19;
            i2 = i16;
            i3 = i17;
            i4 = i18;
            rect = null;
        }
        mo94621a(new C26658l(i, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i2, i3, i4, i5, i20, i21, rect, fArr2, f17));
    }
}
