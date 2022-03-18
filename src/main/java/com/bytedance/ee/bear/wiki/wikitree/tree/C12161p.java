package com.bytedance.ee.bear.wiki.wikitree.tree;

import com.bytedance.ee.util.p702e.C13657b;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.p */
public final class C12161p {

    /* renamed from: a */
    private Map<String, Integer> f32734a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.p$a */
    public static final class C12163a {

        /* renamed from: a */
        public static final C12161p f32735a = new C12161p();
    }

    /* renamed from: a */
    public static C12161p m50531a() {
        return C12163a.f32735a;
    }

    private C12161p() {
        this.f32734a = new HashMap();
        m50534b();
        m50535c();
    }

    /* renamed from: c */
    private void m50535c() {
        m50533a(CommonCode.StatusCode.API_CLIENT_EXPIRED, CommonCode.StatusCode.API_CLIENT_EXPIRED, -1, 0);
        m50533a(1002, CommonCode.StatusCode.API_CLIENT_EXPIRED, -1, 2);
        m50533a(1003, CommonCode.StatusCode.API_CLIENT_EXPIRED, CommonCode.StatusCode.API_CLIENT_EXPIRED, 1);
        m50533a(1003, CommonCode.StatusCode.API_CLIENT_EXPIRED, 1003, 5);
        m50533a(1003, CommonCode.StatusCode.API_CLIENT_EXPIRED, 1004, 99);
        m50533a(1003, CommonCode.StatusCode.API_CLIENT_EXPIRED, 1002, 3);
    }

    /* renamed from: b */
    private void m50534b() {
        m50533a(CommonCode.StatusCode.API_CLIENT_EXPIRED, 1005, -1, R.string.Doc_Wiki_CreateDialog);
        m50533a(CommonCode.StatusCode.API_CLIENT_EXPIRED, 1006, -1, R.string.Doc_Wiki_RemoveDialog);
        m50533a(CommonCode.StatusCode.API_CLIENT_EXPIRED, 1008, -1, R.string.Doc_Wiki_MovePageMoving);
        m50533a(1002, 1006, -1, R.string.Doc_Wiki_RemoveSuccess);
        m50533a(1002, 1008, -1, R.string.Doc_Wiki_MoveSuccess);
        m50533a(1003, 1003, 1003, R.string.Doc_Wiki_ExpandFailPageRemoved);
        m50533a(1003, 1003, 1004, R.string.Doc_Wiki_ExpandFailNoPermission);
        m50533a(1003, 1005, 1003, R.string.Doc_Wiki_CreateFailFatherRemoved);
        m50533a(1003, 1005, 1004, R.string.Doc_Wiki_CreateFailNoPermission);
        m50533a(1003, 1005, 1005, R.string.Doc_Wiki_CreateFailMaximumLimited);
        m50533a(1003, 1006, 1003, R.string.Doc_Wiki_RemoveFailRepeat);
        m50533a(1003, 1006, 1004, R.string.Doc_Wiki_RemoveFailNoPermission);
        m50533a(1003, 1008, 1003, R.string.Doc_Wiki_MoveFailCurrentRemoved);
        m50533a(1003, 1008, 1006, R.string.Doc_Wiki_MoveFailTargetRemoved);
        m50533a(1003, 1008, 1004, R.string.Doc_Wiki_MoveFailNoPermission);
        m50533a(1003, -1, 1007, R.string.Doc_Wiki_Network_Error);
    }

    /* renamed from: b */
    public int mo46492b(int i) {
        return ((Integer) C13657b.m55418a((Object) this.f32734a.get(m50532a(1002, i, -1)), (Object) -1)).intValue();
    }

    /* renamed from: a */
    public int mo46490a(int i) {
        return ((Integer) C13657b.m55418a((Object) this.f32734a.get(m50532a(CommonCode.StatusCode.API_CLIENT_EXPIRED, i, -1)), (Object) -1)).intValue();
    }

    /* renamed from: b */
    public int mo46493b(int i, int i2) {
        return ((Integer) C13657b.m55418a((Object) this.f32734a.get(m50532a(i, CommonCode.StatusCode.API_CLIENT_EXPIRED, i2)), (Object) 3)).intValue();
    }

    /* renamed from: a */
    public int mo46491a(int i, int i2) {
        if (i2 == 1007) {
            i = -1;
        }
        return ((Integer) C13657b.m55418a(this.f32734a.get(m50532a(1003, i, i2)), Integer.valueOf((int) R.string.Doc_Wiki_SeverError))).intValue();
    }

    /* renamed from: a */
    private static String m50532a(int i, int i2, int i3) {
        return String.format("%d$%d$%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    private void m50533a(int i, int i2, int i3, int i4) {
        this.f32734a.put(m50532a(i, i2, i3), Integer.valueOf(i4));
    }
}
