package com.bytedance.ee.android.file.picker.lib.dto;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B#\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B#\b\u0017\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nB+\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J5\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010=\u001a\u0002032\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0005HÖ\u0001J\t\u0010@\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001cR\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u001a\u0010+\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001a\u0010.\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\rR\u001a\u00102\u001a\u000203X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006A"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/dto/FilePickerLaunchParams;", "", "activity", "Landroid/app/Activity;", "requestCode", "", "action", "(Landroid/app/Activity;II)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;II)V", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;II)V", "getAction", "()I", "getActivity", "()Landroid/app/Activity;", "customSendBtnTips", "", "getCustomSendBtnTips", "()Ljava/lang/String;", "setCustomSendBtnTips", "(Ljava/lang/String;)V", "customTitle", "getCustomTitle", "setCustomTitle", "fileType", "getFileType", "setFileType", "(I)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "maxSelectFileNum", "getMaxSelectFileNum", "setMaxSelectFileNum", "maxSelectFileSize", "", "getMaxSelectFileSize", "()J", "setMaxSelectFileSize", "(J)V", "maxSingleSelectFileSize", "getMaxSingleSelectFileSize", "setMaxSingleSelectFileSize", "overSelectFileSizeTextTips", "getOverSelectFileSizeTextTips", "setOverSelectFileSizeTextTips", "overSelectSingleFileSizeTextTips", "getOverSelectSingleFileSizeTextTips", "setOverSelectSingleFileSizeTextTips", "getRequestCode", "showFilterMenu", "", "getShowFilterMenu", "()Z", "setShowFilterMenu", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.b.a */
public final class FilePickerLaunchParams {

    /* renamed from: a */
    private long f12258a;

    /* renamed from: b */
    private long f12259b;

    /* renamed from: c */
    private int f12260c;

    /* renamed from: d */
    private String f12261d;

    /* renamed from: e */
    private String f12262e;

    /* renamed from: f */
    private String f12263f;

    /* renamed from: g */
    private String f12264g;

    /* renamed from: h */
    private boolean f12265h;

    /* renamed from: i */
    private int f12266i;

    /* renamed from: j */
    private final Activity f12267j;

    /* renamed from: k */
    private final Fragment f12268k;

    /* renamed from: l */
    private final int f12269l;

    /* renamed from: m */
    private final int f12270m;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilePickerLaunchParams)) {
            return false;
        }
        FilePickerLaunchParams aVar = (FilePickerLaunchParams) obj;
        return Intrinsics.areEqual(this.f12267j, aVar.f12267j) && Intrinsics.areEqual(this.f12268k, aVar.f12268k) && this.f12269l == aVar.f12269l && this.f12270m == aVar.f12270m;
    }

    public int hashCode() {
        Activity activity = this.f12267j;
        int i = 0;
        int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
        Fragment fragment = this.f12268k;
        if (fragment != null) {
            i = fragment.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f12269l) * 31) + this.f12270m;
    }

    public String toString() {
        return "FilePickerLaunchParams(activity=" + this.f12267j + ", fragment=" + this.f12268k + ", requestCode=" + this.f12269l + ", action=" + this.f12270m + ")";
    }

    /* renamed from: a */
    public final long mo15820a() {
        return this.f12258a;
    }

    /* renamed from: b */
    public final long mo15825b() {
        return this.f12259b;
    }

    /* renamed from: c */
    public final int mo15829c() {
        return this.f12260c;
    }

    /* renamed from: d */
    public final String mo15831d() {
        return this.f12261d;
    }

    /* renamed from: e */
    public final String mo15833e() {
        return this.f12262e;
    }

    /* renamed from: f */
    public final String mo15835f() {
        return this.f12263f;
    }

    /* renamed from: g */
    public final String mo15836g() {
        return this.f12264g;
    }

    /* renamed from: h */
    public final boolean mo15837h() {
        return this.f12265h;
    }

    /* renamed from: i */
    public final int mo15839i() {
        return this.f12266i;
    }

    /* renamed from: j */
    public final Activity mo15840j() {
        return this.f12267j;
    }

    /* renamed from: k */
    public final Fragment mo15841k() {
        return this.f12268k;
    }

    /* renamed from: l */
    public final int mo15842l() {
        return this.f12269l;
    }

    /* renamed from: m */
    public final int mo15843m() {
        return this.f12270m;
    }

    /* renamed from: a */
    public final void mo15821a(int i) {
        this.f12260c = i;
    }

    /* renamed from: b */
    public final void mo15826b(int i) {
        this.f12266i = i;
    }

    /* renamed from: c */
    public final void mo15830c(String str) {
        this.f12263f = str;
    }

    /* renamed from: d */
    public final void mo15832d(String str) {
        this.f12264g = str;
    }

    /* renamed from: a */
    public final void mo15822a(long j) {
        this.f12258a = j;
    }

    /* renamed from: b */
    public final void mo15827b(long j) {
        this.f12259b = j;
    }

    /* renamed from: a */
    public final void mo15823a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f12261d = str;
    }

    /* renamed from: b */
    public final void mo15828b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f12262e = str;
    }

    /* renamed from: a */
    public final void mo15824a(boolean z) {
        this.f12265h = z;
    }

    public FilePickerLaunchParams(Activity activity, int i, int i2) {
        this(activity, null, i, i2);
    }

    public FilePickerLaunchParams(Fragment fragment, int i, int i2) {
        this(null, fragment, i, i2);
    }

    private FilePickerLaunchParams(Activity activity, Fragment fragment, int i, int i2) {
        this.f12267j = activity;
        this.f12268k = fragment;
        this.f12269l = i;
        this.f12270m = i2;
        this.f12258a = Long.MAX_VALUE;
        this.f12259b = Long.MAX_VALUE;
        this.f12260c = Integer.MAX_VALUE;
        this.f12261d = "";
        this.f12262e = "";
        this.f12266i = 202000;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilePickerLaunchParams(Activity activity, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, i, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilePickerLaunchParams(Fragment fragment, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, i, (i3 & 4) != 0 ? 0 : i2);
    }
}
