package com.ss.android.lark.calendar.impl.features.calendars.selector.vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/AccountManagerVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "mListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;)V", "getMListener", "()Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;", "setMListener", "(Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;)V", "bindItem", "", "item", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "convertToAccountData", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.a */
public final class AccountManagerVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f76173a;

    /* renamed from: b */
    private CalendarCellVH.OnCellClickListener f76174b;

    /* renamed from: a */
    public final CalendarCellVH.OnCellClickListener mo109843a() {
        return this.f76174b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.a$a */
    static final class View$OnClickListenerC30431a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountManagerVH f76175a;

        /* renamed from: b */
        final /* synthetic */ DataListItem f76176b;

        View$OnClickListenerC30431a(AccountManagerVH aVar, DataListItem dataListItem) {
            this.f76175a = aVar;
            this.f76176b = dataListItem;
        }

        public final void onClick(View view) {
            this.f76175a.mo109843a().mo109740a(this.f76175a.mo109845b(this.f76176b));
        }
    }

    /* renamed from: b */
    public final AccountDataListItem mo109845b(DataListItem dataListItem) {
        AccountDataListItem aVar = new AccountDataListItem();
        ArrayList<Calendar> z = dataListItem.mo109841z();
        Intrinsics.checkExpressionValueIsNotNull(z, "item.oneAccountCalendars");
        aVar.mo118401a(z);
        String s = dataListItem.mo109834s();
        Intrinsics.checkExpressionValueIsNotNull(s, "item.title");
        aVar.mo118400a(s);
        aVar.mo118399a(1);
        aVar.mo118402a(dataListItem.mo109839x());
        aVar.mo118405b(dataListItem.mo109838w());
        aVar.mo118407c(dataListItem.mo109836u());
        return aVar;
    }

    /* renamed from: a */
    public final void mo109844a(DataListItem dataListItem) {
        Intrinsics.checkParameterIsNotNull(dataListItem, "item");
        if (dataListItem.mo109840y()) {
            ImageView imageView = (ImageView) this.f76173a.findViewById(R.id.invalidationIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mView.invalidationIcon");
            imageView.setVisibility(0);
            TextView textView = (TextView) this.f76173a.findViewById(R.id.invalidationTip);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mView.invalidationTip");
            textView.setVisibility(0);
        } else {
            ImageView imageView2 = (ImageView) this.f76173a.findViewById(R.id.invalidationIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mView.invalidationIcon");
            imageView2.setVisibility(8);
            TextView textView2 = (TextView) this.f76173a.findViewById(R.id.invalidationTip);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mView.invalidationTip");
            textView2.setVisibility(8);
        }
        this.f76173a.setOnClickListener(new View$OnClickListenerC30431a(this, dataListItem));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountManagerVH(View view, CalendarCellVH.OnCellClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "mView");
        Intrinsics.checkParameterIsNotNull(aVar, "mListener");
        this.f76173a = view;
        this.f76174b = aVar;
    }
}
