package com.ss.android.vc.meeting.module.chat;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.chat.vh.NormalMessageVH;
import com.ss.android.vc.meeting.module.chat.vh.SystemMessageVH;
import com.ss.android.vc.meeting.module.chat.vh.UnknownTypeVH;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.chat.j */
public class C61596j extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private C1356d<InteractionMessage> f154534a = new C1356d<>(this, new C1374g.AbstractC1378c<InteractionMessage>() {
        /* class com.ss.android.vc.meeting.module.chat.C61596j.C615971 */

        /* renamed from: a */
        public boolean areItemsTheSame(InteractionMessage aVar, InteractionMessage aVar2) {
            return C26247a.m94980a((AbstractC26248b) aVar, (AbstractC26248b) aVar2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(InteractionMessage aVar, InteractionMessage aVar2) {
            return C26247a.m94983b(aVar, aVar2);
        }
    });

    /* renamed from: b */
    private C61303k f154535b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        C1356d<InteractionMessage> dVar = this.f154534a;
        if (dVar == null) {
            return 0;
        }
        return dVar.mo7374a().size();
    }

    /* renamed from: com.ss.android.vc.meeting.module.chat.j$2 */
    static /* synthetic */ class C615982 {

        /* renamed from: a */
        static final /* synthetic */ int[] f154537a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType[] r0 = com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.chat.C61596j.C615982.f154537a = r0
                com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType r1 = com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.chat.C61596j.C615982.f154537a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType r1 = com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType.SYSTEM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.chat.C61596j.C615982.<clinit>():void");
        }
    }

    /* renamed from: a */
    public InteractionMessage mo213450a(int i) {
        return this.f154534a.mo7374a().get(i);
    }

    public C61596j(C61303k kVar) {
        this.f154535b = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = C615982.f154537a[mo213450a(i).mo216914b().ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo213451a(List<InteractionMessage> list) {
        C60700b.m235851b("MeetingChatAdapter", "[setData]", "size = " + list.size());
        this.f154534a.mo7376a(list);
        C60700b.m235851b("MeetingChatAdapter", "[setData2]", "mDiffer.currentList.size = " + this.f154534a.mo7374a().size());
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof NormalMessageVH) {
            ((NormalMessageVH) viewHolder).mo213392a(this.f154535b, mo213450a(i));
        } else if (viewHolder instanceof SystemMessageVH) {
            ((SystemMessageVH) viewHolder).mo213396a(this.f154535b, mo213450a(i));
        } else if (viewHolder instanceof UnknownTypeVH) {
            ((UnknownTypeVH) viewHolder).mo213400a(this.f154535b, mo213450a(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new NormalMessageVH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_im_normal_message, viewGroup, false));
        }
        if (i == 0) {
            return new SystemMessageVH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_im_join_mesaage, viewGroup, false));
        }
        if (i == 2) {
            return new UnknownTypeVH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_im_unknown_type, viewGroup, false));
        }
        return null;
    }
}
