package com.ss.android.lark.chatbase.p1687a;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.keyboard.plugin.tool.more.IPlusPluginDataAPI;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.lark.chatbase.a.c */
public class C34416c implements AbstractC36474h.AbstractC36487m {

    /* renamed from: a */
    private WeakReference<IPlusPluginDataAPI> f88880a;

    public C34416c(IPlusPluginDataAPI bVar) {
        this.f88880a = new WeakReference<>(bVar);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36487m
    /* renamed from: a */
    public void mo127097a(List<IPlusItem> list) {
        IPlusPluginDataAPI bVar = this.f88880a.get();
        if (bVar != null) {
            UICallbackExecutor.post(new Runnable(list) {
                /* class com.ss.android.lark.chatbase.p1687a.$$Lambda$c$jClujZWfACpAhIXG0GCWX0HIjQ */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    IPlusPluginDataAPI.this.mo147643a(this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36487m
    /* renamed from: a */
    public void mo127098a(List<IPlusItem> list, List<IPlusItem> list2) {
        IPlusPluginDataAPI bVar = this.f88880a.get();
        if (bVar != null) {
            UICallbackExecutor.post(new Runnable(list, list2) {
                /* class com.ss.android.lark.chatbase.p1687a.$$Lambda$c$spgeSccI4yx0KBCTsrKngOMt9qE */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ List f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    IPlusPluginDataAPI.this.mo147644a(this.f$1, this.f$2);
                }
            });
        }
    }
}
