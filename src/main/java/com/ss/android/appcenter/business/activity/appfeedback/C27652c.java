package com.ss.android.appcenter.business.activity.appfeedback;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a;
import com.ss.android.appcenter.common.adapter.p1288a.C28111c;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.common.view.RoundImageView;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.activity.appfeedback.c */
public class C27652c extends AbstractC28109a<C27651b, C28112d> {

    /* renamed from: a */
    private Context f69030a;

    /* renamed from: b */
    private int f69031b;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public void mo98489a() {
        mo100063a(new C28111c() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.C27652c.C276531 */

            @Override // com.ss.android.appcenter.common.adapter.p1288a.C28111c, com.ss.android.appcenter.common.adapter.p1288a.AbstractC28110b
            /* renamed from: b */
            public void mo98494b(AbstractC28109a aVar, View view, int i) {
                C27652c.this.mo98490a(i);
            }

            @Override // com.ss.android.appcenter.common.adapter.p1288a.C28111c, com.ss.android.appcenter.common.adapter.p1288a.AbstractC28110b
            /* renamed from: a */
            public void mo98493a(AbstractC28109a aVar, View view, int i) {
                C27651b bVar = (C27651b) C27652c.this.mo100065b(i);
                if (bVar != null) {
                    if (bVar.mo98484a() == 0) {
                        C27652c.this.mo98492b();
                    } else {
                        C27652c.this.mo98491a(i, view);
                    }
                }
            }
        });
    }

    /* renamed from: e */
    private void m100976e() {
        this.f69031b = (this.f69030a.getResources().getDisplayMetrics().widthPixels - C28209p.m103293a(this.f69030a, 71.0f)) / 4;
    }

    /* renamed from: b */
    public void mo98492b() {
        if (C27548m.m100547m().mo98226j() != null) {
            List<C27651b> d = mo100070d();
            ArrayList arrayList = new ArrayList();
            for (C27651b bVar : d) {
                if (bVar.mo98488c() != null) {
                    arrayList.add(bVar.mo98488c());
                }
            }
            C27548m.m100547m().mo98226j().mo98198a((Activity) this.f69030a, 4, arrayList);
        }
    }

    /* renamed from: a */
    public void mo98490a(int i) {
        List d = mo100070d();
        if (d != null && d.size() > i) {
            d.remove(i);
            int size = d.size() - 1;
            if (size > 0 && ((C27651b) d.get(size)).mo98487b()) {
                d.add(new C27651b(false));
            }
            notifyDataSetChanged();
        }
    }

    public C27652c(Context context, List<C27651b> list) {
        super(list);
        this.f69030a = context;
        m100976e();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public C28112d mo98307a(ViewGroup viewGroup, int i) {
        return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.appcenter_feedback_image_item, viewGroup, false));
    }

    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public void mo98491a(int i, View view) {
        if (C27548m.m100547m().mo98226j() != null) {
            List<C27651b> d = mo100070d();
            ArrayList arrayList = new ArrayList();
            for (C27651b bVar : d) {
                if (bVar.mo98488c() != null) {
                    arrayList.add(bVar.mo98488c().getPath());
                }
            }
            C27548m.m100547m().mo98226j().mo98199a(this.f69030a, arrayList, i, view, 1, false);
        }
    }

    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public void mo98309a(C28112d dVar, int i) {
        boolean z;
        C27651b bVar = (C27651b) mo100065b(i);
        ViewGroup.LayoutParams layoutParams = dVar.itemView.findViewById(R.id.item).getLayoutParams();
        layoutParams.height = this.f69031b;
        layoutParams.width = this.f69031b;
        int a = bVar.mo98484a();
        boolean z2 = false;
        if (a == 0) {
            z = true;
        } else {
            z = false;
        }
        if (a == 1) {
            z2 = true;
        }
        Drawable drawable = null;
        if (z) {
            drawable = this.f69030a.getResources().getDrawable(R.drawable.appcenter_feedback_addimg_bg, null);
        }
        dVar.mo100072a(R.id.item).setBackground(drawable);
        dVar.mo100075a(R.id.show_img, z2);
        dVar.mo100075a(R.id.delete, z2);
        dVar.mo100075a(R.id.add_img, !z2);
        if (z2) {
            RoundImageView roundImageView = (RoundImageView) dVar.mo100072a(R.id.show_img);
            roundImageView.mo100433a(ContextCompat.getColor(this.f69030a, R.color.line_border_card), (float) C28209p.m103293a(this.f69030a, 1.0f), (float) C28209p.m103293a(this.f69030a, 4.0f));
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            roundImageView.setImageBitmap(BitmapFactory.decodeFile(bVar.mo98488c().getPath(), options));
            mo100066b(dVar.mo100072a(R.id.delete), i);
        }
        mo100062a(dVar.mo100071a(), i);
    }
}
