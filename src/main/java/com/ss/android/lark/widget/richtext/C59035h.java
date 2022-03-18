package com.ss.android.lark.widget.richtext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.C58377d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.C59049d;
import com.ss.android.lark.widget.richtext.preprocess.C59052f;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.StringsKt;

/* renamed from: com.ss.android.lark.widget.richtext.h */
public class C59035h {
    /* renamed from: a */
    public static boolean m229210a(RichText richText) {
        return richText == null || CollectionUtils.isEmpty(richText.getElementIds()) || richText.getElements() == null || CollectionUtils.isEmpty(richText.getElements().getDictionary());
    }

    /* renamed from: c */
    public static String m229212c(RichText richText) {
        return m229208a(richText, true);
    }

    /* renamed from: b */
    public static String m229211b(RichText richText) {
        return m229203a(richText, false, true, false, false, 0).toString();
    }

    /* renamed from: d */
    public static CharSequence m229213d(RichText richText) {
        return m229203a(richText, true, false, true, false, 0);
    }

    /* renamed from: e */
    public static String m229214e(RichText richText) {
        return m229203a(richText, false, true, false, true, 0).toString();
    }

    /* renamed from: f */
    private static void m229215f(RichText richText) {
        if (C58377d.m226286a().mo102881d() && !richText.hasParsed()) {
            C59052f.m229400a(UIHelper.getContext(), richText, new C59049d.C59050a().mo200641a(false).mo200642a());
            richText.setHasParsed(true);
        }
    }

