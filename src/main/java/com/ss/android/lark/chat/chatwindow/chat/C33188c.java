package com.ss.android.lark.chat.chatwindow.chat;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.base.view.p1603a.C32930d;
import com.ss.android.lark.chat.chatwindow.chat.C33188c;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.ICellHoverHandler;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.c */
public class C33188c implements ICellHoverHandler<ChatMessageVO> {

    /* renamed from: a */
    public final AbstractC33189a f85381a;

    /* renamed from: b */
    public boolean f85382b = true;

    /* renamed from: c */
    private final HandlerC33191c f85383c;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.c$a */
    public interface AbstractC33189a {
        /* renamed from: a */
        C32930d.C32932a mo122398a(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, AbstractC32928b<ChatMessageVO<?>> bVar2);

        /* renamed from: a */
        void mo122399a(ChatMessageVO cVar);

        /* renamed from: a */
        void mo122400a(String str, int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.c$c */
    public static class HandlerC33191c extends Handler {

        /* renamed from: a */
        public boolean f85390a;

        /* renamed from: b */
        private final WeakReference<C33188c> f85391b;

        /* renamed from: c */
        private C32930d f85392c;

        /* renamed from: d */
        private C36592a f85393d;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m128259b() {
            this.f85393d = null;
        }

        /* renamed from: a */
        public void mo122401a() {
            C36592a aVar = this.f85393d;
            if (aVar != null && aVar.isShowing()) {
                this.f85393d.dismiss();
            }
        }

        public HandlerC33191c(C33188c cVar) {
            this.f85391b = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        private static AbstractC32928b<ChatMessageVO<?>> m128254a(int i) {
            return new AbstractC32928b(i) {
                /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$c$c$o2Li5krgkEdUZhAC9uYwNYqMxg */
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b
                public final boolean accept(C34029b bVar, Object obj) {
                    return C33188c.HandlerC33191c.m128257a(this.f$0, bVar, (ChatMessageVO) obj);
                }
            };
        }

        public void handleMessage(Message message) {
            C33188c cVar = this.f85391b.get();
            if (cVar != null) {
                int i = message.what;
                if (i != 9) {
                    if (i != 10) {
                        switch (i) {
                            case 100:
                                mo122401a();
                                return;
                            case 101:
                                C32930d dVar = this.f85392c;
                                if (dVar != null && dVar.mo121599e()) {
                                    this.f85392c.mo121597c();
                                    return;
                                }
                                return;
                            case 102:
                                cVar.f85382b = true;
                                return;
                            default:
                                return;
                        }
                    } else if (cVar.f85382b) {
                        C32930d dVar2 = this.f85392c;
                        if (dVar2 != null && dVar2.mo121599e()) {
                            if (!this.f85390a) {
                                this.f85392c.mo121597c();
                            } else {
                                this.f85392c.mo121595a(new View.OnHoverListener() {
                                    /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$c$c$e6BO_gnm4ZNCdvo4RSRVhy3rk */

                                    public final boolean onHover(View view, MotionEvent motionEvent) {
                                        return C33188c.HandlerC33191c.this.m128258a(view, motionEvent);
                                    }
                                });
                            }
                        }
                        mo122401a();
                    }
                } else if (cVar.f85382b) {
                    C33190b bVar = (C33190b) message.obj;
                    if (bVar.f85389f == 1 || bVar.f85389f == 2) {
                        C32930d dVar3 = this.f85392c;
                        if (dVar3 != null && dVar3.mo121599e()) {
                            this.f85392c.mo121597c();
                            this.f85392c = null;
                        }
                        m128255a(bVar.f85384a, bVar.f85389f);
                        return;
                    }
                    mo122401a();
                    mo122402a(cVar, bVar);
                }
            }
        }

        /* renamed from: a */
        private static int m128253a(AbstractC59004b bVar, int i) {
            return bVar.hashCode() + i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m128256a(C33190b bVar, C33188c cVar) {
            bVar.f85386c.f146209n.setSelected(false);
            cVar.f85382b = true;
            this.f85392c = null;
        }

        /* renamed from: a */
        private void m128255a(View view, int i) {
            String str;
            if (i == 1) {
                str = UIHelper.getString(R.string.Lark_Legacy_ReplyNow);
            } else {
                str = UIHelper.getString(R.string.Lark_Legacy_MoreAction);
            }
            C36592a aVar = this.f85393d;
            if (aVar == null || aVar.mo134994a() != i) {
                mo122401a();
                C36592a a = new C36592a.C36593a().mo135002a(str).mo135003a(view.getContext());
                this.f85393d = a;
                a.mo134995a(i);
                this.f85393d.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$c$c$XgMl1strECbjv8XWCCUnSUDUVFk */

                    public final void onDismiss() {
                        C33188c.HandlerC33191c.this.m128259b();
                    }
                });
            }
            this.f85393d.mo134997a(view, -6, 4);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ boolean m128258a(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 10) {
                return false;
            }
            sendEmptyMessageDelayed(101, 300);
            return false;
        }

        /* renamed from: a */
        public void mo122402a(C33188c cVar, C33190b bVar) {
            boolean z;
            C32930d dVar = this.f85392c;
            if (dVar != null) {
                if (((Integer) dVar.mo121598d()).intValue() == m128253a(bVar.f85385b, bVar.f85389f)) {
                    removeMessages(10);
                    removeMessages(101);
                    return;
                } else if (this.f85392c.mo121599e()) {
                    this.f85392c.mo121597c();
                }
            }
            C32930d.C32932a a = cVar.f85381a.mo122398a(bVar.f85385b, bVar.f85386c, bVar.f85387d, m128254a(bVar.f85389f));
            if (a != null) {
                if (bVar.f85389f == 2) {
                    z = true;
                } else {
                    z = false;
                }
                a.mo121609a(z);
                a.mo121612b(false);
                a.mo121608a(Integer.valueOf(m128253a(bVar.f85385b, bVar.f85389f)));
                this.f85392c = a.mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d(bVar, cVar) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$c$c$0xib7xJ8pPNPYHv8qiTnRxgvGE */
                    public final /* synthetic */ C33188c.C33190b f$1;
                    public final /* synthetic */ C33188c f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
                    public final void onDismiss() {
                        C33188c.HandlerC33191c.this.m128256a((C33188c.HandlerC33191c) this.f$1, (C33188c.C33190b) this.f$2);
                    }
                }).mo121611a();
                if (bVar.f85389f == 2) {
                    cVar.f85382b = false;
                }
                this.f85390a = false;
                this.f85392c.mo121595a(new View.OnHoverListener() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.C33188c.HandlerC33191c.View$OnHoverListenerC331921 */

                    public boolean onHover(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 9) {
                            HandlerC33191c.this.f85390a = true;
                        } else if (motionEvent.getAction() == 10) {
                            HandlerC33191c.this.f85390a = false;
                        }
                        return false;
                    }
                });
                int screenHeight = DeviceUtils.getScreenHeight(bVar.f85384a.getContext());
                int[] a2 = DesktopUtil.m144302a(bVar.f85384a);
                int max = Math.max(DesktopUtil.m144302a(bVar.f85386c.f146209n)[0], a2[0] - UIHelper.dp2px(180.0f));
                if (a2[1] > UIHelper.dp2px(400.0f)) {
                    this.f85392c.mo121594a(true, 83, max, screenHeight - a2[1]);
                } else {
                    this.f85392c.mo121594a(false, 51, max, a2[1] + bVar.f85384a.getHeight());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ boolean m128257a(int i, C34029b bVar, ChatMessageVO cVar) {
            if (i == 0) {
                if (bVar.f87966a == 0) {
                    return true;
                }
                return false;
            } else if (i != 2) {
                return true;
            } else {
                if (bVar.f87966a == 0 || bVar.f87966a == 7) {
                    return false;
                }
                return true;
            }
        }
    }

