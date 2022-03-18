package com.ss.android.lark.mm.module.detail.menu;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDInputDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ReviewStatus;
import com.ss.android.lark.mm.module.detail.menu.p2298a.p2300b.C46109a;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.share.SettingDialog;
import com.ss.android.lark.mm.module.share.model.C47008a;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableEditSpeakerTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.widget.MmMenuView;
import com.ss.android.lark.mm.widget.MoreMenuDialog;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0002J&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\bJ\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0002J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u001a\u0010\u001d\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory;", "", "()V", "createCommentMenu", "Lcom/ss/android/lark/mm/module/detail/menu/MmMenu;", "dialog", "Lcom/ss/android/lark/mm/widget/MoreMenuDialog;", "callback", "Lcom/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$IMenuDependency;", "createDeleteMenu", "dependency", "createEditSpeakerMenu", "depend", "createFeelbackMenu", "createMenu", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/detail/menu/MmMenuType;", "url", "", "createMoreDetailsMenu", "createReactionMenu", "createRenameMenu", "createShareMenu", "createTranslateMenu", "deleteConfirm", "", "context", "Landroid/content/Context;", "menuDialog", "onDeleteFailed", "errorMsg", "IMenuDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.menu.a */
public final class MmDetailMenuFactory {

    /* renamed from: a */
    public static final MmDetailMenuFactory f116169a = new MmDetailMenuFactory();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0006H&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0006H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0010H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0010H&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$IMenuDependency;", "", "deleteMm", "", "onData", "Lkotlin/Function1;", "", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "getMmHitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "getToken", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isPageOwner", "", "isRemoteVideoPlayable", "isSwitchCommentOn", "isSwitchReactionOn", "onEditSpeakerCallback", "onRenameEditorCallback", "newName", "onSwitchComment", "isSwitchOn", "onSwitchReaction", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$a */
    public interface IMenuDependency {
        /* renamed from: a */
        void mo161952a(String str);

        /* renamed from: a */
        void mo161953a(Function1<? super String, Unit> function1);

        /* renamed from: a */
        void mo161954a(boolean z);

        /* renamed from: a */
        boolean mo161955a();

        /* renamed from: b */
        void mo161956b(boolean z);

        /* renamed from: b */
        boolean mo161957b();

        /* renamed from: c */
        MmTranslateLangType mo161958c();

        /* renamed from: d */
        MmBaseInfo mo161959d();

        /* renamed from: e */
        C47084f mo161960e();

        /* renamed from: f */
        boolean mo161961f();

        /* renamed from: g */
        String mo161962g();

        /* renamed from: h */
        boolean mo161963h();

        /* renamed from: i */
        void mo161964i();

        /* renamed from: j */
        String mo161965j();
    }

    /* renamed from: a */
    public final void mo161951a(Context context, String str) {
    }

