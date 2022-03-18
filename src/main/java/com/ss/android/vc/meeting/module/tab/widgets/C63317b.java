package com.ss.android.vc.meeting.module.tab.widgets;

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

/* renamed from: com.ss.android.vc.meeting.module.tab.widgets.b */
public final class C63317b {

    /* renamed from: c */
    private static volatile C63317b f159762c;

    /* renamed from: a */
    public AtomicBoolean f159763a = new AtomicBoolean(false);

    /* renamed from: b */
    public AbstractC63322a f159764b;

    /* renamed from: d */
    private String f159765d;

    /* renamed from: e */
    private VideoChatPush.AbstractC63563c f159766e;

    /* renamed from: f */
    private VideoChatPush.AbstractC63564d f159767f;

    /* renamed from: g */
    private VideoChatPush.AbstractC63564d f159768g;

    /* renamed from: com.ss.android.vc.meeting.module.tab.widgets.b$a */
    public interface AbstractC63322a {
        /* renamed from: b */
        void mo219014b(List<GrootCell> list);

        /* renamed from: c */
        void mo219015c();

        /* renamed from: d */
        void mo219016d();
    }

    private C63317b() {
        mo219098a();
    }

    /* renamed from: b */
    public static C63317b m248020b() {
        if (f159762c == null) {
            synchronized (C63317b.class) {
                if (f159762c == null) {
                    f159762c = new C63317b();
                }
            }
        }
        return f159762c;
    }

    /* renamed from: e */
    public void mo219109e() {
        if (!TextUtils.isEmpty(VideoChatModuleDependency.m236630c()) && this.f159768g != null) {
            VideoChatPush.m249004a().mo219753b(VideoChatModuleDependency.m236630c(), this.f159768g);
            this.f159768g = null;
        }
    }

    /* renamed from: c */
    public void mo219105c() {
        if (this.f159763a.get() && !TextUtils.isEmpty(this.f159765d)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[destroy]", "close channel");
            mo219101a(this.f159765d);
            mo219104b(this.f159765d);
            mo219106c(this.f159765d);
            this.f159763a.set(false);
            this.f159764b = null;
        }
    }

