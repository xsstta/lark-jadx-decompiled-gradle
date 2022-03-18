package com.ss.android.lark.mm.module.share.social;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.share.repo.ShareRepo;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ClickButtonEvent;
import com.ss.android.lark.mm.utils.ClipBoardUtil;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ&\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002J\u001e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002J\u001e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002J\u001e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/share/social/SocialPanel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "repoId", "", "getRepoId", "()Ljava/lang/String;", "setRepoId", "(Ljava/lang/String;)V", "bindData", "", "url", "title", "onShare", "Lkotlin/Function0;", "init", "setDarkMode", "isDarkMode", "", "setLark", "setLink", "setMore", "setZijiequan", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SocialPanel extends ConstraintLayout {

    /* renamed from: a */
    private String f118363a;

    /* renamed from: b */
    private HashMap f118364b;

    /* renamed from: a */
    public View mo165243a(int i) {
        if (this.f118364b == null) {
            this.f118364b = new HashMap();
        }
        View view = (View) this.f118364b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118364b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getRepoId() {
        return this.f118363a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/ss/android/lark/mm/module/share/social/SocialPanel$setLark$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.social.SocialPanel$a */
    public static final class C47029a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function0 $onShare$inlined;
        final /* synthetic */ String $title$inlined;
        final /* synthetic */ String $url$inlined;
        final /* synthetic */ SocialPanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47029a(SocialPanel socialPanel, Function0 function0, String str, String str2) {
            super(1);
            this.this$0 = socialPanel;
            this.$onShare$inlined = function0;
            this.$title$inlined = str;
            this.$url$inlined = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("SocialPanel", "more share");
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.this$0.getRepoId());
            if (b != null) {
                new ClickButtonEvent("chat_share", null, null, null, null, null, "header_share", 62, null).mo165436a(b).mo165437a();
                C47083e.m186425a(b.mo165206i(), "vc_minutes_share_click", C47086i.m186432a().mo165422d("chat_share").mo165423e("none").mo165421c());
            }
            this.$onShare$inlined.invoke();
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getShareDepend().mo144663a(this.$title$inlined, this.$url$inlined, "MM", true);
        }
    }

    public final void setRepoId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f118363a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SocialPanel(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186159a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.mm_view_share_social_panel, this);
    }

    public final void setDarkMode(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                ((SocialEntry) childAt).setDarkMode(z);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.share.social.SocialEntry");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mm/module/share/social/SocialPanel$setLink$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.social.SocialPanel$b */
    public static final class View$OnClickListenerC47030b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SocialEntry f118365a;

        /* renamed from: b */
        final /* synthetic */ SocialPanel f118366b;

        /* renamed from: c */
        final /* synthetic */ Function0 f118367c;

        /* renamed from: d */
        final /* synthetic */ String f118368d;

        View$OnClickListenerC47030b(SocialEntry socialEntry, SocialPanel socialPanel, Function0 function0, String str) {
            this.f118365a = socialEntry;
            this.f118366b = socialPanel;
            this.f118367c = function0;
            this.f118368d = str;
        }

        public final void onClick(View view) {
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.f118366b.getRepoId());
            if (b != null) {
                new ClickButtonEvent("copy_link", null, null, null, null, null, "header_share", 62, null).mo165436a(b).mo165437a();
                C47083e.m186425a(b.mo165206i(), "vc_minutes_share_click", C47086i.m186432a().mo165422d("copy_link").mo165423e("none").mo165421c());
            }
            this.f118367c.invoke();
            ClipBoardUtil bVar = ClipBoardUtil.f118606a;
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            bVar.mo165481a(a, this.f118368d);
            Context context = this.f118365a.getContext();
            Context a2 = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmContext.getContext()");
            C45858j.m181678a(context, a2.getResources().getString(R.string.MMWeb_G_LinkCopied));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mm/module/share/social/SocialPanel$setMore$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.social.SocialPanel$c */
    public static final class View$OnClickListenerC47031c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SocialEntry f118369a;

        /* renamed from: b */
        final /* synthetic */ SocialPanel f118370b;

        /* renamed from: c */
        final /* synthetic */ Function0 f118371c;

        /* renamed from: d */
        final /* synthetic */ String f118372d;

        View$OnClickListenerC47031c(SocialEntry socialEntry, SocialPanel socialPanel, Function0 function0, String str) {
            this.f118369a = socialEntry;
            this.f118370b = socialPanel;
            this.f118371c = function0;
            this.f118372d = str;
        }

        public final void onClick(View view) {
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.f118370b.getRepoId());
            if (b != null) {
                new ClickButtonEvent("more_share", null, null, null, null, null, "header_share", 62, null).mo165436a(b).mo165437a();
                C47083e.m186425a(b.mo165206i(), "vc_minutes_share_click", C47086i.m186432a().mo165422d("more_share").mo165423e("none").mo165421c());
            }
            this.f118371c.invoke();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", this.f118372d);
            intent.setType("text/plain");
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
                intent.addFlags(2);
            }
            this.f118369a.getContext().startActivity(Intent.createChooser(intent, ResString.f118656a.mo165504a(R.string.MMWeb_G_Share)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mm/module/share/social/SocialPanel$setZijiequan$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.social.SocialPanel$d */
    public static final class View$OnClickListenerC47032d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SocialEntry f118373a;

        /* renamed from: b */
        final /* synthetic */ SocialPanel f118374b;

        /* renamed from: c */
        final /* synthetic */ Function0 f118375c;

        /* renamed from: d */
        final /* synthetic */ String f118376d;

        View$OnClickListenerC47032d(SocialEntry socialEntry, SocialPanel socialPanel, Function0 function0, String str) {
            this.f118373a = socialEntry;
            this.f118374b = socialPanel;
            this.f118375c = function0;
            this.f118376d = str;
        }

        public final void onClick(View view) {
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.f118374b.getRepoId());
            if (b != null) {
                new ClickButtonEvent("byte_moments_share", null, null, null, null, null, "header_share", 62, null).mo165436a(b).mo165437a();
                C47083e.m186425a(b.mo165206i(), "vc_minutes_share_click", C47086i.m186432a().mo165422d("byte_moments_share").mo165423e("none").mo165421c());
            }
            this.f118375c.invoke();
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
            Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
            IMmDepend a2 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
            a2.getBrowserDepend().mo144660a(this.f118373a.getContext(), "https://" + domainDepend.mo144620e() + "/malaita/?miniPath=pages/publish/root?content=" + "" + '\n' + "" + this.f118376d);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SocialPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186160a(String str, Function0<Unit> function0) {
        SocialEntry socialEntry = (SocialEntry) mo165243a(R.id.entryLink);
        socialEntry.setOnClickListener(new View$OnClickListenerC47030b(socialEntry, this, function0, str));
    }

    /* renamed from: c */
    private final void m186163c(String str, Function0<Unit> function0) {
        SocialEntry socialEntry = (SocialEntry) mo165243a(R.id.entryMore);
        socialEntry.setOnClickListener(new View$OnClickListenerC47031c(socialEntry, this, function0, str));
    }

    /* renamed from: b */
    private final void m186162b(String str, Function0<Unit> function0) {
        SocialEntry socialEntry = (SocialEntry) mo165243a(R.id.entryZijiequan);
        socialEntry.setVisibility(0);
        socialEntry.setOnClickListener(new View$OnClickListenerC47032d(socialEntry, this, function0, str));
    }

    /* renamed from: b */
    private final void m186161b(String str, String str2, Function0<Unit> function0) {
        C47110e.m186573a((SocialEntry) mo165243a(R.id.entryLark), new C47029a(this, function0, str2, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118363a = "";
        m186159a(context);
    }

    /* renamed from: a */
    public final void mo165244a(String str, String str2, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        Intrinsics.checkParameterIsNotNull(function0, "onShare");
        m186161b(str, str2, function0);
        m186160a(str, function0);
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45892r shareDepend = a.getShareDepend();
        Intrinsics.checkExpressionValueIsNotNull(shareDepend, "MmDepend.impl().shareDepend");
        if (shareDepend.mo144664a()) {
            m186162b(str, function0);
        } else {
            int dp2px = UIUtils.dp2px(getContext(), 16.0f);
            setPadding(dp2px, 0, dp2px, 0);
        }
        m186163c(str, function0);
    }
}
