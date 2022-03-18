package com.ss.android.lark.chatthread;

import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatthread.AbstractC35135g;
import com.ss.android.lark.chatthread.C35124e;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.richtext.RichText;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.ss.android.lark.chatthread.e */
public class C35124e extends BasePresenter<AbstractC35135g.AbstractC35136a, AbstractC35135g.AbstractC35138b, AbstractC35135g.AbstractC35138b.AbstractC35139a> {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatthread.e$b */
    public class C35128b implements AbstractC35135g.AbstractC35138b.AbstractC35139a {
        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: h */
        public void mo129550h(String str) {
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129526a(String str) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129460g(str);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129532a(String str, String str2, RichText richText) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129435a(str, str2, richText);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129529a(String str, RichText richText) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129431a(str, richText);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129537a(List<String> list, boolean z, String str, String str2) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129441a(list, z, str, str2);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129536a(List<Photo> list, String str, String str2) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129440a(list, str, str2);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129525a(IStickerDependency.StickerFileInfo stickerFileInfo) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129425a(stickerFileInfo);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129535a(List<String> list) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129439a(list, new UIGetDataCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.chatthread.C35124e.C35128b.C351291 */

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(UIHelper.getString(R.string.Lark_Legacy_ChatViewFavorites));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxSaveFail)));
                }
            }));
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129527a(String str, int i, int i2) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129446b(str, i);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129524a(MessageInfo messageInfo) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129422a(messageInfo);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129528a(String str, IGetDataCallback<String> iGetDataCallback) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129452c(str, new UIGetDataCallback(iGetDataCallback));
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129533a(String str, final String str2, String str3, Message.SourceType sourceType) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129436a(str, str2, str3, sourceType, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chatthread.C35124e.C35128b.C351302 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129427a(str2, 2);
                    ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(UIHelper.getString(R.string.Lark_Legacy_SaveToDriveFail));
                    Log.m165383e("ThreadPresenter", "Failed to save ti Drive");
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if ("success".equals(str)) {
                        Log.m165389i("ThreadPresenter", "File save succeed，messageId: " + str2);
                        ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(UIHelper.getString(R.string.Lark_Legacy_SavedFileToDrive));
                        ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129427a(str2, 0);
                        return;
                    }
                    ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129427a(str2, 2);
                    ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(UIHelper.getString(R.string.Lark_Legacy_SaveToDriveFail));
                    Log.m165397w("ThreadPresenter", "File save failed！result: " + str + "  messageId: " + str2);
                }
            }));
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: a */
        public void mo129531a(String str, String str2) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129433a(str, str2);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129530a(String str, RichText richText, String str2, RichText richText2) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129432a(str, richText, str2, richText2);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129534a(String str, boolean z) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129437a(str, z);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: a */
        public Chatter mo129515a() {
            return ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129449c();
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: b */
        public OpenApp mo129538b() {
            return ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129453d();
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: c */
        public List<MessageInfo> mo129542c() {
            return ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129417a();
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: d */
        public Chatter mo129544d() {
            return ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129455e();
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: e */
        public Chat mo129546e() {
            return ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129442b();
        }

        private C35128b() {
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: g */
        public void mo129549g(String str) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129454d(str);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: b */
        public void mo129539b(String str) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129451c(str);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: c */
        public void mo129543c(String str) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129456e(str);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: d */
        public void mo129545d(String str) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129458f(str);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: e */
        public MessageInfo mo129547e(String str) {
            return ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129443b(str);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: f */
        public void mo129548f(String str) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129448b(str, new UIGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.chatthread.C35124e.C35128b.C351324 */

                /* renamed from: a */
                public void onSuccessed(Boolean bool) {
                    super.onSuccessed(bool);
                    ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(UIHelper.getString(R.string.Lark_Legacy_AddStickerSuccess));
                }

                @Override // com.larksuite.framework.callback.UIGetDataCallback
                public void onErrored(ErrorResult errorResult) {
                    super.onErrored(errorResult);
                    ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(UIHelper.getString(R.string.Lark_Legacy_AddStickerFail));
                }
            });
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: b */
        public void mo129541b(List<ChatMessageVO> list) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129438a(list);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: b */
        public void mo129540b(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129428a(str, iGetDataCallback);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129518a(Context context, String str) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129418a(context, str);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: a */
        public void mo129520a(View view, PhotoItem photoItem, List<PhotoItem> list, boolean z) {
            C35124e.this.mo129499a(view, photoItem, list, z);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public Message mo129517a(String str, String str2, String str3, String str4) {
            return ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129416a(str, str2, str3, str4);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129519a(final Context context, String str, String str2, Message.SourceType sourceType) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129434a(str, str2, sourceType, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chatthread.C35124e.C35128b.C351313 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    C29990c.m110930b().mo134593u().mo134331a(context, str, 2);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ThreadPresenter", "preview File in drive fail: " + errorResult.getMessage());
                }
            }));
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b.AbstractC35139a
        /* renamed from: a */
        public void mo129521a(ChatMessageVO<?> cVar, boolean z, String str, String str2) {
            RichText richText;
            String str3;
            Content z2 = cVar.mo121699g().mo126168z();
            RichText richText2 = null;
            if (z2 instanceof PostContent) {
                PostContent postContent = (PostContent) z2;
                richText = postContent.getRichText();
                str3 = postContent.getTitleWithFilter(C29990c.m110930b().mo134528a());
            } else if (z2 instanceof TextContent) {
                richText = null;
                richText2 = ((TextContent) z2).getRichText();
                str3 = null;
            } else {
                str3 = null;
                richText = null;
            }
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129563a(richText2, str3, richText);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129522a(Message message, String str, String str2, int i) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129420a(message, str, str2, i);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public void mo129523a(Message message, String str, String str2, String str3, int i) {
            ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129421a(message, str, str2, str3, i);
        }

        @Override // com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a
        /* renamed from: a */
        public Message mo129516a(Message message, int i, ByteBuffer byteBuffer, boolean z, boolean z2, IGetDataCallback iGetDataCallback) {
            return ((AbstractC35135g.AbstractC35136a) C35124e.this.getModel()).mo129415a(message, i, byteBuffer, z, z2, iGetDataCallback);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatthread.e$a */
    public class C35127a implements AbstractC35135g.AbstractC35136a.AbstractC35137a {
        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: a */
        public void mo129510a(boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$P8M3GLLhQdkrqvef8fqeBj_rfI0 */

                public final void run() {
                    C35124e.C35127a.this.m137133j();
                }
            });
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: a */
        public void mo129509a(List<ChatMessageVO> list) {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129565a(list);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m137129f() {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129571j();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m137130g() {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129570i();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m137132i() {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129569h();
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m137133j() {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129568g();
        }

        @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b.AbstractC35116a
        /* renamed from: a */
        public Context mo129488a() {
            return ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129558a();
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: c */
        public void mo129512c() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$Ss7DgywWeCx7vfcUyvjbuyRRo18 */

                public final void run() {
                    C35124e.C35127a.this.m137131h();
                }
            });
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: d */
        public void mo129513d() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$YhxVj10Jgru8Ffqq0cebPmbChM */

                public final void run() {
                    C35124e.C35127a.this.m137130g();
                }
            });
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: e */
        public void mo129514e() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$t_R4qzceiHvt0tnrcmLFuPImkU */

                public final void run() {
                    C35124e.C35127a.this.m137129f();
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m137131h() {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(UIHelper.getString(R.string.Lark_Legacy_VideoDeleted));
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: b */
        public void mo129511b() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$UEz_99Rr0aQLZC02ARgIqmx0rXs */

                public final void run() {
                    C35124e.C35127a.this.m137132i();
                }
            });
        }

        private C35127a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m137124b(int i) {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129566c(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m137125b(Chat chat) {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129560a(chat);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: a */
        public void mo129505a(int i) {
            UICallbackExecutor.execute(new Runnable(i) {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$14xZTN3ztJNtyRgielnOd6VS8 */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C35124e.C35127a.this.m137124b((C35124e.C35127a) this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m137126b(TranslateState translateState) {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129562a(translateState);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: a */
        public void mo129506a(Chat chat) {
            UICallbackExecutor.execute(new Runnable(chat) {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$KS4_heuKpLx6KVp5FRQMi2pg26Q */
                public final /* synthetic */ Chat f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C35124e.C35127a.this.m137125b((C35124e.C35127a) this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m137127b(String str) {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129593q(str);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: a */
        public void mo129507a(TranslateState translateState) {
            if (translateState != null) {
                UICallbackExecutor.execute(new Runnable(translateState) {
                    /* class com.ss.android.lark.chatthread.$$Lambda$e$a$vXos0BBfeF2Hml1h4S7F7cR2yX8 */
                    public final /* synthetic */ TranslateState f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C35124e.C35127a.this.m137126b((C35124e.C35127a) this.f$1);
                    }
                });
            }
        }

        @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b.AbstractC35116a
        /* renamed from: a */
        public void mo129489a(String str) {
            UICallbackExecutor.execute(new Runnable(str) {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$P78j548E6WYccWEUFpgP9Yhk4Q */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C35124e.C35127a.this.m137127b((C35124e.C35127a) this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m137128b(String str, UserRelationResponse userRelationResponse) {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129564a(str, userRelationResponse);
        }

        @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b.AbstractC35116a
        /* renamed from: a */
        public void mo129491a(String str, PushSpeechRecognitionStatus.Status status) {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129578a(str, status);
        }

        @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35136a.AbstractC35137a
        /* renamed from: a */
        public void mo129508a(String str, UserRelationResponse userRelationResponse) {
            UICallbackExecutor.execute(new Runnable(str, userRelationResponse) {
                /* class com.ss.android.lark.chatthread.$$Lambda$e$a$BBifdkvgCpfPCdyy8rqJzw5eYEc */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ UserRelationResponse f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C35124e.C35127a.this.m137128b(this.f$1, this.f$2);
                }
            });
        }

        @Override // com.ss.android.lark.chatthread.p1716c.AbstractC35115b.AbstractC35116a
        /* renamed from: a */
        public void mo129490a(String str, int i, String str2, boolean z, int[] iArr) {
            ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129577a(str, i, str2, z, iArr, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC35135g.AbstractC35138b.AbstractC35139a createViewDelegate() {
        return new C35128b();
    }

    /* renamed from: b */
    public void mo129501b() {
        ((AbstractC35135g.AbstractC35136a) getModel()).mo129459g();
    }

    /* renamed from: c */
    public void mo129502c() {
        ((AbstractC35135g.AbstractC35138b) getView()).mo129567f();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m137114d();
        m137115e();
    }

    /* renamed from: d */
    private void m137114d() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.chatthread.$$Lambda$e$AGJvrZcrN1yQ6GyE0Nu7R3OpmRw */

            public final void run() {
                C35124e.this.m137116f();
            }
        });
    }

    /* renamed from: e */
    private void m137115e() {
        ((AbstractC35135g.AbstractC35138b) getView()).mo129592q();
        ((AbstractC35135g.AbstractC35136a) getModel()).mo129419a(new UIGetDataCallback<C35095c>() {
            /* class com.ss.android.lark.chatthread.C35124e.C351262 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129594r();
            }

            /* renamed from: a */
            public void onSuccessed(C35095c cVar) {
                ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129594r();
                ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129561a(cVar);
                C35124e.this.mo129501b();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m137116f() {
        if (((AbstractC35135g.AbstractC35136a) getModel()).mo129462i()) {
            Chat b = ((AbstractC35135g.AbstractC35136a) getModel()).mo129442b();
            if (b.isCrossTenant() && b.isHasWatermark()) {
                ((AbstractC35135g.AbstractC35136a) getModel()).mo129444b(new IGetDataCallback<Chatter>() {
                    /* class com.ss.android.lark.chatthread.C35124e.C351251 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165379d("ThreadPresenter", errorResult.toString());
                    }

                    /* renamed from: a */
                    public void onSuccess(Chatter chatter) {
                        ((AbstractC35135g.AbstractC35138b) C35124e.this.getView()).mo129596t(C34340h.m133174a(chatter, ChatterNameDisplayRule.NAME));
                    }
                });
            }
        }
    }

    public C35124e(AbstractC35135g.AbstractC35138b bVar, AbstractC35135g.AbstractC35136a aVar) {
        super(aVar, bVar);
        ((AbstractC35135g.AbstractC35136a) getModel()).mo129423a(new C35127a());
        ((AbstractC35135g.AbstractC35138b) getView()).setViewDelegate(createViewDelegate());
    }

    /* renamed from: a */
    public void mo129500a(String str, DingStatus dingStatus, boolean z) {
        ((AbstractC35135g.AbstractC35136a) getModel()).mo129430a(str, dingStatus, z);
    }

    /* renamed from: a */
    public void mo129499a(View view, PhotoItem photoItem, List<PhotoItem> list, boolean z) {
        ((AbstractC35135g.AbstractC35138b) getView()).mo129559a(C34353s.m133238a(list, photoItem), list, view, z);
    }
}
