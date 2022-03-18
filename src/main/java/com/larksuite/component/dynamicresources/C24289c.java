package com.larksuite.component.dynamicresources;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.component.dynamicresources.c */
class C24289c implements DynamicResourcesFacade.ChangeResourcesExecutor {
    C24289c() {
    }

    @Override // com.larksuite.component.dynamicresources.DynamicResourcesFacade.ChangeResourcesExecutor
    public <T> void execute(final DynamicResourcesFacade.ChangeResourcesExecutor.AbstractC24276b<T> bVar, final DynamicResourcesFacade.ChangeResourcesExecutor.AbstractC24275a<T> aVar) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        Log.m165389i("DynamicResources", "ChangeDynamicResourcesExecute excute localLooper = " + myLooper + " , mainLooper = " + mainLooper);
        if (myLooper == mainLooper) {
            aVar.mo86912a(bVar.mo86913a());
            return;
        }
        Log.m165389i("DynamicResources", "not in main thread, curr thread is " + Thread.currentThread());
        new Handler(mainLooper).post(new Runnable() {
            /* class com.larksuite.component.dynamicresources.C24289c.RunnableC242901 */

            public void run() {
                aVar.mo86912a(bVar.mo86913a());
            }
        });
    }
}
