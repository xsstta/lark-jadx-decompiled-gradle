package com.ss.android.lark.guide.landing.vc.mvp;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.framework.mvp.C26034b;
import com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class SingleWelcomeView extends C26034b<AbstractC38662a.AbstractC38664b.AbstractC38665a> implements AbstractC38662a.AbstractC38664b {

    /* renamed from: a */
    private AbstractC38661a f99368a;
    @BindView(7927)
    public ImageView mIllustrationImageIV;
    @BindView(7699)
    public CommonTitleBar mTitleBar;
    @BindView(7920)
    public ImageView mWelcomeBgImage;
    @BindView(7921)
    public TextView mWelcomeButtonBtn;
    @BindView(7922)
    public TextView mWelcomeContentTV;
    @BindView(7923)
    public TextView mWelcomeDescTV;

    /* renamed from: com.ss.android.lark.guide.landing.vc.mvp.SingleWelcomeView$a */
    public interface AbstractC38661a {
        /* renamed from: a */
        void mo141583a(SingleWelcomeView singleWelcomeView);
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f99368a.mo141583a(this);
        m152539a();
    }

    /* renamed from: a */
    private void m152539a() {
        AbstractC38662a.AbstractC38664b.AbstractC38665a aVar = (AbstractC38662a.AbstractC38664b.AbstractC38665a) mo92555c();
        if (aVar != null) {
            this.mTitleBar.setImmersive(true);
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
            this.mTitleBar.setLeftClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.guide.landing.vc.mvp.SingleWelcomeView.C386591 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (SingleWelcomeView.this.mo92555c() != null) {
                        ((AbstractC38662a.AbstractC38664b.AbstractC38665a) SingleWelcomeView.this.mo92555c()).mo141591g();
                    }
                }
            });
            String a = aVar.mo141585a();
            if (!TextUtils.isEmpty(a)) {
                this.mTitleBar.setTitle(a);
            }
            int b = aVar.mo141586b();
            if (b > 0) {
                this.mIllustrationImageIV.setImageResource(b);
            }
            String c = aVar.mo141587c();
            if (!TextUtils.isEmpty(c)) {
                this.mWelcomeContentTV.setText(c);
            }
            String d = aVar.mo141588d();
            if (!TextUtils.isEmpty(d)) {
                this.mWelcomeDescTV.setText(d);
            }
            String e = aVar.mo141589e();
            if (!TextUtils.isEmpty(e)) {
                this.mWelcomeButtonBtn.setText(e);
            }
            this.mWelcomeButtonBtn.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.guide.landing.vc.mvp.SingleWelcomeView.C386602 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (SingleWelcomeView.this.mo92555c() != null) {
                        ((AbstractC38662a.AbstractC38664b.AbstractC38665a) SingleWelcomeView.this.mo92555c()).mo141590f();
                    }
                }
            });
        }
    }

    public SingleWelcomeView(AbstractC38661a aVar) {
        this.f99368a = aVar;
    }

    @Override // com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a.AbstractC38664b
    /* renamed from: a */
    public void mo141584a(Bitmap bitmap) {
        ImageView imageView;
        if (bitmap != null && (imageView = this.mWelcomeBgImage) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
