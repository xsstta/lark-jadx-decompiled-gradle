package com.bytedance.ee.bear.list.folderselect.search;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folderselect.FolderSelectAnalytic;
import com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p718t.C13748k;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.mvp.BasePresenter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002+,B=\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0014J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010'\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020(H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IModel;", "Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView;", "Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView$Delegate;", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "model", "view", "dependence", "Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderPresenter$IDependence;", "operateBean", "Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IModel;Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView;Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderPresenter$IDependence;Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;Lcom/bytedance/ee/bear/service/ServiceContext;)V", "getContext", "()Landroid/content/Context;", "getDependence", "()Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderPresenter$IDependence;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getModel", "()Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IModel;", "getOperateBean", "()Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "getView", "()Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView;", "create", "", "createViewDelegate", "finishWithResult", "doc", "Lcom/bytedance/ee/bear/list/dto/Document;", "forwardToFolder", "removeHighlightLabel", "", "search", SearchIntents.EXTRA_QUERY, "Delegate", "IDependence", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.folderselect.search.e */
public final class SearchFolderPresenter extends BasePresenter<ISearchFolderContract.IModel, ISearchFolderContract.IView, ISearchFolderContract.IView.Delegate> {

    /* renamed from: a */
    private final Context f22795a;

    /* renamed from: b */
    private final LifecycleOwner f22796b;

    /* renamed from: c */
    private final ISearchFolderContract.IModel f22797c;

    /* renamed from: d */
    private final ISearchFolderContract.IView f22798d;

    /* renamed from: e */
    private final IDependence f22799e;

    /* renamed from: f */
    private final DocOperateBean f22800f;

    /* renamed from: g */
    private final C10917c f22801g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J@\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\nH&¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderPresenter$IDependence;", "", "finish", "", "finishWithResult", "intent", "Landroid/content/Intent;", "onBackClicked", "openSubFolder", "folderType", "", "destToken", "", "destName", "isShareFolder", "", "permission", "isDestExternal", "ownerType", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.e$b */
    public interface IDependence {
        /* renamed from: a */
        void mo33023a();

        /* renamed from: a */
        void mo33024a(int i, String str, String str2, boolean z, int i2, boolean z2, int i3);

        /* renamed from: a */
        void mo33025a(Intent intent);
    }

    /* renamed from: b */
    public final LifecycleOwner mo33036b() {
        return this.f22796b;
    }

    /* renamed from: c */
    public final ISearchFolderContract.IModel mo33038c() {
        return this.f22797c;
    }

    /* renamed from: d */
    public final ISearchFolderContract.IView mo33039d() {
        return this.f22798d;
    }

    /* renamed from: e */
    public final IDependence mo33040e() {
        return this.f22799e;
    }

