package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.drive.biz.preview.pdf.PDFStreamingDownloader;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.drive.report.C7136g;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.AbstractC7479b;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.Structure;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.TitleBarViewModel;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.ttpdfreader.Bookmark;
import com.bytedance.ee.plugin.common.ttpdfreader.TTPdfReader;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.p3459a.C68326a;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 R2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001RB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\tH\u0016J\u0006\u00102\u001a\u00020.J\u0006\u00103\u001a\u00020.J\b\u00104\u001a\u00020\u0006H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u000306H\u0016J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u00107\u001a\u00020\u001bJ\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fJ\u0006\u0010;\u001a\u00020<JN\u0010=\u001a\u00020.2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010)J\u0006\u0010>\u001a\u00020\tJ\b\u0010?\u001a\u00020.H\u0002J\b\u0010@\u001a\u00020.H\u0002J\b\u0010A\u001a\u00020.H\u0014J\u0010\u0010B\u001a\u00020.2\b\u0010C\u001a\u0004\u0018\u00010\u0006J\b\u0010D\u001a\u00020.H\u0003J\u0006\u0010E\u001a\u00020.J\u0006\u0010F\u001a\u00020.J\u000e\u0010G\u001a\u00020.2\u0006\u0010G\u001a\u00020HJ\u0010\u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020\u0006H\u0016J\u0012\u0010K\u001a\u00020.2\b\u0010J\u001a\u0004\u0018\u00010\u0006H\u0016J\u0006\u0010L\u001a\u00020.J\u0010\u0010M\u001a\u00020.2\b\u0010N\u001a\u0004\u0018\u00010OJ\u0006\u0010P\u001a\u00020.J\u000e\u0010Q\u001a\u00020.2\u0006\u0010:\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u0019\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u000bR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/structure/ScrollableNavigation;", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/structure/Structure;", "()V", "activeBookmarkId", "", "bookLoaded", "Landroidx/lifecycle/MutableLiveData;", "", "getBookLoaded", "()Landroidx/lifecycle/MutableLiveData;", "clickHelper", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/TTClickHelper;", "fileErrorReloadTime", "", "indicator", "getIndicator", "lastClickTime", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "pageCount", "getPageCount", "pdfOutline", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFOutline;", "pdfPageLoader", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/IPDFPageLoader;", "pdfReader", "Lcom/bytedance/ee/plugin/common/ttpdfreader/TTPdfReader;", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "previewView", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/IPreviewView;", "previewViewModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewViewModel;", "requestPwd", "getRequestPwd", "showThumbnail", "getShowThumbnail", "showViewTrackEventCallback", "Lcom/bytedance/ee/bear/drive/view/preview/OnShowViewTrackEventCallback;", "structure", "titleBarViewModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/TitleBarViewModel;", "_init", "", "changeCollapseStatus", "hash", UpdateKey.STATUS, "dismissOutline", "exitFullscreen", "getActive", "getContent", "Landroidx/lifecycle/LiveData;", "getPageLoader", "getPageSizeF", "Landroid/util/SizeF;", "page", "getRenderView", "Landroid/view/View;", "init", "isInit", "observeNetState", "observeReader", "onCleared", "openPdf", "password", "readOutline", "refresh", "release", "scale", "", "scrollTo", "contentId", "setActive", "setToFirstPage", "setTouchEvent", "ev", "Landroid/view/MotionEvent;", "toggleThumbnail", "turnToPage", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.b */
public final class PDFCtrlViewModel extends AbstractC1142af implements AbstractC7479b<Structure> {
    public static final Companion Companion = new Companion(null);
    private String activeBookmarkId;
    private final C1177w<Boolean> bookLoaded = new C1177w<>();
    public C7437a clickHelper;
    private int fileErrorReloadTime;
    private final C1177w<Integer> indicator = new C1177w<>();
    public long lastClickTime;
    private LifecycleOwner lifecycleOwner;
    private final C1177w<Integer> pageCount = new C1177w<>();
    public volatile PDFOutline pdfOutline;
    private IPDFPageLoader pdfPageLoader;
    public TTPdfReader pdfReader;
    public C7553d previewFileModel;
    public AbstractC7549a previewView;
    public C7555f previewViewModel;
    private final C1177w<Integer> requestPwd = new C1177w<>();
    private final C1177w<Boolean> showThumbnail = new C1177w<>();
    public AbstractC7256c showViewTrackEventCallback;
    public final C1177w<Structure> structure = new C1177w<>();
    public TitleBarViewModel titleBarViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlViewModel$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<Boolean> getBookLoaded() {
        return this.bookLoaded;
    }

