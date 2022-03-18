package com.tt.miniapp.manager.p3302a.p3304b;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.tt.miniapp.manager.p3302a.C66389b;
import com.tt.miniapphost.util.DebugUtil;
import java.io.File;

/* renamed from: com.tt.miniapp.manager.a.b.d */
public class C66393d extends AbstractC66390a {
    @Override // com.tt.miniapp.manager.p3302a.p3304b.AbstractC66390a
    /* renamed from: a */
    public C66391b mo231908a(Context context, C66391b bVar) {
        if (!DebugUtil.debug() || context == null) {
            return bVar;
        }
        File file = new File(context.getExternalCacheDir(), "/basebundle/bundle.zip");
        if (file.exists()) {
            IOUtils.clearDir(C66389b.m259575a(context, "push_bundle"));
            bVar.f167614b = C66389b.m259571a(context, file, bVar.f167615c, "push_bundle", true, bVar.f167613a);
        }
        return bVar;
    }
}
