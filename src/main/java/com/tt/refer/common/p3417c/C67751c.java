package com.tt.refer.common.p3417c;

import android.text.TextUtils;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.refer.common.download.engine.p3421c.p3422a.AbstractC67767c;
import com.tt.refer.common.pkg.C67831h;

/* renamed from: com.tt.refer.common.c.c */
public class C67751c {
    /* renamed from: a */
    public static String m263613a(int i) {
        return i != 1 ? i != 2 ? "normal" : "preload" : "async";
    }

    /* renamed from: b */
    public static String m263615b(int i) {
        return i != 0 ? i != 1 ? "unknown" : "jssdk" : "meta";
    }

    /* renamed from: c */
    public static OPMonitorCode m263616c(String str) {
        if (TextUtils.isEmpty(str) || AbstractC67767c.C67768a.f170660a.mo235193b().equals(str)) {
            return C67746a.f170618f;
        }
        if (str.equals(AbstractC67767c.C67768a.f170661b.mo235193b())) {
            return C67746a.f170620h;
        }
        if (str.equals(AbstractC67767c.C67768a.f170668i.mo235193b())) {
            return C67746a.f170615c;
        }
        return C67746a.f170618f;
    }

    /* renamed from: b */
    public static OPMonitorCode m263614b(String str) {
        if (TextUtils.isEmpty(str) || C67831h.f170839f.mo235454b().equals(str)) {
            return C67746a.f170603D;
        }
        if (str.equals(C67831h.f170841h.mo235454b())) {
            return C67746a.f170609J;
        }
        if (str.equals(C67831h.f170842i.mo235454b())) {
            return C67746a.f170607H;
        }
        if (str.equals(C67831h.f170840g)) {
            return C67746a.f170601B;
        }
        return C67746a.f170603D;
    }

    /* renamed from: a */
    public static OPMonitorCode m263611a(String str) {
        if (TextUtils.isEmpty(str) || AbstractC67767c.C67768a.f170660a.mo235193b().equals(str)) {
            return C67746a.f170632t;
        }
        if (str.equals(AbstractC67767c.C67768a.f170661b.mo235193b())) {
            return C67746a.f170634v;
        }
        if (str.equals(AbstractC67767c.C67768a.f170662c.mo235193b())) {
            return C67746a.f170630r;
        }
        if (str.equals(AbstractC67767c.C67768a.f170663d.mo235193b()) || str.equals(AbstractC67767c.C67768a.f170664e.mo235193b()) || str.equals(AbstractC67767c.C67768a.f170675p.mo235193b())) {
            return C67746a.f170607H;
        }
        if (str.equals(AbstractC67767c.C67768a.f170672m.mo235193b()) || str.equals(AbstractC67767c.C67768a.f170666g.mo235193b())) {
            return C67746a.f170636x;
        }
        if (str.equals(AbstractC67767c.C67768a.f170668i.mo235193b())) {
            return C67746a.f170635w;
        }
        if (str.equals(AbstractC67767c.C67768a.f170671l.mo235193b())) {
            return C67746a.f170638z;
        }
        if (str.equals(AbstractC67767c.C67768a.f170673n.mo235193b())) {
            return C67746a.f170633u;
        }
        if (str.equals(AbstractC67767c.C67768a.f170674o.mo235193b())) {
            return C67746a.f170600A;
        }
        if (str.equals(AbstractC67767c.C67768a.f170667h.mo235193b())) {
            return C67746a.f170637y;
        }
        if (str.equals("-7")) {
            return C67746a.f170608I;
        }
        if (str.equals("-1")) {
            return C67746a.f170609J;
        }
        if (str.equals("-3") || str.equals("-6")) {
            return C67746a.f170605F;
        }
        return C67746a.f170632t;
    }

    /* renamed from: a */
    public static OPMonitorCode m263612a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str.startsWith("meta_server_error:")) {
            return C67746a.f170625m;
        }
        if (TextUtils.isEmpty(str)) {
            return C67746a.f170623k;
        }
        if (str.equals(ErrorCode.META.INVALID_TT_CODE.getCode())) {
            return C67746a.f170622j;
        }
        if (str.equals(ErrorCode.META.NULL.getCode()) || str.equals(ErrorCode.META.JSON_ERROR.getCode())) {
            return C67746a.f170626n;
        }
        return C67746a.f170623k;
    }
}
