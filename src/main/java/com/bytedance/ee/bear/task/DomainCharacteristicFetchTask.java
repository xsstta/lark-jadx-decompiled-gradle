package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import org.koin.java.KoinJavaComponent;

public class DomainCharacteristicFetchTask extends BaseAsyncLaunchTask {
    @Override // com.bytedance.ee.bear.task.BaseAsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        ((AbstractC6307e) KoinJavaComponent.m268610a(AbstractC6307e.class)).mo17334a();
        C6313i.m25327a().mo25383a(this.f30742a);
        C6313i.m25327a().mo25386a(((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e());
    }
}
