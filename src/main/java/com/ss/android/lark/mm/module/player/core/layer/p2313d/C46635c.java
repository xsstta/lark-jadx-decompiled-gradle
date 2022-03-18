package com.ss.android.lark.mm.module.player.core.layer.p2313d;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.ss.android.lark.mm.module.player.core.layer.p2313d.AbstractC46631a;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.d.c */
public class C46635c extends AppCompatImageView implements AbstractC46631a.AbstractC46632a {
    public View getView() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2313d.AbstractC46631a.AbstractC46632a
    /* renamed from: a */
    public void mo163835a() {
        setVisibility(0);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2313d.AbstractC46631a.AbstractC46632a
    /* renamed from: b */
    public void mo163836b() {
        setVisibility(8);
    }

    public C46635c(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2313d.AbstractC46631a.AbstractC46632a
    public void setImageUri(String str) {
        Uri parse = Uri.parse(str);
        if (parse != null) {
            super.setImageURI(parse);
        }
    }
}
