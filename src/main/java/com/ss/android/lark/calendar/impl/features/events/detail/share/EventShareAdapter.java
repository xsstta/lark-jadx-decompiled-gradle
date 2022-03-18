package com.ss.android.lark.calendar.impl.features.events.detail.share;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareItemViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareAdapter$ShareItemViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareItemViewData;", "itemClick", "Lkotlin/Function1;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ShareItemViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.a */
public final class EventShareAdapter extends LarkRecyclerViewBaseAdapter<ShareItemViewHolder, ShareItemViewData> {

    /* renamed from: a */
    public final Function1<ShareType, Unit> f79487a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareAdapter$ShareItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareItemViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.a$a */
    public final class ShareItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ EventShareAdapter f79488a;

        /* renamed from: b */
        private final View f79489b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.a$a$a */
        public static final class View$OnClickListenerC31377a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ShareItemViewHolder f79490a;

            /* renamed from: b */
            final /* synthetic */ ShareItemViewData f79491b;

            View$OnClickListenerC31377a(ShareItemViewHolder aVar, ShareItemViewData aVar2) {
                this.f79490a = aVar;
                this.f79491b = aVar2;
            }

            public final void onClick(View view) {
                this.f79490a.f79488a.f79487a.invoke(this.f79491b.mo113980a());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0047, code lost:
            if (r2 != null) goto L_0x005e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo113945a(com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareItemViewData r8) {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareAdapter.ShareItemViewHolder.mo113945a(com.ss.android.lark.calendar.impl.features.events.detail.share.entity.a):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShareItemViewHolder(EventShareAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f79488a = aVar;
            this.f79489b = view;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public EventShareAdapter(Function1<? super ShareType, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "itemClick");
        this.f79487a = function1;
    }

    /* renamed from: a */
    public ShareItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ts_share_dialog_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ShareItemViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ShareItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Object item = getItem(i);
        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
        aVar.mo113945a((ShareItemViewData) item);
    }
}
