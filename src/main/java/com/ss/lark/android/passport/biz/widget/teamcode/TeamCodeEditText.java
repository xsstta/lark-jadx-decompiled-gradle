package com.ss.lark.android.passport.biz.widget.teamcode;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.C49225x;
import com.ss.android.lark.passport.infra.widget.StatefulInput;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeView;
import java.lang.reflect.Field;

public class TeamCodeEditText extends RelativeLayout {

    /* renamed from: a */
    public EditText f164543a;

    /* renamed from: b */
    public int f164544b;

    /* renamed from: c */
    public AbstractC65354e f164545c;

    /* renamed from: d */
    public AbstractC65352c f164546d;

    /* renamed from: e */
    public AbstractC65350a f164547e;

    /* renamed from: f */
    public AbstractC65351b f164548f;

    /* renamed from: g */
    public AbstractC65353d f164549g;

    /* renamed from: h */
    protected AbstractC65288b.AbstractC65292d f164550h;

    /* renamed from: i */
    private final Context f164551i;

    /* renamed from: j */
    private LinearLayout f164552j;

    /* renamed from: k */
    private TeamCodeView[] f164553k;

    /* renamed from: l */
    private final StatefulInputBgDrawable f164554l;

    /* renamed from: m */
    private C65355f f164555m;

    /* renamed from: com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText$a */
    public interface AbstractC65350a {
        /* renamed from: a */
        void mo224781a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText$b */
    public interface AbstractC65351b {
        /* renamed from: a */
        void mo224782a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText$c */
    public interface AbstractC65352c {
        /* renamed from: a */
        void mo224783a();
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText$d */
    public interface AbstractC65353d {
        /* renamed from: a */
        void mo223744a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText$e */
    public interface AbstractC65354e {
        /* renamed from: a */
        void mo224784a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo224764b() {
        if (this.f164550h == null || TextUtils.isEmpty(this.f164543a.getText().toString())) {
            return false;
        }
        this.f164550h.mo222966a();
        return true;
    }

    public String getVerifyCodeText() {
        EditText editText = this.f164543a;
        if (editText != null) {
            return editText.getText().toString().trim();
        }
        return "";
    }

    /* renamed from: a */
    public void mo224759a() {
        EditText editText = this.f164543a;
        if (editText != null) {
            editText.setFocusable(true);
            this.f164543a.setFocusableInTouchMode(true);
            this.f164543a.requestFocus();
            postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText.RunnableC653496 */

                public void run() {
                    Activity a = ViewUtils.m224141a(TeamCodeEditText.this.getContext());
                    if (a != null && !C49203q.m193977c(a) && TeamCodeEditText.this.f164543a.isFocused()) {
                        C49203q.m193975a(TeamCodeEditText.this.f164543a);
                    }
                }
            }, 500);
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText$f */
    public static class C65355f {

        /* renamed from: a */
        public boolean f164562a = true;

        /* renamed from: b */
        public boolean f164563b;

        /* renamed from: c */
        public int f164564c = Color.parseColor("#1f2329");

        /* renamed from: d */
        public int f164565d = 26;

        /* renamed from: e */
        public int f164566e;

        /* renamed from: f */
        public String f164567f;

        /* renamed from: g */
        public int f164568g;

        /* renamed from: h */
        int f164569h = 17;

        /* renamed from: i */
        public int f164570i;

        /* renamed from: j */
        public int f164571j;

        /* renamed from: k */
        public int f164572k;

        /* renamed from: l */
        public boolean f164573l = false;

        /* renamed from: m */
        public int f164574m;

        /* renamed from: n */
        public int f164575n = 4;

        /* renamed from: o */
        public int f164576o = 0;

        /* renamed from: p */
        public Integer f164577p = null;

        /* renamed from: a */
        public C65355f mo224785a(int i) {
            this.f164565d = i;
            return this;
        }

        /* renamed from: b */
        public C65355f mo224788b(int i) {
            this.f164569h = i;
            return this;
        }

        /* renamed from: c */
        public C65355f mo224790c(int i) {
            this.f164574m = i;
            return this;
        }

        /* renamed from: d */
        public C65355f mo224792d(int i) {
            this.f164575n = i;
            return this;
        }

        /* renamed from: e */
        public C65355f mo224793e(int i) {
            this.f164576o = i;
            return this;
        }

        /* renamed from: a */
        public C65355f mo224786a(String str) {
            this.f164567f = str;
            return this;
        }

        /* renamed from: b */
        public C65355f mo224789b(boolean z) {
            this.f164563b = z;
            return this;
        }

        /* renamed from: c */
        public C65355f mo224791c(boolean z) {
            this.f164573l = z;
            return this;
        }

