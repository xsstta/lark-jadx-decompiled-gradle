package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.assigntime.AssignTimeModel;
import com.ss.android.lark.searchcommon.view.avataritem.subtitle.SubtitleModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\t\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J \u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/MessageBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchMessageInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "messageViewInChat", "com/ss/android/lark/searchcommon/view/binder/MessageBinder$messageViewInChat$1", "Lcom/ss/android/lark/searchcommon/view/binder/MessageBinder$messageViewInChat$1;", "bindAvatar", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindOthers", "position", "", "bindSubTitle", "bindSummary", "bindTitle", "isSelectable", "", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.t */
public final class MessageBinder extends CommonBinder<SearchMessageInfo> {

    /* renamed from: d */
    public static final Companion f133679d = new Companion(null);

    /* renamed from: a */
    public final C54000c f133680a = new C54000c();

    /* renamed from: b */
    public final Context f133681b;

    /* renamed from: e */
    private final SearchResultViewAdapter.IOnItemClickHandler f133682e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/MessageBinder$Companion;", "", "()V", "DOC_ICON_TAG", "", "DOC_ICON_TYPE", "TAG", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.t$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/MessageBinder$messageViewInChat$1", "Lcom/ss/android/lark/searchcommon/view/binder/ViewInChatClickListener;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchMessageInfo;", "getChatId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getChatPosition", "", "getThreadId", "getThreadPosition", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.t$c */
    public static final class C54000c extends ViewInChatClickListener<SearchMessageInfo> {
        C54000c() {
        }

        /* renamed from: a */
        public String mo184771a(SearchMessageInfo searchMessageInfo) {
            Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return searchMessageInfo.getThreadId();
        }

        /* renamed from: b */
        public String mo184773b(SearchMessageInfo searchMessageInfo) {
            Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return searchMessageInfo.getChatId();
        }

        /* renamed from: c */
        public int mo184774c(SearchMessageInfo searchMessageInfo) {
            Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return searchMessageInfo.getMessageThreadPosition();
        }

        /* renamed from: d */
        public int mo184775d(SearchMessageInfo searchMessageInfo) {
            Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return searchMessageInfo.getPosition();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.t$b */
    public static final class View$OnClickListenerC53999b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageBinder f133683a;

        /* renamed from: b */
        final /* synthetic */ SearchMessageInfo f133684b;

        /* renamed from: c */
        final /* synthetic */ int f133685c;

        View$OnClickListenerC53999b(MessageBinder tVar, SearchMessageInfo searchMessageInfo, int i) {
            this.f133683a = tVar;
            this.f133684b = searchMessageInfo;
            this.f133685c = i;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f133683a.f133681b);
            this.f133683a.f133680a.mo184772a(this.f133684b, this.f133685c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133681b = context;
        this.f133682e = bVar;
    }

    /* renamed from: b */
    public void mo184805a(SearchMessageInfo searchMessageInfo, ChatterChatViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.mo184805a((SearchBaseInfo) searchMessageInfo, aVar);
        aVar.mo184645a().getItem().mo184679b(12);
        if (searchMessageInfo.isChatInsideShow() && searchMessageInfo.isBinderByFile()) {
            aVar.mo184645a().getItem().mo184679b(16);
        }
    }

    /* renamed from: a */
    public void mo184808b(SearchMessageInfo searchMessageInfo, ChatterChatViewHolder aVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (searchMessageInfo.isBinderByFile()) {
            SubtitleModel aVar2 = new SubtitleModel(searchMessageInfo.getSubTitle() + " " + SearchCommonUtils.m209227a(this.f133681b, searchMessageInfo.getCreateTime(), true));
            aVar2.mo184720a(mo184848a(searchMessageInfo.getSubTitleHitTerms()));
            aVar.mo184645a().getItem().mo184668a(aVar2);
            return;
        }
        if (searchMessageInfo.getTypeInfoList() != null) {
            List<SearchMessageInfo.C53895a> typeInfoList = searchMessageInfo.getTypeInfoList();
            Intrinsics.checkExpressionValueIsNotNull(typeInfoList, "data.typeInfoList");
            if (!typeInfoList.isEmpty()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(searchMessageInfo.getSubTitle());
                List<SearchBaseInfo.C53894a> subTitleRenderInfo = searchMessageInfo.getSubTitleRenderInfo();
                Intrinsics.checkExpressionValueIsNotNull(subTitleRenderInfo, "data.subTitleRenderInfo");
                for (T t : subTitleRenderInfo) {
                    int length = t.f133185b + t.f133184a.length();
                    if (t.f133185b >= 0 && length <= searchMessageInfo.getSubTitle().length()) {
                        String subTitle = searchMessageInfo.getSubTitle();
                        Intrinsics.checkExpressionValueIsNotNull(subTitle, "data.subTitle");
                        int i2 = t.f133185b;
                        if (subTitle != null) {
                            String substring = subTitle.substring(i2, length);
                            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            if (!(!Intrinsics.areEqual(substring, t.f133184a))) {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(UIHelper.getColor(t.f133186c)), t.f133185b, length, 33);
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                List<SearchMessageInfo.C53895a> typeInfoList2 = searchMessageInfo.getTypeInfoList();
                Intrinsics.checkExpressionValueIsNotNull(typeInfoList2, "data.typeInfoList");
                for (T t2 : typeInfoList2) {
                    Intrinsics.checkExpressionValueIsNotNull(t2, "info");
                    if (t2.mo184203c() >= 0 && t2.mo184203c() <= searchMessageInfo.getSubTitle().length()) {
                        C58508e.C58510a b = new C58508e.C58510a(this.f133681b, new C58508e.C58511b("$")).mo198336a("").mo198338b((int) aVar.mo184645a().getItem().mo184688g());
                        if (Intrinsics.areEqual(t2.mo184202b(), "grey")) {
                            i = SearchCommonModuleDependency.m208732b().mo102903b(t2.mo184201a());
                        } else {
                            i = SearchCommonModuleDependency.m208732b().mo102883a(t2.mo184201a());
                        }
                        C58508e.C58510a a = b.mo198333a(i);
                        spannableStringBuilder.insert(t2.mo184203c(), (CharSequence) "$");
                        spannableStringBuilder.setSpan(a.mo198337a(), t2.mo184203c(), t2.mo184203c() + 1, 33);
                    }
                }
                SubtitleModel aVar3 = new SubtitleModel(spannableStringBuilder);
                aVar3.mo184720a(mo184848a(searchMessageInfo.getSubTitleHitTerms()));
                aVar.mo184645a().getItem().mo184668a(aVar3);
                return;
            }
        }
        super.mo184808b((SearchBaseInfo) searchMessageInfo, aVar);
    }

    /* renamed from: a */
    public void mo184769a(ChatterChatViewHolder aVar, SearchMessageInfo searchMessageInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        aVar.mo184645a().getItem().mo184658a(48.0f);
        aVar.mo184645a().getItem().mo184684c(true);
        if (!searchMessageInfo.isChatInsideShow()) {
            aVar.mo184645a().getItem().mo184662a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88962a(searchMessageInfo.getAvatarKey())).mo89081c(searchMessageInfo.getAvatarId(0)).mo88967b(searchMessageInfo.getAvatarId(0))).mo88976k());
            aVar.mo184645a().getItem().mo184660a((MiniIconModel) null);
        } else if (searchMessageInfo.isBinderByFile()) {
            aVar.mo184645a().getItem().mo184658a(40.0f);
            aVar.mo184645a().getItem().mo184684c(false);
            FileContent fileContent = searchMessageInfo.getFileContent();
            FolderContent folderContent = searchMessageInfo.getFolderContent();
            if (fileContent != null) {
                aVar.mo184645a().getItem().mo184662a(((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88957a(C57881t.m224626c(fileContent.getMime(), fileContent.getName()))).mo88976k());
                if (fileContent.isLanTransfer()) {
                    aVar.mo184645a().getItem().mo184660a(new MiniIconModel(AvatarType.UNKNOWN, this.f133681b.getDrawable(R.drawable.ic_icon_file_lan_trans)));
                } else {
                    aVar.mo184645a().getItem().mo184660a((MiniIconModel) null);
                }
            } else if (folderContent != null) {
                aVar.mo184645a().getItem().mo184662a(((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88957a(C57881t.m224622b("", folderContent.getName(), true))).mo88976k());
                if (folderContent.isLanTransfer()) {
                    aVar.mo184645a().getItem().mo184660a(new MiniIconModel(AvatarType.UNKNOWN, this.f133681b.getDrawable(R.drawable.ic_icon_file_lan_trans)));
                } else {
                    aVar.mo184645a().getItem().mo184660a((MiniIconModel) null);
                }
            } else {
                Log.m165383e("LarkSearch.Common.MessageBinder", "all is null!");
            }
        } else {
            aVar.mo184645a().getItem().mo184662a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88962a(searchMessageInfo.getFromAvatarKey())).mo89081c(searchMessageInfo.getAvatarId(1)).mo88967b(searchMessageInfo.getAvatarId(1))).mo88976k());
            aVar.mo184645a().getItem().mo184660a((MiniIconModel) null);
        }
    }

