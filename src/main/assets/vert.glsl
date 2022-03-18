uniform mat4 u_Matrix;
uniform mediump float u_BorderWidth;

attribute vec4 vPosition;
attribute vec4 vColor;
attribute float vLineWidth;
attribute float vPointIndicator;  // line: 0.1, 1.1, 2.1, 3.1;  bezier: t val; oval: angle
attribute float vZ;
attribute vec4 vCtrl;

varying float fShapeType;
varying vec4 fColor;
varying vec4 fPosition;
varying float fLineWidth;
varying float fPointIndex;

// 三阶贝塞尔曲线插值点
vec2 b3(in vec2 p0, in vec2 p1, in vec2 p2, in vec2 p3, in float t)
{
    vec2 q0 = mix(p0, p1, t);
    vec2 q1 = mix(p1, p2, t);
    vec2 q2 = mix(p2, p3, t);

    vec2 r0 = mix(q0, q1, t);
    vec2 r1 = mix(q1, q2, t);

    return mix(r0, r1, t);
}

// 三阶贝塞尔曲线方向向量
vec2 vb3(in vec2 p0, in vec2 p1, in vec2 p2, in vec2 p3, in float t)
{
    float tm1 = t - 1.0;
    return -3.0 * tm1 * tm1 * p0 + 3.0 * tm1 * (3.0 * t - 1.0) * p1 - 3.0 * t * (3.0 * t - 2.0) * p2 + 3.0 * t * t * p3;
}

