package com.ss.android.lark.mm.module.detail.subtitles.model;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0002\u0010\u0007R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/model/ParagraphHighlightInfoViewModel;", "", "paragraphMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/SentenceHighlightInfoViewModel;", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "getParagraphMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.model.b */
public final class ParagraphHighlightInfoViewModel {

    /* renamed from: a */
    private final ConcurrentHashMap<String, List<SentenceHighlightInfoViewModel>> f116553a;

    /* renamed from: a */
    public final ConcurrentHashMap<String, List<SentenceHighlightInfoViewModel>> mo162572a() {
        return this.f116553a;
    }

    public ParagraphHighlightInfoViewModel(ConcurrentHashMap<String, List<SentenceHighlightInfoViewModel>> concurrentHashMap) {
        Intrinsics.checkParameterIsNotNull(concurrentHashMap, "paragraphMap");
        this.f116553a = concurrentHashMap;
    }
}
