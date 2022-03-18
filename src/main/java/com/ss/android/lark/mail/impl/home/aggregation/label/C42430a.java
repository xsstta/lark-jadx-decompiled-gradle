package com.ss.android.lark.mail.impl.home.aggregation.label;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.MailMoveToFolderResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.undo.DeleteUndoProcess;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.aggregation.label.a */
public class C42430a implements AbstractC42401a {

    /* renamed from: a */
    private MailLabelEntity f108023a;

    @Override // com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
    /* renamed from: c */
    public int mo152620c() {
        return R.drawable.illustration_empty_neutral_no_content;
    }

    /* renamed from: d */
    public String mo152709d() {
        return C43819s.m173684a((int) R.string.Mail_Manage_ManageLabelMobile);
    }

    /* renamed from: e */
    public String mo152710e() {
        return C43819s.m173684a((int) R.string.Mail_Label_Label);
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
    /* renamed from: b */
    public C1177w<List<MailLabelEntity>> mo152619b() {
        return C43374f.m172264f().mo155121i();
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
    /* renamed from: a */
    public MailLabelEntity mo152614a() {
        if (this.f108023a == null) {
            MailLabelEntity mailLabelEntity = new MailLabelEntity();
            mailLabelEntity.mo151508c("0");
            mailLabelEntity.mo151495a(1);
            mailLabelEntity.mo151499a(false);
            mailLabelEntity.mo151501b(R.drawable.ud_icon_label_custom_outlined);
            mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Label_MyLabels));
            this.f108023a = mailLabelEntity;
        }
        return this.f108023a;
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
    /* renamed from: a */
    public MailLabelEntity mo152615a(String str) {
        return C43374f.m172264f().mo155117c(str);
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
    /* renamed from: a */
    public void mo152617a(Context context, int i) {
        C42699a.m170262b(context, i);
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
    /* renamed from: a */
    public String mo152616a(int i, Pair<String, String>... pairArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("Folder_Label", mo152710e());
        hashMap.put("TabName", mo152709d());
        if (pairArr != null) {
            for (Pair<String, String> pair : pairArr) {
                hashMap.put(pair.first, pair.second);
            }
        }
        return C43819s.m173687a(i, hashMap);
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
    /* renamed from: a */
    public void mo152618a(final ArrayList<String> arrayList, String str, final String str2) {
        C42176e.m168344a().mo152225a(arrayList, str, str2, new IGetDataCallback<MailMoveToFolderResponse>() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.label.C42430a.C424311 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165388i("doMoveToAct onError:");
                MailToast.m173697a((int) R.string.Mail_CustomLabels_FailedToast);
                C42209j.m168612a("label_create_custom_fail", "toast");
            }

            /* renamed from: a */
            public void onSuccess(MailMoveToFolderResponse mailMoveToFolderResponse) {
                String str;
                String str2;
                Log.m165388i("doMoveToAct onSuccess:");
                MailLabelEntity a = C42430a.this.mo152615a(str2);
                if (a != null) {
                    str = a.mo151528l();
                } else {
                    str = "";
                }
                if (arrayList.size() == 1) {
                    str2 = C43819s.m173684a((int) R.string.Mail_Conversation_MoveTo_Succeed);
                } else {
                    String a2 = C43819s.m173684a((int) R.string.Mail_Conversations_MoveTo_Succeed);
                    str2 = a2.replace("{{num}}", arrayList.size() + "");
                }
                String replace = str2.replace("{{label}}", str);
                if (!"TRASH".equals(str2) || TextUtils.isEmpty(mailMoveToFolderResponse.uuid)) {
                    MailToast.m173700a(replace);
                } else {
                    C43383h.m172311a().mo155143a(new DeleteUndoProcess(mailMoveToFolderResponse.uuid, replace));
                }
            }
        });
    }
}
