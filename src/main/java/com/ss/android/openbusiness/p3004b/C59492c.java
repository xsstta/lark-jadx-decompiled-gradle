package com.ss.android.openbusiness.p3004b;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.data.netdata.C59570b;
import com.ss.android.openbusiness.data.netdata.C59572d;
import com.ss.android.openbusiness.data.netdata.C59573e;
import com.ss.android.openbusiness.p3004b.AbstractC59482a;
import com.ss.android.openbusiness.p3006c.C59541d;
import com.ss.android.openbusiness.p3006c.C59545e;
import com.ss.android.openbusiness.p3007d.AbstractC59555c;
import com.ss.android.openbusiness.p3007d.C59551b;
import java.util.List;

/* renamed from: com.ss.android.openbusiness.b.c */
public class C59492c implements AbstractC59482a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.openbusiness.b.c$a */
    public static class C59505a {

        /* renamed from: a */
        public static C59492c f147716a = new C59492c();
    }

    /* renamed from: a */
    public static C59492c m230889a() {
        return C59505a.f147716a;
    }

    /* renamed from: c */
    public void mo202798c(Context context, OpbScene opbScene, final AbstractC59482a.AbstractC59483a<List<C59572d>> aVar) {
        new C59489b(opbScene).mo202792a(context, new AbstractC59482a.AbstractC59483a<String>() {
            /* class com.ss.android.openbusiness.p3004b.C59492c.C594994 */

            @Override // com.ss.android.openbusiness.p3004b.AbstractC59482a.AbstractC59483a
            /* renamed from: a */
            public void mo170517a(final String str) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.openbusiness.p3004b.C59492c.C594994.RunnableC595045 */

                    public void run() {
                        if (aVar != null) {
                            aVar.mo170517a(str);
                        }
                    }
                });
            }

            /* renamed from: b */
            public void mo170516a(String str) {
                try {
                    final C59570b bVar = (C59570b) new Gson().fromJson(str, new TypeToken<C59570b>() {
                        /* class com.ss.android.openbusiness.p3004b.C59492c.C594994.C595001 */
                    }.getType());
                    if (bVar != null) {
                        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                            /* class com.ss.android.openbusiness.p3004b.C59492c.C594994.RunnableC595012 */

                            public void run() {
                                if (aVar != null) {
                                    aVar.mo170516a(bVar.mo202966b());
                                }
                            }
                        });
                    } else {
                        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                            /* class com.ss.android.openbusiness.p3004b.C59492c.C594994.RunnableC595023 */

                            public void run() {
                                if (aVar != null) {
                                    aVar.mo170517a("server error");
                                }
                            }
                        });
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.ss.android.openbusiness.p3004b.C59492c.C594994.RunnableC595034 */

                        public void run() {
                            if (aVar != null) {
                                aVar.mo170517a("json error");
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo202796a(final Context context, final OpbScene opbScene, final AbstractC59482a.AbstractC59483a<List<C59572d>> aVar) {
        Log.m165389i("Opb_DataManager", "request data force " + opbScene);
        mo202798c(context, opbScene, new AbstractC59482a.AbstractC59483a<List<C59572d>>() {
            /* class com.ss.android.openbusiness.p3004b.C59492c.C594931 */

            /* renamed from: a */
            public void mo170516a(final List<C59572d> list) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.openbusiness.p3004b.C59492c.C594931.RunnableC594941 */

                    public void run() {
                        Log.m165389i("Opb_DataManager", "cache not expire， use cache");
                        if (aVar != null) {
                            aVar.mo170516a(list);
                        }
                    }
                });
            }

            @Override // com.ss.android.openbusiness.p3004b.AbstractC59482a.AbstractC59483a
            /* renamed from: a */
            public void mo170517a(String str) {
                OPMonitorCode oPMonitorCode;
                Log.m165389i("Opb_DataManager", "cache expire， request from net");
                if (opbScene == OpbScene.MESSAGE_ACTION) {
                    oPMonitorCode = C59545e.f147819f;
                } else {
                    oPMonitorCode = C59545e.f147828o;
                }
                C59541d.m231037a(oPMonitorCode).flush();
                C59492c.this.mo202797b(context, opbScene, aVar);
            }
        });
    }

    /* renamed from: b */
    public void mo202797b(final Context context, final OpbScene opbScene, final AbstractC59482a.AbstractC59483a<List<C59572d>> aVar) {
        C59551b.m231043a().mo202932a(opbScene, new TypeToken<C59573e<C59570b>>() {
            /* class com.ss.android.openbusiness.p3004b.C59492c.C594952 */
        }, new AbstractC59555c.AbstractC59556a<C59570b>() {
            /* class com.ss.android.openbusiness.p3004b.C59492c.C594963 */

            /* renamed from: a */
            public void mo202801a(final C59570b bVar) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.openbusiness.p3004b.C59492c.C594963.RunnableC594971 */

                    public void run() {
                        OPMonitorCode oPMonitorCode;
                        OPMonitorCode oPMonitorCode2;
                        if (aVar == null) {
                            return;
                        }
                        if (bVar != null) {
                            if (opbScene == OpbScene.MESSAGE_ACTION) {
                                oPMonitorCode2 = C59545e.f147816c;
                            } else {
                                oPMonitorCode2 = C59545e.f147825l;
                            }
                            C59541d.m231037a(oPMonitorCode2).flush();
                            new C59489b(opbScene).mo202793a(context, new Gson().toJson(bVar), bVar.mo202965a().intValue());
                            aVar.mo170516a(bVar.mo202966b());
                            return;
                        }
                        if (opbScene == OpbScene.MESSAGE_ACTION) {
                            oPMonitorCode = C59545e.f147817d;
                        } else {
                            oPMonitorCode = C59545e.f147826m;
                        }
                        C59541d.m231037a(oPMonitorCode).flush();
                        aVar.mo170517a("network error");
                    }
                });
            }

            @Override // com.ss.android.openbusiness.p3007d.AbstractC59555c.AbstractC59556a
            /* renamed from: a */
            public void mo202803a(final String str) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.openbusiness.p3004b.C59492c.C594963.RunnableC594982 */

                    public void run() {
                        OPMonitorCode oPMonitorCode;
                        if (aVar != null) {
                            if (opbScene == OpbScene.MESSAGE_ACTION) {
                                oPMonitorCode = C59545e.f147817d;
                            } else {
                                oPMonitorCode = C59545e.f147826m;
                            }
                            C59541d.m231037a(oPMonitorCode).flush();
                            aVar.mo170517a(str);
                        }
                    }
                });
            }
        });
    }
}
