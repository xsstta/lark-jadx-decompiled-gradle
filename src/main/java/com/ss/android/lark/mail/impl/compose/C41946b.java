package com.ss.android.lark.mail.impl.compose;

import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;
import com.bytedance.lark.pb.email.client.v1.MailSendDraftResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.ComposeMailAction;
import com.ss.android.lark.mail.impl.action.DiscardDraftAction;
import com.ss.android.lark.mail.impl.action.DraftMailAction;
import com.ss.android.lark.mail.impl.action.ForwardMailAction;
import com.ss.android.lark.mail.impl.compose.AbstractC41994h;
import com.ss.android.lark.mail.impl.compose.attachment.C41936a;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.compose.image.AbstractC42000a;
import com.ss.android.lark.mail.impl.compose.image.UploadImage;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailDocsPermissionConfig;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.entity.ShareMailAddress;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41869a;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43307b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.compose.b */
public class C41946b extends BaseModel implements AbstractC41994h.AbstractC41995a {

    /* renamed from: a */
    public AbstractC41994h.AbstractC41995a.AbstractC41996a f106473a;

    /* renamed from: b */
    public MailDraft f106474b;

    /* renamed from: c */
    private final String f106475c = "ComposeMailModel";

    /* renamed from: d */
    private MailDraft f106476d = new MailDraft();

    /* renamed from: e */
    private ComposeMailAction f106477e;

    /* renamed from: f */
    private long f106478f;

    /* renamed from: g */
    private long f106479g;

    /* renamed from: h */
    private ArrayList<LocalAttachment> f106480h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<MailImage> f106481i = new ArrayList<>();

    /* renamed from: j */
    private long f106482j = 0;

    /* renamed from: k */
    private String f106483k;

    /* renamed from: l */
    private PermissionCode f106484l;

    /* renamed from: m */
    private HashMap<String, ShareMailAddress> f106485m = new HashMap<>();

    /* renamed from: n */
    private HashMap<String, ShareMailAddress> f106486n = new HashMap<>();

    /* renamed from: o */
    private HashMap<String, ShareMailAddress> f106487o = new HashMap<>();

    /* renamed from: p */
    private HashMap<String, AbstractC42000a<UploadImage>> f106488p;

    /* renamed from: q */
    private HashMap<String, AbstractC42000a<UploadImage>> f106489q;

    /* renamed from: r */
    private HashMap<String, C41936a> f106490r;

