package com.ss.android.vc.meeting.module.subtitle;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.module.subtitle.AbstractC63140c;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.h */
public class C63161h extends AbstractC63140c {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63140c
    /* renamed from: b */
    public void mo218602b(RecyclerView.ViewHolder viewHolder) {
        ViewCompat.m4064c(viewHolder.itemView, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4057b(viewHolder.itemView, (float) viewHolder.itemView.getHeight());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63140c
    /* renamed from: c */
    public void mo218603c(RecyclerView.ViewHolder viewHolder) {
        ViewCompat.m4103r(viewHolder.itemView).mo4723a(BitmapDescriptorFactory.HUE_RED).mo4724a(300L).mo4725a(this.f159114h).mo4727a(new AbstractC63140c.C63149c(viewHolder)).mo4729b(mo218606f(viewHolder)).mo4732c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63140c
    /* renamed from: d */
    public void mo218604d(RecyclerView.ViewHolder viewHolder) {
        ViewCompat.m4103r(viewHolder.itemView).mo4731c(BitmapDescriptorFactory.HUE_RED).mo4723a(1.0f).mo4724a(300L).mo4725a(this.f159114h).mo4727a(new AbstractC63140c.C63148b(viewHolder)).mo4729b(mo218607g(viewHolder)).mo4732c();
    }
}
