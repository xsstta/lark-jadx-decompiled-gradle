package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.f */
public class C51617f extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public View f128438m;

    /* renamed from: n */
    public TextView f128439n;

    /* renamed from: o */
    public EllipsizedEmojiconTextView f128440o;

    /* renamed from: p */
    public View f128441p;

    private C51617f(View view) {
        super(view);
        this.f128438m = view.findViewById(R.id.merge_forward_root_view);
        this.f128439n = (TextView) view.findViewById(R.id.merge_forward_title);
        this.f128440o = (EllipsizedEmojiconTextView) view.findViewById(R.id.merge_forward_content);
        this.f128441p = view.findViewById(R.id.label);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.f$a */
    public static class C51619a {
        /* renamed from: a */
        public static C51617f m200247a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            C51617f fVar = new C51617f(layoutInflater.inflate(R.layout.chatpin_item_mergeforward2, viewGroup, false));
            DesktopUtil.m144299a(fVar.f128439n);
            DesktopUtil.m144299a(fVar.f128440o);
            return fVar;
        }
    }
}
