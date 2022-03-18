package com.ss.ugc.effectplatform.model.net;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0013\u0010$\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010(\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u0011R\u0013\u0010*\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b+\u0010\u0011R\u0013\u0010,\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0013\u0010.\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0013\u00100\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b1\u0010'R\u0013\u00102\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b3\u0010'R\u0011\u00104\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b5\u0010\u0011R\u0013\u00106\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b7\u0010\u0011R\u0013\u00108\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b8\u0010:R\u0013\u0010;\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0013\u0010<\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0013\u0010=\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b>\u0010!R \u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010C\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bD\u0010\u0011R\u0013\u0010E\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bF\u0010\u0011R\u0019\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bH\u0010\u0007R\u0013\u0010I\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0011R\u0013\u0010K\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bL\u0010\u0011R\u0013\u0010M\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bN\u0010\u0011R\u0013\u0010O\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bP\u0010\u0011R\u0013\u0010Q\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0013\u0010U\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bV\u0010\u0011R\u0019\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bX\u0010\u0007R\u0019\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0007R\u0013\u0010[\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\\\u0010\u0011R\u0013\u0010]\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b^\u0010\u0011R\u0013\u0010_\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b`\u0010\u0011R\u001e\u0010a\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0010\n\u0002\u0010e\u001a\u0004\bb\u0010!\"\u0004\bc\u0010dR \u0010g\u001a\u00020f2\u0006\u0010?\u001a\u00020f8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u0010j\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0019\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bo\u0010\u0007R\u0013\u0010p\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bq\u0010\u0011R\u0013\u0010r\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bs\u0010mR\u0013\u0010t\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bu\u0010\u0011R\u0019\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bw\u0010\u0007R\u0019\u0010x\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\by\u0010\u0007R\u0013\u0010z\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b{\u0010\u0011R\u0013\u0010|\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b}\u0010\u0011¨\u0006~"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/InfoStickerEffect;", "", "()V", "bindIds", "", "", "getBindIds", "()Ljava/util/List;", "challenge", "getChallenge", "childEffects", "Lcom/ss/ugc/effectplatform/model/Effect;", "getChildEffects", "children", "getChildren", "clickUrl", "getClickUrl", "()Ljava/lang/String;", "composerParams", "getComposerParams", "composerPath", "getComposerPath", "designerEncryptedId", "getDesignerEncryptedId", "designerId", "getDesignerId", "devicePlatform", "getDevicePlatform", "effectId", "getEffectId", "effectType", "", "getEffectType", "()Ljava/lang/Integer;", "extra", "getExtra", "fileUrl", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "getFileUrl", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "gradeKey", "getGradeKey", "hint", "getHint", "hintFile", "getHintFile", "hintFileFormat", "getHintFileFormat", "hintIcon", "getHintIcon", "iconUrl", "getIconUrl", "id", "getId", "iopId", "getIopId", "isBusi", "", "()Ljava/lang/Boolean;", "isDownloaded", "isIop", "lokiEffectSource", "getLokiEffectSource", "<set-?>", "loki_effect", "getLoki_effect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "modelNames", "getModelNames", "modelNamesSec", "getModelNamesSec", "music", "getMusic", "name", "getName", "panel", "getPanel", "parent", "getParent", "path", "getPath", "ptime", "", "getPtime", "()Ljava/lang/Long;", "recId", "getRecId", "requirements", "getRequirements", "requirementsSec", "getRequirementsSec", "resourceId", "getResourceId", "schema", "getSchema", "sdkExtra", "getSdkExtra", ShareHitPoint.f121868c, "getSource", "setSource", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "sticker", "getSticker", "()Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "stickerInfo", "Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "getStickerInfo", "()Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "tags", "getTags", "tagsUpdatedAt", "getTagsUpdatedAt", "thumbnailSticker", "getThumbnailSticker", "title", "getTitle", "types", "getTypes", "typesSec", "getTypesSec", "unzipPath", "getUnzipPath", "zipPath", "getZipPath", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InfoStickerEffect {
    private Effect loki_effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, -1, 16383, null);
    private Integer source;
    private ProviderEffect sticker = new ProviderEffect(null, null, null, null, null, null, 63, null);

    public final Integer getSource() {
        return this.source;
    }

    public final List<String> getBindIds() {
        return getLoki_effect().getBind_ids();
    }

    public final List<String> getChallenge() {
        return getLoki_effect().getChallenge();
    }

    public final List<Effect> getChildEffects() {
        return getLoki_effect().getChild_effects();
    }

    public final List<String> getChildren() {
        return getLoki_effect().getChildren();
    }

    public final String getClickUrl() {
        return getSticker().getClick_url();
    }

    public final String getComposerParams() {
        return getLoki_effect().getComposer_params();
    }

    public final List<String> getComposerPath() {
        return getLoki_effect().getComposerPath();
    }

    public final String getDesignerEncryptedId() {
        return getLoki_effect().getDesigner_encrypted_id();
    }

    public final String getDesignerId() {
        return getLoki_effect().getDesigner_id();
    }

    public final String getDevicePlatform() {
        return getLoki_effect().getDevice_platform();
    }

    public final String getEffectId() {
        return getLoki_effect().getEffect_id();
    }

    public final Integer getEffectType() {
        return Integer.valueOf(getLoki_effect().getEffect_type());
    }

    public final String getExtra() {
        return getLoki_effect().getExtra();
    }

    public final UrlModel getFileUrl() {
        return getLoki_effect().getFile_url();
    }

    public final String getGradeKey() {
        return getLoki_effect().getGrade_key();
    }

    public final String getHint() {
        return getLoki_effect().getHint();
    }

    public final UrlModel getHintFile() {
        return getLoki_effect().getHint_file();
    }

    public final Integer getHintFileFormat() {
        return Integer.valueOf(getLoki_effect().getHint_file_format());
    }

    public final UrlModel getHintIcon() {
        return getLoki_effect().getHint_icon();
    }

    public final UrlModel getIconUrl() {
        return getLoki_effect().getIcon_url();
    }

    public final String getIopId() {
        return getLoki_effect().getIop_id();
    }

    public final Integer getLokiEffectSource() {
        return Integer.valueOf(getLoki_effect().getSource());
    }

    public final String getModelNames() {
        return getLoki_effect().getModel_names();
    }

    public final String getModelNamesSec() {
        return getLoki_effect().getModel_names_sec();
    }

    public final List<String> getMusic() {
        return getLoki_effect().getMusic();
    }

    public final String getName() {
        return getLoki_effect().getName();
    }

    public final String getPanel() {
        return getLoki_effect().getPanel();
    }

    public final String getParent() {
        return getLoki_effect().getParent();
    }

    public final String getPath() {
        return getSticker().getPath();
    }

    public final Long getPtime() {
        return Long.valueOf(getLoki_effect().getPtime());
    }

    public final String getRecId() {
        return getLoki_effect().getRecId();
    }

    public final List<String> getRequirements() {
        return getLoki_effect().getRequirements();
    }

    public final List<String> getRequirementsSec() {
        return getLoki_effect().getRequirements_sec();
    }

    public final String getResourceId() {
        return getLoki_effect().getResource_id();
    }

    public final String getSchema() {
        return getLoki_effect().getSchema();
    }

    public final String getSdkExtra() {
        return getLoki_effect().getSdk_extra();
    }

    public final ProviderEffect.StickerBean getStickerInfo() {
        return getSticker().getSticker_info();
    }

    public final List<String> getTags() {
        return getLoki_effect().getTags();
    }

    public final String getTagsUpdatedAt() {
        return getLoki_effect().getTags_updated_at();
    }

    public final ProviderEffect.StickerBean getThumbnailSticker() {
        return getSticker().getThumbnail_sticker();
    }

    public final String getTitle() {
        return getSticker().getTitle();
    }

    public final List<String> getTypes() {
        return getLoki_effect().getTypes();
    }

    public final List<String> getTypesSec() {
        return getLoki_effect().getTypes_sec();
    }

    public final String getUnzipPath() {
        return getLoki_effect().getUnzipPath();
    }

    public final String getZipPath() {
        return getLoki_effect().getZipPath();
    }

    public final Boolean isBusi() {
        return Boolean.valueOf(getLoki_effect().is_busi());
    }

    public final Boolean isDownloaded() {
        return Boolean.valueOf(getLoki_effect().isDownloaded());
    }

    public final Boolean isIop() {
        return Boolean.valueOf(getLoki_effect().is_iop());
    }

    public final ProviderEffect getSticker() {
        ProviderEffect providerEffect = this.sticker;
        if (providerEffect != null) {
            return providerEffect;
        }
        return new ProviderEffect(null, null, null, null, null, null, 63, null);
    }

    public final String getId() {
        Integer num = this.source;
        if (num != null && num.intValue() == 1) {
            return getLoki_effect().getId();
        }
        if (num != null && num.intValue() == 2) {
            return getSticker().getId();
        }
        return "";
    }

    public final Effect getLoki_effect() {
        Effect effect = this.loki_effect;
        if (effect != null) {
            return effect;
        }
        return new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, -1, 16383, null);
    }

    public final void setSource(Integer num) {
        this.source = num;
    }
}
