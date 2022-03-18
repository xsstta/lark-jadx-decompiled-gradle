package com.ss.android.lark.inno.player.live.p1989a.p1995f;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.core.AbstractC39002c;
import com.ss.android.lark.inno.player.layer.PlayerLayerMode;
import com.ss.android.lark.inno.player.live.AbstractC39067e;
import com.ss.android.lark.inno.player.live.AbstractC39068f;
import com.ss.android.lark.inno.player.live.p1989a.p1995f.C39053d;
import com.ss.android.lark.inno.player.live.p1997b.C39063a;
import com.ss.android.lark.inno.player.live.p1997b.C39064b;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.widget.C39087c;
import com.ss.android.lark.inno.player.widget.PlayerOptionBottomDialog;
import com.ss.android.lark.inno.utils.C39093c;
import com.ss.android.lark.inno.utils.VcTimeUtils;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.p2288b.C45851c;
import io.reactivex.Observable;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.lark.inno.player.live.a.f.d */
public class C39053d extends AbstractC39002c<Object, AbstractC39047a> {

    /* renamed from: d */
    private final HandlerC39055a f100279d = new HandlerC39055a(this);

    /* renamed from: g */
    private void m154121g() {
        C39064b h = ((AbstractC39067e) mo142707b()).mo142890h();
        if (h != null) {
            ((AbstractC39047a) mo142710d()).mo142814a(h.mo142862d());
        }
    }

