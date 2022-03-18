package com.by.p098a;

import android.content.Context;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.fileview.FileView;

/* renamed from: com.by.a.i */
public class C2581i implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        FileView fileView = new FileView(context);
        fileView.setId(R.id.chat_file);
        C0178a.m580a(fileView);
        fileView.setLayoutParams(C0178a.m579a(viewGroup, -1, -2));
        if (viewGroup != null && z) {
            viewGroup.addView(fileView);
        }
        return fileView;
    }
}
