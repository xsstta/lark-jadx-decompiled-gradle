package com.bytedance.ee.bear.drive.biz.preview.pdf;

import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.GetDownloadedRangesCallback;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.ttpdfreader.IStreamingDownloader;
import com.bytedance.ee.plugin.common.ttpdfreader.Range;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/pdf/PDFStreamingDownloader$getDownloadedRanges$1", "Lcom/bytedance/ee/bear/middleground/drive/export/GetDownloadedRangesCallback;", "onError", "", "errorCode", "", "onSuccess", "ranges", "", "Lcom/bytedance/ee/bear/middleground/drive/export/DownloadRangeRequestInfo$Range;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PDFStreamingDownloader$getDownloadedRanges$1 implements GetDownloadedRangesCallback {
    final /* synthetic */ IStreamingDownloader.DownloadCallback $callback;

    PDFStreamingDownloader$getDownloadedRanges$1(IStreamingDownloader.DownloadCallback downloadCallback) {
        this.$callback = downloadCallback;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.GetDownloadedRangesCallback
    public boolean onError(int i) {
        C13479a.m54764b("PDFStreamingDownloader", "getDownloadedRanges errorCode: " + i);
        IStreamingDownloader.DownloadCallback downloadCallback = this.$callback;
        if (downloadCallback == null) {
            return true;
        }
        downloadCallback.onResult("key_getDownloadedRanges", DriveFile.Status.FAILED.value(), null);
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.GetDownloadedRangesCallback
    public boolean onSuccess(List<C9361b.C9362a> list) {
        ArrayList arrayList;
        C13479a.m54764b("PDFStreamingDownloader", "getDownloadedRanges ranges: " + list);
        IStreamingDownloader.DownloadCallback downloadCallback = this.$callback;
        if (downloadCallback == null) {
            return true;
        }
        int value = DriveFile.Status.RANGE_FINISH.value();
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
        downloadCallback.onResult("key_getDownloadedRanges", value, arrayList);
        return true;
    }
}
