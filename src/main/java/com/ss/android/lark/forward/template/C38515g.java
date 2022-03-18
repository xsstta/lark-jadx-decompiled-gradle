package com.ss.android.lark.forward.template;

import android.os.Bundle;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import com.ss.android.lark.thirdshare.container.p2744b.C55730a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.template.g */
public class C38515g {
    /* renamed from: a */
    public static ForwardTemplate m151902a(final LarkShareContainerConfig.InappConfig cVar) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140898c(cVar.mo189888b()).mo140897b());
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(true).mo140846b());
        return aVar.mo140617a(new AbstractC38405a() {
            /* class com.ss.android.lark.forward.template.C38515g.C385161 */

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public void onForward(List<ForwardTarget> list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                ArrayList arrayList = new ArrayList();
                for (ForwardTarget forwardTarget : list) {
                    boolean z = false;
                    if (forwardTarget.mo140572f() != null) {
                        z = forwardTarget.mo140572f().isP2PChat();
                    }
                    arrayList.add(new C55730a(forwardTarget.mo140567b(), z, forwardTarget.mo140571e()));
                }
                String string = bundle.getString("key_param_addition_note");
                if (string == null) {
                    string = "";
                }
                cVar.mo189889c().mo146275a(arrayList, string);
            }
        });
    }
}
