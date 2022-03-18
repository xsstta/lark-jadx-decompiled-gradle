package com.bytedance.ee.bear.drive.biz.comment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.comment.data.C6376a;
import com.bytedance.ee.bear.drive.biz.comment.data.C6377b;
import com.bytedance.ee.bear.drive.biz.feed.C6462d;
import com.bytedance.ee.bear.drive.biz.fileinfo.DriveFileInfoHelper;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.CommentBuilder;
import com.bytedance.ee.bear.middleground.comment.export.IComment;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.comment.h */
public class C6382h implements C6377b.AbstractC6378a, C6377b.AbstractC6379b, AbstractC6394k {

    /* renamed from: A */
    private C7555f f17664A;

    /* renamed from: B */
    private Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit> f17665B;

    /* renamed from: a */
    public AbstractC6391d f17666a;

    /* renamed from: b */
    public DriveCommentVM f17667b;

    /* renamed from: c */
    private FragmentActivity f17668c;

    /* renamed from: d */
    private IComment f17669d;

    /* renamed from: e */
    private AbstractC6395l f17670e;

    /* renamed from: f */
    private List<CommentBean> f17671f = Collections.synchronizedList(new ArrayList());

    /* renamed from: g */
    private CommentRectF f17672g = null;

    /* renamed from: h */
    private List<String> f17673h = Collections.synchronizedList(new ArrayList());

    /* renamed from: i */
    private List<String> f17674i = Collections.synchronizedList(new ArrayList());

    /* renamed from: j */
    private Map<String, CommentRectF> f17675j;

    /* renamed from: k */
    private Comparator<CommentBean> f17676k;

    /* renamed from: l */
    private boolean f17677l;

    /* renamed from: m */
    private ArrayList<CommentRectF> f17678m;

    /* renamed from: n */
    private Map<String, CommentBean> f17679n;

    /* renamed from: o */
    private C7086a f17680o;

    /* renamed from: p */
    private C6377b f17681p;

    /* renamed from: q */
    private C6462d f17682q;

    /* renamed from: r */
    private C6923a f17683r;

    /* renamed from: s */
    private Set<AbstractC6380e> f17684s;

    /* renamed from: t */
    private AbstractC7095c f17685t;

    /* renamed from: u */
    private C6389b f17686u;

    /* renamed from: v */
    private C6388a f17687v;

    /* renamed from: w */
    private FrameLayout f17688w;

    /* renamed from: x */
    private volatile String f17689x;

    /* renamed from: y */
    private volatile int f17690y;

    /* renamed from: z */
    private AbstractC6390c f17691z;

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.h$c */
    public interface AbstractC6390c {
        /* renamed from: a */
        void mo25514a(List<String> list);
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.h$d */
    public interface AbstractC6391d {
        /* renamed from: a */
        void mo25513a(boolean z, boolean z2);
    }

