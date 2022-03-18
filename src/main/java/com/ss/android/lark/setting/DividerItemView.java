package com.ss.android.lark.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.lark.setting.BaseItemView;

public class DividerItemView extends BaseItemView {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.setting.BaseItemView
    public void setupContainer(FrameLayout frameLayout) {
    }

    /* renamed from: com.ss.android.lark.setting.DividerItemView$b */
    private static class C54111b extends BaseItemView.AbstractC54107a<C54111b, DividerItemView> {
        /* renamed from: b */
        public DividerItemView mo185177a() {
            return new DividerItemView(this);
        }

        public C54111b(Context context) {
            super(context, 3);
        }
    }

    /* renamed from: com.ss.android.lark.setting.DividerItemView$a */
    public static class C54110a {

        /* renamed from: a */
        private Context f133963a;

        /* renamed from: b */
        private int f133964b;

        /* renamed from: c */
        private boolean f133965c = true;

        /* renamed from: a */
        public DividerItemView mo185187a() {
            return (DividerItemView) new C54111b(this.f133963a).mo185178b((String) null).mo185175a((String) null).mo185174a(this.f133964b).mo185176a(this.f133965c).mo185179b(false).mo185177a();
        }

        /* renamed from: a */
        public C54110a mo185185a(int i) {
            this.f133964b = i;
            return this;
        }

        /* renamed from: a */
        public C54110a mo185186a(boolean z) {
            this.f133965c = z;
            return this;
        }

        public C54110a(Context context) {
            this.f133963a = context;
        }
    }

    public DividerItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    private DividerItemView(C54111b bVar) {
        super(bVar);
        mo185169a(getContext());
    }

    public DividerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DividerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo185169a(context);
    }
}
