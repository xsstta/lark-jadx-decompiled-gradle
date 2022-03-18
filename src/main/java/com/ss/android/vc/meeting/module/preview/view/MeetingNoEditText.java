package com.ss.android.vc.meeting.module.preview.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MeetingNoEditText extends AppCompatEditText {

    /* renamed from: a */
    public AbstractC62775a f157912a;

    /* renamed from: b */
    private Pattern f157913b = Pattern.compile("[0-9]{1,9}");

    /* renamed from: c */
    private String f157914c = "";

    /* renamed from: d */
    private TextWatcher f157915d = new TextWatcher() {
        /* class com.ss.android.vc.meeting.module.preview.view.MeetingNoEditText.C627741 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            MeetingNoEditText.this.mo216781a(editable.toString(), true);
            if (MeetingNoEditText.this.f157912a != null) {
                MeetingNoEditText.this.f157912a.onInputChanged();
            }
        }
    };

    /* renamed from: com.ss.android.vc.meeting.module.preview.view.MeetingNoEditText$a */
    public interface AbstractC62775a {
        void onInputChanged();
    }

    /* renamed from: b */
    private void m245632b() {
        addTextChangedListener(this.f157915d);
    }

    /* renamed from: c */
    private void m245633c() {
        this.f157914c = "";
        setTxt("");
    }

    /* renamed from: a */
    public boolean mo216782a() {
        if (TextUtils.isEmpty(this.f157914c) || this.f157914c.replaceAll(" ", "").length() != 9) {
            return false;
        }
        return true;
    }

    public String getMeetingNo() {
        if (TextUtils.isEmpty(this.f157914c)) {
            return "";
        }
        return this.f157914c.replaceAll(" ", "").trim();
    }

    public void setMeetingNoInputListener(AbstractC62775a aVar) {
        this.f157912a = aVar;
    }

    private void setTxt(String str) {
        removeTextChangedListener(this.f157915d);
        setText(str);
        addTextChangedListener(this.f157915d);
    }

    public MeetingNoEditText(Context context) {
        super(context);
        m245632b();
    }

    public boolean onTextContextMenuItem(int i) {
        String str;
        if (i == 16908322) {
            try {
                ClipboardManager clipboardManager = (ClipboardManager) ar.m236694a().getSystemService("clipboard");
                if (!(clipboardManager == null || clipboardManager.getPrimaryClip() == null || clipboardManager.getPrimaryClip().getDescription() == null || clipboardManager.getPrimaryClip().getDescription().getMimeType(0) == null || !clipboardManager.getPrimaryClip().getDescription().getMimeType(0).equals("text/plain"))) {
                    CharSequence text = clipboardManager.getPrimaryClip().getItemAt(0).getText();
                    if (text != null) {
                        str = text.toString();
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Matcher matcher = this.f157913b.matcher(str.replaceAll(" ", "").replaceAll("-", ""));
                        if (matcher.find()) {
                            String group = matcher.group();
                            m245633c();
                            mo216781a(group, false);
                            AbstractC62775a aVar = this.f157912a;
                            if (aVar != null) {
                                aVar.onInputChanged();
                            }
                        }
                    }
                }
                return true;
            } catch (Exception e) {
                C60700b.m235864f("MeetingNoEditText", "[onTextContextMenuItem]", e.getLocalizedMessage());
            }
        }
        return super.onTextContextMenuItem(i);
    }

    public MeetingNoEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m245632b();
    }

    /* renamed from: a */
    public void mo216781a(String str, boolean z) {
        boolean z2;
        if (!this.f157914c.equals(str)) {
            if (C57782ag.m224241a(str)) {
                m245633c();
                this.f157914c = "";
                return;
            }
            if (str.endsWith(" ")) {
                String substring = str.substring(0, str.length() - 1);
                setTxt(substring);
                setSelection(substring.length());
                this.f157914c = getText().toString();
                return;
            }
            if (str.length() < this.f157914c.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
            int selectionStart = getSelectionStart();
            if (z2 && selectionStart >= 1 && this.f157914c.replaceAll(" ", "").length() == str.replaceAll(" ", "").length()) {
                StringBuilder sb = new StringBuilder(str);
                sb.deleteCharAt(selectionStart - 1);
                selectionStart--;
                setTxt(sb.toString());
                setSelection(selectionStart);
                str = sb.toString();
            }
            int i = 0;
            for (int i2 = 0; i2 < selectionStart; i2++) {
                if (str.charAt(i2) != ' ') {
                    i++;
                }
            }
            StringBuilder sb2 = new StringBuilder(str.replaceAll(" ", ""));
            if (sb2.length() <= 3) {
                setTxt(sb2.toString());
            } else {
                sb2.insert(3, " ");
                if (sb2.length() <= 7) {
                    setTxt(sb2.toString());
                } else {
                    sb2.insert(7, " ");
                    setTxt(sb2.toString());
                }
            }
            this.f157914c = getText().toString();
            if (z) {
                for (int i3 = 0; i3 < sb2.length(); i3++) {
                    if (sb2.charAt(i3) != ' ') {
                        i--;
                    }
                    if (i == 0) {
                        setSelection(Math.min(i3 + 1, 11));
                        return;
                    }
                }
                return;
            }
            setSelection(sb2.length());
        }
    }

    public MeetingNoEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m245632b();
    }
}
