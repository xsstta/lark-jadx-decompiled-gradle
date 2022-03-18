package com.ss.android.videoshop.mediaview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.videoshop.api.AbstractC64104k;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.api.stub.C64110b;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.p3194a.AbstractC64090d;
import com.ss.android.videoshop.p3194a.C64088b;
import com.ss.android.videoshop.p3194a.C64089c;
import com.ss.android.videoshop.p3194a.C64091e;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3196c.C64117a;
import com.ss.android.videoshop.p3196c.C64118b;
import com.ss.android.videoshop.p3196c.C64119c;
import com.ss.android.videoshop.p3196c.C64120d;
import com.ss.android.videoshop.p3196c.C64121e;
import com.ss.android.videoshop.p3196c.C64122f;
import com.ss.android.videoshop.p3196c.C64124h;
import com.ss.android.videoshop.p3196c.C64126j;
import com.ss.android.videoshop.p3196c.C64127k;
import com.ss.android.videoshop.p3196c.C64128l;
import com.ss.android.videoshop.p3196c.C64129m;
import com.ss.android.videoshop.p3196c.C64130n;
import com.ss.android.videoshop.p3197d.AbstractC64152a;
import com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a;
import com.ss.android.videoshop.p3197d.p3198a.AbstractC64157d;
import com.ss.android.videoshop.p3197d.p3198a.C64154b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3203i.C64173b;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.VideoEngineInfos;
import com.ss.ttvideoengine.model.VideoRef;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.List;

public class LayerHostMediaLayout extends VideoPatchLayout implements C64154b.AbstractC64155a {

    /* renamed from: a */
    public C64154b f162170a;

    /* renamed from: b */
    public RelativeLayout f162171b;

    /* renamed from: c */
    public List<VideoPatchLayout> f162172c;

    /* renamed from: r */
    private RelativeLayout f162173r;

    /* renamed from: s */
    private C64127k f162174s = new C64127k();

    /* renamed from: t */
    private SimpleMediaView f162175t;

    /* renamed from: u */
    private boolean f162176u = true;

