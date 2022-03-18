package com.tt.miniapp.component.nativeview.picker.wheel;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tt.miniapp.component.nativeview.picker.wheel.WheelView;
import com.tt.miniapphost.util.C67590h;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.d */
public class C65957d<T> extends AbstractC65965f {

    /* renamed from: D */
    public List<T> f166481D = new ArrayList();

    /* renamed from: E */
    public AbstractC65960b<T> f166482E;

    /* renamed from: F */
    public int f166483F = 0;

    /* renamed from: G */
    private List<String> f166484G = new ArrayList();

    /* renamed from: H */
    private WheelView f166485H;

    /* renamed from: I */
    private AbstractC65959a<T> f166486I;

    /* renamed from: J */
    private String f166487J = "";

    /* renamed from: K */
    private int f166488K = -99;

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.d$a */
    public interface AbstractC65959a<T> {
        /* renamed from: a */
        void mo49483a(int i, T t);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.d$b */
    public interface AbstractC65960b<T> {
        /* renamed from: a */
        void mo230919a(int i, T t);
    }

    /* renamed from: n */
    public T mo230918n() {
        return this.f166481D.get(this.f166483F);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b
    /* renamed from: l */
    public void mo230806l() {
        AbstractC65959a<T> aVar = this.f166486I;
        if (aVar != null) {
            aVar.mo49483a(this.f166485H.getSelectedIndex(), mo230918n());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b
    /* renamed from: j */
    public View mo230804j() {
        if (this.f166481D.size() != 0) {
            LinearLayout linearLayout = new LinearLayout(this.f166322a);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            WheelView s = mo230927s();
            this.f166485H = s;
            linearLayout.addView(s);
            if (TextUtils.isEmpty(this.f166487J)) {
                this.f166485H.setLayoutParams(new LinearLayout.LayoutParams(this.f166323b, -2));
            } else {
                this.f166485H.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                TextView t = mo230928t();
                t.setText(this.f166487J);
                linearLayout.addView(t);
            }
            this.f166485H.mo230847a(this.f166484G, this.f166483F);
            this.f166485H.setOnItemSelectListener(new WheelView.AbstractC65935d() {
                /* class com.tt.miniapp.component.nativeview.picker.wheel.C65957d.C659581 */

                @Override // com.tt.miniapp.component.nativeview.picker.wheel.WheelView.AbstractC65935d
                /* renamed from: a */
                public void mo230831a(int i) {
                    C65957d.this.f166483F = i;
                    if (C65957d.this.f166482E != null) {
                        C65957d.this.f166482E.mo230919a(C65957d.this.f166483F, C65957d.this.f166481D.get(i));
                    }
                }
            });
            if (this.f166488K != -99) {
                ViewGroup.LayoutParams layoutParams = this.f166485H.getLayoutParams();
                layoutParams.width = (int) C67590h.m263065a(this.f166322a, (float) this.f166488K);
                this.f166485H.setLayoutParams(layoutParams);
            }
            return linearLayout;
        }
        throw new IllegalArgumentException("Items can't be empty");
    }

    /* renamed from: a */
    public void mo230916a(AbstractC65959a<T> aVar) {
        this.f166486I = aVar;
    }

    /* renamed from: a */
    public void mo230915a(int i) {
        if (i >= 0 && i < this.f166481D.size()) {
            this.f166483F = i;
        }
    }

    /* renamed from: a */
    private String m258339a(T t) {
        if ((t instanceof Float) || (t instanceof Double)) {
            return new DecimalFormat("0.00").format(t);
        }
        return t.toString();
    }

    /* renamed from: a */
    public void mo230917a(List<T> list) {
        if (!(list == null || list.size() == 0)) {
            this.f166481D = list;
            this.f166484G.clear();
            for (T t : list) {
                this.f166484G.add(m258339a((Object) t));
            }
            WheelView wheelView = this.f166485H;
            if (wheelView != null) {
                wheelView.mo230847a(this.f166484G, this.f166483F);
            }
        }
    }

    public C65957d(Activity activity, List<T> list) {
        super(activity);
        mo230917a((List) list);
    }
}
