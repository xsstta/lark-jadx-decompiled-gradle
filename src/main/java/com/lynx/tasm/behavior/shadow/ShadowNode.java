package com.lynx.tasm.behavior.shadow;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.C26614b;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import java.util.ArrayList;
import javax.annotation.Nullable;

public class ShadowNode extends LayoutNode {

    /* renamed from: a */
    private int f66089a;
    @Nullable

    /* renamed from: b */
    private String f66090b;
    @Nullable

    /* renamed from: c */
    private ArrayList<ShadowNode> f66091c;
    @Nullable

    /* renamed from: d */
    protected AbstractC26684l f66092d;
    @Nullable

    /* renamed from: e */
    protected C26707h f66093e;
    @Nullable

    /* renamed from: f */
    private ShadowNode f66094f;

    /* renamed from: g */
    private boolean f66095g;

    /* renamed from: a */
    public void mo94797a(PaintingContext paintingContext) {
    }

    /* renamed from: g */
    public boolean mo94804g() {
        return false;
    }

    /* renamed from: j */
    public void mo94807j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo94813p() {
    }

    /* renamed from: k */
    public final int mo94808k() {
        return this.f66089a;
    }

    @Nullable
    /* renamed from: l */
    public final ShadowNode mo94809l() {
        return this.f66094f;
    }

    /* renamed from: n */
    public C26707h mo94811n() {
        return this.f66093e;
    }

    public String toString() {
        return this.f66090b;
    }

    /* renamed from: o */
    public final void mo94812o() {
        this.f66095g = true;
        mo94813p();
    }

    /* renamed from: h */
    public final String mo94805h() {
        return (String) C26614b.m96455a(this.f66090b);
    }

    /* renamed from: i */
    public final int mo94806i() {
        ArrayList<ShadowNode> arrayList = this.f66091c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: m */
    public final AbstractC26684l mo94810m() {
        return (AbstractC26684l) C26614b.m96455a(this.f66092d);
    }

    /* renamed from: a */
    private ShadowNode mo67399a() {
        if (!mo94804g()) {
            return this;
        }
        ShadowNode l = mo94809l();
        while (l != null && l.mo94804g()) {
            l = l.mo94809l();
        }
        return l;
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    /* renamed from: d */
    public void mo94787d() {
        if (!this.f66095g) {
            if (!mo94804g()) {
                super.mo94787d();
                return;
            }
            ShadowNode a = mo67399a();
            if (a != null) {
                a.mo94787d();
            }
        }
    }

    /* renamed from: c */
    public void mo94803c(int i) {
        this.f66089a = i;
    }

    /* renamed from: a */
    public void mo94798a(AbstractC26684l lVar) {
        this.f66092d = lVar;
    }

    /* renamed from: a */
    public final void mo94799a(C26697s sVar) {
        PropsUpdater.m97604a(this, sVar);
        mo94807j();
    }

    /* renamed from: a */
    public ShadowNode mo94796a(int i) {
        ArrayList<ShadowNode> arrayList = this.f66091c;
        if (arrayList != null) {
            ShadowNode remove = arrayList.remove(i);
            remove.f66094f = null;
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    /* renamed from: b */
    public final ShadowNode mo94802b(int i) {
        ArrayList<ShadowNode> arrayList = this.f66091c;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    /* renamed from: a */
    public final void mo94801a(String str) {
        this.f66090b = str;
    }

    @LynxProp(name = "vertical-align")
    public void setVerticalAlign(String str) {
        if (this.f66093e == null) {
            this.f66093e = new C26707h();
        }
        if (str == null || str.length() <= 0) {
            this.f66093e.f66103a = 0;
        } else if (str.equals("baseline")) {
            this.f66093e.f66103a = 1;
        } else if (str.equals("sub")) {
            this.f66093e.f66103a = 2;
        } else if (str.equals("super")) {
            this.f66093e.f66103a = 3;
        } else if (str.equals("top")) {
            this.f66093e.f66103a = 4;
        } else if (str.equals("text-top")) {
            this.f66093e.f66103a = 5;
        } else if (str.equals("bottom")) {
            this.f66093e.f66103a = 7;
        } else if (str.equals("text-bottom")) {
            this.f66093e.f66103a = 8;
        } else if (str.equals("middle")) {
            this.f66093e.f66103a = 6;
        } else if (str.endsWith("%")) {
            this.f66093e.f66103a = 9;
            try {
                this.f66093e.f66104b = Float.valueOf(str.substring(0, str.length() - 1)).floatValue() / 100.0f;
            } catch (Throwable unused) {
                this.f66093e.f66104b = BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    /* renamed from: a */
    public void mo94800a(ShadowNode shadowNode, int i) {
        if (shadowNode.mo94809l() == null) {
            if (this.f66091c == null) {
                this.f66091c = new ArrayList<>(4);
            }
            this.f66091c.add(i, shadowNode);
            shadowNode.f66094f = this;
            return;
        }
        throw new RuntimeException("Tried to add child that already has a parent! Remove it from its parent first.");
    }
}
