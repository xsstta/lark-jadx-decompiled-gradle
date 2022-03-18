package com.ss.ugc.effectplatform.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u000fJ\u0006\u0010+\u001a\u00020,R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u000e¢\u0006\u0002\n\u0000R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F@FX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R$\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001f¨\u0006-"}, d2 = {"Lcom/ss/ugc/effectplatform/model/EffectChannelModel;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "effects", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "category", "Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "panel", "Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "front_effect_id", "rear_effect_id", "collection", "url_prefix", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/ss/ugc/effectplatform/model/EffectPanelModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "value", "category_list", "getCategory_list", "()Ljava/util/List;", "setCategory_list", "(Ljava/util/List;)V", "collection_list", "getCollection_list", "setCollection_list", "effect_list", "getEffect_list", "setEffect_list", "getFront_effect_id", "()Ljava/lang/String;", "setFront_effect_id", "(Ljava/lang/String;)V", "panel_model", "getPanel_model", "()Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "setPanel_model", "(Lcom/ss/ugc/effectplatform/model/EffectPanelModel;)V", "getRear_effect_id", "setRear_effect_id", "getUrl_prefix", "setUrl_prefix", "getVersion", "setVersion", "checkValued", "", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EffectChannelModel {
    private List<? extends EffectCategoryModel> category;
    private List<? extends Effect> collection;
    private List<? extends Effect> effects;
    private String front_effect_id;
    private EffectPanelModel panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    public EffectChannelModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    public final List<EffectCategoryModel> getCategory_list() {
        return this.category;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final EffectPanelModel getPanel_model() {
        return this.panel;
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

    public final boolean checkValued() {
        return getPanel_model().checkValued();
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public final void setCategory_list(List<? extends EffectCategoryModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.category = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.collection = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.effects = list;
    }

    public final void setPanel_model(EffectPanelModel effectPanelModel) {
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "value");
        this.panel = effectPanelModel;
    }

    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.url_prefix = list;
    }

    public EffectChannelModel(String str, List<? extends Effect> list, List<? extends EffectCategoryModel> list2, EffectPanelModel effectPanelModel, String str2, String str3, List<? extends Effect> list3, List<String> list4) {
        Intrinsics.checkParameterIsNotNull(list, "effects");
        Intrinsics.checkParameterIsNotNull(list2, "category");
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "panel");
        Intrinsics.checkParameterIsNotNull(list3, "collection");
        Intrinsics.checkParameterIsNotNull(list4, "url_prefix");
        this.version = str;
        this.effects = list;
        this.category = list2;
        this.panel = effectPanelModel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.collection = list3;
        this.url_prefix = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EffectChannelModel(java.lang.String r16, java.util.List r17, java.util.List r18, com.ss.ugc.effectplatform.model.EffectPanelModel r19, java.lang.String r20, java.lang.String r21, java.util.List r22, java.util.List r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.EffectChannelModel.<init>(java.lang.String, java.util.List, java.util.List, com.ss.ugc.effectplatform.model.EffectPanelModel, java.lang.String, java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
