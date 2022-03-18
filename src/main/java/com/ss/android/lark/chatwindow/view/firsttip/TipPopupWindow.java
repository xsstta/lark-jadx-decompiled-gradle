package com.ss.android.lark.chatwindow.view.firsttip;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.RichTextView;
import java.util.HashMap;
import java.util.Map;

public class TipPopupWindow extends BasePopupWindow {

    /* renamed from: a */
    private static final Map<WHICH, Map<String, Integer>> f91126a;

    /* renamed from: b */
    private Activity f91127b;

    /* renamed from: c */
    private View f91128c;

    /* renamed from: d */
    private View f91129d;

    /* renamed from: e */
    private View f91130e;

    /* renamed from: f */
    private View f91131f;

    /* renamed from: g */
    private final WHICH f91132g;

    /* renamed from: h */
    private PopupWindow.OnDismissListener f91133h;

    public enum WHICH {
        AT,
        READSTATE,
        PIN_ATALL,
        PIN_SLIDE_MENU,
        MEETING_MINUTE,
        HELP_DESK_MINI_PROGRAM
    }

    /* renamed from: com.ss.android.lark.chatwindow.view.firsttip.TipPopupWindow$a */
    public interface AbstractC35274a {
        /* renamed from: a */
        void mo129826a();
    }

