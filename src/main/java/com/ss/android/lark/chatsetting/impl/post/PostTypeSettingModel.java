package com.ss.android.lark.chatsetting.impl.post;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.SelectChatterDTO;
import com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ChatStatisticUtil;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u0007H\u0016J^\u0010#\u001a\u00020\u001b2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\u000e2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\u000e2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0(H\u0002J\b\u0010)\u001a\u00020\u0004H\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u0004H\u0016J\u0018\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\u000eH\u0016J\u001c\u0010/\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0(0\u001dH\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\r0(J&\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u00072\u0014\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010(0\u001dH\u0016J,\u00103\u001a\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u0002050(2\u0014\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010(0\u001dH\u0016J\f\u00106\u001a\u00020\t*\u00020\rH\u0002J\f\u00107\u001a\u00020\t*\u00020\rH\u0002R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IModel;", "mChatId", "", "mOwnerId", "mInPostType", "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "isThread", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;Z)V", "mChangingWhiteList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "Lkotlin/collections/ArrayList;", "mChatAdmins", "", "mChatterService", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IChatDependency;", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mIChatService", "mIsThread", "mOriginWhiteList", "mOwner", "mPostType", "confirm", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/lang/Void;", "createChatterModel", "id", "avatarKey", "currentPostType", "diff", "addList", "removeList", "originList", "desList", "", "getChatId", "getChatName", "getChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", BottomDialog.f17198f, "getCurrentWhiteList", "getPostWhiteList", "parseCurrentChatters2WhiteList", "setPostType", ShareHitPoint.f121869d, "updateWhiteList", "selectChatters", "Lcom/ss/android/lark/chatsetting/dto/SelectChatterDTO;", "isAdmin", "isOwner", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.c */
public final class PostTypeSettingModel extends BaseModel implements IPostTypeSettingContract.IModel {

    /* renamed from: j */
    public static final Companion f90442j = new Companion(null);

    /* renamed from: a */
    public final ArrayList<PostWhiteListViewData> f90443a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<PostWhiteListViewData> f90444b = new ArrayList<>();

    /* renamed from: c */
    public AbstractC34461c.AbstractC34466e f90445c;

    /* renamed from: d */
    public PostWhiteListViewData f90446d;

    /* renamed from: e */
    public List<PostWhiteListViewData> f90447e = new ArrayList();

    /* renamed from: f */
    public AbstractC34461c.AbstractC34466e f90448f;

    /* renamed from: g */
    public Chat f90449g;

    /* renamed from: h */
    public final String f90450h;

    /* renamed from: i */
    public final String f90451i;

    /* renamed from: k */
    private Chat.PostType f90452k;

    /* renamed from: l */
    private boolean f90453l;

