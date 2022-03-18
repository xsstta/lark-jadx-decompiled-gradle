package com.bytedance.ee.bear.bizwidget.shareview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bizwidget.shareview.b */
public class C4882b extends RecyclerView.Adapter<C4885b> {

    /* renamed from: a */
    public List<ShareItemModel> f14373a = new ArrayList();

    /* renamed from: b */
    public AbstractC4884a f14374b;

    /* renamed from: c */
    public int f14375c = -1;

    /* renamed from: com.bytedance.ee.bear.bizwidget.shareview.b$a */
    public interface AbstractC4884a {
        void onItemClick(ShareItemModel shareItemModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ShareItemModel> list = this.f14373a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo19186a(int i) {
        this.f14375c = i;
    }

    /* renamed from: a */
    public void mo19187a(AbstractC4884a aVar) {
        this.f14374b = aVar;
    }

    /* renamed from: a */
    public void mo19189a(List<ShareItemModel> list) {
        if (list != null) {
            this.f14373a.clear();
            for (ShareItemModel shareItemModel : list) {
                if (shareItemModel.getState() != ShareState.NOT_SHOW) {
                    this.f14373a.add(shareItemModel);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bizwidget.shareview.b$b */
    public class C4885b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f14378a;

        /* renamed from: c */
        private Context f14380c;

        /* renamed from: d */
        private ImageView f14381d;

        /* renamed from: e */
        private UDBadgeView f14382e;

        /* renamed from: f */
        private TextView f14383f;

        /* renamed from: a */
        public void mo19190a(ShareItemModel shareItemModel) {
            int i;
            float f;
            ViewGroup.LayoutParams layoutParams;
            if (!(C4882b.this.f14375c == -1 || (layoutParams = this.f14381d.getLayoutParams()) == null)) {
                int i2 = C4882b.this.f14375c;
                layoutParams.height = i2;
                layoutParams.width = i2;
                this.f14381d.setLayoutParams(layoutParams);
            }
            this.f14381d.setImageResource(shareItemModel.getIconResId());
            if (shareItemModel.getSrcTint() != 0) {
                this.f14381d.setImageTintList(ColorStateList.valueOf(this.f14380c.getResources().getColor(shareItemModel.getSrcTint())));
            } else {
                this.f14381d.setImageTintList(null);
            }
            this.f14381d.setBackgroundColor(this.f14380c.getResources().getColor(shareItemModel.getShareItemBackground()));
            UDBadgeView uDBadgeView = this.f14382e;
            if (shareItemModel.getState() == ShareState.SHOW_NEW) {
                i = 0;
            } else {
                i = 8;
            }
            uDBadgeView.setVisibility(i);
            this.f14383f.setText(shareItemModel.getDescription());
            ViewPropertyAnimator animate = this.f14378a.animate();
            if (shareItemModel.isClickable()) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            animate.alpha(f).setDuration(150).start();
        }

        public C4885b(View view) {
            super(view);
            this.f14378a = view;
            this.f14380c = view.getContext();
            this.f14381d = (ImageView) view.findViewById(R.id.share_icon);
            this.f14383f = (TextView) view.findViewById(R.id.share_text);
            this.f14382e = (UDBadgeView) view.findViewById(R.id.share_badge);
        }
    }

    /* renamed from: a */
    public C4885b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4885b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.share_widget_share_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C4885b bVar, final int i) {
        bVar.mo19190a(this.f14373a.get(i));
        bVar.f14378a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.bizwidget.shareview.C4882b.C48831 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C4882b.this.f14374b != null) {
                    C4882b.this.f14374b.onItemClick(C4882b.this.f14373a.get(i));
                }
            }
        });
    }
}
