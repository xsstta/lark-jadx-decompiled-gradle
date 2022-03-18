package com.ss.android.photoeditor.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.base.C59614a;
import com.ss.android.photoeditor.base.C59627f;
import com.ss.android.photoeditor.base.C59640j;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.text.TextEditorDrawView;

public class TextEditorGestureView extends View {

    /* renamed from: a */
    C59627f f148574a;

    /* renamed from: b */
    RectF f148575b;

    /* renamed from: c */
    public AbstractC59787a f148576c;

    /* renamed from: d */
    public AbstractC59788b f148577d;

    /* renamed from: e */
    public TextEditorDrawView.AbstractC59778b f148578e;

    /* renamed from: f */
    private int f148579f = 20;

    /* renamed from: g */
    private boolean f148580g;

    /* renamed from: h */
    private AbstractC59787a f148581h = new AbstractC59787a() {
        /* class com.ss.android.photoeditor.text.TextEditorGestureView.C597841 */

        /* renamed from: a */
        C59805a f148583a;

        /* renamed from: b */
        PointF f148584b;

        /* renamed from: d */
        private float f148586d;

        /* renamed from: e */
        private float f148587e;

        /* renamed from: f */
        private float f148588f;

        /* renamed from: g */
        private int f148589g;

        /* renamed from: h */
        private float f148590h;

        /* renamed from: i */
        private float f148591i;

        /* renamed from: j */
        private int f148592j;

        /* renamed from: k */
        private boolean f148593k = true;

        /* renamed from: l */
        private float f148594l;

        /* renamed from: m */
        private float f148595m;

        /* renamed from: n */
        private boolean f148596n;

        @Override // com.ss.android.photoeditor.text.TextEditorGestureView.AbstractC59787a
        /* renamed from: a */
        public int mo203529a() {
            return 1;
        }

        /* renamed from: b */
        private void m231926b(MotionEvent motionEvent) {
            if ((this.f148592j & 4) != 0) {
                m231929d(motionEvent.getX(), motionEvent.getY());
            } else if (TextEditorGestureView.this.f148578e.mo203503a() == null) {
                m231927c(motionEvent.getX(), motionEvent.getY());
            } else {
                m231924a(motionEvent.getX(), motionEvent.getY());
            }
        }

        @Override // com.ss.android.photoeditor.text.TextEditorGestureView.AbstractC59787a
        /* renamed from: a */
        public void mo203530a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f148593k = true;
                this.f148596n = false;
                m231928c(motionEvent);
                this.f148594l = motionEvent.getX();
                this.f148595m = motionEvent.getY();
            } else if (action == 1) {
                TextEditorGestureView.this.f148576c = null;
                if (this.f148593k) {
                    m231926b(motionEvent);
                } else {
                    TextEditorGestureView.this.f148578e.mo203508a(true);
                }
            } else if (action != 2) {
                if (action == 3) {
                    TextEditorGestureView.this.f148576c = null;
                }
            } else if (this.f148596n || C59614a.m231217a(TextEditorGestureView.this.getContext(), this.f148594l, this.f148595m, motionEvent.getX(), motionEvent.getY())) {
                this.f148593k = false;
                this.f148596n = true;
                TextEditorGestureView.this.f148578e.mo203508a(false);
                m231930d(motionEvent);
            }
        }

        /* renamed from: c */
        private void m231928c(MotionEvent motionEvent) {
            this.f148592j = 0;
            C59805a a = TextEditorGestureView.this.f148578e.mo203503a();
            if (a == null) {
                a = TextEditorGestureView.this.f148578e.mo203504a(motionEvent.getX(), motionEvent.getY());
                this.f148583a = a;
                if (a == null) {
                    return;
                }
            }
            if (TextEditorGestureView.this.f148578e.mo203515c(a, motionEvent.getX(), motionEvent.getY())) {
                this.f148592j |= 2;
            } else if (TextEditorGestureView.this.f148578e.mo203512b(a, motionEvent.getX(), motionEvent.getY())) {
                this.f148592j |= 4;
            } else if (TextEditorGestureView.this.f148578e.mo203509a(a, motionEvent.getX(), motionEvent.getY())) {
                this.f148592j |= 1;
            } else if (a.f148652d) {
                a = TextEditorGestureView.this.f148578e.mo203504a(motionEvent.getX(), motionEvent.getY());
                this.f148583a = a;
                if (a != null) {
                    this.f148592j |= 1;
                } else {
                    return;
                }
            } else {
                return;
            }
            this.f148586d = motionEvent.getX();
            this.f148587e = motionEvent.getY();
            this.f148588f = a.f148649a;
            this.f148589g = a.f148651c;
            this.f148584b = new PointF(a.f148650b.x, a.f148650b.y);
            PointF a2 = TextEditorGestureView.this.f148578e.mo203497a(a);
            this.f148590h = a2.x;
            this.f148591i = a2.y;
            Log.m165379d("TextEditorGestureView", "selected ：" + a);
        }

        /* renamed from: d */
        private void m231930d(MotionEvent motionEvent) {
            C59805a a = TextEditorGestureView.this.f148578e.mo203503a();
            if (a != null || this.f148583a != null) {
                if (this.f148583a != null) {
                    TextEditorGestureView.this.f148578e.mo203510b(this.f148583a).mo203501a(a, false).mo203501a(this.f148583a, true).mo203518e();
                    a = this.f148583a;
                    this.f148583a = null;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int i = this.f148592j;
                if ((i & 1) != 0) {
                    TextEditorGestureView.this.f148578e.mo203500a(a, new PointF(this.f148584b.x, this.f148584b.y), x - this.f148586d, y - this.f148587e);
                    TextEditorGestureView.this.f148578e.mo203518e();
                } else if ((i & 2) != 0) {
                    float a2 = C59610b.m231205a(x, y, this.f148590h, this.f148591i) / C59610b.m231205a(this.f148586d, this.f148587e, this.f148590h, this.f148591i);
                    TextEditorGestureView.this.f148578e.mo203499a(a, this.f148589g + ((int) C59610b.m231206a(this.f148586d, this.f148587e, x, y, this.f148590h, this.f148591i)), this.f148588f * a2);
                    TextEditorGestureView.this.f148578e.mo203518e();
                    HitPointHelper.f147964l.mo203057g(true);
                }
            }
        }

        /* renamed from: a */
        private void m231924a(float f, float f2) {
            C59805a a = TextEditorGestureView.this.f148578e.mo203503a();
            if (a != null) {
                if (TextEditorGestureView.this.f148578e.mo203509a(a, f, f2)) {
                    TextEditorGestureView.this.f148577d.mo203531a(a);
                } else {
                    m231925b(f, f2);
                }
            }
        }

        /* renamed from: d */
        private void m231929d(float f, float f2) {
            C59805a a = TextEditorGestureView.this.f148578e.mo203503a();
            if (a != null && TextEditorGestureView.this.f148578e.mo203512b(a, f, f2)) {
                TextEditorGestureView.this.f148578e.mo203514c(a).mo203510b(null).mo203518e();
            }
        }

        /* renamed from: b */
        private void m231925b(float f, float f2) {
            C59805a a = TextEditorGestureView.this.f148578e.mo203503a();
            if (a != null) {
                if (!a.f148652d) {
                    TextEditorGestureView.this.f148578e.mo203517d(a, f, f2);
                } else {
                    TextEditorGestureView.this.f148578e.mo203501a(a, false);
                    C59805a a2 = TextEditorGestureView.this.f148578e.mo203504a(f, f2);
                    if (a2 != null) {
                        TextEditorGestureView.this.f148578e.mo203501a(a2, true);
                    }
                    TextEditorGestureView.this.f148578e.mo203510b(a2);
                }
                TextEditorGestureView.this.f148578e.mo203508a(!TextEditorGestureView.this.f148578e.mo203511b());
                TextEditorGestureView.this.f148578e.mo203518e();
            }
        }

        /* renamed from: c */
        private void m231927c(float f, float f2) {
            C59805a a = TextEditorGestureView.this.f148578e.mo203504a(f, f2);
            if (a != null) {
                TextEditorGestureView.this.f148578e.mo203501a(a, true).mo203510b(a);
                TextEditorGestureView.this.f148578e.mo203518e();
            } else {
                C59805a a2 = TextEditorGestureView.this.f148578e.mo203505a((int) f, (int) f2);
                if (a2 != null) {
                    TextEditorGestureView.this.f148578e.mo203501a(a2, true).mo203510b(a2);
                    TextEditorGestureView.this.f148578e.mo203518e();
                }
            }
            TextEditorGestureView.this.f148578e.mo203508a(!TextEditorGestureView.this.f148578e.mo203511b());
        }
    };

    /* renamed from: i */
    private AbstractC59787a f148582i = new AbstractC59787a() {
        /* class com.ss.android.photoeditor.text.TextEditorGestureView.C597852 */

        /* renamed from: b */
        private C59640j f148598b;

        /* renamed from: c */
        private C59640j f148599c;

        /* renamed from: d */
        private C59805a f148600d;

        @Override // com.ss.android.photoeditor.text.TextEditorGestureView.AbstractC59787a
        /* renamed from: a */
        public int mo203529a() {
            return 2;
        }

        /* renamed from: b */
        private void m231933b(MotionEvent motionEvent) {
            C59640j jVar = this.f148599c;
            if (jVar == null) {
                this.f148599c = new C59640j(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1));
            } else {
                jVar.mo203164a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1));
            }
        }

        @Override // com.ss.android.photoeditor.text.TextEditorGestureView.AbstractC59787a
        /* renamed from: a */
        public void mo203530a(MotionEvent motionEvent) {
            if (TextEditorGestureView.this.f148578e.mo203503a() == null) {
                TextEditorGestureView.this.f148574a.mo203130a(motionEvent);
                return;
            }
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 5) {
                            this.f148600d = TextEditorGestureView.this.f148578e.mo203503a();
                            this.f148598b = new C59640j(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1));
                            return;
                        } else if (action != 6) {
                            return;
                        }
                    } else if (motionEvent.getPointerCount() == 2) {
                        TextEditorGestureView.this.f148578e.mo203508a(false);
                        m231933b(motionEvent);
                        float d = this.f148598b.mo203167d(this.f148599c);
                        float a = this.f148598b.mo203162a(this.f148599c);
                        if (this.f148600d != null) {
                            TextEditorDrawView.AbstractC59778b bVar = TextEditorGestureView.this.f148578e;
                            C59805a aVar = this.f148600d;
                            bVar.mo203499a(aVar, ((int) a) + aVar.f148651c, d * this.f148600d.f148649a).mo203518e();
                        }
                        this.f148598b.mo203168e(this.f148599c);
                        return;
                    } else {
                        return;
                    }
                }
                TextEditorGestureView.this.f148578e.mo203508a(true);
                TextEditorGestureView.this.f148576c = null;
                return;
            }
            TextEditorGestureView.this.f148578e.mo203508a(false);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.text.TextEditorGestureView$a */
    public interface AbstractC59787a {
        /* renamed from: a */
        int mo203529a();

        /* renamed from: a */
        void mo203530a(MotionEvent motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.text.TextEditorGestureView$b */
    public interface AbstractC59788b {
        /* renamed from: a */
        void mo203531a(C59805a aVar);
    }

    /* renamed from: a */
    public void mo203524a() {
        this.f148580g = true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
    }

    /* renamed from: b */
    private void m231920b() {
        setBackgroundColor(0);
    }

    public void setOnEditTextListener(AbstractC59788b bVar) {
        this.f148577d = bVar;
    }

    /* renamed from: b */
    private void m231921b(MotionEvent motionEvent) {
        AbstractC59787a aVar = this.f148582i;
        this.f148576c = aVar;
        aVar.mo203530a(motionEvent);
    }

    /* renamed from: c */
    private void m231922c(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            AbstractC59787a aVar = this.f148581h;
            this.f148576c = aVar;
            aVar.mo203530a(motionEvent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f148580g) {
            return true;
        }
        m231919a(motionEvent);
        return true;
    }

    public TextEditorGestureView(Context context) {
        super(context);
        m231920b();
    }

    public void setTextEditorView(TextEditorDrawView.AbstractC59778b bVar) {
        this.f148578e = bVar;
        this.f148574a = new C59627f(bVar.mo203513c(), this.f148578e.mo203516d(), new C59627f.AbstractC59633b() {
            /* class com.ss.android.photoeditor.text.TextEditorGestureView.C597863 */

            @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59633b
            /* renamed from: a */
            public void mo203136a(RectF rectF) {
                TextEditorGestureView.this.f148578e.mo203506a(rectF);
            }

            @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59633b
            /* renamed from: c */
            public void mo203138c(RectF rectF) {
                TextEditorGestureView.this.f148575b = rectF;
            }

            @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59633b
            /* renamed from: b */
            public void mo203137b(RectF rectF) {
                TextEditorGestureView.this.f148578e.mo203507a(TextEditorGestureView.this.f148575b, rectF);
                TextEditorGestureView.this.f148576c = null;
            }
        }, null);
    }

    /* renamed from: a */
    private void m231919a(MotionEvent motionEvent) {
        AbstractC59787a aVar = this.f148576c;
        if (aVar == null) {
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount == 1) {
                m231922c(motionEvent);
                Log.m165379d("TextEditorGestureView", "single point touch");
            } else if (pointerCount == 2) {
                m231921b(motionEvent);
                Log.m165379d("TextEditorGestureView", "double point touch");
            }
        } else if (aVar.mo203529a() == 1 && motionEvent.getPointerCount() == 2) {
            m231921b(motionEvent);
        } else {
            this.f148576c.mo203530a(motionEvent);
        }
    }

    public TextEditorGestureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m231920b();
    }

    public TextEditorGestureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m231920b();
    }
}
