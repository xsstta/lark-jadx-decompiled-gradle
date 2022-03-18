package com.ss.android.videoshop.context;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.videoshop.api.AbstractC64092a;
import com.ss.android.videoshop.api.AbstractC64095d;
import com.ss.android.videoshop.api.AbstractC64096e;
import com.ss.android.videoshop.api.AbstractC64099h;
import com.ss.android.videoshop.api.AbstractC64102j;
import com.ss.android.videoshop.api.AbstractC64105l;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.api.C64107n;
import com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d;
import com.ss.android.videoshop.controller.EngineInspector;
import com.ss.android.videoshop.fullscreen.C64162a;
import com.ss.android.videoshop.kits.autopause.C64179a;
import com.ss.android.videoshop.kits.autopause.C64182c;
import com.ss.android.videoshop.kits.autopause.VideoScreenStateController;
import com.ss.android.videoshop.mediaview.LayerHostMediaLayout;
import com.ss.android.videoshop.mediaview.SimpleMediaView;
import com.ss.android.videoshop.mediaview.VideoPatchLayout;
import com.ss.android.videoshop.p3194a.AbstractC64090d;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3196c.C64119c;
import com.ss.android.videoshop.p3196c.C64125i;
import com.ss.android.videoshop.p3196c.C64131o;
import com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3202h.C64169a;
import com.ss.android.videoshop.p3203i.C64174c;
import com.ss.android.videoshop.p3203i.C64177f;
import com.ss.android.videoshop.widget.C64193b;
import com.ss.android.videoshop.widget.TextureVideoView;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineInfos;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import me.ele.lancet.base.annotations.Skip;

public class VideoContext extends AbstractC64099h.C64100a implements KeyEvent.Callback, LifecycleObserver, WeakHandler.IHandler, AbstractC64096e {

    /* renamed from: m */
    public static boolean f161933m;

    /* renamed from: n */
    public static final Map<Resolution, String> f161934n = new HashMap();

    /* renamed from: A */
    private C64138a f161935A;

    /* renamed from: B */
    private Set<Integer> f161936B;

    /* renamed from: C */
    private final KeyEvent.DispatcherState f161937C;

    /* renamed from: a */
    public C64162a f161938a;

    /* renamed from: b */
    public LayerHostMediaLayout f161939b;

    /* renamed from: c */
    public SimpleMediaView f161940c;

    /* renamed from: d */
    public Map<Lifecycle, LifeCycleObserver> f161941d;

    /* renamed from: e */
    public C64182c f161942e;

    /* renamed from: f */
    public VideoScreenStateController f161943f;

    /* renamed from: g */
    public int f161944g;

    /* renamed from: h */
    public int f161945h;

    /* renamed from: i */
    public int f161946i;

    /* renamed from: j */
    public int f161947j;

    /* renamed from: k */
    public int[] f161948k;

    /* renamed from: l */
    public TreeSet<Integer> f161949l;

    /* renamed from: o */
    private Context f161950o;

    /* renamed from: p */
    private FrameLayout f161951p;

    /* renamed from: q */
    private ViewGroup f161952q;

    /* renamed from: r */
    private HelperView f161953r;

    /* renamed from: s */
    private List<LayerHostMediaLayout> f161954s;

    /* renamed from: t */
    private List<AbstractC64099h> f161955t;

    /* renamed from: u */
    private WeakHandler f161956u;

    /* renamed from: v */
    private ValueAnimator f161957v;

    /* renamed from: w */
    private C64169a f161958w;

    /* renamed from: x */
    private long f161959x;

    /* renamed from: y */
    private Window$CallbackC64140b f161960y;

