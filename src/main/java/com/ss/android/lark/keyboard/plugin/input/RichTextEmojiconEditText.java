package com.ss.android.lark.keyboard.plugin.input;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.drag.DragDropController;
import com.ss.android.lark.widget.linked_emojicon.C58507d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.linked_emojicon.base.C58504c;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.listener.OnSizeChangeListener;
import com.ss.android.lark.widget.richtext.AbstractC59028b;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59030d;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.C59062j;
import com.ss.android.lark.widget.richtext.preprocess.C59063k;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.C59151a;
import com.ss.android.lark.widget.span.C59152b;
import com.ss.android.lark.widget.span.C59156f;
import com.ss.android.lark.widget.span.C59157g;
import com.ss.android.lark.widget.span.C59158h;
import com.ss.android.lark.widget.span.C59179o;
import com.ss.android.lark.widget.span.C59181q;
import com.ss.android.lark.widget.span.C59185t;
import com.ss.android.lark.widget.span.MentionInfo;
import com.ss.android.lark.widget.span.TextStyleInfo;
import com.ss.android.lark.widget.span.UrlImageSpan;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

public class RichTextEmojiconEditText extends EmojiconAutoCompleteEditText {

    /* renamed from: A */
    private OnSizeChangeListener f103337A;

    /* renamed from: a */
    public AbstractC58541b f103338a;

    /* renamed from: b */
    public Editable f103339b = null;

    /* renamed from: c */
    public Context f103340c;

    /* renamed from: d */
    public boolean f103341d;

    /* renamed from: e */
    public boolean f103342e;

    /* renamed from: f */
    public boolean f103343f;

    /* renamed from: g */
    public boolean f103344g = false;

    /* renamed from: h */
    public AbstractC40696f f103345h;

    /* renamed from: i */
    public AbstractC40695e f103346i;

    /* renamed from: j */
    public int f103347j = -1;

    /* renamed from: k */
    private ClipboardManager f103348k;

    /* renamed from: l */
    private HashMap<Integer, String[]> f103349l;

    /* renamed from: m */
    private HashMap<Integer, RichTextElement> f103350m;

    /* renamed from: n */
    private Integer f103351n = 0;

    /* renamed from: o */
    private Integer f103352o = 0;

    /* renamed from: p */
    private boolean f103353p;

    /* renamed from: q */
    private boolean f103354q = true;

    /* renamed from: r */
    private boolean f103355r = false;

    /* renamed from: s */
    private int f103356s;

    /* renamed from: t */
    private int f103357t;

    /* renamed from: u */
    private AbstractC40694d f103358u;

    /* renamed from: v */
    private boolean f103359v = true;

    /* renamed from: w */
    private C59062j f103360w = new C59062j(getContext());

