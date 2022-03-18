package com.ss.android.lark.mail.impl.share;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.email.client.v1.CollaboratorType;
import com.bytedance.lark.pb.email.client.v1.MailAddCollaboratorsResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateShareThreadResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse;
import com.bytedance.lark.pb.email.client.v1.MailSearchShareMemberResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.UserInfo;
import com.bytedance.lark.pb.email.client.v1.UserPayload;
import com.bytedance.lark.pb.email.v1.MailSendCardResponse;
import com.bytedance.lark.pb.feed.v1.FeedEntityPreview;
import com.bytedance.lark.pb.feed.v1.GetFeedCardsV2Response;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.share.C43689g;
import com.ss.android.lark.mail.impl.share.ShareActivity;
import com.ss.android.lark.mail.impl.share.collaborate.AbstractC43680e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.share.a */
public class C43633a {

    /* renamed from: a */
    public AbstractC43642b f110689a;

    /* renamed from: b */
    public String f110690b;

    /* renamed from: c */
    public ShareActivity.Mode f110691c;

    /* renamed from: d */
    public ArrayList<C43689g> f110692d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C43689g> f110693e = new ArrayList<>();

    /* renamed from: f */
    public long f110694f;

    /* renamed from: g */
    public int f110695g;

    /* renamed from: h */
    public HashMap<String, UserInfo> f110696h = new HashMap<>();

    /* renamed from: i */
    public boolean f110697i;

    /* renamed from: j */
    private final String f110698j = "ShareDataManager";

    /* renamed from: k */
    private final int f110699k = 50;

    /* renamed from: l */
    private PermissionCode f110700l;

    /* renamed from: m */
    private ArrayList<String> f110701m;

    /* renamed from: n */
    private String f110702n;

    /* renamed from: o */
    private ArrayList<C43689g> f110703o = new ArrayList<>();

    /* renamed from: p */
    private HashMap<String, C43689g> f110704p = new HashMap<>();

    /* renamed from: q */
    private Map<String, Boolean> f110705q = new HashMap();

    /* renamed from: r */
    private final int f110706r = 15;

    /* renamed from: s */
    private String f110707s;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.a$a */
    public interface AbstractC43641a {
        /* renamed from: a */
        void mo155673a(boolean z);

