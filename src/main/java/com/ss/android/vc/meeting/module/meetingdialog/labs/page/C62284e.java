package com.ss.android.vc.meeting.module.meetingdialog.labs.page;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62300w;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62215b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62265n;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62293r;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.page.e */
public class C62284e extends AbstractC62281c {
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: c */
    public boolean mo215385c() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: a */
    public void mo215378a() {
        C62228c.m243016b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: d */
    public AbstractC62253g mo215386d() {
        return new C62265n();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d, com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    public void bP_() {
        if (this.f156483d != null) {
            super.bP_();
            if (!(this.f156480a == null || this.f156480a.isEmpty())) {
                String optString = C62269o.m243179b().optString("selectedFilter");
                if (this.f156485f == null || TextUtils.isEmpty(optString)) {
                    int i = 0;
                    this.f156485f = (EffectModel) this.f156480a.get(0);
                    if (TextUtils.isEmpty(optString)) {
                        this.f156483d.mo215347a(0);
                        return;
                    }
                    for (EffectModel effectModel : this.f156480a) {
                        if (effectModel.isDisabled || !optString.equals(effectModel.getResourceId())) {
                            i++;
                        } else {
                            this.f156485f = effectModel;
                            this.f156483d.mo215347a(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public String mo215377a(Context context) {
        return context.getString(R.string.View_G_Filters);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: a */
    public void mo215390a(List<EffectModel> list) {
        super.mo215390a(list);
        list.add(EffectModel.newDisabledFilter());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: b */
    public RecyclerView.AbstractC1335d mo215403b(Context context) {
        return new C62215b(C60773o.m236115a(12.0d), C60773o.m236115a(16.0d), C60773o.m236115a(5.0d), 0);
    }

    public C62284e(C62293r rVar, AbstractC62216c.AbstractC62218b.AbstractC62220b bVar, AbstractC62300w wVar) {
        super(rVar, bVar, wVar);
    }
}