    public C33188c(AbstractC33189a aVar) {
        this.f85381a = aVar;
        this.f85383c = new HandlerC33191c(this);
    }

    /* renamed from: b */
    public boolean mo122230b(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        return m128235a(bVar, eVar, cVar, 7);
    }

    /* renamed from: c */
    public boolean mo122226a(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        C32930d.C32932a a = this.f85381a.mo122398a(bVar, eVar, cVar, null);
        if (a == null) {
            return false;
        }
        for (C34029b bVar2 : a.mo121611a().mo121596b()) {
            if (bVar2.f87966a != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo122234c(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        return m128235a(bVar, eVar, cVar, 0);
    }

    /* renamed from: b */
    public void mo122228b(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        this.f85381a.mo122400a(cVar.mo121681a(), eVar.mo200148l());
    }

    /* renamed from: a */
    public void mo122232c(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        this.f85382b = false;
        this.f85383c.sendEmptyMessage(101);
        this.f85383c.sendEmptyMessageDelayed(102, 1000);
        this.f85381a.mo122399a(cVar);
    }

    /* renamed from: c */
    public void mo122222a(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        C33190b bVar2 = new C33190b(view, bVar, eVar, cVar, null, 2);
        this.f85383c.mo122401a();
        this.f85383c.mo122402a(this, bVar2);
    }

    /* renamed from: a */
    private boolean m128235a(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, int i) {
        C32930d.C32932a a = this.f85381a.mo122398a(bVar, eVar, cVar, null);
        if (a == null) {
            return false;
        }
        for (C34029b bVar2 : a.mo121611a().mo121596b()) {
            if (bVar2.f87966a == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.c$b */
    public static class C33190b {

        /* renamed from: a */
        public View f85384a;

        /* renamed from: b */
        public AbstractC59004b f85385b;

        /* renamed from: c */
        public AbstractC59010e f85386c;

        /* renamed from: d */
        public ChatMessageVO f85387d;

        /* renamed from: e */
        public MotionEvent f85388e;

        /* renamed from: f */
        public int f85389f;

        public C33190b(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, MotionEvent motionEvent, int i) {
            this.f85384a = view;
            this.f85385b = bVar;
            this.f85386c = eVar;
            this.f85387d = cVar;
            this.f85388e = motionEvent;
            this.f85389f = i;
        }
    }

    /* renamed from: a */
    public boolean mo122224a(View view, AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, MotionEvent motionEvent, int i) {
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            C33190b bVar2 = new C33190b(view, bVar, eVar, cVar, motionEvent, i);
            Message message = new Message();
            message.what = 9;
            message.obj = bVar2;
            this.f85383c.removeMessages(10);
            this.f85383c.removeMessages(9);
            this.f85383c.sendMessageDelayed(message, 150);
            return true;
        } else if (action != 10) {
            return true;
        } else {
            C33190b bVar3 = new C33190b(view, bVar, eVar, cVar, motionEvent, i);
            Message message2 = new Message();
            message2.what = 10;
            message2.obj = bVar3;
            this.f85383c.removeMessages(9);
            this.f85383c.sendMessageDelayed(message2, 500);
            return true;
        }
    }
}
