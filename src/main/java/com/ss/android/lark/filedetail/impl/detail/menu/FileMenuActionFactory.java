package com.ss.android.lark.filedetail.impl.detail.menu;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.impl.open.OpenFileInfo;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/detail/menu/FileMenuActionFactory;", "", "()V", "FROM_TAG", "", "chatDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IChatDependency;", "getChatDependency", "()Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IChatDependency;", "forwardDependency", "Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IForwardDependency;", "getForwardDependency", "()Lcom/ss/android/lark/filedetail/dependency/IFileDetailModuleDependency$IForwardDependency;", "getMenuActionsFromFolderManage", "Lcom/ss/android/lark/filedetail/impl/detail/menu/IFileMenuClickDependency;", "context", "Landroid/content/Context;", "params", "Lcom/ss/android/lark/filedetail/impl/open/OpenFileInfo;", "getMenuActionsFromMessage", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.detail.b.a */
public final class FileMenuActionFactory {

    /* renamed from: a */
    public static final FileMenuActionFactory f98063a = new FileMenuActionFactory();

    /* renamed from: b */
    private static final AbstractC38197a.AbstractC38199b f98064b;

    /* renamed from: c */
    private static final AbstractC38197a.AbstractC38205h f98065c;

    private FileMenuActionFactory() {
    }

    /* renamed from: a */
    public final AbstractC38197a.AbstractC38199b mo139823a() {
        return f98064b;
    }

    /* renamed from: b */
    public final AbstractC38197a.AbstractC38205h mo139825b() {
        return f98065c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/detail/menu/FileMenuActionFactory$getMenuActionsFromFolderManage$1", "Lcom/ss/android/lark/filedetail/impl/detail/menu/IFileMenuClickDependency;", "onForward", "", "onJump2Chat", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.detail.b.a$a */
    public static final class C38240a implements IFileMenuClickDependency {

        /* renamed from: a */
        final /* synthetic */ OpenFileInfo f98066a;

        /* renamed from: b */
        final /* synthetic */ Context f98067b;

        @Override // com.ss.android.lark.filedetail.impl.detail.menu.IFileMenuClickDependency
        /* renamed from: b */
        public void mo139828b() {
            boolean z;
            AbstractC38197a.AbstractC38205h b;
            String str = this.f98066a.mMessageId;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (b = FileMenuActionFactory.f98063a.mo139825b()) != null) {
                b.mo139627a(this.f98067b, this.f98066a.mFileContent.getKey(), this.f98066a.mFileContent.getName(), this.f98066a.mFileContent.getSize(), false, this.f98066a.mMessageId);
            }
        }

        @Override // com.ss.android.lark.filedetail.impl.detail.menu.IFileMenuClickDependency
        /* renamed from: a */
        public boolean mo139827a() {
            boolean z;
            String str = this.f98066a.threadId;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                AbstractC38197a.AbstractC38199b a = FileMenuActionFactory.f98063a.mo139823a();
                if (a != null) {
                    a.mo139600a(this.f98067b, this.f98066a.threadId, this.f98066a.mJumpPosition);
                }
            } else if (this.f98066a.mJumpPosition == -1) {
                return false;
            } else {
                AbstractC38197a.AbstractC38199b a2 = FileMenuActionFactory.f98063a.mo139823a();
                if (a2 != null) {
                    a2.mo139601a(this.f98067b, this.f98066a.mChatId, "FileDetailActivity", this.f98066a.mJumpPosition);
                }
            }
            return true;
        }

