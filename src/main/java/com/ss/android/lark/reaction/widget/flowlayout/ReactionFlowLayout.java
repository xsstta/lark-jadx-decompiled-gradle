package com.ss.android.lark.reaction.widget.flowlayout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.reaction.p2557b.C52986b;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionTagLayout;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53062b;
import com.ss.android.lark.reaction.widget.flowlayout.reaction.ReactionTextView;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52987a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import java.util.Iterator;
import java.util.List;

public class ReactionFlowLayout extends ReactionBaseFlowLayout {

    /* renamed from: s */
    private static ReactionTagLayout.AbstractC53055a f131084s = $$Lambda$ReactionFlowLayout$lfowbKZzjhkvXdusQPrrqanrTl4.INSTANCE;

    /* renamed from: t */
    private static ReactionTagLayout.AbstractC53056b f131085t = $$Lambda$ReactionFlowLayout$D0XJK2iUOOyNigbw02aLN9WvYKo.INSTANCE;

    /* renamed from: e */
    public Drawable f131086e;

    /* renamed from: f */
    public boolean f131087f = false;

    /* renamed from: g */
    protected ReactionTextView f131088g;

    /* renamed from: h */
    public int f131089h = -1;

    /* renamed from: i */
    public int f131090i;

    /* renamed from: j */
    public int[] f131091j;

    /* renamed from: k */
    public int f131092k = -1;

    /* renamed from: l */
    public int f131093l = -1;

    /* renamed from: m */
    private C53053a f131094m = new C53053a();

    /* renamed from: n */
    private boolean f131095n = false;

    /* renamed from: o */
    private int f131096o;

    /* renamed from: p */
    private int f131097p;

    /* renamed from: q */
    private int f131098q;

    /* renamed from: r */
    private int f131099r = Integer.MAX_VALUE;

