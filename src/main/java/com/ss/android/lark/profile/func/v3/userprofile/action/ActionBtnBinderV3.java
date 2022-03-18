package com.ss.android.lark.profile.func.v3.userprofile.action;

import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData;
import com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency;
import com.ss.android.lark.profile.func.user_profile.base.BaseProfileBinder;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/action/ActionBtnBinderV3;", "Lcom/ss/android/lark/profile/func/user_profile/base/BaseProfileBinder;", "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "Lcom/ss/android/lark/profile/func/user_profile/action/IActionBtnDependency;", "btnDependency", "(Lcom/ss/android/lark/profile/func/user_profile/action/IActionBtnDependency;)V", "binderData", "", "view", "Landroid/view/View;", "dataBtn", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.a */
public final class ActionBtnBinderV3 extends BaseProfileBinder<ActionBtnViewData, IActionBtnDependency> {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.a$a */
    public static final class View$OnClickListenerC52667a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActionBtnBinderV3 f130364a;

        View$OnClickListenerC52667a(ActionBtnBinderV3 aVar) {
            this.f130364a = aVar;
        }

        public final void onClick(View view) {
            ((IActionBtnDependency) this.f130364a.mo179589a()).mo179611b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.a$b */
    public static final class View$OnClickListenerC52668b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActionBtnBinderV3 f130365a;

        View$OnClickListenerC52668b(ActionBtnBinderV3 aVar) {
            this.f130365a = aVar;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204739s();
            ((IActionBtnDependency) this.f130365a.mo179589a()).mo179612c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.a$c */
    public static final class View$OnClickListenerC52669c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActionBtnBinderV3 f130366a;

        View$OnClickListenerC52669c(ActionBtnBinderV3 aVar) {
            this.f130366a = aVar;
        }

        public final void onClick(View view) {
            ((IActionBtnDependency) this.f130366a.mo179589a()).mo179610a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ActionBtnBinderV3(IActionBtnDependency cVar) {
        super(cVar);
        Intrinsics.checkParameterIsNotNull(cVar, "btnDependency");
    }

    /* renamed from: a */
    public void mo179592a(View view, ActionBtnViewData actionBtnViewData) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(actionBtnViewData, "dataBtn");
        if (actionBtnViewData.mo179603b()) {
            TextView textView = (TextView) view.findViewById(R.id.mTipsTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTipsTv");
            textView.setVisibility(0);
            UDButton uDButton = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "view.mFriendRequestBtn");
            uDButton.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.mTipsTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mTipsTv");
        textView2.setVisibility(8);
        UDButton uDButton2 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "view.mFriendRequestBtn");
        uDButton2.setVisibility(0);
        int a = actionBtnViewData.mo179599a();
        if (a == 1) {
            UDButton uDButton3 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton3, "view.mFriendRequestBtn");
            uDButton3.setVisibility(8);
            ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(null);
        } else if (a != 2) {
            if (a == 3) {
                UDButton uDButton4 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(uDButton4, "view.mFriendRequestBtn");
                uDButton4.setVisibility(0);
                ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setText(R.string.Lark_NewContacts_AcceptContactRequestButton);
                ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(new View$OnClickListenerC52667a(this));
            } else if (a != 4) {
                UDButton uDButton5 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(uDButton5, "view.mFriendRequestBtn");
                uDButton5.setVisibility(8);
            } else if (actionBtnViewData.mo179604c()) {
                UDButton uDButton6 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(uDButton6, "view.mFriendRequestBtn");
                uDButton6.setVisibility(0);
                ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setText(R.string.Lark_Contacts_AddToContactCardsButton);
                ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(new View$OnClickListenerC52668b(this));
            } else {
                UDButton uDButton7 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(uDButton7, "view.mFriendRequestBtn");
                uDButton7.setVisibility(0);
                ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setText(R.string.Lark_Legacy_AddContactNow);
                ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(new View$OnClickListenerC52669c(this));
            }
        } else if (actionBtnViewData.mo179604c()) {
            UDButton uDButton8 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton8, "view.mFriendRequestBtn");
            uDButton8.setVisibility(8);
            ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(null);
        } else {
            UDButton uDButton9 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton9, "view.mFriendRequestBtn");
            uDButton9.setVisibility(0);
            ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setText(R.string.Lark_NewContact_ContactRequestSentButton);
            UDButton uDButton10 = (UDButton) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(uDButton10, "view.mFriendRequestBtn");
            uDButton10.setEnabled(false);
            ((UDButton) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(null);
        }
    }
}
