package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u001a\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u0010\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"TOKEN_FAVORITE", "", "TOKEN_SINGLE", "TYPE_FAVORITE_ROOT", "", "TYPE_NONE", "TYPE_REAL", "TYPE_SHORTCUT", "TYPE_SINGLE_ROOT", "TYPE_VIRTUAL_ROOT", "getNodeType", "node", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "isFavoriteRoot", "", "wikiToken", "isNone", "wikiNodeType", "isRoot", "isShortcut", "isSingleRoot", "isVirtualRoot", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.b */
public final class C12459b {
    /* renamed from: a */
    public static final boolean m51815a(int i) {
        return i == -2 || i == -1 || i == 2;
    }

    /* renamed from: b */
    public static final boolean m51817b(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public static final boolean m51819c(int i) {
        return i == -3;
    }

    /* renamed from: d */
    public static final boolean m51820d(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final boolean m51818b(String str) {
        return TextUtils.equals("wikiroot%single", str);
    }

    /* renamed from: a */
    public static final boolean m51816a(String str) {
        return TextUtils.equals("wikiroot%favorite", str);
    }

    /* renamed from: a */
    public static final int m51814a(TreeNode treeNode) {
        Intrinsics.checkParameterIsNotNull(treeNode, "node");
        if (m51815a(treeNode.wiki_node_type)) {
            return WikNodeType.ROOT.getValue();
        }
        if (m51819c(treeNode.wiki_node_type)) {
            return WikNodeType.NONE.getValue();
        }
        if (treeNode.has_child) {
            return WikNodeType.DIR.getValue();
        }
        return WikNodeType.LEAF.getValue();
    }
}
