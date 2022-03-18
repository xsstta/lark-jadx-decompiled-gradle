package com.ss.android.lark.guide.biz.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.component.dybrid.router.C24258a;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.TeamUseActivity;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/PageOpener;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.c */
public final class PageOpener {

    /* renamed from: a */
    public static final Companion f99148a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J*\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/PageOpener$Companion;", "", "()V", "TAG", "", "openAddTeamMemberPage", "", "context", "Landroid/content/Context;", "from", "hitFrom", "openInvitePage", "activity", "Landroid/app/Activity;", "openSettingTeamNamePage", "openSettingTeamNamePageByStepInfo", "stepInfoString", "openTeamUsePage", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo141344a(Activity activity, String str) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            C38548a.m152027a().mo141246a(activity, str);
            Log.m165389i("PageOpener", "openInvitePage");
        }

        /* renamed from: a */
        public final void mo141345a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent intent = new Intent(context, TeamUseActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("hit_from", str);
            context.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo141348b(Context context, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "from");
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            C24258a k = a.mo141261k();
            if (k != null) {
                Bundle bundle = new Bundle();
                bundle.putString("from", str);
                bundle.putString("hit_from", str2);
                k.mo86894a(context, "//client/guide/new_onboarding_add_member", bundle);
                Log.m165389i("PageOpener", "openAddTeamMemberPage");
            }
        }

        /* renamed from: a */
        public final void mo141346a(Context context, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "from");
            mo141347a(context, str, str2, "");
        }

        /* renamed from: a */
        public final void mo141347a(Context context, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "from");
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            C24258a k = a.mo141261k();
            if (k != null) {
                Bundle bundle = new Bundle();
                bundle.putString("from", str);
                bundle.putString("hit_from", str2);
                bundle.putString("stepinfo_string", str3);
                k.mo86894a(context, "//client/guide/new_onboarding_setteam", bundle);
                Log.m165389i("PageOpener", "openSettingTeamNamePage");
            }
        }
    }
}
