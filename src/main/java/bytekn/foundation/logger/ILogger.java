package bytekn.foundation.logger;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J \u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lbytekn/foundation/logger/ILogger;", "", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "logDebug", "", "tag", "", "message", "logError", ApiHandler.API_CALLBACK_EXCEPTION, "", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.c.a */
public interface ILogger {
    /* renamed from: a */
    void mo8657a(String str, String str2);

    /* renamed from: a */
    void mo8658a(String str, String str2, Throwable th);

    /* renamed from: a */
    boolean mo8659a();

    /* renamed from: b */
    void mo8660b(String str, String str2);
}
