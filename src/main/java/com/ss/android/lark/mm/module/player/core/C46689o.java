package com.ss.android.lark.mm.module.player.core;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.mediaview.SimpleMediaView;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3200f.C64161a;
import com.ss.ttm.player.PlaybackParams;
import org.apache.commons.codec.p3491a.C69743a;
import org.apache.commons.codec.p3492b.C69745a;

/* renamed from: com.ss.android.lark.mm.module.player.core.o */
public class C46689o implements AbstractC46597d {

    /* renamed from: a */
    private SimpleMediaView f117439a;

    /* renamed from: b */
    private C64161a f117440b;

    /* renamed from: c */
    private AbstractC46595b f117441c;

    /* renamed from: d */
    private String f117442d;

    /* renamed from: e */
    private String f117443e;

    /* renamed from: f */
    private int f117444f;

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: c */
    public int mo163708c() {
        int i = this.f117444f;
        this.f117444f = 0;
        return i;
    }

    /* renamed from: d */
    private VideoContext m184675d() {
        SimpleMediaView simpleMediaView = this.f117439a;
        if (simpleMediaView != null) {
            return VideoContext.m251724a(simpleMediaView.getContext());
        }
        return null;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: a */
    public void mo163700a() {
        if (this.f117441c.mo163685a().mo163724m()) {
            C45855f.m181664c("PlayerController", "pause preparing");
            return;
        }
        SimpleMediaView simpleMediaView = this.f117439a;
        if (simpleMediaView != null) {
            simpleMediaView.mo222423k();
        } else {
            this.f117440b.mo222267c();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: b */
    public void mo163706b() {
        if (this.f117441c.mo163685a().mo163724m()) {
            C45855f.m181664c("PlayerController", "play preparing");
            return;
        }
        SimpleMediaView simpleMediaView = this.f117439a;
        if (simpleMediaView != null) {
            if (simpleMediaView.mo222422j()) {
                this.f117439a.mo222420h();
            } else if (!TextUtils.isEmpty(this.f117442d)) {
                mo163957d(this.f117442d);
            } else if (!TextUtils.isEmpty(this.f117443e)) {
                mo163958e(this.f117443e);
            } else {
                this.f117439a.mo222420h();
            }
        } else if (this.f117440b.mo222266b()) {
            this.f117440b.mo222259a();
        } else if (!TextUtils.isEmpty(this.f117442d)) {
            mo163957d(this.f117442d);
        } else if (!TextUtils.isEmpty(this.f117443e)) {
            mo163958e(this.f117443e);
        } else {
            this.f117440b.mo222259a();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: a */
    public void mo163705a(String str) {
        this.f117442d = str;
        this.f117441c.mo163690f().mo221929a(str);
    }

    public C46689o(AbstractC46595b bVar) {
        this.f117441c = bVar;
        this.f117439a = bVar.mo163688d();
        this.f117440b = bVar.mo163689e();
    }

    /* renamed from: a */
    private void m184674a(C64116b bVar) {
        SimpleMediaView simpleMediaView = this.f117439a;
        if (simpleMediaView != null) {
            simpleMediaView.setPlayEntity(bVar);
            this.f117439a.mo222420h();
            return;
        }
        this.f117440b.mo222264a(bVar);
        this.f117440b.mo222259a();
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: b */
    public void mo163707b(String str) {
        this.f117443e = str;
        C64116b f = this.f117441c.mo163690f();
        f.mo221939e(str);
        SimpleMediaView simpleMediaView = this.f117439a;
        if (simpleMediaView != null) {
            simpleMediaView.setPlayEntity(f);
            return;
        }
        C64161a aVar = this.f117440b;
        if (aVar != null) {
            aVar.mo222264a(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: c */
    public void mo163709c(String str) {
        Bundle d;
        if (!TextUtils.isEmpty(str) && (d = this.f117441c.mo163690f().mo221937d()) != null) {
            d.putString("video_cover_url", str);
        }
    }

    /* renamed from: b */
    public boolean mo163956b(long j) {
        if (!this.f117441c.mo163685a().mo163714c() || ((long) (this.f117441c.mo163685a().mo163710a() / 1000)) != j / 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo163958e(String str) {
        if (!TextUtils.isEmpty(str)) {
            C64116b f = this.f117441c.mo163690f();
            if (!str.startsWith("http")) {
                f.mo221942f(str);
            } else if (this.f117441c.mo163692h()) {
                f.mo221947h(new String(C69743a.m267688a(C69745a.m267697b(str))));
                f.mo221945g(str);
            } else {
                f.mo221939e(str);
            }
            mo163707b(str);
            m184674a(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: a */
    public void mo163701a(float f) {
        if (this.f117439a != null) {
            if (!(this.f117441c.mo163687c() == null || this.f117441c.mo163687c().mo163726b() == null)) {
                this.f117441c.mo163687c().mo163726b().mo163822a(f);
            }
            VideoContext d = m184675d();
            if (d != null) {
                PlaybackParams l = d.mo222059l();
                if (l == null) {
                    l = new PlaybackParams();
                }
                l.setSpeed(f);
                d.mo222022a(l);
                return;
            }
            return;
        }
        C64161a aVar = this.f117440b;
        if (aVar != null) {
            AbstractC64108o e = aVar.mo222269e();
            PlaybackParams playbackParams = null;
            if (e != null) {
                playbackParams = e.mo221919k();
            }
            if (playbackParams == null) {
                playbackParams = new PlaybackParams();
            }
            playbackParams.setSpeed(f);
            this.f117440b.mo222265a(playbackParams);
        }
    }

    /* renamed from: d */
    public void mo163957d(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo163705a(str);
            C64116b f = this.f117441c.mo163690f();
            if (!str.startsWith("http")) {
                f.mo221933b(str);
            } else if (this.f117441c.mo163692h()) {
                f.mo221947h(new String(C69743a.m267688a(C69745a.m267697b(str))));
                f.mo221945g(str);
            } else {
                f.mo221929a(str);
            }
            C45855f.m181664c("PlayerController", "startVideo " + this.f117441c.mo163685a().mo163723l());
            m184674a(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: a */
    public void mo163702a(int i) {
        C45855f.m181664c("PlayerController", "setStartTime " + (i / 1000));
        if (!this.f117441c.mo163685a().mo163721j()) {
            this.f117444f = i;
            return;
        }
        SimpleMediaView simpleMediaView = this.f117439a;
        if (simpleMediaView != null) {
            if (!simpleMediaView.mo222422j()) {
                this.f117444f = i;
                this.f117439a.setStartTime(i);
            }
        } else if (!this.f117440b.mo222266b()) {
            this.f117444f = i;
            this.f117440b.mo222260a(i);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: a */
    public void mo163703a(long j) {
        C45855f.m181664c("PlayerController", "seekTo " + j);
        if (this.f117441c.mo163685a().mo163714c()) {
            if (mo163956b(j)) {
                j = (long) this.f117441c.mo163685a().mo163710a();
            }
            SimpleMediaView simpleMediaView = this.f117439a;
            if (simpleMediaView != null) {
                simpleMediaView.mo222397b(j);
            } else {
                this.f117440b.mo222261a(j);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46597d
    /* renamed from: a */
    public void mo163704a(long j, long j2) {
        Bundle d = this.f117441c.mo163690f().mo221937d();
        if (d != null) {
            d.putLong("video_duration", j2);
            d.putLong("video_last_play_pos", j);
        }
    }
}
