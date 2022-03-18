package com.bytedance.ee.bear.drive.biz.versions.push;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.drive.biz.versions.C6841c;
import com.bytedance.ee.bear.drive.biz.versions.model.VersionDeleteModel;
import com.bytedance.ee.bear.drive.biz.versions.model.VersionPayLoadData;
import com.bytedance.ee.bear.drive.biz.versions.model.VersionUploadModel;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.rn.AbstractC10636d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003H\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/versions/push/DriveMultiVersionPush;", "", "fileId", "", "(Ljava/lang/String;)V", "getFileId", "()Ljava/lang/String;", "mCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mDeletePushObserver", "Lcom/bytedance/ee/bear/rn/RnCommonPushProtocol$PushObserver;", "mDeletePushProtocol", "Lcom/bytedance/ee/bear/rn/RnCommonPushProtocol;", "mUploadPushObserver", "mUploadPushProtocol", "mVersionPayLoadDataLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionPayLoadData;", "attach", "", "detach", "liveVersionPayLoad", "Landroidx/lifecycle/LiveData;", "registerDeletePushListener", "objToken", "registerUploadPushListener", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a */
public class DriveMultiVersionPush {

    /* renamed from: c */
    public static final Companion f18620c = new Companion(null);

    /* renamed from: a */
    public final C68289a f18621a = new C68289a();

    /* renamed from: b */
    public final C1177w<VersionPayLoadData> f18622b = new C1177w<>();

    /* renamed from: d */
    private AbstractC10636d f18623d;

    /* renamed from: e */
    private AbstractC10636d f18624e;

    /* renamed from: f */
    private AbstractC10636d.AbstractC10637a f18625f;

    /* renamed from: g */
    private AbstractC10636d.AbstractC10637a f18626g;

