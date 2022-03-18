package com.ss.android.lark.reaction.widget.detailwindow.p2561a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.widget.detailwindow.userstatus.ReactionUserStatusLinearLayout;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.a.d */
public class C53000d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    ViewGroup f130924a;

    /* renamed from: b */
    LKUIRoundedImageView f130925b;

    /* renamed from: c */
    ImageView f130926c;

    /* renamed from: d */
    TextView f130927d;

    /* renamed from: e */
    ReactionUserStatusLinearLayout f130928e;

    /* renamed from: f */
    TextView f130929f;

    /* renamed from: g */
    View f130930g;

    public C53000d(View view) {
        super(view);
        this.f130924a = (ViewGroup) view.findViewById(R.id.people_item_layout);
        this.f130925b = (LKUIRoundedImageView) view.findViewById(R.id.single_avator);
        this.f130926c = (ImageView) view.findViewById(R.id.image_unregister);
        this.f130927d = (TextView) view.findViewById(R.id.text_name);
        this.f130928e = (ReactionUserStatusLinearLayout) view.findViewById(R.id.user_status);
        this.f130929f = (TextView) view.findViewById(R.id.workday_leave);
        this.f130930g = view.findViewById(R.id.divider_next_people);
        m205267a(view.getContext());
    }

    /* renamed from: a */
    private void m205267a(Context context) {
        if (DesktopUtil.m144301a(context)) {
            this.f130924a.getLayoutParams().height = C52990a.m205224a(context, 60.0f);
            DesktopUtil.m144304b(this.f130925b);
            DesktopUtil.m144299a(this.f130927d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f130927d.getLayoutParams();
            marginLayoutParams.leftMargin = C52990a.m205224a(context, 12.0f);
            this.f130927d.setLayoutParams(marginLayoutParams);
            this.f130930g.setVisibility(8);
        }
    }
}
