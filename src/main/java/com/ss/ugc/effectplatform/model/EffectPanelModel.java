package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u001e\u001a\u00020\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006 "}, d2 = {"Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "", "text", "", "id", "icon", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "tags", "", "tags_updated_at", "extra", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/UrlModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "getIcon", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "setIcon", "(Lcom/ss/ugc/effectplatform/model/UrlModel;)V", "getId", "setId", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "getTags_updated_at", "setTags_updated_at", "getText", "setText", "checkValued", "", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EffectPanelModel {
    private String extra;
    private UrlModel icon;
    private String id;
    private List<String> tags;
    private String tags_updated_at;
    private String text;

    public EffectPanelModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public String getText() {
        return this.text;
    }

    public final boolean checkValued() {
        if (getIcon() != null) {
            return true;
        }
        setIcon(new UrlModel(null, null, 3, null));
        return true;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTags(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.tags = list;
    }

    public EffectPanelModel(String str, String str2, UrlModel urlModel, List<String> list, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(list, "tags");
        this.text = str;
        this.id = str2;
        this.icon = urlModel;
        this.tags = list;
        this.tags_updated_at = str3;
        this.extra = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectPanelModel(String str, String str2, UrlModel urlModel, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new UrlModel(null, null, 3, null) : urlModel, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
