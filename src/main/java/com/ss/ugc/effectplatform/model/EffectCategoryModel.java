package com.ss.ugc.effectplatform.model;

import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0017\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u0006\u0010,\u001a\u00020\u000eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018¨\u0006-"}, d2 = {"Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "", "id", "", "name", "key", "icon", "Lcom/ss/ugc/effectplatform/model/UrlModel;", "icon_selected", "effects", "", "tags", "tags_updated_at", "is_default", "", "extra", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/UrlModel;Lcom/ss/ugc/effectplatform/model/UrlModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "getEffects", "()Ljava/util/List;", "setEffects", "(Ljava/util/List;)V", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "getIcon", "()Lcom/ss/ugc/effectplatform/model/UrlModel;", "setIcon", "(Lcom/ss/ugc/effectplatform/model/UrlModel;)V", "getIcon_selected", "setIcon_selected", "getId", "setId", "()Z", "set_default", "(Z)V", "getKey", "setKey", "getName", "setName", "getTags", "setTags", "getTags_updated_at", "setTags_updated_at", "checkValued", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EffectCategoryModel {
    private List<String> effects;
    private String extra;
    private UrlModel icon;
    private UrlModel icon_selected;
    private String id;
    private boolean is_default;
    private String key;
    private String name;
    private List<String> tags;
    private String tags_updated_at;

    public EffectCategoryModel() {
        this(null, null, null, null, null, null, null, null, false, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    public List<String> getEffects() {
        return this.effects;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public UrlModel getIcon_selected() {
        return this.icon_selected;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public final boolean checkValued() {
        if (getIcon() == null) {
            setIcon(new UrlModel(null, null, 3, null));
        }
        if (getIcon() != null) {
            if (getIcon_selected() == null) {
                setIcon_selected(new UrlModel(null, null, 3, null));
            }
            if (getIcon_selected() != null) {
                return !Intrinsics.areEqual(getId(), "");
            }
        }
        return false;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setIcon_selected(UrlModel urlModel) {
        this.icon_selected = urlModel;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void set_default(boolean z) {
        this.is_default = z;
    }

    public void setEffects(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.effects = list;
    }

    public void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.key = str;
    }

    public void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public void setTags(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.tags = list;
    }

    public EffectCategoryModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List<String> list, List<String> list2, String str4, boolean z, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "key");
        Intrinsics.checkParameterIsNotNull(list, "effects");
        Intrinsics.checkParameterIsNotNull(list2, "tags");
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.icon = urlModel;
        this.icon_selected = urlModel2;
        this.effects = list;
        this.tags = list2;
        this.tags_updated_at = str4;
        this.is_default = z;
        this.extra = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EffectCategoryModel(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.ss.ugc.effectplatform.model.UrlModel r15, com.ss.ugc.effectplatform.model.UrlModel r16, java.util.List r17, java.util.List r18, java.lang.String r19, boolean r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.EffectCategoryModel.<init>(java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.UrlModel, com.ss.ugc.effectplatform.model.UrlModel, java.util.List, java.util.List, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
