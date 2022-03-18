package com.ss.android.lark.main.router;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/main/router/OpenUriPostLaunchAction;", "Lcom/ss/android/lark/main/router/PostLaunchAction;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "uri", "Landroid/net/Uri;", "internal", "", "bundle", "Landroid/os/Bundle;", "(Landroid/net/Uri;ZLandroid/os/Bundle;)V", "describeContents", "", "onPostLaunch", "", "activity", "Landroid/app/Activity;", "toString", "", "writeToParcel", "flags", "CREATOR", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class OpenUriPostLaunchAction extends PostLaunchAction {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final Uri f112854a;

    /* renamed from: b */
    private final boolean f112855b;

    /* renamed from: c */
    private final Bundle f112856c;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/main/router/OpenUriPostLaunchAction$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/main/router/OpenUriPostLaunchAction;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/main/router/OpenUriPostLaunchAction;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.router.OpenUriPostLaunchAction$a */
    public static final class CREATOR implements Parcelable.Creator<OpenUriPostLaunchAction> {
        private CREATOR() {
        }

        /* renamed from: a */
        public OpenUriPostLaunchAction[] newArray(int i) {
            return new OpenUriPostLaunchAction[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public OpenUriPostLaunchAction createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new OpenUriPostLaunchAction(parcel);
        }
    }

    public String toString() {
        return "OpenUriPostLaunchAction(uri=" + this.f112854a + ", internal=" + this.f112855b + ", bundle=" + this.f112856c + ')';
    }

    @Override // com.ss.android.lark.main.router.PostLaunchAction
    /* renamed from: a */
    public void mo157938a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        C44508c.m176572c(activity, this.f112854a, this.f112855b, this.f112856c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OpenUriPostLaunchAction(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r5.readParcelable(r0)
            if (r0 != 0) goto L_0x0014
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0014:
            android.net.Uri r0 = (android.net.Uri) r0
            byte r1 = r5.readByte()
            r2 = 0
            byte r3 = (byte) r2
            if (r1 == r3) goto L_0x001f
            r2 = 1
        L_0x001f:
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Bundle r5 = r5.readBundle(r1)
            r4.<init>(r0, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.router.OpenUriPostLaunchAction.<init>(android.os.Parcel):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeParcelable(this.f112854a, i);
        parcel.writeByte(this.f112855b ? (byte) 1 : 0);
        parcel.writeBundle(this.f112856c);
    }

    public OpenUriPostLaunchAction(Uri uri, boolean z, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        this.f112854a = uri;
        this.f112855b = z;
        this.f112856c = bundle;
    }
}
