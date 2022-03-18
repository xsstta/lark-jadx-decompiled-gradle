package com.bytedance.ee.bear.todocenter.p563a;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.todocenter.entity.AbstractC11690a;
import com.bytedance.ee.bear.todocenter.entity.TodoList;
import com.bytedance.ee.bear.todocenter.model.C11694b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.concurrent.Callable;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.todocenter.a.a */
public class C11685a {

    /* renamed from: com.bytedance.ee.bear.todocenter.a.a$a */
    private static class C11686a {

        /* renamed from: a */
        public static C11685a f31477a = new C11685a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m48492a(Boolean bool) throws Exception {
    }

    /* renamed from: a */
    public static C11685a m48489a() {
        return C11686a.f31477a;
    }

    /* renamed from: b */
    private AbstractC68307f<File> m48494b() {
        return AbstractC68307f.m265099b((Callable) $$Lambda$a$h0LlG1IvczLv0gQ13lNms0I14ho.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ File m48496c() throws Exception {
        new C10917c(new C10929e());
        AccountService.Account d = ((an) KoinJavaComponent.m268610a(an.class)).mo16406d();
        C13479a.m54764b("TodoCacheManager", "getCacheDir uid: " + d.f14584a);
        File cacheDir = C13615c.f35773a.getCacheDir();
        File file = new File(cacheDir, "todocenter_" + d.f14584a);
        file.mkdirs();
        return file;
    }

    /* renamed from: a */
    public AbstractC68307f<TodoList> mo44783a(int i) {
        return m48494b().mo238020d(new Function(i) {
            /* class com.bytedance.ee.bear.todocenter.p563a.$$Lambda$a$IzQIPegZLvgsKtYdcI98E4g7Z4Y */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11685a.m48495b(this.f$0, (File) obj);
            }
        }).mo238014c(new Function(i) {
            /* class com.bytedance.ee.bear.todocenter.p563a.$$Lambda$a$Cj5_AKmMr0Dz1aHmMhIu14N98qo */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11685a.m48491a(this.f$0, (File) obj);
            }
        }).mo238020d(new C11694b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ File m48495b(int i, File file) throws Exception {
        return new File(file, "todo_cache_" + i + ".json");
    }

    /* renamed from: a */
    public void mo44784a(int i, String str) {
        m48494b().mo238020d(new Function(i, str) {
            /* class com.bytedance.ee.bear.todocenter.p563a.$$Lambda$a$P_m6ZxL3HKLRiiNR5pHaU5dHc */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11685a.m48490a(this.f$0, this.f$1, (File) obj);
            }
        }).mo238001b($$Lambda$a$q9EkRVqSs7RnDllznDMdVAHFAU4.INSTANCE, $$Lambda$a$75_ctBXbyxXr0kwLmkFtDTLFp6I.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m48491a(int i, File file) throws Exception {
        byte[] e = C13675f.m55530e(file);
        if (e == null) {
            return AbstractC68307f.m265084a((Throwable) new IllegalStateException("no local cache"));
        }
        C13479a.m54764b("TodoCacheManager", "cache getTodoList type: " + AbstractC11690a.CC.m48503a(i) + " success");
        return AbstractC68307f.m265083a((TodoList) JSON.parseObject(e, TodoList.class, new Feature[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m48490a(int i, String str, File file) throws Exception {
        boolean a = C13675f.m55507a(str.getBytes(), new File(file, "todo_cache_" + i + ".json"));
        C13479a.m54764b("TodoCacheManager", "updateCache type: " + AbstractC11690a.CC.m48503a(i) + " success: " + a);
        return Boolean.valueOf(a);
    }
}
