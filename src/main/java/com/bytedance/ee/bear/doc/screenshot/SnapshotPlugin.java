package com.bytedance.ee.bear.doc.screenshot;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.ak;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class SnapshotPlugin extends DocumentPlugin implements AbstractC5089af.AbstractC5093d, AbstractC7666d {
    public DocShotPresenter snapshotPresenter;
    private AbstractC5518b snapshotView;

    public LiveData<Boolean> getIsActive() {
        DocShotPresenter docShotPresenter = this.snapshotPresenter;
        if (docShotPresenter != null) {
            return docShotPresenter.mo21933a();
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        DocShotPresenter docShotPresenter = this.snapshotPresenter;
        if (docShotPresenter == null || !docShotPresenter.mo21944b()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.ee.bear.doc.screenshot.SnapshotPlugin$a */
    private class C5498a implements AbstractC7945d<String> {
        private C5498a() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("SnapshotPlugin", "onScreenShotExit");
            if (SnapshotPlugin.this.snapshotPresenter != null) {
                SnapshotPlugin.this.snapshotPresenter.mo21945c();
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.screenshot.SnapshotPlugin$b */
    private class C5499b implements AbstractC7945d<DocShotModel> {
        private C5499b() {
        }

        /* renamed from: a */
        public void handle(DocShotModel docShotModel, AbstractC7947h hVar) {
            C13479a.m54764b("SnapshotPlugin", "onScreenShotReady:" + docShotModel.success);
            C10548d.m43696a((Context) SnapshotPlugin.this.getActivity());
            SnapshotPlugin.this.snapshotPresenter.mo21942a(docShotModel.success, docShotModel);
        }
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$0$SnapshotPlugin(String str) {
        DocShotPresenter docShotPresenter = this.snapshotPresenter;
        if (str == null) {
            str = "";
        }
        docShotPresenter.mo21939a(str);
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.doc.screenshotReady", new C5499b());
        map.put("biz.doc.screenshotExit", new C5498a());
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5093d
    public void onRequestSnapshot(String str) {
        C13479a.m54764b("SnapshotPlugin", "onRequestSnapshot()... ");
        if (getActivity().getLifecycle().getCurrentState() != Lifecycle.State.RESUMED) {
            C13479a.m54775e("SnapshotPlugin", "onRequestSnapshot, activity is not RESUMED");
            return;
        }
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer == null) {
            C13479a.m54775e("SnapshotPlugin", "onRequestSnapshot After ui detach");
            return;
        }
        AbstractC5518b bVar = this.snapshotView;
        if (bVar != null) {
            uIContainer.mo19594b(this, (View) bVar);
        }
        AbstractC5518b bVar2 = (AbstractC5518b) uIContainer.mo19584a(this, R.layout.doc_screen_shot_layout);
        this.snapshotView = bVar2;
        bVar2.setSourceInfo(str);
        this.snapshotPresenter.mo21935a(ak.m22924b(), this.snapshotView, getDocViewModel().getBearUrl(), getDocViewModel().isType(C8275a.f22377j));
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5093d
    public void onRequestSnapshot(String str, AbstractC5089af.AbstractC5092c cVar) {
        this.snapshotPresenter.mo21937a(cVar);
        onRequestSnapshot(str);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        AbstractC5518b bVar = this.snapshotView;
        if (bVar != null) {
            nVar.mo19594b(this, (View) bVar);
            this.snapshotView = null;
        }
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20194b(this);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.snapshotPresenter = new DocShotPresenter(getActivity(), getServiceProvider(), ((C6095s) getHost()).mo24601p(), "mindnote".equals(getDocViewModel().getDocumentType()));
        getDocViewModel().getDocName().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.doc.screenshot.$$Lambda$SnapshotPlugin$RcLkPJ3HUK6gIODjncu5n4GUg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SnapshotPlugin.this.lambda$onAttachToUIContainer$0$SnapshotPlugin((String) obj);
            }
        });
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20187a(this);
    }
}
