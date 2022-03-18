package com.ss.android.lark.chatsetting.impl.group.info.edit;

import android.content.Context;
import android.content.Intent;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d;
import com.ss.android.lark.chatsetting.impl.group.info.edit.C34637b;
import com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.c */
public class C34640c extends BasePresenter<AbstractC34647d.AbstractC34648a, AbstractC34647d.AbstractC34650b, AbstractC34647d.AbstractC34650b.AbstractC34651a> {
    /* renamed from: c */
    private AbstractC34647d.AbstractC34648a.AbstractC34649a m134601c() {
        return new AbstractC34647d.AbstractC34648a.AbstractC34649a() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34640c.C346422 */
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34647d.AbstractC34650b.AbstractC34651a createViewDelegate() {
        return new AbstractC34647d.AbstractC34650b.AbstractC34651a() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34640c.C346433 */

            @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b.AbstractC34651a
            /* renamed from: a */
            public void mo127950a(GroupInfoEditView.DescEditStatus descEditStatus) {
                ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127916a(((AbstractC34647d.AbstractC34648a) C34640c.this.getModel()).mo127939a().getDescription(), descEditStatus);
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b.AbstractC34651a
            /* renamed from: b */
            public void mo127953b(final String str) {
                GroupHitPoint.f90519a.mo129231d(((AbstractC34647d.AbstractC34648a) C34640c.this.getModel()).mo127939a(), !str.equals(((AbstractC34647d.AbstractC34648a) C34640c.this.getModel()).mo127943b()), str.length());
                ((AbstractC34647d.AbstractC34648a) C34640c.this.getModel()).mo127945c(str, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34640c.C346433.C346463 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        Intent intent = new Intent();
                        intent.putExtra("group_nickname", str);
                        ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127912a(intent);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127915a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_GroupInfoSetMyAliasFail)));
                        ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127917b();
                    }
                });
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b.AbstractC34651a
            /* renamed from: a */
            public void mo127951a(final String str) {
                Chat a = ((AbstractC34647d.AbstractC34648a) C34640c.this.getModel()).mo127939a();
                boolean z = !str.equals(a.getName());
                GroupHitPoint.f90519a.mo129220b(a, z, str.length());
                if (z) {
                    ((AbstractC34647d.AbstractC34648a) C34640c.this.getModel()).mo127944b(str, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                        /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34640c.C346433.C346452 */

                        /* renamed from: a */
                        public void onSuccess(Chat chat) {
                            Intent intent = new Intent();
                            intent.putExtra("group_name", str);
                            ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127912a(intent);
                            ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127909a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127915a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ChatGroupInfoModifyGroupDescriptionFailed)));
                            ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127917b();
                        }
                    }));
                    return;
                }
                ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127917b();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.info.edit.AbstractC34647d.AbstractC34650b.AbstractC34651a
            /* renamed from: a */
            public void mo127952a(final String str, GroupInfoEditView.DescEditStatus descEditStatus) {
                Chat a = ((AbstractC34647d.AbstractC34648a) C34640c.this.getModel()).mo127939a();
                boolean z = !str.equals(a.getDescription());
                GroupHitPoint.f90519a.mo129226c(a, z, str.length());
                if (z) {
                    ((AbstractC34647d.AbstractC34648a) C34640c.this.getModel()).mo127942a(str, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                        /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34640c.C346433.C346441 */

                        /* renamed from: a */
                        public void onSuccess(Chat chat) {
                            Intent intent = new Intent();
                            intent.putExtra("group_desc", str);
                            ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127912a(intent);
                            ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127909a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127915a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ChatGroupInfoModifyGroupDescriptionFailed)));
                            ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127917b();
                        }
                    }));
                    return;
                }
                ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127917b();
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m134600b();
    }

    /* renamed from: b */
    private void m134600b() {
        ((AbstractC34647d.AbstractC34648a) getModel()).mo127940a(new C25975i(new IGetDataCallback<C34637b.C34639a>() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.edit.C34640c.C346411 */

            /* renamed from: a */
            public void onSuccess(C34637b.C34639a aVar) {
                ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127913a(aVar.f89420a, aVar.f89421b, aVar.f89422c, aVar.f89423d);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("open group info edit failed：" + errorResult.toString());
                ((AbstractC34647d.AbstractC34650b) C34640c.this.getView()).mo127917b();
            }
        }));
    }

    public C34640c(GroupInfoEditView.AbstractC34632a aVar, Context context, String str, int i, String str2) {
        C34637b bVar = new C34637b(str, i, str2);
        GroupInfoEditView groupInfoEditView = new GroupInfoEditView(context, aVar);
        setModel(bVar);
        setView(groupInfoEditView);
        groupInfoEditView.setViewDelegate(createViewDelegate());
        bVar.mo127941a(m134601c());
    }
}
