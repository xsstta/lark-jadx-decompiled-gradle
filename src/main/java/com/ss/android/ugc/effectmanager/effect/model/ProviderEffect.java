package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\n\u0010'\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0018H\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u00188V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001e8V@VX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\f¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/ProviderEffectTemplate;", "Ljava/io/Serializable;", "kProviderEffect", "Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "(Lcom/ss/ugc/effectplatform/model/ProviderEffect;)V", "value", "", "clickUrl", "getClickUrl", "()Ljava/lang/String;", "setClickUrl", "(Ljava/lang/String;)V", "click_url", "getClick_url", "setClick_url", "id", "getId", "setId", "getKProviderEffect", "()Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "path", "getPath", "setPath", "Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect$StickerBean;", "thumbnailSticker", "getThumbnailSticker", "()Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect$StickerBean;", "setThumbnailSticker", "(Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect$StickerBean;)V", "Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "thumbnail_sticker", "getThumbnail_sticker", "()Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "setThumbnail_sticker", "(Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;)V", "title", "getTitle", "setTitle", "getSticker", "setSticker", "", "stickerBean", "StickerBean", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ProviderEffect extends ProviderEffectTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect;

    public ProviderEffect() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR(\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR(\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect$StickerBean;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/ProviderEffectTemplate$StickerBeanTemplate;", "Ljava/io/Serializable;", "kStickerBean", "Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "(Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;)V", "value", "", "height", "getHeight", "()Ljava/lang/String;", "setHeight", "(Ljava/lang/String;)V", "getKStickerBean", "()Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "size", "getSize", "setSize", "url", "getUrl", "setUrl", "width", "getWidth", "setWidth", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class StickerBean extends ProviderEffectTemplate.StickerBeanTemplate implements Serializable {
        private final transient ProviderEffect.StickerBean kStickerBean;

        public StickerBean() {
            this(null, 1, null);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate.StickerBeanTemplate
        public ProviderEffect.StickerBean getKStickerBean() {
            return this.kStickerBean;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public String getHeight() {
            String height;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 == null || (height = kStickerBean2.getHeight()) == null) {
                return super.getHeight();
            }
            return height;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public String getSize() {
            String size;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 == null || (size = kStickerBean2.getSize()) == null) {
                return super.getSize();
            }
            return size;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public String getUrl() {
            String url;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 == null || (url = kStickerBean2.getUrl()) == null) {
                return super.getUrl();
            }
            return url;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public String getWidth() {
            String width;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 == null || (width = kStickerBean2.getWidth()) == null) {
                return super.getWidth();
            }
            return width;
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public void setHeight(String str) {
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                kStickerBean2.setHeight(str);
            }
            super.setHeight(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public void setSize(String str) {
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                kStickerBean2.setSize(str);
            }
            super.setSize(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public void setUrl(String str) {
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                kStickerBean2.setUrl(str);
            }
            super.setUrl(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public void setWidth(String str) {
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                kStickerBean2.setWidth(str);
            }
            super.setWidth(str);
        }

        public StickerBean(ProviderEffect.StickerBean stickerBean) {
            super(stickerBean);
            this.kStickerBean = stickerBean;
            ProviderEffect.StickerBean kStickerBean2 = getKStickerBean();
            if (kStickerBean2 != null) {
                String height = kStickerBean2.getHeight();
                if (height != null) {
                    super.setHeight(height);
                }
                String size = kStickerBean2.getSize();
                if (size != null) {
                    super.setSize(size);
                }
                String url = kStickerBean2.getUrl();
                if (url != null) {
                    super.setUrl(url);
                }
                String width = kStickerBean2.getWidth();
                if (width != null) {
                    super.setWidth(width);
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StickerBean(ProviderEffect.StickerBean stickerBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stickerBean);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public com.ss.ugc.effectplatform.model.ProviderEffect getKProviderEffect() {
        return this.kProviderEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public String getClickUrl() {
        return super.getClickUrl();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public StickerBean getSticker() {
        return super.getSticker();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public StickerBean getThumbnailSticker() {
        return super.getThumbnailSticker();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getClick_url() {
        String click_url;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (click_url = kProviderEffect2.getClick_url()) == null) {
            return super.getClick_url();
        }
        return click_url;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (id = kProviderEffect2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getPath() {
        String path;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (path = kProviderEffect2.getPath()) == null) {
            return super.getPath();
        }
        return path;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public ProviderEffect.StickerBean getThumbnail_sticker() {
        ProviderEffect.StickerBean thumbnail_sticker;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (thumbnail_sticker = kProviderEffect2.getThumbnail_sticker()) == null) {
            return super.getThumbnail_sticker();
        }
        return thumbnail_sticker;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getTitle() {
        String title;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (title = kProviderEffect2.getTitle()) == null) {
            return super.getTitle();
        }
        return title;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public void setClickUrl(String str) {
        super.setClickUrl(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public void setSticker(StickerBean stickerBean) {
        super.setSticker(stickerBean);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public void setThumbnailSticker(StickerBean stickerBean) {
        super.setThumbnailSticker(stickerBean);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setClick_url(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setClick_url(str);
        }
        super.setClick_url(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setPath(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setPath(str);
        }
        super.setPath(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setThumbnail_sticker(ProviderEffect.StickerBean stickerBean) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setThumbnail_sticker(stickerBean);
        }
        super.setThumbnail_sticker(stickerBean);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setTitle(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setTitle(str);
        }
        super.setTitle(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setId(str);
        }
        super.setId(str);
    }

    public ProviderEffect(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect) {
        super(providerEffect);
        this.kProviderEffect = providerEffect;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            String click_url = kProviderEffect2.getClick_url();
            if (click_url != null) {
                super.setClick_url(click_url);
            }
            String id = kProviderEffect2.getId();
            if (id != null) {
                super.setId(id);
            }
            String path = kProviderEffect2.getPath();
            if (path != null) {
                super.setPath(path);
            }
            ProviderEffect.StickerBean sticker_info = kProviderEffect2.getSticker_info();
            if (sticker_info != null) {
                super.setSticker_info(sticker_info);
            }
            ProviderEffect.StickerBean thumbnail_sticker = kProviderEffect2.getThumbnail_sticker();
            if (thumbnail_sticker != null) {
                super.setThumbnail_sticker(thumbnail_sticker);
            }
            String title = kProviderEffect2.getTitle();
            if (title != null) {
                super.setTitle(title);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffect(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : providerEffect);
    }
}
