package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.LoadErrorDataModel;
import com.ss.android.lark.calendar.impl.utils.C32666r;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadErrorViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/LoadErrorDataModel;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mOnItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadErrorViewHolder$OnItemClickListener;", "setOnItemClickListener", "", "onLoadErrorClickedListener", "setUpView", "model", "position", "", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.d */
public final class LoadErrorViewHolder extends BaseViewHolder<LoadErrorDataModel> {

    /* renamed from: a */
    public OnItemClickListener f80682a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadErrorViewHolder$OnItemClickListener;", "", "onItemClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.d$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo115690a();
    }

    /* renamed from: a */
    public final void mo115688a(OnItemClickListener aVar) {
        this.f80682a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.d$b */
    public static final class View$OnClickListenerC31745b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoadErrorViewHolder f80683a;

        View$OnClickListenerC31745b(LoadErrorViewHolder dVar) {
            this.f80683a = dVar;
        }

        public final void onClick(View view) {
            OnItemClickListener aVar = this.f80683a.f80682a;
            if (aVar != null) {
                aVar.mo115690a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadErrorViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo115682a(LoadErrorDataModel eVar, int i, BuildingAdapter cVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "adapter");
        TextView textView = (TextView) mo115681a(R.id.load_error_try_again);
        if (textView != null) {
            textView.setText(C32666r.m125358a(UIHelper.getString(R.string.Calendar_Common_FailedtoLoadTryAgain)));
        }
        if (textView != null) {
            textView.setHighlightColor(UIHelper.getColor(R.color.primary_pri_700));
        }
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC31745b(this));
        }
    }
}
