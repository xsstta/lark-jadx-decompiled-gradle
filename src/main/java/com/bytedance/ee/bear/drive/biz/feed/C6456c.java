package com.bytedance.ee.bear.drive.biz.feed;

import android.app.Dialog;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import androidx.collection.C0513a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.comment.AbstractC6395l;
import com.bytedance.ee.bear.drive.biz.comment.DriveCommentVM;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.comment.data.C6376a;
import com.bytedance.ee.bear.drive.biz.comment.data.C6377b;
import com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.loader.download.p356a.C7002a;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.view.p362a.C7207a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g;
import com.bytedance.ee.bear.middleground.feed.export.bean.CardBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.biz.feed.c */
public class C6456c extends C6452a implements C6377b.AbstractC6379b {

    /* renamed from: j */
    public MessageResultBean f17830j;

    /* renamed from: k */
    public Set<String> f17831k = new C0513a();

    /* renamed from: l */
    public C6462d f17832l;

    /* renamed from: m */
    public C6377b f17833m;

    /* renamed from: n */
    public AbstractC6395l f17834n;

    /* renamed from: o */
    public Dialog f17835o;

    /* renamed from: p */
    public boolean f17836p;

    /* renamed from: q */
    private C68289a f17837q = new C68289a();

    /* renamed from: r */
    private AbstractC6464e.AbstractC6465a f17838r;

    /* renamed from: s */
    private List<String> f17839s = new ArrayList();

    /* renamed from: t */
    private C7207a f17840t;

    /* renamed from: u */
    private C6461b f17841u;

    /* renamed from: v */
    private boolean f17842v;

    /* renamed from: w */
    private boolean f17843w;

    /* renamed from: x */
    private boolean f17844x;

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: a */
    public void mo25829a(boolean z, boolean z2) {
        super.mo25829a(z, z2);
        if (this.f17820b == null) {
            return;
        }
        if (!z2) {
            this.f17820b.mo35886b(z);
        } else if (this.f17820b.mo35887b()) {
            this.f17820b.mo35879a();
        }
    }

