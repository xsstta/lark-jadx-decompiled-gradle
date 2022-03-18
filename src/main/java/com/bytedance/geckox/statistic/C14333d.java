package com.bytedance.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p762d.C14234b;
import com.bytedance.geckox.p762d.C14260n;
import com.bytedance.geckox.p762d.C14261o;
import com.bytedance.geckox.statistic.model.C14348a;
import com.bytedance.geckox.statistic.model.StatisticModel;
import com.bytedance.geckox.utils.C14364j;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import com.bytedance.pipeline.exception.RequestInterceptException;
import com.bytedance.pipeline.p859a.AbstractC20231a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.geckox.statistic.d */
public class C14333d {
    /* renamed from: a */
    static AbstractC20231a m57734a() {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143407 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel()).f37687i = true;
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37687i = false;
                a.f37690l = SystemClock.uptimeMillis();
                a.f37697s = th.getMessage();
            }
        };
    }

    /* renamed from: b */
    static AbstractC20231a m57736b() {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143418 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37688j = true;
                a.f37691m = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37688j = false;
                a.f37691m = SystemClock.uptimeMillis();
                a.f37698t = th.getMessage();
            }
        };
    }

    /* renamed from: c */
    static AbstractC20231a m57738c() {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143429 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37688j = true;
                a.f37692n = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37688j = false;
                a.f37692n = SystemClock.uptimeMillis();
                a.f37698t = th.getMessage();
            }
        };
    }

    /* renamed from: d */
    static AbstractC20231a m57740d() {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.AnonymousClass10 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14260n.class)).second).getChannel());
                a.f37671C = true;
                a.f37704z = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14260n.class)).second).getChannel());
                a.f37671C = false;
                a.f37704z = SystemClock.uptimeMillis();
                a.f37673E = th.getMessage();
            }
        };
    }

    /* renamed from: e */
    static AbstractC20231a m57742e() {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.AnonymousClass11 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14260n.class)).second).getChannel());
                a.f37672D = true;
                a.f37669A = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14260n.class)).second).getChannel());
                a.f37672D = false;
                a.f37669A = SystemClock.uptimeMillis();
                a.f37674F = th.getMessage();
            }
        };
    }

    /* renamed from: f */
    static AbstractC20231a m57743f() {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.AnonymousClass12 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37689k = true;
                a.f37693o = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37689k = false;
                a.f37699u = th.getMessage();
                a.f37693o = SystemClock.uptimeMillis();
            }
        };
    }

    /* renamed from: g */
    static AbstractC20231a m57744g() {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143352 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52253a(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52253a(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14260n.class)).second).getChannel());
                a.f37672D = true;
                a.f37669A = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14260n.class)).second).getChannel());
                a.f37672D = false;
                a.f37669A = SystemClock.uptimeMillis();
                a.f37674F = th.getMessage();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52251a(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52251a(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14260n.class)).second).getChannel());
                a.f37672D = false;
                a.f37669A = SystemClock.uptimeMillis();
                a.f37674F = th.getMessage();
            }
        };
    }

    /* renamed from: h */
    static AbstractC20231a m57745h() {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143363 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52253a(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52253a(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37689k = true;
                a.f37693o = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37689k = false;
                a.f37693o = SystemClock.uptimeMillis();
                a.f37699u = th.getMessage();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52251a(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52251a(bVar, dVar, th);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37689k = false;
                a.f37693o = SystemClock.uptimeMillis();
                a.f37674F = th.getMessage();
            }
        };
    }

    /* renamed from: a */
    static AbstractC20231a m57735a(final Context context) {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143341 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52253a(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52253a(bVar, dVar);
                C14343e.m57785a(context, C14331b.m57730a(dVar.mo68491c()));
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14343e.m57785a(context, C14331b.m57730a(dVar.mo68491c()));
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52251a(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52251a(bVar, dVar, th);
                C14343e.m57785a(context, C14331b.m57730a(dVar.mo68491c()));
            }
        };
    }

    /* renamed from: b */
    static AbstractC20231a m57737b(final Context context) {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143385 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14260n.class)).second).getChannel());
                a.f37670B = true;
                a.f37703y = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: c */
            public <T> void mo52255c(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52255c(bVar, dVar);
                Pair pair = (Pair) bVar.getOutputForType(C14260n.class);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) pair.second).getChannel());
                a.f37675G = ((Integer) bVar.getPipelineData("req_type")).intValue();
                a.f37676H = ((Integer) bVar.getPipelineData("sync_task_id")).intValue();
                a.f37677I = (String) bVar.getPipelineData("api_version");
                a.f37678J = ((Integer) bVar.getPipelineData("update_priority")).intValue();
                a.f37700v = ((Uri) pair.first).toString();
                a.f37694p = C14364j.m57839a(context);
                a.f37702x = SystemClock.uptimeMillis();
                a.f37696r = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a.f37681c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    a.f37679a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    a.f37680b = ((UpdatePackage) pair.second).getGroupName();
                }
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                Pair pair = (Pair) bVar.getOutputForType(C14260n.class);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a.f37670B = false;
                a.f37703y = SystemClock.uptimeMillis();
                a.f37701w.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(uri, th.getMessage(), Long.valueOf(a.f37703y - a.f37702x)));
            }
        };
    }

    /* renamed from: c */
    static AbstractC20231a m57739c(final Context context) {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143396 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) ((Pair) bVar.getOutputForType(C14261o.class)).second).getChannel());
                a.f37686h = true;
                a.f37685g = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: c */
            public <T> void mo52255c(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52255c(bVar, dVar);
                Pair pair = (Pair) bVar.getOutputForType(C14261o.class);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) pair.second).getChannel());
                a.f37675G = ((Integer) bVar.getPipelineData("req_type")).intValue();
                a.f37676H = ((Integer) bVar.getPipelineData("sync_task_id")).intValue();
                a.f37677I = (String) bVar.getPipelineData("api_version");
                a.f37678J = ((Integer) bVar.getPipelineData("update_priority")).intValue();
                a.f37682d = ((Uri) pair.first).toString();
                a.f37694p = C14364j.m57839a(context);
                a.f37684f = SystemClock.uptimeMillis();
                a.f37695q = Long.valueOf(((UpdatePackage) pair.second).getPatch().getId());
                a.f37696r = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a.f37681c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    a.f37679a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    a.f37680b = ((UpdatePackage) pair.second).getGroupName();
                }
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                Pair pair = (Pair) bVar.getOutputForType(C14261o.class);
                C14348a a = C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a.f37686h = false;
                a.f37685g = SystemClock.uptimeMillis();
                a.f37683e.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(uri, th.getMessage(), Long.valueOf(a.f37685g - a.f37684f)));
            }
        };
    }

    /* renamed from: d */
    static AbstractC20231a m57741d(final Context context) {
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.statistic.C14333d.C143374 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52253a(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52253a(bVar, dVar);
                C14343e.m57787a(context, C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) bVar.getInputForType(C14234b.class)).getChannel()));
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                C14343e.m57787a(context, C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) bVar.getInputForType(C14234b.class)).getChannel()));
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52251a(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52251a(bVar, dVar, th);
                boolean z = th instanceof RequestInterceptException;
                C14343e.m57787a(context, C14331b.m57730a(dVar.mo68491c()).mo52459a(((UpdatePackage) bVar.getInputForType(C14234b.class)).getChannel()));
            }
        };
    }
}
