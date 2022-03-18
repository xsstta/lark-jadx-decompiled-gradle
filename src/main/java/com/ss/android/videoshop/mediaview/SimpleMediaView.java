package com.ss.android.videoshop.mediaview;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.reflect.ReflectUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.videoshop.api.AbstractC64092a;
import com.ss.android.videoshop.api.AbstractC64093b;
import com.ss.android.videoshop.api.AbstractC64095d;
import com.ss.android.videoshop.api.AbstractC64097f;
import com.ss.android.videoshop.api.AbstractC64105l;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.api.stub.C64109a;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a;
import com.ss.android.videoshop.p3197d.p3198a.AbstractC64157d;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3202h.C64169a;
import com.ss.android.videoshop.p3203i.C64174c;
import com.ss.android.videoshop.p3203i.C64177f;
import com.ss.android.videoshop.widget.C64192a;
import com.ss.android.videoshop.widget.C64193b;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.net.TTVNetClient;
import java.util.List;

public class SimpleMediaView extends RelativeLayout {

    /* renamed from: A */
    private int f162180A;

    /* renamed from: B */
    private boolean f162181B;

    /* renamed from: C */
    private float f162182C;

    /* renamed from: D */
    private boolean f162183D;

    /* renamed from: E */
    private boolean f162184E;

    /* renamed from: F */
    private AbstractC64157d f162185F;

    /* renamed from: G */
    private ViewTreeObserver.OnScrollChangedListener f162186G;

    /* renamed from: a */
    public C64116b f162187a;

    /* renamed from: b */
    public VideoContext f162188b;

    /* renamed from: c */
    public AbstractC64092a f162189c;

    /* renamed from: d */
    private C64169a f162190d;

    /* renamed from: e */
    private LayerHostMediaLayout f162191e;

    /* renamed from: f */
    private boolean f162192f;

    /* renamed from: g */
    private boolean f162193g;

    /* renamed from: h */
    private boolean f162194h;

    /* renamed from: i */
    private Lifecycle f162195i;

    /* renamed from: j */
    private AbstractC64097f f162196j;

    /* renamed from: k */
    private TTVNetClient f162197k;

    /* renamed from: l */
    private AbstractC64093b f162198l;

    /* renamed from: m */
    private ViewTreeObserver f162199m;

    /* renamed from: n */
    private AbstractC64095d f162200n;

    /* renamed from: o */
    private boolean f162201o;

    /* renamed from: p */
    private boolean f162202p;

    /* renamed from: q */
    private boolean f162203q;

    /* renamed from: r */
    private AbstractC64105l f162204r;

    /* renamed from: s */
    private Rect f162205s;

    /* renamed from: t */
    private float f162206t;

    /* renamed from: u */
    private int f162207u;

    /* renamed from: v */
    private int f162208v;

    /* renamed from: w */
    private C64192a f162209w;

    /* renamed from: x */
    private C64189a f162210x;

    /* renamed from: y */
    private PlaybackParams f162211y;

    /* renamed from: z */
    private boolean f162212z;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.videoshop.mediaview.SimpleMediaView$a */
    public static class C64189a extends ViewOutlineProvider {

        /* renamed from: a */
        private float f162214a;

