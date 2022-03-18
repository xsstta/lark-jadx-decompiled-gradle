package com.bytedance.ee.bear.wiki.wikitree.tree.p586a;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wiki.wikitree.api.C12061c;
import com.bytedance.ee.bear.wiki.wikitree.api.GetNodePuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetWikiChildPuller;
import com.bytedance.ee.bear.wiki.wikitree.api.GetWikiRelationPuller;
import com.bytedance.ee.bear.wiki.wikitree.bean.NodeType;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.a.b */
class C12133b {

    /* renamed from: a */
    private String f32684a = "Wiki_OpImpl";

    /* renamed from: b */
    private C12137f f32685b;

    /* renamed from: c */
    private NetService f32686c;

    /* renamed from: a */
    private int m50178a(String str, double d) {
        if (!this.f32685b.mo46424g(str) || !this.f32685b.mo46426h(str)) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        for (TreeNode treeNode : this.f32685b.mo46429j(str)) {
            if (treeNode.nodeType != NodeType.HOME && Double.compare(d, treeNode.sort_id) <= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public void mo46389a(String str, Map<String, Double> map) {
        List<TreeNode> list;
        String str2 = this.f32684a;
        C13479a.m54764b(str2, "opImpl.remove, srcToken: " + C13721c.m55650d(str));
        if (this.f32685b.mo46427i(str).nodeType == NodeType.LEAF) {
            this.f32685b.mo46409b(str);
            return;
        }
        String str3 = this.f32685b.mo46427i(str).parent;
        int a = this.f32685b.mo46395a(str3, str);
        if (this.f32685b.mo46426h(str)) {
            C12137f fVar = this.f32685b;
            if (a == -1) {
                a = Integer.MAX_VALUE;
            }
            fVar.mo46410b(str, str3, a);
            this.f32685b.mo46409b(str);
            this.f32685b.mo46407a(map);
            return;
        }
        if (this.f32685b.mo46427i(str).level == 1) {
            list = C12061c.m49946j(this.f32686c).mo46192a(new GetWikiRelationPuller.Params(this.f32685b.mo46423g(), this.f32685b.mo46422f())).mo238020d($$Lambda$b$GZFsOU9ZcGB_X0SSCMcS3VEdr6A.INSTANCE).mo238023d();
        } else {
            list = C12061c.m49941e(this.f32686c).mo46192a(new GetWikiChildPuller.Params(this.f32685b.mo46423g(), str3)).mo238023d();
        }
        this.f32685b.mo46409b(str);
        this.f32685b.mo46411b(str3, list);
    }

    public C12133b(C12137f fVar, NetService netService, String str) {
        this.f32685b = fVar;
        this.f32686c = netService;
        this.f32684a = String.format("%s_%s", "Wiki_OpImpl", str);
    }

    /* renamed from: a */
    private void m50180a(String str, String str2, int i) {
        m50181a(str, str2, C12061c.m49946j(this.f32686c).mo46192a(new GetWikiRelationPuller.Params(this.f32685b.mo46423g(), str2)).mo238020d($$Lambda$b$5yQyLHVSd5PfjQNy_xjpT82rVcA.INSTANCE).mo238023d(), i);
    }

    /* renamed from: a */
    public void mo46386a(String str, TreeNode treeNode, boolean z) {
        C13479a.m54764b(this.f32684a, String.format("opImpl.insert, srcToken: %s, toInsertNode: %s, forceExpand: %s", C13721c.m55650d(str), C13721c.m55650d(treeNode.wiki_token), String.valueOf(z)));
        if (this.f32685b.mo46427i(str).nodeType == NodeType.LEAF || this.f32685b.mo46426h(str)) {
            this.f32685b.mo46400a(str, treeNode);
        } else if (!z) {
            this.f32685b.mo46398a(str, 1);
        } else {
            this.f32685b.mo46404a(str, C12061c.m49941e(this.f32686c).mo46192a(new GetWikiChildPuller.Params(this.f32685b.mo46423g(), str)).mo238023d());
        }
        if (z) {
            this.f32685b.mo46417d(str);
        }
    }

    /* renamed from: a */
    private void m50181a(String str, String str2, List<TreeNode> list, int i) {
        this.f32685b.mo46406a(list, str);
        this.f32685b.mo46402a(str, str2, i);
    }

    /* renamed from: a */
    public void mo46387a(String str, String str2, double d, boolean z, String str3, TreeNode treeNode, List<TreeNode> list) {
        C13479a.m54764b(this.f32684a, String.format("opImpl.moveToForPush, srcToken: %s, destToken: %s, newSortId: %s, forceExpand: %s, focusToken: %s", C13721c.m55650d(str), C13721c.m55650d(str2), String.valueOf(d), String.valueOf(z), str3));
        this.f32685b.mo46401a(str, Double.valueOf(d));
        if (this.f32685b.mo46424g(str2)) {
            if (this.f32685b.mo46427i(str2).nodeType == NodeType.LEAF || this.f32685b.mo46426h(str2)) {
                if (this.f32685b.mo46424g(str)) {
                    this.f32685b.mo46402a(str, str2, m50178a(str2, d));
                } else {
                    this.f32685b.mo46399a(str2, m50178a(str2, d), treeNode);
                }
            } else if (!z) {
                this.f32685b.mo46409b(str);
                this.f32685b.mo46398a(str2, 1);
            } else {
                m50181a(str, str2, list, m50178a(str2, d));
            }
        } else if (!z) {
            this.f32685b.mo46409b(str);
        } else {
            m50181a(str, str2, list, m50178a(str2, d));
        }
        if (z) {
            this.f32685b.mo46405a(str3, true);
        }
    }

    /* renamed from: a */
    public void mo46388a(String str, String str2, int i, boolean z, String str3, String str4, String str5, Double d) {
        C13479a.m54764b(this.f32684a, String.format("opImpl.moveTo, srcToken: %s, destToken: %s, position: %s, forceExpand: %s, focusToken: %s", C13721c.m55650d(str), C13721c.m55650d(str2), String.valueOf(i), String.valueOf(z), str3));
        C12137f fVar = this.f32685b;
        fVar.mo46403a(str, fVar.mo46427i(str).area_id, str4, str5);
        this.f32685b.mo46401a(str, d);
        if (this.f32685b.mo46424g(str2)) {
            if (this.f32685b.mo46427i(str2).nodeType == NodeType.LEAF || this.f32685b.mo46426h(str2)) {
                if (this.f32685b.mo46424g(str)) {
                    this.f32685b.mo46402a(str, str2, i);
                } else {
                    this.f32685b.mo46399a(str2, i, C12061c.m49945i(this.f32686c).mo46192a(new GetNodePuller.Params(str)).mo238023d());
                }
            } else if (!z) {
                this.f32685b.mo46409b(str);
                this.f32685b.mo46398a(str2, 1);
            } else {
                m50180a(str, str2, i);
            }
        } else if (!z) {
            this.f32685b.mo46409b(str);
        } else {
            m50180a(str, str2, i);
        }
        if (z) {
            this.f32685b.mo46405a(str3, true);
        }
    }
}
