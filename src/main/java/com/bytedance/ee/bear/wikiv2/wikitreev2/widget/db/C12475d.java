package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db;

import android.text.TextUtils;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12459b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpacePerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceUserPerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikiRelation;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007*\u00020\b\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0003\u001a\u001c\u0010\n\u001a\u00020\b*\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u000b0\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\b\u001a\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"CHILDREN_SPILT", "", "invalidWikiRelation", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/WikiRelation;", "getInvalidWikiRelation", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/WikiRelation;", "getChildren", "", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/db/DBTreeNode;", "toDbRelation", "toDbTreeNode", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "children", "toDbTreeNodes", "toRelation", "wikiToken", "toTreeNode", "toTreeNodes", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.d */
public final class C12475d {
    /* renamed from: a */
    public static final WikiRelation m51880a() {
        return new WikiRelation();
    }

    /* renamed from: a */
    public static final TreeNode m51879a(C12465a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$toTreeNode");
        TreeNode treeNode = new TreeNode();
        treeNode.space_id = aVar.f33400b;
        treeNode.wiki_token = aVar.f33399a;
        treeNode.obj_token = aVar.f33401c;
        treeNode.obj_type = aVar.f33402d;
        treeNode.title = aVar.f33403e;
        treeNode.parent_wiki_token = aVar.f33404f;
        treeNode.sort_id = aVar.f33405g;
        treeNode.wiki_node_type = aVar.f33406h;
        treeNode.origin_wiki_token = aVar.f33407i;
        treeNode.origin_space_id = aVar.f33408j;
        treeNode.is_star = aVar.f33409k;
        treeNode.has_child = aVar.f33412n;
        return treeNode;
    }

    /* renamed from: b */
    public static final List<String> m51885b(C12465a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$getChildren");
        if (TextUtils.isEmpty(aVar.f33410l)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String str = aVar.f33410l;
        Intrinsics.checkExpressionValueIsNotNull(str, "children");
        arrayList.addAll(StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null));
        return arrayList;
    }

    /* renamed from: a */
    public static final List<C12465a> m51883a(WikiRelation wikiRelation) {
        Intrinsics.checkParameterIsNotNull(wikiRelation, "$this$toDbRelation");
        ArrayList arrayList = new ArrayList();
        if (!wikiRelation.isValid()) {
            return arrayList;
        }
        for (TreeNode treeNode : wikiRelation.tree.nodes.values()) {
            Intrinsics.checkExpressionValueIsNotNull(treeNode, "treeNode");
            C12465a a = m51882a(treeNode, wikiRelation.tree.child_map.get(treeNode.wiki_token));
            if (C12459b.m51817b(treeNode.wiki_node_type)) {
                a.f33411m = wikiRelation.space.space_name;
            }
            arrayList.add(a);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List<C12465a> m51884a(List<TreeNode> list) {
        Intrinsics.checkParameterIsNotNull(list, "$this$toDbTreeNodes");
        ArrayList arrayList = new ArrayList();
        for (TreeNode treeNode : list) {
            arrayList.add(m51882a(treeNode, (List<String>) null));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final C12465a m51882a(TreeNode treeNode, List<String> list) {
        String str;
        Intrinsics.checkParameterIsNotNull(treeNode, "$this$toDbTreeNode");
        C12465a aVar = new C12465a();
        aVar.f33400b = treeNode.space_id;
        aVar.f33399a = treeNode.wiki_token;
        aVar.f33401c = treeNode.obj_token;
        aVar.f33402d = treeNode.obj_type;
        aVar.f33403e = treeNode.title;
        aVar.f33404f = treeNode.parent_wiki_token;
        aVar.f33405g = treeNode.sort_id;
        aVar.f33406h = treeNode.wiki_node_type;
        aVar.f33407i = treeNode.origin_wiki_token;
        aVar.f33408j = treeNode.origin_space_id;
        aVar.f33409k = treeNode.is_star;
        if (list != null) {
            str = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
        } else {
            str = null;
        }
        aVar.f33410l = str;
        aVar.f33412n = treeNode.has_child;
        return aVar;
    }

    /* renamed from: a */
    public static final WikiRelation m51881a(List<C12465a> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "$this$toRelation");
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        WikiRelation wikiRelation = new WikiRelation();
        if (list.isEmpty()) {
            return wikiRelation;
        }
        String str2 = null;
        C12465a aVar = null;
        WikiRelation.Tree tree = new WikiRelation.Tree();
        tree.root_token = "";
        tree.root_list = new ArrayList();
        tree.child_map = new HashMap<>();
        tree.nodes = new HashMap<>();
        for (C12465a aVar2 : list) {
            HashMap<String, TreeNode> hashMap = tree.nodes;
            Intrinsics.checkExpressionValueIsNotNull(hashMap, "tree.nodes");
            hashMap.put(aVar2.f33399a, m51879a(aVar2));
            List<String> b = m51885b(aVar2);
            if (!C13657b.m55421a(b)) {
                HashMap<String, List<String>> hashMap2 = tree.child_map;
                Intrinsics.checkExpressionValueIsNotNull(hashMap2, "tree.child_map");
                hashMap2.put(aVar2.f33399a, b);
            }
            if (C12459b.m51817b(aVar2.f33406h)) {
                tree.root_token = aVar2.f33399a;
                tree.root_list = m51885b(aVar2);
                aVar = aVar2;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, TreeNode> hashMap3 = tree.nodes;
            Intrinsics.checkExpressionValueIsNotNull(hashMap3, "tree.nodes");
            if (!hashMap3.containsKey(str)) {
                return wikiRelation;
            }
        }
        SpaceInfo spaceInfo = new SpaceInfo();
        spaceInfo.space_id = list.get(0).f33400b;
        if (aVar != null) {
            str2 = aVar.f33411m;
        }
        spaceInfo.space_name = str2;
        SpaceUserPerm spaceUserPerm = new SpaceUserPerm();
        spaceUserPerm.view_wiki_info = true;
        SpacePerm spacePerm = new SpacePerm();
        spacePerm.can_edit_first_level = true;
        wikiRelation.tree = tree;
        wikiRelation.space = spaceInfo;
        wikiRelation.user_space_perm = spaceUserPerm;
        wikiRelation.root_perm_info = spacePerm;
        wikiRelation.fromCache = true;
        return wikiRelation;
    }
}
