package com.ss.android.lark.mm.module.detail.main;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.comment.MmCommentControl;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.framework.IMmLifecycle;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarControl;
import com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleControl;
import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import com.ss.android.lark.mm.p2291d.AbstractC45866a;
import com.ss.android.lark.mm.push.IPushRecordSubtitleListener;
import com.ss.android.lark.mm.push.MmPush;
import com.ss.android.lark.mm.service.MmService;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u000eJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u001bJ%\u0010\u001c\u001a\u0004\u0018\u0001H\u001d\"\b\b\u0000\u0010\u001d*\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001f¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\"J`\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00072&\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u0001`\u00162&\u0010'\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u0001`\u0016H\u0016J\"\u0010)\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u00072\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0016J\u0012\u0010-\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010.\u001a\u00020\u000eH\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\u0010\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u000202H\u0016J\u000e\u00103\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u0007J\u000e\u00105\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0007R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u0014j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015`\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "Lcom/ss/android/lark/mm/module/framework/IMmLifecycle;", "Lcom/ss/android/lark/mm/push/MmPush$IPushReactionChangeListener;", "Lcom/ss/android/lark/mm/push/IPushReactionLineChangeListener;", "Lcom/ss/android/lark/mm/push/IPushRecordSubtitleListener;", "Lcom/ss/android/lark/mm/push/MmPush$IPushSummaryChangeListener;", "token", "", "(Ljava/lang/String;)V", "controlInquireFailedCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "clazzName", "", "getControlInquireFailedCallback", "()Lkotlin/jvm/functions/Function1;", "setControlInquireFailedCallback", "(Lkotlin/jvm/functions/Function1;)V", "map", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "Lkotlin/collections/HashMap;", "addControl", "control", "clear", "getAllControls", "", "getControl", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "isEmpty", "", "onChangeReaction", "objectToken", "paragraphMap", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "commentMap", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "onChangeReactionLine", "list", "", "Lcom/ss/android/lark/mm/module/highlight/timeline/HighlightTimeLineItem;", "onChangeSummary", "onCreate", "onDestroy", "onPushRecordSubtitle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "removeControl", "key", "updateToken", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.main.e */
public final class MmControlRegister implements AbstractC45866a, IPushRecordSubtitleListener, MmPush.IPushReactionChangeListener, MmPush.IPushSummaryChangeListener, IMmLifecycle {

    /* renamed from: a */
    private Function1<? super String, Unit> f116120a;

    /* renamed from: b */
    private final HashMap<String, MmBaseControl> f116121b = new HashMap<>();

    /* renamed from: c */
    private String f116122c;

    /* renamed from: e */
    public final void mo161921e() {
        this.f116121b.clear();
    }

    /* renamed from: b */
    public final List<MmBaseControl> mo161917b() {
        Collection<MmBaseControl> values = this.f116121b.values();
        Intrinsics.checkExpressionValueIsNotNull(values, "map.values");
        return CollectionsKt.toList(values);
    }

    /* renamed from: c */
    public final boolean mo161919c() {
        Collection<MmBaseControl> values = this.f116121b.values();
        if (values == null || values.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo161913a() {
        MmService.f115717a.mo161228a().mo161224a().mo161195a((MmPush.IPushReactionChangeListener) this);
        MmService.f115717a.mo161228a().mo161224a().mo161193a((AbstractC45866a) this);
        MmService.f115717a.mo161228a().mo161224a().mo161194a((IPushRecordSubtitleListener) this);
        MmService.f115717a.mo161228a().mo161224a().mo161196a((MmPush.IPushSummaryChangeListener) this);
    }

    /* renamed from: d */
    public void mo161920d() {
        this.f116121b.clear();
        MmService.f115717a.mo161228a().mo161224a().mo161203b((MmPush.IPushReactionChangeListener) this);
        MmService.f115717a.mo161228a().mo161224a().mo161201b((AbstractC45866a) this);
        MmService.f115717a.mo161228a().mo161224a().mo161202b((IPushRecordSubtitleListener) this);
        MmService.f115717a.mo161228a().mo161224a().mo161204b((MmPush.IPushSummaryChangeListener) this);
    }

    /* renamed from: a */
    public final void mo161916a(Function1<? super String, Unit> function1) {
        this.f116120a = function1;
    }

    /* renamed from: a */
    public final void mo161915a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        this.f116122c = str;
    }

    public MmControlRegister(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f116122c = str;
    }

    @Override // com.ss.android.lark.mm.push.MmPush.IPushSummaryChangeListener
    /* renamed from: c */
    public void mo161206c(String str) {
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl;
        if (!(!Intrinsics.areEqual(str, this.f116122c)) && (mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) mo161912a(MmMeetingBaseInfoControl.class)) != null) {
            mmMeetingBaseInfoControl.mo161593l();
        }
    }

    /* renamed from: a */
    public final <T extends MmBaseControl> T mo161912a(Class<T> cls) {
        Function1<? super String, Unit> function1;
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        if (this.f116121b.get(cls.getName()) == null && (function1 = this.f116120a) != null) {
            String name = cls.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "clazz.name");
            function1.invoke(name);
        }
        T t = (T) this.f116121b.get(cls.getName());
        if (!(t instanceof MmBaseControl)) {
            return null;
        }
        return t;
    }

    /* renamed from: b */
    public final void mo161918b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        MmBaseControl remove = this.f116121b.remove(str);
        if (remove != null) {
            remove.mo161235k();
        }
    }

    /* renamed from: a */
    public final void mo161914a(MmBaseControl hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "control");
        if (!this.f116121b.containsKey(hVar.getClass().getName())) {
            String name = hVar.getClass().getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "control::class.java.name");
            this.f116121b.put(name, hVar);
        }
    }

    @Override // com.ss.android.lark.mm.push.IPushRecordSubtitleListener
    /* renamed from: a */
    public void mo161192a(MmRecordSentence mmRecordSentence) {
        MmRecordSubtitleControl eVar;
        Intrinsics.checkParameterIsNotNull(mmRecordSentence, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!(!Intrinsics.areEqual(mmRecordSentence.getObjectToken(), this.f116122c)) && (eVar = (MmRecordSubtitleControl) mo161912a(MmRecordSubtitleControl.class)) != null) {
            eVar.mo161192a(mmRecordSentence);
        }
    }

    @Override // com.ss.android.lark.mm.p2291d.AbstractC45866a
    /* renamed from: a */
    public void mo161191a(String str, List<HighlightTimeLineItem> list) {
        MmVideoToolbarControl fVar;
        if (!(!Intrinsics.areEqual(str, this.f116122c)) && (fVar = (MmVideoToolbarControl) mo161912a(MmVideoToolbarControl.class)) != null) {
            fVar.mo164230a(list);
        }
    }

    @Override // com.ss.android.lark.mm.push.MmPush.IPushReactionChangeListener
    /* renamed from: a */
    public void mo161205a(String str, HashMap<String, MmMeetingParagraph> hashMap, HashMap<String, MmComment.MmCommentInfo> hashMap2) {
        MmCommentControl dVar;
        MmMeetingSubtitleControl dVar2;
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        if (!(!Intrinsics.areEqual(str, this.f116122c))) {
            if (!(hashMap == null || (dVar2 = (MmMeetingSubtitleControl) mo161912a(MmMeetingSubtitleControl.class)) == null)) {
                dVar2.mo162303a(hashMap);
            }
            if (hashMap2 != null && (dVar = (MmCommentControl) mo161912a(MmCommentControl.class)) != null) {
                dVar.mo161695a(hashMap2);
            }
        }
    }
}
