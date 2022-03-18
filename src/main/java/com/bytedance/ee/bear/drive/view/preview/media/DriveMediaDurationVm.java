package com.bytedance.ee.bear.drive.view.preview.media;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eR'\u0010\u0003\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/media/DriveMediaDurationVm;", "Landroidx/lifecycle/ViewModel;", "()V", "extraData", "Landroidx/lifecycle/MutableLiveData;", "", "", "", "getExtraData", "()Landroidx/lifecycle/MutableLiveData;", "setExtraData", "", "key", "value", "(Ljava/lang/String;Ljava/lang/Long;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.b.a */
public final class DriveMediaDurationVm extends AbstractC1142af {
    private final C1177w<Map<String, Long>> extraData = new C1177w<>();

    public final C1177w<Map<String, Long>> getExtraData() {
        return this.extraData;
    }

    public final void setExtraData(String str, Long l) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C1177w<Map<String, Long>> wVar = this.extraData;
        if (wVar == null) {
            Intrinsics.throwNpe();
        }
        HashMap b = wVar.mo5927b();
        if (b == null) {
            b = new HashMap();
        }
        if (l == null) {
            l = 0L;
        }
        b.put(str, l);
        this.extraData.mo5929b(b);
    }
}
