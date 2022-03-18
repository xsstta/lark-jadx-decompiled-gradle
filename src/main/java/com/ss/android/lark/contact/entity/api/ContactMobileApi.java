package com.ss.android.lark.contact.entity.api;

import androidx.fragment.app.Fragment;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.entity.mobile.item.ContactMobileItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface ContactMobileApi {

    public enum ContactType {
        EMAIL,
        PHONE
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface From {
    }

    /* renamed from: com.ss.android.lark.contact.entity.api.ContactMobileApi$b */
    public interface AbstractC35403b {
        /* renamed from: a */
        void mo130580a(long j);

        /* renamed from: a */
        void mo130581a(List<ContactMobileBean> list);

        /* renamed from: b */
        void mo130582b(List<ContactMobileBean> list);
    }

    /* renamed from: com.ss.android.lark.contact.entity.api.ContactMobileApi$c */
    public interface AbstractC35404c {
        /* renamed from: a */
        boolean mo130583a();
    }

    /* renamed from: a */
    Fragment mo130575a(ContactType contactType, C35402a aVar, String str);

    /* renamed from: com.ss.android.lark.contact.entity.api.ContactMobileApi$a */
    public static class C35402a {

        /* renamed from: c */
        private static final C35402a f91447c = new C35402a();

        /* renamed from: d */
        private static final C35402a f91448d = new C35402a();

        /* renamed from: a */
        private String f91449a = "";

        /* renamed from: b */
        private boolean f91450b;

        /* renamed from: a */
        public static C35402a m138368a() {
            return f91447c;
        }

        /* renamed from: b */
        public static C35402a m138370b() {
            return f91448d;
        }

        /* renamed from: e */
        public String mo130578e() {
            return this.f91449a;
        }

        /* renamed from: f */
        public boolean mo130579f() {
            return this.f91450b;
        }

        private C35402a() {
        }

        /* renamed from: c */
        public boolean mo130576c() {
            return equals(f91448d);
        }

        /* renamed from: d */
        public boolean mo130577d() {
            return equals(f91447c);
        }

        /* renamed from: a */
        public static C35402a m138369a(String str, boolean z) {
            C35402a aVar = f91448d;
            aVar.f91449a = str;
            aVar.f91450b = z;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.lark.contact.entity.api.ContactMobileApi$d */
    public static class C35405d {

        /* renamed from: a */
        public static final int UiMessageContactMobileUpdateItem = 2131296326;

        /* renamed from: b */
        private List<ContactMobileItem> f91451b;

        /* renamed from: a */
        public List<ContactMobileItem> mo130584a() {
            return this.f91451b;
        }

        /* renamed from: a */
        public void mo130585a(List<ContactMobileItem> list) {
            this.f91451b = list;
        }
    }
}
