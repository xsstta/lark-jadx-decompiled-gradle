package com.ss.ugc.effectplatform.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0017\u0018\u00002\u00020\u0001:\u0001-Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&¨\u0006."}, d2 = {"Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "category_list", "", "Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "category_effects", "Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "panel", "Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "front_effect_id", "rear_effect_id", "url_prefix", "extra", "Lcom/ss/ugc/effectplatform/model/PanelInfoModel$Extra;", "(Ljava/lang/String;Ljava/util/List;Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;Lcom/ss/ugc/effectplatform/model/EffectPanelModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ss/ugc/effectplatform/model/PanelInfoModel$Extra;)V", "getCategory_effects", "()Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "setCategory_effects", "(Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;)V", "getCategory_list", "()Ljava/util/List;", "setCategory_list", "(Ljava/util/List;)V", "value", "effect_panel", "getEffect_panel", "()Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "setEffect_panel", "(Lcom/ss/ugc/effectplatform/model/EffectPanelModel;)V", "getExtra", "()Lcom/ss/ugc/effectplatform/model/PanelInfoModel$Extra;", "setExtra", "(Lcom/ss/ugc/effectplatform/model/PanelInfoModel$Extra;)V", "getFront_effect_id", "()Ljava/lang/String;", "setFront_effect_id", "(Ljava/lang/String;)V", "getRear_effect_id", "setRear_effect_id", "getUrl_prefix", "setUrl_prefix", "getVersion", "setVersion", "Extra", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class PanelInfoModel {
    private CategoryEffectModel category_effects;
    private List<? extends EffectCategoryModel> category_list;
    private Extra extra;
    private String front_effect_id;
    private EffectPanelModel panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    public PanelInfoModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/ugc/effectplatform/model/PanelInfoModel$Extra;", "", "()V", "rec_id", "", "getRec_id", "()Ljava/lang/String;", "setRec_id", "(Ljava/lang/String;)V", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Extra {
        private String rec_id = "";

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setRec_id(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.rec_id = str;
        }
    }

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    public List<EffectCategoryModel> getCategory_list() {
        return this.category_list;
    }

    public final EffectPanelModel getEffect_panel() {
        return this.panel;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setEffect_panel(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public final void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setCategory_list(List<? extends EffectCategoryModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.category_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.version = str;
    }

    public PanelInfoModel(String str, List<? extends EffectCategoryModel> list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str2, String str3, List<String> list2, Extra extra2) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(list, "category_list");
        Intrinsics.checkParameterIsNotNull(list2, "url_prefix");
        this.version = str;
        this.category_list = list;
        this.category_effects = categoryEffectModel;
        this.panel = effectPanelModel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.url_prefix = list2;
        this.extra = extra2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PanelInfoModel(java.lang.String r10, java.util.List r11, com.ss.ugc.effectplatform.model.CategoryEffectModel r12, com.ss.ugc.effectplatform.model.EffectPanelModel r13, java.lang.String r14, java.lang.String r15, java.util.List r16, com.ss.ugc.effectplatform.model.PanelInfoModel.Extra r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0016
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            goto L_0x0017
        L_0x0016:
            r2 = r11
        L_0x0017:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0020
            r3 = r4
            com.ss.ugc.effectplatform.model.CategoryEffectModel r3 = (com.ss.ugc.effectplatform.model.CategoryEffectModel) r3
            goto L_0x0021
        L_0x0020:
            r3 = r12
        L_0x0021:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0029
            r5 = r4
            com.ss.ugc.effectplatform.model.EffectPanelModel r5 = (com.ss.ugc.effectplatform.model.EffectPanelModel) r5
            goto L_0x002a
        L_0x0029:
            r5 = r13
        L_0x002a:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0032
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0033
        L_0x0032:
            r6 = r14
        L_0x0033:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003b
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x003c
        L_0x003b:
            r7 = r15
        L_0x003c:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0048
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r8 = (java.util.List) r8
            goto L_0x004a
        L_0x0048:
            r8 = r16
        L_0x004a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0052
            r0 = r4
            com.ss.ugc.effectplatform.model.PanelInfoModel$Extra r0 = (com.ss.ugc.effectplatform.model.PanelInfoModel.Extra) r0
            goto L_0x0054
        L_0x0052:
            r0 = r17
        L_0x0054:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.PanelInfoModel.<init>(java.lang.String, java.util.List, com.ss.ugc.effectplatform.model.CategoryEffectModel, com.ss.ugc.effectplatform.model.EffectPanelModel, java.lang.String, java.lang.String, java.util.List, com.ss.ugc.effectplatform.model.PanelInfoModel$Extra, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
