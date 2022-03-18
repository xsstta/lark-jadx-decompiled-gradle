package com.ss.android.openbusiness.p3004b;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.log.Log;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.p3004b.AbstractC59482a;
import com.tt.miniapp.util.ACache;

/* renamed from: com.ss.android.openbusiness.b.b */
public class C59489b {

    /* renamed from: a */
    public String f147683a;

    /* renamed from: b */
    public String f147684b;

    public C59489b(OpbScene opbScene) {
        this(opbScene, true);
    }

    /* renamed from: a */
    public void mo202792a(final Context context, final AbstractC59482a.AbstractC59483a<String> aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.openbusiness.p3004b.C59489b.RunnableC594912 */

            public void run() {
                try {
                    Log.m165389i("Op_Cache", "get cache");
                    String a = ACache.m261150a(context, C59489b.this.f147684b).mo233093a(C59489b.this.f147683a);
                    if (!TextUtils.isEmpty(a)) {
                        aVar.mo170516a((Object) a);
                    } else {
                        aVar.mo170517a("cache empty");
                    }
                } catch (ACache.CacheException e) {
                    e.printStackTrace();
                    Log.m165384e("Op_Cache", "get cache exception", e);
                    aVar.mo170517a(e.getMessage());
                }
            }
        });
    }

    public C59489b(OpbScene opbScene, boolean z) {
        String str = "more";
        if (opbScene == OpbScene.MESSAGE_ACTION) {
            this.f147684b = "OpbMessageActionCache";
            StringBuilder sb = new StringBuilder();
            sb.append("OpbMessageActionCache");
            sb.append(C26320t.m95318a(C59480b.m230865a().mo144867a()));
            sb.append(!z ? "featured" : str);
            this.f147683a = sb.toString();
        } else if (opbScene == OpbScene.PLUS_MENU_GROUP || opbScene == OpbScene.PLUS_MENU_SINGLE) {
            this.f147684b = "OpbPLusMenuCache";
            StringBuilder sb2 = new StringBuilder();
            sb2.append("OpbPLusMenuCache");
            sb2.append(C26320t.m95318a(C59480b.m230865a().mo144867a()));
            sb2.append(!z ? "featured" : str);
            this.f147683a = sb2.toString();
        }
    }

    /* renamed from: a */
    public void mo202793a(final Context context, final String str, final int i) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.openbusiness.p3004b.C59489b.RunnableC594901 */

            public void run() {
                try {
                    Log.m165389i("Op_Cache", "save cache, expireTimeSecond: " + i);
                    if (i <= 0) {
                        ACache.m261150a(context, C59489b.this.f147684b).mo233096a(C59489b.this.f147683a, str, 86400);
                    } else {
                        ACache.m261150a(context, C59489b.this.f147684b).mo233096a(C59489b.this.f147683a, str, i);
                    }
                } catch (ACache.CacheException e) {
                    e.printStackTrace();
                    Log.m165384e("Op_Cache", "save cache exception", e);
                }
            }
        });
    }
}
