package com.larksuite.framework.utils.file;

import android.content.Context;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/larksuite/framework/utils/file/FileAccessDependency;", "", "()V", "IContext", "ILogger", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.file.a */
public final class FileAccessDependency {

    /* renamed from: a */
    public static final FileAccessDependency f64872a = new FileAccessDependency();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/larksuite/framework/utils/file/FileAccessDependency$IContext;", "", "getContext", "Landroid/content/Context;", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.utils.file.a$a */
    public interface IContext {
        /* renamed from: a */
        Context mo93387a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\b\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/larksuite/framework/utils/file/FileAccessDependency$ILogger;", "", C63690d.f160779a, "", "tag", "", "message", "e", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "i", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.utils.file.a$b */
    public interface ILogger {
        /* renamed from: a */
        void mo93388a(Exception exc);

        /* renamed from: a */
        void mo93389a(String str, String str2);
    }

    private FileAccessDependency() {
    }
}
