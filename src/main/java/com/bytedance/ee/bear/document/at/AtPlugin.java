package com.bytedance.ee.bear.document.at;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.atbottombar.C4260d;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.atfinder.AbstractC4271f;
import com.bytedance.ee.bear.atfinder.MentionModel;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.bean.C4519b;
import com.bytedance.ee.bear.bean.MentionPanelType;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p526r.C10598a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Arrays;

public class AtPlugin extends BaseMentionPlugin {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.at.BaseMentionPlugin
    public AbstractC4270e onCreateMentionDelegate() {
        return new C5658a();
    }

    public AbstractC4271f getMentionSearch() {
        return C4227b.m17586a().mo16663b();
    }

    /* renamed from: com.bytedance.ee.bear.document.at.AtPlugin$a */
    private class C5658a extends AbstractC5670e {
        @Override // com.bytedance.ee.bear.atfinder.AbstractC4270e
        /* renamed from: b */
        public C4519b mo16811b() {
            return new C4519b(C4484g.m18494b().mo17252c(), C4227b.m17586a().mo16665d());
        }

        private C5658a() {
        }

        @Override // com.bytedance.ee.bear.document.at.AbstractC5670e, com.bytedance.ee.bear.atfinder.AbstractC4270e
        /* renamed from: a */
        public void mo16810a(MentionModel mentionModel) {
            AtPlugin atPlugin = AtPlugin.this;
            mentionModel.setChatId(atPlugin.getChatId(atPlugin.getDocumentMetadata().getUrl()));
            super.mo16810a(mentionModel);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.document.at.AbstractC5670e
        /* renamed from: a */
        public void mo22651a(ArrayList<C4260d> arrayList) {
            int i;
            String str = AtPlugin.this.getDocumentMetadata().getBearUrl().f17446a;
            boolean z = true;
            if (C4511g.m18594d().mo17344E() != 1) {
                z = false;
            }
            C4260d dVar = new C4260d(R.drawable.icon_global_mentionpeople_nor, AtPlugin.this.getContext().getString(R.string.Doc_At_MentionUserTip), Arrays.asList(C10598a.f28440b), MentionPanelType.user, AtPlugin.this.getMentionSearch());
            Context context = AtPlugin.this.getContext();
            if (z) {
                i = R.string.Doc_At_MentionDocTip;
            } else {
                i = R.string.Doc_At_MentionLarkDocsTip;
            }
            C4260d dVar2 = new C4260d(R.drawable.ud_icon_space_outlined, context.getString(i), C10599b.m43906b(), MentionPanelType.file, AtPlugin.this.getMentionSearch());
            arrayList.add(dVar);
            arrayList.add(dVar2);
            if (!C8275a.f22374g.mo32553a().equals(str) && z) {
                arrayList.add(new C4260d(R.drawable.ud_icon_group_card_outlined, AtPlugin.this.getContext().getString(R.string.Doc_At_MentionGroupTip), Arrays.asList(C10598a.f28441c), MentionPanelType.chat, AtPlugin.this.getMentionSearch()));
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.at.BaseMentionPlugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        C5664d.m22980a();
    }

    public String getChatId(String str) {
        String queryParameter;
        if (!TextUtils.isEmpty(str) && (queryParameter = Uri.parse(str).getQueryParameter("chat_id")) != null) {
            return queryParameter;
        }
        return "";
    }
}
