package com.ss.android.lark.ug.dyflow.feat.reminder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "reminderClickListener", "Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderView$OnReminderClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderView$OnReminderClickListener;)V", "btnDetail", "Landroid/widget/TextView;", "btnLater", "textContent", "textWho", "initViews", "", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderData;", "OnReminderClickListener", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.feat.a.c */
public final class JoinTeamReminderView extends LinearLayout {

    /* renamed from: a */
    public final OnReminderClickListener f141517a;

    /* renamed from: b */
    private TextView f141518b;

    /* renamed from: c */
    private TextView f141519c;

    /* renamed from: d */
    private TextView f141520d;

    /* renamed from: e */
    private TextView f141521e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderView$OnReminderClickListener;", "", "onDetailClick", "", "view", "Landroid/view/View;", "onLaterClick", "onShow", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.a.c$a */
    public interface OnReminderClickListener {
        /* renamed from: a */
        void mo194940a();

        /* renamed from: a */
        void mo194941a(View view);

        /* renamed from: b */
        void mo194942b(View view);
    }

    /* renamed from: a */
    public final void mo194963a() {
        LayoutInflater.from(getContext()).inflate(R.layout.guide_reminder_join_team, this);
        View findViewById = findViewById(R.id.text_who);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.text_who)");
        this.f141518b = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.text_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.text_content)");
        this.f141519c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.btn_later);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.btn_later)");
        this.f141520d = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.btn_detail);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.btn_detail)");
        this.f141521e = (TextView) findViewById4;
        TextView textView = this.f141520d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnLater");
        }
        textView.setOnClickListener(new View$OnClickListenerC57444b(this));
        TextView textView2 = this.f141521e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnDetail");
        }
        textView2.setOnClickListener(new View$OnClickListenerC57445c(this));
        OnReminderClickListener aVar = this.f141517a;
        if (aVar != null) {
            aVar.mo194940a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.a.c$b */
    public static final class View$OnClickListenerC57444b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JoinTeamReminderView f141522a;

        View$OnClickListenerC57444b(JoinTeamReminderView cVar) {
            this.f141522a = cVar;
        }

        public final void onClick(View view) {
            OnReminderClickListener aVar = this.f141522a.f141517a;
            if (aVar != null) {
                aVar.mo194941a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.a.c$c */
    public static final class View$OnClickListenerC57445c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JoinTeamReminderView f141523a;

        View$OnClickListenerC57445c(JoinTeamReminderView cVar) {
            this.f141523a = cVar;
        }

        public final void onClick(View view) {
            OnReminderClickListener aVar = this.f141523a.f141517a;
            if (aVar != null) {
                aVar.mo194942b(view);
            }
        }
    }

    public final void setData(JoinTeamReminderData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        String a = aVar.mo194960a();
        if (a != null) {
            TextView textView = this.f141518b;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textWho");
            }
            textView.setText(a);
        }
        String b = aVar.mo194961b();
        if (b != null) {
            TextView textView2 = this.f141519c;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textContent");
            }
            textView2.setText(b);
        }
    }

    public JoinTeamReminderView(Context context, OnReminderClickListener aVar) {
        super(context);
        this.f141517a = aVar;
        mo194963a();
    }
}
