package com.ss.android.lark.searchcommon.view.feedback;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.bytedance.lark.pb.search.feedback.v1.FeedbackParam;
import com.bytedance.lark.pb.search.feedback.v1.FeedbackRequest;
import com.bytedance.lark.pb.search.feedback.v1.FeedbackResponse;
import com.bytedance.lark.pb.search.feedback.v1.IntegrationSearchParam;
import com.bytedance.lark.pb.search.feedback.v1.SearchResult;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.bytedance.lark.pb.search.v1.Scene;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.ui.flowlayout.AbstractC26225a;
import com.larksuite.framework.ui.flowlayout.FlowLayout;
import com.larksuite.framework.ui.flowlayout.TagFlowLayout;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.FeedbackReasonItem;
import com.ss.android.lark.pb.ai.FeedbackReasonRequest;
import com.ss.android.lark.pb.ai.FeedbackReasonResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.view.feedback.DialogC54011a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.ss.android.lark.searchcommon.view.feedback.a */
public class DialogC54011a extends Dialog {

    /* renamed from: a */
    public final Context f133730a;

    /* renamed from: b */
    public final View f133731b;

    /* renamed from: c */
    public NestedScrollView f133732c;

    /* renamed from: d */
    public View f133733d;

    /* renamed from: e */
    public TagFlowLayout f133734e;

    /* renamed from: f */
    public RichTextEmojiconEditText f133735f;

    /* renamed from: g */
    public View f133736g;

    /* renamed from: h */
    public final LinkedHashSet<FeedbackReasonItem> f133737h = new LinkedHashSet<>();

    /* renamed from: i */
    public String f133738i = "";

    /* renamed from: j */
    public AbstractC54024b f133739j;

    /* renamed from: k */
    public final UIGetDataCallback<FeedbackResponse> f133740k = new UIGetDataCallback<FeedbackResponse>() {
        /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.C540218 */

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            UDToast.show(DialogC54011a.this.getContext(), (int) R.string.Lark_Search_FailedToSubmitFeedback);
            DialogC54011a.this.dismiss();
        }

