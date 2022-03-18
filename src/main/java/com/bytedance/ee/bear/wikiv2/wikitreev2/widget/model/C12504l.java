package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import android.text.TextUtils;
import com.bytedance.ee.bear.wikiv2.common.p590a.C12241c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12457a;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12459b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpacePerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceUserPerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikNodeType;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikiRelation;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p702e.C13659d;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.l */
public class C12504l {

    /* renamed from: a */
    public static final C12504l f33511a = new C12504l();

    /* renamed from: b */
    public boolean f33512b;

    /* renamed from: c */
    private String f33513c;

    /* renamed from: d */
    private String f33514d;

    /* renamed from: e */
    private final Map<String, List<String>> f33515e;

    /* renamed from: f */
    private final Map<String, TreeNode> f33516f;

    /* renamed from: g */
    private SpaceInfo f33517g;

    /* renamed from: h */
    private SpaceUserPerm f33518h;

    /* renamed from: i */
    private SpacePerm f33519i;

    /* renamed from: j */
    private Function<TreeNode, Boolean> f33520j;

    /* renamed from: j */
    public String mo47629j() {
        return "wikiroot%favorite";
    }

    /* renamed from: a */
    public SpacePerm mo47601a() {
        return this.f33519i;
    }

    /* renamed from: g */
    public SpaceInfo mo47623g() {
        return this.f33517g;
    }

    /* renamed from: h */
    public SpaceUserPerm mo47625h() {
        return this.f33518h;
    }

    /* renamed from: a */
    public void mo47609a(String str, List<TreeNode> list) {
        if (list != null) {
            m51973a(str, m51976b(str, list.size() > 0 ? list.get(0).sort_id : 0.0d), list);
        }
    }

    /* renamed from: a */
    public void mo47608a(String str, String str2, double d) {
        if (!m51984q(str) || !m51984q(this.f33516f.get(str).parent_wiki_token) || !m51984q(str2)) {
            C13479a.m54775e("Wiki_Workspaces", "Workspaces.moveNode, invalid params. ");
            return;
        }
        String str3 = this.f33516f.get(str).parent_wiki_token;
        if (!mo47628i(str3)) {
            C13479a.m54775e("Wiki_Workspaces", "Workspaces.moveNodes, destParent type: dir, no children cache. ");
            return;
        }
        this.f33515e.get(str3).remove(str);
        m51978b(str3, true);
        this.f33516f.get(str).parent_wiki_token = str2;
        m51980m(str2);
        List<String> o = m51982o(str2);
        o.add(C12241c.m50940a(m51976b(str2, d), 0, o.size()), str);
        m51978b(str2, false);
    }

