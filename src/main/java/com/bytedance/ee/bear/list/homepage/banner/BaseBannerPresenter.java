package com.bytedance.ee.bear.list.homepage.banner;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IModel;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView.Delegate;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000 F*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u00072\u00020\b:\u0002FGB-\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010(\u001a\u00020)H&J\b\u0010*\u001a\u00020)H\u0016J\r\u0010+\u001a\u00028\u0002H\u0014¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020)H\u0016J\u0018\u0010.\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`1H\u0016J\b\u00102\u001a\u000203H&J\b\u00104\u001a\u000203H&J\u001a\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u0001002\u0006\u00107\u001a\u000208H\u0016J\u0006\u00109\u001a\u00020)J\b\u0010:\u001a\u00020)H\u0002J$\u0010;\u001a\u00020)2\u001a\u0010<\u001a\u0016\u0012\u0004\u0012\u000200\u0018\u00010/j\n\u0012\u0004\u0012\u000200\u0018\u0001`1H\u0016J&\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u0002082\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016J\b\u0010D\u001a\u00020)H\u0016J\u0006\u0010E\u001a\u00020)R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\r\u001a\u00028\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u00028\u0001X\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006H"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/BaseBannerPresenter;", "M", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;", "V", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;", "VD", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/list/SpaceNotificationService$OnTenantChangeListener;", "fragment", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "context", "Landroid/content/Context;", "model", "view", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Lcom/bytedance/ee/bear/facade/common/BaseFragment;Landroid/content/Context;Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;Lcom/bytedance/ee/bear/service/ServiceContext;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getContext", "()Landroid/content/Context;", "getFragment", "()Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "getModel", "()Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;", "setModel", "(Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;)V", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "setServiceContext", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", "getView", "()Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;", "setView", "(Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;)V", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;", "clickMore", "", "create", "createViewDelegate", "()Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "destroy", "getFileList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "getModuleName", "", "getUrlPostFix", "handleItemClick", "item", "position", "", "loadData", "observeDatabase", "onListChanged", "list", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "onTenantChanged", "resume", "Companion", "Delegate", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.homepage.banner.d */
public abstract class BaseBannerPresenter<M extends IBannerContract.IModel, V extends IBannerContract.IView<VD>, VD extends IBannerContract.IView.Delegate> extends BasePresenter<M, V, VD> implements AbstractC8651p.AbstractC8661j {

    /* renamed from: a */
    public static final Companion f22866a = new Companion(null);

    /* renamed from: b */
    private final C68289a f22867b = new C68289a();

    /* renamed from: c */
    private final C7667e f22868c;

    /* renamed from: d */
    private final Context f22869d;

    /* renamed from: e */
    private M f22870e;

    /* renamed from: f */
    private V f22871f;

    /* renamed from: g */
    private C10917c f22872g;

    /* renamed from: g */
    public abstract String mo33106g();

    /* renamed from: h */
    public abstract String mo33107h();

