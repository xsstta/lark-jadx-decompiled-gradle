package com.bytedance.ee.bear.wikiv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wikiv2.browser.plugin.C12213f;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiException;
import com.bytedance.ee.bear.wikiv2.common.p590a.C12239b;
import com.bytedance.ee.bear.wikiv2.common.util.Opt;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70022d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\"\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u001a\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010(\u001a\u00020\u001bH\u0002J\"\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010$H\u0002J\b\u0010,\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/WikiFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/facade/common/ActivityResultHandler;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isLoad", "", "browseReport", "", "wikiInfo", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "childFragmentActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "dispatchLoadFail", "throwable", "", "dispatchLoadStart", "dispatchLoadSuccess", "hideLoading", "e", "load", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "onActivityResult", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "requireBearUrl", "requireContentFragment", "Landroidx/fragment/app/Fragment;", "args", "showLoading", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.a */
public final class WikiFragment extends C7667e implements AbstractC7664b {

    /* renamed from: b */
    public static final Companion f32807b = new Companion(null);

    /* renamed from: a */
    public boolean f32808a;

    /* renamed from: c */
    private final C68289a f32809c = new C68289a();

    /* renamed from: d */
    private HashMap f32810d;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.a$d */
    public static final class C12191d implements AbstractC68309a {

        /* renamed from: a */
        public static final C12191d f32814a = new C12191d();

