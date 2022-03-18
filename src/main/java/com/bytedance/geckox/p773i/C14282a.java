package com.bytedance.geckox.p773i;

import android.util.Pair;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.interceptors.MetaDataUpdateInterceptor;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p757a.C14201c;
import com.bytedance.geckox.p762d.C14234b;
import com.bytedance.geckox.p762d.C14247c;
import com.bytedance.geckox.p762d.C14248d;
import com.bytedance.geckox.p762d.C14250e;
import com.bytedance.geckox.p762d.C14252f;
import com.bytedance.geckox.p762d.C14253g;
import com.bytedance.geckox.p762d.C14254h;
import com.bytedance.geckox.p762d.C14255i;
import com.bytedance.geckox.p762d.C14256k;
import com.bytedance.geckox.p762d.C14258l;
import com.bytedance.geckox.p762d.C14259m;
import com.bytedance.geckox.p762d.C14260n;
import com.bytedance.geckox.p762d.C14261o;
import com.bytedance.geckox.p762d.C14262p;
import com.bytedance.geckox.p762d.p763a.p764a.C14224a;
import com.bytedance.geckox.p762d.p763a.p764a.C14225b;
import com.bytedance.geckox.p762d.p763a.p764a.C14226c;
import com.bytedance.geckox.p762d.p763a.p764a.C14227d;
import com.bytedance.geckox.p762d.p763a.p765b.C14228a;
import com.bytedance.geckox.p762d.p763a.p765b.C14229b;
import com.bytedance.geckox.p762d.p763a.p765b.C14230c;
import com.bytedance.geckox.p762d.p763a.p765b.C14231d;
import com.bytedance.geckox.p762d.p763a.p765b.C14232e;
import com.bytedance.geckox.p762d.p763a.p765b.C14233f;
import com.bytedance.geckox.p762d.p766b.p767a.C14235a;
import com.bytedance.geckox.p762d.p766b.p767a.C14236b;
import com.bytedance.geckox.p762d.p766b.p767a.C14237c;
import com.bytedance.geckox.p762d.p766b.p767a.C14238d;
import com.bytedance.geckox.p762d.p766b.p767a.C14239e;
import com.bytedance.geckox.p762d.p766b.p768b.C14240a;
import com.bytedance.geckox.p762d.p766b.p768b.C14241b;
import com.bytedance.geckox.p762d.p766b.p768b.C14242c;
import com.bytedance.geckox.p762d.p766b.p768b.C14243d;
import com.bytedance.geckox.p762d.p766b.p768b.C14244e;
import com.bytedance.geckox.p762d.p766b.p768b.C14245f;
import com.bytedance.geckox.p762d.p766b.p768b.C14246g;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p769e.C14268b;
import com.bytedance.geckox.p769e.C14269c;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import com.bytedance.pipeline.AbstractC20236e;
import com.bytedance.pipeline.AbstractC20247l;
import com.bytedance.pipeline.C20234c;
import com.bytedance.pipeline.C20239g;
import com.bytedance.pipeline.C20240h;
import com.bytedance.pipeline.exception.RequestInterceptException;
import com.bytedance.pipeline.p859a.AbstractC20231a;
import com.bytedance.pipeline.p859a.C20232b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.i.a */
public class C14282a {
    /* renamed from: a */
    private static List<C20240h> m57624a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14252f.class).mo68504a(C14268b.m57586a(C14252f.class)).mo68507b());
        return arrayList;
    }

    /* renamed from: a */
    private static List<C20240h> m57625a(OptionCheckUpdateParams optionCheckUpdateParams, C14218d dVar, File file, AbstractC14267a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14256k.class).mo68506a(dVar.mo52141g(), optionCheckUpdateParams).mo68507b());
        arrayList.addAll(m57626a(dVar, file, aVar, optionCheckUpdateParams.isEnableDownloadAutoRetry()));
        return arrayList;
    }

    /* renamed from: a */
    public static List<C20240h> m57626a(C14218d dVar, File file, AbstractC14267a aVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14259m.class).mo68506a(file, aVar).mo68507b());
        AbstractC20247l.C20249b a = new AbstractC20247l.C20249b().mo68517a(new C20232b(m57616a(aVar), C14268b.m57586a(C14234b.class)));
        a.mo68516a("branch_zip").mo68513a(m57637d(aVar, file, dVar, z)).mo68513a(C20240h.C20242a.m73913a().mo68505a(C20239g.class).mo68507b());
        a.mo68516a("branch_single_file").mo68513a(m57622a(aVar, file, dVar, z)).mo68513a(C20240h.C20242a.m73913a().mo68505a(C20239g.class).mo68507b());
        a.mo68516a("branch_myarchive_file").mo68513a(m57621a(aVar, file, dVar)).mo68513a(C20240h.C20242a.m73913a().mo68505a(C20239g.class).mo68507b());
        arrayList.add(a.mo68515a(C14234b.class));
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14262p.class).mo68506a(file, null).mo68504a(m57628b(aVar)).mo68507b());
        return arrayList;
    }

    /* renamed from: a */
    private static List<C20240h> m57627a(AbstractC14267a aVar, Map<String, String> map, C14218d dVar, OptionCheckUpdateParams optionCheckUpdateParams) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14256k.class).mo68506a(dVar.mo52141g(), optionCheckUpdateParams).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14258l.class).mo68506a(map, aVar).mo68507b());
        AbstractC20247l.C20249b a = new AbstractC20247l.C20249b().mo68517a(new C20232b(m57616a(aVar), C14268b.m57586a(C14234b.class)));
        a.mo68516a("branch_zip").mo68513a(m57638d(aVar, map, dVar)).mo68513a(C20240h.C20242a.m73913a().mo68505a(C20239g.class).mo68507b());
        a.mo68516a("branch_single_file").mo68513a(m57623a(aVar, map, dVar)).mo68513a(C20240h.C20242a.m73913a().mo68505a(C20239g.class).mo68507b());
        a.mo68516a("branch_myarchive_file").mo68513a(m57644g(aVar, map, dVar)).mo68513a(C20240h.C20242a.m73913a().mo68505a(C20239g.class).mo68507b());
        arrayList.add(a.mo68515a(C14234b.class));
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14262p.class).mo68506a(null, map).mo68504a(m57628b(aVar)).mo68507b());
        return arrayList;
    }

    /* renamed from: a */
    private static AbstractC20231a m57616a(final AbstractC14267a aVar) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.p773i.C14282a.C142831 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                mo52251a(bVar, dVar, th);
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52251a(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52251a(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.getOutputForType(C14234b.class);
                String channel = updatePackage.getChannel();
                aVar.mo21862a(channel, th);
                aVar.mo52240c(updatePackage, th);
                List<AbstractC14267a> b = C14269c.m57588a().mo52243b(updatePackage.getAccessKey(), channel);
                if (!(b == null || b.isEmpty())) {
                    for (AbstractC14267a aVar : b) {
                        aVar.mo21862a(channel, th);
                        aVar.mo52240c(updatePackage, th);
                    }
                }
            }
        };
    }

    /* renamed from: b */
    private static AbstractC20231a m57628b(final AbstractC14267a aVar) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.p773i.C14282a.C142842 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: a */
            public <T> void mo52253a(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52253a(bVar, dVar);
                Pair pair = (Pair) bVar.getInputForType(C14262p.class);
                UpdatePackage updatePackage = (UpdatePackage) pair.first;
                String channel = updatePackage.getChannel();
                aVar.mo21861a(channel, ((Long) pair.second).longValue());
                aVar.mo52238a(updatePackage, ((Long) pair.second).longValue());
                List<AbstractC14267a> b = C14269c.m57588a().mo52243b(updatePackage.getAccessKey(), channel);
                if (!(b == null || b.isEmpty())) {
                    for (AbstractC14267a aVar : b) {
                        aVar.mo21861a(channel, ((Long) pair.second).longValue());
                        aVar.mo52238a(updatePackage, ((Long) pair.second).longValue());
                    }
                }
            }
        };
    }

    /* renamed from: c */
    private static AbstractC20231a m57632c(final AbstractC14267a aVar) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.p773i.C14282a.C142853 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.getOutputForType(C14247c.class);
                aVar.mo21865b(updatePackage);
                List<AbstractC14267a> a = C14269c.m57588a().mo52241a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14267a aVar : a) {
                        aVar.mo21865b(updatePackage);
                    }
                }
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.getOutputForType(C14247c.class);
                aVar.mo21859a(updatePackage, th);
                List<AbstractC14267a> a = C14269c.m57588a().mo52241a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14267a aVar : a) {
                        aVar.mo21859a(updatePackage, th);
                    }
                }
            }
        };
    }

    /* renamed from: d */
    private static AbstractC20231a m57636d(final AbstractC14267a aVar) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.p773i.C14282a.C142864 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.getOutputForType(C14247c.class);
                aVar.mo21859a(updatePackage, th);
                List<AbstractC14267a> a = C14269c.m57588a().mo52241a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14267a aVar : a) {
                        aVar.mo21859a(updatePackage, th);
                    }
                }
            }
        };
    }

    /* renamed from: e */
    private static AbstractC20231a m57639e(final AbstractC14267a aVar) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.p773i.C14282a.C142875 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.getInputForType(C14247c.class);
                aVar.mo21868c(updatePackage);
                List<AbstractC14267a> a = C14269c.m57588a().mo52241a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14267a aVar : a) {
                        aVar.mo21868c(updatePackage);
                    }
                }
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: c */
            public <T> void mo52255c(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52255c(bVar, dVar);
                UpdatePackage updatePackage = (UpdatePackage) bVar.getInputForType(C14247c.class);
                aVar.mo21858a(updatePackage);
                List<AbstractC14267a> a = C14269c.m57588a().mo52241a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14267a aVar : a) {
                        aVar.mo21858a(updatePackage);
                    }
                }
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                UpdatePackage updatePackage = (UpdatePackage) bVar.getInputForType(C14247c.class);
                aVar.mo21866b(updatePackage, th);
                if (!(updatePackage.getContent() == null || updatePackage.getContent().getStrategy() == null || updatePackage.getContent().getStrategy().getDeleteIfFail() != 1)) {
                    C14276b.m57604a("gecko-debug-tag", "del_if_download_failed");
                    String accessKey = updatePackage.getAccessKey();
                    String channel = updatePackage.getChannel();
                    String str = C14264e.m57551a().mo52225b().get(accessKey);
                    if (str != null) {
                        C14201c.m57329a(new File(new File(str, accessKey), channel));
                    }
                }
                List<AbstractC14267a> a = C14269c.m57588a().mo52241a(updatePackage.getAccessKey(), updatePackage.getChannel());
                if (!(a == null || a.isEmpty())) {
                    for (AbstractC14267a aVar : a) {
                        aVar.mo21866b(updatePackage, th);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    private static AbstractC20231a m57617a(final Class<? extends AbstractC20235d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>>> cls, final AbstractC14267a aVar) {
        if (aVar == null) {
            return null;
        }
        return new AbstractC20231a() {
            /* class com.bytedance.geckox.p773i.C14282a.C142886 */

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52254b(AbstractC20233b<T> bVar, AbstractC20235d dVar) {
                super.mo52254b(bVar, dVar);
                Map<String, List<Pair<String, Long>>> map = (Map) bVar.getInputForType(cls);
                HashMap hashMap = new HashMap();
                for (UpdatePackage updatePackage : (List) bVar.getOutputForType(cls)) {
                    String accessKey = updatePackage.getAccessKey();
                    List list = (List) hashMap.get(accessKey);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(updatePackage);
                    hashMap.put(accessKey, list);
                }
                aVar.mo21864a(map, hashMap);
            }

            @Override // com.bytedance.pipeline.p859a.AbstractC20231a
            /* renamed from: b */
            public <T> void mo52252b(AbstractC20233b<T> bVar, AbstractC20235d dVar, Throwable th) {
                super.mo52252b(bVar, dVar, th);
                Map<String, List<Pair<String, Long>>> map = (Map) bVar.getInputForType(cls);
                if (th instanceof RequestInterceptException) {
                    aVar.mo52236a(((RequestInterceptException) th).getCode(), map, th);
                } else {
                    aVar.mo21863a(map, th);
                }
            }
        };
    }

    /* renamed from: b */
    private static List<C20240h> m57629b(AbstractC14267a aVar, File file, C14218d dVar) {
        return Collections.emptyList();
    }

    /* renamed from: c */
    private static List<C20240h> m57633c(AbstractC14267a aVar, File file, C14218d dVar) {
        return Collections.emptyList();
    }

    /* renamed from: h */
    private static List<C20240h> m57645h(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        return Collections.emptyList();
    }

    /* renamed from: i */
    private static List<C20240h> m57646i(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        return Collections.emptyList();
    }

    /* renamed from: g */
    private static C20240h m57644g(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        AbstractC20247l.C20249b bVar = new AbstractC20247l.C20249b();
        bVar.mo68516a("patch").mo68514a(m57646i(aVar, map, dVar));
        bVar.mo68516a("full").mo68514a(m57645h(aVar, map, dVar));
        return bVar.mo68515a(C14247c.class);
    }

    /* renamed from: d */
    private static C20240h m57638d(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        AbstractC20247l.C20249b bVar = new AbstractC20247l.C20249b();
        bVar.mo68516a("patch").mo68514a(m57641e(aVar, map, dVar));
        bVar.mo68516a("full").mo68514a(m57643f(aVar, map, dVar));
        return bVar.mo68515a(C14247c.class);
    }

    /* renamed from: f */
    private static List<C20240h> m57643f(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14260n.class).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14236b.class).mo68506a(dVar, map, aVar).mo68504a(new C20232b(m57639e(aVar), C14268b.m57586a(C14236b.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14235a.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14235a.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14239e.class).mo68506a(dVar).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14239e.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14238d.class).mo68504a(new C20232b(m57632c(aVar))).mo68507b());
        return arrayList;
    }

    /* renamed from: a */
    private static C20240h m57621a(AbstractC14267a aVar, File file, C14218d dVar) {
        AbstractC20247l.C20249b bVar = new AbstractC20247l.C20249b();
        bVar.mo68516a("patch").mo68514a(m57633c(aVar, file, dVar));
        bVar.mo68516a("full").mo68514a(m57629b(aVar, file, dVar));
        return bVar.mo68515a(C14247c.class);
    }

    /* renamed from: b */
    private static List<C20240h> m57631b(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14260n.class).mo68506a(new Object[0]).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14225b.class).mo68506a(dVar, map, aVar).mo68504a(new C20232b(m57639e(aVar), C14268b.m57586a(C14225b.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14224a.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14224a.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14227d.class).mo68504a(new C20232b(m57632c(aVar), C14268b.m57586a(C14227d.class))).mo68507b());
        return arrayList;
    }

    /* renamed from: e */
    private static List<C20240h> m57641e(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14261o.class).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14242c.class).mo68506a(dVar, map, aVar).mo68504a(new C20232b(m57639e(aVar), C14268b.m57586a(C14242c.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14241b.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14241b.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14244e.class).mo68506a(dVar).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14244e.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14240a.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14240a.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14246g.class).mo68506a(dVar).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14246g.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14245f.class).mo68504a(new C20232b(m57632c(aVar))).mo68507b());
        return arrayList;
    }

    /* renamed from: c */
    private static List<C20240h> m57635c(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14261o.class).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14230c.class).mo68506a(dVar, map, aVar).mo68504a(new C20232b(m57639e(aVar), C14268b.m57586a(C14230c.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14229b.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14229b.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14232e.class).mo68506a(dVar).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14232e.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14228a.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14228a.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14233f.class).mo68504a(new C20232b(m57632c(aVar), C14268b.m57586a(C14233f.class))).mo68507b());
        return arrayList;
    }

    /* renamed from: a */
    private static C20240h m57623a(AbstractC14267a aVar, Map<String, String> map, C14218d dVar) {
        AbstractC20247l.C20249b bVar = new AbstractC20247l.C20249b();
        bVar.mo68516a("patch").mo68514a(m57635c(aVar, map, dVar));
        bVar.mo68516a("full").mo68514a(m57631b(aVar, map, dVar));
        return bVar.mo68515a(C14247c.class);
    }

    /* renamed from: a */
    public static AbstractC20233b<List<UpdatePackage>> m57618a(C14218d dVar, File file, AbstractC14267a aVar, OptionCheckUpdateParams optionCheckUpdateParams) {
        List<C20240h> a = m57624a();
        a.addAll(m57625a(optionCheckUpdateParams, dVar, file, aVar));
        return C20234c.m73894a(a, null);
    }

    /* renamed from: d */
    private static C20240h m57637d(AbstractC14267a aVar, File file, C14218d dVar, boolean z) {
        AbstractC20247l.C20249b bVar = new AbstractC20247l.C20249b();
        bVar.mo68516a("patch").mo68514a(m57642f(aVar, file, dVar, z));
        bVar.mo68516a("full").mo68514a(m57640e(aVar, file, dVar, z));
        return bVar.mo68515a(C14247c.class);
    }

    /* renamed from: b */
    private static List<C20240h> m57630b(AbstractC14267a aVar, File file, C14218d dVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14260n.class).mo68506a(Boolean.valueOf(z)).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14226c.class).mo68506a(dVar, file, aVar).mo68504a(new C20232b(m57639e(aVar), C14268b.m57586a(C14226c.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14224a.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14224a.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14227d.class).mo68504a(new C20232b(m57632c(aVar), C14268b.m57586a(C14227d.class))).mo68507b());
        return arrayList;
    }

    /* renamed from: e */
    private static List<C20240h> m57640e(AbstractC14267a aVar, File file, C14218d dVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14260n.class).mo68506a(Boolean.valueOf(z)).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14237c.class).mo68506a(dVar, file, aVar).mo68504a(new C20232b(m57639e(aVar), C14268b.m57586a(C14237c.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14235a.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14235a.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14239e.class).mo68506a(dVar).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14239e.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14238d.class).mo68504a(new C20232b(m57632c(aVar))).mo68507b());
        return arrayList;
    }

    /* renamed from: c */
    private static List<C20240h> m57634c(AbstractC14267a aVar, File file, C14218d dVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14261o.class).mo68506a(Boolean.valueOf(z)).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14231d.class).mo68506a(dVar, file, aVar).mo68504a(new C20232b(m57639e(aVar), C14268b.m57586a(C14231d.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14229b.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14229b.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14232e.class).mo68506a(dVar).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14232e.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14228a.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14228a.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14233f.class).mo68504a(new C20232b(m57632c(aVar), C14268b.m57586a(C14233f.class))).mo68507b());
        return arrayList;
    }

    /* renamed from: f */
    private static List<C20240h> m57642f(AbstractC14267a aVar, File file, C14218d dVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14261o.class).mo68506a(Boolean.valueOf(z)).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14243d.class).mo68506a(dVar, file, aVar).mo68504a(new C20232b(m57639e(aVar), C14268b.m57586a(C14243d.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14241b.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14241b.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14244e.class).mo68506a(dVar).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14244e.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14240a.class).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14240a.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14246g.class).mo68506a(dVar).mo68504a(new C20232b(m57636d(aVar), C14268b.m57586a(C14246g.class))).mo68507b());
        arrayList.add(C20240h.C20242a.m73913a().mo68505a(C14245f.class).mo68504a(new C20232b(m57632c(aVar))).mo68507b());
        return arrayList;
    }

    /* renamed from: a */
    private static C20240h m57622a(AbstractC14267a aVar, File file, C14218d dVar, boolean z) {
        AbstractC20247l.C20249b bVar = new AbstractC20247l.C20249b();
        bVar.mo68516a("patch").mo68514a(m57634c(aVar, file, dVar, z));
        bVar.mo68516a("full").mo68514a(m57630b(aVar, file, dVar, z));
        return bVar.mo68515a(C14247c.class);
    }

    /* renamed from: a */
    public static AbstractC20233b<Object> m57620a(Map<String, String> map, C14218d dVar, Map<String, LoopRequestModel> map2, LoopInterval.LoopLevel loopLevel, AbstractC20236e eVar) {
        List<C20240h> a = m57624a();
        a.add(C20240h.C20242a.m73913a().mo68505a(C14254h.class).mo68506a(map).mo68507b());
        a.add(C20240h.C20242a.m73913a().mo68505a(C14248d.class).mo68506a(dVar, map, map2, loopLevel, null, eVar).mo68504a(new C20232b(m57617a(C14248d.class, null), C14268b.m57586a(C14248d.class))).mo68507b());
        a.add(C20240h.C20242a.m73913a().mo68505a(C14253g.class).mo68507b());
        a.add(C20240h.C20242a.m73913a().mo68505a(MetaDataUpdateInterceptor.class).mo68507b());
        a.addAll(m57627a((AbstractC14267a) null, map, dVar, (OptionCheckUpdateParams) null));
        return C20234c.m73894a(a, null);
    }

    /* renamed from: a */
    public static AbstractC20233b<Object> m57619a(AbstractC14267a aVar, File file, C14218d dVar, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, String str, OptionCheckUpdateParams optionCheckUpdateParams, AbstractC20236e eVar) {
        List<C20240h> a = m57624a();
        a.add(C20240h.C20242a.m73913a().mo68505a(C14255i.class).mo68506a(file, dVar.mo52138d()).mo68507b());
        a.add(C20240h.C20242a.m73913a().mo68505a(C14250e.class).mo68506a(dVar, map, aVar, str, optionCheckUpdateParams, eVar).mo68504a(new C20232b(m57617a(C14250e.class, aVar), C14268b.m57586a(C14250e.class))).mo68507b());
        a.addAll(m57625a(optionCheckUpdateParams, dVar, file, aVar));
        return C20234c.m73894a(a, null);
    }
}
