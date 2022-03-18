package com.ss.ugc.effectplatform.model.net;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003JP\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015¨\u0006,"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/InfoStickerListModel;", "", "subtitle", "", "cursor", "", "has_more", "", "sticker_list", "", "Lcom/ss/ugc/effectplatform/model/net/InfoStickerEffect;", "extra", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "getCursor", "()Ljava/lang/Integer;", "setCursor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "getHas_more", "()Ljava/lang/Boolean;", "setHas_more", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSticker_list", "()Ljava/util/List;", "setSticker_list", "(Ljava/util/List;)V", "getSubtitle", "setSubtitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lcom/ss/ugc/effectplatform/model/net/InfoStickerListModel;", "equals", "other", "hashCode", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InfoStickerListModel {
    private Integer cursor;
    private String extra;
    private Boolean has_more;
    private List<InfoStickerEffect> sticker_list;
    private String subtitle;

    public InfoStickerListModel() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.ugc.effectplatform.model.net.InfoStickerListModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoStickerListModel copy$default(InfoStickerListModel infoStickerListModel, String str, Integer num, Boolean bool, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoStickerListModel.subtitle;
        }
        if ((i & 2) != 0) {
            num = infoStickerListModel.cursor;
        }
        if ((i & 4) != 0) {
            bool = infoStickerListModel.has_more;
        }
        if ((i & 8) != 0) {
            list = infoStickerListModel.sticker_list;
        }
        if ((i & 16) != 0) {
            str2 = infoStickerListModel.extra;
        }
        return infoStickerListModel.copy(str, num, bool, list, str2);
    }

    public final String component1() {
        return this.subtitle;
    }

    public final Integer component2() {
        return this.cursor;
    }

    public final Boolean component3() {
        return this.has_more;
    }

    public final List<InfoStickerEffect> component4() {
        return this.sticker_list;
    }

    public final String component5() {
        return this.extra;
    }

    public final InfoStickerListModel copy(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        return new InfoStickerListModel(str, num, bool, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStickerListModel)) {
            return false;
        }
        InfoStickerListModel infoStickerListModel = (InfoStickerListModel) obj;
        return Intrinsics.areEqual(this.subtitle, infoStickerListModel.subtitle) && Intrinsics.areEqual(this.cursor, infoStickerListModel.cursor) && Intrinsics.areEqual(this.has_more, infoStickerListModel.has_more) && Intrinsics.areEqual(this.sticker_list, infoStickerListModel.sticker_list) && Intrinsics.areEqual(this.extra, infoStickerListModel.extra);
    }

    public int hashCode() {
        String str = this.subtitle;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.cursor;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.has_more;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list = this.sticker_list;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.extra;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "InfoStickerListModel(subtitle=" + this.subtitle + ", cursor=" + this.cursor + ", has_more=" + this.has_more + ", sticker_list=" + this.sticker_list + ", extra=" + this.extra + ")";
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Boolean getHas_more() {
        return this.has_more;
    }

    public final List<InfoStickerEffect> getSticker_list() {
        return this.sticker_list;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setHas_more(Boolean bool) {
        this.has_more = bool;
    }

    public final void setSticker_list(List<InfoStickerEffect> list) {
        this.sticker_list = list;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public InfoStickerListModel(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        this.subtitle = str;
        this.cursor = num;
        this.has_more = bool;
        this.sticker_list = list;
        this.extra = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoStickerListModel(String str, Integer num, Boolean bool, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str2);
    }
}