    public final C1177w<Integer> getIndicator() {
        return this.indicator;
    }

    /* renamed from: getPageCount  reason: collision with other method in class */
    public final C1177w<Integer> m269487getPageCount() {
        return this.pageCount;
    }

    public final C1177w<Integer> getRequestPwd() {
        return this.requestPwd;
    }

    public final C1177w<Boolean> getShowThumbnail() {
        return this.showThumbnail;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.b$d */
    public static final class CallableC7469d<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlViewModel f20142a;

        CallableC7469d(PDFCtrlViewModel bVar) {
            this.f20142a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo29160a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo29160a() {
            List<Bookmark> tableOfContents = PDFCtrlViewModel.access$getPdfReader$p(this.f20142a).getTableOfContents();
            boolean a = C13657b.m55421a(tableOfContents);
            C13479a.m54764b("PDFCtrlViewModel", "readOutline, isOutlineEmpty= " + a);
            if (!a) {
                PDFCtrlViewModel bVar = this.f20142a;
                Intrinsics.checkExpressionValueIsNotNull(tableOfContents, "bookmarks");
                bVar.pdfOutline = new PDFOutline(tableOfContents);
                PDFOutline cVar = this.f20142a.pdfOutline;
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                this.f20142a.structure.mo5926a(cVar.mo29164a());
                TitleBarViewModel hVar = this.f20142a.titleBarViewModel;
                if (hVar != null) {
                    hVar.showOutlineMenu();
                }
            }
        }
    }

    public final void dismissOutline() {
        TitleBarViewModel hVar = this.titleBarViewModel;
        if (hVar != null) {
            hVar.dismissOutlineDialog();
        }
    }

    public final void exitFullscreen() {
        C7437a aVar = this.clickHelper;
        if (aVar != null) {
            aVar.mo29032b();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.AbstractC7479b
    public String getActive() {
        String str = this.activeBookmarkId;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.AbstractC7479b
    public LiveData<Structure> getContent() {
        return this.structure;
    }

    public final boolean isInit() {
        if (this.previewFileModel != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        release();
    }

    public final int getPageCount() {
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        return tTPdfReader.getTotalPage();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.b$f */
    public static final class RunnableC7471f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlViewModel f20144a;

        RunnableC7471f(PDFCtrlViewModel bVar) {
            this.f20144a = bVar;
        }

        public final void run() {
            if (this.f20144a.isInit()) {
                PDFCtrlViewModel.access$getPdfReader$p(this.f20144a).turnTo(-1);
            }
        }
    }

    private final void _init() {
        this.bookLoaded.mo5929b((Boolean) false);
        this.indicator.mo5929b((Integer) 0);
        this.pageCount.mo5929b((Integer) 0);
        observeNetState();
        observeReader();
    }

    public final View getRenderView() {
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        View view = tTPdfReader.getView();
        Intrinsics.checkExpressionValueIsNotNull(view, "pdfReader.view");
        return view;
    }

    public final void refresh() {
        C13479a.m54764b("PDFCtrlViewModel", "refresh() start");
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        tTPdfReader.refresh();
    }

    private final void observeNetState() {
        C1177w<Boolean> liveOuterNetState;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        C7555f fVar = this.previewViewModel;
        if (fVar != null && (liveOuterNetState = fVar.liveOuterNetState()) != null) {
            LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
            if (lifecycleOwner2 == null) {
                Intrinsics.throwNpe();
            }
            liveOuterNetState.mo5923a(lifecycleOwner2, new C7466b(this, booleanRef));
        }
    }

    private final void observeReader() {
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        tTPdfReader.setPageErrorTips(C13615c.f35773a.getString(R.string.Drive_Drive_LoadingFail));
        TTPdfReader tTPdfReader2 = this.pdfReader;
        if (tTPdfReader2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        tTPdfReader2.setListener(new C7467c(this));
    }

    public final IPDFPageLoader getPageLoader() {
        String str;
        if (this.pdfPageLoader == null) {
            C7553d dVar = this.previewFileModel;
            if (dVar == null || (str = dVar.mo29479b()) == null) {
                str = "";
            }
            TTPdfReader tTPdfReader = this.pdfReader;
            if (tTPdfReader == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
            }
            this.pdfPageLoader = new PDFPageLoaderImpl(str, tTPdfReader);
        }
        IPDFPageLoader aVar = this.pdfPageLoader;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        return aVar;
    }

    public final void readOutline() {
        if (C7473f.m29888d()) {
            C7553d dVar = this.previewFileModel;
            if (dVar == null || !dVar.mo29491j()) {
                AbstractC68307f.m265099b((Callable) new CallableC7469d(this)).mo238004b(C11678b.m48477a()).mo238001b(C68326a.m265193b(), C7470e.f20143a);
            }
        }
    }

    public final void setToFirstPage() {
        scale(1.0f);
        if (Intrinsics.areEqual((Object) this.showThumbnail.mo5927b(), (Object) true)) {
            this.showThumbnail.mo5929b((Boolean) false);
        }
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        tTPdfReader.getView().post(new RunnableC7471f(this));
    }

    public final void toggleThumbnail() {
        Boolean b = this.showThumbnail.mo5927b();
        if (b == null) {
            b = false;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "showThumbnail.value ?: false");
        this.showThumbnail.mo5929b(Boolean.valueOf(!b.booleanValue()));
    }

    public final void release() {
        C13479a.m54764b("PDFCtrlViewModel", "release. ");
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        tTPdfReader.close();
        this.previewFileModel = null;
        this.previewView = null;
        IPDFPageLoader aVar = this.pdfPageLoader;
        if (aVar != null) {
            aVar.mo29111c();
        }
        this.pdfPageLoader = null;
        this.pdfOutline = null;
        this.activeBookmarkId = null;
        this.bookLoaded.mo5929b((Boolean) false);
        this.showThumbnail.mo5929b((Boolean) false);
        this.indicator.mo5929b((Integer) 0);
        this.pageCount.mo5929b((Integer) 0);
        this.requestPwd.mo5929b((Integer) null);
        this.structure.mo5929b((Structure) null);
        this.lifecycleOwner = null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.AbstractC7479b
    public void setActive(String str) {
        this.activeBookmarkId = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFCtrlViewModel$observeReader$1", "Lcom/bytedance/ee/plugin/common/ttpdfreader/TTPdfReader$Listener;", "onError", "", "what", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/os/Bundle;", "onInfo", "onReport", "event", "", "params", "Lorg/json/JSONObject;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.b$c */
    public static final class C7467c implements TTPdfReader.Listener {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlViewModel f20140a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7467c(PDFCtrlViewModel bVar) {
            this.f20140a = bVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.b$c$a */
        static final class View$OnClickListenerC7468a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C7467c f20141a;

            View$OnClickListenerC7468a(C7467c cVar) {
                this.f20141a = cVar;
            }

            public final void onClick(View view) {
                C13479a.m54764b("PDFCtrlViewModel", "banner click retry");
                this.f20141a.f20140a.refresh();
            }
        }

        @Override // com.bytedance.ee.plugin.common.ttpdfreader.TTPdfReader.Listener
        public void onReport(String str, JSONObject jSONObject) {
            C13479a.m54772d("PDFCtrlViewModel", "reportEvent: " + str + "  jsonObject: " + jSONObject);
            C5234y.m21391b().mo21080a(str, jSONObject);
        }

        @Override // com.bytedance.ee.plugin.common.ttpdfreader.TTPdfReader.Listener
        public void onError(int i, Bundle bundle) {
            String str;
            C1177w<C7555f.C7556a> liveInnerChangeTipsState;
            String str2;
            C1177w<String> liveInnerUnsupprtPreview;
            C1177w<Integer> wVar;
            C7136g<C7557g> liveInnerReportMsg;
            if (bundle == null || (str = bundle.toString()) == null) {
                str = "";
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "data?.toString() ?: \"\"");
            String str3 = "onError what: " + i + ", data: " + str;
            Throwable th = new Throwable(str3);
            C13479a.m54758a("PDFCtrlViewModel", str3);
            if (!(i == 2002 || i == 2001 || i == 5001)) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = hashMap;
                hashMap2.put("open_type", "tt_pdf");
                hashMap2.put("source_type", String.valueOf(3));
                String a = C7128a.m28540a(th);
                Intrinsics.checkExpressionValueIsNotNull(a, "DriveDevPerformanceRepor…etErrorMessage(throwable)");
                hashMap2.put("error_message", a);
                C7555f fVar = this.f20140a.previewViewModel;
                if (!(fVar == null || (liveInnerReportMsg = fVar.liveInnerReportMsg()) == null)) {
                    liveInnerReportMsg.mo28018a(C7557g.m30301a(21, hashMap));
                }
            }
            if (i != 5001) {
                switch (i) {
                    case 2000:
                    case 2001:
                        C7553d dVar = this.f20140a.previewFileModel;
                        String str4 = null;
                        if (dVar != null) {
                            str2 = dVar.mo29494m();
                        } else {
                            str2 = null;
                        }
                        if (!C6892d.m27254l(str2)) {
                            C7555f fVar2 = this.f20140a.previewViewModel;
                            if (fVar2 != null && (wVar = fVar2.getliveInnerDowngrade()) != null) {
                                wVar.mo5926a((Integer) 2);
                                return;
                            }
                            return;
                        }
                        C13479a.m54764b("PDFCtrlViewModel", "pdf show error in pdfView, ignore downgrade, show error");
                        C7555f fVar3 = this.f20140a.previewViewModel;
                        if (!(fVar3 == null || (liveInnerUnsupprtPreview = fVar3.liveInnerUnsupprtPreview()) == null)) {
                            C7553d dVar2 = this.f20140a.previewFileModel;
                            if (dVar2 != null) {
                                str4 = dVar2.mo29494m();
                            }
                            liveInnerUnsupprtPreview.mo5926a(str4);
                        }
                        AbstractC7256c cVar = this.f20140a.showViewTrackEventCallback;
                        if (cVar != null) {
                            cVar.mo26119a("tt_pdf", th);
                        }
                        C6712a.m26465c(this.f20140a.previewViewModel, this.f20140a.previewView);
                        return;
                    case 2002:
                        this.f20140a.getRequestPwd().mo5926a((Integer) 0);
                        return;
                    default:
                        return;
                }
            } else {
                C7555f.C7556a aVar = new C7555f.C7556a();
                aVar.mo29563a(true);
                Application application = C13615c.f35773a;
                Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
                aVar.mo29562a(application.getResources().getString(R.string.CreationMobile_Drive_PDFLoading_failed_toast));
                Application application2 = C13615c.f35773a;
                Intrinsics.checkExpressionValueIsNotNull(application2, "ContextUtils.baseApplication");
                aVar.mo29566b(application2.getResources().getString(R.string.CreationMobile_Drive_PDFLoading_failed_toast_btn));
                aVar.mo29561a(new View$OnClickListenerC7468a(this));
                aVar.mo29565b(1);
                C7555f fVar4 = this.f20140a.previewViewModel;
                if (fVar4 != null && (liveInnerChangeTipsState = fVar4.getLiveInnerChangeTipsState()) != null) {
                    liveInnerChangeTipsState.mo5926a(aVar);
                }
            }
        }

        @Override // com.bytedance.ee.plugin.common.ttpdfreader.TTPdfReader.Listener
        public void onInfo(int i, Bundle bundle) {
            String str;
            int i2;
            C7136g<C7557g> liveInnerReportMsg;
            int i3;
            int i4;
            C7555f fVar;
            C1177w<String> liveInnerRoute;
            C7437a aVar;
            String str2 = "";
            if (bundle == null || (str = bundle.toString()) == null) {
                str = str2;
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "data?.toString() ?: \"\"");
            C13479a.m54764b("PDFCtrlViewModel", "onInfo what: " + i + " msg: " + str);
            switch (i) {
                case 1000:
                    this.f20140a.getBookLoaded().mo5926a((Boolean) true);
                    C1177w<Integer> pageCount = this.f20140a.m269487getPageCount();
                    if (bundle != null) {
                        i2 = Integer.valueOf(bundle.getInt("pages"));
                    } else {
                        i2 = 0;
                    }
                    pageCount.mo5926a(i2);
                    this.f20140a.getRequestPwd().mo5926a((Integer) 1);
                    AbstractC7256c cVar = this.f20140a.showViewTrackEventCallback;
                    if (cVar != null) {
                        cVar.mo26118a("tt_pdf");
                    }
                    C6712a.m26464b(this.f20140a.previewViewModel, this.f20140a.previewView);
                    C13479a.m54764b("PDFCtrlViewModel", "trackOpenDowngradeSuccess, openType: tt_pdf");
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = hashMap;
                    hashMap2.put("open_type", "tt_pdf");
                    hashMap2.put("source_type", String.valueOf(3));
                    C7555f fVar2 = this.f20140a.previewViewModel;
                    if (!(fVar2 == null || (liveInnerReportMsg = fVar2.liveInnerReportMsg()) == null)) {
                        liveInnerReportMsg.mo28018a(C7557g.m30301a(22, hashMap));
                    }
                    this.f20140a.readOutline();
                    return;
                case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                    C1177w<Integer> pageCount2 = this.f20140a.m269487getPageCount();
                    if (bundle != null) {
                        i3 = Integer.valueOf(bundle.getInt("page_count", 0));
                    } else {
                        i3 = 0;
                    }
                    pageCount2.mo5926a(i3);
                    C1177w<Integer> indicator = this.f20140a.getIndicator();
                    if (bundle != null) {
                        i4 = Integer.valueOf(bundle.getInt("page"));
                    } else {
                        i4 = 0;
                    }
                    indicator.mo5926a(i4);
                    return;
                case 1002:
                case 1003:
                default:
                    return;
                case 1004:
                    if (bundle != null && (fVar = this.f20140a.previewViewModel) != null && (liveInnerRoute = fVar.liveInnerRoute()) != null) {
                        String string = bundle.getString("link");
                        if (string != null) {
                            str2 = string;
                        }
                        liveInnerRoute.mo5926a(str2);
                        return;
                    }
                    return;
                case 1005:
                    if (System.currentTimeMillis() - this.f20140a.lastClickTime > ((long) 1000) && (aVar = this.f20140a.clickHelper) != null) {
                        aVar.mo29032b();
                        return;
                    }
                    return;
                case 1006:
                    this.f20140a.lastClickTime = System.currentTimeMillis();
                    C7437a aVar2 = this.f20140a.clickHelper;
                    if (aVar2 != null) {
                        aVar2.mo29028a();
                        return;
                    }
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.b$e */
    public static final class C7470e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C7470e f20143a = new C7470e();

        C7470e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("PDFCtrlViewModel", "readOutline err. ", th);
        }
    }

    public final void setTouchEvent(MotionEvent motionEvent) {
        C7437a aVar = this.clickHelper;
        if (aVar != null) {
            aVar.mo29029a(motionEvent);
        }
    }

    public static final /* synthetic */ TTPdfReader access$getPdfReader$p(PDFCtrlViewModel bVar) {
        TTPdfReader tTPdfReader = bVar.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        return tTPdfReader;
    }

    public final void turnToPage(int i) {
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        tTPdfReader.turnTo(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.b$b */
    public static final class C7466b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PDFCtrlViewModel f20138a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f20139b;

        C7466b(PDFCtrlViewModel bVar, Ref.BooleanRef booleanRef) {
            this.f20138a = bVar;
            this.f20139b = booleanRef;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (this.f20139b.element) {
                this.f20139b.element = false;
            } else if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f20138a.refresh();
            }
        }
    }

    public final void scale(float f) {
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        if (tTPdfReader.getScale() != f) {
            TTPdfReader tTPdfReader2 = this.pdfReader;
            if (tTPdfReader2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
            }
            tTPdfReader2.setScale(f);
        }
    }

    public final SizeF getPageSizeF(int i) {
        float f;
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        SizeF pageSize = tTPdfReader.getPageSize(i);
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (pageSize != null) {
            f = pageSize.getWidth();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (pageSize != null) {
            f2 = pageSize.getHeight();
        }
        return new SizeF(f, f2);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.AbstractC7479b
    public void scrollTo(String str) {
        Intrinsics.checkParameterIsNotNull(str, "contentId");
        if (this.pdfOutline != null) {
            PDFOutline cVar = this.pdfOutline;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            Bookmark a = cVar.mo29165a(str);
            if (a != null) {
                int pageIdx = (int) a.getPageIdx();
                C13479a.m54764b("PDFCtrlViewModel", "Click bookmark, pageIdx: " + pageIdx);
                if (pageIdx >= 0) {
                    TTPdfReader tTPdfReader = this.pdfReader;
                    if (tTPdfReader == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
                    }
                    tTPdfReader.turnTo(pageIdx);
                }
            }
        }
    }

    public final void openPdf(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String a;
        String r;
        String b;
        String str6;
        C1177w<Void> liveInnerReload;
        LinkedHashMap<String, String> f;
        Set<Map.Entry<String, String>> entrySet;
        C13479a.m54764b("PDFCtrlViewModel", "openPdf() pwd empty=" + TextUtils.isEmpty(str));
        AbstractC7256c cVar = this.showViewTrackEventCallback;
        if (cVar != null) {
            cVar.mo26117a();
        }
        C6712a.m26463a(this.previewViewModel, this.previewView);
        C1177w<Object> wVar = null;
        Uri uri = null;
        C7553d dVar = this.previewFileModel;
        if (!(dVar == null || (f = dVar.mo29487f()) == null || (entrySet = f.entrySet()) == null)) {
            for (Map.Entry<String, String> entry : entrySet) {
                uri = Uri.parse(entry.getValue());
            }
        }
        C7553d dVar2 = this.previewFileModel;
        long j = 0;
        if (dVar2 == null || !dVar2.mo29491j() || uri == null) {
            C7553d dVar3 = this.previewFileModel;
            if (dVar3 == null || (str6 = dVar3.mo29485e()) == null) {
                str6 = "";
            }
            File file = new File(str6);
            C13479a.m54764b("PDFCtrlViewModel", "openPdf() by local file=" + file + " size=" + file.length());
            Uri fromFile = Uri.fromFile(file);
            if (file.length() <= 0) {
                C13479a.m54764b("PDFCtrlViewModel", "file not found, try to reload, fileErrorReloadTime=" + this.fileErrorReloadTime);
                if (this.fileErrorReloadTime < 2 && isInit()) {
                    this.fileErrorReloadTime++;
                    C7555f fVar = this.previewViewModel;
                    if (!(fVar == null || (liveInnerReload = fVar.liveInnerReload()) == null)) {
                        liveInnerReload.mo5926a((Void) null);
                        return;
                    }
                    return;
                }
                return;
            }
            uri = fromFile;
        } else {
            C13479a.m54764b("PDFCtrlViewModel", "openPdf() by streaming...");
        }
        C7553d dVar4 = this.previewFileModel;
        if (!TextUtils.isEmpty(dVar4 != null ? dVar4.mo29483d() : null)) {
            C7553d dVar5 = this.previewFileModel;
            if (dVar5 == null) {
                Intrinsics.throwNpe();
            }
            str2 = dVar5.mo29483d();
            Intrinsics.checkExpressionValueIsNotNull(str2, "previewFileModel!!.previewExt");
        } else {
            C7553d dVar6 = this.previewFileModel;
            if (dVar6 == null || (str2 = dVar6.mo29494m()) == null) {
                str2 = "";
            }
        }
        StringBuilder sb = new StringBuilder();
        File a2 = C6880a.m27068a((Context) C13615c.f35773a);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DriveCacheManager.getStr…extUtils.baseApplication)");
        sb.append(a2.getAbsolutePath());
        sb.append(File.separator);
        C7555f fVar2 = this.previewViewModel;
        sb.append(fVar2 != null ? Integer.valueOf(fVar2.getBizType()) : null);
        sb.append("_");
        C7553d dVar7 = this.previewFileModel;
        sb.append(dVar7 != null ? dVar7.mo29479b() : null);
        sb.append("_");
        C7553d dVar8 = this.previewFileModel;
        sb.append(dVar8 != null ? dVar8.mo29476a() : null);
        sb.append(".pdf");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("openPdf, streamingFilePath: ");
        sb3.append(C13598b.m55197d(sb2));
        sb3.append(", previewFileSize: ");
        C7553d dVar9 = this.previewFileModel;
        sb3.append(dVar9 != null ? Long.valueOf(dVar9.mo29492k()) : null);
        sb3.append(", ");
        sb3.append("uri: ");
        sb3.append(C13598b.m55197d(String.valueOf(uri)));
        sb3.append(", apiExtra: ");
        C7553d dVar10 = this.previewFileModel;
        sb3.append(dVar10 != null ? dVar10.mo29499r() : null);
        sb3.append(", dataVersion: ");
        C7553d dVar11 = this.previewFileModel;
        sb3.append(dVar11 != null ? dVar11.mo29476a() : null);
        C13479a.m54764b("PDFCtrlViewModel", sb3.toString());
        TTPdfReader tTPdfReader = this.pdfReader;
        if (tTPdfReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        C7553d dVar12 = this.previewFileModel;
        if (dVar12 == null || (b = dVar12.mo29479b()) == null) {
            str3 = "";
        } else {
            str3 = b;
        }
        String valueOf = String.valueOf(uri);
        C7553d dVar13 = this.previewFileModel;
        if (dVar13 != null) {
            j = dVar13.mo29492k();
        }
        C7553d dVar14 = this.previewFileModel;
        if (dVar14 == null || (r = dVar14.mo29499r()) == null) {
            str4 = "";
        } else {
            str4 = r;
        }
        C7553d dVar15 = this.previewFileModel;
        if (dVar15 == null || (a = dVar15.mo29476a()) == null) {
            str5 = "";
        } else {
            str5 = a;
        }
        C7555f fVar3 = this.previewViewModel;
        if (fVar3 != null) {
            wVar = fVar3.liveInnerSaveCache();
        }
        tTPdfReader.setStreamingDownloader(new PDFStreamingDownloader(str3, valueOf, sb2, j, str4, str5, wVar));
        TTPdfReader tTPdfReader2 = this.pdfReader;
        if (tTPdfReader2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfReader");
        }
        tTPdfReader2.open(uri, str, str2);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.AbstractC7479b
    public void changeCollapseStatus(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "hash");
        if (this.pdfOutline != null) {
            PDFOutline cVar = this.pdfOutline;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            cVar.mo29166a(str, !z);
            C1177w<Structure> wVar = this.structure;
            PDFOutline cVar2 = this.pdfOutline;
            if (cVar2 == null) {
                Intrinsics.throwNpe();
            }
            wVar.mo5929b(cVar2.mo29164a());
        }
    }

    public final void init(LifecycleOwner lifecycleOwner2, TTPdfReader tTPdfReader, C7553d dVar, C7555f fVar, TitleBarViewModel hVar, AbstractC7549a aVar, C7437a aVar2, AbstractC7256c cVar) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(tTPdfReader, "pdfReader");
        Intrinsics.checkParameterIsNotNull(aVar, "previewView");
        Intrinsics.checkParameterIsNotNull(aVar2, "clickHelper");
        this.pdfReader = tTPdfReader;
        this.previewFileModel = dVar;
        this.previewViewModel = fVar;
        this.titleBarViewModel = hVar;
        this.previewView = aVar;
        this.clickHelper = aVar2;
        this.showViewTrackEventCallback = cVar;
        this.lifecycleOwner = lifecycleOwner2;
        _init();
    }
}