    /* renamed from: h */
    private final String f18627h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/versions/push/DriveMultiVersionPush$Companion;", "", "()V", "DRIVE_DELETE_FILE_VERSION", "", "DRIVE_UPLOAD_FILE_VERSION", "TAG", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final LiveData<VersionPayLoadData> mo27010b() {
        return this.f18622b;
    }

    /* renamed from: a */
    public final void mo27009a() {
        String str = this.f18627h;
        if (str != null) {
            m27028a(str);
            m27029b(this.f18627h);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$b */
    public static final class C6852b extends Lambda implements Function0<DefinitionParameters> {
        final /* synthetic */ String $objToken;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6852b(String str) {
            super(0);
            this.$objToken = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefinitionParameters invoke() {
            return C70039b.m268661a(this.$objToken, C8275a.f22375h, "DELETE_FILE_VERSION");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$d */
    public static final class C6858d extends Lambda implements Function0<DefinitionParameters> {
        final /* synthetic */ String $objToken;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6858d(String str) {
            super(0);
            this.$objToken = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefinitionParameters invoke() {
            return C70039b.m268661a(this.$objToken, C8275a.f22375h, "UPLOAD_FILE_VERSION");
        }
    }

    /* renamed from: c */
    public final void mo27011c() {
        AbstractC10636d dVar;
        AbstractC10636d dVar2;
        if (!(this.f18625f == null || (dVar2 = this.f18624e) == null)) {
            dVar2.mo40332a();
        }
        if (!(this.f18626g == null || (dVar = this.f18623d) == null)) {
            dVar.mo40332a();
        }
        this.f18621a.mo237935a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "json", "", "didReceivePush"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$c */
    public static final class C6853c implements AbstractC10636d.AbstractC10637a {

        /* renamed from: a */
        final /* synthetic */ DriveMultiVersionPush f18628a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionPayLoadData;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$c$a */
        static final class C6854a<T, R> implements Function<T, R> {

            /* renamed from: a */
            final /* synthetic */ String f18629a;

            C6854a(String str) {
                this.f18629a = str;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/bytedance/ee/bear/drive/biz/versions/push/DriveMultiVersionPush$registerDeletePushListener$3$disposable$1$versionDeleteModel$1", "Lcom/alibaba/fastjson/TypeReference;", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionDeleteModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$c$a$a */
            public static final class C6855a extends TypeReference<VersionDeleteModel> {
                C6855a() {
                }
            }

            /* renamed from: a */
            public final VersionPayLoadData apply(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                return C6841c.m27013a((VersionDeleteModel) JSON.parseObject(this.f18629a, new C6855a(), new Feature[0]));
            }
        }

        C6853c(DriveMultiVersionPush aVar) {
            this.f18628a = aVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$c$c */
        static final class C6857c<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C6857c f18631a = new C6857c();

            C6857c() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54761a("DriveComponent", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "versionPayLoadData", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionPayLoadData;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$c$b */
        static final class C6856b<T> implements Consumer<VersionPayLoadData> {

            /* renamed from: a */
            final /* synthetic */ C6853c f18630a;

            C6856b(C6853c cVar) {
                this.f18630a = cVar;
            }

            /* renamed from: a */
            public final void accept(VersionPayLoadData versionPayLoadData) {
                this.f18630a.f18628a.f18622b.mo5926a(versionPayLoadData);
            }
        }

        @Override // com.bytedance.ee.bear.rn.AbstractC10636d.AbstractC10637a
        public final void didReceivePush(String str) {
            Intrinsics.checkParameterIsNotNull(str, "json");
            C13479a.m54764b("DriveComponent", "DRIVE_DELETE_FILE_VERSION: " + str);
            this.f18628a.f18621a.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238020d(new C6854a(str)).mo237985a(C11678b.m48481e()).mo238001b(new C6856b(this), C6857c.f18631a));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "json", "", "didReceivePush"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$e */
    public static final class C6859e implements AbstractC10636d.AbstractC10637a {

        /* renamed from: a */
        final /* synthetic */ DriveMultiVersionPush f18632a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionPayLoadData;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$e$a */
        static final class C6860a<T, R> implements Function<T, R> {

            /* renamed from: a */
            final /* synthetic */ String f18633a;

            C6860a(String str) {
                this.f18633a = str;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/bytedance/ee/bear/drive/biz/versions/push/DriveMultiVersionPush$registerUploadPushListener$3$disposable$1$versionUploadModel$1", "Lcom/alibaba/fastjson/TypeReference;", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionUploadModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$e$a$a */
            public static final class C6861a extends TypeReference<VersionUploadModel> {
                C6861a() {
                }
            }

            /* renamed from: a */
            public final VersionPayLoadData apply(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                return C6841c.m27014a((VersionUploadModel) JSON.parseObject(this.f18633a, new C6861a(), new Feature[0]));
            }
        }

        C6859e(DriveMultiVersionPush aVar) {
            this.f18632a = aVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$e$c */
        static final class C6863c<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C6863c f18635a = new C6863c();

            C6863c() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54761a("DriveComponent", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "versionPayLoadData", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionPayLoadData;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.a$e$b */
        static final class C6862b<T> implements Consumer<VersionPayLoadData> {

            /* renamed from: a */
            final /* synthetic */ C6859e f18634a;

            C6862b(C6859e eVar) {
                this.f18634a = eVar;
            }

            /* renamed from: a */
            public final void accept(VersionPayLoadData versionPayLoadData) {
                this.f18634a.f18632a.f18622b.mo5926a(versionPayLoadData);
            }
        }

        @Override // com.bytedance.ee.bear.rn.AbstractC10636d.AbstractC10637a
        public final void didReceivePush(String str) {
            Intrinsics.checkParameterIsNotNull(str, "json");
            C13479a.m54764b("DriveComponent", "DRIVE_UPLOAD_FILE_VERSION: " + C13598b.m55190a((Object) str));
            this.f18632a.f18621a.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238020d(new C6860a(str)).mo237985a(C11678b.m48481e()).mo238001b(new C6862b(this), C6863c.f18635a));
        }
    }

    public DriveMultiVersionPush(String str) {
        this.f18627h = str;
    }

    /* renamed from: a */
    private final void m27028a(String str) {
        AbstractC10636d dVar = (AbstractC10636d) KoinJavaComponent.m268612a(AbstractC10636d.class, null, new C6858d(str));
        this.f18624e = dVar;
        if (!(this.f18625f == null || dVar == null)) {
            dVar.mo40332a();
        }
        AbstractC10636d dVar2 = this.f18624e;
        if (dVar2 != null) {
            C6859e eVar = new C6859e(this);
            this.f18625f = eVar;
            dVar2.mo40333a(eVar);
        }
    }

    /* renamed from: b */
    private final void m27029b(String str) {
        AbstractC10636d dVar = (AbstractC10636d) KoinJavaComponent.m268612a(AbstractC10636d.class, null, new C6852b(str));
        this.f18623d = dVar;
        if (!(this.f18626g == null || dVar == null)) {
            dVar.mo40332a();
        }
        AbstractC10636d dVar2 = this.f18623d;
        if (dVar2 != null) {
            C6853c cVar = new C6853c(this);
            this.f18626g = cVar;
            dVar2.mo40333a(cVar);
        }
    }
}
