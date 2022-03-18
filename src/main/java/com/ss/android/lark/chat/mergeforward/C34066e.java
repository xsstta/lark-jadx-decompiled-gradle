package com.ss.android.lark.chat.mergeforward;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.C33235f;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33222i;
import com.ss.android.lark.chat.chatwindow.chat.model.C33412h;
import com.ss.android.lark.chat.chatwindow.chat.model.C33413i;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.mergeforward.C34051a;
import com.ss.android.lark.chat.mergeforward.C34066e;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.mergeforward.AbstractC45274b;
import com.ss.android.lark.mergeforward.AbstractC45276d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.mergeforward.e */
public class C34066e extends AbstractC45274b<C34051a.AbstractC34052a, C34051a.AbstractC34054b, C34051a.AbstractC34054b.AbstractC34055a> implements C33235f.AbstractC33236a {

    /* renamed from: a */
    public C33955c<ChatMessageVO, MessageInfo> f88064a;

    /* renamed from: b */
    public final C33235f f88065b;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: c */
    private C34051a.AbstractC34052a.AbstractC34053a m132201c() {
        return new C34051a.AbstractC34052a.AbstractC34053a() {
            /* class com.ss.android.lark.chat.mergeforward.C34066e.C340682 */

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a.AbstractC34053a
            /* renamed from: a */
            public void mo126211a(final String str) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.chat.mergeforward.C34066e.C340682.RunnableC340691 */

                    public void run() {
                        ((C34051a.AbstractC34054b) C34066e.this.getView()).mo126185a(str);
                    }
                });
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C34051a.AbstractC34054b.AbstractC34055a createViewDelegate() {
        return new C34051a.AbstractC34054b.AbstractC34055a() {
            /* class com.ss.android.lark.chat.mergeforward.C34066e.C340703 */

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: c */
            public String mo126220c() {
                return ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126209c();
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: d */
            public String mo126221d() {
                return ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126210d();
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: a */
            public void mo126212a() {
                ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126201a(new UIGetDataCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                    /* class com.ss.android.lark.chat.mergeforward.C34066e.C340703.C340711 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C34051a.AbstractC34054b) C34066e.this.getView()).mo126187b(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxDeleteFail)));
                    }

                    /* renamed from: a */
                    public void onSuccess(List<FavoriteMessageInfo> list) {
                        ((C34051a.AbstractC34054b) C34066e.this.getView()).mo126187b(UIHelper.getString(R.string.Lark_Legacy_SaveBoxDeleteSuccess));
                        ((C34051a.AbstractC34054b) C34066e.this.getView()).mo126188c(((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126199a());
                    }
                }));
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: b */
            public void mo126218b() {
                FavoriteMessageInfo b = ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126206b();
                if (b != null) {
                    ((C34051a.AbstractC34054b) C34066e.this.getView()).mo126183a(b);
                }
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: a */
            public void mo126214a(String str) {
                C34066e.this.f88065b.mo122569d(str);
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: a */
            public void mo126217a(List<String> list) {
                ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126205a(list);
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: a */
            public void mo126216a(String str, String str2) {
                ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126204a(str, str2);
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: b */
            public void mo126219b(String str, IGetDataCallback<String> iGetDataCallback) {
                ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126203a(str, new UIGetDataCallback(iGetDataCallback));
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: a */
            public void mo126215a(String str, IGetDataCallback<MessageInfo> iGetDataCallback) {
                MessageInfo b = ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126207b(str);
                if (b != null) {
                    iGetDataCallback.onSuccess(b);
                    return;
                }
                iGetDataCallback.onError(new ErrorResult("get messageInfo fail: " + str));
            }

            @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b.AbstractC34055a
            /* renamed from: a */
            public void mo126213a(View view, PhotoItem photoItem, boolean z) {
                String str;
                if (photoItem.getMessageIdentity() != null) {
                    str = photoItem.getMessageIdentity().getMessageId();
                } else {
                    str = "";
                }
                List<PhotoItem> a = ((C34051a.AbstractC34052a) C34066e.this.getModel()).mo126200a(str, z);
                if (!CollectionUtils.isEmpty(a)) {
                    ((C34051a.AbstractC34054b) C34066e.this.getView()).mo126182a(C34353s.m133238a(a, photoItem), a, view);
                }
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m132200b();
    }

    /* renamed from: b */
    private void m132200b() {
        ((C34051a.AbstractC34052a) getModel()).mo126208b(new UIGetDataCallback(new IGetDataCallback<AbstractC33964i<MessageInfo>>() {
            /* class com.ss.android.lark.chat.mergeforward.C34066e.C340671 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m132204a(List list) {
                UICallbackExecutor.execute(new Runnable(list) {
                    /* class com.ss.android.lark.chat.mergeforward.$$Lambda$e$1$vZpixOwRrBRZiyGbeG2kxexBiRs */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C34066e.C340671.lambda$vZpixOwRrBRZiyGbeG2kxexBiRs(C34066e.C340671.this, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m132205b(List list) {
                ((C34051a.AbstractC34054b) C34066e.this.getView()).mo126186a(list);
            }

            /* renamed from: a */
            public void onSuccess(AbstractC33964i<MessageInfo> iVar) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C33412h(Integer.MAX_VALUE));
                arrayList.add(new C33413i(C34066e.this.f88065b));
                C34066e.this.f88064a = new C33955c<>(iVar, new C33222i(), arrayList);
                C34066e.this.f88064a.mo124067a(new C33955c.AbstractC33957b() {
                    /* class com.ss.android.lark.chat.mergeforward.$$Lambda$e$1$nY2o2g7CyMIy0WbPE6pF1FX3Pfs */

                    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33957b
                    public final void onChanged(List list) {
                        C34066e.C340671.lambda$nY2o2g7CyMIy0WbPE6pF1FX3Pfs(C34066e.C340671.this, list);
                    }
                });
                ((C34051a.AbstractC34054b) C34066e.this.getView()).mo126186a(C34066e.this.f88064a.mo124071b());
            }
        }));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.C33235f.AbstractC33236a
    /* renamed from: a */
    public void mo122571a(String str) {
        ((C34051a.AbstractC34052a) getModel()).mo126202a(str);
    }

    public C34066e(AbstractC45276d dVar, FragmentActivity fragmentActivity, MergeForwardContent mergeForwardContent, MergeForwardContent mergeForwardContent2, int i, String str, FavoriteMessageInfo favoriteMessageInfo) {
        MergeForwardView mergeForwardView = new MergeForwardView(dVar, fragmentActivity, i);
        C34059d dVar2 = new C34059d(mergeForwardContent, mergeForwardContent2, str, favoriteMessageInfo);
        setView(mergeForwardView);
        setModel(dVar2);
        C33235f fVar = new C33235f();
        this.f88065b = fVar;
        fVar.mo122562a(this);
        mergeForwardView.setViewDelegate(createViewDelegate());
        dVar2.mo126228a(m132201c());
    }
}
