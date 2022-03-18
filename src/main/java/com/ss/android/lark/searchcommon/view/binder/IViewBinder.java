package com.ss.android.lark.searchcommon.view.binder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import com.ss.android.lark.searchcommon.view.avataritem.subtitle.SubtitleModel;
import com.ss.android.lark.searchcommon.view.avataritem.summary.SummaryModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0015JC\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJS\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010 J\u001d\u0010!\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\"J\u001d\u0010#\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\"J%\u0010$\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\bH\u0016¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(H\u0004J\u0006\u0010+\u001a\u00020\bJ\u0010\u0010,\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\nJ\u000e\u0010-\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006."}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/IViewBinder;", "D", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "H", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "()V", "mIsMultiple", "", "mOnBusinessConsumeItem", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "getMOnBusinessConsumeItem", "()Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "setMOnBusinessConsumeItem", "(Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;)V", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "holder", "(ILcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "bindCheckBoxInner", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", "checkDisable", "Lkotlin/Function0;", "onBusinessConsumeItem", "onItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;ILkotlin/jvm/functions/Function0;Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bindItemClickInner", "onDisableClickHandler", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bindSubTitle", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;)V", "bindSummary", "bindTitle", "isSelectable", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;Z)V", "deDuplicationHighlightKeys", "", "", "list", "isMultiple", "setOnBusinessConsumeItem", "switchMultiple", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.p */
public abstract class IViewBinder<D extends SearchBaseInfo, H extends RecyclerView.ViewHolder> {

    /* renamed from: a */
    private SearchResultView.IOnBusinessConsumeItem f133654a;

    /* renamed from: c */
    public boolean f133655c;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final SearchResultView.IOnBusinessConsumeItem mo184854d() {
        return this.f133654a;
    }

    /* renamed from: e */
    public final boolean mo184855e() {
        return this.f133655c;
    }

    /* renamed from: a */
    public final void mo184852a(SearchResultView.IOnBusinessConsumeItem cVar) {
        this.f133654a = cVar;
    }

