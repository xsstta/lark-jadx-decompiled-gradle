package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001VB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0016R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\t8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010#\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R(\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R$\u0010)\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R$\u0010-\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020,8V@VX\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020,8V@VX\u000e¢\u0006\f\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R$\u00105\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u0010\u0018R$\u00108\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010\u0018R(\u0010;\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\t8V@VX\u000e¢\u0006\f\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u0010\u001dR(\u0010>\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R0\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00130\b8V@VX\u000e¢\u0006\f\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR(\u0010D\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00138V@VX\u000e¢\u0006\f\u001a\u0004\bE\u0010\u0016\"\u0004\bF\u0010\u0018R(\u0010G\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00138V@VX\u000e¢\u0006\f\u001a\u0004\bH\u0010\u0016\"\u0004\bI\u0010\u0018R0\u0010J\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8V@VX\u000e¢\u0006\f\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR0\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8V@VX\u000e¢\u0006\f\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000e¨\u0006W"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectCategoryResponseTemplate;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "kCategoryResponse", "Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;", "(Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "collectionEffect", "getCollectionEffect", "()Ljava/util/List;", "setCollectionEffect", "(Ljava/util/List;)V", "Lcom/ss/ugc/effectplatform/model/Effect;", "collection_effect", "getCollection_effect", "setCollection_effect", "", "extra", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "frontEffect", "getFrontEffect", "()Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "setFrontEffect", "(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", "front_effect", "getFront_effect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "setFront_effect", "(Lcom/ss/ugc/effectplatform/model/Effect;)V", "icon_normal_url", "getIcon_normal_url", "setIcon_normal_url", "icon_selected_url", "getIcon_selected_url", "setIcon_selected_url", "id", "getId", "setId", "", "isDefault", "()Z", "setDefault", "(Z)V", "is_default", "set_default", "getKCategoryResponse", "()Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;", "key", "getKey", "setKey", "name", "getName", "setName", "rearEffect", "getRearEffect", "setRearEffect", "rear_effect", "getRear_effect", "setRear_effect", "tags", "getTags", "setTags", "tagsUpdateTime", "getTagsUpdateTime", "setTagsUpdateTime", "tags_update_time", "getTags_update_time", "setTags_update_time", "totalEffects", "getTotalEffects", "setTotalEffects", "total_effects", "getTotal_effects", "setTotal_effects", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class EffectCategoryResponse extends EffectCategoryResponseTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectCategoryResponse> CREATOR = new C60621b();
    public static final Companion Companion = new Companion(null);
    private final transient com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse;

    public EffectCategoryResponse() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse$b */
    public static final class C60621b implements Parcelable.Creator<EffectCategoryResponse> {
        C60621b() {
        }

        /* renamed from: a */
        public EffectCategoryResponse[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }

        /* renamed from: a */
        public EffectCategoryResponse createFromParcel(Parcel parcel) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            com.ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.EffectCategoryResponse.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.EffectCategoryResponse)) {
                    obj = null;
                }
                effectCategoryResponse = (com.ss.ugc.effectplatform.model.EffectCategoryResponse) obj;
            } catch (Exception e) {
                EPLog.m235177a("createFromParcel", "get creator failed!", e);
            }
            return new EffectCategoryResponse(effectCategoryResponse);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public com.ss.ugc.effectplatform.model.EffectCategoryResponse getKCategoryResponse() {
        return this.kCategoryResponse;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public List<Effect> getCollectionEffect() {
        return super.getCollectionEffect();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public Effect getFrontEffect() {
        return super.getFrontEffect();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public Effect getRearEffect() {
        return super.getRearEffect();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public String getTagsUpdateTime() {
        return super.getTagsUpdateTime();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public List<Effect> getTotalEffects() {
        return super.getTotalEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public boolean isDefault() {
        return super.isDefault();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public boolean is_default() {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            return kCategoryResponse2.is_default();
        }
        return super.is_default();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public List<Effect> getCollection_effect() {
        List<Effect> collection_effect;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (collection_effect = kCategoryResponse2.getCollection_effect()) == null) {
            return super.getCollection_effect();
        }
        return collection_effect;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (extra = kCategoryResponse2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public Effect getFront_effect() {
        Effect front_effect;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (front_effect = kCategoryResponse2.getFront_effect()) == null) {
            return super.getFront_effect();
        }
        return front_effect;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getIcon_normal_url() {
        String icon_normal_url;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (icon_normal_url = kCategoryResponse2.getIcon_normal_url()) == null) {
            return super.getIcon_normal_url();
        }
        return icon_normal_url;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getIcon_selected_url() {
        String icon_selected_url;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (icon_selected_url = kCategoryResponse2.getIcon_selected_url()) == null) {
            return super.getIcon_selected_url();
        }
        return icon_selected_url;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (id = kCategoryResponse2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getKey() {
        String key;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (key = kCategoryResponse2.getKey()) == null) {
            return super.getKey();
        }
        return key;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getName() {
        String name;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (name = kCategoryResponse2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public Effect getRear_effect() {
        Effect rear_effect;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (rear_effect = kCategoryResponse2.getRear_effect()) == null) {
            return super.getRear_effect();
        }
        return rear_effect;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (tags = kCategoryResponse2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getTags_update_time() {
        String tags_update_time;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (tags_update_time = kCategoryResponse2.getTags_update_time()) == null) {
            return super.getTags_update_time();
        }
        return tags_update_time;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public List<Effect> getTotal_effects() {
        List<Effect> total_effects;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (total_effects = kCategoryResponse2.getTotal_effects()) == null) {
            return super.getTotal_effects();
        }
        return total_effects;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setDefault(boolean z) {
        super.setDefault(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setFrontEffect(Effect effect) {
        super.setFrontEffect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setRearEffect(Effect effect) {
        super.setRearEffect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setTagsUpdateTime(String str) {
        super.setTagsUpdateTime(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setCollectionEffect(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCollectionEffect(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setFront_effect(Effect effect) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setIcon_normal_url(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setIcon_normal_url(str);
        }
        super.setIcon_normal_url(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setIcon_selected_url(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setIcon_selected_url(str);
        }
        super.setIcon_selected_url(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setRear_effect(Effect effect) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setTags_update_time(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTags_update_time(str);
        }
        super.setTags_update_time(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setTotalEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setTotalEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void set_default(boolean z) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.set_default(z);
        }
        super.set_default(z);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setCollection_effect(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setCollection_effect(list);
        }
        super.setCollection_effect(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setKey(str);
        }
        super.setKey(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setTags(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTags(list);
        }
        super.setTags(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setTotal_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTotal_effects(list);
        }
        super.setTotal_effects(list);
    }

    public EffectCategoryResponse(com.ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse) {
        super(effectCategoryResponse);
        this.kCategoryResponse = effectCategoryResponse;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            List<Effect> collection_effect = kCategoryResponse2.getCollection_effect();
            if (collection_effect != null) {
                super.setCollection_effect(collection_effect);
            }
            String extra = kCategoryResponse2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            Effect front_effect = kCategoryResponse2.getFront_effect();
            if (front_effect != null) {
                super.setFront_effect(front_effect);
            }
            String icon_normal_url = kCategoryResponse2.getIcon_normal_url();
            if (icon_normal_url != null) {
                super.setIcon_normal_url(icon_normal_url);
            }
            String icon_selected_url = kCategoryResponse2.getIcon_selected_url();
            if (icon_selected_url != null) {
                super.setIcon_selected_url(icon_selected_url);
            }
            String id = kCategoryResponse2.getId();
            if (id != null) {
                super.setId(id);
            }
            super.set_default(kCategoryResponse2.is_default());
            String key = kCategoryResponse2.getKey();
            if (key != null) {
                super.setKey(key);
            }
            String name = kCategoryResponse2.getName();
            if (name != null) {
                super.setName(name);
            }
            Effect rear_effect = kCategoryResponse2.getRear_effect();
            if (rear_effect != null) {
                super.setRear_effect(rear_effect);
            }
            List<String> tags = kCategoryResponse2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_update_time = kCategoryResponse2.getTags_update_time();
            if (tags_update_time != null) {
                super.setTags_update_time(tags_update_time);
            }
            List<Effect> total_effects = kCategoryResponse2.getTotal_effects();
            if (total_effects != null) {
                super.setTotal_effects(total_effects);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "dest");
        if (getKCategoryResponse() != null) {
            com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
            if (kCategoryResponse2 != null) {
                kCategoryResponse2.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryResponse(com.ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectCategoryResponse);
    }
}
