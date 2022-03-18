package com.ss.android.lark.player.widget;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.p2511a.AbstractC52085g;
import com.ss.android.lark.player.p2511a.AbstractC52086h;
import com.ss.android.lark.player.p2511a.AbstractC52087i;
import com.ss.android.lark.player.p2511a.AbstractC52091j;
import com.ss.android.lark.player.p2511a.AbstractC52094m;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import com.ss.android.lark.player.p2511a.C52072c;
import com.ss.android.lark.player.p2511a.C52073d;
import com.ss.android.lark.player.p2512b.AbstractC52096b;
import com.ss.android.lark.player.p2512b.AbstractC52098d;
import com.ss.android.lark.player.p2512b.C52099e;
import com.ss.android.lark.player.p2512b.C52100f;
import com.ss.android.lark.player.p2515d.AbstractC52127b;
import com.ss.android.lark.player.p2515d.C52126a;

public class SuperContainer extends FrameLayout {

    /* renamed from: a */
    public AbstractC52091j f129347a;

    /* renamed from: b */
    public AbstractC52085g f129348b;

    /* renamed from: c */
    private FrameLayout f129349c;

    /* renamed from: d */
    private C52072c f129350d;

    /* renamed from: e */
    private AbstractC52098d f129351e;

    /* renamed from: f */
    private AbstractC52094m f129352f;

    /* renamed from: g */
    private AbstractC52087i f129353g;

    /* renamed from: h */
    private C52126a f129354h;

    /* renamed from: i */
    private GestureDetector f129355i;

    /* renamed from: j */
    private AbstractC52091j f129356j;

    /* renamed from: k */
    private AbstractC52087i.AbstractC52090c f129357k;

    /* renamed from: l */
    private AbstractC52127b f129358l;

    /* renamed from: m */
    private AbstractC52096b f129359m;

    public AbstractC52091j getOnReceiverEventListener() {
        return this.f129347a;
    }

    public AbstractC52094m getStateGetter() {
        return this.f129352f;
    }

    /* renamed from: b */
    private void m202245b() {
        this.f129350d.mo178445a();
    }

    /* renamed from: c */
    private void m202247c() {
        FrameLayout frameLayout = this.f129349c;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* renamed from: a */
    public void mo178585a() {
        AbstractC52087i iVar = this.f129353g;
        if (iVar != null) {
            iVar.mo178462b(this.f129357k);
        }
        this.f129351e.mo178472a();
        m202247c();
        m202245b();
    }

    public void setOnReceiverEventListener(AbstractC52091j jVar) {
        this.f129347a = jVar;
    }

    public void setStateGetter(AbstractC52094m mVar) {
        this.f129352f = mVar;
    }

    public SuperContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m202244a(Context context) {
        m202246b(context);
        m202248c(context);
        m202249d(context);
        m202250e(context);
    }

    /* renamed from: b */
    private void m202246b(Context context) {
        this.f129351e = new C52100f(new C52099e(this.f129359m));
    }

    /* renamed from: c */
    private void m202248c(Context context) {
        this.f129354h = new C52126a(this.f129358l);
        this.f129355i = new GestureDetector(context, this.f129354h);
    }

    /* renamed from: d */
    private void m202249d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f129349c = frameLayout;
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: e */
    private void m202250e(Context context) {
        C52072c cVar = new C52072c();
        this.f129350d = cVar;
        addView(cVar.mo178444a(context), new ViewGroup.LayoutParams(-1, -1));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f129354h.mo178543a(motionEvent);
        }
        return this.f129355i.onTouchEvent(motionEvent);
    }

