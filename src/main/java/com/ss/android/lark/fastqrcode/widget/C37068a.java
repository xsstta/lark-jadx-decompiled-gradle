package com.ss.android.lark.fastqrcode.widget;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.view.Display;
import android.view.WindowManager;
import com.ss.android.lark.fastqrcode.C37051b;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.fastqrcode.widget.a */
public final class C37068a {

    /* renamed from: a */
    private static final Pattern f95279a = Pattern.compile(",");

    /* renamed from: b */
    private final Context f95280b;

    /* renamed from: c */
    private Point f95281c;

    /* renamed from: d */
    private Point f95282d;

    /* renamed from: a */
    public Point mo136683a() {
        return this.f95282d;
    }

    public C37068a(Context context) {
        this.f95280b = context;
    }

    /* renamed from: b */
    public void mo136685b(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(this.f95282d.x, this.f95282d.y);
        m146236a(parameters);
        camera.setDisplayOrientation(m146232a(this.f95280b));
        parameters.setPreviewFormat(17);
        camera.setParameters(parameters);
    }

    /* renamed from: a */
    public static int m146232a(Context context) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = 0;
        Camera.getCameraInfo(0, cameraInfo);
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    /* renamed from: a */
    private void m146236a(Camera.Parameters parameters) {
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            int i = 27;
            String str2 = parameters.get("max-zoom");
            if (str2 != null) {
                try {
                    int parseDouble = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 > parseDouble) {
                        i = parseDouble;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    int parseInt = Integer.parseInt(str3);
                    if (i > parseInt) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            String str4 = parameters.get("mot-zoom-values");
            if (str4 != null) {
                i = m146233a(str4, i);
            }
            String str5 = parameters.get("mot-zoom-step");
            if (str5 != null) {
                try {
                    int parseDouble2 = (int) (Double.parseDouble(str5.trim()) * 10.0d);
                    if (parseDouble2 > 1) {
                        i -= i % parseDouble2;
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (!(str2 == null && str4 == null)) {
                parameters.set("zoom", String.valueOf(((double) i) / 10.0d));
            }
            if (str3 != null) {
                parameters.set("taking-picture-zoom", i);
            }
        }
    }

    /* renamed from: a */
    public void mo136684a(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f95280b.getSystemService("window")).getDefaultDisplay();
        this.f95281c = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        Point point = new Point();
        point.x = this.f95281c.x;
        point.y = this.f95281c.y;
        if (this.f95281c.x < this.f95281c.y) {
            point.x = this.f95281c.y;
            point.y = this.f95281c.x;
        }
        this.f95282d = m146234a(parameters, point);
    }

    /* renamed from: a */
    private static Point m146234a(Camera.Parameters parameters, Point point) {
        Point a = m146235a(parameters.getSupportedPreviewSizes(), point);
        if (a == null) {
            return new Point((point.x >> 3) << 3, (point.y >> 3) << 3);
        }
        return a;
    }

    /* renamed from: a */
    private static int m146233a(CharSequence charSequence, int i) {
        int i2 = 0;
        for (String str : f95279a.split(charSequence)) {
            try {
                double parseDouble = Double.parseDouble(str.trim());
                int i3 = (int) (10.0d * parseDouble);
                if (Math.abs(((double) i) - parseDouble) < ((double) Math.abs(i - i2))) {
                    i2 = i3;
                }
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static Point m146235a(List<Camera.Size> list, Point point) {
        int i = 0;
        Point[] pointArr = {new Point(1280, 720), new Point(640, 480)};
        for (Camera.Size size : list) {
            int i2 = 0;
            while (true) {
                if (i2 < 2) {
                    Point point2 = pointArr[i2];
                    if (size.width == point2.x && size.height == point2.y) {
                        C37051b.m146150a("Enigma", "final size ： " + point2.x + " x " + point2.y);
                        return point2;
                    }
                    i2++;
                }
            }
        }
        int i3 = Integer.MAX_VALUE;
        Iterator<Camera.Size> it = list.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            int i5 = next.width;
            int i6 = next.height;
            int abs = Math.abs(i5 - point.x) + Math.abs(i6 - point.y);
            if (abs == 0 && i5 <= 1280 && i6 <= 720) {
                i4 = i6;
                i = i5;
                break;
            } else if (abs < i3 && i5 <= 1280 && i6 <= 720) {
                i4 = i6;
                i = i5;
                i3 = abs;
            }
        }
        if (i <= 0 || i4 <= 0) {
            C37051b.m146150a("Enigma", "final size ： null");
            return null;
        }
        C37051b.m146150a("Enigma", "final size ： " + i + " * " + i4);
        return new Point(i, i4);
    }
}
