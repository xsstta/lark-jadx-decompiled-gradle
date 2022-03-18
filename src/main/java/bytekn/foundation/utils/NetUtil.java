package bytekn.foundation.utils;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lbytekn/foundation/utils/NetUtil;", "", "()V", "encodeUrl", "", "url", "getRemoteIp", "hostUrl", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.e.d */
public final class NetUtil {

    /* renamed from: a */
    public static final NetUtil f5765a = new NetUtil();

    private NetUtil() {
    }

    /* renamed from: a */
    public final String mo8674a(String str) {
        String hostAddress;
        Intrinsics.checkParameterIsNotNull(str, "hostUrl");
        try {
            InetAddress byName = InetAddress.getByName(new URL(str).getHost());
            if (byName == null || (hostAddress = byName.getHostAddress()) == null) {
                return "";
            }
            return hostAddress;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