        /* renamed from: f */
        public C65355f mo224794f(int i) {
            this.f164577p = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C65355f mo224787a(boolean z) {
            this.f164562a = z;
            return this;
        }

        public C65355f(Context context) {
            this.f164566e = UDColorUtils.getColor(context, R.color.text_title);
            this.f164568g = UDColorUtils.getColor(context, R.color.text_placeholder);
            this.f164570i = UDColorUtils.getColor(context, R.color.line_border_card);
            this.f164571j = UDColorUtils.getColor(context, R.color.primary_pri_500);
            this.f164572k = UDColorUtils.getColor(context, R.color.function_danger_500);
            this.f164564c = UDColorUtils.getColor(context, R.color.primary_pri_500);
        }
    }

    public void setOnCreateContextMenuListener(View.OnCreateContextMenuListener onCreateContextMenuListener) {
        super.setOnCreateContextMenuListener(onCreateContextMenuListener);
    }

    public void setOnInputCompleteListener(AbstractC65350a aVar) {
        this.f164547e = aVar;
    }

    public void setOnInputProcessListener(AbstractC65351b bVar) {
        this.f164548f = bVar;
    }

    public void setOnKeyboardDetectorListener(AbstractC65288b.AbstractC65292d dVar) {
        this.f164550h = dVar;
    }

    public void setOnKeyboardWillShowListener(AbstractC65352c cVar) {
        this.f164546d = cVar;
    }

    public void setOnTextChangeListener(AbstractC65353d dVar) {
        this.f164549g = dVar;
    }

    public void setOnTextFinishListener(AbstractC65354e eVar) {
        this.f164545c = eVar;
    }

