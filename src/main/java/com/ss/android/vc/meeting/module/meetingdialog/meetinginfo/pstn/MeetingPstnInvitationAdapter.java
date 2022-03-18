package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.base.AbstractC60710a;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.utils.C63529q;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationAdapter;", "Lcom/ss/android/vc/common/base/RecyclerViewBaseAdapter;", "Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationAdapter$PstnInfoViewHolder;", "Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/PstnInviteInfo;", "meetingNumber", "", "(Ljava/lang/String;)V", "countryTelLayout", "Landroid/view/View;", "getCountryTelLayout", "()Landroid/view/View;", "setCountryTelLayout", "(Landroid/view/View;)V", "isLandscape", "", "getMeetingNumber", "()Ljava/lang/String;", "padding", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateIsLandscape", "PstnInfoViewHolder", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.a */
public final class MeetingPstnInvitationAdapter extends AbstractC60710a<PstnInfoViewHolder, PstnInviteInfo> {

    /* renamed from: b */
    public View f156570b;

    /* renamed from: c */
    private boolean f156571c;

    /* renamed from: d */
    private int f156572d;

    /* renamed from: e */
    private final String f156573e;

    /* renamed from: a */
    public final String mo215487a() {
        return this.f156573e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.a$b */
    public static final class C62312b extends Lambda implements Function0<Unit> {
        final /* synthetic */ PstnInviteInfo $pstnInviteInfo;
        final /* synthetic */ MeetingPstnInvitationAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62312b(MeetingPstnInvitationAdapter aVar, PstnInviteInfo eVar) {
            super(0);
            this.this$0 = aVar;
            this.$pstnInviteInfo = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            StringBuilder sb = new StringBuilder();
            for (String str : StringsKt.split$default((CharSequence) this.$pstnInviteInfo.mo215503b(), new String[]{"\n"}, false, 0, 6, (Object) null)) {
                sb.append(str);
                sb.append(",,");
                sb.append(this.this$0.mo215487a());
                sb.append("#");
                sb.append("\n");
            }
            Object systemService = ar.m236694a().getSystemService("clipboard");
            if (systemService != null) {
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("meetingPstn", sb.toString()));
                C60738ac.m236037c((int) R.string.View_M_PhoneNumberAndMeetingIdCopied);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
    }

    public MeetingPstnInvitationAdapter(String str) {
        Intrinsics.checkParameterIsNotNull(str, "meetingNumber");
        this.f156573e = str;
    }

    /* renamed from: a */
    public final void mo215489a(boolean z) {
        double d;
        this.f156571c = z;
        if (z) {
            d = 60.0d;
        } else {
            d = 16.0d;
        }
        this.f156572d = C60773o.m236115a(d);
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationAdapter$PstnInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "countryNameView", "Landroid/widget/TextView;", "getCountryNameView", "()Landroid/widget/TextView;", "setCountryNameView", "(Landroid/widget/TextView;)V", "telNumberView", "getTelNumberView", "setTelNumberView", "getView", "()Landroid/view/View;", "bind", "", "pstnInviteInfo", "Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/PstnInviteInfo;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.a$a */
    public static final class PstnInfoViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f156574a;

        /* renamed from: b */
        public TextView f156575b;

        /* renamed from: c */
        private final View f156576c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PstnInfoViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f156576c = view;
            View findViewById = view.findViewById(R.id.countryName);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.countryName)");
            this.f156574a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.telNumber);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.telNumber)");
            this.f156575b = (TextView) findViewById2;
        }

        /* renamed from: a */
        public final void mo215490a(PstnInviteInfo eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "pstnInviteInfo");
            TextView textView = this.f156574a;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countryNameView");
            }
            textView.setText(eVar.mo215502a());
            TextView textView2 = this.f156575b;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("telNumberView");
            }
            textView2.setText(eVar.mo215503b());
        }
    }

    /* renamed from: a */
    public PstnInfoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_meeting_pstn_info, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.country_tel_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById(R.id.country_tel_layout)");
        this.f156570b = findViewById;
        if (DesktopUtil.m144307b()) {
            i2 = R.drawable.bg_pstn_invite_item_selector_lkp;
        } else {
            i2 = R.drawable.bg_pstn_invite_item_selector;
        }
        inflate.setBackgroundResource(i2);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "contentView");
        return new PstnInfoViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(PstnInfoViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        PstnInviteInfo eVar = (PstnInviteInfo) mo208288a(i);
        View view = this.f156570b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countryTelLayout");
        }
        view.setPadding(this.f156572d, C60773o.m236115a(12.0d), this.f156572d, C60773o.m236115a(12.0d));
        Intrinsics.checkExpressionValueIsNotNull(eVar, "pstnInviteInfo");
        aVar.mo215490a(eVar);
        View view2 = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        C63529q.m248970a(view2, new C62312b(this, eVar));
    }
}
