package com.ss.android.lark.mm.module.participant;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.share.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00020\u00132\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00132\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001cR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/ParticipantListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/mm/module/participant/ParticipantListAdapter$ViewHolder;", "repoId", "", "objectToken", "isCanModify", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "dataList", "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "()Z", "getObjectToken", "()Ljava/lang/String;", "getRepoId", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onFirstPage", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onNextPage", "ViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.participant.b */
public final class ParticipantListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final List<MmParticipants.MmParticipantInfo> f117225a = new ArrayList();

    /* renamed from: b */
    private final String f117226b;

    /* renamed from: c */
    private final String f117227c;

    /* renamed from: d */
    private final boolean f117228d;

    /* renamed from: a */
    public final String mo163548a() {
        return this.f117226b;
    }

    /* renamed from: b */
    public final String mo163551b() {
        return this.f117227c;
    }

    /* renamed from: c */
    public final boolean mo163553c() {
        return this.f117228d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f117225a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/ParticipantListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ss/android/lark/mm/module/participant/ParticipantsListItemView;", "(Lcom/ss/android/lark/mm/module/participant/ParticipantListAdapter;Lcom/ss/android/lark/mm/module/participant/ParticipantsListItemView;)V", "getView", "()Lcom/ss/android/lark/mm/module/participant/ParticipantsListItemView;", "bindData", "", "participant", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.b$a */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ParticipantListAdapter f117229a;

        /* renamed from: b */
        private final ParticipantsListItemView f117230b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.participant.b$a$a */
        public static final class C46585a extends Lambda implements Function0<Unit> {
            final /* synthetic */ MmParticipants.MmParticipantInfo $participant;
            final /* synthetic */ ViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46585a(ViewHolder aVar, MmParticipants.MmParticipantInfo mmParticipantInfo) {
                super(0);
                this.this$0 = aVar;
                this.$participant = mmParticipantInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                List<MmParticipants.MmParticipantInfo> list = this.this$0.f117229a.f117225a;
                int indexOf = list.indexOf(this.$participant);
                if (indexOf >= 0) {
                    list.remove(indexOf);
                    this.this$0.f117229a.notifyItemRemoved(indexOf);
                }
            }
        }

        /* renamed from: a */
        public final void mo163554a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "participant");
            this.f117230b.mo163499a(this.f117229a.mo163548a(), User.Companion.mo165177a(mmParticipantInfo), this.f117229a.mo163551b(), this.f117229a.mo163553c(), new C46585a(this, mmParticipantInfo));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ParticipantListAdapter bVar, ParticipantsListItemView participantsListItemView) {
            super(participantsListItemView);
            Intrinsics.checkParameterIsNotNull(participantsListItemView, "view");
            this.f117229a = bVar;
            this.f117230b = participantsListItemView;
        }
    }

    /* renamed from: b */
    public final void mo163552b(List<? extends MmParticipants.MmParticipantInfo> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f117225a.add(it.next());
                notifyItemInserted(this.f117225a.size() - 1);
            }
        }
    }

    /* renamed from: a */
    public final void mo163550a(List<? extends MmParticipants.MmParticipantInfo> list) {
        this.f117225a.clear();
        if (list != null) {
            this.f117225a.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        return new ViewHolder(this, new ParticipantsListItemView(context));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo163554a(this.f117225a.get(i));
    }

    public ParticipantListAdapter(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(str2, "objectToken");
        this.f117226b = str;
        this.f117227c = str2;
        this.f117228d = z;
    }
}
