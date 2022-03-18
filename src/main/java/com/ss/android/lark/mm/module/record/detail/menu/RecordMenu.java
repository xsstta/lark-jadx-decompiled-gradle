package com.ss.android.lark.mm.module.record.detail.menu;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ReviewStatus;
import com.ss.android.lark.mm.module.detail.menu.MmMenu;
import com.ss.android.lark.mm.module.detail.menu.MmMenuType;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.share.SettingDialog;
import com.ss.android.lark.mm.module.share.model.C47008a;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.RecordingPageClickEvent;
import com.ss.android.lark.mm.widget.MmMenuView;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenu;", "", "()V", "createMenu", "Lcom/ss/android/lark/mm/module/detail/menu/MmMenu;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/detail/menu/MmMenuType;", "dialog", "Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenuDialog;", "url", "", "dependency", "Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenu$IMenuDependency;", "trackContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "createShareMenu", "createTranslateMenu", "depend", "IMenuDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.menu.a */
public final class RecordMenu {

    /* renamed from: a */
    public static final RecordMenu f118091a = new RecordMenu();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenu$IMenuDependency;", "", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getMmHitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.a$a */
    public interface IMenuDependency {
        /* renamed from: a */
        MmBaseInfo mo164713a();

        /* renamed from: b */
        C47084f mo164714b();

        /* renamed from: c */
        MmTranslateLangType mo164715c();
    }

    private RecordMenu() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.a$b */
    public static final class C46905b extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        public static final C46905b INSTANCE = new C46905b();

        C46905b() {
            super(2);
        }

        public final void invoke(MmMenuView mmMenuView, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(mmMenuView, "<anonymous parameter 0>");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MmMenuView mmMenuView, Boolean bool) {
            invoke(mmMenuView, bool);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.a$c */
    public static final class C46906c extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ IMenuDependency $dependency;
        final /* synthetic */ RecordMenuDialog $dialog;
        final /* synthetic */ C47084f $trackContext;
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46906c(C47084f fVar, IMenuDependency aVar, String str, RecordMenuDialog cVar) {
            super(2);
            this.$trackContext = fVar;
            this.$dependency = aVar;
            this.$url = str;
            this.$dialog = cVar;
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
            new RecordingPageClickEvent("header_share", null, null, null, 14, null).mo165435a(this.$trackContext).mo165437a();
            C47083e.m186425a(this.$trackContext, "vc_minutes_recording_click", C47086i.m186432a().mo165422d("header_share").mo165423e("none").mo165421c());
            if (C45865a.m181718a()) {
                C47008a aVar = new C47008a();
                aVar.f118311a = this.$dependency.mo164713a().getObjectToken();
                aVar.f118313c = this.$dependency.mo164713a().isOwner();
                aVar.f118314d = this.$url;
                aVar.f118317g = false;
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
                C47084f b = this.$dependency.mo164714b();
                MmBaseInfo a2 = this.$dependency.mo164713a();
                Context context2 = this.$dialog.getContext();
                if (context2 != null) {
                    aVar2.mo164977a(str, b, a2, (AppCompatActivity) context2, "share", 17);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                }
            }
            this.$dialog.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.a$d */
    public static final class C46907d extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ RecordMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46907d(RecordMenuDialog cVar) {
            super(2);
            this.$dialog = cVar;
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
            Function0<Unit> g = this.$dialog.mo164722g();
            if (g != null) {
                g.invoke();
            }
            this.$dialog.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "<anonymous parameter 1>", "", "invoke", "(Lcom/ss/android/lark/mm/widget/MmMenuView;Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.a$e */
    public static final class C46908e extends Lambda implements Function2<MmMenuView, Boolean, Unit> {
        final /* synthetic */ RecordMenuDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46908e(RecordMenuDialog cVar) {
            super(2);
            this.$dialog = cVar;
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
            Function0<Unit> h = this.$dialog.mo164723h();
            if (h != null) {
                h.invoke();
            }
            this.$dialog.u_();
        }
    }

    /* renamed from: a */
    private final MmMenu m185790a(RecordMenuDialog cVar, IMenuDependency aVar) {
        if (aVar.mo164715c() == MmTranslateLangType.DEFAULT) {
            return new MmMenu(R.string.MMWeb_G_Translate, R.drawable.ud_icon_translate_outlined, R.color.icon_n1, false, false, null, false, new C46907d(cVar), SmEvents.EVENT_NW, null);
        }
        return new MmMenu(R.string.MMWeb_G_ExitTranslation, R.drawable.mm_ic_cancel_translate, 0, false, false, null, false, new C46908e(cVar), SmEvents.EVENT_NW, null);
    }

    /* renamed from: a */
    private final MmMenu m185791a(RecordMenuDialog cVar, String str, IMenuDependency aVar, C47084f fVar) {
        boolean z;
        if (aVar.mo164713a().getReviewStatus() != ReviewStatus.Passed.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return new MmMenu(R.string.MMWeb_G_Share, R.drawable.ud_icon_share_outlined, R.color.icon_n1, false, false, null, z, new C46906c(fVar, aVar, str, cVar), 56, null);
    }

    /* renamed from: a */
    public final MmMenu mo164712a(MmMenuType mmMenuType, RecordMenuDialog cVar, String str, IMenuDependency aVar, C47084f fVar) {
        Intrinsics.checkParameterIsNotNull(mmMenuType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(cVar, "dialog");
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        Intrinsics.checkParameterIsNotNull(fVar, "trackContext");
        int i = C46909b.f118092a[mmMenuType.ordinal()];
        if (i == 1) {
            return m185791a(cVar, str, aVar, fVar);
        }
        if (i != 2) {
            return new MmMenu(0, 0, 0, false, false, null, false, C46905b.INSTANCE, SmEvents.EVENT_NW, null);
        }
        return m185790a(cVar, aVar);
    }
}
