package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.page.ChatModeSelectActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001e\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/team/common/piece/ChatModeSettingPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "Lcom/ss/android/lark/team/common/piece/ChatModeSettingExport;", "()V", "selectedChatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "typeView", "Landroid/widget/TextView;", "getChatMode", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "updateChatType", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatModeSettingPiece extends Piece<ChatModeSettingPiece> implements ChatModeSettingExport {

    /* renamed from: a */
    public Chat.ChatMode f136688a = Chat.ChatMode.THREAD_V2;

    /* renamed from: b */
    private TextView f136689b;

    @Override // com.ss.android.lark.team.common.piece.ChatModeSettingExport
    /* renamed from: a */
    public Chat.ChatMode mo188969a() {
        return this.f136688a;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(ChatModeSettingExport.class, this);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177205s().setOnClickListener(new View$OnClickListenerC55368a(this));
        m214904b();
    }

    /* renamed from: b */
    private final void m214904b() {
        String str;
        TextView textView = this.f136689b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeView");
        }
        if (C55399b.f136806a[this.f136688a.ordinal()] != 1) {
            TextView textView2 = this.f136689b;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("typeView");
            }
            Context context = textView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "typeView.context");
            str = C51468a.m199493c(R.string.Project_T_TopicSwitch, context);
        } else {
            TextView textView3 = this.f136689b;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("typeView");
            }
            Context context2 = textView3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "typeView.context");
            str = C51468a.m199493c(R.string.Project_T_ChatSwitch, context2);
        }
        textView.setText(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.ChatModeSettingPiece$a */
    static final class View$OnClickListenerC55368a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatModeSettingPiece f136690a;

        View$OnClickListenerC55368a(ChatModeSettingPiece chatModeSettingPiece) {
            this.f136690a = chatModeSettingPiece;
        }

        public final void onClick(View view) {
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Intent intent = new Intent(view.getContext(), ChatModeSelectActivity.class);
            intent.putExtra("intent_chat_mode", this.f136690a.f136688a);
            this.f136690a.mo177187a(intent, 3);
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        marginLayoutParams.width = -1;
        marginLayoutParams.height = C51468a.m199486a(54);
        constraintLayout.setPadding(C51468a.m199486a(16), 0, C51468a.m199486a(16), 0);
        constraintLayout.setBackground(C51468a.m199492b(R.drawable.item_bg_selector_c11, context));
        ConstraintLayout constraintLayout2 = constraintLayout;
        TextView textView = new TextView(constraintLayout2.getContext());
        textView.setTextSize(16.0f);
        textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
        textView.setText(C51468a.m199493c(R.string.Project_MV_GroupTypeTitle, context));
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f2816h = 0;
        layoutParams.f2819k = 0;
        layoutParams.f2825q = 0;
        textView.setLayoutParams(layoutParams);
        constraintLayout2.addView(textView);
        ImageView imageView = new ImageView(constraintLayout2.getContext());
        imageView.setId(R.id.right_arrow);
        int a = C51468a.m199486a(18);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(a, a);
        layoutParams2.f2816h = 0;
        layoutParams2.f2819k = 0;
        layoutParams2.f2827s = 0;
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageDrawable(C51468a.m199489a((int) R.drawable.ud_icon_right_outlined, context, (int) R.color.icon_n3));
        constraintLayout2.addView(imageView);
        TextView textView2 = new TextView(constraintLayout2.getContext());
        textView2.setId(R.id.group_type);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.f2816h = 0;
        layoutParams3.f2819k = 0;
        layoutParams3.f2826r = R.id.right_arrow;
        layoutParams3.setMarginEnd(C51468a.m199486a(8));
        textView2.setLayoutParams(layoutParams3);
        this.f136689b = textView2;
        constraintLayout2.addView(textView2);
        return constraintLayout;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        Serializable serializable;
        if (i != 3) {
            return false;
        }
        Chat.ChatMode chatMode = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("result_selected_chat_mode");
        } else {
            serializable = null;
        }
        if (serializable instanceof Chat.ChatMode) {
            chatMode = serializable;
        }
        Chat.ChatMode chatMode2 = chatMode;
        if (chatMode2 == null) {
            chatMode2 = this.f136688a;
        }
        this.f136688a = chatMode2;
        m214904b();
        return true;
    }
}
