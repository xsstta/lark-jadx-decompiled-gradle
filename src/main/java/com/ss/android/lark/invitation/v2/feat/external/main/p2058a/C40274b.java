package com.ss.android.lark.invitation.v2.feat.external.main.p2058a;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.a.b */
public class C40274b extends AbstractC58968a<C40274b> {

    /* renamed from: a */
    private int f102330a;

    /* renamed from: b */
    private int f102331b;

    /* renamed from: f */
    private CharSequence f102332f;

    /* renamed from: g */
    private View.OnClickListener f102333g;

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        ImageView imageView = (ImageView) cVar.mo200081a(R.id.ieiIv);
        TextView textView = (TextView) cVar.mo200081a(R.id.ieiTv);
        C57832h.m224486a(cVar.itemView);
        C40103e.m159005a(cVar.itemView, this.f102333g);
        if (C40147z.m159165e()) {
            cVar.itemView.setMinimumHeight(UIHelper.dp2px(48.0f));
            DesktopUtil.m144299a(textView);
        }
        imageView.setImageResource(this.f102330a);
        if (this.f102331b != 0) {
            imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(cVar.itemView.getContext(), this.f102331b)));
        } else {
            imageView.setImageTintList(null);
        }
        textView.setText(this.f102332f);
    }

    public C40274b(int i, int i2, CharSequence charSequence, View.OnClickListener onClickListener) {
        super(R.layout.inv_invite_external_item_view);
        this.f102330a = i;
        this.f102331b = i2;
        this.f102332f = charSequence;
        this.f102333g = onClickListener;
    }
}
