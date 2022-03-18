package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.resource.bitmap.C2432i;
import com.bumptech.glide.load.resource.bitmap.C2452w;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.n */
public class C62265n extends AbstractC62253g {

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.n$a */
    class C62266a extends AbstractC62253g.C62256c {
        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b, com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.C62256c
        /* renamed from: a */
        public void mo215255a(EffectModel effectModel) {
            super.mo215255a(effectModel);
            this.f156420c.setVisibility(0);
            this.f156420c.setText(R.string.View_VM_None);
        }

        public C62266a(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.n$b */
    class C62267b extends AbstractC62253g.AbstractC62254a {

        /* renamed from: f */
        private ImageView f156436f;

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b
        /* renamed from: a */
        public void mo215255a(EffectModel effectModel) {
            if (effectModel.isDisabled) {
                C60700b.m235864f("LabsFilterAdapter", "[onBind]", "bind preset data to AnimojiViewHolder instance!");
                return;
            }
            this.f156417d.setText(effectModel.getName());
            this.f156417d.setVisibility(0);
            this.f156436f.setVisibility(0);
            mo215359a(effectModel.getIconUrl());
        }

        /* renamed from: a */
        public void mo215359a(String str) {
            ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.itemView.getContext()).mo10415a(str).mo11137a(new C2432i(), new C2452w(C60773o.m236115a(8.0d)))).mo11123a(R.drawable.labs_background_none_bg)).mo10399a(this.f156436f);
            this.f156436f.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62265n.C62267b.C622681 */

                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), (float) C60773o.m236115a(8.0d));
                }
            });
            this.f156436f.setClipToOutline(true);
        }

        public C62267b(View view) {
            super(view);
            this.f156436f = (ImageView) view.findViewById(R.id.effect_img);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    /* renamed from: a */
    public int mo215253a(int i, EffectModel effectModel) {
        if (effectModel.isDisabled) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    /* renamed from: a */
    public RecyclerView.ViewHolder mo215254a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C62266a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_effect_preset_item_layout, viewGroup, false));
        }
        return new C62267b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_filter_item_layout, viewGroup, false));
    }
}