    /* renamed from: z */
    private Window.Callback f161961z;

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221881a(AbstractC64108o oVar, C64116b bVar, VideoContext videoContext, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163967a(AbstractC64108o oVar, C64116b bVar, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public boolean mo221889a(AbstractC64108o oVar, C64116b bVar, boolean z, int i, boolean z2) {
        return false;
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: O */
    public C64182c mo222002O() {
        return this.f161942e;
    }

    /* renamed from: a */
    public Context mo222006a() {
        return this.f161950o;
    }

    /* renamed from: n */
    public LayerHostMediaLayout mo222061n() {
        return this.f161939b;
    }

    /* renamed from: a */
    public void mo222017a(AbstractC64099h hVar) {
        if (hVar != null && !this.f161955t.contains(hVar)) {
            this.f161955t.add(hVar);
        }
    }

    /* renamed from: a */
    public void mo222025a(boolean z) {
        if (!mo222040c()) {
            this.f161938a.mo222277a(z);
        }
    }

    /* renamed from: b */
    public void mo222036b(boolean z) {
        this.f161938a.mo222280b(z);
    }

    /* renamed from: a */
    public void mo222022a(PlaybackParams playbackParams) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setPlayBackParams(playbackParams);
        }
    }

    /* renamed from: a */
    public void mo222020a(LayerHostMediaLayout layerHostMediaLayout) {
        if (layerHostMediaLayout != null) {
            this.f161954s.remove(layerHostMediaLayout);
        }
    }

    /* renamed from: b */
    public void mo222034b(LayerHostMediaLayout layerHostMediaLayout) {
        this.f161939b = layerHostMediaLayout;
        this.f161954s.remove(layerHostMediaLayout);
        if (layerHostMediaLayout != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("setLayerHostMediaLayout parent hash:");
            sb.append(layerHostMediaLayout.getParent() != null ? layerHostMediaLayout.getParent().hashCode() : -1);
            sb.append(" entity vid:");
            sb.append(layerHostMediaLayout.getPlayEntity() != null ? layerHostMediaLayout.getPlayEntity().mo221934b() : null);
            C64159a.m252080a("VideoContext", sb.toString());
        }
        if (this.f161940c == null && layerHostMediaLayout != null) {
            this.f161940c = layerHostMediaLayout.getParentView();
            C64159a.m252083b("VideoContext", "setLayerHostMediaLayout set simpleMediaView:" + this.f161940c);
        }
    }

    /* renamed from: a */
    public void mo222021a(SimpleMediaView simpleMediaView) {
        this.f161940c = simpleMediaView;
        StringBuilder sb = new StringBuilder();
        sb.append("setSimpleMediaView hash:");
        sb.append(simpleMediaView != null ? Integer.valueOf(simpleMediaView.hashCode()) : null);
        C64159a.m252080a("VideoContext", sb.toString());
    }

    /* renamed from: b */
    public void mo222035b(SimpleMediaView simpleMediaView) {
        LayerHostMediaLayout layerHostMediaLayout;
        if (!(simpleMediaView == null || this.f161940c == simpleMediaView || (layerHostMediaLayout = this.f161939b) == null)) {
            ViewParent parent = layerHostMediaLayout.getParent();
            if (parent instanceof SimpleMediaView) {
                ((SimpleMediaView) parent).mo222403g();
                simpleMediaView.mo222392a(this.f161939b);
                C64159a.m252080a("VideoContext", "updateSimpleMediaView change simplemediaview");
                if (!mo222081x()) {
                    UIUtils.setViewVisibility(simpleMediaView, 0);
                }
            }
        }
        this.f161940c = simpleMediaView;
        StringBuilder sb = new StringBuilder();
        sb.append("updateSimpleMediaView hash:");
        sb.append(simpleMediaView != null ? Integer.valueOf(simpleMediaView.hashCode()) : null);
        C64159a.m252080a("VideoContext", sb.toString());
    }

    /* renamed from: a */
    public boolean mo222027a(View view) {
        return view != null && this.f161940c == view;
    }

    /* renamed from: a */
    public void mo222019a(C64169a aVar) {
        this.f161958w = aVar;
        this.f161938a.mo222276a(aVar);
    }

    /* renamed from: a */
    public boolean mo222029a(AbstractC64123g gVar) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null || layerHostMediaLayout.mo222527u()) {
            return false;
        }
        return this.f161939b.mo222356a(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo222028a(Lifecycle lifecycle, AbstractC64123g gVar) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null || layerHostMediaLayout.mo222527u() || this.f161939b.getObservedLifecycle() != lifecycle) {
            return false;
        }
        return this.f161939b.mo222356a(gVar);
    }

    /* renamed from: a */
    public void mo222016a(AbstractC64095d dVar) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setVideoEngineFactory(dVar);
        }
    }

    /* renamed from: a */
    public void mo222023a(TTVideoEngine tTVideoEngine) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setVideoEngine(tTVideoEngine);
        }
    }

    /* renamed from: a */
    public void mo222018a(AbstractC64105l lVar) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setPlaySettingsReconfigHandler(lVar);
        }
    }

    /* renamed from: a */
    public void mo222024a(List<AbstractC64153a> list) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222354a(list);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public boolean mo221888a(AbstractC64108o oVar, C64116b bVar, AbstractC64090d dVar) {
        Iterator<AbstractC64099h> it = this.f161955t.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                AbstractC64099h next = it.next();
                if (z || next.mo221888a(oVar, bVar, dVar)) {
                    z = true;
                }
            }
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64096e
    /* renamed from: a */
    public void mo221871a(boolean z, int i, boolean z2, boolean z3) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            for (AbstractC64099h hVar : this.f161955t) {
                hVar.mo221881a(layerHostMediaLayout.getVideoStateInquirer(), layerHostMediaLayout.getPlayEntity(), this, z, i, z2, z3);
            }
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64096e
    /* renamed from: b */
    public void mo221873b(boolean z, int i, boolean z2, boolean z3) {
        SimpleMediaView simpleMediaView;
        if (this.f161939b != null) {
            C64116b m = mo222060m();
            C64159a.m252077a(m, getClass().getSimpleName() + " onFullScreen " + z + " gravity: " + z2);
            StringBuilder sb = new StringBuilder();
            sb.append("onFullScreen ");
            sb.append(z);
            sb.append(" gravity:");
            sb.append(z2);
            C64159a.m252083b("VideoContext", sb.toString());
            int H = mo221995H();
            if (z) {
                ViewParent parent = this.f161939b.getParent();
                if ((parent instanceof SimpleMediaView) && ((simpleMediaView = this.f161940c) == null || parent != simpleMediaView)) {
                    this.f161940c = (SimpleMediaView) parent;
                    C64116b m2 = mo222060m();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getClass().getSimpleName());
                    sb2.append(" onFullScreen SimpleMediaView hash: ");
                    SimpleMediaView simpleMediaView2 = this.f161940c;
                    Object obj = "null simpleMediaView";
                    sb2.append(simpleMediaView2 != null ? Integer.valueOf(simpleMediaView2.hashCode()) : obj);
                    C64159a.m252077a(m2, sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onFullScreen SimpleMediaView hash:");
                    SimpleMediaView simpleMediaView3 = this.f161940c;
                    if (simpleMediaView3 != null) {
                        obj = Integer.valueOf(simpleMediaView3.hashCode());
                    }
                    sb3.append(obj);
                    C64159a.m252083b("VideoContext", sb3.toString());
                }
                m251725b(this.f161950o);
                m251720T();
                m251722V();
                if (!mo221994G() || H <= 0 || i != 1) {
                    SimpleMediaView simpleMediaView4 = this.f161940c;
                    if (simpleMediaView4 != null) {
                        simpleMediaView4.mo222403g();
                        m251719S();
                    }
                    C64116b m3 = mo222060m();
                    C64159a.m252077a(m3, getClass().getSimpleName() + " detachFromParent fullscreen: true");
                    C64159a.m252083b("VideoContext", "detachFromParent fullscreen: true");
                    m251726b((View) this.f161939b);
                    this.f161951p.addView(this.f161939b, new ViewGroup.LayoutParams(-1, -1));
                    C64159a.m252083b("VideoContext", "fullScreenRoot addView:" + this.f161951p);
                    C64116b m4 = mo222060m();
                    C64159a.m252077a(m4, getClass().getSimpleName() + " fullScreenRoot addView: " + this.f161951p);
                } else {
                    this.f161947j = this.f161939b.getWidth();
                    this.f161946i = this.f161939b.getHeight();
                    this.f161939b.getLocationOnScreen(this.f161948k);
                    C64159a.m252083b("VideoContext", "onFullScreen startBounds:" + this.f161948k);
                    C64116b m5 = mo222060m();
                    C64159a.m252077a(m5, getClass().getSimpleName() + " onFullScreen " + z + " gravity: " + z2);
                    SimpleMediaView simpleMediaView5 = this.f161940c;
                    if (simpleMediaView5 != null) {
                        simpleMediaView5.mo222403g();
                        m251719S();
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f161947j, this.f161946i);
                    marginLayoutParams.topMargin = this.f161948k[1];
                    this.f161951p.addView(this.f161939b, marginLayoutParams);
                    m251721U();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    this.f161957v = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.ss.android.videoshop.context.VideoContext.C641321 */

                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LayerHostMediaLayout layerHostMediaLayout = VideoContext.this.f161939b;
                            if (layerHostMediaLayout != null) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layerHostMediaLayout.getLayoutParams();
                                float f = 1.0f - floatValue;
                                marginLayoutParams.leftMargin = (int) (((float) VideoContext.this.f161948k[0]) * f);
                                marginLayoutParams.topMargin = (int) (f * ((float) VideoContext.this.f161948k[1]));
                                marginLayoutParams.width = (int) (((float) VideoContext.this.f161947j) + (((float) (VideoContext.this.f161944g - VideoContext.this.f161947j)) * floatValue));
                                marginLayoutParams.height = (int) (((float) VideoContext.this.f161946i) + (floatValue * ((float) (VideoContext.this.f161945h - VideoContext.this.f161946i))));
                                layerHostMediaLayout.setLayoutParams(marginLayoutParams);
                                C64116b m = VideoContext.this.mo222060m();
                                C64159a.m252077a(m, getClass().getSimpleName() + " onFullScreen onAnimationUpdate: " + marginLayoutParams);
                                StringBuilder sb = new StringBuilder();
                                sb.append("onFullScreen onAnimationUpdate:");
                                sb.append(marginLayoutParams);
                                C64159a.m252083b("VideoContext", sb.toString());
                            }
                        }
                    });
                    this.f161957v.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.videoshop.context.VideoContext.C641332 */

                        public void onAnimationEnd(Animator animator) {
                            ViewGroup.MarginLayoutParams marginLayoutParams;
                            LayerHostMediaLayout layerHostMediaLayout = VideoContext.this.f161939b;
                            if (!(layerHostMediaLayout == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layerHostMediaLayout.getLayoutParams()) == null)) {
                                marginLayoutParams.width = -1;
                                marginLayoutParams.height = -1;
                                marginLayoutParams.topMargin = 0;
                                marginLayoutParams.leftMargin = 0;
                                layerHostMediaLayout.setLayoutParams(marginLayoutParams);
                            }
                            VideoContext.this.f161938a.mo222271a(2);
                            C64116b m = VideoContext.this.mo222060m();
                            C64159a.m252077a(m, getClass().getSimpleName() + " onFullScreen onAnimationEnd");
                            C64159a.m252083b("VideoContext", "onFullScreen onAnimationEnd:");
                        }
                    });
                    this.f161957v.setDuration((long) H);
                    TimeInterpolator g = this.f161958w.mo222312g();
                    if (g != null) {
                        this.f161957v.setInterpolator(g);
                    }
                    this.f161957v.start();
                }
            } else {
                m251723W();
                m251721U();
                if (!this.f161938a.mo222291l() || H <= 0 || !this.f161938a.mo222290k()) {
                    C64116b m6 = mo222060m();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(getClass().getSimpleName());
                    sb4.append(" detachFromParent fullscreen: false, parent: ");
                    LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
                    Object obj2 = "null";
                    sb4.append(layerHostMediaLayout != null ? layerHostMediaLayout.getParent() : obj2);
                    C64159a.m252077a(m6, sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("detachFromParent fullscreen: false, parent:");
                    LayerHostMediaLayout layerHostMediaLayout2 = this.f161939b;
                    if (layerHostMediaLayout2 != null) {
                        obj2 = layerHostMediaLayout2.getParent();
                    }
                    sb5.append(obj2);
                    C64159a.m252083b("VideoContext", sb5.toString());
                    m251726b((View) this.f161939b);
                    SimpleMediaView simpleMediaView6 = this.f161940c;
                    if (simpleMediaView6 != null) {
                        simpleMediaView6.mo222392a(this.f161939b);
                        C64116b m7 = mo222060m();
                        C64159a.m252077a(m7, getClass().getSimpleName() + " simpleMediaView attachLayerHostLayout");
                        C64159a.m252083b("VideoContext", "simpleMediaView attachLayerHostLayout");
                    }
                    this.f161938a.mo222271a(0);
                } else {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    this.f161957v = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.ss.android.videoshop.context.VideoContext.C641343 */

                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LayerHostMediaLayout layerHostMediaLayout = VideoContext.this.f161939b;
                            if (layerHostMediaLayout != null) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layerHostMediaLayout.getLayoutParams();
                                marginLayoutParams.leftMargin = (int) (((float) VideoContext.this.f161948k[0]) * floatValue);
                                marginLayoutParams.topMargin = (int) (((float) VideoContext.this.f161948k[1]) * floatValue);
                                float f = 1.0f - floatValue;
                                marginLayoutParams.width = (int) (((float) VideoContext.this.f161947j) + (((float) (VideoContext.this.f161944g - VideoContext.this.f161947j)) * f));
                                marginLayoutParams.height = (int) (((float) VideoContext.this.f161946i) + (f * ((float) (VideoContext.this.f161945h - VideoContext.this.f161946i))));
                                layerHostMediaLayout.setLayoutParams(marginLayoutParams);
                            }
                        }
                    });
                    this.f161957v.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.videoshop.context.VideoContext.C641354 */

                        public void onAnimationEnd(Animator animator) {
                            UIUtils.detachFromParent(VideoContext.this.f161939b);
                            if (VideoContext.this.f161940c != null) {
                                VideoContext.this.f161940c.mo222392a(VideoContext.this.f161939b);
                            }
                            VideoContext.this.f161938a.mo222284e();
                            VideoContext.this.f161938a.mo222271a(0);
                            C64116b m = VideoContext.this.mo222060m();
                            C64159a.m252077a(m, getClass().getSimpleName() + " onFullScreen onAnimationEnd");
                        }
                    });
                    this.f161957v.setDuration((long) H);
                    TimeInterpolator g2 = this.f161958w.mo222312g();
                    if (g2 != null) {
                        this.f161957v.setInterpolator(g2);
                    }
                    this.f161957v.start();
                }
            }
            this.f161959x = System.currentTimeMillis();
            this.f161939b.mo222355a(z, this.f161938a.mo222290k());
            for (AbstractC64099h hVar : this.f161955t) {
                hVar.mo163967a(this.f161939b.getVideoStateInquirer(), this.f161939b.getPlayEntity(), z, i, z2, z3);
            }
            for (Map.Entry<Lifecycle, LifeCycleObserver> entry : this.f161941d.entrySet()) {
                LifeCycleObserver value = entry.getValue();
                if (value != null) {
                    value.mo221904a(z, i, z2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo222026a(KeyEvent keyEvent) {
        return keyEvent.dispatch(this, this.f161937C, this);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h, com.ss.android.videoshop.api.AbstractC64096e
    /* renamed from: a */
    public void mo221887a(boolean z, int i) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221887a(z, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64096e
    /* renamed from: a */
    public boolean mo221872a(boolean z, int i, boolean z2) {
        for (Map.Entry<Lifecycle, LifeCycleObserver> entry : this.f161941d.entrySet()) {
            LifeCycleObserver value = entry.getValue();
            if (value != null && value.mo221905b(z, i, z2)) {
                return true;
            }
        }
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null) {
            return false;
        }
        for (AbstractC64099h hVar : this.f161955t) {
            if (hVar.mo221889a(layerHostMediaLayout.getVideoStateInquirer(), layerHostMediaLayout.getPlayEntity(), z, i, z2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo222015a(Lifecycle lifecycle, AbstractC64102j jVar) {
        if (lifecycle != null && jVar != null) {
            this.f161941d.put(lifecycle, new LifeCycleObserver(lifecycle, jVar, this));
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163963a(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163963a(oVar, bVar, i, i2);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221880a(AbstractC64108o oVar, C64116b bVar, int i) {
        if (!mo221998K() || !bVar.mo221960t().mo222314i()) {
            mo222003P();
        }
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221880a(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221893b(AbstractC64108o oVar, C64116b bVar, boolean z) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221893b(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163962a(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163962a(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163965a(AbstractC64108o oVar, C64116b bVar, Error error) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163965a(oVar, bVar, error);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221883a(AbstractC64108o oVar, C64116b bVar, Resolution resolution, boolean z) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221883a(oVar, bVar, resolution, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221885a(AbstractC64108o oVar, C64116b bVar, String str, boolean z, boolean z2) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221885a(oVar, bVar, str, z, z2);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221892b(AbstractC64108o oVar, C64116b bVar, long j) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221892b(oVar, bVar, j);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163964a(AbstractC64108o oVar, C64116b bVar, long j) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163964a(oVar, bVar, j);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163966a(AbstractC64108o oVar, C64116b bVar, boolean z) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163966a(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221882a(AbstractC64108o oVar, C64116b bVar, Resolution resolution, int i) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221882a(oVar, bVar, resolution, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221884a(AbstractC64108o oVar, C64116b bVar, VideoEngineInfos videoEngineInfos) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221884a(oVar, bVar, videoEngineInfos);
        }
    }

    /* renamed from: i */
    public static NetworkUtils.NetworkType m251727i() {
        return Keeper.KEEPER.getNetworkType();
    }

    /* renamed from: D */
    public void mo221991D() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222528v();
        }
    }

    /* renamed from: E */
    public void mo221992E() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222375j();
        }
    }

    /* renamed from: h */
    public int mo222052h() {
        return this.f161938a.mo222281c();
    }

    /* renamed from: j */
    public void mo222055j() {
        this.f161938a.mo222285f();
    }

    /* renamed from: k */
    public void mo222057k() {
        this.f161938a.mo222286g();
    }

    /* renamed from: p */
    public void mo222073p() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222376k();
        }
    }

    /* renamed from: q */
    public void mo222074q() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222360e();
        }
    }

    /* renamed from: A */
    public int mo221988A() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null) {
            return 0;
        }
        return layerHostMediaLayout.getCurrentPosition();
    }

    /* renamed from: B */
    public int mo221989B() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null) {
            return 0;
        }
        return layerHostMediaLayout.getWatchedDuration();
    }

    /* renamed from: C */
    public AbstractC64108o mo221990C() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getVideoStateInquirer();
        }
        return null;
    }

    /* renamed from: F */
    public boolean mo221993F() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.mo222505s();
        }
        return false;
    }

    /* renamed from: G */
    public boolean mo221994G() {
        C64169a aVar = this.f161958w;
        if (aVar == null || !aVar.mo222310e()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public int mo221995H() {
        C64169a aVar = this.f161958w;
        if (aVar != null) {
            return aVar.mo222311f();
        }
        return -1;
    }

    /* renamed from: I */
    public Bitmap mo221996I() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getVideoFrame();
        }
        return null;
    }

    /* renamed from: J */
    public TTVideoEngine mo221997J() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getVideoEngine();
        }
        return null;
    }

    /* renamed from: N */
    public ViewGroup.LayoutParams mo222001N() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getTextureContainerLayoutParams();
        }
        return null;
    }

    /* renamed from: Q */
    public void mo222004Q() {
        C64182c cVar = this.f161942e;
        if (cVar != null) {
            cVar.mo222344a(false);
        }
    }

    /* renamed from: R */
    public Lifecycle mo222005R() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getObservedLifecycle();
        }
        return null;
    }

    /* renamed from: b */
    public void mo222031b() {
        this.f161935A.mo222100a();
    }

    /* renamed from: d */
    public void mo222042d() {
        if (!mo222040c()) {
            this.f161938a.mo222270a();
        }
    }

    /* renamed from: e */
    public void mo222046e() {
        if (!mo222040c()) {
            this.f161938a.mo222278b();
        }
    }

    /* renamed from: f */
    public boolean mo222049f() {
        return this.f161938a.mo222288i();
    }

    /* renamed from: g */
    public boolean mo222051g() {
        return this.f161938a.mo222289j();
    }

    /* renamed from: l */
    public PlaybackParams mo222059l() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getPlayBackParams();
        }
        return null;
    }

    /* renamed from: m */
    public C64116b mo222060m() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getPlayEntity();
        }
        return null;
    }

    /* renamed from: s */
    public boolean mo222076s() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null || !layerHostMediaLayout.mo222502p()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo222077t() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.mo222503q();
        }
        return false;
    }

    /* renamed from: u */
    public boolean mo222078u() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null || !layerHostMediaLayout.mo222374i()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public List<VideoPatchLayout> mo222079v() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.getVideoPatchLayouts();
        }
        return null;
    }

    /* renamed from: w */
    public boolean mo222080w() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null || !layerHostMediaLayout.mo222504r()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public boolean mo222081x() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null || layerHostMediaLayout.mo222527u()) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public boolean mo222082y() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null || !layerHostMediaLayout.mo222526t()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public int mo222083z() {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null) {
            return 0;
        }
        return layerHostMediaLayout.getDuration();
    }

    public enum Keeper implements VideoScreenStateController.AbstractC64178a, C64182c.AbstractC64185a {
        KEEPER;
        
        public VideoContext currentVideoContext;
        private final BroadcastReceiver netReceiver = new BroadcastReceiver() {
            /* class com.ss.android.videoshop.context.VideoContext.Keeper.C641371 */

            public void onReceive(Context context, Intent intent) {
                boolean z;
                NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType(context);
                if (Keeper.this.networkType != networkType) {
                    Keeper.this.networkType = networkType;
                    z = true;
                } else {
                    z = false;
                }
                if (z && Keeper.this.currentVideoContext != null) {
                    C64159a.m252083b("VideoContextKeeper", "onNetWorkChanged networkType:" + networkType);
                    Keeper.this.currentVideoContext.mo222029a(new C64125i(networkType));
                    for (Map.Entry<Lifecycle, LifeCycleObserver> entry : Keeper.this.currentVideoContext.f161941d.entrySet()) {
                        LifeCycleObserver value = entry.getValue();
                        if (value != null) {
                            value.mo221903a(networkType, Keeper.this.currentVideoContext, context, intent);
                        }
                    }
                }
            }
        };
        public NetworkUtils.NetworkType networkType;
        private boolean registerNetReceiver;
        private C64182c videoAudioFocusController;
        private Map<Context, VideoContext> videoContextMap = new HashMap();
        private VideoScreenStateController videoScreenStateController;

        @Override // com.ss.android.videoshop.kits.autopause.VideoScreenStateController.AbstractC64178a
        public void onScreenOn() {
        }

        private void ensureController() {
            Context a = C64107n.m251616a();
            if (a != null) {
                if (this.videoAudioFocusController == null) {
                    this.videoAudioFocusController = new C64182c(a, this);
                }
                if (this.videoScreenStateController == null) {
                    this.videoScreenStateController = new VideoScreenStateController(a, this);
                }
            }
        }

        private void registerNetReceiver() {
            Context a = C64107n.m251616a();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (a != null) {
                try {
                    INVOKEVIRTUAL_com_ss_android_videoshop_context_VideoContext$Keeper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(a, this.netReceiver, intentFilter);
                    this.registerNetReceiver = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public NetworkUtils.NetworkType getNetworkType() {
            Context a = C64107n.m251616a();
            if (!this.registerNetReceiver && a != null) {
                this.networkType = NetworkUtils.getNetworkType(a);
            }
            return this.networkType;
        }

        private void clearVideoContextMap() {
            Iterator<Context> it = this.videoContextMap.keySet().iterator();
            while (it.hasNext()) {
                Context next = it.next();
                if ((next instanceof LifecycleOwner) && ((LifecycleOwner) next).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    it.remove();
                }
            }
        }

        @Override // com.ss.android.videoshop.kits.autopause.VideoScreenStateController.AbstractC64178a
        public void onScreenOff() {
            if (this.currentVideoContext != null) {
                C64159a.m252083b("VideoContextKeeper", "onScreenOff");
                for (Map.Entry<Lifecycle, LifeCycleObserver> entry : this.currentVideoContext.f161941d.entrySet()) {
                    LifeCycleObserver value = entry.getValue();
                    if (value != null) {
                        value.mo163677b(this.currentVideoContext);
                    }
                }
            }
        }

        public void onActResume(VideoContext videoContext) {
            ensureController();
            if (videoContext != null) {
                videoContext.f161942e = this.videoAudioFocusController;
                videoContext.f161943f = this.videoScreenStateController;
                videoContext.mo222050g(true);
                this.currentVideoContext = videoContext;
            }
        }

        @Override // com.ss.android.videoshop.kits.autopause.C64182c.AbstractC64185a
        public void onAudioFocusGain(boolean z) {
            if (this.currentVideoContext != null) {
                C64159a.m252083b("VideoContextKeeper", "onAudioFocusGain");
                for (Map.Entry<Lifecycle, LifeCycleObserver> entry : this.currentVideoContext.f161941d.entrySet()) {
                    LifeCycleObserver value = entry.getValue();
                    if (value != null) {
                        value.mo163678b(this.currentVideoContext, z);
                    }
                }
            }
        }

        @Override // com.ss.android.videoshop.kits.autopause.C64182c.AbstractC64185a
        public void onAudioFocusLoss(boolean z) {
            if (this.currentVideoContext != null) {
                C64159a.m252083b("VideoContextKeeper", "onAudioFocusLoss");
                for (Map.Entry<Lifecycle, LifeCycleObserver> entry : this.currentVideoContext.f161941d.entrySet()) {
                    LifeCycleObserver value = entry.getValue();
                    if (value != null) {
                        value.mo163671a(this.currentVideoContext, z);
                    }
                }
            }
        }

        @Override // com.ss.android.videoshop.kits.autopause.VideoScreenStateController.AbstractC64178a
        public void onScreenUserPresent(boolean z) {
            if (this.currentVideoContext != null) {
                C64159a.m252083b("VideoContextKeeper", "onScreenUserPresent");
                for (Map.Entry<Lifecycle, LifeCycleObserver> entry : this.currentVideoContext.f161941d.entrySet()) {
                    LifeCycleObserver value = entry.getValue();
                    if (value != null) {
                        value.mo163680c(this.currentVideoContext);
                    }
                }
            }
        }

        public VideoContext getVideoContext(Context context) {
            if (C64107n.m251616a() == null && context != null) {
                C64107n.m251617a(context.getApplicationContext());
            }
            if (!this.registerNetReceiver) {
                registerNetReceiver();
            }
            Activity a = C64174c.m252210a(context);
            if (a instanceof LifecycleOwner) {
                if (this.videoContextMap.containsKey(a)) {
                    return this.videoContextMap.get(a);
                }
                VideoContext videoContext = new VideoContext(a);
                if (((LifecycleOwner) a).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                    this.videoContextMap.put(a, videoContext);
                }
                return videoContext;
            } else if (!C64107n.m251618b()) {
                return null;
            } else {
                throw new RuntimeException("context must be LifecycleOwner");
            }
        }

        private Keeper() {
            if (C64107n.m251616a() != null) {
                ensureController();
            }
            registerNetReceiver();
        }

        public void onActDestroy(Context context, VideoContext videoContext) {
            if (videoContext != null) {
                videoContext.f161942e = null;
                videoContext.f161943f = null;
                if (videoContext == this.currentVideoContext) {
                    this.currentVideoContext = null;
                }
            }
            this.videoContextMap.remove(context);
            clearVideoContextMap();
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        public static Intent INVOKEVIRTUAL_com_ss_android_videoshop_context_VideoContext$Keeper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }
    }

    /* renamed from: U */
    private void m251721U() {
        if (this.f161945h <= 0 || this.f161944g <= 0) {
            this.f161944g = C64177f.m252222c(this.f161950o);
            this.f161945h = C64177f.m252216a(this.f161950o);
        }
    }

    /* renamed from: K */
    public boolean mo221998K() {
        C64169a aVar = this.f161958w;
        if (aVar == null || !C64179a.m252234a(aVar.mo222318m())) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public boolean mo221999L() {
        C64169a aVar = this.f161958w;
        if (aVar == null || !C64179a.m252235b(aVar.mo222318m())) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public boolean mo222000M() {
        C64169a aVar = this.f161958w;
        if (aVar == null || !C64179a.m252236c(aVar.mo222318m())) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public void mo222003P() {
        if (this.f161942e != null) {
            int i = 1;
            C64169a aVar = this.f161958w;
            if (aVar != null) {
                i = aVar.mo222317l();
            }
            this.f161942e.mo222346b(i);
        }
    }

    /* renamed from: T */
    private void m251720T() {
        ViewGroup viewGroup = this.f161952q;
        if (viewGroup != null) {
            View childAt = this.f161952q.getChildAt(viewGroup.getChildCount() - 1);
            FrameLayout frameLayout = this.f161951p;
            if (childAt != frameLayout && frameLayout != null) {
                UIUtils.detachFromParent(frameLayout);
                this.f161952q.addView(this.f161951p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: V */
    private void m251722V() {
        Activity a = C64174c.m252210a(this.f161950o);
        if (a != null) {
            Window.Callback callback = a.getWindow().getCallback();
            if (callback == null) {
                callback = a;
            }
            Window$CallbackC64140b bVar = this.f161960y;
            if (bVar == null || callback != bVar.mo222105a()) {
                this.f161961z = callback;
                this.f161960y = new Window$CallbackC64140b(callback) {
                    /* class com.ss.android.videoshop.context.VideoContext.C641365 */

                    @Override // com.ss.android.videoshop.context.Window$CallbackC64140b
                    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                        if (!VideoContext.this.mo222049f() || ((keyEvent.getKeyCode() != 4 && (VideoContext.this.f161949l.isEmpty() || !VideoContext.this.f161949l.contains(Integer.valueOf(keyEvent.getKeyCode())))) || !VideoContext.this.mo222026a(keyEvent))) {
                            return super.dispatchKeyEvent(keyEvent);
                        }
                        return true;
                    }
                };
            }
            if (this.f161960y != null) {
                a.getWindow().setCallback(this.f161960y);
            }
        }
    }

    /* renamed from: W */
    private void m251723W() {
        Window$CallbackC64140b bVar;
        Activity a;
        if (this.f161961z != null && (bVar = this.f161960y) != null && bVar.mo222105a() == this.f161961z && (a = C64174c.m252210a(this.f161950o)) != null) {
            a.getWindow().setCallback(this.f161961z);
        }
    }

    /* renamed from: o */
    public void mo222062o() {
        C64116b m = mo222060m();
        C64159a.m252077a(m, getClass().getSimpleName() + " release");
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222361f();
        }
    }

    /* renamed from: r */
    public boolean mo222075r() {
        boolean z;
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            z = layerHostMediaLayout.mo222377l();
        } else {
            z = false;
        }
        if (!z) {
            for (Map.Entry<Lifecycle, LifeCycleObserver> entry : this.f161941d.entrySet()) {
                LifeCycleObserver value = entry.getValue();
                if (value != null) {
                    if (z || value.mo163673a(this)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: S */
    private void m251719S() {
        ViewGroup viewGroup;
        Activity a = C64174c.m252210a(this.f161950o);
        if (a != null && (viewGroup = (ViewGroup) a.findViewById(16908290)) != null) {
            View findViewById = viewGroup.findViewById(R.id.videoshop_helper_view);
            if (findViewById == null) {
                HelperView helperView = this.f161953r;
                if (helperView == null) {
                    HelperView helperView2 = new HelperView(this.f161950o);
                    this.f161953r = helperView2;
                    helperView2.mo221978a(this);
                    this.f161953r.setId(R.id.videoshop_helper_view);
                } else {
                    C64177f.m252223c(helperView);
                }
                viewGroup.addView(this.f161953r, new ViewGroup.LayoutParams(1, 1));
            } else if (findViewById instanceof HelperView) {
                this.f161953r = (HelperView) findViewById;
            } else {
                C64159a.m252084c("VideoContext", "find helpview is illegal type: " + findViewById.getClass().getSimpleName());
                C64177f.m252223c(this.f161953r);
                C64177f.m252223c(findViewById);
                HelperView helperView3 = new HelperView(this.f161950o);
                this.f161953r = helperView3;
                helperView3.mo221978a(this);
                this.f161953r.setId(R.id.videoshop_helper_view);
                viewGroup.addView(this.f161953r, new ViewGroup.LayoutParams(1, 1));
            }
        }
    }

    /* renamed from: c */
    public boolean mo222040c() {
        C64116b m = mo222060m();
        if (m == null || !m.mo221966z()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static VideoContext m251724a(Context context) {
        return Keeper.KEEPER.getVideoContext(context);
    }

    /* renamed from: b */
    public TextureVideoView mo222030b(C64116b bVar) {
        return this.f161935A.mo222102b(bVar);
    }

    /* renamed from: c */
    public void mo222039c(boolean z) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setMute(z);
        }
    }

    /* renamed from: d */
    public void mo222043d(int i) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setRenderMode(i);
        }
    }

    /* renamed from: e */
    public void mo222047e(boolean z) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setAsyncRelease(z);
        }
    }

    /* renamed from: f */
    public void mo222048f(boolean z) {
        this.f161938a.mo222282c(z);
    }

    /* renamed from: g */
    public void mo222050g(boolean z) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setTryToInterceptPlay(z);
        }
    }

    /* renamed from: a */
    public AbstractView$OnLayoutChangeListenerC64144d mo222007a(C64116b bVar) {
        return this.f161935A.mo222099a(bVar);
    }

    /* renamed from: c */
    public AbstractC64153a mo222037c(int i) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.mo222350a(i);
        }
        return null;
    }

    /* renamed from: h */
    public void mo222053h(boolean z) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setReleaseEngineEnabled(z);
        }
    }

    /* renamed from: i */
    public void mo222054i(boolean z) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setUseBlackCover(z);
        }
    }

    /* renamed from: j */
    public void mo222056j(boolean z) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setHideHostWhenRelease(z);
        }
    }

    /* renamed from: a */
    public void mo222008a(int i) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setVideoControllerType(i);
        }
    }

    /* renamed from: b */
    public void mo222032b(int i) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setStartTime(i);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onLifeCycleOnPause(LifecycleOwner lifecycleOwner) {
        C64159a.m252080a("VideoContext", "onLifeCycleOnPause owner:" + lifecycleOwner.getClass().getSimpleName());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onLifeCycleOnStart(LifecycleOwner lifecycleOwner) {
        C64159a.m252080a("VideoContext", "onLifeCycleOnStart owner:" + lifecycleOwner.getClass().getSimpleName());
    }

    /* renamed from: b */
    private ViewGroup m251725b(Context context) {
        FrameLayout frameLayout = this.f161951p;
        if (frameLayout != null) {
            return frameLayout;
        }
        View view = null;
        if (this.f161952q == null) {
            Activity a = C64174c.m252210a(context);
            if (a == null) {
                return null;
            }
            this.f161952q = (ViewGroup) a.findViewById(16908290);
        }
        ViewGroup viewGroup = this.f161952q;
        if (viewGroup != null) {
            view = viewGroup.findViewById(R.id.videoshop_fullscreen_view);
        }
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout2 = (FrameLayout) view;
            this.f161951p = frameLayout2;
            return frameLayout2;
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f161951p = frameLayout3;
        frameLayout3.setId(R.id.videoshop_fullscreen_view);
        return this.f161951p;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onLifeCycleOnCreate(LifecycleOwner lifecycleOwner) {
        C64159a.m252080a("VideoContext", "onLifeCycleOnCreate owner:" + lifecycleOwner.getClass().getSimpleName());
        m251719S();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onLifeCycleOnDestroy(LifecycleOwner lifecycleOwner) {
        C64159a.m252080a("VideoContext", "onLifeCycleOnDestroy owner:" + lifecycleOwner.getClass().getSimpleName());
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Keeper.KEEPER.onActDestroy(this.f161950o, this);
        mo222031b();
        lifecycle.removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onLifeCycleOnResume(LifecycleOwner lifecycleOwner) {
        C64159a.m252080a("VideoContext", "onLifeCycleOnResume owner:" + lifecycleOwner.getClass().getSimpleName());
        m251719S();
        if (mo222049f()) {
            this.f161938a.mo222283d();
        }
        Keeper.KEEPER.onActResume(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onLifeCycleOnStop(LifecycleOwner lifecycleOwner) {
        C64159a.m252080a("VideoContext", "onLifeCycleOnStop owner:" + lifecycleOwner.getClass().getSimpleName());
        mo222031b();
    }

    private VideoContext(Context context) {
        this.f161956u = new WeakHandler(this);
        this.f161948k = new int[2];
        this.f161935A = new C64138a();
        this.f161936B = new TreeSet();
        this.f161937C = new KeyEvent.DispatcherState();
        this.f161950o = context;
        C64162a aVar = new C64162a(context);
        this.f161938a = aVar;
        aVar.mo222274a((AbstractC64096e) this);
        this.f161938a.mo222275a(this);
        this.f161941d = new ConcurrentHashMap();
        this.f161955t = new CopyOnWriteArrayList();
        m251721U();
        try {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        } catch (Exception unused) {
        }
        this.f161949l = new TreeSet<>();
        this.f161954s = new ArrayList();
        this.f161935A.mo222101a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ Exception -> 0x0067 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m251726b(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.context.VideoContext.m251726b(android.view.View):void");
    }

    /* renamed from: d */
    public void mo222044d(SimpleMediaView simpleMediaView) {
        if (simpleMediaView != null && simpleMediaView.mo222421i() && mo222051g()) {
            if ((!mo222027a((View) simpleMediaView) || !mo222041c(simpleMediaView.getPlayEntity())) && simpleMediaView.mo222425m()) {
                this.f161956u.sendMessage(this.f161956u.obtainMessage(102, simpleMediaView));
                return;
            }
            C64159a.m252080a("VideoContext", "send 200 MSG_DISPATCH_DETACH simpleMediaView:" + simpleMediaView.hashCode());
            this.f161956u.sendMessage(this.f161956u.obtainMessage(100, simpleMediaView));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 100) {
            SimpleMediaView simpleMediaView = (SimpleMediaView) message.obj;
            C64159a.m252080a("VideoContext", "MSG_DISPATCH_DETACH simpleMediaView:" + simpleMediaView.hashCode());
            AbstractC64092a attachListener = simpleMediaView.getAttachListener();
            if (attachListener != null) {
                attachListener.mo163740b(simpleMediaView);
            }
        } else if (message.what == 101) {
            SimpleMediaView simpleMediaView2 = (SimpleMediaView) message.obj;
            C64159a.m252080a("VideoContext", "MSG_DISPATCH_ATTACH simpleMediaView:" + simpleMediaView2.hashCode());
            AbstractC64092a attachListener2 = simpleMediaView2.getAttachListener();
            if (attachListener2 != null) {
                attachListener2.mo163738a(simpleMediaView2);
            }
        } else if (message.what == 102) {
            this.f161935A.mo222103c(((SimpleMediaView) message.obj).getPlayEntity());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo222058k(boolean z) {
        for (Map.Entry<Lifecycle, LifeCycleObserver> entry : this.f161941d.entrySet()) {
            LifeCycleObserver value = entry.getValue();
            if (value != null) {
                value.mo221906c(this, z);
            }
        }
        mo222029a(new C64131o(z));
    }

    /* renamed from: a */
    public void mo222011a(long j) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222352a(j);
        }
    }

    /* renamed from: b */
    public void mo222033b(Lifecycle lifecycle) {
        LifeCycleObserver remove = this.f161941d.remove(lifecycle);
        if (remove != null) {
            lifecycle.removeObserver(remove);
        }
    }

    /* renamed from: c */
    public void mo222038c(SimpleMediaView simpleMediaView) {
        if (simpleMediaView != null && simpleMediaView.getObservedLifecycle() == mo222005R()) {
            SimpleMediaView simpleMediaView2 = this.f161940c;
            if (simpleMediaView2 != null && !simpleMediaView2.mo222421i()) {
                return;
            }
            if (mo222041c(simpleMediaView.getPlayEntity())) {
                mo222035b(simpleMediaView);
                this.f161956u.removeCallbacksAndMessages(null);
                this.f161956u.sendMessage(this.f161956u.obtainMessage(101, simpleMediaView));
                C64159a.m252080a("VideoContext", "send MSG_DISPATCH_ATTACH simpleMediaView:" + simpleMediaView.hashCode());
            } else if (mo222051g() && mo222027a((View) simpleMediaView)) {
                C64159a.m252080a("VideoContext", "send 0 MSG_DISPATCH_DETACH simpleMediaView:" + simpleMediaView.hashCode());
                this.f161956u.sendMessage(this.f161956u.obtainMessage(100, simpleMediaView));
            }
        }
    }

    /* renamed from: d */
    public void mo222045d(boolean z) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setLoop(z);
        }
    }

    /* renamed from: a */
    public void mo222012a(Configuration configuration) {
        this.f161938a.mo222273a(configuration);
    }

    /* renamed from: a */
    public void mo222013a(ViewGroup.LayoutParams layoutParams) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.setTextureContainerLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    public boolean mo222041c(C64116b bVar) {
        boolean z;
        String str;
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null || bVar == null || !bVar.equals(layerHostMediaLayout.getPlayEntity())) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isCurrentSource:");
        sb.append(z);
        sb.append(" entity vid:");
        if (bVar != null) {
            str = bVar.mo221934b();
        } else {
            str = null;
        }
        sb.append(str);
        C64159a.m252080a("VideoContext", sb.toString());
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo222014a(Lifecycle lifecycle) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null && layerHostMediaLayout.getObservedLifecycle() == lifecycle) {
            C64159a.m252077a(mo222060m(), getClass().getSimpleName() + " cleanUp");
            this.f161939b.mo222376k();
            this.f161939b.mo222361f();
            this.f161939b = null;
            this.f161940c = null;
        }
        for (int size = this.f161954s.size() - 1; size >= 0; size--) {
            LayerHostMediaLayout layerHostMediaLayout2 = this.f161954s.get(size);
            if (layerHostMediaLayout2.getObservedLifecycle() == lifecycle) {
                layerHostMediaLayout2.mo222376k();
                layerHostMediaLayout2.mo222361f();
                this.f161954s.remove(layerHostMediaLayout2);
            }
        }
        EngineInspector.ENUM.onContextDestroy(mo222006a());
        C64159a.m252083b("VideoContext", "Context Destroy Engine State:" + EngineInspector.ENUM.getStateDesc());
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo163971c(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163971c(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: d */
    public void mo163972d(AbstractC64108o oVar, C64116b bVar) {
        if (mo222049f()) {
            m251719S();
        }
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163972d(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo163973e(AbstractC64108o oVar, C64116b bVar) {
        if (mo222000M()) {
            mo222004Q();
        }
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163973e(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo163974f(AbstractC64108o oVar, C64116b bVar) {
        if (mo221999L()) {
            mo222004Q();
        }
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163974f(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo163975g(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163975g(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: i */
    public void mo163977i(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163977i(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: j */
    public void mo163978j(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163978j(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: l */
    public void mo221900l(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221900l(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: m */
    public void mo221901m(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221901m(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: n */
    public void mo221902n(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221902n(oVar, bVar);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            keyEvent.startTracking();
            return true;
        }
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            return layerHostMediaLayout.mo222356a(new C64119c(308, Integer.valueOf(i)));
        }
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout == null) {
            return false;
        }
        layerHostMediaLayout.mo222356a(new C64119c(310, Integer.valueOf(i)));
        return false;
    }

    /* renamed from: a */
    public void mo222009a(int i, C64193b bVar) {
        LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
        if (layerHostMediaLayout != null) {
            layerHostMediaLayout.mo222470a(i, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: h */
    public void mo163976h(AbstractC64108o oVar, C64116b bVar) {
        mo222057k();
        mo222004Q();
        VideoScreenStateController videoScreenStateController = this.f161943f;
        if (videoScreenStateController != null) {
            videoScreenStateController.mo222329b();
        }
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163976h(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: k */
    public void mo163979k(AbstractC64108o oVar, C64116b bVar) {
        VideoScreenStateController videoScreenStateController = this.f161943f;
        if (videoScreenStateController != null) {
            videoScreenStateController.mo222328a();
        }
        m251719S();
        mo222055j();
        if (mo222049f()) {
            m251719S();
        }
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163979k(oVar, bVar);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!mo222049f()) {
            return false;
        }
        if (i != 4 || !keyEvent.isTracking() || keyEvent.isCanceled()) {
            LayerHostMediaLayout layerHostMediaLayout = this.f161939b;
            if (layerHostMediaLayout != null) {
                return layerHostMediaLayout.mo222356a(new C64119c(309, Integer.valueOf(i)));
            }
            return false;
        } else if (mo222075r()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo222010a(int i, boolean z) {
        m251719S();
        if (this.f161953r != null) {
            if (z) {
                this.f161936B.add(Integer.valueOf(i));
            } else {
                this.f161936B.remove(Integer.valueOf(i));
            }
            this.f161953r.setKeepScreenOn(!this.f161936B.isEmpty());
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo163970b(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo163970b(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo221894c(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221894c(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: d */
    public void mo221896d(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221896d(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo221897e(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221897e(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo221898f(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221898f(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo221899g(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221899g(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo221895c(AbstractC64108o oVar, C64116b bVar, boolean z) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221895c(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221890b(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221890b(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221891b(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        for (AbstractC64099h hVar : this.f161955t) {
            hVar.mo221891b(oVar, bVar, i, i2);
        }
    }
}
