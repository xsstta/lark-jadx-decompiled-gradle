package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010.\u001a\u00020/2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u00100\u001a\u00020/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00188V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00188V@VX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0006\u001a\u0004\u0018\u00010#8V@VX\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017¨\u00062"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/SearchEffectResponse;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/SearchEffectResponseTemplate;", "Ljava/io/Serializable;", "kSearchEffect", "Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;", "(Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "bindEffects", "getBindEffects", "()Ljava/util/List;", "setBindEffects", "(Ljava/util/List;)V", "Lcom/ss/ugc/effectplatform/model/Effect;", "bind_effects", "getBind_effects", "setBind_effects", "", "cursor", "getCursor", "()I", "setCursor", "(I)V", "", "hasMore", "getHasMore", "()Z", "setHasMore", "(Z)V", "has_more", "getHas_more", "setHas_more", "getKSearchEffect", "()Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;", "", "message", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "status_code", "getStatus_code", "setStatus_code", "getCollection", "getEffects", "setCollection", "", "setEffects", "effects", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SearchEffectResponse extends SearchEffectResponseTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect;

    public SearchEffectResponse() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public com.ss.ugc.effectplatform.model.net.SearchEffectResponse getKSearchEffect() {
        return this.kSearchEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public int getCursor() {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            return kSearchEffect2.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            return kSearchEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            return kSearchEffect2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public List<Effect> getBind_effects() {
        List<Effect> bind_effects;
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 == null || (bind_effects = kSearchEffect2.getBind_effects()) == null) {
            return super.getBind_effects();
        }
        return bind_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 == null || (message = kSearchEffect2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public void setBindEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setBindEffects(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public void setCollection(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCollection(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setCursor(int i) {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public void setEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "effects");
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setBind_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public SearchEffectResponse(com.ss.ugc.effectplatform.model.net.SearchEffectResponse searchEffectResponse) {
        super(searchEffectResponse);
        this.kSearchEffect = searchEffectResponse;
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            List<Effect> bind_effects = kSearchEffect2.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<Effect> collection_list = kSearchEffect2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            super.setCursor(kSearchEffect2.getCursor());
            List<Effect> effect_list = kSearchEffect2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            super.setHas_more(kSearchEffect2.getHas_more());
            String message = kSearchEffect2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kSearchEffect2.getStatus_code());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectResponse(com.ss.ugc.effectplatform.model.net.SearchEffectResponse searchEffectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchEffectResponse);
    }
}
