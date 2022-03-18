package com.bytedance.ee.bear.more;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.PageviewResult;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.more.p501b.C10201b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 12\u00020\u00012\u00020\u0002:\u000212B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020$H\u0016J\u0012\u0010+\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0016J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u0011R'\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/more/MoreViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bytedance/ee/bear/more/OnGetPageViewCallBack;", "()V", "groupListLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/more/moreprotocol/MoreItemGroup;", "Lkotlin/collections/ArrayList;", "getGroupListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "iconInfoLiveData", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "getIconInfoLiveData", "setIconInfoLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "isOpenPageView", "", "()Z", "setOpenPageView", "(Z)V", "mDelegate", "Lcom/bytedance/ee/bear/more/MoreViewModel$Delegate;", "moreInfoLiveData", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "getMoreInfoLiveData", "setMoreInfoLiveData", "pageViewResultLiveData", "Lcom/bytedance/ee/bear/more/PageViewResult;", "getPageViewResultLiveData", "pageviewResultLiveData", "Lcom/bytedance/ee/bear/more/export/PageviewResult;", "getPageviewResultLiveData", "pageviewServiceExecutor", "Lcom/bytedance/ee/bear/more/pageview/PageviewServiceExecutor;", "closeMore", "", "getPageView", ShareHitPoint.f121869d, "", "token", "", "onGetPageViewError", "onGetPageViewSuccess", "result", "setDelegate", "delegate", "setIsOpenPageView", "isOpen", "Companion", "Delegate", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.f */
public final class MoreViewModel extends AbstractC1142af implements AbstractC10213g {
    public static final Companion Companion = new Companion(null);
    private final C1177w<ArrayList<MoreItemGroup>> groupListLiveData = new C1177w<>();
    private C1177w<IconInfo> iconInfoLiveData = new C1177w<>();
    private boolean isOpenPageView;
    private Delegate mDelegate;
    private C1177w<IMoreInfo> moreInfoLiveData = new C1177w<>();
    private final C1177w<PageViewResult> pageViewResultLiveData = new C1177w<>();
    private final C1177w<PageviewResult> pageviewResultLiveData = new C1177w<>();
    private final C10201b pageviewServiceExecutor = new C10201b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/more/MoreViewModel$Delegate;", "", "closeMore", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.f$b */
    public interface Delegate {
        void closeMore();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/more/MoreViewModel$Companion;", "", "()V", "TAG", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<ArrayList<MoreItemGroup>> getGroupListLiveData() {
        return this.groupListLiveData;
    }

    public final C1177w<IconInfo> getIconInfoLiveData() {
        return this.iconInfoLiveData;
    }

    public final C1177w<IMoreInfo> getMoreInfoLiveData() {
        return this.moreInfoLiveData;
    }

    public final C1177w<PageViewResult> getPageViewResultLiveData() {
        return this.pageViewResultLiveData;
    }

    public final C1177w<PageviewResult> getPageviewResultLiveData() {
        return this.pageviewResultLiveData;
    }

    public final boolean isOpenPageView() {
        return this.isOpenPageView;
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10213g
    public void onGetPageViewError() {
        C13479a.m54758a("MoreViewModel", "getPageViewError");
        this.pageViewResultLiveData.mo5926a((PageViewResult) null);
    }

    public final void closeMore() {
        Delegate bVar = this.mDelegate;
        if (bVar != null) {
            bVar.closeMore();
        }
        this.mDelegate = null;
        if (!this.isOpenPageView) {
            this.pageviewResultLiveData.mo5926a((PageviewResult) null);
            this.moreInfoLiveData.mo5926a((IMoreInfo) null);
            this.iconInfoLiveData.mo5926a((IconInfo) null);
            this.pageViewResultLiveData.mo5926a((PageViewResult) null);
            this.groupListLiveData.mo5926a((ArrayList<MoreItemGroup>) null);
        }
    }

    public final void setIsOpenPageView(boolean z) {
        this.isOpenPageView = z;
    }

    public final void setOpenPageView(boolean z) {
        this.isOpenPageView = z;
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10213g
    public void onGetPageViewSuccess(PageViewResult pageViewResult) {
        this.pageViewResultLiveData.mo5926a(pageViewResult);
    }

    public final void setDelegate(Delegate bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.mDelegate = bVar;
    }

    public final void setIconInfoLiveData(C1177w<IconInfo> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.iconInfoLiveData = wVar;
    }

    public final void setMoreInfoLiveData(C1177w<IMoreInfo> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.moreInfoLiveData = wVar;
    }

    public final void getPageView(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.pageviewServiceExecutor.mo38995a(i, str, this);
    }
}
