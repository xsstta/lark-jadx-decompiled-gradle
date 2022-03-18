package com.ss.android.lark.team.page.create_team;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.common.piece.SettingBasePiece;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconEditText;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\tH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0 \u0012\u0004\u0012\u00020!0\u001fH\u0016J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010#\u001a\u00020\u001dH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/team/page/create_team/CreateItemDescriptionPiece;", "Lcom/ss/android/lark/team/common/piece/SettingBasePiece;", "Lcom/ss/android/lark/team/page/create_team/CreateItemDescriptionExport;", "isDescriptionRequired", "", "(Z)V", "exceedLiveData", "Landroidx/lifecycle/MutableLiveData;", "hint", "", "textCountLimit", "", "textCountView", "Landroid/widget/TextView;", "textInput", "Landroid/widget/EditText;", "title", "titleView", "getDescription", "getExceedLiveData", "Landroidx/lifecycle/LiveData;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "isTextCountExceedLimit", "onCreate", "", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "limit", "updateTextCount", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateItemDescriptionPiece extends SettingBasePiece<CreateItemDescriptionPiece> implements CreateItemDescriptionExport {

    /* renamed from: b */
    private TextView f136961b;

    /* renamed from: g */
    private EditText f136962g;

    /* renamed from: h */
    private TextView f136963h;

    /* renamed from: i */
    private String f136964i = "";

    /* renamed from: j */
    private String f136965j = "";

    /* renamed from: k */
    private int f136966k = Integer.MAX_VALUE;

    /* renamed from: l */
    private final C1177w<Boolean> f136967l = new C1177w<>();

    /* renamed from: m */
    private final boolean f136968m;

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(CreateItemDescriptionExport.class, this);
    }

    @Override // com.ss.android.lark.team.page.create_team.CreateItemDescriptionExport
    /* renamed from: c */
    public LiveData<Boolean> mo189295c() {
        return this.f136967l;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo189296d();
    }

    @Override // com.ss.android.lark.team.page.create_team.CreateItemDescriptionExport
    /* renamed from: b */
    public boolean mo189294b() {
        EditText editText = this.f136962g;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textInput");
        }
        if (editText.length() > this.f136966k) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.team.page.create_team.CreateItemDescriptionExport
    /* renamed from: a */
    public String mo189292a() {
        EditText editText = this.f136962g;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textInput");
        }
        String obj = editText.getText().toString();
        if (obj != null) {
            return StringsKt.trim((CharSequence) obj).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: d */
    public final void mo189296d() {
        String str;
        boolean z;
        EditText editText = this.f136962g;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textInput");
        }
        Editable text = editText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        int length = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String valueOf = String.valueOf(length);
        spannableStringBuilder.append((CharSequence) valueOf).append((CharSequence) "/").append((CharSequence) String.valueOf(this.f136966k));
        if (length > this.f136966k) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(mo177180C(), R.color.function_danger_500)), 0, valueOf.length(), 17);
            TextView textView = this.f136963h;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textCountView");
            }
            textView.setVisibility(0);
        } else {
            TextView textView2 = this.f136963h;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textCountView");
            }
            textView2.setVisibility(4);
        }
        TextView textView3 = this.f136963h;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textCountView");
        }
        textView3.setText(spannableStringBuilder);
        this.f136967l.mo5926a(Boolean.valueOf(z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u000f"}, d2 = {"com/ss/android/lark/team/page/create_team/CreateItemDescriptionPiece$getView$1$3$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_team_team_release", "com/ss/android/lark/team/page/create_team/CreateItemDescriptionPiece$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateItemDescriptionPiece$a */
    public static final class C55479a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ConstraintLayout f136969a;

        /* renamed from: b */
        final /* synthetic */ int f136970b;

        /* renamed from: c */
        final /* synthetic */ CreateItemDescriptionPiece f136971c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup.MarginLayoutParams f136972d;

        /* renamed from: e */
        final /* synthetic */ Context f136973e;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            this.f136971c.mo189296d();
        }

        C55479a(ConstraintLayout constraintLayout, int i, CreateItemDescriptionPiece createItemDescriptionPiece, ViewGroup.MarginLayoutParams marginLayoutParams, Context context) {
            this.f136969a = constraintLayout;
            this.f136970b = i;
            this.f136971c = createItemDescriptionPiece;
            this.f136972d = marginLayoutParams;
            this.f136973e = context;
        }
    }

    public CreateItemDescriptionPiece(boolean z) {
        this.f136968m = z;
    }

    /* renamed from: a */
    public final CreateItemDescriptionPiece mo189290a(int i) {
        CreateItemDescriptionPiece createItemDescriptionPiece = this;
        createItemDescriptionPiece.f136966k = i;
        if (createItemDescriptionPiece.f136968m && createItemDescriptionPiece.mo177206t()) {
            createItemDescriptionPiece.mo189296d();
        }
        return createItemDescriptionPiece;
    }

    /* renamed from: b */
    public final CreateItemDescriptionPiece mo189293b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hint");
        CreateItemDescriptionPiece createItemDescriptionPiece = this;
        createItemDescriptionPiece.f136965j = str;
        if (createItemDescriptionPiece.mo177206t()) {
            EditText editText = createItemDescriptionPiece.f136962g;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textInput");
            }
            editText.setHint(str);
        }
        return createItemDescriptionPiece;
    }

    /* renamed from: a */
    public final CreateItemDescriptionPiece mo189291a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        CreateItemDescriptionPiece createItemDescriptionPiece = this;
        createItemDescriptionPiece.f136964i = str;
        if (createItemDescriptionPiece.mo177206t()) {
            TextView textView = createItemDescriptionPiece.f136961b;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            textView.setText(str);
        }
        return createItemDescriptionPiece;
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View a = super.mo127619a(context, marginLayoutParams);
        if (a != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a;
            marginLayoutParams.height = -2;
            int a2 = C51468a.m199486a(16);
            constraintLayout.setBackground(null);
            constraintLayout.setBackgroundColor(C51468a.m199487a((int) R.color.bg_body, context));
            ConstraintLayout constraintLayout2 = constraintLayout;
            TextView textView = new TextView(constraintLayout2.getContext());
            textView.setId(R.id.title);
            textView.setText(this.f136964i);
            textView.setTextSize(14.0f);
            textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2816h = 0;
            layoutParams.f2825q = 0;
            layoutParams.topMargin = C51468a.m199486a(13);
            layoutParams.setMarginStart(a2);
            layoutParams.setMarginEnd(a2);
            textView.setLayoutParams(layoutParams);
            this.f136961b = textView;
            constraintLayout2.addView(textView);
            TextView textView2 = new TextView(constraintLayout2.getContext());
            textView2.setText("*");
            textView2.setTextSize(14.0f);
            textView2.setTextColor(C51468a.m199487a((int) R.color.function_danger_500, context));
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams2.f2816h = R.id.title;
            layoutParams2.f2824p = R.id.title;
            layoutParams2.f2819k = R.id.title;
            layoutParams2.setMarginStart(C51468a.m199486a(2));
            textView2.setLayoutParams(layoutParams2);
            if (this.f136968m) {
                i = 0;
            } else {
                i = 8;
            }
            textView2.setVisibility(i);
            constraintLayout2.addView(textView2);
            EmojiconEditText emojiconEditText = new EmojiconEditText(context);
            emojiconEditText.setId(R.id.input);
            this.f136962g = emojiconEditText;
            emojiconEditText.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
            emojiconEditText.setHintTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
            emojiconEditText.setBackgroundResource(R.drawable.bg_team_name_input);
            emojiconEditText.setGravity(8388659);
            emojiconEditText.setHint(this.f136965j);
            emojiconEditText.setTextSize(16.0f);
            ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, C51468a.m199486a(95));
            layoutParams3.f2817i = R.id.title;
            layoutParams3.f2825q = 0;
            layoutParams3.f2827s = 0;
            layoutParams3.topMargin = C51468a.m199486a(8);
            layoutParams3.setMarginStart(a2);
            layoutParams3.setMarginEnd(a2);
            emojiconEditText.setLayoutParams(layoutParams3);
            emojiconEditText.setPadding(0, 0, 0, 0);
            emojiconEditText.addTextChangedListener(new C55479a(constraintLayout, a2, this, marginLayoutParams, context));
            constraintLayout.addView(emojiconEditText);
            TextView textView3 = new TextView(constraintLayout2.getContext());
            this.f136963h = textView3;
            textView3.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
            textView3.setTextSize(12.0f);
            ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams4.f2817i = R.id.input;
            layoutParams4.f2827s = 0;
            layoutParams4.topMargin = C51468a.m199486a(2);
            layoutParams4.setMarginEnd(a2);
            textView3.setLayoutParams(layoutParams4);
            textView3.setPadding(0, 0, 0, C51468a.m199486a(8));
            constraintLayout2.addView(textView3);
            return constraintLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
    }
}
