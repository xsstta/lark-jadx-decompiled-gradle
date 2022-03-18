package com.ss.android.appcenter.business.tab.business.widget;

import android.app.Application;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.LiveData;
import com.ss.android.appcenter.common.util.C28182f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.appcenter.business.tab.business.widget.l */
public class C27971l extends C1150b {
    private C27966j mWidgetDataSource = new C27966j();
    private Set<AbstractC27972a> mWidgetTaskSet = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.l$a */
    public interface AbstractC27972a {
        /* renamed from: a */
        void mo99638a();

        /* renamed from: b */
        C27965i mo99639b();

        /* renamed from: c */
        void mo99640c();
    }

    public void clearReloadTask() {
        this.mWidgetTaskSet.clear();
    }

    public void onTabSwitch() {
        for (AbstractC27972a aVar : this.mWidgetTaskSet) {
            aVar.mo99640c();
        }
    }

    public void reload() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC27972a aVar : this.mWidgetTaskSet) {
            aVar.mo99638a();
            if (aVar.mo99639b() != null) {
                arrayList.add(aVar.mo99639b());
            }
        }
        if (!C28182f.m103238c(arrayList)) {
            this.mWidgetDataSource.mo99693a(false, (List<C27965i>) arrayList);
        }
    }

    public void init(boolean z) {
        this.mWidgetDataSource.mo99691a(z);
    }

    public void registerReloadTask(AbstractC27972a aVar) {
        this.mWidgetTaskSet.add(aVar);
    }

    public LiveData<WidgetData> registerWidget(C27965i iVar) {
        return this.mWidgetDataSource.mo99688a(iVar);
    }

    public C27971l(Application application) {
        super(application);
    }

    public void onPush(List<WidgetData> list) {
        for (WidgetData widgetData : list) {
            this.mWidgetDataSource.mo99690a(widgetData);
        }
    }

    public void requestWidgetDataFromNet(boolean z, C27965i iVar) {
        this.mWidgetDataSource.mo99692a(z, iVar);
    }
}