    public final void setRenderView(View view) {
        m202247c();
        this.f129349c.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    /* renamed from: a */
    public void mo178587a(AbstractC52086h hVar) {
        hVar.mo178437a(this.f129356j);
        hVar.mo178438a(this.f129352f);
        if (hVar instanceof AbstractView$OnAttachStateChangeListenerC52070a) {
            AbstractView$OnAttachStateChangeListenerC52070a aVar = (AbstractView$OnAttachStateChangeListenerC52070a) hVar;
            this.f129350d.mo178446a(aVar);
            Log.m165379d("SuperContainer", "on cover attach : " + aVar.mo178443l() + " ," + aVar.mo178433i());
        }
    }

    public final void setReceiverGroup(AbstractC52087i iVar) {
        if (iVar != null && !iVar.equals(this.f129353g)) {
            m202245b();
            AbstractC52087i iVar2 = this.f129353g;
            if (iVar2 != null) {
                iVar2.mo178462b(this.f129357k);
            }
            this.f129353g = iVar;
            this.f129348b = new C52073d(iVar);
            this.f129353g.mo178459a(new AbstractC52087i.AbstractC52088a() {
                /* class com.ss.android.lark.player.widget.SuperContainer.C521395 */

                @Override // com.ss.android.lark.player.p2511a.AbstractC52087i.AbstractC52088a
                /* renamed from: a */
                public void mo178457a(AbstractC52086h hVar) {
                    SuperContainer.this.mo178587a(hVar);
                }
            });
            this.f129353g.mo178461a(this.f129357k);
        }
    }

    /* renamed from: a */
    public void mo178586a(int i, Bundle bundle) {
        AbstractC52085g gVar = this.f129348b;
        if (gVar != null) {
            gVar.mo178452b(i, bundle);
        }
    }

    public SuperContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public void mo178588b(int i, Bundle bundle) {
        AbstractC52085g gVar = this.f129348b;
        if (gVar != null) {
            gVar.mo178448a(i, bundle);
        }
    }

    public SuperContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f129356j = new AbstractC52091j() {
            /* class com.ss.android.lark.player.widget.SuperContainer.C521351 */

            @Override // com.ss.android.lark.player.p2511a.AbstractC52091j
            /* renamed from: a */
            public void mo178464a(int i, Bundle bundle) {
                if (SuperContainer.this.f129347a != null) {
                    SuperContainer.this.f129347a.mo178464a(i, bundle);
                }
                if (SuperContainer.this.f129348b != null) {
                    SuperContainer.this.f129348b.mo178454c(i, bundle);
                }
            }
        };
        this.f129357k = new AbstractC52087i.AbstractC52090c() {
            /* class com.ss.android.lark.player.widget.SuperContainer.C521362 */

            @Override // com.ss.android.lark.player.p2511a.AbstractC52087i.AbstractC52090c
            /* renamed from: a */
            public void mo178463a(String str, AbstractC52086h hVar) {
                SuperContainer.this.mo178587a(hVar);
            }
        };
        this.f129358l = new AbstractC52127b() {
            /* class com.ss.android.lark.player.widget.SuperContainer.C521373 */

            @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
            /* renamed from: d */
            public void mo127027d() {
                if (SuperContainer.this.f129348b != null) {
                    SuperContainer.this.f129348b.mo178447a();
                }
            }

            @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
            /* renamed from: a */
            public void mo127015a(MotionEvent motionEvent) {
                if (SuperContainer.this.f129348b != null) {
                    SuperContainer.this.f129348b.mo178450a(motionEvent);
                }
            }

            @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
            /* renamed from: b */
            public void mo127022b(MotionEvent motionEvent) {
                if (SuperContainer.this.f129348b != null) {
                    SuperContainer.this.f129348b.mo178456d(motionEvent);
                }
            }

            @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
            /* renamed from: c */
            public void mo127026c(MotionEvent motionEvent) {
                if (SuperContainer.this.f129348b != null) {
                    SuperContainer.this.f129348b.mo178453b(motionEvent);
                }
            }

            @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
            /* renamed from: d */
            public void mo127028d(MotionEvent motionEvent) {
                if (SuperContainer.this.f129348b != null) {
                    SuperContainer.this.f129348b.mo178455c(motionEvent);
                }
            }

            @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
            /* renamed from: a */
            public void mo127016a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (SuperContainer.this.f129348b != null) {
                    SuperContainer.this.f129348b.mo178451a(motionEvent, motionEvent2, f, f2);
                }
            }
        };
        this.f129359m = new AbstractC52096b() {
            /* class com.ss.android.lark.player.widget.SuperContainer.C521384 */
        };
        m202244a(context);
    }
}
