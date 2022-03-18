package com.ss.android.lark.mail.impl.utils.tokenautocomplete;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.C43847e;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class TokenCompleteTextView<T> extends AppCompatAutoCompleteTextView implements TextView.OnEditorActionListener, C43847e.AbstractC43848a {

    /* renamed from: w */
    static final /* synthetic */ boolean f111197w = true;

    /* renamed from: A */
    private boolean f111198A;

    /* renamed from: B */
    private boolean f111199B = f111197w;

    /* renamed from: C */
    private boolean f111200C;

    /* renamed from: D */
    private C43843b f111201D = new C43843b(UIHelper.dp2px(24.0f));

    /* renamed from: E */
    private final Runnable f111202E = new Runnable() {
        /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.RunnableC438271 */

        public void run() {
            Log.m165389i("", "Long press!");
            if (TokenCompleteTextView.this.f111225v != null) {
                TokenCompleteTextView.this.f111223t = TokenCompleteTextView.f111197w;
                TokenCompleteTextView.this.f111225v.mo156192f();
            }
        }
    };

    /* renamed from: F */
    private AbstractC43835a<T> f111203F;

    /* renamed from: a */
    private T f111204a;

    /* renamed from: b */
    private TokenCompleteTextView<T>.C43840f f111205b;

    /* renamed from: c */
    private TokenCompleteTextView<T>.C43841g f111206c;

    /* renamed from: d */
    private SpannableStringBuilder f111207d;

    /* renamed from: e */
    private Layout f111208e;

    /* renamed from: f */
    boolean f111209f;

    /* renamed from: g */
    public Tokenizer f111210g;

    /* renamed from: h */
    public AbstractC43839e<T> f111211h;

    /* renamed from: i */
    protected C43842a f111212i;

    /* renamed from: j */
    public TokenClickStyle f111213j = TokenClickStyle.SelectClick;

    /* renamed from: k */
    protected CharSequence f111214k = "";

    /* renamed from: l */
    public boolean f111215l;

    /* renamed from: m */
    public boolean f111216m = f111197w;

    /* renamed from: n */
    public boolean f111217n;

    /* renamed from: o */
    public boolean f111218o = f111197w;

    /* renamed from: p */
    public boolean f111219p;

    /* renamed from: q */
    protected boolean f111220q;

    /* renamed from: r */
    public int f111221r = -1;

    /* renamed from: s */
    public transient String f111222s;

    /* renamed from: t */
    public boolean f111223t;

    /* renamed from: u */
    protected int f111224u;

    /* renamed from: v */
    public TokenCompleteTextView<T>.C43837c f111225v;

    /* renamed from: x */
    private boolean f111226x;

    /* renamed from: y */
    private boolean f111227y;

    /* renamed from: z */
    private boolean f111228z;

    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$a */
    public interface AbstractC43835a<T> {
        /* renamed from: a */
        void mo150638a(T t);

        /* renamed from: b */
        void mo150640b(T t);
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$e */
    public interface AbstractC43839e<T> {
        /* renamed from: a */
        void mo156198a(T t);

        /* renamed from: b */
        void mo156199b(T t);

        /* renamed from: c */
        void mo156200c(T t);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m173721C() {
        this.f111198A = false;
    }

    /* renamed from: a */
    public abstract String mo155981a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155963a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155983a(View view, int[] iArr, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo155990a(TokenCompleteTextView tokenCompleteTextView, ClipData.Item item) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo155991a(T t) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ClipData mo155993b(T t) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo155995b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<T> mo156115b(List list) {
        return list;
    }

    /* renamed from: b */
    public void mo155996b(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract View mo156006e(T t);

    /* renamed from: f */
    public boolean mo156123f(T t) {
        return false;
    }

    /* renamed from: g */
    public boolean mo156124g(T t) {
        return f111197w;
    }

    /* renamed from: k */
    public boolean mo156137k() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo156139m() {
        return " ";
    }

    /* renamed from: x */
    public void mo156170x() {
        this.f111223t = false;
    }

    public enum TokenClickStyle {
        None(false),
        Delete(false),
        Select(TokenCompleteTextView.f111197w),
        SelectDeselect(TokenCompleteTextView.f111197w),
        SelectClick(TokenCompleteTextView.f111197w);
        
        private final boolean mIsSelectable;

        public boolean isSelectable() {
            return this.mIsSelectable;
        }

        private TokenClickStyle(boolean z) {
            this.mIsSelectable = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$c */
    public class C43837c extends C43847e implements NoCopySpan {

        /* renamed from: a */
        public final T f111254a;

        /* renamed from: b */
        public int f111255b;

        /* renamed from: c */
        protected int f111256c;

        /* renamed from: d */
        protected int f111257d;

        /* renamed from: k */
        private boolean f111259k;

        /* renamed from: a */
        public T mo156184a() {
            return this.f111254a;
        }

        /* renamed from: b */
        public boolean mo156188b() {
            return this.f111279f.isSelected();
        }

        /* renamed from: d */
        public void mo156190d() {
            mo156185a(1);
        }

        /* renamed from: c */
        public boolean mo156189c() {
            if (!this.f111259k || !mo156188b()) {
                return false;
            }
            return TokenCompleteTextView.f111197w;
        }

        /* renamed from: e */
        public void mo156191e() {
            this.f111279f.setActivated(TokenCompleteTextView.f111197w);
            TokenCompleteTextView.this.invalidate();
        }

        /* renamed from: h */
        public boolean mo156194h() {
            return TokenCompleteTextView.this.mo155991a((Object) this.f111254a);
        }

        /* renamed from: i */
        private int[] m173793i() {
            return new int[]{this.f111280g, this.f111281h, this.f111279f.getWidth(), this.f111279f.getHeight()};
        }

        /* renamed from: g */
        public void mo156193g() {
            this.f111279f.getBackground().setAlpha(255);
            TokenCompleteTextView.this.invalidate();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        public void mo156192f() {
            if (TokenCompleteTextView.this.getText() != null) {
                int i = C438282.f111230a[TokenCompleteTextView.this.f111213j.ordinal()];
                if (i == 1 || i == 3) {
                    ClipData b = TokenCompleteTextView.this.mo155993b(mo156184a());
                    if (b == null) {
                        TokenCompleteTextView.this.mo156170x();
                        return;
                    }
                    View.DragShadowBuilder bVar = new C43836b(this.f111279f, 1.2f, this.f111256c, this.f111257d);
                    TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
                    tokenCompleteTextView.startDrag(b, bVar, tokenCompleteTextView, MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
                    this.f111279f.getBackground().setAlpha(77);
                    TokenCompleteTextView.this.invalidate();
                }
            }
        }

        /* renamed from: a */
        public void mo156185a(int i) {
            Editable text = TokenCompleteTextView.this.getText();
            if (text != null) {
                if (!mo156188b() || i != 0) {
                    if (mo156188b() && i == 1) {
                        this.f111259k = false;
                    }
                    int i2 = C438282.f111230a[TokenCompleteTextView.this.f111213j.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        if (!this.f111279f.isSelected()) {
                            TokenCompleteTextView.this.mo156167u();
                            this.f111255b++;
                            this.f111279f.setSelected(TokenCompleteTextView.f111197w);
                            TokenCompleteTextView.this.invalidate();
                            TokenCompleteTextView.this.setCursorVisible(false);
                            return;
                        } else if (TokenCompleteTextView.this.f111213j == TokenClickStyle.SelectDeselect || !TokenCompleteTextView.this.mo156124g(this.f111254a)) {
                            this.f111255b--;
                            this.f111279f.setSelected(false);
                            TokenCompleteTextView.this.invalidate();
                            return;
                        } else {
                            this.f111255b++;
                            if (!TokenCompleteTextView.this.mo156137k()) {
                                if (this.f111255b % 2 == 0) {
                                    TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
                                    tokenCompleteTextView.mo155983a(tokenCompleteTextView, m173793i(), this.f111254a);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (i2 != 4) {
                        if (TokenCompleteTextView.this.getSelectionStart() != text.getSpanEnd(this)) {
                            TokenCompleteTextView.this.setSelection(text.getSpanEnd(this));
                            return;
                        }
                        return;
                    }
                    if (TokenCompleteTextView.this.mo156124g(this.f111254a)) {
                        TokenCompleteTextView.this.mo156110a(text, this);
                        return;
                    }
                    return;
                }
                this.f111259k = TokenCompleteTextView.f111197w;
            }
        }

        /* renamed from: a */
        public void mo156186a(int i, int i2) {
            this.f111256c = Math.max(i - this.f111280g, 0);
            this.f111257d = Math.max(i2 - this.f111281h, 0);
        }

        /* renamed from: a */
        public boolean mo156187a(float f, float f2) {
            int[] i = m173793i();
            int i2 = i[1] + i[3];
            if (((float) (i[0] + i[2])) <= f || ((float) i2) <= f2) {
                return false;
            }
            return TokenCompleteTextView.f111197w;
        }

        public C43837c(View view, T t) {
            super(view, TokenCompleteTextView.this);
            this.f111254a = t;
        }
    }

    /* renamed from: f */
    private void mo156009f() {
        performCompletion();
    }

    public int getMailContactsType() {
        return this.f111224u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo156158s() {
        return this.f111219p;
    }

    /* renamed from: a */
    public void mo156114a(boolean z) {
        this.f111227y = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo156109a(C43844c cVar) {
        if (this.f111215l) {
            return "";
        }
        Editable text = getText();
        if (cVar.f111270a >= 0 && cVar.f111271b >= 0) {
            int a = m173723a(text, cVar);
            if (cVar.f111270a >= 0 && cVar.f111271b >= 0) {
                String substring = TextUtils.substring(text, cVar.f111270a + a, cVar.f111271b);
                Log.m165379d("TokenAutoComplete", "Current completion text: " + substring);
                return substring;
            }
        }
        return "";
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.C43847e.AbstractC43848a
    /* renamed from: a */
    public int mo156108a(boolean z, Paint paint) {
        int i;
        int i2;
        Editable text = getText();
        int i3 = 0;
        if (text != null) {
            i2 = ((C43837c[]) text.getSpans(0, text.length(), C43837c.class)).length;
            i = ((C43842a[]) text.getSpans(0, text.length(), C43842a.class)).length;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2 + i;
        if (!isFocused() && i4 > 1) {
            i3 = m173730b(paint);
        }
        return ((((int) mo156141o()) - mo156107a(paint)) - i3) - UIHelper.dp2px(16.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155986a(String str, IGetDataCallback<T> iGetDataCallback) {
        replaceText(convertSelectionToString(mo155995b(str)));
    }

    /* renamed from: a */
    public void mo156113a(Runnable runnable) {
        C43844c firstCandidateTokenRange = getFirstCandidateTokenRange();
        getText().removeSpan(this.f111205b);
        if (firstCandidateTokenRange != null) {
            mo156111a(firstCandidateTokenRange, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo156111a(final C43844c cVar, final Runnable runnable) {
        if (cVar != null && cVar.mo156213a() >= Math.max(getThreshold(), 1)) {
            final String a = mo156109a(cVar);
            mo155986a(a, new IGetDataCallback<T>() {
                /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438315 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
                    tokenCompleteTextView.mo156112a(tokenCompleteTextView.convertSelectionToString(tokenCompleteTextView.mo155995b(a)), cVar);
                    TokenCompleteTextView tokenCompleteTextView2 = TokenCompleteTextView.this;
                    tokenCompleteTextView2.mo156111a(tokenCompleteTextView2.getFirstCandidateTokenRange(), runnable);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                public void onSuccess(T t) {
                    if (t == null) {
                        t = (T) TokenCompleteTextView.this.mo155995b(a);
                    }
                    TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
                    tokenCompleteTextView.mo156112a(tokenCompleteTextView.convertSelectionToString(t), cVar);
                    TokenCompleteTextView tokenCompleteTextView2 = TokenCompleteTextView.this;
                    tokenCompleteTextView2.mo156111a(tokenCompleteTextView2.getFirstCandidateTokenRange(), runnable);
                }
            });
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v10, resolved type: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$e<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156112a(CharSequence charSequence, C43844c cVar) {
        AbstractC43835a<T> aVar;
        clearComposingText();
        T t = this.f111204a;
        if (t != null && !t.toString().equals("")) {
            TokenCompleteTextView<T>.C43837c h = mo156132h(this.f111204a);
            Editable text = getText();
            int a = m173723a(text, cVar);
            String substring = TextUtils.substring(text, cVar.f111270a + a, cVar.f111271b);
            if (substring.length() > 0) {
                this.f111222s = substring;
            }
            if (text != null) {
                int i = 1;
                this.f111219p = f111197w;
                if (h == null) {
                    text.replace(cVar.f111270a + a, cVar.f111271b, "");
                } else if (mo156123f(h.mo156184a())) {
                    text.replace(cVar.f111270a + a, cVar.f111271b, "");
                    AbstractC43839e<T> eVar = this.f111211h;
                    if (eVar != 0) {
                        eVar.mo156200c(h.mo156184a());
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (cVar.f111270a <= 0 || !TextUtils.substring(text, cVar.f111270a - 1, cVar.f111270a).equals(">")) {
                        i = 0;
                    } else {
                        spannableStringBuilder.append((CharSequence) mo156139m());
                    }
                    spannableStringBuilder.append(mo156003d(h.f111254a));
                    text.replace(cVar.f111270a + a, cVar.f111271b, spannableStringBuilder);
                    text.setSpan(h, cVar.f111270a + a + i, cVar.f111270a + a + spannableStringBuilder.length(), 33);
                    text.insert(cVar.f111270a + a + spannableStringBuilder.length(), mo156139m());
                }
                this.f111219p = false;
            }
            mo155996b(getObjects().size());
            if (!this.f111199B && !this.f111220q && (aVar = this.f111203F) != null) {
                aVar.mo150640b(h.f111254a);
            }
        }
    }

    /* renamed from: a */
    public void mo155985a(T t, boolean z) {
        AbstractC43835a<T> aVar;
        if (t != null) {
            if (mo156123f(t)) {
                AbstractC43839e<T> eVar = this.f111211h;
                if (eVar != null) {
                    eVar.mo156200c(t);
                }
            } else if (this.f111221r == -1 || getObjects().size() != this.f111221r) {
                TokenCompleteTextView<T>.C43837c h = mo156132h(t);
                m173724a(h);
                if (z) {
                    h.mo156190d();
                } else if (getText() != null && isFocused()) {
                    setSelection(getText().length());
                }
                if (!this.f111220q && (aVar = this.f111203F) != null) {
                    aVar.mo150640b(t);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156110a(Editable editable, TokenCompleteTextView<T>.C43837c cVar) {
        AbstractC43835a<T> aVar;
        int spanEnd = editable.getSpanEnd(cVar);
        if (spanEnd >= 0) {
            if (spanEnd < editable.length() && editable.charAt(spanEnd) == ' ') {
                spanEnd++;
            }
            if (!this.f111220q && (aVar = this.f111203F) != null) {
                aVar.mo150638a(cVar.f111254a);
            }
            this.f111219p = f111197w;
            try {
                editable.delete(editable.getSpanStart(cVar), spanEnd);
            } catch (Exception unused) {
            }
            this.f111219p = false;
            if (this.f111218o && !isFocused()) {
                m173736y();
            }
            mo155996b(getObjects().size());
        }
    }

    /* renamed from: g */
    private void mo156010g() {
        performCompletion();
        mo156153p();
    }

    /* renamed from: c */
    public boolean mo156000c() {
        if (this.f111207d != null) {
            return f111197w;
        }
        return false;
    }

    /* renamed from: A */
    private void m173719A() {
        setOnDragListener(new View.OnDragListener() {
            /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.$$Lambda$TokenCompleteTextView$SZ8TA03ux669Pt2FweEzomjKZZI */

            public final boolean onDrag(View view, DragEvent dragEvent) {
                return TokenCompleteTextView.this.m173726a(view, dragEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m173720B() {
        setSelection(getText().length());
    }

    public CharSequence getContentText() {
        SpannableStringBuilder spannableStringBuilder = this.f111207d;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        return getText();
    }

    public TextPaint getTextPaint() {
        Layout layout = this.f111208e;
        if (layout != null) {
            return layout.getPaint();
        }
        return null;
    }

    public void invalidate() {
        if (Build.VERSION.SDK_INT >= 16) {
            mo156008e();
        }
        super.invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo156140n() {
        return mo156109a(getCurrentCandidateTokenRange());
    }

    /* renamed from: d */
    public void mo156004d() {
        for (T t : getObjects()) {
            mo155999c((Object) t);
        }
        this.f111207d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo156133i() {
        Editable text = getText();
        if (text != null) {
            text.setSpan(this.f111205b, 0, text.length(), 18);
            addTextChangedListener(this.f111206c);
        }
    }

    /* renamed from: l */
    public boolean mo156138l() {
        CharSequence charSequence;
        if (getText() == null || (charSequence = this.f111214k) == null || charSequence.length() < getText().length()) {
            return false;
        }
        return f111197w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public float mo156141o() {
        int width = getWidth();
        if (width == 0) {
            width = UIHelper.getWindowWidth(getContext());
        }
        return (float) ((width - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: p */
    public void mo156153p() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo156168v() {
        mo156167u();
        setCursorVisible(false);
        postDelayed(new Runnable() {
            /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.RunnableC438326 */

            public void run() {
                TokenCompleteTextView.this.setCursorVisible(TokenCompleteTextView.f111197w);
                TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
                tokenCompleteTextView.setSelection(tokenCompleteTextView.getText().length());
            }
        }, 100);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo156169w() {
        if (!(getText() == null || this.f111225v == null)) {
            mo156110a(getText(), this.f111225v);
            this.f111225v.mo156193g();
            this.f111225v = null;
        }
        this.f111223t = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$2 */
    public static /* synthetic */ class C438282 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111230a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$TokenClickStyle[] r0 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.TokenClickStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438282.f111230a = r0
                com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$TokenClickStyle r1 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.TokenClickStyle.Select     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438282.f111230a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$TokenClickStyle r1 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.TokenClickStyle.SelectDeselect     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438282.f111230a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$TokenClickStyle r1 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.TokenClickStyle.SelectClick     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438282.f111230a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$TokenClickStyle r1 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.TokenClickStyle.Delete     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438282.f111230a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$TokenClickStyle r1 = com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.TokenClickStyle.None     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438282.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.SavedState.C438341 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        CharSequence f111240a;

        /* renamed from: b */
        boolean f111241b;

        /* renamed from: c */
        boolean f111242c;

        /* renamed from: d */
        boolean f111243d;

        /* renamed from: e */
        TokenClickStyle f111244e;

        /* renamed from: f */
        String f111245f;

        /* renamed from: g */
        List<?> f111246g;

        /* renamed from: h */
        String f111247h;

        /* renamed from: i */
        Tokenizer f111248i;

        public String toString() {
            return ("TokenCompleteTextView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " tokens=" + this.f111246g) + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            boolean z2;
            this.f111240a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            boolean z3 = TokenCompleteTextView.f111197w;
            if (readInt != 0) {
                z = TokenCompleteTextView.f111197w;
            } else {
                z = false;
            }
            this.f111241b = z;
            if (parcel.readInt() != 0) {
                z2 = TokenCompleteTextView.f111197w;
            } else {
                z2 = false;
            }
            this.f111242c = z2;
            this.f111243d = parcel.readInt() == 0 ? false : z3;
            this.f111244e = TokenClickStyle.values()[parcel.readInt()];
            String readString = parcel.readString();
            this.f111245f = readString;
            if ("Serializable".equals(readString)) {
                this.f111246g = (ArrayList) parcel.readSerializable();
            } else {
                try {
                    this.f111246g = parcel.readArrayList(Class.forName(this.f111245f).getClassLoader());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            String readString2 = parcel.readString();
            this.f111247h = readString2;
            try {
                this.f111248i = (Tokenizer) parcel.readParcelable(Class.forName(readString2).getClassLoader());
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f111240a, parcel, 0);
            parcel.writeInt(this.f111241b ? 1 : 0);
            parcel.writeInt(this.f111242c ? 1 : 0);
            parcel.writeInt(this.f111243d ? 1 : 0);
            parcel.writeInt(this.f111244e.ordinal());
            if ("Serializable".equals(this.f111245f)) {
                parcel.writeString("Serializable");
                parcel.writeSerializable((Serializable) this.f111246g);
            } else {
                parcel.writeString(this.f111245f);
                parcel.writeList(this.f111246g);
            }
            parcel.writeString(this.f111248i.getClass().getCanonicalName());
            parcel.writeParcelable(this.f111248i, 0);
        }
    }

    /* renamed from: e */
    private void mo156008e() {
        if (this.f111226x && !this.f111209f) {
            this.f111209f = f111197w;
            try {
                setShadowLayer(getShadowRadius(), getShadowDx(), getShadowDy(), getShadowColor());
            } catch (Exception e) {
                Log.m165384e("TokenAutoComplete", "setShadowLayer fail", e);
            }
            this.f111209f = false;
        }
    }

    /* renamed from: z */
    private Class m173737z() {
        Class<?> cls = getClass();
        while (!cls.getSuperclass().equals(TokenCompleteTextView.class)) {
            cls = cls.getSuperclass();
        }
        return (Class) ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public boolean enoughToFilter() {
        if (this.f111210g == null || this.f111215l || getSelectionEnd() < 0 || getCurrentCandidateTokenRange().mo156213a() < Math.max(getThreshold(), 1)) {
            return false;
        }
        return f111197w;
    }

    public List<TokenCompleteTextView<T>.C43837c> getAllSpans() {
        ArrayList arrayList = new ArrayList();
        Editable text = getText();
        SpannableStringBuilder spannableStringBuilder = this.f111207d;
        if (spannableStringBuilder != null) {
            text = spannableStringBuilder;
        }
        if (text != null) {
            for (C43837c cVar : (C43837c[]) text.getSpans(0, text.length(), C43837c.class)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public List<T> getObjects() {
        ArrayList arrayList = new ArrayList();
        Editable text = getText();
        SpannableStringBuilder spannableStringBuilder = this.f111207d;
        if (spannableStringBuilder != null) {
            text = spannableStringBuilder;
        }
        for (C43837c cVar : (C43837c[]) text.getSpans(0, text.length(), C43837c.class)) {
            arrayList.add(cVar.mo156184a());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo156136j() {
        Editable text = getText();
        if (text != null) {
            for (C43840f fVar : (C43840f[]) text.getSpans(0, text.length(), C43840f.class)) {
                text.removeSpan(fVar);
            }
            removeTextChangedListener(this.f111206c);
        }
    }

    public void performCompletion() {
        if ((getAdapter() == null || getListSelection() == -1) && enoughToFilter()) {
            final String n = mo156140n();
            Object b = mo155994b((CharSequence) n);
            if (b == null) {
                mo155986a(n, new IGetDataCallback<T>() {
                    /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438304 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
                        tokenCompleteTextView.replaceText(tokenCompleteTextView.convertSelectionToString(tokenCompleteTextView.mo155995b(n)));
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(T t) {
                        if (t == null) {
                            t = (T) TokenCompleteTextView.this.mo155995b(n);
                        }
                        TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
                        tokenCompleteTextView.replaceText(tokenCompleteTextView.convertSelectionToString(t));
                    }
                });
            } else {
                replaceText(convertSelectionToString(b));
            }
        } else {
            super.performCompletion();
        }
    }

    /* renamed from: q */
    public boolean mo156155q() {
        Editable text;
        TokenClickStyle tokenClickStyle = this.f111213j;
        if (tokenClickStyle == null || !tokenClickStyle.isSelectable() || (text = getText()) == null) {
            return false;
        }
        C43837c[] cVarArr = (C43837c[]) text.getSpans(0, text.length(), C43837c.class);
        for (C43837c cVar : cVarArr) {
            if (cVar.f111279f.isSelected()) {
                mo156110a(text, cVar);
                return f111197w;
            }
        }
        return false;
    }

    /* renamed from: u */
    public void mo156167u() {
        Editable text;
        if (!this.f111223t) {
            setCursorVisible(f111197w);
            TokenClickStyle tokenClickStyle = this.f111213j;
            if (!(tokenClickStyle == null || !tokenClickStyle.isSelectable() || (text = getText()) == null)) {
                C43837c[] cVarArr = (C43837c[]) text.getSpans(0, text.length(), C43837c.class);
                for (C43837c cVar : cVarArr) {
                    cVar.f111279f.setSelected(false);
                    cVar.f111255b = 0;
                }
                invalidate();
            }
        }
    }

    private C43844c getCurrentCandidateTokenRange() {
        Editable text = getText();
        int selectionEnd = getSelectionEnd();
        int length = this.f111214k.length();
        int length2 = text.length();
        if (this.f111215l) {
            length2 = length;
        }
        C43837c[] cVarArr = (C43837c[]) text.getSpans(this.f111214k.length(), text.length(), C43837c.class);
        for (C43837c cVar : cVarArr) {
            int spanEnd = text.getSpanEnd(cVar);
            if (length < spanEnd && selectionEnd >= spanEnd) {
                length = spanEnd;
            }
            int spanStart = text.getSpanStart(cVar);
            if (length2 > spanStart && selectionEnd <= spanEnd) {
                length2 = spanStart;
            }
        }
        for (C43844c cVar2 : this.f111210g.mo156091a(text, length, length2)) {
            if (cVar2.f111270a <= selectionEnd && selectionEnd <= cVar2.f111271b) {
                return cVar2;
            }
        }
        return new C43844c(selectionEnd, selectionEnd);
    }

    /* renamed from: y */
    private void m173736y() {
        if (this.f111216m) {
            Editable text = getText();
            this.f111212i.mo156209a(getObjects().size() - ((C43837c[]) getText().getSpans(0, getText().length(), C43837c.class)).length);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f111212i.mo156208a());
            spannableStringBuilder.setSpan(this.f111212i, 0, spannableStringBuilder.length(), 33);
            this.f111219p = f111197w;
            int spanStart = text.getSpanStart(this.f111212i);
            if (spanStart != -1) {
                text.replace(spanStart, text.getSpanEnd(this.f111212i), spannableStringBuilder);
            } else {
                text.append((CharSequence) spannableStringBuilder);
            }
            this.f111219p = false;
        }
    }

    /* access modifiers changed from: protected */
    public List<Serializable> getSerializableObjects() {
        ArrayList arrayList = new ArrayList();
        for (T t : getObjects()) {
            if (t instanceof Serializable) {
                arrayList.add(t);
            } else {
                Log.m165383e("TokenAutoComplete", "Unable to save '" + ((Object) t) + "'");
            }
        }
        if (arrayList.size() != getObjects().size()) {
            Log.m165383e("TokenAutoComplete", "You should make your objects Serializable or Parcelable or\noverride getSerializableObjects and convertSerializableArrayToObjectArray");
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo156017h() {
        if (this.f111207d != null) {
            if (this.f111201D != null) {
                getText().removeSpan(this.f111201D);
                SpannableStringBuilder spannableStringBuilder = this.f111207d;
                spannableStringBuilder.setSpan(this.f111201D, 0, spannableStringBuilder.length(), 18);
            }
            setText(this.f111207d);
            SpannableStringBuilder spannableStringBuilder2 = this.f111207d;
            TextUtils.copySpansFrom(spannableStringBuilder2, 0, spannableStringBuilder2.length(), C43837c.class, getText(), 0);
            this.f111207d = null;
            if (this.f111215l) {
                setSelection(this.f111214k.length());
            } else if (!this.f111198A) {
                post(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.$$Lambda$TokenCompleteTextView$yxQIU8cT2jquAzFm86wEUKXjTvo */

                    public final void run() {
                        TokenCompleteTextView.this.m173720B();
                    }
                });
            }
            if (((C43840f[]) getText().getSpans(0, getText().length(), C43840f.class)).length == 0) {
                getText().setSpan(this.f111205b, 0, getText().length(), 18);
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r0v12. Raw type applied. Possible types: java.util.List<T>, java.util.List<?> */
    public Parcelable onSaveInstanceState() {
        mo156136j();
        this.f111217n = f111197w;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        this.f111217n = false;
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.f111240a = this.f111214k;
        savedState.f111241b = this.f111218o;
        savedState.f111242c = this.f111227y;
        savedState.f111243d = this.f111216m;
        savedState.f111244e = this.f111213j;
        Class z = m173737z();
        if (Parcelable.class.isAssignableFrom(z)) {
            savedState.f111245f = z.getName();
            savedState.f111246g = (List<T>) getObjects();
        } else {
            savedState.f111245f = "Serializable";
            savedState.f111246g = getSerializableObjects();
        }
        savedState.f111248i = this.f111210g;
        mo156133i();
        return savedState;
    }

    /* renamed from: b */
    private void mo155967b() {
        if (!this.f111226x) {
            setTokenizer(new CharacterTokenizer(Arrays.asList(',', ';'), ",", "@"));
            Editable text = getText();
            if (f111197w || text != null) {
                this.f111205b = new C43840f();
                this.f111206c = new C43841g();
                this.f111207d = null;
                this.f111212i = new C43842a(getContext());
                mo156133i();
                setTextIsSelectable(false);
                setLongClickable(f111197w);
                setInputType(getInputType() | 524288 | 65536);
                setHorizontallyScrolling(false);
                setOnEditorActionListener(this);
                m173719A();
                setFilters(new InputFilter[]{new InputFilter() {
                    /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.C438293 */

                    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                        if (TokenCompleteTextView.this.f111219p) {
                            return null;
                        }
                        if (TokenCompleteTextView.this.f111221r != -1 && TokenCompleteTextView.this.getObjects().size() == TokenCompleteTextView.this.f111221r) {
                            return "";
                        }
                        if (TokenCompleteTextView.this.f111210g.mo156092a(charSequence) && (TokenCompleteTextView.this.f111216m || TokenCompleteTextView.this.mo156140n().length() > 0)) {
                            TokenCompleteTextView.this.performCompletion();
                            TokenCompleteTextView.this.mo155963a();
                            return "";
                        } else if (i3 >= TokenCompleteTextView.this.f111214k.length()) {
                            return null;
                        } else {
                            if (i3 == 0 && i4 == 0) {
                                return null;
                            }
                            if (i4 <= TokenCompleteTextView.this.f111214k.length()) {
                                return TokenCompleteTextView.this.f111214k.subSequence(i3, i4);
                            }
                            return TokenCompleteTextView.this.f111214k.subSequence(i3, TokenCompleteTextView.this.f111214k.length());
                        }
                    }
                }});
                this.f111226x = f111197w;
                return;
            }
            throw new AssertionError();
        }
    }

    public CharSequence getTextForAccessibility() {
        if (getObjects().size() == 0) {
            return getText();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Editable text = getText();
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (i3 < text.length()) {
            if (i3 == Selection.getSelectionStart(text)) {
                i = spannableStringBuilder.length();
            }
            if (i3 == Selection.getSelectionEnd(text)) {
                i2 = spannableStringBuilder.length();
            }
            C43837c[] cVarArr = (C43837c[]) text.getSpans(i3, i3, C43837c.class);
            if (cVarArr.length > 0) {
                C43837c cVar = cVarArr[0];
                spannableStringBuilder = spannableStringBuilder.append(this.f111210g.mo156093b(cVar.mo156184a().toString()));
                i3 = text.getSpanEnd(cVar);
            } else {
                spannableStringBuilder = spannableStringBuilder.append(text.subSequence(i3, i3 + 1));
            }
            i3++;
        }
        if (i3 == Selection.getSelectionStart(text)) {
            i = spannableStringBuilder.length();
        }
        if (i3 == Selection.getSelectionEnd(text)) {
            i2 = spannableStringBuilder.length();
        }
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannableStringBuilder, i, i2);
        }
        return spannableStringBuilder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo156156r() {
        C43842a aVar;
        C43843b bVar;
        Editable text = getText();
        TextPaint textPaint = getTextPaint();
        if (text != null && this.f111207d == null) {
            if (textPaint == null) {
                textPaint = new TextPaint();
            }
            if (!(this.f111214k == null || (bVar = this.f111201D) == null)) {
                text.removeSpan(bVar);
                text.setSpan(this.f111201D, 0, this.f111214k.length(), 33);
            }
            text.removeSpan(this.f111205b);
            if (this.f111216m) {
                aVar = this.f111212i;
            } else {
                aVar = null;
            }
            Spanned a = C43845d.m173818a(this.f111214k, aVar, getObjects().size(), textPaint, text, mo156141o());
            if (a != null) {
                this.f111207d = new SpannableStringBuilder(text);
                setText(a);
                TextUtils.copySpansFrom(a, 0, a.length(), C43837c.class, getText(), 0);
                TextUtils.copySpansFrom(text, 0, this.f111207d.length(), C43837c.class, this.f111207d, 0);
                SpannableStringBuilder spannableStringBuilder = this.f111207d;
                spannableStringBuilder.setSpan(this.f111205b, 0, spannableStringBuilder.length(), 18);
                return;
            }
            getText().setSpan(this.f111205b, 0, getText().length(), 18);
        }
    }

    /* renamed from: t */
    public void mo156166t() {
        int i;
        Editable text = getText();
        CharSequence hint = getHint();
        if (text != null && hint != null && this.f111214k.length() > 0) {
            HintSpan[] hintSpanArr = (HintSpan[]) text.getSpans(0, text.length(), HintSpan.class);
            HintSpan hintSpan = null;
            int length = this.f111214k.length();
            if (hintSpanArr.length > 0) {
                hintSpan = hintSpanArr[0];
                length += text.getSpanEnd(hintSpan) - text.getSpanStart(hintSpan);
            }
            if (text.length() == length) {
                this.f111215l = f111197w;
                if (hintSpan == null) {
                    Typeface typeface = getTypeface();
                    if (typeface != null) {
                        i = typeface.getStyle();
                    } else {
                        i = 0;
                    }
                    ColorStateList hintTextColors = getHintTextColors();
                    HintSpan hintSpan2 = new HintSpan(null, i, (int) getTextSize(), hintTextColors, hintTextColors);
                    this.f111219p = f111197w;
                    text.insert(this.f111214k.length(), hint);
                    text.setSpan(hintSpan2, this.f111214k.length(), this.f111214k.length() + getHint().length(), 33);
                    this.f111219p = false;
                    setSelection(this.f111214k.length());
                }
            } else if (hintSpan != null) {
                int spanStart = text.getSpanStart(hintSpan);
                int spanEnd = text.getSpanEnd(hintSpan);
                this.f111219p = f111197w;
                text.removeSpan(hintSpan);
                text.replace(spanStart, spanEnd, "");
                this.f111219p = false;
                this.f111215l = false;
            }
        }
    }

    public C43844c getFirstCandidateTokenRange() {
        C43844c cVar;
        int spanEnd;
        Log.m165389i("TokenAutoComplete", "getCurrentCandidateTokenRange");
        Editable text = getText();
        int selectionEnd = getSelectionEnd();
        int length = this.f111214k.length();
        int length2 = text.length();
        if (this.f111215l) {
            length2 = length;
        }
        TokenCompleteTextView<T>.C43837c[] b = mo155997b(this.f111214k.length(), text.length());
        ArrayList arrayList = new ArrayList();
        int length3 = this.f111214k.length();
        int length4 = b.length;
        int i = 0;
        while (i < length4) {
            TokenCompleteTextView<T>.C43837c cVar2 = b[i];
            int spanStart = text.getSpanStart(cVar2);
            int spanEnd2 = text.getSpanEnd(cVar2);
            if (length3 < spanStart && mo156118c(text.subSequence(length3, spanStart).toString()).length() != 0) {
                List<C43844c> a = this.f111210g.mo156091a(text, length3, spanStart);
                if (!a.isEmpty()) {
                    arrayList.add(a.get(0));
                }
            }
            i++;
            length3 = spanEnd2;
        }
        if (length3 < length2 && mo156118c(text.subSequence(length3, length2).toString()).length() != 0) {
            List<C43844c> a2 = this.f111210g.mo156091a(text, length3, length2);
            if (!a2.isEmpty()) {
                arrayList.add(a2.get(0));
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = (C43844c) it.next();
            if (cVar.mo156214a(selectionEnd)) {
                break;
            }
        }
        if (cVar == null && !arrayList.isEmpty()) {
            cVar = (C43844c) arrayList.get(0);
            setSelection(cVar.f111271b);
            selectionEnd = getSelectionEnd();
        }
        if (cVar != null) {
            length = cVar.f111270a;
            length2 = cVar.f111271b;
        } else if (b.length > 0 && length < (spanEnd = text.getSpanEnd(b[b.length - 1]))) {
            setSelection(spanEnd);
            selectionEnd = getSelectionEnd();
            length = spanEnd;
        }
        for (C43844c cVar3 : this.f111210g.mo156091a(text, length, length2)) {
            if (cVar3.f111270a <= selectionEnd && selectionEnd <= cVar3.f111271b) {
                return cVar3;
            }
        }
        return null;
    }

    public void setCallback(AbstractC43835a<T> aVar) {
        this.f111203F = aVar;
    }

    public void setSupportDragAndDrop(boolean z) {
        this.f111200C = z;
    }

    public void setTokenClickStyle(TokenClickStyle tokenClickStyle) {
        this.f111213j = tokenClickStyle;
    }

    public void setTokenLimit(int i) {
        this.f111221r = i;
    }

    public void setTokenListener(AbstractC43839e<T> eVar) {
        this.f111211h = eVar;
    }

    public void setTokenizer(Tokenizer tokenizer) {
        this.f111210g = tokenizer;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$f */
    public class C43840f implements SpanWatcher {
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        }

        private C43840f() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$e<T> */
        /* JADX WARN: Multi-variable type inference failed */
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if ((obj instanceof C43837c) && !TokenCompleteTextView.this.f111217n) {
                C43837c cVar = (C43837c) obj;
                if (TokenCompleteTextView.this.f111211h != null) {
                    TokenCompleteTextView.this.f111211h.mo156199b(cVar.mo156184a());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$e<T> */
        /* JADX WARN: Multi-variable type inference failed */
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if ((obj instanceof C43837c) && !TokenCompleteTextView.this.f111217n) {
                C43837c cVar = (C43837c) obj;
                if (!TokenCompleteTextView.this.isFocused() && TokenCompleteTextView.this.f111218o) {
                    TokenCompleteTextView.this.mo156119c(false);
                }
                if (TokenCompleteTextView.this.f111211h != null) {
                    TokenCompleteTextView.this.f111211h.mo156198a(cVar.mo156184a());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public CharSequence convertSelectionToString(Object obj) {
        this.f111204a = obj;
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public CharSequence mo156003d(T t) {
        return t.toString();
    }

    /* renamed from: i */
    public void mo156134i(T t) {
        mo155985a((Object) t, false);
    }

    /* access modifiers changed from: protected */
    public void replaceText(CharSequence charSequence) {
        mo156112a(charSequence, getCurrentCandidateTokenRange());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$g */
    public class C43841g implements TextWatcher {

        /* renamed from: a */
        ArrayList<TokenCompleteTextView<T>.C43837c> f111262a;

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private C43841g() {
            this.f111262a = new ArrayList<>();
        }

        public void afterTextChanged(Editable editable) {
            ArrayList arrayList = new ArrayList(this.f111262a);
            this.f111262a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TokenCompleteTextView<T>.C43837c cVar = (C43837c) it.next();
                if (!(editable.getSpanStart(cVar) == -1 || editable.getSpanEnd(cVar) == -1)) {
                    TokenCompleteTextView.this.mo156110a(editable, cVar);
                }
            }
            TokenCompleteTextView.this.mo156167u();
            TokenCompleteTextView.this.mo156166t();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i2 > 0 && TokenCompleteTextView.this.getText() != null) {
                Editable text = TokenCompleteTextView.this.getText();
                int i4 = i2 + i;
                TokenCompleteTextView<T>.C43837c[] cVarArr = (C43837c[]) text.getSpans(i, i4, C43837c.class);
                ArrayList<TokenCompleteTextView<T>.C43837c> arrayList = new ArrayList<>();
                for (TokenCompleteTextView<T>.C43837c cVar : cVarArr) {
                    if (text.getSpanStart(cVar) < i4 && i < text.getSpanEnd(cVar)) {
                        arrayList.add(cVar);
                    }
                }
                this.f111262a = arrayList;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public TokenCompleteTextView<T>.C43837c mo156132h(T t) {
        if (t == null) {
            return null;
        }
        return new C43837c(mo156006e(t), t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo155994b(CharSequence charSequence) {
        if (getAdapter() == null || getAdapter().getCount() <= 0 || !this.f111227y) {
            return null;
        }
        return getAdapter().getItem(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo156118c(String str) {
        if (str != null) {
            return str.trim().replace(" ", "").replace("​", "");
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        C43838d dVar = new C43838d(onCreateInputConnection, f111197w);
        editorInfo.imeOptions &= -1073741825;
        editorInfo.imeOptions |= 268435456;
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$b */
    public static class C43836b extends View.DragShadowBuilder {

        /* renamed from: a */
        private final float f111249a;

        /* renamed from: b */
        private int f111250b;

        /* renamed from: c */
        private int f111251c;

        /* renamed from: d */
        private int f111252d;

        /* renamed from: e */
        private int f111253e;

        public void onDrawShadow(Canvas canvas) {
            canvas.scale(((float) this.f111250b) / ((float) getView().getWidth()), ((float) this.f111251c) / ((float) getView().getHeight()));
            getView().draw(canvas);
        }

        public void onProvideShadowMetrics(Point point, Point point2) {
            point.set((int) (((float) getView().getWidth()) * this.f111249a), (int) (((float) getView().getHeight()) * this.f111249a));
            point2.set(this.f111252d, this.f111253e);
            this.f111250b = point.x;
            this.f111251c = point.y;
        }

        public C43836b(View view, float f, int i, int i2) {
            super(view);
            this.f111249a = f;
            this.f111252d = i;
            this.f111253e = i2;
        }
    }

    public TokenCompleteTextView(Context context) {
        super(context);
        mo155967b();
    }

    /* renamed from: a */
    private boolean mo155979a(CharSequence charSequence) {
        try {
            ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, charSequence));
            return f111197w;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private int m173730b(Paint paint) {
        Layout layout;
        if (isFocused()) {
            return 0;
        }
        if (!(paint instanceof TextPaint) && (layout = this.f111208e) != null) {
            paint = layout.getPaint();
        }
        if (paint instanceof TextPaint) {
            return (int) C43842a.m173811b((TextPaint) paint);
        }
        return 100;
    }

    /* renamed from: c */
    public void mo156119c(boolean z) {
        if (!this.f111223t) {
            this.f111219p = f111197w;
            if (!z) {
                mo156156r();
            } else {
                mo156017h();
            }
            this.f111219p = false;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 8192) {
            CharSequence textForAccessibility = getTextForAccessibility();
            accessibilityEvent.setFromIndex(Selection.getSelectionStart(textForAccessibility));
            accessibilityEvent.setToIndex(Selection.getSelectionEnd(textForAccessibility));
            accessibilityEvent.setItemCount(textForAccessibility.length());
        }
    }

    public void setPrefix(CharSequence charSequence) {
        CharSequence charSequence2 = this.f111214k;
        this.f111214k = charSequence;
        Editable text = getText();
        if (text != null) {
            this.f111219p = f111197w;
            if (charSequence2 != null) {
                text.replace(0, charSequence2.length(), charSequence);
            } else {
                text.insert(0, charSequence);
            }
            this.f111219p = false;
        }
        mo156166t();
    }

    /* renamed from: c */
    public void mo155999c(T t) {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = this.f111207d;
        if (spannableStringBuilder != null) {
            arrayList.add(spannableStringBuilder);
        }
        if (getText() != null) {
            arrayList.add(getText());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Editable editable = (Editable) it.next();
            C43837c[] cVarArr = (C43837c[]) editable.getSpans(0, editable.length(), C43837c.class);
            for (C43837c cVar : cVarArr) {
                if (cVar.mo156184a().equals(t)) {
                    mo156110a(editable, cVar);
                }
            }
        }
        m173736y();
    }

    /* renamed from: d */
    public boolean mo156120d(int i) {
        int i2;
        if (getObjects().size() < 1) {
            return f111197w;
        }
        int selectionEnd = getSelectionEnd();
        if (i == 1) {
            i2 = getSelectionStart();
        } else {
            i2 = selectionEnd - i;
        }
        Editable text = getText();
        C43837c[] cVarArr = (C43837c[]) text.getSpans(0, text.length(), C43837c.class);
        for (C43837c cVar : cVarArr) {
            int spanStart = text.getSpanStart(cVar);
            int spanEnd = text.getSpanEnd(cVar);
            if (i2 == selectionEnd) {
                if (spanEnd != selectionEnd) {
                    int i3 = spanEnd + 1;
                    if (i3 == selectionEnd && TextUtils.substring(text, spanEnd, i3).equals(mo156139m())) {
                        cVar.mo156190d();
                        return false;
                    }
                } else if (!cVar.f111279f.isSelected()) {
                    cVar.mo156190d();
                    return false;
                }
            } else if (i2 < spanStart && spanEnd + 1 < selectionEnd) {
                return f111197w;
            }
        }
        return f111197w;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Parcelable parcelable) {
        List<?> list;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f111219p = f111197w;
        setText(savedState.f111240a);
        this.f111214k = savedState.f111240a;
        this.f111219p = false;
        mo156166t();
        this.f111218o = savedState.f111241b;
        this.f111227y = savedState.f111242c;
        this.f111216m = savedState.f111243d;
        this.f111213j = savedState.f111244e;
        this.f111210g = savedState.f111248i;
        mo156133i();
        if ("Serializable".equals(savedState.f111245f)) {
            list = mo156115b((List) savedState.f111246g);
        } else {
            list = savedState.f111246g;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            mo156134i(it.next());
        }
        if (!isFocused() && this.f111218o) {
            post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.RunnableC438337 */

                public void run() {
                    TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
                    tokenCompleteTextView.mo156119c(tokenCompleteTextView.isFocused());
                }
            });
        }
    }

    public boolean onTextContextMenuItem(int i) {
        if (getText() == null) {
            return super.onTextContextMenuItem(i);
        }
        int length = getText().length();
        int i2 = 0;
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            int max = Math.max(0, Math.min(selectionStart, selectionEnd));
            length = Math.max(0, Math.max(selectionStart, selectionEnd));
            i2 = max;
        }
        switch (i) {
            case 16908320:
                String a = mo155981a(i2, length);
                boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
                mo155979a((CharSequence) a);
                mo155996b(getObjects().size());
                return onTextContextMenuItem;
            case 16908321:
                String a2 = mo155981a(i2, length);
                boolean onTextContextMenuItem2 = super.onTextContextMenuItem(i);
                mo155979a((CharSequence) a2);
                return onTextContextMenuItem2;
            case 16908322:
                if (!m173725a(i2, length, (boolean) f111197w)) {
                    mo156113a((Runnable) null);
                }
                return f111197w;
            default:
                return super.onTextContextMenuItem(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m173724a(TokenCompleteTextView<T>.C43837c cVar) {
        CharSequence b = this.f111210g.mo156093b(mo156003d(cVar.f111254a));
        Editable text = getText();
        if (text != null) {
            if (this.f111207d == null) {
                this.f111219p = f111197w;
                int length = text.length();
                if (this.f111215l) {
                    length = this.f111214k.length();
                } else {
                    C43844c currentCandidateTokenRange = getCurrentCandidateTokenRange();
                    if (currentCandidateTokenRange.mo156213a() > 0) {
                        length = currentCandidateTokenRange.f111270a;
                    }
                }
                if (!m173727a(cVar, b, length)) {
                    text.insert(length, b);
                    text.insert(b.length() + length, mo156139m());
                    text.setSpan(cVar, length, b.length() + length, 33);
                }
                this.f111219p = false;
            } else {
                CharSequence b2 = this.f111210g.mo156093b(mo156003d(cVar.mo156184a()));
                int length2 = this.f111207d.length();
                this.f111207d.append(b2);
                this.f111207d.append((CharSequence) " ");
                this.f111207d.setSpan(cVar, length2, b2.length() + length2, 33);
                m173736y();
            }
            mo155996b(getObjects().size());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public void mo156117b(boolean z) {
        this.f111199B = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo156107a(Paint paint) {
        Layout layout;
        if (!(paint instanceof TextPaint) && (layout = this.f111208e) != null) {
            paint = layout.getPaint();
        }
        if (!(paint instanceof TextPaint)) {
            return 0;
        }
        CharSequence charSequence = this.f111214k;
        return (int) Layout.getDesiredWidth(charSequence, 0, charSequence.length(), (TextPaint) paint);
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView$d */
    private class C43838d extends InputConnectionWrapper {
        public boolean setComposingRegion(int i, int i2) {
            if (TokenCompleteTextView.this.f111215l) {
                i = 0;
                i2 = 0;
            }
            return super.setComposingRegion(i, i2);
        }

        public boolean deleteSurroundingText(int i, int i2) {
            if (TokenCompleteTextView.this.mo156155q()) {
                return TokenCompleteTextView.f111197w;
            }
            if (!TokenCompleteTextView.this.mo156120d(i)) {
                return false;
            }
            if (TokenCompleteTextView.this.getSelectionStart() > TokenCompleteTextView.this.f111214k.length()) {
                return super.deleteSurroundingText(i, i2);
            }
            if (TokenCompleteTextView.this.mo156155q() || super.deleteSurroundingText(0, i2)) {
                return TokenCompleteTextView.f111197w;
            }
            return false;
        }

        public boolean setComposingText(CharSequence charSequence, int i) {
            CharSequence hint = TokenCompleteTextView.this.getHint();
            if (!(hint == null || charSequence == null)) {
                String str = hint.toString().trim().split(" ")[0];
                if (str.length() > 0 && str.equals(charSequence.toString())) {
                    charSequence = "";
                }
            }
            if (TokenCompleteTextView.this.f111222s != null && charSequence != null && charSequence.length() == TokenCompleteTextView.this.f111222s.length() + 1 && charSequence.toString().startsWith(TokenCompleteTextView.this.f111222s)) {
                charSequence = charSequence.subSequence(charSequence.length() - 1, charSequence.length());
            }
            return super.setComposingText(charSequence, i);
        }

        C43838d(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }
    }

    /* renamed from: b */
    private TokenCompleteTextView<T>.C43837c[] mo155997b(int i, int i2) {
        return m173729a(i, i2, getText());
    }

    public boolean extractText(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        try {
            return super.extractText(extractedTextRequest, extractedText);
        } catch (IndexOutOfBoundsException e) {
            Log.m165380d("TokenAutoComplete", "extractText hit IndexOutOfBoundsException. This may be normal.", e);
            return false;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean onKeyUp = super.onKeyUp(i, keyEvent);
        if (this.f111228z) {
            this.f111228z = false;
            mo156010g();
        }
        return onKeyUp;
    }

    /* renamed from: a */
    private int m173723a(Editable editable, C43844c cVar) {
        if (cVar.mo156213a() < 1) {
            return 0;
        }
        return mo156139m().equals(TextUtils.substring(editable, cVar.f111270a, cVar.f111270a + 1)) ? 1 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            r0 = 23
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L_0x0020
            r0 = 61
            if (r4 == r0) goto L_0x0020
            r0 = 66
            if (r4 == r0) goto L_0x0020
            r0 = 67
            if (r4 == r0) goto L_0x0013
            goto L_0x002a
        L_0x0013:
            boolean r0 = r3.mo156155q()
            if (r0 == 0) goto L_0x001a
            goto L_0x0028
        L_0x001a:
            boolean r0 = r3.mo156120d(r2)
            r0 = r0 ^ r2
            goto L_0x002b
        L_0x0020:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L_0x002a
            r3.f111228z = r2
        L_0x0028:
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 != 0) goto L_0x0033
            boolean r4 = super.onKeyDown(r4, r5)
            if (r4 == 0) goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public TokenCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo155967b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m173726a(View view, DragEvent dragEvent) {
        int action = dragEvent.getAction();
        TokenCompleteTextView tokenCompleteTextView = null;
        if (action == 3) {
            if (dragEvent.getLocalState() instanceof TokenCompleteTextView) {
                tokenCompleteTextView = (TokenCompleteTextView) dragEvent.getLocalState();
            }
            TokenCompleteTextView tokenCompleteTextView2 = (TokenCompleteTextView) view;
            ClipData.Item itemAt = dragEvent.getClipData().getItemAt(0);
            if (tokenCompleteTextView == null || tokenCompleteTextView.getMailContactsType() != tokenCompleteTextView2.getMailContactsType()) {
                if (mo155990a(tokenCompleteTextView2, itemAt) && tokenCompleteTextView != null) {
                    tokenCompleteTextView.mo156169w();
                }
                if (tokenCompleteTextView != null) {
                    tokenCompleteTextView.mo156170x();
                }
            } else {
                TokenCompleteTextView<T>.C43837c cVar = this.f111225v;
                if (cVar != null) {
                    cVar.mo156193g();
                }
                tokenCompleteTextView.requestFocus();
                tokenCompleteTextView.mo156170x();
            }
            this.f111223t = false;
            return f111197w;
        } else if (action == 4) {
            TokenCompleteTextView<T>.C43837c cVar2 = this.f111225v;
            if (cVar2 != null) {
                cVar2.mo156193g();
                this.f111225v = null;
            }
            return f111197w;
        } else if (action == 5) {
            if (view instanceof TokenCompleteTextView) {
                TokenCompleteTextView tokenCompleteTextView3 = (TokenCompleteTextView) view;
                tokenCompleteTextView3.requestFocus();
                tokenCompleteTextView3.setSelection(getText().length());
                tokenCompleteTextView3.setCursorVisible(f111197w);
            }
            return f111197w;
        } else if (action != 6) {
            return f111197w;
        } else {
            view.clearFocus();
            return f111197w;
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        Log.m165389i("TokenAutoComplete", "onSelectionChanged, selStart:" + i + ", selEnd:" + i2);
        if (getText() == null) {
            super.onSelectionChanged(i, i2);
            return;
        }
        int length = getText().length();
        CharSequence charSequence = this.f111214k;
        if (charSequence == null || charSequence.length() <= length) {
            if (this.f111215l) {
                i = 0;
            }
            int min = Math.min(i2, length);
            TokenClickStyle tokenClickStyle = this.f111213j;
            if (!(tokenClickStyle == null || !tokenClickStyle.isSelectable() || this.f111213j == TokenClickStyle.SelectClick || getText() == null)) {
                mo156167u();
            }
            CharSequence charSequence2 = this.f111214k;
            if (charSequence2 == null || (i >= charSequence2.length() && min >= this.f111214k.length())) {
                Editable text = getText();
                if (text != null) {
                    if (!this.f111199B) {
                        TokenCompleteTextView<T>.C43837c[] a = m173729a(i, length, text);
                        if (a.length > 0) {
                            int spanEnd = text.getSpanEnd(a[a.length - 1]);
                            setSelection(Math.max(i, spanEnd), Math.max(min, spanEnd));
                            return;
                        }
                    } else {
                        C43837c[] cVarArr = (C43837c[]) text.getSpans(i, min, C43837c.class);
                        if (cVarArr.length > 0) {
                            for (C43837c cVar : cVarArr) {
                                int spanEnd2 = text.getSpanEnd(cVar);
                                if (i <= spanEnd2 && text.getSpanStart(cVar) < i) {
                                    if (spanEnd2 == text.length()) {
                                        setSelection(spanEnd2);
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                super.onSelectionChanged(i, min);
                return;
            }
            setSelection(this.f111214k.length(), Math.max(min, this.f111214k.length()));
        }
    }

    /* renamed from: b */
    public void mo156116b(CharSequence charSequence, int i) {
        SpannableString spannableString = new SpannableString(((Object) charSequence) + " ");
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 0);
        spannableString.setSpan(this.f111201D, 0, spannableString.length(), 18);
        setPrefix(spannableString);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m173722a(Editable editable, C43837c cVar, C43837c cVar2) {
        return editable.getSpanStart(cVar) - editable.getSpanStart(cVar2);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            mo156010g();
            return f111197w;
        }
        if (i == 5) {
            mo156009f();
        }
        return false;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            super.onFocusChanged(z, i, rect);
            mo156167u();
            if (this.f111218o) {
                mo156119c(z);
            }
        } catch (Throwable unused) {
        }
    }

    public TokenCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo155967b();
    }

    /* renamed from: a */
    private boolean m173725a(int i, int i2, boolean z) {
        boolean z2;
        CharSequence charSequence;
        String str;
        ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null) {
            return false;
        }
        if (i == i2 && primaryClip.getItemCount() == 1) {
            z2 = f111197w;
        } else {
            z2 = false;
        }
        boolean z3 = false;
        for (int i3 = 0; i3 < primaryClip.getItemCount(); i3++) {
            if (z) {
                charSequence = primaryClip.getItemAt(i3).coerceToStyledText(getContext());
            } else {
                charSequence = primaryClip.getItemAt(i3).coerceToText(getContext());
                if (charSequence instanceof Spanned) {
                    charSequence = charSequence.toString();
                }
            }
            if (charSequence != null) {
                String replaceAll = mo156118c(charSequence.toString()).replaceAll("(\\t|\\r?\\n)+", ";");
                String[] split = replaceAll.split(";|,");
                if (split.length >= 3 || split.length <= 0 || !(split.length == 1 || mo156118c(split[0]).length() == 0 || mo156118c(split[1]).length() == 0)) {
                    str = replaceAll;
                    z2 = false;
                } else if (split.length == 2 && mo156118c(split[0]).length() == 0) {
                    z2 = split[1].contains("@") ^ f111197w;
                    str = split[1];
                } else {
                    z2 = split[0].contains("@") ^ f111197w;
                    str = split[0];
                }
                if (!z2) {
                    this.f111219p = f111197w;
                }
                if (!z3) {
                    getText().replace(i, i2, str);
                    z3 = f111197w;
                } else {
                    if (!mo156118c(getText().subSequence(0, getSelectionEnd()).toString()).endsWith(",")) {
                        getText().insert(getSelectionEnd(), ",");
                    }
                    getText().insert(getSelectionEnd(), str);
                }
                if (!z2) {
                    this.f111219p = false;
                }
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m173727a(TokenCompleteTextView<T>.C43837c cVar, CharSequence charSequence, int i) {
        C43842a aVar;
        if (this.f111208e != null && !isFocused()) {
            Editable text = getText();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            TextUtils.copySpansFrom(text, 0, spannableStringBuilder.length(), C43837c.class, spannableStringBuilder, 0);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((CharSequence) mo156139m());
            spannableStringBuilder.setSpan(cVar, i, charSequence.length() + i, 33);
            CharSequence charSequence2 = this.f111214k;
            if (this.f111216m) {
                aVar = this.f111212i;
            } else {
                aVar = null;
            }
            Spanned a = C43845d.m173818a(charSequence2, aVar, getObjects().size() + 1, this.f111208e.getPaint(), spannableStringBuilder, mo156141o());
            if (a != null) {
                this.f111207d = new SpannableStringBuilder(spannableStringBuilder);
                setText(a);
                TextUtils.copySpansFrom(a, 0, a.length(), C43837c.class, getText(), 0);
                TextUtils.copySpansFrom(spannableStringBuilder, 0, this.f111207d.length(), C43837c.class, this.f111207d, 0);
                SpannableStringBuilder spannableStringBuilder2 = this.f111207d;
                spannableStringBuilder2.setSpan(this.f111205b, 0, spannableStringBuilder2.length(), 18);
                return f111197w;
            }
        }
        return false;
    }

    /* renamed from: a */
    private TokenCompleteTextView<T>.C43837c[] m173729a(int i, int i2, Editable editable) {
        if (editable == null) {
            return (C43837c[]) Array.newInstance(C43837c.class, 0);
        }
        TokenCompleteTextView<T>.C43837c[] cVarArr = (C43837c[]) editable.getSpans(i, i2, C43837c.class);
        Arrays.sort(cVarArr, new Comparator(editable) {
            /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.$$Lambda$TokenCompleteTextView$KgbaMCmlSOmzGqi1rflONv0tltY */
            public final /* synthetic */ Editable f$0;

            {
                this.f$0 = r1;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TokenCompleteTextView.m173722a(this.f$0, (TokenCompleteTextView.C43837c) obj, (TokenCompleteTextView.C43837c) obj2);
            }
        });
        return cVarArr;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.f111222s = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f111208e = getLayout();
    }
}