    /* renamed from: d */
    public void mo219107d() {
        String c = VideoChatModuleDependency.m236630c();
        if (!TextUtils.isEmpty(c)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[closeUserChannel]", "userId=" + c);
            VcBizService.grootCloseChannel(ChannelMeta.GrootChannel.VC_TAB_USER_CHANNEL, c, new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.tab.widgets.C63317b.C633214 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VideoChatTab_VCTabChannelHelper", "[closeUserChannel3]", "onError:" + eVar.mo219902b());
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    PushGrootChannelStatusEntity pushGrootChannelStatusEntity = ((C60972f) obj).f152686a;
                    C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[closeUserChannel2]", "onSuccess status=" + pushGrootChannelStatusEntity);
                }
            });
        }
    }

    /* renamed from: f */
    public void mo219110f() {
        String c = VideoChatModuleDependency.m236630c();
        if (TextUtils.isEmpty(c)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[registerUserChannelStateListener]", "failed because userId is null.");
            return;
        }
        if (this.f159768g == null) {
            this.f159768g = $$Lambda$b$L3M5U64jHYtiSsR3Y8ADGfMeY.INSTANCE;
        }
        VideoChatPush.m249004a().mo219730a(c, this.f159768g);
    }

    /* renamed from: a */
    public void mo219098a() {
        this.f159765d = VideoChatModuleDependency.m236630c() + "_" + TimeZone.getDefault().getID();
    }

    /* renamed from: a */
    public void mo219100a(AbstractC63322a aVar) {
        this.f159764b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248018a(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[registerUserChannelStatusListener2]", "onPushChannelStatus: VC_TAB_USER_CHANNEL  " + pushGrootChannelStatusEntity.f152610b);
    }

    /* renamed from: c */
    public void mo219106c(String str) {
        if (!TextUtils.isEmpty(str) && this.f159767f != null) {
            VideoChatPush.m249004a().mo219753b(str, this.f159767f);
            this.f159767f = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m248021b(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[registerListChannelStatusListener2]", "onPushChannelStatus: VC_TAB_LIST_CHANNEL " + pushGrootChannelStatusEntity.f152610b);
    }

    /* renamed from: e */
    private void m248022e(String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[registerListCells]", "failed because channelId is null.");
            return;
        }
        if (this.f159766e == null) {
            this.f159766e = new VideoChatPush.AbstractC63563c(str) {
                /* class com.ss.android.vc.meeting.module.tab.widgets.$$Lambda$b$p_CtmU8_YPgga3MBCqBHHqDdLg */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63563c
                public final void onPushGrootCells(PushGrootCells pushGrootCells) {
                    C63317b.this.m248019a(this.f$1, pushGrootCells);
                }
            };
        }
        VideoChatPush.m249004a().mo219712a(this.f159766e);
        C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[registerListCells2]", "VC_TAB_LIST_CHANNEL success: listener= " + this.f159766e);
    }

    /* renamed from: b */
    public void mo219103b(int i) {
        String c = VideoChatModuleDependency.m236630c();
        if (!TextUtils.isEmpty(c)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[openUserChannel]", "userId= " + c);
            VcBizService.grootOpenChannel(ChannelMeta.GrootChannel.VC_TAB_USER_CHANNEL, VideoChatModuleDependency.m236630c(), i, new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.tab.widgets.C63317b.C633192 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[openUserChannel2]", "success");
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VideoChatTab_VCTabChannelHelper", "[openUserChannel3]", "onError:" + eVar.mo219902b());
                }
            });
        }
    }

    /* renamed from: d */
    public void mo219108d(String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[registerListChannelStatusListener]", "failed because channelId is null.");
            return;
        }
        if (this.f159767f == null) {
            this.f159767f = $$Lambda$b$qNYXeK_75PmFUfw1ExvLKkPcCJw.INSTANCE;
        }
        VideoChatPush.m249004a().mo219730a(str, this.f159767f);
    }

    /* renamed from: a */
    public void mo219099a(int i) {
        if (!this.f159763a.get() && !TextUtils.isEmpty(this.f159765d)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[start]", "open groot channel.");
            mo219108d(this.f159765d);
            m248022e(this.f159765d);
            mo219102a(this.f159765d, VideoChatModuleDependency.m236630c(), i);
        }
    }

    /* renamed from: b */
    public void mo219104b(String str) {
        if (!TextUtils.isEmpty(str) && this.f159766e != null) {
            VideoChatPush.m249004a().mo219735b(this.f159766e);
            this.f159766e = null;
        }
    }

    /* renamed from: a */
    public void mo219101a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[closeListChannel]", "channelId=" + str);
            VcBizService.grootCloseChannel(ChannelMeta.GrootChannel.VC_TAB_LIST_CHANNEL, str, new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.tab.widgets.C63317b.C633203 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VideoChatTab_VCTabChannelHelper", "[closeListChannel2]", "error = " + eVar.mo219902b());
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[closeListChannel2]", "onSuccess = " + ((C60972f) obj).f152686a);
                    C63317b.this.f159763a.set(false);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m248019a(String str, PushGrootCells pushGrootCells) {
        AbstractC63322a aVar;
        List<GrootCell> list = pushGrootCells.cells;
        ChannelMeta channelMeta = pushGrootCells.channel_meta;
        if (channelMeta != null && TextUtils.equals(channelMeta.channelId, str) && !CollectionUtils.isEmpty(list) && channelMeta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_LIST_CHANNEL && (aVar = this.f159764b) != null) {
            aVar.mo219014b(list);
        }
    }

    /* renamed from: a */
    public void mo219102a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[openListChannel]", "failed because channelId is null.");
            return;
        }
        C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[openListChannel2]", "channelId=" + str + " userId= " + str2 + " version= " + i);
        VcBizService.openVCTabGrootChannel(ChannelMeta.GrootChannel.VC_TAB_LIST_CHANNEL, str, str2, i, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab.widgets.C63317b.C633181 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("VideoChatTab_VCTabChannelHelper", "[openListChannel3]", "success.");
                if (C63317b.this.f159764b != null) {
                    C63317b.this.f159764b.mo219015c();
                }
                C63317b.this.f159763a.set(true);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VCTabChannelHelper", "[openListChannel4]", "error= " + eVar.mo219902b());
                if (C63317b.this.f159764b != null) {
                    C63317b.this.f159764b.mo219016d();
                }
            }
        });
    }
}
