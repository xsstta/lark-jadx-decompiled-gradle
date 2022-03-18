package com.ss.android.lark.message.card.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.p2267g.C45310a;
import com.ss.android.lark.message.card.view.richtext.C45345b;
import com.ss.android.lark.message.card.view.richtext.C45348d;
import com.ss.android.lark.message.card.view.richtext.NodeParams;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import java.util.Map;

/* renamed from: com.ss.android.lark.message.card.view.e */
public class C45335e {

    /* renamed from: a */
    public View f114778a;

    /* renamed from: b */
    private Context f114779b;

    /* renamed from: c */
    private CardContent f114780c;

    /* renamed from: a */
    public View mo160112a() {
        return this.f114778a;
    }

    /* renamed from: b */
    public BubbleStyle mo160113b() {
        return m180020a(this.f114779b, this.f114780c, this.f114778a.findViewById(R.id.header_container));
    }

    /* renamed from: c */
    private void m180023c() {
        NodeParams a = C45345b.m180068a(this.f114780c.getRichText(), this.f114780c.getCardVersion());
        View inflate = LayoutInflater.from(this.f114779b).inflate(R.layout.text_card_item, (ViewGroup) null, false);
        this.f114778a = inflate;
        LKUIRoundableLayout lKUIRoundableLayout = (LKUIRoundableLayout) inflate.findViewById(R.id.root);
        lKUIRoundableLayout.mo89662a(10.0f, 10.0f, 10.0f, 10.0f);
        lKUIRoundableLayout.setBorderWidth(0.5f);
        m180022a(this.f114779b, this.f114780c.getCardHeader(), (FrameLayout) this.f114778a.findViewById(R.id.header_container), false);
        m180021a(this.f114779b, (FrameLayout) this.f114778a.findViewById(R.id.layout_content), a, this.f114780c.getCardVersion());
        final View findViewById = this.f114778a.findViewById(R.id.mask_view);
        final ScrollView scrollView = (ScrollView) this.f114778a.findViewById(R.id.scroll_view);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.message.card.view.C45335e.ViewTreeObserver$OnGlobalLayoutListenerC453361 */

            public void onGlobalLayout() {
                if (scrollView.getMeasuredHeight() > UIHelper.dp2px(266.0f)) {
                    findViewById.setVisibility(0);
                    scrollView.getLayoutParams().height = UIHelper.dp2px(266.0f);
                }
                scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        scrollView.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.message.card.view.C45335e.View$OnTouchListenerC453372 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    public C45335e(Context context, CardContent cardContent) {
        this(context, cardContent, null);
        m180023c();
    }

    public C45335e(Context context, CardContent cardContent, View view) {
        this.f114779b = context;
        this.f114780c = cardContent;
        this.f114778a = view;
    }

    /* renamed from: a */
    public static BubbleStyle m180020a(Context context, CardContent cardContent, View view) {
        boolean z;
        BubbleStyle bubbleStyle;
        CardContent.CardHeader cardHeader = cardContent.getCardHeader();
        CardContent.Type type = cardContent.getType();
        if (cardContent.getCardVersion() == 1) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr = type == CardContent.Type.VCHAT ? new int[]{0, 0, 0, UIUtils.dp2px(context, 12.0f)} : new int[]{UIUtils.dp2px(context, 12.0f), UIUtils.dp2px(context, 12.0f), UIUtils.dp2px(context, 12.0f), UIUtils.dp2px(context, 12.0f)};
        if (z) {
            bubbleStyle = BubbleStyle.m131964a(10, view, iArr);
        } else {
            bubbleStyle = BubbleStyle.m131964a(12, view, iArr);
        }
        if (cardHeader != null) {
            String theme = cardHeader.getTheme();
            int i = 11;
            if (C45310a.f114712a.containsKey(theme)) {
                C45310a.C45311a aVar = C45310a.f114712a.get(theme);
                if (!z) {
                    i = aVar.f114713a;
                }
                bubbleStyle.mo126141a(i);
            } else {
                if (!TextUtils.isEmpty(theme)) {
                    Log.m165389i("CardMessagePreview", "msg card bubble style find unsupported theme=" + theme);
                }
                try {
                    Map<String, String> style = cardHeader.getStyle();
                    String str = style.get("startColor");
                    String str2 = style.get("endColor");
                    if (UDUiModeUtils.m93319a(context)) {
                        String str3 = style.get("startColorDarkMode");
                        String str4 = style.get("endColorDarkMode");
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            str = str3;
                            str2 = str4;
                        }
                    }
                    int parseColor = Color.parseColor(str);
                    int parseColor2 = Color.parseColor(str2);
                    if (!z) {
                        i = 13;
                    }
                    bubbleStyle.mo126141a(i);
                    bubbleStyle.mo126142a(parseColor, parseColor2);
                } catch (Exception e) {
                    Log.m165384e("CardMessagePreview", "process msg card heard failed", e);
                }
            }
        }
        return bubbleStyle;
    }

    /* renamed from: a */
    private void m180021a(Context context, FrameLayout frameLayout, NodeParams nodeParams, int i) {
        YogaLayout yogaLayout = new YogaLayout(context);
        YogaNode yogaNode = yogaLayout.getYogaNode();
        yogaNode.reset();
        yogaNode.setFlexDirection(YogaFlexDirection.COLUMN);
        yogaNode.setJustifyContent(YogaJustify.CENTER);
        yogaNode.setWidthPercent(100.0f);
        frameLayout.addView(yogaLayout);
        new C45348d(this.f114779b, null, i).mo160156a(yogaLayout, nodeParams, new C45338g());
    }

    /* renamed from: a */
    public static void m180022a(Context context, CardContent.CardHeader cardHeader, FrameLayout frameLayout, boolean z) {
        frameLayout.removeAllViews();
        if (cardHeader != null) {
            LinkEmojiTextView linkEmojiTextView = new LinkEmojiTextView(context);
            linkEmojiTextView.setPadding(0, 0, 0, UIHelper.dp2px(12.0f));
            linkEmojiTextView.setMaxLines(2);
            linkEmojiTextView.setLineSpacing((float) UIHelper.dp2px(4.0f), 1.0f);
            linkEmojiTextView.setEllipsize(TextUtils.TruncateAt.END);
            linkEmojiTextView.setTypeface(Typeface.defaultFromStyle(1));
            linkEmojiTextView.setText(cardHeader.getTitle());
            int i = 16;
            linkEmojiTextView.setGravity(16);
            int color = UIHelper.getColor(R.color.lkui_N900);
            Map<String, String> style = cardHeader.getStyle();
            if (!CollectionUtils.isEmpty(style)) {
                try {
                    color = C45345b.m180065a(style, "color");
                    i = Integer.valueOf(style.get("fontSize")).intValue();
                } catch (Exception e) {
                    Log.m165384e("CardMessagePreview", "parse header color or size failed", e);
                }
            } else {
                Log.m165397w("CardMessagePreview", "card header style is empty");
            }
            if (!z) {
                String theme = cardHeader.getTheme();
                if (C45310a.f114712a.containsKey(theme)) {
                    color = UIHelper.getColor(C45310a.f114712a.get(theme).f114715c);
                } else {
                    Log.m165389i("CardMessagePreview", "card header ig theme do not contain " + theme);
                }
            }
            linkEmojiTextView.setTextColor(color);
            C25649b.m91856a((TextView) linkEmojiTextView, i);
            frameLayout.addView(linkEmojiTextView, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
