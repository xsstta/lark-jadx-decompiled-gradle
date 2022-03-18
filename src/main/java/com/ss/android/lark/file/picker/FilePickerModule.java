package com.ss.android.lark.file.picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.android.file.picker.lib.FilePicker;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerLogger;
import com.bytedance.ee.android.file.picker.lib.page.C4099b;
import com.ss.android.lark.biz.core.api.FilePickerLaunchParams;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.file.picker.image.PickerImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/file/picker/FilePickerModule;", "", "dependency", "Lcom/ss/android/lark/file/picker/IFilePickerModuleDependency;", "(Lcom/ss/android/lark/file/picker/IFilePickerModuleDependency;)V", "checkToInit", "", "createLogger", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerLogger;", "startPicker", "params", "Lcom/ss/android/lark/biz/core/api/FilePickerLaunchParams;", "sourceFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "showInFloatWindow", "", "startReceivedFilesPicker", "Companion", "PickerLogger", "base_file-picker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FilePickerModule {

    /* renamed from: a */
    public static IFilePickerModuleDependency f97876a;

    /* renamed from: b */
    public static final Companion f97877b = new Companion(null);

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J(\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\fH\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/file/picker/FilePickerModule$PickerLogger;", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerLogger;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", C63690d.f160779a, "", "tag", "", "msg", "describeContents", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "i", "v", "w", "writeToParcel", "dest", "flags", "CREATOR", "base_file-picker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class PickerLogger implements IPickerLogger {
        public static final CREATOR CREATOR = new CREATOR(null);

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkParameterIsNotNull(parcel, "dest");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/file/picker/FilePickerModule$PickerLogger$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/file/picker/FilePickerModule$PickerLogger;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/file/picker/FilePickerModule$PickerLogger;", "base_file-picker_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.file.picker.FilePickerModule$PickerLogger$a */
        public static final class CREATOR implements Parcelable.Creator<PickerLogger> {
            private CREATOR() {
            }

            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public PickerLogger createFromParcel(Parcel parcel) {
                Intrinsics.checkParameterIsNotNull(parcel, "parcel");
                return new PickerLogger(parcel);
            }

            /* renamed from: a */
            public PickerLogger[] newArray(int i) {
                PickerLogger[] pickerLoggerArr = new PickerLogger[i];
                for (int i2 = 0; i2 < i; i2++) {
                    pickerLoggerArr[i2] = new PickerLogger();
                }
                return pickerLoggerArr;
            }
        }

        public PickerLogger() {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public PickerLogger(Parcel parcel) {
            this();
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        }

        @Override // com.bytedance.ee.android.file.picker.lib.dependency.IPickerLogger
        /* renamed from: a */
        public void mo15866a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            Log.m165383e(str, str2);
        }

        @Override // com.bytedance.ee.android.file.picker.lib.dependency.IPickerLogger
        /* renamed from: b */
        public void mo15867b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            Log.m165397w(str, str2);
        }

        @Override // com.bytedance.ee.android.file.picker.lib.dependency.IPickerLogger
        /* renamed from: c */
        public void mo15868c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            Log.m165389i(str, str2);
        }

        @Override // com.bytedance.ee.android.file.picker.lib.dependency.IPickerLogger
        /* renamed from: d */
        public void mo15869d(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            Log.m165379d(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/file/picker/FilePickerModule$Companion;", "", "()V", "EXTRA_ENABLE_DRIVE", "", "EXTRA_FILE_PATH_LIST", "EXTRA_MAX_NUM", "EXTRA_MAX_SELECT_FILE_SIZE", "EXTRA_OVER_SELECT_FILE_SIZE_TEXT_TIPS", "EXTRA_SELECT_FILE_SIZE", "sDependency", "Lcom/ss/android/lark/file/picker/IFilePickerModuleDependency;", "getDependency", "getFeatureGatingMap", "", "", "base_file-picker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.file.picker.FilePickerModule$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final IPickerLogger m150062b() {
        return new PickerLogger();
    }

    /* renamed from: a */
    private final void m150061a() {
        if (!FilePicker.f12248b.mo15807a()) {
            FilePicker.f12248b.mo15806a(m150062b(), null, new PickerImageLoader());
        }
    }

    public FilePickerModule(IFilePickerModuleDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        f97876a = aVar;
    }

    /* renamed from: a */
    public final void mo139539a(FilePickerLaunchParams fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "params");
        mo139540a(fVar, null, false);
    }

    /* renamed from: b */
    public final void mo139541b(FilePickerLaunchParams fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "params");
        fVar.mo105741b(202001);
        mo139540a(fVar, null, false);
    }

    /* renamed from: a */
    public final void mo139540a(FilePickerLaunchParams fVar, C36516a<?> aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(fVar, "params");
        m150061a();
        com.bytedance.ee.android.file.picker.lib.dto.FilePickerLaunchParams aVar2 = new com.bytedance.ee.android.file.picker.lib.dto.FilePickerLaunchParams(fVar.mo105755j(), fVar.mo105756k(), 0, 4, (DefaultConstructorMarker) null);
        aVar2.mo15822a(fVar.mo105735a());
        aVar2.mo15827b(fVar.mo105740b());
        aVar2.mo15823a(fVar.mo105746d());
        aVar2.mo15828b(fVar.mo105748e());
        aVar2.mo15821a(fVar.mo105744c());
        aVar2.mo15830c(fVar.mo105750f());
        aVar2.mo15832d(fVar.mo105751g());
        aVar2.mo15824a(fVar.mo105752h());
        aVar2.mo15826b(fVar.mo105754i());
        if (aVar == null || !z) {
            FilePicker.f12248b.mo15805a(aVar2);
            return;
        }
        C4099b b = FilePicker.f12248b.mo15808b(aVar2);
        C36512a a = C36512a.m144041a();
        if (b != null) {
            a.mo134760a(aVar, b, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b(), fVar.mo105756k());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.desktopmode.app.DesktopCompatFragment<*>");
    }
}
