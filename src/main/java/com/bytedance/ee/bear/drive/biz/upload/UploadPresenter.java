package com.bytedance.ee.bear.drive.biz.upload;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.common.C6890b;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a;
import com.bytedance.ee.bear.drive.config.AbstractC6910a;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.middleground.drive.export.UploadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.SingleFileQuotaConfig;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007J\b\u0010\u0018\u001a\u00020\u0011H\u0002J>\u0010\u0019\u001a\u00020\u00112\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015J&\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\u0011H\u0002J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u000fH\u0002J>\u0010)\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/upload/UploadPresenter;", "Lcom/bytedance/ee/bear/drive/common/mvpframeworks/base/mvp/AbsMvpPresenter;", "Lcom/bytedance/ee/bear/drive/biz/upload/IUploadView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "driveConfigService", "Lcom/bytedance/ee/bear/drive/config/DriveConfigService;", "(Landroidx/fragment/app/FragmentActivity;Lcom/bytedance/ee/bear/drive/config/DriveConfigService;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "mCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mDriveCacheManager", "Lcom/bytedance/ee/bear/drive/cache/DriveCacheManager;", "mUploadTotalCount", "", "addUploadDriveFileCache", "", "filePointer", "", "isFileUseUri", "", "objToken", "dataVersion", "countdownRelease", "handleNetWorkTypeUpload", "selectFiles", "", "mountPoint", "mountNodePoint", "extras", "Landroid/os/Bundle;", "media", "handleUploadFileFail", "key", "errorCode", "bytesTotal", "", "release", "setUploadTotalCount", "count", "uploadFile", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.upload.e */
public final class UploadPresenter extends AbstractC6905a<IUploadView> {

    /* renamed from: c */
    public static final Companion f18374c = new Companion(null);

    /* renamed from: a */
    public C6880a f18375a;

    /* renamed from: b */
    public final AbstractC6910a f18376b;

    /* renamed from: d */
    private final C68289a f18377d = new C68289a();

    /* renamed from: e */
    private int f18378e;

    /* renamed from: f */
    private final FragmentActivity f18379f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/upload/UploadPresenter$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.e$f */
    public static final class CallableC6756f<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ UploadPresenter f18391a;

        /* renamed from: b */
        final /* synthetic */ List f18392b;

        /* renamed from: c */
        final /* synthetic */ boolean f18393c;

        /* renamed from: d */
        final /* synthetic */ String f18394d;

        /* renamed from: e */
        final /* synthetic */ String f18395e;

        /* renamed from: f */
        final /* synthetic */ Bundle f18396f;

        /* renamed from: g */
        final /* synthetic */ boolean f18397g;

        CallableC6756f(UploadPresenter eVar, List list, boolean z, String str, String str2, Bundle bundle, boolean z2) {
            this.f18391a = eVar;
            this.f18392b = list;
            this.f18393c = z;
            this.f18394d = str;
            this.f18395e = str2;
            this.f18396f = bundle;
            this.f18397g = z2;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            return Boolean.valueOf(mo26573a());
        }

