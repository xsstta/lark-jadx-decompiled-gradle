package com.ss.android.lark.ai.smartreply;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.smartreply.C28598b;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28624f;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonAction;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import java.lang.ref.WeakReference;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.ai.smartreply.b */
public class C28598b extends RecyclerView.Adapter<C28599a> {

    /* renamed from: a */
    private List<SmartReplyItem> f71960a;

    /* renamed from: b */
    private AbstractC28624f f71961b;

    /* renamed from: c */
    private int f71962c;

    /* renamed from: d */
    private ImageView f71963d = ((ImageView) this.f71965f.findViewById(R.id.icon));

    /* renamed from: e */
    private EllipsizedEmojiconTextView f71964e;

    /* renamed from: f */
    private View f71965f;

    /* renamed from: g */
    private GuideDelegate f71966g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SmartReplyItem> list = this.f71960a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo101801a() {
        GuideDelegate gVar = this.f71966g;
        if (gVar != null) {
            gVar.mo141659b();
            this.f71966g = null;
        }
    }

    /* renamed from: a */
    public void mo101804a(AbstractC28624f fVar) {
        this.f71961b = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.ai.smartreply.b$a */
    public static class C28599a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        EllipsizedEmojiconTextView f71967a;

        /* renamed from: b */
        ImageView f71968b;

        /* renamed from: c */
        ObjectAnimator f71969c;

        C28599a(View view) {
            super(view);
            this.f71967a = (EllipsizedEmojiconTextView) view.findViewById(R.id.text_label);
            this.f71968b = (ImageView) view.findViewById(R.id.icon);
        }
    }

    public C28598b(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_smart_reply_text, (ViewGroup) null);
        this.f71965f = inflate;
        this.f71964e = (EllipsizedEmojiconTextView) inflate.findViewById(R.id.text_label);
        this.f71965f.setVisibility(0);
        this.f71965f.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
    }

    /* renamed from: a */
    private void m104860a(Context context) {
        if (this.f71960a != null) {
            int screenWidth = DeviceUtils.getScreenWidth(context);
            int dp2px = UIUtils.dp2px(context, 12.0f);
            int i = 0;
            for (int i2 = 0; i2 < this.f71960a.size(); i2++) {
                SmartReplyItem smartReplyItem = this.f71960a.get(i2);
                this.f71964e.setEmojiText(smartReplyItem.mo101838a());
                if (!TextUtils.isEmpty(smartReplyItem.mo101844e())) {
                    this.f71963d.setVisibility(0);
                } else {
                    this.f71963d.setVisibility(8);
                }
                this.f71965f.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
                i += this.f71965f.getMeasuredWidth() + dp2px;
                int i3 = i - screenWidth;
                if (i3 >= dp2px || i3 <= dp2px * -2) {
                    this.f71962c = dp2px;
                } else {
                    this.f71962c = dp2px + (((screenWidth - i) + dp2px) / (i2 + 1));
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void onViewDetachedFromWindow(C28599a aVar) {
        super.onViewDetachedFromWindow(aVar);
        aVar.f71969c.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m104859a(int i, View view) {
        AbstractC28624f fVar = this.f71961b;
        if (fVar != null) {
            fVar.onSuggestionClick(this.f71960a.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m104861a(View view, GuideDelegate gVar) {
        gVar.mo141659b();
        this.f71966g = null;
        C28522a.m104531a().mo101553a().mo101567a("mobile_chat_ai_suggestions", true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m104862a(C28599a aVar, ButtonBubbleConfig dVar) {
        this.f71966g = GuideComponent.m152612a((Activity) aVar.itemView.getContext(), dVar);
    }

    /* renamed from: b */
    private void m104863b(C28599a aVar, int i) {
        boolean a = C28522a.m104531a().mo101553a().mo101568a("mobile_chat_ai_suggestions");
        if (i == 0 && this.f71966g == null && a) {
            ButtonBubbleConfig dVar = new ButtonBubbleConfig(new AnchorConfig(new WeakReference(aVar.itemView), AnchorConfig.AnchorGravity.TOP), new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null), aVar.itemView.getContext().getString(R.string.Lark_AISuggestions_NUXTitle), aVar.itemView.getContext().getString(R.string.Lark_AISuggestions_NUXContent), null, new ButtonConfig(aVar.itemView.getContext().getString(R.string.Lark_Composer_NewUserOnboardingCloseButton), new ButtonAction() {
                /* class com.ss.android.lark.ai.smartreply.$$Lambda$b$p4Uz2BOwF34UQPdpqNc7fNREF4k */

                @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
                public final void onClick(View view, GuideDelegate gVar) {
                    C28598b.lambda$p4Uz2BOwF34UQPdpqNc7fNREF4k(C28598b.this, view, gVar);
                }
            }));
            dVar.mo141759b(false);
            dVar.mo141757a((Boolean) true);
            aVar.itemView.post(new Runnable(aVar, dVar) {
                /* class com.ss.android.lark.ai.smartreply.$$Lambda$b$li6K3E0RW8_CQolig6X5drAKjAk */
                public final /* synthetic */ C28598b.C28599a f$1;
                public final /* synthetic */ ButtonBubbleConfig f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C28598b.lambda$li6K3E0RW8_CQolig6X5drAKjAk(C28598b.this, this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public C28599a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C28599a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_smart_reply_text, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C28599a aVar, int i) {
        Context context = aVar.itemView.getContext();
        SmartReplyItem smartReplyItem = this.f71960a.get(i);
        aVar.f71967a.setEmojiText(smartReplyItem.mo101838a());
        if (!TextUtils.isEmpty(smartReplyItem.mo101844e())) {
            aVar.f71968b.setVisibility(0);
            ImageLoader.with(context).load(new C38824b(smartReplyItem.mo101844e())).override(UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f)).into(aVar.f71968b);
        } else if (smartReplyItem.mo101845f() != null) {
            aVar.f71968b.setVisibility(0);
            aVar.f71968b.setImageDrawable(smartReplyItem.mo101845f());
        } else {
            aVar.f71968b.setVisibility(8);
        }
        aVar.itemView.setOnClickListener(new View.OnClickListener(i) {
            /* class com.ss.android.lark.ai.smartreply.$$Lambda$b$0lTF7wWilOfzVmkJ19bs7B6f_4 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C28598b.m270238lambda$0lTF7wWilOfzVmkJ19bs7B6f_4(C28598b.this, this.f$1, view);
            }
        });
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
        if (i == getItemCount() - 1) {
            int i2 = this.f71962c;
            layoutParams.setMargins(i2, 0, i2, 0);
        } else {
            layoutParams.setMargins(this.f71962c, 0, 0, 0);
        }
        aVar.itemView.setLayoutParams(layoutParams);
        aVar.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        if (aVar.f71969c == null) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("translationY", ((float) aVar.itemView.getHeight()) * 0.3f, 0.0f);
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
            aVar.f71969c = ObjectAnimator.ofPropertyValuesHolder(aVar.itemView, ofFloat2, ofFloat);
            aVar.f71969c.setDuration(100L);
        }
        aVar.f71969c.setStartDelay((long) (i * 50));
        aVar.f71969c.start();
        m104863b(aVar, i);
    }

    /* renamed from: a */
    public void mo101805a(List<SmartReplyItem> list, Context context) {
        this.f71960a = list;
        m104860a(context);
        notifyDataSetChanged();
    }
}
