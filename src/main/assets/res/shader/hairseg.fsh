precision mediump float;
uniform sampler2D u_Texture;
uniform sampler2D mask_Texture;
uniform vec4 mask_color;
uniform vec4 u_Color;
varying vec2 v_TexCoordinate;
void main(){
    float maska = texture2D(mask_Texture, v_TexCoordinate).a * 0.3;
    vec4 rgba = texture2D(u_Texture, v_TexCoordinate);
    rgba = mix(rgba, mask_color, maska);
    gl_FragColor = u_Color * rgba;
}