package com.bytedance.ies.xelement.text.emoji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\u0010\u0010\u001d\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ+\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010!2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0002\u0010%R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/bytedance/ies/xelement/text/emoji/LynxEmojiViewHelper;", "", "()V", "CONTAIN_ONLY_EMOJI", "", "CONTAIN_ONLY_TEXT", "CONTAIN_TEXT_AND_EMOJI", "FORMAT", "", "sEmojiPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getSEmojiPattern", "()Ljava/util/regex/Pattern;", "setSEmojiPattern", "(Ljava/util/regex/Pattern;)V", "sInCheck", "", "checkContainsEmoji", "context", "Landroid/content/Context;", "text", "checkEmoji", "", "textView", "Landroid/widget/TextView;", "convertToEmojiSpan", "", "lineHeight", "getEmojiNum", "getValidEmojisStr", "", "javaSplit", "", "src", "regex", "limit", "(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;", "x-element-emoji_newelement"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xelement.text.emoji.e */
public final class LynxEmojiViewHelper {

    /* renamed from: a */
    public static final LynxEmojiViewHelper f38521a = new LynxEmojiViewHelper();

    /* renamed from: b */
    private static Pattern f38522b = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: c */
    private static boolean f38523c;

    private LynxEmojiViewHelper() {
    }

    /* renamed from: a */
    public final void mo53624a(TextView textView) {
        Integer num;
        int i;
        boolean z;
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        if (!f38523c) {
            f38523c = true;
            CharSequence text = textView.getText();
            List<String> a = mo53623a(textView.getContext(), text.toString());
            if (a != null) {
                num = Integer.valueOf(a.size());
            } else {
                num = null;
            }
            int intValue = num.intValue();
            if (TextUtils.isEmpty(text) || intValue <= 0) {
                f38523c = false;
                return;
            }
            SpannableString spannableString = new SpannableString(text);
            LynxEmojiSpan[] dVarArr = (LynxEmojiSpan[]) spannableString.getSpans(0, text.length(), LynxEmojiSpan.class);
            if (dVarArr != null && dVarArr.length > 0) {
                if (dVarArr.length != intValue) {
                    z = true;
                } else {
                    z = false;
                }
                int length = dVarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    LynxEmojiSpan dVar = dVarArr[i2];
                    spannableString.removeSpan(dVar);
                    if (i2 < intValue && !z && !TextUtils.equals(dVar.mo53620a(), a.get(i2))) {
                        z = true;
                    }
                }
                if (!z) {
                    f38523c = false;
                    return;
                }
            }
            boolean z2 = textView instanceof EditText;
            if (z2) {
                i = textView.getSelectionStart();
            } else {
                i = 0;
            }
            LynxEmojiResHelper a2 = LynxEmojiResHelper.f38515c.mo53619a();
            Matcher matcher = f38522b.matcher(text);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String group = matcher.group();
                Drawable a3 = a2.mo53617a(textView.getContext(), group);
                if (a3 != null) {
                    int lineHeight = textView.getLineHeight();
                    a3.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a3.getIntrinsicWidth()) + BitmapDescriptorFactory.HUE_RED) / ((float) a3.getIntrinsicHeight()))) + 0.5f), lineHeight);
                    spannableString.setSpan(new LynxEmojiSpan(a3, Integer.valueOf(end - start), group), start, end, 33);
                    if (i > start && i < end && z2) {
                        ((EditText) textView).setSelection(end);
                    }
                }
            }
            if (z2) {
                Editable editableText = textView.getEditableText();
                if (editableText != null) {
                    editableText.replace(0, text.length(), spannableString);
                }
            } else {
                textView.setText(spannableString);
            }
            f38523c = false;
        }
    }

    /* renamed from: a */
    public final List<String> mo53623a(Context context, String str) {
        if (context != null) {
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                ArrayList arrayList = new ArrayList();
                Matcher matcher = f38522b.matcher(str2);
                while (matcher.find()) {
                    String group = matcher.group();
                    if (LynxEmojiResHelper.f38515c.mo53619a().mo53617a(context, group) != null) {
                        Intrinsics.checkExpressionValueIsNotNull(group, "emoji");
                        arrayList.add(group);
                    }
                }
                return arrayList;
            }
        }
        return new ArrayList();
    }
}
