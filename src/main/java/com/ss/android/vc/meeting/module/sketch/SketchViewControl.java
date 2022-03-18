package com.ss.android.vc.meeting.module.sketch;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.sketch.SketchListener;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.SketchViewControl;
import com.ss.android.vc.meeting.module.sketch.action.SketchMode;
import com.ss.android.vc.meeting.p3104c.C61246b;
import com.ss.android.vc.statistics.event.C63745b;

public class SketchViewControl extends AbstractC61424d implements ISketchViewListener {
    public FrameLayout mSketchControlContainer;
    public SketchPanel mSketchPanel;
    public C61246b mWrapper;
    public final AbsSketchControl sketchControl;

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void showSketch() {
        init();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void closeSketchPenel() {
        SketchPanel sketchPanel = this.mSketchPanel;
        if (sketchPanel != null) {
            sketchPanel.clickExit();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        super.destroy();
        hideView();
        getMeeting().ag().removeSketchViewListener(this);
    }

    public /* synthetic */ void lambda$onOrientation$0$SketchViewControl() {
        SketchPanel sketchPanel = this.mSketchPanel;
        if (sketchPanel != null) {
            getMeeting().ar().mo216856b(sketchPanel.getVisionHeight() + C60773o.m236115a(16.0d));
        }
    }

    public void switchVisible() {
        FrameLayout frameLayout = this.mSketchControlContainer;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            setVisible(true);
        } else {
            setVisible(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void hideView() {
        FrameLayout frameLayout = this.mSketchControlContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        getMeeting().ar().mo216854a(false, 0);
        if ((!C61999a.m242220f() && !C60776r.m236157o()) || (C60776r.m236157o() && getActivity().getRequestedOrientation() == 1)) {
            getMeeting().ai().e_(true);
        }
        this.mSketchPanel = null;
        this.mSketchControlContainer = null;
        this.mWrapper = null;
        this.sketchControl.setOnSketchVisiblityListener(null);
        this.sketchControl.setOnSketchStartFailListener(null);
        this.sketchControl.setSelfShapeCountListener(null);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        super.init();
        this.mSketchControlContainer = (FrameLayout) getRootView().findViewById(R.id.sketch_control_container);
        this.mWrapper = (C61246b) getRootView().findViewById(R.id.gesture_wrapper);
        this.mSketchPanel = new SketchPanel(getContext());
        this.sketchControl.setCurrentAction(SketchMode.PENCIL);
        this.sketchControl.setPaintColor(this.mSketchPanel.getCurrentColor());
        this.sketchControl.setOnSketchVisiblityListener(new SketchListener.OnSketchVisibilityListener() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchViewControl.C631011 */

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnSketchVisibilityListener
            public void switchVisible() {
                SketchViewControl.this.switchVisible();
            }

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnSketchVisibilityListener
            public void setVisible(boolean z) {
                SketchViewControl.this.setVisible(z);
            }
        });
        this.sketchControl.setOnSketchStartFailListener(new SketchListener.OnSketchStartListener() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchViewControl.C631022 */

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnSketchStartListener
            public void onStartSuccess() {
                SketchViewControl.this.mH().post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.sketch.SketchViewControl.C631022.RunnableC631042 */

                    public /* synthetic */ void lambda$run$0$SketchViewControl$2$2() {
                        if (SketchViewControl.this.mSketchPanel != null) {
                            SketchViewControl.this.getMeeting().ar().mo216854a(true, SketchViewControl.this.mSketchPanel.getVisionHeight() + C60773o.m236115a(16.0d));
                        }
                    }

                    public void run() {
                        SketchViewControl.this.sketchControl.onSketchLoadFinished();
                        SketchViewControl.this.sketchControl.reSizeGestureWrapper();
                        if (SketchViewControl.this.mSketchControlContainer != null && SketchViewControl.this.mSketchControlContainer.getChildCount() == 0) {
                            if (SketchViewControl.this.mSketchPanel != null) {
                                SketchViewControl.this.mSketchControlContainer.addView(SketchViewControl.this.mSketchPanel);
                            }
                            if (SketchViewControl.this.mWrapper != null) {
                                SketchViewControl.this.sketchControl.setCurrentAction(SketchMode.PENCIL);
                            }
                        }
                        if (SketchViewControl.this.mSketchPanel != null) {
                            SketchViewControl.this.mSketchPanel.postDelayed(new Runnable() {
                                /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchViewControl$2$2$m8YS4is4owr7BWpZRZlaYk3Ixec */

                                public final void run() {
                                    SketchViewControl.C631022.RunnableC631042.this.lambda$run$0$SketchViewControl$2$2();
                                }
                            }, 200);
                        }
                        SketchViewControl.this.getMeeting().ai().e_(false);
                    }
                });
            }

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnSketchStartListener
            public void onStartFailed(final int i) {
                C60700b.m235851b("[Sketch] [SketchViewControl]", "[onStartFailed]", "start fail");
                SketchViewControl.this.mH().post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.sketch.SketchViewControl.C631022.RunnableC631031 */

                    public void run() {
                        C60738ac.m236023a(i);
                        SketchViewControl.this.mSketchPanel.clickExit();
                        SketchViewControl.this.sketchControl.onSketchLoadFailed();
                    }
                });
            }
        });
        this.sketchControl.setSelfShapeCountListener(new SketchRenderModel.OnSelfShapeCountListener() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchViewControl.C631053 */

            @Override // com.ss.android.vc.meeting.module.sketch.SketchRenderModel.OnSelfShapeCountListener
            public void onChanged(int i) {
                if (SketchViewControl.this.mSketchPanel != null) {
                    SketchViewControl.this.mSketchPanel.onSelfShapeCountChanged(i);
                }
            }
        });
        this.sketchControl.getRenderModel().updateSelfShapeCount();
        this.mSketchPanel.setOnClickPanelListener(new SketchListener.OnPanelClickListener() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchViewControl.C631064 */

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnPanelClickListener
            public void onClickArrow() {
                C60700b.m235851b("[Sketch] [SketchViewControl]", "[onClickArrow]", "clickArrow");
                SketchViewControl.this.sketchControl.setCurrentAction(SketchMode.ARROW);
            }

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnPanelClickListener
            public void onClickHighlight() {
                C60700b.m235851b("[Sketch] [SketchViewControl]", "[onClickHighlight]", "clickHighlight");
                SketchViewControl.this.sketchControl.setCurrentAction(SketchMode.HIGHLIGHT);
            }

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnPanelClickListener
            public void onClickPen() {
                C60700b.m235851b("[Sketch] [SketchViewControl]", "[onClickPen]", "clickPen");
                SketchViewControl.this.sketchControl.setCurrentAction(SketchMode.PENCIL);
            }

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnPanelClickListener
            public void onClickUndo() {
                C60700b.m235851b("[Sketch] [SketchViewControl]", "[onClickUndo]", "clickUndo");
                SketchViewControl.this.sketchControl.undo();
                C63745b.m250136a("undo", SketchViewControl.this.getMeeting().mo212056e());
            }

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.OnPanelClickListener
            public void onClickColor(int i) {
                C60700b.m235851b("[Sketch] [SketchViewControl]", "[onClickColor]", "clickColor");
                SketchViewControl.this.sketchControl.setPaintColor(i);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void setSketchTurnOffListener(SketchListener.ITurnOffListener iTurnOffListener) {
        SketchPanel sketchPanel = this.mSketchPanel;
        if (sketchPanel != null) {
            sketchPanel.setSketchTurnOffListener(iTurnOffListener);
        }
    }

    public void setVisible(boolean z) {
        FrameLayout frameLayout = this.mSketchControlContainer;
        if (frameLayout == null) {
            return;
        }
        if (z) {
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(4);
        }
    }

    public SketchViewControl(AbstractC61429i iVar) {
        super(iVar);
        AbsSketchControl ag = getMeeting().ag();
        this.sketchControl = ag;
        ag.addSketchViewListener(this);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void showAccessibilityDialog(VideoChat videoChat) {
        C60700b.m235851b("[Sketch] [SketchViewControl]", "[showAccessibilityDialog]", "show");
        VCDialogUtils.m236177a((Context) getActivity(), (int) R.string.View_VM_ThePersonSharingShortNew, 2, (int) R.string.View_VM_ThePersonSharingDescriptionNew, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchViewControl$uZoyAvWzVdW_Al1vxsQYwU4CwFw */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C63745b.m250137b(VideoChat.this);
            }
        }, (int) R.string.View_M_SendRequest, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(videoChat) {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchViewControl$3Gez1W6QmxwxG1CYHoncOmU8cMs */
            public final /* synthetic */ VideoChat f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                SketchViewControl.this.lambda$showAccessibilityDialog$2$SketchViewControl(this.f$1, dialogInterface, i);
            }
        }, false);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        super.onOrientation(z, z2);
        SketchPanel sketchPanel = this.mSketchPanel;
        if (sketchPanel != null) {
            sketchPanel.onOrientationChanged(z);
            this.mSketchPanel.postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchViewControl$yfLVEJjcQDsdL_LNCJD7I1VapA */

                public final void run() {
                    SketchViewControl.this.lambda$onOrientation$0$SketchViewControl();
                }
            }, 200);
        }
    }

    public /* synthetic */ void lambda$showAccessibilityDialog$2$SketchViewControl(VideoChat videoChat, DialogInterface dialogInterface, int i) {
        C63745b.m250134a(videoChat);
        this.sketchControl.sendAccesbilityRequest();
    }
}
