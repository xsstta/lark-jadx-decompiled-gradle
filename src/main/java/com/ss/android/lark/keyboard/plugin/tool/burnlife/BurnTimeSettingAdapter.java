package com.ss.android.lark.keyboard.plugin.tool.burnlife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnTimeItem;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;

public class BurnTimeSettingAdapter extends LarkRecyclerViewBaseAdapter<ViewHolder, BurnTimeItem> {

    /* renamed from: a */
    public AbstractC40815a f103768a;

    /* renamed from: b */
    private Context f103769b;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnTimeSettingAdapter$a */
    public interface AbstractC40815a {
        /* renamed from: a */
        void mo147409a(BurnTimeItem burnTimeItem);
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f103773a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f103773a;
            if (viewHolder != null) {
                this.f103773a = null;
                viewHolder.itemNameTv = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f103773a = viewHolder;
            viewHolder.itemNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.item_name_tv, "field 'itemNameTv'", TextView.class);
        }
    }

    /* renamed from: a */
    public void mo147407a(AbstractC40815a aVar) {
        this.f103768a = aVar;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(6580)
        TextView itemNameTv;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public BurnTimeSettingAdapter(Context context) {
        this.f103769b = context;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f103769b).inflate(R.layout.kb_burn_time_setting_item_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        final BurnTimeItem burnTimeItem = (BurnTimeItem) getItem(i);
        viewHolder.itemNameTv.setText(burnTimeItem.mo147397a());
        if (burnTimeItem.mo147401d()) {
            viewHolder.itemNameTv.setTextColor(C57582a.m223616d(viewHolder.itemNameTv.getContext(), R.color.primary_pri_500));
        } else {
            viewHolder.itemNameTv.setTextColor(C57582a.m223616d(viewHolder.itemNameTv.getContext(), R.color.text_title));
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnTimeSettingAdapter.View$OnClickListenerC408141 */

            public void onClick(View view) {
                if (BurnTimeSettingAdapter.this.f103768a != null) {
                    BurnTimeSettingAdapter.this.f103768a.mo147409a(burnTimeItem);
                }
                if (burnTimeItem.mo147403f() != BurnTimeItem.Type.CANCEL) {
                    List items = BurnTimeSettingAdapter.this.getItems();
                    for (int i = 0; i < items.size(); i++) {
                        BurnTimeItem burnTimeItem = (BurnTimeItem) items.get(i);
                        if (i == i) {
                            burnTimeItem.mo147398a(true);
                        } else {
                            burnTimeItem.mo147398a(false);
                        }
                    }
                    BurnTimeSettingAdapter.this.notifyDataSetChanged();
                }
            }
        });
    }
}
