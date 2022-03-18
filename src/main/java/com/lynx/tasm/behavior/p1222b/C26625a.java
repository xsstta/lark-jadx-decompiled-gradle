package com.lynx.tasm.behavior.p1222b;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.lynx.tasm.animation.C26562a;
import com.lynx.tasm.animation.p1217a.C26563a;
import com.lynx.tasm.behavior.p1222b.C26630b;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.utils.C26959m;
import java.util.HashMap;

/* renamed from: com.lynx.tasm.behavior.b.a */
public class C26625a {

    /* renamed from: a */
    public final LynxUI f65902a;

    /* renamed from: b */
    public C26562a f65903b;

    /* renamed from: c */
    public volatile boolean f65904c;

    /* renamed from: d */
    public volatile boolean f65905d;

    /* renamed from: e */
    public HashMap<String, C26563a.AbstractC26566b> f65906e = new HashMap<>();

    /* renamed from: f */
    private int f65907f;

    /* renamed from: g */
    private ViewGroup f65908g;

    /* renamed from: h */
    private UIGroup f65909h;

    /* renamed from: i */
    private C26562a f65910i;

    /* renamed from: j */
    private C26562a f65911j;

    /* renamed from: k */
    private C26562a f65912k;

    /* renamed from: l */
    private String f65913l;

