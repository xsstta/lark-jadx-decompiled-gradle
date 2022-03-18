package com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.listener.ChatAlbumClickListenerImpl;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.listener.DialogMenuClickListenerImpl;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.listener.LoadMoreListenerImpl;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import com.ss.android.lark.search.impl.hitpoint.loading.SearchLoadingLog;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.vesdk.C64034n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.b */
public class C53508b extends BasePresenter<AbstractC53514c.AbstractC53515a, AbstractC53514c.AbstractC53516b, AbstractC53514c.AbstractC53516b.AbstractC53517a> {

    /* renamed from: a */
    public boolean f132198a;

    /* renamed from: b */
    private Context f132199b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC53514c.AbstractC53516b.AbstractC53517a createViewDelegate() {
        return new AbstractC53514c.AbstractC53516b.AbstractC53517a() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53508b.C535091 */

            @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b.AbstractC53517a
            /* renamed from: a */
            public void mo182681a() {
                C53508b.this.mo182676a(true);
            }

            @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b.AbstractC53517a
            /* renamed from: b */
            public boolean mo182684b() {
                return ((AbstractC53514c.AbstractC53515a) C53508b.this.getModel()).mo182664a();
            }

            @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b.AbstractC53517a
            /* renamed from: c */
            public void mo182685c() {
                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182651b();
                C53508b.this.mo182676a(false);
            }

            @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b.AbstractC53517a
            /* renamed from: a */
            public void mo182682a(View view, ImageSet imageSet) {
                C53508b.this.mo182674a(view, imageSet);
            }

            @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b.AbstractC53517a
            /* renamed from: a */
            public void mo182683a(final String str, String str2, final boolean z) {
                ((AbstractC53514c.AbstractC53515a) C53508b.this.getModel()).mo182662a(str2, new IGetDataCallback<Message>() {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53508b.C535091.C535101 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Message message) {
                        if (message != null) {
                            if (z) {
                                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182648a(message.getThreadId(), message.getThreadPosition());
                            } else {
                                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182652b(str, message.getPosition());
                            }
                        }
                    }
                });
            }
        };
    }

    /* renamed from: e */
    private void m207224e() {
        ((AbstractC53514c.AbstractC53515a) getModel()).mo182666b(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53508b.C535112 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                SearchHitPoint.f131886a.mo182022b(str);
                SearchHitPoint.f131886a.mo182018a(str, "image", C64034n.f161683a, "open_image");
            }
        });
    }

    /* renamed from: b */
    public ArrayList<String> mo182677b() {
        return ((AbstractC53514c.AbstractC53516b) getView()).mo182655d();
    }

    /* renamed from: c */
    public void mo182679c() {
        ((AbstractC53514c.AbstractC53516b) getView()).mo182656e();
    }

    /* renamed from: d */
    public List<ChatInsideSearchImageViewData> mo182680d() {
        return ((AbstractC53514c.AbstractC53516b) getView()).mo182657f();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC53514c.AbstractC53516b) getView()).mo182651b();
        mo182676a(false);
    }

    /* renamed from: a */
    public void mo182675a(List<String> list) {
        ((AbstractC53514c.AbstractC53515a) getModel()).mo182663a(list, new IGetDataCallback<List<ChatInsideSearchImageViewData>>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53508b.C535134 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<ChatInsideSearchImageViewData> list) {
                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182656e();
                for (ChatInsideSearchImageViewData chatInsideSearchImageViewData : list) {
                    chatInsideSearchImageViewData.setIsSelectStatus(C53508b.this.f132198a);
                }
                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182649a(list, false);
            }
        });
    }

    /* renamed from: a */
    public void mo182676a(final boolean z) {
        ((AbstractC53514c.AbstractC53515a) getModel()).mo182660a(new IGetDataCallback<List<ChatInsideSearchImageViewData>>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.C53508b.C535123 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182654c();
                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182650a(z);
            }

            /* renamed from: a */
            public void onSuccess(List<ChatInsideSearchImageViewData> list) {
                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182654c();
                for (ChatInsideSearchImageViewData chatInsideSearchImageViewData : list) {
                    chatInsideSearchImageViewData.setIsSelectStatus(C53508b.this.f132198a);
                }
                ((AbstractC53514c.AbstractC53516b) C53508b.this.getView()).mo182649a(list, z);
                if (z) {
                    SearchLoadingLog.f131887a.mo182026a();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo182678b(boolean z) {
        this.f132198a = z;
        ((AbstractC53514c.AbstractC53516b) getView()).mo182653b(z);
    }

    /* renamed from: a */
    public void mo182674a(View view, ImageSet imageSet) {
        int i;
        String str;
        m207224e();
        List<PhotoItem> a = C58659h.m227513a(Collections.singletonList(imageSet));
        if (!CollectionUtils.isEmpty(a)) {
            if (imageSet.getMessageIdentity() != null) {
                str = imageSet.getMessageIdentity().getThreadId();
                i = imageSet.getMessageIdentity().getThreadPosition();
            } else {
                str = "";
                i = 0;
            }
            List<PhotoItem> a2 = C58659h.m227513a(((AbstractC53514c.AbstractC53515a) getModel()).mo182665b());
            int a3 = C58659h.m227508a(a2, a.get(0));
            LoadMoreListenerImpl loadMoreListenerImpl = new LoadMoreListenerImpl(((AbstractC53514c.AbstractC53515a) getModel()).mo182667c());
            DialogMenuClickListenerImpl dialogMenuClickListenerImpl = new DialogMenuClickListenerImpl(((AbstractC53514c.AbstractC53515a) getModel()).mo182667c(), ((AbstractC53514c.AbstractC53515a) getModel()).mo182668d(), str, i);
            if (((AbstractC53514c.AbstractC53515a) getModel()).mo182668d()) {
                C58630d.m227372a(this.f132199b, a2, a3, view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, true, true, false, true, false, false, dialogMenuClickListenerImpl, loadMoreListenerImpl, UIHelper.getString(R.string.Lark_Chat_TopicImageJumpToTopic), null, Biz.Messenger, Scene.Thread, 10);
            } else if (((AbstractC53514c.AbstractC53516b) getView()).mo182658g()) {
                C58630d.m227372a(this.f132199b, a2, a3, view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, true, true, false, true, false, false, dialogMenuClickListenerImpl, loadMoreListenerImpl, "", new ChatAlbumClickListenerImpl(((AbstractC53514c.AbstractC53515a) getModel()).mo182667c(), ((AbstractC53514c.AbstractC53515a) getModel()).mo182668d()), Biz.Messenger, Scene.Chat, 11);
            } else {
                C58630d.m227372a(this.f132199b, a2, a3, view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, true, true, false, true, false, false, dialogMenuClickListenerImpl, loadMoreListenerImpl, "", null, Biz.Messenger, Scene.Chat, 10);
            }
        }
    }

    public C53508b(Context context, ChatInsideSearchImageView.AbstractC53501a aVar, String str, boolean z, boolean z2, boolean z3, ChatInsideSearchImageAdapter.AbstractC53490b bVar) {
        ChatInsideSearchImageView chatInsideSearchImageView = new ChatInsideSearchImageView(context, aVar, bVar, z3);
        setModel(new C53502a(context, str, z, z2, z3));
        setView(chatInsideSearchImageView);
        chatInsideSearchImageView.setViewDelegate(createViewDelegate());
        this.f132199b = context;
    }
}
