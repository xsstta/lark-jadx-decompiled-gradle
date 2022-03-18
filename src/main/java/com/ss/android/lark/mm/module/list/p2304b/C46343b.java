package com.ss.android.lark.mm.module.list.p2304b;

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

/* renamed from: com.ss.android.lark.mm.module.list.b.b */
public class C46343b extends BaseDialog {

    /* renamed from: c */
    public boolean f116729c;

    /* renamed from: d */
    public MmListRankType f116730d = MmListRankType.CREATE_TIME;

    /* renamed from: e */
    public AbstractC46344a f116731e;

    /* renamed from: f */
    private View$OnClickListenerC46345b f116732f;

    /* renamed from: com.ss.android.lark.mm.module.list.b.b$a */
    public interface AbstractC46344a {
        /* renamed from: a */
        MmListRankType mo162906a();

        /* renamed from: a */
        void mo162907a(MmListRankType mmListRankType, boolean z);

        /* renamed from: b */
        boolean mo162908b();
    }

    /* renamed from: h */
    public void mo162905h() {
        this.f116730d = MmListRankType.CREATE_TIME;
        this.f116729c = false;
    }

    /* renamed from: g */
    public void mo162904g() {
        mo162903a(this.f116731e.mo162906a(), this.f116731e.mo162908b());
    }

    /* renamed from: i */
    private void m183491i() {
        if (getView() != null) {
            this.f116732f = new View$OnClickListenerC46345b(getView());
            mo162904g();
        }
    }

    public C46343b(AbstractC46344a aVar) {
        this.f116731e = aVar;
    }

    /* renamed from: com.ss.android.lark.mm.module.list.b.b$b */
    public class View$OnClickListenerC46345b implements View.OnClickListener {

        /* renamed from: a */
        public LinearLayout f116733a;

        /* renamed from: b */
        public LinearLayout f116734b;

        /* renamed from: c */
        public ImageView f116735c;

        /* renamed from: d */
        public ImageView f116736d;

        /* renamed from: e */
        public TextView f116737e;

        /* renamed from: f */
        public TextView f116738f;

        /* renamed from: g */
        public TextView f116739g;

        /* renamed from: h */
        public TextView f116740h;

        /* renamed from: i */
        public ImageView f116741i;

        public void onClick(View view) {
            if (view.getId() == R.id.createdTimeLayout) {
                C45855f.m181664c("MmMyListFilterDialog", "click createdTimeLayout");
                if (C46343b.this.f116730d == MmListRankType.OPEN_TIME) {
                    C46343b.this.mo162903a(MmListRankType.CREATE_TIME, false);
                } else {
                    C46343b.this.mo162903a(MmListRankType.CREATE_TIME, !C46343b.this.f116729c);
                }
                this.f116740h.performClick();
            } else if (view.getId() == R.id.openTimeLayout) {
                C45855f.m181664c("MmMyListFilterDialog", "click openTimeLayout");
                if (C46343b.this.f116730d == MmListRankType.CREATE_TIME) {
                    C46343b.this.mo162903a(MmListRankType.OPEN_TIME, false);
                } else {
                    C46343b.this.mo162903a(MmListRankType.OPEN_TIME, !C46343b.this.f116729c);
                }
                this.f116740h.performClick();
            } else if (view.getId() == R.id.resetButton) {
                C45855f.m181664c("MmMyListFilterDialog", "click resetButton");
                C46343b.this.mo162905h();
                C46343b.this.f116731e.mo162907a(C46343b.this.f116730d, C46343b.this.f116729c);
                C46343b.this.u_();
            } else if (view.getId() == R.id.confirmButton) {
                C45855f.m181664c("MmMyListFilterDialog", "click confirmButton");
                C46343b.this.f116731e.mo162907a(C46343b.this.f116730d, C46343b.this.f116729c);
                C46343b.this.u_();
            } else if (view.getId() == R.id.closeIcon) {
                C45855f.m181664c("MmMyListFilterDialog", "click closeIcon");
                C46343b.this.u_();
            }
        }

        public View$OnClickListenerC46345b(View view) {
            this.f116733a = (LinearLayout) view.findViewById(R.id.createdTimeLayout);
            this.f116734b = (LinearLayout) view.findViewById(R.id.openTimeLayout);
            this.f116735c = (ImageView) view.findViewById(R.id.ivCreatedTimeArrow);
            this.f116736d = (ImageView) view.findViewById(R.id.ivOpenTimeArrow);
            this.f116737e = (TextView) view.findViewById(R.id.tvCreatedTime);
            this.f116738f = (TextView) view.findViewById(R.id.tvOpenTime);
            this.f116739g = (TextView) view.findViewById(R.id.resetButton);
            this.f116740h = (TextView) view.findViewById(R.id.confirmButton);
            this.f116741i = (ImageView) view.findViewById(R.id.closeIcon);
            LinearLayout linearLayout = this.f116733a;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(this);
            }
            LinearLayout linearLayout2 = this.f116734b;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(this);
            }
            TextView textView = this.f116739g;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            TextView textView2 = this.f116740h;
            if (textView2 != null) {
                textView2.setOnClickListener(this);
            }
            ImageView imageView = this.f116741i;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m183491i();
    }

    /* renamed from: a */
    public void mo162903a(MmListRankType mmListRankType, boolean z) {
        boolean z2;
        boolean z3;
        ImageView imageView = this.f116732f.f116735c;
        LinearLayout linearLayout = this.f116732f.f116733a;
        TextView textView = this.f116732f.f116737e;
        boolean z4 = true;
        if (mmListRankType == MmListRankType.CREATE_TIME) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo162902a(imageView, linearLayout, textView, z2, z);
        ImageView imageView2 = this.f116732f.f116736d;
        LinearLayout linearLayout2 = this.f116732f.f116734b;
        TextView textView2 = this.f116732f.f116738f;
        if (mmListRankType == MmListRankType.OPEN_TIME) {
            z3 = true;
        } else {
            z3 = false;
        }
        mo162902a(imageView2, linearLayout2, textView2, z3, z);
        TextView textView3 = this.f116732f.f116739g;
        if (mmListRankType == MmListRankType.CREATE_TIME && !z) {
            z4 = false;
        }
        textView3.setEnabled(z4);
        this.f116730d = mmListRankType;
        this.f116729c = z;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mm_dialog_mylist_filter, viewGroup, false);
    }

    /* renamed from: a */
    public void mo162902a(ImageView imageView, LinearLayout linearLayout, TextView textView, boolean z, boolean z2) {
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
