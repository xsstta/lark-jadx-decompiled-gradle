package com.ss.android.lark.chat.entity.redpacket;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.image.entity.PassThroughImage;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001(BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "Ljava/io/Serializable;", "id", "", "name", "", "coverType", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover$CoverType;", "mainCover", "Lcom/ss/android/lark/image/entity/PassThroughImage;", "messageCover", "headCover", "companyLogo", "(JLjava/lang/String;Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover$CoverType;Lcom/ss/android/lark/image/entity/PassThroughImage;Lcom/ss/android/lark/image/entity/PassThroughImage;Lcom/ss/android/lark/image/entity/PassThroughImage;Lcom/ss/android/lark/image/entity/PassThroughImage;)V", "getCompanyLogo", "()Lcom/ss/android/lark/image/entity/PassThroughImage;", "getCoverType", "()Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover$CoverType;", "getHeadCover", "getId", "()J", "getMainCover", "getMessageCover", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CoverType", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketCover implements Serializable {
    private final PassThroughImage companyLogo;
    private final CoverType coverType;
    private final PassThroughImage headCover;
    private final long id;
    private final PassThroughImage mainCover;
    private final PassThroughImage messageCover;
    private final String name;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover$CoverType;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "TEMPLATE", "CUSTOMIZE", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CoverType {
        UNKNOWN,
        TEMPLATE,
        CUSTOMIZE
    }

    public static /* synthetic */ RedPacketCover copy$default(RedPacketCover redPacketCover, long j, String str, CoverType coverType2, PassThroughImage passThroughImage, PassThroughImage passThroughImage2, PassThroughImage passThroughImage3, PassThroughImage passThroughImage4, int i, Object obj) {
        return redPacketCover.copy((i & 1) != 0 ? redPacketCover.id : j, (i & 2) != 0 ? redPacketCover.name : str, (i & 4) != 0 ? redPacketCover.coverType : coverType2, (i & 8) != 0 ? redPacketCover.mainCover : passThroughImage, (i & 16) != 0 ? redPacketCover.messageCover : passThroughImage2, (i & 32) != 0 ? redPacketCover.headCover : passThroughImage3, (i & 64) != 0 ? redPacketCover.companyLogo : passThroughImage4);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final CoverType component3() {
        return this.coverType;
    }

    public final PassThroughImage component4() {
        return this.mainCover;
    }

    public final PassThroughImage component5() {
        return this.messageCover;
    }

    public final PassThroughImage component6() {
        return this.headCover;
    }

    public final PassThroughImage component7() {
        return this.companyLogo;
    }

    public final RedPacketCover copy(long j, String str, CoverType coverType2, PassThroughImage passThroughImage, PassThroughImage passThroughImage2, PassThroughImage passThroughImage3, PassThroughImage passThroughImage4) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(coverType2, "coverType");
        return new RedPacketCover(j, str, coverType2, passThroughImage, passThroughImage2, passThroughImage3, passThroughImage4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedPacketCover)) {
            return false;
        }
        RedPacketCover redPacketCover = (RedPacketCover) obj;
        return this.id == redPacketCover.id && Intrinsics.areEqual(this.name, redPacketCover.name) && Intrinsics.areEqual(this.coverType, redPacketCover.coverType) && Intrinsics.areEqual(this.mainCover, redPacketCover.mainCover) && Intrinsics.areEqual(this.messageCover, redPacketCover.messageCover) && Intrinsics.areEqual(this.headCover, redPacketCover.headCover) && Intrinsics.areEqual(this.companyLogo, redPacketCover.companyLogo);
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        CoverType coverType2 = this.coverType;
        int hashCode2 = (hashCode + (coverType2 != null ? coverType2.hashCode() : 0)) * 31;
        PassThroughImage passThroughImage = this.mainCover;
        int hashCode3 = (hashCode2 + (passThroughImage != null ? passThroughImage.hashCode() : 0)) * 31;
        PassThroughImage passThroughImage2 = this.messageCover;
        int hashCode4 = (hashCode3 + (passThroughImage2 != null ? passThroughImage2.hashCode() : 0)) * 31;
        PassThroughImage passThroughImage3 = this.headCover;
        int hashCode5 = (hashCode4 + (passThroughImage3 != null ? passThroughImage3.hashCode() : 0)) * 31;
        PassThroughImage passThroughImage4 = this.companyLogo;
        if (passThroughImage4 != null) {
            i2 = passThroughImage4.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        return "RedPacketCover(id=" + this.id + ", name=" + this.name + ", coverType=" + this.coverType + ", mainCover=" + this.mainCover + ", messageCover=" + this.messageCover + ", headCover=" + this.headCover + ", companyLogo=" + this.companyLogo + ")";
    }

    public final PassThroughImage getCompanyLogo() {
        return this.companyLogo;
    }

    public final CoverType getCoverType() {
        return this.coverType;
    }

    public final PassThroughImage getHeadCover() {
        return this.headCover;
    }

    public final long getId() {
        return this.id;
    }

    public final PassThroughImage getMainCover() {
        return this.mainCover;
    }

    public final PassThroughImage getMessageCover() {
        return this.messageCover;
    }

    public final String getName() {
        return this.name;
    }

    public RedPacketCover(long j, String str, CoverType coverType2, PassThroughImage passThroughImage, PassThroughImage passThroughImage2, PassThroughImage passThroughImage3, PassThroughImage passThroughImage4) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(coverType2, "coverType");
        this.id = j;
        this.name = str;
        this.coverType = coverType2;
        this.mainCover = passThroughImage;
        this.messageCover = passThroughImage2;
        this.headCover = passThroughImage3;
        this.companyLogo = passThroughImage4;
    }
}
