package com.ss.android.vc.meeting.module.meetingdialog.labs.page;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.background.FileStatus;
import com.ss.android.vc.entity.background.PushVirtualBackgroundType;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62214a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62221d;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62300w;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62260i;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62261j;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62293r;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.VcVirtualBackgroundType;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62277b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.widget.LabsLoading;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.page.b */
public class C62277b extends AbstractC62283d implements AbstractC62214a {

    /* renamed from: a */
    public RecyclerView f156470a;

    /* renamed from: b */
    public LabsLoading f156471b;

    /* renamed from: c */
    private View f156472c;

    /* renamed from: d */
    private C62239f f156473d;

    /* renamed from: e */
    private C62260i f156474e;

    /* renamed from: f */
    private RecyclerView.AbstractC1335d f156475f;

    /* renamed from: g */
    private VirtualBackgroundInfo f156476g;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public void mo215393a(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    public void bP_() {
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: e */
    public void mo215396e() {
        mo215397f();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: g */
    public View mo215398g() {
        return this.f156472c;
    }

    /* renamed from: h */
    public void mo215399h() {
        C62239f fVar = this.f156473d;
        if (fVar != null) {
            fVar.mo215334b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62214a
    /* renamed from: b */
    public void mo215240b() {
        if (this.f156492k != null) {
            this.f156492k.mo215251b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    public void bO_() {
        super.bO_();
        this.f156490i.mo215206a(false);
        this.f156489h.mo215433a(this);
    }

    /* renamed from: i */
    public void mo215400i() {
        this.f156489h.mo215435a(false, (AbstractC63598b<C62260i>) new AbstractC63598b<C62260i>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62277b.C622803 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m243258a() {
                C62277b.this.mo215391a((C62260i) null);
            }

            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m243259b(C62260i iVar) {
                C62277b.this.mo215391a(iVar);
            }

            /* renamed from: a */
            public void onSuccess(C62260i iVar) {
                C60700b.m235851b("LabsBackgroundTab", "[loadLabsConfig]", "onSuccess");
                C60735ab.m236001a(new Runnable(iVar) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.$$Lambda$b$3$VpRkwTnsDXyUmFMhesLaVOIhy4 */
                    public final /* synthetic */ C62260i f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C62277b.C622803.m271308lambda$VpRkwTnsDXyUmFMhesLaVOIhy4(C62277b.C622803.this, this.f$1);
                    }
                });
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("LabsBackgroundTab", "[loadLabsConfig2]", "onError: " + eVar.mo219902b());
                C60735ab.m236001a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.$$Lambda$b$3$BLtqpmyCQy1wZvYmk6T66pjUHBU */

                    public final void run() {
                        C62277b.C622803.lambda$BLtqpmyCQy1wZvYmk6T66pjUHBU(C62277b.C622803.this);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62214a
    /* renamed from: a */
    public void mo215236a() {
        if (this.f156492k != null) {
            this.f156492k.mo215247a();
        }
    }

    /* renamed from: f */
    public void mo215397f() {
        if (this.f156472c != null) {
            int a = (C60776r.m236139a() - C60773o.m236115a(240.0d)) / 12;
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f156470a.getLayoutParams();
            layoutParams.leftMargin = a;
            layoutParams.rightMargin = a;
            this.f156470a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: j */
    public void mo215401j() {
        ViewDeviceSetting viewDeviceSetting;
        if (C62261j.f156429a != null && this.f156474e != null && (viewDeviceSetting = C62261j.f156429a.f156428b) != null && viewDeviceSetting.video != null && viewDeviceSetting.video.virtualBackground == null && !viewDeviceSetting.video.backgroundBlur) {
            this.f156474e.f156428b = viewDeviceSetting;
            this.f156476g = null;
        }
    }

    /* renamed from: c */
    private RecyclerView.AbstractC1335d m243238c(Context context) {
        return new RecyclerView.AbstractC1335d() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62277b.C622792 */

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int i;
                super.getItemOffsets(rect, view, recyclerView, state);
                int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
                int itemCount = recyclerView.getAdapter().getItemCount();
                int i2 = itemCount / 5;
                if (itemCount % 5 == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                int i3 = i2 + i;
                if (childLayoutPosition < 5) {
                    rect.top = C60773o.m236115a(12.0d);
                } else {
                    rect.top = C60773o.m236115a(8.0d);
                }
                if (childLayoutPosition >= (i3 - 1) * 5) {
                    rect.bottom = C60773o.m236115a(12.0d);
                } else {
                    rect.bottom = 0;
                }
                if (childLayoutPosition == itemCount - 1 && recyclerView.getAdapter().getItemViewType(childLayoutPosition) == VcVirtualBackgroundType.TYPE_CUSTOMIZE.getNumber()) {
                    rect.bottom = C60773o.m236115a(16.0d);
                    if (childLayoutPosition % 5 == 0) {
                        rect.top = C60773o.m236115a(12.0d);
                    } else {
                        rect.top = 0;
                    }
                }
            }
        };
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public String mo215377a(Context context) {
        return context.getString(R.string.View_VM_VirtualBackground);
    }

    /* renamed from: a */
    private VcVirtualBackgroundType m243236a(VirtualBackgroundInfo virtualBackgroundInfo) {
        if (virtualBackgroundInfo == null) {
            return VcVirtualBackgroundType.UNKNOWN;
        }
        if (virtualBackgroundInfo.isDisabled) {
            return VcVirtualBackgroundType.TYPE_DISABLE;
        }
        if (virtualBackgroundInfo.isBlur) {
            return VcVirtualBackgroundType.TYPE_VIRTUAL;
        }
        return VcVirtualBackgroundType.TYPE_BACKGROUND;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: b */
    public void mo215395b(ViewGroup viewGroup) {
        viewGroup.removeView(this.f156472c);
        C62239f fVar = this.f156473d;
        if (fVar != null) {
            fVar.mo215325a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62214a
    /* renamed from: a */
    public void mo215237a(FileStatus fileStatus) {
        this.f156489h.mo215425a(fileStatus);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public void mo215389a(ViewGroup viewGroup) {
        if (this.f156472c == null) {
            Context context = viewGroup.getContext();
            View inflate = LayoutInflater.from(context).inflate(R.layout.labs_background_layout, viewGroup, false);
            this.f156472c = inflate;
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.background_recycler);
            this.f156470a = recyclerView;
            recyclerView.setLayoutManager(new GridLayoutManager(context, 5));
            C62239f fVar = new C62239f(this.f156489h.mo215440c(), this.f156489h.mo215443d());
            this.f156473d = fVar;
            fVar.mo215333a(false);
            this.f156473d.mo215330a(this);
            this.f156470a.setAdapter(this.f156473d);
            RecyclerView.AbstractC1335d c = m243238c(this.f156472c.getContext());
            this.f156475f = c;
            this.f156470a.addItemDecoration(c);
            LabsLoading labsLoading = (LabsLoading) this.f156472c.findViewById(R.id.labs_loading);
            this.f156471b = labsLoading;
            labsLoading.setListener(new AbstractC62221d() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62277b.C622781 */

                @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62221d
                /* renamed from: a */
                public void mo215252a() {
                    C60700b.m235851b("LabsBackgroundTab", "[onRetry]", "mLabsLoading onRetry");
                    C62277b.this.f156470a.setVisibility(4);
                    C62277b.this.f156471b.setVisibility(0);
                    C62277b.this.f156471b.mo215454a();
                    C62277b.this.mo215400i();
                    C62277b.this.f156489h.mo215439b(C62277b.this);
                }
            });
        }
        mo215397f();
        viewGroup.addView(this.f156472c);
        if (this.f156474e != null) {
            mo215394b(viewGroup.getContext());
        }
    }

    /* renamed from: b */
    public void mo215394b(Context context) {
        boolean z;
        C62239f fVar = this.f156473d;
        if (fVar != null) {
            if (this.f156474e != null) {
                z = true;
            } else {
                z = false;
            }
            fVar.mo215333a(z);
            if (this.f156474e != null) {
                this.f156471b.setVisibility(8);
                this.f156470a.setVisibility(0);
                ArrayList arrayList = new ArrayList();
                if (!C60742af.m236059a(this.f156474e.f156427a)) {
                    arrayList.addAll(this.f156474e.f156427a);
                }
                if (LabsUtils.m242908b(this.f156489h.mo215443d())) {
                    arrayList.add(VirtualBackgroundInfo.newUpload());
                }
                if (this.f156489h != null && LabsUtils.m242902a(this.f156489h.mo215443d())) {
                    arrayList.add(VirtualBackgroundInfo.newCustomized());
                }
                this.f156473d.mo215331a(arrayList);
                VirtualBackgroundInfo virtualBackgroundInfo = this.f156476g;
                if (virtualBackgroundInfo != null && virtualBackgroundInfo.needSelectedBorder()) {
                    m243237a(m243236a(this.f156476g), this.f156476g.key);
                } else if (this.f156474e.f156428b == null || this.f156474e.f156428b.video == null) {
                    m243237a(VcVirtualBackgroundType.TYPE_DISABLE, (String) null);
                } else if (this.f156474e.f156428b.video.backgroundBlur) {
                    m243237a(VcVirtualBackgroundType.TYPE_VIRTUAL, this.f156474e.f156428b.video.virtualBackground);
                } else if (TextUtils.isEmpty(this.f156474e.f156428b.video.virtualBackground)) {
                    m243237a(VcVirtualBackgroundType.TYPE_DISABLE, this.f156474e.f156428b.video.virtualBackground);
                } else {
                    m243237a(VcVirtualBackgroundType.TYPE_BACKGROUND, this.f156474e.f156428b.video.virtualBackground);
                }
            }
            this.f156473d.mo215327a(context);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d
    /* renamed from: a */
    public void mo215391a(C62260i iVar) {
        if (iVar != null && ((iVar.f156427a != null || iVar.f156428b != null) && (iVar.f156427a == null || iVar.f156427a.size() > 2))) {
            this.f156474e = iVar;
            View view = this.f156472c;
            if (view != null) {
                mo215394b(view.getContext());
            }
        } else if (this.f156472c != null) {
            this.f156471b.setVisibility(0);
            this.f156470a.setVisibility(4);
            this.f156471b.mo215456c();
        }
    }

    /* renamed from: a */
    private void m243237a(VcVirtualBackgroundType vcVirtualBackgroundType, String str) {
        C62239f fVar = this.f156473d;
        if (fVar != null) {
            fVar.mo215329a(vcVirtualBackgroundType, str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62214a
    /* renamed from: a */
    public void mo215238a(VirtualBackgroundInfo virtualBackgroundInfo, C62239f.AbstractC62249d dVar) {
        if (this.f156474e == null) {
            C60700b.m235861e("LabsBackgroundTab", "[onBackgroundDelete]", "data not loaded, filter background delete event");
        } else if (this.f156492k != null) {
            this.f156492k.mo215249a(virtualBackgroundInfo, dVar);
        }
    }

    /* renamed from: a */
    public void mo215392a(List<VirtualBackgroundInfo> list, PushVirtualBackgroundType pushVirtualBackgroundType) {
        C62239f fVar = this.f156473d;
        if (fVar != null) {
            fVar.mo215332a(list, pushVirtualBackgroundType);
        }
    }

    public C62277b(C62293r rVar, AbstractC62216c.AbstractC62218b.AbstractC62220b bVar, AbstractC62300w wVar) {
        super(rVar, bVar, wVar);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62214a
    /* renamed from: a */
    public void mo215239a(VirtualBackgroundInfo virtualBackgroundInfo, boolean z, boolean z2) {
        if (!z || this.f156474e != null) {
            this.f156476g = virtualBackgroundInfo;
            if (this.f156492k != null) {
                this.f156492k.mo215248a(virtualBackgroundInfo);
            }
            if (z && this.f156489h != null && virtualBackgroundInfo.needSelectedBorder()) {
                this.f156489h.mo215436b(virtualBackgroundInfo);
                return;
            }
            return;
        }
        C60700b.m235861e("LabsBackgroundTab", "[onBackgroundSelected]", "data not loaded, filter background select event");
    }
}
