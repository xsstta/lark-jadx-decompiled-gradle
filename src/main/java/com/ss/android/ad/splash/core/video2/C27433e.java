package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.video2.C27439i;
import com.ss.android.ad.splash.utils.C27477g;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.video2.e */
public class C27433e {

    /* renamed from: d */
    private static volatile C27433e f68575d = null;

    /* renamed from: e */
    private static long f68576e = 500;

    /* renamed from: f */
    private static long f68577f = 3000;

    /* renamed from: a */
    public Timer f68578a;

    /* renamed from: b */
    public boolean f68579b;

    /* renamed from: c */
    public int f68580c;

    /* renamed from: g */
    private C27439i f68581g;

    /* renamed from: c */
    public void mo97980c() {
        this.f68579b = false;
        Timer timer = this.f68578a;
        if (timer != null) {
            timer.cancel();
            this.f68578a = null;
        }
    }

    /* renamed from: a */
    public static C27433e m100134a() {
        if (f68575d == null) {
            synchronized (C27433e.class) {
                if (f68575d == null) {
                    f68575d = new C27433e();
                }
            }
        }
        return f68575d;
    }

    /* renamed from: b */
    public void mo97979b() {
        C27439i iVar = this.f68581g;
        if (iVar != null) {
            iVar.mo97988e();
            this.f68581g = null;
        }
        Timer timer = this.f68578a;
        if (timer != null) {
            timer.cancel();
            this.f68578a = null;
        }
    }

    /* renamed from: a */
    public void mo97975a(C27331b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", 0);
            jSONObject2.putOpt("play_order", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", bVar.mo97511x());
            jSONObject.put("ad_fetch_time", bVar.mo97491f());
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", "mute", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo97976a(C27331b bVar, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", new DecimalFormat("0.0000").format((double) f));
            jSONObject2.putOpt("play_order", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", bVar.mo97511x());
            jSONObject.put("ad_fetch_time", bVar.mo97491f());
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", "unmute", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo97977a(C27331b bVar, Context context) {
        if (bVar.ak() != 0) {
            if (this.f68581g == null) {
                this.f68581g = new C27439i(context);
            }
            int b = this.f68581g.mo97985b();
            int a = this.f68581g.mo97983a();
            this.f68580c = a;
            float f = (((float) a) * 1.0f) / ((float) b);
            if (f == BitmapDescriptorFactory.HUE_RED) {
                mo97975a(bVar);
            } else {
                mo97976a(bVar, f);
            }
            this.f68579b = false;
            this.f68581g.mo97984a(new C27439i.AbstractC27441b(f, b, bVar) {
                /* class com.ss.android.ad.splash.core.video2.C27433e.C274341 */

                /* renamed from: a */
                float f68582a;

                /* renamed from: b */
                final /* synthetic */ float f68583b;

                /* renamed from: c */
                final /* synthetic */ int f68584c;

                /* renamed from: d */
                final /* synthetic */ C27331b f68585d;

                @Override // com.ss.android.ad.splash.core.video2.C27439i.AbstractC27441b
                /* renamed from: a */
                public void mo97981a(int i) {
                    if (!C27433e.this.f68579b) {
                        float f = this.f68582a;
                        if (f == BitmapDescriptorFactory.HUE_RED && i > 0) {
                            float f2 = (((float) i) * 1.0f) / ((float) this.f68584c);
                            this.f68582a = f2;
                            C27433e.this.mo97976a(this.f68585d, f2);
                        } else if (f > BitmapDescriptorFactory.HUE_RED && i == 0) {
                            this.f68582a = (float) i;
                            C27433e.this.mo97975a(this.f68585d);
                        }
                    }
                }

                {
                    this.f68583b = r2;
                    this.f68584c = r3;
                    this.f68585d = r4;
                    this.f68582a = r2;
                }
            });
            C27477g.m100326a("SplashAdSdk", "Init volume:" + this.f68580c);
            this.f68581g.mo97987d();
        }
    }

    /* renamed from: a */
    public void mo97978a(final AbstractC27436f fVar, int i, long j) {
        C27439i iVar;
        if (fVar == null || (iVar = this.f68581g) == null || j <= f68577f) {
            if (fVar != null) {
                fVar.mo97921a(true);
            }
        } else if (i == 0) {
            fVar.mo97921a(true);
        } else if (i == 1) {
            fVar.mo97921a(false);
            fVar.mo97916a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else if (i == 2) {
            fVar.mo97921a(false);
            this.f68578a = new Timer();
            this.f68579b = true;
            final float a = (((float) this.f68581g.mo97983a()) * 1.0f) / ((float) f68577f);
            if (a > BitmapDescriptorFactory.HUE_RED) {
                this.f68578a.schedule(new TimerTask() {
                    /* class com.ss.android.ad.splash.core.video2.C27433e.C274352 */

                    public void run() {
                        try {
                            float g = a * ((float) fVar.mo97929g());
                            if (g >= ((float) C27433e.this.f68580c)) {
                                fVar.mo97916a((float) C27433e.this.f68580c, (float) C27433e.this.f68580c);
                                C27433e.this.f68578a.cancel();
                                return;
                            }
                            fVar.mo97916a(g, g);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, 0, f68576e);
            }
        } else if (i != 3) {
            if (i == 4) {
                int a2 = iVar.mo97983a();
                fVar.mo97921a(true);
                float f = ((float) a2) * 1.0f;
                fVar.mo97916a(f, f);
            }
            fVar.mo97921a(true);
        } else {
            int a3 = iVar.mo97983a();
            fVar.mo97921a(false);
            float f2 = ((float) a3) * 1.0f;
            fVar.mo97916a(f2, f2);
        }
    }
}
