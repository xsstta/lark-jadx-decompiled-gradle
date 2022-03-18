package com.ss.android.lark.audit;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.audit.auth.C29293a;
import com.ss.android.lark.audit.p1377a.C29288e;
import com.ss.android.lark.audit.p1377a.C29291f;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.authorization.AllPermissionData;
import com.ss.android.lark.pb.authorization.C49553Entity;
import com.ss.android.lark.pb.authorization.OperatePermission;
import com.ss.android.lark.pb.authorization.ResultType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AuthorizationManager {

    /* renamed from: a */
    private final C29293a f73300a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckResult {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EntityType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionType {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.audit.AuthorizationManager$1 */
    public static /* synthetic */ class C292811 {

        /* renamed from: a */
        static final /* synthetic */ int[] f73301a;

        /* renamed from: b */
        static final /* synthetic */ int[] f73302b;

        /* renamed from: c */
        static final /* synthetic */ int[] f73303c;

        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(66:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(67:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(68:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(70:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(3:85|86|88)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|88) */
        /* JADX WARNING: Can't wrap try/catch for region: R(75:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|88) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00ab */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00c9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00d3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x00fb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0105 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x010f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0127 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x014e */
        static {
            /*
            // Method dump skipped, instructions count: 345
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.audit.AuthorizationManager.C292811.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo103792a(int i) {
        return mo103793a(i, 1, (String) null);
    }

    /* renamed from: a */
    private int m107623a(ResultType resultType) {
        int i = C292811.f73301a[resultType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i != 2) {
                if (i != 3) {
                    return 0;
                }
                return 2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private int m107621a(com.ss.android.lark.pb.authorization.EntityType entityType) {
        switch (C292811.f73303c[entityType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private int m107622a(com.ss.android.lark.pb.authorization.PermissionType permissionType) {
        switch (C292811.f73302b[permissionType.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public void mo103795a(boolean z) {
        this.f73300a.mo103833a(z);
    }

    AuthorizationManager(Context context, AbstractC29324f fVar) {
        this.f73300a = new C29293a(context, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo103793a(int i, int i2, String str) {
        return mo103794a(this.f73300a.mo103826a(), i, i2, str);
    }

    /* renamed from: a */
    private boolean m107624a(C49553Entity entity, int i, String str) {
        if (m107621a(entity.mentity_type) != i || !TextUtils.equals(entity.mid, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m107625b(AllPermissionData allPermissionData, int i, int i2, String str) {
        if (!(allPermissionData == null || allPermissionData.moperate_permission_data == null)) {
            if (C29291f.m107667a(allPermissionData)) {
                Log.m165389i("AuditPerm_Manager", "permission data expired at " + allPermissionData.mexpire_time);
                this.f73300a.mo103835b();
                return 3;
            }
            for (OperatePermission operatePermission : allPermissionData.moperate_permission_data) {
                if (!(operatePermission == null || operatePermission.mperm_type == null || operatePermission.mobject == null || m107622a(operatePermission.mperm_type) != i || !m107624a(operatePermission.mobject, i2, str))) {
                    return m107623a(operatePermission.mresult);
                }
            }
            for (OperatePermission operatePermission2 : allPermissionData.moperate_permission_data) {
                if (!(operatePermission2 == null || operatePermission2.mperm_type == null || operatePermission2.mobject == null || m107622a(operatePermission2.mperm_type) != i || m107621a(operatePermission2.mobject.mentity_type) != 1)) {
                    return m107623a(operatePermission2.mresult);
                }
            }
        }
        return 3;
    }

    /* renamed from: a */
    public int mo103794a(AllPermissionData allPermissionData, int i, int i2, String str) {
        String str2;
        int b = m107625b(allPermissionData, i, i2, str);
        if (b == 1) {
            str2 = "deny";
        } else if (b == 2) {
            str2 = "allow";
        } else if (b != 3) {
            str2 = "unknown";
        } else {
            str2 = "null";
        }
        C29288e.m107657a().mo103810a(str2);
        Log.m165389i("AuditPerm_Manager", "doCheck permissionType: " + i + ", result: " + str2);
        return b;
    }
}
