package com.ss.android.lark.member_manage.impl.show_member;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.GroupUtils;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45197e;
import com.ss.android.lark.member_manage.impl.show_member.common_group.ShowGroupMemberActivity;
import com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberActivity;
import com.ss.android.lark.member_manage.impl.statistics.PerfGroupMemberMonitor;
import com.ss.android.lark.utils.rxjava.C57865c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/ShowGroupMemberLauncher;", "", "()V", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.a */
public final class ShowGroupMemberLauncher {

    /* renamed from: a */
    public static final Companion f114375a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/ShowGroupMemberLauncher$Companion;", "", "()V", "launcher", "", "activity", "Landroid/app/Activity;", "chatId", "", "isThread", "", "isRemove", "isDisableAction", "startActivity", "intent", "Landroid/content/Intent;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "produce"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.a$a$a */
        public static final class C45186a<T> implements C57865c.AbstractC57873d<T> {

            /* renamed from: a */
            final /* synthetic */ String f114376a;

            C45186a(String str) {
                this.f114376a = str;
            }

            /* renamed from: a */
            public final Chat produce() {
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                return a.getChatDependency().mo143743a(this.f114376a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.a$a$b */
        public static final class C45187b<T> implements C57865c.AbstractC57871b<T> {

            /* renamed from: a */
            final /* synthetic */ Activity f114377a;

            /* renamed from: b */
            final /* synthetic */ String f114378b;

            /* renamed from: c */
            final /* synthetic */ boolean f114379c;

            /* renamed from: d */
            final /* synthetic */ boolean f114380d;

            /* renamed from: e */
            final /* synthetic */ boolean f114381e;

            C45187b(Activity activity, String str, boolean z, boolean z2, boolean z3) {
                this.f114377a = activity;
                this.f114378b = str;
                this.f114379c = z;
                this.f114380d = z2;
                this.f114381e = z3;
            }

            /* renamed from: a */
            public final void consume(Chat chat) {
                Intent intent;
                Intrinsics.checkExpressionValueIsNotNull(chat, "it");
                if (chat.is_department() && GroupUtils.m178040b(chat)) {
                    intent = new Intent(this.f114377a, TeamGroupShowMemberActivity.class);
                } else if (!DesktopUtil.m144301a((Context) this.f114377a)) {
                    intent = new Intent(this.f114377a, ShowGroupMemberActivity.class);
                } else {
                    FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("ShowGroupMemberActivity").mo134930b();
                    C45197e eVar = new C45197e();
                    Bundle bundle = new Bundle();
                    bundle.putString("key_chat_id", this.f114378b);
                    bundle.putBoolean("key_is_thread", this.f114379c);
                    bundle.putInt("key.type", 2);
                    bundle.putBoolean("keu.is.remove", this.f114380d);
                    bundle.putBoolean("key_is_disable_action", this.f114381e);
                    eVar.setArguments(bundle);
                    C36512a.m144041a().mo134762a(eVar, a);
                    intent = null;
                }
                if (intent != null) {
                    ShowGroupMemberLauncher.f114375a.mo159719a(this.f114378b, this.f114379c, intent, this.f114377a, this.f114380d, this.f114381e);
                }
            }
        }

        /* renamed from: a */
        public final void mo159718a(Activity activity, String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            PerfGroupMemberMonitor.m179719a(PerfGroupMemberMonitor.ActionType.SHOW);
            C57865c.m224574a(new C45186a(str), new C45187b(activity, str, z, z2, z3));
        }

        /* renamed from: a */
        public final void mo159719a(String str, boolean z, Intent intent, Activity activity, boolean z2, boolean z3) {
            Bundle bundle = new Bundle();
            bundle.putString("key_chat_id", str);
            bundle.putBoolean("key_is_thread", z);
            bundle.putInt("key.type", 2);
            bundle.putBoolean("keu.is.remove", z2);
            bundle.putBoolean("key_is_disable_action", z3);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, UpdateDialogStatusCode.SHOW);
        }
    }
}
