package com.ss.android.lark.mm.module.list.p2305c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.list.data.MmListRankType;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.widget.BaseDialog;

/* renamed from: com.ss.android.lark.mm.module.list.c.a */
public class C46374a extends BaseDialog {

    /* renamed from: c */
    public boolean f116797c;

    /* renamed from: d */
    public MmListRankType f116798d = MmListRankType.SHARE_TIME;

    /* renamed from: e */
    public AbstractC46375a f116799e;

    /* renamed from: f */
    private View$OnClickListenerC46376b f116800f;

    /* renamed from: com.ss.android.lark.mm.module.list.c.a$a */
    public interface AbstractC46375a {
        /* renamed from: a */
        MmListRankType mo162968a();

        /* renamed from: a */
        void mo162969a(MmListRankType mmListRankType, boolean z);

        /* renamed from: b */
        boolean mo162970b();
    }

    /* renamed from: h */
    public void mo162967h() {
        this.f116798d = MmListRankType.SHARE_TIME;
        this.f116797c = false;
    }

    /* renamed from: g */
    public void mo162966g() {
        mo162965a(this.f116799e.mo162968a(), this.f116799e.mo162970b());
    }

    /* renamed from: i */
    private void m183582i() {
        if (getView() != null) {
            this.f116800f = new View$OnClickListenerC46376b(getView());
            mo162966g();
        }
    }

    public C46374a(AbstractC46375a aVar) {
        this.f116799e = aVar;
    }

    /* renamed from: com.ss.android.lark.mm.module.list.c.a$b */
    public class View$OnClickListenerC46376b implements View.OnClickListener {

        /* renamed from: a */
        public LinearLayout f116801a;

        /* renamed from: b */
        public LinearLayout f116802b;

        /* renamed from: c */
        public ImageView f116803c;

        /* renamed from: d */
        public ImageView f116804d;

        /* renamed from: e */
        public TextView f116805e;

        /* renamed from: f */
        public TextView f116806f;

        /* renamed from: g */
        public TextView f116807g;

        /* renamed from: h */
        public TextView f116808h;

        /* renamed from: i */
        public ImageView f116809i;

        public void onClick(View view) {
            if (view.getId() == R.id.sharedTimeLayout) {
                C45855f.m181664c("MmSharedListFilterDialog", "click sharedTimeLayout");
                if (C46374a.this.f116798d == MmListRankType.OPEN_TIME) {
                    C46374a.this.mo162965a(MmListRankType.SHARE_TIME, false);
                    this.f116808h.performClick();
                    return;
                }
                C46374a.this.mo162965a(MmListRankType.SHARE_TIME, !C46374a.this.f116797c);
                this.f116808h.performClick();
            } else if (view.getId() == R.id.openTimeLayout) {
                C45855f.m181664c("MmSharedListFilterDialog", "click openTimeLayout");
                if (C46374a.this.f116798d == MmListRankType.SHARE_TIME) {
                    C46374a.this.mo162965a(MmListRankType.OPEN_TIME, false);
                    this.f116808h.performClick();
                    return;
                }
                C46374a.this.mo162965a(MmListRankType.OPEN_TIME, !C46374a.this.f116797c);
                this.f116808h.performClick();
            } else if (view.getId() == R.id.resetButton) {
                C45855f.m181664c("MmSharedListFilterDialog", "click resetButton");
                C46374a.this.mo162967h();
                C46374a.this.f116799e.mo162969a(C46374a.this.f116798d, C46374a.this.f116797c);
                C46374a.this.u_();
            } else if (view.getId() == R.id.confirmButton) {
                C45855f.m181664c("MmSharedListFilterDialog", "click confirmButton");
                C46374a.this.f116799e.mo162969a(C46374a.this.f116798d, C46374a.this.f116797c);
                C46374a.this.u_();
            } else if (view.getId() == R.id.closeIcon) {
                C45855f.m181664c("MmSharedListFilterDialog", "click closeIcon");
                C46374a.this.u_();
            }
        }

        public View$OnClickListenerC46376b(View view) {
            this.f116801a = (LinearLayout) view.findViewById(R.id.sharedTimeLayout);
            this.f116802b = (LinearLayout) view.findViewById(R.id.openTimeLayout);
            this.f116803c = (ImageView) view.findViewById(R.id.ivSharedTimeArrow);
            this.f116804d = (ImageView) view.findViewById(R.id.ivOpenTimeArrow);
            this.f116805e = (TextView) view.findViewById(R.id.tvSharedTime);
            this.f116806f = (TextView) view.findViewById(R.id.tvOpenTime);
            this.f116807g = (TextView) view.findViewById(R.id.resetButton);
            this.f116808h = (TextView) view.findViewById(R.id.confirmButton);
            this.f116809i = (ImageView) view.findViewById(R.id.closeIcon);
            LinearLayout linearLayout = this.f116801a;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(this);
            }
            LinearLayout linearLayout2 = this.f116802b;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(this);
            }
            TextView textView = this.f116807g;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            TextView textView2 = this.f116808h;
            if (textView2 != null) {
                textView2.setOnClickListener(this);
            }
            ImageView imageView = this.f116809i;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m183582i();
    }

    /* renamed from: a */
    public void mo162965a(MmListRankType mmListRankType, boolean z) {
        boolean z2;
        boolean z3;
        ImageView imageView = this.f116800f.f116803c;
        LinearLayout linearLayout = this.f116800f.f116801a;
        TextView textView = this.f116800f.f116805e;
        boolean z4 = true;
        if (mmListRankType == MmListRankType.SHARE_TIME) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo162964a(imageView, linearLayout, textView, z2, z);
        ImageView imageView2 = this.f116800f.f116804d;
        LinearLayout linearLayout2 = this.f116800f.f116802b;
        TextView textView2 = this.f116800f.f116806f;
        if (mmListRankType == MmListRankType.OPEN_TIME) {
            z3 = true;
        } else {
            z3 = false;
        }
        mo162964a(imageView2, linearLayout2, textView2, z3, z);
        TextView textView3 = this.f116800f.f116807g;
        if (mmListRankType == MmListRankType.SHARE_TIME && !z) {
            z4 = false;
        }
        textView3.setEnabled(z4);
        this.f116798d = mmListRankType;
        this.f116797c = z;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mm_dialog_sharedlist_filter, viewGroup, false);
    }

    /* renamed from: a */
    public void mo162964a(ImageView imageView, LinearLayout linearLayout, TextView textView, boolean z, boolean z2) {
        if (z) {
            linearLayout.setSelected(true);
            textView.setSelected(true);
            if (z2) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(UDIconUtils.getIconDrawable(C45851c.m181646a(), (int) R.drawable.ud_icon_arrow_up_outlined, ContextCompat.getColor(C45851c.m181646a(), R.color.primary_pri_500)));
                return;
            }
            imageView.setVisibility(0);
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(C45851c.m181646a(), (int) R.drawable.ud_icon_arrow_down_outlined, ContextCompat.getColor(C45851c.m181646a(), R.color.primary_pri_500)));
            return;
        }
        linearLayout.setSelected(false);
        textView.setSelected(false);
        imageView.setVisibility(8);
    }
}
