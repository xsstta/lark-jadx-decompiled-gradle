package com.bytedance.ee.bear.drive.biz.preview.pdf;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader;
import com.bytedance.ee.plugin.common.ttpdfreader.Range;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ%\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0016\"\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0016J$\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/pdf/PDFStreamingDownloader;", "Lcom/bytedance/ee/plugin/common/ttpdfreader/IStreamingDownloader;", "fileToken", "", "streamingUrl", "filePath", "fileSize", "", "apiExtra", "dataVersion", "saveLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Landroidx/lifecycle/MutableLiveData;)V", "alreadySavePageCache", "Ljava/util/concurrent/atomic/AtomicBoolean;", "downloadedAll", "rustKeys", "", "cancelTask", "", "keys", "", "([Ljava/lang/String;)V", "deleteRecord", "download", "callback", "Lcom/bytedance/ee/plugin/common/ttpdfreader/IStreamingDownloader$DownloadCallback;", "ranges", "", "Lcom/bytedance/ee/plugin/common/ttpdfreader/Range;", "getDownloadedRanges", "onPageReady", "page", "", "requiredHeadTailSize", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.pdf.a */
public final class PDFStreamingDownloader implements IStreamingDownloader {

    /* renamed from: e */
    public static final Companion f18243e = new Companion(null);

    /* renamed from: a */
    public AtomicBoolean f18244a = new AtomicBoolean();

    /* renamed from: b */
    public Set<String> f18245b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final String f18246c;

    /* renamed from: d */
    public final C1177w<Object> f18247d;

    /* renamed from: f */
    private final AtomicBoolean f18248f = new AtomicBoolean();

    /* renamed from: g */
    private final String f18249g;

    /* renamed from: h */
    private final String f18250h;

    /* renamed from: i */
    private final long f18251i;

    /* renamed from: j */
    private final String f18252j;

    /* renamed from: k */
    private final String f18253k;

    @Override // com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader
    public long requiredHeadTailSize() {
        return 200000;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/pdf/PDFStreamingDownloader$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.pdf.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader
    public String filePath() {
        return this.f18246c;
    }

    @Override // com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader
    public long fileSize() {
        return this.f18251i;
    }

    @Override // com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader
    public void deleteRecord() {
        C13479a.m54764b("PDFStreamingDownloader", "deleteRecord()");
        ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35635b(this.f18249g, this.f18253k);
    }

    @Override // com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader
    public void getDownloadedRanges(IStreamingDownloader.DownloadCallback downloadCallback) {
        ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35627a(this.f18249g, this.f18253k, this.f18246c, new PDFStreamingDownloader$getDownloadedRanges$1(downloadCallback));
    }

    @Override // com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader
    public void cancelTask(String... strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "keys");
        ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35636c(strArr);
        AbstractC9349a aVar = (AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null);
        Set<String> set = this.f18245b;
        if (set != null) {
            Object[] array = set.toArray(new String[0]);
            if (array != null) {
                aVar.mo35636c((String[]) array);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }

    @Override // com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader
    public void onPageReady(int i) {
        if (this.f18248f.compareAndSet(false, true)) {
            C13479a.m54764b("PDFStreamingDownloader", "onPageReady() start save streaming page cache");
            C1177w<Object> wVar = this.f18247d;
            if (wVar != null) {
                wVar.mo5926a(new StreamingCache(this.f18250h, this.f18246c, this.f18251i));
            }
        }
    }

    @Override // com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader
    public String download(IStreamingDownloader.DownloadCallback downloadCallback, List<? extends Range> list) {
        ConnectionService.NetworkState b;
        if (list == null) {
            return "";
        }
        ConnectionService d = C5084ad.m20847d();
        if (d == null || (b = d.mo20038b()) == null || !b.mo20041b()) {
            if (downloadCallback != null) {
                downloadCallback.onResult("key_offline", DriveFile.Status.FAILED.value(), CollectionsKt.emptyList());
            }
            return "";
        }
        String str = this.f18249g;
        String str2 = this.f18250h;
        String str3 = this.f18246c;
        List<? extends Range> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            arrayList.add(new C9361b.C9362a(t.begin, t.end));
        }
        C9361b bVar = new C9361b(str, str2, str3, arrayList, this.f18251i, this.f18252j, DrivePriority.DownloadPriority.PREVIEW.getPriority(), this.f18253k);
        bVar.f25180i = new PDFStreamingDownloader$download$1(this, downloadCallback, list);
        String a = ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35620a(bVar);
        if (a != null) {
            return a;
        }
        return "";
    }

    public PDFStreamingDownloader(String str, String str2, String str3, long j, String str4, String str5, C1177w<Object> wVar) {
        Intrinsics.checkParameterIsNotNull(str, "fileToken");
        Intrinsics.checkParameterIsNotNull(str2, "streamingUrl");
        Intrinsics.checkParameterIsNotNull(str3, "filePath");
        this.f18249g = str;
        this.f18250h = str2;
        this.f18246c = str3;
        this.f18251i = j;
        this.f18252j = str4;
        this.f18253k = str5;
        this.f18247d = wVar;
    }
}
