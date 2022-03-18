package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42784a;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.C42803a;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.MailTxtAttrId;
import java.util.ArrayList;
import java.util.Arrays;

public enum MailItemId implements ItemId.AbstractC6203a {
    attribution,
    signature,
    attachment,
    insertImage;

    @Override // com.bytedance.ee.bear.document.toolbar.ItemId
    public ItemId[] children() {
        if (this == attribution) {
            return MailTxtAttrId.values();
        }
        return null;
    }

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId$1 */
    static /* synthetic */ class C428091 {

        /* renamed from: a */
        static final /* synthetic */ int[] f108988a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId[] r0 = com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.C428091.f108988a = r0
                com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId r1 = com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.attribution     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.C428091.f108988a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId r1 = com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.insertImage     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.C428091.f108988a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId r1 = com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.signature     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.C428091.f108988a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId r1 = com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.attachment     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId.C428091.<clinit>():void");
        }
    }

    public static MailItemId[] filter(MailItemId mailItemId) {
        ArrayList arrayList = new ArrayList(Arrays.asList(values()));
        arrayList.remove(mailItemId);
        return (MailItemId[]) arrayList.toArray(new MailItemId[0]);
    }

    public static Class<? extends DialogInterface$OnCancelListenerC1021b> getSubToolbarFragmentClass(ItemId itemId) {
        if (itemId == attribution) {
            return C42803a.class;
        }
        if (itemId == attachment) {
            return C42762a.class;
        }
        if (itemId == signature) {
            return C42784a.class;
        }
        throw new IllegalStateException("get subToolbarFragmentClass on:" + itemId);
    }

    public static int mailToolbarIcon(MailItemId mailItemId) {
        int i = C428091.f108988a[mailItemId.ordinal()];
        if (i == 1) {
            return R.drawable.ud_icon_style_outlined;
        }
        if (i == 2) {
            return R.drawable.ud_icon_image_outlined;
        }
        if (i == 3) {
            return R.drawable.ud_icon_signature_outlined;
        }
        if (i != 4) {
            return 0;
        }
        return R.drawable.ud_icon_attachment_outlined;
    }
}
