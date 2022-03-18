package com.ss.android.lark.file.picker.image;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import com.bytedance.ee.android.file.picker.lib.dependency.C4045b;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerImageLoader;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J:\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016J:\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015H\u0016J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0007H\u0016¨\u0006\""}, d2 = {"Lcom/ss/android/lark/file/picker/image/PickerImageLoader;", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerImageLoader;", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "describeContents", "", "load", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "imageView", "Landroid/widget/ImageView;", "option", "Lcom/bytedance/ee/android/file/picker/lib/dependency/LoadOption;", "path", "", "callback", "Lcom/bytedance/ee/android/file/picker/lib/dependency/ImageLoader$DownLoadImageCallback;", "Landroid/graphics/drawable/Drawable;", "loadBitmap", "view", "Landroid/view/View;", "Landroid/graphics/Bitmap;", "packOptions", "builder", "Lcom/ss/android/lark/image/api/IRequestCreator;", "writeToParcel", "dest", "flags", "Companion", "base_file-picker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PickerImageLoader implements IPickerImageLoader {
    public static final Parcelable.Creator<PickerImageLoader> CREATOR = new C38181b();

    /* renamed from: a */
    public static final Companion f97878a = new Companion(null);

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "dest");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/file/picker/image/PickerImageLoader$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/file/picker/image/PickerImageLoader;", "base_file-picker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.file.picker.image.PickerImageLoader$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/lark/file/picker/image/PickerImageLoader$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/file/picker/image/PickerImageLoader;", "createFromParcel", ShareHitPoint.f121868c, "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/file/picker/image/PickerImageLoader;", "base_file-picker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.file.picker.image.PickerImageLoader$b */
    public static final class C38181b implements Parcelable.Creator<PickerImageLoader> {
        C38181b() {
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
    private final void m150072a(C4045b bVar, IRequestCreator iRequestCreator) {
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
        m150072a(bVar, load);
        load.into(imageView);
    }
}