    /* renamed from: d */
    private boolean m96501d() {
        if (this.f65904c || this.f65905d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo94580a() {
        C26562a aVar;
        if (C26630b.m96516b().mo94598a() && !m96501d() && (aVar = this.f65912k) != null) {
            this.f65902a.mo95056a(aVar);
            if (this.f65902a.ax() != null) {
                this.f65902a.ax().mo94419h();
            }
        }
    }

    /* renamed from: c */
    private void m96499c() {
        ViewGroup viewGroup = (ViewGroup) this.f65902a.mo95039u().mo94692n().mo53300d().getRootView();
        View av = this.f65902a.av();
        av.getLocationInWindow(new int[2]);
        ViewParent parent = av.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(av);
        }
        viewGroup.addView(av);
        this.f65902a.mo95056a(this.f65910i);
        if (this.f65902a.ax() != null) {
            this.f65902a.ax().mo94419h();
        }
    }

    /* renamed from: b */
    public void mo94585b() {
        if (this.f65908g != null) {
            View av = this.f65902a.av();
            ViewGroup.LayoutParams layoutParams = av.getLayoutParams();
            ((ViewGroup) av.getParent()).removeView(av);
            int[] iArr = new int[2];
            this.f65908g.getLocationOnScreen(iArr);
            this.f65909h.mo33939a((LynxBaseUI) this.f65902a);
            this.f65909h.mo33940a((LynxBaseUI) this.f65902a, this.f65907f);
            this.f65902a.mo53590a(av.getLeft() + iArr[0], av.getTop() - iArr[1], layoutParams.width, layoutParams.height, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, this.f65902a.mo94936S());
        }
    }

    /* renamed from: a */
    public void mo94581a(C26562a aVar) {
        this.f65903b = aVar;
    }

    /* renamed from: b */
    public void mo94586b(C26562a aVar) {
        this.f65910i = aVar;
    }

    /* renamed from: c */
    public void mo94588c(C26562a aVar) {
        this.f65911j = aVar;
    }

    /* renamed from: d */
    public void mo94589d(C26562a aVar) {
        this.f65912k = aVar;
    }

    public C26625a(LynxUI lynxUI) {
        this.f65902a = lynxUI;
    }

    /* renamed from: b */
    public void mo94587b(String str) {
        this.f65913l = str;
        C26630b.m96516b().mo94597a(this.f65902a, str);
    }

    /* renamed from: a */
    public void mo94584a(String str) {
        C26563a.AbstractC26566b bVar = this.f65906e.get(str);
        if (bVar != null) {
            bVar.mo94426a(str);
            this.f65906e.remove(str);
        }
    }

    /* renamed from: a */
    public void mo94582a(final C26630b.AbstractC26634b bVar) {
        C26562a aVar;
        if (C26630b.m96516b().mo94598a() && !m96501d() && (aVar = this.f65903b) != null) {
            if (this.f65913l != null) {
                this.f65904c = true;
                m96500c(this.f65913l);
                this.f65906e.put(this.f65903b.mo94373a(), new C26563a.AbstractC26566b() {
                    /* class com.lynx.tasm.behavior.p1222b.C26625a.C266294 */

                    @Override // com.lynx.tasm.animation.p1217a.C26563a.AbstractC26566b
                    /* renamed from: a */
                    public void mo94426a(String str) {
                        C26625a.this.f65906e.remove(str);
                        C26625a.this.mo94585b();
                        C26630b.AbstractC26634b bVar = bVar;
                        if (bVar != null) {
                            bVar.mo94603a();
                        }
                        C26625a.this.f65904c = false;
                    }
                });
                return;
            }
            this.f65902a.mo95056a(aVar);
            if (this.f65902a.ax() != null) {
                this.f65902a.ax().mo94419h();
            }
        }
    }

    /* renamed from: c */
    private <T extends View> void m96500c(String str) {
        View a = C26630b.m96516b().mo94592a(str, this.f65902a);
        UIBody.UIBodyView d = this.f65902a.mo95039u().mo94692n().mo53300d();
        if (d != null) {
            View av = this.f65902a.av();
            if (a != null) {
                av.setVisibility(a.getVisibility());
                av.setAlpha(a.getAlpha());
                av.setTranslationX(a.getTranslationX());
                av.setTranslationY(a.getTranslationY());
                av.setRotation(a.getRotation());
                av.setRotationX(a.getRotationX());
                av.setRotationY(a.getRotationY());
                av.setScaleX(a.getScaleX());
                av.setScaleY(a.getScaleY());
                int width = a.getWidth();
                int height = a.getHeight();
                if (d.getRootView() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) d.getRootView();
                    if (av.getParent() != null) {
                        ViewGroup viewGroup2 = (ViewGroup) av.getParent();
                        this.f65908g = viewGroup2;
                        int childCount = viewGroup2.getChildCount();
                        int i = 0;
                        while (true) {
                            if (i >= childCount) {
                                break;
                            } else if (av == this.f65908g.getChildAt(i)) {
                                this.f65907f = i;
                                break;
                            } else {
                                i++;
                            }
                        }
                        this.f65908g.removeView(av);
                        this.f65909h = (UIGroup) this.f65902a.mo94920C();
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(width, height);
                    int[] iArr = new int[2];
                    a.getLocationInWindow(iArr);
                    marginLayoutParams.setMargins(iArr[0], iArr[1], 0, 0);
                    viewGroup.addView(av, marginLayoutParams);
                    C26959m.m97969a(new Runnable() {
                        /* class com.lynx.tasm.behavior.p1222b.C26625a.RunnableC266261 */

                        public void run() {
                            C26625a.this.f65902a.mo95056a(C26625a.this.f65903b);
                            C26625a.this.f65902a.mo95040v();
                        }
                    });
                    return;
                }
                return;
            }
            C26959m.m97969a(new Runnable() {
                /* class com.lynx.tasm.behavior.p1222b.C26625a.RunnableC266272 */

                public void run() {
                    C26625a.this.f65902a.mo95056a(C26625a.this.f65903b);
                    if (C26625a.this.f65902a.ax() != null) {
                        C26625a.this.f65902a.ax().mo94419h();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo94583a(final C26630b.AbstractC26635c cVar) {
        C26562a aVar;
        if (C26630b.m96516b().mo94598a() && !m96501d() && (aVar = this.f65910i) != null) {
            this.f65906e.put(aVar.mo94373a(), new C26563a.AbstractC26566b() {
                /* class com.lynx.tasm.behavior.p1222b.C26625a.C266283 */

                @Override // com.lynx.tasm.animation.p1217a.C26563a.AbstractC26566b
                /* renamed from: a */
                public void mo94426a(String str) {
                    C26625a.this.f65906e.remove(str);
                    View av = C26625a.this.f65902a.av();
                    ViewParent parent = av.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(av);
                    }
                    C26630b.AbstractC26635c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo94604a();
                    }
                    C26625a.this.f65905d = false;
                }
            });
            if (this.f65913l != null) {
                this.f65905d = true;
                m96499c();
                return;
            }
            this.f65902a.mo95056a(this.f65910i);
            if (this.f65902a.ax() != null) {
                this.f65902a.ax().mo94419h();
            }
        }
    }
}
