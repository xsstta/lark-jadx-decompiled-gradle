package com.ss.android.lark.chatsetting.impl.group.ownership.v1;

import android.util.Log;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d;
import com.ss.android.lark.chatsetting.impl.group.setting.C34941c;
import com.ss.android.lark.chatsetting.impl.group.setting.C34970j;
import com.ss.android.lark.chatsetting.impl.group.setting.C34971k;
import com.ss.android.lark.chatsetting.impl.group.setting.C34972l;
import com.ss.android.lark.chatsetting.impl.group.setting.C34973m;
import com.ss.android.lark.chatsetting.impl.statistics.ChatStatisticUtil;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.d */
public class C34844d extends BasePresenter<AbstractC34860e.AbstractC34861a, AbstractC34860e.AbstractC34863b, AbstractC34860e.AbstractC34863b.AbstractC34864a> {
    /* renamed from: b */
    private AbstractC34860e.AbstractC34861a.AbstractC34862a m135516b() {
        return new C34849a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34860e.AbstractC34863b.AbstractC34864a createViewDelegate() {
        return new C34850b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.d$b */
    public class C34850b implements AbstractC34860e.AbstractC34863b.AbstractC34864a {
        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: h */
        public Chat mo128638h() {
            return ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: i */
        public Team mo128640i() {
            return ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128594b();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: b */
        public void mo128625b() {
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128595b(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348566 */

                /* renamed from: a */
                public void onSuccess(String str) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Calendar_SubscribeCalendar_OperationFailed)));
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: g */
        public void mo128636g() {
            Chat a = ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a();
            ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128550d(a.getId(), a.isThread());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: j */
        public void mo128642j() {
            ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128558l(((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: c */
        public void mo128628c() {
            Chat a = ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a();
            ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128537a(a.getId(), a.getOwnerId(), a.getPostType(), a.isThread());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: d */
        public void mo128630d() {
            ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128538a(((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a().getId(), ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a().isThread());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: e */
        public void mo128632e() {
            String id = ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a().getId();
            OwnershipHitPoint.f90525a.mo129294c(id);
            ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128542b(id, ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a().isThread());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: f */
        public void mo128634f() {
            String id = ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a().getId();
            OwnershipHitPoint.f90525a.mo129291b(id);
            ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128548c(id, ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a().isThread());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: a */
        public void mo128621a() {
            Chat a = ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128579a();
            OwnershipHitPoint.f90525a.mo129286a("manage_group", a.getId());
            GroupHitPoint.f90519a.mo129245h();
            GroupHitPoint.f90519a.mo129227c(a.getId());
            if (a.getMemberCount() == 1) {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128531a(R.string.Lark_Legacy_ChangeOwner, R.string.Lark_Legacy_ChatGroupInfoTransferOnlyownerContent);
            } else {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128555i(a);
            }
        }

        private C34850b() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: c */
        public void mo128629c(final boolean z) {
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128600c(z, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348599 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128543b(!z);
                }
            }));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: f */
        public void mo128635f(boolean z) {
            Chat.BuzzPermissionSetting buzzPermissionSetting;
            if (z) {
                buzzPermissionSetting = Chat.BuzzPermissionSetting.ONLY_MANAGER;
            } else {
                buzzPermissionSetting = Chat.BuzzPermissionSetting.ALL_MEMBERS;
            }
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128581a(buzzPermissionSetting, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348511 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128551e(chat);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr)));
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: h */
        public void mo128639h(boolean z) {
            Chat.PinPermissionSetting pinPermissionSetting;
            if (z) {
                pinPermissionSetting = Chat.PinPermissionSetting.ONLY_MANAGER;
            } else {
                pinPermissionSetting = Chat.PinPermissionSetting.ALL_MEMBERS;
            }
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128583a(pinPermissionSetting, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348533 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128546c(chat);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr)));
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: i */
        public void mo128641i(boolean z) {
            Chat.TopNoticePermissionSetting topNoticePermissionSetting;
            if (z) {
                topNoticePermissionSetting = Chat.TopNoticePermissionSetting.ONLY_MANAGER;
            } else {
                topNoticePermissionSetting = Chat.TopNoticePermissionSetting.ALL_MEMBER;
            }
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128585a(topNoticePermissionSetting, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348544 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128549d(chat);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr)));
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: a */
        public void mo128622a(Chat.SystemMessageVisible systemMessageVisible) {
            OwnershipHitPoint.f90525a.mo129289a(true, systemMessageVisible, mo128638h().getMemberCount(), mo128638h().getId());
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128584a(systemMessageVisible, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.AnonymousClass12 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128532a(chat);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr)));
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: b */
        public void mo128626b(Chat.SystemMessageVisible systemMessageVisible) {
            OwnershipHitPoint.f90525a.mo129289a(false, systemMessageVisible, mo128638h().getMemberCount(), mo128638h().getId());
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128596b(systemMessageVisible, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.AnonymousClass13 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128532a(chat);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr)));
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: g */
        public void mo128637g(boolean z) {
            Chat.CreateVideoConferenceSetting createVideoConferenceSetting;
            if (z) {
                createVideoConferenceSetting = Chat.CreateVideoConferenceSetting.ONLY_MANAGER;
            } else {
                createVideoConferenceSetting = Chat.CreateVideoConferenceSetting.ALL_MEMBERS;
            }
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128582a(createVideoConferenceSetting, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348522 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128552f(chat);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr)));
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: b */
        public void mo128627b(final boolean z) {
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128598b(z, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348588 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        EventBus.getDefault().trigger(new C34941c(chat.getId(), chat.getAnonymousSetting()));
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UpdateOwnerEditInfoStateFailed)));
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128539a(!z);
                }
            }));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: d */
        public void mo128631d(boolean z) {
            OwnershipHitPoint.f90525a.mo129283a(1, z, mo128638h().getMemberCount(), mo128638h().getId());
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128602d(z, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.AnonymousClass10 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UpdateMemberCanShareFailed)));
                }

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        EventBus.getDefault().trigger(new C34971k(chat.getId(), chat.getAddMemberPermission()));
                        EventBus.getDefault().trigger(new C34970j(chat.getId(), chat.getShareCardPermission()));
                        ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128553g(chat);
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: e */
        public void mo128633e(boolean z) {
            OwnershipHitPoint.f90525a.mo129283a(2, z, mo128638h().getMemberCount(), mo128638h().getId());
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128603e(z, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.AnonymousClass11 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UpdateOwnerAtAllStateFailed)));
                }

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        EventBus.getDefault().trigger(new C34972l(chat.getId(), chat.getAtAllPermission()));
                        ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128557k(chat);
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: a */
        public void mo128623a(boolean z) {
            OwnershipHitPoint.f90525a.mo129283a(0, z, mo128638h().getMemberCount(), mo128638h().getId());
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128592a(z, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348577 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UpdateOwnerEditInfoStateFailed)));
                }

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        EventBus.getDefault().trigger(new C34973m(chat.getId(), chat.isOnlyOwnerEditGroupInfo()));
                        ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128556j(chat);
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34863b.AbstractC34864a
        /* renamed from: a */
        public void mo128624a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType) {
            ((AbstractC34860e.AbstractC34861a) C34844d.this.getModel()).mo128593a(z, groupMailSendPermissionType, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C34850b.C348555 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128554h(chat);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Group_GroupSettings_Email_Permission_Failed)));
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.d$a */
    public class C34849a implements AbstractC34860e.AbstractC34861a.AbstractC34862a {
        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a.AbstractC34862a
        /* renamed from: a */
        public boolean mo128619a() {
            return ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128544b();
        }

        private C34849a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: c */
        private /* synthetic */ void m135530c(String str) {
            ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128547c(str);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: d */
        private /* synthetic */ void m135531d(String str) {
            ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128541b(str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a.AbstractC34862a
        /* renamed from: a */
        public void mo128617a(Chat chat) {
            UICallbackExecutor.execute(new Runnable(chat) {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$d$a$mgYNSe9eakpJFsGVUiHrCiVJyEc */
                public final /* synthetic */ Chat f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C34844d.C34849a.this.m135529b((C34844d.C34849a) this.f$1);
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a.AbstractC34862a
        /* renamed from: b */
        public void mo128620b(String str) {
            UICallbackExecutor.execute(new Runnable(str) {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$d$a$_Fl_Zgd1gt5raJI_vOMH4gs0Y1I */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C34844d.C34849a.this.m135530c(this.f$1);
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a.AbstractC34862a
        /* renamed from: a */
        public void mo128618a(String str) {
            UICallbackExecutor.execute(new Runnable(str) {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$d$a$58yybp3E9ao6SAJ2hN_ClXLoer4 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C34844d.C34849a.this.m135531d(this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m135529b(Chat chat) {
            if (!C34501a.m133936b(chat)) {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128541b(chat.getOwnerId());
            } else {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128532a(chat);
            }
        }
    }

    /* renamed from: c */
    private void m135517c(final Chat chat) {
        ((AbstractC34860e.AbstractC34861a) getModel()).mo128587a(chat, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C348462 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m135525a(Chat chat) {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128540b(chat);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    UICallbackExecutor.execute(new Runnable(chat) {
                        /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.$$Lambda$d$2$AzXzWMIKlmYhRqHuwaW1h7_iARk */
                        public final /* synthetic */ Chat f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C34844d.C348462.this.m135525a((C34844d.C348462) this.f$1);
                        }
                    });
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.i("GroupOwnershipPresenter", "GroupOwnershipPresenter: onError " + errorResult);
            }
        });
    }

    /* renamed from: d */
    private void m135518d(final Chat chat) {
        ((AbstractC34860e.AbstractC34861a) getModel()).mo128580a(new IGetDataCallback<Long>() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C348484 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(Long l) {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128533a(chat, l);
            }
        });
    }

    /* renamed from: a */
    public void mo128610a(Chatter chatter) {
        ((AbstractC34860e.AbstractC34861a) getModel()).mo128589a(chatter, new UIGetDataCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C348451 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                ChatStatisticUtil.m136658a(chat, "chat_manage");
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128541b(chat.getOwnerId());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128536a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ChangeOwnerFailed)));
            }
        }));
    }

    /* renamed from: b */
    public void mo128612b(final Chat chat) {
        ((AbstractC34860e.AbstractC34861a) getModel()).mo128591a(chat.getId(), new UIGetDataCallback(new IGetDataCallback<List<Chatter>>() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34844d.C348473 */

            /* renamed from: a */
            public void onSuccess(List<Chatter> list) {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128534a(chat, list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC34860e.AbstractC34863b) C34844d.this.getView()).mo128534a(chat, new ArrayList());
            }
        }));
    }

    /* renamed from: a */
    public void mo128609a(Chat chat) {
        ((AbstractC34860e.AbstractC34861a) getModel()).mo128586a(chat);
        ((AbstractC34860e.AbstractC34863b) getView()).mo128532a(chat);
        mo128612b(chat);
        m135518d(chat);
        ((AbstractC34860e.AbstractC34861a) getModel()).mo128597b(chat);
        m135517c(chat);
    }

    /* renamed from: a */
    public void mo128611a(boolean z) {
        if (z && getView() != null) {
            ((AbstractC34860e.AbstractC34863b) getView()).mo128545c();
        }
    }

    public C34844d(AbstractC34860e.AbstractC34861a aVar, AbstractC34860e.AbstractC34863b bVar) {
        super(aVar, bVar);
        aVar.mo128590a(m135516b());
    }
}
