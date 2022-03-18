package com.ss.android.vc.meeting.module.chat.vh;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.utils.C63496i;
import com.ss.android.vc.meeting.utils.C63497j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/module/chat/vh/SystemMessageVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "setView", "bindView", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "getBlueHeightName", "Landroid/text/SpannableString;", "allString", "", "nameLength", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.chat.b.b */
public final class SystemMessageVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private View f154465a;

    /* renamed from: a */
    public final View mo213395a() {
        return this.f154465a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SystemMessageVH(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f154465a = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/chat/vh/SystemMessageVH$getBlueHeightName$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "v", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.chat.b.b$a */
    public static final class C61574a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ SystemMessageVH f154466a;

        /* renamed from: b */
        final /* synthetic */ InteractionMessage f154467b;

        /* renamed from: c */
        final /* synthetic */ C61303k f154468c;

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            textPaint.setColor(C60773o.m236126d(R.color.ud_W300));
            textPaint.setUnderlineText(false);
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            ByteviewUser byteviewUser = new ByteviewUser(this.f154467b.mo216916c().mo216940a(), this.f154467b.mo216916c().mo216941b(), ParticipantType.valueOf(this.f154467b.mo216916c().mo216944e().getNumber()));
            if (C63497j.m248860d(this.f154468c, byteviewUser)) {
                C63497j.m248853a(C60773o.m236124b(this.f154466a.mo213395a().getContext()), this.f154468c, byteviewUser);
            }
        }

        C61574a(SystemMessageVH bVar, InteractionMessage aVar, C61303k kVar) {
            this.f154466a = bVar;
            this.f154467b = aVar;
            this.f154468c = kVar;
        }
    }

    /* renamed from: a */
    public final void mo213396a(C61303k kVar, InteractionMessage aVar) {
        boolean z;
        String str;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!C63496i.m248851e(kVar) || aVar.mo216916c().mo216946f() != ParticipantRole.INTERVIEWER) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = UIHelper.getString(R.string.View_M_Interviewer);
        } else {
            str = aVar.mo216916c().mo216942c();
        }
        SpannableString a = m240349a(str + " " + UIHelper.getString(R.string.View_M_JoinedTheMeeting), str.length(), kVar, aVar);
        TextView textView = (TextView) this.f154465a.findViewById(R.id.join_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.join_tv");
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "view.join_tv.paint");
        paint.setFakeBoldText(true);
        TextView textView2 = (TextView) this.f154465a.findViewById(R.id.join_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.join_tv");
        textView2.setText(a);
        TextView textView3 = (TextView) this.f154465a.findViewById(R.id.join_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "view.join_tv");
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    private final SpannableString m240349a(String str, int i, C61303k kVar, InteractionMessage aVar) {
        SpannableString spannableString = new SpannableString(str);
        if (i <= 0) {
            return spannableString;
        }
        spannableString.setSpan(new C61574a(this, aVar, kVar), 0, i, 17);
        return spannableString;
    }
}
