package com.ss.android.vc.meeting.module.reaction.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/entity/ReactionContent;", "", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.entity.b */
public final class ReactionContent {

    /* renamed from: a */
    private final String f158029a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ReactionContent) && Intrinsics.areEqual(this.f158029a, ((ReactionContent) obj).f158029a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f158029a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ReactionContent(content=" + this.f158029a + ")";
    }

    /* renamed from: a */
    public final String mo216929a() {
        return this.f158029a;
    }

    public ReactionContent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        this.f158029a = str;
    }
}
