package com.ss.android.lark.mm.module.podcast.subtitle;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitleLine;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0006\u0010\u001b\u001a\u00020\u0014J\u0014\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eJ\u0014\u0010\u001f\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "currentHighlightPositions", "", "", "getCurrentHighlightPositions", "()Ljava/util/List;", "value", "currentSelectionPosition", "getCurrentSelectionPosition", "()I", "setCurrentSelectionPosition", "(I)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitleLine;", "lastHighlightPositions", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetSelection", "setCurrentPlayingPosition", "newPlayingPositions", "", "update", "MmPodcastViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.e */
public final class MmPodcastSubtitleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final List<MmSubtitleLine> f117763a = new ArrayList();

    /* renamed from: b */
    private final List<Integer> f117764b;

    /* renamed from: c */
    private final List<Integer> f117765c;

    /* renamed from: d */
    private int f117766d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleAdapter$MmPodcastViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "sentenceTv", "Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastTextView;", "kotlin.jvm.PlatformType", "getSentenceTv", "()Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastTextView;", "bind", "", "mmSubtitleLine", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitleLine;", "setBackground", "setPaddingTop", "setTextColor", "setTextSize", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.e$a */
    public final class MmPodcastViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleAdapter f117767a;

        /* renamed from: b */
        private final MmPodcastTextView f117768b;

        /* renamed from: c */
        private final View f117769c;

        /* renamed from: a */
        public final MmPodcastTextView mo164423a() {
            return this.f117768b;
        }

        /* renamed from: b */
        private final void m185442b() {
            int i;
            if (this.f117767a.mo164417a().contains(Integer.valueOf(getAdapterPosition())) || this.f117767a.mo164417a().contains(Integer.valueOf(getAdapterPosition() - 1))) {
                i = C57582a.m223600a(18);
            } else {
                i = C57582a.m223600a(12);
            }
            this.itemView.setPadding(0, i, 0, 0);
        }

        /* renamed from: c */
        private final void m185443c() {
            int i;
            if (this.f117767a.mo164417a().contains(Integer.valueOf(getAdapterPosition()))) {
                i = C57582a.m223601a(this.f117769c.getContext(), 26.0f);
            } else {
                i = C57582a.m223601a(this.f117769c.getContext(), 20.0f);
            }
            this.f117768b.setTextSize(0, (float) i);
        }

        /* renamed from: d */
        private final void m185444d() {
            int i;
            if (this.f117767a.mo164417a().contains(Integer.valueOf(getAdapterPosition()))) {
                i = -1;
            } else {
                i = Color.parseColor("#59FFFFFF");
            }
            this.f117768b.setTextColor(i);
        }

        /* renamed from: e */
        private final void m185445e() {
            if (getAdapterPosition() == this.f117767a.mo164420b()) {
                this.f117768b.setBackgroundResource(R.drawable.mm_bg_podcast_selected);
                return;
            }
            MmPodcastTextView mmPodcastTextView = this.f117768b;
            Intrinsics.checkExpressionValueIsNotNull(mmPodcastTextView, "sentenceTv");
            mmPodcastTextView.setBackground(null);
        }

        /* renamed from: a */
        public final void mo164424a(MmSubtitleLine mmSubtitleLine) {
            Intrinsics.checkParameterIsNotNull(mmSubtitleLine, "mmSubtitleLine");
            MmPodcastTextView mmPodcastTextView = this.f117768b;
            Intrinsics.checkExpressionValueIsNotNull(mmPodcastTextView, "sentenceTv");
            mmPodcastTextView.setText(mmSubtitleLine.content);
            m185442b();
            m185443c();
            m185444d();
            m185445e();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MmPodcastViewHolder(MmPodcastSubtitleAdapter eVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "container");
            this.f117767a = eVar;
            this.f117769c = view;
            this.f117768b = (MmPodcastTextView) view.findViewById(R.id.sentenceTv);
        }
    }

    /* renamed from: a */
    public final List<Integer> mo164417a() {
        return this.f117764b;
    }

    /* renamed from: b */
    public final int mo164420b() {
        return this.f117766d;
    }

    /* renamed from: c */
    public final void mo164422c() {
        mo164418a(-1);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f117763a.size();
    }

    public MmPodcastSubtitleAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f117764b = arrayList;
        this.f117765c = new ArrayList();
        this.f117766d = -1;
        arrayList.add(0);
    }

    /* renamed from: a */
    public final void mo164418a(int i) {
        this.f117766d = i;
        if (i != -1) {
            notifyItemChanged(i);
        }
    }

    /* renamed from: a */
    public final void mo164419a(List<? extends MmSubtitleLine> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f117763a.clear();
        this.f117763a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo164421b(List<Integer> list) {
        Intrinsics.checkParameterIsNotNull(list, "newPlayingPositions");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!this.f117764b.contains(Integer.valueOf(t.intValue()))) {
                arrayList.add(t);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f117765c.clear();
            this.f117765c.addAll(this.f117764b);
            this.f117764b.clear();
            for (Integer num : this.f117765c) {
                notifyItemChanged(num.intValue());
            }
            this.f117764b.addAll(list);
            for (Integer num2 : this.f117764b) {
                notifyItemChanged(num2.intValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof MmPodcastViewHolder) {
            ((MmPodcastViewHolder) viewHolder).mo164424a(this.f117763a.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_podcast_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…cast_item, parent, false)");
        return new MmPodcastViewHolder(this, inflate);
    }
}
