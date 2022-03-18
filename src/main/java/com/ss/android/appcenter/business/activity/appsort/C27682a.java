package com.ss.android.appcenter.business.activity.appsort;

import android.app.Application;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.LiveData;
import com.ss.android.appcenter.business.net.useritems.C27767a;
import com.ss.android.appcenter.business.net.useritems.UserItemsData;

/* renamed from: com.ss.android.appcenter.business.activity.appsort.a */
public class C27682a extends C1150b {
    private C27767a mApiGetUserItems;

    public LiveData<UserItemsData> getSortPageLiveData() {
        return this.mApiGetUserItems.mo99079d();
    }

    public void requestUserItemListFromLocal() {
        this.mApiGetUserItems.mo99080e();
    }

    public void requestUserItemListFromNet() {
        this.mApiGetUserItems.mo99081f();
    }

    public C27682a(Application application) {
        super(application);
        this.mApiGetUserItems = new C27767a(application.getApplicationContext());
    }
}
