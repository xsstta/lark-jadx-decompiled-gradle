package com.ss.android.vc.meeting.module.meetingdialog.labs.page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62221d;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62300w;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62302x;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62215b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62260i;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62293r;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.meeting.module.meetingdialog.labs.widget.LabsLoading;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.page.c */
public abstract class AbstractC62281c extends AbstractC62283d implements AbstractC62302x, AbstractC63598b<List<EffectModel>> {

    /* renamed from: a */
    protected List<EffectModel> f156480a;

    /* renamed from: b */
    protected View f156481b;

    /* renamed from: c */
    protected RecyclerView f156482c;

    /* renamed from: d */
    protected AbstractC62253g f156483d;

    /* renamed from: e */
    protected RecyclerView.AbstractC1335d f156484e;

    /* renamed from: f */
    protected EffectModel f156485f;

    /* renamed from: g */
    public LabsLoading f156486g;

    /* renamed from: l */
    private boolean f156487l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo215378a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo215379a(View view) {
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public void mo215391a(C62260i iVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo215390a(List<EffectModel> list) {
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public void mo215393a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract AbstractC62253g mo215386d();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo215404f() {
        return R.layout.labs_background_layout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo215405i() {
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: e */
    public void mo215396e() {
        mo215387h();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: g */
    public View mo215398g() {
        return this.f156481b;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    public void bP_() {
        boolean z;
        AbstractC62253g gVar = this.f156483d;
        if (this.f156480a != null) {
            z = true;
        } else {
            z = false;
        }
        gVar.mo215352a(z);
        m243261j();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    public void bO_() {
        super.bO_();
        mo215380a(this.f156485f, false);
        m243261j();
        this.f156489h.mo215433a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo215387h() {
        if (this.f156481b != null) {
            int a = (C60776r.m236139a() - C60773o.m236115a(240.0d)) / 12;
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f156482c.getLayoutParams();
            layoutParams.leftMargin = a;
            layoutParams.rightMargin = a;
            this.f156482c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: j */
    private void m243261j() {
        List<EffectModel> list = this.f156480a;
        if (list != null) {
            if (list.isEmpty()) {
                RecyclerView recyclerView = this.f156482c;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                LabsLoading labsLoading = this.f156486g;
                if (labsLoading != null) {
                    labsLoading.mo215456c();
                    this.f156486g.setVisibility(0);
                }
            } else {
                this.f156487l = false;
                RecyclerView recyclerView2 = this.f156482c;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
                LabsLoading labsLoading2 = this.f156486g;
                if (labsLoading2 != null) {
                    labsLoading2.setVisibility(8);
                }
            }
            AbstractC62253g gVar = this.f156483d;
            if (gVar != null) {
                gVar.mo215351a(this.f156480a);
            }
        } else if (this.f156487l) {
            RecyclerView recyclerView3 = this.f156482c;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(4);
            }
            LabsLoading labsLoading3 = this.f156486g;
            if (labsLoading3 != null) {
                labsLoading3.mo215456c();
                this.f156486g.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: b */
    public void mo215395b(ViewGroup viewGroup) {
        viewGroup.removeView(this.f156481b);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    public void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        this.f156489h.mo215446e(this.f156485f);
        C62269o.m243187e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.AbstractC1335d mo215403b(Context context) {
        return new C62215b(C60773o.m236115a(12.0d), C60773o.m236115a(12.0d), C60773o.m236115a(8.0d), 0);
    }

    /* renamed from: b */
    public void onSuccess(List<EffectModel> list) {
        JSONObject b = C62269o.m243179b();
        for (EffectModel effectModel : list) {
            int optInt = b.optInt(effectModel.getResourceId(), -1);
            if (optInt != -1) {
                effectModel.setTagUserValue(optInt);
            }
        }
        ArrayList arrayList = new ArrayList();
        this.f156480a = arrayList;
        mo215390a(arrayList);
        this.f156480a.addAll(list);
        if (this.f156481b != null) {
            bP_();
        }
    }

    @Override // com.ss.android.vc.net.request.AbstractC63598b
    public void onError(C63602e eVar) {
        C60700b.m235864f("LabsBaseEffectTab", "[onError]", "load onError");
        RecyclerView recyclerView = this.f156482c;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        LabsLoading labsLoading = this.f156486g;
        if (labsLoading != null) {
            labsLoading.mo215456c();
            this.f156486g.setVisibility(0);
        }
        this.f156487l = true;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public void mo215389a(ViewGroup viewGroup) {
        if (this.f156481b == null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(mo215404f(), viewGroup, false);
            this.f156481b = inflate;
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.background_recycler);
            this.f156482c = recyclerView;
            recyclerView.setLayoutManager(new GridLayoutManager(this.f156481b.getContext(), 5));
            AbstractC62253g d = mo215386d();
            this.f156483d = d;
            d.mo215350a(this);
            this.f156483d.mo215352a(false);
            this.f156482c.setAdapter(this.f156483d);
            RecyclerView.AbstractC1335d b = mo215403b(this.f156481b.getContext());
            this.f156484e = b;
            this.f156482c.addItemDecoration(b);
            LabsLoading labsLoading = (LabsLoading) this.f156481b.findViewById(R.id.labs_loading);
            this.f156486g = labsLoading;
            labsLoading.setListener(new AbstractC62221d() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c.C622821 */

                @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62221d
                /* renamed from: a */
                public void mo215252a() {
                    C60700b.m235851b("LabsBaseEffectTab", "[onRetry]", "mLabsLoading onRetry");
                    AbstractC62281c.this.f156482c.setVisibility(4);
                    AbstractC62281c.this.f156486g.setVisibility(0);
                    AbstractC62281c.this.f156486g.mo215454a();
                    AbstractC62281c.this.mo215378a();
                    AbstractC62281c.this.f156489h.mo215439b(AbstractC62281c.this);
                }
            });
            mo215379a(this.f156481b);
        }
        mo215387h();
        viewGroup.addView(this.f156481b);
        bP_();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62302x
    /* renamed from: a */
    public void mo215380a(EffectModel effectModel, boolean z) {
        boolean z2 = false;
        if (effectModel == null) {
            C60700b.m235864f("LabsBaseEffectTab", "[onEffectSelected]", "invalid model, fromUser:" + z);
            this.f156490i.mo215206a(false);
            return;
        }
        this.f156485f = effectModel;
        if (this.f156491j) {
            if (!effectModel.isDisabled && effectModel.hasTags()) {
                z2 = true;
            }
            this.f156490i.mo215206a(z2);
            if (z2) {
                this.f156490i.mo215204a(effectModel.getName(), effectModel.getTagMinValue(), effectModel.getTagMaxValue(), effectModel.getTagDefaultValue(), effectModel.getTagUserValue());
            }
        }
        if (this.f156489h != null && z) {
            this.f156489h.mo215432a(effectModel);
            this.f156489h.mo215442c(effectModel);
            C62269o.m243187e();
        }
    }

    public AbstractC62281c(C62293r rVar, AbstractC62216c.AbstractC62218b.AbstractC62220b bVar, AbstractC62300w wVar) {
        super(rVar, bVar, wVar);
        if (mo215405i()) {
            mo215378a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        super.onProgressChanged(seekBar, i, z);
        if (this.f156485f == null) {
            C60700b.m235864f("LabsBaseEffectTab", "[onProgressChanged]", "invalid model, fromUser:" + z);
        }
        EffectModel effectModel = this.f156485f;
        if (effectModel != null && z) {
            effectModel.setTagUserValue(i);
            this.f156489h.mo215432a(this.f156485f);
        }
    }
}