    /* renamed from: b */
    public final void mo184853b(boolean z) {
        this.f133655c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<String> mo184848a(List<String> list) {
        HashSet hashSet = new HashSet();
        if (list != null) {
            for (String str : list) {
                hashSet.add(str);
            }
        }
        return CollectionsKt.toList(hashSet);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u000e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "D", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "H", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.p$a */
    static final class View$OnClickListenerC53994a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IViewBinder f133656a;

        /* renamed from: b */
        final /* synthetic */ Function0 f133657b;

        /* renamed from: c */
        final /* synthetic */ Function0 f133658c;

        /* renamed from: d */
        final /* synthetic */ SearchBaseInfo f133659d;

        /* renamed from: e */
        final /* synthetic */ ChatterChatViewHolder f133660e;

        /* renamed from: f */
        final /* synthetic */ int f133661f;

        /* renamed from: g */
        final /* synthetic */ SearchResultView.IOnBusinessConsumeItem f133662g;

        /* renamed from: h */
        final /* synthetic */ SearchResultViewAdapter.IOnItemClickHandler f133663h;

        View$OnClickListenerC53994a(IViewBinder pVar, Function0 function0, Function0 function02, SearchBaseInfo searchBaseInfo, ChatterChatViewHolder aVar, int i, SearchResultView.IOnBusinessConsumeItem cVar, SearchResultViewAdapter.IOnItemClickHandler bVar) {
            this.f133656a = pVar;
            this.f133657b = function0;
            this.f133658c = function02;
            this.f133659d = searchBaseInfo;
            this.f133660e = aVar;
            this.f133661f = i;
            this.f133662g = cVar;
            this.f133663h = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: com.ss.android.lark.searchcommon.view.binder.p */
        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.ss.android.lark.searchcommon.view.binder.p */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.ss.android.lark.searchcommon.view.binder.p */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(View view) {
            if (((Boolean) this.f133657b.invoke()).booleanValue()) {
                Function0 function0 = this.f133658c;
                if (function0 != null) {
                    Unit unit = (Unit) function0.invoke();
                }
                this.f133656a.mo184849a(this.f133659d, this.f133660e, this.f133661f, this.f133657b, this.f133662g, this.f133663h);
            } else if (!this.f133656a.mo184855e() || !this.f133659d.isRequired()) {
                SearchResultView.IOnBusinessConsumeItem cVar = this.f133662g;
                if (cVar == null || !cVar.mo110049b(this.f133659d)) {
                    this.f133660e.mo184645a().getItem().mo184676a(!this.f133659d.isSelected());
                    if (this.f133656a.f133655c) {
                        SearchBaseInfo searchBaseInfo = this.f133659d;
                        searchBaseInfo.selected(true ^ searchBaseInfo.isSelected());
                    } else {
                        this.f133659d.selected(true);
                    }
                    SearchResultViewAdapter.IOnItemClickHandler bVar = this.f133663h;
                    SearchBaseInfo searchBaseInfo2 = this.f133659d;
                    bVar.mo182499a(searchBaseInfo2, searchBaseInfo2.isSelected(), this.f133661f);
                    return;
                }
                this.f133656a.mo184849a(this.f133659d, this.f133660e, this.f133661f, this.f133657b, this.f133662g, this.f133663h);
            } else {
                this.f133656a.mo184849a(this.f133659d, this.f133660e, this.f133661f, this.f133657b, this.f133662g, this.f133663h);
            }
        }
    }

    /* renamed from: b */
    public void mo184808b(D d, ChatterChatViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        SubtitleModel aVar2 = new SubtitleModel(d.getSubTitle());
        aVar2.mo184720a(mo184848a(d.getSubTitleHitTerms()));
        aVar.mo184645a().getItem().mo184668a(aVar2);
    }

    /* renamed from: a */
    public void mo184805a(D d, ChatterChatViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        SummaryModel aVar2 = new SummaryModel(d.getExtraTitle());
        aVar2.mo184726a(mo184848a(d.getExtraTitleHitTerms()));
        aVar.mo184645a().getItem().mo184669a(aVar2);
    }

    /* renamed from: a */
    public void mo184851a(D d, ChatterChatViewHolder aVar, boolean z) {
        boolean z2;
        TitleModel bVar;
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        List<String> titleHitTerms = d.getTitleHitTerms();
        if (titleHitTerms == null || titleHitTerms.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            bVar = new TitleModel(d.getTitle(), false, null, 0, 14, null);
        } else {
            bVar = new TitleModel(d.getTitle(), z, mo184848a(d.getTitleHitTerms()), 0, 8, null);
        }
        aVar.mo184645a().getItem().mo184670a(bVar);
    }

    /* renamed from: a */
    public final void mo184849a(D d, ChatterChatViewHolder aVar, int i, Function0<Boolean> function0, SearchResultView.IOnBusinessConsumeItem cVar, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(function0, "checkDisable");
        Intrinsics.checkParameterIsNotNull(bVar, "onItemClickHandler");
        CheckBoxModel bVar2 = new CheckBoxModel();
        bVar2.mo184707c(mo184855e());
        if (function0.invoke().booleanValue()) {
            bVar2.mo184705b(false);
        } else if (d.isRequired()) {
            bVar2.mo184703a(true);
            bVar2.mo184705b(false);
        } else if (cVar == null || !cVar.mo110048a(d).mo184636a()) {
            bVar2.mo184703a(d.isSelected());
            bVar2.mo184705b(true);
        } else {
            bVar2.mo184703a(cVar.mo110048a(d).mo184637b());
            bVar2.mo184705b(cVar.mo110048a(d).mo184638c());
        }
        if (bVar2.mo184706b()) {
            aVar.mo184645a().mo184575b();
        } else {
            aVar.mo184645a().mo184573a();
            if (DesktopUtil.m144307b() && d.isSelected()) {
                d.selected(!d.isSelected());
                bVar2.mo184703a(false);
                bVar.mo182499a(d, d.isSelected(), i);
            }
        }
        aVar.mo184645a().getItem().mo184665a(bVar2);
    }

    /* renamed from: a */
    public final void mo184850a(D d, ChatterChatViewHolder aVar, int i, Function0<Boolean> function0, Function0<Unit> function02, SearchResultView.IOnBusinessConsumeItem cVar, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(function0, "checkDisable");
        Intrinsics.checkParameterIsNotNull(bVar, "onItemClickHandler");
        aVar.mo184645a().getItem().setOnClickListener(new View$OnClickListenerC53994a(this, function0, function02, d, aVar, i, cVar, bVar));
    }
}
