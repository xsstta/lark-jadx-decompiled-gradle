package com.bytedance.ee.bear.drive.biz.preview.pdf;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRangeCallback;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader;
import com.bytedance.ee.plugin.common.ttpdfreader.Range;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J,\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016¨\u0006\u0010"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/pdf/PDFStreamingDownloader$download$1", "Lcom/bytedance/ee/bear/middleground/drive/export/DownloadRangeCallback;", "onFailed", "", "key", "", "errorCode", "", "onSubmit", "", "updateProgress", UpdateKey.STATUS, "Lcom/bytedance/ee/bear/middleground/drive/export/DriveFile$Status;", "ranges", "", "Lcom/bytedance/ee/bear/middleground/drive/export/DownloadRangeRequestInfo$Range;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PDFStreamingDownloader$download$1 implements DownloadRangeCallback {
    final /* synthetic */ IStreamingDownloader.DownloadCallback $callback;
    final /* synthetic */ List $ranges;
    final /* synthetic */ PDFStreamingDownloader this$0;

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadRangeCallback
    public void onSubmit(String str) {
        C13479a.m54764b("PDFStreamingDownloader", "download onSubmit key=" + str);
        if (str != null) {
            this.this$0.f18245b.add(str);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadRangeCallback
    public boolean onFailed(String str, int i) {
        C13479a.m54758a("PDFStreamingDownloader", "download, onFailed key: " + str + ", errorCode: " + i);
        IStreamingDownloader.DownloadCallback downloadCallback = this.$callback;
        if (downloadCallback == null) {
            return true;
        }
        downloadCallback.onResult(str, DriveFile.Status.FAILED.value(), CollectionsKt.toList(this.$ranges));
        return true;
    }

    PDFStreamingDownloader$download$1(PDFStreamingDownloader aVar, IStreamingDownloader.DownloadCallback downloadCallback, List list) {
        this.this$0 = aVar;
        this.$callback = downloadCallback;
        this.$ranges = list;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadRangeCallback
    public boolean updateProgress(String str, DriveFile.Status status, List<C9361b.C9362a> list) {
        int i;
        ArrayList arrayList;
        C13479a.m54764b("PDFStreamingDownloader", "download, onUpdateProgress key: " + str + ", status: " + status);
        IStreamingDownloader.DownloadCallback downloadCallback = this.$callback;
        if (downloadCallback != null) {
            if (status != null) {
                i = status.value();
            } else {
                i = DriveFile.Status.UNKNOWN.value();
            }
            if (list != null) {
                List<C9361b.C9362a> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (T t : list2) {
                    arrayList2.add(new Range(t.f25181a, t.f25182b));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            downloadCallback.onResult(str, i, arrayList);
        }
        if (status != null && status.value() == DriveFile.Status.SUCCESS.value() && this.this$0.f18244a.compareAndSet(false, true)) {
            C13479a.m54764b("PDFStreamingDownloader", "updateProgress status success, start saveLiveData");
            C1177w<Object> wVar = this.this$0.f18247d;
            if (wVar != null) {
                wVar.mo5926a((Object) this.this$0.f18246c);
            }
        }
        return true;
    }
}
