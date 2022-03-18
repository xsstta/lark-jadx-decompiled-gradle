package com.larksuite.component.openplatform.core.block;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;

public class BlockStatusView extends RelativeLayout {

    /* renamed from: a */
    public C24422j f60227a;

    /* renamed from: b */
    public AbstractC24408b f60228b;

    /* renamed from: c */
    private float f60229c;

    /* renamed from: d */
    private float f60230d;

    /* renamed from: e */
    private ImageView f60231e;

    /* renamed from: f */
    private TextView f60232f;

    /* renamed from: g */
    private TextView f60233g;

    /* renamed from: h */
    private EnumC24407a f60234h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.block.BlockStatusView$a */
    public enum EnumC24407a {
        FULL,
        PIC_AND_TEXT,
        TEXT
    }

    /* renamed from: com.larksuite.component.openplatform.core.block.BlockStatusView$b */
    public interface AbstractC24408b {
        /* renamed from: a */
        void mo87207a(String str);
    }

    /* renamed from: b */
    private void m89066b() {
        this.f60231e.setVisibility(8);
        this.f60233g.setVisibility(8);
    }

    /* renamed from: c */
    private void m89067c() {
        this.f60231e.setVisibility(0);
        this.f60233g.setVisibility(8);
    }

    /* renamed from: d */
    private void m89068d() {
        this.f60231e.setVisibility(0);
        if (!TextUtils.isEmpty(this.f60227a.f60280c)) {
            this.f60233g.setVisibility(0);
        } else {
            this.f60233g.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo87201a() {
        int i = C244063.f60237a[this.f60234h.ordinal()];
        if (i == 1) {
            m89068d();
        } else if (i == 2) {
            m89067c();
        } else if (i == 3) {
            m89066b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.block.BlockStatusView$3 */
    public static /* synthetic */ class C244063 {

        /* renamed from: a */
        static final /* synthetic */ int[] f60237a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.larksuite.component.openplatform.core.block.BlockStatusView$a[] r0 = com.larksuite.component.openplatform.core.block.BlockStatusView.EnumC24407a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.block.BlockStatusView.C244063.f60237a = r0
                com.larksuite.component.openplatform.core.block.BlockStatusView$a r1 = com.larksuite.component.openplatform.core.block.BlockStatusView.EnumC24407a.FULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.block.BlockStatusView.C244063.f60237a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.openplatform.core.block.BlockStatusView$a r1 = com.larksuite.component.openplatform.core.block.BlockStatusView.EnumC24407a.PIC_AND_TEXT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.block.BlockStatusView.C244063.f60237a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.openplatform.core.block.BlockStatusView$a r1 = com.larksuite.component.openplatform.core.block.BlockStatusView.EnumC24407a.TEXT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.block.BlockStatusView.C244063.<clinit>():void");
        }
    }

    /* renamed from: e */
    private void m89069e() {
        this.f60232f.setText(this.f60227a.f60278a);
        this.f60231e.setImageResource(this.f60227a.f60279b);
        if (!TextUtils.isEmpty(this.f60227a.f60280c)) {
            this.f60233g.setText(this.f60227a.f60280c);
            this.f60233g.setOnClickListener(new View.OnClickListener() {
                /* class com.larksuite.component.openplatform.core.block.BlockStatusView.View$OnClickListenerC244052 */

                public void onClick(View view) {
                    if (!TextUtils.isEmpty(BlockStatusView.this.f60227a.f60281d)) {
                        BlockStatusView.this.f60228b.mo87207a(BlockStatusView.this.f60227a.f60281d);
                    }
                }
            });
        }
    }

    public void setOnBtnClickListener(AbstractC24408b bVar) {
        this.f60228b = bVar;
    }

    public BlockStatusView(Context context) {
        super(context);
        m89065a(context);
    }

    public void setBlockStatusDataModel(C24422j jVar) {
        this.f60227a = jVar;
        m89069e();
    }

    /* renamed from: a */
    private void m89065a(Context context) {
        this.f60229c = C67590h.m263065a(context, 140.0f);
        this.f60230d = C67590h.m263065a(context, 100.0f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.blockit_status_view, (ViewGroup) this, true);
        this.f60231e = (ImageView) inflate.findViewById(R.id.iv_block_status);
        this.f60232f = (TextView) inflate.findViewById(R.id.tv_block_status);
        this.f60233g = (TextView) inflate.findViewById(R.id.btn_block_status);
    }

    public BlockStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89065a(context);
    }

    public BlockStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89065a(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i2;
        if (f >= this.f60229c) {
            this.f60234h = EnumC24407a.FULL;
        } else if (f > this.f60230d) {
            this.f60234h = EnumC24407a.PIC_AND_TEXT;
        } else {
            this.f60234h = EnumC24407a.TEXT;
        }
        post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.block.BlockStatusView.RunnableC244041 */

            public void run() {
                BlockStatusView.this.mo87201a();
            }
        });
    }
}
