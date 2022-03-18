package com.bytedance.ee.lark.infra.storage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.storage.AbstractC12889a;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.ee.lark.infra.storage.b */
public class C12896b implements AbstractC12889a {

    /* renamed from: a */
    private List<AbstractC12889a.AbstractC12890a> f34391a = Collections.synchronizedList(new ArrayList());

    @Override // com.bytedance.ee.lark.infra.storage.AbstractC12889a
    /* renamed from: a */
    public void mo48645a(AbstractC12889a.AbstractC12890a aVar) {
        this.f34391a.add(aVar);
    }

    /* renamed from: a */
    private void m53195a(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    private String m53194a(String str) {
        return Storage.getStorageFilePrefix("tma_storage_") + str;
    }

    /* renamed from: a */
    private File m53193a(File file, String str) {
        File file2 = new File(file, "user/" + str);
        m53195a(file2);
        return file2;
    }

    /* renamed from: b */
    private File m53196b(File file, String str) {
        File file2 = new File(file, "temp/" + str);
        m53195a(file2);
        return file2;
    }

    /* renamed from: b */
    private void m53197b(Context context, String str) {
        C12899a.m53203a(context, m53194a(str)).edit().clear().commit();
    }

    @Override // com.bytedance.ee.lark.infra.storage.AbstractC12889a
    /* renamed from: a */
    public boolean mo48646a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("StorageManagerImpl", "cleanMiniAppStorage appId is null");
        }
        AppBrandLogger.m52828d("StorageManagerImpl", "not login");
        if (context == null) {
            AppBrandLogger.m52828d("StorageManagerImpl", "context == null");
            return false;
        }
        AppBrandLogger.m52828d("StorageManagerImpl", "clean start, id: ", str);
        File file = new File(C12791h.m52861a(context), "TT/sandbox");
        IOUtils.clearDir(m53196b(file, str));
        IOUtils.clearDir(m53193a(file, str));
        AppBrandLogger.m52828d("StorageManagerImpl", "clean end,id: ", str);
        m53197b(context, str);
        if (!this.f34391a.isEmpty()) {
            for (AbstractC12889a.AbstractC12890a aVar : this.f34391a) {
                aVar.mo48647a(str);
            }
        }
        AppBrandLogger.m52828d("StorageManagerImpl", "clean StorageInfo end, id: ", str);
        return true;
    }
}
