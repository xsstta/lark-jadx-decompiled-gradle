package com.ss.android.lark.contact.impl.department.detail;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.entity.ChatInfo;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.DepartmentStructure;
import com.ss.android.lark.contact.impl.department.detail.C35841e;
import com.ss.android.lark.contact.impl.department.detail.frame.C35850a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;

/* renamed from: com.ss.android.lark.contact.impl.department.detail.d */
public class C35831d extends BasePresenter<C35841e.AbstractC35842a, C35841e.AbstractC35844b, C35841e.AbstractC35844b.AbstractC35845a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.d$b */
    public class C35836b implements C35841e.AbstractC35844b.AbstractC35845a {
        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: a */
        public boolean mo131852a() {
            return ((C35841e.AbstractC35842a) C35831d.this.getModel()).mo131818b();
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: b */
        public void mo131853b() {
            ((C35841e.AbstractC35842a) C35831d.this.getModel()).mo131819c();
        }

        private C35836b() {
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: a */
        public void mo131846a(Department department) {
            ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131750a(department);
        }

        /* renamed from: c */
        public boolean mo131856c(Department department) {
            if (department == null) {
                return true;
            }
            return "0".equals(department.getId());
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: b */
        public void mo131854b(Department department) {
            ((C35841e.AbstractC35842a) C35831d.this.getModel()).mo131811a(department, new UIGetDataCallback(new IGetDataCallback<C35850a>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35831d.C35836b.C358371 */

                /* renamed from: a */
                public void onSuccess(C35850a aVar) {
                    ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131754a(aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("DepartmentDetailPresenter", errorResult.toString());
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: a */
        public void mo131850a(String str) {
            ((C35841e.AbstractC35842a) C35831d.this.getModel()).mo131813a(str, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35831d.C35836b.C358393 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131748a(R.string.Lark_Contacts_TeamGroupSupervisorCreateFailedTip);
                    Log.m165383e("DepartmentDetailPresenter", errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    boolean z;
                    StringBuilder sb = new StringBuilder();
                    sb.append("chat is null ");
                    if (chat == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    Log.m165389i("DepartmentDetailPresenter", sb.toString());
                    if (chat != null) {
                        ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131757a(chat.getId());
                    }
                }
            }));
        }

        /* renamed from: a */
        private void m140328a(Context context, String str) {
            ((C35841e.AbstractC35842a) C35831d.this.getModel()).mo131810a(context, str, new AbstractC44896a() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35831d.C35836b.C358404 */

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: b */
                public void mo128966b() {
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: b */
                public void mo128967b(ErrorResult errorResult) {
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128963a() {
                    ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131748a(R.string.Lark_Legacy_RequestSentApprovalPendingToast);
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128965a(String str) {
                    ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131757a(str);
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128964a(ErrorResult errorResult) {
                    if (errorResult.getErrorCode() == 4018) {
                        ((C35841e.AbstractC35842a) C35831d.this.getModel()).mo131821e();
                    }
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131767b(errorResult.getDisplayMsg());
                    }
                    Log.m165386e("DepartmentDetailPresenter", errorResult);
                }
            });
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: c */
        public boolean mo131857c(Department department, int i) {
            if (!TextUtils.equals(department.getId(), "-1") || i != 0) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: a */
        public void mo131847a(Department department, int i) {
            ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131751a(department, i);
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: b */
        public void mo131855b(Department department, int i) {
            ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131764b(department, i);
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: a */
        public void mo131845a(Context context, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
            ChatInfo chatInfo;
            ChatInfo.UserPermission userPermission;
            DepartmentStructure d = ((C35841e.AbstractC35842a) C35831d.this.getModel()).mo131820d();
            if (d != null && (chatInfo = d.getChatInfo()) != null && (userPermission = chatInfo.getUserPermission()) != ChatInfo.UserPermission.INVISIBLE && userPermission != ChatInfo.UserPermission.UNKNOWN) {
                if (userPermission != ChatInfo.UserPermission.VISIBLE_NOT_CREATE || chatInfo.getChat() != null) {
                    if (chatInfo.getChat() == null) {
                        if (userPermission == ChatInfo.UserPermission.VISIBLE_AND_CREATE) {
                            ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131773c(d.getDepartment().getId());
                        }
                    } else if (chatInfo.isMember()) {
                        ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131757a(chatInfo.getChat().getId());
                    } else {
                        m140328a(context, chatInfo.getChat().getId());
                    }
                }
            }
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: a */
        public void mo131849a(Department department, boolean z) {
            if (mo131856c(department) || z) {
                ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131779e();
            } else {
                ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131780f();
            }
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: a */
        public void mo131848a(Department department, String str, boolean z) {
            ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131752a(department, str, z);
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b.AbstractC35845a
        /* renamed from: a */
        public void mo131851a(String str, String str2, boolean z, int i) {
            ((C35841e.AbstractC35842a) C35831d.this.getModel()).mo131815a(str, str2, i, z, new UIGetDataCallback(new IGetDataCallback<C35850a>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35831d.C35836b.C358382 */

                /* renamed from: a */
                public void onSuccess(C35850a aVar) {
                    ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131754a(aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("DepartmentDetailPresenter", errorResult.toString());
                }
            }));
        }
    }

    /* renamed from: b */
    private C35841e.AbstractC35842a.AbstractC35843a m140324b() {
        return new C35833a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C35841e.AbstractC35844b.AbstractC35845a createViewDelegate() {
        return new C35836b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.d$a */
    public class C35833a implements C35841e.AbstractC35842a.AbstractC35843a {
        private C35833a() {
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a.AbstractC35843a
        /* renamed from: a */
        public void mo131841a(final C35850a aVar) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35831d.C35833a.RunnableC358341 */

                public void run() {
                    ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131765b(aVar);
                }
            });
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a.AbstractC35843a
        /* renamed from: b */
        public void mo131842b(final C35850a aVar) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35831d.C35833a.RunnableC358352 */

                public void run() {
                    ((C35841e.AbstractC35844b) C35831d.this.getView()).mo131771c(aVar);
                }
            });
        }
    }

    public C35831d(C35841e.AbstractC35842a aVar, C35841e.AbstractC35844b bVar, Bundle bundle) {
        super(aVar, bVar);
        aVar.mo131812a(m140324b());
    }
}