    /* renamed from: s */
    private HashMap<String, C41936a> f106491s;

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public MailDraft mo150799a() {
        return this.f106474b;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: b */
    public List<MailImage> mo150816b() {
        return this.f106481i;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: d */
    public long mo150822d() {
        return this.f106478f;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: e */
    public long mo150824e() {
        return this.f106479g;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: f */
    public ArrayList<LocalAttachment> mo150826f() {
        return this.f106480h;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: k */
    public PermissionCode mo150834k() {
        return this.f106484l;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150806a(String str, ComposeMailAction composeMailAction, String str2) {
        this.f106477e = composeMailAction;
        this.f106474b = (MailDraft) C42107a.m168074a().mo152036c(str);
        this.f106483k = str2;
        m166766p();
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150812a(ArrayList<LocalAttachment> arrayList) {
        int i;
        Log.m165389i("ComposeMailModel", "updateAttachmentList");
        Iterator<LocalAttachment> it = this.f106480h.iterator();
        while (it.hasNext()) {
            LocalAttachment next = it.next();
            this.f106478f -= next.mo151231h();
            this.f106479g -= next.mo151233i();
        }
        if (this.f106478f < 0) {
            this.f106478f = 0;
        }
        this.f106480h.clear();
        if (!CollectionUtils.isEmpty(arrayList)) {
            Iterator<LocalAttachment> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LocalAttachment next2 = it2.next();
                if (next2 != null) {
                    this.f106478f += next2.mo151231h();
                    this.f106479g += next2.mo151233i();
                    this.f106480h.add(next2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateAttachmentList size: ");
        if (CollectionUtils.isEmpty(this.f106480h)) {
            i = 0;
        } else {
            i = this.f106480h.size();
        }
        sb.append(i);
        Log.m165389i("ComposeMailModel", sb.toString());
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150807a(String str, C41936a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (this.f106490r == null) {
                this.f106490r = new HashMap<>(8);
            }
            this.f106478f += aVar.mo150776b();
            this.f106479g += ((LocalAttachment) aVar.mo150991h()).mo151233i();
            this.f106490r.put(str, aVar);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150810a(String str, boolean z, LocalAttachment localAttachment) {
        C41936a remove;
        if (!TextUtils.isEmpty(str) && (remove = this.f106490r.remove(str)) != null) {
            if (!z || localAttachment == null) {
                if (this.f106491s == null) {
                    this.f106491s = new HashMap<>(8);
                }
                this.f106491s.put(str, remove);
                return;
            }
            this.f106480h.add(localAttachment);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150813a(List<MailDocsPermissionConfig> list) {
        Log.m165389i("ComposeMailModel", "updateDocPermissionList");
        this.f106474b.mo151349f(list);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150805a(String str, DocsPermissionConfig.Action action) {
        Log.m165389i("ComposeMailModel", "updateDocPermission");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ComposeMailModel", "updateDocPermission empty doc link");
        } else if (action == null) {
            Log.m165383e("ComposeMailModel", "updateDocPermission no action");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f106474b.mo151363p());
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (str.equals(((MailDocsPermissionConfig) arrayList.get(i)).mo151306a())) {
                    arrayList.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            arrayList.add(new MailDocsPermissionConfig(str, action));
            this.f106474b.mo151349f(arrayList);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150808a(String str, AbstractC42000a<UploadImage> aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (this.f106488p == null) {
                this.f106488p = new HashMap<>(8);
            }
            this.f106488p.put(str, aVar);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150811a(String str, boolean z, MailImage mailImage) {
        AbstractC42000a<UploadImage> remove;
        Log.m165378d("imageUploadTaskFinish uuid " + str + " success:" + z);
        if (!TextUtils.isEmpty(str) && (remove = this.f106488p.remove(str)) != null) {
            if (!z || mailImage == null) {
                if (this.f106489q == null) {
                    this.f106489q = new HashMap<>(8);
                }
                this.f106489q.put(str, remove);
                return;
            }
            this.f106481i.add(mailImage);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150809a(String str, List<ShareMailAddress> list) {
        Log.m165389i("ComposeMailModel", "updateShareToContacts");
        if (!(TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list))) {
            HashMap<String, ShareMailAddress> hashMap = null;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 3168:
                    if (str.equals("cc")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3707:
                    if (str.equals("to")) {
                        c = 1;
                        break;
                    }
                    break;
                case 97346:
                    if (str.equals("bcc")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    hashMap = this.f106486n;
                    break;
                case 1:
                    hashMap = this.f106485m;
                    break;
                case 2:
                    hashMap = this.f106487o;
                    break;
            }
            if (hashMap == null) {
                Log.m165383e("ComposeMailModel", "updateShareToContacts type not recognized");
                return;
            }
            hashMap.clear();
            for (ShareMailAddress shareMailAddress : list) {
                if (shareMailAddress != null && !TextUtils.isEmpty(shareMailAddress.f107008k)) {
                    hashMap.put(shareMailAddress.f107008k, shareMailAddress);
                }
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public boolean mo150814a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3168:
                if (str.equals("cc")) {
                    c = 0;
                    break;
                }
                break;
            case 3707:
                if (str.equals("to")) {
                    c = 1;
                    break;
                }
                break;
            case 97346:
                if (str.equals("bcc")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f106486n.containsKey(str2);
            case 1:
                return this.f106485m.containsKey(str2);
            case 2:
                return this.f106487o.containsKey(str2);
            default:
                return false;
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: c */
    public String mo150820c() {
        return this.f106474b.mo151352h();
    }

    /* renamed from: q */
    private ArrayList<MailImage> m166767q() {
        return new ArrayList<>(new HashSet(this.f106481i));
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: h */
    public List<C41936a> mo150831h() {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(this.f106491s)) {
            arrayList.addAll(this.f106491s.values());
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: i */
    public boolean mo150832i() {
        if (!CollectionUtils.isEmpty(this.f106488p) || !CollectionUtils.isEmpty(this.f106490r)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: j */
    public boolean mo150833j() {
        if (!CollectionUtils.isEmpty(this.f106489q) || !CollectionUtils.isEmpty(this.f106491s)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: m */
    public boolean mo150836m() {
        if (!CollectionUtils.isEmpty(this.f106488p) || !CollectionUtils.isEmpty(this.f106489q)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: g */
    public List<C41936a> mo150829g() {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(this.f106490r)) {
            arrayList.addAll(this.f106490r.values());
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: l */
    public boolean mo150835l() {
        boolean z;
        PermissionCode permissionCode = this.f106484l;
        if (permissionCode == null || permissionCode == PermissionCode.NONE) {
            z = false;
        } else {
            z = true;
        }
        Log.m165389i("ComposeMailModel", "isShareThread: " + z);
        return z;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: n */
    public String[] mo150837n() {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(this.f106489q)) {
            arrayList.addAll(this.f106489q.keySet());
        }
        if (!CollectionUtils.isEmpty(this.f106488p)) {
            arrayList.addAll(this.f106488p.keySet());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: o */
    public void mo150838o() {
        if (!CollectionUtils.isEmpty(this.f106488p)) {
            for (AbstractC42000a<UploadImage> aVar : this.f106488p.values()) {
                aVar.mo150778c();
            }
            this.f106488p.clear();
        }
        if (!CollectionUtils.isEmpty(this.f106489q)) {
            this.f106489q.clear();
        }
    }

    /* renamed from: p */
    private void m166766p() {
        ComposeMailAction composeMailAction = this.f106477e;
        if (((composeMailAction instanceof DraftMailAction) || (composeMailAction instanceof ForwardMailAction)) && !CollectionUtils.isEmpty(this.f106474b.mo151355i())) {
            List<MailAttachment> i = this.f106474b.mo151355i();
            if (!CollectionUtils.isEmpty(i)) {
                for (MailAttachment mailAttachment : i) {
                    if (mailAttachment.mo151238n() == 1) {
                        mailAttachment.mo151225c(false);
                        mailAttachment.mo151221b(0L);
                    }
                    if (!TextUtils.isEmpty(mailAttachment.mo151234j())) {
                        this.f106478f += mailAttachment.mo151231h();
                        this.f106479g += mailAttachment.mo151233i();
                        this.f106480h.add(LocalAttachment.m166709a(mailAttachment));
                    }
                }
            }
        }
        if (!CollectionUtils.isEmpty(this.f106474b.mo151358k())) {
            this.f106481i.addAll(this.f106474b.mo151358k());
        }
    }

    /* renamed from: r */
    private void m166768r() {
        ArrayList<LocalAttachment> arrayList = this.f106480h;
        if (arrayList == null || arrayList.size() == 0) {
            this.f106476d.mo151341d(new ArrayList());
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f106480h.size(); i++) {
            LocalAttachment localAttachment = this.f106480h.get(i);
            if (!TextUtils.isEmpty(localAttachment.mo151234j())) {
                arrayList2.add(localAttachment);
            }
        }
        this.f106476d.mo151341d(arrayList2);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150801a(MailDraft mailDraft) {
        m166761a(mailDraft, true, true);
    }

    /* renamed from: i */
    private void m166763i(String str) {
        this.f106476d.mo151337c(str);
        this.f106476d.mo151323a(System.currentTimeMillis());
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150800a(PermissionCode permissionCode) {
        Log.m165389i("ComposeMailModel", "updatePermissionCode");
        this.f106484l = permissionCode;
        if (permissionCode == null || !C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.coedit")) {
            this.f106484l = PermissionCode.NONE;
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: c */
    public void mo150821c(List<MailImage> list) {
        if (this.f106481i != null && !CollectionUtils.isEmpty(list)) {
            this.f106481i.removeAll(list);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: g */
    public AbstractC42000a<UploadImage> mo150828g(String str) {
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(this.f106489q)) {
            return null;
        }
        return this.f106489q.get(str);
    }

    public C41946b(AbstractC41994h.AbstractC41995a.AbstractC41996a aVar) {
        this.f106473a = aVar;
    }

    /* renamed from: j */
    private String m166764j(String str) {
        for (int size = this.f106481i.size() - 1; size >= 0; size--) {
            if (!m166762a(str, this.f106481i.get(size))) {
                this.f106481i.remove(size);
            }
        }
        this.f106476d.mo151345e(m166767q());
        return str;
    }

    /* renamed from: k */
    private String m166765k(String str) {
        for (int size = this.f106481i.size() - 1; size >= 0; size--) {
            if (!m166762a(str, this.f106481i.get(size))) {
                this.f106481i.remove(size);
            }
        }
        this.f106476d.mo151345e(m166767q());
        return str;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: b */
    public LocalAttachment mo150815b(String str) {
        if (CollectionUtils.isEmpty(this.f106480h)) {
            return null;
        }
        Iterator<LocalAttachment> it = this.f106480h.iterator();
        while (it.hasNext()) {
            LocalAttachment next = it.next();
            if (TextUtils.equals(next.mo150760a(), str)) {
                return next;
            }
        }
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: c */
    public C41936a mo150819c(String str) {
        if (CollectionUtils.isEmpty(this.f106491s)) {
            return null;
        }
        C41936a remove = this.f106491s.remove(str);
        if (remove != null) {
            this.f106478f -= remove.mo150776b();
            this.f106479g -= ((LocalAttachment) remove.mo150991h()).mo151233i();
        }
        return remove;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: f */
    public boolean mo150827f(String str) {
        HashMap<String, AbstractC42000a<UploadImage>> hashMap;
        Log.m165379d("ComposeMailModel", "removeImageUploadFailTask uuid " + str);
        if (TextUtils.isEmpty(str) || (hashMap = this.f106489q) == null || hashMap.remove(str) == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: h */
    public UploadImage mo150830h(String str) {
        AbstractC42000a<UploadImage> aVar;
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(this.f106488p) || (aVar = this.f106488p.get(str)) == null) {
            return null;
        }
        return aVar.mo150991h();
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: b */
    public void mo150817b(MailDraft mailDraft) {
        if (mailDraft.mo151355i() != null) {
            for (MailAttachment mailAttachment : mailDraft.mo151355i()) {
                mailAttachment.mo151240p();
            }
        }
        Iterator<LocalAttachment> it = this.f106480h.iterator();
        while (it.hasNext()) {
            it.next().mo151240p();
        }
        m166768r();
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: d */
    public DocsPermissionConfig.Action mo150823d(String str) {
        Log.m165389i("ComposeMailModel", "fetchDocPermission");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<MailDocsPermissionConfig> p = this.f106474b.mo151363p();
        if (CollectionUtils.isEmpty(p)) {
            return DocsPermissionConfig.Action.KEEP;
        }
        for (int i = 0; i < p.size(); i++) {
            if (str.equals(p.get(i).mo151306a())) {
                return p.get(i).mo151309b();
            }
        }
        return DocsPermissionConfig.Action.KEEP;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: e */
    public boolean mo150825e(String str) {
        ArrayList<MailImage> arrayList;
        HashMap<String, AbstractC42000a<UploadImage>> hashMap;
        AbstractC42000a<UploadImage> remove;
        Log.m165379d("ComposeMailModel", "removeImage uuid " + str);
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashMap<String, AbstractC42000a<UploadImage>> hashMap2 = this.f106489q;
        if (!(hashMap2 == null || hashMap2.remove(str) == null)) {
            z = true;
        }
        if (!(z || (hashMap = this.f106488p) == null || (remove = hashMap.remove(str)) == null)) {
            remove.mo150778c();
            z = true;
        }
        if (z || (arrayList = this.f106481i) == null) {
            return z;
        }
        Iterator<MailImage> it = arrayList.iterator();
        while (it.hasNext()) {
            MailImage next = it.next();
            if (TextUtils.equals(next.mo151481g(), str)) {
                this.f106481i.remove(next);
                return true;
            }
        }
        return z;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: b */
    public void mo150818b(List<MailImage> list) {
        Log.m165389i("ComposeMailModel", "addImageIfNeeded");
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ComposeMailModel", "addImageIfNeeded empty image list");
            return;
        }
        if (this.f106481i == null) {
            this.f106481i = new ArrayList<>();
        }
        HashMap hashMap = new HashMap();
        Iterator<MailImage> it = this.f106481i.iterator();
        while (it.hasNext()) {
            MailImage next = it.next();
            if (next != null) {
                hashMap.put(next.mo151481g(), next);
            }
        }
        for (MailImage mailImage : list) {
            if (mailImage != null && !TextUtils.isEmpty(mailImage.mo151481g()) && ((MailImage) hashMap.get(mailImage.mo151481g())) == null) {
                this.f106481i.add(mailImage);
                hashMap.put(mailImage.mo151481g(), mailImage);
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public int mo150798a(String str) {
        Log.m165389i("ComposeMailModel", "removeAttachment");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ComposeMailModel", "removeAttachment empty data");
            return -1;
        }
        if (!CollectionUtils.isEmpty(this.f106490r)) {
            Log.m165389i("ComposeMailModel", "removeAttachment remove uploading attachment");
            C41936a remove = this.f106490r.remove(str);
            if (remove != null) {
                this.f106478f -= remove.mo150776b();
                this.f106479g -= ((LocalAttachment) remove.mo150991h()).mo151233i();
                remove.mo150778c();
                return -1;
            }
        }
        if (!CollectionUtils.isEmpty(this.f106491s)) {
            Log.m165389i("ComposeMailModel", "removeAttachment remove upload fail attachment");
            C41936a remove2 = this.f106491s.remove(str);
            if (remove2 != null) {
                this.f106478f -= remove2.mo150776b();
                this.f106479g -= ((LocalAttachment) remove2.mo150991h()).mo151233i();
                return -1;
            }
        }
        if (CollectionUtils.isEmpty(this.f106480h)) {
            Log.m165383e("ComposeMailModel", "removeAttachment empty list");
            return -1;
        }
        int size = this.f106480h.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(this.f106480h.get(i).mo150760a(), str)) {
                this.f106478f -= this.f106480h.get(i).mo151231h();
                this.f106479g -= this.f106480h.get(i).mo151233i();
                this.f106480h.remove(i);
                if (this.f106478f < 0) {
                    Log.m165383e("ComposeMailModel", "removeAttachment negative selected file size");
                }
                return i;
            }
        }
        Log.m165383e("ComposeMailModel", "removeAttachment no matching data");
        return -1;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150804a(MailImage mailImage) {
        Log.m165389i("ComposeMailModel", "addImage");
        ArrayList<MailImage> arrayList = this.f106481i;
        if (arrayList != null && mailImage != null) {
            Iterator<MailImage> it = arrayList.iterator();
            while (it.hasNext()) {
                MailImage next = it.next();
                if (next.mo151481g() != null && next.mo151481g().equals(mailImage.mo151481g()) && next.mo151480f() != null && next.mo151480f().equals(mailImage.mo151480f())) {
                    Log.m165389i("ComposeMailModel", "addImage duplicate image");
                    return;
                }
            }
            this.f106481i.add(mailImage);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public int mo150797a(MailDraft mailDraft, long j) {
        m166761a(mailDraft, false, false);
        return m166760a(mailDraft, this.f106474b, j);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150802a(MailDraft mailDraft, final AbstractC41869a<MailSendDraftResponse> aVar) {
        C42187a.m168476a(mailDraft, this.f106483k);
        if (mailDraft.mo151366s()) {
            C42187a.m168529f();
        }
        C42187a.m168511c(mailDraft.mo151370v());
        C42176e.m168344a().mo152196a(mailDraft, mailDraft.mo151362o(), new IGetDataCallback<MailSendDraftResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.C41946b.C419471 */

            /* renamed from: a */
            public void onSuccess(MailSendDraftResponse mailSendDraftResponse) {
                AbstractC41869a aVar = aVar;
                if (aVar != null) {
                    aVar.onSuccess(mailSendDraftResponse);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC41869a aVar = aVar;
                if (aVar != null) {
                    aVar.onError(errorResult);
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m166762a(String str, MailImage mailImage) {
        if (mailImage == null || TextUtils.isEmpty(mailImage.mo151481g())) {
            return false;
        }
        if (!str.contains("cid:" + mailImage.mo151481g() + "\"")) {
            if (str.contains(URLEncoder.encode("cid:" + mailImage.mo151481g() + "\""))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private int m166760a(MailDraft mailDraft, MailDraft mailDraft2, long j) {
        if ((mailDraft == null && mailDraft2 == null) || (mailDraft == null && mailDraft2.mo151367t())) {
            return 1;
        }
        if (mailDraft2 == null && mailDraft.mo151367t()) {
            return 2;
        }
        if (mailDraft == null || mailDraft.mo151367t()) {
            if (mailDraft2 != null) {
                if (j != 0 || !mailDraft2.mo151330a(mailDraft)) {
                    return 2;
                }
                return 0;
            }
        } else if ((this.f106477e instanceof DraftMailAction) || this.f106482j > 0 || j > 0) {
            return 2;
        } else {
            return 1;
        }
        return 1;
    }

    /* renamed from: a */
    private void m166761a(MailDraft mailDraft, boolean z, boolean z2) {
        String str;
        mailDraft.mo151327a(this.f106474b.mo151321a());
        mailDraft.mo151344e(this.f106474b.mo151361n());
        mailDraft.mo151348f(this.f106474b.mo151362o());
        if (mailDraft.mo151331b() == null || TextUtils.isEmpty(mailDraft.mo151331b().mo151182e())) {
            mailDraft.mo151325a(this.f106474b.mo151331b());
        }
        mailDraft.mo151351g(this.f106474b.mo151365r());
        mailDraft.mo151349f(this.f106474b.mo151363p());
        this.f106476d = mailDraft;
        if (z2) {
            if (z) {
                str = m166764j(mailDraft.mo151352h());
            } else {
                str = m166765k(mailDraft.mo151352h());
            }
            m166763i(str);
            m166768r();
            return;
        }
        mailDraft.mo151345e(m166767q());
        m166768r();
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41995a
    /* renamed from: a */
    public void mo150803a(final MailDraft mailDraft, boolean z, long j, final IGetDataCallback<MailDraft> iGetDataCallback) {
        Log.m165389i("ComposeMailModel", "updateDraft");
        m166761a(mailDraft, false, true);
        if (z) {
            int a = m166760a(mailDraft, this.f106474b, j);
            Log.m165389i("ComposeMailModel", "compareDraft result is " + a + ", contentPreSaveTimestamp: " + j);
            if (a == 1) {
                this.f106476d = new MailDraft();
                C43307b.m172030a().mo154977a(new DiscardDraftAction(this.f106474b.mo151321a(), this.f106474b.mo151361n()));
                return;
            } else if (a == 0) {
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(null);
                    return;
                }
                return;
            }
        }
        this.f106482j = System.currentTimeMillis();
        C42176e.m168344a().mo152197a(mailDraft, false, (IGetDataCallback<MailDraft>) new IGetDataCallback<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.compose.C41946b.C419482 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(MailDraft mailDraft) {
                C41946b.this.f106474b.mo151325a(mailDraft.mo151331b());
                C41946b.this.f106474b.mo151328a(mailDraft.mo151339d());
                C41946b.this.f106474b.mo151334b(mailDraft.mo151343e());
                C41946b.this.f106474b.mo151338c(mailDraft.mo151347f());
                C41946b.this.f106474b.mo151333b(mailDraft.mo151350g());
                C41946b.this.f106474b.mo151340d(mailDraft.mo151359l());
                C41946b.this.f106474b.mo151337c(mailDraft.mo151352h());
                C41946b.this.f106474b.mo151345e(mailDraft.mo151358k());
                C41946b.this.f106474b.mo151341d(mailDraft.mo151355i());
                C41946b.this.f106474b.mo151329a(mailDraft.mo151366s());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(mailDraft);
                }
            }
        });
    }
}