    /* renamed from: g */
    public void mo25652g() {
        m25671n();
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: a */
    public void mo25632a() {
        IComment eVar = this.f17669d;
        if (eVar != null) {
            eVar.mo34311a(false, true);
        }
    }

    /* renamed from: a */
    public void mo25636a(final C6937b bVar, final C6522b bVar2) {
        mo25650e();
        this.f17680o = (C7086a) bVar.getFileModel();
        this.f17681p.mo25613a(bVar);
        if (bVar2 != null && this.f17680o != null && this.f17668c != null) {
            AbstractC9224g gVar = (AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class);
            FragmentActivity fragmentActivity = this.f17668c;
            boolean z = true;
            CommentBuilder f = new CommentBuilder(fragmentActivity, this.f17688w, fragmentActivity.getSupportFragmentManager()).mo34939a(this.f17680o.mo27322a().f18785a).mo34945b(DriveFileInfoHelper.m25956a(bVar)).mo34937a(C8275a.f22375h).mo34949c(this.f17680o.mo27322a().mo27364g()).mo34936a(1).mo34944b(0).mo34955f(!bVar.isVCFollowMode());
            bVar2.getClass();
            CommentBuilder a = f.mo34940a(new Function0() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$dTDXRAiFSnmhHX_RSdGr3baNYs */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(C6522b.this.mo26061g());
                }
            }).mo34938a(new C6366c(new AbstractC6393j() {
                /* class com.bytedance.ee.bear.drive.biz.comment.C6382h.C63831 */

                @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6393j
                /* renamed from: a */
                public boolean mo25656a() {
                    return bVar2.mo26063i();
                }

                @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6393j
                /* renamed from: b */
                public boolean mo25657b() {
                    if (!bVar2.mo26060f() || bVar.isHistoryMode()) {
                        return false;
                    }
                    return true;
                }
            }));
            if (this.f17683r == null) {
                z = false;
            }
            this.f17669d = gVar.mo34610a(a.mo34946b(z).mo34941a(new Function1() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$_8qL9Kg5FTSu5IoyRi9AoQPRyYg */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6382h.this.m25661e((List) obj);
                }
            }));
            m25668k();
            m25669l();
            this.f17669d.mo34335g(this.f17686u);
            this.f17669d.mo34331e(this.f17687v);
            this.f17669d.mo34343k(new Function1() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$ivAjKxBkVYWklya1diBBCJ1kU2I */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6382h.this.m25667i((String) obj);
                }
            });
            this.f17669d.mo34310a(new Function3<String, String, Integer, Unit>() {
                /* class com.bytedance.ee.bear.drive.biz.comment.C6382h.C63842 */

                /* renamed from: a */
                public Unit invoke(String str, String str2, Integer num) {
                    return null;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo25639a(boolean z) {
        this.f17677l = z;
        IComment eVar = this.f17669d;
        if (eVar != null) {
            eVar.mo34322b(z, false);
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: a */
    public void mo25637a(String str) {
        if (this.f17669d != null) {
            if (TextUtils.isEmpty(str)) {
                mo25655j();
            } else if (this.f17680o != null) {
                C13479a.m54764b("DRIVE_COMMENT_FLOW", "fetchComment");
                this.f17669d.mo34347n().mo238001b(new Consumer(str) {
                    /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$CjawSPCrqAET0_aFjzX5I8ExZhU */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C6382h.this.m25653b(this.f$1, (String) obj);
                    }
                }, $$Lambda$h$6KlU51lZO9LJEpYuisBYGKiAwkw.INSTANCE);
            } else {
                C13479a.m54764b("DRIVE_COMMENT_FLOW", "fetchComment is cache");
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: a */
    public void mo25638a(Function1<String, Unit> function1) {
        this.f17686u.mo25668a(function1);
    }

    /* renamed from: a */
    public void mo25633a(CommentRectF commentRectF, boolean z) {
        if (this.f17669d != null) {
            this.f17682q.mo25841a(8);
            m25662e(z);
            mo25647d();
            if (!this.f17669d.mo34313a(false)) {
                this.f17669d.mo34305a(commentRectF != null ? commentRectF.mo25555a() : "", (Integer) null);
                for (AbstractC6380e eVar : this.f17684s) {
                    eVar.mo25625a();
                }
            } else if (commentRectF != null) {
                this.f17669d.mo34350q().invoke(commentRectF.mo25555a());
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.data.C6377b.AbstractC6378a
    /* renamed from: a */
    public void mo25622a(CommentRectF commentRectF) {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "add area comment finish= comment =" + commentRectF);
        IComment eVar = this.f17669d;
        if (eVar != null) {
            eVar.mo34350q().invoke(commentRectF.mo25555a());
        }
        if (this.f17670e.mo25510a() != null) {
            this.f17670e.mo25510a().showSelectedComment(commentRectF.mo25555a());
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.data.C6377b.AbstractC6378a
    /* renamed from: a */
    public void mo25623a(CommentRectF commentRectF, Throwable th) {
        this.f17678m.remove(commentRectF);
        m25655b(this.f17678m);
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.data.C6377b.AbstractC6379b
    /* renamed from: a */
    public void mo25624a(ArrayList<CommentRectF> arrayList) {
        this.f17678m = arrayList;
        m25655b(arrayList);
    }

    /* renamed from: a */
    public void mo25635a(AbstractC6391d dVar) {
        this.f17666a = dVar;
    }

    /* renamed from: j */
    public void mo25655j() {
        mo25633a((CommentRectF) null, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.h$a */
    public static class C6388a implements Function1<Boolean, Unit> {

        /* renamed from: a */
        private Set<Function1<Boolean, Unit>> f17699a;

        private C6388a() {
            this.f17699a = new HashSet();
        }

        /* renamed from: a */
        public void mo25665a(Function1<Boolean, Unit> function1) {
            this.f17699a.add(function1);
        }

        /* renamed from: b */
        public void mo25666b(Function1<Boolean, Unit> function1) {
            this.f17699a.remove(function1);
        }

        /* renamed from: a */
        public Unit invoke(Boolean bool) {
            for (Function1<Boolean, Unit> function1 : this.f17699a) {
                function1.invoke(bool);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.h$b */
    public static class C6389b implements Function1<String, Unit> {

        /* renamed from: a */
        private Set<Function1<String, Unit>> f17700a;

        private C6389b() {
            this.f17700a = new HashSet();
        }

        /* renamed from: a */
        public void mo25668a(Function1<String, Unit> function1) {
            this.f17700a.add(function1);
        }

        /* renamed from: b */
        public void mo25669b(Function1<String, Unit> function1) {
            this.f17700a.remove(function1);
        }

        /* renamed from: a */
        public Unit invoke(String str) {
            for (Function1<String, Unit> function1 : this.f17700a) {
                function1.invoke(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public void mo25640b() {
        IComment eVar = this.f17669d;
        if (eVar != null) {
            eVar.mo34332f().mo34719d(null);
        }
    }

    /* renamed from: f */
    public void mo25651f() {
        this.f17668c = null;
        this.f17688w = null;
        mo25650e();
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: i */
    public boolean mo25654i() {
        IComment eVar = this.f17669d;
        if (eVar != null) {
            return eVar.mo34313a(false);
        }
        return false;
    }

    /* renamed from: l */
    private void m25669l() {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "setup drive comment finish");
        this.f17681p.mo25612a((C6377b.AbstractC6379b) this);
        this.f17681p.mo25611a((C6377b.AbstractC6378a) this);
    }

    /* renamed from: o */
    private CommentAnimationParam m25672o() {
        return new CommentAnimationParam(true, (float) C13749l.m55736a(), BitmapDescriptorFactory.HUE_RED, false, true, false, new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.drive.biz.comment.C6382h.C63864 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }

            public void onAnimationStart(Animator animator) {
                if (C6382h.this.f17666a != null) {
                    C6382h.this.f17666a.mo25513a(true, false);
                }
                super.onAnimationStart(animator);
            }
        });
    }

    /* renamed from: p */
    private CommentAnimationParam m25673p() {
        return new CommentAnimationParam(true, BitmapDescriptorFactory.HUE_RED, (float) C13749l.m55736a(), true, false, false, new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.drive.biz.comment.C6382h.C63875 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }

            public void onAnimationStart(Animator animator) {
                if (C6382h.this.f17666a != null) {
                    C6382h.this.f17666a.mo25513a(false, false);
                }
                super.onAnimationStart(animator);
            }
        });
    }

    /* renamed from: r */
    private CommentRectF m25675r() {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "send finish,current have'nt selected rect, set it as page rect");
        CommentRectF commentRectF = new CommentRectF();
        commentRectF.mo25556a(3);
        return commentRectF;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Unit m25676s() {
        if (this.f17670e.mo25510a() == null) {
            return null;
        }
        this.f17669d.mo34322b(this.f17677l, this.f17670e.mo25510a().onAreaClick());
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ Boolean m25677t() {
        boolean z;
        C7086a aVar;
        if (!this.f17677l || ((aVar = this.f17680o) != null && this.f17685t.mo27717f(aVar.mo27333d(), null))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: c */
    public boolean mo25646c() {
        if (this.f17690y > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void mo25653h() {
        IComment eVar = this.f17669d;
        if (eVar != null && eVar.mo34313a(false)) {
            this.f17669d.mo34311a(false, false);
        }
        this.f17682q.mo25841a(0);
    }

    /* renamed from: q */
    private CommentRectF m25674q() {
        CommentRectF commentRectF;
        if (this.f17670e.mo25510a() != null) {
            commentRectF = this.f17670e.mo25510a().hideCreateComment();
        } else {
            C13479a.m54764b("DRIVE_COMMENT_FLOW", "mPreviewContainer.get() == null");
            commentRectF = null;
        }
        if (commentRectF == null) {
            return m25675r();
        }
        return commentRectF;
    }

    /* renamed from: d */
    public void mo25647d() {
        if (this.f17669d != null) {
            this.f17681p.mo25609a();
            if (this.f17680o != null) {
                C13479a.m54764b("DRIVE_COMMENT_FLOW", "fetchComment");
                this.f17669d.mo34347n().mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$dnicMXsJ4WtujtAMQXbGKH6grWE */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C6382h.this.m25659d((C6382h) ((String) obj));
                    }
                }, $$Lambda$h$pAQD26GNTJ6n9PpGOEcSiNSDB4.INSTANCE);
                return;
            }
            C13479a.m54764b("DRIVE_COMMENT_FLOW", "fetchComment is cache");
            return;
        }
        C13479a.m54775e("DriveCommentWrapper", "fetchComment() but mComment is null");
    }

    /* renamed from: k */
    private void m25668k() {
        if (this.f17669d != null && this.f17680o != null) {
            mo25640b();
            this.f17669d.mo34307a(new Function0() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$QyCrBt8B3JnuHDxF6TieqepfjWM */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6382h.this.m25677t();
                }
            });
            this.f17669d.mo34318b(new Function0() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$gJvhgnsrClEwpMatYFWjQS0zkM */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6382h.this.m25676s();
                }
            });
            this.f17669d.mo34333f(new Function1<Integer, Unit>() {
                /* class com.bytedance.ee.bear.drive.biz.comment.C6382h.C63853 */

                /* renamed from: a */
                public Unit invoke(Integer num) {
                    C6382h.this.f17667b.setCommentPanelDefaultHeight(num);
                    return null;
                }
            });
            this.f17669d.mo34338i(new Function1() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$awe74i8n8BwHwmvzfYMEP2DkB9c */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6382h.this.m25666h((String) obj);
                }
            });
            this.f17669d.mo34337h(new Function1() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$rS0M7dTJzeY5sUuLeCbWDT4P10 */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6382h.this.m25665g((String) obj);
                }
            });
            if (!this.f17669d.mo34356w().contains(this.f17665B)) {
                this.f17669d.mo34356w().add(this.f17665B);
            }
            this.f17687v.mo25665a(new Function1() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$nbJxAlsfLIN_MwjUZ6N98Nfn37c */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6382h.this.m25644a((Boolean) obj);
                }
            });
            this.f17669d.mo34320b($$Lambda$h$AdhRF30fpalusJgE99PLmFdyMA.INSTANCE);
            this.f17669d.mo34309a(new Function2() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$pVcMUum0ywcKe8PYQsGFQAkCWBs */

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C6382h.this.m25645a((String) obj, (Action) obj2);
                }
            });
            this.f17686u.mo25668a(new Function1() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$eO19Lbx2y7BJeyBNb7Wl4tx2FM */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6382h.this.m25664f((String) obj);
                }
            });
            this.f17669d.mo34326c(new Function1() {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$NbKyis7TgXb2dLoNjyGiHfW1iQs */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6382h.this.m25660e((String) obj);
                }
            });
            C13479a.m54764b("DRIVE_COMMENT_FLOW", "setup MG comment finish");
        }
    }

    /* renamed from: m */
    private ArrayList<CommentRectF> m25670m() {
        if (this.f17678m == null) {
            return new ArrayList<>();
        }
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "filterIntersectionWithMiddleGround mSourceCommentRectFList size=" + this.f17678m.size());
        ArrayList<CommentRectF> arrayList = new ArrayList<>();
        Iterator<CommentRectF> it = this.f17678m.iterator();
        while (it.hasNext()) {
            CommentRectF next = it.next();
            if (this.f17679n.containsKey(next.mo25555a())) {
                if (this.f17679n.get(next.mo25555a()) != null && !CollectionUtils.isEmpty(this.f17679n.get(next.mo25555a()).getComment_list())) {
                    next.mo25557a((long) this.f17679n.get(next.mo25555a()).getComment_list().get(0).getCreate_timestamp());
                }
                arrayList.add(next);
            }
        }
        C13479a.m54772d("DRIVE_COMMENT_FLOW", "filterIntersectionWithMiddleGround result=" + arrayList);
        return arrayList;
    }

    /* renamed from: n */
    private void m25671n() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, CommentBean> entry : this.f17679n.entrySet()) {
            if (this.f17675j.containsKey(entry.getKey())) {
                arrayList.add(entry.getValue());
            }
        }
        ArrayList<CommentRectF> m = m25670m();
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "area comment show size = " + m.size());
        if (this.f17669d != null) {
            try {
                Collections.sort(arrayList, this.f17676k);
                Collections.sort(m, $$Lambda$h$yJO165b6az0zgKV4gkl80xYao.INSTANCE);
            } catch (Exception e) {
                C13479a.m54761a("DRIVE_COMMENT_FLOW", e);
            }
            if (this.f17670e.mo25510a() != null) {
                this.f17670e.mo25510a().updateComment(m);
            }
            C13479a.m54764b("DriveCommentWrapper", "result size = " + arrayList.size());
            this.f17669d.mo34306a(arrayList);
            this.f17667b.getLiveCommentCount().mo5926a(Integer.valueOf(arrayList.size()));
        }
        this.f17690y = arrayList.size();
    }

    /* renamed from: e */
    public void mo25650e() {
        IComment eVar = this.f17669d;
        if (eVar != null) {
            try {
                eVar.mo34311a(false, true);
                this.f17669d.mo34346m();
            } catch (Exception e) {
                C13479a.m54761a("DRIVE_PREVIEW_FLOW", e);
            }
            this.f17669d = null;
        }
        this.f17678m.clear();
        this.f17679n.clear();
        this.f17681p.mo25616b();
        this.f17681p.mo25618b((C6377b.AbstractC6379b) this);
        this.f17681p.mo25617b((C6377b.AbstractC6378a) this);
    }

    /* renamed from: a */
    public void mo25634a(AbstractC6390c cVar) {
        this.f17691z = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Unit m25665g(String str) {
        this.f17669d.mo34322b(false, false);
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: c */
    public void mo25644c(Function1<String, Unit> function1) {
        this.f17686u.mo25669b(function1);
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: d */
    public void mo25648d(Function1<Boolean, Unit> function1) {
        this.f17687v.mo25666b(function1);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m25659d(String str) throws Exception {
        IComment eVar = this.f17669d;
        if (eVar != null) {
            eVar.mo34353t().invoke(str, Action.FETCH);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Unit m25661e(List list) {
        AbstractC6390c cVar = this.f17691z;
        if (cVar == null) {
            return null;
        }
        cVar.mo25514a(list);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Unit m25666h(String str) {
        this.f17669d.mo34322b(this.f17677l, true);
        return null;
    }

    /* renamed from: c */
    public void mo25645c(boolean z) {
        this.f17681p.mo25615a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m25644a(Boolean bool) {
        if (bool.booleanValue()) {
            return null;
        }
        this.f17667b.getCommentPanelShowing().mo5926a((Boolean) false);
        AbstractC6391d dVar = this.f17666a;
        if (dVar != null) {
            dVar.mo25513a(true, true);
        }
        if (this.f17670e.mo25510a() != null) {
            this.f17670e.mo25510a().onCommentListPanelClose();
        }
        this.f17682q.mo25841a(0);
        return null;
    }

    /* renamed from: b */
    private void m25655b(List<CommentRectF> list) {
        this.f17675j.clear();
        if (list != null) {
            for (CommentRectF commentRectF : list) {
                this.f17675j.put(commentRectF.mo25555a(), commentRectF);
            }
        }
        m25671n();
    }

    /* renamed from: d */
    private ArrayList<String> m25658d(List<CommentBean> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f17674i);
        for (CommentBean commentBean : list) {
            String comment_id = commentBean.getComment_id();
            if (comment_id.startsWith("DriveCommentWrapper")) {
                arrayList.remove(comment_id);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Boolean m25660e(String str) {
        BearUrl g = C6313i.m25327a().mo25399g(str);
        if (this.f17680o == null || g == null || !TextUtils.equals(g.f17447b, this.f17680o.mo27322a().f18785a)) {
            return false;
        }
        FragmentActivity fragmentActivity = this.f17668c;
        Toast.showFailureText(fragmentActivity, fragmentActivity.getString(R.string.Drive_Drive_LinkToCurrentFile), 0);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Unit m25664f(String str) {
        this.f17667b.getCommentPanelShowing().mo5929b((Boolean) true);
        this.f17682q.mo25841a(8);
        if (this.f17670e.mo25510a() == null) {
            return null;
        }
        this.f17670e.mo25510a().showSelectedComment(str);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Unit m25667i(String str) {
        String str2;
        C7086a aVar = this.f17680o;
        if (aVar == null || aVar.mo27322a() == null) {
            str2 = null;
        } else {
            str2 = this.f17680o.mo27322a().mo27358a();
        }
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, str2);
        return null;
    }

    /* renamed from: c */
    private boolean m25657c(List<CommentBean> list) {
        for (CommentBean commentBean : list) {
            String comment_id = commentBean.getComment_id();
            if (comment_id == null) {
                C13479a.m54758a("DriveCommentWrapper", "fakeCommentId is null!");
            } else if (comment_id.startsWith("DriveCommentWrapper") && !this.f17674i.contains(comment_id) && this.f17669d != null) {
                C13479a.m54764b("DRIVE_COMMENT_FLOW", "showCommentForSendingIfNeeded");
                CommentRectF commentRectF = this.f17672g;
                if (commentRectF == null) {
                    C13479a.m54758a("DRIVE_COMMENT_FLOW", "mSendingCommentRectF is null");
                    commentRectF = m25674q();
                }
                commentRectF.mo25558a(comment_id);
                this.f17672g = null;
                this.f17674i.add(comment_id);
                this.f17681p.m25614b(commentRectF);
                m25650a(list);
                m25662e(false);
                this.f17669d.mo34305a(comment_id, (Integer) null);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m25662e(boolean z) {
        if (z) {
            this.f17669d.mo34303a(m25672o());
            this.f17669d.mo34316b(m25673p());
            this.f17669d.mo34314b().mo35281a(1L);
            return;
        }
        this.f17669d.mo34314b().mo35281a(0L);
        this.f17669d.mo34316b((CommentAnimationParam) null);
        this.f17669d.mo34303a((CommentAnimationParam) null);
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: b */
    public void mo25641b(String str) {
        IComment eVar = this.f17669d;
        if (eVar != null) {
            eVar.mo34350q().invoke(str);
        }
    }

    /* renamed from: c */
    private void m25656c(String str) {
        DataEntity.C9219Entity.BodyEntity a = ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34613b().mo34615a(str);
        if (a == null || a.getCode() != 0) {
            C13479a.m54764b("DRIVE_COMMENT_FLOW", "onFilterData Publish Failed data = ");
            m25671n();
            return;
        }
        DataEntity.C9219Entity.BodyEntity.PublishEntity b = ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34613b().mo34617b(str);
        if (b == null || b.getComment() == null || b.getComment().getCommentId() == null || b.getLocalCommentId() == null) {
            C13479a.m54764b("DRIVE_COMMENT_FLOW", "onFilterData Publish Entity null data = ");
            m25671n();
            return;
        }
        String commentId = b.getComment().getCommentId();
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "onFilterData Publish CommentId = " + commentId + ", LocalCommentId = " + b.getLocalCommentId());
        if (b.isNewComment()) {
            m25648a(commentId, b.getLocalCommentId());
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k
    /* renamed from: b */
    public void mo25642b(Function1<Boolean, Unit> function1) {
        this.f17687v.mo25665a(function1);
    }

    /* renamed from: d */
    public void mo25649d(boolean z) {
        if (this.f17670e.mo25510a() != null) {
            String commentQuote = this.f17670e.mo25510a().getCommentQuote();
            if (!TextUtils.isEmpty(commentQuote)) {
                m25652a(z, commentQuote);
            } else {
                m25652a(z, C6376a.m25607a());
            }
        } else {
            m25652a(z, C6376a.m25607a());
        }
    }

    /* renamed from: b */
    public void mo25643b(boolean z) {
        IComment eVar = this.f17669d;
        if (eVar != null) {
            eVar.mo34307a(new Function0(z) {
                /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$Nla6vllxsb3YSmYJysB3speLGOw */
                public final /* synthetic */ boolean f$0;

                {
                    this.f$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.f$0);
                }
            });
        }
    }

    /* renamed from: a */
    private void m25650a(List<CommentBean> list) {
        this.f17679n.clear();
        if (list != null) {
            for (CommentBean commentBean : list) {
                this.f17679n.put(commentBean.getComment_id(), commentBean);
            }
        }
        m25671n();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m25643a(CommentRectF commentRectF, CommentRectF commentRectF2) {
        return (int) (commentRectF.mo25561b() - commentRectF2.mo25561b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m25646a(String str, Boolean bool) {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "MG send comment cb, success=" + bool);
        if (!bool.booleanValue()) {
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25653b(String str, String str2) throws Exception {
        IComment eVar = this.f17669d;
        if (eVar != null) {
            eVar.mo34353t().invoke(str2, Action.FETCH);
            this.f17669d.mo34305a(str, (Integer) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Unit m25645a(String str, Action action) {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "onFilterData action = " + action.name());
        if (action == Action.PUBLISH) {
            m25656c(str);
            return null;
        } else if (action == Action.DELETE) {
            m25671n();
            return null;
        } else if (this.f17669d != null && action != Action.CHANGE && action != Action.FETCH) {
            return null;
        } else {
            List<CommentBean> a = ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34613b().mo34616a(str, action);
            C13479a.m54764b("DRIVE_COMMENT_FLOW", "MG FilterData, start src size=" + a.size());
            if (action == Action.CHANGE && m25657c(a)) {
                return null;
            }
            ArrayList<String> d = m25658d(a);
            if (d.size() > 0) {
                m25651a(a, d);
            } else {
                m25650a(a);
            }
            return null;
        }
    }

    /* renamed from: a */
    private void m25648a(String str, String str2) {
        CommentRectF commentRectF;
        if (str2 != null) {
            commentRectF = this.f17675j.get(str2);
        } else {
            commentRectF = null;
        }
        if (commentRectF == null) {
            commentRectF = m25675r();
        }
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "addAreaInfoAndUpdate rect=" + commentRectF);
        commentRectF.mo25558a(str);
        this.f17681p.mo25614a(this.f17680o.mo27322a().f19098q, commentRectF);
        if (this.f17679n.containsKey(str)) {
            m25662e(false);
            this.f17669d.mo34305a(str, (Integer) null);
            return;
        }
        this.f17673h.add(str);
    }

    /* renamed from: a */
    private void m25651a(List<CommentBean> list, ArrayList<String> arrayList) {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "onMiddleGroundCommentUpdateForSending");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f17674i.remove(it.next());
        }
        this.f17679n.clear();
        if (list != null) {
            for (CommentBean commentBean : list) {
                this.f17679n.put(commentBean.getComment_id(), commentBean);
            }
        }
        for (CommentBean commentBean2 : list) {
            String comment_id = commentBean2.getComment_id();
            if (this.f17673h.contains(comment_id)) {
                C13479a.m54764b("DRIVE_COMMENT_FLOW", "force update for PUBLISH return first");
                this.f17673h.remove(comment_id);
                m25671n();
                m25662e(false);
                this.f17669d.mo34305a(comment_id, (Integer) null);
            }
        }
    }

    /* renamed from: a */
    private void m25652a(boolean z, String str) {
        IComment eVar = this.f17669d;
        if (eVar == null) {
            C13479a.m54758a("DriveCommentWrapper", "createNewComment() but mComment is null");
            return;
        }
        this.f17672g = null;
        eVar.mo34322b(this.f17677l, z);
        CommentInputRequest commentInputRequest = new CommentInputRequest();
        if (TextUtils.isEmpty(str)) {
            str = C6376a.m25607a();
        }
        commentInputRequest.quote = str;
        commentInputRequest.show_voice = true;
        commentInputRequest.type = 0;
        commentInputRequest.local_comment_id = "DriveCommentWrapper" + UUID.randomUUID().toString();
        this.f17669d.mo34302a(commentInputRequest);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m25647a(String str, List list, Boolean bool, String str2) {
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "MG setInputViewClose bySend = " + bool);
        if (bool.booleanValue()) {
            this.f17672g = m25674q();
        }
        if (this.f17670e.mo25510a() == null) {
            return null;
        }
        this.f17670e.mo25510a().onCommentInputPanelClose();
        return null;
    }

    public C6382h(DriveCommentVM gVar, C7555f fVar, FragmentActivity fragmentActivity, AbstractC6395l lVar, C6377b bVar, C6923a aVar, FrameLayout frameLayout, C6462d dVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f17675j = concurrentHashMap;
        this.f17676k = new C6364a(concurrentHashMap);
        this.f17678m = new ArrayList<>();
        this.f17679n = new HashMap();
        this.f17684s = new HashSet();
        this.f17689x = "";
        this.f17665B = new Function4() {
            /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$h$qVZxkgRfJu5euyf3Ag2w3os1hK8 */

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6382h.this.m25647a((String) obj, (List) obj2, (Boolean) obj3, (String) obj4);
            }
        };
        this.f17667b = gVar;
        this.f17664A = fVar;
        this.f17668c = fragmentActivity;
        this.f17688w = frameLayout;
        this.f17681p = bVar;
        this.f17682q = dVar;
        this.f17683r = aVar;
        this.f17685t = C6920b.m27342f().mo27169d();
        this.f17670e = lVar;
        this.f17686u = new C6389b();
        this.f17687v = new C6388a();
    }
}
