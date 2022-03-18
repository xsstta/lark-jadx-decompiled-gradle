package com.tt.miniapp.component.nativeview.picker.wheel;

import android.app.Activity;
import com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker;

/* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.e */
public class C65961e extends DateTimePicker {

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.e$a */
    public interface AbstractC65963a {
        /* renamed from: a */
        void mo230924a(String str, String str2);
    }

    public C65961e(Activity activity) {
        this(activity, 3);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: a */
    public final void mo230815a(DateTimePicker.AbstractC65924a aVar) {
        super.mo230815a(aVar);
    }

    /* renamed from: a */
    public void mo230920a(final AbstractC65963a aVar) {
        if (aVar != null) {
            super.mo230815a(new DateTimePicker.AbstractC65926c() {
                /* class com.tt.miniapp.component.nativeview.picker.wheel.C65961e.C659621 */

                @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.AbstractC65926c
                /* renamed from: a */
                public void mo230834a(String str, String str2) {
                    aVar.mo230924a(str, str2);
                }
            });
        }
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: d */
    public void mo230821d(int i, int i2) {
        super.mo230821d(i, i2);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: e */
    public void mo230822e(int i, int i2) {
        super.mo230822e(i, i2);
    }

    /* renamed from: g */
    public void mo230921g(int i, int i2) {
        super.mo230821d(i, i2);
    }

    /* renamed from: h */
    public void mo230922h(int i, int i2) {
        super.mo230822e(i, i2);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: b */
    public final void mo230818b(int i, int i2) {
        throw new UnsupportedOperationException("Date range nonsupport");
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: c */
    public final void mo230820c(int i, int i2) {
        throw new UnsupportedOperationException("Data range nonsupport");
    }

    /* renamed from: k */
    public void mo230923k(int i, int i2) {
        super.mo230813a(0, 0, i, i2);
    }

    public C65961e(Activity activity, int i) {
        super(activity, -1, i);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: f */
    public void mo230823f(int i, int i2) {
        super.mo230821d(i, 0);
        super.mo230822e(i2, 59);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: a */
    public final void mo230812a(int i, int i2, int i3) {
        throw new UnsupportedOperationException("Date range nonsupport");
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: b */
    public final void mo230819b(int i, int i2, int i3) {
        throw new UnsupportedOperationException("Date range nonsupport");
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: a */
    public final void mo230813a(int i, int i2, int i3, int i4) {
        super.mo230813a(i, i2, i3, i4);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: a */
    public final void mo230814a(int i, int i2, int i3, int i4, int i5) {
        super.mo230814a(i, i2, i3, i4, i5);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: a */
    public final void mo230816a(String str, String str2, String str3, String str4, String str5) {
        super.mo230816a(str, str2, str3, str4, str5);
    }
}