void main() {
    fShapeType = vCtrl.x;
    if (fShapeType < 1000.0) {
        // bezier
        // vPosition = (p0, p3);
        // vCtrl = (p1, p2);
        float lineWidth = sign(vLineWidth) * (abs(vLineWidth) + u_BorderWidth);
        vec2 centerPos = b3(vPosition.xy, vCtrl.xy, vCtrl.zw, vPosition.zw, vPointIndicator);
        vec2 direction = normalize(vb3(vPosition.xy, vCtrl.xy, vCtrl.zw, vPosition.zw, vPointIndicator)); //单位方向向量
        vec2 normal = vec2(-direction.y, direction.x); //单位法向量
        vec4 pos;
        pos.w = 1.0;
        pos.xy = centerPos + normal * lineWidth / 2.0; //fLineWidth自带符号

        fColor = vColor;
        fLineWidth = abs(vLineWidth);
        fPosition = vec4(centerPos.xy, direction.xy);
        fPointIndex = vPointIndicator;

        vec4 p = u_Matrix * pos;
        gl_Position =  vec4(p.xy, vZ, 1.0);
    } else if (fShapeType < 1100.0) {
        // rect line
        fLineWidth = vLineWidth;
        fPointIndex = vPointIndicator;
        fPosition = vPosition;
        fColor = vColor;

        vec2 dir = vCtrl.yz;

        float lineWidth = vLineWidth + u_BorderWidth;

        float scaledLineWidth = 0.7071 * lineWidth;
        vec2 nd1 = scaledLineWidth * normalize(vPosition.xy - dir);
        vec2 nd2 = scaledLineWidth * normalize(vPosition.zw - dir);

        vec2 pos = vec2(0.0, 0.0);
        if (vPointIndicator < 1.0) {
            pos = fPosition.xy + nd1;
        } else if(vPointIndicator < 2.0) {
            pos = fPosition.xy - nd1;
        } else if (vPointIndicator < 3.0) {
            pos = fPosition.zw + nd2;
        } else {
            pos = fPosition.zw - nd2;
        }

        vec4 p = u_Matrix * vec4(pos.xy, vZ, 1.0);
        gl_Position = vec4(p.x, p.y, vZ, 1.0);
    } else if (fShapeType < 1200.0) {
        // oval
        fColor = vColor;
        fPosition = vPosition;
        fLineWidth = vLineWidth;
        fPointIndex = vPointIndicator;

        float lineWidth = vLineWidth + u_BorderWidth;
        vec2 center = (vPosition.xy + vPosition.zw) / 2.0;
        float a = abs(vPosition.x - vPosition.z) / 2.0;
        float b = abs(vPosition.y - vPosition.w) / 2.0;
        float angle = 6.28318 * abs(vPointIndicator);
        vec2 pos = vec2(a * cos(angle), b * sin(angle));
        vec2 v = vec2(2.0 * pos.x / a / a, 2.0 * pos.y / b / b);
        vec2 normal = normalize(v);
        vec2 scaledV = normal * (lineWidth / 2.0);
        pos += sign(vCtrl.y) * scaledV;
        pos += center;
        vec4 p = u_Matrix * vec4(pos, vZ, 1.0);
        gl_Position = vec4(p.xy, vZ, 1.0);;
    } else if (fShapeType < 1300.0) {
        // arrow
        fColor = vColor;
        fPosition = vPosition;
        fLineWidth = vLineWidth;
        fPointIndex = vPointIndicator;

        vec2 start = vPosition.xy;
        vec2 end = vPosition.zw;

        float ovalSliceCount = vCtrl.w;

        if (vPointIndicator < 0.0) {
            // 圆心
            vec4 p = u_Matrix * vec4(start.x, start.y, 0.0, 1.0);
            gl_Position = vec4(p.x, p.y, vZ, 1.0);
        } else if (vPointIndicator < 2.0) {
            // 圆周
            float angle = 6.28318 * abs(vPointIndicator);

            float radius = vLineWidth / 14.0;
            vec2 pos = start + radius * vec2(cos(angle), sin(angle));
            vec4 p = u_Matrix * vec4(pos, 0.0, 1.0);
            gl_Position = vec4(p.x, p.y, vZ, 1.0);
        } else {
            highp int idx = int(vPointIndicator - ovalSliceCount - 1.0);

            vec2 v = vec2(start.y - end.y, end.x - start.x);
            vec2 normal = normalize(v);

            vec2 dir = start - end;
            vec2 offset = normalize(dir) * vLineWidth;

            if (idx < 4) {
                // 箭头体
                float startWidth = vLineWidth / 7.0 + u_BorderWidth;
                float endWidth = vLineWidth * 0.42857 + u_BorderWidth;

                float x = start.x;
                float y = start.y;
                if (idx == 0) {
                    x += normal.x * startWidth + u_BorderWidth / 2.0;
                    y += normal.y * startWidth / 2.0;
                } else if (idx == 1) {
                    x -= normal.x * startWidth / 2.0;
                    y -= normal.y * startWidth / 2.0;
                } else if (idx == 2) {
                    x = end.x + normal.x * endWidth / 2.0 + offset.x;
                    y = end.y + normal.y * endWidth / 2.0 + offset.y;
                } else if (idx == 3) {
                    x = end.x - normal.x * endWidth / 2.0 + offset.x;
                    y = end.y - normal.y * endWidth / 2.0 + offset.y;
                }
                vec4 p = u_Matrix * vec4(x, y, 0.0, 1.0);
                gl_Position = vec4(p.x, p.y, vZ, 1.0);
            } else {
                // 箭头
                float x = end.x;
                float y = end.y;
                if (idx != 6) {
                    x += offset.x;
                    y += offset.y;
                }
                if (idx == 4) {
                    x += normal.x * vLineWidth / 2.0;
                    y += normal.y * vLineWidth / 2.0;
                } else if (idx == 5) {
                    x -= normal.x * vLineWidth / 2.0;
                    y -= normal.y * vLineWidth / 2.0;
                }
                vec4 p = u_Matrix * vec4(x, y, 0.0, 1.0);
                gl_Position = vec4(p.x, p.y, vZ, 1.0);
            }
        }
    } else if (fShapeType < 1400.0) {
        // round
        fColor = vColor;
        fPosition = vPosition;
        fLineWidth = vLineWidth;
        fPointIndex = vPointIndicator;

        vec2 center = vec2((vPosition.x + vPosition.z), (vPosition.y + vPosition.w)) / 2.0;

        if (vPointIndicator < -0.1) {
            // 圆心
            vec4 p = u_Matrix * vec4(center.x, center.y, 0.0, 1.0);
            gl_Position = vec4(p.x, p.y, vZ, 1.0);
        } else {
            float radius = max(abs(vPosition.x - vPosition.z), abs(vPosition.y - vPosition.w)) / 2.0;
            float angle = 6.28318 * abs(vPointIndicator);
            vec2 pos = center + radius * vec2(cos(angle), sin(angle));
            vec4 p = u_Matrix * vec4(pos, 0.0, 1.0);
            gl_Position = vec4(p.x, p.y, vZ, 1.0);
        }
    } else {
        fColor = vColor;
        fPosition = vPosition;
        fPointIndex = vPointIndicator;
        vec4 p = u_Matrix * vPosition;
        gl_Position = vec4(p.x, p.y, vZ, 1.0);
    }

}