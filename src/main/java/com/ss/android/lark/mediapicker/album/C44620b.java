package com.ss.android.lark.mediapicker.album;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.AbstractC44634d;
import com.ss.android.lark.mediapicker.album.base.AbstractC44641e;
import com.ss.android.lark.mediapicker.album.base.C44632c;

/* renamed from: com.ss.android.lark.mediapicker.album.b */
public class C44620b extends AbstractC44641e {

    /* renamed from: g */
    private C44618a f113097g;

    /* renamed from: h */
    private C44632c f113098h;

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44641e
    /* renamed from: a */
    public int mo158139a() {
        return R.layout.picker_activity_album;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b, com.ss.android.lark.mediapicker.album.base.AbstractC44641e
    /* renamed from: a */
    public void mo158142a(int i) {
        super.mo158142a(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44641e
    /* renamed from: a */
    public C44632c mo158140a(View view) {
        C44632c a = new C44632c.C44633a().mo158194a((TextView) view.findViewById(R.id.folders)).mo158201d((TextView) view.findViewById(R.id.btn_back)).mo158198b((TextView) view.findViewById(R.id.btn_media_preview)).mo158192a(view.findViewById(R.id.layout_media_send)).mo158200c((TextView) view.findViewById(R.id.btn_media_send)).mo158195a((RecyclerView) view.findViewById(R.id.recycler_grid)).mo158193a((CheckBox) view.findViewById(R.id.cb_original_photo)).mo158197b(view.findViewById(R.id.layout_original_photo)).mo158196a();
        this.f113098h = a;
        return a;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44641e
    /* renamed from: a */
    public AbstractC44634d mo158141a(Context context, MediaPickerConfig mediaPickerConfig) {
        if (this.f113097g == null) {
            this.f113097g = new C44618a(context, mediaPickerConfig);
        }
        return this.f113097g;
    }
}
