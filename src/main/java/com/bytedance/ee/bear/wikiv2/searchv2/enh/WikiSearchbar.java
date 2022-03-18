package com.bytedance.ee.bear.wikiv2.searchv2.enh;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0003/01B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010\t\u001a\u00020\nJ\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0014J\u0006\u0010&\u001a\u00020\nJ\u0006\u0010'\u001a\u00020\u0018J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020\u0018H\u0002J\u0010\u0010*\u001a\u00020\u00182\b\b\u0001\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020\u0018H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00062"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "isSearching", "", "khObserver", "Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar$KHObserver;", "khProvider", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "viewDelegate", "Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar$ViewDelegate;)V", "bindListener", "", "bindView", "clearInputFocus", "doClearInput", "doClickCancel", "doClickInput", "doSearch", "queryKey", "", "hideKeyBoard", "init", "observeInput", "onClear", "onDetachedFromWindow", "onEndInput", "onPrepareInput", "requestInputFocus", "setEndInput", "setInputHint", "resid", "", "setPrepareInput", "showKeyBoard", "Companion", "KHObserver", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSearchbar extends LinearLayout {

    /* renamed from: a */
    public static final Companion f33213a = new Companion(null);

    /* renamed from: b */
    private final C10917c f33214b = new C10917c(new C10929e());

    /* renamed from: c */
    private boolean f33215c;

    /* renamed from: d */
    private final C68289a f33216d = new C68289a();

    /* renamed from: e */
    private ViewDelegate f33217e;

    /* renamed from: f */
    private AbstractC10550f f33218f;

    /* renamed from: g */
    private KHObserver f33219g;

    /* renamed from: h */
    private HashMap f33220h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar$ViewDelegate;", "", "onEnterSearch", "", "onExitSearch", "onSearchInput", "input", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$c */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo47013a();

        /* renamed from: a */
        void mo47014a(String str);

        /* renamed from: b */
        void mo47015b();
    }

    /* renamed from: a */
    public View mo47114a(int i) {
        if (this.f33220h == null) {
            this.f33220h = new HashMap();
        }
        View view = (View) this.f33220h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33220h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ViewDelegate getViewDelegate() {
        return this.f33217e;
    }

    /* renamed from: a */
    public final void mo47115a() {
        m51482h();
        m51483i();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m51489o();
    }

    /* renamed from: m */
    private final void m51487m() {
        m51488n();
        C10548d.m43703b((SpaceEditText) mo47114a(R.id.input));
    }

    /* renamed from: b */
    public final void mo47117b() {
        C13479a.m54764b("Wiki_WikiSearchbar", "clear click. ");
        m51485k();
    }

    /* renamed from: e */
    public final void mo47120e() {
        C10548d.m43697a(this);
        mo47121f();
    }

    /* renamed from: g */
    public final boolean mo47122g() {
        if (!this.f33215c) {
            return false;
        }
        mo47118c();
        return true;
    }

    /* renamed from: o */
    private final void m51489o() {
        AbstractC10550f fVar = this.f33218f;
        if (fVar != null) {
            fVar.mo39928b(this.f33219g);
        }
        this.f33216d.mo237935a();
    }

    /* renamed from: c */
    public final void mo47118c() {
        C13479a.m54764b("Wiki_WikiSearchbar", "cancel click. ");
        m51486l();
        ViewDelegate cVar = this.f33217e;
        if (cVar != null) {
            cVar.mo47015b();
        }
    }

    /* renamed from: d */
    public final void mo47119d() {
        C13479a.m54764b("Wiki_WikiSearchbar", "input click. ");
        m51485k();
        ViewDelegate cVar = this.f33217e;
        if (cVar != null) {
            cVar.mo47013a();
        }
        m51484j();
    }

    /* renamed from: f */
    public final void mo47121f() {
        SpaceEditText spaceEditText = (SpaceEditText) mo47114a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
        spaceEditText.setFocusableInTouchMode(true);
        ((SpaceEditText) mo47114a(R.id.input)).clearFocus();
    }

    /* renamed from: h */
    private final void m51482h() {
        Context context = getContext();
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity != null) {
            this.f33218f = AbstractC10550f.AbstractC10551a.m43717b(fragmentActivity);
            this.f33219g = new KHObserver();
            AbstractC10550f fVar = this.f33218f;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            fVar.mo39924a(this.f33219g);
        }
    }

    /* renamed from: j */
    private final void m51484j() {
        this.f33216d.mo237937a(C13716b.m55614a((SpaceEditText) mo47114a(R.id.input)).debounce(300, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e()).subscribe(new C12382h(this), C12383i.f33227a));
    }

    /* renamed from: l */
    private final void m51486l() {
        this.f33215c = false;
        mo47120e();
        ((SpaceEditText) mo47114a(R.id.input)).setText("");
        ImageView imageView = (ImageView) mo47114a(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "clear");
        imageView.setVisibility(8);
        TextView textView = (TextView) mo47114a(R.id.cancel);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancel");
        textView.setVisibility(8);
    }

    /* renamed from: n */
    private final void m51488n() {
        SpaceEditText spaceEditText = (SpaceEditText) mo47114a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
        spaceEditText.setFocusableInTouchMode(true);
        SpaceEditText spaceEditText2 = (SpaceEditText) mo47114a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText2, "input");
        spaceEditText2.setFocusable(true);
        ((SpaceEditText) mo47114a(R.id.input)).requestFocus();
    }

    /* renamed from: i */
    private final void m51483i() {
        ((ImageView) mo47114a(R.id.clear)).setOnClickListener(new View$OnClickListenerC12378d(this));
        ((TextView) mo47114a(R.id.cancel)).setOnClickListener(new View$OnClickListenerC12379e(this));
        ((SpaceEditText) mo47114a(R.id.input)).setOnEditorActionListener(new C12380f(this));
        ((SpaceEditText) mo47114a(R.id.input)).setOnFocusChangeListener(new View$OnFocusChangeListenerC12381g(this));
    }

    /* renamed from: k */
    private final void m51485k() {
        this.f33215c = true;
        SpaceEditText spaceEditText = (SpaceEditText) mo47114a(R.id.input);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
        if (!TextUtils.isEmpty(String.valueOf(spaceEditText.getText()))) {
            ((SpaceEditText) mo47114a(R.id.input)).setText("");
        }
        ImageView imageView = (ImageView) mo47114a(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "clear");
        imageView.setVisibility(8);
        TextView textView = (TextView) mo47114a(R.id.cancel);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancel");
        textView.setVisibility(0);
        m51487m();
    }

    public final void setViewDelegate(ViewDelegate cVar) {
        this.f33217e = cVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar$KHObserver;", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightObserver;", "(Lcom/bytedance/ee/bear/wikiv2/searchv2/enh/WikiSearchbar;)V", "onKeyboardHeightChanged", "", "khp", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "keyboardHeight", "", "orientation", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$b */
    public final class KHObserver implements AbstractC10549e {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public KHObserver() {
        }

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
        public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(fVar, "khp");
            if (fVar.mo39935i()) {
                ((SpaceEditText) WikiSearchbar.this.mo47114a(R.id.input)).requestFocus();
                return;
            }
            C13479a.m54764b("Wiki_WikiSearchbar", "KeyboardHeightObserver, keyboard dismiss, clearInputFocus.");
            WikiSearchbar.this.mo47121f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$d */
    public static final class View$OnClickListenerC12378d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchbar f33222a;

        View$OnClickListenerC12378d(WikiSearchbar wikiSearchbar) {
            this.f33222a = wikiSearchbar;
        }

        public final void onClick(View view) {
            this.f33222a.mo47117b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$e */
    public static final class View$OnClickListenerC12379e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchbar f33223a;

        View$OnClickListenerC12379e(WikiSearchbar wikiSearchbar) {
            this.f33223a = wikiSearchbar;
        }

        public final void onClick(View view) {
            this.f33223a.mo47118c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$i */
    public static final class C12383i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12383i f33227a = new C12383i();

        C12383i() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54765b("Wiki_WikiSearchbar", "onTextChanged err. ", th);
        }
    }

    public final void setInputHint(int i) {
        ((SpaceEditText) mo47114a(R.id.input)).setHint(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "charSequence", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$h */
    public static final class C12382h<T> implements Consumer<CharSequence> {

        /* renamed from: a */
        final /* synthetic */ WikiSearchbar f33226a;

        C12382h(WikiSearchbar wikiSearchbar) {
            this.f33226a = wikiSearchbar;
        }

        /* renamed from: a */
        public final void accept(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "charSequence");
            SpaceEditText spaceEditText = (SpaceEditText) this.f33226a.mo47114a(R.id.input);
            Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
            if (spaceEditText.isFocused()) {
                C13479a.m54764b("Wiki_WikiSearchbar", "onTextChanged, query: " + charSequence);
                this.f33226a.mo47116a(charSequence.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo47116a(String str) {
        ImageView imageView = (ImageView) mo47114a(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "clear");
        imageView.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("Wiki_WikiSearchbar", "doSearch, input empty, setPrepareInput. ");
            m51485k();
        }
        ViewDelegate cVar = this.f33217e;
        if (cVar != null) {
            cVar.mo47014a(str);
        }
    }

    public WikiSearchbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.wiki_searchv2_bar, this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$g */
    public static final class View$OnFocusChangeListenerC12381g implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchbar f33225a;

        View$OnFocusChangeListenerC12381g(WikiSearchbar wikiSearchbar) {
            this.f33225a = wikiSearchbar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                SpaceEditText spaceEditText = (SpaceEditText) this.f33225a.mo47114a(R.id.input);
                Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "input");
                if (TextUtils.isEmpty(String.valueOf(spaceEditText.getText()))) {
                    this.f33225a.mo47119d();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "textView", "Landroid/widget/TextView;", "actionId", "", "keyEvent", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.enh.WikiSearchbar$f */
    public static final class C12380f implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ WikiSearchbar f33224a;

        C12380f(WikiSearchbar wikiSearchbar) {
            this.f33224a = wikiSearchbar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return true;
            }
            C13479a.m54764b("Wiki_WikiSearchbar", "keyboard search click. ");
            this.f33224a.mo47120e();
            return true;
        }
    }
}
