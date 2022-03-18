package com.ss.android.lark.tangram.base.component;

import android.graphics.RectF;
import android.view.View;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.BaseVirtualNode;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.tangram.base.node.RenderVirtualNode;
import com.ss.android.lark.tangram.base.props.Props;
import com.ss.android.lark.tangram.base.style.TCStyle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u00072\b\u0012\u0004\u0012\u0002H\u00050\bB/\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00028\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010!\u001a\u00020\u0013H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0004H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u0012\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020)H\u0016J*\u0010*\u001a\u00020%2\"\u0010+\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020-0,j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020-`.J\u0010\u0010/\u001a\u0002002\u0006\u0010(\u001a\u000200H\u0016J\b\u00101\u001a\u000202H\u0016J\u0015\u00103\u001a\u00020%2\u0006\u0010#\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00104J\u0010\u00105\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0004H\u0016J\b\u00106\u001a\u00020\u0013H\u0016R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R&\u0010\t\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000@FX\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00067"}, d2 = {"Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "P", "Lcom/ss/android/lark/tangram/base/props/Props;", "U", "Landroid/view/View;", "D", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode;", "Lcom/ss/android/lark/tangram/base/component/ComponentWithSubDependency;", "props", "style", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/tangram/base/props/Props;Lcom/ss/android/lark/tangram/base/style/TCStyle;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "getAction", "()Lcom/ss/android/lark/tangram/base/action/Action;", "isLeaf", "", "()Z", "setLeaf", "(Z)V", "value", "isSelfSizing", "setSelfSizing", "isVirtualBranch", "setVirtualBranch", "getProps", "()Lcom/ss/android/lark/tangram/base/props/Props;", "setProps", "(Lcom/ss/android/lark/tangram/base/props/Props;)V", "Lcom/ss/android/lark/tangram/base/props/Props;", "canUpdateSize", "canUpdateView", "view", "componentDidMount", "", "componentUnMount", "createView", "size", "Landroid/graphics/RectF;", "setSubLayoutComponents", "components", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/tangram/base/component/ComponentWithDependency;", "Lkotlin/collections/ArrayList;", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "transToVNode", "Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "update", "(Landroid/view/View;)V", "updateView", "willReceiveProps", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.b.e */
public class RenderComponent<P extends Props, U extends View, D extends Dependency> extends ComponentWithSubDependency<D> implements IVirtualNode {

    /* renamed from: a */
    private P f136627a;

    /* renamed from: c */
    private boolean f136628c;

    /* renamed from: d */
    private final Action<U> f136629d;

    @Override // com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        return null;
    }

    @Override // com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public IVirtualNode.RectSize mo126270a(IVirtualNode.RectSize aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        return aVar;
    }

    /* renamed from: a */
    public void mo126263a(U u) {
        Intrinsics.checkParameterIsNotNull(u, "view");
    }

    /* renamed from: a */
    public boolean mo126265a() {
        return false;
    }

    @Override // com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: b */
    public boolean mo126284b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: j */
    public boolean mo188740j() {
        return true;
    }

    @Override // com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: k */
    public void mo188741k() {
    }

    /* renamed from: i */
    public final P mo188739i() {
        return this.f136627a;
    }

    /* renamed from: l */
    public final Action<U> mo188742l() {
        return this.f136629d;
    }

    @Override // com.ss.android.lark.tangram.base.component.IComponent
    public BaseVirtualNode av_() {
        TCStyle tCStyle;
        String e = mo188729e();
        String b = mo126266b();
        RenderComponent<P, U, D> eVar = this;
        TCStyle h = mo188733h();
        if (h != null) {
            tCStyle = h.clone();
        } else {
            tCStyle = null;
        }
        RenderVirtualNode dVar = new RenderVirtualNode(e, b, eVar, tCStyle, this.f136627a.clone());
        ArrayList<ComponentWithDependency<Dp>> g = mo188732g();
        if (g != null) {
            ArrayList<ComponentWithDependency<Dp>> arrayList = g;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().av_());
            }
            dVar.mo188750a(new ArrayList<>(arrayList2));
        }
        dVar.mo188753b(mo126265a());
        dVar.mo188749a(eVar);
        return dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.ArrayList<com.ss.android.lark.tangram.base.b.a<D extends com.ss.android.lark.tangram.base.c.a>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void mo188737b(ArrayList<ComponentWithDependency<D>> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "components");
        mo188731a(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: c */
    public void mo188738c(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f136627a.applyToView(view);
        mo126263a(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RenderComponent(P p, TCStyle tCStyle, D d, Action<U> aVar) {
        super(d, tCStyle);
        boolean z;
        Intrinsics.checkParameterIsNotNull(p, "props");
        Intrinsics.checkParameterIsNotNull(d, "dependency");
        this.f136629d = aVar;
        this.f136627a = p;
        ArrayList<ComponentWithDependency<Dp>> g = mo188732g();
        if (g == null || g.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.f136628c = z;
    }
}
