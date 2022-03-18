package com.ss.android.lark.chat.preview.entity.component.property;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.Theme;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0000H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "theme", "Lcom/ss/android/lark/chat/preview/entity/component/Theme;", "chatterCounts", "", "chatterInfoList", "", "Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;", "maxShowCount", "(Lcom/ss/android/lark/chat/preview/entity/component/Theme;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "getChatterCounts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChatterInfoList", "()Ljava/util/List;", "setChatterInfoList", "(Ljava/util/List;)V", "getMaxShowCount", "setMaxShowCount", "(Ljava/lang/Integer;)V", "getTheme", "()Lcom/ss/android/lark/chat/preview/entity/component/Theme;", "clone", "equals", "", "other", "", "hashCode", "ChatterInfo", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChattersPreviewProperty extends BaseProperty {
    private final Integer chatterCounts;
    private List<ChatterInfo> chatterInfoList;
    private Integer maxShowCount;
    private final Theme theme;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;", "Ljava/io/Serializable;", "avatarKey", "", BottomDialog.f17198f, "(Ljava/lang/String;Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "getChatterId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ChatterInfo implements Serializable {
        private final String avatarKey;
        private final String chatterId;

        public static /* synthetic */ ChatterInfo copy$default(ChatterInfo chatterInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatterInfo.avatarKey;
            }
            if ((i & 2) != 0) {
                str2 = chatterInfo.chatterId;
            }
            return chatterInfo.copy(str, str2);
        }

        public final String component1() {
            return this.avatarKey;
        }

        public final String component2() {
            return this.chatterId;
        }

        public final ChatterInfo copy(String str, String str2) {
            return new ChatterInfo(str, str2);
        }

        public String toString() {
            return "ChatterInfo(avatarKey=" + this.avatarKey + ", chatterId=" + this.chatterId + ")";
        }

        public final String getAvatarKey() {
            return this.avatarKey;
        }

        public final String getChatterId() {
            return this.chatterId;
        }

        public int hashCode() {
            int i;
            String str = this.avatarKey;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str2 = this.chatterId;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
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
                ChatterInfo chatterInfo = (ChatterInfo) obj;
                if (!(!Intrinsics.areEqual(this.avatarKey, chatterInfo.avatarKey)) && !(!Intrinsics.areEqual(this.chatterId, chatterInfo.chatterId))) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty.ChatterInfo");
        }

        public ChatterInfo(String str, String str2) {
            this.avatarKey = str;
            this.chatterId = str2;
        }
    }

    public final Integer getChatterCounts() {
        return this.chatterCounts;
    }

    public final List<ChatterInfo> getChatterInfoList() {
        return this.chatterInfoList;
    }

    public final Integer getMaxShowCount() {
        return this.maxShowCount;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props, java.lang.Object
    public ChattersPreviewProperty clone() {
        ChattersPreviewProperty chattersPreviewProperty = new ChattersPreviewProperty(this.theme, this.chatterCounts, this.chatterInfoList, this.maxShowCount);
        chattersPreviewProperty.setMarginLeft(getMarginLeft());
        chattersPreviewProperty.setMarginRight(getMarginRight());
        chattersPreviewProperty.setMarginTop(getMarginTop());
        chattersPreviewProperty.setMarginBottom(getMarginBottom());
        return chattersPreviewProperty;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = super.hashCode() * 31;
        Theme theme2 = this.theme;
        int i4 = 0;
        if (theme2 != null) {
            i = theme2.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        Integer num = this.chatterCounts;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        List<ChatterInfo> list = this.chatterInfoList;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Integer num2 = this.maxShowCount;
        if (num2 != null) {
            i4 = num2.intValue();
        }
        return i7 + i4;
    }

    public final void setChatterInfoList(List<ChatterInfo> list) {
        this.chatterInfoList = list;
    }

    public final void setMaxShowCount(Integer num) {
        this.maxShowCount = num;
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
            ChattersPreviewProperty chattersPreviewProperty = (ChattersPreviewProperty) obj;
            if (this.theme == chattersPreviewProperty.theme && !(!Intrinsics.areEqual(this.chatterCounts, chattersPreviewProperty.chatterCounts)) && !(!Intrinsics.areEqual(this.chatterInfoList, chattersPreviewProperty.chatterInfoList)) && !(!Intrinsics.areEqual(this.maxShowCount, chattersPreviewProperty.maxShowCount))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty");
    }

    public ChattersPreviewProperty(Theme theme2, Integer num, List<ChatterInfo> list, Integer num2) {
        super(Type.CHATTERS_PREVIEW);
        this.theme = theme2;
        this.chatterCounts = num;
        this.chatterInfoList = list;
        this.maxShowCount = num2;
    }
}
