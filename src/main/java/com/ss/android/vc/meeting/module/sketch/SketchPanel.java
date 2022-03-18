package com.ss.android.vc.meeting.module.sketch;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.IconFontRadioButton;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sketch.SketchListener;
import com.ss.android.vc.meeting.module.sketch.utils.SketchUtilKt;

public class SketchPanel extends FrameLayout {
    private IconFontRadioButton mArrowButton;
    private TextView mArrowText;
    private RadioGroup mBrushPickerRg;
    public SketchListener.OnPanelClickListener mClickPanelListener;
    private RadioGroup mColorPickerRg;
    private int mCurrentBrushId;
    private int mCurrentColor;
    private int mCurrentColorId;
    private IconFontRadioButton mHighLighterButton;
    private TextView mHighLighterText;
    private IconFontRadioButton mPenButton;
    private TextView mPenText;
    private IconFontView mSketchExitBt;
    private SketchListener.ITurnOffListener mSketchTurnOffListener;
    public IconFontView mSketchUndoBt;
    boolean mSketchUndoEnabled;
    public TextView mSketchUndoTx;
    private SparseIntArray resIdToColor;
    private String sketchInstanceId;

    public int getCurrentColor() {
        return this.mCurrentColor;
    }

    public void clickExit() {
        this.mSketchExitBt.performClick();
    }

    private void removeSelf() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public int getVisionHeight() {
        return getBottom() - this.mColorPickerRg.getTop();
    }

    private void initCurrentColorId() {
        for (int i = 0; i < this.resIdToColor.size(); i++) {
            if (this.resIdToColor.valueAt(i) == this.mCurrentColor) {
                this.mCurrentColorId = this.resIdToColor.keyAt(i);
                return;
            }
        }
    }

    public static boolean isMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public void getSketchInstanceId() {
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
        if (kVar != null) {
            this.sketchInstanceId = kVar.ag().getSketchInstanceId();
        }
    }

    private void init() {
        this.resIdToColor.append(R.id.rb_color_blue, C60773o.m236126d(R.color.vc_annotate_bg_blue));
        this.resIdToColor.append(R.id.rb_color_green, C60773o.m236126d(R.color.vc_annotate_bg_green));
        this.resIdToColor.append(R.id.rb_color_red, C60773o.m236126d(R.color.vc_annotate_bg_red));
        this.resIdToColor.append(R.id.rb_color_yellow, C60773o.m236126d(R.color.vc_annotate_bg_yellow));
        this.resIdToColor.append(R.id.rb_color_purple, C60773o.m236126d(R.color.vc_annotate_bg_purple));
        this.mCurrentColor = SketchUtilKt.rgbaToArgb(Sketch.getSketchDefaultColor(this.sketchInstanceId));
        initCurrentColorId();
        setUI(C60776r.m236143a(C60773o.m236124b(getContext())));
    }

    public void setOnClickPanelListener(SketchListener.OnPanelClickListener onPanelClickListener) {
        this.mClickPanelListener = onPanelClickListener;
    }

    public void setSketchTurnOffListener(SketchListener.ITurnOffListener iTurnOffListener) {
        this.mSketchTurnOffListener = iTurnOffListener;
    }

    public SketchPanel(Context context) {
        this(context, null);
    }

    public void onOrientationChanged(boolean z) {
        removeAllViews();
        setUI(z);
    }

    public /* synthetic */ void lambda$setUI$5$SketchPanel(View view) {
        removeSelf();
        SketchListener.ITurnOffListener iTurnOffListener = this.mSketchTurnOffListener;
        if (iTurnOffListener != null) {
            iTurnOffListener.onTurnSketchOff();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: enableUndo */
    public void lambda$onSelfShapeCountChanged$6$SketchPanel(boolean z) {
        this.mSketchUndoBt.setEnabled(z);
        this.mSketchUndoTx.setEnabled(z);
        showShadow(this.mSketchUndoBt, z);
        showShadow(this.mSketchUndoTx, z);
    }

    public void onSelfShapeCountChanged(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.mSketchUndoEnabled != z) {
            this.mSketchUndoEnabled = z;
            if (isMainThread()) {
                lambda$onSelfShapeCountChanged$6$SketchPanel(z);
            } else {
                post(new Runnable(z) {
                    /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchPanel$UPkemQ2qNU_Q38dhZm_qAfP73pc */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        SketchPanel.this.lambda$onSelfShapeCountChanged$6$SketchPanel(this.f$1);
                    }
                });
            }
        }
    }

