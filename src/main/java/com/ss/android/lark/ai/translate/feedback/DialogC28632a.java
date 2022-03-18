package com.ss.android.lark.ai.translate.feedback;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.ratingbar.UDRatingBar;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.statistics.translate.ITranslateHitPoint;
import com.ss.android.lark.ai.translate.feedback.TranslationFeedback;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.ai.translate.feedback.a */
public class DialogC28632a extends Dialog {

    /* renamed from: a */
    public Context f72028a;

    /* renamed from: b */
    Button f72029b;

    /* renamed from: c */
    public RichTextEmojiconEditText f72030c;

    /* renamed from: d */
    public UDCheckBox f72031d;

    /* renamed from: e */
    public View f72032e;

    /* renamed from: f */
    UDRatingBar f72033f;

    /* renamed from: g */
    public NestedScrollView f72034g;

    /* renamed from: h */
    public AbstractC28641a f72035h;

    /* renamed from: i */
    public ITranslateHitPoint f72036i;

    /* renamed from: j */
    public String f72037j;

    /* renamed from: k */
    public String f72038k;

    /* renamed from: l */
    public String f72039l;

    /* renamed from: m */
    public String f72040m;

    /* renamed from: n */
    public String f72041n;

    /* renamed from: o */
    public boolean f72042o;

    /* renamed from: p */
    private TextView f72043p;

    /* renamed from: q */
    private LinearLayout f72044q;

    /* renamed from: r */
    private TextWatcher f72045r = new TextWatcher() {
        /* class com.ss.android.lark.ai.translate.feedback.DialogC28632a.C286331 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            if (!DialogC28632a.this.f72042o && DialogC28632a.this.f72036i != null) {
                DialogC28632a.this.f72036i.mo101603b();
                DialogC28632a.this.f72042o = true;
            }
        }
    };

    /* renamed from: s */
    private AbstractViewTreeObserver$OnGlobalLayoutListenerC28642b f72046s = new AbstractViewTreeObserver$OnGlobalLayoutListenerC28642b() {
        /* class com.ss.android.lark.ai.translate.feedback.DialogC28632a.C286342 */

        public void onGlobalLayout() {
            Rect rect = new Rect();
            DialogC28632a.this.f72032e.getWindowVisibleDisplayFrame(rect);
            int realScreenHeight = DeviceUtils.getRealScreenHeight(DialogC28632a.this.getContext());
            if (DesktopUtil.m144301a(DialogC28632a.this.f72028a)) {
                realScreenHeight = DeviceUtils.getScreenHeight(DialogC28632a.this.f72028a);
            }
            boolean a = DialogC28632a.m104978a(realScreenHeight - rect.bottom, realScreenHeight);
            Log.m165379d("TranslateFeedbackDialog", "isKeyboardShow = " + a);
            if (a && !this.f72055b) {
                DialogC28632a.this.f72034g.mo4753b(130);
            }
            this.f72055b = a;
            if (!a) {
                DialogC28632a.this.f72030c.clearFocus();
            }
        }
    };

    /* renamed from: com.ss.android.lark.ai.translate.feedback.a$a */
    public interface AbstractC28641a {
        void onFeedback(TranslationFeedback translationFeedback);
    }

    /* renamed from: a */
    public static boolean m104978a(int i, int i2) {
        return ((float) i) > ((float) i2) / 6.0f;
    }

    /* renamed from: lambda$CYZgVXEmIgF-JDbdoGCtJTX13jg */
    public static /* synthetic */ void m270240lambda$CYZgVXEmIgFJDbdoGCtJTX13jg(DialogC28632a aVar, View view) {
        aVar.m104974a(view);
    }

    public static /* synthetic */ void lambda$GfDWIJTID75dLJBqw8NF56aWoiY(DialogC28632a aVar, UDRatingBar uDRatingBar, float f, boolean z) {
        aVar.m104977a(uDRatingBar, f, z);
    }

    /* renamed from: com.ss.android.lark.ai.translate.feedback.a$b */
    public static abstract class AbstractViewTreeObserver$OnGlobalLayoutListenerC28642b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        boolean f72055b;

        private AbstractViewTreeObserver$OnGlobalLayoutListenerC28642b() {
        }
    }

    public void show() {
        m104980b();
        super.show();
        m104973a();
    }

    public void dismiss() {
        this.f72030c.removeTextChangedListener(this.f72045r);
        KeyboardUtils.hideKeyboard(this.f72028a, this.f72032e);
        super.dismiss();
    }

