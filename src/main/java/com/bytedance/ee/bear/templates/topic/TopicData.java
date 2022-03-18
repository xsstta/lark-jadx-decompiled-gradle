package com.bytedance.ee.bear.templates.topic;

import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/TopicData;", "Lcom/bytedance/ee/util/io/NonProguard;", "banner", "Lcom/bytedance/ee/bear/templates/topic/TopicBannerData;", "templates", "", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "(Lcom/bytedance/ee/bear/templates/topic/TopicBannerData;Ljava/util/List;)V", "getBanner", "()Lcom/bytedance/ee/bear/templates/topic/TopicBannerData;", "setBanner", "(Lcom/bytedance/ee/bear/templates/topic/TopicBannerData;)V", "getTemplates", "()Ljava/util/List;", "setTemplates", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TopicData implements NonProguard {
    private C11670f banner;
    private List<TemplateV4> templates;

    public TopicData() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.templates.topic.TopicData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopicData copy$default(TopicData topicData, C11670f fVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = topicData.banner;
        }
        if ((i & 2) != 0) {
            list = topicData.templates;
        }
        return topicData.copy(fVar, list);
    }

    public final C11670f component1() {
        return this.banner;
    }

    public final List<TemplateV4> component2() {
        return this.templates;
    }

    public final TopicData copy(C11670f fVar, List<TemplateV4> list) {
        return new TopicData(fVar, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicData)) {
            return false;
        }
        TopicData topicData = (TopicData) obj;
        return Intrinsics.areEqual(this.banner, topicData.banner) && Intrinsics.areEqual(this.templates, topicData.templates);
    }

    public int hashCode() {
        C11670f fVar = this.banner;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        List<TemplateV4> list = this.templates;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TopicData(banner=" + this.banner + ", templates=" + this.templates + ")";
    }

    public final C11670f getBanner() {
        return this.banner;
    }

    public final List<TemplateV4> getTemplates() {
        return this.templates;
    }

    public final void setBanner(C11670f fVar) {
        this.banner = fVar;
    }

    public final void setTemplates(List<TemplateV4> list) {
        this.templates = list;
    }

    public TopicData(C11670f fVar, List<TemplateV4> list) {
        this.banner = fVar;
        this.templates = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TopicData(C11670f fVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fVar, (i & 2) != 0 ? null : list);
    }
}
