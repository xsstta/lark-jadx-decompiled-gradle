package com.ss.android.lark.tangram.base.render;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004R6\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u00028\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/tangram/base/render/RenderTree;", "TreeNode", "", "node", "(Ljava/lang/Object;)V", "children", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "getNode", "()Ljava/lang/Object;", "setNode", "Ljava/lang/Object;", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.e.f */
public final class RenderTree<TreeNode> {

    /* renamed from: a */
    private ArrayList<RenderTree<TreeNode>> f136661a = new ArrayList<>();

    /* renamed from: b */
    private TreeNode f136662b;

    /* renamed from: a */
    public final ArrayList<RenderTree<TreeNode>> mo188793a() {
        return this.f136661a;
    }

    /* renamed from: b */
    public final TreeNode mo188794b() {
        return this.f136662b;
    }

    public RenderTree(TreeNode treenode) {
        Intrinsics.checkParameterIsNotNull(treenode, "node");
        this.f136662b = treenode;
    }
}