    /* renamed from: a */
    private void m104973a() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = DeviceUtils.getScreenWidth(getContext());
            attributes.height = -2;
            attributes.softInputMode = 16;
            window.setAttributes(attributes);
            window.setDimAmount(0.3f);
            window.setWindowAnimations(R.style.AniBottomInBottomOut);
        }
    }

    /* renamed from: b */
    private void m104980b() {
        this.f72029b.setEnabled(false);
        this.f72030c.setText("");
        this.f72031d.setChecked(false);
        this.f72043p.setText(this.f72038k);
        this.f72030c.setText(this.f72039l);
        this.f72033f.setRating(BitmapDescriptorFactory.HUE_RED);
        this.f72042o = false;
        this.f72032e.getViewTreeObserver().removeOnGlobalLayoutListener(this.f72046s);
        this.f72046s.f72055b = false;
        this.f72032e.getViewTreeObserver().addOnGlobalLayoutListener(this.f72046s);
    }

    /* renamed from: c */
    private void m104981c() {
        this.f72029b = (Button) findViewById(R.id.confirm_btn);
        this.f72043p = (TextView) findViewById(R.id.tv_origin);
        this.f72030c = (RichTextEmojiconEditText) findViewById(R.id.et_suggestion);
        this.f72031d = (UDCheckBox) findViewById(R.id.cb_edit_translation);
        this.f72044q = (LinearLayout) findViewById(R.id.ll_translate_suggestion);
        UDRatingBar uDRatingBar = (UDRatingBar) findViewById(R.id.rb_translation);
        this.f72033f = uDRatingBar;
        uDRatingBar.setStepSize(1.0f);
        this.f72034g = (NestedScrollView) findViewById(R.id.nsv_content);
        this.f72030c.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.ai.translate.feedback.$$Lambda$a$vQbb_Jg1KTu0aLau07v01423ltE */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogC28632a.this.m104979a((DialogC28632a) view, (View) motionEvent);
            }
        });
        this.f72030c.addTextChangedListener(this.f72045r);
        ((ImageView) findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ai.translate.feedback.$$Lambda$a$CYZgVXEmIgFJDbdoGCtJTX13jg */

            public final void onClick(View view) {
                DialogC28632a.m270240lambda$CYZgVXEmIgFJDbdoGCtJTX13jg(DialogC28632a.this, view);
            }
        });
        this.f72033f.setOnUDRatingBarChangeListener(new UDRatingBar.OnUDRatingBarChangeListener() {
            /* class com.ss.android.lark.ai.translate.feedback.$$Lambda$a$GfDWIJTID75dLJBqw8NF56aWoiY */

            @Override // com.larksuite.component.universe_design.ratingbar.UDRatingBar.OnUDRatingBarChangeListener
            public final void onRatingChanged(UDRatingBar uDRatingBar, float f, boolean z) {
                DialogC28632a.lambda$GfDWIJTID75dLJBqw8NF56aWoiY(DialogC28632a.this, uDRatingBar, f, z);
            }
        });
        this.f72031d.setOnCheckedChangeListener(new UDCheckBox.OnCheckedChangeListener() {
            /* class com.ss.android.lark.ai.translate.feedback.$$Lambda$a$02InVr2y52drZOeUjT310j5r1GI */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public final void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                DialogC28632a.lambda$02InVr2y52drZOeUjT310j5r1GI(DialogC28632a.this, uDCheckBox, z);
            }
        });
        findViewById(R.id.ll_submit_suggestions).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ai.translate.feedback.DialogC28632a.View$OnClickListenerC286364 */

            public void onClick(View view) {
                DialogC28632a.this.f72031d.toggle();
            }
        });
        this.f72029b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ai.translate.feedback.DialogC28632a.View$OnClickListenerC286375 */

            public void onClick(View view) {
                String str;
                boolean z;
                if (DialogC28632a.this.f72030c.getText() != null) {
                    str = DialogC28632a.this.f72030c.getText().toString();
                } else {
                    str = "";
                }
                if (DialogC28632a.this.f72035h != null) {
                    TranslationFeedback translationFeedback = new TranslationFeedback();
                    translationFeedback.scene = TranslationFeedback.TranslationScene.MESSAGE;
                    translationFeedback.objectId = DialogC28632a.this.f72037j;
                    translationFeedback.setScore((int) DialogC28632a.this.f72033f.getRating());
                    translationFeedback.originText = DialogC28632a.this.f72038k;
                    translationFeedback.targetText = DialogC28632a.this.f72039l;
                    if (!DialogC28632a.this.f72031d.isChecked() || TextUtils.isEmpty(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    translationFeedback.hasSuggestedText = z;
                    translationFeedback.suggestedText = str;
                    translationFeedback.editedSuggestedText = !TextUtils.equals(str, translationFeedback.targetText);
                    translationFeedback.originLang = DialogC28632a.this.f72040m;
                    translationFeedback.targetLang = DialogC28632a.this.f72041n;
                    DialogC28632a.this.f72035h.onFeedback(translationFeedback);
                }
                if (DialogC28632a.this.f72036i != null) {
                    DialogC28632a.this.f72036i.mo101601a(DialogC28632a.this.f72031d.isChecked(), !TextUtils.equals(str, DialogC28632a.this.f72039l));
                }
                DialogC28632a.this.f72029b.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.ai.translate.feedback.DialogC28632a.View$OnClickListenerC286375.RunnableC286381 */

                    public void run() {
                        DialogC28632a.this.dismiss();
                    }
                }, 100);
            }
        });
        m104975a((TextView) findViewById(R.id.tv_agreement));
    }

    /* renamed from: a */
    public void mo101881a(AbstractC28641a aVar) {
        this.f72035h = aVar;
    }

    /* renamed from: a */
    private /* synthetic */ void m104974a(View view) {
        String str;
        boolean z;
        if (this.f72030c.getText() != null) {
            str = this.f72030c.getText().toString();
        } else {
            str = "";
        }
        ITranslateHitPoint aVar = this.f72036i;
        if (aVar != null) {
            if (this.f72033f.getRating() != BitmapDescriptorFactory.HUE_RED) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo101602a(z, this.f72031d.isChecked(), !TextUtils.equals(str, this.f72039l));
        }
        dismiss();
    }

    /* renamed from: a */
    private void m104975a(TextView textView) {
        HashMap hashMap = new HashMap();
        String string = getContext().getString(R.string.Lark_Guide_V3_PrivacyPolicy);
        String string2 = getContext().getString(R.string.Lark_Guide_V3_serviceterms);
        hashMap.put("PrivacyPolicy", string);
        hashMap.put("ServiceTerm", string2);
        String mustacheFormat = UIHelper.mustacheFormat(getContext().getString(R.string.Lark_Chat_TranslationFeedbackPrivacyDesc), hashMap);
        int indexOf = mustacheFormat.indexOf(string);
        int indexOf2 = mustacheFormat.indexOf(string2);
        if (mustacheFormat != null && indexOf != -1 && indexOf2 != -1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mustacheFormat);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                /* class com.ss.android.lark.ai.translate.feedback.DialogC28632a.C286396 */

                public void updateDrawState(TextPaint textPaint) {
                }

                public void onClick(View view) {
                    C28522a.m104531a().mo101563d().mo101576b(DialogC28632a.this.getContext());
                    if (DialogC28632a.this.f72036i != null) {
                        DialogC28632a.this.f72036i.mo101600a();
                    }
                }
            }, indexOf, string.length() + indexOf, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.primary_pri_500)), indexOf, string.length() + indexOf, 33);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                /* class com.ss.android.lark.ai.translate.feedback.DialogC28632a.C286407 */

                public void updateDrawState(TextPaint textPaint) {
                }

                public void onClick(View view) {
                    C28522a.m104531a().mo101563d().mo101575a(DialogC28632a.this.getContext());
                    if (DialogC28632a.this.f72036i != null) {
                        DialogC28632a.this.f72036i.mo101600a();
                    }
                }
            }, indexOf2, string2.length() + indexOf2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.primary_pri_500)), indexOf2, string2.length() + indexOf2, 33);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableStringBuilder);
        }
    }

    public DialogC28632a(Context context, ITranslateHitPoint aVar) {
        super(context, R.style.CommonDialog);
        this.f72028a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.feedback_popup_window_layout, (ViewGroup) null);
        this.f72032e = inflate;
        setContentView(inflate);
        this.f72032e.setFocusable(true);
        this.f72032e.setFocusableInTouchMode(true);
        setCanceledOnTouchOutside(true);
        this.f72036i = aVar;
        setOnCancelListener(new DialogInterface.OnCancelListener() {
            /* class com.ss.android.lark.ai.translate.feedback.DialogC28632a.DialogInterface$OnCancelListenerC286353 */

            public void onCancel(DialogInterface dialogInterface) {
                if (DialogC28632a.this.f72036i != null) {
                    DialogC28632a.this.f72036i.mo101604c();
                }
            }
        });
        m104981c();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m104976a(UDCheckBox uDCheckBox, boolean z) {
        int i;
        LinearLayout linearLayout = this.f72044q;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (z) {
            this.f72030c.requestFocus();
            RichTextEmojiconEditText richTextEmojiconEditText = this.f72030c;
            richTextEmojiconEditText.setSelection(richTextEmojiconEditText.getText().length());
            KeyboardUtils.showKeyboard(this.f72030c);
            return;
        }
        KeyboardUtils.hideKeyboard(getContext(), this.f72030c);
    }

    /* renamed from: a */
    private /* synthetic */ boolean m104979a(View view, MotionEvent motionEvent) {
        if (this.f72030c.hasFocus()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 8) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private /* synthetic */ void m104977a(UDRatingBar uDRatingBar, float f, boolean z) {
        boolean z2;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f72029b.setEnabled(z2);
    }

    /* renamed from: a */
    public void mo101882a(String str, String str2, String str3, String str4, String str5) {
        this.f72037j = str;
        this.f72038k = str2;
        this.f72039l = str3;
        this.f72040m = str4;
        this.f72041n = str5;
        show();
    }
}
