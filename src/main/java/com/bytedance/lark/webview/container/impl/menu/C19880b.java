package com.bytedance.lark.webview.container.impl.menu;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.webview.container.impl.menu.C19880b;
import com.bytedance.lark.webview.container.impl.menu.C19885d;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lark.webview.container.impl.menu.b */
public class C19880b extends RecyclerView.Adapter<C19881a> {

    /* renamed from: a */
    public AbstractC19882b f48567a;

    /* renamed from: b */
    private Context f48568b;

    /* renamed from: c */
    private List<C19885d.C19889b> f48569c = new ArrayList();

    /* renamed from: com.bytedance.lark.webview.container.impl.menu.b$b */
    public interface AbstractC19882b {
        void onItemClick(View view, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f48569c.size();
    }

    /* renamed from: a */
    public void mo67389a(AbstractC19882b bVar) {
        this.f48567a = bVar;
    }

    /* renamed from: com.bytedance.lark.webview.container.impl.menu.b$a */
    public class C19881a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f48570a;

        /* renamed from: b */
        ImageView f48571b;

        /* renamed from: c */
        ImageView f48572c;

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m72570a(View view) {
            if (C19880b.this.f48567a != null) {
                C19880b.this.f48567a.onItemClick(view, ((Integer) view.getTag()).intValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19881a(View view) {
            super(view);
            C19880b.this = r1;
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.lark.webview.container.impl.menu.$$Lambda$b$a$dcfHuSp_ck3KMf7V9CA9l6fZweE */

                public final void onClick(View view) {
                    C19880b.C19881a.lambda$dcfHuSp_ck3KMf7V9CA9l6fZweE(C19880b.C19881a.this, view);
                }
            });
            this.f48571b = (ImageView) view.findViewById(R.id.web_image_icon);
            this.f48570a = (TextView) view.findViewById(R.id.text_icon_name);
            this.f48572c = (ImageView) view.findViewById(R.id.badge_red_bot);
        }
    }

    public C19880b(Context context, List<C19885d.C19889b> list) {
        this.f48568b = context;
        this.f48569c = list;
    }

    /* renamed from: b */
    private int m72565b(TextView textView, String str) {
        return Math.round(textView.getPaint().measureText(str));
    }

    /* renamed from: a */
    public C19881a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C19881a(LayoutInflater.from(this.f48568b).inflate(R.layout.web_dialog_icon_item, viewGroup, false));
    }

    /* renamed from: a */
    public void mo67387a(TextView textView, String str) {
        try {
            float dimension = textView.getResources().getDimension(R.dimen.web_large_text_size);
            float dimension2 = textView.getResources().getDimension(R.dimen.web_small_text_size);
            int b = m72565b(textView, str.substring(0, 1));
            if (Math.round((float) (str.length() / (Math.round(textView.getResources().getDimension(R.dimen.web_menu_name_width)) / b))) > 2) {
                textView.setTextSize(0, dimension2);
            } else {
                textView.setTextSize(0, dimension);
            }
        } catch (Exception e) {
            Log.m165390i("WebGridMenuAdapter", "measureTextSize error ", e);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C19881a aVar, int i) {
        C19885d.C19889b bVar = this.f48569c.get(i);
        aVar.f48570a.setText(bVar.f48583b);
        mo67387a(aVar.f48570a, bVar.f48583b);
        Context context = aVar.f48571b.getContext();
        if (bVar.mo67394a()) {
            aVar.f48571b.setImageResource(bVar.f48589h);
        } else {
            aVar.f48571b.setImageDrawable(UDIconUtils.getIconDrawable(context, bVar.f48589h, UDColorUtils.getColor(context, R.color.icon_n1)));
        }
        int dp2px = UIHelper.dp2px(13.0f);
        aVar.f48571b.setPadding(dp2px, dp2px, dp2px, dp2px);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(context, R.color.bg_float));
        int i2 = 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) C57582a.m223600a(12));
        aVar.f48571b.setBackground(gradientDrawable);
        ImageView imageView = aVar.f48572c;
        if (!bVar.f48592k) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        aVar.itemView.setTag(Integer.valueOf(i));
    }
}
