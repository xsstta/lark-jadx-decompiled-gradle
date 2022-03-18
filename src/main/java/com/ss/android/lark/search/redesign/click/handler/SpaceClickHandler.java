package com.ss.android.lark.search.redesign.click.handler;

import android.app.Activity;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/SpaceClickHandler;", "Lcom/ss/android/lark/search/redesign/click/handler/AbsItemClickHandler;", "contextProvider", "Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "(Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;)V", "mBrowserModule", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IBrowserDependency;", "kotlin.jvm.PlatformType", "mLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "hideDocOpenLoading", "", "activity", "Landroid/app/Activity;", "onItemClick", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "openCCM", "ccmUrl", "", "showDocOpenLoading", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.a.j */
public final class SpaceClickHandler extends AbsItemClickHandler {

    /* renamed from: a */
    public static final Companion f132507a = new Companion(null);

    /* renamed from: b */
    private CommonLoadingDialog f132508b;

    /* renamed from: c */
    private final ISearchModuleDependency.AbstractC53315c f132509c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/SpaceClickHandler$Companion;", "", "()V", "OPEN_HIDE_LOADING_DELAY_TIME_IN_MS", "", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.j$b */
    public static final class RunnableC53692b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SpaceClickHandler f132510a;

        /* renamed from: b */
        final /* synthetic */ Activity f132511b;

        RunnableC53692b(SpaceClickHandler jVar, Activity activity) {
            this.f132510a = jVar;
            this.f132511b = activity;
        }

        public final void run() {
            this.f132510a.mo183110a(this.f132511b);
        }
    }

    /* renamed from: a */
    public final void mo183110a(Activity activity) {
        CommonLoadingDialog commonLoadingDialog;
        if (UIUtils.isActivityRunning(activity) && (commonLoadingDialog = this.f132508b) != null) {
            commonLoadingDialog.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpaceClickHandler(IContextProvider eVar) {
        super(eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "contextProvider");
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        this.f132509c = a.mo181754e();
    }

    /* renamed from: b */
    private final void m207858b(Activity activity) {
        if (UIUtils.isActivityRunning(activity)) {
            if (this.f132508b == null) {
                this.f132508b = new CommonLoadingDialog();
            }
            CommonLoadingDialog commonLoadingDialog = this.f132508b;
            if (commonLoadingDialog != null) {
                commonLoadingDialog.show(activity);
            }
        }
    }

    /* renamed from: a */
    private final void m207857a(Activity activity, String str) {
        m207858b(activity);
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        a.mo181752d().mo181831b();
        ISearchModuleDependency.AbstractC53315c cVar = this.f132509c;
        ISearchModuleDependency a2 = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "SearchModule.getDependency()");
        cVar.mo181774a(a2.mo181750c(), str);
        UICallbackExecutor.executeDelayed(new RunnableC53692b(this, activity), 200);
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
    /* renamed from: a */
    public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        Activity C;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IContextProvider b = mo183088b();
        if (b != null && (C = b.mo183099C()) != null) {
            if (searchBaseInfo instanceof SearchSpaceInfo) {
                String docUrl = ((SearchSpaceInfo) searchBaseInfo).getDocUrl();
                Intrinsics.checkExpressionValueIsNotNull(docUrl, "data.docUrl");
                m207857a(C, docUrl);
            } else if (searchBaseInfo instanceof SearchWikiInfo) {
                String url = ((SearchWikiInfo) searchBaseInfo).getUrl();
                Intrinsics.checkExpressionValueIsNotNull(url, "data.url");
                m207857a(C, url);
            }
        }
    }
}
