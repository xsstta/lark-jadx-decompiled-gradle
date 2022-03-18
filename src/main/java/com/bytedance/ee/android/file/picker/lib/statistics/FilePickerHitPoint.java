package com.bytedance.ee.android.file.picker.lib.statistics;

import com.bytedance.ee.android.file.picker.lib.dependency.Statistics;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/statistics/FilePickerHitPoint;", "", "()V", "Companion", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.e.a */
public final class FilePickerHitPoint {

    /* renamed from: a */
    public static final Companion f12299a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000b¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/statistics/FilePickerHitPoint$Companion;", "", "()V", "sendAttachSendButton", "", "fileNum", "", "localNum", "cloudNum", "sendClickDriveListFile", "fileType", "", ShareHitPoint.f121869d, "diskType", "sendClickPhoneStorage", "sendClickPhoneStorageCancel", "sendClickPhoneStorageSend", "sendImageFIleRejected", "fileSize", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo15889a() {
            Statistics.f12298b.mo15886a("click_attach_icon_phonestorage");
        }

        /* renamed from: b */
        public final void mo15893b() {
            Statistics.f12298b.mo15886a("click_attach_icon_phonestorage_send");
        }

        /* renamed from: c */
        public final void mo15894c() {
            Statistics.f12298b.mo15886a("click_attach_icon_phonestorage_cancel");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo15891a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fileSize");
            Statistics.Companion aVar = Statistics.f12298b;
            JSONObject put = new JSONObject().put("file_size", str);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(EventCo…SEND_FILE_SIZE, fileSize)");
            aVar.mo15887a("im_send_file_rejected", put);
        }

        /* renamed from: a */
        public final void mo15890a(int i, int i2, int i3) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_num", i);
            jSONObject.put("local_num", i2);
            jSONObject.put("cloud_num", i3);
            Statistics.f12298b.mo15887a("click_attach_send_button", jSONObject);
        }

        /* renamed from: a */
        public final void mo15892a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "fileType");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str3, "diskType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_type", str);
            jSONObject.put(ShareHitPoint.f121869d, str2);
            jSONObject.put("disk_type", str3);
            Statistics.f12298b.mo15887a("click_driver_list_file", jSONObject);
        }
    }
}
