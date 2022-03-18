package com.ss.android.lark.message.card.view.richtext;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.android.YogaLayout;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.navigation.LKUISearchView;
import com.larksuite.component.ui.p1153e.C25652a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.flyfish.FlyFishYogaLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.aj;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.impl.PerfLoadPicMonitor;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.message.card.component.CardCalendarDialogFactory;
import com.ss.android.lark.message.card.p2264d.C45302a;
import com.ss.android.lark.message.card.p2264d.C45304b;
import com.ss.android.lark.message.card.p2266f.C45309a;
import com.ss.android.lark.message.card.view.C45338g;
import com.ss.android.lark.message.card.view.richtext.C45348d;
import com.ss.android.lark.message.card.view.richtext.MsgCardRoundedYogaLayout;
import com.ss.android.lark.message.card.view.richtext.RichTextStyle;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.C58475b;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.light.listener.IAbbreviationClickListener;
import com.ss.android.lark.widget.light.listener.IAtSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IUrlSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.DuplicateEnterChecker;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.EmojiconInfo;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.lark.widget.span.SpanInfo;
import com.ss.android.lark.widget.span.TextStyleInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.message.card.view.richtext.d */
public class C45348d {

    /* renamed from: a */
    public final Context f114834a;

    /* renamed from: b */
    public final String f114835b;

    /* renamed from: c */
    public final String f114836c;

    /* renamed from: d */
    public AbstractC45365h f114837d;

    /* renamed from: e */
    public AbstractC45373j f114838e;

    /* renamed from: f */
    public AbstractC45359b f114839f;

    /* renamed from: g */
    public AbstractC45363f f114840g;

    /* renamed from: h */
    public AbstractC45358a f114841h;

    /* renamed from: i */
    public AbstractC45362e f114842i;

    /* renamed from: j */
    public AbstractC45361d f114843j;

    /* renamed from: k */
    public AbstractC45364g f114844k;

    /* renamed from: l */
    public final ListenerParams.RequestListener f114845l;

    /* renamed from: m */
    public Scene f114846m;

    /* renamed from: n */
    private final float f114847n;

    /* renamed from: o */
    private final float f114848o;

    /* renamed from: p */
    private final int f114849p;

    /* renamed from: q */
    private String f114850q;

    /* renamed from: r */
    private C45375h f114851r;

    /* renamed from: s */
    private int f114852s;

    /* renamed from: t */
    private boolean f114853t;

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$a */
    public interface AbstractC45358a {
        /* renamed from: a */
        void mo160184a(View view, AbbreviationInfo abbreviationInfo, float f, float f2);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$b */
    public interface AbstractC45359b {
        /* renamed from: a */
        void mo160102a(View view, String str, String str2);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$d */
    public interface AbstractC45361d {
        /* renamed from: a */
        void mo160106a(View view, Image image);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$e */
    public interface AbstractC45362e {
        /* renamed from: a */
        void mo160104a(View view, String str, String str2, RichTextElement.LinkProperty.Source source);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$f */
    public interface AbstractC45363f {
        /* renamed from: a */
        void mo160103a(View view, String str, String str2, boolean z, String str3);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$g */
    public interface AbstractC45364g {
        /* renamed from: a */
        void mo160107a(View view);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$h */
    public interface AbstractC45365h {
        /* renamed from: a */
        void mo160098a(String str, Map<String, String> map);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$j */
    public interface AbstractC45373j {
        /* renamed from: a */
        void mo160099a(View view, String str);

        /* renamed from: b */
        boolean mo160100b(View view, String str);
    }

    /* renamed from: b */
    private boolean m180131b(boolean z, boolean z2) {
        return z || z2;
    }

    public static /* synthetic */ void lambda$AwR6ZkVZxh4tgQJrOlZShz7XCaw(C45348d dVar, String str, RichTextElement.DateTimePickerProperty dateTimePickerProperty, RoundedTextWithImage roundedTextWithImage, String str2, long j) {
        dVar.m180124a(str, dateTimePickerProperty, roundedTextWithImage, str2, j);
    }

    public static /* synthetic */ void lambda$WX0FgpwmAAseNaZLVEdUHXnvJCs(C45348d dVar, String str, RichTextElement.TimePickerProperty timePickerProperty, RoundedTextWithImage roundedTextWithImage, String str2, long j) {
        dVar.m180125a(str, timePickerProperty, roundedTextWithImage, str2, j);
    }

    public static /* synthetic */ void lambda$fD_rH7bMEitz_AF8UQUNLaJnqM8(C45348d dVar, RichTextElement.OverflowMenuProperty overflowMenuProperty, RoundedTextWithImage roundedTextWithImage, int i) {
        dVar.m180121a(overflowMenuProperty, roundedTextWithImage, i);
    }

    public static /* synthetic */ void lambda$v4Dg2MoQnIZyJa9LqT2JD_Cms4k(C45348d dVar, RichTextElement.OverflowMenuProperty overflowMenuProperty, RoundedTextWithImage roundedTextWithImage, View view) {
        dVar.m180122a(overflowMenuProperty, roundedTextWithImage, view);
    }

    /* renamed from: b */
    private boolean m180130b() {
        return this.f114853t;
    }

    /* renamed from: a */
    public void mo160166a(boolean z) {
        this.f114853t = z;
    }

    /* renamed from: a */
    public void mo160163a(AbstractC45365h hVar) {
        this.f114837d = hVar;
    }

    /* renamed from: a */
    public void mo160164a(AbstractC45373j jVar) {
        this.f114838e = jVar;
    }

    /* renamed from: a */
    public void mo160158a(AbstractC45359b bVar) {
        this.f114839f = bVar;
    }

    /* renamed from: a */
    public void mo160161a(AbstractC45363f fVar) {
        this.f114840g = fVar;
    }

    /* renamed from: a */
    public void mo160160a(AbstractC45362e eVar) {
        this.f114842i = eVar;
    }

    /* renamed from: a */
    public void mo160159a(AbstractC45361d dVar) {
        this.f114843j = dVar;
    }

    /* renamed from: a */
    public void mo160162a(AbstractC45364g gVar) {
        this.f114844k = gVar;
    }

    /* renamed from: a */
    public void mo160156a(YogaLayout yogaLayout, NodeParams nodeParams, C45338g gVar) {
        if (nodeParams == null || yogaLayout == null) {
            C45302a.m179899a(C45304b.f114695a).addTag("RichTextRender").flush();
            return;
        }
        List<NodeParams> list = nodeParams.mChildParams;
        if (CollectionUtils.isEmpty(list)) {
            C45302a.m179899a(C45304b.f114696b).addTag("RichTextRender").flush();
            return;
        }
        YogaLayoutHolder fVar = new YogaLayoutHolder(this.f114834a, m180130b());
        fVar.mo160204a(yogaLayout);
        for (NodeParams nodeParams2 : list) {
            m180117a(fVar, nodeParams2, gVar);
        }
    }

    /* renamed from: a */
    private void m180117a(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        if (nodeParams == null || nodeParams.mRichTextTag == null) {
            OPMonitor addTag = C45302a.m179899a(C45304b.f114697c).addTag("RichTextRender");
            if (nodeParams == null) {
                addTag.setErrorMessage("node params is null");
            } else {
                addTag.setErrorMessage("rich text tag is null");
            }
            addTag.flush();
            return;
        }
        boolean a = C45294c.m179871a().mo143899a("lark.card.message.lightview");
        switch (AnonymousClass22.f114876a[nodeParams.mRichTextTag.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (a) {
                    m180132c(fVar, nodeParams);
                    return;
                } else {
                    m180127b(fVar, nodeParams);
                    return;
                }
            case 8:
                m180134d(fVar, nodeParams);
                return;
            case 9:
                m180138f(fVar, nodeParams);
                return;
            case 10:
                if (a) {
                    m180129b(fVar, nodeParams.mChildParams, nodeParams);
                    return;
                } else {
                    m180118a(fVar, nodeParams.mChildParams, nodeParams);
                    return;
                }
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
                m180141h(fVar, nodeParams, gVar);
                return;
            case 13:
                m180116a(fVar, nodeParams);
                return;
            case 14:
                m180140g(fVar, nodeParams, gVar);
                return;
            case 15:
                m180142i(fVar, nodeParams, gVar);
                return;
            case 16:
                m180139f(fVar, nodeParams, gVar);
                return;
            case 17:
                m180137e(fVar, nodeParams, gVar);
                return;
            case 18:
                m180135d(fVar, nodeParams, gVar);
                return;
            case 19:
                m180133c(fVar, nodeParams, gVar);
                return;
            case 20:
                m180128b(fVar, nodeParams, gVar);
                return;
            case 21:
                m180136e(fVar, nodeParams);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m180108a(long j, String str, RichTextElement.DateTimePickerProperty dateTimePickerProperty, RoundedTextWithImage roundedTextWithImage, View view) {
        if (j == -1) {
            j = System.currentTimeMillis();
        }
        ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) new CardCalendarDialogFactory.C45298a(this.f114834a).controller(new CardCalendarDialogFactory.View$OnClickListenerC45299b(this.f114834a))).headerLayoutRes(R.layout.card_calendar_header)).contentLayoutRes(R.layout.card_calendar_content)).footerLayoutRes(R.layout.card_calendar_footer)).gravity(80)).mo160047a(j).mo160048a(CardCalendarDialogFactory.CardCalendarType.DateTime).mo160049a(new CardCalendarDialogFactory.AbstractC45300c(str, dateTimePickerProperty, roundedTextWithImage) {
            /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$AwR6ZkVZxh4tgQJrOlZShz7XCaw */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ RichTextElement.DateTimePickerProperty f$2;
            public final /* synthetic */ RoundedTextWithImage f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.message.card.component.CardCalendarDialogFactory.AbstractC45300c
            public final void onTimeSelected(String str, long j) {
                C45348d.lambda$AwR6ZkVZxh4tgQJrOlZShz7XCaw(C45348d.this, this.f$1, this.f$2, this.f$3, str, j);
            }
        }).show();
    }

