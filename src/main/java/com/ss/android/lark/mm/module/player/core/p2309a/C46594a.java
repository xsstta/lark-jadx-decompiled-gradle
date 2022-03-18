package com.ss.android.lark.mm.module.player.core.p2309a;

import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.videoshop.api.AbstractC64102j;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.kits.autopause.C64180b;
import com.ss.android.videoshop.mediaview.VideoPatchLayout;
import com.ss.android.videoshop.p3199e.C64159a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.a.a */
public class C46594a extends AbstractC64102j.C64103a implements WeakHandler.IHandler, C64180b.AbstractC64181a {

    /* renamed from: a */
    protected C64180b f117240a;

    /* renamed from: b */
    protected VideoContext f117241b;

    /* renamed from: c */
    protected Lifecycle f117242c;

    /* renamed from: d */
    protected int f117243d = 0;

    /* renamed from: e */
    private WeakHandler f117244e = new WeakHandler(this);

    /* renamed from: a */
    public boolean mo163672a() {
        return false;
    }

    /* renamed from: b */
    public long mo163675b() {
        return 500;
    }

    @Override // com.ss.android.videoshop.kits.autopause.C64180b.AbstractC64181a
    /* renamed from: c */
    public boolean mo163681c() {
        VideoContext videoContext = this.f117241b;
        if (videoContext == null) {
            return false;
        }
        if (this.f117242c == null || videoContext.mo222005R() == this.f117242c) {
            this.f117243d = 0;
            if (!this.f117241b.mo222082y() && !this.f117241b.mo221993F() && ((this.f117241b.mo222076s() || this.f117241b.mo222077t()) && !this.f117241b.mo222081x())) {
                C64159a.m252083b("MmAutoPauseResumeLifeCycleHandler", "lifecycle handler pause");
                this.f117243d = 1;
            }
            if (this.f117241b.mo222078u()) {
                this.f117241b.mo221992E();
                if (this.f117243d == 1) {
                    this.f117243d = 3;
                } else {
                    this.f117243d = 2;
                }
            }
            if (this.f117243d > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: b */
    public void mo163677b(VideoContext videoContext) {
        this.f117240a.mo222335b();
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: c */
    public void mo163680c(VideoContext videoContext) {
        this.f117240a.mo222337c();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1001) {
            mo163680c(this.f117241b);
        }
    }

    public C46594a(VideoContext videoContext) {
        C64180b bVar = new C64180b(videoContext);
        this.f117240a = bVar;
        bVar.mo222332a(this);
        this.f117241b = videoContext;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: a */
    public boolean mo163673a(VideoContext videoContext) {
        if (this.f117242c != null && videoContext.mo222005R() != this.f117242c) {
            return false;
        }
        videoContext.mo222025a(true);
        return true;
    }

    @Override // com.ss.android.videoshop.kits.autopause.C64180b.AbstractC64181a
    /* renamed from: a */
    public boolean mo163674a(boolean z) {
        VideoContext videoContext = this.f117241b;
        if (videoContext == null) {
            return false;
        }
        if (this.f117242c == null || videoContext.mo222005R() == this.f117242c) {
            int i = this.f117243d;
            if (i == 1 || i == 3) {
                if (this.f117241b.mo221993F() && !z) {
                    C64159a.m252083b("MmAutoPauseResumeLifeCycleHandler", "lifecycle handler play-1");
                    return true;
                }
            } else if (i == 2) {
                List<VideoPatchLayout> v = this.f117241b.mo222079v();
                if (v != null) {
                    Iterator<VideoPatchLayout> it = v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().mo222505s()) {
                                C64159a.m252083b("MmAutoPauseResumeLifeCycleHandler", "lifecycle handler play-2");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: b */
    public void mo163678b(VideoContext videoContext, boolean z) {
        this.f117240a.mo222336b(z);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: a */
    public void mo163670a(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        Logger.m15167d("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnCreate:" + lifecycleOwner.toString());
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: a */
    public void mo163671a(VideoContext videoContext, boolean z) {
        C45855f.m181663b("MmAutoPauseResumeLifeCycleHandler", "onAudioFocusLoss  " + z);
        if (z) {
            videoContext.mo221991D();
        }
        this.f117240a.mo222333a(z);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: b */
    public void mo163676b(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        Logger.m15167d("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnStart:" + lifecycleOwner.toString());
        C64159a.m252083b("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnStart:" + lifecycleOwner.toString());
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: d */
    public void mo163682d(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        Logger.m15167d("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnPause:" + lifecycleOwner.toString());
        C64159a.m252083b("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnPause:" + lifecycleOwner.toString());
        this.f117240a.mo222338d();
        this.f117244e.removeMessages(CommonCode.StatusCode.API_CLIENT_EXPIRED);
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: e */
    public void mo163683e(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        Logger.m15167d("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnStop:" + lifecycleOwner.toString());
        C64159a.m252083b("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnStop:" + lifecycleOwner.toString());
        this.f117240a.mo222338d();
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: f */
    public void mo163684f(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        Logger.m15167d("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnDestroy:" + lifecycleOwner.toString());
        if (this.f117242c == null || videoContext.mo222005R() == lifecycleOwner.getLifecycle()) {
            videoContext.mo222062o();
            videoContext.mo222073p();
        }
        this.f117240a.mo222341g();
    }

    @Override // com.ss.android.videoshop.api.AbstractC64102j.C64103a, com.ss.android.videoshop.api.AbstractC64102j
    /* renamed from: c */
    public void mo163679c(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        Logger.m15167d("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnResume:" + lifecycleOwner.toString());
        C64159a.m252083b("MmAutoPauseResumeLifeCycleHandler", "onLifeCycleOnResume:" + lifecycleOwner.toString());
        this.f117240a.mo222340f();
        this.f117240a.mo222339e();
        if (this.f117240a.mo222334a() && mo163672a()) {
            this.f117244e.sendEmptyMessageDelayed(CommonCode.StatusCode.API_CLIENT_EXPIRED, mo163675b());
        }
    }
}
