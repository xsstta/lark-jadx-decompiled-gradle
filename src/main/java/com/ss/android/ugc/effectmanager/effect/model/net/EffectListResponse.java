package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010(\u001a\u00020)2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010*\u001a\u00020)2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u00148V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u001a8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\r¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/net/EffectListResponse;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectListResponseTemplate;", "Ljava/io/Serializable;", "kEffectList", "Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "(Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "bindEffects", "getBindEffects", "()Ljava/util/List;", "setBindEffects", "(Ljava/util/List;)V", "Lcom/ss/ugc/effectplatform/model/Effect;", "bind_effects", "getBind_effects", "setBind_effects", "getKEffectList", "()Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "", "message", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "", "status_code", "getStatus_code", "()I", "setStatus_code", "(I)V", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "url_prefix", "getUrl_prefix", "setUrl_prefix", "getCollection", "getData", "setCollection", "", "setData", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class EffectListResponse extends EffectListResponseTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList;

    public EffectListResponse() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public com.ss.ugc.effectplatform.model.net.EffectListResponse getKEffectList() {
        return this.kEffectList;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public List<Effect> getData() {
        return super.getData();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            return kEffectList2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getBind_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> bind_effects;
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 == null || (bind_effects = kEffectList2.getBind_effects()) == null) {
            return super.getBind_effects();
        }
        return bind_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 == null || (message = kEffectList2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 == null || (url_prefix = kEffectList2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public void setBindEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setBindEffects(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public void setCollection(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCollection(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public void setData(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setData(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setUrlPrefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public void setBind_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectListResponse(com.ss.ugc.effectplatform.model.net.EffectListResponse effectListResponse) {
        super(effectListResponse);
        this.kEffectList = effectListResponse;
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            List<com.ss.ugc.effectplatform.model.Effect> bind_effects = kEffectList2.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<com.ss.ugc.effectplatform.model.Effect> collection_list = kEffectList2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            List<com.ss.ugc.effectplatform.model.Effect> effect_list = kEffectList2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            String message = kEffectList2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kEffectList2.getStatus_code());
            List<String> url_prefix = kEffectList2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectListResponse(com.ss.ugc.effectplatform.model.net.EffectListResponse effectListResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectListResponse);
    }
}
