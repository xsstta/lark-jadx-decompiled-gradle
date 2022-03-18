precision mediump float;
uniform sampler2D u_Texture;
uniform float radius;
uniform float radio;
uniform vec4 u_Color;
varying vec2 v_TexCoordinate;
void main(){
    vec4 rgba = vec4(1.0);
    float x = (v_TexCoordinate.x - 0.5);
    float y = (v_TexCoordinate.y/radio - 0.5/radio);
    //if( sqrt(x*x + y*y ) < radius)
       rgba = texture2D(u_Texture, v_TexCoordinate);
    gl_FragColor = u_Color * rgba;
}