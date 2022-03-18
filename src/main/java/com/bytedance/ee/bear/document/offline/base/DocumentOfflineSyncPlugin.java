package com.bytedance.ee.bear.document.offline.base;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.p281e.AbstractC5167a;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.aj;
import com.bytedance.ee.bear.document.offline.create.AbstractC5917c;
import com.bytedance.ee.bear.document.offline.create.C5915a;
import com.bytedance.ee.bear.document.offline.create.C5916b;
import com.bytedance.ee.bear.document.rnsync.DocRnImpl;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

public class DocumentOfflineSyncPlugin extends DocumentPlugin implements AbstractC5917c {
    @Override // com.bytedance.ee.bear.document.offline.create.AbstractC5917c
    public void handleSyncedDoc(OfflineDoc offlineDoc) {
        DocViewModel docViewModel = getDocViewModel();
        C13479a.m54764b("DocumentOfflineSyncPlugin", "handleSyncedDoc:" + offlineDoc + docViewModel);
        if (!TextUtils.equals(offlineDoc.getFakeToken(), docViewModel.getToken())) {
            C13479a.m54775e("DocumentOfflineSyncPlugin", "Not same doc,ignored !");
            return;
        }
        String url = docViewModel.getUrl();
        String lastPathSegment = Uri.parse(url).getLastPathSegment();
        if (lastPathSegment != null) {
            url = url.replace(lastPathSegment, offlineDoc.getObj_token());
        }
        aj l = ((C6095s) getHost()).mo24597l();
        Bundle arguments = l.getArguments();
        if (arguments != null) {
            arguments.putString("url", url);
        }
        FragmentActivity activity = l.getActivity();
        if (!(activity == null || activity.getIntent() == null)) {
            activity.getIntent().putExtra("url", url);
        }
        docViewModel.setUrl(url);
        docViewModel.requestDocumentInfo(url);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        AbstractC5167a e = ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40263e();
        if (e instanceof DocRnImpl) {
            ((DocRnImpl) e).mo23376a(null);
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        C10917c p = sVar.mo24601p();
        C5916b bVar = new C5916b(p, "Web");
        C5915a aVar = new C5915a(p, "Web");
        bVar.mo23893a(this);
        aVar.mo23891a(this);
        bindBridgeHandler("biz.notify.syncDocInfo", bVar);
        bindBridgeHandler("biz.util.modifyOfflineDocInfo", aVar);
        AbstractC5167a e = ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40263e();
        if (e instanceof DocRnImpl) {
            ((DocRnImpl) e).mo23376a(this);
            return;
        }
        C13479a.m54775e("DocumentOfflineSyncPlugin", "IRn state err:" + e);
    }
}
