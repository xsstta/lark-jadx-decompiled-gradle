package com.google.firebase.installations.local;

import com.google.firebase.installations.local.C22866a;
import com.google.firebase.installations.local.PersistedInstallation;

/* renamed from: com.google.firebase.installations.local.c */
public abstract class AbstractC22870c {

    /* renamed from: a */
    public static AbstractC22870c f56535a = m83047p().mo79411a();

    /* renamed from: com.google.firebase.installations.local.c$a */
    public static abstract class AbstractC22871a {
        /* renamed from: a */
        public abstract AbstractC22871a mo79408a(long j);

        /* renamed from: a */
        public abstract AbstractC22871a mo79409a(PersistedInstallation.RegistrationStatus registrationStatus);

        /* renamed from: a */
        public abstract AbstractC22871a mo79410a(String str);

        /* renamed from: a */
        public abstract AbstractC22870c mo79411a();

        /* renamed from: b */
        public abstract AbstractC22871a mo79412b(long j);

        /* renamed from: b */
        public abstract AbstractC22871a mo79413b(String str);

        /* renamed from: c */
        public abstract AbstractC22871a mo79414c(String str);

        /* renamed from: d */
        public abstract AbstractC22871a mo79415d(String str);
    }

    /* renamed from: a */
    public abstract String mo79397a();

    /* renamed from: b */
    public abstract PersistedInstallation.RegistrationStatus mo79398b();

    /* renamed from: c */
    public abstract String mo79399c();

    /* renamed from: d */
    public abstract String mo79400d();

    /* renamed from: e */
    public abstract long mo79401e();

    /* renamed from: f */
    public abstract long mo79403f();

    /* renamed from: g */
    public abstract String mo79404g();

    /* renamed from: h */
    public abstract AbstractC22871a mo79405h();

    /* renamed from: i */
    public boolean mo79422i() {
        if (mo79398b() == PersistedInstallation.RegistrationStatus.REGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo79423j() {
        if (mo79398b() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo79424k() {
        if (mo79398b() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo79426m() {
        if (mo79398b() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public AbstractC22870c mo79427n() {
        return mo79405h().mo79409a(PersistedInstallation.RegistrationStatus.NOT_GENERATED).mo79411a();
    }

    /* renamed from: o */
    public AbstractC22870c mo79428o() {
        return mo79405h().mo79413b((String) null).mo79411a();
    }

    /* renamed from: p */
    public static AbstractC22871a m83047p() {
        return new C22866a.C22868a().mo79412b(0).mo79409a(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).mo79408a(0);
    }

    /* renamed from: l */
    public boolean mo79425l() {
        if (mo79398b() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || mo79398b() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC22870c mo79418a(String str) {
        return mo79405h().mo79410a(str).mo79409a(PersistedInstallation.RegistrationStatus.UNREGISTERED).mo79411a();
    }

    /* renamed from: b */
    public AbstractC22870c mo79421b(String str) {
        return mo79405h().mo79415d(str).mo79409a(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).mo79411a();
    }

    /* renamed from: a */
    public AbstractC22870c mo79419a(String str, long j, long j2) {
        return mo79405h().mo79413b(str).mo79408a(j).mo79412b(j2).mo79411a();
    }

    /* renamed from: a */
    public AbstractC22870c mo79420a(String str, String str2, long j, String str3, long j2) {
        return mo79405h().mo79410a(str).mo79409a(PersistedInstallation.RegistrationStatus.REGISTERED).mo79413b(str3).mo79414c(str2).mo79408a(j2).mo79412b(j).mo79411a();
    }
}
