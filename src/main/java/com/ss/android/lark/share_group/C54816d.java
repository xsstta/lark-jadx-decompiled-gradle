package com.ss.android.lark.share_group;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.utils.C34365w;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.share_group.AbstractC54803a;
import com.ss.android.lark.share_group.C54816d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.share_group.d */
public class C54816d extends BasePresenter<C54811c, RecallGroupChatterView, AbstractC54803a.AbstractC54805b.AbstractC54806a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54803a.AbstractC54805b.AbstractC54806a createViewDelegate() {
        return new AbstractC54803a.AbstractC54805b.AbstractC54806a() {
            /* class com.ss.android.lark.share_group.C54816d.C548171 */

            @Override // com.ss.android.lark.share_group.AbstractC54803a.AbstractC54805b.AbstractC54806a
            /* renamed from: a */
            public boolean mo187017a() {
                return ((C54811c) C54816d.this.getModel()).mo187023a().f135322c;
            }

            @Override // com.ss.android.lark.share_group.AbstractC54803a.AbstractC54805b.AbstractC54806a
            /* renamed from: a */
            public void mo187016a(final GroupRecallEntity groupRecallEntity) {
                ((C54811c) C54816d.this.getModel()).mo187026a(((C54811c) C54816d.this.getModel()).mo187028b(), Collections.singletonList(groupRecallEntity), new UIGetDataCallback<List<GroupRecallEntity>>() {
                    /* class com.ss.android.lark.share_group.C54816d.C548171.C548181 */

                    @Override // com.larksuite.framework.callback.UIGetDataCallback
                    public void onErrored(ErrorResult errorResult) {
                        super.onErrored(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccessed(List<GroupRecallEntity> list) {
                        if (CollectionUtils.isEmpty(list)) {
                            ((RecallGroupChatterView) C54816d.this.getView()).mo186993a(C34365w.m133274a(Collections.singletonList(groupRecallEntity), C548171.this.mo187017a()));
                            return;
                        }
                        ((C54811c) C54816d.this.getModel()).mo187025a(groupRecallEntity, ((C54811c) C54816d.this.getModel()).mo187028b(), new UIGetDataCallback<Boolean>() {
                            /* class com.ss.android.lark.share_group.C54816d.C548171.C548181.C548191 */

                            @Override // com.larksuite.framework.callback.UIGetDataCallback
                            public void onErrored(ErrorResult errorResult) {
                                ((RecallGroupChatterView) C54816d.this.getView()).mo186996a(errorResult.getDisplayMsg());
                            }

                            /* renamed from: a */
                            public void onSuccessed(Boolean bool) {
                                ((RecallGroupChatterView) C54816d.this.getView()).mo187001c(R.string.Lark_Group_RevokeSuccess);
                                ((RecallGroupChatterView) C54816d.this.getView()).mo186997a(groupRecallEntity.mo124690b(), groupRecallEntity.mo124689a());
                            }
                        });
                    }
                });
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m212640b();
    }

    /* renamed from: b */
    private void m212640b() {
        ((RecallGroupChatterView) getView()).mo186999a(true);
        ((C54811c) getModel()).mo187027a(((C54811c) getModel()).mo187030c(), ((C54811c) getModel()).mo187028b(), new UIGetDataCallback(new IGetDataCallback<List<RecallItemViewData>>() {
            /* class com.ss.android.lark.share_group.C54816d.C548202 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m212646a() {
                if (C54816d.this.getView() != null) {
                    ((RecallGroupChatterView) C54816d.this.getView()).mo186992a();
                }
            }

            /* renamed from: a */
            public void onSuccess(List<RecallItemViewData> list) {
                ((RecallGroupChatterView) C54816d.this.getView()).mo186999a(false);
                ((RecallGroupChatterView) C54816d.this.getView()).mo186998a(list);
                if (list.size() == 0) {
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.share_group.$$Lambda$d$2$afo4PK4h4zAh7rryKqSvAPfJmvA */

                        public final void run() {
                            C54816d.C548202.this.m212646a();
                        }
                    }, 500);
                    ((RecallGroupChatterView) C54816d.this.getView()).mo187000b(R.string.Lark_Group_RevokeMoreMemberNotExist);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((RecallGroupChatterView) C54816d.this.getView()).mo186999a(false);
                if (errorResult.getErrorCode() == -1) {
                    ((RecallGroupChatterView) C54816d.this.getView()).mo187000b(R.string.Lark_Group_RevokeMoreMemberNotExist);
                } else {
                    ((RecallGroupChatterView) C54816d.this.getView()).mo186996a(errorResult.getDisplayMsg());
                }
            }
        }));
    }

    public C54816d(C54811c cVar, RecallGroupChatterView recallGroupChatterView) {
        super(cVar, recallGroupChatterView);
    }
}