        /* renamed from: a */
        public final boolean mo26573a() {
            this.f18391a.mo26565a(this.f18392b.size());
            for (String str : this.f18392b) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("size_checker", String.valueOf(((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40014a()));
                UploadRequestInfo.C9359a aVar = new UploadRequestInfo.C9359a();
                if (this.f18393c) {
                    aVar.mo35742b(str);
                } else {
                    aVar.mo35739a(str);
                }
                String b = C13675f.m55511b(this.f18393c, str);
                UploadRequestInfo.C9359a a = aVar.mo35744c(b).mo35745d(this.f18394d).mo35746e(this.f18395e).mo35736a(DrivePriority.UploadPriority.BACKGROUND);
                UploadPresenter eVar = this.f18391a;
                String a2 = ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35619a(a.mo35737a(new RustUploadCallback(eVar, str, this.f18393c, eVar.f18376b.mo27166a(), this.f18396f)).mo35743b(linkedHashMap).mo35741a());
                this.f18391a.f18376b.mo27166a().mo27923a("confirm_upload", "", "", this.f18396f);
                if (this.f18397g) {
                    this.f18391a.f18376b.mo27166a().mo27952d(str, a2);
                } else {
                    this.f18391a.f18376b.mo27166a().mo27957e(b, a2);
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    private final void m26615c() {
        this.f18377d.dispose();
        this.f18375a.mo27095g();
        C13479a.m54764b("UploadPresenter", "release UploadPresenter resource...");
    }

    /* renamed from: a */
    public final synchronized void mo26564a() {
        int i = this.f18378e - 1;
        this.f18378e = i;
        if (i <= 0) {
            m26615c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.e$d */
    static final class C6754d<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ UploadPresenter f18389a;

        C6754d(UploadPresenter eVar) {
            this.f18389a = eVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f18389a.mo26564a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo26565a(int i) {
        this.f18378e = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.e$b */
    static final class C6752b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ boolean f18380a;

        /* renamed from: b */
        final /* synthetic */ String f18381b;

        /* renamed from: c */
        final /* synthetic */ File f18382c;

        C6752b(boolean z, String str, File file) {
            this.f18380a = z;
            this.f18381b = str;
            this.f18382c = file;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo26569a((String) obj));
        }

        /* renamed from: a */
        public final boolean mo26569a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            C13675f.m55504a(this.f18380a, this.f18381b, this.f18382c);
            return this.f18382c.exists();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.e$e */
    static final class C6755e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ UploadPresenter f18390a;

        C6755e(UploadPresenter eVar) {
            this.f18390a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f18390a.mo26564a();
            C13479a.m54761a("UploadPresenter", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.e$g */
    public static final class C6757g<T, R> implements Function<Throwable, Boolean> {

        /* renamed from: a */
        public static final C6757g f18398a = new C6757g();

        C6757g() {
        }

        /* renamed from: a */
        public final boolean mo26575a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public /* synthetic */ Boolean apply(Throwable th) {
            return Boolean.valueOf(mo26575a(th));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Flowable;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.e$c */
    static final class C6753c<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ UploadPresenter f18383a;

        /* renamed from: b */
        final /* synthetic */ String f18384b;

        /* renamed from: c */
        final /* synthetic */ String f18385c;

        /* renamed from: d */
        final /* synthetic */ String f18386d;

        /* renamed from: e */
        final /* synthetic */ boolean f18387e;

        /* renamed from: f */
        final /* synthetic */ String f18388f;

        C6753c(UploadPresenter eVar, String str, String str2, String str3, boolean z, String str4) {
            this.f18383a = eVar;
            this.f18384b = str;
            this.f18385c = str2;
            this.f18386d = str3;
            this.f18387e = z;
            this.f18388f = str4;
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(Boolean bool) {
            Intrinsics.checkParameterIsNotNull(bool, "it");
            C13479a.m54764b("UploadPresenter", "addUploadDriveFileCache cachetype=lru");
            String a = C6880a.m27076a(this.f18384b);
            String a2 = C6890b.m27227a(0, a);
            C6880a aVar = this.f18383a.f18375a;
            String str = this.f18384b;
            String str2 = this.f18385c;
            return aVar.mo27081a(0, a, a2, str, str2, str2, "3", this.f18386d, C13675f.m55511b(this.f18387e, this.f18388f), "", null, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadPresenter(FragmentActivity fragmentActivity, AbstractC6910a aVar) {
        super(fragmentActivity);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "driveConfigService");
        this.f18379f = fragmentActivity;
        this.f18376b = aVar;
        C6880a e = aVar.mo27170e();
        Intrinsics.checkExpressionValueIsNotNull(e, "driveConfigService.cacheManager");
        this.f18375a = e;
    }

    /* renamed from: a */
    public final void mo26566a(String str, int i, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "mountNodePoint");
        C13479a.m54764b("UploadPresenter", "handleUploadFileFail errorCode= " + i + ", bytesTotal = " + j);
        if (((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40015a(i)) {
            ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40011a(this.f18379f, SingleFileQuotaConfig.UPLOAD, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final void mo26567a(String str, boolean z, String str2, String str3) {
        AbstractC7095c cVar;
        Intrinsics.checkParameterIsNotNull(str, "filePointer");
        C13479a.m54764b("UploadPresenter", "file upload success, start add file to cache...");
        if (mo27152k() == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            String d = C13721c.m55650d(str2);
            C13479a.m54775e("UploadPresenter", "file info error owner == " + mo27152k() + " ,path=" + str + ", token=" + d);
        } else if (!C13675f.m55529e(z, str)) {
            C13479a.m54758a("UploadPresenter", "add file to cache error, file not exists");
        } else {
            String a = C13675f.m55491a(z, str);
            AbstractC6910a aVar = this.f18376b;
            if (aVar != null) {
                cVar = aVar.mo27169d();
            } else {
                cVar = null;
            }
            if (cVar.mo27714c(a, "")) {
                C13479a.m54764b("UploadPresenter", "upload file is video, will not be put to cache");
                return;
            }
            Context k = mo27152k();
            Intrinsics.checkExpressionValueIsNotNull(k, "context");
            File b = C6880a.m27088b(k.getApplicationContext());
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            this.f18377d.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new C6752b(z, str, new File(b, C6880a.m27076a(str2)))).mo238014c(new C6753c(this, str2, a, str3, z, str)).mo238001b(new C6754d(this), new C6755e(this)));
        }
    }

    /* renamed from: b */
    private final void m26614b(List<String> list, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        AbstractC68307f.m265099b((Callable) new CallableC6756f(this, list, z2, str2, str, bundle, z)).mo238004b(C11678b.m48479c()).mo238029f(C6757g.f18398a).mo238036k();
    }

    /* renamed from: a */
    public final void mo26568a(List<String> list, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "mountPoint");
        Intrinsics.checkParameterIsNotNull(str2, "mountNodePoint");
        Intrinsics.checkParameterIsNotNull(bundle, "extras");
        if (list != null) {
            m26614b(list, str, str2, bundle, z, z2);
            if (mo27153l()) {
                ((IUploadView) mo27154m()).mo26544a(-1);
            }
        } else if (mo27153l()) {
            ((IUploadView) mo27154m()).mo26548c();
        }
    }
}
