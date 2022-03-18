package com.ss.android.lark.calendar.impl.features.search;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/EventHighLight;", "Ljava/io/Serializable;", "tag", "Lcom/ss/android/lark/calendar/impl/features/search/HighLightTag;", "highlights", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Lcom/ss/android/lark/calendar/impl/features/search/HighLightTag;Ljava/util/ArrayList;)V", "getHighlights", "()Ljava/util/ArrayList;", "getTag", "()Lcom/ss/android/lark/calendar/impl/features/search/HighLightTag;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventHighLight implements Serializable {
    private final ArrayList<String> highlights;
    private final HighLightTag tag;

    public final ArrayList<String> getHighlights() {
        return this.highlights;
    }

    public final HighLightTag getTag() {
        return this.tag;
    }

    public EventHighLight(HighLightTag highLightTag, ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(highLightTag, "tag");
        Intrinsics.checkParameterIsNotNull(arrayList, "highlights");
        this.tag = highLightTag;
        this.highlights = arrayList;
    }
}
