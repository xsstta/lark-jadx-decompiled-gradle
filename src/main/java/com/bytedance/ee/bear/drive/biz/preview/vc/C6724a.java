package com.bytedance.ee.bear.drive.biz.preview.vc;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.doc.follow.AbstractC5427d;
import com.bytedance.ee.bear.doc.follow.AbstractC5428e;
import com.bytedance.ee.bear.doc.follow.FollowModuleState;
import com.bytedance.ee.bear.drive.biz.comment.AbstractC6394k;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.log.C13479a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.a */
public class C6724a implements AbstractC5427d {

    /* renamed from: a */
    public AbstractC5428e f18310a;

    /* renamed from: b */
    public String f18311b = "";

    /* renamed from: c */
    private WeakReference<AbstractC6394k> f18312c;

    /* renamed from: d */
    private C6727b f18313d;

    /* renamed from: e */
    private C6728c f18314e;

    /* renamed from: f */
    private C6726a f18315f;

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
    /* renamed from: a */
    public String mo21661a() {
        return Comment.f24093e;
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
    /* renamed from: b */
    public void mo21666b(FollowModuleState followModuleState) {
    }

    public C6724a() {
        C6727b bVar = new C6727b();
        this.f18313d = bVar;
        this.f18314e = new C6728c(bVar);
        this.f18315f = new C6726a(this.f18313d);
    }

    /* renamed from: b */
    public void mo26472b() {
        C13479a.m54764b("vc_follow_module", "CommentVCFollowConnector onDetach: ");
        WeakReference<AbstractC6394k> weakReference = this.f18312c;
        if (weakReference != null && weakReference.get() != null) {
            m26486d(this.f18315f);
            m26484b(this.f18314e);
        }
    }

    /* renamed from: b */
    private String m26483b(DriveCommentState driveCommentState) {
        return JSON.toJSONString(driveCommentState);
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
    /* renamed from: a */
    public void mo21663a(AbstractC5428e eVar) {
        this.f18310a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.a$b */
    public class C6727b {

        /* renamed from: b */
        private long f18319b;

        private C6727b() {
            this.f18319b = SystemClock.uptimeMillis();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo26474a(String str, boolean z) {
            if (SystemClock.uptimeMillis() - this.f18319b >= 50) {
                this.f18319b = SystemClock.uptimeMillis();
                FollowModuleState a = C6724a.this.mo26469a(str, z);
                if (C6724a.this.f18310a != null) {
                    C13479a.m54764b("vc_follow_module", "CommentStateChangeListener onStateChange: followModuleState=" + a.toString());
                    C6724a.this.f18310a.mo21685a(a);
                }
            }
        }
    }

    /* renamed from: a */
    private DriveCommentState m26480a(String str) {
        try {
            return (DriveCommentState) JSON.parseObject(str, DriveCommentState.class);
        } catch (Exception e) {
            C13479a.m54759a("vc_follow_module", "parseState: ", e);
            return new DriveCommentState();
        }
    }

    /* renamed from: b */
    private void m26484b(Function1<String, Unit> function1) {
        WeakReference<AbstractC6394k> weakReference = this.f18312c;
        if (weakReference == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector.java.removeCommentSwitchChangeListener: mCommentWrapper IS NULL");
            return;
        }
        AbstractC6394k kVar = weakReference.get();
        if (kVar == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector removeCommentSwitchChangeListener: mCommentWrapper is null");
        } else {
            kVar.mo25644c(function1);
        }
    }

    /* renamed from: c */
    private void m26485c(Function1<Boolean, Unit> function1) {
        WeakReference<AbstractC6394k> weakReference = this.f18312c;
        if (weakReference == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector.java.addCommentClosedChangeListener: mCommentWrapper IS NULL");
            return;
        }
        AbstractC6394k kVar = weakReference.get();
        if (kVar == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector addCommentClosedChangeListener: mCommentWrapper is null");
        } else {
            kVar.mo25642b(function1);
        }
    }

    /* renamed from: d */
    private void m26486d(Function1<Boolean, Unit> function1) {
        WeakReference<AbstractC6394k> weakReference = this.f18312c;
        if (weakReference == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector.java.removeCommentClosedChangeListener: mCommentWrapper IS NULL");
            return;
        }
        AbstractC6394k kVar = weakReference.get();
        if (kVar == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector removeCommentClosedChangeListener: mCommentWrapper is null");
        } else {
            kVar.mo25648d(function1);
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.a$a */
    private class C6726a implements Function1<Boolean, Unit> {

        /* renamed from: a */
        C6727b f18316a;

        /* renamed from: a */
        public Unit invoke(Boolean bool) {
            C13479a.m54764b("vc_follow_module", "CommentClosedListener invoke: aBoolean=" + bool);
            this.f18316a.mo26474a(null, false);
            if (!bool.booleanValue()) {
                C6724a.this.f18311b = "";
            }
            return Unit.INSTANCE;
        }

        public C6726a(C6727b bVar) {
            this.f18316a = bVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.a$c */
    private class C6728c implements Function1<String, Unit> {

        /* renamed from: a */
        C6727b f18320a;

        /* renamed from: a */
        public Unit invoke(String str) {
            C13479a.m54764b("vc_follow_module", "CommentSwitchChangeListener invoke: s=" + str);
            if (!TextUtils.isEmpty(str) && !str.startsWith("DriveCommentWrapper")) {
                this.f18320a.mo26474a(str, true);
                C6724a.this.f18311b = str;
            }
            return Unit.INSTANCE;
        }

        public C6728c(C6727b bVar) {
            this.f18320a = bVar;
        }
    }

    /* renamed from: a */
    private void m26481a(Function1<String, Unit> function1) {
        WeakReference<AbstractC6394k> weakReference = this.f18312c;
        if (weakReference == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector.java.addCommentSwitchChangeListener: mCommentWrapper IS NULL");
            return;
        }
        AbstractC6394k kVar = weakReference.get();
        if (kVar == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector addCommentSwitchChangeListener: mCommentWrapper is null");
        } else {
            kVar.mo25638a(function1);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
    /* renamed from: a */
    public void mo21662a(FollowModuleState followModuleState) {
        String str;
        if (followModuleState == null || !TextUtils.equals(followModuleState.module, Comment.f24093e)) {
            if (("CommentVCFollowConnector setState: state is invalid state=" + followModuleState) == null) {
                str = "null";
            } else {
                str = followModuleState.toString();
            }
            C13479a.m54775e("vc_follow_module", str);
            return;
        }
        mo26471a(m26480a(followModuleState.data));
    }

    /* renamed from: a */
    public void mo26470a(AbstractC6394k kVar) {
        C13479a.m54764b("vc_follow_module", "CommentVCFollowConnector setFollowDocumentInfo: ");
        this.f18312c = new WeakReference<>(kVar);
        m26481a(this.f18314e);
        m26485c(this.f18315f);
    }

    /* renamed from: a */
    public void mo26471a(DriveCommentState driveCommentState) {
        C13479a.m54764b("vc_follow_module", "CommentVCFollowConnector doRemoteAction: ");
        WeakReference<AbstractC6394k> weakReference = this.f18312c;
        if (weakReference == null || driveCommentState == null) {
            C13479a.m54764b("vc_follow_module", "doRemoteAction: mCommentWrapper or state is null");
            return;
        }
        AbstractC6394k kVar = weakReference.get();
        if (kVar == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector doRemoteAction: mCommentWrapper is null");
        } else if (!kVar.mo25646c()) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector doRemoteAction: data is null");
        } else {
            try {
                if (!driveCommentState.isIsCommentExpanded()) {
                    kVar.mo25632a();
                } else if (kVar.mo25654i() && !TextUtils.isEmpty(driveCommentState.getFocusedCommentId())) {
                    C13479a.m54764b("vc_follow_module", "doRemoteAction: switchCard");
                    kVar.mo25641b(driveCommentState.getFocusedCommentId());
                } else if (!kVar.mo25654i()) {
                    C13479a.m54764b("vc_follow_module", "doRemoteAction: showComment");
                    kVar.mo25637a(driveCommentState.getFocusedCommentId());
                }
            } catch (Exception e) {
                C13479a.m54773d("vc_follow_module", "CommentVCFollowConnector doRemoteAction: ", e);
            }
        }
    }

    /* renamed from: b */
    private DriveCommentState m26482b(String str, boolean z) {
        DriveCommentState driveCommentState = new DriveCommentState();
        WeakReference<AbstractC6394k> weakReference = this.f18312c;
        if (weakReference == null) {
            return driveCommentState;
        }
        if (weakReference.get() == null) {
            C13479a.m54775e("vc_follow_module", "CommentVCFollowConnector generateDriveCommentState: mCommentWrapper is null");
            return driveCommentState;
        }
        if (z) {
            driveCommentState.setFocusedCommentId(str);
        }
        driveCommentState.setIsCommentExpanded(z);
        return driveCommentState;
    }

    /* renamed from: a */
    public FollowModuleState mo26469a(String str, boolean z) {
        return new FollowModuleState(Comment.f24093e, "drive_comment_update", m26483b(m26482b(str, z)));
    }
}
