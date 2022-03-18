package com.ss.android.lark.contact.impl.contacts_email.edit;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/MailAddressValidator;", "", "()V", "EMAIL_ADDRESS_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "isValidAddressOnly", "", "text", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.d */
public final class MailAddressValidator {

    /* renamed from: a */
    public static final MailAddressValidator f91926a = new MailAddressValidator();

    /* renamed from: b */
    private static final Pattern f91927b = Pattern.compile("^((?!\\s)[+a-zA-Z0-9_.!#$%&'*\\/=?^`{|}~\\u0080-\\uffffFF-])+@((?!\\s)[a-zA-Z0-9\\u0080-\\u3001\\u3003-\\uff0d\\uff0f-\\uff60\\uff62-\\uffffFF-]+[\\.])+(?!\\s)[a-zA-Z0-9\\u0080-\\u3001\\u3003-\\uff0d\\uff0f-\\uff60\\uff62-\\uffffFF-]{2,63}$");

    private MailAddressValidator() {
    }

    /* renamed from: a */
    public final boolean mo131119a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        if (charSequence.length() == 0) {
            return false;
        }
        return f91927b.matcher(charSequence).matches();
    }
}
