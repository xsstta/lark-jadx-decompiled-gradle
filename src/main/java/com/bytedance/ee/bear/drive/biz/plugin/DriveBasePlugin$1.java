package com.bytedance.ee.bear.drive.biz.plugin;

import com.bytedance.ee.bear.drive.services.BinderIPluginUpdateCallback;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* access modifiers changed from: package-private */
public class DriveBasePlugin$1 extends BinderIPluginUpdateCallback.Stub {
    final /* synthetic */ AbstractC6533b this$0;

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n.AbstractC7198a
    public void onStart() {
        C13479a.m54764b(this.this$0.f17982b, "checkInstallPlugin() onStart");
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n.AbstractC7198a
    public void onSuccess() {
        C13479a.m54764b(this.this$0.f17982b, "checkInstallPlugin() onSuccess");
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.plugin.$$Lambda$DriveBasePlugin$1$BSkaRHN51KH6nSWHe8OHnIgpaZs */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DriveBasePlugin$1.this.lambda$onSuccess$0$DriveBasePlugin$1((String) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.plugin.$$Lambda$DriveBasePlugin$1$3NO_tgjUSp8ffGobKvgVe6Lbmkw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DriveBasePlugin$1.this.lambda$onSuccess$1$DriveBasePlugin$1((Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.plugin.$$Lambda$DriveBasePlugin$1$SmtoIxmfHHLxYaSYi2GCbTNck4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DriveBasePlugin$1.this.lambda$onSuccess$2$DriveBasePlugin$1((Throwable) obj);
            }
        });
    }

    DriveBasePlugin$1(AbstractC6533b bVar) {
        this.this$0 = bVar;
    }

    public /* synthetic */ void lambda$onSuccess$2$DriveBasePlugin$1(Throwable th) throws Exception {
        C13479a.m54761a(this.this$0.f17982b, th);
    }

    public /* synthetic */ void lambda$onSuccess$1$DriveBasePlugin$1(Boolean bool) throws Exception {
        String str = this.this$0.f17982b;
        C13479a.m54764b(str, "init by lark install plugin result=" + bool);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n.AbstractC7198a
    public void onProgressUpdate(int i) {
        if (i == 100) {
            String str = this.this$0.f17982b;
            C13479a.m54764b(str, "checkInstallPlugin() onProgressUpdate progress=" + i);
        }
    }

    public /* synthetic */ Boolean lambda$onSuccess$0$DriveBasePlugin$1(String str) throws Exception {
        String str2 = this.this$0.f17982b;
        C13479a.m54764b(str2, "install " + this.this$0.mo26079b() + " plugin onSuccess,current is init=" + this.this$0.f17983c.get() + ", start check init.");
        this.this$0.mo26084f();
        return Boolean.valueOf(this.this$0.f17983c.get());
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7197n.AbstractC7198a
    public void onFailed(int i, String str) {
        String str2 = this.this$0.f17982b;
        C13479a.m54764b(str2, "checkInstallPlugin() onFailed errorCode=" + i + " msg=" + str);
    }
}