        C38240a(OpenFileInfo openFileInfo, Context context) {
            this.f98066a = openFileInfo;
            this.f98067b = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/filedetail/impl/detail/menu/FileMenuActionFactory$getMenuActionsFromMessage$1", "Lcom/ss/android/lark/filedetail/impl/detail/menu/IFileMenuClickDependency;", "onForward", "", "onGetRemoteMessage", "onJump2Chat", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.detail.b.a$b */
    public static final class C38241b implements IFileMenuClickDependency {

        /* renamed from: a */
        final /* synthetic */ OpenFileInfo f98068a;

        /* renamed from: b */
        final /* synthetic */ Context f98069b;

        /* renamed from: c */
        private final void m150380c() {
            AbstractC38197a.AbstractC38199b a = FileMenuActionFactory.f98063a.mo139823a();
            if (a != null) {
                a.mo139602a(CollectionsKt.listOf(this.f98068a.mMessageId), new UIGetDataCallback(new C38242a(this)));
            }
        }

        @Override // com.ss.android.lark.filedetail.impl.detail.menu.IFileMenuClickDependency
        /* renamed from: a */
        public boolean mo139827a() {
            if (!TextUtils.isEmpty(this.f98068a.threadId)) {
                AbstractC38197a.AbstractC38199b a = FileMenuActionFactory.f98063a.mo139823a();
                if (a == null) {
                    return true;
                }
                a.mo139600a(this.f98069b, this.f98068a.threadId, this.f98068a.mJumpPosition);
                return true;
            } else if (this.f98068a.mJumpPosition == -1) {
                return false;
            } else {
                AbstractC38197a.AbstractC38199b a2 = FileMenuActionFactory.f98063a.mo139823a();
                if (a2 == null) {
                    return true;
                }
                a2.mo139601a(this.f98069b, this.f98068a.mChatId, "FileDetailActivity", this.f98068a.mJumpPosition);
                return true;
            }
        }

        @Override // com.ss.android.lark.filedetail.impl.detail.menu.IFileMenuClickDependency
        /* renamed from: b */
        public void mo139828b() {
            Message message;
            if (!TextUtils.isEmpty(this.f98068a.mMessageId)) {
                if (this.f98068a.mFavoriteMessage != null) {
                    AbstractC38197a.AbstractC38205h b = FileMenuActionFactory.f98063a.mo139825b();
                    if (b != null) {
                        b.mo139625a(this.f98069b, this.f98068a.mFavoriteMessage, 0);
                        return;
                    }
                    return;
                }
                AbstractC38197a.AbstractC38199b a = FileMenuActionFactory.f98063a.mo139823a();
                if (a != null) {
                    message = a.mo139603b(this.f98068a.mMessageId);
                } else {
                    message = null;
                }
                if (message != null) {
                    AbstractC38197a.AbstractC38205h b2 = FileMenuActionFactory.f98063a.mo139825b();
                    if (b2 != null) {
                        b2.mo139626a(this.f98069b, message, this.f98068a.originMergeForwardId);
                        return;
                    }
                    return;
                }
                m150380c();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/filedetail/impl/detail/menu/FileMenuActionFactory$getMenuActionsFromMessage$1$onGetRemoteMessage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.impl.detail.b.a$b$a */
        public static final class C38242a implements IGetDataCallback<List<? extends Message>> {

            /* renamed from: a */
            final /* synthetic */ C38241b f98070a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C38242a(C38241b bVar) {
                this.f98070a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                if (!(this.f98070a.f98069b instanceof Activity) || !((Activity) this.f98070a.f98069b).isFinishing()) {
                    String displayMsg = errorResult.getDisplayMsg();
                    if (displayMsg == null || displayMsg.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        LKUIToast.show(this.f98070a.f98069b, errorResult.getDisplayMsg());
                    }
                }
            }

            /* renamed from: a */
            public void onSuccess(List<? extends Message> list) {
                boolean z;
                if (!(this.f98070a.f98069b instanceof Activity) || !((Activity) this.f98070a.f98069b).isFinishing()) {
                    List<? extends Message> list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        LKUIToast.show(this.f98070a.f98069b, (int) R.string.Lark_Legacy_ChatViewForwardingFailed);
                        return;
                    }
                    AbstractC38197a.AbstractC38205h b = FileMenuActionFactory.f98063a.mo139825b();
                    if (b != null) {
                        b.mo139626a(this.f98070a.f98069b, (Message) list.get(0), this.f98070a.f98068a.originMergeForwardId);
                    }
                }
            }
        }

        C38241b(OpenFileInfo openFileInfo, Context context) {
            this.f98068a = openFileInfo;
            this.f98069b = context;
        }
    }

    static {
        AbstractC38197a.AbstractC38199b bVar;
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        AbstractC38197a.AbstractC38205h hVar = null;
        if (a != null) {
            bVar = a.getChatDependency();
        } else {
            bVar = null;
        }
        f98064b = bVar;
        AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
        if (a2 != null) {
            hVar = a2.getForwardDependency();
        }
        f98065c = hVar;
    }

    /* renamed from: a */
    public final IFileMenuClickDependency mo139824a(Context context, OpenFileInfo openFileInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(openFileInfo, "params");
        return new C38241b(openFileInfo, context);
    }

    /* renamed from: b */
    public final IFileMenuClickDependency mo139826b(Context context, OpenFileInfo openFileInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(openFileInfo, "params");
        return new C38240a(openFileInfo, context);
    }
}