    /* renamed from: v */
    private AbstractC64104k f162177v;

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221881a(AbstractC64108o oVar, C64116b bVar, VideoContext videoContext, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.C64154b.AbstractC64155a
    /* renamed from: a */
    public boolean mo222249a() {
        return false;
    }

    /* renamed from: c */
    public void mo222358c() {
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.C64154b.AbstractC64155a
    public ViewGroup getLayerForePlayContainer() {
        return this.f162173r;
    }

    public C64154b getLayerHost() {
        return this.f162170a;
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.C64154b.AbstractC64155a
    public ViewGroup getLayerMainContainer() {
        return this.f162171b;
    }

    public RelativeLayout getLayerRoot() {
        return this.f162171b;
    }

    public ViewGroup getLayerRootContainer() {
        return this.f162171b;
    }

    public List<VideoPatchLayout> getVideoPatchLayouts() {
        return this.f162172c;
    }

    /* renamed from: a */
    public boolean mo222356a(AbstractC64123g gVar) {
        if (gVar != null) {
            return this.f162170a.mo222236a(gVar);
        }
        return false;
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163963a(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        super.mo163963a(oVar, this.f162226g, i, i2);
        this.f162174s.mo221973b((long) i2);
        this.f162174s.mo221972a((long) i);
        this.f162170a.mo222236a(this.f162174s);
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163963a(oVar, bVar, i, i2);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221880a(AbstractC64108o oVar, C64116b bVar, int i) {
        super.mo221880a(oVar, bVar, i);
        this.f162170a.mo222236a(new C64119c(104, Integer.valueOf(i)));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221880a(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163965a(AbstractC64108o oVar, C64116b bVar, Error error) {
        super.mo163965a(oVar, bVar, error);
        this.f162170a.mo222236a(new C64119c(SmEvents.EVENT_RE, error));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163965a(oVar, bVar, error);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221883a(AbstractC64108o oVar, C64116b bVar, Resolution resolution, boolean z) {
        this.f162170a.mo222236a(new C64121e(201, resolution, z));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221883a(oVar, bVar, resolution, z);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221885a(AbstractC64108o oVar, C64116b bVar, String str, boolean z, boolean z2) {
        this.f162170a.mo222236a(new C64120d(str, z, z2));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221885a(oVar, bVar, str, z, z2);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163967a(AbstractC64108o oVar, C64116b bVar, boolean z, int i, boolean z2, boolean z3) {
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163967a(oVar, bVar, z, i, z2, z3);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163964a(AbstractC64108o oVar, C64116b bVar, long j) {
        super.mo163964a(oVar, bVar, j);
        this.f162170a.mo222236a(new C64119c(207, Long.valueOf(j)));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163964a(oVar, bVar, j);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163966a(AbstractC64108o oVar, C64116b bVar, boolean z) {
        C64128l lVar = new C64128l();
        lVar.mo221975a((long) oVar.mo221910b());
        lVar.mo221976a(z);
        lVar.mo221977b((long) oVar.mo221909a());
        this.f162170a.mo222236a(lVar);
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163966a(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221882a(AbstractC64108o oVar, C64116b bVar, Resolution resolution, int i) {
        super.mo221882a(oVar, bVar, resolution, i);
        this.f162170a.mo222236a(new C64117a(resolution, i));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221882a(oVar, bVar, resolution, i);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout
    /* renamed from: a */
    public void mo222355a(boolean z, boolean z2) {
        super.mo222355a(z, z2);
        this.f162170a.mo222236a(new C64122f(z, z2));
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: a */
    public boolean mo221876a(VideoRef videoRef) {
        return this.f162170a.mo222236a(new C64130n(videoRef)) || super.mo221876a(videoRef);
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: a */
    public boolean mo221875a(NetworkUtils.NetworkType networkType) {
        return this.f162170a.mo222236a(new C64124h(networkType)) || super.mo221875a(networkType);
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221884a(AbstractC64108o oVar, C64116b bVar, VideoEngineInfos videoEngineInfos) {
        super.mo221884a(oVar, bVar, videoEngineInfos);
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221884a(oVar, bVar, videoEngineInfos);
        }
    }

    /* renamed from: x */
    private void m252262x() {
        if (this.f162228i != null) {
            this.f162228i.mo221907a(getPlaySettingsExecutor());
        }
    }

    /* renamed from: b */
    public boolean mo222357b() {
        if (this.f162229j == null || !this.f162229j.mo222049f()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo222359d() {
        this.f162170a.mo222236a(new C64119c(304));
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout
    /* renamed from: f */
    public void mo222361f() {
        if (!mo222529w()) {
            m252263y();
        }
        super.mo222361f();
    }

    /* renamed from: g */
    public void mo222362g() {
        if (this.f162229j != null) {
            this.f162229j.mo222042d();
        }
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.C64154b.AbstractC64155a
    public C64116b getBindPlayEntity() {
        SimpleMediaView simpleMediaView = this.f162175t;
        if (simpleMediaView != null) {
            return simpleMediaView.getPlayEntity();
        }
        return null;
    }

    public boolean getDeactiveLayerWhenRelease() {
        C64154b bVar = this.f162170a;
        if (bVar == null || !bVar.mo222246j()) {
            return false;
        }
        return true;
    }

    public AbstractC64157d getLayerEventListener() {
        C64154b bVar = this.f162170a;
        if (bVar != null) {
            return bVar.mo222247k();
        }
        return null;
    }

    public AbstractC64104k getPlaySettingsExecutor() {
        if (this.f162177v == null) {
            this.f162177v = new C64110b(this);
        }
        return this.f162177v;
    }

    public boolean getUseActiveLayers() {
        C64154b bVar = this.f162170a;
        if (bVar == null || !bVar.mo222245i()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo222373h() {
        if (this.f162229j != null) {
            this.f162229j.mo222046e();
        }
    }

    /* renamed from: l */
    public boolean mo222377l() {
        return this.f162170a.mo222236a(new C64119c(307));
    }

    private PlaybackParams getPlaybackParams() {
        PlaybackParams playbackParams;
        AbstractC64108o videoStateInquirer = getVideoStateInquirer();
        if (videoStateInquirer != null) {
            playbackParams = videoStateInquirer.mo221919k();
        } else {
            playbackParams = null;
        }
        if (playbackParams == null) {
            return new PlaybackParams();
        }
        return playbackParams;
    }

    /* renamed from: y */
    private void m252263y() {
        if (this.f162176u) {
            UIUtils.setViewVisibility(this.f162171b, 8);
            UIUtils.setViewVisibility(this.f162225f, 8);
            UIUtils.setViewVisibility(this.f162173r, 0);
        }
    }

    public SimpleMediaView getParentView() {
        SimpleMediaView simpleMediaView = this.f162175t;
        if (simpleMediaView != null && simpleMediaView == getParent()) {
            return this.f162175t;
        }
        if (getParent() instanceof SimpleMediaView) {
            this.f162175t = (SimpleMediaView) getParent();
        }
        return this.f162175t;
    }

    public VideoPatchLayout getPlayingVideoPatch() {
        List<VideoPatchLayout> list = this.f162172c;
        if (list == null) {
            return null;
        }
        for (VideoPatchLayout videoPatchLayout : list) {
            if (videoPatchLayout.mo222503q()) {
                return videoPatchLayout;
            }
        }
        return null;
    }

    /* renamed from: k */
    public void mo222376k() {
        List<VideoPatchLayout> list = this.f162172c;
        if (list != null) {
            for (VideoPatchLayout videoPatchLayout : list) {
                videoPatchLayout.mo222361f();
            }
        }
    }

    /* renamed from: i */
    public boolean mo222374i() {
        List<VideoPatchLayout> list = this.f162172c;
        if (list != null) {
            boolean z = false;
            for (VideoPatchLayout videoPatchLayout : list) {
                if (z || videoPatchLayout.mo222503q()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo222375j() {
        List<VideoPatchLayout> list = this.f162172c;
        if (list != null) {
            for (VideoPatchLayout videoPatchLayout : list) {
                if (videoPatchLayout.mo222503q()) {
                    C64159a.m252083b("LayerHostMediaLayout", "pause video patch pause");
                    videoPatchLayout.mo222528v();
                }
            }
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout
    /* renamed from: e */
    public void mo222360e() {
        if (this.f162226g == null) {
            C64159a.m252084c("LayerHostMediaLayout", "playEntity can't be null when play");
            return;
        }
        this.f162235p = true;
        if (!this.f162229j.mo222041c(this.f162226g)) {
            this.f162229j.mo222062o();
        }
        mo222495m();
        m252262x();
        if (!this.f162230k.mo222176l()) {
            setTextureLayout(this.f162227h.mo222307c());
        }
        setRenderMode(this.f162227h.mo222309d());
        this.f162229j.mo222034b(this);
        this.f162229j.mo222048f(this.f162226g.mo221961u());
        this.f162229j.mo222036b(this.f162226g.mo221963w());
        this.f162229j.mo222019a(this.f162226g.mo221960t());
        this.f162229j.mo222052h();
        UIUtils.setViewVisibility(this.f162171b, 0);
        UIUtils.setViewVisibility(this.f162225f, 0);
        mo222496n();
        UIUtils.setViewVisibility(this.f162171b, 0);
        UIUtils.setViewVisibility(this.f162225f, 0);
    }

    public void setHideHostWhenRelease(boolean z) {
        this.f162176u = z;
    }

    public void setParentView(SimpleMediaView simpleMediaView) {
        this.f162175t = simpleMediaView;
    }

    /* renamed from: a */
    public void mo222354a(List<AbstractC64153a> list) {
        this.f162170a.mo222234a(list);
    }

    public void setDeactiveLayerWhenRelease(boolean z) {
        C64154b bVar = this.f162170a;
        if (bVar != null) {
            bVar.mo222238b(z);
        }
    }

    public void setKeepPosition(boolean z) {
        this.f162227h.mo222308c(z);
    }

    public void setLayerEventListener(AbstractC64157d dVar) {
        C64154b bVar = this.f162170a;
        if (bVar != null) {
            bVar.mo222232a(dVar);
        }
    }

    public void setUseActiveLayers(boolean z) {
        C64154b bVar = this.f162170a;
        if (bVar != null) {
            bVar.mo222235a(z);
        }
    }

    public LayerHostMediaLayout(Context context) {
        super(context);
    }

    public void setLayerRootOnTouchListener(View.OnTouchListener onTouchListener) {
        RelativeLayout relativeLayout = this.f162171b;
        if (relativeLayout != null && onTouchListener != null) {
            relativeLayout.setOnTouchListener(onTouchListener);
        }
    }

    /* renamed from: a */
    public AbstractC64153a mo222350a(int i) {
        AbstractC64152a a = this.f162170a.mo222229a(i);
        if (a instanceof AbstractC64153a) {
            return (AbstractC64153a) a;
        }
        return null;
    }

    /* renamed from: a */
    public List<VideoPatchLayout> mo222351a(View view) {
        ArrayList arrayList = new ArrayList();
        m252261a(view, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public void mo222352a(long j) {
        if (j >= 0 && this.f162230k != null) {
            this.f162230k.mo222147a(j);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout
    /* renamed from: a */
    public void mo222353a(Context context) {
        super.mo222353a(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f162171b = relativeLayout;
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        this.f162173r = relativeLayout2;
        addView(relativeLayout2, new RelativeLayout.LayoutParams(-1, -1));
        C64154b bVar = new C64154b();
        this.f162170a = bVar;
        bVar.mo222231a(this);
        this.f162171b.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.videoshop.mediaview.LayerHostMediaLayout.View$OnTouchListenerC641861 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (LayerHostMediaLayout.this.f162230k != null && LayerHostMediaLayout.this.f162230k.mo222174j()) {
                    return LayerHostMediaLayout.this.mo222357b();
                }
                if (!LayerHostMediaLayout.this.f162170a.mo222236a(new C64129m(motionEvent))) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        LayerHostMediaLayout.this.mo222358c();
                        if (!LayerHostMediaLayout.this.mo222357b()) {
                            LayerHostMediaLayout.this.mo222359d();
                        }
                    } else if (action == 1) {
                        LayerHostMediaLayout.this.mo222359d();
                    }
                }
                return LayerHostMediaLayout.this.mo222357b();
            }
        });
        UIUtils.setViewVisibility(this.f162171b, 8);
        UIUtils.setViewVisibility(this.f162225f, 8);
        this.f162171b.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() {
            /* class com.ss.android.videoshop.mediaview.LayerHostMediaLayout.ViewGroup$OnHierarchyChangeListenerC641872 */

            public void onChildViewAdded(View view, View view2) {
                if (view == LayerHostMediaLayout.this.f162171b) {
                    if (LayerHostMediaLayout.this.f162172c == null) {
                        LayerHostMediaLayout.this.f162172c = new ArrayList();
                    }
                    for (VideoPatchLayout videoPatchLayout : LayerHostMediaLayout.this.mo222351a(view2)) {
                        if (!LayerHostMediaLayout.this.f162172c.contains(videoPatchLayout)) {
                            LayerHostMediaLayout.this.f162172c.add(videoPatchLayout);
                        }
                    }
                }
            }

            public void onChildViewRemoved(View view, View view2) {
                if (view == LayerHostMediaLayout.this.f162171b) {
                    if (LayerHostMediaLayout.this.f162172c == null) {
                        LayerHostMediaLayout.this.f162172c = new ArrayList();
                    }
                    for (VideoPatchLayout videoPatchLayout : LayerHostMediaLayout.this.mo222351a(view2)) {
                        LayerHostMediaLayout.this.f162172c.remove(videoPatchLayout);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.C64154b.AbstractC64155a
    /* renamed from: a */
    public void mo222248a(AbstractC64090d dVar) {
        boolean z;
        String str;
        if (dVar != null) {
            boolean z2 = false;
            if (this.f162229j == null || !this.f162229j.mo222041c(this.f162226g)) {
                z = false;
            } else {
                z = this.f162229j.mo221888a(getVideoStateInquirer(), this.f162226g, dVar);
            }
            if (!z) {
                int a = dVar.mo221858a();
                if (a == 209) {
                    mo222352a(((Long) dVar.mo221859b()).longValue());
                } else if (a == 208) {
                    C64159a.m252083b("LayerHostMediaLayout", "pause VIDEO_HOST_CMD_PAUSE");
                    if (this.f162230k != null) {
                        this.f162230k.mo222160b();
                    }
                } else if (a == 207 || a == 214) {
                    SimpleMediaView parentView = getParentView();
                    if (parentView != null) {
                        parentView.mo222420h();
                    } else if (this.f162229j != null) {
                        this.f162229j.mo222074q();
                    }
                } else if (a == 103 || a == 102) {
                    mo222362g();
                } else if (a == 104) {
                    mo222373h();
                } else if (a == 213) {
                    int intValue = ((Integer) dVar.mo221859b()).intValue();
                    if (intValue >= 0) {
                        float f = (float) intValue;
                        mo222469a(f, f);
                    }
                } else if (a == 211) {
                    Object b = dVar.mo221859b();
                    Resolution resolution = null;
                    if (b instanceof String) {
                        str = (String) b;
                    } else {
                        str = null;
                    }
                    if (dVar instanceof C64091e) {
                        C64091e eVar = (C64091e) dVar;
                        z2 = eVar.mo221866c();
                        resolution = eVar.mo221867d();
                    }
                    if (resolution != null) {
                        mo222472a(resolution, z2);
                    } else if (!TextUtils.isEmpty(str)) {
                        mo222472a(C64173b.m252208a(str), z2);
                    }
                } else if (a == 217) {
                    try {
                        Object b2 = dVar.mo221859b();
                        if (b2 != null) {
                            float floatValue = ((Float) b2).floatValue();
                            PlaybackParams playbackParams = getPlaybackParams();
                            playbackParams.setSpeed(floatValue);
                            this.f162170a.mo222236a(new C64119c(209, Float.valueOf(floatValue)));
                            setPlayBackParams(playbackParams);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (a == 216) {
                    Object b3 = dVar.mo221859b();
                    if (b3 instanceof PlaybackParams) {
                        setPlayBackParams((PlaybackParams) b3);
                    }
                } else if (a == 218) {
                    if (dVar.mo221859b() instanceof Boolean) {
                        setMute(((Boolean) dVar.mo221859b()).booleanValue());
                    }
                } else if (a == 219) {
                    if (dVar instanceof C64089c) {
                        C64089c cVar = (C64089c) dVar;
                        m252260a(cVar.mo221864c(), cVar.mo221865d());
                    }
                } else if (a == 220) {
                    if (dVar.mo221859b() instanceof Boolean) {
                        setLoop(((Boolean) dVar.mo221859b()).booleanValue());
                    }
                } else if (a == 221) {
                    if (dVar.mo221859b() instanceof Boolean) {
                        boolean booleanValue = ((Boolean) dVar.mo221859b()).booleanValue();
                        if (this.f162229j != null) {
                            this.f162229j.mo222010a(hashCode(), booleanValue);
                        }
                    }
                } else if (a == 222 && (dVar instanceof C64088b)) {
                    C64088b bVar = (C64088b) dVar;
                    if (!TextUtils.isEmpty(bVar.mo221860c()) && this.f162230k != null) {
                        this.f162230k.mo222158a(bVar.mo221860c(), bVar.mo221861d(), bVar.mo221862e(), bVar.mo221863f());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m252260a(int i, Object obj) {
        if (this.f162230k != null) {
            this.f162230k.mo222146a(i, obj);
        }
    }

    public LayerHostMediaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo163970b(AbstractC64108o oVar, C64116b bVar) {
        this.f162170a.mo222236a(new C64119c(SmEvents.EVENT_NT));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163970b(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo163971c(AbstractC64108o oVar, C64116b bVar) {
        this.f162170a.mo222236a(new C64119c(LocationRequest.PRIORITY_NO_POWER));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163971c(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo163973e(AbstractC64108o oVar, C64116b bVar) {
        this.f162170a.mo222236a(new C64119c(106));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163973e(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: h */
    public void mo163976h(AbstractC64108o oVar, C64116b bVar) {
        m252263y();
        super.mo163976h(oVar, bVar);
        this.f162170a.mo222236a(new C64126j(bVar));
        if (this.f162229j != null) {
            this.f162229j.mo163976h(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: i */
    public void mo163977i(AbstractC64108o oVar, C64116b bVar) {
        this.f162170a.mo222236a(new C64119c(ActivityIdentificationData.WALKING));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163977i(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: j */
    public void mo163978j(AbstractC64108o oVar, C64116b bVar) {
        this.f162170a.mo222236a(new C64119c(SmEvents.EVENT_NR));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163978j(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: l */
    public void mo221900l(AbstractC64108o oVar, C64116b bVar) {
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221900l(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: m */
    public void mo221901m(AbstractC64108o oVar, C64116b bVar) {
        super.mo221901m(oVar, bVar);
        this.f162170a.mo222236a(new C64119c(101));
        if (this.f162229j != null) {
            this.f162229j.mo221901m(oVar, bVar);
            this.f162229j.mo222020a(this);
        }
    }

    /* renamed from: a */
    private void m252261a(View view, List<VideoPatchLayout> list) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof VideoPatchLayout) {
                        if (!list.contains(childAt)) {
                            list.add((VideoPatchLayout) childAt);
                        }
                    } else if (childAt instanceof ViewGroup) {
                        m252261a(childAt, list);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: d */
    public void mo163972d(AbstractC64108o oVar, C64116b bVar) {
        super.mo163972d(oVar, bVar);
        this.f162170a.mo222236a(new C64119c(SmEvents.EVENT_NE_RR));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163972d(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo163974f(AbstractC64108o oVar, C64116b bVar) {
        super.mo163974f(oVar, bVar);
        this.f162170a.mo222236a(new C64119c(102));
        if (this.f162227h.mo222315j()) {
            this.f162170a.mo222236a(new C64119c(SmEvents.EVENT_TO));
        }
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163974f(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo163975g(AbstractC64108o oVar, C64116b bVar) {
        super.mo163975g(oVar, bVar);
        this.f162170a.mo222236a(new C64119c(202));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163975g(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: k */
    public void mo163979k(AbstractC64108o oVar, C64116b bVar) {
        super.mo163979k(oVar, bVar);
        this.f162170a.mo222236a(new C64119c(100));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163979k(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: n */
    public void mo221902n(AbstractC64108o oVar, C64116b bVar) {
        super.mo221902n(oVar, bVar);
        this.f162170a.mo222236a(new C64119c(SmEvents.EVENT_HBRESET));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221902n(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163962a(AbstractC64108o oVar, C64116b bVar) {
        this.f162170a.mo222236a(new C64119c(SmEvents.EVENT_NO));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo163962a(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo221899g(AbstractC64108o oVar, C64116b bVar, int i) {
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221899g(oVar, bVar, i);
        }
    }

    public LayerHostMediaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221890b(AbstractC64108o oVar, C64116b bVar, int i) {
        super.mo221890b(oVar, bVar, i);
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221890b(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo221894c(AbstractC64108o oVar, C64116b bVar, int i) {
        super.mo221894c(oVar, bVar, i);
        if (i == 3) {
            this.f162170a.mo222236a(new C64119c(SmEvents.EVENT_RS));
        }
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221894c(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo221897e(AbstractC64108o oVar, C64116b bVar, int i) {
        this.f162170a.mo222236a(new C64118b(i));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221897e(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo221895c(AbstractC64108o oVar, C64116b bVar, boolean z) {
        super.mo221895c(oVar, bVar, z);
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221895c(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: d */
    public void mo221896d(AbstractC64108o oVar, C64116b bVar, int i) {
        this.f162170a.mo222236a(new C64119c(SmActions.ACTION_INIT_ENTRY, Integer.valueOf(i)));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221896d(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo221898f(AbstractC64108o oVar, C64116b bVar, int i) {
        this.f162170a.mo222236a(new C64119c(117, Integer.valueOf(i)));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221898f(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221892b(AbstractC64108o oVar, C64116b bVar, long j) {
        super.mo221892b(oVar, bVar, j);
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221892b(oVar, bVar, j);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221893b(AbstractC64108o oVar, C64116b bVar, boolean z) {
        super.mo221893b(oVar, bVar, z);
        this.f162170a.mo222236a(new C64119c(118));
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221893b(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.mediaview.VideoPatchLayout, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221891b(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        super.mo221891b(oVar, this.f162226g, i, i2);
        if (this.f162229j != null && this.f162229j.mo222041c(bVar)) {
            this.f162229j.mo221891b(oVar, bVar, i, i2);
        }
    }
}
