package com.ss.android.lark.chat.preview.entity.component.property;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.Direction;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.Item;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/SpinButtonProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "icon", "Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "items", "", "Lcom/ss/android/lark/chat/preview/entity/component/Item;", "selectedIndex", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/ss/android/lark/chat/preview/entity/component/Direction;", "(Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;Ljava/util/List;Ljava/lang/Long;Lcom/ss/android/lark/chat/preview/entity/component/Direction;)V", "getDirection", "()Lcom/ss/android/lark/chat/preview/entity/component/Direction;", "getIcon", "()Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "getItems", "()Ljava/util/List;", "getSelectedIndex", "()Ljava/lang/Long;", "setSelectedIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "equals", "", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SpinButtonProperty extends BaseProperty {
    private final Direction direction;
    private final ImageSet icon;
    private final List<Item> items;
    private Long selectedIndex;

    public final Direction getDirection() {
        return this.direction;
    }

    public final ImageSet getIcon() {
        return this.icon;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final Long getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = super.hashCode() * 31;
        ImageSet imageSet = this.icon;
        int i4 = 0;
        if (imageSet != null) {
            i = imageSet.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        List<Item> list = this.items;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Long l = this.selectedIndex;
        if (l != null) {
            i3 = l.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Direction direction2 = this.direction;
        if (direction2 != null) {
            i4 = direction2.hashCode();
        }
        return i7 + i4;
    }

    public final void setSelectedIndex(Long l) {
        this.selectedIndex = l;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpinButtonProperty) || !super.equals(obj)) {
            return false;
        }
        SpinButtonProperty spinButtonProperty = (SpinButtonProperty) obj;
        if (!(!Intrinsics.areEqual(this.icon, spinButtonProperty.icon)) && !(!Intrinsics.areEqual(this.items, spinButtonProperty.items)) && !(!Intrinsics.areEqual(this.selectedIndex, spinButtonProperty.selectedIndex)) && this.direction == spinButtonProperty.direction) {
            return true;
        }
        return false;
    }

    public SpinButtonProperty(ImageSet imageSet, List<Item> list, Long l, Direction direction2) {
        super(Type.SPIN_BUTTON);
        this.icon = imageSet;
        this.items = list;
        this.selectedIndex = l;
        this.direction = direction2;
    }
}
