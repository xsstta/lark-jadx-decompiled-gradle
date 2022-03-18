package com.ss.android.lark.multitask.task;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.multitask.task.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\n\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0014H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/multitask/task/UrlIconFactory;", "Lcom/ss/android/lark/multitask/task/Task$IconFactory;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "createDrawableForTask", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "task", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "", "imageView", "Landroid/widget/ImageView;", "describeContents", "", "saveArgs", "writeToParcel", "flags", "CREATOR", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class UrlIconFactory implements Task.IconFactory {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String url;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/multitask/task/UrlIconFactory$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/multitask/task/UrlIconFactory;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/multitask/task/UrlIconFactory;", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.task.UrlIconFactory$a */
    public static final class CREATOR implements Parcelable.Creator<UrlIconFactory> {
        private CREATOR() {
        }

        /* renamed from: a */
        public UrlIconFactory[] newArray(int i) {
            return new UrlIconFactory[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public UrlIconFactory createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new UrlIconFactory(parcel);
        }
    }

    public final String getUrl() {
        return this.url;
    }

    public final String saveArgs() {
        return this.url;
    }

    public UrlIconFactory(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.url = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UrlIconFactory(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r2 = r2.readString()
            if (r2 != 0) goto L_0x000e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x000e:
            java.lang.String r0 = "parcel.readString()!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.multitask.task.UrlIconFactory.<init>(android.os.Parcel):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.url);
    }

    public Drawable createDrawableForTask(Context context, C48376q qVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(qVar, "task");
        return new ColorDrawable(0);
    }

    @Override // com.ss.android.lark.multitask.task.Task.IconFactory
    public void createDrawableForTask(Context context, C48376q qVar, ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(qVar, "task");
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        ImageLoader.with(context).load(this.url).asBitmap().into(imageView);
    }
}
