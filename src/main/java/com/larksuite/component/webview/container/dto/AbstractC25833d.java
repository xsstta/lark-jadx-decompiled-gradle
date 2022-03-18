package com.larksuite.component.webview.container.dto;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.webview.container.impl.C19857c;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.framework.utils.C26284k;

/* renamed from: com.larksuite.component.webview.container.dto.d */
public interface AbstractC25833d {
    /* renamed from: c */
    boolean mo67290c(boolean z);

    /* renamed from: i */
    Fragment mo67297i();

    /* renamed from: com.larksuite.component.webview.container.dto.d$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: a */
        public static AbstractC25833d m93461a(Context context, Bundle bundle) {
            return m93462a(context, bundle, null);
        }

        /* renamed from: a */
        public static AbstractC25833d m93462a(Context context, Bundle bundle, WindowOpenDelegate windowOpenDelegate) {
            if ((context == null || bundle == null) && C26284k.m95185a(C25821b.m93347a().mo91844a())) {
                throw new RuntimeException("launch browser failed , context or session was null");
            }
            if (!(bundle == null || windowOpenDelegate == null)) {
                bundle.putParcelable("intent_key_window_open_impl", windowOpenDelegate);
            }
            return (C19857c) Fragment.instantiate(context, C19857c.class.getName(), bundle);
        }
    }
}
