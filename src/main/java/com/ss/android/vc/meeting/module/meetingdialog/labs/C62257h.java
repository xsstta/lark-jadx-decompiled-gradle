package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.BeautifyStyleEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.net.request.C63602e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.h */
public class C62257h extends AbstractC62253g {

    /* renamed from: e */
    private HashMap<EffectModel.BeautifyStyle, List<EffectModel>> f156421e;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    /* renamed from: a */
    public int mo215253a(int i, EffectModel effectModel) {
        return 2;
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.h$1 */
    static /* synthetic */ class C622581 {

        /* renamed from: a */
        static final /* synthetic */ int[] f156422a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel$BeautifyStyle[] r0 = com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel.BeautifyStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.meetingdialog.labs.C62257h.C622581.f156422a = r0
                com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel$BeautifyStyle r1 = com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel.BeautifyStyle.AUTO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.labs.C62257h.C622581.f156422a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel$BeautifyStyle r1 = com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel.BeautifyStyle.ORIGINAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.labs.C62257h.C622581.f156422a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel$BeautifyStyle r1 = com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel.BeautifyStyle.CUSTOMIZE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.labs.C62257h.C622581.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo215357a(HashMap<EffectModel.BeautifyStyle, List<EffectModel>> hashMap) {
        this.f156421e = hashMap;
    }

    @Override // com.ss.android.vc.net.request.AbstractC63598b, com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    public void onError(C63602e eVar) {
        C60738ac.m236023a((int) R.string.View_VM_UnstableConnectionTryAgain);
        this.f156412c = false;
        mo215348a(this.f156411b, false);
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.h$a */
    class C62259a extends AbstractC62253g.AbstractC62254a {

        /* renamed from: a */
        protected ImageView f156423a;

        /* renamed from: g */
        private ImageView f156425g;

        /* renamed from: h */
        private EffectModel f156426h;

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b, com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62254a
        /* renamed from: a */
        public void mo215355a(boolean z) {
            super.mo215355a(z);
            this.f156423a.setSelected(z);
            if (z) {
                this.f156423a.getDrawable().setTint(C60773o.m236126d(R.color.primary_pri_500));
            } else {
                this.f156423a.getDrawable().setTint(C60773o.m236126d(R.color.icon_n2));
            }
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g.AbstractC62255b
        /* renamed from: a */
        public void mo215255a(EffectModel effectModel) {
            this.f156426h = effectModel;
            this.f156423a.setVisibility(0);
            this.f156417d.setVisibility(0);
            this.f156423a.setBackgroundResource(R.drawable.labs_background_none_bg);
            if (this.f156426h instanceof BeautifyStyleEffect) {
                int i = C622581.f156422a[((BeautifyStyleEffect) this.f156426h).getBeautyStyle().ordinal()];
                if (i == 1) {
                    this.f156417d.setText(R.string.View_MV_BeautyAuto);
                    this.f156423a.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_touch_up_outlined));
                    this.f156423a.getDrawable().setTint(C60773o.m236126d(R.color.icon_n2));
                } else if (i == 2) {
                    this.f156417d.setText(R.string.View_MV_BeautyOriginal);
                    this.f156423a.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_ban_outlined));
                    this.f156423a.getDrawable().setTint(C60773o.m236126d(R.color.icon_n2));
                } else if (i == 3) {
                    this.f156417d.setText(R.string.View_MV_BeautyCustomize);
                    this.f156423a.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_admin_outlined));
                    this.f156423a.getDrawable().setTint(C60773o.m236126d(R.color.icon_n2));
                }
            }
            this.f156425g.setVisibility(8);
        }

        C62259a(View view) {
            super(view);
            this.f156423a = (ImageView) view.findViewById(R.id.icon_desc);
            this.f156425g = (ImageView) view.findViewById(R.id.effect_img);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    /* renamed from: b */
    public void onSuccess(EffectModel effectModel) {
        this.f156412c = false;
        if (this.f156410a != null) {
            EffectModel.BeautifyStyle beautyStyle = ((BeautifyStyleEffect) effectModel).getBeautyStyle();
            int i = 0;
            while (true) {
                if (i < this.f156410a.size()) {
                    if (!((EffectModel) this.f156410a.get(i)).isDisabled && beautyStyle == ((BeautifyStyleEffect) this.f156410a.get(i)).getBeautyStyle()) {
                        mo215348a(i, false);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            mo215349a(effectModel);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    /* renamed from: a */
    public RecyclerView.ViewHolder mo215254a(ViewGroup viewGroup, int i) {
        return new C62259a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_filter_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        super.onBindViewHolder(viewHolder, i);
        EffectModel effectModel = (EffectModel) this.f156410a.get(i);
        ((AbstractC62253g.AbstractC62254a) viewHolder).mo215255a(effectModel);
        AbstractC62253g.AbstractC62255b bVar = (AbstractC62253g.AbstractC62255b) viewHolder;
        if (this.f156411b == i) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo215355a(z);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener(effectModel, i) {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$h$7AfVNJmH2DLQu8r9PDU2J4I51Kk */
            public final /* synthetic */ EffectModel f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C62257h.lambda$7AfVNJmH2DLQu8r9PDU2J4I51Kk(C62257h.this, this.f$1, this.f$2, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243140a(EffectModel effectModel, int i, View view) {
        EffectModel.BeautifyStyle beautyStyle;
        List<EffectModel> list;
        if (!(this.f156421e == null || this.f156412c || (list = this.f156421e.get((beautyStyle = ((BeautifyStyleEffect) effectModel).getBeautyStyle()))) == null)) {
            if (beautyStyle == EffectModel.BeautifyStyle.AUTO) {
                ArrayList arrayList = new ArrayList();
                for (EffectModel effectModel2 : list) {
                    if (!C62228c.m243014a(effectModel2) && !TextUtils.equals(effectModel2.getResourceId(), "6920051384008053255")) {
                        arrayList.add(effectModel2);
                    }
                }
                if (arrayList.size() > 0) {
                    C60700b.m235851b("LabsBeautifyStyleAdapter", "[bind]", "beautifyStyle ：" + beautyStyle.getValue() + " has not ready effect : " + arrayList.toString());
                    if (!C60785x.m236238b()) {
                        C60738ac.m236023a((int) R.string.View_G_NoConnection);
                        return;
                    }
                    this.f156412c = true;
                    mo215348a(i, true);
                    C62228c.m243010a(effectModel, arrayList, this);
                    return;
                }
                mo215353b(i, true);
                mo215349a(effectModel);
                return;
            }
            mo215353b(i, true);
            mo215349a(effectModel);
        }
    }
}
