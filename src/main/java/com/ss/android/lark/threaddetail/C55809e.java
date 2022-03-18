package com.ss.android.lark.threaddetail;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae;
import com.ss.android.lark.chat.core.model.AbstractC33959e;
import com.ss.android.lark.chat.core.model.AbstractC33961f;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35218a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threaddetail.AbstractC55766a;
import com.ss.android.lark.threaddetail.C55809e;
import com.ss.android.lark.threaddetail.ThreadDetailUIModel;
import com.ss.android.lark.threaddetail.view.ThreadDetailView;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardLauncher;
import com.ss.android.lark.threadwindow.C56146m;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.e */
public class C55809e extends BasePresenter<AbstractC55766a.AbstractC55767a, AbstractC55766a.AbstractC55769b, AbstractC55766a.AbstractC55769b.AbstractC55770a> implements C33955c.AbstractC33957b<C55905a> {

    /* renamed from: a */
    public boolean f137771a;

    /* renamed from: b */
    public long f137772b;

    /* renamed from: c */
    public boolean f137773c;

    /* renamed from: d */
    public C33955c<C55905a, MessageInfo> f137774d;

    /* renamed from: e */
    public final ThreadDetailUIModel f137775e = new ThreadDetailUIModel(new ThreadDetailUIModel.ItemModeChangeListener() {
        /* class com.ss.android.lark.threaddetail.$$Lambda$e$KBOHtaKmicojYOenKboRhJl4cw */

        @Override // com.ss.android.lark.threaddetail.ThreadDetailUIModel.ItemModeChangeListener
        public final void onUIItemModelChange(AbsMessageVO aVar) {
            C55809e.this.m216526a((C55809e) aVar);
        }
    });

    /* renamed from: f */
    public final IGetDataCallback f137776f = new IGetDataCallback<Object>() {
        /* class com.ss.android.lark.threaddetail.C55809e.C558101 */

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190160b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(Object obj) {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190160b();
        }
    };

