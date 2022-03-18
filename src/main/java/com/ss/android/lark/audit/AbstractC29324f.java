package com.ss.android.lark.audit;

import android.content.Context;
import com.ss.android.lark.audit.auth.TransactionalPermData;
import com.ss.android.lark.audit.db.AuditDBData;
import com.ss.android.lark.pb.authorization.PullPermissionResponse;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.audit.f */
public interface AbstractC29324f {

    /* renamed from: com.ss.android.lark.audit.f$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static AbstractC29326b $default$a(AbstractC29324f fVar, Context context) {
            return null;
        }

        public static String $default$a(AbstractC29324f fVar, String str) {
            return null;
        }

        public static void $default$a(AbstractC29324f fVar, AbstractC29327c cVar) {
        }

        public static void $default$a(AbstractC29324f fVar, AbstractC29328d dVar) {
        }

        public static void $default$a(AbstractC29324f fVar, AbstractC29329e eVar) {
        }

        public static void $default$a(AbstractC29324f fVar, String str, String str2, AbstractC29330f fVar2) {
        }

        public static void $default$a(AbstractC29324f fVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        }

        public static boolean $default$a(AbstractC29324f fVar, String str, boolean z) {
            return z;
        }

        public static AbstractC29325a $default$b(AbstractC29324f fVar, Context context) {
            return null;
        }

        public static boolean $default$c(AbstractC29324f fVar) {
            return false;
        }

        public static String $default$d(AbstractC29324f fVar) {
            return null;
        }

        public static int $default$e(AbstractC29324f fVar) {
            return 1;
        }
    }

    /* renamed from: com.ss.android.lark.audit.f$a */
    public interface AbstractC29325a {
        void deleteAuditData(String str, List<AuditDBData> list);

        List<AuditDBData> queryAuditData(String str, int i);

        void recordAuditData(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.audit.f$b */
    public interface AbstractC29326b {
        void deletePermissionData(String str);

        TransactionalPermData queryPermissionData(String str);

        void savePermissionData(String str, String str2, byte[] bArr, byte[] bArr2);
    }

    /* renamed from: com.ss.android.lark.audit.f$c */
    public interface AbstractC29327c {
        /* renamed from: a */
        void mo103832a(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.audit.f$d */
    public interface AbstractC29328d {
        /* renamed from: b */
        void mo103836b(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.audit.f$e */
    public interface AbstractC29329e {
        /* renamed from: c */
        void mo103838c(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.audit.f$f */
    public interface AbstractC29330f {
        /* renamed from: a */
        void mo103841a(PullPermissionResponse pullPermissionResponse);

        /* renamed from: a */
        void mo103842a(String str, String str2);
    }

    /* renamed from: a */
    AbstractC29326b mo103859a(Context context);

    /* renamed from: a */
    String mo103860a();

    /* renamed from: a */
    String mo103861a(String str);

    /* renamed from: a */
    void mo103862a(AbstractC29327c cVar);

    /* renamed from: a */
    void mo103863a(AbstractC29328d dVar);

    /* renamed from: a */
    void mo103864a(AbstractC29329e eVar);

    /* renamed from: a */
    void mo103865a(String str, String str2, AbstractC29330f fVar);

    /* renamed from: a */
    void mo103866a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    boolean mo103867a(String str, boolean z);

    /* renamed from: b */
    AbstractC29325a mo103868b(Context context);

    /* renamed from: b */
    String mo103869b();

    /* renamed from: c */
    boolean mo103870c();

    /* renamed from: d */
    String mo103871d();

    /* renamed from: e */
    int mo103872e();
}
