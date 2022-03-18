package com.ss.android.lark.money.redpacket.history.fragment.adapter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.redpacket.history.fragment.p2371b.C48135a;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.money.redpacket.history.fragment.adapter.a */
public class C48131a extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, C48135a> {

    /* renamed from: b */
    private static final int f121136b = UIHelper.dp2px(40.0f);

    /* renamed from: a */
    public AbstractC48134a f121137a;

    /* renamed from: c */
    private Context f121138c;

    /* renamed from: d */
    private int f121139d;

    /* renamed from: com.ss.android.lark.money.redpacket.history.fragment.adapter.a$a */
    public interface AbstractC48134a {
        /* renamed from: a */
        void mo168521a(String str);
    }

    /* renamed from: a */
    public void mo168519a(AbstractC48134a aVar) {
        this.f121137a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = ((C48135a) getItem(i)).f121143a;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private void m190018a(RecyclerView.ViewHolder viewHolder) {
        RedPacketHistoryEmptyHolder redPacketHistoryEmptyHolder = (RedPacketHistoryEmptyHolder) viewHolder;
        int i = this.f121139d;
        if (i == 0) {
            redPacketHistoryEmptyHolder.mEmptyTV.setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoHistoryNeverReceived));
        } else if (i == 1) {
            redPacketHistoryEmptyHolder.mEmptyTV.setText(UIHelper.getString(R.string.Lark_Legacy_HistorySendEmpty));
        }
    }

    public C48131a(Context context, int i) {
        this.f121138c = context;
        this.f121139d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C48135a aVar = (C48135a) getItem(i);
        if (aVar.f121143a == 0) {
            m190019a(viewHolder, aVar);
        } else if (aVar.f121143a == 2) {
            m190018a(viewHolder);
        } else {
            int i2 = aVar.f121143a;
        }
    }

    /* renamed from: a */
    private void m190019a(RecyclerView.ViewHolder viewHolder, final C48135a aVar) {
        RedPacketHistoryHolder redPacketHistoryHolder = (RedPacketHistoryHolder) viewHolder;
        redPacketHistoryHolder.mNameTV.setText(aVar.f121147e);
        redPacketHistoryHolder.mMoneyTV.setText(aVar.f121149g);
        redPacketHistoryHolder.mDateTV.setText(aVar.f121148f);
        redPacketHistoryHolder.mStatusTV.setText(aVar.f121150h);
        if (!TextUtils.isEmpty(aVar.f121146d)) {
            IMoneyModuleDependency.IImageDependency imageDependency = MoneyModule.getDependency().getImageDependency();
            Context context = this.f121138c;
            String str = aVar.f121146d;
            String str2 = aVar.f121145c;
            LKUIRoundedImageView lKUIRoundedImageView = redPacketHistoryHolder.mAvatarIV;
            int i = f121136b;
            imageDependency.loadAvatarImage(context, str, str2, lKUIRoundedImageView, i, i);
        } else {
            redPacketHistoryHolder.mAvatarIV.setImageDrawable(new ColorDrawable(UDColorUtils.getColor(this.f121138c, R.color.bg_body_overlay)));
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.money.redpacket.history.fragment.adapter.C48131a.View$OnClickListenerC481332 */

            public void onClick(View view) {
                if (C48131a.this.f121137a != null) {
                    C48131a.this.f121137a.mo168521a(aVar.f121144b);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new RedPacketHistoryHolder(LayoutInflater.from(this.f121138c).inflate(R.layout.item_red_packet_history, viewGroup, false));
        }
        if (i == 1) {
            return new RecyclerView.ViewHolder(LayoutInflater.from(this.f121138c).inflate(R.layout.item_red_packet_history_no_more_footer, viewGroup, false)) {
                /* class com.ss.android.lark.money.redpacket.history.fragment.adapter.C48131a.C481321 */
            };
        }
        if (i != 2) {
            return new RedPacketHistoryHolder(LayoutInflater.from(this.f121138c).inflate(R.layout.item_red_packet_history, viewGroup, false));
        }
        return new RedPacketHistoryEmptyHolder(LayoutInflater.from(this.f121138c).inflate(R.layout.item_red_packet_history_empty_footer, viewGroup, false));
    }
}