    /* renamed from: a */
    public void mo184804a(int i, ChatterChatViewHolder aVar, SearchMessageInfo searchMessageInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (searchMessageInfo.isBinderByFile()) {
            ImageView imageView = new ImageView(this.f133681b);
            Context context = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_viewinchat_outlined, imageView.getResources().getColor(R.color.icon_n2)));
            imageView.setLayoutParams(new ViewGroup.LayoutParams(C57582a.m223600a(20), C57582a.m223600a(20)));
            imageView.setOnClickListener(new View$OnClickListenerC53999b(this, searchMessageInfo, i));
            aVar.mo184645a().getItem().mo184659a(imageView);
            return;
        }
        aVar.mo184645a().getItem().mo184664a(new AssignTimeModel(SearchCommonUtils.m209227a(this.f133681b, searchMessageInfo.getCreateTime(), true)));
    }

    /* renamed from: a */
    public void mo184851a(SearchMessageInfo searchMessageInfo, ChatterChatViewHolder aVar, boolean z) {
        String str;
        boolean z2;
        TitleModel bVar;
        Intrinsics.checkParameterIsNotNull(searchMessageInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (!searchMessageInfo.isChatInsideShow()) {
            super.mo184851a((SearchBaseInfo) searchMessageInfo, aVar, z);
        } else if (searchMessageInfo.isBinderByFile()) {
            List<String> titleHitTerms = searchMessageInfo.getTitleHitTerms();
            if (titleHitTerms == null || titleHitTerms.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                bVar = new TitleModel(searchMessageInfo.getTitle(), false, null, 0, 14, null);
            } else {
                bVar = new TitleModel(searchMessageInfo.getTitle(), z, mo184848a(searchMessageInfo.getTitleHitTerms()), 0, 8, null);
            }
            aVar.mo184645a().getItem().mo184670a(bVar);
        } else {
            AvatarItemView item = aVar.mo184645a().getItem();
            if (TextUtils.isEmpty(searchMessageInfo.getFromName())) {
                str = searchMessageInfo.getTitle();
            } else {
                str = searchMessageInfo.getFromName();
            }
            item.mo184670a(new TitleModel(str, false, null, 0, 14, null));
        }
    }
}