        private C64189a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo222460a(float f) {
            this.f162214a = f;
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min((float) ((Math.min(view.getWidth(), view.getHeight()) / 2) + 1), this.f162214a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo222396b() {
        mo222399d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo222398c() {
        mo222401e();
    }

    public AbstractC64092a getAttachListener() {
        return this.f162189c;
    }

    public AbstractC64157d getLayerEventListener() {
        return this.f162185F;
    }

    public Lifecycle getObservedLifecycle() {
        return this.f162195i;
    }

    public C64116b getPlayEntity() {
        return this.f162187a;
    }

    public AbstractC64105l getPlaySettingsReconfigHandler() {
        return this.f162204r;
    }

    public float getRadius() {
        return this.f162206t;
    }

    public AbstractC64097f getVideoPlayConfiger() {
        return this.f162196j;
    }

    /* renamed from: i */
    public boolean mo222421i() {
        return this.f162193g;
    }

    /* renamed from: a */
    public boolean mo222394a(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        this.f162205s.setEmpty();
        return view.getGlobalVisibleRect(this.f162205s);
    }

    /* renamed from: a */
    public void mo222392a(LayerHostMediaLayout layerHostMediaLayout) {
        if (layerHostMediaLayout != null) {
            mo222403g();
            m252325b((View) layerHostMediaLayout);
            boolean b = m252326b(layerHostMediaLayout);
            this.f162191e = layerHostMediaLayout;
            if (layerHostMediaLayout.f162236q != this.f162211y) {
                this.f162211y = layerHostMediaLayout.f162236q;
            }
            this.f162183D = layerHostMediaLayout.getUseActiveLayers();
            this.f162184E = layerHostMediaLayout.getDeactiveLayerWhenRelease();
            this.f162185F = layerHostMediaLayout.getLayerEventListener();
            try {
                addView(layerHostMediaLayout, new ViewGroup.LayoutParams(-1, -1));
                this.f162191e.setParentView(this);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeAgain:");
                sb.append(b);
                sb.append("\n");
                for (ViewParent parent = layerHostMediaLayout.getParent(); parent != null; parent = parent.getParent()) {
                    sb.append(parent.toString());
                    sb.append("\n");
                }
                throw new RuntimeException(sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    public void mo222393a(List<AbstractC64153a> list) {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222354a(list);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            m252324b(getContext());
            LayerHostMediaLayout layerHostMediaLayout2 = this.f162191e;
            if (layerHostMediaLayout2 != null) {
                layerHostMediaLayout2.mo222354a(list);
                return;
            }
            return;
        }
        this.f162188b.mo222024a(list);
    }

    /* renamed from: a */
    public boolean mo222395a(AbstractC64123g gVar) {
        if (gVar == null) {
            return false;
        }
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.mo222356a(gVar);
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return false;
        }
        return this.f162188b.mo222029a(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo222399d() {
        this.f162192f = true;
        m252327n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo222401e() {
        this.f162192f = false;
        m252327n();
    }

    /* renamed from: n */
    private void m252327n() {
        if (this.f162192f) {
            m252328o();
        } else {
            m252329p();
        }
    }

    /* renamed from: q */
    private void m252330q() {
        m252324b(getContext());
        m252331r();
    }

    /* renamed from: r */
    private void m252331r() {
        VideoContext videoContext = this.f162188b;
        if (videoContext != null) {
            videoContext.mo222021a(this);
        }
        m252332s();
        this.f162191e.mo222360e();
    }

    /* renamed from: t */
    private void m252333t() {
        if (this.f162188b == null) {
            this.f162188b = VideoContext.m251724a(getContext());
        }
    }

    /* renamed from: g */
    public void mo222403g() {
        if (this.f162191e != null) {
            removeAllViews();
            this.f162191e.setParentView(null);
            this.f162191e = null;
        }
    }

    /* renamed from: a */
    private void mo163648a() {
        if (this.f162199m.isAlive()) {
            this.f162199m.removeOnScrollChangedListener(this.f162186G);
        } else {
            getViewTreeObserver().removeOnScrollChangedListener(this.f162186G);
        }
    }

    public int getCurrentPosition() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getCurrentPosition();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return 0;
        }
        return this.f162188b.mo221988A();
    }

    public int getDuration() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getDuration();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return 0;
        }
        return this.f162188b.mo222083z();
    }

    public LayerHostMediaLayout getLayerHostMediaLayout() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return null;
        }
        return this.f162188b.mo222061n();
    }

    public PlaybackParams getPlayBackParams() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getPlayBackParams();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return this.f162211y;
        }
        return this.f162188b.mo222059l();
    }

