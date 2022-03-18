package com.bytedance.lark.webview.container.impl.p835a;

import android.content.ClipboardManager;
import com.bytedance.lark.webview.container.impl.C19857c;
import com.bytedance.lark.webview.container.impl.menu.C19885d;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.webview.container.dto.C25835f;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lark.webview.container.impl.a.b */
public class C19850b {
    /* renamed from: a */
    public static C19885d.C19889b m72406a(final C19857c cVar) {
        C19885d.C19889b bVar = new C19885d.C19889b(R.id.login_menu_change, UIUtils.getString(cVar.getContext(), R.string.Lark_Legacy_WebRefresh), new C19885d.AbstractC19890c() {
            /* class com.bytedance.lark.webview.container.impl.p835a.C19850b.C198511 */

            @Override // com.bytedance.lark.webview.container.impl.menu.C19885d.AbstractC19890c
            public void onMenuItemClick() {
                C19857c cVar = cVar;
                if (cVar != null && cVar.isActive()) {
                    cVar.mo67292e();
                }
            }
        });
        bVar.mo67392a(12);
        bVar.mo67395b(R.drawable.ud_icon_refresh_outlined);
        return bVar;
    }

    /* renamed from: b */
    public static C19885d.C19889b m72409b(final C19857c cVar, final String str) {
        C19885d.C19889b bVar = new C19885d.C19889b(R.id.login_menu_change, UIUtils.getString(cVar.getContext(), R.string.Lark_Legacy_WebBrowseOpen), new C19885d.AbstractC19890c() {
            /* class com.bytedance.lark.webview.container.impl.p835a.C19850b.C198522 */

            @Override // com.bytedance.lark.webview.container.impl.menu.C19885d.AbstractC19890c
            public void onMenuItemClick() {
                C19857c cVar = cVar;
                if (cVar != null && cVar.isActive()) {
                    C26323w.m95324a(cVar.getActivity(), str);
                }
            }
        });
        bVar.mo67392a(12);
        bVar.mo67395b(R.drawable.ud_icon_browser_mac_outlined);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m72410c(C19857c cVar, String str) {
        if (cVar != null && cVar.isActive()) {
            ((ClipboardManager) cVar.getActivity().getSystemService("clipboard")).setText(str);
            LKUIToast.show(cVar.getActivity(), cVar.getActivity().getResources().getString(R.string.Lark_Legacy_CopySuccess));
        }
    }

    /* renamed from: a */
    public static C19885d.C19889b m72407a(C19857c cVar, String str) {
        C19885d.C19889b bVar = new C19885d.C19889b(R.id.login_menu_change, UIUtils.getString(cVar.getContext(), R.string.Lark_Legacy_PersoncardLinkButton), new C19885d.AbstractC19890c(str) {
            /* class com.bytedance.lark.webview.container.impl.p835a.$$Lambda$b$2r1RoaMODPJ3b5H8SYro9NbfjdE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.lark.webview.container.impl.menu.C19885d.AbstractC19890c
            public final void onMenuItemClick() {
                C19850b.m72410c(C19857c.this, this.f$1);
            }
        });
        bVar.mo67392a(12);
        bVar.mo67395b(R.drawable.web_menu_copy);
        return bVar;
    }

    /* renamed from: a */
    public static void m72408a(C19857c cVar, List<C19885d.C19889b> list, List<C19885d.C19889b> list2, C25835f fVar) {
        if (cVar != null && cVar.isActive()) {
            ArrayList arrayList = new ArrayList();
            if (!CollectionUtils.isEmpty(list)) {
                for (C19885d.C19889b bVar : list) {
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
            }
            if (!CollectionUtils.isEmpty(list2)) {
                for (C19885d.C19889b bVar2 : list2) {
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                }
            }
            C19885d.m72577a(cVar.getContext(), arrayList, fVar);
        }
    }
}
