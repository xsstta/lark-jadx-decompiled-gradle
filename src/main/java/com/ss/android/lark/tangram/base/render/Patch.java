package com.ss.android.lark.tangram.base.render;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.tangram.base.node.BaseVirtualNode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/tangram/base/render/Patch;", "", "()V", "Companion", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.e.c */
public final class Patch {

    /* renamed from: a */
    public static final Companion f136649a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/tangram/base/render/Patch$Companion;", "", "()V", "TAG", "", "applyPatchToView", "", "renderTree", "Lcom/ss/android/lark/tangram/base/render/RenderTree;", "Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "view", "Landroid/view/View;", "isFromUpdate", "", "buildRenderTree", "node", "fixParentOriginAndIsHidden", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.tangram.base.e.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final void m214790b(BaseVirtualNode aVar) {
            int size = aVar.mo188760d().size();
            for (int i = 0; i < size; i++) {
                RectF m = aVar.mo188772m();
                aVar.mo188760d().get(i).mo188745a(new PointF(m.left, m.top));
                if (aVar.mo188754b()) {
                    aVar.mo188760d().get(i).mo188751a(true);
                }
            }
        }

        /* renamed from: a */
        public final RenderTree<BaseVirtualNode> mo188790a(BaseVirtualNode aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "node");
            RenderTree<BaseVirtualNode> fVar = new RenderTree<>(aVar);
            ArrayList<BaseVirtualNode> d = aVar.mo188760d();
            int i = 0;
            while (i < d.size()) {
                if (!d.get(i).mo188781v()) {
                    i++;
                } else if (d.get(i).mo188760d().isEmpty()) {
                    Intrinsics.checkExpressionValueIsNotNull(d.remove(i), "children.removeAt(idx)");
                } else if (d.get(i).mo188760d().size() == 1) {
                    RectF m = d.get(i).mo188772m();
                    d.get(i).mo188760d().get(0).mo188745a(new PointF(m.left, m.top));
                    if (d.get(i).mo188754b()) {
                        d.get(i).mo188760d().get(0).mo188751a(true);
                    }
                    d.set(i, d.get(i).mo188760d().get(0));
                } else {
                    BaseVirtualNode aVar2 = d.get(i);
                    Intrinsics.checkExpressionValueIsNotNull(aVar2, "children[idx]");
                    m214790b(aVar2);
                    ArrayList<BaseVirtualNode> d2 = d.get(i).mo188760d();
                    d.remove(i);
                    d.addAll(i, d2);
                }
            }
            Iterator<BaseVirtualNode> it = d.iterator();
            while (it.hasNext()) {
                BaseVirtualNode next = it.next();
                if (!next.mo188754b()) {
                    ArrayList<RenderTree<BaseVirtualNode>> a = fVar.mo188793a();
                    Intrinsics.checkExpressionValueIsNotNull(next, "child");
                    a.add(mo188790a(next));
                }
            }
            return fVar;
        }

        /* renamed from: a */
        public final void mo188791a(RenderTree<BaseVirtualNode> fVar, View view, boolean z) {
            Intrinsics.checkParameterIsNotNull(fVar, "renderTree");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Log.i("Patch", "applyPatchToView isFromUpdate: " + z);
            if (fVar.mo188794b().mo188755b(view)) {
                if (!z || fVar.mo188794b().mo188767h()) {
                    fVar.mo188794b().mo188757c(view);
                    fVar.mo188794b().mo188774o();
                }
                if (!fVar.mo188794b().mo188771l() && (view instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewTree gVar = new ViewTree(viewGroup);
                    int size = fVar.mo188793a().size();
                    for (int i = 0; i < size; i++) {
                        BaseVirtualNode b = fVar.mo188793a().get(i).mo188794b();
                        int a = gVar.mo188795a(b.mo188777r());
                        if (a >= 0) {
                            if (a != i) {
                                gVar.mo188796a(a, i);
                            }
                            View childAt = viewGroup.getChildAt(i);
                            view.setTag(R.id.virtual_node_id, b.mo188776q());
                            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                            b.mo188747a(childAt);
                        } else {
                            View n = b.mo188773n();
                            if (n != null) {
                                gVar.mo188797a(n, i);
                                b.mo188747a(n);
                            }
                        }
                    }
                    while (size < viewGroup.getChildCount()) {
                        View childAt2 = viewGroup.getChildAt(size);
                        Intrinsics.checkExpressionValueIsNotNull(childAt2, "view.getChildAt(count)");
                        if (childAt2.getVisibility() == 0) {
                            viewGroup.removeViewAt(size);
                        }
                    }
                    int size2 = fVar.mo188793a().size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        RenderTree<BaseVirtualNode> fVar2 = fVar.mo188793a().get(i2);
                        Intrinsics.checkExpressionValueIsNotNull(fVar2, "renderTree.children[i]");
                        View childAt3 = viewGroup.getChildAt(i2);
                        Intrinsics.checkExpressionValueIsNotNull(childAt3, "view.getChildAt(i)");
                        mo188791a(fVar2, childAt3, z);
                    }
                }
            }
        }
    }
}
