package com.ss.ugc.effectplatform.model.net;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001a¨\u00062"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/QueryInfoStickerListModel;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "panel", "effects", "", "Lcom/ss/ugc/effectplatform/model/net/InfoStickerEffect;", "collection", "category", "Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "front_effect_id", "rear_effect_id", "url_prefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/util/List;", "setCategory", "(Ljava/util/List;)V", "getCollection", "setCollection", "getEffects", "setEffects", "getFront_effect_id", "()Ljava/lang/String;", "setFront_effect_id", "(Ljava/lang/String;)V", "getPanel", "setPanel", "getRear_effect_id", "setRear_effect_id", "getUrl_prefix", "setUrl_prefix", "getVersion", "setVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class QueryInfoStickerListModel {
    private List<? extends EffectCategoryModel> category;
    private List<InfoStickerEffect> collection;
    private List<InfoStickerEffect> effects;
    private String front_effect_id;
    private String panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    public QueryInfoStickerListModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ QueryInfoStickerListModel copy$default(QueryInfoStickerListModel queryInfoStickerListModel, String str, String str2, List list, List list2, List list3, String str3, String str4, List list4, int i, Object obj) {
        return queryInfoStickerListModel.copy((i & 1) != 0 ? queryInfoStickerListModel.version : str, (i & 2) != 0 ? queryInfoStickerListModel.panel : str2, (i & 4) != 0 ? queryInfoStickerListModel.effects : list, (i & 8) != 0 ? queryInfoStickerListModel.collection : list2, (i & 16) != 0 ? queryInfoStickerListModel.category : list3, (i & 32) != 0 ? queryInfoStickerListModel.front_effect_id : str3, (i & 64) != 0 ? queryInfoStickerListModel.rear_effect_id : str4, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? queryInfoStickerListModel.url_prefix : list4);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.panel;
    }

    public final List<InfoStickerEffect> component3() {
        return this.effects;
    }

    public final List<InfoStickerEffect> component4() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    public final List<EffectCategoryModel> component5() {
        return this.category;
    }

    public final String component6() {
        return this.front_effect_id;
    }

    public final String component7() {
        return this.rear_effect_id;
    }

    public final List<String> component8() {
        return this.url_prefix;
    }

    public final QueryInfoStickerListModel copy(String str, String str2, List<InfoStickerEffect> list, List<InfoStickerEffect> list2, List<? extends EffectCategoryModel> list3, String str3, String str4, List<String> list4) {
        return new QueryInfoStickerListModel(str, str2, list, list2, list3, str3, str4, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryInfoStickerListModel)) {
            return false;
        }
        QueryInfoStickerListModel queryInfoStickerListModel = (QueryInfoStickerListModel) obj;
        return Intrinsics.areEqual(this.version, queryInfoStickerListModel.version) && Intrinsics.areEqual(this.panel, queryInfoStickerListModel.panel) && Intrinsics.areEqual(this.effects, queryInfoStickerListModel.effects) && Intrinsics.areEqual(this.collection, queryInfoStickerListModel.collection) && Intrinsics.areEqual(this.category, queryInfoStickerListModel.category) && Intrinsics.areEqual(this.front_effect_id, queryInfoStickerListModel.front_effect_id) && Intrinsics.areEqual(this.rear_effect_id, queryInfoStickerListModel.rear_effect_id) && Intrinsics.areEqual(this.url_prefix, queryInfoStickerListModel.url_prefix);
    }

    public int hashCode() {
        String str = this.version;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.panel;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list = this.effects;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list2 = this.collection;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<? extends EffectCategoryModel> list3 = this.category;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str3 = this.front_effect_id;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.rear_effect_id;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list4 = this.url_prefix;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "QueryInfoStickerListModel(version=" + this.version + ", panel=" + this.panel + ", effects=" + this.effects + ", collection=" + this.collection + ", category=" + this.category + ", front_effect_id=" + this.front_effect_id + ", rear_effect_id=" + this.rear_effect_id + ", url_prefix=" + this.url_prefix + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    public final List<EffectCategoryModel> getCategory() {
        return this.category;
    }

    public final List<InfoStickerEffect> getCollection() {
        return this.collection;
    }

    public final List<InfoStickerEffect> getEffects() {
        return this.effects;
    }

    public final String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setCategory(List<? extends EffectCategoryModel> list) {
        this.category = list;
    }

    public final void setCollection(List<InfoStickerEffect> list) {
        this.collection = list;
    }

    public final void setEffects(List<InfoStickerEffect> list) {
        this.effects = list;
    }

    public final void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public final void setPanel(String str) {
        this.panel = str;
    }

    public final void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public QueryInfoStickerListModel(String str, String str2, List<InfoStickerEffect> list, List<InfoStickerEffect> list2, List<? extends EffectCategoryModel> list3, String str3, String str4, List<String> list4) {
        this.version = str;
        this.panel = str2;
        this.effects = list;
        this.collection = list2;
        this.category = list3;
        this.front_effect_id = str3;
        this.rear_effect_id = str4;
        this.url_prefix = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ QueryInfoStickerListModel(java.lang.String r10, java.lang.String r11, java.util.List r12, java.util.List r13, java.util.List r14, java.lang.String r15, java.lang.String r16, java.util.List r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x000c
        L_0x000b:
            r1 = r10
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0014
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0015
        L_0x0014:
            r3 = r11
        L_0x0015:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            r4 = r2
            java.util.List r4 = (java.util.List) r4
            goto L_0x001e
        L_0x001d:
            r4 = r12
        L_0x001e:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0026
            r5 = r2
            java.util.List r5 = (java.util.List) r5
            goto L_0x0027
        L_0x0026:
            r5 = r13
        L_0x0027:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002f
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            goto L_0x0030
        L_0x002f:
            r6 = r14
        L_0x0030:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0038
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0039
        L_0x0038:
            r7 = r15
        L_0x0039:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0041
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0043
        L_0x0041:
            r8 = r16
        L_0x0043:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004b
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            goto L_0x004d
        L_0x004b:
            r0 = r17
        L_0x004d:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.net.QueryInfoStickerListModel.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
