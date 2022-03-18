package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p702e.C13659d;
import java.util.HashMap;
import java.util.List;

public class WikiRelation implements NonProguard {
    public boolean fromCache;
    public SpacePerm root_perm_info;
    public SpaceInfo space;
    public Tree tree;
    public SpaceUserPerm user_space_perm;

    public static class Tree implements NonProguard {
        public HashMap<String, List<String>> child_map;
        public HashMap<String, TreeNode> nodes;
        public List<String> root_list;
        public String root_token;
    }

    public boolean isValid() {
        SpaceInfo spaceInfo;
        Tree tree2 = this.tree;
        if (tree2 == null || TextUtils.isEmpty(tree2.root_token) || (spaceInfo = this.space) == null || TextUtils.isEmpty(spaceInfo.space_id)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Result{root_list=" + C13657b.m55424c(this.tree.root_list) + '}';
    }

    public boolean isEmpty() {
        if (C13657b.m55422a(this.tree.nodes) || C13657b.m55422a(this.tree.child_map) || (C13657b.m55421a(this.tree.child_map.get(this.tree.root_token)) && C13657b.m55421a(this.tree.root_list))) {
            return true;
        }
        return false;
    }

    public void checkFree() {
        boolean z;
        if (!C13657b.m55421a(this.tree.child_map.get(this.tree.root_token)) || C13657b.m55421a(this.tree.root_list)) {
            z = false;
        } else {
            z = true;
        }
        C13479a.m54764b("WikiRelation", "checkFree, free: " + z);
        if (z) {
            this.tree.nodes.remove(this.tree.root_token);
            TreeNode createSingleRoot = TreeNode.createSingleRoot(this.space.space_id);
            this.tree.root_token = createSingleRoot.wiki_token;
            this.tree.nodes.put(this.tree.root_token, createSingleRoot);
            C13659d.m55432a(this.tree.root_list, new C13659d.AbstractC13661b() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.$$Lambda$WikiRelation$y0Byb9cjFiVsKvZxc4oq5p7ihQ */

                @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
                public final void accept(Object obj) {
                    WikiRelation.this.lambda$checkFree$0$WikiRelation((String) obj);
                }
            });
            this.tree.child_map.put(this.tree.root_token, this.tree.root_list);
        }
    }

    public /* synthetic */ void lambda$checkFree$0$WikiRelation(String str) {
        this.tree.nodes.get(str).parent_wiki_token = this.tree.root_token;
    }
}
