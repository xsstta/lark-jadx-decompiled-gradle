package com.bytedance.ee.bear.drive.biz.feed;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.drive.biz.comment.DriveCommentVM;
import com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g;
import com.bytedance.ee.bear.middleground.feed.export.bean.FeedBuilder;
import com.bytedance.ee.bear.middleground.feed.export.bean.IFeed;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageConfig;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.util.common.C13604b;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.feed.a */
public class C6452a implements AbstractC6464e {

    /* renamed from: a */
    protected FragmentActivity f17819a;

    /* renamed from: b */
    protected IFeed f17820b;

    /* renamed from: c */
    protected C6923a f17821c = C6920b.m27342f().mo27168c();

    /* renamed from: d */
    protected C10917c f17822d;

    /* renamed from: e */
    protected FrameLayout f17823e;

    /* renamed from: f */
    protected C6937b f17824f;

    /* renamed from: g */
    protected DriveMGPermissionVM f17825g;

    /* renamed from: h */
    protected DriveCommentVM f17826h;

    /* renamed from: i */
    protected C7555f f17827i;

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e
    /* renamed from: a */
    public void mo25825a() {
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e
    /* renamed from: a */
    public void mo25826a(AbstractC6464e.AbstractC6465a aVar) {
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e
    /* renamed from: a */
    public void mo25829a(boolean z, boolean z2) {
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e
    /* renamed from: b */
    public void mo25830b() {
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e
    /* renamed from: c */
    public void mo25831c() {
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e
    /* renamed from: d */
    public void mo25832d() {
    }

    /* renamed from: e */
    public boolean mo25833e() {
        if (!(this.f17824f.getOpenEntity() instanceof SpaceFileOpenEntity)) {
            return false;
        }
        return C13604b.m55237a(((SpaceFileOpenEntity) this.f17824f.getOpenEntity()).getUrl());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MessageConfig mo25822a(C6522b bVar) {
        return mo25823a(bVar, false);
    }

    @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e
    /* renamed from: a */
    public void mo25828a(List<String> list) {
        IFeed dVar = this.f17820b;
        if (dVar != null) {
            dVar.mo35883a(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MessageConfig mo25823a(C6522b bVar, boolean z) {
        MessageConfig messageConfig = new MessageConfig();
        if (bVar == null) {
            return messageConfig;
        }
        boolean f = bVar.mo26060f();
        messageConfig.setToken(bVar.mo26055a());
        messageConfig.setDocumentType(C8275a.f22375h);
        messageConfig.setAuto(z);
        messageConfig.setCanComment(f);
        messageConfig.setCanReopen(f);
        messageConfig.setCanEdit(f);
        messageConfig.setCanShowVoice(f);
        messageConfig.setCanResolve(f);
        messageConfig.setCanCopy(bVar.mo26063i());
        messageConfig.setCanShowMore(true);
        messageConfig.setCanReaction(true);
        messageConfig.setOwner(bVar.mo26061g());
        return messageConfig;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IFeed mo25824a(C6522b bVar, AbstractC9494g gVar) {
        String str;
        boolean z;
        AbstractC9493f fVar = (AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class);
        if (bVar != null) {
            str = bVar.mo26055a();
        } else {
            str = "";
        }
        IFeed a = ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35932a(new FeedBuilder().mo36339a(this.f17819a).mo36338a(this.f17823e).mo36340a(mo25822a(bVar)).mo36342a(gVar).mo36341a(fVar.mo35933a(str, C8275a.f22375h)).mo36343a(this.f17822d));
        this.f17820b = a;
        if (bVar == null || !bVar.mo26061g()) {
            z = false;
        } else {
            z = true;
        }
        a.mo35878a(z, "").mo238004b(C11678b.m48478b()).mo238001b($$Lambda$a$_xi7RLz8nMbFNGYVBFoylefBLDM.INSTANCE, $$Lambda$a$8wYxrjE0bWQjF_WqDeBJMrOa43A.INSTANCE);
        return this.f17820b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25827a(String str, C10917c cVar) {
        String str2;
        C6937b bVar = this.f17824f;
        if (bVar == null || bVar.getFileModel() == null || this.f17824f.getFileModel().mo27322a() == null) {
            str2 = null;
        } else {
            str2 = this.f17824f.getFileModel().mo27322a().mo27358a();
        }
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, str2);
    }

    public C6452a(FragmentActivity fragmentActivity, C6937b bVar, DriveMGPermissionVM aVar, C7555f fVar, DriveCommentVM gVar, FrameLayout frameLayout, C10917c cVar) {
        this.f17819a = fragmentActivity;
        this.f17827i = fVar;
        this.f17824f = bVar;
        this.f17825g = aVar;
        this.f17823e = frameLayout;
        this.f17826h = gVar;
        this.f17822d = cVar;
    }
}
