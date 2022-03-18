package com.bytedance.ee.bear.list.list;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.AbstractC1398p;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIProcessStart;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7732b;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DigitDanceHeader;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.ColumnCountUtil;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.common.header.DriveUploadView;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a;
import com.bytedance.ee.bear.list.listsync.entity.SyncPushConfig;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.more.itemv2.C8631a;
import com.bytedance.ee.bear.list.more.itemv2.C8632b;
import com.bytedance.ee.bear.list.more.itemv2.C8633c;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.p426d.C8260d;
import com.bytedance.ee.bear.list.p426d.C8268l;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27139c;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public abstract class BaseListView<VD extends AbstractC8544i.AbstractC8545a> implements AbstractC8538g.AbstractC8539a, AbstractC8538g.AbstractC8540b, AbstractC8538g.AbstractC8541c, AbstractC8544i<VD>, AbstractC8651p.AbstractC8660i, BaseRecyclerView.AbstractC11798a, AbstractC27137a, AbstractC27139c {

    /* renamed from: A */
    private int f23087A = 0;

    /* renamed from: B */
    private BaseListView<VD>.View$OnLayoutChangeListenerC8529b f23088B = new View$OnLayoutChangeListenerC8529b();

    /* renamed from: a */
    private boolean f23089a;

    /* renamed from: b */
    protected Context f23090b;

    /* renamed from: c */
    protected View f23091c;

    /* renamed from: d */
    protected C7718l f23092d;

    /* renamed from: e */
    protected VD f23093e;

    /* renamed from: f */
    protected C10917c f23094f;

    /* renamed from: g */
    protected boolean f23095g;

    /* renamed from: h */
    protected FolderSortStrategy f23096h;

    /* renamed from: i */
    protected C8786n f23097i;

    /* renamed from: j */
    protected BaseRecyclerView f23098j;

    /* renamed from: k */
    protected AbstractC27129h f23099k;

    /* renamed from: l */
    protected C8594b f23100l;

    /* renamed from: m */
    protected DocsLinearLayoutManager f23101m;

    /* renamed from: n */
    protected AbstractC8538g f23102n;

    /* renamed from: o */
    protected AccountService.Account f23103o;

    /* renamed from: p */
    protected String f23104p;

    /* renamed from: q */
    protected int f23105q;

    /* renamed from: r */
    protected boolean f23106r;

    /* renamed from: s */
    public int f23107s = C13749l.m55736a();

    /* renamed from: t */
    private C8260d f23108t;

    /* renamed from: u */
    private C8268l f23109u;

    /* renamed from: v */
    private DriveUploadView f23110v;

    /* renamed from: w */
    private C11824c f23111w;

    /* renamed from: x */
    private BinderIProcessStart f23112x = new ProcessStartListener(this);

    /* renamed from: y */
    private final AccountService.AccountChangeUICallback f23113y = new AccountChangeUICallback(this);

    /* renamed from: z */
    private final C68289a f23114z = new C68289a();

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo33322A() {
        return "";
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: C */
    public void mo33324C() {
    }

    @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a
    /* renamed from: a */
    public void mo33327a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
    }

    @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a
    /* renamed from: a */
    public void mo32242a(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo32614f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo32615g();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo32617l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract String mo32618m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo32750n() {
        return "all_files_token";
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo33345q() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo33346r() {
        return "explorer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public String mo33347s() {
        return "";
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: B */
    public boolean mo33323B() {
        return this.f23095g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32733a(FolderSortStrategy folderSortStrategy) {
        String g = mo32615g();
        C13479a.m54764b(g, "onFilterChanged()...sortStrategy = " + folderSortStrategy);
        this.f23102n.mo33373b(folderSortStrategy.mo31549b());
        this.f23096h = folderSortStrategy;
        this.f23089a = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33329a(AbstractC8538g gVar) {
        DriveUploadView driveUploadView = this.f23110v;
        if (driveUploadView != null && driveUploadView.getParent() != null) {
            ((ViewGroup) this.f23110v.getParent()).removeView(this.f23110v);
            gVar.mo33375a(this.f23110v);
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: b */
    public void mo33334b(ArrayList<Document> arrayList) {
        AbstractC27129h hVar;
        if (C13657b.m55424c(this.f23102n.mo33376b()) != C13657b.m55424c(arrayList)) {
            String g = mo32615g();
            C13479a.m54764b(g, "showList()...documentList size " + C13657b.m55424c(arrayList) + ", mRefreshListAll = " + this.f23089a);
        }
        if (this.f23089a) {
            this.f23102n.mo33372a(arrayList);
            this.f23102n.notifyDataSetChanged();
            this.f23089a = false;
        } else {
            C1374g.m6298a(mo32602a(this.f23102n.mo33376b(), arrayList), false).mo7413a(new C8528a());
            this.f23102n.mo33372a(arrayList);
        }
        if (this.f23087A == 0 && (hVar = this.f23099k) != null && (hVar.getRefreshHeader() instanceof DigitDanceHeader)) {
            ((DigitDanceHeader) this.f23099k.getRefreshHeader()).setStartNumber(mo32743a(arrayList));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32745a(ConnectionService.NetworkState networkState) {
        String g = mo32615g();
        C13479a.m54764b(g, "checkConnection()...changed networkState = " + networkState);
        if (networkState != null) {
            this.f23102n.mo33374b(networkState.mo20041b());
            this.f23102n.notifyDataSetChanged();
            AbstractC27129h hVar = this.f23099k;
            if (hVar != null) {
                hVar.mo96413l(networkState.mo20041b());
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: a */
    public void mo32746a(Throwable th) {
        String g = mo32615g();
        C13479a.m54764b(g, "showLoadFail()...throwable = " + th);
        this.f23100l.mo33510a(th);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "onSwitchGrid()...grid = " + z);
        if (this.f23095g != z) {
            this.f23095g = z;
            int findFirstVisibleItemPosition = ((LinearLayoutManager) this.f23098j.getLayoutManager()).findFirstVisibleItemPosition();
            List<Document> b = this.f23102n.mo33376b();
            AbstractC8538g i = mo32616i();
            this.f23102n = i;
            i.mo33372a(b);
            this.f23098j.setAdapter((RecyclerView.Adapter) this.f23102n);
            if (z) {
                int a = ColumnCountUtil.f21740a.mo31471a(this.f23090b);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f23090b, a);
                gridLayoutManager.mo6501a(mo33337d(a));
                this.f23098j.setLayoutManager(gridLayoutManager);
                this.f23098j.removeItemDecoration(this.f23109u);
                this.f23098j.addItemDecoration(this.f23108t);
            } else {
                this.f23098j.setLayoutManager(this.f23101m);
                this.f23098j.removeItemDecoration(this.f23108t);
                this.f23098j.addItemDecoration(this.f23109u);
            }
            this.f23102n.notifyDataSetChanged();
            this.f23098j.scrollToPosition(findFirstVisibleItemPosition);
            C8143b.m32605a().mo31465a(z);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(VD vd) {
        this.f23093e = vd;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: a */
    public void mo32606a(View view, int i, Document document, boolean z) {
        C13479a.m54764b("BaseListView", "onLeftSlideMenuClick()...position = " + i);
        mo32747c(document, z);
        if (z) {
            ListAnalysis.m32527b(C5234y.m21391b(), mo32618m(), document);
        } else {
            ListAnalysis.m32496a(C5234y.m21391b(), this.f23103o, "more", document, mo32618m(), C8292f.m34136a(false));
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: w */
    public List<Document> mo33351w() {
        return this.f23102n.mo33376b();
    }

    /* renamed from: j */
    private void mo30971j() {
        if (SwipeMenuLayout.getViewCache() != null) {
            SwipeMenuLayout.getViewCache().mo30345b();
        }
    }

    /* renamed from: E */
    public boolean mo33326E() {
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo32810k() {
        return this.f23090b.getString(R.string.Doc_List_RefreshDocTips);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: o */
    public void mo33343o() {
        this.f23096h = null;
        if (this.f23097i != null) {
            this.f23097i = null;
        }
        mo32749e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo33350v() {
        return C13657b.m55421a(mo33351w());
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: z */
    public void mo33354z() {
        C13479a.m54764b(mo32615g(), "showLoadDataAnim()...");
        this.f23100l.mo33503a();
    }

    /* renamed from: h */
    private void mo30969h() {
        if (mo33345q()) {
            DriveUploadView driveUploadView = this.f23110v;
            if (driveUploadView == null) {
                C13479a.m54764b(mo32615g(), "unRegisterDriveUploadListener()...driveUploadView is null");
                return;
            }
            driveUploadView.mo32225a();
            this.f23110v.setViewDelegate(null);
            this.f23110v = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo32613d() {
        mo33348t();
        mo32617l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public DriveUploadView mo33349u() {
        if (this.f23110v == null) {
            DriveUploadView driveUploadView = new DriveUploadView(this.f23090b);
            this.f23110v = driveUploadView;
            driveUploadView.setViewDelegate(this);
        }
        return this.f23110v;
    }

    private static class ProcessStartListener extends BinderIProcessStart.Stub {
        private final WeakReference<BaseListView> viewRef;

        @Override // com.bytedance.ee.bear.contract.ak.AbstractC5107c
        public void onProcessStart() {
            C13479a.m54764b("BaseListView", "onProcessStart()...");
            WeakReference<BaseListView> weakReference = this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                C13479a.m54764b("BaseListView", "onProcessStart()...view = null");
                return;
            }
            BaseListView baseListView = this.viewRef.get();
            baseListView.getClass();
            C13742g.m55706a(new Runnable() {
                /* class com.bytedance.ee.bear.list.list.$$Lambda$Pq9yxwPZChqWW4MrBbXc84idFTM */

                public final void run() {
                    BaseListView.this.mo33344p();
                }
            }, 5000);
        }

        ProcessStartListener(BaseListView baseListView) {
            this.viewRef = new WeakReference<>(baseListView);
        }
    }

    /* renamed from: e */
    private void mo32749e() {
        if (this.f23092d.getActivity() == null) {
            C13479a.m54758a(mo32615g(), "observeSortAndFilter()...activity is null");
            return;
        }
        if (this.f23097i == null) {
            this.f23097i = (C8786n) aj.m5366a(this.f23092d.getActivity()).mo6005a(C8786n.class);
        }
        this.f23097i.getSortStrategyLiveData().mo5923a(this.f23092d, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListView$WFMuCoIk18Nu5rdeyu3cqFXHnA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseListView.this.m35485b((BaseListView) ((FolderSortStrategy) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: D */
    public boolean mo33325D() {
        BaseRecyclerView baseRecyclerView = this.f23098j;
        if (baseRecyclerView == null || !(baseRecyclerView.getLayoutManager() instanceof LinearLayoutManager) || ((LinearLayoutManager) this.f23098j.getLayoutManager()).findFirstCompletelyVisibleItemPosition() > SyncPushConfig.instance().getFirst_screen_item_count()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a
    /* renamed from: c */
    public void mo32244c() {
        C13479a.m54764b(mo32615g(), "hideUploadView()...");
        DriveUploadView driveUploadView = this.f23110v;
        if (driveUploadView != null && driveUploadView.getParent() != null) {
            this.f23102n.mo33377b(this.f23110v);
            this.f23102n.notifyDataSetChanged();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f23104p = C4484g.m18494b().mo17252c();
        this.f23103o = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        mo32613d();
        mo32604a();
        mo30963a(C8292f.f22432b);
        String g = mo32615g();
        C13479a.m54764b(g, "create()...mLocale = " + this.f23104p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        AbstractC8538g gVar;
        this.f23102n = null;
        if (this.f23095g) {
            gVar = new C8534e(this.f23094f, mo32618m(), this.f23104p);
        } else {
            gVar = new View$OnClickListenerC8546j(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
        }
        mo33329a(gVar);
        mo33332b(gVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo33344p() {
        C13479a.m54764b(mo32615g(), "registerDriveUploadListener()...");
        if (mo33345q()) {
            mo33349u();
            this.f23110v.mo32228a(mo32750n(), mo33346r(), mo33347s());
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: y */
    public void mo33353y() {
        C13479a.m54764b(mo32615g(), "onResume()...");
        mo32745a(C5084ad.m20847d().mo20038b());
        if (C13653a.m55399c(this.f23090b)) {
            Context context = this.f23090b;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().getDecorView().addOnLayoutChangeListener(this.f23088B);
            }
        }
    }

    /* renamed from: a */
    private void mo32604a() {
        C8674q.m36243f().mo33642a(this);
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(this.f23113y);
        C5084ad.m20847d().mo20037a().mo5923a(this.f23092d, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$yWO95nOP7BPUlAapaWgc8hVekHc */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseListView.this.mo32745a((ConnectionService.NetworkState) obj);
            }
        });
        mo32749e();
        mo33344p();
        this.f23114z.mo237937a(this.f23094f.mo41508c(ak.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListView$qdrmBMutqz0o4l4OHgMCLdWEksY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseListView.this.m35484b((ak) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListView$rNVPZpF7vUp66J0MNSwTexqEoo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListView.this.m35486b((BaseListView) ((String) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListView$qN5vJGNQyPwD7WGLHgA2U8PALJk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListView.this.m35490e((BaseListView) ((Throwable) obj));
            }
        }));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b(mo32615g(), "destroy()...");
        C8674q.m36243f().mo33649b(this);
        mo30969h();
        ((an) KoinJavaComponent.m268610a(an.class)).mo16404b(this.f23113y);
        this.f23094f.mo41508c(ak.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListView$P4X7kB0XPBAzb2ZQbJymTKARAgA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseListView.this.m35481a((ak) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListView$D6fh8TGX0JqA5nXTifDniQNGDmU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListView.this.m35483a((BaseListView) ((String) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListView$oapD0BL5iOxLgwmj7i63kDm3w2w */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListView.this.m35488d((BaseListView) ((Throwable) obj));
            }
        });
        this.f23114z.mo237935a();
        if (C13653a.m55399c(this.f23090b)) {
            Context context = this.f23090b;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().getDecorView().removeOnLayoutChangeListener(this.f23088B);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo33352x() {
        C13479a.m54764b(mo32615g(), "initRefreshLayout()...");
        AbstractC27129h hVar = this.f23099k;
        if (hVar == null) {
            C13479a.m54764b(mo32615g(), "initRefreshLayout()...refreshLayout = null");
            return;
        }
        hVar.mo96367b(new LoadMoreFooter(this.f23090b));
        this.f23099k.mo96415m(this.f23106r);
        this.f23099k.mo96369b((AbstractC27139c) this);
        this.f23099k.mo96368b((AbstractC27137a) this);
        if (this.f23099k.getRefreshHeader() instanceof AbstractC7741a) {
            ((AbstractC7741a) this.f23099k.getRefreshHeader()).setCustomText(mo32810k());
        }
    }

    @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a
    /* renamed from: b */
    public void mo32243b() {
        C13479a.m54764b(mo32615g(), "showUploadView()...");
        DriveUploadView driveUploadView = this.f23110v;
        if (driveUploadView != null && driveUploadView.getParent() == null) {
            this.f23102n.mo33375a(this.f23110v);
            this.f23102n.notifyDataSetChanged();
            this.f23098j.smoothScrollToPosition(0);
            this.f23100l.mo33504a(this.f23102n.getItemCount());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo33348t() {
        String str;
        C13479a.m54764b(mo32615g(), "initRecyclerView()...");
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) this.f23091c.findViewById(R.id.list_recycler_view);
        this.f23098j = baseRecyclerView;
        StringBuilder sb = new StringBuilder();
        sb.append("bear_space_list_");
        sb.append(mo32618m());
        sb.append("_");
        if (mo33323B()) {
            str = "grid";
        } else {
            str = "normal";
        }
        sb.append(str);
        C7732b.m30927a(baseRecyclerView, sb.toString());
        this.f23098j.setItemAnimator(null);
        this.f23101m = new DocsLinearLayoutManager(this.f23090b);
        this.f23108t = new C8260d(this.f23090b);
        this.f23109u = new C8268l();
        this.f23098j.setLayoutManager(this.f23101m);
        this.f23098j.addItemDecoration(this.f23109u);
        this.f23098j.addOnScrollListener(new C8530c());
        AbstractC8538g i = mo32616i();
        this.f23102n = i;
        if (i instanceof RecyclerView.Adapter) {
            this.f23098j.setAdapter((RecyclerView.Adapter) i);
        } else {
            C13606d.m55245a(mo32615g(), new IllegalArgumentException("adapter is not extends RecyclerView.Adapter"));
        }
        this.f23098j.setNestScrollListener(this);
    }

    /* renamed from: com.bytedance.ee.bear.list.list.BaseListView$a */
    private class C8528a implements AbstractC1398p {
        private C8528a() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1398p
        /* renamed from: b */
        public void mo7367b(int i, int i2) {
            BaseListView.this.f23102n.notifyItemRangeRemoved(i + BaseListView.this.f23102n.mo33378c(), i2);
        }

        @Override // androidx.recyclerview.widget.AbstractC1398p
        /* renamed from: c */
        public void mo7368c(int i, int i2) {
            BaseListView.this.f23102n.notifyItemMoved(i + BaseListView.this.f23102n.mo33378c(), i2 + BaseListView.this.f23102n.mo33378c());
        }

        @Override // androidx.recyclerview.widget.AbstractC1398p
        /* renamed from: a */
        public void mo7365a(int i, int i2) {
            if (i == BaseListView.this.f23102n.mo33376b().size()) {
                BaseListView.this.f23102n.notifyDataSetChanged();
                return;
            }
            BaseListView.this.f23102n.notifyItemRangeInserted(BaseListView.this.f23102n.mo33378c() + i, i2);
            if (i == 0) {
                BaseListView.this.f23098j.scrollToPosition(0);
            }
        }

        @Override // androidx.recyclerview.widget.AbstractC1398p
        /* renamed from: a */
        public void mo7366a(int i, int i2, Object obj) {
            BaseListView.this.f23102n.notifyItemRangeChanged(i + BaseListView.this.f23102n.mo33378c(), i2, obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.list.BaseListView$b */
    public class View$OnLayoutChangeListenerC8529b implements View.OnLayoutChangeListener {
        private View$OnLayoutChangeListenerC8529b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BaseListView baseListView = BaseListView.this;
            baseListView.mo30963a(baseListView.f23095g);
            if (BaseListView.this.f23107s != C13749l.m55736a()) {
                BaseListView.this.f23107s = C13749l.m55736a();
                if (BaseListView.this.f23095g) {
                    ((GridLayoutManager) BaseListView.this.f23098j.getLayoutManager()).mo6500a(ColumnCountUtil.f21740a.mo31471a(BaseListView.this.f23090b));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.list.BaseListView$c */
    public class C8530c extends RecyclerView.OnScrollListener {
        private C8530c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            String g = BaseListView.this.mo32615g();
            C13479a.m54764b(g, "count = " + recyclerView.getAdapter().getItemCount() + "    newState: " + i);
            BaseListView.this.f23093e.mo33298a(recyclerView, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m35481a(ak akVar) throws Exception {
        akVar.removeProcessStartCallback(this.f23112x);
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ String m35484b(ak akVar) throws Exception {
        akVar.addProcessStartCallback(this.f23112x);
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public GridLayoutManager.AbstractC1297b mo33337d(int i) {
        return new C8532c(this.f23102n, i);
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
    public void onLoadmore(AbstractC27129h hVar) {
        this.f23093e.mo33314p();
    }

    private static class AccountChangeUICallback extends AccountService.AccountChangeUICallback {
        private final WeakReference<BaseListView> viewRef;

        AccountChangeUICallback(BaseListView baseListView) {
            this.viewRef = new WeakReference<>(baseListView);
        }

        @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
        public void onChangeInUi(AccountService.Account account) {
            C13479a.m54764b("BaseListView", "onChangeInUi()...account = " + account);
            if (account == null || !account.mo19677a()) {
                C13479a.m54764b("BaseListView", "invalid account, return");
                return;
            }
            WeakReference<BaseListView> weakReference = this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                C13479a.m54764b("BaseListView", "onChangeInUi()...viewRef = null");
                return;
            }
            BaseListView baseListView = this.viewRef.get();
            if (baseListView.f23103o == null || !TextUtils.equals(baseListView.f23103o.f14584a, account.f14584a) || (baseListView.f23103o.f14594k == -1 && account.f14594k == 1)) {
                baseListView.f23103o = account;
                baseListView.f23102n.mo33368a(account);
                baseListView.mo33344p();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35483a(String str) throws Exception {
        C13479a.m54772d(mo32615g(), "hostService removeProcessStartCallback success ");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35486b(String str) throws Exception {
        C13479a.m54772d(mo32615g(), "hostService addProcessStartCallback success ");
    }

    /* renamed from: c */
    private void mo32748c(boolean z) {
        C8268l lVar = this.f23109u;
        if (lVar != null) {
            lVar.mo32363a(z);
        }
        C8260d dVar = this.f23108t;
        if (dVar != null) {
            dVar.mo32359a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m35488d(Throwable th) throws Exception {
        C13479a.m54759a(mo32615g(), "hostService removeProcessStartCallback fail", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m35490e(Throwable th) throws Exception {
        C13479a.m54759a(mo32615g(), "hostService addProcessStartCallback fail", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35485b(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(folderSortStrategy.mo31545a(), mo32614f())) {
            mo32733a(folderSortStrategy);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo32743a(ArrayList<Document> arrayList) {
        return C13657b.m55424c(arrayList);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: c */
    public AbstractC68307f<List<Document>> mo33335c(int i) {
        return C8292f.m34125a(this.f23098j, this.f23102n.mo33376b(), i);
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
    public void onRefresh(AbstractC27129h hVar) {
        C13479a.m54764b(mo32615g(), "onRefresh()...");
        AbstractC27129h hVar2 = this.f23099k;
        if (hVar2 != null) {
            hVar2.mo96434w();
        }
        this.f23093e.mo33313o();
    }

    /* renamed from: f */
    private void m35491f(boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "finishRefreshAnim()...hasMore = " + z);
        AbstractC27129h hVar = this.f23099k;
        if (hVar != null) {
            hVar.mo96435x();
            this.f23099k.mo96434w();
            this.f23099k.mo96415m(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8634d.AbstractC8635a mo32609b(Document document) {
        return new C8633c(document, mo32618m(), "");
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    public void b_(boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "setUserVisibleHint()...isVisibleToUser = " + z);
        if (!z) {
            mo30971j();
        } else if (this.f23102n != null) {
            mo32745a(C5084ad.m20847d().mo20038b());
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: e */
    public void mo33342e(boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "showLoadingDialog()...show = " + z);
        if (z) {
            if (this.f23111w == null) {
                this.f23111w = new C11824c(this.f23090b);
            }
            this.f23111w.mo45304d();
            return;
        }
        C11824c cVar = this.f23111w;
        if (cVar != null) {
            cVar.mo45303c();
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: c */
    public void mo33336c(Throwable th) {
        String g = mo32615g();
        C13479a.m54764b(g, "loadMoreFailed()...throwable = " + th);
        mo33340d(false);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: d */
    public void mo33340d(boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "loadMoreSuccess()...hasMore = " + z);
        this.f23106r = z;
        AbstractC27129h hVar = this.f23099k;
        if (hVar != null) {
            hVar.mo96405i(0);
            if (!z) {
                this.f23099k.mo96366b(0, true, true);
            }
        }
        mo32748c(z);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: a */
    public void mo32744a(int i) {
        String g = mo32615g();
        C13479a.m54764b(g, "showLoadSuccess()...size = " + i);
        this.f23100l.mo33514b(i + this.f23102n.mo33378c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33331b(int i) {
        AbstractC27129h hVar = this.f23099k;
        if (hVar != null && (hVar.getRefreshHeader() instanceof AbstractC7741a)) {
            ((AbstractC7741a) this.f23099k.getRefreshHeader()).setStartNumber(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33332b(AbstractC8538g gVar) {
        gVar.mo33368a(this.f23103o);
        gVar.mo33374b(mo33326E());
        gVar.mo33369a((AbstractC8538g.AbstractC8539a) this);
        gVar.mo33370a((AbstractC8538g.AbstractC8540b) this);
        gVar.mo33371a((AbstractC8538g.AbstractC8541c) this);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: b */
    public void mo33333b(Throwable th) {
        String g = mo32615g();
        C13479a.m54764b(g, "refreshFailed()...throwable = " + th);
        m35491f(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new BaseListItemDiffCallback(list, list2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8634d.AbstractC8636b mo32734b(Document document, boolean z) {
        return new C8632b(this.f23092d, this.f23094f, document, this.f23103o, z, mo32618m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo32747c(Document document, boolean z) {
        new C8634d(this.f23092d, this.f23094f, document, mo32609b(document), mo32603a(document, z), mo32734b(document, z)).mo33583a();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8541c
    /* renamed from: d */
    public void mo33339d(Document document, boolean z) {
        if (z) {
            ListAnalysis.m32499a(C5234y.m21391b(), mo32618m(), document);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8634d.AbstractC8636b mo32603a(Document document, boolean z) {
        return new C8631a(this.f23092d.getActivity(), this.f23094f, document, this.f23103o, mo33322A(), mo32618m(), z, this.f23093e);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: a */
    public void mo33328a(int i, Document document) {
        String g = mo32615g();
        C13479a.m54764b(g, "notifyItemChanged()...position = " + i);
        if (!C13657b.m55420a(i, this.f23102n.mo33376b()) || document == null) {
            String g2 = mo32615g();
            C13479a.m54764b(g2, "notifyItemChanged()...illegal arguments, position = " + i + ", item = " + document);
            return;
        }
        this.f23102n.mo33367a(i, document);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i
    /* renamed from: a */
    public void mo32732a(int i, boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "refreshSuccess() size = " + i + ", hasMore = " + z);
        this.f23087A = i;
        this.f23106r = z;
        mo33331b(i);
        m35491f(z);
        mo32748c(z);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8539a
    /* renamed from: e */
    public void mo33341e(View view, int i, Document document, boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "onItemClick()...position = " + i);
        this.f23093e.mo32595a(document, i, z);
    }

    public BaseListView(Context context, View view, C7718l lVar, C10917c cVar) {
        this.f23090b = context;
        this.f23091c = view;
        this.f23092d = lVar;
        this.f23094f = cVar;
        this.f23105q = C4511g.m18594d().mo17344E();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: d */
    public void mo33338d(View view, int i, Document document, boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "onCenterSlideMenuClick()...position = " + i);
        this.f23093e.mo32594a(document);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: b */
    public void mo32610b(View view, int i, Document document, boolean z) {
        String g = mo32615g();
        C13479a.m54764b(g, "onRightSlideMenuClick()...position = " + i);
        this.f23093e.mo33305d(document);
    }

    @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        mo30971j();
    }
}
