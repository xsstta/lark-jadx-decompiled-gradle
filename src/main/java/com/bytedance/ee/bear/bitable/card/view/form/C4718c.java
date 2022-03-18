package com.bytedance.ee.bear.bitable.card.view.form;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.form.c */
public class C4718c extends RecyclerView.ViewHolder {
    public C4718c(View view) {
        super(view);
    }

    /* renamed from: a */
    public void mo18434a(boolean z) {
        Resources resources = this.itemView.getContext().getResources();
        TextView textView = (TextView) this.itemView;
        textView.setEnabled(z);
        if (z) {
            textView.setText(R.string.Bitable_Form_PleaseEditOnDesktop);
            textView.setTextColor(resources.getColor(R.color.text_placeholder));
            return;
        }
        textView.setText(R.string.Bitable_Form_NoEditableItem);
        textView.setTextColor(resources.getColor(R.color.text_disable));
    }
}
