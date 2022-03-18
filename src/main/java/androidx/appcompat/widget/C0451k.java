package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C0845f;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.k */
public final class C0451k {

    /* renamed from: a */
    private TextView f1652a;

    /* renamed from: b */
    private TextClassifier f1653b;

    /* renamed from: a */
    public TextClassifier mo2610a() {
        TextClassifier textClassifier = this.f1653b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1652a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    /* renamed from: a */
    public void mo2611a(TextClassifier textClassifier) {
        this.f1653b = textClassifier;
    }

    C0451k(TextView textView) {
        this.f1652a = (TextView) C0845f.m3991a(textView);
    }
}
