package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

public final class Address {
    @Nullable
    final CertificatePinner certificatePinner;
    final List<ConnectionSpec> connectionSpecs;
    final Dns dns;
    @Nullable
    final HostnameVerifier hostnameVerifier;
    final List<Protocol> protocols;
    @Nullable
    final Proxy proxy;
    final Authenticator proxyAuthenticator;
    final ProxySelector proxySelector;
    final SocketFactory socketFactory;
    @Nullable
    final SSLSocketFactory sslSocketFactory;
    final HttpUrl url;

    @Nullable
    public CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public Dns dns() {
        return this.dns;
    }

    @Nullable
    public HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public List<Protocol> protocols() {
        return this.protocols;
    }

    @Nullable
    public Proxy proxy() {
        return this.proxy;
    }

    public Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @Nullable
    public SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public HttpUrl url() {
        return this.url;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31;
        Proxy proxy2 = this.proxy;
        int i4 = 0;
        if (proxy2 != null) {
            i = proxy2.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
        if (sSLSocketFactory != null) {
            i2 = sSLSocketFactory.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        HostnameVerifier hostnameVerifier2 = this.hostnameVerifier;
        if (hostnameVerifier2 != null) {
            i3 = hostnameVerifier2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        CertificatePinner certificatePinner2 = this.certificatePinner;
        if (certificatePinner2 != null) {
            i4 = certificatePinner2.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.url.host());
        sb.append(":");
        sb.append(this.url.port());
        if (this.proxy != null) {
            sb.append(", proxy=");
            sb.append(this.proxy);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.proxySelector);
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (!this.url.equals(address.url) || !equalsNonHost(address)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean equalsNonHost(Address address) {
        if (!this.dns.equals(address.dns) || !this.proxyAuthenticator.equals(address.proxyAuthenticator) || !this.protocols.equals(address.protocols) || !this.connectionSpecs.equals(address.connectionSpecs) || !this.proxySelector.equals(address.proxySelector) || !Util.equal(this.proxy, address.proxy) || !Util.equal(this.sslSocketFactory, address.sslSocketFactory) || !Util.equal(this.hostnameVerifier, address.hostnameVerifier) || !Util.equal(this.certificatePinner, address.certificatePinner) || url().port() != address.url().port()) {
            return false;
        }
        return true;
    }

    public Address(String str, int i, Dns dns2, SocketFactory socketFactory2, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier2, @Nullable CertificatePinner certificatePinner2, Authenticator authenticator, @Nullable Proxy proxy2, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector2) {
        String str2;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        this.url = builder.scheme(str2).host(str).port(i).build();
        Objects.requireNonNull(dns2, "dns == null");
        this.dns = dns2;
        Objects.requireNonNull(socketFactory2, "socketFactory == null");
        this.socketFactory = socketFactory2;
        Objects.requireNonNull(authenticator, "proxyAuthenticator == null");
        this.proxyAuthenticator = authenticator;
        Objects.requireNonNull(list, "protocols == null");
        this.protocols = Util.immutableList(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.connectionSpecs = Util.immutableList(list2);
        Objects.requireNonNull(proxySelector2, "proxySelector == null");
        this.proxySelector = proxySelector2;
        this.proxy = proxy2;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier2;
        this.certificatePinner = certificatePinner2;
    }
}