    /* renamed from: f */
    public final DocOperateBean mo33041f() {
        return this.f22800f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ISearchFolderContract.IView.Delegate createViewDelegate() {
        return new Delegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderPresenter$Delegate;", "Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView$Delegate;", "(Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderPresenter;)V", "doSearch", "", SearchIntents.EXTRA_QUERY, "", "loadMore", "onBackClicked", "onItemClick", "doc", "Lcom/bytedance/ee/bear/list/dto/Document;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.e$a */
    public final class Delegate implements ISearchFolderContract.IView.Delegate {
        @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IView.Delegate
        /* renamed from: a */
        public void mo33014a() {
            SearchFolderPresenter.this.mo33038c().mo33006a();
        }

        @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IView.Delegate
        /* renamed from: b */
        public void mo33017b() {
            SearchFolderPresenter.this.mo33040e().mo33023a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IView.Delegate
        /* renamed from: a */
        public void mo33015a(Document document) {
            Intrinsics.checkParameterIsNotNull(document, "doc");
            if (SearchFolderPresenter.this.mo33041f().mo20985k()) {
                SearchFolderPresenter.this.mo33034a(document);
            } else {
                SearchFolderPresenter.this.mo33037b(document);
            }
        }

        @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IView.Delegate
        /* renamed from: a */
        public void mo33016a(String str) {
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            SearchFolderPresenter.this.mo33035a(str);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13748k.m55732a(new RunnableC8442c(this));
        mo33035a("");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.e$c */
    public static final class RunnableC8442c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchFolderPresenter f22803a;

        RunnableC8442c(SearchFolderPresenter eVar) {
            this.f22803a = eVar;
        }

        public final void run() {
            this.f22803a.mo33038c().mo33008b().mo5923a(this.f22803a.mo33036b(), new AbstractC1178x<List<? extends Document>>(this) {
                /* class com.bytedance.ee.bear.list.folderselect.search.SearchFolderPresenter.RunnableC8442c.C84431 */

                /* renamed from: a */
                final /* synthetic */ RunnableC8442c f22804a;

                {
                    this.f22804a = r1;
                }

                /* renamed from: a */
                public final void onChanged(List<? extends Document> list) {
                    if (list == null || list.isEmpty()) {
                        this.f22804a.f22803a.mo33039d().mo33010a();
                    } else {
                        this.f22804a.f22803a.mo33039d().mo33011a(list);
                    }
                }
            });
            this.f22803a.mo33038c().mo33009c().mo5923a(this.f22803a.mo33036b(), new AbstractC1178x<Boolean>(this) {
                /* class com.bytedance.ee.bear.list.folderselect.search.SearchFolderPresenter.RunnableC8442c.C84442 */

                /* renamed from: a */
                final /* synthetic */ RunnableC8442c f22805a;

                {
                    this.f22805a = r1;
                }

                /* renamed from: a */
                public final void onChanged(Boolean bool) {
                    this.f22805a.f22803a.mo33039d().mo33012a(Intrinsics.areEqual((Object) bool, (Object) true));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo33035a(String str) {
        this.f22798d.mo33013b();
        this.f22797c.mo33007a(str);
    }

    /* renamed from: a */
    public final void mo33034a(Document document) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_DEST_TOKEN", document.mo32472o());
        intent.putExtra("EXTRA_DEST_NAME", C8292f.m34193g(this.f22795a, document));
        this.f22799e.mo33025a(intent);
    }

    /* renamed from: b */
    public final void mo33037b(Document document) {
        AbstractC5233x b = C5234y.m21391b();
        Intrinsics.checkExpressionValueIsNotNull(b, "analyticService");
        FolderSelectAnalytic.m34772a(b, this.f22800f, "click_search_result");
        document.mo32443g(m34979a(this.f22795a, document));
        boolean b2 = FolderVersion.Companion.mo32530b(document.an(), document.ap());
        IDependence bVar = this.f22799e;
        int t = document.mo32483t();
        String o = document.mo32472o();
        Intrinsics.checkExpressionValueIsNotNull(o, "doc.objToken");
        String n = document.mo32469n();
        Intrinsics.checkExpressionValueIsNotNull(n, "doc.name");
        bVar.mo33024a(t, o, n, b2, document.mo32398N(), document.mo32400P(), document.an());
    }

    /* renamed from: a */
    private final String m34979a(Context context, Document document) {
        if (!TextUtils.isEmpty(document.mo32469n())) {
            String n = document.mo32469n();
            Intrinsics.checkExpressionValueIsNotNull(n, "doc.name");
            if (StringsKt.contains$default((CharSequence) n, (CharSequence) "<em>", false, 2, (Object) null)) {
                String n2 = document.mo32469n();
                Intrinsics.checkExpressionValueIsNotNull(n2, "doc.name");
                if (StringsKt.contains$default((CharSequence) n2, (CharSequence) "</em>", false, 2, (Object) null)) {
                    String n3 = document.mo32469n();
                    Intrinsics.checkExpressionValueIsNotNull(n3, "doc.name");
                    Regex regex = new Regex("<em>");
                    return new Regex("</em>").replace(regex.replace(n3, ""), "");
                }
            }
        }
        String g = C8292f.m34193g(context, document);
        Intrinsics.checkExpressionValueIsNotNull(g, "DocumentUtils.getDisplayName(context, doc)");
        return g;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFolderPresenter(Context context, LifecycleOwner lifecycleOwner, ISearchFolderContract.IModel aVar, ISearchFolderContract.IView bVar, IDependence bVar2, DocOperateBean docOperateBean, C10917c cVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(bVar2, "dependence");
        Intrinsics.checkParameterIsNotNull(docOperateBean, "operateBean");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f22795a = context;
        this.f22796b = lifecycleOwner;
        this.f22797c = aVar;
        this.f22798d = bVar;
        this.f22799e = bVar2;
        this.f22800f = docOperateBean;
        this.f22801g = cVar;
    }
}
