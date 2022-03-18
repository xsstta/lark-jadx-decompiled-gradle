package com.ss.android.lark.mail.impl.view.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoreButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToFolderButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToImportantButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToLabelButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoveToOtherButton;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class OperationTitleBar extends ConstraintLayout {

    /* renamed from: a */
    public ActionDialog f111517a;

    /* renamed from: b */
    public AbstractC43958a f111518b;

    /* renamed from: c */
    Map<Class, Integer> f111519c;

    /* renamed from: d */
    private final String f111520d;

    /* renamed from: e */
    private final List<AbsButton> f111521e;

    /* renamed from: f */
    private C43959a f111522f;

    /* renamed from: g */
    private MoreButton f111523g;

    /* renamed from: h */
    private ImageView f111524h;

    /* renamed from: i */
    private TextView f111525i;

    /* renamed from: j */
    private LinearLayout f111526j;

    /* renamed from: k */
    private int f111527k;

    /* renamed from: l */
    private int f111528l;

    /* renamed from: m */
    private Type f111529m;

    public enum Type {
        Large,
        Normal
    }

    /* renamed from: com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar$a */
    public static abstract class AbstractC43958a {
        /* renamed from: a */
        public void mo150696a() {
        }
    }

    public MoreButton getMoreButton() {
        return this.f111523g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar$7 */
    public static /* synthetic */ class C439577 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111542a;

        /* renamed from: b */
        static final /* synthetic */ int[] f111543b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.ss.android.lark.mail.impl.view.titlebar.AbsButton$HintType[] r0 = com.ss.android.lark.mail.impl.view.titlebar.AbsButton.HintType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439577.f111543b = r0
                r1 = 1
                com.ss.android.lark.mail.impl.view.titlebar.AbsButton$HintType r2 = com.ss.android.lark.mail.impl.view.titlebar.AbsButton.HintType.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439577.f111543b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.view.titlebar.AbsButton$HintType r3 = com.ss.android.lark.mail.impl.view.titlebar.AbsButton.HintType.RedDot     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439577.f111543b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.view.titlebar.AbsButton$HintType r3 = com.ss.android.lark.mail.impl.view.titlebar.AbsButton.HintType.GrayDotWithText     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439577.f111543b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.view.titlebar.AbsButton$HintType r3 = com.ss.android.lark.mail.impl.view.titlebar.AbsButton.HintType.RedDotWithText     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar$Type[] r2 = com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.Type.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439577.f111542a = r2
                com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar$Type r3 = com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.Type.Large     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439577.f111542a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar$Type r2 = com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.Type.Normal     // Catch:{ NoSuchFieldError -> 0x004e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439577.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m174099b() {
        this.f111527k = getResources().getDimensionPixelSize(R.dimen.mail_operation_title_bar_button_size);
        this.f111528l = getResources().getDimensionPixelSize(R.dimen.mail_operation_title_bar_button_size);
        LayoutInflater.from(getContext()).inflate(R.layout.mail_operation_title_bar_layout, this);
        ImageView imageView = (ImageView) findViewById(R.id.operation_title_bar_back_button);
        this.f111524h = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.View$OnClickListenerC439566 */

            public void onClick(View view) {
                if (OperationTitleBar.this.f111518b != null) {
                    OperationTitleBar.this.f111518b.mo150696a();
                }
            }
        });
        this.f111525i = (TextView) findViewById(R.id.operation_title_bar_info);
        this.f111526j = (LinearLayout) findViewById(R.id.operation_title_bar_operation_button_container);
    }

    /* renamed from: a */
    private void m174097a() {
        C43959a aVar = this.f111522f;
        if (aVar == null || aVar.mo156427c()) {
            Log.m165383e("OperationTitleBar", "showActionDialog empty additional info");
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator<AbsButton> it = this.f111522f.mo156426b().iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            AbsButton next = it.next();
            if (next != null) {
                Class<?> cls = next.getClass();
                if (this.f111519c.containsKey(cls)) {
                    int intValue = this.f111519c.get(cls).intValue();
                    Integer num = (Integer) hashMap.get(Integer.valueOf(intValue));
                    Integer valueOf = Integer.valueOf(intValue);
                    if (num != null) {
                        i = 1 + num.intValue();
                    }
                    hashMap.put(valueOf, Integer.valueOf(i));
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num2 : hashMap.keySet()) {
            if (((Integer) hashMap.get(num2)).intValue() < 2) {
                hashMap.put(num2, null);
            } else {
                hashMap2.put(num2, true);
            }
        }
        for (final AbsButton absButton : this.f111522f.mo156426b()) {
            if (absButton != null) {
                C439522 r12 = new ActionDialog.ActionItem(absButton.getDrawableID(), absButton.getText(), absButton.getTintColorID()) {
                    /* class com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439522 */

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem
                    public void onClick(View view, ActionDialog actionDialog) {
                        absButton.onClick(view);
                        if (OperationTitleBar.this.f111517a != null) {
                            OperationTitleBar.this.f111517a.dismiss();
                        }
                    }
                };
                Class<?> cls2 = absButton.getClass();
                if (this.f111519c.containsKey(cls2)) {
                    int intValue2 = this.f111519c.get(cls2).intValue();
                    Integer num3 = (Integer) hashMap.get(Integer.valueOf(intValue2));
                    Boolean bool = (Boolean) hashMap2.get(Integer.valueOf(intValue2));
                    if (num3 != null && num3.intValue() > 0) {
                        if (bool.booleanValue()) {
                            r12.setDisplayType(ActionDialog.ActionItem.DisplayType.TOP_CIRCLE);
                            hashMap2.put(Integer.valueOf(intValue2), false);
                        } else if (num3.intValue() > 1) {
                            r12.setDisplayType(ActionDialog.ActionItem.DisplayType.SQUARE);
                        } else {
                            r12.setDisplayType(ActionDialog.ActionItem.DisplayType.BOTTOM_CIRCLE);
                        }
                        hashMap.put(Integer.valueOf(intValue2), Integer.valueOf(num3.intValue() - 1));
                    }
                }
                arrayList.add(r12);
            }
        }
        ActionDialog a = new ActionDialog.C43925a(getContext()).mo156363a(this.f111522f.mo156425a()).mo156365a(arrayList).mo156366a();
        this.f111517a = a;
        a.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m174098a(View view) {
        m174097a();
    }

    public void setListener(AbstractC43958a aVar) {
        this.f111518b = aVar;
    }

    public OperationTitleBar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo156417a(int i) {
        this.f111524h.setImageResource(i);
    }

    public void setInfoText(String str) {
        Log.m165389i("OperationTitleBar", "setInfoText");
        this.f111525i.setText(str);
    }

    /* renamed from: a */
    public void mo156418a(Type type) {
        Log.m165389i("OperationTitleBar", "updateType");
        this.f111529m = type;
        int i = C439577.f111542a[this.f111529m.ordinal()];
        if (i == 1) {
            this.f111527k = getResources().getDimensionPixelSize(R.dimen.mail_operation_title_bar_large_button_size);
            this.f111528l = getResources().getDimensionPixelSize(R.dimen.mail_operation_title_bar_large_button_size);
        } else if (i == 2) {
            this.f111527k = getResources().getDimensionPixelSize(R.dimen.mail_operation_title_bar_button_size);
            this.f111528l = getResources().getDimensionPixelSize(R.dimen.mail_operation_title_bar_button_size);
        }
    }

    private void setButtonList(List<AbsButton> list) {
        Log.m165389i("OperationTitleBar", "updateButtonList");
        this.f111521e.clear();
        if (!CollectionUtils.isEmpty(list)) {
            this.f111521e.addAll(list);
            LayoutInflater from = LayoutInflater.from(getContext());
            for (final AbsButton absButton : list) {
                final FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.mail_operation_title_bar_button_layout, (ViewGroup) null);
                if (absButton.getId() != 0) {
                    frameLayout.setId(absButton.getId());
                }
                final ImageView imageView = (ImageView) frameLayout.findViewById(R.id.operation_title_bar_button_icon);
                if (this.f111529m == Type.Large) {
                    absButton.setLargeImageResourceWithTint(getContext(), imageView);
                } else {
                    absButton.setImageResourceWithTint(getContext(), imageView);
                }
                View findViewById = frameLayout.findViewById(R.id.operation_title_bar_button_click_wrapper);
                if (absButton.isExtraActionSupported(AbsButton.ExtraAction.FastClick)) {
                    findViewById.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.View$OnClickListenerC439533 */

                        public void onClick(View view) {
                            if (frameLayout.isEnabled()) {
                                absButton.onClick(view);
                            }
                        }
                    });
                } else {
                    findViewById.setOnClickListener(new OnSingleClickListener() {
                        /* class com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439544 */

                        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                        public void onSingleClick(View view) {
                            if (frameLayout.isEnabled()) {
                                absButton.onClick(view);
                            }
                        }
                    });
                }
                int i = this.f111527k;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
                if (C26284k.m95186b(C41816b.m166115a().mo150132b())) {
                    frameLayout.setContentDescription(absButton.getClass().getSimpleName());
                }
                this.f111526j.addView(frameLayout, layoutParams);
                final View findViewById2 = frameLayout.findViewById(R.id.operation_title_bar_button_hint_dot);
                final TextView textView = (TextView) frameLayout.findViewById(R.id.operation_title_bar_button_hint_text);
                absButton.setController(new AbsButton.AbstractC43949b() {
                    /* class com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439555 */

                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43949b
                    /* renamed from: a */
                    public View mo154560a() {
                        Log.m165389i("OperationTitleBar", "getView");
                        return frameLayout;
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43949b
                    /* renamed from: a */
                    public void mo156412a(int i) {
                        Log.m165389i("OperationTitleBar", "updateIcon");
                        imageView.setImageResource(i);
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43949b
                    /* renamed from: b */
                    public void mo156415b(int i) {
                        Log.m165389i("OperationTitleBar", "updateTint");
                        imageView.setImageTintList(C0215a.m652a(OperationTitleBar.this.getContext(), i));
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43949b
                    /* renamed from: a */
                    public void mo156414a(boolean z) {
                        Log.m165389i("OperationTitleBar", "setEnable: " + z);
                        frameLayout.setEnabled(z);
                        imageView.setEnabled(z);
                    }

                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43949b
                    /* renamed from: a */
                    public void mo156413a(AbsButton.HintType hintType, String str) {
                        if (hintType != null) {
                            int i = C439577.f111543b[hintType.ordinal()];
                            if (i == 1) {
                                findViewById2.setVisibility(8);
                                textView.setVisibility(8);
                            } else if (i == 2) {
                                findViewById2.setVisibility(0);
                                textView.setVisibility(8);
                            } else if (i == 3) {
                                findViewById2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(str);
                                textView.setBackgroundResource(R.drawable.mail_operation_title_bar_button_hint_text_gray_background);
                            } else if (i != 4) {
                                Log.m165389i("OperationTitleBar", "setHint setHint to default");
                            } else {
                                findViewById2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(str);
                                textView.setBackgroundResource(R.drawable.mail_operation_title_bar_button_hint_text_red_background);
                            }
                        }
                    }
                });
            }
        }
    }

    public OperationTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0020 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Collection, java.util.List<com.ss.android.lark.mail.impl.view.titlebar.AbsButton>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* renamed from: a */
    public void mo156419a(List<AbsButton> list, C43959a aVar) {
        Log.m165389i("OperationTitleBar", "updateButtonList");
        this.f111526j.removeAllViews();
        if (!CollectionUtils.isEmpty((Collection) list) || (aVar != null && !aVar.mo156427c())) {
            if (list == 0) {
                list = new ArrayList<>();
            }
            if (aVar != null && !aVar.mo156427c()) {
                MoreButton moreButton = new MoreButton(new AbsButton.AbstractC43948a() {
                    /* class com.ss.android.lark.mail.impl.view.titlebar.$$Lambda$OperationTitleBar$VhLrqyipnUJcDJCLaJVe0KJqN6U */

                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                    public final void onButtonClick(View view) {
                        OperationTitleBar.this.m174098a((OperationTitleBar) view);
                    }
                });
                this.f111523g = moreButton;
                list.add(moreButton);
            }
            setButtonList(list);
            this.f111522f = aVar;
            return;
        }
        Log.m165383e("OperationTitleBar", "updateButtonList no valid content");
    }

    public OperationTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f111520d = "OperationTitleBar";
        this.f111521e = new ArrayList();
        this.f111529m = Type.Normal;
        this.f111519c = new HashMap<Class, Integer>() {
            /* class com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.C439511 */

            {
                put(MoveToImportantButton.class, 0);
                put(MoveToOtherButton.class, 0);
                put(MoveToFolderButton.class, 0);
                put(MoveToLabelButton.class, 0);
            }
        };
        m174099b();
    }
}
