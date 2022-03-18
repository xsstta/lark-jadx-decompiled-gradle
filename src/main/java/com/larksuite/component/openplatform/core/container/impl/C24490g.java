package com.larksuite.component.openplatform.core.container.impl;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.p1100a.AbstractC24362a;
import com.larksuite.component.openplatform.core.component.C24435c;
import com.larksuite.component.openplatform.core.component.C24436d;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24392b;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24398e;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24399f;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapphost.p3362a.p3367e.C67459e;
import com.tt.refer.common.base.AppType;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: com.larksuite.component.openplatform.core.container.impl.g */
public class C24490g extends AbstractC24461b {
    @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
    public void ai_() {
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: g */
    public AppType mo87289g() {
        return AppType.CardAPP;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public AbstractC24362a mo87279a(C24436d dVar) {
        return new C24435c(dVar, this.f60359i);
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public IAppContext mo87278a(Context context) {
        if (this.f60359i == null) {
            this.f60359i = new C67459e(context);
        }
        return this.f60359i;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87281a(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("renderType", "card");
            bundle.putString("workerType", "card");
            if (!bundle.containsKey(C24377a.f60159d)) {
                bundle.putString(C24377a.f60159d, "template.js");
            }
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87285a(ConcurrentLinkedDeque<AbstractC24387a> concurrentLinkedDeque) {
        if (!C25529d.m91147a(this.f60357g.getString(C24377a.f60159d))) {
            super.mo87285a(concurrentLinkedDeque);
            return;
        }
        concurrentLinkedDeque.add(new C24399f());
        concurrentLinkedDeque.add(new C24392b());
        concurrentLinkedDeque.add(new C24398e());
    }

    public C24490g(OPContainerBundle oPContainerBundle, String str) {
        super(oPContainerBundle, str);
    }
}
