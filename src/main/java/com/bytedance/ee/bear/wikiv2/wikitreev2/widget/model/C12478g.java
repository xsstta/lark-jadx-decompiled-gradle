package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12457a;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12459b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikNodeType;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.g */
public final class C12478g {

    /* renamed from: a */
    public final String f33439a;

    /* renamed from: b */
    public final String f33440b;

    /* renamed from: c */
    public final String f33441c;

    /* renamed from: d */
    public final int f33442d;

    /* renamed from: e */
    public String f33443e;

    /* renamed from: f */
    public final String f33444f;

    /* renamed from: g */
    public final double f33445g;

    /* renamed from: h */
    public final int f33446h;

    /* renamed from: i */
    public final String f33447i;

    /* renamed from: j */
    public final String f33448j;

    /* renamed from: k */
    public final boolean f33449k;

    /* renamed from: l */
    public final String f33450l;

    /* renamed from: m */
    public final int f33451m;

    /* renamed from: n */
    public final boolean f33452n;

    /* renamed from: o */
    public final int f33453o;

    /* renamed from: a */
    public boolean mo47511a() {
        return C12459b.m51820d(this.f33446h);
    }

    /* renamed from: c */
    public boolean mo47513c() {
        return C12457a.C12458a.m51811a(this.f33450l);
    }

    /* renamed from: b */
    public boolean mo47512b() {
        if (this.f33453o == WikNodeType.DIR.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C12478g m51916a(TreeNode treeNode, C12457a aVar) {
        return new C12478g(treeNode.space_id, treeNode.wiki_token, treeNode.obj_token, treeNode.obj_type, treeNode.title, treeNode.parent_wiki_token, treeNode.sort_id, treeNode.wiki_node_type, treeNode.origin_wiki_token, treeNode.origin_space_id, treeNode.has_child, aVar.f33392a, aVar.f33394c, aVar.f33393b, treeNode.getNodeType());
    }

    public C12478g(String str, String str2, String str3, int i, String str4, String str5, double d, int i2, String str6, String str7, boolean z, String str8, int i3, boolean z2, int i4) {
        this.f33439a = str;
        this.f33440b = str2;
        this.f33441c = str3;
        this.f33442d = i;
        this.f33443e = str4;
        this.f33444f = str5;
        this.f33445g = d;
        this.f33446h = i2;
        this.f33447i = str6;
        this.f33448j = str7;
        this.f33449k = z;
        this.f33450l = str8;
        this.f33451m = i3;
        this.f33452n = z2;
        this.f33453o = i4;
    }
}
