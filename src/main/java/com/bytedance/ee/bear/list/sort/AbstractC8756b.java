package com.bytedance.ee.bear.list.sort;

import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.sort.AbstractC8769h;

/* renamed from: com.bytedance.ee.bear.list.sort.b */
public abstract class AbstractC8756b implements AbstractC8769h.AbstractC8770a {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8769h.AbstractC8770a
    /* renamed from: a */
    public void mo33802a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null) {
            C8153a.m32844b().mo31582a(folderSortStrategy);
        }
    }
}
