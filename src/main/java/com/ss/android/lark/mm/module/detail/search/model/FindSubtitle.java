package com.ss.android.lark.mm.module.detail.search.model;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/model/FindSubtitle;", "Ljava/io/Serializable;", "pid", "", "sentences", "", "Lcom/ss/android/lark/mm/module/detail/search/model/FindSentence;", "(Ljava/lang/String;Ljava/util/List;)V", "getPid", "()Ljava/lang/String;", "setPid", "(Ljava/lang/String;)V", "getSentences", "()Ljava/util/List;", "setSentences", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FindSubtitle implements Serializable {
    private String pid;
    private List<FindSentence> sentences;

    public FindSubtitle() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.detail.search.model.FindSubtitle */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindSubtitle copy$default(FindSubtitle findSubtitle, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = findSubtitle.pid;
        }
        if ((i & 2) != 0) {
            list = findSubtitle.sentences;
        }
        return findSubtitle.copy(str, list);
    }

    public final String component1() {
        return this.pid;
    }

    public final List<FindSentence> component2() {
        return this.sentences;
    }

    public final FindSubtitle copy(String str, List<FindSentence> list) {
        return new FindSubtitle(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindSubtitle)) {
            return false;
        }
        FindSubtitle findSubtitle = (FindSubtitle) obj;
        return Intrinsics.areEqual(this.pid, findSubtitle.pid) && Intrinsics.areEqual(this.sentences, findSubtitle.sentences);
    }

    public int hashCode() {
        String str = this.pid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<FindSentence> list = this.sentences;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "FindSubtitle(pid=" + this.pid + ", sentences=" + this.sentences + ")";
    }

    public final String getPid() {
        return this.pid;
    }

    public final List<FindSentence> getSentences() {
        return this.sentences;
    }

    public final void setPid(String str) {
        this.pid = str;
    }

    public final void setSentences(List<FindSentence> list) {
        this.sentences = list;
    }

    public FindSubtitle(String str, List<FindSentence> list) {
        this.pid = str;
        this.sentences = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FindSubtitle(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
