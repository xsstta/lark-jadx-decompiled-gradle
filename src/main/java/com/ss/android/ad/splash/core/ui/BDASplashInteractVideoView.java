package com.ss.android.ad.splash.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ad.splash.core.AbstractC27353n;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.interact.AbstractC27324b;
import com.ss.android.ad.splash.core.interact.BDASplashVerticalViewPager;
import com.ss.android.ad.splash.core.interact.C27322a;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27333c;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.core.video2.AbstractC27436f;
import com.ss.android.ad.splash.core.video2.C27430c;
import java.util.HashMap;

public class BDASplashInteractVideoView extends RelativeLayout {

    /* renamed from: a */
    public BDASplashVerticalViewPager f68350a;

    /* renamed from: b */
    public C27322a f68351b;

    /* renamed from: c */
    public AbstractC27324b f68352c;

    /* renamed from: d */
    public AbstractC27353n f68353d;

    /* renamed from: e */
    public C27331b f68354e;

    /* renamed from: f */
    public int f68355f = 1;

    /* renamed from: g */
    public int f68356g = -1;

    /* renamed from: c */
    public void mo97723c() {
        C27322a aVar = this.f68351b;
        if (aVar != null) {
            aVar.mo97411a();
        }
    }

    public AbstractC27436f getBDAVideoController() {
        return getController();
    }

    private AbstractC27436f getController() {
        C27322a aVar = this.f68351b;
        if (aVar != null) {
            return aVar.mo97410a(this.f68355f);
        }
        return null;
    }

