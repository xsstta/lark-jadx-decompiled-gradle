package com.ss.ugc.effectplatform.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001dBK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "", "id", "", "title", "thumbnail_sticker", "Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "sticker", "click_url", "path", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;Ljava/lang/String;Ljava/lang/String;)V", "getClick_url", "()Ljava/lang/String;", "setClick_url", "(Ljava/lang/String;)V", "getId", "setId", "getPath", "setPath", "value", "sticker_info", "getSticker_info", "()Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "setSticker_info", "(Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;)V", "getThumbnail_sticker", "setThumbnail_sticker", "getTitle", "setTitle", "StickerBean", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class ProviderEffect {
    private String click_url;
    private String id;
    private String path;
    private StickerBean sticker;
    private StickerBean thumbnail_sticker;
    private String title;

    public ProviderEffect() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/ugc/effectplatform/model/ProviderEffect$StickerBean;", "", "url", "", "width", "height", "size", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeight", "()Ljava/lang/String;", "setHeight", "(Ljava/lang/String;)V", "getSize", "setSize", "getUrl", "setUrl", "getWidth", "setWidth", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static class StickerBean {
        private String height;
        private String size;
        private String url;
        private String width;

        public StickerBean() {
            this(null, null, null, null, 15, null);
        }

        public String getHeight() {
            return this.height;
        }

        public String getSize() {
            return this.size;
        }

        public String getUrl() {
            return this.url;
        }

        public String getWidth() {
            return this.width;
        }

        public void setHeight(String str) {
            this.height = str;
        }

        public void setSize(String str) {
            this.size = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setWidth(String str) {
            this.width = str;
        }

        public StickerBean(String str, String str2, String str3, String str4) {
            this.url = str;
            this.width = str2;
            this.height = str3;
            this.size = str4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StickerBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    public String getClick_url() {
        return this.click_url;
    }

    public String getId() {
        return this.id;
    }

    public String getPath() {
        return this.path;
    }

    public final StickerBean getSticker_info() {
        return this.sticker;
    }

    public StickerBean getThumbnail_sticker() {
        return this.thumbnail_sticker;
    }

    public String getTitle() {
        return this.title;
    }

    public void setClick_url(String str) {
        this.click_url = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public final void setSticker_info(StickerBean stickerBean) {
        this.sticker = stickerBean;
    }

    public void setThumbnail_sticker(StickerBean stickerBean) {
        this.thumbnail_sticker = stickerBean;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public ProviderEffect(String str, String str2, StickerBean stickerBean, StickerBean stickerBean2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.id = str;
        this.title = str2;
        this.thumbnail_sticker = stickerBean;
        this.sticker = stickerBean2;
        this.click_url = str3;
        this.path = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffect(String str, String str2, StickerBean stickerBean, StickerBean stickerBean2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : stickerBean, (i & 8) != 0 ? null : stickerBean2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
