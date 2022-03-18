package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.personalstatus.PersonalStatus;
import com.ss.android.lark.searchcommon.view.avataritem.userstatus.UserStatusModel;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.UserStatusHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J \u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010 \u001a\u00020\tJ\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\tH\u0002J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006)"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/ChatterBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatterInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "mDisableExternalChatter", "", "onProfileClickListener", "Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;", "getOnProfileClickListener", "()Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;", "setOnProfileClickListener", "(Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;)V", "bindAvatar", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindCustomStatus", "customStatusIconKey", "", "customStatusList", "", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "bindOthers", "position", "", "bindTag", "checkDisable", "disableExternalChatter", "handleChatterProfileCardClick", "isCustomStatusEnabled", "isUnShowUserStatus", "onDisableClickHandler", "openContactProfileChatter", "openContactProfileForSecretP2pChat", "secretP2pChatId", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.h */
public final class ChatterBinder extends CommonBinder<SearchChatterInfo> {

    /* renamed from: b */
    public static final Companion f133633b = new Companion(null);

    /* renamed from: a */
    public final Context f133634a;

    /* renamed from: d */
    private boolean f133635d;

    /* renamed from: e */
    private IOnProfileClickListener f133636e;

    /* renamed from: f */
    private final SearchResultViewAdapter.IOnItemClickHandler f133637f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/ChatterBinder$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final IOnProfileClickListener mo184831b() {
        return this.f133636e;
    }

