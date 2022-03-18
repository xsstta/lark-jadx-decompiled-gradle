package com.bytedance.ee.bear.drive.biz.extra_info.liked;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.drive.biz.extra_info.LikeCircleImageView;
import com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.like.PushObserver;
import com.bytedance.ee.bear.middleground.like.export.C9531a;
import com.bytedance.ee.bear.middleground.like.export.LikePushBean;
import com.bytedance.ee.bear.middleground.like.export.LikeUserList;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9508a;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9511d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.liked.a */
public class C6440a {

    /* renamed from: a */
    public LikeInfoView f17795a;

    /* renamed from: b */
    public C7130c f17796b;

    /* renamed from: c */
    public String f17797c;

    /* renamed from: d */
    public C6937b f17798d;

    /* renamed from: e */
    private LikeCircleImageView f17799e;

    /* renamed from: f */
    private AccountService.Account f17800f;

    /* renamed from: g */
    private C68289a f17801g = new C68289a();

    /* renamed from: h */
    private String f17802h;

    /* renamed from: i */
    private boolean f17803i;

    /* renamed from: j */
    private View.OnClickListener f17804j = new View.OnClickListener() {
        /* class com.bytedance.ee.bear.drive.biz.extra_info.liked.C6440a.View$OnClickListenerC64411 */

        public void onClick(View view) {
            LikeInfoView.LikeState state = C6440a.this.f17795a.getState();
            C13479a.m54775e("LikeWrapper", "onClick: state" + state);
            int i = C64455.f17810a[state.ordinal()];
            if (i == 1) {
                C6440a.this.mo25801b();
                C6440a.this.f17796b.mo27964g(C6440a.this.f17797c, "cancel_praise");
            } else if (i == 2) {
                C6440a.this.mo25802c();
                C6440a.this.f17796b.mo27964g(C6440a.this.f17797c, "confirm_praise");
            }
            C6440a.this.f17796b.mo27949d((C7086a) C6440a.this.f17798d.getFileModel(), "like", "none");
        }
    };

