package com.ss.android.lark.tab.space.tab.add.list.entity;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.component.ui.avatar.ImageKeyType;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\b\u0018\u0000 G2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002FGB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012HÆ\u0003J\t\u00101\u001a\u00020\u0015HÆ\u0003J\t\u00102\u001a\u00020\u0004HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J¡\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010;\u001a\u00020\u00152\b\u0010<\u001a\u0004\u0018\u00010=H\u0002J\b\u0010>\u001a\u0004\u0018\u00010?J\b\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u0000H\u0016J\u0010\u0010D\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u0000H\u0016J\t\u0010E\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010#R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001a¨\u0006H"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "Ljava/io/Serializable;", "Lcom/larksuite/framework/utils/diff/Diffable;", "id", "", "docUrl", "docType", "Lcom/ss/android/lark/doc/entity/DocType;", "wikiSubType", "ownerId", "ownerName", "ownerAvatar", "title", "updateTime", "", "icon", "Lcom/ss/android/lark/doc/entity/Icon;", "nameHitTerms", "", "descHitTerms", "showCrossTenantTag", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/doc/entity/DocType;Lcom/ss/android/lark/doc/entity/DocType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/ss/android/lark/doc/entity/Icon;Ljava/util/List;Ljava/util/List;Z)V", "getDescHitTerms", "()Ljava/util/List;", "getDocType", "()Lcom/ss/android/lark/doc/entity/DocType;", "getDocUrl", "()Ljava/lang/String;", "getIcon", "()Lcom/ss/android/lark/doc/entity/Icon;", "getId", "getNameHitTerms", "getOwnerAvatar", "setOwnerAvatar", "(Ljava/lang/String;)V", "getOwnerId", "getOwnerName", "setOwnerName", "getShowCrossTenantTag", "()Z", "getTitle", "getUpdateTime", "()J", "getWikiSubType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getImageKeyType", "Lcom/larksuite/component/ui/avatar/ImageKeyType;", "hashCode", "", "isContentSame", "diffable", "isItemSame", "toString", "Builder", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SpaceSelectViewData implements AbstractC26248b<SpaceSelectViewData>, Serializable {
    public static final Companion Companion = new Companion(null);
    private final List<String> descHitTerms;
    private final DocType docType;
    private final String docUrl;
    private final Icon icon;
    private final String id;
    private final List<String> nameHitTerms;
    private String ownerAvatar;
    private final String ownerId;
    private String ownerName;
    private final boolean showCrossTenantTag;
    private final String title;
    private final long updateTime;
    private final DocType wikiSubType;

    public static /* synthetic */ SpaceSelectViewData copy$default(SpaceSelectViewData spaceSelectViewData, String str, String str2, DocType docType2, DocType docType3, String str3, String str4, String str5, String str6, long j, Icon icon2, List list, List list2, boolean z, int i, Object obj) {
        return spaceSelectViewData.copy((i & 1) != 0 ? spaceSelectViewData.id : str, (i & 2) != 0 ? spaceSelectViewData.docUrl : str2, (i & 4) != 0 ? spaceSelectViewData.docType : docType2, (i & 8) != 0 ? spaceSelectViewData.wikiSubType : docType3, (i & 16) != 0 ? spaceSelectViewData.ownerId : str3, (i & 32) != 0 ? spaceSelectViewData.ownerName : str4, (i & 64) != 0 ? spaceSelectViewData.ownerAvatar : str5, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? spaceSelectViewData.title : str6, (i & DynamicModule.f58006b) != 0 ? spaceSelectViewData.updateTime : j, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? spaceSelectViewData.icon : icon2, (i & 1024) != 0 ? spaceSelectViewData.nameHitTerms : list, (i & 2048) != 0 ? spaceSelectViewData.descHitTerms : list2, (i & 4096) != 0 ? spaceSelectViewData.showCrossTenantTag : z);
    }

    @JvmStatic
    public static final Builder newBuilder() {
        return Companion.mo188666a();
    }

    public final String component1() {
        return this.id;
    }

    public final Icon component10() {
        return this.icon;
    }

    public final List<String> component11() {
        return this.nameHitTerms;
    }

    public final List<String> component12() {
        return this.descHitTerms;
    }

    public final boolean component13() {
        return this.showCrossTenantTag;
    }

    public final String component2() {
        return this.docUrl;
    }

    public final DocType component3() {
        return this.docType;
    }

    public final DocType component4() {
        return this.wikiSubType;
    }

    public final String component5() {
        return this.ownerId;
    }

    public final String component6() {
        return this.ownerName;
    }

    public final String component7() {
        return this.ownerAvatar;
    }

    public final String component8() {
        return this.title;
    }

    public final long component9() {
        return this.updateTime;
    }

    public final SpaceSelectViewData copy(String str, String str2, DocType docType2, DocType docType3, String str3, String str4, String str5, String str6, long j, Icon icon2, List<String> list, List<String> list2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "docUrl");
        Intrinsics.checkParameterIsNotNull(docType2, "docType");
        Intrinsics.checkParameterIsNotNull(str6, "title");
        Intrinsics.checkParameterIsNotNull(list, "nameHitTerms");
        Intrinsics.checkParameterIsNotNull(list2, "descHitTerms");
        return new SpaceSelectViewData(str, str2, docType2, docType3, str3, str4, str5, str6, j, icon2, list, list2, z);
    }

    public String toString() {
        return "SpaceSelectViewData(id=" + this.id + ", docUrl=" + this.docUrl + ", docType=" + this.docType + ", wikiSubType=" + this.wikiSubType + ", ownerId=" + this.ownerId + ", ownerName=" + this.ownerName + ", ownerAvatar=" + this.ownerAvatar + ", title=" + this.title + ", updateTime=" + this.updateTime + ", icon=" + this.icon + ", nameHitTerms=" + this.nameHitTerms + ", descHitTerms=" + this.descHitTerms + ", showCrossTenantTag=" + this.showCrossTenantTag + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData$Companion;", "", "()V", "newBuilder", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData$Builder;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData$b */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Builder mo188666a() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List<String> getDescHitTerms() {
        return this.descHitTerms;
    }

    public final DocType getDocType() {
        return this.docType;
    }

    public final String getDocUrl() {
        return this.docUrl;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getNameHitTerms() {
        return this.nameHitTerms;
    }

    public final String getOwnerAvatar() {
        return this.ownerAvatar;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final boolean getShowCrossTenantTag() {
        return this.showCrossTenantTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final DocType getWikiSubType() {
        return this.wikiSubType;
    }

    public final ImageKeyType getImageKeyType() {
        Icon icon2 = this.icon;
        if (icon2 == null || icon2.getType() != ImageKeyType.IMAGE.getValue()) {
            return ImageKeyType.UNKOWN;
        }
        return ImageKeyType.IMAGE;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = ((((this.id.hashCode() * 31) + this.docUrl.hashCode()) * 31) + this.docType.hashCode()) * 31;
        DocType docType2 = this.wikiSubType;
        int i5 = 0;
        if (docType2 != null) {
            i = docType2.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        String str = this.ownerId;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.ownerName;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.ownerAvatar;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((((i8 + i4) * 31) + this.title.hashCode()) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.updateTime)) * 31;
        Icon icon2 = this.icon;
        if (icon2 != null) {
            i5 = icon2.hashCode();
        }
        return ((((((hashCode2 + i5) * 31) + this.nameHitTerms.hashCode()) * 31) + this.descHitTerms.hashCode()) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.showCrossTenantTag);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0003\u001a\u00020\u00002\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005J\u001e\u0010\r\u001a\u00020\u00002\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\bR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData$Builder;", "", "()V", "descHitTerms", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "docType", "Lcom/ss/android/lark/doc/entity/DocType;", "docUrl", "icon", "Lcom/ss/android/lark/doc/entity/Icon;", "id", "nameHitTerms", "ownerAvatar", "ownerId", "ownerName", "showCrossTenantTag", "", "title", "updateTime", "", "wikiSubType", "build", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData$a */
    public static final class Builder {

        /* renamed from: a */
        private String f136578a = "";

        /* renamed from: b */
        private String f136579b = "";

        /* renamed from: c */
        private DocType f136580c = DocType.UNKNOWN_DOC_TYPE;

        /* renamed from: d */
        private DocType f136581d;

        /* renamed from: e */
        private String f136582e;

        /* renamed from: f */
        private String f136583f;

        /* renamed from: g */
        private String f136584g;

        /* renamed from: h */
        private String f136585h = "";

        /* renamed from: i */
        private long f136586i;

        /* renamed from: j */
        private Icon f136587j;

        /* renamed from: k */
        private ArrayList<String> f136588k = new ArrayList<>();

        /* renamed from: l */
        private ArrayList<String> f136589l = new ArrayList<>();

        /* renamed from: m */
        private boolean f136590m;

        /* renamed from: a */
        public final SpaceSelectViewData mo188658a() {
            return new SpaceSelectViewData(this.f136578a, this.f136579b, this.f136580c, this.f136581d, this.f136582e, this.f136583f, this.f136584g, this.f136585h, this.f136586i, this.f136587j, this.f136588k, this.f136589l, this.f136590m);
        }

        /* renamed from: a */
        public final Builder mo188652a(long j) {
            Builder aVar = this;
            aVar.f136586i = j;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo188659b(DocType docType) {
            Builder aVar = this;
            aVar.f136581d = docType;
            return aVar;
        }

        /* renamed from: c */
        public final Builder mo188662c(String str) {
            Builder aVar = this;
            aVar.f136582e = str;
            return aVar;
        }

        /* renamed from: d */
        public final Builder mo188663d(String str) {
            Builder aVar = this;
            aVar.f136583f = str;
            return aVar;
        }

        /* renamed from: e */
        public final Builder mo188664e(String str) {
            Builder aVar = this;
            aVar.f136584g = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo188653a(DocType docType) {
            Intrinsics.checkParameterIsNotNull(docType, "docType");
            Builder aVar = this;
            aVar.f136580c = docType;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo188660b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "docUrl");
            Builder aVar = this;
            aVar.f136579b = str;
            return aVar;
        }

        /* renamed from: f */
        public final Builder mo188665f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Builder aVar = this;
            aVar.f136585h = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo188654a(Icon icon) {
            Builder aVar = this;
            aVar.f136587j = icon;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo188661b(ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "descHitTerms");
            Builder aVar = this;
            aVar.f136589l = arrayList;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo188655a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Builder aVar = this;
            aVar.f136578a = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo188656a(ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "nameHitTerms");
            Builder aVar = this;
            aVar.f136588k = arrayList;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo188657a(boolean z) {
            Builder aVar = this;
            aVar.f136590m = z;
            return aVar;
        }
    }

    public final void setOwnerAvatar(String str) {
        this.ownerAvatar = str;
    }

    public final void setOwnerName(String str) {
        this.ownerName = str;
    }

    public boolean isContentSame(SpaceSelectViewData spaceSelectViewData) {
        Intrinsics.checkParameterIsNotNull(spaceSelectViewData, "diffable");
        return equals(spaceSelectViewData);
    }

    public boolean isItemSame(SpaceSelectViewData spaceSelectViewData) {
        Intrinsics.checkParameterIsNotNull(spaceSelectViewData, "diffable");
        return Intrinsics.areEqual(spaceSelectViewData.id, this.id);
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
            SpaceSelectViewData spaceSelectViewData = (SpaceSelectViewData) obj;
            if (!(!Intrinsics.areEqual(this.id, spaceSelectViewData.id)) && !(!Intrinsics.areEqual(this.docUrl, spaceSelectViewData.docUrl)) && this.docType == spaceSelectViewData.docType && this.wikiSubType == spaceSelectViewData.wikiSubType && !(!Intrinsics.areEqual(this.ownerId, spaceSelectViewData.ownerId)) && !(!Intrinsics.areEqual(this.ownerName, spaceSelectViewData.ownerName)) && !(!Intrinsics.areEqual(this.ownerAvatar, spaceSelectViewData.ownerAvatar)) && !(!Intrinsics.areEqual(this.title, spaceSelectViewData.title)) && this.updateTime == spaceSelectViewData.updateTime && !(!Intrinsics.areEqual(this.icon, spaceSelectViewData.icon)) && !(!Intrinsics.areEqual(this.nameHitTerms, spaceSelectViewData.nameHitTerms)) && !(!Intrinsics.areEqual(this.descHitTerms, spaceSelectViewData.descHitTerms)) && this.showCrossTenantTag == spaceSelectViewData.showCrossTenantTag) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData");
    }

    public SpaceSelectViewData(String str, String str2, DocType docType2, DocType docType3, String str3, String str4, String str5, String str6, long j, Icon icon2, List<String> list, List<String> list2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "docUrl");
        Intrinsics.checkParameterIsNotNull(docType2, "docType");
        Intrinsics.checkParameterIsNotNull(str6, "title");
        Intrinsics.checkParameterIsNotNull(list, "nameHitTerms");
        Intrinsics.checkParameterIsNotNull(list2, "descHitTerms");
        this.id = str;
        this.docUrl = str2;
        this.docType = docType2;
        this.wikiSubType = docType3;
        this.ownerId = str3;
        this.ownerName = str4;
        this.ownerAvatar = str5;
        this.title = str6;
        this.updateTime = j;
        this.icon = icon2;
        this.nameHitTerms = list;
        this.descHitTerms = list2;
        this.showCrossTenantTag = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpaceSelectViewData(java.lang.String r19, java.lang.String r20, com.ss.android.lark.doc.entity.DocType r21, com.ss.android.lark.doc.entity.DocType r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, long r27, com.ss.android.lark.doc.entity.Icon r29, java.util.List r30, java.util.List r31, boolean r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x000a
            r1 = 0
            r12 = r1
            goto L_0x000c
        L_0x000a:
            r12 = r27
        L_0x000c:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            r17 = 0
            goto L_0x0016
        L_0x0014:
            r17 = r32
        L_0x0016:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r14 = r29
            r15 = r30
            r16 = r31
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData.<init>(java.lang.String, java.lang.String, com.ss.android.lark.doc.entity.DocType, com.ss.android.lark.doc.entity.DocType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.ss.android.lark.doc.entity.Icon, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
