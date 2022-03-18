package com.bytedance.ee.bear.todocenter.push;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.callback.AbstractC10927c;
import com.bytedance.ee.bear.service.callback.C10918a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import io.reactivex.functions.Consumer;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.todocenter.push.c */
public class C11710c {

    /* renamed from: a */
    private static final Object f31500a = "TODO_NOTICE_";

    /* renamed from: b */
    private final C10917c f31501b = new C10917c(new C10929e());

    /* renamed from: c */
    private Handler f31502c;

    /* renamed from: d */
    private AbstractC11709b f31503d;

    /* renamed from: e */
    private AbstractC10927c<TodoPushIPCEntity> f31504e;

    /* renamed from: a */
    public void mo44863a() {
        try {
            this.f31501b.mo41508c(AbstractC11711d.class).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48480d()).mo238001b($$Lambda$tz1YO1VXoVI0MsxtdDadzGeMLIM.INSTANCE, $$Lambda$c$TzqbSfb0EhTbAEIQg_3Wrq1WM0Q.INSTANCE);
            AbstractC10927c<TodoPushIPCEntity> cVar = this.f31504e;
            if (cVar != null) {
                C10918a.m45426b(TodoPushIPCEntity.class, cVar);
            }
            this.f31503d = null;
        } catch (Exception e) {
            C13479a.m54761a("TodoPushWrapper", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48552a(TodoPushIPCEntity todoPushIPCEntity) {
        m48554a(todoPushIPCEntity.json);
    }

    /* renamed from: a */
    private void m48554a(String str) {
        C13479a.m54772d("TodoPushWrapper", "=====>>>>>: " + str);
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("TodoPushWrapper", "_handleMessage: json is Empty");
        } else if (this.f31503d != null) {
            try {
                TodoPushEntity todoPushEntity = (TodoPushEntity) JSON.parseObject(new JSONObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("body").getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), TodoPushEntity.class);
                if (todoPushEntity.type == 1) {
                    this.f31503d.mo44861a(todoPushEntity.getData());
                } else if (todoPushEntity.type == 0) {
                    this.f31503d.mo44862b(todoPushEntity.getData());
                } else {
                    C13479a.m54764b("TodoPushWrapper", "_handleMessage unknown");
                }
            } catch (Exception e) {
                C13479a.m54761a("TodoPushWrapper", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48553a(Class cls, TodoPushIPCEntity todoPushIPCEntity) {
        C13479a.m54764b("TodoPushWrapper", "callback: " + todoPushIPCEntity);
        this.f31502c.post(new Runnable(todoPushIPCEntity) {
            /* class com.bytedance.ee.bear.todocenter.push.$$Lambda$c$on91sSdNvUDmBa35ZRn5QO4la0 */
            public final /* synthetic */ TodoPushIPCEntity f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C11710c.this.m48552a((C11710c) this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo44864a(int i, AbstractC11709b bVar) {
        if (this.f31502c != null) {
            C13479a.m54764b("TodoPushWrapper", "already register");
            return;
        }
        this.f31503d = bVar;
        this.f31502c = CoreThreadPool.getSerialTaskHandler();
        $$Lambda$c$jxBCm9P0qBQMWgxGJYrHfuIKOGA r0 = new AbstractC10927c() {
            /* class com.bytedance.ee.bear.todocenter.push.$$Lambda$c$jxBCm9P0qBQMWgxGJYrHfuIKOGA */

            @Override // com.bytedance.ee.bear.service.callback.AbstractC10927c
            public final void callback(Class cls, Object obj) {
                C11710c.this.m48553a((C11710c) cls, (Class) ((TodoPushIPCEntity) obj));
            }
        };
        this.f31504e = r0;
        C10918a.m45418a(TodoPushIPCEntity.class, (AbstractC10927c) r0);
        this.f31501b.mo41508c(AbstractC11711d.class).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48480d()).mo238001b(new Consumer(i) {
            /* class com.bytedance.ee.bear.todocenter.push.$$Lambda$c$oSNzCCq5w_WDfhmG6ykTtKrcoyM */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC11711d) obj).registerTodoPushListener(this.f$0);
            }
        }, $$Lambda$c$lJsBabK3Auasa3bMvJh1bnI2nmI.INSTANCE);
    }
}
