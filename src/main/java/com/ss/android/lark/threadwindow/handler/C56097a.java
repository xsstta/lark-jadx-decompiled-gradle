package com.ss.android.lark.threadwindow.handler;

import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.threadwindow.handler.a */
public class C56097a extends AbstractBaseSettingHandler {

    /* renamed from: a */
    private ThreadHeartbeatSettingBean f138716a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.threadwindow.handler.a$a */
    public static class C56099a {

        /* renamed from: a */
        public static C56097a f138717a = new C56097a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "group_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "ThreadHeartbeatSettingHandler";
    }

    /* renamed from: d */
    public static C56097a m218572d() {
        return C56099a.f138717a;
    }

    /* renamed from: e */
    public int mo107775e() {
        return this.f138716a.getHeartbeatInterval();
    }

    /* renamed from: com.ss.android.lark.threadwindow.handler.a$b */
    public class C56100b implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "ThreadHeartbeatSettingHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return false;
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C56097a.m218572d()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Unit m218574f() {
        this.f138716a.setHeartbeatInterval(2000);
        return null;
    }

    private C56097a() {
        this.f138716a = new ThreadHeartbeatSettingBean();
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.threadwindow.handler.$$Lambda$a$gxwbcRgQcBfQYicLwiE_Z1X2DEU */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C56097a.this.m218573d((String) obj);
            }
        }).mo148428e(new Function0() {
            /* class com.ss.android.lark.threadwindow.handler.$$Lambda$a$LKfeI4oQTaPEUVqNCJh7J2t5vHk */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C56097a.this.m218574f();
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Unit m218573d(String str) {
        this.f138716a = m218571a(str);
        return null;
    }

    /* renamed from: a */
    private ThreadHeartbeatSettingBean m218571a(String str) {
        return (ThreadHeartbeatSettingBean) C38760a.m153056a(str, ThreadHeartbeatSettingBean.class);
    }
}
