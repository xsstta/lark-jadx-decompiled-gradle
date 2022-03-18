package com.ss.android.lark.mail.impl.share.collaborate;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailCancelShareThreadResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateCollaboratorsRoleResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.UserInfo;
import com.bytedance.lark.pb.email.client.v1.UserPayload;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.share.C43691h;
import com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.share.collaborate.a */
public class C43658a {

    /* renamed from: a */
    public AbstractC43662a f110766a;

    /* renamed from: b */
    public String f110767b;

    /* renamed from: c */
    public ArrayList<Collaborator> f110768c = new ArrayList<>();

    /* renamed from: d */
    private final String f110769d = "CollaborateDataManager";

    /* renamed from: e */
    private PermissionCode f110770e;

    /* renamed from: f */
    private CollaborateActivity.CollaborateMode f110771f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.collaborate.a$a */
    public interface AbstractC43662a {
        /* renamed from: a */
        void mo155716a(ArrayList<Collaborator> arrayList);

        /* renamed from: a */
        void mo155717a(boolean z);

        /* renamed from: a */
        void mo155718a(boolean z, PermissionCode permissionCode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PermissionCode mo155732b() {
        return this.f110770e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo155733c() {
        return this.f110767b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public CollaborateActivity.CollaborateMode mo155734d() {
        return this.f110771f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ArrayList<Collaborator> mo155735e() {
        return this.f110768c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155730a() {
        Log.m165389i("CollaborateDataManager", "fetchShareMemberList");
        C42176e.m168344a().mo152260i(this.f110767b, new IGetDataCallback<MailGetThreadCollaboratorsInfoResponse>() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43658a.C436591 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("CollaborateDataManager", "fetchShareMemberList onError");
            }

            /* renamed from: a */
            public void onSuccess(MailGetThreadCollaboratorsInfoResponse mailGetThreadCollaboratorsInfoResponse) {
                Log.m165389i("CollaborateDataManager", "fetchShareMemberList onSuccess");
                if (mailGetThreadCollaboratorsInfoResponse == null) {
                    Log.m165383e("CollaborateDataManager", "fetchShareMemberList response null");
                } else if (TextUtils.isEmpty(mailGetThreadCollaboratorsInfoResponse.threadId) || !mailGetThreadCollaboratorsInfoResponse.threadId.equals(C43658a.this.f110767b)) {
                    Log.m165383e("CollaborateDataManager", "fetchShareMemberList invalid thread");
                } else {
                    C43658a.this.f110768c.clear();
                    if (CollectionUtils.isNotEmpty(mailGetThreadCollaboratorsInfoResponse.users)) {
                        for (UserInfo userInfo : mailGetThreadCollaboratorsInfoResponse.users) {
                            Collaborator a = C43691h.m173276a(userInfo);
                            if (a != null) {
                                C43658a.this.f110768c.add(a);
                            }
                        }
                    }
                    C43658a.this.f110766a.mo155716a(C43658a.this.f110768c);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo155736f() {
        Log.m165389i("CollaborateDataManager", "cancelCollaboration");
        C42176e.m168344a().mo152261j(this.f110767b, new IGetDataCallback<MailCancelShareThreadResponse>() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43658a.C436613 */

            /* renamed from: a */
            public void onSuccess(MailCancelShareThreadResponse mailCancelShareThreadResponse) {
                Log.m165389i("CollaborateDataManager", "cancelCollaboration onSuccess");
                if (C43658a.this.f110766a != null) {
                    C43658a.this.f110766a.mo155717a(true);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("CollaborateDataManager", "cancelCollaboration onError");
                if (C43658a.this.f110766a != null) {
                    C43658a.this.f110766a.mo155717a(false);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ArrayList<String> mo155737g() {
        Log.m165389i("CollaborateDataManager", "getCollaboratorUserIDList");
        if (CollectionUtils.isEmpty(this.f110768c)) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<Collaborator> it = this.f110768c.iterator();
        while (it.hasNext()) {
            Collaborator next = it.next();
            if (next != null) {
                arrayList.add(next.user_id);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m173228a(Intent intent) {
        String stringExtra = intent.getStringExtra("thread_id");
        this.f110767b = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Log.m165383e("CollaborateDataManager", "parseData no thread id");
        }
        PermissionCode permissionCode = (PermissionCode) intent.getSerializableExtra("share_permission_code");
        this.f110770e = permissionCode;
        if (permissionCode == null) {
            Log.m165383e("CollaborateDataManager", "parseData no code");
            this.f110770e = PermissionCode.NONE;
        }
        CollaborateActivity.CollaborateMode collaborateMode = (CollaborateActivity.CollaborateMode) intent.getSerializableExtra("intent_key_collaborate_mode");
        this.f110771f = collaborateMode;
        if (collaborateMode == null) {
            Log.m165383e("CollaborateDataManager", "parseData collaborate mode null");
            this.f110771f = CollaborateActivity.CollaborateMode.Add;
        }
        try {
            this.f110768c = (ArrayList) intent.getSerializableExtra("intent_key_collaborator_list");
        } catch (Exception e) {
            Log.m165384e("CollaborateDataManager", "parseData", e);
        }
        if (this.f110768c == null) {
            this.f110768c = new ArrayList<>();
        }
        if (this.f110771f == CollaborateActivity.CollaborateMode.Add) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(PermissionCode.NONE);
            arrayList.add(PermissionCode.VIEW);
            if (this.f110770e != PermissionCode.VIEW) {
                arrayList.add(PermissionCode.EDIT);
            }
            Iterator<Collaborator> it = this.f110768c.iterator();
            while (it.hasNext()) {
                Collaborator next = it.next();
                if (next != null) {
                    next.code = PermissionCode.EDIT;
                    next.permissionActionList = arrayList;
                }
            }
        }
    }

    C43658a(AbstractC43662a aVar, Intent intent) {
        m173228a(intent);
        this.f110766a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155731a(Collaborator collaborator, final PermissionCode permissionCode) {
        Log.m165389i("CollaborateDataManager", "updateCollaboratorPermissionCode");
        if (collaborator == null || permissionCode == null) {
            Log.m165383e("CollaborateDataManager", "updateCollaboratorPermissionCode empty data");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new UserPayload(collaborator.user_id, permissionCode, collaborator.collaboratorType));
        C42176e.m168344a().mo152236b(this.f110767b, arrayList, new IGetDataCallback<MailUpdateCollaboratorsRoleResponse>() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43658a.C436602 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("CollaborateDataManager", "updateCollaboratorPermissionCode onError");
                C43658a.this.f110766a.mo155718a(false, permissionCode);
            }

            /* renamed from: a */
            public void onSuccess(MailUpdateCollaboratorsRoleResponse mailUpdateCollaboratorsRoleResponse) {
                Log.m165389i("CollaborateDataManager", "updateCollaboratorPermissionCode onSuccess");
                if (mailUpdateCollaboratorsRoleResponse == null) {
                    Log.m165383e("CollaborateDataManager", "updateCollaboratorPermissionCode response null");
                    C43658a.this.f110766a.mo155718a(false, permissionCode);
                } else if (TextUtils.isEmpty(mailUpdateCollaboratorsRoleResponse.threadId) || !mailUpdateCollaboratorsRoleResponse.threadId.equals(C43658a.this.f110767b)) {
                    Log.m165383e("CollaborateDataManager", "updateCollaboratorPermissionCode invalid thread");
                    C43658a.this.f110766a.mo155718a(false, permissionCode);
                } else {
                    C43658a.this.f110766a.mo155718a(true, permissionCode);
                }
            }
        });
        C42187a.m168563q();
    }
}
