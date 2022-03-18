package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.utils.EditTextLengthFilter;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\u001c\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\u0004\u0012\u00020\"0 H\u0016J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\tJ\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/team/common/piece/TeamNameInputPiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "Lcom/ss/android/lark/team/common/piece/TeamNameInputExport;", "()V", "clearButton", "Landroid/widget/ImageView;", "duplicatedTip", "Landroid/widget/TextView;", "duplicatedTipContent", "", "focusChangeLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "hintContent", "nameDisplay", "nameInput", "Landroid/widget/EditText;", "nameLiveData", "showNormalInputClickListener", "Landroid/view/View$OnClickListener;", "clearFocus", "", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "inputContentLiveData", "onCreate", "onNameDuplicated", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "setDuplicatedTip", "tip", "setHint", "hint", "showNormalInputView", "updateClearButtonVisibility", "updateInputContent", "content", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamNameInputPiece extends LifecycleOwnerPiece<TeamNameInputPiece> implements TeamNameInputExport {

    /* renamed from: a */
    public EditText f136786a;

    /* renamed from: b */
    public ImageView f136787b;

    /* renamed from: g */
    public final C1177w<String> f136788g = new C1177w<>("");

    /* renamed from: h */
    public final C1177w<Boolean> f136789h = new C1177w<>();

    /* renamed from: i */
    private TextView f136790i;

    /* renamed from: j */
    private TextView f136791j;

    /* renamed from: k */
    private String f136792k = "";

    /* renamed from: l */
    private String f136793l = "";

    /* renamed from: m */
    private final View.OnClickListener f136794m = new View$OnClickListenerC55397e(this);

    /* renamed from: g */
    public C1177w<String> mo189033a() {
        return this.f136788g;
    }

    /* renamed from: h */
    public C1177w<Boolean> mo189035b() {
        return this.f136789h;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(TeamNameInputExport.class, this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamNameInputPiece$d */
    public static final class RunnableC55395d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TeamNameInputPiece f136799a;

        RunnableC55395d(TeamNameInputPiece teamNameInputPiece) {
            this.f136799a = teamNameInputPiece;
        }

        public final void run() {
            this.f136799a.mo177192a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.team.common.piece.TeamNameInputPiece.RunnableC55395d.C553961 */
                final /* synthetic */ RunnableC55395d this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    TeamNameInputPiece.m214981b(this.this$0.f136799a).requestFocus();
                    KeyboardUtils.showKeyboard(TeamNameInputPiece.m214981b(this.this$0.f136799a));
                }
            });
        }
    }

    @Override // com.ss.android.lark.team.common.piece.TeamNameInputExport
    /* renamed from: d */
    public void mo189039d() {
        EditText editText = this.f136786a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        editText.clearFocus();
    }

    /* renamed from: e */
    public final void mo189040e() {
        boolean z;
        ImageView imageView = this.f136787b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        EditText editText = this.f136786a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        Editable text = editText.getText();
        int i = 0;
        if (text == null || StringsKt.isBlank(text)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: f */
    public final void mo189041f() {
        mo177205s().setOnClickListener(null);
        TextView textView = this.f136790i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameDisplay");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f136791j;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicatedTip");
        }
        textView2.setVisibility(8);
        EditText editText = this.f136786a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        editText.setVisibility(0);
        editText.requestFocus();
        KeyboardUtils.showKeyboard(editText);
        mo189040e();
    }

    @Override // com.ss.android.lark.team.common.piece.TeamNameInputExport
    public void bm_() {
        EditText editText = this.f136786a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        editText.setVisibility(8);
        ImageView imageView = this.f136787b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        imageView.setVisibility(4);
        TextView textView = this.f136790i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameDisplay");
        }
        EditText editText2 = this.f136786a;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        CharSequence text = editText2.getText();
        if (text == null) {
            text = "";
        }
        textView.setText(text);
        textView.setVisibility(0);
        TextView textView2 = this.f136791j;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicatedTip");
        }
        textView2.setVisibility(0);
        mo177205s().setOnClickListener(this.f136794m);
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        View s = mo177205s();
        View findViewById = s.findViewById(R.id.name_input);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "it.findViewById(R.id.name_input)");
        this.f136786a = (EditText) findViewById;
        View findViewById2 = s.findViewById(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "it.findViewById(R.id.clear)");
        this.f136787b = (ImageView) findViewById2;
        View findViewById3 = s.findViewById(R.id.name_display);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "it.findViewById(R.id.name_display)");
        this.f136790i = (TextView) findViewById3;
        View findViewById4 = s.findViewById(R.id.error_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "it.findViewById(R.id.error_hint)");
        this.f136791j = (TextView) findViewById4;
        EditText editText = this.f136786a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        editText.setHint(this.f136792k);
        editText.setFilters(new EditTextLengthFilter[]{new EditTextLengthFilter(60, null)});
        editText.addTextChangedListener(new C55392a(this));
        editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC55393b(editText, this));
        TextView textView = this.f136791j;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicatedTip");
        }
        textView.setText(this.f136793l);
        ImageView imageView = this.f136787b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC55394c(this));
        mo189040e();
        EditText editText2 = this.f136786a;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        editText2.postDelayed(new RunnableC55395d(this), 500);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/common/piece/TeamNameInputPiece$onCreate$2$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamNameInputPiece$a */
    public static final class C55392a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ TeamNameInputPiece f136795a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C55392a(TeamNameInputPiece teamNameInputPiece) {
            this.f136795a = teamNameInputPiece;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r1 != null) goto L_0x0025;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r3) {
            /*
                r2 = this;
                com.ss.android.lark.team.common.piece.TeamNameInputPiece r0 = r2.f136795a
                androidx.lifecycle.w<java.lang.String> r0 = r0.f136788g
                if (r3 == 0) goto L_0x0023
                java.lang.String r1 = r3.toString()
                if (r1 == 0) goto L_0x0023
                if (r1 == 0) goto L_0x001b
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
                java.lang.String r1 = r1.toString()
                if (r1 == 0) goto L_0x0023
                goto L_0x0025
            L_0x001b:
                kotlin.TypeCastException r3 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
                r3.<init>(r0)
                throw r3
            L_0x0023:
                java.lang.String r1 = ""
            L_0x0025:
                r0.mo5926a(r1)
                com.ss.android.lark.team.common.piece.TeamNameInputPiece r0 = r2.f136795a
                android.widget.ImageView r0 = com.ss.android.lark.team.common.piece.TeamNameInputPiece.m214980a(r0)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1 = 0
                if (r3 == 0) goto L_0x003c
                boolean r3 = kotlin.text.StringsKt.isBlank(r3)
                if (r3 == 0) goto L_0x003a
                goto L_0x003c
            L_0x003a:
                r3 = 0
                goto L_0x003d
            L_0x003c:
                r3 = 1
            L_0x003d:
                if (r3 == 0) goto L_0x0040
                r1 = 4
            L_0x0040:
                r0.setVisibility(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.common.piece.TeamNameInputPiece.C55392a.afterTextChanged(android.text.Editable):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamNameInputPiece$e */
    static final class View$OnClickListenerC55397e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamNameInputPiece f136800a;

        View$OnClickListenerC55397e(TeamNameInputPiece teamNameInputPiece) {
            this.f136800a = teamNameInputPiece;
        }

        public final void onClick(View view) {
            this.f136800a.mo189041f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamNameInputPiece$c */
    static final class View$OnClickListenerC55394c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamNameInputPiece f136798a;

        View$OnClickListenerC55394c(TeamNameInputPiece teamNameInputPiece) {
            this.f136798a = teamNameInputPiece;
        }

        public final void onClick(View view) {
            TeamNameInputPiece.m214981b(this.f136798a).setText("");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m214980a(TeamNameInputPiece teamNameInputPiece) {
        ImageView imageView = teamNameInputPiece.f136787b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditText m214981b(TeamNameInputPiece teamNameInputPiece) {
        EditText editText = teamNameInputPiece.f136786a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        return editText;
    }

    /* renamed from: b */
    public final TeamNameInputPiece mo189036b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hint");
        TeamNameInputPiece teamNameInputPiece = this;
        teamNameInputPiece.f136792k = str;
        if (teamNameInputPiece.mo177206t()) {
            EditText editText = teamNameInputPiece.f136786a;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nameInput");
            }
            editText.setHint(str);
        }
        return teamNameInputPiece;
    }

    @Override // com.ss.android.lark.team.common.piece.TeamNameInputExport
    /* renamed from: a */
    public void mo189034a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        EditText editText = this.f136786a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        editText.setText(str);
    }

    /* renamed from: c */
    public final TeamNameInputPiece mo189038c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tip");
        TeamNameInputPiece teamNameInputPiece = this;
        teamNameInputPiece.f136793l = str;
        if (teamNameInputPiece.mo177206t()) {
            TextView textView = teamNameInputPiece.f136791j;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("duplicatedTip");
            }
            textView.setText(teamNameInputPiece.f136793l);
        }
        return teamNameInputPiece;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        return C51468a.m199490a((int) R.layout.view_team_name_input, context, (ViewGroup) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/ss/android/lark/team/common/piece/TeamNameInputPiece$onCreate$2$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamNameInputPiece$b */
    static final class View$OnFocusChangeListenerC55393b implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ EditText f136796a;

        /* renamed from: b */
        final /* synthetic */ TeamNameInputPiece f136797b;

        View$OnFocusChangeListenerC55393b(EditText editText, TeamNameInputPiece teamNameInputPiece) {
            this.f136796a = editText;
            this.f136797b = teamNameInputPiece;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                TeamNameInputPiece.m214980a(this.f136797b).setVisibility(4);
                KeyboardUtils.hideKeyboard(this.f136796a.getContext(), this.f136796a);
            } else {
                KeyboardUtils.showKeyboard(this.f136796a.getContext());
                this.f136797b.mo189040e();
            }
            this.f136797b.f136789h.mo5926a(Boolean.valueOf(z));
        }
    }
}
