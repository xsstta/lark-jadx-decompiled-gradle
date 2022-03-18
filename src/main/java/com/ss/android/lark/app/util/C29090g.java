package com.ss.android.lark.app.util;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.exception.crash.npth.AbstractC37020a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p2094l.C41114b;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57822e;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.vc.api.IVCApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.app.util.g */
public class C29090g {
    /* renamed from: a */
    public static AbstractC37020a m106967a(final Context context) {
        return new AbstractC37020a() {
            /* class com.ss.android.lark.app.util.C29090g.C290911 */

            @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a
            /* renamed from: a */
            public Context mo103182a() {
                return context;
            }

            @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a
            /* renamed from: b */
            public boolean mo103183b() {
                return C26284k.m95185a(context);
            }

            @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a
            /* renamed from: d */
            public AbstractC37020a.AbstractC37021a mo103185d() {
                return new AbstractC37020a.AbstractC37021a() {
                    /* class com.ss.android.lark.app.util.C29090g.C290911.C290921 */

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: i */
                    public String mo103197i() {
                        return null;
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: j */
                    public Map<String, Integer> mo103198j() {
                        return new HashMap();
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: a */
                    public int mo103189a() {
                        return C29410a.m108287a().mo104277a();
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: b */
                    public int mo103190b() {
                        return C26246a.m94979c(context);
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: c */
                    public int mo103191c() {
                        return C26246a.m94978b(context);
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: d */
                    public String mo103192d() {
                        return C26246a.m94977a(context);
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: e */
                    public String mo103193e() {
                        return PackageChannelManager.getRuntimePackageChannel(context);
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: f */
                    public int mo103194f() {
                        return C57824f.m224468c(context);
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: g */
                    public String mo103195g() {
                        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: h */
                    public String mo103196h() {
                        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
                    }

                    @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a.AbstractC37021a
                    /* renamed from: k */
                    public List<String> mo103199k() {
                        ArrayList arrayList = new ArrayList();
                        JSONArray c = C41114b.m163063c();
                        if (c != null) {
                            return arrayList;
                        }
                        int i = 0;
                        while (c != null && i < c.length()) {
                            try {
                                arrayList.add(c.getString(i));
                            } catch (JSONException unused) {
                            }
                            i++;
                        }
                        return arrayList;
                    }
                };
            }

            @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a
            /* renamed from: f */
            public String mo103187f() {
                return C57881t.m224641m(context);
            }

            @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a
            /* renamed from: g */
            public String mo103188g() {
                return C57881t.m224637i(context);
            }

            @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a
            /* renamed from: c */
            public AbstractC37020a.C37022b mo103184c() {
                if (m106968a(context)) {
                    return new AbstractC37020a.C37022b(true, true, true, true);
                }
                if (C26284k.m95185a(LarkContext.getApplication())) {
                    return new AbstractC37020a.C37022b(true, true, true, true);
                }
                return new AbstractC37020a.C37022b(true, false, true, false);
            }

            @Override // com.ss.android.lark.exception.crash.npth.AbstractC37020a
            /* renamed from: e */
            public Map<String, String> mo103186e() {
                String str;
                String str2;
                HashMap hashMap = new HashMap();
                if (C26284k.m95185a(context)) {
                    str = "debug";
                } else {
                    str = "release";
                }
                hashMap.put("build_type", str);
                hashMap.put("beta_version_code", String.valueOf(C57824f.m224465b(context)));
                hashMap.put("build_version_code", String.valueOf(C57824f.m224468c(context)));
                JSONObject deviceInfo = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceInfo(context);
                Iterator<String> keys = deviceInfo.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        hashMap.put(next, deviceInfo.get(next).toString());
                    } catch (JSONException e) {
                        Log.m165382e(e.getMessage());
                    }
                }
                Activity topActivity = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTopActivity();
                if (topActivity != null) {
                    str2 = topActivity.getClass().getSimpleName();
                } else {
                    str2 = "";
                }
                hashMap.put("top_activity", str2);
                hashMap.put("vesdk_version", ((IVCApi) ApiUtils.getApi(IVCApi.class)).getVeSdkVersion());
                hashMap.put("vc_rtc_sdk_version", ((IVCApi) ApiUtils.getApi(IVCApi.class)).getRtcSdkVersion());
                return hashMap;
            }

            /* renamed from: a */
            private boolean m106968a(Context context) {
                if (C26284k.m95185a(context) || !C57822e.m224445a(context)) {
                    return false;
                }
                return true;
            }
        };
    }
}
