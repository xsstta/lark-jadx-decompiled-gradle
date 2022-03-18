package com.ss.android.lark.mm.module.detail.summary.model;

import com.ss.android.lark.mm.net.HttpMmResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001*B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR:\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "Ljava/io/Serializable;", "()V", "is_auto_gen", "", "()Ljava/lang/Boolean;", "set_auto_gen", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "section_list", "", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummarySection;", "getSection_list", "()Ljava/util/List;", "setSection_list", "(Ljava/util/List;)V", "summaries", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummaryContent;", "Lkotlin/collections/HashMap;", "getSummaries", "()Ljava/util/HashMap;", "setSummaries", "(Ljava/util/HashMap;)V", "summary_status", "", "getSummary_status", "()Ljava/lang/Integer;", "setSummary_status", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "total", "getTotal", "setTotal", "translate_lang", "getTranslate_lang", "()Ljava/lang/String;", "setTranslate_lang", "(Ljava/lang/String;)V", "getContents", "contentIds", "MmSummaryResp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmSummary implements Serializable {
    private Boolean is_auto_gen;
    private List<MmSummarySection> section_list;
    private HashMap<String, MmSummaryContent> summaries;
    private Integer summary_status;
    private Integer total;
    private String translate_lang;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary$MmSummaryResp;", "Lcom/ss/android/lark/mm/net/HttpMmResponse;", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "()V", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class MmSummaryResp extends HttpMmResponse<MmSummary> {
    }

    public final List<MmSummarySection> getSection_list() {
        return this.section_list;
    }

    public final HashMap<String, MmSummaryContent> getSummaries() {
        return this.summaries;
    }

    public final Integer getSummary_status() {
        return this.summary_status;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final String getTranslate_lang() {
        return this.translate_lang;
    }

    public final Boolean is_auto_gen() {
        return this.is_auto_gen;
    }

    public final void setSection_list(List<MmSummarySection> list) {
        this.section_list = list;
    }

    public final void setSummaries(HashMap<String, MmSummaryContent> hashMap) {
        this.summaries = hashMap;
    }

    public final void setSummary_status(Integer num) {
        this.summary_status = num;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public final void setTranslate_lang(String str) {
        this.translate_lang = str;
    }

    public final void set_auto_gen(Boolean bool) {
        this.is_auto_gen = bool;
    }

    public final List<MmSummaryContent> getContents(List<String> list) {
        MmSummaryContent mmSummaryContent;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list != null) {
            for (T t : list) {
                HashMap<String, MmSummaryContent> hashMap = this.summaries;
                if (!(hashMap == null || (mmSummaryContent = hashMap.get(t)) == null)) {
                    Intrinsics.checkExpressionValueIsNotNull(mmSummaryContent, "content");
                    arrayList.add(mmSummaryContent);
                }
            }
        }
        return arrayList;
    }
}
