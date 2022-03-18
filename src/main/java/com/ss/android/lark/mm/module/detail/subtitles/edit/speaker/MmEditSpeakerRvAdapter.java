package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u0004\u0018\u00010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0006\u0010\u0018\u001a\u00020\u0011J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001bJ\u0014\u0010\u001c\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callback", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter$IEditSpeakerCallback;", "(Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter$IEditSpeakerCallback;)V", "getCallback", "()Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter$IEditSpeakerCallback;", "keywordsIsEmpty", "", "speakers", "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "getCurrentSelectedSpeaker", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNoneSelected", "setSearchSpeakers", "searchSpeakers", "", "update", "IEditSpeakerCallback", "SpeakerItemViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.d */
public final class MmEditSpeakerRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final List<MmParticipants.MmParticipantInfo> f116481a = new ArrayList();

    /* renamed from: b */
    private boolean f116482b = true;

    /* renamed from: c */
    private final IEditSpeakerCallback f116483c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter$IEditSpeakerCallback;", "", "onChangingSpeaker", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.d$a */
    public interface IEditSpeakerCallback {
        /* renamed from: a */
        void mo162382a();
    }

    /* renamed from: c */
    public final IEditSpeakerCallback mo162407c() {
        return this.f116483c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f116481a.size();
    }

    /* renamed from: b */
    public final MmParticipants.MmParticipantInfo mo162406b() {
        T t;
        Iterator<T> it = this.f116481a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t._isSelected()) {
                break;
            }
        }
        return t;
    }

    /* renamed from: a */
    public final void mo162403a() {
        T t;
        Iterator<T> it = this.f116481a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t._isSelected()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            t2.setIsSelected(false);
            notifyItemChanged(this.f116481a.indexOf(t2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter$SpeakerItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter;Landroid/view/View;)V", "avatarIv", "Landroid/widget/ImageView;", "bottomEdgeLayout", "checkMark", "currentSpeakLabel", "divider", "nameLayout", "speakerItemLayout", "speakerName", "Landroid/widget/TextView;", "tenantNameTv", "topEdgeLayout", "tvExternalLabel", "getView", "()Landroid/view/View;", "bind", "", "speaker", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "bindSpeakerData", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.d$b */
    public final class SpeakerItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f116484a;

        /* renamed from: b */
        public final TextView f116485b;

        /* renamed from: c */
        public final View f116486c;

        /* renamed from: d */
        public final View f116487d;

        /* renamed from: e */
        public final View f116488e;

        /* renamed from: f */
        final /* synthetic */ MmEditSpeakerRvAdapter f116489f;

        /* renamed from: g */
        private final View f116490g;

        /* renamed from: h */
        private final View f116491h;

        /* renamed from: i */
        private final View f116492i;

        /* renamed from: j */
        private final View f116493j;

        /* renamed from: k */
        private final TextView f116494k;

        /* renamed from: l */
        private final View f116495l;

        /* renamed from: m */
        private final View f116496m;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.d$b$c */
        public static final class RunnableC46231c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ SpeakerItemViewHolder f116499a;

            RunnableC46231c(SpeakerItemViewHolder bVar) {
                this.f116499a = bVar;
            }

            public final void run() {
                int i;
                int i2 = 0;
                if (this.f116499a.f116486c.getVisibility() == 0) {
                    this.f116499a.f116486c.measure(0, 0);
                    i = this.f116499a.f116486c.getMeasuredWidth();
                } else {
                    i = 0;
                }
                if (this.f116499a.f116487d.getVisibility() == 0) {
                    this.f116499a.f116487d.measure(0, 0);
                    i2 = this.f116499a.f116487d.getMeasuredWidth();
                }
                this.f116499a.f116485b.setMaxWidth(((this.f116499a.f116488e.getMeasuredWidth() - i) - i2) - C57582a.m223600a(30));
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.d$b$b */
        public static final class C46230b extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ SpeakerItemViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46230b(SpeakerItemViewHolder bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkParameterIsNotNull(view, "it");
                C45855f.m181664c("MmEditSpeakerRvAdapter", "click speakerItemLayout");
                Iterator<MmParticipants.MmParticipantInfo> it = this.this$0.f116489f.f116481a.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next()._isSelected()) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    this.this$0.f116489f.f116481a.get(i).setIsSelected(false);
                    this.this$0.f116489f.notifyItemChanged(i);
                }
                this.this$0.f116489f.f116481a.get(this.this$0.getAdapterPosition()).setIsSelected(true);
                this.this$0.f116489f.notifyItemChanged(this.this$0.getAdapterPosition());
                this.this$0.f116489f.mo162407c().mo162382a();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "onBitmapLoaded"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.d$b$a */
        public static final class C46229a implements C45853e.AbstractC45854a {

            /* renamed from: a */
            final /* synthetic */ SpeakerItemViewHolder f116497a;

            /* renamed from: b */
            final /* synthetic */ MmParticipants.MmParticipantInfo f116498b;

            C46229a(SpeakerItemViewHolder bVar, MmParticipants.MmParticipantInfo mmParticipantInfo) {
                this.f116497a = bVar;
                this.f116498b = mmParticipantInfo;
            }

            @Override // com.ss.android.lark.mm.p2288b.C45853e.AbstractC45854a
            /* renamed from: a */
            public final void mo161154a(Bitmap bitmap) {
                if (bitmap != null && Intrinsics.areEqual(this.f116497a.f116484a.getTag(), this.f116498b.getAvatarUrl())) {
                    this.f116497a.f116484a.setImageBitmap(bitmap);
                }
            }
        }

        /* renamed from: a */
        public final void mo162408a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "speaker");
            if (mmParticipantInfo.is_paragraph_speaker()) {
                this.f116492i.setVisibility(0);
                this.f116493j.setVisibility(0);
            } else {
                this.f116492i.setVisibility(8);
                this.f116493j.setVisibility(8);
            }
            m183037b(mmParticipantInfo);
        }

        /* renamed from: b */
        private final void m183037b(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            int i;
            View view = this.f116491h;
            if (mmParticipantInfo._isSelected()) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
            this.f116485b.setText(mmParticipantInfo.getUserName());
            this.f116484a.setTag(mmParticipantInfo.getAvatarUrl());
            C45853e.m181656a(this.f116484a.getContext(), mmParticipantInfo.getAvatarUrl(), C57582a.m223600a(48), C57582a.m223600a(48), new C46229a(this, mmParticipantInfo));
            boolean z = true;
            if (mmParticipantInfo.is_external()) {
                this.f116487d.setVisibility(0);
                String tenant_name = mmParticipantInfo.getTenant_name();
                if (!(tenant_name == null || tenant_name.length() == 0)) {
                    z = false;
                }
                if (z) {
                    this.f116494k.setVisibility(8);
                } else {
                    this.f116494k.setVisibility(0);
                    this.f116494k.setText(mmParticipantInfo.getTenant_name());
                }
            } else {
                this.f116487d.setVisibility(8);
                String department_name = mmParticipantInfo.getDepartment_name();
                if (!(department_name == null || department_name.length() == 0)) {
                    z = false;
                }
                if (z) {
                    this.f116494k.setVisibility(8);
                } else {
                    this.f116494k.setVisibility(0);
                    this.f116494k.setText(mmParticipantInfo.getDepartment_name());
                }
            }
            if (mmParticipantInfo.is_paragraph_speaker()) {
                this.f116495l.setVisibility(8);
                this.f116486c.setVisibility(0);
            } else {
                this.f116495l.setVisibility(0);
                this.f116486c.setVisibility(8);
            }
            C47110e.m186573a(this.f116490g, new C46230b(this));
            this.f116488e.postDelayed(new RunnableC46231c(this), 100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SpeakerItemViewHolder(MmEditSpeakerRvAdapter dVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f116489f = dVar;
            this.f116496m = view;
            View findViewById = view.findViewById(R.id.speakerItem);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.speakerItem)");
            this.f116490g = findViewById;
            View findViewById2 = view.findViewById(R.id.avatarIv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.avatarIv)");
            this.f116484a = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.speakerName);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.speakerName)");
            this.f116485b = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.checkMark);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.checkMark)");
            this.f116491h = findViewById4;
            View findViewById5 = view.findViewById(R.id.topEdge);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById(R.id.topEdge)");
            this.f116492i = findViewById5;
            View findViewById6 = view.findViewById(R.id.bottomEdge);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.bottomEdge)");
            this.f116493j = findViewById6;
            View findViewById7 = view.findViewById(R.id.tenantNameTv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.findViewById(R.id.tenantNameTv)");
            this.f116494k = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.currentSpeakLabel);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "view.findViewById(R.id.currentSpeakLabel)");
            this.f116486c = findViewById8;
            View findViewById9 = view.findViewById(R.id.tvExternalLabel);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "view.findViewById(R.id.tvExternalLabel)");
            this.f116487d = findViewById9;
            View findViewById10 = view.findViewById(R.id.nameLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "view.findViewById(R.id.nameLayout)");
            this.f116488e = findViewById10;
            View findViewById11 = view.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById11, "view.findViewById(R.id.divider)");
            this.f116495l = findViewById11;
        }
    }

    public MmEditSpeakerRvAdapter(IEditSpeakerCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f116483c = aVar;
    }

    /* renamed from: a */
    public final void mo162404a(List<? extends MmParticipants.MmParticipantInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "speakers");
        this.f116481a.clear();
        this.f116481a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof SpeakerItemViewHolder) {
            ((SpeakerItemViewHolder) viewHolder).mo162408a(this.f116481a.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_item_speaker, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new SpeakerItemViewHolder(this, inflate);
    }

    /* renamed from: a */
    public final void mo162405a(boolean z, List<? extends MmParticipants.MmParticipantInfo> list) {
        this.f116482b = z;
        this.f116481a.clear();
        if (list != null) {
            this.f116481a.addAll(list);
        }
        notifyDataSetChanged();
    }
}
