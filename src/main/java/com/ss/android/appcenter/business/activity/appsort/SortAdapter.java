package com.ss.android.appcenter.business.activity.appsort;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.JsonArray;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity;
import com.ss.android.appcenter.business.activity.appsort.C27683b;
import com.ss.android.appcenter.business.activity.appsort.SortAdapter;
import com.ss.android.appcenter.business.activity.appsort.TouchDetectFrameLayout;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28128d;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class SortAdapter extends AbstractC28128d {

    /* renamed from: a */
    public static float f69142a;

    /* renamed from: b */
    public static float f69143b;

    /* renamed from: c */
    private C27686c f69144c = new C27686c();

    /* renamed from: d */
    private ItemTouchHelper f69145d;

    /* renamed from: e */
    private JsonArray f69146e;

    /* renamed from: f */
    private JsonArray f69147f;

    /* renamed from: p */
    private TouchDetectFrameLayout f69148p;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemType {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.activity.appsort.SortAdapter$a */
    public interface AbstractC27679a {
        /* renamed from: a */
        void mo98613a(boolean z);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c, com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28128d
    /* renamed from: c */
    public int mo98380c(int i) {
        return R.layout.workplace_sort_sortadapter_divide_view;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: d */
    public int mo98381d(int i) {
        return 4 == i ? R.layout.workplace_sort_sortadapter_header : R.layout.workplace_sort_sortadapter_item;
    }

    /* renamed from: a */
    public void mo98616a(C27686c cVar) {
        this.f69144c = cVar;
        this.f69146e = C28182f.m103239d(mo98373a());
        this.f69147f = C28182f.m103239d(mo98619c());
        notifyDataSetChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo98375a(com.ss.android.appcenter.common.adapter.groupadapter.C28118a r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.activity.appsort.SortAdapter.mo98375a(com.ss.android.appcenter.common.adapter.groupadapter.a, int, int):void");
    }

    /* renamed from: a */
    public void mo98615a(final AbstractC27679a aVar) {
        JsonArray d = C28182f.m103239d(mo98373a());
        JsonArray d2 = C28182f.m103239d(mo98619c());
        final C27700a a = C27700a.m101232a("op_workplace_event");
        a.timing();
        C27711a.m101327a(d, this.f69146e, d2, this.f69147f, new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.activity.appsort.SortAdapter.C276783 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                aVar.mo98613a(false);
                String a = C27580h.m100661a(bVar.f69282a, errorResult);
                C28184h.m103247a("UpdateCommonItem", a, errorResult);
                a.setMonitorCode(C27702b.f69206C).setError(errorResult).setErrorMessage(a).timing().flush();
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                String str = sendHttpResponse.json_body;
                try {
                    if (new JSONObject(str).getInt("code") == 0) {
                        aVar.mo98613a(true);
                        C28184h.m103250d("UpdateCommonItem", C27580h.m100660a());
                        a.setMonitorCode(C27702b.f69205B).timing().flush();
                        return;
                    }
                    aVar.mo98613a(true);
                    String a = C27580h.m100663a(bVar.f69282a, bVar.f69283b, str);
                    C28184h.m103248b("UpdateCommonItem", a);
                    a.setMonitorCode(C27702b.f69206C).setErrorMessage(a).timing().flush();
                } catch (JSONException unused) {
                    aVar.mo98613a(false);
                    String b = C27580h.m100667b(bVar.f69282a, bVar.f69283b, str);
                    C28184h.m103248b("UpdateCommonItem", b);
                    a.setMonitorCode(C27702b.f69206C).setErrorMessage(b).timing().flush();
                }
            }
        });
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c, com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28128d
    /* renamed from: a */
    public void mo98617a(C28118a aVar, int i) {
        C27686c cVar = this.f69144c;
        int i2 = 0;
        boolean z = cVar != null && !cVar.mo98639a();
        View view = aVar.itemView;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    /* renamed from: g */
    private List<ItemInfo> m101151g() {
        return this.f69144c.mo98640b();
    }

    /* renamed from: a */
    public List<ItemInfo> mo98373a() {
        return this.f69144c.mo98641c();
    }

    /* renamed from: c */
    public List<ItemInfo> mo98619c() {
        return this.f69144c.mo98642d();
    }

    /* renamed from: d */
    public List<Integer> mo98620d() {
        return this.f69144c.mo98643e();
    }

    /* renamed from: e */
    public List<Integer> mo98622e() {
        return this.f69144c.mo98644f();
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: b */
    public int mo98377b() {
        return mo98622e().size();
    }

    /* renamed from: f */
    public boolean mo98623f() {
        if (!m101148a(this.f69147f, C28182f.m103239d(mo98619c()))) {
            return true;
        }
        if (!m101148a(this.f69146e, C28182f.m103239d(mo98373a()))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101143a(View view) {
        AppBadgeSettingActivity.f68883c.mo98362a(view.getContext());
    }

    /* renamed from: a */
    private void m101144a(ItemInfo itemInfo) {
        if (itemInfo != null) {
            C27710b.m101297f(itemInfo.getAppId());
        }
    }

    /* renamed from: e */
    public int mo98621e(int i) {
        return ((Integer) C28182f.m103235a(mo98622e(), i, 0)).intValue();
    }

    /* renamed from: a */
    private void m101145a(C28118a aVar) {
        View a = aVar.mo100089a(R.id.ll_app_badge_settings);
        if (a != null) {
            a.setOnClickListener($$Lambda$SortAdapter$f53nCMAr2xoiDlH_OV_sypuqel8.INSTANCE);
        }
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c, com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28128d
    /* renamed from: b */
    public boolean mo98379b(int i) {
        if (i > this.f69144c.mo98643e().size()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public int mo98372a(int i) {
        int intValue = Integer.valueOf(mo98621e(i)).intValue();
        if (intValue == 1) {
            return m101151g().size();
        }
        if (intValue == 2) {
            return mo98373a().size();
        }
        if (intValue == 3) {
            return mo98619c().size();
        }
        if (intValue != 4) {
            return 0;
        }
        return mo98620d().size();
    }

    /* renamed from: a */
    private boolean m101148a(JsonArray jsonArray, JsonArray jsonArray2) {
        if (jsonArray == null || jsonArray2 == null || jsonArray.size() != jsonArray2.size()) {
            return false;
        }
        int size = jsonArray.size();
        for (int i = 0; i < size; i++) {
            try {
                if (!TextUtils.equals(jsonArray.get(i).getAsString(), jsonArray2.get(i).getAsString())) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m101149a(C28118a aVar, View view) {
        this.f69145d.startDrag(aVar);
        C27710b.m101296f();
        return true;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public int mo98614a(int i, int i2) {
        if (mo98622e().get(i).intValue() == 4) {
            return 4;
        }
        return super.mo98614a(i, i2);
    }

    public SortAdapter(Context context, ItemTouchHelper itemTouchHelper, TouchDetectFrameLayout touchDetectFrameLayout) {
        super(context);
        this.f69145d = itemTouchHelper;
        f69142a = (float) C28209p.m103293a(context, 44.0f);
        f69143b = (float) C28209p.m103293a(context, 8.0f);
        this.f69148p = touchDetectFrameLayout;
    }

    /* renamed from: b */
    public void mo98618b(C28118a aVar, int i, int i2) {
        int adapterPosition = aVar.getAdapterPosition();
        if (i == 2) {
            List<ItemInfo> c = this.f69144c.mo98641c();
            if (i2 >= c.size()) {
                C28184h.m103250d("Workplace_Page", "deleteItem>>> out of bounds.");
                return;
            }
            m101144a(c.get(i2));
            c.remove(i2);
            notifyItemRemoved(adapterPosition);
        } else if (i == 3) {
            List<ItemInfo> d = this.f69144c.mo98642d();
            if (i2 >= d.size()) {
                C28184h.m103250d("Workplace_Page", "deleteItem>>> out of bounds.");
                return;
            }
            m101144a(d.get(i2));
            d.remove(i2);
            notifyItemRemoved(adapterPosition);
        }
        notifyItemRangeChanged(adapterPosition, getItemCount() - adapterPosition);
    }

    /* renamed from: b */
    private void m101150b(final C28118a aVar, final int i, final int i2, final C27683b bVar) {
        if (this.f69148p.mo98627a()) {
            bVar.mo98636a(new C27683b.AbstractC27685a() {
                /* class com.ss.android.appcenter.business.activity.appsort.SortAdapter.C276761 */

                @Override // com.ss.android.appcenter.business.activity.appsort.C27683b.AbstractC27685a
                /* renamed from: a */
                public void mo98624a() {
                    aVar.mo100089a(R.id.delete_bt).setOnClickListener(new View.OnClickListener(aVar, i, i2) {
                        /* class com.ss.android.appcenter.business.activity.appsort.$$Lambda$SortAdapter$1$vWUfcvUadH0fPZfZ8B8pOZ9jTqg */
                        public final /* synthetic */ C28118a f$1;
                        public final /* synthetic */ int f$2;
                        public final /* synthetic */ int f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void onClick(View view) {
                            SortAdapter.C276761.this.m101169a(this.f$1, this.f$2, this.f$3, view);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m101169a(C28118a aVar, int i, int i2, View view) {
                    SortAdapter.this.mo98618b(aVar, i, i2);
                }
            });
            this.f69148p.mo98626a(new TouchDetectFrameLayout.AbstractC27681b() {
                /* class com.ss.android.appcenter.business.activity.appsort.SortAdapter.C276772 */

                @Override // com.ss.android.appcenter.business.activity.appsort.TouchDetectFrameLayout.AbstractC27681b
                /* renamed from: a */
                public void mo98625a() {
                    bVar.mo98637b();
                }
            });
        }
    }

    /* renamed from: a */
    private void m101146a(C28118a aVar, int i, int i2, C27683b bVar) {
        aVar.mo100089a(R.id.delete).setOnClickListener(new View.OnClickListener(aVar, i, i2, bVar) {
            /* class com.ss.android.appcenter.business.activity.appsort.$$Lambda$SortAdapter$iEIt6q9xPAlIyCYfzaRkuqlR_M */
            public final /* synthetic */ C28118a f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ C27683b f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onClick(View view) {
                SortAdapter.this.m101147a(this.f$1, this.f$2, this.f$3, this.f$4, view);
            }
        });
        aVar.mo100089a(R.id.delete_bt).setOnClickListener(null);
        aVar.mo100089a(R.id.content).setOnLongClickListener(new View.OnLongClickListener(aVar) {
            /* class com.ss.android.appcenter.business.activity.appsort.$$Lambda$SortAdapter$TdLJGx8RWEJBvn4u_J8rfmLqO5E */
            public final /* synthetic */ C28118a f$1;

            {
                this.f$1 = r2;
            }

            public final boolean onLongClick(View view) {
                return SortAdapter.this.m101149a(this.f$1, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101147a(C28118a aVar, int i, int i2, C27683b bVar, View view) {
        m101150b(aVar, i, i2, bVar);
    }
}
