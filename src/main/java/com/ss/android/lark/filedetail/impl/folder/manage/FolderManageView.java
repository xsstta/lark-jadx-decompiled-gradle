package com.ss.android.lark.filedetail.impl.folder.manage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener;
import com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.filedetail.dto.FolderManageLaunchParams;
import com.ss.android.lark.filedetail.impl.folder.manage.IView;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FileType;
import com.ss.android.lark.filedetail.impl.statistic.FolderManageHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.p2932c.C58339d;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.util.C59252a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 |2\u00020\u0001:\u0004|}~B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0012H\u0002J\u0010\u0010^\u001a\u00020\\2\u0006\u0010_\u001a\u00020\u001fH\u0002J\b\u0010`\u001a\u00020\\H\u0016J\b\u0010a\u001a\u00020\\H\u0016J\b\u0010b\u001a\u00020\\H\u0016J\b\u0010c\u001a\u00020\\H\u0002J\u0014\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120eH\u0002J\b\u0010f\u001a\u00020\u0012H\u0002J \u0010g\u001a\u00020\\2\u0006\u0010h\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020\u000eH\u0002J\b\u0010k\u001a\u00020\\H\u0016J\b\u0010l\u001a\u00020\\H\u0002J\b\u0010m\u001a\u00020\\H\u0002J\b\u0010n\u001a\u00020\\H\u0002J\b\u0010o\u001a\u00020\\H\u0002J\b\u0010p\u001a\u00020\\H\u0002J\b\u0010q\u001a\u00020\\H\u0002J\b\u0010r\u001a\u00020\\H\u0002J\b\u0010s\u001a\u00020\\H\u0002J\b\u0010t\u001a\u00020\\H\u0002J\u0012\u0010u\u001a\u00020\\2\b\u0010v\u001a\u0004\u0018\u00010YH\u0016J\b\u0010w\u001a\u00020\\H\u0016J\b\u0010x\u001a\u00020\\H\u0002J\u0018\u0010y\u001a\u00020\\2\u000e\u0010z\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010{H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u0002048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\u000e\u0010B\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010C\u001a\u00020D8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020J8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010O\u001a\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010*\"\u0004\bQ\u0010,R\u001e\u0010R\u001a\u00020S8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0010\u0010X\u001a\u0004\u0018\u00010YX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IView;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$IViewDependency;", "params", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "(Landroid/content/Context;Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$IViewDependency;Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;)V", "chatId", "", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "isShowForward", "", "isShowJumpToChat", "isShowSearch", "itemLayoutType", "", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mAdapter", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter;", "mBreadCrumb", "Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumb;", "getMBreadCrumb", "()Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumb;", "setMBreadCrumb", "(Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumb;)V", "mBreadcrumbList", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "mContentLayout", "Landroid/view/ViewGroup;", "getMContentLayout", "()Landroid/view/ViewGroup;", "setMContentLayout", "(Landroid/view/ViewGroup;)V", "mCurFolderData", "mEmptyHint", "Landroid/widget/TextView;", "getMEmptyHint", "()Landroid/widget/TextView;", "setMEmptyHint", "(Landroid/widget/TextView;)V", "mEmptyIv", "Landroid/widget/ImageView;", "getMEmptyIv", "()Landroid/widget/ImageView;", "setMEmptyIv", "(Landroid/widget/ImageView;)V", "mEmptyLayout", "Landroid/view/View;", "getMEmptyLayout", "()Landroid/view/View;", "setMEmptyLayout", "(Landroid/view/View;)V", "mFileListRv", "Landroidx/recyclerview/widget/RecyclerView;", "getMFileListRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setMFileListRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mLoadingLayout", "getMLoadingLayout", "setMLoadingLayout", "mLoadingStatus", "mPtrView", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "getMPtrView", "()Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "setMPtrView", "(Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;)V", "mSearchEt", "Landroid/widget/EditText;", "getMSearchEt", "()Landroid/widget/EditText;", "setMSearchEt", "(Landroid/widget/EditText;)V", "mSingleFolderNameTv", "getMSingleFolderNameTv", "setMSingleFolderNameTv", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setMTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "mViewDelegate", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IView$Delegate;", "switchLayoutView", "backToFolder", "", "position", "changeToFolder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "create", "destroy", "finishLoadMore", "generateDialog", "getGridParams", "Lkotlin/Pair;", "getSwitchLayoutResId", "handleLoadingStatus", "listVisible", "loadingVisible", "emptyVisible", "handlerBackPressed", "initParentFolder", "initPullToRefresh", "initRecyclerView", "initSearchEt", "initTitleBar", "initView", "onChangeBreadcrumb", "onChangeFolderInfo", "setActionVisibility", "setViewDelegate", "viewDelegate", "showError", "switchItemLayout", "updateFileList", "list", "", "Companion", "IViewDependency", "LoadingStatus", "SpaceItemDecoration", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FolderManageView implements IView {

    /* renamed from: i */
    public static final Companion f98120i = new Companion(null);

    /* renamed from: a */
    public FileInfoAdapter f98121a;

    /* renamed from: b */
    public FilePreviewInfo f98122b;

    /* renamed from: c */
    public int f98123c = -1;

    /* renamed from: d */
    public int f98124d;

    /* renamed from: e */
    public IView.Delegate f98125e;

    /* renamed from: f */
    public final String f98126f;

    /* renamed from: g */
    public final IViewDependency f98127g;

    /* renamed from: h */
    public final FolderManageLaunchParams f98128h;

    /* renamed from: j */
    private View f98129j;

    /* renamed from: k */
    private LinearLayoutManager f98130k;

    /* renamed from: l */
    private GridLayoutManager f98131l;

    /* renamed from: m */
    private boolean f98132m = true;
    @BindView(8165)
    public UDBreadcrumb mBreadCrumb;
    @BindView(7957)
    public ViewGroup mContentLayout;
    @BindView(8076)
    public TextView mEmptyHint;
    @BindView(8077)
    public ImageView mEmptyIv;
    @BindView(8118)
    public View mEmptyLayout;
    @BindView(8123)
    public RecyclerView mFileListRv;
    @BindView(8117)
    public View mLoadingLayout;
    @BindView(8682)
    public LKUIPtrClassicFrameLayout mPtrView;
    @BindView(8830)
    public EditText mSearchEt;
    @BindView(8631)
    public TextView mSingleFolderNameTv;
    @BindView(9075)
    public CommonTitleBar mTitleBar;

    /* renamed from: n */
    private boolean f98133n = true;

    /* renamed from: o */
    private boolean f98134o = true;

    /* renamed from: p */
    private List<FilePreviewInfo> f98135p = new ArrayList();

    /* renamed from: q */
    private final Context f98136q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$LoadingStatus;", "", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface LoadingStatus {
        public static final Companion Companion = Companion.f98137a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$LoadingStatus$Companion;", "", "()V", "HIDE", "", "LOADING_DELAY", GrsBaseInfo.CountryCodeSource.UNKNOWN, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$LoadingStatus$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f98137a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J0\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0019H&¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$IViewDependency;", "", "goFileDetailPage", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "params", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "goShareFileCopySelectPage", "fileKey", "", "fileName", "size", "", "isFolder", "", "messageId", "goToSearchPage", "chatId", "gotoLastPage", "injectView", "view", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IView;", "openChatById", "position", "", "openThread", "threadId", "threadPosition", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$b */
    public interface IViewDependency {
        /* renamed from: a */
        void mo139867a();

        /* renamed from: a */
        void mo139868a(IView eVar);

        /* renamed from: a */
        void mo139869a(FilePreviewInfo aVar, FolderManageLaunchParams folderManageLaunchParams);

        /* renamed from: a */
        void mo139870a(String str);

        /* renamed from: a */
        void mo139871a(String str, int i);

        /* renamed from: a */
        void mo139872a(String str, String str2, long j, boolean z, String str3);

        /* renamed from: b */
        void mo139873b(String str, int i);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$Companion;", "", "()V", "DEFAULT_BREAD_CRUMBS_DELTA", "", "ITEM_MARGIN_IN_GRID", "", "ITEM_TOP_PADDING", "LOG_TAG", "", "VIEW_SHOW_DELAY", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$initRecyclerView$spaceItemDecoration$1", "Lcom/ss/android/lark/filedetail/impl/folder/manage/SpaceItemDataProvider;", "getLayoutType", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$j */
    public static final class C38260j implements SpaceItemDataProvider {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98148a;

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.SpaceItemDataProvider
        /* renamed from: a */
        public int mo139876a() {
            return this.f98148a.f98124d;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38260j(FolderManageView folderManageView) {
            this.f98148a = folderManageView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$initRecyclerView$3", "Lcom/ss/android/lark/widget/util/PtrFrameLayoutUtil$LoadMoreCallback;", "canLoadMore", "", "loadMoreThreshold", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$i */
    public static final class C38259i implements C59252a.AbstractC59254a {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98147a;

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: a */
        public int mo31266a() {
            FileInfoAdapter fileInfoAdapter = this.f98147a.f98121a;
            if (fileInfoAdapter != null) {
                return fileInfoAdapter.getItemCount();
            }
            return -7;
        }

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: b */
        public boolean mo31267b() {
            IView.Delegate aVar = this.f98147a.f98125e;
            if (aVar != null) {
                return aVar.mo139927b();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38259i(FolderManageView folderManageView) {
            this.f98147a = folderManageView;
        }
    }

    /* renamed from: k */
    private final int m150440k() {
        if (this.f98124d == 1) {
            return R.drawable.ud_icon_disorder_list_outlined;
        }
        return R.drawable.ud_icon_borders_outlined;
    }

    /* renamed from: p */
    private final void m150445p() {
        FileInfoAdapter fileInfoAdapter = this.f98121a;
        if (fileInfoAdapter != null) {
            fileInfoAdapter.clear();
        }
        m150435a(false, true, false);
    }

    /* renamed from: a */
    public final View mo139857a() {
        View view = this.mLoadingLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$f */
    public static final class RunnableC38256f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98144a;

        RunnableC38256f(FolderManageView folderManageView) {
            this.f98144a = folderManageView;
        }

        public final void run() {
            if (this.f98144a.f98123c == 2) {
                UIUtils.setViewOnScreenOneThirdPlaceByTranslationY(this.f98144a.mo139857a());
                this.f98144a.mo139857a().setVisibility(0);
            }
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        int i;
        this.f98127g.mo139868a(this);
        IView.Delegate aVar = this.f98125e;
        if (aVar != null) {
            i = aVar.mo139929d();
        } else {
            i = 0;
        }
        this.f98124d = i;
        m150437h();
        m150438i();
        m150436g();
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView
    /* renamed from: d */
    public void mo139864d() {
        if (this.f98135p.size() <= 1) {
            this.f98127g.mo139867a();
        } else {
            mo139858a((this.f98135p.size() - 1) - 1);
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView
    /* renamed from: f */
    public void mo139866f() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrView;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrView");
        }
        if (lKUIPtrClassicFrameLayout.isRefreshing()) {
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.mPtrView;
            if (lKUIPtrClassicFrameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPtrView");
            }
            lKUIPtrClassicFrameLayout2.refreshComplete();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$d */
    public static final class C38254d implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98142a;

        C38254d(FolderManageView folderManageView) {
            this.f98142a = folderManageView;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            boolean z;
            FolderManageHitPoint.f98025a.mo139788a(this.f98142a.f98126f, "forward", "none");
            FilePreviewInfo aVar = this.f98142a.f98122b;
            if (aVar != null) {
                IViewDependency bVar = this.f98142a.f98127g;
                String a = aVar.mo139966a();
                String c = aVar.mo139968c();
                long d = aVar.mo139969d();
                if (aVar.mo139967b() == FileType.FOLDER) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.mo139872a(a, c, d, z, this.f98142a.f98128h.mo139672a());
            }
        }
    }

    /* renamed from: h */
    private final void m150437h() {
        int e = this.f98128h.mo139689e();
        if (e == 4) {
            this.f98132m = false;
            this.f98134o = false;
        } else if (e == 5) {
            this.f98132m = false;
            this.f98133n = false;
            this.f98134o = false;
        } else if (e == 6) {
            this.f98132m = false;
        } else if (e == 9) {
            this.f98132m = false;
            this.f98134o = false;
        }
    }

    /* renamed from: i */
    private final void m150438i() {
        m150439j();
        m150441l();
        m150443n();
        m150442m();
        UDBreadcrumb uDBreadcrumb = this.mBreadCrumb;
        if (uDBreadcrumb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBreadCrumb");
        }
        uDBreadcrumb.setOnItemClickListener(new C38265o(this));
        m150435a(false, true, false);
    }

    /* renamed from: l */
    private final void m150441l() {
        int i;
        EditText editText = this.mSearchEt;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEt");
        }
        if (this.f98132m) {
            i = 0;
        } else {
            i = 8;
        }
        editText.setVisibility(i);
        EditText editText2 = this.mSearchEt;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEt");
        }
        editText2.setOnClickListener(new View$OnClickListenerC38261k(this));
    }

    /* renamed from: q */
    private final void m150446q() {
        int i;
        boolean z = true;
        int i2 = 0;
        if (this.f98135p.size() <= 1) {
            z = false;
        }
        UDBreadcrumb uDBreadcrumb = this.mBreadCrumb;
        if (uDBreadcrumb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBreadCrumb");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        uDBreadcrumb.setVisibility(i);
        TextView textView = this.mSingleFolderNameTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSingleFolderNameTv");
        }
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView
    /* renamed from: e */
    public void mo139865e() {
        ImageView imageView = this.mEmptyIv;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyIv");
        }
        imageView.setImageResource(R.drawable.illustration_placeholder_common_load_failed);
        TextView textView = this.mEmptyHint;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyHint");
        }
        textView.setText(UIHelper.getString(R.string.Lark_Legacy_FailedtoLoadTryLater));
        m150435a(false, false, true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$e */
    public static final class C38255e implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98143a;

        C38255e(FolderManageView folderManageView) {
            this.f98143a = folderManageView;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            boolean z;
            FolderManageHitPoint.f98025a.mo139788a(this.f98143a.f98126f, "to_chat", "im_chat_main_view");
            String k = this.f98143a.f98128h.mo139698k();
            if (k == null || k.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f98143a.f98127g.mo139871a(this.f98143a.f98128h.mo139679b(), this.f98143a.f98128h.mo139682c());
                return;
            }
            String k2 = this.f98143a.f98128h.mo139698k();
            if (k2 != null) {
                this.f98143a.f98127g.mo139873b(k2, this.f98143a.f98128h.mo139699l());
            }
        }
    }

    /* renamed from: g */
    private final void m150436g() {
        FilePreviewInfo a = new FilePreviewInfo.Builder().mo139982b(this.f98128h.mo139695h()).mo139979a(this.f98128h.mo139693g()).mo139977a(this.f98128h.mo139700m()).mo139978a(FileType.FOLDER).mo139980a();
        this.f98122b = a;
        if (a != null) {
            UDBreadcrumb uDBreadcrumb = this.mBreadCrumb;
            if (uDBreadcrumb == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBreadCrumb");
            }
            uDBreadcrumb.setItems(CollectionsKt.listOf(a.mo139968c()));
            this.f98135p.add(a);
        }
        TextView textView = this.mSingleFolderNameTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSingleFolderNameTv");
        }
        textView.setText(this.f98128h.mo139695h());
        m150446q();
    }

    /* renamed from: j */
    private final void m150439j() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setTitle(R.string.Lark_Legacy_FileFragmentTitle);
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC38262l(this));
        commonTitleBar.removeAllActions();
        this.f98129j = commonTitleBar.addAction(new C38263m(m150440k(), R.color.icon_n1, this));
        if (this.f98133n || this.f98134o) {
            commonTitleBar.addAction(new C38264n(R.drawable.ud_icon_more_outlined, R.color.icon_n1, this));
        }
    }

    /* renamed from: n */
    private final void m150443n() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f98136q);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrView;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrView");
        }
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.mPtrView;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrView");
        }
        lKUIPtrClassicFrameLayout2.setFooterView(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = this.mPtrView;
        if (lKUIPtrClassicFrameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrView");
        }
        lKUIPtrClassicFrameLayout3.addPtrUIHandler(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout4 = this.mPtrView;
        if (lKUIPtrClassicFrameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrView");
        }
        lKUIPtrClassicFrameLayout4.disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout5 = this.mPtrView;
        if (lKUIPtrClassicFrameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrView");
        }
        lKUIPtrClassicFrameLayout5.setPtrHandler(new C38257g(this));
    }

    /* renamed from: o */
    private final Pair<Integer, Integer> m150444o() {
        Resources resources = this.f98136q.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "mContext.resources");
        int i = resources.getDisplayMetrics().widthPixels;
        int dp2px = UIUtils.dp2px(this.f98136q, 100.0f);
        int dp2px2 = UIUtils.dp2px(this.f98136q, 16.0f);
        int i2 = (i - dp2px2) / (dp2px2 + dp2px);
        int i3 = (i - (dp2px * i2)) / (i2 + 1);
        Resources resources2 = this.f98136q.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources2, "mContext.resources");
        int ceil = (int) ((float) Math.ceil((double) (((float) resources2.getDisplayMetrics().heightPixels) / ((float) UIUtils.dp2px(this.f98136q, 108.0f)))));
        IView.Delegate aVar = this.f98125e;
        if (aVar != null) {
            aVar.mo139924a(ceil * i2);
        }
        return TuplesKt.to(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: c */
    public final void mo139863c() {
        if (this.f98134o || this.f98133n) {
            ArrayList arrayList = new ArrayList();
            C58339d.C58341a aVar = new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_JumpToChat), new C38255e(this));
            if (this.f98134o) {
                arrayList.add(aVar);
            }
            C58339d.C58341a aVar2 = new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_ToastForwardCopy), new C38254d(this));
            if (this.f98133n) {
                arrayList.add(aVar2);
            }
            C58339d.m226198b(this.f98136q, arrayList, true);
            FolderManageHitPoint.f98025a.mo139786a(this.f98126f);
        }
    }

    /* renamed from: m */
    private final void m150442m() {
        LinearLayoutManager linearLayoutManager;
        FileInfoAdapter fileInfoAdapter = new FileInfoAdapter();
        this.f98121a = fileInfoAdapter;
        fileInfoAdapter.mo139886a(this.f98124d);
        FileInfoAdapter fileInfoAdapter2 = this.f98121a;
        if (fileInfoAdapter2 != null) {
            fileInfoAdapter2.mo139887a(new C38258h(this));
        }
        this.f98130k = new LinearLayoutManager(this.f98136q, 1, false);
        Pair<Integer, Integer> o = m150444o();
        this.f98131l = new GridLayoutManager(this.f98136q, o.getFirst().intValue(), 1, false);
        SpaceItemDecoration cVar = new SpaceItemDecoration(this, o.getFirst().intValue(), o.getSecond().intValue(), new C38260j(this));
        RecyclerView recyclerView = this.mFileListRv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileListRv");
        }
        if (this.f98121a != null) {
            C58996h.m228978b(recyclerView);
            recyclerView.setItemAnimator(null);
            if (this.f98124d == 1) {
                linearLayoutManager = this.f98131l;
            } else {
                linearLayoutManager = this.f98130k;
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.addItemDecoration(cVar);
            recyclerView.setAdapter(this.f98121a);
        }
        Context context = this.f98136q;
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrView;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrView");
        }
        RecyclerView recyclerView2 = this.mFileListRv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileListRv");
        }
        C59252a.m230151a(context, lKUIPtrClassicFrameLayout, recyclerView2, new C38259i(this));
    }

    /* renamed from: b */
    public final void mo139862b() {
        String str;
        int i = 0;
        if (this.f98124d == 1) {
            this.f98124d = 0;
            FileInfoAdapter fileInfoAdapter = this.f98121a;
            if (fileInfoAdapter != null) {
                fileInfoAdapter.mo139886a(0);
            }
            GridLayoutManager gridLayoutManager = this.f98131l;
            if (gridLayoutManager != null) {
                i = gridLayoutManager.findFirstCompletelyVisibleItemPosition();
            }
            RecyclerView recyclerView = this.mFileListRv;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileListRv");
            }
            recyclerView.setLayoutManager(this.f98130k);
            LinearLayoutManager linearLayoutManager = this.f98130k;
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPosition(i);
            }
            str = "square_to_list";
        } else {
            this.f98124d = 1;
            FileInfoAdapter fileInfoAdapter2 = this.f98121a;
            if (fileInfoAdapter2 != null) {
                fileInfoAdapter2.mo139886a(1);
            }
            LinearLayoutManager linearLayoutManager2 = this.f98130k;
            if (linearLayoutManager2 != null) {
                i = linearLayoutManager2.findFirstCompletelyVisibleItemPosition();
            }
            RecyclerView recyclerView2 = this.mFileListRv;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileListRv");
            }
            recyclerView2.setLayoutManager(this.f98131l);
            GridLayoutManager gridLayoutManager2 = this.f98131l;
            if (gridLayoutManager2 != null) {
                gridLayoutManager2.scrollToPosition(i);
            }
            str = "list_to_square";
        }
        IView.Delegate aVar = this.f98125e;
        if (aVar != null) {
            aVar.mo139926b(this.f98124d);
        }
        View view = this.f98129j;
        if (view != null && (view instanceof ImageView)) {
            if (view != null) {
                ((ImageView) view).setImageDrawable(UIUtils.getDrawable(this.f98136q, m150440k()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
            }
        }
        FolderManageHitPoint.f98025a.mo139789a(this.f98126f, "display_mode", "none", MapsKt.mapOf(TuplesKt.to("action_type", str)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$g */
    public static final class C38257g extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98145a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38257g(FolderManageView folderManageView) {
            this.f98145a = folderManageView;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            IView.Delegate aVar = this.f98145a.f98125e;
            if (aVar != null) {
                aVar.mo139923a();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            IView.Delegate aVar = this.f98145a.f98125e;
            if (aVar != null) {
                z = aVar.mo139927b();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$initRecyclerView$1", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$OnItemSelectListener;", "onItemSelect", "", "item", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$h */
    public static final class C38258h implements FileInfoAdapter.OnItemSelectListener {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98146a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38258h(FolderManageView folderManageView) {
            this.f98146a = folderManageView;
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter.OnItemSelectListener
        /* renamed from: a */
        public void mo139875a(FilePreviewInfo aVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(aVar, "item");
            String g = C26311p.m95287g(aVar.mo139968c());
            if (g == null || g.length() <= 1) {
                str = null;
            } else {
                str = g.substring(1);
                Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).substring(startIndex)");
            }
            FolderManageHitPoint.f98025a.mo139789a(this.f98146a.f98126f, "single_file", "none", FolderManageHitPoint.f98025a.mo139785a(aVar.mo139967b(), str));
            if (aVar.mo139967b() == FileType.FOLDER) {
                this.f98146a.mo139860a(aVar);
            } else {
                this.f98146a.f98127g.mo139869a(aVar, this.f98146a.f98128h);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$initView$1", "Lcom/larksuite/component/universe_design/breadcrumb/OnBreadcrumbItemClickListener;", "onItemClick", "", "index", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$o */
    public static final class C38265o implements OnBreadcrumbItemClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98153a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38265o(FolderManageView folderManageView) {
            this.f98153a = folderManageView;
        }

        @Override // com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener
        public void onItemClick(int i) {
            this.f98153a.mo139858a(i);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IView.Delegate aVar) {
        if (aVar != null) {
            this.f98125e = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$initTitleBar$1$2", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$m */
    public static final class C38263m extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98151a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            super.performAction(view);
            this.f98151a.mo139862b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38263m(int i, int i2, FolderManageView folderManageView) {
            super(i, i2);
            this.f98151a = folderManageView;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$initTitleBar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$l */
    public static final class View$OnClickListenerC38262l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98150a;

        View$OnClickListenerC38262l(FolderManageView folderManageView) {
            this.f98150a = folderManageView;
        }

        public final void onClick(View view) {
            FolderManageHitPoint.Companion.m150328a(FolderManageHitPoint.f98025a, this.f98150a.f98126f, "close", "im_chat_main_view", null, 8, null);
            this.f98150a.f98127g.mo139867a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$initTitleBar$1$3", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$n */
    public static final class C38264n extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98152a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            super.performAction(view);
            FolderManageHitPoint.f98025a.mo139789a(this.f98152a.f98126f, "more", "im_chat_file_manage_more_view", FolderManageHitPoint.Companion.m150327a(FolderManageHitPoint.f98025a, FileType.FOLDER, null, 2, null));
            this.f98152a.mo139863c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38264n(int i, int i2, FolderManageView folderManageView) {
            super(i, i2);
            this.f98152a = folderManageView;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$k */
    public static final class View$OnClickListenerC38261k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98149a;

        View$OnClickListenerC38261k(FolderManageView folderManageView) {
            this.f98149a = folderManageView;
        }

        public final void onClick(View view) {
            FolderManageHitPoint.Companion.m150328a(FolderManageHitPoint.f98025a, this.f98149a.f98126f, "search", "none", null, 8, null);
            this.f98149a.f98127g.mo139870a(this.f98149a.f98128h.mo139679b());
        }
    }

    /* renamed from: a */
    public final void mo139860a(FilePreviewInfo aVar) {
        m150445p();
        UDBreadcrumb uDBreadcrumb = this.mBreadCrumb;
        if (uDBreadcrumb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBreadCrumb");
        }
        uDBreadcrumb.mo90284a(aVar.mo139968c());
        this.f98135p.add(aVar);
        m150446q();
        this.f98122b = aVar;
        IView.Delegate aVar2 = this.f98125e;
        if (aVar2 != null) {
            aVar2.mo139925a(aVar.mo139966a());
        }
    }

    /* renamed from: a */
    public final void mo139858a(int i) {
        if (this.f98135p.size() > i) {
            m150445p();
            int i2 = i + 1;
            UDBreadcrumb uDBreadcrumb = this.mBreadCrumb;
            if (uDBreadcrumb == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBreadCrumb");
            }
            uDBreadcrumb.mo90283a(i2);
            this.f98135p = new ArrayList(this.f98135p.subList(0, i2));
            m150446q();
            FilePreviewInfo aVar = this.f98135p.get(i);
            this.f98122b = aVar;
            IView.Delegate aVar2 = this.f98125e;
            if (aVar2 != null) {
                aVar2.mo139925a(aVar.mo139966a());
            }
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView
    /* renamed from: a */
    public void mo139861a(List<FilePreviewInfo> list) {
        String str;
        boolean z;
        boolean z2;
        IView.Delegate aVar = this.f98125e;
        String str2 = null;
        if (aVar != null) {
            str = aVar.mo139928c();
        } else {
            str = null;
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            FilePreviewInfo aVar2 = this.f98122b;
            if (aVar2 != null) {
                str2 = aVar2.mo139966a();
            }
            if (TextUtils.equals(str3, str2)) {
                List<FilePreviewInfo> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    m150435a(true, false, false);
                    FileInfoAdapter fileInfoAdapter = this.f98121a;
                    if (fileInfoAdapter != null) {
                        fileInfoAdapter.diff(list2);
                        return;
                    }
                    return;
                }
            }
        }
        ImageView imageView = this.mEmptyIv;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyIv");
        }
        imageView.setImageResource(R.drawable.illustration_placeholder_common_no_file);
        TextView textView = this.mEmptyHint;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyHint");
        }
        textView.setText(UIHelper.getString(R.string.Lark_Legacy_PullEmptyResult));
        m150435a(false, false, true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$SpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spanCount", "", "margin", "dataProvider", "Lcom/ss/android/lark/filedetail/impl/folder/manage/SpaceItemDataProvider;", "(Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView;IILcom/ss/android/lark/filedetail/impl/folder/manage/SpaceItemDataProvider;)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "itemPosition", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView$c */
    public final class SpaceItemDecoration extends RecyclerView.AbstractC1335d {

        /* renamed from: a */
        final /* synthetic */ FolderManageView f98138a;

        /* renamed from: b */
        private final int f98139b;

        /* renamed from: c */
        private final int f98140c;

        /* renamed from: d */
        private final SpaceItemDataProvider f98141d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            if (this.f98141d.mo139876a() != 0) {
                int i2 = this.f98139b;
                int i3 = i / i2;
                int i4 = i % i2;
                if (i3 == 0) {
                    rect.top = UIUtils.dp2px(recyclerView.getContext(), 20.0f);
                }
                int i5 = this.f98140c;
                rect.left = i5 - ((i4 * i5) / this.f98139b);
                rect.right = ((i4 + 1) * this.f98140c) / this.f98139b;
            }
        }

        public SpaceItemDecoration(FolderManageView folderManageView, int i, int i2, SpaceItemDataProvider fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "dataProvider");
            this.f98138a = folderManageView;
            this.f98139b = i;
            this.f98140c = i2;
            this.f98141d = fVar;
        }
    }

    public FolderManageView(Context context, IViewDependency bVar, FolderManageLaunchParams folderManageLaunchParams) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        Intrinsics.checkParameterIsNotNull(folderManageLaunchParams, "params");
        this.f98136q = context;
        this.f98127g = bVar;
        this.f98128h = folderManageLaunchParams;
        boolean z = true;
        String j = folderManageLaunchParams.mo139697j();
        if (!(j == null || j.length() == 0)) {
            z = false;
        }
        if (!z) {
            str = folderManageLaunchParams.mo139697j();
        } else {
            str = folderManageLaunchParams.mo139679b();
        }
        this.f98126f = str;
    }

    /* renamed from: a */
    private final void m150435a(boolean z, boolean z2, boolean z3) {
        int i;
        RecyclerView recyclerView = this.mFileListRv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileListRv");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
        if (z2) {
            this.f98123c = 2;
            View view = this.mLoadingLayout;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
            }
            view.postDelayed(new RunnableC38256f(this), 300);
        } else {
            View view2 = this.mLoadingLayout;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
            }
            view2.setVisibility(8);
            this.f98123c = 1;
        }
        if (z3) {
            View view3 = this.mEmptyLayout;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            view3.setVisibility(0);
            View view4 = this.mEmptyLayout;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            UIUtils.setViewOnScreenOneThirdPlaceByTranslationY(view4);
            return;
        }
        View view5 = this.mEmptyLayout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        view5.setVisibility(8);
    }
}
