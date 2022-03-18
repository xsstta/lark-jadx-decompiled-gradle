package com.bytedance.ee.bear.templates.banner;

import com.bytedance.ee.util.io.NonProguard;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 42\u00020\u0001:\u00014B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00065"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/BannerData;", "Lcom/bytedance/ee/util/io/NonProguard;", ShareHitPoint.f121869d, "", "url", "", "title", "text", "topicId", "templateId", "objType", "objToken", "obj_type_list", "", "jump_link_url", "banner_id", "collection_id", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;)V", "getBanner_id", "()I", "getCollection_id", "()Ljava/lang/String;", "getJump_link_url", "getObjToken", "getObjType", "getObj_type_list", "()Ljava/util/List;", "getTemplateId", "getText", "getTitle", "getTopicId", "getType", "getUrl", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BannerData implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private final int banner_id;
    private final String collection_id;
    private final String jump_link_url;
    private final String objToken;
    private final int objType;
    private final List<Integer> obj_type_list;
    private final String templateId;
    private final String text;
    private final String title;
    private final String topicId;
    private final int type;
    private final String url;

    public static /* synthetic */ BannerData copy$default(BannerData bannerData, int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, List list, String str7, int i3, String str8, int i4, Object obj) {
        return bannerData.copy((i4 & 1) != 0 ? bannerData.type : i, (i4 & 2) != 0 ? bannerData.url : str, (i4 & 4) != 0 ? bannerData.title : str2, (i4 & 8) != 0 ? bannerData.text : str3, (i4 & 16) != 0 ? bannerData.topicId : str4, (i4 & 32) != 0 ? bannerData.templateId : str5, (i4 & 64) != 0 ? bannerData.objType : i2, (i4 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? bannerData.objToken : str6, (i4 & DynamicModule.f58006b) != 0 ? bannerData.obj_type_list : list, (i4 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? bannerData.jump_link_url : str7, (i4 & 1024) != 0 ? bannerData.banner_id : i3, (i4 & 2048) != 0 ? bannerData.collection_id : str8);
    }

    public final int component1() {
        return this.type;
    }

    public final String component10() {
        return this.jump_link_url;
    }

    public final int component11() {
        return this.banner_id;
    }

    public final String component12() {
        return this.collection_id;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.text;
    }

    public final String component5() {
        return this.topicId;
    }

    public final String component6() {
        return this.templateId;
    }

    public final int component7() {
        return this.objType;
    }

    public final String component8() {
        return this.objToken;
    }

    public final List<Integer> component9() {
        return this.obj_type_list;
    }

    public final BannerData copy(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, List<Integer> list, String str7, int i3, String str8) {
        Intrinsics.checkParameterIsNotNull(list, "obj_type_list");
        return new BannerData(i, str, str2, str3, str4, str5, i2, str6, list, str7, i3, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BannerData) {
                BannerData bannerData = (BannerData) obj;
                if ((this.type == bannerData.type) && Intrinsics.areEqual(this.url, bannerData.url) && Intrinsics.areEqual(this.title, bannerData.title) && Intrinsics.areEqual(this.text, bannerData.text) && Intrinsics.areEqual(this.topicId, bannerData.topicId) && Intrinsics.areEqual(this.templateId, bannerData.templateId)) {
                    if ((this.objType == bannerData.objType) && Intrinsics.areEqual(this.objToken, bannerData.objToken) && Intrinsics.areEqual(this.obj_type_list, bannerData.obj_type_list) && Intrinsics.areEqual(this.jump_link_url, bannerData.jump_link_url)) {
                        if (!(this.banner_id == bannerData.banner_id) || !Intrinsics.areEqual(this.collection_id, bannerData.collection_id)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.url;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.topicId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.templateId;
        int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.objType) * 31;
        String str6 = this.objToken;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<Integer> list = this.obj_type_list;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        String str7 = this.jump_link_url;
        int hashCode8 = (((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.banner_id) * 31;
        String str8 = this.collection_id;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        return "BannerData(type=" + this.type + ", url=" + this.url + ", title=" + this.title + ", text=" + this.text + ", topicId=" + this.topicId + ", templateId=" + this.templateId + ", objType=" + this.objType + ", objToken=" + this.objToken + ", obj_type_list=" + this.obj_type_list + ", jump_link_url=" + this.jump_link_url + ", banner_id=" + this.banner_id + ", collection_id=" + this.collection_id + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/BannerData$Companion;", "", "()V", "BANNER_TYPE_SCENE", "", "BANNER_TYPE_SINGLE", "BANNER_TYPE_TOPIC", "BANNER_TYPE_URL", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.BannerData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getBanner_id() {
        return this.banner_id;
    }

    public final String getCollection_id() {
        return this.collection_id;
    }

    public final String getJump_link_url() {
        return this.jump_link_url;
    }

    public final String getObjToken() {
        return this.objToken;
    }

    public final int getObjType() {
        return this.objType;
    }

    public final List<Integer> getObj_type_list() {
        return this.obj_type_list;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTopicId() {
        return this.topicId;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public BannerData(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, List<Integer> list, String str7, int i3, String str8) {
        Intrinsics.checkParameterIsNotNull(list, "obj_type_list");
        this.type = i;
        this.url = str;
        this.title = str2;
        this.text = str3;
        this.topicId = str4;
        this.templateId = str5;
        this.objType = i2;
        this.objToken = str6;
        this.obj_type_list = list;
        this.jump_link_url = str7;
        this.banner_id = i3;
        this.collection_id = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BannerData(int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.util.List r24, java.lang.String r25, int r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r3 = 1
            goto L_0x000b
        L_0x0009:
            r3 = r16
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001c
            com.bytedance.ee.bear.list.dto.a r1 = com.bytedance.ee.bear.list.dto.C8275a.f22371d
            java.lang.String r2 = "DocumentType.DOC"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            int r1 = r1.mo32555b()
            r9 = r1
            goto L_0x001e
        L_0x001c:
            r9 = r22
        L_0x001e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0025
            r0 = -1
            r13 = -1
            goto L_0x0027
        L_0x0025:
            r13 = r26
        L_0x0027:
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r10 = r23
            r11 = r24
            r12 = r25
            r14 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.banner.BannerData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.util.List, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
