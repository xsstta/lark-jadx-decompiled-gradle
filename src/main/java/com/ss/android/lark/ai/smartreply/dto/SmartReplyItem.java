package com.ss.android.lark.ai.smartreply.dto;

import android.graphics.drawable.Drawable;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;

public class SmartReplyItem {

    /* renamed from: a */
    private String f71999a;

    /* renamed from: b */
    private String f72000b;

    /* renamed from: c */
    private String f72001c;

    /* renamed from: d */
    private Type f72002d;

    /* renamed from: e */
    private C28613a f72003e;

    /* renamed from: f */
    private C28614b f72004f;

    /* renamed from: g */
    private String f72005g;

    /* renamed from: h */
    private Drawable f72006h;

    /* renamed from: i */
    private C28615c f72007i;

    /* renamed from: com.ss.android.lark.ai.smartreply.dto.SmartReplyItem$a */
    public static class C28613a {

        /* renamed from: a */
        private String f72008a;

        /* renamed from: a */
        public String mo101849a() {
            return this.f72008a;
        }

        public C28613a(String str) {
            this.f72008a = str;
        }
    }

    /* renamed from: a */
    public String mo101838a() {
        return this.f71999a;
    }

    /* renamed from: b */
    public String mo101841b() {
        return this.f72000b;
    }

    /* renamed from: c */
    public String mo101842c() {
        return this.f72001c;
    }

    /* renamed from: d */
    public Type mo101843d() {
        return this.f72002d;
    }

    /* renamed from: e */
    public String mo101844e() {
        return this.f72005g;
    }

    /* renamed from: f */
    public Drawable mo101845f() {
        return this.f72006h;
    }

    /* renamed from: g */
    public C28613a mo101846g() {
        return this.f72003e;
    }

    /* renamed from: h */
    public C28614b mo101847h() {
        return this.f72004f;
    }

    /* renamed from: i */
    public C28615c mo101848i() {
        return this.f72007i;
    }

    public enum Type {
        UNKNOWN(0),
        TEXT(1),
        APP_ACTION(2),
        ATTACHMENT(3),
        DOCS(4),
        VOTE(5),
        HONGBAO(6),
        LOCATION(7),
        PROFILE(8),
        CALENDAR(9),
        TODO(10);
        
        private int value;

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return TEXT;
                case 2:
                    return APP_ACTION;
                case 3:
                    return ATTACHMENT;
                case 4:
                    return DOCS;
                case 5:
                    return VOTE;
                case 6:
                    return HONGBAO;
                case 7:
                    return LOCATION;
                case 8:
                    return PROFILE;
                case 9:
                    return CALENDAR;
                case 10:
                    return TODO;
                default:
                    return UNKNOWN;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.ai.smartreply.dto.SmartReplyItem$c */
    public static class C28615c {

        /* renamed from: a */
        public final AbstractC28621d.AbstractC28622a f72013a;

        public C28615c(AbstractC28621d.AbstractC28622a aVar) {
            this.f72013a = aVar;
        }
    }

    /* renamed from: a */
    public void mo101839a(Drawable drawable) {
        this.f72006h = drawable;
    }

    /* renamed from: a */
    public void mo101840a(C28615c cVar) {
        this.f72007i = cVar;
    }

    public SmartReplyItem(String str, Type type) {
        this.f71999a = str;
        this.f72002d = type;
    }

    /* renamed from: com.ss.android.lark.ai.smartreply.dto.SmartReplyItem$b */
    public static class C28614b {

        /* renamed from: a */
        public final Long f72009a;

        /* renamed from: b */
        public final Long f72010b;

        /* renamed from: c */
        public final Integer f72011c;

        /* renamed from: d */
        public final String f72012d;

        public C28614b(Long l, Long l2, Integer num, String str) {
            this.f72009a = l;
            this.f72010b = l2;
            this.f72011c = num;
            this.f72012d = str;
        }
    }

    public SmartReplyItem(String str, String str2, String str3, Type type, C28613a aVar, C28614b bVar, String str4) {
        this.f71999a = str;
        this.f72000b = str2;
        this.f72001c = str3;
        this.f72002d = type;
        this.f72003e = aVar;
        this.f72004f = bVar;
        this.f72005g = str4;
    }
}
