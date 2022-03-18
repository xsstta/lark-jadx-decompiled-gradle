package com.bytedance.ee.bear.photopicker.photo.p520a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.photopicker.photo.C10497a;
import com.bytedance.ee.bear.photopicker.photo.C10531c;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.a.e */
public class C10520e extends AbstractC10506c {

    /* renamed from: e */
    public C10531c f28261e;

    /* renamed from: f */
    private C10497a f28262f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c
    /* renamed from: a */
    public C10497a mo39883a(View view) {
        this.f28262f = new C10497a.C10498a().mo39854a((TextView) view.findViewById(R.id.btn_photo_preview)).mo39853a(view.findViewById(R.id.layout_photo_send)).mo39859b((TextView) view.findViewById(R.id.btn_photo_send)).mo39855a((RecyclerView) view.findViewById(R.id.recyclerview_photo)).mo39856a((UDCheckBox) view.findViewById(R.id.cb_original_photo)).mo39858b(view.findViewById(R.id.layout_original_photo)).mo39860c(view.findViewById(R.id.photo_permission_denied_layout)).mo39857a();
        view.findViewById(R.id.camera_btn).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.C10520e.View$OnClickListenerC105211 */

            public void onClick(View view) {
                C10520e.this.f28251d.mo39825b();
            }
        });
        view.findViewById(R.id.btn_photo_permission_denied).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.C10520e.View$OnClickListenerC105222 */

            public void onClick(View view) {
                C10520e.this.f28251d.mo39826c();
            }
        });
        view.findViewById(R.id.btn_photo_album).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.C10520e.View$OnClickListenerC105233 */

            public void onClick(View view) {
                C10520e.this.f28251d.mo39822a(C10520e.this.f28249b, C10520e.this.f28261e.mo39903a());
            }
        });
        return this.f28262f;
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c
    /* renamed from: a */
    public C10531c mo39884a(Context context, FileSelectConfig fileSelectConfig) {
        if (this.f28261e == null) {
            this.f28261e = new C10531c(context, fileSelectConfig);
        }
        return this.f28261e;
    }
}