        C12191d() {
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final WikiFragment m50750a(String str, Bundle bundle) {
        return f32807b.mo46642a(str, bundle);
    }

    /* renamed from: a */
    public View mo46636a(int i) {
        if (this.f32810d == null) {
            this.f32810d = new HashMap();
        }
        View view = (View) this.f32810d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f32810d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo46641b() {
        HashMap hashMap = this.f32810d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46641b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/WikiFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/bytedance/ee/bear/wikiv2/WikiFragment;", "url", "args_", "Landroid/os/Bundle;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiFragment mo46642a(String str, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("url", str);
            WikiFragment aVar = new WikiFragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: a */
    public final void mo46638a() {
        m50756c();
    }

    /* renamed from: c */
    private final void m50756c() {
        ((WikiEmptyView) mo46636a(R.id.wiki_empty_view)).mo47687a(0);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f32809c.mo237935a();
    }

    /* renamed from: d */
    private final BearUrl m50757d() {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("url")) == null) {
            str = "";
        }
        BearUrl g = C6313i.m25327a().mo25399g(C6313i.m25327a().mo25398f(str));
        Intrinsics.checkExpressionValueIsNotNull(g, "SpaceKitUrlHelper.getIns…).correctProductUrl(url))");
        return g;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "subscription", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.a$e */
    public static final class C12192e<T> implements Consumer<AbstractC70022d> {

        /* renamed from: a */
        final /* synthetic */ WikiFragment f32815a;

        C12192e(WikiFragment aVar) {
            this.f32815a = aVar;
        }

        /* renamed from: a */
        public final void accept(AbstractC70022d dVar) {
            dVar.request(Long.MAX_VALUE);
            this.f32815a.mo46638a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.a$c */
    public static final class C12190c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiFragment f32813a;

        C12190c(WikiFragment aVar) {
            this.f32813a = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("WikiFragment", "Load onError. ", th);
            WikiFragment aVar = this.f32813a;
            Intrinsics.checkExpressionValueIsNotNull(th, "throwable");
            aVar.mo46640a(th);
        }
    }

    /* renamed from: b */
    private final void m50754b(WikiInfo wikiInfo) {
        int objType = wikiInfo.getObjType();
        C8275a aVar = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
        if (objType == aVar.mo32555b()) {
            C12213f.m50868c(wikiInfo.getWikiToken());
        }
    }

    /* renamed from: a */
    public final void mo46639a(WikiInfo wikiInfo) {
        m50753a(this, null, 1, null);
        m50754b(wikiInfo);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "opt", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.a$b */
    public static final class C12189b<T> implements Consumer<Opt<WikiInfo>> {

        /* renamed from: a */
        final /* synthetic */ WikiFragment f32811a;

        /* renamed from: b */
        final /* synthetic */ BearUrl f32812b;

        C12189b(WikiFragment aVar, BearUrl bearUrl) {
            this.f32811a = aVar;
            this.f32812b = bearUrl;
        }

        /* renamed from: a */
        public final void accept(Opt<WikiInfo> aVar) {
            if (!aVar.mo46760a()) {
                C13479a.m54764b("WikiFragment", "Got wikiInfo. ");
                WikiInfo b = aVar.mo46761b();
                try {
                    WikiException.validate(this.f32811a.getContext(), ar.f14811a, b);
                    if (this.f32811a.f32808a) {
                        C13479a.m54764b("WikiFragment", "Already loaded, return. ");
                        return;
                    }
                    FragmentTransaction beginTransaction = this.f32811a.getChildFragmentManager().beginTransaction();
                    WikiFragment aVar2 = this.f32811a;
                    beginTransaction.replace(R.id.wikiFragment, aVar2.mo46637a(this.f32812b, b, aVar2.getArguments())).commitAllowingStateLoss();
                    C13479a.m54764b("WikiFragment", "Load onSuccess. ");
                    this.f32811a.mo46639a(b);
                    this.f32811a.f32808a = true;
                } catch (WikiException e) {
                    C13479a.m54758a("WikiFragment", "Invalid wikiInfo, dispatchLoadFail. code=" + e.getCode());
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m50752a(BearUrl bearUrl) {
        C13479a.m54764b("WikiFragment", "Wiki start.");
        this.f32808a = false;
        C13479a.m54764b("WikiFragment", "Wait wikiInfo.");
        String str = bearUrl.f17447b;
        Intrinsics.checkExpressionValueIsNotNull(str, "bearUrl.token");
        Disposable a = C12213f.m50866b(str).mo237979a(new C12189b(this, bearUrl), new C12190c(this), C12191d.f32814a, new C12192e(this));
        Intrinsics.checkExpressionValueIsNotNull(a, "optWikiInfoFlow(bearUrl.…art()\n\n                })");
        C12239b.m50938a(a, this.f32809c);
    }

    /* renamed from: b */
    private final void m50755b(Throwable th) {
        if (th == null) {
            ((WikiEmptyView) mo46636a(R.id.wiki_empty_view)).mo47687a(2);
            return;
        }
        boolean z = th instanceof WikiException;
        if (z && ((WikiException) th).getCode() == 920004002) {
            ((WikiEmptyView) mo46636a(R.id.wiki_empty_view)).mo47687a(5);
        } else if (!z || ((WikiException) th).getCode() != -100001) {
            ((WikiEmptyView) mo46636a(R.id.wiki_empty_view)).mo47687a(3);
        } else {
            ((WikiEmptyView) mo46636a(R.id.wiki_empty_view)).mo47687a(10);
        }
    }

    /* renamed from: a */
    public final void mo46640a(Throwable th) {
        m50755b(th);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        ((WikiEmptyView) mo46636a(R.id.wiki_empty_view)).mo47688a((FrameLayout) mo46636a(R.id.wikiFragment), new WikiEmptyView.LoadingConfig(R.layout.doc_loading_layout, 600));
        BearUrl d = m50757d();
        if (d.f17450e == null || d.f17447b == null) {
            C13479a.m54758a("WikiFragment", "Invalid URL. ");
        } else {
            m50752a(d);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m50751a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_fragment, viewGroup, false);
    }

    /* renamed from: a */
    private final void m50751a(int i, int i2, Intent intent) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
        for (Fragment fragment : childFragmentManager.getFragments()) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final Fragment mo46637a(BearUrl bearUrl, WikiInfo wikiInfo, Bundle bundle) {
        if (bundle != null) {
            bundle.putSerializable("wiki_info", wikiInfo);
        }
        if (wikiInfo.getObjType() != 12) {
            C5869m a = C5869m.m23603a(wikiInfo.getObjTypeString(), bearUrl.f17450e, bundle);
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentFragment.newInst…tring, bearUrl.url, args)");
            return a;
        }
        Fragment a2 = ((AbstractC5239d) KoinJavaComponent.m268613a(AbstractC5239d.class, null, null, 6, null)).mo21090a(C6313i.m25327a().mo25382a(wikiInfo.getObjTypeString(), wikiInfo.getObjToken(), "wiki"), bundle);
        Intrinsics.checkExpressionValueIsNotNull(a2, "KoinJavaComponent.get(ID….objToken, \"wiki\"), args)");
        return a2;
    }

    /* renamed from: a */
    static /* synthetic */ void m50753a(WikiFragment aVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        aVar.m50755b(th);
    }
}
