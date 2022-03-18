package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.p250a.C4366m;
import com.bytedance.ee.bear.basesdk.p251b.C4443a;
import com.bytedance.ee.bear.document.C6282w;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.launch.task.ILaunchTask;
import java.util.ArrayList;
import java.util.List;

public class EditorTask extends BaseTask {

    /* renamed from: c */
    private C6282w f30749c;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DocsCentralTask.class);
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.task.BaseTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        C13479a.m54764b("EditorTask", "onCreate()...");
        C6282w wVar = new C6282w(this.f30744a);
        this.f30749c = wVar;
        wVar.mo25263a();
        C4443a.m18372a();
        C4366m.m18008a();
    }
}
