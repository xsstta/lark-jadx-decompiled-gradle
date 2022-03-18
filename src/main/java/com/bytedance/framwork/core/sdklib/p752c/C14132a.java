package com.bytedance.framwork.core.sdklib.p752c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.p748a.AbstractC14109a;
import com.bytedance.framwork.core.sdklib.p750a.C14128c;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.net.URL;
import java.util.List;

/* renamed from: com.bytedance.framwork.core.sdklib.c.a */
public class C14132a implements AbstractC14136b {

    /* renamed from: a */
    AbstractC14109a f37149a;

    /* renamed from: b */
    volatile long f37150b;

    /* renamed from: c */
    boolean f37151c;

    /* renamed from: d */
    int f37152d;

    /* renamed from: e */
    Context f37153e;

    /* renamed from: f */
    String f37154f;

    /* renamed from: g */
    int f37155g;

    /* renamed from: h */
    volatile long f37156h;

    /* renamed from: i */
    volatile long f37157i;

    /* renamed from: j */
    String f37158j;

    /* renamed from: k */
    private boolean f37159k = true;

    /* renamed from: e */
    public void mo51930e() {
        if (this.f37159k) {
            SDKMonitorUtils.getInstance(this.f37154f).setStopCollect(false);
        }
    }

    /* renamed from: d */
    public void mo51929d() {
        if (this.f37159k) {
            mo51922a();
            SDKMonitorUtils.getInstance(this.f37154f).setStopCollect(true);
        }
    }

    /* renamed from: g */
    public long mo51932g() {
        long j;
        if (!this.f37159k) {
            return 0;
        }
        if (this.f37150b > this.f37156h) {
            j = this.f37150b;
        } else {
            j = this.f37156h;
        }
        if (j > this.f37157i) {
            return j;
        }
        return this.f37157i;
    }

    /* renamed from: c */
    public void mo51927c() {
        if (this.f37159k) {
            SDKMonitorUtils.getInstance(this.f37154f).restoreCollectDelay();
            SDKMonitorUtils.getInstance(this.f37154f).setStopCollect(false);
            this.f37152d = 0;
            this.f37150b = 0;
            this.f37155g = 0;
            this.f37156h = 0;
            this.f37157i = 0;
        }
    }

    /* renamed from: f */
    public void mo51931f() {
        if (this.f37159k) {
            mo51922a();
            SDKMonitorUtils.getInstance(this.f37154f).setStopCollect(true);
            SDKMonitorUtils.getInstance(this.f37154f).deleteAllLogs();
            SDKMonitorUtils.getInstance(this.f37154f).dropAllData();
        }
    }

    /* renamed from: a */
    public void mo51922a() {
        if (this.f37159k) {
            int i = this.f37152d;
            if (i == 0) {
                this.f37150b = 300000;
                this.f37152d++;
            } else if (i == 1) {
                this.f37150b = 900000;
                this.f37152d++;
            } else if (i == 2) {
                this.f37150b = 1800000;
                this.f37152d++;
            } else {
                this.f37150b = 1800000;
                this.f37152d++;
            }
            SDKMonitorUtils.getInstance(this.f37154f).setCollectDelay(this.f37150b);
        }
    }

    /* renamed from: b */
    public void mo51925b() {
        if (this.f37159k) {
            int i = this.f37155g;
            if (i == 0) {
                this.f37156h = 30000;
                this.f37155g++;
            } else if (i == 1) {
                this.f37156h = 60000;
                this.f37155g++;
            } else if (i == 2) {
                this.f37156h = 120000;
                this.f37155g++;
            } else if (i == 3) {
                this.f37156h = 240000;
                this.f37155g++;
            } else {
                this.f37156h = 300000;
                this.f37155g++;
            }
            SDKMonitorUtils.getInstance(this.f37154f).setCollectDelay(this.f37156h);
        }
    }

    /* renamed from: a */
    public void mo51924a(String str) {
        if (this.f37159k) {
            this.f37158j = str;
        }
    }

    @Override // com.bytedance.framwork.core.sdklib.p752c.AbstractC14136b
    /* renamed from: b */
    public boolean mo51926b(String str) {
        return this.f37149a.mo51859a(str);
    }

