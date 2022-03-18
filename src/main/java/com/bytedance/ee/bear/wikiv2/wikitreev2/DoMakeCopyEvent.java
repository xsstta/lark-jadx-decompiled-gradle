package com.bytedance.ee.bear.wikiv2.wikitreev2;

import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/DoMakeCopyEvent;", "", "spaceId", "", "parentToken", "newCopy", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;)V", "getNewCopy", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "getParentToken", "()Ljava/lang/String;", "getSpaceId", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.b */
public final class DoMakeCopyEvent {

    /* renamed from: a */
    private final String f33281a;

    /* renamed from: b */
    private final String f33282b;

    /* renamed from: c */
    private final TreeNode f33283c;

    public DoMakeCopyEvent(String str, String str2, TreeNode treeNode) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(str2, "parentToken");
        Intrinsics.checkParameterIsNotNull(treeNode, "newCopy");
        this.f33281a = str;
        this.f33282b = str2;
        this.f33283c = treeNode;
    }
}
