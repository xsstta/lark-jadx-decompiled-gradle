package com.ss.android.lark.mm.module.mention;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/mention/MmMentionSource;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "COMMENTS", "SUMMARY", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum MmMentionSource {
    COMMENTS("mention_from_comments"),
    SUMMARY("mention_from_minutes");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    private MmMentionSource(String str) {
        this.value = str;
    }
}
