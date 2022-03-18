package com.ss.android.lark.desktopmode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.p1787a.C36516a;

/* renamed from: com.ss.android.lark.desktopmode.b */
public class C36529b extends C36516a {
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.empty_frame_fragment_layout, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.holder);
        if (!(getArguments() == null || (i = getArguments().getInt("holder")) == -1)) {
            imageView.setImageResource(i);
        }
        return inflate;
    }
}
