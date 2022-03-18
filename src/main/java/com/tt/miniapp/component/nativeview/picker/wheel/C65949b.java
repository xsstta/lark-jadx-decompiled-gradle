package com.tt.miniapp.component.nativeview.picker.wheel;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tt.miniapp.component.nativeview.picker.wheel.WheelView;
import com.tt.miniapp.component.nativeview.picker.wheel.entity.C65964a;
import com.tt.miniapphost.util.C67590h;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.b */
public class C65949b<T> extends AbstractC65965f {

    /* renamed from: D */
    protected List<List<T>> f166458D = new ArrayList();

    /* renamed from: E */
    protected AbstractC65951a f166459E;

    /* renamed from: F */
    protected List<WheelView> f166460F;

    /* renamed from: G */
    private List<List<String>> f166461G = new ArrayList();

    /* renamed from: H */
    private int[] f166462H;

    /* renamed from: I */
    private String f166463I = "";

    /* renamed from: J */
    private int f166464J = -99;

    /* renamed from: K */
    private AbstractC65952b f166465K;

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.b$a */
    public interface AbstractC65951a<T> {
        /* renamed from: a */
        void mo230905a(int i, int i2, T t);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.b$b */
    public interface AbstractC65952b {
        /* renamed from: a */
        void mo230906a(int[] iArr);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b
    /* renamed from: l */
    public void mo230806l() {
        List<WheelView> list;
        if (!(this.f166465K == null || (list = this.f166460F) == null)) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = this.f166460F.get(i).getSelectedIndex();
            }
            this.f166465K.mo230906a(iArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b
    /* renamed from: j */
    public View mo230804j() {
        int i;
        if (this.f166458D.size() != 0) {
            LinearLayout linearLayout = new LinearLayout(this.f166322a);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            int size = this.f166458D.size();
            this.f166460F = new ArrayList();
            int a = (int) ((((float) C67590h.m263066a(mo230798h())) / 1.0f) / ((float) size));
            for (int i2 = 0; i2 < size; i2++) {
                final WheelView s = mo230927s();
                this.f166460F.add(s);
                linearLayout.addView(s);
                if (TextUtils.isEmpty(this.f166463I)) {
                    s.setLayoutParams(new LinearLayout.LayoutParams(a, -2));
                }
                int[] iArr = this.f166462H;
                if (iArr != null) {
                    i = iArr[i2];
                } else {
                    i = 0;
                }
                s.mo230847a(this.f166461G.get(i2), i);
                s.setTag(Integer.valueOf(i2));
                s.setOnItemSelectListener(new WheelView.AbstractC65935d() {
                    /* class com.tt.miniapp.component.nativeview.picker.wheel.C65949b.C659501 */

                    @Override // com.tt.miniapp.component.nativeview.picker.wheel.WheelView.AbstractC65935d
                    /* renamed from: a */
                    public void mo230831a(int i) {
                        C65949b.this.mo230900a(s, i);
                    }
                });
            }
            return linearLayout;
        }
        throw new IllegalArgumentException("Items can't be empty");
    }

    /* renamed from: a */
    public void mo230901a(AbstractC65951a aVar) {
        this.f166459E = aVar;
    }

    /* renamed from: a */
    public void mo230902a(AbstractC65952b bVar) {
        this.f166465K = bVar;
    }

    /* renamed from: a */
    public void mo230904a(int[] iArr) {
        this.f166462H = iArr;
    }

    /* renamed from: a */
    public void mo230903a(List<List<T>> list) {
        if (!(list == null || list.size() == 0)) {
            this.f166458D = list;
            this.f166461G.clear();
            for (List<T> list2 : list) {
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    arrayList.add(m258313a((Object) t, list.size()));
                }
                this.f166461G.add(arrayList);
            }
        }
    }

    public C65949b(Activity activity, List<List<T>> list) {
        super(activity);
        mo230903a(list);
        C65964a.m258366a().mo230925a(this);
    }

    /* renamed from: a */
    private String m258313a(T t, int i) {
        if (this.ae) {
            return t.toString();
        }
        if ((t instanceof Float) || (t instanceof Double)) {
            return new DecimalFormat("0.00").format(t);
        }
        return t.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo230900a(WheelView wheelView, int i) {
        List<T> list;
        int intValue = ((Integer) wheelView.getTag()).intValue();
        if (this.f166459E != null && (list = this.f166458D.get(intValue)) != null && list.size() != 0 && list.size() > i) {
            this.f166459E.mo230905a(intValue, i, this.f166458D.get(intValue).get(i));
        }
    }

    /* renamed from: a */
    public void mo230899a(int i, List<T> list, int i2) {
        List<WheelView> list2 = this.f166460F;
        if (list2 != null && list2.size() >= i + 1) {
            WheelView wheelView = this.f166460F.get(i);
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if ((t instanceof String) && this.f166458D != null && !this.ae) {
                    arrayList.add(t.toString());
                }
            }
            List<T> list3 = this.f166458D.get(i);
            list3.clear();
            if (!arrayList.isEmpty()) {
                list3.addAll(arrayList);
                wheelView.setItems(arrayList);
            } else {
                list3.addAll(list);
                wheelView.setItems((List<?>) list);
            }
            wheelView.setSelectedIndex(i2);
        }
    }
}
