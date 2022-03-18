package com.bytedance.ee.bear.bitable.card.view.p258a;

import android.view.View;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.f */
public interface AbstractC4549f {

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.f$a */
    public interface AbstractC4550a {
        /* renamed from: a */
        void mo17927a();

        /* renamed from: a */
        void mo17928a(boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.f$b */
    public interface AbstractC4551b {
        /* renamed from: a */
        void mo17929a(String str);
    }

    /* renamed from: a */
    void mo17911a(int i);

    /* renamed from: a */
    void mo17912a(C4525a aVar);

    /* renamed from: a */
    void mo17913a(AbstractC4550a aVar);

    /* renamed from: a */
    void mo17914a(String str);

    /* renamed from: a */
    boolean mo17915a();

    /* renamed from: b */
    void mo17916b();

    /* renamed from: b */
    void mo17917b(AbstractC4550a aVar);

    int getCurrentScrollPosition();

    View getRootView();

    View getTitleBar();

    void setAddRecordTitleBarVisibility(Boolean bool);

    void setFiltered(boolean z);

    void setHeaderColor(int i);

    void setTitle(C4537a aVar);

    void setUpdateCardStatusListener(AbstractC4551b bVar);

    void setVisitPermission(boolean z);
}
