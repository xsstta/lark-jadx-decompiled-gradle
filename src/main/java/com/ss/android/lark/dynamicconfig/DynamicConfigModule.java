package com.ss.android.lark.dynamicconfig;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.dynamicconfig.interfaces.IDomainConfigService;
import com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService;
import com.ss.android.lark.dynamicconfig.p1819a.AbstractC36883a;
import com.ss.android.lark.dynamicconfig.service.impl.C36885b;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class DynamicConfigModule {

    /* renamed from: a */
    private static C36885b f94806a = C36885b.m145580c();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    /* renamed from: b */
    public static IDomainConfigService m145552b() {
        return f94806a;
    }

    /* renamed from: d */
    public static String m145555d() {
        return f94806a.mo136187f();
    }

    /* renamed from: a */
    public static AbstractC36883a m145550a() {
        return (AbstractC36883a) ClaymoreServiceLoader.loadFirstOrNull(AbstractC36883a.class);
    }

    /* renamed from: c */
    public static IDynamicManisService m145554c() {
        return (IDynamicManisService) C68183b.m264839a().mo237086a(m145550a().getContext(), IDynamicManisService.class);
    }

    /* renamed from: b */
    public static List<String> m145553b(DomainSettings.Alias alias) {
        return f94806a.mo136169b(alias);
    }

    /* renamed from: a */
    public static String m145551a(DomainSettings.Alias alias) {
        Log.m165379d("DynamicConfigModule", "try to get domains " + alias);
        String a = f94806a.mo136164a(alias);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        Log.m165383e("DynamicConfigModule", "getDomain failed to get domain when alias is " + alias + " ; thread is " + Thread.currentThread().getName());
        if (C26284k.m95185a(m145550a().getContext())) {
            Context context = m145550a().getContext();
            LKUIToast.show(context, "get domain failed alias is " + alias + " , process is " + C26252ad.m94994c(m145550a().getContext()));
        }
        return "unknown";
    }
}
