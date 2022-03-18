package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folder.m */
public class C8370m {
    /* renamed from: a */
    public static AbstractC68307f<DocumentListInfo> m34649a(String str, int i) {
        String str2;
        Object obj;
        boolean isShareFolderV2 = FolderVersion.isShareFolderV2(i);
        if (!isShareFolderV2) {
            str2 = "/api/explorer/folder/children/";
        } else if (C4211a.m17514a().mo16536a("ccm.space.mobile.folder_shortcut_enable", false)) {
            str2 = "/space/api/explorer/v3/children/list/";
        } else {
            str2 = "/space/api/explorer/v2/children/list/";
        }
        if (isShareFolderV2) {
            obj = new C8378q(str);
        } else {
            obj = new C8377p(str);
        }
        NetService.C5077f fVar = new NetService.C5077f(str2);
        fVar.mo20145a("token", str);
        fVar.mo20145a("need_path", "1");
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a((NetService.AbstractC5074c) obj).mo20141a(fVar);
    }
}