    private void setUI(boolean z) {
        if (z) {
            LayoutInflater.from(getContext()).inflate(R.layout.vc_frame_sketch_panel_land, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.vc_frame_sketch_panel, (ViewGroup) this, true);
        }
        C60700b.m235851b("SketchPanel", "[setUI]", "set panel listener, isLandscape = " + z);
        this.mSketchExitBt = (IconFontView) findViewById(R.id.iv_exit_sketch);
        this.mSketchUndoBt = (IconFontView) findViewById(R.id.iv_sketch_undo);
        this.mSketchUndoTx = (TextView) findViewById(R.id.tv_sketch_undo);
        this.mBrushPickerRg = (RadioGroup) findViewById(R.id.rg_brush_picker);
        this.mColorPickerRg = (RadioGroup) findViewById(R.id.rg_color_picker);
        this.mPenButton = (IconFontRadioButton) findViewById(R.id.rb_sketch_pen);
        this.mHighLighterButton = (IconFontRadioButton) findViewById(R.id.rb_sketch_highlighter);
        this.mArrowButton = (IconFontRadioButton) findViewById(R.id.rb_sketch_arrow);
        this.mPenText = (TextView) findViewById(R.id.tv_sketch_pen_text);
        this.mHighLighterText = (TextView) findViewById(R.id.tv_sketch_highlighter_text);
        this.mArrowText = (TextView) findViewById(R.id.tv_sketch_arrow_text);
        this.mPenButton.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchPanel$ZtaCimhwfzl1xnlUng9YsznwrIA */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SketchPanel.this.lambda$setUI$0$SketchPanel(view, motionEvent);
            }
        });
        this.mHighLighterButton.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchPanel$aKJvMVH40qMFtdxSnKERp0PbbZo */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SketchPanel.this.lambda$setUI$1$SketchPanel(view, motionEvent);
            }
        });
        this.mArrowButton.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchPanel$brYWytAva_Da4HYk557iM5aYVx8 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SketchPanel.this.lambda$setUI$2$SketchPanel(view, motionEvent);
            }
        });
        int i = this.mCurrentBrushId;
        if (i != -1) {
            this.mBrushPickerRg.check(i);
        }
        int i2 = this.mCurrentColorId;
        if (i2 != -1) {
            this.mColorPickerRg.check(i2);
        }
        this.mBrushPickerRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchPanel$erOovgFnoHjgA8QtaxKmdJk_Yxs */

            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                SketchPanel.this.lambda$setUI$3$SketchPanel(radioGroup, i);
            }
        });
        this.mColorPickerRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchPanel$4coYfUxl_PlNP4IH3U4HLewKr5E */

            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                SketchPanel.this.lambda$setUI$4$SketchPanel(radioGroup, i);
            }
        });
        this.mSketchExitBt.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchPanel$2_RW7OWNVUX3YN4u2LyqnnnkXhA */

            public final void onClick(View view) {
                SketchPanel.this.lambda$setUI$5$SketchPanel(view);
            }
        });
        this.mSketchUndoBt.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchPanel.View$OnTouchListenerC630931 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    SketchPanel.this.mSketchUndoTx.setPressed(true);
                    SketchPanel.this.mSketchUndoBt.setPressed(true);
                } else if (motionEvent.getAction() == 1) {
                    SketchPanel.this.mSketchUndoTx.setPressed(false);
                    SketchPanel.this.mSketchUndoBt.setPressed(false);
                    if (SketchPanel.this.mClickPanelListener != null) {
                        SketchPanel.this.mClickPanelListener.onClickUndo();
                    }
                }
                return true;
            }
        });
    }

    public SketchPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void showShadow(TextView textView, boolean z) {
        if (z) {
            textView.setShadowLayer(2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, C60773o.m236126d(R.color.ud_N900_40));
        } else {
            textView.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, C60773o.m236126d(R.color.ud_N00_00));
        }
    }

    public /* synthetic */ void lambda$setUI$4$SketchPanel(RadioGroup radioGroup, int i) {
        this.mCurrentColorId = i;
        SketchListener.OnPanelClickListener onPanelClickListener = this.mClickPanelListener;
        if (onPanelClickListener != null) {
            onPanelClickListener.onClickColor(this.resIdToColor.get(i, C60773o.m236126d(R.color.vc_annotate_bg_red)));
        }
    }

    public /* synthetic */ boolean lambda$setUI$0$SketchPanel(View view, MotionEvent motionEvent) {
        if (this.mPenButton.isChecked()) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.mPenText.setPressed(true);
            this.mPenButton.setPressed(true);
        } else if (motionEvent.getAction() == 1) {
            this.mPenText.setPressed(false);
            this.mPenButton.setPressed(false);
            this.mPenButton.setChecked(true);
            updateRadioShadow(false, true, true);
        }
        return true;
    }

    public /* synthetic */ boolean lambda$setUI$1$SketchPanel(View view, MotionEvent motionEvent) {
        if (this.mHighLighterButton.isChecked()) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.mHighLighterText.setPressed(true);
            this.mHighLighterButton.setPressed(true);
        } else if (motionEvent.getAction() == 1) {
            this.mHighLighterText.setPressed(false);
            this.mHighLighterButton.setPressed(false);
            this.mHighLighterButton.setChecked(true);
            updateRadioShadow(true, false, true);
        }
        return true;
    }

    public /* synthetic */ boolean lambda$setUI$2$SketchPanel(View view, MotionEvent motionEvent) {
        if (this.mArrowButton.isChecked()) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.mArrowText.setPressed(true);
            this.mArrowButton.setPressed(true);
        } else if (motionEvent.getAction() == 1) {
            this.mArrowText.setPressed(false);
            this.mArrowButton.setPressed(false);
            this.mArrowButton.setChecked(true);
            updateRadioShadow(true, true, false);
        }
        return true;
    }

    public /* synthetic */ void lambda$setUI$3$SketchPanel(RadioGroup radioGroup, int i) {
        SketchListener.OnPanelClickListener onPanelClickListener;
        this.mCurrentBrushId = i;
        if (i == R.id.rb_sketch_pen) {
            SketchListener.OnPanelClickListener onPanelClickListener2 = this.mClickPanelListener;
            if (onPanelClickListener2 != null) {
                onPanelClickListener2.onClickPen();
            }
        } else if (i == R.id.rb_sketch_highlighter) {
            SketchListener.OnPanelClickListener onPanelClickListener3 = this.mClickPanelListener;
            if (onPanelClickListener3 != null) {
                onPanelClickListener3.onClickHighlight();
            }
        } else if (i == R.id.rb_sketch_arrow && (onPanelClickListener = this.mClickPanelListener) != null) {
            onPanelClickListener.onClickArrow();
        }
    }

    private void updateRadioShadow(boolean z, boolean z2, boolean z3) {
        showShadow(this.mPenButton, z);
        showShadow(this.mHighLighterButton, z2);
        showShadow(this.mArrowButton, z3);
    }

    public SketchPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentBrushId = -1;
        this.mCurrentColorId = -1;
        this.resIdToColor = new SparseIntArray();
        this.mSketchUndoEnabled = true;
        getSketchInstanceId();
        init();
        onSelfShapeCountChanged(0);
    }
}
