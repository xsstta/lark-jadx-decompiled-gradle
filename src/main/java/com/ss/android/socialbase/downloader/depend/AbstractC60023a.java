package com.ss.android.socialbase.downloader.depend;

import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.depend.a */
public abstract class AbstractC60023a implements AbstractC60032j {

    /* renamed from: a */
    private boolean f149666a;

    @Override // com.ss.android.socialbase.downloader.depend.AbstractC60032j
    /* renamed from: a */
    public boolean mo204503a() {
        return this.f149666a;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbstractC60032j
    /* renamed from: a */
    public void mo204502a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f149666a = true;
        }
    }
}
