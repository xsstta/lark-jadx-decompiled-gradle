package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.c */
public class C12141c extends AbstractC12131a implements AbstractC12177b.AbstractC12178a {

    /* renamed from: b */
    private final List<C12150i> f32715b = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AbstractC12177b.AbstractC12178a createViewDelegate() {
        return this;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: b */
    public void mo46346b() {
        super.mo46346b();
        for (C12150i iVar : this.f32715b) {
            iVar.mo46445b();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: c */
    public void mo46347c() {
        super.mo46347c();
        for (C12150i iVar : this.f32715b) {
            iVar.mo46471i();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: d */
    public void mo46348d() {
        for (C12150i iVar : this.f32715b) {
            iVar.mo46448c();
        }
        this.f32715b.clear();
        super.mo46348d();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: a */
    public void mo46344a() {
        super.mo46344a();
        for (C12150i iVar : this.f32715b) {
            iVar.mo46437a();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: o */
    public void mo46465o() {
        C13479a.m54764b(this.f32679a, "onRetryClick. ");
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46465o();
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: p */
    public void mo46466p() {
        C13479a.m54764b(this.f32679a, "onNoFoundClick. ");
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46466p();
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: q */
    public void mo46467q() {
        C13479a.m54764b(this.f32679a, "onSearchClick. ");
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46467q();
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: r */
    public void mo46468r() {
        C13479a.m54764b(this.f32679a, "onClearInput. ");
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46468r();
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: s */
    public void mo46469s() {
        C13479a.m54764b(this.f32679a, "onCancelSearch. ");
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46469s();
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: t */
    public void mo46470t() {
        C13479a.m54764b(this.f32679a, "onSearchMore. ");
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46470t();
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: e */
    public boolean mo46349e() {
        super.mo46349e();
        Iterator<C12150i> it = this.f32715b.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                C12150i next = it.next();
                if (z || next.mo46472j()) {
                    z = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46459a(C12150i iVar) {
        if (iVar != null) {
            this.f32715b.add(iVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> T mo46458a(int i) {
        if (C13657b.m55420a(i, this.f32715b)) {
            return (T) this.f32715b.get(i);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    public void a_(String str) {
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).a_(str);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: b */
    public void mo46446b(TreeNode treeNode) {
        String str = this.f32679a;
        C13479a.m54764b(str, "onRemove, targetNode: " + treeNode);
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46446b(treeNode);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: c */
    public void mo46449c(TreeNode treeNode) {
        String str = this.f32679a;
        C13479a.m54764b(str, "onMoveTo, targetNode: " + treeNode);
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46449c(treeNode);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: d */
    public void mo46462d(TreeNode treeNode) {
        String str = this.f32679a;
        C13479a.m54764b(str, "onExpand, targetNode: " + treeNode);
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46462d(treeNode);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: e */
    public void mo46463e(TreeNode treeNode) {
        String str = this.f32679a;
        C13479a.m54764b(str, "onCollapse, targetNode: " + treeNode);
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46463e(treeNode);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46439a(TreeNode treeNode) {
        String str = this.f32679a;
        C13479a.m54764b(str, "onItemClick, targetNode: " + treeNode);
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46439a(treeNode);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46440a(TreeNode treeNode, int i) {
        String str = this.f32679a;
        C13479a.m54764b(str, "onInsert, targetNode: " + treeNode);
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46440a(treeNode, i);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b.AbstractC12178a
    /* renamed from: a */
    public void mo46460a(String str, String str2) {
        String str3 = this.f32679a;
        C13479a.m54764b(str3, "onSearchItemClick, wikiToken: " + C13721c.m55650d(str2));
        for (C12150i iVar : this.f32715b) {
            if (iVar instanceof AbstractC12177b.AbstractC12178a) {
                ((AbstractC12177b.AbstractC12178a) iVar).mo46460a(str, str2);
            }
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a
    /* renamed from: a */
    public void mo46345a(int i, int i2, Intent intent) {
        super.mo46345a(i, i2, intent);
        for (C12150i iVar : this.f32715b) {
            iVar.mo46438a(i, i2, intent);
        }
    }

    C12141c(FragmentActivity fragmentActivity, C10917c cVar, LifecycleOwner lifecycleOwner, AbstractC12177b bVar, AbstractC12132a aVar) {
        super(fragmentActivity, cVar, lifecycleOwner, bVar, aVar);
    }
}