    /* renamed from: k */
    private View.OnClickListener f17805k = new View.OnClickListener() {
        /* class com.bytedance.ee.bear.drive.biz.extra_info.liked.$$Lambda$a$Bcs5FcqX3g1NDEDj5WLOVKRsVA */

        public final void onClick(View view) {
            C6440a.this.m25852a((C6440a) view);
        }
    };

    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.liked.a$5 */
    static /* synthetic */ class C64455 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17810a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView$LikeState[] r0 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.LikeState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.biz.extra_info.liked.C6440a.C64455.f17810a = r0
                com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView$LikeState r1 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.LikeState.LIKED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.biz.extra_info.liked.C6440a.C64455.f17810a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView$LikeState r1 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.LikeState.UNLIKE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.extra_info.liked.C6440a.C64455.<clinit>():void");
        }
    }

    /* renamed from: h */
    private void m25858h() {
        try {
            ((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36375a(this.f17797c, 6, (String) null);
        } catch (Exception e) {
            C13479a.m54759a("LikeWrapper", "showLikeUserList:", e);
        }
    }

    /* renamed from: a */
    public void mo25799a() {
        if (this.f17802h != null) {
            ((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36374a(this.f17802h);
            this.f17802h = null;
        }
        C68289a aVar = this.f17801g;
        if (aVar != null) {
            aVar.mo237935a();
        }
    }

    /* renamed from: b */
    public void mo25801b() {
        this.f17801g.mo237937a(((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36376b(this.f17797c, 6, new AbstractC9511d() {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.liked.C6440a.C64422 */

            @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9511d
            /* renamed from: a */
            public void mo25809a(Throwable th) {
                C13479a.m54759a("LikeWrapper", "FileExtraInfoView doLike onError: ", th);
                C6440a.this.mo25803d();
            }

            @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9511d
            /* renamed from: a */
            public void mo25808a(int i, String str, String str2) {
                C13479a.m54764b("LikeWrapper", "FileExtraInfoView doLike onFetched: code=" + i + " id=" + str2 + " msg=" + str);
                if (i != 0) {
                    C6440a.this.mo25803d();
                }
            }
        }));
    }

    /* renamed from: c */
    public void mo25802c() {
        this.f17801g.mo237937a(((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36371a(this.f17797c, 6, new AbstractC9511d() {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.liked.C6440a.C64433 */

            @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9511d
            /* renamed from: a */
            public void mo25809a(Throwable th) {
                C13479a.m54759a("LikeWrapper", "FileExtraInfoView unLike onError: ", th);
                C6440a.this.mo25803d();
            }

            @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9511d
            /* renamed from: a */
            public void mo25808a(int i, String str, String str2) {
                C13479a.m54764b("LikeWrapper", "FileExtraInfoView unLike onFetched: code=" + i + " id=" + str2 + " msg=" + str);
                if (i != 0) {
                    C6440a.this.mo25803d();
                }
            }
        }));
    }

    /* renamed from: d */
    public void mo25803d() {
        Toast.showFailureText(this.f17795a.getContext(), this.f17795a.getResources().getString(R.string.Drive_Drive_LikeFail), 1);
    }

    /* renamed from: e */
    public void mo25804e() {
        this.f17801g.mo237937a(((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36370a(this.f17797c, 6, new AbstractC9508a() {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.liked.C6440a.C64444 */

            @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9508a
            /* renamed from: a */
            public void mo25811a(Throwable th) {
                C13479a.m54759a("LikeWrapper", "FileExtraInfoView updateLikeInfo onError: ", th);
            }

            @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9508a
            /* renamed from: a */
            public void mo25810a(int i, String str, int i2, String str2, int i3) {
                C13479a.m54764b("LikeWrapper", "FileExtraInfoView updateLikeInfo onFetched: code=" + i + " count=" + i2 + " likeId=" + str2 + " msg=" + str);
                if (i == 0) {
                    C6440a.this.mo25800a(i3);
                    C6440a.this.f17795a.mo25789a(!TextUtils.isEmpty(str2));
                    C6440a.this.f17795a.mo25788a(i2);
                }
            }
        }));
        this.f17801g.mo237937a(((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36372a(this.f17797c, 6, "0", 2).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.liked.$$Lambda$a$a8tcbHPK_hP8YIM7gAwCtPo8zgw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6440a.this.m25853a((C6440a) ((NetService.Result) obj));
            }
        }, $$Lambda$a$45m2AAqSMz3E1uWmDbCd0_p3Qw.INSTANCE));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo25805f() {
        if (!this.f17803i) {
            C13479a.m54764b("LikeWrapper", "disableLikeView: ");
            this.f17795a.mo25787a();
            this.f17795a.setOnClickListener(null);
            this.f17799e.mo25783a();
            this.f17799e.setOnClickListener(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo25806g() {
        if (!this.f17803i) {
            C13479a.m54764b("LikeWrapper", "enableLikeView: ");
            this.f17795a.mo25790b();
            this.f17795a.setOnClickListener(this.f17804j);
            this.f17799e.mo25785b();
            this.f17799e.setOnClickListener(this.f17805k);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m25852a(View view) {
        m25858h();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m25856b(String str) {
        C13479a.m54764b("LikeWrapper", "like push receive");
        C13748k.m55732a(new Runnable(str) {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.liked.$$Lambda$a$pzLeKxF_Gl1nyPh4CMaqNer8Oso */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C6440a.this.m25857c(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m25853a(NetService.Result result) throws Exception {
        if (result == null || result.getData() == null) {
            C13479a.m54758a("LikeWrapper", "likeUserList is null");
        } else {
            this.f17799e.mo25784a(C9531a.m39368a((LikeUserList) result.getData(), 2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25857c(String str) {
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("body").getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if ("LIKE".equalsIgnoreCase(jSONObject.getString(ShareHitPoint.f121869d)) || "DISLIKE".equalsIgnoreCase(jSONObject.getString(ShareHitPoint.f121869d))) {
                LikePushBean likePushBean = (LikePushBean) jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).toJavaObject(LikePushBean.class);
                if (TextUtils.equals(likePushBean.getUser_id(), this.f17800f.f14584a)) {
                    this.f17795a.mo25789a(likePushBean.isIs_liked());
                }
                this.f17795a.mo25788a(likePushBean.getCount());
                this.f17799e.mo25784a(C9531a.m39367a(likePushBean));
            }
        } catch (Exception e) {
            C13479a.m54759a("LikeWrapper", "updateLikeInfo", e);
        }
    }

    /* renamed from: a */
    public void mo25800a(int i) {
        if (this.f17802h != null) {
            ((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36374a(this.f17802h);
        }
        this.f17802h = ((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36373a(this.f17797c, i, new PushObserver() {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.liked.$$Lambda$a$KartxQODF0n0aJGzw0jgRa9IjQ */

            @Override // com.bytedance.ee.bear.middleground.like.PushObserver
            public final void didReceivePush(String str) {
                C6440a.this.m25856b(str);
            }
        });
    }

    public C6440a(C6937b bVar, LikeInfoView likeInfoView, LikeCircleImageView likeCircleImageView) {
        this.f17798d = bVar;
        this.f17797c = bVar.getOpenEntity().getFileId();
        NetService netService = (NetService) KoinJavaComponent.m268610a(NetService.class);
        this.f17800f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        this.f17799e = likeCircleImageView;
        this.f17795a = likeInfoView;
        this.f17796b = C6920b.m27342f().mo27166a();
        boolean N = C4511g.m18594d().mo17353N();
        this.f17803i = N;
        if (N) {
            this.f17799e.setVisibility(8);
            this.f17795a.setVisibility(8);
        }
        this.f17795a.mo25788a(0);
        this.f17795a.mo25789a(false);
        this.f17799e.mo25784a(new ArrayList());
    }
}
