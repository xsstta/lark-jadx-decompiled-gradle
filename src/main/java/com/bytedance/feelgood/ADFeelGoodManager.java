package com.bytedance.feelgood;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.feelgood.p735a.C13910a;
import com.bytedance.feelgood.p735a.C13911b;
import com.bytedance.feelgood.p735a.C13912c;
import com.bytedance.feelgood.p735a.C13913d;
import com.bytedance.feelgood.p736b.AbstractC13917b;
import com.bytedance.feelgood.p736b.AbstractC13918c;
import com.bytedance.feelgood.p736b.C13916a;
import com.bytedance.feelgood.p737c.AbstractC13920a;
import com.bytedance.feelgood.p737c.AbstractC13926f;
import com.bytedance.feelgood.p737c.AbstractC13927g;
import com.bytedance.feelgood.p737c.C13921b;
import com.bytedance.feelgood.p737c.C13925e;
import com.huawei.hms.location.LocationRequest;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ADFeelGoodManager {

    /* renamed from: a */
    public Handler f36307a;

    /* renamed from: b */
    public Handler f36308b;

    /* renamed from: c */
    public boolean f36309c;

    /* renamed from: d */
    private AbstractC13917b f36310d;

    /* renamed from: e */
    private C13910a f36311e;

    /* renamed from: f */
    private DialogC13901a f36312f;

    /* renamed from: g */
    private FeelGoodLifecycle f36313g;

    /* renamed from: com.bytedance.feelgood.ADFeelGoodManager$a */
    public interface AbstractC13899a {
        /* renamed from: a */
        void mo51189a(int i, String str, Throwable th);

        /* renamed from: a */
        void mo51190a(C13913d dVar);
    }

    /* renamed from: com.bytedance.feelgood.ADFeelGoodManager$b */
    private static class C13900b {

        /* renamed from: a */
        public static final ADFeelGoodManager f36339a = new ADFeelGoodManager(null);
    }

    /* renamed from: a */
    public static ADFeelGoodManager m56278a() {
        return C13900b.f36339a;
    }

    /* renamed from: b */
    public C13910a mo51187b() {
        return this.f36311e;
    }

    public class FeelGoodLifecycle implements LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            ADFeelGoodManager.this.mo51188c();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {
            if (ADFeelGoodManager.this.f36307a != null) {
                ADFeelGoodManager.this.f36307a.removeCallbacksAndMessages(null);
                ADFeelGoodManager.this.f36307a = null;
            }
        }

        public FeelGoodLifecycle() {
        }
    }

    private ADFeelGoodManager() {
        this.f36313g = new FeelGoodLifecycle();
    }

    /* renamed from: c */
    public boolean mo51188c() {
        this.f36309c = false;
        Handler handler = this.f36307a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f36307a = null;
        }
        DialogC13901a aVar = this.f36312f;
        if (aVar == null) {
            return false;
        }
        aVar.mo51201a();
        C13921b.m56359b(this.f36312f);
        this.f36312f = null;
        return true;
    }

    /* synthetic */ ADFeelGoodManager(C138881 r1) {
        this();
    }

    /* renamed from: a */
    public void mo51181a(C13910a aVar) {
        this.f36311e = aVar;
    }

    /* renamed from: a */
    public void mo51185a(AbstractC13917b bVar) {
        this.f36310d = bVar;
        this.f36308b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: com.bytedance.feelgood.ADFeelGoodManager$1 */
    class C138881 implements AbstractC13899a {

        /* renamed from: a */
        final /* synthetic */ C13911b f36314a;

        /* renamed from: b */
        final /* synthetic */ AbstractC13919c f36315b;

        /* renamed from: c */
        final /* synthetic */ ADFeelGoodManager f36316c;

        @Override // com.bytedance.feelgood.ADFeelGoodManager.AbstractC13899a
        /* renamed from: a */
        public void mo51190a(C13913d dVar) {
            if (this.f36316c.f36307a == null) {
                this.f36316c.f36307a = new Handler();
            }
            if (!(dVar == null || dVar.f36390c == null)) {
                if (dVar.f36390c.f36391a != null && dVar.f36390c.f36391a.size() > 0) {
                    String str = dVar.f36390c.f36391a.get(0);
                    this.f36314a.mo51248a(str);
                    if (dVar.f36390c.f36393c.containsKey(str)) {
                        try {
                            this.f36314a.mo51250a(dVar.f36390c.f36393c.get(str).getJSONObject("survey_task"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    this.f36316c.mo51183a(this.f36314a, this.f36315b);
                } else if (dVar.f36390c.f36392b != null && dVar.f36390c.f36392b.size() > 0) {
                    String str2 = dVar.f36390c.f36392b.get(0);
                    this.f36314a.mo51248a(str2);
                    this.f36314a.mo51245a(-1.0d);
                    if (dVar.f36390c.f36393c.containsKey(str2)) {
                        JSONObject jSONObject = dVar.f36390c.f36393c.get(str2);
                        try {
                            this.f36314a.mo51250a(jSONObject.getJSONObject("survey_task"));
                            this.f36316c.f36307a.postDelayed(new Runnable() {
                                /* class com.bytedance.feelgood.ADFeelGoodManager.C138881.RunnableC138891 */

                                public void run() {
                                    C138881.this.f36316c.mo51183a(C138881.this.f36314a, C138881.this.f36315b);
                                }
                            }, (long) (jSONObject.getInt("delay_duration") * 1000));
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            AbstractC13919c cVar = this.f36315b;
            if (cVar != null) {
                cVar.mo51263a(true, dVar, LocationRequest.PRIORITY_HD_ACCURACY, "success");
            }
        }

        @Override // com.bytedance.feelgood.ADFeelGoodManager.AbstractC13899a
        /* renamed from: a */
        public void mo51189a(int i, String str, Throwable th) {
            Log.d("REPORT_RESPONSE_ERROR", str);
            AbstractC13919c cVar = this.f36315b;
            if (cVar != null) {
                cVar.mo51263a(false, null, i, str);
            }
        }
    }

    /* renamed from: a */
    public void mo51182a(final C13911b bVar, final AbstractC13926f fVar) {
        if (TextUtils.isEmpty(this.f36311e.mo51237c())) {
            this.f36311e.mo51234a(C13925e.m56366a());
        }
        Handler handler = this.f36307a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f36307a = null;
        }
        if ((this.f36312f == null || !this.f36309c) && bVar.mo51244a() != null) {
            this.f36309c = true;
            DialogC13901a aVar = new DialogC13901a(bVar.mo51244a(), this.f36311e, bVar);
            this.f36312f = aVar;
            aVar.mo51203a(fVar);
            this.f36312f.mo51209a(bVar.mo51251b());
            this.f36312f.mo51202a(new AbstractC13920a() {
                /* class com.bytedance.feelgood.ADFeelGoodManager.C138978 */

                @Override // com.bytedance.feelgood.p737c.AbstractC13920a
                /* renamed from: a */
                public void mo51196a(boolean z) {
                    if (!z) {
                        ADFeelGoodManager.this.f36309c = false;
                    }
                }
            });
            this.f36312f.getWindow().setBackgroundDrawable(new ColorDrawable(bVar.mo51253d()));
            this.f36312f.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.feelgood.ADFeelGoodManager.DialogInterface$OnDismissListenerC138989 */

                public void onDismiss(DialogInterface dialogInterface) {
                    DialogC13901a aVar = (DialogC13901a) dialogInterface;
                    aVar.mo51201a();
                    AbstractC13926f fVar = fVar;
                    if (fVar != null) {
                        fVar.mo51272a(aVar.mo51212b(), bVar.mo51255f());
                    }
                    ADFeelGoodManager.this.f36309c = false;
                }
            });
            if (bVar.mo51252c() > 0.0d) {
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) Math.ceil(bVar.mo51252c() * 1000.0d));
                this.f36312f.mo51208a(instance.getTime());
            }
            this.f36312f.mo51206a(C13915b.m56345a(this.f36311e.mo51236b()));
            if (bVar.mo51251b()) {
                C13921b.m56358a(this.f36312f);
            }
        }
    }

    /* renamed from: a */
    public void mo51183a(final C13911b bVar, final AbstractC13919c cVar) {
        if (TextUtils.isEmpty(this.f36311e.mo51237c())) {
            this.f36311e.mo51234a(C13925e.m56366a());
        }
        Handler handler = this.f36307a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f36307a = null;
        }
        if ((this.f36312f == null || !this.f36309c) && bVar.mo51244a() != null) {
            this.f36309c = true;
            DialogC13901a aVar = new DialogC13901a(bVar.mo51244a(), this.f36311e, bVar);
            this.f36312f = aVar;
            aVar.mo51204a(cVar);
            this.f36312f.mo51209a(bVar.mo51251b());
            this.f36312f.mo51202a(new AbstractC13920a() {
                /* class com.bytedance.feelgood.ADFeelGoodManager.C138956 */

                @Override // com.bytedance.feelgood.p737c.AbstractC13920a
                /* renamed from: a */
                public void mo51196a(boolean z) {
                    if (!z) {
                        ADFeelGoodManager.this.f36309c = false;
                    }
                }
            });
            this.f36312f.getWindow().setBackgroundDrawable(new ColorDrawable(bVar.mo51253d()));
            this.f36312f.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.feelgood.ADFeelGoodManager.DialogInterface$OnDismissListenerC138967 */

                public void onDismiss(DialogInterface dialogInterface) {
                    DialogC13901a aVar = (DialogC13901a) dialogInterface;
                    aVar.mo51201a();
                    AbstractC13919c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo51264a(aVar.mo51212b(), bVar.mo51255f());
                    }
                    ADFeelGoodManager.this.f36309c = false;
                }
            });
            if (bVar.mo51252c() > 0.0d) {
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) Math.ceil(bVar.mo51252c() * 1000.0d));
                this.f36312f.mo51208a(instance.getTime());
            }
            this.f36312f.mo51206a(C13915b.m56345a(this.f36311e.mo51236b()));
            if (bVar.mo51251b()) {
                C13921b.m56358a(this.f36312f);
            }
        }
    }

    /* renamed from: a */
    public void mo51186a(String str, Map<String, String> map, final AbstractC13927g gVar) {
        Map<String, String> map2;
        C13910a aVar = this.f36311e;
        if (aVar == null) {
            Log.e("ADFeelGoodManager", "ADFeelGoodConfig is null");
        } else if (this.f36310d == null) {
            Log.e("ADFeelGoodManager", "INetWorkService is null");
        } else {
            if (aVar.mo51242h() != null) {
                map2 = this.f36311e.mo51242h();
            } else {
                map2 = new HashMap<>();
            }
            if (map != null) {
                map2.putAll(map);
            }
            m56279a(str, new AbstractC13899a() {
                /* class com.bytedance.feelgood.ADFeelGoodManager.C138934 */

                @Override // com.bytedance.feelgood.ADFeelGoodManager.AbstractC13899a
                /* renamed from: a */
                public void mo51190a(C13913d dVar) {
                    AbstractC13927g gVar = gVar;
                    if (gVar != null) {
                        gVar.mo51277a(dVar);
                    }
                }

                @Override // com.bytedance.feelgood.ADFeelGoodManager.AbstractC13899a
                /* renamed from: a */
                public void mo51189a(int i, String str, Throwable th) {
                    Log.d("REPORT_RESPONSE_ERROR", str);
                    AbstractC13927g gVar = gVar;
                    if (gVar != null) {
                        gVar.mo51276a(i, str);
                    }
                }
            }, map2);
        }
    }

    /* renamed from: a */
    private void m56279a(String str, final AbstractC13899a aVar, Map<String, String> map) {
        if (this.f36311e.mo51236b() == null) {
            Log.e("ADFeelGoodManager", "ADFeelGoodConfig#getChannel() is null");
            return;
        }
        if (TextUtils.isEmpty(this.f36311e.mo51237c())) {
            this.f36311e.mo51234a(C13925e.m56366a());
        }
        String a = C13912c.m56343a(this.f36311e, str, map);
        String b = C13915b.m56346b(this.f36311e.mo51236b());
        String c = C13915b.m56347c(this.f36311e.mo51236b());
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        hashMap.put("Origin", c);
        hashMap.put("Referer", c);
        hashMap.put("x-feelgood-api-version", "v2");
        try {
            this.f36310d.mo51261a(b, hashMap, a, new AbstractC13918c() {
                /* class com.bytedance.feelgood.ADFeelGoodManager.C138902 */

                @Override // com.bytedance.feelgood.p736b.AbstractC13918c
                /* renamed from: a */
                public void mo51192a(final C13916a aVar) {
                    if (aVar != null) {
                        ADFeelGoodManager.this.f36308b.post(new Runnable() {
                            /* class com.bytedance.feelgood.ADFeelGoodManager.C138902.RunnableC138911 */

                            public void run() {
                                aVar.mo51190a(C13913d.m56344a(aVar.mo51260a()));
                            }
                        });
                    }
                }
            });
        } catch (Exception e) {
            this.f36308b.post(new Runnable() {
                /* class com.bytedance.feelgood.ADFeelGoodManager.RunnableC138923 */

                public void run() {
                    aVar.mo51189a(-1, "网络请求出错", e);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo51184a(C13913d dVar, final C13911b bVar, final AbstractC13926f fVar) {
        if (this.f36311e == null) {
            Log.e("ADFeelGoodManager", "ADFeelGoodConfig is null");
            return;
        }
        if (this.f36307a == null) {
            this.f36307a = new Handler();
        }
        if (bVar.mo51244a() instanceof LifecycleOwner) {
            ((LifecycleOwner) bVar.mo51244a()).getLifecycle().addObserver(this.f36313g);
        }
        if (dVar != null && dVar.f36390c != null) {
            if (dVar.f36390c.f36391a != null && dVar.f36390c.f36391a.size() > 0) {
                String str = dVar.f36390c.f36391a.get(0);
                bVar.mo51248a(str);
                if (dVar.f36390c.f36393c.containsKey(str)) {
                    try {
                        bVar.mo51250a(dVar.f36390c.f36393c.get(str).getJSONObject("survey_task"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                mo51182a(bVar, fVar);
            } else if (dVar.f36390c.f36392b != null && dVar.f36390c.f36392b.size() > 0) {
                String str2 = dVar.f36390c.f36392b.get(0);
                bVar.mo51248a(str2);
                bVar.mo51245a(-1.0d);
                if (dVar.f36390c.f36393c.containsKey(str2)) {
                    JSONObject jSONObject = dVar.f36390c.f36393c.get(str2);
                    try {
                        bVar.mo51250a(jSONObject.getJSONObject("survey_task"));
                        this.f36307a.postDelayed(new Runnable() {
                            /* class com.bytedance.feelgood.ADFeelGoodManager.RunnableC138945 */

                            public void run() {
                                ADFeelGoodManager.this.mo51182a(bVar, fVar);
                            }
                        }, (long) (jSONObject.getInt("delay_duration") * 1000));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }
}
