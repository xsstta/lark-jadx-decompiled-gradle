package com.bytedance.platform.horae.p874a.p877c.p878a;

import android.os.Looper;
import android.util.Printer;
import com.bytedance.platform.horae.common.C20371b;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.horae.a.c.a.e */
public class C20362e extends AbstractC20357a implements Printer {

    /* renamed from: c */
    private Printer f49699c;

    /* renamed from: a */
    public void mo68692a() {
        try {
            Field a = C20371b.m74215a(Looper.class, "mLogging");
            this.f49699c = (Printer) a.get(Looper.getMainLooper());
            a.set(Looper.getMainLooper(), this);
        } catch (Throwable unused) {
        }
    }

    public C20362e(AbstractC20358b bVar) {
        super("TriggerFromLooperPrinter", bVar);
    }

    public void println(String str) {
        if (str.charAt(0) == '<' && this.f49692b != null) {
            this.f49692b.mo68671a(this.f49691a);
        }
        Printer printer = this.f49699c;
        if (printer != null) {
            printer.println(str);
        }
    }
}
