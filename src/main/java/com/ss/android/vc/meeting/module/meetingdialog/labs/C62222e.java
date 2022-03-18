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

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.e */
public class C62222e extends AbstractC62253g {

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.e$b */
    class C62224b extends AbstractC62253g.AbstractC62254a {

        /* renamed from: f */
        private ImageView f156334f;

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b
        /* renamed from: a */
        public void mo215255a(EffectModel effectModel) {
            if (effectModel.isDisabled) {
                C60700b.m235864f("LabsAnimojiAdapter", "[onBind]", "bind preset data to AnimojiViewHolder instance!");
            } else {
                mo215256a(effectModel.getIconUrl());
            }
        }

        /* renamed from: a */
        public void mo215256a(String str) {
            ((C2124f) ComponentCallbacks2C2115c.m9151c(this.itemView.getContext()).mo10415a(str).mo11137a(new C2432i(), new C2452w(C60773o.m236115a(8.0d)))).mo10399a(this.f156334f);
            this.f156334f.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62222e.C62224b.C622251 */

                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), (float) C60773o.m236115a(8.0d));
                }
            });
            this.f156334f.setClipToOutline(true);
        }

        public C62224b(View view) {
            super(view);
            this.f156334f = (ImageView) view.findViewById(R.id.animoji_img);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.e$a */
    class C62223a extends AbstractC62253g.C62256c {
        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b, com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.C62256c
        /* renamed from: a */
        public void mo215255a(EffectModel effectModel) {
            if (effectModel.isDisabled) {
                this.f156419b.getDrawable().setTint(C60773o.m236126d(R.color.primary_pri_500));
                this.f156419b.setBackground(null);
                return;
            }
            C60700b.m235864f("LabsAnimojiAdapter", "[onBind]", "bind effect data to PresetViewHolder instance!");
        }

        public C62223a(View view) {
            super(view);
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
            return new C62223a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_effect_preset_item_layout, viewGroup, false));
        }
        return new C62224b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_animoji_item_layout, viewGroup, false));
    }
}
