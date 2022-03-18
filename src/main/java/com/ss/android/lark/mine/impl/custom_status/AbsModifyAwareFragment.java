package com.ss.android.lark.mine.impl.custom_status;

import android.content.Context;
import android.content.DialogInterface;
import android.icu.text.BreakIterator;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.AbstractC0203c;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.C1254b;
import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.google.firebase.messaging.Constants;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.AvatarViewData;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.UserStatusAvatarPanelBuilder;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.UserStatusAvatarPanelController;
import com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel;
import com.ss.android.lark.mine.impl.custom_status.model.ModifyStatusState;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u000b\b&\u0018\u0000 :*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u00052\u00020\u0006:\u00049:;<B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0002\u0010\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\r\u0010 \u001a\u00028\u0000H&¢\u0006\u0002\u0010!J\n\u0010\"\u001a\u0004\u0018\u00010#H&J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0016\u0018\u00010%H&J\n\u0010'\u001a\u0004\u0018\u00010\u000eH&J\b\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020)H\u0016J\b\u0010/\u001a\u00020)H\u0016J\b\u00100\u001a\u00020)H\u0004J\"\u00101\u001a\u00020)2\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020504\u0012\u0004\u0012\u00020\u001d03H\u0004J\b\u00106\u001a\u00020)H\u0016J\u0006\u00107\u001a\u00020)J\u0006\u00108\u001a\u00020)R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006="}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment;", "T", "Lcom/ss/android/lark/mine/impl/custom_status/model/AbsModifyAwareViewModel;", "S", "Lcom/ss/android/lark/mine/impl/custom_status/model/ModifyStatusState;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "characterLimitToast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "onBackPressedCallback", "com/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$onBackPressedCallback$1", "Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$onBackPressedCallback$1;", "statusIconKey", "", "getStatusIconKey", "()Ljava/lang/String;", "setStatusIconKey", "(Ljava/lang/String;)V", "getBreakIterator", "Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$IBreakIterator;", "getDisturbSetting", "", "()Ljava/lang/Boolean;", "getIconImageView", "Landroid/widget/ImageView;", "getModifiedTitleInputTextWatcher", "Landroid/text/TextWatcher;", "limit", "", "editText", "Landroid/widget/EditText;", "getModifyAwareViewModel", "()Lcom/ss/android/lark/mine/impl/custom_status/model/AbsModifyAwareViewModel;", "getSaveTextView", "Landroid/widget/TextView;", "getSyncSetting", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "getTitleText", "notifyCharactersLimit", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDetach", "onPause", "popBack", "showAvatarPanel", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarViewData;", "showOnModifiedDialog", "tryLeave", "trySave", "AndroidNBreakIterator", "Companion", "IBreakIterator", "LegacyBreakIterator", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.a */
public abstract class AbsModifyAwareFragment<T extends AbsModifyAwareViewModel<S>, S extends ModifyStatusState<S>> extends BaseFragment implements JackView {

    /* renamed from: a */
    public static final Companion f115050a = new Companion(null);

    /* renamed from: b */
    private UDToastImpl f115051b;

    /* renamed from: c */
    private String f115052c;

    /* renamed from: d */
    private final C45468f f115053d = new C45468f(this, true);

    /* renamed from: e */
    private HashMap f115054e;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bb\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$IBreakIterator;", "", "DONE", "", "getDONE", "()I", "next", "setText", "", "newText", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$c */
    public interface IBreakIterator {
        /* renamed from: a */
        int mo160393a();

        /* renamed from: a */
        void mo160394a(String str);

        /* renamed from: b */
        int mo160395b();
    }

