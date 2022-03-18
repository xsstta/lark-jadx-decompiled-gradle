package com.ss.android.lark.chatsetting.impl.group;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/GroupShareUtil;", "", "()V", "EXPIRE_TIME_NONE", "", "EXPIRE_TIME_WEEK", "EXPIRE_TIME_YEAR", "SPACE_HEAD", "", "getExpireDateItemText", ShareHitPoint.f121869d, "getExpireDayForType", "getTextUnBreakable", "", "textView", "Landroid/widget/TextView;", "preText", "unbreakableText", "clickListener", "Landroid/view/View$OnClickListener;", "getValueByType", "isShareLinkTimeChangeable", "", "GroupShareClickableSpan", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.b */
public final class GroupShareUtil {

    /* renamed from: a */
    public static final GroupShareUtil f89356a = new GroupShareUtil();

    @JvmStatic
    /* renamed from: a */
    public static final int m134452a(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 365;
        }
        return 7;
    }

    /* renamed from: c */
    private final int m134456c(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 365;
        }
        return 7;
    }

    private GroupShareUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m134454a() {
        return ChatSettingModule.m133639a().mo127268a("group.share.time.change");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/GroupShareUtil$getTextUnBreakable$clickableSpan$1", "Lcom/ss/android/lark/chatsetting/impl/group/GroupShareUtil$GroupShareClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.b$b */
    public static final class C34605b extends GroupShareClickableSpan {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f89358a;

        C34605b(View.OnClickListener onClickListener) {
            this.f89358a = onClickListener;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            this.f89358a.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/GroupShareUtil$GroupShareClickableSpan;", "Landroid/text/style/ClickableSpan;", "()V", "frontColor", "", "(I)V", "characterColor", "setCharacterColor", "", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.b$a */
    public static abstract class GroupShareClickableSpan extends ClickableSpan {

        /* renamed from: a */
        private int f89357a = R.color.text_link_normal;

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            textPaint.setColor(UIUtils.getColor(a.mo127295y(), this.f89357a));
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m134455b(int i) {
        if (i == 0) {
            String a = C34501a.m133930a(UIHelper.getString(R.string.Lark_Group_QRcodeValidity_7Day), "date", C26279i.m95155a(new Date(), f89356a.m134456c(0)));
            Intrinsics.checkExpressionValueIsNotNull(a, "Utils.getGroupCodeValidD…ShareTimeType.ONE_WEEK)))");
            return a;
        } else if (i == 1) {
            String a2 = C34501a.m133930a(UIHelper.getString(R.string.Lark_Group_QRcodeValidity_1Year), "date", C26279i.m95155a(new Date(), f89356a.m134456c(1)));
            Intrinsics.checkExpressionValueIsNotNull(a2, "Utils.getGroupCodeValidD…ShareTimeType.ONE_YEAR)))");
            return a2;
        } else if (i != 2) {
            return "";
        } else {
            String string = UIHelper.getString(R.string.Lark_Group_QRcodeValidity_Permanent);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(\n    …QRcodeValidity_Permanent)");
            return string;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final CharSequence m134453a(TextView textView, String str, String str2, View.OnClickListener onClickListener) {
        String str3;
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        Intrinsics.checkParameterIsNotNull(str, "preText");
        Intrinsics.checkParameterIsNotNull(str2, "unbreakableText");
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        float width = (float) ((textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd());
        if (width - (textView.getPaint().measureText(str) % width) < textView.getPaint().measureText(str2) + textView.getPaint().measureText("   ")) {
            str3 = str + '\n' + str2;
        } else {
            str3 = str + "   " + str2;
        }
        C34605b bVar = new C34605b(onClickListener);
        String str4 = str3;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str4, str2, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
        spannableStringBuilder.setSpan(bVar, indexOf$default, str2.length() + indexOf$default, 17);
        return spannableStringBuilder;
    }
}
