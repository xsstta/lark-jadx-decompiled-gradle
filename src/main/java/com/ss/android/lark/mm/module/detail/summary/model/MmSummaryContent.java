package com.ss.android.lark.mm.module.detail.summary.model;

import android.text.Spanned;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001e\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001e\u00100\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%¨\u00063"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummaryContent;", "Ljava/io/Serializable;", "()V", "_spanDataContent", "Landroid/text/Spanned;", "get_spanDataContent", "()Landroid/text/Spanned;", "set_spanDataContent", "(Landroid/text/Spanned;)V", "checked", "", "getChecked", "()Ljava/lang/Boolean;", "setChecked", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "content_id", "", "getContent_id", "()Ljava/lang/String;", "setContent_id", "(Ljava/lang/String;)V", "content_type", "", "getContent_type", "()Ljava/lang/Integer;", "setContent_type", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "setData", "section_id", "", "getSection_id", "()Ljava/lang/Long;", "setSection_id", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "sids", "", "getSids", "()Ljava/util/List;", "setSids", "(Ljava/util/List;)V", "start_time", "getStart_time", "setStart_time", "stop_time", "getStop_time", "setStop_time", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmSummaryContent implements Serializable {
    private Spanned _spanDataContent;
    private Boolean checked;
    private String content_id;
    private Integer content_type;
    private String data;
    private Long section_id;
    private List<String> sids;
    private Long start_time;
    private Long stop_time;

    public final Boolean getChecked() {
        return this.checked;
    }

    public final String getContent_id() {
        return this.content_id;
    }

    public final Integer getContent_type() {
        return this.content_type;
    }

    public final String getData() {
        return this.data;
    }

    public final Long getSection_id() {
        return this.section_id;
    }

    public final List<String> getSids() {
        return this.sids;
    }

    public final Long getStart_time() {
        return this.start_time;
    }

    public final Long getStop_time() {
        return this.stop_time;
    }

    public final Spanned get_spanDataContent() {
        return this._spanDataContent;
    }

    public final void setChecked(Boolean bool) {
        this.checked = bool;
    }

    public final void setContent_id(String str) {
        this.content_id = str;
    }

    public final void setContent_type(Integer num) {
        this.content_type = num;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setSection_id(Long l) {
        this.section_id = l;
    }

    public final void setSids(List<String> list) {
        this.sids = list;
    }

    public final void setStart_time(Long l) {
        this.start_time = l;
    }

    public final void setStop_time(Long l) {
        this.stop_time = l;
    }

    public final void set_spanDataContent(Spanned spanned) {
        this._spanDataContent = spanned;
    }
}
