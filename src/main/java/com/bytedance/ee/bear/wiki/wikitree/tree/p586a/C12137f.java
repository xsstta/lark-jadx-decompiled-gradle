package com.bytedance.ee.bear.wiki.wikitree.tree.p586a;

import android.text.TextUtils;
import com.bytedance.ee.bear.wiki.wikitree.bean.C12075a;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.bean.NodeType;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13659d;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.a.f */
public final class C12137f {

    /* renamed from: a */
    private String f32691a = "Wiki_SpaceEntity";

    /* renamed from: b */
    private final Map<String, TreeNode> f32692b;

    /* renamed from: c */
    private final HomePage f32693c;

    /* renamed from: d */
    private final C12075a f32694d;

    /* renamed from: e */
    private final boolean f32695e;

    public static /* synthetic */ void lambda$JUK1_YRIkWnM2jI7F8nGe4jt6kU(Map map, TreeNode treeNode) {
        m50205a(map, treeNode);
    }

    public static /* synthetic */ boolean lambda$LimM6Kl62F22xskHj4oTYBMVuoQ(TreeNode treeNode, TreeNode treeNode2) {
        return m50207a(treeNode, treeNode2);
    }

    public static /* synthetic */ void lambda$bvL4heIQUlB12dCfmejowDqY8lY(C12137f fVar, TreeNode treeNode) {
        fVar.m50200a(treeNode);
    }

    /* renamed from: b */
    public boolean mo46412b() {
        return this.f32695e;
    }

    /* renamed from: c */
    public C12075a mo46414c() {
        return this.f32694d;
    }

    /* renamed from: h */
    public HomePage mo46425h() {
        return this.f32693c;
    }

    /* renamed from: a */
    public C12136e mo46396a() {
        TreeNode treeNode = this.f32692b.get(mo46419e());
        if (treeNode == null) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.extractPureCore, root node not found. ");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        m50203a(C13659d.m55429a(treeNode.clone()), -1, concurrentHashMap);
        for (TreeNode treeNode2 : concurrentHashMap.values()) {
            treeNode2.expand = false;
        }
        return new C12136e(concurrentHashMap, this.f32693c.clone(), this.f32694d.clone(), this.f32695e);
    }

    /* renamed from: a */
    public boolean mo46408a(String str) {
        return m50210k(str) && mo46412b() && mo46427i(str).level <= 1;
    }

    /* renamed from: a */
    public void mo46398a(String str, int i) {
        if (!m50210k(str)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.increaseChildrenNum, invalid params. ");
        } else {
            this.f32692b.get(str).increaseChildNum(i);
        }
    }

