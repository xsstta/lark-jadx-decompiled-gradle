package com.ss.android.lark.favorite.list;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.favorite.common.base.FavoriteItemAdapter;
import com.ss.android.lark.favorite.list.C37225d;
import com.ss.android.lark.p2851u.p2852a.C57308c;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.util.C59252a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FavoriteListView implements C37225d.AbstractC37228b {

    /* renamed from: a */
    public C37225d.AbstractC37228b.AbstractC37229a f95586a;

    /* renamed from: b */
    public FavoriteItemAdapter f95587b;

    /* renamed from: c */
    private AbstractC37216a f95588c;

    /* renamed from: d */
    private Activity f95589d;
    ViewStub mDesktopTitleStub;
    View mEmptyView;
    LKUIPtrClassicFrameLayout mPtrFrame;
    public RelativeLayout mRootView;
    CommonRecyclerView mSaveItemsRv;
    public LinearLayout mSaveMessagWrapper;
    public CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.favorite.list.FavoriteListView$a */
    public interface AbstractC37216a {
        /* renamed from: a */
        void mo136896a(FavoriteMessageInfo favoriteMessageInfo);

        /* renamed from: a */
        void mo136897a(MergeForwardContent mergeForwardContent, FavoriteMessageInfo favoriteMessageInfo);

        /* renamed from: a */
        void mo136898a(FavoriteListView favoriteListView);

        /* renamed from: b */
        void mo136899b(FavoriteMessageInfo favoriteMessageInfo);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b
    /* renamed from: b */
    public void mo136892b() {
        this.mPtrFrame.refreshComplete();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f95588c.mo136898a(this);
        m146545c();
    }

    /* renamed from: c */
    private void m146545c() {
        this.mEmptyView.setVisibility(8);
        this.mSaveMessagWrapper.setVisibility(0);
        m146546d();
        m146547e();
        m146548f();
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b
    /* renamed from: a */
    public void mo136886a() {
        this.mEmptyView.setVisibility(0);
        this.mSaveMessagWrapper.setVisibility(8);
        C57582a.m223615c(this.mEmptyView);
    }

    /* renamed from: d */
    private void m146546d() {
        if (DesktopUtil.m144301a((Context) this.f95589d)) {
            this.mTitleBar.setVisibility(8);
            try {
                ViewStub viewStub = this.mDesktopTitleStub;
                if (viewStub != null) {
                    viewStub.inflate();
                }
            } catch (Exception unused) {
                this.mDesktopTitleStub.setVisibility(0);
            }
        } else {
            this.mTitleBar.setVisibility(0);
        }
        this.mRootView.getLayoutParams().width = -1;
    }

    /* renamed from: e */
    private void m146547e() {
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setForceBackWhenComplete(true);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.favorite.list.FavoriteListView.C372091 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
            public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                FavoriteListView.this.f95586a.mo136910b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!FavoriteListView.this.f95586a.mo136909a() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                }
                return true;
            }
        });
        C59252a.m230151a(this.f95589d, this.mPtrFrame, this.mSaveItemsRv, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.favorite.list.FavoriteListView.C372102 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return FavoriteListView.this.f95587b.getItemCount() - 10;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                if (FavoriteListView.this.f95586a == null || !FavoriteListView.this.f95586a.mo136909a()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: g */
    private void m146549g() {
        this.f95587b.mo136760a(new FavoriteItemAdapter.AbstractC37115c() {
            /* class com.ss.android.lark.favorite.list.FavoriteListView.C372113 */

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37115c
            /* renamed from: a */
            public void mo136769a(View view, FavoriteMessageInfo favoriteMessageInfo) {
                FavoriteListView.this.f95586a.mo136912c(favoriteMessageInfo);
            }
        });
        this.f95587b.mo136762a(new FavoriteItemAdapter.AbstractC37117e() {
            /* class com.ss.android.lark.favorite.list.FavoriteListView.C372124 */

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37117e
            /* renamed from: a */
            public boolean mo136772a(View view, FavoriteMessageInfo favoriteMessageInfo) {
                if (favoriteMessageInfo == null) {
                    return false;
                }
                FavoriteListView.this.mo136894b(favoriteMessageInfo);
                return true;
            }
        });
        this.f95587b.mo136759a(new FavoriteItemAdapter.AbstractC37114b() {
            /* class com.ss.android.lark.favorite.list.FavoriteListView.C372135 */

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37114b
            /* renamed from: a */
            public void mo136768a(View view, FavoriteMessageInfo favoriteMessageInfo) {
                FavoriteListView.this.mo136887a(view, favoriteMessageInfo);
            }
        });
        this.f95587b.mo136763a(new FavoriteItemAdapter.AbstractC37118f() {
            /* class com.ss.android.lark.favorite.list.FavoriteListView.C372146 */

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37118f
            /* renamed from: a */
            public void mo136773a(View view, FavoriteMessageInfo favoriteMessageInfo) {
                FavoriteListView.this.mo136893b(view, favoriteMessageInfo);
            }
        });
        this.f95587b.mo136761a(new FavoriteItemAdapter.AbstractC37116d() {
            /* class com.ss.android.lark.favorite.list.FavoriteListView.C372157 */

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37116d
            /* renamed from: a */
            public void mo136770a(View view, FavoriteMessageInfo favoriteMessageInfo) {
                FavoriteListView.this.f95586a.mo136908a(favoriteMessageInfo);
            }

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37116d
            /* renamed from: b */
            public void mo136771b(View view, FavoriteMessageInfo favoriteMessageInfo) {
                FavoriteListView.this.mo136888a(favoriteMessageInfo);
            }
        });
    }

    /* renamed from: f */
    private void m146548f() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f95589d, 1, false);
        if (DesktopUtil.m144307b()) {
            this.mSaveItemsRv.setPadding(UIHelper.dp2px(88.0f), 0, UIHelper.dp2px(88.0f), 0);
        }
        this.mSaveItemsRv.setLayoutManager(linearLayoutManager);
        this.f95587b = new FavoriteItemAdapter(this.f95589d, this.mSaveItemsRv, 1);
        this.mSaveItemsRv.setItemAnimator(null);
        m146549g();
        this.mSaveItemsRv.setAdapter(this.f95587b);
        HashMap hashMap = new HashMap();
        hashMap.put("biz", Integer.valueOf(Biz.Messenger.getValue()));
        hashMap.put("scene", Integer.valueOf(Scene.Favorite.getValue()));
        this.mSaveItemsRv.mo200036a(hashMap);
    }

    /* renamed from: a */
    public void setViewDelegate(C37225d.AbstractC37228b.AbstractC37229a aVar) {
        this.f95586a = aVar;
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b
    /* renamed from: a */
    public void mo136890a(String str) {
        LKUIToast.show(this.f95589d, str);
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b
    /* renamed from: b */
    public void mo136895b(List<FavoriteMessageInfo> list) {
        if (list != null) {
            this.f95587b.resetAll(list);
        }
    }

    /* renamed from: a */
    public void mo136888a(FavoriteMessageInfo favoriteMessageInfo) {
        new C25639g(this.f95589d).mo89248g(R.string.Lark_Legacy_SaveBoxDeleteConfirm).mo89238b(true).mo89251j(2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Remove, new DialogInterface.OnClickListener(favoriteMessageInfo) {
            /* class com.ss.android.lark.favorite.list.$$Lambda$FavoriteListView$kGdrgqzBGKtNNMv6e9PnJEIu1rw */
            public final /* synthetic */ FavoriteMessageInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                FavoriteListView.lambda$kGdrgqzBGKtNNMv6e9PnJEIu1rw(FavoriteListView.this, this.f$1, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, (DialogInterface.OnClickListener) null).mo89239c();
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b
    /* renamed from: a */
    public void mo136891a(List<FavoriteMessageInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.mEmptyView.setVisibility(8);
            this.mSaveMessagWrapper.setVisibility(0);
            this.f95587b.diff(list);
            return;
        }
        mo136886a();
    }

    /* renamed from: b */
    public void mo136894b(FavoriteMessageInfo favoriteMessageInfo) {
        ((C25644o) ((C25644o) new C25644o(this.f95589d).mo89206a(this.f95589d.getString(R.string.Lark_Legacy_Forward), this.f95589d.getString(R.string.Lark_Legacy_Remove), this.f95589d.getString(R.string.Lark_Legacy_SaveBoxOperaCancel))).mo89202a(new DialogInterface.OnClickListener(favoriteMessageInfo) {
            /* class com.ss.android.lark.favorite.list.$$Lambda$FavoriteListView$OJ4loQDwTu8yqqmz7g7np2p_c */
            public final /* synthetic */ FavoriteMessageInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                FavoriteListView.m270534lambda$OJ4loQDwTu8yqqmz7g7np2p_c(FavoriteListView.this, this.f$1, dialogInterface, i);
            }
        })).mo89239c();
    }

    public FavoriteListView(Activity activity, AbstractC37216a aVar) {
        this.f95588c = aVar;
        this.f95589d = activity;
    }

    /* renamed from: b */
    public void mo136893b(View view, FavoriteMessageInfo favoriteMessageInfo) {
        Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        if (sourceMessage != null && !sourceMessage.isPreMessage()) {
            StickerContent stickerContent = (StickerContent) sourceMessage.getContent();
            if (stickerContent == null) {
                mo136890a(UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
            } else if (!TextUtils.isEmpty(stickerContent.getStickerSetId())) {
                C29990c.m110930b().mo134502A().mo134377a(view.getContext(), sourceMessage);
            } else {
                PhotoItem paths = new PhotoItem().setImageKey(stickerContent.getKey()).setPaths(new ArrayList(Collections.singletonList(stickerContent.getKey())));
                C58630d.m227376b(this.f95589d, new ArrayList(Collections.singletonList(paths)), 0, view, C29990c.m110930b().mo134586n().mo134685a("translate.other.image.viewer.enable"));
            }
        }
    }

    /* renamed from: a */
    public void mo136887a(View view, FavoriteMessageInfo favoriteMessageInfo) {
        ImageSet imageSet;
        String str;
        Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        if (sourceMessage != null && !sourceMessage.isPreMessage()) {
            if (sourceMessage.getType() == Message.Type.IMAGE) {
                imageSet = ((ImageContent) sourceMessage.getContent()).getImageSet();
            } else if (sourceMessage.getType() == Message.Type.MEDIA) {
                MediaImageSet a = C57308c.m222070a((MediaContent) sourceMessage.getContent());
                a.setMessageIdentity(new MessageIdentity(sourceMessage.getId(), sourceMessage.getChatId(), favoriteMessageInfo.getId(), Message.SourceType.TYPE_FROM_FAVORITE));
                imageSet = a;
            } else {
                imageSet = null;
            }
            if (imageSet == null) {
                mo136890a(UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return;
            }
            List<PhotoItem> a2 = C58659h.m227513a(Collections.singletonList(imageSet));
            if (!CollectionUtils.isEmpty(a2)) {
                Chat sourceChat = favoriteMessageInfo.getSourceChat();
                boolean a3 = C29990c.m110930b().mo134586n().mo134685a("translate.other.image.viewer.enable");
                AbstractC36474h b = C29990c.m110930b();
                Activity activity = this.f95589d;
                if (sourceChat != null) {
                    str = sourceChat.getId();
                } else {
                    str = "";
                }
                b.mo134541a(activity, a2, 0, view, null, true, false, true, false, true, a3, new DialogMenuClickListenerImpl(str), null, Scene.Favorite, 4);
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m146544b(FavoriteMessageInfo favoriteMessageInfo, DialogInterface dialogInterface, int i) {
        this.f95586a.mo136911b(favoriteMessageInfo);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m146543a(FavoriteMessageInfo favoriteMessageInfo, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.f95586a.mo136908a(favoriteMessageInfo);
        } else if (i == 1) {
            mo136888a(favoriteMessageInfo);
        }
    }
}
