package com.ss.android.vc.meeting.module.tab3.list.mvp.repo;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.GrootCell;
import com.ss.android.vc.entity.PushGrootCells;
import com.ss.android.vc.entity.response.C60972f;
import com.ss.android.vc.entity.response.PushGrootChannelStatusEntity;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.b */
public final class C63389b {

    /* renamed from: c */
    private static volatile C63389b f160045c;

    /* renamed from: a */
    public AtomicBoolean f160046a = new AtomicBoolean(false);

    /* renamed from: b */
    public AbstractC63394a f160047b;

    /* renamed from: d */
    private String f160048d;

    /* renamed from: e */
    private VideoChatPush.AbstractC63563c f160049e;

    /* renamed from: f */
    private VideoChatPush.AbstractC63564d f160050f;

    /* renamed from: g */
    private VideoChatPush.AbstractC63564d f160051g;

    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.b$a */
    public interface AbstractC63394a {
        /* renamed from: a */
        void mo219342a();

        /* renamed from: a */
        void mo219343a(List<GrootCell> list);

        /* renamed from: b */
        void mo219344b();
    }

    private C63389b() {
        mo219359a();
    }

    /* renamed from: b */
    public static C63389b m248367b() {
        if (f160045c == null) {
            synchronized (C63389b.class) {
                if (f160045c == null) {
                    f160045c = new C63389b();
                }
            }
        }
        return f160045c;
    }

    /* renamed from: e */
    public void mo219370e() {
        if (!TextUtils.isEmpty(VideoChatModuleDependency.m236630c()) && this.f160051g != null) {
            VideoChatPush.m249004a().mo219753b(VideoChatModuleDependency.m236630c(), this.f160051g);
            this.f160051g = null;
        }
    }

    /* renamed from: c */
    public void mo219366c() {
        if (this.f160046a.get() && !TextUtils.isEmpty(this.f160048d)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[destroy]", "close channel");
            mo219362a(this.f160048d);
            mo219365b(this.f160048d);
            mo219367c(this.f160048d);
            this.f160046a.set(false);
            this.f160047b = null;
        }
    }

