package com.ss.android.lark.mm.module.participant.add;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.p2288b.C45853e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\"\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\f2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter$ViewHolder;", "listener", "Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter$IMmSelectedParticipantsAdapterListener;", "(Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter$IMmSelectedParticipantsAdapterListener;)V", "dataList", "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "getListener", "()Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter$IMmSelectedParticipantsAdapterListener;", "appendData", "", "user", "bindData", "userList", "", "scrollToEnd", "Lkotlin/Function0;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeData", "IMmSelectedParticipantsAdapterListener", "ViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.participant.add.c */
public final class MmSelectedParticipantsAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public List<MmParticipants.MmParticipantInfo> f117219a;

    /* renamed from: b */
    private final IMmSelectedParticipantsAdapterListener f117220b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter$IMmSelectedParticipantsAdapterListener;", "", "onUnSelectMember", "", "member", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.c$a */
    public interface IMmSelectedParticipantsAdapterListener {
        /* renamed from: c */
        void mo163528c(MmParticipants.MmParticipantInfo mmParticipantInfo);
    }

    /* renamed from: a */
    public final IMmSelectedParticipantsAdapterListener mo163540a() {
        return this.f117220b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<MmParticipants.MmParticipantInfo> list = this.f117219a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public MmSelectedParticipantsAdapter(IMmSelectedParticipantsAdapterListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f117220b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "(Lcom/ss/android/lark/mm/module/participant/add/MmSelectedParticipantsAdapter;Lcom/larksuite/component/universe_design/image/UDAvatar;)V", "getView", "()Lcom/larksuite/component/universe_design/image/UDAvatar;", "bindData", "", "result", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.c$b */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MmSelectedParticipantsAdapter f117221a;

        /* renamed from: b */
        private final UDAvatar f117222b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.participant.add.c$b$a */
        public static final class View$OnClickListenerC46584a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f117223a;

            /* renamed from: b */
            final /* synthetic */ MmParticipants.MmParticipantInfo f117224b;

            View$OnClickListenerC46584a(ViewHolder bVar, MmParticipants.MmParticipantInfo mmParticipantInfo) {
                this.f117223a = bVar;
                this.f117224b = mmParticipantInfo;
            }

            public final void onClick(View view) {
                List<MmParticipants.MmParticipantInfo> list = this.f117223a.f117221a.f117219a;
                if (list != null) {
                    list.remove(this.f117224b);
                }
                this.f117223a.f117221a.notifyItemRemoved(this.f117223a.getAdapterPosition());
                this.f117223a.f117221a.mo163540a().mo163528c(this.f117224b);
            }
        }

        /* renamed from: a */
        public final void mo163545a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "result");
            C45853e.m181659a(this.f117222b, mmParticipantInfo.getUserId(), mmParticipantInfo.getAvatarUrl(), mmParticipantInfo.getAvatarUrl());
            this.f117222b.setOnClickListener(new View$OnClickListenerC46584a(this, mmParticipantInfo));
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
            layoutParams.leftMargin = UIUtils.dp2px(this.f117222b.getContext(), 12.0f);
            layoutParams.rightMargin = 0;
            int dp2px = UIUtils.dp2px(this.f117222b.getContext(), 8.0f);
            layoutParams.topMargin = dp2px;
            layoutParams.bottomMargin = dp2px;
            this.f117222b.setLayoutParams(layoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MmSelectedParticipantsAdapter cVar, UDAvatar uDAvatar) {
            super(uDAvatar);
            Intrinsics.checkParameterIsNotNull(uDAvatar, "view");
            this.f117221a = cVar;
            this.f117222b = uDAvatar;
        }
    }

    /* renamed from: a */
    public final void mo163543a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "user");
        List<MmParticipants.MmParticipantInfo> list = this.f117219a;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f117219a = arrayList;
            if (arrayList != null) {
                arrayList.add(mmParticipantInfo);
            }
            notifyDataSetChanged();
        } else if (list != null && !list.contains(mmParticipantInfo)) {
            List<MmParticipants.MmParticipantInfo> list2 = this.f117219a;
            if (list2 != null) {
                list2.add(mmParticipantInfo);
            }
            notifyItemInserted(getItemCount());
        }
    }

    /* renamed from: b */
    public final void mo163544b(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        boolean z;
        List<MmParticipants.MmParticipantInfo> list;
        Integer num;
        T t;
        Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "user");
        List<MmParticipants.MmParticipantInfo> list2 = this.f117219a;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (list = this.f117219a) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                num = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual(t.getUserId(), mmParticipantInfo.getUserId())) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                List<MmParticipants.MmParticipantInfo> list3 = this.f117219a;
                if (list3 != null) {
                    num = Integer.valueOf(list3.indexOf(t2));
                }
                List<MmParticipants.MmParticipantInfo> list4 = this.f117219a;
                if (list4 != null) {
                    list4.remove(t2);
                }
                if (num != null) {
                    notifyItemRemoved(num.intValue());
                }
            }
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        UDAvatar uDAvatar = new UDAvatar(context);
        uDAvatar.setAvatarSize(-3);
        return new ViewHolder(this, uDAvatar);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        List<MmParticipants.MmParticipantInfo> list = this.f117219a;
        if (list != null) {
            bVar.mo163545a(list.get(i));
        }
    }
}