    /* renamed from: e */
    private void m154119e() {
        ((AbstractC39047a) this.f100186a).setDepend(new AbstractC39048b() {
            /* class com.ss.android.lark.inno.player.live.p1989a.p1995f.C39053d.C390541 */

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39048b
            /* renamed from: a */
            public AbstractC39068f mo142822a() {
                return ((AbstractC39067e) C39053d.this.mo142707b()).aH_();
            }

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39048b
            /* renamed from: c */
            public boolean mo142825c() {
                return ((AbstractC39067e) C39053d.this.mo142707b()).mo142887e();
            }

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39048b
            /* renamed from: d */
            public void mo142826d() {
                ((AbstractC39067e) C39053d.this.mo142707b()).mo142882a(PlayerLayerMode.FULL);
            }

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39048b
            /* renamed from: e */
            public void mo142827e() {
                ((AbstractC39067e) C39053d.this.mo142707b()).mo142882a(PlayerLayerMode.NORMAL);
            }

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39048b
            /* renamed from: b */
            public void mo142824b() {
                Integer num;
                C39064b h = ((AbstractC39067e) C39053d.this.mo142707b()).mo142890h();
                if (h != null) {
                    List<Integer> a = h.mo142858a();
                    int indexOf = a.indexOf(Integer.valueOf(h.mo142860b()));
                    List list = (List) Observable.fromIterable(h.mo142858a()).map($$Lambda$PzOZWxhsxVxc3HofrOKSa9Ez7xw.INSTANCE).toList().blockingGet();
                    if (((AbstractC39047a) C39053d.this.mo142710d()).getContext() instanceof FragmentActivity) {
                        FragmentActivity fragmentActivity = (FragmentActivity) ((AbstractC39047a) C39053d.this.mo142710d()).getContext();
                        String a2 = C45851c.m181647a(R.string.tools_xuanzeqingxidu);
                        if (indexOf == -1) {
                            num = null;
                        } else {
                            num = Integer.valueOf(indexOf);
                        }
                        C39087c.m154330a(a2, list, num, new PlayerOptionBottomDialog.Builder.OnItemClickListener(a) {
                            /* class com.ss.android.lark.inno.player.live.p1989a.p1995f.$$Lambda$d$1$5F2GnNqZO5xGU83pfVZnBGZDqM */
                            public final /* synthetic */ List f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.lark.inno.player.widget.PlayerOptionBottomDialog.Builder.OnItemClickListener
                            public final void onClick(DialogInterface$OnCancelListenerC1021b bVar, int i) {
                                C39053d.C390541.m270588lambda$5F2GnNqZO5xGU83pfVZnBGZDqM(C39053d.C390541.this, this.f$1, bVar, i);
                            }
                        }).mo5511a(fragmentActivity.getSupportFragmentManager(), "");
                    }
                }
            }

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39048b
            /* renamed from: a */
            public void mo142823a(int i) {
                ((AbstractC39067e) C39053d.this.mo142707b()).mo142885c(i);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m154128a(List list, DialogInterface$OnCancelListenerC1021b bVar, int i) {
                ((AbstractC39067e) C39053d.this.mo142707b()).c_(((Integer) list.get(i)).intValue());
                bVar.mo5513b();
            }
        });
        ((AbstractC39047a) this.f100186a).setVisibility(8);
        m154120f();
        this.f100279d.sendMessage(Message.obtain());
    }

    /* renamed from: f */
    private void m154120f() {
        C39064b h = ((AbstractC39067e) mo142707b()).mo142890h();
        if (h != null) {
            mo142831a(h);
        }
        C39063a i = ((AbstractC39067e) mo142707b()).mo142891i();
        if (i != null) {
            mo142830a(i);
        }
        ((AbstractC39047a) mo142710d()).mo142819b(((AbstractC39067e) mo142707b()).mo142887e());
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        mo142708b(C38943b.f100077b);
        mo142708b(C38943b.f100081f);
        mo142708b(C38943b.f100089n);
        mo142708b(C38942a.f100058d);
        mo142708b(C38942a.f100060f);
        mo142708b(C38942a.f100059e);
        mo142708b(C38942a.f100063i);
        mo142708b(C38942a.f100064j);
        mo142708b(C38942a.f100062h);
        mo142708b(C38942a.f100068n);
        mo142708b(C38942a.f100057c);
        mo142708b(C38942a.f100061g);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.inno.player.live.a.f.d$a */
    public static class HandlerC39055a extends Handler {

        /* renamed from: a */
        private WeakReference<C39053d> f100281a;

        public HandlerC39055a(C39053d dVar) {
            super(Looper.getMainLooper());
            this.f100281a = new WeakReference<>(dVar);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C39053d dVar = this.f100281a.get();
            if (dVar != null) {
                AbstractC39067e eVar = (AbstractC39067e) dVar.mo142707b();
                Log.d("LiveToolbarLayer", "handleMessage: " + eVar.mo142887e());
                if (dVar.mo142709c() && eVar.mo142887e() && eVar.mo142891i() != null) {
                    ((AbstractC39047a) dVar.mo142710d()).mo142815a(VcTimeUtils.m154338a(VcTimeUtils.Scene.Live, Math.max(C45899c.m181859a().getHostDepend().mo144642j() - eVar.mo142891i().f100302b, 0L)));
                }
                sendMessageDelayed(Message.obtain(), 500);
            }
        }
    }

    /* renamed from: a */
    public void mo142830a(C39063a aVar) {
        ((AbstractC39047a) this.f100186a).mo142818b(aVar.f100303c);
        ((AbstractC39047a) this.f100186a).mo142817b(aVar.f100301a);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i == C38943b.f100077b) {
            m154120f();
        }
        if (i == C38943b.f100081f) {
            ((AbstractC39047a) mo142710d()).mo142820c(true);
        } else if (i == C38943b.f100089n) {
            m154121g();
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
        if (i == C38942a.f100057c) {
            m154120f();
        }
        if (i == C38942a.f100058d) {
            ((AbstractC39047a) this.f100186a).mo142821d(((AbstractC39067e) mo142707b()).mo142887e());
        } else if (i == C38942a.f100060f || i == C38942a.f100059e || i == C38942a.f100063i || i == C38942a.f100064j) {
            ((AbstractC39047a) this.f100186a).mo142819b(false);
        } else if (i == C38942a.f100062h || i == C38942a.f100061g) {
            ((AbstractC39047a) this.f100186a).mo142819b(true);
        }
    }

    /* renamed from: a */
    public void mo142831a(C39064b bVar) {
        ((AbstractC39047a) this.f100186a).mo142813a(bVar.mo142860b());
        ((AbstractC39047a) this.f100186a).mo142814a(bVar.mo142862d());
        AbstractC39047a aVar = (AbstractC39047a) this.f100186a;
        boolean z = true;
        if (bVar.mo142861c().size() <= 1) {
            z = false;
        }
        aVar.mo142816a(z);
    }

    public C39053d(AbstractC39067e eVar, AbstractC39047a aVar) {
        super(eVar, aVar);
        m154119e();
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142656a(int i, Bundle bundle) {
        if (i == C38942a.f100068n && bundle != null && bundle.containsKey(CommonCode.MapKey.HAS_RESOLUTION)) {
            ((AbstractC39047a) mo142710d()).mo142813a(C39093c.m154343a((String) bundle.get(CommonCode.MapKey.HAS_RESOLUTION)));
        }
    }
}
