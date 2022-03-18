package com.ss.android.vc.meeting.module.follow.agent;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.C63742at;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/agent/FollowExternalPermsViewControl;", "Lcom/ss/android/vc/meeting/module/follow/agent/BaseFollowViewControl;", "Lcom/ss/android/vc/meeting/module/follow/agent/IFollowExternalPermsViewControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "container", "Landroid/view/View;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Landroid/view/View;)V", "mContentView", "Landroid/widget/TextView;", "mExternalTips", "mIconClose", "Lcom/ss/android/vc/common/widget/IconFontView;", "mIconLeft", "mStopAccess", "closeExternalShareBanner", "", "destroy", "isShown", "", "onOrientation", "isLandscape", "isRotate", "refreshUi", "showExternalShareBanner", "shareId", "", "stopExternalShare", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.follow.a.b */
public final class FollowExternalPermsViewControl extends C61756a implements IFollowExternalPermsViewControl {

    /* renamed from: c */
    public static final Companion f154962c = new Companion(null);

    /* renamed from: d */
    private final View f154963d;

    /* renamed from: e */
    private final IconFontView f154964e;

    /* renamed from: f */
    private final TextView f154965f;

    /* renamed from: g */
    private final TextView f154966g;

    /* renamed from: h */
    private final IconFontView f154967h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/agent/FollowExternalPermsViewControl$Companion;", "", "()V", "SP_FOLLOW_EXTERNAL_IS_SHOW", "", "SP_FOLLOW_EXTERNAL_SHARE_ID", "TAG", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.agent.IFollowExternalPermsViewControl
    /* renamed from: c */
    public void mo213952c() {
        C60700b.m235851b("FollowExternalPermsViewControl", "[destroy]", "destroy");
    }

    /* renamed from: b */
    public void mo213951b() {
        C61303k kVar = this.f154960a;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        VcBizSender.m249270e(kVar.mo212055d(), false).mo219889a(new C61759b(this));
    }

