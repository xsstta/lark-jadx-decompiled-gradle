package com.ss.android.lark.calendar.impl.features.events.edit.mail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter$AddMailAttendeeDelegate;", "(Ljava/util/ArrayList;Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter$AddMailAttendeeDelegate;)V", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter$AddMailAttendeeDelegate;", "getMDataList", "()Ljava/util/ArrayList;", "addMailAccount", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AddMailAttendeeDelegate", "AttendeeViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.a */
public final class AddMailAttendeeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final ArrayList<AddMailAttendeeData> f81219a;

    /* renamed from: b */
    private final AddMailAttendeeDelegate f81220b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter$AddMailAttendeeDelegate;", "", "deleteEmail", "", "deleteItem", "", "refreshAttendeeCount", "size", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.a$a */
    public interface AddMailAttendeeDelegate {
        /* renamed from: a */
        void mo116155a(int i);

        /* renamed from: a */
        void mo116156a(String str);
    }

    /* renamed from: a */
    public final ArrayList<AddMailAttendeeData> mo116152a() {
        return this.f81219a;
    }

    /* renamed from: b */
    public final AddMailAttendeeDelegate mo116154b() {
        return this.f81220b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81219a.size();
    }

    /* renamed from: a */
    public final void mo116153a(AddMailAttendeeData addMailAttendeeData) {
        Intrinsics.checkParameterIsNotNull(addMailAttendeeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f81219a.add(addMailAttendeeData);
        notifyDataSetChanged();
        this.f81220b.mo116155a(this.f81219a.size());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter$AttendeeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "position", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.a$b */
    public final class AttendeeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeAdapter f81221a;

        /* renamed from: b */
        private final View f81222b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.a$b$a */
        public static final class View$OnClickListenerC31870a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AttendeeViewHolder f81223a;

            /* renamed from: b */
            final /* synthetic */ int f81224b;

            View$OnClickListenerC31870a(AttendeeViewHolder bVar, int i) {
                this.f81223a = bVar;
                this.f81224b = i;
            }

            public final void onClick(View view) {
                AddMailAttendeeData remove = this.f81223a.f81221a.mo116152a().remove(this.f81224b);
                Intrinsics.checkExpressionValueIsNotNull(remove, "mDataList.removeAt(position)");
                this.f81223a.f81221a.mo116154b().mo116156a(remove.getAccountName());
                this.f81223a.f81221a.mo116154b().mo116155a(this.f81223a.f81221a.mo116152a().size());
                this.f81223a.f81221a.notifyItemRemoved(this.f81224b);
                this.f81223a.f81221a.notifyItemRangeChanged(this.f81224b, this.f81223a.f81221a.getItemCount());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AttendeeViewHolder(AddMailAttendeeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f81221a = aVar;
            this.f81222b = view;
        }

        /* renamed from: a */
        public final void mo116157a(AddMailAttendeeData addMailAttendeeData, int i) {
            int i2;
            Intrinsics.checkParameterIsNotNull(addMailAttendeeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            TextView textView = (TextView) this.f81222b.findViewById(R.id.tvMail);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tvMail");
            textView.setText(addMailAttendeeData.getAccountName());
            ((SelectableRoundedImageView) this.f81222b.findViewById(R.id.ivAvatar)).setImageBitmap(C31256c.m117133a(48.0f, addMailAttendeeData.getAccountName()));
            ImageView imageView = (ImageView) this.f81222b.findViewById(R.id.ivDelete);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.ivDelete");
            if (addMailAttendeeData.isDeletable()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            ((ImageView) this.f81222b.findViewById(R.id.ivDelete)).setOnClickListener(new View$OnClickListenerC31870a(this, i));
        }
    }

    public AddMailAttendeeAdapter(ArrayList<AddMailAttendeeData> arrayList, AddMailAttendeeDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(arrayList, "mDataList");
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f81219a = arrayList;
        this.f81220b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof AttendeeViewHolder) {
            AddMailAttendeeData addMailAttendeeData = this.f81219a.get(i);
            Intrinsics.checkExpressionValueIsNotNull(addMailAttendeeData, "mDataList[position]");
            ((AttendeeViewHolder) viewHolder).mo116157a(addMailAttendeeData, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.add_mail_attendee_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new AttendeeViewHolder(this, inflate);
    }
}
