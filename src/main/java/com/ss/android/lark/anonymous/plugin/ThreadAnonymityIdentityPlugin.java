package com.ss.android.lark.anonymous.plugin;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.anonymous.model.C28694a;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

public class ThreadAnonymityIdentityPlugin implements IInputSupportAdditionPlugin {

    /* renamed from: c */
    public static final int f72204c = UIHelper.dp2px(24.0f);

    /* renamed from: a */
    public final AbstractC28700a f72205a;

    /* renamed from: b */
    ValueAnimator f72206b;

    /* renamed from: d */
    public int f72207d = 1;

    /* renamed from: e */
    private IInputSupportAdditionPlugin.IAdditionSupportContext f72208e;

    /* renamed from: f */
    private final boolean f72209f;

    /* renamed from: g */
    private final int f72210g = 180;

    /* renamed from: h */
    private Context f72211h;

    /* renamed from: i */
    private View f72212i;

    /* renamed from: j */
    private final int f72213j = R.layout.thread_anonymity_identity;

    /* renamed from: k */
    private C28694a f72214k;

    /* renamed from: l */
    private final IInputSupportAdditionPlugin.OnPanelChangeListener f72215l = new IInputSupportAdditionPlugin.OnPanelChangeListener() {
        /* class com.ss.android.lark.anonymous.plugin.ThreadAnonymityIdentityPlugin.C286971 */

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.OnPanelChangeListener
        /* renamed from: a */
        public void mo102083a() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.OnPanelChangeListener
        /* renamed from: b */
        public void mo102085b(int i) {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin.OnPanelChangeListener
        /* renamed from: a */
        public void mo102084a(int i) {
            ThreadAnonymityIdentityPlugin.this.mo102081b(i);
        }
    };
    @BindView(7863)
    ImageView mArrowView;
    @BindView(7244)
    LKUIRoundedImageView2 mLKUIVIdentityAvatar;
    @BindView(8287)
    TextView mTVIdentityName;

    /* renamed from: com.ss.android.lark.anonymous.plugin.ThreadAnonymityIdentityPlugin$a */
    public interface AbstractC28700a {
        /* renamed from: a */
        void mo102088a();

        /* renamed from: a */
        void mo102089a(boolean z);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: b */
    public void mo102080b() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: c */
    public void mo102082c() {
        this.f72206b = null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public int mo102073a() {
        return this.f72213j;
    }

    /* renamed from: d */
    private int m105208d() {
        int windowWidth = UIHelper.getWindowWidth(this.f72211h);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mLKUIVIdentityAvatar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mArrowView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.mTVIdentityName.getLayoutParams();
        if (marginLayoutParams != null) {
            windowWidth = ((windowWidth - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - marginLayoutParams.width;
        }
        if (marginLayoutParams2 != null) {
            windowWidth = ((windowWidth - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin) - marginLayoutParams2.width;
        }
        if (marginLayoutParams3 != null) {
            return (windowWidth - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin;
        }
        return windowWidth;
    }

    /* renamed from: e */
    private void m105210e() {
        C28694a aVar = this.f72214k;
        if (aVar == null) {
            Log.m165383e("ThreadAnonymityIdentityPlugin", "mCurrentIdentityBean is null!");
            return;
        }
        LKUIRoundedImageView2 lKUIRoundedImageView2 = this.mLKUIVIdentityAvatar;
        if (lKUIRoundedImageView2 != null) {
            Context context = this.f72211h;
            String d = aVar.mo102062d();
            String f = this.f72214k.mo102064f();
            int i = f72204c;
            C34336c.m133130a(context, lKUIRoundedImageView2, d, f, i, i, Scene.Thread);
            return;
        }
        Log.m165383e("ThreadAnonymityIdentityPlugin", "mLKUIVIdentityAvatar is null!");
    }

    /* renamed from: f */
    private void m105211f() {
        String str;
        C28694a aVar = this.f72214k;
        if (aVar == null) {
            Log.m165383e("ThreadAnonymityIdentityPlugin", "mCurrentIdentityBean is null!");
        } else if (this.mTVIdentityName != null) {
            if (aVar.mo102063e() == 1) {
                str = UIHelper.getString(R.string.Lark_Groups_PostAnonymoulsy2);
            } else {
                str = this.f72214k.mo102056a();
            }
            this.mTVIdentityName.setText(m105206a(str, (float) m105208d()));
        } else {
            Log.m165383e("ThreadAnonymityIdentityPlugin", "Update identity name failed，mTVIdentityName is null");
        }
    }

    /* renamed from: a */
    public void mo102076a(int i) {
        this.f72207d = i;
    }

    /* renamed from: b */
    public void mo102081b(int i) {
        m105207c(i);
    }

    /* renamed from: c */
    private void m105207c(int i) {
        if (this.mArrowView != null) {
            m105209d(i);
        }
    }

    /* renamed from: a */
    public void mo102077a(C28694a aVar) {
        this.f72214k = aVar;
        m105210e();
        m105211f();
    }

    /* renamed from: d */
    private void m105209d(final int i) {
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(100L);
        this.f72206b = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.anonymous.plugin.ThreadAnonymityIdentityPlugin.C286993 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i = i;
                if (i == 0) {
                    ThreadAnonymityIdentityPlugin.this.mArrowView.setRotation(animatedFraction * 180.0f);
                } else if (i == 1) {
                    ThreadAnonymityIdentityPlugin.this.mArrowView.setRotation((1.0f - animatedFraction) * 180.0f);
                }
            }
        });
        this.f72206b.start();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public void mo102078a(IInputSupportAdditionPlugin.IAdditionSupportContext aVar) {
        this.f72208e = aVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public void mo102079a(boolean z) {
        this.f72212i.setEnabled(z);
    }

    public ThreadAnonymityIdentityPlugin(AbstractC28700a aVar, boolean z) {
        this.f72205a = aVar;
        this.f72209f = z;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public View mo102075a(Activity activity, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(activity).inflate(this.f72213j, viewGroup, false);
        this.f72212i = inflate;
        ButterKnife.bind(this, inflate);
        return mo102074a(activity, this.f72212i);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public View mo102074a(Activity activity, View view) {
        this.f72214k = new C28694a.C28696a().mo102069a();
        this.f72211h = activity;
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.anonymous.plugin.ThreadAnonymityIdentityPlugin.View$OnClickListenerC286982 */

            public void onClick(View view) {
                boolean z = false;
                if (ThreadAnonymityIdentityPlugin.this.f72207d == 1) {
                    ThreadAnonymityIdentityPlugin.this.f72207d = 0;
                } else {
                    ThreadAnonymityIdentityPlugin.this.f72207d = 1;
                }
                AbstractC28700a aVar = ThreadAnonymityIdentityPlugin.this.f72205a;
                if (ThreadAnonymityIdentityPlugin.this.f72207d == 0) {
                    z = true;
                }
                aVar.mo102089a(z);
            }
        });
        this.f72208e.mo146898a(this.f72215l);
        if (this.f72209f) {
            this.f72208e.mo146897a();
        }
        this.f72205a.mo102088a();
        return view;
    }

    /* renamed from: a */
    private String m105206a(String str, float f) {
        if (str == null || f <= BitmapDescriptorFactory.HUE_RED) {
            return str;
        }
        float measureText = this.mTVIdentityName.getPaint().measureText(str);
        int i = 1;
        String str2 = str;
        while (measureText > f && str.length() > i) {
            str2 = str.substring(0, str.length() - i) + "...";
            measureText = this.mTVIdentityName.getPaint().measureText(str2);
            i++;
        }
        return str2;
    }
}
