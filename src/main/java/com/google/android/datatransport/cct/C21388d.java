package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.datatransport.C21349b;
import com.google.android.datatransport.cct.p970a.AbstractC21352a;
import com.google.android.datatransport.cct.p970a.AbstractC21372j;
import com.google.android.datatransport.cct.p970a.AbstractC21376n;
import com.google.android.datatransport.cct.p970a.AbstractC21379p;
import com.google.android.datatransport.cct.p970a.AbstractC21382r;
import com.google.android.datatransport.cct.p970a.C21375m;
import com.google.android.datatransport.cct.p970a.zzaa;
import com.google.android.datatransport.cct.p970a.zzq;
import com.google.android.datatransport.cct.p970a.zzy;
import com.google.android.datatransport.runtime.AbstractC21433h;
import com.google.android.datatransport.runtime.C21432g;
import com.google.android.datatransport.runtime.backends.AbstractC21414g;
import com.google.android.datatransport.runtime.backends.AbstractC21422m;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.p971a.C21399a;
import com.google.android.datatransport.runtime.p972b.C21404b;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import com.google.firebase.encoders.AbstractC22780a;
import com.google.firebase.encoders.EncodingException;
import com.ss.ttm.player.MediaPlayer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.d */
public final class C21388d implements AbstractC21422m {

    /* renamed from: a */
    final URL f51967a;

    /* renamed from: b */
    private final AbstractC22780a f51968b = C21375m.m77375a();

    /* renamed from: c */
    private final ConnectivityManager f51969c;

    /* renamed from: d */
    private final AbstractC21523a f51970d;

    /* renamed from: e */
    private final AbstractC21523a f51971e;

    /* renamed from: f */
    private final int f51972f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    public static final class C21389a {

        /* renamed from: a */
        final URL f51973a;

        /* renamed from: b */
        final AbstractC21372j f51974b;

        /* renamed from: c */
        final String f51975c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C21389a mo72598a(URL url) {
            return new C21389a(url, this.f51974b, this.f51975c);
        }

        C21389a(URL url, AbstractC21372j jVar, String str) {
            this.f51973a = url;
            this.f51974b = jVar;
            this.f51975c = str;
        }
    }

