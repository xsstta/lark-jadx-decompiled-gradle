package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "Lcom/larksuite/framework/section/IActionData;", "urlPreview", "Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;", "selection", "", "content", "", "(Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;ILjava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getSelection", "()I", "getUrlPreview", "()Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ah */
public final class UrlPasteBean implements IActionData {

    /* renamed from: a */
    private final NetUrlPreviewEntity f140158a;

    /* renamed from: b */
    private final int f140159b;

    /* renamed from: c */
    private final String f140160c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlPasteBean)) {
            return false;
        }
        UrlPasteBean ahVar = (UrlPasteBean) obj;
        return Intrinsics.areEqual(this.f140158a, ahVar.f140158a) && this.f140159b == ahVar.f140159b && Intrinsics.areEqual(this.f140160c, ahVar.f140160c);
    }

    public int hashCode() {
        NetUrlPreviewEntity netUrlPreviewEntity = this.f140158a;
        int i = 0;
        int hashCode = (((netUrlPreviewEntity != null ? netUrlPreviewEntity.hashCode() : 0) * 31) + this.f140159b) * 31;
        String str = this.f140160c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "UrlPasteBean(urlPreview=" + this.f140158a + ", selection=" + this.f140159b + ", content=" + this.f140160c + ")";
    }

    /* renamed from: a */
    public final NetUrlPreviewEntity mo192976a() {
        return this.f140158a;
    }

    /* renamed from: b */
    public final int mo192977b() {
        return this.f140159b;
    }

    /* renamed from: c */
    public final String mo192978c() {
        return this.f140160c;
    }

    public UrlPasteBean(NetUrlPreviewEntity netUrlPreviewEntity, int i, String str) {
        Intrinsics.checkParameterIsNotNull(netUrlPreviewEntity, "urlPreview");
        Intrinsics.checkParameterIsNotNull(str, "content");
        this.f140158a = netUrlPreviewEntity;
        this.f140159b = i;
        this.f140160c = str;
    }
}