    /* renamed from: c */
    public void mo51928c(String str) {
        this.f37149a.mo51863b(str);
    }

    /* renamed from: a */
    public void mo51923a(long j) {
        if (this.f37159k) {
            this.f37157i = j * 1000;
            SDKMonitorUtils.getInstance(this.f37154f).setCollectDelay(this.f37157i);
        }
    }

    public C14132a(Context context, final String str) {
        this.f37154f = str;
        this.f37153e = context;
        this.f37149a = new AbstractC14109a(context.getApplicationContext(), new AbstractC14109a.AbstractC14110a() {
            /* class com.bytedance.framwork.core.sdklib.p752c.C14132a.C141331 */

            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b, com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14110a
            /* renamed from: c */
            public int mo51866c() {
                return C14128c.m57155d(str);
            }

            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b, com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14110a
            /* renamed from: d */
            public long mo51867d() {
                return (long) C14128c.m57156e(str);
            }

            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b
            /* renamed from: b */
            public List<String> mo51871b() {
                return C14128c.m57151a(str, "sdk_monitor");
            }

            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b
            /* renamed from: a */
            public String mo51870a() {
                return str + "sdk_monitor";
            }

            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14111b, com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14110a
            /* renamed from: e */
            public String mo51868e() {
                List<String> b;
                if (TextUtils.isEmpty(C14132a.this.f37158j) || (b = mo51871b()) == null || b.size() <= 0) {
                    return null;
                }
                try {
                    URL url = new URL(b.get(0));
                    return "https://" + C14132a.this.f37158j + url.getPath();
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, new AbstractC14109a.AbstractC14112c() {
            /* class com.bytedance.framwork.core.sdklib.p752c.C14132a.C141342 */

            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14112c
            /* renamed from: a */
            public boolean mo51872a() {
                return C14128c.m57157f(str);
            }

            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14112c
            /* renamed from: b */
            public long mo51873b() {
                return C14132a.this.mo51932g();
            }

            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a.AbstractC14112c
            /* renamed from: c */
            public boolean mo51874c() {
                return C14132a.this.f37151c;
            }
        }) {
            /* class com.bytedance.framwork.core.sdklib.p752c.C14132a.C141353 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.framwork.core.p748a.AbstractC14109a
            /* renamed from: a */
            public boolean mo51860a(String str, byte[] bArr) {
                if (C14138d.m57207a(str) != null) {
                    C14139e sendLog = C14138d.m57207a(str).sendLog(str, bArr);
                    C14132a.this.mo51924a((String) null);
                    if (sendLog == null || sendLog.f37168a <= 0) {
                        C14132a.this.mo51925b();
                        C14132a.this.f37151c = true;
                    } else {
                        C14132a.this.f37151c = false;
                        if (sendLog.f37168a != 200 || sendLog.f37169b == null) {
                            if (500 <= sendLog.f37168a && sendLog.f37168a <= 600) {
                                C14132a.this.mo51922a();
                                return false;
                            }
                        } else if ("success".equals(sendLog.f37169b.opt("message"))) {
                            C14132a.this.mo51927c();
                            String optString = sendLog.f37169b.optString("redirect");
                            long optLong = sendLog.f37169b.optLong("delay");
                            if (!TextUtils.isEmpty(optString)) {
                                C14132a.this.mo51924a(optString);
                            }
                            if (optLong > 0) {
                                C14132a.this.mo51923a(optLong);
                            }
                            return true;
                        } else {
                            boolean equals = "drop data".equals(sendLog.f37169b.opt("message"));
                            boolean equals2 = "drop all data".equals(sendLog.f37169b.opt("message"));
                            String optString2 = sendLog.f37169b.optString("redirect");
                            long optLong2 = sendLog.f37169b.optLong("delay");
                            if (!TextUtils.isEmpty(optString2)) {
                                C14132a.this.mo51924a(optString2);
                            }
                            if (optLong2 > 0) {
                                C14132a.this.mo51923a(optLong2);
                            }
                            if (equals) {
                                C14132a.this.mo51929d();
                            } else {
                                C14132a.this.mo51930e();
                            }
                            if (equals2) {
                                C14132a.this.mo51931f();
                            }
                            return false;
                        }
                    }
                }
                return false;
            }
        };
    }
}
