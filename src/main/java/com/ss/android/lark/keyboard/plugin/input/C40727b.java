package com.ss.android.lark.keyboard.plugin.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.keyboard.plugin.input.b */
public class C40727b implements IGetDataCallback<DocResult> {

    /* renamed from: a */
    private WeakReference<RichTextEmojiconEditText> f103449a;

    /* renamed from: b */
    private String f103450b;

    /* renamed from: c */
    private int f103451c;

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Log.m165383e("GetDocFromContentCallback", errorResult.toString());
    }

    /* renamed from: a */
    public void onSuccess(DocResult docResult) {
        C58508e.C58511b bVar;
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103449a.get();
        if (docResult != null && richTextEmojiconEditText != null) {
            Doc doc = docResult.getDoc();
            String name = doc.getName();
            int i = this.f103451c;
            if (i < 0) {
                bVar = new C58508e.C58511b(this.f103450b);
                bVar.mo198340a(false);
            } else {
                bVar = new C58508e.C58511b(i, this.f103450b);
            }
            Context context = richTextEmojiconEditText.getContext();
            int color = UIHelper.getColor(R.color.text_link_normal);
            C58508e.C58510a c = new C58508e.C58510a(context, bVar).mo198336a(name).mo198339c(color);
            Drawable drawable = ContextCompat.getDrawable(context, C40682g.m160850a().mo133166a(doc.getDocType()));
            IconKeyDrawable oVar = new IconKeyDrawable(richTextEmojiconEditText.getContext());
            oVar.mo89035a(doc.getIcon().getValue(), null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), drawable, true, Integer.valueOf(color));
            c.mo198335a(oVar);
            richTextEmojiconEditText.setReplaceContentSpan(c.mo198337a());
        }
    }

    public C40727b(RichTextEmojiconEditText richTextEmojiconEditText, String str, int i) {
        this.f103449a = new WeakReference<>(richTextEmojiconEditText);
        this.f103450b = str;
        this.f103451c = i;
    }
}
