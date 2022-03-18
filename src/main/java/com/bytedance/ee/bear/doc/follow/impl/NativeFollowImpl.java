package com.bytedance.ee.bear.doc.follow.impl;

import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.doc.follow.AbstractC5419b;
import com.bytedance.ee.bear.doc.follow.AbstractC5427d;
import com.bytedance.ee.bear.doc.follow.AbstractC5428e;
import com.bytedance.ee.bear.doc.follow.AbstractC5431f;
import com.bytedance.ee.bear.doc.follow.FollowModuleState;
import com.bytedance.ee.bear.doc.follow.event.ContentEvent;
import com.bytedance.ee.bear.doc.follow.event.PresenterLocationChangedEvent;
import com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a;
import com.bytedance.ee.bear.doc.follow.impl.rn.C5441b;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEventTypes;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.List;

public class NativeFollowImpl extends BaseFollowImpl implements NonProguard {
    private static final String PRESENTER_FOLLOWER_LOCATION = ("FOLLOW_EVENT:" + RNFollowEventTypes.PRESENTER_FOLLOWER_LOCATION.name());
    private AbstractC5431f followableContentHost = new C5435a();
    public List<AbstractC5427d> followableContents = new ArrayList();

    @Override // com.bytedance.ee.bear.doc.follow.impl.BaseFollowImpl, com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void startReplay() {
        super.startReplay();
        clearPresenterState();
    }

    private void clearPresenterState() {
        for (AbstractC5427d dVar : this.followableContents) {
            lambda$bindFollowableContent$1$NativeFollowImpl(dVar, null);
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.follow.impl.NativeFollowImpl$a */
    private class C5435a extends AbstractC5431f {
        private C5435a() {
        }

        @Override // com.bytedance.ee.bear.doc.follow.AbstractC5431f
        /* renamed from: a */
        public void mo21710a(AbstractC5424c cVar) {
            String str = NativeFollowImpl.this.TAG;
            C13479a.m54764b(str, "registerDriveFollowStateObserver:" + cVar);
            NativeFollowImpl.this.registerDocFollowStateObserver(cVar);
        }

        @Override // com.bytedance.ee.bear.doc.follow.AbstractC5431f
        /* renamed from: b */
        public void mo21712b(AbstractC5424c cVar) {
            String str = NativeFollowImpl.this.TAG;
            C13479a.m54764b(str, "unregisterDriveFollowStateObserver:" + cVar);
            NativeFollowImpl.this.unregisterDocFollowStateObserver(cVar);
        }

        @Override // com.bytedance.ee.bear.doc.follow.AbstractC5431f
        /* renamed from: b */
        public void mo21713b(AbstractC5427d dVar) {
            String str = NativeFollowImpl.this.TAG;
            C13479a.m54764b(str, "unregisterFollowableContent:" + dVar.mo21661a());
            NativeFollowImpl.this.unbindFollowableContent(dVar);
        }

        @Override // com.bytedance.ee.bear.doc.follow.AbstractC5431f
        /* renamed from: a */
        public void mo21711a(AbstractC5427d dVar) {
            if (NativeFollowImpl.this.followableContents.contains(dVar)) {
                String str = NativeFollowImpl.this.TAG;
                C13479a.m54775e(str, "registerFollowableContent already exist !" + dVar);
                return;
            }
            String str2 = NativeFollowImpl.this.TAG;
            C13479a.m54764b(str2, "registerFollowableContent:" + dVar.mo21661a());
            NativeFollowImpl.this.bindFollowableContent(dVar);
        }
    }

    public void bindFollowableContent(final AbstractC5427d dVar) {
        if (!this.followableContents.contains(dVar)) {
            this.followableContents.add(dVar);
        }
        String a = dVar.mo21661a();
        C5441b.m22068a(this.documentToken, a, RNFollowEventTypes.FOLLOW_REPLAY.name(), new AbstractC5440a(dVar) {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$NativeFollowImpl$M1NTDixaFCSg_WeizfD3kF9pyYM */
            public final /* synthetic */ AbstractC5427d f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a
            public final void onEvent(RNFollowEvent rNFollowEvent) {
                NativeFollowImpl.this.lambda$bindFollowableContent$0$NativeFollowImpl(this.f$1, rNFollowEvent);
            }
        });
        C5441b.m22068a(this.documentToken, a, RNFollowEventTypes.PRESENTER_STATE.name(), new AbstractC5440a(dVar) {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$NativeFollowImpl$UZGvVf_6mp9n_EPfSxZx7lGKowE */
            public final /* synthetic */ AbstractC5427d f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a
            public final void onEvent(RNFollowEvent rNFollowEvent) {
                NativeFollowImpl.this.lambda$bindFollowableContent$1$NativeFollowImpl(this.f$1, rNFollowEvent);
            }
        });
        dVar.mo21663a(new AbstractC5428e() {
            /* class com.bytedance.ee.bear.doc.follow.impl.NativeFollowImpl.C54341 */

            @Override // com.bytedance.ee.bear.doc.follow.AbstractC5428e
            /* renamed from: a */
            public void mo21685a(FollowModuleState followModuleState) {
                C5441b.m22066a(NativeFollowImpl.this.documentToken, followModuleState);
            }

            @Override // com.bytedance.ee.bear.doc.follow.AbstractC5428e
            /* renamed from: a */
            public boolean mo21686a(ContentEvent contentEvent) {
                if (!(contentEvent instanceof PresenterLocationChangedEvent)) {
                    return NativeFollowImpl.this.processContentEvent(contentEvent);
                }
                NativeFollowImpl.this.dispatchPresenterLocationChangedEventToRN(dVar.mo21661a(), contentEvent);
                return true;
            }
        });
    }

    public void unbindFollowableContent(AbstractC5427d dVar) {
        this.followableContents.remove(dVar);
        C5441b.m22076b(this.documentToken, dVar.mo21661a(), RNFollowEventTypes.FOLLOW_REPLAY.name());
        C5441b.m22076b(this.documentToken, dVar.mo21661a(), RNFollowEventTypes.PRESENTER_STATE.name());
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.BaseFollowImpl, com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void startRecord(AbstractC5419b.AbstractC5420a aVar, String[] strArr) {
        super.startRecord(aVar, strArr);
        clearPresenterState();
    }

    public static AbstractC5431f bindFollowableContent(Fragment fragment, String str) {
        return new NativeFollowImpl(fragment, str, new C5441b()).followableContentHost;
    }

    public void dispatchPresenterLocationChangedEventToRN(String str, ContentEvent contentEvent) {
        C5441b.m22069a(this.documentToken, str, PRESENTER_FOLLOWER_LOCATION, JSONObject.toJSONString(contentEvent));
    }

    /* access modifiers changed from: private */
    /* renamed from: setStates */
    public void lambda$bindFollowableContent$0$NativeFollowImpl(RNFollowEvent rNFollowEvent, AbstractC5427d dVar) {
        try {
            dVar.mo21662a((FollowModuleState) JSONObject.parseObject(rNFollowEvent.dataJson, FollowModuleState.class));
        } catch (Exception e) {
            C13479a.m54759a(this.TAG, "setStates err", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: updatePresenterState */
    public void lambda$bindFollowableContent$1$NativeFollowImpl(AbstractC5427d dVar, RNFollowEvent rNFollowEvent) {
        FollowModuleState followModuleState;
        if (rNFollowEvent == null) {
            followModuleState = null;
        } else {
            try {
                followModuleState = (FollowModuleState) JSONObject.parseObject(rNFollowEvent.dataJson, FollowModuleState.class);
            } catch (Exception e) {
                C13479a.m54759a(this.TAG, "setStates err", e);
                return;
            }
        }
        dVar.mo21666b(followModuleState);
    }

    private NativeFollowImpl(Fragment fragment, String str, C5441b bVar) {
        super(fragment, str, bVar);
    }
}
