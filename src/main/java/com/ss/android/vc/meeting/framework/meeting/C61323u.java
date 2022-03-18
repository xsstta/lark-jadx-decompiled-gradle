package com.ss.android.vc.meeting.framework.meeting;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.u */
public class C61323u {

    /* renamed from: c */
    private static volatile SparseArray<C61324a> f153651c;

    /* renamed from: a */
    private C61326c f153652a = new C61326c();

    /* renamed from: b */
    private C61330w f153653b = new C61330w();

    /* renamed from: a */
    public C61330w mo212255a() {
        return this.f153653b;
    }

    /* renamed from: com.ss.android.vc.meeting.framework.meeting.u$a */
    public static class C61324a {

        /* renamed from: a */
        public int f153654a;

        /* renamed from: b */
        public String f153655b;

        /* renamed from: c */
        public String f153656c;

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f153655b);
            if (!TextUtils.isEmpty(this.f153656c)) {
                stringBuffer.append(" ");
                stringBuffer.append(this.f153656c);
            }
            return stringBuffer.toString();
        }

        public C61324a(int i, String str, String str2) {
            this.f153654a = i;
            this.f153655b = str;
            this.f153656c = str2;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.framework.meeting.u$b */
    public static class C61325b {

        /* renamed from: a */
        private int f153657a;

        /* renamed from: b */
        private int f153658b;

        /* renamed from: c */
        private int f153659c;

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("src " + C61323u.m238893b(this.f153657a));
            stringBuffer.append(" ");
            stringBuffer.append("dst " + C61323u.m238893b(this.f153658b));
            stringBuffer.append(" ");
            stringBuffer.append("event " + C61323u.m238892a(this.f153659c));
            return stringBuffer.toString();
        }

        public C61325b(int i, int i2, int i3) {
            this.f153657a = i;
            this.f153658b = i2;
            this.f153659c = i3;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.framework.meeting.u$c */
    public static class C61326c {

        /* renamed from: a */
        private C61325b f153660a = new C61325b(1, 1, 0);

        /* renamed from: b */
        private C61325b f153661b = new C61325b(1, 1, 0);

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("prev " + this.f153660a.toString());
            stringBuffer.append("\n");
            stringBuffer.append("next " + this.f153661b.toString());
            return stringBuffer.toString();
        }
    }

    /* renamed from: a */
    public void mo212256a(C61344j jVar) {
        mo212255a().mo212274a(String.valueOf(jVar.mo212336c()), m238892a(jVar.f153703a));
    }

    /* renamed from: b */
    public static synchronized String m238893b(int i) {
        synchronized (C61323u.class) {
            if (i == 1) {
                return "INIT";
            }
            if (i == 2) {
                return "CALLING";
            }
            if (i == 3) {
                return "RINGING";
            }
            if (i == 4) {
                return "ON_THE_CALL";
            }
            if (i == 5) {
                return "IDLE";
            }
            return "NONE";
        }
    }

    /* renamed from: a */
    public static synchronized String m238892a(int i) {
        String str;
        String str2;
        synchronized (C61323u.class) {
            if (f153651c == null) {
                f153651c = new SparseArray<>();
                Field[] declaredFields = SmEvents.class.getDeclaredFields();
                if (declaredFields != null) {
                    for (Field field : declaredFields) {
                        try {
                            int i2 = field.getInt(null);
                            String name = field.getName();
                            Description description = (Description) field.getAnnotation(Description.class);
                            if (description != null) {
                                str2 = description.desc();
                            } else {
                                str2 = "";
                            }
                            f153651c.put(i2, new C61324a(i2, name, str2));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            C61324a aVar = f153651c.get(i);
            if (aVar != null) {
                str = aVar.f153655b;
            } else {
                str = "null";
            }
        }
        return str;
    }
}
