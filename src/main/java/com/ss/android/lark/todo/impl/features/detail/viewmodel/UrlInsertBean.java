package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlInsertBean;", "Lcom/larksuite/framework/section/IActionData;", "anchorId", "", "urlPreview", "Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;)V", "getAnchorId", "()Ljava/lang/String;", "getUrlPreview", "()Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ag */
public final class UrlInsertBean implements IActionData {

    /* renamed from: a */
    private final String f140156a;

    /* renamed from: b */
    private final NetUrlPreviewEntity f140157b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlInsertBean)) {
            return false;
        }
        UrlInsertBean agVar = (UrlInsertBean) obj;
        return Intrinsics.areEqual(this.f140156a, agVar.f140156a) && Intrinsics.areEqual(this.f140157b, agVar.f140157b);
    }

    public int hashCode() {
        String str = this.f140156a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        NetUrlPreviewEntity netUrlPreviewEntity = this.f140157b;
        if (netUrlPreviewEntity != null) {
            i = netUrlPreviewEntity.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "UrlInsertBean(anchorId=" + this.f140156a + ", urlPreview=" + this.f140157b + ")";
    }

    /* renamed from: a */
    public final String mo192971a() {
        return this.f140156a;
    }

    /* renamed from: b */
    public final NetUrlPreviewEntity mo192972b() {
        return this.f140157b;
    }

    public UrlInsertBean(String str, NetUrlPreviewEntity netUrlPreviewEntity) {
        Intrinsics.checkParameterIsNotNull(str, "anchorId");
        Intrinsics.checkParameterIsNotNull(netUrlPreviewEntity, "urlPreview");
        this.f140156a = str;
        this.f140157b = netUrlPreviewEntity;
    }
}
