package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconEditText;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\u001c\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberSearchBarPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "Lcom/ss/android/lark/team/page/member/TeamMemberSearchBarExport;", "()V", "actionTypeObserver", "com/ss/android/lark/team/page/member/TeamMemberSearchBarPiece$actionTypeObserver$1", "Lcom/ss/android/lark/team/page/member/TeamMemberSearchBarPiece$actionTypeObserver$1;", "clearButton", "Landroid/widget/ImageView;", "searchBar", "Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiconEditText;", "clearFocus", "", "configView", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onCreate", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "switchActionType", ShareHitPoint.f121869d, "Lcom/ss/android/lark/team/entity/MemberActionType;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamMemberSearchBarPiece extends Piece<TeamMemberSearchBarPiece> implements TeamMemberSearchBarExport {

    /* renamed from: a */
    public EmojiconEditText f137107a;

    /* renamed from: b */
    public ImageView f137108b;

    /* renamed from: g */
    private final C55560a f137109g = new C55560a(this, true);

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(TeamMemberSearchBarExport.class, this);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        m215413b();
        mo177190a(MemberActionType.class, this.f137109g);
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberSearchBarExport
    /* renamed from: a */
    public void mo189461a() {
        EmojiconEditText emojiconEditText = this.f137107a;
        if (emojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBar");
        }
        emojiconEditText.clearFocus();
        KeyboardUtils.hideKeyboard(mo177180C());
    }

    /* renamed from: b */
    private final void m215413b() {
        EmojiconEditText emojiconEditText = this.f137107a;
        if (emojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBar");
        }
        emojiconEditText.setOnFocusChangeListener(new View$OnFocusChangeListenerC55561b(this));
        EmojiconEditText emojiconEditText2 = this.f137107a;
        if (emojiconEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBar");
        }
        emojiconEditText2.addTextChangedListener(new C55562c(this));
        ImageView imageView = this.f137108b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC55563d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberSearchBarPiece$actionTypeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/MemberActionType;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchBarPiece$a */
    public static final class C55560a extends DataObserver<MemberActionType> {

        /* renamed from: a */
        final /* synthetic */ TeamMemberSearchBarPiece f137110a;

        /* renamed from: a */
        public void mo127664a(MemberActionType memberActionType) {
            if (memberActionType != null) {
                this.f137110a.mo189462a(memberActionType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55560a(TeamMemberSearchBarPiece teamMemberSearchBarPiece, boolean z) {
            super(z);
            this.f137110a = teamMemberSearchBarPiece;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberSearchBarPiece$configView$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchBarPiece$c */
    public static final class C55562c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ TeamMemberSearchBarPiece f137112a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55562c(TeamMemberSearchBarPiece teamMemberSearchBarPiece) {
            this.f137112a = teamMemberSearchBarPiece;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(editable, "s");
            String obj = editable.toString();
            if (obj.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TeamMemberSearchBarPiece.m215412b(this.f137112a).setVisibility(8);
            } else {
                TeamMemberSearchBarPiece.m215412b(this.f137112a).setVisibility(0);
            }
            PieceContext r = this.f137112a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(TeamMemberSearchListExport.class);
            } else {
                aVar = null;
            }
            TeamMemberSearchListExport tVar = (TeamMemberSearchListExport) aVar;
            if (tVar != null) {
                tVar.mo189471a(obj);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EmojiconEditText m215411a(TeamMemberSearchBarPiece teamMemberSearchBarPiece) {
        EmojiconEditText emojiconEditText = teamMemberSearchBarPiece.f137107a;
        if (emojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBar");
        }
        return emojiconEditText;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m215412b(TeamMemberSearchBarPiece teamMemberSearchBarPiece) {
        ImageView imageView = teamMemberSearchBarPiece.f137108b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        return imageView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchBarPiece$d */
    public static final class View$OnClickListenerC55563d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberSearchBarPiece f137113a;

        View$OnClickListenerC55563d(TeamMemberSearchBarPiece teamMemberSearchBarPiece) {
            this.f137113a = teamMemberSearchBarPiece;
        }

        public final void onClick(View view) {
            IPieceExport aVar;
            TeamMemberSearchBarPiece.m215411a(this.f137113a).setText("");
            KeyboardUtils.showKeyboard(this.f137113a.mo177180C());
            PieceContext r = this.f137113a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(TeamMemberSearchListExport.class);
            } else {
                aVar = null;
            }
            TeamMemberSearchListExport tVar = (TeamMemberSearchListExport) aVar;
            if (tVar != null) {
                tVar.mo189472b();
            }
        }
    }

    /* renamed from: a */
    public final void mo189462a(MemberActionType memberActionType) {
        int i;
        if (C55595s.f137161a[memberActionType.ordinal()] == 1) {
            i = R.string.Project_MV_SearchTeamMembersWithin;
        } else if (mo177203q().mo177164a("intent_private_chat_id") == null) {
            i = R.string.Project_MV_PlaceHolderSearchMembers;
        } else {
            i = R.string.Lark_Legacy_Search;
        }
        EmojiconEditText emojiconEditText = this.f137107a;
        if (emojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBar");
        }
        emojiconEditText.setHint(C51468a.m199493c(i, mo177180C()));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchBarPiece$b */
    public static final class View$OnFocusChangeListenerC55561b implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberSearchBarPiece f137111a;

        View$OnFocusChangeListenerC55561b(TeamMemberSearchBarPiece teamMemberSearchBarPiece) {
            this.f137111a = teamMemberSearchBarPiece;
        }

        public final void onFocusChange(View view, boolean z) {
            Object systemService = this.f137111a.mo177180C().getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                if (z) {
                    inputMethodManager.showSoftInput(TeamMemberSearchBarPiece.m215411a(this.f137111a), 2);
                } else if (TextUtils.isEmpty(TeamMemberSearchBarPiece.m215411a(this.f137111a).getText())) {
                    inputMethodManager.hideSoftInputFromWindow(TeamMemberSearchBarPiece.m215411a(this.f137111a).getWindowToken(), 0);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        marginLayoutParams.width = 0;
        marginLayoutParams.height = C51468a.m199486a(56);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        EmojiconEditText emojiconEditText = new EmojiconEditText(context);
        emojiconEditText.setId(R.id.team_members_search_bar);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, C51468a.m199486a(38));
        layoutParams.f2816h = 0;
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        layoutParams.topMargin = C51468a.m199486a(10);
        layoutParams.setMarginStart(C51468a.m199486a(16));
        layoutParams.setMarginEnd(C51468a.m199486a(16));
        emojiconEditText.setLayoutParams(layoutParams);
        emojiconEditText.setPadding(C51468a.m199486a(40), 0, C51468a.m199486a(40), 0);
        emojiconEditText.setBackgroundResource(R.drawable.bg_team_member_search_bar);
        emojiconEditText.setTextSize(14.0f);
        emojiconEditText.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
        emojiconEditText.setHintTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
        emojiconEditText.setGravity(16);
        constraintLayout.addView(emojiconEditText);
        emojiconEditText.setHint(C51468a.m199493c(R.string.Lark_Legacy_Search, context));
        emojiconEditText.setMaxLines(1);
        emojiconEditText.setSingleLine();
        emojiconEditText.setLines(1);
        this.f137107a = emojiconEditText;
        ConstraintLayout constraintLayout2 = constraintLayout;
        ImageView imageView = new ImageView(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(C51468a.m199486a(16), C51468a.m199486a(16));
        layoutParams2.f2816h = R.id.team_members_search_bar;
        layoutParams2.f2819k = R.id.team_members_search_bar;
        layoutParams2.f2825q = R.id.team_members_search_bar;
        layoutParams2.setMarginStart(C51468a.m199486a(16));
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageDrawable(C51468a.m199489a((int) R.drawable.ud_icon_search_outline_outlined, context, (int) R.color.icon_n3));
        constraintLayout2.addView(imageView);
        ImageView imageView2 = new ImageView(context);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(C51468a.m199486a(16), C51468a.m199486a(16));
        layoutParams3.f2816h = R.id.team_members_search_bar;
        layoutParams3.f2819k = R.id.team_members_search_bar;
        layoutParams3.f2827s = R.id.team_members_search_bar;
        layoutParams3.setMarginEnd(C51468a.m199486a(16));
        imageView2.setLayoutParams(layoutParams3);
        imageView2.setImageDrawable(C51468a.m199489a((int) R.drawable.ud_icon_close_filled, context, (int) R.color.icon_n3));
        imageView2.setVisibility(8);
        constraintLayout.addView(imageView2);
        this.f137108b = imageView2;
        return constraintLayout;
    }
}
