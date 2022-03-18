package com.ss.android.lark.mm.module.detail.search;

import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ClickButtonEvent;
import com.ss.android.lark.mm.statistics.hitpoint.SubtitleLoadTimeEvent;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.SoftKeyboardUtil;
import com.ss.android.lark.mm.utils.ViewTreeObserver$OnGlobalLayoutListenerC47104h;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\b\u0010+\u001a\u00020,H\u0002J\u0016\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u0015J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020,H\u0002J\u0010\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020\nH\u0002J\b\u00104\u001a\u00020,H\u0014J\u0010\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020\nH\u0002J\u0010\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\nH\u0016J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\u0015H\u0002J\u0010\u0010;\u001a\u00020,2\u0006\u0010:\u001a\u00020\u0015H\u0002J\u0001\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010!2\u0006\u0010A\u001a\u00020!2r\b\u0002\u0010B\u001al\u0012\u0013\u0012\u00110!¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\u0015¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(G\u00126\u00124\u0012\u0015\u0012\u0013\u0018\u00010I¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(J\u0012\u0013\u0012\u00110\n¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020,0H\u0012\u0004\u0012\u00020,\u0018\u00010CJ\b\u0010K\u001a\u00020,H\u0002J\b\u0010L\u001a\u00020,H\u0002J\b\u0010M\u001a\u00020,H\u0002J\b\u0010N\u001a\u00020,H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000RC\u0010\u001e\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015 \"*\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010 0 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020!X.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/MmSearchBar;", "Landroid/widget/RelativeLayout;", "Lcom/ss/android/lark/mm/utils/MmKeyboardUtils$SoftKeyboardToggleListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "containerNavView", "Landroid/view/View;", "etKeywordView", "Landroid/widget/EditText;", "findDisposable", "Lio/reactivex/disposables/Disposable;", "isKeyword", "", "()Z", "setKeyword", "(Z)V", "ivClear", "ivLoadingView", "ivNextView", "Landroid/widget/ImageView;", "ivPreView", "keywordSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "getKeywordSubject", "()Lio/reactivex/subjects/PublishSubject;", "objectToken", "resultIndex", "resultTotal", "tvDoneView", "tvIndicatorView", "Landroid/widget/TextView;", "enableNav", "", "find", "text", "isAuto", "hide", "init", "move", "offset", "onDetachedFromWindow", "onFindResult", "total", "onToggleSoftKeyboard", "height", "setIvNextViewEnable", "isEnable", "setIvPreViewEnable", "show", "token", "findDelegate", "Lcom/ss/android/lark/mm/module/detail/search/IFindDelegate;", "keyword", "translateLang", "onFindDataCallback", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", SearchIntents.EXTRA_QUERY, "isFindKeyword", "Lkotlin/Function2;", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "res", "startLoading", "stopLoading", "updateNextViewIcon", "updatePreViewIcon", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmSearchBar extends RelativeLayout implements ViewTreeObserver$OnGlobalLayoutListenerC47104h.AbstractC47105a {

    /* renamed from: a */
    public int f116214a;

    /* renamed from: b */
    public EditText f116215b;

    /* renamed from: c */
    public ImageView f116216c;

    /* renamed from: d */
    public ImageView f116217d;

    /* renamed from: e */
    public View f116218e;

    /* renamed from: f */
    private final C68296b<Triple<String, Boolean, Boolean>> f116219f;

    /* renamed from: g */
    private int f116220g;

    /* renamed from: h */
    private Disposable f116221h;

    /* renamed from: i */
    private String f116222i;

    /* renamed from: j */
    private View f116223j;

    /* renamed from: k */
    private TextView f116224k;

    /* renamed from: l */
    private View f116225l;

    /* renamed from: m */
    private View f116226m;

    /* renamed from: n */
    private boolean f116227n;

    /* renamed from: a */
    public final boolean mo162007a() {
        return this.f116227n;
    }

    public final C68296b<Triple<String, Boolean, Boolean>> getKeywordSubject() {
        return this.f116219f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver$OnGlobalLayoutListenerC47104h.m186556a(this);
    }

    /* renamed from: e */
    private final void m182665e() {
        View view = this.f116226m;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadingView");
        }
        view.setVisibility(8);
        View view2 = this.f116226m;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadingView");
        }
        view2.clearAnimation();
    }

    /* renamed from: f */
    private final void m182666f() {
        int i = this.f116214a;
        if (i == 1) {
            setIvPreViewEnable(false);
        } else if (i > 1) {
            setIvPreViewEnable(true);
        }
        int i2 = this.f116214a;
        int i3 = this.f116220g;
        if (i2 == i3) {
            setIvNextViewEnable(false);
        } else if (i2 < i3) {
            setIvNextViewEnable(true);
        }
    }

    /* renamed from: g */
    private final void m182667g() {
        int i;
        ImageView imageView = this.f116217d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNextView");
        }
        boolean isEnabled = imageView.isEnabled();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (isEnabled) {
            i = R.color.icon_n1;
        } else {
            i = R.color.icon_disable;
        }
        int color = UDColorUtils.getColor(context, i);
        ImageView imageView2 = this.f116217d;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNextView");
        }
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_down_outlined, color));
    }

    /* renamed from: h */
    private final void m182668h() {
        int i;
        ImageView imageView = this.f116216c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivPreView");
        }
        boolean isEnabled = imageView.isEnabled();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (isEnabled) {
            i = R.color.icon_n1;
        } else {
            i = R.color.icon_disable;
        }
        int color = UDColorUtils.getColor(context, i);
        ImageView imageView2 = this.f116216c;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivPreView");
        }
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_up_outlined, color));
    }

    /* renamed from: c */
    public final void mo162009c() {
        Disposable disposable = this.f116221h;
        if (disposable != null) {
            disposable.dispose();
        }
        EditText editText = this.f116215b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
        }
        editText.setText("");
        SoftKeyboardUtil uVar = SoftKeyboardUtil.f118667a;
        EditText editText2 = this.f116215b;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
        }
        uVar.mo165512a(editText2);
    }

    /* renamed from: b */
    public final void mo162008b() {
        View view = this.f116218e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
        }
        view.setVisibility(8);
        TextView textView = this.f116224k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvIndicatorView");
        }
        textView.setVisibility(8);
        setIvPreViewEnable(false);
        setIvNextViewEnable(false);
        View view2 = this.f116226m;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadingView");
        }
        view2.setVisibility(0);
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillAfter(false);
        View view3 = this.f116226m;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadingView");
        }
        view3.setAnimation(rotateAnimation);
    }

    /* renamed from: d */
    private final void m182664d() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_search_bar, this);
        setGravity(80);
        View findViewById = findViewById(R.id.etKeyword);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.etKeyword)");
        EditText editText = (EditText) findViewById;
        this.f116215b = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
        }
        editText.setOnEditorActionListener(new C46115a(this));
        EditText editText2 = this.f116215b;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
        }
        editText2.addTextChangedListener(new C46116b(this));
        View findViewById2 = findViewById(R.id.ivPre);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.ivPre)");
        ImageView imageView = (ImageView) findViewById2;
        this.f116216c = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivPreView");
        }
        C47110e.m186572a(imageView, C57582a.m223600a(8));
        View findViewById3 = findViewById(R.id.ivNext);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.ivNext)");
        ImageView imageView2 = (ImageView) findViewById3;
        this.f116217d = imageView2;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNextView");
        }
        C47110e.m186572a(imageView2, C57582a.m223600a(8));
        View findViewById4 = findViewById(R.id.tvDone);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.tvDone)");
        this.f116223j = findViewById4;
        View findViewById5 = findViewById(R.id.tvIndicator);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.tvIndicator)");
        this.f116224k = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.containerNav);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.containerNav)");
        this.f116225l = findViewById6;
        View findViewById7 = findViewById(R.id.ivLoading);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.ivLoading)");
        this.f116226m = findViewById7;
        View findViewById8 = findViewById(R.id.ivClear);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.ivClear)");
        this.f116218e = findViewById8;
        if (findViewById8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
        }
        C47110e.m186573a(findViewById8, new C46117c(this));
        ViewTreeObserver$OnGlobalLayoutListenerC47104h.m186555a(C47098d.m186533a(getContext()), this);
    }

    public final void setKeyword(boolean z) {
        this.f116227n = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/detail/search/MmSearchBar$init$1", "Landroid/widget/TextView$OnEditorActionListener;", "onEditorAction", "", "v", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.MmSearchBar$a */
    public static final class C46115a implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ MmSearchBar f116228a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46115a(MmSearchBar mmSearchBar) {
            this.f116228a = mmSearchBar;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            MmSearchBar mmSearchBar = this.f116228a;
            mmSearchBar.mo162006a(MmSearchBar.m182660a(mmSearchBar).getText().toString(), false);
            SoftKeyboardUtil.f118667a.mo165512a(MmSearchBar.m182660a(this.f116228a));
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/mm/module/detail/search/MmSearchBar$init$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.MmSearchBar$b */
    public static final class C46116b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MmSearchBar f116229a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46116b(MmSearchBar mmSearchBar) {
            this.f116229a = mmSearchBar;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            Editable text = MmSearchBar.m182660a(this.f116229a).getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "etKeywordView.text");
            if (text.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || this.f116229a.mo162007a()) {
                MmSearchBar.m182661b(this.f116229a).setVisibility(8);
            } else {
                MmSearchBar.m182661b(this.f116229a).setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.MmSearchBar$c */
    public static final class C46117c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmSearchBar this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46117c(MmSearchBar mmSearchBar) {
            super(1);
            this.this$0 = mmSearchBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            MmSearchBar.m182660a(this.this$0).setText((CharSequence) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSearchBar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m182660a(MmSearchBar mmSearchBar) {
        EditText editText = mmSearchBar.f116215b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m182661b(MmSearchBar mmSearchBar) {
        View view = mmSearchBar.f116218e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m182662c(MmSearchBar mmSearchBar) {
        ImageView imageView = mmSearchBar.f116216c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivPreView");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ ImageView m182663d(MmSearchBar mmSearchBar) {
        ImageView imageView = mmSearchBar.f116217d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNextView");
        }
        return imageView;
    }

    private final void setIvNextViewEnable(boolean z) {
        ImageView imageView = this.f116217d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNextView");
        }
        imageView.setEnabled(z);
        m182667g();
    }

    private final void setIvPreViewEnable(boolean z) {
        ImageView imageView = this.f116216c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivPreView");
        }
        imageView.setEnabled(z);
        m182668h();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "triple", "Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.MmSearchBar$d */
    public static final class C46118d<T> implements Consumer<Triple<? extends String, ? extends Boolean, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ MmSearchBar f116230a;

        /* renamed from: b */
        final /* synthetic */ Function3 f116231b;

        /* renamed from: c */
        final /* synthetic */ String f116232c;

        /* renamed from: d */
        final /* synthetic */ IFindDelegate f116233d;

        C46118d(MmSearchBar mmSearchBar, Function3 oVar, String str, IFindDelegate aVar) {
            this.f116230a = mmSearchBar;
            this.f116231b = oVar;
            this.f116232c = str;
            this.f116233d = aVar;
        }

        /* renamed from: a */
        public final void accept(final Triple<String, Boolean, Boolean> triple) {
            boolean z;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (triple.getFirst().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f116230a.mo162008b();
            }
            Function3 oVar = this.f116231b;
            if (oVar != null) {
                Unit unit = (Unit) oVar.invoke(triple.getFirst(), triple.getThird(), new Function2<FindResponse, Integer, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.search.MmSearchBar.C46118d.C461191 */
                    final /* synthetic */ C46118d this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public /* synthetic */ Unit invoke(FindResponse findResponse, Integer num) {
                        invoke(findResponse, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(FindResponse findResponse, int i) {
                        this.this$0.f116230a.mo162004a(i);
                        if (i >= 0) {
                            if (((Boolean) triple.getThird()).booleanValue()) {
                                C47083e.m186423a(this.this$0.f116230a.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("subtitle_search").mo165413a("action_type", "keywords_input").mo165413a("action_result", String.valueOf(i)).mo165421c());
                            } else if (((Boolean) triple.getSecond()).booleanValue()) {
                                C47083e.m186423a(this.this$0.f116230a.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("subtitle_search").mo165423e("none").mo165420c("nonblank_input_auto").mo165429k(this.this$0.f116232c).mo165421c());
                                C47083e.m186423a(this.this$0.f116230a.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("subtitle_search").mo165413a("action_type", "nonblank_input_auto").mo165413a("action_result", String.valueOf(i)).mo165421c());
                            } else {
                                C47083e.m186423a(this.this$0.f116230a.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("subtitle_search").mo165423e("none").mo165420c("nonblank_input_enter").mo165429k(this.this$0.f116232c).mo165421c());
                                C47083e.m186423a(this.this$0.f116230a.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("subtitle_search").mo165413a("action_type", "nonblank_input_enter").mo165413a("action_result", String.valueOf(i)).mo165421c());
                            }
                            SubtitleLoadTimeEvent nVar = new SubtitleLoadTimeEvent("subtitle_search_load", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            Context context = this.this$0.f116230a.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "context");
                            nVar.mo165434a(context).mo165437a();
                            if (i == 0) {
                                C45859k.m181685a(RunnableC461201.f116234a);
                                C47083e.m186423a(this.this$0.f116230a.getContext(), "vc_minutes_popup_view", C47086i.m186432a().mo165427i("no_search_content").mo165421c());
                            }
                        }
                        this.this$0.f116233d.mo162027a(findResponse);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.MmSearchBar$e */
    static final class View$OnClickListenerC46121e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmSearchBar f116235a;

        /* renamed from: b */
        final /* synthetic */ IFindDelegate f116236b;

        View$OnClickListenerC46121e(MmSearchBar mmSearchBar, IFindDelegate aVar) {
            this.f116235a = mmSearchBar;
            this.f116236b = aVar;
        }

        public final void onClick(View view) {
            if (MmSearchBar.m182662c(this.f116235a).isEnabled()) {
                ClickButtonEvent aVar = new ClickButtonEvent("subtitle_search_location_change", "up", null, null, null, null, null, SmActions.ACTION_CALLING_EXIT, null);
                Context context = this.f116235a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                aVar.mo165434a(context).mo165437a();
                C47083e.m186423a(this.f116235a.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("subtitle_search_location_change").mo165423e("none").mo165420c("up").mo165421c());
            }
            this.f116235a.mo162010c(-1);
            this.f116236b.mo162026a(this.f116235a.f116214a - 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.MmSearchBar$f */
    static final class View$OnClickListenerC46122f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmSearchBar f116237a;

        /* renamed from: b */
        final /* synthetic */ IFindDelegate f116238b;

        View$OnClickListenerC46122f(MmSearchBar mmSearchBar, IFindDelegate aVar) {
            this.f116237a = mmSearchBar;
            this.f116238b = aVar;
        }

        public final void onClick(View view) {
            if (MmSearchBar.m182663d(this.f116237a).isEnabled()) {
                ClickButtonEvent aVar = new ClickButtonEvent("subtitle_search_location_change", "down", null, null, null, null, null, SmActions.ACTION_CALLING_EXIT, null);
                Context context = this.f116237a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                aVar.mo165434a(context).mo165437a();
                C47083e.m186423a(this.f116237a.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("subtitle_search_location_change").mo165423e("none").mo165420c("down").mo165421c());
            }
            this.f116237a.mo162010c(1);
            this.f116238b.mo162026a(this.f116237a.f116214a - 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.MmSearchBar$g */
    static final class View$OnClickListenerC46123g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmSearchBar f116239a;

        /* renamed from: b */
        final /* synthetic */ IFindDelegate f116240b;

        View$OnClickListenerC46123g(MmSearchBar mmSearchBar, IFindDelegate aVar) {
            this.f116239a = mmSearchBar;
            this.f116240b = aVar;
        }

        public final void onClick(View view) {
            ClickButtonEvent aVar = new ClickButtonEvent("subtitle_search_location_change", "done", null, null, null, null, null, SmActions.ACTION_CALLING_EXIT, null);
            Context context = this.f116239a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            aVar.mo165434a(context).mo165437a();
            C47083e.m186423a(this.f116239a.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("subtitle_search_location_change").mo165423e("none").mo165420c("enter").mo165421c());
            this.f116239a.mo162009c();
            this.f116240b.mo162025a();
            this.f116239a.mo162004a(-1);
            this.f116240b.mo162027a((FindResponse) null);
        }
    }

    /* renamed from: a */
    public final void mo162004a(int i) {
        int i2;
        m182665e();
        View view = this.f116225l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerNavView");
        }
        int i3 = 8;
        if (i > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        TextView textView = this.f116224k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvIndicatorView");
        }
        if (i >= 0) {
            i3 = 0;
        }
        textView.setVisibility(i3);
        if (i > 0) {
            this.f116214a = 1;
            this.f116220g = i;
            m182666f();
            TextView textView2 = this.f116224k;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvIndicatorView");
            }
            textView2.setText("1/" + this.f116220g);
            return;
        }
        this.f116214a = 0;
        this.f116220g = 0;
    }

    /* renamed from: c */
    public final void mo162010c(int i) {
        int i2 = this.f116214a;
        if (i2 + i >= 1 && i2 + i <= this.f116220g) {
            this.f116214a = i2 + i;
            m182666f();
            TextView textView = this.f116224k;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvIndicatorView");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f116214a);
            sb.append('/');
            sb.append(this.f116220g);
            textView.setText(sb.toString());
        }
    }

    @Override // com.ss.android.lark.mm.utils.ViewTreeObserver$OnGlobalLayoutListenerC47104h.AbstractC47105a
    /* renamed from: b */
    public void mo161814b(int i) {
        boolean z;
        int i2 = 0;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = this.f116218e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivClear");
            }
            EditText editText = this.f116215b;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
            }
            Editable text = editText.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "etKeywordView.text");
            if (!(true ^ StringsKt.isBlank(text))) {
                i2 = 8;
            }
            view.setVisibility(i2);
            View view2 = this.f116225l;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerNavView");
            }
            view2.setVisibility(8);
            TextView textView = this.f116224k;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvIndicatorView");
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo162006a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        C68296b<Triple<String, Boolean, Boolean>> bVar = this.f116219f;
        if (this.f116227n) {
            str = str.substring(1, str.length() - 1);
            Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        bVar.onNext(new Triple<>(str, Boolean.valueOf(z), Boolean.valueOf(this.f116227n)));
        this.f116227n = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSearchBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSearchBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        C68296b<Triple<String, Boolean, Boolean>> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create<Tr…ing, Boolean, Boolean>>()");
        this.f116219f = a;
        m182664d();
    }

    /* renamed from: a */
    public final void mo162005a(String str, IFindDelegate aVar, String str2, String str3, Function3<? super String, ? super Boolean, ? super Function2<? super FindResponse, ? super Integer, Unit>, Unit> oVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(aVar, "findDelegate");
        Intrinsics.checkParameterIsNotNull(str3, "translateLang");
        this.f116222i = str;
        String str4 = str2;
        boolean z2 = false;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f116227n = !z;
        Disposable disposable = this.f116221h;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f116221h = this.f116219f.debounce(600, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C46118d(this, oVar, str3, aVar));
        ImageView imageView = this.f116216c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivPreView");
        }
        imageView.setOnClickListener(new View$OnClickListenerC46121e(this, aVar));
        ImageView imageView2 = this.f116217d;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNextView");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC46122f(this, aVar));
        View view = this.f116223j;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDoneView");
        }
        view.setOnClickListener(new View$OnClickListenerC46123g(this, aVar));
        if (str2 != null) {
            if (str4.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                String str5 = (char) 8220 + str2 + (char) 8221;
                EditText editText = this.f116215b;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
                }
                editText.requestFocus();
                EditText editText2 = this.f116215b;
                if (editText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
                }
                editText2.setText(str5);
                EditText editText3 = this.f116215b;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
                }
                editText3.setSelection(str5.length());
                mo162006a(str5, true);
                return;
            }
        }
        SoftKeyboardUtil uVar = SoftKeyboardUtil.f118667a;
        EditText editText4 = this.f116215b;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etKeywordView");
        }
        uVar.mo165514b(editText4);
    }
}
