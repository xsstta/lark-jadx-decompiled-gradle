package com.ss.android.lark.widget.photo_picker_new;

import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "()V", "isDisable", "", "()Z", "setDisable", "(Z)V", "isNotBeSelectedWithNumLimit", "setNotBeSelectedWithNumLimit", "isSelected", "setSelected", "isSelectingVideo", "setSelectingVideo", "originBackupPath", "", "getOriginBackupPath", "()Ljava/lang/String;", "setOriginBackupPath", "(Ljava/lang/String;)V", "selectedOrderText", "getSelectedOrderText", "setSelectedOrderText", "copy", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.f */
public final class SelectablePhoto extends Photo {

    /* renamed from: a */
    private String f143740a = "";

    /* renamed from: b */
    private boolean f143741b;

    /* renamed from: c */
    private boolean f143742c;

    /* renamed from: d */
    private boolean f143743d;

    /* renamed from: e */
    private boolean f143744e;

    /* renamed from: f */
    private String f143745f;

    /* renamed from: j */
    public final String mo197736j() {
        return this.f143740a;
    }

    /* renamed from: k */
    public final boolean mo197737k() {
        return this.f143741b;
    }

    /* renamed from: l */
    public final boolean mo197738l() {
        return this.f143742c;
    }

    /* renamed from: m */
    public final boolean mo197739m() {
        return this.f143743d;
    }

    /* renamed from: n */
    public final boolean mo197740n() {
        return this.f143744e;
    }

    /* renamed from: o */
    public final String mo197741o() {
        return this.f143745f;
    }

    /* renamed from: a */
    public final void mo197730a(boolean z) {
        this.f143741b = z;
    }

    /* renamed from: b */
    public final void mo197731b(boolean z) {
        this.f143742c = z;
    }

    /* renamed from: c */
    public final void mo197732c(boolean z) {
        this.f143743d = z;
    }

    /* renamed from: d */
    public final void mo197734d(boolean z) {
        this.f143744e = z;
    }

    /* renamed from: e */
    public final void mo197735e(String str) {
        this.f143745f = str;
    }

    /* renamed from: d */
    public final void mo197733d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f143740a = str;
    }
}