    /* renamed from: a */
    public void mo213948a() {
        C61303k kVar = this.f154960a;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        AbstractC61751a ab = kVar.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab, "meeting.followControl");
        FollowInfo h = ab.mo213882h();
        if (h != null) {
            Intrinsics.checkExpressionValueIsNotNull(h, "followInfo");
            String shareId = h.getShareId();
            C61303k kVar2 = this.f154960a;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "meeting");
            AbstractC61751a ab2 = kVar2.ab();
            Intrinsics.checkExpressionValueIsNotNull(ab2, "meeting.followControl");
            Map<String, String> p = ab2.mo213890p();
            if (!TextUtils.isEmpty(shareId) && !CollectionUtils.isEmpty(p) && p.containsKey(shareId)) {
                p.remove(shareId);
            }
            C57744a.m224104a().remove("SP_FOLLOW_EXTERNAL_SHOW");
            C57744a.m224104a().remove("SP_FOLLOW_EXTERNAL_SHARE_ID");
            this.f154963d.setVisibility(8);
            C60700b.m235851b("FollowExternalPermsViewControl", "[closeExternalShareBanner]", "shareId=" + shareId);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.agent.IFollowExternalPermsViewControl
    /* renamed from: d */
    public void mo213953d() {
        C61303k kVar = this.f154960a;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        AbstractC61751a ab = kVar.ab();
        if (ab != null && ab.mo213882h() != null) {
            Intrinsics.checkExpressionValueIsNotNull(ab, "followControl");
            FollowInfo h = ab.mo213882h();
            Intrinsics.checkExpressionValueIsNotNull(h, "followControl.followInfo");
            String shareId = h.getShareId();
            C60700b.m235851b("FollowExternalPermsViewControl", "[refreshUi]", "shareId=" + shareId + " isSharingDevice=" + ab.mo213889o());
            if (!ab.mo213889o()) {
                mo213948a();
                return;
            }
            C61303k kVar2 = this.f154960a;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "meeting");
            AbstractC61751a ab2 = kVar2.ab();
            Intrinsics.checkExpressionValueIsNotNull(ab2, "meeting.followControl");
            Map<String, String> p = ab2.mo213890p();
            C60700b.m235851b("FollowExternalPermsViewControl", "[refreshUi2]", "externalMap= " + p.keySet());
            if (CollectionUtils.isEmpty(p)) {
                String string = C57744a.m224104a().getString("SP_FOLLOW_EXTERNAL_SHARE_ID", "");
                String string2 = C57744a.m224104a().getString("SP_FOLLOW_EXTERNAL_SHOW", "");
                C60700b.m235851b("FollowExternalPermsViewControl", "[refreshUi3]", "shareId= " + shareId + " shareIdSp=" + string + " showSp=" + string2);
                String str = shareId;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = string;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
                        mo213948a();
                    }
                }
            } else if (!TextUtils.isEmpty(shareId) && p.containsKey(shareId)) {
                if (Intrinsics.areEqual(p.get(shareId), "true")) {
                    Intrinsics.checkExpressionValueIsNotNull(shareId, "shareId");
                    mo213949a(shareId);
                    return;
                }
                mo213948a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/follow/agent/FollowExternalPermsViewControl$stopExternalShare$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.a.b$b */
    public static final class C61759b implements AbstractC63598b<String> {

        /* renamed from: a */
        final /* synthetic */ FollowExternalPermsViewControl f154971a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61759b(FollowExternalPermsViewControl bVar) {
            this.f154971a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            C60700b.m235851b("FollowExternalPermsViewControl", "[stopExternalShare]", "success " + str);
            this.f154971a.mo213948a();
            C61303k kVar = this.f154971a.f154960a;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            C63742at.m250084c(kVar.mo212056e());
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("error=");
            if (eVar != null) {
                str = eVar.mo219902b();
            } else {
                str = null;
            }
            sb.append(str);
            C60700b.m235851b("FollowExternalPermsViewControl", "[stopExternalShare2]", sb.toString());
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.agent.IFollowExternalPermsViewControl
    /* renamed from: a */
    public void mo213949a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "shareId");
        C61303k kVar = this.f154960a;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
        AbstractC61751a ab = kVar.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab, "meeting.followControl");
        if (ab.mo213882h() != null) {
            C61303k kVar2 = this.f154960a;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "meeting");
            AbstractC61751a ab2 = kVar2.ab();
            Intrinsics.checkExpressionValueIsNotNull(ab2, "meeting.followControl");
            FollowInfo h = ab2.mo213882h();
            Intrinsics.checkExpressionValueIsNotNull(h, "meeting.followControl.followInfo");
            String shareId = h.getShareId();
            C60700b.m235851b("FollowExternalPermsViewControl", "[showExternalShareBanner]", "shareId=" + str + "} follow shareId=" + shareId);
            if (Intrinsics.areEqual(str, shareId)) {
                this.f154963d.setVisibility(0);
                C61303k kVar3 = this.f154960a;
                Intrinsics.checkExpressionValueIsNotNull(kVar3, "meeting");
                C63742at.m250056a(kVar3.mo212056e());
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.agent.IFollowExternalPermsViewControl
    /* renamed from: a */
    public void mo213950a(boolean z, boolean z2) {
        C60700b.m235851b("FollowExternalPermsViewControl", "[onOrientation]", "isLandscape= " + z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowExternalPermsViewControl(final C61303k kVar, View view) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(view, "container");
        View findViewById = view.findViewById(R.id.external_follow_tips);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "container.findViewById(R.id.external_follow_tips)");
        this.f154963d = findViewById;
        View findViewById2 = view.findViewById(R.id.close_external_banner);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "container.findViewById(R.id.close_external_banner)");
        IconFontView iconFontView = (IconFontView) findViewById2;
        this.f154964e = iconFontView;
        View findViewById3 = view.findViewById(R.id.stop_external_access);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "container.findViewById(R.id.stop_external_access)");
        TextView textView = (TextView) findViewById3;
        this.f154965f = textView;
        View findViewById4 = view.findViewById(R.id.external_tips_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "container.findViewById(R.id.external_tips_content)");
        this.f154966g = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.banner_icon_left);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "container.findViewById(R.id.banner_icon_left)");
        this.f154967h = (IconFontView) findViewById5;
        iconFontView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.vc.meeting.module.follow.agent.FollowExternalPermsViewControl.View$OnClickListenerC617571 */

            /* renamed from: a */
            final /* synthetic */ FollowExternalPermsViewControl f154968a;

            {
                this.f154968a = r1;
            }

            public final void onClick(View view) {
                this.f154968a.mo213948a();
                C63742at.m250075b(kVar.mo212056e());
            }
        });
        textView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.vc.meeting.module.follow.agent.FollowExternalPermsViewControl.View$OnClickListenerC617582 */

            /* renamed from: a */
            final /* synthetic */ FollowExternalPermsViewControl f154970a;

            {
                this.f154970a = r1;
            }

            public final void onClick(View view) {
                this.f154970a.mo213951b();
            }
        });
        AbstractC61751a ab = kVar.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab, "meeting.followControl");
        FollowInfo h = ab.mo213882h();
        if (h != null) {
            Intrinsics.checkExpressionValueIsNotNull(h, "followInfo");
            String shareId = h.getShareId();
            AbstractC61751a ab2 = kVar.ab();
            Intrinsics.checkExpressionValueIsNotNull(ab2, "meeting.followControl");
            Map<String, String> p = ab2.mo213890p();
            C60700b.m235851b("FollowExternalPermsViewControl", "[init]", "shareId= " + shareId + " exteralMap=" + p.keySet());
            if (TextUtils.isEmpty(shareId) || CollectionUtils.isEmpty(p) || !p.containsKey(shareId)) {
                String string = C57744a.m224104a().getString("SP_FOLLOW_EXTERNAL_SHOW", "");
                String string2 = C57744a.m224104a().getString("SP_FOLLOW_EXTERNAL_SHARE_ID", "");
                C60700b.m235851b("FollowExternalPermsViewControl", "[init3]", "show with global sp showSp=" + string + " shareIdSp=" + string2 + " follow shareid=" + shareId);
                if (Intrinsics.areEqual(string, "true") && !TextUtils.isEmpty(string2)) {
                    Intrinsics.checkExpressionValueIsNotNull(string2, "shareIdSp");
                    mo213949a(string2);
                    return;
                }
                return;
            }
            String str = p.get(shareId);
            C60700b.m235851b("FollowExternalPermsViewControl", "[init2]", "show with external map isShow=" + str + " shareId=" + shareId);
            if (Intrinsics.areEqual(str, "true")) {
                Intrinsics.checkExpressionValueIsNotNull(shareId, "shareId");
                mo213949a(shareId);
            }
        }
    }
}
