package com.bytedance.ee.bear.list.listsync;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.C8677r;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.list.listsync.AbstractC8562b;
import com.bytedance.ee.bear.list.listsync.entity.SyncPushConfig;
import com.bytedance.ee.bear.middleground.drive.export.AbstractC9365d;
import com.bytedance.ee.bear.middleground.drive.export.C9366e;
import com.bytedance.ee.bear.middleground.drive.export.PushPayload;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.callback.AbstractC10927c;
import com.bytedance.ee.bear.service.callback.C10918a;
import com.bytedance.ee.bear.service.callback.ProcessLifecycle;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;

public class ListSyncManager {

    /* renamed from: a */
    public final List<Document> f23202a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public SyncPushConfig f23203b;

    /* renamed from: c */
    public volatile AccountService.Account f23204c;

    /* renamed from: d */
    public final AbstractC8562b f23205d;

    /* renamed from: e */
    public volatile long f23206e;

    /* renamed from: f */
    public boolean f23207f;

    /* renamed from: g */
    public RunnableC8558d f23208g = new RunnableC8558d(this);

    /* renamed from: h */
    public volatile int f23209h;

    /* renamed from: i */
    private final C10917c f23210i;

    /* renamed from: j */
    private C8559e f23211j;

    /* renamed from: k */
    private final LifecycleOwner f23212k;

    /* renamed from: l */
    private final AbstractC8531b f23213l;

    /* renamed from: m */
    private BinderAccountChangeCallback.Stub f23214m = new AccountChangeCb(this);

    /* renamed from: n */
    private RunnableC8555a f23215n = new RunnableC8555a(this);

    /* renamed from: o */
    private RunnableC8560f f23216o = new RunnableC8560f(this);

    /* renamed from: p */
    private AbstractC10927c<ProcessLifecycle> f23217p = new C8557c();

    /* renamed from: q */
    private LiveData<Boolean> f23218q;

    /* renamed from: r */
    private AbstractC1178x<Boolean> f23219r;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.listsync.ListSyncManager$e */
    public class C8559e implements AbstractC9365d {

        /* renamed from: a */
        public volatile String f23224a;

        /* renamed from: c */
        private Runnable f23226c;

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9365d
        /* renamed from: a */
        public void mo33401a() {
            C13479a.m54764b("ListSyncManager", "onMessageLoss()");
            ListSyncManager.this.f23205d.mo33410a();
        }

        /* renamed from: a */
        public void mo33403a(Runnable runnable) {
            this.f23226c = runnable;
        }

