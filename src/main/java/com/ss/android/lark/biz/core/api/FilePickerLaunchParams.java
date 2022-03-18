package com.ss.android.lark.biz.core.api;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u001d\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u00103\u001a\u00020+2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001a\u0010&\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00067"}, d2 = {"Lcom/ss/android/lark/biz/core/api/FilePickerLaunchParams;", "", "activity", "Landroid/app/Activity;", "requestCode", "", "(Landroid/app/Activity;I)V", "getActivity", "()Landroid/app/Activity;", "customSendBtnTips", "", "getCustomSendBtnTips", "()Ljava/lang/String;", "setCustomSendBtnTips", "(Ljava/lang/String;)V", "customTitle", "getCustomTitle", "setCustomTitle", "fileType", "getFileType", "()I", "setFileType", "(I)V", "maxSelectFileNum", "getMaxSelectFileNum", "setMaxSelectFileNum", "maxSelectFileSize", "", "getMaxSelectFileSize", "()J", "setMaxSelectFileSize", "(J)V", "maxSingleSelectFileSize", "getMaxSingleSelectFileSize", "setMaxSingleSelectFileSize", "overSelectFileSizeTextTips", "getOverSelectFileSizeTextTips", "setOverSelectFileSizeTextTips", "overSelectSingleFileSizeTextTips", "getOverSelectSingleFileSizeTextTips", "setOverSelectSingleFileSizeTextTips", "getRequestCode", "showFilterMenu", "", "getShowFilterMenu", "()Z", "setShowFilterMenu", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.f */
public final class FilePickerLaunchParams {

    /* renamed from: a */
    private long f73999a = Long.MAX_VALUE;

    /* renamed from: b */
    private long f74000b = Long.MAX_VALUE;

    /* renamed from: c */
    private int f74001c = Integer.MAX_VALUE;

    /* renamed from: d */
    private String f74002d = "";

    /* renamed from: e */
    private String f74003e = "";

    /* renamed from: f */
    private String f74004f;

    /* renamed from: g */
    private String f74005g;

    /* renamed from: h */
    private boolean f74006h;

    /* renamed from: i */
    private int f74007i = 202000;

    /* renamed from: j */
    private final Activity f74008j;

    /* renamed from: k */
    private final int f74009k;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilePickerLaunchParams)) {
            return false;
        }
        FilePickerLaunchParams fVar = (FilePickerLaunchParams) obj;
        return Intrinsics.areEqual(this.f74008j, fVar.f74008j) && this.f74009k == fVar.f74009k;
    }

    public int hashCode() {
        Activity activity = this.f74008j;
        return ((activity != null ? activity.hashCode() : 0) * 31) + this.f74009k;
    }

    public String toString() {
        return "FilePickerLaunchParams(activity=" + this.f74008j + ", requestCode=" + this.f74009k + ")";
    }

    /* renamed from: a */
    public final long mo105735a() {
        return this.f73999a;
    }

    /* renamed from: b */
    public final long mo105740b() {
        return this.f74000b;
    }

    /* renamed from: c */
    public final int mo105744c() {
        return this.f74001c;
    }

    /* renamed from: d */
    public final String mo105746d() {
        return this.f74002d;
    }

    /* renamed from: e */
    public final String mo105748e() {
        return this.f74003e;
    }

    /* renamed from: f */
    public final String mo105750f() {
        return this.f74004f;
    }

    /* renamed from: g */
    public final String mo105751g() {
        return this.f74005g;
    }

    /* renamed from: h */
    public final boolean mo105752h() {
        return this.f74006h;
    }

    /* renamed from: i */
    public final int mo105754i() {
        return this.f74007i;
    }

    /* renamed from: j */
    public final Activity mo105755j() {
        return this.f74008j;
    }

    /* renamed from: k */
    public final int mo105756k() {
        return this.f74009k;
    }

    /* renamed from: a */
    public final void mo105736a(int i) {
        this.f74001c = i;
    }

    /* renamed from: b */
    public final void mo105741b(int i) {
        this.f74007i = i;
    }

    /* renamed from: c */
    public final void mo105745c(String str) {
        this.f74004f = str;
    }

    /* renamed from: d */
    public final void mo105747d(String str) {
        this.f74005g = str;
    }

    /* renamed from: a */
    public final void mo105737a(long j) {
        this.f73999a = j;
    }

    /* renamed from: b */
    public final void mo105742b(long j) {
        this.f74000b = j;
    }

    /* renamed from: a */
    public final void mo105738a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f74002d = str;
    }

    /* renamed from: b */
    public final void mo105743b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f74003e = str;
    }

    /* renamed from: a */
    public final void mo105739a(boolean z) {
        this.f74006h = z;
    }

    public FilePickerLaunchParams(Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f74008j = activity;
        this.f74009k = i;
    }
}
