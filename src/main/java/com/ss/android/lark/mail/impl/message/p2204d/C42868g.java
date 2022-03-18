package com.ss.android.lark.mail.impl.message.p2204d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.C43843b;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.d.g */
public class C42868g {
    /* renamed from: a */
    private static String m170769a(MailLabelEntity mailLabelEntity) {
        String l = mailLabelEntity.mo151528l();
        if (TextUtils.isEmpty(mailLabelEntity.mo151492A())) {
            return l;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < mailLabelEntity.mo151493B().size(); i++) {
            stringBuffer.append(mailLabelEntity.mo151493B().get(i));
            if (i < mailLabelEntity.mo151493B().size() - 1) {
                stringBuffer.append("/");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m170771a(String str, String str2, List<MailLabelEntity> list, Context context) {
        MailThread mailThread = new MailThread();
        mailThread.mo151682a(str2);
        mailThread.mo151704e(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mailThread);
        C42699a.m170267b(context, arrayList, str);
    }

    /* renamed from: a */
    public static void m170770a(AbsMessageTemplateView absMessageTemplateView, String str, String str2, PermissionCode permissionCode, String str3, boolean z, List<MailLabelEntity> list, Context context, TextView textView, boolean z2, String str4) {
        m170772a(absMessageTemplateView, str, str2, permissionCode, str3, z, list, context, textView, z2, null, -1, str4);
    }

    /* renamed from: a */
    public static boolean m170772a(AbsMessageTemplateView absMessageTemplateView, String str, String str2, PermissionCode permissionCode, String str3, boolean z, List<MailLabelEntity> list, Context context, TextView textView, boolean z2, String str4, int i, String str5) {
        return m170773a(absMessageTemplateView, str, str2, permissionCode, str3, z, list, context, textView, z2, str4, i, str5, null, false);
    }

    /* renamed from: a */
    public static boolean m170773a(final AbsMessageTemplateView absMessageTemplateView, final String str, final String str2, PermissionCode permissionCode, String str3, boolean z, List<MailLabelEntity> list, final Context context, TextView textView, boolean z2, String str4, int i, String str5, String str6, final boolean z3) {
        ForegroundColorSpan foregroundColorSpan;
        String str7;
        boolean z4;
        Typeface typeface;
        boolean z5;
        Typeface typeface2;
        String str8;
        boolean z6;
        int i2;
        int i3 = 0;
        if (textView == null) {
            return false;
        }
        final List<MailLabelEntity> a = C43374f.m172256a(permissionCode, list, str);
        int i4 = 1;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                textView.setBreakStrategy(1);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(str3)) {
            str7 = C43819s.m173684a((int) R.string.Mail_ThreadList_NoName);
            foregroundColorSpan = new ForegroundColorSpan(UIHelper.getColor(R.color.lkui_N500));
        } else {
            foregroundColorSpan = null;
            str7 = str3;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str7);
        spannableStringBuilder.setSpan(new C43843b(C43785p.m173530a(28)), 0, spannableStringBuilder.length(), 34);
        int i5 = 33;
        if (foregroundColorSpan != null) {
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, spannableStringBuilder.length(), 33);
        }
        if (z3) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(UIHelper.getColor(R.color.lkui_N300)), 0, spannableStringBuilder.length(), 33);
        }
        if (!TextUtils.isEmpty(str5)) {
            String lowerCase = str7.toLowerCase();
            int indexOf = lowerCase.indexOf(str5);
            while (indexOf >= 0) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(UIHelper.getColor(R.color.ud_S400)), indexOf, str5.length() + indexOf, 33);
                indexOf = lowerCase.indexOf(str5, indexOf + str5.length());
            }
        }
        if (TextUtils.isEmpty(str4) || i < 0) {
            z4 = false;
        } else {
            String lowerCase2 = str7.toLowerCase();
            int indexOf2 = lowerCase2.indexOf(str4);
            int i6 = 0;
            boolean z7 = false;
            while (indexOf2 >= 0) {
                if (i6 == i) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(UIHelper.getColor(R.color.lkui_O400)), indexOf2, str4.length() + indexOf2, 33);
                    z7 = true;
                } else {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(UIHelper.getColor(R.color.lkui_O200)), indexOf2, str4.length() + indexOf2, 33);
                }
                indexOf2 = lowerCase2.indexOf(str4, indexOf2 + str4.length());
                i6++;
            }
            z4 = z7;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(Typeface.DEFAULT, ParticipantRepo.f117150c, false);
        } else {
            typeface = Typeface.create(Typeface.DEFAULT, 0);
        }
        if (!TextUtils.isEmpty(str6)) {
            spannableStringBuilder.append((CharSequence) "｜");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#C4C4C4")), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) str6);
        }
        int i7 = R.dimen.mail_label_height;
        String str9 = " ";
        if (z) {
            spannableStringBuilder.append((CharSequence) str9);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(UIHelper.getDimens(R.dimen.mail_label_blank_size)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            String charSequence = context.getText(R.string.Mail_SecurityWarning_External).toString();
            spannableStringBuilder.append((CharSequence) charSequence);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(UIHelper.getDimens(R.dimen.mail_label_text_size)), spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new C42882k(context.getResources().getColor(R.color.lkui_R500), context.getResources().getColor(R.color.lkui_R100), UIHelper.getDimens(R.dimen.mail_label_text_radius), UIHelper.getDimens(R.dimen.mail_label_text_size), UIHelper.getDimens(R.dimen.mail_label_height)), spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new C42867f(typeface), spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) str9);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(UIHelper.getDimens(R.dimen.mail_label_blank_size)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            z5 = true;
        } else {
            z5 = false;
        }
        while (i3 < a.size()) {
            MailLabelEntity mailLabelEntity = a.get(i3);
            if (!mailLabelEntity.mo151529m()) {
                if (!z5) {
                    spannableStringBuilder.append((CharSequence) str9);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(UIHelper.getDimens(R.dimen.mail_label_blank_size)), spannableStringBuilder.length() - i4, spannableStringBuilder.length(), i5);
                    z6 = true;
                } else {
                    z6 = z5;
                }
                String a2 = m170769a(mailLabelEntity);
                spannableStringBuilder.append((CharSequence) a2);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(UIHelper.getDimens(R.dimen.mail_label_text_size)), spannableStringBuilder.length() - a2.length(), spannableStringBuilder.length(), i5);
                spannableStringBuilder.setSpan(new C42882k(mailLabelEntity.mo151521g(), mailLabelEntity.mo151525i(), UIHelper.getDimens(R.dimen.mail_label_text_radius), UIHelper.getDimens(R.dimen.mail_label_text_size), UIHelper.getDimens(i7)), spannableStringBuilder.length() - a2.length(), spannableStringBuilder.length(), i5);
                spannableStringBuilder.setSpan(new C42867f(typeface), spannableStringBuilder.length() - a2.length(), spannableStringBuilder.length(), i5);
                if (!z2) {
                    str8 = str9;
                    typeface2 = typeface;
                    i2 = 33;
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        /* class com.ss.android.lark.mail.impl.message.p2204d.C42868g.C428691 */

                        public void onClick(View view) {
                            if (z3) {
                                AbsMessageTemplateView absMessageTemplateView = absMessageTemplateView;
                                if (absMessageTemplateView != null) {
                                    absMessageTemplateView.mo154305P();
                                    return;
                                }
                                return;
                            }
                            C42868g.m170771a(str, str2, a, context);
                        }
                    }, spannableStringBuilder.length() - a2.length(), spannableStringBuilder.length(), 33);
                } else {
                    typeface2 = typeface;
                    str8 = str9;
                    i2 = 33;
                }
                spannableStringBuilder.append((CharSequence) str8);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(UIHelper.getDimens(R.dimen.mail_label_blank_size)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), i2);
                z5 = z6;
            } else {
                typeface2 = typeface;
                str8 = str9;
            }
            i3++;
            str9 = str8;
            typeface = typeface2;
            i7 = R.dimen.mail_label_height;
            i5 = 33;
            i4 = 1;
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return z4;
    }
}