    /* renamed from: c */
    private void m137781c() {
        this.f91128c.setFocusable(true);
        this.f91128c.setFocusableInTouchMode(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(true);
        m137782d();
    }

    /* renamed from: a */
    public void mo99354a() {
        Activity activity = this.f91127b;
        if (activity != null && !activity.isFinishing() && isShowing()) {
            dismiss();
        }
    }

    /* renamed from: b */
    public void mo99355b() {
        mo99354a();
        this.f91127b = null;
        this.f91128c = null;
        this.f91129d = null;
        this.f91130e = null;
        this.f91131f = null;
        PopupWindow.OnDismissListener onDismissListener = this.f91133h;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void dismiss() {
        Activity activity;
        if (isShowing() && (activity = this.f91127b) != null && UIUtils.isActivityRunning(activity)) {
            super.dismiss();
        }
    }

    /* renamed from: d */
    private void m137782d() {
        View findViewById = this.f91128c.findViewById(R.id.hint_i_had_know);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatwindow.view.firsttip.TipPopupWindow.View$OnClickListenerC352701 */

                public void onClick(View view) {
                    TipPopupWindow.this.mo99355b();
                }
            });
        } else {
            this.f91128c.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chatwindow.view.firsttip.TipPopupWindow.View$OnClickListenerC352712 */

                public void onClick(View view) {
                    TipPopupWindow.this.mo99355b();
                }
            });
        }
        this.f91128c.setOnKeyListener(new View.OnKeyListener() {
            /* class com.ss.android.lark.chatwindow.view.firsttip.TipPopupWindow.View$OnKeyListenerC352723 */

            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                TipPopupWindow.this.mo99355b();
                return true;
            }
        });
        setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.lark.chatwindow.view.firsttip.TipPopupWindow.C352734 */

            public void onDismiss() {
                TipPopupWindow.this.mo99355b();
            }
        });
    }

    static {
        HashMap hashMap = new HashMap();
        f91126a = hashMap;
        hashMap.put(WHICH.AT, new HashMap());
        ((Map) hashMap.get(WHICH.AT)).put("layout", Integer.valueOf((int) R.layout.popup_tip_at_somebody));
        ((Map) hashMap.get(WHICH.AT)).put("key_read_state_triangle_up", Integer.valueOf((int) R.id.read_state_hint_leading_dot_up));
        ((Map) hashMap.get(WHICH.AT)).put("key_read_state_triangle_down", Integer.valueOf((int) R.id.read_state_hint_leading_dot_down));
        ((Map) hashMap.get(WHICH.AT)).put("key_read_state_body", Integer.valueOf((int) R.id.read_state_hint_at));
        hashMap.put(WHICH.READSTATE, new HashMap());
        ((Map) hashMap.get(WHICH.READSTATE)).put("layout", Integer.valueOf((int) R.layout.popup_tip_read_state));
        ((Map) hashMap.get(WHICH.READSTATE)).put("key_read_state_triangle_up", Integer.valueOf((int) R.id.read_state_hint_leading_circle_up));
        ((Map) hashMap.get(WHICH.READSTATE)).put("key_read_state_triangle_down", Integer.valueOf((int) R.id.read_state_hint_leading_circle_down));
        ((Map) hashMap.get(WHICH.READSTATE)).put("key_read_state_body", Integer.valueOf((int) R.id.read_state_hint_ru));
        hashMap.put(WHICH.PIN_ATALL, new HashMap());
        ((Map) hashMap.get(WHICH.PIN_ATALL)).put("layout", Integer.valueOf((int) R.layout.popup_tip_pin_atall));
        ((Map) hashMap.get(WHICH.PIN_ATALL)).put("key_read_state_triangle_up", Integer.valueOf((int) R.id.up_arrow));
        ((Map) hashMap.get(WHICH.PIN_ATALL)).put("key_read_state_triangle_down", Integer.valueOf((int) R.id.down_arrow));
        Integer valueOf = Integer.valueOf((int) R.id.tip_body);
        ((Map) hashMap.get(WHICH.PIN_ATALL)).put("key_read_state_body", valueOf);
        hashMap.put(WHICH.PIN_SLIDE_MENU, new HashMap());
        Integer valueOf2 = Integer.valueOf((int) R.layout.popup_tip_pin_slidemenu);
        ((Map) hashMap.get(WHICH.PIN_SLIDE_MENU)).put("layout", valueOf2);
        ((Map) hashMap.get(WHICH.PIN_SLIDE_MENU)).put("key_read_state_body", valueOf);
        ((Map) hashMap.get(WHICH.PIN_SLIDE_MENU)).put("key_read_state_triangle_up", -1);
        ((Map) hashMap.get(WHICH.PIN_SLIDE_MENU)).put("key_read_state_triangle_down", -1);
        hashMap.put(WHICH.MEETING_MINUTE, new HashMap());
        ((Map) hashMap.get(WHICH.MEETING_MINUTE)).put("layout", valueOf2);
        ((Map) hashMap.get(WHICH.MEETING_MINUTE)).put("key_read_state_body", valueOf);
        ((Map) hashMap.get(WHICH.MEETING_MINUTE)).put("key_read_state_triangle_up", -1);
        ((Map) hashMap.get(WHICH.MEETING_MINUTE)).put("key_read_state_triangle_down", -1);
        hashMap.put(WHICH.HELP_DESK_MINI_PROGRAM, new HashMap());
        ((Map) hashMap.get(WHICH.HELP_DESK_MINI_PROGRAM)).put("layout", Integer.valueOf((int) R.layout.popup_tip_helpdesk_titlebar));
        ((Map) hashMap.get(WHICH.HELP_DESK_MINI_PROGRAM)).put("key_read_state_body", valueOf);
        ((Map) hashMap.get(WHICH.HELP_DESK_MINI_PROGRAM)).put("key_read_state_triangle_up", -1);
        ((Map) hashMap.get(WHICH.HELP_DESK_MINI_PROGRAM)).put("key_read_state_triangle_down", -1);
    }

    public TipPopupWindow(Context context, WHICH which) {
        super(-2, -2);
        if (context instanceof Activity) {
            this.f91127b = (Activity) context;
        } else if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                this.f91127b = (Activity) baseContext;
            }
        }
        this.f91132g = which;
        Map<String, Integer> map = f91126a.get(which);
        View inflate = LayoutInflater.from(context).inflate(map.get("layout").intValue(), (ViewGroup) null);
        this.f91128c = inflate;
        if (inflate != null) {
            this.f91129d = inflate.findViewById(map.get("key_read_state_triangle_up").intValue());
            this.f91130e = this.f91128c.findViewById(map.get("key_read_state_triangle_down").intValue());
            this.f91131f = this.f91128c.findViewById(map.get("key_read_state_body").intValue());
            setContentView(this.f91128c);
            m137781c();
        }
    }

    /* renamed from: a */
    public void mo129821a(View view, PopupWindow.OnDismissListener onDismissListener, AbstractC35274a aVar) {
        Activity activity;
        boolean z;
        int i;
        int i2;
        int i3;
        if (view != null && (activity = this.f91127b) != null && UIUtils.isActivityRunning(activity)) {
            this.f91133h = onDismissListener;
            View view2 = this.f91130e;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.f91129d;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int screenWidth = DeviceUtils.getScreenWidth(this.f91127b);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int height = UIUtils.getHeight(this.f91130e);
            int height2 = UIUtils.getHeight(this.f91131f);
            int width = UIUtils.getWidth(this.f91131f);
            if (iArr[1] > height2 + height + UIHelper.dp2px(12.0f)) {
                z = true;
            } else {
                z = false;
            }
            int[] iArr2 = new int[2];
            if (this.f91132g == WHICH.AT) {
                View findViewById = view.findViewById(R.id.content);
                if (findViewById != null) {
                    View findViewById2 = findViewById.findViewById(R.id.message);
                    if (findViewById2 instanceof RichTextView) {
                        RichTextView richTextView = (RichTextView) findViewById2;
                        if (richTextView.getChildAt(0) instanceof LinkEmojiTextView) {
                            LinkEmojiTextView linkEmojiTextView = (LinkEmojiTextView) richTextView.getChildAt(0);
                            if (linkEmojiTextView.getFirstSpanDotLocation()[0] < BitmapDescriptorFactory.HUE_RED || linkEmojiTextView.getFirstSpanDotLocation()[1] < BitmapDescriptorFactory.HUE_RED) {
                                Log.m165383e("TipPopupWindow", "Fail to show at tips, at dot is -1");
                                return;
                            }
                            iArr2 = m137779a(view, screenWidth, width, height2, height, z);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.f91132g == WHICH.READSTATE) {
                iArr2 = m137780a(iArr, screenWidth, width, height2, height, measuredWidth, measuredHeight, z);
            } else if (this.f91132g == WHICH.PIN_ATALL) {
                view.getLocationInWindow(iArr);
                int i4 = iArr[0];
                int dp2px = (UIUtils.getDisplayMetrics(view.getContext()).widthPixels - i4) - UIHelper.dp2px(16.0f);
                if (width > dp2px) {
                    ViewGroup.LayoutParams layoutParams = this.f91131f.getLayoutParams();
                    layoutParams.width = dp2px;
                    this.f91131f.setLayoutParams(layoutParams);
                }
                if (z) {
                    this.f91130e.setVisibility(0);
                    i3 = (iArr[1] - height2) - height;
                } else {
                    this.f91129d.setVisibility(0);
                    i3 = iArr[1] + height2 + height;
                }
                iArr2[0] = i4;
                iArr2[1] = i3;
            } else if (this.f91132g == WHICH.PIN_SLIDE_MENU) {
                if (!DesktopUtil.m144307b()) {
                    i = iArr[0] - UIUtils.getWidth(this.f91131f);
                    i2 = iArr[1];
                } else {
                    i = (iArr[0] - UIUtils.getWidth(this.f91131f)) + UIUtils.dp2px(view.getContext(), 30.0f);
                    i2 = iArr[1] + UIUtils.dp2px(view.getContext(), 11.0f);
                }
                iArr2[0] = i;
                iArr2[1] = i2;
            } else if (this.f91132g == WHICH.MEETING_MINUTE) {
                iArr2[0] = (iArr[0] - UIUtils.getWidth(this.f91131f)) + UIUtils.dp2px(view.getContext(), 30.0f);
                iArr2[1] = iArr[1] + UIUtils.dp2px(view.getContext(), 11.0f);
                ((TextView) this.f91128c.findViewById(R.id.tip_text)).setText(R.string.Calendar_MeetingNotes_CreateTips);
            } else if (this.f91132g == WHICH.HELP_DESK_MINI_PROGRAM) {
                iArr2[0] = (iArr[0] - UIUtils.getWidth(this.f91131f)) + UIUtils.dp2px(view.getContext(), 30.0f);
                iArr2[1] = iArr[1] + UIUtils.dp2px(view.getContext(), 30.0f);
                ((TextView) this.f91128c.findViewById(R.id.tip_text)).setText(R.string.Lark_HelpDesk_TicketSidebarGuideTips);
            }
            if (view.getWindowToken() != null) {
                if (this.f91132g == WHICH.PIN_ATALL || this.f91132g == WHICH.PIN_SLIDE_MENU || this.f91132g == WHICH.MEETING_MINUTE) {
                    mo93124a(false);
                } else {
                    mo93124a(true);
                }
                showAtLocation(view, 8388659, iArr2[0], iArr2[1]);
                aVar.mo129826a();
            }
        }
    }

    /* renamed from: a */
    private int[] m137779a(View view, int i, int i2, int i3, int i4, boolean z) {
        View view2;
        int i5;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.content);
        LinkEmojiTextView linkEmojiTextView = (LinkEmojiTextView) ((RichTextView) frameLayout.findViewById(R.id.message)).getChildAt(0);
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        int dp2px = (int) ((linkEmojiTextView.getFirstSpanDotLocation()[0] + ((float) iArr[0])) - ((float) UIHelper.dp2px(2.5f)));
        int i6 = (int) (linkEmojiTextView.getFirstSpanDotLocation()[1] + ((float) iArr[1]));
        if (z) {
            view2 = this.f91130e;
            i6 = ((i6 - i3) - i4) + UIHelper.dp2px(7.0f);
        } else {
            view2 = this.f91129d;
        }
        view2.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view2.getLayoutParams();
        int i7 = i - dp2px;
        int i8 = i2 / 2;
        if (dp2px < UIHelper.dp2px(12.0f) + i8) {
            i5 = UIHelper.dp2px(12.0f);
            layoutParams.setMargins(0, 0, (i8 + i5) - dp2px, 0);
        } else if (i7 < UIHelper.dp2px(12.0f) + i8) {
            i5 = (i - UIHelper.dp2px(12.0f)) - i2;
            layoutParams.setMargins((dp2px - i5) - i8, 0, 0, 0);
        } else {
            i5 = dp2px - i8;
        }
        return new int[]{i5, i6};
    }

    /* renamed from: a */
    private int[] m137780a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        View view;
        int i7;
        int i8;
        if (z) {
            view = this.f91130e;
            i7 = ((iArr[1] + i6) - i3) - i4;
        } else {
            view = this.f91129d;
            i7 = iArr[1];
        }
        int i9 = iArr[0] + (i5 / 2);
        view.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        int i10 = i - i9;
        int i11 = i2 / 2;
        if (i9 < UIHelper.dp2px(12.0f) + i11) {
            i8 = UIHelper.dp2px(12.0f);
            layoutParams.setMargins(0, 0, (i11 + i8) - i9, 0);
        } else if (i10 < UIHelper.dp2px(12.0f) + i11) {
            i8 = (i - UIHelper.dp2px(12.0f)) - i2;
            layoutParams.setMargins((i9 - i8) - i11, 0, 0, 0);
        } else {
            i8 = i9 - i11;
        }
        return new int[]{i8, i7};
    }
}
