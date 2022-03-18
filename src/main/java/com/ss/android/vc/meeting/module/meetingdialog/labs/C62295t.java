package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsTouchUpTab;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.t */
public class C62295t extends AbstractC62253g {

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.t$a */
    public static class C62296a {

        /* renamed from: a */
        public boolean f156526a;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    /* renamed from: a */
    public int mo215253a(int i, EffectModel effectModel) {
        return 1;
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.t$b */
    class C62297b extends AbstractC62253g.AbstractC62254a {

        /* renamed from: a */
        protected ImageView f156527a;

        /* renamed from: f */
        public View f156528f;

        /* renamed from: h */
        private ImageView f156530h;

        /* renamed from: i */
        private EffectModel f156531i;

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b
        /* renamed from: a */
        public void mo215255a(EffectModel effectModel) {
            this.f156531i = effectModel;
            this.f156527a.setVisibility(0);
            LabsTouchUpTab.C62275a aVar = LabsTouchUpTab.f156455l.get(effectModel.getResourceId());
            if (aVar != null) {
                this.f156527a.setImageDrawable(C60773o.m236128f(aVar.f156467a));
                this.f156527a.setBackgroundResource(R.drawable.labs_background_none_bg);
                this.f156417d.setText(aVar.f156468b);
                this.f156417d.setVisibility(0);
                this.f156530h.setVisibility(8);
            }
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b, com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62254a
        /* renamed from: a */
        public void mo215355a(boolean z) {
            super.mo215355a(z);
            this.f156527a.setSelected(z);
            this.f156417d.setSelected(z);
            this.f156528f.setSelected(z);
            if (!this.f156531i.hasTags() || this.f156531i.getTagUserValue() <= 0) {
                this.f156528f.setVisibility(4);
            } else {
                this.f156528f.setVisibility(0);
            }
            if (!z) {
                this.f156527a.getDrawable().setTint(C60773o.m236126d(R.color.icon_n2));
            } else {
                this.f156527a.getDrawable().setTint(C60773o.m236126d(R.color.primary_pri_500));
            }
        }

        public C62297b(View view) {
            super(view);
            this.f156527a = (ImageView) view.findViewById(R.id.icon_desc);
            this.f156530h = (ImageView) view.findViewById(R.id.effect_img);
            this.f156528f = view.findViewById(R.id.effect_selected_state);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    /* renamed from: a */
    public RecyclerView.ViewHolder mo215254a(ViewGroup viewGroup, int i) {
        return new C62297b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_filter_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (list == null || list.isEmpty() || !(list.get(0) instanceof C62296a)) {
            super.onBindViewHolder(viewHolder, i, list);
        } else if (((C62296a) list.get(0)).f156526a) {
            ((C62297b) viewHolder).f156528f.setVisibility(0);
        } else {
            ((C62297b) viewHolder).f156528f.setVisibility(4);
        }
    }
}
