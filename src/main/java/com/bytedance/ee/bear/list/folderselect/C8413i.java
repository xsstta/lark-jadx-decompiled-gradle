package com.bytedance.ee.bear.list.folderselect;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.folder.C8384w;
import com.bytedance.ee.bear.list.folderselect.AbstractC8403e;
import com.bytedance.ee.bear.service.C10917c;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.i */
public class C8413i implements AbstractC8403e.AbstractC8404a {

    /* renamed from: a */
    private final C10917c f22683a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8403e.AbstractC8404a
    /* renamed from: a */
    public AbstractC68307f<DocumentListInfo> mo32853a() {
        String str;
        if (SpaceFeatureGatingV2.m32622a()) {
            str = "/space/api/explorer/v2/recent/folder_path";
        } else {
            str = "/space/api/explorer/recent/folderpath/";
        }
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(2);
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8411g()).mo20141a(fVar).mo238014c(new C8384w());
    }

    public C8413i(C10917c cVar) {
        this.f22683a = cVar;
    }
}
