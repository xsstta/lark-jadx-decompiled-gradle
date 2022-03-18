package com.ss.android.lark.invitation.v2.feat.external.guide;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.inv.export.util.C40111j;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/guide/InviteExternalGuideFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "isClickStartAdd", "", "()Z", "setClickStartAdd", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.guide.a */
public final class InviteExternalGuideFragment extends C40098a {

    /* renamed from: a */
    public static final int f102296a = R.id.UiMessageExternalGuideCloseAction;

    /* renamed from: b */
    public static final Companion f102297b = new Companion(null);

    /* renamed from: c */
    private String f102298c;

    /* renamed from: d */
    private boolean f102299d;

    /* renamed from: e */
    private HashMap f102300e;

    /* renamed from: a */
    public View mo146009a(int i) {
        if (this.f102300e == null) {
            this.f102300e = new HashMap();
        }
        View view = (View) this.f102300e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102300e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo146012b() {
        HashMap hashMap = this.f102300e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo146012b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/guide/InviteExternalGuideFragment$Companion;", "", "()V", "UI_MESSAGE_EXTERNAL_GUIDE_CLOSE_ACTION", "", "getUI_MESSAGE_EXTERNAL_GUIDE_CLOSE_ACTION", "()I", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/external/guide/InviteExternalGuideFragment;", "args", "Landroid/os/Bundle;", "registerUiMessageExternalGuideCloseAction", "", "activity", "Landroid/app/Activity;", "unregisterUiMessageExternalGuideCloseAction", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.guide.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo146013a() {
            return InviteExternalGuideFragment.f102296a;
        }

        /* renamed from: b */
        public final void mo146016b() {
            C57783ah.m224245a().mo196094b(mo146013a());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/utils/UiMessageUtils$UiMessage;", "handleMessage"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.guide.a$a$a */
        static final class C40256a implements C57783ah.AbstractC57787c {

            /* renamed from: a */
            final /* synthetic */ Activity f102301a;

            C40256a(Activity activity) {
                this.f102301a = activity;
            }

            @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
            public final void handleMessage(C57783ah.C57786b bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "it");
                Activity activity = this.f102301a;
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        /* renamed from: a */
        public final InviteExternalGuideFragment mo146014a(Bundle bundle) {
            InviteExternalGuideFragment aVar = new InviteExternalGuideFragment();
            aVar.setArguments(bundle);
            return aVar;
        }

        /* renamed from: a */
        public final void mo146015a(Activity activity) {
            C57783ah.m224245a().mo196092a(mo146013a(), (C57783ah.AbstractC57787c) new C40256a(activity));
        }
    }

    /* renamed from: a */
    public final String mo146010a() {
        return this.f102298c;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.inv.export.ui.C40098a
    public void onDestroy() {
        super.onDestroy();
        InvHitPoint.ab(this.f102298c);
    }

    /* renamed from: a */
    public final void mo146011a(boolean z) {
        this.f102299d = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.guide.a$b */
    static final class View$OnClickListenerC40257b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteExternalGuideFragment f102302a;

        View$OnClickListenerC40257b(InviteExternalGuideFragment aVar) {
            this.f102302a = aVar;
        }

        public final void onClick(View view) {
            this.f102302a.mo146011a(true);
            this.f102302a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.guide.a$c */
    static final class View$OnClickListenerC40258c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteExternalGuideFragment f102303a;

        View$OnClickListenerC40258c(InviteExternalGuideFragment aVar) {
            this.f102303a = aVar;
        }

        public final void onClick(View view) {
            InvHitPoint.ag(this.f102303a.mo146010a());
            C57783ah.m224245a().mo196091a(InviteExternalGuideFragment.f102297b.mo146013a());
            ViewUtils.m224149a(new Runnable(this) {
                /* class com.ss.android.lark.invitation.v2.feat.external.guide.InviteExternalGuideFragment.View$OnClickListenerC40258c.RunnableC402591 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC40258c f102304a;

                {
                    this.f102304a = r1;
                }

                public final void run() {
                    this.f102304a.f102303a.finish();
                }
            }, 300);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from_scenes");
        } else {
            str = null;
        }
        this.f102298c = str;
        TextView textView = (TextView) mo146009a(R.id.iegTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "iegTipTv");
        textView.setText(C40111j.m159027a(UIHelper.getString(R.string.Lark_Guide_ExternalContactsPopupContent)));
        ((TextView) mo146009a(R.id.iegStartAddTv)).setOnClickListener(new View$OnClickListenerC40257b(this));
        InvHitPoint.aa(this.f102298c);
        ((CommonTitleBar) mo146009a(R.id.iegTitleBar)).setLeftClickListener(new View$OnClickListenerC40258c(this));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return LayoutInflater.from(getContext()).inflate(R.layout.inv_invite_external_view_guide, viewGroup, false);
    }
}
