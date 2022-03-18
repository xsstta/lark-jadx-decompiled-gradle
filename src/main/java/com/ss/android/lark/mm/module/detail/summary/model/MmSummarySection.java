package com.ss.android.lark.mm.module.detail.summary.model;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummarySection;", "Ljava/io/Serializable;", "()V", "content_ids", "", "", "getContent_ids", "()Ljava/util/List;", "setContent_ids", "(Ljava/util/List;)V", "content_type", "", "getContent_type", "()Ljava/lang/Integer;", "setContent_type", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "section_id", "", "getSection_id", "()Ljava/lang/Long;", "setSection_id", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmSummarySection implements Serializable {
    private List<String> content_ids;
    private Integer content_type;
    private Long section_id;
    private String title;

    public final List<String> getContent_ids() {
        return this.content_ids;
    }

    public final Integer getContent_type() {
        return this.content_type;
    }

    public final Long getSection_id() {
        return this.section_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setContent_ids(List<String> list) {
        this.content_ids = list;
    }

    public final void setContent_type(Integer num) {
        this.content_type = num;
    }

    public final void setSection_id(Long l) {
        this.section_id = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
