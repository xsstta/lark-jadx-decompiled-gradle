package com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper;

import android.content.Context;
import android.view.View;
import com.ss.android.appcenter.business.dto.C27694b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.engine.AbstractC28240b;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.C28237a;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.c */
public class C28075c extends AbstractC28240b<FeedSwiper, C27694b> {

    /* renamed from: a */
    private AbstractC28246e f70273a;

    public C28075c(AbstractC28246e eVar) {
        this.f70273a = eVar;
    }

    /* renamed from: b */
    public FeedSwiper mo99888a(Context context) {
        C28184h.m103250d("FeedSwiper", "createViewInstance>>>");
        return new FeedSwiper(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102620a(NodeParams nodeParams, View view) {
        this.f70273a.mo100598d().mo99987a(nodeParams.getKey());
    }

    /* renamed from: a */
    public void mo99889a(FeedSwiper feedSwiper, C28237a<C27694b> aVar) {
        C28184h.m103250d("FeedSwiper", "bindData>>> status:" + aVar.mo100620g());
        feedSwiper.mo99929a(aVar);
    }

    /* renamed from: a */
    public void mo99890a(FeedSwiper feedSwiper, NodeParams nodeParams) {
        C28184h.m103250d("FeedSwiper", "applyStylesAndProperties>>> " + nodeParams);
        feedSwiper.mo99930a(nodeParams, this.f70273a.mo100601g().getLifecycle());
        feedSwiper.setErrorClickListener(new View.OnClickListener(nodeParams) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.$$Lambda$c$lsRbaW4FYlEePVOhbsZ1oeQAGZ0 */
            public final /* synthetic */ NodeParams f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C28075c.this.m102620a((C28075c) this.f$1, (NodeParams) view);
            }
        });
    }
}
