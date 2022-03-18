package com.ss.android.lark.message.vote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appcenter.wrapper.vote.statistics.VoteHitPoint;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.message.card.p2262b.C45292a;
import com.ss.android.lark.message.vote.AbstractC45384a;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;

public class VoteCardOptionsAdapter extends LarkRecyclerViewBaseAdapter<ViewHolder, C45292a> {

    /* renamed from: a */
    public int f114941a;

    /* renamed from: b */
    public int f114942b;

    /* renamed from: c */
    public AbstractC45383a f114943c;

    /* renamed from: d */
    public AbstractC45384a.AbstractC45385a f114944d;

    /* renamed from: e */
    private Context f114945e;

    /* renamed from: f */
    private int f114946f;

    /* renamed from: g */
    private int f114947g;

    /* renamed from: h */
    private int f114948h = UIUtils.getColor(this.f114945e, R.color.text_title);

    /* renamed from: com.ss.android.lark.message.vote.VoteCardOptionsAdapter$a */
    public interface AbstractC45383a {
        /* renamed from: a */
        void mo160231a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) i;
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f114953a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f114953a;
            if (viewHolder != null) {
                this.f114953a = null;
                viewHolder.mNumberTv = null;
                viewHolder.mContentTv = null;
                viewHolder.mPollTv = null;
                viewHolder.mProgressBar = null;
                viewHolder.mItemLayout = null;
                viewHolder.mVoteResultLayout = null;
                viewHolder.mCheckBox = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f114953a = viewHolder;
            viewHolder.mNumberTv = (TextView) Utils.findRequiredViewAsType(view, R.id.number_tv, "field 'mNumberTv'", TextView.class);
            viewHolder.mContentTv = (TextView) Utils.findRequiredViewAsType(view, R.id.content_tv, "field 'mContentTv'", TextView.class);
            viewHolder.mPollTv = (TextView) Utils.findRequiredViewAsType(view, R.id.poll_tv, "field 'mPollTv'", TextView.class);
            viewHolder.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressbar, "field 'mProgressBar'", ProgressBar.class);
            viewHolder.mItemLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.item_layout, "field 'mItemLayout'", RelativeLayout.class);
            viewHolder.mVoteResultLayout = Utils.findRequiredView(view, R.id.vote_result_layout, "field 'mVoteResultLayout'");
            viewHolder.mCheckBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.checkbox, "field 'mCheckBox'", UDCheckBox.class);
        }
    }

    /* renamed from: a */
    public void mo160225a(int i) {
        this.f114946f = i;
    }

    /* renamed from: b */
    public void mo160229b(int i) {
        this.f114941a = i;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(6612)
        UDCheckBox mCheckBox;
        @BindView(6671)
        TextView mContentTv;
        @BindView(6935)
        RelativeLayout mItemLayout;
        @BindView(7214)
        TextView mNumberTv;
        @BindView(7267)
        TextView mPollTv;
        @BindView(7284)
        ProgressBar mProgressBar;
        @BindView(7801)
        View mVoteResultLayout;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo160227a(AbstractC45383a aVar) {
        this.f114943c = aVar;
    }

    /* renamed from: a */
    public void mo160228a(AbstractC45384a.AbstractC45385a aVar) {
        this.f114944d = aVar;
    }

    public VoteCardOptionsAdapter(Context context) {
        this.f114945e = context;
        this.f114947g = UIUtils.getColor(context, R.color.primary_pri_500);
    }

    /* renamed from: a */
    private void m180221a(ViewHolder viewHolder) {
        C25649b.m91857a(viewHolder.mNumberTv, LarkFont.BODY1);
        C25649b.m91857a(viewHolder.mContentTv, LarkFont.BODY1);
        C25649b.m91857a(viewHolder.mPollTv, LarkFont.CAPTION2);
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f114945e).inflate(R.layout.vote_card_option_item_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
        String str;
        int i2;
        final C45292a aVar = (C45292a) getItem(i);
        if (!aVar.mo160013e() || !aVar.mo160011d()) {
            viewHolder.mNumberTv.setTextColor(this.f114948h);
            viewHolder.mNumberTv.setTypeface(null, 0);
            viewHolder.mContentTv.setTextColor(this.f114948h);
            viewHolder.mContentTv.setTypeface(null, 0);
            viewHolder.mPollTv.setTextColor(this.f114948h);
        } else {
            viewHolder.mNumberTv.setTextColor(this.f114947g);
            viewHolder.mNumberTv.setTypeface(null, 1);
            viewHolder.mContentTv.setTextColor(this.f114947g);
            viewHolder.mContentTv.setTypeface(null, 1);
            viewHolder.mPollTv.setTextColor(this.f114947g);
        }
        if (this.f114941a == 1) {
            viewHolder.mCheckBox.setType(UDCheckBox.CheckBoxType.RADIO);
        } else {
            viewHolder.mCheckBox.setType(UDCheckBox.CheckBoxType.CHECK_BOX);
        }
        if (aVar.mo160013e() && !aVar.mo160011d()) {
            viewHolder.mCheckBox.setVisibility(0);
            viewHolder.mCheckBox.setChecked(true);
        } else if (aVar.mo160011d()) {
            viewHolder.mCheckBox.setVisibility(8);
        } else {
            viewHolder.mCheckBox.setVisibility(0);
            viewHolder.mCheckBox.setChecked(false);
        }
        viewHolder.mNumberTv.setText(aVar.mo160015f());
        viewHolder.mContentTv.setText(aVar.mo160016g());
        if (aVar.mo160011d()) {
            viewHolder.mVoteResultLayout.setVisibility(0);
            viewHolder.mProgressBar.setProgress(aVar.mo160017h());
            viewHolder.mProgressBar.setMax(aVar.mo160019i());
            float f = BitmapDescriptorFactory.HUE_RED;
            if (aVar.mo160019i() != 0) {
                f = (((float) aVar.mo160017h()) / ((float) aVar.mo160019i())) * 100.0f;
            }
            if (((double) f) >= 0.1d) {
                str = String.format("%.1f", Float.valueOf(f));
            } else {
                str = String.format("%04.1f", Float.valueOf(f));
            }
            int h = aVar.mo160017h();
            HashMap hashMap = new HashMap();
            hashMap.put("vote_num", String.valueOf(h));
            hashMap.put("percentage", str);
            if (h > 1) {
                i2 = R.string.Lark_Legacy_VoteOptionResults;
            } else {
                i2 = R.string.Lark_Legacy_VoteOptionResult;
            }
            viewHolder.mPollTv.setText(UIHelper.mustacheFormat(i2, hashMap));
        } else {
            viewHolder.mVoteResultLayout.setVisibility(8);
        }
        viewHolder.itemView.setEnabled(!aVar.mo160011d());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.message.vote.VoteCardOptionsAdapter.View$OnClickListenerC453821 */

            public void onClick(View view) {
                boolean z = false;
                viewHolder.itemView.setEnabled(false);
                C45292a aVar = aVar;
                aVar.mo160007b(!aVar.mo160013e());
                if (!aVar.mo160013e()) {
                    VoteCardOptionsAdapter voteCardOptionsAdapter = VoteCardOptionsAdapter.this;
                    int i = voteCardOptionsAdapter.f114942b - 1;
                    voteCardOptionsAdapter.f114942b = i;
                    voteCardOptionsAdapter.f114942b = Math.max(0, i);
                } else if (VoteCardOptionsAdapter.this.f114941a == 1) {
                    VoteCardOptionsAdapter.this.f114942b = 1;
                    for (int i2 = 0; i2 < VoteCardOptionsAdapter.this.getItems().size(); i2++) {
                        if (i2 != i && ((C45292a) VoteCardOptionsAdapter.this.getItem(i2)).mo160013e()) {
                            ((C45292a) VoteCardOptionsAdapter.this.getItem(i2)).mo160007b(false);
                        }
                    }
                } else {
                    VoteCardOptionsAdapter.this.f114942b = 0;
                    for (int i3 = 0; i3 < VoteCardOptionsAdapter.this.getItems().size(); i3++) {
                        if (((C45292a) VoteCardOptionsAdapter.this.getItem(i3)).mo160013e()) {
                            VoteCardOptionsAdapter.this.f114942b++;
                        }
                    }
                }
                VoteHitPoint.Companion aVar2 = VoteHitPoint.f72953a;
                if (VoteCardOptionsAdapter.this.f114941a == 1) {
                    z = true;
                }
                aVar2.mo103336a(z, aVar.mo160000a(), aVar.mo160013e());
                if (VoteCardOptionsAdapter.this.f114943c != null) {
                    VoteCardOptionsAdapter.this.f114943c.mo160231a(VoteCardOptionsAdapter.this.f114942b);
                }
                if (VoteCardOptionsAdapter.this.f114944d != null) {
                    VoteCardOptionsAdapter.this.f114944d.onItemSelected(aVar.mo160013e());
                }
                VoteCardOptionsAdapter.this.notifyDataSetChanged();
            }
        });
        if (!DesktopUtil.m144307b()) {
            m180221a(viewHolder);
        }
    }
}
