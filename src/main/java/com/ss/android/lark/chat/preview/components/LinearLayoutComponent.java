package com.ss.android.lark.chat.preview.components;

import com.ss.android.lark.chat.preview.entity.component.property.LinearLayoutProperty;
import com.ss.android.lark.tangram.base.component.ComponentWithDependency;
import com.ss.android.lark.tangram.base.component.LayoutComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.node.BaseVirtualNode;
import com.ss.android.lark.tangram.base.style.TCStyle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/LinearLayoutComponent;", "Lcom/ss/android/lark/tangram/base/component/LayoutComponent;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "Lcom/ss/android/lark/chat/preview/entity/component/property/LinearLayoutProperty;", "props", "style", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "dependency", "(Lcom/ss/android/lark/chat/preview/entity/component/property/LinearLayoutProperty;Lcom/ss/android/lark/tangram/base/style/TCStyle;Lcom/ss/android/lark/tangram/base/dependency/Dependency;)V", "transToVNode", "Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.f */
public final class LinearLayoutComponent extends LayoutComponent<Dependency, LinearLayoutProperty> {
    @Override // com.ss.android.lark.tangram.base.component.IComponent, com.ss.android.lark.tangram.base.component.LayoutComponent
    public BaseVirtualNode av_() {
        TCStyle tCStyle;
        String e = mo188729e();
        String b = mo126266b();
        LinearLayoutProperty clone = ((LinearLayoutProperty) mo188736d()).clone();
        TCStyle h = mo188733h();
        if (h != null) {
            tCStyle = h.clone();
        } else {
            tCStyle = null;
        }
        LinearLayoutVirtualNode gVar = new LinearLayoutVirtualNode(e, b, clone, tCStyle);
        ArrayList g = mo188732g();
        if (g != null) {
            ArrayList<ComponentWithDependency> arrayList = g;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (ComponentWithDependency aVar : arrayList) {
                arrayList2.add(aVar.av_());
            }
            gVar.mo188750a(new ArrayList<>(arrayList2));
        }
        gVar.mo188753b(mo188735c());
        return gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinearLayoutComponent(LinearLayoutProperty linearLayoutProperty, TCStyle tCStyle, Dependency aVar) {
        super(linearLayoutProperty, tCStyle, aVar);
        Intrinsics.checkParameterIsNotNull(linearLayoutProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }
}
