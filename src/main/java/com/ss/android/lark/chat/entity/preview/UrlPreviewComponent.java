package com.ss.android.lark.chat.entity.preview;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000b\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponent;", "Ljava/io/Serializable;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/Type;", "canSkipWhenUnknown", "", "style", "Lcom/ss/android/lark/chat/entity/preview/Style;", "childIds", "", "", "isFontZoomable", "property", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "(Lcom/ss/android/lark/chat/entity/preview/Type;Ljava/lang/Boolean;Lcom/ss/android/lark/chat/entity/preview/Style;Ljava/util/List;Ljava/lang/Boolean;Lcom/ss/android/lark/chat/entity/preview/BaseProperty;)V", "getCanSkipWhenUnknown", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChildIds", "()Ljava/util/List;", "getProperty", "()Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "getStyle", "()Lcom/ss/android/lark/chat/entity/preview/Style;", "getType", "()Lcom/ss/android/lark/chat/entity/preview/Type;", "equals", "other", "", "hashCode", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UrlPreviewComponent implements Serializable {
    private final Boolean canSkipWhenUnknown;
    private final List<String> childIds;
    private final Boolean isFontZoomable;
    private final BaseProperty property;
    private final Style style;
    private final Type type;

    public final Boolean getCanSkipWhenUnknown() {
        return this.canSkipWhenUnknown;
    }

    public final List<String> getChildIds() {
        return this.childIds;
    }

    public final BaseProperty getProperty() {
        return this.property;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final Type getType() {
        return this.type;
    }

    public final Boolean isFontZoomable() {
        return this.isFontZoomable;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = this.type.hashCode() * 31;
        Boolean bool = this.canSkipWhenUnknown;
        int i4 = 0;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        Style style2 = this.style;
        if (style2 != null) {
            i2 = style2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        List<String> list = this.childIds;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Boolean bool2 = this.isFontZoomable;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return ((i7 + i4) * 31) + this.property.hashCode();
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            UrlPreviewComponent urlPreviewComponent = (UrlPreviewComponent) obj;
            if (this.type == urlPreviewComponent.type && !(!Intrinsics.areEqual(this.canSkipWhenUnknown, urlPreviewComponent.canSkipWhenUnknown)) && !(!Intrinsics.areEqual(this.style, urlPreviewComponent.style)) && !(!Intrinsics.areEqual(this.childIds, urlPreviewComponent.childIds)) && !(!Intrinsics.areEqual(this.isFontZoomable, urlPreviewComponent.isFontZoomable)) && !(!Intrinsics.areEqual(this.property, urlPreviewComponent.property))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.UrlPreviewComponent");
    }

    public UrlPreviewComponent(Type type2, Boolean bool, Style style2, List<String> list, Boolean bool2, BaseProperty baseProperty) {
        Intrinsics.checkParameterIsNotNull(type2, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(baseProperty, "property");
        this.type = type2;
        this.canSkipWhenUnknown = bool;
        this.style = style2;
        this.childIds = list;
        this.isFontZoomable = bool2;
        this.property = baseProperty;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UrlPreviewComponent(com.ss.android.lark.chat.entity.preview.Type r10, java.lang.Boolean r11, com.ss.android.lark.chat.entity.preview.Style r12, java.util.List r13, java.lang.Boolean r14, com.ss.android.lark.chat.entity.preview.BaseProperty r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 2
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x000b
            r4 = r1
            goto L_0x000c
        L_0x000b:
            r4 = r11
        L_0x000c:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0012
            r7 = r1
            goto L_0x0013
        L_0x0012:
            r7 = r14
        L_0x0013:
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.entity.preview.UrlPreviewComponent.<init>(com.ss.android.lark.chat.entity.preview.Type, java.lang.Boolean, com.ss.android.lark.chat.entity.preview.Style, java.util.List, java.lang.Boolean, com.ss.android.lark.chat.entity.preview.BaseProperty, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
