package com.ss.android.vc.meeting.module.share;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dto.C60916a;
import com.ss.android.vc.entity.GetAuthChattersResponse;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.response.SearchUsersAndChatsEntity;
import com.ss.android.vc.entity.response.ay;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager;
import com.ss.android.vc.meeting.module.share.IVideoChatShareContract;
import com.ss.android.vc.meeting.module.share.VideoChatShareView;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.C63634c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0002WXB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u00107\u001a\u00020\nH\u0016J6\u00108\u001a\u0002092\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0016j\b\u0012\u0004\u0012\u00020\u0007`\u00172\u0006\u0010;\u001a\u00020<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0>H\u0016J#\u0010?\u001a\u0002092\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00070A2\u0006\u0010B\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010CJ\u0018\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020\u001dH\u0016J\b\u0010I\u001a\u00020\u001dH\u0016J\b\u0010J\u001a\u00020\u0010H\u0016J\u0018\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0016j\b\u0012\u0004\u0012\u00020\u0007`\u0017H\u0016J\b\u0010L\u001a\u00020\nH\u0016J(\u0010M\u001a\u0002092\u0016\u0010N\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0016j\b\u0012\u0004\u0012\u00020\u0007`\u00172\u0006\u0010F\u001a\u00020GH\u0002J\b\u0010O\u001a\u000209H\u0002J\u0018\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u0002092\u0006\u0010T\u001a\u00020#H\u0016J\u0010\u0010U\u001a\u0002092\u0006\u0010V\u001a\u00020\u0010H\u0016R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0016j\b\u0012\u0004\u0012\u00020\u0007`\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0016j\b\u0012\u0004\u0012\u00020\u0007`\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010\u0014¨\u0006Y"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IModel;", "shareVideoChatData", "Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;", "selectedItems", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "(Lcom/ss/android/vc/meeting/module/share/ShareVideoChatData;Ljava/util/List;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "mGroupCount", "", "getMGroupCount", "()I", "setMGroupCount", "(I)V", "mItems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMItems", "()Ljava/util/ArrayList;", "setMItems", "(Ljava/util/ArrayList;)V", "mMeetingId", "", "getMMeetingId", "()Ljava/lang/String;", "setMMeetingId", "(Ljava/lang/String;)V", "mMode", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel$DisplayMode;", "getMMode", "()Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel$DisplayMode;", "setMMode", "(Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel$DisplayMode;)V", "mSearchKey", "getMSearchKey", "setMSearchKey", "mVendorType", "Lcom/ss/android/vc/entity/VideoChat$VendorType;", "getMVendorType", "()Lcom/ss/android/vc/entity/VideoChat$VendorType;", "setMVendorType", "(Lcom/ss/android/vc/entity/VideoChat$VendorType;)V", "searchList", "getSearchList", "setSearchList", "start", "getStart", "setStart", "checkHasMore", "commitSelect", "", "selectItems", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "callback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "deleteSelectedItems", "deletedItems", "", "deletedGroupCount", "([Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;I)V", "getFeedList", "num", "listener", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IModel$OnFeedLoadedFinishListener;", "getMeetingId", "getSearchKey", "getSelectedGroupCount", "getSelectedItems", "isSearchMode", "loadShareItemsAuthInfo", "shareItems", "resetSearch", "search", "key", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ISearchResultCallback;", "setMode", "mode", "setSelectedGroupCount", "count", "Companion", "DisplayMode", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoChatShareModel extends BaseModel implements IVideoChatShareContract.IModel {

    /* renamed from: a */
    public static final int f158530a = 20;

    /* renamed from: b */
    public static final Companion f158531b = new Companion(null);

    /* renamed from: c */
    private ArrayList<VideoChatShareItem> f158532c = new ArrayList<>();

    /* renamed from: d */
    private int f158533d;

    /* renamed from: e */
    private DisplayMode f158534e = DisplayMode.NORMAL;

    /* renamed from: f */
    private boolean f158535f;

    /* renamed from: g */
    private int f158536g;

    /* renamed from: h */
    private String f158537h = "";

    /* renamed from: i */
    private ArrayList<VideoChatShareItem> f158538i = new ArrayList<>();

    /* renamed from: j */
    private String f158539j = "";

    /* renamed from: k */
    private VideoChat.VendorType f158540k = VideoChat.VendorType.UNKNOWN_VENDOR_TYPE;

    /* renamed from: l */
    private final C62955c f158541l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel$DisplayMode;", "", "(Ljava/lang/String;I)V", "NORMAL", "SEARCH", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DisplayMode {
        NORMAL,
        SEARCH
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel$Companion;", "", "()V", "PAGE_SIZE", "", "getPAGE_SIZE", "()I", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo217519a() {
            return VideoChatShareModel.f158530a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: a */
    public ArrayList<VideoChatShareItem> mo217502a() {
        return this.f158532c;
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: b */
    public int mo217512b() {
        return this.f158533d;
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: d */
    public String mo217515d() {
        return this.f158539j;
    }

    /* renamed from: e */
    public final int mo217516e() {
        return this.f158536g;
    }

    /* renamed from: f */
    public final String mo217517f() {
        return this.f158537h;
    }

    /* renamed from: g */
    public final VideoChat.VendorType mo217518g() {
        return this.f158540k;
    }

    /* renamed from: h */
    private final void m246423h() {
        this.f158536g = 0;
        this.f158538i.clear();
        this.f158535f = false;
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: c */
    public boolean mo217514c() {
        if (this.f158534e == DisplayMode.SEARCH) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareModel$search$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/SearchUsersAndChatsEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$f */
    public static final class C62941f implements AbstractC63598b<SearchUsersAndChatsEntity> {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareModel f158550a;

        /* renamed from: b */
        final /* synthetic */ VideoChatShareView.ISearchResultCallback f158551b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareModel$search$1$onSuccess$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/UserProfileEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "profileEntity", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$f$a */
        public static final class C62942a implements AbstractC63598b<ay> {

            /* renamed from: a */
            final /* synthetic */ C62941f f158552a;

            /* renamed from: b */
            final /* synthetic */ VideoChatShareItem f158553b;

            /* renamed from: c */
            final /* synthetic */ Ref.ObjectRef f158554c;

            /* renamed from: d */
            final /* synthetic */ SearchUsersAndChatsEntity f158555d;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$f$a$a */
            static final class RunnableC62943a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C62942a f158556a;

                /* renamed from: b */
                final /* synthetic */ Ref.ObjectRef f158557b;

                RunnableC62943a(C62942a aVar, Ref.ObjectRef objectRef) {
                    this.f158556a = aVar;
                    this.f158557b = objectRef;
                }

                public final void run() {
                    this.f158556a.f158554c.element.add(this.f158557b.element);
                    List<VideoChatShareItem> list = this.f158556a.f158555d.items;
                    if (list != null && list.size() == this.f158556a.f158554c.element.size()) {
                        this.f158556a.f158552a.f158551b.mo217660a((List<VideoChatShareItem>) this.f158556a.f158554c.element);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$f$a$b */
            public static final class RunnableC62944b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C62942a f158558a;

                /* renamed from: b */
                final /* synthetic */ Ref.ObjectRef f158559b;

                RunnableC62944b(C62942a aVar, Ref.ObjectRef objectRef) {
                    this.f158558a = aVar;
                    this.f158559b = objectRef;
                }

                public final void run() {
                    this.f158558a.f158554c.element.add(this.f158559b.element);
                    List<VideoChatShareItem> list = this.f158558a.f158555d.items;
                    if (list != null && list.size() == this.f158558a.f158554c.element.size()) {
                        this.f158558a.f158552a.f158551b.mo217660a((List<VideoChatShareItem>) this.f158558a.f158554c.element);
                    }
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) new VideoChatShareItem(this.f158553b.getId(), this.f158553b.getName(), this.f158553b.getImageKey(), "", this.f158553b.getType(), this.f158553b.isSecret(), this.f158553b.getHitTerms(), this.f158553b.getSubtitleHitTerms(), this.f158553b.isExternal(), this.f158553b.isLeave(), false, 0, null, null, null, false, null, 130048, null);
                C60735ab.m236001a(new RunnableC62943a(this, objectRef));
            }

            /* renamed from: a */
            public void onSuccess(ay ayVar) {
                String str;
                if (ayVar == null || TextUtils.isEmpty(ayVar.mo210121a())) {
                    str = "";
                } else {
                    str = ayVar.mo210121a();
                    Intrinsics.checkExpressionValueIsNotNull(str, "profileEntity?.tenantName");
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) new VideoChatShareItem(this.f158553b.getId(), this.f158553b.getName(), this.f158553b.getImageKey(), str, this.f158553b.getType(), this.f158553b.isSecret(), this.f158553b.getHitTerms(), this.f158553b.getSubtitleHitTerms(), this.f158553b.isExternal(), this.f158553b.isLeave(), false, 0, null, null, null, false, null, 130048, null);
                C60735ab.m236001a(new RunnableC62944b(this, objectRef));
            }

            C62942a(C62941f fVar, VideoChatShareItem videoChatShareItem, Ref.ObjectRef objectRef, SearchUsersAndChatsEntity searchUsersAndChatsEntity) {
                this.f158552a = fVar;
                this.f158553b = videoChatShareItem;
                this.f158554c = objectRef;
                this.f158555d = searchUsersAndChatsEntity;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$f$b */
        public static final class RunnableC62945b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62941f f158560a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f158561b;

            /* renamed from: c */
            final /* synthetic */ VideoChatShareItem f158562c;

            /* renamed from: d */
            final /* synthetic */ SearchUsersAndChatsEntity f158563d;

            RunnableC62945b(C62941f fVar, Ref.ObjectRef objectRef, VideoChatShareItem videoChatShareItem, SearchUsersAndChatsEntity searchUsersAndChatsEntity) {
                this.f158560a = fVar;
                this.f158561b = objectRef;
                this.f158562c = videoChatShareItem;
                this.f158563d = searchUsersAndChatsEntity;
            }

            public final void run() {
                this.f158561b.element.add(this.f158562c);
                List<VideoChatShareItem> list = this.f158563d.items;
                if (list != null && list.size() == this.f158561b.element.size()) {
                    this.f158560a.f158551b.mo217660a((List<VideoChatShareItem>) this.f158561b.element);
                }
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            VideoChatShareView.ISearchResultCallback aVar = this.f158551b;
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            ErrorResult errorResult = eVar.f160599b;
            Intrinsics.checkExpressionValueIsNotNull(errorResult, "error!!.errorResult");
            aVar.mo217658a(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchUsersAndChatsEntity searchUsersAndChatsEntity) {
            if (searchUsersAndChatsEntity != null) {
                String str = searchUsersAndChatsEntity.search_key;
                if (!(!Intrinsics.areEqual(this.f158550a.mo217517f(), str))) {
                    this.f158550a.mo217506a(str);
                    this.f158550a.mo217510a(searchUsersAndChatsEntity.has_more);
                    if (searchUsersAndChatsEntity.items != null) {
                        List<VideoChatShareItem> list = searchUsersAndChatsEntity.items;
                        if (list == null) {
                            Intrinsics.throwNpe();
                        }
                        if (!list.isEmpty()) {
                            VideoChatShareModel videoChatShareModel = this.f158550a;
                            videoChatShareModel.mo217513b(videoChatShareModel.mo217516e() + VideoChatShareModel.f158531b.mo217519a());
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            objectRef.element = (T) new ArrayList();
                            for (VideoChatShareItem videoChatShareItem : searchUsersAndChatsEntity.items) {
                                if (videoChatShareItem.getType() != ShareItemType.USER || !videoChatShareItem.isExternal()) {
                                    C60735ab.m236001a(new RunnableC62945b(this, objectRef, videoChatShareItem, searchUsersAndChatsEntity));
                                } else {
                                    VcBizSender.m249277f(videoChatShareItem.getId(), new C62942a(this, videoChatShareItem, objectRef, searchUsersAndChatsEntity));
                                }
                            }
                            return;
                        }
                    }
                    this.f158551b.mo217659a(str);
                }
            }
        }

        C62941f(VideoChatShareModel videoChatShareModel, VideoChatShareView.ISearchResultCallback aVar) {
            this.f158550a = videoChatShareModel;
            this.f158551b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$c */
    static final class C62938c<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareModel f158542a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f158543b;

        /* renamed from: c */
        final /* synthetic */ Ref.IntRef f158544c;

        /* renamed from: d */
        final /* synthetic */ int f158545d;

        C62938c(VideoChatShareModel videoChatShareModel, ArrayList arrayList, Ref.IntRef intRef, int i) {
            this.f158542a = videoChatShareModel;
            this.f158543b = arrayList;
            this.f158544c = intRef;
            this.f158545d = i;
        }

        /* renamed from: a */
        public final ArrayList<VideoChatShareItem> produce() {
            ShareItemType shareItemType;
            String str;
            String str2;
            IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
            Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
            for (C60916a aVar : dependency.getFeedFromCacheForChatInbox()) {
                Intrinsics.checkExpressionValueIsNotNull(aVar, "card");
                if (!aVar.mo208857g() && !aVar.mo208855e()) {
                    if (this.f158542a.mo217518g() != VideoChat.VendorType.ZOOM || !aVar.mo208856f()) {
                        OpenChat chatById = VideoChatModuleDependency.getChatDependency().getChatById(aVar.mo208845b());
                        if (!chatById.isSecret()) {
                            if (aVar.mo208844a()) {
                                shareItemType = ShareItemType.GROUP;
                            } else {
                                shareItemType = ShareItemType.USER;
                            }
                            if (!chatById.isP2PChat() || chatById.isSecret()) {
                                str = chatById.getId();
                            } else {
                                str = chatById.getP2pChatterId();
                            }
                            String d = aVar.mo208851d();
                            Intrinsics.checkExpressionValueIsNotNull(d, "card.name");
                            String c = aVar.mo208848c();
                            Intrinsics.checkExpressionValueIsNotNull(c, "card.avatarKey");
                            boolean isSecret = chatById.isSecret();
                            boolean f = aVar.mo208856f();
                            String p2pChatterId = chatById.getP2pChatterId();
                            if (chatById.isP2PChat()) {
                                str2 = chatById.getId();
                            } else {
                                str2 = null;
                            }
                            List<ChatterCustomStatus> h = aVar.mo208858h();
                            if (h == null) {
                                h = CollectionsKt.emptyList();
                            }
                            this.f158543b.add(new VideoChatShareItem(str, d, c, "", shareItemType, isSecret, null, null, f, false, false, 0, null, p2pChatterId, str2, false, h, 39936, null));
                            this.f158544c.element++;
                            if (this.f158544c.element == this.f158545d) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return this.f158543b;
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: a */
    public void mo217503a(int i) {
        this.f158533d = i;
    }

    /* renamed from: b */
    public final void mo217513b(int i) {
        this.f158536g = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$b */
    static final class C62937b extends Lambda implements Function1<VideoChatShareItem, Boolean> {
        final /* synthetic */ VideoChatShareItem $item;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62937b(VideoChatShareItem videoChatShareItem) {
            super(1);
            this.$item = videoChatShareItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(VideoChatShareItem videoChatShareItem) {
            return Boolean.valueOf(invoke(videoChatShareItem));
        }

        public final boolean invoke(VideoChatShareItem videoChatShareItem) {
            Intrinsics.checkParameterIsNotNull(videoChatShareItem, "it");
            if (Intrinsics.areEqual(videoChatShareItem.getId(), this.$item.getId()) && videoChatShareItem.isSecret() == this.$item.isSecret() && videoChatShareItem.getType() == this.$item.getType()) {
                return true;
            }
            return false;
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: a */
    public void mo217505a(DisplayMode displayMode) {
        Intrinsics.checkParameterIsNotNull(displayMode, "mode");
        this.f158534e = displayMode;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$d */
    static final class C62939d<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareModel f158546a;

        /* renamed from: b */
        final /* synthetic */ IVideoChatShareContract.IModel.OnFeedLoadedFinishListener f158547b;

        C62939d(VideoChatShareModel videoChatShareModel, IVideoChatShareContract.IModel.OnFeedLoadedFinishListener aVar) {
            this.f158546a = videoChatShareModel;
            this.f158547b = aVar;
        }

        /* renamed from: a */
        public final void consume(ArrayList<VideoChatShareItem> arrayList) {
            if (C63634c.m249496b("lark.client.contact.opt")) {
                VideoChatShareModel videoChatShareModel = this.f158546a;
                Intrinsics.checkExpressionValueIsNotNull(arrayList, "it");
                videoChatShareModel.mo217509a(arrayList, this.f158547b);
                return;
            }
            IVideoChatShareContract.IModel.OnFeedLoadedFinishListener aVar = this.f158547b;
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "it");
            aVar.mo217529a(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/share/VideoChatShareModel$loadShareItemsAuthInfo$3", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/GetAuthChattersResponse;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.VideoChatShareModel$e */
    public static final class C62940e implements AbstractC63598b<GetAuthChattersResponse> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f158548a;

        /* renamed from: b */
        final /* synthetic */ IVideoChatShareContract.IModel.OnFeedLoadedFinishListener f158549b;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            C60700b.m235864f("VideoChatShareModel", "[getChattersAuthInfo]", "error: " + eVar);
            this.f158549b.mo217529a(this.f158548a);
        }

        /* renamed from: a */
        public void onSuccess(GetAuthChattersResponse getAuthChattersResponse) {
            GetAuthChattersResponse.DeniedReason deniedReason;
            boolean z;
            Map<String, GetAuthChattersResponse.DeniedReason> deniedReason2;
            for (VideoChatShareItem videoChatShareItem : this.f158548a) {
                if (getAuthChattersResponse == null || (deniedReason2 = getAuthChattersResponse.getDeniedReason()) == null) {
                    deniedReason = null;
                } else {
                    deniedReason = deniedReason2.get(videoChatShareItem.getP2pChatterId());
                }
                if (deniedReason == GetAuthChattersResponse.DeniedReason.BLOCKED) {
                    z = true;
                } else {
                    z = false;
                }
                videoChatShareItem.setBlocked(z);
            }
            this.f158549b.mo217529a(this.f158548a);
        }

        C62940e(ArrayList arrayList, IVideoChatShareContract.IModel.OnFeedLoadedFinishListener aVar) {
            this.f158548a = arrayList;
            this.f158549b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo217506a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f158537h = str;
    }

    /* renamed from: a */
    public final void mo217510a(boolean z) {
        this.f158535f = z;
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: a */
    public void mo217504a(int i, IVideoChatShareContract.IModel.OnFeedLoadedFinishListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        C57865c.m224574a(new C62938c(this, new ArrayList(), intRef, i), new C62939d(this, aVar));
    }

    public VideoChatShareModel(C62955c cVar, List<VideoChatShareItem> list) {
        Intrinsics.checkParameterIsNotNull(cVar, "shareVideoChatData");
        this.f158541l = cVar;
        String str = cVar.f158617a;
        Intrinsics.checkExpressionValueIsNotNull(str, "shareVideoChatData.meetingId");
        this.f158539j = str;
        VideoChat.VendorType forNumber = VideoChat.VendorType.forNumber(cVar.f158618b);
        Intrinsics.checkExpressionValueIsNotNull(forNumber, "VideoChat.VendorType.for…VideoChatData.vendorType)");
        this.f158540k = forNumber;
        if (list != null) {
            this.f158532c.addAll(list);
        }
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: a */
    public void mo217507a(String str, VideoChatShareView.ISearchResultCallback aVar) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        if (TextUtils.isEmpty(str)) {
            this.f158537h = "";
            aVar.mo217657a();
            return;
        }
        aVar.mo217661b();
        boolean z = true;
        if (!Intrinsics.areEqual(this.f158537h, str)) {
            m246423h();
            this.f158537h = str;
        }
        this.f158534e = DisplayMode.SEARCH;
        if (this.f158540k != VideoChat.VendorType.RTC) {
            z = false;
        }
        VcBizService.searchUserAndChatterForSharing(str, this.f158536g, f158530a, z, new C62941f(this, aVar));
    }

    /* renamed from: a */
    public final void mo217509a(ArrayList<VideoChatShareItem> arrayList, IVideoChatShareContract.IModel.OnFeedLoadedFinishListener aVar) {
        boolean z;
        boolean z2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList<VideoChatShareItem> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            VideoChatShareItem videoChatShareItem = (VideoChatShareItem) obj;
            String p2pChatId = videoChatShareItem.getP2pChatId();
            boolean z3 = false;
            if (p2pChatId == null || StringsKt.isBlank(p2pChatId)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String p2pChatterId = videoChatShareItem.getP2pChatterId();
                if (p2pChatterId == null || StringsKt.isBlank(p2pChatterId)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = true;
                }
            }
            if (z3) {
                arrayList3.add(obj);
            }
        }
        for (VideoChatShareItem videoChatShareItem2 : arrayList3) {
            HashMap hashMap2 = hashMap;
            String p2pChatterId2 = videoChatShareItem2.getP2pChatterId();
            if (p2pChatterId2 == null) {
                Intrinsics.throwNpe();
            }
            String p2pChatId2 = videoChatShareItem2.getP2pChatId();
            if (p2pChatId2 == null) {
                Intrinsics.throwNpe();
            }
            hashMap2.put(p2pChatterId2, p2pChatId2);
        }
        VcBizSender.m249204a(hashMap).mo219889a(new C62940e(arrayList2, aVar));
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: a */
    public void mo217511a(VideoChatShareItem[] videoChatShareItemArr, int i) {
        Intrinsics.checkParameterIsNotNull(videoChatShareItemArr, "deletedItems");
        for (VideoChatShareItem videoChatShareItem : videoChatShareItemArr) {
            CollectionsKt.removeAll((List) this.f158532c, (Function1) new C62937b(videoChatShareItem));
        }
        this.f158533d -= i;
    }

    @Override // com.ss.android.vc.meeting.module.share.IVideoChatShareContract.IModel
    /* renamed from: a */
    public void mo217508a(ArrayList<VideoChatShareItem> arrayList, C61303k kVar, AbstractC63598b<String> bVar) {
        Intrinsics.checkParameterIsNotNull(arrayList, "selectItems");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        MeetingSecuritySetting meetingSecuritySetting = new MeetingSecuritySetting();
        VideoChat e = kVar.mo212056e();
        Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
        VideoChatSettings videoChatSettings = e.getVideoChatSettings();
        Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
        MeetingSecuritySetting securitySetting = videoChatSettings.getSecuritySetting();
        Intrinsics.checkExpressionValueIsNotNull(securitySetting, "meeting.videoChat.videoC…tSettings.securitySetting");
        meetingSecuritySetting.setEnableLobby(securitySetting.isEnableLobby());
        meetingSecuritySetting.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP);
        meetingSecuritySetting.setUserIds(new ArrayList());
        meetingSecuritySetting.setGroupIds(new ArrayList());
        meetingSecuritySetting.setRoomIds(new ArrayList());
        meetingSecuritySetting.setSpecialGroupTypes(new ArrayList());
        Iterator<VideoChatShareItem> it = arrayList.iterator();
        while (it.hasNext()) {
            VideoChatShareItem next = it.next();
            if (next.getType() == ShareItemType.GROUP) {
                meetingSecuritySetting.getGroupIds().add(next.getId());
            } else if (next.getType() == ShareItemType.USER) {
                meetingSecuritySetting.getUserIds().add(next.getId());
            } else if (next.getType() == ShareItemType.CALENDAR_GROUP) {
                meetingSecuritySetting.getSpecialGroupTypes().add(MeetingSecuritySetting.SpecialGroupType.CALENDAR_GUEST_LIST);
            } else {
                meetingSecuritySetting.getRoomIds().add(next.getId());
            }
        }
        SecuritySettingManager.m241708a(kVar.mo212161u(), kVar, meetingSecuritySetting, bVar, null, 8, null);
    }
}
