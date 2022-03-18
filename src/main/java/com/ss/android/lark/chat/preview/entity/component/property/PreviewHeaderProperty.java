package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.Tag;
import com.ss.android.lark.chat.preview.entity.component.Theme;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00010B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0016J\b\u0010*\u001a\u00020\u0000H\u0016J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010.\u001a\u00020/H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u000b\u0010!R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\t\u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u00061"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "iconKey", "Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "title", "", "larkTag", "Lcom/ss/android/lark/chat/preview/entity/component/Tag;", "childComponentId", "isNeedCopyLink", "", "isNeedClose", "theme", "Lcom/ss/android/lark/chat/preview/entity/component/Theme;", "headerType", "Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty$HeaderType;", "tagColor", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "tagTextColor", "headerTag", "faviconUrl", "iconColor", "(Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;Ljava/lang/String;Lcom/ss/android/lark/chat/preview/entity/component/Tag;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ss/android/lark/chat/preview/entity/component/Theme;Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty$HeaderType;Lcom/ss/android/lark/chat/entity/preview/ThemeColor;Lcom/ss/android/lark/chat/entity/preview/ThemeColor;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/preview/ThemeColor;)V", "getChildComponentId", "()Ljava/lang/String;", "getFaviconUrl", "getHeaderTag", "getHeaderType", "()Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty$HeaderType;", "getIconColor", "()Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "getIconKey", "()Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLarkTag", "()Lcom/ss/android/lark/chat/preview/entity/component/Tag;", "getTagColor", "getTagTextColor", "getTheme", "()Lcom/ss/android/lark/chat/preview/entity/component/Theme;", "getTitle", "clone", "equals", "other", "", "hashCode", "", "HeaderType", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewHeaderProperty extends BaseProperty {
    private final String childComponentId;
    private final String faviconUrl;
    private final String headerTag;
    private final HeaderType headerType;
    private final ThemeColor iconColor;
    private final ImageSet iconKey;
    private final Boolean isNeedClose;
    private final Boolean isNeedCopyLink;
    private final Tag larkTag;
    private final ThemeColor tagColor;
    private final ThemeColor tagTextColor;
    private final Theme theme;
    private final String title;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty$HeaderType;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "NORMAL", "HEADLINES", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum HeaderType implements Serializable {
        NORMAL(0),
        HEADLINES(1);
        
        public static final Companion Companion = new Companion(null);
        private int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty$HeaderType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty$HeaderType;", "value", "", "valueOf", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty$HeaderType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final HeaderType mo126509a(int i) {
                return m132484b(i);
            }

            /* renamed from: b */
            private final HeaderType m132484b(int i) {
                if (i == 0) {
                    return HeaderType.NORMAL;
                }
                if (i != 1) {
                    return HeaderType.NORMAL;
                }
                return HeaderType.HEADLINES;
            }
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        private HeaderType(int i) {
            this.value = i;
        }
    }

    public final String getChildComponentId() {
        return this.childComponentId;
    }

    public final String getFaviconUrl() {
        return this.faviconUrl;
    }

    public final String getHeaderTag() {
        return this.headerTag;
    }

    public final HeaderType getHeaderType() {
        return this.headerType;
    }

    public final ThemeColor getIconColor() {
        return this.iconColor;
    }

    public final ImageSet getIconKey() {
        return this.iconKey;
    }

    public final Tag getLarkTag() {
        return this.larkTag;
    }

    public final ThemeColor getTagColor() {
        return this.tagColor;
    }

    public final ThemeColor getTagTextColor() {
        return this.tagTextColor;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final Boolean isNeedCopyLink() {
        return this.isNeedCopyLink;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props, java.lang.Object
    public PreviewHeaderProperty clone() {
        PreviewHeaderProperty previewHeaderProperty = new PreviewHeaderProperty(this.iconKey, this.title, this.larkTag, this.childComponentId, this.isNeedCopyLink, this.isNeedClose, null, null, this.tagColor, this.tagTextColor, this.headerTag, this.faviconUrl, null, 4288, null);
        previewHeaderProperty.setMarginLeft(getMarginLeft());
        previewHeaderProperty.setMarginRight(getMarginRight());
        previewHeaderProperty.setMarginTop(getMarginTop());
        previewHeaderProperty.setMarginBottom(getMarginBottom());
        return previewHeaderProperty;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int hashCode = super.hashCode() * 31;
        ImageSet imageSet = this.iconKey;
        int i12 = 0;
        if (imageSet != null) {
            i = imageSet.hashCode();
        } else {
            i = 0;
        }
        int i13 = (hashCode + i) * 31;
        String str = this.title;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (i13 + i2) * 31;
        Tag tag = this.larkTag;
        if (tag != null) {
            i3 = tag.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        String str2 = this.childComponentId;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        Boolean bool = this.isNeedCopyLink;
        if (bool != null) {
            i5 = bool.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        Boolean bool2 = this.isNeedClose;
        if (bool2 != null) {
            i6 = bool2.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 31;
        Theme theme2 = this.theme;
        if (theme2 != null) {
            i7 = theme2.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 31;
        HeaderType headerType2 = this.headerType;
        if (headerType2 != null) {
            i8 = headerType2.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 31;
        ThemeColor themeColor = this.tagColor;
        if (themeColor != null) {
            i9 = themeColor.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 31;
        ThemeColor themeColor2 = this.tagTextColor;
        if (themeColor2 != null) {
            i10 = themeColor2.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 31;
        String str3 = this.headerTag;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 31;
        String str4 = this.faviconUrl;
        if (str4 != null) {
            i12 = str4.hashCode();
        }
        return i23 + i12;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
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
        if ((!Intrinsics.areEqual(cls2, cls)) || !super.equals(obj)) {
            return false;
        }
        if (obj != null) {
            PreviewHeaderProperty previewHeaderProperty = (PreviewHeaderProperty) obj;
            if (!(!Intrinsics.areEqual(this.iconKey, previewHeaderProperty.iconKey)) && !(!Intrinsics.areEqual(this.title, previewHeaderProperty.title)) && this.larkTag == previewHeaderProperty.larkTag && !(!Intrinsics.areEqual(this.childComponentId, previewHeaderProperty.childComponentId)) && !(!Intrinsics.areEqual(this.isNeedCopyLink, previewHeaderProperty.isNeedCopyLink)) && !(!Intrinsics.areEqual(this.isNeedClose, previewHeaderProperty.isNeedClose)) && this.theme == previewHeaderProperty.theme && this.headerType == previewHeaderProperty.headerType && !(!Intrinsics.areEqual(this.tagColor, previewHeaderProperty.tagColor)) && !(!Intrinsics.areEqual(this.tagTextColor, previewHeaderProperty.tagTextColor)) && !(!Intrinsics.areEqual(this.headerTag, previewHeaderProperty.headerTag)) && !(!Intrinsics.areEqual(this.faviconUrl, previewHeaderProperty.faviconUrl))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty");
    }

    public PreviewHeaderProperty(ImageSet imageSet, String str, Tag tag, String str2, Boolean bool, Boolean bool2, Theme theme2, HeaderType headerType2, ThemeColor themeColor, ThemeColor themeColor2, String str3, String str4, ThemeColor themeColor3) {
        super(Type.HEADER);
        this.iconKey = imageSet;
        this.title = str;
        this.larkTag = tag;
        this.childComponentId = str2;
        this.isNeedCopyLink = bool;
        this.isNeedClose = bool2;
        this.theme = theme2;
        this.headerType = headerType2;
        this.tagColor = themeColor;
        this.tagTextColor = themeColor2;
        this.headerTag = str3;
        this.faviconUrl = str4;
        this.iconColor = themeColor3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PreviewHeaderProperty(com.ss.android.lark.chat.preview.entity.component.ImageSet r18, java.lang.String r19, com.ss.android.lark.chat.preview.entity.component.Tag r20, java.lang.String r21, java.lang.Boolean r22, java.lang.Boolean r23, com.ss.android.lark.chat.preview.entity.component.Theme r24, com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty.HeaderType r25, com.ss.android.lark.chat.entity.preview.ThemeColor r26, com.ss.android.lark.chat.entity.preview.ThemeColor r27, java.lang.String r28, java.lang.String r29, com.ss.android.lark.chat.entity.preview.ThemeColor r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty.<init>(com.ss.android.lark.chat.preview.entity.component.ImageSet, java.lang.String, com.ss.android.lark.chat.preview.entity.component.Tag, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.ss.android.lark.chat.preview.entity.component.Theme, com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty$HeaderType, com.ss.android.lark.chat.entity.preview.ThemeColor, com.ss.android.lark.chat.entity.preview.ThemeColor, java.lang.String, java.lang.String, com.ss.android.lark.chat.entity.preview.ThemeColor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
