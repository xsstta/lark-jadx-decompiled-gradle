package com.ss.android.lark.album.image;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.album.image.AbstractC28689e;
import com.ss.android.lark.album.image.ChatImageAdapter;
import com.ss.android.lark.album.image.ChatImageView;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chatwindow.view.photo_preview.ChatAlbumClickListenerImpl;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.chatwindow.view.photo_preview.LoadMoreListenerImpl;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.album.image.c */
public class C28678c extends BasePresenter<AbstractC28689e.AbstractC28690a, AbstractC28689e.AbstractC28691b, AbstractC28689e.AbstractC28691b.AbstractC28692a> {

    /* renamed from: a */
    public boolean f72161a;

    /* renamed from: b */
    private Context f72162b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC28689e.AbstractC28691b.AbstractC28692a createViewDelegate() {
        return new AbstractC28689e.AbstractC28691b.AbstractC28692a() {
            /* class com.ss.android.lark.album.image.C28678c.C286791 */

            @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b.AbstractC28692a
            /* renamed from: a */
            public void mo102036a() {
                C28678c.this.mo102031a(true);
            }

            @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b.AbstractC28692a
            /* renamed from: b */
            public boolean mo102038b() {
                return ((AbstractC28689e.AbstractC28690a) C28678c.this.getModel()).mo102022a();
            }

            @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b.AbstractC28692a
            /* renamed from: c */
            public void mo102039c() {
                ((AbstractC28689e.AbstractC28691b) C28678c.this.getView()).mo101978b();
                C28678c.this.mo102031a(false);
            }

            @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b.AbstractC28692a
            /* renamed from: a */
            public void mo102037a(View view, ImageSet imageSet) {
                C28678c.this.mo102029a(view, imageSet);
            }
        };
    }

    /* renamed from: b */
    public ArrayList<String> mo102032b() {
        return ((AbstractC28689e.AbstractC28691b) getView()).mo101981d();
    }

    /* renamed from: c */
    public void mo102034c() {
        ((AbstractC28689e.AbstractC28691b) getView()).mo101982e();
    }

    /* renamed from: d */
    public List<ChatImageViewData> mo102035d() {
        return ((AbstractC28689e.AbstractC28691b) getView()).mo101983f();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC28689e.AbstractC28691b) getView()).mo101978b();
        mo102031a(false);
    }

    /* renamed from: a */
    public void mo102030a(List<String> list) {
        ((AbstractC28689e.AbstractC28690a) getModel()).mo102021a(list, new IGetDataCallback<List<ChatImageViewData>>() {
            /* class com.ss.android.lark.album.image.C28678c.C286813 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<ChatImageViewData> list) {
                ((AbstractC28689e.AbstractC28691b) C28678c.this.getView()).mo101982e();
                for (ChatImageViewData chatImageViewData : list) {
                    chatImageViewData.setIsSelectStatus(C28678c.this.f72161a);
                }
                ((AbstractC28689e.AbstractC28691b) C28678c.this.getView()).mo101976a(list, false);
            }
        });
    }

    /* renamed from: a */
    public void mo102031a(final boolean z) {
        ((AbstractC28689e.AbstractC28690a) getModel()).mo102019a(new IGetDataCallback<List<ChatImageViewData>>() {
            /* class com.ss.android.lark.album.image.C28678c.C286802 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC28689e.AbstractC28691b) C28678c.this.getView()).mo101980c();
                ((AbstractC28689e.AbstractC28691b) C28678c.this.getView()).mo101977a(z);
            }

            /* renamed from: a */
            public void onSuccess(List<ChatImageViewData> list) {
                ((AbstractC28689e.AbstractC28691b) C28678c.this.getView()).mo101980c();
                for (ChatImageViewData chatImageViewData : list) {
                    chatImageViewData.setIsSelectStatus(C28678c.this.f72161a);
                }
                ((AbstractC28689e.AbstractC28691b) C28678c.this.getView()).mo101976a(list, z);
            }
        });
    }

    /* renamed from: b */
    public void mo102033b(boolean z) {
        this.f72161a = z;
        ((AbstractC28689e.AbstractC28691b) getView()).mo101979b(z);
    }

    /* renamed from: a */
    public void mo102029a(View view, ImageSet imageSet) {
        List<PhotoItem> a = C58659h.m227513a(Collections.singletonList(imageSet));
        if (!CollectionUtils.isEmpty(a)) {
            if (imageSet.getMessageIdentity() != null) {
                imageSet.getMessageIdentity().getThreadId();
                imageSet.getMessageIdentity().getThreadPosition();
            }
            List<PhotoItem> a2 = C58659h.m227513a(((AbstractC28689e.AbstractC28690a) getModel()).mo102023b());
            int a3 = C58659h.m227508a(a2, a.get(0));
            LoadMoreListenerImpl loadMoreListenerImpl = new LoadMoreListenerImpl(((AbstractC28689e.AbstractC28690a) getModel()).mo102024c());
            DialogMenuClickListenerImpl dialogMenuClickListenerImpl = new DialogMenuClickListenerImpl(((AbstractC28689e.AbstractC28690a) getModel()).mo102024c());
            if (((AbstractC28689e.AbstractC28690a) getModel()).mo102025d()) {
                C58630d.m227369a(this.f72162b, a2, a3, view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, false, false, (OnDialogMenuClickListener) dialogMenuClickListenerImpl, (OnLoadMoreListener) loadMoreListenerImpl, UIHelper.getString(R.string.Lark_Legacy_ImageDownloadFailedRetry));
                return;
            }
            C58630d.m227372a(this.f72162b, a2, a3, view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, true, true, false, true, false, false, dialogMenuClickListenerImpl, loadMoreListenerImpl, "", new ChatAlbumClickListenerImpl(((AbstractC28689e.AbstractC28690a) getModel()).mo102024c(), ((AbstractC28689e.AbstractC28690a) getModel()).mo102025d()), Biz.Messenger, Scene.Chat, 11);
        }
    }

    public C28678c(Context context, ChatImageView.AbstractC28671a aVar, String str, boolean z, ChatImageAdapter.AbstractC28662b bVar) {
        ChatImageView chatImageView = new ChatImageView(context, aVar, bVar);
        setModel(new C28674b(context, str, z));
        setView(chatImageView);
        chatImageView.setViewDelegate(createViewDelegate());
        this.f72162b = context;
    }
}
