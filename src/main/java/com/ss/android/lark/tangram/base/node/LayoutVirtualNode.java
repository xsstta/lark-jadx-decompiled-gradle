package com.ss.android.lark.tangram.base.node;

import android.view.View;
import com.ss.android.lark.tangram.base.props.Props;
import com.ss.android.lark.tangram.base.style.TCStyle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\rH\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/tangram/base/node/LayoutVirtualNode;", "P", "Lcom/ss/android/lark/tangram/base/props/Props;", "Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "id", "", "viewTypeIdentity", "props", "style", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/tangram/base/props/Props;Lcom/ss/android/lark/tangram/base/style/TCStyle;)V", "clone", "createView", "Landroid/view/View;", "free", "", "isDataChange", "", "node", "layout", "Landroid/graphics/RectF;", "oriWidth", "", "oriHeight", "merge", "updateView", "view", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.d.c */
public class LayoutVirtualNode<P extends Props> extends BaseVirtualNode {
    @Override // com.ss.android.lark.tangram.base.node.BaseVirtualNode
    /* renamed from: c */
    public void mo188757c(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    @Override // com.ss.android.lark.tangram.base.node.BaseVirtualNode
    /* renamed from: n */
    public View mo188773n() {
        return null;
    }

    @Override // com.ss.android.lark.tangram.base.node.BaseVirtualNode
    /* renamed from: p */
    public BaseVirtualNode mo188775p() {
        LayoutVirtualNode cVar = new LayoutVirtualNode(mo188776q(), mo188777r(), mo188780u(), mo188779t());
        cVar.mo188745a(mo188769j());
        cVar.mo188746a(mo188768i());
        cVar.mo188751a(mo188754b());
        cVar.mo188753b(mo188759c());
        cVar.mo188758c(mo188766g());
        cVar.mo188761d(mo188767h());
        cVar.mo188748a(mo188762e());
        cVar.mo188752b(mo188765f());
        ArrayList<BaseVirtualNode> d = mo188760d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo188775p());
        }
        cVar.mo188750a(arrayList);
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutVirtualNode(String str, String str2, P p, TCStyle tCStyle) {
        super(str, str2, null, tCStyle, p, true);
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "viewTypeIdentity");
        Intrinsics.checkParameterIsNotNull(p, "props");
    }
}
