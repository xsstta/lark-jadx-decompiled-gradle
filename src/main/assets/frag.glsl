 precision mediump float;

 uniform vec3 u_Transform;
 uniform float u_AxisScale;
 uniform float u_WindowWidth;
 uniform float u_WindowHeight;
 uniform float u_BorderWidth;

 varying float fShapeType;
 varying vec4 fColor;
 varying vec4 fPosition;
 varying float fLineWidth;
 varying float fPointIndex;

 float pointDistToLine(vec2 p1, vec2 p2, vec2 point)
 {
     vec2 vecLine = p2 - p1;
     vec2 normal = vec2(vecLine.y, -vecLine.x);
     vec2 dir = p1 - point;
     return abs(dot(normalize(normal), dir));
 }

 void main() {
     vec2 window = vec2(u_WindowWidth, u_WindowHeight);
     vec2 current = (gl_FragCoord.xy * u_AxisScale - window * (u_AxisScale / 2.0)) / u_Transform.z - u_Transform.xy;

     if (fShapeType < 1000.0) {
         // bezier
         if (u_Transform.z > 2.0)  {
             gl_FragColor = fColor;
         } else {
             float alpha = fColor.a;
             if (alpha > 0.99) {
                 vec2 pos = fPosition.xy;
                 vec2 direction = fPosition.zw;
                 float dist = pointDistToLine(pos, pos+direction, current);

                 float solidRegionWidth = (fLineWidth - u_BorderWidth) / 2.0;
                 if (dist > solidRegionWidth) {
                     alpha = 1.0 - (dist - solidRegionWidth) / u_BorderWidth;
                 }
                 alpha = clamp(alpha, 0.0, 1.0);
             }

             gl_FragColor = vec4(fColor.r, fColor.g, fColor.b, alpha);
         }

     } else if (fShapeType < 1100.0) {
         // line
         float dist = pointDistToLine(fPosition.xy, fPosition.zw, current);
         float solidRegionWidth = (fLineWidth - u_BorderWidth) / 2.0;
         float alpha = 1.0;
         if (dist > solidRegionWidth) {
             alpha = 1.0 - (dist - solidRegionWidth) / u_BorderWidth;
         }
         alpha = clamp(alpha, 0.0, 1.0);
         gl_FragColor = vec4(fColor.rgb, alpha);
     } else if (fShapeType < 1200.0) {
         // oval
         vec2 center = (fPosition.xy + fPosition.zw) / 2.0;
         float a = abs(fPosition.x - fPosition.z) / 2.0;
         float b = abs(fPosition.y - fPosition.w) / 2.0;
         float angle = 6.28318 * abs(fPointIndex);
         vec2 cp = vec2(a * cos(angle), b * sin(angle));
         vec2 dir = normalize(vec2(cp.x / a / a, cp.y / b / b));
         float dist = abs(dot(dir, cp - current + center));
         float solidRegionWidth = (fLineWidth - u_BorderWidth) / 2.0;
         float alpha = 1.0 - step(u_Transform.z, 2.0) * step(solidRegionWidth, dist) * (dist - solidRegionWidth) / u_BorderWidth;
         alpha = clamp(alpha, 0.0, 1.0);
         gl_FragColor = vec4(fColor.r, fColor.g, fColor.b, alpha);
     } else if (fShapeType < 1300.0) {
         // arrow
         if (u_Transform.z > 2.0)  {
             gl_FragColor = fColor;
         } else {
             vec2 v = current - fPosition.xy;
             vec2 vecLine = normalize(fPosition.zw - fPosition.xy);
             vec2 normalLine = vec2(-vecLine.y, vecLine.x);
             float arrowBodyLength = length(fPosition.zw - fPosition.xy) - fLineWidth;
             float dst2Line = abs(dot(v, normalLine));
             float lengthOverLine = abs(dot(v, vecLine));

             float alpha = 1.0;
             if (lengthOverLine > arrowBodyLength) {
                 // 箭头
                 alpha = 1.0;
             } else {
                 // 箭体
                 float ratio = min(lengthOverLine / arrowBodyLength, 1.0);
                 float startWidth = fLineWidth / 7.0;
                 float endWidth = startWidth * 3.0;
                 float width = mix(startWidth, endWidth, ratio);

                 float solidRegionWidth = (width - u_BorderWidth) / 2.0;
                 if (dst2Line > solidRegionWidth) {
                     alpha = 1.0 - (dst2Line - solidRegionWidth) / u_BorderWidth;
                 }
             }

             gl_FragColor = vec4(fColor.r, fColor.g, fColor.b, alpha);
         }
     } else if (fShapeType < 1400.0) {
         // round
         gl_FragColor = fColor;
     } else {
         gl_FragColor = fColor;
     }
 }