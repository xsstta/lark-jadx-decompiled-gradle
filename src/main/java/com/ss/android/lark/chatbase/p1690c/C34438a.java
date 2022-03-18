package com.ss.android.lark.chatbase.p1690c;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.span.UrlClickSpan;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.span.EmptyHolderSpan;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatbase.c.a */
public class C34438a {

    /* renamed from: a */
    private static al f88920a = C29990c.m110930b().mo134596x();

    /* renamed from: a */
    public static boolean m133579a(Message message) {
        return message.isBurned() || (message.getBurnLife() > 0 && f88920a.mo134462a() - 604800000 >= message.getCreateTime() * 1000) || (message.getBurnTime() > 0 && message.getBurnTime() <= f88920a.mo134462a());
    }

    /* renamed from: a */
    public static boolean m133578a(ChatMessageVO cVar) {
        return cVar.mo124251X() || (cVar.mo124252Y() > 0 && cVar.mo124252Y() <= f88920a.mo134462a());
    }

    /* renamed from: a */
    public static void m133577a(String str, Message message) {
        if (message != null && m133579a(message)) {
            long a = f88920a.mo134462a();
            if (a - message.getBurnTime() < 7200000) {
                Log.m165388i(String.format("%s id:%s, create:%s, life:%s, burn:%s, ntp:%s", str, message.getId(), Long.valueOf(message.getCreateTime()), Integer.valueOf(message.getBurnLife()), Long.valueOf(message.getBurnTime()), Long.valueOf(a)));
            }
        }
    }

