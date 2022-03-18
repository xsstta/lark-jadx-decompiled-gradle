package com.bytedance.ee.bear.sheet.inputbar.editor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.at.AbstractC4230c;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.at.C4233d;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.common.C11090b;
import com.bytedance.ee.bear.sheet.inputbar.AbstractC11188a;
import com.bytedance.ee.bear.sheet.inputbar.AbstractC11214b;
import com.bytedance.ee.bear.sheet.inputbar.at.SheetAtEditText;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13747j;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

public class SheetEditorLayout extends LinearLayout {

    /* renamed from: A */
    private AbstractC11229a f30167A;

    /* renamed from: B */
    private View.OnLayoutChangeListener f30168B;

    /* renamed from: C */
    private int f30169C;

    /* renamed from: D */
    private int f30170D;

    /* renamed from: E */
    private BearUrl f30171E;

    /* renamed from: F */
    private Runnable f30172F;

    /* renamed from: G */
    private TextWatcher f30173G = new TextWatcher() {
        /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112278 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m46713a() {
            SheetEditorLayout.this.f30180f.getSegments().subscribe(new Consumer() {
                /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$8$sWjktEUUgkL8Q3IMkrmz1ELpKYM */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SheetEditorLayout.C112278.lambda$sWjktEUUgkL8Q3IMkrmz1ELpKYM(SheetEditorLayout.C112278.this, (List) obj);
                }
            });
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m46714a(List list) {
            SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
            sheetEditorLayout.mo42968a(3, list, sheetEditorLayout.f30190p, SheetEditorLayout.this.f30191q);
        }

        public void afterTextChanged(Editable editable) {
            if (SheetEditorLayout.this.f30182h) {
                C13742g.m55705a(new Runnable() {
                    /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$8$TewBGykbW2gmzSGPo6UDJkORRvk */

                    public final void run() {
                        SheetEditorLayout.C112278.lambda$TewBGykbW2gmzSGPo6UDJkORRvk(SheetEditorLayout.C112278.this);
                    }
                });
                if (SheetEditorLayout.this.f30186l != null) {
                    SheetEditorLayout.this.f30186l.afterTextChanged(editable);
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!charSequence.toString().substring(i, i3 + i).contains("<doc.at.~#_%=`>")) {
                SheetEditorLayout.this.mo42969a(charSequence);
            }
        }
    };

    /* renamed from: H */
    private TextWatcher f30174H = new TextWatcher() {
        /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112289 */

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:459)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public static /* synthetic */ void lambda$7PXleEDGBAotYGkUMjTJo_njvQ0(java.lang.Throwable r0) {
            /*
                m46715a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112289.lambda$7PXleEDGBAotYGkUMjTJo_njvQ0(java.lang.Throwable):void");
        }

        public static /* synthetic */ void lambda$DmOn7n78dhTuE6EvgVNi_zFrTEA(C112289 r0, List list) {
            r0.m46716a(list);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* renamed from: a */
        private /* synthetic */ void m46716a(List list) {
            SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
            sheetEditorLayout.mo42968a(3, list, sheetEditorLayout.f30190p, SheetEditorLayout.this.f30191q);
        }

        public void afterTextChanged(Editable editable) {
            if (SheetEditorLayout.this.f30182h) {
                SheetEditorLayout.this.f30178d.getSegments().subscribe(new Consumer() {
                    /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$9$DmOn7n78dhTuE6EvgVNi_zFrTEA */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SheetEditorLayout.C112289.lambda$DmOn7n78dhTuE6EvgVNi_zFrTEA(SheetEditorLayout.C112289.this, (List) obj);
                    }
                }, $$Lambda$SheetEditorLayout$9$7PXleEDGBAotYGkUMjTJo_njvQ0.INSTANCE);
                if (SheetEditorLayout.this.f30186l != null) {
                    SheetEditorLayout.this.f30186l.afterTextChanged(editable);
                }
            }
        }
    };

    /* renamed from: a */
    public ScrollView f30175a;

    /* renamed from: b */
    public View f30176b;

    /* renamed from: c */
    public View f30177c;

    /* renamed from: d */
    public SheetAtEditText f30178d;

    /* renamed from: e */
    public View f30179e;

    /* renamed from: f */
    public SheetAtEditText f30180f;

    /* renamed from: g */
    public View f30181g;

    /* renamed from: h */
    public boolean f30182h;

    /* renamed from: i */
    public AbstractC11214b f30183i;

    /* renamed from: j */
    public C11088a f30184j = new C11088a();

    /* renamed from: k */
    public AbstractC11232d f30185k;

    /* renamed from: l */
    public AbstractC11230b f30186l;

    /* renamed from: m */
    public boolean f30187m;

    /* renamed from: n */
    public boolean f30188n;

    /* renamed from: o */
    public boolean f30189o = true;

    /* renamed from: p */
    public String f30190p = "text";

    /* renamed from: q */
    public String f30191q = "";

    /* renamed from: r */
    private View f30192r;

    /* renamed from: s */
    private View f30193s;

    /* renamed from: t */
    private View f30194t;

    /* renamed from: u */
    private View f30195u;

    /* renamed from: v */
    private View f30196v;

    /* renamed from: w */
    private AbstractC4230c f30197w;

    /* renamed from: x */
    private int f30198x;

    /* renamed from: y */
    private AbstractC11188a f30199y;

    /* renamed from: z */
    private AbstractC11231c f30200z;

    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout$a */
    public interface AbstractC11229a {
        void onHeightChange(int i);
    }

    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout$b */
    public interface AbstractC11230b {
        void afterTextChanged(Editable editable);
    }

    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout$c */
    public interface AbstractC11231c {
        /* renamed from: a */
        void mo43006a();

        /* renamed from: b */
        void mo43007b();
    }

    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout$d */
    public interface AbstractC11232d {
        /* renamed from: a */
        void mo43025a();
    }

    public static /* synthetic */ void lambda$A0TPa_3x5IVWQ6ssfOXgXBlxx8U(SheetEditorLayout sheetEditorLayout) {
        sheetEditorLayout.m46667w();
    }

    public static /* synthetic */ void lambda$AC8PT0ffMzzYrBBlDnhGeCjGBBY(SheetEditorLayout sheetEditorLayout, List list) {
        sheetEditorLayout.m46651a(list);
    }

    public static /* synthetic */ void lambda$HYJ1MHjdLRY7kXnQ9VY3PWO2NiQ(SheetEditorLayout sheetEditorLayout) {
        sheetEditorLayout.m46668x();
    }

    /* renamed from: lambda$TuO7N5QQT98-VUU5luM6k9TdkEk */
    public static /* synthetic */ void m269940lambda$TuO7N5QQT98VUU5luM6k9TdkEk(SheetEditorLayout sheetEditorLayout, String str, String str2, List list) {
        sheetEditorLayout.m46650a(str, str2, list);
    }

    /* renamed from: lambda$YM-UTd3qcsRgb02vzujOEvZfLOw */
    public static /* synthetic */ void m269941lambda$YMUTd3qcsRgb02vzujOEvZfLOw(SheetEditorLayout sheetEditorLayout, boolean z) {
        sheetEditorLayout.m46652a(z);
    }

    /* renamed from: n */
    public boolean mo42989n() {
        return this.f30187m;
    }

    /* renamed from: a */
    public void mo42967a(int i) {
        AbstractC11229a aVar = this.f30167A;
        if (aVar != null) {
            aVar.onHeightChange(i);
        }
    }

    /* renamed from: a */
    public void mo42966a() {
        this.f30180f.m48738p();
    }

    /* renamed from: a */
    public boolean mo42972a(AtEditText atEditText, int i, int i2) {
        if (i < i2) {
            return false;
        }
        return i >= 0 && i2 <= atEditText.getText().length();
    }

    /* renamed from: a */
    public void mo42968a(int i, List<BaseSegment> list, String str, String str2) {
        AbstractC11188a aVar = this.f30199y;
        if (aVar != null) {
            aVar.updateSheetEdit(i, list, str, str2);
        }
    }

    /* renamed from: a */
    public void mo42971a(List<BaseSegment> list, String str, int i) {
        C13479a.m54772d("SheetEditorLayout", " show(): ");
        if (this.f30180f.getAtWindow() == null) {
            C4233d dVar = new C4233d((FragmentActivity) getContext(), C4227b.m17586a().mo16664c(), i, str, "fx_bar", "text");
            dVar.mo16656b(C8275a.f22372e.mo32555b());
            dVar.mo16654a(C4227b.m17586a().mo16663b());
            this.f30180f.mo44988a(dVar);
            AbstractC4230c atWindow = this.f30180f.getAtWindow();
            this.f30197w = atWindow;
            this.f30178d.setAtWindow(atWindow);
        }
        this.f30197w.mo16629a(new AbstractC4230c.AbstractC4232b() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112256 */

            @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4232b
            /* renamed from: a */
            public void mo16651a(boolean z) {
                int i;
                if (SheetEditorLayout.this.f30187m) {
                    if (z) {
                        i = (int) SheetEditorLayout.this.getContext().getResources().getDimension(R.dimen.sheet_edittext_margin_top);
                    } else {
                        i = -1;
                    }
                    SheetEditorLayout.this.mo42976c(i);
                }
                C11090b.m46150c();
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4232b
            /* renamed from: a */
            public void mo16650a(int i, int i2) {
                if (SheetEditorLayout.this.f30187m) {
                    ViewGroup.LayoutParams layoutParams = SheetEditorLayout.this.f30175a.getLayoutParams();
                    C13479a.m54772d("SheetEditorLayout", "onFinderViewHeightChange(): mentionHeight=" + i + ",notFoundHeight=" + i2);
                    layoutParams.height = i - i2;
                    SheetEditorLayout.this.f30175a.requestLayout();
                }
            }
        });
        mo42986k();
        this.f30197w.mo16640a(new AbstractC4230c.AbstractC4231a() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112267 */

            @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
            /* renamed from: a */
            public void mo16648a(String str) {
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
            /* renamed from: b */
            public void mo16649b(String str) {
            }

            @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
            /* renamed from: a */
            public void mo16647a(C4517a aVar, boolean z) {
                if (SheetEditorLayout.this.f30180f.getVisibility() == 0 && SheetEditorLayout.this.f30177c.getVisibility() != 0) {
                    SheetEditorLayout.this.f30180f.mo44989a(aVar);
                    SheetEditorLayout.this.setMentionAnalyticParam("fx_bar");
                } else if (SheetEditorLayout.this.f30178d.getVisibility() == 0 && SheetEditorLayout.this.f30177c.getVisibility() == 0) {
                    SheetEditorLayout.this.f30178d.mo44989a(aVar);
                    SheetEditorLayout.this.setMentionAnalyticParam("full_screen_toolbar");
                }
            }
        });
        setEditTextContent(list);
        mo42983h();
        this.f30179e.addOnLayoutChangeListener(this.f30168B);
    }

    /* renamed from: a */
    public void mo42969a(CharSequence charSequence) {
        int lineCount = this.f30180f.getLineCount();
        float a = m46645a(charSequence.toString());
        int i = this.f30198x;
        if ((i <= 0 || a < ((float) i)) && lineCount <= 1) {
            this.f30200z.mo43007b();
        } else {
            this.f30200z.mo43006a();
        }
    }

    /* renamed from: a */
    public void mo42970a(String str, String str2) {
        if (!this.f30187m) {
            this.f30180f.getSegments().subscribe(new Consumer(str, str2) {
                /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$lBAWR65YKmLPg2rkynPAxWy2aI */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SheetEditorLayout.this.m46655b(this.f$1, this.f$2, (List) obj);
                }
            });
        } else {
            this.f30178d.getSegments().subscribe(new Consumer(str, str2) {
                /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$TuO7N5QQT98VUU5luM6k9TdkEk */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SheetEditorLayout.m269940lambda$TuO7N5QQT98VUU5luM6k9TdkEk(SheetEditorLayout.this, this.f$1, this.f$2, (List) obj);
                }
            });
        }
    }

    /* renamed from: g */
    public void mo42980g() {
        AbstractC11214b bVar = this.f30183i;
        if (bVar != null) {
            bVar.mo42925b();
        }
    }

    /* renamed from: i */
    public void mo42984i() {
        AbstractC4230c cVar = this.f30197w;
        if (cVar != null) {
            cVar.mo16646f();
        }
    }

    /* renamed from: x */
    private /* synthetic */ void m46668x() {
        C10548d.m43703b(this.f30180f);
        this.f30172F = null;
        C13479a.m54764b("SheetEditorLayout", "showKeyboardRunnable show keyboard complete");
    }

    public Editable getFullEditable() {
        SheetAtEditText sheetAtEditText = this.f30178d;
        if (sheetAtEditText != null) {
            return sheetAtEditText.getEditableText();
        }
        return null;
    }

    public Editable getInputEditable() {
        SheetAtEditText sheetAtEditText = this.f30180f;
        if (sheetAtEditText != null) {
            return sheetAtEditText.getEditableText();
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo42985j() {
        if (this.f30177c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void mo42988m() {
        if (this.f30187m) {
            this.f30178d.mo45000i();
        } else {
            this.f30180f.mo45000i();
        }
    }

    /* renamed from: q */
    private void m46661q() {
        this.f30193s.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AnonymousClass10 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                SheetEditorLayout.this.f30184j.mo42265a(false, false);
                int selectionStart = SheetEditorLayout.this.f30180f.getSelectionStart();
                int selectionEnd = SheetEditorLayout.this.f30180f.getSelectionEnd();
                SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
                if (sheetEditorLayout.mo42972a(sheetEditorLayout.f30180f, selectionStart, selectionEnd)) {
                    SheetEditorLayout.this.f30180f.getText().replace(SheetEditorLayout.this.f30180f.getSelectionStart(), SheetEditorLayout.this.f30180f.getSelectionEnd(), "");
                    SheetEditorLayout.this.f30180f.getText().replace(SheetEditorLayout.this.f30180f.getSelectionStart(), SheetEditorLayout.this.f30180f.getSelectionEnd(), "\n");
                }
            }
        });
        this.f30194t.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AnonymousClass11 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                SheetEditorLayout.this.f30184j.mo42265a(true, false);
                int selectionStart = SheetEditorLayout.this.f30178d.getSelectionStart();
                int selectionEnd = SheetEditorLayout.this.f30178d.getSelectionEnd();
                SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
                if (sheetEditorLayout.mo42972a(sheetEditorLayout.f30178d, selectionStart, selectionEnd)) {
                    SheetEditorLayout.this.f30178d.getText().replace(SheetEditorLayout.this.f30178d.getSelectionStart(), SheetEditorLayout.this.f30178d.getSelectionEnd(), "");
                    SheetEditorLayout.this.f30178d.getText().replace(SheetEditorLayout.this.f30178d.getSelectionStart(), SheetEditorLayout.this.f30178d.getSelectionEnd(), "\n");
                }
            }
        });
    }

    /* renamed from: r */
    private void m46662r() {
        this.f30196v.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AnonymousClass12 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                SheetEditorLayout.this.f30184j.mo42281g();
                SheetEditorLayout.this.mo42984i();
                SheetEditorLayout.this.f30178d.m48738p();
                SheetEditorLayout.this.mo42973b();
            }
        });
        this.f30181g.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AnonymousClass13 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                SheetEditorLayout.this.f30184j.mo42279f();
                SheetEditorLayout.this.mo42984i();
                SheetEditorLayout.this.mo42966a();
                SheetEditorLayout.this.mo42975c();
            }
        });
    }

    /* renamed from: s */
    private void m46663s() {
        this.f30180f.setPreImeListener(new AtEditText.AbstractC11757a() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AnonymousClass14 */

            @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11757a
            /* renamed from: b */
            public void mo35415b() {
            }

            @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11757a
            /* renamed from: a */
            public boolean mo35414a() {
                if (SheetEditorLayout.this.f30189o) {
                    SheetEditorLayout.this.mo42974b(2);
                }
                return SheetEditorLayout.this.f30180f.mo45001j();
            }
        });
        this.f30178d.setPreImeListener(new AtEditText.AbstractC11757a() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AnonymousClass15 */

            @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11757a
            /* renamed from: a */
            public boolean mo35414a() {
                SheetEditorLayout.this.mo42973b();
                SheetEditorLayout.this.f30178d.mo45001j();
                return true;
            }

            @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11757a
            /* renamed from: b */
            public void mo35415b() {
                SheetEditorLayout.this.f30184j.mo42265a(true, true);
            }
        });
    }

    /* renamed from: t */
    private void m46664t() {
        this.f30192r.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AnonymousClass16 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SheetEditorLayout.this.f30185k != null) {
                    SheetEditorLayout.this.f30185k.mo43025a();
                } else {
                    SheetEditorLayout.this.f30180f.mo45000i();
                }
            }
        });
        findViewById(R.id.edit_sheet_at_full).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AnonymousClass17 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SheetEditorLayout.this.f30185k != null) {
                    SheetEditorLayout.this.f30185k.mo43025a();
                } else {
                    SheetEditorLayout.this.f30178d.mo45000i();
                }
            }
        });
    }

    /* renamed from: u */
    private void m46665u() {
        this.f30180f.setOpenMentionListener(new AtEditText.AbstractC11759c() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$8ESRtBwJHH41Br7dV3wIER6YTXo */

            @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11759c
            public final void onAtTrigger(boolean z) {
                SheetEditorLayout.lambda$8ESRtBwJHH41Br7dV3wIER6YTXo(SheetEditorLayout.this, z);
            }
        });
        this.f30178d.setOpenMentionListener(new AtEditText.AbstractC11759c() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$YMUTd3qcsRgb02vzujOEvZfLOw */

            @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11759c
            public final void onAtTrigger(boolean z) {
                SheetEditorLayout.m269941lambda$YMUTd3qcsRgb02vzujOEvZfLOw(SheetEditorLayout.this, z);
            }
        });
    }

    /* renamed from: w */
    private /* synthetic */ void m46667w() {
        this.f30198x = this.f30176b.getLeft() - 50;
        mo42969a((CharSequence) this.f30180f.getText().toString());
    }

    /* renamed from: l */
    public void mo42987l() {
        if (getVisibility() != 8) {
            setVisibility(8);
            this.f30177c.setVisibility(8);
            this.f30187m = false;
            mo42974b(2);
        }
    }

    /* renamed from: p */
    private void m46660p() {
        m46662r();
        m46663s();
        m46664t();
        m46665u();
        m46661q();
        this.f30168B = new View.OnLayoutChangeListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$uXl6VkfJG9rxhNRwsJZb2649eM4 */

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                SheetEditorLayout.this.m46649a(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.f30200z = new AbstractC11231c() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112201 */

            @Override // com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AbstractC11231c
            /* renamed from: a */
            public void mo43006a() {
                if (!SheetEditorLayout.this.f30188n) {
                    SheetEditorLayout.this.f30188n = true;
                    SheetEditorLayout.this.mo42977d();
                }
            }

            @Override // com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AbstractC11231c
            /* renamed from: b */
            public void mo43007b() {
                if (SheetEditorLayout.this.f30188n) {
                    SheetEditorLayout.this.f30188n = false;
                    SheetEditorLayout.this.mo42978e();
                }
            }
        };
        this.f30180f.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$kLpQ7WuXhbtUIQ4cHz8R9M4SQw */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return SheetEditorLayout.this.m46653a((SheetEditorLayout) textView, (TextView) i, (int) keyEvent);
            }
        });
        this.f30180f.addTextChangedListener(this.f30173G);
        this.f30178d.addTextChangedListener(this.f30174H);
    }

    /* renamed from: b */
    public void mo42973b() {
        C13479a.m54772d("SheetEditorLayout", "onHideFullScreenInput()...");
        mo42984i();
        m46666v();
    }

    /* renamed from: c */
    public void mo42975c() {
        ValueAnimator ofInt = ValueAnimator.ofInt(getRootView().getHeight() - this.f30179e.getHeight(), 0);
        ofInt.setDuration(350L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$z89azGTVvxkNsbPEK4WT31ZveM */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetEditorLayout.this.m46659d((SheetEditorLayout) valueAnimator);
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112212 */

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                	at java.base/java.util.ArrayList.get(ArrayList.java:459)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            public static /* synthetic */ void lambda$pLx3hS32IIXZ8zhZszcULpP7hyI(java.lang.Throwable r0) {
                /*
                    m46704a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112212.lambda$pLx3hS32IIXZ8zhZszcULpP7hyI(java.lang.Throwable):void");
            }

            public void onAnimationEnd(Animator animator) {
                if (SheetEditorLayout.this.f30189o) {
                    C10548d.m43703b(SheetEditorLayout.this.f30178d);
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m46705a(List list) {
                SheetEditorLayout.this.setEditTextContent(list);
                int selectionStart = SheetEditorLayout.this.f30180f.getSelectionStart();
                int selectionEnd = SheetEditorLayout.this.f30180f.getSelectionEnd();
                SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
                if (sheetEditorLayout.mo42972a(sheetEditorLayout.f30178d, selectionStart, selectionEnd)) {
                    SheetEditorLayout.this.f30178d.setSelection(selectionStart, selectionEnd);
                }
            }

            public void onAnimationStart(Animator animator) {
                SheetEditorLayout.this.mo42976c(-1);
                SheetEditorLayout.this.f30177c.setVisibility(0);
                SheetEditorLayout.this.f30179e.setVisibility(8);
                SheetEditorLayout.this.f30187m = true;
                SheetEditorLayout.this.mo42986k();
                SheetEditorLayout.this.f30178d.mo44994e();
                SheetEditorLayout.this.f30180f.getSegments().subscribe(new Consumer() {
                    /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$2$nd7ia_z6prYrRG2fAzjGcW5goOE */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SheetEditorLayout.C112212.lambda$nd7ia_z6prYrRG2fAzjGcW5goOE(SheetEditorLayout.C112212.this, (List) obj);
                    }
                }, $$Lambda$SheetEditorLayout$2$pLx3hS32IIXZ8zhZszcULpP7hyI.INSTANCE);
                if (SheetEditorLayout.this.f30183i != null) {
                    SheetEditorLayout.this.f30183i.mo42924a();
                }
            }
        });
        ofInt.start();
    }

    /* renamed from: f */
    public void mo42979f() {
        this.f30176b.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        this.f30181g.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f30181g.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30180f.getLayoutParams();
        marginLayoutParams.bottomMargin = 0;
        this.f30180f.setLayoutParams(marginLayoutParams);
        this.f30188n = false;
    }

    /* renamed from: k */
    public void mo42986k() {
        if (this.f30187m) {
            this.f30197w.mo16634b(1);
            this.f30197w.mo16627a(getResources().getDimensionPixelSize(R.dimen.sheet_edittext_margin_top));
            return;
        }
        this.f30197w.mo16634b(this.f30179e.getHeight() + getResources().getDimensionPixelSize(R.dimen.sheet_edit_toolbar_height));
        this.f30197w.mo16627a(0);
        this.f30197w.mo16644d();
    }

    /* renamed from: v */
    private void m46666v() {
        C13479a.m54772d("SheetEditorLayout", "startHideFullScreenAnim()...");
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f30179e.getHeight(), getRootView().getHeight());
        ofInt.setDuration(350L);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$byyjG6865dxNa7EAhbnIN5wekI */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetEditorLayout.this.m46657c((SheetEditorLayout) valueAnimator);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112223 */

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                	at java.base/java.util.ArrayList.get(ArrayList.java:459)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            public static /* synthetic */ void lambda$gNOlQyU0Jq1ON5ekYiKqiNMoL24(java.lang.Throwable r0) {
                /*
                    m46706a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112223.lambda$gNOlQyU0Jq1ON5ekYiKqiNMoL24(java.lang.Throwable):void");
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                C13479a.m54772d("SheetEditorLayout", "startHideFullScreenAnim.onAnimationCancel()...");
                SheetEditorLayout.this.f30177c.setVisibility(8);
                SheetEditorLayout.this.mo42983h();
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m46707a(List list) {
                SheetEditorLayout.this.setEditTextContent(list);
                int selectionStart = SheetEditorLayout.this.f30178d.getSelectionStart();
                int selectionEnd = SheetEditorLayout.this.f30178d.getSelectionEnd();
                SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
                if (sheetEditorLayout.mo42972a(sheetEditorLayout.f30180f, selectionStart, selectionEnd)) {
                    SheetEditorLayout.this.f30180f.setSelection(selectionStart, selectionEnd);
                }
            }

            public void onAnimationEnd(Animator animator) {
                C13479a.m54772d("SheetEditorLayout", "startHideFullScreenAnim.onAnimationEnd()...");
                int selectionStart = SheetEditorLayout.this.f30178d.getSelectionStart();
                int selectionEnd = SheetEditorLayout.this.f30178d.getSelectionEnd();
                SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
                if (sheetEditorLayout.mo42972a(sheetEditorLayout.f30180f, selectionStart, selectionEnd)) {
                    SheetEditorLayout.this.f30180f.setSelection(selectionStart, selectionEnd);
                }
                SheetEditorLayout.this.f30177c.setVisibility(8);
                SheetEditorLayout.this.mo42983h();
            }

            public void onAnimationStart(Animator animator) {
                SheetEditorLayout.this.mo42980g();
                SheetEditorLayout.this.f30187m = false;
                SheetEditorLayout.this.mo42986k();
                SheetEditorLayout.this.f30179e.setVisibility(0);
                SheetEditorLayout.this.f30178d.getSegments().subscribe(new Consumer() {
                    /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$3$8diZnTmWgOBJiLmLfejDGDyWBs */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SheetEditorLayout.C112223.m269946lambda$8diZnTmWgOBJiLmLfejDGDyWBs(SheetEditorLayout.C112223.this, (List) obj);
                    }
                }, $$Lambda$SheetEditorLayout$3$gNOlQyU0Jq1ON5ekYiKqiNMoL24.INSTANCE);
            }
        });
        ofInt.start();
    }

    /* renamed from: e */
    public void mo42978e() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sheet_edit_icon_size) + getResources().getDimensionPixelSize(R.dimen.sheet_edit_icon_margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.sheet_edit_icon_size);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f30176b, "translationX", (float) (-dimensionPixelSize), 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f30181g, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
        ValueAnimator ofInt = ValueAnimator.ofInt(dimensionPixelSize2, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$ipxKsSLuDATLEh4Eya8tLd5X9d4 */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetEditorLayout.this.m46647a((SheetEditorLayout) valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112245 */

            public void onAnimationCancel(Animator animator) {
                SheetEditorLayout.this.mo42979f();
            }

            public void onAnimationEnd(Animator animator) {
                SheetEditorLayout.this.f30181g.setVisibility(8);
                SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
                sheetEditorLayout.mo42967a(sheetEditorLayout.f30179e.getHeight());
            }
        });
        animatorSet.playTogether(ofFloat, ofFloat2, ofInt);
        animatorSet.start();
    }

    /* renamed from: h */
    public void mo42983h() {
        C13479a.m54764b("SheetEditorLayout", "showInputBarViews()...");
        setVisibility(0);
        this.f30179e.setVisibility(0);
        this.f30177c.setVisibility(8);
        if (this.f30189o) {
            Runnable runnable = this.f30172F;
            if (runnable != null) {
                removeCallbacks(runnable);
                C13479a.m54764b("SheetEditorLayout", "showKeyboardRunnable before remove");
            }
            this.f30172F = new Runnable() {
                /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$HYJ1MHjdLRY7kXnQ9VY3PWO2NiQ */

                public final void run() {
                    SheetEditorLayout.lambda$HYJ1MHjdLRY7kXnQ9VY3PWO2NiQ(SheetEditorLayout.this);
                }
            };
            C13479a.m54764b("SheetEditorLayout", "post show keyboard");
            post(this.f30172F);
        }
        post(new Runnable() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$A0TPa_3x5IVWQ6ssfOXgXBlxx8U */

            public final void run() {
                SheetEditorLayout.lambda$A0TPa_3x5IVWQ6ssfOXgXBlxx8U(SheetEditorLayout.this);
            }
        });
        this.f30184j.mo42260a(this.f30171E);
    }

    /* renamed from: d */
    public void mo42977d() {
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sheet_edit_icon_size) + getResources().getDimensionPixelSize(R.dimen.sheet_edit_icon_margin);
        final int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.sheet_edit_icon_size);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f30176b, "translationX", 0.0f, (float) (-dimensionPixelSize));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f30181g, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dimensionPixelSize2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$n8iaUgs6jnOa9_rh5pUmv8L04DM */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetEditorLayout.this.m46654b((SheetEditorLayout) valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.C112234 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SheetEditorLayout sheetEditorLayout = SheetEditorLayout.this;
                sheetEditorLayout.mo42967a(sheetEditorLayout.f30179e.getHeight());
            }

            public void onAnimationStart(Animator animator) {
                SheetEditorLayout.this.f30181g.setVisibility(0);
            }

            public void onAnimationCancel(Animator animator) {
                SheetEditorLayout.this.f30176b.setTranslationX((float) (-dimensionPixelSize));
                SheetEditorLayout.this.f30181g.setAlpha(1.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) SheetEditorLayout.this.f30180f.getLayoutParams();
                marginLayoutParams.bottomMargin = dimensionPixelSize2;
                SheetEditorLayout.this.f30180f.setLayoutParams(marginLayoutParams);
            }
        });
        animatorSet.playTogether(ofFloat, ofFloat2, ofInt);
        animatorSet.start();
    }

    /* renamed from: o */
    public void mo42990o() {
        if (Build.VERSION.SDK_INT <= 10) {
            this.f30180f.setInputType(0);
            this.f30178d.setInputType(0);
            return;
        }
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(this.f30180f, false);
            method.invoke(this.f30178d, false);
        } catch (Exception e) {
            C13479a.m54772d("SheetEditorLayout", "disableShowSoftInput fail, error: " + e.toString());
        }
        try {
            Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
            method2.setAccessible(true);
            method2.invoke(this.f30180f, false);
            method2.invoke(this.f30178d, false);
        } catch (Exception e2) {
            C13479a.m54772d("SheetEditorLayout", "disableShowSoftInput fail, error: " + e2.toString());
        }
    }

    public void setDateType(String str) {
        this.f30191q = str;
    }

    public void setDocumentUrl(BearUrl bearUrl) {
        this.f30171E = bearUrl;
    }

    public void setEditDelegate(AbstractC11188a aVar) {
        this.f30199y = aVar;
    }

    public void setFormat(String str) {
        this.f30190p = str;
    }

    public void setFullScreenCallback(AbstractC11214b bVar) {
        this.f30183i = bVar;
    }

    public void setHeightChangeListener(AbstractC11229a aVar) {
        this.f30167A = aVar;
    }

    public void setInputTextChangedListener(AbstractC11230b bVar) {
        this.f30186l = bVar;
    }

    public void setNeedShowKeyboard(boolean z) {
        this.f30189o = z;
    }

    public void setSheetAtListener(AbstractC11232d dVar) {
        this.f30185k = dVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m46656b(boolean z) {
        setMentionAnalyticParam("fx_bar");
    }

    /* renamed from: c */
    public void mo42976c(int i) {
        this.f30175a.getLayoutParams().height = i;
        this.f30175a.requestLayout();
    }

    public void setCellStyle(SegmentStyle segmentStyle) {
        this.f30180f.setCellStyle(segmentStyle);
        this.f30178d.setCellStyle(segmentStyle);
    }

    public void setCursorVisible(boolean z) {
        this.f30180f.setCursorVisible(z);
        this.f30178d.setCursorVisible(z);
    }

    /* renamed from: a */
    private /* synthetic */ void m46647a(ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30180f.getLayoutParams();
        marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f30180f.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: b */
    private /* synthetic */ void m46654b(ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30180f.getLayoutParams();
        marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f30180f.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: c */
    private /* synthetic */ void m46657c(ValueAnimator valueAnimator) {
        this.f30177c.setTranslationY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* renamed from: d */
    private /* synthetic */ void m46659d(ValueAnimator valueAnimator) {
        this.f30177c.setTranslationY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void setAtIconVisibility(int i) {
        findViewById(R.id.edit_sheet_at).setVisibility(i);
        findViewById(R.id.edit_sheet_at_full).setVisibility(i);
    }

    public void setEditTextContent(List<BaseSegment> list) {
        this.f30182h = false;
        if (this.f30187m) {
            this.f30178d.requestFocus();
            this.f30178d.setSegments(list);
        } else {
            this.f30180f.requestFocus();
            this.f30180f.setSegments(list);
        }
        this.f30182h = true;
    }

    public void setMentionAnalyticParam(String str) {
        if (this.f30197w != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("zone", str);
            this.f30197w.mo16632a(hashMap);
        }
    }

    public void setNewLineEnable(boolean z) {
        this.f30193s.setEnabled(z);
        this.f30193s.setClickable(z);
        this.f30194t.setEnabled(z);
        this.f30194t.setClickable(z);
    }

    public SheetEditorLayout(Context context) {
        super(context);
        m46648a(context);
    }

    /* renamed from: a */
    private float m46645a(String str) {
        if (!str.contains("<doc.at.~#_%=`>")) {
            return this.f30180f.getPaint().measureText(str);
        }
        return this.f30180f.getPaint().measureText(str.replace("<doc.at.~#_%=`>", "")) + ((float) (this.f30170D * ((str.length() - str.replace("<doc.at.~#_%=`>", "").length()) / 15)));
    }

    /* renamed from: d */
    private void m46658d(int i) {
        if (this.f30179e.getVisibility() != 4) {
            if (this.f30172F != null) {
                C13479a.m54764b("SheetEditorLayout", "showKeyboardRunnable remove");
                removeCallbacks(this.f30172F);
                this.f30172F = null;
            }
            this.f30179e.setVisibility(4);
            mo42984i();
            this.f30180f.getSegments().subscribe(new Consumer(i) {
                /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$cMgsGhd1tKPUM9lpWRV4XVcW7a4 */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SheetEditorLayout.this.m46646a((SheetEditorLayout) this.f$1, (int) ((List) obj));
                }
            });
            AbstractC11214b bVar = this.f30183i;
            if (bVar != null) {
                bVar.mo42925b();
            }
            mo42979f();
            this.f30179e.removeOnLayoutChangeListener(this.f30168B);
        }
    }

    /* renamed from: b */
    public void mo42974b(int i) {
        C13479a.m54772d("SheetEditorLayout", "onHideInputBar()... editState = " + i);
        m46658d(i);
    }

    /* renamed from: a */
    private void m46648a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.sheet_edit_input, this);
        this.f30175a = (ScrollView) findViewById(R.id.sheet_edit_scroll_view);
        View findViewById = findViewById(R.id.sheet_edit_input_layout);
        this.f30179e = findViewById;
        C13747j.m55726a(findViewById, (int) R.color.bg_body);
        this.f30177c = findViewById(R.id.sheet_edit_full_layout);
        View findViewById2 = findViewById(R.id.editExpand);
        this.f30181g = findViewById2;
        C13747j.m55728a((ImageView) findViewById2, (int) R.color.icon_n1);
        View findViewById3 = findViewById(R.id.editUnexpand);
        this.f30196v = findViewById3;
        C13747j.m55728a((ImageView) findViewById3, (int) R.color.icon_n1);
        View findViewById4 = findViewById(R.id.icon_layout);
        this.f30176b = findViewById4;
        C13747j.m55726a(findViewById4, (int) R.color.bg_body);
        View findViewById5 = findViewById(R.id.edit_sheet_at);
        this.f30192r = findViewById5;
        C13747j.m55728a((ImageView) findViewById5, (int) R.color.icon_n1);
        this.f30180f = (SheetAtEditText) findViewById(R.id.sheet_edit_input);
        this.f30178d = (SheetAtEditText) findViewById(R.id.sheet_edit_full_screen_input);
        this.f30193s = findViewById(R.id.edit_new_line);
        this.f30194t = findViewById(R.id.edit_new_line_full);
        View findViewById6 = findViewById(R.id.edit_sheet_at_full);
        this.f30195u = findViewById6;
        C13747j.m55728a((ImageView) findViewById6, (int) R.color.icon_n1);
        this.f30180f.setRawInputType(1);
        m46660p();
        this.f30170D = getResources().getDrawable(R.drawable.doc_file_at_prefix).getIntrinsicWidth() + getResources().getDimensionPixelSize(R.dimen.doc_file_prefix_space);
    }

    /* renamed from: a */
    private /* synthetic */ void m46651a(List list) {
        this.f30184j.mo42283h();
        this.f30184j.mo42289k();
        mo42968a(1, list, this.f30190p, this.f30191q);
        mo42984i();
        this.f30178d.m48738p();
    }

    /* renamed from: a */
    private /* synthetic */ void m46652a(boolean z) {
        setMentionAnalyticParam("full_screen_toolbar");
    }

    /* renamed from: a */
    private /* synthetic */ void m46646a(int i, List list) {
        mo42968a(i, list, this.f30190p, this.f30191q);
    }

    public SheetEditorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m46648a(context);
    }

    /* renamed from: b */
    private /* synthetic */ void m46655b(String str, String str2, List list) {
        mo42968a(3, list, str, str2);
    }

    /* renamed from: a */
    private /* synthetic */ void m46650a(String str, String str2, List list) {
        mo42968a(3, list, str, str2);
    }

    public SheetEditorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m46648a(context);
    }

    /* renamed from: a */
    private /* synthetic */ boolean m46653a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return true;
        }
        this.f30180f.getSegments().subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.sheet.inputbar.editor.$$Lambda$SheetEditorLayout$AC8PT0ffMzzYrBBlDnhGeCjGBBY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SheetEditorLayout.lambda$AC8PT0ffMzzYrBBlDnhGeCjGBBY(SheetEditorLayout.this, (List) obj);
            }
        });
        return true;
    }

    /* renamed from: a */
    private /* synthetic */ void m46649a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo42986k();
        int i9 = 1;
        if (this.f30180f.getLineCount() >= 1) {
            i9 = Math.min(this.f30180f.getLineCount(), this.f30180f.getMaxLines());
        }
        if (i9 != this.f30169C) {
            mo42967a(i4 - i2);
        }
        this.f30169C = i9;
    }
}
