package com.ss.android.vc.meeting.module.reaction.widget.keyboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.emoji.EmojiData;
import com.ss.android.lark.widget.linked_emojicon.C58507d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.linked_emojicon.base.C58503b;
import com.ss.android.lark.widget.linked_emojicon.base.C58504c;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59030d;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.C59151a;
import com.ss.android.lark.widget.span.UrlImageSpan;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

public class RichTextEmojiconEditText extends EmojiconAutoCompleteEditText {

    /* renamed from: a */
    public AbstractC58541b f158383a;

    /* renamed from: b */
    public Editable f158384b = null;

    /* renamed from: c */
    private ClipboardManager f158385c;

    /* renamed from: d */
    private HashMap<Integer, String[]> f158386d;

    /* renamed from: e */
    private HashMap<Integer, RichTextElement> f158387e;

    /* renamed from: f */
    private Integer f158388f = 0;

    /* renamed from: g */
    private Integer f158389g = 0;

    /* renamed from: h */
    private Context f158390h;

    /* renamed from: i */
    private TextWatcher f158391i = new TextWatcher() {
        /* class com.ss.android.vc.meeting.module.reaction.widget.keyboard.RichTextEmojiconEditText.C628831 */

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            RichTextEmojiconEditText.this.f158384b = Editable.Factory.getInstance().newEditable(RichTextEmojiconEditText.this.getText());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 >= 5) {
                CharSequence subSequence = charSequence.subSequence(i, i + i3);
                if (RichTextEmojiconEditText.this.f158383a != null) {
                    RichTextEmojiconEditText.this.f158383a.mo147074a(subSequence, i, i3);
                }
            }
        }
    };

    /* renamed from: j */
    private AbstractC62843d f158392j = new AbstractC62843d() {
        /* class com.ss.android.vc.meeting.module.reaction.widget.keyboard.RichTextEmojiconEditText.C628842 */

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217098a() {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217099a(RichText richText) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217102a(RichTextElement.BoldProperty boldProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217103a(RichTextElement.ButtonProperty buttonProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217104a(RichTextElement.CodeBlockProperty codeBlockProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217105a(RichTextElement.DocsProperty docsProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217107a(RichTextElement.FigureProperty figureProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217111a(RichTextElement.ImageProperty imageProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217112a(RichTextElement.ItalicProperty italicProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217114a(RichTextElement.MediaProperty mediaProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217115a(RichTextElement.MentionProperty mentionProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217117a(RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217118a(RichTextElement.SelectProperty selectProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217120a(RichTextElement.UnderlineProperty underlineProperty) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: b */
        public void mo217121b(RichText richText) {
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217119a(RichTextElement.TextProperty textProperty, Map<String, String> map) {
            RichTextEmojiconEditText.this.mo217285a(textProperty.getContent());
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217116a(RichTextElement.ParagraphProperty paragraphProperty) {
            if (paragraphProperty.getIsNeedEnter()) {
                RichTextEmojiconEditText.this.mo217285a("\n");
            }
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217109a(RichTextElement.H2Property h2Property) {
            if (!TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo217285a("\n");
            }
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217110a(RichTextElement.H3Property h3Property) {
            if (!TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo217285a("\n");
            }
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217113a(RichTextElement.LIProperty lIProperty) {
            if (!TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo217285a("\n");
            }
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217101a(RichTextElement.AtProperty atProperty) {
            RichTextEmojiconEditText.this.mo217286a(atProperty.getUserId(), atProperty.getAtContent().substring(1), false, atProperty.isOutChatUser());
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217106a(RichTextElement.EmotionProperty emotionProperty) {
            String key = emotionProperty.getKey();
            if (!TextUtils.isEmpty(key)) {
                String emojiCodeFromKey = EmojiData.getEmojiCodeFromKey(key);
                int selectionStart = RichTextEmojiconEditText.this.getSelectionStart();
                Editable editableText = RichTextEmojiconEditText.this.getEditableText();
                if (selectionStart < 0 || selectionStart >= editableText.length()) {
                    editableText.append((CharSequence) emojiCodeFromKey);
                } else {
                    editableText.insert(selectionStart, emojiCodeFromKey);
                }
            }
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217108a(RichTextElement.H1Property h1Property) {
            if (!TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo217285a("\n");
            }
        }

        @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
        /* renamed from: a */
        public void mo217100a(RichTextElement.AnchorProperty anchorProperty, Map<String, String> map) {
            RichTextEmojiconEditText.this.mo217285a(anchorProperty.getHref());
            if (RichTextEmojiconEditText.this.f158383a != null) {
                RichTextEmojiconEditText.this.f158383a.mo147074a(anchorProperty.getHref(), -1, anchorProperty.getHref().length());
            }
        }
    };

    public void onFilterComplete(int i) {
    }

    /* access modifiers changed from: protected */
    public void replaceText(CharSequence charSequence) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.keyboard.RichTextEmojiconEditText$a */
    public static final class C62888a {

        /* renamed from: a */
        SpannableString f158400a;

        /* renamed from: b */
        Integer f158401b;

        /* renamed from: c */
        String f158402c;

        /* renamed from: d */
        String f158403d;

        private C62888a() {
        }
    }

    public void dismissDropDown() {
        super.dismissDropDown();
    }

    public HashMap<Integer, String[]> getRPMap() {
        return this.f158386d;
    }

    public HashMap<Integer, RichTextElement> getRRMap() {
        return this.f158387e;
    }

    public AbstractC62843d getRichTextRender() {
        return this.f158392j;
    }

    /* renamed from: a */
    public void mo217286a(String str, String str2, boolean z, boolean z2) {
        C62888a a = m246131a(str, str2, z2);
        getRPMap().put(a.f158401b, new String[]{a.f158403d, a.f158402c});
        getRRMap().put(a.f158401b, C59030d.m229169a(str, str2, z2));
        m246133a(a.f158400a, z);
    }

    /* renamed from: a */
    public void mo217283a() {
        ClipData newPlainText = ClipData.newPlainText("RichTextEmojiconEditText", mo217281a(true, this.f158388f, this.f158389g, this.f158384b));
        if (this.f158385c == null) {
            this.f158385c = (ClipboardManager) ar.m236694a().getSystemService("clipboard");
        }
        this.f158385c.setPrimaryClip(newPlainText);
    }

    /* renamed from: a */
    public void mo217285a(String str) {
        if (!TextUtils.isEmpty(str)) {
            getEditableText().insert(getSelectionEnd(), C58503b.m226963a((CharSequence) str).toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo217284a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            List<AtInfo> b = m246137b(charSequence);
            if (b.isEmpty()) {
                getEditableText().append(charSequence);
                return;
            }
            getEditableText().append(charSequence.subSequence(0, b.get(0).start));
            m246135a(b, charSequence);
            if (b.get(b.size() - 1).end < charSequence.length()) {
                getEditableText().append(charSequence.subSequence(b.get(b.size() - 1).end, charSequence.length()));
            }
        }
    }

    /* renamed from: a */
    public List<RichTextElement> mo217282a(int i, int i2, final Editable editable, HashMap<Integer, RichTextElement> hashMap, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList();
        if (i == i2) {
            return arrayList;
        }
        String trim = editable.toString().substring(i, i2).trim();
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) editable.getSpans(i, i2, ReplacementSpan.class);
        ArrayList arrayList2 = new ArrayList();
        try {
            for (ReplacementSpan replacementSpan : replacementSpanArr) {
                if (hashMap.get(Integer.valueOf(replacementSpan.hashCode())) != null) {
                    arrayList2.add(replacementSpan);
                } else if (replacementSpan instanceof C58504c) {
                    if (!TextUtils.isEmpty(((C58504c) replacementSpan).mo198296a())) {
                        arrayList2.add(replacementSpan);
                    }
                } else if (replacementSpan instanceof C58508e) {
                    arrayList2.add(replacementSpan);
                }
            }
        } catch (Throwable th) {
            C60700b.m235846a("RichTextEmojiconEditText", th.getMessage(), th);
        }
        if (arrayList2.size() == 0) {
            arrayList.addAll(C59029c.m229159a(C58503b.m226964a(trim)));
            return arrayList;
        }
        Collections.sort(arrayList2, new Comparator<ReplacementSpan>() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.keyboard.RichTextEmojiconEditText.C628875 */

            /* renamed from: a */
            public int compare(ReplacementSpan replacementSpan, ReplacementSpan replacementSpan2) {
                return editable.getSpanStart(replacementSpan) - editable.getSpanStart(replacementSpan2);
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (i4 == 0) {
                i3 = i;
            } else {
                i3 = editable.getSpanEnd(arrayList2.get(i4 - 1));
            }
            String substring = trim.substring(i3, editable.getSpanStart(arrayList2.get(i4)));
            if (!TextUtils.isEmpty(substring)) {
                arrayList.addAll(C59029c.m229159a(C58503b.m226964a(substring)));
            }
            if (hashMap.containsKey(Integer.valueOf(((ReplacementSpan) arrayList2.get(i4)).hashCode()))) {
                arrayList.add(hashMap.get(Integer.valueOf(((ReplacementSpan) arrayList2.get(i4)).hashCode())));
            } else if (arrayList2.get(i4) instanceof C58504c) {
                arrayList.add(C59030d.m229172b(((C58504c) arrayList2.get(i4)).mo198296a()));
            } else if (arrayList2.get(i4) instanceof C58508e) {
                C58508e eVar = (C58508e) arrayList2.get(i4);
                if (!z) {
                    arrayList.add(C59030d.m229164a(((C58508e) arrayList2.get(i4)).mo198324c().toString()));
                }
            }
        }
        int spanEnd = editable.getSpanEnd(arrayList2.get(arrayList2.size() - 1));
        String substring2 = (spanEnd < 0 || spanEnd >= i2 || i2 > trim.length()) ? "" : trim.substring(editable.getSpanEnd(arrayList2.get(arrayList2.size() - 1)), i2);
        if (!TextUtils.isEmpty(substring2)) {
            arrayList.addAll(C59029c.m229159a(C58503b.m226964a(substring2)));
        }
        return arrayList;
    }

    public RichText getDraftRichText() {
        return mo217287b(true);
    }

    public RichText getRichText() {
        return mo217287b(false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this.f158391i);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this.f158391i);
        this.f158384b = null;
    }

    public void showDropDown() {
        try {
            super.showDropDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo217289c() {
        ClipboardManager clipboardManager = (ClipboardManager) ar.m236694a().getSystemService("clipboard");
        CharSequence text = clipboardManager.getText();
        if (text != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, C58503b.m226963a(text)));
        }
    }

    /* renamed from: d */
    private void m246138d() {
        AbstractC58541b bVar;
        CharSequence text = ((ClipboardManager) ar.m236694a().getSystemService("clipboard")).getText();
        if (text != null && (bVar = this.f158383a) != null) {
            bVar.mo147074a(text, getSelectionStart() - text.length(), text.length());
        }
    }

    /* renamed from: e */
    private void m246139e() {
        String obj;
        int indexOf;
        Editable text = getText();
        while (length() > 0 && (indexOf = (obj = text.toString()).indexOf(10)) >= 0) {
            int i = indexOf + 1;
            if (!TextUtils.isEmpty(obj.substring(0, i).trim())) {
                break;
            }
            text.replace(0, i, "");
        }
        int nextSpanTransition = text.nextSpanTransition(0, length(), UrlImageSpan.class);
        if (nextSpanTransition != -1 && TextUtils.isEmpty(text.toString().substring(0, nextSpanTransition).trim())) {
            text.replace(0, nextSpanTransition, "");
        }
    }

    /* renamed from: b */
    public void mo217288b() {
        ClipData newPlainText = ClipData.newPlainText("RichTextEmojiconEditText", mo217280a(true, this.f158388f, this.f158389g));
        if (this.f158385c == null) {
            this.f158385c = (ClipboardManager) ar.m236694a().getSystemService("clipboard");
        }
        this.f158385c.setPrimaryClip(newPlainText);
    }

    public void setOnPasteListener(AbstractC58541b bVar) {
        this.f158383a = bVar;
    }

    public void setEmojiText(CharSequence charSequence) {
        setText(C58503b.m226963a(charSequence));
    }

    public void setOriginText(CharSequence charSequence) {
        setText("");
        mo217284a(C58503b.m226963a(charSequence));
    }

    public RichTextEmojiconEditText(Context context) {
        super(context);
        m246132a(context);
    }

    /* renamed from: b */
    private List<AtInfo> m246137b(CharSequence charSequence) {
        Matcher matcher = C57814c.f142386a.matcher(charSequence);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            AtInfo atInfo = new AtInfo();
            atInfo.start = matcher.start();
            atInfo.end = matcher.end();
            atInfo.userId = matcher.group(1);
            atInfo.text = matcher.group(2);
            arrayList.add(atInfo);
        }
        return arrayList;
    }

    public boolean onTextContextMenuItem(int i) {
        switch (i) {
            case 16908320:
                boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
                mo217283a();
                return onTextContextMenuItem;
            case 16908321:
                boolean onTextContextMenuItem2 = super.onTextContextMenuItem(i);
                mo217288b();
                return onTextContextMenuItem2;
            case 16908322:
                mo217289c();
                boolean onTextContextMenuItem3 = super.onTextContextMenuItem(i);
                if (!onTextContextMenuItem3) {
                    return onTextContextMenuItem3;
                }
                m246138d();
                return onTextContextMenuItem3;
            default:
                try {
                    return super.onTextContextMenuItem(i);
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
        }
    }

    /* renamed from: b */
    public RichText mo217287b(boolean z) {
        m246139e();
        RichText a = C59029c.m229157a(mo217282a(0, length(), getText(), getRRMap(), z));
        a.setInnerText(C58503b.m226964a(mo217279a(true).trim()));
        return a;
    }

    /* renamed from: a */
    private void m246132a(Context context) {
        this.f158390h = context;
        this.f158386d = new HashMap<>();
        this.f158387e = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[0]);
            setImportantForAutofill(8);
        }
    }

    public void setReplaceContentSpan(C58508e eVar) {
        if (eVar != null) {
            C58508e.C58511b b = eVar.mo198323b();
            int i = b.f144396a;
            int i2 = b.f144398c + i;
            int i3 = b.f144398c;
            eVar.mo198322a(new C58507d(this));
            if (!eVar.mo198323b().mo198341a()) {
                while (true) {
                    int indexOf = getEditableText().toString().indexOf(b.f144397b.toString());
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString("$");
                        spannableString.setSpan(eVar.mo198320a(), 0, 1, 33);
                        getEditableText().replace(indexOf, indexOf + i3, spannableString);
                    } else {
                        return;
                    }
                }
            } else if (getEditableText().length() >= i2 && C57782ag.m224242a(getEditableText().subSequence(i, i2).toString(), b.f144397b.toString())) {
                SpannableString spannableString2 = new SpannableString("$");
                spannableString2.setSpan(eVar, 0, 1, 33);
                getEditableText().replace(i, i2, spannableString2);
            }
        }
    }

    /* renamed from: a */
    public String mo217279a(boolean z) {
        return mo217281a(z, (Integer) 0, Integer.valueOf(length()), getText());
    }

    /* renamed from: a */
    private C62888a m246129a(AtInfo atInfo, CharSequence charSequence) {
        return m246130a(atInfo, charSequence, false);
    }

    /* renamed from: a */
    private void m246134a(Integer num, boolean z) {
        if (num.intValue() != 0 || !z) {
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        if (i != i2) {
            this.f158388f = Integer.valueOf(i);
            this.f158389g = Integer.valueOf(i2);
        }
    }

    /* renamed from: a */
    private void m246133a(SpannableString spannableString, boolean z) {
        getEditableText().append((CharSequence) spannableString);
        if (z) {
            getEditableText().append(" ");
        }
        post(new Runnable() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.keyboard.RichTextEmojiconEditText.RunnableC628853 */

            public void run() {
                RichTextEmojiconEditText.this.requestFocus();
                KeyboardUtils.showKeyboard(RichTextEmojiconEditText.this);
            }
        });
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 111 || !isPopupShowing()) {
            try {
                return super.onKeyDown(i, keyEvent);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable unused) {
            }
        } else {
            dismissDropDown();
            return true;
        }
        return false;
    }

    public RichTextEmojiconEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m246132a(context);
    }

    /* renamed from: a */
    private void m246135a(List<AtInfo> list, CharSequence charSequence) {
        for (int i = 0; i < list.size(); i++) {
            C62888a a = m246129a(list.get(i), charSequence);
            getEditableText().append((CharSequence) a.f158400a);
            if (i < list.size() - 1) {
                getEditableText().append(charSequence.subSequence(list.get(i).end, list.get(i + 1).start));
            }
            getRPMap().put(a.f158401b, new String[]{a.f158403d, a.f158402c});
            getRRMap().put(a.f158401b, C59030d.m229165a(list.get(i).userId, a.f158402c.substring(1)));
        }
    }

    /* renamed from: a */
    private C62888a m246130a(AtInfo atInfo, CharSequence charSequence, boolean z) {
        SpannableString spannableString = new SpannableString("$");
        C59151a aVar = new C59151a(this.f158390h, atInfo.text, z);
        spannableString.setSpan(aVar, 0, 1, 33);
        C62888a aVar2 = new C62888a();
        aVar2.f158400a = spannableString;
        aVar2.f158401b = Integer.valueOf(aVar.hashCode());
        aVar2.f158402c = aVar.mo201076a();
        aVar2.f158403d = charSequence.subSequence(atInfo.start, atInfo.end).toString();
        return aVar2;
    }

    /* renamed from: a */
    private C62888a m246131a(String str, String str2, boolean z) {
        boolean z2;
        int selectionStart = getSelectionStart();
        String obj = getText().toString();
        if (obj.equals("") || selectionStart <= 0 || !obj.substring(selectionStart - 1, selectionStart).equals("@")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            getEditableText().delete(selectionStart - 1, selectionStart);
        }
        String b = C57814c.m224350b(str, str2);
        SpannableString spannableString = new SpannableString("$");
        Context context = this.f158390h;
        C59151a aVar = new C59151a(context, "@" + str2, z);
        spannableString.setSpan(aVar, 0, 1, 33);
        C62888a aVar2 = new C62888a();
        aVar2.f158400a = spannableString;
        aVar2.f158401b = Integer.valueOf(aVar.hashCode());
        aVar2.f158402c = aVar.mo201076a();
        aVar2.f158403d = b;
        return aVar2;
    }

    public RichTextEmojiconEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m246132a(context);
    }

    /* renamed from: a */
    public String mo217280a(boolean z, Integer num, Integer num2) {
        return mo217281a(z, num, num2, getText());
    }

    /* renamed from: b */
    private String m246136b(boolean z, Integer num, Integer num2, final Editable editable) {
        String str;
        int i;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        Integer valueOf = Integer.valueOf(Math.min(intValue, intValue2));
        Integer valueOf2 = Integer.valueOf(Math.max(intValue, intValue2));
        Integer valueOf3 = Integer.valueOf(z ? 1 : 0);
        String substring = editable.toString().substring(valueOf.intValue(), valueOf2.intValue());
        StringBuilder sb = new StringBuilder();
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) editable.getSpans(valueOf.intValue(), valueOf2.intValue(), ReplacementSpan.class);
        if (replacementSpanArr.length == 0) {
            return substring;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (ReplacementSpan replacementSpan : replacementSpanArr) {
                if (getRPMap().get(Integer.valueOf(replacementSpan.hashCode())) != null) {
                    arrayList.add(replacementSpan);
                } else if (replacementSpan instanceof C58508e) {
                    arrayList.add(replacementSpan);
                }
            }
        } catch (Throwable th) {
            C60700b.m235846a("RichTextEmojiconEditText", th.getMessage(), th);
        }
        if (arrayList.size() == 0) {
            return substring;
        }
        Collections.sort(arrayList, new Comparator<ReplacementSpan>() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.keyboard.RichTextEmojiconEditText.C628864 */

            /* renamed from: a */
            public int compare(ReplacementSpan replacementSpan, ReplacementSpan replacementSpan2) {
                return editable.getSpanStart(replacementSpan) - editable.getSpanStart(replacementSpan2);
            }
        });
        Integer num3 = 0;
        try {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ReplacementSpan replacementSpan2 = (ReplacementSpan) arrayList.get(i2);
                if (replacementSpan2 instanceof C58508e) {
                    str = ((C58508e) replacementSpan2).mo198324c().toString();
                } else {
                    str = getRPMap().get(Integer.valueOf(replacementSpan2.hashCode()))[valueOf3.intValue()];
                }
                if (replacementSpan2 instanceof C59151a) {
                    num3 = Integer.valueOf(num3.intValue() + 1);
                }
                int spanStart = editable.getSpanStart(replacementSpan2) - valueOf.intValue();
                if (i2 == 0) {
                    i = 0;
                } else {
                    i = editable.getSpanEnd(arrayList.get(i2 - 1)) - valueOf.intValue();
                }
                sb.append(substring.substring(i, spanStart));
                sb.append(str);
            }
            sb.append(substring.substring(editable.getSpanEnd(arrayList.get(arrayList.size() - 1)) - valueOf.intValue()));
            m246134a(num3, false);
            return sb.toString();
        } catch (Throwable th2) {
            C60700b.m235846a("RichTextEmojiconEditText", th2.getMessage(), th2);
            return substring;
        }
    }

    /* renamed from: a */
    public String mo217281a(boolean z, Integer num, Integer num2, Editable editable) {
        return C58503b.m226964a(m246136b(z, num, num2, editable));
    }
}