    /* renamed from: d */
    public void mo219368d() {
        String c = VideoChatModuleDependency.m236630c();
        if (!TextUtils.isEmpty(c)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[closeUserChannel]", "userId=" + c);
            VcBizService.grootCloseChannel(ChannelMeta.GrootChannel.VC_TAB_USER_CHANNEL, c, new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b.C633934 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VideoChatTab_PushHelper", "[closeChannel VC_TAB_USER_CHANNEL2]", "onError:" + eVar.mo219902b());
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    PushGrootChannelStatusEntity pushGrootChannelStatusEntity = ((C60972f) obj).f152686a;
                    C60700b.m235851b("VideoChatTab_PushHelper", "[closeChannel VC_TAB_USER_CHANNEL]", "onSuccess status=" + pushGrootChannelStatusEntity);
                }
            });
        }
    }

    /* renamed from: f */
    public void mo219371f() {
        String c = VideoChatModuleDependency.m236630c();
        if (TextUtils.isEmpty(c)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[registerUserChannelStateListener]", "failed because userId is null.");
            return;
        }
        if (this.f160051g == null) {
            this.f160051g = $$Lambda$b$vgCmTDvzZ55dMKdafKQHSGib7Y.INSTANCE;
        }
        VideoChatPush.m249004a().mo219730a(c, this.f160051g);
    }

    /* renamed from: a */
    public void mo219359a() {
        this.f160048d = VideoChatModuleDependency.m236630c() + "_" + TimeZone.getDefault().getID();
    }

    /* renamed from: a */
    public void mo219361a(AbstractC63394a aVar) {
        this.f160047b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248365a(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("VideoChatTab_PushHelper", "[onPushChannelStatus2]", "VC_TAB_USER_CHANNEL  " + pushGrootChannelStatusEntity.f152610b);
    }

    /* renamed from: c */
    public void mo219367c(String str) {
        if (!TextUtils.isEmpty(str) && this.f160050f != null) {
            VideoChatPush.m249004a().mo219753b(str, this.f160050f);
            this.f160050f = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m248368b(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("VideoChatTab_PushHelper", "[onPushChannelStatus]", "VC_TAB_LIST_CHANNEL " + pushGrootChannelStatusEntity.f152610b);
    }

    /* renamed from: e */
    private void m248369e(String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[registerListCells]", "failed because channelId is null.");
            return;
        }
        if (this.f160049e == null) {
            this.f160049e = new VideoChatPush.AbstractC63563c(str) {
                /* class com.ss.android.vc.meeting.module.tab3.list.mvp.repo.$$Lambda$b$d8MOAS3tmwt2KM831Yu33KNOpho */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63563c
                public final void onPushGrootCells(PushGrootCells pushGrootCells) {
                    C63389b.this.m248366a(this.f$1, pushGrootCells);
                }
            };
        }
        VideoChatPush.m249004a().mo219712a(this.f160049e);
        C60700b.m235851b("VideoChatTab_PushHelper", "[registerCells VC_TAB_LIST_CHANNEL]", "success: listener= " + this.f160049e);
    }

    /* renamed from: b */
    public void mo219364b(int i) {
        String c = VideoChatModuleDependency.m236630c();
        if (!TextUtils.isEmpty(c)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[openUserChannel]", "userId= " + c);
            VcBizService.grootOpenChannel(ChannelMeta.GrootChannel.VC_TAB_USER_CHANNEL, VideoChatModuleDependency.m236630c(), i, new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b.C633912 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    C60700b.m235851b("VideoChatTab_PushHelper", "[openChannel VC_TAB_USER_CHANNEL]", "success");
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VideoChatTab_PushHelper", "[openChannel VC_TAB_USER_CHANNEL2]", "onError:" + eVar.mo219902b());
                }
            });
        }
    }

    /* renamed from: d */
    public void mo219369d(String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[registerChannelStatusListener]", "failed because channelId is null.");
            return;
        }
        if (this.f160050f == null) {
            this.f160050f = $$Lambda$b$jK1du5yweaBFhFbN7CzAh54IyGo.INSTANCE;
        }
        VideoChatPush.m249004a().mo219730a(str, this.f160050f);
    }

    /* renamed from: a */
    public void mo219360a(int i) {
        if (!this.f160046a.get() && !TextUtils.isEmpty(this.f160048d)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[start]", "open groot channel.");
            mo219369d(this.f160048d);
            m248369e(this.f160048d);
            mo219363a(this.f160048d, VideoChatModuleDependency.m236630c(), i);
        }
    }

    /* renamed from: b */
    public void mo219365b(String str) {
        if (!TextUtils.isEmpty(str) && this.f160049e != null) {
            VideoChatPush.m249004a().mo219735b(this.f160049e);
            this.f160049e = null;
        }
    }

    /* renamed from: a */
    public void mo219362a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[closeListChannel]", "channelId=" + str);
            VcBizService.grootCloseChannel(ChannelMeta.GrootChannel.VC_TAB_LIST_CHANNEL, str, new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b.C633923 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VideoChatTab_PushHelper", "[closeChannel VC_TAB_LIST_CHANNEL2]", "error:" + eVar.mo219902b());
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    C60700b.m235851b("VideoChatTab_PushHelper", "[closeChannel VC_TAB_LIST_CHANNEL]", "onSuccess = " + ((C60972f) obj).f152686a);
                    C63389b.this.f160046a.set(false);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m248366a(String str, PushGrootCells pushGrootCells) {
        AbstractC63394a aVar;
        List<GrootCell> list = pushGrootCells.cells;
        ChannelMeta channelMeta = pushGrootCells.channel_meta;
        if (channelMeta != null && TextUtils.equals(channelMeta.channelId, str) && !CollectionUtils.isEmpty(list) && channelMeta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_LIST_CHANNEL && (aVar = this.f160047b) != null) {
            aVar.mo219343a(list);
        }
    }

    /* renamed from: a */
    public void mo219363a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C60700b.m235851b("VideoChatTab_PushHelper", "[openListChannel]", "failed because channelId is null.");
            return;
        }
        C60700b.m235851b("VideoChatTab_PushHelper", "[openListChannel2]", "channelId=" + str + " userId= " + str2 + " version= " + i);
        VcBizService.openVCTabGrootChannel(ChannelMeta.GrootChannel.VC_TAB_LIST_CHANNEL, str, str2, i, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b.C633901 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("VideoChatTab_PushHelper", "[openChannel VC_TAB_LIST_CHANNEL]", "success.");
                if (C63389b.this.f160047b != null) {
                    C63389b.this.f160047b.mo219342a();
                }
                C63389b.this.f160046a.set(true);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_PushHelper", "[openChannel VC_TAB_LIST_CHANNEL2]", "error= " + eVar.mo219902b());
                if (C63389b.this.f160047b != null) {
                    C63389b.this.f160047b.mo219344b();
                }
            }
        });
    }
}
