package com.ss.android.videoshop.mediaview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.videoshop.api.AbstractC64093b;
import com.ss.android.videoshop.api.AbstractC64095d;
import com.ss.android.videoshop.api.AbstractC64097f;
import com.ss.android.videoshop.api.AbstractC64098g;
import com.ss.android.videoshop.api.AbstractC64099h;
import com.ss.android.videoshop.api.AbstractC64105l;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d;
import com.ss.android.videoshop.controller.C64151f;
import com.ss.android.videoshop.p3194a.AbstractC64090d;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3202h.C64169a;
import com.ss.android.videoshop.p3203i.C64172a;
import com.ss.android.videoshop.p3203i.C64173b;
import com.ss.android.videoshop.p3203i.C64174c;
import com.ss.android.videoshop.widget.C64193b;
import com.ss.android.videoshop.widget.TextureVideoView;
import com.ss.android.videoshop.widget.compat.RelativeLayoutCompat;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineInfos;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.model.VideoRef;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VideoPatchLayout extends RelativeLayoutCompat implements TextureView.SurfaceTextureListener, AbstractC64098g, AbstractC64099h {

    /* renamed from: a */
    private C64151f f162220a;

    /* renamed from: b */
    private List<AbstractC64099h> f162221b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private Lifecycle f162222c;

    /* renamed from: d */
    protected TextureVideoView f162223d;

    /* renamed from: e */
    protected View f162224e;

    /* renamed from: f */
    protected TextureContainerLayout f162225f;

    /* renamed from: g */
    protected C64116b f162226g;

    /* renamed from: h */
    protected C64169a f162227h = C64169a.m252178a();

    /* renamed from: i */
    protected AbstractC64105l f162228i;

    /* renamed from: j */
    protected VideoContext f162229j;

    /* renamed from: k */
    protected AbstractView$OnLayoutChangeListenerC64144d f162230k;

    /* renamed from: l */
    protected C64172a f162231l;

    /* renamed from: m */
    protected boolean f162232m;

    /* renamed from: n */
    protected AbstractC64097f f162233n;

    /* renamed from: o */
    protected AbstractC64095d f162234o;

    /* renamed from: p */
    protected boolean f162235p = true;

    /* renamed from: q */
    protected PlaybackParams f162236q;

    /* renamed from: r */
    private TTVNetClient f162237r;

    /* renamed from: s */
    private AbstractC64093b f162238s;

    /* renamed from: t */
    private boolean f162239t = true;

    /* renamed from: u */
    private boolean f162240u;

    /* renamed from: v */
    private long f162241v;

    /* renamed from: w */
    private boolean f162242w = true;

    /* renamed from: x */
    private Runnable f162243x = new Runnable() {
        /* class com.ss.android.videoshop.mediaview.VideoPatchLayout.RunnableC641901 */

        public void run() {
            C64159a.m252077a(VideoPatchLayout.this.f162226g, "VideoPatchLayout execPlayAction");
            VideoPatchLayout.this.f162230k.mo222148a(VideoPatchLayout.this.getSurface());
            VideoPatchLayout.this.mo222497o();
        }
    };

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221887a(boolean z, int i) {
    }

    /* renamed from: a */
    public void mo222355a(boolean z, boolean z2) {
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public boolean mo221888a(AbstractC64108o oVar, C64116b bVar, AbstractC64090d dVar) {
        return false;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public boolean mo221889a(AbstractC64108o oVar, C64116b bVar, boolean z, int i, boolean z2) {
        return false;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: a */
    public boolean mo221876a(VideoRef videoRef) {
        return false;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public Lifecycle getObservedLifecycle() {
        return this.f162222c;
    }

    public C64116b getPlayEntity() {
        return this.f162226g;
    }

    public C64169a getPlaySettings() {
        return this.f162227h;
    }

    public TextureContainerLayout getTextureContainer() {
        return this.f162225f;
    }

    public AbstractC64097f getVideoPlayConfiger() {
        return this.f162233n;
    }

    public long getVideoStopTimeStamp() {
        return this.f162241v;
    }

    /* renamed from: a */
    public void mo222472a(Resolution resolution, boolean z) {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222155a(resolution, z);
        }
    }

    /* renamed from: a */
    public void mo222473a(Runnable runnable) {
        if (runnable != null) {
            Surface surface = getSurface();
            if (surface == null || !surface.isValid()) {
                this.f162231l.mo222325a(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163963a(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163963a(oVar, bVar, i, i2);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221880a(AbstractC64108o oVar, C64116b bVar, int i) {
        this.f162229j.mo222010a(hashCode(), true);
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221880a(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221893b(AbstractC64108o oVar, C64116b bVar, boolean z) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221893b(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163965a(AbstractC64108o oVar, C64116b bVar, Error error) {
        this.f162229j.mo222010a(hashCode(), false);
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163965a(oVar, bVar, error);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221883a(AbstractC64108o oVar, C64116b bVar, Resolution resolution, boolean z) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221883a(oVar, bVar, resolution, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221885a(AbstractC64108o oVar, C64116b bVar, String str, boolean z, boolean z2) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221885a(oVar, bVar, str, z, z2);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221881a(AbstractC64108o oVar, C64116b bVar, VideoContext videoContext, boolean z, int i, boolean z2, boolean z3) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221881a(oVar, bVar, videoContext, z, i, z2, z3);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163964a(AbstractC64108o oVar, C64116b bVar, long j) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163964a(oVar, bVar, j);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163966a(AbstractC64108o oVar, C64116b bVar, boolean z) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163966a(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221882a(AbstractC64108o oVar, C64116b bVar, Resolution resolution, int i) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221882a(oVar, bVar, resolution, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221884a(AbstractC64108o oVar, C64116b bVar, VideoEngineInfos videoEngineInfos) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221884a(oVar, bVar, videoEngineInfos);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163967a(AbstractC64108o oVar, C64116b bVar, boolean z, int i, boolean z2, boolean z3) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163967a(oVar, bVar, z, i, z2, z3);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: a */
    public boolean mo221875a(NetworkUtils.NetworkType networkType) {
        AbstractC64097f fVar = this.f162233n;
        if (fVar != null) {
            return fVar.mo221875a(networkType);
        }
        return false;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221886a(VideoInfo videoInfo) {
        if (videoInfo != null) {
            int valueInt = videoInfo.getValueInt(1);
            int valueInt2 = videoInfo.getValueInt(2);
            C64159a.m252083b("VideoPatchLayout", "onUpdateVideoSize width:" + valueInt + " height:" + valueInt2);
            this.f162225f.mo222462a(valueInt, valueInt2);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64098g
    /* renamed from: a */
    public void mo221879a(VideoInfo videoInfo, AbstractC64108o oVar, VideoModel videoModel, C64116b bVar) {
        AbstractC64097f fVar = this.f162233n;
        if (fVar instanceof AbstractC64098g) {
            ((AbstractC64098g) fVar).mo221879a(videoInfo, oVar, videoModel, bVar);
        }
    }

    public int getTextureLayout() {
        return this.f162225f.getTextureLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo222529w() {
        return this.f162231l.mo222327c();
    }

    public int getCurrentPosition() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null) {
            return 0;
        }
        return dVar.mo222178n();
    }

    public int getDuration() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null) {
            return 0;
        }
        return dVar.mo222177m();
    }

    public PlaybackParams getPlayBackParams() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            return dVar.mo222182r();
        }
        return this.f162236q;
    }

    public Surface getSurface() {
        TextureVideoView textureVideoView = this.f162223d;
        if (textureVideoView != null) {
            return textureVideoView.getSurface();
        }
        return null;
    }

    public ViewGroup.LayoutParams getTextureContainerLayoutParams() {
        TextureContainerLayout textureContainerLayout = this.f162225f;
        if (textureContainerLayout != null) {
            return textureContainerLayout.getLayoutParams();
        }
        return null;
    }

    public RectF getTextureRealRectF() {
        TextureVideoView textureVideoView = this.f162223d;
        if (textureVideoView != null) {
            return textureVideoView.getRealViewRectF();
        }
        return null;
    }

    public float getTextureScaleX() {
        TextureVideoView textureVideoView = this.f162223d;
        if (textureVideoView != null) {
            return textureVideoView.getScaleX();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getTextureScaleY() {
        TextureVideoView textureVideoView = this.f162223d;
        if (textureVideoView != null) {
            return textureVideoView.getScaleY();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public int getTextureViewHeight() {
        TextureVideoView textureVideoView = this.f162223d;
        if (textureVideoView != null) {
            return textureVideoView.getHeight();
        }
        return 0;
    }

    public int getTextureViewWidth() {
        TextureVideoView textureVideoView = this.f162223d;
        if (textureVideoView != null) {
            return textureVideoView.getWidth();
        }
        return 0;
    }

    public TTVideoEngine getVideoEngine() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            return dVar.mo222183s();
        }
        return null;
    }

    public Bitmap getVideoFrame() {
        TextureVideoView textureVideoView = this.f162223d;
        if (textureVideoView != null) {
            return textureVideoView.getBitmap();
        }
        return null;
    }

    public AbstractC64108o getVideoStateInquirer() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            return dVar.mo222184t();
        }
        return null;
    }

    public int getWatchedDuration() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null) {
            return 0;
        }
        return dVar.mo222179o();
    }

    /* renamed from: q */
    public boolean mo222503q() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null || !dVar.mo222170f()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public boolean mo222504r() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null || !dVar.mo222172h()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public boolean mo222505s() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null || !dVar.mo222171g()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo222526t() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null || !dVar.mo222174j()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public boolean mo222527u() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null || dVar.mo222175k()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean mo222249a() {
        Activity a = C64174c.m252210a(getContext());
        if (a == null || !a.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo222360e() {
        if (this.f162226g == null) {
            C64159a.m252084c("VideoPatchLayout", "playEntity can't be null when play");
            return;
        }
        this.f162235p = true;
        mo222495m();
        mo222496n();
    }

    /* renamed from: p */
    public boolean mo222502p() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if ((dVar == null || !dVar.mo222168e()) && !this.f162235p) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo222361f() {
        C64159a.m252079a("release");
        C64116b playEntity = getPlayEntity();
        C64159a.m252077a(playEntity, getClass().getSimpleName() + " release");
        this.f162235p = false;
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222163c();
        }
        this.f162231l.mo222326b();
    }

    /* renamed from: o */
    public void mo222497o() {
        boolean z;
        C64116b bVar = this.f162226g;
        StringBuilder sb = new StringBuilder();
        sb.append("VideoPatchLayout doPlay: sync = ");
        if (this.f162220a.mo222200b() == 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" shouldPlay = ");
        sb.append(this.f162235p);
        C64159a.m252077a(bVar, sb.toString());
        this.f162230k.mo222143a();
        if (!this.f162235p) {
            mo222528v();
        }
    }

    /* renamed from: v */
    public void mo222528v() {
        C64159a.m252077a(getPlayEntity(), "VideoPatchLayout pause");
        C64159a.m252079a("pause");
        C64159a.m252083b("VideoPatchLayout", "pause");
        this.f162235p = false;
        this.f162231l.mo222326b();
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222160b();
        }
    }

    /* renamed from: b */
    private void mo222357b() {
        AbstractC64095d dVar = this.f162234o;
        if (dVar != null) {
            this.f162230k.mo222150a(dVar);
        }
        TTVNetClient tTVNetClient = this.f162237r;
        if (tTVNetClient != null) {
            this.f162230k.mo222157a(tTVNetClient);
        }
        this.f162230k.mo222169f(this.f162240u);
        this.f162230k.mo222162b(this.f162227h.mo222315j());
        this.f162230k.mo222152a((AbstractC64099h) this);
        this.f162230k.mo222161b(this.f162227h.mo222309d());
        this.f162230k.mo222153a(this.f162226g);
        this.f162230k.mo222154a(this.f162236q);
        this.f162230k.mo222151a((AbstractC64097f) this);
        this.f162230k.mo222149a(this.f162238s);
        this.f162230k.mo222164c(this.f162232m);
        this.f162230k.mo222167e(this.f162227h.mo222316k());
        TextureVideoView textureVideoView = this.f162223d;
        if (textureVideoView != null) {
            textureVideoView.addOnLayoutChangeListener(this.f162230k);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo222496n() {
        if (!mo222249a()) {
            C64169a aVar = this.f162227h;
            if (aVar != null) {
                this.f162223d.setReuseSurfaceTexture(aVar.mo222306b());
                setMute(this.f162227h.mo222314i());
                this.f162242w = this.f162227h.mo222321p();
            }
            mo222357b();
            C64116b bVar = this.f162226g;
            C64159a.m252077a(bVar, getClass().getSimpleName() + "  playInternal, isMusic:" + this.f162226g.mo221966z());
            if (this.f162226g.mo221966z()) {
                UIUtils.setViewVisibility(this.f162223d, 8);
                mo222497o();
                return;
            }
            UIUtils.setViewVisibility(this.f162223d, 0);
            if (!this.f162242w) {
                mo222497o();
            } else {
                mo222473a(this.f162243x);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo222495m() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar == null) {
            this.f162230k = m252361a(this.f162229j);
        } else {
            C64116b d = dVar.mo222165d();
            if (d != null && !d.equals(this.f162226g)) {
                C64116b bVar = this.f162226g;
                C64159a.m252077a(bVar, getClass().getSimpleName() + " releaseLastVideo curEntityid = " + d.mo221934b() + " newPlayEntityId = " + this.f162226g.mo221934b());
                this.f162230k.mo222163c();
            }
        }
        AbstractView$OnLayoutChangeListenerC64144d a = this.f162229j.mo222007a(this.f162226g);
        TextureVideoView b = this.f162229j.mo222030b(this.f162226g);
        if (a != null && b != null) {
            this.f162230k = a;
            if (this.f162226g != null) {
                C64159a.m252083b("VideoPatchLayout", "1 retrieve prepared controller vid:" + this.f162226g.mo221934b() + " title:" + this.f162226g.mo221952l());
            }
            this.f162230k.mo222153a(this.f162226g);
            this.f162225f.mo222464a(b);
            TextureVideoView textureVideoView = this.f162225f.getTextureVideoView();
            this.f162223d = textureVideoView;
            textureVideoView.setSurfaceTextureListener(this);
            m252364b(this.f162230k.mo222185u());
        }
    }

    public void setPlayNeedSurfaceValid(boolean z) {
        this.f162242w = z;
    }

    public void setPlaySettingsReconfigHandler(AbstractC64105l lVar) {
        this.f162228i = lVar;
    }

    /* renamed from: a */
    private AbstractView$OnLayoutChangeListenerC64144d m252361a(VideoContext videoContext) {
        return this.f162220a.mo222198a(videoContext);
    }

    public void setStartTime(int i) {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222145a(i);
        }
    }

    public void setTextureContainerLayoutParams(ViewGroup.LayoutParams layoutParams) {
        TextureContainerLayout textureContainerLayout = this.f162225f;
        if (textureContainerLayout != null) {
            textureContainerLayout.setLayoutParams(layoutParams);
        }
    }

    public void setTextureLayout(int i) {
        mo222470a(i, (C64193b) null);
    }

    public void setVideoControllerType(int i) {
        this.f162220a.mo222199a(i);
    }

    public void setAsyncRelease(boolean z) {
        this.f162232m = z;
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222164c(z);
        }
    }

    public void setLoop(boolean z) {
        this.f162227h.mo222305b(z);
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222162b(z);
        }
    }

    public void setPlayBackParams(PlaybackParams playbackParams) {
        this.f162236q = playbackParams;
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222154a(playbackParams);
        }
    }

    public void setPlayEntity(C64116b bVar) {
        this.f162226g = bVar;
        if (bVar != null) {
            this.f162227h = bVar.mo221960t();
        }
        this.f162235p = false;
    }

    public void setPlayUrlConstructor(AbstractC64093b bVar) {
        this.f162238s = bVar;
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222149a(bVar);
        }
    }

    public void setRenderMode(int i) {
        this.f162227h.mo222304b(i);
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222161b(i);
        }
    }

    public void setTryToInterceptPlay(boolean z) {
        this.f162240u = z;
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222169f(z);
        }
    }

    public void setTtvNetClient(TTVNetClient tTVNetClient) {
        this.f162237r = tTVNetClient;
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222157a(tTVNetClient);
        }
    }

    public void setUseBlackCover(boolean z) {
        this.f162239t = z;
        if (!z) {
            UIUtils.setViewVisibility(this.f162224e, 8);
        }
    }

    public void setVideoEngineFactory(AbstractC64095d dVar) {
        this.f162234o = dVar;
        AbstractView$OnLayoutChangeListenerC64144d dVar2 = this.f162230k;
        if (dVar2 != null && dVar != null) {
            dVar2.mo222150a(dVar);
        }
    }

    public void setVideoPlayConfiger(AbstractC64097f fVar) {
        this.f162233n = fVar;
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222151a((AbstractC64097f) this);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: b */
    public VideoInfo mo221877b(VideoRef videoRef) {
        VideoInfo videoInfo;
        AbstractC64097f fVar = this.f162233n;
        if (fVar != null) {
            videoInfo = fVar.mo221877b(videoRef);
        } else {
            videoInfo = C64173b.m252209a(videoRef, Resolution.Standard.ordinal() - 1);
        }
        m252364b(videoInfo);
        return videoInfo;
    }

    public void setReleaseEngineEnabled(boolean z) {
        if (this.f162230k == null) {
            this.f162230k = m252361a(this.f162229j);
        }
        this.f162230k.mo222166d(z);
    }

    public void setVideoEngine(TTVideoEngine tTVideoEngine) {
        if (this.f162230k == null) {
            this.f162230k = m252361a(this.f162229j);
        }
        this.f162230k.mo222156a(tTVideoEngine);
    }

    public VideoPatchLayout(Context context) {
        super(context);
        mo222353a(context);
    }

    /* renamed from: b */
    private void m252364b(VideoInfo videoInfo) {
        if (videoInfo != null && videoInfo.getResolution() != Resolution.Auto) {
            int valueInt = videoInfo.getValueInt(1);
            int valueInt2 = videoInfo.getValueInt(2);
            C64159a.m252083b("VideoPatchLayout", "selectVideoInfoToPlay width:" + valueInt + " height:" + valueInt2);
            this.f162225f.mo222462a(valueInt, valueInt2);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: a */
    public VideoInfo mo221874a(VideoModel videoModel) {
        VideoRef videoRef;
        VideoInfo videoInfo;
        if (videoModel != null) {
            videoRef = videoModel.getVideoRef();
        } else {
            videoRef = null;
        }
        AbstractC64097f fVar = this.f162233n;
        if (fVar != null) {
            videoInfo = fVar.mo221874a(videoModel);
        } else {
            videoInfo = C64173b.m252209a(videoRef, Resolution.Standard.ordinal() - 1);
        }
        m252364b(videoInfo);
        return videoInfo;
    }

    public void setMute(boolean z) {
        this.f162227h.mo222303a(z);
        if (!z) {
            boolean z2 = true;
            if ((this.f162229j.mo221999L() && this.f162229j.mo222082y()) || (this.f162229j.mo222000M() && this.f162229j.mo221993F())) {
                z2 = false;
            }
            if (z2) {
                this.f162229j.mo222003P();
            }
        } else if (this.f162229j.mo221998K()) {
            this.f162229j.mo222004Q();
        }
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222159a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo222353a(Context context) {
        this.f162231l = new C64172a();
        this.f162229j = VideoContext.m251724a(context);
        this.f162220a = new C64151f();
        TextureContainerLayout textureContainerLayout = new TextureContainerLayout(context);
        this.f162225f = textureContainerLayout;
        TextureVideoView textureVideoView = textureContainerLayout.getTextureVideoView();
        this.f162223d = textureVideoView;
        textureVideoView.setSurfaceTextureListener(this);
        this.f162224e = this.f162225f.getBlackCoverView();
        addView(this.f162225f, new RelativeLayout.LayoutParams(-1, -1));
        Activity a = C64174c.m252210a(context);
        if (a instanceof LifecycleOwner) {
            this.f162222c = ((LifecycleOwner) a).getLifecycle();
        }
    }

    /* renamed from: a */
    public void mo222471a(Lifecycle lifecycle) {
        if (lifecycle != null) {
            this.f162222c = lifecycle;
        }
    }

    /* renamed from: a */
    public void mo222469a(float f, float f2) {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162230k;
        if (dVar != null) {
            dVar.mo222144a(f, f2);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo163971c(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163971c(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: d */
    public void mo163972d(AbstractC64108o oVar, C64116b bVar) {
        UIUtils.setViewVisibility(this.f162224e, 8);
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163972d(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo163975g(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163975g(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: i */
    public void mo163977i(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163977i(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: j */
    public void mo163978j(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163978j(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: l */
    public void mo221900l(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221900l(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: n */
    public void mo221902n(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221902n(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo163973e(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163973e(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: h */
    public void mo163976h(AbstractC64108o oVar, C64116b bVar) {
        this.f162229j.mo222010a(hashCode(), false);
        this.f162236q = null;
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163976h(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: k */
    public void mo163979k(AbstractC64108o oVar, C64116b bVar) {
        if (this.f162239t) {
            UIUtils.setViewVisibility(this.f162224e, 0);
        }
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163979k(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: m */
    public void mo221901m(AbstractC64108o oVar, C64116b bVar) {
        if (this.f162239t) {
            UIUtils.setViewVisibility(this.f162224e, 0);
        }
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221901m(oVar, bVar);
        }
    }

    public VideoPatchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo222353a(context);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo163974f(AbstractC64108o oVar, C64116b bVar) {
        this.f162229j.mo222010a(hashCode(), false);
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163974f(oVar, bVar);
        }
    }

    /* renamed from: a */
    public void mo222470a(int i, C64193b bVar) {
        C64169a aVar = this.f162227h;
        if (aVar != null) {
            aVar.mo222301a(i);
        }
        this.f162225f.mo222463a(i, bVar);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo163970b(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163970b(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163962a(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163962a(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo221898f(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221898f(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64098g
    /* renamed from: a */
    public VideoInfo mo221878a(AbstractC64108o oVar, VideoModel videoModel, C64116b bVar) {
        AbstractC64097f fVar = this.f162233n;
        if (!(fVar instanceof AbstractC64098g)) {
            return null;
        }
        VideoInfo a = ((AbstractC64098g) fVar).mo221878a(oVar, videoModel, bVar);
        m252364b(a);
        return a;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo221894c(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221894c(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: d */
    public void mo221896d(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221896d(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo221899g(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221899g(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo221895c(AbstractC64108o oVar, C64116b bVar, boolean z) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo163966a(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo221897e(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221897e(oVar, bVar, i);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f162230k != null) {
            if (this.f162226g != null) {
                C64159a.m252083b("VideoPatchLayout", "onSurfaceTextureAvailable setSurface vid:" + this.f162226g.mo221934b() + " title:" + this.f162226g.mo221952l() + "hash:" + this.f162230k.hashCode());
            }
            this.f162230k.mo222148a(getSurface());
        }
        this.f162231l.mo222324a();
    }

    public VideoPatchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo222353a(context);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221890b(AbstractC64108o oVar, C64116b bVar, int i) {
        if (i == 0 || i == 2) {
            this.f162241v = System.currentTimeMillis();
        }
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221890b(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221892b(AbstractC64108o oVar, C64116b bVar, long j) {
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221892b(oVar, bVar, j);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221891b(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        if (this.f162223d.getVideoWidth() * this.f162223d.getVideoHeight() == 0) {
            this.f162223d.mo222531a(i, i2);
        }
        for (AbstractC64099h hVar : this.f162221b) {
            hVar.mo221891b(oVar, bVar, i, i2);
        }
    }
}
