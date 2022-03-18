package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Context;
import android.net.Uri;
import androidx.loader.p045a.AbstractC1181a;
import com.bytedance.ee.android.file.picker.lib.callback.IGetDataCallback;
import com.bytedance.ee.android.file.picker.lib.dependency.C4048c;
import com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b;
import com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry;
import com.bytedance.ee.android.file.picker.lib.media.C4085b;
import com.bytedance.ee.android.file.picker.lib.media.C4092d;
import com.bytedance.ee.android.file.picker.lib.media.DocEntry;
import com.bytedance.ee.android.file.picker.lib.mvp.BaseModel;
import com.bytedance.ee.android.file.picker.lib.utils.C4118c;
import com.bytedance.ee.android.file.picker.lib.utils.CollectionUtils;
import com.bytedance.ee.android.file.picker.lib.utils.FileEntryUtils;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.bytedance.ee.android.file.picker.lib.local.e */
public class C4069e extends BaseModel implements AbstractC4060b.AbstractC4061a {

    /* renamed from: a */
    public List<BaseFileEntry> f12358a = new ArrayList();

    /* renamed from: b */
    public List<BaseFileEntry> f12359b = new ArrayList();

    /* renamed from: c */
    public List<BaseFileEntry> f12360c = new ArrayList();

    /* renamed from: d */
    public Map<String, List<BaseFileEntry>> f12361d = new HashMap();

    /* renamed from: e */
    private final int f12362e = C4085b.f12397a.length;

    /* renamed from: f */
    private List<Uri> f12363f = new ArrayList();

    /* renamed from: g */
    private long f12364g = 0;

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: a */
    public List<Uri> mo15948a() {
        return this.f12363f;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    public long i_() {
        return this.f12364g;
    }

    /* renamed from: d */
    private Set<Uri> m16970d() {
        return new HashSet<Uri>() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4069e.C40723 */

            {
                for (BaseFileEntry baseFileEntry : C4069e.this.f12358a) {
                    add(baseFileEntry.getUri());
                }
                for (BaseFileEntry baseFileEntry2 : C4069e.this.f12359b) {
                    add(baseFileEntry2.getUri());
                }
                for (BaseFileEntry baseFileEntry3 : C4069e.this.f12360c) {
                    add(baseFileEntry3.getUri());
                }
            }
        };
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: b */
    public List<Uri> mo15954b() {
        Set<Uri> d = m16970d();
        if (!CollectionUtils.f12469a.mo16095a(d)) {
            for (int size = this.f12363f.size() - 1; size >= 0; size--) {
                Uri uri = this.f12363f.get(size);
                if (!d.contains(uri)) {
                    this.f12363f.remove(uri);
                }
            }
        }
        return this.f12363f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ArrayList m16968a(Context context) {
        return new ArrayList(FileEntryUtils.m17125a(context));
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: b */
    public void mo15955b(long j) {
        if (j > 0) {
            long j2 = this.f12364g;
            if (j2 >= j) {
                this.f12364g = j2 - j;
            }
        }
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: a */
    public void mo15950a(long j) {
        if (j > 0) {
            this.f12364g += j;
        }
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: a */
    public List<BaseFileEntry> mo15949a(List<BaseFileEntry> list) {
        if (list == null || list.isEmpty()) {
            C4048c.m16858c("filterReceivedDocFiles empty list");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            BaseFileEntry baseFileEntry = list.get(size);
            if (baseFileEntry == null || baseFileEntry.getUri() == null) {
                list.remove(size);
            } else {
                int docTypeByFilePath = DocEntry.getDocTypeByFilePath(FileUtils.m17139b(baseFileEntry.getUri()));
                if (DocEntry.isDoc(docTypeByFilePath)) {
                    DocEntry docEntry = new DocEntry();
                    docEntry.setName(baseFileEntry.getName());
                    docEntry.setUri(baseFileEntry.getUri());
                    docEntry.setSize(baseFileEntry.getSize());
                    docEntry.setDocType(docTypeByFilePath);
                    arrayList.add(docEntry);
                    list.remove(size);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: b */
    public boolean mo15957b(Uri uri) {
        if (this.f12363f.contains(uri)) {
            return this.f12363f.remove(uri);
        }
        return false;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: a */
    public boolean mo15953a(Uri uri) {
        if (!this.f12363f.contains(uri)) {
            return this.f12363f.add(uri);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Unit m16969a(IGetDataCallback fVar, ArrayList arrayList) {
        mo15978a(this.f12360c, arrayList, fVar);
        return Unit.INSTANCE;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: a */
    public void mo15952a(Context context, IGetDataCallback<List<BaseFileEntry>> fVar) {
        C4118c.m17122a(new Function0(context) {
            /* class com.bytedance.ee.android.file.picker.lib.local.$$Lambda$e$BNOBj51ssR7pC7AuJcXz_4HIKE */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4069e.m16968a(this.f$0);
            }
        }, new Function1(fVar) {
            /* class com.bytedance.ee.android.file.picker.lib.local.$$Lambda$e$AbWdkNwgyToc22hX0wXzkDChRFI */
            public final /* synthetic */ IGetDataCallback f$1;

            {
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4069e.this.m16969a((C4069e) this.f$1, (IGetDataCallback) ((ArrayList) obj));
            }
        });
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: b */
    public void mo15956b(Context context, AbstractC1181a aVar, final IGetDataCallback<List<BaseFileEntry>> fVar) {
        C4085b.m17040a(context, aVar, new C4085b.AbstractC4090c() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4069e.C40712 */

            @Override // com.bytedance.ee.android.file.picker.lib.media.C4085b.AbstractC4090c
            /* renamed from: a */
            public void mo15981a(List<BaseFileEntry> list, String str, int i) {
                C4069e eVar = C4069e.this;
                eVar.mo15979a(eVar.f12361d, C4069e.this.f12359b, list, str, i, fVar);
            }
        });
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4061a
    /* renamed from: a */
    public void mo15951a(Context context, AbstractC1181a aVar, final IGetDataCallback<List<BaseFileEntry>> fVar) {
        C4092d.m17051a(context, aVar, new C4092d.AbstractC4094b() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4069e.C40701 */

            @Override // com.bytedance.ee.android.file.picker.lib.media.C4092d.AbstractC4094b
            /* renamed from: a */
            public void mo15980a(List<BaseFileEntry> list) {
                C4069e eVar = C4069e.this;
                eVar.mo15978a(eVar.f12358a, list, fVar);
            }
        });
    }

    /* renamed from: a */
    public void mo15978a(List<BaseFileEntry> list, List<BaseFileEntry> list2, IGetDataCallback<List<BaseFileEntry>> fVar) {
        list.clear();
        if (list2 != null) {
            FileEntryUtils.m17129a(list2);
            list.addAll(list2);
        }
        if (fVar != null) {
            fVar.mo15818a(list2);
        }
    }

    /* renamed from: a */
    public void mo15979a(Map<String, List<BaseFileEntry>> map, List<BaseFileEntry> list, List<BaseFileEntry> list2, String str, int i, IGetDataCallback<List<BaseFileEntry>> fVar) {
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        if (i == 1) {
            map.put(str, list2);
        } else if (i == 0 && !map.containsKey(str)) {
            map.put(str, list2);
        }
        if (map.keySet().size() >= this.f12362e) {
            list.clear();
            for (List<BaseFileEntry> list3 : map.values()) {
                FileEntryUtils.m17129a(list3);
                list.addAll(list3);
            }
            if (fVar != null) {
                fVar.mo15818a(list);
            }
        }
    }
}
