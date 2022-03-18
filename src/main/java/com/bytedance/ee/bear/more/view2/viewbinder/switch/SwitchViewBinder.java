package com.bytedance.ee.bear.more.view2.viewbinder.switch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ISwitchMoreItem;
import com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/switch/SwitchViewBinder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/IMoreViewBinder;", "Lcom/bytedance/ee/bear/more/moreprotocol/ISwitchMoreItem;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/switch/SwitchViewBinder$SwitchViewHolder;", "()V", "TAG", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "SwitchViewHolder", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.d.a */
public final class SwitchViewBinder {

    /* renamed from: a */
    public final String f27714a = "SwitchViewBinder";

    /* renamed from: a */
    public SwitchViewHolder mo39232a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.more_item_switch, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new SwitchViewHolder(this, inflate);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/switch/SwitchViewBinder$SwitchViewHolder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/moreprotocol/ISwitchMoreItem;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/more/view2/viewbinder/switch/SwitchViewBinder;Landroid/view/View;)V", "onBindViewHolder", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "moreItem", "position", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.d.a$a */
    public final class SwitchViewHolder extends BaseMoreItemViewHolder<ISwitchMoreItem> {

        /* renamed from: a */
        final /* synthetic */ SwitchViewBinder f27715a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SwitchViewHolder(SwitchViewBinder aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27715a = aVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.more.view2.b.d.a$a$a */
        public static final class C10258a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ SwitchViewHolder f27716a;

            /* renamed from: b */
            final /* synthetic */ ISwitchMoreItem f27717b;

            /* renamed from: c */
            final /* synthetic */ WeakReference f27718c;

            /* renamed from: d */
            final /* synthetic */ int f27719d;

            C10258a(SwitchViewHolder aVar, ISwitchMoreItem iSwitchMoreItem, WeakReference weakReference, int i) {
                this.f27716a = aVar;
                this.f27717b = iSwitchMoreItem;
                this.f27718c = weakReference;
                this.f27719d = i;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (!C13726a.m55676b(this.f27717b.getHost().mo39165b().getActivity())) {
                    C13479a.m54775e(this.f27716a.f27715a.f27714a, "item click, but act not active!!!");
                } else {
                    this.f27717b.onCheckStateChange(this.f27718c, z, this.f27719d);
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem, int] */
        @Override // com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo39217a(RecyclerView.Adapter adapter, ISwitchMoreItem iSwitchMoreItem, int i) {
            mo39233a((RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>>) adapter, iSwitchMoreItem, i);
        }

        /* renamed from: a */
        public void mo39233a(RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> adapter, ISwitchMoreItem iSwitchMoreItem, int i) {
            int i2;
            Intrinsics.checkParameterIsNotNull(adapter, "adapter");
            Intrinsics.checkParameterIsNotNull(iSwitchMoreItem, "moreItem");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            boolean a = mo39218a(view, adapter, i);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((AppCompatImageView) view2.findViewById(R.id.icon)).setImageResource(iSwitchMoreItem.getIcon());
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            C13747j.m55728a((ImageView) ((AppCompatImageView) view3.findViewById(R.id.icon)), iSwitchMoreItem.getIconTint());
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView = (TextView) view4.findViewById(R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.title");
            textView.setText(iSwitchMoreItem.getTitle());
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            UDSwitch uDSwitch = (UDSwitch) view5.findViewById(R.id.switchBtn);
            Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "itemView.switchBtn");
            uDSwitch.setChecked(iSwitchMoreItem.isCheck());
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            View findViewById = view6.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.divider");
            if (a) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
            WeakReference weakReference = new WeakReference(adapter);
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            ((UDSwitch) view7.findViewById(R.id.switchBtn)).setOnCheckedChangeListener(new C10258a(this, iSwitchMoreItem, weakReference, i));
        }
    }
}