    /* renamed from: a */
    private static URL m77420a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21422m
    /* renamed from: a */
    public AbstractC21433h mo72597a(AbstractC21433h hVar) {
        int i;
        int i2;
        NetworkInfo activeNetworkInfo = this.f51969c.getActiveNetworkInfo();
        AbstractC21433h.AbstractC21434a a = hVar.mo72684h().mo72685a("sdk-version", Build.VERSION.SDK_INT).mo72687a("model", Build.MODEL).mo72687a("hardware", Build.HARDWARE).mo72687a("device", Build.DEVICE).mo72687a("product", Build.PRODUCT).mo72687a("os-uild", Build.ID).mo72687a("manufacturer", Build.MANUFACTURER).mo72687a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        AbstractC21433h.AbstractC21434a a2 = a.mo72686a("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        if (activeNetworkInfo == null) {
            i = zzy.zzc.zzs.zza();
        } else {
            i = activeNetworkInfo.getType();
        }
        AbstractC21433h.AbstractC21434a a3 = a2.mo72685a("net-type", i);
        if (activeNetworkInfo == null) {
            i2 = zzy.zzb.zza.zza();
        } else {
            i2 = activeNetworkInfo.getSubtype();
            if (i2 == -1) {
                i2 = zzy.zzb.zzu.zza();
            } else if (zzy.zzb.zza(i2) == null) {
                i2 = 0;
            }
        }
        return a3.mo72685a("mobile-subtype", i2).mo72620b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public C21390b m77418a(C21389a aVar) throws IOException {
        InputStream inputStream;
        C21399a.m77445a("CctTransportBackend", "Making request to: %s", aVar.f51973a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f51973a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f51972f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.2.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f51975c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        WritableByteChannel newChannel = Channels.newChannel(httpURLConnection.getOutputStream());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                this.f51968b.mo79199a(aVar.f51974b, new OutputStreamWriter(gZIPOutputStream));
                gZIPOutputStream.close();
                newChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                int responseCode = httpURLConnection.getResponseCode();
                C21399a.m77444a("CctTransportBackend", "Status Code: " + responseCode);
                C21399a.m77444a("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                C21399a.m77444a("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    C21390b bVar = new C21390b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                    newChannel.close();
                    return bVar;
                } else if (responseCode != 200) {
                    return new C21390b(responseCode, null, 0);
                } else {
                    String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                    if (headerField == null || !headerField.equals("gzip")) {
                        inputStream = httpURLConnection.getInputStream();
                    } else {
                        inputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                    }
                    try {
                        C21390b bVar2 = new C21390b(responseCode, null, AbstractC21382r.m77402a(new InputStreamReader(inputStream)).mo72578a());
                        inputStream.close();
                        newChannel.close();
                        return bVar2;
                    } catch (Throwable th) {
                        inputStream.close();
                        throw th;
                    }
                }
            } catch (EncodingException | IOException e) {
                C21399a.m77446a("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                C21390b bVar3 = new C21390b(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, null, 0);
                gZIPOutputStream.close();
                newChannel.close();
                return bVar3;
            } catch (Throwable th2) {
                gZIPOutputStream.close();
                throw th2;
            }
        } finally {
            newChannel.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21422m
    /* renamed from: a */
    public BackendResponse mo72596a(AbstractC21414g gVar) {
        AbstractC21376n.AbstractC21377a aVar;
        HashMap hashMap = new HashMap();
        for (AbstractC21433h hVar : gVar.mo72638a()) {
            String a = hVar.mo72604a();
            if (!hashMap.containsKey(a)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(a, arrayList);
            } else {
                ((List) hashMap.get(a)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC21433h hVar2 = (AbstractC21433h) ((List) entry.getValue()).get(0);
            AbstractC21379p.AbstractC21380a a2 = AbstractC21379p.m77390g().mo72572a(zzaa.zza).mo72571a(this.f51971e.mo72782a()).mo72577b(this.f51970d.mo72782a()).mo72573a(zzq.m77405c().mo72541a(zzq.zzb.zzb).mo72540a(AbstractC21352a.m77302a().mo72510a(hVar2.mo72680a("sdk-version")).mo72511a(hVar2.mo72682c("model")).mo72513b(hVar2.mo72682c("hardware")).mo72514c(hVar2.mo72682c("device")).mo72515d(hVar2.mo72682c("product")).mo72516e(hVar2.mo72682c("os-uild")).mo72517f(hVar2.mo72682c("manufacturer")).mo72518g(hVar2.mo72682c("fingerprint")).mo72512a()).mo72542a());
            try {
                a2.mo72590b(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                a2.mo72591b((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC21433h hVar3 : (List) entry.getValue()) {
                C21432g c = hVar3.mo72606c();
                C21349b a3 = c.mo72675a();
                if (a3.equals(C21349b.m77288a("proto"))) {
                    aVar = AbstractC21376n.m77377a(c.mo72676b());
                } else if (a3.equals(C21349b.m77288a("json"))) {
                    aVar = AbstractC21376n.m77376a(new String(c.mo72676b(), Charset.forName("UTF-8")));
                } else {
                    C21399a.m77448b("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", a3);
                }
                aVar.mo72554a(hVar3.mo72607d()).mo72559b(hVar3.mo72608e()).mo72560c(hVar3.mo72681b("tz-offset")).mo72555a(zzy.m77409c().mo72588a(zzy.zzc.zza(hVar3.mo72680a("net-type"))).mo72587a(zzy.zzb.zza(hVar3.mo72680a("mobile-subtype"))).mo72589a());
                if (hVar3.mo72605b() != null) {
                    aVar.mo72553a(hVar3.mo72605b().intValue());
                }
                arrayList3.add(aVar.mo72558a());
            }
            a2.mo72575a(arrayList3);
            arrayList2.add(a2.mo72576a());
        }
        AbstractC21372j a4 = AbstractC21372j.m77371a(arrayList2);
        String str = null;
        URL url = this.f51967a;
        if (gVar.mo72639b() != null) {
            try {
                C21351a a5 = C21351a.m77295a(gVar.mo72639b());
                if (a5.mo72507d() != null) {
                    str = a5.mo72507d();
                }
                if (a5.mo72508e() != null) {
                    url = m77420a(a5.mo72508e());
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.m77465d();
            }
        }
        try {
            C21390b bVar = (C21390b) C21404b.m77461a(5, new C21389a(url, a4, str), C21386b.m77413a(this), C21387c.m77415a());
            if (bVar.f51976a == 200) {
                return BackendResponse.m77463a(bVar.f51978c);
            }
            int i = bVar.f51976a;
            if (i < 500) {
                if (i != 404) {
                    return BackendResponse.m77465d();
                }
            }
            return BackendResponse.m77464c();
        } catch (IOException e) {
            C21399a.m77446a("CctTransportBackend", "Could not make request to the backend", (Throwable) e);
            return BackendResponse.m77464c();
        }
    }

    /* renamed from: a */
    static /* synthetic */ C21389a m77417a(C21389a aVar, C21390b bVar) {
        URL url = bVar.f51977b;
        if (url == null) {
            return null;
        }
        C21399a.m77445a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo72598a(bVar.f51977b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    public static final class C21390b {

        /* renamed from: a */
        final int f51976a;

        /* renamed from: b */
        final URL f51977b;

        /* renamed from: c */
        final long f51978c;

        C21390b(int i, URL url, long j) {
            this.f51976a = i;
            this.f51977b = url;
            this.f51978c = j;
        }
    }

    C21388d(Context context, AbstractC21523a aVar, AbstractC21523a aVar2) {
        this.f51969c = (ConnectivityManager) context.getSystemService("connectivity");
        this.f51967a = m77420a(C21351a.f51903a);
        this.f51970d = aVar2;
        this.f51971e = aVar;
        this.f51972f = 40000;
    }
}