    /* renamed from: a */
    public int mo46394a(String str, double d) {
        if (!m50210k(str)) {
            return -1;
        }
        int i = 0;
        for (TreeNode treeNode : this.f32692b.get(str).child_value) {
            if (treeNode.nodeType != NodeType.HOME && Double.compare(d, treeNode.sort_id) <= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public void mo46397a(String str, double d, TreeNode treeNode) {
        int a = mo46394a(str, d);
        if (a == -1) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.insertChildBySortId, invalid params.");
        }
        mo46399a(str, a, treeNode);
    }

    /* renamed from: a */
    public void mo46400a(String str, TreeNode treeNode) {
        m50202a(str, Integer.MAX_VALUE, C13659d.m55429a(treeNode));
    }

    /* renamed from: a */
    public void mo46404a(String str, List<TreeNode> list) {
        m50202a(str, Integer.MAX_VALUE, list);
    }

    /* renamed from: a */
    public int mo46395a(String str, String str2) {
        if (m50210k(str)) {
            return this.f32692b.get(str).getChildIndex(str2);
        }
        C13479a.m54775e(this.f32691a, "SpaceEntity.getChildPositionInParent, invalid params. ");
        return -1;
    }

    /* renamed from: a */
    public void mo46406a(List<TreeNode> list, String str) {
        if (CollectionUtils.isEmpty(list)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.diffAppendRelation, invalid params. ");
        } else {
            m50204a(list, 0, this.f32692b, str);
        }
    }

    /* renamed from: a */
    public void mo46402a(String str, String str2, int i) {
        if (!m50210k(str) || !m50210k(this.f32692b.get(str).parent) || !m50210k(str2)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.moveNode, invalid params. ");
            return;
        }
        Map<String, TreeNode> map = this.f32692b;
        TreeNode treeNode = map.get(map.get(str).parent);
        TreeNode treeNode2 = this.f32692b.get(str2);
        if (treeNode2.nodeType != NodeType.DIR || mo46426h(treeNode2.wiki_token)) {
            TreeNode removeChild = treeNode.removeChild(str);
            treeNode2.addChildren(i, C13659d.m55429a(removeChild));
            m50201a(removeChild, treeNode2.level + 1);
            return;
        }
        C13479a.m54775e(this.f32691a, "SpaceEntity.moveNodes, destParent type: dir, no children cache. ");
    }

    /* renamed from: a */
    public void mo46403a(String str, String str2, String str3, String str4) {
        if (!m50210k(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.updateAreaId, invalid params. ");
            return;
        }
        TreeNode treeNode = this.f32692b.get(str);
        if (!TextUtils.equals(treeNode.area_id, str2)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.updateAreaId, areaRoot's area_id not equal oldAreaId. ");
            return;
        }
        treeNode.area_id = str3;
        if (treeNode.nodeType != NodeType.DIR) {
            String str5 = this.f32691a;
            C13479a.m54764b(str5, "SpaceEntity.updateAreaId, areaRoot not dir, areaRoot nodeType: " + treeNode.nodeType.name());
            return;
        }
        ArrayList<TreeNode> arrayList = new ArrayList();
        m50206a(this.f32692b, treeNode.wiki_token, (List<TreeNode>) arrayList, true);
        String str6 = this.f32691a;
        C13479a.m54764b(str6, "SpaceEntity.updateAreaId, scope: " + str4 + ", allChildrenSize: " + arrayList.size());
        str4.hashCode();
        if (str4.equals("all")) {
            for (TreeNode treeNode2 : arrayList) {
                treeNode2.area_id = str3;
            }
        } else if (str4.equals("area")) {
            for (TreeNode treeNode3 : arrayList) {
                if (TextUtils.equals(treeNode3.area_id, str2)) {
                    treeNode3.area_id = str3;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo46401a(String str, Double d) {
        if (m50210k(str) && d != null) {
            this.f32692b.get(str).sort_id = d.doubleValue();
        }
    }

    /* renamed from: a */
    public void mo46407a(Map<String, Double> map) {
        if (!CollectionUtils.isEmpty(map)) {
            for (String str : map.keySet()) {
                if (m50210k(str)) {
                    TreeNode treeNode = this.f32692b.get(str);
                    Double d = map.get(str);
                    if (d != null) {
                        treeNode.sort_id = d.doubleValue();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo46405a(String str, boolean z) {
        if (m50210k(str)) {
            TreeNode treeNode = this.f32692b.get(str);
            treeNode.setExpand(z);
            TreeNode treeNode2 = this.f32692b.get(treeNode.parent);
            while (treeNode2 != null) {
                treeNode2.setExpand(true);
                treeNode2 = this.f32692b.get(treeNode2.parent);
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ boolean m50207a(TreeNode treeNode, TreeNode treeNode2) {
        return TextUtils.equals(treeNode2.wiki_token, treeNode.wiki_token);
    }

    /* renamed from: e */
    public String mo46419e() {
        return mo46423g();
    }

    /* renamed from: f */
    public String mo46422f() {
        return this.f32693c.getWikiToken();
    }

    /* renamed from: g */
    public String mo46423g() {
        return this.f32693c.getSpaceId();
    }

    /* renamed from: j */
    public void mo46430j() {
        this.f32692b.clear();
    }

    /* renamed from: d */
    public boolean mo46418d() {
        return !this.f32694d.mo46249c();
    }

    /* renamed from: k */
    public List<TreeNode> mo46431k() {
        return mo46420e(mo46423g());
    }

    /* renamed from: i */
    public boolean mo46428i() {
        if (CollectionUtils.isEmpty(this.f32692b)) {
            return true;
        }
        if (this.f32692b.size() != 1 || this.f32692b.get(mo46423g()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private /* synthetic */ void m50200a(TreeNode treeNode) {
        this.f32692b.remove(treeNode.wiki_token);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m50208b(TreeNode treeNode) {
        this.f32692b.put(treeNode.wiki_token, treeNode);
    }

    /* renamed from: g */
    public boolean mo46424g(String str) {
        return m50210k(str);
    }

    /* renamed from: i */
    public TreeNode mo46427i(String str) {
        return this.f32692b.get(str);
    }

    /* renamed from: k */
    private boolean m50210k(String str) {
        if (TextUtils.isEmpty(str) || this.f32692b.get(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo46415c(String str) {
        if (m50210k(str)) {
            this.f32692b.get(str).setExpand(false);
        }
    }

    /* renamed from: d */
    public void mo46417d(String str) {
        if (m50210k(str)) {
            this.f32692b.get(str).setExpand(true);
        }
    }

    /* renamed from: e */
    public List<TreeNode> mo46420e(String str) {
        ArrayList arrayList = new ArrayList();
        if (!m50210k(str)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.getChildrenDftFlatResult, invalid params. ");
            return arrayList;
        }
        TreeNode treeNode = this.f32692b.get(str);
        if (!CollectionUtils.isEmpty(treeNode.child_value)) {
            for (TreeNode treeNode2 : treeNode.child_value) {
                m50206a(this.f32692b, treeNode2.wiki_token, (List<TreeNode>) arrayList, false);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public TreeNode mo46421f(String str) {
        if (!m50210k(str)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.find1stParent, invalid params. ");
            return null;
        }
        TreeNode treeNode = this.f32692b.get(str);
        while (treeNode != null && treeNode.level != 1) {
            treeNode = this.f32692b.get(treeNode.parent);
        }
        return treeNode;
    }

    /* renamed from: h */
    public boolean mo46426h(String str) {
        if (!m50210k(str)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.hasNodeChildrenCache, invalid params. ");
            return false;
        }
        TreeNode treeNode = this.f32692b.get(str);
        if (treeNode.child_num <= 0 || CollectionUtils.isEmpty(treeNode.child_value)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public List<TreeNode> mo46429j(String str) {
        ArrayList arrayList = new ArrayList();
        if (!m50210k(str)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.getNodeChildren, invalid params. ");
            return arrayList;
        }
        arrayList.addAll(this.f32692b.get(str).child_value);
        return arrayList;
    }

    /* renamed from: b */
    public TreeNode mo46409b(String str) {
        if (!m50210k(str) || !m50210k(this.f32692b.get(str).parent)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.removeNode, invalid params. ");
            return null;
        }
        Map<String, TreeNode> map = this.f32692b;
        TreeNode removeChild = map.get(map.get(str).parent).removeChild(str);
        ArrayList arrayList = new ArrayList();
        m50206a(this.f32692b, removeChild.wiki_token, (List<TreeNode>) arrayList, true);
        C13659d.m55432a(arrayList, new C13659d.AbstractC13661b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$f$bvL4heIQUlB12dCfmejowDqY8lY */

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
            public final void accept(Object obj) {
                C12137f.lambda$bvL4heIQUlB12dCfmejowDqY8lY(C12137f.this, (TreeNode) obj);
            }
        });
        return removeChild;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m50209b(TreeNode treeNode, TreeNode treeNode2) {
        m50201a(treeNode2, treeNode.level + 1);
    }

    /* renamed from: a */
    private static /* synthetic */ void m50205a(Map map, TreeNode treeNode) {
        TreeNode treeNode2 = (TreeNode) map.put(treeNode.wiki_token, treeNode);
    }

    /* renamed from: b */
    public boolean mo46413b(String str, String str2) {
        if (!m50210k(str) || !TextUtils.equals(this.f32692b.get(str).area_id, str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m50199a(HomePage homePage, List<TreeNode> list) {
        if (!mo46412b() || mo46418d()) {
            list.add(0, TreeNode.createHome(homePage.getWikiToken(), homePage.getObjType(), homePage.getObjToken(), homePage.getSpaceId()));
        }
        TreeNode createRoot = TreeNode.createRoot(homePage.getSpaceId());
        createRoot.addChildren(list);
        this.f32692b.put(createRoot.wiki_token, createRoot);
        m50203a(list, 0, this.f32692b);
    }

    /* renamed from: c */
    public boolean mo46416c(String str, String str2) {
        if (!m50210k(str) || !m50210k(str2)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.isContainInParent, invalid params. ");
            return false;
        }
        TreeNode treeNode = this.f32692b.get(str2);
        while (treeNode != null) {
            if (TextUtils.equals(treeNode.wiki_token, str)) {
                return true;
            }
            treeNode = this.f32692b.get(treeNode.parent);
        }
        return false;
    }

    public C12137f(C12136e eVar, String str) {
        this.f32691a = String.format("%s_%s", "Wiki_SpaceEntity", str);
        this.f32692b = eVar.mo46391b();
        this.f32693c = eVar.mo46390a();
        this.f32694d = eVar.mo46392c();
        this.f32695e = eVar.mo46393d();
    }

    /* renamed from: a */
    private static void m50201a(TreeNode treeNode, int i) {
        treeNode.level = i;
        if (!CollectionUtils.isEmpty(treeNode.child_value)) {
            for (TreeNode treeNode2 : treeNode.child_value) {
                m50201a(treeNode2, i + 1);
            }
        }
    }

    /* renamed from: b */
    public void mo46411b(String str, List<TreeNode> list) {
        if (!m50210k(str) || CollectionUtils.isEmpty(list)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.diffReplace, invalid params. ");
            return;
        }
        TreeNode treeNode = this.f32692b.get(str);
        List<TreeNode> removeAllChildren = treeNode.removeAllChildren();
        HashMap hashMap = new HashMap();
        C13659d.m55432a(removeAllChildren, new C13659d.AbstractC13661b(hashMap) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$f$JUK1_YRIkWnM2jI7F8nGe4jt6kU */
            public final /* synthetic */ Map f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
            public final void accept(Object obj) {
                C12137f.lambda$JUK1_YRIkWnM2jI7F8nGe4jt6kU(this.f$0, (TreeNode) obj);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            TreeNode treeNode2 = list.get(i);
            TreeNode treeNode3 = (TreeNode) hashMap.remove(treeNode2.wiki_token);
            if (treeNode3 != null) {
                list.set(i, treeNode3);
            } else {
                this.f32692b.put(treeNode2.wiki_token, treeNode2);
            }
        }
        if (!CollectionUtils.isEmpty(hashMap)) {
            for (TreeNode treeNode4 : hashMap.values()) {
                if (treeNode4.nodeType == NodeType.HOME) {
                    list.add(0, treeNode4);
                } else {
                    mo46409b(treeNode4.wiki_token);
                }
            }
        }
        treeNode.addChildren(list);
        treeNode.setExpand(true);
    }

    /* renamed from: a */
    public void mo46399a(String str, int i, TreeNode treeNode) {
        m50202a(str, i, C13659d.m55429a(treeNode));
    }

    /* renamed from: a */
    private void m50202a(String str, int i, List<TreeNode> list) {
        if (!m50210k(str) || list == null) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.insertChildren, invalid params. ");
            return;
        }
        this.f32692b.get(str).addChildren(i, list);
        C13659d.m55432a(list, new C13659d.AbstractC13661b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$f$tRfPGj9_5PZChEYtOw6A03U9EvA */

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
            public final void accept(Object obj) {
                C12137f.this.m50208b((C12137f) ((TreeNode) obj));
            }
        });
    }

    /* renamed from: b */
    public void mo46410b(String str, String str2, int i) {
        if (!m50210k(str) || !mo46426h(str) || !m50210k(str2)) {
            C13479a.m54775e(this.f32691a, "SpaceEntity.moveChildren, invalid params. ");
            return;
        }
        TreeNode treeNode = this.f32692b.get(str);
        TreeNode treeNode2 = this.f32692b.get(str2);
        if (treeNode2.nodeType != NodeType.DIR || mo46426h(treeNode2.wiki_token)) {
            List<TreeNode> removeAllChildren = treeNode.removeAllChildren();
            treeNode2.addChildren(i, removeAllChildren);
            C13659d.m55432a(removeAllChildren, new C13659d.AbstractC13661b() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$f$ntnqe0fvKmRVkOsR980R90gxv4 */

                @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
                public final void accept(Object obj) {
                    C12137f.m50209b(TreeNode.this, (TreeNode) obj);
                }
            });
            return;
        }
        C13479a.m54775e(this.f32691a, "SpaceEntity.moveChildren, destParent type: dir, no children cache. ");
    }

    /* renamed from: a */
    static void m50203a(List<TreeNode> list, int i, Map<String, TreeNode> map) {
        if (!CollectionUtils.isEmpty(list)) {
            for (TreeNode treeNode : list) {
                treeNode.level = i + 1;
                treeNode.updateNodeType();
                map.put(treeNode.wiki_token, treeNode);
                m50203a(treeNode.child_value, treeNode.level, map);
            }
        }
    }

    /* renamed from: a */
    private static void m50204a(List<TreeNode> list, int i, Map<String, TreeNode> map, String str) {
        if (!CollectionUtils.isEmpty(list)) {
            for (TreeNode treeNode : list) {
                if (TextUtils.equals(treeNode.wiki_token, str)) {
                    TreeNode treeNode2 = map.get(treeNode.parent);
                    if (treeNode2 != null) {
                        treeNode2.removeChild(treeNode.wiki_token);
                    }
                } else {
                    if (!map.containsKey(treeNode.wiki_token)) {
                        treeNode.level = i + 1;
                        treeNode.updateNodeType();
                        map.put(treeNode.wiki_token, treeNode);
                        TreeNode treeNode3 = map.get(treeNode.parent);
                        if (treeNode3 != null && !C13659d.m55435d(treeNode3.child_value, new C13659d.AbstractC13660a() {
                            /* class com.bytedance.ee.bear.wiki.wikitree.tree.p586a.$$Lambda$f$LimM6Kl62F22xskHj4oTYBMVuoQ */

                            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13660a
                            public final boolean accept(Object obj) {
                                return C12137f.lambda$LimM6Kl62F22xskHj4oTYBMVuoQ(TreeNode.this, (TreeNode) obj);
                            }
                        })) {
                            treeNode3.addChildren(C13659d.m55429a(treeNode));
                        }
                    }
                    m50204a(treeNode.child_value, i + 1, map, str);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m50206a(Map<String, TreeNode> map, String str, List<TreeNode> list, boolean z) {
        TreeNode treeNode = map.get(str);
        list.add(treeNode);
        if (CollectionUtils.isEmpty(treeNode.child_value)) {
            return;
        }
        if (z || treeNode.expand) {
            for (TreeNode treeNode2 : treeNode.child_value) {
                m50206a(map, treeNode2.wiki_token, list, z);
            }
        }
    }

    public C12137f(HomePage homePage, List<TreeNode> list, boolean z, C12075a aVar, String str) {
        this.f32691a = String.format("%s_%s", "Wiki_SpaceEntity", str);
        this.f32692b = new ConcurrentHashMap();
        this.f32693c = homePage;
        this.f32694d = aVar;
        this.f32695e = z;
        m50199a(homePage, CollectionUtils.checkListNull(list));
    }
}
