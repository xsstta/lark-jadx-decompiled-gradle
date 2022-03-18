package com.ss.ugc.effectplatform.download;

import bytekn.foundation.io.file.FileInputStream;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.download.DownloadManager;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ss/ugc/effectplatform/download/AlgorithmDownloader;", "", "algorithmModelCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "netWorker", "Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "(Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;)V", "downloadManager", "Lcom/ss/ugc/effectplatform/download/DownloadManager;", "fetchModelType", "Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "modelInfo", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "getNetWorker", "()Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "download", "", "getFetchModelType", "getModelInfo", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.download.a */
public final class AlgorithmDownloader {

    /* renamed from: d */
    public static final Companion f164882d = new Companion(null);

    /* renamed from: a */
    public ModelInfo f164883a;

    /* renamed from: b */
    public FetchModelType f164884b;

    /* renamed from: c */
    public final AlgorithmModelCache f164885c;

    /* renamed from: e */
    private DownloadManager f164886e;

    /* renamed from: f */
    private final INetworkClient f164887f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/download/AlgorithmDownloader$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.download.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final FetchModelType mo227764a() {
        if (this.f164884b != null) {
            FetchModelType fetchModelType = this.f164884b;
            if (fetchModelType == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fetchModelType");
            }
            return fetchModelType;
        }
        throw new IllegalArgumentException("fetchModelType is required!");
    }

    /* renamed from: b */
    public final ModelInfo mo227765b() {
        if (this.f164883a != null) {
            ModelInfo modelInfo = this.f164883a;
            if (modelInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modelInfo");
            }
            return modelInfo;
        }
        throw new IllegalArgumentException("modelInfo is required!");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/ugc/effectplatform/download/AlgorithmDownloader$download$downloadFileSize$1", "Lcom/ss/ugc/effectplatform/download/DownloadListener;", "onFinish", "", "result", "Lcom/ss/ugc/effectplatform/download/DownloadResult;", "onProgress", "progress", "", "totalSize", "", "onStart", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.download.a$b */
    public static final class C65507b implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f164888a;

        @Override // com.ss.ugc.effectplatform.download.DownloadListener
        /* renamed from: a */
        public void mo227766a() {
        }

        @Override // com.ss.ugc.effectplatform.download.DownloadListener
        /* renamed from: a */
        public void mo227767a(int i, long j) {
        }

        C65507b(Ref.ObjectRef objectRef) {
            this.f164888a = objectRef;
        }

        @Override // com.ss.ugc.effectplatform.download.DownloadListener
        /* renamed from: a */
        public void mo227768a(DownloadResult eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "result");
            if (!eVar.mo227788g()) {
                this.f164888a.element = (T) eVar.mo227787f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/ugc/effectplatform/download/AlgorithmDownloader$downloadManager$1", "Lcom/ss/ugc/effectplatform/download/IWriteDisk;", "execWrite", "", "inputStream", "Lbytekn/foundation/io/file/FileInputStream;", "contentLength", "", "listener", "Lcom/ss/ugc/effectplatform/download/DownloadListener;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.download.a$c */
    public static final class C65508c implements IWriteDisk {

        /* renamed from: a */
        final /* synthetic */ AlgorithmDownloader f164889a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65508c(AlgorithmDownloader aVar) {
            this.f164889a = aVar;
        }

        @Override // com.ss.ugc.effectplatform.download.IWriteDisk
        /* renamed from: a */
        public String mo227769a(FileInputStream bVar, long j, DownloadListener cVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "inputStream");
            return this.f164889a.f164885c.mo227638a(this.f164889a.mo227764a(), this.f164889a.mo227765b(), bVar);
        }
    }

    public AlgorithmDownloader(AlgorithmModelCache aVar, INetworkClient cVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "algorithmModelCache");
        Intrinsics.checkParameterIsNotNull(cVar, "netWorker");
        this.f164885c = aVar;
        this.f164887f = cVar;
        this.f164886e = new DownloadManager.Builder().mo227771a(cVar).mo227774a(new C65508c(this)).mo227772a(DownloadType.ALGORITHM).mo227775a();
    }

    /* renamed from: a */
    public final long mo227763a(ModelInfo modelInfo, FetchModelType fetchModelType) {
        List<String> zip_url_list;
        boolean z;
        List<String> url_list;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(modelInfo, "modelInfo");
        Intrinsics.checkParameterIsNotNull(fetchModelType, "fetchModelType");
        this.f164883a = modelInfo;
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        this.f164884b = fetchModelType;
        boolean z3 = false;
        if (!(file_url == null || (url_list = file_url.getUrl_list()) == null)) {
            List<String> list = url_list;
            if (list == null || list.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f164884b = FetchModelType.ZIP;
            }
        }
        if (!(file_url == null || (zip_url_list = file_url.getZip_url_list()) == null)) {
            List<String> list2 = zip_url_list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f164884b = FetchModelType.ORIGIN;
            }
        }
        ExtendedUrlModel file_url2 = modelInfo.getFile_url();
        List<String> url = file_url2 != null ? file_url2.getUrl(fetchModelType) : null;
        List<String> list3 = url;
        if (list3 == null || list3.isEmpty()) {
            z3 = true;
        }
        if (!z3) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) null;
            for (String str : url) {
                long a = this.f164886e.mo227770a(str, new C65507b(objectRef));
                if (a > 0) {
                    return a;
                }
            }
            T t = objectRef.element;
            if (t == null) {
                return -1;
            }
            throw t;
        }
        throw new RuntimeException("model " + modelInfo.getName() + " download url is empty! type: " + fetchModelType);
    }
}
