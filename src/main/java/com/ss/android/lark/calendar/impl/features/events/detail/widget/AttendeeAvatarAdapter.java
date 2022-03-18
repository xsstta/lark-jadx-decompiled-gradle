package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import com.ss.android.lark.calendar.impl.utils.ao;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u001e\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u001e\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeAvatarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickListener", "Landroid/view/View$OnClickListener;", "items", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeBaseData;", "getItem", "position", "", "getItemCount", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "attendees", "", "isShowMore", "", "setOnClickListener", "AttendeeMoreIconHolder", "AttendeeViewHolder", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.a */
public final class AttendeeAvatarAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final Companion f79768b = new Companion(null);

    /* renamed from: a */
    public View.OnClickListener f79769a;

    /* renamed from: c */
    private ArrayList<IBodyData.IAttendeeBaseData> f79770c = new ArrayList<>();

    /* renamed from: d */
    private final Context f79771d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeAvatarAdapter$AttendeeMoreIconHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeAvatarAdapter;Landroid/view/View;)V", "avatarMoreIcon", "getAvatarMoreIcon", "()Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.a$a */
    public final class AttendeeMoreIconHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AttendeeAvatarAdapter f79772a;

        /* renamed from: b */
        private final View f79773b;

        /* renamed from: a */
        public final View mo114208a() {
            return this.f79773b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AttendeeMoreIconHolder(AttendeeAvatarAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f79772a = aVar;
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.attendee_more_icon);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "view.attendee_more_icon");
            this.f79773b = constraintLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeAvatarAdapter$AttendeeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeAvatarAdapter;Landroid/view/View;)V", "avatar", "Lcom/joooonho/SelectableRoundedImageView;", "getAvatar", "()Lcom/joooonho/SelectableRoundedImageView;", "avatarContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getAvatarContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeStatusView;", "getStatus", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeStatusView;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.a$b */
    public final class AttendeeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AttendeeAvatarAdapter f79774a;

        /* renamed from: b */
        private final SelectableRoundedImageView f79775b;

        /* renamed from: c */
        private final AttendeeStatusView f79776c;

        /* renamed from: d */
        private final ConstraintLayout f79777d;

        /* renamed from: a */
        public final SelectableRoundedImageView mo114209a() {
            return this.f79775b;
        }

        /* renamed from: b */
        public final AttendeeStatusView mo114210b() {
            return this.f79776c;
        }

        /* renamed from: c */
        public final ConstraintLayout mo114211c() {
            return this.f79777d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AttendeeViewHolder(AttendeeAvatarAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f79774a = aVar;
            SelectableRoundedImageView selectableRoundedImageView = (SelectableRoundedImageView) view.findViewById(R.id.avatar);
            Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView, "view.avatar");
            this.f79775b = selectableRoundedImageView;
            AttendeeStatusView attendeeStatusView = (AttendeeStatusView) view.findViewById(R.id.status);
            Intrinsics.checkExpressionValueIsNotNull(attendeeStatusView, "view.status");
            this.f79776c = attendeeStatusView;
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.avatarContainer);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "view.avatarContainer");
            this.f79777d = constraintLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeAvatarAdapter$Companion;", "", "()V", "TYPE_AVATAR", "", "TYPE_MORE_ICON", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.a$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f79770c.size();
    }

    /* renamed from: a */
    public final void mo114206a(View.OnClickListener onClickListener) {
        this.f79769a = onClickListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.a$d */
    static final class View$OnClickListenerC31472d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeAvatarAdapter f79778a;

        View$OnClickListenerC31472d(AttendeeAvatarAdapter aVar) {
            this.f79778a = aVar;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f79778a.f79769a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.a$e */
    static final class View$OnClickListenerC31473e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeAvatarAdapter f79779a;

        View$OnClickListenerC31473e(AttendeeAvatarAdapter aVar) {
            this.f79779a = aVar;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f79779a.f79769a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f79770c.get(i) == null) {
            return 1;
        }
        return 0;
    }

    public AttendeeAvatarAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f79771d = context;
        setHasStableIds(true);
    }

    /* renamed from: a */
    public final IBodyData.IAttendeeBaseData mo114205a(int i) {
        return this.f79770c.get(i);
    }

    /* renamed from: a */
    public final void mo114207a(List<? extends IBodyData.IAttendeeBaseData> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "attendees");
        this.f79770c.clear();
        this.f79770c.addAll(list);
        if (z) {
            this.f79770c.add(null);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(this.f79771d);
        if (i == 0) {
            View inflate = from.inflate(R.layout.item_event_detail_attendee_avatar, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new AttendeeViewHolder(this, inflate);
        }
        View inflate2 = from.inflate(R.layout.item_event_detail_attendee_more_icon, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
        return new AttendeeMoreIconHolder(this, inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        IBodyData.IAttendeeBaseData a = mo114205a(i);
        if ((viewHolder instanceof AttendeeViewHolder) && (a instanceof IBodyData.IAttendeeBaseData)) {
            if (a.mo113377c()) {
                ((AttendeeViewHolder) viewHolder).mo114209a().setImageBitmap(C31256c.m117133a(32.0f, a.mo113379e()));
            } else {
                AttendeeViewHolder bVar = (AttendeeViewHolder) viewHolder;
                bVar.mo114211c().setOnClickListener(new View$OnClickListenerC31472d(this));
                C31256c.m117135a(this.f79771d, bVar.mo114209a(), 32, 32, a.mo113375a(), a.mo113378d(), a.mo113379e(), true, a.mo113376b());
            }
            int i2 = C31474b.f79780a[a.mo113390p().ordinal()];
            if (i2 == 1) {
                ((AttendeeViewHolder) viewHolder).mo114210b().setVisibility(8);
            } else if (i2 == 2) {
                AttendeeViewHolder bVar2 = (AttendeeViewHolder) viewHolder;
                bVar2.mo114210b().setVisibility(0);
                bVar2.mo114210b().mo114126a();
            } else if (i2 == 3) {
                AttendeeViewHolder bVar3 = (AttendeeViewHolder) viewHolder;
                bVar3.mo114210b().setVisibility(0);
                bVar3.mo114210b().mo114127b();
            } else if (i2 != 4) {
                ((AttendeeViewHolder) viewHolder).mo114210b().setVisibility(8);
            } else {
                AttendeeViewHolder bVar4 = (AttendeeViewHolder) viewHolder;
                bVar4.mo114210b().setVisibility(0);
                bVar4.mo114210b().mo114128c();
            }
        } else if (viewHolder instanceof AttendeeMoreIconHolder) {
            AttendeeMoreIconHolder aVar = (AttendeeMoreIconHolder) viewHolder;
            aVar.mo114208a().setBackground(ao.m125221a(UDColorUtils.getColor(this.f79771d, R.color.bg_body_overlay), 0, 0));
            aVar.mo114208a().setOnClickListener(new View$OnClickListenerC31473e(this));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m118422a(AttendeeAvatarAdapter aVar, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        aVar.mo114207a(list, z);
    }
}
