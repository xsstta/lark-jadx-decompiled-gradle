package com.ss.android.lark.mm.module.participant.add;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.user.UserNameView;
import com.ss.android.lark.mm.p2288b.C45853e;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0016\u0010\u0019\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fJ\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter$IMmParticipantAddAdapterListener;", "(Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter$IMmParticipantAddAdapterListener;)V", "dataList", "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "getListener", "()Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter$IMmParticipantAddAdapterListener;", "appendHead", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "appendList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refresh", "unSelectMember", "member", "IMmParticipantAddAdapterListener", "MmAddParticipantViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.participant.add.a */
public final class MmParticipantAddAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final List<MmParticipants.MmParticipantInfo> f117193a = new ArrayList();

    /* renamed from: b */
    private final IMmParticipantAddAdapterListener f117194b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter$IMmParticipantAddAdapterListener;", "", "onSelected", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "onUnSelected", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.a$a */
    public interface IMmParticipantAddAdapterListener {
        /* renamed from: a */
        void mo163522a(MmParticipants.MmParticipantInfo mmParticipantInfo);

        /* renamed from: b */
        void mo163523b(MmParticipants.MmParticipantInfo mmParticipantInfo);
    }

    /* renamed from: a */
    public final IMmParticipantAddAdapterListener mo163517a() {
        return this.f117194b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f117193a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter$MmAddParticipantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/participant/add/MmParticipantAddAdapter;Landroid/view/View;)V", "avatarSize", "", "ivCheck", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "ivIcon", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "tvDesc", "Landroid/widget/TextView;", "userName", "Lcom/ss/android/lark/mm/module/share/user/UserNameView;", "getView", "()Landroid/view/View;", "bind", "", "participantInfo", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "notifyCheckedChange", "setDesc", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.add.a$b */
    public final class MmAddParticipantViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final UDCheckBox f117195a;

        /* renamed from: b */
        public final UDAvatar f117196b;

        /* renamed from: c */
        final /* synthetic */ MmParticipantAddAdapter f117197c;

        /* renamed from: d */
        private final UserNameView f117198d;

        /* renamed from: e */
        private final TextView f117199e;

        /* renamed from: f */
        private final int f117200f = C57582a.m223600a(48);

        /* renamed from: g */
        private final View f117201g;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.participant.add.a$b$a */
        public static final class C46566a extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ MmParticipants.MmParticipantInfo $participantInfo;
            final /* synthetic */ MmAddParticipantViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46566a(MmAddParticipantViewHolder bVar, MmParticipants.MmParticipantInfo mmParticipantInfo) {
                super(1);
                this.this$0 = bVar;
                this.$participantInfo = mmParticipantInfo;
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
                this.this$0.f117195a.setChecked(!this.this$0.f117195a.isChecked());
                this.this$0.mo163525b(this.$participantInfo);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "onBitmapLoaded"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.participant.add.a$b$b */
        public static final class C46567b implements C45853e.AbstractC45854a {

            /* renamed from: a */
            final /* synthetic */ MmAddParticipantViewHolder f117202a;

            /* renamed from: b */
            final /* synthetic */ MmParticipants.MmParticipantInfo f117203b;

            C46567b(MmAddParticipantViewHolder bVar, MmParticipants.MmParticipantInfo mmParticipantInfo) {
                this.f117202a = bVar;
                this.f117203b = mmParticipantInfo;
            }

            @Override // com.ss.android.lark.mm.p2288b.C45853e.AbstractC45854a
            /* renamed from: a */
            public final void mo161154a(Bitmap bitmap) {
                if (bitmap != null && Intrinsics.areEqual(this.f117202a.f117196b.getTag(), this.f117203b.getAvatarUrl())) {
                    this.f117202a.f117196b.setImageBitmap(bitmap);
                }
            }
        }

        /* renamed from: b */
        public final void mo163525b(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            boolean isChecked = this.f117195a.isChecked();
            mmParticipantInfo.setIsSelected(isChecked);
            if (isChecked) {
                this.f117197c.mo163517a().mo163522a(mmParticipantInfo);
            } else {
                this.f117197c.mo163517a().mo163523b(mmParticipantInfo);
            }
        }

        /* renamed from: c */
        private final void m184170c(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            boolean z;
            if (mmParticipantInfo.is_external()) {
                this.f117199e.setText(mmParticipantInfo.getTenant_name());
            } else {
                this.f117199e.setText(mmParticipantInfo.getDepartment_name());
            }
            TextView textView = this.f117199e;
            CharSequence text = textView.getText();
            int i = 0;
            if (text == null || text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            textView.setVisibility(i);
        }

        /* renamed from: a */
        public final void mo163524a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "participantInfo");
            if (mmParticipantInfo.is_in_participants()) {
                this.f117201g.setEnabled(false);
                this.f117201g.setAlpha(0.3f);
                this.f117195a.setEnabled(false);
            } else {
                this.f117201g.setAlpha(1.0f);
                this.f117201g.setEnabled(true);
                this.f117195a.setEnabled(true);
            }
            this.f117195a.setChecked(mmParticipantInfo._isSelected());
            this.f117195a.setClickable(false);
            C47110e.m186573a(this.f117201g, new C46566a(this, mmParticipantInfo));
            this.f117196b.setTag(mmParticipantInfo.getAvatarUrl());
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45881i imageLoaderDepend = a.getImageLoaderDepend();
            Context context = this.f117201g.getContext();
            String avatarUrl = mmParticipantInfo.getAvatarUrl();
            int i = this.f117200f;
            imageLoaderDepend.mo144608a(context, avatarUrl, i, i, new C46567b(this, mmParticipantInfo));
            m184170c(mmParticipantInfo);
            this.f117198d.mo165261a(User.Companion.mo165177a(mmParticipantInfo));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MmAddParticipantViewHolder(MmParticipantAddAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f117197c = aVar;
            this.f117201g = view;
            View findViewById = view.findViewById(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.ivCheck)");
            this.f117195a = (UDCheckBox) findViewById;
            View findViewById2 = view.findViewById(R.id.ivIcon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.ivIcon)");
            this.f117196b = (UDAvatar) findViewById2;
            View findViewById3 = view.findViewById(R.id.userName);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.userName)");
            this.f117198d = (UserNameView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvDesc);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.tvDesc)");
            this.f117199e = (TextView) findViewById4;
        }
    }

    /* renamed from: a */
    public final void mo163518a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        Intrinsics.checkParameterIsNotNull(mmParticipantInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f117193a.add(0, mmParticipantInfo);
        notifyItemInserted(0);
    }

    public MmParticipantAddAdapter(IMmParticipantAddAdapterListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f117194b = aVar;
    }

    /* renamed from: a */
    public final void mo163519a(List<? extends MmParticipants.MmParticipantInfo> list) {
        this.f117193a.clear();
        if (list != null) {
            this.f117193a.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo163520b(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        T t;
        Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "member");
        Iterator<T> it = this.f117193a.iterator();
        while (true) {
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
            t2.setIsSelected(false);
            notifyItemChanged(this.f117193a.indexOf(t2));
        }
    }

    /* renamed from: b */
    public final void mo163521b(List<? extends MmParticipants.MmParticipantInfo> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f117193a.add(it.next());
                notifyItemInserted(this.f117193a.size() - 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof MmAddParticipantViewHolder) {
            ((MmAddParticipantViewHolder) viewHolder).mo163524a(this.f117193a.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_add_participant_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new MmAddParticipantViewHolder(this, inflate);
    }
}