        /* renamed from: b */
        void mo155674b(boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.a$b */
    public interface AbstractC43642b {
        /* renamed from: a */
        void mo155653a(ArrayList<C43689g> arrayList, boolean z);

        /* renamed from: a */
        void mo155654a(boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<C43689g> mo155676a() {
        return this.f110703o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PermissionCode mo155686c() {
        return this.f110700l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo155688d() {
        return this.f110690b;
    }

    /* renamed from: e */
    public ArrayList<String> mo155689e() {
        return this.f110701m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ShareActivity.Mode mo155691g() {
        return this.f110691c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo155692h() {
        return this.f110702n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155683b() {
        Log.m165389i("ShareDataManager", "fetchShareMemberList");
        C42176e.m168344a().mo152260i(this.f110690b, new IGetDataCallback<MailGetThreadCollaboratorsInfoResponse>() {
            /* class com.ss.android.lark.mail.impl.share.C43633a.C436352 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareDataManager", "fetchShareMemberList onError");
            }

            /* renamed from: a */
            public void onSuccess(MailGetThreadCollaboratorsInfoResponse mailGetThreadCollaboratorsInfoResponse) {
                Log.m165389i("ShareDataManager", "fetchShareMemberList onSuccess");
                if (mailGetThreadCollaboratorsInfoResponse == null) {
                    Log.m165383e("ShareDataManager", "fetchShareMemberList response null");
                } else if (TextUtils.isEmpty(mailGetThreadCollaboratorsInfoResponse.threadId) || !mailGetThreadCollaboratorsInfoResponse.threadId.equals(C43633a.this.f110690b)) {
                    Log.m165383e("ShareDataManager", "fetchShareMemberList invalid thread");
                } else {
                    if (CollectionUtils.isNotEmpty(mailGetThreadCollaboratorsInfoResponse.users)) {
                        for (UserInfo userInfo : mailGetThreadCollaboratorsInfoResponse.users) {
                            if (userInfo != null && !TextUtils.isEmpty(userInfo.user_id)) {
                                C43633a.this.f110696h.put(userInfo.user_id, userInfo);
                            }
                        }
                    }
                    if (C43633a.this.mo155693i()) {
                        C43633a.this.f110689a.mo155653a(C43633a.this.f110692d, C43633a.this.f110697i);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo155690f() {
        Log.m165389i("ShareDataManager", "fetchRecommendedCandidateList");
        this.f110694f = SystemClock.uptimeMillis();
        C42176e.m168344a().mo152191a(50, new IGetDataCallback<GetFeedCardsV2Response>() {
            /* class com.ss.android.lark.mail.impl.share.C43633a.C436374 */

            /* renamed from: b */
            private long f110714b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("ShareDataManager", "fetchRecommendedCandidateList onError");
            }

            {
                this.f110714b = C43633a.this.f110694f;
            }

            /* renamed from: a */
            public void onSuccess(GetFeedCardsV2Response getFeedCardsV2Response) {
                String str;
                CollaboratorType collaboratorType;
                Log.m165389i("ShareDataManager", "fetchRecommendedCandidateList onSuccess");
                if (this.f110714b < C43633a.this.f110694f) {
                    Log.m165383e("ShareDataManager", "fetchRecommendedCandidateList response out of date");
                } else if (getFeedCardsV2Response == null || CollectionUtils.isEmpty(getFeedCardsV2Response.entity_previews)) {
                    Log.m165389i("ShareDataManager", "fetchRecommendedCandidateList onSuccess empty data");
                } else {
                    Iterator<FeedEntityPreview> it = getFeedCardsV2Response.entity_previews.iterator();
                    while (true) {
                        boolean z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        FeedEntityPreview next = it.next();
                        if (!(next == null || next.chat_data == null || next.chat_data.chat_type == null || next.chat_data.is_crypto.booleanValue() || TextUtils.isEmpty(next.feed_id))) {
                            if (!(next.chat_data.chat_type == Chat.Type.P2P && next.chat_data.chatter_type == Chatter.Type.USER)) {
                                z = false;
                            }
                            if (z || (C43633a.this.f110691c != ShareActivity.Mode.CreateNewChat && next.chat_data.chat_type == Chat.Type.GROUP)) {
                                if (TextUtils.isEmpty(next.chat_data.chatter_id)) {
                                    str = next.feed_id;
                                } else {
                                    str = next.chat_data.chatter_id;
                                }
                                if (z) {
                                    collaboratorType = CollaboratorType.USER;
                                } else {
                                    collaboratorType = CollaboratorType.GROUP;
                                }
                                C43689g gVar = new C43689g(str, collaboratorType);
                                gVar.f110852c = next.chat_data.avatar_key;
                                gVar.f110854e = next.chat_data.name;
                                gVar.f110853d = next.chat_data.name;
                                gVar.f110856g = next.feed_id;
                                C43633a.this.f110693e.add(gVar);
                            }
                        }
                    }
                    if (this.f110714b == C43633a.this.f110694f && CollectionUtils.isEmpty(C43633a.this.f110692d)) {
                        C43633a.this.f110692d.addAll(C43633a.this.f110693e);
                        C43633a aVar = C43633a.this;
                        aVar.mo155681a(aVar.f110692d, true);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.a$7 */
    public static /* synthetic */ class C436407 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110719a;

        /* renamed from: b */
        static final /* synthetic */ int[] f110720b;

        /* renamed from: c */
        static final /* synthetic */ int[] f110721c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        static {
            /*
            // Method dump skipped, instructions count: 126
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.share.C43633a.C436407.<clinit>():void");
        }
    }

    /* renamed from: i */
    public boolean mo155693i() {
        if (CollectionUtils.isEmpty(this.f110696h) || CollectionUtils.isEmpty(this.f110692d)) {
            return false;
        }
        Iterator<C43689g> it = this.f110692d.iterator();
        while (it.hasNext()) {
            C43689g next = it.next();
            UserInfo userInfo = this.f110696h.get(next.f110851b);
            if (userInfo == null) {
                if (next.f110850a == C43689g.EnumC43690a.Disable || next.f110850a == C43689g.EnumC43690a.Owner) {
                    next.f110850a = C43689g.EnumC43690a.Unselected;
                }
            } else if (userInfo.code == PermissionCode.OWNER) {
                next.f110850a = C43689g.EnumC43690a.Owner;
            } else {
                next.f110850a = C43689g.EnumC43690a.Disable;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo155677a(PermissionCode permissionCode) {
        this.f110700l = permissionCode;
    }

    /* renamed from: c */
    private void m173162c(C43689g gVar) {
        if (gVar != null && !CollectionUtils.isEmpty(this.f110705q) && this.f110705q.get(gVar.f110851b) != null) {
            gVar.f110850a = C43689g.EnumC43690a.Disable;
        }
    }

    /* renamed from: a */
    private void m173157a(C43689g gVar) {
        UserInfo userInfo;
        if (gVar != null && !CollectionUtils.isEmpty(this.f110696h) && (userInfo = this.f110696h.get(gVar.f110851b)) != null && userInfo.code != null) {
            int i = C436407.f110721c[userInfo.code.ordinal()];
            if (i == 1) {
                gVar.f110850a = C43689g.EnumC43690a.Owner;
            } else if (i == 2 || i == 3) {
                gVar.f110850a = C43689g.EnumC43690a.Disable;
            }
        }
    }

    /* renamed from: b */
    private C43689g m173158b(String str) {
        if (!CollectionUtils.isEmpty(this.f110703o) && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < this.f110703o.size(); i++) {
                C43689g gVar = this.f110703o.get(i);
                if (gVar != null && str.equals(gVar.f110851b)) {
                    return mo155687c(i);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private int m173161c(String str) {
        if (!CollectionUtils.isEmpty(this.f110692d) && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < this.f110692d.size(); i++) {
                C43689g gVar = this.f110692d.get(i);
                if (gVar != null && str.equals(gVar.f110851b)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m173156a(Intent intent) {
        String stringExtra = intent.getStringExtra("thread_id");
        this.f110690b = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Log.m165383e("ShareDataManager", "parseData no thread id");
        }
        PermissionCode permissionCode = (PermissionCode) intent.getSerializableExtra("share_permission_code");
        this.f110700l = permissionCode;
        if (permissionCode == null) {
            Log.m165383e("ShareDataManager", "empty permissionCode");
            this.f110700l = PermissionCode.NONE;
        }
        ShareActivity.Mode mode = (ShareActivity.Mode) intent.getSerializableExtra("intent_key_share_mode");
        this.f110691c = mode;
        if (mode == null) {
            Log.m165383e("ShareDataManager", "empty share mode");
            this.f110691c = ShareActivity.Mode.SendToChat;
        }
        this.f110701m = intent.getStringArrayListExtra("intent_key_message_id_list");
        this.f110702n = intent.getStringExtra("intent_key_subject");
    }

    /* renamed from: b */
    private void m173159b(C43689g gVar) {
        C43689g gVar2;
        if (!(gVar == null || CollectionUtils.isEmpty(this.f110704p) || (gVar2 = this.f110704p.get(gVar.f110851b)) == null)) {
            if (gVar2.f110850a == C43689g.EnumC43690a.Unselected) {
                Log.m165383e("ShareDataManager", "filterSelectedCandidate wrong state Unselected");
            } else {
                gVar.f110850a = gVar2.f110850a;
            }
            int size = this.f110703o.size();
            for (int i = 0; i < size; i++) {
                if (this.f110703o.get(i).f110851b.equals(gVar.f110851b)) {
                    this.f110703o.set(i, gVar);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C43689g mo155687c(int i) {
        Log.m165389i("ShareDataManager", "removeSelectedCandidate");
        if (CollectionUtils.isEmpty(this.f110703o) || this.f110703o.size() <= i) {
            Log.m165383e("ShareDataManager", "removeSelectedCandidate invalid position");
            return null;
        }
        C43689g remove = this.f110703o.remove(i);
        this.f110704p.remove(remove.f110851b);
        remove.f110850a = C43689g.EnumC43690a.Unselected;
        return remove;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155678a(String str) {
        boolean z;
        Log.m165389i("ShareDataManager", "fetchCandidateList");
        this.f110694f = SystemClock.uptimeMillis();
        if (TextUtils.isEmpty(str)) {
            this.f110707s = null;
            this.f110692d.clear();
            this.f110692d.addAll(this.f110693e);
            mo155681a(this.f110692d, true);
            return;
        }
        if (TextUtils.isEmpty(this.f110707s)) {
            this.f110695g = 0;
        } else if (this.f110707s.equals(str)) {
            this.f110695g += 15;
        } else {
            this.f110695g = 0;
        }
        this.f110707s = str;
        C42176e a = C42176e.m168344a();
        int i = this.f110695g;
        if (this.f110691c == ShareActivity.Mode.CreateNewChat) {
            z = true;
        } else {
            z = false;
        }
        a.mo152198a(str, i, 15, z, new IGetDataCallback<MailSearchShareMemberResponse>() {
            /* class com.ss.android.lark.mail.impl.share.C43633a.C436341 */

            /* renamed from: b */
            private long f110709b;

            /* renamed from: c */
            private int f110710c;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareDataManager", "fetchCandidateList onError");
            }

            {
                this.f110709b = C43633a.this.f110694f;
                this.f110710c = C43633a.this.f110695g;
            }

            /* renamed from: a */
            public void onSuccess(MailSearchShareMemberResponse mailSearchShareMemberResponse) {
                int i;
                Log.m165389i("ShareDataManager", "fetchCandidateList onSuccess");
                if (this.f110709b < C43633a.this.f110694f) {
                    Log.m165383e("ShareDataManager", "fetchCandidateList response out of date");
                } else if (mailSearchShareMemberResponse == null) {
                    Log.m165383e("ShareDataManager", "fetchCandidateList empty response");
                } else {
                    if (this.f110710c == 0) {
                        C43633a.this.f110692d.clear();
                    }
                    if (CollectionUtils.isEmpty(mailSearchShareMemberResponse.users)) {
                        i = 0;
                    } else {
                        i = mailSearchShareMemberResponse.users.size();
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        UserInfo userInfo = mailSearchShareMemberResponse.users.get(i2);
                        if (userInfo == null || TextUtils.isEmpty(userInfo.user_id) || userInfo.collaborator_type == null) {
                            Log.m165383e("ShareDataManager", "fetchCandidateList onSuccess invalid result");
                        } else {
                            C43689g gVar = new C43689g(userInfo.user_id, userInfo.collaborator_type);
                            gVar.f110852c = userInfo.avatar;
                            gVar.f110854e = userInfo.cn_name;
                            gVar.f110853d = userInfo.en_name;
                            gVar.f110855f = userInfo.department;
                            gVar.f110856g = userInfo.chat_id;
                            C43633a.this.f110692d.add(gVar);
                        }
                    }
                    C43633a aVar = C43633a.this;
                    aVar.mo155681a(aVar.f110692d, false);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155680a(ArrayList<String> arrayList) {
        Log.m165389i("ShareDataManager", "filterSelectedCandidates");
        if (CollectionUtils.isEmpty(arrayList)) {
            Iterator<C43689g> it = this.f110703o.iterator();
            while (it.hasNext()) {
                C43689g next = it.next();
                if (next != null) {
                    next.f110850a = C43689g.EnumC43690a.Unselected;
                }
            }
            this.f110703o.clear();
            this.f110704p.clear();
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (!TextUtils.isEmpty(next2)) {
                hashMap.put(next2, true);
            }
        }
        ArrayList<C43689g> arrayList2 = new ArrayList<>();
        Iterator<C43689g> it3 = this.f110703o.iterator();
        while (it3.hasNext()) {
            C43689g next3 = it3.next();
            if (hashMap.containsKey(next3.f110851b)) {
                arrayList2.add(next3);
            } else {
                C43689g remove = this.f110704p.remove(next3.f110851b);
                if (remove != null) {
                    remove.f110850a = C43689g.EnumC43690a.Unselected;
                }
            }
        }
        this.f110703o = arrayList2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo155685b(int i) {
        C43689g gVar;
        boolean z = false;
        if (CollectionUtils.isNotEmpty(this.f110692d) && this.f110692d.size() > i && (gVar = this.f110692d.get(i)) != null && gVar.f110850a == C43689g.EnumC43690a.Selected) {
            z = true;
        }
        Log.m165389i("ShareDataManager", "isCandidateSelected: " + z);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo155682a(int i) {
        Log.m165389i("ShareDataManager", "toggleCandidateState");
        if (CollectionUtils.isEmpty(this.f110692d) || this.f110692d.size() <= i) {
            Log.m165383e("ShareDataManager", "toggleCandidateState invalid position");
            return false;
        }
        C43689g gVar = this.f110692d.get(i);
        if (gVar == null) {
            Log.m165383e("ShareDataManager", "toggleCandidateState null");
            return false;
        }
        int i2 = C436407.f110720b[gVar.f110850a.ordinal()];
        if (i2 == 1) {
            gVar.f110850a = C43689g.EnumC43690a.Unselected;
            this.f110703o.remove(gVar);
            this.f110704p.remove(gVar.f110851b);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            gVar.f110850a = C43689g.EnumC43690a.Selected;
            this.f110703o.add(0, gVar);
            this.f110704p.put(gVar.f110851b, gVar);
            return true;
        }
    }

    C43633a(Intent intent, AbstractC43642b bVar) {
        m173156a(intent);
        this.f110689a = bVar;
        int i = C436407.f110719a[this.f110691c.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                Log.m165383e("ShareDataManager", "constructor switch to default");
            } else {
                mo155683b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo155675a(String str, boolean z) {
        C43689g.EnumC43690a aVar;
        Log.m165389i("ShareDataManager", "setCandidateEnabled: " + z);
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("ShareDataManager", "setCandidateEnabled invalid userID, abort");
            return -1;
        }
        if (z) {
            this.f110705q.remove(str);
            aVar = C43689g.EnumC43690a.Unselected;
        } else {
            this.f110705q.put(str, Boolean.TRUE);
            aVar = C43689g.EnumC43690a.Disable;
            m173158b(str);
        }
        int c = m173161c(str);
        if (c < 0 || c >= this.f110692d.size()) {
            Log.m165389i("ShareDataManager", "setCandidateEnabled miss candidate");
        } else {
            C43689g gVar = this.f110692d.get(c);
            if (gVar != null) {
                gVar.f110850a = aVar;
            }
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155684b(String str, boolean z) {
        Log.m165389i("ShareDataManager", "sendToChat");
        if (CollectionUtils.isEmpty(this.f110703o)) {
            Log.m165383e("ShareDataManager", "sendToChat empty target");
            this.f110689a.mo155654a(false);
        } else if (CollectionUtils.isEmpty(this.f110701m)) {
            Log.m165383e("ShareDataManager", "sendToChat empty content");
            this.f110689a.mo155654a(false);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<C43689g> it = this.f110703o.iterator();
            while (it.hasNext()) {
                C43689g next = it.next();
                if (next != null) {
                    if (z) {
                        if (!TextUtils.isEmpty(next.f110851b)) {
                            arrayList.add(next.f110851b);
                        }
                    } else if (!TextUtils.isEmpty(next.f110856g)) {
                        arrayList.add(next.f110856g);
                    }
                }
            }
            if (CollectionUtils.isEmpty(arrayList)) {
                Log.m165383e("ShareDataManager", "sendToChat empty target ID list");
                this.f110689a.mo155654a(false);
                return;
            }
            C42176e.m168344a().mo152220a(this.f110690b, this.f110701m, arrayList, str, z, new IGetDataCallback<MailSendCardResponse>() {
                /* class com.ss.android.lark.mail.impl.share.C43633a.C436363 */

                /* renamed from: a */
                public void onSuccess(MailSendCardResponse mailSendCardResponse) {
                    Log.m165389i("ShareDataManager", "sendToChat onSuccess");
                    C43633a.this.f110689a.mo155654a(true);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ShareDataManager", "sendToChat onError");
                    C43633a.this.f110689a.mo155654a(false);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo155681a(ArrayList<C43689g> arrayList, boolean z) {
        this.f110697i = z;
        if (CollectionUtils.isEmpty(arrayList)) {
            this.f110689a.mo155653a(arrayList, this.f110697i);
            return;
        }
        Iterator<C43689g> it = arrayList.iterator();
        while (it.hasNext()) {
            C43689g next = it.next();
            m173157a(next);
            m173159b(next);
            m173162c(next);
        }
        this.f110689a.mo155653a(arrayList, this.f110697i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155679a(String str, boolean z, AbstractC43641a aVar) {
        Log.m165389i("ShareDataManager", "addCollaborators");
        PermissionCode permissionCode = this.f110700l;
        if (permissionCode == null || permissionCode == PermissionCode.NONE) {
            m173160b(str, z, aVar);
        } else {
            m173163c(str, z, aVar);
        }
    }

    /* renamed from: c */
    private void m173163c(String str, boolean z, final AbstractC43641a aVar) {
        Log.m165389i("ShareDataManager", "addNewCollaborators");
        if (CollectionUtils.isEmpty(this.f110703o)) {
            Log.m165383e("ShareDataManager", "createCollaboratingThread empty data");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C43689g> it = this.f110703o.iterator();
        while (it.hasNext()) {
            C43689g next = it.next();
            if (next != null) {
                arrayList.add(next.mo155767a(PermissionCode.VIEW));
            }
        }
        C42176e.m168344a().mo152218a(this.f110690b, arrayList, str, z, new IGetDataCallback<MailAddCollaboratorsResponse>() {
            /* class com.ss.android.lark.mail.impl.share.C43633a.C436396 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareDataManager", "addNewCollaborators onError");
                aVar.mo155674b(false);
            }

            /* renamed from: a */
            public void onSuccess(MailAddCollaboratorsResponse mailAddCollaboratorsResponse) {
                Log.m165389i("ShareDataManager", "removeShareMember onSuccess");
                if (mailAddCollaboratorsResponse == null) {
                    Log.m165383e("ShareDataManager", "addNewCollaborators response null");
                    aVar.mo155674b(false);
                } else if (!TextUtils.equals(mailAddCollaboratorsResponse.thread_id, C43633a.this.f110690b)) {
                    Log.m165383e("ShareDataManager", "addNewCollaborators invalid thread");
                    aVar.mo155674b(false);
                } else {
                    ((AbstractC43680e) Watchers.m167205a(AbstractC43680e.class)).mo155657c(C43633a.this.f110690b);
                    aVar.mo155674b(true);
                }
            }
        });
    }

    /* renamed from: b */
    private void m173160b(String str, boolean z, final AbstractC43641a aVar) {
        Log.m165389i("ShareDataManager", "createCollaboratingThread");
        if (CollectionUtils.isEmpty(this.f110703o)) {
            Log.m165383e("ShareDataManager", "createCollaboratingThread empty data");
            return;
        }
        ArrayList<UserPayload> arrayList = new ArrayList<>();
        Iterator<C43689g> it = this.f110703o.iterator();
        while (it.hasNext()) {
            C43689g next = it.next();
            if (next != null) {
                arrayList.add(next.mo155767a(PermissionCode.VIEW));
            }
        }
        C42176e.m168344a().mo152214a(this.f110690b, arrayList, z, str, new IGetDataCallback<MailCreateShareThreadResponse>() {
            /* class com.ss.android.lark.mail.impl.share.C43633a.C436385 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareDataManager", "createCollaboratingThread onError");
                AbstractC43641a aVar = aVar;
                if (aVar != null) {
                    aVar.mo155673a(false);
                }
            }

            /* renamed from: a */
            public void onSuccess(MailCreateShareThreadResponse mailCreateShareThreadResponse) {
                Log.m165389i("ShareDataManager", "createCollaboratingThread onSuccess");
                ((AbstractC43680e) Watchers.m167205a(AbstractC43680e.class)).mo155655b(C43633a.this.f110690b);
                AbstractC43641a aVar = aVar;
                if (aVar != null) {
                    aVar.mo155673a(true);
                }
            }
        });
    }
}
