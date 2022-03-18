package com.ss.android.lark.chatbase.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.PopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.chat.api.service.IMessageService;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.utils.C34332b;
import com.ss.android.lark.chatbase.view.C34443a;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.chatbase.view.a */
public class C34443a {

    /* renamed from: com.ss.android.lark.chatbase.view.a$b */
    public interface AbstractC34447b {
        /* renamed from: a */
        Message mo127180a();

        /* renamed from: a */
        Message mo127181a(int i);

        /* renamed from: a */
        boolean mo127182a(View view);

        /* renamed from: b */
        boolean mo127183b();

        /* renamed from: c */
        int mo127184c();

        /* renamed from: d */
        int mo127185d();
    }

    /* renamed from: com.ss.android.lark.chatbase.view.a$a */
    public static class C34446a implements C36894a.AbstractC36896a {

        /* renamed from: a */
        final AbstractC58321a f88947a;

        /* renamed from: b */
        final Handler f88948b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        final IMessageService f88949c = C32848e.m126401b();

        /* renamed from: d */
        Message f88950d;

        /* renamed from: e */
        final boolean f88951e;

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: a */
        public void mo122673a() {
            this.f88948b.post(new Runnable() {
                /* class com.ss.android.lark.chatbase.view.$$Lambda$a$a$vROSNuHnlUcH3WNd_RRr7WbrkxE */

                public final void run() {
                    C34443a.C34446a.this.m133614f();
                }
            });
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: b */
        public void mo122675b() {
            Handler handler = this.f88948b;
            AbstractC58321a aVar = this.f88947a;
            aVar.getClass();
            handler.post(new Runnable() {
                /* class com.ss.android.lark.chatbase.view.$$Lambda$2iJNJbGriVfkLe7XmtCay75Vvs */

                public final void run() {
                    AbstractC58321a.this.mo136736c();
                }
            });
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: c */
        public void mo122676c() {
            Handler handler = this.f88948b;
            AbstractC58321a aVar = this.f88947a;
            aVar.getClass();
            handler.post(new Runnable() {
                /* class com.ss.android.lark.chatbase.view.$$Lambda$ptZG4jpfHWxUa7Yd_7P5Atr0RzQ */

                public final void run() {
                    AbstractC58321a.this.mo136737d();
                }
            });
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: d */
        public void mo122677d() {
            Handler handler = this.f88948b;
            AbstractC58321a aVar = this.f88947a;
            aVar.getClass();
            handler.post(new Runnable() {
                /* class com.ss.android.lark.chatbase.view.$$Lambda$3vNJatTB3UQjaGXXjk9G1y0S54 */

                public final void run() {
                    AbstractC58321a.this.mo136735b();
                }
            });
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: e */
        public void mo122678e() {
            Handler handler = this.f88948b;
            AbstractC58321a aVar = this.f88947a;
            aVar.getClass();
            handler.post(new Runnable() {
                /* class com.ss.android.lark.chatbase.view.$$Lambda$3vNJatTB3UQjaGXXjk9G1y0S54 */

                public final void run() {
                    AbstractC58321a.this.mo136735b();
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m133614f() {
            Message message = this.f88950d;
            if (message != null) {
                this.f88949c.mo121088a(message, this.f88951e);
            }
            this.f88947a.mo136734a();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m133613b(float f) {
            this.f88947a.setProgress(f);
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: a */
        public void mo122674a(float f) {
            this.f88948b.post(new Runnable(f) {
                /* class com.ss.android.lark.chatbase.view.$$Lambda$a$a$aKOszXl6iv86KxGPmDaPUoPyJEU */
                public final /* synthetic */ float f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C34443a.C34446a.this.m133613b(this.f$1);
                }
            });
        }

        public C34446a(AbstractC58321a aVar, Message message, boolean z) {
            this.f88947a = aVar;
            this.f88950d = message;
            this.f88951e = z;
        }
    }

    /* renamed from: a */
    public static int m133603a(int i, int i2, int i3) {
        int i4 = ((i / 1000) - 1) / 10;
        if (i4 > 6) {
            i4 = 6;
        }
        return UIHelper.dp2px((float) (i2 + (i4 * i3)));
    }

    /* renamed from: a */
    public static void m133605a(AbstractC58321a aVar, final AbstractC34447b bVar, boolean z) {
        final Message a = bVar.mo127180a();
        AudioContent audioContent = (AudioContent) a.getContent();
        C34332b.m133109a(a, z);
        aVar.setDuration(audioContent.getDuration());
        final C36913c a2 = C36913c.m145732a(aVar.getContext());
        aVar.setProgress(a2.mo136284a(audioContent.getLocalFilePath()));
        C344441 r2 = new C36913c.AbstractC36916a(aVar, a, bVar, audioContent) {
            /* class com.ss.android.lark.chatbase.view.C34443a.C344441 */

            /* renamed from: a */
            final /* synthetic */ AbstractC58321a f88939a;

            /* renamed from: b */
            final /* synthetic */ Message f88940b;

            /* renamed from: c */
            final /* synthetic */ AbstractC34447b f88941c;

            /* renamed from: d */
            final /* synthetic */ AudioContent f88942d;

            /* renamed from: e */
            private C34446a f88943e;

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: a */
            public C36894a.AbstractC36896a mo122663a() {
                return this.f88943e;
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: b */
            public String mo122664b() {
                return this.f88942d.getLocalFilePath();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: c */
            public int mo122665c() {
                return this.f88942d.getDuration();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: d */
            public int mo122666d() {
                return this.f88942d.getProgress();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: e */
            public String mo122667e() {
                return this.f88940b.getId();
            }

            {
                this.f88939a = r1;
                this.f88940b = r2;
                this.f88941c = r3;
                this.f88942d = r4;
                this.f88943e = new C34446a(r1, r2, r3.mo127183b());
            }
        };
        aVar.setTag(r2);
        a2.mo136287a(a.getcId(), r2);
        aVar.setListener(new AbstractC58321a.AbstractC58322a() {
            /* class com.ss.android.lark.chatbase.view.C34443a.C344452 */

            @Override // com.ss.android.lark.widget.audioview.AbstractC58321a.AbstractC58322a
            /* renamed from: b */
            public boolean mo122669b(View view) {
                return bVar.mo127182a(view);
            }

            @Override // com.ss.android.lark.widget.audioview.AbstractC58321a.AbstractC58322a
            /* renamed from: a */
            public void mo122668a(View view) {
                int c = bVar.mo127184c();
                ArrayList arrayList = new ArrayList();
                arrayList.add(a.getcId());
                if (a.getMeReadType() < 2 && !a.isFromMe()) {
                    int d = bVar.mo127185d();
                    for (int i = c + 1; i < d; i++) {
                        Message a = bVar.mo127181a(i);
                        if (a != null && a.getType() == Message.Type.AUDIO) {
                            if (a.getMeReadType() >= 2 || a.isFromMe()) {
                                break;
                            }
                            arrayList.add(a.getcId());
                        }
                    }
                }
                a2.mo136288a(arrayList);
            }
        });
    }

    /* renamed from: a */
    public static void m133604a(Context context, PopupWindow popupWindow, View view, boolean z) {
        int i;
        if (context != null && popupWindow != null) {
            if (z && !popupWindow.isShowing()) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (iArr[1] > UIHelper.dp2px(64.0f) + DeviceUtils.getStatusHeight(context)) {
                    i = iArr[1] - UIHelper.dp2px(64.0f);
                } else {
                    i = iArr[1] + UIHelper.dp2px(20.0f);
                }
                popupWindow.showAtLocation(view, 49, 0, i);
            } else if (!z) {
                popupWindow.dismiss();
            }
        }
    }
}
