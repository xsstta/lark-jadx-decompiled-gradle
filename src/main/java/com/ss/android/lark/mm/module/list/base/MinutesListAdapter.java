package com.ss.android.lark.mm.module.list.base;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.module.list.widget.MinutesListItemView;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00011B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JQ\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00100\u0018J\u0016\u0010\u001c\u001a\u00020\u00102\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012J&\u0010\u001e\u001a\u00020\u00102\u001e\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160!0 J\u0010\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\nJ\u001f\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0016H\u0016JC\u0010)\u001a\u00020\u00142\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00100\u0018H\u0002J\u001c\u0010*\u001a\u00020\u00102\n\u0010+\u001a\u00060\u0002R\u00020\u00002\u0006\u0010,\u001a\u00020\u0016H\u0016J\u001c\u0010-\u001a\u00060\u0002R\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0016H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u00062"}, d2 = {"Lcom/ss/android/lark/mm/module/list/base/MinutesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/mm/module/list/base/MinutesListAdapter$ViewHolder;", "ds", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "repoId", "", "(Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;Ljava/lang/String;)V", "dataList", "", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "getDs", "()Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "getRepoId", "()Ljava/lang/String;", "bindData", "", "list", "", "isFirstPage", "", "visiblePos", "", "scrollTo", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "pos", "bindDuration", "duration", "bindProgress", "progressMap", "", "Lkotlin/Pair;", "bindRecording", "recording", "bindUploading", "recordingToken", "uploadProgress", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getItemCount", "insertRecordingItemToHeader", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.base.e */
public final class MinutesListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final List<MinutesSummaryData> f116792a = new ArrayList();

    /* renamed from: b */
    private final MmListControl.DataSource f116793b;

    /* renamed from: c */
    private final String f116794c;

    /* renamed from: a */
    public final MmListControl.DataSource mo162955a() {
        return this.f116793b;
    }

    /* renamed from: b */
    public final String mo162962b() {
        return this.f116794c;
    }

    /* renamed from: a */
    public final void mo162961a(Map<String, Pair<Integer, Integer>> map) {
        Intrinsics.checkParameterIsNotNull(map, "progressMap");
        for (T t : this.f116792a) {
            Pair<Integer, Integer> pair = map.get(t.getObjectToken());
            if (pair == null) {
                pair = TuplesKt.to(null, null);
            }
            Integer component1 = pair.component1();
            Integer component2 = pair.component2();
            if ((!Intrinsics.areEqual(t.getProcessingProgress(), component2)) || (!Intrinsics.areEqual(t.getProcessingStatus(), component1))) {
                t.setProcessingStatus(component1);
                t.setProcessingProgress(component2);
                notifyItemChanged(this.f116792a.indexOf(t));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f116792a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/list/base/MinutesListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ss/android/lark/mm/module/list/widget/MinutesListItemView;", "(Lcom/ss/android/lark/mm/module/list/base/MinutesListAdapter;Lcom/ss/android/lark/mm/module/list/widget/MinutesListItemView;)V", "getView", "()Lcom/ss/android/lark/mm/module/list/widget/MinutesListItemView;", "bindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.e$a */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MinutesListAdapter f116795a;

        /* renamed from: b */
        private final MinutesListItemView f116796b;

        /* renamed from: a */
        public final void mo162963a(MinutesSummaryData minutesSummaryData) {
            Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f116796b.mo163298a(minutesSummaryData, this.f116795a.mo162955a(), this.f116795a.mo162962b());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MinutesListAdapter eVar, MinutesListItemView minutesListItemView) {
            super(minutesListItemView);
            Intrinsics.checkParameterIsNotNull(minutesListItemView, "view");
            this.f116795a = eVar;
            this.f116796b = minutesListItemView;
        }
    }

    /* renamed from: a */
    public final void mo162958a(MinutesSummaryData minutesSummaryData) {
        Long l;
        T t;
        MmRecordManager.RecordState recordState;
        String str;
        Iterator<T> it = this.f116792a.iterator();
        while (true) {
            l = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            String objectToken = t.getObjectToken();
            if (minutesSummaryData != null) {
                str = minutesSummaryData.getObjectToken();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(objectToken, str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            if (minutesSummaryData != null) {
                recordState = minutesSummaryData.getRecordingStatus();
            } else {
                recordState = null;
            }
            t2.setRecordingStatus(recordState);
            if (minutesSummaryData != null) {
                l = minutesSummaryData.getDuration();
            }
            t2.setDuration(l);
            notifyItemChanged(this.f116792a.indexOf(t2));
        }
    }

    /* renamed from: a */
    public final void mo162960a(List<MinutesSummaryData> list) {
        if (list != null) {
            for (T t : list) {
                int i = 0;
                for (T t2 : this.f116792a) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    T t3 = t2;
                    if (Intrinsics.areEqual(t3.getObjectToken(), t.getObjectToken())) {
                        t3.setDuration(t.getDuration());
                        notifyItemChanged(i);
                    }
                    i = i2;
                }
            }
        }
    }

    public MinutesListAdapter(MmListControl.DataSource dataSource, String str) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        this.f116793b = dataSource;
        this.f116794c = str;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        return new ViewHolder(this, new MinutesListItemView(context));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo162963a(this.f116792a.get(i));
    }

    /* renamed from: a */
    public final void mo162959a(String str, Integer num) {
        T t;
        Iterator<T> it = this.f116792a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.getObjectToken(), str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            int indexOf = this.f116792a.indexOf(t2);
            this.f116792a.set(indexOf, MinutesSummaryData.copy$default(t2, null, null, null, Integer.valueOf(ObjectStatus.RealTimeCompleteUploading.getValue()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, num, null, null, 234881015, null));
            notifyItemChanged(indexOf);
        }
    }

    /* renamed from: a */
    private final boolean m183571a(List<MinutesSummaryData> list, int i, Function1<? super Integer, Unit> function1) {
        T t;
        if (list == null || list.isEmpty()) {
            return false;
        }
        MinutesSummaryData minutesSummaryData = (MinutesSummaryData) CollectionsKt.first((List) list);
        Iterator<T> it = this.f116792a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.getObjectToken(), minutesSummaryData.getObjectToken())) {
                break;
            }
        }
        if (t != null || !ObjectStatus.Companion.mo161608c(minutesSummaryData.getStatus())) {
            return false;
        }
        this.f116792a.add(0, minutesSummaryData);
        notifyItemInserted(0);
        if (i == 0) {
            function1.invoke(0);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo162957a(MmListControl.DataSource dataSource, List<MinutesSummaryData> list, boolean z, int i, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(function1, "scrollTo");
        C45855f.m181663b("MinutesListAdapter", "bindData，isFirstPage:" + z + ", ds: " + dataSource);
        m183571a(list, i, function1);
        if (list != null) {
            List<MinutesSummaryData> list2 = list;
            if (!list2.isEmpty()) {
                this.f116792a.clear();
                this.f116792a.addAll(list2);
                notifyItemRangeChanged(0, getItemCount());
                return;
            }
        }
        this.f116792a.clear();
        notifyDataSetChanged();
    }
}
