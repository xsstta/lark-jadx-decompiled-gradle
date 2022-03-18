package com.ss.ugc.effectplatform.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0017\u0018\u00002\u00020\u0001B\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 ¨\u0006+"}, d2 = {"Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "", "panel", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "front_effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "rear_effect", "all_category_effects", "", "category_responses", "Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;", "panel_model", "Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "collection_list", "url_prefix", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/Effect;Lcom/ss/ugc/effectplatform/model/Effect;Ljava/util/List;Ljava/util/List;Lcom/ss/ugc/effectplatform/model/EffectPanelModel;Ljava/util/List;Ljava/util/List;)V", "getAll_category_effects", "()Ljava/util/List;", "setAll_category_effects", "(Ljava/util/List;)V", "getCategory_responses", "setCategory_responses", "getCollection_list", "setCollection_list", "getFront_effect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "setFront_effect", "(Lcom/ss/ugc/effectplatform/model/Effect;)V", "getPanel", "()Ljava/lang/String;", "setPanel", "(Ljava/lang/String;)V", "getPanel_model", "()Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "setPanel_model", "(Lcom/ss/ugc/effectplatform/model/EffectPanelModel;)V", "getRear_effect", "setRear_effect", "getUrl_prefix", "setUrl_prefix", "getVersion", "setVersion", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EffectChannelResponse {
    private List<? extends Effect> all_category_effects;
    private List<? extends EffectCategoryResponse> category_responses;
    private List<? extends Effect> collection_list;
    private Effect front_effect;
    private String panel;
    private EffectPanelModel panel_model;
    private Effect rear_effect;
    private List<String> url_prefix;
    private String version;

    public EffectChannelResponse() {
        this(null, null, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getAll_category_effects() {
        return this.all_category_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryResponse>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryResponse> */
    public List<EffectCategoryResponse> getCategory_responses() {
        return this.category_responses;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getCollection_list() {
        return this.collection_list;
    }

    public Effect getFront_effect() {
        return this.front_effect;
    }

    public String getPanel() {
        return this.panel;
    }

    public EffectPanelModel getPanel_model() {
        return this.panel_model;
    }

    public Effect getRear_effect() {
        return this.rear_effect;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setAll_category_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.all_category_effects = list;
    }

    public void setCategory_responses(List<? extends EffectCategoryResponse> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.category_responses = list;
    }

    public void setCollection_list(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.collection_list = list;
    }

    public void setPanel_model(EffectPanelModel effectPanelModel) {
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "<set-?>");
        this.panel_model = effectPanelModel;
    }

    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.url_prefix = list;
    }

    public EffectChannelResponse(String str, String str2, Effect effect, Effect effect2, List<? extends Effect> list, List<? extends EffectCategoryResponse> list2, EffectPanelModel effectPanelModel, List<? extends Effect> list3, List<String> list4) {
        Intrinsics.checkParameterIsNotNull(list, "all_category_effects");
        Intrinsics.checkParameterIsNotNull(list2, "category_responses");
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "panel_model");
        Intrinsics.checkParameterIsNotNull(list3, "collection_list");
        Intrinsics.checkParameterIsNotNull(list4, "url_prefix");
        this.panel = str;
        this.version = str2;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.all_category_effects = list;
        this.category_responses = list2;
        this.panel_model = effectPanelModel;
        this.collection_list = list3;
        this.url_prefix = list4;
        getPanel_model().setId(getPanel());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EffectChannelResponse(java.lang.String r18, java.lang.String r19, com.ss.ugc.effectplatform.model.Effect r20, com.ss.ugc.effectplatform.model.Effect r21, java.util.List r22, java.util.List r23, com.ss.ugc.effectplatform.model.EffectPanelModel r24, java.util.List r25, java.util.List r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.EffectChannelResponse.<init>(java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.Effect, com.ss.ugc.effectplatform.model.Effect, java.util.List, java.util.List, com.ss.ugc.effectplatform.model.EffectPanelModel, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
