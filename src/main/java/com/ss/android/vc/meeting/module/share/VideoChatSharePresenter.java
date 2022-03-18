package com.ss.android.vc.meeting.module.share;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.response.ay;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.IVideoChatShareContract;
import com.ss.android.vc.meeting.module.share.VideoChatShareModel;
import com.ss.android.vc.meeting.module.share.VideoChatShareView;
import com.ss.android.vc.meeting.module.share.p3161b.C62954d;
import com.ss.android.vc.meeting.module.share.selecteddialog.OnSaveListener;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000f\u0018\u0000 H2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002HIBS\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0004H\u0014J\u0006\u00104\u001a\u000205J\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u001407j\b\u0012\u0004\u0012\u00020\u0014`8J!\u00109\u001a\u0002022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00140;2\u0006\u0010<\u001a\u000205¢\u0006\u0002\u0010=J\u0006\u0010>\u001a\u000202J\u0006\u0010?\u001a\u000202J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010B\u001a\u000202J\u000e\u0010C\u001a\u0002022\u0006\u0010D\u001a\u00020\u0010J\u0016\u0010E\u001a\u0002022\u0006\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u000205R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006J"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IModel;", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView;", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView$Delegate;", "mActivity", "Landroid/app/Activity;", "mDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "mRootView", "Landroid/view/View;", "mMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mShareVideoChatData", "Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;", "isRightInOutAnim", "", "isAuth", "selectedItems", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;Landroid/view/View;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;ZZLjava/util/List;)V", "emptySearchKeyRunnable", "Ljava/lang/Runnable;", "getEmptySearchKeyRunnable", "()Ljava/lang/Runnable;", "setEmptySearchKeyRunnable", "(Ljava/lang/Runnable;)V", "emptySearchKeyWaitTime", "", "getEmptySearchKeyWaitTime", "()J", "setEmptySearchKeyWaitTime", "(J)V", "()Z", "getMActivity", "()Landroid/app/Activity;", "getMDialog", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "getMMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "getMRootView", "()Landroid/view/View;", "mSearchListener", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ISearchResultCallback;", "getMSearchListener", "()Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ISearchResultCallback;", "getMShareVideoChatData", "()Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;", "create", "", "createViewDelegate", "getSelectedGroupCount", "", "getSelectedItems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "handleDeletedActions", "deletedArray", "", "groupCount", "([Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;I)V", "hideKeyBoard", "init", "isReachListBottom", "isReachListTop", "onDialogDismiss", "onOrientationChanged", "isLandscape", "updateByKeyboard", "keyboardShown", "keyboardheight", "Companion", "ViewDelegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.g */
public final class VideoChatSharePresenter extends BasePresenter<IVideoChatShareContract.IModel, IVideoChatShareContract.IView, IVideoChatShareContract.IView.Delegate> {

    /* renamed from: a */
    public static final int f158685a = 30;

    /* renamed from: b */
    public static final Companion f158686b = new Companion(null);

    /* renamed from: c */
    private Runnable f158687c;

    /* renamed from: d */
    private long f158688d;

    /* renamed from: e */
    private final VideoChatShareView.ISearchResultCallback f158689e;

    /* renamed from: f */
    private final Activity f158690f;

    /* renamed from: g */
    private final AbstractC61222a f158691g;

    /* renamed from: h */
    private final View f158692h;

    /* renamed from: i */
    private final C61303k f158693i;

    /* renamed from: j */
    private final C62955c f158694j;

    /* renamed from: k */
    private final boolean f158695k;

    /* renamed from: l */
    private final boolean f158696l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter$Companion;", "", "()V", "NUM_FEEDS", "", "getNUM_FEEDS", "()I", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Runnable mo217633a() {
        return this.f158687c;
    }

    /* renamed from: b */
    public final long mo217637b() {
        return this.f158688d;
    }

    /* renamed from: c */
    public final VideoChatShareView.ISearchResultCallback mo217638c() {
        return this.f158689e;
    }

    /* renamed from: j */
    public final Activity mo217645j() {
        return this.f158690f;
    }

    /* renamed from: k */
    public final AbstractC61222a mo217646k() {
        return this.f158691g;
    }

    /* renamed from: l */
    public final C61303k mo217647l() {
        return this.f158693i;
    }

    /* renamed from: m */
    public final boolean mo217648m() {
        return this.f158696l;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo217640e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public IVideoChatShareContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatSharePresenter$mSearchListener$1", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ISearchResultCallback;", "onSearchEmpty", "", "searchKey", "", "onSearchError", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSearchKeyEmpty", "onSearchSuccess", "result", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "removeCloseSearch", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.g$e */
    public static final class C62980e implements VideoChatShareView.ISearchResultCallback {

        /* renamed from: a */
        final /* synthetic */ VideoChatSharePresenter f158714a;

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareView.ISearchResultCallback
        /* renamed from: a */
        public void mo217658a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.g$e$a */
        static final class RunnableC62981a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62980e f158715a;

            /* renamed from: b */
            final /* synthetic */ String f158716b;

            RunnableC62981a(C62980e eVar, String str) {
                this.f158715a = eVar;
                this.f158716b = str;
            }

            public final void run() {
                ((IVideoChatShareContract.IView) this.f158715a.f158714a.getView()).mo217531a(this.f158716b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.g$e$b */
        static final class RunnableC62982b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62980e f158717a;

            RunnableC62982b(C62980e eVar) {
                this.f158717a = eVar;
            }

            public final void run() {
                ((IVideoChatShareContract.IView) this.f158717a.f158714a.getView()).mo217535b();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.g$e$c */
        static final class RunnableC62983c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62980e f158718a;

            /* renamed from: b */
            final /* synthetic */ List f158719b;

            RunnableC62983c(C62980e eVar, List list) {
                this.f158718a = eVar;
                this.f158719b = list;
            }

            public final void run() {
                ((IVideoChatShareContract.IView) this.f158718a.f158714a.getView()).mo217533a(this.f158719b);
            }
        }

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareView.ISearchResultCallback
        /* renamed from: a */
        public void mo217657a() {
            this.f158714a.mo217634a(new RunnableC62982b(this));
            C13748k.m55733a(this.f158714a.mo217633a(), this.f158714a.mo217637b());
        }

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareView.ISearchResultCallback
        /* renamed from: b */
        public void mo217661b() {
            if (this.f158714a.mo217633a() != null) {
                C13748k.m55735c(this.f158714a.mo217633a());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62980e(VideoChatSharePresenter gVar) {
            this.f158714a = gVar;
        }

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareView.ISearchResultCallback
        /* renamed from: a */
        public void mo217659a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "searchKey");
            new Handler(Looper.getMainLooper()).post(new RunnableC62981a(this, str));
        }

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareView.ISearchResultCallback
        /* renamed from: a */
        public void mo217660a(List<VideoChatShareItem> list) {
            Intrinsics.checkParameterIsNotNull(list, "result");
            new Handler(Looper.getMainLooper()).post(new RunnableC62983c(this, list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J \u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¨\u0006\u0019"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter$ViewDelegate;", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView$Delegate;", "(Lcom/ss/android/vc/meeting/module/share/VideoChatSharePresenter;)V", "checkCanDoLoadMore", "", "commitSelect", "", "selectItems", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "getMeetingId", "", "getSelectedGroupCount", "", "getSelectedItems", "isSearchMode", "onLoadMoreBegin", "onSearchContentChanged", "content", "setMode", "mode", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel$DisplayMode;", "setSelectedGroupCount", "count", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.g$b */
    public final class ViewDelegate implements IVideoChatShareContract.IView.Delegate {
        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView.Delegate
        /* renamed from: a */
        public ArrayList<VideoChatShareItem> mo217539a() {
            return ((IVideoChatShareContract.IModel) VideoChatSharePresenter.this.getModel()).mo217502a();
        }

        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView.Delegate
        /* renamed from: b */
        public int mo217544b() {
            return ((IVideoChatShareContract.IModel) VideoChatSharePresenter.this.getModel()).mo217512b();
        }

        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView.Delegate
        /* renamed from: c */
        public boolean mo217545c() {
            return ((IVideoChatShareContract.IModel) VideoChatSharePresenter.this.getModel()).mo217514c();
        }

        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView.Delegate
        /* renamed from: d */
        public String mo217546d() {
            return ((IVideoChatShareContract.IModel) VideoChatSharePresenter.this.getModel()).mo217515d();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatSharePresenter$ViewDelegate$commitSelect$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.g$b$a */
        public static final class C62972a implements AbstractC63598b<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f158698a;

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C62972a(ViewDelegate bVar) {
                this.f158698a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                VideoChatSharePresenter.this.mo217646k().dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView.Delegate
        /* renamed from: a */
        public void mo217540a(int i) {
            ((IVideoChatShareContract.IModel) VideoChatSharePresenter.this.getModel()).mo217503a(i);
        }

        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView.Delegate
        /* renamed from: a */
        public void mo217541a(VideoChatShareModel.DisplayMode displayMode) {
            Intrinsics.checkParameterIsNotNull(displayMode, "mode");
            ((IVideoChatShareContract.IModel) VideoChatSharePresenter.this.getModel()).mo217505a(displayMode);
        }

        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView.Delegate
        /* renamed from: a */
        public void mo217542a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            ((IVideoChatShareContract.IModel) VideoChatSharePresenter.this.getModel()).mo217507a(str, VideoChatSharePresenter.this.mo217638c());
        }

        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IView.Delegate
        /* renamed from: a */
        public void mo217543a(ArrayList<VideoChatShareItem> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectItems");
            ((IVideoChatShareContract.IModel) VideoChatSharePresenter.this.getModel()).mo217508a(arrayList, VideoChatSharePresenter.this.mo217647l(), new C62972a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatSharePresenter$mDependency$1", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ViewDependency;", "dismissDialog", "", "showSelectedDialog", "selectedShareItems", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "toggleKeyBoard", "show", "", "view", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.g$d */
    public static final class C62978d implements VideoChatShareView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ VideoChatSharePresenter f158712a;

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareView.ViewDependency
        /* renamed from: a */
        public void mo217654a() {
            AbstractC61222a k = this.f158712a.mo217646k();
            if (k != null) {
                k.dismiss();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatSharePresenter$mDependency$1$showSelectedDialog$2", "Lcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;", "onSave", "", "deletedArray", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "groupCount", "", "([Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;I)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.g$d$a */
        public static final class C62979a implements OnSaveListener {

            /* renamed from: a */
            final /* synthetic */ C62978d f158713a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C62979a(C62978d dVar) {
                this.f158713a = dVar;
            }

            @Override // com.ss.android.vc.meeting.module.share.selecteddialog.OnSaveListener
            /* renamed from: a */
            public void mo217589a(VideoChatShareItem[] videoChatShareItemArr, int i) {
                Intrinsics.checkParameterIsNotNull(videoChatShareItemArr, "deletedArray");
                this.f158713a.f158712a.mo217636a(videoChatShareItemArr, i);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62978d(VideoChatSharePresenter gVar) {
            this.f158712a = gVar;
        }

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareView.ViewDependency
        /* renamed from: a */
        public void mo217655a(ArrayList<VideoChatShareItem> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectedShareItems");
            this.f158712a.mo217643h();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<VideoChatShareItem> f = this.f158712a.mo217641f();
            if (f != null) {
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    arrayList2.add(VideoChatShareItem.copy$default(it.next(), null, null, null, null, null, false, null, null, false, false, false, 0, null, null, null, false, null, 131071, null));
                }
            }
            C62954d.m246537a(this.f158712a.mo217645j(), this.f158712a.mo217647l(), arrayList2, false, this.f158712a.mo217642g(), new C62979a(this), true, this.f158712a.mo217648m()).mo211606a();
        }

        @Override // com.ss.android.vc.meeting.module.share.VideoChatShareView.ViewDependency
        /* renamed from: a */
        public void mo217656a(boolean z, View view) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Activity j = this.f158712a.mo217645j();
            if (j != null) {
                obj = j.getSystemService("input_method");
            } else {
                obj = null;
            }
            if (obj != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                if (z && inputMethodManager != null) {
                    try {
                        inputMethodManager.showSoftInput(view, 2);
                    } catch (Exception unused) {
                    }
                } else if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
    }

    /* renamed from: f */
    public final ArrayList<VideoChatShareItem> mo217641f() {
        return ((IVideoChatShareContract.IModel) getModel()).mo217502a();
    }

    /* renamed from: g */
    public final int mo217642g() {
        return ((IVideoChatShareContract.IModel) getModel()).mo217512b();
    }

    /* renamed from: h */
    public final void mo217643h() {
        ((IVideoChatShareContract.IView) getView()).mo217538e();
    }

    /* renamed from: e */
    public final void mo217640e() {
        ((IVideoChatShareContract.IView) getView()).mo217536c();
        ((IVideoChatShareContract.IModel) getModel()).mo217504a(f158685a, new C62973c(this));
    }

    /* renamed from: i */
    public final void mo217644i() {
        ((IVideoChatShareContract.IView) getView()).destroy();
        VideoChatShareView.ISearchResultCallback aVar = this.f158689e;
        if (aVar != null) {
            aVar.mo217661b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatSharePresenter$init$1", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IModel$OnFeedLoadedFinishListener;", "onFinished", "", "datas", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.g$c */
    public static final class C62973c implements IVideoChatShareContract.IModel.OnFeedLoadedFinishListener {

        /* renamed from: a */
        final /* synthetic */ VideoChatSharePresenter f158699a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatSharePresenter$init$1$onFinished$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/UserProfileEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "profileEntity", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.g$c$a */
        public static final class C62974a implements AbstractC63598b<ay> {

            /* renamed from: a */
            final /* synthetic */ C62973c f158700a;

            /* renamed from: b */
            final /* synthetic */ VideoChatShareItem f158701b;

            /* renamed from: c */
            final /* synthetic */ Ref.ObjectRef f158702c;

            /* renamed from: d */
            final /* synthetic */ ArrayList f158703d;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.vc.meeting.module.share.g$c$a$a */
            static final class RunnableC62975a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C62974a f158704a;

                /* renamed from: b */
                final /* synthetic */ Ref.ObjectRef f158705b;

                RunnableC62975a(C62974a aVar, Ref.ObjectRef objectRef) {
                    this.f158704a = aVar;
                    this.f158705b = objectRef;
                }

                public final void run() {
                    this.f158704a.f158702c.element.add(this.f158705b.element);
                    if (this.f158704a.f158703d.size() == this.f158704a.f158702c.element.size()) {
                        ((IVideoChatShareContract.IView) this.f158704a.f158700a.f158699a.getView()).mo217532a((ArrayList<VideoChatShareItem>) this.f158704a.f158702c.element);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.vc.meeting.module.share.g$c$a$b */
            public static final class RunnableC62976b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C62974a f158706a;

                /* renamed from: b */
                final /* synthetic */ Ref.ObjectRef f158707b;

                RunnableC62976b(C62974a aVar, Ref.ObjectRef objectRef) {
                    this.f158706a = aVar;
                    this.f158707b = objectRef;
                }

                public final void run() {
                    this.f158706a.f158702c.element.add(this.f158707b.element);
                    if (this.f158706a.f158703d.size() == this.f158706a.f158702c.element.size()) {
                        ((IVideoChatShareContract.IView) this.f158706a.f158700a.f158699a.getView()).mo217532a((ArrayList<VideoChatShareItem>) this.f158706a.f158702c.element);
                    }
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) new VideoChatShareItem(this.f158701b.getId(), this.f158701b.getName(), this.f158701b.getImageKey(), "", this.f158701b.getType(), this.f158701b.isSecret(), this.f158701b.getHitTerms(), this.f158701b.getSubtitleHitTerms(), this.f158701b.isExternal(), this.f158701b.isLeave(), false, 0, null, null, null, false, null, 130048, null);
                C60735ab.m236001a(new RunnableC62975a(this, objectRef));
            }

            /* renamed from: a */
            public void onSuccess(ay ayVar) {
                String str;
                if (ayVar == null || TextUtils.isEmpty(ayVar.mo210121a())) {
                    str = "";
                } else {
                    str = ayVar.mo210121a();
                    Intrinsics.checkExpressionValueIsNotNull(str, "profileEntity?.tenantName");
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) new VideoChatShareItem(this.f158701b.getId(), this.f158701b.getName(), this.f158701b.getImageKey(), str, this.f158701b.getType(), this.f158701b.isSecret(), this.f158701b.getHitTerms(), this.f158701b.getSubtitleHitTerms(), this.f158701b.isExternal(), this.f158701b.isLeave(), false, 0, null, null, null, false, null, 130048, null);
                C60735ab.m236001a(new RunnableC62976b(this, objectRef));
            }

            C62974a(C62973c cVar, VideoChatShareItem videoChatShareItem, Ref.ObjectRef objectRef, ArrayList arrayList) {
                this.f158700a = cVar;
                this.f158701b = videoChatShareItem;
                this.f158702c = objectRef;
                this.f158703d = arrayList;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.g$c$b */
        static final class RunnableC62977b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62973c f158708a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f158709b;

            /* renamed from: c */
            final /* synthetic */ VideoChatShareItem f158710c;

            /* renamed from: d */
            final /* synthetic */ ArrayList f158711d;

            RunnableC62977b(C62973c cVar, Ref.ObjectRef objectRef, VideoChatShareItem videoChatShareItem, ArrayList arrayList) {
                this.f158708a = cVar;
                this.f158709b = objectRef;
                this.f158710c = videoChatShareItem;
                this.f158711d = arrayList;
            }

            public final void run() {
                this.f158709b.element.add(this.f158710c);
                if (this.f158711d.size() == this.f158709b.element.size()) {
                    ((IVideoChatShareContract.IView) this.f158708a.f158699a.getView()).mo217532a((ArrayList<VideoChatShareItem>) this.f158709b.element);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62973c(VideoChatSharePresenter gVar) {
            this.f158699a = gVar;
        }

        @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel.OnFeedLoadedFinishListener
        /* renamed from: a */
        public void mo217529a(ArrayList<VideoChatShareItem> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "datas");
            ((IVideoChatShareContract.IView) this.f158699a.getView()).mo217537d();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) new ArrayList();
            Iterator<VideoChatShareItem> it = arrayList.iterator();
            while (it.hasNext()) {
                VideoChatShareItem next = it.next();
                if (next.getType() != ShareItemType.USER || !next.isExternal()) {
                    C60735ab.m236001a(new RunnableC62977b(this, objectRef, next, arrayList));
                } else {
                    VcBizSender.m249277f(next.getId(), new C62974a(this, next, objectRef, arrayList));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo217634a(Runnable runnable) {
        this.f158687c = runnable;
    }

    /* renamed from: a */
    public final void mo217635a(boolean z) {
        ((IVideoChatShareContract.IView) getView()).mo217534a(z);
    }

    /* renamed from: a */
    public final void mo217636a(VideoChatShareItem[] videoChatShareItemArr, int i) {
        Intrinsics.checkParameterIsNotNull(videoChatShareItemArr, "deletedArray");
        ((IVideoChatShareContract.IModel) getModel()).mo217511a(videoChatShareItemArr, i);
        ((IVideoChatShareContract.IView) getView()).mo217530a();
    }

    public VideoChatSharePresenter(Activity activity, AbstractC61222a aVar, View view, C61303k kVar, C62955c cVar, boolean z, boolean z2, List<VideoChatShareItem> list) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(aVar, "mDialog");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(kVar, "mMeeting");
        Intrinsics.checkParameterIsNotNull(cVar, "mShareVideoChatData");
        this.f158690f = activity;
        this.f158691g = aVar;
        this.f158692h = view;
        this.f158693i = kVar;
        this.f158694j = cVar;
        this.f158695k = z;
        this.f158696l = z2;
        this.f158688d = 200;
        setView(new VideoChatShareView(activity, view, new C62978d(this), kVar, z, z2));
        setModel(new VideoChatShareModel(cVar, list));
        ((IVideoChatShareContract.IView) getView()).setViewDelegate(createViewDelegate());
        this.f158689e = new C62980e(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VideoChatSharePresenter(android.app.Activity r13, com.ss.android.vc.meeting.basedialog.AbstractC61222a r14, android.view.View r15, com.ss.android.vc.meeting.framework.meeting.C61303k r16, com.ss.android.vc.meeting.module.share.C62955c r17, boolean r18, boolean r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = 0
            goto L_0x000b
        L_0x0009:
            r9 = r18
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = 0
            goto L_0x0013
        L_0x0011:
            r10 = r19
        L_0x0013:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x001c
            r0 = 0
            java.util.List r0 = (java.util.List) r0
            r11 = r0
            goto L_0x001e
        L_0x001c:
            r11 = r20
        L_0x001e:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.share.VideoChatSharePresenter.<init>(android.app.Activity, com.ss.android.vc.meeting.basedialog.a, android.view.View, com.ss.android.vc.meeting.framework.meeting.k, com.ss.android.vc.meeting.module.share.c, boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