    /* renamed from: i */
    public abstract void mo33108i();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/BaseBannerPresenter$Companion;", "", "()V", "TAG", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final void mo33105f() {
        mo33103d();
    }

    /* renamed from: k */
    public final C7667e mo33110k() {
        return this.f22868c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Context mo33111l() {
        return this.f22869d;
    }

    /* renamed from: m */
    public final M mo33112m() {
        return this.f22870e;
    }

    /* renamed from: n */
    public final V mo33113n() {
        return this.f22871f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public VD createViewDelegate() {
        return new Delegate();
    }

    /* renamed from: j */
    public ArrayList<Document> mo33109j() {
        return new ArrayList<>();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C8674q.m36243f().mo33642a(this);
        mo33104e();
    }

    /* renamed from: d */
    public final void mo33103d() {
        ((IBannerContract.IModel) getModel()).mo33087d();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f22867b.mo237935a();
        C8674q.m36243f().mo33649b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/BaseBannerPresenter$Delegate;", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "(Lcom/bytedance/ee/bear/list/homepage/banner/BaseBannerPresenter;)V", "onBtnMoreClick", "", "onItemClick", "item", "Lcom/bytedance/ee/bear/list/dto/Document;", "position", "", "onScrollStateChanged", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.d$b */
    public final class Delegate implements IBannerContract.IView.Delegate {
        @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView.Delegate
        /* renamed from: a */
        public void mo33114a() {
            BaseBannerPresenter.this.mo33108i();
            ListAnalysis.Companion aVar = ListAnalysis.f21728a;
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            aVar.mo31451f(b, BaseBannerPresenter.this.mo33106g());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView.Delegate
        /* renamed from: a */
        public void mo33115a(Document document, int i) {
            BaseBannerPresenter.this.mo33097a(document, i);
        }
    }

    /* renamed from: e */
    public final void mo33104e() {
        ((IBannerContract.IModel) getModel()).mo33093j().mo5923a(this.f22868c, new C8467c(this));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8661j
    /* renamed from: b */
    public void mo33101b() {
        C13479a.m54764b("BaseBannerPresenter", "onTenantChanged()...");
        this.f22867b.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new C8468d(this), C8469e.f22876a));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u000720\u0010\b\u001a,\u0012\u0004\u0012\u00020\n \f*\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\n¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "", "M", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;", "V", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;", "VD", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "it", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.d$c */
    public static final class C8467c<T> implements AbstractC1178x<ArrayList<Document>> {

        /* renamed from: a */
        final /* synthetic */ BaseBannerPresenter f22874a;

        C8467c(BaseBannerPresenter dVar) {
            this.f22874a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<Document> arrayList) {
            this.f22874a.mo33100a(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "M", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;", "V", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;", "VD", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.d$e */
    static final class C8469e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C8469e f22876a = new C8469e();

        C8469e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("BaseBannerPresenter", th);
        }
    }

    /* renamed from: a */
    public final void mo33098a(M m) {
        Intrinsics.checkParameterIsNotNull(m, "<set-?>");
        this.f22870e = m;
    }

    /* renamed from: a */
    public final void mo33099a(V v) {
        Intrinsics.checkParameterIsNotNull(v, "<set-?>");
        this.f22871f = v;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "M", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IModel;", "V", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;", "VD", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.d$d */
    static final class C8468d<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseBannerPresenter f22875a;

        C8468d(BaseBannerPresenter dVar) {
            this.f22875a = dVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            ((IBannerContract.IView) this.f22875a.getView()).mo33122a(new ArrayList<>());
            ((IBannerContract.IModel) this.f22875a.getModel()).mo33093j().mo5922a(this.f22875a.mo33110k());
            ((IBannerContract.IModel) this.f22875a.getModel()).mo33094k();
            this.f22875a.mo33104e();
        }
    }

    /* renamed from: a */
    public void mo33100a(ArrayList<Document> arrayList) {
        Integer num;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("onListChange list = ");
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        sb.append(num);
        C13479a.m54764b("BaseBannerPresenter", sb.toString());
        ((IBannerContract.IModel) getModel()).mo33084a(arrayList);
        ArrayList<Document> e = ((IBannerContract.IModel) getModel()).mo33088e();
        if (e == null || e.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((IBannerContract.IView) getView()).mo33122a(new ArrayList<>());
            ((IBannerContract.IView) getView()).mo33125b(false);
            return;
        }
        ((IBannerContract.IView) getView()).mo33125b(true);
        ((IBannerContract.IView) getView()).mo33123a(((IBannerContract.IModel) getModel()).mo33089f());
        ((IBannerContract.IView) getView()).mo33122a(((IBannerContract.IModel) getModel()).mo33088e());
    }

    /* renamed from: a */
    public void mo33097a(Document document, int i) {
        boolean z;
        if (document != null) {
            String s = document.mo32481s();
            if (s == null || StringsKt.isBlank(s)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ConnectionService d = C5084ad.m20847d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
                ConnectionService.NetworkState b = d.mo20038b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
                if (b.mo20041b() || C8292f.m34183c(document)) {
                    ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(document.mo32481s() + mo33107h(), new C8706f(this.f22869d, document, mo33106g(), mo33109j(), "", "home").mo33741a());
                    ListAnalysis.Companion aVar = ListAnalysis.f21728a;
                    AbstractC5233x b2 = C5234y.m21391b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "AnalyticServiceImp.getInstance()");
                    aVar.mo31411a(b2, mo33106g(), document, i);
                    return;
                }
                C13479a.m54764b("BaseBannerPresenter", "onItemClick()...can not open offline");
                Context context = this.f22869d;
                Toast.showText(context, context.getString(R.string.Doc_List_OfflineClickTips), 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseBannerPresenter(C7667e eVar, Context context, M m, V v, C10917c cVar) {
        super(m, v);
        Intrinsics.checkParameterIsNotNull(eVar, "fragment");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(m, "model");
        Intrinsics.checkParameterIsNotNull(v, "view");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f22868c = eVar;
        this.f22869d = context;
        this.f22870e = m;
        this.f22871f = v;
        this.f22872g = cVar;
    }
}
