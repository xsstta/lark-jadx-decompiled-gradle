package com.bytedance.ee.bear.fileselector;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import com.bytedance.ee.android.file.picker.lib.FilePicker;
import com.bytedance.ee.android.file.picker.lib.dependency.C4045b;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerImageLoader;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerLogger;
import com.bytedance.ee.android.file.picker.lib.dto.FilePickerLaunchParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/SafeFilePicker;", "", "()V", "Companion", "PickerImageLoader", "PickerLogger", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
public class SafeFilePicker {

    /* renamed from: a */
    public static final Companion f21055a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J:\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016J:\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015H\u0016J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0007H\u0016¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerImageLoader;", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerImageLoader;", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "describeContents", "", "load", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "imageView", "Landroid/widget/ImageView;", "option", "Lcom/bytedance/ee/android/file/picker/lib/dependency/LoadOption;", "path", "", "callback", "Lcom/bytedance/ee/android/file/picker/lib/dependency/ImageLoader$DownLoadImageCallback;", "Landroid/graphics/drawable/Drawable;", "loadBitmap", "view", "Landroid/view/View;", "Landroid/graphics/Bitmap;", "packOptions", "builder", "Lcom/ss/android/lark/image/api/IRequestCreator;", "writeToParcel", "dest", "flags", "Companion", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class PickerImageLoader implements IPickerImageLoader {
        public static final Parcelable.Creator<PickerImageLoader> CREATOR = new C7771b();

        /* renamed from: a */
        public static final Companion f21056a = new Companion(null);

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkParameterIsNotNull(parcel, "dest");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerImageLoader$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerImageLoader;", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.fileselector.SafeFilePicker$PickerImageLoader$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/bytedance/ee/bear/fileselector/SafeFilePicker$PickerImageLoader$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerImageLoader;", "createFromParcel", ShareHitPoint.f121868c, "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerImageLoader;", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.fileselector.SafeFilePicker$PickerImageLoader$b */
        public static final class C7771b implements Parcelable.Creator<PickerImageLoader> {
            C7771b() {
            }

            /* renamed from: a */
            public PickerImageLoader[] newArray(int i) {
                return new PickerImageLoader[i];
            }

            /* renamed from: a */
            public PickerImageLoader createFromParcel(Parcel parcel) {
                Intrinsics.checkParameterIsNotNull(parcel, ShareHitPoint.f121868c);
                return new PickerImageLoader(parcel);
            }
        }

        public PickerImageLoader() {
        }

        protected PickerImageLoader(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
        }

        /* renamed from: a */
        private final void m31124a(C4045b bVar, IRequestCreator iRequestCreator) {
            if (bVar != null) {
                if (bVar.mo15872b()) {
                    iRequestCreator.centerCrop();
                }
                if (bVar.mo15879i() != 0) {
                    iRequestCreator.error(bVar.mo15879i());
                }
                if (bVar.mo15878h() != 0) {
                    iRequestCreator.error(bVar.mo15878h());
                }
                if (bVar.mo15875e()) {
                    iRequestCreator.diskCacheStrategy(DiskCacheStrategy.ALL);
                }
                bVar.mo15873c();
                if (bVar.mo15880j() > ((float) 0) && bVar.mo15880j() < ((float) 1)) {
                    iRequestCreator.thumbnail(bVar.mo15880j());
                }
                if (bVar.mo15876f() > 0 && bVar.mo15877g() > 0) {
                    iRequestCreator.override(bVar.mo15876f(), bVar.mo15877g());
                }
            }
        }

        @Override // com.bytedance.ee.android.file.picker.lib.dependency.IPickerImageLoader
        /* renamed from: a */
        public void mo15865a(Context context, Uri uri, ImageView imageView, C4045b bVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(uri, "uri");
            Intrinsics.checkParameterIsNotNull(imageView, "imageView");
            IRequestCreator load = ImageLoader.with(context).load(uri);
            Intrinsics.checkExpressionValueIsNotNull(load, "builder");
            m31124a(bVar, load);
            load.into(imageView);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J(\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\fH\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerLogger;", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerLogger;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", C63690d.f160779a, "", "tag", "", "msg", "describeContents", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "i", "v", "w", "writeToParcel", "dest", "flags", "CREATOR", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class PickerLogger implements IPickerLogger {
        public static final CREATOR CREATOR = new CREATOR(null);

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkParameterIsNotNull(parcel, "dest");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerLogger$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerLogger;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$PickerLogger;", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.fileselector.SafeFilePicker$PickerLogger$a */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/SafeFilePicker$Companion;", "", "()V", "checkToInit", "", "createLogger", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerLogger;", "startFilePicker", "params", "Lcom/bytedance/ee/android/file/picker/lib/dto/FilePickerLaunchParams;", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.SafeFilePicker$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        private final IPickerLogger m31135b() {
            return new PickerLogger();
        }

        /* renamed from: a */
        private final void m31134a() {
            if (!FilePicker.f12248b.mo15807a()) {
                FilePicker.f12248b.mo15806a(m31135b(), null, new PickerImageLoader());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo30419a(FilePickerLaunchParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "params");
            m31134a();
            FilePicker.f12248b.mo15805a(aVar);
        }
    }
}