    /* renamed from: a */
    public void mo25834a(boolean z) {
        try {
            MessageResultBean j = m25917j();
            if (j != null) {
                m25910a(j);
            }
            if (this.f17843w && !z) {
                if (m25913b(j)) {
                    mo25832d();
                }
                this.f17843w = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C13479a.m54758a("DriveFeedManager", e.toString());
        }
    }

    /* renamed from: f */
    public String mo25836f() {
        MessageResultBean messageResultBean = this.f17830j;
        if (messageResultBean != null) {
            return Integer.toHexString(messageResultBean.hashCode()).concat(" ");
        }
        return "";
    }

    /* renamed from: g */
    private void m25914g() {
        C13479a.m54764b("DriveFeedManager", "destroyFeed");
        if (this.f17820b != null) {
            try {
                this.f17820b.mo35889d();
                this.f17832l.mo25841a(0);
                if (this.f17834n.mo25510a() != null) {
                    this.f17834n.mo25510a().onCommentListPanelClose();
                }
            } catch (Exception e) {
                C13479a.m54761a("DriveFeedManager", e);
            }
            this.f17820b = null;
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: d */
    public void mo25832d() {
        C13479a.m54764b("DriveFeedManager", "closeFeed");
        if (this.f17820b != null) {
            this.f17820b.mo35879a();
            this.f17832l.mo25841a(0);
            if (this.f17834n.mo25510a() != null) {
                this.f17834n.mo25510a().onCommentListPanelClose();
            }
        }
    }

    /* renamed from: h */
    private void m25915h() {
        BaseOpenEntity openEntity = this.f17824f.getOpenEntity();
        if (!this.f17842v && (openEntity instanceof SpaceFileOpenEntity)) {
            SpaceFileOpenEntity spaceFileOpenEntity = (SpaceFileOpenEntity) openEntity;
            boolean a = ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35938a(spaceFileOpenEntity.getUrl(), spaceFileOpenEntity.getExtra());
            C13479a.m54764b("DriveFeedManager", "showFeedIfNeeded count " + a);
            if (a) {
                this.f17843w = true;
                mo25831c();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: b */
    public void mo25830b() {
        C13479a.m54764b("DriveFeedManager", "detach feed");
        if (this.f17841u != null) {
            this.f17825g.livePerm().mo5928b(this.f17841u);
            this.f17841u = null;
        }
        this.f17844x = false;
        this.f17842v = false;
        this.f17843w = false;
        Dialog dialog = this.f17835o;
        if (dialog != null && dialog.isShowing()) {
            C13479a.m54758a("DriveFeedManager", "detach dismiss");
            this.f17835o.dismiss();
        }
        this.f17830j = null;
        this.f17831k.clear();
        this.f17837q.mo237935a();
        this.f17839s.clear();
        this.f17833m.mo25618b(this);
        m25914g();
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: c */
    public void mo25831c() {
        C13479a.m54764b("DriveFeedManager", "showFeed");
        if (this.f17820b != null) {
            this.f17842v = true;
            this.f17820b.mo35880a(mo25823a(this.f17825g.livePerm().mo5927b(), true));
            this.f17820b.mo35884a(false);
            this.f17832l.mo25841a(8);
            if (this.f17834n.mo25510a() != null) {
                this.f17834n.mo25510a().showThumbnailPreview();
            }
        }
    }

    /* renamed from: i */
    private void m25916i() {
        boolean z;
        if (mo25833e()) {
            int size = this.f17839s.size();
            this.f17820b.mo35883a(this.f17839s);
            m25915h();
            C6522b b = this.f17825g.livePerm().mo5927b();
            if (b == null || !b.mo26064j()) {
                z = false;
            } else {
                z = true;
            }
            C13479a.m54764b("DriveFeedManager", "mUnreadHistoryMessageIdList size: " + size + " hasEditPermission: " + z);
            if (size > 0 && z && !this.f17844x) {
                this.f17844x = true;
                ArrayList arrayList = new ArrayList();
                for (String str : this.f17839s) {
                    arrayList.add(this.f17833m.mo25608a(str).mo238020d($$Lambda$c$Xkcf8MajIFDapqUVNTjcwETQc0U.INSTANCE).mo238026e(new Function(str) {
                        /* class com.bytedance.ee.bear.drive.biz.feed.$$Lambda$c$oPoTduy9R0iaAYawZL6VJdpVO98 */
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return C6456c.m25908a(this.f$0, (Throwable) obj);
                        }
                    }));
                }
                this.f17837q.mo237937a(AbstractC68307f.m265082a(arrayList, $$Lambda$c$Wh3a3ZIYH6lBJ4OPmgwVQh7Prk.INSTANCE).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.drive.biz.feed.$$Lambda$c$N3HO66wnGVPjwMmWODo4Akpg5bY */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C6456c.this.m25911a((C6456c) ((Boolean) obj));
                    }
                }, $$Lambda$c$e_A2fj7PGQJUsqUm356SQBY_s.INSTANCE));
            }
        }
    }

    /* renamed from: j */
    private MessageResultBean m25917j() {
        MessageResultBean.Data data;
        ArrayList arrayList;
        C13479a.m54764b("DriveFeedManager", mo25836f() + " data changed: mMessageResultBean=" + this.f17830j + " isDataReady " + this.f17833m.mo25620d());
        if (this.f17830j == null || !this.f17833m.mo25620d() || (data = this.f17830j.getData()) == null) {
            return null;
        }
        List<MessageBean> message = data.getMessage();
        if (message == null) {
            arrayList = new ArrayList(0);
        } else {
            arrayList = new ArrayList(message);
        }
        C13479a.m54764b("DriveFeedManager", String.format("%s data changed source: message=%d", mo25836f(), Integer.valueOf(arrayList.size())));
        ArrayMap arrayMap = new ArrayMap(arrayList.size());
        Iterator<CommentRectF> it = this.f17833m.mo25619c().iterator();
        while (it.hasNext()) {
            CommentRectF next = it.next();
            arrayMap.put(next.mo25555a(), next);
        }
        this.f17831k.clear();
        this.f17839s.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MessageBean messageBean = (MessageBean) it2.next();
            if (!arrayMap.containsKey(messageBean.getComment_id())) {
                if (messageBean.getReadStatus() == 1) {
                    this.f17839s.add(messageBean.getMessageId());
                }
                it2.remove();
            } else {
                messageBean.setQuote(C6376a.m25608a(this.f17819a, messageBean.getQuote()));
                if (messageBean.getReadStatus() == 1) {
                    this.f17831k.add(messageBean.getMessageId());
                }
            }
        }
        C13479a.m54764b("DriveFeedManager", String.format("%s data changed result: message=%d unread_history_message=%d unread_message=%d", mo25836f(), Integer.valueOf(arrayList.size()), Integer.valueOf(this.f17839s.size()), Integer.valueOf(this.f17831k.size())));
        MessageResultBean messageResultBean = new MessageResultBean();
        messageResultBean.setCode(this.f17830j.getCode());
        messageResultBean.setMsg(this.f17830j.getMsg());
        MessageResultBean.Data data2 = new MessageResultBean.Data();
        data2.setMessage(arrayList);
        messageResultBean.setData(data2);
        return messageResultBean;
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: a */
    public void mo25825a() {
        C13479a.m54764b("DriveFeedManager", "attach feed");
        mo25830b();
        mo25824a(this.f17825g.livePerm().mo5927b(), new C6458a());
        this.f17841u = new C6461b();
        this.f17825g.livePerm().mo5925a(this.f17841u);
        this.f17833m.mo25612a(this);
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: a */
    public void mo25826a(AbstractC6464e.AbstractC6465a aVar) {
        this.f17838r = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.feed.c$a */
    public class C6458a implements AbstractC9494g {
        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23344a(String str) {
        }

        private C6458a() {
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: b */
        public void mo23348b(int i) {
            C13479a.m54764b("DriveFeedManager", "### unReadBadgeCount:(current + history) " + i);
        }

        /* renamed from: c */
        private CommentRectF m25928c(String str) {
            try {
                Iterator<CommentRectF> it = C6456c.this.f17833m.mo25619c().iterator();
                while (it.hasNext()) {
                    CommentRectF next = it.next();
                    if (next.mo25555a().equals(str)) {
                        return next;
                    }
                }
                return null;
            } catch (Exception e) {
                C13479a.m54761a("DriveFeedManager", e);
                return null;
            }
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23339a(int i) {
            C13479a.m54772d("DriveFeedManager", C6456c.this.mo25836f() + "heightChange() called with: height = [" + i + "]");
            C6456c.this.f17826h.setCommentPanelDefaultHeight(Integer.valueOf(i));
            if (!C6456c.this.f17836p) {
                C6456c.this.f17836p = true;
                C6456c.this.f17832l.mo25841a(8);
                if (C6456c.this.f17834n.mo25510a() != null) {
                    C6456c.this.f17834n.mo25510a().showThumbnailPreview();
                }
            }
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: b */
        public boolean mo23349b(String str) {
            C13479a.m54772d("DriveFeedManager", C6456c.this.mo25836f() + "isSameLink url = [" + C13721c.m55650d(str) + "]");
            C7086a aVar = (C7086a) C6456c.this.f17824f.getFileModel();
            BearUrl g = C6313i.m25327a().mo25399g(str);
            if (aVar == null || g == null || !TextUtils.equals(g.f17447b, aVar.mo27322a().f18785a)) {
                return false;
            }
            Toast.showFailureText(C6456c.this.f17819a, C6456c.this.f17819a.getString(R.string.Drive_Drive_LinkToCurrentFile), 0);
            return true;
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23342a(MessageBean messageBean) {
            C13479a.m54764b("DriveFeedManager", String.format("%s go to message messageId = [ %s ], commentId = [ %s ]", C6456c.this.mo25836f(), messageBean.getMessageId(), messageBean.getComment_id()));
            C6456c.this.f17832l.mo25841a(8);
            if (CardBean.isComment(messageBean) || "MESSAGE_DOC_COMMENT".equals(messageBean.getType())) {
                if (C6456c.this.f17834n.mo25510a() != null) {
                    C6456c.this.f17834n.mo25510a().showSelectedComment(messageBean.getComment_id());
                }
                CommentRectF c = m25928c(messageBean.getComment_id());
                if (c != null) {
                    C6456c.this.f17826h.getLiveFeedSelectedComment().mo5926a(c);
                } else {
                    C6456c.this.f17833m.mo25608a(messageBean.getComment_id()).mo238001b(new Consumer<CommentRectF>() {
                        /* class com.bytedance.ee.bear.drive.biz.feed.C6456c.C6458a.C64591 */

                        /* renamed from: a */
                        public void accept(CommentRectF commentRectF) throws Exception {
                            C6456c.this.f17826h.getLiveFeedSelectedComment().mo5926a(commentRectF);
                        }
                    }, new Consumer<Throwable>() {
                        /* class com.bytedance.ee.bear.drive.biz.feed.C6456c.C6458a.C64602 */

                        /* renamed from: a */
                        public void accept(Throwable th) throws Exception {
                            C6456c.this.f17826h.getLiveFeedSelectedComment().mo5926a((CommentRectF) null);
                        }
                    });
                }
            } else if ("like".equals(messageBean.getSubType())) {
                ((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36375a(C6456c.this.f17824f.getOpenEntity().getFileId(), ((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36369a(C8275a.f22375h), "feed");
            }
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23346a(List<String> list) {
            C13479a.m54764b("DriveFeedManager", C6456c.this.mo25836f() + "unreadMessage  ids = " + Arrays.toString(C6456c.this.f17831k.toArray(new String[0])));
            C13479a.m54764b("DriveFeedManager", C6456c.this.mo25836f() + "readMessage    ids = " + Arrays.toString(list.toArray(new String[0])));
            C6456c.this.mo25835b(Collections.unmodifiableList(list));
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23345a(String str, C10917c cVar) {
            C6456c.this.mo25827a(str, cVar);
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23343a(MessageResultBean messageResultBean, String str) {
            C13479a.m54764b("DriveFeedManager", "###  MG data change: " + messageResultBean + ", source =" + str + ", current thread=" + Thread.currentThread().getName());
            if (messageResultBean != null && messageResultBean.getData() != null) {
                C6456c.this.f17830j = messageResultBean;
                C6456c.this.mo25834a("cache".equals(str));
            }
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23347a(boolean z, boolean z2) {
            C13479a.m54764b("DriveFeedManager", C6456c.this.mo25836f() + "statusChange show = [" + z + "]");
            C6456c.this.f17826h.getCommentPanelShowing().mo5929b(Boolean.valueOf(z));
            if (z) {
                C6456c.this.f17832l.mo25841a(8);
                if (C6456c.this.f17834n.mo25510a() != null) {
                    C6456c.this.f17834n.mo25510a().showThumbnailPreview();
                    return;
                }
                return;
            }
            C6456c.this.f17832l.mo25841a(0);
            if (C6456c.this.f17834n.mo25510a() != null) {
                C6456c.this.f17834n.mo25510a().onCommentListPanelClose();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.feed.c$b */
    public class C6461b implements AbstractC1178x<C6522b> {
        private C6461b() {
        }

        /* renamed from: a */
        public void onChanged(C6522b bVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            C7086a aVar = (C7086a) C6456c.this.f17824f.getFileModel();
            boolean z5 = true;
            if (aVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C6456c.this.mo25836f());
                sb.append("on permission changed: fileModel is null ");
                if (bVar == null || !bVar.mo26063i()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sb.append(z3);
                sb.append(" ");
                if (bVar == null || !bVar.mo26060f()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                sb.append(z4);
                sb.append(" ");
                if (bVar == null || !bVar.mo26061g()) {
                    z5 = false;
                }
                sb.append(z5);
                C13479a.m54775e("DriveFeedManager", sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C6456c.this.mo25836f());
                sb2.append("on permission changed: ");
                sb2.append(C13598b.m55197d(aVar.mo27322a().mo27358a()));
                sb2.append(" ");
                if (bVar == null || !bVar.mo26063i()) {
                    z = false;
                } else {
                    z = true;
                }
                sb2.append(z);
                sb2.append(" ");
                if (bVar == null || !bVar.mo26060f()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                sb2.append(z2);
                sb2.append(" ");
                if (bVar == null || !bVar.mo26061g()) {
                    z5 = false;
                }
                sb2.append(z5);
                C13479a.m54775e("DriveFeedManager", sb2.toString());
            }
            if (C6456c.this.f17835o != null && C6456c.this.f17835o.isShowing() && (bVar == null || !bVar.mo26063i())) {
                C13479a.m54758a("DriveFeedManager", "onChanged dismiss");
                C6456c.this.f17835o.dismiss();
            }
            if (C6456c.this.f17820b != null && bVar != null) {
                C6456c.this.f17820b.mo35880a(C6456c.this.mo25822a(bVar));
                C6456c.this.f17820b.mo35878a(bVar.mo26061g(), "").mo238004b(C11678b.m48478b()).mo238001b($$Lambda$c$b$k90DS064pLooRXOXiMWfFCJSmzI.INSTANCE, $$Lambda$c$b$HwqcQ50aY1T8uaiUIZTqWE4bw.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25912a(Throwable th) throws Exception {
        C13479a.m54764b("DriveFeedManager", "get comment error for show tip throwable = " + th);
    }

    /* renamed from: b */
    public int mo25835b(List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.f17831k.removeAll(list);
        }
        m25909a(this.f17831k.size());
        return this.f17831k.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m25907a(Object[] objArr) throws Exception {
        for (Object obj : objArr) {
            if ((obj instanceof C7002a) && ((C7002a) obj).mo27534b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m25913b(MessageResultBean messageResultBean) {
        if (messageResultBean == null || messageResultBean.getData() == null || messageResultBean.getData().getMessage() == null || messageResultBean.getData().getMessage().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m25909a(int i) {
        C13479a.m54764b("DriveFeedManager", mo25836f() + " updateFeedBadgeNumber: " + i);
        AbstractC6464e.AbstractC6465a aVar = this.f17838r;
        if (aVar != null) {
            aVar.mo25820a(i);
        }
    }

    /* renamed from: a */
    private void m25910a(MessageResultBean messageResultBean) {
        if (this.f17820b == null) {
            C13479a.m54764b("DriveFeedManager", "can not update ui without mFeed");
        } else if (messageResultBean == null) {
            C13479a.m54764b("DriveFeedManager", "can not update ui without mMessageResultBean");
        } else {
            this.f17820b.mo35881a(messageResultBean);
            mo25835b(Collections.emptyList());
            m25916i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25911a(Boolean bool) throws Exception {
        C13479a.m54764b("DriveFeedManager", "show tip otherVersionComment = " + bool);
        if (bool.booleanValue()) {
            Dialog a = this.f17840t.mo28222a(this.f17819a, this.f17819a.getString(R.string.Drive_Drive_NewVersion), this.f17819a.getString(R.string.Drive_Drive_ViewHistoryMessage), this.f17819a.getString(R.string.Doc_Facade_Confirm), null);
            this.f17835o = a;
            a.show();
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.comment.data.C6377b.AbstractC6379b
    /* renamed from: a */
    public void mo25624a(ArrayList<CommentRectF> arrayList) {
        C13479a.m54764b("DriveFeedManager", mo25836f() + " onDriveCommentDataReceived list = [" + Arrays.toString(arrayList.toArray(new CommentRectF[0])) + "]");
        mo25834a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m25908a(String str, Throwable th) throws Exception {
        C13479a.m54759a("DriveFeedManager", "show tip getCommentById failure, err: ", th);
        if (th instanceof NullPointerException) {
            return AbstractC68307f.m265083a(C7002a.m27890a());
        }
        return AbstractC68307f.m265083a(C7002a.m27891a(new CommentRectF(str)));
    }

    public C6456c(FragmentActivity fragmentActivity, C6937b bVar, DriveMGPermissionVM aVar, C7555f fVar, DriveCommentVM gVar, FrameLayout frameLayout, C6462d dVar, C6377b bVar2, C7207a aVar2) {
        super(fragmentActivity, bVar, aVar, fVar, gVar, frameLayout, ar.m20936a());
        this.f17833m = bVar2;
        this.f17832l = dVar;
        this.f17834n = dVar.mo25840a();
        this.f17840t = aVar2;
    }
}
