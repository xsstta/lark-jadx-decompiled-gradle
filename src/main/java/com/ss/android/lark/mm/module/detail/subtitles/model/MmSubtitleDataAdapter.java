package com.ss.android.lark.mm.module.detail.subtitles.model;

import com.ss.android.lark.mm.module.detail.search.model.FindHighlight;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.detail.search.model.FindResults;
import com.ss.android.lark.mm.module.detail.search.model.FindSentence;
import com.ss.android.lark.mm.module.detail.search.model.FindSubtitle;
import com.ss.android.lark.mm.module.highlight.model.MmHighlightInfo;
import com.ss.android.lark.mm.utils.MmDateUtil;
import com.ss.android.lark.mm.widget.texthighlightbg.HighlightStyle;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ8\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0014¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmSubtitleDataAdapter;", "", "()V", "convertFindResponse2HighlightInfo", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/ParagraphHighlightInfoViewModel;", "findResponse", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "subtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "setParaCommentHighlightInfo", "", "para", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "tempList", "", "Lcom/ss/android/lark/mm/module/highlight/model/MmHighlightInfo;", "setSentenceAndWordOffsetInPara", "setSubtitleWithContentsRange", "timeStampToHighlightMode", "", "", "timeStamp", "", "filterParagraphs", "Ljava/util/LinkedList;", "startFindParaIndex", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.model.a */
public final class MmSubtitleDataAdapter {

    /* renamed from: a */
    public static final MmSubtitleDataAdapter f116552a = new MmSubtitleDataAdapter();

    private MmSubtitleDataAdapter() {
    }

    /* renamed from: a */
    public final void mo162570a(MmMeetingSubtitles mmMeetingSubtitles) {
        List<MmHighlightInfo> highlight;
        Intrinsics.checkParameterIsNotNull(mmMeetingSubtitles, "subtitles");
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (MmMeetingParagraph mmMeetingParagraph : mmMeetingSubtitles.getParagraphs()) {
            Intrinsics.checkExpressionValueIsNotNull(mmMeetingParagraph, "para");
            String startTime = mmMeetingParagraph.getStartTime();
            Intrinsics.checkExpressionValueIsNotNull(startTime, "para.startTime");
            mmMeetingParagraph.setDisplayStartTime(MmDateUtil.m186536a((int) (Long.parseLong(startTime) / ((long) 1000))));
            mo162568a(mmMeetingParagraph);
            j += mmMeetingParagraph.getParaContentSize();
            arrayList.clear();
            List<MmMeetingSentence> sentences = mmMeetingParagraph.getSentences();
            if (sentences != null) {
                for (T t : sentences) {
                    if (!(t == null || (highlight = t.getHighlight()) == null)) {
                        arrayList.addAll(highlight);
                    }
                }
            }
            mo162569a(mmMeetingParagraph, arrayList);
        }
        mmMeetingSubtitles.setTotalContentSize(j);
    }

