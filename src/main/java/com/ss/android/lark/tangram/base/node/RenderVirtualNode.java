package com.ss.android.lark.tangram.base.node;

import android.graphics.RectF;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.tangram.base.props.Props;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.tangram.engine.TangramNative;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0001H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0001H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0012H\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/tangram/base/node/RenderVirtualNode;", "Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "id", "", "viewTypeIdentity", "ability", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode;", "style", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "props", "Lcom/ss/android/lark/tangram/base/props/Props;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/tangram/base/node/IVirtualNode;Lcom/ss/android/lark/tangram/base/style/TCStyle;Lcom/ss/android/lark/tangram/base/props/Props;)V", "checkMainThread", "", "clone", "createNativeNode", "", "createView", "Landroid/view/View;", "free", "", "isDataChange", "node", "layout", "Landroid/graphics/RectF;", "oriWidth", "", "oriHeight", "merge", "updateView", "view", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.d.d */
public final class RenderVirtualNode extends BaseVirtualNode {
    /* renamed from: x */
    private final boolean m214782x() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        throw new IllegalStateException("render virtual node: updateView is not on main thread!");
    }

    @Override // com.ss.android.lark.tangram.base.node.BaseVirtualNode
    /* renamed from: a */
    public long mo126290a() {
        long newTLNodeNative = TangramNative.newTLNodeNative();
        mo188744a(newTLNodeNative);
        if (mo188759c()) {
            TangramNative.setLayoutFunc(newTLNodeNative, mo188776q());
            ConcurrentHashMap<String, BaseVirtualNode> concurrentHashMap = TangramNative.hashMap;
            Intrinsics.checkExpressionValueIsNotNull(concurrentHashMap, "TangramNative.hashMap");
            concurrentHashMap.put(mo188776q(), this);
        }
        return newTLNodeNative;
    }

    @Override // com.ss.android.lark.tangram.base.node.BaseVirtualNode
    /* renamed from: n */
    public View mo188773n() {
        View view;
        IVirtualNode s = mo188778s();
        if (s != null) {
            view = s.mo126262a(mo188772m());
        } else {
            view = null;
        }
        if (view != null) {
            view.setTag(R.id.virtual_node_id, mo188776q());
        }
        if (view != null) {
            view.setTag(R.id.view_class_name, mo188777r());
        }
        if (!mo188754b()) {
            return view;
        }
        throw new IllegalStateException("render virtual node: createView is hidden!");
    }

    /* renamed from: w */
    public RenderVirtualNode mo188775p() {
        TCStyle tCStyle;
        String q = mo188776q();
        String r = mo188777r();
        IVirtualNode s = mo188778s();
        TCStyle t = mo188779t();
        if (t != null) {
            tCStyle = t.clone();
        } else {
            tCStyle = null;
        }
        RenderVirtualNode dVar = new RenderVirtualNode(q, r, s, tCStyle, mo188780u().clone());
        dVar.mo188763e(mo188781v());
        dVar.mo188745a(mo188769j());
        dVar.mo188746a(mo188768i());
        dVar.mo188751a(mo188754b());
        dVar.mo188753b(mo188759c());
        dVar.mo188758c(mo188766g());
        dVar.mo188761d(mo188767h());
        dVar.mo188748a(mo188762e());
        dVar.mo188752b(mo188765f());
        ArrayList<BaseVirtualNode> d = mo188760d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo188775p());
        }
        dVar.mo188750a(arrayList);
        return dVar;
    }

    @Override // com.ss.android.lark.tangram.base.node.BaseVirtualNode
    /* renamed from: c */
    public void mo188757c(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m214782x();
        if (!mo188755b(view)) {
            return;
        }
        if (mo188754b()) {
            view.setVisibility(8);
            return;
        }
        if (mo188770k()) {
            RectF m = mo188772m();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(UIHelper.dp2px(m.width()), UIHelper.dp2px(m.height()));
            layoutParams.leftMargin = UIHelper.dp2px(m.left);
            layoutParams.topMargin = UIHelper.dp2px(m.top);
            view.setLayoutParams(layoutParams);
        }
        IVirtualNode s = mo188778s();
        if (s != null) {
            s.mo188738c(view);
        }
        view.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RenderVirtualNode(String str, String str2, IVirtualNode bVar, TCStyle tCStyle, Props props) {
        super(str, str2, bVar, tCStyle, props, false);
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "viewTypeIdentity");
        Intrinsics.checkParameterIsNotNull(props, "props");
    }
}
