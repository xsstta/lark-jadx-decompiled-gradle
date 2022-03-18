package com.bytedance.ee.bear.drive.preload;

import com.bytedance.ee.bear.drive.loader.download.model.C7007a;
import com.bytedance.ee.bear.drive.loader.download.model.p357a.C7008a;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7064c;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.PreviewGetV1Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/preload/PreviewGetHelper;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.preload.g */
public final class PreviewGetHelper {

    /* renamed from: a */
    public static final Companion f19190a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final C7008a m28520a(AbstractC7064c<PreviewGetV1Puller.Params, C7008a> cVar, C7086a aVar) {
        return f19190a.mo27851a(cVar, aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, String> m28521a(C7008a aVar) {
        return f19190a.mo27852a(aVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m28522b(C7008a aVar) {
        return f19190a.mo27853b(aVar);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m28523c(C7008a aVar) {
        return f19190a.mo27854c(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J \u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/preload/PreviewGetHelper$Companion;", "", "()V", "getVideoPreviewUrl", "", "previewGetModel", "Lcom/bytedance/ee/bear/drive/loader/download/model/drive/DrivePreviewGetModel;", "getVideoPreviewUrls", "", "isResultReady", "", "pull", "puller", "Lcom/bytedance/ee/bear/drive/loader/download/platform/api/IApiPuller;", "Lcom/bytedance/ee/bear/drive/loader/download/platform/api/drive/PreviewGetV1Puller$Params;", "fileModel", "Lcom/bytedance/ee/bear/drive/loader/model/DriveFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.preload.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Map<String, String> mo27852a(C7008a aVar) {
            C7007a c;
            if (aVar == null || (c = aVar.mo27544c()) == null) {
                return null;
            }
            return c.mo27540a();
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo27853b(C7008a aVar) {
            if (aVar == null || aVar.mo27542a() != 0) {
                return false;
            }
            return true;
        }

        @JvmStatic
        /* renamed from: c */
        public final String mo27854c(C7008a aVar) {
            C7007a c;
            Map<String, String> a;
            Collection<String> values;
            Iterator<String> it;
            if (aVar == null || (c = aVar.mo27544c()) == null || (a = c.mo27540a()) == null || (values = a.values()) == null || (it = values.iterator()) == null) {
                return null;
            }
            return it.next();
        }

        @JvmStatic
        /* renamed from: a */
        public final C7008a mo27851a(AbstractC7064c<PreviewGetV1Puller.Params, C7008a> cVar, C7086a aVar) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Intrinsics.checkParameterIsNotNull(cVar, "puller");
            Intrinsics.checkParameterIsNotNull(aVar, "fileModel");
            C7086a.C7087a x = aVar.mo27322a();
            if (x != null) {
                str = x.f18785a;
            } else {
                str = null;
            }
            C7086a.C7087a x2 = aVar.mo27322a();
            if (x2 != null) {
                str2 = x2.f19094m;
            } else {
                str2 = null;
            }
            C7086a.C7087a x3 = aVar.mo27322a();
            if (x3 != null) {
                str3 = x3.f19095n;
            } else {
                str3 = null;
            }
            int c = aVar.mo27329c();
            C7086a.C7087a x4 = aVar.mo27322a();
            if (x4 != null) {
                str4 = x4.f19098q;
            } else {
                str4 = null;
            }
            C7086a.C7087a x5 = aVar.mo27322a();
            if (x5 != null) {
                str5 = x5.f18792h;
            } else {
                str5 = null;
            }
            C7008a d = cVar.mo26542a(new PreviewGetV1Puller.Params(str, str2, str3, c, false, str4, str5)).mo238023d();
            Intrinsics.checkExpressionValueIsNotNull(d, "puller.pull(PreviewGetV1….extra)).blockingSingle()");
            return d;
        }
    }
}
