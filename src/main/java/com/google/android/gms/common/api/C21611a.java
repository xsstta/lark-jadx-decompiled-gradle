package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.C21611a.AbstractC21615d;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C21611a<O extends AbstractC21615d> {

    /* renamed from: a */
    private final AbstractC21612a<?, O> f52560a;

    /* renamed from: b */
    private final AbstractC21625i<?, O> f52561b = null;

    /* renamed from: c */
    private final C21623g<?> f52562c;

    /* renamed from: d */
    private final C21626j<?> f52563d;

    /* renamed from: e */
    private final String f52564e;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class AbstractC21612a<T extends AbstractC21622f, O> extends AbstractC21621e<T, O> {
        /* renamed from: a */
        public abstract T mo72954a(Context context, Looper looper, C21740c cVar, O o, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface AbstractC21613b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C21614c<C extends AbstractC21613b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface AbstractC21615d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface AbstractC21616a extends AbstractC21618c, AbstractC21619d {
            /* renamed from: a */
            Account mo73224a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface AbstractC21617b extends AbstractC21618c {
            /* renamed from: a */
            GoogleSignInAccount mo73225a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface AbstractC21618c extends AbstractC21615d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface AbstractC21619d extends AbstractC21615d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface AbstractC21620e extends AbstractC21618c, AbstractC21619d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface AbstractC21622f extends AbstractC21613b {
        void connect(BaseGmsClient.AbstractC21720a aVar);

        void disconnect();

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        int getMinApkVersion();

        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        IBinder getServiceBrokerBinder();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(BaseGmsClient.AbstractC21722c cVar);

        boolean providesSignIn();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C21623g<C extends AbstractC21622f> extends C21614c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface AbstractC21624h<T extends IInterface> extends AbstractC21613b {
        /* renamed from: a */
        T mo73239a(IBinder iBinder);

        /* renamed from: a */
        String mo73240a();

        /* renamed from: a */
        void mo73241a(int i, T t);

        /* renamed from: b */
        String mo73242b();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class AbstractC21625i<T extends AbstractC21624h, O> extends AbstractC21621e<T, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    public static final class C21626j<C extends AbstractC21624h> extends C21614c<C> {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends AbstractC21622f> C21611a(String str, AbstractC21612a<C, O> aVar, C21623g<C> gVar) {
        Preconditions.checkNotNull(aVar, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(gVar, "Cannot construct an Api with a null ClientKey");
        this.f52564e = str;
        this.f52560a = aVar;
        this.f52562c = gVar;
        this.f52563d = null;
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class AbstractC21621e<T extends AbstractC21613b, O> {
        /* renamed from: a */
        public int mo73226a() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public List<Scope> mo73020a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final AbstractC21621e<?, O> mo73220a() {
        return this.f52560a;
    }

    /* renamed from: b */
    public final AbstractC21612a<?, O> mo73221b() {
        Preconditions.checkState(this.f52560a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f52560a;
    }

    /* renamed from: c */
    public final C21614c<?> mo73222c() {
        C21623g<?> gVar = this.f52562c;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: d */
    public final String mo73223d() {
        return this.f52564e;
    }
}