        /* renamed from: a */
        public void onSuccessed(FeedbackResponse feedbackResponse) {
            String str;
            String str2 = DialogC54011a.this.f133741l;
            String str3 = "";
            if (DialogC54011a.this.f133739j == null) {
                str = str3;
            } else {
                str = DialogC54011a.this.f133739j.mo183184a().query;
            }
            if (DialogC54011a.this.f133739j != null) {
                str3 = DialogC54011a.this.f133739j.mo183184a().impr_id;
            }
            SearchClickReporter.m208836a(str2, "success", str, str3);
            new DialogC54026b(DialogC54011a.this.getContext()).show();
            DialogC54011a.this.dismiss();
        }
    };

    /* renamed from: l */
    public String f133741l = "";

    /* renamed from: m */
    private AbstractViewTreeObserver$OnGlobalLayoutListenerC54025c f133742m = new AbstractViewTreeObserver$OnGlobalLayoutListenerC54025c() {
        /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.C540121 */

        public void onGlobalLayout() {
            Rect rect = new Rect();
            DialogC54011a.this.f133731b.getWindowVisibleDisplayFrame(rect);
            int realScreenHeight = DeviceUtils.getRealScreenHeight(DialogC54011a.this.getContext());
            if (DesktopUtil.m144301a(DialogC54011a.this.f133730a)) {
                realScreenHeight = DeviceUtils.getScreenHeight(DialogC54011a.this.f133730a);
            }
            boolean a = DialogC54011a.m209647a(realScreenHeight - rect.bottom, realScreenHeight);
            Log.m165379d("SearchFeedbackDialog", "isKeyboardShow = " + a);
            if (a && !this.f133757b) {
                DialogC54011a.this.f133732c.mo4753b(130);
            }
            this.f133757b = a;
            if (!a) {
                DialogC54011a.this.f133735f.clearFocus();
            }
        }
    };

    /* renamed from: n */
    private final TextWatcher f133743n = new TextWatcher() {
        /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.C540132 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            DialogC54011a.this.f133738i = editable.toString();
            DialogC54011a.this.mo184915a();
        }
    };

    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.a$b */
    public interface AbstractC54024b {
        /* renamed from: a */
        IntegrationSearchRequest mo183184a();

        /* renamed from: b */
        List<SearchResult> mo183185b();
    }

    /* renamed from: a */
    public static boolean m209647a(int i, int i2) {
        return ((float) i) > ((float) i2) / 6.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.a$c */
    public static abstract class AbstractViewTreeObserver$OnGlobalLayoutListenerC54025c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        boolean f133757b;

        private AbstractViewTreeObserver$OnGlobalLayoutListenerC54025c() {
        }
    }

    /* renamed from: b */
    private void m209649b() {
        SdkSender.sendPassThroughRequest(Command.GET_FEEDBACK_REASON_ITEMS, new FeedbackReasonRequest.C49463a(), new UIGetDataCallback<FeedbackReasonResponse>() {
            /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.C540143 */

            /* renamed from: a */
            public void onSuccessed(FeedbackReasonResponse feedbackReasonResponse) {
                if (!(feedbackReasonResponse == null || feedbackReasonResponse.mreason_items == null || feedbackReasonResponse.mreason_items.isEmpty())) {
                    DialogC54011a.this.f133733d.setVisibility(0);
                    DialogC54011a.this.f133734e.setAdapter(new C54023a(feedbackReasonResponse.mreason_items));
                }
                DialogC54011a.this.show();
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Log.m165383e("LarkSearch.Common.SearchFeedbackDialog", "err! " + errorResult.getDebugMsg());
                DialogC54011a.this.f133733d.setVisibility(8);
                DialogC54011a.this.show();
            }
        }, new SdkSender.IParser<FeedbackReasonResponse>() {
            /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.C540154 */

            /* renamed from: a */
            public FeedbackReasonResponse parse(byte[] bArr) throws IOException {
                return FeedbackReasonResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo184915a() {
        boolean z;
        View view = this.f133736g;
        if (!this.f133737h.isEmpty() || !C57782ag.m224241a(this.f133738i)) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
    }

    public void dismiss() {
        this.f133735f.removeTextChangedListener(this.f133743n);
        KeyboardUtils.hideKeyboard(this.f133730a, this.f133731b);
        super.dismiss();
    }

    public void show() {
        Context context = this.f133730a;
        if ((context instanceof Activity) && C57582a.m223607a((Activity) context)) {
            m209651d();
            super.show();
            m209650c();
        }
    }

    /* renamed from: c */
    private void m209650c() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = DeviceUtils.getScreenWidth(getContext());
            attributes.height = -2;
            attributes.softInputMode = 16;
            window.setAttributes(attributes);
            window.setDimAmount(0.3f);
            window.setWindowAnimations(R.style.AniBottomInBottomOut);
        }
    }

    /* renamed from: d */
    private void m209651d() {
        this.f133736g.setEnabled(false);
        this.f133735f.setText("");
        this.f133731b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f133742m);
        this.f133742m.f133757b = false;
        this.f133731b.getViewTreeObserver().addOnGlobalLayoutListener(this.f133742m);
    }

    /* renamed from: e */
    private void m209652e() {
        this.f133732c = (NestedScrollView) findViewById(R.id.nsv_content);
        this.f133733d = findViewById(R.id.fl_suggestion_title);
        this.f133734e = (TagFlowLayout) findViewById(R.id.fl_suggestion);
        this.f133735f = (RichTextEmojiconEditText) findViewById(R.id.et_suggestion);
        this.f133736g = findViewById(R.id.confirm_btn);
        this.f133731b.post(new Runnable() {
            /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.RunnableC540165 */

            public void run() {
                ImageView imageView = (ImageView) DialogC54011a.this.findViewById(R.id.iv_close);
                imageView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.searchcommon.view.feedback.$$Lambda$a$5$ycuEhEp8j6m1zItN0Sgsb0wj4o */

                    public final void onClick(View view) {
                        DialogC54011a.RunnableC540165.this.m209658a(view);
                    }
                });
                Rect rect = new Rect();
                imageView.getHitRect(rect);
                rect.right += 100;
                rect.left -= 100;
                rect.top = 0;
                rect.bottom = LocationRequest.PRIORITY_HD_ACCURACY;
                TouchDelegate touchDelegate = new TouchDelegate(rect, imageView);
                if (imageView.getParent().getParent() instanceof View) {
                    ((View) imageView.getParent().getParent()).setTouchDelegate(touchDelegate);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m209658a(View view) {
                DialogC54011a.this.dismiss();
            }
        });
        this.f133734e.setOnTagClickListener(new TagFlowLayout.AbstractC26224b() {
            /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.C540176 */

            @Override // com.larksuite.framework.ui.flowlayout.TagFlowLayout.AbstractC26224b
            /* renamed from: a */
            public boolean mo93289a(View view, int i, FlowLayout flowLayout) {
                DialogC54011a.this.f133735f.clearFocus();
                FeedbackReasonItem feedbackReasonItem = (FeedbackReasonItem) DialogC54011a.this.f133734e.getAdapter().mo93291a(i);
                if (DialogC54011a.this.f133737h.contains(feedbackReasonItem)) {
                    DialogC54011a.this.f133737h.remove(feedbackReasonItem);
                } else {
                    DialogC54011a.this.f133737h.add(feedbackReasonItem);
                }
                DialogC54011a.this.mo184915a();
                return false;
            }
        });
        this.f133735f.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.searchcommon.view.feedback.$$Lambda$a$spKDJzCAKG4zCcNJOLsmyIHQoXQ */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogC54011a.this.m209648a(view, motionEvent);
            }
        });
        this.f133735f.addTextChangedListener(this.f133743n);
        final View findViewById = findViewById(R.id.loading);
        this.f133736g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.View$OnClickListenerC540187 */

            public void onClick(View view) {
                DialogC54011a.this.f133736g.setEnabled(false);
                findViewById.setVisibility(0);
                IntegrationSearchRequest a = new IntegrationSearchRequest.C18831a().mo64662a("").mo64660a(Scene.Type.SMART_SEARCH).build();
                ArrayList arrayList = new ArrayList();
                if (DialogC54011a.this.f133739j != null) {
                    a = DialogC54011a.this.f133739j.mo183184a();
                    arrayList.addAll(DialogC54011a.this.f133739j.mo183185b());
                    Log.m165379d("LarkSearch.Common.SearchFeedbackDialog", "integrationSearchRequest: " + a.toString() + " results: " + arrayList);
                }
                Log.m165379d("LarkSearch.Common.SearchFeedbackDialog", "mSuggestion: " + DialogC54011a.this.f133738i);
                ArrayList arrayList2 = new ArrayList();
                Iterator<FeedbackReasonItem> it = DialogC54011a.this.f133737h.iterator();
                while (it.hasNext()) {
                    FeedbackReasonItem next = it.next();
                    arrayList2.add(new com.bytedance.lark.pb.search.feedback.v1.FeedbackReasonItem(next.mid, next.mcontent));
                }
                SdkSender.asynSendRequestNonWrap(com.bytedance.lark.pb.basic.v1.Command.POST_SEARCH_FEEDBACK, new FeedbackRequest.C18751a().mo64459a(DialogC54011a.this.f133738i).mo64460a(arrayList2).mo64458a(FeedbackRequest.Scene.IntegrationSearch).mo64457a(new FeedbackParam.C18745a().mo64443a(new IntegrationSearchParam.C18755a().mo64469a(a).mo64470a(arrayList).build()).build()), new IGetDataCallback<FeedbackResponse>() {
                    /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.View$OnClickListenerC540187.C540191 */

                    /* renamed from: a */
                    public void onSuccess(FeedbackResponse feedbackResponse) {
                        DialogC54011a.this.f133740k.onSuccess(feedbackResponse);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        DialogC54011a.this.f133740k.onError(errorResult);
                    }
                }, new SdkSender.IParser<FeedbackResponse>() {
                    /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.View$OnClickListenerC540187.C540202 */

                    /* renamed from: a */
                    public FeedbackResponse parse(byte[] bArr) throws IOException {
                        return FeedbackResponse.ADAPTER.decode(bArr);
                    }
                });
            }
        });
        m209646a((TextView) findViewById(R.id.tv_agreement));
    }

    /* renamed from: a */
    public void mo184916a(AbstractC54024b bVar) {
        this.f133739j = bVar;
    }

    /* renamed from: a */
    public void mo184917a(String str) {
        this.f133741l = str;
    }

    public DialogC54011a(Context context) {
        super(context, R.style.CommonDialog);
        this.f133730a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.search_feedback_popup_window_layout, (ViewGroup) null);
        this.f133731b = inflate;
        setContentView(inflate);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        setCanceledOnTouchOutside(true);
        m209652e();
        m209649b();
    }

    /* renamed from: a */
    private void m209646a(TextView textView) {
        HashMap hashMap = new HashMap();
        String string = getContext().getString(R.string.Lark_Guide_V3_PrivacyPolicy);
        hashMap.put("PrivacyPolicy", string);
        String mustacheFormat = UIHelper.mustacheFormat(getContext().getString(R.string.Lark_search_feedback_regulations), hashMap);
        if (mustacheFormat != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mustacheFormat);
            C540229 r3 = new ClickableSpan() {
                /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.C540229 */

                public void updateDrawState(TextPaint textPaint) {
                }

                public void onClick(View view) {
                    SearchCommonModuleDependency.m208732b().mo102902a(DialogC54011a.this.getContext());
                }
            };
            int indexOf = mustacheFormat.indexOf(string);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(r3, indexOf, string.length() + indexOf, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.primary_pri_500)), indexOf, string.length() + indexOf, 33);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(spannableStringBuilder);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.a$a */
    public class C54023a extends AbstractC26225a<FeedbackReasonItem> {
        public C54023a(List<FeedbackReasonItem> list) {
            super(new ArrayList(list));
        }

        /* renamed from: a */
        public View mo93290a(FlowLayout flowLayout, int i, FeedbackReasonItem feedbackReasonItem) {
            TextView textView = (TextView) LayoutInflater.from(DialogC54011a.this.getContext()).inflate(R.layout.item_search_feedback_reason, (ViewGroup) null);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int a = C57582a.m223600a(12);
            marginLayoutParams.setMargins(0, a, a, 0);
            textView.setLayoutParams(marginLayoutParams);
            textView.setText(feedbackReasonItem.mcontent);
            return textView;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m209648a(View view, MotionEvent motionEvent) {
        if (this.f133735f.hasFocus()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 8) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }
}
