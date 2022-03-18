package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.impl;

import android.content.Context;
import android.text.Layout;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.LayoutSizeHelper;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ILayoutProcessor;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ProcessParams;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.C58475b;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.C59049d;
import com.ss.android.lark.widget.richtext.preprocess.C59054g;
import com.ss.android.lark.widget.richtext.preprocess.C59057h;
import com.ss.android.lark.widget.span.C59173m;
import com.ss.android.lark.widget.span.C59176n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0002JF\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010$\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/RichTextProcessor;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ILayoutProcessor;", "Lcom/ss/android/lark/widget/richtext/RichText;", "parentProcessor", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/CharSequenceProcessor;", "(Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/CharSequenceProcessor;)V", "generateRichTextExtraParam", "Lcom/ss/android/lark/widget/richtext/preprocess/RichTextExtraParam;", "shoBorder", "", "imageMode", "", "maxWidth", "isFromMe", "generateSpanExtraParams", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "disableAtReadState", "readAtChatterId", "", "", "botIds", "anonymousId", "context", "Landroid/content/Context;", "generateSpanInfoParams", "Lcom/ss/android/lark/widget/span/SpanInfoExtraParams;", "parseUrl", "parsePhone", "result", "Lcom/ss/android/lark/widget/richtext/preprocess/RichTextSpanResult;", "getCurrentUserId", "process", "Landroid/text/Layout;", "richText", "processParams", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams;", "setThreadAnnouncementSize", "", "isThread", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.a.d */
public final class RichTextProcessor implements ILayoutProcessor<RichText> {

    /* renamed from: a */
    private final CharSequenceProcessor f85444a;

    /* renamed from: a */
    private final String m128350a() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
        String a = N.mo134394a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…().loginDependency.userId");
        return a;
    }

    public RichTextProcessor(CharSequenceProcessor aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "parentProcessor");
        this.f85444a = aVar;
    }

    /* renamed from: a */
    private final void m128351a(RichText richText, boolean z) {
        int i;
        if (!(!z || richText == null || C59035h.m229210a(richText))) {
            RichText.RichTextElements elements = richText.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "richText.elements");
            for (RichTextElement richTextElement : elements.getDictionary().values()) {
                if (richTextElement != null && richTextElement.getTag() == RichTextElement.RichTextTag.IMG && (richTextElement.getProperty() instanceof RichTextElement.ImageProperty)) {
                    RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) richTextElement.getProperty();
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    int screenWidth = DeviceUtils.getScreenWidth(b.mo134528a()) - UIHelper.dp2px(32.0f);
                    Intrinsics.checkExpressionValueIsNotNull(imageProperty, "imageProperty");
                    if (imageProperty.getOriginWidth() != 0) {
                        i = (imageProperty.getOriginHeight() * screenWidth) / imageProperty.getOriginWidth();
                    } else {
                        i = imageProperty.getOriginHeight();
                        Log.m165383e("ChatWindowLog", "announce image origin width == 0");
                    }
                    imageProperty.setOriginWidth(screenWidth);
                    imageProperty.setOriginHeight(i);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final C59173m m128349a(boolean z, boolean z2, C59057h hVar) {
        return new C59173m.C59175a().mo201124c(z2).mo201123b(z).mo201120a(hVar.f146398b.getAllSpanInfos()).mo201122a();
    }

    /* renamed from: a */
    public Layout mo122459a(RichText richText, ProcessParams dVar, Context context) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        Intrinsics.checkParameterIsNotNull(dVar, "processParams");
        Intrinsics.checkParameterIsNotNull(context, "context");
        boolean z3 = false;
        if (dVar.mo122487l() != 19) {
            i = 0;
        } else {
            i = 1;
        }
        if (CollectionUtils.isNotEmpty(richText.getImageIds()) || CollectionUtils.isNotEmpty(richText.getMediaIds())) {
            z = true;
        } else {
            z = false;
        }
        dVar.mo122477f(z);
        switch (dVar.mo122487l()) {
            case 17:
                i2 = LayoutSizeHelper.m128406a(context);
                break;
            case 18:
                i2 = LayoutSizeHelper.m128407b(context);
                break;
            case 19:
                i2 = LayoutSizeHelper.m128408c(context);
                break;
            default:
                i2 = Integer.MAX_VALUE;
                break;
        }
        if (dVar.mo122487l() == 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVar.mo122480g()) {
            if (z2) {
                i = 5;
            } else {
                i = 4;
            }
            m128351a(richText, z2);
        }
        if (z2 && !dVar.mo122480g()) {
            z3 = true;
        }
        C59057h a = C59054g.m229403a().mo200650a(context, richText, m128348a(z3, i, i2, dVar.mo122474d()));
        if (a != null) {
            Intrinsics.checkExpressionValueIsNotNull(a, "RichTextSpanParser.inst(…           ?: return null");
            C59173m a2 = m128349a(dVar.mo122472c(), dVar.mo122486k(), a);
            if (a2 != null) {
                CharSequence a3 = C58475b.m226783a().mo198109a(context, a.f146397a, C59176n.m229853a().mo201128a(a.f146397a, a2), m128347a(dVar.mo122474d(), dVar.mo122478f(), dVar.mo122465a(), dVar.mo122468b(), dVar.mo122485j(), context));
                CharSequenceProcessor aVar = this.f85444a;
                Intrinsics.checkExpressionValueIsNotNull(a3, "spannableString");
                Layout a4 = aVar.mo122459a(a3, dVar, context);
                if ((a4 != null && a4.getWidth() == 0) || (a4 != null && a4.getHeight() == 0)) {
                    Log.m165383e("RichTextProcessor", "Layout is null");
                }
                return a4;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final C59049d m128348a(boolean z, int i, int i2, boolean z2) {
        return new C59049d.C59050a().mo200641a(true).mo200644b(true).mo200647e(z).mo200640a(i).mo200643b(i2).mo200648f(z2).mo200642a();
    }

    /* renamed from: a */
    private final SpannableStringExtraParams m128347a(boolean z, boolean z2, List<String> list, List<String> list2, String str, Context context) {
        boolean z3;
        SpannableStringExtraParams.Builder aVar = new SpannableStringExtraParams.Builder(context);
        if (!z || z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        SpannableStringExtraParams.Builder b = aVar.mo198082c(z3).mo198073a(list).mo198078b(list2);
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        Context a = b2.mo134528a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder.getDependency().context");
        SpannableStringExtraParams.Builder h = b.mo198076b(LKUIDisplayManager.m91881c(a, 20)).mo198081c(UIUtils.getColor(context, C33360a.m129167k(z))).mo198090g(UIUtils.getColor(context, C33360a.m129168l(z))).mo198092h(UIUtils.getColor(context, C33360a.m129169m(z)));
        AbstractC36474h b3 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
        Context a2 = b3.mo134528a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder.getDependency().context");
        return h.mo198071a((int) LKUIDisplayManager.m91864a(a2, 17)).mo198072a(m128350a()).mo198077b(str).mo198107v();
    }
}