    /* renamed from: a */
    public static boolean m133581a(boolean z, Chat chat, boolean z2, String str) {
        if (!z || chat == null) {
            return false;
        }
        if (chat.isP2PChat()) {
            if (z2 || C29990c.m110930b().mo134515N().mo134394a().equals(str)) {
                return false;
            }
            return true;
        } else if (chat.getUserCount() > 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static HashMap<String, String> m133574a(Map<String, Doc> map) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (Doc doc : map.values()) {
            if (doc != null) {
                hashMap.put(doc.getUrl(), doc.getName());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static UrlClickSpan[] m133583a(Spanned spanned) {
        UrlClickSpan[] iVarArr = (UrlClickSpan[]) spanned.getSpans(0, spanned.length(), UrlClickSpan.class);
        return (iVarArr == null || iVarArr.length == 0) ? new UrlClickSpan[0] : iVarArr;
    }

    /* renamed from: a */
    private static int[][] m133584a(UrlClickSpan[] iVarArr, Spanned spanned) {
        int length = iVarArr.length;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        for (int i = 0; i < iVarArr.length; i++) {
            iArr2[i][0] = spanned.getSpanStart(iVarArr[i]);
            iArr2[i][1] = spanned.getSpanEnd(iVarArr[i]);
        }
        return iArr2;
    }

    /* renamed from: a */
    public static void m133576a(Context context, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", C57814c.m224346a(charSequence)));
            } catch (Exception e) {
                Log.m165387e("Copy failed", (Throwable) e, true);
            }
            MessageHitPoint.f135779d.mo187549d();
            UDToast.show(context, (int) R.string.Lark_Legacy_CopyReady);
        }
    }

    /* renamed from: a */
    public static boolean m133580a(BaseTextContent<?> baseTextContent) {
        boolean isEmpty = baseTextContent instanceof PostContent ? TextUtils.isEmpty(((PostContent) baseTextContent).getTitle()) : true;
        RichText richText = baseTextContent.getRichText();
        if (richText == null) {
            return false;
        }
        int i = 0;
        for (RichTextElement richTextElement : richText.getElements().getDictionary().values()) {
            if (richTextElement.getTag() == RichTextElement.RichTextTag.IMG) {
                i++;
                if (i > 1) {
                    return false;
                }
            } else if (richTextElement.getTag() != RichTextElement.RichTextTag.FIGURE) {
                return false;
            }
        }
        if (i != 1 || !isEmpty) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int[] m133582a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m133569a(com.ss.android.lark.chat.vo.AbsMessageVO r3) {
        /*
            java.lang.String r0 = ""
            if (r3 != 0) goto L_0x0005
            return r0
        L_0x0005:
            com.ss.android.lark.chat.export.vo.a r3 = r3.mo121699g()
            boolean r1 = r3 instanceof com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO
            if (r1 == 0) goto L_0x0058
            com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO r3 = (com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO) r3
            java.lang.CharSequence r1 = r3.mo121788g()
            boolean r2 = r3.mo121789h()
            if (r2 == 0) goto L_0x0036
            com.ss.android.lark.chat.base.view.vo.message.o r2 = r3.mo121930y()
            boolean r2 = r2 instanceof com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO
            if (r2 == 0) goto L_0x0036
            com.ss.android.lark.chat.base.view.vo.message.o r3 = r3.mo121930y()
            com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO r3 = (com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO) r3
            android.text.Layout r3 = r3.mo121790j()
            if (r3 == 0) goto L_0x0045
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            goto L_0x0046
        L_0x0036:
            android.text.Layout r3 = r3.mo121790j()
            if (r3 == 0) goto L_0x0045
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            goto L_0x0046
        L_0x0045:
            r3 = r0
        L_0x0046:
            boolean r3 = android.text.TextUtils.equals(r3, r1)
            if (r3 != 0) goto L_0x0054
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0054
            r3 = 1
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            if (r3 == 0) goto L_0x0058
            return r1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatbase.p1690c.C34438a.m133569a(com.ss.android.lark.chat.e.a):java.lang.CharSequence");
    }

    /* renamed from: a */
    public static CharSequence m133570a(CharSequence charSequence) {
        EmptyHolderSpan[] dVarArr;
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        if (!(charSequence instanceof Spanned) || (dVarArr = (EmptyHolderSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), EmptyHolderSpan.class)) == null || dVarArr.length <= 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (int length = dVarArr.length - 1; length >= 0; length--) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(dVarArr[length]), spannableStringBuilder.getSpanEnd(dVarArr[length]), (CharSequence) dVarArr[length].mo201085a());
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static void m133575a(Context context, Message message) {
        m133576a(context, m133573a(context, message.getContent()));
    }

    /* renamed from: a */
    public static RichText m133568a(RichText richText, RichText richText2) {
        if (richText == null) {
            return richText2;
        }
        if (richText2 == null) {
            return richText;
        }
        return C59029c.m229161b(C59035h.m229211b(richText) + C59035h.m229211b(richText2));
    }

    /* renamed from: b */
    private static String m133585b(Context context, PostContentVO iVar) {
        String charSequence = C59035h.m229204a(iVar.mo121772a(), false, false, true, false, false, true).toString();
        if (TextUtils.isEmpty(iVar.mo121877a(context))) {
            return charSequence;
        }
        return iVar.mo121877a(context) + "\n" + charSequence;
    }

    /* renamed from: b */
    public static String m133586b(Context context, Content content) {
        if (content instanceof TextContent) {
            return C59035h.m229204a(((TextContent) content).getRichText(), false, false, true, false, false, true).toString();
        }
        if (content instanceof PostContent) {
            return m133585b(context, new PostContentVO((PostContent) content));
        }
        if (content instanceof AudioContent) {
            AudioContent audioContent = (AudioContent) content;
            if (!TextUtils.isEmpty(audioContent.getRecognizedText())) {
                return audioContent.getRecognizedText();
            }
        }
        return "";
    }

    /* renamed from: a */
    public static CharSequence m133571a(CharSequence charSequence, Map<String, Doc> map) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        if ((charSequence instanceof Spanned) && !CollectionUtils.isEmpty(map)) {
            Spanned spanned = (Spanned) charSequence;
            UrlClickSpan[] a = m133583a(spanned);
            int[][] a2 = m133584a(a, spanned);
            HashMap<String, String> a3 = m133574a(map);
            if (a2.length > 0 && a3.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                for (int length = a2.length - 1; length >= 0; length--) {
                    int i = a2[length][0];
                    int i2 = a2[length][1];
                    String a4 = a[length].mo198196a();
                    String str = a3.get(a4);
                    if (spannableStringBuilder.charAt(i) == '$') {
                        if (str == null || str.length() + 1 > i2 - i) {
                            spannableStringBuilder.replace(i, i + 1, (CharSequence) UIHelper.getString(R.string.Lark_Legacy_ImageSummarize));
                        } else {
                            spannableStringBuilder.replace(i, i2, (CharSequence) a4);
                        }
                    }
                }
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    /* renamed from: a */
    public static String m133572a(Context context, PostContentVO iVar) {
        String e = C59035h.m229214e(iVar.mo121772a());
        if (TextUtils.isEmpty(iVar.mo121877a(context))) {
            return e;
        }
        return iVar.mo121877a(context) + "\n" + e;
    }

    /* renamed from: a */
    public static String m133573a(Context context, Content content) {
        if (content instanceof TextContent) {
            return ((TextContent) content).getText();
        }
        if (!(content instanceof PostContent)) {
            return "";
        }
        PostContent postContent = (PostContent) content;
        if (TextUtils.isEmpty(postContent.getTitleWithFilter(context))) {
            return postContent.getText();
        }
        return postContent.getTitleWithFilter(context) + "\n" + postContent.getText();
    }
}
