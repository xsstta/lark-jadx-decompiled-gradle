package com.ss.android.lark.tangram.base.component;

import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.BaseVirtualNode;
import com.ss.android.lark.tangram.base.node.LayoutVirtualNode;
import com.ss.android.lark.tangram.base.props.Props;
import com.ss.android.lark.tangram.base.style.TCStyle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ*\u0010\u001c\u001a\u00020\u00192\"\u0010\u001d\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001ej\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b`\u001fJ\b\u0010 \u001a\u00020!H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/ss/android/lark/tangram/base/component/LayoutComponent;", "D", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "P", "Lcom/ss/android/lark/tangram/base/props/Props;", "Lcom/ss/android/lark/tangram/base/component/ComponentWithSubDependency;", "props", "style", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "dependency", "(Lcom/ss/android/lark/tangram/base/props/Props;Lcom/ss/android/lark/tangram/base/style/TCStyle;Lcom/ss/android/lark/tangram/base/dependency/Dependency;)V", "isLeaf", "", "()Z", "setLeaf", "(Z)V", "value", "isSelfSizing", "setSelfSizing", "isVirtualBranch", "setVirtualBranch", "getProps", "()Lcom/ss/android/lark/tangram/base/props/Props;", "Lcom/ss/android/lark/tangram/base/props/Props;", "addSubComponent", "", "component", "Lcom/ss/android/lark/tangram/base/component/ComponentWithDependency;", "setSubComponents", "components", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "transToVNode", "Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.b.d */
public class LayoutComponent<D extends Dependency, P extends Props> extends ComponentWithSubDependency<D> {

    /* renamed from: a */
    private boolean f136625a = true;

    /* renamed from: c */
    private final P f136626c;

    /* renamed from: c */
    public boolean mo188735c() {
        return false;
    }

    /* renamed from: d */
    public final P mo188736d() {
        return this.f136626c;
    }

    @Override // com.ss.android.lark.tangram.base.component.IComponent
    public BaseVirtualNode av_() {
        TCStyle tCStyle;
        String e = mo188729e();
        String b = mo126266b();
        Props clone = this.f136626c.clone();
        TCStyle h = mo188733h();
        if (h != null) {
            tCStyle = h.clone();
        } else {
            tCStyle = null;
        }
        LayoutVirtualNode cVar = new LayoutVirtualNode(e, b, clone, tCStyle);
        ArrayList<ComponentWithDependency<Dp>> g = mo188732g();
        if (g != null) {
            ArrayList<ComponentWithDependency<Dp>> arrayList = g;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().av_());
            }
            cVar.mo188750a(new ArrayList<>(arrayList2));
        }
        cVar.mo188753b(mo188735c());
        return cVar;
    }

    /* renamed from: a */
    public final void mo188734a(ComponentWithDependency<D> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "component");
        if (mo188732g() == null) {
            mo188731a(new ArrayList<>());
        }
        ArrayList<ComponentWithDependency<Dp>> g = mo188732g();
        if (g == null) {
            Intrinsics.throwNpe();
        }
        g.add(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutComponent(P p, TCStyle tCStyle, D d) {
        super(d, tCStyle);
        Intrinsics.checkParameterIsNotNull(p, "props");
        Intrinsics.checkParameterIsNotNull(d, "dependency");
        this.f136626c = p;
    }
}
