package com.bytedance.ee.bear.wiki;

import android.os.IBinder;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;
import com.bytedance.ee.bear.wiki.BinderWikiListDataService;

public class WikiListDataServiceProxy implements AbstractC10952a<AbstractC11940d> {
    /* renamed from: a */
    public AbstractC11940d mo16349b(IBinder iBinder) {
        return BinderWikiListDataService.Stub.asInterface(iBinder);
    }
}