    /* renamed from: a */
    public void mo47607a(String str, String str2) {
        if (m51984q(str)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = str;
            }
            C12457a aVar = this.f33516f.get(str).ns.get(str2);
            if (aVar != null) {
                aVar.f33393b = true;
            }
        }
    }

    /* renamed from: a */
    public void mo47610a(String str, boolean z) {
        if (m51984q(str)) {
            TreeNode treeNode = this.f33516f.get(str);
            treeNode.getNsOrCreate(str).f33393b = z && mo47628i(str);
            TreeNode treeNode2 = this.f33516f.get(treeNode.parent_wiki_token);
            while (treeNode2 != null) {
                treeNode2.getNsOrCreate(treeNode2.wiki_token).f33393b = true;
                treeNode2 = this.f33516f.get(treeNode2.parent_wiki_token);
            }
        }
    }

    /* renamed from: b */
    public List<C12478g> mo47612b() {
        return m51983p(this.f33514d);
    }

    /* renamed from: c */
    public List<C12478g> mo47614c() {
        return m51983p(this.f33513c);
    }

    /* renamed from: f */
    public boolean mo47622f() {
        SpaceInfo spaceInfo = this.f33517g;
        if (spaceInfo == null || TextUtils.isEmpty(spaceInfo.space_id)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public String mo47627i() {
        if (mo47622f()) {
            return this.f33517g.space_id;
        }
        return "";
    }

    /* renamed from: k */
    public String mo47632k() {
        if (!TextUtils.isEmpty(this.f33514d)) {
            return this.f33514d;
        }
        return "";
    }

    private C12504l() {
        this.f33515e = new ConcurrentHashMap();
        this.f33516f = new ConcurrentHashMap();
        this.f33519i = new SpacePerm();
    }

    /* renamed from: l */
    public void mo47633l() {
        this.f33517g = null;
        this.f33513c = "";
        this.f33514d = "";
        this.f33515e.clear();
        this.f33516f.clear();
    }

    /* renamed from: d */
    public boolean mo47618d() {
        if (C13657b.m55422a(this.f33516f) || C13657b.m55422a(this.f33515e) || C13657b.m55421a(this.f33515e.get(this.f33514d))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo47620e() {
        C12457a aVar = this.f33516f.get(this.f33513c).ns.get(this.f33513c);
        if (aVar != null) {
            return aVar.f33393b;
        }
        return false;
    }

    /* renamed from: m */
    public C12504l mo47634m() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, List<String>> entry : this.f33515e.entrySet()) {
            concurrentHashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, TreeNode> entry2 : this.f33516f.entrySet()) {
            concurrentHashMap2.put(entry2.getKey(), entry2.getValue().clone());
        }
        return new C12504l(this.f33514d, concurrentHashMap, concurrentHashMap2, this.f33517g.clone(), this.f33518h.clone(), this.f33519i.clone(), this.f33512b);
    }

    /* renamed from: a */
    private void m51972a(TreeNode treeNode) {
        this.f33516f.put(treeNode.wiki_token, treeNode);
    }

    /* renamed from: h */
    public boolean mo47626h(String str) {
        return m51984q(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m51985r(String str) {
        this.f33515e.remove(str);
        this.f33516f.remove(str);
    }

    /* renamed from: a */
    public void mo47604a(Function<TreeNode, Boolean> function) {
        this.f33520j = function;
    }

    /* renamed from: b */
    public TreeNode mo47611b(String str) {
        return this.f33516f.get(str);
    }

    /* renamed from: o */
    private List<String> m51982o(String str) {
        List<String> list = this.f33515e.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f33515e.put(str, arrayList);
        return arrayList;
    }

    /* renamed from: q */
    private boolean m51984q(String str) {
        if (TextUtils.isEmpty(str) || this.f33516f.get(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public List<String> mo47617d(String str) {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.f33515e.get(str);
        if (!C13657b.m55421a(list) && !m51981n(str)) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo47619e(String str) {
        if (m51984q(str)) {
            m51980m(this.f33513c);
            m51982o(this.f33513c).add(0, str);
        }
    }

    /* renamed from: f */
    public void mo47621f(String str) {
        if (m51984q(str)) {
            m51982o(this.f33513c).remove(str);
            m51979l(this.f33513c);
        }
    }

    /* renamed from: g */
    public boolean mo47624g(String str) {
        List<String> list = this.f33515e.get(this.f33513c);
        if (!C13657b.m55421a(list)) {
            return list.contains(str);
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo47628i(String str) {
        if (m51984q(str)) {
            return !C13657b.m55421a(this.f33515e.get(str));
        }
        C13479a.m54775e("Wiki_Workspaces", "Workspaces.hasNodeChildrenCache, invalid params. ");
        return false;
    }

    /* renamed from: j */
    public boolean mo47630j(String str) {
        if (mo47631k(str) == WikNodeType.LEAF.getValue() || mo47628i(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public int mo47631k(String str) {
        if (m51984q(str)) {
            return this.f33516f.get(str).getNodeType();
        }
        C13479a.m54775e("Wiki_Workspaces", "Workspaces.getNodeType, invalid params. ");
        return -1;
    }

    public C12504l(WikiRelation wikiRelation) {
        this(wikiRelation.tree.root_token, wikiRelation.tree.child_map, wikiRelation.tree.nodes, wikiRelation.space, wikiRelation.user_space_perm, wikiRelation.root_perm_info, wikiRelation.fromCache);
    }

    /* renamed from: l */
    private void m51979l(String str) {
        List<String> o = m51982o(str);
        if (C13657b.m55421a(o)) {
            TreeNode createNone = TreeNode.createNone(mo47627i());
            createNone.parent_wiki_token = str;
            this.f33516f.put(createNone.wiki_token, createNone);
            o.add(createNone.wiki_token);
        }
    }

    /* renamed from: m */
    private void m51980m(String str) {
        String str2;
        TreeNode treeNode;
        List<String> list = this.f33515e.get(str);
        if (list != null && list.size() == 1 && (treeNode = this.f33516f.get((str2 = list.get(0)))) != null && treeNode.getNodeType() == WikNodeType.NONE.getValue()) {
            list.clear();
            this.f33516f.remove(str2);
        }
    }

    /* renamed from: n */
    private boolean m51981n(String str) {
        List<String> list = this.f33515e.get(str);
        if (list.size() == 1 && this.f33516f.get(list.get(0)).getNodeType() == WikNodeType.NONE.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private List<C12478g> m51983p(String str) {
        if (!m51984q(str)) {
            C13479a.m54775e("Wiki_Workspaces", "Workspaces.getDftFlatResult, invalid params. ");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        m51974a(str, str, (List<C12478g>) arrayList, false, 0);
        return arrayList;
    }

    /* renamed from: c */
    public List<TreeNode> mo47615c(String str) {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.f33515e.get(str);
        if (!C13657b.m55421a(list) && !m51981n(str)) {
            for (String str2 : list) {
                TreeNode treeNode = this.f33516f.get(str2);
                if (treeNode != null) {
                    arrayList.add(treeNode);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<String> mo47602a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!m51984q(str) || !m51984q(this.f33516f.get(str).parent_wiki_token)) {
            C13479a.m54775e("Wiki_Workspaces", "Workspaces.removeNode, invalid params. ");
            return arrayList;
        }
        String str2 = this.f33516f.get(str).parent_wiki_token;
        if (!mo47628i(str2)) {
            C13479a.m54775e("Wiki_Workspaces", "Workspaces.removeNode, destParent type: dir, no children cache. ");
            return arrayList;
        }
        this.f33515e.get(str2).remove(str);
        List<String> list = this.f33515e.get(this.f33513c);
        if (list != null && list.contains(str)) {
            mo47621f(str);
        }
        m51977b(str, arrayList);
        C13659d.m55432a(arrayList, new C13659d.AbstractC13661b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$l$h0HC3bhAKvGHMJsSQtiJhhQqyV0 */

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
            public final void accept(Object obj) {
                C12504l.this.m51985r((String) obj);
            }
        });
        m51978b(str2, true);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51975a(List list, TreeNode treeNode) {
        list.add(treeNode.wiki_token);
        if (!this.f33516f.containsKey(treeNode.wiki_token)) {
            this.f33516f.put(treeNode.wiki_token, treeNode);
        }
    }

    /* renamed from: b */
    private int m51976b(String str, double d) {
        if (!m51984q(str) || !mo47628i(str)) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        for (String str2 : this.f33515e.get(str)) {
            if (Double.compare(d, this.f33516f.get(str2).sort_id) <= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public void mo47605a(String str, double d) {
        if (m51984q(str)) {
            this.f33516f.get(str).sort_id = d;
        }
    }

    /* renamed from: b */
    private void m51977b(String str, List<String> list) {
        list.add(this.f33516f.get(str).wiki_token);
        List<String> list2 = this.f33515e.get(str);
        if (!C13657b.m55421a(list2)) {
            for (String str2 : list2) {
                m51977b(str2, list);
            }
        }
    }

    /* renamed from: c */
    public boolean mo47616c(String str, String str2) {
        if (!m51984q(str2) || !m51984q(str)) {
            return false;
        }
        TreeNode treeNode = this.f33516f.get(str);
        while (treeNode != null) {
            if (TextUtils.equals(treeNode.wiki_token, str2)) {
                return true;
            }
            treeNode = this.f33516f.get(treeNode.parent_wiki_token);
        }
        return false;
    }

    /* renamed from: b */
    private void m51978b(String str, boolean z) {
        this.f33516f.get(str).has_child = !C13657b.m55421a(this.f33515e.get(str));
        if (z && C12459b.m51815a(this.f33516f.get(str).wiki_node_type)) {
            m51979l(str);
        }
    }

    /* renamed from: b */
    public void mo47613b(String str, String str2) {
        if (m51984q(str)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = str;
            }
            C12457a aVar = this.f33516f.get(str).ns.get(str2);
            if (aVar != null) {
                aVar.f33393b = false;
            }
        }
    }

    /* renamed from: a */
    public void mo47606a(String str, TreeNode treeNode) {
        if (treeNode != null) {
            m51973a(str, m51976b(str, treeNode.sort_id), C13659d.m55429a(treeNode));
        }
    }

    /* renamed from: a */
    private void m51973a(String str, int i, List<TreeNode> list) {
        if (!m51984q(str)) {
            C13479a.m54775e("Wiki_Workspaces", "Wiki_Workspaces.insertChildren, invalid params. ");
        } else if (C13657b.m55421a(list)) {
            C13479a.m54764b("Wiki_Workspaces", "Wiki_Workspaces.insertChildren, empty childs. ");
            m51979l(str);
        } else {
            m51980m(str);
            ArrayList arrayList = new ArrayList();
            C13659d.m55432a(list, new C13659d.AbstractC13661b(arrayList) {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.$$Lambda$l$SNse6iuNnyWqln77xwvxL1v7LaA */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
                public final void accept(Object obj) {
                    C12504l.this.m51975a((C12504l) this.f$1, (List) ((TreeNode) obj));
                }
            });
            if (!C13657b.m55421a(arrayList)) {
                List<String> o = m51982o(str);
                o.addAll(C12241c.m50940a(i, 0, o.size()), arrayList);
            }
            m51978b(str, false);
        }
    }

    /* renamed from: a */
    private void m51974a(String str, String str2, List<C12478g> list, boolean z, int i) {
        TreeNode treeNode = this.f33516f.get(str2);
        if (treeNode != null) {
            Function<TreeNode, Boolean> function = this.f33520j;
            if (function != null) {
                try {
                    if (!function.apply(treeNode).booleanValue()) {
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            C12457a nsOrCreate = treeNode.getNsOrCreate(C12457a.C12458a.m51810a(str, treeNode, i));
            nsOrCreate.f33394c = i;
            list.add(C12478g.m51916a(treeNode, nsOrCreate));
            List<String> list2 = this.f33515e.get(str2);
            if (C13657b.m55421a(list2)) {
                return;
            }
            if (z || nsOrCreate.f33393b) {
                for (String str3 : list2) {
                    m51974a(str, str3, list, z, i + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo47603a(SpaceInfo spaceInfo, String str, Map<String, List<String>> map, Map<String, TreeNode> map2, String str2) {
        if (TextUtils.isEmpty(spaceInfo.space_id) || !TextUtils.equals(spaceInfo.space_id, this.f33517g.space_id) || !TextUtils.equals(str, this.f33514d)) {
            C13479a.m54775e("Wiki_Workspaces", "diffAppendRelation, invalid params. ");
            return;
        }
        TreeNode treeNode = map2.get(str2);
        if (treeNode != null) {
            List<String> list = map.get(treeNode.parent_wiki_token);
            if (!C13657b.m55421a(list)) {
                list.remove(str2);
            }
            if (C13657b.m55421a(list)) {
                map.remove(treeNode.parent_wiki_token);
            }
        }
        map.remove(str2);
        this.f33515e.putAll(map);
        for (Map.Entry<String, TreeNode> entry : map2.entrySet()) {
            if (!this.f33516f.containsKey(entry.getKey())) {
                this.f33516f.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public C12504l(String str, Map<String, List<String>> map, Map<String, TreeNode> map2, SpaceInfo spaceInfo, SpaceUserPerm spaceUserPerm, SpacePerm spacePerm, boolean z) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f33515e = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f33516f = concurrentHashMap2;
        this.f33519i = new SpacePerm();
        this.f33514d = str;
        this.f33513c = "wikiroot%favorite";
        concurrentHashMap2.putAll(map2);
        concurrentHashMap.putAll(map);
        this.f33517g = spaceInfo;
        this.f33518h = spaceUserPerm;
        this.f33519i = spacePerm;
        m51972a(TreeNode.createVirtualRoot(spaceInfo.space_id, this.f33514d));
        m51972a(TreeNode.createFavoriteRoot(spaceInfo.space_id));
        this.f33512b = z;
    }
}
