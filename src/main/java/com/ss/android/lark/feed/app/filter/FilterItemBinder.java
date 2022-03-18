package com.ss.android.lark.feed.app.filter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.binder.AbstractC37406i;
import com.ss.android.lark.feed.app.entity.FilterPreview;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.app.filter.widget.FeedFilterView;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1847a.C37271h;
import com.ss.android.lark.feed.statistics.device.MuteDeviceHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J.\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/FilterItemBinder;", "Lcom/ss/android/lark/feed/app/binder/ItemViewBinder;", "Lcom/ss/android/lark/feed/app/entity/FilterPreview;", "Lcom/ss/android/lark/feed/app/filter/FilterItemBinder$FilterTabViewHolder;", "Lcom/ss/android/lark/feed/app/IItemContainer;", "()V", "context", "Landroid/content/Context;", "onBindViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "itemContainer", "position", "", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "itemViewLoader", "Lcom/ss/android/lark/feed/app/itemviewloader/ItemViewLoader;", "Companion", "FilterTabViewHolder", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.filter.a */
public final class FilterItemBinder implements AbstractC37406i<FilterPreview, FilterTabViewHolder, AbstractC37628k> {

    /* renamed from: b */
    public static final Companion f96269b = new Companion(null);

    /* renamed from: a */
    public Context f96270a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/FilterItemBinder$Companion;", "", "()V", "ICON_SIZE_IN_DP", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/FilterItemBinder$FilterTabViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "deviceTip", "Landroid/widget/TextView;", "getDeviceTip", "()Landroid/widget/TextView;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.a$b */
    public static final class FilterTabViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f96271a;

        /* renamed from: a */
        public final TextView mo137785a() {
            return this.f96271a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FilterTabViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.multi_device_tip);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(id.multi_device_tip)");
            this.f96271a = (TextView) findViewById;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.a$c */
    public static final class View$OnClickListenerC37547c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterItemBinder f96272a;

        /* renamed from: b */
        final /* synthetic */ FilterPreview f96273b;

        View$OnClickListenerC37547c(FilterItemBinder aVar, FilterPreview filterPreview) {
            this.f96272a = aVar;
            this.f96273b = filterPreview;
        }

        public final void onClick(View view) {
            if (!C37271h.m146782a()) {
                int deviceStatus = this.f96273b.getDeviceStatus();
                if (deviceStatus == 1) {
                    MuteDeviceHitPoint.f97734a.mo139412a(true);
                } else if (deviceStatus == 2) {
                    MuteDeviceHitPoint.f97734a.mo139412a(false);
                }
                C37268c.m146766b().mo139180a(this.f96272a.f96270a);
            }
        }
    }

    /* renamed from: b */
    public FilterTabViewHolder mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(bVar, "itemViewLoader");
        this.f96270a = viewGroup.getContext();
        View a = bVar.mo137128a(FeedFilterView.class, viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(a, "view");
        return new FilterTabViewHolder(a);
    }

    /* renamed from: a */
    public void mo137226a(FilterTabViewHolder bVar, FilterPreview filterPreview, AbstractC37628k kVar, int i) {
        boolean z;
        int i2;
        int i3;
        if (bVar != null && filterPreview != null) {
            if (!FeedFgUtils.m146773b()) {
                View view = bVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                view.setVisibility(8);
                View view2 = bVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                view2.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
                return;
            }
            List<FeedTabItemData.IFilterItem> filterItems = filterPreview.getFilterItems();
            boolean z2 = true;
            if (filterItems == null || filterItems.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                View view3 = bVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
                view3.setVisibility(8);
                View view4 = bVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "holder.itemView");
                view4.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
                return;
            }
            View view5 = bVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "holder.itemView");
            view5.setVisibility(0);
            View view6 = bVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "holder.itemView");
            view6.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            if (filterPreview.getDeviceStatus() == 0) {
                z2 = false;
            }
            if (z2) {
                bVar.mo137785a().setVisibility(0);
                if (filterPreview.getDeviceStatus() == 2) {
                    i2 = R.drawable.ud_icon_alerts_off_outlined;
                } else {
                    i2 = R.drawable.ud_icon_computer_outlined;
                }
                Drawable drawable = UIHelper.getDrawable(i2);
                float f = (float) 20;
                drawable.setBounds(0, 0, UIUtils.dp2px(this.f96270a, f), UIUtils.dp2px(this.f96270a, f));
                drawable.mutate();
                drawable.setTint(UIHelper.getColor(R.color.icon_n1));
                bVar.mo137785a().setCompoundDrawables(drawable, null, null, null);
                TextView a = bVar.mo137785a();
                if (filterPreview.getDeviceStatus() == 2) {
                    i3 = R.string.Lark_Legacy_CurrentDeviceNotifyClosed;
                } else {
                    i3 = R.string.Lark_Feed_PCLogin;
                }
                a.setText(i3);
            } else {
                bVar.mo137785a().setVisibility(8);
            }
            bVar.mo137785a().setOnClickListener(new View$OnClickListenerC37547c(this, filterPreview));
        }
    }
}
