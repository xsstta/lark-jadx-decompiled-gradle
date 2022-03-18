package com.ss.android.lark.team.page.create_team;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.utils.EditTextLengthFilter;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u001bH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\u001c\u0010%\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020(0'\u0012\u0004\u0012\u00020(0&H\u0016J\b\u0010)\u001a\u00020\u001aH\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/team/page/create_team/CreateTeamNamePiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "Lcom/ss/android/lark/team/page/create_team/CreateTeamNameExport;", "()V", "clearButton", "Landroid/widget/ImageView;", "duplicatedTip", "Landroid/widget/TextView;", "getDuplicatedTip", "()Landroid/widget/TextView;", "setDuplicatedTip", "(Landroid/widget/TextView;)V", "focusChangeLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "nameInput", "Landroid/widget/EditText;", "getNameInput", "()Landroid/widget/EditText;", "setNameInput", "(Landroid/widget/EditText;)V", "nameLiveData", "", "showNormalInputClickListener", "Landroid/view/View$OnClickListener;", "clearFocus", "", "Landroidx/lifecycle/LiveData;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "inputContentLiveData", "onCreate", "onNameDuplicated", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "updateClearButtonVisibility", "updateInputContent", "content", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public class CreateTeamNamePiece extends LifecycleOwnerPiece<CreateTeamNamePiece> implements CreateTeamNameExport {

    /* renamed from: a */
    public EditText f136990a;

    /* renamed from: b */
    public ImageView f136991b;

    /* renamed from: g */
    public TextView f136992g;

    /* renamed from: h */
    public final C1177w<String> f136993h = new C1177w<>("");

    /* renamed from: i */
    public final C1177w<Boolean> f136994i = new C1177w<>();

    /* renamed from: j */
    private final View.OnClickListener f136995j = new View$OnClickListenerC55486e(this);

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(CreateTeamNameExport.class, this);
    }

    @Override // com.ss.android.lark.team.page.create_team.CreateTeamNameExport
    /* renamed from: a */
    public LiveData<String> mo189313a() {
        return this.f136993h;
    }

    @Override // com.ss.android.lark.team.page.create_team.CreateTeamNameExport
    /* renamed from: b */
    public LiveData<Boolean> mo189314b() {
        return this.f136994i;
    }

    /* renamed from: d */
    public final EditText mo189316d() {
        EditText editText = this.f136990a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        return editText;
    }

    /* renamed from: e */
    public final TextView mo189317e() {
        TextView textView = this.f136992g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicatedTip");
        }
        return textView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamNamePiece$d */
    public static final class RunnableC55485d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CreateTeamNamePiece f137000a;

        RunnableC55485d(CreateTeamNamePiece createTeamNamePiece) {
            this.f137000a = createTeamNamePiece;
        }

        public final void run() {
            if (this.f137000a.mo177208v()) {
                EditText d = this.f137000a.mo189316d();
                d.requestFocus();
                KeyboardUtils.showKeyboard(d);
            }
        }
    }

    @Override // com.ss.android.lark.team.page.create_team.CreateTeamNameExport
    public void bn_() {
        ImageView imageView = this.f136991b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        imageView.setVisibility(4);
        TextView textView = this.f136992g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicatedTip");
        }
        textView.setVisibility(0);
        mo177205s().setOnClickListener(this.f136995j);
    }

    /* renamed from: f */
    public final void mo189318f() {
        boolean z;
        ImageView imageView = this.f136991b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        EditText editText = this.f136990a;
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

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        View s = mo177205s();
        View findViewById = s.findViewById(R.id.name_input);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "it.findViewById(R.id.name_input)");
        this.f136990a = (EditText) findViewById;
        View findViewById2 = s.findViewById(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "it.findViewById(R.id.clear)");
        this.f136991b = (ImageView) findViewById2;
        View findViewById3 = s.findViewById(R.id.error_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "it.findViewById(R.id.error_hint)");
        this.f136992g = (TextView) findViewById3;
        EditText editText = this.f136990a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        editText.setFilters(new EditTextLengthFilter[]{new EditTextLengthFilter(60, null)});
        editText.addTextChangedListener(new C55482a(this));
        editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC55483b(editText, this));
        ImageView imageView = this.f136991b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC55484c(this));
        mo189318f();
        EditText editText2 = this.f136990a;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameInput");
        }
        editText2.postDelayed(new RunnableC55485d(this), 500);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/page/create_team/CreateTeamNamePiece$onCreate$2$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamNamePiece$a */
    public static final class C55482a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ CreateTeamNamePiece f136996a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C55482a(CreateTeamNamePiece createTeamNamePiece) {
            this.f136996a = createTeamNamePiece;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r1 != null) goto L_0x0025;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r3) {
            /*
                r2 = this;
                com.ss.android.lark.team.page.create_team.CreateTeamNamePiece r0 = r2.f136996a
                androidx.lifecycle.w<java.lang.String> r0 = r0.f136993h
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
                com.ss.android.lark.team.page.create_team.CreateTeamNamePiece r0 = r2.f136996a
                android.widget.ImageView r0 = com.ss.android.lark.team.page.create_team.CreateTeamNamePiece.m215258a(r0)
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.create_team.CreateTeamNamePiece.C55482a.afterTextChanged(android.text.Editable):void");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamNamePiece$c */
    public static final class View$OnClickListenerC55484c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateTeamNamePiece f136999a;

        View$OnClickListenerC55484c(CreateTeamNamePiece createTeamNamePiece) {
            this.f136999a = createTeamNamePiece;
        }

        public final void onClick(View view) {
            this.f136999a.mo189316d().setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamNamePiece$e */
    static final class View$OnClickListenerC55486e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateTeamNamePiece f137001a;

        View$OnClickListenerC55486e(CreateTeamNamePiece createTeamNamePiece) {
            this.f137001a = createTeamNamePiece;
        }

        public final void onClick(View view) {
            this.f137001a.mo189316d().requestFocus();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m215258a(CreateTeamNamePiece createTeamNamePiece) {
        ImageView imageView = createTeamNamePiece.f136991b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        }
        return imageView;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        return C51468a.m199490a((int) R.layout.view_create_team_name_input, context, (ViewGroup) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/ss/android/lark/team/page/create_team/CreateTeamNamePiece$onCreate$2$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamNamePiece$b */
    public static final class View$OnFocusChangeListenerC55483b implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ EditText f136997a;

        /* renamed from: b */
        final /* synthetic */ CreateTeamNamePiece f136998b;

        View$OnFocusChangeListenerC55483b(EditText editText, CreateTeamNamePiece createTeamNamePiece) {
            this.f136997a = editText;
            this.f136998b = createTeamNamePiece;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                CreateTeamNamePiece.m215258a(this.f136998b).setVisibility(4);
                KeyboardUtils.hideKeyboard(this.f136997a.getContext(), this.f136997a);
            } else {
                KeyboardUtils.showKeyboard(this.f136997a.getContext());
                this.f136998b.mo189318f();
                this.f136998b.mo177205s().setOnClickListener(null);
                this.f136998b.mo189317e().setVisibility(8);
            }
            this.f136998b.f136994i.mo5926a(Boolean.valueOf(z));
        }
    }
}
