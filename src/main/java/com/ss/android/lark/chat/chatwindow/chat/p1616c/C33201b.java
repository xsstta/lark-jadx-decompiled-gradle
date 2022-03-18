package com.ss.android.lark.chat.chatwindow.chat.p1616c;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1617a.AbstractC33200e;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1617a.C33194a;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1617a.C33195b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1617a.C33196c;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b.AbstractC33208c;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b.C33204a;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b.C33207b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b.C33209d;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b.C33210e;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.AbstractC33211a;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33212b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33213c;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33214d;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33215e;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33216f;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33217g;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.b */
public class C33201b {

    /* renamed from: a */
    private final C33193a f85403a;

    /* renamed from: b */
    private final Map<Class<? extends AbstractC33211a>, AbstractC33208c> f85404b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.b$a */
    public static final class C33203a {

        /* renamed from: a */
        public static final C33201b f85407a = new C33201b(null);
    }

    /* renamed from: a */
    public static C33201b m128282a() {
        return C33203a.f85407a;
    }

    private C33201b() {
        this.f85403a = new C33193a();
        this.f85404b = new HashMap(5);
        mo122420a(C33213c.class, new C33207b(), new C33195b());
        mo122420a(C33212b.class, new C33204a(), new C33194a());
        mo122419a(C33217g.class, new C33210e());
        mo122419a(C33216f.class, new C33209d());
    }

    /* synthetic */ C33201b(C332021 r1) {
        this();
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.b$1 */
    class C332021 implements IGetDataCallback<C33215e> {

        /* renamed from: a */
        final /* synthetic */ C33215e f85405a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f85406b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            this.f85405a.mo122444a(errorResult);
            this.f85406b.countDown();
        }

        /* renamed from: a */
        public void onSuccess(C33215e eVar) {
            this.f85405a.mo122445a(eVar.mo122443a());
            this.f85405a.mo122444a(eVar.mo122446b());
            this.f85406b.countDown();
        }
    }

    /* renamed from: a */
    public AbstractC33208c mo122417a(AbstractC33211a aVar) {
        return this.f85404b.get(aVar.getClass());
    }

    /* renamed from: b */
    public void mo122421b(AbstractC33211a aVar) {
        AbstractC33208c a = mo122417a(aVar);
        if (a == null) {
            Log.m165383e("DataPreLoadManager", "Could not find a loader for target task");
            return;
        }
        this.f85403a.mo122406a(new C33214d(C33196c.m128273a().mo122414a(aVar), aVar), a);
    }

    /* renamed from: a */
    public <Task extends AbstractC33211a, DATA> void mo122419a(Class<Task> cls, AbstractC33208c<Task, C33215e<DATA>> cVar) {
        mo122420a(cls, cVar, null);
    }

    /* renamed from: a */
    public void mo122418a(AbstractC33211a aVar, IGetDataCallback<C33215e> iGetDataCallback) {
        this.f85403a.mo122407a(C33196c.m128273a().mo122416b(aVar), aVar, iGetDataCallback);
    }

    /* renamed from: a */
    public <Task extends AbstractC33211a, DATA> void mo122420a(Class<Task> cls, AbstractC33208c<Task, C33215e<DATA>> cVar, AbstractC33200e<Task> eVar) {
        this.f85404b.put(cls, cVar);
        if (eVar != null) {
            C33196c.m128273a().mo122415a(cls, eVar);
        }
    }
}
