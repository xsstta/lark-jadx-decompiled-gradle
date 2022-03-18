package com.bytedance.ee.bear.debug.doctest;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.C5087ae;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.debug.doctest.PopWindowImpl;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.ak;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIDriveOpenMonitor;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001RBE\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020)H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\b\u0010.\u001a\u00020)H\u0002J\u0012\u0010/\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u00010$H\u0016J\"\u00101\u001a\u00020)2\u0006\u00100\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u00010$2\u0006\u00103\u001a\u00020!H\u0016J\b\u00104\u001a\u00020)H\u0016J\b\u00105\u001a\u00020)H\u0016J\b\u00106\u001a\u00020)H\u0016J(\u00107\u001a\u00020)2\b\u00108\u001a\u0004\u0018\u0001092\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0018\u00010;H\u0016J\u001e\u0010<\u001a\u00020)2\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0018\u00010;H\u0016J\u0012\u0010>\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u00010$H\u0016J\b\u0010?\u001a\u00020)H\u0016J\b\u0010@\u001a\u00020)H\u0016J\u0010\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020)H\u0016J\b\u0010E\u001a\u00020)H\u0016J\b\u0010F\u001a\u00020)H\u0016J\u0016\u0010G\u001a\u00020)2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\b\u0010I\u001a\u00020)H\u0016J:\u0010J\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u00010$2&\u0010K\u001a\"\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0018\u00010Lj\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0018\u0001`MH\u0002J\b\u0010N\u001a\u00020)H\u0002J\b\u0010O\u001a\u00020)H\u0016J\b\u0010P\u001a\u00020)H\u0002J\b\u0010Q\u001a\u00020)H\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/DocAutoTestImpl;", "Lcom/bytedance/ee/bear/debug/doctest/IDocAutoTest;", "Lcom/bytedance/ee/bear/debug/doctest/IDocTrigger;", "Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl$DialogDismiss;", "Lcom/bytedance/ee/bear/contract/DocWebService$RenderCallback;", "Lcom/bytedance/ee/bear/drive/services/BinderIDriveOpenMonitor$Stub;", "mContext", "Landroid/content/Context;", "mNetService", "Lcom/bytedance/ee/bear/contract/NetService;", "mRouterService", "Lcom/bytedance/ee/bear/route/RouteService;", "mDebugServiceImp", "Lcom/bytedance/ee/bear/debug/doctest/DocDebugService;", "mDocWebService", "Lcom/bytedance/ee/bear/contract/DocWebService;", "mDriveService", "Lcom/bytedance/ee/bear/drive/services/DriveService;", "mInfoProvideService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "mLoginService", "Lcom/bytedance/ee/bear/contract/LocalAccountService;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/contract/NetService;Lcom/bytedance/ee/bear/route/RouteService;Lcom/bytedance/ee/bear/debug/doctest/DocDebugService;Lcom/bytedance/ee/bear/contract/DocWebService;Lcom/bytedance/ee/bear/drive/services/DriveService;Lcom/bytedance/ee/bear/contract/InfoProvideService;Lcom/bytedance/ee/bear/contract/LocalAccountService;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "mCounter", "Lcom/bytedance/ee/bear/debug/doctest/DocCounter;", "mPop", "Lcom/bytedance/ee/bear/debug/doctest/IPopWindow;", "mRequest", "Lcom/bytedance/ee/bear/debug/doctest/IRequest;", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "stopWorld", "", "whiteList", "", "", "whiteListType", "Ljava/util/ArrayList;", "", "autoOpen", "", "docInfo", "autoPullRefresh", "dismiss", "getWhiteList", "loadMore", "onDocGoBack", "url", "onDocStart", "tag", "forward", "onDownloadFullResource", "onOpenFinish", "onRenderByWaitPreload", "onRenderFail", "throwable", "", "map", "", "onRenderSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onRendering", "onWaitDownloadFullResource", "onWaitPreloading", "openDoc", "doc", "Lcom/bytedance/ee/bear/list/dto/Document;", "openNext", "pause", "resume", "setWhiteList", "types", "start", "startRequest", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "startTimeoutCountdown", "stop", "stopPull", "stopTimeoutCountdown", "Companion", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocAutoTestImpl extends BinderIDriveOpenMonitor.Stub implements AbstractC5089af.AbstractC5091b, IDocAutoTest, IDocTrigger, PopWindowImpl.DialogDismiss {
    public static final Companion Companion = new Companion(null);
    private final C68289a disposables = new C68289a();
    private final Context mContext;
    private final DocCounter mCounter;
    private final AbstractC5279b mDebugServiceImp;
    public final AbstractC5089af mDocWebService;
    private final AbstractC7184l mDriveService;
    private final al mInfoProvideService;
    private final an mLoginService;
    private final NetService mNetService;
    private final IPopWindow mPop;
    private final IRequest<DocumentListInfo> mRequest;
    public final AbstractC10740f mRouterService;
    private boolean stopWorld;
    private List<String> whiteList;
    private final ArrayList<Integer> whiteListType;

    private final void stopPull() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onDocGoBack(String str) {
    }

    public void onDocStart(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "url");
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onRenderByWaitPreload() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onRenderFail(Throwable th, Map<String, String> map) {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onRendering(String str) {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onWaitPreloading() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/DocAutoTestImpl$Companion;", "", "()V", "TAG", "", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.debug.doctest.PopWindowImpl.DialogDismiss
    public void dismiss() {
        stop();
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IDocAutoTest
    public List<String> getWhiteList() {
        return this.whiteList;
    }

    public void resume() {
        autoPullRefresh();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7187c
    public void onOpenFinish() {
        onRenderSuccess(null);
    }

    public void pause() {
        stopPull();
        stopTimeoutCountdown();
    }

    private final void stopTimeoutCountdown() {
        C13479a.m54764b("DocAutoTestImpl", "stopTimeoutCountdown. ");
        this.disposables.mo237935a();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onDownloadFullResource() {
        throw new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onWaitDownloadFullResource() {
        throw new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IDocAutoTest
    public void stop() {
        C13479a.m54764b("DocAutoTestImpl", "stop");
        this.stopWorld = true;
        pause();
        this.mCounter.mo21238a().clear();
        this.mPop.mo21252b();
    }

    private final void loadMore() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("check_id", this.mCounter.mo21246d());
        hashMap.put("next_id", this.mCounter.mo21244c());
        hashMap.put("next_id", this.mCounter.mo21242b());
        hashMap.put(ShareHitPoint.f121869d, "4");
        startRequest("/api/explorer/my/object/list/", hashMap);
    }

    private final void startTimeoutCountdown() {
        C13479a.m54764b("DocAutoTestImpl", "startTimeoutCountdown. ");
        this.disposables.mo237937a(AbstractC68307f.m265098b(35, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(new C5277j(this), C5278k.f15114a));
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IDocAutoTest
    public void start() {
        C13479a.m54764b("DocAutoTestImpl", "start");
        this.stopWorld = false;
        this.mPop.mo21251a();
        this.mDocWebService.mo20186a(this);
        this.mDriveService.registerOpenMonitor(this);
        resume();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl */
    /* JADX WARN: Multi-variable type inference failed */
    public final void autoPullRefresh() {
        if (TextUtils.isEmpty((CharSequence) new PersistenceSharedPreference("debug_config").mo34038b("folder_token", ""))) {
            startRequest(null, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("need_path", "1");
        hashMap.put("need_total", "1");
        hashMap.put("token", new PersistenceSharedPreference("debug_config").mo34038b("folder_token", ""));
        startRequest("/api/explorer/folder/children/", hashMap);
    }

    public void openNext() {
        while (this.mCounter.mo21248f()) {
            Document g = this.mCounter.mo21249g();
            if (g != null && this.whiteListType.contains(Integer.valueOf(g.mo32483t()))) {
                AbstractC68307f.m265083a(g).mo237985a(C11678b.m48481e()).mo238001b(new C5273f(this, g), C5274g.f15110a);
                return;
            }
        }
        if (this.mCounter.mo21247e()) {
            loadMore();
        } else {
            autoPullRefresh();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$e */
    public static final class C5272e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C5272e f15107a = new C5272e();

        C5272e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13606d.m55245a("DocAutoTestImpl", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/list/dto/Document;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$f */
    public static final class C5273f<T> implements Consumer<Document> {

        /* renamed from: a */
        final /* synthetic */ DocAutoTestImpl f15108a;

        /* renamed from: b */
        final /* synthetic */ Document f15109b;

        C5273f(DocAutoTestImpl docAutoTestImpl, Document document) {
            this.f15108a = docAutoTestImpl;
            this.f15109b = document;
        }

        /* renamed from: a */
        public final void accept(Document document) {
            this.f15108a.openDoc(this.f15109b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$g */
    public static final class C5274g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C5274g f15110a = new C5274g();

        C5274g() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("DocAutoTestImpl", "error!", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$h */
    public static final class C5275h<T> implements Consumer<DocumentListInfo> {

        /* renamed from: a */
        final /* synthetic */ DocAutoTestImpl f15111a;

        C5275h(DocAutoTestImpl docAutoTestImpl) {
            this.f15111a = docAutoTestImpl;
        }

        /* renamed from: a */
        public final void accept(DocumentListInfo documentListInfo) {
            DocAutoTestImpl docAutoTestImpl = this.f15111a;
            Intrinsics.checkExpressionValueIsNotNull(documentListInfo, "it");
            docAutoTestImpl.autoOpen(documentListInfo);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$i */
    public static final class C5276i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocAutoTestImpl f15112a;

        C5276i(DocAutoTestImpl docAutoTestImpl) {
            this.f15112a = docAutoTestImpl;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("DocAutoTestImpl", th);
            this.f15112a.autoPullRefresh();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$k */
    public static final class C5278k<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C5278k f15114a = new C5278k();

        C5278k() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "t");
            C13479a.m54759a("DocAutoTestImpl", "timeoutCountdown err. ", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0004*\u0001\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "com/bytedance/ee/bear/debug/doctest/DocAutoTestImpl$onRenderSuccess$1", "kotlin.jvm.PlatformType", "accept", "(Lcom/bytedance/ee/bear/debug/doctest/DocAutoTestImpl$onRenderSuccess$1;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$d */
    public static final class C5271d<T> implements Consumer<C5269b> {

        /* renamed from: a */
        public static final C5271d f15106a = new C5271d();

        C5271d() {
        }

        /* renamed from: a */
        public final void accept(C5269b bVar) {
            DocAutoTestImpl docAutoTestImpl;
            C13479a.m54764b("DocAutoTestImpl", "after 2 seconds openNext");
            if (bVar != null && (docAutoTestImpl = (DocAutoTestImpl) bVar.get()) != null) {
                docAutoTestImpl.openNext();
            }
        }
    }

    public final void openDoc(Document document) {
        if (!this.stopWorld) {
            this.mRouterService.mo17292a(document.mo32481s());
            startTimeoutCountdown();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0004*\u0001\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "com/bytedance/ee/bear/debug/doctest/DocAutoTestImpl$onRenderSuccess$1", "it", "apply", "(Lcom/bytedance/ee/bear/debug/doctest/DocAutoTestImpl$onRenderSuccess$1;)Lcom/bytedance/ee/bear/debug/doctest/DocAutoTestImpl$onRenderSuccess$1;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$c */
    public static final class C5270c<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ DocAutoTestImpl f15105a;

        C5270c(DocAutoTestImpl docAutoTestImpl) {
            this.f15105a = docAutoTestImpl;
        }

        /* renamed from: a */
        public final C5269b apply(C5269b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            C13479a.m54764b("DocAutoTestImpl", "onBackPressed");
            Activity b = this.f15105a.mRouterService.mo17294b();
            if (b != null) {
                b.onBackPressed();
            }
            DocBridgeWebViewV2 b2 = ak.m22924b();
            if (b2 != null) {
                b2.mo22367m();
            }
            return bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$j */
    public static final class C5277j<T> implements Consumer<Long> {

        /* renamed from: a */
        final /* synthetic */ DocAutoTestImpl f15113a;

        C5277j(DocAutoTestImpl docAutoTestImpl) {
            this.f15113a = docAutoTestImpl;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            C13479a.m54764b("DocAutoTestImpl", "openDoc timeout, next. ");
            this.f15113a.mDocWebService.mo20186a(this.f15113a);
            Activity b = this.f15113a.mRouterService.mo17294b();
            if (b != null) {
                b.onBackPressed();
            }
            this.f15113a.openNext();
        }
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IDocAutoTest
    public void setWhiteList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "types");
        this.whiteListType.clear();
        this.whiteList = list;
        for (String str : list) {
            this.whiteListType.add(Integer.valueOf(C8275a.m34051b(str)));
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onRenderSuccess(Map<String, String> map) {
        stopTimeoutCountdown();
        if (C5087ae.f14801a.booleanValue() && !this.stopWorld) {
            AbstractC68307f.m265083a(new C5269b(this, this)).mo238019d(4, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238020d(new C5270c(this)).mo238019d(3, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(C5271d.f15106a, C5272e.f15107a);
        }
    }

    public final void autoOpen(DocumentListInfo documentListInfo) {
        if (!this.stopWorld) {
            ArrayList<Document> documentList = documentListInfo.getDocumentList();
            Intrinsics.checkExpressionValueIsNotNull(documentList, "docInfo.documentList");
            ArrayList arrayList = new ArrayList();
            for (T t : documentList) {
                if (this.whiteListType.contains(Integer.valueOf(t.mo32483t()))) {
                    arrayList.add(t);
                }
            }
            this.mCounter.mo21238a().addAll(arrayList);
            DocCounter aVar = this.mCounter;
            String lastLabel = documentListInfo.getLastLabel();
            String str = "";
            if (lastLabel == null) {
                lastLabel = str;
            }
            aVar.mo21240a(lastLabel);
            DocCounter aVar2 = this.mCounter;
            String nextId = documentListInfo.getNextId();
            if (nextId == null) {
                nextId = str;
            }
            aVar2.mo21243b(nextId);
            DocCounter aVar3 = this.mCounter;
            String checkId = documentListInfo.getCheckId();
            if (checkId != null) {
                str = checkId;
            }
            aVar3.mo21245c(str);
            this.mCounter.mo21241a(documentListInfo.isHasMore());
            if (this.mCounter.mo21248f()) {
                openNext();
            } else {
                autoPullRefresh();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/bytedance/ee/bear/debug/doctest/DocAutoTestImpl$onRenderSuccess$1", "Ljava/lang/ref/WeakReference;", "Lcom/bytedance/ee/bear/debug/doctest/DocAutoTestImpl;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl$b */
    public static final class C5269b extends WeakReference<DocAutoTestImpl> {

        /* renamed from: a */
        final /* synthetic */ DocAutoTestImpl f15104a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5269b(DocAutoTestImpl docAutoTestImpl, Object obj) {
            super(obj);
            this.f15104a = docAutoTestImpl;
        }
    }

    private final void startRequest(String str, HashMap<String, String> hashMap) {
        AbstractC68307f<DocumentListInfo> fVar;
        if (!this.stopWorld) {
            if (str == null || hashMap == null) {
                fVar = this.mRequest.mo21253a();
            } else {
                fVar = this.mRequest.mo21254a(str, hashMap);
            }
            fVar.mo237985a(C11678b.m48481e()).mo238001b(new C5275h(this), new C5276i(this));
        }
    }

    public DocAutoTestImpl(Context context, NetService netService, AbstractC10740f fVar, AbstractC5279b bVar, AbstractC5089af afVar, AbstractC7184l lVar, al alVar, an anVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(netService, "mNetService");
        Intrinsics.checkParameterIsNotNull(fVar, "mRouterService");
        Intrinsics.checkParameterIsNotNull(bVar, "mDebugServiceImp");
        Intrinsics.checkParameterIsNotNull(afVar, "mDocWebService");
        Intrinsics.checkParameterIsNotNull(lVar, "mDriveService");
        Intrinsics.checkParameterIsNotNull(alVar, "mInfoProvideService");
        Intrinsics.checkParameterIsNotNull(anVar, "mLoginService");
        this.mContext = context;
        this.mNetService = netService;
        this.mRouterService = fVar;
        this.mDebugServiceImp = bVar;
        this.mDocWebService = afVar;
        this.mDriveService = lVar;
        this.mInfoProvideService = alVar;
        this.mLoginService = anVar;
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        C8275a aVar2 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
        C8275a aVar3 = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.BITABLE");
        this.whiteList = CollectionsKt.listOf((Object[]) new String[]{aVar.mo32553a(), aVar2.mo32553a(), aVar3.mo32553a()});
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.whiteListType = arrayList;
        PopWindowImpl hVar = new PopWindowImpl(context, this);
        this.mPop = hVar;
        this.mRequest = new RequestImpl(netService);
        this.mCounter = new DocCounter(hVar);
        C8275a aVar4 = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.DOC");
        arrayList.add(Integer.valueOf(aVar4.mo32555b()));
        C8275a aVar5 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar5, "DocumentType.SHEET");
        arrayList.add(Integer.valueOf(aVar5.mo32555b()));
    }
}
