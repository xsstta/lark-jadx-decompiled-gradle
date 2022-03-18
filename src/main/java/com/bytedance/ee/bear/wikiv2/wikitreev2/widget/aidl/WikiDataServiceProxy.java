package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl;

import android.os.IBinder;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.BinderWikiDataService;

public class WikiDataServiceProxy implements AbstractC10952a<AbstractC12448b> {
    /* renamed from: a */
    public AbstractC12448b mo16349b(IBinder iBinder) {
        return BinderWikiDataService.Stub.asInterface(iBinder);
    }
}
