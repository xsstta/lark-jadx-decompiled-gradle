package com.ss.android.lark.mediapicker.preview;

import android.content.Intent;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.preview.base.AbstractC44720a;
import com.ss.android.lark.mediapicker.preview.base.C44732e;
import com.ss.android.lark.mediapicker.preview.base.C44733f;
import com.ss.android.lark.mediapicker.preview.base.C44738i;

/* renamed from: com.ss.android.lark.mediapicker.preview.a */
public class C44717a extends AbstractC44720a {

    /* renamed from: a */
    private C44732e f113296a;

    /* renamed from: g */
    private C44738i f113297g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44720a
    /* renamed from: a */
    public int mo158400a() {
        return R.layout.picker_activity_preview;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44720a
    /* renamed from: a */
    public void mo158403a(C44738i iVar) {
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44720a
    /* renamed from: b */
    public C44738i mo158404b() {
        if (this.f113297g == null) {
            this.f113297g = new C44738i.C44739a().mo158456a(this.f113307b.findViewById(R.id.btn_back)).mo158457a((CheckBox) this.f113307b.findViewById(R.id.cb_select_media)).mo158460a((ViewPager) this.f113307b.findViewById(R.id.vp_media)).mo158462b(this.f113307b.findViewById(R.id.btn_photo_edit)).mo158458a((FrameLayout) this.f113307b.findViewById(R.id.editor_container)).mo158464c(this.f113307b.findViewById(R.id.layout_media_send)).mo158459a((TextView) this.f113307b.findViewById(R.id.btn_media_send)).mo158463b((CheckBox) this.f113307b.findViewById(R.id.cb_original_photo)).mo158465d(this.f113307b.findViewById(R.id.origin_zone)).mo158461a();
        }
        return this.f113297g;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44720a
    /* renamed from: a */
    public C44732e mo158401a(C44733f fVar) {
        if (this.f113296a == null) {
            this.f113296a = new C44732e(fVar.f113321a, this.f113307b.getSupportFragmentManager());
        }
        return this.f113296a;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b, com.ss.android.lark.mediapicker.preview.base.AbstractC44720a
    /* renamed from: a */
    public void mo158402a(int i, int i2, Intent intent) {
        this.f113308c.mo158440a((EditInfo) intent.getParcelableExtra("result"));
    }
}
