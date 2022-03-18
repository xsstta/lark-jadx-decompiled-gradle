package com.bytedance.ee.bear.contract;

import androidx.fragment.app.Fragment;
import io.reactivex.AbstractC68307f;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.contract.af */
public interface AbstractC5089af {

    /* renamed from: com.bytedance.ee.bear.contract.af$a */
    public interface AbstractC5090a {
        void onRequestExport();
    }

    /* renamed from: com.bytedance.ee.bear.contract.af$b */
    public interface AbstractC5091b {
        void onDocGoBack(String str);

        void onDownloadFullResource();

        void onRenderByWaitPreload();

        void onRenderFail(Throwable th, Map<String, String> map);

        void onRenderSuccess(Map<String, String> map);

        void onRendering(String str);

        void onWaitDownloadFullResource();

        void onWaitPreloading();
    }

    /* renamed from: com.bytedance.ee.bear.contract.af$c */
    public interface AbstractC5092c {
        /* renamed from: a */
        void mo20204a();

        /* renamed from: b */
        void mo20205b();
    }

    /* renamed from: com.bytedance.ee.bear.contract.af$d */
    public interface AbstractC5093d {
        void onRequestSnapshot(String str);

        void onRequestSnapshot(String str, AbstractC5092c cVar);
    }

    /* renamed from: a */
    AbstractC68307f<Boolean> mo20182a(boolean z);

    /* renamed from: a */
    void mo20183a();

    /* renamed from: a */
    void mo20184a(Fragment fragment);

    /* renamed from: a */
    void mo20185a(AbstractC5090a aVar);

    /* renamed from: a */
    void mo20186a(AbstractC5091b bVar);

    /* renamed from: a */
    void mo20187a(AbstractC5093d dVar);

    /* renamed from: a */
    void mo20188a(String str);

    /* renamed from: a */
    void mo20189a(String str, AbstractC5092c cVar);

    /* renamed from: b */
    AbstractC68307f<Boolean> mo20190b(boolean z);

    /* renamed from: b */
    void mo20191b();

    /* renamed from: b */
    void mo20192b(Fragment fragment);

    /* renamed from: b */
    void mo20193b(AbstractC5090a aVar);

    /* renamed from: b */
    void mo20194b(AbstractC5093d dVar);
}
