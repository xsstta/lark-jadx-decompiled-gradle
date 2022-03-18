package com.lynx.tasm.behavior.shadow;

/* renamed from: com.lynx.tasm.behavior.shadow.i */
public class C26708i {

    /* renamed from: a */
    private LayoutNode f66105a;

    /* renamed from: a */
    public float mo94820a() {
        LayoutNode layoutNode = this.f66105a;
        return layoutNode.nativeGetWidth(layoutNode.mo94789f());
    }

    /* renamed from: b */
    public float mo94821b() {
        LayoutNode layoutNode = this.f66105a;
        return layoutNode.nativeGetHeight(layoutNode.mo94789f());
    }

    /* renamed from: c */
    public int[] mo94822c() {
        LayoutNode layoutNode = this.f66105a;
        return layoutNode.nativeGetMargin(layoutNode.mo94789f());
    }

    public C26708i(LayoutNode layoutNode) {
        this.f66105a = layoutNode;
    }
}