    /* renamed from: a */
    public boolean mo184823b(SearchChatterInfo searchChatterInfo) {
        Intrinsics.checkParameterIsNotNull(searchChatterInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return this.f133635d && mo184837c(searchChatterInfo);
    }

    /* renamed from: f */
    private final boolean m209523f() {
        return SearchCommonModuleDependency.m208732b().mo102922l();
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.CommonBinder
    public void bk_() {
        LKUIToast.show(this.f133634a, (int) R.string.Lark_Chat_Add_Member_PublicChatAddExternalUser_ErrrorTip);
    }

    /* renamed from: a */
    public final void mo184828a(IOnProfileClickListener oVar) {
        this.f133636e = oVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/ChatterBinder$openContactProfileForSecretP2pChat$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.h$c */
    public static final class C53988c extends UIGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ ChatterBinder f133641a;

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53988c(ChatterBinder hVar) {
            this.f133641a = hVar;
        }

        /* renamed from: a */
        public void onSuccessed(Chat chat) {
            String p2pChatterId;
            if (chat != null && (p2pChatterId = chat.getP2pChatterId()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(p2pChatterId, "data?.getP2pChatterId() ?: return");
                SearchCommonModuleDependency.m208732b().mo102915e(this.f133641a.f133634a, p2pChatterId);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.h$b */
    public static final class View$OnClickListenerC53987b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatterBinder f133638a;

        /* renamed from: b */
        final /* synthetic */ SearchChatterInfo f133639b;

        /* renamed from: c */
        final /* synthetic */ int f133640c;

        View$OnClickListenerC53987b(ChatterBinder hVar, SearchChatterInfo searchChatterInfo, int i) {
            this.f133638a = hVar;
            this.f133639b = searchChatterInfo;
            this.f133640c = i;
        }

        public final void onClick(View view) {
            this.f133638a.mo184826a(this.f133639b, this.f133640c);
            IOnProfileClickListener b = this.f133638a.mo184831b();
            if (b != null) {
                b.mo183633a();
            }
        }
    }

    /* renamed from: b */
    private final boolean m209521b(SearchChatterInfo searchChatterInfo) {
        ChatterDescription chatterDescription = searchChatterInfo.getChatterDescription();
        if (chatterDescription == null) {
            return true;
        }
        if (TextUtils.isEmpty(chatterDescription.description) && chatterDescription.type == ChatterDescription.Type.DEFAULT) {
            return true;
        }
        if (Chatter.ChatterType.BOT != searchChatterInfo.getChatterType() || DesktopUtil.m144301a(this.f133634a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m209522c(SearchChatterInfo searchChatterInfo) {
        if (searchChatterInfo.getChatterType() == Chatter.ChatterType.USER) {
            SearchCommonModuleDependency.m208732b().mo102915e(this.f133634a, searchChatterInfo.getId());
        } else {
            SearchCommonModuleDependency.m208732b().mo102913d(this.f133634a, searchChatterInfo.getId());
        }
    }

    /* renamed from: a */
    public final void mo184829a(boolean z) {
        this.f133635d = z;
    }

    /* renamed from: a */
    private final void m209520a(String str, int i) {
        SearchCommonModuleDependency.m208732b().mo102897a(str, new C53988c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatterBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133634a = context;
        this.f133637f = bVar;
    }

    /* renamed from: a */
    private final void m209518a(ChatterChatViewHolder aVar, String str) {
        if (str != null) {
            aVar.mo184645a().getItem().mo184667a(new PersonalStatus(str));
        } else {
            aVar.mo184645a().getItem().mo184678b();
        }
    }

    /* renamed from: a */
    private final void m209519a(ChatterChatViewHolder aVar, List<Chatter.ChatterCustomStatus> list) {
        Chatter.ChatterCustomStatus a = SearchCommonModuleDependency.m208732b().mo102885a(list);
        if (a != null) {
            aVar.mo184645a().getItem().mo184667a(new PersonalStatus(a.icon_key));
        } else {
            aVar.mo184645a().getItem().mo184678b();
        }
    }

    /* renamed from: a */
    public final void mo184826a(SearchChatterInfo searchChatterInfo, int i) {
        SearchClickReporter.f133152a.mo183815a((SearchBaseInfo) searchChatterInfo);
        if (searchChatterInfo.isP2pCryptoChat()) {
            String p2pChatId = searchChatterInfo.getP2pChatId();
            Intrinsics.checkExpressionValueIsNotNull(p2pChatId, "data.p2pChatId");
            m209520a(p2pChatId, i);
            return;
        }
        m209522c(searchChatterInfo);
    }

    /* renamed from: a */
    public void mo184769a(ChatterChatViewHolder aVar, SearchChatterInfo searchChatterInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchChatterInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        aVar.mo184645a().getItem().mo184662a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(searchChatterInfo.getAvatarId()).mo88962a(searchChatterInfo.getAvatarKey())).mo88967b(searchChatterInfo.getAvatarId())).mo88976k());
    }

    /* renamed from: a */
    public void mo184807b(int i, ChatterChatViewHolder aVar, SearchChatterInfo searchChatterInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchChatterInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LarkNameTag.ChatTagBuilder dVar = new LarkNameTag.ChatTagBuilder(this.f133634a);
        if (mo184837c((SearchBaseInfo) searchChatterInfo)) {
            dVar.mo90037h(true);
        }
        if (Chatter.ChatterType.BOT != searchChatterInfo.getChatterType()) {
            if (!searchChatterInfo.isRegistered()) {
                TextTag.Companion bVar = TextTag.f62987a;
                TextTag.Builder aVar2 = new TextTag.Builder();
                aVar2.mo90143c(R.string.Lark_Legacy_TagUnregistered);
                aVar2.mo90145d(R.color.udtoken_tag_neutral_text_solid);
                aVar2.mo90147e(R.color.udtoken_tag_neutral_bg_solid);
                LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) dVar, aVar2.mo90154l(), false, 2, (Object) null);
            }
            if (!WorkStatus.isInvalid(searchChatterInfo.getWorkStatus())) {
                TextTag.Companion bVar3 = TextTag.f62987a;
                TextTag.Builder aVar3 = new TextTag.Builder();
                aVar3.mo90136a(searchChatterInfo.getWorkStatus().getDisplayTextNoDuration(this.f133634a));
                aVar3.mo90145d(R.color.udtoken_tag_text_s_red);
                aVar3.mo90147e(R.color.udtoken_tag_bg_red);
                LarkNameTag.Builder bVar4 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) dVar, aVar3.mo90154l(), false, 2, (Object) null);
            }
            if (!m209523f()) {
                dVar.mo90042m(searchChatterInfo.isInZenMode());
            }
        } else {
            dVar.mo90036g(true);
        }
        dVar.mo90035f(searchChatterInfo.isP2pCryptoChat());
        dVar.mo90025d(searchChatterInfo.isCrossWithKa());
        aVar.mo184645a().getItem().setTag(dVar);
    }

    /* renamed from: b */
    public void mo184804a(int i, ChatterChatViewHolder aVar, SearchChatterInfo searchChatterInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchChatterInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ImageView imageView = new ImageView(this.f133634a);
        Context context = imageView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_business_card_outlined, UIUtils.getColor(this.f133634a, R.color.icon_n3)));
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        imageView.setOnClickListener(new View$OnClickListenerC53987b(this, searchChatterInfo, i));
        aVar.mo184645a().getItem().mo184659a(imageView);
        if (!m209521b(searchChatterInfo)) {
            ChatterDescription chatterDescription = searchChatterInfo.getChatterDescription();
            UserStatusModel bVar = new UserStatusModel();
            bVar.mo184755a(chatterDescription.description);
            bVar.mo184754a(Integer.valueOf(UIHelper.getColor(R.color.text_placeholder)));
            Context context2 = this.f133634a;
            UserStatusHelper a = UserStatusHelper.m224138a();
            ChatterDescription.Type type = chatterDescription.type;
            Intrinsics.checkExpressionValueIsNotNull(type, "description.type");
            bVar.mo184753a(UIUtils.getDrawable(context2, a.mo195998a(type.getNumber())));
            aVar.mo184645a().getItem().mo184672a(bVar);
        }
        if (!m209523f()) {
            aVar.mo184645a().getItem().mo184678b();
        } else if (searchChatterInfo.getStatusIconKey() != null) {
            m209518a(aVar, searchChatterInfo.getStatusIconKey());
        } else if (searchChatterInfo.getStatusList() != null) {
            List<Chatter.ChatterCustomStatus> statusList = searchChatterInfo.getStatusList();
            Intrinsics.checkExpressionValueIsNotNull(statusList, "data.statusList");
            m209519a(aVar, statusList);
        }
    }
}
