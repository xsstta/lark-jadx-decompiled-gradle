package com.bytedance.ee.bear.drive.biz.comment.data;

import androidx.collection.C0513a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.rn.AbstractC10636d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13742g;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.comment.data.b */
public class C6377b {

    /* renamed from: a */
    private AreaCommentFetcher f17652a = new AreaCommentFetcher((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: b */
    private C68289a f17653b = new C68289a();

    /* renamed from: c */
    private Disposable f17654c;

    /* renamed from: d */
    private volatile boolean f17655d;

    /* renamed from: e */
    private C7086a f17656e;

    /* renamed from: f */
    private ArrayList<CommentRectF> f17657f = new ArrayList<>();

    /* renamed from: g */
    private C0513a<AbstractC6379b> f17658g = new C0513a<>(2);

    /* renamed from: h */
    private C0513a<AbstractC6378a> f17659h = new C0513a<>(2);

    /* renamed from: i */
    private C6923a f17660i = C6920b.m27342f().mo27168c();

    /* renamed from: j */
    private AbstractC10636d.AbstractC10637a f17661j;

    /* renamed from: k */
    private boolean f17662k = false;

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.data.b$a */
    public interface AbstractC6378a {
        /* renamed from: a */
        void mo25622a(CommentRectF commentRectF);

        /* renamed from: a */
        void mo25623a(CommentRectF commentRectF, Throwable th);
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.data.b$b */
    public interface AbstractC6379b {
        /* renamed from: a */
        void mo25624a(ArrayList<CommentRectF> arrayList);
    }

    /* renamed from: a */
    public void mo25609a() {
        mo25621e();
    }

    /* renamed from: c */
    public ArrayList<CommentRectF> mo25619c() {
        return this.f17657f;
    }

    /* renamed from: d */
    public boolean mo25620d() {
        return this.f17655d;
    }

    /* renamed from: a */
    public void mo25615a(boolean z) {
        boolean z2 = z != this.f17662k;
        this.f17662k = z;
        if (z2) {
            mo25621e();
        }
    }

    /* renamed from: f */
    private AbstractC10636d m25621f() {
        return (AbstractC10636d) KoinJavaComponent.m268612a(AbstractC10636d.class, null, new Function0() {
            /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$b$ObZ49C2XuanK30tInBz9jVsq4A */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6377b.this.m25624i();
            }
        });
    }

    /* renamed from: g */
    private void m25622g() {
        if (this.f17656e == null) {
            C13479a.m54758a("DriveCommentDataManager", "registerPushListener file model is null");
            return;
        }
        if (this.f17661j != null) {
            m25621f().mo40332a();
            this.f17661j = null;
        }
        this.f17661j = new AbstractC10636d.AbstractC10637a() {
            /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$b$iHrQLVf8a29bh_rHEilSzfPU */

            @Override // com.bytedance.ee.bear.rn.AbstractC10636d.AbstractC10637a
            public final void didReceivePush(String str) {
                C6377b.this.m25616b((C6377b) str);
            }
        };
        m25621f().mo40333a(this.f17661j);
    }

    /* renamed from: h */
    private ArrayList<CommentRectF> m25623h() {
        ArrayList<CommentRectF> arrayList = new ArrayList<>();
        Iterator<CommentRectF> it = this.f17657f.iterator();
        while (it.hasNext()) {
            CommentRectF next = it.next();
            if (next.mo25555a().startsWith("Drive")) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ DefinitionParameters m25624i() {
        String str;
        Object[] objArr = new Object[3];
        C7086a aVar = this.f17656e;
        if (aVar == null) {
            str = "";
        } else {
            str = aVar.mo27322a().f18785a;
        }
        objArr[0] = str;
        objArr[1] = C8275a.f22375h;
        objArr[2] = "driveCommonPushChannel";
        return C70039b.m268661a(objArr);
    }

    /* renamed from: e */
    public void mo25621e() {
        String str;
        C7086a aVar = this.f17656e;
        if (aVar == null) {
            C13479a.m54758a("DriveCommentDataManager", "registerPushListener file model is null");
            return;
        }
        AreaCommentFetcher areaCommentFetcher = this.f17652a;
        String str2 = aVar.mo27322a().f18785a;
        if (this.f17662k) {
            str = "";
        } else {
            str = this.f17656e.mo27322a().f19098q;
        }
        this.f17653b.mo237937a(areaCommentFetcher.mo25587a(str2, str).mo238020d($$Lambda$TRYepCqgqkNCoKzfX4OvLTYhj4.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$b$9ahJhTNqa2vDWAeQq7tRLU0Q6E */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6377b.this.m25619c((ArrayList) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$b$50qp4xxaruEPSPCjhqux7uRls4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6377b.this.m25612a((C6377b) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: b */
    public void mo25616b() {
        if (this.f17661j != null) {
            m25621f().mo40332a();
            this.f17661j = null;
        }
        this.f17657f.clear();
        this.f17653b.mo237935a();
        this.f17658g.clear();
        this.f17659h.clear();
    }

    /* renamed from: a */
    private void m25613a(ArrayList<CommentRectF> arrayList) {
        this.f17655d = true;
        m25617b(arrayList);
    }

    /* renamed from: b */
    public void mo25617b(AbstractC6378a aVar) {
        if (aVar != null) {
            this.f17659h.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo25611a(AbstractC6378a aVar) {
        if (aVar != null) {
            this.f17659h.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo25618b(AbstractC6379b bVar) {
        if (bVar != null) {
            this.f17658g.remove(bVar);
        }
    }

    public C6377b(C10917c cVar) {
    }

    /* renamed from: b */
    private void m25617b(ArrayList<CommentRectF> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>(0);
        }
        Iterator<AbstractC6379b> it = this.f17658g.iterator();
        while (it.hasNext()) {
            it.next().mo25624a(arrayList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m25619c(ArrayList arrayList) throws Exception {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "pull area rect finish, size=" + arrayList.size());
        ArrayList<CommentRectF> h = m25623h();
        this.f17657f = arrayList;
        arrayList.addAll(h);
        m25613a(this.f17657f);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ CommentRectF m25620d(ArrayList arrayList) throws Exception {
        C13479a.m54764b("DriveCommentDataManager", "getCommentById > " + arrayList.size());
        if (!C13657b.m55421a(arrayList)) {
            return (CommentRectF) arrayList.get(0);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25612a(Throwable th) throws Exception {
        C13479a.m54761a("DRIVE_COMMENT_FLOW", th);
        ArrayList<CommentRectF> arrayList = new ArrayList<>(m25623h());
        this.f17657f = arrayList;
        m25613a(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25616b(String str) {
        CommentRectF a = C6376a.m25606a(str, this.f17656e.mo27322a().f19098q);
        if (a == null || !a.mo25569g() || !this.f17660i.mo27214a()) {
            C13479a.m54764b("DriveCommentDataManager", "comment has quads");
            C13742g.m55705a(new Runnable(a) {
                /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$b$fKmRqplo1Eqertqzcc8TnIzia24 */
                public final /* synthetic */ CommentRectF f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C6377b.this.m25614b((C6377b) this.f$1);
                }
            });
            return;
        }
        C13479a.m54764b("DriveCommentDataManager", "request comment area");
        this.f17653b.mo237937a(mo25608a(a.mo25555a()).mo238004b(C11678b.m48478b()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$TtUA58V4gnfeGsaiGg2Z2J_uhN8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6377b.this.m25614b((CommentRectF) obj);
            }
        }, new Consumer(a) {
            /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$b$x5xfEuXxyZDwmef6ibtiQ34qjE */
            public final /* synthetic */ CommentRectF f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6377b.this.m25618c(this.f$1, (Throwable) obj);
            }
        }));
    }

    /* renamed from: a */
    public AbstractC68307f<CommentRectF> mo25608a(String str) {
        C7086a aVar = this.f17656e;
        if (aVar != null) {
            return this.f17652a.mo25588a(aVar.mo27322a().f18785a, this.f17656e.mo27322a().f19098q, str).mo238020d($$Lambda$TRYepCqgqkNCoKzfX4OvLTYhj4.INSTANCE).mo238020d($$Lambda$b$FsWYr64VTRNjBGwL9lV7LDaAXko.INSTANCE);
        }
        C13479a.m54758a("DriveCommentDataManager", "registerPushListener file model is null");
        return null;
    }

    /* renamed from: a */
    public void m25614b(CommentRectF commentRectF) {
        if (commentRectF != null && !this.f17657f.contains(commentRectF)) {
            this.f17657f.add(commentRectF);
            m25613a(this.f17657f);
        }
    }

    /* renamed from: a */
    public void mo25612a(AbstractC6379b bVar) {
        if (bVar != null) {
            this.f17658g.add(bVar);
            bVar.mo25624a(this.f17657f);
        }
    }

    /* renamed from: a */
    public void mo25613a(C6937b bVar) {
        mo25616b();
        C7086a aVar = (C7086a) bVar.getFileModel();
        this.f17656e = aVar;
        if (aVar != null) {
            C13479a.m54764b("DRIVE_COMMENT_FLOW", "setup drive comment finish");
            m25622g();
            mo25609a();
            return;
        }
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "setup drive comment cache");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m25618c(CommentRectF commentRectF, Throwable th) throws Exception {
        C13479a.m54761a("DriveCommentDataManager", th);
        m25614b(commentRectF);
    }

    /* renamed from: a */
    private void m25611a(CommentRectF commentRectF, Throwable th) {
        Iterator<AbstractC6378a> it = this.f17659h.iterator();
        while (it.hasNext()) {
            AbstractC6378a next = it.next();
            if (th == null) {
                next.mo25622a(commentRectF);
            } else {
                next.mo25623a(commentRectF, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25615b(CommentRectF commentRectF, Throwable th) throws Exception {
        C13479a.m54761a("DRIVE_COMMENT_FLOW", th);
        this.f17657f.remove(commentRectF);
        m25613a(this.f17657f);
        m25611a(commentRectF, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25610a(CommentRectF commentRectF, NetService.Result result) throws Exception {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "add area comment finish=" + result + " comment =" + commentRectF);
        m25611a(commentRectF, (Throwable) null);
    }

    /* renamed from: a */
    public void mo25614a(String str, CommentRectF commentRectF) {
        if (this.f17656e == null) {
            C13479a.m54758a("DriveCommentDataManager", "registerPushListener file model is null");
        } else if (commentRectF == null) {
            C13479a.m54758a("DRIVE_COMMENT_FLOW", "addDriveCommentArea with null commentRectF, return.");
        } else {
            Disposable disposable = this.f17654c;
            if (disposable != null && !disposable.isDisposed()) {
                this.f17654c.dispose();
            }
            this.f17657f.add(commentRectF);
            m25613a(this.f17657f);
            Disposable b = this.f17652a.mo25589a(this.f17656e.mo27322a().f18785a, str, commentRectF.mo25555a(), C6376a.m25605a(commentRectF)).mo238028f(10, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(commentRectF) {
                /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$b$xvT2YWaisqLnLrxvj1bXngLgfNA */
                public final /* synthetic */ CommentRectF f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6377b.this.m25610a((C6377b) this.f$1, (CommentRectF) ((NetService.Result) obj));
                }
            }, new Consumer(commentRectF) {
                /* class com.bytedance.ee.bear.drive.biz.comment.data.$$Lambda$b$himkSZ6LtEhJP5JrJuoiF2QrsM */
                public final /* synthetic */ CommentRectF f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6377b.this.m25615b(this.f$1, (Throwable) obj);
                }
            });
            this.f17654c = b;
            this.f17653b.mo237937a(b);
        }
    }
}
