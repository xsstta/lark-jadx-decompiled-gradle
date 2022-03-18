package com.bytedance.ee.bear.wiki;

import android.os.IBinder;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;
import com.bytedance.ee.bear.wiki.BinderWikiService;

public class WikiServiceProxy implements AbstractC10952a<AbstractC11955g> {
    /* renamed from: a */
    public AbstractC11955g mo16349b(IBinder iBinder) {
        return BinderWikiService.Stub.asInterface(iBinder);
    }
}