    /* renamed from: u */
    private int f131100u = 0;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public void mo181182a(ViewGroup viewGroup, List<C53062b> list, int i, String str) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = this.f131094m.f131113g;
        viewGroup.removeAllViews();
        int i2 = 0;
        if (list.size() > 12 || list.size() > this.f131099r) {
            list = list.subList(0, Math.min(12, this.f131099r));
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C53062b bVar = list.get(i3);
            bVar.mo181232a(true);
            CharSequence charSequence = bVar.f131137b;
            TextView textView = (TextView) C36443k.m143597a(getContext(), TextView.class.getName());
            if (textView == null) {
                textView = new TextView(getContext());
            }
            textView.setText(charSequence);
            textView.setTag(bVar);
            m205387a(textView);
            textView.setId(R.id.tv_reaction_name);
            viewGroup.addView(textView, layoutParams);
            if (bVar.mo181235b()) {
                textView.setOnClickListener(new ReactionBaseFlowLayout.C53048c(bVar.f131136a, str, false));
            }
            if (i3 != size - 1) {
                TextView textView2 = new TextView(getContext());
                textView2.setText(C52990a.m205228a(getContext(), (int) R.string.Lark_Legacy_ReactionSeparator));
                m205387a(textView2);
                textView2.setId(R.id.tv_reaction_name_splitter);
                viewGroup.addView(textView2, layoutParams);
            }
        }
        int i4 = this.f131099r;
        boolean z = i4 != Integer.MAX_VALUE && i > i4;
        int size2 = z ? i - list.size() : i;
        C53062b bVar2 = new C53062b();
        bVar2.mo181232a(false);
        TextView textView3 = new TextView(getContext());
        textView3.setText(" " + C52990a.m205229a(getContext(), R.string.Lark_Legacy_PostReactionAppend, "count", Integer.toString(size2)));
        textView3.setTag(bVar2);
        if (!z) {
            i2 = 8;
        }
        textView3.setVisibility(i2);
        m205387a(textView3);
        textView3.setId(R.id.tv_reaction_last_text);
        viewGroup.addView(textView3, layoutParams);
        textView3.setOnClickListener(new ReactionBaseFlowLayout.C53048c(bVar2.f131136a, str, true));
        viewGroup.setTag(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout$a */
    public static class C53053a {

        /* renamed from: a */
        public float f131107a;

        /* renamed from: b */
        public int f131108b;

        /* renamed from: c */
        public int f131109c;

        /* renamed from: d */
        public boolean f131110d;

        /* renamed from: e */
        public int f131111e;

        /* renamed from: f */
        public TextUtils.TruncateAt f131112f;

        /* renamed from: g */
        public int f131113g;

        private C53053a() {
            this.f131107a = 12.0f;
            this.f131108b = R.color.text_caption;
            this.f131109c = 1;
            this.f131110d = true;
            this.f131111e = 8388611;
            this.f131112f = TextUtils.TruncateAt.END;
            this.f131113g = 16;
        }
    }

    /* renamed from: c */
    private void m205391c() {
        ReactionTextView reactionTextView = this.f131088g;
        if (reactionTextView != null) {
            if (reactionTextView.getParent() != null) {
                ((ViewGroup) this.f131088g.getParent()).removeView(this.f131088g);
            }
            this.f131088g = null;
        }
    }

    /* renamed from: b */
    public boolean mo181185b() {
        int[] iArr = this.f131091j;
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (!(i == 0 || i == -1)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout
    /* renamed from: a */
    public void mo181175a() {
        int i;
        this.f131076a = new ReactionTagLayout(getContext());
        addView(this.f131076a, new FrameLayout.LayoutParams(-1, -1));
        this.f131076a.setRequestItemMinWidthCalculator(f131084s);
        this.f131076a.setRequestLeftTextSpaceCalculator(f131085t);
        if (this.f131087f) {
            i = LKUIDisplayManager.m91881c(getContext(), 24);
        } else {
            i = C52990a.m205224a(getContext(), 24.0f);
        }
        this.f131089h = i;
        this.f131086e = C52990a.m205235b(getContext(), (int) R.drawable.bubble_reaction_grey_bg);
    }

    public void setDivideLineColor(int i) {
        this.f131090i = i;
    }

    public void setMaxNameCount(int i) {
        this.f131099r = i;
    }

    public void setNewReactionEnable(boolean z) {
        this.f131095n = z;
    }

    public void setReactionLeftMargin(int i) {
        this.f131093l = i;
    }

    public void setReactionMaxWidth(int i) {
        this.f131098q = i;
    }

    public void setReactionPaddings(int[] iArr) {
        this.f131091j = iArr;
    }

    public void setReactionTopMargin(int i) {
        this.f131092k = i;
    }

    public void setTagBackground(Drawable drawable) {
        this.f131086e = drawable;
    }

    public void setReactionTextSize(int i) {
        this.f131094m.f131107a = (float) i;
    }

    public void setTextColor(int i) {
        this.f131100u = i;
        this.f131094m.f131108b = i;
    }

    @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout
    public void setup(List<C53061a> list) {
        mo181183a(list, false);
    }

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout$b */
    public class C53054b {

        /* renamed from: b */
        private long f131115b = 500;

        /* renamed from: c */
        private long f131116c;

        public C53054b() {
        }

        /* renamed from: a */
        public void mo181206a(String str, String str2, boolean z) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f131116c = uptimeMillis;
            if (uptimeMillis - this.f131116c < this.f131115b) {
                Log.m165389i("OnSingleClickListener", "elapsedTime is short than LENGTH_SHORT");
            } else if (z) {
                if (ReactionFlowLayout.this.f131079d != null && !TextUtils.isEmpty(str2)) {
                    ReactionFlowLayout.this.f131079d.perform(str2);
                }
            } else if (ReactionFlowLayout.this.f131078c != null && !TextUtils.isEmpty(str)) {
                ReactionFlowLayout.this.f131078c.perform(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m205388a(String str) {
        if (this.f131077b != null) {
            this.f131077b.onReactionClicked(str);
        }
    }

    public void setChildXOffset(int i) {
        this.f131076a.setChildXOffset(i);
        ReactionTextView reactionTextView = this.f131088g;
        if (reactionTextView != null) {
            reactionTextView.setTranslationX((float) i);
        }
        this.f131096o = i;
    }

    public void setChildYOffset(int i) {
        this.f131076a.setChildYOffset(i);
        ReactionTextView reactionTextView = this.f131088g;
        if (reactionTextView != null) {
            reactionTextView.setTranslationY((float) i);
        }
        this.f131097p = i;
    }

    public void setReactionViewHeight(int i) {
        this.f131089h = C52990a.m205224a(getContext(), (float) i);
    }

    public void setTagBackgroundColor(int i) {
        this.f131086e = ReactionFlowView.m205401a(getContext(), i);
    }

    public ReactionFlowLayout(Context context) {
        super(context);
    }

    public void setDisplayChangeEnable(boolean z) {
        int i;
        this.f131087f = z;
        if (z) {
            i = LKUIDisplayManager.m91881c(getContext(), 24);
        } else {
            i = C52990a.m205224a(getContext(), 24.0f);
        }
        this.f131089h = i;
    }

    /* renamed from: a */
    private void m205387a(TextView textView) {
        if (this.f131087f) {
            C25649b.m91856a(textView, (int) this.f131094m.f131107a);
        } else {
            textView.setTextSize(2, this.f131094m.f131107a);
        }
        textView.setTextColor(C52990a.m205239c(getContext(), this.f131094m.f131108b));
        textView.setSingleLine(this.f131094m.f131110d);
        textView.setMaxLines(this.f131094m.f131109c);
        textView.setGravity(this.f131094m.f131111e);
        textView.setEllipsize(this.f131094m.f131112f);
    }

    /* renamed from: a */
    public void mo181183a(List<C53061a> list, boolean z) {
        super.setup(list);
        if (!mo181176a(list)) {
            m205391c();
        } else if (!this.f131095n) {
            m205389a(list, z, false);
        } else {
            m205390b(list, z, false);
        }
    }

    /* renamed from: b */
    public void mo181184b(List<C53061a> list, boolean z) {
        super.setup(list);
        if (!mo181176a(list)) {
            m205391c();
        } else if (!this.f131095n) {
            m205389a(list, z, true);
        } else {
            m205390b(list, z, true);
        }
    }

    public ReactionFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m205385a(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int a = C52990a.m205226a(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        if (!(view instanceof C53063b)) {
            return a;
        }
        ViewGroup viewGroup = (ViewGroup) ((C53063b) view).getTagView().findViewById(R.id.names_reaction_list);
        if (((Integer) viewGroup.getTag()).intValue() <= 1) {
            return a;
        }
        int childCount = viewGroup.getChildCount();
        return Math.min(C52990a.m205226a(viewGroup.getChildAt(0)) + C52990a.m205226a(viewGroup.getChildAt(childCount - 1)) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i, a);
    }

    public ReactionFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    private void m205390b(List<C53061a> list, boolean z, boolean z2) {
        this.f131076a.setVisibility(8);
        ReactionTextView reactionTextView = this.f131088g;
        if (reactionTextView == null) {
            ReactionTextView reactionTextView2 = new ReactionTextView(getContext());
            this.f131088g = reactionTextView2;
            addView(reactionTextView2);
        } else {
            reactionTextView.setVisibility(0);
        }
        if (mo181185b()) {
            ReactionTextView reactionTextView3 = this.f131088g;
            int[] iArr = this.f131091j;
            reactionTextView3.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        ReactionTextView reactionTextView4 = this.f131088g;
        int i = this.f131098q;
        if (i == 0) {
            i = C52990a.m205224a(getContext(), 315.0f);
        }
        reactionTextView4.setMaxWidth(i);
        if (this.f131087f) {
            this.f131088g.setTextSize(2, LKUIDisplayManager.m91870a().getMultiplier() * this.f131094m.f131107a);
        } else {
            this.f131088g.setTextSize(2, this.f131094m.f131107a);
        }
        this.f131088g.setTextColor(C52990a.m205239c(getContext(), this.f131094m.f131108b));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = this.f131093l;
        if (i2 != -1) {
            layoutParams.leftMargin = i2;
        }
        this.f131088g.setLineBackground(this.f131086e);
        this.f131088g.setTranslationX((float) this.f131096o);
        this.f131088g.setTranslationY((float) this.f131097p);
        this.f131088g.setReactionClickListener(new ReactionBaseFlowLayout.AbstractC53049d() {
            /* class com.ss.android.lark.reaction.widget.flowlayout.$$Lambda$ReactionFlowLayout$UnRHKn3A9UNlrNDvoj1ANnhj2M */

            @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
            public final void onReactionClicked(String str) {
                ReactionFlowLayout.this.m205388a((ReactionFlowLayout) str);
            }
        });
        this.f131088g.setOnContributorClickNew(new C53054b());
        this.f131088g.setLayoutParams(layoutParams);
        this.f131088g.setShownNamesNumberLimit(this.f131099r);
        this.f131088g.setEnableLongClick(z);
        this.f131088g.setOnlyShowCount(z2);
        this.f131088g.setReactionData(list);
    }

    /* renamed from: a */
    private void m205389a(List<C53061a> list, boolean z, final boolean z2) {
        final View$OnLongClickListenerC530501 r5;
        LayoutInflater.from(getContext());
        if (z) {
            r5 = new View.OnLongClickListener() {
                /* class com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout.View$OnLongClickListenerC530501 */

                public boolean onLongClick(View view) {
                    return C52990a.m205240c(view);
                }
            };
        } else {
            r5 = null;
        }
        if (!CollectionUtils.isEmpty(list)) {
            Iterator<C53061a> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C53061a next = it.next();
                if (!C52986b.m205221e(next.f131133a)) {
                    C52986b.m205220d(next.f131133a);
                    break;
                }
            }
            this.f131076a.setVisibility(0);
            m205391c();
            this.f131076a.setAdapter(new AbstractC53059a<C53061a>(list) {
                /* class com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout.C530512 */

                /* renamed from: a */
                public View mo181205a(FlowLayout flowLayout, int i, final C53061a aVar) {
                    ReactionFlowView reactionFlowView;
                    if (z2) {
                        reactionFlowView = (NoNameReactionFlowView) C36443k.m143597a(flowLayout.getContext(), NoNameReactionFlowView.class.getName());
                        if (reactionFlowView == null) {
                            reactionFlowView = new NoNameReactionFlowView(flowLayout.getContext());
                        }
                    } else {
                        reactionFlowView = (ReactionFlowView) C36443k.m143597a(flowLayout.getContext(), ReactionFlowView.class.getName());
                        if (reactionFlowView == null) {
                            reactionFlowView = new ReactionFlowView(flowLayout.getContext());
                        }
                    }
                    reactionFlowView.setDisplayChangeEnable(ReactionFlowLayout.this.f131087f);
                    if (ReactionFlowLayout.this.f131090i != 0 && !z2) {
                        reactionFlowView.findViewById(R.id.vertical_split_reaction).setBackgroundColor(ReactionFlowLayout.this.f131090i);
                    }
                    View findViewById = reactionFlowView.findViewById(R.id.tag_container);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                    if (ReactionFlowLayout.this.f131089h != -1) {
                        layoutParams.height = ReactionFlowLayout.this.f131089h;
                    }
                    if (ReactionFlowLayout.this.f131092k != -1) {
                        layoutParams.topMargin = ReactionFlowLayout.this.f131092k;
                    }
                    if (ReactionFlowLayout.this.f131093l != -1) {
                        layoutParams.leftMargin = ReactionFlowLayout.this.f131093l;
                    }
                    findViewById.setLayoutParams(layoutParams);
                    if (ReactionFlowLayout.this.mo181185b()) {
                        findViewById.setPadding(ReactionFlowLayout.this.f131091j[0], ReactionFlowLayout.this.f131091j[1], ReactionFlowLayout.this.f131091j[2], ReactionFlowLayout.this.f131091j[3]);
                    }
                    findViewById.setBackground(ReactionFlowLayout.this.f131086e.getConstantState().newDrawable());
                    if (z2 || !(aVar.f131135c == null || aVar.f131135c.size() == 0)) {
                        reactionFlowView.setVisibility(0);
                        ImageView imageView = (ImageView) reactionFlowView.findViewById(R.id.image_reaction_icon);
                        ViewGroup viewGroup = (ViewGroup) reactionFlowView.findViewById(R.id.names_reaction_list);
                        C52977a.m205190a().mo180995a(imageView, aVar.f131133a);
                        C52990a.m205236b(imageView);
                        C530521 r1 = new AbstractView$OnClickListenerC52987a() {
                            /* class com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout.C530512.C530521 */

                            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52987a
                            /* renamed from: a */
                            public void mo181003a(View view) {
                                if (ReactionFlowLayout.this.f131077b != null) {
                                    ReactionFlowLayout.this.f131077b.onReactionClicked(aVar.f131133a);
                                }
                            }
                        };
                        imageView.setOnClickListener(r1);
                        if (z2) {
                            reactionFlowView.setOnClickListener(r1);
                        }
                        reactionFlowView.setOnLongClickListener(r5);
                        if (!z2) {
                            ReactionFlowLayout.this.mo181182a(viewGroup, aVar.f131135c, aVar.f131134b, aVar.f131133a);
                        } else {
                            ((TextView) reactionFlowView.findViewById(R.id.reaction_count)).setText(String.valueOf(aVar.f131134b));
                        }
                        return reactionFlowView;
                    }
                    reactionFlowView.setVisibility(8);
                    return reactionFlowView;
                }
            });
            this.f131076a.setOnLongClickListener(r5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m205386a(View view, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int a = C52990a.m205224a(view.getContext(), 5.0f);
        ViewGroup viewGroup = (ViewGroup) ((C53063b) view).getTagView();
        int a2 = C52990a.m205226a(viewGroup);
        int i7 = i - i2;
        if (a2 > i7 && i3 > 0 && (i4 = i7 - i3) > 0) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.names_reaction_list);
            int paddingLeft = ((i4 - a) - viewGroup2.getPaddingLeft()) - viewGroup2.getPaddingRight();
            int intValue = ((Integer) viewGroup2.getTag()).intValue();
            if (intValue <= 0) {
                return a2;
            }
            int childCount = viewGroup2.getChildCount();
            int i8 = childCount - 1;
            View childAt = viewGroup2.getChildAt(i8);
            int a3 = C52990a.m205226a(childAt);
            int i9 = paddingLeft - a3;
            C53062b bVar = null;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = i11;
                    break;
                }
                View childAt2 = viewGroup2.getChildAt(i10);
                C53062b bVar2 = (C53062b) childAt2.getTag();
                int a4 = C52990a.m205226a(childAt2);
                if (i9 < a4) {
                    bVar = bVar2;
                    break;
                }
                i9 -= a4;
                i10++;
                bVar = bVar2;
                i11 = i10;
            }
            int i12 = childCount - 2;
            if (i10 >= i12) {
                TextView textView = (TextView) viewGroup2.getChildAt(i12);
                if (textView != null) {
                    textView.setMaxWidth(i9 + a3);
                }
                i5 = 0;
                i6 = 1;
            } else if (bVar == null) {
                i12 = i10 - 1;
                i6 = i8 - (i12 + 1);
                i5 = intValue - ((i12 + 2) / 2);
            } else if (bVar.mo181233a()) {
                if (((float) i9) < ((TextView) viewGroup2.getChildAt(0)).getPaint().measureText("MM...")) {
                    i10 -= 2;
                } else {
                    TextView textView2 = (TextView) viewGroup2.getChildAt(i10);
                    if (textView2 != null) {
                        textView2.setMaxWidth(i9);
                    }
                }
                i6 = i8 - (i10 + 1);
                i5 = intValue - ((i10 + 2) / 2);
                i12 = i10;
            } else {
                i5 = 0;
                i12 = 0;
                i6 = 0;
            }
            viewGroup2.removeViews(i12 + 1, i6);
            if (i5 > 0) {
                ((TextView) childAt).setText(" " + C52990a.m205229a(view.getContext(), R.string.Lark_Legacy_PostReactionAppend, "count", Integer.toString(i5)));
                childAt.setVisibility(0);
            }
        }
        return a2;
    }
}
