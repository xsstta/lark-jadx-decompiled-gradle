package com.ss.android.lark.statistics.p2697k;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.sdk.C53241h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.statistics.k.b */
public class C54957b extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* renamed from: a */
    private C54956a f135712a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.statistics.k.b$b */
    public static class C54960b {

        /* renamed from: a */
        public static C54957b f135713a = new C54957b();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "et_config";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: b */
    public String mo107773b() {
        return "hit_point_sp_key";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "HitPointSettingHandler";
    }

    /* renamed from: d */
    public static C54957b m213226d() {
        return C54960b.f135713a;
    }

    /* renamed from: com.ss.android.lark.statistics.k.b$a */
    public static class C54959a implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "HitPointSettingHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return false;
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C54957b.m213226d()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Unit m213231p() {
        this.f135712a = m213229f();
        m213230g();
        return null;
    }

    private C54957b() {
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.statistics.p2697k.$$Lambda$b$uph9A_5p815GisetivO9Vh4pXa0 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C54957b.this.m213228e((String) obj);
            }
        }).mo148428e(new Function0() {
            /* class com.ss.android.lark.statistics.p2697k.$$Lambda$b$vpjxXUt2_Mghch_LWzbg7uYaIw */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C54957b.this.m213231p();
            }
        }));
    }

    /* renamed from: f */
    private C54956a m213229f() {
        String h = mo148410h();
        if (TextUtils.isEmpty(h)) {
            return new C54956a();
        }
        return m213225a(h);
    }

    /* renamed from: e */
    public int mo107775e() {
        C54956a aVar = this.f135712a;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo187483b();
    }

    /* renamed from: g */
    private synchronized void m213230g() {
        C54956a aVar = this.f135712a;
        if (aVar != null && !CollectionUtils.isEmpty(aVar.mo187482a())) {
            String[] strArr = (String[]) this.f135712a.mo187482a().toArray(new String[this.f135712a.mo187482a().size()]);
            C53241h.m205898b("HitPointSettingHandler", "endpoints:" + Arrays.toString(strArr));
            AppLogProxy.setSendLogUrlRuntime(strArr);
        }
    }

    /* renamed from: d */
    private void m213227d(String str) {
        mo148409c(str);
    }

    /* renamed from: a */
    private C54956a m213225a(String str) {
        return (C54956a) C38760a.m153056a(str, C54956a.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Unit m213228e(String str) {
        this.f135712a = m213225a(str);
        m213227d(str);
        m213230g();
        return null;
    }
}