    /* renamed from: g */
    private final AbstractC33961f<C55905a> f137777g = new AbstractC33961f<C55905a>() {
        /* class com.ss.android.lark.threaddetail.C55809e.C558112 */

        @Override // com.ss.android.lark.chat.core.model.AbstractC33961f
        /* renamed from: a */
        public List<C55905a> mo124080a(List<C55905a> list) {
            int w = ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190125w();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                C55905a aVar = list.get(i);
                if (aVar.mo190598f() == null || aVar.mo190601g() || aVar.mo190598f().getMessage().isPreMessage() || z) {
                    arrayList.add(aVar);
                } else {
                    if (aVar.mo190615p() != w) {
                        C55905a a = C55905a.m217087a(aVar, w);
                        a.mo190600g(true);
                        arrayList.add(a);
                    }
                    z = true;
                }
            }
            if (arrayList.size() > 1) {
                Log.m165379d("test_convert", "size = " + arrayList.size() + "uiItem reply count = " + ((C55905a) arrayList.get(1)).mo190615p());
            }
            return arrayList;
        }
    };

    /* renamed from: h */
    private boolean f137778h;

    /* renamed from: d */
    public void mo190371d() {
        this.f137771a = true;
    }

    /* renamed from: e */
    public void mo190372e() {
        this.f137771a = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.threaddetail.e$d */
    public class C55821d implements AbstractC55766a.AbstractC55769b.AbstractC55770a {
        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190206a(String str) {
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190195a(View view, PhotoItem photoItem, List<PhotoItem> list, boolean z, int i) {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190147a(C34353s.m133238a(list, photoItem), list, view, z, i);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190213a(String str, List<ReactionInfo> list, String str2) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190077a(str, list, str2);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190209a(String str, String str2) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190072a(str, str2);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190203a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190064a(sticker, iGetDataCallback);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190215a(String str, boolean z, IGetDataCallback<String> iGetDataCallback) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190079a(str, z, iGetDataCallback);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190196a(ErrorResult errorResult) {
            if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190171e(errorResult.getDisplayMsg());
            } else {
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(UIHelper.getString(R.string.Lark_Legacy_WithdrawFail));
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190212a(final String str, final String str2, String str3, final RichText richText) {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a()) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190060a(new UIGetDataCallback(new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass14 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190075a(str, str2, richText);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190146a();
                        Log.m165389i("ThreadDetailPresenter", "loadLastPageData onSuccess scrollContentToBottom");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190075a(str, str2, richText);
                    }
                }));
            } else {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190075a(str, str2, richText);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190210a(final String str, final String str2, final RichText richText) {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a()) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190060a(new UIGetDataCallback(new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass15 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190093b(str, str2, richText);
                        Log.m165383e("ThreadDetailPresenter", "loadLastPageData failed");
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190146a();
                        Log.m165389i("ThreadDetailPresenter", "loadLastPageData onSuccess scrollContentToBottom");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190093b(str, str2, richText);
                    }
                }));
            } else {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190093b(str, str2, richText);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190202a(final MessageInfo messageInfo) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190063a(messageInfo, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass16 */

                /* renamed from: a */
                public void onSuccess(String str) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UICallbackExecutor.executeDelayed(new RunnableC55819b((AbstractC55766a.AbstractC55767a) C55809e.this.getModel(), messageInfo), 500);
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190198a(AbsMessageVO aVar) {
            C55809e.this.f137775e.mo190402a(aVar, false);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190217a(List<MessageInfo> list) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190080a(list);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190208a(String str, RichText richText, String str2, RichText richText2, boolean z) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190071a(str, richText, str2, richText2, false);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190205a(AbstractC55766a.AbstractC55769b.AbstractC55770a.AbstractC55771a aVar) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(aVar) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$d$v3Fnm4jwLJ7sc4byxgxkCaAHRmI */
                public final /* synthetic */ AbstractC55766a.AbstractC55769b.AbstractC55770a.AbstractC55771a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C55809e.C55821d.this.m216584b((C55809e.C55821d) this.f$1);
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public void mo190228b(List<String> list) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190081a(list, new UIGetDataCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass18 */

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(UIHelper.getString(R.string.Lark_Legacy_ChatViewFavorites));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxSaveFail)));
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190220a(boolean z) {
            Chat g = ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190109g();
            if (g != null) {
                if (!((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190124v()) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190173g();
                } else if (C56146m.m218890a(g, ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190048C())) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190165c(mo190245l());
                } else if (g.getRole().getNumber() == Chat.Role.MEMBER.getNumber()) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190165c(mo190245l());
                } else if (g.isPublic() && g.getRole().getNumber() != Chat.Role.MEMBER.getNumber()) {
                    ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190100c(new UIGetDataCallback(new IGetDataCallback<Chat>() {
                        /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass20 */

                        /* renamed from: a */
                        public void onSuccess(Chat chat) {
                            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190165c(C55821d.this.mo190245l());
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            if (errorResult.getErrorCode() == 5020) {
                                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190150a(C55821d.this.mo190244k());
                            } else {
                                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190149a(errorResult);
                            }
                        }
                    }));
                }
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190214a(String str, boolean z) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190078a(str, z);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190199a(Chat chat, String str) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190073a(chat.getId(), str, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558243 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(UIHelper.getString(R.string.Lark_Legacy_RequestSentApprovalPendingToast));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(errorResult.getDisplayMsg());
                    }
                    Log.m165382e(errorResult.toString());
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190204a(final IStickerDependency.StickerFileInfo stickerFileInfo) {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a()) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190060a(new UIGetDataCallback(new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558254 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("ThreadDetailPresenter", "loadLastPageData failed");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190065a(stickerFileInfo);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190146a();
                        Log.m165389i("ThreadDetailPresenter", "loadLastPageData onSuccess scrollContentToBottom");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190065a(stickerFileInfo);
                    }
                }));
            } else {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190065a(stickerFileInfo);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190201a(Message message, boolean z, String str, String str2) {
            RichText richText;
            String str3;
            Content content = message.getContent();
            RichText richText2 = null;
            if (content instanceof PostContent) {
                PostContent postContent = (PostContent) content;
                richText = postContent.getRichText();
                str3 = postContent.getTitleWithFilter(C29990c.m110930b().mo134528a());
            } else if (content instanceof TextContent) {
                richText = null;
                richText2 = ((TextContent) content).getRichText();
                str3 = null;
            } else {
                str3 = null;
                richText = null;
            }
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190153a(richText2, str3, richText);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public void mo190229b(boolean z) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190103c(z);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190200a(final Message message, final String str, final String str2, final int i) {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a()) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190060a(new UIGetDataCallback(new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558265 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190061a(message, str, str2, i);
                        Log.m165383e("ThreadDetailPresenter", "loadLastPageData failed");
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190146a();
                        Log.m165389i("ThreadDetailPresenter", "loadLastPageData onSuccess scrollContentToBottom");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190061a(message, str, str2, i);
                    }
                }));
            } else {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190061a(message, str, str2, i);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190219a(final List<String> list, final boolean z, final String str, final String str2) {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a()) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190060a(new UIGetDataCallback(new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558298 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("ThreadDetailPresenter", "loadLastPageData failed");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190083a(list, z, str, str2);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190146a();
                        Log.m165389i("ThreadDetailPresenter", "loadLastPageData onSuccess scrollContentToBottom");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190083a(list, z, str, str2);
                    }
                }));
            } else {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190083a(list, z, str, str2);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190218a(final List<Photo> list, final String str, final String str2) {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a()) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190060a(new UIGetDataCallback(new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558309 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190082a(list, str, str2);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190146a();
                        Log.m165389i("ThreadDetailPresenter", "loadLastPageData onSuccess scrollContentToBottom");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190082a(list, str, str2);
                    }
                }));
            } else {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190082a(list, str, str2);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190216a(final ArrayList<File> arrayList) {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a()) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190060a(new UIGetDataCallback(new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass10 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190094b(arrayList);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190146a();
                        Log.m165389i("ThreadDetailPresenter", "loadLastPageData onSuccess scrollContentToBottom");
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190094b(arrayList);
                    }
                }));
            } else {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190094b(arrayList);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190207a(String str, IGetDataCallback<String> iGetDataCallback) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190069a(str, (IGetDataCallback<String>) new UIGetDataCallback(iGetDataCallback));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190211a(String str, final String str2, String str3, Message.SourceType sourceType) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190076a(str, str2, str3, sourceType, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass11 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190068a(str2, 2);
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(UIHelper.getString(R.string.Lark_Legacy_SaveToDriveFail));
                    Log.m165383e("ThreadDetailPresenter", "Failed to save to Drive");
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if ("success".equals(str)) {
                        Log.m165389i("ThreadDetailPresenter", "Save file success, messageId: " + str2);
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(UIHelper.getString(R.string.Lark_Legacy_SavedFileToDrive));
                        ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190068a(str2, 0);
                        return;
                    }
                    ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190068a(str2, 2);
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(UIHelper.getString(R.string.Lark_Legacy_SaveToDriveFail));
                    Log.m165397w("ThreadDetailPresenter", "Failed to save file to drive！result: " + str + "  messageId: " + str2);
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190194a(final Context context, String str, String str2, Message.SourceType sourceType) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190074a(str, str2, sourceType, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass13 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    C29990c.m110930b().mo134593u().mo134331a(context, str, 2);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ThreadDetailPresenter", "preview File in drive fail: " + errorResult.getMessage());
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190197a(IGetDataCallback<Long> iGetDataCallback) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190107e(iGetDataCallback);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: z */
        public void mo190259z() {
            C55809e.this.f137773c = false;
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: c */
        public void mo190230c() {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190052G();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: h */
        public String mo190241h() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190113k();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: i */
        public String mo190242i() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190098c();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: j */
        public Chatter mo190243j() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190106e();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: k */
        public Chat mo190244k() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190109g();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: l */
        public String mo190245l() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190110h();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: m */
        public ChatChatter mo190246m() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190111i();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: n */
        public ThreadTopic mo190247n() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190117o();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: o */
        public boolean mo190248o() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190105d();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: p */
        public Chatter mo190249p() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190120r();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: q */
        public String mo190250q() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190122t();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: r */
        public String mo190251r() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190123u();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: t */
        public MessageInfo mo190253t() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190126x();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: u */
        public boolean mo190254u() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190128z();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: v */
        public boolean mo190255v() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190046A();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: w */
        public boolean mo190256w() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190047B();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: x */
        public boolean mo190257x() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190049D();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: y */
        public boolean mo190258y() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190050E();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: d */
        public boolean mo190236d() {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: e */
        public void mo190237e() {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190058a((IGetDataCallback<AbstractC33964i<MessageInfo>>) new UIGetDataCallback(C55809e.this.f137776f));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: g */
        public void mo190240g() {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190090b(new UIGetDataCallback(C55809e.this.f137776f));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: s */
        public void mo190252s() {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190104d(new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558232 */

                /* renamed from: a */
                public void onSuccess(Void r1) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190175i();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(errorResult.getDisplayMsg());
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: f */
        public boolean mo190239f() {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190114l()) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190119q();
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190096b(false);
            }
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190097b();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public void mo190223b() {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190084a(true, (IGetDataCallback<Void>) new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass12 */

                /* renamed from: a */
                public void onSuccess(Void r1) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190158a(false, ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190128z(), false);
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(errorResult.getDisplayMsg());
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190190a() {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190084a(false, (IGetDataCallback<Void>) new UIGetDataCallback(new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558221 */

                /* renamed from: a */
                public void onSuccess(Void r1) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190158a(true, ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190128z(), false);
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(errorResult.getDisplayMsg());
                    }
                }
            }));
        }

        private C55821d() {
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public MessageInfo mo190221b(String str) {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190087b(str);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: d */
        public void mo190235d(String str) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190067a(str);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: e */
        public void mo190238e(String str) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190101c(str);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m216584b(AbstractC55766a.AbstractC55769b.AbstractC55770a.AbstractC55771a aVar) {
            UICallbackExecutor.execute(new Runnable(((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190121s()) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$d$0gE2YQiMrS6jeloZHQRiEELk7aA */
                public final /* synthetic */ C35218a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C55809e.C55821d.m216583a(AbstractC55766a.AbstractC55769b.AbstractC55770a.AbstractC55771a.this, this.f$1);
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: c */
        public void mo190232c(String str) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190070a(str, new UIGetDataCallback<>(new IGetDataCallback<C35221d>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass19 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(C35221d dVar) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190151a(dVar, false, false);
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public void mo190224b(int i) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190099c(i);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: c */
        public void mo190234c(List<String> list) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190095b(list, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558287 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxSaveFail)));
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(UIHelper.getString(R.string.Lark_Legacy_CombineFavoriteSuccess));
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190177k();
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190191a(int i) {
            if (!((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190086a(i)) {
                ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190089b(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m216583a(AbstractC55766a.AbstractC55769b.AbstractC55770a.AbstractC55771a aVar, C35218a aVar2) {
            aVar.mo190260a(aVar2.f90948a, aVar2.f90950c, aVar2.f90949b);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: c */
        public void mo190231c(Context context, String str) {
            MessageInfo b = ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190087b(str);
            if (b != null) {
                C29990c.m110930b().mo134520S().mo134700a(context, b.getMessage(), false);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public List<ImageSet> mo190222b(String str, boolean z) {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190088b(str, z);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: c */
        public void mo190233c(String str, String str2) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190102c(str, str2);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public void mo190225b(Context context, String str) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190057a(context, str);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190192a(final int i, final boolean z) {
            if (((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190086a(i)) {
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190148a(i, false, z);
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190176j();
                return;
            }
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190164c();
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190056a(i, new UIGetDataCallback(new IGetDataCallback<AbstractC33964i<MessageInfo>>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.AnonymousClass17 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190168d();
                }

                /* renamed from: a */
                public void onSuccess(AbstractC33964i<MessageInfo> iVar) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190168d();
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190148a(i, true, z);
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190176j();
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public void mo190226b(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190091b(str, iGetDataCallback);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public void mo190193a(Context context, String str) {
            MessageInfo b = ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190087b(str);
            if (b != null && b.getMessage().getType() == Message.Type.MERGE_FORWARD) {
                Message a = C34350p.m133211a(b);
                ThreadMergeForwardLauncher.f138288a.mo190745a(context, a.getId(), a);
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: b */
        public void mo190227b(String str, String str2) {
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190092b(str, str2);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public String mo190189a(String str, String str2, String str3) {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190055a(str, str2, str3);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public Message mo190188a(String str, String str2, String str3, String str4) {
            if (!((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190085a()) {
                return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190054a(str, str2, str3, str4);
            }
            ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190060a(new UIGetDataCallback(new IGetDataCallback<Object>() {
                /* class com.ss.android.lark.threaddetail.C55809e.C55821d.C558276 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                public void onSuccess(Object obj) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190146a();
                    Log.m165389i("ThreadDetailPresenter", "loadLastPageData onSuccess scrollContentToBottom");
                }
            }));
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190054a(str, str2, str3, str4);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a
        /* renamed from: a */
        public Message mo190187a(Message message, int i, ByteBuffer byteBuffer, boolean z, boolean z2, IGetDataCallback iGetDataCallback) {
            return ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190053a(message, i, byteBuffer, z, z2, iGetDataCallback);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.threaddetail.e$a */
    public class C55818a implements AbstractC55766a.AbstractC55767a.AbstractC55768a {
        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190136a(boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$IhN3KzY03TmnNylkAW6R3NNxPGc */

                public final void run() {
                    C55809e.C55818a.this.m216562o();
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190137a(boolean z, boolean z2, String str, int i) {
            C55809e.this.mo190366a(str, i);
            UICallbackExecutor.execute(new Runnable(z, z2) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$zibufNin5B6B_SNcBiYsXrHmYsY */
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C55809e.C55818a.this.m216548a((C55809e.C55818a) this.f$1, this.f$2);
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: k */
        private /* synthetic */ void m216558k() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190178l();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: o */
        private /* synthetic */ void m216562o() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190174h();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: p */
        private /* synthetic */ void m216563p() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190180n();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190129a() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$rtPlq73foK5iss9gqmRVBkfw86A */

                public final void run() {
                    C55809e.C55818a.this.m216560m();
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: c */
        public void mo190141c() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190183q();
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: d */
        public void mo190143d() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$nAgvVP4O7L5MLXHD09FkYCi1gjM */

                public final void run() {
                    C55809e.C55818a.this.m216557j();
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: e */
        public void mo190144e() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$cZgvtInelBpKY1AskOEyqc7f3Lo */

                public final void run() {
                    C55809e.C55818a.this.m216556i();
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: f */
        public void mo190145f() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$Xu4bzOMLCjVWgD8Y4p4LGMwq6Q0 */

                public final void run() {
                    C55809e.C55818a.this.m216559l();
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: g */
        private /* synthetic */ void m216554g() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190184r();
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190169d(UIHelper.getString(R.string.Lark_Legacy_OutOfGroup));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: h */
        private /* synthetic */ void m216555h() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190184r();
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190169d(UIHelper.getString(R.string.Lark_Chat_TopicDeletedTip));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: i */
        private /* synthetic */ void m216556i() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190184r();
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190185s();
            C55809e.this.mo190363a();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: l */
        private /* synthetic */ void m216559l() {
            Log.m165379d("ThreadDetailPresenter", "threadTopicReplyCount changed");
            if (C55809e.this.f137774d != null) {
                C55809e.this.f137774d.mo124066a();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: n */
        private /* synthetic */ void m216561n() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190169d(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: j */
        private /* synthetic */ void m216557j() {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190184r();
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(UIHelper.getString(R.string.Lark_Legacy_LaunchErrorChatWindow));
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190175i();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: m */
        private /* synthetic */ void m216560m() {
            Log.m165379d("ThreadDetailPresenter", "onUpdateThreadTopic called");
            if (C55809e.this.f137774d != null) {
                C55809e.this.f137774d.mo124066a();
            }
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190186t();
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190158a(((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190105d(), ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190128z(), false);
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190167c(((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190128z());
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: b */
        public void mo190138b() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$LK0CSoT_MJtPAiXhtfkxdbvuuYo */

                public final void run() {
                    C55809e.C55818a.this.m216558k();
                }
            });
        }

        private C55818a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m216550b(TranslateState translateState) {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190152a(translateState);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m216551b(String str) {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190161b(str);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: c */
        private /* synthetic */ void m216553c(boolean z) {
            if (!z) {
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190169d(UIHelper.getString(R.string.Lark_Legacy_HasBeenDissolved));
            } else {
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190175i();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m216552b(List list) {
            ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190162b(list);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190131a(Chat chat) {
            C55809e.this.mo190365a(chat);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$lyOyn2EXdhXqg9LJK0dh5AIZ85k */

                public final void run() {
                    C55809e.C55818a.this.m216563p();
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190132a(TranslateState translateState) {
            if (translateState != null && C55809e.this.f137771a) {
                UICallbackExecutor.execute(new Runnable(translateState) {
                    /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$X8lwvVtkZujiiUSu6mCvEXRm7M */
                    public final /* synthetic */ TranslateState f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C55809e.C55818a.this.m216550b((C55809e.C55818a) this.f$1);
                    }
                });
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190133a(String str) {
            UICallbackExecutor.execute(new Runnable(str) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$qPCVy8Sr5S1M9CFMMM4bex4dGp8 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C55809e.C55818a.this.m216551b((C55809e.C55818a) this.f$1);
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: b */
        public void mo190140b(boolean z) {
            UICallbackExecutor.execute(new Runnable(z) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$9a2ZJ_Pdcj3O8TBwaORYkTqlzm8 */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C55809e.C55818a.this.m216553c(this.f$1);
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190135a(List<MessageInfo> list) {
            UICallbackExecutor.execute(new Runnable(list) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$vmP_xnXxq_Lamn1Nk8rkT3HQQ7o */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C55809e.C55818a.this.m216552b((C55809e.C55818a) this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m216549b(Context context, boolean z) {
            C29990c.m110930b().mo134520S().mo134704a(context, z);
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190130a(Context context, boolean z) {
            UICallbackExecutor.execute(new Runnable(context, z) {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$Pr6xfmbG_D3xDaQagF2dam887w */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ boolean f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    C55809e.C55818a.m216549b(this.f$0, this.f$1);
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: c */
        public void mo190142c(String str, int i) {
            C55809e.this.mo190366a(str, i);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$hGTco6YHAwNebyDFknrO9EbSc */

                public final void run() {
                    C55809e.C55818a.this.m216554g();
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m216548a(boolean z, boolean z2) {
            if (z || z2) {
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190175i();
            } else {
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190169d(UIHelper.getString(R.string.Lark_Legacy_OutOfGroup));
            }
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: b */
        public void mo190139b(String str, int i) {
            C55809e.this.mo190366a(str, i);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$KoYd3Ebky4ONYrxbFc0Ww88eTmU */

                public final void run() {
                    C55809e.C55818a.this.m216555h();
                }
            });
        }

        @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55767a.AbstractC55768a
        /* renamed from: a */
        public void mo190134a(String str, int i) {
            C55809e.this.mo190366a(str, i);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.threaddetail.$$Lambda$e$a$a69VXxKCTHagpCWswBITeXt_r0 */

                public final void run() {
                    C55809e.C55818a.this.m216561n();
                }
            });
        }
    }

    /* renamed from: l */
    private AbstractC55766a.AbstractC55767a.AbstractC55768a m216528l() {
        return new C55818a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AbstractC55766a.AbstractC55769b.AbstractC55770a createViewDelegate() {
        return new C55821d();
    }

    /* renamed from: f */
    public boolean mo190373f() {
        return ((AbstractC55766a.AbstractC55769b) getView()).mo190172f();
    }

    /* renamed from: g */
    public void mo190374g() {
        ((AbstractC55766a.AbstractC55769b) getView()).mo190170e();
    }

    /* renamed from: h */
    public void mo190375h() {
        ((AbstractC55766a.AbstractC55769b) getView()).mo190182p();
    }

    /* renamed from: i */
    public ThreadTopic mo190376i() {
        AbstractC55766a.AbstractC55767a aVar = (AbstractC55766a.AbstractC55767a) getModel();
        if (aVar != null) {
            return aVar.mo190117o();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.threaddetail.e$b */
    public static class RunnableC55819b implements Runnable {

        /* renamed from: a */
        private final WeakReference<AbstractC55766a.AbstractC55767a> f137791a;

        /* renamed from: b */
        private final MessageInfo f137792b;

        public void run() {
            AbstractC55766a.AbstractC55767a aVar = this.f137791a.get();
            if (aVar != null) {
                this.f137792b.getMessage().setSendStatus(SendStatus.FAIL);
                aVar.mo190062a(this.f137792b);
            }
        }

        public RunnableC55819b(AbstractC55766a.AbstractC55767a aVar, MessageInfo messageInfo) {
            this.f137791a = new WeakReference<>(aVar);
            this.f137792b = messageInfo;
        }
    }

    /* renamed from: k */
    private void m216527k() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.threaddetail.C55809e.RunnableC558134 */

            public void run() {
                final List<MessageInfo> F = ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190051F();
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.threaddetail.C55809e.RunnableC558134.RunnableC558141 */

                    public void run() {
                        ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190166c(F);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo190363a() {
        ((AbstractC55766a.AbstractC55767a) getModel()).mo190059a(new UIGetDataCallback(new IGetDataCallback<AbstractC33964i<MessageInfo>>() {
            /* class com.ss.android.lark.threaddetail.C55809e.C558123 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(AbstractC33964i<MessageInfo> iVar) {
                Chat g = ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190109g();
                if (g == null) {
                    Log.m165383e("ThreadDetailPresenter", "chat == null");
                    ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190112j();
                } else {
                    C55809e.this.mo190365a(g);
                }
                C55809e.this.mo190364a(iVar);
                C55809e.this.mo190368b();
                ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190176j();
                if (g != null && g.isSuper()) {
                    Log.m165379d("ThreadDetailPresenter", "getModel().getLatestThreadFromServer()");
                    ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190108f();
                }
            }
        }), ((AbstractC55766a.AbstractC55769b) getView()).mo190181o());
    }

    /* renamed from: b */
    public void mo190368b() {
        int i;
        int p = ((AbstractC55766a.AbstractC55767a) getModel()).mo190118p();
        ((AbstractC55766a.AbstractC55769b) getView()).mo190157a(true);
        m216527k();
        if (((AbstractC55766a.AbstractC55767a) getModel()).mo190116n()) {
            if (((AbstractC55766a.AbstractC55767a) getModel()).mo190114l()) {
                i = 0;
            } else {
                i = -1;
            }
            ((AbstractC55766a.AbstractC55769b) getView()).mo190148a(i, false, false);
        } else if (p != -100) {
            this.f137772b = SystemClock.uptimeMillis() + 100;
            this.f137773c = true;
            ((AbstractC55766a.AbstractC55769b) getView()).mo190148a(p, false, true ^ ((AbstractC55766a.AbstractC55767a) getModel()).mo190116n());
        } else {
            ((AbstractC55766a.AbstractC55769b) getView()).mo190148a(((AbstractC55766a.AbstractC55767a) getModel()).mo190117o().getReadPos(), false, false);
        }
    }

    /* renamed from: j */
    public void mo190377j() {
        if (!this.f137778h) {
            FragmentActivity fragmentActivity = (FragmentActivity) ((AbstractC55766a.AbstractC55769b) getView()).mo190179m();
            MessageInfo x = ((AbstractC55766a.AbstractC55767a) getModel()).mo190126x();
            if (x != null) {
                ThreadDetailTitleViewModel fVar = (ThreadDetailTitleViewModel) aj.m5366a(fragmentActivity).mo6005a(ThreadDetailTitleViewModel.class);
                fVar.setTitle(C34349o.m133203a(fragmentActivity, x.getMessage(), false, false, true, true).toString() + " - " + C34340h.m133174a(x.getMessageSender(), ChatterNameDisplayRule.ALIAS_NAME));
                fVar.setChatId(x.getMessage().getChatId());
                this.f137778h = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.threaddetail.e$c */
    public class C55820c implements AbstractC33959e<MessageInfo, C55905a> {
        private C55820c() {
        }

        /* renamed from: a */
        public C55905a mo122490a(MessageInfo messageInfo, int i) {
            boolean z;
            ThreadTopic o = ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190117o();
            if (o.getAnonymousId() == null || TextUtils.isEmpty(o.getAnonymousId())) {
                z = false;
            } else {
                z = TextUtils.equals(o.getAnonymousId(), messageInfo.getMessage().getFromId());
            }
            return C55905a.m217086a(messageInfo, ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190127y(), ((AbstractC55766a.AbstractC55767a) C55809e.this.getModel()).mo190128z(), z);
        }
    }

    /* renamed from: a */
    public void mo190365a(final Chat chat) {
        C57865c.m224574a(new C57865c.AbstractC57873d<Boolean>() {
            /* class com.ss.android.lark.threaddetail.C55809e.C558166 */

            /* renamed from: a */
            public Boolean produce() {
                return Boolean.valueOf(C55809e.this.mo190369b(chat));
            }
        }, new C57865c.AbstractC57871b<Boolean>() {
            /* class com.ss.android.lark.threaddetail.C55809e.C558177 */

            /* renamed from: a */
            public void consume(Boolean bool) {
                if (C55809e.this.getView() != null) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190163b(bool.booleanValue());
                }
            }
        });
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33957b
    public void onChanged(final List<C55905a> list) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.threaddetail.C55809e.RunnableC558155 */

            public void run() {
                Log.m165379d("ThreadDetailPresenter", "onChanged called");
                if (C55809e.this.f137773c) {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190155a(list, (C55809e.this.f137772b + 3000) - SystemClock.uptimeMillis());
                } else {
                    ((AbstractC55766a.AbstractC55769b) C55809e.this.getView()).mo190154a(list);
                }
                C55809e.this.mo190377j();
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m216526a(AbsMessageVO aVar) {
        ((AbstractC55766a.AbstractC55767a) getModel()).mo190062a(((AbstractC55766a.AbstractC55767a) getModel()).mo190087b(aVar.mo121681a()));
    }

    /* renamed from: b */
    public boolean mo190369b(Chat chat) {
        if (!C29990c.m110930b().mo134515N().mo134402e() && chat.isCrossTenant()) {
            return chat.isHasWatermark();
        }
        return false;
    }

    /* renamed from: a */
    public void mo190364a(AbstractC33964i<MessageInfo> iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThreadDetailUIModelInterceptor(this.f137775e));
        C33955c<C55905a, MessageInfo> cVar = new C33955c<>(iVar, new C55820c(), arrayList);
        this.f137774d = cVar;
        cVar.mo124068a(this.f137777g);
        this.f137774d.mo124067a(this);
        ((AbstractC55766a.AbstractC55769b) getView()).mo190156a(this.f137774d.mo124071b(), ((AbstractC55766a.AbstractC55767a) getModel()).mo190114l(), ((AbstractC55766a.AbstractC55767a) getModel()).mo190115m());
        ((AbstractC55766a.AbstractC55769b) getView()).mo190158a(((AbstractC55766a.AbstractC55767a) getModel()).mo190105d(), ((AbstractC55766a.AbstractC55767a) getModel()).mo190128z(), false);
        ((AbstractC55766a.AbstractC55769b) getView()).mo190167c(((AbstractC55766a.AbstractC55767a) getModel()).mo190128z());
    }

    public C55809e(C55795c cVar, ThreadDetailView.AbstractC55854b bVar) {
        boolean z;
        boolean z2 = cVar.f137654m;
        if (cVar.f137655n != -1) {
            z = true;
        } else {
            z = false;
        }
        ThreadDetailView threadDetailView = new ThreadDetailView(bVar, z2, z);
        threadDetailView.setViewDelegate(createViewDelegate());
        setView(threadDetailView);
        C55796d dVar = new C55796d(C33103ae.from(bVar.mo190262a()), m216528l(), bVar.mo190262a());
        setModel(dVar);
        dVar.mo190066a(cVar);
    }

    /* renamed from: a */
    public void mo190366a(String str, int i) {
        if (i != -1) {
            C29990c.m110930b().mo134512K().mo134689a(new Channel(Channel.Type.CHAT, str), i);
        }
    }

    /* renamed from: a */
    public boolean mo190367a(int i, int i2, Intent intent) {
        return ((AbstractC55766a.AbstractC55769b) getView()).mo190159a(i, i2, intent);
    }
}
