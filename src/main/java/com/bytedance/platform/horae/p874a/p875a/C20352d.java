package com.bytedance.platform.horae.p874a.p875a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.platform.horae.common.C20370a;
import com.bytedance.platform.horae.common.C20371b;
import com.bytedance.platform.horae.p874a.C20345a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.horae.a.a.d */
public class C20352d implements Handler.Callback {

    /* renamed from: a */
    private static C20352d f49670a = new C20352d();

    /* renamed from: b */
    private List<C20345a> f49671b = new ArrayList();

    /* renamed from: c */
    private Handler.Callback f49672c;

    /* renamed from: a */
    static C20352d m74166a() {
        return f49670a;
    }

    /* renamed from: c */
    public List<C20345a> mo68662c() {
        return this.f49671b;
    }

    private C20352d() {
    }

    /* renamed from: b */
    public void mo68661b() {
        try {
            Handler handler = (Handler) C20370a.m74214d();
            Field a = C20371b.m74215a(Handler.class, "mCallback");
            this.f49672c = (Handler.Callback) a.get(handler);
            a.set(handler, this);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo68660a(C20345a aVar) {
        this.f49671b.add(aVar);
    }

    public boolean handleMessage(Message message) {
        if (message.arg2 == 1000089) {
            Handler.Callback callback = this.f49672c;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        } else if (C20346a.m74158b(message)) {
            RunnableC20349c.m74162a().mo68655a(message);
            return true;
        } else if (C20346a.m74159c(message)) {
            C20346a.m74156a(Message.obtain(message));
            return true;
        } else {
            Handler.Callback callback2 = this.f49672c;
            if (callback2 != null) {
                return callback2.handleMessage(message);
            }
            return false;
        }
    }
}