        private C8559e() {
            this.f23224a = "";
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9365d
        /* renamed from: a */
        public void mo33404a(String str) {
            C13479a.m54764b("ListSyncManager", "onRegisterSuccess()...subscribeSign = " + str);
            ListSyncManager.this.f23209h = 2;
            this.f23224a = str;
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9365d
        /* renamed from: b */
        public void mo33407b(Throwable th) {
            C13479a.m54759a("ListSyncManager", "onUnregisterFailed() ", th);
            Runnable runnable = this.f23226c;
            if (runnable != null) {
                runnable.run();
            }
            this.f23226c = null;
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9365d
        /* renamed from: a */
        public void mo33405a(Throwable th) {
            C13479a.m54759a("ListSyncManager", "onRegisterFailed() ", th);
            ListSyncManager.this.f23209h = 3;
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9365d
        /* renamed from: b */
        public void mo33406b(String str) {
            C13479a.m54764b("ListSyncManager", "onUnregisterSuccess()...subscribeSign = " + str);
            Runnable runnable = this.f23226c;
            if (runnable != null) {
                runnable.run();
            }
            this.f23226c = null;
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9365d
        /* renamed from: a */
        public void mo33402a(PushPayload pushPayload) {
            C13479a.m54764b("ListSyncManager", "pushCallback sign=" + this.f23224a + " payload=" + pushPayload);
            if (pushPayload != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long allowed_time_offset = ListSyncManager.this.f23203b.getAllowed_time_offset();
                long j = pushPayload.event_time * 1000;
                if (ListSyncManager.this.f23203b.isEnable_msg_time_check()) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > allowed_time_offset || ListSyncManager.this.f23206e > j) {
                        C13479a.m54775e("ListSyncManager", "handlePush() msg event time more than 3 minutes, ignore it, payloadEventType=" + pushPayload.event_type + " token=" + C13598b.m55200g(pushPayload.node_token) + " offsetTime=" + j2);
                        return;
                    }
                }
                if (!C8677r.m36258a().mo33682a(pushPayload.file_type)) {
                    C13479a.m54764b("ListSyncManager", "onPush()...unknown type = " + pushPayload.file_type);
                    return;
                }
                ListSyncManager.this.f23205d.mo33413a(pushPayload);
            }
        }
    }

    /* renamed from: a */
    public void mo33390a() {
        this.f23203b = SyncPushConfig.instance();
        this.f23211j = new C8559e();
        this.f23204c = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        m35690c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.listsync.ListSyncManager$a */
    public static class RunnableC8555a implements Runnable {

        /* renamed from: a */
        private final WeakReference<ListSyncManager> f23220a;

        public void run() {
            C13479a.m54764b("ListSyncManager", "BackGroundSleepRunnable#run()...");
            if (this.f23220a.get() == null) {
                C13479a.m54764b("ListSyncManager", "mRef.get() is null");
            } else {
                this.f23220a.get().mo33392a((Runnable) null);
            }
        }

        public RunnableC8555a(ListSyncManager listSyncManager) {
            this.f23220a = new WeakReference<>(listSyncManager);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.listsync.ListSyncManager$d */
    public static class RunnableC8558d implements Runnable {

        /* renamed from: a */
        private final WeakReference<ListSyncManager> f23223a;

        public void run() {
            C13479a.m54764b("ListSyncManager", "ProcessStartRunnable#run()...");
            if (this.f23223a.get() == null) {
                C13479a.m54764b("ListSyncManager", "mRef.get() is null");
                return;
            }
            ListSyncManager listSyncManager = this.f23223a.get();
            if (!listSyncManager.f23207f) {
                listSyncManager.mo33395b(listSyncManager.f23202a);
            }
        }

        public RunnableC8558d(ListSyncManager listSyncManager) {
            this.f23223a = new WeakReference<>(listSyncManager);
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.listsync.ListSyncManager$f */
    private static class RunnableC8560f implements Runnable {

        /* renamed from: a */
        private final WeakReference<ListSyncManager> f23227a;

        /* renamed from: b */
        private List<Document> f23228b;

        public void run() {
            C13479a.m54764b("ListSyncManager", "UnRegisterSyncRunnable#run()...");
            if (this.f23227a.get() == null) {
                C13479a.m54764b("ListSyncManager", "mRef.get() is null");
            } else if (C13657b.m55421a(this.f23228b)) {
                C13479a.m54764b("ListSyncManager", "documents is empty");
            } else {
                this.f23227a.get().mo33395b(this.f23228b);
            }
        }

        /* renamed from: a */
        public void mo33408a(List<Document> list) {
            this.f23228b = list;
        }

        public RunnableC8560f(ListSyncManager listSyncManager) {
            this.f23227a = new WeakReference<>(listSyncManager);
        }
    }

    /* renamed from: c */
    private void m35690c() {
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(this.f23214m);
        C10918a.m45418a(ProcessLifecycle.class, (AbstractC10927c) this.f23217p);
        m35691d();
        this.f23205d.mo33412a(new C8556b());
    }

    /* renamed from: d */
    private void m35691d() {
        if (this.f23212k == null) {
            C13479a.m54764b("ListSyncManager", "observeAppForeground()...mOwner is null");
            return;
        }
        this.f23218q = C5102ai.m20872j().mo20215g();
        $$Lambda$ListSyncManager$pNMAyqU2WZYUxriTRNWI9ljkss r0 = new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.listsync.$$Lambda$ListSyncManager$pNMAyqU2WZYUxriTRNWI9ljkss */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                ListSyncManager.m269704lambda$pNMAyqU2WZYUxriTRNWI9ljkss(ListSyncManager.this, (Boolean) obj);
            }
        };
        this.f23219r = r0;
        this.f23218q.mo5925a(r0);
    }

    /* renamed from: b */
    public void mo33394b() {
        C13479a.m54764b("ListSyncManager", "destroy()...");
        ((an) KoinJavaComponent.m268610a(an.class)).mo16404b(this.f23214m);
        this.f23214m = null;
        LiveData<Boolean> liveData = this.f23218q;
        if (liveData != null) {
            liveData.mo5928b(this.f23219r);
            this.f23218q = null;
        }
        C13748k.m55735c(this.f23216o);
        this.f23216o = null;
        C13748k.m55735c(this.f23215n);
        this.f23215n = null;
        C13748k.m55735c(this.f23208g);
        this.f23208g = null;
        C10918a.m45426b(ProcessLifecycle.class, this.f23217p);
        this.f23217p = null;
        mo33392a((Runnable) null);
        this.f23211j = null;
        this.f23205d.mo33412a((AbstractC8562b.AbstractC8563a) null);
        this.f23205d.mo33416b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.listsync.ListSyncManager$b */
    public class C8556b implements AbstractC8562b.AbstractC8563a {
        private C8556b() {
        }

        @Override // com.bytedance.ee.bear.list.listsync.AbstractC8562b.AbstractC8563a
        /* renamed from: a */
        public void mo33397a(Document document) {
            C13479a.m54764b("ListSyncManager", "ListElementChangeCallback#onAdd()...");
            if (document != null) {
                ListSyncManager.this.f23202a.add(0, document);
            }
        }

        @Override // com.bytedance.ee.bear.list.listsync.AbstractC8562b.AbstractC8563a
        /* renamed from: a */
        public void mo33398a(String str) {
            C13479a.m54764b("ListSyncManager", "ListElementChangeCallback#onRemove()...");
            for (int size = ListSyncManager.this.f23202a.size() - 1; size >= 0; size--) {
                Document document = ListSyncManager.this.f23202a.get(size);
                if (TextUtils.equals(document.mo32472o(), str)) {
                    ListSyncManager.this.f23202a.remove(document);
                    C13479a.m54764b("ListSyncManager", "remove register document");
                    return;
                }
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.listsync.ListSyncManager$c */
    private class C8557c implements AbstractC10927c<ProcessLifecycle> {
        private C8557c() {
        }

        /* renamed from: a */
        public void callback(Class<ProcessLifecycle> cls, ProcessLifecycle processLifecycle) {
            C13479a.m54764b("ListSyncManager", "onProcessStart()... " + processLifecycle);
            if (processLifecycle.getProcessSate() == ProcessLifecycle.ProcessSate.START && C13629i.m55306b(processLifecycle.getProcessName())) {
                C13748k.m55735c(ListSyncManager.this.f23208g);
                C13748k.m55733a(ListSyncManager.this.f23208g, 5000);
            }
        }
    }

    /* renamed from: a */
    public void mo33391a(FolderSortStrategy folderSortStrategy) {
        this.f23205d.mo33411a(folderSortStrategy);
    }

    private static class AccountChangeCb extends BinderAccountChangeCallback.Stub {
        private final WeakReference<ListSyncManager> ref;

        public AccountChangeCb(ListSyncManager listSyncManager) {
            this.ref = new WeakReference<>(listSyncManager);
        }

        @Override // com.bytedance.ee.bear.contract.AccountService.AbstractC4981a
        public void onChange(AccountService.Account account) {
            C13479a.m54764b("ListSyncManager", "BinderAccountChangeCallback onChange()...account = " + account);
            ListSyncManager listSyncManager = this.ref.get();
            if (listSyncManager == null) {
                C13479a.m54764b("ListSyncManager", "mRef.get() is null");
            } else if (account == null) {
                C13479a.m54764b("ListSyncManager", "account is null");
            } else if (listSyncManager.f23204c == null || !TextUtils.equals(listSyncManager.f23204c.f14584a, account.f14584a)) {
                listSyncManager.mo33392a((Runnable) null);
                listSyncManager.f23204c = account;
            } else {
                C13479a.m54764b("ListSyncManager", "account is the same");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35689a(Boolean bool) {
        C13479a.m54764b("ListSyncManager", "onAppVisibleChanged()...isVisible = " + bool);
        if (bool.booleanValue()) {
            C13748k.m55735c(this.f23215n);
            this.f23213l.mo33361q();
            this.f23207f = false;
            return;
        }
        C13748k.m55735c(this.f23215n);
        C13748k.m55733a(this.f23215n, C5102ai.m20872j().mo20216h());
        this.f23207f = true;
    }

    /* renamed from: a */
    public void mo33392a(Runnable runnable) {
        if (this.f23204c == null) {
            C13479a.m54764b("ListSyncManager", "unRegisterSyncInternal mAccount is null");
            return;
        }
        C8559e eVar = this.f23211j;
        if (eVar == null || TextUtils.isEmpty(eVar.f23224a)) {
            C13479a.m54764b("ListSyncManager", "unRegisterSyncInternal()...mCurrentSyncPushCb is null or mSubscribeSign is empty");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C13479a.m54764b("ListSyncManager", "unRegisterSyncInternal() start unregister, mSubscribeSign = " + this.f23211j.f23224a);
        this.f23211j.mo33403a(runnable);
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35634b(new C9366e.C9367a().mo35753c(this.f23211j.f23224a).mo35749a(this.f23204c.f14584a).mo35752b(String.valueOf(System.currentTimeMillis())).mo35748a(this.f23211j).mo35751a());
    }

    /* renamed from: a */
    public void mo33393a(List<Document> list) {
        this.f23216o.mo33408a(list);
        mo33392a(this.f23216o);
        C13479a.m54764b("ListSyncManager", "registerSync()...size = " + C13657b.m55424c(list));
    }

    /* renamed from: b */
    public void mo33395b(List<Document> list) {
        if (C13657b.m55421a(list)) {
            C13479a.m54764b("ListSyncManager", "registerSyncInternal documents is empty");
        } else if (this.f23204c == null) {
            C13479a.m54764b("ListSyncManager", "registerSyncInternal mAccount is null");
        } else if (this.f23209h == 1) {
            C13479a.m54764b("ListSyncManager", "registerSyncInternal mState == STATE_REGISTERING, ignore");
        } else {
            AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
            if (f != null && !TextUtils.equals(f.f14584a, this.f23204c.f14584a)) {
                C13479a.m54764b("ListSyncManager", "registerSyncInternal() mAccount not equals findUserFromCache account, update mAccount");
                this.f23204c = f;
            }
            this.f23209h = 1;
            this.f23202a.clear();
            long currentTimeMillis = System.currentTimeMillis();
            this.f23206e = currentTimeMillis;
            ArrayList arrayList = new ArrayList(this.f23203b.getRegister_size());
            for (int i = 0; i < list.size(); i++) {
                if (i < this.f23203b.getRegister_size()) {
                    Document document = list.get(i);
                    arrayList.add(new C9366e.C9368b(document.mo32472o(), (long) document.mo32483t()));
                    this.f23202a.add(document);
                }
            }
            C13479a.m54764b("ListSyncManager", "registerSyncInternal() registerDocs size=" + arrayList.size() + ", start = " + currentTimeMillis);
            if (C13616d.m55262a(C13615c.f35773a)) {
                C13479a.m54772d("ListSyncManager", "registerSyncInternal()  tokens=" + arrayList);
            }
            ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35625a(new C9366e.C9367a().mo35750a(arrayList).mo35749a(this.f23204c.f14584a).mo35752b(String.valueOf(currentTimeMillis)).mo35748a(this.f23211j).mo35751a());
        }
    }

    public ListSyncManager(AbstractC8531b bVar, LifecycleOwner lifecycleOwner, C10917c cVar, AbstractC8562b bVar2) {
        this.f23213l = bVar;
        this.f23212k = lifecycleOwner;
        this.f23210i = cVar;
        this.f23205d = bVar2;
    }
}
