package com.ss.android.lark.sticker.p2714a;

import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.dependency.IStickerModuleDependency;
import com.ss.android.lark.sticker.dto.C55077c;
import com.ss.android.lark.sticker.p2715b.AbstractC55065a;
import com.ss.android.lark.sticker.p2715b.AbstractC55067c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.sticker.a.g */
public class C55007g {

    /* renamed from: a */
    public static String f135949a = C55049o.m213735a(C54996a.m213619a().mo144097a());

    /* renamed from: b */
    public boolean f135950b;

    /* renamed from: c */
    public boolean f135951c;

    /* renamed from: d */
    public String f135952d;

    /* renamed from: e */
    public AbstractC55067c f135953e;

    /* renamed from: f */
    private List<C55010b> f135954f;

    /* renamed from: g */
    private ExecutorService f135955g;

    /* renamed from: com.ss.android.lark.sticker.a.g$a */
    public static class C55009a {

        /* renamed from: a */
        public List<String> f135956a = new ArrayList();

        /* renamed from: b */
        public boolean f135957b = false;

        /* renamed from: c */
        public String f135958c;

        /* renamed from: d */
        private IStickerModuleDependency.AbstractC55074e f135959d;

        /* renamed from: a */
        public C55007g mo187835a() {
            return new C55007g(this);
        }

        /* renamed from: a */
        public C55009a mo187834a(boolean z) {
            this.f135957b = z;
            return this;
        }

        /* renamed from: a */
        public C55009a mo187833a(List<String> list) {
            this.f135956a = m213665b(list);
            return this;
        }

        public C55009a(IStickerModuleDependency.AbstractC55074e eVar) {
            this.f135959d = eVar;
        }

        /* renamed from: b */
        private List<String> m213665b(List<String> list) {
            ArrayList arrayList = new ArrayList(list);
            Map<String, C55077c> a = this.f135959d.mo144104a(C55007g.f135949a, list);
            ArrayList arrayList2 = new ArrayList();
            for (C55077c cVar : a.values()) {
                arrayList2.add(cVar.mo187955a());
            }
            arrayList.removeAll(arrayList2);
            return arrayList;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.sticker.a.g$b */
    public static class C55010b {

        /* renamed from: a */
        public List<String> f135960a = new ArrayList();

        protected C55010b() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.sticker.a.g$c */
    public class RunnableC55011c implements Runnable {

        /* renamed from: b */
        private C55010b f135962b;

        /* renamed from: c */
        private AbstractC55065a f135963c;

        public void run() {
            if (!C55007g.this.f135950b) {
                this.f135963c.mo187819a(this.f135962b.f135960a);
                return;
            }
            this.f135963c.mo187818a(this.f135962b.f135960a.get(0), C55007g.this.f135953e);
        }

        public RunnableC55011c(C55010b bVar) {
            this.f135962b = bVar;
            this.f135963c = new C54997b(C55007g.this.f135951c, C55007g.this.f135952d);
        }
    }

    /* renamed from: a */
    private void m213663a(AbstractC55067c cVar) {
        this.f135953e = cVar;
        for (C55010b bVar : this.f135954f) {
            this.f135955g.execute(new RunnableC55011c(bVar));
        }
    }

    private C55007g(C55009a aVar) {
        this.f135955g = CoreThreadPool.getDefault().getFixedThreadPool();
        this.f135950b = aVar.f135956a.size() != 1 ? false : true;
        this.f135954f = m213662a(aVar.f135956a);
        this.f135951c = aVar.f135957b;
        this.f135952d = aVar.f135958c;
    }

    /* renamed from: a */
    private List<C55010b> m213662a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() <= 8) {
            for (String str : list) {
                C55010b bVar = new C55010b();
                bVar.f135960a.addAll(Collections.singletonList(str));
                arrayList.add(bVar);
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                String str2 = list.get(i);
                int i2 = i % 8;
                if (arrayList.size() <= i2) {
                    C55010b bVar2 = new C55010b();
                    bVar2.f135960a.add(str2);
                    arrayList.add(bVar2);
                } else {
                    ((C55010b) arrayList.get(i2)).f135960a.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m213664a(List<String> list, IStickerModuleDependency.AbstractC55074e eVar) {
        if (!CollectionUtils.isEmpty(list)) {
            new C55009a(eVar).mo187833a(list).mo187834a(true).mo187835a().m213663a((AbstractC55067c) null);
        }
    }
}
