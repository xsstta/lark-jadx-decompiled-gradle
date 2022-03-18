package com.bytedance.ee.bear.templates.scene;

import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/TopicData;", "Lcom/bytedance/ee/util/io/NonProguard;", "templates", "", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "(Ljava/util/List;)V", "getTemplates", "()Ljava/util/List;", "setTemplates", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TopicData implements NonProguard {
    private List<TemplateV4> templates;

    public TopicData() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.templates.scene.TopicData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopicData copy$default(TopicData topicData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = topicData.templates;
        }
        return topicData.copy(list);
    }

    public final List<TemplateV4> component1() {
        return this.templates;
    }

    public final TopicData copy(List<TemplateV4> list) {
        return new TopicData(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TopicData) && Intrinsics.areEqual(this.templates, ((TopicData) obj).templates);
        }
        return true;
    }

    public int hashCode() {
        List<TemplateV4> list = this.templates;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TopicData(templates=" + this.templates + ")";
    }

    public final List<TemplateV4> getTemplates() {
        return this.templates;
    }

    public final void setTemplates(List<TemplateV4> list) {
        this.templates = list;
    }

    public TopicData(List<TemplateV4> list) {
        this.templates = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TopicData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
