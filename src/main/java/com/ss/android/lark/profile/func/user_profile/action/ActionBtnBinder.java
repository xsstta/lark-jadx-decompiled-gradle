package com.ss.android.lark.profile.func.user_profile.action;

import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.user_profile.base.BaseProfileBinder;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnBinder;", "Lcom/ss/android/lark/profile/func/user_profile/base/BaseProfileBinder;", "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "Lcom/ss/android/lark/profile/func/user_profile/action/IActionBtnDependency;", "btnDependency", "(Lcom/ss/android/lark/profile/func/user_profile/action/IActionBtnDependency;)V", "binderData", "", "view", "Landroid/view/View;", "dataBtn", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.action.a */
public final class ActionBtnBinder extends BaseProfileBinder<ActionBtnViewData, IActionBtnDependency> {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.action.a$a */
    public static final class View$OnClickListenerC52554a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActionBtnBinder f130046a;

        View$OnClickListenerC52554a(ActionBtnBinder aVar) {
            this.f130046a = aVar;
        }

        public final void onClick(View view) {
            ((IActionBtnDependency) this.f130046a.mo179589a()).mo179611b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.action.a$b */
    public static final class View$OnClickListenerC52555b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActionBtnBinder f130047a;

        View$OnClickListenerC52555b(ActionBtnBinder aVar) {
            this.f130047a = aVar;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204739s();
            ((IActionBtnDependency) this.f130047a.mo179589a()).mo179612c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.action.a$c */
    public static final class View$OnClickListenerC52556c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActionBtnBinder f130048a;

        View$OnClickListenerC52556c(ActionBtnBinder aVar) {
            this.f130048a = aVar;
        }

        public final void onClick(View view) {
            ((IActionBtnDependency) this.f130048a.mo179589a()).mo179610a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionBtnBinder(IActionBtnDependency cVar) {
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
            TextView textView2 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mFriendRequestBtn");
            textView2.setVisibility(8);
            return;
        }
        TextView textView3 = (TextView) view.findViewById(R.id.mTipsTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "view.mTipsTv");
        textView3.setVisibility(8);
        TextView textView4 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "view.mFriendRequestBtn");
        textView4.setVisibility(0);
        int a = actionBtnViewData.mo179599a();
        if (a == 1) {
            TextView textView5 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "view.mFriendRequestBtn");
            textView5.setVisibility(8);
            ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(null);
        } else if (a != 2) {
            if (a == 3) {
                TextView textView6 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "view.mFriendRequestBtn");
                textView6.setVisibility(0);
                ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setText(R.string.Lark_NewContacts_AcceptContactRequestButton);
                ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(new View$OnClickListenerC52554a(this));
                TextView textView7 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "view.mFriendRequestBtn");
                textView7.setBackground(UIHelper.getDrawable(R.drawable.contacts_friend_request_btn_bg));
            } else if (a != 4) {
                TextView textView8 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "view.mFriendRequestBtn");
                textView8.setVisibility(8);
            } else if (actionBtnViewData.mo179604c()) {
                TextView textView9 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(textView9, "view.mFriendRequestBtn");
                textView9.setVisibility(0);
                ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setText(R.string.Lark_Contacts_AddToContactCardsButton);
                TextView textView10 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(textView10, "view.mFriendRequestBtn");
                textView10.setBackground(UIHelper.getDrawable(R.drawable.contacts_friend_request_btn_bg));
                ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(new View$OnClickListenerC52555b(this));
            } else {
                TextView textView11 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(textView11, "view.mFriendRequestBtn");
                textView11.setVisibility(0);
                ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setText(R.string.Lark_Legacy_AddContactNow);
                TextView textView12 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
                Intrinsics.checkExpressionValueIsNotNull(textView12, "view.mFriendRequestBtn");
                textView12.setBackground(UIHelper.getDrawable(R.drawable.contacts_friend_request_btn_bg));
                ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(new View$OnClickListenerC52556c(this));
            }
        } else if (actionBtnViewData.mo179604c()) {
            TextView textView13 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView13, "view.mFriendRequestBtn");
            textView13.setVisibility(8);
            ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(null);
        } else {
            TextView textView14 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView14, "view.mFriendRequestBtn");
            textView14.setVisibility(0);
            ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setText(R.string.Lark_NewContact_ContactRequestSentButton);
            TextView textView15 = (TextView) view.findViewById(R.id.mFriendRequestBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView15, "view.mFriendRequestBtn");
            textView15.setBackground(UIHelper.getDrawable(R.drawable.contacts_friend_request_btn_bg_alpha_60));
            ((TextView) view.findViewById(R.id.mFriendRequestBtn)).setOnClickListener(null);
        }
    }
}