    /* renamed from: a */
    private static void m229209a(SpannableStringBuilder spannableStringBuilder) {
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            spannableStringBuilder.append("\n");
        }
    }

    /* renamed from: a */
    public static CharSequence m229201a(RichText richText, int i) {
        return m229203a(richText, true, false, true, false, i);
    }

    /* renamed from: a */
    public static String m229208a(RichText richText, boolean z) {
        return m229203a(richText, z, false, false, false, 0).toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: android.graphics.Bitmap */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: android.graphics.Bitmap */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: android.graphics.Bitmap */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static CharSequence m229206a(RichTextElement.AnchorProperty anchorProperty, boolean z, boolean z2, int i) {
        C58508e eVar;
        int i2;
        if (!z) {
            return anchorProperty.getContent();
        }
        String displayTitle = anchorProperty.getDisplayTitle();
        if (TextUtils.isEmpty(displayTitle)) {
            return anchorProperty.getContent();
        }
        if (z2) {
            return displayTitle;
        }
        Context context = UIHelper.getContext();
        String str = "$" + displayTitle;
        C58508e.C58511b bVar = new C58508e.C58511b("");
        int sp2px = (int) UIUtils.sp2px(context, 16.0f);
        Drawable drawable = null;
        if (!TextUtils.isEmpty(anchorProperty.getIconKey())) {
            if (anchorProperty.getLocalGrayIconRes() != 0) {
                drawable = ContextCompat.getDrawable(context, anchorProperty.getLocalGrayIconRes());
            }
            IconKeyDrawable oVar = new IconKeyDrawable(context);
            oVar.mo89035a(anchorProperty.getIconKey(), null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), drawable, !anchorProperty.isUrlPreview(), Integer.valueOf(i));
            eVar = new C58508e.C58510a(context, bVar).mo198335a(oVar).mo198337a();
        } else {
            if (anchorProperty.getLocalGrayIconRes() != 0) {
                i2 = anchorProperty.getLocalGrayIconRes();
            } else {
                i2 = R.drawable.ud_icon_link_copy_outlined;
            }
            Bitmap a = C57820d.m224428a(context, i2);
            if (i != 0) {
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                Bitmap createBitmap = Bitmap.createBitmap(a.getWidth(), a.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                drawable = createBitmap;
            }
            C58508e.C58510a b = new C58508e.C58510a(context, bVar).mo198338b(sp2px);
            Bitmap bitmap = a;
            if (drawable != null) {
                bitmap = drawable;
            }
            eVar = b.mo198334a(bitmap).mo198337a();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(eVar, 0, 1, 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static CharSequence m229202a(RichText richText, boolean z, boolean z2, boolean z3, boolean z4) {
        return m229204a(richText, z, z2, z3, z4, false, false);
    }

    /* renamed from: a */
    public static CharSequence m229203a(RichText richText, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        return m229205a(richText, z, z2, z3, z4, false, false, i);
    }

    /* renamed from: a */
    public static CharSequence m229204a(RichText richText, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return m229205a(richText, z, z2, z3, z4, z5, z6, 0);
    }

    /* renamed from: a */
    public static CharSequence m229205a(RichText richText, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if (m229210a(richText)) {
            return "";
        }
        m229215f(richText);
        List<String> elementIds = richText.getElementIds();
        Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (String str : elementIds) {
            RichTextElement richTextElement = dictionary.get(str);
            if (richTextElement != null) {
                spannableStringBuilder.append(m229207a(richTextElement, dictionary, z, z2, z3, z4, z5, z6, i));
                if (z && spannableStringBuilder.toString().length() > 30) {
                    break;
                }
            } else {
                Log.m165383e("RichTextUtil", "error richtext struct");
            }
        }
        if (z3) {
            Pattern compile = Pattern.compile("  +");
            for (Matcher matcher = compile.matcher(spannableStringBuilder); matcher.find(); matcher = compile.matcher(spannableStringBuilder)) {
                spannableStringBuilder.replace(matcher.start(), matcher.end(), (CharSequence) " ");
            }
        } else {
            spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder.toString().replaceAll(" +", " "));
        }
        int length = spannableStringBuilder.length();
        for (int i2 = 1; length >= i2; i2++) {
            int i3 = length - i2;
            if (spannableStringBuilder.charAt(i3) != '\n') {
                break;
            }
            spannableStringBuilder.replace(i3, i3 + 1, (CharSequence) " ");
        }
        return StringsKt.trimStart(spannableStringBuilder);
    }

    /* renamed from: a */
    private static CharSequence m229207a(RichTextElement richTextElement, Map<String, RichTextElement> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if (richTextElement == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        RichTextElement.RichTextTag tag = richTextElement.getTag();
        RichTextElement.RichTextProperty property = richTextElement.getProperty();
        if (tag == RichTextElement.RichTextTag.TEXT && (property instanceof RichTextElement.TextProperty)) {
            String content = ((RichTextElement.TextProperty) property).getContent();
            if (!z4 && !TextUtils.isEmpty(content)) {
                content = content.replace("\n", " ");
            }
            return spannableStringBuilder.append((CharSequence) content).toString();
        } else if (tag != RichTextElement.RichTextTag.AT || !(property instanceof RichTextElement.AtProperty)) {
            if (tag == RichTextElement.RichTextTag.EMOTION && (property instanceof RichTextElement.EmotionProperty)) {
                return spannableStringBuilder.append((CharSequence) EmojiHandler.m226949b(((RichTextElement.EmotionProperty) property).getKey()));
            }
            if (tag == RichTextElement.RichTextTag.ANCHOR && (property instanceof RichTextElement.AnchorProperty)) {
                return spannableStringBuilder.append(m229206a((RichTextElement.AnchorProperty) property, z3, z6, i));
            }
            if (tag == RichTextElement.RichTextTag.MENTION && (property instanceof RichTextElement.MentionProperty)) {
                return spannableStringBuilder.append((CharSequence) ((RichTextElement.MentionProperty) property).getContent());
            }
            if (tag == RichTextElement.RichTextTag.IMG) {
                RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) property;
                if (!TextUtils.isEmpty(imageProperty.getAlt())) {
                    spannableStringBuilder.append((CharSequence) imageProperty.getAlt());
                } else {
                    spannableStringBuilder.append((CharSequence) UIHelper.getString(R.string.Lark_Legacy_ImageSummarize));
                }
                if (z4) {
                    m229209a(spannableStringBuilder);
                }
                return spannableStringBuilder;
            } else if (tag == RichTextElement.RichTextTag.MEDIA) {
                spannableStringBuilder.append((CharSequence) UIHelper.getString(R.string.Lark_Legacy_MessagePoVideo));
                if (z4) {
                    m229209a(spannableStringBuilder);
                }
                return spannableStringBuilder;
            } else {
                if (tag == RichTextElement.RichTextTag.PARAGRAPH) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                if (tag == RichTextElement.RichTextTag.LI) {
                    String listNum = ((RichTextElement.LIProperty) property).getListNum();
                    if (!TextUtils.isEmpty(listNum)) {
                        spannableStringBuilder.append((CharSequence) listNum);
                    }
                }
                List<String> childIds = richTextElement.getChildIds();
                if (!CollectionUtils.isEmpty(childIds)) {
                    for (String str : childIds) {
                        spannableStringBuilder.append(m229207a(map.get(str), map, z, z2, z3, z4, z5, z6, i));
                        if (z && spannableStringBuilder.toString().length() > 30) {
                            break;
                        }
                    }
                }
                if (z4 && tag == RichTextElement.RichTextTag.PARAGRAPH) {
                    m229209a(spannableStringBuilder);
                }
                if (tag == RichTextElement.RichTextTag.LI) {
                    if (z4) {
                        m229209a(spannableStringBuilder);
                    } else {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                }
                return spannableStringBuilder;
            }
        } else if (!z2) {
            return spannableStringBuilder.append((CharSequence) ((RichTextElement.AtProperty) property).getAtContent()).append((CharSequence) " ").toString();
        } else {
            RichTextElement.AtProperty atProperty = (RichTextElement.AtProperty) property;
            return spannableStringBuilder.append((CharSequence) "<at user_id=\"").append((CharSequence) atProperty.getUserId()).append((CharSequence) "\">").append((CharSequence) atProperty.getAtContent()).append((CharSequence) "</at>").toString();
        }
    }
}
