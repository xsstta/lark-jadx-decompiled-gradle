package com.lynx.tasm.behavior;

import android.util.SparseArray;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* renamed from: com.lynx.tasm.behavior.r */
public class C26696r {

    /* renamed from: a */
    private final SparseArray<ShadowNode> f66082a = new SparseArray<>();

    /* renamed from: a */
    public SparseArray<ShadowNode> mo94768a() {
        return this.f66082a;
    }

    /* renamed from: a */
    public ShadowNode mo94769a(int i) {
        ShadowNode shadowNode = this.f66082a.get(i);
        this.f66082a.remove(i);
        return shadowNode;
    }

    /* renamed from: b */
    public ShadowNode mo94771b(int i) {
        return this.f66082a.get(i);
    }

    /* renamed from: a */
    public void mo94770a(ShadowNode shadowNode) {
        this.f66082a.put(shadowNode.mo94808k(), shadowNode);
    }
}
