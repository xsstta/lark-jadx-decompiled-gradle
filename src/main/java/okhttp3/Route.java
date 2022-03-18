package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;
import javax.annotation.Nullable;

public final class Route {
    final Address address;
    final InetSocketAddress inetSocketAddress;
    final Proxy proxy;

    public Address address() {
        return this.address;
    }

    public Proxy proxy() {
        return this.proxy;
    }

    public InetSocketAddress socketAddress() {
        return this.inetSocketAddress;
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.inetSocketAddress.hashCode();
    }

    public boolean requiresTunnel() {
        if (this.address.sslSocketFactory == null || this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Route{" + this.inetSocketAddress + "}";
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (!route.address.equals(this.address) || !route.proxy.equals(this.proxy) || !route.inetSocketAddress.equals(this.inetSocketAddress)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Route(Address address2, Proxy proxy2, InetSocketAddress inetSocketAddress2) {
        Objects.requireNonNull(address2, "address == null");
        Objects.requireNonNull(proxy2, "proxy == null");
        Objects.requireNonNull(inetSocketAddress2, "inetSocketAddress == null");
        this.address = address2;
        this.proxy = proxy2;
        this.inetSocketAddress = inetSocketAddress2;
    }
}
