package com.tt.miniapp.component.nativeview.picker.wheel;

import android.app.Activity;
import com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker;

/* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.a */
public class C65939a extends DateTimePicker {

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.a$a */
    protected interface AbstractC65944a {
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.a$b */
    public interface AbstractC65945b extends AbstractC65944a {
        /* renamed from: a */
        void mo230895a(String str, String str2);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.a$c */
    public interface AbstractC65946c extends AbstractC65944a {
        /* renamed from: a */
        void mo230896a(String str, String str2, String str3);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.a$d */
    public interface AbstractC65947d extends AbstractC65944a {
        /* renamed from: a */
        void mo230897a(String str, String str2);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.a$e */
    public interface AbstractC65948e extends AbstractC65944a {
        /* renamed from: a */
        void mo230898a(String str);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: a */
    public final void mo230815a(DateTimePicker.AbstractC65924a aVar) {
        super.mo230815a(aVar);
    }

    /* renamed from: a */
    public void mo230889a(final AbstractC65944a aVar) {
        if (aVar != null) {
            if (aVar instanceof AbstractC65946c) {
                super.mo230815a(new DateTimePicker.AbstractC65928e() {
                    /* class com.tt.miniapp.component.nativeview.picker.wheel.C65939a.C659401 */

                    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.AbstractC65928e
                    /* renamed from: a */
                    public void mo230840a(String str, String str2, String str3, String str4, String str5) {
                        ((AbstractC65946c) aVar).mo230896a(str, str2, str3);
                    }
                });
            } else if (aVar instanceof AbstractC65947d) {
                super.mo230815a(new DateTimePicker.AbstractC65929f() {
                    /* class com.tt.miniapp.component.nativeview.picker.wheel.C65939a.C659412 */

                    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.AbstractC65929f
                    /* renamed from: a */
                    public void mo230841a(String str, String str2, String str3, String str4) {
                        ((AbstractC65947d) aVar).mo230897a(str, str2);
                    }
                });
            } else if (aVar instanceof AbstractC65945b) {
                super.mo230815a(new DateTimePicker.AbstractC65925b() {
                    /* class com.tt.miniapp.component.nativeview.picker.wheel.C65939a.C659423 */

                    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.AbstractC65925b
                    /* renamed from: a */
                    public void mo230833a(String str, String str2, String str3, String str4) {
                        ((AbstractC65945b) aVar).mo230895a(str, str2);
                    }
                });
            } else if (aVar instanceof AbstractC65948e) {
                super.mo230815a(new DateTimePicker.AbstractC65928e() {
                    /* class com.tt.miniapp.component.nativeview.picker.wheel.C65939a.C659434 */

                    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.AbstractC65928e
                    /* renamed from: a */
                    public void mo230840a(String str, String str2, String str3, String str4, String str5) {
                        ((AbstractC65948e) aVar).mo230898a(str);
                    }
                });
            }
        }
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: b */
    public final void mo230818b(int i, int i2) {
        super.mo230818b(i, i2);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: c */
    public final void mo230820c(int i, int i2) {
        super.mo230820c(i, i2);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: f */
    public void mo230823f(int i, int i2) {
        super.mo230823f(i, i2);
    }

    /* renamed from: g */
    public void mo230893g(int i, int i2) {
        super.mo230818b(i, i2);
    }

    /* renamed from: h */
    public void mo230894h(int i, int i2) {
        super.mo230820c(i, i2);
    }

    public C65939a(Activity activity, int i) {
        super(activity, i, -1);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: d */
    public void mo230821d(int i, int i2) {
        throw new UnsupportedOperationException("Time range nonsupport");
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: e */
    public void mo230822e(int i, int i2) {
        throw new UnsupportedOperationException("Time range nonsupport");
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: a */
    public final void mo230812a(int i, int i2, int i3) {
        super.mo230812a(i, i2, i3);
    }

    /* renamed from: d */
    public void mo230891d(int i, int i2, int i3) {
        super.mo230819b(i, i2, i3);
    }

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker
    /* renamed from: b */
    public final void mo230819b(int i, int i2, int i3) {
        super.mo230819b(i, i2, i3);
    }

    /* renamed from: c */
    public void mo230890c(int i, int i2, int i3) {
        super.mo230812a(i, i2, i3);
    }

    /* renamed from: e */
    public void mo230892e(int i, int i2, int i3) {
        super.mo230814a(i, i2, i3, 0, 0);
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
