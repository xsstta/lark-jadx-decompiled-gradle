package com.bytedance.ee.bear.drive.biz.feed;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.biz.comment.DriveCommentVM;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.feed.b */
public class C6453b extends C6452a {

    /* renamed from: j */
    public List<String> f17828j = new ArrayList();

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: c */
    public void mo25831c() {
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: d */
    public void mo25832d() {
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: b */
    public void mo25830b() {
        C13479a.m54764b("DriveFeedManager", "ClearBadgeFeedManager detach");
        try {
            if (this.f17820b != null) {
                this.f17820b.mo35889d();
            }
        } catch (Exception e) {
            C13479a.m54761a("DriveFeedManager", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e, com.bytedance.ee.bear.drive.biz.feed.C6452a
    /* renamed from: a */
    public void mo25825a() {
        mo25830b();
        if (mo25833e()) {
            C13479a.m54764b("DriveFeedManager", "ClearBadgeFeedManager attach");
            mo25824a(this.f17825g.livePerm().mo5927b(), new C6455a());
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.feed.b$a */
    private class C6455a implements AbstractC9494g {
        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23339a(int i) {
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23342a(MessageBean messageBean) {
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23344a(String str) {
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23346a(List<String> list) {
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23347a(boolean z, boolean z2) {
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: b */
        public void mo23348b(int i) {
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: b */
        public boolean mo23349b(String str) {
            return false;
        }

        private C6455a() {
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23345a(String str, C10917c cVar) {
            C6453b.this.mo25827a(str, cVar);
        }

        @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g
        /* renamed from: a */
        public void mo23343a(MessageResultBean messageResultBean, String str) {
            MessageResultBean.Data data;
            List<MessageBean> message;
            C13479a.m54764b("DriveFeedManager", " dataChange " + messageResultBean);
            if (!(messageResultBean == null || (data = messageResultBean.getData()) == null || (message = data.getMessage()) == null)) {
                ArrayList<MessageBean> arrayList = new ArrayList(message);
                C6453b.this.f17828j.clear();
                for (MessageBean messageBean : arrayList) {
                    if (messageBean.getReadStatus() == 1) {
                        C6453b.this.f17828j.add(messageBean.getMessageId());
                    }
                }
                if (!CollectionUtils.isEmpty(C6453b.this.f17828j)) {
                    C13479a.m54764b("DriveFeedManager", "clear all badge size=" + C6453b.this.f17828j.size());
                    C6453b.this.f17820b.mo35883a(C6453b.this.f17828j);
                }
            }
        }
    }

    public C6453b(FragmentActivity fragmentActivity, C6937b bVar, DriveMGPermissionVM aVar, C7555f fVar, DriveCommentVM gVar, FrameLayout frameLayout) {
        super(fragmentActivity, bVar, aVar, fVar, gVar, frameLayout, ar.m20936a());
    }
}
