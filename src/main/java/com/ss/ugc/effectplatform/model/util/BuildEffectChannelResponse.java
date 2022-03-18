package com.ss.ugc.effectplatform.model.util;

import bytekn.foundation.logger.Logger;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.util.EffectUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002J*\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002J(\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/ugc/effectplatform/model/util/BuildEffectChannelResponse;", "", "panel", "", "fileDirectory", "isCache", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "buildChannelResponse", "Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "channelModel", "Lcom/ss/ugc/effectplatform/model/EffectChannelModel;", "getCategoryAllEffects", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "categoryModel", "Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "effectMap", "", "getChildEffect", "", "allEffect", "getEffect", "effectId", "initCategory", "Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.a.a */
public final class BuildEffectChannelResponse {

    /* renamed from: a */
    public static final Companion f164934a = new Companion(null);

    /* renamed from: b */
    private final String f164935b;

    /* renamed from: c */
    private final String f164936c;

    /* renamed from: d */
    private final boolean f164937d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/model/util/BuildEffectChannelResponse$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.model.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final EffectChannelResponse mo227898a(EffectChannelModel effectChannelModel) {
        Intrinsics.checkParameterIsNotNull(effectChannelModel, "channelModel");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Effect effect : effectChannelModel.getEffect_list()) {
            hashMap.put(effect.getEffect_id(), effect);
        }
        for (Effect effect2 : effectChannelModel.getCollection_list()) {
            hashMap2.put(effect2.getEffect_id(), effect2);
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        effectChannelResponse.setPanel(this.f164935b);
        effectChannelResponse.setVersion(effectChannelModel.getVersion());
        effectChannelResponse.setAll_category_effects(effectChannelModel.getEffect_list());
        effectChannelResponse.setCollection_list(effectChannelModel.getCollection_list());
        effectChannelResponse.setUrl_prefix(effectChannelModel.getUrl_prefix());
        effectChannelResponse.setCategory_responses(m256858a(effectChannelModel, hashMap));
        m256859a(effectChannelModel.getEffect_list(), hashMap2);
        effectChannelResponse.setPanel_model(effectChannelModel.getPanel_model());
        effectChannelResponse.setFront_effect(m256856a(effectChannelModel.getFront_effect_id(), hashMap));
        effectChannelResponse.setRear_effect(m256856a(effectChannelModel.getRear_effect_id(), hashMap));
        if (!this.f164937d) {
            EffectUtils.f165112a.mo228312a(this.f164936c, this.f164935b, effectChannelModel.getEffect_list());
            EffectUtils.f165112a.mo228312a(this.f164936c, this.f164935b, effectChannelModel.getCollection_list());
        }
        return effectChannelResponse;
    }

    /* renamed from: a */
    private final Effect m256856a(String str, Map<String, ? extends Effect> map) {
        if (str != null) {
            return (Effect) map.get(str);
        }
        return null;
    }

    /* renamed from: a */
    private final List<Effect> m256857a(EffectCategoryModel effectCategoryModel, Map<String, ? extends Effect> map) {
        ArrayList arrayList = new ArrayList();
        if (effectCategoryModel.getEffects() == null) {
            Logger.f5760a.mo8662a("BuildEffectChannelResponse", "categoryModel is null");
        }
        List<String> effects = effectCategoryModel.getEffects();
        if (effects != null) {
            for (String str : effects) {
                Effect effect = (Effect) map.get(str);
                if (effect != null) {
                    arrayList.add(effect);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m256859a(List<? extends Effect> list, Map<String, ? extends Effect> map) {
        for (Effect effect : list) {
            if (effect.getEffect_type() == 1) {
                ArrayList arrayList = new ArrayList();
                ArrayList children = effect.getChildren();
                if (children == null) {
                    children = new ArrayList();
                }
                for (String str : children) {
                    Effect effect2 = (Effect) map.get(str);
                    if (effect2 != null) {
                        arrayList.add(effect2);
                    }
                }
                effect.setChild_effects(arrayList);
            }
        }
    }

    /* renamed from: a */
    private final List<EffectCategoryResponse> m256858a(EffectChannelModel effectChannelModel, Map<String, ? extends Effect> map) {
        List<String> url_list;
        List<String> url_list2;
        List<String> url_list3;
        List<String> url_list4;
        ArrayList arrayList = new ArrayList();
        if (!effectChannelModel.getCategory_list().isEmpty()) {
            for (EffectCategoryModel effectCategoryModel : effectChannelModel.getCategory_list()) {
                String str = null;
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
                effectCategoryResponse.setId(effectCategoryModel.getId());
                effectCategoryResponse.setName(effectCategoryModel.getName());
                effectCategoryResponse.setKey(effectCategoryModel.getKey());
                UrlModel icon = effectCategoryModel.getIcon();
                if (!(icon == null || (url_list3 = icon.getUrl_list()) == null || !(!url_list3.isEmpty()))) {
                    UrlModel icon2 = effectCategoryModel.getIcon();
                    effectCategoryResponse.setIcon_normal_url((icon2 == null || (url_list4 = icon2.getUrl_list()) == null) ? null : url_list4.get(0));
                }
                UrlModel icon_selected = effectCategoryModel.getIcon_selected();
                if (icon_selected != null && (url_list = icon_selected.getUrl_list()) != null) {
                    if (!url_list.isEmpty()) {
                        UrlModel icon_selected2 = effectCategoryModel.getIcon_selected();
                        if (!(icon_selected2 == null || (url_list2 = icon_selected2.getUrl_list()) == null)) {
                            str = url_list2.get(0);
                        }
                        effectCategoryResponse.setIcon_selected_url(str);
                    }
                }
                effectCategoryResponse.setTotal_effects(m256857a(effectCategoryModel, map));
                effectCategoryResponse.setTags(effectCategoryModel.getTags());
                effectCategoryResponse.setTags_update_time(effectCategoryModel.getTags_updated_at());
                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    public BuildEffectChannelResponse(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "panel");
        Intrinsics.checkParameterIsNotNull(str2, "fileDirectory");
        this.f164935b = str;
        this.f164936c = str2;
        this.f164937d = z;
    }
}
