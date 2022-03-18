package com.bytedance.ee.bear.document.offline.file.upload;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.offline.file.upload.UploadFileHandler;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class UploadFilePlugin extends DocumentPlugin {
    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        List<String> list = UploadFileHandler.f16647a;
        if (!list.isEmpty()) {
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35617a(strArr);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.cancelUploadFile", new C5944a());
        map.put("biz.util.uploadFile", new UploadFileHandler(getContext(), C5234y.m21391b(), (NetService) KoinJavaComponent.m268610a(NetService.class), C5084ad.m20847d(), UploadFileHandler.From.WebView));
    }
}
