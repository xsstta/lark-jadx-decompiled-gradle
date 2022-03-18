package com.ss.android.lark.mail.impl.home.menu.label;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.badge.BadgeDecorator;
import com.ss.android.lark.mail.impl.badge.C41839b;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.C42409b;
import com.ss.android.lark.mail.impl.home.menu.C42585j;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailMenuLabelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AbstractC26197e {

    /* renamed from: a */
    protected final List<C42585j> f108372a = new ArrayList();

    /* renamed from: b */
    protected AbstractC42588a f108373b;

    /* renamed from: c */
    protected View.OnClickListener f108374c = new View.OnClickListener() {
        /* class com.ss.android.lark.mail.impl.home.menu.label.MailMenuLabelAdapter.View$OnClickListenerC425861 */

        public void onClick(View view) {
            if (MailMenuLabelAdapter.this.f108373b != null) {
                int intValue = ((Integer) view.getTag()).intValue();
                MailMenuLabelAdapter.this.f108373b.mo153039a(view, intValue, MailMenuLabelAdapter.this.f108372a.get(intValue));
            }
        }
    };

    /* renamed from: d */
    private boolean f108375d;

    /* renamed from: e */
    private final int f108376e;

    /* renamed from: f */
    private final Context f108377f;

    /* renamed from: g */
    private final Map<Integer, String> f108378g = new HashMap() {
        /* class com.ss.android.lark.mail.impl.home.menu.label.MailMenuLabelAdapter.C425872 */

        {
            put(1, "");
            put(2, C43819s.m173684a((int) R.string.Mail_Folder_FolderTab));
            put(3, C43819s.m173684a((int) R.string.Mail_Manage_ManageLabelMobile));
        }
    };

    /* renamed from: com.ss.android.lark.mail.impl.home.menu.label.MailMenuLabelAdapter$a */
    public interface AbstractC42588a {
        /* renamed from: a */
        void mo153039a(View view, int i, C42585j jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.larksuite.framework.ui.p1198b.AbstractC26197e
    public int getItemCount() {
        List<C42585j> list = this.f108372a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class MenuViewHeaderHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MenuViewHeaderHolder f108380a;

        @Override // butterknife.Unbinder
        public void unbind() {
            MenuViewHeaderHolder menuViewHeaderHolder = this.f108380a;
            if (menuViewHeaderHolder != null) {
                this.f108380a = null;
                menuViewHeaderHolder.mTitleIv = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MenuViewHeaderHolder_ViewBinding(MenuViewHeaderHolder menuViewHeaderHolder, View view) {
            this.f108380a = menuViewHeaderHolder;
            menuViewHeaderHolder.mTitleIv = (TextView) Utils.findRequiredViewAsType(view, R.id.mail_aggregation_header_tv, "field 'mTitleIv'", TextView.class);
        }
    }

    public class MenuViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MenuViewHolder f108381a;

        @Override // butterknife.Unbinder
        public void unbind() {
            MenuViewHolder menuViewHolder = this.f108381a;
            if (menuViewHolder != null) {
                this.f108381a = null;
                menuViewHolder.mIconIV = null;
                menuViewHolder.mLabelTV = null;
                menuViewHolder.mBadgeView = null;
                menuViewHolder.mBadgeOtherView = null;
                menuViewHolder.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MenuViewHolder_ViewBinding(MenuViewHolder menuViewHolder, View view) {
            this.f108381a = menuViewHolder;
            menuViewHolder.mIconIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.menu_lable_icon, "field 'mIconIV'", ImageView.class);
            menuViewHolder.mLabelTV = (TextView) Utils.findRequiredViewAsType(view, R.id.menu_lable_text, "field 'mLabelTV'", TextView.class);
            menuViewHolder.mBadgeView = (TextView) Utils.findRequiredViewAsType(view, R.id.menu_lable_badge, "field 'mBadgeView'", TextView.class);
            menuViewHolder.mBadgeOtherView = (ImageView) Utils.findRequiredViewAsType(view, R.id.menu_lable_badge_other, "field 'mBadgeOtherView'", ImageView.class);
            menuViewHolder.divider = Utils.findRequiredView(view, R.id.menu_lable_line, "field 'divider'");
        }
    }

    /* renamed from: a */
    public void mo153081a(AbstractC42588a aVar) {
        this.f108373b = aVar;
    }

    public static class MenuViewHeaderHolder extends RecyclerView.ViewHolder {
        @BindView(9257)
        public TextView mTitleIv;

        public MenuViewHeaderHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        @BindView(9635)
        public View divider;
        @BindView(9633)
        public ImageView mBadgeOtherView;
        @BindView(9632)
        public TextView mBadgeView;
        @BindView(9634)
        public ImageView mIconIV;
        @BindView(9636)
        public TextView mLabelTV;

        public MenuViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo153083a(boolean z) {
        this.f108375d = z;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo153082a(List<C42585j> list) {
        this.f108372a.clear();
        this.f108372a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        int i2 = this.f108376e;
        if (i < i2) {
            return -1;
        }
        return (long) this.f108372a.get(i - i2).f108370f;
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo93177a(ViewGroup viewGroup) {
        return new MenuViewHeaderHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_aggregation_list_header_item, viewGroup, false));
    }

    public MailMenuLabelAdapter(int i, Context context) {
        this.f108376e = i;
        this.f108377f = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_menu_item, viewGroup, false);
        inflate.setOnClickListener(this.f108374c);
        return new MenuViewHolder(inflate);
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public void mo93178a(RecyclerView.ViewHolder viewHolder, int i) {
        C42585j jVar;
        MenuViewHeaderHolder menuViewHeaderHolder = (MenuViewHeaderHolder) viewHolder;
        int i2 = i - this.f108376e;
        String str = null;
        if (i2 < 0 || i2 >= this.f108372a.size()) {
            jVar = null;
        } else {
            jVar = this.f108372a.get(i2);
        }
        if (jVar != null) {
            str = this.f108378g.get(Integer.valueOf(jVar.f108370f));
        }
        ViewGroup.LayoutParams layoutParams = menuViewHeaderHolder.itemView.getLayoutParams();
        if (!TextUtils.isEmpty(str)) {
            menuViewHeaderHolder.mTitleIv.setText(str);
            if (layoutParams != null) {
                layoutParams.height = UIHelper.getDimens(R.dimen.mail_popup_menu_recycle_item_header_height);
            }
            menuViewHeaderHolder.itemView.setVisibility(0);
            return;
        }
        if (layoutParams != null) {
            layoutParams.height = 0;
        }
        menuViewHeaderHolder.itemView.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(Integer.valueOf(i));
        MenuViewHolder menuViewHolder = (MenuViewHolder) viewHolder;
        C42589a aVar = (C42589a) this.f108372a.get(i);
        MailLabelEntity mailLabelEntity = aVar.f108382g;
        if (aVar.mo153079a()) {
            menuViewHolder.itemView.setSelected(true);
        } else {
            menuViewHolder.itemView.setSelected(false);
        }
        menuViewHolder.mIconIV.setImageResource(aVar.f108366b);
        if (mailLabelEntity.mo151529m() || mailLabelEntity.mo151494a() == 2) {
            menuViewHolder.mIconIV.setColorFilter(UIHelper.getColor(R.color.icon_n1));
        } else {
            menuViewHolder.mIconIV.setColorFilter(mailLabelEntity.mo151505c());
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) menuViewHolder.mIconIV.getLayoutParams();
        layoutParams.leftMargin = UIHelper.getDimens(R.dimen.mail_home_menu_left_margin);
        if (!(mailLabelEntity.mo151493B() == null || mailLabelEntity.mo151493B().size() == 0)) {
            layoutParams.leftMargin += UIHelper.getDimens(R.dimen.mail_home_left_menu_left_indentation) * (mailLabelEntity.mo151493B().size() - 1);
        }
        menuViewHolder.mLabelTV.setLines(aVar.f108369e);
        menuViewHolder.mLabelTV.setText(aVar.f108365a);
        if (aVar.f108368d) {
            menuViewHolder.divider.setVisibility(0);
        } else {
            menuViewHolder.divider.setVisibility(4);
        }
        BadgeDecorator.C41830a a = BadgeDecorator.m166140a(mailLabelEntity.mo151510d(), false, C41839b.m166173e());
        menuViewHolder.mBadgeOtherView.setImageDrawable(C42409b.m169264a(this.f108377f, R.color.udtoken_tag_neutral_bg_normal, R.color.udtoken_tag_neutral_text_normal, UIHelper.getString(R.string.Mail_SmartInbox_Other_NewMail), -1, -1, -1, UIHelper.dp2px(18.0f), UIHelper.dp2px(12.0f)));
        if (a.mo150405c() != 0) {
            menuViewHolder.mBadgeOtherView.setVisibility(8);
            menuViewHolder.mBadgeView.setVisibility(8);
        } else if ("OTHER".equals(mailLabelEntity.mo151527k())) {
            menuViewHolder.mBadgeView.setVisibility(8);
            if (this.f108375d) {
                menuViewHolder.mBadgeOtherView.setVisibility(0);
            } else {
                menuViewHolder.mBadgeOtherView.setVisibility(8);
            }
        } else {
            menuViewHolder.mBadgeOtherView.setVisibility(8);
            menuViewHolder.mBadgeView.setVisibility(0);
            menuViewHolder.mBadgeView.setText(a.mo150403b());
        }
    }
}
