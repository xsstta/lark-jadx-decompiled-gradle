package com.ss.android.lark.favorite.detail;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.favorite.common.base.FavoriteItemAdapter;
import com.ss.android.lark.favorite.detail.C37198e;
import com.ss.android.lark.favorite.detail.FavoriteDetailView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57308c;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FavoriteDetailView implements C37198e.AbstractC37201b {

    /* renamed from: a */
    public C37198e.AbstractC37201b.AbstractC37202a f95549a;

    /* renamed from: b */
    public final Activity f95550b;

    /* renamed from: c */
    private final AbstractC37188a f95551c;

    /* renamed from: d */
    private FavoriteItemAdapter f95552d;
    @BindView(8599)
    ViewGroup mRootView;
    @BindView(8645)
    public RecyclerView mSaveBoxContentRV;
    @BindView(9025)
    public CommonTitleBar mTitleBar;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.favorite.detail.FavoriteDetailView$a */
    public interface AbstractC37188a {
        /* renamed from: a */
        void mo136842a(FavoriteMessageInfo favoriteMessageInfo);

        /* renamed from: a */
        void mo136843a(FavoriteDetailView favoriteDetailView);

        /* renamed from: a */
        void mo136844a(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    private void m146480a() {
        m146481b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f95551c.mo136843a(this);
        m146480a();
    }

    /* renamed from: b */
    private void m146481b() {
        this.mSaveBoxContentRV.setLayoutManager(new LinearLayoutManager(this.f95550b, 1, false));
        FavoriteItemAdapter favoriteItemAdapter = new FavoriteItemAdapter(this.f95550b, this.mSaveBoxContentRV, 2);
        this.f95552d = favoriteItemAdapter;
        this.mSaveBoxContentRV.setAdapter(favoriteItemAdapter);
        this.f95552d.mo136759a(new FavoriteItemAdapter.AbstractC37114b() {
            /* class com.ss.android.lark.favorite.detail.FavoriteDetailView.C371853 */

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37114b
            /* renamed from: a */
            public void mo136768a(View view, FavoriteMessageInfo favoriteMessageInfo) {
                FavoriteDetailView.this.mo136845a(view, favoriteMessageInfo);
            }
        });
        this.f95552d.mo136763a(new FavoriteItemAdapter.AbstractC37118f() {
            /* class com.ss.android.lark.favorite.detail.FavoriteDetailView.C371864 */

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37118f
            /* renamed from: a */
            public void mo136773a(View view, FavoriteMessageInfo favoriteMessageInfo) {
                FavoriteDetailView.this.mo136851b(view, favoriteMessageInfo);
            }
        });
        this.f95552d.mo136758a(new FavoriteItemAdapter.AbstractC37113a() {
            /* class com.ss.android.lark.favorite.detail.FavoriteDetailView.C371875 */

            @Override // com.ss.android.lark.favorite.common.base.FavoriteItemAdapter.AbstractC37113a
            /* renamed from: a */
            public void mo136767a(View view, FavoriteMessageInfo favoriteMessageInfo) {
                FavoriteDetailView.this.mo136852b(favoriteMessageInfo);
            }
        });
    }

    @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37201b
    /* renamed from: a */
    public void mo136846a(FavoriteMessageInfo favoriteMessageInfo) {
        this.f95551c.mo136842a(favoriteMessageInfo);
    }

    @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37201b
    /* renamed from: b */
    public void mo136853b(String str) {
        LKUIToast.show(this.f95550b, str);
    }

    /* renamed from: a */
    public void setViewDelegate(C37198e.AbstractC37201b.AbstractC37202a aVar) {
        this.f95549a = aVar;
    }

    @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37201b
    /* renamed from: a */
    public void mo136848a(String str) {
        this.f95551c.mo136844a(str);
    }

    @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37201b
    /* renamed from: a */
    public void mo136849a(List<FavoriteMessageInfo> list) {
        this.f95552d.diff(list);
    }

    @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37201b
    /* renamed from: a */
    public void mo136850a(boolean z) {
        this.mTitleBar.setTitle(R.string.Lark_Legacy_Detail);
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setLeftImageDrawable(null);
            return;
        }
        if (z) {
            this.mTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.ud_icon_forward_outlined, R.color.ic_favorite_icon_forward_selector) {
                /* class com.ss.android.lark.favorite.detail.FavoriteDetailView.C371831 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    FavoriteDetailView.this.f95549a.mo136860a();
                }
            });
        }
        this.mTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.ud_icon_delete_trash_outlined, R.color.ic_favorite_icon_delete_selector) {
            /* class com.ss.android.lark.favorite.detail.FavoriteDetailView.C371842 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                new C25639g(FavoriteDetailView.this.f95550b).mo89248g(R.string.Lark_Legacy_SaveBoxDeleteConfirm).mo89238b(true).mo89251j(2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Remove, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.favorite.detail.$$Lambda$FavoriteDetailView$2$_jUN07DqI9O43fFh06z6G4Kl56w */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        FavoriteDetailView.C371842.lambda$_jUN07DqI9O43fFh06z6G4Kl56w(FavoriteDetailView.C371842.this, dialogInterface, i);
                    }
                }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_SaveBoxOperaCancel, (DialogInterface.OnClickListener) null).mo89239c();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m146491a(DialogInterface dialogInterface, int i) {
                FavoriteDetailView.this.f95549a.mo136861b();
            }
        });
    }

    /* renamed from: b */
    public void mo136852b(FavoriteMessageInfo favoriteMessageInfo) {
        if (favoriteMessageInfo != null) {
            Chatter sourceChatter = favoriteMessageInfo.getSourceChatter();
            Chat sourceChat = favoriteMessageInfo.getSourceChat();
            if (sourceChatter == null || sourceChat == null) {
                Log.m165383e("FavoriteDetailView", "Avatar click failed. chatter is null, entity:" + favoriteMessageInfo);
            } else if (sourceChatter.isAnonymous()) {
                Log.m165389i("FavoriteDetailView", "chatter is anonymous block avatar click");
            } else {
                C29990c.m110930b().mo134523V().mo134436a(this.f95550b, new ProfileSource.C36868a().mo136066c(sourceChatter.getId()).mo136061a(Boolean.valueOf(sourceChatter.isBot())).mo136065b(sourceChat.getId()).mo136064b(6).mo136060a(0).mo136062a(C34339g.m133170d(sourceChat)).mo136063a());
            }
        }
    }

    public FavoriteDetailView(AbstractC37188a aVar, Activity activity) {
        this.f95551c = aVar;
        this.f95550b = activity;
    }

    /* renamed from: b */
    public void mo136851b(View view, FavoriteMessageInfo favoriteMessageInfo) {
        Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        if (sourceMessage != null && !sourceMessage.isPreMessage()) {
            StickerContent stickerContent = (StickerContent) sourceMessage.getContent();
            if (stickerContent == null) {
                mo136853b(UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return;
            }
            String stickerSetId = stickerContent.getStickerSetId();
            if (!TextUtils.isEmpty(stickerSetId)) {
                C29990c.m110930b().mo134502A().mo134377a(view.getContext(), sourceMessage);
                return;
            }
            PhotoItem messageId = new PhotoItem().setImageKey(stickerContent.getKey()).setPaths(Collections.singletonList(stickerContent.getKey())).setMessageId(stickerSetId);
            C58630d.m227376b(this.f95550b, new ArrayList(Collections.singletonList(messageId)), 0, view, C29990c.m110930b().mo134586n().mo134685a("translate.other.image.viewer.enable"));
        }
    }

    /* renamed from: a */
    public void mo136845a(View view, FavoriteMessageInfo favoriteMessageInfo) {
        ImageSet imageSet;
        Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        if (sourceMessage != null && !sourceMessage.isPreMessage()) {
            if (sourceMessage.getType() == Message.Type.IMAGE) {
                imageSet = ((ImageContent) sourceMessage.getContent()).getImageSet();
            } else if (sourceMessage.getType() != Message.Type.MEDIA) {
                imageSet = null;
            } else if (favoriteMessageInfo.getSourceChat() == null) {
                Log.m165383e("FavoriteDetailView", "Media chat info load failed");
                return;
            } else {
                MediaImageSet a = C57308c.m222070a((MediaContent) sourceMessage.getContent());
                a.setMessageIdentity(new MessageIdentity(sourceMessage.getId(), favoriteMessageInfo.getSourceChat().getId(), favoriteMessageInfo.getId(), Message.SourceType.TYPE_FROM_FAVORITE));
                imageSet = a;
            }
            if (imageSet == null) {
                mo136853b(UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return;
            }
            List<PhotoItem> a2 = C58659h.m227513a(Collections.singletonList(imageSet));
            if (!CollectionUtils.isEmpty(a2)) {
                C29990c.m110930b().mo134541a(this.f95550b, a2, 0, view, null, true, false, true, false, true, C29990c.m110930b().mo134586n().mo134685a("translate.other.image.viewer.enable"), null, null, Scene.Favorite, 1);
            }
        }
    }
}