    public TeamCodeEditText(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m256320c(C65355f fVar) {
        View view = new View(this.f164551i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C49154ag.m193828a(this.f164551i, 19.0f), C49154ag.m193828a(this.f164551i, 2.0f));
        layoutParams.gravity = 16;
        this.f164552j.addView(view, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m256316a(this.f164551i, (float) fVar.f164574m), -1);
        View view2 = new View(this.f164551i);
        view2.setBackgroundColor(0);
        this.f164552j.addView(view2, layoutParams2);
    }

    private void setHintVisible(boolean z) {
        int i;
        if (z) {
            this.f164543a.setTextSize((float) this.f164555m.f164569h);
            this.f164543a.setCursorVisible(true);
        } else {
            this.f164543a.setTextSize(BitmapDescriptorFactory.HUE_RED);
            this.f164543a.setCursorVisible(false);
        }
        if (z) {
            i = R.drawable.signin_sdk_team_code_visible_cursor_bg;
        } else {
            i = R.drawable.signin_sdk_verify_code_cursor_bg;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.f164543a, Integer.valueOf(i));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo224760a(Editable editable) {
        int i = 0;
        if (editable.length() > 0) {
            setHintVisible(false);
            int length = editable.length();
            while (i < this.f164544b) {
                if (i < length) {
                    String valueOf = String.valueOf(editable.charAt(i));
                    TeamCodeView teamCodeView = this.f164553k[i];
                    if (this.f164555m.f164573l) {
                        valueOf = valueOf.toUpperCase();
                    }
                    teamCodeView.setText(valueOf);
                } else if (i == length) {
                    this.f164553k[i].mo224795a();
                } else {
                    this.f164553k[i].mo224797b();
                }
                i++;
            }
            return;
        }
        setHintVisible(true);
        while (i < this.f164544b) {
            this.f164553k[i].mo224797b();
            i++;
        }
    }

    /* renamed from: b */
    private void m256319b(C65355f fVar) {
        setBackground(this.f164554l);
        LinearLayout linearLayout = new LinearLayout(this.f164551i);
        this.f164552j = linearLayout;
        linearLayout.setBackgroundColor(fVar.f164576o);
        this.f164552j.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f164552j.setOrientation(0);
        this.f164552j.setGravity(17);
        addView(this.f164552j);
        this.f164553k = new TeamCodeView[this.f164544b];
        TeamCodeView.C65357a f = new TeamCodeView.C65357a(getContext()).mo224803a(fVar.f164564c).mo224807b(fVar.f164563b).mo224810e(fVar.f164571j).mo224809d(fVar.f164570i).mo224805a(fVar.f164562a).mo224806b(fVar.f164565d).mo224808c(fVar.f164566e).mo224804a(fVar.f164577p).mo224811f(fVar.f164572k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m256316a(this.f164551i, 33.0f), -1);
        layoutParams.gravity = 17;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m256316a(this.f164551i, (float) fVar.f164574m), -1);
        int length = this.f164553k.length;
        for (int i = 0; i < length; i++) {
            this.f164553k[i] = new TeamCodeView(this.f164551i);
            this.f164553k[i].mo224796a(f);
            if (length / 2 == i) {
                m256320c(fVar);
            }
            this.f164552j.addView(this.f164553k[i], layoutParams);
            if (i < this.f164553k.length - 1) {
                View view = new View(this.f164551i);
                view.setBackgroundColor(0);
                this.f164552j.addView(view, layoutParams2);
            }
        }
        mo224760a(this.f164543a.getText());
    }

    /* renamed from: a */
    public void mo224761a(C65355f fVar) {
        this.f164555m = fVar;
        this.f164544b = fVar.f164575n;
        this.f164554l.mo171825a(StatefulInput.InputState.f123624a, this.f164555m.f164570i);
        this.f164554l.mo171825a(StatefulInput.InputState.f123625b, this.f164555m.f164571j);
        this.f164554l.mo171825a(StatefulInput.InputState.f123626c, this.f164555m.f164572k);
        m256318a(fVar.f164576o, fVar.f164577p);
        m256319b(fVar);
    }

    /* renamed from: a */
    public void mo224762a(String str) {
        this.f164555m.mo224786a(str);
        this.f164543a.setHint(str);
    }

    /* renamed from: a */
    public void mo224763a(boolean z) {
        if (z) {
            this.f164554l.mo171827b();
            mo224760a(this.f164543a.getText());
            return;
        }
        this.f164554l.mo171824a();
        TeamCodeView[] teamCodeViewArr = this.f164553k;
        if (teamCodeViewArr != null) {
            for (TeamCodeView teamCodeView : teamCodeViewArr) {
                teamCodeView.mo224799d();
            }
        }
    }

    public TeamCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m256316a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    private void m256318a(int i, Integer num) {
        EditText editText = (EditText) LayoutInflater.from(this.f164551i).inflate(R.layout.signin_sdk_view_team_code_edittext, (ViewGroup) null);
        this.f164543a = editText;
        editText.setId(R.id.signin_sdk_input_team_code_edit_text);
        this.f164543a.setHint(this.f164555m.f164567f);
        this.f164543a.setHintTextColor(this.f164555m.f164568g);
        this.f164543a.setCursorVisible(false);
        this.f164543a.setBackgroundColor(i);
        if (num != null) {
            this.f164543a.setInputType(num.intValue());
        }
        this.f164543a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f164544b), $$Lambda$TeamCodeEditText$ToNyWlSgfISDYHgwuPgxcb2RRa8.INSTANCE});
        this.f164543a.setImeOptions(6);
        this.f164543a.addTextChangedListener(new TextWatcher() {
            /* class com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText.C653441 */

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                TeamCodeEditText.this.mo224760a(editable);
                if (TeamCodeEditText.this.f164549g != null) {
                    TeamCodeEditText.this.f164549g.mo223744a(editable.toString().trim());
                }
                if (editable.length() == TeamCodeEditText.this.f164544b && TeamCodeEditText.this.f164545c != null) {
                    TeamCodeEditText.this.f164545c.mo224784a(editable.toString().trim());
                }
                if (TeamCodeEditText.this.f164548f != null) {
                    TeamCodeEditText.this.f164548f.mo224782a(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Editable text = TeamCodeEditText.this.f164543a.getText();
                Selection.setSelection(text, text.length());
            }
        });
        this.f164543a.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText.C653452 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6 && TeamCodeEditText.this.f164547e != null) {
                    TeamCodeEditText.this.f164547e.mo224781a(textView.getText().toString());
                    return true;
                } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    return false;
                } else {
                    return TeamCodeEditText.this.mo224764b();
                }
            }
        });
        addView(this.f164543a, new RelativeLayout.LayoutParams(-1, -1));
        this.f164543a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText.View$OnLongClickListenerC653463 */

            public boolean onLongClick(View view) {
                TeamCodeEditText.this.f164543a.setCursorVisible(true);
                return false;
            }
        });
        this.f164543a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText.View$OnClickListenerC653474 */

            public void onClick(View view) {
                if (TeamCodeEditText.this.f164546d != null) {
                    TeamCodeEditText.this.f164546d.mo224783a();
                }
                TeamCodeEditText.this.f164543a.setCursorVisible(false);
            }
        });
        this.f164543a.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText.View$OnFocusChangeListenerC653485 */

            public void onFocusChange(View view, boolean z) {
                if (TeamCodeEditText.this.f164546d != null && !view.hasFocus() && z) {
                    TeamCodeEditText.this.f164546d.mo224783a();
                }
                TeamCodeEditText.this.mo224763a(z);
            }
        });
        mo224763a(this.f164543a.hasFocus());
    }

    public TeamCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164554l = new StatefulInputBgDrawable(getContext());
        this.f164544b = 8;
        this.f164551i = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ CharSequence m256317a(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!C49225x.m194057a(charSequence)) {
            return "";
        }
        return null;
    }
}