    /* renamed from: b */
    public void mo97722b() {
        if (getController() != null) {
            this.f68356g = 2;
            getController().mo97923b();
        }
        AbstractC27353n nVar = this.f68353d;
        if (nVar != null) {
            nVar.mo97593a(this.f68354e, 2 - this.f68355f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97720a() {
        this.f68350a = new BDASplashVerticalViewPager(getContext());
        C27322a aVar = new C27322a(getContext(), this.f68354e);
        this.f68351b = aVar;
        this.f68350a.setAdapter(aVar);
        this.f68350a.setEnableScroll(true);
        this.f68350a.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.ad.splash.core.ui.BDASplashInteractVideoView.C273711 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                AbstractC27436f a = BDASplashInteractVideoView.this.f68351b.mo97410a(BDASplashInteractVideoView.this.f68355f);
                if (a != null) {
                    a.mo97931i();
                    if (i == 0) {
                        HashMap<String, Object> hashMap = new HashMap<>(1);
                        hashMap.put("duration", Integer.valueOf(a.mo97929g()));
                        C27278b.m99171a().mo97296a(BDASplashInteractVideoView.this.f68354e, 0, "triggered", null, hashMap);
                    }
                }
                BDASplashInteractVideoView.this.f68355f = i;
                final AbstractC27436f a2 = BDASplashInteractVideoView.this.f68351b.mo97410a(BDASplashInteractVideoView.this.f68355f);
                if (a2 != null) {
                    if (i == 1) {
                        a2.mo97918a(new C27430c() {
                            /* class com.ss.android.ad.splash.core.ui.BDASplashInteractVideoView.C273711.C273721 */

                            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: b */
                            public void mo97177b() {
                                BDASplashInteractVideoView.this.f68353d.mo97591a();
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: f */
                            public void mo97734f() {
                                mo97964a(BDASplashInteractVideoView.this.f68354e, (HashMap<String, Object>) null, (HashMap<String, Object>) null);
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: g */
                            public void mo97736g() {
                                mo97963a(BDASplashInteractVideoView.this.f68354e, a2);
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: d */
                            public void mo97731d(int i) {
                                mo97958a(i, BDASplashInteractVideoView.this.f68354e, (HashMap<String, Object>) null, (HashMap<String, Object>) null);
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: e */
                            public void mo97732e(int i) {
                                mo97957a(i, BDASplashInteractVideoView.this.f68354e);
                            }

                            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: a */
                            public void mo97175a(int i) {
                                super.mo97175a(i);
                                BDASplashInteractVideoView.this.f68353d.mo97592a(BDASplashInteractVideoView.this.f68354e);
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: e */
                            public void mo97733e(int i, int i2) {
                                mo97961a(BDASplashInteractVideoView.this.f68354e, i, i2, BDASplashInteractVideoView.this.f68356g, null, null);
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: f */
                            public void mo97735f(int i, int i2) {
                                mo97956a(i, i2, BDASplashInteractVideoView.this.f68356g);
                            }
                        });
                    } else {
                        if (BDASplashInteractVideoView.this.f68353d != null) {
                            BDASplashInteractVideoView.this.f68353d.mo97595b();
                        }
                        BDASplashInteractVideoView.this.f68350a.setEnableScroll(false);
                        a2.mo97932j();
                        C273732 r1 = new C27430c() {
                            /* class com.ss.android.ad.splash.core.ui.BDASplashInteractVideoView.C273711.C273732 */

                            /* renamed from: b */
                            private boolean f68361b;

                            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: b */
                            public void mo97177b() {
                                BDASplashInteractVideoView.this.f68353d.mo97591a();
                            }

                            /* renamed from: k */
                            private HashMap<String, Object> m99822k() {
                                HashMap<String, Object> hashMap = new HashMap<>(1);
                                hashMap.put("position", 2);
                                return hashMap;
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: f */
                            public void mo97734f() {
                                if (!this.f68361b) {
                                    mo97964a(BDASplashInteractVideoView.this.f68354e, (HashMap<String, Object>) null, m99822k());
                                    this.f68361b = true;
                                }
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: d */
                            public void mo97731d(int i) {
                                mo97958a(i, BDASplashInteractVideoView.this.f68354e, (HashMap<String, Object>) null, m99822k());
                            }

                            @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: a */
                            public void mo97175a(int i) {
                                C27333c.C27334a a = new C27333c.C27334a().mo97527a(true).mo97524a(0, 0);
                                a.mo97529b(0);
                                if (BDASplashInteractVideoView.this.getBDAVideoController() != null) {
                                    a.mo97525a((long) BDASplashInteractVideoView.this.getBDAVideoController().mo97929g());
                                }
                                if (C27287e.m99255c()) {
                                    BDASplashInteractVideoView.this.f68353d.mo97599c(BDASplashInteractVideoView.this.f68354e, a.mo97528a());
                                } else {
                                    BDASplashInteractVideoView.this.f68353d.mo97592a(BDASplashInteractVideoView.this.f68354e);
                                }
                                super.mo97175a(i);
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.ss.android.ad.splash.core.video2.C27430c
                            /* renamed from: e */
                            public void mo97733e(int i, int i2) {
                                mo97961a(BDASplashInteractVideoView.this.f68354e, i, i2, BDASplashInteractVideoView.this.f68356g, null, m99822k());
                            }
                        };
                        r1.mo97174a();
                        a2.mo97918a(r1);
                    }
                    if (BDASplashInteractVideoView.this.f68352c != null) {
                        BDASplashInteractVideoView.this.f68352c.mo97244a(i);
                    }
                }
            }
        });
        this.f68350a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f68350a);
        this.f68350a.setCurrentItem(1);
    }

    public void setBreakReason(int i) {
        this.f68356g = i;
    }

    public void setSplashAdInteraction(AbstractC27353n nVar) {
        this.f68353d = nVar;
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.f68350a.setGestureDetector(gestureDetector);
    }

    public void setOnPageChangeListener(AbstractC27324b bVar) {
        if (bVar != null) {
            this.f68352c = bVar;
        }
    }

    public void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f68351b.mo97412a(layoutParams);
    }

    public BDASplashInteractVideoView(Context context) {
        super(context);
    }

    public void setMute(boolean z) {
        if (getController() != null) {
            getController().mo97921a(z);
        }
    }

    /* renamed from: a */
    public boolean mo97721a(C27331b bVar) {
        if (bVar.mo97445K() == null || bVar.mo97446L() == null) {
            return false;
        }
        this.f68354e = bVar;
        mo97720a();
        return true;
    }

    public BDASplashInteractVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BDASplashInteractVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
