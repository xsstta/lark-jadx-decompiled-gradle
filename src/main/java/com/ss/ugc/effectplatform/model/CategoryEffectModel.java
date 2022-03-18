package com.ss.ugc.effectplatform.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0017\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\u000fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001b¨\u0006*"}, d2 = {"Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "", "category_key", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "has_more", "", "cursor", "", "sorting_position", "collection", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "effects", "bind_effects", "(Ljava/lang/String;Ljava/lang/String;ZIILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBind_effects", "()Ljava/util/List;", "setBind_effects", "(Ljava/util/List;)V", "value", "category_effects", "getCategory_effects", "setCategory_effects", "getCategory_key", "()Ljava/lang/String;", "setCategory_key", "(Ljava/lang/String;)V", "getCollection", "setCollection", "getCursor", "()I", "setCursor", "(I)V", "getHas_more", "()Z", "setHas_more", "(Z)V", "getSorting_position", "setSorting_position", "getVersion", "setVersion", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class CategoryEffectModel {
    private List<? extends Effect> bind_effects;
    private String category_key;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private int sorting_position;
    private String version;

    public CategoryEffectModel() {
        this(null, null, false, 0, 0, null, null, null, 255, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCategory_effects() {
        return this.effects;
    }

    public String getCategory_key() {
        return this.category_key;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getCollection() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public int getSorting_position() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSorting_position(int i) {
        this.sorting_position = i;
    }

    public void setBind_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCategory_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.effects = list;
    }

    public void setCategory_key(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.category_key = str;
    }

    public void setCollection(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.collection = list;
    }

    public void setVersion(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.version = str;
    }

    public CategoryEffectModel(String str, String str2, boolean z, int i, int i2, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3) {
        Intrinsics.checkParameterIsNotNull(str, "category_key");
        Intrinsics.checkParameterIsNotNull(str2, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(list, "collection");
        Intrinsics.checkParameterIsNotNull(list2, "effects");
        Intrinsics.checkParameterIsNotNull(list3, "bind_effects");
        this.category_key = str;
        this.version = str2;
        this.has_more = z;
        this.cursor = i;
        this.sorting_position = i2;
        this.collection = list;
        this.effects = list2;
        this.bind_effects = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CategoryEffectModel(java.lang.String r9, java.lang.String r10, boolean r11, int r12, int r13, java.util.List r14, java.util.List r15, java.util.List r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r9
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r2 = r10
        L_0x0011:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0018
            r3 = 0
            goto L_0x0019
        L_0x0018:
            r3 = r11
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = 0
            goto L_0x0020
        L_0x001f:
            r5 = r12
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = r13
        L_0x0026:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0032
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            goto L_0x0033
        L_0x0032:
            r6 = r14
        L_0x0033:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x003f
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r7 = (java.util.List) r7
            goto L_0x0040
        L_0x003f:
            r7 = r15
        L_0x0040:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            goto L_0x004e
        L_0x004c:
            r0 = r16
        L_0x004e:
            r9 = r8
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r5
            r14 = r4
            r15 = r6
            r16 = r7
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.CategoryEffectModel.<init>(java.lang.String, java.lang.String, boolean, int, int, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