    public ViewGroup.LayoutParams getTextureContainerLayoutParams() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getTextureContainerLayoutParams();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return null;
        }
        return this.f162188b.mo222001N();
    }

    public TTVideoEngine getVideoEngine() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getVideoEngine();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return null;
        }
        return this.f162188b.mo221997J();
    }

    public Bitmap getVideoFrame() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getVideoFrame();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return null;
        }
        return this.f162188b.mo221996I();
    }

    public AbstractC64108o getVideoStateInquirer() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getVideoStateInquirer();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return null;
        }
        return this.f162188b.mo221990C();
    }

    public int getWatchedDuration() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getWatchedDuration();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return 0;
        }
        return this.f162188b.mo221989B();
    }

    /* renamed from: j */
    public boolean mo222422j() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.mo222504r();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return false;
        }
        return this.f162188b.mo222080w();
    }

    /* renamed from: k */
    public void mo222423k() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222528v();
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo221991D();
        }
    }

    /* renamed from: l */
    public void mo222424l() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout == null || layerHostMediaLayout.getParent() != this) {
            VideoContext videoContext = this.f162188b;
            if (videoContext != null && videoContext.mo222027a((View) this)) {
                this.f162188b.mo222062o();
                return;
            }
            return;
        }
        this.f162191e.mo222361f();
    }

    /* renamed from: m */
    public boolean mo222425m() {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.mo222527u();
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return true;
        }
        return this.f162188b.mo222081x();
    }

    /* renamed from: o */
    private void m252328o() {
        VideoContext videoContext;
        if (this.f162193g && (videoContext = this.f162188b) != null) {
            videoContext.mo222038c(this);
        }
        C64159a.m252080a("SimpleMediaView", "attachView simplemediaview hash:" + hashCode() + " scrollVisible:" + this.f162194h);
    }

    /* renamed from: f */
    public void mo222402f() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C64116b bVar = this.f162187a;
        if (bVar != null && layoutParams != null && bVar.mo221949i() != 0 && this.f162187a.mo221950j() != 0) {
            if (layoutParams.width != this.f162187a.mo221949i() || layoutParams.height != this.f162187a.mo221950j()) {
                layoutParams.width = this.f162187a.mo221949i();
                layoutParams.height = this.f162187a.mo221950j();
                setLayoutParams(layoutParams);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C64159a.m252080a("SimpleMediaView", "onDetachedFromWindow hash:" + hashCode() + " class:" + getClass().getSimpleName());
        mo222398c();
        mo163648a();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        C64159a.m252080a("SimpleMediaView", "onFinishTemporaryDetach hash:" + hashCode() + " class:" + getClass().getSimpleName());
        mo222396b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        C64159a.m252080a("SimpleMediaView", "onStartTemporaryDetach hash:" + hashCode() + " class:" + getClass().getSimpleName());
        mo222398c();
    }

    /* renamed from: p */
    private void m252329p() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(">>>>>>> detachView called hash:");
        sb.append(hashCode());
        sb.append(" vid:");
        C64116b bVar = this.f162187a;
        if (bVar != null) {
            str = bVar.mo221934b();
        } else {
            str = "null";
        }
        sb.append(str);
        C64159a.m252080a("SimpleMediaView", sb.toString());
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && this.f162193g) {
            videoContext.mo222044d(this);
        }
        C64159a.m252080a("SimpleMediaView", "<<<<<<<< detachView end hash:" + hashCode());
    }

    /* renamed from: s */
    private void m252332s() {
        this.f162191e.setPlayEntity(this.f162187a);
        this.f162191e.mo222471a(this.f162195i);
        AbstractC64097f fVar = this.f162196j;
        if (fVar != null) {
            this.f162191e.setVideoPlayConfiger(fVar);
        }
        this.f162191e.setUseActiveLayers(this.f162183D);
        this.f162191e.setDeactiveLayerWhenRelease(this.f162184E);
        this.f162191e.setUseBlackCover(this.f162201o);
        this.f162191e.setHideHostWhenRelease(this.f162202p);
        this.f162191e.setVideoEngineFactory(this.f162200n);
        this.f162191e.setPlayUrlConstructor(this.f162198l);
        this.f162191e.setTtvNetClient(this.f162197k);
        this.f162191e.setTryToInterceptPlay(this.f162203q);
        this.f162191e.setPlayBackParams(this.f162211y);
        this.f162191e.setAsyncRelease(this.f162212z);
        this.f162191e.setVideoControllerType(this.f162180A);
        this.f162191e.setLayerEventListener(this.f162185F);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        C64159a.m252080a("SimpleMediaView", "onAttachedToWindow hash:" + hashCode() + " class:" + getClass().getSimpleName());
        if (C64177f.m252218a(this) || C64177f.m252221b(this)) {
            z = true;
        } else {
            z = false;
        }
        this.f162193g = z;
        mo222396b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.f162199m = viewTreeObserver;
        viewTreeObserver.addOnScrollChangedListener(this.f162186G);
    }

    /* renamed from: h */
    public void mo222420h() {
        String str;
        C64116b bVar = this.f162187a;
        if (bVar == null) {
            C64159a.m252084c("SimpleMediaView", "setPlayEntity first before play");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" play. PlayerEntity =  ");
        sb.append(this.f162187a);
        sb.append(" MediaLayout = ");
        sb.append(this.f162191e);
        sb.append(" videoContext = ");
        sb.append(this.f162188b);
        sb.append(" isCurrentView = ");
        VideoContext videoContext = this.f162188b;
        if (videoContext != null) {
            str = String.valueOf(videoContext.mo222027a((View) this));
        } else {
            str = "false";
        }
        sb.append(str);
        C64159a.m252077a(bVar, sb.toString());
        if (this.f162191e != null) {
            mo222402f();
            m252331r();
            return;
        }
        VideoContext videoContext2 = this.f162188b;
        if (videoContext2 == null || !videoContext2.mo222027a((View) this)) {
            m252330q();
            return;
        }
        LayerHostMediaLayout n = this.f162188b.mo222061n();
        if (n != null) {
            n.setPlayEntity(this.f162187a);
            this.f162188b.mo222074q();
        }
    }

    public void setAttachListener(AbstractC64092a aVar) {
        this.f162189c = aVar;
    }

    public SimpleMediaView(Context context) {
        this(context, null);
    }

    public void setPlayEntity(C64116b bVar) {
        mo222391a(bVar, false);
    }

    public void setPortrait(boolean z) {
        VideoContext videoContext = this.f162188b;
        if (videoContext != null) {
            videoContext.mo222048f(z);
        }
    }

    public void setTextureLayout(int i) {
        mo222389a(i, (C64193b) null);
    }

    public void setDeactiveLayerWhenRelease(boolean z) {
        this.f162184E = z;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setDeactiveLayerWhenRelease(z);
        }
    }

    public void setLayerEventListener(AbstractC64157d dVar) {
        this.f162185F = dVar;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setLayerEventListener(dVar);
        }
    }

    public void setPlayUrlConstructor(AbstractC64093b bVar) {
        this.f162198l = bVar;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setPlayUrlConstructor(bVar);
        }
    }

    public void setTtvNetClient(TTVNetClient tTVNetClient) {
        this.f162197k = tTVNetClient;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setTtvNetClient(tTVNetClient);
        }
    }

    public void setUseActiveLayers(boolean z) {
        this.f162183D = z;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setUseActiveLayers(z);
        }
    }

    public void setVideoPlayConfiger(AbstractC64097f fVar) {
        this.f162196j = fVar;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setVideoPlayConfiger(fVar);
        }
    }

    /* renamed from: b */
    public void mo222397b(long j) {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222352a(j);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222011a(j);
        }
    }

    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21 || this.f162206t <= BitmapDescriptorFactory.HUE_RED) {
            super.draw(canvas);
            return;
        }
        this.f162209w.mo222576a(canvas);
        super.draw(canvas);
        canvas.restore();
    }

    public void setAsyncRelease(boolean z) {
        this.f162212z = z;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setAsyncRelease(z);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222047e(z);
        }
    }

    public void setHideHostWhenRelease(boolean z) {
        this.f162202p = z;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setHideHostWhenRelease(z);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222056j(z);
        }
    }

    public void setLoop(boolean z) {
        this.f162190d.mo222305b(z);
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setLoop(z);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222045d(z);
        }
    }

    public void setMute(boolean z) {
        this.f162190d.mo222303a(z);
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setMute(z);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222039c(z);
        }
    }

    public void setPlayBackParams(PlaybackParams playbackParams) {
        this.f162211y = playbackParams;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setPlayBackParams(playbackParams);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222022a(playbackParams);
        }
    }

    public void setPlaySettingsReconfigHandler(AbstractC64105l lVar) {
        this.f162204r = lVar;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setPlaySettingsReconfigHandler(lVar);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222018a(lVar);
        }
    }

    public void setReleaseEngineEnabled(boolean z) {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setReleaseEngineEnabled(z);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222053h(z);
        }
    }

    public void setRenderMode(int i) {
        this.f162190d.mo222304b(i);
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setRenderMode(i);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222043d(i);
        }
    }

    public void setStartTime(int i) {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setStartTime(i);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222032b(i);
        }
    }

    public void setTextureContainerLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setTextureContainerLayoutParams(layoutParams);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222013a(layoutParams);
        }
    }

    public void setTryToInterceptPlay(boolean z) {
        this.f162203q = z;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setTryToInterceptPlay(z);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222050g(z);
        }
    }

    public void setUseBlackCover(boolean z) {
        this.f162201o = z;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setUseBlackCover(z);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222054i(z);
        }
    }

    public void setVideoControllerType(int i) {
        this.f162180A = i;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setVideoControllerType(i);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222008a(i);
        }
    }

    public void setVideoEngine(TTVideoEngine tTVideoEngine) {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setVideoEngine(tTVideoEngine);
        } else if (this.f162188b.mo222027a((View) this)) {
            this.f162188b.mo222023a(tTVideoEngine);
        }
    }

    public void setVideoEngineFactory(AbstractC64095d dVar) {
        this.f162200n = dVar;
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setVideoEngineFactory(dVar);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222016a(dVar);
        }
    }

    /* renamed from: b */
    private void m252324b(Context context) {
        if (context != null) {
            if (this.f162191e == null) {
                LayerHostMediaLayout layerHostMediaLayout = new LayerHostMediaLayout(context);
                this.f162191e = layerHostMediaLayout;
                addView(layerHostMediaLayout, new ViewGroup.LayoutParams(-1, -1));
                this.f162191e.setUseActiveLayers(this.f162183D);
                this.f162191e.setDeactiveLayerWhenRelease(this.f162184E);
                this.f162191e.setParentView(this);
                this.f162191e.mo222471a(this.f162195i);
                this.f162191e.setPlaySettingsReconfigHandler(this.f162204r);
            }
            mo222402f();
        }
    }

    public void setRadius(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED && this.f162206t != f) {
            this.f162206t = f;
            if (Build.VERSION.SDK_INT < 21) {
                this.f162209w.mo222574a(f);
            } else {
                if (!getClipToOutline()) {
                    setOutlineProvider(this.f162210x);
                    setClipToOutline(true);
                }
                this.f162210x.mo222460a(f);
            }
            invalidate();
        }
    }

    /* renamed from: b */
    private static void m252325b(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent).removeView(view);
                } catch (Exception e) {
                    if (Build.VERSION.SDK_INT < 21) {
                        StringBuilder sb = new StringBuilder();
                        while (parent != null) {
                            sb.append(parent.toString());
                            sb.append("\n");
                            parent = parent.getParent();
                        }
                        throw new RuntimeException(sb.toString(), e);
                    }
                }
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        C64159a.m252083b("SimpleMediaView", "setLayoutParams:" + layoutParams.width + "*" + layoutParams.height);
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && !videoContext.mo222049f() && layoutParams.width > UIUtils.getScreenWidth(getContext())) {
            C64159a.m252082a("SimpleMediaView", Thread.currentThread().getStackTrace());
        }
    }

    /* renamed from: b */
    private boolean m252326b(LayerHostMediaLayout layerHostMediaLayout) {
        try {
            ViewParent parent = layerHostMediaLayout.getParent();
            if (!(parent instanceof ViewGroup) || Build.VERSION.SDK_INT >= 21) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (!m252323a(viewGroup, layerHostMediaLayout)) {
                return false;
            }
            viewGroup.endViewTransition(layerHostMediaLayout);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public AbstractC64153a mo222388a(int i) {
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.mo222350a(i);
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext == null || !videoContext.mo222027a((View) this)) {
            return null;
        }
        return this.f162188b.mo222037c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo222390a(Context context) {
        Activity a = C64174c.m252210a(context);
        long id = Looper.getMainLooper().getThread().getId();
        long id2 = Thread.currentThread().getId();
        if (a != null && !this.f162181B && id == id2) {
            if (a instanceof LifecycleOwner) {
                this.f162195i = ((LifecycleOwner) a).getLifecycle();
            }
            m252333t();
            if (Build.VERSION.SDK_INT >= 21) {
                this.f162210x = new C64189a();
            } else {
                this.f162209w = new C64192a();
                setWillNotDraw(false);
            }
            setRadius(this.f162182C);
            this.f162181B = true;
        }
    }

    public SimpleMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m252322a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.radius});
            this.f162182C = obtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this) {
            this.f162194h = mo222394a(this);
            C64159a.m252080a("SimpleMediaView", "onVisibilityChanged:" + this.f162194h);
        }
    }

    /* renamed from: a */
    private boolean m252323a(ViewGroup viewGroup, View view) {
        Object invokeMethod = ReflectUtils.invokeMethod(ViewGroup.class, "isViewTransitioning", new Class[]{View.class}, new Object[]{view}, viewGroup);
        if (invokeMethod instanceof Boolean) {
            return ((Boolean) invokeMethod).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public void mo222389a(int i, C64193b bVar) {
        this.f162190d.mo222301a(i);
        LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222470a(i, bVar);
            return;
        }
        VideoContext videoContext = this.f162188b;
        if (videoContext != null && videoContext.mo222027a((View) this)) {
            this.f162188b.mo222009a(i, bVar);
        }
    }

    /* renamed from: a */
    public void mo222391a(C64116b bVar, boolean z) {
        String str;
        LayerHostMediaLayout n;
        this.f162187a = bVar;
        if (bVar != null) {
            this.f162190d = bVar.mo221960t();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setPlayEntity this.hash:");
        sb.append(hashCode());
        sb.append(" vid:");
        if (bVar != null) {
            str = bVar.mo221934b();
        } else {
            str = "null";
        }
        sb.append(str);
        C64159a.m252083b("SimpleMediaView", sb.toString());
        if (z) {
            LayerHostMediaLayout layerHostMediaLayout = this.f162191e;
            if (layerHostMediaLayout != null) {
                layerHostMediaLayout.setPlayEntity(bVar);
                return;
            }
            VideoContext videoContext = this.f162188b;
            if (videoContext != null && videoContext.mo222027a((View) this) && (n = this.f162188b.mo222061n()) != null) {
                n.setPlayEntity(bVar);
            }
        }
    }

    public SimpleMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f162190d = C64169a.m252178a();
        this.f162189c = new C64109a();
        this.f162201o = true;
        this.f162202p = true;
        this.f162205s = new Rect();
        this.f162182C = BitmapDescriptorFactory.HUE_RED;
        this.f162183D = false;
        this.f162184E = false;
        this.f162186G = new ViewTreeObserver.OnScrollChangedListener() {
            /* class com.ss.android.videoshop.mediaview.SimpleMediaView.ViewTreeObserver$OnScrollChangedListenerC641881 */

            public void onScrollChanged() {
                SimpleMediaView simpleMediaView = SimpleMediaView.this;
                boolean a = simpleMediaView.mo222394a(simpleMediaView);
                VideoContext videoContext = SimpleMediaView.this.f162188b;
                if (videoContext != null && videoContext.mo222051g() && SimpleMediaView.this.f162189c != null && videoContext.mo222027a((View) SimpleMediaView.this) && videoContext.mo222041c(SimpleMediaView.this.f162187a)) {
                    SimpleMediaView.this.f162189c.mo163739a(SimpleMediaView.this, a);
                    C64159a.m252080a("SimpleMediaView", "onScrollVisibilityChange simpleMediaView hash:" + SimpleMediaView.this.hashCode() + " nowVisible:" + a);
                }
            }
        };
        m252322a(context, attributeSet);
        mo222390a(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (Build.VERSION.SDK_INT < 21 && this.f162206t > BitmapDescriptorFactory.HUE_RED) {
            this.f162209w.mo222575a(width, height);
        }
        if (this.f162207u != width || this.f162208v != height) {
            this.f162207u = width;
            this.f162208v = height;
            C64159a.m252083b("SimpleMediaView", "smv_size_layout:" + width + "*" + height);
        }
    }
}