    private MmDetailMenuFactory() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$g */
    public static final class C46093g extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $dependency;
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46093g(MoreMenuDialog fVar, IMenuDependency aVar) {
            super(2);
            this.$dialog = fVar;
            this.$dependency = aVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$createMoreDetailsMenu$1$1$1", "Lcom/ss/android/lark/mm/module/detail/menu/moredetails/view/MoreDetailsDialog$IMmMoreDetailsDependency;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$g$a */
        public static final class C46094a implements C46109a.AbstractC46112a {

            /* renamed from: a */
            final /* synthetic */ C46093g f116171a;

            @Override // com.ss.android.lark.mm.module.detail.menu.p2298a.p2300b.C46109a.AbstractC46112a
            /* renamed from: a */
            public MmBaseInfo mo161972a() {
                return this.f116171a.$dependency.mo161959d();
            }

            @Override // com.ss.android.lark.mm.module.detail.menu.p2298a.p2300b.C46109a.AbstractC46112a
            /* renamed from: b */
            public String mo161973b() {
                return this.f116171a.$dependency.mo161965j();
            }

            C46094a(C46093g gVar) {
                this.f116171a = gVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            FragmentManager supportFragmentManager;
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
            FragmentActivity activity = this.$dialog.getActivity();
            if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                C46109a aVar = new C46109a(new C46094a(this));
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
                aVar.mo5511a(supportFragmentManager, "moreDetails");
            }
            C47083e.m186425a(C47085h.m186430a(this.$dependency.mo161959d()), "vc_minutes_detail_more_click", C47086i.m186432a().mo165422d("more_information").mo165423e("vc_minutes_more_information_view").mo165421c());
            this.$dialog.u_();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$createCommentMenu$1", "Lcom/ss/android/lark/mm/module/detail/menu/OnInitMenuListener;", "onInit", "", "menuView", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$b */
    public static final class C46088b implements OnInitMenuListener {

        /* renamed from: a */
        final /* synthetic */ IMenuDependency f116170a;

        C46088b(IMenuDependency aVar) {
            this.f116170a = aVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.OnInitMenuListener
        /* renamed from: a */
        public void mo161966a(MmMenuView mmMenuView) {
            int i;
            Intrinsics.checkParameterIsNotNull(mmMenuView, "menuView");
            if (this.f116170a.mo161957b()) {
                i = R.string.MMWeb_G_ShowCommentLabelsEnabled;
            } else {
                i = R.string.MMWeb_G_ShowCommentLabelsDisabled;
            }
            mmMenuView.setSubTitle(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$createReactionMenu$1", "Lcom/ss/android/lark/mm/module/detail/menu/OnInitMenuListener;", "onInit", "", "menuView", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$h */
    public static final class C46095h implements OnInitMenuListener {

        /* renamed from: a */
        final /* synthetic */ IMenuDependency f116172a;

        C46095h(IMenuDependency aVar) {
            this.f116172a = aVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.OnInitMenuListener
        /* renamed from: a */
        public void mo161966a(MmMenuView mmMenuView) {
            int i;
            Intrinsics.checkParameterIsNotNull(mmMenuView, "menuView");
            if (this.f116172a.mo161955a()) {
                i = R.string.MMWeb_G_ShowEmojiReactionsEnabled;
            } else {
                i = R.string.MMWeb_G_ShowEmojiReactionsDisabled;
            }
            mmMenuView.setSubTitle(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$j */
    public static final class C46097j extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $callback;
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46097j(IMenuDependency aVar, MoreMenuDialog fVar) {
            super(2);
            this.$callback = aVar;
            this.$dialog = fVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$createRenameMenu$1$1$2", "Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;", "onTextChanged", "", "s", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$j$b */
        public static final class C46099b implements UDInputDialogBuilder.OnTextChangedListener {

            /* renamed from: a */
            final /* synthetic */ C46097j f116175a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f116176b;

            @Override // com.larksuite.component.universe_design.dialog.UDInputDialogBuilder.OnTextChangedListener
            /* renamed from: a */
            public void mo89293a(CharSequence charSequence) {
                this.f116176b.element = (T) String.valueOf(charSequence);
            }

            C46099b(C46097j jVar, Ref.ObjectRef objectRef) {
                this.f116175a = jVar;
                this.f116176b = objectRef;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$createRenameMenu$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$j$a */
        public static final class DialogInterface$OnClickListenerC46098a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C46097j f116173a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f116174b;

            DialogInterface$OnClickListenerC46098a(C46097j jVar, Ref.ObjectRef objectRef) {
                this.f116173a = jVar;
                this.f116174b = objectRef;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                IMenuDependency aVar = this.f116173a.$callback;
                T t = this.f116174b.element;
                if (t == null) {
                    t = "";
                }
                aVar.mo161952a(t);
            }
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) this.$callback.mo161959d().getTopic();
            Context context = this.$dialog.getContext();
            if (context != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                T t = objectRef.element;
                Intrinsics.checkExpressionValueIsNotNull(t, "inputText");
                ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) new UDInputDialogBuilder(context).title(R.string.MMWeb_G_Rename)).titleBold(true)).message(" ")).mo90904b(t).addActionButton(R.id.ud_dialog_btn_primary, R.string.MMWeb_G_Rename, new DialogInterface$OnClickListenerC46098a(this, objectRef))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Cancel, (DialogInterface.OnClickListener) null)).mo90900a(new C46099b(this, objectRef)).show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "menuView", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "isSwitchOn", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$c */
    public static final class C46089c extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $callback;
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46089c(MoreMenuDialog fVar, IMenuDependency aVar) {
            super(2);
            this.$dialog = fVar;
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            JSONObject jSONObject;
            int i;
            Intrinsics.checkParameterIsNotNull(mmMenuView, "menuView");
            Context context = this.$dialog.getContext();
            if (bool != null) {
                jSONObject = C47086i.m186432a().mo165409a("comment_display").mo165415a(bool.booleanValue()).mo165421c();
            } else {
                jSONObject = null;
            }
            C47083e.m186423a(context, "vc_mm_click_button", jSONObject);
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                C47083e.m186423a(this.$dialog.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("comment_display").mo165423e("none").mo165425g("true").mo165421c());
            } else {
                C47083e.m186423a(this.$dialog.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("comment_display").mo165423e("none").mo165425g("false").mo165421c());
            }
            this.$callback.mo161956b(Intrinsics.areEqual((Object) bool, (Object) true));
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                i = R.string.MMWeb_G_ShowCommentLabelsEnabled;
            } else {
                i = R.string.MMWeb_G_ShowCommentLabelsDisabled;
            }
            mmMenuView.setSubTitle(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$d */
    public static final class C46090d extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $dependency;
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46090d(MoreMenuDialog fVar, IMenuDependency aVar) {
            super(2);
            this.$dialog = fVar;
            this.$dependency = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
            C47083e.m186423a(this.$dialog.requireContext(), "vc_minutes_detail_more_click", C47086i.m186432a().mo165422d("delete").mo165423e("vc_minutes_delete_view").mo165421c());
            MmDetailMenuFactory aVar = MmDetailMenuFactory.f116169a;
            Context requireContext = this.$dialog.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "dialog.requireContext()");
            aVar.mo161950a(requireContext, this.$dialog, this.$dependency);
            this.$dialog.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$e */
    public static final class C46091e extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $depend;
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46091e(IMenuDependency aVar, MoreMenuDialog fVar) {
            super(2);
            this.$depend = aVar;
            this.$dialog = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
            MmAppreciableEditSpeakerTracker.m186387a();
            this.$depend.mo161964i();
            this.$dialog.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$f */
    public static final class C46092f extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $depend;
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46092f(IMenuDependency aVar, MoreMenuDialog fVar) {
            super(2);
            this.$depend = aVar;
            this.$dialog = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
            if (this.$depend.mo161961f()) {
                C47083e.m186427a("vc_mm_feedback_page_owner", C47086i.m186432a().mo165413a("token", this.$depend.mo161962g()).mo165421c());
            } else {
                C47083e.m186427a("vc_mm_feedback_page", C47086i.m186432a().mo165413a("token", this.$depend.mo161962g()).mo165421c());
            }
            C47083e.m186427a("vc_minutes_detail_click", C47086i.m186432a().mo165422d("feedback").mo165423e("none").mo165421c());
            this.$dialog.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "menuView", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "isSwitchOn", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$i */
    public static final class C46096i extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $callback;
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46096i(MoreMenuDialog fVar, IMenuDependency aVar) {
            super(2);
            this.$dialog = fVar;
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            JSONObject jSONObject;
            int i;
            Intrinsics.checkParameterIsNotNull(mmMenuView, "menuView");
            Context context = this.$dialog.getContext();
            JSONObject jSONObject2 = null;
            if (bool != null) {
                jSONObject = C47086i.m186432a().mo165409a("reaction_display").mo165415a(bool.booleanValue()).mo165421c();
            } else {
                jSONObject = null;
            }
            C47083e.m186423a(context, "vc_mm_click_button", jSONObject);
            Context context2 = this.$dialog.getContext();
            if (bool != null) {
                bool.booleanValue();
                jSONObject2 = C47086i.m186432a().mo165422d("reaction_display").mo165423e("none").mo165425g(String.valueOf(bool.booleanValue())).mo165421c();
            }
            C47083e.m186423a(context2, "vc_minutes_detail_click", jSONObject2);
            this.$callback.mo161954a(Intrinsics.areEqual((Object) bool, (Object) true));
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                i = R.string.MMWeb_G_ShowEmojiReactionsEnabled;
            } else {
                i = R.string.MMWeb_G_ShowEmojiReactionsDisabled;
            }
            mmMenuView.setSubTitle(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$k */
    public static final class C46100k extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $callback;
        final /* synthetic */ MoreMenuDialog $dialog;
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46100k(MoreMenuDialog fVar, IMenuDependency aVar, String str) {
            super(2);
            this.$dialog = fVar;
            this.$callback = aVar;
            this.$url = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
            if (C45865a.m181718a()) {
                C47083e.m186423a(this.$dialog.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("header_share").mo165421c());
                C47083e.m186423a(this.$dialog.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("header_share").mo165423e("vc_minutes_share_view").mo165421c());
                C47008a aVar = new C47008a();
                aVar.f118311a = this.$callback.mo161962g();
                aVar.f118313c = this.$callback.mo161959d().isOwner();
                aVar.f118314d = this.$url;
                IMmDepend a = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
                Context context = this.$dialog.getContext();
                if (context != null) {
                    hostDepend.mo144629a((AppCompatActivity) context, aVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                }
            } else {
                SettingDialog.Companion aVar2 = SettingDialog.f118277c;
                String str = this.$url;
                C47084f e = this.$callback.mo161960e();
                MmBaseInfo d = this.$callback.mo161959d();
                Context context2 = this.$dialog.getContext();
                if (context2 != null) {
                    SettingDialog.Companion.m186040a(aVar2, str, e, d, (AppCompatActivity) context2, "share", 0, 32, null);
                    C47083e.m186423a(this.$dialog.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("header_share").mo165421c());
                    C47083e.m186423a(this.$dialog.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("header_share").mo165423e("vc_minutes_share_view").mo165421c());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                }
            }
            this.$dialog.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$l */
    public static final class C46101l extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46101l(MoreMenuDialog fVar) {
            super(2);
            this.$dialog = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
            Function0<Unit> g = this.$dialog.mo165771g();
            if (g != null) {
                g.invoke();
            }
            this.$dialog.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$m */
    public static final class C46102m extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ MoreMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46102m(MoreMenuDialog fVar) {
            super(2);
            this.$dialog = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
            Function0<Unit> h = this.$dialog.mo165772h();
            if (h != null) {
                h.invoke();
            }
            this.$dialog.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$n */
    public static final class DialogInterface$OnClickListenerC46103n implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f116177a;

        DialogInterface$OnClickListenerC46103n(Context context) {
            this.f116177a = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C47083e.m186423a(this.f116177a, "vc_mm_click_button", C47086i.m186432a().mo165409a("header_page_delete").mo165413a("action_result", "cancel").mo165421c());
        }
    }

    /* renamed from: c */
    private final MmMenu m182607c(MoreMenuDialog fVar, IMenuDependency aVar) {
        return new MmMenu(R.string.MMWeb_G_Rename, R.drawable.mm_ic_rename_menu, 0, false, false, null, false, new C46097j(aVar, fVar), SmEvents.EVENT_NW, null);
    }

    /* renamed from: e */
    private final MmMenu m182609e(MoreMenuDialog fVar, IMenuDependency aVar) {
        return new MmMenu(R.string.MMWeb_G_EditSpeaker_Menu, R.drawable.ud_icon_edit_outlined, R.color.icon_n1, false, false, null, false, new C46091e(aVar, fVar), SmEvents.EVENT_NW, null);
    }

    /* renamed from: f */
    private final MmMenu m182610f(MoreMenuDialog fVar, IMenuDependency aVar) {
        return new MmMenu(R.string.MMWeb_G_SubmitFeedback, R.drawable.ud_icon_feedback_outlined, R.color.icon_n1, false, false, null, false, new C46092f(aVar, fVar), SmEvents.EVENT_NW, null);
    }

    /* renamed from: g */
    private final MmMenu m182611g(MoreMenuDialog fVar, IMenuDependency aVar) {
        return new MmMenu(R.string.MMWeb_G_Delete, R.drawable.ud_icon_delete_trash_outlined, R.color.icon_n1, false, false, null, false, new C46090d(fVar, aVar), SmEvents.EVENT_NW, null);
    }

    /* renamed from: h */
    private final MmMenu m182612h(MoreMenuDialog fVar, IMenuDependency aVar) {
        return new MmMenu(R.string.MMWeb_G_MoreDetails_MenuTitle, R.drawable.ud_icon_info_outlined, R.color.icon_n1, false, false, null, false, new C46093g(fVar, aVar), SmEvents.EVENT_NW, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a$o */
    public static final class DialogInterface$OnClickListenerC46104o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MoreMenuDialog f116178a;

        /* renamed from: b */
        final /* synthetic */ Context f116179b;

        /* renamed from: c */
        final /* synthetic */ IMenuDependency f116180c;

        DialogInterface$OnClickListenerC46104o(MoreMenuDialog fVar, Context context, IMenuDependency aVar) {
            this.f116178a = fVar;
            this.f116179b = context;
            this.f116180c = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f116178a.mo5513b();
            C47083e.m186423a(this.f116179b, "vc_mm_click_button", C47086i.m186432a().mo165409a("header_page_delete").mo165413a("action_result", "delete").mo165421c());
            this.f116180c.mo161953a(new Function1<String, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.DialogInterface$OnClickListenerC46104o.C461051 */
                final /* synthetic */ DialogInterface$OnClickListenerC46104o this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke(str);
                    return Unit.INSTANCE;
                }

                public final void invoke(String str) {
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(str, "errorMsg");
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        MmDetailMenuFactory.f116169a.mo161951a(this.this$0.f116179b, str);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private final MmMenu m182604a(MoreMenuDialog fVar, IMenuDependency aVar) {
        return new MmMenu(R.string.MMWeb_G_ShowEmojiReactions, R.drawable.ud_icon_emoji_outlined, R.color.icon_n1, true, aVar.mo161955a(), new C46095h(aVar), false, new C46096i(fVar, aVar), 64, null);
    }

    /* renamed from: b */
    private final MmMenu m182606b(MoreMenuDialog fVar, IMenuDependency aVar) {
        return new MmMenu(R.string.MMWeb_G_ShowCommentTags, R.drawable.ud_icon_reply_cn_outlined, R.color.icon_n1, true, aVar.mo161957b(), new C46088b(aVar), false, new C46089c(fVar, aVar), 64, null);
    }

    /* renamed from: d */
    private final MmMenu m182608d(MoreMenuDialog fVar, IMenuDependency aVar) {
        if (aVar.mo161958c() == MmTranslateLangType.DEFAULT) {
            return new MmMenu(R.string.MMWeb_G_Translate, R.drawable.ud_icon_translate_outlined, R.color.icon_n1, false, false, null, false, new C46101l(fVar), SmEvents.EVENT_NW, null);
        }
        return new MmMenu(R.string.MMWeb_G_ExitTranslation, R.drawable.mm_ic_cancel_translate, 0, false, false, null, false, new C46102m(fVar), SmEvents.EVENT_NW, null);
    }

    /* renamed from: a */
    private final MmMenu m182605a(MoreMenuDialog fVar, String str, IMenuDependency aVar) {
        boolean z;
        if (aVar.mo161959d().getReviewStatus() != ReviewStatus.Passed.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return new MmMenu(R.string.MMWeb_G_Share, R.drawable.ud_icon_share_outlined, R.color.icon_n1, false, false, null, z, new C46100k(fVar, aVar, str), 56, null);
    }

    /* renamed from: a */
    public final void mo161950a(Context context, MoreMenuDialog fVar, IMenuDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(fVar, "menuDialog");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).titleBold(true)).title(new ResString.Editor(R.string.MMWeb_G_DeleteQuestion).mo165506a("itemName", aVar.mo161959d().getTopic()).mo165507a())).message(ResString.f118656a.mo165504a(R.string.MMWeb_G_My_DeleteFileName_PopupText))).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.HORIZONTAL)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Cancel, new DialogInterface$OnClickListenerC46103n(context))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_G_Delete).mo90710d(R.color.ud_R500).mo90703a(new DialogInterface$OnClickListenerC46104o(fVar, context, aVar)))).show();
        C47083e.m186423a(context, "vc_minutes_delete_view", (JSONObject) null);
    }

    /* renamed from: a */
    public final MmMenu mo161949a(MmMenuType mmMenuType, MoreMenuDialog fVar, String str, IMenuDependency aVar) {
        Intrinsics.checkParameterIsNotNull(mmMenuType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(fVar, "dialog");
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        switch (C46114b.f116205a[mmMenuType.ordinal()]) {
            case 1:
                return m182604a(fVar, aVar);
            case 2:
                return m182606b(fVar, aVar);
            case 3:
                return m182607c(fVar, aVar);
            case 4:
                return m182605a(fVar, str, aVar);
            case 5:
                return m182608d(fVar, aVar);
            case 6:
                return m182609e(fVar, aVar);
            case 7:
                return m182610f(fVar, aVar);
            case 8:
                return m182611g(fVar, aVar);
            case 9:
                return m182612h(fVar, aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
