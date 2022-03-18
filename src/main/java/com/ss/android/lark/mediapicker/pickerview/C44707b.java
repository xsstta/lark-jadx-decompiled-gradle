package com.ss.android.lark.mediapicker.pickerview;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.AbstractC44634d;
import com.ss.android.lark.mediapicker.album.base.C44632c;
import com.ss.android.lark.mediapicker.widget.OnSingleClickListener;

/* renamed from: com.ss.android.lark.mediapicker.pickerview.b */
public class C44707b extends AbstractC44702a {

    /* renamed from: e */
    public C44711c f113274e;

    /* renamed from: f */
    private C44632c f113275f;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.pickerview.AbstractC44702a
    /* renamed from: a */
    public C44632c mo158378a(View view) {
        this.f113275f = new C44632c.C44633a().mo158198b((TextView) view.findViewById(R.id.btn_media_preview)).mo158192a(view.findViewById(R.id.layout_media_send)).mo158200c((TextView) view.findViewById(R.id.btn_media_send)).mo158195a((RecyclerView) view.findViewById(R.id.recyclerview_photo)).mo158193a((CheckBox) view.findViewById(R.id.cb_original_photo)).mo158197b(view.findViewById(R.id.layout_original_photo)).mo158199c(view.findViewById(R.id.photo_permission_denied_layout)).mo158196a();
        view.findViewById(R.id.camera_btn).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.pickerview.C44707b.C447081 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                C44707b.this.f113267d.mo158159c();
            }
        });
        view.findViewById(R.id.btn_photo_permission_denied).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.pickerview.C44707b.C447092 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                C44707b.this.f113267d.mo158160d();
            }
        });
        view.findViewById(R.id.btn_photo_album).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.pickerview.C44707b.C447103 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                C44707b.this.f113267d.mo158155a(C44707b.this.f113265b, C44707b.this.f113274e.mo158210b());
            }
        });
        return this.f113275f;
    }

    @Override // com.ss.android.lark.mediapicker.pickerview.AbstractC44702a
    /* renamed from: a */
    public AbstractC44634d mo158379a(Context context, MediaPickerConfig mediaPickerConfig) {
        if (this.f113274e == null) {
            this.f113274e = new C44711c(context, mediaPickerConfig);
        }
        return this.f113274e;
    }
}
