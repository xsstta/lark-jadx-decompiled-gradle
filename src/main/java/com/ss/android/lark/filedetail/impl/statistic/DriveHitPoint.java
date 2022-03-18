package com.ss.android.lark.filedetail.impl.statistic;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/statistic/DriveHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.a.a */
public final class DriveHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f98022a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J&\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u001e\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/statistic/DriveHitPoint$Companion;", "", "()V", "KEY_FILE_SIZE", "", "KEY_FILE_SOURCE", "KEY_FILE_TYPE", "KEY_STATUS", "sendClickOpenLocalAttach", "", "fileType", "sendClickSaveCloud", "sendDownLocalFinish", UpdateKey.STATUS, ShareHitPoint.f121868c, "size", "", "sendOpenAttachCard", "sendSaveCloudDiskFinish", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo139772a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fileType");
            Statistics.sendEvent("click_save_clouddisk", new JSONObject().put("file_type", str));
        }

        /* renamed from: b */
        public final void mo139775b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fileType");
            Statistics.sendEvent("click_open_local_attach", new JSONObject().put("file_type", str));
        }

        /* renamed from: a */
        public final void mo139773a(String str, String str2, long j) {
            Intrinsics.checkParameterIsNotNull(str, "fileType");
            Intrinsics.checkParameterIsNotNull(str2, UpdateKey.STATUS);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_type", str);
            jSONObject.put(UpdateKey.STATUS, str2);
            jSONObject.put("file_size", j);
            Statistics.sendEvent("save_clouddisk_finish", jSONObject);
        }

        /* renamed from: a */
        public final void mo139774a(String str, String str2, String str3, long j) {
            Intrinsics.checkParameterIsNotNull(str, "fileType");
            Intrinsics.checkParameterIsNotNull(str2, UpdateKey.STATUS);
            Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121868c);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_type", str);
            jSONObject.put(UpdateKey.STATUS, str2);
            jSONObject.put("file_source", str3);
            jSONObject.put("file_size", j);
            Statistics.sendEvent("download_local_finish", jSONObject);
        }
    }
}
