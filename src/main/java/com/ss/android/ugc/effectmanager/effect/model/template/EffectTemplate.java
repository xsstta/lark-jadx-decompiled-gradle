package com.ss.android.ugc.effectmanager.effect.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.ugc.effectplatform.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001gB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\b\u0010a\u001a\u00020%H\u0016J\u0018\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020%H\u0016R&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR6\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R&\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR&\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR&\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR&\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR&\u0010\"\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\fR&\u0010&\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020%8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u0010,\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020+8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R&\u00101\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\n\"\u0004\b3\u0010\fR&\u00104\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020+8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R&\u00107\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020%8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R&\u0010:\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020+8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R&\u0010=\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020+8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R&\u0010@\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\n\"\u0004\bB\u0010\fR&\u0010D\u001a\u00020C2\u0006\u0010\u0006\u001a\u00020C8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010H\u001a\u00020C2\u0006\u0010\u0006\u001a\u00020C8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010E\"\u0004\bI\u0010GR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR*\u0010L\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\n\"\u0004\bN\u0010\fR*\u0010O\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\n\"\u0004\bQ\u0010\fR&\u0010S\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020R8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR&\u0010X\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\n\"\u0004\bZ\u0010\fR&\u0010[\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\n\"\u0004\b]\u0010\fR&\u0010^\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\n\"\u0004\b`\u0010\f¨\u0006h"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate;", "Lcom/ss/ugc/effectplatform/model/Effect;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "kEffect", "(Lcom/ss/ugc/effectplatform/model/Effect;)V", "value", "", "adRawData", "getAdRawData", "()Ljava/lang/String;", "setAdRawData", "(Ljava/lang/String;)V", "", "bindIds", "getBindIds", "()Ljava/util/List;", "setBindIds", "(Ljava/util/List;)V", "childEffects_Own", "getChildEffects_Own", "setChildEffects_Own", "composerParams", "getComposerParams", "setComposerParams", "designerEncryptedId", "getDesignerEncryptedId", "setDesignerEncryptedId", "designerId", "getDesignerId", "setDesignerId", "devicePlatform", "getDevicePlatform", "setDevicePlatform", "effectId", "getEffectId", "setEffectId", "", "effectType", "getEffectType", "()I", "setEffectType", "(I)V", "Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "fileUrl", "getFileUrl", "()Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "setFileUrl", "(Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;)V", "gradeKey", "getGradeKey", "setGradeKey", "hintFile", "getHintFile", "setHintFile", "hintFileFormat", "getHintFileFormat", "setHintFileFormat", "hintIcon", "getHintIcon", "setHintIcon", "iconUrl", "getIconUrl", "setIconUrl", "iopId", "getIopId", "setIopId", "", "isBusiness", "()Z", "setBusiness", "(Z)V", "isIsIop", "setIsIop", "getKEffect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "modelNames", "getModelNames", "setModelNames", "parentId", "getParentId", "setParentId", "", "publishTime", "getPublishTime", "()J", "setPublishTime", "(J)V", "resourceId", "getResourceId", "setResourceId", "sdkExtra", "getSdkExtra", "setSdkExtra", "tagsUpdatedAt", "getTagsUpdatedAt", "setTagsUpdatedAt", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CREATOR", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public class EffectTemplate extends Effect implements Parcelable, Serializable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private String adRawData;
    private List<String> bindIds;
    private List<? extends EffectTemplate> childEffects_Own;
    private String composerParams;
    private String designerEncryptedId;
    private String designerId;
    private String devicePlatform;
    private String effectId;
    private int effectType;
    private UrlModel fileUrl;
    private String gradeKey;
    private UrlModel hintFile;
    private int hintFileFormat;
    private UrlModel hintIcon;
    private UrlModel iconUrl;
    private String iopId;
    private boolean isBusiness;
    private boolean isIsIop;
    private final transient Effect kEffect;
    private String modelNames;
    private String parentId;
    private long publishTime;
    private String resourceId;
    private String sdkExtra;
    private String tagsUpdatedAt;

    public EffectTemplate() {
        this(null, 1, null);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate$a */
    public static final class CREATOR implements Parcelable.Creator<EffectTemplate> {
        private CREATOR() {
        }

        /* renamed from: a */
        public EffectTemplate[] newArray(int i) {
            return new EffectTemplate[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public EffectTemplate createFromParcel(Parcel parcel) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            Effect effect = null;
            try {
                Object obj2 = Effect.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof Effect)) {
                    obj = null;
                }
                effect = (Effect) obj;
            } catch (Exception unused) {
            }
            return new EffectTemplate(effect);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate>, java.util.List<com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate> */
    public final List<EffectTemplate> getChildEffects_Own() {
        return this.childEffects_Own;
    }

    public Effect getKEffect() {
        return this.kEffect;
    }

    public int getEffectType() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getEffect_type();
        }
        return super.getEffect_type();
    }

    public int getHintFileFormat() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getHint_file_format();
        }
        return super.getHint_file_format();
    }

    public long getPublishTime() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getPtime();
        }
        return super.getPtime();
    }

    public boolean isBusiness() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.is_busi();
        }
        return super.is_busi();
    }

    public boolean isIsIop() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.is_iop();
        }
        return super.is_iop();
    }

    public String getAdRawData() {
        String ad_raw_data;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (ad_raw_data = kEffect2.getAd_raw_data()) == null) {
            return super.getAd_raw_data();
        }
        return ad_raw_data;
    }

    public List<String> getBindIds() {
        List<String> bind_ids;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (bind_ids = kEffect2.getBind_ids()) == null) {
            return super.getBind_ids();
        }
        return bind_ids;
    }

    public String getComposerParams() {
        String composer_params;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (composer_params = kEffect2.getComposer_params()) == null) {
            return super.getComposer_params();
        }
        return composer_params;
    }

    public String getDesignerEncryptedId() {
        String designer_encrypted_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (designer_encrypted_id = kEffect2.getDesigner_encrypted_id()) == null) {
            return super.getDesigner_encrypted_id();
        }
        return designer_encrypted_id;
    }

    public String getDesignerId() {
        String designer_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (designer_id = kEffect2.getDesigner_id()) == null) {
            return super.getDesigner_id();
        }
        return designer_id;
    }

    public String getDevicePlatform() {
        String device_platform;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (device_platform = kEffect2.getDevice_platform()) == null) {
            return super.getDevice_platform();
        }
        return device_platform;
    }

    public String getEffectId() {
        String effect_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (effect_id = kEffect2.getEffect_id()) == null) {
            return super.getEffect_id();
        }
        return effect_id;
    }

    public String getGradeKey() {
        String grade_key;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (grade_key = kEffect2.getGrade_key()) == null) {
            return super.getGrade_key();
        }
        return grade_key;
    }

    public String getIopId() {
        String iop_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (iop_id = kEffect2.getIop_id()) == null) {
            return super.getIop_id();
        }
        return iop_id;
    }

    public String getModelNames() {
        String model_names;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (model_names = kEffect2.getModel_names()) == null) {
            return super.getModel_names();
        }
        return model_names;
    }

    public String getParentId() {
        String parent;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (parent = kEffect2.getParent()) == null) {
            return super.getParent();
        }
        return parent;
    }

    public String getResourceId() {
        String resource_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (resource_id = kEffect2.getResource_id()) == null) {
            return super.getResource_id();
        }
        return resource_id;
    }

    public String getSdkExtra() {
        String sdk_extra;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (sdk_extra = kEffect2.getSdk_extra()) == null) {
            return super.getSdk_extra();
        }
        return sdk_extra;
    }

    public String getTagsUpdatedAt() {
        String tags_updated_at;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (tags_updated_at = kEffect2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    public UrlModel getFileUrl() {
        com.ss.ugc.effectplatform.model.UrlModel urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (urlModel = kEffect2.getFile_url()) == null) {
            urlModel = super.getFile_url();
        }
        if (urlModel instanceof UrlModel) {
            return (UrlModel) urlModel;
        }
        UrlModel urlModel2 = new UrlModel(urlModel);
        Effect kEffect3 = getKEffect();
        if (kEffect3 != null) {
            kEffect3.setFile_url(urlModel2);
        }
        super.setFile_url(urlModel2);
        return urlModel2;
    }

    public UrlModel getHintFile() {
        com.ss.ugc.effectplatform.model.UrlModel urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (urlModel = kEffect2.getHint_file()) == null) {
            urlModel = super.getHint_file();
        }
        if (urlModel instanceof UrlModel) {
            return (UrlModel) urlModel;
        }
        UrlModel urlModel2 = new UrlModel(urlModel);
        Effect kEffect3 = getKEffect();
        if (kEffect3 != null) {
            kEffect3.setHint_file(urlModel2);
        }
        super.setHint_file(urlModel2);
        return urlModel2;
    }

    public UrlModel getHintIcon() {
        com.ss.ugc.effectplatform.model.UrlModel urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (urlModel = kEffect2.getHint_icon()) == null) {
            urlModel = super.getHint_icon();
        }
        if (urlModel instanceof UrlModel) {
            return (UrlModel) urlModel;
        }
        UrlModel urlModel2 = new UrlModel(urlModel);
        Effect kEffect3 = getKEffect();
        if (kEffect3 != null) {
            kEffect3.setHint_icon(urlModel2);
        }
        super.setHint_icon(urlModel2);
        return urlModel2;
    }

    public UrlModel getIconUrl() {
        com.ss.ugc.effectplatform.model.UrlModel urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (urlModel = kEffect2.getIcon_url()) == null) {
            urlModel = super.getIcon_url();
        }
        if (urlModel instanceof UrlModel) {
            return (UrlModel) urlModel;
        }
        UrlModel urlModel2 = new UrlModel(urlModel);
        Effect kEffect3 = getKEffect();
        if (kEffect3 != null) {
            kEffect3.setIcon_url(urlModel2);
        }
        super.setIcon_url(urlModel2);
        return urlModel2;
    }

    public final void setChildEffects_Own(List<? extends EffectTemplate> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.childEffects_Own = list;
    }

    public void setAdRawData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.adRawData = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setAd_raw_data(str);
                return;
            }
            return;
        }
        super.setAd_raw_data(str);
    }

    public void setBindIds(List<String> list) {
        this.bindIds = list;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setBind_ids(list);
                return;
            }
            return;
        }
        super.setBind_ids(list);
    }

    public void setBusiness(boolean z) {
        this.isBusiness = z;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.set_busi(z);
                return;
            }
            return;
        }
        super.set_busi(z);
    }

    public void setComposerParams(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.composerParams = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setComposer_params(str);
                return;
            }
            return;
        }
        super.setComposer_params(str);
    }

    public void setDesignerEncryptedId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.designerEncryptedId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setDesigner_encrypted_id(str);
                return;
            }
            return;
        }
        super.setDesigner_encrypted_id(str);
    }

    public void setDesignerId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.designerId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setDesigner_id(str);
                return;
            }
            return;
        }
        super.setDesigner_id(str);
    }

    public void setDevicePlatform(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.devicePlatform = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setDevice_platform(str);
                return;
            }
            return;
        }
        super.setDevice_platform(str);
    }

    public void setEffectId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.effectId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setEffect_id(str);
                return;
            }
            return;
        }
        super.setEffect_id(str);
    }

    public void setEffectType(int i) {
        this.effectType = i;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setEffect_type(i);
                return;
            }
            return;
        }
        super.setEffect_type(i);
    }

    public void setFileUrl(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        this.fileUrl = urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setFile_url(urlModel);
        }
        super.setFile_url(urlModel);
    }

    public void setGradeKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.gradeKey = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setGrade_key(str);
                return;
            }
            return;
        }
        super.setGrade_key(str);
    }

    public void setHintFile(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        this.hintFile = urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_file(urlModel);
        }
        super.setHint_file(urlModel);
    }

    public void setHintFileFormat(int i) {
        this.hintFileFormat = i;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setHint_file_format(i);
                return;
            }
            return;
        }
        super.setHint_file_format(i);
    }

    public void setHintIcon(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        this.hintIcon = urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_icon(urlModel);
        }
        super.setHint_icon(urlModel);
    }

    public void setIconUrl(UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(urlModel, "value");
        this.iconUrl = urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setIcon_url(urlModel);
        }
        super.setIcon_url(urlModel);
    }

    public void setIopId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.iopId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setIop_id(str);
                return;
            }
            return;
        }
        super.setIop_id(str);
    }

    public void setIsIop(boolean z) {
        this.isIsIop = z;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.set_iop(z);
                return;
            }
            return;
        }
        super.set_iop(z);
    }

    public void setModelNames(String str) {
        this.modelNames = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setModel_names(str);
                return;
            }
            return;
        }
        super.setModel_names(str);
    }

    public void setParentId(String str) {
        this.parentId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setParent(str);
                return;
            }
            return;
        }
        super.setParent(str);
    }

    public void setPublishTime(long j) {
        this.publishTime = j;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setPtime(j);
                return;
            }
            return;
        }
        super.setPtime(j);
    }

    public void setResourceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.resourceId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setResource_id(str);
                return;
            }
            return;
        }
        super.setResource_id(str);
    }

    public void setSdkExtra(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.sdkExtra = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setSdk_extra(str);
                return;
            }
            return;
        }
        super.setSdk_extra(str);
    }

    public void setTagsUpdatedAt(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.tagsUpdatedAt = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setTags_updated_at(str);
                return;
            }
            return;
        }
        super.setTags_updated_at(str);
    }

    public EffectTemplate(Effect effect) {
        super(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, -1, 16383, null);
        this.kEffect = effect;
        this.effectId = "";
        this.fileUrl = new UrlModel(null, 1, null);
        this.iconUrl = new UrlModel(null, 1, null);
        this.hintIcon = new UrlModel(null, 1, null);
        this.hintFile = new UrlModel(null, 1, null);
        this.tagsUpdatedAt = "";
        this.childEffects_Own = new ArrayList();
        this.designerId = "";
        this.designerEncryptedId = "";
        this.sdkExtra = "";
        this.adRawData = "";
        this.iopId = "";
        this.resourceId = "";
        this.gradeKey = "";
        this.devicePlatform = "";
        this.composerParams = "";
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectTemplate(Effect effect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effect);
    }
}
