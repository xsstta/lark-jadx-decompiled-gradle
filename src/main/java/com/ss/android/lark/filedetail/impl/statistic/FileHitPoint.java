package com.ss.android.lark.filedetail.impl.statistic;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/statistic/FileHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.a.c */
public final class FileHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f98024a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J.\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J.\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J&\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/statistic/FileHitPoint$Companion;", "", "()V", "sendClickCancelDownload", "", "fileExt", "", "fileSize", "", "chatType", "location", "sendClickFileDownload", "sendClickFileInChat", "isAutoDownload", "sendContinueDownload", "method", "sendDownloadFileEvent", "isSearch", "sendDownloadPause", "sendJumpToChatEvent", "sendOpenFileEvent", "sendOtherAppOpenFile", "sendSaveToDriveEvent", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo139777a(String str) {
            Statistics.sendEvent("click_chat_history_results", new JSONObject().put("category", "files").put("is_search", str).put("action", "download_file"));
        }

        /* renamed from: b */
        public final void mo139780b(String str) {
            Statistics.sendEvent("click_chat_history_results", new JSONObject().put("category", "files").put("is_search", str).put("action", "open_file"));
        }

        /* renamed from: c */
        public final void mo139783c(String str, Number number, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "fileExt");
            Intrinsics.checkParameterIsNotNull(number, "fileSize");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Intrinsics.checkParameterIsNotNull(str3, "location");
            Statistics.sendEvent("click_cancel_download_file", new JSONObject().put("file_ext", str).put("file_size", number).put("chat_type", str2).put("location", str3));
        }

        /* renamed from: d */
        public final void mo139784d(String str, Number number, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "fileExt");
            Intrinsics.checkParameterIsNotNull(number, "fileSize");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Intrinsics.checkParameterIsNotNull(str3, "location");
            Statistics.sendEvent("open_in_another_app", new JSONObject().put("file_ext", str).put("file_size", number).put("chat_type", str2).put("location", str3));
        }

        /* renamed from: a */
        public final void mo139778a(String str, Number number, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "fileExt");
            Intrinsics.checkParameterIsNotNull(number, "fileSize");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Intrinsics.checkParameterIsNotNull(str3, "isAutoDownload");
            Statistics.sendEvent("click_file_in_chat", new JSONObject().put("file_ext", str).put("file_size", number).put("chat_type", str2).put("is_auto_download", str3));
        }

        /* renamed from: b */
        public final void mo139781b(String str, Number number, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "fileExt");
            Intrinsics.checkParameterIsNotNull(number, "fileSize");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Intrinsics.checkParameterIsNotNull(str3, "location");
            Statistics.sendEvent("click_download_file", new JSONObject().put("file_ext", str).put("file_size", number).put("chat_type", str2).put("location", str3));
        }

        /* renamed from: a */
        public final void mo139779a(String str, Number number, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "fileExt");
            Intrinsics.checkParameterIsNotNull(number, "fileSize");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Intrinsics.checkParameterIsNotNull(str3, "method");
            Intrinsics.checkParameterIsNotNull(str4, "location");
            Statistics.sendEvent("pause_download_file", new JSONObject().put("file_ext", str).put("file_size", number).put("chat_type", str2).put("method", str3).put("location", str4));
        }

        /* renamed from: b */
        public final void mo139782b(String str, Number number, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "fileExt");
            Intrinsics.checkParameterIsNotNull(number, "fileSize");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Intrinsics.checkParameterIsNotNull(str3, "method");
            Intrinsics.checkParameterIsNotNull(str4, "location");
            Statistics.sendEvent("resume_download_file", new JSONObject().put("file_ext", str).put("file_size", number).put("chat_type", str2).put("method", str3).put("location", str4));
        }
    }
}
