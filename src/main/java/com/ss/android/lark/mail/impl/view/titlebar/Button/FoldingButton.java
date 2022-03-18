package com.ss.android.lark.mail.impl.view.titlebar.Button;

import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;

public class FoldingButton extends AbsButton {
    private final String TAG = "FoldingButton";

    public enum Type {
        Fold,
        Expand
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getDrawableID() {
        return R.drawable.mail_ic_title_bar_fold_all_messages_selector;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public String getText() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton
    public int getTextIcon() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton$1 */
    public static /* synthetic */ class C439501 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111516a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton$Type[] r0 = com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton.C439501.f111516a = r0
                com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton$Type r1 = com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton.Type.Fold     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton.C439501.f111516a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton$Type r1 = com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton.Type.Expand     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.view.titlebar.Button.FoldingButton.C439501.<clinit>():void");
        }
    }

    public FoldingButton(AbsButton.AbstractC43948a aVar) {
        super(aVar);
    }

    public void update(Type type) {
        if (type == null) {
            Log.m165383e("FoldingButton", "update null");
            return;
        }
        int i = C439501.f111516a[type.ordinal()];
        if (i == 1) {
            updateIcon(R.drawable.mail_ic_title_bar_fold_all_messages_selector);
        } else if (i != 2) {
            Log.m165397w("FoldingButton", "update switch to default");
        } else {
            updateIcon(R.drawable.mail_ic_title_bar_expand_all_messages_selector);
        }
    }
}
