package com.ss.android.lark.keyboard.plugin.tool.more;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class MoreItemsAdapter extends LarkRecyclerViewBaseAdapter<ViewHolder, IPlusItem> {

    /* renamed from: a */
    public AbstractC40968a f104154a;

    /* renamed from: b */
    public boolean f104155b = C40682g.m160850a().mo133174b("chat_keyboard_moreItem_dot");

    /* renamed from: c */
    private Context f104156c;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.MoreItemsAdapter$a */
    public interface AbstractC40968a {
        /* renamed from: a */
        void mo147639a(View view, IPlusItem bVar);
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f104160a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f104160a;
            if (viewHolder != null) {
                this.f104160a = null;
                viewHolder.mIconIv = null;
                viewHolder.mNameTv = null;
                viewHolder.mRedDot = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f104160a = viewHolder;
            viewHolder.mIconIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.item_icon, "field 'mIconIv'", ImageView.class);
            viewHolder.mNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.item_name, "field 'mNameTv'", TextView.class);
            viewHolder.mRedDot = (ImageView) Utils.findRequiredViewAsType(view, R.id.item_icon_red_dot, "field 'mRedDot'", ImageView.class);
        }
    }

    /* renamed from: a */
    public void mo147638a(AbstractC40968a aVar) {
        this.f104154a = aVar;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(6577)
        ImageView mIconIv;
        @BindView(6579)
        TextView mNameTv;
        @BindView(6578)
        ImageView mRedDot;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    private boolean m162265a(IPlusItem bVar) {
        if (bVar.mo31057e() >= 150) {
            return this.f104155b;
        }
        return false;
    }

    public MoreItemsAdapter(Context context) {
        this.f104156c = context;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f104156c).inflate(R.layout.kb_keyboard_more_item_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        final IPlusItem bVar = (IPlusItem) getItem(i);
        boolean a = DesktopUtil.m144301a(this.f104156c);
        int i2 = 8;
        if (bVar.mo31056d()) {
            viewHolder.itemView.setVisibility(0);
            viewHolder.mNameTv.setText(bVar.mo31055c());
            SquircleImageView squircleImageView = (SquircleImageView) viewHolder.mIconIv;
            if (a) {
                m162266b(viewHolder, bVar, squircleImageView);
            } else {
                m162264a(viewHolder, bVar, squircleImageView);
            }
            ImageView imageView = viewHolder.mRedDot;
            if (m162265a(bVar)) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            viewHolder.itemView.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.more.MoreItemsAdapter.C409671 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    bVar.mo31049a(view);
                    if (MoreItemsAdapter.this.f104154a != null) {
                        MoreItemsAdapter.this.f104154a.mo147639a(view, bVar);
                    }
                    if (MoreItemsAdapter.this.f104155b) {
                        C40682g.m160850a().mo133176c("chat_keyboard_moreItem_dot");
                        MoreItemsAdapter.this.f104155b = false;
                    }
                    viewHolder.mRedDot.setVisibility(8);
                }
            });
            return;
        }
        viewHolder.itemView.setVisibility(8);
    }

    /* renamed from: a */
    private void m162264a(ViewHolder viewHolder, IPlusItem bVar, SquircleImageView squircleImageView) {
        squircleImageView.setBackgroundColor(UDColorUtils.getColor(this.f104156c, R.color.imtoken_keyboard_plus_item_background));
        squircleImageView.setBackgroundTintList(UDColorUtils.getColorStateList(this.f104156c, R.color.kb_more_item_bg_color_selector));
        int dp2px = UIHelper.dp2px(52.0f);
        if (bVar.mo31048a() != -1) {
            squircleImageView.setImageResource(bVar.mo31048a());
        } else if (bVar.mo31053b() != null) {
            IPlusItem.IconUrlInfo b = bVar.mo31053b();
            if (b.mo124323a() != null) {
                C40682g.m160850a().mo133168a(b.mo124323a(), squircleImageView, dp2px, dp2px);
            } else {
                ImageLoader.with(this.f104156c).load(AvatarImage.Builder.obtain(b.mo124324b(), null, dp2px, dp2px).fsUnit(b.mo124325c()).build()).into(squircleImageView);
            }
        } else {
            viewHolder.itemView.setVisibility(8);
            return;
        }
        squircleImageView.setImageTintList(null);
        squircleImageView.setRadius(UIHelper.dp2px(12.0f));
        squircleImageView.setBorderWidth(UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED));
        squircleImageView.setBorderColor(C25653b.m91893a(ContextCompat.getColor(squircleImageView.getContext(), R.color.lkui_N900), 0.1f));
    }

    /* renamed from: b */
    private void m162266b(ViewHolder viewHolder, IPlusItem bVar, SquircleImageView squircleImageView) {
        squircleImageView.setBackgroundColor(UDColorUtils.getColor(this.f104156c, R.color.imtoken_keyboard_plus_item_background));
        squircleImageView.setBackgroundTintList(UDColorUtils.getColorStateList(this.f104156c, R.color.kb_more_item_bg_color_selector));
        int dp2px = UIHelper.dp2px(20.0f);
        if (bVar.mo31048a() != -1) {
            squircleImageView.setImageResource(bVar.mo31048a());
            squircleImageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(this.f104156c, R.color.lkui_N800)));
            squircleImageView.setRadius(0);
            squircleImageView.setBorderWidth(0);
        } else if (bVar.mo31053b() != null) {
            IPlusItem.IconUrlInfo b = bVar.mo31053b();
            if (b.mo124323a() != null) {
                C40682g.m160850a().mo133168a(b.mo124323a(), squircleImageView, dp2px, dp2px);
            } else {
                ImageLoader.with(this.f104156c).load(AvatarImage.Builder.obtain(b.mo124324b(), null, dp2px, dp2px).fsUnit(b.mo124325c()).build()).into(squircleImageView);
            }
            squircleImageView.setImageTintList(null);
            squircleImageView.setRadius(UIHelper.dp2px(4.0f));
            squircleImageView.setBorderWidth(UIHelper.dp2px(0.8f));
            squircleImageView.setBorderColor(C25653b.m91893a(ContextCompat.getColor(squircleImageView.getContext(), R.color.lkui_N900), 0.1f));
        } else {
            viewHolder.itemView.setVisibility(8);
        }
    }
}
