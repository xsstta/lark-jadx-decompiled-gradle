package com.ss.android.vc.meeting.module.meetingdialog.labs.page;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62253g;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62300w;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62257h;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62293r;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62295t;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.BeautifyStyleEffect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class LabsTouchUpTab extends AbstractC62281c {

    /* renamed from: l */
    public static HashMap<String, C62275a> f156455l = new HashMap<>(4);

    /* renamed from: m */
    private static List<EffectModel> f156456m;

    /* renamed from: n */
    private List<EffectModel> f156457n;

    /* renamed from: o */
    private List<EffectModel> f156458o;

    /* renamed from: p */
    private List<EffectModel> f156459p;

    /* renamed from: q */
    private EffectModel f156460q;

    /* renamed from: r */
    private C62295t f156461r;

    /* renamed from: s */
    private C62257h f156462s;

    /* renamed from: t */
    private View f156463t;

    /* renamed from: u */
    private TextView f156464u;

    /* renamed from: v */
    private HashMap<EffectModel.BeautifyStyle, List<EffectModel>> f156465v;

    public enum ViewType {
        BEAUTIFY_STYLE,
        TOUCHUP
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: c */
    public boolean mo215385c() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: a */
    public void mo215378a() {
        C62228c.m243024e(this);
    }

    /* renamed from: l */
    private void m243216l() {
        this.f156480a = f156456m;
        if (this.f156481b != null) {
            mo215381a(ViewType.BEAUTIFY_STYLE);
        }
    }

    /* renamed from: j */
    private boolean m243215j() {
        return !TextUtils.isEmpty(C62269o.m243179b().optString("selectedBeauty"));
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d, com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    public void bO_() {
        this.f156491j = true;
        this.f156489h.mo215433a(this);
        if (this.f156483d == null || !(this.f156483d instanceof C62257h)) {
            mo215380a(this.f156485f, false);
        } else {
            mo215380a(this.f156460q, false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: d */
    public AbstractC62253g mo215386d() {
        if (this.f156462s == null) {
            C62257h hVar = new C62257h();
            this.f156462s = hVar;
            hVar.mo215350a(this);
        }
        return this.f156462s;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f156456m = arrayList;
        arrayList.clear();
        f156456m.add(BeautifyStyleEffect.newInstance(EffectModel.BeautifyStyle.ORIGINAL));
        f156456m.add(BeautifyStyleEffect.newInstance(EffectModel.BeautifyStyle.AUTO));
        f156456m.add(BeautifyStyleEffect.newInstance(EffectModel.BeautifyStyle.CUSTOMIZE));
        f156455l.put("6920046832198357517", C62275a.m243226a(R.drawable.ud_icon_blur_outlined, R.string.View_G_Smooth));
        f156455l.put("6920051116172382733", C62275a.m243226a(R.drawable.ud_icon_big_eye_outlined, R.string.View_G_Eye));
        f156455l.put("6920051261916058119", C62275a.m243226a(R.drawable.ud_icon_face_lift_outlined, R.string.View_G_Shape));
        f156455l.put("6920051384008053255", C62275a.m243226a(R.drawable.ud_icon_lipstick_outlined, R.string.View_G_Lipstick));
        f156455l.put("6967169337991893506", C62275a.m243226a(R.drawable.ud_icon_blur_outlined, R.string.View_G_Smooth));
        f156455l.put("6967169107577803265", C62275a.m243226a(R.drawable.ud_icon_big_eye_outlined, R.string.View_G_Eye));
        f156455l.put("6967169240860201474", C62275a.m243226a(R.drawable.ud_icon_face_lift_outlined, R.string.View_G_Shape));
        f156455l.put("6967169668431745537", C62275a.m243226a(R.drawable.ud_icon_lipstick_outlined, R.string.View_G_Lipstick));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: h */
    public void mo215387h() {
        int i;
        if (this.f156483d != null && this.f156481b != null) {
            if (this.f156483d instanceof C62257h) {
                int a = (C60776r.m236139a() - C60773o.m236115a(240.0d)) / 12;
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f156482c.getLayoutParams();
                layoutParams.leftMargin = a;
                layoutParams.rightMargin = a;
                this.f156482c.setLayoutParams(layoutParams);
            } else if (this.f156483d instanceof C62295t) {
                int a2 = (C60776r.m236139a() - C60773o.m236115a(240.0d)) / 12;
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f156463t.getLayoutParams();
                int i2 = a2 * 2;
                layoutParams2.leftMargin = i2;
                this.f156463t.setLayoutParams(layoutParams2);
                if (this.f156463t.getWidth() <= 0) {
                    i = Math.max(C60773o.m236115a(20.0d), (int) this.f156464u.getPaint().measureText(C60773o.m236119a((int) R.string.View_G_Back)));
                } else {
                    i = this.f156463t.getWidth();
                }
                int a3 = (C60776r.m236139a() - i2) - i;
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.f156482c.getLayoutParams();
                layoutParams3.leftMargin = a2;
                layoutParams3.rightMargin = (a3 - (a2 * 9)) - C60773o.m236115a(192.0d);
                this.f156482c.setLayoutParams(layoutParams3);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d, com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    public void bP_() {
        char c;
        if (this.f156483d != null) {
            super.bP_();
            if (this.f156480a != null && !this.f156480a.isEmpty()) {
                int i = 0;
                if (this.f156483d instanceof C62295t) {
                    String optString = C62269o.m243179b().optString("selectedBeauty");
                    if (this.f156485f != null) {
                        if (TextUtils.isEmpty(optString) && this.f156463t.getVisibility() == 0 && this.f156483d != null) {
                            this.f156483d.mo215347a(-1);
                            mo215381a(ViewType.BEAUTIFY_STYLE);
                        }
                    } else if (!TextUtils.isEmpty(optString)) {
                        for (EffectModel effectModel : this.f156480a) {
                            if (effectModel.isDisabled || !optString.equals(effectModel.getResourceId())) {
                                i++;
                            } else {
                                this.f156485f = effectModel;
                                this.f156483d.mo215347a(i);
                                return;
                            }
                        }
                    } else if (this.f156463t.getVisibility() == 0 && this.f156483d != null) {
                        this.f156483d.mo215347a(-1);
                        mo215381a(ViewType.BEAUTIFY_STYLE);
                    }
                } else if (this.f156483d instanceof C62257h) {
                    int optInt = C62269o.m243179b().optInt("selectedBeautyStyle", -1);
                    if (this.f156460q == null || optInt == EffectModel.BeautifyStyle.ORIGINAL.getValue()) {
                        ((C62257h) this.f156483d).mo215357a(this.f156465v);
                        if (optInt != -1) {
                            if (optInt == EffectModel.BeautifyStyle.AUTO.getValue()) {
                                m243214a(EffectModel.BeautifyStyle.AUTO);
                            } else if (optInt == EffectModel.BeautifyStyle.ORIGINAL.getValue()) {
                                m243214a(EffectModel.BeautifyStyle.ORIGINAL);
                            } else if (optInt == EffectModel.BeautifyStyle.CUSTOMIZE.getValue()) {
                                m243214a(EffectModel.BeautifyStyle.CUSTOMIZE);
                            }
                        } else if (m243215j()) {
                            boolean z = false;
                            boolean z2 = true;
                            for (EffectModel effectModel2 : this.f156457n) {
                                int optInt2 = C62269o.m243179b().optInt(effectModel2.getResourceId());
                                int tagDefaultValue = effectModel2.getTagDefaultValue();
                                if (!(optInt2 == -1 || optInt2 == tagDefaultValue)) {
                                    z = true;
                                }
                                String resourceId = effectModel2.getResourceId();
                                resourceId.hashCode();
                                switch (resourceId.hashCode()) {
                                    case -2081883486:
                                        if (resourceId.equals("6920051261916058119")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1171254128:
                                        if (resourceId.equals("6920046832198357517")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1138213902:
                                        if (resourceId.equals("6967169240860201474")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -394114509:
                                        if (resourceId.equals("6967169337991893506")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 914577123:
                                        if (resourceId.equals("6967169107577803265")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1476387371:
                                        if (resourceId.equals("6920051116172382733")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1542923883:
                                        if (resourceId.equals("6967169668431745537")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1572960728:
                                        if (resourceId.equals("6920051384008053255")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                        if (optInt2 == 30) {
                                            continue;
                                        }
                                        break;
                                    case 6:
                                    case 7:
                                        if (optInt2 == 0) {
                                            continue;
                                        }
                                        break;
                                }
                                z2 = false;
                            }
                            if (!z) {
                                m243214a(EffectModel.BeautifyStyle.AUTO);
                            } else if (z2) {
                                m243214a(EffectModel.BeautifyStyle.AUTO);
                            } else {
                                m243214a(EffectModel.BeautifyStyle.CUSTOMIZE);
                            }
                        } else {
                            m243214a(EffectModel.BeautifyStyle.ORIGINAL);
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public String mo215377a(Context context) {
        return context.getString(R.string.View_VM_TouchUpShort);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: a */
    public void mo215379a(View view) {
        super.mo215379a(view);
        View findViewById = view.findViewById(R.id.back_view);
        this.f156463t = findViewById;
        findViewById.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsTouchUpTab.C622741 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                LabsTouchUpTab.this.mo215381a(ViewType.BEAUTIFY_STYLE);
            }
        });
        this.f156464u = (TextView) view.findViewById(R.id.tv_back);
    }

    /* renamed from: a */
    private void m243214a(EffectModel.BeautifyStyle beautifyStyle) {
        if (this.f156483d instanceof C62257h) {
            int i = 0;
            for (EffectModel effectModel : this.f156480a) {
                if (((BeautifyStyleEffect) effectModel).getBeautyStyle() == beautifyStyle) {
                    this.f156460q = effectModel;
                    this.f156483d.mo215347a(i);
                    return;
                }
                i++;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: b */
    public void onSuccess(List<EffectModel> list) {
        if (this.f156458o == null) {
            this.f156458o = new ArrayList();
        }
        if (this.f156459p == null) {
            this.f156459p = new ArrayList();
        }
        if (this.f156457n == null) {
            this.f156457n = new ArrayList();
        }
        if (this.f156465v == null) {
            this.f156465v = new HashMap<>();
        }
        this.f156458o.clear();
        this.f156459p.clear();
        this.f156457n.clear();
        this.f156465v.clear();
        JSONObject b = C62269o.m243179b();
        for (EffectModel effectModel : list) {
            if (f156455l.containsKey(effectModel.getResourceId())) {
                int optInt = b.optInt(effectModel.getResourceId(), -1);
                if (optInt != -1) {
                    effectModel.setTagUserValue(optInt);
                } else {
                    effectModel.setTagUserValue(0);
                    effectModel.setTagDefaultValue(0);
                }
                this.f156458o.add(EffectModel.newBeautifyEffectModel(effectModel, C62269o.m243171a(effectModel, EffectModel.BeautifyStyle.AUTO)));
                this.f156459p.add(EffectModel.newBeautifyEffectModel(effectModel, C62269o.m243171a(effectModel, EffectModel.BeautifyStyle.ORIGINAL)));
                this.f156457n.add(effectModel);
            }
        }
        this.f156465v.put(EffectModel.BeautifyStyle.AUTO, this.f156458o);
        this.f156465v.put(EffectModel.BeautifyStyle.ORIGINAL, this.f156459p);
        this.f156465v.put(EffectModel.BeautifyStyle.CUSTOMIZE, this.f156457n);
        m243216l();
    }

    /* renamed from: a */
    public void mo215381a(ViewType viewType) {
        if (viewType == ViewType.BEAUTIFY_STYLE) {
            this.f156480a = f156456m;
            if (this.f156462s == null) {
                C62257h hVar = new C62257h();
                this.f156462s = hVar;
                hVar.mo215350a(this);
            }
            this.f156483d = this.f156462s;
            this.f156482c.setAdapter(this.f156483d);
            this.f156482c.setLayoutManager(new GridLayoutManager(this.f156481b.getContext(), 5));
            this.f156463t.setVisibility(8);
            mo215387h();
            bP_();
            mo215380a(this.f156460q, false);
        } else if (viewType == ViewType.TOUCHUP) {
            this.f156480a = this.f156457n;
            if (this.f156461r == null) {
                C62295t tVar = new C62295t();
                this.f156461r = tVar;
                tVar.mo215350a(this);
            }
            this.f156483d = this.f156461r;
            this.f156482c.setAdapter(this.f156483d);
            this.f156482c.setLayoutManager(new GridLayoutManager(this.f156481b.getContext(), 4));
            bP_();
            mo215387h();
            this.f156463t.setVisibility(0);
            mo215380a(this.f156485f, false);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsTouchUpTab$a */
    public static class C62275a {

        /* renamed from: a */
        public int f156467a;

        /* renamed from: b */
        public int f156468b;

        /* renamed from: a */
        static C62275a m243226a(int i, int i2) {
            C62275a aVar = new C62275a();
            aVar.f156467a = i;
            aVar.f156468b = i2;
            return aVar;
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62302x, com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    /* renamed from: a */
    public void mo215380a(EffectModel effectModel, boolean z) {
        if (effectModel == null) {
            C60700b.m235864f("LabsBaseEffectTab", "[onEffectSelected]", "invalid model, fromUser:" + z);
            this.f156490i.mo215206a(false);
        } else if (effectModel.isBeautifyStyle()) {
            this.f156490i.mo215206a(false);
            this.f156460q = effectModel;
            if (this.f156489h != null && z) {
                EffectModel.BeautifyStyle beautyStyle = ((BeautifyStyleEffect) effectModel).getBeautyStyle();
                C60700b.m235851b("LabsBaseEffectTab", "[onEffectSelected2]", "beautifyStyle : " + beautyStyle);
                List<EffectModel> list = null;
                if (beautyStyle == EffectModel.BeautifyStyle.AUTO) {
                    list = this.f156458o;
                } else if (beautyStyle == EffectModel.BeautifyStyle.ORIGINAL) {
                    list = this.f156459p;
                } else if (beautyStyle == EffectModel.BeautifyStyle.CUSTOMIZE) {
                    list = this.f156457n;
                }
                this.f156489h.mo215432a(effectModel);
                C62269o.m243187e();
                for (EffectModel effectModel2 : list) {
                    this.f156489h.mo215438b(effectModel2);
                }
                if (beautyStyle == EffectModel.BeautifyStyle.CUSTOMIZE) {
                    mo215381a(ViewType.TOUCHUP);
                }
                this.f156489h.mo215431a(beautyStyle);
            }
            if (!(this.f156489h == null || z || C62269o.m243179b().optInt("selectedBeautyStyle", -1) != -1)) {
                this.f156489h.mo215432a(effectModel);
                C62269o.m243187e();
            }
        } else {
            super.mo215380a(effectModel, z);
        }
    }

    public LabsTouchUpTab(C62293r rVar, AbstractC62216c.AbstractC62218b.AbstractC62220b bVar, AbstractC62300w wVar) {
        super(rVar, bVar, wVar);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d, com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62281c
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        super.onProgressChanged(seekBar, i, z);
        if (this.f156485f != null && z && this.f156483d != null && (this.f156483d instanceof C62295t)) {
            C62295t.C62296a aVar = new C62295t.C62296a();
            if (!this.f156485f.hasTags() || this.f156485f.getTagUserValue() <= 0) {
                aVar.f156526a = false;
            } else {
                aVar.f156526a = true;
            }
            C62295t tVar = this.f156461r;
            tVar.notifyItemChanged(tVar.mo215346a(), aVar);
        }
    }
}
