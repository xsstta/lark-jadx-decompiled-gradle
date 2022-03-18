package com.ss.android.appcenter.business.tab.fragmentv3.component;

import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.AbstractC28248g;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.vlayout.C28277b;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.e */
public class C28071e implements AbstractC28248g {

    /* renamed from: a */
    private AbstractC28246e f70248a;

    public C28071e(AbstractC28246e eVar) {
        this.f70248a = eVar;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28248g
    /* renamed from: a */
    public List<C28277b.AbstractC28278a> mo99885a(NodeParams nodeParams) {
        List<NodeParams> children = nodeParams.getChildren();
        if (children.size() <= 0) {
            return Collections.emptyList();
        }
        NodeParams nodeParams2 = children.get(0);
        return this.f70248a.mo100600f().mo99878a(nodeParams2.getComponentName()).mo99885a(nodeParams2);
    }
}
