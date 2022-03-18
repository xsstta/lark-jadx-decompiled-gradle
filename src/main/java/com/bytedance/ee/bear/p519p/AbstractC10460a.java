package com.bytedance.ee.bear.p519p;

import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ee.bear.p519p.AbstractC10466g;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.p.a */
public abstract class AbstractC10460a extends ClickableSpan implements AbstractC10466g {

    /* renamed from: a */
    protected AbstractC10461a f28125a;

    /* renamed from: b */
    protected int f28126b = -1;

    /* renamed from: com.bytedance.ee.bear.p.a$a */
    public interface AbstractC10461a {
        /* renamed from: a */
        void mo18121a(AbstractC10460a aVar);
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: o */
    public /* synthetic */ int mo39738o() {
        return AbstractC10466g.CC.$default$o(this);
    }

    /* renamed from: a */
    public void mo39737a(AbstractC10461a aVar) {
        this.f28125a = aVar;
    }

    public void onClick(View view) {
        if (this.f28125a != null) {
            C13479a.m54764b("FileSpan", "onClick: ");
            this.f28125a.mo18121a(this);
        }
    }
}