    /* renamed from: a */
    private /* synthetic */ void m180124a(String str, RichTextElement.DateTimePickerProperty dateTimePickerProperty, RoundedTextWithImage roundedTextWithImage, String str2, long j) {
        C45309a.m179927a(this.f114836c, "interaction");
        String a = C45345b.m180070a(str, j);
        Log.m165379d("RichTextRender", "DatePicker, selected dateValue: " + str2 + ", dateInMillis: " + j + ", dateText: " + a);
        HashMap hashMap = new HashMap();
        hashMap.put("selected_option", str2);
        hashMap.put("timezone", TimeZone.getDefault().getID());
        mo160165a(dateTimePickerProperty.getConfirm(), roundedTextWithImage, dateTimePickerProperty.getActionId(), hashMap, a);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m180109a(long j, String str, RichTextElement.TimePickerProperty timePickerProperty, RoundedTextWithImage roundedTextWithImage, View view) {
        if (j == -1) {
            j = System.currentTimeMillis();
        }
        ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) new CardCalendarDialogFactory.C45298a(this.f114834a).controller(new CardCalendarDialogFactory.View$OnClickListenerC45299b(this.f114834a))).headerLayoutRes(R.layout.card_calendar_header)).contentLayoutRes(R.layout.card_calendar_content)).footerLayoutRes(R.layout.card_calendar_footer)).gravity(80)).mo160047a(j).mo160048a(CardCalendarDialogFactory.CardCalendarType.Time).mo160049a(new CardCalendarDialogFactory.AbstractC45300c(str, timePickerProperty, roundedTextWithImage) {
            /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$WX0FgpwmAAseNaZLVEdUHXnvJCs */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ RichTextElement.TimePickerProperty f$2;
            public final /* synthetic */ RoundedTextWithImage f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.message.card.component.CardCalendarDialogFactory.AbstractC45300c
            public final void onTimeSelected(String str, long j) {
                C45348d.lambda$WX0FgpwmAAseNaZLVEdUHXnvJCs(C45348d.this, this.f$1, this.f$2, this.f$3, str, j);
            }
        }).show();
    }

    /* renamed from: a */
    private /* synthetic */ void m180125a(String str, RichTextElement.TimePickerProperty timePickerProperty, RoundedTextWithImage roundedTextWithImage, String str2, long j) {
        C45309a.m179927a(this.f114836c, "interaction");
        String a = C45345b.m180070a(str, j);
        Log.m165379d("RichTextRender", "DatePicker, selected dateValue: " + str2 + ", dateInMillis: " + j + ", dateText: " + a);
        HashMap hashMap = new HashMap();
        hashMap.put("selected_option", str2);
        hashMap.put("timezone", TimeZone.getDefault().getID());
        mo160165a(timePickerProperty.getConfirm(), roundedTextWithImage, timePickerProperty.getActionId(), hashMap, a);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m180107a(long j, String str, RichTextElement.DatePickerProperty datePickerProperty, RoundedTextWithImage roundedTextWithImage, View view) {
        if (!C45344a.m180061a(view)) {
            if (j == -1) {
                j = System.currentTimeMillis();
            }
            ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) ((CardCalendarDialogFactory.C45298a) new CardCalendarDialogFactory.C45298a(this.f114834a).controller(new CardCalendarDialogFactory.View$OnClickListenerC45299b(this.f114834a))).headerLayoutRes(R.layout.card_calendar_header)).contentLayoutRes(R.layout.card_calendar_content)).footerLayoutRes(R.layout.card_calendar_footer)).gravity(80)).mo160047a(j).mo160048a(CardCalendarDialogFactory.CardCalendarType.Date).mo160049a(new CardCalendarDialogFactory.AbstractC45300c(str, datePickerProperty, roundedTextWithImage) {
                /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$6zqPs3K16lKC3sjaXkp340hvits */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ RichTextElement.DatePickerProperty f$2;
                public final /* synthetic */ RoundedTextWithImage f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.lark.message.card.component.CardCalendarDialogFactory.AbstractC45300c
                public final void onTimeSelected(String str, long j) {
                    C45348d.lambda$6zqPs3K16lKC3sjaXkp340hvits(C45348d.this, this.f$1, this.f$2, this.f$3, str, j);
                }
            }).show();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m180123a(String str, RichTextElement.DatePickerProperty datePickerProperty, RoundedTextWithImage roundedTextWithImage, String str2, long j) {
        C45309a.m179927a(this.f114836c, "interaction");
        String a = C45345b.m180070a(str, j);
        Log.m165379d("RichTextRender", "DatePicker, selected dateValue: " + str2 + ", dateInMillis: " + j + ", dateText: " + a);
        HashMap hashMap = new HashMap();
        hashMap.put("selected_option", str2);
        hashMap.put("timezone", TimeZone.getDefault().getID());
        mo160165a(datePickerProperty.getConfirm(), roundedTextWithImage, datePickerProperty.getActionId(), hashMap, a);
    }

    /* renamed from: a */
    private /* synthetic */ void m180122a(RichTextElement.OverflowMenuProperty overflowMenuProperty, RoundedTextWithImage roundedTextWithImage, View view) {
        if (!C45344a.m180061a(view)) {
            List<RichTextElement.MenuOption> options = overflowMenuProperty.getOptions();
            if (!CollectionUtils.isEmpty(options)) {
                String[] strArr = new String[options.size()];
                for (int i = 0; i < options.size(); i++) {
                    strArr[i] = options.get(i).getText();
                }
                ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(this.f114834a).mo90870a(Arrays.asList(strArr))).mo90869a(new UDListDialogController.OnItemClickListener(overflowMenuProperty, roundedTextWithImage) {
                    /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$fD_rH7bMEitz_AF8UQUNLaJnqM8 */
                    public final /* synthetic */ RichTextElement.OverflowMenuProperty f$1;
                    public final /* synthetic */ RoundedTextWithImage f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                    public final void onItemClick(int i) {
                        C45348d.lambda$fD_rH7bMEitz_AF8UQUNLaJnqM8(C45348d.this, this.f$1, this.f$2, i);
                    }
                })).addActionButton(R.id.ud_dialog_btn_cancel, this.f114834a.getText(R.string.Lark_Legacy_MsgCardCancel), (DialogInterface.OnClickListener) null)).show();
            }
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m180121a(RichTextElement.OverflowMenuProperty overflowMenuProperty, RoundedTextWithImage roundedTextWithImage, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("selected_option", overflowMenuProperty.getOptions().get(i).getValue());
        mo160165a(overflowMenuProperty.getConfirm(), roundedTextWithImage, overflowMenuProperty.getOptions().get(i).getOptionActionId(), hashMap, (String) null);
    }

    /* renamed from: a */
    private void m180116a(YogaLayoutHolder fVar, NodeParams nodeParams) {
        TextView textView = new TextView(this.f114834a);
        textView.setText(m180106a((RichTextElement.TimeProperty) nodeParams.mRichTextProperty));
        fVar.mo160203a(textView);
        YogaNode b = fVar.mo160207b(textView);
        m180111a(textView, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
        if (nodeParams.mBgColor != 0) {
            textView.setBackgroundColor(nodeParams.mBgColor);
        }
        if (nodeParams.mTextColor != 0) {
            textView.setTextColor(nodeParams.mTextColor);
        }
        textView.setTypeface(textView.getTypeface(), nodeParams.mFontStyleAndWeight);
        if (nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED) {
            textView.setTextSize(nodeParams.mTextSize);
        }
        textView.setLineSpacing(this.f114847n, 1.0f);
    }

    /* renamed from: a */
    private void m180118a(YogaLayoutHolder fVar, List<NodeParams> list, NodeParams nodeParams) {
        LinkEmojiTextView linkEmojiTextView = (MsgCardLinkEmojiTextView) C36443k.m143597a(this.f114834a, MsgCardLinkEmojiTextView.class.getName());
        if (linkEmojiTextView == null) {
            linkEmojiTextView = new MsgCardLinkEmojiTextView(this.f114834a);
        }
        linkEmojiTextView.setTranslateEmojiCode(false);
        linkEmojiTextView.setCurrentUserId(C45294c.m179871a().mo143901b());
        fVar.mo160203a(linkEmojiTextView);
        YogaNode b = fVar.mo160207b(linkEmojiTextView);
        m180111a(linkEmojiTextView, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
        if (nodeParams.mBgColor != 0) {
            linkEmojiTextView.setBackgroundColor(nodeParams.mBgColor);
        }
        if (nodeParams.mTextColor != 0) {
            linkEmojiTextView.setTextColor(nodeParams.mTextColor);
        }
        m180115a(nodeParams, linkEmojiTextView);
        RichTextElement.TextableAreaProperty textableAreaProperty = (RichTextElement.TextableAreaProperty) nodeParams.mRichTextProperty;
        if (textableAreaProperty.getNumberOfLines() > 0) {
            linkEmojiTextView.setMaxLines(textableAreaProperty.getNumberOfLines());
            if (textableAreaProperty.getNumberOfLines() == 1) {
                linkEmojiTextView.setSingleLine();
            }
        } else if (nodeParams.mParents.mRichTextTag == RichTextElement.RichTextTag.BUTTON) {
            linkEmojiTextView.setSingleLine();
        }
        linkEmojiTextView.setEllipsize(TextUtils.TruncateAt.END);
        linkEmojiTextView.setTypeface(linkEmojiTextView.getTypeface(), nodeParams.mFontStyleAndWeight);
        if (nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED) {
            linkEmojiTextView.setTextSize(nodeParams.mTextSize);
        }
        linkEmojiTextView.setLineSpacing(this.f114847n, 1.0f);
        List<NodeParams> list2 = nodeParams.mChildParams;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (CollectionUtils.isNotEmpty(list)) {
            for (NodeParams nodeParams2 : list2) {
                m180110a(this.f114834a, arrayList, arrayList2, arrayList3, arrayList4, sb, nodeParams2);
            }
            RecogniseSpansResult a = new RecogniseSpansResult.C59147a().mo201042a(arrayList2).mo201044b(arrayList).mo201047e(arrayList3).mo201056n(arrayList4).mo201043a();
            m180120a(linkEmojiTextView);
            linkEmojiTextView.mo198365a(sb.toString(), a);
        }
    }

    /* renamed from: a */
    private void m180113a(MsgCardRoundedYogaLayout msgCardRoundedYogaLayout, NodeParams nodeParams, YogaNode yogaNode) {
        Context context = msgCardRoundedYogaLayout.getContext();
        MsgCardRoundedYogaLayout.C45342a aVar = new MsgCardRoundedYogaLayout.C45342a();
        yogaNode.setHeight((float) UIUtils.dp2px(context, 36.0f));
        aVar.mo160137e(UIUtils.dp2px(context, 1.0f));
        aVar.mo160132a((float) UIUtils.dp2px(context, 6.0f));
        Map<String, String> map = nodeParams.mExtraProperties;
        RichTextElement.ButtonProperty buttonProperty = (RichTextElement.ButtonProperty) nodeParams.mRichTextProperty;
        if (buttonProperty != null && TextUtils.equals(buttonProperty.getMode(), "link")) {
            yogaNode.setHeight((float) UIUtils.dp2px(context, 22.0f));
        }
        if (map == null || map.isEmpty()) {
            msgCardRoundedYogaLayout.setCustomizations(aVar);
            return;
        }
        if (map.get("backgroundColor") != null) {
            aVar.mo160133a(C45345b.m180065a(map, "backgroundColor"));
        }
        if (map.get("backgroundColorDisable") != null) {
            aVar.mo160135c(C45345b.m180065a(map, "backgroundColorDisable"));
        }
        if (map.get("backgroundColorActive") != null) {
            aVar.mo160134b(C45345b.m180065a(map, "backgroundColorActive"));
        }
        if (map.get("borderColor") != null) {
            String mode = buttonProperty.getMode();
            int color = UIUtils.getColor(this.f114834a, R.color.line_border_component);
            if (RichTextStyle.ButtonMode.MODE_PRIMARY.getMode().equals(mode)) {
                color = UIUtils.getColor(this.f114834a, R.color.primary_pri_500);
            } else if (RichTextStyle.ButtonMode.MODE_DANGER.getMode().equals(mode)) {
                color = UIUtils.getColor(this.f114834a, R.color.function_danger_500);
            }
            Log.m165379d("RichTextRender", "rounded layout border styles=" + map + " color=" + String.format("#%08X", Integer.valueOf(color & -1)));
            aVar.mo160136d(color);
            if (buttonProperty.isShowLoadingIcon() || buttonProperty.isDisable()) {
                int argb = Color.argb(153, Color.red(color), Color.green(color), Color.blue(color));
                aVar.mo160136d(argb);
                Log.m165379d("RichTextRender", "rounded layout border dark color=" + String.format("#%08X", Integer.valueOf(argb & -1)));
            }
        }
        msgCardRoundedYogaLayout.setCustomizations(aVar);
    }

    /* renamed from: a */
    private void m180112a(MsgCardRoundedYogaLayout msgCardRoundedYogaLayout, NodeParams nodeParams) {
        if (msgCardRoundedYogaLayout != null && nodeParams != null) {
            MsgCardRoundedYogaLayout.C45342a aVar = new MsgCardRoundedYogaLayout.C45342a();
            aVar.mo160137e(UIUtils.dp2px(this.f114834a, 1.0f));
            aVar.mo160132a((float) UIUtils.dp2px(this.f114834a, 6.0f));
            Map<String, String> map = nodeParams.mExtraProperties;
            if (map != null && !map.isEmpty()) {
                if (map.get("backgroundColor") != null) {
                    aVar.mo160133a(C45345b.m180065a(map, "backgroundColor"));
                }
                if (map.get("backgroundColorDisable") != null) {
                    aVar.mo160135c(C45345b.m180065a(map, "backgroundColorDisable"));
                }
                if (map.get("backgroundColorActive") != null) {
                    aVar.mo160134b(C45345b.m180065a(map, "backgroundColorActive"));
                }
                if (map.get("borderColor") != null) {
                    int a = C45345b.m180065a(map, "borderColor");
                    Log.m165379d("RichTextRender", "rounded layout border styles=" + map + " color=" + String.format("#%08X", Integer.valueOf(a & -1)));
                    aVar.mo160136d(a);
                    if (nodeParams.mRichTextProperty instanceof RichTextElement.ButtonProperty) {
                        RichTextElement.ButtonProperty buttonProperty = (RichTextElement.ButtonProperty) nodeParams.mRichTextProperty;
                        if ((buttonProperty.isShowLoadingIcon() || buttonProperty.isDisable()) && !RichTextStyle.ButtonMode.MODE_DEFAULT.getMode().equals(buttonProperty.getMode())) {
                            int argb = Color.argb(153, Color.red(a), Color.green(a), Color.blue(a));
                            aVar.mo160136d(argb);
                            Log.m165379d("RichTextRender", "rounded layout border dark color=" + String.format("#%08X", Integer.valueOf(argb & -1)));
                        }
                    }
                }
                msgCardRoundedYogaLayout.setCustomizations(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo160165a(RichTextElement.ConfirmProperty confirmProperty, final MsgCardRoundedYogaLayout msgCardRoundedYogaLayout, final String str, final Map<String, String> map, final String str2) {
        if (confirmProperty != null) {
            Log.m165378d("show confirm, actionId: " + str);
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(msgCardRoundedYogaLayout.getContext()).titleBold(true)).title(confirmProperty.getTitle())).message(confirmProperty.getText())).addActionButton(R.id.ud_dialog_btn_secondary, this.f114834a.getText(R.string.Lark_Legacy_Cancel), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass11 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m165378d("alert cancel, actionId: " + str);
                }
            })).addActionButton(R.id.ud_dialog_btn_primary, this.f114834a.getText(R.string.Lark_Legacy_Confirm), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass10 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (C45348d.this.f114837d != null) {
                        if (str2 != null) {
                            msgCardRoundedYogaLayout.mo160124a();
                            ((RoundedTextWithImage) msgCardRoundedYogaLayout).mo160144b(str2, true);
                        }
                        C45348d.this.f114837d.mo160098a(str, map);
                    }
                }
            })).cancelOnTouchOutside(false)).show();
        } else if (this.f114837d != null) {
            if (str2 != null) {
                msgCardRoundedYogaLayout.mo160124a();
                ((RoundedTextWithImage) msgCardRoundedYogaLayout).mo160144b(str2, true);
            }
            this.f114837d.mo160098a(str, map);
        }
    }

    /* renamed from: a */
    static String m180106a(RichTextElement.TimeProperty timeProperty) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timeProperty.getFormat().replace('d', 'E').replace('D', 'd').replaceAll("GMT", "z"), C45294c.m179871a().mo143904e());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date(timeProperty.getMillisecondSince1970()));
    }

    /* renamed from: a */
    static void m180110a(Context context, List<AtInfo> list, List<UrlInfo> list2, List<TextStyleInfo> list3, List<EmojiconInfo> list4, StringBuilder sb, NodeParams nodeParams) {
        if (nodeParams.mRichTextTag != null) {
            NodeParams nodeParams2 = nodeParams.mParents;
            if (!(nodeParams2 == null || nodeParams2.mRichTextTag != RichTextElement.RichTextTag.TEXTABLEAREA || nodeParams2.mExtraProperties == null)) {
                nodeParams.mFontStyleAndWeight |= nodeParams2.mFontStyleAndWeight;
                String str = nodeParams2.mExtraProperties.get("textDecoration");
                if (!C57782ag.m224241a(str)) {
                    if (nodeParams.mExtraProperties == null) {
                        nodeParams.mExtraProperties = new HashMap();
                        nodeParams.mExtraProperties.put("textDecoration", str);
                    } else {
                        String str2 = nodeParams.mExtraProperties.get("textDecoration");
                        if (C57782ag.m224241a(str2) || str.equals(str2)) {
                            nodeParams.mExtraProperties.put("textDecoration", str);
                        } else {
                            nodeParams.mExtraProperties.put("textDecoration", "lineThrough");
                        }
                    }
                }
            }
            int i = AnonymousClass22.f114876a[nodeParams.mRichTextTag.ordinal()];
            if (i == 10) {
                for (NodeParams nodeParams3 : nodeParams.mChildParams) {
                    m180110a(context, list, list2, list3, list4, sb, nodeParams3);
                }
            } else if (i != 13) {
                switch (i) {
                    case 1:
                        RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) nodeParams.mRichTextProperty;
                        list2.add(m180105a(context, sb, nodeParams, anchorProperty));
                        sb.append(anchorProperty.getContent());
                        return;
                    case 2:
                        RichTextElement.AtProperty atProperty = (RichTextElement.AtProperty) nodeParams.mRichTextProperty;
                        String b = C57814c.m224350b(atProperty.getUserId(), atProperty.getAtContent());
                        list.add(m180099a(context, atProperty, b, sb, nodeParams));
                        sb.append(b);
                        return;
                    case 3:
                        RichTextElement.EmotionProperty emotionProperty = (RichTextElement.EmotionProperty) nodeParams.mRichTextProperty;
                        String b2 = EmojiHandler.m226949b(emotionProperty.getKey());
                        EmojiconInfo a = m180100a(emotionProperty, b2, sb);
                        if (a != null) {
                            list4.add(a);
                        }
                        sb.append(b2);
                        return;
                    case 4:
                        RichTextElement.ItalicProperty italicProperty = (RichTextElement.ItalicProperty) nodeParams.mRichTextProperty;
                        list3.add(m180102a(context, sb, nodeParams, italicProperty));
                        sb.append(italicProperty.getContent());
                        return;
                    case 5:
                        RichTextElement.BoldProperty boldProperty = (RichTextElement.BoldProperty) nodeParams.mRichTextProperty;
                        list3.add(m180101a(context, sb, nodeParams, boldProperty));
                        sb.append(boldProperty.getContent());
                        return;
                    case 6:
                        RichTextElement.UnderlineProperty underlineProperty = (RichTextElement.UnderlineProperty) nodeParams.mRichTextProperty;
                        list3.add(m180104a(context, sb, nodeParams, underlineProperty));
                        sb.append(underlineProperty.getContent());
                        return;
                    case 7:
                        RichTextElement.TextProperty textProperty = (RichTextElement.TextProperty) nodeParams.mRichTextProperty;
                        list3.add(m180103a(context, sb, nodeParams, textProperty));
                        sb.append(textProperty.getContent());
                        return;
                    default:
                        return;
                }
            } else {
                sb.append(m180106a((RichTextElement.TimeProperty) nodeParams.mRichTextProperty));
            }
        }
    }

    /* renamed from: a */
    private void m180119a(LKUILightTextView lKUILightTextView) {
        lKUILightTextView.setUrlSpanClickListener(new IUrlSpanClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass13 */

            @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
            public void a_(View view, String str) {
                if (C45348d.this.f114838e != null) {
                    C45348d.this.f114838e.mo160099a(view, str);
                }
            }

            @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
            public boolean b_(View view, String str) {
                if (C45348d.this.f114838e != null) {
                    return C45348d.this.f114838e.mo160100b(view, str);
                }
                return true;
            }
        });
        lKUILightTextView.setAtSpanClickListener(new IAtSpanClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass14 */

            /* renamed from: b */
            private DuplicateEnterChecker f114865b = new DuplicateEnterChecker();

            @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
            /* renamed from: b */
            public boolean mo122871b(View view, String str, String str2) {
                return true;
            }

            @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
            /* renamed from: a */
            public void mo122870a(View view, String str, String str2) {
                if (!this.f114865b.mo198450a() && C45348d.this.f114839f != null) {
                    C45348d.this.f114839f.mo160102a(view, str, str2);
                }
            }
        });
        lKUILightTextView.setMentionSpanClickListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass15 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                if (C45348d.this.f114840g != null) {
                    C45348d.this.f114840g.mo160103a(view, str, str2, z, str3);
                }
            }
        });
        lKUILightTextView.setAbbreviationClickListener(new IAbbreviationClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass16 */

            @Override // com.ss.android.lark.widget.light.listener.IAbbreviationClickListener
            public void onAbbreviationClick(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                if (C45348d.this.f114841h != null) {
                    C45348d.this.f114841h.mo160184a(view, abbreviationInfo, f, f2);
                }
            }
        });
    }

    /* renamed from: a */
    private void m180120a(LinkEmojiTextView linkEmojiTextView) {
        linkEmojiTextView.setUrlStringClickListner(new LinkEmojiTextView.AbstractC58525j() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass17 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                C45309a.m179927a(C45348d.this.f114836c, "open_link");
                if (C45348d.this.f114838e != null) {
                    C45348d.this.f114838e.mo160099a(view, str);
                }
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                if (C45348d.this.f114838e != null) {
                    return C45348d.this.f114838e.mo160100b(view, str);
                }
                return true;
            }
        });
        linkEmojiTextView.setAtStringClickListner(new LinkEmojiTextView.AbstractC58521f() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass18 */

            /* renamed from: b */
            private DuplicateEnterChecker f114870b = new DuplicateEnterChecker();

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: b */
            public boolean mo117507b(View view, String str, String str2) {
                return true;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: c */
            public void mo120297c(View view, String str, String str2) {
                C45309a.m179927a(C45348d.this.f114836c, "open_link");
                if (!this.f114870b.mo198450a() && C45348d.this.f114839f != null) {
                    C45348d.this.f114839f.mo160102a(view, str, str2);
                }
            }
        });
        linkEmojiTextView.setAbbreviationClickListener(new LinkEmojiTextView.AbstractC58520e() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass19 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58520e
            /* renamed from: a */
            public void mo136825a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                if (C45348d.this.f114841h != null) {
                    C45348d.this.f114841h.mo160184a(view, abbreviationInfo, f, f2);
                }
            }
        });
        linkEmojiTextView.setMentionSpanClickListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass20 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                if (C45348d.this.f114840g != null) {
                    C45348d.this.f114840g.mo160103a(view, str, str2, z, str3);
                }
            }
        });
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        if (r4.equals("underLineThrough") == false) goto L_0x0084;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.ss.android.lark.widget.span.UrlInfo m180105a(android.content.Context r4, java.lang.StringBuilder r5, com.ss.android.lark.message.card.view.richtext.NodeParams r6, com.ss.android.lark.widget.richtext.RichTextElement.AnchorProperty r7) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.view.richtext.C45348d.m180105a(android.content.Context, java.lang.StringBuilder, com.ss.android.lark.message.card.view.richtext.NodeParams, com.ss.android.lark.widget.richtext.RichTextElement$AnchorProperty):com.ss.android.lark.widget.span.UrlInfo");
    }

    /* renamed from: a */
    static TextStyleInfo m180104a(Context context, StringBuilder sb, NodeParams nodeParams, RichTextElement.UnderlineProperty underlineProperty) {
        TextStyleInfo a = m180103a(context, sb, nodeParams, (RichTextElement.TextProperty) underlineProperty);
        a.isUnderlineText = true;
        return a;
    }

    /* renamed from: a */
    private void m180111a(View view, YogaProperty yogaProperty) {
        if (view != null && yogaProperty != null && !(view instanceof YogaLayout)) {
            yogaProperty.paddingLeft = BitmapDescriptorFactory.HUE_RED;
            yogaProperty.paddingTop = BitmapDescriptorFactory.HUE_RED;
            yogaProperty.paddingRight = BitmapDescriptorFactory.HUE_RED;
            yogaProperty.paddingBottom = BitmapDescriptorFactory.HUE_RED;
            view.setPadding((int) yogaProperty.paddingLeft, (int) yogaProperty.paddingTop, (int) yogaProperty.paddingRight, (int) yogaProperty.paddingBottom);
        }
    }

    /* renamed from: a */
    private void m180115a(NodeParams nodeParams, LinkEmojiTextView linkEmojiTextView) {
        if (nodeParams != null && nodeParams.mExtraProperties != null && linkEmojiTextView != null) {
            String str = nodeParams.mExtraProperties.get("textAlign");
            if (!TextUtils.isEmpty(str)) {
                linkEmojiTextView.setGravity(C45345b.m180064a(str));
            }
        }
    }

    /* renamed from: a */
    private boolean m180126a(boolean z, boolean z2) {
        boolean z3 = !z || z2;
        if (!z3) {
            OPMonitor a = C45302a.m179899a(C45304b.f114708n);
            a.setErrorMessage(C45304b.f114708n.message);
            a.flush();
        }
        return z3;
    }

    /* renamed from: a */
    private void m180114a(NodeParams nodeParams, LKUILightTextView lKUILightTextView) {
        if (nodeParams != null && nodeParams.mExtraProperties != null && lKUILightTextView != null) {
            String str = nodeParams.mExtraProperties.get("textAlign");
            if (!TextUtils.isEmpty(str)) {
                lKUILightTextView.setGravity(C45345b.m180064a(str));
            }
        }
    }

    /* renamed from: a */
    private View.OnClickListener m180094a() {
        return new View.OnClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass21 */

            public void onClick(View view) {
                C45309a.m179927a(C45348d.this.f114836c, "interaction");
                LKUIToast.show(view.getContext(), (int) R.string.Lark_Legacy_forwardCardToast);
            }
        };
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$22 */
    public static /* synthetic */ class AnonymousClass22 {

        /* renamed from: a */
        static final /* synthetic */ int[] f114876a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass22.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$c */
    public static class C45360c extends LinearSmoothScroller {
        public C45360c(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    /* renamed from: a */
    public void mo160157a(Scene scene) {
        this.f114846m = scene;
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.d$i */
    public class View$OnClickListenerC45366i implements View.OnClickListener {

        /* renamed from: a */
        RichTextElement.SelectMenuProperty f114899a;

        /* renamed from: b */
        RoundedTextWithImage f114900b;

        /* renamed from: c */
        CharSequence[] f114901c;

        /* renamed from: d */
        CharSequence[] f114902d;

        /* renamed from: e */
        HashMap<String, String> f114903e;

        /* renamed from: f */
        int f114904f;

        /* renamed from: lambda$T0-TwP5tzpxVctq5GigRuTWN6OE */
        public static /* synthetic */ void m270821lambda$T0TwP5tzpxVctq5GigRuTWN6OE(View$OnClickListenerC45366i iVar, int i) {
            iVar.m180174a(i);
        }

        /* renamed from: com.ss.android.lark.message.card.view.richtext.d$i$a */
        public class DialogInterface$OnClickListenerC45372a implements DialogInterface.OnClickListener {
            private DialogInterface$OnClickListenerC45372a() {
                View$OnClickListenerC45366i.this = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C45309a.m179927a(C45348d.this.f114836c, "interaction");
                HashMap hashMap = new HashMap();
                hashMap.put("selected_option", View$OnClickListenerC45366i.this.f114903e.get(View$OnClickListenerC45366i.this.f114901c[i]));
                C45348d.this.mo160165a(View$OnClickListenerC45366i.this.f114899a.getConfirm(), View$OnClickListenerC45366i.this.f114900b, View$OnClickListenerC45366i.this.f114899a.getActionId(), hashMap, View$OnClickListenerC45366i.this.f114901c[i].toString());
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* renamed from: a */
        private /* synthetic */ void m180174a(int i) {
            new DialogInterface$OnClickListenerC45372a().onClick(null, i);
        }

        /* renamed from: a */
        public List<UDBaseListDialogBuilder.ListItem> mo160185a(CharSequence[] charSequenceArr) {
            ArrayList arrayList = new ArrayList();
            for (CharSequence charSequence : charSequenceArr) {
                arrayList.add(new UDBaseListDialogBuilder.ListItemBuilder(charSequence).mo90889c());
            }
            return arrayList;
        }

        /* renamed from: a */
        public void mo160187a(View view) {
            C45294c.m179871a().mo143892a((Activity) view.getContext(), C45348d.this.f114835b, new IGetDataCallback<List<ChatChatter>>() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnClickListenerC45366i.C453682 */

                /* renamed from: a */
                public void onSuccess(List<ChatChatter> list) {
                    if (!list.isEmpty()) {
                        C45309a.m179927a(C45348d.this.f114836c, "interaction");
                        HashMap hashMap = new HashMap();
                        hashMap.put("selected_option", list.get(0).getId());
                        C45348d.this.mo160165a(View$OnClickListenerC45366i.this.f114899a.getConfirm(), View$OnClickListenerC45366i.this.f114900b, View$OnClickListenerC45366i.this.f114899a.getActionId(), hashMap, list.get(0).getName());
                        return;
                    }
                    C45348d.this.mo160165a(View$OnClickListenerC45366i.this.f114899a.getConfirm(), View$OnClickListenerC45366i.this.f114900b, View$OnClickListenerC45366i.this.f114899a.getActionId(), (Map<String, String>) null, (String) null);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    OPMonitor errorCode = C45302a.m179899a(C45304b.f114699e).addTag("RichTextRender").setErrorCode(String.valueOf(errorResult.getErrorCode()));
                    errorCode.setErrorMessage("select group person invoked error" + errorResult.getDisplayMsg()).flush();
                    Log.m165378d("select group person invoked error, actionId: " + View$OnClickListenerC45366i.this.f114899a.getActionId());
                }
            });
        }

        public void onClick(View view) {
            List<RichTextElement.MenuOption> options = this.f114899a.getOptions();
            if (CollectionUtils.isEmpty(options) && this.f114899a.getType() != RichTextElement.SelectMenuProperty.Type.PERSON) {
                return;
            }
            if (this.f114899a.getType() == RichTextElement.SelectMenuProperty.Type.PERSON) {
                if (CollectionUtils.isEmpty(options)) {
                    mo160187a(view);
                } else {
                    mo160189a(view, options);
                }
            } else if (options.size() < 8) {
                mo160188a(view, this.f114899a);
            } else {
                mo160192b(view, this.f114899a);
            }
        }

        /* renamed from: a */
        public void mo160188a(View view, RichTextElement.SelectMenuProperty selectMenuProperty) {
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(C45348d.this.f114834a).mo90870a(Arrays.asList(this.f114901c))).mo90869a(new UDListDialogController.OnItemClickListener() {
                /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$i$T0TwP5tzpxVctq5GigRuTWN6OE */

                @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                public final void onItemClick(int i) {
                    C45348d.View$OnClickListenerC45366i.m270821lambda$T0TwP5tzpxVctq5GigRuTWN6OE(C45348d.View$OnClickListenerC45366i.this, i);
                }
            })).show();
        }

        /* renamed from: a */
        public void mo160189a(View view, List<RichTextElement.MenuOption> list) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(list.get(i).getValue());
            }
            C45294c.m179871a().mo143893a((Activity) view.getContext(), arrayList, new IGetDataCallback<List<ChatChatter>>() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnClickListenerC45366i.C453671 */

                /* renamed from: a */
                public void onSuccess(List<ChatChatter> list) {
                    C45309a.m179927a(C45348d.this.f114836c, "interaction");
                    if (!list.isEmpty()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("selected_option", list.get(0).getId());
                        C45348d.this.mo160165a(View$OnClickListenerC45366i.this.f114899a.getConfirm(), View$OnClickListenerC45366i.this.f114900b, View$OnClickListenerC45366i.this.f114899a.getActionId(), hashMap, list.get(0).getName());
                        return;
                    }
                    C45348d.this.mo160165a(View$OnClickListenerC45366i.this.f114899a.getConfirm(), View$OnClickListenerC45366i.this.f114900b, View$OnClickListenerC45366i.this.f114899a.getActionId(), (Map<String, String>) null, (String) null);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    OPMonitor errorCode = C45302a.m179899a(C45304b.f114699e).addTag("RichTextRender").setErrorCode(String.valueOf(errorResult.getErrorCode()));
                    errorCode.setErrorMessage("select static person invoked error" + errorResult.getDisplayMsg()).flush();
                    Log.m165378d("select static person invoked error, actionId: " + View$OnClickListenerC45366i.this.f114899a.getActionId());
                }
            });
        }

        /* renamed from: b */
        public void mo160192b(View view, final RichTextElement.SelectMenuProperty selectMenuProperty) {
            int i;
            View inflate = LayoutInflater.from(C45348d.this.f114834a).inflate(R.layout.card_msg_select_menu, (ViewGroup) null);
            View inflate2 = LayoutInflater.from(C45348d.this.f114834a).inflate(R.layout.content_msg_card_select_menu, (ViewGroup) null);
            final RichTextRenderAdapter eVar = new RichTextRenderAdapter(C45348d.this.f114834a, R.layout.item_msg_card_full_select_menu, this.f114904f);
            final DialogC25637f c = ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(view.getContext()).mo89206a(this.f114901c)).mo89290y(this.f114904f).mo89202a(new DialogInterface$OnClickListenerC45372a())).mo89210d(R.layout.item_msg_card_full_select_menu)).mo89222a(1.0f)).mo89234b(1.0f)).mo89237b(C45348d.this.f114834a.getString(R.string.Lark_Legacy_MsgCardSelect))).mo89249h(17)).mo89238b(true)).mo89261t(0)).mo89250i(R.color.text_title)).mo89223a(0, 0, 0, 0)).mo89228a(inflate)).mo89236b(inflate2)).mo89260s(R.layout.root_msg_card_select_menu)).mo89230a(new C25639g.AbstractC25641b<DialogC25637f>() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnClickListenerC45366i.C453693 */

                @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
                /* renamed from: a */
                public void mo89273a(DialogC25637f fVar) {
                    C25652a.m91886a(fVar).mo89311a(UDColorUtils.getColor(C45348d.this.f114834a, R.color.bg_body)).mo89312a();
                }
            })).mo89204a(eVar)).mo89239c();
            final RecyclerView recyclerView = (RecyclerView) inflate2.findViewById(C25639g.m91766f(R.id.lkui_dialog_list_rv));
            Context context = C45348d.this.f114834a;
            int i2 = this.f114904f;
            CharSequence[] charSequenceArr = this.f114901c;
            if (charSequenceArr == null) {
                i = 0;
            } else {
                i = charSequenceArr.length;
            }
            mo160186a(context, i2, i, recyclerView);
            final LKUISearchView lKUISearchView = (LKUISearchView) inflate.findViewById(R.id.select_menu_search_view);
            inflate.findViewById(R.id.select_menu_close_image_view).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnClickListenerC45366i.View$OnClickListenerC453704 */

                public void onClick(View view) {
                    LKUISearchView lKUISearchView = lKUISearchView;
                    lKUISearchView.mo89901b(lKUISearchView);
                    c.dismiss();
                }
            });
            final LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(R.id.ll_empty_search_notification);
            final TextView textView = (TextView) inflate2.findViewById(R.id.tv_empty_tip);
            lKUISearchView.setCancelEnabled(false);
            lKUISearchView.mo89897a(new TextWatcher() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnClickListenerC45366i.C453715 */

                public void afterTextChanged(Editable editable) {
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (charSequence.length() <= 0) {
                        recyclerView.setVisibility(0);
                        linearLayout.setVisibility(8);
                        if (View$OnClickListenerC45366i.this.f114902d != null) {
                            RichTextRenderAdapter eVar = eVar;
                            View$OnClickListenerC45366i iVar = View$OnClickListenerC45366i.this;
                            eVar.mo90859a(iVar.mo160185a(iVar.f114902d));
                            return;
                        }
                        return;
                    }
                    CharSequence[] a = View$OnClickListenerC45366i.this.mo160191a(selectMenuProperty.getOptions(), charSequence);
                    if (a == null) {
                        recyclerView.setVisibility(8);
                        linearLayout.setVisibility(0);
                        View$OnClickListenerC45366i.this.mo160190a(textView, charSequence);
                        return;
                    }
                    recyclerView.setVisibility(0);
                    linearLayout.setVisibility(8);
                    eVar.mo90859a(View$OnClickListenerC45366i.this.mo160185a(a));
                }
            });
        }

        /* renamed from: a */
        public void mo160190a(TextView textView, CharSequence charSequence) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Noresult, "search_key", charSequence.toString());
            int indexOf = mustacheFormat.indexOf(charSequence.toString());
            textView.setText(C57782ag.m224238a(mustacheFormat, indexOf, charSequence.length() + indexOf, charSequence.toString(), ContextCompat.getColor(C45348d.this.f114834a, R.color.lkui_N500)));
        }

        /* renamed from: a */
        public CharSequence[] mo160191a(List<RichTextElement.MenuOption> list, CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            if (aj.m95021b(charSequence.toString())) {
                return null;
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getText().contains(charSequence)) {
                    arrayList.add(list.get(i).getText());
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
            this.f114901c = charSequenceArr;
            return charSequenceArr;
        }

        /* renamed from: a */
        public void mo160186a(Context context, int i, int i2, RecyclerView recyclerView) {
            if (i > -1 && i2 > i && recyclerView != null) {
                C45360c cVar = new C45360c(context);
                cVar.setTargetPosition(i);
                recyclerView.getLayoutManager().startSmoothScroll(cVar);
            }
        }

        public View$OnClickListenerC45366i(RichTextElement.SelectMenuProperty selectMenuProperty, RoundedTextWithImage roundedTextWithImage, String[] strArr, HashMap<String, String> hashMap, int i) {
            C45348d.this = r1;
            this.f114899a = selectMenuProperty;
            this.f114900b = roundedTextWithImage;
            this.f114901c = strArr;
            this.f114902d = strArr;
            this.f114903e = hashMap;
            this.f114904f = i;
        }
    }

    /* renamed from: a */
    private YogaLayout m180095a(Context context) {
        if (m180130b()) {
            return new FlyFishYogaLayout(context);
        }
        return new YogaLayout(context);
    }

    /* renamed from: a */
    private MsgCardRoundedYogaLayout m180096a(Context context, boolean z) {
        if (z) {
            return new MsgCardRoundedYogaLayout(context) {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.C453546 */

                @Override // com.facebook.yoga.android.YogaLayout
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                @Override // com.facebook.yoga.android.YogaLayout
                public void onMeasure(int i, int i2) {
                    if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
                        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                        return;
                    }
                    throw new IllegalArgumentException("MeasureSpec mode must be MeasureSpec.EXACTLY");
                }
            };
        }
        return new MsgCardRoundedYogaLayout(context);
    }

    /* renamed from: e */
    private void m180136e(YogaLayoutHolder fVar, NodeParams nodeParams) {
        TextView textView = new TextView(this.f114834a);
        fVar.mo160203a(textView);
        textView.setTextColor(this.f114849p);
        textView.setText(R.string.Lark_Legacy_TypeTip0);
        YogaNode b = fVar.mo160207b(textView);
        m180111a(textView, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
    }

    /* renamed from: f */
    private View m180138f(YogaLayoutHolder fVar, NodeParams nodeParams) {
        View view = new View(this.f114834a);
        fVar.mo160203a(view);
        YogaNode b = fVar.mo160207b(view);
        m180111a(view, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
        b.setHeight((float) UIUtils.dp2px(this.f114834a, 1.0f));
        if (nodeParams.mBgColor != 0) {
            view.setBackgroundColor(nodeParams.mBgColor);
        }
        return view;
    }

    /* renamed from: b */
    private TextView m180127b(YogaLayoutHolder fVar, NodeParams nodeParams) {
        LinkEmojiTextView linkEmojiTextView = (MsgCardLinkEmojiTextView) C36443k.m143597a(this.f114834a, MsgCardLinkEmojiTextView.class.getName());
        if (linkEmojiTextView == null) {
            linkEmojiTextView = new MsgCardLinkEmojiTextView(this.f114834a);
        }
        if (this.f114850q == null) {
            this.f114850q = C45294c.m179871a().mo143901b();
        }
        boolean z = false;
        linkEmojiTextView.setTranslateEmojiCode(false);
        linkEmojiTextView.setCurrentUserId(this.f114850q);
        fVar.mo160203a(linkEmojiTextView);
        YogaNode b = fVar.mo160207b(linkEmojiTextView);
        m180111a(linkEmojiTextView, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
        linkEmojiTextView.setLineSpacing(this.f114847n, 1.0f);
        m180115a(nodeParams, linkEmojiTextView);
        if (nodeParams.mRichTextTag == RichTextElement.RichTextTag.TEXT) {
            RichTextElement.TextProperty textProperty = (RichTextElement.TextProperty) nodeParams.mRichTextProperty;
            if (nodeParams.mParents.mRichTextTag == RichTextElement.RichTextTag.BUTTON) {
                z = true;
            }
            if (textProperty.getNumberOfLines() > 0) {
                linkEmojiTextView.setMaxLines(textProperty.getNumberOfLines());
                if (textProperty.getNumberOfLines() == 1) {
                    linkEmojiTextView.setSingleLine();
                }
            } else if (z) {
                linkEmojiTextView.setSingleLine();
            }
            linkEmojiTextView.setEllipsize(TextUtils.TruncateAt.END);
            if (z) {
                b.setHeight((float) UIUtils.dp2px(this.f114834a, 22.0f));
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        m180110a(this.f114834a, arrayList, arrayList2, arrayList3, arrayList4, sb, nodeParams);
        RecogniseSpansResult a = new RecogniseSpansResult.C59147a().mo201042a(arrayList2).mo201044b(arrayList).mo201047e(arrayList3).mo201056n(arrayList4).mo201043a();
        m180120a(linkEmojiTextView);
        linkEmojiTextView.mo198365a(sb.toString(), a);
        return linkEmojiTextView;
    }

    /* renamed from: c */
    private View m180132c(YogaLayoutHolder fVar, NodeParams nodeParams) {
        float f;
        LKUILightTextView lKUILightTextView = new LKUILightTextView(this.f114834a);
        fVar.mo160203a(lKUILightTextView);
        YogaNode b = fVar.mo160207b(lKUILightTextView);
        m180111a(lKUILightTextView, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
        lKUILightTextView.setSpacingExtra(this.f114847n);
        m180114a(nodeParams, lKUILightTextView);
        if (nodeParams.mRichTextTag == RichTextElement.RichTextTag.TEXT) {
            RichTextElement.TextProperty textProperty = (RichTextElement.TextProperty) nodeParams.mRichTextProperty;
            if (textProperty.getNumberOfLines() > 0) {
                lKUILightTextView.setMaxLines(textProperty.getNumberOfLines());
                if (textProperty.getNumberOfLines() == 1) {
                    lKUILightTextView.setSingleLine(true);
                }
            } else if (nodeParams.mParents.mRichTextTag == RichTextElement.RichTextTag.BUTTON) {
                lKUILightTextView.setSingleLine(true);
            }
            lKUILightTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        m180119a(lKUILightTextView);
        if (nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED) {
            lKUILightTextView.setTextSize(UIUtils.dp2px(this.f114834a, nodeParams.mTextSize));
        } else {
            lKUILightTextView.setTextSize(UIUtils.dp2px(this.f114834a, 14.0f));
        }
        if (nodeParams.mSpannableString != null) {
            if (nodeParams.mRichTextTag == RichTextElement.RichTextTag.TEXT) {
                RichTextElement.TextProperty textProperty2 = (RichTextElement.TextProperty) nodeParams.mRichTextProperty;
                if (TextUtils.isEmpty(nodeParams.mSpannableString) || TextUtils.isEmpty(textProperty2.getContent())) {
                    lKUILightTextView.setContentText(" ");
                    return lKUILightTextView;
                }
            }
            lKUILightTextView.setContentText(nodeParams.mSpannableString);
        } else {
            Log.m165397w("RichTextRender", "textview: no preParsed string");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            m180110a(this.f114834a, arrayList, arrayList2, arrayList3, arrayList4, sb, nodeParams);
            List<SpanInfo> allSpanInfos = new RecogniseSpansResult.C59147a().mo201042a(arrayList2).mo201044b(arrayList).mo201047e(arrayList3).mo201056n(arrayList4).mo201043a().getAllSpanInfos();
            SpannableStringExtraParams.Builder b2 = new SpannableStringExtraParams.Builder(this.f114834a).mo198079b(true);
            Context context = this.f114834a;
            if (nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED) {
                f = nodeParams.mTextSize;
            } else {
                f = 14.0f;
            }
            lKUILightTextView.setContentText(C58475b.m226783a().mo198109a(this.f114834a, sb.toString(), allSpanInfos, b2.mo198071a(UIUtils.dp2px(context, f)).mo198072a(C45294c.m179871a().mo143901b()).mo198082c(false).mo198086e(UIHelper.getColor(R.color.lkui_B500)).mo198084d(UIHelper.getColor(R.color.lkui_N00)).mo198107v()));
        }
        return lKUILightTextView;
    }

    /* renamed from: d */
    private ImageView m180134d(YogaLayoutHolder fVar, NodeParams nodeParams) {
        final LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(this.f114834a);
        fVar.mo160203a(lKUIRoundedImageView2);
        YogaNode b = fVar.mo160207b(lKUIRoundedImageView2);
        m180111a(lKUIRoundedImageView2, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
        RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) nodeParams.mRichTextProperty;
        final Image b2 = C59031e.m229182b(imageProperty, 1);
        if (b.getWidth().equals(YogaValue.parse("auto"))) {
            b.setWidth(this.f114848o * ((float) b2.getWidth()));
        }
        if (b.getHeight().equals(YogaValue.parse("auto"))) {
            b.setHeight(this.f114848o * ((float) b2.getHeight()));
        }
        if (nodeParams.mExtraProperties != null) {
            String str = nodeParams.mExtraProperties.get("borderRadius");
            if (!TextUtils.isEmpty(str)) {
                double d = 0.0d;
                try {
                    d = Double.parseDouble(str);
                } catch (NumberFormatException e) {
                    Log.m165384e("RichTextRender", "parse img style radius failed err=", e);
                }
                if (d > 2.0d) {
                    lKUIRoundedImageView2.setRadiusInDp(8.0f);
                } else {
                    lKUIRoundedImageView2.setRadiusInDp(2.0f);
                }
            } else {
                Log.m165397w("RichTextRender", "msg " + this.f114836c + " has no radius style info");
            }
        } else {
            Log.m165397w("RichTextRender", "msg " + this.f114836c + " has no style info");
        }
        ColorStateList colorStateList = UDColorUtils.getColorStateList(this.f114834a, R.color.fill_img_mask);
        lKUIRoundedImageView2.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        lKUIRoundedImageView2.setImageTintList(colorStateList);
        if (!TextUtils.isEmpty(b2.getToken())) {
            final String key = b2.getKey();
            if (TextUtils.isEmpty(key)) {
                C45302a.m179899a(C45304b.f114698d).addTag("RichTextRender").flush();
                Log.m165382e("local url in rich text render! token: " + b2.getToken());
            } else if (m180130b()) {
                lKUIRoundedImageView2.setTag(R.id.did_when_bind_for_nbview, new Runnable() {
                    /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass28 */

                    public void run() {
                        ImageLoader.with(C45348d.this.f114834a).load(new C38824b(key)).centerCrop().dontAnimate(false).listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(C45348d.this.f114846m).mo105398a(ListenerParams.FromType.CARD).mo105395a(lKUIRoundedImageView2.getWidth()).mo105403b(lKUIRoundedImageView2.getHeight()).mo105399a(C45348d.this.f114845l).mo105404b(key).mo105402a())).into(lKUIRoundedImageView2);
                    }
                });
            } else {
                ImageLoader.with(this.f114834a).load(new C38824b(key)).centerCrop().dontAnimate(false).listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(this.f114846m).mo105398a(ListenerParams.FromType.CARD).mo105395a(lKUIRoundedImageView2.getWidth()).mo105403b(lKUIRoundedImageView2.getHeight()).mo105399a(this.f114845l).mo105404b(key).mo105402a())).into(lKUIRoundedImageView2);
            }
        } else if (CollectionUtils.isNotEmpty(b2.getUrls())) {
            if (m180130b()) {
                lKUIRoundedImageView2.setTag(R.id.did_when_bind_for_nbview, new Runnable() {
                    /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass29 */

                    public void run() {
                        ImageLoader.with(C45348d.this.f114834a).load(b2.getUrls().get(0)).centerCrop().listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(C45348d.this.f114846m).mo105398a(ListenerParams.FromType.CARD).mo105395a(lKUIRoundedImageView2.getWidth()).mo105403b(lKUIRoundedImageView2.getHeight()).mo105402a())).into(lKUIRoundedImageView2);
                    }
                });
            } else {
                ImageLoader.with(this.f114834a).load(b2.getUrls().get(0)).centerCrop().listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(this.f114846m).mo105398a(ListenerParams.FromType.CARD).mo105395a(lKUIRoundedImageView2.getWidth()).mo105403b(lKUIRoundedImageView2.getHeight()).mo105402a())).into(lKUIRoundedImageView2);
            }
        }
        if (imageProperty.isImgCanPreview()) {
            lKUIRoundedImageView2.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnClickListenerC453502 */

                public void onClick(View view) {
                    C45309a.m179927a(C45348d.this.f114836c, "interaction");
                    if (C45348d.this.f114843j != null) {
                        C45348d.this.f114843j.mo160106a(view, b2);
                    }
                }
            });
            lKUIRoundedImageView2.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnLongClickListenerC453513 */

                public boolean onLongClick(View view) {
                    if (C45348d.this.f114844k == null) {
                        return true;
                    }
                    C45348d.this.f114844k.mo160107a(view);
                    return true;
                }
            });
        }
        return lKUIRoundedImageView2;
    }

    public C45348d(Context context, String str, int i) {
        this(context, str, null, i);
    }

    /* renamed from: a */
    private RoundedTextWithImage m180097a(Context context, boolean z, boolean z2) {
        RoundedTextWithImage roundedTextWithImage;
        if (z2) {
            roundedTextWithImage = new RoundedTextWithImage(context, z) {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.C453557 */

                @Override // com.facebook.yoga.android.YogaLayout
                public void onMeasure(int i, int i2) {
                    if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
                        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                        return;
                    }
                    throw new IllegalArgumentException("MeasureSpec mode must be MeasureSpec.EXACTLY");
                }
            };
        } else {
            roundedTextWithImage = new RoundedTextWithImage(context, z);
        }
        roundedTextWithImage.setZoomRule(this.f114851r);
        return roundedTextWithImage;
    }

    /* renamed from: a */
    private RoundedTextWithImage m180098a(YogaLayoutHolder fVar, NodeParams nodeParams, Boolean bool) {
        RoundedTextWithImage a = m180097a(this.f114834a, bool.booleanValue(), m180130b());
        nodeParams.mYogaProperty.paddingLeft = (float) UIUtils.dp2px(this.f114834a, 12.0f);
        fVar.mo160203a((View) a);
        m180112a(a, nodeParams);
        YogaNode b = fVar.mo160207b(a);
        m180111a(a, nodeParams.mYogaProperty);
        YogaNode a2 = C45374g.m180200a(nodeParams.mYogaProperty);
        this.f114851r.mo160209a(this.f114834a, a2, nodeParams);
        b.copyStyle(a2);
        return a;
    }

    /* renamed from: h */
    private void m180141h(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        YogaLayoutHolder fVar2 = new YogaLayoutHolder(this.f114834a, m180130b());
        fVar2.mo160205a(Integer.valueOf(nodeParams.mBgColor));
        if (CollectionUtils.isNotEmpty(nodeParams.mChildParams)) {
            for (NodeParams nodeParams2 : nodeParams.mChildParams) {
                m180117a(fVar2, nodeParams2, gVar);
            }
        }
        ViewGroup a = fVar2.mo160202a();
        ViewGroup viewGroup = a;
        if (a == null) {
            YogaLayout yogaLayout = new YogaLayout(this.f114834a);
            fVar2.mo160204a(yogaLayout);
            viewGroup = yogaLayout;
        }
        fVar.mo160203a(viewGroup);
        YogaNode b = fVar2.mo160206b();
        if (b != null) {
            b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
            if (b.getWidth().unit == YogaUnit.AUTO) {
                b.setWidthPercent(100.0f);
            }
        }
    }

    /* renamed from: i */
    private void m180142i(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        YogaLayout a = m180095a(this.f114834a);
        fVar.mo160203a((View) a);
        if (nodeParams.mBgColor != 0) {
            a.setBackgroundColor(nodeParams.mBgColor);
        }
        YogaNode b = fVar.mo160207b(a);
        m180111a(a, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
        final RichTextElement.LinkProperty linkProperty = (RichTextElement.LinkProperty) nodeParams.mRichTextProperty;
        if (CollectionUtils.isNotEmpty(nodeParams.mChildParams)) {
            YogaLayoutHolder fVar2 = new YogaLayoutHolder(this.f114834a, m180130b());
            fVar2.mo160204a(a);
            for (NodeParams nodeParams2 : nodeParams.mChildParams) {
                m180117a(fVar2, nodeParams2, gVar);
            }
        }
        a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnClickListenerC453568 */

            public void onClick(View view) {
                C45309a.m179927a(C45348d.this.f114836c, "open_link");
                if (C45348d.this.f114842i != null) {
                    C45348d.this.f114842i.mo160104a(view, linkProperty.getUrl(), linkProperty.getAndroidUrl(), linkProperty.getSource());
                }
            }
        });
        a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnLongClickListenerC453579 */

            public boolean onLongClick(View view) {
                if (C45348d.this.f114844k == null) {
                    return true;
                }
                C45348d.this.f114844k.mo160107a(view);
                return true;
            }
        });
    }

    /* renamed from: c */
    private void m180133c(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        long j;
        int i;
        boolean z = true;
        RoundedTextWithImage a = m180098a(fVar, nodeParams, (Boolean) true);
        RichTextElement.TimePickerProperty timePickerProperty = (RichTextElement.TimePickerProperty) nodeParams.mRichTextProperty;
        if (!timePickerProperty.isLoading() && !timePickerProperty.isDisable()) {
            z = false;
        }
        if (!aj.m95021b(timePickerProperty.getInitialTime())) {
            String initialTime = timePickerProperty.getInitialTime();
            long a2 = C45345b.m180066a(timePickerProperty.getInitialTime(), "HH:mm");
            if (a2 != -1) {
                initialTime = C45345b.m180070a("HH:mm", a2);
            }
            a.mo160144b(initialTime, Boolean.valueOf(z));
            j = a2;
        } else {
            a.mo160142a(timePickerProperty.getPlaceHolder(), Boolean.valueOf(z));
            j = -1;
        }
        if (timePickerProperty.isDisable()) {
            i = UDColorUtils.getColor(this.f114834a, R.color.icon_disable);
        } else {
            i = UDColorUtils.getColor(this.f114834a, R.color.icon_n2);
        }
        a.setImageDrawable(UDIconUtils.getIconDrawable(this.f114834a, (int) R.drawable.ud_icon_time_outlined, i));
        int a3 = this.f114851r.mo160208a(this.f114834a, 16);
        Log.m165389i("RichTextRender", "date picker zoomImageSize:" + a3);
        a.setImgWidth(a3);
        a.setImgHeight(a3);
        if (timePickerProperty.isLoading()) {
            a.mo160124a();
        }
        boolean a4 = gVar.mo160117a();
        a.setEnabled(m180126a(timePickerProperty.isDisable(), a4));
        Log.m165389i("RichTextRender", "isForward:" + a4 + " property disable is :" + timePickerProperty.isDisable());
        if (a4) {
            a.setOnClickListener(m180094a());
            return;
        }
        a.setOnClickListener(new View.OnClickListener(j, "HH:mm", timePickerProperty, a) {
            /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$A64IygokRM7rCN9DSdE5YPcy9P4 */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ RichTextElement.TimePickerProperty f$3;
            public final /* synthetic */ RoundedTextWithImage f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void onClick(View view) {
                C45348d.lambda$A64IygokRM7rCN9DSdE5YPcy9P4(C45348d.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
            }
        });
        a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass23 */

            public boolean onLongClick(View view) {
                if (C45348d.this.f114844k == null) {
                    return true;
                }
                C45348d.this.f114844k.mo160107a(view);
                return true;
            }
        });
    }

    /* renamed from: d */
    private void m180135d(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        long j;
        int i;
        boolean z = true;
        RoundedTextWithImage a = m180098a(fVar, nodeParams, (Boolean) true);
        RichTextElement.DatePickerProperty datePickerProperty = (RichTextElement.DatePickerProperty) nodeParams.mRichTextProperty;
        if (!datePickerProperty.isLoading() && !datePickerProperty.isDisable()) {
            z = false;
        }
        if (!aj.m95021b(datePickerProperty.getInitialDate())) {
            String initialDate = datePickerProperty.getInitialDate();
            long a2 = C45345b.m180066a(datePickerProperty.getInitialDate(), "yyyy-MM-dd");
            if (a2 != -1) {
                initialDate = C45345b.m180070a("yyyy-MM-dd", a2);
            }
            a.mo160144b(initialDate, Boolean.valueOf(z));
            j = a2;
        } else {
            a.mo160142a(datePickerProperty.getPlaceHolder(), Boolean.valueOf(z));
            j = -1;
        }
        if (datePickerProperty.isDisable()) {
            i = UDColorUtils.getColor(this.f114834a, R.color.icon_disable);
        } else {
            i = UDColorUtils.getColor(this.f114834a, R.color.icon_n2);
        }
        a.setImageDrawable(UDIconUtils.getIconDrawable(this.f114834a, (int) R.drawable.ud_icon_calendar_outlined, i));
        int a3 = this.f114851r.mo160208a(this.f114834a, 16);
        Log.m165389i("RichTextRender", "date picker zoomImageSize:" + a3);
        a.setImgWidth(a3);
        a.setImgHeight(a3);
        if (datePickerProperty.isLoading()) {
            a.mo160124a();
        }
        boolean a4 = gVar.mo160117a();
        a.setEnabled(m180126a(datePickerProperty.isDisable(), a4));
        Log.m165389i("RichTextRender", "isForward:" + a4 + " property disable is :" + datePickerProperty.isDisable());
        if (a4) {
            a.setOnClickListener(m180094a());
            return;
        }
        a.setOnClickListener(new View.OnClickListener(j, "yyyy-MM-dd", datePickerProperty, a) {
            /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$55wNxl8wwIKxUEOMugj4rSXXf8 */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ RichTextElement.DatePickerProperty f$3;
            public final /* synthetic */ RoundedTextWithImage f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void onClick(View view) {
                C45348d.m270820lambda$55wNxl8wwIKxUEOMugj4rSXXf8(C45348d.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
            }
        });
        a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass24 */

            public boolean onLongClick(View view) {
                if (C45348d.this.f114844k == null) {
                    return true;
                }
                C45348d.this.f114844k.mo160107a(view);
                return true;
            }
        });
    }

    /* renamed from: e */
    private void m180137e(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        int i;
        RoundedTextWithImage a = m180098a(fVar, nodeParams, (Boolean) false);
        RichTextElement.OverflowMenuProperty overflowMenuProperty = (RichTextElement.OverflowMenuProperty) nodeParams.mRichTextProperty;
        boolean a2 = gVar.mo160117a();
        boolean a3 = m180126a(overflowMenuProperty.isDisable(), a2);
        a.mo160143b();
        if (m180131b(overflowMenuProperty.isDisable(), a2)) {
            i = UDColorUtils.getColor(this.f114834a, R.color.icon_disable);
        } else {
            i = UDColorUtils.getColor(this.f114834a, R.color.icon_n2);
        }
        a.setImageDrawable(UDIconUtils.getIconDrawable(this.f114834a, (int) R.drawable.ud_icon_more_outlined, i));
        int a4 = this.f114851r.mo160208a(this.f114834a, 20);
        Log.m165389i("RichTextRender", "over flow zoomImageSize:" + a4);
        a.setImgWidth(a4);
        a.setImgHeight(a4);
        if (overflowMenuProperty.isLoading()) {
            a.mo160124a();
        }
        a.setEnabled(a3);
        Log.m165389i("RichTextRender", "isForward:" + a2 + " property disable is :" + overflowMenuProperty.isDisable());
        if (a2) {
            a.setOnClickListener(m180094a());
            return;
        }
        a.setOnClickListener(new View.OnClickListener(overflowMenuProperty, a) {
            /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$v4Dg2MoQnIZyJa9LqT2JD_Cms4k */
            public final /* synthetic */ RichTextElement.OverflowMenuProperty f$1;
            public final /* synthetic */ RoundedTextWithImage f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C45348d.lambda$v4Dg2MoQnIZyJa9LqT2JD_Cms4k(C45348d.this, this.f$1, this.f$2, view);
            }
        });
        a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass25 */

            public boolean onLongClick(View view) {
                if (C45348d.this.f114844k == null) {
                    return true;
                }
                C45348d.this.f114844k.mo160107a(view);
                return true;
            }
        });
    }

    /* renamed from: a */
    static EmojiconInfo m180100a(RichTextElement.EmotionProperty emotionProperty, String str, StringBuilder sb) {
        int i;
        Drawable a = EmojiHandler.m226946a(emotionProperty.getKey());
        if (a == null) {
            return null;
        }
        EmojiconInfo emojiconInfo = new EmojiconInfo();
        emojiconInfo.type = 10;
        emojiconInfo.text = str;
        if (sb == null) {
            i = 0;
        } else {
            i = sb.toString().length();
        }
        emojiconInfo.start = i;
        emojiconInfo.end = emojiconInfo.start + emojiconInfo.text.length();
        emojiconInfo.key = emotionProperty.getKey();
        emojiconInfo.drawable = a;
        return emojiconInfo;
    }

    /* renamed from: b */
    private void m180128b(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        long j;
        int i;
        boolean z = true;
        RoundedTextWithImage a = m180098a(fVar, nodeParams, (Boolean) true);
        RichTextElement.DateTimePickerProperty dateTimePickerProperty = (RichTextElement.DateTimePickerProperty) nodeParams.mRichTextProperty;
        if (!dateTimePickerProperty.isLoading() && !dateTimePickerProperty.isDisable()) {
            z = false;
        }
        if (!aj.m95021b(dateTimePickerProperty.getInitialDateTime())) {
            String initialDateTime = dateTimePickerProperty.getInitialDateTime();
            long a2 = C45345b.m180066a(dateTimePickerProperty.getInitialDateTime(), "yyyy-MM-dd HH:mm");
            if (a2 != -1) {
                initialDateTime = C45345b.m180070a("yyyy-MM-dd HH:mm", a2);
            }
            a.mo160144b(initialDateTime, Boolean.valueOf(z));
            j = a2;
        } else {
            a.mo160142a(dateTimePickerProperty.getPlaceHolder(), Boolean.valueOf(z));
            j = -1;
        }
        if (dateTimePickerProperty.isDisable()) {
            i = UDColorUtils.getColor(this.f114834a, R.color.icon_disable);
        } else {
            i = UDColorUtils.getColor(this.f114834a, R.color.icon_n2);
        }
        a.setImageDrawable(UDIconUtils.getIconDrawable(this.f114834a, (int) R.drawable.ud_icon_calendar_outlined, i));
        int a3 = this.f114851r.mo160208a(this.f114834a, 16);
        Log.m165389i("RichTextRender", "date time picker zoomImageSize:" + a3);
        a.setImgWidth(a3);
        a.setImgHeight(a3);
        if (dateTimePickerProperty.isLoading()) {
            a.mo160124a();
        }
        boolean a4 = gVar.mo160117a();
        a.setEnabled(m180126a(dateTimePickerProperty.isDisable(), a4));
        Log.m165389i("RichTextRender", "isForward:" + a4 + " property disable is :" + dateTimePickerProperty.isDisable());
        if (a4) {
            a.setOnClickListener(m180094a());
            return;
        }
        a.setOnClickListener(new View.OnClickListener(j, "yyyy-MM-dd HH:mm", dateTimePickerProperty, a) {
            /* class com.ss.android.lark.message.card.view.richtext.$$Lambda$d$8h9RuImm7xScKxnwWTz0llvQjGw */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ RichTextElement.DateTimePickerProperty f$3;
            public final /* synthetic */ RoundedTextWithImage f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void onClick(View view) {
                C45348d.lambda$8h9RuImm7xScKxnwWTz0llvQjGw(C45348d.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
            }
        });
        a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass12 */

            public boolean onLongClick(View view) {
                if (C45348d.this.f114844k == null) {
                    return true;
                }
                C45348d.this.f114844k.mo160107a(view);
                return true;
            }
        });
    }

    /* renamed from: f */
    private void m180139f(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        int i;
        HashMap hashMap;
        String[] strArr;
        int i2;
        int i3;
        boolean z = true;
        RoundedTextWithImage a = m180098a(fVar, nodeParams, (Boolean) true);
        RichTextElement.SelectMenuProperty selectMenuProperty = (RichTextElement.SelectMenuProperty) nodeParams.mRichTextProperty;
        if (!selectMenuProperty.isLoading() && !selectMenuProperty.isDisable()) {
            z = false;
        }
        boolean a2 = gVar.mo160117a();
        boolean a3 = m180126a(selectMenuProperty.isDisable(), a2);
        if (selectMenuProperty.isLoading()) {
            a.mo160124a();
        } else {
            if (m180131b(selectMenuProperty.isDisable(), a2)) {
                i3 = UDColorUtils.getColor(this.f114834a, R.color.icon_disable);
            } else {
                i3 = UDColorUtils.getColor(this.f114834a, R.color.icon_n2);
            }
            a.setImageDrawable(UDIconUtils.getIconDrawable(this.f114834a, (int) R.drawable.ud_icon_down_outlined, i3));
            int a4 = this.f114851r.mo160208a(this.f114834a, 16);
            Log.m165389i("RichTextRender", "select menu flow zoomImageSize:" + a4);
            a.setImgWidth(a4);
            a.setImgHeight(a4);
        }
        a.setEnabled(a3);
        List<RichTextElement.MenuOption> options = selectMenuProperty.getOptions();
        String initialOption = selectMenuProperty.getInitialOption();
        if (selectMenuProperty.getType() == RichTextElement.SelectMenuProperty.Type.PERSON) {
            if (aj.m95021b(initialOption)) {
                a.mo160142a(selectMenuProperty.getPlaceHolder(), Boolean.valueOf(z));
            } else {
                a.mo160144b(initialOption, Boolean.valueOf(z));
            }
            strArr = null;
            hashMap = null;
            i = -1;
        } else {
            if (CollectionUtils.isEmpty(options)) {
                i2 = 0;
            } else {
                i2 = options.size();
            }
            strArr = new String[i2];
            HashMap hashMap2 = new HashMap();
            int i4 = -1;
            for (int i5 = 0; i5 < i2; i5++) {
                strArr[i5] = options.get(i5).getText();
                hashMap2.put(strArr[i5], options.get(i5).getValue());
                if (aj.m95020a(initialOption, options.get(i5).getValue())) {
                    a.mo160144b(options.get(i5).getText(), Boolean.valueOf(z));
                    i4 = i5;
                }
            }
            if (i4 == -1 && !aj.m95021b(selectMenuProperty.getPlaceHolder())) {
                a.mo160142a(selectMenuProperty.getPlaceHolder(), Boolean.valueOf(z));
            }
            hashMap = hashMap2;
            i = i4;
        }
        Log.m165389i("RichTextRender", "isForward:" + a2 + " property disable is :" + selectMenuProperty.isDisable());
        if (a2) {
            a.setOnClickListener(m180094a());
            return;
        }
        final View$OnClickListenerC45366i iVar = new View$OnClickListenerC45366i(selectMenuProperty, a, strArr, hashMap, i);
        a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass26 */

            public void onClick(View view) {
                iVar.onClick(view);
            }
        });
        a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.AnonymousClass27 */

            public boolean onLongClick(View view) {
                if (C45348d.this.f114844k == null) {
                    return true;
                }
                C45348d.this.f114844k.mo160107a(view);
                return true;
            }
        });
    }

    /* renamed from: g */
    private void m180140g(YogaLayoutHolder fVar, NodeParams nodeParams, C45338g gVar) {
        final MsgCardRoundedYogaLayout a = m180096a(this.f114834a, m180130b());
        fVar.mo160203a((View) a);
        YogaNode a2 = C45374g.m180200a(nodeParams.mYogaProperty);
        m180113a(a, nodeParams, a2);
        YogaNode b = fVar.mo160207b(a);
        m180111a(a, nodeParams.mYogaProperty);
        if (this.f114852s == 2) {
            Log.m165389i("RichTextRender", "button refine logic");
            if (!TextUtils.equals(((RichTextElement.ButtonProperty) nodeParams.mRichTextProperty).getMode(), "link")) {
                nodeParams.mYogaProperty.paddingLeft = (float) UIUtils.dp2px(this.f114834a, 26.0f);
                nodeParams.mYogaProperty.paddingRight = (float) UIUtils.dp2px(this.f114834a, 26.0f);
            } else {
                nodeParams.mYogaProperty.paddingRight = (float) UIUtils.dp2px(this.f114834a, 20.0f);
                a.mo160125a(YogaAlign.FLEX_START);
            }
        }
        this.f114851r.mo160209a(this.f114834a, a2, nodeParams);
        b.copyStyle(a2);
        final RichTextElement.ButtonProperty buttonProperty = (RichTextElement.ButtonProperty) nodeParams.mRichTextProperty;
        if (CollectionUtils.isNotEmpty(nodeParams.mChildParams)) {
            YogaLayoutHolder fVar2 = new YogaLayoutHolder(this.f114834a, m180130b());
            fVar2.mo160204a((YogaLayout) a);
            for (NodeParams nodeParams2 : nodeParams.mChildParams) {
                m180117a(fVar2, nodeParams2, gVar);
            }
        }
        if (buttonProperty.isShowLoadingIcon()) {
            if (aj.m95020a(buttonProperty.getMode(), "danger")) {
                a.setTintColorForLoadingIcon(R.color.function_danger_500);
            }
            a.mo160124a();
        }
        boolean a3 = gVar.mo160117a();
        Log.m165389i("RichTextRender", "isForward:" + a3 + " property disable is :" + buttonProperty.isDisable());
        boolean a4 = gVar.mo160118a(buttonProperty.getActionId());
        if (!a3 || a4) {
            a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnClickListenerC453524 */

                public void onClick(View view) {
                    C45309a.m179927a(C45348d.this.f114836c, "interaction");
                    if (!C45344a.m180061a(view)) {
                        C45348d.this.mo160165a(buttonProperty.getConfirm(), a, buttonProperty.getActionId(), (Map<String, String>) null, (String) null);
                    }
                }
            });
            a.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.message.card.view.richtext.C45348d.View$OnLongClickListenerC453535 */

                public boolean onLongClick(View view) {
                    if (C45348d.this.f114844k == null) {
                        return true;
                    }
                    C45348d.this.f114844k.mo160107a(view);
                    return true;
                }
            });
        } else {
            a.setOnClickListener(m180094a());
        }
        a.setEnabled(m180126a(buttonProperty.isDisable(), a3));
    }

    /* renamed from: b */
    private void m180129b(YogaLayoutHolder fVar, List<NodeParams> list, NodeParams nodeParams) {
        float f;
        LKUILightTextView lKUILightTextView = new LKUILightTextView(this.f114834a);
        fVar.mo160203a(lKUILightTextView);
        YogaNode b = fVar.mo160207b(lKUILightTextView);
        m180111a(lKUILightTextView, nodeParams.mYogaProperty);
        b.copyStyle(C45374g.m180200a(nodeParams.mYogaProperty));
        if (nodeParams.mBgColor != 0) {
            lKUILightTextView.setBackgroundColor(nodeParams.mBgColor);
        }
        if (nodeParams.mTextColor != 0) {
            lKUILightTextView.setTextColor(nodeParams.mTextColor);
        }
        m180114a(nodeParams, lKUILightTextView);
        RichTextElement.TextableAreaProperty textableAreaProperty = (RichTextElement.TextableAreaProperty) nodeParams.mRichTextProperty;
        if (textableAreaProperty.getNumberOfLines() > 0) {
            lKUILightTextView.setMaxLines(textableAreaProperty.getNumberOfLines());
            if (textableAreaProperty.getNumberOfLines() == 1) {
                lKUILightTextView.setSingleLine(true);
            }
        } else if (nodeParams.mParents.mRichTextTag == RichTextElement.RichTextTag.BUTTON) {
            lKUILightTextView.setSingleLine(true);
        }
        lKUILightTextView.setEllipsize(TextUtils.TruncateAt.END);
        lKUILightTextView.setTypeface(Typeface.create(lKUILightTextView.getTypeface(), nodeParams.mFontStyleAndWeight));
        if (nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED) {
            lKUILightTextView.setTextSize(UIUtils.dp2px(this.f114834a, nodeParams.mTextSize));
        } else {
            lKUILightTextView.setTextSize(UIUtils.dp2px(this.f114834a, 14.0f));
        }
        lKUILightTextView.setSpacingExtra(this.f114847n);
        m180119a(lKUILightTextView);
        if (nodeParams.mSpannableString != null) {
            if (TextUtils.isEmpty(nodeParams.mSpannableString)) {
                lKUILightTextView.setContentText(" ");
            } else {
                lKUILightTextView.setContentText(nodeParams.mSpannableString);
            }
        } else if (CollectionUtils.isNotEmpty(list)) {
            Log.m165397w("RichTextRender", "textarea: no preParsed string");
            List<NodeParams> list2 = nodeParams.mChildParams;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (NodeParams nodeParams2 : list2) {
                m180110a(this.f114834a, arrayList, arrayList2, arrayList3, arrayList4, sb, nodeParams2);
                arrayList4 = arrayList4;
                arrayList3 = arrayList3;
            }
            List<SpanInfo> allSpanInfos = new RecogniseSpansResult.C59147a().mo201042a(arrayList2).mo201044b(arrayList).mo201047e(arrayList3).mo201056n(arrayList4).mo201043a().getAllSpanInfos();
            SpannableStringExtraParams.Builder b2 = new SpannableStringExtraParams.Builder(this.f114834a).mo198079b(true);
            Context context = this.f114834a;
            if (nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED) {
                f = nodeParams.mTextSize;
            } else {
                f = 14.0f;
            }
            lKUILightTextView.setContentText(C58475b.m226783a().mo198109a(this.f114834a, sb.toString(), allSpanInfos, b2.mo198071a(UIUtils.dp2px(context, f)).mo198072a(C45294c.m179871a().mo143901b()).mo198082c(false).mo198086e(UIHelper.getColor(R.color.lkui_B500)).mo198084d(UIHelper.getColor(R.color.lkui_N00)).mo198107v()));
        }
    }

    public C45348d(Context context, String str, String str2, int i) {
        this.f114846m = Scene.Chat;
        this.f114834a = context;
        this.f114835b = str;
        this.f114836c = str2;
        this.f114852s = i;
        this.f114847n = (float) UIUtils.dp2px(context, 4.0f);
        this.f114849p = UIUtils.getColor(context, R.color.lkui_N900);
        this.f114848o = context.getResources().getDisplayMetrics().density;
        this.f114851r = new C45375h(i);
        this.f114845l = new ListenerParams.RequestListener() {
            /* class com.ss.android.lark.message.card.view.richtext.C45348d.C453491 */

            @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
            /* renamed from: a */
            public void mo105411a(Object obj, Object obj2, Object obj3, DataSource dataSource, boolean z) {
            }

            @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
            /* renamed from: a */
            public void mo105410a(Exception exc) {
                OPMonitor a = C45302a.m179899a(C45304b.f114702h);
                a.setErrorMessage(C45304b.f114702h.message);
                a.flush();
            }
        };
    }

    /* renamed from: a */
    static TextStyleInfo m180101a(Context context, StringBuilder sb, NodeParams nodeParams, RichTextElement.BoldProperty boldProperty) {
        TextStyleInfo a = m180103a(context, sb, nodeParams, (RichTextElement.TextProperty) boldProperty);
        if (nodeParams.mFontStyleAndWeight == 0) {
            a.textStyle = Typeface.create(Typeface.DEFAULT, 1);
        } else {
            a.textStyle = Typeface.create(Typeface.DEFAULT, nodeParams.mFontStyleAndWeight);
        }
        return a;
    }

    /* renamed from: a */
    static TextStyleInfo m180102a(Context context, StringBuilder sb, NodeParams nodeParams, RichTextElement.ItalicProperty italicProperty) {
        TextStyleInfo a = m180103a(context, sb, nodeParams, (RichTextElement.TextProperty) italicProperty);
        if (nodeParams.mFontStyleAndWeight == 0) {
            a.textStyle = Typeface.create(Typeface.DEFAULT, 2);
        } else {
            a.textStyle = Typeface.create(Typeface.DEFAULT, nodeParams.mFontStyleAndWeight);
        }
        return a;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010b, code lost:
        if (r6.equals("underLineThrough") == false) goto L_0x00ed;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.ss.android.lark.widget.span.TextStyleInfo m180103a(android.content.Context r6, java.lang.StringBuilder r7, com.ss.android.lark.message.card.view.richtext.NodeParams r8, com.ss.android.lark.widget.richtext.RichTextElement.TextProperty r9) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.view.richtext.C45348d.m180103a(android.content.Context, java.lang.StringBuilder, com.ss.android.lark.message.card.view.richtext.NodeParams, com.ss.android.lark.widget.richtext.RichTextElement$TextProperty):com.ss.android.lark.widget.span.TextStyleInfo");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r3.equals("underLineThrough") == false) goto L_0x006f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.ss.android.lark.widget.span.AtInfo m180099a(android.content.Context r3, com.ss.android.lark.widget.richtext.RichTextElement.AtProperty r4, java.lang.String r5, java.lang.StringBuilder r6, com.ss.android.lark.message.card.view.richtext.NodeParams r7) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.view.richtext.C45348d.m180099a(android.content.Context, com.ss.android.lark.widget.richtext.RichTextElement$AtProperty, java.lang.String, java.lang.StringBuilder, com.ss.android.lark.message.card.view.richtext.NodeParams):com.ss.android.lark.widget.span.AtInfo");
    }
}
