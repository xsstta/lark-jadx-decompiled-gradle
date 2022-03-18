package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\n\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016R*\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/ProviderEffectTemplate;", "Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "kProviderEffect", "(Lcom/ss/ugc/effectplatform/model/ProviderEffect;)V", "value", "", "clickUrl", "getClickUrl", "()Ljava/lang/String;", "setClickUrl", "(Ljava/lang/String;)V", "getKProviderEffect", "()Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect$StickerBean;", "thumbnailSticker", "getThumbnailSticker", "()Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect$StickerBean;", "setThumbnailSticker", "(Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect$StickerBean;)V", "getSticker", "setSticker", "", "stickerBean", "StickerBeanTemplate", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.o */
public class ProviderEffectTemplate extends ProviderEffect {
    private String clickUrl;
    private final transient ProviderEffect kProviderEffect;
    private ProviderEffect.StickerBean thumbnailSticker;

    public ProviderEffectTemplate() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/ProviderEffectTemplate$StickerBeanTemplate;", "Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "kStickerBean", "(Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;)V", "getKStickerBean", "()Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.o$a */
    public static class StickerBeanTemplate extends ProviderEffect.StickerBean {
        private final transient ProviderEffect.StickerBean kStickerBean;

        public StickerBeanTemplate() {
            this(null, 1, null);
        }

        public ProviderEffect.StickerBean getKStickerBean() {
            return this.kStickerBean;
        }

        public StickerBeanTemplate(ProviderEffect.StickerBean stickerBean) {
            super(null, null, null, null, 15, null);
            this.kStickerBean = stickerBean;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StickerBeanTemplate(ProviderEffect.StickerBean stickerBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stickerBean);
        }
    }

    public com.ss.ugc.effectplatform.model.ProviderEffect getKProviderEffect() {
        return this.kProviderEffect;
    }

    public String getClickUrl() {
        String click_url;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (click_url = kProviderEffect2.getClick_url()) == null) {
            return super.getClick_url();
        }
        return click_url;
    }

    public ProviderEffect.StickerBean getSticker() {
        ProviderEffect.StickerBean stickerBean;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (stickerBean = kProviderEffect2.getSticker_info()) == null) {
            stickerBean = super.getSticker_info();
        }
        return new ProviderEffect.StickerBean(stickerBean);
    }

    public ProviderEffect.StickerBean getThumbnailSticker() {
        ProviderEffect.StickerBean stickerBean;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (stickerBean = kProviderEffect2.getThumbnail_sticker()) == null) {
            stickerBean = super.getThumbnail_sticker();
        }
        return new ProviderEffect.StickerBean(stickerBean);
    }

    public ProviderEffectTemplate(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect) {
        super(null, null, null, null, null, null, 63, null);
        this.kProviderEffect = providerEffect;
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setClick_url(str);
        }
        super.setClick_url(str);
    }

    public void setSticker(ProviderEffect.StickerBean stickerBean) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSticker_info(stickerBean);
        }
        super.setSticker_info(stickerBean);
    }

    public void setThumbnailSticker(ProviderEffect.StickerBean stickerBean) {
        this.thumbnailSticker = stickerBean;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setThumbnail_sticker(stickerBean);
        }
        super.setThumbnail_sticker(stickerBean);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectTemplate(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : providerEffect);
    }
}
