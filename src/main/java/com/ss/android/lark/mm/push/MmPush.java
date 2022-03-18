package com.ss.android.lark.mm.push;

import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002'(B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ^\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142&\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00182&\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u0018J\u001c\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010&\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/mm/push/MmPush;", "", "()V", "mPushCommentChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/push/MmPush$IPushReactionChangeListener;", "mPushReactionLineListeners", "Lcom/ss/android/lark/mm/push/IPushReactionLineChangeListener;", "mPushRecordSubtitleListeners", "Lcom/ss/android/lark/mm/push/IPushRecordSubtitleListener;", "mPushSummaryChangeListeners", "Lcom/ss/android/lark/mm/push/MmPush$IPushSummaryChangeListener;", "addPushCommentChangeListener", "", "listener", "addPushReactionLineChangeListener", "addPushRecordSubtitleChangeListener", "addPushSummaryChangeListener", "onPushReactionChange", "objectToken", "", "paragraphMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "Lkotlin/collections/HashMap;", "commentMap", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "list", "", "Lcom/ss/android/lark/mm/module/highlight/timeline/HighlightTimeLineItem;", "onPushRealTimeSentenceChange", "sentence", "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "onPushSummaryChange", "removePushCommentChangeListener", "removePushReactionLineChangeListener", "removePushRecordSubtitleChangeListener", "removePushSummaryChangeListener", "unRegisterAllListeners", "IPushReactionChangeListener", "IPushSummaryChangeListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.d.c */
public final class MmPush {

    /* renamed from: a */
    private final CopyOnWriteArrayList<IPushReactionChangeListener> f115703a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final CopyOnWriteArrayList<AbstractC45866a> f115704b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final CopyOnWriteArrayList<IPushRecordSubtitleListener> f115705c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private final CopyOnWriteArrayList<IPushSummaryChangeListener> f115706d = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J`\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u0001`\t2&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\tH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/push/MmPush$IPushReactionChangeListener;", "", "onChangeReaction", "", "objectToken", "", "paragraphMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "Lkotlin/collections/HashMap;", "commentMap", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.d.c$a */
    public interface IPushReactionChangeListener {
        /* renamed from: a */
        void mo161205a(String str, HashMap<String, MmMeetingParagraph> hashMap, HashMap<String, MmComment.MmCommentInfo> hashMap2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/push/MmPush$IPushSummaryChangeListener;", "", "onChangeSummary", "", "objectToken", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.d.c$b */
    public interface IPushSummaryChangeListener {
        /* renamed from: c */
        void mo161206c(String str);
    }

    /* renamed from: a */
    public final void mo161193a(AbstractC45866a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f115704b.add(aVar);
    }

    /* renamed from: b */
    public final void mo161201b(AbstractC45866a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f115704b.remove(aVar);
    }

    /* renamed from: a */
    public final void mo161194a(IPushRecordSubtitleListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f115705c.add(bVar);
    }

    /* renamed from: b */
    public final void mo161202b(IPushRecordSubtitleListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f115705c.remove(bVar);
    }

    /* renamed from: a */
    public final void mo161195a(IPushReactionChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f115703a.add(aVar);
        C45855f.m181663b("MmPush", "addPushCommentChangeListener, size:" + this.f115703a.size());
    }

    /* renamed from: b */
    public final void mo161203b(IPushReactionChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C45855f.m181663b("MmPush", "removePushCommentChangeListener, size:" + this.f115703a.size());
        this.f115703a.remove(aVar);
    }

    /* renamed from: a */
    public final void mo161196a(IPushSummaryChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f115706d.add(bVar);
        C45855f.m181663b("MmPush", "addPushSummaryChangeListener, size:" + this.f115706d.size());
    }

    /* renamed from: b */
    public final void mo161204b(IPushSummaryChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        C45855f.m181663b("MmPush", "removePushSummaryChangeListener, size:" + this.f115706d.size());
        this.f115706d.remove(bVar);
    }

    /* renamed from: a */
    public final void mo161197a(MmRecordSentence mmRecordSentence) {
        Intrinsics.checkParameterIsNotNull(mmRecordSentence, "sentence");
        Iterator<T> it = this.f115705c.iterator();
        while (it.hasNext()) {
            it.next().mo161192a(mmRecordSentence);
        }
    }

    /* renamed from: a */
    public final void mo161198a(String str) {
        Iterator<T> it = this.f115706d.iterator();
        while (it.hasNext()) {
            it.next().mo161206c(str);
        }
    }

    /* renamed from: a */
    public final void mo161200a(String str, List<? extends HighlightTimeLineItem> list) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        Intrinsics.checkParameterIsNotNull(list, "list");
        C45855f.m181663b("MmPush", "onPushReactionChange");
        Iterator<T> it = this.f115704b.iterator();
        while (it.hasNext()) {
            it.next().mo161191a(str, list);
        }
    }

    /* renamed from: a */
    public final void mo161199a(String str, HashMap<String, MmMeetingParagraph> hashMap, HashMap<String, MmComment.MmCommentInfo> hashMap2) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        C45855f.m181663b("MmPush", "onPushReactionChange, mPushCommentChangeListeners size:" + this.f115703a.size());
        Iterator<T> it = this.f115703a.iterator();
        while (it.hasNext()) {
            it.next().mo161205a(str, hashMap, hashMap2);
        }
    }
}