    /* renamed from: x */
    private final TextWatcher f103361x = new TextWatcher() {
        /* class com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText.C406861 */

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            RichTextEmojiconEditText.this.f103339b = Editable.Factory.getInstance().newEditable(RichTextEmojiconEditText.this.getText());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 >= 5) {
                CharSequence subSequence = charSequence.subSequence(i, i + i3);
                if (RichTextEmojiconEditText.this.f103338a != null) {
                    RichTextEmojiconEditText.this.f103338a.mo147074a(subSequence, i, i3);
                }
            }
        }
    };

    /* renamed from: y */
    private final AbstractC59028b f103362y = new AbstractC59028b() {
        /* class com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText.C406872 */

        /* renamed from: b */
        private int f103366b;

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146967a() {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146971a(RichTextElement.BoldProperty boldProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146972a(RichTextElement.ButtonProperty buttonProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146974a(RichTextElement.DocsProperty docsProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146976a(RichTextElement.FigureProperty figureProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146981a(RichTextElement.ItalicProperty italicProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146986a(RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146987a(RichTextElement.SelectProperty selectProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146989a(RichTextElement.UnderlineProperty underlineProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146988a(RichTextElement.TextProperty textProperty, Map<String, String> map) {
            String content = textProperty.getContent();
            if (!TextUtils.isEmpty(content)) {
                RichTextEmojiconEditText.this.mo146920a(map, content);
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146980a(RichTextElement.ImageProperty imageProperty) {
            if (RichTextEmojiconEditText.this.getText().length() > 0 && !RichTextEmojiconEditText.this.getText().toString().endsWith("\n")) {
                RichTextEmojiconEditText.this.mo146915a("\n");
            }
            if (RichTextEmojiconEditText.this.f103343f) {
                RichTextEmojiconEditText.this.mo146915a(UIHelper.getString(R.string.Lark_Legacy_ImageSummarize));
                return;
            }
            List<String> urls = imageProperty.getUrls();
            if (!CollectionUtils.isEmpty(urls)) {
                String str = urls.get(0);
                UrlImageSpan rVar = new UrlImageSpan(RichTextEmojiconEditText.this.f103340c, str, RichTextEmojiconEditText.this, null);
                rVar.mo201132a(RichTextEmojiconEditText.this.f103347j);
                RichTextEmojiconEditText.this.mo146912a(rVar, str, ImageUtils.m224133a(str, imageProperty.getOriginWidth(), imageProperty.getOriginHeight()), imageProperty.getToken(), imageProperty.getOriginWidth(), imageProperty.getOriginHeight(), true, imageProperty.isOriginSource());
                RichTextEmojiconEditText.this.setFocusable(true);
                RichTextEmojiconEditText.this.requestFocus();
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146985a(RichTextElement.ParagraphProperty paragraphProperty) {
            if (paragraphProperty.getIsNeedEnter() && !TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo146915a("\n");
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146983a(RichTextElement.MediaProperty mediaProperty) {
            if (RichTextEmojiconEditText.this.f103343f) {
                RichTextEmojiconEditText.this.mo146915a(UIHelper.getString(R.string.Lark_Legacy_MessagePoVideo));
                return;
            }
            String originPath = mediaProperty.getOriginPath();
            if (TextUtils.isEmpty(originPath) || !new File(originPath).exists()) {
                Log.m165389i("RichTextEmojiconEditText", "recover video failed, localPath is:" + originPath);
                return;
            }
            if (RichTextEmojiconEditText.this.getText().length() > 0 && !RichTextEmojiconEditText.this.getText().toString().endsWith("\n")) {
                RichTextEmojiconEditText.this.mo146915a("\n");
            }
            C59185t tVar = new C59185t(RichTextEmojiconEditText.this.getContext(), originPath, C26279i.m95149a(mediaProperty.getDuration()), RichTextEmojiconEditText.this);
            tVar.mo201141a(RichTextEmojiconEditText.this.f103347j);
            RichTextEmojiconEditText.this.mo146913a(tVar, new IPhotoDependency.VideoInfo(mediaProperty.getOriginPath(), mediaProperty.getCompressPath(), mediaProperty.getMime(), mediaProperty.getSize(), (long) mediaProperty.getDuration()), new IPhotoDependency.FrameInfo(mediaProperty.getCoverPath(), mediaProperty.getWidth(), mediaProperty.getHeight()), ImageUtils.m224133a(originPath, (int) LocationRequest.PRIORITY_HD_ACCURACY, (int) LocationRequest.PRIORITY_HD_ACCURACY), true);
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146977a(RichTextElement.H1Property h1Property) {
            if (!TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo146915a("\n");
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146978a(RichTextElement.H2Property h2Property) {
            if (!TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo146915a("\n");
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146979a(RichTextElement.H3Property h3Property) {
            if (!TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo146915a("\n");
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146982a(RichTextElement.LIProperty lIProperty) {
            if (!TextUtils.isEmpty(RichTextEmojiconEditText.this.getText())) {
                RichTextEmojiconEditText.this.mo146915a("\n");
            }
            String listNum = lIProperty.getListNum();
            int floor = lIProperty.getFloor();
            if (!TextUtils.isEmpty(listNum)) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < floor; i++) {
                    sb.append("  ");
                }
                sb.append(listNum);
                RichTextEmojiconEditText.this.mo146915a(sb.toString());
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146984a(RichTextElement.MentionProperty mentionProperty) {
            RichTextEmojiconEditText.this.mo146916a(mentionProperty.getMentionItem().getId(), mentionProperty.getContent().substring(1), mentionProperty.isAuthorized());
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146968a(RichText richText) {
            this.f103366b = RichTextEmojiconEditText.this.getText().length();
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: b */
        public void mo146990b(RichText richText) {
            int length = RichTextEmojiconEditText.this.getText().length();
            Log.m165379d("RichTextEmojiconEditText", "startIndex:" + this.f103366b + ", endIndex:" + length);
            RichTextEmojiconEditText.this.mo146910a(this.f103366b, length);
            if (RichTextEmojiconEditText.this.f103346i != null) {
                RichTextEmojiconEditText.this.f103346i.mo147004a();
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146973a(RichTextElement.CodeBlockProperty codeBlockProperty) {
            RichTextEmojiconEditText.this.mo146915a(UIHelper.getString(R.string.Lark_Message_Codeblock));
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146975a(RichTextElement.EmotionProperty emotionProperty) {
            String key = emotionProperty.getKey();
            if (!TextUtils.isEmpty(key)) {
                String b = EmojiHandler.m226949b(key);
                int selectionStart = RichTextEmojiconEditText.this.getSelectionStart();
                Editable editableText = RichTextEmojiconEditText.this.getEditableText();
                if (selectionStart < 0 || selectionStart >= editableText.length()) {
                    editableText.append((CharSequence) b);
                } else {
                    editableText.insert(selectionStart, b);
                }
            }
        }

        /* renamed from: a */
        private void m160951a(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new UrlEditSpan(str2, str, RichTextEmojiconEditText.this.f103345h), 0, str.length(), 33);
                RichTextEmojiconEditText.this.getEditableText().append((CharSequence) spannableString);
                RichTextEmojiconEditText.this.setMovementMethod(C40693c.m160980a());
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146969a(RichTextElement.AnchorProperty anchorProperty, Map<String, String> map) {
            if (!RichTextEmojiconEditText.this.f103341d) {
                String content = anchorProperty.getContent();
                if (!TextUtils.isEmpty(content)) {
                    RichTextEmojiconEditText.this.mo146920a(map, content);
                    if (RichTextEmojiconEditText.this.f103338a != null) {
                        RichTextEmojiconEditText.this.f103338a.mo147074a(content, -1, content.length());
                    }
                }
            } else if (RichTextEmojiconEditText.this.f103342e) {
                String displayTitle = anchorProperty.getDisplayTitle();
                if (TextUtils.isEmpty(displayTitle)) {
                    displayTitle = anchorProperty.getContent();
                    if (TextUtils.isEmpty(displayTitle)) {
                        displayTitle = anchorProperty.getHref();
                    }
                }
                m160952a(displayTitle, anchorProperty.getHref(), anchorProperty.getLocalIconRes(), anchorProperty.getIconKey());
            } else if (anchorProperty.getLocalIconRes() <= 0) {
                m160951a(anchorProperty.getContent(), anchorProperty.getHref());
            } else {
                m160952a(anchorProperty.getDisplayTitle(), anchorProperty.getHref(), anchorProperty.getLocalIconRes(), null);
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146970a(RichTextElement.AtProperty atProperty, Map<String, String> map) {
            if (RichTextEmojiconEditText.this.f103344g) {
                String atContent = atProperty.getAtContent();
                if (!TextUtils.isEmpty(atContent)) {
                    RichTextEmojiconEditText.this.mo146920a(map, atContent);
                    return;
                }
                return;
            }
            RichTextEmojiconEditText.this.mo146918a(atProperty.getUserId(), atProperty.getAtContent().substring(1), false, atProperty.isOutChatUser(), atProperty.isAnonymous(), map);
        }

        /* renamed from: a */
        private void m160952a(String str, String str2, int i, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                C58508e.C58510a c = new C58508e.C58510a(RichTextEmojiconEditText.this.f103340c, new C58508e.C58511b(str2)).mo198336a(str).mo198339c(UIHelper.getColor(R.color.text_link_normal));
                if (i > 0) {
                    c.mo198333a(i);
                } else {
                    IconKeyDrawable oVar = new IconKeyDrawable(RichTextEmojiconEditText.this.f103340c);
                    oVar.mo89035a(str3, null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), UDIconUtils.getIconDrawable(RichTextEmojiconEditText.this.f103340c, (int) R.drawable.ud_icon_link_copy_outlined, UDColorUtils.getColor(RichTextEmojiconEditText.this.f103340c, R.color.text_link_normal)), false, Integer.valueOf(UIHelper.getColor(R.color.text_link_normal)));
                    c.mo198335a(oVar);
                }
                SpannableString spannableString = new SpannableString("$");
                spannableString.setSpan(c.mo198337a(), 0, 1, 33);
                spannableString.setSpan(new DocClickSpan(str2, RichTextEmojiconEditText.this.f103345h), 0, 1, 33);
                RichTextEmojiconEditText.this.getEditableText().append((CharSequence) spannableString);
                RichTextEmojiconEditText.this.setMovementMethod(C40693c.m160980a());
            }
        }
    };

    /* renamed from: z */
    private DragDropController.OnDragDropListener f103363z;

    /* renamed from: com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText$d */
    public interface AbstractC40694d {
        /* renamed from: a */
        void mo147003a(View view, String str);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText$e */
    public interface AbstractC40695e {
        /* renamed from: a */
        void mo147004a();
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText$f */
    public interface AbstractC40696f {
        /* renamed from: a */
        void mo147005a(View view, String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo146914a(CharSequence charSequence) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo146925b() {
        return false;
    }

    public void onFilterComplete(int i) {
    }

    /* access modifiers changed from: protected */
    public void replaceText(CharSequence charSequence) {
    }

    public static class UrlEditSpan extends URLSpan {

        /* renamed from: a */
        private final AbstractC40696f f103373a;

        /* renamed from: b */
        private String f103374b;

        /* renamed from: a */
        public String mo146998a() {
            return this.f103374b;
        }

        public void onClick(View view) {
            AbstractC40696f fVar = this.f103373a;
            if (fVar != null) {
                fVar.mo147005a(view, getURL());
            } else {
                super.onClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(UIHelper.getColor(R.color.text_link_normal));
            textPaint.setUnderlineText(false);
        }

        public UrlEditSpan(String str, String str2, AbstractC40696f fVar) {
            super(str);
            this.f103374b = str2;
            this.f103373a = fVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText$b */
    public static final class C40692b {

        /* renamed from: a */
        SpannableString f103377a;

        /* renamed from: b */
        Integer f103378b;

        /* renamed from: c */
        String f103379c;

        /* renamed from: d */
        String f103380d;

        private C40692b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m160928k() {
        requestFocus();
    }

    public void dismissDropDown() {
        super.dismissDropDown();
    }

    public HashMap<Integer, String[]> getRPMap() {
        return this.f103349l;
    }

    public HashMap<Integer, RichTextElement> getRRMap() {
        return this.f103350m;
    }

    public AbstractC59028b getRichTextRender() {
        return this.f103362y;
    }

    /* renamed from: a */
    public void mo146910a(int i, int i2) {
        Editable text = getText();
        if (text.length() < i || text.length() < i2) {
            Log.m165383e("RichTextEmojiconEditText", "replaceDraftSpanFailed, textLen:" + text.length() + ", start:" + i + ", end:" + i2);
            return;
        }
        C58514h[] hVarArr = (C58514h[]) text.getSpans(i, i2, C58514h.class);
        for (C58514h hVar : hVarArr) {
            int spanStart = text.getSpanStart(hVar);
            int spanEnd = text.getSpanEnd(hVar);
            text.removeSpan(hVar);
            text.setSpan(hVar, spanStart, spanEnd, 34);
        }
    }

    /* renamed from: a */
    public boolean mo146921a() {
        return this.f103355r;
    }

    /* renamed from: a */
    public void mo146920a(Map<String, String> map, String str) {
        TextStyleInfo a = this.f103360w.mo200653a().mo200655a(map).mo200656a(str);
        if (a == null || !this.f103355r) {
            mo146915a(str);
        } else {
            mo146911a(m160905a(str, a, 33));
        }
    }

    /* renamed from: a */
    public void mo146912a(UrlImageSpan rVar, String str, String str2, String str3, int i, int i2, boolean z, boolean z2) {
        SpannableString spannableString = new SpannableString("$");
        spannableString.setSpan(rVar, 0, 1, 33);
        getRPMap().put(Integer.valueOf(rVar.hashCode()), new String[]{str2, UIHelper.getString(R.string.Lark_Legacy_MessagePoPhoto)});
        getRRMap().put(Integer.valueOf(rVar.hashCode()), C59030d.m229167a(str, str3, i, i2, z2));
        int selectionStart = getSelectionStart();
        Editable editableText = getEditableText();
        String str4 = "\n";
        if (selectionStart < 0 || selectionStart >= editableText.length()) {
            editableText.append((CharSequence) spannableString);
            if (z) {
                editableText.append((CharSequence) str4);
                return;
            }
            return;
        }
        if (!z) {
            str4 = "";
        }
        editableText.insert(selectionStart, str4);
        editableText.insert(str4.length() + selectionStart, spannableString);
        editableText.insert(selectionStart + str4.length() + spannableString.length(), str4);
    }

    /* renamed from: a */
    public void mo146913a(C59185t tVar, IPhotoDependency.VideoInfo videoInfo, IPhotoDependency.FrameInfo frameInfo, String str, boolean z) {
        SpannableString spannableString = new SpannableString("$");
        spannableString.setSpan(tVar, 0, 1, 33);
        getRPMap().put(Integer.valueOf(tVar.hashCode()), new String[]{str, UIHelper.getString(R.string.Lark_Legacy_MessagePoVideo)});
        getRRMap().put(Integer.valueOf(tVar.hashCode()), C59030d.m229168a(videoInfo.getPath(), videoInfo.getCompressPath(), frameInfo.getPath(), frameInfo.getWidth(), frameInfo.getHeight(), videoInfo.getMimeType(), (int) videoInfo.getDuration(), videoInfo.getSize()));
        int selectionStart = getSelectionStart();
        Editable editableText = getEditableText();
        String str2 = "\n";
        if (selectionStart < 0 || selectionStart >= editableText.length()) {
            editableText.append((CharSequence) spannableString);
            if (z) {
                editableText.append((CharSequence) str2);
                return;
            }
            return;
        }
        if (!z) {
            str2 = "";
        }
        editableText.insert(selectionStart, str2);
        editableText.insert(str2.length() + selectionStart, spannableString);
        editableText.insert(selectionStart + str2.length() + spannableString.length(), str2);
    }

    /* renamed from: a */
    public void mo146917a(String str, String str2, boolean z, boolean z2) {
        Pair<CharSequence, Integer> c = m160919c(str, str2, z, z2);
        String charSequence = ((CharSequence) c.first).toString();
        if (!m160924g()) {
            charSequence = charSequence + " ";
        }
        mo146919a(charSequence, z);
        int intValue = ((Integer) c.second).intValue();
        if (intValue > 0) {
            getEditableText().delete(intValue - 1, intValue);
        }
    }

    /* renamed from: a */
    public void mo146918a(String str, String str2, boolean z, boolean z2, boolean z3, Map<String, String> map) {
        SpannableStringBuilder spannableStringBuilder;
        Pair<C40692b, Integer> b = m160915b(str, str2, z2, z3);
        C40692b bVar = (C40692b) b.first;
        getRPMap().put(bVar.f103378b, new String[]{bVar.f103380d, bVar.f103379c});
        getRRMap().put(bVar.f103378b, C59030d.m229170a(str, str2, z2, z3));
        TextStyleInfo a = this.f103360w.mo200653a().mo200655a(map).mo200656a(bVar.f103377a.toString());
        if (a == null || !this.f103355r) {
            spannableStringBuilder = new SpannableStringBuilder(bVar.f103377a);
        } else {
            spannableStringBuilder = m160905a(bVar.f103377a, a, 34);
        }
        m160910a(spannableStringBuilder, z);
        int intValue = ((Integer) b.second).intValue();
        if (intValue > 0) {
            getEditableText().delete(intValue - 1, intValue);
        }
    }

    /* renamed from: a */
    public CharSequence mo146907a(boolean z, Integer num, Integer num2, Editable editable) {
        return m160916b(z, num, num2, editable);
    }

    /* renamed from: a */
    public String mo146908a(boolean z) {
        m160925h();
        return mo146907a(z, (Integer) 0, Integer.valueOf(length()), getText()).toString();
    }

    /* renamed from: a */
    public void mo146911a(SpannableStringBuilder spannableStringBuilder) {
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            if (this.f103353p) {
                getEditableText().append((CharSequence) spannableStringBuilder);
                return;
            }
            getEditableText().insert(getSelectionEnd(), spannableStringBuilder);
        }
    }

    /* renamed from: a */
    public void mo146915a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f103353p) {
                getEditableText().append((CharSequence) str);
                return;
            }
            getEditableText().insert(getSelectionEnd(), str);
        }
    }

    /* renamed from: a */
    public void mo146919a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            int selectionEnd = getSelectionEnd();
            List<AtInfo> c = m160921c(str);
            if (c.isEmpty()) {
                getEditableText().insert(selectionEnd, str);
                return;
            }
            CharSequence subSequence = str.subSequence(0, c.get(0).start);
            getEditableText().insert(selectionEnd, subSequence);
            int a = m160904a(c, str, selectionEnd + subSequence.length(), z);
            if (c.get(c.size() - 1).end < str.length()) {
                getEditableText().insert(a, str.subSequence(c.get(c.size() - 1).end, str.length()));
            }
        }
    }

    /* renamed from: a */
    private void m160912a(List<AtInfo> list, CharSequence charSequence) {
        for (int i = 0; i < list.size(); i++) {
            C40692b a = m160906a(list.get(i), charSequence);
            getEditableText().append((CharSequence) a.f103377a);
            if (i < list.size() - 1) {
                getEditableText().append(charSequence.subSequence(list.get(i).end, list.get(i + 1).start));
            }
            getRPMap().put(a.f103378b, new String[]{a.f103380d, a.f103379c});
            getRRMap().put(a.f103378b, C59030d.m229165a(list.get(i).userId, a.f103379c.substring(1)));
        }
    }

    /* renamed from: a */
    public List<RichTextElement> mo146909a(int i, int i2, final Editable editable, HashMap<Integer, RichTextElement> hashMap, boolean z) {
        int i3;
        String str;
        ArrayList arrayList = new ArrayList();
        if (i == i2) {
            return arrayList;
        }
        editable.toString().substring(i, i2);
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
            Log.m165386e(th.getMessage(), th);
        }
        UrlEditSpan[] urlEditSpanArr = (UrlEditSpan[]) editable.getSpans(i, i2, UrlEditSpan.class);
        if (urlEditSpanArr.length > 0) {
            arrayList2.addAll(Arrays.asList(urlEditSpanArr));
        }
        if (arrayList2.size() == 0) {
            arrayList.addAll(C59029c.m229158a(editable));
            return arrayList;
        }
        Collections.sort(arrayList2, new Comparator<CharacterStyle>() {
            /* class com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText.C406905 */

            /* renamed from: a */
            public int compare(CharacterStyle characterStyle, CharacterStyle characterStyle2) {
                return editable.getSpanStart(characterStyle) - editable.getSpanStart(characterStyle2);
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (i4 == 0) {
                i3 = i;
            } else {
                i3 = editable.getSpanEnd(arrayList2.get(i4 - 1));
            }
            int spanStart = editable.getSpanStart(arrayList2.get(i4));
            int i5 = spanStart - i3;
            if (i5 < 0) {
                Log.m165383e("RichTextEmojiconEditText", "getAllRichTextElementi:" + i4 + " subLen:" + i5);
            } else {
                CharSequence subSequence = editable.subSequence(i3, spanStart);
                if (!TextUtils.isEmpty(subSequence)) {
                    arrayList.addAll(C59029c.m229158a(subSequence));
                }
                Object obj = arrayList2.get(i4);
                if (hashMap.containsKey(Integer.valueOf(obj.hashCode()))) {
                    RichTextElement richTextElement = hashMap.get(Integer.valueOf(obj.hashCode()));
                    richTextElement.setStyle(C59063k.m229421a(m160908a(editable, obj)));
                    arrayList.add(richTextElement);
                } else if (arrayList2.get(i4) instanceof C58504c) {
                    arrayList.add(C59030d.m229172b(((C58504c) arrayList2.get(i4)).mo198296a()));
                } else if (arrayList2.get(i4) instanceof C58508e) {
                    C58508e eVar = (C58508e) arrayList2.get(i4);
                    if (z) {
                        if (this.f103341d) {
                            str = eVar.mo198326d();
                        } else {
                            str = UIHelper.mustacheFormat((int) R.string.Lark_Chat_HideDocsURL, "doctitle", eVar.mo198326d());
                        }
                        arrayList.add(C59030d.m229173b(str, eVar.mo198324c().toString()));
                    } else {
                        RichTextElement a = C59030d.m229164a(((C58508e) arrayList2.get(i4)).mo198324c().toString());
                        a.setStyle(C59063k.m229421a(m160908a(editable, obj)));
                        arrayList.add(a);
                    }
                } else if (arrayList2.get(i4) instanceof UrlEditSpan) {
                    UrlEditSpan urlEditSpan = (UrlEditSpan) arrayList2.get(i4);
                    arrayList.add(C59030d.m229173b(urlEditSpan.mo146998a(), urlEditSpan.getURL()));
                }
            }
        }
        CharSequence subSequence2 = editable.subSequence(editable.getSpanEnd(arrayList2.get(arrayList2.size() - 1)), i2);
        if (!TextUtils.isEmpty(subSequence2)) {
            arrayList.addAll(C59029c.m229158a(subSequence2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo146916a(String str, String str2, boolean z) {
        m160917b(((Object) mo146923b(str, str2, z)) + " ", z);
    }

    /* renamed from: a */
    private static boolean m160914a(KeyEvent keyEvent) {
        if (m160918b(keyEvent)) {
            return keyEvent.hasModifiers(65536);
        }
        return keyEvent.hasModifiers(4096);
    }

    public RichText getDraftRichText() {
        return mo146922b(true);
    }

    public RichText getRichText() {
        return mo146922b(false);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText$c */
    public static class C40693c extends LinkMovementMethod {

        /* renamed from: a */
        private static MovementMethod f103381a;

        /* renamed from: a */
        public static MovementMethod m160980a() {
            if (f103381a == null) {
                f103381a = new C40693c();
            }
            return f103381a;
        }

        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                return true;
            }
            if (action == 1) {
                int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                int scrollX = x + textView.getScrollX();
                int scrollY = y + textView.getScrollY();
                Layout layout = textView.getLayout();
                int lineForVertical = layout.getLineForVertical(scrollY);
                float lineLeft = layout.getLineLeft(lineForVertical);
                float lineRight = layout.getLineRight(lineForVertical);
                float f = (float) scrollX;
                if (f > lineRight || (scrollX >= 0 && f < lineLeft)) {
                    return true;
                }
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this.f103361x);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this.f103361x);
        this.f103339b = null;
    }

    public void showDropDown() {
        try {
            super.showDropDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public void mo146929e() {
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        CharSequence text = clipboardManager.getText();
        if (text != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, text));
        }
    }

    /* renamed from: g */
    private boolean m160924g() {
        C59156f[] fVarArr;
        Editable text = getText();
        if (!TextUtils.isEmpty(text) && (text instanceof Spanned) && (fVarArr = (C59156f[]) text.getSpans(text.length() - 1, text.length(), C59156f.class)) != null && fVarArr.length > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m160926i() {
        AbstractC58541b bVar;
        CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
        if (text != null && (bVar = this.f103338a) != null) {
            bVar.mo147074a(text, getSelectionStart() - text.length(), text.length());
        }
    }

    /* renamed from: d */
    public void mo146927d() {
        CharSequence a = mo146907a(true, this.f103351n, this.f103352o, getText());
        ClipData newPlainText = ClipData.newPlainText("RichTextEmojiconEditText", a);
        if (this.f103348k == null) {
            this.f103348k = (ClipboardManager) getContext().getSystemService("clipboard");
        }
        this.f103348k.setPrimaryClip(newPlainText);
        mo146914a(a);
    }

    /* renamed from: h */
    private void m160925h() {
        Editable text = getText();
        AbstractC40729d[] dVarArr = (AbstractC40729d[]) text.getSpans(0, text.length(), AbstractC40729d.class);
        if (dVarArr.length > 0) {
            int i = -1;
            int i2 = -1;
            for (int length = dVarArr.length - 1; length >= 0; length--) {
                AbstractC40729d dVar = dVarArr[length];
                int spanStart = text.getSpanStart(dVar);
                int spanEnd = text.getSpanEnd(dVar);
                text.removeSpan(dVar);
                if (spanStart >= 0 && (i == -1 || spanStart < i)) {
                    i = spanStart;
                }
                if (spanEnd >= 0 && spanEnd > i2) {
                    i2 = spanEnd;
                }
            }
            if (i >= 0 && i2 >= 0 && i < i2) {
                text.replace(i, i2, "");
            }
        }
    }

    /* renamed from: j */
    private void m160927j() {
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

    /* renamed from: f */
    private boolean m160923f() {
        ClipData primaryClip;
        String a;
        boolean z = false;
        if (!DesktopUtil.m144301a(this.f103340c) || (primaryClip = ((ClipboardManager) this.f103340c.getSystemService("clipboard")).getPrimaryClip()) == null || this.f103338a == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int itemCount = primaryClip.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = primaryClip.getItemAt(i).getUri();
            if (!(uri == null || (a = C57788ai.m224257a(this.f103340c, uri)) == null)) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        String parent = new File(C26308n.m95257c(this.f103340c)).getParent();
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((String) it.next()).startsWith(parent)) {
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            this.f103338a.mo122053a(arrayList);
        } else {
            Context context = this.f103340c;
            if (context instanceof Activity) {
                C57805b.m224333d((Activity) context, new C57805b.AbstractC57809a(arrayList) {
                    /* class com.ss.android.lark.keyboard.plugin.input.$$Lambda$RichTextEmojiconEditText$RWaX_YRengM9my1Zwp9gYbVhkIk */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                    public final void permissionGranted(boolean z) {
                        RichTextEmojiconEditText.this.m160913a((RichTextEmojiconEditText) this.f$1, (List) z);
                    }
                });
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo146926c() {
        CharSequence a = mo146907a(true, this.f103351n, this.f103352o, this.f103339b);
        ClipData newPlainText = ClipData.newPlainText("RichTextEmojiconEditText", a);
        if (this.f103348k == null) {
            this.f103348k = (ClipboardManager) getContext().getSystemService("clipboard");
        }
        this.f103348k.setPrimaryClip(newPlainText);
        mo146914a(a);
    }

    public void setAppendText(boolean z) {
        this.f103353p = z;
    }

    public void setAtClickListener(AbstractC40694d dVar) {
        this.f103358u = dVar;
    }

    public void setDisplayImageMediaDigest(boolean z) {
        this.f103343f = z;
    }

    public void setDisplayUrl(boolean z) {
        this.f103341d = z;
    }

    public void setDisplayUrlPreview(boolean z) {
        this.f103342e = z;
    }

    public void setDraftImageSize(int i) {
        this.f103347j = i;
    }

    public void setEmojiText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setFocusAfterInsertAt(boolean z) {
        this.f103354q = z;
    }

    public void setIgnoreAtTagOnInsert(boolean z) {
        this.f103344g = z;
    }

    public void setMentionColor(int i) {
        this.f103357t = i;
    }

    public void setOnDragDropListener(DragDropController.OnDragDropListener aVar) {
        this.f103363z = aVar;
    }

    public void setOnPasteListener(AbstractC58541b bVar) {
        this.f103338a = bVar;
    }

    public void setOnSizeChangeListener(OnSizeChangeListener fVar) {
        this.f103337A = fVar;
    }

    public void setOutAtColor(int i) {
        this.f103356s = i;
    }

    public void setRenderFinishedListener(AbstractC40695e eVar) {
        this.f103346i = eVar;
    }

    public void setTextStyleEnable(boolean z) {
        this.f103355r = z;
    }

    public void setUrlClickListener(AbstractC40696f fVar) {
        this.f103345h = fVar;
    }

    public static class DocClickSpan extends URLSpan {

        /* renamed from: a */
        private final AbstractC40696f f103372a;

        public void onClick(View view) {
            AbstractC40696f fVar = this.f103372a;
            if (fVar != null) {
                fVar.mo147005a(view, getURL());
            } else {
                super.onClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(UIHelper.getColor(R.color.text_link_normal));
            textPaint.setUnderlineText(false);
        }

        public DocClickSpan(String str, AbstractC40696f fVar) {
            super(str);
            this.f103372a = fVar;
        }
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText$a */
    public static class C40691a extends ClickableSpan {

        /* renamed from: a */
        private final AbstractC40694d f103375a;

        /* renamed from: b */
        private final String f103376b;

        public void onClick(View view) {
            AbstractC40694d dVar = this.f103375a;
            if (dVar != null) {
                dVar.mo147003a(view, this.f103376b);
            }
        }

        public C40691a(String str, AbstractC40694d dVar) {
            this.f103376b = str;
            this.f103375a = dVar;
        }
    }

    /* renamed from: b */
    private static boolean m160918b(KeyEvent keyEvent) {
        if ((keyEvent.getFlags() & 2048) != 0) {
            return true;
        }
        return false;
    }

    public void setOriginText(CharSequence charSequence) {
        setText("");
        mo146924b(charSequence);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (this.f103363z == null) {
            return super.onDragEvent(dragEvent);
        }
        if (DragDropController.f143463a.mo197514a(this, dragEvent, null, this.f103363z) || super.onDragEvent(dragEvent)) {
            return true;
        }
        return false;
    }

    public RichTextEmojiconEditText(Context context) {
        super(context);
        m160909a(context);
    }

    /* renamed from: a */
    private void m160909a(Context context) {
        this.f103340c = context;
        this.f103349l = new HashMap<>();
        this.f103350m = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[0]);
            setImportantForAutofill(8);
        }
    }

    /* renamed from: c */
    private List<AtInfo> m160921c(CharSequence charSequence) {
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

    /* renamed from: b */
    public RichText mo146922b(boolean z) {
        m160927j();
        m160925h();
        RichText a = C59029c.m229157a(mo146909a(0, length(), getText(), getRRMap(), z));
        a.setInnerText(mo146908a(true).toString());
        return a;
    }

    public boolean onTextContextMenuItem(int i) {
        Log.m165379d("RichTextEmojiconEditText", "onTextContextMenuItem: " + i);
        boolean z = false;
        if (i != 16908337) {
            switch (i) {
                case 16908320:
                    z = super.onTextContextMenuItem(i);
                    mo146926c();
                    return z;
                case 16908321:
                    z = super.onTextContextMenuItem(i);
                    mo146927d();
                    return z;
                case 16908322:
                    break;
                default:
                    try {
                        return super.onTextContextMenuItem(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
            }
        }
        if (m160923f()) {
            return true;
        }
        mo146929e();
        z = mo146925b();
        if (!z) {
            z = super.onTextContextMenuItem(i);
        }
        if (z) {
            m160926i();
        }
        return z;
    }

    public void setReplaceContentSpan(C58508e eVar) {
        if (eVar != null) {
            C58508e.C58511b b = eVar.mo198323b();
            int i = b.f144396a;
            int i2 = b.f144398c + i;
            int i3 = b.f144398c;
            eVar.mo198322a(new C58507d(this) {
                /* class com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText.C406883 */

                @Override // com.ss.android.lark.widget.linked_emojicon.C58507d
                public void invalidateDrawable(Drawable drawable) {
                    RichTextEmojiconEditText.this.getEditableText().append((CharSequence) " ");
                    RichTextEmojiconEditText.this.getEditableText().replace(RichTextEmojiconEditText.this.getEditableText().length() - 1, RichTextEmojiconEditText.this.getEditableText().length(), "");
                }
            });
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

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo146924b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            List<AtInfo> c = m160921c(charSequence);
            if (c.isEmpty()) {
                getEditableText().append(charSequence);
                return;
            }
            getEditableText().append(charSequence.subSequence(0, c.get(0).start));
            m160912a(c, charSequence);
            if (c.get(c.size() - 1).end < charSequence.length()) {
                getEditableText().append(charSequence.subSequence(c.get(c.size() - 1).end, charSequence.length()));
            }
        }
    }

    /* renamed from: a */
    private C40692b m160906a(AtInfo atInfo, CharSequence charSequence) {
        return m160907a(atInfo, charSequence, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m160913a(List list, boolean z) {
        if (z) {
            this.f103338a.mo122053a(list);
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        if (i != i2) {
            this.f103351n = Integer.valueOf(i);
            this.f103352o = Integer.valueOf(i2);
        }
    }

    /* renamed from: a */
    private CharSequence m160908a(Editable editable, Object obj) {
        int spanStart = editable.getSpanStart(obj);
        int spanEnd = editable.getSpanEnd(obj);
        if (spanStart == -1 || spanEnd == -1) {
            return "";
        }
        return editable.subSequence(spanStart, spanEnd);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 111) {
            if (isPopupShowing()) {
                dismissDropDown();
                return true;
            }
        } else if (i == 50 && m160914a(keyEvent) && m160923f()) {
            return true;
        }
        try {
            return super.onKeyDown(i, keyEvent);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return false;
    }

    public RichTextEmojiconEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m160909a(context);
    }

    /* renamed from: b */
    private void m160917b(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            int selectionEnd = getSelectionEnd();
            List<MentionInfo> c = m160922c(str, z);
            if (CollectionUtils.isEmpty(c)) {
                getEditableText().insert(selectionEnd, str);
                return;
            }
            CharSequence subSequence = str.subSequence(0, c.get(0).start);
            getEditableText().insert(selectionEnd, subSequence);
            int a = m160903a(c, str, selectionEnd + subSequence.length());
            if (c.get(c.size() - 1).end < str.length()) {
                getEditableText().insert(a, str.subSequence(c.get(c.size() - 1).end, str.length()));
            }
        }
    }

    /* renamed from: c */
    private List<MentionInfo> m160922c(String str, boolean z) {
        Matcher matcher = C59157g.f146838a.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            MentionInfo mentionInfo = new MentionInfo();
            mentionInfo.start = matcher.start();
            mentionInfo.end = matcher.end();
            mentionInfo.id = matcher.group(1);
            mentionInfo.text = matcher.group(2);
            mentionInfo.isAuthorized = z;
            arrayList.add(mentionInfo);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m160910a(Spanned spanned, boolean z) {
        getEditableText().append((CharSequence) spanned);
        if (z) {
            getEditableText().append(" ");
        }
        if (this.f103354q) {
            post(new Runnable() {
                /* class com.ss.android.lark.keyboard.plugin.input.$$Lambda$RichTextEmojiconEditText$MUgZHZ6Xz0h33qaFiM0QU_QnJ50 */

                public final void run() {
                    RichTextEmojiconEditText.this.m160928k();
                }
            });
        }
    }

    /* renamed from: a */
    private void m160911a(Integer num, boolean z) {
        if (num.intValue() != 0 || z) {
            HitPointHelper.f103322b.mo146875a(num.intValue());
        }
    }

    public RichTextEmojiconEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m160909a(context);
    }

    /* renamed from: a */
    private int m160903a(List<MentionInfo> list, String str, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            MentionInfo mentionInfo = list.get(i2);
            SpannableString spannableString = new SpannableString("$");
            C59158h hVar = new C59158h(this.f103340c, mentionInfo.text, mentionInfo.isAuthorized);
            hVar.mo201093a(this.f103357t);
            spannableString.setSpan(hVar, 0, 1, 33);
            C40692b bVar = new C40692b();
            bVar.f103377a = spannableString;
            bVar.f103378b = Integer.valueOf(hVar.hashCode());
            bVar.f103379c = hVar.mo201092a();
            bVar.f103380d = str.subSequence(mentionInfo.start, mentionInfo.end).toString();
            getEditableText().insert(i, bVar.f103377a);
            i++;
            if (i2 < list.size() - 1) {
                CharSequence subSequence = str.subSequence(list.get(i2).end, list.get(i2 + 1).start);
                getEditableText().insert(i, subSequence);
                i += subSequence.length();
            }
            getRPMap().put(bVar.f103378b, new String[]{bVar.f103380d, bVar.f103379c});
            getRRMap().put(bVar.f103378b, C59030d.m229174b(mentionInfo.id, bVar.f103379c.substring(1), mentionInfo.isAuthorized));
        }
        return i;
    }

    /* renamed from: c */
    private C40692b m160920c(String str, String str2, boolean z) {
        boolean z2;
        int selectionStart = getSelectionStart();
        String obj = getText().toString();
        if (obj.equals("") || selectionStart <= 0 || !obj.substring(selectionStart - 1, selectionStart).equals("#")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            getEditableText().delete(selectionStart - 1, selectionStart);
        }
        String a = C59157g.m229818a(str, str2);
        SpannableString spannableString = new SpannableString("$");
        Context context = this.f103340c;
        C59158h hVar = new C59158h(context, "#" + str2, z);
        hVar.mo201093a(this.f103357t);
        spannableString.setSpan(hVar, 0, 1, 33);
        C40692b bVar = new C40692b();
        bVar.f103377a = spannableString;
        bVar.f103378b = Integer.valueOf(hVar.hashCode());
        bVar.f103379c = hVar.mo201092a();
        bVar.f103380d = a;
        return bVar;
    }

    /* renamed from: a */
    private SpannableStringBuilder m160905a(CharSequence charSequence, TextStyleInfo textStyleInfo, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        if (textStyleInfo.isBold) {
            spannableStringBuilder.setSpan(new C59152b(), 0, charSequence.length(), i);
        }
        if (textStyleInfo.isItalic) {
            spannableStringBuilder.setSpan(new C59156f(), 0, charSequence.length(), i);
        }
        if (textStyleInfo.isUnderlineText) {
            spannableStringBuilder.setSpan(new C59181q(), 0, charSequence.length(), i);
        }
        if (textStyleInfo.isStrikeThruText) {
            spannableStringBuilder.setSpan(new C59179o(), 0, charSequence.length(), i);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private C40692b m160907a(AtInfo atInfo, CharSequence charSequence, boolean z) {
        SpannableString spannableString = new SpannableString("$");
        C59151a aVar = new C59151a(this.f103340c, atInfo.text, z);
        if (z) {
            aVar.mo201077a(this.f103356s);
        }
        spannableString.setSpan(aVar, 0, 1, 33);
        if (this.f103358u != null) {
            spannableString.setSpan(new C40691a(atInfo.userId, this.f103358u), 0, 1, 33);
        }
        C40692b bVar = new C40692b();
        bVar.f103377a = spannableString;
        bVar.f103378b = Integer.valueOf(aVar.hashCode());
        bVar.f103379c = aVar.mo201076a();
        bVar.f103380d = charSequence.subSequence(atInfo.start, atInfo.end).toString();
        return bVar;
    }

    /* renamed from: b */
    public CharSequence mo146923b(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        C40692b c = m160920c(str, str2, z);
        getRPMap().put(c.f103378b, new String[]{c.f103380d, c.f103379c});
        getRRMap().put(c.f103378b, C59030d.m229174b(str, str2, z));
        return c.f103380d;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        OnSizeChangeListener fVar = this.f103337A;
        if (fVar != null) {
            fVar.mo147113a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    private int m160904a(List<AtInfo> list, String str, int i, boolean z) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            C40692b a = m160907a(list.get(i2), str, z);
            getEditableText().insert(i, a.f103377a);
            i++;
            if (i2 < list.size() - 1) {
                CharSequence subSequence = str.subSequence(list.get(i2).end, list.get(i2 + 1).start);
                getEditableText().insert(i, subSequence);
                i += subSequence.length();
            }
            getRPMap().put(a.f103378b, new String[]{a.f103380d, a.f103379c});
            getRRMap().put(a.f103378b, C59030d.m229169a(list.get(i2).userId, a.f103379c.substring(1), z));
        }
        return i;
    }

    /* renamed from: c */
    private Pair<CharSequence, Integer> m160919c(String str, String str2, boolean z, boolean z2) {
        if (str == null || str2 == null) {
            return new Pair<>("", -1);
        }
        Pair<C40692b, Integer> b = m160915b(str, str2, z, z2);
        C40692b bVar = (C40692b) b.first;
        getRPMap().put(bVar.f103378b, new String[]{bVar.f103380d, bVar.f103379c});
        getRRMap().put(bVar.f103378b, C59030d.m229170a(str, str2, z, z2));
        return new Pair<>(bVar.f103380d, b.second);
    }

    /* renamed from: b */
    private Pair<C40692b, Integer> m160915b(String str, String str2, boolean z, boolean z2) {
        int selectionStart = getSelectionStart();
        String obj = getText().toString();
        if (obj.equals("") || selectionStart <= 0 || !obj.substring(selectionStart - 1, selectionStart).equals("@")) {
            selectionStart = -1;
        }
        String b = C57814c.m224350b(str, str2);
        SpannableString spannableString = new SpannableString("$");
        Context context = this.f103340c;
        C59151a aVar = new C59151a(context, "@" + str2, z, z2);
        if (z || z2) {
            aVar.mo201077a(this.f103356s);
        }
        spannableString.setSpan(aVar, 0, 1, 33);
        if (this.f103358u != null) {
            spannableString.setSpan(new C40691a(str, this.f103358u), 0, 1, 33);
            setMovementMethod(C40693c.m160980a());
        }
        C40692b bVar = new C40692b();
        bVar.f103377a = spannableString;
        bVar.f103378b = Integer.valueOf(aVar.hashCode());
        bVar.f103379c = aVar.mo201076a();
        bVar.f103380d = b;
        return new Pair<>(bVar, Integer.valueOf(selectionStart));
    }

    /* renamed from: b */
    private CharSequence m160916b(boolean z, Integer num, Integer num2, final Editable editable) {
        String str;
        Integer num3;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        Integer valueOf = Integer.valueOf(Math.min(intValue, intValue2));
        Integer valueOf2 = Integer.valueOf(Math.max(intValue, intValue2));
        Integer valueOf3 = Integer.valueOf(z ? 1 : 0);
        CharSequence subSequence = editable.subSequence(valueOf.intValue(), valueOf2.intValue());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) editable.getSpans(valueOf.intValue(), valueOf2.intValue(), ReplacementSpan.class);
        if (replacementSpanArr.length == 0) {
            return subSequence;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            for (ReplacementSpan replacementSpan : replacementSpanArr) {
                if (getRPMap().get(Integer.valueOf(replacementSpan.hashCode())) != null) {
                    arrayList.add(replacementSpan);
                } else if (replacementSpan instanceof C58508e) {
                    arrayList.add(replacementSpan);
                }
            }
        } catch (Throwable th) {
            Log.m165386e(th.getMessage(), th);
        }
        if (arrayList.size() == 0) {
            return subSequence;
        }
        Collections.sort(arrayList, new Comparator<ReplacementSpan>() {
            /* class com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText.C406894 */

            /* renamed from: a */
            public int compare(ReplacementSpan replacementSpan, ReplacementSpan replacementSpan2) {
                return editable.getSpanStart(replacementSpan) - editable.getSpanStart(replacementSpan2);
            }
        });
        Integer num4 = 0;
        try {
            int size = arrayList.size();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                ReplacementSpan replacementSpan2 = (ReplacementSpan) arrayList.get(i2);
                if (replacementSpan2 instanceof C58508e) {
                    str = ((C58508e) replacementSpan2).mo198324c().toString();
                } else {
                    str = getRPMap().get(Integer.valueOf(replacementSpan2.hashCode()))[valueOf3.intValue()];
                }
                if (str.contains(UIHelper.getString(R.string.Lark_Legacy_AllPeople))) {
                    num4 = Integer.valueOf(i);
                    z2 = true;
                }
                if (!z2 && (replacementSpan2 instanceof C59151a)) {
                    num4 = Integer.valueOf(num4.intValue() + 1);
                }
                int spanStart = editable.getSpanStart(replacementSpan2);
                int spanEnd = editable.getSpanEnd(replacementSpan2);
                int intValue3 = spanStart - valueOf.intValue();
                if (i2 != 0) {
                    i = editable.getSpanEnd(arrayList.get(i2 - 1)) - valueOf.intValue();
                }
                spannableStringBuilder.append(subSequence.subSequence(i, intValue3));
                Object[] spans = editable.getSpans(spanStart, spanEnd, Object.class);
                spannableStringBuilder.append((CharSequence) str);
                int length = spans.length;
                int i3 = 0;
                while (i3 < length) {
                    Object obj = spans[i3];
                    if (obj instanceof C58514h) {
                        num3 = valueOf3;
                        spannableStringBuilder.setSpan(TextStyleSpanCompat.m161236a((C58514h) obj), intValue3, spannableStringBuilder.length(), 33);
                    } else {
                        num3 = valueOf3;
                    }
                    i3++;
                    num4 = num4;
                    valueOf3 = num3;
                }
                i2++;
                i = 0;
            }
            spannableStringBuilder.append(subSequence.subSequence(editable.getSpanEnd(arrayList.get(arrayList.size() - 1)) - valueOf.intValue(), subSequence.length()));
            m160911a(num4, z2);
            return spannableStringBuilder;
        } catch (Throwable th2) {
            Log.m165386e(th2.getMessage(), th2);
            return subSequence;
        }
    }
}