    /* renamed from: a */
    public final void mo162568a(MmMeetingParagraph mmMeetingParagraph) {
        List<MmHighlightInfo> highlight;
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "para");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        long j = 0;
        int i = -1;
        int i2 = -1;
        for (MmMeetingSentence mmMeetingSentence : mmMeetingParagraph.getSentences()) {
            Ref.IntRef intRef = new Ref.IntRef();
            StringsKt.clear(sb);
            List<MmMeetingContent> list = mmMeetingSentence.contents;
            Intrinsics.checkExpressionValueIsNotNull(list, "sentence.contents");
            int i3 = -1;
            for (T t : list) {
                Intrinsics.checkExpressionValueIsNotNull(t, "content");
                sb.append(t.getContent());
                j += (long) t.getContent().length();
                int i4 = i2 + 1;
                int length = (t.getContent().length() + i4) - 1;
                t.setOffsetInParaRange(new IntRange(i4, length));
                intRef.element = i3 + 1;
                i3 = (intRef.element + t.getContent().length()) - 1;
                t.setOffsetInSentenceRange(new IntRange(intRef.element, i3));
                i2 = length;
            }
            int i5 = i + 1;
            int length2 = (sb.length() + i5) - 1;
            Intrinsics.checkExpressionValueIsNotNull(mmMeetingSentence, "sentence");
            mmMeetingSentence.setOffsetRangeInPara(new IntRange(i5, length2));
            mmMeetingSentence.setContentLength(sb.length());
            sb2.append((CharSequence) sb);
            if (!(mmMeetingSentence.getHighlight() == null || mmMeetingSentence.getHighlight().isEmpty() || (highlight = mmMeetingSentence.getHighlight()) == null)) {
                for (T t2 : highlight) {
                    Intrinsics.checkExpressionValueIsNotNull(t2, "mmHighlightInfo");
                    t2.setOffsetInPara(t2.getOffset() + i5);
                    if (t2.getOffset() + t2.getSize() >= sb.length()) {
                        t2.setSize(sb.length() - t2.getOffset());
                    }
                }
            }
            i = length2;
        }
        mmMeetingParagraph.setParaContentSize(j);
        mmMeetingParagraph.setParaContents(sb2.toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.model.a$a */
    public static final class C46255a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(t.getOffsetInPara()), Integer.valueOf(t2.getOffsetInPara()));
        }
    }

    /* renamed from: a */
    public final void mo162569a(MmMeetingParagraph mmMeetingParagraph, List<MmHighlightInfo> list) {
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "para");
        Intrinsics.checkParameterIsNotNull(list, "tempList");
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                CollectionsKt.sortWith(list, new C46255a());
            }
            ArrayList arrayList = new ArrayList();
            int offsetInPara = list.get(0).getOffsetInPara();
            int size = list.get(0).getSize() + offsetInPara;
            if (list.size() == 1) {
                MmHighlightInfo mmHighlightInfo = new MmHighlightInfo();
                mmHighlightInfo.setOffsetInPara(offsetInPara);
                mmHighlightInfo.setSize(size - offsetInPara);
                arrayList.add(mmHighlightInfo);
                mmMeetingParagraph.setCommentRenderHighlightModel(arrayList);
                return;
            }
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                MmHighlightInfo mmHighlightInfo2 = list.get(i);
                if (mmHighlightInfo2.getOffsetInPara() <= size) {
                    size = Math.max(size, mmHighlightInfo2.getOffsetInPara() + mmHighlightInfo2.getSize());
                    offsetInPara = Math.min(mmHighlightInfo2.getOffsetInPara(), offsetInPara);
                    if (i == list.size() - 1) {
                        MmHighlightInfo mmHighlightInfo3 = new MmHighlightInfo();
                        mmHighlightInfo3.setOffsetInPara(offsetInPara);
                        mmHighlightInfo3.setSize(size - offsetInPara);
                        arrayList.add(mmHighlightInfo3);
                    }
                } else {
                    MmHighlightInfo mmHighlightInfo4 = new MmHighlightInfo();
                    mmHighlightInfo4.setOffsetInPara(offsetInPara);
                    mmHighlightInfo4.setSize(size - offsetInPara);
                    arrayList.add(mmHighlightInfo4);
                    int offsetInPara2 = mmHighlightInfo2.getOffsetInPara();
                    int offsetInPara3 = mmHighlightInfo2.getOffsetInPara() + mmHighlightInfo2.getSize();
                    if (i == list.size() - 1) {
                        MmHighlightInfo mmHighlightInfo5 = new MmHighlightInfo();
                        mmHighlightInfo5.setOffsetInPara(offsetInPara2);
                        mmHighlightInfo5.setSize(offsetInPara3 - offsetInPara2);
                        arrayList.add(mmHighlightInfo5);
                    }
                    offsetInPara = offsetInPara2;
                    size = offsetInPara3;
                }
            }
            mmMeetingParagraph.setCommentRenderHighlightModel(arrayList);
        }
    }

    /* renamed from: a */
    public final ParagraphHighlightInfoViewModel mo162566a(FindResponse findResponse, MmMeetingSubtitles mmMeetingSubtitles) {
        FindResults results;
        List<FindSubtitle> subtitles;
        boolean z;
        T t;
        T t2;
        int i;
        int i2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (mmMeetingSubtitles == null) {
            return new ParagraphHighlightInfoViewModel(concurrentHashMap);
        }
        HighlightStyle highlightStyle = null;
        if (findResponse != null && (results = findResponse.getResults()) != null && (subtitles = results.getSubtitles()) != null) {
            int i3 = 0;
            loop0:
            for (T t3 : subtitles) {
                String pid = t3.getPid();
                if (pid == null || pid.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String pid2 = t3.getPid();
                    if (pid2 == null) {
                        pid2 = "";
                    }
                    List<MmMeetingParagraph> paragraphs = mmMeetingSubtitles.getParagraphs();
                    if (paragraphs == null) {
                        break;
                    }
                    Iterator<T> it = paragraphs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        T t4 = t;
                        Intrinsics.checkExpressionValueIsNotNull(t4, "it");
                        if (Intrinsics.areEqual(t4.getPid(), pid2)) {
                            break;
                        }
                    }
                    T t5 = t;
                    if (t5 == null) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    concurrentHashMap.put(pid2, arrayList);
                    List<FindSentence> sentences = t3.getSentences();
                    if (sentences != null) {
                        for (T t6 : sentences) {
                            String sid = t6.getSid();
                            if (sid == null) {
                                sid = "";
                            }
                            List<MmMeetingSentence> sentences2 = t5.getSentences();
                            if (sentences2 == null) {
                                break loop0;
                            }
                            Iterator<T> it2 = sentences2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    t2 = null;
                                    break;
                                }
                                t2 = it2.next();
                                T t7 = t2;
                                Intrinsics.checkExpressionValueIsNotNull(t7, "it");
                                if (Intrinsics.areEqual(t7.getSid(), sid)) {
                                    break;
                                }
                            }
                            T t8 = t2;
                            if (t8 == null) {
                                break loop0;
                            }
                            List<FindHighlight> highlight = t6.getHighlight();
                            if (highlight != null) {
                                int i4 = i3;
                                for (T t9 : highlight) {
                                    Integer offset = t9.getOffset();
                                    if (offset != null) {
                                        i = offset.intValue();
                                    } else {
                                        i = 0;
                                    }
                                    Integer size = t9.getSize();
                                    if (size != null) {
                                        i2 = size.intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    if (highlightStyle == null) {
                                        highlightStyle = HighlightStyle.INDEX_KEYWORD_FIND;
                                    }
                                    int i5 = i4 + 1;
                                    int a = t8.getOffsetRangeInPara().mo239399a();
                                    Integer offset2 = t9.getOffset();
                                    if (offset2 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    arrayList.add(new SentenceHighlightInfoViewModel(sid, i, i2, highlightStyle, i4, a + offset2.intValue()));
                                    highlightStyle = HighlightStyle.KEYWORD_FIND;
                                    i4 = i5;
                                }
                                i3 = i4;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        }
        return new ParagraphHighlightInfoViewModel(concurrentHashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x032b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Integer> mo162567a(long r27, com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles r29, java.util.LinkedList<com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph> r30, int r31) {
        /*
        // Method dump skipped, instructions count: 1132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.detail.subtitles.model.MmSubtitleDataAdapter.mo162567a(long, com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles, java.util.LinkedList, int):java.util.List");
    }
}