    /* renamed from: m */
    private Chat.PostType f90454m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingModel$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: a */
    public Chat.PostType mo129124a() {
        return this.f90452k;
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: c */
    public String mo129131c() {
        return this.f90450h;
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: d */
    public boolean mo129132d() {
        return this.f90453l;
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: e */
    public String mo129133e() {
        Chat chat = this.f90449g;
        if (chat != null) {
            return chat.getName();
        }
        return null;
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: b */
    public ArrayList<String> mo129129b() {
        ArrayList<String> arrayList = new ArrayList<>(this.f90444b.size());
        Iterator<T> it = this.f90444b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo129175c());
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<PostWhiteListViewData> mo129150f() {
        ArrayList arrayList = new ArrayList(this.f90444b.size() + 2);
        HashSet hashSet = new HashSet();
        PostWhiteListViewData hVar = this.f90446d;
        if (hVar != null) {
            arrayList.add(hVar);
            hashSet.add(hVar.mo129175c());
        }
        Iterator<PostWhiteListViewData> it = this.f90444b.iterator();
        while (it.hasNext()) {
            PostWhiteListViewData next = it.next();
            if (!hashSet.contains(next.mo129175c())) {
                arrayList.add(next);
                hashSet.add(next.mo129175c());
            }
        }
        for (PostWhiteListViewData hVar2 : this.f90447e) {
            if (!hashSet.contains(hVar2.mo129175c())) {
                arrayList.add(hVar2);
                hashSet.add(hVar2.mo129175c());
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(0, new PostWhiteListViewData(2, "", ""));
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostTypeSettingModel$getPostWhiteList$modelCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "onError", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.c$b */
    public static final class C35057b implements IGetDataCallback<List<? extends ChatChatter>> {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingModel f90457a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f90458b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            this.f90458b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends ChatChatter> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            for (ChatChatter chatChatter : list) {
                if (Intrinsics.areEqual(this.f90457a.f90451i, chatChatter.getId())) {
                    PostTypeSettingModel cVar = this.f90457a;
                    String id = chatChatter.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
                    String avatarKey = chatChatter.getAvatarKey();
                    Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chatter.getAvatarKey()");
                    cVar.f90446d = cVar.mo129149a(id, avatarKey);
                } else {
                    ArrayList<PostWhiteListViewData> arrayList = this.f90457a.f90443a;
                    PostTypeSettingModel cVar2 = this.f90457a;
                    String id2 = chatChatter.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id2, "chatter.getId()");
                    String avatarKey2 = chatChatter.getAvatarKey();
                    Intrinsics.checkExpressionValueIsNotNull(avatarKey2, "chatter.getAvatarKey()");
                    arrayList.add(cVar2.mo129149a(id2, avatarKey2));
                }
            }
            CollectionsKt.sort(this.f90457a.f90443a);
            this.f90457a.f90444b.clear();
            this.f90457a.f90444b.addAll(this.f90457a.f90443a);
            this.f90458b.onSuccess(this.f90457a.mo129150f());
        }

        C35057b(PostTypeSettingModel cVar, IGetDataCallback iGetDataCallback) {
            this.f90457a = cVar;
            this.f90458b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    private final boolean m136566a(PostWhiteListViewData hVar) {
        return Intrinsics.areEqual(this.f90451i, hVar.mo129175c());
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: a */
    public Chatter mo129125a(String str) {
        ChatChatter chatChatter;
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        AbstractC34461c.AbstractC34466e eVar = this.f90445c;
        if (eVar != null) {
            chatChatter = eVar.mo127313a(this.f90450h, str);
        } else {
            chatChatter = null;
        }
        return chatChatter;
    }

    /* renamed from: b */
    private final boolean m136567b(PostWhiteListViewData hVar) {
        List<PostWhiteListViewData> list = this.f90447e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().mo129175c(), hVar.mo129175c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: a */
    public void mo129126a(IGetDataCallback<List<PostWhiteListViewData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C35057b bVar = new C35057b(this, iGetDataCallback);
        AbstractC34461c.AbstractC34466e eVar = this.f90448f;
        if (eVar != null) {
            eVar.mo127377g(this.f90450h, getCallbackManager().wrapAndAddGetDataCallback(bVar));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: b */
    public void mo129130b(IGetDataCallback<Void> iGetDataCallback) {
        boolean z;
        ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        m136565a(arrayList2, arrayList, this.f90443a, this.f90444b);
        if (this.f90452k != Chat.PostType.WHITE_LIST || (arrayList2.isEmpty() && arrayList.isEmpty())) {
            z = false;
        } else {
            z = true;
        }
        Chat.PostType postType = this.f90452k;
        Integer num = null;
        if (postType != this.f90454m || z) {
            int i = C35058d.f90459a[postType.ordinal()];
            if (i == 1) {
                managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ALL;
            } else if (i != 2) {
                managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.SOME_MEMBER;
            } else {
                managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ONLY_GROUP_OWNER_AND_ADMIN;
            }
            ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.MESSAGE_RESTRICTION, managePermissionParams);
            SettingHitPoint.f90520a.mo129266a(this.f90452k);
            ChatStatisticUtil.m136657a(this.f90449g, this.f90452k);
            OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
            Chat.PostType postType2 = this.f90452k;
            int size = this.f90444b.size();
            Chat chat = this.f90449g;
            if (chat != null) {
                num = Integer.valueOf(chat.getMemberCount());
            }
            aVar.mo129284a(postType2, size, num, this.f90450h);
            AbstractC34461c.AbstractC34466e eVar = this.f90448f;
            if (eVar != null) {
                eVar.mo127334a(this.f90450h, this.f90452k, arrayList2, arrayList, iGetDataCallback);
                return;
            }
            return;
        }
        iGetDataCallback.onSuccess(null);
        Log.m165389i("PostSetting", "post type is not changed");
    }

    /* renamed from: a */
    public final PostWhiteListViewData mo129149a(String str, String str2) {
        return new PostWhiteListViewData(1, str2, str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: a */
    public void mo129127a(Chat.PostType postType, IGetDataCallback<List<PostWhiteListViewData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(postType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f90452k = postType;
        if (postType == Chat.PostType.WHITE_LIST) {
            iGetDataCallback.onSuccess(mo129150f());
        } else {
            iGetDataCallback.onSuccess(null);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IModel
    /* renamed from: a */
    public void mo129128a(List<SelectChatterDTO> list, IGetDataCallback<List<PostWhiteListViewData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "selectChatters");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        List<SelectChatterDTO> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            arrayList.add(mo129149a(t.mo127504a(), t.mo127505b()));
        }
        this.f90444b.clear();
        this.f90444b.addAll(arrayList);
        CollectionsKt.sort(this.f90444b);
        iGetDataCallback.onSuccess(mo129150f());
    }

    public PostTypeSettingModel(String str, String str2, Chat.PostType postType, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        Intrinsics.checkParameterIsNotNull(str2, "mOwnerId");
        Intrinsics.checkParameterIsNotNull(postType, "mInPostType");
        this.f90450h = str;
        this.f90451i = str2;
        this.f90454m = postType;
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        this.f90448f = a.mo127274d();
        AbstractC34461c a2 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ChatSettingModule.getDependency()");
        this.f90445c = a2.mo127274d();
        this.f90452k = this.f90454m;
        this.f90453l = z;
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new Runnable(this) {
            /* class com.ss.android.lark.chatsetting.impl.post.PostTypeSettingModel.RunnableC350551 */

            /* renamed from: a */
            final /* synthetic */ PostTypeSettingModel f90455a;

            {
                this.f90455a = r1;
            }

            public final void run() {
                ChatChatter chatChatter;
                AbstractC34461c.AbstractC34466e eVar = this.f90455a.f90445c;
                Chat chat = null;
                if (eVar != null) {
                    chatChatter = eVar.mo127313a(this.f90455a.f90450h, this.f90455a.f90451i);
                } else {
                    chatChatter = null;
                }
                if (chatChatter != null) {
                    PostTypeSettingModel cVar = this.f90455a;
                    String id = chatChatter.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
                    String avatarKey = chatChatter.getAvatarKey();
                    Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chatter.getAvatarKey()");
                    cVar.f90446d = cVar.mo129149a(id, avatarKey);
                }
                PostTypeSettingModel cVar2 = this.f90455a;
                AbstractC34461c.AbstractC34466e eVar2 = cVar2.f90448f;
                if (eVar2 != null) {
                    chat = eVar2.mo127349b(this.f90455a.f90450h);
                }
                cVar2.f90449g = chat;
                AbstractC34461c.AbstractC34466e eVar3 = this.f90455a.f90448f;
                if (eVar3 != null) {
                    eVar3.mo127381j(this.f90455a.f90450h, new IGetDataCallback<List<? extends Chatter>>(this) {
                        /* class com.ss.android.lark.chatsetting.impl.post.PostTypeSettingModel.RunnableC350551.C350561 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC350551 f90456a;

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f90456a = r1;
                        }

                        /* renamed from: a */
                        public void onSuccess(List<? extends Chatter> list) {
                            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            List<PostWhiteListViewData> list2 = this.f90456a.f90455a.f90447e;
                            List<? extends Chatter> list3 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                            for (T t : list3) {
                                String avatarKey = t.getAvatarKey();
                                Intrinsics.checkExpressionValueIsNotNull(avatarKey, "it.getAvatarKey()");
                                String id = t.getId();
                                Intrinsics.checkExpressionValueIsNotNull(id, "it.getId()");
                                arrayList.add(new PostWhiteListViewData(1, avatarKey, id));
                            }
                            list2.addAll(arrayList);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    private final void m136565a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<PostWhiteListViewData> arrayList3, List<PostWhiteListViewData> list) {
        boolean z;
        arrayList.clear();
        arrayList2.clear();
        HashSet hashSet = new HashSet(arrayList3);
        HashSet hashSet2 = new HashSet(list);
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t = next;
            if (hashSet.contains(t) || m136566a((PostWhiteListViewData) t) || m136567b((PostWhiteListViewData) t)) {
                z2 = true;
            }
            if (!z2) {
                arrayList4.add(next);
            }
        }
        ArrayList<PostWhiteListViewData> arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (PostWhiteListViewData hVar : arrayList5) {
            arrayList6.add(hVar.mo129175c());
        }
        arrayList.addAll(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for (T t2 : arrayList3) {
            T t3 = t2;
            if (hashSet2.contains(t3) || m136566a((PostWhiteListViewData) t3) || m136567b((PostWhiteListViewData) t3)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList7.add(t2);
            }
        }
        ArrayList<PostWhiteListViewData> arrayList8 = arrayList7;
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        for (PostWhiteListViewData hVar2 : arrayList8) {
            arrayList9.add(hVar2.mo129175c());
        }
        arrayList2.addAll(arrayList9);
    }
}
