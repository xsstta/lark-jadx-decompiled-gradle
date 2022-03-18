package com.google.android.gms.auth.api.signin.internal;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21637f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21676k;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.p975a.C21610a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.auth.api.signin.internal.d */
public final class RunnableC21592d implements Runnable {

    /* renamed from: a */
    private static final C21610a f52525a = new C21610a("RevokeAccessOperation", new String[0]);

    /* renamed from: b */
    private final String f52526b;

    /* renamed from: c */
    private final C21676k f52527c = new C21676k(null);

    private RunnableC21592d(String str) {
        Preconditions.checkNotEmpty(str);
        this.f52526b = str;
    }

    /* renamed from: a */
    public static Thread m78197a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String valueOf = String.valueOf(this.f52526b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                f52525a.mo73187b("Unable to revoke access!", new Object[0]);
            }
            C21610a aVar = f52525a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.mo73185a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C21610a aVar2 = f52525a;
            String valueOf2 = String.valueOf(e.toString());
            aVar2.mo73187b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            C21610a aVar3 = f52525a;
            String valueOf3 = String.valueOf(e2.toString());
            aVar3.mo73187b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f52527c.mo73314b(status);
    }

    /* renamed from: a */
    public static AbstractC21635e<Status> m78196a(String str) {
        if (str == null) {
            return C21637f.m78317a((AbstractC21641i) new Status(4), (AbstractC21631d) null);
        }
        RunnableC21592d dVar = new RunnableC21592d(str);
        m78197a(new Thread(dVar)).start();
        return dVar.f52527c;
    }
}
