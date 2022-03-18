package com.ss.android.lark.team.picker.upgrade_group;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.picker.TeamPickerViewModel;
import com.ss.android.lark.team.picker.base.BaseTeamPickerPiece;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010\u0011\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/team/picker/upgrade_group/UpgradeGroupPickerPiece;", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerPiece;", "()V", "fetchChatDisposable", "Lio/reactivex/disposables/Disposable;", "checkValid", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatterPickerParamsBuilder", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams$Builder;", "getErrorTitleResId", "", "getPickerCenterCustomTextResId", "getSearchHintResId", "handleDataInner", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "interceptClick", "context", "Landroid/content/Context;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isCheckOwner", "isSupportDepartment", "isSupportMultiple", "isSupportSearchChatter", "isUnsupportedGroupType", "Lkotlin/Pair;", "onDestroy", "showErrorDialog", "tipResId", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UpgradeGroupPickerPiece extends BaseTeamPickerPiece {

    /* renamed from: a */
    private Disposable f137343a;

    /* renamed from: a */
    public int mo189634a() {
        return R.string.Project_MV_UnableToCreateTeamTittle;
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: b */
    public int mo189636b() {
        return R.string.Project_MV_OnlySearchYouAsOwner;
    }

    public boolean bo_() {
        return true;
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    public int bp_() {
        return R.string.Project_MV_ChooseGroupsToast;
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: f */
    public boolean mo189663f() {
        return false;
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: g */
    public boolean mo189664g() {
        return false;
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: h */
    public boolean mo189665h() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "call"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece$a */
    static final class CallableC55677a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ SearchBaseInfo f137344a;

        CallableC55677a(SearchBaseInfo searchBaseInfo) {
            this.f137344a = searchBaseInfo;
        }

        /* renamed from: a */
        public final Chat call() {
            ITeamModuleDependency.IChatDependency c = C55356a.m214819a().mo144124c();
            String id = ((SearchChatInfo) this.f137344a).getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
            return c.mo144145b(id);
        }
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    public void onDestroy() {
        Disposable disposable = this.f137343a;
        if (disposable != null) {
            if (disposable == null) {
                Intrinsics.throwNpe();
            }
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f137343a;
                if (disposable2 == null) {
                    Intrinsics.throwNpe();
                }
                disposable2.dispose();
            }
        }
        super.onDestroy();
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: d */
    public ChatterPickerParams.Builder mo189641d() {
        String str;
        ChatterPickerParams.Builder n = new ChatterPickerParams.Builder().mo183676h(mo189665h()).mo183716m(false).mo183718n(false);
        TeamPickerViewModel e = mo189662e();
        if (e != null) {
            str = e.getChatId();
        } else {
            str = null;
        }
        return n.mo183663b(str).mo183678j(true).mo183730t(false).mo183726r(false).mo183728s(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece$b */
    static final class C55678b<T> implements Consumer<Chat> {

        /* renamed from: a */
        final /* synthetic */ UpgradeGroupPickerPiece f137345a;

        /* renamed from: b */
        final /* synthetic */ SearchBaseInfo f137346b;

        C55678b(UpgradeGroupPickerPiece upgradeGroupPickerPiece, SearchBaseInfo searchBaseInfo) {
            this.f137345a = upgradeGroupPickerPiece;
            this.f137346b = searchBaseInfo;
        }

        /* renamed from: a */
        public final void accept(Chat chat) {
            if ((chat == null || this.f137345a.mo189694a(chat)) && chat != null) {
                this.f137345a.mo189635a((SearchChatInfo) this.f137346b, chat);
            }
        }
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: a */
    public Pair<Boolean, Integer> mo189639a(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        boolean z = false;
        if (!(searchBaseInfo instanceof SearchChatInfo)) {
            return TuplesKt.to(false, 0);
        }
        SearchChatInfo searchChatInfo = (SearchChatInfo) searchBaseInfo;
        if (searchChatInfo.isCrossTenant() || searchChatInfo.isPublic() || searchChatInfo.isSecretChat() || searchChatInfo.isMeeting() || searchChatInfo.isTenant()) {
            z = true;
        }
        return TuplesKt.to(Boolean.valueOf(z), Integer.valueOf((int) R.string.Project_MV_UnableToSelectExternalGroups));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo189694a(com.ss.android.lark.chat.entity.chat.Chat r9) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece.mo189694a(com.ss.android.lark.chat.entity.chat.Chat):boolean");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece$c */
    public static final class DialogInterface$OnClickListenerC55679c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55679c f137347a = new DialogInterface$OnClickListenerC55679c();

        DialogInterface$OnClickListenerC55679c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: a */
    public void mo189635a(SearchChatInfo searchChatInfo, Chat chat) {
        Intrinsics.checkParameterIsNotNull(searchChatInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intent intent = new Intent();
        intent.putExtra("intent_search_info", searchChatInfo);
        mo177185a(-1, intent);
        mo177212z();
    }

    /* renamed from: a */
    public final void mo189693a(int i, ErrorResult errorResult) {
        String str;
        if (errorResult == null || (str = errorResult.getDisplayMsg()) == null) {
            str = C51468a.m199493c(i, mo177180C());
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "errorResult?.displayMsg …tString(requireContext())");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).title(mo189634a())).message(str)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Project_T_OkGotIt, DialogInterface$OnClickListenerC55679c.f137347a)).show();
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: a */
    public boolean mo189661a(Context context, SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!(searchBaseInfo instanceof SearchChatInfo)) {
            return false;
        }
        Disposable disposable = this.f137343a;
        if (disposable != null) {
            if (disposable == null) {
                Intrinsics.throwNpe();
            }
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f137343a;
                if (disposable2 == null) {
                    Intrinsics.throwNpe();
                }
                disposable2.dispose();
            }
        }
        this.f137343a = Observable.fromCallable(new CallableC55677a(searchBaseInfo)).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C55678b(this, searchBaseInfo));
        return true;
    }
}