    /* renamed from: a */
    public View mo160322a(int i) {
        if (this.f115054e == null) {
            this.f115054e = new HashMap();
        }
        View view = (View) this.f115054e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f115054e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public abstract ImageView mo160324e();

    /* renamed from: f */
    public abstract String mo160325f();

    /* renamed from: g */
    public abstract TextView mo160326g();

    /* renamed from: h */
    public abstract Boolean mo160327h();

    /* renamed from: i */
    public abstract Map<CustomStatusSyncField, Boolean> mo160328i();

    /* renamed from: j */
    public abstract T mo160329j();

    /* renamed from: o */
    public void mo160330o() {
        HashMap hashMap = this.f115054e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo160330o();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$Companion;", "", "()V", "MAX_CUSTOM_STATUS_LENGTH", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$AndroidNBreakIterator;", "Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$IBreakIterator;", "iterator", "Landroid/icu/text/BreakIterator;", "Lcom/ss/android/lark/mine/impl/custom_status/ICUBreakIterator;", "(Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment;Landroid/icu/text/BreakIterator;)V", "DONE", "", "getDONE", "()I", "next", "setText", "", "newText", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$a */
    public final class AndroidNBreakIterator implements IBreakIterator {

        /* renamed from: a */
        final /* synthetic */ AbsModifyAwareFragment f115055a;

        /* renamed from: b */
        private final BreakIterator f115056b;

        @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment.IBreakIterator
        /* renamed from: a */
        public int mo160393a() {
            return -1;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment.IBreakIterator
        /* renamed from: b */
        public int mo160395b() {
            return this.f115056b.next();
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment.IBreakIterator
        /* renamed from: a */
        public void mo160394a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "newText");
            this.f115056b.setText(str);
        }

        public AndroidNBreakIterator(AbsModifyAwareFragment aVar, BreakIterator breakIterator) {
            Intrinsics.checkParameterIsNotNull(breakIterator, "iterator");
            this.f115055a = aVar;
            this.f115056b = breakIterator;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ AndroidNBreakIterator(com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment r1, android.icu.text.BreakIterator r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            /*
                r0 = this;
                r3 = r3 & 1
                if (r3 == 0) goto L_0x000d
                android.icu.text.BreakIterator r2 = android.icu.text.BreakIterator.getCharacterInstance()
                java.lang.String r3 = "ICUBreakIterator.getCharacterInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            L_0x000d:
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment.AndroidNBreakIterator.<init>(com.ss.android.lark.mine.impl.custom_status.a, android.icu.text.BreakIterator, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$LegacyBreakIterator;", "Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$IBreakIterator;", "iterator", "Ljava/text/BreakIterator;", "(Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment;Ljava/text/BreakIterator;)V", "DONE", "", "getDONE", "()I", "next", "setText", "", "newText", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$d */
    public final class LegacyBreakIterator implements IBreakIterator {

        /* renamed from: a */
        final /* synthetic */ AbsModifyAwareFragment f115057a;

        /* renamed from: b */
        private final java.text.BreakIterator f115058b;

        @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment.IBreakIterator
        /* renamed from: a */
        public int mo160393a() {
            return -1;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment.IBreakIterator
        /* renamed from: b */
        public int mo160395b() {
            return this.f115058b.next();
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment.IBreakIterator
        /* renamed from: a */
        public void mo160394a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "newText");
            this.f115058b.setText(str);
        }

        public LegacyBreakIterator(AbsModifyAwareFragment aVar, java.text.BreakIterator breakIterator) {
            Intrinsics.checkParameterIsNotNull(breakIterator, "iterator");
            this.f115057a = aVar;
            this.f115058b = breakIterator;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ LegacyBreakIterator(com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment r1, java.text.BreakIterator r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            /*
                r0 = this;
                r3 = r3 & 1
                if (r3 == 0) goto L_0x000d
                java.text.BreakIterator r2 = java.text.BreakIterator.getCharacterInstance()
                java.lang.String r3 = "BreakIterator.getCharacterInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            L_0x000d:
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment.LegacyBreakIterator.<init>(com.ss.android.lark.mine.impl.custom_status.a, java.text.BreakIterator, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$onBackPressedCallback$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$f */
    public static final class C45468f extends AbstractC0203c {

        /* renamed from: a */
        final /* synthetic */ AbsModifyAwareFragment f115063a;

        @Override // androidx.activity.AbstractC0203c
        public void handleOnBackPressed() {
            this.f115063a.mo160390l();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45468f(AbsModifyAwareFragment aVar, boolean z) {
            super(z);
            this.f115063a = aVar;
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/mine/impl/custom_status/model/AbsModifyAwareViewModel;", "S", "Lcom/ss/android/lark/mine/impl/custom_status/model/ModifyStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$i */
    public static final class C45471i extends Lambda implements Function0<Unit> {
        final /* synthetic */ AbsModifyAwareFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45471i(AbsModifyAwareFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo160389k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo160387c() {
        if (isAdded()) {
            C1254b.m5698a(this).mo6337b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        UDToastImpl dVar = this.f115051b;
        if (dVar != null) {
            dVar.cancel();
        }
        this.f115051b = null;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f115053d.setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        UDToastImpl dVar = this.f115051b;
        if (dVar != null) {
            dVar.cancel();
        }
        this.f115051b = null;
    }

    /* renamed from: d */
    public final IBreakIterator mo160388d() {
        IBreakIterator cVar;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new AndroidNBreakIterator(this, null, 1, null);
        } else {
            cVar = new LegacyBreakIterator(this, null, 1, null);
        }
        return cVar;
    }

    /* renamed from: l */
    public final void mo160390l() {
        mo160329j().tryLeave(mo160325f(), this.f115052c, mo160327h(), mo160328i(), new C45471i(this));
    }

    /* renamed from: m */
    public final void mo160391m() {
        mo160329j().trySave(mo160325f(), this.f115052c, mo160327h(), mo160328i());
    }

    /* renamed from: n */
    public final void mo160392n() {
        if (this.f115051b == null) {
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            this.f115051b = UDToast.makeToast(context, (int) R.string.Lark_Profile_CharactersLimit);
        }
        UDToastImpl dVar = this.f115051b;
        if (dVar != null && !dVar.mo91668c()) {
            dVar.show();
            UserCustomStatusHitPoint.f115066a.mo160428g();
        }
    }

    /* renamed from: k */
    public void mo160389k() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        String string = UIHelper.getString(R.string.Lark_Profile_Exit);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Profile_Exit)");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).title(R.string.Lark_Profile_ExitEditDesc)).mo90873b(CollectionsKt.listOf(new UDBaseListDialogBuilder.ListItemBuilder(string).mo90888b(R.color.function_danger_500).mo90889c()))).mo90869a(new C45470h(this))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Profile_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo160385a(String str) {
        this.f115052c = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$showAvatarPanel$2", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$OnAvatarItemClickListener;", "onAvatarItemClick", "", "iconKey", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$g */
    public static final class C45469g implements UserStatusAvatarPanelController.OnAvatarItemClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsModifyAwareFragment f115064a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45469g(AbsModifyAwareFragment aVar) {
            this.f115064a = aVar;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.emoji_panel.UserStatusAvatarPanelController.OnAvatarItemClickListener
        /* renamed from: a */
        public void mo160399a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "iconKey");
            this.f115064a.mo160385a(str);
            C52977a.m205190a().mo180995a(this.f115064a.mo160324e(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$showOnModifiedDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$h */
    public static final class C45470h implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsModifyAwareFragment f115065a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45470h(AbsModifyAwareFragment aVar) {
            this.f115065a = aVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f115065a.mo160387c();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f115053d.setEnabled(true);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        requireActivity.getOnBackPressedDispatcher().addCallback(this, this.f115053d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J*\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment$getModifiedTitleInputTextWatcher$1", "Landroid/text/TextWatcher;", "realLimit", "", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "onTextChanged", "before", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.a$e */
    public static final class C45467e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AbsModifyAwareFragment f115059a;

        /* renamed from: b */
        final /* synthetic */ EditText f115060b;

        /* renamed from: c */
        final /* synthetic */ int f115061c;

        /* renamed from: d */
        private final int f115062d;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    TextView g = this.f115059a.mo160326g();
                    if (g != null) {
                        g.setTextColor(UIHelper.getColor(R.color.primary_pri_500));
                    }
                } else {
                    TextView g2 = this.f115059a.mo160326g();
                    if (g2 != null) {
                        g2.setTextColor(UIHelper.getColor(R.color.text_disable));
                    }
                }
                String obj = editable.toString();
                IBreakIterator d = this.f115059a.mo160388d();
                d.mo160394a(obj);
                int i2 = 0;
                int i3 = 0;
                for (int b = d.mo160395b(); b != d.mo160393a(); b = d.mo160395b()) {
                    if (i2 + 1 != b || obj.charAt(i2) >= 127) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    i3 += i;
                    if (i3 > this.f115062d) {
                        this.f115059a.mo160392n();
                        EditText editText = this.f115060b;
                        editText.setText(editable.subSequence(0, i2));
                        editText.setSelection(i2);
                        return;
                    }
                    i2 = b;
                }
            }
        }

        C45467e(AbsModifyAwareFragment aVar, EditText editText, int i) {
            this.f115059a = aVar;
            this.f115060b = editText;
            this.f115061c = i;
            this.f115062d = i * 2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo160386a(Pair<? extends List<AvatarViewData>, Integer> pair) {
        View view;
        Intrinsics.checkParameterIsNotNull(pair, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Object systemService = this.mContext.getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (!(inputMethodManager == null || (view = getView()) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        ((UserStatusAvatarPanelBuilder) ((UserStatusAvatarPanelBuilder) ((UserStatusAvatarPanelBuilder) ((UserStatusAvatarPanelBuilder) new UserStatusAvatarPanelBuilder(context).width(1.0f)).height(0.7f)).marginInDp(0)).gravity(80)).mo160448a(new C45469g(this)).mo160447a(pair.getSecond().intValue()).mo160449a((List) pair.getFirst()).show();
    }

    /* renamed from: a */
    public final TextWatcher mo160384a(int i, EditText editText) {
        Intrinsics.checkParameterIsNotNull(editText, "editText");
        return new C45467e(this, editText, i);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }
}
