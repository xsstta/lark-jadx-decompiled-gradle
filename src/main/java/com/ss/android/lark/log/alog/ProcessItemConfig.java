package com.ss.android.lark.log.alog;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/log/alog/ProcessItemConfig;", "", "maxSize", "", "level", "limitTag", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "limitMsgRegex", "(IILjava/util/ArrayList;Ljava/lang/String;)V", "getLevel", "()I", "setLevel", "(I)V", "getLimitMsgRegex", "()Ljava/lang/String;", "setLimitMsgRegex", "(Ljava/lang/String;)V", "getLimitTag", "()Ljava/util/ArrayList;", "setLimitTag", "(Ljava/util/ArrayList;)V", "getMaxSize", "setMaxSize", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ProcessItemConfig {
    private int level;
    private String limitMsgRegex;
    private ArrayList<String> limitTag;
    private int maxSize;

    public ProcessItemConfig() {
        this(0, 0, null, null, 15, null);
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getLimitMsgRegex() {
        return this.limitMsgRegex;
    }

    public final ArrayList<String> getLimitTag() {
        return this.limitTag;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setMaxSize(int i) {
        this.maxSize = i;
    }

    public final void setLimitMsgRegex(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.limitMsgRegex = str;
    }

    public final void setLimitTag(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.limitTag = arrayList;
    }

    public ProcessItemConfig(int i, int i2, ArrayList<String> arrayList, String str) {
        Intrinsics.checkParameterIsNotNull(arrayList, "limitTag");
        Intrinsics.checkParameterIsNotNull(str, "limitMsgRegex");
        this.maxSize = i;
        this.level = i2;
        this.limitTag = arrayList;
        this.limitMsgRegex = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProcessItemConfig(int i, int i2, ArrayList arrayList, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 240 : i, (i3 & 2) != 0 ? 4 : i2, (i3 & 4) != 0 ? new ArrayList() : arrayList, (i3 & 8) != 0 ? "" : str);
    }
}
