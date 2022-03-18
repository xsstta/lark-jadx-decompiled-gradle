package com.bytedance.ee.larkbrand.nativeMoudule.rich.util;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b;
import com.tt.miniapp.component.nativeview.picker.wheel.C65957d;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.f */
public class C13266f {

    /* renamed from: a */
    public AbstractC13269a f35142a;

    /* renamed from: b */
    private Activity f35143b;

    /* renamed from: c */
    private List<String> f35144c;

    /* renamed from: d */
    private int f35145d;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.f$a */
    public interface AbstractC13269a {
        /* renamed from: a */
        void mo49435a(int i, String str);
    }

    /* renamed from: a */
    public void mo49479a() {
        Activity activity = this.f35143b;
        if (activity != null && !activity.isFinishing()) {
            C65957d dVar = new C65957d(this.f35143b, this.f35144c);
            dVar.mo230802a((AbstractC65914b.AbstractC65917a) new AbstractC65914b.AbstractC65917a() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13266f.C132671 */

                @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b.AbstractC65917a
                /* renamed from: a */
                public void mo49482a() {
                    AppBrandLogger.m52830i("PickViewFunction", "ShowPickerViewHandler onCancel");
                }
            });
            dVar.mo230916a((C65957d.AbstractC65959a) new C65957d.AbstractC65959a<String>() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13266f.C132682 */

                /* renamed from: a */
                public void mo49483a(int i, String str) {
                    AppBrandLogger.m52830i("PickViewFunction", "ShowPickerViewHandler onItemPicked index " + i + " item " + str);
                    if (C13266f.this.f35142a != null) {
                        C13266f.this.f35142a.mo49435a(i, str);
                    }
                }
            });
            dVar.mo230915a(this.f35145d);
            dVar.mo230793c();
        }
    }

    /* renamed from: a */
    public void mo49480a(AbstractC13269a aVar) {
        this.f35142a = aVar;
    }

    public C13266f(Activity activity) {
        this.f35143b = activity;
    }

    /* renamed from: a */
    public void mo49481a(List<String> list, int i) {
        this.f35144c = list;
        this.f35145d = i;
    }
}
