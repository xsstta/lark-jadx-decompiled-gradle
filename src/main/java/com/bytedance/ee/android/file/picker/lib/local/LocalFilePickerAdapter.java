package com.bytedance.ee.android.file.picker.lib.local;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.android.file.picker.lib.base.BaseAdapter;
import com.bytedance.ee.android.file.picker.lib.dependency.C4044a;
import com.bytedance.ee.android.file.picker.lib.dependency.C4045b;
import com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry;
import com.bytedance.ee.android.file.picker.lib.page.C4098a;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import com.bytedance.ee.android.file.picker.lib.utils.TemplateUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LocalFilePickerAdapter extends BaseAdapter<RecyclerView.ViewHolder, C4059a> {

    /* renamed from: a */
    public List<C4059a> f12303a = new ArrayList();

    /* renamed from: b */
    public List<C4059a> f12304b = new ArrayList();

    /* renamed from: c */
    public List<C4059a> f12305c = new ArrayList();

    /* renamed from: d */
    public boolean f12306d = true;

    /* renamed from: e */
    public boolean f12307e = false;

    /* renamed from: f */
    public boolean f12308f = false;

    /* renamed from: g */
    public boolean f12309g = false;

    /* renamed from: h */
    public boolean f12310h = false;

    /* renamed from: i */
    public boolean f12311i = false;

    /* renamed from: j */
    private Context f12312j;

    /* renamed from: k */
    private Mode f12313k;

    /* renamed from: l */
    private boolean f12314l = false;

    /* renamed from: m */
    private boolean f12315m = false;

    /* renamed from: n */
    private AbstractC4058b f12316n;

    /* renamed from: o */
    private long f12317o;

    public enum Mode {
        SELECT,
        CONFIRM
    }

    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter$b */
    public interface AbstractC4058b {
        /* renamed from: a */
        void mo15931a(C4059a aVar);

        /* renamed from: b */
        void mo15932b(C4059a aVar);
    }

    /* renamed from: c */
    public List<C4059a> mo15920c() {
        return m16890d(this.f12303a);
    }

    /* renamed from: e */
    public List<C4059a> mo15923e() {
        return m16890d(this.f12304b);
    }

    /* renamed from: f */
    public List<C4059a> mo15924f() {
        return m16890d(this.f12305c);
    }

    /* renamed from: d */
    public int mo15922d() {
        List<C4059a> list = this.f12303a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    private void m16892h() {
        if (this.f12314l) {
            final List<C4059a> g = m16891g();
            C1374g.C1377b a = C1374g.m6298a(new C1374g.AbstractC1376a() {
                /* class com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.C40491 */

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: a */
                public int mo7380a() {
                    return LocalFilePickerAdapter.this.getItemCount();
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: b */
                public int mo7382b() {
                    return g.size();
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: a */
                public boolean mo7381a(int i, int i2) {
                    if (LocalFilePickerAdapter.this.getItemViewType(i) == ((C4059a) g.get(i2)).f12337b) {
                        return true;
                    }
                    return false;
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: b */
                public boolean mo7383b(int i, int i2) {
                    return ((C4059a) LocalFilePickerAdapter.this.mo15846a(i)).equals(g.get(i2));
                }
            }, false);
            mo15847a().clear();
            mo15847a().addAll(g);
            a.mo7412a(this);
        }
    }

    /* renamed from: g */
    private List<C4059a> m16891g() {
        ArrayList arrayList = new ArrayList();
        for (C4059a aVar : mo15918b()) {
            if (aVar.f12337b == 2 && this.f12306d) {
                arrayList.add(aVar);
            } else if (aVar.f12337b == 18 && this.f12307e) {
                arrayList.add(aVar);
            } else if (aVar.f12337b == 20 && this.f12308f) {
                arrayList.add(aVar);
            } else if (aVar.f12337b == 22 && this.f12309g) {
                arrayList.add(aVar);
            } else if (aVar.f12337b == 24 && this.f12310h) {
                arrayList.add(aVar);
            } else if (aVar.f12337b == 34 && this.f12311i) {
                arrayList.add(aVar);
            } else if (aVar.mo15937b()) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<C4059a> mo15918b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12303a);
        arrayList.addAll(this.f12304b);
        ArrayList arrayList2 = new ArrayList();
        Iterator<C4059a> it = this.f12305c.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            C4059a next = it.next();
            if (next.mo15937b()) {
                arrayList2.add(next);
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((C4059a) it2.next()).mo15940e() == next.mo15940e()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    arrayList2.add(next);
                }
            }
        }
        if (arrayList2.size() == 1) {
            arrayList2.clear();
        } else if (arrayList2.size() > 1) {
            ((C4059a) arrayList2.get(0)).f12338c = arrayList2.size() - 1;
        }
        this.f12305c = arrayList2;
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    public void mo15913a(AbstractC4058b bVar) {
        this.f12316n = bVar;
    }

    /* renamed from: a */
    public void mo15916a(boolean z) {
        this.f12315m = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((C4059a) mo15846a(i)).f12337b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f12312j = recyclerView.getContext();
    }

    /* renamed from: c */
    public void mo15921c(List<C4059a> list) {
        if (list != null) {
            this.f12305c.clear();
            this.f12305c.addAll(list);
            m16892h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.bytedance.ee.android.file.picker.lib.base.BaseAdapter
    public long getItemId(int i) {
        int hashCode;
        C4059a aVar = (C4059a) mo15846a(i);
        if (aVar.mo15937b()) {
            hashCode = aVar.f12337b;
        } else {
            hashCode = aVar.mo15933a().getUri().hashCode();
        }
        return (long) hashCode;
    }

    /* renamed from: d */
    private List<C4059a> m16890d(List<C4059a> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(list)) {
            for (C4059a aVar : list) {
                if (aVar != null && aVar.mo15947j()) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo15919b(List<C4059a> list) {
        if (list != null) {
            this.f12304b.clear();
            this.f12304b.addAll(list);
            m16892h();
        }
    }

    public LocalFilePickerAdapter(Mode mode) {
        this.f12313k = mode;
        if (mode == Mode.SELECT) {
            this.f12306d = true;
            this.f12307e = false;
            this.f12308f = false;
            this.f12309g = false;
            this.f12310h = false;
            this.f12311i = false;
        } else if (mode == Mode.CONFIRM) {
            this.f12306d = true;
            this.f12307e = true;
            this.f12308f = true;
            this.f12309g = true;
            this.f12310h = true;
            this.f12311i = true;
        }
    }

    /* renamed from: a */
    public void mo15915a(List<C4059a> list) {
        this.f12314l = true;
        if (list != null) {
            this.f12303a.clear();
            this.f12303a.addAll(list);
            m16892h();
        }
    }

    /* renamed from: b */
    private void m16889b(boolean z, View view) {
        if (z) {
            view.setRotation(90.0f);
        } else {
            view.setRotation(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: a */
    public void mo15917a(boolean z, View view) {
        m16892h();
        if (z) {
            m16885a(view, BitmapDescriptorFactory.HUE_RED, 90.0f);
        } else {
            m16885a(view, 90.0f, BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m16888b(C4059a aVar, View view) {
        Uri e = aVar.mo15940e();
        FileUtils.f12473a.mo16106a(view.getContext(), e, FileUtils.m17138a(e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter$a */
    public class C4057a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f12332a;

        /* renamed from: b */
        ImageView f12333b;

        /* renamed from: c */
        TextView f12334c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4057a(View view) {
            super(view);
            LocalFilePickerAdapter.this = r1;
            this.f12332a = view.findViewById(R.id.layout_header);
            this.f12333b = (ImageView) view.findViewById(R.id.image_file_arrow);
            this.f12334c = (TextView) view.findViewById(R.id.text_file_type);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m16886a(C4059a aVar, View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > this.f12317o + 300) {
            AbstractC4058b bVar = this.f12316n;
            if (bVar != null) {
                bVar.mo15931a(aVar);
            }
            this.f12317o = currentTimeMillis;
        }
    }

    /* renamed from: a */
    public void mo15914a(BaseFileEntry baseFileEntry, boolean z) {
        for (C4059a aVar : new ArrayList<C4059a>() {
            /* class com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.C40568 */

            {
                addAll(r2.f12303a);
                addAll(r2.f12304b);
                addAll(r2.f12305c);
            }
        }) {
            if (!(aVar.mo15933a() == null || !aVar.mo15933a().equals(baseFileEntry) || aVar.mo15947j() == z)) {
                aVar.mo15936a(z);
                mo15848a(aVar);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        if (!C4059a.m16911a(i)) {
            LayoutInflater from = LayoutInflater.from(this.f12312j);
            if (DesktopUtil.m144301a(this.f12312j)) {
                i3 = R.layout.file_picker_item_file_chooser_desktop;
            } else {
                i3 = R.layout.file_picker_item_file_chooser;
            }
            return new C4098a(from.inflate(i3, viewGroup, false), this.f12313k);
        }
        LayoutInflater from2 = LayoutInflater.from(this.f12312j);
        if (DesktopUtil.m144301a(this.f12312j)) {
            i2 = R.layout.file_picker_item_file_choose_header_desktop;
        } else {
            i2 = R.layout.file_picker_item_file_choose_header;
        }
        final C4057a aVar = new C4057a(from2.inflate(i2, viewGroup, false));
        if (i == 1) {
            aVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.View$OnClickListenerC40502 */

                public void onClick(View view) {
                    LocalFilePickerAdapter localFilePickerAdapter = LocalFilePickerAdapter.this;
                    boolean z = !localFilePickerAdapter.f12306d;
                    localFilePickerAdapter.f12306d = z;
                    localFilePickerAdapter.mo15917a(z, aVar.f12333b);
                }
            });
        } else if (i == 17) {
            aVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.View$OnClickListenerC40513 */

                public void onClick(View view) {
                    LocalFilePickerAdapter localFilePickerAdapter = LocalFilePickerAdapter.this;
                    boolean z = !localFilePickerAdapter.f12307e;
                    localFilePickerAdapter.f12307e = z;
                    localFilePickerAdapter.mo15917a(z, aVar.f12333b);
                }
            });
        } else if (i == 19) {
            aVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.View$OnClickListenerC40524 */

                public void onClick(View view) {
                    LocalFilePickerAdapter localFilePickerAdapter = LocalFilePickerAdapter.this;
                    boolean z = !localFilePickerAdapter.f12308f;
                    localFilePickerAdapter.f12308f = z;
                    localFilePickerAdapter.mo15917a(z, aVar.f12333b);
                }
            });
        } else if (i == 21) {
            aVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.View$OnClickListenerC40535 */

                public void onClick(View view) {
                    LocalFilePickerAdapter localFilePickerAdapter = LocalFilePickerAdapter.this;
                    boolean z = !localFilePickerAdapter.f12309g;
                    localFilePickerAdapter.f12309g = z;
                    localFilePickerAdapter.mo15917a(z, aVar.f12333b);
                }
            });
        } else if (i == 23) {
            aVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.View$OnClickListenerC40546 */

                public void onClick(View view) {
                    LocalFilePickerAdapter localFilePickerAdapter = LocalFilePickerAdapter.this;
                    boolean z = !localFilePickerAdapter.f12310h;
                    localFilePickerAdapter.f12310h = z;
                    localFilePickerAdapter.mo15917a(z, aVar.f12333b);
                }
            });
        } else if (i == 33) {
            aVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.View$OnClickListenerC40557 */

                public void onClick(View view) {
                    LocalFilePickerAdapter localFilePickerAdapter = LocalFilePickerAdapter.this;
                    boolean z = !localFilePickerAdapter.f12311i;
                    localFilePickerAdapter.f12311i = z;
                    localFilePickerAdapter.mo15917a(z, aVar.f12333b);
                }
            });
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C4059a aVar = (C4059a) mo15846a(i);
        if (aVar.mo15937b()) {
            C4057a aVar2 = (C4057a) viewHolder;
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, aVar.mo15934a(this.f12312j));
            hashMap.put("count", Integer.toString(aVar.f12338c));
            if (DesktopUtil.m144301a(this.f12312j)) {
                aVar2.f12334c.setTextSize(14.0f);
            }
            aVar2.f12334c.setText(TemplateUtils.f12481a.mo16117a(this.f12312j, R.string.Lark_Legacy_FileTypeCount, hashMap));
            int itemViewType = getItemViewType(i);
            if (itemViewType == 1) {
                m16889b(this.f12306d, aVar2.f12333b);
            } else if (itemViewType == 17) {
                m16889b(this.f12307e, aVar2.f12333b);
            } else if (itemViewType == 19) {
                m16889b(this.f12308f, aVar2.f12333b);
            } else if (itemViewType == 21) {
                m16889b(this.f12309g, aVar2.f12333b);
            } else if (itemViewType == 23) {
                m16889b(this.f12310h, aVar2.f12333b);
            } else if (itemViewType == 33) {
                m16889b(this.f12311i, aVar2.f12333b);
            }
        } else {
            C4098a aVar3 = (C4098a) viewHolder;
            aVar3.f12422e.setText(aVar.mo15938c());
            aVar3.f12423f.setText(aVar.mo15939d());
            String f = aVar.mo15942f();
            if (!TextUtils.isEmpty(f)) {
                f = TemplateUtils.f12481a.mo16116a(this.f12312j, R.string.Lark_Legacy_VideoDuration, "duration", f);
            }
            aVar3.f12424g.setText(f);
            if (TextUtils.isEmpty(aVar.mo15943g())) {
                Drawable h = aVar.mo15944h();
                if (h != null) {
                    aVar3.f12421d.setImageDrawable(h);
                } else {
                    aVar3.f12421d.setImageResource(aVar.mo15946i());
                }
            } else if (!this.f12315m) {
                C4045b.C4047a k = C4045b.m16838k();
                k.mo15881a(aVar.mo15946i());
                C4044a.m16834a(this.f12312j, aVar.mo15940e(), aVar3.f12421d, k.mo15882a());
            } else {
                aVar3.f12421d.setImageResource(aVar.mo15946i());
            }
            if (this.f12313k == Mode.SELECT) {
                aVar3.f12420c.setOnClickListener(new View.OnClickListener() {
                    /* class com.bytedance.ee.android.file.picker.lib.local.$$Lambda$LocalFilePickerAdapter$66YDfsNrS4R07DOAnkWet_kbBs */

                    public final void onClick(View view) {
                        LocalFilePickerAdapter.m269060lambda$66YDfsNrS4R07DOAnkWet_kbBs(C4059a.this, view);
                    }
                });
                aVar3.itemView.setOnClickListener(new View.OnClickListener(aVar3, aVar) {
                    /* class com.bytedance.ee.android.file.picker.lib.local.$$Lambda$LocalFilePickerAdapter$TI0rc9QQBHN7s9ciDvJDGgEB5eM */
                    public final /* synthetic */ C4098a f$1;
                    public final /* synthetic */ C4059a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onClick(View view) {
                        LocalFilePickerAdapter.lambda$TI0rc9QQBHN7s9ciDvJDGgEB5eM(LocalFilePickerAdapter.this, this.f$1, this.f$2, view);
                    }
                });
            } else if (this.f12313k == Mode.CONFIRM) {
                aVar3.f12425h.setOnClickListener(new View.OnClickListener(aVar) {
                    /* class com.bytedance.ee.android.file.picker.lib.local.$$Lambda$LocalFilePickerAdapter$8WDz4Y4vhkoue3wXrCQIDz1aYDs */
                    public final /* synthetic */ C4059a f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        LocalFilePickerAdapter.lambda$8WDz4Y4vhkoue3wXrCQIDz1aYDs(LocalFilePickerAdapter.this, this.f$1, view);
                    }
                });
            }
            aVar3.f12419b.setClickable(false);
            aVar3.f12419b.setChecked(aVar.mo15947j());
        }
    }

    /* renamed from: a */
    private void m16885a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", f, f2);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m16887a(C4098a aVar, C4059a aVar2, View view) {
        if (this.f12316n == null) {
            return;
        }
        if (aVar.f12419b.isChecked()) {
            this.f12316n.mo15931a(aVar2);
        } else {
            this.f12316n.mo15932b(aVar2);
        }
    }
}
