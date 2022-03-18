package com.bytedance.ee.android.file.picker.lib.dependency;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/dependency/Statistics;", "", "()V", "Companion", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.dependency.d */
public final class Statistics {

    /* renamed from: a */
    public static volatile IPickerStatistics f12297a;

    /* renamed from: b */
    public static final Companion f12298b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/dependency/Statistics$Companion;", "", "()V", "FILE_PICKER_STATISTICS", "", "statistics", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerStatistics;", "getStatistics", "initStatistics", "", "onRestoreState", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "sendEvent", "eventName", "params", "Lorg/json/JSONObject;", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.dependency.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final IPickerStatistics mo15883a() {
            return Statistics.f12297a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo15884a(Bundle bundle) {
            if (bundle != null && Statistics.f12297a != null) {
                bundle.putParcelable("FilePickerStatistics", Statistics.f12297a);
            }
        }

        /* renamed from: a */
        public final void mo15885a(IPickerStatistics iPickerStatistics) {
            if (Statistics.f12297a == null) {
                synchronized (this) {
                    if (Statistics.f12297a == null) {
                        Statistics.f12297a = iPickerStatistics;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        /* renamed from: b */
        public final void mo15888b(Bundle bundle) {
            if (Statistics.f12297a == null && bundle != null) {
                Statistics.f12297a = (IPickerStatistics) bundle.getParcelable("FilePickerStatistics");
            }
        }

        /* renamed from: a */
        public final void mo15886a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "eventName");
            IPickerStatistics iPickerStatistics = Statistics.f12297a;
            if (iPickerStatistics != null) {
                iPickerStatistics.mo15870a(str, null);
            }
        }

        /* renamed from: a */
        public final void mo15887a(String str, JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(str, "eventName");
            Intrinsics.checkParameterIsNotNull(jSONObject, "params");
            IPickerStatistics iPickerStatistics = Statistics.f12297a;
            if (iPickerStatistics != null) {
                iPickerStatistics.mo15870a(str, jSONObject);
            }
        }
    }
}
